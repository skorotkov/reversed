package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum UserDeviceSettings$PbUserDeviceGeneralSettings$PbWatchFace implements ProtocolMessageEnum {
   ACTIVITY(7),
   ACTIVITY_CIRCLE(12),

//   public static final int ACTIVITY_CIRCLE_VALUE = 12;
//   public static final int ACTIVITY_VALUE = 7;
   ANALOG(5),

//   public static final int ANALOG_VALUE = 5;
   AWARD(2),

//   public static final int AWARD_VALUE = 2;
   BASIC(1),

//   public static final int BASIC_VALUE = 1;
   BIG(6),
   BIG_ANALOG(8),

//   public static final int BIG_ANALOG_VALUE = 8;
   BIG_DIGITS(11),

//   public static final int BIG_DIGITS_VALUE = 11;
//   public static final int BIG_VALUE = 6;
   EVENT(4),

//   public static final int EVENT_VALUE = 4;
   JUMBO(10),

//   public static final int JUMBO_VALUE = 10;
   USER_NAME(3),

//   public static final int USER_NAME_VALUE = 3;
   WHITE_ANALOG(9);

//   public static final int WHITE_ANALOG_VALUE = 9;
   private static final UserDeviceSettings$PbUserDeviceGeneralSettings$PbWatchFace[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new UserDeviceSettings$PbUserDeviceGeneralSettings$PbWatchFace$1();
   private final int value;

   private UserDeviceSettings$PbUserDeviceGeneralSettings$PbWatchFace(int var3) {
      this.value = var3;
   }

   public static UserDeviceSettings$PbUserDeviceGeneralSettings$PbWatchFace forNumber(int var0) {
      UserDeviceSettings$PbUserDeviceGeneralSettings$PbWatchFace var1;
      switch(var0) {
      case 1:
         var1 = BASIC;
         break;
      case 2:
         var1 = AWARD;
         break;
      case 3:
         var1 = USER_NAME;
         break;
      case 4:
         var1 = EVENT;
         break;
      case 5:
         var1 = ANALOG;
         break;
      case 6:
         var1 = BIG;
         break;
      case 7:
         var1 = ACTIVITY;
         break;
      case 8:
         var1 = BIG_ANALOG;
         break;
      case 9:
         var1 = WHITE_ANALOG;
         break;
      case 10:
         var1 = JUMBO;
         break;
      case 11:
         var1 = BIG_DIGITS;
         break;
      case 12:
         var1 = ACTIVITY_CIRCLE;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)UserDeviceSettings$PbUserDeviceGeneralSettings.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static UserDeviceSettings$PbUserDeviceGeneralSettings$PbWatchFace valueOf(int var0) {
      return forNumber(var0);
   }

   public static UserDeviceSettings$PbUserDeviceGeneralSettings$PbWatchFace valueOf(EnumValueDescriptor var0) {
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
