package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class UserIds {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbPasswordToken_descriptor;
   private static final FieldAccessorTable internal_static_data_PbPasswordToken_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserIdentifier_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserIdentifier_fieldAccessorTable;

   static {
      UserIds$1 var0 = new UserIds$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor var3 = Nanopb.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\ruser_id.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\u001a\fnanopb.proto\":\n\u000fPbPasswordToken\u0012\u0014\n\u0005token\u0018\u0001 \u0002(\fB\u0005\u0092?\u0002\b\u0010\u0012\u0011\n\tencrypted\u0018\u0002 \u0002(\b\"Þ\u0001\n\u0010PbUserIdentifier\u0012\u0019\n\u0011master_identifier\u0018\u0001 \u0001(\u0004\u0012\u0015\n\u0005email\u0018\u0002 \u0001(\tB\u0006\u0092?\u0003\b\u0080\u0001\u0012-\n\u000epassword_token\u0018\u0003 \u0001(\u000b2\u0015.data.PbPasswordToken\u0012\u0010\n\bnickname\u0018\u0004 \u0001(\t\u0012\u0012\n\nfirst_name\u0018\u0005 \u0001(\t\u0012\u0011\n\tlast_name\u0018\u0006 \u0001(\t\u00120\n\u0015user_id_last_modified\u0018d \u0001(\u000b2\u0011.PbSystemDateTimeB2\n'fi.polar.remote.representation.protobufB\u0007User", "Ids"}, new FileDescriptor[]{var1, var2, var3}, var0);
      internal_static_data_PbPasswordToken_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbPasswordToken_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbPasswordToken_descriptor, new String[]{"Token", "Encrypted"});
      internal_static_data_PbUserIdentifier_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_data_PbUserIdentifier_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserIdentifier_descriptor, new String[]{"MasterIdentifier", "Email", "PasswordToken", "Nickname", "FirstName", "LastName", "UserIdLastModified"});
      ExtensionRegistry var4 = ExtensionRegistry.newInstance();
      var4.add(Nanopb.nanopb);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var4);
      Types.getDescriptor();
      Structures.getDescriptor();
      Nanopb.getDescriptor();
   }

   private UserIds() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbPasswordToken_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbPasswordToken_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_data_PbUserIdentifier_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_data_PbUserIdentifier_fieldAccessorTable;
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
