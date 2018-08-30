package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface ExerciseStatistics$PbHeartRateStatisticsOrBuilder extends MessageOrBuilder {
   int getAverage();

   int getMaximum();

   int getMinimum();

   boolean hasAverage();

   boolean hasMaximum();

   boolean hasMinimum();
}
