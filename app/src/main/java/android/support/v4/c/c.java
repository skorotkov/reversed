package android.support.v4.c;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;

@TargetApi(23)
class c {
   public static ColorStateList a(Context var0, int var1) {
      return var0.getColorStateList(var1);
   }

   public static int b(Context var0, int var1) {
      return var0.getColor(var1);
   }
}
