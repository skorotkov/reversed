package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum ExercisePhase$PbPhaseIntensity$PhaseIntensityType implements ProtocolMessageEnum {
   PHASE_INTENSITY_FREE(0);

   public static final int PHASE_INTENSITY_FREE_VALUE = 0;
   PHASE_INTENSITY_POWER_ZONE(3);

   public static final int PHASE_INTENSITY_POWER_ZONE_VALUE = 3;
   PHASE_INTENSITY_SPEED_ZONE(2);

   public static final int PHASE_INTENSITY_SPEED_ZONE_VALUE = 2;
   PHASE_INTENSITY_SPORTZONE(1);

   public static final int PHASE_INTENSITY_SPORTZONE_VALUE = 1;
   private static final ExercisePhase$PbPhaseIntensity$PhaseIntensityType[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new ExercisePhase$PbPhaseIntensity$PhaseIntensityType$1();
   private final int value;

   private ExercisePhase$PbPhaseIntensity$PhaseIntensityType(int var3) {
      this.value = var3;
   }

   public static ExercisePhase$PbPhaseIntensity$PhaseIntensityType forNumber(int var0) {
      ExercisePhase$PbPhaseIntensity$PhaseIntensityType var1;
      switch(var0) {
      case 0:
         var1 = PHASE_INTENSITY_FREE;
         break;
      case 1:
         var1 = PHASE_INTENSITY_SPORTZONE;
         break;
      case 2:
         var1 = PHASE_INTENSITY_SPEED_ZONE;
         break;
      case 3:
         var1 = PHASE_INTENSITY_POWER_ZONE;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)ExercisePhase$PbPhaseIntensity.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static ExercisePhase$PbPhaseIntensity$PhaseIntensityType valueOf(int var0) {
      return forNumber(var0);
   }

   public static ExercisePhase$PbPhaseIntensity$PhaseIntensityType valueOf(EnumValueDescriptor var0) {
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
