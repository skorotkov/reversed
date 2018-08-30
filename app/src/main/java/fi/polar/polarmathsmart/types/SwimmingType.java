package fi.polar.polarmathsmart.types;

public enum SwimmingType {
   BACKSTROKE(13),
   BREASTSTROKE(12),
   BUTTERFLY(14),
   FREESTYLE(11),
   NO_SWIMMING(-2),
   OTHER(-1),
   OTHER_SWIMMING(10),
   TURN(0);

   private int value;

   private SwimmingType(int var3) {
      this.value = var3;
   }

   public static SwimmingType convertFromInt(int var0) {
      SwimmingType var1;
      if (var0 == -1) {
         var1 = OTHER;
      } else if (var0 == 0) {
         var1 = TURN;
      } else if (var0 == 10) {
         var1 = OTHER_SWIMMING;
      } else if (var0 == 11) {
         var1 = FREESTYLE;
      } else if (var0 == 12) {
         var1 = BREASTSTROKE;
      } else if (var0 == 13) {
         var1 = BACKSTROKE;
      } else if (var0 == 14) {
         var1 = BUTTERFLY;
      } else {
         var1 = NO_SWIMMING;
      }

      return var1;
   }

   public int getValue() {
      return this.value;
   }
}
