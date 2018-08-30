package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class ExerciseStatistics {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbActivityStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbActivityStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbAltitudeStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbAltitudeStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbCadenceStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbCadenceStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbCyclingEfficiencyStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbCyclingEfficiencyStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbDeclineStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbDeclineStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbExerciseStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbExerciseStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbHeartRateStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbHeartRateStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbInclineStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbInclineStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbLRBalanceStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbLRBalanceStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbPedalingEfficiencyStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbPedalingEfficiencyStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbPowerStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbPowerStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbSpeedStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbSpeedStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbStrideLengthStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbStrideLengthStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbSwimmingStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbSwimmingStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbSwimmingStyleStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbSwimmingStyleStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbTemperatureStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbTemperatureStatistics_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbTrainingPeaksStatistics_descriptor;
   private static final FieldAccessorTable internal_static_data_PbTrainingPeaksStatistics_fieldAccessorTable;

   static {
      ExerciseStatistics$1 var0 = new ExerciseStatistics$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0014exercise_stats.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\"ð\u0001\n\u0019PbSwimmingStyleStatistics\u0012\u0016\n\bdistance\u0018\u0001 \u0002(\u0002B\u0004\u0080µ\u00184\u0012\u0014\n\fstroke_count\u0018\u0002 \u0002(\r\u0012(\n\u0013swimming_time_total\u0018\u0003 \u0001(\u000b2\u000b.PbDuration\u0012\u001f\n\u0011average_heartrate\u0018\u0004 \u0001(\rB\u0004\u0080µ\u0018\u0014\u0012\u001f\n\u0011maximum_heartrate\u0018\u0005 \u0001(\rB\u0004\u0080µ\u0018\u0014\u0012\u0015\n\raverage_swolf\u0018\u0006 \u0001(\u0002\u0012\"\n\rpool_time_min\u0018\u0007 \u0001(\u000b2\u000b.PbDuration\"\u009a\u0003\n\u0014PbSwimmingStatistics\u0012\u0019\n\u0011swimming_distance\u0018\u0001 \u0002(\u0002\u0012=\n\u0014freestyle_statistics\u0018\u0002 \u0001(\u000b2\u001f.data.PbSwimmi", "ngStyleStatistics\u0012>\n\u0015backstroke_statistics\u0018\u0003 \u0001(\u000b2\u001f.data.PbSwimmingStyleStatistics\u0012@\n\u0017breaststroke_statistics\u0018\u0004 \u0001(\u000b2\u001f.data.PbSwimmingStyleStatistics\u0012=\n\u0014butterfly_statistics\u0018\u0005 \u0001(\u000b2\u001f.data.PbSwimmingStyleStatistics\u0012\u001a\n\u0012total_stroke_count\u0018\u0006 \u0001(\r\u0012\u001f\n\u0017number_of_pools_swimmed\u0018\u0007 \u0001(\r\u0012*\n\rswimming_pool\u0018\b \u0001(\u000b2\u0013.PbSwimmingPoolInfo\"\\\n\u0015PbHeartRateStatistics\u0012\u0015\n\u0007minimum\u0018\u0001 \u0001(\rB\u0004\u0080µ\u0018\u0014\u0012\u0015\n\u0007average\u0018\u0002 \u0001(\rB\u0004\u0080µ\u0018\u0014\u0012\u0015\n\u0007maximum\u0018\u0003 ", "\u0001(\rB\u0004\u0080µ\u0018\u0014\"A\n\u0011PbSpeedStatistics\u0012\u0015\n\u0007average\u0018\u0001 \u0001(\u0002B\u0004\u0080µ\u0018\u0017\u0012\u0015\n\u0007maximum\u0018\u0002 \u0001(\u0002B\u0004\u0080µ\u0018\u0017\"C\n\u0013PbCadenceStatistics\u0012\u0015\n\u0007average\u0018\u0001 \u0001(\rB\u0004\u0080µ\u0018\u0018\u0012\u0015\n\u0007maximum\u0018\u0002 \u0001(\rB\u0004\u0080µ\u0018\u0018\"[\n\u0014PbAltitudeStatistics\u0012\u0015\n\u0007minimum\u0018\u0001 \u0001(\u0002B\u0004\u0080µ\u0018\u0019\u0012\u0015\n\u0007average\u0018\u0002 \u0001(\u0002B\u0004\u0080µ\u0018\u0019\u0012\u0015\n\u0007maximum\u0018\u0003 \u0001(\u0002B\u0004\u0080µ\u0018\u0019\"A\n\u0011PbPowerStatistics\u0012\u0015\n\u0007average\u0018\u0001 \u0001(\u0005B\u0004\u0080µ\u0018\u001a\u0012\u0015\n\u0007maximum\u0018\u0002 \u0001(\u0005B\u0004\u0080µ\u0018\u001a\"6\n\u001dPbCyclingEfficiencyStatistics\u0012\u0015\n\u0007average\u0018\u0001 \u0001(\rB\u0004\u0080µ\u0018<\"7\n\u001ePbPedalingEfficiencyStatistics\u0012\u0015\n\u0007a", "verage\u0018\u0001 \u0001(\rB\u0004\u0080µ\u0018<\".\n\u0015PbLRBalanceStatistics\u0012\u0015\n\u0007average\u0018\u0001 \u0001(\u0002B\u0004\u0080µ\u0018\u001b\"t\n\u0019PbTrainingPeaksStatistics\u0012\u001e\n\u0010normalized_power\u0018\u0001 \u0001(\rB\u0004\u0080µ\u0018\u001a\u0012\u0018\n\u0010intensity_factor\u0018\u0002 \u0001(\u0002\u0012\u001d\n\u0015training_stress_score\u0018\u0003 \u0001(\u0002\"^\n\u0017PbTemperatureStatistics\u0012\u0015\n\u0007minimum\u0018\u0001 \u0001(\u0002B\u0004\u0080µ\u0018\u001d\u0012\u0015\n\u0007average\u0018\u0002 \u0001(\u0002B\u0004\u0080µ\u0018\u001d\u0012\u0015\n\u0007maximum\u0018\u0003 \u0001(\u0002B\u0004\u0080µ\u0018\u001d\"H\n\u0018PbStrideLengthStatistics\u0012\u0015\n\u0007average\u0018\u0001 \u0001(\rB\u0004\u0080µ\u0018\u001f\u0012\u0015\n\u0007maximum\u0018\u0002 \u0001(\rB\u0004\u0080µ\u0018\u001f\"C\n\u0013PbInclineStatistics\u0012\u0015\n\u0007average\u0018\u0001 \u0001(\u0002B\u0004\u0080µ\u0018 ", "\u0012\u0015\n\u0007maximum\u0018\u0002 \u0001(\u0002B\u0004\u0080µ\u0018 \"C\n\u0013PbDeclineStatistics\u0012\u0015\n\u0007average\u0018\u0001 \u0001(\u0002B\u0004\u0080µ\u0018!\u0012\u0015\n\u0007maximum\u0018\u0002 \u0001(\u0002B\u0004\u0080µ\u0018!\"-\n\u0014PbActivityStatistics\u0012\u0015\n\u0007average\u0018\u0001 \u0001(\u0002B\u0004\u0080µ\u0018\u001e\"\u0082\u0005\n\u0014PbExerciseStatistics\u0012/\n\nheart_rate\u0018\u0001 \u0001(\u000b2\u001b.data.PbHeartRateStatistics\u0012&\n\u0005speed\u0018\u0002 \u0001(\u000b2\u0017.data.PbSpeedStatistics\u0012*\n\u0007cadence\u0018\u0003 \u0001(\u000b2\u0019.data.PbCadenceStatistics\u0012,\n\baltitude\u0018\u0004 \u0001(\u000b2\u001a.data.PbAltitudeStatistics\u0012&\n\u0005power\u0018\u0005 \u0001(\u000b2\u0017.data.PbPowerStatistics\u00127\n\u0012left_right_ba", "lance\u0018\u0006 \u0001(\u000b2\u001b.data.PbLRBalanceStatistics\u00122\n\u000btemperature\u0018\u0007 \u0001(\u000b2\u001d.data.PbTemperatureStatistics\u0012,\n\bactivity\u0018\b \u0001(\u000b2\u001a.data.PbActivityStatistics\u00125\n\rstride_length\u0018\t \u0001(\u000b2\u001e.data.PbStrideLengthStatistics\u0012*\n\u0007incline\u0018\n \u0001(\u000b2\u0019.data.PbInclineStatistics\u0012*\n\u0007decline\u0018\u000b \u0001(\u000b2\u0019.data.PbDeclineStatistics\u0012,\n\bswimming\u0018\f \u0001(\u000b2\u001a.data.PbSwimmingStatistics\u00127\n\u000etraining_peaks\u0018\r \u0001(\u000b2\u001f.data.PbTrainingPeaksStatisticsB=\n'fi.polar.rem", "ote.representation.protobufB\u0012ExerciseStatistics"}, new FileDescriptor[]{var1, var2}, var0);
      internal_static_data_PbSwimmingStyleStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbSwimmingStyleStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbSwimmingStyleStatistics_descriptor, new String[]{"Distance", "StrokeCount", "SwimmingTimeTotal", "AverageHeartrate", "MaximumHeartrate", "AverageSwolf", "PoolTimeMin"});
      internal_static_data_PbSwimmingStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_data_PbSwimmingStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbSwimmingStatistics_descriptor, new String[]{"SwimmingDistance", "FreestyleStatistics", "BackstrokeStatistics", "BreaststrokeStatistics", "ButterflyStatistics", "TotalStrokeCount", "NumberOfPoolsSwimmed", "SwimmingPool"});
      internal_static_data_PbHeartRateStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_data_PbHeartRateStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbHeartRateStatistics_descriptor, new String[]{"Minimum", "Average", "Maximum"});
      internal_static_data_PbSpeedStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_data_PbSpeedStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbSpeedStatistics_descriptor, new String[]{"Average", "Maximum"});
      internal_static_data_PbCadenceStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_data_PbCadenceStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbCadenceStatistics_descriptor, new String[]{"Average", "Maximum"});
      internal_static_data_PbAltitudeStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_data_PbAltitudeStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbAltitudeStatistics_descriptor, new String[]{"Minimum", "Average", "Maximum"});
      internal_static_data_PbPowerStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_data_PbPowerStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbPowerStatistics_descriptor, new String[]{"Average", "Maximum"});
      internal_static_data_PbCyclingEfficiencyStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_data_PbCyclingEfficiencyStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbCyclingEfficiencyStatistics_descriptor, new String[]{"Average"});
      internal_static_data_PbPedalingEfficiencyStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_data_PbPedalingEfficiencyStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbPedalingEfficiencyStatistics_descriptor, new String[]{"Average"});
      internal_static_data_PbLRBalanceStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_data_PbLRBalanceStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbLRBalanceStatistics_descriptor, new String[]{"Average"});
      internal_static_data_PbTrainingPeaksStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_data_PbTrainingPeaksStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbTrainingPeaksStatistics_descriptor, new String[]{"NormalizedPower", "IntensityFactor", "TrainingStressScore"});
      internal_static_data_PbTemperatureStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_data_PbTemperatureStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbTemperatureStatistics_descriptor, new String[]{"Minimum", "Average", "Maximum"});
      internal_static_data_PbStrideLengthStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_data_PbStrideLengthStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbStrideLengthStatistics_descriptor, new String[]{"Average", "Maximum"});
      internal_static_data_PbInclineStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_data_PbInclineStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbInclineStatistics_descriptor, new String[]{"Average", "Maximum"});
      internal_static_data_PbDeclineStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_data_PbDeclineStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbDeclineStatistics_descriptor, new String[]{"Average", "Maximum"});
      internal_static_data_PbActivityStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_data_PbActivityStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbActivityStatistics_descriptor, new String[]{"Average"});
      internal_static_data_PbExerciseStatistics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_data_PbExerciseStatistics_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbExerciseStatistics_descriptor, new String[]{"HeartRate", "Speed", "Cadence", "Altitude", "Power", "LeftRightBalance", "Temperature", "Activity", "StrideLength", "Incline", "Decline", "Swimming", "TrainingPeaks"});
      ExtensionRegistry var3 = ExtensionRegistry.newInstance();
      var3.add(Types.type);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var3);
      Types.getDescriptor();
      Structures.getDescriptor();
   }

   private ExerciseStatistics() {
   }

   // $FF: synthetic method
   static Descriptor A() {
      return internal_static_data_PbInclineStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable B() {
      return internal_static_data_PbInclineStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor C() {
      return internal_static_data_PbDeclineStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable D() {
      return internal_static_data_PbDeclineStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor E() {
      return internal_static_data_PbActivityStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable F() {
      return internal_static_data_PbActivityStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor G() {
      return internal_static_data_PbExerciseStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable H() {
      return internal_static_data_PbExerciseStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbSwimmingStyleStatistics_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbSwimmingStyleStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_data_PbSwimmingStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_data_PbSwimmingStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor e() {
      return internal_static_data_PbHeartRateStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable f() {
      return internal_static_data_PbHeartRateStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor g() {
      return internal_static_data_PbSpeedStatistics_descriptor;
   }

   public static FileDescriptor getDescriptor() {
      return descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable h() {
      return internal_static_data_PbSpeedStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor i() {
      return internal_static_data_PbCadenceStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable j() {
      return internal_static_data_PbCadenceStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor k() {
      return internal_static_data_PbAltitudeStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable l() {
      return internal_static_data_PbAltitudeStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor m() {
      return internal_static_data_PbPowerStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable n() {
      return internal_static_data_PbPowerStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor o() {
      return internal_static_data_PbCyclingEfficiencyStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable p() {
      return internal_static_data_PbCyclingEfficiencyStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor q() {
      return internal_static_data_PbPedalingEfficiencyStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable r() {
      return internal_static_data_PbPedalingEfficiencyStatistics_fieldAccessorTable;
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }

   // $FF: synthetic method
   static Descriptor s() {
      return internal_static_data_PbLRBalanceStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable t() {
      return internal_static_data_PbLRBalanceStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor u() {
      return internal_static_data_PbTrainingPeaksStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable v() {
      return internal_static_data_PbTrainingPeaksStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor w() {
      return internal_static_data_PbTemperatureStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable x() {
      return internal_static_data_PbTemperatureStatistics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor y() {
      return internal_static_data_PbStrideLengthStatistics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable z() {
      return internal_static_data_PbStrideLengthStatistics_fieldAccessorTable;
   }
}
