package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface Structures$PbTrainingLoadOrBuilder extends MessageOrBuilder {
   int getCarbohydrateConsumption();

   int getFatConsumption();

   int getProteinConsumption();

   Types$PbDuration getRecoveryTime();

   Types$PbDurationOrBuilder getRecoveryTimeOrBuilder();

   int getTrainingLoadVal();

   boolean hasCarbohydrateConsumption();

   boolean hasFatConsumption();

   boolean hasProteinConsumption();

   boolean hasRecoveryTime();

   boolean hasTrainingLoadVal();
}
