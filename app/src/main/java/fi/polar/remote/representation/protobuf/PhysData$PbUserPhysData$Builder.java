package fi.polar.remote.representation.protobuf;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PhysData$PbUserPhysData$Builder extends Builder implements PhysData$PbUserPhysDataOrBuilder {
   private SingleFieldBuilderV3 aerobicThresholdBuilder_;
   private PhysData$PbUserHrAttribute aerobicThreshold_;
   private SingleFieldBuilderV3 anaerobicThresholdBuilder_;
   private PhysData$PbUserHrAttribute anaerobicThreshold_;
   private SingleFieldBuilderV3 birthdayBuilder_;
   private PhysData$PbUserBirthday birthday_;
   private int bitField0_;
   private SingleFieldBuilderV3 functionalThresholdPowerBuilder_;
   private PhysData$PbUserFunctionalThresholdPower functionalThresholdPower_;
   private SingleFieldBuilderV3 genderBuilder_;
   private PhysData$PbUserGender gender_;
   private SingleFieldBuilderV3 heightBuilder_;
   private PhysData$PbUserHeight height_;
   private SingleFieldBuilderV3 lastModifiedBuilder_;
   private Types$PbSystemDateTime lastModified_;
   private SingleFieldBuilderV3 maximumHeartrateBuilder_;
   private PhysData$PbUserHrAttribute maximumHeartrate_;
   private SingleFieldBuilderV3 oBSOLETESittingHeartrateBuilder_;
   private PhysData$PbUserHrAttribute oBSOLETESittingHeartrate_;
   private SingleFieldBuilderV3 oBSOLETESpeedCalibrationOffsetBuilder_;
   private PhysData$PbSpeedCalibrationOffset oBSOLETESpeedCalibrationOffset_;
   private SingleFieldBuilderV3 restingHeartrateBuilder_;
   private PhysData$PbUserHrAttribute restingHeartrate_;
   private RepeatedFieldBuilderV3 sensorCalibrationOffsetBuilder_;
   private List sensorCalibrationOffset_;
   private SingleFieldBuilderV3 sleepGoalBuilder_;
   private PhysData$PbSleepGoal sleepGoal_;
   private SingleFieldBuilderV3 snapshotStartTimeBuilder_;
   private Types$PbLocalDateTime snapshotStartTime_;
   private SingleFieldBuilderV3 trainingBackgroundBuilder_;
   private PhysData$PbUserTrainingBackground trainingBackground_;
   private SingleFieldBuilderV3 typicalDayBuilder_;
   private PhysData$PbUserTypicalDay typicalDay_;
   private SingleFieldBuilderV3 vo2MaxBuilder_;
   private PhysData$PbUserVo2Max vo2Max_;
   private SingleFieldBuilderV3 weeklyRecoveryTimeSumBuilder_;
   private PhysData$PbWeeklyRecoveryTimeSum weeklyRecoveryTimeSum_;
   private SingleFieldBuilderV3 weightBuilder_;
   private PhysData$PbUserWeight weight_;

   private PhysData$PbUserPhysData$Builder() {
      this.birthday_ = null;
      this.gender_ = null;
      this.weight_ = null;
      this.height_ = null;
      this.maximumHeartrate_ = null;
      this.restingHeartrate_ = null;
      this.oBSOLETESittingHeartrate_ = null;
      this.aerobicThreshold_ = null;
      this.anaerobicThreshold_ = null;
      this.vo2Max_ = null;
      this.trainingBackground_ = null;
      this.typicalDay_ = null;
      this.weeklyRecoveryTimeSum_ = null;
      this.oBSOLETESpeedCalibrationOffset_ = null;
      this.functionalThresholdPower_ = null;
      this.sensorCalibrationOffset_ = Collections.emptyList();
      this.sleepGoal_ = null;
      this.lastModified_ = null;
      this.snapshotStartTime_ = null;
      this.maybeForceBuilderInitialization();
   }

   private PhysData$PbUserPhysData$Builder(BuilderParent var1) {
      super(var1);
      this.birthday_ = null;
      this.gender_ = null;
      this.weight_ = null;
      this.height_ = null;
      this.maximumHeartrate_ = null;
      this.restingHeartrate_ = null;
      this.oBSOLETESittingHeartrate_ = null;
      this.aerobicThreshold_ = null;
      this.anaerobicThreshold_ = null;
      this.vo2Max_ = null;
      this.trainingBackground_ = null;
      this.typicalDay_ = null;
      this.weeklyRecoveryTimeSum_ = null;
      this.oBSOLETESpeedCalibrationOffset_ = null;
      this.functionalThresholdPower_ = null;
      this.sensorCalibrationOffset_ = Collections.emptyList();
      this.sleepGoal_ = null;
      this.lastModified_ = null;
      this.snapshotStartTime_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PhysData$PbUserPhysData$Builder(BuilderParent var1, PhysData$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PhysData$PbUserPhysData$Builder(PhysData$1 var1) {
      this();
   }

   private void ensureSensorCalibrationOffsetIsMutable() {
      if ((this.bitField0_ & '耀') != 32768) {
         this.sensorCalibrationOffset_ = new ArrayList(this.sensorCalibrationOffset_);
         this.bitField0_ |= 32768;
      }

   }

   private SingleFieldBuilderV3 getAerobicThresholdFieldBuilder() {
      if (this.aerobicThresholdBuilder_ == null) {
         this.aerobicThresholdBuilder_ = new SingleFieldBuilderV3(this.getAerobicThreshold(), this.getParentForChildren(), this.isClean());
         this.aerobicThreshold_ = null;
      }

      return this.aerobicThresholdBuilder_;
   }

   private SingleFieldBuilderV3 getAnaerobicThresholdFieldBuilder() {
      if (this.anaerobicThresholdBuilder_ == null) {
         this.anaerobicThresholdBuilder_ = new SingleFieldBuilderV3(this.getAnaerobicThreshold(), this.getParentForChildren(), this.isClean());
         this.anaerobicThreshold_ = null;
      }

      return this.anaerobicThresholdBuilder_;
   }

   private SingleFieldBuilderV3 getBirthdayFieldBuilder() {
      if (this.birthdayBuilder_ == null) {
         this.birthdayBuilder_ = new SingleFieldBuilderV3(this.getBirthday(), this.getParentForChildren(), this.isClean());
         this.birthday_ = null;
      }

      return this.birthdayBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return PhysData.y();
   }

   private SingleFieldBuilderV3 getFunctionalThresholdPowerFieldBuilder() {
      if (this.functionalThresholdPowerBuilder_ == null) {
         this.functionalThresholdPowerBuilder_ = new SingleFieldBuilderV3(this.getFunctionalThresholdPower(), this.getParentForChildren(), this.isClean());
         this.functionalThresholdPower_ = null;
      }

      return this.functionalThresholdPowerBuilder_;
   }

   private SingleFieldBuilderV3 getGenderFieldBuilder() {
      if (this.genderBuilder_ == null) {
         this.genderBuilder_ = new SingleFieldBuilderV3(this.getGender(), this.getParentForChildren(), this.isClean());
         this.gender_ = null;
      }

      return this.genderBuilder_;
   }

   private SingleFieldBuilderV3 getHeightFieldBuilder() {
      if (this.heightBuilder_ == null) {
         this.heightBuilder_ = new SingleFieldBuilderV3(this.getHeight(), this.getParentForChildren(), this.isClean());
         this.height_ = null;
      }

      return this.heightBuilder_;
   }

   private SingleFieldBuilderV3 getLastModifiedFieldBuilder() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModifiedBuilder_ = new SingleFieldBuilderV3(this.getLastModified(), this.getParentForChildren(), this.isClean());
         this.lastModified_ = null;
      }

      return this.lastModifiedBuilder_;
   }

   private SingleFieldBuilderV3 getMaximumHeartrateFieldBuilder() {
      if (this.maximumHeartrateBuilder_ == null) {
         this.maximumHeartrateBuilder_ = new SingleFieldBuilderV3(this.getMaximumHeartrate(), this.getParentForChildren(), this.isClean());
         this.maximumHeartrate_ = null;
      }

      return this.maximumHeartrateBuilder_;
   }

   private SingleFieldBuilderV3 getOBSOLETESittingHeartrateFieldBuilder() {
      if (this.oBSOLETESittingHeartrateBuilder_ == null) {
         this.oBSOLETESittingHeartrateBuilder_ = new SingleFieldBuilderV3(this.getOBSOLETESittingHeartrate(), this.getParentForChildren(), this.isClean());
         this.oBSOLETESittingHeartrate_ = null;
      }

      return this.oBSOLETESittingHeartrateBuilder_;
   }

   private SingleFieldBuilderV3 getOBSOLETESpeedCalibrationOffsetFieldBuilder() {
      if (this.oBSOLETESpeedCalibrationOffsetBuilder_ == null) {
         this.oBSOLETESpeedCalibrationOffsetBuilder_ = new SingleFieldBuilderV3(this.getOBSOLETESpeedCalibrationOffset(), this.getParentForChildren(), this.isClean());
         this.oBSOLETESpeedCalibrationOffset_ = null;
      }

      return this.oBSOLETESpeedCalibrationOffsetBuilder_;
   }

   private SingleFieldBuilderV3 getRestingHeartrateFieldBuilder() {
      if (this.restingHeartrateBuilder_ == null) {
         this.restingHeartrateBuilder_ = new SingleFieldBuilderV3(this.getRestingHeartrate(), this.getParentForChildren(), this.isClean());
         this.restingHeartrate_ = null;
      }

      return this.restingHeartrateBuilder_;
   }

   private RepeatedFieldBuilderV3 getSensorCalibrationOffsetFieldBuilder() {
      if (this.sensorCalibrationOffsetBuilder_ == null) {
         List var1 = this.sensorCalibrationOffset_;
         boolean var2;
         if ((this.bitField0_ & '耀') == 32768) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.sensorCalibrationOffsetBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.sensorCalibrationOffset_ = null;
      }

      return this.sensorCalibrationOffsetBuilder_;
   }

   private SingleFieldBuilderV3 getSleepGoalFieldBuilder() {
      if (this.sleepGoalBuilder_ == null) {
         this.sleepGoalBuilder_ = new SingleFieldBuilderV3(this.getSleepGoal(), this.getParentForChildren(), this.isClean());
         this.sleepGoal_ = null;
      }

      return this.sleepGoalBuilder_;
   }

   private SingleFieldBuilderV3 getSnapshotStartTimeFieldBuilder() {
      if (this.snapshotStartTimeBuilder_ == null) {
         this.snapshotStartTimeBuilder_ = new SingleFieldBuilderV3(this.getSnapshotStartTime(), this.getParentForChildren(), this.isClean());
         this.snapshotStartTime_ = null;
      }

      return this.snapshotStartTimeBuilder_;
   }

   private SingleFieldBuilderV3 getTrainingBackgroundFieldBuilder() {
      if (this.trainingBackgroundBuilder_ == null) {
         this.trainingBackgroundBuilder_ = new SingleFieldBuilderV3(this.getTrainingBackground(), this.getParentForChildren(), this.isClean());
         this.trainingBackground_ = null;
      }

      return this.trainingBackgroundBuilder_;
   }

   private SingleFieldBuilderV3 getTypicalDayFieldBuilder() {
      if (this.typicalDayBuilder_ == null) {
         this.typicalDayBuilder_ = new SingleFieldBuilderV3(this.getTypicalDay(), this.getParentForChildren(), this.isClean());
         this.typicalDay_ = null;
      }

      return this.typicalDayBuilder_;
   }

   private SingleFieldBuilderV3 getVo2MaxFieldBuilder() {
      if (this.vo2MaxBuilder_ == null) {
         this.vo2MaxBuilder_ = new SingleFieldBuilderV3(this.getVo2Max(), this.getParentForChildren(), this.isClean());
         this.vo2Max_ = null;
      }

      return this.vo2MaxBuilder_;
   }

   private SingleFieldBuilderV3 getWeeklyRecoveryTimeSumFieldBuilder() {
      if (this.weeklyRecoveryTimeSumBuilder_ == null) {
         this.weeklyRecoveryTimeSumBuilder_ = new SingleFieldBuilderV3(this.getWeeklyRecoveryTimeSum(), this.getParentForChildren(), this.isClean());
         this.weeklyRecoveryTimeSum_ = null;
      }

      return this.weeklyRecoveryTimeSumBuilder_;
   }

   private SingleFieldBuilderV3 getWeightFieldBuilder() {
      if (this.weightBuilder_ == null) {
         this.weightBuilder_ = new SingleFieldBuilderV3(this.getWeight(), this.getParentForChildren(), this.isClean());
         this.weight_ = null;
      }

      return this.weightBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (PhysData$PbUserPhysData.b()) {
         this.getBirthdayFieldBuilder();
         this.getGenderFieldBuilder();
         this.getWeightFieldBuilder();
         this.getHeightFieldBuilder();
         this.getMaximumHeartrateFieldBuilder();
         this.getRestingHeartrateFieldBuilder();
         this.getOBSOLETESittingHeartrateFieldBuilder();
         this.getAerobicThresholdFieldBuilder();
         this.getAnaerobicThresholdFieldBuilder();
         this.getVo2MaxFieldBuilder();
         this.getTrainingBackgroundFieldBuilder();
         this.getTypicalDayFieldBuilder();
         this.getWeeklyRecoveryTimeSumFieldBuilder();
         this.getOBSOLETESpeedCalibrationOffsetFieldBuilder();
         this.getFunctionalThresholdPowerFieldBuilder();
         this.getSensorCalibrationOffsetFieldBuilder();
         this.getSleepGoalFieldBuilder();
         this.getLastModifiedFieldBuilder();
         this.getSnapshotStartTimeFieldBuilder();
      }

   }

   public PhysData$PbUserPhysData$Builder addAllSensorCalibrationOffset(Iterable var1) {
      if (this.sensorCalibrationOffsetBuilder_ == null) {
         this.ensureSensorCalibrationOffsetIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.sensorCalibrationOffset_);
         this.onChanged();
      } else {
         this.sensorCalibrationOffsetBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public PhysData$PbUserPhysData$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PhysData$PbUserPhysData$Builder)super.addRepeatedField(var1, var2);
   }

   public PhysData$PbUserPhysData$Builder addSensorCalibrationOffset(int var1, Types$PbSensorCalibrationOffset$Builder var2) {
      if (this.sensorCalibrationOffsetBuilder_ == null) {
         this.ensureSensorCalibrationOffsetIsMutable();
         this.sensorCalibrationOffset_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.sensorCalibrationOffsetBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public PhysData$PbUserPhysData$Builder addSensorCalibrationOffset(int var1, Types$PbSensorCalibrationOffset var2) {
      if (this.sensorCalibrationOffsetBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureSensorCalibrationOffsetIsMutable();
         this.sensorCalibrationOffset_.add(var1, var2);
         this.onChanged();
      } else {
         this.sensorCalibrationOffsetBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public PhysData$PbUserPhysData$Builder addSensorCalibrationOffset(Types$PbSensorCalibrationOffset$Builder var1) {
      if (this.sensorCalibrationOffsetBuilder_ == null) {
         this.ensureSensorCalibrationOffsetIsMutable();
         this.sensorCalibrationOffset_.add(var1.build());
         this.onChanged();
      } else {
         this.sensorCalibrationOffsetBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public PhysData$PbUserPhysData$Builder addSensorCalibrationOffset(Types$PbSensorCalibrationOffset var1) {
      if (this.sensorCalibrationOffsetBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureSensorCalibrationOffsetIsMutable();
         this.sensorCalibrationOffset_.add(var1);
         this.onChanged();
      } else {
         this.sensorCalibrationOffsetBuilder_.addMessage(var1);
      }

      return this;
   }

   public Types$PbSensorCalibrationOffset$Builder addSensorCalibrationOffsetBuilder() {
      return (Types$PbSensorCalibrationOffset$Builder)this.getSensorCalibrationOffsetFieldBuilder().addBuilder(Types$PbSensorCalibrationOffset.getDefaultInstance());
   }

   public Types$PbSensorCalibrationOffset$Builder addSensorCalibrationOffsetBuilder(int var1) {
      return (Types$PbSensorCalibrationOffset$Builder)this.getSensorCalibrationOffsetFieldBuilder().addBuilder(var1, Types$PbSensorCalibrationOffset.getDefaultInstance());
   }

   public PhysData$PbUserPhysData build() {
      PhysData$PbUserPhysData var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PhysData$PbUserPhysData buildPartial() {
      PhysData$PbUserPhysData var1 = new PhysData$PbUserPhysData(this, (PhysData$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.birthdayBuilder_ == null) {
         PhysData$PbUserPhysData.a(var1, this.birthday_);
      } else {
         PhysData$PbUserPhysData.a(var1, (PhysData$PbUserBirthday)this.birthdayBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.genderBuilder_ == null) {
         PhysData$PbUserPhysData.a(var1, this.gender_);
      } else {
         PhysData$PbUserPhysData.a(var1, (PhysData$PbUserGender)this.genderBuilder_.build());
      }

      int var6 = var4;
      if ((var2 & 4) == 4) {
         var6 = var4 | 4;
      }

      if (this.weightBuilder_ == null) {
         PhysData$PbUserPhysData.a(var1, this.weight_);
      } else {
         PhysData$PbUserPhysData.a(var1, (PhysData$PbUserWeight)this.weightBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 8) == 8) {
         var4 = var6 | 8;
      }

      if (this.heightBuilder_ == null) {
         PhysData$PbUserPhysData.a(var1, this.height_);
      } else {
         PhysData$PbUserPhysData.a(var1, (PhysData$PbUserHeight)this.heightBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 16) == 16) {
         var6 = var4 | 16;
      }

      if (this.maximumHeartrateBuilder_ == null) {
         PhysData$PbUserPhysData.a(var1, this.maximumHeartrate_);
      } else {
         PhysData$PbUserPhysData.a(var1, (PhysData$PbUserHrAttribute)this.maximumHeartrateBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 32) == 32) {
         var4 = var6 | 32;
      }

      if (this.restingHeartrateBuilder_ == null) {
         PhysData$PbUserPhysData.b(var1, this.restingHeartrate_);
      } else {
         PhysData$PbUserPhysData.b(var1, (PhysData$PbUserHrAttribute)this.restingHeartrateBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 64) == 64) {
         var6 = var4 | 64;
      }

      if (this.oBSOLETESittingHeartrateBuilder_ == null) {
         PhysData$PbUserPhysData.c(var1, this.oBSOLETESittingHeartrate_);
      } else {
         PhysData$PbUserPhysData.c(var1, (PhysData$PbUserHrAttribute)this.oBSOLETESittingHeartrateBuilder_.build());
      }

      int var5 = var6;
      if ((var2 & 128) == 128) {
         var5 = var6 | 128;
      }

      if (this.aerobicThresholdBuilder_ == null) {
         PhysData$PbUserPhysData.d(var1, this.aerobicThreshold_);
      } else {
         PhysData$PbUserPhysData.d(var1, (PhysData$PbUserHrAttribute)this.aerobicThresholdBuilder_.build());
      }

      var4 = var5;
      if ((var2 & 256) == 256) {
         var4 = var5 | 256;
      }

      if (this.anaerobicThresholdBuilder_ == null) {
         PhysData$PbUserPhysData.e(var1, this.anaerobicThreshold_);
      } else {
         PhysData$PbUserPhysData.e(var1, (PhysData$PbUserHrAttribute)this.anaerobicThresholdBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 512) == 512) {
         var6 = var4 | 512;
      }

      if (this.vo2MaxBuilder_ == null) {
         PhysData$PbUserPhysData.a(var1, this.vo2Max_);
      } else {
         PhysData$PbUserPhysData.a(var1, (PhysData$PbUserVo2Max)this.vo2MaxBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 1024) == 1024) {
         var4 = var6 | 1024;
      }

      if (this.trainingBackgroundBuilder_ == null) {
         PhysData$PbUserPhysData.a(var1, this.trainingBackground_);
      } else {
         PhysData$PbUserPhysData.a(var1, (PhysData$PbUserTrainingBackground)this.trainingBackgroundBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 2048) == 2048) {
         var6 = var4 | 2048;
      }

      if (this.typicalDayBuilder_ == null) {
         PhysData$PbUserPhysData.a(var1, this.typicalDay_);
      } else {
         PhysData$PbUserPhysData.a(var1, (PhysData$PbUserTypicalDay)this.typicalDayBuilder_.build());
      }

      var5 = var6;
      if ((var2 & 4096) == 4096) {
         var5 = var6 | 4096;
      }

      if (this.weeklyRecoveryTimeSumBuilder_ == null) {
         PhysData$PbUserPhysData.a(var1, this.weeklyRecoveryTimeSum_);
      } else {
         PhysData$PbUserPhysData.a(var1, (PhysData$PbWeeklyRecoveryTimeSum)this.weeklyRecoveryTimeSumBuilder_.build());
      }

      var4 = var5;
      if ((var2 & 8192) == 8192) {
         var4 = var5 | 8192;
      }

      if (this.oBSOLETESpeedCalibrationOffsetBuilder_ == null) {
         PhysData$PbUserPhysData.a(var1, this.oBSOLETESpeedCalibrationOffset_);
      } else {
         PhysData$PbUserPhysData.a(var1, (PhysData$PbSpeedCalibrationOffset)this.oBSOLETESpeedCalibrationOffsetBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 16384) == 16384) {
         var6 = var4 | 16384;
      }

      if (this.functionalThresholdPowerBuilder_ == null) {
         PhysData$PbUserPhysData.a(var1, this.functionalThresholdPower_);
      } else {
         PhysData$PbUserPhysData.a(var1, (PhysData$PbUserFunctionalThresholdPower)this.functionalThresholdPowerBuilder_.build());
      }

      if (this.sensorCalibrationOffsetBuilder_ == null) {
         if ((this.bitField0_ & '耀') == 32768) {
            this.sensorCalibrationOffset_ = Collections.unmodifiableList(this.sensorCalibrationOffset_);
            this.bitField0_ &= -32769;
         }

         PhysData$PbUserPhysData.a(var1, this.sensorCalibrationOffset_);
      } else {
         PhysData$PbUserPhysData.a(var1, this.sensorCalibrationOffsetBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 65536) == 65536) {
         var4 = var6 | '耀';
      }

      if (this.sleepGoalBuilder_ == null) {
         PhysData$PbUserPhysData.a(var1, this.sleepGoal_);
      } else {
         PhysData$PbUserPhysData.a(var1, (PhysData$PbSleepGoal)this.sleepGoalBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 131072) == 131072) {
         var6 = var4 | 65536;
      }

      if (this.lastModifiedBuilder_ == null) {
         PhysData$PbUserPhysData.a(var1, this.lastModified_);
      } else {
         PhysData$PbUserPhysData.a(var1, (Types$PbSystemDateTime)this.lastModifiedBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 262144) == 262144) {
         var4 = var6 | 131072;
      }

      if (this.snapshotStartTimeBuilder_ == null) {
         PhysData$PbUserPhysData.a(var1, this.snapshotStartTime_);
      } else {
         PhysData$PbUserPhysData.a(var1, (Types$PbLocalDateTime)this.snapshotStartTimeBuilder_.build());
      }

      PhysData$PbUserPhysData.a(var1, var4);
      this.onBuilt();
      return var1;
   }

   public PhysData$PbUserPhysData$Builder clear() {
      super.clear();
      if (this.birthdayBuilder_ == null) {
         this.birthday_ = null;
      } else {
         this.birthdayBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.genderBuilder_ == null) {
         this.gender_ = null;
      } else {
         this.genderBuilder_.clear();
      }

      this.bitField0_ &= -3;
      if (this.weightBuilder_ == null) {
         this.weight_ = null;
      } else {
         this.weightBuilder_.clear();
      }

      this.bitField0_ &= -5;
      if (this.heightBuilder_ == null) {
         this.height_ = null;
      } else {
         this.heightBuilder_.clear();
      }

      this.bitField0_ &= -9;
      if (this.maximumHeartrateBuilder_ == null) {
         this.maximumHeartrate_ = null;
      } else {
         this.maximumHeartrateBuilder_.clear();
      }

      this.bitField0_ &= -17;
      if (this.restingHeartrateBuilder_ == null) {
         this.restingHeartrate_ = null;
      } else {
         this.restingHeartrateBuilder_.clear();
      }

      this.bitField0_ &= -33;
      if (this.oBSOLETESittingHeartrateBuilder_ == null) {
         this.oBSOLETESittingHeartrate_ = null;
      } else {
         this.oBSOLETESittingHeartrateBuilder_.clear();
      }

      this.bitField0_ &= -65;
      if (this.aerobicThresholdBuilder_ == null) {
         this.aerobicThreshold_ = null;
      } else {
         this.aerobicThresholdBuilder_.clear();
      }

      this.bitField0_ &= -129;
      if (this.anaerobicThresholdBuilder_ == null) {
         this.anaerobicThreshold_ = null;
      } else {
         this.anaerobicThresholdBuilder_.clear();
      }

      this.bitField0_ &= -257;
      if (this.vo2MaxBuilder_ == null) {
         this.vo2Max_ = null;
      } else {
         this.vo2MaxBuilder_.clear();
      }

      this.bitField0_ &= -513;
      if (this.trainingBackgroundBuilder_ == null) {
         this.trainingBackground_ = null;
      } else {
         this.trainingBackgroundBuilder_.clear();
      }

      this.bitField0_ &= -1025;
      if (this.typicalDayBuilder_ == null) {
         this.typicalDay_ = null;
      } else {
         this.typicalDayBuilder_.clear();
      }

      this.bitField0_ &= -2049;
      if (this.weeklyRecoveryTimeSumBuilder_ == null) {
         this.weeklyRecoveryTimeSum_ = null;
      } else {
         this.weeklyRecoveryTimeSumBuilder_.clear();
      }

      this.bitField0_ &= -4097;
      if (this.oBSOLETESpeedCalibrationOffsetBuilder_ == null) {
         this.oBSOLETESpeedCalibrationOffset_ = null;
      } else {
         this.oBSOLETESpeedCalibrationOffsetBuilder_.clear();
      }

      this.bitField0_ &= -8193;
      if (this.functionalThresholdPowerBuilder_ == null) {
         this.functionalThresholdPower_ = null;
      } else {
         this.functionalThresholdPowerBuilder_.clear();
      }

      this.bitField0_ &= -16385;
      if (this.sensorCalibrationOffsetBuilder_ == null) {
         this.sensorCalibrationOffset_ = Collections.emptyList();
         this.bitField0_ &= -32769;
      } else {
         this.sensorCalibrationOffsetBuilder_.clear();
      }

      if (this.sleepGoalBuilder_ == null) {
         this.sleepGoal_ = null;
      } else {
         this.sleepGoalBuilder_.clear();
      }

      this.bitField0_ &= -65537;
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -131073;
      if (this.snapshotStartTimeBuilder_ == null) {
         this.snapshotStartTime_ = null;
      } else {
         this.snapshotStartTimeBuilder_.clear();
      }

      this.bitField0_ &= -262145;
      return this;
   }

   public PhysData$PbUserPhysData$Builder clearAerobicThreshold() {
      if (this.aerobicThresholdBuilder_ == null) {
         this.aerobicThreshold_ = null;
         this.onChanged();
      } else {
         this.aerobicThresholdBuilder_.clear();
      }

      this.bitField0_ &= -129;
      return this;
   }

   public PhysData$PbUserPhysData$Builder clearAnaerobicThreshold() {
      if (this.anaerobicThresholdBuilder_ == null) {
         this.anaerobicThreshold_ = null;
         this.onChanged();
      } else {
         this.anaerobicThresholdBuilder_.clear();
      }

      this.bitField0_ &= -257;
      return this;
   }

   public PhysData$PbUserPhysData$Builder clearBirthday() {
      if (this.birthdayBuilder_ == null) {
         this.birthday_ = null;
         this.onChanged();
      } else {
         this.birthdayBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public PhysData$PbUserPhysData$Builder clearField(FieldDescriptor var1) {
      return (PhysData$PbUserPhysData$Builder)super.clearField(var1);
   }

   public PhysData$PbUserPhysData$Builder clearFunctionalThresholdPower() {
      if (this.functionalThresholdPowerBuilder_ == null) {
         this.functionalThresholdPower_ = null;
         this.onChanged();
      } else {
         this.functionalThresholdPowerBuilder_.clear();
      }

      this.bitField0_ &= -16385;
      return this;
   }

   public PhysData$PbUserPhysData$Builder clearGender() {
      if (this.genderBuilder_ == null) {
         this.gender_ = null;
         this.onChanged();
      } else {
         this.genderBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public PhysData$PbUserPhysData$Builder clearHeight() {
      if (this.heightBuilder_ == null) {
         this.height_ = null;
         this.onChanged();
      } else {
         this.heightBuilder_.clear();
      }

      this.bitField0_ &= -9;
      return this;
   }

   public PhysData$PbUserPhysData$Builder clearLastModified() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -131073;
      return this;
   }

   public PhysData$PbUserPhysData$Builder clearMaximumHeartrate() {
      if (this.maximumHeartrateBuilder_ == null) {
         this.maximumHeartrate_ = null;
         this.onChanged();
      } else {
         this.maximumHeartrateBuilder_.clear();
      }

      this.bitField0_ &= -17;
      return this;
   }

   public PhysData$PbUserPhysData$Builder clearOBSOLETESittingHeartrate() {
      if (this.oBSOLETESittingHeartrateBuilder_ == null) {
         this.oBSOLETESittingHeartrate_ = null;
         this.onChanged();
      } else {
         this.oBSOLETESittingHeartrateBuilder_.clear();
      }

      this.bitField0_ &= -65;
      return this;
   }

   public PhysData$PbUserPhysData$Builder clearOBSOLETESpeedCalibrationOffset() {
      if (this.oBSOLETESpeedCalibrationOffsetBuilder_ == null) {
         this.oBSOLETESpeedCalibrationOffset_ = null;
         this.onChanged();
      } else {
         this.oBSOLETESpeedCalibrationOffsetBuilder_.clear();
      }

      this.bitField0_ &= -8193;
      return this;
   }

   public PhysData$PbUserPhysData$Builder clearOneof(OneofDescriptor var1) {
      return (PhysData$PbUserPhysData$Builder)super.clearOneof(var1);
   }

   public PhysData$PbUserPhysData$Builder clearRestingHeartrate() {
      if (this.restingHeartrateBuilder_ == null) {
         this.restingHeartrate_ = null;
         this.onChanged();
      } else {
         this.restingHeartrateBuilder_.clear();
      }

      this.bitField0_ &= -33;
      return this;
   }

   public PhysData$PbUserPhysData$Builder clearSensorCalibrationOffset() {
      if (this.sensorCalibrationOffsetBuilder_ == null) {
         this.sensorCalibrationOffset_ = Collections.emptyList();
         this.bitField0_ &= -32769;
         this.onChanged();
      } else {
         this.sensorCalibrationOffsetBuilder_.clear();
      }

      return this;
   }

   public PhysData$PbUserPhysData$Builder clearSleepGoal() {
      if (this.sleepGoalBuilder_ == null) {
         this.sleepGoal_ = null;
         this.onChanged();
      } else {
         this.sleepGoalBuilder_.clear();
      }

      this.bitField0_ &= -65537;
      return this;
   }

   public PhysData$PbUserPhysData$Builder clearSnapshotStartTime() {
      if (this.snapshotStartTimeBuilder_ == null) {
         this.snapshotStartTime_ = null;
         this.onChanged();
      } else {
         this.snapshotStartTimeBuilder_.clear();
      }

      this.bitField0_ &= -262145;
      return this;
   }

   public PhysData$PbUserPhysData$Builder clearTrainingBackground() {
      if (this.trainingBackgroundBuilder_ == null) {
         this.trainingBackground_ = null;
         this.onChanged();
      } else {
         this.trainingBackgroundBuilder_.clear();
      }

      this.bitField0_ &= -1025;
      return this;
   }

   public PhysData$PbUserPhysData$Builder clearTypicalDay() {
      if (this.typicalDayBuilder_ == null) {
         this.typicalDay_ = null;
         this.onChanged();
      } else {
         this.typicalDayBuilder_.clear();
      }

      this.bitField0_ &= -2049;
      return this;
   }

   public PhysData$PbUserPhysData$Builder clearVo2Max() {
      if (this.vo2MaxBuilder_ == null) {
         this.vo2Max_ = null;
         this.onChanged();
      } else {
         this.vo2MaxBuilder_.clear();
      }

      this.bitField0_ &= -513;
      return this;
   }

   public PhysData$PbUserPhysData$Builder clearWeeklyRecoveryTimeSum() {
      if (this.weeklyRecoveryTimeSumBuilder_ == null) {
         this.weeklyRecoveryTimeSum_ = null;
         this.onChanged();
      } else {
         this.weeklyRecoveryTimeSumBuilder_.clear();
      }

      this.bitField0_ &= -4097;
      return this;
   }

   public PhysData$PbUserPhysData$Builder clearWeight() {
      if (this.weightBuilder_ == null) {
         this.weight_ = null;
         this.onChanged();
      } else {
         this.weightBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public PhysData$PbUserPhysData$Builder clone() {
      return (PhysData$PbUserPhysData$Builder)super.clone();
   }

   public PhysData$PbUserHrAttribute getAerobicThreshold() {
      PhysData$PbUserHrAttribute var1;
      if (this.aerobicThresholdBuilder_ == null) {
         if (this.aerobicThreshold_ == null) {
            var1 = PhysData$PbUserHrAttribute.getDefaultInstance();
         } else {
            var1 = this.aerobicThreshold_;
         }
      } else {
         var1 = (PhysData$PbUserHrAttribute)this.aerobicThresholdBuilder_.getMessage();
      }

      return var1;
   }

   public PhysData$PbUserHrAttribute$Builder getAerobicThresholdBuilder() {
      this.bitField0_ |= 128;
      this.onChanged();
      return (PhysData$PbUserHrAttribute$Builder)this.getAerobicThresholdFieldBuilder().getBuilder();
   }

   public PhysData$PbUserHrAttributeOrBuilder getAerobicThresholdOrBuilder() {
      Object var1;
      if (this.aerobicThresholdBuilder_ != null) {
         var1 = (PhysData$PbUserHrAttributeOrBuilder)this.aerobicThresholdBuilder_.getMessageOrBuilder();
      } else if (this.aerobicThreshold_ == null) {
         var1 = PhysData$PbUserHrAttribute.getDefaultInstance();
      } else {
         var1 = this.aerobicThreshold_;
      }

      return (PhysData$PbUserHrAttributeOrBuilder)var1;
   }

   public PhysData$PbUserHrAttribute getAnaerobicThreshold() {
      PhysData$PbUserHrAttribute var1;
      if (this.anaerobicThresholdBuilder_ == null) {
         if (this.anaerobicThreshold_ == null) {
            var1 = PhysData$PbUserHrAttribute.getDefaultInstance();
         } else {
            var1 = this.anaerobicThreshold_;
         }
      } else {
         var1 = (PhysData$PbUserHrAttribute)this.anaerobicThresholdBuilder_.getMessage();
      }

      return var1;
   }

   public PhysData$PbUserHrAttribute$Builder getAnaerobicThresholdBuilder() {
      this.bitField0_ |= 256;
      this.onChanged();
      return (PhysData$PbUserHrAttribute$Builder)this.getAnaerobicThresholdFieldBuilder().getBuilder();
   }

   public PhysData$PbUserHrAttributeOrBuilder getAnaerobicThresholdOrBuilder() {
      Object var1;
      if (this.anaerobicThresholdBuilder_ != null) {
         var1 = (PhysData$PbUserHrAttributeOrBuilder)this.anaerobicThresholdBuilder_.getMessageOrBuilder();
      } else if (this.anaerobicThreshold_ == null) {
         var1 = PhysData$PbUserHrAttribute.getDefaultInstance();
      } else {
         var1 = this.anaerobicThreshold_;
      }

      return (PhysData$PbUserHrAttributeOrBuilder)var1;
   }

   public PhysData$PbUserBirthday getBirthday() {
      PhysData$PbUserBirthday var1;
      if (this.birthdayBuilder_ == null) {
         if (this.birthday_ == null) {
            var1 = PhysData$PbUserBirthday.getDefaultInstance();
         } else {
            var1 = this.birthday_;
         }
      } else {
         var1 = (PhysData$PbUserBirthday)this.birthdayBuilder_.getMessage();
      }

      return var1;
   }

   public PhysData$PbUserBirthday$Builder getBirthdayBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (PhysData$PbUserBirthday$Builder)this.getBirthdayFieldBuilder().getBuilder();
   }

   public PhysData$PbUserBirthdayOrBuilder getBirthdayOrBuilder() {
      Object var1;
      if (this.birthdayBuilder_ != null) {
         var1 = (PhysData$PbUserBirthdayOrBuilder)this.birthdayBuilder_.getMessageOrBuilder();
      } else if (this.birthday_ == null) {
         var1 = PhysData$PbUserBirthday.getDefaultInstance();
      } else {
         var1 = this.birthday_;
      }

      return (PhysData$PbUserBirthdayOrBuilder)var1;
   }

   public PhysData$PbUserPhysData getDefaultInstanceForType() {
      return PhysData$PbUserPhysData.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PhysData.y();
   }

   public PhysData$PbUserFunctionalThresholdPower getFunctionalThresholdPower() {
      PhysData$PbUserFunctionalThresholdPower var1;
      if (this.functionalThresholdPowerBuilder_ == null) {
         if (this.functionalThresholdPower_ == null) {
            var1 = PhysData$PbUserFunctionalThresholdPower.getDefaultInstance();
         } else {
            var1 = this.functionalThresholdPower_;
         }
      } else {
         var1 = (PhysData$PbUserFunctionalThresholdPower)this.functionalThresholdPowerBuilder_.getMessage();
      }

      return var1;
   }

   public PhysData$PbUserFunctionalThresholdPower$Builder getFunctionalThresholdPowerBuilder() {
      this.bitField0_ |= 16384;
      this.onChanged();
      return (PhysData$PbUserFunctionalThresholdPower$Builder)this.getFunctionalThresholdPowerFieldBuilder().getBuilder();
   }

   public PhysData$PbUserFunctionalThresholdPowerOrBuilder getFunctionalThresholdPowerOrBuilder() {
      Object var1;
      if (this.functionalThresholdPowerBuilder_ != null) {
         var1 = (PhysData$PbUserFunctionalThresholdPowerOrBuilder)this.functionalThresholdPowerBuilder_.getMessageOrBuilder();
      } else if (this.functionalThresholdPower_ == null) {
         var1 = PhysData$PbUserFunctionalThresholdPower.getDefaultInstance();
      } else {
         var1 = this.functionalThresholdPower_;
      }

      return (PhysData$PbUserFunctionalThresholdPowerOrBuilder)var1;
   }

   public PhysData$PbUserGender getGender() {
      PhysData$PbUserGender var1;
      if (this.genderBuilder_ == null) {
         if (this.gender_ == null) {
            var1 = PhysData$PbUserGender.getDefaultInstance();
         } else {
            var1 = this.gender_;
         }
      } else {
         var1 = (PhysData$PbUserGender)this.genderBuilder_.getMessage();
      }

      return var1;
   }

   public PhysData$PbUserGender$Builder getGenderBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (PhysData$PbUserGender$Builder)this.getGenderFieldBuilder().getBuilder();
   }

   public PhysData$PbUserGenderOrBuilder getGenderOrBuilder() {
      Object var1;
      if (this.genderBuilder_ != null) {
         var1 = (PhysData$PbUserGenderOrBuilder)this.genderBuilder_.getMessageOrBuilder();
      } else if (this.gender_ == null) {
         var1 = PhysData$PbUserGender.getDefaultInstance();
      } else {
         var1 = this.gender_;
      }

      return (PhysData$PbUserGenderOrBuilder)var1;
   }

   public PhysData$PbUserHeight getHeight() {
      PhysData$PbUserHeight var1;
      if (this.heightBuilder_ == null) {
         if (this.height_ == null) {
            var1 = PhysData$PbUserHeight.getDefaultInstance();
         } else {
            var1 = this.height_;
         }
      } else {
         var1 = (PhysData$PbUserHeight)this.heightBuilder_.getMessage();
      }

      return var1;
   }

   public PhysData$PbUserHeight$Builder getHeightBuilder() {
      this.bitField0_ |= 8;
      this.onChanged();
      return (PhysData$PbUserHeight$Builder)this.getHeightFieldBuilder().getBuilder();
   }

   public PhysData$PbUserHeightOrBuilder getHeightOrBuilder() {
      Object var1;
      if (this.heightBuilder_ != null) {
         var1 = (PhysData$PbUserHeightOrBuilder)this.heightBuilder_.getMessageOrBuilder();
      } else if (this.height_ == null) {
         var1 = PhysData$PbUserHeight.getDefaultInstance();
      } else {
         var1 = this.height_;
      }

      return (PhysData$PbUserHeightOrBuilder)var1;
   }

   public Types$PbSystemDateTime getLastModified() {
      Types$PbSystemDateTime var1;
      if (this.lastModifiedBuilder_ == null) {
         if (this.lastModified_ == null) {
            var1 = Types$PbSystemDateTime.getDefaultInstance();
         } else {
            var1 = this.lastModified_;
         }
      } else {
         var1 = (Types$PbSystemDateTime)this.lastModifiedBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbSystemDateTime$Builder getLastModifiedBuilder() {
      this.bitField0_ |= 131072;
      this.onChanged();
      return (Types$PbSystemDateTime$Builder)this.getLastModifiedFieldBuilder().getBuilder();
   }

   public Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder() {
      Object var1;
      if (this.lastModifiedBuilder_ != null) {
         var1 = (Types$PbSystemDateTimeOrBuilder)this.lastModifiedBuilder_.getMessageOrBuilder();
      } else if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
      }

      return (Types$PbSystemDateTimeOrBuilder)var1;
   }

   public PhysData$PbUserHrAttribute getMaximumHeartrate() {
      PhysData$PbUserHrAttribute var1;
      if (this.maximumHeartrateBuilder_ == null) {
         if (this.maximumHeartrate_ == null) {
            var1 = PhysData$PbUserHrAttribute.getDefaultInstance();
         } else {
            var1 = this.maximumHeartrate_;
         }
      } else {
         var1 = (PhysData$PbUserHrAttribute)this.maximumHeartrateBuilder_.getMessage();
      }

      return var1;
   }

   public PhysData$PbUserHrAttribute$Builder getMaximumHeartrateBuilder() {
      this.bitField0_ |= 16;
      this.onChanged();
      return (PhysData$PbUserHrAttribute$Builder)this.getMaximumHeartrateFieldBuilder().getBuilder();
   }

   public PhysData$PbUserHrAttributeOrBuilder getMaximumHeartrateOrBuilder() {
      Object var1;
      if (this.maximumHeartrateBuilder_ != null) {
         var1 = (PhysData$PbUserHrAttributeOrBuilder)this.maximumHeartrateBuilder_.getMessageOrBuilder();
      } else if (this.maximumHeartrate_ == null) {
         var1 = PhysData$PbUserHrAttribute.getDefaultInstance();
      } else {
         var1 = this.maximumHeartrate_;
      }

      return (PhysData$PbUserHrAttributeOrBuilder)var1;
   }

   public PhysData$PbUserHrAttribute getOBSOLETESittingHeartrate() {
      PhysData$PbUserHrAttribute var1;
      if (this.oBSOLETESittingHeartrateBuilder_ == null) {
         if (this.oBSOLETESittingHeartrate_ == null) {
            var1 = PhysData$PbUserHrAttribute.getDefaultInstance();
         } else {
            var1 = this.oBSOLETESittingHeartrate_;
         }
      } else {
         var1 = (PhysData$PbUserHrAttribute)this.oBSOLETESittingHeartrateBuilder_.getMessage();
      }

      return var1;
   }

   public PhysData$PbUserHrAttribute$Builder getOBSOLETESittingHeartrateBuilder() {
      this.bitField0_ |= 64;
      this.onChanged();
      return (PhysData$PbUserHrAttribute$Builder)this.getOBSOLETESittingHeartrateFieldBuilder().getBuilder();
   }

   public PhysData$PbUserHrAttributeOrBuilder getOBSOLETESittingHeartrateOrBuilder() {
      Object var1;
      if (this.oBSOLETESittingHeartrateBuilder_ != null) {
         var1 = (PhysData$PbUserHrAttributeOrBuilder)this.oBSOLETESittingHeartrateBuilder_.getMessageOrBuilder();
      } else if (this.oBSOLETESittingHeartrate_ == null) {
         var1 = PhysData$PbUserHrAttribute.getDefaultInstance();
      } else {
         var1 = this.oBSOLETESittingHeartrate_;
      }

      return (PhysData$PbUserHrAttributeOrBuilder)var1;
   }

   public PhysData$PbSpeedCalibrationOffset getOBSOLETESpeedCalibrationOffset() {
      PhysData$PbSpeedCalibrationOffset var1;
      if (this.oBSOLETESpeedCalibrationOffsetBuilder_ == null) {
         if (this.oBSOLETESpeedCalibrationOffset_ == null) {
            var1 = PhysData$PbSpeedCalibrationOffset.getDefaultInstance();
         } else {
            var1 = this.oBSOLETESpeedCalibrationOffset_;
         }
      } else {
         var1 = (PhysData$PbSpeedCalibrationOffset)this.oBSOLETESpeedCalibrationOffsetBuilder_.getMessage();
      }

      return var1;
   }

   public PhysData$PbSpeedCalibrationOffset$Builder getOBSOLETESpeedCalibrationOffsetBuilder() {
      this.bitField0_ |= 8192;
      this.onChanged();
      return (PhysData$PbSpeedCalibrationOffset$Builder)this.getOBSOLETESpeedCalibrationOffsetFieldBuilder().getBuilder();
   }

   public PhysData$PbSpeedCalibrationOffsetOrBuilder getOBSOLETESpeedCalibrationOffsetOrBuilder() {
      Object var1;
      if (this.oBSOLETESpeedCalibrationOffsetBuilder_ != null) {
         var1 = (PhysData$PbSpeedCalibrationOffsetOrBuilder)this.oBSOLETESpeedCalibrationOffsetBuilder_.getMessageOrBuilder();
      } else if (this.oBSOLETESpeedCalibrationOffset_ == null) {
         var1 = PhysData$PbSpeedCalibrationOffset.getDefaultInstance();
      } else {
         var1 = this.oBSOLETESpeedCalibrationOffset_;
      }

      return (PhysData$PbSpeedCalibrationOffsetOrBuilder)var1;
   }

   public PhysData$PbUserHrAttribute getRestingHeartrate() {
      PhysData$PbUserHrAttribute var1;
      if (this.restingHeartrateBuilder_ == null) {
         if (this.restingHeartrate_ == null) {
            var1 = PhysData$PbUserHrAttribute.getDefaultInstance();
         } else {
            var1 = this.restingHeartrate_;
         }
      } else {
         var1 = (PhysData$PbUserHrAttribute)this.restingHeartrateBuilder_.getMessage();
      }

      return var1;
   }

   public PhysData$PbUserHrAttribute$Builder getRestingHeartrateBuilder() {
      this.bitField0_ |= 32;
      this.onChanged();
      return (PhysData$PbUserHrAttribute$Builder)this.getRestingHeartrateFieldBuilder().getBuilder();
   }

   public PhysData$PbUserHrAttributeOrBuilder getRestingHeartrateOrBuilder() {
      Object var1;
      if (this.restingHeartrateBuilder_ != null) {
         var1 = (PhysData$PbUserHrAttributeOrBuilder)this.restingHeartrateBuilder_.getMessageOrBuilder();
      } else if (this.restingHeartrate_ == null) {
         var1 = PhysData$PbUserHrAttribute.getDefaultInstance();
      } else {
         var1 = this.restingHeartrate_;
      }

      return (PhysData$PbUserHrAttributeOrBuilder)var1;
   }

   public Types$PbSensorCalibrationOffset getSensorCalibrationOffset(int var1) {
      Types$PbSensorCalibrationOffset var2;
      if (this.sensorCalibrationOffsetBuilder_ == null) {
         var2 = (Types$PbSensorCalibrationOffset)this.sensorCalibrationOffset_.get(var1);
      } else {
         var2 = (Types$PbSensorCalibrationOffset)this.sensorCalibrationOffsetBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Types$PbSensorCalibrationOffset$Builder getSensorCalibrationOffsetBuilder(int var1) {
      return (Types$PbSensorCalibrationOffset$Builder)this.getSensorCalibrationOffsetFieldBuilder().getBuilder(var1);
   }

   public List getSensorCalibrationOffsetBuilderList() {
      return this.getSensorCalibrationOffsetFieldBuilder().getBuilderList();
   }

   public int getSensorCalibrationOffsetCount() {
      int var1;
      if (this.sensorCalibrationOffsetBuilder_ == null) {
         var1 = this.sensorCalibrationOffset_.size();
      } else {
         var1 = this.sensorCalibrationOffsetBuilder_.getCount();
      }

      return var1;
   }

   public List getSensorCalibrationOffsetList() {
      List var1;
      if (this.sensorCalibrationOffsetBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.sensorCalibrationOffset_);
      } else {
         var1 = this.sensorCalibrationOffsetBuilder_.getMessageList();
      }

      return var1;
   }

   public Types$PbSensorCalibrationOffsetOrBuilder getSensorCalibrationOffsetOrBuilder(int var1) {
      Types$PbSensorCalibrationOffsetOrBuilder var2;
      if (this.sensorCalibrationOffsetBuilder_ == null) {
         var2 = (Types$PbSensorCalibrationOffsetOrBuilder)this.sensorCalibrationOffset_.get(var1);
      } else {
         var2 = (Types$PbSensorCalibrationOffsetOrBuilder)this.sensorCalibrationOffsetBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getSensorCalibrationOffsetOrBuilderList() {
      List var1;
      if (this.sensorCalibrationOffsetBuilder_ != null) {
         var1 = this.sensorCalibrationOffsetBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.sensorCalibrationOffset_);
      }

      return var1;
   }

   public PhysData$PbSleepGoal getSleepGoal() {
      PhysData$PbSleepGoal var1;
      if (this.sleepGoalBuilder_ == null) {
         if (this.sleepGoal_ == null) {
            var1 = PhysData$PbSleepGoal.getDefaultInstance();
         } else {
            var1 = this.sleepGoal_;
         }
      } else {
         var1 = (PhysData$PbSleepGoal)this.sleepGoalBuilder_.getMessage();
      }

      return var1;
   }

   public PhysData$PbSleepGoal$Builder getSleepGoalBuilder() {
      this.bitField0_ |= 65536;
      this.onChanged();
      return (PhysData$PbSleepGoal$Builder)this.getSleepGoalFieldBuilder().getBuilder();
   }

   public PhysData$PbSleepGoalOrBuilder getSleepGoalOrBuilder() {
      Object var1;
      if (this.sleepGoalBuilder_ != null) {
         var1 = (PhysData$PbSleepGoalOrBuilder)this.sleepGoalBuilder_.getMessageOrBuilder();
      } else if (this.sleepGoal_ == null) {
         var1 = PhysData$PbSleepGoal.getDefaultInstance();
      } else {
         var1 = this.sleepGoal_;
      }

      return (PhysData$PbSleepGoalOrBuilder)var1;
   }

   public Types$PbLocalDateTime getSnapshotStartTime() {
      Types$PbLocalDateTime var1;
      if (this.snapshotStartTimeBuilder_ == null) {
         if (this.snapshotStartTime_ == null) {
            var1 = Types$PbLocalDateTime.getDefaultInstance();
         } else {
            var1 = this.snapshotStartTime_;
         }
      } else {
         var1 = (Types$PbLocalDateTime)this.snapshotStartTimeBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbLocalDateTime$Builder getSnapshotStartTimeBuilder() {
      this.bitField0_ |= 262144;
      this.onChanged();
      return (Types$PbLocalDateTime$Builder)this.getSnapshotStartTimeFieldBuilder().getBuilder();
   }

   public Types$PbLocalDateTimeOrBuilder getSnapshotStartTimeOrBuilder() {
      Object var1;
      if (this.snapshotStartTimeBuilder_ != null) {
         var1 = (Types$PbLocalDateTimeOrBuilder)this.snapshotStartTimeBuilder_.getMessageOrBuilder();
      } else if (this.snapshotStartTime_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.snapshotStartTime_;
      }

      return (Types$PbLocalDateTimeOrBuilder)var1;
   }

   public PhysData$PbUserTrainingBackground getTrainingBackground() {
      PhysData$PbUserTrainingBackground var1;
      if (this.trainingBackgroundBuilder_ == null) {
         if (this.trainingBackground_ == null) {
            var1 = PhysData$PbUserTrainingBackground.getDefaultInstance();
         } else {
            var1 = this.trainingBackground_;
         }
      } else {
         var1 = (PhysData$PbUserTrainingBackground)this.trainingBackgroundBuilder_.getMessage();
      }

      return var1;
   }

   public PhysData$PbUserTrainingBackground$Builder getTrainingBackgroundBuilder() {
      this.bitField0_ |= 1024;
      this.onChanged();
      return (PhysData$PbUserTrainingBackground$Builder)this.getTrainingBackgroundFieldBuilder().getBuilder();
   }

   public PhysData$PbUserTrainingBackgroundOrBuilder getTrainingBackgroundOrBuilder() {
      Object var1;
      if (this.trainingBackgroundBuilder_ != null) {
         var1 = (PhysData$PbUserTrainingBackgroundOrBuilder)this.trainingBackgroundBuilder_.getMessageOrBuilder();
      } else if (this.trainingBackground_ == null) {
         var1 = PhysData$PbUserTrainingBackground.getDefaultInstance();
      } else {
         var1 = this.trainingBackground_;
      }

      return (PhysData$PbUserTrainingBackgroundOrBuilder)var1;
   }

   public PhysData$PbUserTypicalDay getTypicalDay() {
      PhysData$PbUserTypicalDay var1;
      if (this.typicalDayBuilder_ == null) {
         if (this.typicalDay_ == null) {
            var1 = PhysData$PbUserTypicalDay.getDefaultInstance();
         } else {
            var1 = this.typicalDay_;
         }
      } else {
         var1 = (PhysData$PbUserTypicalDay)this.typicalDayBuilder_.getMessage();
      }

      return var1;
   }

   public PhysData$PbUserTypicalDay$Builder getTypicalDayBuilder() {
      this.bitField0_ |= 2048;
      this.onChanged();
      return (PhysData$PbUserTypicalDay$Builder)this.getTypicalDayFieldBuilder().getBuilder();
   }

   public PhysData$PbUserTypicalDayOrBuilder getTypicalDayOrBuilder() {
      Object var1;
      if (this.typicalDayBuilder_ != null) {
         var1 = (PhysData$PbUserTypicalDayOrBuilder)this.typicalDayBuilder_.getMessageOrBuilder();
      } else if (this.typicalDay_ == null) {
         var1 = PhysData$PbUserTypicalDay.getDefaultInstance();
      } else {
         var1 = this.typicalDay_;
      }

      return (PhysData$PbUserTypicalDayOrBuilder)var1;
   }

   public PhysData$PbUserVo2Max getVo2Max() {
      PhysData$PbUserVo2Max var1;
      if (this.vo2MaxBuilder_ == null) {
         if (this.vo2Max_ == null) {
            var1 = PhysData$PbUserVo2Max.getDefaultInstance();
         } else {
            var1 = this.vo2Max_;
         }
      } else {
         var1 = (PhysData$PbUserVo2Max)this.vo2MaxBuilder_.getMessage();
      }

      return var1;
   }

   public PhysData$PbUserVo2Max$Builder getVo2MaxBuilder() {
      this.bitField0_ |= 512;
      this.onChanged();
      return (PhysData$PbUserVo2Max$Builder)this.getVo2MaxFieldBuilder().getBuilder();
   }

   public PhysData$PbUserVo2MaxOrBuilder getVo2MaxOrBuilder() {
      Object var1;
      if (this.vo2MaxBuilder_ != null) {
         var1 = (PhysData$PbUserVo2MaxOrBuilder)this.vo2MaxBuilder_.getMessageOrBuilder();
      } else if (this.vo2Max_ == null) {
         var1 = PhysData$PbUserVo2Max.getDefaultInstance();
      } else {
         var1 = this.vo2Max_;
      }

      return (PhysData$PbUserVo2MaxOrBuilder)var1;
   }

   public PhysData$PbWeeklyRecoveryTimeSum getWeeklyRecoveryTimeSum() {
      PhysData$PbWeeklyRecoveryTimeSum var1;
      if (this.weeklyRecoveryTimeSumBuilder_ == null) {
         if (this.weeklyRecoveryTimeSum_ == null) {
            var1 = PhysData$PbWeeklyRecoveryTimeSum.getDefaultInstance();
         } else {
            var1 = this.weeklyRecoveryTimeSum_;
         }
      } else {
         var1 = (PhysData$PbWeeklyRecoveryTimeSum)this.weeklyRecoveryTimeSumBuilder_.getMessage();
      }

      return var1;
   }

   public PhysData$PbWeeklyRecoveryTimeSum$Builder getWeeklyRecoveryTimeSumBuilder() {
      this.bitField0_ |= 4096;
      this.onChanged();
      return (PhysData$PbWeeklyRecoveryTimeSum$Builder)this.getWeeklyRecoveryTimeSumFieldBuilder().getBuilder();
   }

   public PhysData$PbWeeklyRecoveryTimeSumOrBuilder getWeeklyRecoveryTimeSumOrBuilder() {
      Object var1;
      if (this.weeklyRecoveryTimeSumBuilder_ != null) {
         var1 = (PhysData$PbWeeklyRecoveryTimeSumOrBuilder)this.weeklyRecoveryTimeSumBuilder_.getMessageOrBuilder();
      } else if (this.weeklyRecoveryTimeSum_ == null) {
         var1 = PhysData$PbWeeklyRecoveryTimeSum.getDefaultInstance();
      } else {
         var1 = this.weeklyRecoveryTimeSum_;
      }

      return (PhysData$PbWeeklyRecoveryTimeSumOrBuilder)var1;
   }

   public PhysData$PbUserWeight getWeight() {
      PhysData$PbUserWeight var1;
      if (this.weightBuilder_ == null) {
         if (this.weight_ == null) {
            var1 = PhysData$PbUserWeight.getDefaultInstance();
         } else {
            var1 = this.weight_;
         }
      } else {
         var1 = (PhysData$PbUserWeight)this.weightBuilder_.getMessage();
      }

      return var1;
   }

   public PhysData$PbUserWeight$Builder getWeightBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (PhysData$PbUserWeight$Builder)this.getWeightFieldBuilder().getBuilder();
   }

   public PhysData$PbUserWeightOrBuilder getWeightOrBuilder() {
      Object var1;
      if (this.weightBuilder_ != null) {
         var1 = (PhysData$PbUserWeightOrBuilder)this.weightBuilder_.getMessageOrBuilder();
      } else if (this.weight_ == null) {
         var1 = PhysData$PbUserWeight.getDefaultInstance();
      } else {
         var1 = this.weight_;
      }

      return (PhysData$PbUserWeightOrBuilder)var1;
   }

   public boolean hasAerobicThreshold() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAnaerobicThreshold() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasBirthday() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasFunctionalThresholdPower() {
      boolean var1;
      if ((this.bitField0_ & 16384) == 16384) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasGender() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasHeight() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLastModified() {
      boolean var1;
      if ((this.bitField0_ & 131072) == 131072) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMaximumHeartrate() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasOBSOLETESittingHeartrate() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasOBSOLETESpeedCalibrationOffset() {
      boolean var1;
      if ((this.bitField0_ & 8192) == 8192) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasRestingHeartrate() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSleepGoal() {
      boolean var1;
      if ((this.bitField0_ & 65536) == 65536) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSnapshotStartTime() {
      boolean var1;
      if ((this.bitField0_ & 262144) == 262144) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTrainingBackground() {
      boolean var1;
      if ((this.bitField0_ & 1024) == 1024) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTypicalDay() {
      boolean var1;
      if ((this.bitField0_ & 2048) == 2048) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasVo2Max() {
      boolean var1;
      if ((this.bitField0_ & 512) == 512) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasWeeklyRecoveryTimeSum() {
      boolean var1;
      if ((this.bitField0_ & 4096) == 4096) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasWeight() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PhysData.z().ensureFieldAccessorsInitialized(PhysData$PbUserPhysData.class, PhysData$PbUserPhysData$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasBirthday()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasGender()) {
            var2 = var1;
            if (this.getBirthday().isInitialized()) {
               var2 = var1;
               if (this.getGender().isInitialized()) {
                  if (this.hasWeight()) {
                     var2 = var1;
                     if (!this.getWeight().isInitialized()) {
                        return var2;
                     }
                  }

                  if (this.hasHeight()) {
                     var2 = var1;
                     if (!this.getHeight().isInitialized()) {
                        return var2;
                     }
                  }

                  if (this.hasMaximumHeartrate()) {
                     var2 = var1;
                     if (!this.getMaximumHeartrate().isInitialized()) {
                        return var2;
                     }
                  }

                  if (this.hasRestingHeartrate()) {
                     var2 = var1;
                     if (!this.getRestingHeartrate().isInitialized()) {
                        return var2;
                     }
                  }

                  if (this.hasOBSOLETESittingHeartrate()) {
                     var2 = var1;
                     if (!this.getOBSOLETESittingHeartrate().isInitialized()) {
                        return var2;
                     }
                  }

                  if (this.hasAerobicThreshold()) {
                     var2 = var1;
                     if (!this.getAerobicThreshold().isInitialized()) {
                        return var2;
                     }
                  }

                  if (this.hasAnaerobicThreshold()) {
                     var2 = var1;
                     if (!this.getAnaerobicThreshold().isInitialized()) {
                        return var2;
                     }
                  }

                  if (this.hasVo2Max()) {
                     var2 = var1;
                     if (!this.getVo2Max().isInitialized()) {
                        return var2;
                     }
                  }

                  if (this.hasTrainingBackground()) {
                     var2 = var1;
                     if (!this.getTrainingBackground().isInitialized()) {
                        return var2;
                     }
                  }

                  if (this.hasTypicalDay()) {
                     var2 = var1;
                     if (!this.getTypicalDay().isInitialized()) {
                        return var2;
                     }
                  }

                  if (this.hasWeeklyRecoveryTimeSum()) {
                     var2 = var1;
                     if (!this.getWeeklyRecoveryTimeSum().isInitialized()) {
                        return var2;
                     }
                  }

                  if (this.hasOBSOLETESpeedCalibrationOffset()) {
                     var2 = var1;
                     if (!this.getOBSOLETESpeedCalibrationOffset().isInitialized()) {
                        return var2;
                     }
                  }

                  if (this.hasFunctionalThresholdPower()) {
                     var2 = var1;
                     if (!this.getFunctionalThresholdPower().isInitialized()) {
                        return var2;
                     }
                  }

                  int var3 = 0;

                  while(true) {
                     if (var3 >= this.getSensorCalibrationOffsetCount()) {
                        if (this.hasLastModified()) {
                           var2 = var1;
                           if (!this.getLastModified().isInitialized()) {
                              break;
                           }
                        }

                        if (this.hasSnapshotStartTime()) {
                           var2 = var1;
                           if (!this.getSnapshotStartTime().isInitialized()) {
                              break;
                           }
                        }

                        var2 = true;
                        break;
                     }

                     var2 = var1;
                     if (!this.getSensorCalibrationOffset(var3).isInitialized()) {
                        break;
                     }

                     ++var3;
                  }
               }
            }
         }
      }

      return var2;
   }

   public PhysData$PbUserPhysData$Builder mergeAerobicThreshold(PhysData$PbUserHrAttribute var1) {
      if (this.aerobicThresholdBuilder_ == null) {
         if ((this.bitField0_ & 128) == 128 && this.aerobicThreshold_ != null && this.aerobicThreshold_ != PhysData$PbUserHrAttribute.getDefaultInstance()) {
            this.aerobicThreshold_ = PhysData$PbUserHrAttribute.newBuilder(this.aerobicThreshold_).mergeFrom(var1).buildPartial();
         } else {
            this.aerobicThreshold_ = var1;
         }

         this.onChanged();
      } else {
         this.aerobicThresholdBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 128;
      return this;
   }

   public PhysData$PbUserPhysData$Builder mergeAnaerobicThreshold(PhysData$PbUserHrAttribute var1) {
      if (this.anaerobicThresholdBuilder_ == null) {
         if ((this.bitField0_ & 256) == 256 && this.anaerobicThreshold_ != null && this.anaerobicThreshold_ != PhysData$PbUserHrAttribute.getDefaultInstance()) {
            this.anaerobicThreshold_ = PhysData$PbUserHrAttribute.newBuilder(this.anaerobicThreshold_).mergeFrom(var1).buildPartial();
         } else {
            this.anaerobicThreshold_ = var1;
         }

         this.onChanged();
      } else {
         this.anaerobicThresholdBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 256;
      return this;
   }

   public PhysData$PbUserPhysData$Builder mergeBirthday(PhysData$PbUserBirthday var1) {
      if (this.birthdayBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.birthday_ != null && this.birthday_ != PhysData$PbUserBirthday.getDefaultInstance()) {
            this.birthday_ = PhysData$PbUserBirthday.newBuilder(this.birthday_).mergeFrom(var1).buildPartial();
         } else {
            this.birthday_ = var1;
         }

         this.onChanged();
      } else {
         this.birthdayBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public PhysData$PbUserPhysData$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PhysData$PbUserPhysData var13;
      label96: {
         InvalidProtocolBufferException var12;
         PhysData$PbUserPhysData var14;
         try {
            var13 = (PhysData$PbUserPhysData)PhysData$PbUserPhysData.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (PhysData$PbUserPhysData)var10.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var12.unwrapIOException();
         } finally {
            if (var14 != null) {
               this.mergeFrom(var14);
            }

            throw var12;
         }
      }

      if (var13 != null) {
         this.mergeFrom(var13);
      }

      return this;
   }

   public PhysData$PbUserPhysData$Builder mergeFrom(Message var1) {
      PhysData$PbUserPhysData$Builder var2;
      if (var1 instanceof PhysData$PbUserPhysData) {
         var2 = this.mergeFrom((PhysData$PbUserPhysData)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PhysData$PbUserPhysData$Builder mergeFrom(PhysData$PbUserPhysData var1) {
      RepeatedFieldBuilderV3 var2 = null;
      if (var1 != PhysData$PbUserPhysData.getDefaultInstance()) {
         if (var1.hasBirthday()) {
            this.mergeBirthday(var1.getBirthday());
         }

         if (var1.hasGender()) {
            this.mergeGender(var1.getGender());
         }

         if (var1.hasWeight()) {
            this.mergeWeight(var1.getWeight());
         }

         if (var1.hasHeight()) {
            this.mergeHeight(var1.getHeight());
         }

         if (var1.hasMaximumHeartrate()) {
            this.mergeMaximumHeartrate(var1.getMaximumHeartrate());
         }

         if (var1.hasRestingHeartrate()) {
            this.mergeRestingHeartrate(var1.getRestingHeartrate());
         }

         if (var1.hasOBSOLETESittingHeartrate()) {
            this.mergeOBSOLETESittingHeartrate(var1.getOBSOLETESittingHeartrate());
         }

         if (var1.hasAerobicThreshold()) {
            this.mergeAerobicThreshold(var1.getAerobicThreshold());
         }

         if (var1.hasAnaerobicThreshold()) {
            this.mergeAnaerobicThreshold(var1.getAnaerobicThreshold());
         }

         if (var1.hasVo2Max()) {
            this.mergeVo2Max(var1.getVo2Max());
         }

         if (var1.hasTrainingBackground()) {
            this.mergeTrainingBackground(var1.getTrainingBackground());
         }

         if (var1.hasTypicalDay()) {
            this.mergeTypicalDay(var1.getTypicalDay());
         }

         if (var1.hasWeeklyRecoveryTimeSum()) {
            this.mergeWeeklyRecoveryTimeSum(var1.getWeeklyRecoveryTimeSum());
         }

         if (var1.hasOBSOLETESpeedCalibrationOffset()) {
            this.mergeOBSOLETESpeedCalibrationOffset(var1.getOBSOLETESpeedCalibrationOffset());
         }

         if (var1.hasFunctionalThresholdPower()) {
            this.mergeFunctionalThresholdPower(var1.getFunctionalThresholdPower());
         }

         if (this.sensorCalibrationOffsetBuilder_ == null) {
            if (!PhysData$PbUserPhysData.a(var1).isEmpty()) {
               if (this.sensorCalibrationOffset_.isEmpty()) {
                  this.sensorCalibrationOffset_ = PhysData$PbUserPhysData.a(var1);
                  this.bitField0_ &= -32769;
               } else {
                  this.ensureSensorCalibrationOffsetIsMutable();
                  this.sensorCalibrationOffset_.addAll(PhysData$PbUserPhysData.a(var1));
               }

               this.onChanged();
            }
         } else if (!PhysData$PbUserPhysData.a(var1).isEmpty()) {
            if (this.sensorCalibrationOffsetBuilder_.isEmpty()) {
               this.sensorCalibrationOffsetBuilder_.dispose();
               this.sensorCalibrationOffsetBuilder_ = null;
               this.sensorCalibrationOffset_ = PhysData$PbUserPhysData.a(var1);
               this.bitField0_ &= -32769;
               if (PhysData$PbUserPhysData.c()) {
                  var2 = this.getSensorCalibrationOffsetFieldBuilder();
               }

               this.sensorCalibrationOffsetBuilder_ = var2;
            } else {
               this.sensorCalibrationOffsetBuilder_.addAllMessages(PhysData$PbUserPhysData.a(var1));
            }
         }

         if (var1.hasSleepGoal()) {
            this.mergeSleepGoal(var1.getSleepGoal());
         }

         if (var1.hasLastModified()) {
            this.mergeLastModified(var1.getLastModified());
         }

         if (var1.hasSnapshotStartTime()) {
            this.mergeSnapshotStartTime(var1.getSnapshotStartTime());
         }

         this.mergeUnknownFields(PhysData$PbUserPhysData.b(var1));
         this.onChanged();
      }

      return this;
   }

   public PhysData$PbUserPhysData$Builder mergeFunctionalThresholdPower(PhysData$PbUserFunctionalThresholdPower var1) {
      if (this.functionalThresholdPowerBuilder_ == null) {
         if ((this.bitField0_ & 16384) == 16384 && this.functionalThresholdPower_ != null && this.functionalThresholdPower_ != PhysData$PbUserFunctionalThresholdPower.getDefaultInstance()) {
            this.functionalThresholdPower_ = PhysData$PbUserFunctionalThresholdPower.newBuilder(this.functionalThresholdPower_).mergeFrom(var1).buildPartial();
         } else {
            this.functionalThresholdPower_ = var1;
         }

         this.onChanged();
      } else {
         this.functionalThresholdPowerBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 16384;
      return this;
   }

   public PhysData$PbUserPhysData$Builder mergeGender(PhysData$PbUserGender var1) {
      if (this.genderBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.gender_ != null && this.gender_ != PhysData$PbUserGender.getDefaultInstance()) {
            this.gender_ = PhysData$PbUserGender.newBuilder(this.gender_).mergeFrom(var1).buildPartial();
         } else {
            this.gender_ = var1;
         }

         this.onChanged();
      } else {
         this.genderBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public PhysData$PbUserPhysData$Builder mergeHeight(PhysData$PbUserHeight var1) {
      if (this.heightBuilder_ == null) {
         if ((this.bitField0_ & 8) == 8 && this.height_ != null && this.height_ != PhysData$PbUserHeight.getDefaultInstance()) {
            this.height_ = PhysData$PbUserHeight.newBuilder(this.height_).mergeFrom(var1).buildPartial();
         } else {
            this.height_ = var1;
         }

         this.onChanged();
      } else {
         this.heightBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public PhysData$PbUserPhysData$Builder mergeLastModified(Types$PbSystemDateTime var1) {
      if (this.lastModifiedBuilder_ == null) {
         if ((this.bitField0_ & 131072) == 131072 && this.lastModified_ != null && this.lastModified_ != Types$PbSystemDateTime.getDefaultInstance()) {
            this.lastModified_ = Types$PbSystemDateTime.newBuilder(this.lastModified_).mergeFrom(var1).buildPartial();
         } else {
            this.lastModified_ = var1;
         }

         this.onChanged();
      } else {
         this.lastModifiedBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 131072;
      return this;
   }

   public PhysData$PbUserPhysData$Builder mergeMaximumHeartrate(PhysData$PbUserHrAttribute var1) {
      if (this.maximumHeartrateBuilder_ == null) {
         if ((this.bitField0_ & 16) == 16 && this.maximumHeartrate_ != null && this.maximumHeartrate_ != PhysData$PbUserHrAttribute.getDefaultInstance()) {
            this.maximumHeartrate_ = PhysData$PbUserHrAttribute.newBuilder(this.maximumHeartrate_).mergeFrom(var1).buildPartial();
         } else {
            this.maximumHeartrate_ = var1;
         }

         this.onChanged();
      } else {
         this.maximumHeartrateBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public PhysData$PbUserPhysData$Builder mergeOBSOLETESittingHeartrate(PhysData$PbUserHrAttribute var1) {
      if (this.oBSOLETESittingHeartrateBuilder_ == null) {
         if ((this.bitField0_ & 64) == 64 && this.oBSOLETESittingHeartrate_ != null && this.oBSOLETESittingHeartrate_ != PhysData$PbUserHrAttribute.getDefaultInstance()) {
            this.oBSOLETESittingHeartrate_ = PhysData$PbUserHrAttribute.newBuilder(this.oBSOLETESittingHeartrate_).mergeFrom(var1).buildPartial();
         } else {
            this.oBSOLETESittingHeartrate_ = var1;
         }

         this.onChanged();
      } else {
         this.oBSOLETESittingHeartrateBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public PhysData$PbUserPhysData$Builder mergeOBSOLETESpeedCalibrationOffset(PhysData$PbSpeedCalibrationOffset var1) {
      if (this.oBSOLETESpeedCalibrationOffsetBuilder_ == null) {
         if ((this.bitField0_ & 8192) == 8192 && this.oBSOLETESpeedCalibrationOffset_ != null && this.oBSOLETESpeedCalibrationOffset_ != PhysData$PbSpeedCalibrationOffset.getDefaultInstance()) {
            this.oBSOLETESpeedCalibrationOffset_ = PhysData$PbSpeedCalibrationOffset.newBuilder(this.oBSOLETESpeedCalibrationOffset_).mergeFrom(var1).buildPartial();
         } else {
            this.oBSOLETESpeedCalibrationOffset_ = var1;
         }

         this.onChanged();
      } else {
         this.oBSOLETESpeedCalibrationOffsetBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8192;
      return this;
   }

   public PhysData$PbUserPhysData$Builder mergeRestingHeartrate(PhysData$PbUserHrAttribute var1) {
      if (this.restingHeartrateBuilder_ == null) {
         if ((this.bitField0_ & 32) == 32 && this.restingHeartrate_ != null && this.restingHeartrate_ != PhysData$PbUserHrAttribute.getDefaultInstance()) {
            this.restingHeartrate_ = PhysData$PbUserHrAttribute.newBuilder(this.restingHeartrate_).mergeFrom(var1).buildPartial();
         } else {
            this.restingHeartrate_ = var1;
         }

         this.onChanged();
      } else {
         this.restingHeartrateBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public PhysData$PbUserPhysData$Builder mergeSleepGoal(PhysData$PbSleepGoal var1) {
      if (this.sleepGoalBuilder_ == null) {
         if ((this.bitField0_ & 65536) == 65536 && this.sleepGoal_ != null && this.sleepGoal_ != PhysData$PbSleepGoal.getDefaultInstance()) {
            this.sleepGoal_ = PhysData$PbSleepGoal.newBuilder(this.sleepGoal_).mergeFrom(var1).buildPartial();
         } else {
            this.sleepGoal_ = var1;
         }

         this.onChanged();
      } else {
         this.sleepGoalBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 65536;
      return this;
   }

   public PhysData$PbUserPhysData$Builder mergeSnapshotStartTime(Types$PbLocalDateTime var1) {
      if (this.snapshotStartTimeBuilder_ == null) {
         if ((this.bitField0_ & 262144) == 262144 && this.snapshotStartTime_ != null && this.snapshotStartTime_ != Types$PbLocalDateTime.getDefaultInstance()) {
            this.snapshotStartTime_ = Types$PbLocalDateTime.newBuilder(this.snapshotStartTime_).mergeFrom(var1).buildPartial();
         } else {
            this.snapshotStartTime_ = var1;
         }

         this.onChanged();
      } else {
         this.snapshotStartTimeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 262144;
      return this;
   }

   public PhysData$PbUserPhysData$Builder mergeTrainingBackground(PhysData$PbUserTrainingBackground var1) {
      if (this.trainingBackgroundBuilder_ == null) {
         if ((this.bitField0_ & 1024) == 1024 && this.trainingBackground_ != null && this.trainingBackground_ != PhysData$PbUserTrainingBackground.getDefaultInstance()) {
            this.trainingBackground_ = PhysData$PbUserTrainingBackground.newBuilder(this.trainingBackground_).mergeFrom(var1).buildPartial();
         } else {
            this.trainingBackground_ = var1;
         }

         this.onChanged();
      } else {
         this.trainingBackgroundBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public PhysData$PbUserPhysData$Builder mergeTypicalDay(PhysData$PbUserTypicalDay var1) {
      if (this.typicalDayBuilder_ == null) {
         if ((this.bitField0_ & 2048) == 2048 && this.typicalDay_ != null && this.typicalDay_ != PhysData$PbUserTypicalDay.getDefaultInstance()) {
            this.typicalDay_ = PhysData$PbUserTypicalDay.newBuilder(this.typicalDay_).mergeFrom(var1).buildPartial();
         } else {
            this.typicalDay_ = var1;
         }

         this.onChanged();
      } else {
         this.typicalDayBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2048;
      return this;
   }

   public final PhysData$PbUserPhysData$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PhysData$PbUserPhysData$Builder)super.mergeUnknownFields(var1);
   }

   public PhysData$PbUserPhysData$Builder mergeVo2Max(PhysData$PbUserVo2Max var1) {
      if (this.vo2MaxBuilder_ == null) {
         if ((this.bitField0_ & 512) == 512 && this.vo2Max_ != null && this.vo2Max_ != PhysData$PbUserVo2Max.getDefaultInstance()) {
            this.vo2Max_ = PhysData$PbUserVo2Max.newBuilder(this.vo2Max_).mergeFrom(var1).buildPartial();
         } else {
            this.vo2Max_ = var1;
         }

         this.onChanged();
      } else {
         this.vo2MaxBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 512;
      return this;
   }

   public PhysData$PbUserPhysData$Builder mergeWeeklyRecoveryTimeSum(PhysData$PbWeeklyRecoveryTimeSum var1) {
      if (this.weeklyRecoveryTimeSumBuilder_ == null) {
         if ((this.bitField0_ & 4096) == 4096 && this.weeklyRecoveryTimeSum_ != null && this.weeklyRecoveryTimeSum_ != PhysData$PbWeeklyRecoveryTimeSum.getDefaultInstance()) {
            this.weeklyRecoveryTimeSum_ = PhysData$PbWeeklyRecoveryTimeSum.newBuilder(this.weeklyRecoveryTimeSum_).mergeFrom(var1).buildPartial();
         } else {
            this.weeklyRecoveryTimeSum_ = var1;
         }

         this.onChanged();
      } else {
         this.weeklyRecoveryTimeSumBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4096;
      return this;
   }

   public PhysData$PbUserPhysData$Builder mergeWeight(PhysData$PbUserWeight var1) {
      if (this.weightBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.weight_ != null && this.weight_ != PhysData$PbUserWeight.getDefaultInstance()) {
            this.weight_ = PhysData$PbUserWeight.newBuilder(this.weight_).mergeFrom(var1).buildPartial();
         } else {
            this.weight_ = var1;
         }

         this.onChanged();
      } else {
         this.weightBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public PhysData$PbUserPhysData$Builder removeSensorCalibrationOffset(int var1) {
      if (this.sensorCalibrationOffsetBuilder_ == null) {
         this.ensureSensorCalibrationOffsetIsMutable();
         this.sensorCalibrationOffset_.remove(var1);
         this.onChanged();
      } else {
         this.sensorCalibrationOffsetBuilder_.remove(var1);
      }

      return this;
   }

   public PhysData$PbUserPhysData$Builder setAerobicThreshold(PhysData$PbUserHrAttribute$Builder var1) {
      if (this.aerobicThresholdBuilder_ == null) {
         this.aerobicThreshold_ = var1.build();
         this.onChanged();
      } else {
         this.aerobicThresholdBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 128;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setAerobicThreshold(PhysData$PbUserHrAttribute var1) {
      if (this.aerobicThresholdBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.aerobicThreshold_ = var1;
         this.onChanged();
      } else {
         this.aerobicThresholdBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 128;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setAnaerobicThreshold(PhysData$PbUserHrAttribute$Builder var1) {
      if (this.anaerobicThresholdBuilder_ == null) {
         this.anaerobicThreshold_ = var1.build();
         this.onChanged();
      } else {
         this.anaerobicThresholdBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 256;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setAnaerobicThreshold(PhysData$PbUserHrAttribute var1) {
      if (this.anaerobicThresholdBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.anaerobicThreshold_ = var1;
         this.onChanged();
      } else {
         this.anaerobicThresholdBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 256;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setBirthday(PhysData$PbUserBirthday$Builder var1) {
      if (this.birthdayBuilder_ == null) {
         this.birthday_ = var1.build();
         this.onChanged();
      } else {
         this.birthdayBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setBirthday(PhysData$PbUserBirthday var1) {
      if (this.birthdayBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.birthday_ = var1;
         this.onChanged();
      } else {
         this.birthdayBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setField(FieldDescriptor var1, Object var2) {
      return (PhysData$PbUserPhysData$Builder)super.setField(var1, var2);
   }

   public PhysData$PbUserPhysData$Builder setFunctionalThresholdPower(PhysData$PbUserFunctionalThresholdPower$Builder var1) {
      if (this.functionalThresholdPowerBuilder_ == null) {
         this.functionalThresholdPower_ = var1.build();
         this.onChanged();
      } else {
         this.functionalThresholdPowerBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 16384;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setFunctionalThresholdPower(PhysData$PbUserFunctionalThresholdPower var1) {
      if (this.functionalThresholdPowerBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.functionalThresholdPower_ = var1;
         this.onChanged();
      } else {
         this.functionalThresholdPowerBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 16384;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setGender(PhysData$PbUserGender$Builder var1) {
      if (this.genderBuilder_ == null) {
         this.gender_ = var1.build();
         this.onChanged();
      } else {
         this.genderBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setGender(PhysData$PbUserGender var1) {
      if (this.genderBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.gender_ = var1;
         this.onChanged();
      } else {
         this.genderBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setHeight(PhysData$PbUserHeight$Builder var1) {
      if (this.heightBuilder_ == null) {
         this.height_ = var1.build();
         this.onChanged();
      } else {
         this.heightBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setHeight(PhysData$PbUserHeight var1) {
      if (this.heightBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.height_ = var1;
         this.onChanged();
      } else {
         this.heightBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setLastModified(Types$PbSystemDateTime$Builder var1) {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = var1.build();
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 131072;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setLastModified(Types$PbSystemDateTime var1) {
      if (this.lastModifiedBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.lastModified_ = var1;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 131072;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setMaximumHeartrate(PhysData$PbUserHrAttribute$Builder var1) {
      if (this.maximumHeartrateBuilder_ == null) {
         this.maximumHeartrate_ = var1.build();
         this.onChanged();
      } else {
         this.maximumHeartrateBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 16;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setMaximumHeartrate(PhysData$PbUserHrAttribute var1) {
      if (this.maximumHeartrateBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.maximumHeartrate_ = var1;
         this.onChanged();
      } else {
         this.maximumHeartrateBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setOBSOLETESittingHeartrate(PhysData$PbUserHrAttribute$Builder var1) {
      if (this.oBSOLETESittingHeartrateBuilder_ == null) {
         this.oBSOLETESittingHeartrate_ = var1.build();
         this.onChanged();
      } else {
         this.oBSOLETESittingHeartrateBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 64;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setOBSOLETESittingHeartrate(PhysData$PbUserHrAttribute var1) {
      if (this.oBSOLETESittingHeartrateBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.oBSOLETESittingHeartrate_ = var1;
         this.onChanged();
      } else {
         this.oBSOLETESittingHeartrateBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setOBSOLETESpeedCalibrationOffset(PhysData$PbSpeedCalibrationOffset$Builder var1) {
      if (this.oBSOLETESpeedCalibrationOffsetBuilder_ == null) {
         this.oBSOLETESpeedCalibrationOffset_ = var1.build();
         this.onChanged();
      } else {
         this.oBSOLETESpeedCalibrationOffsetBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8192;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setOBSOLETESpeedCalibrationOffset(PhysData$PbSpeedCalibrationOffset var1) {
      if (this.oBSOLETESpeedCalibrationOffsetBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.oBSOLETESpeedCalibrationOffset_ = var1;
         this.onChanged();
      } else {
         this.oBSOLETESpeedCalibrationOffsetBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8192;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PhysData$PbUserPhysData$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public PhysData$PbUserPhysData$Builder setRestingHeartrate(PhysData$PbUserHrAttribute$Builder var1) {
      if (this.restingHeartrateBuilder_ == null) {
         this.restingHeartrate_ = var1.build();
         this.onChanged();
      } else {
         this.restingHeartrateBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 32;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setRestingHeartrate(PhysData$PbUserHrAttribute var1) {
      if (this.restingHeartrateBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.restingHeartrate_ = var1;
         this.onChanged();
      } else {
         this.restingHeartrateBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setSensorCalibrationOffset(int var1, Types$PbSensorCalibrationOffset$Builder var2) {
      if (this.sensorCalibrationOffsetBuilder_ == null) {
         this.ensureSensorCalibrationOffsetIsMutable();
         this.sensorCalibrationOffset_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.sensorCalibrationOffsetBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public PhysData$PbUserPhysData$Builder setSensorCalibrationOffset(int var1, Types$PbSensorCalibrationOffset var2) {
      if (this.sensorCalibrationOffsetBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureSensorCalibrationOffsetIsMutable();
         this.sensorCalibrationOffset_.set(var1, var2);
         this.onChanged();
      } else {
         this.sensorCalibrationOffsetBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public PhysData$PbUserPhysData$Builder setSleepGoal(PhysData$PbSleepGoal$Builder var1) {
      if (this.sleepGoalBuilder_ == null) {
         this.sleepGoal_ = var1.build();
         this.onChanged();
      } else {
         this.sleepGoalBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 65536;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setSleepGoal(PhysData$PbSleepGoal var1) {
      if (this.sleepGoalBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.sleepGoal_ = var1;
         this.onChanged();
      } else {
         this.sleepGoalBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 65536;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setSnapshotStartTime(Types$PbLocalDateTime$Builder var1) {
      if (this.snapshotStartTimeBuilder_ == null) {
         this.snapshotStartTime_ = var1.build();
         this.onChanged();
      } else {
         this.snapshotStartTimeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 262144;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setSnapshotStartTime(Types$PbLocalDateTime var1) {
      if (this.snapshotStartTimeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.snapshotStartTime_ = var1;
         this.onChanged();
      } else {
         this.snapshotStartTimeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 262144;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setTrainingBackground(PhysData$PbUserTrainingBackground$Builder var1) {
      if (this.trainingBackgroundBuilder_ == null) {
         this.trainingBackground_ = var1.build();
         this.onChanged();
      } else {
         this.trainingBackgroundBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setTrainingBackground(PhysData$PbUserTrainingBackground var1) {
      if (this.trainingBackgroundBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.trainingBackground_ = var1;
         this.onChanged();
      } else {
         this.trainingBackgroundBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setTypicalDay(PhysData$PbUserTypicalDay$Builder var1) {
      if (this.typicalDayBuilder_ == null) {
         this.typicalDay_ = var1.build();
         this.onChanged();
      } else {
         this.typicalDayBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2048;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setTypicalDay(PhysData$PbUserTypicalDay var1) {
      if (this.typicalDayBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.typicalDay_ = var1;
         this.onChanged();
      } else {
         this.typicalDayBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2048;
      return this;
   }

   public final PhysData$PbUserPhysData$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PhysData$PbUserPhysData$Builder)super.setUnknownFields(var1);
   }

   public PhysData$PbUserPhysData$Builder setVo2Max(PhysData$PbUserVo2Max$Builder var1) {
      if (this.vo2MaxBuilder_ == null) {
         this.vo2Max_ = var1.build();
         this.onChanged();
      } else {
         this.vo2MaxBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 512;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setVo2Max(PhysData$PbUserVo2Max var1) {
      if (this.vo2MaxBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.vo2Max_ = var1;
         this.onChanged();
      } else {
         this.vo2MaxBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 512;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setWeeklyRecoveryTimeSum(PhysData$PbWeeklyRecoveryTimeSum$Builder var1) {
      if (this.weeklyRecoveryTimeSumBuilder_ == null) {
         this.weeklyRecoveryTimeSum_ = var1.build();
         this.onChanged();
      } else {
         this.weeklyRecoveryTimeSumBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4096;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setWeeklyRecoveryTimeSum(PhysData$PbWeeklyRecoveryTimeSum var1) {
      if (this.weeklyRecoveryTimeSumBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.weeklyRecoveryTimeSum_ = var1;
         this.onChanged();
      } else {
         this.weeklyRecoveryTimeSumBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4096;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setWeight(PhysData$PbUserWeight$Builder var1) {
      if (this.weightBuilder_ == null) {
         this.weight_ = var1.build();
         this.onChanged();
      } else {
         this.weightBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public PhysData$PbUserPhysData$Builder setWeight(PhysData$PbUserWeight var1) {
      if (this.weightBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.weight_ = var1;
         this.onChanged();
      } else {
         this.weightBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }
}
