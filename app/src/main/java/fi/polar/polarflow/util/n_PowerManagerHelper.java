package fi.polar.polarflow.util;

import android.content.Context;
import android.os.PowerManager;

public class n {
   private final PowerManager a;

   public n(Context var1) {
      this.a = (PowerManager)var1.getSystemService("power");
   }

   public boolean a() {
      boolean var1;
      if (this.a != null && this.a.isPowerSaveMode()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean b() {
      boolean var1;
      if (this.a != null && this.a.isDeviceIdleMode()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }
}
