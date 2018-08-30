package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class Identifier {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbIdentifier_descriptor;
   private static final FieldAccessorTable internal_static_data_PbIdentifier_fieldAccessorTable;

   static {
      Identifier$1 var0 = new Identifier$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0014identification.proto\u0012\u0004data\u001a\u000btypes.proto\"\u0083\u0001\n\fPbIdentifier\u0012\u0014\n\fecosystem_id\u0018\u0001 \u0002(\u0004\u0012\"\n\u0007created\u0018\u0002 \u0002(\u000b2\u0011.PbSystemDateTime\u0012(\n\rlast_modified\u0018\u0003 \u0002(\u000b2\u0011.PbSystemDateTime\u0012\u000f\n\u0007deleted\u0018\u0004 \u0001(\bB5\n'fi.polar.remote.representation.protobufB\nIdentifier"}, new FileDescriptor[]{var1}, var0);
      internal_static_data_PbIdentifier_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbIdentifier_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbIdentifier_descriptor, new String[]{"EcosystemId", "Created", "LastModified", "Deleted"});
      Types.getDescriptor();
   }

   private Identifier() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbIdentifier_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbIdentifier_fieldAccessorTable;
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
