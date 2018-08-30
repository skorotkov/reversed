package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface UserDeviceSettings$PbIntervalTimerValueOrBuilder extends MessageOrBuilder {
   float getIntervalTimerDistance();

   Types$PbDuration getIntervalTimerDuration();

   Types$PbDurationOrBuilder getIntervalTimerDurationOrBuilder();

   UserDeviceSettings$PbIntervalTimerValue$PbIntervalTimerType getIntervalTimerType();

   boolean hasIntervalTimerDistance();

   boolean hasIntervalTimerDuration();

   boolean hasIntervalTimerType();
}
