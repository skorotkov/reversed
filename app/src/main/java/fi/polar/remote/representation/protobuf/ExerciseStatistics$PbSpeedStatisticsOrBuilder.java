package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface ExerciseStatistics$PbSpeedStatisticsOrBuilder extends MessageOrBuilder {
   float getAverage();

   float getMaximum();

   boolean hasAverage();

   boolean hasMaximum();
}
