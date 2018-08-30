package protocol;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum PftpNotification$PbPFtpHostToDevNotification implements ProtocolMessageEnum {
   FIRMWARE_UPDATE_AVAILABLE(13);

   public static final int FIRMWARE_UPDATE_AVAILABLE_VALUE = 13;
   INITIALIZE_SESSION(8);

   public static final int INITIALIZE_SESSION_VALUE = 8;
   KEEP_ALIVE(5);

   public static final int KEEP_ALIVE_VALUE = 5;
   LOCK_PRODUCTION_DATA(3);

   public static final int LOCK_PRODUCTION_DATA_VALUE = 3;
   PNS_HD_NOTIFICATION(7);

   public static final int PNS_HD_NOTIFICATION_VALUE = 7;
   REQUEST_SYNC(12);

   public static final int REQUEST_SYNC_VALUE = 12;
   RESET(2);

   public static final int RESET_VALUE = 2;
   SIMULATE_BUTTON_PRESS(10);

   public static final int SIMULATE_BUTTON_PRESS_VALUE = 10;
   SIMULATE_TOUCH_SCREEN(11);

   public static final int SIMULATE_TOUCH_SCREEN_VALUE = 11;
   START_AUTOSYNC(6);

   public static final int START_AUTOSYNC_VALUE = 6;
   START_SYNC(0);

   public static final int START_SYNC_VALUE = 0;
   STOP_SYNC(1);

   public static final int STOP_SYNC_VALUE = 1;
   TERMINATE_SESSION(9);

   public static final int TERMINATE_SESSION_VALUE = 9;
   TERMINATE_SYNC(4);

   public static final int TERMINATE_SYNC_VALUE = 4;
   private static final PftpNotification$PbPFtpHostToDevNotification[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new PftpNotification$PbPFtpHostToDevNotification$1();
   private final int value;

   private PftpNotification$PbPFtpHostToDevNotification(int var3) {
      this.value = var3;
   }

   public static PftpNotification$PbPFtpHostToDevNotification forNumber(int var0) {
      PftpNotification$PbPFtpHostToDevNotification var1;
      switch(var0) {
      case 0:
         var1 = START_SYNC;
         break;
      case 1:
         var1 = STOP_SYNC;
         break;
      case 2:
         var1 = RESET;
         break;
      case 3:
         var1 = LOCK_PRODUCTION_DATA;
         break;
      case 4:
         var1 = TERMINATE_SYNC;
         break;
      case 5:
         var1 = KEEP_ALIVE;
         break;
      case 6:
         var1 = START_AUTOSYNC;
         break;
      case 7:
         var1 = PNS_HD_NOTIFICATION;
         break;
      case 8:
         var1 = INITIALIZE_SESSION;
         break;
      case 9:
         var1 = TERMINATE_SESSION;
         break;
      case 10:
         var1 = SIMULATE_BUTTON_PRESS;
         break;
      case 11:
         var1 = SIMULATE_TOUCH_SCREEN;
         break;
      case 12:
         var1 = REQUEST_SYNC;
         break;
      case 13:
         var1 = FIRMWARE_UPDATE_AVAILABLE;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)PftpNotification.getDescriptor().getEnumTypes().get(3);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static PftpNotification$PbPFtpHostToDevNotification valueOf(int var0) {
      return forNumber(var0);
   }

   public static PftpNotification$PbPFtpHostToDevNotification valueOf(EnumValueDescriptor var0) {
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
