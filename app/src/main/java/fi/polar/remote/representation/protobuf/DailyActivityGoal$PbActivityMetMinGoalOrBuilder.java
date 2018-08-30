package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface DailyActivityGoal$PbActivityMetMinGoalOrBuilder extends MessageOrBuilder {
   float getActivityCutoffThreshold();

   float getGoal();

   boolean hasActivityCutoffThreshold();

   boolean hasGoal();
}
