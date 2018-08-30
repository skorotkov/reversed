package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightActivationLevel implements ProtocolMessageEnum {
   ACTIVATION_LEVEL_DARK(1),

   ACTIVATION_LEVEL_DUSK(2),

   ACTIVATION_LEVEL_LIGHT(3);

   public static final int ACTIVATION_LEVEL_LIGHT_VALUE = 3;
   public static final int ACTIVATION_LEVEL_DUSK_VALUE = 2;
   public static final int ACTIVATION_LEVEL_DARK_VALUE = 1;
   private static final UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightActivationLevel[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightActivationLevel$1();
   private final int value;

   private UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightActivationLevel(int var3) {
      this.value = var3;
   }

   public static UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightActivationLevel forNumber(int var0) {
      UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightActivationLevel var1;
      switch(var0) {
      case 1:
         var1 = ACTIVATION_LEVEL_DARK;
         break;
      case 2:
         var1 = ACTIVATION_LEVEL_DUSK;
         break;
      case 3:
         var1 = ACTIVATION_LEVEL_LIGHT;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)UserDeviceSettings$PbUserSafetyLightSettings.getDescriptor().getEnumTypes().get(1);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightActivationLevel valueOf(int var0) {
      return forNumber(var0);
   }

   public static UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightActivationLevel valueOf(EnumValueDescriptor var0) {
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
