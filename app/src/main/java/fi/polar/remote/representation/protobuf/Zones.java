package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class Zones {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbRecordedFatFitZones_descriptor;
   private static final FieldAccessorTable internal_static_data_PbRecordedFatFitZones_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbRecordedHeartRateZone_descriptor;
   private static final FieldAccessorTable internal_static_data_PbRecordedHeartRateZone_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbRecordedPowerZone_descriptor;
   private static final FieldAccessorTable internal_static_data_PbRecordedPowerZone_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbRecordedSpeedZone_descriptor;
   private static final FieldAccessorTable internal_static_data_PbRecordedSpeedZone_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbRecordedZones_descriptor;
   private static final FieldAccessorTable internal_static_data_PbRecordedZones_fieldAccessorTable;

   static {
      Zones$1 var0 = new Zones$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor var3 = Nanopb.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0014exercise_zones.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\u001a\fnanopb.proto\"^\n\u0017PbRecordedHeartRateZone\u0012%\n\u000bzone_limits\u0018\u0001 \u0002(\u000b2\u0010.PbHeartRateZone\u0012\u001c\n\u0007in_zone\u0018\u0002 \u0002(\u000b2\u000b.PbDuration\"V\n\u0013PbRecordedPowerZone\u0012!\n\u000bzone_limits\u0018\u0001 \u0002(\u000b2\f.PbPowerZone\u0012\u001c\n\u0007in_zone\u0018\u0002 \u0002(\u000b2\u000b.PbDuration\"q\n\u0015PbRecordedFatFitZones\u0012\u001a\n\ffatfit_limit\u0018\u0001 \u0002(\rB\u0004\u0080µ\u0018\u0014\u0012\u001d\n\bfat_time\u0018\u0002 \u0002(\u000b2\u000b.PbDuration\u0012\u001d\n\bfit_time\u0018\u0003 \u0002(\u000b2\u000b.PbDuration\"{\n\u0013PbRecordedSpeedZone\u0012!\n\u000bz", "one_limits\u0018\u0001 \u0002(\u000b2\f.PbSpeedZone\u0012!\n\ftime_in_zone\u0018\u0002 \u0001(\u000b2\u000b.PbDuration\u0012\u001e\n\u0010distance_in_zone\u0018\u0003 \u0001(\u0002B\u0004\u0080µ\u00184\"£\u0003\n\u000fPbRecordedZones\u0012=\n\u000fheart_rate_zone\u0018\u0001 \u0003(\u000b2\u001d.data.PbRecordedHeartRateZoneB\u0005\u0092?\u0002\u0010\u0007\u00124\n\npower_zone\u0018\u0002 \u0003(\u000b2\u0019.data.PbRecordedPowerZoneB\u0005\u0092?\u0002\u0010\u0007\u00121\n\ffatfit_zones\u0018\u0003 \u0001(\u000b2\u001b.data.PbRecordedFatFitZones\u00124\n\nspeed_zone\u0018\u0004 \u0003(\u000b2\u0019.data.PbRecordedSpeedZoneB\u0005\u0092?\u0002\u0010\u0007\u0012@\n\u0019heart_rate_setting_source\u0018\n \u0001(\u000e2\u001d.PbHeartRateZoneSettingS", "ource\u00127\n\u0014power_setting_source\u0018\u000b \u0001(\u000e2\u0019.PbPowerZoneSettingSource\u00127\n\u0014speed_setting_source\u0018\f \u0001(\u000e2\u0019.PbSpeedZoneSettingSourceB0\n'fi.polar.remote.representation.protobufB\u0005Zones"}, new FileDescriptor[]{var1, var2, var3}, var0);
      internal_static_data_PbRecordedHeartRateZone_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbRecordedHeartRateZone_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbRecordedHeartRateZone_descriptor, new String[]{"ZoneLimits", "InZone"});
      internal_static_data_PbRecordedPowerZone_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_data_PbRecordedPowerZone_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbRecordedPowerZone_descriptor, new String[]{"ZoneLimits", "InZone"});
      internal_static_data_PbRecordedFatFitZones_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_data_PbRecordedFatFitZones_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbRecordedFatFitZones_descriptor, new String[]{"FatfitLimit", "FatTime", "FitTime"});
      internal_static_data_PbRecordedSpeedZone_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_data_PbRecordedSpeedZone_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbRecordedSpeedZone_descriptor, new String[]{"ZoneLimits", "TimeInZone", "DistanceInZone"});
      internal_static_data_PbRecordedZones_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_data_PbRecordedZones_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbRecordedZones_descriptor, new String[]{"HeartRateZone", "PowerZone", "FatfitZones", "SpeedZone", "HeartRateSettingSource", "PowerSettingSource", "SpeedSettingSource"});
      ExtensionRegistry var4 = ExtensionRegistry.newInstance();
      var4.add(Nanopb.nanopb);
      var4.add(Types.type);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var4);
      Types.getDescriptor();
      Structures.getDescriptor();
      Nanopb.getDescriptor();
   }

   private Zones() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbRecordedHeartRateZone_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbRecordedHeartRateZone_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_data_PbRecordedPowerZone_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_data_PbRecordedPowerZone_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor e() {
      return internal_static_data_PbRecordedFatFitZones_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable f() {
      return internal_static_data_PbRecordedFatFitZones_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor g() {
      return internal_static_data_PbRecordedSpeedZone_descriptor;
   }

   public static FileDescriptor getDescriptor() {
      return descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable h() {
      return internal_static_data_PbRecordedSpeedZone_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor i() {
      return internal_static_data_PbRecordedZones_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable j() {
      return internal_static_data_PbRecordedZones_fieldAccessorTable;
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }
}
