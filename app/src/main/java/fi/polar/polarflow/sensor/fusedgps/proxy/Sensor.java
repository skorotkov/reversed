package fi.polar.polarflow.sensor.fusedgps.proxy;

import android.content.Context;
import android.hardware.SensorEvent;
import android.os.Handler;

import fi.polar.polarflow.c.b_PolarSensorEventBase;
import fi.polar.polarflow.c.d_gps_package.b_GpsLocationProvider;
import fi.polar.polarflow.c.d_gps_package.c_GpsPolarSensorEventListener;
import java.util.List;

import fi.polar.polarflow.c.d_gps_package.d_GpsAndroidSensorEventListener;
//import fi.polar.polarflow.c.g_AndroidSensorEventListener;
//import fi.polar.polarflow.c.j_PolarSensorEventListener;
import fi.polar.polarflow.c.e_PolarSensorListenerEx;
import fi.polar.polarflow.c.g_AndroidSensorEventListener;
import fi.polar.polarflow.c.j_PolarSensorEventListener;
import fi.polar.polarflow.sensor.fusedgps.PolarSensorListener;
import fi.polar.polarflow.c.i_PolarSensorListenerSupport;
import fi.polar.polarflow.c.l_PolarSensorListener;
import fi.polar.polarflow.data.ExerciseSensor;
import fi.polar.polarflow.sensor.fusedgps.proxy.PolarSensorListenerImpl;
import fi.polar.polarflow.sensor.fusedgps.proxy.SENSOR_STATE;
import fi.polar.polarflow.sensor.fusedgps.proxy.SENSOR_TYPE;

public abstract class Sensor extends fi.polar.polarflow.c.a_Sensor implements i_PolarSensorListenerSupport {
    private final j_PolarSensorEventListener mPolarSensorEventListener;
    private final g_AndroidSensorEventListener mAndroidSensorEventListener;
    private final Handler mHandler;

    protected Sensor(Context var1, SENSOR_TYPE var2) {
        super(var1, SENSOR_TYPE.toPolar(var2));
        mHandler = new Handler();
        mPolarSensorEventListener = new j_PolarSensorEventListener() {
            @Override
            public void a_onPolarSensorEvents(List var1) {
                if (mPolarSensorListener != null) {
                    mPolarSensorListener.a_onPolarSensorEvents(var1);
                }
            }
        };
        mAndroidSensorEventListener = new g_AndroidSensorEventListener(mPolarSensorEventListener, mHandler) {
            public void a(b_PolarSensorEventBase var1) {
                if (b_GpsLocationProvider.b_isGpsSensorStarted(this.a_gpsLocationProvider)) {
                    super.a(var1);
                }

            }

            @Override
            public void onAccuracyChanged(android.hardware.Sensor var1, int var2) {
            }

            @Override
            public void onSensorChanged(SensorEvent var1) {
            }
        };
    }


    protected SENSOR_TYPE getType() { return SENSOR_TYPE.fromPolar(c_sensorType); }

    public void setState(SENSOR_STATE state) {
        this.a_setState(SENSOR_STATE.toPolar(state), false);
    }

    public void setState(SENSOR_STATE state, boolean var2) {
        this.a_setState(SENSOR_STATE.toPolar(state), var2);
    }

    @Override
    public void b_start() {
        start();
    }

    public abstract void start();

    @Override
    public void c_stop() {
        stop();
    }

    public abstract void stop();

    @Override
    protected void d_broadcastStateChanged() {
        broadcastStateChanged();
    }

    protected abstract void broadcastStateChanged();

    public SENSOR_STATE getState() {
        return SENSOR_STATE.fromPolar(this.e_getState());
    }

    @Override
    public void f_pause() {
        super.f_pause();
        pause();
    }

    @Override
    public void g_resume() {
        super.g_resume();
        resume();
    }

    protected abstract void pause();

    protected abstract void resume();

    public void do_a_and_set_e_true() {
        this.h();
    }

    public void set_e_false() {
        this.i();
    }

    protected void setActive(boolean isActive) {
        this.e_isActive = isActive;
    }

    protected boolean isActive() { return e_isActive; }

    public ExerciseSensor get_ExerciseSensor() {
        return j();
    }

    protected e_PolarSensorListenerEx mPolarSensorListener;

    @Override
    public void a_setPolarSensorListener(l_PolarSensorListener var1) {
        mPolarSensorListener = (e_PolarSensorListenerEx)var1;
//        this.setPolarSensorListener(new PolarSensorListenerImpl(var1));
    }

    @Override
    protected void a_reset() {
        reset();
    }

    protected abstract void reset();


//    protected void setPolarSensorListener(PolarSensorListener listener) {
//        this.mPolarSensorListener = listener;
//    }

    public Context getContext() { return a_context; }

    protected boolean isStarted() { return d_sensorStarted; }

    protected void setStarted(boolean started) { d_sensorStarted = started; }
}
