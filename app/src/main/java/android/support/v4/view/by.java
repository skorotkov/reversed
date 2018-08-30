package android.support.v4.view;

import android.annotation.TargetApi;
import android.view.VelocityTracker;

@TargetApi(11)
class by {
   public static float a(VelocityTracker var0, int var1) {
      return var0.getXVelocity(var1);
   }

   public static float b(VelocityTracker var0, int var1) {
      return var0.getYVelocity(var1);
   }
}
