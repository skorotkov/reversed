package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface ActivitySamples$PbActivitySamplesOrBuilder extends MessageOrBuilder {
   ActivitySamples$PbActivityInfo getActivityInfo(int var1);

   int getActivityInfoCount();

   List getActivityInfoList();

   ActivitySamples$PbActivityInfoOrBuilder getActivityInfoOrBuilder(int var1);

   List getActivityInfoOrBuilderList();

   ActivitySamples$PbInActivityNonWearTriggerInfo getInactivityNonWearTrigger(int var1);

   int getInactivityNonWearTriggerCount();

   List getInactivityNonWearTriggerList();

   ActivitySamples$PbInActivityNonWearTriggerInfoOrBuilder getInactivityNonWearTriggerOrBuilder(int var1);

   List getInactivityNonWearTriggerOrBuilderList();

   ActivitySamples$PbInActivityTriggerInfo getInactivityTrigger(int var1);

   int getInactivityTriggerCount();

   List getInactivityTriggerList();

   ActivitySamples$PbInActivityTriggerInfoOrBuilder getInactivityTriggerOrBuilder(int var1);

   List getInactivityTriggerOrBuilderList();

   Types$PbDuration getMetRecordingInterval();

   Types$PbDurationOrBuilder getMetRecordingIntervalOrBuilder();

   float getMetSamples(int var1);

   int getMetSamplesCount();

   List getMetSamplesList();

   ActivitySamples$PbSportInfo getSportInfo(int var1);

   int getSportInfoCount();

   List getSportInfoList();

   ActivitySamples$PbSportInfoOrBuilder getSportInfoOrBuilder(int var1);

   List getSportInfoOrBuilderList();

   Types$PbLocalDateTime getStartTime();

   Types$PbLocalDateTimeOrBuilder getStartTimeOrBuilder();

   Types$PbDuration getStepsRecordingInterval();

   Types$PbDurationOrBuilder getStepsRecordingIntervalOrBuilder();

   int getStepsSamples(int var1);

   int getStepsSamplesCount();

   List getStepsSamplesList();

   boolean hasMetRecordingInterval();

   boolean hasStartTime();

   boolean hasStepsRecordingInterval();
}
