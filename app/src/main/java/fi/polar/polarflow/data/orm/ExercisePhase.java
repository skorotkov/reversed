package fi.polar.polarflow.data.orm;

import com.orm.dsl.Ignore;
import fi.polar.polarflow.util.d;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.ExercisePhase$PbPhase;
import fi.polar.remote.representation.protobuf.ExercisePhase$PbPhase$Builder;
import fi.polar.remote.representation.protobuf.ExercisePhase$PbPhase$PbPhaseChangeType;
import fi.polar.remote.representation.protobuf.ExercisePhase$PbPhaseGoal;
import fi.polar.remote.representation.protobuf.ExercisePhase$PbPhaseGoal$Builder;
import fi.polar.remote.representation.protobuf.ExercisePhase$PbPhaseGoal$PhaseGoalType;
import fi.polar.remote.representation.protobuf.ExercisePhase$PbPhaseIntensity;
import fi.polar.remote.representation.protobuf.ExercisePhase$PbPhaseIntensity$Builder;
import fi.polar.remote.representation.protobuf.ExercisePhase$PbPhaseIntensity$IntensityZone;
import fi.polar.remote.representation.protobuf.ExercisePhase$PbPhaseIntensity$IntensityZone$Builder;
import fi.polar.remote.representation.protobuf.ExercisePhase$PbPhaseIntensity$PhaseIntensityType;
import fi.polar.remote.representation.protobuf.Structures$PbOneLineText;
import java.io.InputStream;

public class ExercisePhase extends ProtoEncodableEntity {
   public static final int PHASE_CHANGE_AUTOMATIC = 1;
   public static final int PHASE_CHANGE_MANUAL = 0;
   public static final int PHASE_GOAL_DECREASING_HR = 4;
   public static final int PHASE_GOAL_DISTANCE = 2;
   public static final int PHASE_GOAL_INCREASING_HR = 3;
   public static final int PHASE_GOAL_OFF = 0;
   public static final int PHASE_GOAL_RACE_PACE = 5;
   public static final int PHASE_GOAL_TIME = 1;
   public static final int PHASE_INTENSITY_FREE = 0;
   public static final int PHASE_INTENSITY_POWER_ZONE = 3;
   public static final int PHASE_INTENSITY_SPEED_ZONE = 2;
   public static final int PHASE_INTENSITY_SPORT_ZONE = 1;
   private static final String TAG = ExercisePhase.class.getSimpleName();
   private int changeType;
   private long exerciseTarget;
   private long exerciseTargetInfo;
   private float goalDistance;
   private long goalDuration;
   private int goalHeartRate;
   private int goalType;
   private int intensityType;
   private int intensityZoneLower;
   private int intensityZoneUpper;
   private int jumpIndex;
   @Ignore
   private int mIndex;
   @Ignore
   private long mStartTime;
   @Ignore
   private int mTotalExecutionCount;
   private String name;
   private int repeatCount;

   public ExercisePhase() {
      this.exerciseTarget = 0L;
      this.exerciseTargetInfo = 0L;
      this.name = "";
      this.changeType = 0;
      this.goalType = 0;
      this.goalDuration = -1L;
      this.goalDistance = -1.0F;
      this.goalHeartRate = 0;
      this.intensityType = 0;
      this.intensityZoneLower = -1;
      this.intensityZoneUpper = -1;
      this.repeatCount = -1;
      this.jumpIndex = -1;
      this.mIndex = 0;
      this.mTotalExecutionCount = 0;
      this.mStartTime = -1L;
   }

   public ExercisePhase(ExercisePhase var1) {
      this.exerciseTarget = 0L;
      this.exerciseTargetInfo = 0L;
      this.name = "";
      this.changeType = 0;
      this.goalType = 0;
      this.goalDuration = -1L;
      this.goalDistance = -1.0F;
      this.goalHeartRate = 0;
      this.intensityType = 0;
      this.intensityZoneLower = -1;
      this.intensityZoneUpper = -1;
      this.repeatCount = -1;
      this.jumpIndex = -1;
      this.mIndex = 0;
      this.mTotalExecutionCount = 0;
      this.mStartTime = -1L;
      this.exerciseTargetInfo = var1.exerciseTargetInfo;
      this.name = var1.name;
      this.changeType = var1.changeType;
      this.goalType = var1.goalType;
      this.goalDuration = var1.goalDuration;
      this.goalDistance = var1.goalDistance;
      this.goalHeartRate = var1.goalHeartRate;
      this.intensityType = var1.intensityType;
      this.intensityZoneLower = var1.intensityZoneLower;
      this.intensityZoneUpper = var1.intensityZoneUpper;
      this.repeatCount = var1.repeatCount;
      this.jumpIndex = var1.jumpIndex;
   }

   public ExercisePhase(ExercisePhase$PbPhase var1) {
      this();
      if (var1.hasName()) {
         this.name = var1.getName().getText();
      }

      if (var1.hasChange()) {
         this.changeType = var1.getChange().getNumber();
      }

      if (var1.hasRepeatCount()) {
         this.repeatCount = var1.getRepeatCount();
      }

      if (var1.hasJumpIndex()) {
         this.jumpIndex = var1.getJumpIndex();
      }

      if (var1.hasGoal()) {
         ExercisePhase$PbPhaseGoal var2 = var1.getGoal();
         if (var2.hasGoalType()) {
            this.goalType = var2.getGoalType().getNumber();
         }

         if (var2.hasDistance()) {
            this.goalDistance = var2.getDistance();
         }

         if (var2.hasDuration()) {
            this.goalDuration = q.a(var2.getDuration());
         }

         if (var2.hasHeartRate()) {
            this.goalHeartRate = var2.getHeartRate();
         }
      }

      if (var1.hasIntensity()) {
         ExercisePhase$PbPhaseIntensity var4 = var1.getIntensity();
         if (var4.hasIntensityType()) {
            this.intensityType = var4.getIntensityType().getNumber();
         }

         ExercisePhase$PbPhaseIntensity$IntensityZone var3 = null;
         if (var4.hasHeartRateZone()) {
            var3 = var4.getHeartRateZone();
         } else if (var4.hasSpeedZone()) {
            var3 = var4.getSpeedZone();
         } else if (var4.hasPowerZone()) {
            var3 = var4.getPowerZone();
         }

         if (var3 != null) {
            if (var3.hasLower()) {
               this.intensityZoneLower = var3.getLower();
            }

            if (var3.hasUpper()) {
               this.intensityZoneUpper = var3.getUpper();
            }
         }
      }

   }

