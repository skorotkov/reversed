package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface Structures$PbPauseTimeOrBuilder extends MessageOrBuilder {
   Types$PbDuration getDuration();

   Types$PbDurationOrBuilder getDurationOrBuilder();

   Types$PbDuration getStartTime();

   Types$PbDurationOrBuilder getStartTimeOrBuilder();

   boolean hasDuration();

   boolean hasStartTime();
}
