package fi.polar.polarflow.data;

import fi.polar.polarflow.data.orm.Exercise;
import fi.polar.polarflow.data.orm.ExerciseRouteSamples;
import fi.polar.polarflow.data.orm.ExerciseSamples;
import fi.polar.polarflow.data.orm.Zones;
import fi.polar.polarflow.util.d;
import java.util.ArrayList;
import java.util.List;

public class TrainingSamples {
   private static final double DEFAULT_SAMPLE_OFFLINE_VALUE_DOUBLE = 0.0D;
   private static final float DEFAULT_SAMPLE_OFFLINE_VALUE_FLOAT = 0.0F;
   private static final int DEFAULT_SAMPLE_OFFLINE_VALUE_INT = 0;
   private static final String TAG = TrainingSamples.class.getSimpleName();
   private final ExerciseRouteSamples mExerciseRouteSamples;
   private final ExerciseSamples mExerciseSamples = new ExerciseSamples();
   private final Zones mRecordedZones = new Zones();
   private final TrainingStatistics mStatistics;

   public TrainingSamples(boolean var1) {
      if (var1) {
         this.mExerciseRouteSamples = new ExerciseRouteSamples();
      } else {
         this.mExerciseRouteSamples = null;
      }

      this.mStatistics = new TrainingStatistics();
   }

   public void addAltitudeOfflineRange(int var1, int var2) {
      if (var2 < var1) {
         d.c(TAG, "", new IllegalArgumentException("stopIndex cannot be smaller than startIndex"));
      } else {
         this.mExerciseSamples.addAltitudeOfflineRange(new int[]{var1, var2});
      }

   }

   public void addAltitudeSample(float var1, boolean var2) {
      if (var2) {
         if (Float.isNaN(var1)) {
            this.mStatistics.getAltitudeStatistics().b_addEmptyAltitude();
         } else {
            this.mStatistics.getAltitudeStatistics().a_addAltitude(var1);
         }

         this.mExerciseSamples.addAltitudeSample(var1);
      } else {
         this.mStatistics.getAltitudeStatistics().b_addEmptyAltitude();
         this.mExerciseSamples.addAltitudeSample(0.0F);
      }

   }

   public void addCadenceSample(int var1) {
      this.mStatistics.getCadenceStatistics().a(var1);
      this.mExerciseSamples.addCadenceSample(var1);
   }

   public void addDistanceOfflineRange(int var1, int var2) {
      if (var2 < var1) {
         d.c(TAG, "", new IllegalArgumentException("stopIndex cannot be smaller than startIndex"));
      } else {
         this.mExerciseSamples.addDistanceOfflineRange(new int[]{var1, var2});
      }

   }

   public void addDistanceSample(float var1) {
      this.mExerciseSamples.addDistanceSample(var1);
   }

   public void addExerciseRouteSample(double var1, double var3, double var5, int var7, int var8) {
      if (this.mExerciseRouteSamples != null) {
         this.mExerciseRouteSamples.addLatitudeSample(var1);
         this.mExerciseRouteSamples.addLongitudeSample(var3);
         if (!Double.isNaN(var5)) {
            this.mExerciseRouteSamples.addAltitudeSample(var5);
         } else {
            this.mExerciseRouteSamples.addAltitudeSample(0.0D);
         }

         this.mExerciseRouteSamples.addSatelliteAmountSample(var7);
         this.mExerciseRouteSamples.addDurationSample(var8);
      }

   }

   public void addHeartRateOfflineRange(int var1, int var2) {
      if (var2 < var1) {
         d.c(TAG, "", new IllegalArgumentException("stopIndex cannot be smaller than startIndex"));
      } else {
         this.mExerciseSamples.addHeartrateOfflineRange(new int[]{var1, var2});
      }

   }

   public void addHeartrateSample(int var1, int var2, boolean var3) {
      if (var3) {
         this.mStatistics.getHeartrateStatistics().a_addAltitude((float)var1);
         this.mExerciseSamples.addHeartrateSample(var1);
         if (var2 > 0) {
            this.mRecordedZones.addHeartRateSample(var1);
         }
      } else {
         this.mStatistics.getHeartrateStatistics().b_addEmptyAltitude();
         this.mExerciseSamples.addHeartrateSample(0);
      }

   }

