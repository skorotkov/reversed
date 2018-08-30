package fi.polar.remote.representation.protobuf;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class ExerciseStatistics$PbExerciseStatistics$Builder extends Builder implements ExerciseStatistics$PbExerciseStatisticsOrBuilder {
   private SingleFieldBuilderV3 activityBuilder_;
   private ExerciseStatistics$PbActivityStatistics activity_;
   private SingleFieldBuilderV3 altitudeBuilder_;
   private ExerciseStatistics$PbAltitudeStatistics altitude_;
   private int bitField0_;
   private SingleFieldBuilderV3 cadenceBuilder_;
   private ExerciseStatistics$PbCadenceStatistics cadence_;
   private SingleFieldBuilderV3 declineBuilder_;
   private ExerciseStatistics$PbDeclineStatistics decline_;
   private SingleFieldBuilderV3 heartRateBuilder_;
   private ExerciseStatistics$PbHeartRateStatistics heartRate_;
   private SingleFieldBuilderV3 inclineBuilder_;
   private ExerciseStatistics$PbInclineStatistics incline_;
   private SingleFieldBuilderV3 leftRightBalanceBuilder_;
   private ExerciseStatistics$PbLRBalanceStatistics leftRightBalance_;
   private SingleFieldBuilderV3 powerBuilder_;
   private ExerciseStatistics$PbPowerStatistics power_;
   private SingleFieldBuilderV3 speedBuilder_;
   private ExerciseStatistics$PbSpeedStatistics speed_;
   private SingleFieldBuilderV3 strideLengthBuilder_;
   private ExerciseStatistics$PbStrideLengthStatistics strideLength_;
   private SingleFieldBuilderV3 swimmingBuilder_;
   private ExerciseStatistics$PbSwimmingStatistics swimming_;
   private SingleFieldBuilderV3 temperatureBuilder_;
   private ExerciseStatistics$PbTemperatureStatistics temperature_;
   private SingleFieldBuilderV3 trainingPeaksBuilder_;
   private ExerciseStatistics$PbTrainingPeaksStatistics trainingPeaks_;

   private ExerciseStatistics$PbExerciseStatistics$Builder() {
      this.heartRate_ = null;
      this.speed_ = null;
      this.cadence_ = null;
      this.altitude_ = null;
      this.power_ = null;
      this.leftRightBalance_ = null;
      this.temperature_ = null;
      this.activity_ = null;
      this.strideLength_ = null;
      this.incline_ = null;
      this.decline_ = null;
      this.swimming_ = null;
      this.trainingPeaks_ = null;
      this.maybeForceBuilderInitialization();
   }

   private ExerciseStatistics$PbExerciseStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.heartRate_ = null;
      this.speed_ = null;
      this.cadence_ = null;
      this.altitude_ = null;
      this.power_ = null;
      this.leftRightBalance_ = null;
      this.temperature_ = null;
      this.activity_ = null;
      this.strideLength_ = null;
      this.incline_ = null;
      this.decline_ = null;
      this.swimming_ = null;
      this.trainingPeaks_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseStatistics$PbExerciseStatistics$Builder(BuilderParent var1, ExerciseStatistics$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseStatistics$PbExerciseStatistics$Builder(ExerciseStatistics$1 var1) {
      this();
   }

   private SingleFieldBuilderV3 getActivityFieldBuilder() {
      if (this.activityBuilder_ == null) {
         this.activityBuilder_ = new SingleFieldBuilderV3(this.getActivity(), this.getParentForChildren(), this.isClean());
         this.activity_ = null;
      }

      return this.activityBuilder_;
   }

   private SingleFieldBuilderV3 getAltitudeFieldBuilder() {
      if (this.altitudeBuilder_ == null) {
         this.altitudeBuilder_ = new SingleFieldBuilderV3(this.getAltitude(), this.getParentForChildren(), this.isClean());
         this.altitude_ = null;
      }

      return this.altitudeBuilder_;
   }

   private SingleFieldBuilderV3 getCadenceFieldBuilder() {
      if (this.cadenceBuilder_ == null) {
         this.cadenceBuilder_ = new SingleFieldBuilderV3(this.getCadence(), this.getParentForChildren(), this.isClean());
         this.cadence_ = null;
      }

      return this.cadenceBuilder_;
   }

   private SingleFieldBuilderV3 getDeclineFieldBuilder() {
      if (this.declineBuilder_ == null) {
         this.declineBuilder_ = new SingleFieldBuilderV3(this.getDecline(), this.getParentForChildren(), this.isClean());
         this.decline_ = null;
      }

      return this.declineBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseStatistics.G();
   }

   private SingleFieldBuilderV3 getHeartRateFieldBuilder() {
      if (this.heartRateBuilder_ == null) {
         this.heartRateBuilder_ = new SingleFieldBuilderV3(this.getHeartRate(), this.getParentForChildren(), this.isClean());
         this.heartRate_ = null;
      }

      return this.heartRateBuilder_;
   }

   private SingleFieldBuilderV3 getInclineFieldBuilder() {
      if (this.inclineBuilder_ == null) {
         this.inclineBuilder_ = new SingleFieldBuilderV3(this.getIncline(), this.getParentForChildren(), this.isClean());
         this.incline_ = null;
      }

      return this.inclineBuilder_;
   }

   private SingleFieldBuilderV3 getLeftRightBalanceFieldBuilder() {
      if (this.leftRightBalanceBuilder_ == null) {
         this.leftRightBalanceBuilder_ = new SingleFieldBuilderV3(this.getLeftRightBalance(), this.getParentForChildren(), this.isClean());
         this.leftRightBalance_ = null;
      }

      return this.leftRightBalanceBuilder_;
   }

   private SingleFieldBuilderV3 getPowerFieldBuilder() {
      if (this.powerBuilder_ == null) {
         this.powerBuilder_ = new SingleFieldBuilderV3(this.getPower(), this.getParentForChildren(), this.isClean());
         this.power_ = null;
      }

      return this.powerBuilder_;
   }

   private SingleFieldBuilderV3 getSpeedFieldBuilder() {
      if (this.speedBuilder_ == null) {
         this.speedBuilder_ = new SingleFieldBuilderV3(this.getSpeed(), this.getParentForChildren(), this.isClean());
         this.speed_ = null;
      }

      return this.speedBuilder_;
   }

   private SingleFieldBuilderV3 getStrideLengthFieldBuilder() {
      if (this.strideLengthBuilder_ == null) {
         this.strideLengthBuilder_ = new SingleFieldBuilderV3(this.getStrideLength(), this.getParentForChildren(), this.isClean());
         this.strideLength_ = null;
      }

      return this.strideLengthBuilder_;
   }

   private SingleFieldBuilderV3 getSwimmingFieldBuilder() {
      if (this.swimmingBuilder_ == null) {
         this.swimmingBuilder_ = new SingleFieldBuilderV3(this.getSwimming(), this.getParentForChildren(), this.isClean());
         this.swimming_ = null;
      }

      return this.swimmingBuilder_;
   }

   private SingleFieldBuilderV3 getTemperatureFieldBuilder() {
      if (this.temperatureBuilder_ == null) {
         this.temperatureBuilder_ = new SingleFieldBuilderV3(this.getTemperature(), this.getParentForChildren(), this.isClean());
         this.temperature_ = null;
      }

      return this.temperatureBuilder_;
   }

   private SingleFieldBuilderV3 getTrainingPeaksFieldBuilder() {
      if (this.trainingPeaksBuilder_ == null) {
         this.trainingPeaksBuilder_ = new SingleFieldBuilderV3(this.getTrainingPeaks(), this.getParentForChildren(), this.isClean());
         this.trainingPeaks_ = null;
      }

      return this.trainingPeaksBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseStatistics$PbExerciseStatistics.b()) {
         this.getHeartRateFieldBuilder();
         this.getSpeedFieldBuilder();
         this.getCadenceFieldBuilder();
         this.getAltitudeFieldBuilder();
         this.getPowerFieldBuilder();
         this.getLeftRightBalanceFieldBuilder();
         this.getTemperatureFieldBuilder();
         this.getActivityFieldBuilder();
         this.getStrideLengthFieldBuilder();
         this.getInclineFieldBuilder();
         this.getDeclineFieldBuilder();
         this.getSwimmingFieldBuilder();
         this.getTrainingPeaksFieldBuilder();
      }

   }

   public ExerciseStatistics$PbExerciseStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbExerciseStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseStatistics$PbExerciseStatistics build() {
      ExerciseStatistics$PbExerciseStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseStatistics$PbExerciseStatistics buildPartial() {
      ExerciseStatistics$PbExerciseStatistics var1 = new ExerciseStatistics$PbExerciseStatistics(this, (ExerciseStatistics$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.heartRateBuilder_ == null) {
         ExerciseStatistics$PbExerciseStatistics.a(var1, this.heartRate_);
      } else {
         ExerciseStatistics$PbExerciseStatistics.a(var1, (ExerciseStatistics$PbHeartRateStatistics)this.heartRateBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.speedBuilder_ == null) {
         ExerciseStatistics$PbExerciseStatistics.a(var1, this.speed_);
      } else {
         ExerciseStatistics$PbExerciseStatistics.a(var1, (ExerciseStatistics$PbSpeedStatistics)this.speedBuilder_.build());
      }

      int var6 = var4;
      if ((var2 & 4) == 4) {
         var6 = var4 | 4;
      }

      if (this.cadenceBuilder_ == null) {
         ExerciseStatistics$PbExerciseStatistics.a(var1, this.cadence_);
      } else {
         ExerciseStatistics$PbExerciseStatistics.a(var1, (ExerciseStatistics$PbCadenceStatistics)this.cadenceBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 8) == 8) {
         var4 = var6 | 8;
      }

      if (this.altitudeBuilder_ == null) {
         ExerciseStatistics$PbExerciseStatistics.a(var1, this.altitude_);
      } else {
         ExerciseStatistics$PbExerciseStatistics.a(var1, (ExerciseStatistics$PbAltitudeStatistics)this.altitudeBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 16) == 16) {
         var6 = var4 | 16;
      }

      if (this.powerBuilder_ == null) {
         ExerciseStatistics$PbExerciseStatistics.a(var1, this.power_);
      } else {
         ExerciseStatistics$PbExerciseStatistics.a(var1, (ExerciseStatistics$PbPowerStatistics)this.powerBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 32) == 32) {
         var4 = var6 | 32;
      }

      if (this.leftRightBalanceBuilder_ == null) {
         ExerciseStatistics$PbExerciseStatistics.a(var1, this.leftRightBalance_);
      } else {
         ExerciseStatistics$PbExerciseStatistics.a(var1, (ExerciseStatistics$PbLRBalanceStatistics)this.leftRightBalanceBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 64) == 64) {
         var6 = var4 | 64;
      }

      if (this.temperatureBuilder_ == null) {
         ExerciseStatistics$PbExerciseStatistics.a(var1, this.temperature_);
      } else {
         ExerciseStatistics$PbExerciseStatistics.a(var1, (ExerciseStatistics$PbTemperatureStatistics)this.temperatureBuilder_.build());
      }

      int var5 = var6;
      if ((var2 & 128) == 128) {
         var5 = var6 | 128;
      }

      if (this.activityBuilder_ == null) {
         ExerciseStatistics$PbExerciseStatistics.a(var1, this.activity_);
      } else {
         ExerciseStatistics$PbExerciseStatistics.a(var1, (ExerciseStatistics$PbActivityStatistics)this.activityBuilder_.build());
      }

      var4 = var5;
      if ((var2 & 256) == 256) {
         var4 = var5 | 256;
      }

      if (this.strideLengthBuilder_ == null) {
         ExerciseStatistics$PbExerciseStatistics.a(var1, this.strideLength_);
      } else {
         ExerciseStatistics$PbExerciseStatistics.a(var1, (ExerciseStatistics$PbStrideLengthStatistics)this.strideLengthBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 512) == 512) {
         var6 = var4 | 512;
      }

      if (this.inclineBuilder_ == null) {
         ExerciseStatistics$PbExerciseStatistics.a(var1, this.incline_);
      } else {
         ExerciseStatistics$PbExerciseStatistics.a(var1, (ExerciseStatistics$PbInclineStatistics)this.inclineBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 1024) == 1024) {
         var4 = var6 | 1024;
      }

      if (this.declineBuilder_ == null) {
         ExerciseStatistics$PbExerciseStatistics.a(var1, this.decline_);
      } else {
         ExerciseStatistics$PbExerciseStatistics.a(var1, (ExerciseStatistics$PbDeclineStatistics)this.declineBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 2048) == 2048) {
         var6 = var4 | 2048;
      }

      if (this.swimmingBuilder_ == null) {
         ExerciseStatistics$PbExerciseStatistics.a(var1, this.swimming_);
      } else {
         ExerciseStatistics$PbExerciseStatistics.a(var1, (ExerciseStatistics$PbSwimmingStatistics)this.swimmingBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 4096) == 4096) {
         var4 = var6 | 4096;
      }

      if (this.trainingPeaksBuilder_ == null) {
         ExerciseStatistics$PbExerciseStatistics.a(var1, this.trainingPeaks_);
      } else {
         ExerciseStatistics$PbExerciseStatistics.a(var1, (ExerciseStatistics$PbTrainingPeaksStatistics)this.trainingPeaksBuilder_.build());
      }

      ExerciseStatistics$PbExerciseStatistics.a(var1, var4);
      this.onBuilt();
      return var1;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder clear() {
      super.clear();
      if (this.heartRateBuilder_ == null) {
         this.heartRate_ = null;
      } else {
         this.heartRateBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.speedBuilder_ == null) {
         this.speed_ = null;
      } else {
         this.speedBuilder_.clear();
      }

      this.bitField0_ &= -3;
      if (this.cadenceBuilder_ == null) {
         this.cadence_ = null;
      } else {
         this.cadenceBuilder_.clear();
      }

      this.bitField0_ &= -5;
      if (this.altitudeBuilder_ == null) {
         this.altitude_ = null;
      } else {
         this.altitudeBuilder_.clear();
      }

      this.bitField0_ &= -9;
      if (this.powerBuilder_ == null) {
         this.power_ = null;
      } else {
         this.powerBuilder_.clear();
      }

      this.bitField0_ &= -17;
      if (this.leftRightBalanceBuilder_ == null) {
         this.leftRightBalance_ = null;
      } else {
         this.leftRightBalanceBuilder_.clear();
      }

      this.bitField0_ &= -33;
      if (this.temperatureBuilder_ == null) {
         this.temperature_ = null;
      } else {
         this.temperatureBuilder_.clear();
      }

      this.bitField0_ &= -65;
      if (this.activityBuilder_ == null) {
         this.activity_ = null;
      } else {
         this.activityBuilder_.clear();
      }

      this.bitField0_ &= -129;
      if (this.strideLengthBuilder_ == null) {
         this.strideLength_ = null;
      } else {
         this.strideLengthBuilder_.clear();
      }

      this.bitField0_ &= -257;
      if (this.inclineBuilder_ == null) {
         this.incline_ = null;
      } else {
         this.inclineBuilder_.clear();
      }

      this.bitField0_ &= -513;
      if (this.declineBuilder_ == null) {
         this.decline_ = null;
      } else {
         this.declineBuilder_.clear();
      }

      this.bitField0_ &= -1025;
      if (this.swimmingBuilder_ == null) {
         this.swimming_ = null;
      } else {
         this.swimmingBuilder_.clear();
      }

      this.bitField0_ &= -2049;
      if (this.trainingPeaksBuilder_ == null) {
         this.trainingPeaks_ = null;
      } else {
         this.trainingPeaksBuilder_.clear();
      }

      this.bitField0_ &= -4097;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder clearActivity() {
      if (this.activityBuilder_ == null) {
         this.activity_ = null;
         this.onChanged();
      } else {
         this.activityBuilder_.clear();
      }

      this.bitField0_ &= -129;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder clearAltitude() {
      if (this.altitudeBuilder_ == null) {
         this.altitude_ = null;
         this.onChanged();
      } else {
         this.altitudeBuilder_.clear();
      }

      this.bitField0_ &= -9;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder clearCadence() {
      if (this.cadenceBuilder_ == null) {
         this.cadence_ = null;
         this.onChanged();
      } else {
         this.cadenceBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder clearDecline() {
      if (this.declineBuilder_ == null) {
         this.decline_ = null;
         this.onChanged();
      } else {
         this.declineBuilder_.clear();
      }

      this.bitField0_ &= -1025;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseStatistics$PbExerciseStatistics$Builder)super.clearField(var1);
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder clearHeartRate() {
      if (this.heartRateBuilder_ == null) {
         this.heartRate_ = null;
         this.onChanged();
      } else {
         this.heartRateBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder clearIncline() {
      if (this.inclineBuilder_ == null) {
         this.incline_ = null;
         this.onChanged();
      } else {
         this.inclineBuilder_.clear();
      }

      this.bitField0_ &= -513;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder clearLeftRightBalance() {
      if (this.leftRightBalanceBuilder_ == null) {
         this.leftRightBalance_ = null;
         this.onChanged();
      } else {
         this.leftRightBalanceBuilder_.clear();
      }

      this.bitField0_ &= -33;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseStatistics$PbExerciseStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder clearPower() {
      if (this.powerBuilder_ == null) {
         this.power_ = null;
         this.onChanged();
      } else {
         this.powerBuilder_.clear();
      }

      this.bitField0_ &= -17;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder clearSpeed() {
      if (this.speedBuilder_ == null) {
         this.speed_ = null;
         this.onChanged();
      } else {
         this.speedBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder clearStrideLength() {
      if (this.strideLengthBuilder_ == null) {
         this.strideLength_ = null;
         this.onChanged();
      } else {
         this.strideLengthBuilder_.clear();
      }

      this.bitField0_ &= -257;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder clearSwimming() {
      if (this.swimmingBuilder_ == null) {
         this.swimming_ = null;
         this.onChanged();
      } else {
         this.swimmingBuilder_.clear();
      }

      this.bitField0_ &= -2049;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder clearTemperature() {
      if (this.temperatureBuilder_ == null) {
         this.temperature_ = null;
         this.onChanged();
      } else {
         this.temperatureBuilder_.clear();
      }

      this.bitField0_ &= -65;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder clearTrainingPeaks() {
      if (this.trainingPeaksBuilder_ == null) {
         this.trainingPeaks_ = null;
         this.onChanged();
      } else {
         this.trainingPeaksBuilder_.clear();
      }

      this.bitField0_ &= -4097;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder clone() {
      return (ExerciseStatistics$PbExerciseStatistics$Builder)super.clone();
   }

   public ExerciseStatistics$PbActivityStatistics getActivity() {
      ExerciseStatistics$PbActivityStatistics var1;
      if (this.activityBuilder_ == null) {
         if (this.activity_ == null) {
            var1 = ExerciseStatistics$PbActivityStatistics.getDefaultInstance();
         } else {
            var1 = this.activity_;
         }
      } else {
         var1 = (ExerciseStatistics$PbActivityStatistics)this.activityBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseStatistics$PbActivityStatistics$Builder getActivityBuilder() {
      this.bitField0_ |= 128;
      this.onChanged();
      return (ExerciseStatistics$PbActivityStatistics$Builder)this.getActivityFieldBuilder().getBuilder();
   }

   public ExerciseStatistics$PbActivityStatisticsOrBuilder getActivityOrBuilder() {
      Object var1;
      if (this.activityBuilder_ != null) {
         var1 = (ExerciseStatistics$PbActivityStatisticsOrBuilder)this.activityBuilder_.getMessageOrBuilder();
      } else if (this.activity_ == null) {
         var1 = ExerciseStatistics$PbActivityStatistics.getDefaultInstance();
      } else {
         var1 = this.activity_;
      }

      return (ExerciseStatistics$PbActivityStatisticsOrBuilder)var1;
   }

   public ExerciseStatistics$PbAltitudeStatistics getAltitude() {
      ExerciseStatistics$PbAltitudeStatistics var1;
      if (this.altitudeBuilder_ == null) {
         if (this.altitude_ == null) {
            var1 = ExerciseStatistics$PbAltitudeStatistics.getDefaultInstance();
         } else {
            var1 = this.altitude_;
         }
      } else {
         var1 = (ExerciseStatistics$PbAltitudeStatistics)this.altitudeBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseStatistics$PbAltitudeStatistics$Builder getAltitudeBuilder() {
      this.bitField0_ |= 8;
      this.onChanged();
      return (ExerciseStatistics$PbAltitudeStatistics$Builder)this.getAltitudeFieldBuilder().getBuilder();
   }

   public ExerciseStatistics$PbAltitudeStatisticsOrBuilder getAltitudeOrBuilder() {
      Object var1;
      if (this.altitudeBuilder_ != null) {
         var1 = (ExerciseStatistics$PbAltitudeStatisticsOrBuilder)this.altitudeBuilder_.getMessageOrBuilder();
      } else if (this.altitude_ == null) {
         var1 = ExerciseStatistics$PbAltitudeStatistics.getDefaultInstance();
      } else {
         var1 = this.altitude_;
      }

      return (ExerciseStatistics$PbAltitudeStatisticsOrBuilder)var1;
   }

   public ExerciseStatistics$PbCadenceStatistics getCadence() {
      ExerciseStatistics$PbCadenceStatistics var1;
      if (this.cadenceBuilder_ == null) {
         if (this.cadence_ == null) {
            var1 = ExerciseStatistics$PbCadenceStatistics.getDefaultInstance();
         } else {
            var1 = this.cadence_;
         }
      } else {
         var1 = (ExerciseStatistics$PbCadenceStatistics)this.cadenceBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseStatistics$PbCadenceStatistics$Builder getCadenceBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (ExerciseStatistics$PbCadenceStatistics$Builder)this.getCadenceFieldBuilder().getBuilder();
   }

   public ExerciseStatistics$PbCadenceStatisticsOrBuilder getCadenceOrBuilder() {
      Object var1;
      if (this.cadenceBuilder_ != null) {
         var1 = (ExerciseStatistics$PbCadenceStatisticsOrBuilder)this.cadenceBuilder_.getMessageOrBuilder();
      } else if (this.cadence_ == null) {
         var1 = ExerciseStatistics$PbCadenceStatistics.getDefaultInstance();
      } else {
         var1 = this.cadence_;
      }

      return (ExerciseStatistics$PbCadenceStatisticsOrBuilder)var1;
   }

   public ExerciseStatistics$PbDeclineStatistics getDecline() {
      ExerciseStatistics$PbDeclineStatistics var1;
      if (this.declineBuilder_ == null) {
         if (this.decline_ == null) {
            var1 = ExerciseStatistics$PbDeclineStatistics.getDefaultInstance();
         } else {
            var1 = this.decline_;
         }
      } else {
         var1 = (ExerciseStatistics$PbDeclineStatistics)this.declineBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseStatistics$PbDeclineStatistics$Builder getDeclineBuilder() {
      this.bitField0_ |= 1024;
      this.onChanged();
      return (ExerciseStatistics$PbDeclineStatistics$Builder)this.getDeclineFieldBuilder().getBuilder();
   }

   public ExerciseStatistics$PbDeclineStatisticsOrBuilder getDeclineOrBuilder() {
      Object var1;
      if (this.declineBuilder_ != null) {
         var1 = (ExerciseStatistics$PbDeclineStatisticsOrBuilder)this.declineBuilder_.getMessageOrBuilder();
      } else if (this.decline_ == null) {
         var1 = ExerciseStatistics$PbDeclineStatistics.getDefaultInstance();
      } else {
         var1 = this.decline_;
      }

      return (ExerciseStatistics$PbDeclineStatisticsOrBuilder)var1;
   }

   public ExerciseStatistics$PbExerciseStatistics getDefaultInstanceForType() {
      return ExerciseStatistics$PbExerciseStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseStatistics.G();
   }

   public ExerciseStatistics$PbHeartRateStatistics getHeartRate() {
      ExerciseStatistics$PbHeartRateStatistics var1;
      if (this.heartRateBuilder_ == null) {
         if (this.heartRate_ == null) {
            var1 = ExerciseStatistics$PbHeartRateStatistics.getDefaultInstance();
         } else {
            var1 = this.heartRate_;
         }
      } else {
         var1 = (ExerciseStatistics$PbHeartRateStatistics)this.heartRateBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseStatistics$PbHeartRateStatistics$Builder getHeartRateBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (ExerciseStatistics$PbHeartRateStatistics$Builder)this.getHeartRateFieldBuilder().getBuilder();
   }

   public ExerciseStatistics$PbHeartRateStatisticsOrBuilder getHeartRateOrBuilder() {
      Object var1;
      if (this.heartRateBuilder_ != null) {
         var1 = (ExerciseStatistics$PbHeartRateStatisticsOrBuilder)this.heartRateBuilder_.getMessageOrBuilder();
      } else if (this.heartRate_ == null) {
         var1 = ExerciseStatistics$PbHeartRateStatistics.getDefaultInstance();
      } else {
         var1 = this.heartRate_;
      }

      return (ExerciseStatistics$PbHeartRateStatisticsOrBuilder)var1;
   }

   public ExerciseStatistics$PbInclineStatistics getIncline() {
      ExerciseStatistics$PbInclineStatistics var1;
      if (this.inclineBuilder_ == null) {
         if (this.incline_ == null) {
            var1 = ExerciseStatistics$PbInclineStatistics.getDefaultInstance();
         } else {
            var1 = this.incline_;
         }
      } else {
         var1 = (ExerciseStatistics$PbInclineStatistics)this.inclineBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseStatistics$PbInclineStatistics$Builder getInclineBuilder() {
      this.bitField0_ |= 512;
      this.onChanged();
      return (ExerciseStatistics$PbInclineStatistics$Builder)this.getInclineFieldBuilder().getBuilder();
   }

   public ExerciseStatistics$PbInclineStatisticsOrBuilder getInclineOrBuilder() {
      Object var1;
      if (this.inclineBuilder_ != null) {
         var1 = (ExerciseStatistics$PbInclineStatisticsOrBuilder)this.inclineBuilder_.getMessageOrBuilder();
      } else if (this.incline_ == null) {
         var1 = ExerciseStatistics$PbInclineStatistics.getDefaultInstance();
      } else {
         var1 = this.incline_;
      }

      return (ExerciseStatistics$PbInclineStatisticsOrBuilder)var1;
   }

   public ExerciseStatistics$PbLRBalanceStatistics getLeftRightBalance() {
      ExerciseStatistics$PbLRBalanceStatistics var1;
      if (this.leftRightBalanceBuilder_ == null) {
         if (this.leftRightBalance_ == null) {
            var1 = ExerciseStatistics$PbLRBalanceStatistics.getDefaultInstance();
         } else {
            var1 = this.leftRightBalance_;
         }
      } else {
         var1 = (ExerciseStatistics$PbLRBalanceStatistics)this.leftRightBalanceBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseStatistics$PbLRBalanceStatistics$Builder getLeftRightBalanceBuilder() {
      this.bitField0_ |= 32;
      this.onChanged();
      return (ExerciseStatistics$PbLRBalanceStatistics$Builder)this.getLeftRightBalanceFieldBuilder().getBuilder();
   }

   public ExerciseStatistics$PbLRBalanceStatisticsOrBuilder getLeftRightBalanceOrBuilder() {
      Object var1;
      if (this.leftRightBalanceBuilder_ != null) {
         var1 = (ExerciseStatistics$PbLRBalanceStatisticsOrBuilder)this.leftRightBalanceBuilder_.getMessageOrBuilder();
      } else if (this.leftRightBalance_ == null) {
         var1 = ExerciseStatistics$PbLRBalanceStatistics.getDefaultInstance();
      } else {
         var1 = this.leftRightBalance_;
      }

      return (ExerciseStatistics$PbLRBalanceStatisticsOrBuilder)var1;
   }

   public ExerciseStatistics$PbPowerStatistics getPower() {
      ExerciseStatistics$PbPowerStatistics var1;
      if (this.powerBuilder_ == null) {
         if (this.power_ == null) {
            var1 = ExerciseStatistics$PbPowerStatistics.getDefaultInstance();
         } else {
            var1 = this.power_;
         }
      } else {
         var1 = (ExerciseStatistics$PbPowerStatistics)this.powerBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseStatistics$PbPowerStatistics$Builder getPowerBuilder() {
      this.bitField0_ |= 16;
      this.onChanged();
      return (ExerciseStatistics$PbPowerStatistics$Builder)this.getPowerFieldBuilder().getBuilder();
   }

   public ExerciseStatistics$PbPowerStatisticsOrBuilder getPowerOrBuilder() {
      Object var1;
      if (this.powerBuilder_ != null) {
         var1 = (ExerciseStatistics$PbPowerStatisticsOrBuilder)this.powerBuilder_.getMessageOrBuilder();
      } else if (this.power_ == null) {
         var1 = ExerciseStatistics$PbPowerStatistics.getDefaultInstance();
      } else {
         var1 = this.power_;
      }

      return (ExerciseStatistics$PbPowerStatisticsOrBuilder)var1;
   }

   public ExerciseStatistics$PbSpeedStatistics getSpeed() {
      ExerciseStatistics$PbSpeedStatistics var1;
      if (this.speedBuilder_ == null) {
         if (this.speed_ == null) {
            var1 = ExerciseStatistics$PbSpeedStatistics.getDefaultInstance();
         } else {
            var1 = this.speed_;
         }
      } else {
         var1 = (ExerciseStatistics$PbSpeedStatistics)this.speedBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseStatistics$PbSpeedStatistics$Builder getSpeedBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (ExerciseStatistics$PbSpeedStatistics$Builder)this.getSpeedFieldBuilder().getBuilder();
   }

   public ExerciseStatistics$PbSpeedStatisticsOrBuilder getSpeedOrBuilder() {
      Object var1;
      if (this.speedBuilder_ != null) {
         var1 = (ExerciseStatistics$PbSpeedStatisticsOrBuilder)this.speedBuilder_.getMessageOrBuilder();
      } else if (this.speed_ == null) {
         var1 = ExerciseStatistics$PbSpeedStatistics.getDefaultInstance();
      } else {
         var1 = this.speed_;
      }

      return (ExerciseStatistics$PbSpeedStatisticsOrBuilder)var1;
   }

   public ExerciseStatistics$PbStrideLengthStatistics getStrideLength() {
      ExerciseStatistics$PbStrideLengthStatistics var1;
      if (this.strideLengthBuilder_ == null) {
         if (this.strideLength_ == null) {
            var1 = ExerciseStatistics$PbStrideLengthStatistics.getDefaultInstance();
         } else {
            var1 = this.strideLength_;
         }
      } else {
         var1 = (ExerciseStatistics$PbStrideLengthStatistics)this.strideLengthBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseStatistics$PbStrideLengthStatistics$Builder getStrideLengthBuilder() {
      this.bitField0_ |= 256;
      this.onChanged();
      return (ExerciseStatistics$PbStrideLengthStatistics$Builder)this.getStrideLengthFieldBuilder().getBuilder();
   }

   public ExerciseStatistics$PbStrideLengthStatisticsOrBuilder getStrideLengthOrBuilder() {
      Object var1;
      if (this.strideLengthBuilder_ != null) {
         var1 = (ExerciseStatistics$PbStrideLengthStatisticsOrBuilder)this.strideLengthBuilder_.getMessageOrBuilder();
      } else if (this.strideLength_ == null) {
         var1 = ExerciseStatistics$PbStrideLengthStatistics.getDefaultInstance();
      } else {
         var1 = this.strideLength_;
      }

      return (ExerciseStatistics$PbStrideLengthStatisticsOrBuilder)var1;
   }

   public ExerciseStatistics$PbSwimmingStatistics getSwimming() {
      ExerciseStatistics$PbSwimmingStatistics var1;
      if (this.swimmingBuilder_ == null) {
         if (this.swimming_ == null) {
            var1 = ExerciseStatistics$PbSwimmingStatistics.getDefaultInstance();
         } else {
            var1 = this.swimming_;
         }
      } else {
         var1 = (ExerciseStatistics$PbSwimmingStatistics)this.swimmingBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder getSwimmingBuilder() {
      this.bitField0_ |= 2048;
      this.onChanged();
      return (ExerciseStatistics$PbSwimmingStatistics$Builder)this.getSwimmingFieldBuilder().getBuilder();
   }

   public ExerciseStatistics$PbSwimmingStatisticsOrBuilder getSwimmingOrBuilder() {
      Object var1;
      if (this.swimmingBuilder_ != null) {
         var1 = (ExerciseStatistics$PbSwimmingStatisticsOrBuilder)this.swimmingBuilder_.getMessageOrBuilder();
      } else if (this.swimming_ == null) {
         var1 = ExerciseStatistics$PbSwimmingStatistics.getDefaultInstance();
      } else {
         var1 = this.swimming_;
      }

      return (ExerciseStatistics$PbSwimmingStatisticsOrBuilder)var1;
   }

   public ExerciseStatistics$PbTemperatureStatistics getTemperature() {
      ExerciseStatistics$PbTemperatureStatistics var1;
      if (this.temperatureBuilder_ == null) {
         if (this.temperature_ == null) {
            var1 = ExerciseStatistics$PbTemperatureStatistics.getDefaultInstance();
         } else {
            var1 = this.temperature_;
         }
      } else {
         var1 = (ExerciseStatistics$PbTemperatureStatistics)this.temperatureBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseStatistics$PbTemperatureStatistics$Builder getTemperatureBuilder() {
      this.bitField0_ |= 64;
      this.onChanged();
      return (ExerciseStatistics$PbTemperatureStatistics$Builder)this.getTemperatureFieldBuilder().getBuilder();
   }

   public ExerciseStatistics$PbTemperatureStatisticsOrBuilder getTemperatureOrBuilder() {
      Object var1;
      if (this.temperatureBuilder_ != null) {
         var1 = (ExerciseStatistics$PbTemperatureStatisticsOrBuilder)this.temperatureBuilder_.getMessageOrBuilder();
      } else if (this.temperature_ == null) {
         var1 = ExerciseStatistics$PbTemperatureStatistics.getDefaultInstance();
      } else {
         var1 = this.temperature_;
      }

      return (ExerciseStatistics$PbTemperatureStatisticsOrBuilder)var1;
   }

   public ExerciseStatistics$PbTrainingPeaksStatistics getTrainingPeaks() {
      ExerciseStatistics$PbTrainingPeaksStatistics var1;
      if (this.trainingPeaksBuilder_ == null) {
         if (this.trainingPeaks_ == null) {
            var1 = ExerciseStatistics$PbTrainingPeaksStatistics.getDefaultInstance();
         } else {
            var1 = this.trainingPeaks_;
         }
      } else {
         var1 = (ExerciseStatistics$PbTrainingPeaksStatistics)this.trainingPeaksBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseStatistics$PbTrainingPeaksStatistics$Builder getTrainingPeaksBuilder() {
      this.bitField0_ |= 4096;
      this.onChanged();
      return (ExerciseStatistics$PbTrainingPeaksStatistics$Builder)this.getTrainingPeaksFieldBuilder().getBuilder();
   }

   public ExerciseStatistics$PbTrainingPeaksStatisticsOrBuilder getTrainingPeaksOrBuilder() {
      Object var1;
      if (this.trainingPeaksBuilder_ != null) {
         var1 = (ExerciseStatistics$PbTrainingPeaksStatisticsOrBuilder)this.trainingPeaksBuilder_.getMessageOrBuilder();
      } else if (this.trainingPeaks_ == null) {
         var1 = ExerciseStatistics$PbTrainingPeaksStatistics.getDefaultInstance();
      } else {
         var1 = this.trainingPeaks_;
      }

      return (ExerciseStatistics$PbTrainingPeaksStatisticsOrBuilder)var1;
   }

   public boolean hasActivity() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAltitude() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasCadence() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDecline() {
      boolean var1;
      if ((this.bitField0_ & 1024) == 1024) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasHeartRate() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasIncline() {
      boolean var1;
      if ((this.bitField0_ & 512) == 512) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLeftRightBalance() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPower() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSpeed() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStrideLength() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSwimming() {
      boolean var1;
      if ((this.bitField0_ & 2048) == 2048) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTemperature() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTrainingPeaks() {
      boolean var1;
      if ((this.bitField0_ & 4096) == 4096) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseStatistics.H().ensureFieldAccessorsInitialized(ExerciseStatistics$PbExerciseStatistics.class, ExerciseStatistics$PbExerciseStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (this.hasSwimming() && !this.getSwimming().isInitialized()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder mergeActivity(ExerciseStatistics$PbActivityStatistics var1) {
      if (this.activityBuilder_ == null) {
         if ((this.bitField0_ & 128) == 128 && this.activity_ != null && this.activity_ != ExerciseStatistics$PbActivityStatistics.getDefaultInstance()) {
            this.activity_ = ExerciseStatistics$PbActivityStatistics.newBuilder(this.activity_).mergeFrom(var1).buildPartial();
         } else {
            this.activity_ = var1;
         }

         this.onChanged();
      } else {
         this.activityBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 128;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder mergeAltitude(ExerciseStatistics$PbAltitudeStatistics var1) {
      if (this.altitudeBuilder_ == null) {
         if ((this.bitField0_ & 8) == 8 && this.altitude_ != null && this.altitude_ != ExerciseStatistics$PbAltitudeStatistics.getDefaultInstance()) {
            this.altitude_ = ExerciseStatistics$PbAltitudeStatistics.newBuilder(this.altitude_).mergeFrom(var1).buildPartial();
         } else {
            this.altitude_ = var1;
         }

         this.onChanged();
      } else {
         this.altitudeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder mergeCadence(ExerciseStatistics$PbCadenceStatistics var1) {
      if (this.cadenceBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.cadence_ != null && this.cadence_ != ExerciseStatistics$PbCadenceStatistics.getDefaultInstance()) {
            this.cadence_ = ExerciseStatistics$PbCadenceStatistics.newBuilder(this.cadence_).mergeFrom(var1).buildPartial();
         } else {
            this.cadence_ = var1;
         }

         this.onChanged();
      } else {
         this.cadenceBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder mergeDecline(ExerciseStatistics$PbDeclineStatistics var1) {
      if (this.declineBuilder_ == null) {
         if ((this.bitField0_ & 1024) == 1024 && this.decline_ != null && this.decline_ != ExerciseStatistics$PbDeclineStatistics.getDefaultInstance()) {
            this.decline_ = ExerciseStatistics$PbDeclineStatistics.newBuilder(this.decline_).mergeFrom(var1).buildPartial();
         } else {
            this.decline_ = var1;
         }

         this.onChanged();
      } else {
         this.declineBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseStatistics$PbExerciseStatistics var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (ExerciseStatistics$PbExerciseStatistics)ExerciseStatistics$PbExerciseStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (ExerciseStatistics$PbExerciseStatistics)var10.getUnfinishedMessage();
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

   public ExerciseStatistics$PbExerciseStatistics$Builder mergeFrom(Message var1) {
      ExerciseStatistics$PbExerciseStatistics$Builder var2;
      if (var1 instanceof ExerciseStatistics$PbExerciseStatistics) {
         var2 = this.mergeFrom((ExerciseStatistics$PbExerciseStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder mergeFrom(ExerciseStatistics$PbExerciseStatistics var1) {
      if (var1 != ExerciseStatistics$PbExerciseStatistics.getDefaultInstance()) {
         if (var1.hasHeartRate()) {
            this.mergeHeartRate(var1.getHeartRate());
         }

         if (var1.hasSpeed()) {
            this.mergeSpeed(var1.getSpeed());
         }

         if (var1.hasCadence()) {
            this.mergeCadence(var1.getCadence());
         }

         if (var1.hasAltitude()) {
            this.mergeAltitude(var1.getAltitude());
         }

         if (var1.hasPower()) {
            this.mergePower(var1.getPower());
         }

         if (var1.hasLeftRightBalance()) {
            this.mergeLeftRightBalance(var1.getLeftRightBalance());
         }

         if (var1.hasTemperature()) {
            this.mergeTemperature(var1.getTemperature());
         }

         if (var1.hasActivity()) {
            this.mergeActivity(var1.getActivity());
         }

         if (var1.hasStrideLength()) {
            this.mergeStrideLength(var1.getStrideLength());
         }

         if (var1.hasIncline()) {
            this.mergeIncline(var1.getIncline());
         }

         if (var1.hasDecline()) {
            this.mergeDecline(var1.getDecline());
         }

         if (var1.hasSwimming()) {
            this.mergeSwimming(var1.getSwimming());
         }

         if (var1.hasTrainingPeaks()) {
            this.mergeTrainingPeaks(var1.getTrainingPeaks());
         }

         this.mergeUnknownFields(ExerciseStatistics$PbExerciseStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder mergeHeartRate(ExerciseStatistics$PbHeartRateStatistics var1) {
      if (this.heartRateBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.heartRate_ != null && this.heartRate_ != ExerciseStatistics$PbHeartRateStatistics.getDefaultInstance()) {
            this.heartRate_ = ExerciseStatistics$PbHeartRateStatistics.newBuilder(this.heartRate_).mergeFrom(var1).buildPartial();
         } else {
            this.heartRate_ = var1;
         }

         this.onChanged();
      } else {
         this.heartRateBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder mergeIncline(ExerciseStatistics$PbInclineStatistics var1) {
      if (this.inclineBuilder_ == null) {
         if ((this.bitField0_ & 512) == 512 && this.incline_ != null && this.incline_ != ExerciseStatistics$PbInclineStatistics.getDefaultInstance()) {
            this.incline_ = ExerciseStatistics$PbInclineStatistics.newBuilder(this.incline_).mergeFrom(var1).buildPartial();
         } else {
            this.incline_ = var1;
         }

         this.onChanged();
      } else {
         this.inclineBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 512;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder mergeLeftRightBalance(ExerciseStatistics$PbLRBalanceStatistics var1) {
      if (this.leftRightBalanceBuilder_ == null) {
         if ((this.bitField0_ & 32) == 32 && this.leftRightBalance_ != null && this.leftRightBalance_ != ExerciseStatistics$PbLRBalanceStatistics.getDefaultInstance()) {
            this.leftRightBalance_ = ExerciseStatistics$PbLRBalanceStatistics.newBuilder(this.leftRightBalance_).mergeFrom(var1).buildPartial();
         } else {
            this.leftRightBalance_ = var1;
         }

         this.onChanged();
      } else {
         this.leftRightBalanceBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder mergePower(ExerciseStatistics$PbPowerStatistics var1) {
      if (this.powerBuilder_ == null) {
         if ((this.bitField0_ & 16) == 16 && this.power_ != null && this.power_ != ExerciseStatistics$PbPowerStatistics.getDefaultInstance()) {
            this.power_ = ExerciseStatistics$PbPowerStatistics.newBuilder(this.power_).mergeFrom(var1).buildPartial();
         } else {
            this.power_ = var1;
         }

         this.onChanged();
      } else {
         this.powerBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder mergeSpeed(ExerciseStatistics$PbSpeedStatistics var1) {
      if (this.speedBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.speed_ != null && this.speed_ != ExerciseStatistics$PbSpeedStatistics.getDefaultInstance()) {
            this.speed_ = ExerciseStatistics$PbSpeedStatistics.newBuilder(this.speed_).mergeFrom(var1).buildPartial();
         } else {
            this.speed_ = var1;
         }

         this.onChanged();
      } else {
         this.speedBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder mergeStrideLength(ExerciseStatistics$PbStrideLengthStatistics var1) {
      if (this.strideLengthBuilder_ == null) {
         if ((this.bitField0_ & 256) == 256 && this.strideLength_ != null && this.strideLength_ != ExerciseStatistics$PbStrideLengthStatistics.getDefaultInstance()) {
            this.strideLength_ = ExerciseStatistics$PbStrideLengthStatistics.newBuilder(this.strideLength_).mergeFrom(var1).buildPartial();
         } else {
            this.strideLength_ = var1;
         }

         this.onChanged();
      } else {
         this.strideLengthBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 256;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder mergeSwimming(ExerciseStatistics$PbSwimmingStatistics var1) {
      if (this.swimmingBuilder_ == null) {
         if ((this.bitField0_ & 2048) == 2048 && this.swimming_ != null && this.swimming_ != ExerciseStatistics$PbSwimmingStatistics.getDefaultInstance()) {
            this.swimming_ = ExerciseStatistics$PbSwimmingStatistics.newBuilder(this.swimming_).mergeFrom(var1).buildPartial();
         } else {
            this.swimming_ = var1;
         }

         this.onChanged();
      } else {
         this.swimmingBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2048;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder mergeTemperature(ExerciseStatistics$PbTemperatureStatistics var1) {
      if (this.temperatureBuilder_ == null) {
         if ((this.bitField0_ & 64) == 64 && this.temperature_ != null && this.temperature_ != ExerciseStatistics$PbTemperatureStatistics.getDefaultInstance()) {
            this.temperature_ = ExerciseStatistics$PbTemperatureStatistics.newBuilder(this.temperature_).mergeFrom(var1).buildPartial();
         } else {
            this.temperature_ = var1;
         }

         this.onChanged();
      } else {
         this.temperatureBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder mergeTrainingPeaks(ExerciseStatistics$PbTrainingPeaksStatistics var1) {
      if (this.trainingPeaksBuilder_ == null) {
         if ((this.bitField0_ & 4096) == 4096 && this.trainingPeaks_ != null && this.trainingPeaks_ != ExerciseStatistics$PbTrainingPeaksStatistics.getDefaultInstance()) {
            this.trainingPeaks_ = ExerciseStatistics$PbTrainingPeaksStatistics.newBuilder(this.trainingPeaks_).mergeFrom(var1).buildPartial();
         } else {
            this.trainingPeaks_ = var1;
         }

         this.onChanged();
      } else {
         this.trainingPeaksBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4096;
      return this;
   }

   public final ExerciseStatistics$PbExerciseStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbExerciseStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setActivity(ExerciseStatistics$PbActivityStatistics$Builder var1) {
      if (this.activityBuilder_ == null) {
         this.activity_ = var1.build();
         this.onChanged();
      } else {
         this.activityBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 128;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setActivity(ExerciseStatistics$PbActivityStatistics var1) {
      if (this.activityBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.activity_ = var1;
         this.onChanged();
      } else {
         this.activityBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 128;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setAltitude(ExerciseStatistics$PbAltitudeStatistics$Builder var1) {
      if (this.altitudeBuilder_ == null) {
         this.altitude_ = var1.build();
         this.onChanged();
      } else {
         this.altitudeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setAltitude(ExerciseStatistics$PbAltitudeStatistics var1) {
      if (this.altitudeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.altitude_ = var1;
         this.onChanged();
      } else {
         this.altitudeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setCadence(ExerciseStatistics$PbCadenceStatistics$Builder var1) {
      if (this.cadenceBuilder_ == null) {
         this.cadence_ = var1.build();
         this.onChanged();
      } else {
         this.cadenceBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setCadence(ExerciseStatistics$PbCadenceStatistics var1) {
      if (this.cadenceBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.cadence_ = var1;
         this.onChanged();
      } else {
         this.cadenceBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setDecline(ExerciseStatistics$PbDeclineStatistics$Builder var1) {
      if (this.declineBuilder_ == null) {
         this.decline_ = var1.build();
         this.onChanged();
      } else {
         this.declineBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setDecline(ExerciseStatistics$PbDeclineStatistics var1) {
      if (this.declineBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.decline_ = var1;
         this.onChanged();
      } else {
         this.declineBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbExerciseStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setHeartRate(ExerciseStatistics$PbHeartRateStatistics$Builder var1) {
      if (this.heartRateBuilder_ == null) {
         this.heartRate_ = var1.build();
         this.onChanged();
      } else {
         this.heartRateBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setHeartRate(ExerciseStatistics$PbHeartRateStatistics var1) {
      if (this.heartRateBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.heartRate_ = var1;
         this.onChanged();
      } else {
         this.heartRateBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setIncline(ExerciseStatistics$PbInclineStatistics$Builder var1) {
      if (this.inclineBuilder_ == null) {
         this.incline_ = var1.build();
         this.onChanged();
      } else {
         this.inclineBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 512;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setIncline(ExerciseStatistics$PbInclineStatistics var1) {
      if (this.inclineBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.incline_ = var1;
         this.onChanged();
      } else {
         this.inclineBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 512;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setLeftRightBalance(ExerciseStatistics$PbLRBalanceStatistics$Builder var1) {
      if (this.leftRightBalanceBuilder_ == null) {
         this.leftRightBalance_ = var1.build();
         this.onChanged();
      } else {
         this.leftRightBalanceBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 32;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setLeftRightBalance(ExerciseStatistics$PbLRBalanceStatistics var1) {
      if (this.leftRightBalanceBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.leftRightBalance_ = var1;
         this.onChanged();
      } else {
         this.leftRightBalanceBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setPower(ExerciseStatistics$PbPowerStatistics$Builder var1) {
      if (this.powerBuilder_ == null) {
         this.power_ = var1.build();
         this.onChanged();
      } else {
         this.powerBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 16;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setPower(ExerciseStatistics$PbPowerStatistics var1) {
      if (this.powerBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.power_ = var1;
         this.onChanged();
      } else {
         this.powerBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseStatistics$PbExerciseStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setSpeed(ExerciseStatistics$PbSpeedStatistics$Builder var1) {
      if (this.speedBuilder_ == null) {
         this.speed_ = var1.build();
         this.onChanged();
      } else {
         this.speedBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setSpeed(ExerciseStatistics$PbSpeedStatistics var1) {
      if (this.speedBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.speed_ = var1;
         this.onChanged();
      } else {
         this.speedBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setStrideLength(ExerciseStatistics$PbStrideLengthStatistics$Builder var1) {
      if (this.strideLengthBuilder_ == null) {
         this.strideLength_ = var1.build();
         this.onChanged();
      } else {
         this.strideLengthBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 256;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setStrideLength(ExerciseStatistics$PbStrideLengthStatistics var1) {
      if (this.strideLengthBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.strideLength_ = var1;
         this.onChanged();
      } else {
         this.strideLengthBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 256;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setSwimming(ExerciseStatistics$PbSwimmingStatistics$Builder var1) {
      if (this.swimmingBuilder_ == null) {
         this.swimming_ = var1.build();
         this.onChanged();
      } else {
         this.swimmingBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2048;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setSwimming(ExerciseStatistics$PbSwimmingStatistics var1) {
      if (this.swimmingBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.swimming_ = var1;
         this.onChanged();
      } else {
         this.swimmingBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2048;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setTemperature(ExerciseStatistics$PbTemperatureStatistics$Builder var1) {
      if (this.temperatureBuilder_ == null) {
         this.temperature_ = var1.build();
         this.onChanged();
      } else {
         this.temperatureBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 64;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setTemperature(ExerciseStatistics$PbTemperatureStatistics var1) {
      if (this.temperatureBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.temperature_ = var1;
         this.onChanged();
      } else {
         this.temperatureBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setTrainingPeaks(ExerciseStatistics$PbTrainingPeaksStatistics$Builder var1) {
      if (this.trainingPeaksBuilder_ == null) {
         this.trainingPeaks_ = var1.build();
         this.onChanged();
      } else {
         this.trainingPeaksBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4096;
      return this;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder setTrainingPeaks(ExerciseStatistics$PbTrainingPeaksStatistics var1) {
      if (this.trainingPeaksBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.trainingPeaks_ = var1;
         this.onChanged();
      } else {
         this.trainingPeaksBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4096;
      return this;
   }

   public final ExerciseStatistics$PbExerciseStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbExerciseStatistics$Builder)super.setUnknownFields(var1);
   }
}
