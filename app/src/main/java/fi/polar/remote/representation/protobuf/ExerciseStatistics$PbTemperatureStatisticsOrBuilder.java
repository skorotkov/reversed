package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface ExerciseStatistics$PbTemperatureStatisticsOrBuilder extends MessageOrBuilder {
   float getAverage();

   float getMaximum();

   float getMinimum();

   boolean hasAverage();

   boolean hasMaximum();

   boolean hasMinimum();
}
