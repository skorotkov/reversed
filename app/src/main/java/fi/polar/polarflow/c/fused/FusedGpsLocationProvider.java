package fi.polar.polarflow.c.fused;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.os.Handler;
import android.os.SystemClock;

import java.util.List;

import fi.polar.polarflow.a_package.a_DataTypes;
import fi.polar.polarflow.c.d_gps_package.b_GpsLocationProvider;
import fi.polar.polarflow.c.fused.proxy.Log;
import fi.polar.polarflow.c.fused.proxy.PolarSensorListener;
import fi.polar.polarflow.c.fused.proxy.Sensor;
import fi.polar.polarflow.c.m_SENSOR_STATE;
import fi.polar.polarflow.c.n_SENSOR_TYPE;
import fi.polar.polarflow.util.n_PowerManagerHelper;
import fi.polar.polarflow.util.v_StickyLocalBroadcastManager;
import fi.polar.polarmathsmart.ascentdescent.AscentDescentCalculatorAndroidImpl;
import fi.polar.polarmathsmart.ascentdescent.AscentDescentOutput;
import fi.polar.polarmathsmart.gps.LocationDataCalculator;

public class FusedGpsLocationProvider extends Sensor {
    private static final String TAG = FusedGpsLocationProvider.class.getSimpleName();

    private PolarSensorListener mPolarSensorListener;
    private long mStartTime;
    private long mPowerSaveModeStartTime;

    private Handler mHandler;
    private BroadcastReceiver mPowerSaveModeBroadcastReceiver;

    private n_PowerManagerHelper mPowerManagerHelper;
    private AscentDescentCalculatorAndroidImpl mAscentDescentCalculator = null;

    private FusedGpsSensor mSensor;
    private FusedLocationDataCalculator mLocationDataCalculator;

    protected double mLatitudeInDecimalDegrees = 0.0D;
    protected double mLongitudeInDecimalDegrees = 0.0D;
    protected double mAltitudeInMetersChecked = Double.NaN;
    protected double mAltitudeInMeters = Double.NaN;
    protected int mNumberOfSatellites = 0;
    protected float mSpeedInMetersPerSecond = Float.NaN;
    protected boolean mFix = false;


