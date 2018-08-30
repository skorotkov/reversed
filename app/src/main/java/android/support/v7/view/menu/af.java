package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.MenuItem;
import android.view.SubMenu;

public final class af {
   public static MenuItem a(Context var0, android.support.v4.e.a.b var1) {
      Object var2;
      if (VERSION.SDK_INT >= 16) {
         var2 = new w(var0, var1);
      } else {
         if (VERSION.SDK_INT < 14) {
            throw new UnsupportedOperationException();
         }

         var2 = new r(var0, var1);
      }

      return (MenuItem)var2;
   }

   public static SubMenu a(Context var0, android.support.v4.e.a.c var1) {
      if (VERSION.SDK_INT >= 14) {
         return new al(var0, var1);
      } else {
         throw new UnsupportedOperationException();
      }
   }
}
