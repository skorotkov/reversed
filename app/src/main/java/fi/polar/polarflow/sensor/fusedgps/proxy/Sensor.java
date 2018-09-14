package fi.polar.polarflow.sensor.fusedgps.proxy;

import android.content.Context;

import java.util.List;

import fi.polar.polarflow.c.d_gps_package.a_GpsLocationProviderBase;
import fi.polar.polarflow.c.e_PolarSensorListenerEx;
import fi.polar.polarflow.c.f_PolarSensorEvent;
import fi.polar.polarflow.c.j_PolarSensorEventListener;
import fi.polar.polarflow.c.l_PolarSensorListener;

public abstract class Sensor extends a_GpsLocationProviderBase {
    protected final j_PolarSensorEventListener mPolarSensorEventListener;
    private e_PolarSensorListenerEx mPolarSensorListener;

    protected Sensor(Context var1, SENSOR_TYPE var2) {
        super(var1, SENSOR_TYPE.toPolar(var2));
        mPolarSensorEventListener = new j_PolarSensorEventListener() {
            @Override
            public void a_onPolarSensorEvents(List var1) {
                if (mPolarSensorListener != null) {
                    mPolarSensorListener.a_onPolarSensorEvents(var1);
                }
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

    protected void setActive(boolean isActive) {
        this.e_isActive = isActive;
    }

    protected boolean isActive() { return e_isActive; }

    @Override
    public void a_setPolarSensorListener(l_PolarSensorListener var1) {
        mPolarSensorListener = (e_PolarSensorListenerEx)var1;
    }

    @Override
    protected void a_reset() {
        reset();
    }

    protected abstract void reset();

    public Context getContext() { return a_context; }

    protected boolean isStarted() { return d_sensorStarted; }

    protected void setStarted(boolean started) { d_sensorStarted = started; }

    @Override
    public f_PolarSensorEvent k() {
        return createPolarSensorEvent();
    }

    protected abstract PolarSensorEvent createPolarSensorEvent();

    @Override
    public float p_getSpeedInMetersPerSecond() {
        return getSpeedInMetersPerSecond();
    }

    protected abstract float getSpeedInMetersPerSecond();
}
