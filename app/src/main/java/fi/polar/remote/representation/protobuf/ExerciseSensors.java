package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class ExerciseSensors {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbExerciseSensor_descriptor;
   private static final FieldAccessorTable internal_static_data_PbExerciseSensor_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbExerciseSensors_descriptor;
   private static final FieldAccessorTable internal_static_data_PbExerciseSensors_fieldAccessorTable;

   static {
      ExerciseSensors$1 var0 = new ExerciseSensors$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor var3 = Nanopb.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0016exercise_sensors.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\u001a\fnanopb.proto\"q\n\u0010PbExerciseSensor\u0012\u0016\n\u0003mac\u0018\u0001 \u0002(\u000b2\t.PbBleMac\u0012\u001e\n\tdevice_id\u0018\u0002 \u0001(\u000b2\u000b.PbDeviceId\u0012%\n\u000bdevice_name\u0018\u0003 \u0001(\u000b2\u0010.PbBleDeviceName\"C\n\u0011PbExerciseSensors\u0012.\n\u0007sensors\u0018\u0001 \u0003(\u000b2\u0016.data.PbExerciseSensorB\u0005\u0092?\u0002\u0010\nB:\n'fi.polar.remote.representation.protobufB\u000fExerciseSensors"}, new FileDescriptor[]{var1, var2, var3}, var0);
      internal_static_data_PbExerciseSensor_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbExerciseSensor_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbExerciseSensor_descriptor, new String[]{"Mac", "DeviceId", "DeviceName"});
      internal_static_data_PbExerciseSensors_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_data_PbExerciseSensors_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbExerciseSensors_descriptor, new String[]{"Sensors"});
      ExtensionRegistry var4 = ExtensionRegistry.newInstance();
      var4.add(Nanopb.nanopb);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var4);
      Types.getDescriptor();
      Structures.getDescriptor();
      Nanopb.getDescriptor();
   }

   private ExerciseSensors() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbExerciseSensor_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbExerciseSensor_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_data_PbExerciseSensors_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_data_PbExerciseSensors_fieldAccessorTable;
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
