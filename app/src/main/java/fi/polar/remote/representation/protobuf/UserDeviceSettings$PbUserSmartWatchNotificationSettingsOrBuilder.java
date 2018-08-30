package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface UserDeviceSettings$PbUserSmartWatchNotificationSettingsOrBuilder extends MessageOrBuilder {
   UserDeviceSettings$PbDoNotDisturbSettings getDoNotDisturbSettings();

   UserDeviceSettings$PbDoNotDisturbSettingsOrBuilder getDoNotDisturbSettingsOrBuilder();

   boolean getEnabled();

   boolean getPreviewEnabled();

   boolean getSoundsEnabled();

   boolean hasDoNotDisturbSettings();

   boolean hasEnabled();

   boolean hasPreviewEnabled();

   boolean hasSoundsEnabled();
}
