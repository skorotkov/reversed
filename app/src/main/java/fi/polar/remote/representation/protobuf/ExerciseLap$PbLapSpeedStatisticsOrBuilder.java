package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface ExerciseLap$PbLapSpeedStatisticsOrBuilder extends MessageOrBuilder {
   float getAverage();

   float getMaximum();

   boolean hasAverage();

   boolean hasMaximum();
}
