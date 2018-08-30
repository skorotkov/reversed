package fi.polar.polarmathsmart.types;

public enum MovingType {
   RUNNING,
   STANDSTILL,
   WALKING;

   public static MovingType convertFromInt(int var0) {
      return values()[var0];
   }
}
