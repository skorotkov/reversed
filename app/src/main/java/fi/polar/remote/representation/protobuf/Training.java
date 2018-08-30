package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class Training {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbExerciseBase_descriptor;
   private static final FieldAccessorTable internal_static_data_PbExerciseBase_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbExerciseCounters_descriptor;
   private static final FieldAccessorTable internal_static_data_PbExerciseCounters_fieldAccessorTable;

   static {
      Training$1 var0 = new Training$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor var3 = Nanopb.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0013exercise_base.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\u001a\fnanopb.proto\"*\n\u0012PbExerciseCounters\u0012\u0014\n\fsprint_count\u0018\u0001 \u0001(\r\"é\u0005\n\u000ePbExerciseBase\u0012\u001f\n\u0005start\u0018\u0001 \u0002(\u000b2\u0010.PbLocalDateTime\u0012\u001d\n\bduration\u0018\u0002 \u0002(\u000b2\u000b.PbDuration\u0012!\n\u0005sport\u0018\u0003 \u0002(\u000b2\u0012.PbSportIdentifier\u0012\u0016\n\bdistance\u0018\u0004 \u0001(\u0002B\u0004\u0080µ\u00184\u0012\u0016\n\bcalories\u0018\u0005 \u0001(\rB\u0004\u0080µ\u0018J\u0012&\n\rtraining_load\u0018\u0006 \u0001(\u000b2\u000f.PbTrainingLoad\u00128\n\u0019available_sensor_features\u0018\u0007 \u0003(\u000e2\u000e.PbFeatureTypeB\u0005\u0092?\u0002\u0010\u001e\u0012&\n\rrunning_index\u0018\t ", "\u0001(\u000b2\u000f.PbRunningIndex\u0012\u0014\n\u0006ascent\u0018\n \u0001(\u0002B\u0004\u0080µ\u00187\u0012\u0015\n\u0007descent\u0018\u000b \u0001(\u0002B\u0004\u0080µ\u00188\u0012\u0010\n\blatitude\u0018\f \u0001(\u0001\u0012\u0011\n\tlongitude\u0018\r \u0001(\u0001\u0012\r\n\u0005place\u0018\u000e \u0001(\t\u00123\n\u0011exercise_counters\u0018\u0010 \u0001(\u000b2\u0018.data.PbExerciseCounters\u00122\n!OBSOLETE_speed_calibration_offset\u0018\u0011 \u0001(\u0002:\u00010B\u0004\u0080µ\u0018K\u0012\u001e\n\u0010walking_distance\u0018\u0012 \u0001(\u0002B\u0004\u0080µ\u00184\u0012%\n\u0010walking_duration\u0018\u0013 \u0001(\u000b2\u000b.PbDuration\u0012\u001a\n\u0012accumulated_torque\u0018\u0014 \u0001(\r\u0012\"\n\u0014cycling_power_energy\u0018\u0015 \u0001(\rB\u0004\u0080µ\u0018J\u0012=\n\u0019sensor_calibration_offset\u0018\u0016 \u0003(\u000b2\u001a.PbSen", "sorCalibrationOffset\u0012*\n\u000fdevice_location\u0018\u0017 \u0001(\u000e2\u0011.PbDeviceLocationB3\n'fi.polar.remote.representation.protobufB\bTraining"}, new FileDescriptor[]{var1, var2, var3}, var0);
      internal_static_data_PbExerciseCounters_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbExerciseCounters_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbExerciseCounters_descriptor, new String[]{"SprintCount"});
      internal_static_data_PbExerciseBase_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_data_PbExerciseBase_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbExerciseBase_descriptor, new String[]{"Start", "Duration", "Sport", "Distance", "Calories", "TrainingLoad", "AvailableSensorFeatures", "RunningIndex", "Ascent", "Descent", "Latitude", "Longitude", "Place", "ExerciseCounters", "OBSOLETESpeedCalibrationOffset", "WalkingDistance", "WalkingDuration", "AccumulatedTorque", "CyclingPowerEnergy", "SensorCalibrationOffset", "DeviceLocation"});
      ExtensionRegistry var4 = ExtensionRegistry.newInstance();
      var4.add(Nanopb.nanopb);
      var4.add(Types.type);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var4);
      Types.getDescriptor();
      Structures.getDescriptor();
      Nanopb.getDescriptor();
   }

   private Training() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbExerciseCounters_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbExerciseCounters_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_data_PbExerciseBase_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_data_PbExerciseBase_fieldAccessorTable;
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
