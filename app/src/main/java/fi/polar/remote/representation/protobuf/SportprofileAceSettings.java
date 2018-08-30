package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class SportprofileAceSettings {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbAceSportProfileSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbAceSportProfileSettings_fieldAccessorTable;

   static {
      SportprofileAceSettings$1 var0 = new SportprofileAceSettings$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = SportprofileDisplays.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001fsportprofile_ace_settings.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u001bsportprofile_displays.proto\"ø\u0002\n\u0019PbAceSportProfileSettings\u0012\"\n\u000bheart_touch\u0018\u0001 \u0001(\u000e2\r.PbHeartTouch\u0012\u0012\n\nauto_start\u0018\u0004 \u0001(\b\u0012B\n\u001cstride_sensor_calib_settings\u0018\u0006 \u0001(\u000b2\u001c.PbStrideSensorCalibSettings\u0012@\n\u0018sirius2_display_settings\u0018\u0007 \u0001(\u000b2\u001e.data.PbSirius2DisplaySettings\u0012\"\n\u000bgps_setting\u0018\b \u0001(\u000e2\r.PbGPSSetting\u0012,\n\u0010autolap_settings\u0018\t \u0001(\u000b2\u0012.PbAutoLapSettings\u0012)\n\u000fheart_rate_vi", "ew\u0018\n \u0001(\u000e2\u0010.PbHeartRateView\u0012 \n\nauto_pause\u0018\u000b \u0001(\u000b2\f.PbAutoPauseB)\n'fi.polar.remote.representation.protobuf"}, new FileDescriptor[]{var1, var2}, var0);
      internal_static_data_PbAceSportProfileSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbAceSportProfileSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbAceSportProfileSettings_descriptor, new String[]{"HeartTouch", "AutoStart", "StrideSensorCalibSettings", "Sirius2DisplaySettings", "GpsSetting", "AutolapSettings", "HeartRateView", "AutoPause"});
      Types.getDescriptor();
      SportprofileDisplays.getDescriptor();
   }

   private SportprofileAceSettings() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbAceSportProfileSettings_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbAceSportProfileSettings_fieldAccessorTable;
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
