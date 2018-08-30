package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class TrainingSession {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbSessionHeartRateStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbSessionHeartRateStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbTrainingSession_descriptor;
   private static final FieldAccessorTable internal_static_data_PbTrainingSession_fieldAccessorTable;

   static {
      TrainingSession$1 var0 = new TrainingSession$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor var3 = Nanopb.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0016training_session.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\u001a\fnanopb.proto\"L\n\u001cPbSessionHeartRateStatistics\u0012\u0015\n\u0007average\u0018\u0001 \u0001(\rB\u0004\u0080µ\u0018\u0014\u0012\u0015\n\u0007maximum\u0018\u0002 \u0001(\rB\u0004\u0080µ\u0018\u0014\"ß\u0005\n\u0011PbTrainingSession\u0012\u001f\n\u0005start\u0018\u0001 \u0002(\u000b2\u0010.PbLocalDateTime\u0012\u001d\n\u0003end\u0018\u0014 \u0001(\u000b2\u0010.PbLocalDateTime\u0012\u0016\n\u000eexercise_count\u0018\u0002 \u0002(\r\u0012\u0011\n\tdevice_id\u0018\u0003 \u0001(\t\u0012\u0012\n\nmodel_name\u0018\u0004 \u0001(\t\u0012\u001d\n\bduration\u0018\u0005 \u0001(\u000b2\u000b.PbDuration\u0012\u0016\n\bdistance\u0018\u0006 \u0001(\u0002B\u0004\u0080µ\u00184\u0012\u0016\n\bcalories\u0018\u0007 \u0001(\rB\u0004\u0080µ\u0018J\u00126\n\nheart_rate\u0018\b \u0001(", "\u000b2\".data.PbSessionHeartRateStatistics\u00124\n\u0018heart_rate_zone_duration\u0018\t \u0003(\u000b2\u000b.PbDurationB\u0005\u0092?\u0002\u0010\u0007\u0012&\n\rtraining_load\u0018\n \u0001(\u000b2\u000f.PbTrainingLoad\u0012$\n\fsession_name\u0018\u000b \u0001(\u000b2\u000e.PbOneLineText\u0012\u000f\n\u0007feeling\u0018\f \u0001(\u0002\u0012\u001e\n\u0004note\u0018\r \u0001(\u000b2\u0010.PbMultiLineText\u0012\u001d\n\u0005place\u0018\u000e \u0001(\u000b2\u000e.PbOneLineText\u0012\u0010\n\blatitude\u0018\u000f \u0001(\u0001\u0012\u0011\n\tlongitude\u0018\u0010 \u0001(\u0001\u0012$\n\u0007benefit\u0018\u0011 \u0001(\u000e2\u0013.PbExerciseFeedback\u0012!\n\u0005sport\u0018\u0012 \u0001(\u000b2\u0012.PbSportIdentifier\u0012>\n\u001atraining_session_target_id\u0018\u0013 \u0001(\u000b2\u001a.Pb", "TrainingSessionTargetId\u0012B\n\u001ctraining_session_favorite_id\u0018\u0015 \u0001(\u000b2\u001c.PbTrainingSessionFavoriteIdB:\n'fi.polar.remote.representation.protobufB\u000fTrainingSession"}, new FileDescriptor[]{var1, var2, var3}, var0);
      internal_static_data_PbSessionHeartRateStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbSessionHeartRateStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbSessionHeartRateStatistics_descriptor, new String[]{"Average", "Maximum"});
      internal_static_data_PbTrainingSession_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_data_PbTrainingSession_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbTrainingSession_descriptor, new String[]{"Start", "End", "ExerciseCount", "DeviceId", "ModelName", "Duration", "Distance", "Calories", "HeartRate", "HeartRateZoneDuration", "TrainingLoad", "SessionName", "Feeling", "Note", "Place", "Latitude", "Longitude", "Benefit", "Sport", "TrainingSessionTargetId", "TrainingSessionFavoriteId"});
      ExtensionRegistry var4 = ExtensionRegistry.newInstance();
      var4.add(Nanopb.nanopb);
      var4.add(Types.type);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var4);
      Types.getDescriptor();
      Structures.getDescriptor();
      Nanopb.getDescriptor();
   }

   private TrainingSession() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbSessionHeartRateStatistics_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbSessionHeartRateStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_data_PbTrainingSession_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_data_PbTrainingSession_fieldAccessorTable;
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
