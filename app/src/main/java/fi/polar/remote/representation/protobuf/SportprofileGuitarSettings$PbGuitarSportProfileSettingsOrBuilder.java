package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface SportprofileGuitarSettings$PbGuitarSportProfileSettingsOrBuilder extends MessageOrBuilder {
   Types$PbAltitudeSetting getAltitudeSetting();

   Types$PbAutoPause getAutoPause();

   Types$PbAutoPauseOrBuilder getAutoPauseOrBuilder();

   boolean getAutoScrolling();

   boolean getAutoStart();

   Types$PbAutoLapSettings getAutolapSettings();

   Types$PbAutoLapSettingsOrBuilder getAutolapSettingsOrBuilder();

   Types$PbGPSSetting getGpsSetting();

   Types$PbHeartRateView getHeartRateView();

   Types$PbHeartTouch getHeartTouch();

   SportprofileDisplays$PbSirius2DisplaySettings getSirius2DisplaySettings();

   SportprofileDisplays$PbSirius2DisplaySettingsOrBuilder getSirius2DisplaySettingsOrBuilder();

   SportprofileGuitarSettings$PbGuitarSportProfileSettings$PbSportTapButtonSensitivity getSportTapButtonSensitivity();

   int getSprintDisplayActivation();

   Types$PbStrideSensorCalibSettings getStrideSensorCalibSettings();

   Types$PbStrideSensorCalibSettingsOrBuilder getStrideSensorCalibSettingsOrBuilder();

   Structures$PbSwimmingPoolInfo getSwimmingPool();

   Structures$PbSwimmingPoolInfoOrBuilder getSwimmingPoolOrBuilder();

   Types$PbTapButtonAction getTapButtonAction();

   boolean getVibration();

   boolean hasAltitudeSetting();

   boolean hasAutoPause();

   boolean hasAutoScrolling();

   boolean hasAutoStart();

   boolean hasAutolapSettings();

   boolean hasGpsSetting();

   boolean hasHeartRateView();

   boolean hasHeartTouch();

   boolean hasSirius2DisplaySettings();

   boolean hasSportTapButtonSensitivity();

   boolean hasSprintDisplayActivation();

   boolean hasStrideSensorCalibSettings();

   boolean hasSwimmingPool();

   boolean hasTapButtonAction();

   boolean hasVibration();
}
