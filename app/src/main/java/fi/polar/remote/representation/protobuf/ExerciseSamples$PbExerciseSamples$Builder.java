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
import com.google.protobuf.Internal.ListAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class ExerciseSamples$PbExerciseSamples$Builder extends Builder implements ExerciseSamples$PbExerciseSamplesOrBuilder {
   private RepeatedFieldBuilderV3 altitudeCalibrationBuilder_;
   private List altitudeCalibration_;
   private RepeatedFieldBuilderV3 altitudeOfflineBuilder_;
   private List altitudeOffline_;
   private List altitudeSamples_;
   private int bitField0_;
   private RepeatedFieldBuilderV3 cadenceOfflineBuilder_;
   private List cadenceOffline_;
   private List cadenceSamples_;
   private RepeatedFieldBuilderV3 distanceOfflineBuilder_;
   private List distanceOffline_;
   private List distanceSamples_;
   private RepeatedFieldBuilderV3 exerciseIntervalledSampleListBuilder_;
   private List exerciseIntervalledSampleList_;
   private RepeatedFieldBuilderV3 forwardAccelerationOfflineBuilder_;
   private List forwardAccelerationOffline_;
   private List forwardAcceleration_;
   private RepeatedFieldBuilderV3 heartRateOfflineBuilder_;
   private List heartRateOffline_;
   private List heartRateSamples_;
   private RepeatedFieldBuilderV3 leftPedalPowerOfflineBuilder_;
   private List leftPedalPowerOffline_;
   private RepeatedFieldBuilderV3 leftPedalPowerSamplesBuilder_;
   private List leftPedalPowerSamples_;
   private RepeatedFieldBuilderV3 leftPowerCalibrationBuilder_;
   private List leftPowerCalibration_;
   private RepeatedFieldBuilderV3 movingTypeOfflineBuilder_;
   private List movingTypeOffline_;
   private List movingTypeSamples_;
   private RepeatedFieldBuilderV3 pauseTimesBuilder_;
   private List pauseTimes_;
   private SingleFieldBuilderV3 recordingIntervalBuilder_;
   private Types$PbDuration recordingInterval_;
   private RepeatedFieldBuilderV3 rightPedalPowerOfflineBuilder_;
   private List rightPedalPowerOffline_;
   private RepeatedFieldBuilderV3 rightPedalPowerSamplesBuilder_;
   private List rightPedalPowerSamples_;
   private RepeatedFieldBuilderV3 rightPowerCalibrationBuilder_;
   private List rightPowerCalibration_;
   private SingleFieldBuilderV3 rrSamplesBuilder_;
   private ExerciseRRSamples$PbExerciseRRIntervals rrSamples_;
   private RepeatedFieldBuilderV3 speedOfflineBuilder_;
   private List speedOffline_;
   private List speedSamples_;
   private RepeatedFieldBuilderV3 strideCalibrationBuilder_;
   private List strideCalibration_;
   private RepeatedFieldBuilderV3 strideLengthOfflineBuilder_;
   private List strideLengthOffline_;
   private List strideLengthSamples_;
   private RepeatedFieldBuilderV3 temperatureOfflineBuilder_;
   private List temperatureOffline_;
   private List temperatureSamples_;

   private ExerciseSamples$PbExerciseSamples$Builder() {
      this.recordingInterval_ = null;
      this.heartRateSamples_ = Collections.emptyList();
      this.heartRateOffline_ = Collections.emptyList();
      this.cadenceSamples_ = Collections.emptyList();
      this.cadenceOffline_ = Collections.emptyList();
      this.altitudeSamples_ = Collections.emptyList();
      this.altitudeOffline_ = Collections.emptyList();
      this.altitudeCalibration_ = Collections.emptyList();
      this.temperatureSamples_ = Collections.emptyList();
      this.temperatureOffline_ = Collections.emptyList();
      this.speedSamples_ = Collections.emptyList();
      this.speedOffline_ = Collections.emptyList();
      this.distanceSamples_ = Collections.emptyList();
      this.distanceOffline_ = Collections.emptyList();
      this.strideLengthSamples_ = Collections.emptyList();
      this.strideLengthOffline_ = Collections.emptyList();
      this.strideCalibration_ = Collections.emptyList();
      this.forwardAcceleration_ = Collections.emptyList();
      this.forwardAccelerationOffline_ = Collections.emptyList();
      this.movingTypeSamples_ = Collections.emptyList();
      this.movingTypeOffline_ = Collections.emptyList();
      this.leftPedalPowerSamples_ = Collections.emptyList();
      this.leftPedalPowerOffline_ = Collections.emptyList();
      this.rightPedalPowerSamples_ = Collections.emptyList();
      this.rightPedalPowerOffline_ = Collections.emptyList();
      this.leftPowerCalibration_ = Collections.emptyList();
      this.rightPowerCalibration_ = Collections.emptyList();
      this.rrSamples_ = null;
      this.exerciseIntervalledSampleList_ = Collections.emptyList();
      this.pauseTimes_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   private ExerciseSamples$PbExerciseSamples$Builder(BuilderParent var1) {
      super(var1);
      this.recordingInterval_ = null;
      this.heartRateSamples_ = Collections.emptyList();
      this.heartRateOffline_ = Collections.emptyList();
      this.cadenceSamples_ = Collections.emptyList();
      this.cadenceOffline_ = Collections.emptyList();
      this.altitudeSamples_ = Collections.emptyList();
      this.altitudeOffline_ = Collections.emptyList();
      this.altitudeCalibration_ = Collections.emptyList();
      this.temperatureSamples_ = Collections.emptyList();
      this.temperatureOffline_ = Collections.emptyList();
      this.speedSamples_ = Collections.emptyList();
      this.speedOffline_ = Collections.emptyList();
      this.distanceSamples_ = Collections.emptyList();
      this.distanceOffline_ = Collections.emptyList();
      this.strideLengthSamples_ = Collections.emptyList();
      this.strideLengthOffline_ = Collections.emptyList();
      this.strideCalibration_ = Collections.emptyList();
      this.forwardAcceleration_ = Collections.emptyList();
      this.forwardAccelerationOffline_ = Collections.emptyList();
      this.movingTypeSamples_ = Collections.emptyList();
      this.movingTypeOffline_ = Collections.emptyList();
      this.leftPedalPowerSamples_ = Collections.emptyList();
      this.leftPedalPowerOffline_ = Collections.emptyList();
      this.rightPedalPowerSamples_ = Collections.emptyList();
      this.rightPedalPowerOffline_ = Collections.emptyList();
      this.leftPowerCalibration_ = Collections.emptyList();
      this.rightPowerCalibration_ = Collections.emptyList();
      this.rrSamples_ = null;
      this.exerciseIntervalledSampleList_ = Collections.emptyList();
      this.pauseTimes_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseSamples$PbExerciseSamples$Builder(BuilderParent var1, ExerciseSamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseSamples$PbExerciseSamples$Builder(ExerciseSamples$1 var1) {
      this();
   }

   private void ensureAltitudeCalibrationIsMutable() {
      if ((this.bitField0_ & 128) != 128) {
         this.altitudeCalibration_ = new ArrayList(this.altitudeCalibration_);
         this.bitField0_ |= 128;
      }

   }

   private void ensureAltitudeOfflineIsMutable() {
      if ((this.bitField0_ & 64) != 64) {
         this.altitudeOffline_ = new ArrayList(this.altitudeOffline_);
         this.bitField0_ |= 64;
      }

   }

   private void ensureAltitudeSamplesIsMutable() {
      if ((this.bitField0_ & 32) != 32) {
         this.altitudeSamples_ = new ArrayList(this.altitudeSamples_);
         this.bitField0_ |= 32;
      }

   }

   private void ensureCadenceOfflineIsMutable() {
      if ((this.bitField0_ & 16) != 16) {
         this.cadenceOffline_ = new ArrayList(this.cadenceOffline_);
         this.bitField0_ |= 16;
      }

   }

   private void ensureCadenceSamplesIsMutable() {
      if ((this.bitField0_ & 8) != 8) {
         this.cadenceSamples_ = new ArrayList(this.cadenceSamples_);
         this.bitField0_ |= 8;
      }

   }

   private void ensureDistanceOfflineIsMutable() {
      if ((this.bitField0_ & 8192) != 8192) {
         this.distanceOffline_ = new ArrayList(this.distanceOffline_);
         this.bitField0_ |= 8192;
      }

   }

   private void ensureDistanceSamplesIsMutable() {
      if ((this.bitField0_ & 4096) != 4096) {
         this.distanceSamples_ = new ArrayList(this.distanceSamples_);
         this.bitField0_ |= 4096;
      }

   }

   private void ensureExerciseIntervalledSampleListIsMutable() {
      if ((this.bitField0_ & 268435456) != 268435456) {
         this.exerciseIntervalledSampleList_ = new ArrayList(this.exerciseIntervalledSampleList_);
         this.bitField0_ |= 268435456;
      }

   }

   private void ensureForwardAccelerationIsMutable() {
      if ((this.bitField0_ & 131072) != 131072) {
         this.forwardAcceleration_ = new ArrayList(this.forwardAcceleration_);
         this.bitField0_ |= 131072;
      }

   }

   private void ensureForwardAccelerationOfflineIsMutable() {
      if ((this.bitField0_ & 262144) != 262144) {
         this.forwardAccelerationOffline_ = new ArrayList(this.forwardAccelerationOffline_);
         this.bitField0_ |= 262144;
      }

   }

   private void ensureHeartRateOfflineIsMutable() {
      if ((this.bitField0_ & 4) != 4) {
         this.heartRateOffline_ = new ArrayList(this.heartRateOffline_);
         this.bitField0_ |= 4;
      }

   }

   private void ensureHeartRateSamplesIsMutable() {
      if ((this.bitField0_ & 2) != 2) {
         this.heartRateSamples_ = new ArrayList(this.heartRateSamples_);
         this.bitField0_ |= 2;
      }

   }

   private void ensureLeftPedalPowerOfflineIsMutable() {
      if ((this.bitField0_ & 4194304) != 4194304) {
         this.leftPedalPowerOffline_ = new ArrayList(this.leftPedalPowerOffline_);
         this.bitField0_ |= 4194304;
      }

   }

   private void ensureLeftPedalPowerSamplesIsMutable() {
      if ((this.bitField0_ & 2097152) != 2097152) {
         this.leftPedalPowerSamples_ = new ArrayList(this.leftPedalPowerSamples_);
         this.bitField0_ |= 2097152;
      }

   }

   private void ensureLeftPowerCalibrationIsMutable() {
      if ((this.bitField0_ & 33554432) != 33554432) {
         this.leftPowerCalibration_ = new ArrayList(this.leftPowerCalibration_);
         this.bitField0_ |= 33554432;
      }

   }

   private void ensureMovingTypeOfflineIsMutable() {
      if ((this.bitField0_ & 1048576) != 1048576) {
         this.movingTypeOffline_ = new ArrayList(this.movingTypeOffline_);
         this.bitField0_ |= 1048576;
      }

   }

   private void ensureMovingTypeSamplesIsMutable() {
      if ((this.bitField0_ & 524288) != 524288) {
         this.movingTypeSamples_ = new ArrayList(this.movingTypeSamples_);
         this.bitField0_ |= 524288;
      }

   }

   private void ensurePauseTimesIsMutable() {
      if ((this.bitField0_ & 536870912) != 536870912) {
         this.pauseTimes_ = new ArrayList(this.pauseTimes_);
         this.bitField0_ |= 536870912;
      }

   }

   private void ensureRightPedalPowerOfflineIsMutable() {
      if ((this.bitField0_ & 16777216) != 16777216) {
         this.rightPedalPowerOffline_ = new ArrayList(this.rightPedalPowerOffline_);
         this.bitField0_ |= 16777216;
      }

   }

   private void ensureRightPedalPowerSamplesIsMutable() {
      if ((this.bitField0_ & 8388608) != 8388608) {
         this.rightPedalPowerSamples_ = new ArrayList(this.rightPedalPowerSamples_);
         this.bitField0_ |= 8388608;
      }

   }

   private void ensureRightPowerCalibrationIsMutable() {
      if ((this.bitField0_ & 67108864) != 67108864) {
         this.rightPowerCalibration_ = new ArrayList(this.rightPowerCalibration_);
         this.bitField0_ |= 67108864;
      }

   }

   private void ensureSpeedOfflineIsMutable() {
      if ((this.bitField0_ & 2048) != 2048) {
         this.speedOffline_ = new ArrayList(this.speedOffline_);
         this.bitField0_ |= 2048;
      }

   }

   private void ensureSpeedSamplesIsMutable() {
      if ((this.bitField0_ & 1024) != 1024) {
         this.speedSamples_ = new ArrayList(this.speedSamples_);
         this.bitField0_ |= 1024;
      }

   }

   private void ensureStrideCalibrationIsMutable() {
      if ((this.bitField0_ & 65536) != 65536) {
         this.strideCalibration_ = new ArrayList(this.strideCalibration_);
         this.bitField0_ |= 65536;
      }

   }

   private void ensureStrideLengthOfflineIsMutable() {
      if ((this.bitField0_ & '耀') != 32768) {
         this.strideLengthOffline_ = new ArrayList(this.strideLengthOffline_);
         this.bitField0_ |= 32768;
      }

   }

   private void ensureStrideLengthSamplesIsMutable() {
      if ((this.bitField0_ & 16384) != 16384) {
         this.strideLengthSamples_ = new ArrayList(this.strideLengthSamples_);
         this.bitField0_ |= 16384;
      }

   }

   private void ensureTemperatureOfflineIsMutable() {
      if ((this.bitField0_ & 512) != 512) {
         this.temperatureOffline_ = new ArrayList(this.temperatureOffline_);
         this.bitField0_ |= 512;
      }

   }

   private void ensureTemperatureSamplesIsMutable() {
      if ((this.bitField0_ & 256) != 256) {
         this.temperatureSamples_ = new ArrayList(this.temperatureSamples_);
         this.bitField0_ |= 256;
      }

   }

   private RepeatedFieldBuilderV3 getAltitudeCalibrationFieldBuilder() {
      if (this.altitudeCalibrationBuilder_ == null) {
         List var1 = this.altitudeCalibration_;
         boolean var2;
         if ((this.bitField0_ & 128) == 128) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.altitudeCalibrationBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.altitudeCalibration_ = null;
      }

      return this.altitudeCalibrationBuilder_;
   }

   private RepeatedFieldBuilderV3 getAltitudeOfflineFieldBuilder() {
      if (this.altitudeOfflineBuilder_ == null) {
         List var1 = this.altitudeOffline_;
         boolean var2;
         if ((this.bitField0_ & 64) == 64) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.altitudeOfflineBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.altitudeOffline_ = null;
      }

      return this.altitudeOfflineBuilder_;
   }

   private RepeatedFieldBuilderV3 getCadenceOfflineFieldBuilder() {
      if (this.cadenceOfflineBuilder_ == null) {
         List var1 = this.cadenceOffline_;
         boolean var2;
         if ((this.bitField0_ & 16) == 16) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.cadenceOfflineBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.cadenceOffline_ = null;
      }

      return this.cadenceOfflineBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseSamples.g();
   }

   private RepeatedFieldBuilderV3 getDistanceOfflineFieldBuilder() {
      if (this.distanceOfflineBuilder_ == null) {
         List var1 = this.distanceOffline_;
         boolean var2;
         if ((this.bitField0_ & 8192) == 8192) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.distanceOfflineBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.distanceOffline_ = null;
      }

      return this.distanceOfflineBuilder_;
   }

   private RepeatedFieldBuilderV3 getExerciseIntervalledSampleListFieldBuilder() {
      if (this.exerciseIntervalledSampleListBuilder_ == null) {
         List var1 = this.exerciseIntervalledSampleList_;
         boolean var2;
         if ((this.bitField0_ & 268435456) == 268435456) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.exerciseIntervalledSampleListBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.exerciseIntervalledSampleList_ = null;
      }

      return this.exerciseIntervalledSampleListBuilder_;
   }

   private RepeatedFieldBuilderV3 getForwardAccelerationOfflineFieldBuilder() {
      if (this.forwardAccelerationOfflineBuilder_ == null) {
         List var1 = this.forwardAccelerationOffline_;
         boolean var2;
         if ((this.bitField0_ & 262144) == 262144) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.forwardAccelerationOfflineBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.forwardAccelerationOffline_ = null;
      }

      return this.forwardAccelerationOfflineBuilder_;
   }

   private RepeatedFieldBuilderV3 getHeartRateOfflineFieldBuilder() {
      if (this.heartRateOfflineBuilder_ == null) {
         List var1 = this.heartRateOffline_;
         boolean var2;
         if ((this.bitField0_ & 4) == 4) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.heartRateOfflineBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.heartRateOffline_ = null;
      }

      return this.heartRateOfflineBuilder_;
   }

   private RepeatedFieldBuilderV3 getLeftPedalPowerOfflineFieldBuilder() {
      if (this.leftPedalPowerOfflineBuilder_ == null) {
         List var1 = this.leftPedalPowerOffline_;
         boolean var2;
         if ((this.bitField0_ & 4194304) == 4194304) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.leftPedalPowerOfflineBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.leftPedalPowerOffline_ = null;
      }

      return this.leftPedalPowerOfflineBuilder_;
   }

   private RepeatedFieldBuilderV3 getLeftPedalPowerSamplesFieldBuilder() {
      if (this.leftPedalPowerSamplesBuilder_ == null) {
         List var1 = this.leftPedalPowerSamples_;
         boolean var2;
         if ((this.bitField0_ & 2097152) == 2097152) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.leftPedalPowerSamplesBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.leftPedalPowerSamples_ = null;
      }

      return this.leftPedalPowerSamplesBuilder_;
   }

   private RepeatedFieldBuilderV3 getLeftPowerCalibrationFieldBuilder() {
      if (this.leftPowerCalibrationBuilder_ == null) {
         List var1 = this.leftPowerCalibration_;
         boolean var2;
         if ((this.bitField0_ & 33554432) == 33554432) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.leftPowerCalibrationBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.leftPowerCalibration_ = null;
      }

      return this.leftPowerCalibrationBuilder_;
   }

   private RepeatedFieldBuilderV3 getMovingTypeOfflineFieldBuilder() {
      if (this.movingTypeOfflineBuilder_ == null) {
         List var1 = this.movingTypeOffline_;
         boolean var2;
         if ((this.bitField0_ & 1048576) == 1048576) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.movingTypeOfflineBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.movingTypeOffline_ = null;
      }

      return this.movingTypeOfflineBuilder_;
   }

   private RepeatedFieldBuilderV3 getPauseTimesFieldBuilder() {
      if (this.pauseTimesBuilder_ == null) {
         List var1 = this.pauseTimes_;
         boolean var2;
         if ((this.bitField0_ & 536870912) == 536870912) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.pauseTimesBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.pauseTimes_ = null;
      }

      return this.pauseTimesBuilder_;
   }

   private SingleFieldBuilderV3 getRecordingIntervalFieldBuilder() {
      if (this.recordingIntervalBuilder_ == null) {
         this.recordingIntervalBuilder_ = new SingleFieldBuilderV3(this.getRecordingInterval(), this.getParentForChildren(), this.isClean());
         this.recordingInterval_ = null;
      }

      return this.recordingIntervalBuilder_;
   }

   private RepeatedFieldBuilderV3 getRightPedalPowerOfflineFieldBuilder() {
      if (this.rightPedalPowerOfflineBuilder_ == null) {
         List var1 = this.rightPedalPowerOffline_;
         boolean var2;
         if ((this.bitField0_ & 16777216) == 16777216) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.rightPedalPowerOfflineBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.rightPedalPowerOffline_ = null;
      }

      return this.rightPedalPowerOfflineBuilder_;
   }

   private RepeatedFieldBuilderV3 getRightPedalPowerSamplesFieldBuilder() {
      if (this.rightPedalPowerSamplesBuilder_ == null) {
         List var1 = this.rightPedalPowerSamples_;
         boolean var2;
         if ((this.bitField0_ & 8388608) == 8388608) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.rightPedalPowerSamplesBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.rightPedalPowerSamples_ = null;
      }

      return this.rightPedalPowerSamplesBuilder_;
   }

   private RepeatedFieldBuilderV3 getRightPowerCalibrationFieldBuilder() {
      if (this.rightPowerCalibrationBuilder_ == null) {
         List var1 = this.rightPowerCalibration_;
         boolean var2;
         if ((this.bitField0_ & 67108864) == 67108864) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.rightPowerCalibrationBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.rightPowerCalibration_ = null;
      }

      return this.rightPowerCalibrationBuilder_;
   }

   private SingleFieldBuilderV3 getRrSamplesFieldBuilder() {
      if (this.rrSamplesBuilder_ == null) {
         this.rrSamplesBuilder_ = new SingleFieldBuilderV3(this.getRrSamples(), this.getParentForChildren(), this.isClean());
         this.rrSamples_ = null;
      }

      return this.rrSamplesBuilder_;
   }

   private RepeatedFieldBuilderV3 getSpeedOfflineFieldBuilder() {
      if (this.speedOfflineBuilder_ == null) {
         List var1 = this.speedOffline_;
         boolean var2;
         if ((this.bitField0_ & 2048) == 2048) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.speedOfflineBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.speedOffline_ = null;
      }

      return this.speedOfflineBuilder_;
   }

   private RepeatedFieldBuilderV3 getStrideCalibrationFieldBuilder() {
      if (this.strideCalibrationBuilder_ == null) {
         List var1 = this.strideCalibration_;
         boolean var2;
         if ((this.bitField0_ & 65536) == 65536) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.strideCalibrationBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.strideCalibration_ = null;
      }

      return this.strideCalibrationBuilder_;
   }

   private RepeatedFieldBuilderV3 getStrideLengthOfflineFieldBuilder() {
      if (this.strideLengthOfflineBuilder_ == null) {
         List var1 = this.strideLengthOffline_;
         boolean var2;
         if ((this.bitField0_ & '耀') == 32768) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.strideLengthOfflineBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.strideLengthOffline_ = null;
      }

      return this.strideLengthOfflineBuilder_;
   }

   private RepeatedFieldBuilderV3 getTemperatureOfflineFieldBuilder() {
      if (this.temperatureOfflineBuilder_ == null) {
         List var1 = this.temperatureOffline_;
         boolean var2;
         if ((this.bitField0_ & 512) == 512) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.temperatureOfflineBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.temperatureOffline_ = null;
      }

      return this.temperatureOfflineBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseSamples$PbExerciseSamples.b()) {
         this.getRecordingIntervalFieldBuilder();
         this.getHeartRateOfflineFieldBuilder();
         this.getCadenceOfflineFieldBuilder();
         this.getAltitudeOfflineFieldBuilder();
         this.getAltitudeCalibrationFieldBuilder();
         this.getTemperatureOfflineFieldBuilder();
         this.getSpeedOfflineFieldBuilder();
         this.getDistanceOfflineFieldBuilder();
         this.getStrideLengthOfflineFieldBuilder();
         this.getStrideCalibrationFieldBuilder();
         this.getForwardAccelerationOfflineFieldBuilder();
         this.getMovingTypeOfflineFieldBuilder();
         this.getLeftPedalPowerSamplesFieldBuilder();
         this.getLeftPedalPowerOfflineFieldBuilder();
         this.getRightPedalPowerSamplesFieldBuilder();
         this.getRightPedalPowerOfflineFieldBuilder();
         this.getLeftPowerCalibrationFieldBuilder();
         this.getRightPowerCalibrationFieldBuilder();
         this.getRrSamplesFieldBuilder();
         this.getExerciseIntervalledSampleListFieldBuilder();
         this.getPauseTimesFieldBuilder();
      }

   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllAltitudeCalibration(Iterable var1) {
      if (this.altitudeCalibrationBuilder_ == null) {
         this.ensureAltitudeCalibrationIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.altitudeCalibration_);
         this.onChanged();
      } else {
         this.altitudeCalibrationBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllAltitudeOffline(Iterable var1) {
      if (this.altitudeOfflineBuilder_ == null) {
         this.ensureAltitudeOfflineIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.altitudeOffline_);
         this.onChanged();
      } else {
         this.altitudeOfflineBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllAltitudeSamples(Iterable var1) {
      this.ensureAltitudeSamplesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.altitudeSamples_);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllCadenceOffline(Iterable var1) {
      if (this.cadenceOfflineBuilder_ == null) {
         this.ensureCadenceOfflineIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.cadenceOffline_);
         this.onChanged();
      } else {
         this.cadenceOfflineBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllCadenceSamples(Iterable var1) {
      this.ensureCadenceSamplesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.cadenceSamples_);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllDistanceOffline(Iterable var1) {
      if (this.distanceOfflineBuilder_ == null) {
         this.ensureDistanceOfflineIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.distanceOffline_);
         this.onChanged();
      } else {
         this.distanceOfflineBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllDistanceSamples(Iterable var1) {
      this.ensureDistanceSamplesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.distanceSamples_);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllExerciseIntervalledSampleList(Iterable var1) {
      if (this.exerciseIntervalledSampleListBuilder_ == null) {
         this.ensureExerciseIntervalledSampleListIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.exerciseIntervalledSampleList_);
         this.onChanged();
      } else {
         this.exerciseIntervalledSampleListBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllForwardAcceleration(Iterable var1) {
      this.ensureForwardAccelerationIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.forwardAcceleration_);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllForwardAccelerationOffline(Iterable var1) {
      if (this.forwardAccelerationOfflineBuilder_ == null) {
         this.ensureForwardAccelerationOfflineIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.forwardAccelerationOffline_);
         this.onChanged();
      } else {
         this.forwardAccelerationOfflineBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllHeartRateOffline(Iterable var1) {
      if (this.heartRateOfflineBuilder_ == null) {
         this.ensureHeartRateOfflineIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.heartRateOffline_);
         this.onChanged();
      } else {
         this.heartRateOfflineBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllHeartRateSamples(Iterable var1) {
      this.ensureHeartRateSamplesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.heartRateSamples_);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllLeftPedalPowerOffline(Iterable var1) {
      if (this.leftPedalPowerOfflineBuilder_ == null) {
         this.ensureLeftPedalPowerOfflineIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.leftPedalPowerOffline_);
         this.onChanged();
      } else {
         this.leftPedalPowerOfflineBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllLeftPedalPowerSamples(Iterable var1) {
      if (this.leftPedalPowerSamplesBuilder_ == null) {
         this.ensureLeftPedalPowerSamplesIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.leftPedalPowerSamples_);
         this.onChanged();
      } else {
         this.leftPedalPowerSamplesBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllLeftPowerCalibration(Iterable var1) {
      if (this.leftPowerCalibrationBuilder_ == null) {
         this.ensureLeftPowerCalibrationIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.leftPowerCalibration_);
         this.onChanged();
      } else {
         this.leftPowerCalibrationBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllMovingTypeOffline(Iterable var1) {
      if (this.movingTypeOfflineBuilder_ == null) {
         this.ensureMovingTypeOfflineIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.movingTypeOffline_);
         this.onChanged();
      } else {
         this.movingTypeOfflineBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllMovingTypeSamples(Iterable var1) {
      this.ensureMovingTypeSamplesIsMutable();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         Types$PbMovingType var2 = (Types$PbMovingType)var3.next();
         this.movingTypeSamples_.add(var2.getNumber());
      }

      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllPauseTimes(Iterable var1) {
      if (this.pauseTimesBuilder_ == null) {
         this.ensurePauseTimesIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.pauseTimes_);
         this.onChanged();
      } else {
         this.pauseTimesBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllRightPedalPowerOffline(Iterable var1) {
      if (this.rightPedalPowerOfflineBuilder_ == null) {
         this.ensureRightPedalPowerOfflineIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.rightPedalPowerOffline_);
         this.onChanged();
      } else {
         this.rightPedalPowerOfflineBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllRightPedalPowerSamples(Iterable var1) {
      if (this.rightPedalPowerSamplesBuilder_ == null) {
         this.ensureRightPedalPowerSamplesIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.rightPedalPowerSamples_);
         this.onChanged();
      } else {
         this.rightPedalPowerSamplesBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllRightPowerCalibration(Iterable var1) {
      if (this.rightPowerCalibrationBuilder_ == null) {
         this.ensureRightPowerCalibrationIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.rightPowerCalibration_);
         this.onChanged();
      } else {
         this.rightPowerCalibrationBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllSpeedOffline(Iterable var1) {
      if (this.speedOfflineBuilder_ == null) {
         this.ensureSpeedOfflineIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.speedOffline_);
         this.onChanged();
      } else {
         this.speedOfflineBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllSpeedSamples(Iterable var1) {
      this.ensureSpeedSamplesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.speedSamples_);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllStrideCalibration(Iterable var1) {
      if (this.strideCalibrationBuilder_ == null) {
         this.ensureStrideCalibrationIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.strideCalibration_);
         this.onChanged();
      } else {
         this.strideCalibrationBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllStrideLengthOffline(Iterable var1) {
      if (this.strideLengthOfflineBuilder_ == null) {
         this.ensureStrideLengthOfflineIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.strideLengthOffline_);
         this.onChanged();
      } else {
         this.strideLengthOfflineBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllStrideLengthSamples(Iterable var1) {
      this.ensureStrideLengthSamplesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.strideLengthSamples_);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllTemperatureOffline(Iterable var1) {
      if (this.temperatureOfflineBuilder_ == null) {
         this.ensureTemperatureOfflineIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.temperatureOffline_);
         this.onChanged();
      } else {
         this.temperatureOfflineBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAllTemperatureSamples(Iterable var1) {
      this.ensureTemperatureSamplesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.temperatureSamples_);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAltitudeCalibration(int var1, ExerciseSamples$PbCalibrationValue$Builder var2) {
      if (this.altitudeCalibrationBuilder_ == null) {
         this.ensureAltitudeCalibrationIsMutable();
         this.altitudeCalibration_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.altitudeCalibrationBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAltitudeCalibration(int var1, ExerciseSamples$PbCalibrationValue var2) {
      if (this.altitudeCalibrationBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureAltitudeCalibrationIsMutable();
         this.altitudeCalibration_.add(var1, var2);
         this.onChanged();
      } else {
         this.altitudeCalibrationBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAltitudeCalibration(ExerciseSamples$PbCalibrationValue$Builder var1) {
      if (this.altitudeCalibrationBuilder_ == null) {
         this.ensureAltitudeCalibrationIsMutable();
         this.altitudeCalibration_.add(var1.build());
         this.onChanged();
      } else {
         this.altitudeCalibrationBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAltitudeCalibration(ExerciseSamples$PbCalibrationValue var1) {
      if (this.altitudeCalibrationBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureAltitudeCalibrationIsMutable();
         this.altitudeCalibration_.add(var1);
         this.onChanged();
      } else {
         this.altitudeCalibrationBuilder_.addMessage(var1);
      }

      return this;
   }

   public ExerciseSamples$PbCalibrationValue$Builder addAltitudeCalibrationBuilder() {
      return (ExerciseSamples$PbCalibrationValue$Builder)this.getAltitudeCalibrationFieldBuilder().addBuilder(ExerciseSamples$PbCalibrationValue.getDefaultInstance());
   }

   public ExerciseSamples$PbCalibrationValue$Builder addAltitudeCalibrationBuilder(int var1) {
      return (ExerciseSamples$PbCalibrationValue$Builder)this.getAltitudeCalibrationFieldBuilder().addBuilder(var1, ExerciseSamples$PbCalibrationValue.getDefaultInstance());
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAltitudeOffline(int var1, Types$PbSensorOffline$Builder var2) {
      if (this.altitudeOfflineBuilder_ == null) {
         this.ensureAltitudeOfflineIsMutable();
         this.altitudeOffline_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.altitudeOfflineBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAltitudeOffline(int var1, Types$PbSensorOffline var2) {
      if (this.altitudeOfflineBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureAltitudeOfflineIsMutable();
         this.altitudeOffline_.add(var1, var2);
         this.onChanged();
      } else {
         this.altitudeOfflineBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAltitudeOffline(Types$PbSensorOffline$Builder var1) {
      if (this.altitudeOfflineBuilder_ == null) {
         this.ensureAltitudeOfflineIsMutable();
         this.altitudeOffline_.add(var1.build());
         this.onChanged();
      } else {
         this.altitudeOfflineBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAltitudeOffline(Types$PbSensorOffline var1) {
      if (this.altitudeOfflineBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureAltitudeOfflineIsMutable();
         this.altitudeOffline_.add(var1);
         this.onChanged();
      } else {
         this.altitudeOfflineBuilder_.addMessage(var1);
      }

      return this;
   }

   public Types$PbSensorOffline$Builder addAltitudeOfflineBuilder() {
      return (Types$PbSensorOffline$Builder)this.getAltitudeOfflineFieldBuilder().addBuilder(Types$PbSensorOffline.getDefaultInstance());
   }

   public Types$PbSensorOffline$Builder addAltitudeOfflineBuilder(int var1) {
      return (Types$PbSensorOffline$Builder)this.getAltitudeOfflineFieldBuilder().addBuilder(var1, Types$PbSensorOffline.getDefaultInstance());
   }

   public ExerciseSamples$PbExerciseSamples$Builder addAltitudeSamples(float var1) {
      this.ensureAltitudeSamplesIsMutable();
      this.altitudeSamples_.add(var1);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addCadenceOffline(int var1, Types$PbSensorOffline$Builder var2) {
      if (this.cadenceOfflineBuilder_ == null) {
         this.ensureCadenceOfflineIsMutable();
         this.cadenceOffline_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.cadenceOfflineBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addCadenceOffline(int var1, Types$PbSensorOffline var2) {
      if (this.cadenceOfflineBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureCadenceOfflineIsMutable();
         this.cadenceOffline_.add(var1, var2);
         this.onChanged();
      } else {
         this.cadenceOfflineBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addCadenceOffline(Types$PbSensorOffline$Builder var1) {
      if (this.cadenceOfflineBuilder_ == null) {
         this.ensureCadenceOfflineIsMutable();
         this.cadenceOffline_.add(var1.build());
         this.onChanged();
      } else {
         this.cadenceOfflineBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addCadenceOffline(Types$PbSensorOffline var1) {
      if (this.cadenceOfflineBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureCadenceOfflineIsMutable();
         this.cadenceOffline_.add(var1);
         this.onChanged();
      } else {
         this.cadenceOfflineBuilder_.addMessage(var1);
      }

      return this;
   }

   public Types$PbSensorOffline$Builder addCadenceOfflineBuilder() {
      return (Types$PbSensorOffline$Builder)this.getCadenceOfflineFieldBuilder().addBuilder(Types$PbSensorOffline.getDefaultInstance());
   }

   public Types$PbSensorOffline$Builder addCadenceOfflineBuilder(int var1) {
      return (Types$PbSensorOffline$Builder)this.getCadenceOfflineFieldBuilder().addBuilder(var1, Types$PbSensorOffline.getDefaultInstance());
   }

   public ExerciseSamples$PbExerciseSamples$Builder addCadenceSamples(int var1) {
      this.ensureCadenceSamplesIsMutable();
      this.cadenceSamples_.add(var1);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addDistanceOffline(int var1, Types$PbSensorOffline$Builder var2) {
      if (this.distanceOfflineBuilder_ == null) {
         this.ensureDistanceOfflineIsMutable();
         this.distanceOffline_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.distanceOfflineBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addDistanceOffline(int var1, Types$PbSensorOffline var2) {
      if (this.distanceOfflineBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureDistanceOfflineIsMutable();
         this.distanceOffline_.add(var1, var2);
         this.onChanged();
      } else {
         this.distanceOfflineBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addDistanceOffline(Types$PbSensorOffline$Builder var1) {
      if (this.distanceOfflineBuilder_ == null) {
         this.ensureDistanceOfflineIsMutable();
         this.distanceOffline_.add(var1.build());
         this.onChanged();
      } else {
         this.distanceOfflineBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addDistanceOffline(Types$PbSensorOffline var1) {
      if (this.distanceOfflineBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureDistanceOfflineIsMutable();
         this.distanceOffline_.add(var1);
         this.onChanged();
      } else {
         this.distanceOfflineBuilder_.addMessage(var1);
      }

      return this;
   }

   public Types$PbSensorOffline$Builder addDistanceOfflineBuilder() {
      return (Types$PbSensorOffline$Builder)this.getDistanceOfflineFieldBuilder().addBuilder(Types$PbSensorOffline.getDefaultInstance());
   }

   public Types$PbSensorOffline$Builder addDistanceOfflineBuilder(int var1) {
      return (Types$PbSensorOffline$Builder)this.getDistanceOfflineFieldBuilder().addBuilder(var1, Types$PbSensorOffline.getDefaultInstance());
   }

   public ExerciseSamples$PbExerciseSamples$Builder addDistanceSamples(float var1) {
      this.ensureDistanceSamplesIsMutable();
      this.distanceSamples_.add(var1);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addExerciseIntervalledSampleList(int var1, ExerciseSamples$PbExerciseIntervalledSampleList$Builder var2) {
      if (this.exerciseIntervalledSampleListBuilder_ == null) {
         this.ensureExerciseIntervalledSampleListIsMutable();
         this.exerciseIntervalledSampleList_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.exerciseIntervalledSampleListBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addExerciseIntervalledSampleList(int var1, ExerciseSamples$PbExerciseIntervalledSampleList var2) {
      if (this.exerciseIntervalledSampleListBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureExerciseIntervalledSampleListIsMutable();
         this.exerciseIntervalledSampleList_.add(var1, var2);
         this.onChanged();
      } else {
         this.exerciseIntervalledSampleListBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addExerciseIntervalledSampleList(ExerciseSamples$PbExerciseIntervalledSampleList$Builder var1) {
      if (this.exerciseIntervalledSampleListBuilder_ == null) {
         this.ensureExerciseIntervalledSampleListIsMutable();
         this.exerciseIntervalledSampleList_.add(var1.build());
         this.onChanged();
      } else {
         this.exerciseIntervalledSampleListBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addExerciseIntervalledSampleList(ExerciseSamples$PbExerciseIntervalledSampleList var1) {
      if (this.exerciseIntervalledSampleListBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureExerciseIntervalledSampleListIsMutable();
         this.exerciseIntervalledSampleList_.add(var1);
         this.onChanged();
      } else {
         this.exerciseIntervalledSampleListBuilder_.addMessage(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addExerciseIntervalledSampleListBuilder() {
      return (ExerciseSamples$PbExerciseIntervalledSampleList$Builder)this.getExerciseIntervalledSampleListFieldBuilder().addBuilder(ExerciseSamples$PbExerciseIntervalledSampleList.getDefaultInstance());
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addExerciseIntervalledSampleListBuilder(int var1) {
      return (ExerciseSamples$PbExerciseIntervalledSampleList$Builder)this.getExerciseIntervalledSampleListFieldBuilder().addBuilder(var1, ExerciseSamples$PbExerciseIntervalledSampleList.getDefaultInstance());
   }

   public ExerciseSamples$PbExerciseSamples$Builder addForwardAcceleration(float var1) {
      this.ensureForwardAccelerationIsMutable();
      this.forwardAcceleration_.add(var1);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addForwardAccelerationOffline(int var1, Types$PbSensorOffline$Builder var2) {
      if (this.forwardAccelerationOfflineBuilder_ == null) {
         this.ensureForwardAccelerationOfflineIsMutable();
         this.forwardAccelerationOffline_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.forwardAccelerationOfflineBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addForwardAccelerationOffline(int var1, Types$PbSensorOffline var2) {
      if (this.forwardAccelerationOfflineBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureForwardAccelerationOfflineIsMutable();
         this.forwardAccelerationOffline_.add(var1, var2);
         this.onChanged();
      } else {
         this.forwardAccelerationOfflineBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addForwardAccelerationOffline(Types$PbSensorOffline$Builder var1) {
      if (this.forwardAccelerationOfflineBuilder_ == null) {
         this.ensureForwardAccelerationOfflineIsMutable();
         this.forwardAccelerationOffline_.add(var1.build());
         this.onChanged();
      } else {
         this.forwardAccelerationOfflineBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addForwardAccelerationOffline(Types$PbSensorOffline var1) {
      if (this.forwardAccelerationOfflineBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureForwardAccelerationOfflineIsMutable();
         this.forwardAccelerationOffline_.add(var1);
         this.onChanged();
      } else {
         this.forwardAccelerationOfflineBuilder_.addMessage(var1);
      }

      return this;
   }

   public Types$PbSensorOffline$Builder addForwardAccelerationOfflineBuilder() {
      return (Types$PbSensorOffline$Builder)this.getForwardAccelerationOfflineFieldBuilder().addBuilder(Types$PbSensorOffline.getDefaultInstance());
   }

   public Types$PbSensorOffline$Builder addForwardAccelerationOfflineBuilder(int var1) {
      return (Types$PbSensorOffline$Builder)this.getForwardAccelerationOfflineFieldBuilder().addBuilder(var1, Types$PbSensorOffline.getDefaultInstance());
   }

   public ExerciseSamples$PbExerciseSamples$Builder addHeartRateOffline(int var1, Types$PbSensorOffline$Builder var2) {
      if (this.heartRateOfflineBuilder_ == null) {
         this.ensureHeartRateOfflineIsMutable();
         this.heartRateOffline_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.heartRateOfflineBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addHeartRateOffline(int var1, Types$PbSensorOffline var2) {
      if (this.heartRateOfflineBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureHeartRateOfflineIsMutable();
         this.heartRateOffline_.add(var1, var2);
         this.onChanged();
      } else {
         this.heartRateOfflineBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addHeartRateOffline(Types$PbSensorOffline$Builder var1) {
      if (this.heartRateOfflineBuilder_ == null) {
         this.ensureHeartRateOfflineIsMutable();
         this.heartRateOffline_.add(var1.build());
         this.onChanged();
      } else {
         this.heartRateOfflineBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addHeartRateOffline(Types$PbSensorOffline var1) {
      if (this.heartRateOfflineBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureHeartRateOfflineIsMutable();
         this.heartRateOffline_.add(var1);
         this.onChanged();
      } else {
         this.heartRateOfflineBuilder_.addMessage(var1);
      }

      return this;
   }

   public Types$PbSensorOffline$Builder addHeartRateOfflineBuilder() {
      return (Types$PbSensorOffline$Builder)this.getHeartRateOfflineFieldBuilder().addBuilder(Types$PbSensorOffline.getDefaultInstance());
   }

   public Types$PbSensorOffline$Builder addHeartRateOfflineBuilder(int var1) {
      return (Types$PbSensorOffline$Builder)this.getHeartRateOfflineFieldBuilder().addBuilder(var1, Types$PbSensorOffline.getDefaultInstance());
   }

   public ExerciseSamples$PbExerciseSamples$Builder addHeartRateSamples(int var1) {
      this.ensureHeartRateSamplesIsMutable();
      this.heartRateSamples_.add(var1);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addLeftPedalPowerOffline(int var1, Types$PbSensorOffline$Builder var2) {
      if (this.leftPedalPowerOfflineBuilder_ == null) {
         this.ensureLeftPedalPowerOfflineIsMutable();
         this.leftPedalPowerOffline_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.leftPedalPowerOfflineBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addLeftPedalPowerOffline(int var1, Types$PbSensorOffline var2) {
      if (this.leftPedalPowerOfflineBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureLeftPedalPowerOfflineIsMutable();
         this.leftPedalPowerOffline_.add(var1, var2);
         this.onChanged();
      } else {
         this.leftPedalPowerOfflineBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addLeftPedalPowerOffline(Types$PbSensorOffline$Builder var1) {
      if (this.leftPedalPowerOfflineBuilder_ == null) {
         this.ensureLeftPedalPowerOfflineIsMutable();
         this.leftPedalPowerOffline_.add(var1.build());
         this.onChanged();
      } else {
         this.leftPedalPowerOfflineBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addLeftPedalPowerOffline(Types$PbSensorOffline var1) {
      if (this.leftPedalPowerOfflineBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureLeftPedalPowerOfflineIsMutable();
         this.leftPedalPowerOffline_.add(var1);
         this.onChanged();
      } else {
         this.leftPedalPowerOfflineBuilder_.addMessage(var1);
      }

      return this;
   }

   public Types$PbSensorOffline$Builder addLeftPedalPowerOfflineBuilder() {
      return (Types$PbSensorOffline$Builder)this.getLeftPedalPowerOfflineFieldBuilder().addBuilder(Types$PbSensorOffline.getDefaultInstance());
   }

   public Types$PbSensorOffline$Builder addLeftPedalPowerOfflineBuilder(int var1) {
      return (Types$PbSensorOffline$Builder)this.getLeftPedalPowerOfflineFieldBuilder().addBuilder(var1, Types$PbSensorOffline.getDefaultInstance());
   }

   public ExerciseSamples$PbExerciseSamples$Builder addLeftPedalPowerSamples(int var1, ExerciseSamples$PbPowerMeasurements$Builder var2) {
      if (this.leftPedalPowerSamplesBuilder_ == null) {
         this.ensureLeftPedalPowerSamplesIsMutable();
         this.leftPedalPowerSamples_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.leftPedalPowerSamplesBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addLeftPedalPowerSamples(int var1, ExerciseSamples$PbPowerMeasurements var2) {
      if (this.leftPedalPowerSamplesBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureLeftPedalPowerSamplesIsMutable();
         this.leftPedalPowerSamples_.add(var1, var2);
         this.onChanged();
      } else {
         this.leftPedalPowerSamplesBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addLeftPedalPowerSamples(ExerciseSamples$PbPowerMeasurements$Builder var1) {
      if (this.leftPedalPowerSamplesBuilder_ == null) {
         this.ensureLeftPedalPowerSamplesIsMutable();
         this.leftPedalPowerSamples_.add(var1.build());
         this.onChanged();
      } else {
         this.leftPedalPowerSamplesBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addLeftPedalPowerSamples(ExerciseSamples$PbPowerMeasurements var1) {
      if (this.leftPedalPowerSamplesBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureLeftPedalPowerSamplesIsMutable();
         this.leftPedalPowerSamples_.add(var1);
         this.onChanged();
      } else {
         this.leftPedalPowerSamplesBuilder_.addMessage(var1);
      }

      return this;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder addLeftPedalPowerSamplesBuilder() {
      return (ExerciseSamples$PbPowerMeasurements$Builder)this.getLeftPedalPowerSamplesFieldBuilder().addBuilder(ExerciseSamples$PbPowerMeasurements.getDefaultInstance());
   }

   public ExerciseSamples$PbPowerMeasurements$Builder addLeftPedalPowerSamplesBuilder(int var1) {
      return (ExerciseSamples$PbPowerMeasurements$Builder)this.getLeftPedalPowerSamplesFieldBuilder().addBuilder(var1, ExerciseSamples$PbPowerMeasurements.getDefaultInstance());
   }

   public ExerciseSamples$PbExerciseSamples$Builder addLeftPowerCalibration(int var1, ExerciseSamples$PbCalibrationValue$Builder var2) {
      if (this.leftPowerCalibrationBuilder_ == null) {
         this.ensureLeftPowerCalibrationIsMutable();
         this.leftPowerCalibration_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.leftPowerCalibrationBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addLeftPowerCalibration(int var1, ExerciseSamples$PbCalibrationValue var2) {
      if (this.leftPowerCalibrationBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureLeftPowerCalibrationIsMutable();
         this.leftPowerCalibration_.add(var1, var2);
         this.onChanged();
      } else {
         this.leftPowerCalibrationBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addLeftPowerCalibration(ExerciseSamples$PbCalibrationValue$Builder var1) {
      if (this.leftPowerCalibrationBuilder_ == null) {
         this.ensureLeftPowerCalibrationIsMutable();
         this.leftPowerCalibration_.add(var1.build());
         this.onChanged();
      } else {
         this.leftPowerCalibrationBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addLeftPowerCalibration(ExerciseSamples$PbCalibrationValue var1) {
      if (this.leftPowerCalibrationBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureLeftPowerCalibrationIsMutable();
         this.leftPowerCalibration_.add(var1);
         this.onChanged();
      } else {
         this.leftPowerCalibrationBuilder_.addMessage(var1);
      }

      return this;
   }

   public ExerciseSamples$PbCalibrationValue$Builder addLeftPowerCalibrationBuilder() {
      return (ExerciseSamples$PbCalibrationValue$Builder)this.getLeftPowerCalibrationFieldBuilder().addBuilder(ExerciseSamples$PbCalibrationValue.getDefaultInstance());
   }

   public ExerciseSamples$PbCalibrationValue$Builder addLeftPowerCalibrationBuilder(int var1) {
      return (ExerciseSamples$PbCalibrationValue$Builder)this.getLeftPowerCalibrationFieldBuilder().addBuilder(var1, ExerciseSamples$PbCalibrationValue.getDefaultInstance());
   }

   public ExerciseSamples$PbExerciseSamples$Builder addMovingTypeOffline(int var1, Types$PbSensorOffline$Builder var2) {
      if (this.movingTypeOfflineBuilder_ == null) {
         this.ensureMovingTypeOfflineIsMutable();
         this.movingTypeOffline_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.movingTypeOfflineBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addMovingTypeOffline(int var1, Types$PbSensorOffline var2) {
      if (this.movingTypeOfflineBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureMovingTypeOfflineIsMutable();
         this.movingTypeOffline_.add(var1, var2);
         this.onChanged();
      } else {
         this.movingTypeOfflineBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addMovingTypeOffline(Types$PbSensorOffline$Builder var1) {
      if (this.movingTypeOfflineBuilder_ == null) {
         this.ensureMovingTypeOfflineIsMutable();
         this.movingTypeOffline_.add(var1.build());
         this.onChanged();
      } else {
         this.movingTypeOfflineBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addMovingTypeOffline(Types$PbSensorOffline var1) {
      if (this.movingTypeOfflineBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureMovingTypeOfflineIsMutable();
         this.movingTypeOffline_.add(var1);
         this.onChanged();
      } else {
         this.movingTypeOfflineBuilder_.addMessage(var1);
      }

      return this;
   }

   public Types$PbSensorOffline$Builder addMovingTypeOfflineBuilder() {
      return (Types$PbSensorOffline$Builder)this.getMovingTypeOfflineFieldBuilder().addBuilder(Types$PbSensorOffline.getDefaultInstance());
   }

   public Types$PbSensorOffline$Builder addMovingTypeOfflineBuilder(int var1) {
      return (Types$PbSensorOffline$Builder)this.getMovingTypeOfflineFieldBuilder().addBuilder(var1, Types$PbSensorOffline.getDefaultInstance());
   }

   public ExerciseSamples$PbExerciseSamples$Builder addMovingTypeSamples(Types$PbMovingType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.ensureMovingTypeSamplesIsMutable();
         this.movingTypeSamples_.add(var1.getNumber());
         this.onChanged();
         return this;
      }
   }

   public ExerciseSamples$PbExerciseSamples$Builder addPauseTimes(int var1, Structures$PbPauseTime$Builder var2) {
      if (this.pauseTimesBuilder_ == null) {
         this.ensurePauseTimesIsMutable();
         this.pauseTimes_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.pauseTimesBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addPauseTimes(int var1, Structures$PbPauseTime var2) {
      if (this.pauseTimesBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensurePauseTimesIsMutable();
         this.pauseTimes_.add(var1, var2);
         this.onChanged();
      } else {
         this.pauseTimesBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addPauseTimes(Structures$PbPauseTime$Builder var1) {
      if (this.pauseTimesBuilder_ == null) {
         this.ensurePauseTimesIsMutable();
         this.pauseTimes_.add(var1.build());
         this.onChanged();
      } else {
         this.pauseTimesBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addPauseTimes(Structures$PbPauseTime var1) {
      if (this.pauseTimesBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensurePauseTimesIsMutable();
         this.pauseTimes_.add(var1);
         this.onChanged();
      } else {
         this.pauseTimesBuilder_.addMessage(var1);
      }

      return this;
   }

   public Structures$PbPauseTime$Builder addPauseTimesBuilder() {
      return (Structures$PbPauseTime$Builder)this.getPauseTimesFieldBuilder().addBuilder(Structures$PbPauseTime.getDefaultInstance());
   }

   public Structures$PbPauseTime$Builder addPauseTimesBuilder(int var1) {
      return (Structures$PbPauseTime$Builder)this.getPauseTimesFieldBuilder().addBuilder(var1, Structures$PbPauseTime.getDefaultInstance());
   }

   public ExerciseSamples$PbExerciseSamples$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseSamples$PbExerciseSamples$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseSamples$PbExerciseSamples$Builder addRightPedalPowerOffline(int var1, Types$PbSensorOffline$Builder var2) {
      if (this.rightPedalPowerOfflineBuilder_ == null) {
         this.ensureRightPedalPowerOfflineIsMutable();
         this.rightPedalPowerOffline_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.rightPedalPowerOfflineBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addRightPedalPowerOffline(int var1, Types$PbSensorOffline var2) {
      if (this.rightPedalPowerOfflineBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureRightPedalPowerOfflineIsMutable();
         this.rightPedalPowerOffline_.add(var1, var2);
         this.onChanged();
      } else {
         this.rightPedalPowerOfflineBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addRightPedalPowerOffline(Types$PbSensorOffline$Builder var1) {
      if (this.rightPedalPowerOfflineBuilder_ == null) {
         this.ensureRightPedalPowerOfflineIsMutable();
         this.rightPedalPowerOffline_.add(var1.build());
         this.onChanged();
      } else {
         this.rightPedalPowerOfflineBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addRightPedalPowerOffline(Types$PbSensorOffline var1) {
      if (this.rightPedalPowerOfflineBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureRightPedalPowerOfflineIsMutable();
         this.rightPedalPowerOffline_.add(var1);
         this.onChanged();
      } else {
         this.rightPedalPowerOfflineBuilder_.addMessage(var1);
      }

      return this;
   }

   public Types$PbSensorOffline$Builder addRightPedalPowerOfflineBuilder() {
      return (Types$PbSensorOffline$Builder)this.getRightPedalPowerOfflineFieldBuilder().addBuilder(Types$PbSensorOffline.getDefaultInstance());
   }

   public Types$PbSensorOffline$Builder addRightPedalPowerOfflineBuilder(int var1) {
      return (Types$PbSensorOffline$Builder)this.getRightPedalPowerOfflineFieldBuilder().addBuilder(var1, Types$PbSensorOffline.getDefaultInstance());
   }

   public ExerciseSamples$PbExerciseSamples$Builder addRightPedalPowerSamples(int var1, ExerciseSamples$PbPowerMeasurements$Builder var2) {
      if (this.rightPedalPowerSamplesBuilder_ == null) {
         this.ensureRightPedalPowerSamplesIsMutable();
         this.rightPedalPowerSamples_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.rightPedalPowerSamplesBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addRightPedalPowerSamples(int var1, ExerciseSamples$PbPowerMeasurements var2) {
      if (this.rightPedalPowerSamplesBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureRightPedalPowerSamplesIsMutable();
         this.rightPedalPowerSamples_.add(var1, var2);
         this.onChanged();
      } else {
         this.rightPedalPowerSamplesBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addRightPedalPowerSamples(ExerciseSamples$PbPowerMeasurements$Builder var1) {
      if (this.rightPedalPowerSamplesBuilder_ == null) {
         this.ensureRightPedalPowerSamplesIsMutable();
         this.rightPedalPowerSamples_.add(var1.build());
         this.onChanged();
      } else {
         this.rightPedalPowerSamplesBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addRightPedalPowerSamples(ExerciseSamples$PbPowerMeasurements var1) {
      if (this.rightPedalPowerSamplesBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureRightPedalPowerSamplesIsMutable();
         this.rightPedalPowerSamples_.add(var1);
         this.onChanged();
      } else {
         this.rightPedalPowerSamplesBuilder_.addMessage(var1);
      }

      return this;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder addRightPedalPowerSamplesBuilder() {
      return (ExerciseSamples$PbPowerMeasurements$Builder)this.getRightPedalPowerSamplesFieldBuilder().addBuilder(ExerciseSamples$PbPowerMeasurements.getDefaultInstance());
   }

   public ExerciseSamples$PbPowerMeasurements$Builder addRightPedalPowerSamplesBuilder(int var1) {
      return (ExerciseSamples$PbPowerMeasurements$Builder)this.getRightPedalPowerSamplesFieldBuilder().addBuilder(var1, ExerciseSamples$PbPowerMeasurements.getDefaultInstance());
   }

   public ExerciseSamples$PbExerciseSamples$Builder addRightPowerCalibration(int var1, ExerciseSamples$PbCalibrationValue$Builder var2) {
      if (this.rightPowerCalibrationBuilder_ == null) {
         this.ensureRightPowerCalibrationIsMutable();
         this.rightPowerCalibration_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.rightPowerCalibrationBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addRightPowerCalibration(int var1, ExerciseSamples$PbCalibrationValue var2) {
      if (this.rightPowerCalibrationBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureRightPowerCalibrationIsMutable();
         this.rightPowerCalibration_.add(var1, var2);
         this.onChanged();
      } else {
         this.rightPowerCalibrationBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addRightPowerCalibration(ExerciseSamples$PbCalibrationValue$Builder var1) {
      if (this.rightPowerCalibrationBuilder_ == null) {
         this.ensureRightPowerCalibrationIsMutable();
         this.rightPowerCalibration_.add(var1.build());
         this.onChanged();
      } else {
         this.rightPowerCalibrationBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addRightPowerCalibration(ExerciseSamples$PbCalibrationValue var1) {
      if (this.rightPowerCalibrationBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureRightPowerCalibrationIsMutable();
         this.rightPowerCalibration_.add(var1);
         this.onChanged();
      } else {
         this.rightPowerCalibrationBuilder_.addMessage(var1);
      }

      return this;
   }

   public ExerciseSamples$PbCalibrationValue$Builder addRightPowerCalibrationBuilder() {
      return (ExerciseSamples$PbCalibrationValue$Builder)this.getRightPowerCalibrationFieldBuilder().addBuilder(ExerciseSamples$PbCalibrationValue.getDefaultInstance());
   }

   public ExerciseSamples$PbCalibrationValue$Builder addRightPowerCalibrationBuilder(int var1) {
      return (ExerciseSamples$PbCalibrationValue$Builder)this.getRightPowerCalibrationFieldBuilder().addBuilder(var1, ExerciseSamples$PbCalibrationValue.getDefaultInstance());
   }

   public ExerciseSamples$PbExerciseSamples$Builder addSpeedOffline(int var1, Types$PbSensorOffline$Builder var2) {
      if (this.speedOfflineBuilder_ == null) {
         this.ensureSpeedOfflineIsMutable();
         this.speedOffline_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.speedOfflineBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addSpeedOffline(int var1, Types$PbSensorOffline var2) {
      if (this.speedOfflineBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureSpeedOfflineIsMutable();
         this.speedOffline_.add(var1, var2);
         this.onChanged();
      } else {
         this.speedOfflineBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addSpeedOffline(Types$PbSensorOffline$Builder var1) {
      if (this.speedOfflineBuilder_ == null) {
         this.ensureSpeedOfflineIsMutable();
         this.speedOffline_.add(var1.build());
         this.onChanged();
      } else {
         this.speedOfflineBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addSpeedOffline(Types$PbSensorOffline var1) {
      if (this.speedOfflineBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureSpeedOfflineIsMutable();
         this.speedOffline_.add(var1);
         this.onChanged();
      } else {
         this.speedOfflineBuilder_.addMessage(var1);
      }

      return this;
   }

   public Types$PbSensorOffline$Builder addSpeedOfflineBuilder() {
      return (Types$PbSensorOffline$Builder)this.getSpeedOfflineFieldBuilder().addBuilder(Types$PbSensorOffline.getDefaultInstance());
   }

   public Types$PbSensorOffline$Builder addSpeedOfflineBuilder(int var1) {
      return (Types$PbSensorOffline$Builder)this.getSpeedOfflineFieldBuilder().addBuilder(var1, Types$PbSensorOffline.getDefaultInstance());
   }

   public ExerciseSamples$PbExerciseSamples$Builder addSpeedSamples(float var1) {
      this.ensureSpeedSamplesIsMutable();
      this.speedSamples_.add(var1);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addStrideCalibration(int var1, ExerciseSamples$PbCalibrationValue$Builder var2) {
      if (this.strideCalibrationBuilder_ == null) {
         this.ensureStrideCalibrationIsMutable();
         this.strideCalibration_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.strideCalibrationBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addStrideCalibration(int var1, ExerciseSamples$PbCalibrationValue var2) {
      if (this.strideCalibrationBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureStrideCalibrationIsMutable();
         this.strideCalibration_.add(var1, var2);
         this.onChanged();
      } else {
         this.strideCalibrationBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addStrideCalibration(ExerciseSamples$PbCalibrationValue$Builder var1) {
      if (this.strideCalibrationBuilder_ == null) {
         this.ensureStrideCalibrationIsMutable();
         this.strideCalibration_.add(var1.build());
         this.onChanged();
      } else {
         this.strideCalibrationBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addStrideCalibration(ExerciseSamples$PbCalibrationValue var1) {
      if (this.strideCalibrationBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureStrideCalibrationIsMutable();
         this.strideCalibration_.add(var1);
         this.onChanged();
      } else {
         this.strideCalibrationBuilder_.addMessage(var1);
      }

      return this;
   }

   public ExerciseSamples$PbCalibrationValue$Builder addStrideCalibrationBuilder() {
      return (ExerciseSamples$PbCalibrationValue$Builder)this.getStrideCalibrationFieldBuilder().addBuilder(ExerciseSamples$PbCalibrationValue.getDefaultInstance());
   }

   public ExerciseSamples$PbCalibrationValue$Builder addStrideCalibrationBuilder(int var1) {
      return (ExerciseSamples$PbCalibrationValue$Builder)this.getStrideCalibrationFieldBuilder().addBuilder(var1, ExerciseSamples$PbCalibrationValue.getDefaultInstance());
   }

   public ExerciseSamples$PbExerciseSamples$Builder addStrideLengthOffline(int var1, Types$PbSensorOffline$Builder var2) {
      if (this.strideLengthOfflineBuilder_ == null) {
         this.ensureStrideLengthOfflineIsMutable();
         this.strideLengthOffline_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.strideLengthOfflineBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addStrideLengthOffline(int var1, Types$PbSensorOffline var2) {
      if (this.strideLengthOfflineBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureStrideLengthOfflineIsMutable();
         this.strideLengthOffline_.add(var1, var2);
         this.onChanged();
      } else {
         this.strideLengthOfflineBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addStrideLengthOffline(Types$PbSensorOffline$Builder var1) {
      if (this.strideLengthOfflineBuilder_ == null) {
         this.ensureStrideLengthOfflineIsMutable();
         this.strideLengthOffline_.add(var1.build());
         this.onChanged();
      } else {
         this.strideLengthOfflineBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addStrideLengthOffline(Types$PbSensorOffline var1) {
      if (this.strideLengthOfflineBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureStrideLengthOfflineIsMutable();
         this.strideLengthOffline_.add(var1);
         this.onChanged();
      } else {
         this.strideLengthOfflineBuilder_.addMessage(var1);
      }

      return this;
   }

   public Types$PbSensorOffline$Builder addStrideLengthOfflineBuilder() {
      return (Types$PbSensorOffline$Builder)this.getStrideLengthOfflineFieldBuilder().addBuilder(Types$PbSensorOffline.getDefaultInstance());
   }

   public Types$PbSensorOffline$Builder addStrideLengthOfflineBuilder(int var1) {
      return (Types$PbSensorOffline$Builder)this.getStrideLengthOfflineFieldBuilder().addBuilder(var1, Types$PbSensorOffline.getDefaultInstance());
   }

   public ExerciseSamples$PbExerciseSamples$Builder addStrideLengthSamples(int var1) {
      this.ensureStrideLengthSamplesIsMutable();
      this.strideLengthSamples_.add(var1);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addTemperatureOffline(int var1, Types$PbSensorOffline$Builder var2) {
      if (this.temperatureOfflineBuilder_ == null) {
         this.ensureTemperatureOfflineIsMutable();
         this.temperatureOffline_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.temperatureOfflineBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addTemperatureOffline(int var1, Types$PbSensorOffline var2) {
      if (this.temperatureOfflineBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureTemperatureOfflineIsMutable();
         this.temperatureOffline_.add(var1, var2);
         this.onChanged();
      } else {
         this.temperatureOfflineBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addTemperatureOffline(Types$PbSensorOffline$Builder var1) {
      if (this.temperatureOfflineBuilder_ == null) {
         this.ensureTemperatureOfflineIsMutable();
         this.temperatureOffline_.add(var1.build());
         this.onChanged();
      } else {
         this.temperatureOfflineBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder addTemperatureOffline(Types$PbSensorOffline var1) {
      if (this.temperatureOfflineBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureTemperatureOfflineIsMutable();
         this.temperatureOffline_.add(var1);
         this.onChanged();
      } else {
         this.temperatureOfflineBuilder_.addMessage(var1);
      }

      return this;
   }

   public Types$PbSensorOffline$Builder addTemperatureOfflineBuilder() {
      return (Types$PbSensorOffline$Builder)this.getTemperatureOfflineFieldBuilder().addBuilder(Types$PbSensorOffline.getDefaultInstance());
   }

   public Types$PbSensorOffline$Builder addTemperatureOfflineBuilder(int var1) {
      return (Types$PbSensorOffline$Builder)this.getTemperatureOfflineFieldBuilder().addBuilder(var1, Types$PbSensorOffline.getDefaultInstance());
   }

   public ExerciseSamples$PbExerciseSamples$Builder addTemperatureSamples(float var1) {
      this.ensureTemperatureSamplesIsMutable();
      this.temperatureSamples_.add(var1);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples build() {
      ExerciseSamples$PbExerciseSamples var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseSamples$PbExerciseSamples buildPartial() {
      ExerciseSamples$PbExerciseSamples var1 = new ExerciseSamples$PbExerciseSamples(this, (ExerciseSamples$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.recordingIntervalBuilder_ == null) {
         ExerciseSamples$PbExerciseSamples.a(var1, this.recordingInterval_);
      } else {
         ExerciseSamples$PbExerciseSamples.a(var1, (Types$PbDuration)this.recordingIntervalBuilder_.build());
      }

      if ((this.bitField0_ & 2) == 2) {
         this.heartRateSamples_ = Collections.unmodifiableList(this.heartRateSamples_);
         this.bitField0_ &= -3;
      }

      ExerciseSamples$PbExerciseSamples.a(var1, this.heartRateSamples_);
      if (this.heartRateOfflineBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4) {
            this.heartRateOffline_ = Collections.unmodifiableList(this.heartRateOffline_);
            this.bitField0_ &= -5;
         }

         ExerciseSamples$PbExerciseSamples.b(var1, this.heartRateOffline_);
      } else {
         ExerciseSamples$PbExerciseSamples.b(var1, this.heartRateOfflineBuilder_.build());
      }

      if ((this.bitField0_ & 8) == 8) {
         this.cadenceSamples_ = Collections.unmodifiableList(this.cadenceSamples_);
         this.bitField0_ &= -9;
      }

      ExerciseSamples$PbExerciseSamples.c(var1, this.cadenceSamples_);
      if (this.cadenceOfflineBuilder_ == null) {
         if ((this.bitField0_ & 16) == 16) {
            this.cadenceOffline_ = Collections.unmodifiableList(this.cadenceOffline_);
            this.bitField0_ &= -17;
         }

         ExerciseSamples$PbExerciseSamples.d(var1, this.cadenceOffline_);
      } else {
         ExerciseSamples$PbExerciseSamples.d(var1, this.cadenceOfflineBuilder_.build());
      }

      if ((this.bitField0_ & 32) == 32) {
         this.altitudeSamples_ = Collections.unmodifiableList(this.altitudeSamples_);
         this.bitField0_ &= -33;
      }

      ExerciseSamples$PbExerciseSamples.e(var1, this.altitudeSamples_);
      if (this.altitudeOfflineBuilder_ == null) {
         if ((this.bitField0_ & 64) == 64) {
            this.altitudeOffline_ = Collections.unmodifiableList(this.altitudeOffline_);
            this.bitField0_ &= -65;
         }

         ExerciseSamples$PbExerciseSamples.f(var1, this.altitudeOffline_);
      } else {
         ExerciseSamples$PbExerciseSamples.f(var1, this.altitudeOfflineBuilder_.build());
      }

      if (this.altitudeCalibrationBuilder_ == null) {
         if ((this.bitField0_ & 128) == 128) {
            this.altitudeCalibration_ = Collections.unmodifiableList(this.altitudeCalibration_);
            this.bitField0_ &= -129;
         }

         ExerciseSamples$PbExerciseSamples.g(var1, this.altitudeCalibration_);
      } else {
         ExerciseSamples$PbExerciseSamples.g(var1, this.altitudeCalibrationBuilder_.build());
      }

      if ((this.bitField0_ & 256) == 256) {
         this.temperatureSamples_ = Collections.unmodifiableList(this.temperatureSamples_);
         this.bitField0_ &= -257;
      }

      ExerciseSamples$PbExerciseSamples.h(var1, this.temperatureSamples_);
      if (this.temperatureOfflineBuilder_ == null) {
         if ((this.bitField0_ & 512) == 512) {
            this.temperatureOffline_ = Collections.unmodifiableList(this.temperatureOffline_);
            this.bitField0_ &= -513;
         }

         ExerciseSamples$PbExerciseSamples.i(var1, this.temperatureOffline_);
      } else {
         ExerciseSamples$PbExerciseSamples.i(var1, this.temperatureOfflineBuilder_.build());
      }

      if ((this.bitField0_ & 1024) == 1024) {
         this.speedSamples_ = Collections.unmodifiableList(this.speedSamples_);
         this.bitField0_ &= -1025;
      }

      ExerciseSamples$PbExerciseSamples.j(var1, this.speedSamples_);
      if (this.speedOfflineBuilder_ == null) {
         if ((this.bitField0_ & 2048) == 2048) {
            this.speedOffline_ = Collections.unmodifiableList(this.speedOffline_);
            this.bitField0_ &= -2049;
         }

         ExerciseSamples$PbExerciseSamples.k(var1, this.speedOffline_);
      } else {
         ExerciseSamples$PbExerciseSamples.k(var1, this.speedOfflineBuilder_.build());
      }

      if ((this.bitField0_ & 4096) == 4096) {
         this.distanceSamples_ = Collections.unmodifiableList(this.distanceSamples_);
         this.bitField0_ &= -4097;
      }

      ExerciseSamples$PbExerciseSamples.l(var1, this.distanceSamples_);
      if (this.distanceOfflineBuilder_ == null) {
         if ((this.bitField0_ & 8192) == 8192) {
            this.distanceOffline_ = Collections.unmodifiableList(this.distanceOffline_);
            this.bitField0_ &= -8193;
         }

         ExerciseSamples$PbExerciseSamples.m(var1, this.distanceOffline_);
      } else {
         ExerciseSamples$PbExerciseSamples.m(var1, this.distanceOfflineBuilder_.build());
      }

      if ((this.bitField0_ & 16384) == 16384) {
         this.strideLengthSamples_ = Collections.unmodifiableList(this.strideLengthSamples_);
         this.bitField0_ &= -16385;
      }

      ExerciseSamples$PbExerciseSamples.n(var1, this.strideLengthSamples_);
      if (this.strideLengthOfflineBuilder_ == null) {
         if ((this.bitField0_ & '耀') == 32768) {
            this.strideLengthOffline_ = Collections.unmodifiableList(this.strideLengthOffline_);
            this.bitField0_ &= -32769;
         }

         ExerciseSamples$PbExerciseSamples.o(var1, this.strideLengthOffline_);
      } else {
         ExerciseSamples$PbExerciseSamples.o(var1, this.strideLengthOfflineBuilder_.build());
      }

      if (this.strideCalibrationBuilder_ == null) {
         if ((this.bitField0_ & 65536) == 65536) {
            this.strideCalibration_ = Collections.unmodifiableList(this.strideCalibration_);
            this.bitField0_ &= -65537;
         }

         ExerciseSamples$PbExerciseSamples.p(var1, this.strideCalibration_);
      } else {
         ExerciseSamples$PbExerciseSamples.p(var1, this.strideCalibrationBuilder_.build());
      }

      if ((this.bitField0_ & 131072) == 131072) {
         this.forwardAcceleration_ = Collections.unmodifiableList(this.forwardAcceleration_);
         this.bitField0_ &= -131073;
      }

      ExerciseSamples$PbExerciseSamples.q(var1, this.forwardAcceleration_);
      if (this.forwardAccelerationOfflineBuilder_ == null) {
         if ((this.bitField0_ & 262144) == 262144) {
            this.forwardAccelerationOffline_ = Collections.unmodifiableList(this.forwardAccelerationOffline_);
            this.bitField0_ &= -262145;
         }

         ExerciseSamples$PbExerciseSamples.r(var1, this.forwardAccelerationOffline_);
      } else {
         ExerciseSamples$PbExerciseSamples.r(var1, this.forwardAccelerationOfflineBuilder_.build());
      }

      if ((this.bitField0_ & 524288) == 524288) {
         this.movingTypeSamples_ = Collections.unmodifiableList(this.movingTypeSamples_);
         this.bitField0_ &= -524289;
      }

      ExerciseSamples$PbExerciseSamples.s(var1, this.movingTypeSamples_);
      if (this.movingTypeOfflineBuilder_ == null) {
         if ((this.bitField0_ & 1048576) == 1048576) {
            this.movingTypeOffline_ = Collections.unmodifiableList(this.movingTypeOffline_);
            this.bitField0_ &= -1048577;
         }

         ExerciseSamples$PbExerciseSamples.t(var1, this.movingTypeOffline_);
      } else {
         ExerciseSamples$PbExerciseSamples.t(var1, this.movingTypeOfflineBuilder_.build());
      }

      if (this.leftPedalPowerSamplesBuilder_ == null) {
         if ((this.bitField0_ & 2097152) == 2097152) {
            this.leftPedalPowerSamples_ = Collections.unmodifiableList(this.leftPedalPowerSamples_);
            this.bitField0_ &= -2097153;
         }

         ExerciseSamples$PbExerciseSamples.u(var1, this.leftPedalPowerSamples_);
      } else {
         ExerciseSamples$PbExerciseSamples.u(var1, this.leftPedalPowerSamplesBuilder_.build());
      }

      if (this.leftPedalPowerOfflineBuilder_ == null) {
         if ((this.bitField0_ & 4194304) == 4194304) {
            this.leftPedalPowerOffline_ = Collections.unmodifiableList(this.leftPedalPowerOffline_);
            this.bitField0_ &= -4194305;
         }

         ExerciseSamples$PbExerciseSamples.v(var1, this.leftPedalPowerOffline_);
      } else {
         ExerciseSamples$PbExerciseSamples.v(var1, this.leftPedalPowerOfflineBuilder_.build());
      }

      if (this.rightPedalPowerSamplesBuilder_ == null) {
         if ((this.bitField0_ & 8388608) == 8388608) {
            this.rightPedalPowerSamples_ = Collections.unmodifiableList(this.rightPedalPowerSamples_);
            this.bitField0_ &= -8388609;
         }

         ExerciseSamples$PbExerciseSamples.w(var1, this.rightPedalPowerSamples_);
      } else {
         ExerciseSamples$PbExerciseSamples.w(var1, this.rightPedalPowerSamplesBuilder_.build());
      }

      if (this.rightPedalPowerOfflineBuilder_ == null) {
         if ((this.bitField0_ & 16777216) == 16777216) {
            this.rightPedalPowerOffline_ = Collections.unmodifiableList(this.rightPedalPowerOffline_);
            this.bitField0_ &= -16777217;
         }

         ExerciseSamples$PbExerciseSamples.x(var1, this.rightPedalPowerOffline_);
      } else {
         ExerciseSamples$PbExerciseSamples.x(var1, this.rightPedalPowerOfflineBuilder_.build());
      }

      if (this.leftPowerCalibrationBuilder_ == null) {
         if ((this.bitField0_ & 33554432) == 33554432) {
            this.leftPowerCalibration_ = Collections.unmodifiableList(this.leftPowerCalibration_);
            this.bitField0_ &= -33554433;
         }

         ExerciseSamples$PbExerciseSamples.y(var1, this.leftPowerCalibration_);
      } else {
         ExerciseSamples$PbExerciseSamples.y(var1, this.leftPowerCalibrationBuilder_.build());
      }

      if (this.rightPowerCalibrationBuilder_ == null) {
         if ((this.bitField0_ & 67108864) == 67108864) {
            this.rightPowerCalibration_ = Collections.unmodifiableList(this.rightPowerCalibration_);
            this.bitField0_ &= -67108865;
         }

         ExerciseSamples$PbExerciseSamples.z(var1, this.rightPowerCalibration_);
      } else {
         ExerciseSamples$PbExerciseSamples.z(var1, this.rightPowerCalibrationBuilder_.build());
      }

      int var4 = var3;
      if ((134217728 & var2) == 134217728) {
         var4 = var3 | 2;
      }

      if (this.rrSamplesBuilder_ == null) {
         ExerciseSamples$PbExerciseSamples.a(var1, this.rrSamples_);
      } else {
         ExerciseSamples$PbExerciseSamples.a(var1, (ExerciseRRSamples$PbExerciseRRIntervals)this.rrSamplesBuilder_.build());
      }

      if (this.exerciseIntervalledSampleListBuilder_ == null) {
         if ((this.bitField0_ & 268435456) == 268435456) {
            this.exerciseIntervalledSampleList_ = Collections.unmodifiableList(this.exerciseIntervalledSampleList_);
            this.bitField0_ &= -268435457;
         }

         ExerciseSamples$PbExerciseSamples.A(var1, this.exerciseIntervalledSampleList_);
      } else {
         ExerciseSamples$PbExerciseSamples.A(var1, this.exerciseIntervalledSampleListBuilder_.build());
      }

      if (this.pauseTimesBuilder_ == null) {
         if ((this.bitField0_ & 536870912) == 536870912) {
            this.pauseTimes_ = Collections.unmodifiableList(this.pauseTimes_);
            this.bitField0_ &= -536870913;
         }

         ExerciseSamples$PbExerciseSamples.B(var1, this.pauseTimes_);
      } else {
         ExerciseSamples$PbExerciseSamples.B(var1, this.pauseTimesBuilder_.build());
      }

      ExerciseSamples$PbExerciseSamples.a(var1, var4);
      this.onBuilt();
      return var1;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clear() {
      super.clear();
      if (this.recordingIntervalBuilder_ == null) {
         this.recordingInterval_ = null;
      } else {
         this.recordingIntervalBuilder_.clear();
      }

      this.bitField0_ &= -2;
      this.heartRateSamples_ = Collections.emptyList();
      this.bitField0_ &= -3;
      if (this.heartRateOfflineBuilder_ == null) {
         this.heartRateOffline_ = Collections.emptyList();
         this.bitField0_ &= -5;
      } else {
         this.heartRateOfflineBuilder_.clear();
      }

      this.cadenceSamples_ = Collections.emptyList();
      this.bitField0_ &= -9;
      if (this.cadenceOfflineBuilder_ == null) {
         this.cadenceOffline_ = Collections.emptyList();
         this.bitField0_ &= -17;
      } else {
         this.cadenceOfflineBuilder_.clear();
      }

      this.altitudeSamples_ = Collections.emptyList();
      this.bitField0_ &= -33;
      if (this.altitudeOfflineBuilder_ == null) {
         this.altitudeOffline_ = Collections.emptyList();
         this.bitField0_ &= -65;
      } else {
         this.altitudeOfflineBuilder_.clear();
      }

      if (this.altitudeCalibrationBuilder_ == null) {
         this.altitudeCalibration_ = Collections.emptyList();
         this.bitField0_ &= -129;
      } else {
         this.altitudeCalibrationBuilder_.clear();
      }

      this.temperatureSamples_ = Collections.emptyList();
      this.bitField0_ &= -257;
      if (this.temperatureOfflineBuilder_ == null) {
         this.temperatureOffline_ = Collections.emptyList();
         this.bitField0_ &= -513;
      } else {
         this.temperatureOfflineBuilder_.clear();
      }

      this.speedSamples_ = Collections.emptyList();
      this.bitField0_ &= -1025;
      if (this.speedOfflineBuilder_ == null) {
         this.speedOffline_ = Collections.emptyList();
         this.bitField0_ &= -2049;
      } else {
         this.speedOfflineBuilder_.clear();
      }

      this.distanceSamples_ = Collections.emptyList();
      this.bitField0_ &= -4097;
      if (this.distanceOfflineBuilder_ == null) {
         this.distanceOffline_ = Collections.emptyList();
         this.bitField0_ &= -8193;
      } else {
         this.distanceOfflineBuilder_.clear();
      }

      this.strideLengthSamples_ = Collections.emptyList();
      this.bitField0_ &= -16385;
      if (this.strideLengthOfflineBuilder_ == null) {
         this.strideLengthOffline_ = Collections.emptyList();
         this.bitField0_ &= -32769;
      } else {
         this.strideLengthOfflineBuilder_.clear();
      }

      if (this.strideCalibrationBuilder_ == null) {
         this.strideCalibration_ = Collections.emptyList();
         this.bitField0_ &= -65537;
      } else {
         this.strideCalibrationBuilder_.clear();
      }

      this.forwardAcceleration_ = Collections.emptyList();
      this.bitField0_ &= -131073;
      if (this.forwardAccelerationOfflineBuilder_ == null) {
         this.forwardAccelerationOffline_ = Collections.emptyList();
         this.bitField0_ &= -262145;
      } else {
         this.forwardAccelerationOfflineBuilder_.clear();
      }

      this.movingTypeSamples_ = Collections.emptyList();
      this.bitField0_ &= -524289;
      if (this.movingTypeOfflineBuilder_ == null) {
         this.movingTypeOffline_ = Collections.emptyList();
         this.bitField0_ &= -1048577;
      } else {
         this.movingTypeOfflineBuilder_.clear();
      }

      if (this.leftPedalPowerSamplesBuilder_ == null) {
         this.leftPedalPowerSamples_ = Collections.emptyList();
         this.bitField0_ &= -2097153;
      } else {
         this.leftPedalPowerSamplesBuilder_.clear();
      }

      if (this.leftPedalPowerOfflineBuilder_ == null) {
         this.leftPedalPowerOffline_ = Collections.emptyList();
         this.bitField0_ &= -4194305;
      } else {
         this.leftPedalPowerOfflineBuilder_.clear();
      }

      if (this.rightPedalPowerSamplesBuilder_ == null) {
         this.rightPedalPowerSamples_ = Collections.emptyList();
         this.bitField0_ &= -8388609;
      } else {
         this.rightPedalPowerSamplesBuilder_.clear();
      }

      if (this.rightPedalPowerOfflineBuilder_ == null) {
         this.rightPedalPowerOffline_ = Collections.emptyList();
         this.bitField0_ &= -16777217;
      } else {
         this.rightPedalPowerOfflineBuilder_.clear();
      }

      if (this.leftPowerCalibrationBuilder_ == null) {
         this.leftPowerCalibration_ = Collections.emptyList();
         this.bitField0_ &= -33554433;
      } else {
         this.leftPowerCalibrationBuilder_.clear();
      }

      if (this.rightPowerCalibrationBuilder_ == null) {
         this.rightPowerCalibration_ = Collections.emptyList();
         this.bitField0_ &= -67108865;
      } else {
         this.rightPowerCalibrationBuilder_.clear();
      }

      if (this.rrSamplesBuilder_ == null) {
         this.rrSamples_ = null;
      } else {
         this.rrSamplesBuilder_.clear();
      }

      this.bitField0_ &= -134217729;
      if (this.exerciseIntervalledSampleListBuilder_ == null) {
         this.exerciseIntervalledSampleList_ = Collections.emptyList();
         this.bitField0_ &= -268435457;
      } else {
         this.exerciseIntervalledSampleListBuilder_.clear();
      }

      if (this.pauseTimesBuilder_ == null) {
         this.pauseTimes_ = Collections.emptyList();
         this.bitField0_ &= -536870913;
      } else {
         this.pauseTimesBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearAltitudeCalibration() {
      if (this.altitudeCalibrationBuilder_ == null) {
         this.altitudeCalibration_ = Collections.emptyList();
         this.bitField0_ &= -129;
         this.onChanged();
      } else {
         this.altitudeCalibrationBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearAltitudeOffline() {
      if (this.altitudeOfflineBuilder_ == null) {
         this.altitudeOffline_ = Collections.emptyList();
         this.bitField0_ &= -65;
         this.onChanged();
      } else {
         this.altitudeOfflineBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearAltitudeSamples() {
      this.altitudeSamples_ = Collections.emptyList();
      this.bitField0_ &= -33;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearCadenceOffline() {
      if (this.cadenceOfflineBuilder_ == null) {
         this.cadenceOffline_ = Collections.emptyList();
         this.bitField0_ &= -17;
         this.onChanged();
      } else {
         this.cadenceOfflineBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearCadenceSamples() {
      this.cadenceSamples_ = Collections.emptyList();
      this.bitField0_ &= -9;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearDistanceOffline() {
      if (this.distanceOfflineBuilder_ == null) {
         this.distanceOffline_ = Collections.emptyList();
         this.bitField0_ &= -8193;
         this.onChanged();
      } else {
         this.distanceOfflineBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearDistanceSamples() {
      this.distanceSamples_ = Collections.emptyList();
      this.bitField0_ &= -4097;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearExerciseIntervalledSampleList() {
      if (this.exerciseIntervalledSampleListBuilder_ == null) {
         this.exerciseIntervalledSampleList_ = Collections.emptyList();
         this.bitField0_ &= -268435457;
         this.onChanged();
      } else {
         this.exerciseIntervalledSampleListBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearField(FieldDescriptor var1) {
      return (ExerciseSamples$PbExerciseSamples$Builder)super.clearField(var1);
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearForwardAcceleration() {
      this.forwardAcceleration_ = Collections.emptyList();
      this.bitField0_ &= -131073;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearForwardAccelerationOffline() {
      if (this.forwardAccelerationOfflineBuilder_ == null) {
         this.forwardAccelerationOffline_ = Collections.emptyList();
         this.bitField0_ &= -262145;
         this.onChanged();
      } else {
         this.forwardAccelerationOfflineBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearHeartRateOffline() {
      if (this.heartRateOfflineBuilder_ == null) {
         this.heartRateOffline_ = Collections.emptyList();
         this.bitField0_ &= -5;
         this.onChanged();
      } else {
         this.heartRateOfflineBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearHeartRateSamples() {
      this.heartRateSamples_ = Collections.emptyList();
      this.bitField0_ &= -3;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearLeftPedalPowerOffline() {
      if (this.leftPedalPowerOfflineBuilder_ == null) {
         this.leftPedalPowerOffline_ = Collections.emptyList();
         this.bitField0_ &= -4194305;
         this.onChanged();
      } else {
         this.leftPedalPowerOfflineBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearLeftPedalPowerSamples() {
      if (this.leftPedalPowerSamplesBuilder_ == null) {
         this.leftPedalPowerSamples_ = Collections.emptyList();
         this.bitField0_ &= -2097153;
         this.onChanged();
      } else {
         this.leftPedalPowerSamplesBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearLeftPowerCalibration() {
      if (this.leftPowerCalibrationBuilder_ == null) {
         this.leftPowerCalibration_ = Collections.emptyList();
         this.bitField0_ &= -33554433;
         this.onChanged();
      } else {
         this.leftPowerCalibrationBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearMovingTypeOffline() {
      if (this.movingTypeOfflineBuilder_ == null) {
         this.movingTypeOffline_ = Collections.emptyList();
         this.bitField0_ &= -1048577;
         this.onChanged();
      } else {
         this.movingTypeOfflineBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearMovingTypeSamples() {
      this.movingTypeSamples_ = Collections.emptyList();
      this.bitField0_ &= -524289;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseSamples$PbExerciseSamples$Builder)super.clearOneof(var1);
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearPauseTimes() {
      if (this.pauseTimesBuilder_ == null) {
         this.pauseTimes_ = Collections.emptyList();
         this.bitField0_ &= -536870913;
         this.onChanged();
      } else {
         this.pauseTimesBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearRecordingInterval() {
      if (this.recordingIntervalBuilder_ == null) {
         this.recordingInterval_ = null;
         this.onChanged();
      } else {
         this.recordingIntervalBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearRightPedalPowerOffline() {
      if (this.rightPedalPowerOfflineBuilder_ == null) {
         this.rightPedalPowerOffline_ = Collections.emptyList();
         this.bitField0_ &= -16777217;
         this.onChanged();
      } else {
         this.rightPedalPowerOfflineBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearRightPedalPowerSamples() {
      if (this.rightPedalPowerSamplesBuilder_ == null) {
         this.rightPedalPowerSamples_ = Collections.emptyList();
         this.bitField0_ &= -8388609;
         this.onChanged();
      } else {
         this.rightPedalPowerSamplesBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearRightPowerCalibration() {
      if (this.rightPowerCalibrationBuilder_ == null) {
         this.rightPowerCalibration_ = Collections.emptyList();
         this.bitField0_ &= -67108865;
         this.onChanged();
      } else {
         this.rightPowerCalibrationBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearRrSamples() {
      if (this.rrSamplesBuilder_ == null) {
         this.rrSamples_ = null;
         this.onChanged();
      } else {
         this.rrSamplesBuilder_.clear();
      }

      this.bitField0_ &= -134217729;
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearSpeedOffline() {
      if (this.speedOfflineBuilder_ == null) {
         this.speedOffline_ = Collections.emptyList();
         this.bitField0_ &= -2049;
         this.onChanged();
      } else {
         this.speedOfflineBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearSpeedSamples() {
      this.speedSamples_ = Collections.emptyList();
      this.bitField0_ &= -1025;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearStrideCalibration() {
      if (this.strideCalibrationBuilder_ == null) {
         this.strideCalibration_ = Collections.emptyList();
         this.bitField0_ &= -65537;
         this.onChanged();
      } else {
         this.strideCalibrationBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearStrideLengthOffline() {
      if (this.strideLengthOfflineBuilder_ == null) {
         this.strideLengthOffline_ = Collections.emptyList();
         this.bitField0_ &= -32769;
         this.onChanged();
      } else {
         this.strideLengthOfflineBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearStrideLengthSamples() {
      this.strideLengthSamples_ = Collections.emptyList();
      this.bitField0_ &= -16385;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearTemperatureOffline() {
      if (this.temperatureOfflineBuilder_ == null) {
         this.temperatureOffline_ = Collections.emptyList();
         this.bitField0_ &= -513;
         this.onChanged();
      } else {
         this.temperatureOfflineBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clearTemperatureSamples() {
      this.temperatureSamples_ = Collections.emptyList();
      this.bitField0_ &= -257;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder clone() {
      return (ExerciseSamples$PbExerciseSamples$Builder)super.clone();
   }

   public ExerciseSamples$PbCalibrationValue getAltitudeCalibration(int var1) {
      ExerciseSamples$PbCalibrationValue var2;
      if (this.altitudeCalibrationBuilder_ == null) {
         var2 = (ExerciseSamples$PbCalibrationValue)this.altitudeCalibration_.get(var1);
      } else {
         var2 = (ExerciseSamples$PbCalibrationValue)this.altitudeCalibrationBuilder_.getMessage(var1);
      }

      return var2;
   }

   public ExerciseSamples$PbCalibrationValue$Builder getAltitudeCalibrationBuilder(int var1) {
      return (ExerciseSamples$PbCalibrationValue$Builder)this.getAltitudeCalibrationFieldBuilder().getBuilder(var1);
   }

   public List getAltitudeCalibrationBuilderList() {
      return this.getAltitudeCalibrationFieldBuilder().getBuilderList();
   }

   public int getAltitudeCalibrationCount() {
      int var1;
      if (this.altitudeCalibrationBuilder_ == null) {
         var1 = this.altitudeCalibration_.size();
      } else {
         var1 = this.altitudeCalibrationBuilder_.getCount();
      }

      return var1;
   }

   public List getAltitudeCalibrationList() {
      List var1;
      if (this.altitudeCalibrationBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.altitudeCalibration_);
      } else {
         var1 = this.altitudeCalibrationBuilder_.getMessageList();
      }

      return var1;
   }

   public ExerciseSamples$PbCalibrationValueOrBuilder getAltitudeCalibrationOrBuilder(int var1) {
      ExerciseSamples$PbCalibrationValueOrBuilder var2;
      if (this.altitudeCalibrationBuilder_ == null) {
         var2 = (ExerciseSamples$PbCalibrationValueOrBuilder)this.altitudeCalibration_.get(var1);
      } else {
         var2 = (ExerciseSamples$PbCalibrationValueOrBuilder)this.altitudeCalibrationBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getAltitudeCalibrationOrBuilderList() {
      List var1;
      if (this.altitudeCalibrationBuilder_ != null) {
         var1 = this.altitudeCalibrationBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.altitudeCalibration_);
      }

      return var1;
   }

   public Types$PbSensorOffline getAltitudeOffline(int var1) {
      Types$PbSensorOffline var2;
      if (this.altitudeOfflineBuilder_ == null) {
         var2 = (Types$PbSensorOffline)this.altitudeOffline_.get(var1);
      } else {
         var2 = (Types$PbSensorOffline)this.altitudeOfflineBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Types$PbSensorOffline$Builder getAltitudeOfflineBuilder(int var1) {
      return (Types$PbSensorOffline$Builder)this.getAltitudeOfflineFieldBuilder().getBuilder(var1);
   }

   public List getAltitudeOfflineBuilderList() {
      return this.getAltitudeOfflineFieldBuilder().getBuilderList();
   }

   public int getAltitudeOfflineCount() {
      int var1;
      if (this.altitudeOfflineBuilder_ == null) {
         var1 = this.altitudeOffline_.size();
      } else {
         var1 = this.altitudeOfflineBuilder_.getCount();
      }

      return var1;
   }

   public List getAltitudeOfflineList() {
      List var1;
      if (this.altitudeOfflineBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.altitudeOffline_);
      } else {
         var1 = this.altitudeOfflineBuilder_.getMessageList();
      }

      return var1;
   }

   public Types$PbSensorOfflineOrBuilder getAltitudeOfflineOrBuilder(int var1) {
      Types$PbSensorOfflineOrBuilder var2;
      if (this.altitudeOfflineBuilder_ == null) {
         var2 = (Types$PbSensorOfflineOrBuilder)this.altitudeOffline_.get(var1);
      } else {
         var2 = (Types$PbSensorOfflineOrBuilder)this.altitudeOfflineBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getAltitudeOfflineOrBuilderList() {
      List var1;
      if (this.altitudeOfflineBuilder_ != null) {
         var1 = this.altitudeOfflineBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.altitudeOffline_);
      }

      return var1;
   }

   public float getAltitudeSamples(int var1) {
      return (Float)this.altitudeSamples_.get(var1);
   }

   public int getAltitudeSamplesCount() {
      return this.altitudeSamples_.size();
   }

   public List getAltitudeSamplesList() {
      return Collections.unmodifiableList(this.altitudeSamples_);
   }

   public Types$PbSensorOffline getCadenceOffline(int var1) {
      Types$PbSensorOffline var2;
      if (this.cadenceOfflineBuilder_ == null) {
         var2 = (Types$PbSensorOffline)this.cadenceOffline_.get(var1);
      } else {
         var2 = (Types$PbSensorOffline)this.cadenceOfflineBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Types$PbSensorOffline$Builder getCadenceOfflineBuilder(int var1) {
      return (Types$PbSensorOffline$Builder)this.getCadenceOfflineFieldBuilder().getBuilder(var1);
   }

   public List getCadenceOfflineBuilderList() {
      return this.getCadenceOfflineFieldBuilder().getBuilderList();
   }

   public int getCadenceOfflineCount() {
      int var1;
      if (this.cadenceOfflineBuilder_ == null) {
         var1 = this.cadenceOffline_.size();
      } else {
         var1 = this.cadenceOfflineBuilder_.getCount();
      }

      return var1;
   }

   public List getCadenceOfflineList() {
      List var1;
      if (this.cadenceOfflineBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.cadenceOffline_);
      } else {
         var1 = this.cadenceOfflineBuilder_.getMessageList();
      }

      return var1;
   }

   public Types$PbSensorOfflineOrBuilder getCadenceOfflineOrBuilder(int var1) {
      Types$PbSensorOfflineOrBuilder var2;
      if (this.cadenceOfflineBuilder_ == null) {
         var2 = (Types$PbSensorOfflineOrBuilder)this.cadenceOffline_.get(var1);
      } else {
         var2 = (Types$PbSensorOfflineOrBuilder)this.cadenceOfflineBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getCadenceOfflineOrBuilderList() {
      List var1;
      if (this.cadenceOfflineBuilder_ != null) {
         var1 = this.cadenceOfflineBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.cadenceOffline_);
      }

      return var1;
   }

   public int getCadenceSamples(int var1) {
      return (Integer)this.cadenceSamples_.get(var1);
   }

   public int getCadenceSamplesCount() {
      return this.cadenceSamples_.size();
   }

   public List getCadenceSamplesList() {
      return Collections.unmodifiableList(this.cadenceSamples_);
   }

   public ExerciseSamples$PbExerciseSamples getDefaultInstanceForType() {
      return ExerciseSamples$PbExerciseSamples.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseSamples.g();
   }

   public Types$PbSensorOffline getDistanceOffline(int var1) {
      Types$PbSensorOffline var2;
      if (this.distanceOfflineBuilder_ == null) {
         var2 = (Types$PbSensorOffline)this.distanceOffline_.get(var1);
      } else {
         var2 = (Types$PbSensorOffline)this.distanceOfflineBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Types$PbSensorOffline$Builder getDistanceOfflineBuilder(int var1) {
      return (Types$PbSensorOffline$Builder)this.getDistanceOfflineFieldBuilder().getBuilder(var1);
   }

   public List getDistanceOfflineBuilderList() {
      return this.getDistanceOfflineFieldBuilder().getBuilderList();
   }

   public int getDistanceOfflineCount() {
      int var1;
      if (this.distanceOfflineBuilder_ == null) {
         var1 = this.distanceOffline_.size();
      } else {
         var1 = this.distanceOfflineBuilder_.getCount();
      }

      return var1;
   }

   public List getDistanceOfflineList() {
      List var1;
      if (this.distanceOfflineBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.distanceOffline_);
      } else {
         var1 = this.distanceOfflineBuilder_.getMessageList();
      }

      return var1;
   }

   public Types$PbSensorOfflineOrBuilder getDistanceOfflineOrBuilder(int var1) {
      Types$PbSensorOfflineOrBuilder var2;
      if (this.distanceOfflineBuilder_ == null) {
         var2 = (Types$PbSensorOfflineOrBuilder)this.distanceOffline_.get(var1);
      } else {
         var2 = (Types$PbSensorOfflineOrBuilder)this.distanceOfflineBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getDistanceOfflineOrBuilderList() {
      List var1;
      if (this.distanceOfflineBuilder_ != null) {
         var1 = this.distanceOfflineBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.distanceOffline_);
      }

      return var1;
   }

   public float getDistanceSamples(int var1) {
      return (Float)this.distanceSamples_.get(var1);
   }

   public int getDistanceSamplesCount() {
      return this.distanceSamples_.size();
   }

   public List getDistanceSamplesList() {
      return Collections.unmodifiableList(this.distanceSamples_);
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList getExerciseIntervalledSampleList(int var1) {
      ExerciseSamples$PbExerciseIntervalledSampleList var2;
      if (this.exerciseIntervalledSampleListBuilder_ == null) {
         var2 = (ExerciseSamples$PbExerciseIntervalledSampleList)this.exerciseIntervalledSampleList_.get(var1);
      } else {
         var2 = (ExerciseSamples$PbExerciseIntervalledSampleList)this.exerciseIntervalledSampleListBuilder_.getMessage(var1);
      }

      return var2;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder getExerciseIntervalledSampleListBuilder(int var1) {
      return (ExerciseSamples$PbExerciseIntervalledSampleList$Builder)this.getExerciseIntervalledSampleListFieldBuilder().getBuilder(var1);
   }

   public List getExerciseIntervalledSampleListBuilderList() {
      return this.getExerciseIntervalledSampleListFieldBuilder().getBuilderList();
   }

   public int getExerciseIntervalledSampleListCount() {
      int var1;
      if (this.exerciseIntervalledSampleListBuilder_ == null) {
         var1 = this.exerciseIntervalledSampleList_.size();
      } else {
         var1 = this.exerciseIntervalledSampleListBuilder_.getCount();
      }

      return var1;
   }

   public List getExerciseIntervalledSampleListList() {
      List var1;
      if (this.exerciseIntervalledSampleListBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.exerciseIntervalledSampleList_);
      } else {
         var1 = this.exerciseIntervalledSampleListBuilder_.getMessageList();
      }

      return var1;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleListOrBuilder getExerciseIntervalledSampleListOrBuilder(int var1) {
      ExerciseSamples$PbExerciseIntervalledSampleListOrBuilder var2;
      if (this.exerciseIntervalledSampleListBuilder_ == null) {
         var2 = (ExerciseSamples$PbExerciseIntervalledSampleListOrBuilder)this.exerciseIntervalledSampleList_.get(var1);
      } else {
         var2 = (ExerciseSamples$PbExerciseIntervalledSampleListOrBuilder)this.exerciseIntervalledSampleListBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getExerciseIntervalledSampleListOrBuilderList() {
      List var1;
      if (this.exerciseIntervalledSampleListBuilder_ != null) {
         var1 = this.exerciseIntervalledSampleListBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.exerciseIntervalledSampleList_);
      }

      return var1;
   }

   public float getForwardAcceleration(int var1) {
      return (Float)this.forwardAcceleration_.get(var1);
   }

   public int getForwardAccelerationCount() {
      return this.forwardAcceleration_.size();
   }

   public List getForwardAccelerationList() {
      return Collections.unmodifiableList(this.forwardAcceleration_);
   }

   public Types$PbSensorOffline getForwardAccelerationOffline(int var1) {
      Types$PbSensorOffline var2;
      if (this.forwardAccelerationOfflineBuilder_ == null) {
         var2 = (Types$PbSensorOffline)this.forwardAccelerationOffline_.get(var1);
      } else {
         var2 = (Types$PbSensorOffline)this.forwardAccelerationOfflineBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Types$PbSensorOffline$Builder getForwardAccelerationOfflineBuilder(int var1) {
      return (Types$PbSensorOffline$Builder)this.getForwardAccelerationOfflineFieldBuilder().getBuilder(var1);
   }

   public List getForwardAccelerationOfflineBuilderList() {
      return this.getForwardAccelerationOfflineFieldBuilder().getBuilderList();
   }

   public int getForwardAccelerationOfflineCount() {
      int var1;
      if (this.forwardAccelerationOfflineBuilder_ == null) {
         var1 = this.forwardAccelerationOffline_.size();
      } else {
         var1 = this.forwardAccelerationOfflineBuilder_.getCount();
      }

      return var1;
   }

   public List getForwardAccelerationOfflineList() {
      List var1;
      if (this.forwardAccelerationOfflineBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.forwardAccelerationOffline_);
      } else {
         var1 = this.forwardAccelerationOfflineBuilder_.getMessageList();
      }

      return var1;
   }

   public Types$PbSensorOfflineOrBuilder getForwardAccelerationOfflineOrBuilder(int var1) {
      Types$PbSensorOfflineOrBuilder var2;
      if (this.forwardAccelerationOfflineBuilder_ == null) {
         var2 = (Types$PbSensorOfflineOrBuilder)this.forwardAccelerationOffline_.get(var1);
      } else {
         var2 = (Types$PbSensorOfflineOrBuilder)this.forwardAccelerationOfflineBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getForwardAccelerationOfflineOrBuilderList() {
      List var1;
      if (this.forwardAccelerationOfflineBuilder_ != null) {
         var1 = this.forwardAccelerationOfflineBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.forwardAccelerationOffline_);
      }

      return var1;
   }

   public Types$PbSensorOffline getHeartRateOffline(int var1) {
      Types$PbSensorOffline var2;
      if (this.heartRateOfflineBuilder_ == null) {
         var2 = (Types$PbSensorOffline)this.heartRateOffline_.get(var1);
      } else {
         var2 = (Types$PbSensorOffline)this.heartRateOfflineBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Types$PbSensorOffline$Builder getHeartRateOfflineBuilder(int var1) {
      return (Types$PbSensorOffline$Builder)this.getHeartRateOfflineFieldBuilder().getBuilder(var1);
   }

   public List getHeartRateOfflineBuilderList() {
      return this.getHeartRateOfflineFieldBuilder().getBuilderList();
   }

   public int getHeartRateOfflineCount() {
      int var1;
      if (this.heartRateOfflineBuilder_ == null) {
         var1 = this.heartRateOffline_.size();
      } else {
         var1 = this.heartRateOfflineBuilder_.getCount();
      }

      return var1;
   }

   public List getHeartRateOfflineList() {
      List var1;
      if (this.heartRateOfflineBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.heartRateOffline_);
      } else {
         var1 = this.heartRateOfflineBuilder_.getMessageList();
      }

      return var1;
   }

   public Types$PbSensorOfflineOrBuilder getHeartRateOfflineOrBuilder(int var1) {
      Types$PbSensorOfflineOrBuilder var2;
      if (this.heartRateOfflineBuilder_ == null) {
         var2 = (Types$PbSensorOfflineOrBuilder)this.heartRateOffline_.get(var1);
      } else {
         var2 = (Types$PbSensorOfflineOrBuilder)this.heartRateOfflineBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getHeartRateOfflineOrBuilderList() {
      List var1;
      if (this.heartRateOfflineBuilder_ != null) {
         var1 = this.heartRateOfflineBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.heartRateOffline_);
      }

      return var1;
   }

   public int getHeartRateSamples(int var1) {
      return (Integer)this.heartRateSamples_.get(var1);
   }

   public int getHeartRateSamplesCount() {
      return this.heartRateSamples_.size();
   }

   public List getHeartRateSamplesList() {
      return Collections.unmodifiableList(this.heartRateSamples_);
   }

   public Types$PbSensorOffline getLeftPedalPowerOffline(int var1) {
      Types$PbSensorOffline var2;
      if (this.leftPedalPowerOfflineBuilder_ == null) {
         var2 = (Types$PbSensorOffline)this.leftPedalPowerOffline_.get(var1);
      } else {
         var2 = (Types$PbSensorOffline)this.leftPedalPowerOfflineBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Types$PbSensorOffline$Builder getLeftPedalPowerOfflineBuilder(int var1) {
      return (Types$PbSensorOffline$Builder)this.getLeftPedalPowerOfflineFieldBuilder().getBuilder(var1);
   }

   public List getLeftPedalPowerOfflineBuilderList() {
      return this.getLeftPedalPowerOfflineFieldBuilder().getBuilderList();
   }

   public int getLeftPedalPowerOfflineCount() {
      int var1;
      if (this.leftPedalPowerOfflineBuilder_ == null) {
         var1 = this.leftPedalPowerOffline_.size();
      } else {
         var1 = this.leftPedalPowerOfflineBuilder_.getCount();
      }

      return var1;
   }

   public List getLeftPedalPowerOfflineList() {
      List var1;
      if (this.leftPedalPowerOfflineBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.leftPedalPowerOffline_);
      } else {
         var1 = this.leftPedalPowerOfflineBuilder_.getMessageList();
      }

      return var1;
   }

   public Types$PbSensorOfflineOrBuilder getLeftPedalPowerOfflineOrBuilder(int var1) {
      Types$PbSensorOfflineOrBuilder var2;
      if (this.leftPedalPowerOfflineBuilder_ == null) {
         var2 = (Types$PbSensorOfflineOrBuilder)this.leftPedalPowerOffline_.get(var1);
      } else {
         var2 = (Types$PbSensorOfflineOrBuilder)this.leftPedalPowerOfflineBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getLeftPedalPowerOfflineOrBuilderList() {
      List var1;
      if (this.leftPedalPowerOfflineBuilder_ != null) {
         var1 = this.leftPedalPowerOfflineBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.leftPedalPowerOffline_);
      }

      return var1;
   }

   public ExerciseSamples$PbPowerMeasurements getLeftPedalPowerSamples(int var1) {
      ExerciseSamples$PbPowerMeasurements var2;
      if (this.leftPedalPowerSamplesBuilder_ == null) {
         var2 = (ExerciseSamples$PbPowerMeasurements)this.leftPedalPowerSamples_.get(var1);
      } else {
         var2 = (ExerciseSamples$PbPowerMeasurements)this.leftPedalPowerSamplesBuilder_.getMessage(var1);
      }

      return var2;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder getLeftPedalPowerSamplesBuilder(int var1) {
      return (ExerciseSamples$PbPowerMeasurements$Builder)this.getLeftPedalPowerSamplesFieldBuilder().getBuilder(var1);
   }

   public List getLeftPedalPowerSamplesBuilderList() {
      return this.getLeftPedalPowerSamplesFieldBuilder().getBuilderList();
   }

   public int getLeftPedalPowerSamplesCount() {
      int var1;
      if (this.leftPedalPowerSamplesBuilder_ == null) {
         var1 = this.leftPedalPowerSamples_.size();
      } else {
         var1 = this.leftPedalPowerSamplesBuilder_.getCount();
      }

      return var1;
   }

   public List getLeftPedalPowerSamplesList() {
      List var1;
      if (this.leftPedalPowerSamplesBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.leftPedalPowerSamples_);
      } else {
         var1 = this.leftPedalPowerSamplesBuilder_.getMessageList();
      }

      return var1;
   }

   public ExerciseSamples$PbPowerMeasurementsOrBuilder getLeftPedalPowerSamplesOrBuilder(int var1) {
      ExerciseSamples$PbPowerMeasurementsOrBuilder var2;
      if (this.leftPedalPowerSamplesBuilder_ == null) {
         var2 = (ExerciseSamples$PbPowerMeasurementsOrBuilder)this.leftPedalPowerSamples_.get(var1);
      } else {
         var2 = (ExerciseSamples$PbPowerMeasurementsOrBuilder)this.leftPedalPowerSamplesBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getLeftPedalPowerSamplesOrBuilderList() {
      List var1;
      if (this.leftPedalPowerSamplesBuilder_ != null) {
         var1 = this.leftPedalPowerSamplesBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.leftPedalPowerSamples_);
      }

      return var1;
   }

   public ExerciseSamples$PbCalibrationValue getLeftPowerCalibration(int var1) {
      ExerciseSamples$PbCalibrationValue var2;
      if (this.leftPowerCalibrationBuilder_ == null) {
         var2 = (ExerciseSamples$PbCalibrationValue)this.leftPowerCalibration_.get(var1);
      } else {
         var2 = (ExerciseSamples$PbCalibrationValue)this.leftPowerCalibrationBuilder_.getMessage(var1);
      }

      return var2;
   }

   public ExerciseSamples$PbCalibrationValue$Builder getLeftPowerCalibrationBuilder(int var1) {
      return (ExerciseSamples$PbCalibrationValue$Builder)this.getLeftPowerCalibrationFieldBuilder().getBuilder(var1);
   }

   public List getLeftPowerCalibrationBuilderList() {
      return this.getLeftPowerCalibrationFieldBuilder().getBuilderList();
   }

   public int getLeftPowerCalibrationCount() {
      int var1;
      if (this.leftPowerCalibrationBuilder_ == null) {
         var1 = this.leftPowerCalibration_.size();
      } else {
         var1 = this.leftPowerCalibrationBuilder_.getCount();
      }

      return var1;
   }

   public List getLeftPowerCalibrationList() {
      List var1;
      if (this.leftPowerCalibrationBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.leftPowerCalibration_);
      } else {
         var1 = this.leftPowerCalibrationBuilder_.getMessageList();
      }

      return var1;
   }

   public ExerciseSamples$PbCalibrationValueOrBuilder getLeftPowerCalibrationOrBuilder(int var1) {
      ExerciseSamples$PbCalibrationValueOrBuilder var2;
      if (this.leftPowerCalibrationBuilder_ == null) {
         var2 = (ExerciseSamples$PbCalibrationValueOrBuilder)this.leftPowerCalibration_.get(var1);
      } else {
         var2 = (ExerciseSamples$PbCalibrationValueOrBuilder)this.leftPowerCalibrationBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getLeftPowerCalibrationOrBuilderList() {
      List var1;
      if (this.leftPowerCalibrationBuilder_ != null) {
         var1 = this.leftPowerCalibrationBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.leftPowerCalibration_);
      }

      return var1;
   }

   public Types$PbSensorOffline getMovingTypeOffline(int var1) {
      Types$PbSensorOffline var2;
      if (this.movingTypeOfflineBuilder_ == null) {
         var2 = (Types$PbSensorOffline)this.movingTypeOffline_.get(var1);
      } else {
         var2 = (Types$PbSensorOffline)this.movingTypeOfflineBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Types$PbSensorOffline$Builder getMovingTypeOfflineBuilder(int var1) {
      return (Types$PbSensorOffline$Builder)this.getMovingTypeOfflineFieldBuilder().getBuilder(var1);
   }

   public List getMovingTypeOfflineBuilderList() {
      return this.getMovingTypeOfflineFieldBuilder().getBuilderList();
   }

   public int getMovingTypeOfflineCount() {
      int var1;
      if (this.movingTypeOfflineBuilder_ == null) {
         var1 = this.movingTypeOffline_.size();
      } else {
         var1 = this.movingTypeOfflineBuilder_.getCount();
      }

      return var1;
   }

   public List getMovingTypeOfflineList() {
      List var1;
      if (this.movingTypeOfflineBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.movingTypeOffline_);
      } else {
         var1 = this.movingTypeOfflineBuilder_.getMessageList();
      }

      return var1;
   }

   public Types$PbSensorOfflineOrBuilder getMovingTypeOfflineOrBuilder(int var1) {
      Types$PbSensorOfflineOrBuilder var2;
      if (this.movingTypeOfflineBuilder_ == null) {
         var2 = (Types$PbSensorOfflineOrBuilder)this.movingTypeOffline_.get(var1);
      } else {
         var2 = (Types$PbSensorOfflineOrBuilder)this.movingTypeOfflineBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getMovingTypeOfflineOrBuilderList() {
      List var1;
      if (this.movingTypeOfflineBuilder_ != null) {
         var1 = this.movingTypeOfflineBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.movingTypeOffline_);
      }

      return var1;
   }

   public Types$PbMovingType getMovingTypeSamples(int var1) {
      return (Types$PbMovingType)ExerciseSamples$PbExerciseSamples.v().convert(this.movingTypeSamples_.get(var1));
   }

   public int getMovingTypeSamplesCount() {
      return this.movingTypeSamples_.size();
   }

   public List getMovingTypeSamplesList() {
      return new ListAdapter(this.movingTypeSamples_, ExerciseSamples$PbExerciseSamples.v());
   }

   public Structures$PbPauseTime getPauseTimes(int var1) {
      Structures$PbPauseTime var2;
      if (this.pauseTimesBuilder_ == null) {
         var2 = (Structures$PbPauseTime)this.pauseTimes_.get(var1);
      } else {
         var2 = (Structures$PbPauseTime)this.pauseTimesBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Structures$PbPauseTime$Builder getPauseTimesBuilder(int var1) {
      return (Structures$PbPauseTime$Builder)this.getPauseTimesFieldBuilder().getBuilder(var1);
   }

   public List getPauseTimesBuilderList() {
      return this.getPauseTimesFieldBuilder().getBuilderList();
   }

   public int getPauseTimesCount() {
      int var1;
      if (this.pauseTimesBuilder_ == null) {
         var1 = this.pauseTimes_.size();
      } else {
         var1 = this.pauseTimesBuilder_.getCount();
      }

      return var1;
   }

   public List getPauseTimesList() {
      List var1;
      if (this.pauseTimesBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.pauseTimes_);
      } else {
         var1 = this.pauseTimesBuilder_.getMessageList();
      }

      return var1;
   }

   public Structures$PbPauseTimeOrBuilder getPauseTimesOrBuilder(int var1) {
      Structures$PbPauseTimeOrBuilder var2;
      if (this.pauseTimesBuilder_ == null) {
         var2 = (Structures$PbPauseTimeOrBuilder)this.pauseTimes_.get(var1);
      } else {
         var2 = (Structures$PbPauseTimeOrBuilder)this.pauseTimesBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getPauseTimesOrBuilderList() {
      List var1;
      if (this.pauseTimesBuilder_ != null) {
         var1 = this.pauseTimesBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.pauseTimes_);
      }

      return var1;
   }

   public Types$PbDuration getRecordingInterval() {
      Types$PbDuration var1;
      if (this.recordingIntervalBuilder_ == null) {
         if (this.recordingInterval_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.recordingInterval_;
         }
      } else {
         var1 = (Types$PbDuration)this.recordingIntervalBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getRecordingIntervalBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getRecordingIntervalFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getRecordingIntervalOrBuilder() {
      Object var1;
      if (this.recordingIntervalBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.recordingIntervalBuilder_.getMessageOrBuilder();
      } else if (this.recordingInterval_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.recordingInterval_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public Types$PbSensorOffline getRightPedalPowerOffline(int var1) {
      Types$PbSensorOffline var2;
      if (this.rightPedalPowerOfflineBuilder_ == null) {
         var2 = (Types$PbSensorOffline)this.rightPedalPowerOffline_.get(var1);
      } else {
         var2 = (Types$PbSensorOffline)this.rightPedalPowerOfflineBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Types$PbSensorOffline$Builder getRightPedalPowerOfflineBuilder(int var1) {
      return (Types$PbSensorOffline$Builder)this.getRightPedalPowerOfflineFieldBuilder().getBuilder(var1);
   }

   public List getRightPedalPowerOfflineBuilderList() {
      return this.getRightPedalPowerOfflineFieldBuilder().getBuilderList();
   }

   public int getRightPedalPowerOfflineCount() {
      int var1;
      if (this.rightPedalPowerOfflineBuilder_ == null) {
         var1 = this.rightPedalPowerOffline_.size();
      } else {
         var1 = this.rightPedalPowerOfflineBuilder_.getCount();
      }

      return var1;
   }

   public List getRightPedalPowerOfflineList() {
      List var1;
      if (this.rightPedalPowerOfflineBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.rightPedalPowerOffline_);
      } else {
         var1 = this.rightPedalPowerOfflineBuilder_.getMessageList();
      }

      return var1;
   }

   public Types$PbSensorOfflineOrBuilder getRightPedalPowerOfflineOrBuilder(int var1) {
      Types$PbSensorOfflineOrBuilder var2;
      if (this.rightPedalPowerOfflineBuilder_ == null) {
         var2 = (Types$PbSensorOfflineOrBuilder)this.rightPedalPowerOffline_.get(var1);
      } else {
         var2 = (Types$PbSensorOfflineOrBuilder)this.rightPedalPowerOfflineBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getRightPedalPowerOfflineOrBuilderList() {
      List var1;
      if (this.rightPedalPowerOfflineBuilder_ != null) {
         var1 = this.rightPedalPowerOfflineBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.rightPedalPowerOffline_);
      }

      return var1;
   }

   public ExerciseSamples$PbPowerMeasurements getRightPedalPowerSamples(int var1) {
      ExerciseSamples$PbPowerMeasurements var2;
      if (this.rightPedalPowerSamplesBuilder_ == null) {
         var2 = (ExerciseSamples$PbPowerMeasurements)this.rightPedalPowerSamples_.get(var1);
      } else {
         var2 = (ExerciseSamples$PbPowerMeasurements)this.rightPedalPowerSamplesBuilder_.getMessage(var1);
      }

      return var2;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder getRightPedalPowerSamplesBuilder(int var1) {
      return (ExerciseSamples$PbPowerMeasurements$Builder)this.getRightPedalPowerSamplesFieldBuilder().getBuilder(var1);
   }

   public List getRightPedalPowerSamplesBuilderList() {
      return this.getRightPedalPowerSamplesFieldBuilder().getBuilderList();
   }

   public int getRightPedalPowerSamplesCount() {
      int var1;
      if (this.rightPedalPowerSamplesBuilder_ == null) {
         var1 = this.rightPedalPowerSamples_.size();
      } else {
         var1 = this.rightPedalPowerSamplesBuilder_.getCount();
      }

      return var1;
   }

   public List getRightPedalPowerSamplesList() {
      List var1;
      if (this.rightPedalPowerSamplesBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.rightPedalPowerSamples_);
      } else {
         var1 = this.rightPedalPowerSamplesBuilder_.getMessageList();
      }

      return var1;
   }

   public ExerciseSamples$PbPowerMeasurementsOrBuilder getRightPedalPowerSamplesOrBuilder(int var1) {
      ExerciseSamples$PbPowerMeasurementsOrBuilder var2;
      if (this.rightPedalPowerSamplesBuilder_ == null) {
         var2 = (ExerciseSamples$PbPowerMeasurementsOrBuilder)this.rightPedalPowerSamples_.get(var1);
      } else {
         var2 = (ExerciseSamples$PbPowerMeasurementsOrBuilder)this.rightPedalPowerSamplesBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getRightPedalPowerSamplesOrBuilderList() {
      List var1;
      if (this.rightPedalPowerSamplesBuilder_ != null) {
         var1 = this.rightPedalPowerSamplesBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.rightPedalPowerSamples_);
      }

      return var1;
   }

   public ExerciseSamples$PbCalibrationValue getRightPowerCalibration(int var1) {
      ExerciseSamples$PbCalibrationValue var2;
      if (this.rightPowerCalibrationBuilder_ == null) {
         var2 = (ExerciseSamples$PbCalibrationValue)this.rightPowerCalibration_.get(var1);
      } else {
         var2 = (ExerciseSamples$PbCalibrationValue)this.rightPowerCalibrationBuilder_.getMessage(var1);
      }

      return var2;
   }

   public ExerciseSamples$PbCalibrationValue$Builder getRightPowerCalibrationBuilder(int var1) {
      return (ExerciseSamples$PbCalibrationValue$Builder)this.getRightPowerCalibrationFieldBuilder().getBuilder(var1);
   }

   public List getRightPowerCalibrationBuilderList() {
      return this.getRightPowerCalibrationFieldBuilder().getBuilderList();
   }

   public int getRightPowerCalibrationCount() {
      int var1;
      if (this.rightPowerCalibrationBuilder_ == null) {
         var1 = this.rightPowerCalibration_.size();
      } else {
         var1 = this.rightPowerCalibrationBuilder_.getCount();
      }

      return var1;
   }

   public List getRightPowerCalibrationList() {
      List var1;
      if (this.rightPowerCalibrationBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.rightPowerCalibration_);
      } else {
         var1 = this.rightPowerCalibrationBuilder_.getMessageList();
      }

      return var1;
   }

   public ExerciseSamples$PbCalibrationValueOrBuilder getRightPowerCalibrationOrBuilder(int var1) {
      ExerciseSamples$PbCalibrationValueOrBuilder var2;
      if (this.rightPowerCalibrationBuilder_ == null) {
         var2 = (ExerciseSamples$PbCalibrationValueOrBuilder)this.rightPowerCalibration_.get(var1);
      } else {
         var2 = (ExerciseSamples$PbCalibrationValueOrBuilder)this.rightPowerCalibrationBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getRightPowerCalibrationOrBuilderList() {
      List var1;
      if (this.rightPowerCalibrationBuilder_ != null) {
         var1 = this.rightPowerCalibrationBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.rightPowerCalibration_);
      }

      return var1;
   }

   public ExerciseRRSamples$PbExerciseRRIntervals getRrSamples() {
      ExerciseRRSamples$PbExerciseRRIntervals var1;
      if (this.rrSamplesBuilder_ == null) {
         if (this.rrSamples_ == null) {
            var1 = ExerciseRRSamples$PbExerciseRRIntervals.getDefaultInstance();
         } else {
            var1 = this.rrSamples_;
         }
      } else {
         var1 = (ExerciseRRSamples$PbExerciseRRIntervals)this.rrSamplesBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseRRSamples$PbExerciseRRIntervals$Builder getRrSamplesBuilder() {
      this.bitField0_ |= 134217728;
      this.onChanged();
      return (ExerciseRRSamples$PbExerciseRRIntervals$Builder)this.getRrSamplesFieldBuilder().getBuilder();
   }

   public ExerciseRRSamples$PbExerciseRRIntervalsOrBuilder getRrSamplesOrBuilder() {
      Object var1;
      if (this.rrSamplesBuilder_ != null) {
         var1 = (ExerciseRRSamples$PbExerciseRRIntervalsOrBuilder)this.rrSamplesBuilder_.getMessageOrBuilder();
      } else if (this.rrSamples_ == null) {
         var1 = ExerciseRRSamples$PbExerciseRRIntervals.getDefaultInstance();
      } else {
         var1 = this.rrSamples_;
      }

      return (ExerciseRRSamples$PbExerciseRRIntervalsOrBuilder)var1;
   }

   public Types$PbSensorOffline getSpeedOffline(int var1) {
      Types$PbSensorOffline var2;
      if (this.speedOfflineBuilder_ == null) {
         var2 = (Types$PbSensorOffline)this.speedOffline_.get(var1);
      } else {
         var2 = (Types$PbSensorOffline)this.speedOfflineBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Types$PbSensorOffline$Builder getSpeedOfflineBuilder(int var1) {
      return (Types$PbSensorOffline$Builder)this.getSpeedOfflineFieldBuilder().getBuilder(var1);
   }

   public List getSpeedOfflineBuilderList() {
      return this.getSpeedOfflineFieldBuilder().getBuilderList();
   }

   public int getSpeedOfflineCount() {
      int var1;
      if (this.speedOfflineBuilder_ == null) {
         var1 = this.speedOffline_.size();
      } else {
         var1 = this.speedOfflineBuilder_.getCount();
      }

      return var1;
   }

   public List getSpeedOfflineList() {
      List var1;
      if (this.speedOfflineBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.speedOffline_);
      } else {
         var1 = this.speedOfflineBuilder_.getMessageList();
      }

      return var1;
   }

   public Types$PbSensorOfflineOrBuilder getSpeedOfflineOrBuilder(int var1) {
      Types$PbSensorOfflineOrBuilder var2;
      if (this.speedOfflineBuilder_ == null) {
         var2 = (Types$PbSensorOfflineOrBuilder)this.speedOffline_.get(var1);
      } else {
         var2 = (Types$PbSensorOfflineOrBuilder)this.speedOfflineBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getSpeedOfflineOrBuilderList() {
      List var1;
      if (this.speedOfflineBuilder_ != null) {
         var1 = this.speedOfflineBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.speedOffline_);
      }

      return var1;
   }

   public float getSpeedSamples(int var1) {
      return (Float)this.speedSamples_.get(var1);
   }

   public int getSpeedSamplesCount() {
      return this.speedSamples_.size();
   }

   public List getSpeedSamplesList() {
      return Collections.unmodifiableList(this.speedSamples_);
   }

   public ExerciseSamples$PbCalibrationValue getStrideCalibration(int var1) {
      ExerciseSamples$PbCalibrationValue var2;
      if (this.strideCalibrationBuilder_ == null) {
         var2 = (ExerciseSamples$PbCalibrationValue)this.strideCalibration_.get(var1);
      } else {
         var2 = (ExerciseSamples$PbCalibrationValue)this.strideCalibrationBuilder_.getMessage(var1);
      }

      return var2;
   }

   public ExerciseSamples$PbCalibrationValue$Builder getStrideCalibrationBuilder(int var1) {
      return (ExerciseSamples$PbCalibrationValue$Builder)this.getStrideCalibrationFieldBuilder().getBuilder(var1);
   }

   public List getStrideCalibrationBuilderList() {
      return this.getStrideCalibrationFieldBuilder().getBuilderList();
   }

   public int getStrideCalibrationCount() {
      int var1;
      if (this.strideCalibrationBuilder_ == null) {
         var1 = this.strideCalibration_.size();
      } else {
         var1 = this.strideCalibrationBuilder_.getCount();
      }

      return var1;
   }

   public List getStrideCalibrationList() {
      List var1;
      if (this.strideCalibrationBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.strideCalibration_);
      } else {
         var1 = this.strideCalibrationBuilder_.getMessageList();
      }

      return var1;
   }

   public ExerciseSamples$PbCalibrationValueOrBuilder getStrideCalibrationOrBuilder(int var1) {
      ExerciseSamples$PbCalibrationValueOrBuilder var2;
      if (this.strideCalibrationBuilder_ == null) {
         var2 = (ExerciseSamples$PbCalibrationValueOrBuilder)this.strideCalibration_.get(var1);
      } else {
         var2 = (ExerciseSamples$PbCalibrationValueOrBuilder)this.strideCalibrationBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getStrideCalibrationOrBuilderList() {
      List var1;
      if (this.strideCalibrationBuilder_ != null) {
         var1 = this.strideCalibrationBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.strideCalibration_);
      }

      return var1;
   }

   public Types$PbSensorOffline getStrideLengthOffline(int var1) {
      Types$PbSensorOffline var2;
      if (this.strideLengthOfflineBuilder_ == null) {
         var2 = (Types$PbSensorOffline)this.strideLengthOffline_.get(var1);
      } else {
         var2 = (Types$PbSensorOffline)this.strideLengthOfflineBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Types$PbSensorOffline$Builder getStrideLengthOfflineBuilder(int var1) {
      return (Types$PbSensorOffline$Builder)this.getStrideLengthOfflineFieldBuilder().getBuilder(var1);
   }

   public List getStrideLengthOfflineBuilderList() {
      return this.getStrideLengthOfflineFieldBuilder().getBuilderList();
   }

   public int getStrideLengthOfflineCount() {
      int var1;
      if (this.strideLengthOfflineBuilder_ == null) {
         var1 = this.strideLengthOffline_.size();
      } else {
         var1 = this.strideLengthOfflineBuilder_.getCount();
      }

      return var1;
   }

   public List getStrideLengthOfflineList() {
      List var1;
      if (this.strideLengthOfflineBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.strideLengthOffline_);
      } else {
         var1 = this.strideLengthOfflineBuilder_.getMessageList();
      }

      return var1;
   }

   public Types$PbSensorOfflineOrBuilder getStrideLengthOfflineOrBuilder(int var1) {
      Types$PbSensorOfflineOrBuilder var2;
      if (this.strideLengthOfflineBuilder_ == null) {
         var2 = (Types$PbSensorOfflineOrBuilder)this.strideLengthOffline_.get(var1);
      } else {
         var2 = (Types$PbSensorOfflineOrBuilder)this.strideLengthOfflineBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getStrideLengthOfflineOrBuilderList() {
      List var1;
      if (this.strideLengthOfflineBuilder_ != null) {
         var1 = this.strideLengthOfflineBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.strideLengthOffline_);
      }

      return var1;
   }

   public int getStrideLengthSamples(int var1) {
      return (Integer)this.strideLengthSamples_.get(var1);
   }

   public int getStrideLengthSamplesCount() {
      return this.strideLengthSamples_.size();
   }

   public List getStrideLengthSamplesList() {
      return Collections.unmodifiableList(this.strideLengthSamples_);
   }

   public Types$PbSensorOffline getTemperatureOffline(int var1) {
      Types$PbSensorOffline var2;
      if (this.temperatureOfflineBuilder_ == null) {
         var2 = (Types$PbSensorOffline)this.temperatureOffline_.get(var1);
      } else {
         var2 = (Types$PbSensorOffline)this.temperatureOfflineBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Types$PbSensorOffline$Builder getTemperatureOfflineBuilder(int var1) {
      return (Types$PbSensorOffline$Builder)this.getTemperatureOfflineFieldBuilder().getBuilder(var1);
   }

   public List getTemperatureOfflineBuilderList() {
      return this.getTemperatureOfflineFieldBuilder().getBuilderList();
   }

   public int getTemperatureOfflineCount() {
      int var1;
      if (this.temperatureOfflineBuilder_ == null) {
         var1 = this.temperatureOffline_.size();
      } else {
         var1 = this.temperatureOfflineBuilder_.getCount();
      }

      return var1;
   }

   public List getTemperatureOfflineList() {
      List var1;
      if (this.temperatureOfflineBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.temperatureOffline_);
      } else {
         var1 = this.temperatureOfflineBuilder_.getMessageList();
      }

      return var1;
   }

   public Types$PbSensorOfflineOrBuilder getTemperatureOfflineOrBuilder(int var1) {
      Types$PbSensorOfflineOrBuilder var2;
      if (this.temperatureOfflineBuilder_ == null) {
         var2 = (Types$PbSensorOfflineOrBuilder)this.temperatureOffline_.get(var1);
      } else {
         var2 = (Types$PbSensorOfflineOrBuilder)this.temperatureOfflineBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getTemperatureOfflineOrBuilderList() {
      List var1;
      if (this.temperatureOfflineBuilder_ != null) {
         var1 = this.temperatureOfflineBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.temperatureOffline_);
      }

      return var1;
   }

   public float getTemperatureSamples(int var1) {
      return (Float)this.temperatureSamples_.get(var1);
   }

   public int getTemperatureSamplesCount() {
      return this.temperatureSamples_.size();
   }

   public List getTemperatureSamplesList() {
      return Collections.unmodifiableList(this.temperatureSamples_);
   }

   public boolean hasRecordingInterval() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasRrSamples() {
      boolean var1;
      if ((this.bitField0_ & 134217728) == 134217728) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseSamples.h().ensureFieldAccessorsInitialized(ExerciseSamples$PbExerciseSamples.class, ExerciseSamples$PbExerciseSamples$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasRecordingInterval()) {
         var2 = var1;
      } else {
         int var3 = 0;

         while(true) {
            if (var3 >= this.getHeartRateOfflineCount()) {
               for(var3 = 0; var3 < this.getCadenceOfflineCount(); ++var3) {
                  var2 = var1;
                  if (!this.getCadenceOffline(var3).isInitialized()) {
                     return var2;
                  }
               }

               for(var3 = 0; var3 < this.getAltitudeOfflineCount(); ++var3) {
                  var2 = var1;
                  if (!this.getAltitudeOffline(var3).isInitialized()) {
                     return var2;
                  }
               }

               for(var3 = 0; var3 < this.getAltitudeCalibrationCount(); ++var3) {
                  var2 = var1;
                  if (!this.getAltitudeCalibration(var3).isInitialized()) {
                     return var2;
                  }
               }

               for(var3 = 0; var3 < this.getTemperatureOfflineCount(); ++var3) {
                  var2 = var1;
                  if (!this.getTemperatureOffline(var3).isInitialized()) {
                     return var2;
                  }
               }

               for(var3 = 0; var3 < this.getSpeedOfflineCount(); ++var3) {
                  var2 = var1;
                  if (!this.getSpeedOffline(var3).isInitialized()) {
                     return var2;
                  }
               }

               for(var3 = 0; var3 < this.getDistanceOfflineCount(); ++var3) {
                  var2 = var1;
                  if (!this.getDistanceOffline(var3).isInitialized()) {
                     return var2;
                  }
               }

               for(var3 = 0; var3 < this.getStrideLengthOfflineCount(); ++var3) {
                  var2 = var1;
                  if (!this.getStrideLengthOffline(var3).isInitialized()) {
                     return var2;
                  }
               }

               for(var3 = 0; var3 < this.getStrideCalibrationCount(); ++var3) {
                  var2 = var1;
                  if (!this.getStrideCalibration(var3).isInitialized()) {
                     return var2;
                  }
               }

               for(var3 = 0; var3 < this.getForwardAccelerationOfflineCount(); ++var3) {
                  var2 = var1;
                  if (!this.getForwardAccelerationOffline(var3).isInitialized()) {
                     return var2;
                  }
               }

               for(var3 = 0; var3 < this.getMovingTypeOfflineCount(); ++var3) {
                  var2 = var1;
                  if (!this.getMovingTypeOffline(var3).isInitialized()) {
                     return var2;
                  }
               }

               for(var3 = 0; var3 < this.getLeftPedalPowerSamplesCount(); ++var3) {
                  var2 = var1;
                  if (!this.getLeftPedalPowerSamples(var3).isInitialized()) {
                     return var2;
                  }
               }

               for(var3 = 0; var3 < this.getLeftPedalPowerOfflineCount(); ++var3) {
                  var2 = var1;
                  if (!this.getLeftPedalPowerOffline(var3).isInitialized()) {
                     return var2;
                  }
               }

               for(var3 = 0; var3 < this.getRightPedalPowerSamplesCount(); ++var3) {
                  var2 = var1;
                  if (!this.getRightPedalPowerSamples(var3).isInitialized()) {
                     return var2;
                  }
               }

               for(var3 = 0; var3 < this.getRightPedalPowerOfflineCount(); ++var3) {
                  var2 = var1;
                  if (!this.getRightPedalPowerOffline(var3).isInitialized()) {
                     return var2;
                  }
               }

               for(var3 = 0; var3 < this.getLeftPowerCalibrationCount(); ++var3) {
                  var2 = var1;
                  if (!this.getLeftPowerCalibration(var3).isInitialized()) {
                     return var2;
                  }
               }

               for(var3 = 0; var3 < this.getRightPowerCalibrationCount(); ++var3) {
                  var2 = var1;
                  if (!this.getRightPowerCalibration(var3).isInitialized()) {
                     return var2;
                  }
               }

               if (this.hasRrSamples()) {
                  var2 = var1;
                  if (!this.getRrSamples().isInitialized()) {
                     break;
                  }
               }

               for(var3 = 0; var3 < this.getExerciseIntervalledSampleListCount(); ++var3) {
                  var2 = var1;
                  if (!this.getExerciseIntervalledSampleList(var3).isInitialized()) {
                     return var2;
                  }
               }

               for(var3 = 0; var3 < this.getPauseTimesCount(); ++var3) {
                  var2 = var1;
                  if (!this.getPauseTimes(var3).isInitialized()) {
                     return var2;
                  }
               }

               var2 = true;
               break;
            }

            var2 = var1;
            if (!this.getHeartRateOffline(var3).isInitialized()) {
               break;
            }

            ++var3;
         }
      }

      return var2;
   }

   public ExerciseSamples$PbExerciseSamples$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseSamples$PbExerciseSamples var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (ExerciseSamples$PbExerciseSamples)ExerciseSamples$PbExerciseSamples.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (ExerciseSamples$PbExerciseSamples)var11.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var14.unwrapIOException();
         } catch (Throwable var10) {
            if (var13 != null) {
               this.mergeFrom(var13);
            }

            throw var10;
         }
      }

      if (var13 != null) {
         this.mergeFrom(var13);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder mergeFrom(Message var1) {
      ExerciseSamples$PbExerciseSamples$Builder var2;
      if (var1 instanceof ExerciseSamples$PbExerciseSamples) {
         var2 = this.mergeFrom((ExerciseSamples$PbExerciseSamples)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseSamples$PbExerciseSamples$Builder mergeFrom(ExerciseSamples$PbExerciseSamples var1) {
      Object var2 = null;
      if (var1 != ExerciseSamples$PbExerciseSamples.getDefaultInstance()) {
         if (var1.hasRecordingInterval()) {
            this.mergeRecordingInterval(var1.getRecordingInterval());
         }

         if (!ExerciseSamples$PbExerciseSamples.a(var1).isEmpty()) {
            if (this.heartRateSamples_.isEmpty()) {
               this.heartRateSamples_ = ExerciseSamples$PbExerciseSamples.a(var1);
               this.bitField0_ &= -3;
            } else {
               this.ensureHeartRateSamplesIsMutable();
               this.heartRateSamples_.addAll(ExerciseSamples$PbExerciseSamples.a(var1));
            }

            this.onChanged();
         }

         RepeatedFieldBuilderV3 var3;
         if (this.heartRateOfflineBuilder_ == null) {
            if (!ExerciseSamples$PbExerciseSamples.b(var1).isEmpty()) {
               if (this.heartRateOffline_.isEmpty()) {
                  this.heartRateOffline_ = ExerciseSamples$PbExerciseSamples.b(var1);
                  this.bitField0_ &= -5;
               } else {
                  this.ensureHeartRateOfflineIsMutable();
                  this.heartRateOffline_.addAll(ExerciseSamples$PbExerciseSamples.b(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSamples$PbExerciseSamples.b(var1).isEmpty()) {
            if (this.heartRateOfflineBuilder_.isEmpty()) {
               this.heartRateOfflineBuilder_.dispose();
               this.heartRateOfflineBuilder_ = null;
               this.heartRateOffline_ = ExerciseSamples$PbExerciseSamples.b(var1);
               this.bitField0_ &= -5;
               if (ExerciseSamples$PbExerciseSamples.c()) {
                  var3 = this.getHeartRateOfflineFieldBuilder();
               } else {
                  var3 = null;
               }

               this.heartRateOfflineBuilder_ = var3;
            } else {
               this.heartRateOfflineBuilder_.addAllMessages(ExerciseSamples$PbExerciseSamples.b(var1));
            }
         }

         if (!ExerciseSamples$PbExerciseSamples.c(var1).isEmpty()) {
            if (this.cadenceSamples_.isEmpty()) {
               this.cadenceSamples_ = ExerciseSamples$PbExerciseSamples.c(var1);
               this.bitField0_ &= -9;
            } else {
               this.ensureCadenceSamplesIsMutable();
               this.cadenceSamples_.addAll(ExerciseSamples$PbExerciseSamples.c(var1));
            }

            this.onChanged();
         }

         if (this.cadenceOfflineBuilder_ == null) {
            if (!ExerciseSamples$PbExerciseSamples.d(var1).isEmpty()) {
               if (this.cadenceOffline_.isEmpty()) {
                  this.cadenceOffline_ = ExerciseSamples$PbExerciseSamples.d(var1);
                  this.bitField0_ &= -17;
               } else {
                  this.ensureCadenceOfflineIsMutable();
                  this.cadenceOffline_.addAll(ExerciseSamples$PbExerciseSamples.d(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSamples$PbExerciseSamples.d(var1).isEmpty()) {
            if (this.cadenceOfflineBuilder_.isEmpty()) {
               this.cadenceOfflineBuilder_.dispose();
               this.cadenceOfflineBuilder_ = null;
               this.cadenceOffline_ = ExerciseSamples$PbExerciseSamples.d(var1);
               this.bitField0_ &= -17;
               if (ExerciseSamples$PbExerciseSamples.d()) {
                  var3 = this.getCadenceOfflineFieldBuilder();
               } else {
                  var3 = null;
               }

               this.cadenceOfflineBuilder_ = var3;
            } else {
               this.cadenceOfflineBuilder_.addAllMessages(ExerciseSamples$PbExerciseSamples.d(var1));
            }
         }

         if (!ExerciseSamples$PbExerciseSamples.e(var1).isEmpty()) {
            if (this.altitudeSamples_.isEmpty()) {
               this.altitudeSamples_ = ExerciseSamples$PbExerciseSamples.e(var1);
               this.bitField0_ &= -33;
            } else {
               this.ensureAltitudeSamplesIsMutable();
               this.altitudeSamples_.addAll(ExerciseSamples$PbExerciseSamples.e(var1));
            }

            this.onChanged();
         }

         if (this.altitudeOfflineBuilder_ == null) {
            if (!ExerciseSamples$PbExerciseSamples.f(var1).isEmpty()) {
               if (this.altitudeOffline_.isEmpty()) {
                  this.altitudeOffline_ = ExerciseSamples$PbExerciseSamples.f(var1);
                  this.bitField0_ &= -65;
               } else {
                  this.ensureAltitudeOfflineIsMutable();
                  this.altitudeOffline_.addAll(ExerciseSamples$PbExerciseSamples.f(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSamples$PbExerciseSamples.f(var1).isEmpty()) {
            if (this.altitudeOfflineBuilder_.isEmpty()) {
               this.altitudeOfflineBuilder_.dispose();
               this.altitudeOfflineBuilder_ = null;
               this.altitudeOffline_ = ExerciseSamples$PbExerciseSamples.f(var1);
               this.bitField0_ &= -65;
               if (ExerciseSamples$PbExerciseSamples.e()) {
                  var3 = this.getAltitudeOfflineFieldBuilder();
               } else {
                  var3 = null;
               }

               this.altitudeOfflineBuilder_ = var3;
            } else {
               this.altitudeOfflineBuilder_.addAllMessages(ExerciseSamples$PbExerciseSamples.f(var1));
            }
         }

         if (this.altitudeCalibrationBuilder_ == null) {
            if (!ExerciseSamples$PbExerciseSamples.g(var1).isEmpty()) {
               if (this.altitudeCalibration_.isEmpty()) {
                  this.altitudeCalibration_ = ExerciseSamples$PbExerciseSamples.g(var1);
                  this.bitField0_ &= -129;
               } else {
                  this.ensureAltitudeCalibrationIsMutable();
                  this.altitudeCalibration_.addAll(ExerciseSamples$PbExerciseSamples.g(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSamples$PbExerciseSamples.g(var1).isEmpty()) {
            if (this.altitudeCalibrationBuilder_.isEmpty()) {
               this.altitudeCalibrationBuilder_.dispose();
               this.altitudeCalibrationBuilder_ = null;
               this.altitudeCalibration_ = ExerciseSamples$PbExerciseSamples.g(var1);
               this.bitField0_ &= -129;
               if (ExerciseSamples$PbExerciseSamples.f()) {
                  var3 = this.getAltitudeCalibrationFieldBuilder();
               } else {
                  var3 = null;
               }

               this.altitudeCalibrationBuilder_ = var3;
            } else {
               this.altitudeCalibrationBuilder_.addAllMessages(ExerciseSamples$PbExerciseSamples.g(var1));
            }
         }

         if (!ExerciseSamples$PbExerciseSamples.h(var1).isEmpty()) {
            if (this.temperatureSamples_.isEmpty()) {
               this.temperatureSamples_ = ExerciseSamples$PbExerciseSamples.h(var1);
               this.bitField0_ &= -257;
            } else {
               this.ensureTemperatureSamplesIsMutable();
               this.temperatureSamples_.addAll(ExerciseSamples$PbExerciseSamples.h(var1));
            }

            this.onChanged();
         }

         if (this.temperatureOfflineBuilder_ == null) {
            if (!ExerciseSamples$PbExerciseSamples.i(var1).isEmpty()) {
               if (this.temperatureOffline_.isEmpty()) {
                  this.temperatureOffline_ = ExerciseSamples$PbExerciseSamples.i(var1);
                  this.bitField0_ &= -513;
               } else {
                  this.ensureTemperatureOfflineIsMutable();
                  this.temperatureOffline_.addAll(ExerciseSamples$PbExerciseSamples.i(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSamples$PbExerciseSamples.i(var1).isEmpty()) {
            if (this.temperatureOfflineBuilder_.isEmpty()) {
               this.temperatureOfflineBuilder_.dispose();
               this.temperatureOfflineBuilder_ = null;
               this.temperatureOffline_ = ExerciseSamples$PbExerciseSamples.i(var1);
               this.bitField0_ &= -513;
               if (ExerciseSamples$PbExerciseSamples.g()) {
                  var3 = this.getTemperatureOfflineFieldBuilder();
               } else {
                  var3 = null;
               }

               this.temperatureOfflineBuilder_ = var3;
            } else {
               this.temperatureOfflineBuilder_.addAllMessages(ExerciseSamples$PbExerciseSamples.i(var1));
            }
         }

         if (!ExerciseSamples$PbExerciseSamples.j(var1).isEmpty()) {
            if (this.speedSamples_.isEmpty()) {
               this.speedSamples_ = ExerciseSamples$PbExerciseSamples.j(var1);
               this.bitField0_ &= -1025;
            } else {
               this.ensureSpeedSamplesIsMutable();
               this.speedSamples_.addAll(ExerciseSamples$PbExerciseSamples.j(var1));
            }

            this.onChanged();
         }

         if (this.speedOfflineBuilder_ == null) {
            if (!ExerciseSamples$PbExerciseSamples.k(var1).isEmpty()) {
               if (this.speedOffline_.isEmpty()) {
                  this.speedOffline_ = ExerciseSamples$PbExerciseSamples.k(var1);
                  this.bitField0_ &= -2049;
               } else {
                  this.ensureSpeedOfflineIsMutable();
                  this.speedOffline_.addAll(ExerciseSamples$PbExerciseSamples.k(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSamples$PbExerciseSamples.k(var1).isEmpty()) {
            if (this.speedOfflineBuilder_.isEmpty()) {
               this.speedOfflineBuilder_.dispose();
               this.speedOfflineBuilder_ = null;
               this.speedOffline_ = ExerciseSamples$PbExerciseSamples.k(var1);
               this.bitField0_ &= -2049;
               if (ExerciseSamples$PbExerciseSamples.h()) {
                  var3 = this.getSpeedOfflineFieldBuilder();
               } else {
                  var3 = null;
               }

               this.speedOfflineBuilder_ = var3;
            } else {
               this.speedOfflineBuilder_.addAllMessages(ExerciseSamples$PbExerciseSamples.k(var1));
            }
         }

         if (!ExerciseSamples$PbExerciseSamples.l(var1).isEmpty()) {
            if (this.distanceSamples_.isEmpty()) {
               this.distanceSamples_ = ExerciseSamples$PbExerciseSamples.l(var1);
               this.bitField0_ &= -4097;
            } else {
               this.ensureDistanceSamplesIsMutable();
               this.distanceSamples_.addAll(ExerciseSamples$PbExerciseSamples.l(var1));
            }

            this.onChanged();
         }

         if (this.distanceOfflineBuilder_ == null) {
            if (!ExerciseSamples$PbExerciseSamples.m(var1).isEmpty()) {
               if (this.distanceOffline_.isEmpty()) {
                  this.distanceOffline_ = ExerciseSamples$PbExerciseSamples.m(var1);
                  this.bitField0_ &= -8193;
               } else {
                  this.ensureDistanceOfflineIsMutable();
                  this.distanceOffline_.addAll(ExerciseSamples$PbExerciseSamples.m(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSamples$PbExerciseSamples.m(var1).isEmpty()) {
            if (this.distanceOfflineBuilder_.isEmpty()) {
               this.distanceOfflineBuilder_.dispose();
               this.distanceOfflineBuilder_ = null;
               this.distanceOffline_ = ExerciseSamples$PbExerciseSamples.m(var1);
               this.bitField0_ &= -8193;
               if (ExerciseSamples$PbExerciseSamples.i()) {
                  var3 = this.getDistanceOfflineFieldBuilder();
               } else {
                  var3 = null;
               }

               this.distanceOfflineBuilder_ = var3;
            } else {
               this.distanceOfflineBuilder_.addAllMessages(ExerciseSamples$PbExerciseSamples.m(var1));
            }
         }

         if (!ExerciseSamples$PbExerciseSamples.n(var1).isEmpty()) {
            if (this.strideLengthSamples_.isEmpty()) {
               this.strideLengthSamples_ = ExerciseSamples$PbExerciseSamples.n(var1);
               this.bitField0_ &= -16385;
            } else {
               this.ensureStrideLengthSamplesIsMutable();
               this.strideLengthSamples_.addAll(ExerciseSamples$PbExerciseSamples.n(var1));
            }

            this.onChanged();
         }

         if (this.strideLengthOfflineBuilder_ == null) {
            if (!ExerciseSamples$PbExerciseSamples.o(var1).isEmpty()) {
               if (this.strideLengthOffline_.isEmpty()) {
                  this.strideLengthOffline_ = ExerciseSamples$PbExerciseSamples.o(var1);
                  this.bitField0_ &= -32769;
               } else {
                  this.ensureStrideLengthOfflineIsMutable();
                  this.strideLengthOffline_.addAll(ExerciseSamples$PbExerciseSamples.o(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSamples$PbExerciseSamples.o(var1).isEmpty()) {
            if (this.strideLengthOfflineBuilder_.isEmpty()) {
               this.strideLengthOfflineBuilder_.dispose();
               this.strideLengthOfflineBuilder_ = null;
               this.strideLengthOffline_ = ExerciseSamples$PbExerciseSamples.o(var1);
               this.bitField0_ &= -32769;
               if (ExerciseSamples$PbExerciseSamples.j()) {
                  var3 = this.getStrideLengthOfflineFieldBuilder();
               } else {
                  var3 = null;
               }

               this.strideLengthOfflineBuilder_ = var3;
            } else {
               this.strideLengthOfflineBuilder_.addAllMessages(ExerciseSamples$PbExerciseSamples.o(var1));
            }
         }

         if (this.strideCalibrationBuilder_ == null) {
            if (!ExerciseSamples$PbExerciseSamples.p(var1).isEmpty()) {
               if (this.strideCalibration_.isEmpty()) {
                  this.strideCalibration_ = ExerciseSamples$PbExerciseSamples.p(var1);
                  this.bitField0_ &= -65537;
               } else {
                  this.ensureStrideCalibrationIsMutable();
                  this.strideCalibration_.addAll(ExerciseSamples$PbExerciseSamples.p(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSamples$PbExerciseSamples.p(var1).isEmpty()) {
            if (this.strideCalibrationBuilder_.isEmpty()) {
               this.strideCalibrationBuilder_.dispose();
               this.strideCalibrationBuilder_ = null;
               this.strideCalibration_ = ExerciseSamples$PbExerciseSamples.p(var1);
               this.bitField0_ &= -65537;
               if (ExerciseSamples$PbExerciseSamples.k()) {
                  var3 = this.getStrideCalibrationFieldBuilder();
               } else {
                  var3 = null;
               }

               this.strideCalibrationBuilder_ = var3;
            } else {
               this.strideCalibrationBuilder_.addAllMessages(ExerciseSamples$PbExerciseSamples.p(var1));
            }
         }

         if (!ExerciseSamples$PbExerciseSamples.q(var1).isEmpty()) {
            if (this.forwardAcceleration_.isEmpty()) {
               this.forwardAcceleration_ = ExerciseSamples$PbExerciseSamples.q(var1);
               this.bitField0_ &= -131073;
            } else {
               this.ensureForwardAccelerationIsMutable();
               this.forwardAcceleration_.addAll(ExerciseSamples$PbExerciseSamples.q(var1));
            }

            this.onChanged();
         }

         if (this.forwardAccelerationOfflineBuilder_ == null) {
            if (!ExerciseSamples$PbExerciseSamples.r(var1).isEmpty()) {
               if (this.forwardAccelerationOffline_.isEmpty()) {
                  this.forwardAccelerationOffline_ = ExerciseSamples$PbExerciseSamples.r(var1);
                  this.bitField0_ &= -262145;
               } else {
                  this.ensureForwardAccelerationOfflineIsMutable();
                  this.forwardAccelerationOffline_.addAll(ExerciseSamples$PbExerciseSamples.r(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSamples$PbExerciseSamples.r(var1).isEmpty()) {
            if (this.forwardAccelerationOfflineBuilder_.isEmpty()) {
               this.forwardAccelerationOfflineBuilder_.dispose();
               this.forwardAccelerationOfflineBuilder_ = null;
               this.forwardAccelerationOffline_ = ExerciseSamples$PbExerciseSamples.r(var1);
               this.bitField0_ &= -262145;
               if (ExerciseSamples$PbExerciseSamples.l()) {
                  var3 = this.getForwardAccelerationOfflineFieldBuilder();
               } else {
                  var3 = null;
               }

               this.forwardAccelerationOfflineBuilder_ = var3;
            } else {
               this.forwardAccelerationOfflineBuilder_.addAllMessages(ExerciseSamples$PbExerciseSamples.r(var1));
            }
         }

         if (!ExerciseSamples$PbExerciseSamples.s(var1).isEmpty()) {
            if (this.movingTypeSamples_.isEmpty()) {
               this.movingTypeSamples_ = ExerciseSamples$PbExerciseSamples.s(var1);
               this.bitField0_ &= -524289;
            } else {
               this.ensureMovingTypeSamplesIsMutable();
               this.movingTypeSamples_.addAll(ExerciseSamples$PbExerciseSamples.s(var1));
            }

            this.onChanged();
         }

         if (this.movingTypeOfflineBuilder_ == null) {
            if (!ExerciseSamples$PbExerciseSamples.t(var1).isEmpty()) {
               if (this.movingTypeOffline_.isEmpty()) {
                  this.movingTypeOffline_ = ExerciseSamples$PbExerciseSamples.t(var1);
                  this.bitField0_ &= -1048577;
               } else {
                  this.ensureMovingTypeOfflineIsMutable();
                  this.movingTypeOffline_.addAll(ExerciseSamples$PbExerciseSamples.t(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSamples$PbExerciseSamples.t(var1).isEmpty()) {
            if (this.movingTypeOfflineBuilder_.isEmpty()) {
               this.movingTypeOfflineBuilder_.dispose();
               this.movingTypeOfflineBuilder_ = null;
               this.movingTypeOffline_ = ExerciseSamples$PbExerciseSamples.t(var1);
               this.bitField0_ &= -1048577;
               if (ExerciseSamples$PbExerciseSamples.m()) {
                  var3 = this.getMovingTypeOfflineFieldBuilder();
               } else {
                  var3 = null;
               }

               this.movingTypeOfflineBuilder_ = var3;
            } else {
               this.movingTypeOfflineBuilder_.addAllMessages(ExerciseSamples$PbExerciseSamples.t(var1));
            }
         }

         if (this.leftPedalPowerSamplesBuilder_ == null) {
            if (!ExerciseSamples$PbExerciseSamples.u(var1).isEmpty()) {
               if (this.leftPedalPowerSamples_.isEmpty()) {
                  this.leftPedalPowerSamples_ = ExerciseSamples$PbExerciseSamples.u(var1);
                  this.bitField0_ &= -2097153;
               } else {
                  this.ensureLeftPedalPowerSamplesIsMutable();
                  this.leftPedalPowerSamples_.addAll(ExerciseSamples$PbExerciseSamples.u(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSamples$PbExerciseSamples.u(var1).isEmpty()) {
            if (this.leftPedalPowerSamplesBuilder_.isEmpty()) {
               this.leftPedalPowerSamplesBuilder_.dispose();
               this.leftPedalPowerSamplesBuilder_ = null;
               this.leftPedalPowerSamples_ = ExerciseSamples$PbExerciseSamples.u(var1);
               this.bitField0_ &= -2097153;
               if (ExerciseSamples$PbExerciseSamples.n()) {
                  var3 = this.getLeftPedalPowerSamplesFieldBuilder();
               } else {
                  var3 = null;
               }

               this.leftPedalPowerSamplesBuilder_ = var3;
            } else {
               this.leftPedalPowerSamplesBuilder_.addAllMessages(ExerciseSamples$PbExerciseSamples.u(var1));
            }
         }

         if (this.leftPedalPowerOfflineBuilder_ == null) {
            if (!ExerciseSamples$PbExerciseSamples.v(var1).isEmpty()) {
               if (this.leftPedalPowerOffline_.isEmpty()) {
                  this.leftPedalPowerOffline_ = ExerciseSamples$PbExerciseSamples.v(var1);
                  this.bitField0_ &= -4194305;
               } else {
                  this.ensureLeftPedalPowerOfflineIsMutable();
                  this.leftPedalPowerOffline_.addAll(ExerciseSamples$PbExerciseSamples.v(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSamples$PbExerciseSamples.v(var1).isEmpty()) {
            if (this.leftPedalPowerOfflineBuilder_.isEmpty()) {
               this.leftPedalPowerOfflineBuilder_.dispose();
               this.leftPedalPowerOfflineBuilder_ = null;
               this.leftPedalPowerOffline_ = ExerciseSamples$PbExerciseSamples.v(var1);
               this.bitField0_ &= -4194305;
               if (ExerciseSamples$PbExerciseSamples.o()) {
                  var3 = this.getLeftPedalPowerOfflineFieldBuilder();
               } else {
                  var3 = null;
               }

               this.leftPedalPowerOfflineBuilder_ = var3;
            } else {
               this.leftPedalPowerOfflineBuilder_.addAllMessages(ExerciseSamples$PbExerciseSamples.v(var1));
            }
         }

         if (this.rightPedalPowerSamplesBuilder_ == null) {
            if (!ExerciseSamples$PbExerciseSamples.w(var1).isEmpty()) {
               if (this.rightPedalPowerSamples_.isEmpty()) {
                  this.rightPedalPowerSamples_ = ExerciseSamples$PbExerciseSamples.w(var1);
                  this.bitField0_ &= -8388609;
               } else {
                  this.ensureRightPedalPowerSamplesIsMutable();
                  this.rightPedalPowerSamples_.addAll(ExerciseSamples$PbExerciseSamples.w(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSamples$PbExerciseSamples.w(var1).isEmpty()) {
            if (this.rightPedalPowerSamplesBuilder_.isEmpty()) {
               this.rightPedalPowerSamplesBuilder_.dispose();
               this.rightPedalPowerSamplesBuilder_ = null;
               this.rightPedalPowerSamples_ = ExerciseSamples$PbExerciseSamples.w(var1);
               this.bitField0_ &= -8388609;
               if (ExerciseSamples$PbExerciseSamples.p()) {
                  var3 = this.getRightPedalPowerSamplesFieldBuilder();
               } else {
                  var3 = null;
               }

               this.rightPedalPowerSamplesBuilder_ = var3;
            } else {
               this.rightPedalPowerSamplesBuilder_.addAllMessages(ExerciseSamples$PbExerciseSamples.w(var1));
            }
         }

         if (this.rightPedalPowerOfflineBuilder_ == null) {
            if (!ExerciseSamples$PbExerciseSamples.x(var1).isEmpty()) {
               if (this.rightPedalPowerOffline_.isEmpty()) {
                  this.rightPedalPowerOffline_ = ExerciseSamples$PbExerciseSamples.x(var1);
                  this.bitField0_ &= -16777217;
               } else {
                  this.ensureRightPedalPowerOfflineIsMutable();
                  this.rightPedalPowerOffline_.addAll(ExerciseSamples$PbExerciseSamples.x(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSamples$PbExerciseSamples.x(var1).isEmpty()) {
            if (this.rightPedalPowerOfflineBuilder_.isEmpty()) {
               this.rightPedalPowerOfflineBuilder_.dispose();
               this.rightPedalPowerOfflineBuilder_ = null;
               this.rightPedalPowerOffline_ = ExerciseSamples$PbExerciseSamples.x(var1);
               this.bitField0_ &= -16777217;
               if (ExerciseSamples$PbExerciseSamples.q()) {
                  var3 = this.getRightPedalPowerOfflineFieldBuilder();
               } else {
                  var3 = null;
               }

               this.rightPedalPowerOfflineBuilder_ = var3;
            } else {
               this.rightPedalPowerOfflineBuilder_.addAllMessages(ExerciseSamples$PbExerciseSamples.x(var1));
            }
         }

         if (this.leftPowerCalibrationBuilder_ == null) {
            if (!ExerciseSamples$PbExerciseSamples.y(var1).isEmpty()) {
               if (this.leftPowerCalibration_.isEmpty()) {
                  this.leftPowerCalibration_ = ExerciseSamples$PbExerciseSamples.y(var1);
                  this.bitField0_ &= -33554433;
               } else {
                  this.ensureLeftPowerCalibrationIsMutable();
                  this.leftPowerCalibration_.addAll(ExerciseSamples$PbExerciseSamples.y(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSamples$PbExerciseSamples.y(var1).isEmpty()) {
            if (this.leftPowerCalibrationBuilder_.isEmpty()) {
               this.leftPowerCalibrationBuilder_.dispose();
               this.leftPowerCalibrationBuilder_ = null;
               this.leftPowerCalibration_ = ExerciseSamples$PbExerciseSamples.y(var1);
               this.bitField0_ &= -33554433;
               if (ExerciseSamples$PbExerciseSamples.r()) {
                  var3 = this.getLeftPowerCalibrationFieldBuilder();
               } else {
                  var3 = null;
               }

               this.leftPowerCalibrationBuilder_ = var3;
            } else {
               this.leftPowerCalibrationBuilder_.addAllMessages(ExerciseSamples$PbExerciseSamples.y(var1));
            }
         }

         if (this.rightPowerCalibrationBuilder_ == null) {
            if (!ExerciseSamples$PbExerciseSamples.z(var1).isEmpty()) {
               if (this.rightPowerCalibration_.isEmpty()) {
                  this.rightPowerCalibration_ = ExerciseSamples$PbExerciseSamples.z(var1);
                  this.bitField0_ &= -67108865;
               } else {
                  this.ensureRightPowerCalibrationIsMutable();
                  this.rightPowerCalibration_.addAll(ExerciseSamples$PbExerciseSamples.z(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSamples$PbExerciseSamples.z(var1).isEmpty()) {
            if (this.rightPowerCalibrationBuilder_.isEmpty()) {
               this.rightPowerCalibrationBuilder_.dispose();
               this.rightPowerCalibrationBuilder_ = null;
               this.rightPowerCalibration_ = ExerciseSamples$PbExerciseSamples.z(var1);
               this.bitField0_ &= -67108865;
               if (ExerciseSamples$PbExerciseSamples.s()) {
                  var3 = this.getRightPowerCalibrationFieldBuilder();
               } else {
                  var3 = null;
               }

               this.rightPowerCalibrationBuilder_ = var3;
            } else {
               this.rightPowerCalibrationBuilder_.addAllMessages(ExerciseSamples$PbExerciseSamples.z(var1));
            }
         }

         if (var1.hasRrSamples()) {
            this.mergeRrSamples(var1.getRrSamples());
         }

         if (this.exerciseIntervalledSampleListBuilder_ == null) {
            if (!ExerciseSamples$PbExerciseSamples.A(var1).isEmpty()) {
               if (this.exerciseIntervalledSampleList_.isEmpty()) {
                  this.exerciseIntervalledSampleList_ = ExerciseSamples$PbExerciseSamples.A(var1);
                  this.bitField0_ &= -268435457;
               } else {
                  this.ensureExerciseIntervalledSampleListIsMutable();
                  this.exerciseIntervalledSampleList_.addAll(ExerciseSamples$PbExerciseSamples.A(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSamples$PbExerciseSamples.A(var1).isEmpty()) {
            if (this.exerciseIntervalledSampleListBuilder_.isEmpty()) {
               this.exerciseIntervalledSampleListBuilder_.dispose();
               this.exerciseIntervalledSampleListBuilder_ = null;
               this.exerciseIntervalledSampleList_ = ExerciseSamples$PbExerciseSamples.A(var1);
               this.bitField0_ &= -268435457;
               if (ExerciseSamples$PbExerciseSamples.t()) {
                  var3 = this.getExerciseIntervalledSampleListFieldBuilder();
               } else {
                  var3 = null;
               }

               this.exerciseIntervalledSampleListBuilder_ = var3;
            } else {
               this.exerciseIntervalledSampleListBuilder_.addAllMessages(ExerciseSamples$PbExerciseSamples.A(var1));
            }
         }

         if (this.pauseTimesBuilder_ == null) {
            if (!ExerciseSamples$PbExerciseSamples.B(var1).isEmpty()) {
               if (this.pauseTimes_.isEmpty()) {
                  this.pauseTimes_ = ExerciseSamples$PbExerciseSamples.B(var1);
                  this.bitField0_ &= -536870913;
               } else {
                  this.ensurePauseTimesIsMutable();
                  this.pauseTimes_.addAll(ExerciseSamples$PbExerciseSamples.B(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSamples$PbExerciseSamples.B(var1).isEmpty()) {
            if (this.pauseTimesBuilder_.isEmpty()) {
               this.pauseTimesBuilder_.dispose();
               this.pauseTimesBuilder_ = null;
               this.pauseTimes_ = ExerciseSamples$PbExerciseSamples.B(var1);
               this.bitField0_ &= -536870913;
               var3 = (RepeatedFieldBuilderV3)var2;
               if (ExerciseSamples$PbExerciseSamples.u()) {
                  var3 = this.getPauseTimesFieldBuilder();
               }

               this.pauseTimesBuilder_ = var3;
            } else {
               this.pauseTimesBuilder_.addAllMessages(ExerciseSamples$PbExerciseSamples.B(var1));
            }
         }

         this.mergeUnknownFields(ExerciseSamples$PbExerciseSamples.C(var1));
         this.onChanged();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder mergeRecordingInterval(Types$PbDuration var1) {
      if (this.recordingIntervalBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.recordingInterval_ != null && this.recordingInterval_ != Types$PbDuration.getDefaultInstance()) {
            this.recordingInterval_ = Types$PbDuration.newBuilder(this.recordingInterval_).mergeFrom(var1).buildPartial();
         } else {
            this.recordingInterval_ = var1;
         }

         this.onChanged();
      } else {
         this.recordingIntervalBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder mergeRrSamples(ExerciseRRSamples$PbExerciseRRIntervals var1) {
      if (this.rrSamplesBuilder_ == null) {
         if ((this.bitField0_ & 134217728) == 134217728 && this.rrSamples_ != null && this.rrSamples_ != ExerciseRRSamples$PbExerciseRRIntervals.getDefaultInstance()) {
            this.rrSamples_ = ExerciseRRSamples$PbExerciseRRIntervals.newBuilder(this.rrSamples_).mergeFrom(var1).buildPartial();
         } else {
            this.rrSamples_ = var1;
         }

         this.onChanged();
      } else {
         this.rrSamplesBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 134217728;
      return this;
   }

   public final ExerciseSamples$PbExerciseSamples$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseSamples$PbExerciseSamples$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseSamples$PbExerciseSamples$Builder removeAltitudeCalibration(int var1) {
      if (this.altitudeCalibrationBuilder_ == null) {
         this.ensureAltitudeCalibrationIsMutable();
         this.altitudeCalibration_.remove(var1);
         this.onChanged();
      } else {
         this.altitudeCalibrationBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder removeAltitudeOffline(int var1) {
      if (this.altitudeOfflineBuilder_ == null) {
         this.ensureAltitudeOfflineIsMutable();
         this.altitudeOffline_.remove(var1);
         this.onChanged();
      } else {
         this.altitudeOfflineBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder removeCadenceOffline(int var1) {
      if (this.cadenceOfflineBuilder_ == null) {
         this.ensureCadenceOfflineIsMutable();
         this.cadenceOffline_.remove(var1);
         this.onChanged();
      } else {
         this.cadenceOfflineBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder removeDistanceOffline(int var1) {
      if (this.distanceOfflineBuilder_ == null) {
         this.ensureDistanceOfflineIsMutable();
         this.distanceOffline_.remove(var1);
         this.onChanged();
      } else {
         this.distanceOfflineBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder removeExerciseIntervalledSampleList(int var1) {
      if (this.exerciseIntervalledSampleListBuilder_ == null) {
         this.ensureExerciseIntervalledSampleListIsMutable();
         this.exerciseIntervalledSampleList_.remove(var1);
         this.onChanged();
      } else {
         this.exerciseIntervalledSampleListBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder removeForwardAccelerationOffline(int var1) {
      if (this.forwardAccelerationOfflineBuilder_ == null) {
         this.ensureForwardAccelerationOfflineIsMutable();
         this.forwardAccelerationOffline_.remove(var1);
         this.onChanged();
      } else {
         this.forwardAccelerationOfflineBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder removeHeartRateOffline(int var1) {
      if (this.heartRateOfflineBuilder_ == null) {
         this.ensureHeartRateOfflineIsMutable();
         this.heartRateOffline_.remove(var1);
         this.onChanged();
      } else {
         this.heartRateOfflineBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder removeLeftPedalPowerOffline(int var1) {
      if (this.leftPedalPowerOfflineBuilder_ == null) {
         this.ensureLeftPedalPowerOfflineIsMutable();
         this.leftPedalPowerOffline_.remove(var1);
         this.onChanged();
      } else {
         this.leftPedalPowerOfflineBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder removeLeftPedalPowerSamples(int var1) {
      if (this.leftPedalPowerSamplesBuilder_ == null) {
         this.ensureLeftPedalPowerSamplesIsMutable();
         this.leftPedalPowerSamples_.remove(var1);
         this.onChanged();
      } else {
         this.leftPedalPowerSamplesBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder removeLeftPowerCalibration(int var1) {
      if (this.leftPowerCalibrationBuilder_ == null) {
         this.ensureLeftPowerCalibrationIsMutable();
         this.leftPowerCalibration_.remove(var1);
         this.onChanged();
      } else {
         this.leftPowerCalibrationBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder removeMovingTypeOffline(int var1) {
      if (this.movingTypeOfflineBuilder_ == null) {
         this.ensureMovingTypeOfflineIsMutable();
         this.movingTypeOffline_.remove(var1);
         this.onChanged();
      } else {
         this.movingTypeOfflineBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder removePauseTimes(int var1) {
      if (this.pauseTimesBuilder_ == null) {
         this.ensurePauseTimesIsMutable();
         this.pauseTimes_.remove(var1);
         this.onChanged();
      } else {
         this.pauseTimesBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder removeRightPedalPowerOffline(int var1) {
      if (this.rightPedalPowerOfflineBuilder_ == null) {
         this.ensureRightPedalPowerOfflineIsMutable();
         this.rightPedalPowerOffline_.remove(var1);
         this.onChanged();
      } else {
         this.rightPedalPowerOfflineBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder removeRightPedalPowerSamples(int var1) {
      if (this.rightPedalPowerSamplesBuilder_ == null) {
         this.ensureRightPedalPowerSamplesIsMutable();
         this.rightPedalPowerSamples_.remove(var1);
         this.onChanged();
      } else {
         this.rightPedalPowerSamplesBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder removeRightPowerCalibration(int var1) {
      if (this.rightPowerCalibrationBuilder_ == null) {
         this.ensureRightPowerCalibrationIsMutable();
         this.rightPowerCalibration_.remove(var1);
         this.onChanged();
      } else {
         this.rightPowerCalibrationBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder removeSpeedOffline(int var1) {
      if (this.speedOfflineBuilder_ == null) {
         this.ensureSpeedOfflineIsMutable();
         this.speedOffline_.remove(var1);
         this.onChanged();
      } else {
         this.speedOfflineBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder removeStrideCalibration(int var1) {
      if (this.strideCalibrationBuilder_ == null) {
         this.ensureStrideCalibrationIsMutable();
         this.strideCalibration_.remove(var1);
         this.onChanged();
      } else {
         this.strideCalibrationBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder removeStrideLengthOffline(int var1) {
      if (this.strideLengthOfflineBuilder_ == null) {
         this.ensureStrideLengthOfflineIsMutable();
         this.strideLengthOffline_.remove(var1);
         this.onChanged();
      } else {
         this.strideLengthOfflineBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder removeTemperatureOffline(int var1) {
      if (this.temperatureOfflineBuilder_ == null) {
         this.ensureTemperatureOfflineIsMutable();
         this.temperatureOffline_.remove(var1);
         this.onChanged();
      } else {
         this.temperatureOfflineBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setAltitudeCalibration(int var1, ExerciseSamples$PbCalibrationValue$Builder var2) {
      if (this.altitudeCalibrationBuilder_ == null) {
         this.ensureAltitudeCalibrationIsMutable();
         this.altitudeCalibration_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.altitudeCalibrationBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setAltitudeCalibration(int var1, ExerciseSamples$PbCalibrationValue var2) {
      if (this.altitudeCalibrationBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureAltitudeCalibrationIsMutable();
         this.altitudeCalibration_.set(var1, var2);
         this.onChanged();
      } else {
         this.altitudeCalibrationBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setAltitudeOffline(int var1, Types$PbSensorOffline$Builder var2) {
      if (this.altitudeOfflineBuilder_ == null) {
         this.ensureAltitudeOfflineIsMutable();
         this.altitudeOffline_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.altitudeOfflineBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setAltitudeOffline(int var1, Types$PbSensorOffline var2) {
      if (this.altitudeOfflineBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureAltitudeOfflineIsMutable();
         this.altitudeOffline_.set(var1, var2);
         this.onChanged();
      } else {
         this.altitudeOfflineBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setAltitudeSamples(int var1, float var2) {
      this.ensureAltitudeSamplesIsMutable();
      this.altitudeSamples_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setCadenceOffline(int var1, Types$PbSensorOffline$Builder var2) {
      if (this.cadenceOfflineBuilder_ == null) {
         this.ensureCadenceOfflineIsMutable();
         this.cadenceOffline_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.cadenceOfflineBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setCadenceOffline(int var1, Types$PbSensorOffline var2) {
      if (this.cadenceOfflineBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureCadenceOfflineIsMutable();
         this.cadenceOffline_.set(var1, var2);
         this.onChanged();
      } else {
         this.cadenceOfflineBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setCadenceSamples(int var1, int var2) {
      this.ensureCadenceSamplesIsMutable();
      this.cadenceSamples_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setDistanceOffline(int var1, Types$PbSensorOffline$Builder var2) {
      if (this.distanceOfflineBuilder_ == null) {
         this.ensureDistanceOfflineIsMutable();
         this.distanceOffline_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.distanceOfflineBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setDistanceOffline(int var1, Types$PbSensorOffline var2) {
      if (this.distanceOfflineBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureDistanceOfflineIsMutable();
         this.distanceOffline_.set(var1, var2);
         this.onChanged();
      } else {
         this.distanceOfflineBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setDistanceSamples(int var1, float var2) {
      this.ensureDistanceSamplesIsMutable();
      this.distanceSamples_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setExerciseIntervalledSampleList(int var1, ExerciseSamples$PbExerciseIntervalledSampleList$Builder var2) {
      if (this.exerciseIntervalledSampleListBuilder_ == null) {
         this.ensureExerciseIntervalledSampleListIsMutable();
         this.exerciseIntervalledSampleList_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.exerciseIntervalledSampleListBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setExerciseIntervalledSampleList(int var1, ExerciseSamples$PbExerciseIntervalledSampleList var2) {
      if (this.exerciseIntervalledSampleListBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureExerciseIntervalledSampleListIsMutable();
         this.exerciseIntervalledSampleList_.set(var1, var2);
         this.onChanged();
      } else {
         this.exerciseIntervalledSampleListBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseSamples$PbExerciseSamples$Builder)super.setField(var1, var2);
   }

   public ExerciseSamples$PbExerciseSamples$Builder setForwardAcceleration(int var1, float var2) {
      this.ensureForwardAccelerationIsMutable();
      this.forwardAcceleration_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setForwardAccelerationOffline(int var1, Types$PbSensorOffline$Builder var2) {
      if (this.forwardAccelerationOfflineBuilder_ == null) {
         this.ensureForwardAccelerationOfflineIsMutable();
         this.forwardAccelerationOffline_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.forwardAccelerationOfflineBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setForwardAccelerationOffline(int var1, Types$PbSensorOffline var2) {
      if (this.forwardAccelerationOfflineBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureForwardAccelerationOfflineIsMutable();
         this.forwardAccelerationOffline_.set(var1, var2);
         this.onChanged();
      } else {
         this.forwardAccelerationOfflineBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setHeartRateOffline(int var1, Types$PbSensorOffline$Builder var2) {
      if (this.heartRateOfflineBuilder_ == null) {
         this.ensureHeartRateOfflineIsMutable();
         this.heartRateOffline_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.heartRateOfflineBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setHeartRateOffline(int var1, Types$PbSensorOffline var2) {
      if (this.heartRateOfflineBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureHeartRateOfflineIsMutable();
         this.heartRateOffline_.set(var1, var2);
         this.onChanged();
      } else {
         this.heartRateOfflineBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setHeartRateSamples(int var1, int var2) {
      this.ensureHeartRateSamplesIsMutable();
      this.heartRateSamples_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setLeftPedalPowerOffline(int var1, Types$PbSensorOffline$Builder var2) {
      if (this.leftPedalPowerOfflineBuilder_ == null) {
         this.ensureLeftPedalPowerOfflineIsMutable();
         this.leftPedalPowerOffline_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.leftPedalPowerOfflineBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setLeftPedalPowerOffline(int var1, Types$PbSensorOffline var2) {
      if (this.leftPedalPowerOfflineBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureLeftPedalPowerOfflineIsMutable();
         this.leftPedalPowerOffline_.set(var1, var2);
         this.onChanged();
      } else {
         this.leftPedalPowerOfflineBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setLeftPedalPowerSamples(int var1, ExerciseSamples$PbPowerMeasurements$Builder var2) {
      if (this.leftPedalPowerSamplesBuilder_ == null) {
         this.ensureLeftPedalPowerSamplesIsMutable();
         this.leftPedalPowerSamples_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.leftPedalPowerSamplesBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setLeftPedalPowerSamples(int var1, ExerciseSamples$PbPowerMeasurements var2) {
      if (this.leftPedalPowerSamplesBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureLeftPedalPowerSamplesIsMutable();
         this.leftPedalPowerSamples_.set(var1, var2);
         this.onChanged();
      } else {
         this.leftPedalPowerSamplesBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setLeftPowerCalibration(int var1, ExerciseSamples$PbCalibrationValue$Builder var2) {
      if (this.leftPowerCalibrationBuilder_ == null) {
         this.ensureLeftPowerCalibrationIsMutable();
         this.leftPowerCalibration_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.leftPowerCalibrationBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setLeftPowerCalibration(int var1, ExerciseSamples$PbCalibrationValue var2) {
      if (this.leftPowerCalibrationBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureLeftPowerCalibrationIsMutable();
         this.leftPowerCalibration_.set(var1, var2);
         this.onChanged();
      } else {
         this.leftPowerCalibrationBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setMovingTypeOffline(int var1, Types$PbSensorOffline$Builder var2) {
      if (this.movingTypeOfflineBuilder_ == null) {
         this.ensureMovingTypeOfflineIsMutable();
         this.movingTypeOffline_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.movingTypeOfflineBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setMovingTypeOffline(int var1, Types$PbSensorOffline var2) {
      if (this.movingTypeOfflineBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureMovingTypeOfflineIsMutable();
         this.movingTypeOffline_.set(var1, var2);
         this.onChanged();
      } else {
         this.movingTypeOfflineBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setMovingTypeSamples(int var1, Types$PbMovingType var2) {
      if (var2 == null) {
         throw new NullPointerException();
      } else {
         this.ensureMovingTypeSamplesIsMutable();
         this.movingTypeSamples_.set(var1, var2.getNumber());
         this.onChanged();
         return this;
      }
   }

   public ExerciseSamples$PbExerciseSamples$Builder setPauseTimes(int var1, Structures$PbPauseTime$Builder var2) {
      if (this.pauseTimesBuilder_ == null) {
         this.ensurePauseTimesIsMutable();
         this.pauseTimes_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.pauseTimesBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setPauseTimes(int var1, Structures$PbPauseTime var2) {
      if (this.pauseTimesBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensurePauseTimesIsMutable();
         this.pauseTimes_.set(var1, var2);
         this.onChanged();
      } else {
         this.pauseTimesBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setRecordingInterval(Types$PbDuration$Builder var1) {
      if (this.recordingIntervalBuilder_ == null) {
         this.recordingInterval_ = var1.build();
         this.onChanged();
      } else {
         this.recordingIntervalBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setRecordingInterval(Types$PbDuration var1) {
      if (this.recordingIntervalBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.recordingInterval_ = var1;
         this.onChanged();
      } else {
         this.recordingIntervalBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseSamples$PbExerciseSamples$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public ExerciseSamples$PbExerciseSamples$Builder setRightPedalPowerOffline(int var1, Types$PbSensorOffline$Builder var2) {
      if (this.rightPedalPowerOfflineBuilder_ == null) {
         this.ensureRightPedalPowerOfflineIsMutable();
         this.rightPedalPowerOffline_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.rightPedalPowerOfflineBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setRightPedalPowerOffline(int var1, Types$PbSensorOffline var2) {
      if (this.rightPedalPowerOfflineBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureRightPedalPowerOfflineIsMutable();
         this.rightPedalPowerOffline_.set(var1, var2);
         this.onChanged();
      } else {
         this.rightPedalPowerOfflineBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setRightPedalPowerSamples(int var1, ExerciseSamples$PbPowerMeasurements$Builder var2) {
      if (this.rightPedalPowerSamplesBuilder_ == null) {
         this.ensureRightPedalPowerSamplesIsMutable();
         this.rightPedalPowerSamples_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.rightPedalPowerSamplesBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setRightPedalPowerSamples(int var1, ExerciseSamples$PbPowerMeasurements var2) {
      if (this.rightPedalPowerSamplesBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureRightPedalPowerSamplesIsMutable();
         this.rightPedalPowerSamples_.set(var1, var2);
         this.onChanged();
      } else {
         this.rightPedalPowerSamplesBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setRightPowerCalibration(int var1, ExerciseSamples$PbCalibrationValue$Builder var2) {
      if (this.rightPowerCalibrationBuilder_ == null) {
         this.ensureRightPowerCalibrationIsMutable();
         this.rightPowerCalibration_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.rightPowerCalibrationBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setRightPowerCalibration(int var1, ExerciseSamples$PbCalibrationValue var2) {
      if (this.rightPowerCalibrationBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureRightPowerCalibrationIsMutable();
         this.rightPowerCalibration_.set(var1, var2);
         this.onChanged();
      } else {
         this.rightPowerCalibrationBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setRrSamples(ExerciseRRSamples$PbExerciseRRIntervals$Builder var1) {
      if (this.rrSamplesBuilder_ == null) {
         this.rrSamples_ = var1.build();
         this.onChanged();
      } else {
         this.rrSamplesBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 134217728;
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setRrSamples(ExerciseRRSamples$PbExerciseRRIntervals var1) {
      if (this.rrSamplesBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.rrSamples_ = var1;
         this.onChanged();
      } else {
         this.rrSamplesBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 134217728;
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setSpeedOffline(int var1, Types$PbSensorOffline$Builder var2) {
      if (this.speedOfflineBuilder_ == null) {
         this.ensureSpeedOfflineIsMutable();
         this.speedOffline_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.speedOfflineBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setSpeedOffline(int var1, Types$PbSensorOffline var2) {
      if (this.speedOfflineBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureSpeedOfflineIsMutable();
         this.speedOffline_.set(var1, var2);
         this.onChanged();
      } else {
         this.speedOfflineBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setSpeedSamples(int var1, float var2) {
      this.ensureSpeedSamplesIsMutable();
      this.speedSamples_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setStrideCalibration(int var1, ExerciseSamples$PbCalibrationValue$Builder var2) {
      if (this.strideCalibrationBuilder_ == null) {
         this.ensureStrideCalibrationIsMutable();
         this.strideCalibration_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.strideCalibrationBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setStrideCalibration(int var1, ExerciseSamples$PbCalibrationValue var2) {
      if (this.strideCalibrationBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureStrideCalibrationIsMutable();
         this.strideCalibration_.set(var1, var2);
         this.onChanged();
      } else {
         this.strideCalibrationBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setStrideLengthOffline(int var1, Types$PbSensorOffline$Builder var2) {
      if (this.strideLengthOfflineBuilder_ == null) {
         this.ensureStrideLengthOfflineIsMutable();
         this.strideLengthOffline_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.strideLengthOfflineBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setStrideLengthOffline(int var1, Types$PbSensorOffline var2) {
      if (this.strideLengthOfflineBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureStrideLengthOfflineIsMutable();
         this.strideLengthOffline_.set(var1, var2);
         this.onChanged();
      } else {
         this.strideLengthOfflineBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setStrideLengthSamples(int var1, int var2) {
      this.ensureStrideLengthSamplesIsMutable();
      this.strideLengthSamples_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setTemperatureOffline(int var1, Types$PbSensorOffline$Builder var2) {
      if (this.temperatureOfflineBuilder_ == null) {
         this.ensureTemperatureOfflineIsMutable();
         this.temperatureOffline_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.temperatureOfflineBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setTemperatureOffline(int var1, Types$PbSensorOffline var2) {
      if (this.temperatureOfflineBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureTemperatureOfflineIsMutable();
         this.temperatureOffline_.set(var1, var2);
         this.onChanged();
      } else {
         this.temperatureOfflineBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseSamples$Builder setTemperatureSamples(int var1, float var2) {
      this.ensureTemperatureSamplesIsMutable();
      this.temperatureSamples_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public final ExerciseSamples$PbExerciseSamples$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseSamples$PbExerciseSamples$Builder)super.setUnknownFields(var1);
   }
}
