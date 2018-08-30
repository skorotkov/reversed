package fi.polar.polarmathsmart.sleep.sleepschedulesandfragmentation;

public enum SleepQualityRate {
   ANSWER_NOT_AVAILABLE(0),
   SLEEP_NOT_POORLY_NOR_WELL(3),
   SLEEP_POORLY(2),
   SLEEP_RATHER_POORLY(1),
   SLEEP_RATHER_WELL(5),
   SLEEP_WELL(4);

   private final int value;

   private SleepQualityRate(int var3) {
      this.value = var3;
   }

   public int getValue() {
      return this.value;
   }
}
