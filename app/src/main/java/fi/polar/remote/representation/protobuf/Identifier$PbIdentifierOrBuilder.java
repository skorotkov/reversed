package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface Identifier$PbIdentifierOrBuilder extends MessageOrBuilder {
   Types$PbSystemDateTime getCreated();

   Types$PbSystemDateTimeOrBuilder getCreatedOrBuilder();

   boolean getDeleted();

   long getEcosystemId();

   Types$PbSystemDateTime getLastModified();

   Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder();

   boolean hasCreated();

   boolean hasDeleted();

   boolean hasEcosystemId();

   boolean hasLastModified();
}
