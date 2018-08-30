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

public final class ExercisePhaseStats$PbPhaseRepetition$Builder extends Builder implements ExercisePhaseStats$PbPhaseRepetitionOrBuilder {
   private float ascent_;
   private float averageSwolf_;
   private int bitField0_;
   private SingleFieldBuilderV3 cadenceBuilder_;
   private ExerciseStatistics$PbCadenceStatistics cadence_;
   private float descent_;
   private float distance_;
   private SingleFieldBuilderV3 durationBuilder_;
   private Types$PbDuration duration_;
   private SingleFieldBuilderV3 heartRateBuilder_;
   private ExercisePhaseStats$PbPhaseHeartRateStatistics heartRate_;
   private SingleFieldBuilderV3 inTargetZoneBuilder_;
   private Types$PbDuration inTargetZone_;
   private int index_;
   private SingleFieldBuilderV3 leftRightBalanceBuilder_;
   private ExerciseStatistics$PbLRBalanceStatistics leftRightBalance_;
   private boolean phaseFinished_;
   private SingleFieldBuilderV3 powerBuilder_;
   private ExerciseStatistics$PbPowerStatistics power_;
   private SingleFieldBuilderV3 speedBuilder_;
   private ExerciseStatistics$PbSpeedStatistics speed_;
   private float splitDistance_;
   private SingleFieldBuilderV3 splitTimeBuilder_;
   private Types$PbDuration splitTime_;
   private SingleFieldBuilderV3 strideLengthBuilder_;
   private ExercisePhaseStats$PbPhaseStrideLengthStatistics strideLength_;
   private int strokeCount_;
   private int strokesPerMin_;

   private ExercisePhaseStats$PbPhaseRepetition$Builder() {
      this.splitTime_ = null;
      this.duration_ = null;
      this.inTargetZone_ = null;
      this.heartRate_ = null;
      this.speed_ = null;
      this.cadence_ = null;
      this.power_ = null;
      this.leftRightBalance_ = null;
      this.strideLength_ = null;
      this.maybeForceBuilderInitialization();
   }

