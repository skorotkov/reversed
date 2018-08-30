package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface ExercisePhase$PbPhaseOrBuilder extends MessageOrBuilder {
   ExercisePhase$PbPhase$PbPhaseChangeType getChange();

   ExercisePhase$PbPhaseGoal getGoal();

   ExercisePhase$PbPhaseGoalOrBuilder getGoalOrBuilder();

   ExercisePhase$PbPhaseIntensity getIntensity();

   ExercisePhase$PbPhaseIntensityOrBuilder getIntensityOrBuilder();

   int getJumpIndex();

   Structures$PbOneLineText getName();

   Structures$PbOneLineTextOrBuilder getNameOrBuilder();

   int getRepeatCount();

   boolean hasChange();

   boolean hasGoal();

   boolean hasIntensity();

   boolean hasJumpIndex();

   boolean hasName();

   boolean hasRepeatCount();
}
