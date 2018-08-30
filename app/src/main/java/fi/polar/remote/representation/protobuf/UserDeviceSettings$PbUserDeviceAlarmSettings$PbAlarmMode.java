package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum UserDeviceSettings$PbUserDeviceAlarmSettings$PbAlarmMode implements ProtocolMessageEnum {
   ALARM_MODE_EVERY_DAY(4);

   public static final int ALARM_MODE_EVERY_DAY_VALUE = 4;
   ALARM_MODE_MON_TO_FRI(3);

   public static final int ALARM_MODE_MON_TO_FRI_VALUE = 3;
   ALARM_MODE_OFF(1);

   public static final int ALARM_MODE_OFF_VALUE = 1;
   ALARM_MODE_ONCE(2);

   public static final int ALARM_MODE_ONCE_VALUE = 2;
   private static final UserDeviceSettings$PbUserDeviceAlarmSettings$PbAlarmMode[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new UserDeviceSettings$PbUserDeviceAlarmSettings$PbAlarmMode$1();
   private final int value;

   private UserDeviceSettings$PbUserDeviceAlarmSettings$PbAlarmMode(int var3) {
      this.value = var3;
   }

   public static UserDeviceSettings$PbUserDeviceAlarmSettings$PbAlarmMode forNumber(int var0) {
      UserDeviceSettings$PbUserDeviceAlarmSettings$PbAlarmMode var1;
      switch(var0) {
      case 1:
         var1 = ALARM_MODE_OFF;
         break;
      case 2:
         var1 = ALARM_MODE_ONCE;
         break;
      case 3:
         var1 = ALARM_MODE_MON_TO_FRI;
         break;
      case 4:
         var1 = ALARM_MODE_EVERY_DAY;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)UserDeviceSettings$PbUserDeviceAlarmSettings.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static UserDeviceSettings$PbUserDeviceAlarmSettings$PbAlarmMode valueOf(int var0) {
      return forNumber(var0);
   }

   public static UserDeviceSettings$PbUserDeviceAlarmSettings$PbAlarmMode valueOf(EnumValueDescriptor var0) {
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
