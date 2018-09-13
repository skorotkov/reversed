package fi.polar.polarflow.sensor.fusedgps.proxy;

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
}
