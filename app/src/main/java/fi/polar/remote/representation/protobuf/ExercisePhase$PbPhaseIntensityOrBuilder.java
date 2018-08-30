package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;

public interface ExercisePhase$PbPhaseIntensityOrBuilder extends MessageOrBuilder {
   ExercisePhase$PbPhaseIntensity$IntensityZone getHeartRateZone();

   ExercisePhase$PbPhaseIntensity$IntensityZoneOrBuilder getHeartRateZoneOrBuilder();

   ExercisePhase$PbPhaseIntensity$PhaseIntensityType getIntensityType();

   ExercisePhase$PbPhaseIntensity$IntensityZone getPowerZone();

   ExercisePhase$PbPhaseIntensity$IntensityZoneOrBuilder getPowerZoneOrBuilder();

   ExercisePhase$PbPhaseIntensity$IntensityZone getSpeedZone();

   ExercisePhase$PbPhaseIntensity$IntensityZoneOrBuilder getSpeedZoneOrBuilder();

   boolean hasHeartRateZone();

   boolean hasIntensityType();

   boolean hasPowerZone();

   boolean hasSpeedZone();
}
