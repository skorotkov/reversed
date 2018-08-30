package fi.polar.polarmathsmart.sleep.sleepschedulesandfragmentation;

public class SleepEvaluationResult {
   private double continuityIndex;
   private double continuityIndexClass;
   private double duration;
   private double efficiency;
   private int longInterruptionCounts;
   private double longInterruptionDuration;
   private int oneNightFeedback;
   private int shortInterruptionCounts;
   private double shortInterruptionDuration;
   private double sleepSpan;
   private int totalInterruptionCounts;
   private double totalInterruptionDuration;

   public SleepEvaluationResult() {
   }

   public SleepEvaluationResult(double var1, double var3, double var5, double var7, double var9, double var11, int var13, double var14, int var16, double var17, int var19, int var20) {
      this.duration = var1;
      this.sleepSpan = var3;
      this.efficiency = var5;
      this.continuityIndex = var7;
      this.continuityIndexClass = var9;
      this.totalInterruptionDuration = var11;
      this.totalInterruptionCounts = var13;
      this.shortInterruptionDuration = var14;
      this.shortInterruptionCounts = var16;
      this.longInterruptionDuration = var17;
      this.longInterruptionCounts = var19;
      this.oneNightFeedback = var20;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      boolean var3 = false;
      boolean var4;
      if (this == var1) {
         var4 = true;
      } else {
         var4 = var3;
         if (var1 instanceof SleepEvaluationResult) {
            SleepEvaluationResult var5 = (SleepEvaluationResult)var1;
            var4 = var3;
            if (Double.compare(var5.duration, this.duration) == 0) {
               var4 = var3;
               if (Double.compare(var5.sleepSpan, this.sleepSpan) == 0) {
                  var4 = var3;
                  if (Double.compare(var5.efficiency, this.efficiency) == 0) {
                     var4 = var3;
                     if (Double.compare(var5.continuityIndex, this.continuityIndex) == 0) {
                        var4 = var3;
                        if (Double.compare(var5.continuityIndexClass, this.continuityIndexClass) == 0) {
                           var4 = var3;
                           if (Double.compare(var5.totalInterruptionDuration, this.totalInterruptionDuration) == 0) {
                              var4 = var3;
                              if (this.totalInterruptionCounts == var5.totalInterruptionCounts) {
                                 var4 = var3;
                                 if (Double.compare(var5.shortInterruptionDuration, this.shortInterruptionDuration) == 0) {
                                    var4 = var3;
                                    if (this.shortInterruptionCounts == var5.shortInterruptionCounts) {
                                       var4 = var3;
                                       if (Double.compare(var5.longInterruptionDuration, this.longInterruptionDuration) == 0) {
                                          var4 = var3;
                                          if (this.longInterruptionCounts == var5.longInterruptionCounts) {
                                             if (this.oneNightFeedback == var5.oneNightFeedback) {
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
                  }
               }
            }
         }
      }

      return var4;
   }

   public double getContinuityIndex() {
      return this.continuityIndex;
   }

   public double getContinuityIndexClass() {
      return this.continuityIndexClass;
   }

   public double getDuration() {
      return this.duration;
   }

   public double getEfficiency() {
      return this.efficiency;
   }

   public int getLongInterruptionCounts() {
      return this.longInterruptionCounts;
   }

   public double getLongInterruptionDuration() {
      return this.longInterruptionDuration;
   }

   public int getOneNightFeedback() {
      return this.oneNightFeedback;
   }

   public int getOneNightFeedback(int var1) {
      if (var1 < 0 && var1 > 4) {
         throw new IndexOutOfBoundsException("index range must be between 0 and 4.");
      } else {
         return (int)Math.floor((double)((int)((double)this.oneNightFeedback % Math.pow(10.0D, (double)(5 - var1)))) / Math.pow(10.0D, (double)(5 - var1 - 1)));
      }
   }

   public int getShortInterruptionCounts() {
      return this.shortInterruptionCounts;
   }

   public double getShortInterruptionDuration() {
      return this.shortInterruptionDuration;
   }

   public int getShortOneNightFeedback() {
      return (int)Math.floor((double)this.oneNightFeedback / Math.pow(10.0D, 2.0D));
   }

   public double getSleepSpan() {
      return this.sleepSpan;
   }

   public int getTotalInterruptionCounts() {
      return this.totalInterruptionCounts;
   }

   public double getTotalInterruptionDuration() {
      return this.totalInterruptionDuration;
   }

   public int hashCode() {
      long var1 = Double.doubleToLongBits(this.duration);
      int var3 = (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.sleepSpan);
      int var4 = (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.efficiency);
      int var5 = (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.continuityIndex);
      int var6 = (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.continuityIndexClass);
      int var7 = (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.totalInterruptionDuration);
      int var8 = (int)(var1 ^ var1 >>> 32);
      int var9 = this.totalInterruptionCounts;
      var1 = Double.doubleToLongBits(this.shortInterruptionDuration);
      int var10 = (int)(var1 ^ var1 >>> 32);
      int var11 = this.shortInterruptionCounts;
      var1 = Double.doubleToLongBits(this.longInterruptionDuration);
      return ((((((((((var3 * 31 + var4) * 31 + var5) * 31 + var6) * 31 + var7) * 31 + var8) * 31 + var9) * 31 + var10) * 31 + var11) * 31 + (int)(var1 ^ var1 >>> 32)) * 31 + this.longInterruptionCounts) * 31 + this.oneNightFeedback;
   }

   public void setContinuityIndex(double var1) {
      this.continuityIndex = var1;
   }

   public void setContinuityIndexClass(double var1) {
      this.continuityIndexClass = var1;
   }

   public void setDuration(double var1) {
      this.duration = var1;
   }

   public void setEfficiency(double var1) {
      this.efficiency = var1;
   }

   public void setLongInterruptionCounts(int var1) {
      this.longInterruptionCounts = var1;
   }

   public void setLongInterruptionDuration(double var1) {
      this.longInterruptionDuration = var1;
   }

   public void setOneNightFeedback(int var1) {
      this.oneNightFeedback = var1;
   }

   public void setShortInterruptionCounts(int var1) {
      this.shortInterruptionCounts = var1;
   }

   public void setShortInterruptionDuration(double var1) {
      this.shortInterruptionDuration = var1;
   }

   public void setSleepSpan(double var1) {
      this.sleepSpan = var1;
   }

   public void setTotalInterruptionCounts(int var1) {
      this.totalInterruptionCounts = var1;
   }

   public void setTotalInterruptionDuration(double var1) {
      this.totalInterruptionDuration = var1;
   }

   public String toString() {
      return "SleepEvaluationResult{duration=" + this.duration + ", sleepSpan=" + this.sleepSpan + ", efficiency=" + this.efficiency + ", continuityIndex=" + this.continuityIndex + ", continuityIndexClass=" + this.continuityIndexClass + ", totalInterruptionDuration=" + this.totalInterruptionDuration + ", totalInterruptionCounts=" + this.totalInterruptionCounts + ", shortInterruptionDuration=" + this.shortInterruptionDuration + ", shortInterruptionCounts=" + this.shortInterruptionCounts + ", longInterruptionDuration=" + this.longInterruptionDuration + ", longInterruptionCounts=" + this.longInterruptionCounts + ", oneNightFeedback=" + String.format("%05d", this.oneNightFeedback) + '}';
   }
}
