package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface PhysData$PbUserGenderOrBuilder extends MessageOrBuilder {
   Types$PbSystemDateTime getLastModified();

   Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder();

   PhysData$PbUserGender$Gender getValue();

   boolean hasLastModified();

   boolean hasValue();
}
