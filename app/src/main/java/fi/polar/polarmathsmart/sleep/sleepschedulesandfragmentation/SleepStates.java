package fi.polar.polarmathsmart.sleep.sleepschedulesandfragmentation;

import java.util.HashMap;
import java.util.Map;

public enum SleepStates {
   NONREM1,
   NONREM2,
   NONREM3,
   REM,
   WAKE;

   private static Map map;
   private final int value;

   static {
      int var0 = 0;
      WAKE = new SleepStates("WAKE", 0, -2);
      REM = new SleepStates("REM", 1, -3);
      NONREM1 = new SleepStates("NONREM1", 2, -4);
      NONREM2 = new SleepStates("NONREM2", 3, -5);
      NONREM3 = new SleepStates("NONREM3", 4, -6);
      map = new HashMap();
      SleepStates[] var1 = values();

      for(int var2 = var1.length; var0 < var2; ++var0) {
         SleepStates var3 = var1[var0];
         map.put(var3.getDoubleValue(), var3);
      }

   }

   private SleepStates(int var3) {
      this.value = var3;
   }

   public static SleepStates valueOf(Double var0) {
      return (SleepStates)map.get(var0);
   }

   public Double getDoubleValue() {
      return (double)this.value;
   }

   public int getValue() {
      return this.value;
   }
}
