package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface UserDeviceSettings$PbUserSafetyLightSettingsOrBuilder extends MessageOrBuilder {
   UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightActivationLevel getActivationLevel();

   UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightBlinkRate getBlinkRate();

   UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightMode getMode();

   boolean hasActivationLevel();

   boolean hasBlinkRate();

   boolean hasMode();
}
