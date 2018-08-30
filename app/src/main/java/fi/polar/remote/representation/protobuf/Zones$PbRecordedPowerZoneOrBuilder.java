package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface Zones$PbRecordedPowerZoneOrBuilder extends MessageOrBuilder {
   Types$PbDuration getInZone();

   Types$PbDurationOrBuilder getInZoneOrBuilder();

   Structures$PbPowerZone getZoneLimits();

   Structures$PbPowerZoneOrBuilder getZoneLimitsOrBuilder();

   boolean hasInZone();

   boolean hasZoneLimits();
}
