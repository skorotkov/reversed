package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface ExerciseLap$PbLapSwimmingStatisticsOrBuilder extends MessageOrBuilder {
   float getAvgDurationOfPool();

   int getLapStrokes();

   int getPoolCount();

   boolean hasAvgDurationOfPool();

   boolean hasLapStrokes();

   boolean hasPoolCount();
}
