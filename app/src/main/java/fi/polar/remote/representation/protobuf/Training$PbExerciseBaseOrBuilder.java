package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface Training$PbExerciseBaseOrBuilder extends MessageOrBuilder {
   int getAccumulatedTorque();

   float getAscent();

   Types$PbFeatureType getAvailableSensorFeatures(int var1);

   int getAvailableSensorFeaturesCount();

   List getAvailableSensorFeaturesList();

   int getCalories();

   int getCyclingPowerEnergy();

   float getDescent();

   Types$PbDeviceLocation getDeviceLocation();

   float getDistance();

   Types$PbDuration getDuration();

   Types$PbDurationOrBuilder getDurationOrBuilder();

   Training$PbExerciseCounters getExerciseCounters();

   Training$PbExerciseCountersOrBuilder getExerciseCountersOrBuilder();

   double getLatitude();

   double getLongitude();

   float getOBSOLETESpeedCalibrationOffset();

   String getPlace();

   ByteString getPlaceBytes();

   Structures$PbRunningIndex getRunningIndex();

   Structures$PbRunningIndexOrBuilder getRunningIndexOrBuilder();

   Types$PbSensorCalibrationOffset getSensorCalibrationOffset(int var1);

   int getSensorCalibrationOffsetCount();

   List getSensorCalibrationOffsetList();

   Types$PbSensorCalibrationOffsetOrBuilder getSensorCalibrationOffsetOrBuilder(int var1);

   List getSensorCalibrationOffsetOrBuilderList();

   Structures$PbSportIdentifier getSport();

   Structures$PbSportIdentifierOrBuilder getSportOrBuilder();

   Types$PbLocalDateTime getStart();

   Types$PbLocalDateTimeOrBuilder getStartOrBuilder();

   Structures$PbTrainingLoad getTrainingLoad();

   Structures$PbTrainingLoadOrBuilder getTrainingLoadOrBuilder();

   float getWalkingDistance();

   Types$PbDuration getWalkingDuration();

   Types$PbDurationOrBuilder getWalkingDurationOrBuilder();

   boolean hasAccumulatedTorque();

   boolean hasAscent();

   boolean hasCalories();

   boolean hasCyclingPowerEnergy();

   boolean hasDescent();

   boolean hasDeviceLocation();

   boolean hasDistance();

   boolean hasDuration();

   boolean hasExerciseCounters();

   boolean hasLatitude();

   boolean hasLongitude();

   boolean hasOBSOLETESpeedCalibrationOffset();

   boolean hasPlace();

   boolean hasRunningIndex();

   boolean hasSport();

   boolean hasStart();

   boolean hasTrainingLoad();

   boolean hasWalkingDistance();

   boolean hasWalkingDuration();
}
