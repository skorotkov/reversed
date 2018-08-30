package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class DailyActivityGoal {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbActivityMetMinGoal_descriptor;
   private static final FieldAccessorTable internal_static_data_PbActivityMetMinGoal_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbDailyActivityGoal_descriptor;
   private static final FieldAccessorTable internal_static_data_PbDailyActivityGoal_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbPolarBalanceGoal_descriptor;
   private static final FieldAccessorTable internal_static_data_PbPolarBalanceGoal_fieldAccessorTable;

   static {
      DailyActivityGoal$1 var0 = new DailyActivityGoal$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0013act_dailygoal.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\"S\n\u0014PbActivityMetMinGoal\u0012\u0012\n\u0004goal\u0018\u0001 \u0002(\u0002B\u0004\u0080µ\u0018=\u0012'\n\u0019activity_cutoff_threshold\u0018\u0002 \u0001(\u0002B\u0004\u0080µ\u0018\u001e\"\u008c\u0001\n\u0012PbPolarBalanceGoal\u0012\u001b\n\nstart_date\u0018\u0001 \u0002(\u000b2\u0007.PbDate\u0012\u001b\n\rtarget_weight\u0018\u0002 \u0001(\u0002B\u0004\u0080µ\u0018\u000b\u0012\u001e\n\u0016goal_duration_in_weeks\u0018\u0003 \u0001(\r\u0012\u001c\n\u0014fraction_of_activity\u0018\u0004 \u0001(\u0002\"ê\u0002\n\u0013PbDailyActivityGoal\u0012?\n\tgoal_type\u0018\u0003 \u0001(\u000e2,.data.PbDailyActivityGoal.PbActivityGoalType\u00128\n\u0014activity_metmin_goal\u0018", "\u0001 \u0001(\u000b2\u001a.data.PbActivityMetMinGoal\u0012(\n\rlast_modified\u0018\u0002 \u0002(\u000b2\u0011.PbSystemDateTime\u00124\n\u0012polar_balance_goal\u0018\u0004 \u0001(\u000b2\u0018.data.PbPolarBalanceGoal\"x\n\u0012PbActivityGoalType\u0012 \n\u001cACTIVITY_GOAL_DAILY_ACTIVITY\u0010\u0001\u0012\u001d\n\u0019ACTIVITY_GOAL_WEIGHT_LOSS\u0010\u0002\u0012!\n\u001dACTIVITY_GOAL_WEIGHT_MAINTAIN\u0010\u0003B<\n'fi.polar.remote.representation.protobufB\u0011DailyActivityGoal"}, new FileDescriptor[]{var1, var2}, var0);
      internal_static_data_PbActivityMetMinGoal_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbActivityMetMinGoal_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbActivityMetMinGoal_descriptor, new String[]{"Goal", "ActivityCutoffThreshold"});
      internal_static_data_PbPolarBalanceGoal_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_data_PbPolarBalanceGoal_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbPolarBalanceGoal_descriptor, new String[]{"StartDate", "TargetWeight", "GoalDurationInWeeks", "FractionOfActivity"});
      internal_static_data_PbDailyActivityGoal_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_data_PbDailyActivityGoal_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbDailyActivityGoal_descriptor, new String[]{"GoalType", "ActivityMetminGoal", "LastModified", "PolarBalanceGoal"});
      ExtensionRegistry var3 = ExtensionRegistry.newInstance();
      var3.add(Types.type);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var3);
      Types.getDescriptor();
      Structures.getDescriptor();
   }

   private DailyActivityGoal() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbActivityMetMinGoal_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbActivityMetMinGoal_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_data_PbPolarBalanceGoal_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_data_PbPolarBalanceGoal_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor e() {
      return internal_static_data_PbDailyActivityGoal_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable f() {
      return internal_static_data_PbDailyActivityGoal_fieldAccessorTable;
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
