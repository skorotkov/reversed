package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface TrainingSession$PbSessionHeartRateStatisticsOrBuilder extends MessageOrBuilder {
   int getAverage();

   int getMaximum();

   boolean hasAverage();

   boolean hasMaximum();
}
