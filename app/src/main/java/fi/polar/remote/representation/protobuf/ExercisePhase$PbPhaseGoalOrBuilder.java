package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface ExercisePhase$PbPhaseGoalOrBuilder extends MessageOrBuilder {
   float getDistance();

   Types$PbDuration getDuration();

   Types$PbDurationOrBuilder getDurationOrBuilder();

   ExercisePhase$PbPhaseGoal$PhaseGoalType getGoalType();

   int getHeartRate();

   boolean hasDistance();

   boolean hasDuration();

   boolean hasGoalType();

   boolean hasHeartRate();
}
