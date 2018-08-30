package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface SleepanalysisResult$PbSleepWakePhaseOrBuilder extends MessageOrBuilder {
   int getSecondsFromSleepStart();

   SleepanalysisResult$PbSleepWakeState getSleepwakeState();

   boolean hasSecondsFromSleepStart();

   boolean hasSleepwakeState();
}
