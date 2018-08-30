package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class SportprofileRangerSettings {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbRangerSportProfileSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbRangerSportProfileSettings_fieldAccessorTable;

   static {
      SportprofileRangerSettings$1 var0 = new SportprofileRangerSettings$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\"sportprofile_ranger_settings.proto\u0012\u0004data\u001a\u000btypes.proto\"B\n\u001cPbRangerSportProfileSettings\u0012\"\n\u000bgps_setting\u0018\u0001 \u0001(\u000e2\r.PbGPSSettingB)\n'fi.polar.remote.representation.protobuf"}, new FileDescriptor[]{var1}, var0);
      internal_static_data_PbRangerSportProfileSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbRangerSportProfileSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbRangerSportProfileSettings_descriptor, new String[]{"GpsSetting"});
      Types.getDescriptor();
   }

   private SportprofileRangerSettings() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbRangerSportProfileSettings_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbRangerSportProfileSettings_fieldAccessorTable;
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
