package fi.polar.polarflow.calculators;

import fi.polar.polarmathsmart.speed.AverageSpeedCalculator;
import fi.polar.polarmathsmart.speed.AverageSpeedCalculatorAndroidImpl;

public class as extends at {
   private final AverageSpeedCalculator e = new AverageSpeedCalculatorAndroidImpl();

   public as() {
      super(0.0F, 399.0F);
   }

   public float a(long var1, double var3) {
      float var5 = Math.max(0.0F, this.i());
      return fi.polar.polarflow.a.a.a(2, this.e.calculateAverageSpeed((double)var5, var1, Math.max(0.0D, var3), this.h() - (double)var5, Math.max(0, this.f() - 1)).getSpeedAverage().floatValue());
   }

   public float b(long var1, double var3) {
      return fi.polar.polarflow.a.a.a(2, (float)this.e.calculateFinalAverageSpeed(var1, Math.max(0.0D, var3)));
   }

   public float c(long var1, double var3) {
      return fi.polar.polarflow.a.a.a(2, Math.max(this.e(), this.b(var1, var3)));
   }
}
