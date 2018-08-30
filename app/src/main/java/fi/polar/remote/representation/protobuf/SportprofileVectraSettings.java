package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class SportprofileVectraSettings {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbVectraSportProfileSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbVectraSportProfileSettings_fieldAccessorTable;

   static {
      SportprofileVectraSettings$1 var0 = new SportprofileVectraSettings$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\"sportprofile_vectra_settings.proto\u0012\u0004data\u001a\u000btypes.proto\"\u0080\u0001\n\u001cPbVectraSportProfileSettings\u0012\u0011\n\tvibration\u0018\u0003 \u0001(\b\u0012)\n\u000fheart_rate_view\u0018\u0004 \u0001(\u000e2\u0010.PbHeartRateView\u0012\"\n\u000bgps_setting\u0018\u0005 \u0001(\u000e2\r.PbGPSSettingB)\n'fi.polar.remote.representation.protobuf"}, new FileDescriptor[]{var1}, var0);
      internal_static_data_PbVectraSportProfileSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbVectraSportProfileSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbVectraSportProfileSettings_descriptor, new String[]{"Vibration", "HeartRateView", "GpsSetting"});
      Types.getDescriptor();
   }

   private SportprofileVectraSettings() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbVectraSportProfileSettings_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbVectraSportProfileSettings_fieldAccessorTable;
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
