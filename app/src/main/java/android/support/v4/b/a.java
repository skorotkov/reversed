package android.support.v4.b;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Build.VERSION;

public class a extends android.support.v4.c.a {
   public static void a(Activity var0, Intent var1, int var2, Bundle var3) {
      if (VERSION.SDK_INT >= 16) {
         g.a(var0, var1, var2, var3);
      } else {
         var0.startActivityForResult(var1, var2);
      }

   }

   public static void a(Activity var0, IntentSender var1, int var2, Intent var3, int var4, int var5, int var6, Bundle var7) {
      if (VERSION.SDK_INT >= 16) {
         g.a(var0, var1, var2, var3, var4, var5, var6, var7);
      } else {
         var0.startIntentSenderForResult(var1, var2, var3, var4, var5, var6);
      }

   }

   public static void a(Activity var0, String[] var1, int var2) {
      if (VERSION.SDK_INT >= 23) {
         d.a(var0, var1, var2);
      } else if (var0 instanceof c) {
         (new Handler(Looper.getMainLooper())).post(new b(var1, var0, var2));
      }

   }

   public static boolean a(Activity var0, String var1) {
      boolean var2;
      if (VERSION.SDK_INT >= 23) {
         var2 = d.a(var0, var1);
      } else {
         var2 = false;
      }

      return var2;
   }
}
