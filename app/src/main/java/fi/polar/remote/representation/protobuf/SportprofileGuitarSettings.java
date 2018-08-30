package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class SportprofileGuitarSettings {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbGuitarSportProfileSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbGuitarSportProfileSettings_fieldAccessorTable;

   static {
      SportprofileGuitarSettings$1 var0 = new SportprofileGuitarSettings$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor var3 = SportprofileDisplays.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\"sportprofile_guitar_settings.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\u001a\u001bsportprofile_displays.proto\"Ë\u0007\n\u001cPbGuitarSportProfileSettings\u0012\"\n\u000bheart_touch\u0018\u0001 \u0001(\u000e2\r.PbHeartTouch\u0012-\n\u0011tap_button_action\u0018\u0002 \u0001(\u000e2\u0012.PbTapButtonAction\u0012\u0011\n\tvibration\u0018\u0003 \u0001(\b\u0012\u0012\n\nauto_start\u0018\u0004 \u0001(\b\u0012\u0016\n\u000eauto_scrolling\u0018\u0005 \u0001(\b\u0012B\n\u001cstride_sensor_calib_settings\u0018\u0006 \u0001(\u000b2\u001c.PbStrideSensorCalibSettings\u0012'\n\u0019sprint_display_activation\u0018\u0007 \u0001(\rB\u0004\u0080µ\u0018\u0017\u0012\u0089\u0001\n\u001csport", "_tap_button_sensitivity\u0018\b \u0001(\u000e2>.data.PbGuitarSportProfileSettings.PbSportTapButtonSensitivity:#SPORT_TAP_BUTTON_SENSITIVITY_MEDIUM\u0012*\n\rswimming_pool\u0018\t \u0001(\u000b2\u0013.PbSwimmingPoolInfo\u0012@\n\u0018sirius2_display_settings\u0018\n \u0001(\u000b2\u001e.data.PbSirius2DisplaySettings\u0012,\n\u0010altitude_setting\u0018\u000b \u0001(\u000e2\u0012.PbAltitudeSetting\u0012\"\n\u000bgps_setting\u0018\f \u0001(\u000e2\r.PbGPSSetting\u0012 \n\nauto_pause\u0018\r \u0001(\u000b2\f.PbAutoPause\u0012,\n\u0010autolap_settings\u0018\u000e \u0001(\u000b2\u0012.PbAutoLapSettin", "gs\u0012)\n\u000fheart_rate_view\u0018\u000f \u0001(\u000e2\u0010.PbHeartRateView\"ä\u0001\n\u001bPbSportTapButtonSensitivity\u0012$\n SPORT_TAP_BUTTON_SENSITIVITY_OFF\u0010\u0001\u0012)\n%SPORT_TAP_BUTTON_SENSITIVITY_VERY_LOW\u0010\u0005\u0012$\n SPORT_TAP_BUTTON_SENSITIVITY_LOW\u0010\u0002\u0012'\n#SPORT_TAP_BUTTON_SENSITIVITY_MEDIUM\u0010\u0003\u0012%\n!SPORT_TAP_BUTTON_SENSITIVITY_HIGH\u0010\u0004B)\n'fi.polar.remote.representation.protobuf"}, new FileDescriptor[]{var1, var2, var3}, var0);
      internal_static_data_PbGuitarSportProfileSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbGuitarSportProfileSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbGuitarSportProfileSettings_descriptor, new String[]{"HeartTouch", "TapButtonAction", "Vibration", "AutoStart", "AutoScrolling", "StrideSensorCalibSettings", "SprintDisplayActivation", "SportTapButtonSensitivity", "SwimmingPool", "Sirius2DisplaySettings", "AltitudeSetting", "GpsSetting", "AutoPause", "AutolapSettings", "HeartRateView"});
      ExtensionRegistry var4 = ExtensionRegistry.newInstance();
      var4.add(Types.type);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var4);
      Types.getDescriptor();
      Structures.getDescriptor();
      SportprofileDisplays.getDescriptor();
   }

   private SportprofileGuitarSettings() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbGuitarSportProfileSettings_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbGuitarSportProfileSettings_fieldAccessorTable;
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
