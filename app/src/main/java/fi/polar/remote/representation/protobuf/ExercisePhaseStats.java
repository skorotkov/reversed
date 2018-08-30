package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class ExercisePhaseStats {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbPhaseHeartRateStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbPhaseHeartRateStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbPhaseRepetition_descriptor;
   private static final FieldAccessorTable internal_static_data_PbPhaseRepetition_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbPhaseRepetitions_descriptor;
   private static final FieldAccessorTable internal_static_data_PbPhaseRepetitions_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbPhaseStrideLengthStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbPhaseStrideLengthStatistics_fieldAccessorTable;

   static {
      ExercisePhaseStats$1 var0 = new ExercisePhaseStats$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = ExerciseStatistics.getDescriptor();
      FileDescriptor var3 = Nanopb.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001aexercise_phases_reps.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0014exercise_stats.proto\u001a\fnanopb.proto\"J\n\u001aPbPhaseHeartRateStatistics\u0012\u0015\n\u0007average\u0018\u0001 \u0001(\rB\u0004\u0080µ\u0018\u0014\u0012\u0015\n\u0007maximum\u0018\u0002 \u0001(\rB\u0004\u0080µ\u0018\u0014\"6\n\u001dPbPhaseStrideLengthStatistics\u0012\u0015\n\u0007average\u0018\u0001 \u0001(\rB\u0004\u0080µ\u0018\u001f\"ï\u0004\n\u0011PbPhaseRepetition\u0012\r\n\u0005index\u0018\u0001 \u0002(\r\u0012\u001f\n\nsplit_time\u0018\u0002 \u0002(\u000b2\u000b.PbDuration\u0012\u001d\n\bduration\u0018\u0003 \u0002(\u000b2\u000b.PbDuration\u0012\u0016\n\u000ephase_finished\u0018\u0004 \u0001(\b\u0012\u001c\n\u000esplit_distance\u0018\u0005 \u0001(\u0002B\u0004\u0080µ\u00184\u0012\u0016\n\bdistance\u0018\u0006 \u0001(\u0002B\u0004\u0080µ\u00184\u0012#\n\u000ein", "_target_zone\u0018\u0007 \u0001(\u000b2\u000b.PbDuration\u00124\n\nheart_rate\u0018\b \u0001(\u000b2 .data.PbPhaseHeartRateStatistics\u0012&\n\u0005speed\u0018\t \u0001(\u000b2\u0017.data.PbSpeedStatistics\u0012*\n\u0007cadence\u0018\n \u0001(\u000b2\u0019.data.PbCadenceStatistics\u0012&\n\u0005power\u0018\u000b \u0001(\u000b2\u0017.data.PbPowerStatistics\u00127\n\u0012left_right_balance\u0018\f \u0001(\u000b2\u001b.data.PbLRBalanceStatistics\u0012:\n\rstride_length\u0018\r \u0001(\u000b2#.data.PbPhaseStrideLengthStatistics\u0012\u0014\n\fstroke_count\u0018\u000e \u0001(\r\u0012\u0015\n\raverage_swolf\u0018\u000f \u0001(\u0002\u0012\u0017\n\u000fstrokes_per_min\u0018\u0010 \u0001(\r\u0012\u0014\n\u0006", "ascent\u0018\u0011 \u0001(\u0002B\u0004\u0080µ\u00187\u0012\u0015\n\u0007descent\u0018\u0012 \u0001(\u0002B\u0004\u0080µ\u00188\"<\n\u0012PbPhaseRepetitions\u0012&\n\u0005phase\u0018\u0001 \u0003(\u000b2\u0017.data.PbPhaseRepetitionB=\n'fi.polar.remote.representation.protobufB\u0012ExercisePhaseStats"}, new FileDescriptor[]{var1, var2, var3}, var0);
      internal_static_data_PbPhaseHeartRateStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbPhaseHeartRateStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbPhaseHeartRateStatistics_descriptor, new String[]{"Average", "Maximum"});
      internal_static_data_PbPhaseStrideLengthStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_data_PbPhaseStrideLengthStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbPhaseStrideLengthStatistics_descriptor, new String[]{"Average"});
      internal_static_data_PbPhaseRepetition_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_data_PbPhaseRepetition_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbPhaseRepetition_descriptor, new String[]{"Index", "SplitTime", "Duration", "PhaseFinished", "SplitDistance", "Distance", "InTargetZone", "HeartRate", "Speed", "Cadence", "Power", "LeftRightBalance", "StrideLength", "StrokeCount", "AverageSwolf", "StrokesPerMin", "Ascent", "Descent"});
      internal_static_data_PbPhaseRepetitions_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_data_PbPhaseRepetitions_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbPhaseRepetitions_descriptor, new String[]{"Phase"});
      ExtensionRegistry var4 = ExtensionRegistry.newInstance();
      var4.add(Types.type);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var4);
      Types.getDescriptor();
      ExerciseStatistics.getDescriptor();
      Nanopb.getDescriptor();
   }

   private ExercisePhaseStats() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbPhaseHeartRateStatistics_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbPhaseHeartRateStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_data_PbPhaseStrideLengthStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_data_PbPhaseStrideLengthStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor e() {
      return internal_static_data_PbPhaseRepetition_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable f() {
      return internal_static_data_PbPhaseRepetition_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor g() {
      return internal_static_data_PbPhaseRepetitions_descriptor;
   }

   public static FileDescriptor getDescriptor() {
      return descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable h() {
      return internal_static_data_PbPhaseRepetitions_fieldAccessorTable;
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }
}
