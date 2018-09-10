package fi.polar.polarflow.c.fused.proxy;

import java.util.List;

import fi.polar.polarflow.c.e_PolarSensorListenerEx;
import fi.polar.polarflow.c.l_PolarSensorListener;
import fi.polar.polarflow.c.m_SENSOR_STATE;

public class PolarSensorListenerImpl implements PolarSensorListener {
    private e_PolarSensorListenerEx listener;

    PolarSensorListenerImpl(l_PolarSensorListener listener) {
        this.listener = (e_PolarSensorListenerEx)listener;
    }

    @Override
    public void a_new(int var1) {
        listener.a(var1);
    }

    @Override
    public void a_new(m_SENSOR_STATE var1) {
        listener.a(var1);
    }

    @Override
    public void a_onPolarSensorEvents(List eventsList) {
        listener.a_onPolarSensorEvents(eventsList);
    }
}