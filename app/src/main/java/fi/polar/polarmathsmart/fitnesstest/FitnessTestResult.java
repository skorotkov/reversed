package fi.polar.polarmathsmart.fitnesstest;

public class FitnessTestResult {
   private String description;
   private int fitnessClass;
   private int vo2Max;

   public FitnessTestResult(int var1, int var2, String var3) {
      this.vo2Max = var1;
      this.fitnessClass = var2;
      this.description = var3;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      boolean var3 = false;
      boolean var4;
      if (this == var1) {
         var4 = true;
      } else {
         var4 = var3;
         if (var1 instanceof FitnessTestResult) {
            FitnessTestResult var5 = (FitnessTestResult)var1;
            var4 = var3;
            if (this.vo2Max == var5.vo2Max) {
               var4 = var3;
               if (this.fitnessClass == var5.fitnessClass) {
                  if (this.description != null) {
                     var4 = this.description.equals(var5.description);
                  } else {
                     var4 = var2;
                     if (var5.description != null) {
                        var4 = false;
                     }
                  }
               }
            }
         }
      }

      return var4;
   }

   public String getDescription() {
      return this.description;
   }

   public int getFitnessClass() {
      return this.fitnessClass;
   }

   public int getVo2Max() {
      return this.vo2Max;
   }

   public int hashCode() {
      int var1 = this.vo2Max;
      int var2 = this.fitnessClass;
      int var3;
      if (this.description != null) {
         var3 = this.description.hashCode();
      } else {
         var3 = 0;
      }

      return var3 + (var1 * 31 + var2) * 31;
   }

   public void setDescription(String var1) {
      this.description = var1;
   }

   public void setFitnessClass(int var1) {
      this.fitnessClass = var1;
   }

   public void setVo2Max(int var1) {
      this.vo2Max = var1;
   }

   public String toString() {
      return "FitnessTestResult{vo2Max=" + this.vo2Max + ", fitnessClass=" + this.fitnessClass + ", description='" + this.description + '\'' + '}';
   }
}
