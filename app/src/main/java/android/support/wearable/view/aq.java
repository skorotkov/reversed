package android.support.wearable.view;

import android.content.Context;

public final class aq {
   public static int a(Context var0) {
      return var0.getResources().getDisplayMetrics().widthPixels;
   }

   public static int a(Context var0, int var1, int var2) {
      return (int)(var0.getResources().getFraction(var2, 1, 1) * (float)var1);
   }
}
