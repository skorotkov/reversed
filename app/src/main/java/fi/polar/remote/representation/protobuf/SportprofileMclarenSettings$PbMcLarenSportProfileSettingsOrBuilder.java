package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface SportprofileMclarenSettings$PbMcLarenSportProfileSettingsOrBuilder extends MessageOrBuilder {
   boolean getAutoStart();

   Types$PbAutoLapSettings getAutolapSettings();

   Types$PbAutoLapSettingsOrBuilder getAutolapSettingsOrBuilder();

   Types$PbGPSSetting getGpsSetting();

   Types$PbHeartRateView getHeartRateView();

   SportprofileDisplays$PbSirius2DisplaySettings getSirius2DisplaySettings();

   SportprofileDisplays$PbSirius2DisplaySettingsOrBuilder getSirius2DisplaySettingsOrBuilder();

   boolean hasAutoStart();

   boolean hasAutolapSettings();

   boolean hasGpsSetting();

   boolean hasHeartRateView();

   boolean hasSirius2DisplaySettings();
}
