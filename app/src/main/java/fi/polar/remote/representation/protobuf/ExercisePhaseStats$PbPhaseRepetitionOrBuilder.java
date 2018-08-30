package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface ExercisePhaseStats$PbPhaseRepetitionOrBuilder extends MessageOrBuilder {
   float getAscent();

   float getAverageSwolf();

   ExerciseStatistics$PbCadenceStatistics getCadence();

   ExerciseStatistics$PbCadenceStatisticsOrBuilder getCadenceOrBuilder();

   float getDescent();

   float getDistance();

   Types$PbDuration getDuration();

   Types$PbDurationOrBuilder getDurationOrBuilder();

   ExercisePhaseStats$PbPhaseHeartRateStatistics getHeartRate();

   ExercisePhaseStats$PbPhaseHeartRateStatisticsOrBuilder getHeartRateOrBuilder();

   Types$PbDuration getInTargetZone();

   Types$PbDurationOrBuilder getInTargetZoneOrBuilder();

   int getIndex();

   ExerciseStatistics$PbLRBalanceStatistics getLeftRightBalance();

   ExerciseStatistics$PbLRBalanceStatisticsOrBuilder getLeftRightBalanceOrBuilder();

   boolean getPhaseFinished();

   ExerciseStatistics$PbPowerStatistics getPower();

   ExerciseStatistics$PbPowerStatisticsOrBuilder getPowerOrBuilder();

   ExerciseStatistics$PbSpeedStatistics getSpeed();

   ExerciseStatistics$PbSpeedStatisticsOrBuilder getSpeedOrBuilder();

   float getSplitDistance();

   Types$PbDuration getSplitTime();

   Types$PbDurationOrBuilder getSplitTimeOrBuilder();

   ExercisePhaseStats$PbPhaseStrideLengthStatistics getStrideLength();

   ExercisePhaseStats$PbPhaseStrideLengthStatisticsOrBuilder getStrideLengthOrBuilder();

   int getStrokeCount();

   int getStrokesPerMin();

   boolean hasAscent();

   boolean hasAverageSwolf();

   boolean hasCadence();

   boolean hasDescent();

   boolean hasDistance();

   boolean hasDuration();

   boolean hasHeartRate();

   boolean hasInTargetZone();

   boolean hasIndex();

   boolean hasLeftRightBalance();

   boolean hasPhaseFinished();

   boolean hasPower();

   boolean hasSpeed();

   boolean hasSplitDistance();

   boolean hasSplitTime();

   boolean hasStrideLength();

   boolean hasStrokeCount();

   boolean hasStrokesPerMin();
}
