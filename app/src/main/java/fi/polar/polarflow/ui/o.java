package fi.polar.polarflow.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources.Theme;
import android.location.LocationManager;
import android.os.Vibrator;
import android.os.Build.VERSION;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.util.TypedValue;
import android.widget.TextView;
import fi.polar.polarflow.data.orm.PhysData;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.joda.time.Period;

public class o {
   private static final String a = o.class.getSimpleName();

   public static int a() {
      return (new fi.polar.polarflow.util.k(PhysData.getUserPhysData())).u();
   }

   public static int a(int var0) {
      return Math.round((float)var0 * 1.0936133F);
   }

   public static int a(Activity var0, String[] var1, int var2, boolean var3) {
      byte var4 = 0;
      byte var5;
      if (VERSION.SDK_INT >= 23) {
         if (var1 == null) {
            var5 = -1;
         } else {
            boolean var10;
            if (!var3 && !b(var0)) {
               var10 = false;
            } else {
               var10 = true;
            }

            ArrayList var6 = new ArrayList();
            int var7 = var1.length;

            for(int var8 = 0; var8 < var7; ++var8) {
               String var9 = var1[var8];
               if (var0.checkSelfPermission(var9) != 0 && (var10 || !var9.equals("android.permission.ACCESS_FINE_LOCATION"))) {
                  var6.add(var9);
                  fi.polar.polarflow.util.d.c(a, "Requesting permission " + var9);
               }
            }

            var1 = new String[var6.size()];
            var6.toArray(var1);
            var5 = var4;
            if (var1.length != 0) {
               var0.requestPermissions(var1, var2);
               var5 = 1;
            }
         }
      } else {
         var5 = -1;
      }

      return var5;
   }

   public static String a(double var0) {
      return fi.polar.polarflow.a.a.a(4, fi.polar.polarflow.a.a.b(4, var0) / 0.3048D);
   }

   public static String a(float var0) {
      return b(var0, 1);
   }

   public static String a(float var0, int var1) {
      return fi.polar.polarflow.a.a.a(var1, (double)fi.polar.polarflow.a.a.a(1, var0) / 1609.344D);
   }

   public static String a(int var0, float var1) {
      String var2;
      if (var0 == 2) {
         var2 = b(var1);
      } else {
         var2 = a(var1);
      }

      return var2;
   }

