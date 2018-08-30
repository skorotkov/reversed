package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface Types$PbCalibrationSettingsOrBuilder extends MessageOrBuilder {
   boolean getCalibrationCalculationEnabled();

   boolean getCalibrationEnabled();

   Types$PbSampleType getSampleType();

   boolean hasCalibrationCalculationEnabled();

   boolean hasCalibrationEnabled();

   boolean hasSampleType();
}
