package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class SportprofileAvalonSettings {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbAvalonSportProfileSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbAvalonSportProfileSettings_fieldAccessorTable;

   static {
      SportprofileAvalonSettings$1 var0 = new SportprofileAvalonSettings$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = SportprofileDisplays.getDescriptor();
      FileDescriptor var3 = Structures.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\"sportprofile_avalon_settings.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u001bsportprofile_displays.proto\u001a\u0010structures.proto\"Â\u0001\n\u001cPbAvalonSportProfileSettings\u0012\"\n\u000bheart_touch\u0018\u0001 \u0001(\u000e2\r.PbHeartTouch\u0012\u0011\n\tvibration\u0018\u0003 \u0001(\b\u0012\u0012\n\nauto_start\u0018\u0004 \u0001(\b\u0012,\n\u0010autolap_settings\u0018\u0005 \u0001(\u000b2\u0012.PbAutoLapSettings\u0012)\n\u000fheart_rate_view\u0018\u0006 \u0001(\u000e2\u0010.PbHeartRateViewB)\n'fi.polar.remote.representation.protobuf"}, new FileDescriptor[]{var1, var2, var3}, var0);
      internal_static_data_PbAvalonSportProfileSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbAvalonSportProfileSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbAvalonSportProfileSettings_descriptor, new String[]{"HeartTouch", "Vibration", "AutoStart", "AutolapSettings", "HeartRateView"});
      Types.getDescriptor();
      SportprofileDisplays.getDescriptor();
      Structures.getDescriptor();
   }

   private SportprofileAvalonSettings() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbAvalonSportProfileSettings_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbAvalonSportProfileSettings_fieldAccessorTable;
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
