package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class ExerciseRouteSamples {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbExerciseRouteSamples_descriptor;
   private static final FieldAccessorTable internal_static_data_PbExerciseRouteSamples_fieldAccessorTable;

   static {
      ExerciseRouteSamples$1 var0 = new ExerciseRouteSamples$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0014exercise_route.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\"¸\u0002\n\u0016PbExerciseRouteSamples\u0012\u0014\n\bduration\u0018\u0001 \u0003(\rB\u0002\u0010\u0001\u0012\u0010\n\blatitude\u0018\u0002 \u0003(\u0001\u0012\u0011\n\tlongitude\u0018\u0003 \u0003(\u0001\u0012\u0018\n\fgps_altitude\u0018\u0004 \u0003(\u0011B\u0002\u0010\u0001\u0012\u001c\n\u0010satellite_amount\u0018\u0005 \u0003(\rB\u0002\u0010\u0001\u0012\u0018\n\fOBSOLETE_fix\u0018\u0006 \u0003(\bB\u0002\u0010\u0001\u0012.\n\u0014OBSOLETE_gps_offline\u0018\u0007 \u0003(\u000b2\u0010.PbSensorOffline\u00121\n\u0016OBSOLETE_gps_date_time\u0018\b \u0003(\u000b2\u0011.PbSystemDateTime\u0012.\n\u0013first_location_time\u0018\t \u0001(\u000b2\u0011.PbSystemDateTimeB?\n'fi.polar.remote.repres", "entation.protobufB\u0014ExerciseRouteSamples"}, new FileDescriptor[]{var1, var2}, var0);
      internal_static_data_PbExerciseRouteSamples_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbExerciseRouteSamples_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbExerciseRouteSamples_descriptor, new String[]{"Duration", "Latitude", "Longitude", "GpsAltitude", "SatelliteAmount", "OBSOLETEFix", "OBSOLETEGpsOffline", "OBSOLETEGpsDateTime", "FirstLocationTime"});
      Types.getDescriptor();
      Structures.getDescriptor();
   }

   private ExerciseRouteSamples() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbExerciseRouteSamples_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbExerciseRouteSamples_fieldAccessorTable;
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
