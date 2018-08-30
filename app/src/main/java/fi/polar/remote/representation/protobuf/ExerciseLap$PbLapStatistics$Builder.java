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

public final class ExerciseLap$PbLapStatistics$Builder extends Builder implements ExerciseLap$PbLapStatisticsOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 cadenceBuilder_;
   private ExerciseLap$PbLapCadenceStatistics cadence_;
   private SingleFieldBuilderV3 heartRateBuilder_;
   private ExerciseLap$PbLapHeartRateStatistics heartRate_;
   private SingleFieldBuilderV3 inclineBuilder_;
   private ExerciseLap$PbLapInclineStatistics incline_;
   private SingleFieldBuilderV3 leftRightBalanceBuilder_;
   private ExerciseLap$PbLapLRBalanceStatistics leftRightBalance_;
   private SingleFieldBuilderV3 oBSOLETEPedalingIndexBuilder_;
   private ExerciseLap$PbLapPedalingIndexStatistics oBSOLETEPedalingIndex_;
   private SingleFieldBuilderV3 powerBuilder_;
   private ExerciseLap$PbLapPowerStatistics power_;
   private SingleFieldBuilderV3 speedBuilder_;
   private ExerciseLap$PbLapSpeedStatistics speed_;
   private SingleFieldBuilderV3 strideLengthBuilder_;
   private ExerciseLap$PbLapStrideLengthStatistics strideLength_;
   private SingleFieldBuilderV3 swimmingStatisticsBuilder_;
   private ExerciseLap$PbLapSwimmingStatistics swimmingStatistics_;
   private SingleFieldBuilderV3 trainingPeaksBuilder_;
   private ExerciseLap$PbLapTrainingPeaksStatistics trainingPeaks_;

   private ExerciseLap$PbLapStatistics$Builder() {
      this.heartRate_ = null;
      this.speed_ = null;
      this.cadence_ = null;
      this.power_ = null;
      this.oBSOLETEPedalingIndex_ = null;
      this.incline_ = null;
      this.strideLength_ = null;
      this.swimmingStatistics_ = null;
      this.leftRightBalance_ = null;
      this.trainingPeaks_ = null;
      this.maybeForceBuilderInitialization();
   }

   private ExerciseLap$PbLapStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.heartRate_ = null;
      this.speed_ = null;
      this.cadence_ = null;
      this.power_ = null;
      this.oBSOLETEPedalingIndex_ = null;
      this.incline_ = null;
      this.strideLength_ = null;
      this.swimmingStatistics_ = null;
      this.leftRightBalance_ = null;
      this.trainingPeaks_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseLap$PbLapStatistics$Builder(BuilderParent var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseLap$PbLapStatistics$Builder(ExerciseLap$1 var1) {
      this();
   }

   private SingleFieldBuilderV3 getCadenceFieldBuilder() {
      if (this.cadenceBuilder_ == null) {
         this.cadenceBuilder_ = new SingleFieldBuilderV3(this.getCadence(), this.getParentForChildren(), this.isClean());
         this.cadence_ = null;
      }

      return this.cadenceBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.y();
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

   private SingleFieldBuilderV3 getOBSOLETEPedalingIndexFieldBuilder() {
      if (this.oBSOLETEPedalingIndexBuilder_ == null) {
         this.oBSOLETEPedalingIndexBuilder_ = new SingleFieldBuilderV3(this.getOBSOLETEPedalingIndex(), this.getParentForChildren(), this.isClean());
         this.oBSOLETEPedalingIndex_ = null;
      }

      return this.oBSOLETEPedalingIndexBuilder_;
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

   private SingleFieldBuilderV3 getSwimmingStatisticsFieldBuilder() {
      if (this.swimmingStatisticsBuilder_ == null) {
         this.swimmingStatisticsBuilder_ = new SingleFieldBuilderV3(this.getSwimmingStatistics(), this.getParentForChildren(), this.isClean());
         this.swimmingStatistics_ = null;
      }

      return this.swimmingStatisticsBuilder_;
   }

   private SingleFieldBuilderV3 getTrainingPeaksFieldBuilder() {
      if (this.trainingPeaksBuilder_ == null) {
         this.trainingPeaksBuilder_ = new SingleFieldBuilderV3(this.getTrainingPeaks(), this.getParentForChildren(), this.isClean());
         this.trainingPeaks_ = null;
      }

      return this.trainingPeaksBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseLap$PbLapStatistics.b()) {
         this.getHeartRateFieldBuilder();
         this.getSpeedFieldBuilder();
         this.getCadenceFieldBuilder();
         this.getPowerFieldBuilder();
         this.getOBSOLETEPedalingIndexFieldBuilder();
         this.getInclineFieldBuilder();
         this.getStrideLengthFieldBuilder();
         this.getSwimmingStatisticsFieldBuilder();
         this.getLeftRightBalanceFieldBuilder();
         this.getTrainingPeaksFieldBuilder();
      }

   }

   public ExerciseLap$PbLapStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseLap$PbLapStatistics build() {
      ExerciseLap$PbLapStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseLap$PbLapStatistics buildPartial() {
      ExerciseLap$PbLapStatistics var1 = new ExerciseLap$PbLapStatistics(this, (ExerciseLap$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.heartRateBuilder_ == null) {
         ExerciseLap$PbLapStatistics.a(var1, this.heartRate_);
      } else {
         ExerciseLap$PbLapStatistics.a(var1, (ExerciseLap$PbLapHeartRateStatistics)this.heartRateBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.speedBuilder_ == null) {
         ExerciseLap$PbLapStatistics.a(var1, this.speed_);
      } else {
         ExerciseLap$PbLapStatistics.a(var1, (ExerciseLap$PbLapSpeedStatistics)this.speedBuilder_.build());
      }

      int var6 = var4;
      if ((var2 & 4) == 4) {
         var6 = var4 | 4;
      }

      if (this.cadenceBuilder_ == null) {
         ExerciseLap$PbLapStatistics.a(var1, this.cadence_);
      } else {
         ExerciseLap$PbLapStatistics.a(var1, (ExerciseLap$PbLapCadenceStatistics)this.cadenceBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 8) == 8) {
         var4 = var6 | 8;
      }

      if (this.powerBuilder_ == null) {
         ExerciseLap$PbLapStatistics.a(var1, this.power_);
      } else {
         ExerciseLap$PbLapStatistics.a(var1, (ExerciseLap$PbLapPowerStatistics)this.powerBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 16) == 16) {
         var6 = var4 | 16;
      }

      if (this.oBSOLETEPedalingIndexBuilder_ == null) {
         ExerciseLap$PbLapStatistics.a(var1, this.oBSOLETEPedalingIndex_);
      } else {
         ExerciseLap$PbLapStatistics.a(var1, (ExerciseLap$PbLapPedalingIndexStatistics)this.oBSOLETEPedalingIndexBuilder_.build());
      }

      int var5 = var6;
      if ((var2 & 32) == 32) {
         var5 = var6 | 32;
      }

      if (this.inclineBuilder_ == null) {
         ExerciseLap$PbLapStatistics.a(var1, this.incline_);
      } else {
         ExerciseLap$PbLapStatistics.a(var1, (ExerciseLap$PbLapInclineStatistics)this.inclineBuilder_.build());
      }

      var4 = var5;
      if ((var2 & 64) == 64) {
         var4 = var5 | 64;
      }

      if (this.strideLengthBuilder_ == null) {
         ExerciseLap$PbLapStatistics.a(var1, this.strideLength_);
      } else {
         ExerciseLap$PbLapStatistics.a(var1, (ExerciseLap$PbLapStrideLengthStatistics)this.strideLengthBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 128) == 128) {
         var6 = var4 | 128;
      }

      if (this.swimmingStatisticsBuilder_ == null) {
         ExerciseLap$PbLapStatistics.a(var1, this.swimmingStatistics_);
      } else {
         ExerciseLap$PbLapStatistics.a(var1, (ExerciseLap$PbLapSwimmingStatistics)this.swimmingStatisticsBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 256) == 256) {
         var4 = var6 | 256;
      }

      if (this.leftRightBalanceBuilder_ == null) {
         ExerciseLap$PbLapStatistics.a(var1, this.leftRightBalance_);
      } else {
         ExerciseLap$PbLapStatistics.a(var1, (ExerciseLap$PbLapLRBalanceStatistics)this.leftRightBalanceBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 512) == 512) {
         var6 = var4 | 512;
      }

      if (this.trainingPeaksBuilder_ == null) {
         ExerciseLap$PbLapStatistics.a(var1, this.trainingPeaks_);
      } else {
         ExerciseLap$PbLapStatistics.a(var1, (ExerciseLap$PbLapTrainingPeaksStatistics)this.trainingPeaksBuilder_.build());
      }

      ExerciseLap$PbLapStatistics.a(var1, var6);
      this.onBuilt();
      return var1;
   }

   public ExerciseLap$PbLapStatistics$Builder clear() {
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
      if (this.powerBuilder_ == null) {
         this.power_ = null;
      } else {
         this.powerBuilder_.clear();
      }

      this.bitField0_ &= -9;
      if (this.oBSOLETEPedalingIndexBuilder_ == null) {
         this.oBSOLETEPedalingIndex_ = null;
      } else {
         this.oBSOLETEPedalingIndexBuilder_.clear();
      }

      this.bitField0_ &= -17;
      if (this.inclineBuilder_ == null) {
         this.incline_ = null;
      } else {
         this.inclineBuilder_.clear();
      }

      this.bitField0_ &= -33;
      if (this.strideLengthBuilder_ == null) {
         this.strideLength_ = null;
      } else {
         this.strideLengthBuilder_.clear();
      }

      this.bitField0_ &= -65;
      if (this.swimmingStatisticsBuilder_ == null) {
         this.swimmingStatistics_ = null;
      } else {
         this.swimmingStatisticsBuilder_.clear();
      }

      this.bitField0_ &= -129;
      if (this.leftRightBalanceBuilder_ == null) {
         this.leftRightBalance_ = null;
      } else {
         this.leftRightBalanceBuilder_.clear();
      }

      this.bitField0_ &= -257;
      if (this.trainingPeaksBuilder_ == null) {
         this.trainingPeaks_ = null;
      } else {
         this.trainingPeaksBuilder_.clear();
      }

      this.bitField0_ &= -513;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder clearCadence() {
      if (this.cadenceBuilder_ == null) {
         this.cadence_ = null;
         this.onChanged();
      } else {
         this.cadenceBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseLap$PbLapStatistics$Builder)super.clearField(var1);
   }

   public ExerciseLap$PbLapStatistics$Builder clearHeartRate() {
      if (this.heartRateBuilder_ == null) {
         this.heartRate_ = null;
         this.onChanged();
      } else {
         this.heartRateBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder clearIncline() {
      if (this.inclineBuilder_ == null) {
         this.incline_ = null;
         this.onChanged();
      } else {
         this.inclineBuilder_.clear();
      }

      this.bitField0_ &= -33;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder clearLeftRightBalance() {
      if (this.leftRightBalanceBuilder_ == null) {
         this.leftRightBalance_ = null;
         this.onChanged();
      } else {
         this.leftRightBalanceBuilder_.clear();
      }

      this.bitField0_ &= -257;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder clearOBSOLETEPedalingIndex() {
      if (this.oBSOLETEPedalingIndexBuilder_ == null) {
         this.oBSOLETEPedalingIndex_ = null;
         this.onChanged();
      } else {
         this.oBSOLETEPedalingIndexBuilder_.clear();
      }

      this.bitField0_ &= -17;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseLap$PbLapStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseLap$PbLapStatistics$Builder clearPower() {
      if (this.powerBuilder_ == null) {
         this.power_ = null;
         this.onChanged();
      } else {
         this.powerBuilder_.clear();
      }

      this.bitField0_ &= -9;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder clearSpeed() {
      if (this.speedBuilder_ == null) {
         this.speed_ = null;
         this.onChanged();
      } else {
         this.speedBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder clearStrideLength() {
      if (this.strideLengthBuilder_ == null) {
         this.strideLength_ = null;
         this.onChanged();
      } else {
         this.strideLengthBuilder_.clear();
      }

      this.bitField0_ &= -65;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder clearSwimmingStatistics() {
      if (this.swimmingStatisticsBuilder_ == null) {
         this.swimmingStatistics_ = null;
         this.onChanged();
      } else {
         this.swimmingStatisticsBuilder_.clear();
      }

      this.bitField0_ &= -129;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder clearTrainingPeaks() {
      if (this.trainingPeaksBuilder_ == null) {
         this.trainingPeaks_ = null;
         this.onChanged();
      } else {
         this.trainingPeaksBuilder_.clear();
      }

      this.bitField0_ &= -513;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder clone() {
      return (ExerciseLap$PbLapStatistics$Builder)super.clone();
   }

   public ExerciseLap$PbLapCadenceStatistics getCadence() {
      ExerciseLap$PbLapCadenceStatistics var1;
      if (this.cadenceBuilder_ == null) {
         if (this.cadence_ == null) {
            var1 = ExerciseLap$PbLapCadenceStatistics.getDefaultInstance();
         } else {
            var1 = this.cadence_;
         }
      } else {
         var1 = (ExerciseLap$PbLapCadenceStatistics)this.cadenceBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseLap$PbLapCadenceStatistics$Builder getCadenceBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (ExerciseLap$PbLapCadenceStatistics$Builder)this.getCadenceFieldBuilder().getBuilder();
   }

   public ExerciseLap$PbLapCadenceStatisticsOrBuilder getCadenceOrBuilder() {
      Object var1;
      if (this.cadenceBuilder_ != null) {
         var1 = (ExerciseLap$PbLapCadenceStatisticsOrBuilder)this.cadenceBuilder_.getMessageOrBuilder();
      } else if (this.cadence_ == null) {
         var1 = ExerciseLap$PbLapCadenceStatistics.getDefaultInstance();
      } else {
         var1 = this.cadence_;
      }

      return (ExerciseLap$PbLapCadenceStatisticsOrBuilder)var1;
   }

   public ExerciseLap$PbLapStatistics getDefaultInstanceForType() {
      return ExerciseLap$PbLapStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseLap.y();
   }

   public ExerciseLap$PbLapHeartRateStatistics getHeartRate() {
      ExerciseLap$PbLapHeartRateStatistics var1;
      if (this.heartRateBuilder_ == null) {
         if (this.heartRate_ == null) {
            var1 = ExerciseLap$PbLapHeartRateStatistics.getDefaultInstance();
         } else {
            var1 = this.heartRate_;
         }
      } else {
         var1 = (ExerciseLap$PbLapHeartRateStatistics)this.heartRateBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseLap$PbLapHeartRateStatistics$Builder getHeartRateBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (ExerciseLap$PbLapHeartRateStatistics$Builder)this.getHeartRateFieldBuilder().getBuilder();
   }

   public ExerciseLap$PbLapHeartRateStatisticsOrBuilder getHeartRateOrBuilder() {
      Object var1;
      if (this.heartRateBuilder_ != null) {
         var1 = (ExerciseLap$PbLapHeartRateStatisticsOrBuilder)this.heartRateBuilder_.getMessageOrBuilder();
      } else if (this.heartRate_ == null) {
         var1 = ExerciseLap$PbLapHeartRateStatistics.getDefaultInstance();
      } else {
         var1 = this.heartRate_;
      }

      return (ExerciseLap$PbLapHeartRateStatisticsOrBuilder)var1;
   }

   public ExerciseLap$PbLapInclineStatistics getIncline() {
      ExerciseLap$PbLapInclineStatistics var1;
      if (this.inclineBuilder_ == null) {
         if (this.incline_ == null) {
            var1 = ExerciseLap$PbLapInclineStatistics.getDefaultInstance();
         } else {
            var1 = this.incline_;
         }
      } else {
         var1 = (ExerciseLap$PbLapInclineStatistics)this.inclineBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseLap$PbLapInclineStatistics$Builder getInclineBuilder() {
      this.bitField0_ |= 32;
      this.onChanged();
      return (ExerciseLap$PbLapInclineStatistics$Builder)this.getInclineFieldBuilder().getBuilder();
   }

   public ExerciseLap$PbLapInclineStatisticsOrBuilder getInclineOrBuilder() {
      Object var1;
      if (this.inclineBuilder_ != null) {
         var1 = (ExerciseLap$PbLapInclineStatisticsOrBuilder)this.inclineBuilder_.getMessageOrBuilder();
      } else if (this.incline_ == null) {
         var1 = ExerciseLap$PbLapInclineStatistics.getDefaultInstance();
      } else {
         var1 = this.incline_;
      }

      return (ExerciseLap$PbLapInclineStatisticsOrBuilder)var1;
   }

   public ExerciseLap$PbLapLRBalanceStatistics getLeftRightBalance() {
      ExerciseLap$PbLapLRBalanceStatistics var1;
      if (this.leftRightBalanceBuilder_ == null) {
         if (this.leftRightBalance_ == null) {
            var1 = ExerciseLap$PbLapLRBalanceStatistics.getDefaultInstance();
         } else {
            var1 = this.leftRightBalance_;
         }
      } else {
         var1 = (ExerciseLap$PbLapLRBalanceStatistics)this.leftRightBalanceBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseLap$PbLapLRBalanceStatistics$Builder getLeftRightBalanceBuilder() {
      this.bitField0_ |= 256;
      this.onChanged();
      return (ExerciseLap$PbLapLRBalanceStatistics$Builder)this.getLeftRightBalanceFieldBuilder().getBuilder();
   }

   public ExerciseLap$PbLapLRBalanceStatisticsOrBuilder getLeftRightBalanceOrBuilder() {
      Object var1;
      if (this.leftRightBalanceBuilder_ != null) {
         var1 = (ExerciseLap$PbLapLRBalanceStatisticsOrBuilder)this.leftRightBalanceBuilder_.getMessageOrBuilder();
      } else if (this.leftRightBalance_ == null) {
         var1 = ExerciseLap$PbLapLRBalanceStatistics.getDefaultInstance();
      } else {
         var1 = this.leftRightBalance_;
      }

      return (ExerciseLap$PbLapLRBalanceStatisticsOrBuilder)var1;
   }

   public ExerciseLap$PbLapPedalingIndexStatistics getOBSOLETEPedalingIndex() {
      ExerciseLap$PbLapPedalingIndexStatistics var1;
      if (this.oBSOLETEPedalingIndexBuilder_ == null) {
         if (this.oBSOLETEPedalingIndex_ == null) {
            var1 = ExerciseLap$PbLapPedalingIndexStatistics.getDefaultInstance();
         } else {
            var1 = this.oBSOLETEPedalingIndex_;
         }
      } else {
         var1 = (ExerciseLap$PbLapPedalingIndexStatistics)this.oBSOLETEPedalingIndexBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseLap$PbLapPedalingIndexStatistics$Builder getOBSOLETEPedalingIndexBuilder() {
      this.bitField0_ |= 16;
      this.onChanged();
      return (ExerciseLap$PbLapPedalingIndexStatistics$Builder)this.getOBSOLETEPedalingIndexFieldBuilder().getBuilder();
   }

   public ExerciseLap$PbLapPedalingIndexStatisticsOrBuilder getOBSOLETEPedalingIndexOrBuilder() {
      Object var1;
      if (this.oBSOLETEPedalingIndexBuilder_ != null) {
         var1 = (ExerciseLap$PbLapPedalingIndexStatisticsOrBuilder)this.oBSOLETEPedalingIndexBuilder_.getMessageOrBuilder();
      } else if (this.oBSOLETEPedalingIndex_ == null) {
         var1 = ExerciseLap$PbLapPedalingIndexStatistics.getDefaultInstance();
      } else {
         var1 = this.oBSOLETEPedalingIndex_;
      }

      return (ExerciseLap$PbLapPedalingIndexStatisticsOrBuilder)var1;
   }

   public ExerciseLap$PbLapPowerStatistics getPower() {
      ExerciseLap$PbLapPowerStatistics var1;
      if (this.powerBuilder_ == null) {
         if (this.power_ == null) {
            var1 = ExerciseLap$PbLapPowerStatistics.getDefaultInstance();
         } else {
            var1 = this.power_;
         }
      } else {
         var1 = (ExerciseLap$PbLapPowerStatistics)this.powerBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseLap$PbLapPowerStatistics$Builder getPowerBuilder() {
      this.bitField0_ |= 8;
      this.onChanged();
      return (ExerciseLap$PbLapPowerStatistics$Builder)this.getPowerFieldBuilder().getBuilder();
   }

   public ExerciseLap$PbLapPowerStatisticsOrBuilder getPowerOrBuilder() {
      Object var1;
      if (this.powerBuilder_ != null) {
         var1 = (ExerciseLap$PbLapPowerStatisticsOrBuilder)this.powerBuilder_.getMessageOrBuilder();
      } else if (this.power_ == null) {
         var1 = ExerciseLap$PbLapPowerStatistics.getDefaultInstance();
      } else {
         var1 = this.power_;
      }

      return (ExerciseLap$PbLapPowerStatisticsOrBuilder)var1;
   }

   public ExerciseLap$PbLapSpeedStatistics getSpeed() {
      ExerciseLap$PbLapSpeedStatistics var1;
      if (this.speedBuilder_ == null) {
         if (this.speed_ == null) {
            var1 = ExerciseLap$PbLapSpeedStatistics.getDefaultInstance();
         } else {
            var1 = this.speed_;
         }
      } else {
         var1 = (ExerciseLap$PbLapSpeedStatistics)this.speedBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseLap$PbLapSpeedStatistics$Builder getSpeedBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (ExerciseLap$PbLapSpeedStatistics$Builder)this.getSpeedFieldBuilder().getBuilder();
   }

   public ExerciseLap$PbLapSpeedStatisticsOrBuilder getSpeedOrBuilder() {
      Object var1;
      if (this.speedBuilder_ != null) {
         var1 = (ExerciseLap$PbLapSpeedStatisticsOrBuilder)this.speedBuilder_.getMessageOrBuilder();
      } else if (this.speed_ == null) {
         var1 = ExerciseLap$PbLapSpeedStatistics.getDefaultInstance();
      } else {
         var1 = this.speed_;
      }

      return (ExerciseLap$PbLapSpeedStatisticsOrBuilder)var1;
   }

   public ExerciseLap$PbLapStrideLengthStatistics getStrideLength() {
      ExerciseLap$PbLapStrideLengthStatistics var1;
      if (this.strideLengthBuilder_ == null) {
         if (this.strideLength_ == null) {
            var1 = ExerciseLap$PbLapStrideLengthStatistics.getDefaultInstance();
         } else {
            var1 = this.strideLength_;
         }
      } else {
         var1 = (ExerciseLap$PbLapStrideLengthStatistics)this.strideLengthBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseLap$PbLapStrideLengthStatistics$Builder getStrideLengthBuilder() {
      this.bitField0_ |= 64;
      this.onChanged();
      return (ExerciseLap$PbLapStrideLengthStatistics$Builder)this.getStrideLengthFieldBuilder().getBuilder();
   }

   public ExerciseLap$PbLapStrideLengthStatisticsOrBuilder getStrideLengthOrBuilder() {
      Object var1;
      if (this.strideLengthBuilder_ != null) {
         var1 = (ExerciseLap$PbLapStrideLengthStatisticsOrBuilder)this.strideLengthBuilder_.getMessageOrBuilder();
      } else if (this.strideLength_ == null) {
         var1 = ExerciseLap$PbLapStrideLengthStatistics.getDefaultInstance();
      } else {
         var1 = this.strideLength_;
      }

      return (ExerciseLap$PbLapStrideLengthStatisticsOrBuilder)var1;
   }

   public ExerciseLap$PbLapSwimmingStatistics getSwimmingStatistics() {
      ExerciseLap$PbLapSwimmingStatistics var1;
      if (this.swimmingStatisticsBuilder_ == null) {
         if (this.swimmingStatistics_ == null) {
            var1 = ExerciseLap$PbLapSwimmingStatistics.getDefaultInstance();
         } else {
            var1 = this.swimmingStatistics_;
         }
      } else {
         var1 = (ExerciseLap$PbLapSwimmingStatistics)this.swimmingStatisticsBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseLap$PbLapSwimmingStatistics$Builder getSwimmingStatisticsBuilder() {
      this.bitField0_ |= 128;
      this.onChanged();
      return (ExerciseLap$PbLapSwimmingStatistics$Builder)this.getSwimmingStatisticsFieldBuilder().getBuilder();
   }

   public ExerciseLap$PbLapSwimmingStatisticsOrBuilder getSwimmingStatisticsOrBuilder() {
      Object var1;
      if (this.swimmingStatisticsBuilder_ != null) {
         var1 = (ExerciseLap$PbLapSwimmingStatisticsOrBuilder)this.swimmingStatisticsBuilder_.getMessageOrBuilder();
      } else if (this.swimmingStatistics_ == null) {
         var1 = ExerciseLap$PbLapSwimmingStatistics.getDefaultInstance();
      } else {
         var1 = this.swimmingStatistics_;
      }

      return (ExerciseLap$PbLapSwimmingStatisticsOrBuilder)var1;
   }

   public ExerciseLap$PbLapTrainingPeaksStatistics getTrainingPeaks() {
      ExerciseLap$PbLapTrainingPeaksStatistics var1;
      if (this.trainingPeaksBuilder_ == null) {
         if (this.trainingPeaks_ == null) {
            var1 = ExerciseLap$PbLapTrainingPeaksStatistics.getDefaultInstance();
         } else {
            var1 = this.trainingPeaks_;
         }
      } else {
         var1 = (ExerciseLap$PbLapTrainingPeaksStatistics)this.trainingPeaksBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseLap$PbLapTrainingPeaksStatistics$Builder getTrainingPeaksBuilder() {
      this.bitField0_ |= 512;
      this.onChanged();
      return (ExerciseLap$PbLapTrainingPeaksStatistics$Builder)this.getTrainingPeaksFieldBuilder().getBuilder();
   }

   public ExerciseLap$PbLapTrainingPeaksStatisticsOrBuilder getTrainingPeaksOrBuilder() {
      Object var1;
      if (this.trainingPeaksBuilder_ != null) {
         var1 = (ExerciseLap$PbLapTrainingPeaksStatisticsOrBuilder)this.trainingPeaksBuilder_.getMessageOrBuilder();
      } else if (this.trainingPeaks_ == null) {
         var1 = ExerciseLap$PbLapTrainingPeaksStatistics.getDefaultInstance();
      } else {
         var1 = this.trainingPeaks_;
      }

      return (ExerciseLap$PbLapTrainingPeaksStatisticsOrBuilder)var1;
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

   public boolean hasHeartRate() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasIncline() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLeftRightBalance() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasOBSOLETEPedalingIndex() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPower() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
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
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSwimmingStatistics() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTrainingPeaks() {
      boolean var1;
      if ((this.bitField0_ & 512) == 512) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseLap.z().ensureFieldAccessorsInitialized(ExerciseLap$PbLapStatistics.class, ExerciseLap$PbLapStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExerciseLap$PbLapStatistics$Builder mergeCadence(ExerciseLap$PbLapCadenceStatistics var1) {
      if (this.cadenceBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.cadence_ != null && this.cadence_ != ExerciseLap$PbLapCadenceStatistics.getDefaultInstance()) {
            this.cadence_ = ExerciseLap$PbLapCadenceStatistics.newBuilder(this.cadence_).mergeFrom(var1).buildPartial();
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

   public ExerciseLap$PbLapStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseLap$PbLapStatistics var13;
      label96: {
         InvalidProtocolBufferException var12;
         ExerciseLap$PbLapStatistics var14;
         try {
            var13 = (ExerciseLap$PbLapStatistics)ExerciseLap$PbLapStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (ExerciseLap$PbLapStatistics)var10.getUnfinishedMessage();
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

   public ExerciseLap$PbLapStatistics$Builder mergeFrom(Message var1) {
      ExerciseLap$PbLapStatistics$Builder var2;
      if (var1 instanceof ExerciseLap$PbLapStatistics) {
         var2 = this.mergeFrom((ExerciseLap$PbLapStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseLap$PbLapStatistics$Builder mergeFrom(ExerciseLap$PbLapStatistics var1) {
      if (var1 != ExerciseLap$PbLapStatistics.getDefaultInstance()) {
         if (var1.hasHeartRate()) {
            this.mergeHeartRate(var1.getHeartRate());
         }

         if (var1.hasSpeed()) {
            this.mergeSpeed(var1.getSpeed());
         }

         if (var1.hasCadence()) {
            this.mergeCadence(var1.getCadence());
         }

         if (var1.hasPower()) {
            this.mergePower(var1.getPower());
         }

         if (var1.hasOBSOLETEPedalingIndex()) {
            this.mergeOBSOLETEPedalingIndex(var1.getOBSOLETEPedalingIndex());
         }

         if (var1.hasIncline()) {
            this.mergeIncline(var1.getIncline());
         }

         if (var1.hasStrideLength()) {
            this.mergeStrideLength(var1.getStrideLength());
         }

         if (var1.hasSwimmingStatistics()) {
            this.mergeSwimmingStatistics(var1.getSwimmingStatistics());
         }

         if (var1.hasLeftRightBalance()) {
            this.mergeLeftRightBalance(var1.getLeftRightBalance());
         }

         if (var1.hasTrainingPeaks()) {
            this.mergeTrainingPeaks(var1.getTrainingPeaks());
         }

         this.mergeUnknownFields(ExerciseLap$PbLapStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder mergeHeartRate(ExerciseLap$PbLapHeartRateStatistics var1) {
      if (this.heartRateBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.heartRate_ != null && this.heartRate_ != ExerciseLap$PbLapHeartRateStatistics.getDefaultInstance()) {
            this.heartRate_ = ExerciseLap$PbLapHeartRateStatistics.newBuilder(this.heartRate_).mergeFrom(var1).buildPartial();
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

   public ExerciseLap$PbLapStatistics$Builder mergeIncline(ExerciseLap$PbLapInclineStatistics var1) {
      if (this.inclineBuilder_ == null) {
         if ((this.bitField0_ & 32) == 32 && this.incline_ != null && this.incline_ != ExerciseLap$PbLapInclineStatistics.getDefaultInstance()) {
            this.incline_ = ExerciseLap$PbLapInclineStatistics.newBuilder(this.incline_).mergeFrom(var1).buildPartial();
         } else {
            this.incline_ = var1;
         }

         this.onChanged();
      } else {
         this.inclineBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder mergeLeftRightBalance(ExerciseLap$PbLapLRBalanceStatistics var1) {
      if (this.leftRightBalanceBuilder_ == null) {
         if ((this.bitField0_ & 256) == 256 && this.leftRightBalance_ != null && this.leftRightBalance_ != ExerciseLap$PbLapLRBalanceStatistics.getDefaultInstance()) {
            this.leftRightBalance_ = ExerciseLap$PbLapLRBalanceStatistics.newBuilder(this.leftRightBalance_).mergeFrom(var1).buildPartial();
         } else {
            this.leftRightBalance_ = var1;
         }

         this.onChanged();
      } else {
         this.leftRightBalanceBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 256;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder mergeOBSOLETEPedalingIndex(ExerciseLap$PbLapPedalingIndexStatistics var1) {
      if (this.oBSOLETEPedalingIndexBuilder_ == null) {
         if ((this.bitField0_ & 16) == 16 && this.oBSOLETEPedalingIndex_ != null && this.oBSOLETEPedalingIndex_ != ExerciseLap$PbLapPedalingIndexStatistics.getDefaultInstance()) {
            this.oBSOLETEPedalingIndex_ = ExerciseLap$PbLapPedalingIndexStatistics.newBuilder(this.oBSOLETEPedalingIndex_).mergeFrom(var1).buildPartial();
         } else {
            this.oBSOLETEPedalingIndex_ = var1;
         }

         this.onChanged();
      } else {
         this.oBSOLETEPedalingIndexBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder mergePower(ExerciseLap$PbLapPowerStatistics var1) {
      if (this.powerBuilder_ == null) {
         if ((this.bitField0_ & 8) == 8 && this.power_ != null && this.power_ != ExerciseLap$PbLapPowerStatistics.getDefaultInstance()) {
            this.power_ = ExerciseLap$PbLapPowerStatistics.newBuilder(this.power_).mergeFrom(var1).buildPartial();
         } else {
            this.power_ = var1;
         }

         this.onChanged();
      } else {
         this.powerBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder mergeSpeed(ExerciseLap$PbLapSpeedStatistics var1) {
      if (this.speedBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.speed_ != null && this.speed_ != ExerciseLap$PbLapSpeedStatistics.getDefaultInstance()) {
            this.speed_ = ExerciseLap$PbLapSpeedStatistics.newBuilder(this.speed_).mergeFrom(var1).buildPartial();
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

   public ExerciseLap$PbLapStatistics$Builder mergeStrideLength(ExerciseLap$PbLapStrideLengthStatistics var1) {
      if (this.strideLengthBuilder_ == null) {
         if ((this.bitField0_ & 64) == 64 && this.strideLength_ != null && this.strideLength_ != ExerciseLap$PbLapStrideLengthStatistics.getDefaultInstance()) {
            this.strideLength_ = ExerciseLap$PbLapStrideLengthStatistics.newBuilder(this.strideLength_).mergeFrom(var1).buildPartial();
         } else {
            this.strideLength_ = var1;
         }

         this.onChanged();
      } else {
         this.strideLengthBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder mergeSwimmingStatistics(ExerciseLap$PbLapSwimmingStatistics var1) {
      if (this.swimmingStatisticsBuilder_ == null) {
         if ((this.bitField0_ & 128) == 128 && this.swimmingStatistics_ != null && this.swimmingStatistics_ != ExerciseLap$PbLapSwimmingStatistics.getDefaultInstance()) {
            this.swimmingStatistics_ = ExerciseLap$PbLapSwimmingStatistics.newBuilder(this.swimmingStatistics_).mergeFrom(var1).buildPartial();
         } else {
            this.swimmingStatistics_ = var1;
         }

         this.onChanged();
      } else {
         this.swimmingStatisticsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 128;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder mergeTrainingPeaks(ExerciseLap$PbLapTrainingPeaksStatistics var1) {
      if (this.trainingPeaksBuilder_ == null) {
         if ((this.bitField0_ & 512) == 512 && this.trainingPeaks_ != null && this.trainingPeaks_ != ExerciseLap$PbLapTrainingPeaksStatistics.getDefaultInstance()) {
            this.trainingPeaks_ = ExerciseLap$PbLapTrainingPeaksStatistics.newBuilder(this.trainingPeaks_).mergeFrom(var1).buildPartial();
         } else {
            this.trainingPeaks_ = var1;
         }

         this.onChanged();
      } else {
         this.trainingPeaksBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 512;
      return this;
   }

   public final ExerciseLap$PbLapStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseLap$PbLapStatistics$Builder setCadence(ExerciseLap$PbLapCadenceStatistics$Builder var1) {
      if (this.cadenceBuilder_ == null) {
         this.cadence_ = var1.build();
         this.onChanged();
      } else {
         this.cadenceBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder setCadence(ExerciseLap$PbLapCadenceStatistics var1) {
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

   public ExerciseLap$PbLapStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseLap$PbLapStatistics$Builder setHeartRate(ExerciseLap$PbLapHeartRateStatistics$Builder var1) {
      if (this.heartRateBuilder_ == null) {
         this.heartRate_ = var1.build();
         this.onChanged();
      } else {
         this.heartRateBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder setHeartRate(ExerciseLap$PbLapHeartRateStatistics var1) {
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

   public ExerciseLap$PbLapStatistics$Builder setIncline(ExerciseLap$PbLapInclineStatistics$Builder var1) {
      if (this.inclineBuilder_ == null) {
         this.incline_ = var1.build();
         this.onChanged();
      } else {
         this.inclineBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 32;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder setIncline(ExerciseLap$PbLapInclineStatistics var1) {
      if (this.inclineBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.incline_ = var1;
         this.onChanged();
      } else {
         this.inclineBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder setLeftRightBalance(ExerciseLap$PbLapLRBalanceStatistics$Builder var1) {
      if (this.leftRightBalanceBuilder_ == null) {
         this.leftRightBalance_ = var1.build();
         this.onChanged();
      } else {
         this.leftRightBalanceBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 256;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder setLeftRightBalance(ExerciseLap$PbLapLRBalanceStatistics var1) {
      if (this.leftRightBalanceBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.leftRightBalance_ = var1;
         this.onChanged();
      } else {
         this.leftRightBalanceBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 256;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder setOBSOLETEPedalingIndex(ExerciseLap$PbLapPedalingIndexStatistics$Builder var1) {
      if (this.oBSOLETEPedalingIndexBuilder_ == null) {
         this.oBSOLETEPedalingIndex_ = var1.build();
         this.onChanged();
      } else {
         this.oBSOLETEPedalingIndexBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 16;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder setOBSOLETEPedalingIndex(ExerciseLap$PbLapPedalingIndexStatistics var1) {
      if (this.oBSOLETEPedalingIndexBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.oBSOLETEPedalingIndex_ = var1;
         this.onChanged();
      } else {
         this.oBSOLETEPedalingIndexBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder setPower(ExerciseLap$PbLapPowerStatistics$Builder var1) {
      if (this.powerBuilder_ == null) {
         this.power_ = var1.build();
         this.onChanged();
      } else {
         this.powerBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder setPower(ExerciseLap$PbLapPowerStatistics var1) {
      if (this.powerBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.power_ = var1;
         this.onChanged();
      } else {
         this.powerBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseLap$PbLapStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public ExerciseLap$PbLapStatistics$Builder setSpeed(ExerciseLap$PbLapSpeedStatistics$Builder var1) {
      if (this.speedBuilder_ == null) {
         this.speed_ = var1.build();
         this.onChanged();
      } else {
         this.speedBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder setSpeed(ExerciseLap$PbLapSpeedStatistics var1) {
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

   public ExerciseLap$PbLapStatistics$Builder setStrideLength(ExerciseLap$PbLapStrideLengthStatistics$Builder var1) {
      if (this.strideLengthBuilder_ == null) {
         this.strideLength_ = var1.build();
         this.onChanged();
      } else {
         this.strideLengthBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 64;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder setStrideLength(ExerciseLap$PbLapStrideLengthStatistics var1) {
      if (this.strideLengthBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.strideLength_ = var1;
         this.onChanged();
      } else {
         this.strideLengthBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder setSwimmingStatistics(ExerciseLap$PbLapSwimmingStatistics$Builder var1) {
      if (this.swimmingStatisticsBuilder_ == null) {
         this.swimmingStatistics_ = var1.build();
         this.onChanged();
      } else {
         this.swimmingStatisticsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 128;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder setSwimmingStatistics(ExerciseLap$PbLapSwimmingStatistics var1) {
      if (this.swimmingStatisticsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.swimmingStatistics_ = var1;
         this.onChanged();
      } else {
         this.swimmingStatisticsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 128;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder setTrainingPeaks(ExerciseLap$PbLapTrainingPeaksStatistics$Builder var1) {
      if (this.trainingPeaksBuilder_ == null) {
         this.trainingPeaks_ = var1.build();
         this.onChanged();
      } else {
         this.trainingPeaksBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 512;
      return this;
   }

   public ExerciseLap$PbLapStatistics$Builder setTrainingPeaks(ExerciseLap$PbLapTrainingPeaksStatistics var1) {
      if (this.trainingPeaksBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.trainingPeaks_ = var1;
         this.onChanged();
      } else {
         this.trainingPeaksBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 512;
      return this;
   }

   public final ExerciseLap$PbLapStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapStatistics$Builder)super.setUnknownFields(var1);
   }
}
