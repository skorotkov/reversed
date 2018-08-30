package protocol;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import fi.polar.remote.representation.protobuf.Nanopb;
import fi.polar.remote.representation.protobuf.Types;

public final class PftpNotification {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_protocol_PbFirmwareUpdateAvailableParams_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbFirmwareUpdateAvailableParams_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPFtpAutoSyncStatusParams_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPFtpAutoSyncStatusParams_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPFtpFactoryResetParams_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPFtpFactoryResetParams_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPFtpFilesystemModifiedParams_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPFtpFilesystemModifiedParams_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPFtpInactivityAlert_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPFtpInactivityAlert_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPFtpSimulateButtonPressParams_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPFtpSimulateButtonPressParams_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPFtpSimulateTouchScreenParams_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPFtpSimulateTouchScreenParams_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPFtpStartAutosyncParams_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPFtpStartAutosyncParams_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPFtpStopSyncParams_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPFtpStopSyncParams_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPFtpTouchPosition_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPFtpTouchPosition_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPFtpTrainingSessionStatus_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPFtpTrainingSessionStatus_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPftpPnsDHAttribute_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPftpPnsDHAttribute_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPftpPnsDHNotificationResponse_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPftpPnsDHNotificationResponse_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPftpPnsHDAttribute_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPftpPnsHDAttribute_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPftpPnsHDNotification_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPftpPnsHDNotification_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPftpPnsState_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPftpPnsState_fieldAccessorTable;

