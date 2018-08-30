package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface ExerciseStatistics$PbTrainingPeaksStatisticsOrBuilder extends MessageOrBuilder {
   float getIntensityFactor();

   int getNormalizedPower();

   float getTrainingStressScore();

   boolean hasIntensityFactor();

   boolean hasNormalizedPower();

   boolean hasTrainingStressScore();
}
