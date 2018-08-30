package fi.polar.polarmathsmart.types;

public enum ActivityClass {
   CONTINUOUS_MODERATE,
   CONTINUOUS_VIGOROUS,
   INTERMITTENT_MODERATE,
   INTERMITTENT_VIGOROUS,
   LIGHT_ACTIVITY,
   NON_WEAR,
   SEDENTARY,
   SLEEP;

   public static ActivityClass convertFromByte(byte var0) {
      return values()[var0];
   }

   public static ActivityClass convertFromChar(char var0) {
      return values()[var0];
   }
}
