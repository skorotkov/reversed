package fi.polar.polarmathsmart.types.zones;

public class HeartRateZoneLimits extends ZoneLimits {
   public HeartRateZoneLimits(int var1) {
      super(var1);
   }

   protected Short add(Short var1, Short var2) {
      short var3 = 0;
      short var4;
      if (var1 != null) {
         var4 = var1;
      } else {
         var4 = 0;
      }

      if (var2 != null) {
         var3 = var2;
      }

      return (short)(var3 + var4);
   }

   public void addValue(int var1, Short var2) {
      this.setValue(var1, (short)((Short)this.getValue(var1) + var2));
   }

   protected boolean areTwoValuesEqual(Short var1, Short var2) {
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

   protected Short initialZeroElement() {
      return null;
   }

   public String toString() {
      return super.toString();
   }
}
