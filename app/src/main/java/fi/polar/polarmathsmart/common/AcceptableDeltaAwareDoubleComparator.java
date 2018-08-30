package fi.polar.polarmathsmart.common;

public enum AcceptableDeltaAwareDoubleComparator {
   INSTANCE;

   public int compareDoubles(Double var1, Double var2, double var3) {
      byte var5 = 0;
      if (var1 == null || var2 == null) {
         if (var2 == null && var1 == null) {
            return var5;
         }

         if (var1 == null) {
            var5 = -1;
            return var5;
         }

         if (var2 == null) {
            var5 = 1;
            return var5;
         }
      }

      double var6 = var1;
      double var8 = var2;
      if (Math.abs(var8 - var6) >= var3) {
         if (var8 > var6) {
            var5 = 1;
         } else {
            var5 = -1;
         }
      }

      return var5;
   }
}
