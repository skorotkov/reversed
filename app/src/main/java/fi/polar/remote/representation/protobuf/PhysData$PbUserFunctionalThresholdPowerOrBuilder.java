package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface PhysData$PbUserFunctionalThresholdPowerOrBuilder extends MessageOrBuilder {
   Types$PbSystemDateTime getLastModified();

   Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder();

   PhysData$PbUserFunctionalThresholdPower$FTPSettingSource getSettingSource();

   int getValue();

   boolean hasLastModified();

   boolean hasSettingSource();

   boolean hasValue();
}
