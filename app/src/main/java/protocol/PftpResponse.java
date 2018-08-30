package protocol;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import fi.polar.remote.representation.protobuf.Types;

public final class PftpResponse {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_protocol_PbPFtpBatteryStatusResult_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPFtpBatteryStatusResult_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPFtpDirectory_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPFtpDirectory_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPFtpDiskSpaceResult_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPFtpDiskSpaceResult_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPFtpEntry_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPFtpEntry_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPFtpGenerateChallengeTokenResult_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPFtpGenerateChallengeTokenResult_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPFtpGetInactivityPreAlertResult_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPFtpGetInactivityPreAlertResult_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPFtpGetLocalTimeResult_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPFtpGetLocalTimeResult_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPFtpGetSystemTimeResult_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPFtpGetSystemTimeResult_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPFtpIdentifyDeviceResult_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPFtpIdentifyDeviceResult_fieldAccessorTable;

   static {
      PftpResponse$1 var0 = new PftpResponse$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0013pftp_response.proto\u0012\bprotocol\u001a\u000btypes.proto\"\u0096\u0001\n\u000bPbPFtpEntry\u0012\f\n\u0004name\u0018\u0001 \u0002(\t\u0012\f\n\u0004size\u0018\u0002 \u0002(\u0004\u0012\"\n\u0007created\u0018\u0003 \u0001(\u000b2\u0011.PbSystemDateTime\u0012#\n\bmodified\u0018\u0004 \u0001(\u000b2\u0011.PbSystemDateTime\u0012\"\n\u0007touched\u0018\u0005 \u0001(\u000b2\u0011.PbSystemDateTime\"9\n\u000fPbPFtpDirectory\u0012&\n\u0007entries\u0018\u0001 \u0003(\u000b2\u0015.protocol.PbPFtpEntry\"/\n\u001aPbPFtpIdentifyDeviceResult\u0012\u0011\n\tdevice_id\u0018\u0001 \u0002(\t\"Z\n\u0019PbPFtpGetSystemTimeResult\u0012\u0015\n\u0004date\u0018\u0001 \u0002(\u000b2\u0007.PbDate\u0012\u0015\n\u0004time\u0018\u0002 \u0002(\u000b2\u0007.PbTime\u0012\u000f\n\u0007trusted\u0018\u0003 \u0002(\b\"[\n", "\u0018PbPFtpGetLocalTimeResult\u0012\u0015\n\u0004date\u0018\u0001 \u0002(\u000b2\u0007.PbDate\u0012\u0015\n\u0004time\u0018\u0002 \u0002(\u000b2\u0007.PbTime\u0012\u0011\n\ttz_offset\u0018\u0003 \u0001(\u0005\"_\n\u0015PbPFtpDiskSpaceResult\u0012\u0015\n\rfragment_size\u0018\u0001 \u0002(\r\u0012\u0017\n\u000ftotal_fragments\u0018\u0002 \u0002(\u0004\u0012\u0016\n\u000efree_fragments\u0018\u0003 \u0002(\u0004\"3\n\"PbPFtpGenerateChallengeTokenResult\u0012\r\n\u0005token\u0018\u0001 \u0002(\f\"K\n\u0019PbPFtpBatteryStatusResult\u0012\u001c\n\u000ebattery_status\u0018\u0001 \u0002(\rB\u0004\u0080µ\u0018<\u0012\u0010\n\bcharging\u0018\u0002 \u0001(\b\"D\n!PbPFtpGetInactivityPreAlertResult\u0012\u001f\n\u0017inactivity_pre_alert_on\u0018\u0001 \u0002(\b"}, new FileDescriptor[]{var1}, var0);
      internal_static_protocol_PbPFtpEntry_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_protocol_PbPFtpEntry_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPFtpEntry_descriptor, new String[]{"Name", "Size", "Created", "Modified", "Touched"});
      internal_static_protocol_PbPFtpDirectory_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_protocol_PbPFtpDirectory_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPFtpDirectory_descriptor, new String[]{"Entries"});
      internal_static_protocol_PbPFtpIdentifyDeviceResult_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_protocol_PbPFtpIdentifyDeviceResult_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPFtpIdentifyDeviceResult_descriptor, new String[]{"DeviceId"});
      internal_static_protocol_PbPFtpGetSystemTimeResult_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_protocol_PbPFtpGetSystemTimeResult_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPFtpGetSystemTimeResult_descriptor, new String[]{"Date", "Time", "Trusted"});
      internal_static_protocol_PbPFtpGetLocalTimeResult_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_protocol_PbPFtpGetLocalTimeResult_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPFtpGetLocalTimeResult_descriptor, new String[]{"Date", "Time", "TzOffset"});
      internal_static_protocol_PbPFtpDiskSpaceResult_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_protocol_PbPFtpDiskSpaceResult_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPFtpDiskSpaceResult_descriptor, new String[]{"FragmentSize", "TotalFragments", "FreeFragments"});
      internal_static_protocol_PbPFtpGenerateChallengeTokenResult_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_protocol_PbPFtpGenerateChallengeTokenResult_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPFtpGenerateChallengeTokenResult_descriptor, new String[]{"Token"});
      internal_static_protocol_PbPFtpBatteryStatusResult_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_protocol_PbPFtpBatteryStatusResult_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPFtpBatteryStatusResult_descriptor, new String[]{"BatteryStatus", "Charging"});
      internal_static_protocol_PbPFtpGetInactivityPreAlertResult_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_protocol_PbPFtpGetInactivityPreAlertResult_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPFtpGetInactivityPreAlertResult_descriptor, new String[]{"InactivityPreAlertOn"});
      ExtensionRegistry var2 = ExtensionRegistry.newInstance();
      var2.add(Types.type);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var2);
      Types.getDescriptor();
   }

   private PftpResponse() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_protocol_PbPFtpEntry_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_protocol_PbPFtpEntry_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_protocol_PbPFtpDirectory_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_protocol_PbPFtpDirectory_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor e() {
      return internal_static_protocol_PbPFtpIdentifyDeviceResult_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable f() {
      return internal_static_protocol_PbPFtpIdentifyDeviceResult_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor g() {
      return internal_static_protocol_PbPFtpGetSystemTimeResult_descriptor;
   }

   public static FileDescriptor getDescriptor() {
      return descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable h() {
      return internal_static_protocol_PbPFtpGetSystemTimeResult_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor i() {
      return internal_static_protocol_PbPFtpGetLocalTimeResult_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable j() {
      return internal_static_protocol_PbPFtpGetLocalTimeResult_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor k() {
      return internal_static_protocol_PbPFtpDiskSpaceResult_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable l() {
      return internal_static_protocol_PbPFtpDiskSpaceResult_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor m() {
      return internal_static_protocol_PbPFtpGenerateChallengeTokenResult_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable n() {
      return internal_static_protocol_PbPFtpGenerateChallengeTokenResult_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor o() {
      return internal_static_protocol_PbPFtpBatteryStatusResult_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable p() {
      return internal_static_protocol_PbPFtpBatteryStatusResult_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor q() {
      return internal_static_protocol_PbPFtpGetInactivityPreAlertResult_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable r() {
      return internal_static_protocol_PbPFtpGetInactivityPreAlertResult_fieldAccessorTable;
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }
}
