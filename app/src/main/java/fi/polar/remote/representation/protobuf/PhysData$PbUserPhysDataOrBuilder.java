package fi.polar.remote.representation.protobuf;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface PhysData$PbUserPhysDataOrBuilder extends MessageOrBuilder {
   PhysData$PbUserHrAttribute getAerobicThreshold();

   PhysData$PbUserHrAttributeOrBuilder getAerobicThresholdOrBuilder();

   PhysData$PbUserHrAttribute getAnaerobicThreshold();

   PhysData$PbUserHrAttributeOrBuilder getAnaerobicThresholdOrBuilder();

   PhysData$PbUserBirthday getBirthday();

   PhysData$PbUserBirthdayOrBuilder getBirthdayOrBuilder();

   PhysData$PbUserFunctionalThresholdPower getFunctionalThresholdPower();

   PhysData$PbUserFunctionalThresholdPowerOrBuilder getFunctionalThresholdPowerOrBuilder();

   PhysData$PbUserGender getGender();

   PhysData$PbUserGenderOrBuilder getGenderOrBuilder();

   PhysData$PbUserHeight getHeight();

   PhysData$PbUserHeightOrBuilder getHeightOrBuilder();

   Types$PbSystemDateTime getLastModified();

   Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder();

   PhysData$PbUserHrAttribute getMaximumHeartrate();

   PhysData$PbUserHrAttributeOrBuilder getMaximumHeartrateOrBuilder();

   PhysData$PbUserHrAttribute getOBSOLETESittingHeartrate();

   PhysData$PbUserHrAttributeOrBuilder getOBSOLETESittingHeartrateOrBuilder();

   PhysData$PbSpeedCalibrationOffset getOBSOLETESpeedCalibrationOffset();

   PhysData$PbSpeedCalibrationOffsetOrBuilder getOBSOLETESpeedCalibrationOffsetOrBuilder();

   PhysData$PbUserHrAttribute getRestingHeartrate();

   PhysData$PbUserHrAttributeOrBuilder getRestingHeartrateOrBuilder();

   Types$PbSensorCalibrationOffset getSensorCalibrationOffset(int var1);

   int getSensorCalibrationOffsetCount();

   List getSensorCalibrationOffsetList();

   Types$PbSensorCalibrationOffsetOrBuilder getSensorCalibrationOffsetOrBuilder(int var1);

   List getSensorCalibrationOffsetOrBuilderList();

   PhysData$PbSleepGoal getSleepGoal();

   PhysData$PbSleepGoalOrBuilder getSleepGoalOrBuilder();

   Types$PbLocalDateTime getSnapshotStartTime();

   Types$PbLocalDateTimeOrBuilder getSnapshotStartTimeOrBuilder();

   PhysData$PbUserTrainingBackground getTrainingBackground();

   PhysData$PbUserTrainingBackgroundOrBuilder getTrainingBackgroundOrBuilder();

   PhysData$PbUserTypicalDay getTypicalDay();

   PhysData$PbUserTypicalDayOrBuilder getTypicalDayOrBuilder();

   PhysData$PbUserVo2Max getVo2Max();

   PhysData$PbUserVo2MaxOrBuilder getVo2MaxOrBuilder();

   PhysData$PbWeeklyRecoveryTimeSum getWeeklyRecoveryTimeSum();

   PhysData$PbWeeklyRecoveryTimeSumOrBuilder getWeeklyRecoveryTimeSumOrBuilder();

   PhysData$PbUserWeight getWeight();

   PhysData$PbUserWeightOrBuilder getWeightOrBuilder();

   boolean hasAerobicThreshold();

   boolean hasAnaerobicThreshold();

   boolean hasBirthday();

   boolean hasFunctionalThresholdPower();

   boolean hasGender();

   boolean hasHeight();

   boolean hasLastModified();

   boolean hasMaximumHeartrate();

   boolean hasOBSOLETESittingHeartrate();

   boolean hasOBSOLETESpeedCalibrationOffset();

   boolean hasRestingHeartrate();

   boolean hasSleepGoal();

   boolean hasSnapshotStartTime();

   boolean hasTrainingBackground();

   boolean hasTypicalDay();

   boolean hasVo2Max();

   boolean hasWeeklyRecoveryTimeSum();

   boolean hasWeight();
}
