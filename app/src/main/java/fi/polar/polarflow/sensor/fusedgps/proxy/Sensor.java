package fi.polar.polarflow.sensor.fusedgps.proxy;

import android.content.Context;

import fi.polar.polarflow.sensor.fusedgps.PolarSensorListener;
import fi.polar.polarflow.c.i_PolarSensorListenerSupport;
import fi.polar.polarflow.c.l_PolarSensorListener;
import fi.polar.polarflow.data.ExerciseSensor;

public abstract class Sensor extends fi.polar.polarflow.c.a_Sensor implements i_PolarSensorListenerSupport {
    protected Sensor(Context var1, SENSOR_TYPE var2) {
        super(var1, SENSOR_TYPE.toPolar(var2));
    }

    protected SENSOR_TYPE getType() { return SENSOR_TYPE.fromPolar(c_sensorType); }

    public void setState(SENSOR_STATE state) {
        this.a_setState(SENSOR_STATE.toPolar(state), false);
    }

    public void setState(SENSOR_STATE state, boolean var2) {
        this.a_setState(SENSOR_STATE.toPolar(state), var2);
    }

    public void b_start() {
        start();
    }

    public abstract void start();

    public void c_stop() {
        stop();
    }

    public abstract void stop();

    protected void d_broadcastStateChanged() {
        broadcastStateChanged();
    }

    protected abstract void broadcastStateChanged();

    public SENSOR_STATE getState() {
        return SENSOR_STATE.fromPolar(this.e_getState());
    }

    public void set_F_true() {
        this.f_pause();
    }

    public void set_F_false() {
        this.g_resume();
    }

    public void do_a_and_set_e_true() {
        this.h();
    }

    public void set_e_false() {
        this.i();
    }

    public ExerciseSensor get_ExerciseSensor() {
        return j();
    }

    public void a_setPolarSensorListener(l_PolarSensorListener var1) {
        this.setPolarSensorListener(new PolarSensorListenerImpl(var1));
    }

    protected void a_reset() {
        this.reset();
    }

    protected abstract void reset();

    public abstract void setPolarSensorListener(PolarSensorListener var1);

    public Context getContext() { return a_context; }

    protected boolean isStarted() { return d_sensorStarted; }
    
    protected void setStarted(boolean started) { d_sensorStarted = started; }
}
