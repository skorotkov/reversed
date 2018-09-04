package fi.polar.polarmathsmart.types.zones;

import fi.polar.polarmathsmart.common.AcceptableDeltaAwareDoubleComparator;

public class DoubleValuesInZones extends ValuesInZones {
   private final double acceptableDelta;

   public DoubleValuesInZones(int var1, double var2) {
      super(var1);
      this.acceptableDelta = var2;
   }

   protected Double add(Number var1, Number var2) {
      double var3 = 0.0D;
      double var5;
      if (var1 != null) {
         var5 = (Double)var1;
      } else {
         var5 = 0.0D;
      }

      if (var2 != null) {
         var3 = (Double)var2;
      }

      return var3 + var5;
   }

   public void addValue(int var1, Number var2) {
      double var3 = (Double)var2;
      var2 = (Double)this.getValue(var1);
      if (var2 != null) {
         var3 += (Double)var2;
      }

      this.setValue(var1, var3);
   }

   protected boolean areTwoValuesEqual(Number var1, Number var2) {
      boolean var3;
      if (AcceptableDeltaAwareDoubleComparator.INSTANCE.compareDoubles((Double)var1, (Double)var2, this.acceptableDelta) == 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   protected Double initialZeroElement() {
      return 0.0D;
   }

   public String toString() {
      return super.toString();
   }
}
