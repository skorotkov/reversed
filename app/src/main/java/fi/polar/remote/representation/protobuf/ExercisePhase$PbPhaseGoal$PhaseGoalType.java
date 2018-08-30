package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum ExercisePhase$PbPhaseGoal$PhaseGoalType implements ProtocolMessageEnum {
   PHASE_GOAL_DECREASING_HR(4),

   PHASE_GOAL_DISTANCE(2),

   PHASE_GOAL_INCREASING_HR(3),

   PHASE_GOAL_OFF(0),

   PHASE_GOAL_RACE_PACE(5),

   PHASE_GOAL_TIME(1);

   public static final int PHASE_GOAL_RACE_PACE_VALUE = 5;
   public static final int PHASE_GOAL_DECREASING_HR_VALUE = 4;
   public static final int PHASE_GOAL_DISTANCE_VALUE = 2;
   public static final int PHASE_GOAL_INCREASING_HR_VALUE = 3;
   public static final int PHASE_GOAL_OFF_VALUE = 0;
   public static final int PHASE_GOAL_TIME_VALUE = 1;
   private static final ExercisePhase$PbPhaseGoal$PhaseGoalType[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new ExercisePhase$PbPhaseGoal$PhaseGoalType$1();
   private final int value;

   private ExercisePhase$PbPhaseGoal$PhaseGoalType(int var3) {
      this.value = var3;
   }

   public static ExercisePhase$PbPhaseGoal$PhaseGoalType forNumber(int var0) {
      ExercisePhase$PbPhaseGoal$PhaseGoalType var1;
      switch(var0) {
      case 0:
         var1 = PHASE_GOAL_OFF;
         break;
      case 1:
         var1 = PHASE_GOAL_TIME;
         break;
      case 2:
         var1 = PHASE_GOAL_DISTANCE;
         break;
      case 3:
         var1 = PHASE_GOAL_INCREASING_HR;
         break;
      case 4:
         var1 = PHASE_GOAL_DECREASING_HR;
         break;
      case 5:
         var1 = PHASE_GOAL_RACE_PACE;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)ExercisePhase$PbPhaseGoal.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static ExercisePhase$PbPhaseGoal$PhaseGoalType valueOf(int var0) {
      return forNumber(var0);
   }

   public static ExercisePhase$PbPhaseGoal$PhaseGoalType valueOf(EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return VALUES[var0.getIndex()];
      }
   }

   public final EnumDescriptor getDescriptorForType() {
      return getDescriptor();
   }

   public final int getNumber() {
      return this.value;
   }

   public final EnumValueDescriptor getValueDescriptor() {
      return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
   }
}
