package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface ActivitySamples$PbActivityInfoOrBuilder extends MessageOrBuilder {
   float getFactor();

   Types$PbLocalDateTime getTimeStamp();

   Types$PbLocalDateTimeOrBuilder getTimeStampOrBuilder();

   ActivitySamples$PbActivityInfo$ActivityClass getValue();

   boolean hasFactor();

   boolean hasTimeStamp();

   boolean hasValue();
}
