package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface ActivitySamples$PbSportInfoOrBuilder extends MessageOrBuilder {
   float getFactor();

   long getSportProfileId();

   Types$PbLocalDateTime getTimeStamp();

   Types$PbLocalDateTimeOrBuilder getTimeStampOrBuilder();

   boolean hasFactor();

   boolean hasSportProfileId();

   boolean hasTimeStamp();
}
