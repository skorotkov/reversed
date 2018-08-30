package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface ExerciseSamples$PbExerciseIntervalledSampleListOrBuilder extends MessageOrBuilder {
   float getAccelerationMadSamples(int var1);

   int getAccelerationMadSamplesCount();

   List getAccelerationMadSamplesList();

   ExerciseSamples$PbCalibrationValue getAltitudeCalibration(int var1);

   int getAltitudeCalibrationCount();

   List getAltitudeCalibrationList();

   ExerciseSamples$PbCalibrationValueOrBuilder getAltitudeCalibrationOrBuilder(int var1);

   List getAltitudeCalibrationOrBuilderList();

   float getAltitudeSamples(int var1);

   int getAltitudeSamplesCount();

   List getAltitudeSamplesList();

   int getCadenceSamples(int var1);

   int getCadenceSamplesCount();

   List getCadenceSamplesList();

   float getDistanceSamples(int var1);

   int getDistanceSamplesCount();

   List getDistanceSamplesList();

   float getForwardAcceleration(int var1);

   int getForwardAccelerationCount();

   List getForwardAccelerationList();

   int getHeartRateSamples(int var1);

   int getHeartRateSamplesCount();

   List getHeartRateSamplesList();

   ExerciseSamples$PbPowerMeasurements getLeftPedalPowerSamples(int var1);

   int getLeftPedalPowerSamplesCount();

   List getLeftPedalPowerSamplesList();

   ExerciseSamples$PbPowerMeasurementsOrBuilder getLeftPedalPowerSamplesOrBuilder(int var1);

   List getLeftPedalPowerSamplesOrBuilderList();

   ExerciseSamples$PbCalibrationValue getLeftPowerCalibration(int var1);

   int getLeftPowerCalibrationCount();

   List getLeftPowerCalibrationList();

   ExerciseSamples$PbCalibrationValueOrBuilder getLeftPowerCalibrationOrBuilder(int var1);

   List getLeftPowerCalibrationOrBuilderList();

   Types$PbMovingType getMovingTypeSamples(int var1);

   int getMovingTypeSamplesCount();

   List getMovingTypeSamplesList();

   int getRecordingIntervalMs();

   ExerciseSamples$PbPowerMeasurements getRightPedalPowerSamples(int var1);

   int getRightPedalPowerSamplesCount();

   List getRightPedalPowerSamplesList();

   ExerciseSamples$PbPowerMeasurementsOrBuilder getRightPedalPowerSamplesOrBuilder(int var1);

   List getRightPedalPowerSamplesOrBuilderList();

   ExerciseSamples$PbCalibrationValue getRightPowerCalibration(int var1);

   int getRightPowerCalibrationCount();

   List getRightPowerCalibrationList();

   ExerciseSamples$PbCalibrationValueOrBuilder getRightPowerCalibrationOrBuilder(int var1);

   List getRightPowerCalibrationOrBuilderList();

   ExerciseRRSamples$PbExerciseRRIntervals getRrSamples();

   ExerciseRRSamples$PbExerciseRRIntervalsOrBuilder getRrSamplesOrBuilder();

   Types$PbSampleSource getSampleSource(int var1);

   int getSampleSourceCount();

   List getSampleSourceList();

   Types$PbSampleSourceOrBuilder getSampleSourceOrBuilder(int var1);

   List getSampleSourceOrBuilderList();

   Types$PbSampleType getSampleType();

   float getSpeedSamples(int var1);

   int getSpeedSamplesCount();

   List getSpeedSamplesList();

   ExerciseSamples$PbCalibrationValue getStrideCalibration(int var1);

   int getStrideCalibrationCount();

   List getStrideCalibrationList();

   ExerciseSamples$PbCalibrationValueOrBuilder getStrideCalibrationOrBuilder(int var1);

   List getStrideCalibrationOrBuilderList();

   int getStrideLengthSamples(int var1);

   int getStrideLengthSamplesCount();

   List getStrideLengthSamplesList();

   float getTemperatureSamples(int var1);

   int getTemperatureSamplesCount();

   List getTemperatureSamplesList();

   boolean hasRecordingIntervalMs();

   boolean hasRrSamples();

   boolean hasSampleType();
}
