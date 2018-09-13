package fi.polar.polarflow.sensor.fusedgps;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.os.Handler;
import android.os.SystemClock;

import java.util.List;

import fi.polar.polarflow.c.f_PolarSensorEvent;
import fi.polar.polarflow.sensor.fusedgps.a_package.a_DataTypes;
import fi.polar.polarflow.sensor.fusedgps.proxy.SENSOR_STATE;
import fi.polar.polarflow.sensor.fusedgps.proxy.SENSOR_TYPE;
import fi.polar.polarflow.sensor.fusedgps.proxy.Sensor;
import fi.polar.polarflow.sensor.fusedgps.proxy.StickyLocalBroadcastManager;
import fi.polar.polarmathsmart.ascentdescent.AscentDescentCalculatorAndroidImpl;
import fi.polar.polarmathsmart.ascentdescent.AscentDescentOutput;

public class FusedGpsLocationProvider extends Sensor {
    private static final String TAG = FusedGpsLocationProvider.class.getSimpleName();

//    private PolarSensorListener mPolarSensorListener;
    private long mStartTime;
    private long mPowerSaveModeStartTime;

    private Handler mHandler;
    private BroadcastReceiver mPowerSaveModeBroadcastReceiver;

    private PowerManagerHelper mPowerManagerHelper;
    private AscentDescentCalculatorAndroidImpl mAscentDescentCalculator = null;

    private FusedGpsSensor mSensor;
    private boolean mSensorStarted;
    private FusedLocationDataCalculator mLocationDataCalculator;

    protected double mLatitudeInDecimalDegrees = 0.0D;
    protected double mLongitudeInDecimalDegrees = 0.0D;
    protected double mAltitudeInMetersChecked = Double.NaN;
    protected double mAltitudeInMeters = Double.NaN;
    protected int mNumberOfSatellites = 0;
    protected float mSpeedInMetersPerSecond = Float.NaN;
    protected boolean mFix = false;

    protected float mReferenceDistanceInMeters = 0.0F;
    protected float mDirtyTotalDistanceInMeters = 0.0F;
    protected float mTotalDistanceDuringPauseInMeters = 0.0F;

    protected float mTotalAscentDuringPause = 0.0F;
    protected float mTotalDescentDuringPause = 0.0F;
    protected float mTotalDirtyAscent = 0.0F;
    protected float mTotalDirtyDescent = 0.0F;

    protected double mReferenceAltitudeInMeters = 0.0D;

