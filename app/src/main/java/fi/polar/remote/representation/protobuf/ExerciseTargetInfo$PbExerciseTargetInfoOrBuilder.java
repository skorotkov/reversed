package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface ExerciseTargetInfo$PbExerciseTargetInfoOrBuilder extends MessageOrBuilder {
   Types$PbDuration getEndTime();

   Types$PbDurationOrBuilder getEndTimeOrBuilder();

   int getIndex();

   Structures$PbOneLineText getName();

   Structures$PbOneLineTextOrBuilder getNameOrBuilder();

   ExercisePhase$PbPhases getPhases();

   ExercisePhase$PbPhasesOrBuilder getPhasesOrBuilder();

   Structures$PbRouteId getRoute();

   Structures$PbRouteIdOrBuilder getRouteOrBuilder();

   Structures$PbSportIdentifier getSportId();

   Structures$PbSportIdentifierOrBuilder getSportIdOrBuilder();

   TrainingSessionTarget$PbSteadyRacePace getSteadyRacePace();

   TrainingSessionTarget$PbSteadyRacePaceOrBuilder getSteadyRacePaceOrBuilder();

   ExerciseTargetInfo$PbSteadyRacePaceResult getSteadyRacePaceResult();

   ExerciseTargetInfo$PbSteadyRacePaceResultOrBuilder getSteadyRacePaceResultOrBuilder();

   Structures$PbStravaSegmentTarget getStravaSegmentTarget();

   Structures$PbStravaSegmentTargetOrBuilder getStravaSegmentTargetOrBuilder();

   boolean getTargetReached();

   Types$PbExerciseTargetType getTargetType();

   Structures$PbVolumeTarget getVolumeTarget();

   Structures$PbVolumeTargetOrBuilder getVolumeTargetOrBuilder();

   boolean hasEndTime();

   boolean hasIndex();

   boolean hasName();

   boolean hasPhases();

   boolean hasRoute();

   boolean hasSportId();

   boolean hasSteadyRacePace();

   boolean hasSteadyRacePaceResult();

   boolean hasStravaSegmentTarget();

   boolean hasTargetReached();

   boolean hasTargetType();

   boolean hasVolumeTarget();
}
