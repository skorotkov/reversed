package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface UserDeviceSettings$PbDoNotDisturbSettingsOrBuilder extends MessageOrBuilder {
   boolean getEnabled();

   Types$PbTime getEnd();

   Types$PbTimeOrBuilder getEndOrBuilder();

   Types$PbTime getStart();

   Types$PbTimeOrBuilder getStartOrBuilder();

   boolean hasEnabled();

   boolean hasEnd();

   boolean hasStart();
}
