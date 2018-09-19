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

   public static b_PolarSensorEventBase a_searchClosestBeforeTimestamp(long var0, List var2_eventList) {
      int var3 = 0;
      int var4_listSize = var2_eventList.size();
      long var5_minValue = Long.MAX_VALUE;

      int var7_minIndex;
      for(var7_minIndex = 0; var3 < var4_listSize; ++var3) {
         long var8_currValue = ((b_PolarSensorEventBase)var2_eventList.get(var3)).b_timestamp;
         if (var8_currValue <= var0) {
            var8_currValue = Math.abs(var8_currValue - var0);
            if (var8_currValue < var5_minValue) {
               var7_minIndex = var3;
               var5_minValue = var8_currValue;
            }
         }
      }

      return (b_PolarSensorEventBase)var2_eventList.get(var7_minIndex);
   }

   public static b_PolarSensorEventBase a_searchClosestAroundTimestamp(long var0_timestampToSearch, List var2_eventsList, long var3_radius) {
      long var5 = var0_timestampToSearch - var3_radius - 1L;
      if (var5 < 0L) {
         var5 = 0L;
      }

      int var7 = var2_eventsList.size();
      long var8 = Long.MAX_VALUE;
      int var10 = -1;

      long var14;
      for(int var11 = 0; var11 < var7; var8 = var14) {
         label35: {
            long var12 = ((b_PolarSensorEventBase)var2_eventsList.get(var11)).b_timestamp;
            if (var12 >= var5) {
               if (var12 > var0_timestampToSearch + var3_radius) {
                  var14 = var8;
                  break label35;
               }

               var14 = Math.abs(var12 - var0_timestampToSearch);
               if (var14 < var8) {
                  var10 = var11;
                  break label35;
               }

               if (var14 == var8 && var12 < ((b_PolarSensorEventBase)var2_eventsList.get(var10)).b_timestamp) {
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
         var16 = (b_PolarSensorEventBase)var2_eventsList.get(var10);
      }

      return var16;
   }

   public static List a_removeAllBeforeTimestampWithMargin(List var0_eventsList, long var1_timestamp, long var3_margin) {
      ArrayList var5 = new ArrayList();

      while(var0_eventsList.size() > 0 && ((b_PolarSensorEventBase)var0_eventsList.get(0)).b_timestamp + var3_margin < var1_timestamp) {
         var5.add(var0_eventsList.remove(0));
      }

      return var5;
   }
}
