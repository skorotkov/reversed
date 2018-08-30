package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum SportProfile$PbSprintDetection$PbSprintDetectionSource implements ProtocolMessageEnum {
   SPRINT_DETECTION_OFF(0);

   public static final int SPRINT_DETECTION_OFF_VALUE = 0;
   SPRINT_DETECTION_SOURCE_ACCELERATION(1);

   public static final int SPRINT_DETECTION_SOURCE_ACCELERATION_VALUE = 1;
   SPRINT_DETECTION_SOURCE_SPEED(2);

   public static final int SPRINT_DETECTION_SOURCE_SPEED_VALUE = 2;
   private static final SportProfile$PbSprintDetection$PbSprintDetectionSource[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new SportProfile$PbSprintDetection$PbSprintDetectionSource$1();
   private final int value;

   private SportProfile$PbSprintDetection$PbSprintDetectionSource(int var3) {
      this.value = var3;
   }

   public static SportProfile$PbSprintDetection$PbSprintDetectionSource forNumber(int var0) {
      SportProfile$PbSprintDetection$PbSprintDetectionSource var1;
      switch(var0) {
      case 0:
         var1 = SPRINT_DETECTION_OFF;
         break;
      case 1:
         var1 = SPRINT_DETECTION_SOURCE_ACCELERATION;
         break;
      case 2:
         var1 = SPRINT_DETECTION_SOURCE_SPEED;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)SportProfile$PbSprintDetection.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static SportProfile$PbSprintDetection$PbSprintDetectionSource valueOf(int var0) {
      return forNumber(var0);
   }

   public static SportProfile$PbSprintDetection$PbSprintDetectionSource valueOf(EnumValueDescriptor var0) {
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
