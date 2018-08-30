package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class RecoveryTimes {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbRecoveryTimes_descriptor;
   private static final FieldAccessorTable internal_static_data_PbRecoveryTimes_fieldAccessorTable;

   static {
      RecoveryTimes$1 var0 = new RecoveryTimes$1();
      FileDescriptor var1 = Structures.getDescriptor();
      FileDescriptor var2 = Types.getDescriptor();
      FileDescriptor var3 = Nanopb.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0014recovery_times.proto\u0012\u0004data\u001a\u0010structures.proto\u001a\u000btypes.proto\u001a\fnanopb.proto\"Ô\u0003\n\u000fPbRecoveryTimes\u0012(\n\u000estart_of_times\u0018\u0001 \u0002(\u000b2\u0010.PbLocalDateTime\u0012\u001e\n\u000erecovery_times\u0018\u0002 \u0003(\u0002B\u0006\u0092?\u0003\u0010\u0080\u0003\u0012'\n\u0019end_glycogen_left_percent\u0018\u0003 \u0001(\u0002B\u0004\u0080µ\u0018<\u0012#\n\u0015end_carbo_consumption\u0018\u0004 \u0001(\u0002B\u0004\u0080µ\u00185\u0012%\n\u0017end_protein_consumption\u0018\u0005 \u0001(\u0002B\u0004\u0080µ\u00185\u0012*\n\"end_cumulative_mechanical_stimulus\u0018\u0006 \u0001(\u0002\u0012\u001e\n\u0016last_half_hour_avg_met\u0018\u0007 \u0001(\u0002\u0012\u001f\n\u0011exercise_calories\u0018\b \u0001(\u0002B\u0004\u0080µ\u00185\u0012\u001f\n\u0011act", "ivity_calories\u0018\t \u0001(\u0002B\u0004\u0080µ\u00185\u0012\u001a\n\fbmr_calories\u0018\n \u0001(\u0002B\u0004\u0080µ\u00185\u0012\r\n\u0005steps\u0018\u000b \u0001(\r\u0012\"\n\u0014accumulated_activity\u0018\f \u0001(\u0002B\u0004\u0080µ\u0018=\u0012%\n\u001dnumber_of_exercise_half_hours\u0018\r \u0001(\rB8\n'fi.polar.remote.representation.protobufB\rRecoveryTimes"}, new FileDescriptor[]{var1, var2, var3}, var0);
      internal_static_data_PbRecoveryTimes_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbRecoveryTimes_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbRecoveryTimes_descriptor, new String[]{"StartOfTimes", "RecoveryTimes", "EndGlycogenLeftPercent", "EndCarboConsumption", "EndProteinConsumption", "EndCumulativeMechanicalStimulus", "LastHalfHourAvgMet", "ExerciseCalories", "ActivityCalories", "BmrCalories", "Steps", "AccumulatedActivity", "NumberOfExerciseHalfHours"});
      ExtensionRegistry var4 = ExtensionRegistry.newInstance();
      var4.add(Nanopb.nanopb);
      var4.add(Types.type);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var4);
      Structures.getDescriptor();
      Types.getDescriptor();
      Nanopb.getDescriptor();
   }

   private RecoveryTimes() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbRecoveryTimes_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbRecoveryTimes_fieldAccessorTable;
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