   public static String a(long var0) {
      return String.format(Locale.getDefault(), "%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(var0), TimeUnit.MILLISECONDS.toMinutes(var0) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(var0)), TimeUnit.MILLISECONDS.toSeconds(var0) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(var0)));
   }

   public static String a(Context var0, float var1) {
      String var2;
      if (!Float.isNaN(var1) && var1 >= 0.0F) {
         var2 = c(var0, fi.polar.polarflow.a.a.b(var1));
      } else {
         var2 = var0.getString(2131231107);
      }

      return var2;
   }

   public static String a(Context var0, float var1, float var2) {
      String var3;
      if (var1 >= 0.0F && var1 != 0.0F && var2 > 0.0F) {
         var3 = String.valueOf(Math.round(100.0F * var1 / var2));
      } else {
         var3 = var0.getString(2131231101);
      }

      return var3;
   }

   public static String a(Context var0, int var1, int var2) {
      return a(var0, TimeUnit.MINUTES.toMillis((long)var1), var2);
   }

   public static String a(Context var0, long var1) {
      return a(var0, var1, 2131231021);
   }

   public static String a(Context var0, long var1, int var3) {
      Period var4 = new Period(fi.polar.polarflow.util.ab.a(var1));
      return var0.getString(var3, new Object[]{var4.getHours(), var4.getMinutes()});
   }

   public static String a(Context var0, long var1, String var3, String var4) {
      if (!DateFormat.is24HourFormat(var0)) {
         var3 = var4;
      }

      return DateFormat.format(var3, var1).toString();
   }

   public static String a(String var0) {
      return a(var0, DecimalFormatSymbols.getInstance());
   }

   public static String a(String var0, DecimalFormatSymbols var1) {
      int var2 = var0.indexOf(var1.getDecimalSeparator());
      if (var2 != -1) {
         var0 = var0.substring(0, var2);
      }

      return var0;
   }

   public static void a(int var0, TextView var1, float var2, int var3) {
      float var4 = fi.polar.polarflow.a.a.a(1, var2);
      var2 = var4;
      if (var3 == 1) {
         var2 = e(var4);
      }

      var1.setText(fi.polar.polarflow.a.a.a(var0, (double)var2));
   }

   public static void a(Context var0) {
      Vibrator var1 = (Vibrator)var0.getSystemService("vibrator");
      if (var1.hasVibrator()) {
         var1.cancel();
      }

   }

   public static void a(Context var0, int var1) {
      Vibrator var2 = (Vibrator)var0.getSystemService("vibrator");
      if (var2.hasVibrator()) {
         var2.vibrate((long)var1);
      }

   }

   public static void a(Context var0, Intent var1) {
      android.support.v4.c.g.a(var0).b(var1);
   }

   public static void a(Context var0, String var1) {
   }

   public static void a(Context var0, long[] var1) {
      Vibrator var2 = (Vibrator)var0.getSystemService("vibrator");
      if (var2.hasVibrator()) {
         var2.vibrate(var1, -1);
      }

   }

   public static void a(TextView var0, int var1) {
      if (var1 == 0) {
         var1 = 2131230861;
      } else {
         var1 = 2131230943;
      }

      var0.setText(var1);
   }

   public static int[] a(Theme var0) {
      TypedValue var1 = new TypedValue();
      var0.resolveAttribute(2130771971, var1, true);
      int var2 = var1.data;
      var0.resolveAttribute(2130771974, var1, true);
      int var3 = var1.data;
      var0.resolveAttribute(2130771977, var1, true);
      int var4 = var1.data;
      var0.resolveAttribute(2130771980, var1, true);
      int var5 = var1.data;
      var0.resolveAttribute(2130771983, var1, true);
      return new int[]{var2, var3, var4, var5, var1.data};
   }

   public static int b(int var0) {
      return Math.round((float)var0 * 0.91440004F);
   }

   public static String b(double var0) {
      return fi.polar.polarflow.a.a.a(4, fi.polar.polarflow.a.a.b(4, var0));
   }

   public static String b(float var0) {
      return a(var0, 1);
   }

   public static String b(float var0, int var1) {
      return fi.polar.polarflow.a.a.a(var1, (double)fi.polar.polarflow.a.a.a(1, var0) / 1000.0D);
   }

   public static String b(Context var0, float var1) {
      String var2;
      if (!Float.isNaN(var1) && var1 >= 0.0F) {
         var2 = c(var0, fi.polar.polarflow.a.a.c(var1));
      } else {
         var2 = var0.getString(2131231107);
      }

      return var2;
   }

   public static String b(Context var0, int var1) {
      return a(var0, TimeUnit.SECONDS.toMillis((long)var1));
   }

   public static String b(Context var0, long var1) {
      return DateUtils.formatDateTime(var0, var1, 131092);
   }

   public static void b(Context var0, String var1) {
      android.support.v4.c.g.a(var0).a(new Intent(var1));
   }

   public static boolean b(Context var0) {
      return ((LocationManager)var0.getSystemService("location")).isProviderEnabled("gps");
   }

   public static int c(int var0) {
      if (var0 == 2) {
         var0 = 2131231098;
      } else {
         var0 = 2131230860;
      }

      return var0;
   }

   public static String c(float var0) {
      return fi.polar.polarflow.a.a.a(8, (double)((int)fi.polar.polarflow.a.a.a(4, var0)));
   }

   public static String c(Context var0, float var1) {
      String var2;
      if (!Float.isNaN(var1) && var1 >= 0.0F) {
         var2 = fi.polar.polarflow.a.a.a(2, (double)var1);
      } else {
         var2 = var0.getString(2131231109);
      }

      return var2;
   }

   public static String c(Context var0, int var1) {
      String var2;
      if (var1 >= 0 && var1 != 0) {
         var2 = String.valueOf(var1);
      } else {
         var2 = var0.getString(2131231101);
      }

      return var2;
   }

   private static String c(Context var0, long var1) {
      String var5;
      if (var1 == Long.MAX_VALUE) {
         var5 = var0.getString(2131231107);
      } else {
         long var3 = var1;
         if (var1 >= TimeUnit.MINUTES.toSeconds(100L)) {
            var3 = TimeUnit.MINUTES.toSeconds(100L) - 1L;
         }

         var5 = String.format(Locale.getDefault(), "%d:%02d", TimeUnit.SECONDS.toMinutes(var3), var3 % 60L);
      }

      return var5;
   }

   public static void c(Context var0, String var1) {
      android.support.v4.c.g.a(var0).b(new Intent(var1));
   }

   public static int d(int var0) {
      if (var0 == 2) {
         var0 = 2131231012;
      } else {
         var0 = 2131231013;
      }

      return var0;
   }

   public static String d(float var0) {
      return fi.polar.polarflow.a.a.a(8, (double)((int)((double)fi.polar.polarflow.a.a.a(4, var0) / 0.3048D)));
   }

   public static String d(Context var0, float var1) {
      String var2;
      if (!Float.isNaN(var1) && var1 >= 0.0F) {
         var2 = fi.polar.polarflow.a.a.a(2, (double)var1 / 1.609344D);
      } else {
         var2 = var0.getString(2131231109);
      }

      return var2;
   }

   public static String d(Context var0, int var1) {
      String var2;
      if (var1 > 0) {
         var2 = String.valueOf(fi.polar.polarflow.a.a.a(7, var1));
      } else {
         var2 = var0.getString(2131231105);
      }

      return var2;
   }

   public static boolean d(Context var0, String var1) {
      int var2;
      if (VERSION.SDK_INT >= 23) {
         var2 = var0.checkSelfPermission(var1);
      } else {
         var2 = var0.checkCallingOrSelfPermission(var1);
      }

      boolean var3;
      if (var2 == 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   public static float e(float var0) {
      return 1.0936133F * var0;
   }

   public static String e(Context var0, float var1) {
      String var2;
      if (!Float.isNaN(var1) && var1 >= 0.0F) {
         if (var1 == 0.0F) {
            var2 = var0.getString(2131231106);
         } else {
            var2 = c(var0, fi.polar.polarflow.a.a.a(var1));
         }
      } else {
         var2 = var0.getString(2131231107);
      }

      return var2;
   }

   public static String e(Context var0, int var1) {
      String var2;
      if (var1 < 0) {
         var2 = var0.getString(2131231100);
      } else {
         var2 = String.valueOf(var1);
      }

      return var2;
   }

   public static List e(int var0) {
      ArrayList var1 = new ArrayList();
      var1.add(new int[]{(int)Math.round((double)var0 * 0.5D), (int)Math.round((double)var0 * 0.6D)});
      var1.add(new int[]{(int)Math.round((double)var0 * 0.6D), (int)Math.round((double)var0 * 0.7D)});
      var1.add(new int[]{(int)Math.round((double)var0 * 0.7D), (int)Math.round((double)var0 * 0.8D)});
      var1.add(new int[]{(int)Math.round((double)var0 * 0.8D), (int)Math.round((double)var0 * 0.9D)});
      var1.add(new int[]{(int)Math.round((double)var0 * 0.9D), var0});
      return var1;
   }

   public static String f(Context var0, float var1) {
      String var2;
      if (!Float.isNaN(var1) && var1 >= 0.0F) {
         if (var1 == 0.0F) {
            var2 = var0.getString(2131231106);
         } else {
            var2 = c(var0, fi.polar.polarflow.a.a.a(var1 / 1.609344F));
         }
      } else {
         var2 = var0.getString(2131231107);
      }

      return var2;
   }
}
