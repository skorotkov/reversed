package fi.polar.polarmathsmart.types;

public enum ActivityLevel {
   MOSTLY_MOVING(1.8D),
   MOSTLY_SITTING(1.4D),
   MOSTLY_STANDING(1.6D);

   private double factor;

   private ActivityLevel(double var3) {
      this.factor = var3;
   }

   public static ActivityLevel convertFromInt(int var0) {
      return values()[var0];
   }

   public double getFactor() {
      return this.factor;
   }
}
