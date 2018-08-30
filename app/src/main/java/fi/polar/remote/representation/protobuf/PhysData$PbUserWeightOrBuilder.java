package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface PhysData$PbUserWeightOrBuilder extends MessageOrBuilder {
   Types$PbSystemDateTime getLastModified();

   Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder();

   PhysData$PbUserWeight$WeightSettingSource getSettingSource();

   float getValue();

   boolean hasLastModified();

   boolean hasSettingSource();

   boolean hasValue();
}
