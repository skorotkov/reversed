package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface Types$PbSystemDateTimeOrBuilder extends MessageOrBuilder {
   Types$PbDate getDate();

   Types$PbDateOrBuilder getDateOrBuilder();

   Types$PbTime getTime();

   Types$PbTimeOrBuilder getTimeOrBuilder();

   boolean getTrusted();

   boolean hasDate();

   boolean hasTime();

   boolean hasTrusted();
}
