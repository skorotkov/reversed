package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface DailyActivityGoal$PbPolarBalanceGoalOrBuilder extends MessageOrBuilder {
   float getFractionOfActivity();

   int getGoalDurationInWeeks();

   Types$PbDate getStartDate();

   Types$PbDateOrBuilder getStartDateOrBuilder();

   float getTargetWeight();

   boolean hasFractionOfActivity();

   boolean hasGoalDurationInWeeks();

   boolean hasStartDate();

   boolean hasTargetWeight();
}
