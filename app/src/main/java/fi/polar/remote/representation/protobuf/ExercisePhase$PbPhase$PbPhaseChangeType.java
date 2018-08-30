package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum ExercisePhase$PbPhase$PbPhaseChangeType implements ProtocolMessageEnum {
   CHANGE_AUTOMATIC(1);

   public static final int CHANGE_AUTOMATIC_VALUE = 1;
   CHANGE_MANUAL(0);

   public static final int CHANGE_MANUAL_VALUE = 0;
   private static final ExercisePhase$PbPhase$PbPhaseChangeType[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new ExercisePhase$PbPhase$PbPhaseChangeType$1();
   private final int value;

   private ExercisePhase$PbPhase$PbPhaseChangeType(int var3) {
      this.value = var3;
   }

   public static ExercisePhase$PbPhase$PbPhaseChangeType forNumber(int var0) {
      ExercisePhase$PbPhase$PbPhaseChangeType var1;
      switch(var0) {
      case 0:
         var1 = CHANGE_MANUAL;
         break;
      case 1:
         var1 = CHANGE_AUTOMATIC;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)ExercisePhase$PbPhase.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static ExercisePhase$PbPhase$PbPhaseChangeType valueOf(int var0) {
      return forNumber(var0);
   }

   public static ExercisePhase$PbPhase$PbPhaseChangeType valueOf(EnumValueDescriptor var0) {
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
