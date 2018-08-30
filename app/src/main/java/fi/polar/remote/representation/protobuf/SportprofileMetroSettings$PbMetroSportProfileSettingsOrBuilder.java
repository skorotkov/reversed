package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface SportprofileMetroSettings$PbMetroSportProfileSettingsOrBuilder extends MessageOrBuilder {
   Types$PbAutoPause getAutoPause();

   Types$PbAutoPauseOrBuilder getAutoPauseOrBuilder();

   boolean getAutoScrolling();

   Types$PbAutoLapSettings getAutolapSettings();

   Types$PbAutoLapSettingsOrBuilder getAutolapSettingsOrBuilder();

   Types$PbGPSSetting getGpsSetting();

   Types$PbHeartRateView getHeartRateView();

   SportprofileDisplays$PbSirius2DisplaySettings getSirius2DisplaySettings();

   SportprofileDisplays$PbSirius2DisplaySettingsOrBuilder getSirius2DisplaySettingsOrBuilder();

   Types$PbStrideSensorCalibSettings getStrideSensorCalibSettings();

   Types$PbStrideSensorCalibSettingsOrBuilder getStrideSensorCalibSettingsOrBuilder();

   boolean getVibration();

   boolean hasAutoPause();

   boolean hasAutoScrolling();

   boolean hasAutolapSettings();

   boolean hasGpsSetting();

   boolean hasHeartRateView();

   boolean hasSirius2DisplaySettings();

   boolean hasStrideSensorCalibSettings();

   boolean hasVibration();
}
