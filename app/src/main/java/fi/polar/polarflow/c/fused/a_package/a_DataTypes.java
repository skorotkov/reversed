package fi.polar.polarflow.c.fused.a_package;

import android.util.SparseArray;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

public class a_DataTypes {
   private static final SparseArray a_formats = new b_Formats();
   private static final SparseArray b_roundingModes = new c_RoundingModes();
   private static final SparseArray c_doubleRanges = new d_DoubleRanges();
   private static final SparseArray d_floatRanges = new e_FloatRanges();
   private static final SparseArray e_intRanges = new f_IntRanges();
   private static final SparseArray f_longRanges = new g_LongRanges();

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

   public static float a_adjust(int var0, float var1) {
      k_FloatConstraint var2 = (k_FloatConstraint) d_floatRanges.get(var0);
      if (var2 != null) {
         var1 = var2.a_adjust(var1);
      } else {
         fi.polar.polarflow.util.d.c("DataTypes", "", new IllegalArgumentException("Unsupported data type: " + var0));
      }

      return var1;
   }

   public static int a_adjust(int var0, int var1) {
      m_IntConstraint var2 = (m_IntConstraint) e_intRanges.get(var0);
      if (var2 != null) {
         var1 = var2.a_adjust(var1);
      } else {
         fi.polar.polarflow.util.d.c("DataTypes", "", new IllegalArgumentException("Unsupported data type: " + var0));
      }

      return var1;
   }

   public static long a(float var0) {
      return (long)Math.ceil((double)((float)TimeUnit.HOURS.toSeconds(1L) / var0));
   }

   public static long a_adjust(int var0, long var1) {
      o_LongConstraint var3 = (o_LongConstraint) f_longRanges.get(var0);
      if (var3 != null) {
         var1 = var3.a_adjust(var1);
      } else {
         fi.polar.polarflow.util.d.c("DataTypes", "", new IllegalArgumentException("Unsupported data type: " + var0));
      }

      return var1;
   }

   public static String a_roundAndToString(int var0, double var1) {
      String var3 = (String) a_formats.get(var0);
      RoundingMode var4 = (RoundingMode) b_roundingModes.get(var0);
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

   public static double b_adjust(int var0, double var1) {
      i_DoubleConstraint var3 = (i_DoubleConstraint) c_doubleRanges.get(var0);
      if (var3 != null) {
         var1 = var3.a_adjust(var1);
      } else {
         fi.polar.polarflow.util.d.c("DataTypes", "", new IllegalArgumentException("Unsupported data type: " + var0));
      }

      return var1;
   }

   public static long b(float var0) {
      return (long)Math.ceil((double)(360.0F / var0));
   }

   public static boolean b_isSatisfy(int var0, float var1) {
      k_FloatConstraint var2 = (k_FloatConstraint) d_floatRanges.get(var0);
      boolean var3;
      if (var2 != null) {
         var3 = var2.b_isSatisfy(var1);
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
