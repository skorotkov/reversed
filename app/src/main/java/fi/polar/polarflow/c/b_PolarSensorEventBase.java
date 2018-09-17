package fi.polar.polarflow.c;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import java.util.ArrayList;
import java.util.List;

public class b_PolarSensorEventBase {
   public final float[] a_values;
   public final long b_timestamp;
   public final Sensor c_sensor;
   public final int d_accuracy;

   public b_PolarSensorEventBase(SensorEvent var1) {
      if (var1.values != null) {
         this.a_values = (float[])var1.values.clone();
      } else {
         this.a_values = null;
      }

      this.b_timestamp = var1.timestamp;
      this.c_sensor = var1.sensor;
      this.d_accuracy = var1.accuracy;
   }

   public b_PolarSensorEventBase(b_PolarSensorEventBase var1) {
      if (var1.a_values != null) {
         this.a_values = (float[])var1.a_values.clone();
      } else {
         this.a_values = null;
      }

      this.b_timestamp = var1.b_timestamp;
      this.c_sensor = var1.c_sensor;
      this.d_accuracy = var1.d_accuracy;
   }

   public b_PolarSensorEventBase(float[] var1_values, long var2_timestamp, int var4_accuracy) {
      this.a_values = var1_values;
      this.b_timestamp = var2_timestamp;
      this.c_sensor = null;
      this.d_accuracy = var4_accuracy;
   }

   public static b_PolarSensorEventBase a(long var0, List var2) {
      int var3 = 0;
      int var4 = var2.size();
      long var5 = Long.MAX_VALUE;

      int var7;
      for(var7 = 0; var3 < var4; ++var3) {
         long var8 = ((b_PolarSensorEventBase)var2.get(var3)).b_timestamp;
         if (var8 <= var0) {
            var8 = Math.abs(var8 - var0);
            if (var8 < var5) {
               var7 = var3;
               var5 = var8;
            }
         }
      }

      return (b_PolarSensorEventBase)var2.get(var7);
   }

   public static b_PolarSensorEventBase a(long var0, List var2, long var3) {
      long var5 = var0 - var3 - 1L;
      if (var5 < 0L) {
         var5 = 0L;
      }

      int var7 = var2.size();
      long var8 = Long.MAX_VALUE;
      int var10 = -1;

      long var14;
      for(int var11 = 0; var11 < var7; var8 = var14) {
         label35: {
            long var12 = ((b_PolarSensorEventBase)var2.get(var11)).b_timestamp;
            if (var12 >= var5) {
               if (var12 > var0 + var3) {
                  var14 = var8;
                  break label35;
               }

               var14 = Math.abs(var12 - var0);
               if (var14 < var8) {
                  var10 = var11;
                  break label35;
               }

               if (var14 == var8 && var12 < ((b_PolarSensorEventBase)var2.get(var10)).b_timestamp) {
                  var10 = var11;
                  break label35;
               }
            }

            var14 = var8;
         }

         ++var11;
      }

      b_PolarSensorEventBase var16;
      if (var10 == -1) {
         var16 = null;
      } else {
         var16 = (b_PolarSensorEventBase)var2.get(var10);
      }

      return var16;
   }

   public static List a(List var0, long var1, long var3) {
      ArrayList var5 = new ArrayList();

      while(var0.size() > 0 && ((b_PolarSensorEventBase)var0.get(0)).b_timestamp + var3 < var1) {
         var5.add(var0.remove(0));
      }

      return var5;
   }
}
