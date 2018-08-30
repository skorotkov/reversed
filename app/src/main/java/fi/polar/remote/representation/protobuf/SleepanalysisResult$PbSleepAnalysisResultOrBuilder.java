package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface SleepanalysisResult$PbSleepAnalysisResultOrBuilder extends MessageOrBuilder {
   Types$PbLocalDateTime getAlarmTime();

   Types$PbLocalDateTimeOrBuilder getAlarmTimeOrBuilder();

   boolean getBatteryRanOut();

   Types$PbSystemDateTime getLastModified();

   Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder();

   Structures$PbDeviceId getRecordingDevice();

   Structures$PbDeviceIdOrBuilder getRecordingDeviceOrBuilder();

   int getSleepEndOffsetSeconds();

   Types$PbLocalDateTime getSleepEndTime();

   Types$PbLocalDateTimeOrBuilder getSleepEndTimeOrBuilder();

   int getSleepGoalMinutes();

   int getSleepStartOffsetSeconds();

   Types$PbLocalDateTime getSleepStartTime();

   Types$PbLocalDateTimeOrBuilder getSleepStartTimeOrBuilder();

   SleepanalysisResult$PbSleepWakePhase getSleepwakePhases(int var1);

   int getSleepwakePhasesCount();

   List getSleepwakePhasesList();

   SleepanalysisResult$PbSleepWakePhaseOrBuilder getSleepwakePhasesOrBuilder(int var1);

   List getSleepwakePhasesOrBuilderList();

   Types$PbLocalDateTime getSnoozeTime(int var1);

   int getSnoozeTimeCount();

   List getSnoozeTimeList();

   Types$PbLocalDateTimeOrBuilder getSnoozeTimeOrBuilder(int var1);

   List getSnoozeTimeOrBuilderList();

   SleepanalysisResult$PbSleepUserRating getUserSleepRating();

   boolean hasAlarmTime();

   boolean hasBatteryRanOut();

   boolean hasLastModified();

   boolean hasRecordingDevice();

   boolean hasSleepEndOffsetSeconds();

   boolean hasSleepEndTime();

   boolean hasSleepGoalMinutes();

   boolean hasSleepStartOffsetSeconds();

   boolean hasSleepStartTime();

   boolean hasUserSleepRating();
}
