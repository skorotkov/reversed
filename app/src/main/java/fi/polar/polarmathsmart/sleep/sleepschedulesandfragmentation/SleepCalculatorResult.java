package fi.polar.polarmathsmart.sleep.sleepschedulesandfragmentation;

import java.util.List;

public class SleepCalculatorResult {
   List compressedStates;
   List compressedTimeStamps;
   int sleepEndTime;
   int sleepStartTime;
   int sleepTotalTime;

   public List getCompressedStates() {
      return this.compressedStates;
   }

   public List getCompressedTimeStamps() {
      return this.compressedTimeStamps;
   }

   public int getSleepEndTime() {
      return this.sleepEndTime;
   }

   public int getSleepStartTime() {
      return this.sleepStartTime;
   }

   public int getSleepTotalTime() {
      return this.sleepTotalTime;
   }

   public void setCompressedStates(List var1) {
      this.compressedStates = var1;
   }

   public void setCompressedTimeStamps(List var1) {
      this.compressedTimeStamps = var1;
   }

   public void setSleepEndTime(int var1) {
      this.sleepEndTime = var1;
   }

   public void setSleepStartTime(int var1) {
      this.sleepStartTime = var1;
   }

   public void setSleepTotalTime(int var1) {
      this.sleepTotalTime = var1;
   }
}
