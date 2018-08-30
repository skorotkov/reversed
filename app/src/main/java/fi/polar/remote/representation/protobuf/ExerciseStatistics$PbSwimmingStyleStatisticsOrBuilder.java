package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface ExerciseStatistics$PbSwimmingStyleStatisticsOrBuilder extends MessageOrBuilder {
   int getAverageHeartrate();

   float getAverageSwolf();

   float getDistance();

   int getMaximumHeartrate();

   Types$PbDuration getPoolTimeMin();

   Types$PbDurationOrBuilder getPoolTimeMinOrBuilder();

   int getStrokeCount();

   Types$PbDuration getSwimmingTimeTotal();

   Types$PbDurationOrBuilder getSwimmingTimeTotalOrBuilder();

   boolean hasAverageHeartrate();

   boolean hasAverageSwolf();

   boolean hasDistance();

   boolean hasMaximumHeartrate();

   boolean hasPoolTimeMin();

   boolean hasStrokeCount();

   boolean hasSwimmingTimeTotal();
}
