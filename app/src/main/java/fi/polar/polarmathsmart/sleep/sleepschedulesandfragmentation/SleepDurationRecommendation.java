package fi.polar.polarmathsmart.sleep.sleepschedulesandfragmentation;

import fi.polar.polarmathsmart.common.AcceptableDeltaAwareDoubleComparator;
import java.math.BigDecimal;

public class SleepDurationRecommendation {
   private double defaultRecommendation;
   private int maxAllowed;
   private int maxAppropriate;
   private int maxRecommended;
   private int minAllowed;
   private int minAppropriate;
   private int minRecommended;

   public SleepDurationRecommendation() {
   }

   public SleepDurationRecommendation(int var1, int var2, int var3, double var4, int var6, int var7, int var8) {
      this.minAllowed = var1;
      this.minAppropriate = var2;
      this.minRecommended = var3;
      this.defaultRecommendation = var4;
      this.maxAllowed = var6;
      this.maxAppropriate = var7;
      this.maxRecommended = var8;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      boolean var3 = false;
      boolean var4;
      if (this == var1) {
         var4 = true;
      } else {
         var4 = var3;
         if (var1 instanceof SleepDurationRecommendation) {
            SleepDurationRecommendation var5 = (SleepDurationRecommendation)var1;
            var4 = var3;
            if (this.minAllowed == var5.minAllowed) {
               var4 = var3;
               if (this.minAppropriate == var5.minAppropriate) {
                  var4 = var3;
                  if (this.minRecommended == var5.minRecommended) {
                     var4 = var3;
                     if (AcceptableDeltaAwareDoubleComparator.INSTANCE.compareDoubles(var5.defaultRecommendation, this.defaultRecommendation, 0.001D) == 0) {
                        var4 = var3;
                        if (this.maxAllowed == var5.maxAllowed) {
                           var4 = var3;
                           if (this.maxAppropriate == var5.maxAppropriate) {
                              if (this.maxRecommended == var5.maxRecommended) {
                                 var4 = var2;
                              } else {
                                 var4 = false;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var4;
   }

   public double getDefaultRecommendation() {
      return this.defaultRecommendation;
   }

   public int getMaxAllowed() {
      return this.maxAllowed;
   }

   public int getMaxAppropriate() {
      return this.maxAppropriate;
   }

   public int getMaxRecommended() {
      return this.maxRecommended;
   }

   public int getMinAllowed() {
      return this.minAllowed;
   }

   public int getMinAppropriate() {
      return this.minAppropriate;
   }

   public int getMinRecommended() {
      return this.minRecommended;
   }

   public int hashCode() {
      int var1 = this.minAllowed;
      int var2 = this.minAppropriate;
      int var3 = this.minRecommended;
      long var4 = Double.doubleToLongBits((new BigDecimal(this.defaultRecommendation)).setScale(2, 4).doubleValue());
      return (((((var1 * 31 + var2) * 31 + var3) * 31 + (int)(var4 ^ var4 >>> 32)) * 31 + this.maxAllowed) * 31 + this.maxAppropriate) * 31 + this.maxRecommended;
   }

   public void setDefaultRecommendation(double var1) {
      this.defaultRecommendation = var1;
   }

   public void setMaxAllowed(int var1) {
      this.maxAllowed = var1;
   }

   public void setMaxAppropriate(int var1) {
      this.maxAppropriate = var1;
   }

   public void setMaxRecommended(int var1) {
      this.maxRecommended = var1;
   }

   public void setMinAllowed(int var1) {
      this.minAllowed = var1;
   }

   public void setMinAppropriate(int var1) {
      this.minAppropriate = var1;
   }

   public void setMinRecommended(int var1) {
      this.minRecommended = var1;
   }

   public String toString() {
      return "SleepDurationRecommendation{minAllowed=" + this.minAllowed + ", minAppropriate=" + this.minAppropriate + ", minRecommended=" + this.minRecommended + ", defaultRecommendation=" + this.defaultRecommendation + ", maxAllowed=" + this.maxAllowed + ", maxAppropriate=" + this.maxAppropriate + ", maxRecommended=" + this.maxRecommended + '}';
   }
}
