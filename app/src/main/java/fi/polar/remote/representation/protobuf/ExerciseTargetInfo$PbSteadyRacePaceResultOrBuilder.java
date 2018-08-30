package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface ExerciseTargetInfo$PbSteadyRacePaceResultOrBuilder extends MessageOrBuilder {
   int getAverageHeartrate();

   float getAverageSpeed();

   Types$PbDuration getCompletedTime();

   Types$PbDurationOrBuilder getCompletedTimeOrBuilder();

   boolean hasAverageHeartrate();

   boolean hasAverageSpeed();

   boolean hasCompletedTime();
}
