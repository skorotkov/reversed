package fi.polar.polarmathsmart.types.zones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class ValuesInZones {
   public static final int DEFAULT_ZONES_AMOUNT = 5;
   protected List values;

   public ValuesInZones(int var1) {
      this.values = new ArrayList(var1);

      for(var1 = 0; var1 < 5; ++var1) {
         this.values.add(this.initialZeroElement());
      }

   }

   private boolean listsEqual(List var1, List var2) {
      boolean var3;
      if (var1.size() != var2.size()) {
         var3 = false;
      } else {
         Iterator var4 = var1.iterator();
         Iterator var5 = var2.iterator();

         while(true) {
            if (!var4.hasNext()) {
               var3 = true;
               break;
            }

            if (!this.areTwoValuesEqual((Number)var4.next(), (Number)var5.next())) {
               var3 = false;
               break;
            }
         }
      }

      return var3;
   }

   protected abstract Number add(Number var1, Number var2);

   public abstract void addValue(int var1, Number var2);

   protected abstract boolean areTwoValuesEqual(Number var1, Number var2);

   public Number countTotal() {
      Number var1 = this.initialZeroElement();

      for(Iterator var2 = this.values.iterator(); var2.hasNext(); var1 = this.add(var1, (Number)var2.next())) {
      }

      return var1;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            ValuesInZones var3 = (ValuesInZones)var1;
            if (this.values != null) {
               if (this.listsEqual(this.values, var3.values)) {
                  return var2;
               }
            } else if (var3.values == null) {
               return var2;
            }

            var2 = false;
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   public int getAmountOfZones() {
      return this.values.size();
   }

   public Number getValue(int var1) {
      return (Number)this.values.get(var1);
   }

   public List getValues() {
      return this.values;
   }

   public int hashCode() {
      int var1;
      if (this.values != null) {
         var1 = this.values.hashCode();
      } else {
         var1 = 0;
      }

      return var1;
   }

   protected abstract Number initialZeroElement();

   public void setValue(int var1, Number var2) {
      this.values.set(var1, var2);
   }

   public void setValues(List var1) {
      this.values = var1;
   }

   public String toString() {
      return "ValuesInZones{values=" + this.values + '}';
   }
}
