package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
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

public final class Training$PbExerciseBase$Builder extends Builder implements Training$PbExerciseBaseOrBuilder {
   private int accumulatedTorque_;
   private float ascent_;
   private List availableSensorFeatures_;
   private int bitField0_;
   private int calories_;
   private int cyclingPowerEnergy_;
   private float descent_;
   private int deviceLocation_;
   private float distance_;
   private SingleFieldBuilderV3 durationBuilder_;
   private Types$PbDuration duration_;
   private SingleFieldBuilderV3 exerciseCountersBuilder_;
   private Training$PbExerciseCounters exerciseCounters_;
   private double latitude_;
   private double longitude_;
   private float oBSOLETESpeedCalibrationOffset_;
   private Object place_;
   private SingleFieldBuilderV3 runningIndexBuilder_;
   private Structures$PbRunningIndex runningIndex_;
   private RepeatedFieldBuilderV3 sensorCalibrationOffsetBuilder_;
   private List sensorCalibrationOffset_;
   private SingleFieldBuilderV3 sportBuilder_;
   private Structures$PbSportIdentifier sport_;
   private SingleFieldBuilderV3 startBuilder_;
   private Types$PbLocalDateTime start_;
   private SingleFieldBuilderV3 trainingLoadBuilder_;
   private Structures$PbTrainingLoad trainingLoad_;
   private float walkingDistance_;
   private SingleFieldBuilderV3 walkingDurationBuilder_;
   private Types$PbDuration walkingDuration_;

   private Training$PbExerciseBase$Builder() {
      this.start_ = null;
      this.duration_ = null;
      this.sport_ = null;
      this.trainingLoad_ = null;
      this.availableSensorFeatures_ = Collections.emptyList();
      this.runningIndex_ = null;
      this.place_ = "";
      this.exerciseCounters_ = null;
      this.walkingDuration_ = null;
      this.sensorCalibrationOffset_ = Collections.emptyList();
      this.deviceLocation_ = 0;
      this.maybeForceBuilderInitialization();
   }

