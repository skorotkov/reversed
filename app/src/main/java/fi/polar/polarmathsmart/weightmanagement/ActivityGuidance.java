package fi.polar.polarmathsmart.weightmanagement;

import fi.polar.polarmathsmart.common.AcceptableDeltaAwareDoubleComparator;

public class ActivityGuidance {
   private short amountOfLightActivity;
   private short amountOfModerateActivity;
   private short amountOfVigorousActivity;
   private Double percentageCompleted;

   public ActivityGuidance() {
   }

   public ActivityGuidance(short var1, short var2, short var3, Double var4) {
      this.amountOfLightActivity = (short)var1;
      this.amountOfModerateActivity = (short)var2;
      this.amountOfVigorousActivity = (short)var3;
      this.percentageCompleted = var4;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            ActivityGuidance var3 = (ActivityGuidance)var1;
            if (this.amountOfLightActivity != var3.amountOfLightActivity) {
               var2 = false;
            } else if (this.amountOfModerateActivity != var3.amountOfModerateActivity) {
               var2 = false;
            } else if (this.amountOfVigorousActivity != var3.amountOfVigorousActivity) {
               var2 = false;
            } else {
               if (this.percentageCompleted != null) {
                  if (AcceptableDeltaAwareDoubleComparator.INSTANCE.compareDoubles(this.percentageCompleted, var3.percentageCompleted, 0.001D) == 0) {
                     return var2;
                  }
               } else if (var3.percentageCompleted == null) {
                  return var2;
               }

               var2 = false;
            }
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   public short getAmountOfLightActivity() {
      return this.amountOfLightActivity;
   }

   public short getAmountOfModerateActivity() {
      return this.amountOfModerateActivity;
   }

   public short getAmountOfVigorousActivity() {
      return this.amountOfVigorousActivity;
   }

   public Double getPercentageCompleted() {
      return this.percentageCompleted;
   }

   public int hashCode() {
      short var1 = this.amountOfLightActivity;
      short var2 = this.amountOfModerateActivity;
      short var3 = this.amountOfVigorousActivity;
      int var4;
      if (this.percentageCompleted != null) {
         var4 = this.percentageCompleted.hashCode();
      } else {
         var4 = 0;
      }

      return var4 + ((var1 * 31 + var2) * 31 + var3) * 31;
   }

   public void setAmountOfLightActivity(short var1) {
      this.amountOfLightActivity = (short)var1;
   }

   public void setAmountOfModerateActivity(short var1) {
      this.amountOfModerateActivity = (short)var1;
   }

   public void setAmountOfVigorousActivity(short var1) {
      this.amountOfVigorousActivity = (short)var1;
   }

   public void setPercentageCompleted(Double var1) {
      this.percentageCompleted = var1;
   }

   public String toString() {
      return "ActivityGuidance{amountOfLightActivity=" + this.amountOfLightActivity + ", amountOfModerateActivity=" + this.amountOfModerateActivity + ", amountOfVigorousActivity=" + this.amountOfVigorousActivity + ", percentageCompleted=" + this.percentageCompleted + '}';
   }
}
