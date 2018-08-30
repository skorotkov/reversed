package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface UserDeviceSettings$PbUserMapSettingsOrBuilder extends MessageOrBuilder {
   boolean getAltitudeDataEnabled();

   boolean getBikeRouteDataEnabled();

   UserDeviceSettings$PbUserMapSettings$PbMapTopDirection getMapTopDirection();

   boolean hasAltitudeDataEnabled();

   boolean hasBikeRouteDataEnabled();

   boolean hasMapTopDirection();
}
