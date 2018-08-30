package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class ExerciseSamples {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbCalibrationValue_descriptor;
   private static final FieldAccessorTable internal_static_data_PbCalibrationValue_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbExerciseIntervalledSampleList_descriptor;
   private static final FieldAccessorTable internal_static_data_PbExerciseIntervalledSampleList_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbExerciseSamples_descriptor;
   private static final FieldAccessorTable internal_static_data_PbExerciseSamples_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbPowerMeasurements_descriptor;
   private static final FieldAccessorTable internal_static_data_PbPowerMeasurements_fieldAccessorTable;

   static {
      ExerciseSamples$1 var0 = new ExerciseSamples$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor var3 = ExerciseRRSamples.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0016exercise_samples.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\u001a\u0019exercise_rr_samples.proto\"¶\u0003\n\u0013PbPowerMeasurements\u0012\u001b\n\rcurrent_power\u0018\u0001 \u0002(\u0005B\u0004\u0080µ\u0018\u001a\u0012$\n\u001ccumulative_crank_revolutions\u0018\u0002 \u0001(\r\u0012\u001c\n\u0014cumulative_timestamp\u0018\u0003 \u0001(\r\u0012!\n\u0013force_magnitude_min\u0018\u0004 \u0001(\u0011B\u0004\u0080µ\u0018H\u0012!\n\u0013force_magnitude_max\u0018\u0005 \u0001(\u0005B\u0004\u0080µ\u0018H\u0012'\n\u0019force_magnitude_min_angle\u0018\u0006 \u0001(\rB\u0004\u0080µ\u0018G\u0012'\n\u0019force_magnitude_max_angle\u0018\u0007 \u0001(\rB\u0004\u0080µ\u0018G\u0012$\n\u0016bottom_dead_spot_angle\u0018\b \u0001(\rB\u0004\u0080µ\u0018G\u0012", "!\n\u0013top_dead_spot_angle\u0018\t \u0001(\rB\u0004\u0080µ\u0018G\u0012!\n\u0013pedal_power_balance\u0018\n \u0001(\rB\u0004\u0080µ\u0018\u001b\u0012\u001c\n\u0014torque_magnitude_min\u0018\u000b \u0001(\u0005\u0012\u001c\n\u0014torque_magnitude_max\u0018\f \u0001(\u0005\"{\n\u0012PbCalibrationValue\u0012\u0013\n\u000bstart_index\u0018\u0001 \u0002(\r\u0012\r\n\u0005value\u0018\u0002 \u0002(\u0002\u0012#\n\toperation\u0018\u0003 \u0002(\u000e2\u0010.PbOperationType\u0012\u001c\n\u0005cause\u0018\u0004 \u0001(\u000e2\r.PbMovingType\"\u0081\u0007\n\u001fPbExerciseIntervalledSampleList\u0012\"\n\u000bsample_type\u0018\u0001 \u0002(\u000e2\r.PbSampleType\u0012\u001d\n\u0015recording_interval_ms\u0018\u0002 \u0001(\r\u0012&\n\rsample_source\u0018\u0003 \u0003(\u000b2\u000f.PbSampleSource\u0012\"\n", "\u0012heart_rate_samples\u0018\u0004 \u0003(\rB\u0006\u0010\u0001\u0080µ\u0018\u0014\u0012\u001f\n\u000fcadence_samples\u0018\u0005 \u0003(\rB\u0006\u0010\u0001\u0080µ\u0018\u0018\u0012\u001d\n\rspeed_samples\u0018\u0006 \u0003(\u0002B\u0006\u0010\u0001\u0080µ\u0018\u0017\u0012 \n\u0010distance_samples\u0018\u0007 \u0003(\u0002B\u0006\u0010\u0001\u0080µ\u00184\u0012\"\n\u0014forward_acceleration\u0018\b \u0003(\u0002B\u0004\u0080µ\u0018E\u0012*\n\u0013moving_type_samples\u0018\t \u0003(\u000e2\r.PbMovingType\u0012 \n\u0010altitude_samples\u0018\n \u0003(\u0002B\u0006\u0010\u0001\u0080µ\u0018\u0019\u00126\n\u0014altitude_calibration\u0018\u000b \u0003(\u000b2\u0018.data.PbCalibrationValue\u0012#\n\u0013temperature_samples\u0018\f \u0003(\u0002B\u0006\u0010\u0001\u0080µ\u0018\u001d\u0012%\n\u0015stride_length_samples\u0018\r \u0003(\rB\u0006\u0010\u0001\u0080µ\u0018\u001f\u00124\n\u0012stride_calibration\u0018", "\u000e \u0003(\u000b2\u0018.data.PbCalibrationValue\u0012;\n\u0018left_pedal_power_samples\u0018\u000f \u0003(\u000b2\u0019.data.PbPowerMeasurements\u0012<\n\u0019right_pedal_power_samples\u0018\u0010 \u0003(\u000b2\u0019.data.PbPowerMeasurements\u00128\n\u0016left_power_calibration\u0018\u0011 \u0003(\u000b2\u0018.data.PbCalibrationValue\u00129\n\u0017right_power_calibration\u0018\u0012 \u0003(\u000b2\u0018.data.PbCalibrationValue\u0012/\n\nrr_samples\u0018\u0013 \u0001(\u000b2\u001b.data.PbExerciseRRIntervals\u0012 \n\u0018acceleration_mad_samples\u0018\u0014 \u0003(\u0002\"\u008d\u000b\n\u0011PbExerciseSamples\u0012'\n\u0012recording_interval\u0018\u0001", " \u0002(\u000b2\u000b.PbDuration\u0012\"\n\u0012heart_rate_samples\u0018\u0002 \u0003(\rB\u0006\u0010\u0001\u0080µ\u0018\u0014\u0012,\n\u0012heart_rate_offline\u0018\u0003 \u0003(\u000b2\u0010.PbSensorOffline\u0012\u001f\n\u000fcadence_samples\u0018\u0004 \u0003(\rB\u0006\u0010\u0001\u0080µ\u0018\u0018\u0012)\n\u000fcadence_offline\u0018\u0005 \u0003(\u000b2\u0010.PbSensorOffline\u0012 \n\u0010altitude_samples\u0018\u0006 \u0003(\u0002B\u0006\u0010\u0001\u0080µ\u0018\u0019\u0012*\n\u0010altitude_offline\u0018\u0012 \u0003(\u000b2\u0010.PbSensorOffline\u00126\n\u0014altitude_calibration\u0018\u0007 \u0003(\u000b2\u0018.data.PbCalibrationValue\u0012#\n\u0013temperature_samples\u0018\b \u0003(\u0002B\u0006\u0010\u0001\u0080µ\u0018\u001d\u0012-\n\u0013temperature_offline\u0018\u0013 \u0003(\u000b2\u0010.PbSensorOffline\u0012\u001d\n\rspe", "ed_samples\u0018\t \u0003(\u0002B\u0006\u0010\u0001\u0080µ\u0018\u0017\u0012'\n\rspeed_offline\u0018\n \u0003(\u000b2\u0010.PbSensorOffline\u0012 \n\u0010distance_samples\u0018\u000b \u0003(\u0002B\u0006\u0010\u0001\u0080µ\u00184\u0012*\n\u0010distance_offline\u0018\f \u0003(\u000b2\u0010.PbSensorOffline\u0012%\n\u0015stride_length_samples\u0018\r \u0003(\rB\u0006\u0010\u0001\u0080µ\u0018\u001f\u0012/\n\u0015stride_length_offline\u0018\u000e \u0003(\u000b2\u0010.PbSensorOffline\u00124\n\u0012stride_calibration\u0018\u000f \u0003(\u000b2\u0018.data.PbCalibrationValue\u0012\"\n\u0014forward_acceleration\u0018\u0010 \u0003(\u0002B\u0004\u0080µ\u0018E\u00126\n\u001cforward_acceleration_offline\u0018\u0014 \u0003(\u000b2\u0010.PbSensorOffline\u0012*\n\u0013moving_type_samples", "\u0018\u0011 \u0003(\u000e2\r.PbMovingType\u0012-\n\u0013moving_type_offline\u0018\u0015 \u0003(\u000b2\u0010.PbSensorOffline\u0012;\n\u0018left_pedal_power_samples\u0018\u0016 \u0003(\u000b2\u0019.data.PbPowerMeasurements\u00122\n\u0018left_pedal_power_offline\u0018\u0017 \u0003(\u000b2\u0010.PbSensorOffline\u0012<\n\u0019right_pedal_power_samples\u0018\u0018 \u0003(\u000b2\u0019.data.PbPowerMeasurements\u00123\n\u0019right_pedal_power_offline\u0018\u0019 \u0003(\u000b2\u0010.PbSensorOffline\u00128\n\u0016left_power_calibration\u0018\u001a \u0003(\u000b2\u0018.data.PbCalibrationValue\u00129\n\u0017right_power_calibration\u0018\u001b \u0003(\u000b2\u0018.data.PbCal", "ibrationValue\u0012/\n\nrr_samples\u0018\u001c \u0001(\u000b2\u001b.data.PbExerciseRRIntervals\u0012O\n exercise_intervalled_sample_list\u0018\u001d \u0003(\u000b2%.data.PbExerciseIntervalledSampleList\u0012!\n\u000bpause_times\u0018\u001e \u0003(\u000b2\f.PbPauseTimeB:\n'fi.polar.remote.representation.protobufB\u000fExerciseSamples"}, new FileDescriptor[]{var1, var2, var3}, var0);
      internal_static_data_PbPowerMeasurements_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbPowerMeasurements_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbPowerMeasurements_descriptor, new String[]{"CurrentPower", "CumulativeCrankRevolutions", "CumulativeTimestamp", "ForceMagnitudeMin", "ForceMagnitudeMax", "ForceMagnitudeMinAngle", "ForceMagnitudeMaxAngle", "BottomDeadSpotAngle", "TopDeadSpotAngle", "PedalPowerBalance", "TorqueMagnitudeMin", "TorqueMagnitudeMax"});
      internal_static_data_PbCalibrationValue_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_data_PbCalibrationValue_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbCalibrationValue_descriptor, new String[]{"StartIndex", "Value", "Operation", "Cause"});
      internal_static_data_PbExerciseIntervalledSampleList_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_data_PbExerciseIntervalledSampleList_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbExerciseIntervalledSampleList_descriptor, new String[]{"SampleType", "RecordingIntervalMs", "SampleSource", "HeartRateSamples", "CadenceSamples", "SpeedSamples", "DistanceSamples", "ForwardAcceleration", "MovingTypeSamples", "AltitudeSamples", "AltitudeCalibration", "TemperatureSamples", "StrideLengthSamples", "StrideCalibration", "LeftPedalPowerSamples", "RightPedalPowerSamples", "LeftPowerCalibration", "RightPowerCalibration", "RrSamples", "AccelerationMadSamples"});
      internal_static_data_PbExerciseSamples_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_data_PbExerciseSamples_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbExerciseSamples_descriptor, new String[]{"RecordingInterval", "HeartRateSamples", "HeartRateOffline", "CadenceSamples", "CadenceOffline", "AltitudeSamples", "AltitudeOffline", "AltitudeCalibration", "TemperatureSamples", "TemperatureOffline", "SpeedSamples", "SpeedOffline", "DistanceSamples", "DistanceOffline", "StrideLengthSamples", "StrideLengthOffline", "StrideCalibration", "ForwardAcceleration", "ForwardAccelerationOffline", "MovingTypeSamples", "MovingTypeOffline", "LeftPedalPowerSamples", "LeftPedalPowerOffline", "RightPedalPowerSamples", "RightPedalPowerOffline", "LeftPowerCalibration", "RightPowerCalibration", "RrSamples", "ExerciseIntervalledSampleList", "PauseTimes"});
      ExtensionRegistry var4 = ExtensionRegistry.newInstance();
      var4.add(Types.type);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var4);
      Types.getDescriptor();
      Structures.getDescriptor();
      ExerciseRRSamples.getDescriptor();
   }

   private ExerciseSamples() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbPowerMeasurements_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbPowerMeasurements_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_data_PbCalibrationValue_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_data_PbCalibrationValue_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor e() {
      return internal_static_data_PbExerciseIntervalledSampleList_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable f() {
      return internal_static_data_PbExerciseIntervalledSampleList_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor g() {
      return internal_static_data_PbExerciseSamples_descriptor;
   }

   public static FileDescriptor getDescriptor() {
      return descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable h() {
      return internal_static_data_PbExerciseSamples_fieldAccessorTable;
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }
}
