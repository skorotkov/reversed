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
        TimeUtils.formatDuration(this.b, s);
        return String.format(Locale.US, "%s;%s;%.2f;%.2f;%.6f;%.6f;%d;%.2f;%.2f;%.2f;%.2f",
                s,
                this.n,
                this.e,
                this.f,
                this.h,
                this.i,
                this.g,
                this.j,
                this.k,
                this.l,
                this.m);
    }
}
