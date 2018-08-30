package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class ExerciseLap {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbAutoLaps_descriptor;
   private static final FieldAccessorTable internal_static_data_PbAutoLaps_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbLapCadenceStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbLapCadenceStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbLapHeader_descriptor;
   private static final FieldAccessorTable internal_static_data_PbLapHeader_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbLapHeartRateStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbLapHeartRateStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbLapInclineStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbLapInclineStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbLapLRBalanceStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbLapLRBalanceStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbLapPedalingEfficiencyStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbLapPedalingEfficiencyStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbLapPedalingIndexStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbLapPedalingIndexStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbLapPowerStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbLapPowerStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbLapSpeedStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbLapSpeedStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbLapStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbLapStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbLapStrideLengthStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbLapStrideLengthStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbLapSummary_descriptor;
   private static final FieldAccessorTable internal_static_data_PbLapSummary_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbLapSwimmingStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbLapSwimmingStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbLapTrainingPeaksStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbLapTrainingPeaksStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbLap_descriptor;
   private static final FieldAccessorTable internal_static_data_PbLap_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbLaps_descriptor;
   private static final FieldAccessorTable internal_static_data_PbLaps_fieldAccessorTable;

   static {
      ExerciseLap$1 var0 = new ExerciseLap$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0013exercise_laps.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\"«\u0002\n\u000bPbLapHeader\u0012\u001f\n\nsplit_time\u0018\u0001 \u0002(\u000b2\u000b.PbDuration\u0012\u001d\n\bduration\u0018\u0002 \u0002(\u000b2\u000b.PbDuration\u0012\u0016\n\bdistance\u0018\u0003 \u0001(\u0002B\u0004\u0080µ\u00184\u0012\u0014\n\u0006ascent\u0018\u0004 \u0001(\u0002B\u0004\u0080µ\u00187\u0012\u0015\n\u0007descent\u0018\u0005 \u0001(\u0002B\u0004\u0080µ\u00188\u00125\n\fautolap_type\u0018\u0006 \u0001(\u000e2\u001f.data.PbLapHeader.PbAutolapType\"`\n\rPbAutolapType\u0012\u0019\n\u0015AUTOLAP_TYPE_DISTANCE\u0010\u0001\u0012\u0019\n\u0015AUTOLAP_TYPE_DURATION\u0010\u0002\u0012\u0019\n\u0015AUTOLAP_TYPE_LOCATION\u0010\u0003\"`\n\u0017PbLapSwimmingStatistics\u0012\u0013\n\u000blap_strok", "es\u0018\u0001 \u0001(\r\u0012\u0012\n\npool_count\u0018\u0002 \u0001(\r\u0012\u001c\n\u0014avg_duration_of_pool\u0018\u0003 \u0001(\u0002\"_\n\u0018PbLapHeartRateStatistics\u0012\u0015\n\u0007average\u0018\u0001 \u0001(\rB\u0004\u0080µ\u0018\u0014\u0012\u0015\n\u0007maximum\u0018\u0002 \u0001(\rB\u0004\u0080µ\u0018\u0014\u0012\u0015\n\u0007minimum\u0018\u0003 \u0001(\rB\u0004\u0080µ\u0018\u0014\"D\n\u0014PbLapSpeedStatistics\u0012\u0015\n\u0007average\u0018\u0001 \u0001(\u0002B\u0004\u0080µ\u0018\u0017\u0012\u0015\n\u0007maximum\u0018\u0002 \u0001(\u0002B\u0004\u0080µ\u0018\u0017\"F\n\u0016PbLapCadenceStatistics\u0012\u0015\n\u0007average\u0018\u0001 \u0001(\rB\u0004\u0080µ\u0018\u0018\u0012\u0015\n\u0007maximum\u0018\u0002 \u0001(\rB\u0004\u0080µ\u0018\u0018\"D\n\u0014PbLapPowerStatistics\u0012\u0015\n\u0007average\u0018\u0001 \u0001(\u0005B\u0004\u0080µ\u0018\u001a\u0012\u0015\n\u0007maximum\u0018\u0002 \u0001(\u0005B\u0004\u0080µ\u0018\u001a\"1\n\u0018PbLapLRBalanceStatistics\u0012\u0015\n\u0007a", "verage\u0018\u0001 \u0001(\u0002B\u0004\u0080µ\u0018\u001b\"5\n\u001cPbLapPedalingIndexStatistics\u0012\u0015\n\u0007average\u0018\u0001 \u0001(\rB\u0004\u0080µ\u0018\u001c\":\n!PbLapPedalingEfficiencyStatistics\u0012\u0015\n\u0007average\u0018\u0001 \u0001(\rB\u0004\u0080µ\u0018<\"w\n\u001cPbLapTrainingPeaksStatistics\u0012\u001e\n\u0010normalized_power\u0018\u0001 \u0001(\rB\u0004\u0080µ\u0018\u001a\u0012\u0018\n\u0010intensity_factor\u0018\u0002 \u0001(\u0002\u0012\u001d\n\u0015training_stress_score\u0018\u0003 \u0001(\u0002\"+\n\u0016PbLapInclineStatistics\u0012\u0011\n\u0003max\u0018\u0001 \u0001(\u0002B\u0004\u0080µ\u0018 \"4\n\u001bPbLapStrideLengthStatistics\u0012\u0015\n\u0007average\u0018\u0001 \u0001(\rB\u0004\u0080µ\u0018\u001f\"¬\u0004\n\u000fPbLapStatistics\u00122\n\nheart_rate\u0018\u0001 \u0001(\u000b2\u001e.data", ".PbLapHeartRateStatistics\u0012)\n\u0005speed\u0018\u0002 \u0001(\u000b2\u001a.data.PbLapSpeedStatistics\u0012-\n\u0007cadence\u0018\u0003 \u0001(\u000b2\u001c.data.PbLapCadenceStatistics\u0012)\n\u0005power\u0018\u0004 \u0001(\u000b2\u001a.data.PbLapPowerStatistics\u0012C\n\u0017OBSOLETE_pedaling_index\u0018\u0005 \u0001(\u000b2\".data.PbLapPedalingIndexStatistics\u0012-\n\u0007incline\u0018\u0006 \u0001(\u000b2\u001c.data.PbLapInclineStatistics\u00128\n\rstride_length\u0018\u0007 \u0001(\u000b2!.data.PbLapStrideLengthStatistics\u0012:\n\u0013swimming_statistics\u0018\b \u0001(\u000b2\u001d.data.PbLapSwimmingStatistics\u0012:\n\u0012left", "_right_balance\u0018\t \u0001(\u000b2\u001e.data.PbLapLRBalanceStatistics\u0012:\n\u000etraining_peaks\u0018\n \u0001(\u000b2\".data.PbLapTrainingPeaksStatistics\"U\n\u0005PbLap\u0012!\n\u0006header\u0018\u0001 \u0002(\u000b2\u0011.data.PbLapHeader\u0012)\n\nstatistics\u0018\u0002 \u0001(\u000b2\u0015.data.PbLapStatistics\"a\n\fPbLapSummary\u0012&\n\u0011best_lap_duration\u0018\u0001 \u0001(\u000b2\u000b.PbDuration\u0012)\n\u0014average_lap_duration\u0018\u0002 \u0001(\u000b2\u000b.PbDuration\"H\n\u0006PbLaps\u0012\u0019\n\u0004laps\u0018\u0001 \u0003(\u000b2\u000b.data.PbLap\u0012#\n\u0007summary\u0018\u0002 \u0001(\u000b2\u0012.data.PbLapSummary\"P\n\nPbAutoLaps\u0012\u001d\n\bautoLaps\u0018\u0001", " \u0003(\u000b2\u000b.data.PbLap\u0012#\n\u0007summary\u0018\u0002 \u0001(\u000b2\u0012.data.PbLapSummaryB6\n'fi.polar.remote.representation.protobufB\u000bExerciseLap"}, new FileDescriptor[]{var1, var2}, var0);
      internal_static_data_PbLapHeader_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbLapHeader_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbLapHeader_descriptor, new String[]{"SplitTime", "Duration", "Distance", "Ascent", "Descent", "AutolapType"});
      internal_static_data_PbLapSwimmingStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_data_PbLapSwimmingStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbLapSwimmingStatistics_descriptor, new String[]{"LapStrokes", "PoolCount", "AvgDurationOfPool"});
      internal_static_data_PbLapHeartRateStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_data_PbLapHeartRateStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbLapHeartRateStatistics_descriptor, new String[]{"Average", "Maximum", "Minimum"});
      internal_static_data_PbLapSpeedStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_data_PbLapSpeedStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbLapSpeedStatistics_descriptor, new String[]{"Average", "Maximum"});
      internal_static_data_PbLapCadenceStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_data_PbLapCadenceStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbLapCadenceStatistics_descriptor, new String[]{"Average", "Maximum"});
      internal_static_data_PbLapPowerStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_data_PbLapPowerStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbLapPowerStatistics_descriptor, new String[]{"Average", "Maximum"});
      internal_static_data_PbLapLRBalanceStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_data_PbLapLRBalanceStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbLapLRBalanceStatistics_descriptor, new String[]{"Average"});
      internal_static_data_PbLapPedalingIndexStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_data_PbLapPedalingIndexStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbLapPedalingIndexStatistics_descriptor, new String[]{"Average"});
      internal_static_data_PbLapPedalingEfficiencyStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_data_PbLapPedalingEfficiencyStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbLapPedalingEfficiencyStatistics_descriptor, new String[]{"Average"});
      internal_static_data_PbLapTrainingPeaksStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_data_PbLapTrainingPeaksStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbLapTrainingPeaksStatistics_descriptor, new String[]{"NormalizedPower", "IntensityFactor", "TrainingStressScore"});
      internal_static_data_PbLapInclineStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_data_PbLapInclineStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbLapInclineStatistics_descriptor, new String[]{"Max"});
      internal_static_data_PbLapStrideLengthStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_data_PbLapStrideLengthStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbLapStrideLengthStatistics_descriptor, new String[]{"Average"});
      internal_static_data_PbLapStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_data_PbLapStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbLapStatistics_descriptor, new String[]{"HeartRate", "Speed", "Cadence", "Power", "OBSOLETEPedalingIndex", "Incline", "StrideLength", "SwimmingStatistics", "LeftRightBalance", "TrainingPeaks"});
      internal_static_data_PbLap_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_data_PbLap_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbLap_descriptor, new String[]{"Header", "Statistics"});
      internal_static_data_PbLapSummary_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_data_PbLapSummary_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbLapSummary_descriptor, new String[]{"BestLapDuration", "AverageLapDuration"});
      internal_static_data_PbLaps_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_data_PbLaps_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbLaps_descriptor, new String[]{"Laps", "Summary"});
      internal_static_data_PbAutoLaps_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_data_PbAutoLaps_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbAutoLaps_descriptor, new String[]{"AutoLaps", "Summary"});
      ExtensionRegistry var3 = ExtensionRegistry.newInstance();
      var3.add(Types.type);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var3);
      Types.getDescriptor();
      Structures.getDescriptor();
   }

   private ExerciseLap() {
   }

   // $FF: synthetic method
   static Descriptor A() {
      return internal_static_data_PbLap_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable B() {
      return internal_static_data_PbLap_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor C() {
      return internal_static_data_PbLapSummary_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable D() {
      return internal_static_data_PbLapSummary_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor E() {
      return internal_static_data_PbLaps_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable F() {
      return internal_static_data_PbLaps_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor G() {
      return internal_static_data_PbAutoLaps_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable H() {
      return internal_static_data_PbAutoLaps_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbLapHeader_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbLapHeader_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_data_PbLapSwimmingStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_data_PbLapSwimmingStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor e() {
      return internal_static_data_PbLapHeartRateStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable f() {
      return internal_static_data_PbLapHeartRateStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor g() {
      return internal_static_data_PbLapSpeedStatistics_descriptor;
   }

   public static FileDescriptor getDescriptor() {
      return descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable h() {
      return internal_static_data_PbLapSpeedStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor i() {
      return internal_static_data_PbLapCadenceStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable j() {
      return internal_static_data_PbLapCadenceStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor k() {
      return internal_static_data_PbLapPowerStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable l() {
      return internal_static_data_PbLapPowerStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor m() {
      return internal_static_data_PbLapLRBalanceStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable n() {
      return internal_static_data_PbLapLRBalanceStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor o() {
      return internal_static_data_PbLapPedalingIndexStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable p() {
      return internal_static_data_PbLapPedalingIndexStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor q() {
      return internal_static_data_PbLapPedalingEfficiencyStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable r() {
      return internal_static_data_PbLapPedalingEfficiencyStatistics_fieldAccessorTable;
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }

   // $FF: synthetic method
   static Descriptor s() {
      return internal_static_data_PbLapTrainingPeaksStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable t() {
      return internal_static_data_PbLapTrainingPeaksStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor u() {
      return internal_static_data_PbLapInclineStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable v() {
      return internal_static_data_PbLapInclineStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor w() {
      return internal_static_data_PbLapStrideLengthStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable x() {
      return internal_static_data_PbLapStrideLengthStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor y() {
      return internal_static_data_PbLapStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable z() {
      return internal_static_data_PbLapStatistics_fieldAccessorTable;
   }
}
