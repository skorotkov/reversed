package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface SportProfile$PbSprintDetectionOrBuilder extends MessageOrBuilder {
   SportProfile$PbSprintDetection$PbSprintDetectionSource getSource();

   float getSprintThresholdAcceleration();

   float getSprintThresholdSpeed();

   boolean hasSource();

   boolean hasSprintThresholdAcceleration();

   boolean hasSprintThresholdSpeed();
}
