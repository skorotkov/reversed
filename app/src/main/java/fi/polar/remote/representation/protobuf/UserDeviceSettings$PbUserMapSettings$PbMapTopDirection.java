package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum UserDeviceSettings$PbUserMapSettings$PbMapTopDirection implements ProtocolMessageEnum {
   TOP_DIRECTION_HEADING(2);

   public static final int TOP_DIRECTION_HEADING_VALUE = 2;
   TOP_DIRECTION_NORTH(1);

   public static final int TOP_DIRECTION_NORTH_VALUE = 1;
   private static final UserDeviceSettings$PbUserMapSettings$PbMapTopDirection[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new UserDeviceSettings$PbUserMapSettings$PbMapTopDirection$1();
   private final int value;

   private UserDeviceSettings$PbUserMapSettings$PbMapTopDirection(int var3) {
      this.value = var3;
   }

   public static UserDeviceSettings$PbUserMapSettings$PbMapTopDirection forNumber(int var0) {
      UserDeviceSettings$PbUserMapSettings$PbMapTopDirection var1;
      switch(var0) {
      case 1:
         var1 = TOP_DIRECTION_NORTH;
         break;
      case 2:
         var1 = TOP_DIRECTION_HEADING;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)UserDeviceSettings$PbUserMapSettings.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static UserDeviceSettings$PbUserMapSettings$PbMapTopDirection valueOf(int var0) {
      return forNumber(var0);
   }

   public static UserDeviceSettings$PbUserMapSettings$PbMapTopDirection valueOf(EnumValueDescriptor var0) {
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