   public void addPauseTime(long var1, long var3) {
      this.mExerciseSamples.addPauseTime(var1, var3);
   }

   public void addSpeedOfflineRange(int var1, int var2) {
      if (var2 < var1) {
         d.c(TAG, "", new IllegalArgumentException("stopIndex cannot be smaller than startIndex"));
      } else {
         this.mExerciseSamples.addSpeedOfflineRange(new int[]{var1, var2});
      }

   }

   public void addSpeedSample(float var1, boolean var2) {
      if (var2) {
         this.mStatistics.getSpeedStatistics().a_addAltitude(var1);
         this.mExerciseSamples.addSpeedSample(var1);
      } else {
         this.mStatistics.getSpeedStatistics().b_addEmptyAltitude();
         this.mExerciseSamples.addSpeedSample(0.0F);
      }

   }

   public List cloneAltitudeList() {
      return this.mExerciseSamples.cloneAltitudeSamplesList();
   }

   public List cloneAltitudeOfflineList() {
      return this.mExerciseSamples.cloneAltitudeOfflineIndexList();
   }

   public List cloneCadenceList() {
      return this.mExerciseSamples.cloneCadenceSamplesList();
   }

   public List cloneDistanceList() {
      return this.mExerciseSamples.cloneDistanceSamplesList();
   }

   public List cloneDistanceOfflineList() {
      return this.mExerciseSamples.cloneDistanceOfflineIndexList();
   }

   public List cloneHeartRateList() {
      return this.mExerciseSamples.cloneHeartRateSamplesList();
   }

   public List cloneHeartRateListShort() {
      return this.mExerciseSamples.cloneHeartRateSamplesListShort();
   }

   public List cloneSpeedList() {
      return this.mExerciseSamples.cloneSpeedSamplesList();
   }

   public List cloneSpeedOfflineList() {
      return this.mExerciseSamples.cloneSpeedOfflineIndexList();
   }

   public List createDataLayerRequests() {
      ArrayList var1 = new ArrayList();
      var1.add(this.mExerciseSamples.createDataLayerRequest());
      if (this.mExerciseRouteSamples != null) {
         var1.add(this.mExerciseRouteSamples.createDataLayerRequest());
      }

      var1.addAll(this.mStatistics.createDataLayerRequests());
      var1.add(this.mRecordedZones.createDataLayerRequest());
      return var1;
   }

   public void delete() {
      this.mExerciseSamples.delete();
      if (this.mExerciseRouteSamples != null) {
         this.mExerciseRouteSamples.delete();
      }

      this.mRecordedZones.delete();
      this.mStatistics.delete();
   }

   public int getAltitudeSamplesCount() {
      return this.mExerciseSamples.getAltitudeSamplesCount();
   }

   public int getCadenceSamplesCount() {
      return this.mExerciseSamples.getCadenceSamplesCount();
   }

   public ExerciseRouteSamples getExerciseRouteSamples() {
      return this.mExerciseRouteSamples;
   }

   public int getHeartRateSamplesCount() {
      return this.mExerciseSamples.getHeartRateSamplesCount();
   }

   public int getSpeedSamplesCount() {
      return this.mExerciseSamples.getSpeedSamplesCount();
   }

   public TrainingStatistics getStatistics() {
      return this.mStatistics;
   }

   public Zones getZones() {
      return this.mRecordedZones;
   }

   public void save() {
      this.mExerciseSamples.save();
      if (this.mExerciseRouteSamples != null) {
         this.mExerciseRouteSamples.save();
      }

      this.mRecordedZones.save();
      this.mStatistics.save();
   }

   public void setExercise(Exercise var1) {
      this.mExerciseSamples.setExercise(var1);
      if (this.mExerciseRouteSamples != null) {
         this.mExerciseRouteSamples.setExercise(var1);
      }

      this.mStatistics.setExercise(var1);
      this.mRecordedZones.setExercise(var1);
   }

   public void setExerciseFirstLocationTime(long var1) {
      if (this.mExerciseRouteSamples != null) {
         this.mExerciseRouteSamples.setFirstLocationTime(var1);
      }

   }

   public void setHrZoneLimits(List var1) {
      this.mRecordedZones.setHeartRateZones(var1);
   }

   public void setHrZoneSettingSource(int var1) {
      this.mRecordedZones.setHrZoneSettingSource(var1);
   }
}
