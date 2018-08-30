package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbExerciseTargetType implements ProtocolMessageEnum {
   EXERCISE_TARGET_TYPE_FREE(0);

   public static final int EXERCISE_TARGET_TYPE_FREE_VALUE = 0;
   EXERCISE_TARGET_TYPE_PHASED(2);

   public static final int EXERCISE_TARGET_TYPE_PHASED_VALUE = 2;
   EXERCISE_TARGET_TYPE_ROUTE(3),
   EXERCISE_TARGET_TYPE_ROUTE_RACE_PACE(5);

   public static final int EXERCISE_TARGET_TYPE_ROUTE_RACE_PACE_VALUE = 5;
   public static final int EXERCISE_TARGET_TYPE_ROUTE_VALUE = 3;
   EXERCISE_TARGET_TYPE_STEADY_RACE_PACE(4);

   public static final int EXERCISE_TARGET_TYPE_STEADY_RACE_PACE_VALUE = 4;
   EXERCISE_TARGET_TYPE_STRAVA_SEGMENT(6);

   public static final int EXERCISE_TARGET_TYPE_STRAVA_SEGMENT_VALUE = 6;
   EXERCISE_TARGET_TYPE_VOLUME(1);

   public static final int EXERCISE_TARGET_TYPE_VOLUME_VALUE = 1;
   private static final Types$PbExerciseTargetType[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbExerciseTargetType$1();
   private final int value;

   private Types$PbExerciseTargetType(int var3) {
      this.value = var3;
   }

   public static Types$PbExerciseTargetType forNumber(int var0) {
      Types$PbExerciseTargetType var1;
      switch(var0) {
      case 0:
         var1 = EXERCISE_TARGET_TYPE_FREE;
         break;
      case 1:
         var1 = EXERCISE_TARGET_TYPE_VOLUME;
         break;
      case 2:
         var1 = EXERCISE_TARGET_TYPE_PHASED;
         break;
      case 3:
         var1 = EXERCISE_TARGET_TYPE_ROUTE;
         break;
      case 4:
         var1 = EXERCISE_TARGET_TYPE_STEADY_RACE_PACE;
         break;
      case 5:
         var1 = EXERCISE_TARGET_TYPE_ROUTE_RACE_PACE;
         break;
      case 6:
         var1 = EXERCISE_TARGET_TYPE_STRAVA_SEGMENT;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(19);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbExerciseTargetType valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbExerciseTargetType valueOf(EnumValueDescriptor var0) {
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
