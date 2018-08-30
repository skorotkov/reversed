package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightMode implements ProtocolMessageEnum {
   SAFETY_LIGHT_AUTOMATIC(2);

   public static final int SAFETY_LIGHT_AUTOMATIC_VALUE = 2;
   SAFETY_LIGHT_MANUAL(1);

   public static final int SAFETY_LIGHT_MANUAL_VALUE = 1;
   private static final UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightMode[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightMode$1();
   private final int value;

   private UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightMode(int var3) {
      this.value = var3;
   }

   public static UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightMode forNumber(int var0) {
      UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightMode var1;
      switch(var0) {
      case 1:
         var1 = SAFETY_LIGHT_MANUAL;
         break;
      case 2:
         var1 = SAFETY_LIGHT_AUTOMATIC;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)UserDeviceSettings$PbUserSafetyLightSettings.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightMode valueOf(int var0) {
      return forNumber(var0);
   }

   public static UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightMode valueOf(EnumValueDescriptor var0) {
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
