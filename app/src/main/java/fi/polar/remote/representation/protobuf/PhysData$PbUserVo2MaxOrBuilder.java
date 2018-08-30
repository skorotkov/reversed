package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface PhysData$PbUserVo2MaxOrBuilder extends MessageOrBuilder {
   Types$PbSystemDateTime getLastModified();

   Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder();

   PhysData$PbUserVo2Max$Vo2MaxSettingSource getSettingSource();

   int getValue();

   boolean hasLastModified();

   boolean hasSettingSource();

   boolean hasValue();
}
