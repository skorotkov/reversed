package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface ExerciseSamples$PbCalibrationValueOrBuilder extends MessageOrBuilder {
   Types$PbMovingType getCause();

   Types$PbOperationType getOperation();

   int getStartIndex();

   float getValue();

   boolean hasCause();

   boolean hasOperation();

   boolean hasStartIndex();

   boolean hasValue();
}
