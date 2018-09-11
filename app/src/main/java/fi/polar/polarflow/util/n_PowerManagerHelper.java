package fi.polar.polarflow.util;

import android.content.Context;
import android.os.PowerManager;

public class n_PowerManagerHelper {
   private final PowerManager a;

   public n_PowerManagerHelper(Context var1) {
      this.a = (PowerManager)var1.getSystemService("power");
   }

   public boolean a_isPowerSaveMode() {
      boolean var1;
      if (this.a != null && this.a.isPowerSaveMode()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean b_isDeviceIdleMode() {
      boolean var1;
      if (this.a != null && this.a.isDeviceIdleMode()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }
}