    protected FusedGpsLocationProvider(Context context) {
        super(context, n_SENSOR_TYPE.c_FUSED_GPS);
        mHandler = new Handler();
        mPowerManagerHelper = new n_PowerManagerHelper(context);
        mSensor = new FusedGpsSensor(this);
        mPowerSaveModeBroadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                boolean isPowerSaveMode = mPowerManagerHelper.a_isPowerSaveMode();
                Log.i(TAG, "onReceive: ACTION_POWER_SAVE_MODE_CHANGED, enabled= " + isPowerSaveMode);
                if (isPowerSaveMode) {
                    mPowerSaveModeStartTime = SystemClock.elapsedRealtime();
                    mFix = false;
//                            b_GpsLocationProvider.e_getAndroidSensorEventListener(this.a_gpsLocationProvider).a((b_PolarSensorEventBase)this.a_gpsLocationProvider.k());
                    mSensor.stopListeningUpdates();
                } else {
                    mSensor.startListeningUpdates();
                }
            }
            }
        };
        mLocationDataCalculator = new FusedLocationDataCalculator();
    }

    @Override
    protected void a_reset() {

    }

    @Override
    public void start() {
        mStartTime = SystemClock.elapsedRealtime();
        Log.i(TAG, "start() at: " + mStartTime);
        if (!fi.polar.polarflow.ui.o.d(this.a_context, "android.permission.ACCESS_FINE_LOCATION")) {
            setState(m_SENSOR_STATE.a_DISABLED, true);
        } else if (!isStarted()) {
            setStarted(true);
            getContext().registerReceiver(mPowerSaveModeBroadcastReceiver, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"), (String) null, mHandler);
            
            if (this.mPowerManagerHelper.a_isPowerSaveMode()) {
                setState(m_SENSOR_STATE.a_DISABLED, true);
            } else if (!isStarted()) {
                mSensor.startListeningUpdates();
            }
        } else {
            broadcastStateChanged();
        }
    }

    @Override
    public void stop() {
        Log.i(TAG, "stop()");
        if (isStarted()) {
            setStarted(false);
            getContext().unregisterReceiver(mPowerSaveModeBroadcastReceiver);
            mSensor.stopListeningUpdates();

            if (mPowerManagerHelper.a_isPowerSaveMode()) {
                setState(m_SENSOR_STATE.a_DISABLED, true);
            } else {
                setState(m_SENSOR_STATE.b_NOT_READY, true);
            }

        } else {
            broadcastStateChanged();
        }

        mHandler.removeCallbacksAndMessages((Object)null);
        v_StickyLocalBroadcastManager.a_getInstance().a_removeFromMap("fi.polar.polarflow.ACTION_LOCATION_DATA", "fi.polar.polarflow.SENSOR_LOCATION_STATE_CHANGED");
    }

    @Override
    protected void broadcastStateChanged() {
        Intent intent = new Intent("fi.polar.polarflow.SENSOR_LOCATION_STATE_CHANGED");
        intent.putExtra("fi.polar.polarflow.SENSOR_STATE", getState());
        intent.putExtra("fi.polar.polarflow.KEY_SENSOR_TYPE", getType());
        v_StickyLocalBroadcastManager.a_getInstance().b_sendStickyBroadcast(intent);
    }

    @Override
    public void setPolarSensorListener(PolarSensorListener listener) {
        this.mPolarSensorListener = listener;
    }

    @Override
    public void setState(m_SENSOR_STATE var1) {
        if (m_SENSOR_STATE.d_READY.equals(var1)) {
            if (!mFix) { // TODO: may be more actual data is needed here
                super.setState(m_SENSOR_STATE.c_SEARCHING, false);
            } else {
                super.setState(var1, false);
            }
        } else {
            super.setState(var1, false);
        }
    }

    private void handleLocation(Location location){
        mLocationDataCalculator.handleLocation(location);

        mNumberOfSatellites = mLocationDataCalculator.getNumberOfSatellites();
        mAltitudeInMetersChecked = a_DataTypes.b_adjust(4, mLocationDataCalculator.getAltitudeInMeters(true));
        mAltitudeInMeters = a_DataTypes.b_adjust(4, mLocationDataCalculator.getAltitudeInMeters(false));
        mSpeedInMetersPerSecond = (float)boundSpeed(mLocationDataCalculator.getSpeedInMetersPerSecond());
        mLatitudeInDecimalDegrees = a_DataTypes.b_adjust(5, mLocationDataCalculator.getLatitudeInDecimalDegrees());
        mLongitudeInDecimalDegrees = a_DataTypes.b_adjust(6, mLocationDataCalculator.getLongitudeInDecimalDegrees());

        if (mAscentDescentCalculator == null && !Double.isNaN(mAltitudeInMetersChecked)) {
            mAscentDescentCalculator = new AscentDescentCalculatorAndroidImpl(1, (float)mAltitudeInMetersChecked);
        } else {
            AscentDescentOutput result = mAscentDescentCalculator.addAltitude((float)mAltitudeInMetersChecked);
        }
    }

    private static double boundSpeed(double var0) {
        double var2;
        if (var0 < 0.0D) {
            Log.i(TAG, "Speed is below minimum: " + var0 + " m/s");
            var2 = 0.0D;
        } else {
            var2 = var0;
            if (var0 > 110.83333626941406D) {
                Log.i(TAG, "Speed is above maximum : " + var0 + " m/s");
                var2 = 110.83333626941406D;
            }
        }
        return var2;
    }

    public void handleLocationList(List<Location> locationList){
        for (Location location : locationList) {
            handleLocation(location);
        }
    }
}
