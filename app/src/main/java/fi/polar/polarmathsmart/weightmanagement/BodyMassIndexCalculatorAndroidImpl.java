package fi.polar.polarmathsmart.weightmanagement;

public class BodyMassIndexCalculatorAndroidImpl implements BodyMassIndexCalculator {
   private native double native_calculateBodyMassIndex(double var1, double var3);

   public double calculateBodyMassIndex(double var1, double var3) {
      return this.native_calculateBodyMassIndex(var1, var3);
   }
}
