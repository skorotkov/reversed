package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface ActivitySamples$PbInActivityNonWearTriggerInfoOrBuilder extends MessageOrBuilder {
   Types$PbLocalDateTime getEndTimeStamp();

   Types$PbLocalDateTimeOrBuilder getEndTimeStampOrBuilder();

   Types$PbLocalDateTime getStartTimeStamp();

   Types$PbLocalDateTimeOrBuilder getStartTimeStampOrBuilder();

   boolean hasEndTimeStamp();

   boolean hasStartTimeStamp();
}
