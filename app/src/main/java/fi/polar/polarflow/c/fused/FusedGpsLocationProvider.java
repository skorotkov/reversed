package fi.polar.polarflow.c.fused;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;

import fi.polar.polarflow.c.d_gps_package.b_GpsLocationProvider;
import fi.polar.polarflow.c.d_gps_package.i_GpsSensor;
import fi.polar.polarflow.c.fused.proxy.Log;
import fi.polar.polarflow.c.fused.proxy.PolarSensorListener;
import fi.polar.polarflow.c.fused.proxy.Sensor;
import fi.polar.polarflow.c.m_SENSOR_STATE;
import fi.polar.polarflow.c.n_SENSOR_TYPE;
import fi.polar.polarflow.util.aa_TimeUtils;
import fi.polar.polarflow.util.v_StickyLocalBroadcastManager;

public class FusedGpsLocationProvider extends Sensor {
    private static final String TAG = FusedGpsLocationProvider.class.getSimpleName();

    protected FusedGpsLocationProvider(Context context) {
        super(context, n_SENSOR_TYPE.c_FUSED_GPS);
    }

    private PolarSensorListener mPolarSensorListener;
    private long mStartTime;

    @Override
    protected void a() {

    }

    @Override
    public void start() {
        mStartTime = SystemClock.elapsedRealtime();
        Log.i(TAG, "start() at: " + mStartTime);
        if (!fi.polar.polarflow.ui.o.d(this.a_context, "android.permission.ACCESS_FINE_LOCATION")) {
            setState(m_SENSOR_STATE.a_DISABLED, true);
        } else if (!this.d_sensorStarted) {
            this.d_sensorStarted = true;
            this.a_context.registerReceiver(this.J_powerSaveModeBroadcastReceiver, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"), (String)null, this.C_handler);
            if (this.G.a()) {
                this.a_setState(m_SENSOR_STATE.a_DISABLED, true);
            } else if (!this.B_gpsSensorStarted) {
                i_GpsSensor.b_startListeningUpdates(this.z_gpsSensor);
            }
        } else {
            this.d_broadcastStateChanged();
        }

    }

    @Override
    public void stop() {

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
}
