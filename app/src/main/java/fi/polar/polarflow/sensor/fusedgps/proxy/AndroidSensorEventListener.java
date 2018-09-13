package fi.polar.polarflow.sensor.fusedgps.proxy;

import android.hardware.SensorEvent;
import android.os.Handler;

import fi.polar.polarflow.c.g_AndroidSensorEventListener;
import fi.polar.polarflow.c.j_PolarSensorEventListener;
import fi.polar.polarflow.sensor.fusedgps.Log;

abstract public class AndroidSensorEventListener extends g_AndroidSensorEventListener {

    public AndroidSensorEventListener(j_PolarSensorEventListener polarSensorEventListener, Handler handler) {
        super(polarSensorEventListener, handler);
    }

    public void onEvent(PolarSensorEvent event) {
        Log.i("AndroidSensorEventListener", "onEvent");
        super.a(event);
    }

    @Override
    public void onAccuracyChanged(android.hardware.Sensor var1, int var2) {
    }

    @Override
    public void onSensorChanged(SensorEvent var1) {
    }
}
