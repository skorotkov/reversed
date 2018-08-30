package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface Types$PbLocationOrBuilder extends MessageOrBuilder {
   Types$PbLocation$Fix getFix();

   double getLatitude();

   double getLongitude();

   int getSatellites();

   Types$PbSystemDateTime getTimestamp();

   Types$PbSystemDateTimeOrBuilder getTimestampOrBuilder();

   boolean hasFix();

   boolean hasLatitude();

   boolean hasLongitude();

   boolean hasSatellites();

   boolean hasTimestamp();
}
