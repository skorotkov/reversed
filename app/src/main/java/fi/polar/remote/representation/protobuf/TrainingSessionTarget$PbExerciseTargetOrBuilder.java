package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface TrainingSessionTarget$PbExerciseTargetOrBuilder extends MessageOrBuilder {
   ExercisePhase$PbPhases getPhases();

   ExercisePhase$PbPhasesOrBuilder getPhasesOrBuilder();

   Structures$PbRouteId getRoute();

   Structures$PbRouteIdOrBuilder getRouteOrBuilder();

   Structures$PbSportIdentifier getSportId();

   Structures$PbSportIdentifierOrBuilder getSportIdOrBuilder();

   TrainingSessionTarget$PbSteadyRacePace getSteadyRacePace();

   TrainingSessionTarget$PbSteadyRacePaceOrBuilder getSteadyRacePaceOrBuilder();

   Structures$PbStravaSegmentTarget getStravaSegmentTarget();

   Structures$PbStravaSegmentTargetOrBuilder getStravaSegmentTargetOrBuilder();

   Types$PbExerciseTargetType getTargetType();

   Structures$PbVolumeTarget getVolumeTarget();

   Structures$PbVolumeTargetOrBuilder getVolumeTargetOrBuilder();

   boolean hasPhases();

   boolean hasRoute();

   boolean hasSportId();

   boolean hasSteadyRacePace();

   boolean hasStravaSegmentTarget();

   boolean hasTargetType();

   boolean hasVolumeTarget();
}
