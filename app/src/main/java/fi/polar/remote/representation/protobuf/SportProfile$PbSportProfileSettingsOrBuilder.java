package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface SportProfile$PbSportProfileSettingsOrBuilder extends MessageOrBuilder {
   boolean getHrZoneLockAvailable();

   Types$PbAltitudeSetting getOBSOLETEAltitudeSetting();

   Types$PbAutoLapSettings getOBSOLETEAutolapSettings();

   Types$PbAutoLapSettingsOrBuilder getOBSOLETEAutolapSettingsOrBuilder();

   Types$PbGPSSetting getOBSOLETEGpsSetting();

   Types$PbHeartRateView getOBSOLETEHeartRateView();

   SportProfile$PbSportProfileSettings$PbPowerView getPowerView();

   boolean getPowerZoneLockAvailable();

   SportProfile$PbSportProfileSettings$PbRemoteButtonAction getRemoteButtonActions(int var1);

   int getRemoteButtonActionsCount();

   List getRemoteButtonActionsList();

   boolean getSensorBroadcastingHr();

   SportProfile$PbSportProfileSettings$PbSpeedView getSpeedView();

   boolean getSpeedZoneLockAvailable();

   SportProfile$PbSportProfileSettings$PbStrideSpeedSource getStrideSpeedSource();

   SportProfile$PbSportProfileSettings$PbSwimmingUnits getSwimmingUnits();

   SportProfile$PbTrainingReminder getTrainingReminder();

   SportProfile$PbTrainingReminderOrBuilder getTrainingReminderOrBuilder();

   boolean getVoiceGuidance();

   Types$PbVolume getVolume();

   Types$PbVolumeOrBuilder getVolumeOrBuilder();

   Structures$PbZones getZoneLimits();

   Structures$PbZonesOrBuilder getZoneLimitsOrBuilder();

   SportProfile$PbSportProfileSettings$PbZoneOptimizerSetting getZoneOptimizerSetting();

   boolean hasHrZoneLockAvailable();

   boolean hasOBSOLETEAltitudeSetting();

   boolean hasOBSOLETEAutolapSettings();

   boolean hasOBSOLETEGpsSetting();

   boolean hasOBSOLETEHeartRateView();

   boolean hasPowerView();

   boolean hasPowerZoneLockAvailable();

   boolean hasSensorBroadcastingHr();

   boolean hasSpeedView();

   boolean hasSpeedZoneLockAvailable();

   boolean hasStrideSpeedSource();

   boolean hasSwimmingUnits();

   boolean hasTrainingReminder();

   boolean hasVoiceGuidance();

   boolean hasVolume();

   boolean hasZoneLimits();

   boolean hasZoneOptimizerSetting();
}
