package fi.polar.polarflow.sensor.fusedgps.proxy;

import fi.polar.polarflow.c.m_SENSOR_STATE;

public enum SENSOR_STATE {
    DISABLED,
    NOT_READY,
    SEARCHING,
    READY;

    public static m_SENSOR_STATE toPolar(SENSOR_STATE state) {
        m_SENSOR_STATE res = m_SENSOR_STATE.a_DISABLED;
        switch (state) {
            case DISABLED: res = m_SENSOR_STATE.a_DISABLED; break;
            case NOT_READY: res = m_SENSOR_STATE.b_NOT_READY; break;
            case SEARCHING: res = m_SENSOR_STATE.c_SEARCHING; break;
            case READY: res = m_SENSOR_STATE.d_READY; break;
        }
        return res;
    }

    public static SENSOR_STATE fromPolar(m_SENSOR_STATE state) {
        SENSOR_STATE res = SENSOR_STATE.DISABLED;
        switch (state) {
            case a_DISABLED: res = SENSOR_STATE.DISABLED; break;
            case b_NOT_READY: res = SENSOR_STATE.NOT_READY; break;
            case c_SEARCHING: res = SENSOR_STATE.SEARCHING; break;
            case d_READY: res = SENSOR_STATE.READY; break;
        }
        return res;
    }
}
