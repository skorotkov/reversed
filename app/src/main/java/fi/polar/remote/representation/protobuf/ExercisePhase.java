package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class ExercisePhase {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbPhaseGoal_descriptor;
   private static final FieldAccessorTable internal_static_data_PbPhaseGoal_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbPhaseIntensity_IntensityZone_descriptor;
   private static final FieldAccessorTable internal_static_data_PbPhaseIntensity_IntensityZone_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbPhaseIntensity_descriptor;
   private static final FieldAccessorTable internal_static_data_PbPhaseIntensity_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbPhase_descriptor;
   private static final FieldAccessorTable internal_static_data_PbPhase_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbPhases_descriptor;
   private static final FieldAccessorTable internal_static_data_PbPhases_fieldAccessorTable;

   static {
      ExercisePhase$1 var0 = new ExercisePhase$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor var3 = ExerciseStatistics.getDescriptor();
      FileDescriptor var4 = Nanopb.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0015exercise_phases.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\u001a\u0014exercise_stats.proto\u001a\fnanopb.proto\"¼\u0002\n\u000bPbPhaseGoal\u00122\n\tgoal_type\u0018\u0001 \u0002(\u000e2\u001f.data.PbPhaseGoal.PhaseGoalType\u0012\u001d\n\bduration\u0018\u0002 \u0001(\u000b2\u000b.PbDuration\u0012\u0016\n\bdistance\u0018\u0003 \u0001(\u0002B\u0004\u0080µ\u00184\u0012\u0018\n\nheart_rate\u0018\u0004 \u0001(\rB\u0004\u0080µ\u0018\u0014\"§\u0001\n\rPhaseGoalType\u0012\u0012\n\u000ePHASE_GOAL_OFF\u0010\u0000\u0012\u0013\n\u000fPHASE_GOAL_TIME\u0010\u0001\u0012\u0017\n\u0013PHASE_GOAL_DISTANCE\u0010\u0002\u0012\u001c\n\u0018PHASE_GOAL_INCREASING_HR\u0010\u0003\u0012\u001c\n\u0018PHASE_GOAL_DECREASING_HR\u0010\u0004\u0012\u0018\n\u0014PHASE_G", "OAL_RACE_PACE\u0010\u0005\"Ó\u0003\n\u0010PbPhaseIntensity\u0012A\n\u000eintensity_type\u0018\u0001 \u0002(\u000e2).data.PbPhaseIntensity.PhaseIntensityType\u0012=\n\u000fheart_rate_zone\u0018\u0002 \u0001(\u000b2$.data.PbPhaseIntensity.IntensityZone\u00128\n\nspeed_zone\u0018\u0003 \u0001(\u000b2$.data.PbPhaseIntensity.IntensityZone\u00128\n\npower_zone\u0018\u0004 \u0001(\u000b2$.data.PbPhaseIntensity.IntensityZone\u001a9\n\rIntensityZone\u0012\u0013\n\u0005lower\u0018\u0001 \u0002(\rB\u0004\u0080µ\u0018\u0001\u0012\u0013\n\u0005upper\u0018\u0002 \u0002(\rB\u0004\u0080µ\u0018\u0001\"\u008d\u0001\n\u0012PhaseIntensityType\u0012\u0018\n\u0014PHASE_INTENSITY_FREE\u0010\u0000\u0012\u001d\n\u0019PHASE_", "INTENSITY_SPORTZONE\u0010\u0001\u0012\u001e\n\u001aPHASE_INTENSITY_SPEED_ZONE\u0010\u0002\u0012\u001e\n\u001aPHASE_INTENSITY_POWER_ZONE\u0010\u0003\"\u008c\u0002\n\u0007PbPhase\u0012\u001c\n\u0004name\u0018\u0001 \u0002(\u000b2\u000e.PbOneLineText\u0012/\n\u0006change\u0018\u0002 \u0002(\u000e2\u001f.data.PbPhase.PbPhaseChangeType\u0012\u001f\n\u0004goal\u0018\u0003 \u0002(\u000b2\u0011.data.PbPhaseGoal\u0012)\n\tintensity\u0018\u0004 \u0002(\u000b2\u0016.data.PbPhaseIntensity\u0012\u0014\n\frepeat_count\u0018\u0005 \u0001(\r\u0012\u0012\n\njump_index\u0018\u0006 \u0001(\r\"<\n\u0011PbPhaseChangeType\u0012\u0011\n\rCHANGE_MANUAL\u0010\u0000\u0012\u0014\n\u0010CHANGE_AUTOMATIC\u0010\u0001\"(\n\bPbPhases\u0012\u001c\n\u0005phase\u0018\u0001 \u0003(\u000b2\r.data.PbPhaseB8", "\n'fi.polar.remote.representation.protobufB\rExercisePhase"}, new FileDescriptor[]{var1, var2, var3, var4}, var0);
      internal_static_data_PbPhaseGoal_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbPhaseGoal_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbPhaseGoal_descriptor, new String[]{"GoalType", "Duration", "Distance", "HeartRate"});
      internal_static_data_PbPhaseIntensity_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_data_PbPhaseIntensity_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbPhaseIntensity_descriptor, new String[]{"IntensityType", "HeartRateZone", "SpeedZone", "PowerZone"});
      internal_static_data_PbPhaseIntensity_IntensityZone_descriptor = (Descriptor)internal_static_data_PbPhaseIntensity_descriptor.getNestedTypes().get(0);
      internal_static_data_PbPhaseIntensity_IntensityZone_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbPhaseIntensity_IntensityZone_descriptor, new String[]{"Lower", "Upper"});
      internal_static_data_PbPhase_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_data_PbPhase_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbPhase_descriptor, new String[]{"Name", "Change", "Goal", "Intensity", "RepeatCount", "JumpIndex"});
      internal_static_data_PbPhases_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_data_PbPhases_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbPhases_descriptor, new String[]{"Phase"});
      ExtensionRegistry var5 = ExtensionRegistry.newInstance();
      var5.add(Types.type);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var5);
      Types.getDescriptor();
      Structures.getDescriptor();
      ExerciseStatistics.getDescriptor();
      Nanopb.getDescriptor();
   }

   private ExercisePhase() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbPhaseGoal_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbPhaseGoal_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_data_PbPhaseIntensity_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_data_PbPhaseIntensity_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor e() {
      return internal_static_data_PbPhaseIntensity_IntensityZone_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable f() {
      return internal_static_data_PbPhaseIntensity_IntensityZone_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor g() {
      return internal_static_data_PbPhase_descriptor;
   }

   public static FileDescriptor getDescriptor() {
      return descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable h() {
      return internal_static_data_PbPhase_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor i() {
      return internal_static_data_PbPhases_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable j() {
      return internal_static_data_PbPhases_fieldAccessorTable;
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }
}
