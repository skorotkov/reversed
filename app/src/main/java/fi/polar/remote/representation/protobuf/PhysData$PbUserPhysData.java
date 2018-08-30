package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class PhysData$PbUserPhysData extends GeneratedMessageV3 implements PhysData$PbUserPhysDataOrBuilder {
   public static final int AEROBIC_THRESHOLD_FIELD_NUMBER = 8;
   public static final int ANAEROBIC_THRESHOLD_FIELD_NUMBER = 9;
   public static final int BIRTHDAY_FIELD_NUMBER = 1;
   private static final PhysData$PbUserPhysData DEFAULT_INSTANCE = new PhysData$PbUserPhysData();
   public static final int FUNCTIONAL_THRESHOLD_POWER_FIELD_NUMBER = 15;
   public static final int GENDER_FIELD_NUMBER = 2;
   public static final int HEIGHT_FIELD_NUMBER = 4;
   public static final int LAST_MODIFIED_FIELD_NUMBER = 100;
   public static final int MAXIMUM_HEARTRATE_FIELD_NUMBER = 5;
   public static final int OBSOLETE_SITTING_HEARTRATE_FIELD_NUMBER = 7;
   public static final int OBSOLETE_SPEED_CALIBRATION_OFFSET_FIELD_NUMBER = 14;
   @Deprecated
   public static final Parser PARSER = new PhysData$PbUserPhysData$1();
   public static final int RESTING_HEARTRATE_FIELD_NUMBER = 6;
   public static final int SENSOR_CALIBRATION_OFFSET_FIELD_NUMBER = 16;
   public static final int SLEEP_GOAL_FIELD_NUMBER = 17;
   public static final int SNAPSHOT_START_TIME_FIELD_NUMBER = 101;
   public static final int TRAINING_BACKGROUND_FIELD_NUMBER = 11;
   public static final int TYPICAL_DAY_FIELD_NUMBER = 12;
   public static final int VO2MAX_FIELD_NUMBER = 10;
   public static final int WEEKLY_RECOVERY_TIME_SUM_FIELD_NUMBER = 13;
   public static final int WEIGHT_FIELD_NUMBER = 3;
   private static final long serialVersionUID = 0L;
   private PhysData$PbUserHrAttribute aerobicThreshold_;
   private PhysData$PbUserHrAttribute anaerobicThreshold_;
   private PhysData$PbUserBirthday birthday_;
   private int bitField0_;
   private PhysData$PbUserFunctionalThresholdPower functionalThresholdPower_;
   private PhysData$PbUserGender gender_;
   private PhysData$PbUserHeight height_;
   private Types$PbSystemDateTime lastModified_;
   private PhysData$PbUserHrAttribute maximumHeartrate_;
   private byte memoizedIsInitialized;
   private PhysData$PbUserHrAttribute oBSOLETESittingHeartrate_;
   private PhysData$PbSpeedCalibrationOffset oBSOLETESpeedCalibrationOffset_;
   private PhysData$PbUserHrAttribute restingHeartrate_;
   private List sensorCalibrationOffset_;
   private PhysData$PbSleepGoal sleepGoal_;
   private Types$PbLocalDateTime snapshotStartTime_;
   private PhysData$PbUserTrainingBackground trainingBackground_;
   private PhysData$PbUserTypicalDay typicalDay_;
   private PhysData$PbUserVo2Max vo2Max_;
   private PhysData$PbWeeklyRecoveryTimeSum weeklyRecoveryTimeSum_;
   private PhysData$PbUserWeight weight_;

   private PhysData$PbUserPhysData() {
      this.memoizedIsInitialized = (byte)-1;
      this.sensorCalibrationOffset_ = Collections.emptyList();
   }

   private PhysData$PbUserPhysData(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PhysData$PbUserPhysData(CodedInputStream var1, ExtensionRegistryLite var2, PhysData$1 var3) {
      this(var1, var2);
   }

   private PhysData$PbUserPhysData(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PhysData$PbUserPhysData(Builder var1, PhysData$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PhysData$PbUserPhysData var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static PhysData$PbSleepGoal a(PhysData$PbUserPhysData var0, PhysData$PbSleepGoal var1) {
      var0.sleepGoal_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static PhysData$PbSpeedCalibrationOffset a(PhysData$PbUserPhysData var0, PhysData$PbSpeedCalibrationOffset var1) {
      var0.oBSOLETESpeedCalibrationOffset_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static PhysData$PbUserBirthday a(PhysData$PbUserPhysData var0, PhysData$PbUserBirthday var1) {
      var0.birthday_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static PhysData$PbUserFunctionalThresholdPower a(PhysData$PbUserPhysData var0, PhysData$PbUserFunctionalThresholdPower var1) {
      var0.functionalThresholdPower_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static PhysData$PbUserGender a(PhysData$PbUserPhysData var0, PhysData$PbUserGender var1) {
      var0.gender_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static PhysData$PbUserHeight a(PhysData$PbUserPhysData var0, PhysData$PbUserHeight var1) {
      var0.height_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static PhysData$PbUserHrAttribute a(PhysData$PbUserPhysData var0, PhysData$PbUserHrAttribute var1) {
      var0.maximumHeartrate_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static PhysData$PbUserTrainingBackground a(PhysData$PbUserPhysData var0, PhysData$PbUserTrainingBackground var1) {
      var0.trainingBackground_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static PhysData$PbUserTypicalDay a(PhysData$PbUserPhysData var0, PhysData$PbUserTypicalDay var1) {
      var0.typicalDay_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static PhysData$PbUserVo2Max a(PhysData$PbUserPhysData var0, PhysData$PbUserVo2Max var1) {
      var0.vo2Max_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static PhysData$PbUserWeight a(PhysData$PbUserPhysData var0, PhysData$PbUserWeight var1) {
      var0.weight_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static PhysData$PbWeeklyRecoveryTimeSum a(PhysData$PbUserPhysData var0, PhysData$PbWeeklyRecoveryTimeSum var1) {
      var0.weeklyRecoveryTimeSum_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbLocalDateTime a(PhysData$PbUserPhysData var0, Types$PbLocalDateTime var1) {
      var0.snapshotStartTime_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime a(PhysData$PbUserPhysData var0, Types$PbSystemDateTime var1) {
      var0.lastModified_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List a(PhysData$PbUserPhysData var0) {
      return var0.sensorCalibrationOffset_;
   }

   // $FF: synthetic method
   static List a(PhysData$PbUserPhysData var0, List var1) {
      var0.sensorCalibrationOffset_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(PhysData$PbUserPhysData var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static PhysData$PbUserHrAttribute b(PhysData$PbUserPhysData var0, PhysData$PbUserHrAttribute var1) {
      var0.restingHeartrate_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static PhysData$PbUserHrAttribute c(PhysData$PbUserPhysData var0, PhysData$PbUserHrAttribute var1) {
      var0.oBSOLETESittingHeartrate_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean c() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static PhysData$PbUserHrAttribute d(PhysData$PbUserPhysData var0, PhysData$PbUserHrAttribute var1) {
      var0.aerobicThreshold_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static PhysData$PbUserHrAttribute e(PhysData$PbUserPhysData var0, PhysData$PbUserHrAttribute var1) {
      var0.anaerobicThreshold_ = var1;
      return var1;
   }

   public static PhysData$PbUserPhysData getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PhysData.y();
   }

   public static PhysData$PbUserPhysData$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PhysData$PbUserPhysData$Builder newBuilder(PhysData$PbUserPhysData var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PhysData$PbUserPhysData parseDelimitedFrom(InputStream var0) {
      return (PhysData$PbUserPhysData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PhysData$PbUserPhysData parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PhysData$PbUserPhysData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PhysData$PbUserPhysData parseFrom(ByteString var0) {
      return (PhysData$PbUserPhysData)PARSER.parseFrom(var0);
   }

   public static PhysData$PbUserPhysData parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PhysData$PbUserPhysData)PARSER.parseFrom(var0, var1);
   }

   public static PhysData$PbUserPhysData parseFrom(CodedInputStream var0) {
      return (PhysData$PbUserPhysData)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PhysData$PbUserPhysData parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PhysData$PbUserPhysData)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PhysData$PbUserPhysData parseFrom(InputStream var0) {
      return (PhysData$PbUserPhysData)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PhysData$PbUserPhysData parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PhysData$PbUserPhysData)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PhysData$PbUserPhysData parseFrom(byte[] var0) {
      return (PhysData$PbUserPhysData)PARSER.parseFrom(var0);
   }

   public static PhysData$PbUserPhysData parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PhysData$PbUserPhysData)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PhysData$PbUserPhysData)) {
            var2 = super.equals(var1);
         } else {
            PhysData$PbUserPhysData var5 = (PhysData$PbUserPhysData)var1;
            boolean var3;
            if (this.hasBirthday() == var5.hasBirthday()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasBirthday()) {
               if (var3 && this.getBirthday().equals(var5.getBirthday())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasGender() == var5.hasGender()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasGender()) {
               if (var4 && this.getGender().equals(var5.getGender())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasWeight() == var5.hasWeight()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasWeight()) {
               if (var4 && this.getWeight().equals(var5.getWeight())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasHeight() == var5.hasHeight()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasHeight()) {
               if (var3 && this.getHeight().equals(var5.getHeight())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasMaximumHeartrate() == var5.hasMaximumHeartrate()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasMaximumHeartrate()) {
               if (var4 && this.getMaximumHeartrate().equals(var5.getMaximumHeartrate())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasRestingHeartrate() == var5.hasRestingHeartrate()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasRestingHeartrate()) {
               if (var4 && this.getRestingHeartrate().equals(var5.getRestingHeartrate())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasOBSOLETESittingHeartrate() == var5.hasOBSOLETESittingHeartrate()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasOBSOLETESittingHeartrate()) {
               if (var4 && this.getOBSOLETESittingHeartrate().equals(var5.getOBSOLETESittingHeartrate())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasAerobicThreshold() == var5.hasAerobicThreshold()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasAerobicThreshold()) {
               if (var3 && this.getAerobicThreshold().equals(var5.getAerobicThreshold())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAnaerobicThreshold() == var5.hasAnaerobicThreshold()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasAnaerobicThreshold()) {
               if (var3 && this.getAnaerobicThreshold().equals(var5.getAnaerobicThreshold())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasVo2Max() == var5.hasVo2Max()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasVo2Max()) {
               if (var3 && this.getVo2Max().equals(var5.getVo2Max())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTrainingBackground() == var5.hasTrainingBackground()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasTrainingBackground()) {
               if (var4 && this.getTrainingBackground().equals(var5.getTrainingBackground())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasTypicalDay() == var5.hasTypicalDay()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasTypicalDay()) {
               if (var3 && this.getTypicalDay().equals(var5.getTypicalDay())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasWeeklyRecoveryTimeSum() == var5.hasWeeklyRecoveryTimeSum()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasWeeklyRecoveryTimeSum()) {
               if (var4 && this.getWeeklyRecoveryTimeSum().equals(var5.getWeeklyRecoveryTimeSum())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasOBSOLETESpeedCalibrationOffset() == var5.hasOBSOLETESpeedCalibrationOffset()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasOBSOLETESpeedCalibrationOffset()) {
               if (var3 && this.getOBSOLETESpeedCalibrationOffset().equals(var5.getOBSOLETESpeedCalibrationOffset())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasFunctionalThresholdPower() == var5.hasFunctionalThresholdPower()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasFunctionalThresholdPower()) {
               if (var3 && this.getFunctionalThresholdPower().equals(var5.getFunctionalThresholdPower())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.getSensorCalibrationOffsetList().equals(var5.getSensorCalibrationOffsetList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.hasSleepGoal() == var5.hasSleepGoal()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSleepGoal()) {
               if (var3 && this.getSleepGoal().equals(var5.getSleepGoal())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasLastModified() == var5.hasLastModified()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasLastModified()) {
               if (var3 && this.getLastModified().equals(var5.getLastModified())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSnapshotStartTime() == var5.hasSnapshotStartTime()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSnapshotStartTime()) {
               if (var4 && this.getSnapshotStartTime().equals(var5.getSnapshotStartTime())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (!var3 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public PhysData$PbUserHrAttribute getAerobicThreshold() {
      PhysData$PbUserHrAttribute var1;
      if (this.aerobicThreshold_ == null) {
         var1 = PhysData$PbUserHrAttribute.getDefaultInstance();
      } else {
         var1 = this.aerobicThreshold_;
      }

      return var1;
   }

   public PhysData$PbUserHrAttributeOrBuilder getAerobicThresholdOrBuilder() {
      PhysData$PbUserHrAttribute var1;
      if (this.aerobicThreshold_ == null) {
         var1 = PhysData$PbUserHrAttribute.getDefaultInstance();
      } else {
         var1 = this.aerobicThreshold_;
      }

      return var1;
   }

   public PhysData$PbUserHrAttribute getAnaerobicThreshold() {
      PhysData$PbUserHrAttribute var1;
      if (this.anaerobicThreshold_ == null) {
         var1 = PhysData$PbUserHrAttribute.getDefaultInstance();
      } else {
         var1 = this.anaerobicThreshold_;
      }

      return var1;
   }

   public PhysData$PbUserHrAttributeOrBuilder getAnaerobicThresholdOrBuilder() {
      PhysData$PbUserHrAttribute var1;
      if (this.anaerobicThreshold_ == null) {
         var1 = PhysData$PbUserHrAttribute.getDefaultInstance();
      } else {
         var1 = this.anaerobicThreshold_;
      }

      return var1;
   }

   public PhysData$PbUserBirthday getBirthday() {
      PhysData$PbUserBirthday var1;
      if (this.birthday_ == null) {
         var1 = PhysData$PbUserBirthday.getDefaultInstance();
      } else {
         var1 = this.birthday_;
      }

      return var1;
   }

   public PhysData$PbUserBirthdayOrBuilder getBirthdayOrBuilder() {
      PhysData$PbUserBirthday var1;
      if (this.birthday_ == null) {
         var1 = PhysData$PbUserBirthday.getDefaultInstance();
      } else {
         var1 = this.birthday_;
      }

      return var1;
   }

   public PhysData$PbUserPhysData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public PhysData$PbUserFunctionalThresholdPower getFunctionalThresholdPower() {
      PhysData$PbUserFunctionalThresholdPower var1;
      if (this.functionalThresholdPower_ == null) {
         var1 = PhysData$PbUserFunctionalThresholdPower.getDefaultInstance();
      } else {
         var1 = this.functionalThresholdPower_;
      }

      return var1;
   }

   public PhysData$PbUserFunctionalThresholdPowerOrBuilder getFunctionalThresholdPowerOrBuilder() {
      PhysData$PbUserFunctionalThresholdPower var1;
      if (this.functionalThresholdPower_ == null) {
         var1 = PhysData$PbUserFunctionalThresholdPower.getDefaultInstance();
      } else {
         var1 = this.functionalThresholdPower_;
      }

      return var1;
   }

   public PhysData$PbUserGender getGender() {
      PhysData$PbUserGender var1;
      if (this.gender_ == null) {
         var1 = PhysData$PbUserGender.getDefaultInstance();
      } else {
         var1 = this.gender_;
      }

      return var1;
   }

   public PhysData$PbUserGenderOrBuilder getGenderOrBuilder() {
      PhysData$PbUserGender var1;
      if (this.gender_ == null) {
         var1 = PhysData$PbUserGender.getDefaultInstance();
      } else {
         var1 = this.gender_;
      }

      return var1;
   }

   public PhysData$PbUserHeight getHeight() {
      PhysData$PbUserHeight var1;
      if (this.height_ == null) {
         var1 = PhysData$PbUserHeight.getDefaultInstance();
      } else {
         var1 = this.height_;
      }

      return var1;
   }

   public PhysData$PbUserHeightOrBuilder getHeightOrBuilder() {
      PhysData$PbUserHeight var1;
      if (this.height_ == null) {
         var1 = PhysData$PbUserHeight.getDefaultInstance();
      } else {
         var1 = this.height_;
      }

      return var1;
   }

   public Types$PbSystemDateTime getLastModified() {
      Types$PbSystemDateTime var1;
      if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
      }

      return var1;
   }

   public Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder() {
      Types$PbSystemDateTime var1;
      if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
      }

      return var1;
   }

   public PhysData$PbUserHrAttribute getMaximumHeartrate() {
      PhysData$PbUserHrAttribute var1;
      if (this.maximumHeartrate_ == null) {
         var1 = PhysData$PbUserHrAttribute.getDefaultInstance();
      } else {
         var1 = this.maximumHeartrate_;
      }

      return var1;
   }

   public PhysData$PbUserHrAttributeOrBuilder getMaximumHeartrateOrBuilder() {
      PhysData$PbUserHrAttribute var1;
      if (this.maximumHeartrate_ == null) {
         var1 = PhysData$PbUserHrAttribute.getDefaultInstance();
      } else {
         var1 = this.maximumHeartrate_;
      }

      return var1;
   }

   public PhysData$PbUserHrAttribute getOBSOLETESittingHeartrate() {
      PhysData$PbUserHrAttribute var1;
      if (this.oBSOLETESittingHeartrate_ == null) {
         var1 = PhysData$PbUserHrAttribute.getDefaultInstance();
      } else {
         var1 = this.oBSOLETESittingHeartrate_;
      }

      return var1;
   }

   public PhysData$PbUserHrAttributeOrBuilder getOBSOLETESittingHeartrateOrBuilder() {
      PhysData$PbUserHrAttribute var1;
      if (this.oBSOLETESittingHeartrate_ == null) {
         var1 = PhysData$PbUserHrAttribute.getDefaultInstance();
      } else {
         var1 = this.oBSOLETESittingHeartrate_;
      }

      return var1;
   }

   public PhysData$PbSpeedCalibrationOffset getOBSOLETESpeedCalibrationOffset() {
      PhysData$PbSpeedCalibrationOffset var1;
      if (this.oBSOLETESpeedCalibrationOffset_ == null) {
         var1 = PhysData$PbSpeedCalibrationOffset.getDefaultInstance();
      } else {
         var1 = this.oBSOLETESpeedCalibrationOffset_;
      }

      return var1;
   }

   public PhysData$PbSpeedCalibrationOffsetOrBuilder getOBSOLETESpeedCalibrationOffsetOrBuilder() {
      PhysData$PbSpeedCalibrationOffset var1;
      if (this.oBSOLETESpeedCalibrationOffset_ == null) {
         var1 = PhysData$PbSpeedCalibrationOffset.getDefaultInstance();
      } else {
         var1 = this.oBSOLETESpeedCalibrationOffset_;
      }

      return var1;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public PhysData$PbUserHrAttribute getRestingHeartrate() {
      PhysData$PbUserHrAttribute var1;
      if (this.restingHeartrate_ == null) {
         var1 = PhysData$PbUserHrAttribute.getDefaultInstance();
      } else {
         var1 = this.restingHeartrate_;
      }

      return var1;
   }

   public PhysData$PbUserHrAttributeOrBuilder getRestingHeartrateOrBuilder() {
      PhysData$PbUserHrAttribute var1;
      if (this.restingHeartrate_ == null) {
         var1 = PhysData$PbUserHrAttribute.getDefaultInstance();
      } else {
         var1 = this.restingHeartrate_;
      }

      return var1;
   }

   public Types$PbSensorCalibrationOffset getSensorCalibrationOffset(int var1) {
      return (Types$PbSensorCalibrationOffset)this.sensorCalibrationOffset_.get(var1);
   }

   public int getSensorCalibrationOffsetCount() {
      return this.sensorCalibrationOffset_.size();
   }

   public List getSensorCalibrationOffsetList() {
      return this.sensorCalibrationOffset_;
   }

   public Types$PbSensorCalibrationOffsetOrBuilder getSensorCalibrationOffsetOrBuilder(int var1) {
      return (Types$PbSensorCalibrationOffsetOrBuilder)this.sensorCalibrationOffset_.get(var1);
   }

   public List getSensorCalibrationOffsetOrBuilderList() {
      return this.sensorCalibrationOffset_;
   }

   public int getSerializedSize() {
      byte var1 = 0;
      int var2 = this.memoizedSize;
      if (var2 == -1) {
         int var3;
         if ((this.bitField0_ & 1) == 1) {
            var3 = CodedOutputStream.computeMessageSize(1, this.getBirthday()) + 0;
         } else {
            var3 = 0;
         }

         var2 = var3;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var3 + CodedOutputStream.computeMessageSize(2, this.getGender());
         }

         int var4 = var2;
         if ((this.bitField0_ & 4) == 4) {
            var4 = var2 + CodedOutputStream.computeMessageSize(3, this.getWeight());
         }

         var3 = var4;
         if ((this.bitField0_ & 8) == 8) {
            var3 = var4 + CodedOutputStream.computeMessageSize(4, this.getHeight());
         }

         var2 = var3;
         if ((this.bitField0_ & 16) == 16) {
            var2 = var3 + CodedOutputStream.computeMessageSize(5, this.getMaximumHeartrate());
         }

         var3 = var2;
         if ((this.bitField0_ & 32) == 32) {
            var3 = var2 + CodedOutputStream.computeMessageSize(6, this.getRestingHeartrate());
         }

         var2 = var3;
         if ((this.bitField0_ & 64) == 64) {
            var2 = var3 + CodedOutputStream.computeMessageSize(7, this.getOBSOLETESittingHeartrate());
         }

         var3 = var2;
         if ((this.bitField0_ & 128) == 128) {
            var3 = var2 + CodedOutputStream.computeMessageSize(8, this.getAerobicThreshold());
         }

         var2 = var3;
         if ((this.bitField0_ & 256) == 256) {
            var2 = var3 + CodedOutputStream.computeMessageSize(9, this.getAnaerobicThreshold());
         }

         var3 = var2;
         if ((this.bitField0_ & 512) == 512) {
            var3 = var2 + CodedOutputStream.computeMessageSize(10, this.getVo2Max());
         }

         var2 = var3;
         if ((this.bitField0_ & 1024) == 1024) {
            var2 = var3 + CodedOutputStream.computeMessageSize(11, this.getTrainingBackground());
         }

         var4 = var2;
         if ((this.bitField0_ & 2048) == 2048) {
            var4 = var2 + CodedOutputStream.computeMessageSize(12, this.getTypicalDay());
         }

         var3 = var4;
         if ((this.bitField0_ & 4096) == 4096) {
            var3 = var4 + CodedOutputStream.computeMessageSize(13, this.getWeeklyRecoveryTimeSum());
         }

         var2 = var3;
         if ((this.bitField0_ & 8192) == 8192) {
            var2 = var3 + CodedOutputStream.computeMessageSize(14, this.getOBSOLETESpeedCalibrationOffset());
         }

         var3 = var2;
         if ((this.bitField0_ & 16384) == 16384) {
            var3 = var2 + CodedOutputStream.computeMessageSize(15, this.getFunctionalThresholdPower());
         }

         var2 = var3;

         for(var3 = var1; var3 < this.sensorCalibrationOffset_.size(); var2 += var4) {
            var4 = CodedOutputStream.computeMessageSize(16, (MessageLite)this.sensorCalibrationOffset_.get(var3));
            ++var3;
         }

         var3 = var2;
         if ((this.bitField0_ & '耀') == 32768) {
            var3 = var2 + CodedOutputStream.computeMessageSize(17, this.getSleepGoal());
         }

         var2 = var3;
         if ((this.bitField0_ & 65536) == 65536) {
            var2 = var3 + CodedOutputStream.computeMessageSize(100, this.getLastModified());
         }

         var3 = var2;
         if ((this.bitField0_ & 131072) == 131072) {
            var3 = var2 + CodedOutputStream.computeMessageSize(101, this.getSnapshotStartTime());
         }

         var2 = this.unknownFields.getSerializedSize() + var3;
         this.memoizedSize = var2;
      }

      return var2;
   }

   public PhysData$PbSleepGoal getSleepGoal() {
      PhysData$PbSleepGoal var1;
      if (this.sleepGoal_ == null) {
         var1 = PhysData$PbSleepGoal.getDefaultInstance();
      } else {
         var1 = this.sleepGoal_;
      }

      return var1;
   }

   public PhysData$PbSleepGoalOrBuilder getSleepGoalOrBuilder() {
      PhysData$PbSleepGoal var1;
      if (this.sleepGoal_ == null) {
         var1 = PhysData$PbSleepGoal.getDefaultInstance();
      } else {
         var1 = this.sleepGoal_;
      }

      return var1;
   }

   public Types$PbLocalDateTime getSnapshotStartTime() {
      Types$PbLocalDateTime var1;
      if (this.snapshotStartTime_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.snapshotStartTime_;
      }

      return var1;
   }

   public Types$PbLocalDateTimeOrBuilder getSnapshotStartTimeOrBuilder() {
      Types$PbLocalDateTime var1;
      if (this.snapshotStartTime_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.snapshotStartTime_;
      }

      return var1;
   }

   public PhysData$PbUserTrainingBackground getTrainingBackground() {
      PhysData$PbUserTrainingBackground var1;
      if (this.trainingBackground_ == null) {
         var1 = PhysData$PbUserTrainingBackground.getDefaultInstance();
      } else {
         var1 = this.trainingBackground_;
      }

      return var1;
   }

   public PhysData$PbUserTrainingBackgroundOrBuilder getTrainingBackgroundOrBuilder() {
      PhysData$PbUserTrainingBackground var1;
      if (this.trainingBackground_ == null) {
         var1 = PhysData$PbUserTrainingBackground.getDefaultInstance();
      } else {
         var1 = this.trainingBackground_;
      }

      return var1;
   }

   public PhysData$PbUserTypicalDay getTypicalDay() {
      PhysData$PbUserTypicalDay var1;
      if (this.typicalDay_ == null) {
         var1 = PhysData$PbUserTypicalDay.getDefaultInstance();
      } else {
         var1 = this.typicalDay_;
      }

      return var1;
   }

   public PhysData$PbUserTypicalDayOrBuilder getTypicalDayOrBuilder() {
      PhysData$PbUserTypicalDay var1;
      if (this.typicalDay_ == null) {
         var1 = PhysData$PbUserTypicalDay.getDefaultInstance();
      } else {
         var1 = this.typicalDay_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public PhysData$PbUserVo2Max getVo2Max() {
      PhysData$PbUserVo2Max var1;
      if (this.vo2Max_ == null) {
         var1 = PhysData$PbUserVo2Max.getDefaultInstance();
      } else {
         var1 = this.vo2Max_;
      }

      return var1;
   }

   public PhysData$PbUserVo2MaxOrBuilder getVo2MaxOrBuilder() {
      PhysData$PbUserVo2Max var1;
      if (this.vo2Max_ == null) {
         var1 = PhysData$PbUserVo2Max.getDefaultInstance();
      } else {
         var1 = this.vo2Max_;
      }

      return var1;
   }

   public PhysData$PbWeeklyRecoveryTimeSum getWeeklyRecoveryTimeSum() {
      PhysData$PbWeeklyRecoveryTimeSum var1;
      if (this.weeklyRecoveryTimeSum_ == null) {
         var1 = PhysData$PbWeeklyRecoveryTimeSum.getDefaultInstance();
      } else {
         var1 = this.weeklyRecoveryTimeSum_;
      }

      return var1;
   }

   public PhysData$PbWeeklyRecoveryTimeSumOrBuilder getWeeklyRecoveryTimeSumOrBuilder() {
      PhysData$PbWeeklyRecoveryTimeSum var1;
      if (this.weeklyRecoveryTimeSum_ == null) {
         var1 = PhysData$PbWeeklyRecoveryTimeSum.getDefaultInstance();
      } else {
         var1 = this.weeklyRecoveryTimeSum_;
      }

      return var1;
   }

   public PhysData$PbUserWeight getWeight() {
      PhysData$PbUserWeight var1;
      if (this.weight_ == null) {
         var1 = PhysData$PbUserWeight.getDefaultInstance();
      } else {
         var1 = this.weight_;
      }

      return var1;
   }

   public PhysData$PbUserWeightOrBuilder getWeightOrBuilder() {
      PhysData$PbUserWeight var1;
      if (this.weight_ == null) {
         var1 = PhysData$PbUserWeight.getDefaultInstance();
      } else {
         var1 = this.weight_;
      }

      return var1;
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
      if ((this.bitField0_ & 65536) == 65536) {
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
      if ((this.bitField0_ & '耀') == 32768) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSnapshotStartTime() {
      boolean var1;
      if ((this.bitField0_ & 131072) == 131072) {
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

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.hasBirthday()) {
            var1 = (var2 * 37 + 1) * 53 + this.getBirthday().hashCode();
         }

         int var3 = var1;
         if (this.hasGender()) {
            var3 = (var1 * 37 + 2) * 53 + this.getGender().hashCode();
         }

         var2 = var3;
         if (this.hasWeight()) {
            var2 = (var3 * 37 + 3) * 53 + this.getWeight().hashCode();
         }

         var1 = var2;
         if (this.hasHeight()) {
            var1 = (var2 * 37 + 4) * 53 + this.getHeight().hashCode();
         }

         var2 = var1;
         if (this.hasMaximumHeartrate()) {
            var2 = (var1 * 37 + 5) * 53 + this.getMaximumHeartrate().hashCode();
         }

         var1 = var2;
         if (this.hasRestingHeartrate()) {
            var1 = (var2 * 37 + 6) * 53 + this.getRestingHeartrate().hashCode();
         }

         var2 = var1;
         if (this.hasOBSOLETESittingHeartrate()) {
            var2 = (var1 * 37 + 7) * 53 + this.getOBSOLETESittingHeartrate().hashCode();
         }

         var1 = var2;
         if (this.hasAerobicThreshold()) {
            var1 = (var2 * 37 + 8) * 53 + this.getAerobicThreshold().hashCode();
         }

         var2 = var1;
         if (this.hasAnaerobicThreshold()) {
            var2 = (var1 * 37 + 9) * 53 + this.getAnaerobicThreshold().hashCode();
         }

         var1 = var2;
         if (this.hasVo2Max()) {
            var1 = (var2 * 37 + 10) * 53 + this.getVo2Max().hashCode();
         }

         var3 = var1;
         if (this.hasTrainingBackground()) {
            var3 = (var1 * 37 + 11) * 53 + this.getTrainingBackground().hashCode();
         }

         var2 = var3;
         if (this.hasTypicalDay()) {
            var2 = (var3 * 37 + 12) * 53 + this.getTypicalDay().hashCode();
         }

         var1 = var2;
         if (this.hasWeeklyRecoveryTimeSum()) {
            var1 = (var2 * 37 + 13) * 53 + this.getWeeklyRecoveryTimeSum().hashCode();
         }

         var2 = var1;
         if (this.hasOBSOLETESpeedCalibrationOffset()) {
            var2 = (var1 * 37 + 14) * 53 + this.getOBSOLETESpeedCalibrationOffset().hashCode();
         }

         var1 = var2;
         if (this.hasFunctionalThresholdPower()) {
            var1 = (var2 * 37 + 15) * 53 + this.getFunctionalThresholdPower().hashCode();
         }

         var2 = var1;
         if (this.getSensorCalibrationOffsetCount() > 0) {
            var2 = (var1 * 37 + 16) * 53 + this.getSensorCalibrationOffsetList().hashCode();
         }

         var1 = var2;
         if (this.hasSleepGoal()) {
            var1 = (var2 * 37 + 17) * 53 + this.getSleepGoal().hashCode();
         }

         var2 = var1;
         if (this.hasLastModified()) {
            var2 = (var1 * 37 + 100) * 53 + this.getLastModified().hashCode();
         }

         var1 = var2;
         if (this.hasSnapshotStartTime()) {
            var1 = (var2 * 37 + 101) * 53 + this.getSnapshotStartTime().hashCode();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PhysData.z().ensureFieldAccessorsInitialized(PhysData$PbUserPhysData.class, PhysData$PbUserPhysData$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      byte var2 = this.memoizedIsInitialized;
      boolean var3;
      if (var2 == 1) {
         var3 = true;
      } else {
         var3 = var1;
         if (var2 != 0) {
            if (!this.hasBirthday()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.hasGender()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.getBirthday().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.getGender().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (this.hasWeight() && !this.getWeight().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (this.hasHeight() && !this.getHeight().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (this.hasMaximumHeartrate() && !this.getMaximumHeartrate().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (this.hasRestingHeartrate() && !this.getRestingHeartrate().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (this.hasOBSOLETESittingHeartrate() && !this.getOBSOLETESittingHeartrate().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (this.hasAerobicThreshold() && !this.getAerobicThreshold().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (this.hasAnaerobicThreshold() && !this.getAnaerobicThreshold().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (this.hasVo2Max() && !this.getVo2Max().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (this.hasTrainingBackground() && !this.getTrainingBackground().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (this.hasTypicalDay() && !this.getTypicalDay().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (this.hasWeeklyRecoveryTimeSum() && !this.getWeeklyRecoveryTimeSum().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (this.hasOBSOLETESpeedCalibrationOffset() && !this.getOBSOLETESpeedCalibrationOffset().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (this.hasFunctionalThresholdPower() && !this.getFunctionalThresholdPower().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else {
               int var4 = 0;

               while(true) {
                  if (var4 >= this.getSensorCalibrationOffsetCount()) {
                     if (this.hasLastModified() && !this.getLastModified().isInitialized()) {
                        this.memoizedIsInitialized = (byte)0;
                        var3 = var1;
                     } else if (this.hasSnapshotStartTime() && !this.getSnapshotStartTime().isInitialized()) {
                        this.memoizedIsInitialized = (byte)0;
                        var3 = var1;
                     } else {
                        this.memoizedIsInitialized = (byte)1;
                        var3 = true;
                     }
                     break;
                  }

                  if (!this.getSensorCalibrationOffset(var4).isInitialized()) {
                     this.memoizedIsInitialized = (byte)0;
                     var3 = var1;
                     break;
                  }

                  ++var4;
               }
            }
         }
      }

      return var3;
   }

   public PhysData$PbUserPhysData$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PhysData$PbUserPhysData$Builder newBuilderForType(BuilderParent var1) {
      return new PhysData$PbUserPhysData$Builder(var1, (PhysData$1)null);
   }

   public PhysData$PbUserPhysData$Builder toBuilder() {
      PhysData$PbUserPhysData$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PhysData$PbUserPhysData$Builder((PhysData$1)null);
      } else {
         var1 = (new PhysData$PbUserPhysData$Builder((PhysData$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getBirthday());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getGender());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getWeight());
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeMessage(4, this.getHeight());
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeMessage(5, this.getMaximumHeartrate());
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeMessage(6, this.getRestingHeartrate());
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeMessage(7, this.getOBSOLETESittingHeartrate());
      }

      if ((this.bitField0_ & 128) == 128) {
         var1.writeMessage(8, this.getAerobicThreshold());
      }

      if ((this.bitField0_ & 256) == 256) {
         var1.writeMessage(9, this.getAnaerobicThreshold());
      }

      if ((this.bitField0_ & 512) == 512) {
         var1.writeMessage(10, this.getVo2Max());
      }

      if ((this.bitField0_ & 1024) == 1024) {
         var1.writeMessage(11, this.getTrainingBackground());
      }

      if ((this.bitField0_ & 2048) == 2048) {
         var1.writeMessage(12, this.getTypicalDay());
      }

      if ((this.bitField0_ & 4096) == 4096) {
         var1.writeMessage(13, this.getWeeklyRecoveryTimeSum());
      }

      if ((this.bitField0_ & 8192) == 8192) {
         var1.writeMessage(14, this.getOBSOLETESpeedCalibrationOffset());
      }

      if ((this.bitField0_ & 16384) == 16384) {
         var1.writeMessage(15, this.getFunctionalThresholdPower());
      }

      for(int var2 = 0; var2 < this.sensorCalibrationOffset_.size(); ++var2) {
         var1.writeMessage(16, (MessageLite)this.sensorCalibrationOffset_.get(var2));
      }

      if ((this.bitField0_ & '耀') == 32768) {
         var1.writeMessage(17, this.getSleepGoal());
      }

      if ((this.bitField0_ & 65536) == 65536) {
         var1.writeMessage(100, this.getLastModified());
      }

      if ((this.bitField0_ & 131072) == 131072) {
         var1.writeMessage(101, this.getSnapshotStartTime());
      }

      this.unknownFields.writeTo(var1);
   }
}
