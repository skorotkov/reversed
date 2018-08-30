package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class SyncInfo {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbSyncInfo_descriptor;
   private static final FieldAccessorTable internal_static_data_PbSyncInfo_fieldAccessorTable;

   static {
      SyncInfo$1 var0 = new SyncInfo$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000esyncinfo.proto\u0012\u0004data\u001a\u000btypes.proto\"\u009c\u0001\n\nPbSyncInfo\u0012(\n\rlast_modified\u0018\u0001 \u0002(\u000b2\u0011.PbSystemDateTime\u0012\u0014\n\fchanged_path\u0018\u0002 \u0003(\t\u0012,\n\u0011last_synchronized\u0018\u0003 \u0001(\u000b2\u0011.PbSystemDateTime\u0012 \n\u0012full_sync_required\u0018\u0004 \u0001(\b:\u0004trueB3\n'fi.polar.remote.representation.protobufB\bSyncInfo"}, new FileDescriptor[]{var1}, var0);
      internal_static_data_PbSyncInfo_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbSyncInfo_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbSyncInfo_descriptor, new String[]{"LastModified", "ChangedPath", "LastSynchronized", "FullSyncRequired"});
      Types.getDescriptor();
   }

   private SyncInfo() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbSyncInfo_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbSyncInfo_fieldAccessorTable;
   }

   public static FileDescriptor getDescriptor() {
      return descriptor;
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }
}
