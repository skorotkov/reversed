package fi.polar.polarmathsmart.opticalheartrate.ppintervaldetection;

public class PPIntervalPreFilterOutput {
   float passedInterval;
   int status;

   public void PPIntervalPreFilterOutput() {
   }

   public float getPassedInterval() {
      return this.passedInterval;
   }

   public int getStatus() {
      return this.status;
   }

   public void setPassedInterval(float var1) {
      this.passedInterval = var1;
   }

   public void setStatus(int var1) {
      this.status = var1;
   }
}
