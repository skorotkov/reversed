package fi.polar.polarflow.calculators;

import java.util.List;

public class at_RangeStatistics {
   float a_min = Float.MAX_VALUE;
   float b_max = -3.4028235E38F;
   double c_sumOfSamples = 0.0D;
   int d_numOfSamples = 0;
   private float e_lowBound = -3.4028235E38F;
   private float f_highBound = Float.MAX_VALUE;
   private float g_mostResentSample = -1.0F;
   private final List h_buffer = new au_AltitudeBuffer(this);

   public at_RangeStatistics() {
   }

   public at_RangeStatistics(float var1, float var2) {
      this.e_lowBound = var1;
      this.f_highBound = var2;
   }

   public float a(int var1) {
      float var9;
      if (var1 > 0 && var1 <= this.h_buffer.size()) {
         int var2 = this.h_buffer.size();
         double var3 = 0.0D;
         byte var5 = 0;
         var2 -= var1;
         var1 = var5;

         double var7;
         for(int var10 = var2; var10 < this.h_buffer.size(); var3 = var7) {
            Float var6 = (Float)this.h_buffer.get(var10);
            var2 = var1;
            var7 = var3;
            if (var6 != null) {
               var7 = var3 + (double)var6;
               var2 = var1 + 1;
            }

            ++var10;
            var1 = var2;
         }

         if (var1 > 0) {
            var9 = (float)(var3 / (double)var1);
            return var9;
         }
      }

      var9 = 0.0F;
      return var9;
   }

   public void a_clear() {
      this.c_sumOfSamples = 0.0D;
      this.d_numOfSamples = 0;
      this.a_min = Float.MAX_VALUE;
      this.b_max = -3.4028235E38F;
      this.g_mostResentSample = -1.0F;
      this.h_buffer.clear();
   }

   public void a_addSample(float var1) {
      float var2 = var1;
      if (var1 < this.e_lowBound) {
         var2 = this.e_lowBound;
      }

      var1 = var2;
      if (var2 > this.f_highBound) {
         var1 = this.f_highBound;
      }

      this.h_buffer.add(var1);
      if (var1 < this.a_min) {
         this.a_min = var1;
      }

      if (var1 > this.b_max) {
         this.b_max = var1;
      }

      this.c_sumOfSamples += (double)var1;
      ++this.d_numOfSamples;
      this.g_mostResentSample = var1;
   }

   public void b_addEmptySample() {
      this.h_buffer.add((Object)null);
      this.g_mostResentSample = -1.0F;
   }

   public void b_setMostRecentSample(float var1) {
      this.g_mostResentSample = var1;
   }

   public float c_getAverage() {
      float var1;
      if (this.d_numOfSamples == 0) {
         var1 = 0.0F;
      } else {
         var1 = (float)(this.c_sumOfSamples / (double)this.d_numOfSamples);
      }

      return var1;
   }

   public float d_getMin() {
      float var1;
      if (this.a_min == Float.MAX_VALUE) {
         var1 = 0.0F;
      } else {
         var1 = this.a_min;
      }

      return var1;
   }

   public float e_getMax() {
      float var1;
      if (this.b_max == -3.4028235E38F) {
         var1 = 0.0F;
      } else {
         var1 = this.b_max;
      }

      return var1;
   }

   public int f_getNumOfSamples() {
      return this.d_numOfSamples;
   }

   public boolean g_areAnySamplesAdded() {
      boolean var1;
      if (this.f_getNumOfSamples() > 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public double h_getSumOfSamples() {
      return this.c_sumOfSamples;
   }

   public float i_getMostResentSample() {
      return this.g_mostResentSample;
   }
}
