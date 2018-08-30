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

public final class ExerciseSamples$PbExerciseIntervalledSampleList$Builder extends Builder implements ExerciseSamples$PbExerciseIntervalledSampleListOrBuilder {
   private List accelerationMadSamples_;
   private RepeatedFieldBuilderV3 altitudeCalibrationBuilder_;
   private List altitudeCalibration_;
   private List altitudeSamples_;
   private int bitField0_;
   private List cadenceSamples_;
   private List distanceSamples_;
   private List forwardAcceleration_;
   private List heartRateSamples_;
   private RepeatedFieldBuilderV3 leftPedalPowerSamplesBuilder_;
   private List leftPedalPowerSamples_;
   private RepeatedFieldBuilderV3 leftPowerCalibrationBuilder_;
   private List leftPowerCalibration_;
   private List movingTypeSamples_;
   private int recordingIntervalMs_;
   private RepeatedFieldBuilderV3 rightPedalPowerSamplesBuilder_;
   private List rightPedalPowerSamples_;
   private RepeatedFieldBuilderV3 rightPowerCalibrationBuilder_;
   private List rightPowerCalibration_;
   private SingleFieldBuilderV3 rrSamplesBuilder_;
   private ExerciseRRSamples$PbExerciseRRIntervals rrSamples_;
   private RepeatedFieldBuilderV3 sampleSourceBuilder_;
   private List sampleSource_;
   private int sampleType_;
   private List speedSamples_;
   private RepeatedFieldBuilderV3 strideCalibrationBuilder_;
   private List strideCalibration_;
   private List strideLengthSamples_;
   private List temperatureSamples_;

