package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum UserDeviceSettings$PbIntervalTimerValue$PbIntervalTimerType implements ProtocolMessageEnum {
   INTERVAL_TIMER_TYPE_DISTANCE(2),

   INTERVAL_TIMER_TYPE_DURATION(1);

   public static final int INTERVAL_TIMER_TYPE_DURATION_VALUE = 1;
   public static final int INTERVAL_TIMER_TYPE_DISTANCE_VALUE = 2;
   private static final UserDeviceSettings$PbIntervalTimerValue$PbIntervalTimerType[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new UserDeviceSettings$PbIntervalTimerValue$PbIntervalTimerType$1();
   private final int value;

   private UserDeviceSettings$PbIntervalTimerValue$PbIntervalTimerType(int var3) {
      this.value = var3;
   }

   public static UserDeviceSettings$PbIntervalTimerValue$PbIntervalTimerType forNumber(int var0) {
      UserDeviceSettings$PbIntervalTimerValue$PbIntervalTimerType var1;
      switch(var0) {
      case 1:
         var1 = INTERVAL_TIMER_TYPE_DURATION;
         break;
      case 2:
         var1 = INTERVAL_TIMER_TYPE_DISTANCE;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)UserDeviceSettings$PbIntervalTimerValue.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static UserDeviceSettings$PbIntervalTimerValue$PbIntervalTimerType valueOf(int var0) {
      return forNumber(var0);
   }

   public static UserDeviceSettings$PbIntervalTimerValue$PbIntervalTimerType valueOf(EnumValueDescriptor var0) {
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