   private Training$PbExerciseBase$Builder(BuilderParent var1) {
      super(var1);
      this.start_ = null;
      this.duration_ = null;
      this.sport_ = null;
      this.trainingLoad_ = null;
      this.availableSensorFeatures_ = Collections.emptyList();
      this.runningIndex_ = null;
      this.place_ = "";
      this.exerciseCounters_ = null;
      this.walkingDuration_ = null;
      this.sensorCalibrationOffset_ = Collections.emptyList();
      this.deviceLocation_ = 0;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Training$PbExerciseBase$Builder(BuilderParent var1, Training$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Training$PbExerciseBase$Builder(Training$1 var1) {
      this();
   }

   private void ensureAvailableSensorFeaturesIsMutable() {
      if ((this.bitField0_ & 64) != 64) {
         this.availableSensorFeatures_ = new ArrayList(this.availableSensorFeatures_);
         this.bitField0_ |= 64;
      }

   }

   private void ensureSensorCalibrationOffsetIsMutable() {
      if ((this.bitField0_ & 524288) != 524288) {
         this.sensorCalibrationOffset_ = new ArrayList(this.sensorCalibrationOffset_);
         this.bitField0_ |= 524288;
      }

   }

   public static final Descriptor getDescriptor() {
      return Training.c();
   }

   private SingleFieldBuilderV3 getDurationFieldBuilder() {
      if (this.durationBuilder_ == null) {
         this.durationBuilder_ = new SingleFieldBuilderV3(this.getDuration(), this.getParentForChildren(), this.isClean());
         this.duration_ = null;
      }

      return this.durationBuilder_;
   }

   private SingleFieldBuilderV3 getExerciseCountersFieldBuilder() {
      if (this.exerciseCountersBuilder_ == null) {
         this.exerciseCountersBuilder_ = new SingleFieldBuilderV3(this.getExerciseCounters(), this.getParentForChildren(), this.isClean());
         this.exerciseCounters_ = null;
      }

      return this.exerciseCountersBuilder_;
   }

   private SingleFieldBuilderV3 getRunningIndexFieldBuilder() {
      if (this.runningIndexBuilder_ == null) {
         this.runningIndexBuilder_ = new SingleFieldBuilderV3(this.getRunningIndex(), this.getParentForChildren(), this.isClean());
         this.runningIndex_ = null;
      }

      return this.runningIndexBuilder_;
   }

   private RepeatedFieldBuilderV3 getSensorCalibrationOffsetFieldBuilder() {
      if (this.sensorCalibrationOffsetBuilder_ == null) {
         List var1 = this.sensorCalibrationOffset_;
         boolean var2;
         if ((this.bitField0_ & 524288) == 524288) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.sensorCalibrationOffsetBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.sensorCalibrationOffset_ = null;
      }

      return this.sensorCalibrationOffsetBuilder_;
   }

   private SingleFieldBuilderV3 getSportFieldBuilder() {
      if (this.sportBuilder_ == null) {
         this.sportBuilder_ = new SingleFieldBuilderV3(this.getSport(), this.getParentForChildren(), this.isClean());
         this.sport_ = null;
      }

      return this.sportBuilder_;
   }

   private SingleFieldBuilderV3 getStartFieldBuilder() {
      if (this.startBuilder_ == null) {
         this.startBuilder_ = new SingleFieldBuilderV3(this.getStart(), this.getParentForChildren(), this.isClean());
         this.start_ = null;
      }

      return this.startBuilder_;
   }

   private SingleFieldBuilderV3 getTrainingLoadFieldBuilder() {
      if (this.trainingLoadBuilder_ == null) {
         this.trainingLoadBuilder_ = new SingleFieldBuilderV3(this.getTrainingLoad(), this.getParentForChildren(), this.isClean());
         this.trainingLoad_ = null;
      }

      return this.trainingLoadBuilder_;
   }

   private SingleFieldBuilderV3 getWalkingDurationFieldBuilder() {
      if (this.walkingDurationBuilder_ == null) {
         this.walkingDurationBuilder_ = new SingleFieldBuilderV3(this.getWalkingDuration(), this.getParentForChildren(), this.isClean());
         this.walkingDuration_ = null;
      }

      return this.walkingDurationBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (Training$PbExerciseBase.b()) {
         this.getStartFieldBuilder();
         this.getDurationFieldBuilder();
         this.getSportFieldBuilder();
         this.getTrainingLoadFieldBuilder();
         this.getRunningIndexFieldBuilder();
         this.getExerciseCountersFieldBuilder();
         this.getWalkingDurationFieldBuilder();
         this.getSensorCalibrationOffsetFieldBuilder();
      }

   }

   public Training$PbExerciseBase$Builder addAllAvailableSensorFeatures(Iterable var1) {
      this.ensureAvailableSensorFeaturesIsMutable();
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         Types$PbFeatureType var3 = (Types$PbFeatureType)var2.next();
         this.availableSensorFeatures_.add(var3.getNumber());
      }

      this.onChanged();
      return this;
   }

   public Training$PbExerciseBase$Builder addAllSensorCalibrationOffset(Iterable var1) {
      if (this.sensorCalibrationOffsetBuilder_ == null) {
         this.ensureSensorCalibrationOffsetIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.sensorCalibrationOffset_);
         this.onChanged();
      } else {
         this.sensorCalibrationOffsetBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public Training$PbExerciseBase$Builder addAvailableSensorFeatures(Types$PbFeatureType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.ensureAvailableSensorFeaturesIsMutable();
         this.availableSensorFeatures_.add(var1.getNumber());
         this.onChanged();
         return this;
      }
   }

   public Training$PbExerciseBase$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Training$PbExerciseBase$Builder)super.addRepeatedField(var1, var2);
   }

   public Training$PbExerciseBase$Builder addSensorCalibrationOffset(int var1, Types$PbSensorCalibrationOffset$Builder var2) {
      if (this.sensorCalibrationOffsetBuilder_ == null) {
         this.ensureSensorCalibrationOffsetIsMutable();
         this.sensorCalibrationOffset_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.sensorCalibrationOffsetBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public Training$PbExerciseBase$Builder addSensorCalibrationOffset(int var1, Types$PbSensorCalibrationOffset var2) {
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

   public Training$PbExerciseBase$Builder addSensorCalibrationOffset(Types$PbSensorCalibrationOffset$Builder var1) {
      if (this.sensorCalibrationOffsetBuilder_ == null) {
         this.ensureSensorCalibrationOffsetIsMutable();
         this.sensorCalibrationOffset_.add(var1.build());
         this.onChanged();
      } else {
         this.sensorCalibrationOffsetBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public Training$PbExerciseBase$Builder addSensorCalibrationOffset(Types$PbSensorCalibrationOffset var1) {
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

   public Training$PbExerciseBase build() {
      Training$PbExerciseBase var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Training$PbExerciseBase buildPartial() {
      Training$PbExerciseBase var1 = new Training$PbExerciseBase(this, (Training$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.startBuilder_ == null) {
         Training$PbExerciseBase.a(var1, this.start_);
      } else {
         Training$PbExerciseBase.a(var1, (Types$PbLocalDateTime)this.startBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.durationBuilder_ == null) {
         Training$PbExerciseBase.a(var1, this.duration_);
      } else {
         Training$PbExerciseBase.a(var1, (Types$PbDuration)this.durationBuilder_.build());
      }

      int var6 = var4;
      if ((var2 & 4) == 4) {
         var6 = var4 | 4;
      }

      if (this.sportBuilder_ == null) {
         Training$PbExerciseBase.a(var1, this.sport_);
      } else {
         Training$PbExerciseBase.a(var1, (Structures$PbSportIdentifier)this.sportBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 8) == 8) {
         var4 = var6 | 8;
      }

      Training$PbExerciseBase.a(var1, this.distance_);
      int var5 = var4;
      if ((var2 & 16) == 16) {
         var5 = var4 | 16;
      }

      Training$PbExerciseBase.a(var1, this.calories_);
      var6 = var5;
      if ((var2 & 32) == 32) {
         var6 = var5 | 32;
      }

      if (this.trainingLoadBuilder_ == null) {
         Training$PbExerciseBase.a(var1, this.trainingLoad_);
      } else {
         Training$PbExerciseBase.a(var1, (Structures$PbTrainingLoad)this.trainingLoadBuilder_.build());
      }

      if ((this.bitField0_ & 64) == 64) {
         this.availableSensorFeatures_ = Collections.unmodifiableList(this.availableSensorFeatures_);
         this.bitField0_ &= -65;
      }

      Training$PbExerciseBase.a(var1, this.availableSensorFeatures_);
      var4 = var6;
      if ((var2 & 128) == 128) {
         var4 = var6 | 64;
      }

      if (this.runningIndexBuilder_ == null) {
         Training$PbExerciseBase.a(var1, this.runningIndex_);
      } else {
         Training$PbExerciseBase.a(var1, (Structures$PbRunningIndex)this.runningIndexBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 256) == 256) {
         var6 = var4 | 128;
      }

      Training$PbExerciseBase.b(var1, this.ascent_);
      var4 = var6;
      if ((var2 & 512) == 512) {
         var4 = var6 | 256;
      }

      Training$PbExerciseBase.c(var1, this.descent_);
      var6 = var4;
      if ((var2 & 1024) == 1024) {
         var6 = var4 | 512;
      }

      Training$PbExerciseBase.a(var1, this.latitude_);
      var4 = var6;
      if ((var2 & 2048) == 2048) {
         var4 = var6 | 1024;
      }

      Training$PbExerciseBase.b(var1, this.longitude_);
      var6 = var4;
      if ((var2 & 4096) == 4096) {
         var6 = var4 | 2048;
      }

      Training$PbExerciseBase.a(var1, this.place_);
      var4 = var6;
      if ((var2 & 8192) == 8192) {
         var4 = var6 | 4096;
      }

      if (this.exerciseCountersBuilder_ == null) {
         Training$PbExerciseBase.a(var1, this.exerciseCounters_);
      } else {
         Training$PbExerciseBase.a(var1, (Training$PbExerciseCounters)this.exerciseCountersBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 16384) == 16384) {
         var6 = var4 | 8192;
      }

      Training$PbExerciseBase.d(var1, this.oBSOLETESpeedCalibrationOffset_);
      var4 = var6;
      if ((var2 & '耀') == 32768) {
         var4 = var6 | 16384;
      }

      Training$PbExerciseBase.e(var1, this.walkingDistance_);
      var6 = var4;
      if ((var2 & 65536) == 65536) {
         var6 = var4 | '耀';
      }

      if (this.walkingDurationBuilder_ == null) {
         Training$PbExerciseBase.b(var1, this.walkingDuration_);
      } else {
         Training$PbExerciseBase.b(var1, (Types$PbDuration)this.walkingDurationBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 131072) == 131072) {
         var4 = var6 | 65536;
      }

      Training$PbExerciseBase.b(var1, this.accumulatedTorque_);
      var6 = var4;
      if ((var2 & 262144) == 262144) {
         var6 = var4 | 131072;
      }

      Training$PbExerciseBase.c(var1, this.cyclingPowerEnergy_);
      if (this.sensorCalibrationOffsetBuilder_ == null) {
         if ((this.bitField0_ & 524288) == 524288) {
            this.sensorCalibrationOffset_ = Collections.unmodifiableList(this.sensorCalibrationOffset_);
            this.bitField0_ &= -524289;
         }

         Training$PbExerciseBase.b(var1, this.sensorCalibrationOffset_);
      } else {
         Training$PbExerciseBase.b(var1, this.sensorCalibrationOffsetBuilder_.build());
      }

      var4 = var6;
      if ((1048576 & var2) == 1048576) {
         var4 = var6 | 262144;
      }

      Training$PbExerciseBase.d(var1, this.deviceLocation_);
      Training$PbExerciseBase.e(var1, var4);
      this.onBuilt();
      return var1;
   }

   public Training$PbExerciseBase$Builder clear() {
      super.clear();
      if (this.startBuilder_ == null) {
         this.start_ = null;
      } else {
         this.startBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.durationBuilder_ == null) {
         this.duration_ = null;
      } else {
         this.durationBuilder_.clear();
      }

      this.bitField0_ &= -3;
      if (this.sportBuilder_ == null) {
         this.sport_ = null;
      } else {
         this.sportBuilder_.clear();
      }

      this.bitField0_ &= -5;
      this.distance_ = 0.0F;
      this.bitField0_ &= -9;
      this.calories_ = 0;
      this.bitField0_ &= -17;
      if (this.trainingLoadBuilder_ == null) {
         this.trainingLoad_ = null;
      } else {
         this.trainingLoadBuilder_.clear();
      }

      this.bitField0_ &= -33;
      this.availableSensorFeatures_ = Collections.emptyList();
      this.bitField0_ &= -65;
      if (this.runningIndexBuilder_ == null) {
         this.runningIndex_ = null;
      } else {
         this.runningIndexBuilder_.clear();
      }

      this.bitField0_ &= -129;
      this.ascent_ = 0.0F;
      this.bitField0_ &= -257;
      this.descent_ = 0.0F;
      this.bitField0_ &= -513;
      this.latitude_ = 0.0D;
      this.bitField0_ &= -1025;
      this.longitude_ = 0.0D;
      this.bitField0_ &= -2049;
      this.place_ = "";
      this.bitField0_ &= -4097;
      if (this.exerciseCountersBuilder_ == null) {
         this.exerciseCounters_ = null;
      } else {
         this.exerciseCountersBuilder_.clear();
      }

      this.bitField0_ &= -8193;
      this.oBSOLETESpeedCalibrationOffset_ = 0.0F;
      this.bitField0_ &= -16385;
      this.walkingDistance_ = 0.0F;
      this.bitField0_ &= -32769;
      if (this.walkingDurationBuilder_ == null) {
         this.walkingDuration_ = null;
      } else {
         this.walkingDurationBuilder_.clear();
      }

      this.bitField0_ &= -65537;
      this.accumulatedTorque_ = 0;
      this.bitField0_ &= -131073;
      this.cyclingPowerEnergy_ = 0;
      this.bitField0_ &= -262145;
      if (this.sensorCalibrationOffsetBuilder_ == null) {
         this.sensorCalibrationOffset_ = Collections.emptyList();
         this.bitField0_ &= -524289;
      } else {
         this.sensorCalibrationOffsetBuilder_.clear();
      }

      this.deviceLocation_ = 0;
      this.bitField0_ &= -1048577;
      return this;
   }

   public Training$PbExerciseBase$Builder clearAccumulatedTorque() {
      this.bitField0_ &= -131073;
      this.accumulatedTorque_ = 0;
      this.onChanged();
      return this;
   }

   public Training$PbExerciseBase$Builder clearAscent() {
      this.bitField0_ &= -257;
      this.ascent_ = 0.0F;
      this.onChanged();
      return this;
   }

   public Training$PbExerciseBase$Builder clearAvailableSensorFeatures() {
      this.availableSensorFeatures_ = Collections.emptyList();
      this.bitField0_ &= -65;
      this.onChanged();
      return this;
   }

   public Training$PbExerciseBase$Builder clearCalories() {
      this.bitField0_ &= -17;
      this.calories_ = 0;
      this.onChanged();
      return this;
   }

   public Training$PbExerciseBase$Builder clearCyclingPowerEnergy() {
      this.bitField0_ &= -262145;
      this.cyclingPowerEnergy_ = 0;
      this.onChanged();
      return this;
   }

   public Training$PbExerciseBase$Builder clearDescent() {
      this.bitField0_ &= -513;
      this.descent_ = 0.0F;
      this.onChanged();
      return this;
   }

   public Training$PbExerciseBase$Builder clearDeviceLocation() {
      this.bitField0_ &= -1048577;
      this.deviceLocation_ = 0;
      this.onChanged();
      return this;
   }

   public Training$PbExerciseBase$Builder clearDistance() {
      this.bitField0_ &= -9;
      this.distance_ = 0.0F;
      this.onChanged();
      return this;
   }

   public Training$PbExerciseBase$Builder clearDuration() {
      if (this.durationBuilder_ == null) {
         this.duration_ = null;
         this.onChanged();
      } else {
         this.durationBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public Training$PbExerciseBase$Builder clearExerciseCounters() {
      if (this.exerciseCountersBuilder_ == null) {
         this.exerciseCounters_ = null;
         this.onChanged();
      } else {
         this.exerciseCountersBuilder_.clear();
      }

      this.bitField0_ &= -8193;
      return this;
   }

   public Training$PbExerciseBase$Builder clearField(FieldDescriptor var1) {
      return (Training$PbExerciseBase$Builder)super.clearField(var1);
   }

   public Training$PbExerciseBase$Builder clearLatitude() {
      this.bitField0_ &= -1025;
      this.latitude_ = 0.0D;
      this.onChanged();
      return this;
   }

   public Training$PbExerciseBase$Builder clearLongitude() {
      this.bitField0_ &= -2049;
      this.longitude_ = 0.0D;
      this.onChanged();
      return this;
   }

   public Training$PbExerciseBase$Builder clearOBSOLETESpeedCalibrationOffset() {
      this.bitField0_ &= -16385;
      this.oBSOLETESpeedCalibrationOffset_ = 0.0F;
      this.onChanged();
      return this;
   }

   public Training$PbExerciseBase$Builder clearOneof(OneofDescriptor var1) {
      return (Training$PbExerciseBase$Builder)super.clearOneof(var1);
   }

   public Training$PbExerciseBase$Builder clearPlace() {
      this.bitField0_ &= -4097;
      this.place_ = Training$PbExerciseBase.getDefaultInstance().getPlace();
      this.onChanged();
      return this;
   }

   public Training$PbExerciseBase$Builder clearRunningIndex() {
      if (this.runningIndexBuilder_ == null) {
         this.runningIndex_ = null;
         this.onChanged();
      } else {
         this.runningIndexBuilder_.clear();
      }

      this.bitField0_ &= -129;
      return this;
   }

   public Training$PbExerciseBase$Builder clearSensorCalibrationOffset() {
      if (this.sensorCalibrationOffsetBuilder_ == null) {
         this.sensorCalibrationOffset_ = Collections.emptyList();
         this.bitField0_ &= -524289;
         this.onChanged();
      } else {
         this.sensorCalibrationOffsetBuilder_.clear();
      }

      return this;
   }

   public Training$PbExerciseBase$Builder clearSport() {
      if (this.sportBuilder_ == null) {
         this.sport_ = null;
         this.onChanged();
      } else {
         this.sportBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public Training$PbExerciseBase$Builder clearStart() {
      if (this.startBuilder_ == null) {
         this.start_ = null;
         this.onChanged();
      } else {
         this.startBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public Training$PbExerciseBase$Builder clearTrainingLoad() {
      if (this.trainingLoadBuilder_ == null) {
         this.trainingLoad_ = null;
         this.onChanged();
      } else {
         this.trainingLoadBuilder_.clear();
      }

      this.bitField0_ &= -33;
      return this;
   }

   public Training$PbExerciseBase$Builder clearWalkingDistance() {
      this.bitField0_ &= -32769;
      this.walkingDistance_ = 0.0F;
      this.onChanged();
      return this;
   }

   public Training$PbExerciseBase$Builder clearWalkingDuration() {
      if (this.walkingDurationBuilder_ == null) {
         this.walkingDuration_ = null;
         this.onChanged();
      } else {
         this.walkingDurationBuilder_.clear();
      }

      this.bitField0_ &= -65537;
      return this;
   }

   public Training$PbExerciseBase$Builder clone() {
      return (Training$PbExerciseBase$Builder)super.clone();
   }

   public int getAccumulatedTorque() {
      return this.accumulatedTorque_;
   }

   public float getAscent() {
      return this.ascent_;
   }

   public Types$PbFeatureType getAvailableSensorFeatures(int var1) {
      return (Types$PbFeatureType)Training$PbExerciseBase.d().convert(this.availableSensorFeatures_.get(var1));
   }

   public int getAvailableSensorFeaturesCount() {
      return this.availableSensorFeatures_.size();
   }

   public List getAvailableSensorFeaturesList() {
      return new ListAdapter(this.availableSensorFeatures_, Training$PbExerciseBase.d());
   }

   public int getCalories() {
      return this.calories_;
   }

   public int getCyclingPowerEnergy() {
      return this.cyclingPowerEnergy_;
   }

   public Training$PbExerciseBase getDefaultInstanceForType() {
      return Training$PbExerciseBase.getDefaultInstance();
   }

   public float getDescent() {
      return this.descent_;
   }

   public Descriptor getDescriptorForType() {
      return Training.c();
   }

   public Types$PbDeviceLocation getDeviceLocation() {
      Types$PbDeviceLocation var1 = Types$PbDeviceLocation.valueOf(this.deviceLocation_);
      Types$PbDeviceLocation var2 = var1;
      if (var1 == null) {
         var2 = Types$PbDeviceLocation.DEVICE_LOCATION_UNDEFINED;
      }

      return var2;
   }

   public float getDistance() {
      return this.distance_;
   }

   public Types$PbDuration getDuration() {
      Types$PbDuration var1;
      if (this.durationBuilder_ == null) {
         if (this.duration_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.duration_;
         }
      } else {
         var1 = (Types$PbDuration)this.durationBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getDurationBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getDurationFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getDurationOrBuilder() {
      Object var1;
      if (this.durationBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.durationBuilder_.getMessageOrBuilder();
      } else if (this.duration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.duration_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public Training$PbExerciseCounters getExerciseCounters() {
      Training$PbExerciseCounters var1;
      if (this.exerciseCountersBuilder_ == null) {
         if (this.exerciseCounters_ == null) {
            var1 = Training$PbExerciseCounters.getDefaultInstance();
         } else {
            var1 = this.exerciseCounters_;
         }
      } else {
         var1 = (Training$PbExerciseCounters)this.exerciseCountersBuilder_.getMessage();
      }

      return var1;
   }

   public Training$PbExerciseCounters$Builder getExerciseCountersBuilder() {
      this.bitField0_ |= 8192;
      this.onChanged();
      return (Training$PbExerciseCounters$Builder)this.getExerciseCountersFieldBuilder().getBuilder();
   }

   public Training$PbExerciseCountersOrBuilder getExerciseCountersOrBuilder() {
      Object var1;
      if (this.exerciseCountersBuilder_ != null) {
         var1 = (Training$PbExerciseCountersOrBuilder)this.exerciseCountersBuilder_.getMessageOrBuilder();
      } else if (this.exerciseCounters_ == null) {
         var1 = Training$PbExerciseCounters.getDefaultInstance();
      } else {
         var1 = this.exerciseCounters_;
      }

      return (Training$PbExerciseCountersOrBuilder)var1;
   }

   public double getLatitude() {
      return this.latitude_;
   }

   public double getLongitude() {
      return this.longitude_;
   }

   public float getOBSOLETESpeedCalibrationOffset() {
      return this.oBSOLETESpeedCalibrationOffset_;
   }

   public String getPlace() {
      Object var1 = this.place_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.place_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getPlaceBytes() {
      Object var1 = this.place_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.place_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public Structures$PbRunningIndex getRunningIndex() {
      Structures$PbRunningIndex var1;
      if (this.runningIndexBuilder_ == null) {
         if (this.runningIndex_ == null) {
            var1 = Structures$PbRunningIndex.getDefaultInstance();
         } else {
            var1 = this.runningIndex_;
         }
      } else {
         var1 = (Structures$PbRunningIndex)this.runningIndexBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbRunningIndex$Builder getRunningIndexBuilder() {
      this.bitField0_ |= 128;
      this.onChanged();
      return (Structures$PbRunningIndex$Builder)this.getRunningIndexFieldBuilder().getBuilder();
   }

   public Structures$PbRunningIndexOrBuilder getRunningIndexOrBuilder() {
      Object var1;
      if (this.runningIndexBuilder_ != null) {
         var1 = (Structures$PbRunningIndexOrBuilder)this.runningIndexBuilder_.getMessageOrBuilder();
      } else if (this.runningIndex_ == null) {
         var1 = Structures$PbRunningIndex.getDefaultInstance();
      } else {
         var1 = this.runningIndex_;
      }

      return (Structures$PbRunningIndexOrBuilder)var1;
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

   public Structures$PbSportIdentifier getSport() {
      Structures$PbSportIdentifier var1;
      if (this.sportBuilder_ == null) {
         if (this.sport_ == null) {
            var1 = Structures$PbSportIdentifier.getDefaultInstance();
         } else {
            var1 = this.sport_;
         }
      } else {
         var1 = (Structures$PbSportIdentifier)this.sportBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbSportIdentifier$Builder getSportBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (Structures$PbSportIdentifier$Builder)this.getSportFieldBuilder().getBuilder();
   }

   public Structures$PbSportIdentifierOrBuilder getSportOrBuilder() {
      Object var1;
      if (this.sportBuilder_ != null) {
         var1 = (Structures$PbSportIdentifierOrBuilder)this.sportBuilder_.getMessageOrBuilder();
      } else if (this.sport_ == null) {
         var1 = Structures$PbSportIdentifier.getDefaultInstance();
      } else {
         var1 = this.sport_;
      }

      return (Structures$PbSportIdentifierOrBuilder)var1;
   }

   public Types$PbLocalDateTime getStart() {
      Types$PbLocalDateTime var1;
      if (this.startBuilder_ == null) {
         if (this.start_ == null) {
            var1 = Types$PbLocalDateTime.getDefaultInstance();
         } else {
            var1 = this.start_;
         }
      } else {
         var1 = (Types$PbLocalDateTime)this.startBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbLocalDateTime$Builder getStartBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Types$PbLocalDateTime$Builder)this.getStartFieldBuilder().getBuilder();
   }

   public Types$PbLocalDateTimeOrBuilder getStartOrBuilder() {
      Object var1;
      if (this.startBuilder_ != null) {
         var1 = (Types$PbLocalDateTimeOrBuilder)this.startBuilder_.getMessageOrBuilder();
      } else if (this.start_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.start_;
      }

      return (Types$PbLocalDateTimeOrBuilder)var1;
   }

   public Structures$PbTrainingLoad getTrainingLoad() {
      Structures$PbTrainingLoad var1;
      if (this.trainingLoadBuilder_ == null) {
         if (this.trainingLoad_ == null) {
            var1 = Structures$PbTrainingLoad.getDefaultInstance();
         } else {
            var1 = this.trainingLoad_;
         }
      } else {
         var1 = (Structures$PbTrainingLoad)this.trainingLoadBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbTrainingLoad$Builder getTrainingLoadBuilder() {
      this.bitField0_ |= 32;
      this.onChanged();
      return (Structures$PbTrainingLoad$Builder)this.getTrainingLoadFieldBuilder().getBuilder();
   }

   public Structures$PbTrainingLoadOrBuilder getTrainingLoadOrBuilder() {
      Object var1;
      if (this.trainingLoadBuilder_ != null) {
         var1 = (Structures$PbTrainingLoadOrBuilder)this.trainingLoadBuilder_.getMessageOrBuilder();
      } else if (this.trainingLoad_ == null) {
         var1 = Structures$PbTrainingLoad.getDefaultInstance();
      } else {
         var1 = this.trainingLoad_;
      }

      return (Structures$PbTrainingLoadOrBuilder)var1;
   }

   public float getWalkingDistance() {
      return this.walkingDistance_;
   }

   public Types$PbDuration getWalkingDuration() {
      Types$PbDuration var1;
      if (this.walkingDurationBuilder_ == null) {
         if (this.walkingDuration_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.walkingDuration_;
         }
      } else {
         var1 = (Types$PbDuration)this.walkingDurationBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getWalkingDurationBuilder() {
      this.bitField0_ |= 65536;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getWalkingDurationFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getWalkingDurationOrBuilder() {
      Object var1;
      if (this.walkingDurationBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.walkingDurationBuilder_.getMessageOrBuilder();
      } else if (this.walkingDuration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.walkingDuration_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public boolean hasAccumulatedTorque() {
      boolean var1;
      if ((this.bitField0_ & 131072) == 131072) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAscent() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasCalories() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasCyclingPowerEnergy() {
      boolean var1;
      if ((this.bitField0_ & 262144) == 262144) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDescent() {
      boolean var1;
      if ((this.bitField0_ & 512) == 512) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDeviceLocation() {
      boolean var1;
      if ((this.bitField0_ & 1048576) == 1048576) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDistance() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDuration() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasExerciseCounters() {
      boolean var1;
      if ((this.bitField0_ & 8192) == 8192) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLatitude() {
      boolean var1;
      if ((this.bitField0_ & 1024) == 1024) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLongitude() {
      boolean var1;
      if ((this.bitField0_ & 2048) == 2048) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasOBSOLETESpeedCalibrationOffset() {
      boolean var1;
      if ((this.bitField0_ & 16384) == 16384) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPlace() {
      boolean var1;
      if ((this.bitField0_ & 4096) == 4096) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasRunningIndex() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSport() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStart() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTrainingLoad() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasWalkingDistance() {
      boolean var1;
      if ((this.bitField0_ & '耀') == 32768) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasWalkingDuration() {
      boolean var1;
      if ((this.bitField0_ & 65536) == 65536) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Training.d().ensureFieldAccessorsInitialized(Training$PbExerciseBase.class, Training$PbExerciseBase$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasStart()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasDuration()) {
            var2 = var1;
            if (this.hasSport()) {
               var2 = var1;
               if (this.getStart().isInitialized()) {
                  var2 = var1;
                  if (this.getSport().isInitialized()) {
                     if (this.hasRunningIndex()) {
                        var2 = var1;
                        if (!this.getRunningIndex().isInitialized()) {
                           return var2;
                        }
                     }

                     int var3 = 0;

                     while(true) {
                        if (var3 >= this.getSensorCalibrationOffsetCount()) {
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
      }

      return var2;
   }

   public Training$PbExerciseBase$Builder mergeDuration(Types$PbDuration var1) {
      if (this.durationBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.duration_ != null && this.duration_ != Types$PbDuration.getDefaultInstance()) {
            this.duration_ = Types$PbDuration.newBuilder(this.duration_).mergeFrom(var1).buildPartial();
         } else {
            this.duration_ = var1;
         }

         this.onChanged();
      } else {
         this.durationBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Training$PbExerciseBase$Builder mergeExerciseCounters(Training$PbExerciseCounters var1) {
      if (this.exerciseCountersBuilder_ == null) {
         if ((this.bitField0_ & 8192) == 8192 && this.exerciseCounters_ != null && this.exerciseCounters_ != Training$PbExerciseCounters.getDefaultInstance()) {
            this.exerciseCounters_ = Training$PbExerciseCounters.newBuilder(this.exerciseCounters_).mergeFrom(var1).buildPartial();
         } else {
            this.exerciseCounters_ = var1;
         }

         this.onChanged();
      } else {
         this.exerciseCountersBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8192;
      return this;
   }

   public Training$PbExerciseBase$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Training$PbExerciseBase var13;
      label96: {
         InvalidProtocolBufferException var12;
         Training$PbExerciseBase var14;
         try {
            var13 = (Training$PbExerciseBase)Training$PbExerciseBase.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Training$PbExerciseBase)var10.getUnfinishedMessage();
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

   public Training$PbExerciseBase$Builder mergeFrom(Message var1) {
      Training$PbExerciseBase$Builder var2;
      if (var1 instanceof Training$PbExerciseBase) {
         var2 = this.mergeFrom((Training$PbExerciseBase)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Training$PbExerciseBase$Builder mergeFrom(Training$PbExerciseBase var1) {
      RepeatedFieldBuilderV3 var2 = null;
      if (var1 != Training$PbExerciseBase.getDefaultInstance()) {
         if (var1.hasStart()) {
            this.mergeStart(var1.getStart());
         }

         if (var1.hasDuration()) {
            this.mergeDuration(var1.getDuration());
         }

         if (var1.hasSport()) {
            this.mergeSport(var1.getSport());
         }

         if (var1.hasDistance()) {
            this.setDistance(var1.getDistance());
         }

         if (var1.hasCalories()) {
            this.setCalories(var1.getCalories());
         }

         if (var1.hasTrainingLoad()) {
            this.mergeTrainingLoad(var1.getTrainingLoad());
         }

         if (!Training$PbExerciseBase.a(var1).isEmpty()) {
            if (this.availableSensorFeatures_.isEmpty()) {
               this.availableSensorFeatures_ = Training$PbExerciseBase.a(var1);
               this.bitField0_ &= -65;
            } else {
               this.ensureAvailableSensorFeaturesIsMutable();
               this.availableSensorFeatures_.addAll(Training$PbExerciseBase.a(var1));
            }

            this.onChanged();
         }

         if (var1.hasRunningIndex()) {
            this.mergeRunningIndex(var1.getRunningIndex());
         }

         if (var1.hasAscent()) {
            this.setAscent(var1.getAscent());
         }

         if (var1.hasDescent()) {
            this.setDescent(var1.getDescent());
         }

         if (var1.hasLatitude()) {
            this.setLatitude(var1.getLatitude());
         }

         if (var1.hasLongitude()) {
            this.setLongitude(var1.getLongitude());
         }

         if (var1.hasPlace()) {
            this.bitField0_ |= 4096;
            this.place_ = Training$PbExerciseBase.b(var1);
            this.onChanged();
         }

         if (var1.hasExerciseCounters()) {
            this.mergeExerciseCounters(var1.getExerciseCounters());
         }

         if (var1.hasOBSOLETESpeedCalibrationOffset()) {
            this.setOBSOLETESpeedCalibrationOffset(var1.getOBSOLETESpeedCalibrationOffset());
         }

         if (var1.hasWalkingDistance()) {
            this.setWalkingDistance(var1.getWalkingDistance());
         }

         if (var1.hasWalkingDuration()) {
            this.mergeWalkingDuration(var1.getWalkingDuration());
         }

         if (var1.hasAccumulatedTorque()) {
            this.setAccumulatedTorque(var1.getAccumulatedTorque());
         }

         if (var1.hasCyclingPowerEnergy()) {
            this.setCyclingPowerEnergy(var1.getCyclingPowerEnergy());
         }

         if (this.sensorCalibrationOffsetBuilder_ == null) {
            if (!Training$PbExerciseBase.c(var1).isEmpty()) {
               if (this.sensorCalibrationOffset_.isEmpty()) {
                  this.sensorCalibrationOffset_ = Training$PbExerciseBase.c(var1);
                  this.bitField0_ &= -524289;
               } else {
                  this.ensureSensorCalibrationOffsetIsMutable();
                  this.sensorCalibrationOffset_.addAll(Training$PbExerciseBase.c(var1));
               }

               this.onChanged();
            }
         } else if (!Training$PbExerciseBase.c(var1).isEmpty()) {
            if (this.sensorCalibrationOffsetBuilder_.isEmpty()) {
               this.sensorCalibrationOffsetBuilder_.dispose();
               this.sensorCalibrationOffsetBuilder_ = null;
               this.sensorCalibrationOffset_ = Training$PbExerciseBase.c(var1);
               this.bitField0_ &= -524289;
               if (Training$PbExerciseBase.c()) {
                  var2 = this.getSensorCalibrationOffsetFieldBuilder();
               }

               this.sensorCalibrationOffsetBuilder_ = var2;
            } else {
               this.sensorCalibrationOffsetBuilder_.addAllMessages(Training$PbExerciseBase.c(var1));
            }
         }

         if (var1.hasDeviceLocation()) {
            this.setDeviceLocation(var1.getDeviceLocation());
         }

         this.mergeUnknownFields(Training$PbExerciseBase.d(var1));
         this.onChanged();
      }

      return this;
   }

   public Training$PbExerciseBase$Builder mergeRunningIndex(Structures$PbRunningIndex var1) {
      if (this.runningIndexBuilder_ == null) {
         if ((this.bitField0_ & 128) == 128 && this.runningIndex_ != null && this.runningIndex_ != Structures$PbRunningIndex.getDefaultInstance()) {
            this.runningIndex_ = Structures$PbRunningIndex.newBuilder(this.runningIndex_).mergeFrom(var1).buildPartial();
         } else {
            this.runningIndex_ = var1;
         }

         this.onChanged();
      } else {
         this.runningIndexBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 128;
      return this;
   }

   public Training$PbExerciseBase$Builder mergeSport(Structures$PbSportIdentifier var1) {
      if (this.sportBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.sport_ != null && this.sport_ != Structures$PbSportIdentifier.getDefaultInstance()) {
            this.sport_ = Structures$PbSportIdentifier.newBuilder(this.sport_).mergeFrom(var1).buildPartial();
         } else {
            this.sport_ = var1;
         }

         this.onChanged();
      } else {
         this.sportBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public Training$PbExerciseBase$Builder mergeStart(Types$PbLocalDateTime var1) {
      if (this.startBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.start_ != null && this.start_ != Types$PbLocalDateTime.getDefaultInstance()) {
            this.start_ = Types$PbLocalDateTime.newBuilder(this.start_).mergeFrom(var1).buildPartial();
         } else {
            this.start_ = var1;
         }

         this.onChanged();
      } else {
         this.startBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Training$PbExerciseBase$Builder mergeTrainingLoad(Structures$PbTrainingLoad var1) {
      if (this.trainingLoadBuilder_ == null) {
         if ((this.bitField0_ & 32) == 32 && this.trainingLoad_ != null && this.trainingLoad_ != Structures$PbTrainingLoad.getDefaultInstance()) {
            this.trainingLoad_ = Structures$PbTrainingLoad.newBuilder(this.trainingLoad_).mergeFrom(var1).buildPartial();
         } else {
            this.trainingLoad_ = var1;
         }

         this.onChanged();
      } else {
         this.trainingLoadBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public final Training$PbExerciseBase$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Training$PbExerciseBase$Builder)super.mergeUnknownFields(var1);
   }

   public Training$PbExerciseBase$Builder mergeWalkingDuration(Types$PbDuration var1) {
      if (this.walkingDurationBuilder_ == null) {
         if ((this.bitField0_ & 65536) == 65536 && this.walkingDuration_ != null && this.walkingDuration_ != Types$PbDuration.getDefaultInstance()) {
            this.walkingDuration_ = Types$PbDuration.newBuilder(this.walkingDuration_).mergeFrom(var1).buildPartial();
         } else {
            this.walkingDuration_ = var1;
         }

         this.onChanged();
      } else {
         this.walkingDurationBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 65536;
      return this;
   }

   public Training$PbExerciseBase$Builder removeSensorCalibrationOffset(int var1) {
      if (this.sensorCalibrationOffsetBuilder_ == null) {
         this.ensureSensorCalibrationOffsetIsMutable();
         this.sensorCalibrationOffset_.remove(var1);
         this.onChanged();
      } else {
         this.sensorCalibrationOffsetBuilder_.remove(var1);
      }

      return this;
   }

   public Training$PbExerciseBase$Builder setAccumulatedTorque(int var1) {
      this.bitField0_ |= 131072;
      this.accumulatedTorque_ = var1;
      this.onChanged();
      return this;
   }

   public Training$PbExerciseBase$Builder setAscent(float var1) {
      this.bitField0_ |= 256;
      this.ascent_ = var1;
      this.onChanged();
      return this;
   }

   public Training$PbExerciseBase$Builder setAvailableSensorFeatures(int var1, Types$PbFeatureType var2) {
      if (var2 == null) {
         throw new NullPointerException();
      } else {
         this.ensureAvailableSensorFeaturesIsMutable();
         this.availableSensorFeatures_.set(var1, var2.getNumber());
         this.onChanged();
         return this;
      }
   }

   public Training$PbExerciseBase$Builder setCalories(int var1) {
      this.bitField0_ |= 16;
      this.calories_ = var1;
      this.onChanged();
      return this;
   }

   public Training$PbExerciseBase$Builder setCyclingPowerEnergy(int var1) {
      this.bitField0_ |= 262144;
      this.cyclingPowerEnergy_ = var1;
      this.onChanged();
      return this;
   }

   public Training$PbExerciseBase$Builder setDescent(float var1) {
      this.bitField0_ |= 512;
      this.descent_ = var1;
      this.onChanged();
      return this;
   }

   public Training$PbExerciseBase$Builder setDeviceLocation(Types$PbDeviceLocation var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1048576;
         this.deviceLocation_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public Training$PbExerciseBase$Builder setDistance(float var1) {
      this.bitField0_ |= 8;
      this.distance_ = var1;
      this.onChanged();
      return this;
   }

   public Training$PbExerciseBase$Builder setDuration(Types$PbDuration$Builder var1) {
      if (this.durationBuilder_ == null) {
         this.duration_ = var1.build();
         this.onChanged();
      } else {
         this.durationBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Training$PbExerciseBase$Builder setDuration(Types$PbDuration var1) {
      if (this.durationBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.duration_ = var1;
         this.onChanged();
      } else {
         this.durationBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Training$PbExerciseBase$Builder setExerciseCounters(Training$PbExerciseCounters$Builder var1) {
      if (this.exerciseCountersBuilder_ == null) {
         this.exerciseCounters_ = var1.build();
         this.onChanged();
      } else {
         this.exerciseCountersBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8192;
      return this;
   }

   public Training$PbExerciseBase$Builder setExerciseCounters(Training$PbExerciseCounters var1) {
      if (this.exerciseCountersBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.exerciseCounters_ = var1;
         this.onChanged();
      } else {
         this.exerciseCountersBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8192;
      return this;
   }

   public Training$PbExerciseBase$Builder setField(FieldDescriptor var1, Object var2) {
      return (Training$PbExerciseBase$Builder)super.setField(var1, var2);
   }

   public Training$PbExerciseBase$Builder setLatitude(double var1) {
      this.bitField0_ |= 1024;
      this.latitude_ = var1;
      this.onChanged();
      return this;
   }

   public Training$PbExerciseBase$Builder setLongitude(double var1) {
      this.bitField0_ |= 2048;
      this.longitude_ = var1;
      this.onChanged();
      return this;
   }

   public Training$PbExerciseBase$Builder setOBSOLETESpeedCalibrationOffset(float var1) {
      this.bitField0_ |= 16384;
      this.oBSOLETESpeedCalibrationOffset_ = var1;
      this.onChanged();
      return this;
   }

   public Training$PbExerciseBase$Builder setPlace(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 4096;
         this.place_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Training$PbExerciseBase$Builder setPlaceBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 4096;
         this.place_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Training$PbExerciseBase$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Training$PbExerciseBase$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Training$PbExerciseBase$Builder setRunningIndex(Structures$PbRunningIndex$Builder var1) {
      if (this.runningIndexBuilder_ == null) {
         this.runningIndex_ = var1.build();
         this.onChanged();
      } else {
         this.runningIndexBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 128;
      return this;
   }

   public Training$PbExerciseBase$Builder setRunningIndex(Structures$PbRunningIndex var1) {
      if (this.runningIndexBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.runningIndex_ = var1;
         this.onChanged();
      } else {
         this.runningIndexBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 128;
      return this;
   }

   public Training$PbExerciseBase$Builder setSensorCalibrationOffset(int var1, Types$PbSensorCalibrationOffset$Builder var2) {
      if (this.sensorCalibrationOffsetBuilder_ == null) {
         this.ensureSensorCalibrationOffsetIsMutable();
         this.sensorCalibrationOffset_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.sensorCalibrationOffsetBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public Training$PbExerciseBase$Builder setSensorCalibrationOffset(int var1, Types$PbSensorCalibrationOffset var2) {
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

   public Training$PbExerciseBase$Builder setSport(Structures$PbSportIdentifier$Builder var1) {
      if (this.sportBuilder_ == null) {
         this.sport_ = var1.build();
         this.onChanged();
      } else {
         this.sportBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public Training$PbExerciseBase$Builder setSport(Structures$PbSportIdentifier var1) {
      if (this.sportBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.sport_ = var1;
         this.onChanged();
      } else {
         this.sportBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public Training$PbExerciseBase$Builder setStart(Types$PbLocalDateTime$Builder var1) {
      if (this.startBuilder_ == null) {
         this.start_ = var1.build();
         this.onChanged();
      } else {
         this.startBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Training$PbExerciseBase$Builder setStart(Types$PbLocalDateTime var1) {
      if (this.startBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.start_ = var1;
         this.onChanged();
      } else {
         this.startBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Training$PbExerciseBase$Builder setTrainingLoad(Structures$PbTrainingLoad$Builder var1) {
      if (this.trainingLoadBuilder_ == null) {
         this.trainingLoad_ = var1.build();
         this.onChanged();
      } else {
         this.trainingLoadBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 32;
      return this;
   }

   public Training$PbExerciseBase$Builder setTrainingLoad(Structures$PbTrainingLoad var1) {
      if (this.trainingLoadBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.trainingLoad_ = var1;
         this.onChanged();
      } else {
         this.trainingLoadBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public final Training$PbExerciseBase$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Training$PbExerciseBase$Builder)super.setUnknownFields(var1);
   }

   public Training$PbExerciseBase$Builder setWalkingDistance(float var1) {
      this.bitField0_ |= 32768;
      this.walkingDistance_ = var1;
      this.onChanged();
      return this;
   }

   public Training$PbExerciseBase$Builder setWalkingDuration(Types$PbDuration$Builder var1) {
      if (this.walkingDurationBuilder_ == null) {
         this.walkingDuration_ = var1.build();
         this.onChanged();
      } else {
         this.walkingDurationBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 65536;
      return this;
   }

   public Training$PbExerciseBase$Builder setWalkingDuration(Types$PbDuration var1) {
      if (this.walkingDurationBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.walkingDuration_ = var1;
         this.onChanged();
      } else {
         this.walkingDurationBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 65536;
      return this;
   }
}
