package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface DailySummary$PbActivityClassTimesOrBuilder extends MessageOrBuilder {
   Types$PbDuration getTimeContinuousModerate();

   Types$PbDurationOrBuilder getTimeContinuousModerateOrBuilder();

   Types$PbDuration getTimeContinuousVigorous();

   Types$PbDurationOrBuilder getTimeContinuousVigorousOrBuilder();

   Types$PbDuration getTimeIntermittentModerate();

   Types$PbDurationOrBuilder getTimeIntermittentModerateOrBuilder();

   Types$PbDuration getTimeIntermittentVigorous();

   Types$PbDurationOrBuilder getTimeIntermittentVigorousOrBuilder();

   Types$PbDuration getTimeLightActivity();

   Types$PbDurationOrBuilder getTimeLightActivityOrBuilder();

   Types$PbDuration getTimeNonWear();

   Types$PbDurationOrBuilder getTimeNonWearOrBuilder();

   Types$PbDuration getTimeSedentary();

   Types$PbDurationOrBuilder getTimeSedentaryOrBuilder();

   Types$PbDuration getTimeSleep();

   Types$PbDurationOrBuilder getTimeSleepOrBuilder();

   boolean hasTimeContinuousModerate();

   boolean hasTimeContinuousVigorous();

   boolean hasTimeIntermittentModerate();

   boolean hasTimeIntermittentVigorous();

   boolean hasTimeLightActivity();

   boolean hasTimeNonWear();

   boolean hasTimeSedentary();

   boolean hasTimeSleep();
}
