package android.support.v4.c.a_package;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

public final class h {
   public static Drawable a(Resources var0, int var1, Theme var2) {
      Drawable var3;
      if (VERSION.SDK_INT >= 21) {
         var3 = i.a(var0, var1, var2);
      } else {
         var3 = var0.getDrawable(var1);
      }

      return var3;
   }
}
