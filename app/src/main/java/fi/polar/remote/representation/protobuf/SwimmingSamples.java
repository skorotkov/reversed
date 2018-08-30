package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class SwimmingSamples {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbSwimmingPoolMetric_descriptor;
   private static final FieldAccessorTable internal_static_data_PbSwimmingPoolMetric_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbSwimmingSamples_descriptor;
   private static final FieldAccessorTable internal_static_data_PbSwimmingSamples_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbSwimmingStyleChange_descriptor;
   private static final FieldAccessorTable internal_static_data_PbSwimmingStyleChange_fieldAccessorTable;

   static {
      SwimmingSamples$1 var0 = new SwimmingSamples$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0016swimming_samples.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\"X\n\u0015PbSwimmingStyleChange\u0012\u001f\n\u0005style\u0018\u0001 \u0002(\u000e2\u0010.PbSwimmingStyle\u0012\u001e\n\ttimestamp\u0018\u0002 \u0002(\u000b2\u000b.PbDuration\"\u008a\u0001\n\u0014PbSwimmingPoolMetric\u0012!\n\fstart_offset\u0018\u0001 \u0002(\u000b2\u000b.PbDuration\u0012\u001d\n\bduration\u0018\u0002 \u0002(\u000b2\u000b.PbDuration\u0012\u001f\n\u0005style\u0018\u0003 \u0001(\u000e2\u0010.PbSwimmingStyle\u0012\u000f\n\u0007strokes\u0018\u0004 \u0001(\r\"e\n\u0011PbSwimmingSamples\u0012\u001f\n\u0005start\u0018\u0001 \u0002(\u000b2\u0010.PbLocalDateTime\u0012/\n\u000bpool_metric\u0018\u0003 \u0003(\u000b2\u001a.data.PbSwimmingPoolMetricB:\n'f", "i.polar.remote.representation.protobufB\u000fSwimmingSamples"}, new FileDescriptor[]{var1, var2}, var0);
      internal_static_data_PbSwimmingStyleChange_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbSwimmingStyleChange_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbSwimmingStyleChange_descriptor, new String[]{"Style", "Timestamp"});
      internal_static_data_PbSwimmingPoolMetric_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_data_PbSwimmingPoolMetric_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbSwimmingPoolMetric_descriptor, new String[]{"StartOffset", "Duration", "Style", "Strokes"});
      internal_static_data_PbSwimmingSamples_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_data_PbSwimmingSamples_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbSwimmingSamples_descriptor, new String[]{"Start", "PoolMetric"});
      Types.getDescriptor();
      Structures.getDescriptor();
   }

   private SwimmingSamples() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbSwimmingStyleChange_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbSwimmingStyleChange_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_data_PbSwimmingPoolMetric_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_data_PbSwimmingPoolMetric_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor e() {
      return internal_static_data_PbSwimmingSamples_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable f() {
      return internal_static_data_PbSwimmingSamples_fieldAccessorTable;
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
