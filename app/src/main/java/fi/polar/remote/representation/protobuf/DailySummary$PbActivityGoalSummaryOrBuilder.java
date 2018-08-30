package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface DailySummary$PbActivityGoalSummaryOrBuilder extends MessageOrBuilder {
   float getAchievedActivity();

   float getActivityGoal();

   Types$PbDuration getTimeToGoJog();

   Types$PbDurationOrBuilder getTimeToGoJogOrBuilder();

   Types$PbDuration getTimeToGoUp();

   Types$PbDurationOrBuilder getTimeToGoUpOrBuilder();

   Types$PbDuration getTimeToGoWalk();

   Types$PbDurationOrBuilder getTimeToGoWalkOrBuilder();

   boolean hasAchievedActivity();

   boolean hasActivityGoal();

   boolean hasTimeToGoJog();

   boolean hasTimeToGoUp();

   boolean hasTimeToGoWalk();
}
