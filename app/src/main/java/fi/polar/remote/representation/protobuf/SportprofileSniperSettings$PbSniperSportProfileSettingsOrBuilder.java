package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface SportprofileSniperSettings$PbSniperSportProfileSettingsOrBuilder extends MessageOrBuilder {
   Types$PbAltitudeSetting getAltitudeSetting();

   Types$PbAutoPause getAutoPause();

   Types$PbAutoPauseOrBuilder getAutoPauseOrBuilder();

   boolean getAutoStart();

   Types$PbAutoLapSettings getAutolapSettings();

   Types$PbAutoLapSettingsOrBuilder getAutolapSettingsOrBuilder();

   Types$PbGPSSetting getGpsSetting();

   Types$PbHeartRateView getHeartRateView();

   Types$PbHeartTouch getHeartTouch();

   SportprofileDisplays$PbSirius2DisplaySettings getSirius2DisplaySettings();

   SportprofileDisplays$PbSirius2DisplaySettingsOrBuilder getSirius2DisplaySettingsOrBuilder();

   boolean hasAltitudeSetting();

   boolean hasAutoPause();

   boolean hasAutoStart();

   boolean hasAutolapSettings();

   boolean hasGpsSetting();

   boolean hasHeartRateView();

   boolean hasHeartTouch();

   boolean hasSirius2DisplaySettings();
}
