package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class ExerciseTargetInfo {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbExerciseTargetInfo_descriptor;
   private static final FieldAccessorTable internal_static_data_PbExerciseTargetInfo_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbSteadyRacePaceResult_descriptor;
   private static final FieldAccessorTable internal_static_data_PbSteadyRacePaceResult_fieldAccessorTable;

   static {
      ExerciseTargetInfo$1 var0 = new ExerciseTargetInfo$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor var3 = Nanopb.getDescriptor();
      FileDescriptor var4 = ExercisePhase.getDescriptor();
      FileDescriptor var5 = TrainingSessionTarget.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0019exercise_targetinfo.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\u001a\fnanopb.proto\u001a\u0015exercise_phases.proto\u001a\u001dtraining_session_target.proto\"{\n\u0016PbSteadyRacePaceResult\u0012#\n\u000ecompleted_time\u0018\u0001 \u0002(\u000b2\u000b.PbDuration\u0012\u001f\n\u0011average_heartrate\u0018\u0002 \u0001(\rB\u0004\u0080µ\u0018\u0014\u0012\u001b\n\raverage_speed\u0018\u0003 \u0001(\u0002B\u0004\u0080µ\u0018\u0017\"Ý\u0003\n\u0014PbExerciseTargetInfo\u0012*\n\u000btarget_type\u0018\u0001 \u0002(\u000e2\u0015.PbExerciseTargetType\u0012\u0013\n\u0005index\u0018\u0002 \u0002(\rB\u0004\u0080µ\u0018A\u0012\u001c\n\u0004name\u0018\u0003 \u0001(\u000b2\u000e.PbOneLineText\u0012\u0016\n\u000etarget_reached\u0018\u0004 \u0001(", "\b\u0012\u001d\n\bend_time\u0018\u0005 \u0001(\u000b2\u000b.PbDuration\u0012$\n\bsport_id\u0018\u0006 \u0001(\u000b2\u0012.PbSportIdentifier\u0012&\n\rvolume_target\u0018\u0007 \u0001(\u000b2\u000f.PbVolumeTarget\u0012\u001e\n\u0006phases\u0018\b \u0001(\u000b2\u000e.data.PbPhases\u0012\u0019\n\u0005route\u0018\t \u0001(\u000b2\n.PbRouteId\u00120\n\u0010steady_race_pace\u0018\n \u0001(\u000b2\u0016.data.PbSteadyRacePace\u0012=\n\u0017steady_race_pace_result\u0018\u000b \u0001(\u000b2\u001c.data.PbSteadyRacePaceResult\u00125\n\u0015strava_segment_target\u0018\f \u0001(\u000b2\u0016.PbStravaSegmentTargetB=\n'fi.polar.remote.representation.protobufB\u0012ExerciseTargetInfo"}, new FileDescriptor[]{var1, var2, var3, var4, var5}, var0);
      internal_static_data_PbSteadyRacePaceResult_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbSteadyRacePaceResult_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbSteadyRacePaceResult_descriptor, new String[]{"CompletedTime", "AverageHeartrate", "AverageSpeed"});
      internal_static_data_PbExerciseTargetInfo_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_data_PbExerciseTargetInfo_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbExerciseTargetInfo_descriptor, new String[]{"TargetType", "Index", "Name", "TargetReached", "EndTime", "SportId", "VolumeTarget", "Phases", "Route", "SteadyRacePace", "SteadyRacePaceResult", "StravaSegmentTarget"});
      ExtensionRegistry var6 = ExtensionRegistry.newInstance();
      var6.add(Types.type);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var6);
      Types.getDescriptor();
      Structures.getDescriptor();
      Nanopb.getDescriptor();
      ExercisePhase.getDescriptor();
      TrainingSessionTarget.getDescriptor();
   }

   private ExerciseTargetInfo() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbSteadyRacePaceResult_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbSteadyRacePaceResult_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_data_PbExerciseTargetInfo_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_data_PbExerciseTargetInfo_fieldAccessorTable;
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
