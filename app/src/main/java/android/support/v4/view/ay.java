package android.support.v4.view;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public final class ay {
   static final bc a;

   static {
      if (VERSION.SDK_INT >= 14) {
         a = new bb();
      } else if (VERSION.SDK_INT >= 11) {
         a = new ba();
      } else {
         a = new az();
      }

   }

   public static MenuItem a(MenuItem var0, q var1) {
      if (var0 instanceof android.support.v4.e.a.b) {
         var0 = ((android.support.v4.e.a.b)var0).a(var1);
      } else {
         Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
      }

      return (MenuItem)var0;
   }

   public static MenuItem a(MenuItem var0, View var1) {
      if (var0 instanceof android.support.v4.e.a.b) {
         var0 = ((android.support.v4.e.a.b)var0).setActionView(var1);
      } else {
         var0 = a.a(var0, var1);
      }

      return var0;
   }

   public static void a(MenuItem var0, int var1) {
      if (var0 instanceof android.support.v4.e.a.b) {
         ((android.support.v4.e.a.b)var0).setShowAsAction(var1);
      } else {
         a.a(var0, var1);
      }

   }

   public static boolean a(MenuItem var0) {
      boolean var1;
      if (var0 instanceof android.support.v4.e.a.b) {
         var1 = ((android.support.v4.e.a.b)var0).expandActionView();
      } else {
         var1 = a.a(var0);
      }

      return var1;
   }

   public static MenuItem b(MenuItem var0, int var1) {
      if (var0 instanceof android.support.v4.e.a.b) {
         var0 = ((android.support.v4.e.a.b)var0).setActionView(var1);
      } else {
         var0 = a.b(var0, var1);
      }

      return var0;
   }
}
