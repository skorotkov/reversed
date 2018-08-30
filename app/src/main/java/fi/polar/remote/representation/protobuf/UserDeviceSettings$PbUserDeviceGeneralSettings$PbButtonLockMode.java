package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum UserDeviceSettings$PbUserDeviceGeneralSettings$PbButtonLockMode implements ProtocolMessageEnum {
   AUTO(2),

   MANUAL(1);

   public static final int AUTO_VALUE = 2;
   public static final int MANUAL_VALUE = 1;
   private static final UserDeviceSettings$PbUserDeviceGeneralSettings$PbButtonLockMode[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new UserDeviceSettings$PbUserDeviceGeneralSettings$PbButtonLockMode$1();
   private final int value;

   private UserDeviceSettings$PbUserDeviceGeneralSettings$PbButtonLockMode(int var3) {
      this.value = var3;
   }

   public static UserDeviceSettings$PbUserDeviceGeneralSettings$PbButtonLockMode forNumber(int var0) {
      UserDeviceSettings$PbUserDeviceGeneralSettings$PbButtonLockMode var1;
      switch(var0) {
      case 1:
         var1 = MANUAL;
         break;
      case 2:
         var1 = AUTO;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)UserDeviceSettings$PbUserDeviceGeneralSettings.getDescriptor().getEnumTypes().get(1);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static UserDeviceSettings$PbUserDeviceGeneralSettings$PbButtonLockMode valueOf(int var0) {
      return forNumber(var0);
   }

   public static UserDeviceSettings$PbUserDeviceGeneralSettings$PbButtonLockMode valueOf(EnumValueDescriptor var0) {
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
