package fi.polar.polarflow.c.fused.proxy;

import java.util.List;

import fi.polar.polarflow.c.m_SENSOR_STATE;

public interface PolarSensorListener {
    void a_new(int var1);
    void a_new(m_SENSOR_STATE state);
    void a_onPolarSensorEvents(List eventsList);
}
