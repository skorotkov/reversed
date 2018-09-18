package fi.polar.polarflow.data;

import android.support.v4.c.g;
import fi.polar.polarflow.calculators.as_SpeedRangeStatistics;
import fi.polar.polarflow.calculators.bd;
import fi.polar.polarflow.data.orm.Exercise;
import fi.polar.polarflow.data.orm.ExercisePhase;
import fi.polar.polarflow.data.orm.ExercisePhaseData;
import fi.polar.polarflow.data.orm.ExercisePhaseStats;
import fi.polar.polarflow.data.orm.ExerciseTarget;
import fi.polar.polarflow.data.orm.ExerciseTargetInfo;
import fi.polar.polarflow.data.orm.PhysData;
import fi.polar.polarflow.data.orm.Preferences;
import fi.polar.polarflow.data.orm.Sport;
import fi.polar.polarflow.data.orm.SportProfile;
import fi.polar.polarflow.data.orm.SwimmingSamples;
import fi.polar.polarflow.data.orm.SwimmingStatistics;
import fi.polar.polarflow.data.orm.TrainingSession;
import fi.polar.polarflow.data.orm.TrainingSessionTarget;
import fi.polar.polarflow.data.orm.Zones;
import fi.polar.polarflow.ui.o;
import fi.polar.polarflow.util.aa_TimeUtils;
import fi.polar.polarflow.util.c;
import fi.polar.polarflow.util.d;
import fi.polar.polarflow.util.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Training {
   private static final String TAG = Training.class.getSimpleName();
   private static final Training ourInstance = new Training();
   private Exercise mExercise;
   private ExercisePhaseStats mExercisePhaseStats;
   private ExerciseTargetInfo mExerciseTargetInfo;
   private long mPauseEnd = 0L;
   private long mPauseStart = 0L;
   private boolean mPaused;
   private long mPausedTime = 0L;
   private List mPhaseExecutionOrder;
   private PhysData mPhysDataSnapshot;
   private boolean mRunning;
   private TrainingSamples mSamples;
   private long mSportId;
   private SportProfile mSportProfile;
   private SwimmingSamples mSwimmingSamples;
   private final aa_TimeUtils mSystemClock = new aa_TimeUtils();
   private TrainingLaps mTrainingLaps;
   private TrainingPhase mTrainingPhase;
   private TrainingSession mTrainingSession;
   private TrainingSessionTarget mTrainingSessionTarget;
   private int mUserMaximumHeartRate = 0;

   private Training() {
   }

   public static Training getInstance() {
      return ourInstance;
   }

   private void setEndTimeAndDuration(long var1) {
      long var3 = var1 - this.mTrainingSession.getStartTimeFromBoot();
      long var5 = this.mTrainingSession.getStartTime();
      long var7 = var3 - this.getPausedTime();
      this.mTrainingSession.setEnd(var5 + var3);
      this.mTrainingSession.setEndTimeFromBoot(var1);
      this.mTrainingSession.setDuration(var7);
      this.mExercise.setDuration(var7);
      if (this.mExerciseTargetInfo != null) {
         this.mExerciseTargetInfo.setEndTime(var7);
      }

   }

   public void addPhaseData(ExercisePhaseData var1) {
      if (this.mExercisePhaseStats != null) {
         this.mExercisePhaseStats.addPhaseData(var1);
         this.mTrainingPhase.startNextPhase();
         ExercisePhase var2 = this.getCurrentPhase();
         if (var2 != null) {
            var2.setStartTime(-1L);
         }
      }

   }

   public List getAutoLaps() {
      return this.mTrainingLaps.getAutoLaps();
   }

   public int getCalories() {
      int var1;
      if (this.mTrainingSession != null) {
         var1 = this.mTrainingSession.getCalories();
      } else {
         var1 = -1;
      }

      return var1;
   }

   public ExercisePhaseStats getCurrentExercisePhaseStats() {
      return this.mExercisePhaseStats;
   }

   public ExercisePhase getCurrentPhase() {
      Object var1 = null;
      ExercisePhase var2 = (ExercisePhase)var1;
      if (this.mExerciseTargetInfo != null) {
         var2 = (ExercisePhase)var1;
         if (this.mPhaseExecutionOrder != null) {
            var2 = (ExercisePhase)var1;
            if (this.mPhaseExecutionOrder.size() > this.mTrainingPhase.getNumber() - 1) {
               var2 = (ExercisePhase)this.getPhaseExecutionList().get(this.mTrainingPhase.getNumber() - 1);
            }
         }
      }

      return var2;
   }

   public int getDuration() {
      return (int)TimeUnit.MILLISECONDS.toSeconds(this.getDurationMs());
   }

   public long getDurationMs() {
      long var1 = 0L;
      long var3 = this.mSystemClock.b_elapsedRealtime();
      long var5 = this.mPausedTime;
      long var7;
      if (this.mPaused) {
         var7 = var3 - this.mPauseStart;
      } else {
         var7 = 0L;
      }

      if (this.mRunning) {
         var7 = var3 - this.mTrainingSession.getStartTimeFromBoot() - (var7 + var5);
      } else {
         var7 = var1;
         if (this.mTrainingSession != null) {
            var7 = this.mTrainingSession.getDuration();
         }
      }

      return var7;
   }

   public long getEndTime() {
      long var1;
      if (this.mTrainingSession != null) {
         var1 = this.mTrainingSession.getEnd();
      } else {
         var1 = 0L;
      }

      return var1;
   }

   public long getEndTimeFromBoot() {
      long var1;
      if (this.mTrainingSession != null) {
         var1 = this.mTrainingSession.getEndTimeFromBoot();
      } else {
         var1 = 0L;
      }

      return var1;
   }

   public ExercisePhase getExercisePhase(int var1) {
      Object var2 = null;
      ExercisePhase var3 = (ExercisePhase)var2;
      if (this.mExerciseTargetInfo != null) {
         var3 = (ExercisePhase)var2;
         if (this.mPhaseExecutionOrder != null) {
            var3 = (ExercisePhase)var2;
            if (this.mPhaseExecutionOrder.size() > var1) {
               var3 = (ExercisePhase)this.getPhaseExecutionList().get(var1);
            }
         }
      }

      return var3;
   }

   public int getFatConsumption() {
      int var1;
      if (this.mTrainingSession == null) {
         var1 = -1;
      } else {
         var1 = this.mTrainingSession.getFatConsumption();
      }

      return var1;
   }

   public ExercisePhaseData getLastPhaseData() {
      ExercisePhaseData var1;
      if (this.mExercisePhaseStats == null) {
         var1 = null;
      } else {
         var1 = this.mExercisePhaseStats.getClonedLastPhaseData();
      }

      return var1;
   }

   public List getManualLaps() {
      return this.mTrainingLaps.getManualLaps();
   }

   public long getPauseStartTimeFromBoot() {
      return this.mPauseStart;
   }

   public long getPausedTime() {
      long var1;
      if (this.mPaused) {
         var1 = this.mSystemClock.b_elapsedRealtime() - this.mPauseStart + this.mPausedTime;
      } else {
         var1 = this.mPausedTime;
      }

      return var1;
   }

   public List getPhaseExecutionList() {
      ArrayList var1 = new ArrayList();
      if (this.mPhaseExecutionOrder != null) {
         Iterator var2 = this.mPhaseExecutionOrder.iterator();

         while(var2.hasNext()) {
            Integer var3 = (Integer)var2.next();
            var1.add(this.mExerciseTargetInfo.getExercisePhaseList().get(var3));
         }
      }

      return var1;
   }

   public long getRecoveryTime() {
      long var1;
      if (this.mTrainingSession != null) {
         var1 = this.mTrainingSession.getRecoveryTime();
      } else {
         var1 = -1L;
      }

      return var1;
   }

   public TrainingSamples getSamples() {
      return this.mSamples;
   }

   public long getSamplingStartTimeFromBoot() {
      long var1;
      if (this.mPauseEnd == 0L) {
         var1 = this.getStartTimeFromBoot();
      } else {
         var1 = this.mPauseEnd;
      }

      return var1;
   }

   public String getSessionName() {
      String var1;
      if (this.mTrainingSession != null) {
         var1 = this.mTrainingSession.getSessionName();
      } else {
         var1 = "";
      }

      return var1;
   }

   public as_SpeedRangeStatistics getSpeedStatistics() {
      return (as_SpeedRangeStatistics)this.getStatistics().getSpeedStatistics();
   }

   public float getSportFactor() {
      float var1 = -1.0F;
      if (this.mSportProfile != null) {
         Sport var2 = this.mSportProfile.getSport();
         if (var2 != null) {
            var1 = var2.getFactor();
         }
      }

      return var1;
   }

   public long getSportId() {
      return this.mSportId;
   }

   public SportProfile getSportProfile() {
      return this.mSportProfile;
   }

   public long getStartTime() {
      long var1;
      if (this.mTrainingSession != null) {
         var1 = this.mTrainingSession.getStartTime();
      } else {
         var1 = 0L;
      }

      return var1;
   }

   public long getStartTimeFromBoot() {
      long var1;
      if (this.mTrainingSession != null) {
         var1 = this.mTrainingSession.getStartTimeFromBoot();
      } else {
         var1 = 0L;
      }

      return var1;
   }

   public TrainingStatistics getStatistics() {
      TrainingStatistics var1;
      if (this.mSamples != null) {
         var1 = this.mSamples.getStatistics();
      } else {
         var1 = null;
      }

      return var1;
   }

   public SwimmingSamples getSwimmingSamples() {
      return this.mSwimmingSamples;
   }

   public bd getSwimmingSpeedStatistics() {
      return this.getStatistics().getSwimmingSpeedStatistics();
   }

   public SwimmingStatistics getSwimmingStatistics() {
      return this.getStatistics().getSwimmingStatistics();
   }

   public boolean getTargetReached() {
      boolean var1 = true;
      boolean var2 = false;
      boolean var3 = var2;
      if (this.mExerciseTargetInfo != null) {
         var3 = var2;
         if (this.mExerciseTargetInfo.getTargetReached() != -1) {
            if (this.mExerciseTargetInfo.getTargetReached() == 1) {
               var3 = var1;
            } else {
               var3 = false;
            }
         }
      }

      return var3;
   }

   public float getTotalDistance() {
      float var1;
      if (this.mTrainingSession != null) {
         var1 = this.mTrainingSession.getDistance();
      } else {
         var1 = -1.0F;
      }

      return var1;
   }

   public TrainingDataRefs getTrainingDataRefs(boolean var1) {
      if (var1 && this.mRunning) {
         this.setEndTimeAndDuration(this.mSystemClock.b_elapsedRealtime());
      }

      return new TrainingDataRefs(this.mTrainingSession, this.mExercise, this.mSamples, this.mTrainingLaps, this.mTrainingSessionTarget, this.mExerciseTargetInfo, this.mExercisePhaseStats, this.mPhysDataSnapshot, this.mSportProfile, this.mSwimmingSamples);
   }

   public TrainingPhase getTrainingPhase() {
      return this.mTrainingPhase;
   }

   public TrainingSessionTarget getTrainingSessionTarget() {
      return this.mTrainingSessionTarget;
   }

   public int getUserMaximumHeartRate() {
      return this.mUserMaximumHeartRate;
   }

   public int getUserUnitSystem() {
      return Preferences.getUserUnitSystem();
   }

   public Zones getZones() {
      Zones var1;
      if (this.mSamples != null) {
         var1 = this.mSamples.getZones();
      } else {
         var1 = null;
      }

      return var1;
   }

   public boolean isPaused() {
      return this.mPaused;
   }

   public boolean isRunning() {
      return this.mRunning;
   }

   public boolean isSensorEnabled(int var1) {
      boolean var2;
      if (this.mSportProfile != null && this.mSportProfile.getSettings().isSensorEnabled(var1)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public long pauseSession() {
      if (!this.mPaused) {
         this.mPauseStart = this.mSystemClock.b_elapsedRealtime();
         d.c(TAG, "pauseSession, cumulative mPausedTime:" + this.mPausedTime);
         this.mPaused = true;
      } else {
         d.b(TAG, "pauseSession()  - ALREADY PAUSED!");
      }

      return this.mPauseStart;
   }

   public void resumeSession() {
      if (this.mPaused) {
         this.mPauseEnd = this.mSystemClock.b_elapsedRealtime();
         long var1 = this.mPauseEnd - this.mPauseStart;
         d.c(TAG, "resumeSession, current paused time:" + var1);
         this.mPausedTime += var1;
         d.c(TAG, "resumeSession, cumulative mPausedTime:" + this.mPausedTime);
         if (this.mTrainingPhase != null) {
            this.mTrainingPhase.increasePausedTime(var1);
         }

         this.mSamples.addPauseTime(this.mPauseEnd - this.getStartTimeFromBoot() - this.mPausedTime, var1);
         this.mPauseStart = 0L;
         this.mPaused = false;
      } else {
         d.b(TAG, "resumeSession() - ALREADY ONGOING!");
      }

   }

   public void setBenefit(int var1) {
      this.mTrainingSession.setBenefit(var1);
   }

   public void setCalories(int var1) {
      this.mTrainingSession.setCalories(var1);
      this.mExercise.setCalories(var1);
   }

   public void setCurrentAltitude(float var1, boolean var2) {
      this.mSamples.addAltitudeSample(var1, var2);
   }

   public void setCurrentSpeedInKmPerHour(float var1) {
      this.mSamples.addSpeedSample(var1, true);
   }

   public void setCurrentSpeedInMetersPerSecond(float var1, boolean var2) {
      this.mSamples.addSpeedSample(3.6F * var1, var2);
   }

   public void setExerciseTargetReached(boolean var1) {
      if (this.mExerciseTargetInfo != null) {
         this.mExerciseTargetInfo.setTargetReached(var1);
      }

   }

   public void setFatConsumption(int var1) {
      this.mTrainingSession.setFatConsumption(var1);
      this.mExercise.setFatConsumption(var1);
   }

   public void setLocalBroadcastManager(g var1) {
      if (this.mTrainingLaps != null) {
         this.mTrainingLaps.setLocalBroadcastManager(var1);
      }

   }

   public void setRecoveryTime(long var1) {
      this.mTrainingSession.setRecoveryTime(var1);
      this.mExercise.setRecoveryTime(var1);
   }

   public void setRunningIndex(int var1, long var2) {
      this.mExercise.setRunningIndex(var1, var2);
   }

   public void setSportId(long var1) {
      if (!this.isRunning()) {
         this.mSportId = var1;
      }

   }

   public void setTotalAscent(float var1) {
      this.mExercise.setAscent(var1);
   }

   public void setTotalDescent(float var1) {
      this.mExercise.setDescent(var1);
   }

   public void setTotalDistance(float var1, boolean var2) {
      if (var2) {
         this.mTrainingSession.setDistance(var1);
         this.mExercise.setDistance(var1);
      }

      this.mSamples.addDistanceSample(var1);
   }

   public void setTrainingLoad(int var1) {
      this.mTrainingSession.setTrainingLoad(var1);
      this.mExercise.setTrainingLoad(var1);
   }

   public void setTrainingSessionTarget(TrainingSessionTarget var1) {
      if (!this.isRunning()) {
         this.mTrainingSessionTarget = var1;
      }

   }

   public void setTrainingSessionTargetDone(boolean var1) {
      if (this.mTrainingSessionTarget != null) {
         this.mTrainingSessionTarget.setTargetDone(var1);
      }

   }

   public void startSession() {
      byte var1 = 0;
      if (!this.mRunning) {
         this.mPauseStart = 0L;
         this.mPausedTime = 0L;
         this.mPauseEnd = 0L;
         this.mTrainingSession = new TrainingSession(this.mSystemClock.a_currentTimeMillis(), this.mSystemClock.b_elapsedRealtime());
         this.mTrainingSession.setModelName(c.d());
         this.mTrainingSession.setDeviceId(c.a());
         Sport var2 = Sport.getSport(this.mSportId);
         if (var2 != null) {
            this.mTrainingSession.setSessionName(var2.getName());
         }

         this.mExercise = this.mTrainingSession.getOrCreateExercise(this.mTrainingSession.getStartTime());
         this.mExercise.setSport(this.mSportId);
         this.mExerciseTargetInfo = null;
         this.mPhaseExecutionOrder = null;
         int var6;
         if (this.mTrainingSessionTarget != null) {
            this.mTrainingPhase = new TrainingPhase(this);
            long var3 = TrainingSessionTarget.getEcosystemId(this.mTrainingSessionTarget);
            if (var3 != -1L) {
               if (this.mTrainingSessionTarget.isFavorite()) {
                  this.mTrainingSession.setTrainingSessionFavoriteId(var3);
               } else {
                  this.mTrainingSession.setTrainingSessionTargetId(var3);
               }

               this.mExerciseTargetInfo = new ExerciseTargetInfo(this.mExercise);
               ExerciseTarget var10 = this.mTrainingSessionTarget.getExerciseTarget();
               this.mExerciseTargetInfo.setTargetType(var10.getTargetType());
               if (this.mExerciseTargetInfo.getTargetType() == 1) {
                  this.mExerciseTargetInfo.setVolumeTargetType(var10.getVolumeTargetType());
                  this.mExerciseTargetInfo.setVolumeTargetDistance(var10.getVolumeTargetDistance());
                  this.mExerciseTargetInfo.setVolumeTargetDuration(var10.getVolumeTargetDuration());
                  this.mExerciseTargetInfo.setVolumeTargetCalories(var10.getVolumeTargetCalories());
               } else if (this.mExerciseTargetInfo.getTargetType() == 2) {
                  this.mExercisePhaseStats = new ExercisePhaseStats(this.mExercise);
                  this.mExerciseTargetInfo.addAllExercisePhases(var10.getExercisePhaseList());
                  this.mPhaseExecutionOrder = new ArrayList();
                  List var7 = this.mExerciseTargetInfo.getExercisePhaseList();
                  int[] var8 = new int[var7.size()];

                  int var9;
                  for(var6 = 0; var6 < var7.size(); var6 = var9 + 1) {
                     ExercisePhase var11 = (ExercisePhase)var7.get(var6);
                     var11.increaseTotalExecutionCount();
                     ++var8[var6];
                     this.mPhaseExecutionOrder.add(var6);
                     var9 = var6;
                     if (var11.getRepeatCount() != -1) {
                        if (var8[var6] < var11.getRepeatCount() + 1) {
                           var9 = var11.getJumpIndex() - 2;
                        } else {
                           var8[var6] = 0;
                           var9 = var6;
                        }
                     }
                  }
               }

               this.mExerciseTargetInfo.setName(this.mTrainingSessionTarget.getName());
               this.mExerciseTargetInfo.setTargetReached(false);
            }
         }

         this.mPhysDataSnapshot = PhysData.getUserPhysData();
         this.mRunning = true;
         this.mSportProfile = SportProfile.getSportProfileBySportId(this.mSportId);
         boolean var5;
         List var12;
         if (this.mSportProfile != null) {
            u.a().b(this.mSportProfile.getSportId());
            var5 = this.mSportProfile.getSettings().isSensorEnabled(4);
            var12 = this.mSportProfile.getSettings().getHeartRateZones();
            this.mTrainingLaps = new TrainingLaps(this.mSportProfile.getSettings().getAutomaticLap());
            this.mTrainingLaps.setExercise(this.mExercise);
            this.mTrainingLaps.startSession();
         } else {
            var12 = null;
            var5 = true;
         }

         this.mUserMaximumHeartRate = o.a();
         if (var12 != null && var12.size() == 5) {
            var6 = this.mSportProfile.getSettings().getHearRateSettingSource();
         } else {
            var12 = o.e(this.mUserMaximumHeartRate);
            var6 = var1;
         }

         this.mSamples = new TrainingSamples(var5);
         this.mSamples.setExercise(this.mExercise);
         this.mSamples.setHrZoneLimits(var12);
         this.mSamples.setHrZoneSettingSource(var6);
         if (Sport.isSwimmingSport(this.mSportId)) {
            this.mSwimmingSamples = new SwimmingSamples();
            this.mSwimmingSamples.setExercise(this.mExercise);
         }
      }

   }

   public void stopSession() {
      if (this.mRunning) {
         this.mRunning = false;
         long var1 = this.mSystemClock.b_elapsedRealtime();
         if (this.mPaused) {
            this.mPaused = false;
            this.mPausedTime += var1 - this.mPauseStart;
            d.c(TAG, "stopSession, cumulative mPausedTime: " + this.mPausedTime);
         }

         this.mPauseStart = 0L;
         this.mPauseEnd = 0L;
         this.setEndTimeAndDuration(var1);
         this.mSportProfile = null;
         if (this.mTrainingSessionTarget != null && this.mTrainingSessionTarget.getExerciseTarget() != null) {
            int var3 = this.mTrainingSessionTarget.getExerciseTarget().getTargetType();
            if (var3 != 1 && var3 != 2) {
               this.mTrainingSessionTarget.setTargetDone(true);
            }
         }

         this.mTrainingLaps.stopSession();
      }

   }

   public void stopSessionAndRelease() {
      d.c(TAG, "stopSessionAndRelease");
      this.stopSession();
      this.mTrainingSession = null;
      this.mExercise = null;
      this.mSamples = null;
      this.mSwimmingSamples = null;
      this.mTrainingLaps = null;
      this.mTrainingSessionTarget = null;
      this.mExerciseTargetInfo = null;
      this.mExercisePhaseStats = null;
      this.mSportProfile = null;
      this.mPhysDataSnapshot = null;
      this.mTrainingPhase = null;
      this.mPhaseExecutionOrder = null;
   }
}
