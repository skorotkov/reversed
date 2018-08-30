package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class ExerciseRRSamples {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbExerciseRRIntervals_descriptor;
   private static final FieldAccessorTable internal_static_data_PbExerciseRRIntervals_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbRROffline_descriptor;
   private static final FieldAccessorTable internal_static_data_PbRROffline_fieldAccessorTable;

   static {
      ExerciseRRSamples$1 var0 = new ExerciseRRSamples$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0019exercise_rr_samples.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\"R\n\u000bPbRROffline\u0012\u001f\n\nstart_time\u0018\u0001 \u0002(\u000b2\u000b.PbDuration\u0012\"\n\rtime_interval\u0018\u0002 \u0002(\u000b2\u000b.PbDuration\"_\n\u0015PbExerciseRRIntervals\u0012\u0018\n\frr_intervals\u0018\u0001 \u0003(\rB\u0002\u0010\u0001\u0012,\n\u0011rr_sensor_offline\u0018\u0002 \u0003(\u000b2\u0011.data.PbRROfflineB<\n'fi.polar.remote.representation.protobufB\u0011ExerciseRRSamples"}, new FileDescriptor[]{var1, var2}, var0);
      internal_static_data_PbRROffline_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbRROffline_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbRROffline_descriptor, new String[]{"StartTime", "TimeInterval"});
      internal_static_data_PbExerciseRRIntervals_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_data_PbExerciseRRIntervals_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbExerciseRRIntervals_descriptor, new String[]{"RrIntervals", "RrSensorOffline"});
      Types.getDescriptor();
      Structures.getDescriptor();
   }

   private ExerciseRRSamples() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbRROffline_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbRROffline_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_data_PbExerciseRRIntervals_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_data_PbExerciseRRIntervals_fieldAccessorTable;
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
