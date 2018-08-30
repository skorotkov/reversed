package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface ExerciseSamples$PbPowerMeasurementsOrBuilder extends MessageOrBuilder {
   int getBottomDeadSpotAngle();

   int getCumulativeCrankRevolutions();

   int getCumulativeTimestamp();

   int getCurrentPower();

   int getForceMagnitudeMax();

   int getForceMagnitudeMaxAngle();

   int getForceMagnitudeMin();

   int getForceMagnitudeMinAngle();

   int getPedalPowerBalance();

   int getTopDeadSpotAngle();

   int getTorqueMagnitudeMax();

   int getTorqueMagnitudeMin();

   boolean hasBottomDeadSpotAngle();

   boolean hasCumulativeCrankRevolutions();

   boolean hasCumulativeTimestamp();

   boolean hasCurrentPower();

   boolean hasForceMagnitudeMax();

   boolean hasForceMagnitudeMaxAngle();

   boolean hasForceMagnitudeMin();

   boolean hasForceMagnitudeMinAngle();

   boolean hasPedalPowerBalance();

   boolean hasTopDeadSpotAngle();

   boolean hasTorqueMagnitudeMax();

   boolean hasTorqueMagnitudeMin();
}
