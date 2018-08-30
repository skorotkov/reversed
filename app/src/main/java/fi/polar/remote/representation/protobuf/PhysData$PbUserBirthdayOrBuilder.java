package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface PhysData$PbUserBirthdayOrBuilder extends MessageOrBuilder {
   Types$PbSystemDateTime getLastModified();

   Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder();

   Types$PbDate getValue();

   Types$PbDateOrBuilder getValueOrBuilder();

   boolean hasLastModified();

   boolean hasValue();
}
