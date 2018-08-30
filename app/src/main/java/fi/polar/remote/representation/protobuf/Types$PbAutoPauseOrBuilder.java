package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface Types$PbAutoPauseOrBuilder extends MessageOrBuilder {
   float getSpeedThreshold();

   Types$PbAutoPause$PbAutoPauseTrigger getTrigger();

   boolean hasSpeedThreshold();

   boolean hasTrigger();
}