   private ExercisePhaseStats$PbPhaseRepetition$Builder(BuilderParent var1) {
      super(var1);
      this.splitTime_ = null;
      this.duration_ = null;
      this.inTargetZone_ = null;
      this.heartRate_ = null;
      this.speed_ = null;
      this.cadence_ = null;
      this.power_ = null;
      this.leftRightBalance_ = null;
      this.strideLength_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExercisePhaseStats$PbPhaseRepetition$Builder(BuilderParent var1, ExercisePhaseStats$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExercisePhaseStats$PbPhaseRepetition$Builder(ExercisePhaseStats$1 var1) {
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
      return ExercisePhaseStats.e();
   }

   private SingleFieldBuilderV3 getDurationFieldBuilder() {
      if (this.durationBuilder_ == null) {
         this.durationBuilder_ = new SingleFieldBuilderV3(this.getDuration(), this.getParentForChildren(), this.isClean());
         this.duration_ = null;
      }

      return this.durationBuilder_;
   }

   private SingleFieldBuilderV3 getHeartRateFieldBuilder() {
      if (this.heartRateBuilder_ == null) {
         this.heartRateBuilder_ = new SingleFieldBuilderV3(this.getHeartRate(), this.getParentForChildren(), this.isClean());
         this.heartRate_ = null;
      }

      return this.heartRateBuilder_;
   }

   private SingleFieldBuilderV3 getInTargetZoneFieldBuilder() {
      if (this.inTargetZoneBuilder_ == null) {
         this.inTargetZoneBuilder_ = new SingleFieldBuilderV3(this.getInTargetZone(), this.getParentForChildren(), this.isClean());
         this.inTargetZone_ = null;
      }

      return this.inTargetZoneBuilder_;
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

   private SingleFieldBuilderV3 getSplitTimeFieldBuilder() {
      if (this.splitTimeBuilder_ == null) {
         this.splitTimeBuilder_ = new SingleFieldBuilderV3(this.getSplitTime(), this.getParentForChildren(), this.isClean());
         this.splitTime_ = null;
      }

      return this.splitTimeBuilder_;
   }

   private SingleFieldBuilderV3 getStrideLengthFieldBuilder() {
      if (this.strideLengthBuilder_ == null) {
         this.strideLengthBuilder_ = new SingleFieldBuilderV3(this.getStrideLength(), this.getParentForChildren(), this.isClean());
         this.strideLength_ = null;
      }

      return this.strideLengthBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (ExercisePhaseStats$PbPhaseRepetition.b()) {
         this.getSplitTimeFieldBuilder();
         this.getDurationFieldBuilder();
         this.getInTargetZoneFieldBuilder();
         this.getHeartRateFieldBuilder();
         this.getSpeedFieldBuilder();
         this.getCadenceFieldBuilder();
         this.getPowerFieldBuilder();
         this.getLeftRightBalanceFieldBuilder();
         this.getStrideLengthFieldBuilder();
      }

   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExercisePhaseStats$PbPhaseRepetition$Builder)super.addRepeatedField(var1, var2);
   }

   public ExercisePhaseStats$PbPhaseRepetition build() {
      ExercisePhaseStats$PbPhaseRepetition var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExercisePhaseStats$PbPhaseRepetition buildPartial() {
      int var1 = 1;
      ExercisePhaseStats$PbPhaseRepetition var2 = new ExercisePhaseStats$PbPhaseRepetition(this, (ExercisePhaseStats$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ExercisePhaseStats$PbPhaseRepetition.a(var2, this.index_);
      if ((var3 & 2) == 2) {
         var1 |= 2;
      }

      if (this.splitTimeBuilder_ == null) {
         ExercisePhaseStats$PbPhaseRepetition.a(var2, this.splitTime_);
      } else {
         ExercisePhaseStats$PbPhaseRepetition.a(var2, (Types$PbDuration)this.splitTimeBuilder_.build());
      }

      int var4 = var1;
      if ((var3 & 4) == 4) {
         var4 = var1 | 4;
      }

      if (this.durationBuilder_ == null) {
         ExercisePhaseStats$PbPhaseRepetition.b(var2, this.duration_);
      } else {
         ExercisePhaseStats$PbPhaseRepetition.b(var2, (Types$PbDuration)this.durationBuilder_.build());
      }

      var1 = var4;
      if ((var3 & 8) == 8) {
         var1 = var4 | 8;
      }

      ExercisePhaseStats$PbPhaseRepetition.a(var2, this.phaseFinished_);
      int var5 = var1;
      if ((var3 & 16) == 16) {
         var5 = var1 | 16;
      }

      ExercisePhaseStats$PbPhaseRepetition.a(var2, this.splitDistance_);
      var4 = var5;
      if ((var3 & 32) == 32) {
         var4 = var5 | 32;
      }

      ExercisePhaseStats$PbPhaseRepetition.b(var2, this.distance_);
      var1 = var4;
      if ((var3 & 64) == 64) {
         var1 = var4 | 64;
      }

      if (this.inTargetZoneBuilder_ == null) {
         ExercisePhaseStats$PbPhaseRepetition.c(var2, this.inTargetZone_);
      } else {
         ExercisePhaseStats$PbPhaseRepetition.c(var2, (Types$PbDuration)this.inTargetZoneBuilder_.build());
      }

      var4 = var1;
      if ((var3 & 128) == 128) {
         var4 = var1 | 128;
      }

      if (this.heartRateBuilder_ == null) {
         ExercisePhaseStats$PbPhaseRepetition.a(var2, this.heartRate_);
      } else {
         ExercisePhaseStats$PbPhaseRepetition.a(var2, (ExercisePhaseStats$PbPhaseHeartRateStatistics)this.heartRateBuilder_.build());
      }

      var1 = var4;
      if ((var3 & 256) == 256) {
         var1 = var4 | 256;
      }

      if (this.speedBuilder_ == null) {
         ExercisePhaseStats$PbPhaseRepetition.a(var2, this.speed_);
      } else {
         ExercisePhaseStats$PbPhaseRepetition.a(var2, (ExerciseStatistics$PbSpeedStatistics)this.speedBuilder_.build());
      }

      var4 = var1;
      if ((var3 & 512) == 512) {
         var4 = var1 | 512;
      }

      if (this.cadenceBuilder_ == null) {
         ExercisePhaseStats$PbPhaseRepetition.a(var2, this.cadence_);
      } else {
         ExercisePhaseStats$PbPhaseRepetition.a(var2, (ExerciseStatistics$PbCadenceStatistics)this.cadenceBuilder_.build());
      }

      var5 = var4;
      if ((var3 & 1024) == 1024) {
         var5 = var4 | 1024;
      }

      if (this.powerBuilder_ == null) {
         ExercisePhaseStats$PbPhaseRepetition.a(var2, this.power_);
      } else {
         ExercisePhaseStats$PbPhaseRepetition.a(var2, (ExerciseStatistics$PbPowerStatistics)this.powerBuilder_.build());
      }

      var1 = var5;
      if ((var3 & 2048) == 2048) {
         var1 = var5 | 2048;
      }

      if (this.leftRightBalanceBuilder_ == null) {
         ExercisePhaseStats$PbPhaseRepetition.a(var2, this.leftRightBalance_);
      } else {
         ExercisePhaseStats$PbPhaseRepetition.a(var2, (ExerciseStatistics$PbLRBalanceStatistics)this.leftRightBalanceBuilder_.build());
      }

      var4 = var1;
      if ((var3 & 4096) == 4096) {
         var4 = var1 | 4096;
      }

      if (this.strideLengthBuilder_ == null) {
         ExercisePhaseStats$PbPhaseRepetition.a(var2, this.strideLength_);
      } else {
         ExercisePhaseStats$PbPhaseRepetition.a(var2, (ExercisePhaseStats$PbPhaseStrideLengthStatistics)this.strideLengthBuilder_.build());
      }

      var1 = var4;
      if ((var3 & 8192) == 8192) {
         var1 = var4 | 8192;
      }

      ExercisePhaseStats$PbPhaseRepetition.b(var2, this.strokeCount_);
      var4 = var1;
      if ((var3 & 16384) == 16384) {
         var4 = var1 | 16384;
      }

      ExercisePhaseStats$PbPhaseRepetition.c(var2, this.averageSwolf_);
      var1 = var4;
      if ((var3 & '耀') == 32768) {
         var1 = var4 | '耀';
      }

      ExercisePhaseStats$PbPhaseRepetition.c(var2, this.strokesPerMin_);
      var4 = var1;
      if ((var3 & 65536) == 65536) {
         var4 = var1 | 65536;
      }

      ExercisePhaseStats$PbPhaseRepetition.d(var2, this.ascent_);
      var1 = var4;
      if ((var3 & 131072) == 131072) {
         var1 = var4 | 131072;
      }

      ExercisePhaseStats$PbPhaseRepetition.e(var2, this.descent_);
      ExercisePhaseStats$PbPhaseRepetition.d(var2, var1);
      this.onBuilt();
      return var2;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder clear() {
      super.clear();
      this.index_ = 0;
      this.bitField0_ &= -2;
      if (this.splitTimeBuilder_ == null) {
         this.splitTime_ = null;
      } else {
         this.splitTimeBuilder_.clear();
      }

      this.bitField0_ &= -3;
      if (this.durationBuilder_ == null) {
         this.duration_ = null;
      } else {
         this.durationBuilder_.clear();
      }

      this.bitField0_ &= -5;
      this.phaseFinished_ = false;
      this.bitField0_ &= -9;
      this.splitDistance_ = 0.0F;
      this.bitField0_ &= -17;
      this.distance_ = 0.0F;
      this.bitField0_ &= -33;
      if (this.inTargetZoneBuilder_ == null) {
         this.inTargetZone_ = null;
      } else {
         this.inTargetZoneBuilder_.clear();
      }

      this.bitField0_ &= -65;
      if (this.heartRateBuilder_ == null) {
         this.heartRate_ = null;
      } else {
         this.heartRateBuilder_.clear();
      }

      this.bitField0_ &= -129;
      if (this.speedBuilder_ == null) {
         this.speed_ = null;
      } else {
         this.speedBuilder_.clear();
      }

      this.bitField0_ &= -257;
      if (this.cadenceBuilder_ == null) {
         this.cadence_ = null;
      } else {
         this.cadenceBuilder_.clear();
      }

      this.bitField0_ &= -513;
      if (this.powerBuilder_ == null) {
         this.power_ = null;
      } else {
         this.powerBuilder_.clear();
      }

      this.bitField0_ &= -1025;
      if (this.leftRightBalanceBuilder_ == null) {
         this.leftRightBalance_ = null;
      } else {
         this.leftRightBalanceBuilder_.clear();
      }

      this.bitField0_ &= -2049;
      if (this.strideLengthBuilder_ == null) {
         this.strideLength_ = null;
      } else {
         this.strideLengthBuilder_.clear();
      }

      this.bitField0_ &= -4097;
      this.strokeCount_ = 0;
      this.bitField0_ &= -8193;
      this.averageSwolf_ = 0.0F;
      this.bitField0_ &= -16385;
      this.strokesPerMin_ = 0;
      this.bitField0_ &= -32769;
      this.ascent_ = 0.0F;
      this.bitField0_ &= -65537;
      this.descent_ = 0.0F;
      this.bitField0_ &= -131073;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder clearAscent() {
      this.bitField0_ &= -65537;
      this.ascent_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder clearAverageSwolf() {
      this.bitField0_ &= -16385;
      this.averageSwolf_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder clearCadence() {
      if (this.cadenceBuilder_ == null) {
         this.cadence_ = null;
         this.onChanged();
      } else {
         this.cadenceBuilder_.clear();
      }

      this.bitField0_ &= -513;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder clearDescent() {
      this.bitField0_ &= -131073;
      this.descent_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder clearDistance() {
      this.bitField0_ &= -33;
      this.distance_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder clearDuration() {
      if (this.durationBuilder_ == null) {
         this.duration_ = null;
         this.onChanged();
      } else {
         this.durationBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder clearField(FieldDescriptor var1) {
      return (ExercisePhaseStats$PbPhaseRepetition$Builder)super.clearField(var1);
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder clearHeartRate() {
      if (this.heartRateBuilder_ == null) {
         this.heartRate_ = null;
         this.onChanged();
      } else {
         this.heartRateBuilder_.clear();
      }

      this.bitField0_ &= -129;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder clearInTargetZone() {
      if (this.inTargetZoneBuilder_ == null) {
         this.inTargetZone_ = null;
         this.onChanged();
      } else {
         this.inTargetZoneBuilder_.clear();
      }

      this.bitField0_ &= -65;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder clearIndex() {
      this.bitField0_ &= -2;
      this.index_ = 0;
      this.onChanged();
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder clearLeftRightBalance() {
      if (this.leftRightBalanceBuilder_ == null) {
         this.leftRightBalance_ = null;
         this.onChanged();
      } else {
         this.leftRightBalanceBuilder_.clear();
      }

      this.bitField0_ &= -2049;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder clearOneof(OneofDescriptor var1) {
      return (ExercisePhaseStats$PbPhaseRepetition$Builder)super.clearOneof(var1);
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder clearPhaseFinished() {
      this.bitField0_ &= -9;
      this.phaseFinished_ = false;
      this.onChanged();
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder clearPower() {
      if (this.powerBuilder_ == null) {
         this.power_ = null;
         this.onChanged();
      } else {
         this.powerBuilder_.clear();
      }

      this.bitField0_ &= -1025;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder clearSpeed() {
      if (this.speedBuilder_ == null) {
         this.speed_ = null;
         this.onChanged();
      } else {
         this.speedBuilder_.clear();
      }

      this.bitField0_ &= -257;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder clearSplitDistance() {
      this.bitField0_ &= -17;
      this.splitDistance_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder clearSplitTime() {
      if (this.splitTimeBuilder_ == null) {
         this.splitTime_ = null;
         this.onChanged();
      } else {
         this.splitTimeBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder clearStrideLength() {
      if (this.strideLengthBuilder_ == null) {
         this.strideLength_ = null;
         this.onChanged();
      } else {
         this.strideLengthBuilder_.clear();
      }

      this.bitField0_ &= -4097;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder clearStrokeCount() {
      this.bitField0_ &= -8193;
      this.strokeCount_ = 0;
      this.onChanged();
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder clearStrokesPerMin() {
      this.bitField0_ &= -32769;
      this.strokesPerMin_ = 0;
      this.onChanged();
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder clone() {
      return (ExercisePhaseStats$PbPhaseRepetition$Builder)super.clone();
   }

   public float getAscent() {
      return this.ascent_;
   }

   public float getAverageSwolf() {
      return this.averageSwolf_;
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
      this.bitField0_ |= 512;
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

   public ExercisePhaseStats$PbPhaseRepetition getDefaultInstanceForType() {
      return ExercisePhaseStats$PbPhaseRepetition.getDefaultInstance();
   }

   public float getDescent() {
      return this.descent_;
   }

   public Descriptor getDescriptorForType() {
      return ExercisePhaseStats.e();
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
      this.bitField0_ |= 4;
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

   public ExercisePhaseStats$PbPhaseHeartRateStatistics getHeartRate() {
      ExercisePhaseStats$PbPhaseHeartRateStatistics var1;
      if (this.heartRateBuilder_ == null) {
         if (this.heartRate_ == null) {
            var1 = ExercisePhaseStats$PbPhaseHeartRateStatistics.getDefaultInstance();
         } else {
            var1 = this.heartRate_;
         }
      } else {
         var1 = (ExercisePhaseStats$PbPhaseHeartRateStatistics)this.heartRateBuilder_.getMessage();
      }

      return var1;
   }

   public ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder getHeartRateBuilder() {
      this.bitField0_ |= 128;
      this.onChanged();
      return (ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder)this.getHeartRateFieldBuilder().getBuilder();
   }

   public ExercisePhaseStats$PbPhaseHeartRateStatisticsOrBuilder getHeartRateOrBuilder() {
      Object var1;
      if (this.heartRateBuilder_ != null) {
         var1 = (ExercisePhaseStats$PbPhaseHeartRateStatisticsOrBuilder)this.heartRateBuilder_.getMessageOrBuilder();
      } else if (this.heartRate_ == null) {
         var1 = ExercisePhaseStats$PbPhaseHeartRateStatistics.getDefaultInstance();
      } else {
         var1 = this.heartRate_;
      }

      return (ExercisePhaseStats$PbPhaseHeartRateStatisticsOrBuilder)var1;
   }

   public Types$PbDuration getInTargetZone() {
      Types$PbDuration var1;
      if (this.inTargetZoneBuilder_ == null) {
         if (this.inTargetZone_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.inTargetZone_;
         }
      } else {
         var1 = (Types$PbDuration)this.inTargetZoneBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getInTargetZoneBuilder() {
      this.bitField0_ |= 64;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getInTargetZoneFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getInTargetZoneOrBuilder() {
      Object var1;
      if (this.inTargetZoneBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.inTargetZoneBuilder_.getMessageOrBuilder();
      } else if (this.inTargetZone_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.inTargetZone_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public int getIndex() {
      return this.index_;
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
      this.bitField0_ |= 2048;
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

   public boolean getPhaseFinished() {
      return this.phaseFinished_;
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
      this.bitField0_ |= 1024;
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
      this.bitField0_ |= 256;
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

   public float getSplitDistance() {
      return this.splitDistance_;
   }

   public Types$PbDuration getSplitTime() {
      Types$PbDuration var1;
      if (this.splitTimeBuilder_ == null) {
         if (this.splitTime_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.splitTime_;
         }
      } else {
         var1 = (Types$PbDuration)this.splitTimeBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getSplitTimeBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getSplitTimeFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getSplitTimeOrBuilder() {
      Object var1;
      if (this.splitTimeBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.splitTimeBuilder_.getMessageOrBuilder();
      } else if (this.splitTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.splitTime_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public ExercisePhaseStats$PbPhaseStrideLengthStatistics getStrideLength() {
      ExercisePhaseStats$PbPhaseStrideLengthStatistics var1;
      if (this.strideLengthBuilder_ == null) {
         if (this.strideLength_ == null) {
            var1 = ExercisePhaseStats$PbPhaseStrideLengthStatistics.getDefaultInstance();
         } else {
            var1 = this.strideLength_;
         }
      } else {
         var1 = (ExercisePhaseStats$PbPhaseStrideLengthStatistics)this.strideLengthBuilder_.getMessage();
      }

      return var1;
   }

   public ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder getStrideLengthBuilder() {
      this.bitField0_ |= 4096;
      this.onChanged();
      return (ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder)this.getStrideLengthFieldBuilder().getBuilder();
   }

   public ExercisePhaseStats$PbPhaseStrideLengthStatisticsOrBuilder getStrideLengthOrBuilder() {
      Object var1;
      if (this.strideLengthBuilder_ != null) {
         var1 = (ExercisePhaseStats$PbPhaseStrideLengthStatisticsOrBuilder)this.strideLengthBuilder_.getMessageOrBuilder();
      } else if (this.strideLength_ == null) {
         var1 = ExercisePhaseStats$PbPhaseStrideLengthStatistics.getDefaultInstance();
      } else {
         var1 = this.strideLength_;
      }

      return (ExercisePhaseStats$PbPhaseStrideLengthStatisticsOrBuilder)var1;
   }

   public int getStrokeCount() {
      return this.strokeCount_;
   }

   public int getStrokesPerMin() {
      return this.strokesPerMin_;
   }

   public boolean hasAscent() {
      boolean var1;
      if ((this.bitField0_ & 65536) == 65536) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAverageSwolf() {
      boolean var1;
      if ((this.bitField0_ & 16384) == 16384) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasCadence() {
      boolean var1;
      if ((this.bitField0_ & 512) == 512) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDescent() {
      boolean var1;
      if ((this.bitField0_ & 131072) == 131072) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDistance() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDuration() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasHeartRate() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasInTargetZone() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasIndex() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLeftRightBalance() {
      boolean var1;
      if ((this.bitField0_ & 2048) == 2048) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPhaseFinished() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPower() {
      boolean var1;
      if ((this.bitField0_ & 1024) == 1024) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSpeed() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSplitDistance() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSplitTime() {
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
      if ((this.bitField0_ & 4096) == 4096) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStrokeCount() {
      boolean var1;
      if ((this.bitField0_ & 8192) == 8192) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStrokesPerMin() {
      boolean var1;
      if ((this.bitField0_ & '耀') == 32768) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExercisePhaseStats.f().ensureFieldAccessorsInitialized(ExercisePhaseStats$PbPhaseRepetition.class, ExercisePhaseStats$PbPhaseRepetition$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasIndex()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasSplitTime()) {
            var2 = var1;
            if (this.hasDuration()) {
               var2 = true;
            }
         }
      }

      return var2;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder mergeCadence(ExerciseStatistics$PbCadenceStatistics var1) {
      if (this.cadenceBuilder_ == null) {
         if ((this.bitField0_ & 512) == 512 && this.cadence_ != null && this.cadence_ != ExerciseStatistics$PbCadenceStatistics.getDefaultInstance()) {
            this.cadence_ = ExerciseStatistics$PbCadenceStatistics.newBuilder(this.cadence_).mergeFrom(var1).buildPartial();
         } else {
            this.cadence_ = var1;
         }

         this.onChanged();
      } else {
         this.cadenceBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 512;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder mergeDuration(Types$PbDuration var1) {
      if (this.durationBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.duration_ != null && this.duration_ != Types$PbDuration.getDefaultInstance()) {
            this.duration_ = Types$PbDuration.newBuilder(this.duration_).mergeFrom(var1).buildPartial();
         } else {
            this.duration_ = var1;
         }

         this.onChanged();
      } else {
         this.durationBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExercisePhaseStats$PbPhaseRepetition var13;
      label96: {
         InvalidProtocolBufferException var12;
         ExercisePhaseStats$PbPhaseRepetition var14;
         try {
            var13 = (ExercisePhaseStats$PbPhaseRepetition)ExercisePhaseStats$PbPhaseRepetition.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (ExercisePhaseStats$PbPhaseRepetition)var10.getUnfinishedMessage();
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

   public ExercisePhaseStats$PbPhaseRepetition$Builder mergeFrom(Message var1) {
      ExercisePhaseStats$PbPhaseRepetition$Builder var2;
      if (var1 instanceof ExercisePhaseStats$PbPhaseRepetition) {
         var2 = this.mergeFrom((ExercisePhaseStats$PbPhaseRepetition)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder mergeFrom(ExercisePhaseStats$PbPhaseRepetition var1) {
      if (var1 != ExercisePhaseStats$PbPhaseRepetition.getDefaultInstance()) {
         if (var1.hasIndex()) {
            this.setIndex(var1.getIndex());
         }

         if (var1.hasSplitTime()) {
            this.mergeSplitTime(var1.getSplitTime());
         }

         if (var1.hasDuration()) {
            this.mergeDuration(var1.getDuration());
         }

         if (var1.hasPhaseFinished()) {
            this.setPhaseFinished(var1.getPhaseFinished());
         }

         if (var1.hasSplitDistance()) {
            this.setSplitDistance(var1.getSplitDistance());
         }

         if (var1.hasDistance()) {
            this.setDistance(var1.getDistance());
         }

         if (var1.hasInTargetZone()) {
            this.mergeInTargetZone(var1.getInTargetZone());
         }

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

         if (var1.hasLeftRightBalance()) {
            this.mergeLeftRightBalance(var1.getLeftRightBalance());
         }

         if (var1.hasStrideLength()) {
            this.mergeStrideLength(var1.getStrideLength());
         }

         if (var1.hasStrokeCount()) {
            this.setStrokeCount(var1.getStrokeCount());
         }

         if (var1.hasAverageSwolf()) {
            this.setAverageSwolf(var1.getAverageSwolf());
         }

         if (var1.hasStrokesPerMin()) {
            this.setStrokesPerMin(var1.getStrokesPerMin());
         }

         if (var1.hasAscent()) {
            this.setAscent(var1.getAscent());
         }

         if (var1.hasDescent()) {
            this.setDescent(var1.getDescent());
         }

         this.mergeUnknownFields(ExercisePhaseStats$PbPhaseRepetition.a(var1));
         this.onChanged();
      }

      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder mergeHeartRate(ExercisePhaseStats$PbPhaseHeartRateStatistics var1) {
      if (this.heartRateBuilder_ == null) {
         if ((this.bitField0_ & 128) == 128 && this.heartRate_ != null && this.heartRate_ != ExercisePhaseStats$PbPhaseHeartRateStatistics.getDefaultInstance()) {
            this.heartRate_ = ExercisePhaseStats$PbPhaseHeartRateStatistics.newBuilder(this.heartRate_).mergeFrom(var1).buildPartial();
         } else {
            this.heartRate_ = var1;
         }

         this.onChanged();
      } else {
         this.heartRateBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 128;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder mergeInTargetZone(Types$PbDuration var1) {
      if (this.inTargetZoneBuilder_ == null) {
         if ((this.bitField0_ & 64) == 64 && this.inTargetZone_ != null && this.inTargetZone_ != Types$PbDuration.getDefaultInstance()) {
            this.inTargetZone_ = Types$PbDuration.newBuilder(this.inTargetZone_).mergeFrom(var1).buildPartial();
         } else {
            this.inTargetZone_ = var1;
         }

         this.onChanged();
      } else {
         this.inTargetZoneBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder mergeLeftRightBalance(ExerciseStatistics$PbLRBalanceStatistics var1) {
      if (this.leftRightBalanceBuilder_ == null) {
         if ((this.bitField0_ & 2048) == 2048 && this.leftRightBalance_ != null && this.leftRightBalance_ != ExerciseStatistics$PbLRBalanceStatistics.getDefaultInstance()) {
            this.leftRightBalance_ = ExerciseStatistics$PbLRBalanceStatistics.newBuilder(this.leftRightBalance_).mergeFrom(var1).buildPartial();
         } else {
            this.leftRightBalance_ = var1;
         }

         this.onChanged();
      } else {
         this.leftRightBalanceBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2048;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder mergePower(ExerciseStatistics$PbPowerStatistics var1) {
      if (this.powerBuilder_ == null) {
         if ((this.bitField0_ & 1024) == 1024 && this.power_ != null && this.power_ != ExerciseStatistics$PbPowerStatistics.getDefaultInstance()) {
            this.power_ = ExerciseStatistics$PbPowerStatistics.newBuilder(this.power_).mergeFrom(var1).buildPartial();
         } else {
            this.power_ = var1;
         }

         this.onChanged();
      } else {
         this.powerBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder mergeSpeed(ExerciseStatistics$PbSpeedStatistics var1) {
      if (this.speedBuilder_ == null) {
         if ((this.bitField0_ & 256) == 256 && this.speed_ != null && this.speed_ != ExerciseStatistics$PbSpeedStatistics.getDefaultInstance()) {
            this.speed_ = ExerciseStatistics$PbSpeedStatistics.newBuilder(this.speed_).mergeFrom(var1).buildPartial();
         } else {
            this.speed_ = var1;
         }

         this.onChanged();
      } else {
         this.speedBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 256;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder mergeSplitTime(Types$PbDuration var1) {
      if (this.splitTimeBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.splitTime_ != null && this.splitTime_ != Types$PbDuration.getDefaultInstance()) {
            this.splitTime_ = Types$PbDuration.newBuilder(this.splitTime_).mergeFrom(var1).buildPartial();
         } else {
            this.splitTime_ = var1;
         }

         this.onChanged();
      } else {
         this.splitTimeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder mergeStrideLength(ExercisePhaseStats$PbPhaseStrideLengthStatistics var1) {
      if (this.strideLengthBuilder_ == null) {
         if ((this.bitField0_ & 4096) == 4096 && this.strideLength_ != null && this.strideLength_ != ExercisePhaseStats$PbPhaseStrideLengthStatistics.getDefaultInstance()) {
            this.strideLength_ = ExercisePhaseStats$PbPhaseStrideLengthStatistics.newBuilder(this.strideLength_).mergeFrom(var1).buildPartial();
         } else {
            this.strideLength_ = var1;
         }

         this.onChanged();
      } else {
         this.strideLengthBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4096;
      return this;
   }

   public final ExercisePhaseStats$PbPhaseRepetition$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExercisePhaseStats$PbPhaseRepetition$Builder)super.mergeUnknownFields(var1);
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setAscent(float var1) {
      this.bitField0_ |= 65536;
      this.ascent_ = var1;
      this.onChanged();
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setAverageSwolf(float var1) {
      this.bitField0_ |= 16384;
      this.averageSwolf_ = var1;
      this.onChanged();
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setCadence(ExerciseStatistics$PbCadenceStatistics$Builder var1) {
      if (this.cadenceBuilder_ == null) {
         this.cadence_ = var1.build();
         this.onChanged();
      } else {
         this.cadenceBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 512;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setCadence(ExerciseStatistics$PbCadenceStatistics var1) {
      if (this.cadenceBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.cadence_ = var1;
         this.onChanged();
      } else {
         this.cadenceBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 512;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setDescent(float var1) {
      this.bitField0_ |= 131072;
      this.descent_ = var1;
      this.onChanged();
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setDistance(float var1) {
      this.bitField0_ |= 32;
      this.distance_ = var1;
      this.onChanged();
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setDuration(Types$PbDuration$Builder var1) {
      if (this.durationBuilder_ == null) {
         this.duration_ = var1.build();
         this.onChanged();
      } else {
         this.durationBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setDuration(Types$PbDuration var1) {
      if (this.durationBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.duration_ = var1;
         this.onChanged();
      } else {
         this.durationBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExercisePhaseStats$PbPhaseRepetition$Builder)super.setField(var1, var2);
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setHeartRate(ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder var1) {
      if (this.heartRateBuilder_ == null) {
         this.heartRate_ = var1.build();
         this.onChanged();
      } else {
         this.heartRateBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 128;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setHeartRate(ExercisePhaseStats$PbPhaseHeartRateStatistics var1) {
      if (this.heartRateBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.heartRate_ = var1;
         this.onChanged();
      } else {
         this.heartRateBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 128;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setInTargetZone(Types$PbDuration$Builder var1) {
      if (this.inTargetZoneBuilder_ == null) {
         this.inTargetZone_ = var1.build();
         this.onChanged();
      } else {
         this.inTargetZoneBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 64;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setInTargetZone(Types$PbDuration var1) {
      if (this.inTargetZoneBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.inTargetZone_ = var1;
         this.onChanged();
      } else {
         this.inTargetZoneBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setIndex(int var1) {
      this.bitField0_ |= 1;
      this.index_ = var1;
      this.onChanged();
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setLeftRightBalance(ExerciseStatistics$PbLRBalanceStatistics$Builder var1) {
      if (this.leftRightBalanceBuilder_ == null) {
         this.leftRightBalance_ = var1.build();
         this.onChanged();
      } else {
         this.leftRightBalanceBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2048;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setLeftRightBalance(ExerciseStatistics$PbLRBalanceStatistics var1) {
      if (this.leftRightBalanceBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.leftRightBalance_ = var1;
         this.onChanged();
      } else {
         this.leftRightBalanceBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2048;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setPhaseFinished(boolean var1) {
      this.bitField0_ |= 8;
      this.phaseFinished_ = var1;
      this.onChanged();
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setPower(ExerciseStatistics$PbPowerStatistics$Builder var1) {
      if (this.powerBuilder_ == null) {
         this.power_ = var1.build();
         this.onChanged();
      } else {
         this.powerBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setPower(ExerciseStatistics$PbPowerStatistics var1) {
      if (this.powerBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.power_ = var1;
         this.onChanged();
      } else {
         this.powerBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExercisePhaseStats$PbPhaseRepetition$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setSpeed(ExerciseStatistics$PbSpeedStatistics$Builder var1) {
      if (this.speedBuilder_ == null) {
         this.speed_ = var1.build();
         this.onChanged();
      } else {
         this.speedBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 256;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setSpeed(ExerciseStatistics$PbSpeedStatistics var1) {
      if (this.speedBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.speed_ = var1;
         this.onChanged();
      } else {
         this.speedBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 256;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setSplitDistance(float var1) {
      this.bitField0_ |= 16;
      this.splitDistance_ = var1;
      this.onChanged();
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setSplitTime(Types$PbDuration$Builder var1) {
      if (this.splitTimeBuilder_ == null) {
         this.splitTime_ = var1.build();
         this.onChanged();
      } else {
         this.splitTimeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setSplitTime(Types$PbDuration var1) {
      if (this.splitTimeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.splitTime_ = var1;
         this.onChanged();
      } else {
         this.splitTimeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setStrideLength(ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder var1) {
      if (this.strideLengthBuilder_ == null) {
         this.strideLength_ = var1.build();
         this.onChanged();
      } else {
         this.strideLengthBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4096;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setStrideLength(ExercisePhaseStats$PbPhaseStrideLengthStatistics var1) {
      if (this.strideLengthBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.strideLength_ = var1;
         this.onChanged();
      } else {
         this.strideLengthBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4096;
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setStrokeCount(int var1) {
      this.bitField0_ |= 8192;
      this.strokeCount_ = var1;
      this.onChanged();
      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder setStrokesPerMin(int var1) {
      this.bitField0_ |= 32768;
      this.strokesPerMin_ = var1;
      this.onChanged();
      return this;
   }

   public final ExercisePhaseStats$PbPhaseRepetition$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExercisePhaseStats$PbPhaseRepetition$Builder)super.setUnknownFields(var1);
   }
}