   static {
      PftpNotification$1 var0 = new PftpNotification$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Nanopb.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0017pftp_notification.proto\u0012\bprotocol\u001a\u000btypes.proto\u001a\fnanopb.proto\"P\n\u001ePbPFtpFilesystemModifiedParams\u0012 \n\u0006action\u0018\u0001 \u0002(\u000e2\u0010.protocol.Action\u0012\f\n\u0004path\u0018\u0002 \u0002(\t\"*\n\u0015PbPFtpInactivityAlert\u0012\u0011\n\tcountdown\u0018\u0001 \u0002(\r\"1\n\u001bPbPFtpTrainingSessionStatus\u0012\u0012\n\ninprogress\u0018\u0001 \u0002(\b\"D\n\u001aPbPFtpAutoSyncStatusParams\u0012\u0011\n\tsucceeded\u0018\u0001 \u0002(\b\u0012\u0013\n\u000bdescription\u0018\u0002 \u0001(\t\"H\n\u0014PbPftpPnsDHAttribute\u00120\n\u0004type\u0018\u0001 \u0002(\u000e2\".protocol.PbPftpPnsDHAttributeType\"u\n\u001fPbPftpPnsDHNo", "tificationResponse\u0012\u0017\n\u000fnotification_id\u0018\u0001 \u0002(\r\u00129\n\nattributes\u0018\u0002 \u0003(\u000b2\u001e.protocol.PbPftpPnsDHAttributeB\u0005\u0092?\u0002\b\n\"H\n\u000ePbPftpPnsState\u0012\u001d\n\u0015notifications_enabled\u0018\u0001 \u0002(\b\u0012\u0017\n\u000fpreview_enabled\u0018\u0002 \u0001(\b\"4\n\u001fPbFirmwareUpdateAvailableParams\u0012\u0011\n\tmandatory\u0018\u0001 \u0002(\b\"X\n\u001fPbPFtpSimulateButtonPressParams\u0012\u0018\n\u0006button\u0018\u0001 \u0002(\u000e2\b.Buttons\u0012\u001b\n\u0005state\u0018\u0002 \u0002(\u000e2\f.ButtonState\"3\n\u0013PbPFtpTouchPosition\u0012\u000b\n\u0003pos\u0018\u0001 \u0002(\r\u0012\u000f\n\u0007max_pos\u0018\u0002 \u0001(\r\"¢\u0002\n\u001fPbPFtpSimulateTouchScr", "eenParams\u0012I\n\u0005state\u0018\u0001 \u0002(\u000e2:.protocol.PbPFtpSimulateTouchScreenParams.PbPFtpTouchState\u0012,\n\u0005x_pos\u0018\u0002 \u0001(\u000b2\u001d.protocol.PbPFtpTouchPosition\u0012,\n\u0005y_pos\u0018\u0003 \u0001(\u000b2\u001d.protocol.PbPFtpTouchPosition\"X\n\u0010PbPFtpTouchState\u0012\u0015\n\u0011TOUCH_STATE_START\u0010\u0000\u0012\u0018\n\u0014TOUCH_STATE_POSITION\u0010\u0001\u0012\u0013\n\u000fTOUCH_STATE_END\u0010\u0002\">\n\u0014PbPFtpStopSyncParams\u0012\u0011\n\tcompleted\u0018\u0001 \u0002(\b\u0012\u0013\n\u000bdescription\u0018\u0002 \u0001(\t\"i\n\u0018PbPFtpFactoryResetParams\u0012\r\n\u0005sleep\u0018\u0001 \u0002(\b\u0012!\n\u0013do_factory_defaults\u0018\u0002 \u0001", "(\b:\u0004true\u0012\u001b\n\fota_fwupdate\u0018\u0003 \u0001(\b:\u0005false\",\n\u0019PbPFtpStartAutosyncParams\u0012\u000f\n\u0007timeout\u0018\u0001 \u0002(\r\"s\n\u0014PbPftpPnsHDAttribute\u00120\n\u0004type\u0018\u0001 \u0002(\u000e2\".protocol.PbPftpPnsHDAttributeType\u0012\f\n\u0004data\u0018\u0002 \u0001(\t\u0012\u001b\n\u0013attribute_full_size\u0018\u0003 \u0001(\r\"À\u0002\n\u0017PbPftpPnsHDNotification\u0012\u0017\n\u000fnotification_id\u0018\u0001 \u0002(\r\u00124\n\u000bcategory_id\u0018\u0002 \u0002(\u000e2\u001f.protocol.PbPftpPnsHDCategoryID\u0012 \n\u0006action\u0018\u0003 \u0002(\u000e2\u0010.protocol.Action\u0012$\n\nissue_time\u0018\u0004 \u0002(\u000b2\u0010.PbLocalDateTime\u0012'\n\u001fnew_same_category", "_notifications\u0018\u0005 \u0001(\r\u0012*\n\"unread_same_category_notifications\u0018\u0006 \u0001(\r\u00129\n\nattributes\u0018\u0007 \u0003(\u000b2\u001e.protocol.PbPftpPnsHDAttributeB\u0005\u0092?\u0002\b\n*þ\u0001\n\u001bPbPFtpDevToHostNotification\u0012\u0017\n\u0013FILESYSTEM_MODIFIED\u0010\u0000\u0012\u0017\n\u0013INTERNAL_TEST_EVENT\u0010\u0001\u0012\n\n\u0006IDLING\u0010\u0002\u0012\u0012\n\u000eBATTERY_STATUS\u0010\u0003\u0012\u0014\n\u0010INACTIVITY_ALERT\u0010\u0004\u0012\u001b\n\u0017TRAINING_SESSION_STATUS\u0010\u0005\u0012\u0011\n\rSYNC_REQUIRED\u0010\u0007\u0012\u0013\n\u000fAUTOSYNC_STATUS\u0010\b\u0012 \n\u001cPNS_DH_NOTIFICATION_RESPONSE\u0010\t\u0012\u0010\n\fPNS_SETTINGS\u0010\n*/\n\u0006Action\u0012\u000b\n\u0007CREATE", "D\u0010\u0000\u0012\u000b\n\u0007UPDATED\u0010\u0001\u0012\u000b\n\u0007REMOVED\u0010\u0002*j\n\u0018PbPftpPnsDHAttributeType\u0012\u0012\n\u000eUNKNOWN_ACTION\u0010\u0001\u0012\u0013\n\u000fPOSITIVE_ACTION\u0010\u0002\u0012\u0013\n\u000fNEGATIVE_ACTION\u0010\u0003\u0012\u0010\n\fCLEAR_ACTION\u0010\u0004*È\u0002\n\u001bPbPFtpHostToDevNotification\u0012\u000e\n\nSTART_SYNC\u0010\u0000\u0012\r\n\tSTOP_SYNC\u0010\u0001\u0012\t\n\u0005RESET\u0010\u0002\u0012\u0018\n\u0014LOCK_PRODUCTION_DATA\u0010\u0003\u0012\u0012\n\u000eTERMINATE_SYNC\u0010\u0004\u0012\u000e\n\nKEEP_ALIVE\u0010\u0005\u0012\u0012\n\u000eSTART_AUTOSYNC\u0010\u0006\u0012\u0017\n\u0013PNS_HD_NOTIFICATION\u0010\u0007\u0012\u0016\n\u0012INITIALIZE_SESSION\u0010\b\u0012\u0015\n\u0011TERMINATE_SESSION\u0010\t\u0012\u0019\n\u0015SIMULATE_BUTTON_PRESS\u0010\n\u0012\u0019\n\u0015SIMU", "LATE_TOUCH_SCREEN\u0010\u000b\u0012\u0010\n\fREQUEST_SYNC\u0010\f\u0012\u001d\n\u0019FIRMWARE_UPDATE_AVAILABLE\u0010\r*ù\u0003\n\u0015PbPftpPnsHDCategoryID\u0012\u0015\n\u0011CATEGORY_ID_OTHER\u0010\u0000\u0012\u0015\n\u0011CATEGORY_ID_POLAR\u0010\u0001\u0012\u001c\n\u0018CATEGORY_ID_INCOMINGCALL\u0010\u0002\u0012\u001a\n\u0016CATEGORY_ID_MISSEDCALL\u0010\u0003\u0012\u0019\n\u0015CATEGORY_ID_VOICEMAIL\u0010\u0004\u0012\u0016\n\u0012CATEGORY_ID_SOCIAL\u0010\u0005\u0012\u0018\n\u0014CATEGORY_ID_SCHEDULE\u0010\u0006\u0012\u0015\n\u0011CATEGORY_ID_EMAIL\u0010\u0007\u0012\u0014\n\u0010CATEGORY_ID_NEWS\u0010\b\u0012 \n\u001cCATEGORY_ID_HEALTHANDFITNESS\u0010\t\u0012\"\n\u001eCATEGORY_ID_BUSINESSANDFINANCE\u0010\n\u0012\u0018\n\u0014CATEGO", "RY_ID_LOCATION\u0010\u000b\u0012\u001d\n\u0019CATEGORY_ID_ENTERTAINMENT\u0010\f\u0012\u0015\n\u0011CATEGORY_ID_ALARM\u0010\r\u0012\u0015\n\u0011CATEGORY_ID_PROMO\u0010\u000e\u0012\u001e\n\u001aCATEGORY_ID_RECOMMENDATION\u0010\u000f\u0012\u0016\n\u0012CATEGORY_ID_STATUS\u0010\u0010\u0012\u0019\n\u0015CATEGORY_ID_TRANSPORT\u0010\u0011*¤\u0001\n\u0018PbPftpPnsHDAttributeType\u0012\t\n\u0005TITLE\u0010\u0000\u0012\f\n\bSUBTITLE\u0010\u0001\u0012\u000b\n\u0007MESSAGE\u0010\u0002\u0012\u0019\n\u0015POSITIVE_ACTION_LABEL\u0010\u0003\u0012\u0019\n\u0015NEGATIVE_ACTION_LABEL\u0010\u0004\u0012\u0014\n\u0010APPLICATION_NAME\u0010\u0005\u0012\u0016\n\u0012CLEAR_ACTION_LABEL\u0010\u0006"}, new FileDescriptor[]{var1, var2}, var0);
      internal_static_protocol_PbPFtpFilesystemModifiedParams_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_protocol_PbPFtpFilesystemModifiedParams_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPFtpFilesystemModifiedParams_descriptor, new String[]{"Action", "Path"});
      internal_static_protocol_PbPFtpInactivityAlert_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_protocol_PbPFtpInactivityAlert_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPFtpInactivityAlert_descriptor, new String[]{"Countdown"});
      internal_static_protocol_PbPFtpTrainingSessionStatus_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_protocol_PbPFtpTrainingSessionStatus_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPFtpTrainingSessionStatus_descriptor, new String[]{"Inprogress"});
      internal_static_protocol_PbPFtpAutoSyncStatusParams_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_protocol_PbPFtpAutoSyncStatusParams_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPFtpAutoSyncStatusParams_descriptor, new String[]{"Succeeded", "Description"});
      internal_static_protocol_PbPftpPnsDHAttribute_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_protocol_PbPftpPnsDHAttribute_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPftpPnsDHAttribute_descriptor, new String[]{"Type"});
      internal_static_protocol_PbPftpPnsDHNotificationResponse_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_protocol_PbPftpPnsDHNotificationResponse_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPftpPnsDHNotificationResponse_descriptor, new String[]{"NotificationId", "Attributes"});
      internal_static_protocol_PbPftpPnsState_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_protocol_PbPftpPnsState_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPftpPnsState_descriptor, new String[]{"NotificationsEnabled", "PreviewEnabled"});
      internal_static_protocol_PbFirmwareUpdateAvailableParams_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_protocol_PbFirmwareUpdateAvailableParams_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbFirmwareUpdateAvailableParams_descriptor, new String[]{"Mandatory"});
      internal_static_protocol_PbPFtpSimulateButtonPressParams_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_protocol_PbPFtpSimulateButtonPressParams_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPFtpSimulateButtonPressParams_descriptor, new String[]{"Button", "State"});
      internal_static_protocol_PbPFtpTouchPosition_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_protocol_PbPFtpTouchPosition_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPFtpTouchPosition_descriptor, new String[]{"Pos", "MaxPos"});
      internal_static_protocol_PbPFtpSimulateTouchScreenParams_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_protocol_PbPFtpSimulateTouchScreenParams_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPFtpSimulateTouchScreenParams_descriptor, new String[]{"State", "XPos", "YPos"});
      internal_static_protocol_PbPFtpStopSyncParams_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_protocol_PbPFtpStopSyncParams_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPFtpStopSyncParams_descriptor, new String[]{"Completed", "Description"});
      internal_static_protocol_PbPFtpFactoryResetParams_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_protocol_PbPFtpFactoryResetParams_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPFtpFactoryResetParams_descriptor, new String[]{"Sleep", "DoFactoryDefaults", "OtaFwupdate"});
      internal_static_protocol_PbPFtpStartAutosyncParams_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_protocol_PbPFtpStartAutosyncParams_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPFtpStartAutosyncParams_descriptor, new String[]{"Timeout"});
      internal_static_protocol_PbPftpPnsHDAttribute_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_protocol_PbPftpPnsHDAttribute_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPftpPnsHDAttribute_descriptor, new String[]{"Type", "Data", "AttributeFullSize"});
      internal_static_protocol_PbPftpPnsHDNotification_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_protocol_PbPftpPnsHDNotification_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPftpPnsHDNotification_descriptor, new String[]{"NotificationId", "CategoryId", "Action", "IssueTime", "NewSameCategoryNotifications", "UnreadSameCategoryNotifications", "Attributes"});
      ExtensionRegistry var3 = ExtensionRegistry.newInstance();
      var3.add(Nanopb.nanopb);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var3);
      Types.getDescriptor();
      Nanopb.getDescriptor();
   }

   private PftpNotification() {
   }

   // $FF: synthetic method
   static Descriptor A() {
      return internal_static_protocol_PbPFtpStartAutosyncParams_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable B() {
      return internal_static_protocol_PbPFtpStartAutosyncParams_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor C() {
      return internal_static_protocol_PbPftpPnsHDAttribute_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable D() {
      return internal_static_protocol_PbPftpPnsHDAttribute_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor E() {
      return internal_static_protocol_PbPftpPnsHDNotification_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable F() {
      return internal_static_protocol_PbPftpPnsHDNotification_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_protocol_PbPFtpFilesystemModifiedParams_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_protocol_PbPFtpFilesystemModifiedParams_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_protocol_PbPFtpInactivityAlert_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_protocol_PbPFtpInactivityAlert_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor e() {
      return internal_static_protocol_PbPFtpTrainingSessionStatus_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable f() {
      return internal_static_protocol_PbPFtpTrainingSessionStatus_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor g() {
      return internal_static_protocol_PbPFtpAutoSyncStatusParams_descriptor;
   }

   public static FileDescriptor getDescriptor() {
      return descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable h() {
      return internal_static_protocol_PbPFtpAutoSyncStatusParams_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor i() {
      return internal_static_protocol_PbPftpPnsDHAttribute_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable j() {
      return internal_static_protocol_PbPftpPnsDHAttribute_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor k() {
      return internal_static_protocol_PbPftpPnsDHNotificationResponse_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable l() {
      return internal_static_protocol_PbPftpPnsDHNotificationResponse_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor m() {
      return internal_static_protocol_PbPftpPnsState_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable n() {
      return internal_static_protocol_PbPftpPnsState_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor o() {
      return internal_static_protocol_PbFirmwareUpdateAvailableParams_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable p() {
      return internal_static_protocol_PbFirmwareUpdateAvailableParams_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor q() {
      return internal_static_protocol_PbPFtpSimulateButtonPressParams_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable r() {
      return internal_static_protocol_PbPFtpSimulateButtonPressParams_fieldAccessorTable;
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }

   // $FF: synthetic method
   static Descriptor s() {
      return internal_static_protocol_PbPFtpTouchPosition_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable t() {
      return internal_static_protocol_PbPFtpTouchPosition_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor u() {
      return internal_static_protocol_PbPFtpSimulateTouchScreenParams_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable v() {
      return internal_static_protocol_PbPFtpSimulateTouchScreenParams_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor w() {
      return internal_static_protocol_PbPFtpStopSyncParams_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable x() {
      return internal_static_protocol_PbPFtpStopSyncParams_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor y() {
      return internal_static_protocol_PbPFtpFactoryResetParams_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable z() {
      return internal_static_protocol_PbPFtpFactoryResetParams_fieldAccessorTable;
   }
}
