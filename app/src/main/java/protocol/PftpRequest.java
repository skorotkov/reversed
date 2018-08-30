package protocol;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import fi.polar.remote.representation.protobuf.Types;

public final class PftpRequest {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_protocol_PbPFtpCleanupDiskSpaceParams_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPFtpCleanupDiskSpaceParams_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPFtpGenerateChallengeTokenParams_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPFtpGenerateChallengeTokenParams_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPFtpOperation_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPFtpOperation_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPFtpSetAdbModeParams_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPFtpSetAdbModeParams_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPFtpSetLocalTimeParams_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPFtpSetLocalTimeParams_fieldAccessorTable;
   private static final Descriptor internal_static_protocol_PbPFtpSetSystemTimeParams_descriptor;
   private static final FieldAccessorTable internal_static_protocol_PbPFtpSetSystemTimeParams_fieldAccessorTable;

   static {
      PftpRequest$1 var0 = new PftpRequest$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012pftp_request.proto\u0012\bprotocol\u001a\u000btypes.proto\"\u0087\u0001\n\u000fPbPFtpOperation\u00122\n\u0007command\u0018\u0001 \u0002(\u000e2!.protocol.PbPFtpOperation.Command\u0012\f\n\u0004path\u0018\u0002 \u0002(\t\"2\n\u0007Command\u0012\u0007\n\u0003GET\u0010\u0000\u0012\u0007\n\u0003PUT\u0010\u0001\u0012\t\n\u0005MERGE\u0010\u0002\u0012\n\n\u0006REMOVE\u0010\u0003\"Z\n\u0019PbPFtpSetSystemTimeParams\u0012\u0015\n\u0004date\u0018\u0001 \u0002(\u000b2\u0007.PbDate\u0012\u0015\n\u0004time\u0018\u0002 \u0002(\u000b2\u0007.PbTime\u0012\u000f\n\u0007trusted\u0018\u0003 \u0002(\b\"a\n\u0018PbPFtpSetLocalTimeParams\u0012\u0015\n\u0004date\u0018\u0001 \u0002(\u000b2\u0007.PbDate\u0012\u0015\n\u0004time\u0018\u0002 \u0002(\u000b2\u0007.PbTime\u0012\u0017\n\ttz_offset\u0018\u0003 \u0001(\u0005B\u0004\u0080µ\u0018B\"D\n\"PbPFtpGenerateChallengeT", "okenParams\u0012\u000f\n\u0007user_id\u0018\u0001 \u0002(\r\u0012\r\n\u0005nonse\u0018\u0002 \u0002(\f\"(\n\u0016PbPFtpSetAdbModeParams\u0012\u000e\n\u0006enable\u0018\u0001 \u0002(\b\"6\n\u001cPbPFtpCleanupDiskSpaceParams\u0012\u0016\n\u000erequired_bytes\u0018\u0001 \u0002(\u0004*×\u0002\n\u000bPbPFtpQuery\u0012\u0013\n\u000fIDENTIFY_DEVICE\u0010\u0000\u0012\u0013\n\u000fSET_SYSTEM_TIME\u0010\u0001\u0012\u0013\n\u000fGET_SYSTEM_TIME\u0010\u0002\u0012\u0012\n\u000eSET_LOCAL_TIME\u0010\u0003\u0012\u0012\n\u000eGET_LOCAL_TIME\u0010\u0004\u0012\u0012\n\u000eGET_DISK_SPACE\u0010\u0005\u0012\u001c\n\u0018GENERATE_CHALLENGE_TOKEN\u0010\u0006\u0012\u0015\n\u0011SET_INTERNAL_TEST\u0010\u0007\u0012\u0016\n\u0012GET_BATTERY_STATUS\u0010\b\u0012\u0010\n\fSET_ADB_MODE\u0010\t\u0012\u0016\n\u0012CLEANUP_DISK_SPACE\u0010\n\u0012\u001c", "\n\u0018GET_INACTIVITY_PRE_ALERT\u0010\u000b\u0012\u001b\n\u0017PREPARE_FIRMWARE_UPDATE\u0010\f\u0012\u001b\n\u0017REQUEST_SYNCHRONIZATION\u0010\r"}, new FileDescriptor[]{var1}, var0);
      internal_static_protocol_PbPFtpOperation_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_protocol_PbPFtpOperation_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPFtpOperation_descriptor, new String[]{"Command", "Path"});
      internal_static_protocol_PbPFtpSetSystemTimeParams_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_protocol_PbPFtpSetSystemTimeParams_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPFtpSetSystemTimeParams_descriptor, new String[]{"Date", "Time", "Trusted"});
      internal_static_protocol_PbPFtpSetLocalTimeParams_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_protocol_PbPFtpSetLocalTimeParams_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPFtpSetLocalTimeParams_descriptor, new String[]{"Date", "Time", "TzOffset"});
      internal_static_protocol_PbPFtpGenerateChallengeTokenParams_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_protocol_PbPFtpGenerateChallengeTokenParams_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPFtpGenerateChallengeTokenParams_descriptor, new String[]{"UserId", "Nonse"});
      internal_static_protocol_PbPFtpSetAdbModeParams_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_protocol_PbPFtpSetAdbModeParams_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPFtpSetAdbModeParams_descriptor, new String[]{"Enable"});
      internal_static_protocol_PbPFtpCleanupDiskSpaceParams_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_protocol_PbPFtpCleanupDiskSpaceParams_fieldAccessorTable = new FieldAccessorTable(internal_static_protocol_PbPFtpCleanupDiskSpaceParams_descriptor, new String[]{"RequiredBytes"});
      ExtensionRegistry var2 = ExtensionRegistry.newInstance();
      var2.add(Types.type);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var2);
      Types.getDescriptor();
   }

   private PftpRequest() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_protocol_PbPFtpOperation_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_protocol_PbPFtpOperation_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_protocol_PbPFtpSetSystemTimeParams_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_protocol_PbPFtpSetSystemTimeParams_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor e() {
      return internal_static_protocol_PbPFtpSetLocalTimeParams_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable f() {
      return internal_static_protocol_PbPFtpSetLocalTimeParams_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor g() {
      return internal_static_protocol_PbPFtpGenerateChallengeTokenParams_descriptor;
   }

   public static FileDescriptor getDescriptor() {
      return descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable h() {
      return internal_static_protocol_PbPFtpGenerateChallengeTokenParams_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor i() {
      return internal_static_protocol_PbPFtpSetAdbModeParams_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable j() {
      return internal_static_protocol_PbPFtpSetAdbModeParams_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor k() {
      return internal_static_protocol_PbPFtpCleanupDiskSpaceParams_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable l() {
      return internal_static_protocol_PbPFtpCleanupDiskSpaceParams_fieldAccessorTable;
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }
}
