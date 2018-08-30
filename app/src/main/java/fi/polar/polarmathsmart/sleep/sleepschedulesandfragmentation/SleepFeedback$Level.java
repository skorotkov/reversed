package fi.polar.polarmathsmart.sleep.sleepschedulesandfragmentation;

import java.util.HashMap;
import java.util.Map;

public enum SleepFeedback$Level {
   ABOVE_AVERAGE,
   AVERAGE,
   BELOW_AVERAGE,
   NOT_EVALUATED;

   private static Map map;
   private int value;

   static {
      int var0 = 0;
      ABOVE_AVERAGE = new SleepFeedback$Level("ABOVE_AVERAGE", 0, 1);
      AVERAGE = new SleepFeedback$Level("AVERAGE", 1, 0);
      BELOW_AVERAGE = new SleepFeedback$Level("BELOW_AVERAGE", 2, -1);
      NOT_EVALUATED = new SleepFeedback$Level("NOT_EVALUATED", 3, -2);
      map = new HashMap(values().length);
      SleepFeedback$Level[] var1 = values();

      for(int var2 = var1.length; var0 < var2; ++var0) {
         SleepFeedback$Level var3 = var1[var0];
         map.put(var3.getValue(), var3);
      }

   }

   private SleepFeedback$Level(int var3) {
      this.value = var3;
   }

   public static SleepFeedback$Level valueOf(int var0) {
      return (SleepFeedback$Level)map.get(var0);
   }

   public int getValue() {
      return this.value;
   }
}
