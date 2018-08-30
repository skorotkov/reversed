package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface ExerciseStatistics$PbSwimmingStatisticsOrBuilder extends MessageOrBuilder {
   ExerciseStatistics$PbSwimmingStyleStatistics getBackstrokeStatistics();

   ExerciseStatistics$PbSwimmingStyleStatisticsOrBuilder getBackstrokeStatisticsOrBuilder();

   ExerciseStatistics$PbSwimmingStyleStatistics getBreaststrokeStatistics();

   ExerciseStatistics$PbSwimmingStyleStatisticsOrBuilder getBreaststrokeStatisticsOrBuilder();

   ExerciseStatistics$PbSwimmingStyleStatistics getButterflyStatistics();

   ExerciseStatistics$PbSwimmingStyleStatisticsOrBuilder getButterflyStatisticsOrBuilder();

   ExerciseStatistics$PbSwimmingStyleStatistics getFreestyleStatistics();

   ExerciseStatistics$PbSwimmingStyleStatisticsOrBuilder getFreestyleStatisticsOrBuilder();

   int getNumberOfPoolsSwimmed();

   float getSwimmingDistance();

   Structures$PbSwimmingPoolInfo getSwimmingPool();

   Structures$PbSwimmingPoolInfoOrBuilder getSwimmingPoolOrBuilder();

   int getTotalStrokeCount();

   boolean hasBackstrokeStatistics();

   boolean hasBreaststrokeStatistics();

   boolean hasButterflyStatistics();

   boolean hasFreestyleStatistics();

   boolean hasNumberOfPoolsSwimmed();

   boolean hasSwimmingDistance();

   boolean hasSwimmingPool();

   boolean hasTotalStrokeCount();
}
