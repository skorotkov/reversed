package fi.polar.polarflow.sensor.fusedgps.proxy;

import android.os.Handler;

import fi.polar.polarflow.c.g_AndroidSensorEventListener;
import fi.polar.polarflow.c.j_PolarSensorEventListener;

abstract public class AndroidSensorEventListener extends g_AndroidSensorEventListener {
    public AndroidSensorEventListener(j_PolarSensorEventListener var1, Handler var2) {
        super(var1, var2);
    }
}
