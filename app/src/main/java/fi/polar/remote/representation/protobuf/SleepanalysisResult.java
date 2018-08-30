package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class SleepanalysisResult {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbSleepAnalysisResult_descriptor;
   private static final FieldAccessorTable internal_static_data_PbSleepAnalysisResult_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbSleepWakePhase_descriptor;
   private static final FieldAccessorTable internal_static_data_PbSleepWakePhase_fieldAccessorTable;

   static {
      SleepanalysisResult$1 var0 = new SleepanalysisResult$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0019sleepanalysisresult.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\"e\n\u0010PbSleepWakePhase\u0012 \n\u0018seconds_from_sleep_start\u0018\u0001 \u0002(\r\u0012/\n\u000fsleepwake_state\u0018\u0002 \u0002(\u000e2\u0016.data.PbSleepWakeState\"ù\u0003\n\u0015PbSleepAnalysisResult\u0012*\n\u0010sleep_start_time\u0018\u0001 \u0002(\u000b2\u0010.PbLocalDateTime\u0012(\n\u000esleep_end_time\u0018\u0002 \u0002(\u000b2\u0010.PbLocalDateTime\u0012(\n\rlast_modified\u0018\u0003 \u0002(\u000b2\u0011.PbSystemDateTime\u0012\u001a\n\u0012sleep_goal_minutes\u0018\u0004 \u0002(\r\u00120\n\u0010sleepwake_phases\u0018\u0005 \u0003(\u000b2\u0016.data.PbSleepWakePhase\u0012", "%\n\u000bsnooze_time\u0018\u0006 \u0003(\u000b2\u0010.PbLocalDateTime\u0012$\n\nalarm_time\u0018\u0007 \u0001(\u000b2\u0010.PbLocalDateTime\u0012%\n\u001asleep_start_offset_seconds\u0018\b \u0001(\u0005:\u00010\u0012#\n\u0018sleep_end_offset_seconds\u0018\t \u0001(\u0005:\u00010\u00122\n\u0011user_sleep_rating\u0018\n \u0001(\u000e2\u0017.data.PbSleepUserRating\u0012%\n\u0010recording_device\u0018\u000b \u0001(\u000b2\u000b.PbDeviceId\u0012\u001e\n\u000fbattery_ran_out\u0018\f \u0001(\b:\u0005false*\u0088\u0001\n\u0010PbSleepWakeState\u0012\u0014\n\u0007PB_WAKE\u0010þÿÿÿÿÿÿÿÿ\u0001\u0012\u0013\n\u0006PB_REM\u0010ýÿÿÿÿÿÿÿÿ\u0001\u0012\u0017\n\nPB_NONREM1\u0010üÿÿÿÿÿÿÿÿ\u0001\u0012\u0017\n\nPB_NONREM2\u0010ûÿÿÿÿÿÿÿÿ\u0001\u0012\u0017\n\nPB_NONR", "EM3\u0010úÿÿÿÿÿÿÿÿ\u0001*\u009b\u0001\n\u0011PbSleepUserRating\u0012\u0013\n\u000fPB_SLEPT_POORLY\u0010\u0000\u0012\u001c\n\u0018PB_SLEPT_SOMEWHAT_POORLY\u0010\u0001\u0012$\n PB_SLEPT_NEITHER_POORLY_NOR_WELL\u0010\u0002\u0012\u001a\n\u0016PB_SLEPT_SOMEWHAT_WELL\u0010\u0003\u0012\u0011\n\rPB_SLEPT_WELL\u0010\u0004B>\n'fi.polar.remote.representation.protobufB\u0013SleepanalysisResult"}, new FileDescriptor[]{var1, var2}, var0);
      internal_static_data_PbSleepWakePhase_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbSleepWakePhase_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbSleepWakePhase_descriptor, new String[]{"SecondsFromSleepStart", "SleepwakeState"});
      internal_static_data_PbSleepAnalysisResult_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_data_PbSleepAnalysisResult_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbSleepAnalysisResult_descriptor, new String[]{"SleepStartTime", "SleepEndTime", "LastModified", "SleepGoalMinutes", "SleepwakePhases", "SnoozeTime", "AlarmTime", "SleepStartOffsetSeconds", "SleepEndOffsetSeconds", "UserSleepRating", "RecordingDevice", "BatteryRanOut"});
      Types.getDescriptor();
      Structures.getDescriptor();
   }

   private SleepanalysisResult() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbSleepWakePhase_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbSleepWakePhase_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_data_PbSleepAnalysisResult_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_data_PbSleepAnalysisResult_fieldAccessorTable;
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
