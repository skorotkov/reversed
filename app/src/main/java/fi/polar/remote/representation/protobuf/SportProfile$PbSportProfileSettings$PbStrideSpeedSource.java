package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum SportProfile$PbSportProfileSettings$PbStrideSpeedSource implements ProtocolMessageEnum {
   STRIDE_SPEED_SOURCE_GPS(2);

   public static final int STRIDE_SPEED_SOURCE_GPS_VALUE = 2;
   STRIDE_SPEED_SOURCE_STRIDE(1);

   public static final int STRIDE_SPEED_SOURCE_STRIDE_VALUE = 1;
   private static final SportProfile$PbSportProfileSettings$PbStrideSpeedSource[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new SportProfile$PbSportProfileSettings$PbStrideSpeedSource$1();
   private final int value;

   private SportProfile$PbSportProfileSettings$PbStrideSpeedSource(int var3) {
      this.value = var3;
   }

   public static SportProfile$PbSportProfileSettings$PbStrideSpeedSource forNumber(int var0) {
      SportProfile$PbSportProfileSettings$PbStrideSpeedSource var1;
      switch(var0) {
      case 1:
         var1 = STRIDE_SPEED_SOURCE_STRIDE;
         break;
      case 2:
         var1 = STRIDE_SPEED_SOURCE_GPS;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)SportProfile$PbSportProfileSettings.getDescriptor().getEnumTypes().get(3);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static SportProfile$PbSportProfileSettings$PbStrideSpeedSource valueOf(int var0) {
      return forNumber(var0);
   }

   public static SportProfile$PbSportProfileSettings$PbStrideSpeedSource valueOf(EnumValueDescriptor var0) {
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
