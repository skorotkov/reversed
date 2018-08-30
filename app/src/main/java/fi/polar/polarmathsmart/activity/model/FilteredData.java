package fi.polar.polarmathsmart.activity.model;

import fi.polar.polarmathsmart.common.AcceptableDeltaAwareDoubleComparator;
import fi.polar.polarmathsmart.common.AlgorithmConstants$AcceptableDeltas;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FilteredData {
   private List filteredData;
   private List filteredTime;

   public FilteredData() {
      this.filteredTime = new ArrayList();
      this.filteredData = new ArrayList();
   }

   public FilteredData(List var1, List var2) {
      this.filteredTime = var1;
      this.filteredData = var2;
   }

   public void add(int var1, double var2) {
      this.filteredTime.add(var1);
      this.filteredData.add(var2);
   }

   public boolean equals(Object var1) {
      boolean var2 = false;
      boolean var3;
      if (!(var1 instanceof FilteredData)) {
         var3 = var2;
      } else if (this == var1) {
         var3 = true;
      } else {
         FilteredData var5 = (FilteredData)var1;
         if (this.filteredTime != null) {
            var3 = var2;
            if (!this.filteredTime.equals(var5.getFilteredTime())) {
               return var3;
            }
         } else if (var5.getFilteredTime() != null) {
            var3 = var2;
            return var3;
         }

         if (this.filteredData != null) {
            var3 = var2;
            if (var5.getFilteredData() == null) {
               return var3;
            }

            for(int var4 = 0; var4 < this.filteredData.size(); ++var4) {
               var3 = var2;
               if (AcceptableDeltaAwareDoubleComparator.INSTANCE.compareDoubles((Double)this.filteredData.get(var4), (Double)var5.getFilteredData().get(var4), AlgorithmConstants$AcceptableDeltas.ACTIVITY_MET) != 0) {
                  return var3;
               }
            }
         } else {
            var3 = var2;
            if (var5.getFilteredData() != null) {
               return var3;
            }
         }

         var3 = true;
      }

      return var3;
   }

   public List getFilteredData() {
      return this.filteredData;
   }

   public List getFilteredTime() {
      return this.filteredTime;
   }

   public int hashCode() {
      int var1;
      if (this.filteredTime != null) {
         var1 = this.filteredTime.hashCode();
      } else {
         var1 = 0;
      }

      int var2 = var1;
      if (this.filteredData != null) {
         Iterator var3 = this.filteredData.iterator();

         Double var4;
         BigDecimal var5;
         double var6;
         for(var4 = 0.0D; var3.hasNext(); var4 = var5.setScale(2, RoundingMode.HALF_UP).doubleValue() + var6) {
            var5 = new BigDecimal((Double)var3.next());
            var6 = var4;
         }

         var2 = var4.hashCode() + var1 * 31;
      }

      return var2;
   }
}
