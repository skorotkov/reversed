package android.support.v4.c;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.TypedValue;

public class a {
   private static final Object a = new Object();
   private static TypedValue b;

   public static final Drawable a(Context param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   public static final ColorStateList b(Context var0, int var1) {
      ColorStateList var2;
      if (VERSION.SDK_INT >= 23) {
         var2 = c.a(var0, var1);
      } else {
         var2 = var0.getResources().getColorStateList(var1);
      }

      return var2;
   }

   public static final int c(Context var0, int var1) {
      if (VERSION.SDK_INT >= 23) {
         var1 = c.b(var0, var1);
      } else {
         var1 = var0.getResources().getColor(var1);
      }

      return var1;
   }
}
