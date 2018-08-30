package fi.polar.polarmathsmart.types;

public enum ActivityIntensity {
   BELOW_UP,
   JOG,
   UP,
   WALK;

   public static ActivityIntensity convertFromInt(int var0) {
      return values()[var0];
   }
}
