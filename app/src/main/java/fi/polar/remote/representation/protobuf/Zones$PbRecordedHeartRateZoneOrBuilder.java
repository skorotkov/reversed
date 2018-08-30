package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface Zones$PbRecordedHeartRateZoneOrBuilder extends MessageOrBuilder {
   Types$PbDuration getInZone();

   Types$PbDurationOrBuilder getInZoneOrBuilder();

   Structures$PbHeartRateZone getZoneLimits();

   Structures$PbHeartRateZoneOrBuilder getZoneLimitsOrBuilder();

   boolean hasInZone();

   boolean hasZoneLimits();
}
