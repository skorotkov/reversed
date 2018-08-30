package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface ExerciseLap$PbLapSummaryOrBuilder extends MessageOrBuilder {
   Types$PbDuration getAverageLapDuration();

   Types$PbDurationOrBuilder getAverageLapDurationOrBuilder();

   Types$PbDuration getBestLapDuration();

   Types$PbDurationOrBuilder getBestLapDurationOrBuilder();

   boolean hasAverageLapDuration();

   boolean hasBestLapDuration();
}