    public FusedGpsLocationProvider(Context context) {
        super(context, SENSOR_TYPE.FUSED_GPS);
        Log.i(TAG, "FusedGpsLocationProvider");
        mHandler = new Handler();
        mPowerManagerHelper = new PowerManagerHelper(context);
        mSensor = new FusedGpsSensor(this);
        mSensorStarted = false;
        mPowerSaveModeBroadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                boolean isPowerSaveMode = mPowerManagerHelper.isPowerSaveMode();
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
    protected void reset() {
        Log.i(TAG, "reset");

        mLatitudeInDecimalDegrees = 0.0D;
        mLongitudeInDecimalDegrees = 0.0D;
        mAltitudeInMetersChecked = Double.NaN;
        mAltitudeInMeters = Double.NaN;
        mNumberOfSatellites = 0;
        mSpeedInMetersPerSecond = Float.NaN;
        mFix = false;

        mTotalDirtyAscent = 0.0F;
        mTotalDirtyDescent = 0.0F;
        mTotalAscentDuringPause = 0.0F;
        mTotalDescentDuringPause = 0.0F;

        mReferenceDistanceInMeters = (float)mLocationDataCalculator.getDistanceInMeters();
        mAltitudeInMetersChecked = a_DataTypes.b_adjust(a_DataTypes.ALTITUDE_INDEX, mLocationDataCalculator.getAltitudeInMeters(true));
    }

    @Override
    public void start() {
        mStartTime = SystemClock.elapsedRealtime();
        Log.i(TAG, "start() at: " + mStartTime);
        if (!fi.polar.polarflow.ui.o.d(getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
            Log.i(TAG, "Disabled because of lack of permission");
            setState(SENSOR_STATE.DISABLED, true);
        } else if (!isStarted()) {
            setStarted(true);
            getContext().registerReceiver(mPowerSaveModeBroadcastReceiver, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"), (String) null, mHandler);
            
            if (this.mPowerManagerHelper.isPowerSaveMode()) {
                Log.i(TAG, "Disabled because of power save mode");
                setState(SENSOR_STATE.DISABLED, true);
            } else if (!mSensorStarted) {
                mSensorStarted = true;
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
            mSensorStarted = false;
            if (mPowerManagerHelper.isPowerSaveMode()) {
                setState(SENSOR_STATE.DISABLED, true);
            } else {
                setState(SENSOR_STATE.NOT_READY, true);
            }

        } else {
            broadcastStateChanged();
        }

        mHandler.removeCallbacksAndMessages((Object)null);
        StickyLocalBroadcastManager.removeFromMap("fi.polar.polarflow.ACTION_LOCATION_DATA", "fi.polar.polarflow.SENSOR_LOCATION_STATE_CHANGED");
    }

    @Override
    protected void broadcastStateChanged() {
        Intent intent = new Intent("fi.polar.polarflow.SENSOR_LOCATION_STATE_CHANGED");
        intent.putExtra("fi.polar.polarflow.SENSOR_STATE", SENSOR_STATE.toPolar(getState()));
        intent.putExtra("fi.polar.polarflow.KEY_SENSOR_TYPE", SENSOR_TYPE.toPolar(getType()));
        StickyLocalBroadcastManager.sendStickyBroadcast(intent);
    }

    @Override
    protected void pause() {
        setActive(false);
    }

    @Override
    protected void resume() {
        mTotalDistanceDuringPauseInMeters += (float)mLocationDataCalculator.getDistanceInMeters() - mDirtyTotalDistanceInMeters;
        if (mAscentDescentCalculator != null) {
            AscentDescentOutput ascentDescentOutput = mAscentDescentCalculator.addAltitude((float)mAltitudeInMetersChecked);
            mTotalAscentDuringPause += ascentDescentOutput.getAscent() - mTotalDirtyAscent;
            mTotalDescentDuringPause += ascentDescentOutput.getDescent() - mTotalDirtyDescent;
            mTotalDirtyAscent = ascentDescentOutput.getAscent();
            mTotalDirtyDescent = ascentDescentOutput.getDescent();
        }

        setActive(true);
    }

//    @Override
//    public void setPolarSensorListener(PolarSensorListener listener) {
//        this.mPolarSensorListener = listener;
//    }

    @Override
    public void setState(SENSOR_STATE var1) {
        if (SENSOR_STATE.READY.equals(var1)) {
            if (!mFix) { // TODO: may be more actual data is needed here
                super.setState(SENSOR_STATE.SEARCHING, false);
            } else {
                super.setState(var1, false);
            }
        } else {
            super.setState(var1, false);
        }
    }

    private void handleLocation(Location location){
        Log.i(TAG, "handleLocation: " + location.toString());

        mLocationDataCalculator.handleLocation(location);

        mNumberOfSatellites = mLocationDataCalculator.getNumberOfSatellites();
        mAltitudeInMetersChecked = a_DataTypes.b_adjust(a_DataTypes.ALTITUDE_INDEX, mLocationDataCalculator.getAltitudeInMeters(true));
        mAltitudeInMeters = a_DataTypes.b_adjust(a_DataTypes.ALTITUDE_INDEX, mLocationDataCalculator.getAltitudeInMeters(false));
        mSpeedInMetersPerSecond = (float)boundSpeed(mLocationDataCalculator.getSpeedInMetersPerSecond());
        mLatitudeInDecimalDegrees = a_DataTypes.b_adjust(a_DataTypes.LAT_INDEX, mLocationDataCalculator.getLatitudeInDecimalDegrees());
        mLongitudeInDecimalDegrees = a_DataTypes.b_adjust(a_DataTypes.LON_INDEX, mLocationDataCalculator.getLongitudeInDecimalDegrees());
        AscentDescentOutput ascentDescentOutput = null;
        if (mAscentDescentCalculator != null) {
            ascentDescentOutput = mAscentDescentCalculator.addAltitude((float)mAltitudeInMetersChecked);
        }

        setState(SENSOR_STATE.READY);

        if (isActive()) {
            mDirtyTotalDistanceInMeters = (float)mLocationDataCalculator.getDistanceInMeters();
            if (mAscentDescentCalculator == null && !Double.isNaN(mAltitudeInMetersChecked)) {
                mAscentDescentCalculator = new AscentDescentCalculatorAndroidImpl(1, (float)mAltitudeInMetersChecked);
            } else if (ascentDescentOutput != null) {
                mTotalDirtyAscent = ascentDescentOutput.getAscent();
                mTotalDirtyDescent = ascentDescentOutput.getDescent();
            }

            broadcastLocationData(mSpeedInMetersPerSecond,
                    getPureTotalDistance(),
                    mAltitudeInMetersChecked,
                    getPureAscent(),
                    getPureDescent());
        }
    }

    private static double boundSpeed(double speed) {
        double result;
        if (speed < 0.0D) {
            Log.i(TAG, "Speed is below minimum: " + speed + " m/s");
            result = 0.0D;
        } else {
            result = speed;
            if (speed > 110.83333626941406D) {
                Log.i(TAG, "Speed is above maximum : " + speed + " m/s");
                result = 110.83333626941406D;
            }
        }
        return result;
    }

    public void handleLocationList(List<Location> locationList){
        Log.i(TAG, "handleLocationList");
        for (Location location : locationList) {
            handleLocation(location);
        }
    }

    public float getPureTotalDistance() {
        return a_DataTypes.a_adjust(a_DataTypes.DISTANCE_INDEX,
                mDirtyTotalDistanceInMeters - (mReferenceDistanceInMeters + mTotalDistanceDuringPauseInMeters));
    }

    public float getPureAscent() {
        float result;
        if (mTotalDirtyAscent > mTotalAscentDuringPause) {
            result = mTotalDirtyAscent - mTotalAscentDuringPause;
        } else {
            result = 0.0F;
        }

        return result;
    }

    public float getPureDescent() {
        float result;
        if (mTotalDirtyDescent > mTotalDescentDuringPause) {
            result = mTotalDirtyDescent - mTotalDescentDuringPause;
        } else {
            result = 0.0F;
        }

        return result;
    }

    private void broadcastLocationData(float speed, float pureTotalDistance, double altitude, float pureAscent, float pureDescent) {
        Intent intent = new Intent("fi.polar.polarflow.ACTION_LOCATION_DATA");

        intent.putExtra("fi.polar.polarflow.KEY_SENSOR_CALCULATOR_TYPE", "fi.polar.polarflow.SENSOR_CALCULATOR_TYPE_POLAR");
        intent.putExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_CURRENT_SPEED_VALUE", speed);
        intent.putExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_DISTANCE_VALUE", pureTotalDistance);
        intent.putExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_ALTITUDE_VALUE", altitude);
        intent.putExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_ASCENT_VALUE", pureAscent);
        intent.putExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_DESCENT_VALUE", pureDescent);
        intent.putExtra("fi.polar.polarflow.SENSOR_STATE", SENSOR_STATE.toPolar(getState()));

        StickyLocalBroadcastManager.sendStickyBroadcast(intent);
    }

    public f_PolarSensorEvent k() {
        return new f_PolarSensorEvent(
                mPowerSaveModeStartTime,
                mFix,
                getPureTotalDistance(),
                mSpeedInMetersPerSecond,
                mLatitudeInDecimalDegrees,
                mLongitudeInDecimalDegrees,
                mNumberOfSatellites,
                mAltitudeInMetersChecked,
                mAltitudeInMeters,
                getPureAscent(),
                getPureDescent());
    }

}
