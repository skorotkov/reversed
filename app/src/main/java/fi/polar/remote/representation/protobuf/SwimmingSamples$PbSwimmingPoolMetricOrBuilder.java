package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface SwimmingSamples$PbSwimmingPoolMetricOrBuilder extends MessageOrBuilder {
   Types$PbDuration getDuration();

   Types$PbDurationOrBuilder getDurationOrBuilder();

   Types$PbDuration getStartOffset();

   Types$PbDurationOrBuilder getStartOffsetOrBuilder();

   int getStrokes();

   Types$PbSwimmingStyle getStyle();

   boolean hasDuration();

   boolean hasStartOffset();

   boolean hasStrokes();

   boolean hasStyle();
}
