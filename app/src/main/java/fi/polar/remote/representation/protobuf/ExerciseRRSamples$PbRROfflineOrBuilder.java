package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface ExerciseRRSamples$PbRROfflineOrBuilder extends MessageOrBuilder {
   Types$PbDuration getStartTime();

   Types$PbDurationOrBuilder getStartTimeOrBuilder();

   Types$PbDuration getTimeInterval();

   Types$PbDurationOrBuilder getTimeIntervalOrBuilder();

   boolean hasStartTime();

   boolean hasTimeInterval();
}