   private ExerciseSamples$PbExerciseIntervalledSampleList$Builder() {
      this.sampleType_ = 0;
      this.sampleSource_ = Collections.emptyList();
      this.heartRateSamples_ = Collections.emptyList();
      this.cadenceSamples_ = Collections.emptyList();
      this.speedSamples_ = Collections.emptyList();
      this.distanceSamples_ = Collections.emptyList();
      this.forwardAcceleration_ = Collections.emptyList();
      this.movingTypeSamples_ = Collections.emptyList();
      this.altitudeSamples_ = Collections.emptyList();
      this.altitudeCalibration_ = Collections.emptyList();
      this.temperatureSamples_ = Collections.emptyList();
      this.strideLengthSamples_ = Collections.emptyList();
      this.strideCalibration_ = Collections.emptyList();
      this.leftPedalPowerSamples_ = Collections.emptyList();
      this.rightPedalPowerSamples_ = Collections.emptyList();
      this.leftPowerCalibration_ = Collections.emptyList();
      this.rightPowerCalibration_ = Collections.emptyList();
      this.rrSamples_ = null;
      this.accelerationMadSamples_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   private ExerciseSamples$PbExerciseIntervalledSampleList$Builder(BuilderParent var1) {
      super(var1);
      this.sampleType_ = 0;
      this.sampleSource_ = Collections.emptyList();
      this.heartRateSamples_ = Collections.emptyList();
      this.cadenceSamples_ = Collections.emptyList();
      this.speedSamples_ = Collections.emptyList();
      this.distanceSamples_ = Collections.emptyList();
      this.forwardAcceleration_ = Collections.emptyList();
      this.movingTypeSamples_ = Collections.emptyList();
      this.altitudeSamples_ = Collections.emptyList();
      this.altitudeCalibration_ = Collections.emptyList();
      this.temperatureSamples_ = Collections.emptyList();
      this.strideLengthSamples_ = Collections.emptyList();
      this.strideCalibration_ = Collections.emptyList();
      this.leftPedalPowerSamples_ = Collections.emptyList();
      this.rightPedalPowerSamples_ = Collections.emptyList();
      this.leftPowerCalibration_ = Collections.emptyList();
      this.rightPowerCalibration_ = Collections.emptyList();
      this.rrSamples_ = null;
      this.accelerationMadSamples_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseSamples$PbExerciseIntervalledSampleList$Builder(BuilderParent var1, ExerciseSamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseSamples$PbExerciseIntervalledSampleList$Builder(ExerciseSamples$1 var1) {
      this();
   }

   private void ensureAccelerationMadSamplesIsMutable() {
      if ((this.bitField0_ & 524288) != 524288) {
         this.accelerationMadSamples_ = new ArrayList(this.accelerationMadSamples_);
         this.bitField0_ |= 524288;
      }

   }

   private void ensureAltitudeCalibrationIsMutable() {
      if ((this.bitField0_ & 1024) != 1024) {
         this.altitudeCalibration_ = new ArrayList(this.altitudeCalibration_);
         this.bitField0_ |= 1024;
      }

   }

   private void ensureAltitudeSamplesIsMutable() {
      if ((this.bitField0_ & 512) != 512) {
         this.altitudeSamples_ = new ArrayList(this.altitudeSamples_);
         this.bitField0_ |= 512;
      }

   }

   private void ensureCadenceSamplesIsMutable() {
      if ((this.bitField0_ & 16) != 16) {
         this.cadenceSamples_ = new ArrayList(this.cadenceSamples_);
         this.bitField0_ |= 16;
      }

   }

   private void ensureDistanceSamplesIsMutable() {
      if ((this.bitField0_ & 64) != 64) {
         this.distanceSamples_ = new ArrayList(this.distanceSamples_);
         this.bitField0_ |= 64;
      }

   }

   private void ensureForwardAccelerationIsMutable() {
      if ((this.bitField0_ & 128) != 128) {
         this.forwardAcceleration_ = new ArrayList(this.forwardAcceleration_);
         this.bitField0_ |= 128;
      }

   }

   private void ensureHeartRateSamplesIsMutable() {
      if ((this.bitField0_ & 8) != 8) {
         this.heartRateSamples_ = new ArrayList(this.heartRateSamples_);
         this.bitField0_ |= 8;
      }

   }

   private void ensureLeftPedalPowerSamplesIsMutable() {
      if ((this.bitField0_ & 16384) != 16384) {
         this.leftPedalPowerSamples_ = new ArrayList(this.leftPedalPowerSamples_);
         this.bitField0_ |= 16384;
      }

   }

   private void ensureLeftPowerCalibrationIsMutable() {
      if ((this.bitField0_ & 65536) != 65536) {
         this.leftPowerCalibration_ = new ArrayList(this.leftPowerCalibration_);
         this.bitField0_ |= 65536;
      }

   }

   private void ensureMovingTypeSamplesIsMutable() {
      if ((this.bitField0_ & 256) != 256) {
         this.movingTypeSamples_ = new ArrayList(this.movingTypeSamples_);
         this.bitField0_ |= 256;
      }

   }

   private void ensureRightPedalPowerSamplesIsMutable() {
      if ((this.bitField0_ & '耀') != 32768) {
         this.rightPedalPowerSamples_ = new ArrayList(this.rightPedalPowerSamples_);
         this.bitField0_ |= 32768;
      }

   }

   private void ensureRightPowerCalibrationIsMutable() {
      if ((this.bitField0_ & 131072) != 131072) {
         this.rightPowerCalibration_ = new ArrayList(this.rightPowerCalibration_);
         this.bitField0_ |= 131072;
      }

   }

   private void ensureSampleSourceIsMutable() {
      if ((this.bitField0_ & 4) != 4) {
         this.sampleSource_ = new ArrayList(this.sampleSource_);
         this.bitField0_ |= 4;
      }

   }

   private void ensureSpeedSamplesIsMutable() {
      if ((this.bitField0_ & 32) != 32) {
         this.speedSamples_ = new ArrayList(this.speedSamples_);
         this.bitField0_ |= 32;
      }

   }

   private void ensureStrideCalibrationIsMutable() {
      if ((this.bitField0_ & 8192) != 8192) {
         this.strideCalibration_ = new ArrayList(this.strideCalibration_);
         this.bitField0_ |= 8192;
      }

   }

   private void ensureStrideLengthSamplesIsMutable() {
      if ((this.bitField0_ & 4096) != 4096) {
         this.strideLengthSamples_ = new ArrayList(this.strideLengthSamples_);
         this.bitField0_ |= 4096;
      }

   }

   private void ensureTemperatureSamplesIsMutable() {
      if ((this.bitField0_ & 2048) != 2048) {
         this.temperatureSamples_ = new ArrayList(this.temperatureSamples_);
         this.bitField0_ |= 2048;
      }

   }

   private RepeatedFieldBuilderV3 getAltitudeCalibrationFieldBuilder() {
      if (this.altitudeCalibrationBuilder_ == null) {
         List var1 = this.altitudeCalibration_;
         boolean var2;
         if ((this.bitField0_ & 1024) == 1024) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.altitudeCalibrationBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.altitudeCalibration_ = null;
      }

      return this.altitudeCalibrationBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseSamples.e();
   }

   private RepeatedFieldBuilderV3 getLeftPedalPowerSamplesFieldBuilder() {
      if (this.leftPedalPowerSamplesBuilder_ == null) {
         List var1 = this.leftPedalPowerSamples_;
         boolean var2;
         if ((this.bitField0_ & 16384) == 16384) {
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
         if ((this.bitField0_ & 65536) == 65536) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.leftPowerCalibrationBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.leftPowerCalibration_ = null;
      }

      return this.leftPowerCalibrationBuilder_;
   }

   private RepeatedFieldBuilderV3 getRightPedalPowerSamplesFieldBuilder() {
      if (this.rightPedalPowerSamplesBuilder_ == null) {
         List var1 = this.rightPedalPowerSamples_;
         boolean var2;
         if ((this.bitField0_ & '耀') == 32768) {
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
         if ((this.bitField0_ & 131072) == 131072) {
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

   private RepeatedFieldBuilderV3 getSampleSourceFieldBuilder() {
      if (this.sampleSourceBuilder_ == null) {
         List var1 = this.sampleSource_;
         boolean var2;
         if ((this.bitField0_ & 4) == 4) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.sampleSourceBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.sampleSource_ = null;
      }

      return this.sampleSourceBuilder_;
   }

   private RepeatedFieldBuilderV3 getStrideCalibrationFieldBuilder() {
      if (this.strideCalibrationBuilder_ == null) {
         List var1 = this.strideCalibration_;
         boolean var2;
         if ((this.bitField0_ & 8192) == 8192) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.strideCalibrationBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.strideCalibration_ = null;
      }

      return this.strideCalibrationBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseSamples$PbExerciseIntervalledSampleList.b()) {
         this.getSampleSourceFieldBuilder();
         this.getAltitudeCalibrationFieldBuilder();
         this.getStrideCalibrationFieldBuilder();
         this.getLeftPedalPowerSamplesFieldBuilder();
         this.getRightPedalPowerSamplesFieldBuilder();
         this.getLeftPowerCalibrationFieldBuilder();
         this.getRightPowerCalibrationFieldBuilder();
         this.getRrSamplesFieldBuilder();
      }

   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addAccelerationMadSamples(float var1) {
      this.ensureAccelerationMadSamplesIsMutable();
      this.accelerationMadSamples_.add(var1);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addAllAccelerationMadSamples(Iterable var1) {
      this.ensureAccelerationMadSamplesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.accelerationMadSamples_);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addAllAltitudeCalibration(Iterable var1) {
      if (this.altitudeCalibrationBuilder_ == null) {
         this.ensureAltitudeCalibrationIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.altitudeCalibration_);
         this.onChanged();
      } else {
         this.altitudeCalibrationBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addAllAltitudeSamples(Iterable var1) {
      this.ensureAltitudeSamplesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.altitudeSamples_);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addAllCadenceSamples(Iterable var1) {
      this.ensureCadenceSamplesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.cadenceSamples_);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addAllDistanceSamples(Iterable var1) {
      this.ensureDistanceSamplesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.distanceSamples_);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addAllForwardAcceleration(Iterable var1) {
      this.ensureForwardAccelerationIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.forwardAcceleration_);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addAllHeartRateSamples(Iterable var1) {
      this.ensureHeartRateSamplesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.heartRateSamples_);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addAllLeftPedalPowerSamples(Iterable var1) {
      if (this.leftPedalPowerSamplesBuilder_ == null) {
         this.ensureLeftPedalPowerSamplesIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.leftPedalPowerSamples_);
         this.onChanged();
      } else {
         this.leftPedalPowerSamplesBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addAllLeftPowerCalibration(Iterable var1) {
      if (this.leftPowerCalibrationBuilder_ == null) {
         this.ensureLeftPowerCalibrationIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.leftPowerCalibration_);
         this.onChanged();
      } else {
         this.leftPowerCalibrationBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addAllMovingTypeSamples(Iterable var1) {
      this.ensureMovingTypeSamplesIsMutable();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         Types$PbMovingType var2 = (Types$PbMovingType)var3.next();
         this.movingTypeSamples_.add(var2.getNumber());
      }

      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addAllRightPedalPowerSamples(Iterable var1) {
      if (this.rightPedalPowerSamplesBuilder_ == null) {
         this.ensureRightPedalPowerSamplesIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.rightPedalPowerSamples_);
         this.onChanged();
      } else {
         this.rightPedalPowerSamplesBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addAllRightPowerCalibration(Iterable var1) {
      if (this.rightPowerCalibrationBuilder_ == null) {
         this.ensureRightPowerCalibrationIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.rightPowerCalibration_);
         this.onChanged();
      } else {
         this.rightPowerCalibrationBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addAllSampleSource(Iterable var1) {
      if (this.sampleSourceBuilder_ == null) {
         this.ensureSampleSourceIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.sampleSource_);
         this.onChanged();
      } else {
         this.sampleSourceBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addAllSpeedSamples(Iterable var1) {
      this.ensureSpeedSamplesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.speedSamples_);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addAllStrideCalibration(Iterable var1) {
      if (this.strideCalibrationBuilder_ == null) {
         this.ensureStrideCalibrationIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.strideCalibration_);
         this.onChanged();
      } else {
         this.strideCalibrationBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addAllStrideLengthSamples(Iterable var1) {
      this.ensureStrideLengthSamplesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.strideLengthSamples_);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addAllTemperatureSamples(Iterable var1) {
      this.ensureTemperatureSamplesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.temperatureSamples_);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addAltitudeCalibration(int var1, ExerciseSamples$PbCalibrationValue$Builder var2) {
      if (this.altitudeCalibrationBuilder_ == null) {
         this.ensureAltitudeCalibrationIsMutable();
         this.altitudeCalibration_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.altitudeCalibrationBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addAltitudeCalibration(int var1, ExerciseSamples$PbCalibrationValue var2) {
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

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addAltitudeCalibration(ExerciseSamples$PbCalibrationValue$Builder var1) {
      if (this.altitudeCalibrationBuilder_ == null) {
         this.ensureAltitudeCalibrationIsMutable();
         this.altitudeCalibration_.add(var1.build());
         this.onChanged();
      } else {
         this.altitudeCalibrationBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addAltitudeCalibration(ExerciseSamples$PbCalibrationValue var1) {
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

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addAltitudeSamples(float var1) {
      this.ensureAltitudeSamplesIsMutable();
      this.altitudeSamples_.add(var1);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addCadenceSamples(int var1) {
      this.ensureCadenceSamplesIsMutable();
      this.cadenceSamples_.add(var1);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addDistanceSamples(float var1) {
      this.ensureDistanceSamplesIsMutable();
      this.distanceSamples_.add(var1);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addForwardAcceleration(float var1) {
      this.ensureForwardAccelerationIsMutable();
      this.forwardAcceleration_.add(var1);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addHeartRateSamples(int var1) {
      this.ensureHeartRateSamplesIsMutable();
      this.heartRateSamples_.add(var1);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addLeftPedalPowerSamples(int var1, ExerciseSamples$PbPowerMeasurements$Builder var2) {
      if (this.leftPedalPowerSamplesBuilder_ == null) {
         this.ensureLeftPedalPowerSamplesIsMutable();
         this.leftPedalPowerSamples_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.leftPedalPowerSamplesBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addLeftPedalPowerSamples(int var1, ExerciseSamples$PbPowerMeasurements var2) {
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

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addLeftPedalPowerSamples(ExerciseSamples$PbPowerMeasurements$Builder var1) {
      if (this.leftPedalPowerSamplesBuilder_ == null) {
         this.ensureLeftPedalPowerSamplesIsMutable();
         this.leftPedalPowerSamples_.add(var1.build());
         this.onChanged();
      } else {
         this.leftPedalPowerSamplesBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addLeftPedalPowerSamples(ExerciseSamples$PbPowerMeasurements var1) {
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

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addLeftPowerCalibration(int var1, ExerciseSamples$PbCalibrationValue$Builder var2) {
      if (this.leftPowerCalibrationBuilder_ == null) {
         this.ensureLeftPowerCalibrationIsMutable();
         this.leftPowerCalibration_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.leftPowerCalibrationBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addLeftPowerCalibration(int var1, ExerciseSamples$PbCalibrationValue var2) {
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

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addLeftPowerCalibration(ExerciseSamples$PbCalibrationValue$Builder var1) {
      if (this.leftPowerCalibrationBuilder_ == null) {
         this.ensureLeftPowerCalibrationIsMutable();
         this.leftPowerCalibration_.add(var1.build());
         this.onChanged();
      } else {
         this.leftPowerCalibrationBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addLeftPowerCalibration(ExerciseSamples$PbCalibrationValue var1) {
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

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addMovingTypeSamples(Types$PbMovingType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.ensureMovingTypeSamplesIsMutable();
         this.movingTypeSamples_.add(var1.getNumber());
         this.onChanged();
         return this;
      }
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseSamples$PbExerciseIntervalledSampleList$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addRightPedalPowerSamples(int var1, ExerciseSamples$PbPowerMeasurements$Builder var2) {
      if (this.rightPedalPowerSamplesBuilder_ == null) {
         this.ensureRightPedalPowerSamplesIsMutable();
         this.rightPedalPowerSamples_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.rightPedalPowerSamplesBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addRightPedalPowerSamples(int var1, ExerciseSamples$PbPowerMeasurements var2) {
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

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addRightPedalPowerSamples(ExerciseSamples$PbPowerMeasurements$Builder var1) {
      if (this.rightPedalPowerSamplesBuilder_ == null) {
         this.ensureRightPedalPowerSamplesIsMutable();
         this.rightPedalPowerSamples_.add(var1.build());
         this.onChanged();
      } else {
         this.rightPedalPowerSamplesBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addRightPedalPowerSamples(ExerciseSamples$PbPowerMeasurements var1) {
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

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addRightPowerCalibration(int var1, ExerciseSamples$PbCalibrationValue$Builder var2) {
      if (this.rightPowerCalibrationBuilder_ == null) {
         this.ensureRightPowerCalibrationIsMutable();
         this.rightPowerCalibration_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.rightPowerCalibrationBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addRightPowerCalibration(int var1, ExerciseSamples$PbCalibrationValue var2) {
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

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addRightPowerCalibration(ExerciseSamples$PbCalibrationValue$Builder var1) {
      if (this.rightPowerCalibrationBuilder_ == null) {
         this.ensureRightPowerCalibrationIsMutable();
         this.rightPowerCalibration_.add(var1.build());
         this.onChanged();
      } else {
         this.rightPowerCalibrationBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addRightPowerCalibration(ExerciseSamples$PbCalibrationValue var1) {
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

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addSampleSource(int var1, Types$PbSampleSource$Builder var2) {
      if (this.sampleSourceBuilder_ == null) {
         this.ensureSampleSourceIsMutable();
         this.sampleSource_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.sampleSourceBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addSampleSource(int var1, Types$PbSampleSource var2) {
      if (this.sampleSourceBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureSampleSourceIsMutable();
         this.sampleSource_.add(var1, var2);
         this.onChanged();
      } else {
         this.sampleSourceBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addSampleSource(Types$PbSampleSource$Builder var1) {
      if (this.sampleSourceBuilder_ == null) {
         this.ensureSampleSourceIsMutable();
         this.sampleSource_.add(var1.build());
         this.onChanged();
      } else {
         this.sampleSourceBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addSampleSource(Types$PbSampleSource var1) {
      if (this.sampleSourceBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureSampleSourceIsMutable();
         this.sampleSource_.add(var1);
         this.onChanged();
      } else {
         this.sampleSourceBuilder_.addMessage(var1);
      }

      return this;
   }

   public Types$PbSampleSource$Builder addSampleSourceBuilder() {
      return (Types$PbSampleSource$Builder)this.getSampleSourceFieldBuilder().addBuilder(Types$PbSampleSource.getDefaultInstance());
   }

   public Types$PbSampleSource$Builder addSampleSourceBuilder(int var1) {
      return (Types$PbSampleSource$Builder)this.getSampleSourceFieldBuilder().addBuilder(var1, Types$PbSampleSource.getDefaultInstance());
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addSpeedSamples(float var1) {
      this.ensureSpeedSamplesIsMutable();
      this.speedSamples_.add(var1);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addStrideCalibration(int var1, ExerciseSamples$PbCalibrationValue$Builder var2) {
      if (this.strideCalibrationBuilder_ == null) {
         this.ensureStrideCalibrationIsMutable();
         this.strideCalibration_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.strideCalibrationBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addStrideCalibration(int var1, ExerciseSamples$PbCalibrationValue var2) {
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

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addStrideCalibration(ExerciseSamples$PbCalibrationValue$Builder var1) {
      if (this.strideCalibrationBuilder_ == null) {
         this.ensureStrideCalibrationIsMutable();
         this.strideCalibration_.add(var1.build());
         this.onChanged();
      } else {
         this.strideCalibrationBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addStrideCalibration(ExerciseSamples$PbCalibrationValue var1) {
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

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addStrideLengthSamples(int var1) {
      this.ensureStrideLengthSamplesIsMutable();
      this.strideLengthSamples_.add(var1);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder addTemperatureSamples(float var1) {
      this.ensureTemperatureSamplesIsMutable();
      this.temperatureSamples_.add(var1);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList build() {
      ExerciseSamples$PbExerciseIntervalledSampleList var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList buildPartial() {
      byte var1 = 1;
      ExerciseSamples$PbExerciseIntervalledSampleList var2 = new ExerciseSamples$PbExerciseIntervalledSampleList(this, (ExerciseSamples$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ExerciseSamples$PbExerciseIntervalledSampleList.a(var2, this.sampleType_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      ExerciseSamples$PbExerciseIntervalledSampleList.b(var2, this.recordingIntervalMs_);
      if (this.sampleSourceBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4) {
            this.sampleSource_ = Collections.unmodifiableList(this.sampleSource_);
            this.bitField0_ &= -5;
         }

         ExerciseSamples$PbExerciseIntervalledSampleList.a(var2, this.sampleSource_);
      } else {
         ExerciseSamples$PbExerciseIntervalledSampleList.a(var2, this.sampleSourceBuilder_.build());
      }

      if ((this.bitField0_ & 8) == 8) {
         this.heartRateSamples_ = Collections.unmodifiableList(this.heartRateSamples_);
         this.bitField0_ &= -9;
      }

      ExerciseSamples$PbExerciseIntervalledSampleList.b(var2, this.heartRateSamples_);
      if ((this.bitField0_ & 16) == 16) {
         this.cadenceSamples_ = Collections.unmodifiableList(this.cadenceSamples_);
         this.bitField0_ &= -17;
      }

      ExerciseSamples$PbExerciseIntervalledSampleList.c(var2, this.cadenceSamples_);
      if ((this.bitField0_ & 32) == 32) {
         this.speedSamples_ = Collections.unmodifiableList(this.speedSamples_);
         this.bitField0_ &= -33;
      }

      ExerciseSamples$PbExerciseIntervalledSampleList.d(var2, this.speedSamples_);
      if ((this.bitField0_ & 64) == 64) {
         this.distanceSamples_ = Collections.unmodifiableList(this.distanceSamples_);
         this.bitField0_ &= -65;
      }

      ExerciseSamples$PbExerciseIntervalledSampleList.e(var2, this.distanceSamples_);
      if ((this.bitField0_ & 128) == 128) {
         this.forwardAcceleration_ = Collections.unmodifiableList(this.forwardAcceleration_);
         this.bitField0_ &= -129;
      }

      ExerciseSamples$PbExerciseIntervalledSampleList.f(var2, this.forwardAcceleration_);
      if ((this.bitField0_ & 256) == 256) {
         this.movingTypeSamples_ = Collections.unmodifiableList(this.movingTypeSamples_);
         this.bitField0_ &= -257;
      }

      ExerciseSamples$PbExerciseIntervalledSampleList.g(var2, this.movingTypeSamples_);
      if ((this.bitField0_ & 512) == 512) {
         this.altitudeSamples_ = Collections.unmodifiableList(this.altitudeSamples_);
         this.bitField0_ &= -513;
      }

      ExerciseSamples$PbExerciseIntervalledSampleList.h(var2, this.altitudeSamples_);
      if (this.altitudeCalibrationBuilder_ == null) {
         if ((this.bitField0_ & 1024) == 1024) {
            this.altitudeCalibration_ = Collections.unmodifiableList(this.altitudeCalibration_);
            this.bitField0_ &= -1025;
         }

         ExerciseSamples$PbExerciseIntervalledSampleList.i(var2, this.altitudeCalibration_);
      } else {
         ExerciseSamples$PbExerciseIntervalledSampleList.i(var2, this.altitudeCalibrationBuilder_.build());
      }

      if ((this.bitField0_ & 2048) == 2048) {
         this.temperatureSamples_ = Collections.unmodifiableList(this.temperatureSamples_);
         this.bitField0_ &= -2049;
      }

      ExerciseSamples$PbExerciseIntervalledSampleList.j(var2, this.temperatureSamples_);
      if ((this.bitField0_ & 4096) == 4096) {
         this.strideLengthSamples_ = Collections.unmodifiableList(this.strideLengthSamples_);
         this.bitField0_ &= -4097;
      }

      ExerciseSamples$PbExerciseIntervalledSampleList.k(var2, this.strideLengthSamples_);
      if (this.strideCalibrationBuilder_ == null) {
         if ((this.bitField0_ & 8192) == 8192) {
            this.strideCalibration_ = Collections.unmodifiableList(this.strideCalibration_);
            this.bitField0_ &= -8193;
         }

         ExerciseSamples$PbExerciseIntervalledSampleList.l(var2, this.strideCalibration_);
      } else {
         ExerciseSamples$PbExerciseIntervalledSampleList.l(var2, this.strideCalibrationBuilder_.build());
      }

      if (this.leftPedalPowerSamplesBuilder_ == null) {
         if ((this.bitField0_ & 16384) == 16384) {
            this.leftPedalPowerSamples_ = Collections.unmodifiableList(this.leftPedalPowerSamples_);
            this.bitField0_ &= -16385;
         }

         ExerciseSamples$PbExerciseIntervalledSampleList.m(var2, this.leftPedalPowerSamples_);
      } else {
         ExerciseSamples$PbExerciseIntervalledSampleList.m(var2, this.leftPedalPowerSamplesBuilder_.build());
      }

      if (this.rightPedalPowerSamplesBuilder_ == null) {
         if ((this.bitField0_ & '耀') == 32768) {
            this.rightPedalPowerSamples_ = Collections.unmodifiableList(this.rightPedalPowerSamples_);
            this.bitField0_ &= -32769;
         }

         ExerciseSamples$PbExerciseIntervalledSampleList.n(var2, this.rightPedalPowerSamples_);
      } else {
         ExerciseSamples$PbExerciseIntervalledSampleList.n(var2, this.rightPedalPowerSamplesBuilder_.build());
      }

      if (this.leftPowerCalibrationBuilder_ == null) {
         if ((this.bitField0_ & 65536) == 65536) {
            this.leftPowerCalibration_ = Collections.unmodifiableList(this.leftPowerCalibration_);
            this.bitField0_ &= -65537;
         }

         ExerciseSamples$PbExerciseIntervalledSampleList.o(var2, this.leftPowerCalibration_);
      } else {
         ExerciseSamples$PbExerciseIntervalledSampleList.o(var2, this.leftPowerCalibrationBuilder_.build());
      }

      if (this.rightPowerCalibrationBuilder_ == null) {
         if ((this.bitField0_ & 131072) == 131072) {
            this.rightPowerCalibration_ = Collections.unmodifiableList(this.rightPowerCalibration_);
            this.bitField0_ &= -131073;
         }

         ExerciseSamples$PbExerciseIntervalledSampleList.p(var2, this.rightPowerCalibration_);
      } else {
         ExerciseSamples$PbExerciseIntervalledSampleList.p(var2, this.rightPowerCalibrationBuilder_.build());
      }

      if ((var3 & 262144) == 262144) {
         var4 |= 4;
      }

      if (this.rrSamplesBuilder_ == null) {
         ExerciseSamples$PbExerciseIntervalledSampleList.a(var2, this.rrSamples_);
      } else {
         ExerciseSamples$PbExerciseIntervalledSampleList.a(var2, (ExerciseRRSamples$PbExerciseRRIntervals)this.rrSamplesBuilder_.build());
      }

      if ((this.bitField0_ & 524288) == 524288) {
         this.accelerationMadSamples_ = Collections.unmodifiableList(this.accelerationMadSamples_);
         this.bitField0_ &= -524289;
      }

      ExerciseSamples$PbExerciseIntervalledSampleList.q(var2, this.accelerationMadSamples_);
      ExerciseSamples$PbExerciseIntervalledSampleList.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder clear() {
      super.clear();
      this.sampleType_ = 0;
      this.bitField0_ &= -2;
      this.recordingIntervalMs_ = 0;
      this.bitField0_ &= -3;
      if (this.sampleSourceBuilder_ == null) {
         this.sampleSource_ = Collections.emptyList();
         this.bitField0_ &= -5;
      } else {
         this.sampleSourceBuilder_.clear();
      }

      this.heartRateSamples_ = Collections.emptyList();
      this.bitField0_ &= -9;
      this.cadenceSamples_ = Collections.emptyList();
      this.bitField0_ &= -17;
      this.speedSamples_ = Collections.emptyList();
      this.bitField0_ &= -33;
      this.distanceSamples_ = Collections.emptyList();
      this.bitField0_ &= -65;
      this.forwardAcceleration_ = Collections.emptyList();
      this.bitField0_ &= -129;
      this.movingTypeSamples_ = Collections.emptyList();
      this.bitField0_ &= -257;
      this.altitudeSamples_ = Collections.emptyList();
      this.bitField0_ &= -513;
      if (this.altitudeCalibrationBuilder_ == null) {
         this.altitudeCalibration_ = Collections.emptyList();
         this.bitField0_ &= -1025;
      } else {
         this.altitudeCalibrationBuilder_.clear();
      }

      this.temperatureSamples_ = Collections.emptyList();
      this.bitField0_ &= -2049;
      this.strideLengthSamples_ = Collections.emptyList();
      this.bitField0_ &= -4097;
      if (this.strideCalibrationBuilder_ == null) {
         this.strideCalibration_ = Collections.emptyList();
         this.bitField0_ &= -8193;
      } else {
         this.strideCalibrationBuilder_.clear();
      }

      if (this.leftPedalPowerSamplesBuilder_ == null) {
         this.leftPedalPowerSamples_ = Collections.emptyList();
         this.bitField0_ &= -16385;
      } else {
         this.leftPedalPowerSamplesBuilder_.clear();
      }

      if (this.rightPedalPowerSamplesBuilder_ == null) {
         this.rightPedalPowerSamples_ = Collections.emptyList();
         this.bitField0_ &= -32769;
      } else {
         this.rightPedalPowerSamplesBuilder_.clear();
      }

      if (this.leftPowerCalibrationBuilder_ == null) {
         this.leftPowerCalibration_ = Collections.emptyList();
         this.bitField0_ &= -65537;
      } else {
         this.leftPowerCalibrationBuilder_.clear();
      }

      if (this.rightPowerCalibrationBuilder_ == null) {
         this.rightPowerCalibration_ = Collections.emptyList();
         this.bitField0_ &= -131073;
      } else {
         this.rightPowerCalibrationBuilder_.clear();
      }

      if (this.rrSamplesBuilder_ == null) {
         this.rrSamples_ = null;
      } else {
         this.rrSamplesBuilder_.clear();
      }

      this.bitField0_ &= -262145;
      this.accelerationMadSamples_ = Collections.emptyList();
      this.bitField0_ &= -524289;
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder clearAccelerationMadSamples() {
      this.accelerationMadSamples_ = Collections.emptyList();
      this.bitField0_ &= -524289;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder clearAltitudeCalibration() {
      if (this.altitudeCalibrationBuilder_ == null) {
         this.altitudeCalibration_ = Collections.emptyList();
         this.bitField0_ &= -1025;
         this.onChanged();
      } else {
         this.altitudeCalibrationBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder clearAltitudeSamples() {
      this.altitudeSamples_ = Collections.emptyList();
      this.bitField0_ &= -513;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder clearCadenceSamples() {
      this.cadenceSamples_ = Collections.emptyList();
      this.bitField0_ &= -17;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder clearDistanceSamples() {
      this.distanceSamples_ = Collections.emptyList();
      this.bitField0_ &= -65;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder clearField(FieldDescriptor var1) {
      return (ExerciseSamples$PbExerciseIntervalledSampleList$Builder)super.clearField(var1);
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder clearForwardAcceleration() {
      this.forwardAcceleration_ = Collections.emptyList();
      this.bitField0_ &= -129;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder clearHeartRateSamples() {
      this.heartRateSamples_ = Collections.emptyList();
      this.bitField0_ &= -9;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder clearLeftPedalPowerSamples() {
      if (this.leftPedalPowerSamplesBuilder_ == null) {
         this.leftPedalPowerSamples_ = Collections.emptyList();
         this.bitField0_ &= -16385;
         this.onChanged();
      } else {
         this.leftPedalPowerSamplesBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder clearLeftPowerCalibration() {
      if (this.leftPowerCalibrationBuilder_ == null) {
         this.leftPowerCalibration_ = Collections.emptyList();
         this.bitField0_ &= -65537;
         this.onChanged();
      } else {
         this.leftPowerCalibrationBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder clearMovingTypeSamples() {
      this.movingTypeSamples_ = Collections.emptyList();
      this.bitField0_ &= -257;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseSamples$PbExerciseIntervalledSampleList$Builder)super.clearOneof(var1);
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder clearRecordingIntervalMs() {
      this.bitField0_ &= -3;
      this.recordingIntervalMs_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder clearRightPedalPowerSamples() {
      if (this.rightPedalPowerSamplesBuilder_ == null) {
         this.rightPedalPowerSamples_ = Collections.emptyList();
         this.bitField0_ &= -32769;
         this.onChanged();
      } else {
         this.rightPedalPowerSamplesBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder clearRightPowerCalibration() {
      if (this.rightPowerCalibrationBuilder_ == null) {
         this.rightPowerCalibration_ = Collections.emptyList();
         this.bitField0_ &= -131073;
         this.onChanged();
      } else {
         this.rightPowerCalibrationBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder clearRrSamples() {
      if (this.rrSamplesBuilder_ == null) {
         this.rrSamples_ = null;
         this.onChanged();
      } else {
         this.rrSamplesBuilder_.clear();
      }

      this.bitField0_ &= -262145;
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder clearSampleSource() {
      if (this.sampleSourceBuilder_ == null) {
         this.sampleSource_ = Collections.emptyList();
         this.bitField0_ &= -5;
         this.onChanged();
      } else {
         this.sampleSourceBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder clearSampleType() {
      this.bitField0_ &= -2;
      this.sampleType_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder clearSpeedSamples() {
      this.speedSamples_ = Collections.emptyList();
      this.bitField0_ &= -33;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder clearStrideCalibration() {
      if (this.strideCalibrationBuilder_ == null) {
         this.strideCalibration_ = Collections.emptyList();
         this.bitField0_ &= -8193;
         this.onChanged();
      } else {
         this.strideCalibrationBuilder_.clear();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder clearStrideLengthSamples() {
      this.strideLengthSamples_ = Collections.emptyList();
      this.bitField0_ &= -4097;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder clearTemperatureSamples() {
      this.temperatureSamples_ = Collections.emptyList();
      this.bitField0_ &= -2049;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder clone() {
      return (ExerciseSamples$PbExerciseIntervalledSampleList$Builder)super.clone();
   }

   public float getAccelerationMadSamples(int var1) {
      return (Float)this.accelerationMadSamples_.get(var1);
   }

   public int getAccelerationMadSamplesCount() {
      return this.accelerationMadSamples_.size();
   }

   public List getAccelerationMadSamplesList() {
      return Collections.unmodifiableList(this.accelerationMadSamples_);
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

   public float getAltitudeSamples(int var1) {
      return (Float)this.altitudeSamples_.get(var1);
   }

   public int getAltitudeSamplesCount() {
      return this.altitudeSamples_.size();
   }

   public List getAltitudeSamplesList() {
      return Collections.unmodifiableList(this.altitudeSamples_);
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

   public ExerciseSamples$PbExerciseIntervalledSampleList getDefaultInstanceForType() {
      return ExerciseSamples$PbExerciseIntervalledSampleList.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseSamples.e();
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

   public float getForwardAcceleration(int var1) {
      return (Float)this.forwardAcceleration_.get(var1);
   }

   public int getForwardAccelerationCount() {
      return this.forwardAcceleration_.size();
   }

   public List getForwardAccelerationList() {
      return Collections.unmodifiableList(this.forwardAcceleration_);
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

   public Types$PbMovingType getMovingTypeSamples(int var1) {
      return (Types$PbMovingType)ExerciseSamples$PbExerciseIntervalledSampleList.j().convert(this.movingTypeSamples_.get(var1));
   }

   public int getMovingTypeSamplesCount() {
      return this.movingTypeSamples_.size();
   }

   public List getMovingTypeSamplesList() {
      return new ListAdapter(this.movingTypeSamples_, ExerciseSamples$PbExerciseIntervalledSampleList.j());
   }

   public int getRecordingIntervalMs() {
      return this.recordingIntervalMs_;
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
      this.bitField0_ |= 262144;
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

   public Types$PbSampleSource getSampleSource(int var1) {
      Types$PbSampleSource var2;
      if (this.sampleSourceBuilder_ == null) {
         var2 = (Types$PbSampleSource)this.sampleSource_.get(var1);
      } else {
         var2 = (Types$PbSampleSource)this.sampleSourceBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Types$PbSampleSource$Builder getSampleSourceBuilder(int var1) {
      return (Types$PbSampleSource$Builder)this.getSampleSourceFieldBuilder().getBuilder(var1);
   }

   public List getSampleSourceBuilderList() {
      return this.getSampleSourceFieldBuilder().getBuilderList();
   }

   public int getSampleSourceCount() {
      int var1;
      if (this.sampleSourceBuilder_ == null) {
         var1 = this.sampleSource_.size();
      } else {
         var1 = this.sampleSourceBuilder_.getCount();
      }

      return var1;
   }

   public List getSampleSourceList() {
      List var1;
      if (this.sampleSourceBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.sampleSource_);
      } else {
         var1 = this.sampleSourceBuilder_.getMessageList();
      }

      return var1;
   }

   public Types$PbSampleSourceOrBuilder getSampleSourceOrBuilder(int var1) {
      Types$PbSampleSourceOrBuilder var2;
      if (this.sampleSourceBuilder_ == null) {
         var2 = (Types$PbSampleSourceOrBuilder)this.sampleSource_.get(var1);
      } else {
         var2 = (Types$PbSampleSourceOrBuilder)this.sampleSourceBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getSampleSourceOrBuilderList() {
      List var1;
      if (this.sampleSourceBuilder_ != null) {
         var1 = this.sampleSourceBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.sampleSource_);
      }

      return var1;
   }

   public Types$PbSampleType getSampleType() {
      Types$PbSampleType var1 = Types$PbSampleType.valueOf(this.sampleType_);
      Types$PbSampleType var2 = var1;
      if (var1 == null) {
         var2 = Types$PbSampleType.SAMPLE_TYPE_UNDEFINED;
      }

      return var2;
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

   public int getStrideLengthSamples(int var1) {
      return (Integer)this.strideLengthSamples_.get(var1);
   }

   public int getStrideLengthSamplesCount() {
      return this.strideLengthSamples_.size();
   }

   public List getStrideLengthSamplesList() {
      return Collections.unmodifiableList(this.strideLengthSamples_);
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

   public boolean hasRecordingIntervalMs() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasRrSamples() {
      boolean var1;
      if ((this.bitField0_ & 262144) == 262144) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSampleType() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseSamples.f().ensureFieldAccessorsInitialized(ExerciseSamples$PbExerciseIntervalledSampleList.class, ExerciseSamples$PbExerciseIntervalledSampleList$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasSampleType()) {
         var2 = var1;
      } else {
         int var3 = 0;

         while(true) {
            if (var3 >= this.getSampleSourceCount()) {
               for(var3 = 0; var3 < this.getAltitudeCalibrationCount(); ++var3) {
                  var2 = var1;
                  if (!this.getAltitudeCalibration(var3).isInitialized()) {
                     return var2;
                  }
               }

               for(var3 = 0; var3 < this.getStrideCalibrationCount(); ++var3) {
                  var2 = var1;
                  if (!this.getStrideCalibration(var3).isInitialized()) {
                     return var2;
                  }
               }

               for(var3 = 0; var3 < this.getLeftPedalPowerSamplesCount(); ++var3) {
                  var2 = var1;
                  if (!this.getLeftPedalPowerSamples(var3).isInitialized()) {
                     return var2;
                  }
               }

               for(var3 = 0; var3 < this.getRightPedalPowerSamplesCount(); ++var3) {
                  var2 = var1;
                  if (!this.getRightPedalPowerSamples(var3).isInitialized()) {
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

               var2 = true;
               break;
            }

            var2 = var1;
            if (!this.getSampleSource(var3).isInitialized()) {
               break;
            }

            ++var3;
         }
      }

      return var2;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseSamples$PbExerciseIntervalledSampleList var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (ExerciseSamples$PbExerciseIntervalledSampleList)ExerciseSamples$PbExerciseIntervalledSampleList.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (ExerciseSamples$PbExerciseIntervalledSampleList)var10.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var13.unwrapIOException();
         } finally {
            if (var12 != null) {
               this.mergeFrom(var12);
            }

            throw var13;
         }
      }

      if (var12 != null) {
         this.mergeFrom(var12);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder mergeFrom(Message var1) {
      ExerciseSamples$PbExerciseIntervalledSampleList$Builder var2;
      if (var1 instanceof ExerciseSamples$PbExerciseIntervalledSampleList) {
         var2 = this.mergeFrom((ExerciseSamples$PbExerciseIntervalledSampleList)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder mergeFrom(ExerciseSamples$PbExerciseIntervalledSampleList var1) {
      Object var2 = null;
      if (var1 != ExerciseSamples$PbExerciseIntervalledSampleList.getDefaultInstance()) {
         if (var1.hasSampleType()) {
            this.setSampleType(var1.getSampleType());
         }

         if (var1.hasRecordingIntervalMs()) {
            this.setRecordingIntervalMs(var1.getRecordingIntervalMs());
         }

         RepeatedFieldBuilderV3 var3;
         if (this.sampleSourceBuilder_ == null) {
            if (!ExerciseSamples$PbExerciseIntervalledSampleList.a(var1).isEmpty()) {
               if (this.sampleSource_.isEmpty()) {
                  this.sampleSource_ = ExerciseSamples$PbExerciseIntervalledSampleList.a(var1);
                  this.bitField0_ &= -5;
               } else {
                  this.ensureSampleSourceIsMutable();
                  this.sampleSource_.addAll(ExerciseSamples$PbExerciseIntervalledSampleList.a(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSamples$PbExerciseIntervalledSampleList.a(var1).isEmpty()) {
            if (this.sampleSourceBuilder_.isEmpty()) {
               this.sampleSourceBuilder_.dispose();
               this.sampleSourceBuilder_ = null;
               this.sampleSource_ = ExerciseSamples$PbExerciseIntervalledSampleList.a(var1);
               this.bitField0_ &= -5;
               if (ExerciseSamples$PbExerciseIntervalledSampleList.c()) {
                  var3 = this.getSampleSourceFieldBuilder();
               } else {
                  var3 = null;
               }

               this.sampleSourceBuilder_ = var3;
            } else {
               this.sampleSourceBuilder_.addAllMessages(ExerciseSamples$PbExerciseIntervalledSampleList.a(var1));
            }
         }

         if (!ExerciseSamples$PbExerciseIntervalledSampleList.b(var1).isEmpty()) {
            if (this.heartRateSamples_.isEmpty()) {
               this.heartRateSamples_ = ExerciseSamples$PbExerciseIntervalledSampleList.b(var1);
               this.bitField0_ &= -9;
            } else {
               this.ensureHeartRateSamplesIsMutable();
               this.heartRateSamples_.addAll(ExerciseSamples$PbExerciseIntervalledSampleList.b(var1));
            }

            this.onChanged();
         }

         if (!ExerciseSamples$PbExerciseIntervalledSampleList.c(var1).isEmpty()) {
            if (this.cadenceSamples_.isEmpty()) {
               this.cadenceSamples_ = ExerciseSamples$PbExerciseIntervalledSampleList.c(var1);
               this.bitField0_ &= -17;
            } else {
               this.ensureCadenceSamplesIsMutable();
               this.cadenceSamples_.addAll(ExerciseSamples$PbExerciseIntervalledSampleList.c(var1));
            }

            this.onChanged();
         }

         if (!ExerciseSamples$PbExerciseIntervalledSampleList.d(var1).isEmpty()) {
            if (this.speedSamples_.isEmpty()) {
               this.speedSamples_ = ExerciseSamples$PbExerciseIntervalledSampleList.d(var1);
               this.bitField0_ &= -33;
            } else {
               this.ensureSpeedSamplesIsMutable();
               this.speedSamples_.addAll(ExerciseSamples$PbExerciseIntervalledSampleList.d(var1));
            }

            this.onChanged();
         }

         if (!ExerciseSamples$PbExerciseIntervalledSampleList.e(var1).isEmpty()) {
            if (this.distanceSamples_.isEmpty()) {
               this.distanceSamples_ = ExerciseSamples$PbExerciseIntervalledSampleList.e(var1);
               this.bitField0_ &= -65;
            } else {
               this.ensureDistanceSamplesIsMutable();
               this.distanceSamples_.addAll(ExerciseSamples$PbExerciseIntervalledSampleList.e(var1));
            }

            this.onChanged();
         }

         if (!ExerciseSamples$PbExerciseIntervalledSampleList.f(var1).isEmpty()) {
            if (this.forwardAcceleration_.isEmpty()) {
               this.forwardAcceleration_ = ExerciseSamples$PbExerciseIntervalledSampleList.f(var1);
               this.bitField0_ &= -129;
            } else {
               this.ensureForwardAccelerationIsMutable();
               this.forwardAcceleration_.addAll(ExerciseSamples$PbExerciseIntervalledSampleList.f(var1));
            }

            this.onChanged();
         }

         if (!ExerciseSamples$PbExerciseIntervalledSampleList.g(var1).isEmpty()) {
            if (this.movingTypeSamples_.isEmpty()) {
               this.movingTypeSamples_ = ExerciseSamples$PbExerciseIntervalledSampleList.g(var1);
               this.bitField0_ &= -257;
            } else {
               this.ensureMovingTypeSamplesIsMutable();
               this.movingTypeSamples_.addAll(ExerciseSamples$PbExerciseIntervalledSampleList.g(var1));
            }

            this.onChanged();
         }

         if (!ExerciseSamples$PbExerciseIntervalledSampleList.h(var1).isEmpty()) {
            if (this.altitudeSamples_.isEmpty()) {
               this.altitudeSamples_ = ExerciseSamples$PbExerciseIntervalledSampleList.h(var1);
               this.bitField0_ &= -513;
            } else {
               this.ensureAltitudeSamplesIsMutable();
               this.altitudeSamples_.addAll(ExerciseSamples$PbExerciseIntervalledSampleList.h(var1));
            }

            this.onChanged();
         }

         if (this.altitudeCalibrationBuilder_ == null) {
            if (!ExerciseSamples$PbExerciseIntervalledSampleList.i(var1).isEmpty()) {
               if (this.altitudeCalibration_.isEmpty()) {
                  this.altitudeCalibration_ = ExerciseSamples$PbExerciseIntervalledSampleList.i(var1);
                  this.bitField0_ &= -1025;
               } else {
                  this.ensureAltitudeCalibrationIsMutable();
                  this.altitudeCalibration_.addAll(ExerciseSamples$PbExerciseIntervalledSampleList.i(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSamples$PbExerciseIntervalledSampleList.i(var1).isEmpty()) {
            if (this.altitudeCalibrationBuilder_.isEmpty()) {
               this.altitudeCalibrationBuilder_.dispose();
               this.altitudeCalibrationBuilder_ = null;
               this.altitudeCalibration_ = ExerciseSamples$PbExerciseIntervalledSampleList.i(var1);
               this.bitField0_ &= -1025;
               if (ExerciseSamples$PbExerciseIntervalledSampleList.d()) {
                  var3 = this.getAltitudeCalibrationFieldBuilder();
               } else {
                  var3 = null;
               }

               this.altitudeCalibrationBuilder_ = var3;
            } else {
               this.altitudeCalibrationBuilder_.addAllMessages(ExerciseSamples$PbExerciseIntervalledSampleList.i(var1));
            }
         }

         if (!ExerciseSamples$PbExerciseIntervalledSampleList.j(var1).isEmpty()) {
            if (this.temperatureSamples_.isEmpty()) {
               this.temperatureSamples_ = ExerciseSamples$PbExerciseIntervalledSampleList.j(var1);
               this.bitField0_ &= -2049;
            } else {
               this.ensureTemperatureSamplesIsMutable();
               this.temperatureSamples_.addAll(ExerciseSamples$PbExerciseIntervalledSampleList.j(var1));
            }

            this.onChanged();
         }

         if (!ExerciseSamples$PbExerciseIntervalledSampleList.k(var1).isEmpty()) {
            if (this.strideLengthSamples_.isEmpty()) {
               this.strideLengthSamples_ = ExerciseSamples$PbExerciseIntervalledSampleList.k(var1);
               this.bitField0_ &= -4097;
            } else {
               this.ensureStrideLengthSamplesIsMutable();
               this.strideLengthSamples_.addAll(ExerciseSamples$PbExerciseIntervalledSampleList.k(var1));
            }

            this.onChanged();
         }

         if (this.strideCalibrationBuilder_ == null) {
            if (!ExerciseSamples$PbExerciseIntervalledSampleList.l(var1).isEmpty()) {
               if (this.strideCalibration_.isEmpty()) {
                  this.strideCalibration_ = ExerciseSamples$PbExerciseIntervalledSampleList.l(var1);
                  this.bitField0_ &= -8193;
               } else {
                  this.ensureStrideCalibrationIsMutable();
                  this.strideCalibration_.addAll(ExerciseSamples$PbExerciseIntervalledSampleList.l(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSamples$PbExerciseIntervalledSampleList.l(var1).isEmpty()) {
            if (this.strideCalibrationBuilder_.isEmpty()) {
               this.strideCalibrationBuilder_.dispose();
               this.strideCalibrationBuilder_ = null;
               this.strideCalibration_ = ExerciseSamples$PbExerciseIntervalledSampleList.l(var1);
               this.bitField0_ &= -8193;
               if (ExerciseSamples$PbExerciseIntervalledSampleList.e()) {
                  var3 = this.getStrideCalibrationFieldBuilder();
               } else {
                  var3 = null;
               }

               this.strideCalibrationBuilder_ = var3;
            } else {
               this.strideCalibrationBuilder_.addAllMessages(ExerciseSamples$PbExerciseIntervalledSampleList.l(var1));
            }
         }

         if (this.leftPedalPowerSamplesBuilder_ == null) {
            if (!ExerciseSamples$PbExerciseIntervalledSampleList.m(var1).isEmpty()) {
               if (this.leftPedalPowerSamples_.isEmpty()) {
                  this.leftPedalPowerSamples_ = ExerciseSamples$PbExerciseIntervalledSampleList.m(var1);
                  this.bitField0_ &= -16385;
               } else {
                  this.ensureLeftPedalPowerSamplesIsMutable();
                  this.leftPedalPowerSamples_.addAll(ExerciseSamples$PbExerciseIntervalledSampleList.m(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSamples$PbExerciseIntervalledSampleList.m(var1).isEmpty()) {
            if (this.leftPedalPowerSamplesBuilder_.isEmpty()) {
               this.leftPedalPowerSamplesBuilder_.dispose();
               this.leftPedalPowerSamplesBuilder_ = null;
               this.leftPedalPowerSamples_ = ExerciseSamples$PbExerciseIntervalledSampleList.m(var1);
               this.bitField0_ &= -16385;
               if (ExerciseSamples$PbExerciseIntervalledSampleList.f()) {
                  var3 = this.getLeftPedalPowerSamplesFieldBuilder();
               } else {
                  var3 = null;
               }

               this.leftPedalPowerSamplesBuilder_ = var3;
            } else {
               this.leftPedalPowerSamplesBuilder_.addAllMessages(ExerciseSamples$PbExerciseIntervalledSampleList.m(var1));
            }
         }

         if (this.rightPedalPowerSamplesBuilder_ == null) {
            if (!ExerciseSamples$PbExerciseIntervalledSampleList.n(var1).isEmpty()) {
               if (this.rightPedalPowerSamples_.isEmpty()) {
                  this.rightPedalPowerSamples_ = ExerciseSamples$PbExerciseIntervalledSampleList.n(var1);
                  this.bitField0_ &= -32769;
               } else {
                  this.ensureRightPedalPowerSamplesIsMutable();
                  this.rightPedalPowerSamples_.addAll(ExerciseSamples$PbExerciseIntervalledSampleList.n(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSamples$PbExerciseIntervalledSampleList.n(var1).isEmpty()) {
            if (this.rightPedalPowerSamplesBuilder_.isEmpty()) {
               this.rightPedalPowerSamplesBuilder_.dispose();
               this.rightPedalPowerSamplesBuilder_ = null;
               this.rightPedalPowerSamples_ = ExerciseSamples$PbExerciseIntervalledSampleList.n(var1);
               this.bitField0_ &= -32769;
               if (ExerciseSamples$PbExerciseIntervalledSampleList.g()) {
                  var3 = this.getRightPedalPowerSamplesFieldBuilder();
               } else {
                  var3 = null;
               }

               this.rightPedalPowerSamplesBuilder_ = var3;
            } else {
               this.rightPedalPowerSamplesBuilder_.addAllMessages(ExerciseSamples$PbExerciseIntervalledSampleList.n(var1));
            }
         }

         if (this.leftPowerCalibrationBuilder_ == null) {
            if (!ExerciseSamples$PbExerciseIntervalledSampleList.o(var1).isEmpty()) {
               if (this.leftPowerCalibration_.isEmpty()) {
                  this.leftPowerCalibration_ = ExerciseSamples$PbExerciseIntervalledSampleList.o(var1);
                  this.bitField0_ &= -65537;
               } else {
                  this.ensureLeftPowerCalibrationIsMutable();
                  this.leftPowerCalibration_.addAll(ExerciseSamples$PbExerciseIntervalledSampleList.o(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSamples$PbExerciseIntervalledSampleList.o(var1).isEmpty()) {
            if (this.leftPowerCalibrationBuilder_.isEmpty()) {
               this.leftPowerCalibrationBuilder_.dispose();
               this.leftPowerCalibrationBuilder_ = null;
               this.leftPowerCalibration_ = ExerciseSamples$PbExerciseIntervalledSampleList.o(var1);
               this.bitField0_ &= -65537;
               if (ExerciseSamples$PbExerciseIntervalledSampleList.h()) {
                  var3 = this.getLeftPowerCalibrationFieldBuilder();
               } else {
                  var3 = null;
               }

               this.leftPowerCalibrationBuilder_ = var3;
            } else {
               this.leftPowerCalibrationBuilder_.addAllMessages(ExerciseSamples$PbExerciseIntervalledSampleList.o(var1));
            }
         }

         if (this.rightPowerCalibrationBuilder_ == null) {
            if (!ExerciseSamples$PbExerciseIntervalledSampleList.p(var1).isEmpty()) {
               if (this.rightPowerCalibration_.isEmpty()) {
                  this.rightPowerCalibration_ = ExerciseSamples$PbExerciseIntervalledSampleList.p(var1);
                  this.bitField0_ &= -131073;
               } else {
                  this.ensureRightPowerCalibrationIsMutable();
                  this.rightPowerCalibration_.addAll(ExerciseSamples$PbExerciseIntervalledSampleList.p(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseSamples$PbExerciseIntervalledSampleList.p(var1).isEmpty()) {
            if (this.rightPowerCalibrationBuilder_.isEmpty()) {
               this.rightPowerCalibrationBuilder_.dispose();
               this.rightPowerCalibrationBuilder_ = null;
               this.rightPowerCalibration_ = ExerciseSamples$PbExerciseIntervalledSampleList.p(var1);
               this.bitField0_ &= -131073;
               var3 = (RepeatedFieldBuilderV3)var2;
               if (ExerciseSamples$PbExerciseIntervalledSampleList.i()) {
                  var3 = this.getRightPowerCalibrationFieldBuilder();
               }

               this.rightPowerCalibrationBuilder_ = var3;
            } else {
               this.rightPowerCalibrationBuilder_.addAllMessages(ExerciseSamples$PbExerciseIntervalledSampleList.p(var1));
            }
         }

         if (var1.hasRrSamples()) {
            this.mergeRrSamples(var1.getRrSamples());
         }

         if (!ExerciseSamples$PbExerciseIntervalledSampleList.q(var1).isEmpty()) {
            if (this.accelerationMadSamples_.isEmpty()) {
               this.accelerationMadSamples_ = ExerciseSamples$PbExerciseIntervalledSampleList.q(var1);
               this.bitField0_ &= -524289;
            } else {
               this.ensureAccelerationMadSamplesIsMutable();
               this.accelerationMadSamples_.addAll(ExerciseSamples$PbExerciseIntervalledSampleList.q(var1));
            }

            this.onChanged();
         }

         this.mergeUnknownFields(ExerciseSamples$PbExerciseIntervalledSampleList.r(var1));
         this.onChanged();
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder mergeRrSamples(ExerciseRRSamples$PbExerciseRRIntervals var1) {
      if (this.rrSamplesBuilder_ == null) {
         if ((this.bitField0_ & 262144) == 262144 && this.rrSamples_ != null && this.rrSamples_ != ExerciseRRSamples$PbExerciseRRIntervals.getDefaultInstance()) {
            this.rrSamples_ = ExerciseRRSamples$PbExerciseRRIntervals.newBuilder(this.rrSamples_).mergeFrom(var1).buildPartial();
         } else {
            this.rrSamples_ = var1;
         }

         this.onChanged();
      } else {
         this.rrSamplesBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 262144;
      return this;
   }

   public final ExerciseSamples$PbExerciseIntervalledSampleList$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseSamples$PbExerciseIntervalledSampleList$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder removeAltitudeCalibration(int var1) {
      if (this.altitudeCalibrationBuilder_ == null) {
         this.ensureAltitudeCalibrationIsMutable();
         this.altitudeCalibration_.remove(var1);
         this.onChanged();
      } else {
         this.altitudeCalibrationBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder removeLeftPedalPowerSamples(int var1) {
      if (this.leftPedalPowerSamplesBuilder_ == null) {
         this.ensureLeftPedalPowerSamplesIsMutable();
         this.leftPedalPowerSamples_.remove(var1);
         this.onChanged();
      } else {
         this.leftPedalPowerSamplesBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder removeLeftPowerCalibration(int var1) {
      if (this.leftPowerCalibrationBuilder_ == null) {
         this.ensureLeftPowerCalibrationIsMutable();
         this.leftPowerCalibration_.remove(var1);
         this.onChanged();
      } else {
         this.leftPowerCalibrationBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder removeRightPedalPowerSamples(int var1) {
      if (this.rightPedalPowerSamplesBuilder_ == null) {
         this.ensureRightPedalPowerSamplesIsMutable();
         this.rightPedalPowerSamples_.remove(var1);
         this.onChanged();
      } else {
         this.rightPedalPowerSamplesBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder removeRightPowerCalibration(int var1) {
      if (this.rightPowerCalibrationBuilder_ == null) {
         this.ensureRightPowerCalibrationIsMutable();
         this.rightPowerCalibration_.remove(var1);
         this.onChanged();
      } else {
         this.rightPowerCalibrationBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder removeSampleSource(int var1) {
      if (this.sampleSourceBuilder_ == null) {
         this.ensureSampleSourceIsMutable();
         this.sampleSource_.remove(var1);
         this.onChanged();
      } else {
         this.sampleSourceBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder removeStrideCalibration(int var1) {
      if (this.strideCalibrationBuilder_ == null) {
         this.ensureStrideCalibrationIsMutable();
         this.strideCalibration_.remove(var1);
         this.onChanged();
      } else {
         this.strideCalibrationBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setAccelerationMadSamples(int var1, float var2) {
      this.ensureAccelerationMadSamplesIsMutable();
      this.accelerationMadSamples_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setAltitudeCalibration(int var1, ExerciseSamples$PbCalibrationValue$Builder var2) {
      if (this.altitudeCalibrationBuilder_ == null) {
         this.ensureAltitudeCalibrationIsMutable();
         this.altitudeCalibration_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.altitudeCalibrationBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setAltitudeCalibration(int var1, ExerciseSamples$PbCalibrationValue var2) {
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

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setAltitudeSamples(int var1, float var2) {
      this.ensureAltitudeSamplesIsMutable();
      this.altitudeSamples_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setCadenceSamples(int var1, int var2) {
      this.ensureCadenceSamplesIsMutable();
      this.cadenceSamples_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setDistanceSamples(int var1, float var2) {
      this.ensureDistanceSamplesIsMutable();
      this.distanceSamples_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseSamples$PbExerciseIntervalledSampleList$Builder)super.setField(var1, var2);
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setForwardAcceleration(int var1, float var2) {
      this.ensureForwardAccelerationIsMutable();
      this.forwardAcceleration_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setHeartRateSamples(int var1, int var2) {
      this.ensureHeartRateSamplesIsMutable();
      this.heartRateSamples_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setLeftPedalPowerSamples(int var1, ExerciseSamples$PbPowerMeasurements$Builder var2) {
      if (this.leftPedalPowerSamplesBuilder_ == null) {
         this.ensureLeftPedalPowerSamplesIsMutable();
         this.leftPedalPowerSamples_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.leftPedalPowerSamplesBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setLeftPedalPowerSamples(int var1, ExerciseSamples$PbPowerMeasurements var2) {
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

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setLeftPowerCalibration(int var1, ExerciseSamples$PbCalibrationValue$Builder var2) {
      if (this.leftPowerCalibrationBuilder_ == null) {
         this.ensureLeftPowerCalibrationIsMutable();
         this.leftPowerCalibration_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.leftPowerCalibrationBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setLeftPowerCalibration(int var1, ExerciseSamples$PbCalibrationValue var2) {
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

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setMovingTypeSamples(int var1, Types$PbMovingType var2) {
      if (var2 == null) {
         throw new NullPointerException();
      } else {
         this.ensureMovingTypeSamplesIsMutable();
         this.movingTypeSamples_.set(var1, var2.getNumber());
         this.onChanged();
         return this;
      }
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setRecordingIntervalMs(int var1) {
      this.bitField0_ |= 2;
      this.recordingIntervalMs_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseSamples$PbExerciseIntervalledSampleList$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setRightPedalPowerSamples(int var1, ExerciseSamples$PbPowerMeasurements$Builder var2) {
      if (this.rightPedalPowerSamplesBuilder_ == null) {
         this.ensureRightPedalPowerSamplesIsMutable();
         this.rightPedalPowerSamples_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.rightPedalPowerSamplesBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setRightPedalPowerSamples(int var1, ExerciseSamples$PbPowerMeasurements var2) {
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

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setRightPowerCalibration(int var1, ExerciseSamples$PbCalibrationValue$Builder var2) {
      if (this.rightPowerCalibrationBuilder_ == null) {
         this.ensureRightPowerCalibrationIsMutable();
         this.rightPowerCalibration_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.rightPowerCalibrationBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setRightPowerCalibration(int var1, ExerciseSamples$PbCalibrationValue var2) {
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

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setRrSamples(ExerciseRRSamples$PbExerciseRRIntervals$Builder var1) {
      if (this.rrSamplesBuilder_ == null) {
         this.rrSamples_ = var1.build();
         this.onChanged();
      } else {
         this.rrSamplesBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 262144;
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setRrSamples(ExerciseRRSamples$PbExerciseRRIntervals var1) {
      if (this.rrSamplesBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.rrSamples_ = var1;
         this.onChanged();
      } else {
         this.rrSamplesBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 262144;
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setSampleSource(int var1, Types$PbSampleSource$Builder var2) {
      if (this.sampleSourceBuilder_ == null) {
         this.ensureSampleSourceIsMutable();
         this.sampleSource_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.sampleSourceBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setSampleSource(int var1, Types$PbSampleSource var2) {
      if (this.sampleSourceBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureSampleSourceIsMutable();
         this.sampleSource_.set(var1, var2);
         this.onChanged();
      } else {
         this.sampleSourceBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setSampleType(Types$PbSampleType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.sampleType_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setSpeedSamples(int var1, float var2) {
      this.ensureSpeedSamplesIsMutable();
      this.speedSamples_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setStrideCalibration(int var1, ExerciseSamples$PbCalibrationValue$Builder var2) {
      if (this.strideCalibrationBuilder_ == null) {
         this.ensureStrideCalibrationIsMutable();
         this.strideCalibration_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.strideCalibrationBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setStrideCalibration(int var1, ExerciseSamples$PbCalibrationValue var2) {
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

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setStrideLengthSamples(int var1, int var2) {
      this.ensureStrideLengthSamplesIsMutable();
      this.strideLengthSamples_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbExerciseIntervalledSampleList$Builder setTemperatureSamples(int var1, float var2) {
      this.ensureTemperatureSamplesIsMutable();
      this.temperatureSamples_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public final ExerciseSamples$PbExerciseIntervalledSampleList$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseSamples$PbExerciseIntervalledSampleList$Builder)super.setUnknownFields(var1);
   }
}
