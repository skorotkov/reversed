package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface PhysData$PbUserTrainingBackgroundOrBuilder extends MessageOrBuilder {
   Types$PbSystemDateTime getLastModified();

   Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder();

   PhysData$PbUserTrainingBackground$TrainingBackground getValue();

   boolean hasLastModified();

   boolean hasValue();
}
