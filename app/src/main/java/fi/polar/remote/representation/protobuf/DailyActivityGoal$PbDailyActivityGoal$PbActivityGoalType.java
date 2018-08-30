package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum DailyActivityGoal$PbDailyActivityGoal$PbActivityGoalType implements ProtocolMessageEnum {
   ACTIVITY_GOAL_DAILY_ACTIVITY(1);

   public static final int ACTIVITY_GOAL_DAILY_ACTIVITY_VALUE = 1;
   ACTIVITY_GOAL_WEIGHT_LOSS(2);

   public static final int ACTIVITY_GOAL_WEIGHT_LOSS_VALUE = 2;
   ACTIVITY_GOAL_WEIGHT_MAINTAIN(3);

   public static final int ACTIVITY_GOAL_WEIGHT_MAINTAIN_VALUE = 3;
   private static final DailyActivityGoal$PbDailyActivityGoal$PbActivityGoalType[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new DailyActivityGoal$PbDailyActivityGoal$PbActivityGoalType$1();
   private final int value;

   private DailyActivityGoal$PbDailyActivityGoal$PbActivityGoalType(int var3) {
      this.value = var3;
   }

   public static DailyActivityGoal$PbDailyActivityGoal$PbActivityGoalType forNumber(int var0) {
      DailyActivityGoal$PbDailyActivityGoal$PbActivityGoalType var1;
      switch(var0) {
      case 1:
         var1 = ACTIVITY_GOAL_DAILY_ACTIVITY;
         break;
      case 2:
         var1 = ACTIVITY_GOAL_WEIGHT_LOSS;
         break;
      case 3:
         var1 = ACTIVITY_GOAL_WEIGHT_MAINTAIN;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)DailyActivityGoal$PbDailyActivityGoal.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static DailyActivityGoal$PbDailyActivityGoal$PbActivityGoalType valueOf(int var0) {
      return forNumber(var0);
   }

   public static DailyActivityGoal$PbDailyActivityGoal$PbActivityGoalType valueOf(EnumValueDescriptor var0) {
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
