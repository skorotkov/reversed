package protocol;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum PftpError$PbPFtpError implements ProtocolMessageEnum {
   BATTERY_TOO_LOW(209),

//   public static final int BATTERY_TOO_LOW_VALUE = 209;
   CHECKSUM_FAILURE(204),

//   public static final int CHECKSUM_FAILURE_VALUE = 204;
   DIRECTORY_EXISTS(104),

//   public static final int DIRECTORY_EXISTS_VALUE = 104;
   DISK_FULL(205),

//   public static final int DISK_FULL_VALUE = 205;
   FILE_EXISTS(105),

//   public static final int FILE_EXISTS_VALUE = 105;
   INSUFFICIENT_BUFFER(207),

//   public static final int INSUFFICIENT_BUFFER_VALUE = 207;
   INVALID_COMMAND(101),

//   public static final int INVALID_COMMAND_VALUE = 101;
   INVALID_CONTENT(203),

//   public static final int INVALID_CONTENT_VALUE = 203;
   INVALID_PARAMETER(102),

//   public static final int INVALID_PARAMETER_VALUE = 102;
   NOT_IMPLEMENTED(201),

//   public static final int NOT_IMPLEMENTED_VALUE = 201;
   NO_SUCH_FILE_OR_DIRECTORY(103),

//   public static final int NO_SUCH_FILE_OR_DIRECTORY_VALUE = 103;
   NO_SUCH_USER(107),

//   public static final int NO_SUCH_USER_VALUE = 107;
   OPERATION_NOT_PERMITTED(106),

//   public static final int OPERATION_NOT_PERMITTED_VALUE = 106;
   OPERATION_SUCCEEDED(0),

//   public static final int OPERATION_SUCCEEDED_VALUE = 0;
   PREREQUISITE_NOT_MET(206),

//   public static final int PREREQUISITE_NOT_MET_VALUE = 206;
   REBOOTING(1),

//   public static final int REBOOTING_VALUE = 1;
   SYSTEM_BUSY(202),

//   public static final int SYSTEM_BUSY_VALUE = 202;
   TIMEOUT(108),

//   public static final int TIMEOUT_VALUE = 108;
   TRY_AGAIN(2),

//   public static final int TRY_AGAIN_VALUE = 2;
   UNIDENTIFIED_DEVICE_ERROR(200),

//   public static final int UNIDENTIFIED_DEVICE_ERROR_VALUE = 200;
   UNIDENTIFIED_HOST_ERROR(100),

//   public static final int UNIDENTIFIED_HOST_ERROR_VALUE = 100;
   WAIT_FOR_IDLING(208);

//   public static final int WAIT_FOR_IDLING_VALUE = 208;
   private static final EnumLiteMap internalValueMap = new PftpError$PbPFtpError$1();
   private static final PftpError$PbPFtpError[] VALUES = values();
   private final int value;

   private PftpError$PbPFtpError(int var3) {
      this.value = var3;
   }

   public static PftpError$PbPFtpError forNumber(int var0) {
      PftpError$PbPFtpError var1;
      switch(var0) {
      case 0:
         var1 = OPERATION_SUCCEEDED;
         break;
      case 1:
         var1 = REBOOTING;
         break;
      case 2:
         var1 = TRY_AGAIN;
         break;
      case 100:
         var1 = UNIDENTIFIED_HOST_ERROR;
         break;
      case 101:
         var1 = INVALID_COMMAND;
         break;
      case 102:
         var1 = INVALID_PARAMETER;
         break;
      case 103:
         var1 = NO_SUCH_FILE_OR_DIRECTORY;
         break;
      case 104:
         var1 = DIRECTORY_EXISTS;
         break;
      case 105:
         var1 = FILE_EXISTS;
         break;
      case 106:
         var1 = OPERATION_NOT_PERMITTED;
         break;
      case 107:
         var1 = NO_SUCH_USER;
         break;
      case 108:
         var1 = TIMEOUT;
         break;
      case 200:
         var1 = UNIDENTIFIED_DEVICE_ERROR;
         break;
      case 201:
         var1 = NOT_IMPLEMENTED;
         break;
      case 202:
         var1 = SYSTEM_BUSY;
         break;
      case 203:
         var1 = INVALID_CONTENT;
         break;
      case 204:
         var1 = CHECKSUM_FAILURE;
         break;
      case 205:
         var1 = DISK_FULL;
         break;
      case 206:
         var1 = PREREQUISITE_NOT_MET;
         break;
      case 207:
         var1 = INSUFFICIENT_BUFFER;
         break;
      case 208:
         var1 = WAIT_FOR_IDLING;
         break;
      case 209:
         var1 = BATTERY_TOO_LOW;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)PftpError.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static PftpError$PbPFtpError valueOf(int var0) {
      return forNumber(var0);
   }

   public static PftpError$PbPFtpError valueOf(EnumValueDescriptor var0) {
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
