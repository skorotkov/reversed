package fi.polar.polarmathsmart.activity;

import fi.polar.polarmathsmart.common.AcceptableDeltaAwareDoubleComparator;
import fi.polar.polarmathsmart.common.AlgorithmConstants$AcceptableDeltas;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

public class ActivityClassInfo {
   private List activityClasses;
   private List mets;

   public ActivityClassInfo() {
   }

   public ActivityClassInfo(List var1, List var2) {
      this.activityClasses = var1;
      this.mets = var2;
   }

   public boolean equals(Object var1) {
      boolean var2 = false;
      boolean var3;
      if (this == var1) {
         var3 = true;
      } else {
         var3 = var2;
         if (var1 != null) {
            var3 = var2;
            if (var1.getClass() == this.getClass()) {
               ActivityClassInfo var5 = (ActivityClassInfo)var1;
               var3 = var2;
               if (this.getActivityClasses().size() == var5.getActivityClasses().size()) {
                  var3 = var2;
                  if (this.getMets().size() == var5.getMets().size()) {
                     int var4 = 0;

                     while(true) {
                        if (var4 >= this.getActivityClasses().size()) {
                           for(var4 = 0; var4 < this.getMets().size(); ++var4) {
                              var3 = var2;
                              if (AcceptableDeltaAwareDoubleComparator.INSTANCE.compareDoubles((Double)this.getMets().get(var4), (Double)var5.getMets().get(var4), AlgorithmConstants$AcceptableDeltas.ACTIVITY_MET) != 0) {
                                 return var3;
                              }
                           }

                           var3 = true;
                           break;
                        }

                        var3 = var2;
                        if (!((Integer)this.getActivityClasses().get(var4)).equals(var5.getActivityClasses().get(var4))) {
                           break;
                        }

                        ++var4;
                     }
                  }
               }
            }
         }
      }

      return var3;
   }

   public List getActivityClasses() {
      return this.activityClasses;
   }

   public List getMets() {
      return this.mets;
   }

   public int hashCode() {
      Iterator var1 = this.getActivityClasses().iterator();

      Double var2;
      Integer var3;
      double var4;
      for(var2 = 0.0D; var1.hasNext(); var2 = (double)var3 + var4) {
         var3 = (Integer)var1.next();
         var4 = var2;
      }

      BigDecimal var8;
      for(var1 = this.getMets().iterator(); var1.hasNext(); var2 = var2 + var8.doubleValue()) {
         var8 = new BigDecimal((Double)var1.next());
         var8.setScale(2, 4);
      }

      long var6 = Double.doubleToLongBits(var2);
      return (int)(var6 ^ var6 >>> 32);
   }

   public void setActivityClasses(List var1) {
      this.activityClasses = var1;
   }

   public void setMets(List var1) {
      this.mets = var1;
   }
}
