package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface UserDeviceSettings$PbUserDeviceAlarmSettingsOrBuilder extends MessageOrBuilder {
   UserDeviceSettings$PbUserDeviceAlarmSettings$PbAlarmMode getAlarmMode();

   Types$PbTime getAlarmTime();

   Types$PbTimeOrBuilder getAlarmTimeOrBuilder();

   boolean hasAlarmMode();

   boolean hasAlarmTime();
}
