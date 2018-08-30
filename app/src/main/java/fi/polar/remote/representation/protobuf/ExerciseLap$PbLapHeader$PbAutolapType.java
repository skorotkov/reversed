package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum ExerciseLap$PbLapHeader$PbAutolapType implements ProtocolMessageEnum {
   AUTOLAP_TYPE_DISTANCE(1);

   public static final int AUTOLAP_TYPE_DISTANCE_VALUE = 1;
   AUTOLAP_TYPE_DURATION(2);

   public static final int AUTOLAP_TYPE_DURATION_VALUE = 2;
   AUTOLAP_TYPE_LOCATION(3);

   public static final int AUTOLAP_TYPE_LOCATION_VALUE = 3;
   private static final ExerciseLap$PbLapHeader$PbAutolapType[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new ExerciseLap$PbLapHeader$PbAutolapType$1();
   private final int value;

   private ExerciseLap$PbLapHeader$PbAutolapType(int var3) {
      this.value = var3;
   }

   public static ExerciseLap$PbLapHeader$PbAutolapType forNumber(int var0) {
      ExerciseLap$PbLapHeader$PbAutolapType var1;
      switch(var0) {
      case 1:
         var1 = AUTOLAP_TYPE_DISTANCE;
         break;
      case 2:
         var1 = AUTOLAP_TYPE_DURATION;
         break;
      case 3:
         var1 = AUTOLAP_TYPE_LOCATION;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)ExerciseLap$PbLapHeader.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static ExerciseLap$PbLapHeader$PbAutolapType valueOf(int var0) {
      return forNumber(var0);
   }

   public static ExerciseLap$PbLapHeader$PbAutolapType valueOf(EnumValueDescriptor var0) {
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
