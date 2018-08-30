package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface Zones$PbRecordedSpeedZoneOrBuilder extends MessageOrBuilder {
   float getDistanceInZone();

   Types$PbDuration getTimeInZone();

   Types$PbDurationOrBuilder getTimeInZoneOrBuilder();

   Structures$PbSpeedZone getZoneLimits();

   Structures$PbSpeedZoneOrBuilder getZoneLimitsOrBuilder();

   boolean hasDistanceInZone();

   boolean hasTimeInZone();

   boolean hasZoneLimits();
}
