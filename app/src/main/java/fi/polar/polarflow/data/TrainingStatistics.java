package fi.polar.polarflow.data;

import fi.polar.polarflow.calculators.a;
import fi.polar.polarflow.calculators.as_SpeedRangeStatistics;
import fi.polar.polarflow.calculators.at_RangeStatistics;
import fi.polar.polarflow.calculators.bd;
import fi.polar.polarflow.calculators.a_package.c;
import fi.polar.polarflow.data.orm.Exercise;
import fi.polar.polarflow.data.orm.ExerciseStatistics;
import fi.polar.polarflow.data.orm.SwimmingStatistics;
import java.util.ArrayList;
import java.util.List;

public class TrainingStatistics {
   private final a mAltitudeStatistics = new a();
   private final c mCadenceStatistics = new c();
   private final ExerciseStatistics mExerciseStatistics = new ExerciseStatistics();
   private final at_RangeStatistics mHeartrateStatistics = new at_RangeStatistics(0.0F, 250.0F);
   private final as_SpeedRangeStatistics mSpeedStatistics = new as_SpeedRangeStatistics();
   private final bd mSwimmingSpeedStatistics = new bd();
   private SwimmingStatistics mSwimmingStatistics = null;

   public List createDataLayerRequests() {
      ArrayList var1 = new ArrayList();
      var1.add(this.mExerciseStatistics.createDataLayerRequest());
      return var1;
   }

   public void delete() {
      this.mExerciseStatistics.delete();
   }

   public at_RangeStatistics getAltitudeStatistics() {
      return this.mAltitudeStatistics;
   }

   public c getCadenceStatistics() {
      return this.mCadenceStatistics;
   }

   public at_RangeStatistics getHeartrateStatistics() {
      return this.mHeartrateStatistics;
   }

   public at_RangeStatistics getSpeedStatistics() {
      return this.mSpeedStatistics;
   }

   public bd getSwimmingSpeedStatistics() {
      return this.mSwimmingSpeedStatistics;
   }

   public SwimmingStatistics getSwimmingStatistics() {
      return this.mSwimmingStatistics;
   }

   public void save() {
      if (this.mSpeedStatistics.g_areAnySamplesAdded()) {
         long var1 = this.mExerciseStatistics.getExercise().getDuration();
         float var3 = this.mExerciseStatistics.getExercise().getDistance();
         this.mExerciseStatistics.setAverageSpeed(this.mSpeedStatistics.b(var1, (double)var3));
         this.mExerciseStatistics.setMaximumSpeed(this.mSpeedStatistics.c(var1, (double)var3));
      }

      this.mExerciseStatistics.setAverageHeartrate(Math.round(this.mHeartrateStatistics.c_getAverage()));
      this.mExerciseStatistics.setMaximumHeartrate(Math.round(this.mHeartrateStatistics.e_getMax()));
      this.mExerciseStatistics.setMinimumHeartrate(Math.round(this.mHeartrateStatistics.d_getMin()));
      if (this.mAltitudeStatistics.g_areAnySamplesAdded()) {
         this.mExerciseStatistics.setMaximumAltitude(this.mAltitudeStatistics.e_getMax());
         this.mExerciseStatistics.setMinimumAltitude(this.mAltitudeStatistics.d_getMin());
         this.mExerciseStatistics.setAverageAltitude(this.mAltitudeStatistics.c_getAverage());
      }

      if (this.mCadenceStatistics.b()) {
         this.mExerciseStatistics.setAverageCadence(this.mCadenceStatistics.d());
         this.mExerciseStatistics.setMaximumCadence(this.mCadenceStatistics.e());
      }

      if (this.mSwimmingSpeedStatistics.h()) {
         this.mExerciseStatistics.setAverageSpeed(this.mSwimmingSpeedStatistics.f());
         this.mExerciseStatistics.setMaximumSpeed(this.mSwimmingSpeedStatistics.g());
      }

      if (this.mSwimmingStatistics != null) {
         this.mExerciseStatistics.setSwimmingStatistics(this.mSwimmingStatistics);
      }

      this.mExerciseStatistics.save();
   }

   public void setExercise(Exercise var1) {
      this.mExerciseStatistics.setExercise(var1);
   }

   public void setSwimmingStatistics(SwimmingStatistics var1) {
      this.mSwimmingStatistics = var1;
   }
}
