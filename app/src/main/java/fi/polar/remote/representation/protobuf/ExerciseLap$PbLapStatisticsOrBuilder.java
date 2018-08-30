package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface ExerciseLap$PbLapStatisticsOrBuilder extends MessageOrBuilder {
   ExerciseLap$PbLapCadenceStatistics getCadence();

   ExerciseLap$PbLapCadenceStatisticsOrBuilder getCadenceOrBuilder();

   ExerciseLap$PbLapHeartRateStatistics getHeartRate();

   ExerciseLap$PbLapHeartRateStatisticsOrBuilder getHeartRateOrBuilder();

   ExerciseLap$PbLapInclineStatistics getIncline();

   ExerciseLap$PbLapInclineStatisticsOrBuilder getInclineOrBuilder();

   ExerciseLap$PbLapLRBalanceStatistics getLeftRightBalance();

   ExerciseLap$PbLapLRBalanceStatisticsOrBuilder getLeftRightBalanceOrBuilder();

   ExerciseLap$PbLapPedalingIndexStatistics getOBSOLETEPedalingIndex();

   ExerciseLap$PbLapPedalingIndexStatisticsOrBuilder getOBSOLETEPedalingIndexOrBuilder();

   ExerciseLap$PbLapPowerStatistics getPower();

   ExerciseLap$PbLapPowerStatisticsOrBuilder getPowerOrBuilder();

   ExerciseLap$PbLapSpeedStatistics getSpeed();

   ExerciseLap$PbLapSpeedStatisticsOrBuilder getSpeedOrBuilder();

   ExerciseLap$PbLapStrideLengthStatistics getStrideLength();

   ExerciseLap$PbLapStrideLengthStatisticsOrBuilder getStrideLengthOrBuilder();

   ExerciseLap$PbLapSwimmingStatistics getSwimmingStatistics();

   ExerciseLap$PbLapSwimmingStatisticsOrBuilder getSwimmingStatisticsOrBuilder();

   ExerciseLap$PbLapTrainingPeaksStatistics getTrainingPeaks();

   ExerciseLap$PbLapTrainingPeaksStatisticsOrBuilder getTrainingPeaksOrBuilder();

   boolean hasCadence();

   boolean hasHeartRate();

   boolean hasIncline();

   boolean hasLeftRightBalance();

   boolean hasOBSOLETEPedalingIndex();

   boolean hasPower();

   boolean hasSpeed();

   boolean hasStrideLength();

   boolean hasSwimmingStatistics();

   boolean hasTrainingPeaks();
}
