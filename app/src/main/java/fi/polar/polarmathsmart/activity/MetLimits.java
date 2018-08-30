package fi.polar.polarmathsmart.activity;

public class MetLimits {
   private Double limitLight = null;
   private Double limitModerate = null;
   private Double limitSedentary = null;
   private Double limitVigorous = null;

   public MetLimits() {
   }

   public MetLimits(Double var1, Double var2, Double var3, Double var4) {
      this.limitVigorous = var1;
      this.limitModerate = var2;
      this.limitLight = var3;
      this.limitSedentary = var4;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && var1.getClass() == this.getClass()) {
            MetLimits var3 = (MetLimits)var1;
            if (!var3.getLimitVigorous().equals(this.getLimitVigorous())) {
               var2 = false;
            } else if (!var3.getLimitModerate().equals(this.getLimitModerate())) {
               var2 = false;
            } else if (!var3.getLimitLight().equals(this.getLimitLight())) {
               var2 = false;
            } else if (!var3.getLimitSedentary().equals(this.getLimitSedentary())) {
               var2 = false;
            }
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   public Double getLimitLight() {
      return this.limitLight;
   }

   public Double getLimitModerate() {
      return this.limitModerate;
   }

   public Double getLimitSedentary() {
      return this.limitSedentary;
   }

   public Double getLimitVigorous() {
      return this.limitVigorous;
   }

   public int hashCode() {
      double var1 = 0.0D;
      if (this.getLimitVigorous() != null) {
         var1 = 0.0D + this.getLimitVigorous();
      }

      double var3 = var1;
      if (this.getLimitModerate() != null) {
         var3 = var1 + this.getLimitModerate();
      }

      var1 = var3;
      if (this.getLimitLight() != null) {
         var1 = var3 + this.getLimitLight();
      }

      var3 = var1;
      if (this.getLimitSedentary() != null) {
         var3 = var1 + this.getLimitSedentary();
      }

      long var5 = Double.doubleToLongBits(var3);
      return (int)(var5 ^ var5 >>> 32);
   }

   public void setLimitLight(Double var1) {
      this.limitLight = var1;
   }

   public void setLimitModerate(Double var1) {
      this.limitModerate = var1;
   }

   public void setLimitSedentary(Double var1) {
      this.limitSedentary = var1;
   }

   public void setLimitVigorous(Double var1) {
      this.limitVigorous = var1;
   }
}
