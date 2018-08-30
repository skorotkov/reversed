package fi.polar.polarflow.c;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import java.util.ArrayList;
import java.util.List;

public class b {
   public final float[] a;
   public final long b;
   public final Sensor c;
   public final int d;

   public b(SensorEvent var1) {
      if (var1.values != null) {
         this.a = (float[])var1.values.clone();
      } else {
         this.a = null;
      }

      this.b = var1.timestamp;
      this.c = var1.sensor;
      this.d = var1.accuracy;
   }

   public b(b var1) {
      if (var1.a != null) {
         this.a = (float[])var1.a.clone();
      } else {
         this.a = null;
      }

      this.b = var1.b;
      this.c = var1.c;
      this.d = var1.d;
   }

   public b(float[] var1, long var2, int var4) {
      this.a = var1;
      this.b = var2;
      this.c = null;
      this.d = var4;
   }

   public static b a(long var0, List var2) {
      int var3 = 0;
      int var4 = var2.size();
      long var5 = Long.MAX_VALUE;

      int var7;
      for(var7 = 0; var3 < var4; ++var3) {
         long var8 = ((b)var2.get(var3)).b;
         if (var8 <= var0) {
            var8 = Math.abs(var8 - var0);
            if (var8 < var5) {
               var7 = var3;
               var5 = var8;
            }
         }
      }

      return (b)var2.get(var7);
   }

   public static b a(long var0, List var2, long var3) {
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
            long var12 = ((b)var2.get(var11)).b;
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

               if (var14 == var8 && var12 < ((b)var2.get(var10)).b) {
                  var10 = var11;
                  break label35;
               }
            }

            var14 = var8;
         }

         ++var11;
      }

      b var16;
      if (var10 == -1) {
         var16 = null;
      } else {
         var16 = (b)var2.get(var10);
      }

      return var16;
   }

   public static List a(List var0, long var1, long var3) {
      ArrayList var5 = new ArrayList();

      while(var0.size() > 0 && ((b)var0.get(0)).b + var3 < var1) {
         var5.add(var0.remove(0));
      }

      return var5;
   }
}
