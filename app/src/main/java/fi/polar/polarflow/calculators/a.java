package fi.polar.polarflow.calculators;

public class a extends at_RangeStatistics {
   public a() {
      super(-550.0F, 9000.0F);
      this.b_setMostRecentSample(Float.NaN);
   }

   public void a_clear() {
      super.a_clear();
      this.b_setMostRecentSample(Float.NaN);
   }

   public void b_addEmptySample() {
      super.b_addEmptySample();
      this.b_setMostRecentSample(Float.NaN);
   }

   public float c_getAverage() {
      float var1;
      if (this.d_numOfSamples == 0) {
         var1 = Float.NaN;
      } else {
         var1 = (float)(this.c_sumOfSamples / (double)this.d_numOfSamples);
      }

      return var1;
   }

   public float d_getMin() {
      float var1;
      if (this.a_min == Float.MAX_VALUE) {
         var1 = Float.NaN;
      } else {
         var1 = this.a_min;
      }

      return var1;
   }

   public float e_getMax() {
      float var1;
      if (this.b_max == -3.4028235E38F) {
         var1 = Float.NaN;
      } else {
         var1 = this.b_max;
      }

      return var1;
   }
}
