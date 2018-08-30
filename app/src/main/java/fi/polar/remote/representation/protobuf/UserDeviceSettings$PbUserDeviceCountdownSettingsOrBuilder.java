package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface UserDeviceSettings$PbUserDeviceCountdownSettingsOrBuilder extends MessageOrBuilder {
   Types$PbDuration getCountdownTime();

   Types$PbDurationOrBuilder getCountdownTimeOrBuilder();

   boolean hasCountdownTime();
}
