package fi.polar.polarflow.sensor.fusedgps;

import java.util.List;

import fi.polar.polarflow.sensor.fusedgps.proxy.SENSOR_STATE;

public interface PolarSensorListener {
    void a_new(int var1);
    void a_new(SENSOR_STATE state);
    void a_onPolarSensorEvents(List eventsList);
}
