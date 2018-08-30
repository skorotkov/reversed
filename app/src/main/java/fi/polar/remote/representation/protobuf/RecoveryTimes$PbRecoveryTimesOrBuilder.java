package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface RecoveryTimes$PbRecoveryTimesOrBuilder extends MessageOrBuilder {
   float getAccumulatedActivity();

   float getActivityCalories();

   float getBmrCalories();

   float getEndCarboConsumption();

   float getEndCumulativeMechanicalStimulus();

   float getEndGlycogenLeftPercent();

   float getEndProteinConsumption();

   float getExerciseCalories();

   float getLastHalfHourAvgMet();

   int getNumberOfExerciseHalfHours();

   float getRecoveryTimes(int var1);

   int getRecoveryTimesCount();

   List getRecoveryTimesList();

   Types$PbLocalDateTime getStartOfTimes();

   Types$PbLocalDateTimeOrBuilder getStartOfTimesOrBuilder();

   int getSteps();

   boolean hasAccumulatedActivity();

   boolean hasActivityCalories();

   boolean hasBmrCalories();

   boolean hasEndCarboConsumption();

   boolean hasEndCumulativeMechanicalStimulus();

   boolean hasEndGlycogenLeftPercent();

   boolean hasEndProteinConsumption();

   boolean hasExerciseCalories();

   boolean hasLastHalfHourAvgMet();

   boolean hasNumberOfExerciseHalfHours();

   boolean hasStartOfTimes();

   boolean hasSteps();
}
