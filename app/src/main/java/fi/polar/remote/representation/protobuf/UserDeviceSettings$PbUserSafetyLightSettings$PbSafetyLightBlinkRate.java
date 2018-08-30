package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightBlinkRate implements ProtocolMessageEnum {
   BLINK_RATE_FAST(3);

   public static final int BLINK_RATE_FAST_VALUE = 3;
   BLINK_RATE_OFF(1);

   public static final int BLINK_RATE_OFF_VALUE = 1;
   BLINK_RATE_SLOW(2);

   public static final int BLINK_RATE_SLOW_VALUE = 2;
   BLINK_RATE_VERY_FAST(4);

   public static final int BLINK_RATE_VERY_FAST_VALUE = 4;
   private static final UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightBlinkRate[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightBlinkRate$1();
   private final int value;

   private UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightBlinkRate(int var3) {
      this.value = var3;
   }

   public static UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightBlinkRate forNumber(int var0) {
      UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightBlinkRate var1;
      switch(var0) {
      case 1:
         var1 = BLINK_RATE_OFF;
         break;
      case 2:
         var1 = BLINK_RATE_SLOW;
         break;
      case 3:
         var1 = BLINK_RATE_FAST;
         break;
      case 4:
         var1 = BLINK_RATE_VERY_FAST;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)UserDeviceSettings$PbUserSafetyLightSettings.getDescriptor().getEnumTypes().get(2);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightBlinkRate valueOf(int var0) {
      return forNumber(var0);
   }

   public static UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightBlinkRate valueOf(EnumValueDescriptor var0) {
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
