package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface SwimmingSamples$PbSwimmingStyleChangeOrBuilder extends MessageOrBuilder {
   Types$PbSwimmingStyle getStyle();

   Types$PbDuration getTimestamp();

   Types$PbDurationOrBuilder getTimestampOrBuilder();

   boolean hasStyle();

   boolean hasTimestamp();
}
