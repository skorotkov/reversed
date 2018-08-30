package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class Sport {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbSportTranslation_descriptor;
   private static final FieldAccessorTable internal_static_data_PbSportTranslation_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbSport_descriptor;
   private static final FieldAccessorTable internal_static_data_PbSport_fieldAccessorTable;

   static {
      Sport$1 var0 = new Sport$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor var3 = Nanopb.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000bsport.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\u001a\fnanopb.proto\"Ç\u0001\n\u0012PbSportTranslation\u0012\u0019\n\u0002id\u0018\u0001 \u0002(\u000b2\r.PbLanguageId\u0012\"\n\nshort_text\u0018\u0002 \u0002(\u000b2\u000e.PbOneLineText\u0012#\n\u000bmedium_text\u0018\u0003 \u0001(\u000b2\u000e.PbOneLineText\u0012!\n\tlong_text\u0018\u0004 \u0001(\u000b2\u000e.PbOneLineText\u0012*\n\u0012long_two_line_text\u0018\u0005 \u0001(\u000b2\u000e.PbOneLineText\"ì\u0004\n\u0007PbSport\u0012&\n\nidentifier\u0018\u0001 \u0002(\u000b2\u0012.PbSportIdentifier\u0012-\n\u0011parent_identifier\u0018\u0002 \u0002(\u000b2\u0012.PbSportIdentifier\u0012-\n\u000btranslation\u0018\u0003 \u0003(\u000b2\u0018.data.PbSpor", "tTranslation\u0012\u000e\n\u0006factor\u0018\u0004 \u0001(\u0002\u0012\"\n\u0006stages\u0018\u0005 \u0003(\u000b2\u0012.PbSportIdentifier\u0012F\n\nsport_type\u0018\u0006 \u0001(\u000e2\u0019.data.PbSport.PbSportType:\u0017SPORT_TYPE_SINGLE_SPORT\u0012\"\n\u0013speed_zones_enabled\u0018\u0007 \u0001(\b:\u0005false\u00123\n%running_metric_measurements_supported\u0018\b \u0001(\b:\u0004true\u00124\n\u0014acceleration_metrics\u0018\t \u0003(\u000b2\u0016.PbAccelerationMetrics\u0012\"\n\u0007created\u0018d \u0001(\u000b2\u0011.PbSystemDateTime\u0012(\n\rlast_modified\u0018e \u0001(\u000b2\u0011.PbSystemDateTime\"\u0081\u0001\n\u000bPbSportType\u0012\u001b\n\u0017SPORT_TYPE_SINGLE_SPORT", "\u0010\u0001\u0012\u001a\n\u0016SPORT_TYPE_MULTI_SPORT\u0010\u0002\u0012\u0018\n\u0014SPORT_TYPE_SUB_SPORT\u0010\u0003\u0012\u001f\n\u001bSPORT_TYPE_FREE_MULTI_SPORT\u0010\u0004B0\n'fi.polar.remote.representation.protobufB\u0005Sport"}, new FileDescriptor[]{var1, var2, var3}, var0);
      internal_static_data_PbSportTranslation_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbSportTranslation_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbSportTranslation_descriptor, new String[]{"Id", "ShortText", "MediumText", "LongText", "LongTwoLineText"});
      internal_static_data_PbSport_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_data_PbSport_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbSport_descriptor, new String[]{"Identifier", "ParentIdentifier", "Translation", "Factor", "Stages", "SportType", "SpeedZonesEnabled", "RunningMetricMeasurementsSupported", "AccelerationMetrics", "Created", "LastModified"});
      Types.getDescriptor();
      Structures.getDescriptor();
      Nanopb.getDescriptor();
   }

   private Sport() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbSportTranslation_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbSportTranslation_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_data_PbSport_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_data_PbSport_fieldAccessorTable;
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
