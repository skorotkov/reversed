package fi.polar.polarflow.sensor.fusedgps.proxy;

import android.support.v4.util.TimeUtils;

import java.util.Locale;

import fi.polar.polarflow.c.f_PolarSensorEvent;

public class PolarSensorEvent extends f_PolarSensorEvent {
    public PolarSensorEvent(long timestamp,
                            boolean fix,
                            float pureTotalDistance,
                            float speedInMetersPerSecond,
                            double latitudeInDecimalDegrees,
                            double longitudeInDecimalDegrees,
                            int numberOfSatellites,
                            double altitudeInMetersChecked,
                            double altitudeInMeters,
                            float pureAscent,
                            float pureDescent) {
        super(timestamp,
                fix,
                pureTotalDistance,
                speedInMetersPerSecond,
                latitudeInDecimalDegrees,
                longitudeInDecimalDegrees,
                numberOfSatellites,
                altitudeInMetersChecked,
                altitudeInMeters,
                pureAscent,
                pureDescent);
    }

    public String toCsvString() {
        StringBuilder s = new StringBuilder();
        TimeUtils.formatDuration(this.b_timestamp, s);
        return String.format(Locale.US, "%d;%s;%s;%.2f;%.2f;%.6f;%.6f;%d;%.2f;%.2f;%.2f;%.2f",
                this.b_timestamp,
                s,
                this.n_fix,
                this.e_distance,
                this.f_speed,
                this.h_latitude,
                this.i_longitude,
                this.g_numberOfSatellites,
                this.j_altitudeInMetersChecked,
                this.k_altitudeInMeters,
                this.l_ascent,
                this.m_descent);
    }
}
