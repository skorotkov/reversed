package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface SportprofileAustinSettings$PbAustinSportProfileSettingsOrBuilder extends MessageOrBuilder {
   SportprofileDisplays$PbAlcorDisplaySettings getAlcorDisplaySettings();

   SportprofileDisplays$PbAlcorDisplaySettingsOrBuilder getAlcorDisplaySettingsOrBuilder();

   Types$PbAutoLapSettings getAutolapSettings();

   Types$PbAutoLapSettingsOrBuilder getAutolapSettingsOrBuilder();

   Types$PbGPSSetting getGpsSetting();

   Types$PbHeartRateView getHeartRateView();

   boolean getVibration();

   boolean hasAlcorDisplaySettings();

   boolean hasAutolapSettings();

   boolean hasGpsSetting();

   boolean hasHeartRateView();

   boolean hasVibration();
}
