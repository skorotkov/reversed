package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class TrainingSessionTarget {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbExerciseTarget_descriptor;
   private static final FieldAccessorTable internal_static_data_PbExerciseTarget_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbSteadyRacePace_descriptor;
   private static final FieldAccessorTable internal_static_data_PbSteadyRacePace_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbTrainingSessionTarget_descriptor;
   private static final FieldAccessorTable internal_static_data_PbTrainingSessionTarget_fieldAccessorTable;

   static {
      TrainingSessionTarget$1 var0 = new TrainingSessionTarget$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor var3 = Nanopb.getDescriptor();
      FileDescriptor var4 = ExercisePhase.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001dtraining_session_target.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\u001a\fnanopb.proto\u001a\u0015exercise_phases.proto\"I\n\u0010PbSteadyRacePace\u0012\u001d\n\bduration\u0018\u0001 \u0002(\u000b2\u000b.PbDuration\u0012\u0016\n\bdistance\u0018\u0002 \u0002(\u0002B\u0004\u0080µ\u00184\"°\u0002\n\u0010PbExerciseTarget\u0012*\n\u000btarget_type\u0018\u0001 \u0002(\u000e2\u0015.PbExerciseTargetType\u0012$\n\bsport_id\u0018\u0002 \u0001(\u000b2\u0012.PbSportIdentifier\u0012&\n\rvolume_target\u0018\u0003 \u0001(\u000b2\u000f.PbVolumeTarget\u0012\u001e\n\u0006phases\u0018\u0004 \u0001(\u000b2\u000e.data.PbPhases\u0012\u0019\n\u0005route\u0018\u0005 \u0001(\u000b2\n.PbRouteId\u00120\n\u0010steady_race_pa", "ce\u0018\u0006 \u0001(\u000b2\u0016.data.PbSteadyRacePace\u00125\n\u0015strava_segment_target\u0018\u0007 \u0001(\u000b2\u0016.PbStravaSegmentTarget\"à\u0002\n\u0017PbTrainingSessionTarget\u0012\u001c\n\u0004name\u0018\u0002 \u0002(\u000b2\u000e.PbOneLineText\u0012$\n\bsport_id\u0018\u0003 \u0001(\u000b2\u0012.PbSportIdentifier\u0012$\n\nstart_time\u0018\u0004 \u0001(\u000b2\u0010.PbLocalDateTime\u0012%\n\u000bdescription\u0018\u0005 \u0001(\u000b2\u0010.PbMultiLineText\u0012/\n\u000fexercise_target\u0018\u0006 \u0003(\u000b2\u0016.data.PbExerciseTarget\u0012\u0013\n\u000btarget_done\u0018\u0007 \u0001(\b\u0012\u001d\n\bduration\u0018\b \u0001(\u000b2\u000b.PbDuration\u00121\n\u0013training_program_id\u0018\t \u0001(\u000b2\u0014.PbTrain", "ingProgramId\u0012\u001c\n\bevent_id\u0018\n \u0001(\u000b2\n.PbEventIdB@\n'fi.polar.remote.representation.protobufB\u0015TrainingSessionTarget"}, new FileDescriptor[]{var1, var2, var3, var4}, var0);
      internal_static_data_PbSteadyRacePace_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbSteadyRacePace_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbSteadyRacePace_descriptor, new String[]{"Duration", "Distance"});
      internal_static_data_PbExerciseTarget_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_data_PbExerciseTarget_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbExerciseTarget_descriptor, new String[]{"TargetType", "SportId", "VolumeTarget", "Phases", "Route", "SteadyRacePace", "StravaSegmentTarget"});
      internal_static_data_PbTrainingSessionTarget_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_data_PbTrainingSessionTarget_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbTrainingSessionTarget_descriptor, new String[]{"Name", "SportId", "StartTime", "Description", "ExerciseTarget", "TargetDone", "Duration", "TrainingProgramId", "EventId"});
      ExtensionRegistry var5 = ExtensionRegistry.newInstance();
      var5.add(Types.type);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var5);
      Types.getDescriptor();
      Structures.getDescriptor();
      Nanopb.getDescriptor();
      ExercisePhase.getDescriptor();
   }

   private TrainingSessionTarget() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbSteadyRacePace_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbSteadyRacePace_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_data_PbExerciseTarget_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_data_PbExerciseTarget_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor e() {
      return internal_static_data_PbTrainingSessionTarget_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable f() {
      return internal_static_data_PbTrainingSessionTarget_fieldAccessorTable;
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
