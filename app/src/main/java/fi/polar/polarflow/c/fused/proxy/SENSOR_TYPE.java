package fi.polar.polarflow.c.fused.proxy;

import fi.polar.polarflow.c.n_SENSOR_TYPE;

public enum SENSOR_TYPE {
    UNKNOWN,
    IN_DEVICE_GPS,
    FUSED_GPS,
    HEART_RATE,
    RUNNING_CADENCE,
    ACCELEROMETER;

    public static n_SENSOR_TYPE toPolar(SENSOR_TYPE TYPE) {
        n_SENSOR_TYPE res = n_SENSOR_TYPE.a_UNKNOWN;
        switch (TYPE) {
            case UNKNOWN: res = n_SENSOR_TYPE.a_UNKNOWN; break;
            case IN_DEVICE_GPS: res = n_SENSOR_TYPE.b_IN_DEVICE_GPS; break;
            case FUSED_GPS: res = n_SENSOR_TYPE.c_FUSED_GPS; break;
            case HEART_RATE: res = n_SENSOR_TYPE.d_HEART_RATE; break;
            case RUNNING_CADENCE: res = n_SENSOR_TYPE.e_RUNNING_CADENCE; break;
            case ACCELEROMETER: res = n_SENSOR_TYPE.f_ACCELEROMETER; break;
        }
        return res;
    }

    public static SENSOR_TYPE fromPolar(n_SENSOR_TYPE TYPE) {
        SENSOR_TYPE res = SENSOR_TYPE.UNKNOWN;
        switch (TYPE) {
            case a_UNKNOWN: res = SENSOR_TYPE.UNKNOWN; break;
            case b_IN_DEVICE_GPS: res = SENSOR_TYPE.IN_DEVICE_GPS; break;
            case c_FUSED_GPS: res = SENSOR_TYPE.FUSED_GPS; break;
            case d_HEART_RATE: res = SENSOR_TYPE.HEART_RATE; break;
            case e_RUNNING_CADENCE: res = SENSOR_TYPE.RUNNING_CADENCE; break;
            case f_ACCELEROMETER: res = SENSOR_TYPE.ACCELEROMETER; break;
        }
        return res;
    }
}
