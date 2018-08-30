package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface UserDeviceSettings$PbUserDeviceDoNotDisturbSettingsOrBuilder extends MessageOrBuilder {
   boolean getDoNotDisturbOn();

   UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$PbDoNotDisturbSettingSource getSettingSource();

   boolean hasDoNotDisturbOn();

   boolean hasSettingSource();
}
