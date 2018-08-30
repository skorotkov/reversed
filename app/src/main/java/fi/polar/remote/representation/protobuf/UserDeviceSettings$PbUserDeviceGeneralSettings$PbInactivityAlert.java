package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum UserDeviceSettings$PbUserDeviceGeneralSettings$PbInactivityAlert implements ProtocolMessageEnum {
   INACTIVITY_ALERT_OFF(1),

   INACTIVITY_ALERT_ON(2);

   public static final int INACTIVITY_ALERT_OFF_VALUE = 1;
   public static final int INACTIVITY_ALERT_ON_VALUE = 2;
   private static final UserDeviceSettings$PbUserDeviceGeneralSettings$PbInactivityAlert[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new UserDeviceSettings$PbUserDeviceGeneralSettings$PbInactivityAlert$1();
   private final int value;

   private UserDeviceSettings$PbUserDeviceGeneralSettings$PbInactivityAlert(int var3) {
      this.value = var3;
   }

   public static UserDeviceSettings$PbUserDeviceGeneralSettings$PbInactivityAlert forNumber(int var0) {
      UserDeviceSettings$PbUserDeviceGeneralSettings$PbInactivityAlert var1;
      switch(var0) {
      case 1:
         var1 = INACTIVITY_ALERT_OFF;
         break;
      case 2:
         var1 = INACTIVITY_ALERT_ON;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)UserDeviceSettings$PbUserDeviceGeneralSettings.getDescriptor().getEnumTypes().get(3);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static UserDeviceSettings$PbUserDeviceGeneralSettings$PbInactivityAlert valueOf(int var0) {
      return forNumber(var0);
   }

   public static UserDeviceSettings$PbUserDeviceGeneralSettings$PbInactivityAlert valueOf(EnumValueDescriptor var0) {
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
