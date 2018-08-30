package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface SportprofileMaseratiSettings$PbMaseratiSportProfileSettingsOrBuilder extends MessageOrBuilder {
   Types$PbAltitudeSetting getAltitudeSetting();

   boolean getAutoStart();

   Types$PbAutoLapSettings getAutolapSettings();

   Types$PbAutoLapSettingsOrBuilder getAutolapSettingsOrBuilder();

   Types$PbGPSSetting getGpsSetting();

   Types$PbHeartRateView getHeartRateView();

   Types$PbHeartTouch getHeartTouch();

   SportprofileDisplays$PbSirius2DisplaySettings getSirius2DisplaySettings();

   SportprofileDisplays$PbSirius2DisplaySettingsOrBuilder getSirius2DisplaySettingsOrBuilder();

   Types$PbTapButtonAction getTapButtonAction();

   boolean getVibration();

   boolean hasAltitudeSetting();

   boolean hasAutoStart();

   boolean hasAutolapSettings();

   boolean hasGpsSetting();

   boolean hasHeartRateView();

   boolean hasHeartTouch();

   boolean hasSirius2DisplaySettings();

   boolean hasTapButtonAction();

   boolean hasVibration();
}
