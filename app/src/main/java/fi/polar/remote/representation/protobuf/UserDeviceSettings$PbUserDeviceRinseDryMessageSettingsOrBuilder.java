package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface UserDeviceSettings$PbUserDeviceRinseDryMessageSettingsOrBuilder extends MessageOrBuilder {
   Types$PbSystemDateTime getLastModified();

   Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder();

   int getMessageCount();

   boolean hasLastModified();

   boolean hasMessageCount();
}
