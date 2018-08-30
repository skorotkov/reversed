package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$PbDoNotDisturbSettingSource implements ProtocolMessageEnum {
   SOURCE_TIMED(1);

   public static final int SOURCE_TIMED_VALUE = 1;
   SOURCE_USER(0);

   public static final int SOURCE_USER_VALUE = 0;
   private static final UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$PbDoNotDisturbSettingSource[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$PbDoNotDisturbSettingSource$1();
   private final int value;

   private UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$PbDoNotDisturbSettingSource(int var3) {
      this.value = var3;
   }

   public static UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$PbDoNotDisturbSettingSource forNumber(int var0) {
      UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$PbDoNotDisturbSettingSource var1;
      switch(var0) {
      case 0:
         var1 = SOURCE_USER;
         break;
      case 1:
         var1 = SOURCE_TIMED;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)UserDeviceSettings$PbUserDeviceDoNotDisturbSettings.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$PbDoNotDisturbSettingSource valueOf(int var0) {
      return forNumber(var0);
   }

   public static UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$PbDoNotDisturbSettingSource valueOf(EnumValueDescriptor var0) {
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
