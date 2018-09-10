package fi.polar.polarflow.c.fused;

import android.content.Context;

import fi.polar.polarflow.c.fused.proxy.PolarSensorListener;
import fi.polar.polarflow.c.fused.proxy.Sensor;
import fi.polar.polarflow.c.n_SENSOR_TYPE;

public class FusedGpsLocationProvider extends Sensor {
    protected FusedGpsLocationProvider(Context context) {
        super(context, n_SENSOR_TYPE.c_FUSED_GPS);
    }

    private PolarSensorListener mPolarSensorListener;

    @Override
    protected void a() {

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    protected void doSomething() {

    }

    @Override
    public void setPolarSensorListener(PolarSensorListener listener) {
        this.mPolarSensorListener = listener;
    }
}
