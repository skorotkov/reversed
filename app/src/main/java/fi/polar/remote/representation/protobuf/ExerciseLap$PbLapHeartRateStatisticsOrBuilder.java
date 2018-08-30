package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface ExerciseLap$PbLapHeartRateStatisticsOrBuilder extends MessageOrBuilder {
   int getAverage();

   int getMaximum();

   int getMinimum();

   boolean hasAverage();

   boolean hasMaximum();

   boolean hasMinimum();
}
