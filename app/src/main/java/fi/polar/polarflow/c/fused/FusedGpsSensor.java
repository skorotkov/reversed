package fi.polar.polarflow.c.fused;

public class FusedGpsSensor {
    final FusedGpsLocationProvider mGpsLocationProvider;

    public FusedGpsSensor(FusedGpsLocationProvider mGpsLocationProvider) {
        this.mGpsLocationProvider = mGpsLocationProvider;
    }
}
