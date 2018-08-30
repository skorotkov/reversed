package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface Structures$PbStravaSegmentTargetOrBuilder extends MessageOrBuilder {
   Structures$PbStravaSegmentTargets getStravaSegmentTargets();

   Structures$PbStravaSegmentTargetsOrBuilder getStravaSegmentTargetsOrBuilder();

   Structures$PbStravaSegmentTarget$PbStravaSegmentType getStravaSegmentType();

   boolean hasStravaSegmentTargets();

   boolean hasStravaSegmentType();
}
