package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface Zones$PbRecordedFatFitZonesOrBuilder extends MessageOrBuilder {
   Types$PbDuration getFatTime();

   Types$PbDurationOrBuilder getFatTimeOrBuilder();

   int getFatfitLimit();

   Types$PbDuration getFitTime();

   Types$PbDurationOrBuilder getFitTimeOrBuilder();

   boolean hasFatTime();

   boolean hasFatfitLimit();

   boolean hasFitTime();
}
