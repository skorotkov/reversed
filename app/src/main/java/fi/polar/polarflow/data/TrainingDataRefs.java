package fi.polar.polarflow.data;

import fi.polar.polarflow.data.orm.Exercise;
import fi.polar.polarflow.data.orm.ExercisePhaseStats;
import fi.polar.polarflow.data.orm.ExerciseTargetInfo;
import fi.polar.polarflow.data.orm.PhysData;
import fi.polar.polarflow.data.orm.SportProfile;
import fi.polar.polarflow.data.orm.SwimmingSamples;
import fi.polar.polarflow.data.orm.TrainingSession;
import fi.polar.polarflow.data.orm.TrainingSessionTarget;

public class TrainingDataRefs {
   public final Exercise mExercise;
   public final ExercisePhaseStats mExercisePhaseStats;
   public final ExerciseTargetInfo mExerciseTargetInfo;
   public final PhysData mPhysDataSnapshot;
   public final TrainingSamples mSamples;
   public final SportProfile mSportProfile;
   public final SwimmingSamples mSwimmingSamples;
   public final TrainingLaps mTrainingLaps;
   public final TrainingSession mTrainingSession;
   public final TrainingSessionTarget mTrainingSessionTarget;

   TrainingDataRefs(TrainingSession var1, Exercise var2, TrainingSamples var3, TrainingLaps var4, TrainingSessionTarget var5, ExerciseTargetInfo var6, ExercisePhaseStats var7, PhysData var8, SportProfile var9, SwimmingSamples var10) {
      this.mTrainingSession = var1;
      this.mExercise = var2;
      this.mSamples = var3;
      this.mSwimmingSamples = var10;
      this.mTrainingLaps = var4;
      this.mTrainingSessionTarget = var5;
      this.mExerciseTargetInfo = var6;
      this.mExercisePhaseStats = var7;
      this.mPhysDataSnapshot = var8;
      this.mSportProfile = var9;
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
}