   public ExercisePhase(InputStream var1) {
      this(ExercisePhase$PbPhase.parseFrom(var1));
   }

   public int getChangeType() {
      return this.changeType;
   }

   public float getGoalDistance() {
      return this.goalDistance;
   }

   public long getGoalDuration() {
      return this.goalDuration;
   }

   public int getGoalHr() {
      return this.goalHeartRate;
   }

   public int getGoalType() {
      return this.goalType;
   }

   public int getIndex() {
      return this.mIndex;
   }

   public int getIntensityType() {
      return this.intensityType;
   }

   public int getIntensityZoneLower() {
      return this.intensityZoneLower;
   }

   public int getIntensityZoneUpper() {
      return this.intensityZoneUpper;
   }

   public int getJumpIndex() {
      return this.jumpIndex;
   }

   public String getName() {
      return this.name;
   }

   public int getRepeatCount() {
      return this.repeatCount;
   }

   public long getStartTime() {
      return this.mStartTime;
   }

   public int getTotalExecutionCount() {
      return this.mTotalExecutionCount;
   }

   public void increaseTotalExecutionCount() {
      ++this.mTotalExecutionCount;
   }

   public void setChangeType(int var1) {
      this.changeType = var1;
   }

   public void setExerciseTargetId(long var1) {
      this.exerciseTarget = var1;
      this.exerciseTargetInfo = 0L;
   }

   public void setExerciseTargetInfoId(long var1) {
      this.exerciseTargetInfo = var1;
      this.exerciseTarget = 0L;
   }

   public void setGoalDistance(float var1) {
      this.goalDistance = var1;
   }

   public void setGoalDuration(long var1) {
      this.goalDuration = var1;
   }

   public void setGoalHr(int var1) {
      this.goalHeartRate = var1;
   }

   public void setGoalType(int var1) {
      this.goalType = var1;
   }

   public void setIndex(int var1) {
      this.mIndex = var1;
   }

   public void setIntensityType(int var1) {
      this.intensityType = var1;
   }

   public void setIntensityZoneLower(int var1) {
      this.intensityZoneLower = var1;
   }

   public void setIntensityZoneUpper(int var1) {
      this.intensityZoneUpper = var1;
   }

   public void setJumpIndex(int var1) {
      this.jumpIndex = var1;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public void setRepeatCount(int var1) {
      this.repeatCount = var1;
   }

   public void setStartTime(long var1) {
      this.mStartTime = var1;
   }

   public void setTotalExecutionCount(int var1) {
      this.mTotalExecutionCount = var1;
   }

   public ExercisePhase$PbPhase toPbObject() {
      ExercisePhase$PbPhase$Builder var1 = ExercisePhase$PbPhase.newBuilder();
      var1.setName(Structures$PbOneLineText.newBuilder().setText(this.getName()));
      var1.setChange(ExercisePhase$PbPhase$PbPhaseChangeType.forNumber(this.changeType));
      ExercisePhase$PbPhaseGoal$Builder var2 = ExercisePhase$PbPhaseGoal.newBuilder();
      var2.setGoalType(ExercisePhase$PbPhaseGoal$PhaseGoalType.forNumber(this.goalType));
      if (this.goalType == 2) {
         if (this.goalDistance != -1.0F) {
            var2.setDistance(this.goalDistance);
         }
      } else if (this.goalType == 1) {
         if (this.goalDuration != 0L) {
            var2.setDuration(q.b(this.goalDuration));
         }
      } else if (this.goalType != 4 && this.goalType != 3) {
         d.b(TAG, "Unsupported goal type!");
      } else if (this.goalHeartRate != -1) {
         var2.setHeartRate(this.goalHeartRate);
      }

      var1.setGoal(var2);
      ExercisePhase$PbPhaseIntensity$Builder var4 = ExercisePhase$PbPhaseIntensity.newBuilder();
      var4.setIntensityType(ExercisePhase$PbPhaseIntensity$PhaseIntensityType.forNumber(this.intensityType));
      ExercisePhase$PbPhaseIntensity$IntensityZone$Builder var3 = ExercisePhase$PbPhaseIntensity$IntensityZone.newBuilder();
      if (this.intensityZoneLower != -1) {
         var3.setLower(this.intensityZoneLower);
      }

      if (this.intensityZoneUpper != -1) {
         var3.setUpper(this.intensityZoneUpper);
      }

      if (this.intensityType == 3) {
         var4.setPowerZone(var3);
      } else if (this.intensityType == 2) {
         var4.setSpeedZone(var3);
      } else if (this.intensityType == 1) {
         var4.setHeartRateZone(var3);
      }

      var1.setIntensity(var4);
      if (this.repeatCount != -1) {
         var1.setRepeatCount(this.getRepeatCount());
      }

      if (this.jumpIndex != -1) {
         var1.setJumpIndex(this.jumpIndex);
      }

      return var1.build();
   }
}
