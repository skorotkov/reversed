package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class ActivitySamples {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbActivityInfo_descriptor;
   private static final FieldAccessorTable internal_static_data_PbActivityInfo_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbActivitySamples_descriptor;
   private static final FieldAccessorTable internal_static_data_PbActivitySamples_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbInActivityNonWearTriggerInfo_descriptor;
   private static final FieldAccessorTable internal_static_data_PbInActivityNonWearTriggerInfo_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbInActivityTriggerInfo_descriptor;
   private static final FieldAccessorTable internal_static_data_PbInActivityTriggerInfo_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbSportInfo_descriptor;
   private static final FieldAccessorTable internal_static_data_PbSportInfo_fieldAccessorTable;

   static {
      ActivitySamples$1 var0 = new ActivitySamples$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor var3 = Nanopb.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0011act_samples.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\u001a\fnanopb.proto\"]\n\u000bPbSportInfo\u0012\u000e\n\u0006factor\u0018\u0001 \u0002(\u0002\u0012$\n\ntime_stamp\u0018\u0002 \u0002(\u000b2\u0010.PbLocalDateTime\u0012\u0018\n\u0010sport_profile_id\u0018\u0003 \u0001(\u0004\"¦\u0002\n\u000ePbActivityInfo\u00121\n\u0005value\u0018\u0001 \u0002(\u000e2\".data.PbActivityInfo.ActivityClass\u0012$\n\ntime_stamp\u0018\u0002 \u0002(\u000b2\u0010.PbLocalDateTime\u0012\u000e\n\u0006factor\u0018\u0003 \u0001(\u0002\"ª\u0001\n\rActivityClass\u0012\t\n\u0005SLEEP\u0010\u0001\u0012\r\n\tSEDENTARY\u0010\u0002\u0012\t\n\u0005LIGHT\u0010\u0003\u0012\u0017\n\u0013CONTINUOUS_MODERATE\u0010\u0004\u0012\u0019\n\u0015INTERMITTENT_MODERATE\u0010\u0005\u0012\u0017\n\u0013", "CONTINUOUS_VIGOROUS\u0010\u0006\u0012\u0019\n\u0015INTERMITTENT_VIGOROUS\u0010\u0007\u0012\f\n\bNON_WEAR\u0010\b\"?\n\u0017PbInActivityTriggerInfo\u0012$\n\ntime_stamp\u0018\u0001 \u0002(\u000b2\u0010.PbLocalDateTime\"v\n\u001ePbInActivityNonWearTriggerInfo\u0012*\n\u0010start_time_stamp\u0018\u0001 \u0002(\u000b2\u0010.PbLocalDateTime\u0012(\n\u000eend_time_stamp\u0018\u0002 \u0002(\u000b2\u0010.PbLocalDateTime\"\u009f\u0003\n\u0011PbActivitySamples\u0012$\n\nstart_time\u0018\u0001 \u0002(\u000b2\u0010.PbLocalDateTime\u0012+\n\u0016met_recording_interval\u0018\u0002 \u0002(\u000b2\u000b.PbDuration\u0012-\n\u0018steps_recording_interval\u0018\u0003 \u0002(\u000b2\u000b.PbDuration\u0012", "\u0013\n\u000bmet_samples\u0018\u0004 \u0003(\u0002\u0012\u0019\n\rsteps_samples\u0018\u0005 \u0003(\rB\u0002\u0010\u0001\u0012%\n\nsport_info\u0018\u0006 \u0003(\u000b2\u0011.data.PbSportInfo\u0012+\n\ractivity_info\u0018\u0007 \u0003(\u000b2\u0014.data.PbActivityInfo\u00129\n\u0012inactivity_trigger\u0018\b \u0003(\u000b2\u001d.data.PbInActivityTriggerInfo\u0012I\n\u001binactivity_non_wear_trigger\u0018\t \u0003(\u000b2$.data.PbInActivityNonWearTriggerInfoB:\n'fi.polar.remote.representation.protobufB\u000fActivitySamples"}, new FileDescriptor[]{var1, var2, var3}, var0);
      internal_static_data_PbSportInfo_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbSportInfo_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbSportInfo_descriptor, new String[]{"Factor", "TimeStamp", "SportProfileId"});
      internal_static_data_PbActivityInfo_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_data_PbActivityInfo_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbActivityInfo_descriptor, new String[]{"Value", "TimeStamp", "Factor"});
      internal_static_data_PbInActivityTriggerInfo_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_data_PbInActivityTriggerInfo_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbInActivityTriggerInfo_descriptor, new String[]{"TimeStamp"});
      internal_static_data_PbInActivityNonWearTriggerInfo_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_data_PbInActivityNonWearTriggerInfo_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbInActivityNonWearTriggerInfo_descriptor, new String[]{"StartTimeStamp", "EndTimeStamp"});
      internal_static_data_PbActivitySamples_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_data_PbActivitySamples_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbActivitySamples_descriptor, new String[]{"StartTime", "MetRecordingInterval", "StepsRecordingInterval", "MetSamples", "StepsSamples", "SportInfo", "ActivityInfo", "InactivityTrigger", "InactivityNonWearTrigger"});
      Types.getDescriptor();
      Structures.getDescriptor();
      Nanopb.getDescriptor();
   }

   private ActivitySamples() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbSportInfo_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbSportInfo_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_data_PbActivityInfo_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_data_PbActivityInfo_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor e() {
      return internal_static_data_PbInActivityTriggerInfo_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable f() {
      return internal_static_data_PbInActivityTriggerInfo_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor g() {
      return internal_static_data_PbInActivityNonWearTriggerInfo_descriptor;
   }

   public static FileDescriptor getDescriptor() {
      return descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable h() {
      return internal_static_data_PbInActivityNonWearTriggerInfo_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor i() {
      return internal_static_data_PbActivitySamples_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable j() {
      return internal_static_data_PbActivitySamples_fieldAccessorTable;
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }
}
