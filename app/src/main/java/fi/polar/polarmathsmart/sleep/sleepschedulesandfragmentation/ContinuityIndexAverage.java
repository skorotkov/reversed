package fi.polar.polarmathsmart.sleep.sleepschedulesandfragmentation;

public class ContinuityIndexAverage {
   private double continuityIndexAverage;
   private double continuityIndexClassAverage;

   public ContinuityIndexAverage(double var1, double var3) {
      this.continuityIndexAverage = var1;
      this.continuityIndexClassAverage = var3;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (!(var1 instanceof ContinuityIndexAverage)) {
            var2 = false;
         } else {
            ContinuityIndexAverage var3 = (ContinuityIndexAverage)var1;
            if (Double.compare(var3.continuityIndexAverage, this.continuityIndexAverage) != 0) {
               var2 = false;
            } else if (Double.compare(var3.continuityIndexClassAverage, this.continuityIndexClassAverage) != 0) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public double getContinuityIndexAverage() {
      return this.continuityIndexAverage;
   }

   public double getContinuityIndexClassAverage() {
      return this.continuityIndexClassAverage;
   }

   public int hashCode() {
      long var1 = Double.doubleToLongBits(this.continuityIndexAverage);
      int var3 = (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.continuityIndexClassAverage);
      return var3 * 31 + (int)(var1 ^ var1 >>> 32);
   }
}
