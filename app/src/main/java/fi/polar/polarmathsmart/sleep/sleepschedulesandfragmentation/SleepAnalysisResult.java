package fi.polar.polarmathsmart.sleep.sleepschedulesandfragmentation;

import fi.polar.polarmathsmart.common.AcceptableDeltaAwareDoubleComparator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SleepAnalysisResult {
   private List interruptionSegStartEndTimeList;
   private double sleepEnd;
   private double sleepStart;
   private int totalInterruptionCounts;
   private double totalInterruptionDuration;

   public SleepAnalysisResult() {
      this.interruptionSegStartEndTimeList = new ArrayList();
   }

   public SleepAnalysisResult(double var1, double var3, double var5, int var7, List var8) {
      this.sleepStart = var1;
      this.sleepEnd = var3;
      this.totalInterruptionDuration = var5;
      this.totalInterruptionCounts = var7;
      this.interruptionSegStartEndTimeList = var8;
   }

   private boolean equals(List var1, List var2) {
      boolean var3;
      if (var1 != null && var2 != null) {
         var3 = var1.equals(var2);
      } else if (var1 == null && var2 == null) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   private String toStr() {
      StringBuilder var1 = new StringBuilder("[");
      Iterator var2 = this.interruptionSegStartEndTimeList.iterator();

      while(var2.hasNext()) {
         var1.append((SleepPhaseInterval)var2.next());
      }

      var1.append("]");
      return var1.toString();
   }

   public boolean equals(Object var1) {
      boolean var2 = false;
      boolean var3;
      if (this == var1) {
         var3 = true;
      } else {
         var3 = var2;
         if (var1 instanceof SleepAnalysisResult) {
            SleepAnalysisResult var4 = (SleepAnalysisResult)var1;
            var3 = var2;
            if (AcceptableDeltaAwareDoubleComparator.INSTANCE.compareDoubles(var4.sleepStart, this.sleepStart, 0.001D) == 0) {
               var3 = var2;
               if (AcceptableDeltaAwareDoubleComparator.INSTANCE.compareDoubles(var4.sleepEnd, this.sleepEnd, 0.001D) == 0) {
                  var3 = var2;
                  if (AcceptableDeltaAwareDoubleComparator.INSTANCE.compareDoubles(var4.totalInterruptionDuration, this.totalInterruptionDuration, 0.001D) == 0) {
                     var3 = var2;
                     if (var4.totalInterruptionCounts == this.totalInterruptionCounts) {
                        var3 = this.equals(var4.interruptionSegStartEndTimeList, this.interruptionSegStartEndTimeList);
                     }
                  }
               }
            }
         }
      }

      return var3;
   }

   public List getInterruptionSegStartEndTimeList() {
      return this.interruptionSegStartEndTimeList;
   }

   public double getSleepEnd() {
      return this.sleepEnd;
   }

   public double getSleepStart() {
      return this.sleepStart;
   }

   public int getTotalInterruptionCounts() {
      return this.totalInterruptionCounts;
   }

   public double getTotalInterruptionDuration() {
      return this.totalInterruptionDuration;
   }

   public int hashCode() {
      long var1 = Double.doubleToLongBits((new BigDecimal(this.sleepStart)).setScale(2, 4).doubleValue());
      int var3 = (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits((new BigDecimal(this.sleepEnd)).setScale(2, 4).doubleValue());
      int var4 = (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits((new BigDecimal(this.totalInterruptionDuration)).setScale(2, 4).doubleValue());
      return (((var3 * 31 + var4) * 31 + (int)(var1 ^ var1 >>> 32)) * 31 + this.totalInterruptionCounts) * 31 + this.interruptionSegStartEndTimeList.hashCode();
   }

   public void setInterruptionSegStartEndTimeList(List var1) {
      this.interruptionSegStartEndTimeList = var1;
   }

   public void setSleepEnd(double var1) {
      this.sleepEnd = var1;
   }

   public void setSleepStart(double var1) {
      this.sleepStart = var1;
   }

   public void setTotalInterruptionCounts(int var1) {
      this.totalInterruptionCounts = var1;
   }

   public void setTotalInterruptionDuration(double var1) {
      this.totalInterruptionDuration = var1;
   }

   public String toString() {
      return "SleepAnalysisResult{sleepStart=" + this.sleepStart + ", sleepEnd=" + this.sleepEnd + ", totalInterruptionDuration=" + this.totalInterruptionDuration + ", totalInterruptionCounts=" + this.totalInterruptionCounts + ", interruptionSegStartEndTimeList=" + this.toStr() + '}';
   }
}
