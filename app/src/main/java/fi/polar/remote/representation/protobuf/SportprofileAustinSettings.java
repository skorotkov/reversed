package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class SportprofileAustinSettings {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbAustinSportProfileSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbAustinSportProfileSettings_fieldAccessorTable;

   static {
      SportprofileAustinSettings$1 var0 = new SportprofileAustinSettings$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = SportprofileDisplays.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\"sportprofile_austin_settings.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u001bsportprofile_displays.proto\"ì\u0001\n\u001cPbAustinSportProfileSettings\u0012\u0011\n\tvibration\u0018\u0003 \u0001(\b\u0012<\n\u0016alcor_display_settings\u0018\u0004 \u0001(\u000b2\u001c.data.PbAlcorDisplaySettings\u0012\"\n\u000bgps_setting\u0018\u0005 \u0001(\u000e2\r.PbGPSSetting\u0012,\n\u0010autolap_settings\u0018\u0006 \u0001(\u000b2\u0012.PbAutoLapSettings\u0012)\n\u000fheart_rate_view\u0018\u0007 \u0001(\u000e2\u0010.PbHeartRateViewB)\n'fi.polar.remote.representation.protobuf"}, new FileDescriptor[]{var1, var2}, var0);
      internal_static_data_PbAustinSportProfileSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbAustinSportProfileSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbAustinSportProfileSettings_descriptor, new String[]{"Vibration", "AlcorDisplaySettings", "GpsSetting", "AutolapSettings", "HeartRateView"});
      Types.getDescriptor();
      SportprofileDisplays.getDescriptor();
   }

   private SportprofileAustinSettings() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbAustinSportProfileSettings_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbAustinSportProfileSettings_fieldAccessorTable;
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
