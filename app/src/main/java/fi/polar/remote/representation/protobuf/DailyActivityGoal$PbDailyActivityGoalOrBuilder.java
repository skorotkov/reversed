package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface DailyActivityGoal$PbDailyActivityGoalOrBuilder extends MessageOrBuilder {
   DailyActivityGoal$PbActivityMetMinGoal getActivityMetminGoal();

   DailyActivityGoal$PbActivityMetMinGoalOrBuilder getActivityMetminGoalOrBuilder();

   DailyActivityGoal$PbDailyActivityGoal$PbActivityGoalType getGoalType();

   Types$PbSystemDateTime getLastModified();

   Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder();

   DailyActivityGoal$PbPolarBalanceGoal getPolarBalanceGoal();

   DailyActivityGoal$PbPolarBalanceGoalOrBuilder getPolarBalanceGoalOrBuilder();

   boolean hasActivityMetminGoal();

   boolean hasGoalType();

   boolean hasLastModified();

   boolean hasPolarBalanceGoal();
}
