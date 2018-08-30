package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface Types$PbSensorCalibrationOffsetOrBuilder extends MessageOrBuilder {
   Types$PbSampleSourceType getSampleSourceType();

   float getSpeedCalOffset();

   boolean hasSampleSourceType();

   boolean hasSpeedCalOffset();
}
