package fi.polar.polarmathsmart.types.zones;

public class IntegerValuesInZones extends ValuesInZones {
   public IntegerValuesInZones(int var1) {
      super(var1);
   }

   protected Integer add(Integer var1, Integer var2) {
      int var3 = 0;
      int var4;
      if (var1 != null) {
         var4 = var1;
      } else {
         var4 = 0;
      }

      if (var2 != null) {
         var3 = var2;
      }

      return var3 + var4;
   }

   public void addValue(int var1, Integer var2) {
      this.setValue(var1, (Integer)this.getValue(var1) + var2);
   }

   protected boolean areTwoValuesEqual(Integer var1, Integer var2) {
      boolean var3;
      if (var1 != null) {
         var3 = var1.equals(var2);
      } else if (var2 == null) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   protected Integer initialZeroElement() {
      return 0;
   }

   public String toString() {
      return super.toString();
   }
}
