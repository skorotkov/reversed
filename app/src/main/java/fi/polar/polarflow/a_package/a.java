package fi.polar.polarflow.a_package;

import android.util.SparseArray;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

public class a {
   private static final SparseArray a = new b();
   private static final SparseArray b = new c();
   private static final SparseArray c = new d();
   private static final SparseArray d = new e();
   private static final SparseArray e = new f();
   private static final SparseArray f = new g();

   public static float a(float var0, float var1) {
      var0 /= (float)TimeUnit.SECONDS.toMillis(1L);
      var1 /= (float)(TimeUnit.SECONDS.toMillis(1L) * TimeUnit.HOURS.toSeconds(1L));
      if (var1 != 0.0F && var0 != 0.0F) {
         var0 /= var1;
      } else {
         var0 = -1.0F;
      }

      return var0;
   }

   public static float a(int var0, float var1) {
      k var2 = (k)d.get(var0);
      if (var2 != null) {
         var1 = var2.a(var1);
      } else {
         fi.polar.polarflow.util.d.c("DataTypes", "", new IllegalArgumentException("Unsupported data type: " + var0));
      }

      return var1;
   }

   public static int a(int var0, int var1) {
      m var2 = (m)e.get(var0);
      if (var2 != null) {
         var1 = var2.a(var1);
      } else {
         fi.polar.polarflow.util.d.c("DataTypes", "", new IllegalArgumentException("Unsupported data type: " + var0));
      }

      return var1;
   }

   public static long a(float var0) {
      return (long)Math.ceil((double)((float)TimeUnit.HOURS.toSeconds(1L) / var0));
   }

   public static long a(int var0, long var1) {
      o var3 = (o)f.get(var0);
      if (var3 != null) {
         var1 = var3.a(var1);
      } else {
         fi.polar.polarflow.util.d.c("DataTypes", "", new IllegalArgumentException("Unsupported data type: " + var0));
      }

      return var1;
   }

   public static String a(int var0, double var1) {
      String var3 = (String)a.get(var0);
      RoundingMode var4 = (RoundingMode)b.get(var0);
      String var6;
      if (var3 != null && var4 != null) {
         DecimalFormat var5 = new DecimalFormat(var3);
         var5.setRoundingMode(var4);
         var6 = var5.format(var1);
      } else if (var0 == 8) {
         var6 = String.valueOf((int)(var1 - var1 % 5.0D));
      } else {
         fi.polar.polarflow.util.d.c("DataTypes", "", new IllegalArgumentException("Unsupported data type: " + var0));
         var6 = null;
      }

      return var6;
   }

   public static double b(int var0, double var1) {
      i var3 = (i)c.get(var0);
      if (var3 != null) {
         var1 = var3.a(var1);
      } else {
         fi.polar.polarflow.util.d.c("DataTypes", "", new IllegalArgumentException("Unsupported data type: " + var0));
      }

      return var1;
   }

   public static long b(float var0) {
      return (long)Math.ceil((double)(360.0F / var0));
   }

   public static boolean b(int var0, float var1) {
      k var2 = (k)d.get(var0);
      boolean var3;
      if (var2 != null) {
         var3 = var2.b(var1);
      } else {
         fi.polar.polarflow.util.d.c("DataTypes", "", new IllegalArgumentException("Unsupported data type: " + var0));
         var3 = false;
      }

      return var3;
   }

   public static long c(float var0) {
      return (long)Math.ceil((double)(329.184F / var0));
   }
}
