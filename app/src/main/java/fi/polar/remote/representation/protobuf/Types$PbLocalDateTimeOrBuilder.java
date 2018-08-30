package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface Types$PbLocalDateTimeOrBuilder extends MessageOrBuilder {
   Types$PbDate getDate();

   Types$PbDateOrBuilder getDateOrBuilder();

   boolean getOBSOLETETrusted();

   Types$PbTime getTime();

   Types$PbTimeOrBuilder getTimeOrBuilder();

   int getTimeZoneOffset();

   boolean hasDate();

   boolean hasOBSOLETETrusted();

   boolean hasTime();

   boolean hasTimeZoneOffset();
}
