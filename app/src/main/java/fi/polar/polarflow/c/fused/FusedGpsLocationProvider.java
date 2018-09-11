package fi.polar.polarflow.c.fused;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.SystemClock;

import fi.polar.polarflow.c.fused.proxy.Log;
import fi.polar.polarflow.c.fused.proxy.PolarSensorListener;
import fi.polar.polarflow.c.fused.proxy.Sensor;
import fi.polar.polarflow.c.m_SENSOR_STATE;
import fi.polar.polarflow.c.n_SENSOR_TYPE;
import fi.polar.polarflow.util.n_PowerManagerHelper;
import fi.polar.polarflow.util.v_StickyLocalBroadcastManager;

public class FusedGpsLocationProvider extends Sensor {
    private static final String TAG = FusedGpsLocationProvider.class.getSimpleName();

    private PolarSensorListener mPolarSensorListener;
    private long mStartTime;
    private long mPowerSaveModeStartTime;
    private boolean mFix;
    private Handler mHandler;
    private BroadcastReceiver mPowerSaveModeBroadcastReceiver;
    private n_PowerManagerHelper mPowerManagerHelper;
    private FusedGpsSensor mSensor;

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
}
