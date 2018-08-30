package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface Types$PbAutoLapSettingsOrBuilder extends MessageOrBuilder {
   Types$PbAutoLapSettings$PbAutomaticLap getAutomaticLap();

   float getAutomaticLapDistance();

   Types$PbDuration getAutomaticLapDuration();

   Types$PbDurationOrBuilder getAutomaticLapDurationOrBuilder();

   boolean hasAutomaticLap();

   boolean hasAutomaticLapDistance();

   boolean hasAutomaticLapDuration();
}
