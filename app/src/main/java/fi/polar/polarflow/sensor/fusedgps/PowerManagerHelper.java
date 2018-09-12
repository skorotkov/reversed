package fi.polar.polarflow.sensor.fusedgps;

import android.content.Context;
import android.os.PowerManager;

public class PowerManagerHelper {
    private static final String TAG = FusedGpsLocationProvider.class.getSimpleName();
    private final PowerManager mPowerManager;

    public PowerManagerHelper(Context context) {
        this.mPowerManager = (PowerManager)context.getSystemService(Context.POWER_SERVICE);
        Log.i(TAG, "mPowerManager = " + mPowerManager);
    }

    public boolean isPowerSaveMode() {
        return this.mPowerManager != null && this.mPowerManager.isPowerSaveMode();
    }

    public boolean isDeviceIdleMode() {
        return this.mPowerManager != null && this.mPowerManager.isDeviceIdleMode();
    }}
