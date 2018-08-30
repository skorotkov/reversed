package fi.polar.polarflow.data;

import android.os.SystemClock;

public class TrainingPhase {
   private int mCurrentPhaseAvgCadence = -1;
   private float mCurrentPhaseAvgHr = 0.0F;
   private float mCurrentPhaseAvgSpeed = -1.0F;
   private float mCurrentPhaseDistance = -1.0F;
   private int mCurrentPhaseMaxCadence = -1;
   private float mCurrentPhaseMaxHr = 0.0F;
   private float mCurrentPhaseMaxSpeed = -1.0F;
   private int mCurrentPhaseNumber = 1;
   private long mCurrentPhasePausedTime = 0L;
   private boolean mSkipNextPauseTimeIncrease = false;
   private final Training mTraining;

   public TrainingPhase(Training var1) {
      this.mTraining = var1;
   }

   public int getAvgCadence() {
      return this.mCurrentPhaseAvgCadence;
   }

   public float getAvgHr() {
      return this.mCurrentPhaseAvgHr;
   }

   public float getAvgSpeed() {
      return this.mCurrentPhaseAvgSpeed;
   }

   public float getDistance() {
      return this.mCurrentPhaseDistance;
   }

   public int getMaxCadence() {
      return this.mCurrentPhaseMaxCadence;
   }

   public float getMaxHr() {
      return this.mCurrentPhaseMaxHr;
   }

   public float getMaxSpeed() {
      return this.mCurrentPhaseMaxSpeed;
   }

   public int getNumber() {
      return this.mCurrentPhaseNumber;
   }

   public long getPausedTime() {
      long var1 = 0L;
      if (this.mTraining.isPaused()) {
         var1 = SystemClock.elapsedRealtime() - this.mTraining.getPauseStartTimeFromBoot();
      }

      return var1 + this.mCurrentPhasePausedTime;
   }

   public void increasePausedTime(long var1) {
      if (!this.mSkipNextPauseTimeIncrease) {
         this.mCurrentPhasePausedTime += var1;
      } else {
         this.mSkipNextPauseTimeIncrease = false;
      }

   }

   public void setAvgCadence(int var1) {
      this.mCurrentPhaseAvgCadence = var1;
   }

   public void setAvgHr(float var1) {
      this.mCurrentPhaseAvgHr = var1;
   }

   public void setAvgSpeed(float var1) {
      this.mCurrentPhaseAvgSpeed = var1;
   }

   public void setDistance(float var1) {
      this.mCurrentPhaseDistance = var1;
   }

   public void setMaxCadence(int var1) {
      this.mCurrentPhaseMaxCadence = var1;
   }

   public void setMaxHr(float var1) {
      this.mCurrentPhaseMaxHr = var1;
   }

   public void setMaxSpeed(float var1) {
      this.mCurrentPhaseMaxSpeed = var1;
   }

   public void startNextPhase() {
      this.mCurrentPhasePausedTime = 0L;
      ++this.mCurrentPhaseNumber;
      this.mCurrentPhaseDistance = -1.0F;
      this.mCurrentPhaseMaxHr = 0.0F;
      this.mCurrentPhaseAvgHr = 0.0F;
      this.mCurrentPhaseMaxSpeed = -1.0F;
      this.mCurrentPhaseAvgSpeed = -1.0F;
      this.mCurrentPhaseAvgCadence = -1;
      this.mCurrentPhaseMaxCadence = -1;
      if (this.mTraining.isPaused()) {
         this.mSkipNextPauseTimeIncrease = true;
      }

   }
}
