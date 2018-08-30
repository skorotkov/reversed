package fi.polar.polarmathsmart.calories;

public class HrCaloriesModelParameters {
   private Float b;
   private Float kk;

   HrCaloriesModelParameters(float var1, float var2) {
      this.kk = var1;
      this.b = var2;
   }

   public Float getB() {
      return this.b;
   }

   public Float getKk() {
      return this.kk;
   }
}
