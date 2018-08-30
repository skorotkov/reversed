package fi.polar.polarmathsmart.types.zones;

public abstract class ZoneLimits extends ValuesInZones {
   private Number upperLimitForLastZone;

   public ZoneLimits(int var1) {
      super(var1);
   }

   public Integer determineZoneFor(Number var1) {
      int var2 = this.values.size() - 1;

      Integer var5;
      while(true) {
         if (var2 < 0) {
            var5 = null;
            break;
         }

         double var3 = this.getValue(var2).doubleValue();
         if (var1.doubleValue() >= var3) {
            var5 = var2;
            break;
         }

         --var2;
      }

      return var5;
   }

   public Number getUpperLimitForLastZone() {
      return this.upperLimitForLastZone;
   }

   public void setUpperLimitForLastZone(Number var1) {
      this.upperLimitForLastZone = var1;
   }

   public String toString() {
      return super.toString();
   }
}
