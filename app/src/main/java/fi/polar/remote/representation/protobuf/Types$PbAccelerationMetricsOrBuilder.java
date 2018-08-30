package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface Types$PbAccelerationMetricsOrBuilder extends MessageOrBuilder {
   Types$PbCalibrationSettings getCalibrationSettings(int var1);

   int getCalibrationSettingsCount();

   List getCalibrationSettingsList();

   Types$PbCalibrationSettingsOrBuilder getCalibrationSettingsOrBuilder(int var1);

   List getCalibrationSettingsOrBuilderList();

   Types$PbSampleSourceType getSampleSourceType();

   boolean hasSampleSourceType();
}
