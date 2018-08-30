package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class SportprofileMaseratiSettings {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbMaseratiSportProfileSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbMaseratiSportProfileSettings_fieldAccessorTable;

   static {
      SportprofileMaseratiSettings$1 var0 = new SportprofileMaseratiSettings$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor var3 = SportprofileDisplays.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n$sportprofile_maserati_settings.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\u001a\u001bsportprofile_displays.proto\"\u0087\u0003\n\u001ePbMaseratiSportProfileSettings\u0012\"\n\u000bheart_touch\u0018\u0001 \u0001(\u000e2\r.PbHeartTouch\u0012-\n\u0011tap_button_action\u0018\u0002 \u0001(\u000e2\u0012.PbTapButtonAction\u0012\u0011\n\tvibration\u0018\u0003 \u0001(\b\u0012\u0012\n\nauto_start\u0018\u0004 \u0001(\b\u0012@\n\u0018sirius2_display_settings\u0018\u0005 \u0001(\u000b2\u001e.data.PbSirius2DisplaySettings\u0012,\n\u0010altitude_setting\u0018\u0006 \u0001(\u000e2\u0012.PbAltitudeSetting\u0012\"\n\u000bgps_setting\u0018\u0007 \u0001(\u000e2\r.PbG", "PSSetting\u0012,\n\u0010autolap_settings\u0018\b \u0001(\u000b2\u0012.PbAutoLapSettings\u0012)\n\u000fheart_rate_view\u0018\t \u0001(\u000e2\u0010.PbHeartRateViewB)\n'fi.polar.remote.representation.protobuf"}, new FileDescriptor[]{var1, var2, var3}, var0);
      internal_static_data_PbMaseratiSportProfileSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbMaseratiSportProfileSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbMaseratiSportProfileSettings_descriptor, new String[]{"HeartTouch", "TapButtonAction", "Vibration", "AutoStart", "Sirius2DisplaySettings", "AltitudeSetting", "GpsSetting", "AutolapSettings", "HeartRateView"});
      Types.getDescriptor();
      Structures.getDescriptor();
      SportprofileDisplays.getDescriptor();
   }

   private SportprofileMaseratiSettings() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbMaseratiSportProfileSettings_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbMaseratiSportProfileSettings_fieldAccessorTable;
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
