package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class SportprofileAstraSettings {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbAstraSportProfileSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbAstraSportProfileSettings_fieldAccessorTable;

   static {
      SportprofileAstraSettings$1 var0 = new SportprofileAstraSettings$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n!sportprofile_astra_settings.proto\u0012\u0004data\u001a\u000btypes.proto\"[\n\u001bPbAstraSportProfileSettings\u0012\u0011\n\tvibration\u0018\u0003 \u0001(\b\u0012)\n\u000fheart_rate_view\u0018\u0004 \u0001(\u000e2\u0010.PbHeartRateViewB)\n'fi.polar.remote.representation.protobuf"}, new FileDescriptor[]{var1}, var0);
      internal_static_data_PbAstraSportProfileSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbAstraSportProfileSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbAstraSportProfileSettings_descriptor, new String[]{"Vibration", "HeartRateView"});
      Types.getDescriptor();
   }

   private SportprofileAstraSettings() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbAstraSportProfileSettings_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbAstraSportProfileSettings_fieldAccessorTable;
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
