package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface UserDeviceSettings$PbUserDeviceGeneralSettingsOrBuilder extends MessageOrBuilder {
   UserDeviceSettings$PbUserDeviceGeneralSettings$PbWatchFace getBackupWatchFace();

   boolean getBleConnectModeEnable();

   UserDeviceSettings$PbUserDeviceGeneralSettings$PbButtonLockMode getButtonLockMode();

   Types$PbVolume getButtonSoundVolume();

   Types$PbVolumeOrBuilder getButtonSoundVolumeOrBuilder();

   Types$PbDeviceLocation getDeviceLocation();

   boolean getExeviewInverted();

   UserDeviceSettings$PbUserDeviceGeneralSettings$PbFlightMode getFlightmode();

   UserDeviceSettings$PbUserDeviceGeneralSettings$PbInactivityAlert getInactivityAlert();

   Types$PbHandedness getOBSOLETEHandedness();

   int getOBSOLETETime2Offset();

   Types$PbTimeSelection getOBSOLETETimeSelection();

   UserDeviceSettings$PbUserDeviceGeneralSettings$PbTapButtonSensitivity getTapButtonSensitivity();

   boolean getVibrationMode();

   UserDeviceSettings$PbUserDeviceGeneralSettings$PbWatchFace getWatchFace();

   int getWatchFaceColor();

   boolean hasBackupWatchFace();

   boolean hasBleConnectModeEnable();

   boolean hasButtonLockMode();

   boolean hasButtonSoundVolume();

   boolean hasDeviceLocation();

   boolean hasExeviewInverted();

   boolean hasFlightmode();

   boolean hasInactivityAlert();

   boolean hasOBSOLETEHandedness();

   boolean hasOBSOLETETime2Offset();

   boolean hasOBSOLETETimeSelection();

   boolean hasTapButtonSensitivity();

   boolean hasVibrationMode();

   boolean hasWatchFace();

   boolean hasWatchFaceColor();
}
