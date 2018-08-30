package protocol;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum PftpRequest$PbPFtpQuery implements ProtocolMessageEnum {
   CLEANUP_DISK_SPACE(10),

//   public static final int CLEANUP_DISK_SPACE_VALUE = 10;
   GENERATE_CHALLENGE_TOKEN(6),

//   public static final int GENERATE_CHALLENGE_TOKEN_VALUE = 6;
   GET_BATTERY_STATUS(8),

//   public static final int GET_BATTERY_STATUS_VALUE = 8;
   GET_DISK_SPACE(5),

//   public static final int GET_DISK_SPACE_VALUE = 5;
   GET_INACTIVITY_PRE_ALERT(11),

//   public static final int GET_INACTIVITY_PRE_ALERT_VALUE = 11;
   GET_LOCAL_TIME(4),

//   public static final int GET_LOCAL_TIME_VALUE = 4;
   GET_SYSTEM_TIME(2),

//   public static final int GET_SYSTEM_TIME_VALUE = 2;
   IDENTIFY_DEVICE(0),

//   public static final int IDENTIFY_DEVICE_VALUE = 0;
   PREPARE_FIRMWARE_UPDATE(12),

//   public static final int PREPARE_FIRMWARE_UPDATE_VALUE = 12;
   REQUEST_SYNCHRONIZATION(13),

//   public static final int REQUEST_SYNCHRONIZATION_VALUE = 13;
   SET_ADB_MODE(9),

//   public static final int SET_ADB_MODE_VALUE = 9;
   SET_INTERNAL_TEST(7),

//   public static final int SET_INTERNAL_TEST_VALUE = 7;
   SET_LOCAL_TIME(3),

//   public static final int SET_LOCAL_TIME_VALUE = 3;
   SET_SYSTEM_TIME(1);

//   public static final int SET_SYSTEM_TIME_VALUE = 1;
   private static final PftpRequest$PbPFtpQuery[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new PftpRequest$PbPFtpQuery$1();
   private final int value;

   private PftpRequest$PbPFtpQuery(int var3) {
      this.value = var3;
   }

   public static PftpRequest$PbPFtpQuery forNumber(int var0) {
      PftpRequest$PbPFtpQuery var1;
      switch(var0) {
      case 0:
         var1 = IDENTIFY_DEVICE;
         break;
      case 1:
         var1 = SET_SYSTEM_TIME;
         break;
      case 2:
         var1 = GET_SYSTEM_TIME;
         break;
      case 3:
         var1 = SET_LOCAL_TIME;
         break;
      case 4:
         var1 = GET_LOCAL_TIME;
         break;
      case 5:
         var1 = GET_DISK_SPACE;
         break;
      case 6:
         var1 = GENERATE_CHALLENGE_TOKEN;
         break;
      case 7:
         var1 = SET_INTERNAL_TEST;
         break;
      case 8:
         var1 = GET_BATTERY_STATUS;
         break;
      case 9:
         var1 = SET_ADB_MODE;
         break;
      case 10:
         var1 = CLEANUP_DISK_SPACE;
         break;
      case 11:
         var1 = GET_INACTIVITY_PRE_ALERT;
         break;
      case 12:
         var1 = PREPARE_FIRMWARE_UPDATE;
         break;
      case 13:
         var1 = REQUEST_SYNCHRONIZATION;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)PftpRequest.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static PftpRequest$PbPFtpQuery valueOf(int var0) {
      return forNumber(var0);
   }

   public static PftpRequest$PbPFtpQuery valueOf(EnumValueDescriptor var0) {
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
