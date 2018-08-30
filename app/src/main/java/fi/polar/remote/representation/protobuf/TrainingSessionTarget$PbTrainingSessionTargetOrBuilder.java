package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface TrainingSessionTarget$PbTrainingSessionTargetOrBuilder extends MessageOrBuilder {
   Structures$PbMultiLineText getDescription();

   Structures$PbMultiLineTextOrBuilder getDescriptionOrBuilder();

   Types$PbDuration getDuration();

   Types$PbDurationOrBuilder getDurationOrBuilder();

   Structures$PbEventId getEventId();

   Structures$PbEventIdOrBuilder getEventIdOrBuilder();

   TrainingSessionTarget$PbExerciseTarget getExerciseTarget(int var1);

   int getExerciseTargetCount();

   List getExerciseTargetList();

   TrainingSessionTarget$PbExerciseTargetOrBuilder getExerciseTargetOrBuilder(int var1);

   List getExerciseTargetOrBuilderList();

   Structures$PbOneLineText getName();

   Structures$PbOneLineTextOrBuilder getNameOrBuilder();

   Structures$PbSportIdentifier getSportId();

   Structures$PbSportIdentifierOrBuilder getSportIdOrBuilder();

   Types$PbLocalDateTime getStartTime();

   Types$PbLocalDateTimeOrBuilder getStartTimeOrBuilder();

   boolean getTargetDone();

   Structures$PbTrainingProgramId getTrainingProgramId();

   Structures$PbTrainingProgramIdOrBuilder getTrainingProgramIdOrBuilder();

   boolean hasDescription();

   boolean hasDuration();

   boolean hasEventId();

   boolean hasName();

   boolean hasSportId();

   boolean hasStartTime();

   boolean hasTargetDone();

   boolean hasTrainingProgramId();
}
