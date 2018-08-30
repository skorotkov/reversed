package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class DailySummary {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbActivityClassTimes_descriptor;
   private static final FieldAccessorTable internal_static_data_PbActivityClassTimes_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbActivityGoalSummary_descriptor;
   private static final FieldAccessorTable internal_static_data_PbActivityGoalSummary_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbDailySummary_descriptor;
   private static final FieldAccessorTable internal_static_data_PbDailySummary_fieldAccessorTable;

   static {
      DailySummary$1 var0 = new DailySummary$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor var3 = Nanopb.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012dailysummary.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\u001a\fnanopb.proto\"Ä\u0001\n\u0015PbActivityGoalSummary\u0012\u001b\n\ractivity_goal\u0018\u0001 \u0002(\u0002B\u0004\u0080µ\u0018=\u0012\u001f\n\u0011achieved_activity\u0018\u0002 \u0002(\u0002B\u0004\u0080µ\u0018=\u0012\"\n\rtime_to_go_up\u0018\u0003 \u0001(\u000b2\u000b.PbDuration\u0012$\n\u000ftime_to_go_walk\u0018\u0004 \u0001(\u000b2\u000b.PbDuration\u0012#\n\u000etime_to_go_jog\u0018\u0005 \u0001(\u000b2\u000b.PbDuration\"ê\u0002\n\u0014PbActivityClassTimes\u0012\"\n\rtime_non_wear\u0018\u0001 \u0002(\u000b2\u000b.PbDuration\u0012\u001f\n\ntime_sleep\u0018\u0002 \u0002(\u000b2\u000b.PbDuration\u0012#\n\u000etime_sedentary\u0018\u0003 \u0002(\u000b2\u000b.PbDuratio", "n\u0012(\n\u0013time_light_activity\u0018\u0004 \u0002(\u000b2\u000b.PbDuration\u0012-\n\u0018time_continuous_moderate\u0018\u0005 \u0002(\u000b2\u000b.PbDuration\u0012/\n\u001atime_intermittent_moderate\u0018\u0006 \u0002(\u000b2\u000b.PbDuration\u0012-\n\u0018time_continuous_vigorous\u0018\u0007 \u0002(\u000b2\u000b.PbDuration\u0012/\n\u001atime_intermittent_vigorous\u0018\b \u0002(\u000b2\u000b.PbDuration\"«\u0002\n\u000ePbDailySummary\u0012\u0015\n\u0004date\u0018\u0001 \u0002(\u000b2\u0007.PbDate\u0012\r\n\u0005steps\u0018\u0002 \u0001(\r\u0012\u001f\n\u0011activity_calories\u0018\u0003 \u0001(\rB\u0004\u0080µ\u0018J\u0012\u001f\n\u0011training_calories\u0018\u0004 \u0001(\rB\u0004\u0080µ\u0018J\u0012\u001a\n\fbmr_calories\u0018\u0005 \u0001(\rB\u0004\u0080µ\u0018J\u0012:\n\u0015activity_g", "oal_summary\u0018\u0006 \u0001(\u000b2\u001b.data.PbActivityGoalSummary\u00128\n\u0014activity_class_times\u0018\u0007 \u0001(\u000b2\u001a.data.PbActivityClassTimes\u0012\u001f\n\u0011activity_distance\u0018\b \u0001(\u0002B\u0004\u0080µ\u00184B7\n'fi.polar.remote.representation.protobufB\fDailySummary"}, new FileDescriptor[]{var1, var2, var3}, var0);
      internal_static_data_PbActivityGoalSummary_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbActivityGoalSummary_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbActivityGoalSummary_descriptor, new String[]{"ActivityGoal", "AchievedActivity", "TimeToGoUp", "TimeToGoWalk", "TimeToGoJog"});
      internal_static_data_PbActivityClassTimes_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_data_PbActivityClassTimes_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbActivityClassTimes_descriptor, new String[]{"TimeNonWear", "TimeSleep", "TimeSedentary", "TimeLightActivity", "TimeContinuousModerate", "TimeIntermittentModerate", "TimeContinuousVigorous", "TimeIntermittentVigorous"});
      internal_static_data_PbDailySummary_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_data_PbDailySummary_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbDailySummary_descriptor, new String[]{"Date", "Steps", "ActivityCalories", "TrainingCalories", "BmrCalories", "ActivityGoalSummary", "ActivityClassTimes", "ActivityDistance"});
      ExtensionRegistry var4 = ExtensionRegistry.newInstance();
      var4.add(Types.type);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var4);
      Types.getDescriptor();
      Structures.getDescriptor();
      Nanopb.getDescriptor();
   }

   private DailySummary() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbActivityGoalSummary_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbActivityGoalSummary_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_data_PbActivityClassTimes_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_data_PbActivityClassTimes_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor e() {
      return internal_static_data_PbDailySummary_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable f() {
      return internal_static_data_PbDailySummary_fieldAccessorTable;
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
