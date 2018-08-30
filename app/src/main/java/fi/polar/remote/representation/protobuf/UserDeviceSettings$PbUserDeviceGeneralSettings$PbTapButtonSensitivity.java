package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum UserDeviceSettings$PbUserDeviceGeneralSettings$PbTapButtonSensitivity implements ProtocolMessageEnum {
   TAP_BUTTON_SENSITIVITY_HIGH(4);

   public static final int TAP_BUTTON_SENSITIVITY_HIGH_VALUE = 4;
   TAP_BUTTON_SENSITIVITY_LOW(2);

   public static final int TAP_BUTTON_SENSITIVITY_LOW_VALUE = 2;
   TAP_BUTTON_SENSITIVITY_MEDIUM(3);

   public static final int TAP_BUTTON_SENSITIVITY_MEDIUM_VALUE = 3;
   TAP_BUTTON_SENSITIVITY_OFF(1);

   public static final int TAP_BUTTON_SENSITIVITY_OFF_VALUE = 1;
   TAP_BUTTON_SENSITIVITY_VERY_LOW(5);

   public static final int TAP_BUTTON_SENSITIVITY_VERY_LOW_VALUE = 5;
   private static final UserDeviceSettings$PbUserDeviceGeneralSettings$PbTapButtonSensitivity[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new UserDeviceSettings$PbUserDeviceGeneralSettings$PbTapButtonSensitivity$1();
   private final int value;

   private UserDeviceSettings$PbUserDeviceGeneralSettings$PbTapButtonSensitivity(int var3) {
      this.value = var3;
   }

   public static UserDeviceSettings$PbUserDeviceGeneralSettings$PbTapButtonSensitivity forNumber(int var0) {
      UserDeviceSettings$PbUserDeviceGeneralSettings$PbTapButtonSensitivity var1;
      switch(var0) {
      case 1:
         var1 = TAP_BUTTON_SENSITIVITY_OFF;
         break;
      case 2:
         var1 = TAP_BUTTON_SENSITIVITY_LOW;
         break;
      case 3:
         var1 = TAP_BUTTON_SENSITIVITY_MEDIUM;
         break;
      case 4:
         var1 = TAP_BUTTON_SENSITIVITY_HIGH;
         break;
      case 5:
         var1 = TAP_BUTTON_SENSITIVITY_VERY_LOW;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)UserDeviceSettings$PbUserDeviceGeneralSettings.getDescriptor().getEnumTypes().get(2);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static UserDeviceSettings$PbUserDeviceGeneralSettings$PbTapButtonSensitivity valueOf(int var0) {
      return forNumber(var0);
   }

   public static UserDeviceSettings$PbUserDeviceGeneralSettings$PbTapButtonSensitivity valueOf(EnumValueDescriptor var0) {
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
