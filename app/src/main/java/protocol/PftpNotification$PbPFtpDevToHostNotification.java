package protocol;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum PftpNotification$PbPFtpDevToHostNotification implements ProtocolMessageEnum {
   AUTOSYNC_STATUS(8);

   public static final int AUTOSYNC_STATUS_VALUE = 8;
   BATTERY_STATUS(3);

   public static final int BATTERY_STATUS_VALUE = 3;
   FILESYSTEM_MODIFIED(0);

   public static final int FILESYSTEM_MODIFIED_VALUE = 0;
   IDLING(2);

   public static final int IDLING_VALUE = 2;
   INACTIVITY_ALERT(4);

   public static final int INACTIVITY_ALERT_VALUE = 4;
   INTERNAL_TEST_EVENT(1);

   public static final int INTERNAL_TEST_EVENT_VALUE = 1;
   PNS_DH_NOTIFICATION_RESPONSE(9);

   public static final int PNS_DH_NOTIFICATION_RESPONSE_VALUE = 9;
   PNS_SETTINGS(10);

   public static final int PNS_SETTINGS_VALUE = 10;
   SYNC_REQUIRED(7);

   public static final int SYNC_REQUIRED_VALUE = 7;
   TRAINING_SESSION_STATUS(5);

   public static final int TRAINING_SESSION_STATUS_VALUE = 5;
   private static final PftpNotification$PbPFtpDevToHostNotification[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new PftpNotification$PbPFtpDevToHostNotification$1();
   private final int value;

   private PftpNotification$PbPFtpDevToHostNotification(int var3) {
      this.value = var3;
   }

   public static PftpNotification$PbPFtpDevToHostNotification forNumber(int var0) {
      PftpNotification$PbPFtpDevToHostNotification var1;
      switch(var0) {
      case 0:
         var1 = FILESYSTEM_MODIFIED;
         break;
      case 1:
         var1 = INTERNAL_TEST_EVENT;
         break;
      case 2:
         var1 = IDLING;
         break;
      case 3:
         var1 = BATTERY_STATUS;
         break;
      case 4:
         var1 = INACTIVITY_ALERT;
         break;
      case 5:
         var1 = TRAINING_SESSION_STATUS;
         break;
      case 6:
      default:
         var1 = null;
         break;
      case 7:
         var1 = SYNC_REQUIRED;
         break;
      case 8:
         var1 = AUTOSYNC_STATUS;
         break;
      case 9:
         var1 = PNS_DH_NOTIFICATION_RESPONSE;
         break;
      case 10:
         var1 = PNS_SETTINGS;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)PftpNotification.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static PftpNotification$PbPFtpDevToHostNotification valueOf(int var0) {
      return forNumber(var0);
   }

   public static PftpNotification$PbPFtpDevToHostNotification valueOf(EnumValueDescriptor var0) {
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
