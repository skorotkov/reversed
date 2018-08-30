package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface DailySummary$PbDailySummaryOrBuilder extends MessageOrBuilder {
   int getActivityCalories();

   DailySummary$PbActivityClassTimes getActivityClassTimes();

   DailySummary$PbActivityClassTimesOrBuilder getActivityClassTimesOrBuilder();

   float getActivityDistance();

   DailySummary$PbActivityGoalSummary getActivityGoalSummary();

   DailySummary$PbActivityGoalSummaryOrBuilder getActivityGoalSummaryOrBuilder();

   int getBmrCalories();

   Types$PbDate getDate();

   Types$PbDateOrBuilder getDateOrBuilder();

   int getSteps();

   int getTrainingCalories();

   boolean hasActivityCalories();

   boolean hasActivityClassTimes();

   boolean hasActivityDistance();

   boolean hasActivityGoalSummary();

   boolean hasBmrCalories();

   boolean hasDate();

   boolean hasSteps();

   boolean hasTrainingCalories();
}
