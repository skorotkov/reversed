package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface ExerciseLap$PbLapOrBuilder extends MessageOrBuilder {
   ExerciseLap$PbLapHeader getHeader();

   ExerciseLap$PbLapHeaderOrBuilder getHeaderOrBuilder();

   ExerciseLap$PbLapStatistics getStatistics();

   ExerciseLap$PbLapStatisticsOrBuilder getStatisticsOrBuilder();

   boolean hasHeader();

   boolean hasStatistics();
}
