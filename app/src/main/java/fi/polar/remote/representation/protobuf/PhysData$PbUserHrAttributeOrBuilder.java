package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface PhysData$PbUserHrAttributeOrBuilder extends MessageOrBuilder {
   Types$PbSystemDateTime getLastModified();

   Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder();

   PhysData$PbUserHrAttribute$HrSettingSource getSettingSource();

   int getValue();

   boolean hasLastModified();

   boolean hasSettingSource();

   boolean hasValue();
}
