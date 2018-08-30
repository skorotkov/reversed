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

public final class DailySummary$PbActivityClassTimes$Builder extends Builder implements DailySummary$PbActivityClassTimesOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 timeContinuousModerateBuilder_;
   private Types$PbDuration timeContinuousModerate_;
   private SingleFieldBuilderV3 timeContinuousVigorousBuilder_;
   private Types$PbDuration timeContinuousVigorous_;
   private SingleFieldBuilderV3 timeIntermittentModerateBuilder_;
   private Types$PbDuration timeIntermittentModerate_;
   private SingleFieldBuilderV3 timeIntermittentVigorousBuilder_;
   private Types$PbDuration timeIntermittentVigorous_;
   private SingleFieldBuilderV3 timeLightActivityBuilder_;
   private Types$PbDuration timeLightActivity_;
   private SingleFieldBuilderV3 timeNonWearBuilder_;
   private Types$PbDuration timeNonWear_;
   private SingleFieldBuilderV3 timeSedentaryBuilder_;
   private Types$PbDuration timeSedentary_;
   private SingleFieldBuilderV3 timeSleepBuilder_;
   private Types$PbDuration timeSleep_;

   private DailySummary$PbActivityClassTimes$Builder() {
      this.timeNonWear_ = null;
      this.timeSleep_ = null;
      this.timeSedentary_ = null;
      this.timeLightActivity_ = null;
      this.timeContinuousModerate_ = null;
      this.timeIntermittentModerate_ = null;
      this.timeContinuousVigorous_ = null;
      this.timeIntermittentVigorous_ = null;
      this.maybeForceBuilderInitialization();
   }

   private DailySummary$PbActivityClassTimes$Builder(BuilderParent var1) {
      super(var1);
      this.timeNonWear_ = null;
      this.timeSleep_ = null;
      this.timeSedentary_ = null;
      this.timeLightActivity_ = null;
      this.timeContinuousModerate_ = null;
      this.timeIntermittentModerate_ = null;
      this.timeContinuousVigorous_ = null;
      this.timeIntermittentVigorous_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   DailySummary$PbActivityClassTimes$Builder(BuilderParent var1, DailySummary$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   DailySummary$PbActivityClassTimes$Builder(DailySummary$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return DailySummary.c();
   }

   private SingleFieldBuilderV3 getTimeContinuousModerateFieldBuilder() {
      if (this.timeContinuousModerateBuilder_ == null) {
         this.timeContinuousModerateBuilder_ = new SingleFieldBuilderV3(this.getTimeContinuousModerate(), this.getParentForChildren(), this.isClean());
         this.timeContinuousModerate_ = null;
      }

      return this.timeContinuousModerateBuilder_;
   }

   private SingleFieldBuilderV3 getTimeContinuousVigorousFieldBuilder() {
      if (this.timeContinuousVigorousBuilder_ == null) {
         this.timeContinuousVigorousBuilder_ = new SingleFieldBuilderV3(this.getTimeContinuousVigorous(), this.getParentForChildren(), this.isClean());
         this.timeContinuousVigorous_ = null;
      }

      return this.timeContinuousVigorousBuilder_;
   }

   private SingleFieldBuilderV3 getTimeIntermittentModerateFieldBuilder() {
      if (this.timeIntermittentModerateBuilder_ == null) {
         this.timeIntermittentModerateBuilder_ = new SingleFieldBuilderV3(this.getTimeIntermittentModerate(), this.getParentForChildren(), this.isClean());
         this.timeIntermittentModerate_ = null;
      }

      return this.timeIntermittentModerateBuilder_;
   }

   private SingleFieldBuilderV3 getTimeIntermittentVigorousFieldBuilder() {
      if (this.timeIntermittentVigorousBuilder_ == null) {
         this.timeIntermittentVigorousBuilder_ = new SingleFieldBuilderV3(this.getTimeIntermittentVigorous(), this.getParentForChildren(), this.isClean());
         this.timeIntermittentVigorous_ = null;
      }

      return this.timeIntermittentVigorousBuilder_;
   }

   private SingleFieldBuilderV3 getTimeLightActivityFieldBuilder() {
      if (this.timeLightActivityBuilder_ == null) {
         this.timeLightActivityBuilder_ = new SingleFieldBuilderV3(this.getTimeLightActivity(), this.getParentForChildren(), this.isClean());
         this.timeLightActivity_ = null;
      }

      return this.timeLightActivityBuilder_;
   }

   private SingleFieldBuilderV3 getTimeNonWearFieldBuilder() {
      if (this.timeNonWearBuilder_ == null) {
         this.timeNonWearBuilder_ = new SingleFieldBuilderV3(this.getTimeNonWear(), this.getParentForChildren(), this.isClean());
         this.timeNonWear_ = null;
      }

      return this.timeNonWearBuilder_;
   }

   private SingleFieldBuilderV3 getTimeSedentaryFieldBuilder() {
      if (this.timeSedentaryBuilder_ == null) {
         this.timeSedentaryBuilder_ = new SingleFieldBuilderV3(this.getTimeSedentary(), this.getParentForChildren(), this.isClean());
         this.timeSedentary_ = null;
      }

      return this.timeSedentaryBuilder_;
   }

   private SingleFieldBuilderV3 getTimeSleepFieldBuilder() {
      if (this.timeSleepBuilder_ == null) {
         this.timeSleepBuilder_ = new SingleFieldBuilderV3(this.getTimeSleep(), this.getParentForChildren(), this.isClean());
         this.timeSleep_ = null;
      }

      return this.timeSleepBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (DailySummary$PbActivityClassTimes.b()) {
         this.getTimeNonWearFieldBuilder();
         this.getTimeSleepFieldBuilder();
         this.getTimeSedentaryFieldBuilder();
         this.getTimeLightActivityFieldBuilder();
         this.getTimeContinuousModerateFieldBuilder();
         this.getTimeIntermittentModerateFieldBuilder();
         this.getTimeContinuousVigorousFieldBuilder();
         this.getTimeIntermittentVigorousFieldBuilder();
      }

   }

   public DailySummary$PbActivityClassTimes$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (DailySummary$PbActivityClassTimes$Builder)super.addRepeatedField(var1, var2);
   }

   public DailySummary$PbActivityClassTimes build() {
      DailySummary$PbActivityClassTimes var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public DailySummary$PbActivityClassTimes buildPartial() {
      DailySummary$PbActivityClassTimes var1 = new DailySummary$PbActivityClassTimes(this, (DailySummary$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.timeNonWearBuilder_ == null) {
         DailySummary$PbActivityClassTimes.a(var1, this.timeNonWear_);
      } else {
         DailySummary$PbActivityClassTimes.a(var1, (Types$PbDuration)this.timeNonWearBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.timeSleepBuilder_ == null) {
         DailySummary$PbActivityClassTimes.b(var1, this.timeSleep_);
      } else {
         DailySummary$PbActivityClassTimes.b(var1, (Types$PbDuration)this.timeSleepBuilder_.build());
      }

      int var6 = var4;
      if ((var2 & 4) == 4) {
         var6 = var4 | 4;
      }

      if (this.timeSedentaryBuilder_ == null) {
         DailySummary$PbActivityClassTimes.c(var1, this.timeSedentary_);
      } else {
         DailySummary$PbActivityClassTimes.c(var1, (Types$PbDuration)this.timeSedentaryBuilder_.build());
      }

      int var5 = var6;
      if ((var2 & 8) == 8) {
         var5 = var6 | 8;
      }

      if (this.timeLightActivityBuilder_ == null) {
         DailySummary$PbActivityClassTimes.d(var1, this.timeLightActivity_);
      } else {
         DailySummary$PbActivityClassTimes.d(var1, (Types$PbDuration)this.timeLightActivityBuilder_.build());
      }

      var4 = var5;
      if ((var2 & 16) == 16) {
         var4 = var5 | 16;
      }

      if (this.timeContinuousModerateBuilder_ == null) {
         DailySummary$PbActivityClassTimes.e(var1, this.timeContinuousModerate_);
      } else {
         DailySummary$PbActivityClassTimes.e(var1, (Types$PbDuration)this.timeContinuousModerateBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 32) == 32) {
         var6 = var4 | 32;
      }

      if (this.timeIntermittentModerateBuilder_ == null) {
         DailySummary$PbActivityClassTimes.f(var1, this.timeIntermittentModerate_);
      } else {
         DailySummary$PbActivityClassTimes.f(var1, (Types$PbDuration)this.timeIntermittentModerateBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 64) == 64) {
         var4 = var6 | 64;
      }

      if (this.timeContinuousVigorousBuilder_ == null) {
         DailySummary$PbActivityClassTimes.g(var1, this.timeContinuousVigorous_);
      } else {
         DailySummary$PbActivityClassTimes.g(var1, (Types$PbDuration)this.timeContinuousVigorousBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 128) == 128) {
         var6 = var4 | 128;
      }

      if (this.timeIntermittentVigorousBuilder_ == null) {
         DailySummary$PbActivityClassTimes.h(var1, this.timeIntermittentVigorous_);
      } else {
         DailySummary$PbActivityClassTimes.h(var1, (Types$PbDuration)this.timeIntermittentVigorousBuilder_.build());
      }

      DailySummary$PbActivityClassTimes.a(var1, var6);
      this.onBuilt();
      return var1;
   }

   public DailySummary$PbActivityClassTimes$Builder clear() {
      super.clear();
      if (this.timeNonWearBuilder_ == null) {
         this.timeNonWear_ = null;
      } else {
         this.timeNonWearBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.timeSleepBuilder_ == null) {
         this.timeSleep_ = null;
      } else {
         this.timeSleepBuilder_.clear();
      }

      this.bitField0_ &= -3;
      if (this.timeSedentaryBuilder_ == null) {
         this.timeSedentary_ = null;
      } else {
         this.timeSedentaryBuilder_.clear();
      }

      this.bitField0_ &= -5;
      if (this.timeLightActivityBuilder_ == null) {
         this.timeLightActivity_ = null;
      } else {
         this.timeLightActivityBuilder_.clear();
      }

      this.bitField0_ &= -9;
      if (this.timeContinuousModerateBuilder_ == null) {
         this.timeContinuousModerate_ = null;
      } else {
         this.timeContinuousModerateBuilder_.clear();
      }

      this.bitField0_ &= -17;
      if (this.timeIntermittentModerateBuilder_ == null) {
         this.timeIntermittentModerate_ = null;
      } else {
         this.timeIntermittentModerateBuilder_.clear();
      }

      this.bitField0_ &= -33;
      if (this.timeContinuousVigorousBuilder_ == null) {
         this.timeContinuousVigorous_ = null;
      } else {
         this.timeContinuousVigorousBuilder_.clear();
      }

      this.bitField0_ &= -65;
      if (this.timeIntermittentVigorousBuilder_ == null) {
         this.timeIntermittentVigorous_ = null;
      } else {
         this.timeIntermittentVigorousBuilder_.clear();
      }

      this.bitField0_ &= -129;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder clearField(FieldDescriptor var1) {
      return (DailySummary$PbActivityClassTimes$Builder)super.clearField(var1);
   }

   public DailySummary$PbActivityClassTimes$Builder clearOneof(OneofDescriptor var1) {
      return (DailySummary$PbActivityClassTimes$Builder)super.clearOneof(var1);
   }

   public DailySummary$PbActivityClassTimes$Builder clearTimeContinuousModerate() {
      if (this.timeContinuousModerateBuilder_ == null) {
         this.timeContinuousModerate_ = null;
         this.onChanged();
      } else {
         this.timeContinuousModerateBuilder_.clear();
      }

      this.bitField0_ &= -17;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder clearTimeContinuousVigorous() {
      if (this.timeContinuousVigorousBuilder_ == null) {
         this.timeContinuousVigorous_ = null;
         this.onChanged();
      } else {
         this.timeContinuousVigorousBuilder_.clear();
      }

      this.bitField0_ &= -65;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder clearTimeIntermittentModerate() {
      if (this.timeIntermittentModerateBuilder_ == null) {
         this.timeIntermittentModerate_ = null;
         this.onChanged();
      } else {
         this.timeIntermittentModerateBuilder_.clear();
      }

      this.bitField0_ &= -33;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder clearTimeIntermittentVigorous() {
      if (this.timeIntermittentVigorousBuilder_ == null) {
         this.timeIntermittentVigorous_ = null;
         this.onChanged();
      } else {
         this.timeIntermittentVigorousBuilder_.clear();
      }

      this.bitField0_ &= -129;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder clearTimeLightActivity() {
      if (this.timeLightActivityBuilder_ == null) {
         this.timeLightActivity_ = null;
         this.onChanged();
      } else {
         this.timeLightActivityBuilder_.clear();
      }

      this.bitField0_ &= -9;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder clearTimeNonWear() {
      if (this.timeNonWearBuilder_ == null) {
         this.timeNonWear_ = null;
         this.onChanged();
      } else {
         this.timeNonWearBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder clearTimeSedentary() {
      if (this.timeSedentaryBuilder_ == null) {
         this.timeSedentary_ = null;
         this.onChanged();
      } else {
         this.timeSedentaryBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder clearTimeSleep() {
      if (this.timeSleepBuilder_ == null) {
         this.timeSleep_ = null;
         this.onChanged();
      } else {
         this.timeSleepBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder clone() {
      return (DailySummary$PbActivityClassTimes$Builder)super.clone();
   }

   public DailySummary$PbActivityClassTimes getDefaultInstanceForType() {
      return DailySummary$PbActivityClassTimes.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return DailySummary.c();
   }

   public Types$PbDuration getTimeContinuousModerate() {
      Types$PbDuration var1;
      if (this.timeContinuousModerateBuilder_ == null) {
         if (this.timeContinuousModerate_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.timeContinuousModerate_;
         }
      } else {
         var1 = (Types$PbDuration)this.timeContinuousModerateBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getTimeContinuousModerateBuilder() {
      this.bitField0_ |= 16;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getTimeContinuousModerateFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getTimeContinuousModerateOrBuilder() {
      Object var1;
      if (this.timeContinuousModerateBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.timeContinuousModerateBuilder_.getMessageOrBuilder();
      } else if (this.timeContinuousModerate_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeContinuousModerate_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public Types$PbDuration getTimeContinuousVigorous() {
      Types$PbDuration var1;
      if (this.timeContinuousVigorousBuilder_ == null) {
         if (this.timeContinuousVigorous_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.timeContinuousVigorous_;
         }
      } else {
         var1 = (Types$PbDuration)this.timeContinuousVigorousBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getTimeContinuousVigorousBuilder() {
      this.bitField0_ |= 64;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getTimeContinuousVigorousFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getTimeContinuousVigorousOrBuilder() {
      Object var1;
      if (this.timeContinuousVigorousBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.timeContinuousVigorousBuilder_.getMessageOrBuilder();
      } else if (this.timeContinuousVigorous_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeContinuousVigorous_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public Types$PbDuration getTimeIntermittentModerate() {
      Types$PbDuration var1;
      if (this.timeIntermittentModerateBuilder_ == null) {
         if (this.timeIntermittentModerate_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.timeIntermittentModerate_;
         }
      } else {
         var1 = (Types$PbDuration)this.timeIntermittentModerateBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getTimeIntermittentModerateBuilder() {
      this.bitField0_ |= 32;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getTimeIntermittentModerateFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getTimeIntermittentModerateOrBuilder() {
      Object var1;
      if (this.timeIntermittentModerateBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.timeIntermittentModerateBuilder_.getMessageOrBuilder();
      } else if (this.timeIntermittentModerate_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeIntermittentModerate_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public Types$PbDuration getTimeIntermittentVigorous() {
      Types$PbDuration var1;
      if (this.timeIntermittentVigorousBuilder_ == null) {
         if (this.timeIntermittentVigorous_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.timeIntermittentVigorous_;
         }
      } else {
         var1 = (Types$PbDuration)this.timeIntermittentVigorousBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getTimeIntermittentVigorousBuilder() {
      this.bitField0_ |= 128;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getTimeIntermittentVigorousFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getTimeIntermittentVigorousOrBuilder() {
      Object var1;
      if (this.timeIntermittentVigorousBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.timeIntermittentVigorousBuilder_.getMessageOrBuilder();
      } else if (this.timeIntermittentVigorous_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeIntermittentVigorous_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public Types$PbDuration getTimeLightActivity() {
      Types$PbDuration var1;
      if (this.timeLightActivityBuilder_ == null) {
         if (this.timeLightActivity_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.timeLightActivity_;
         }
      } else {
         var1 = (Types$PbDuration)this.timeLightActivityBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getTimeLightActivityBuilder() {
      this.bitField0_ |= 8;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getTimeLightActivityFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getTimeLightActivityOrBuilder() {
      Object var1;
      if (this.timeLightActivityBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.timeLightActivityBuilder_.getMessageOrBuilder();
      } else if (this.timeLightActivity_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeLightActivity_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public Types$PbDuration getTimeNonWear() {
      Types$PbDuration var1;
      if (this.timeNonWearBuilder_ == null) {
         if (this.timeNonWear_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.timeNonWear_;
         }
      } else {
         var1 = (Types$PbDuration)this.timeNonWearBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getTimeNonWearBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getTimeNonWearFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getTimeNonWearOrBuilder() {
      Object var1;
      if (this.timeNonWearBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.timeNonWearBuilder_.getMessageOrBuilder();
      } else if (this.timeNonWear_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeNonWear_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public Types$PbDuration getTimeSedentary() {
      Types$PbDuration var1;
      if (this.timeSedentaryBuilder_ == null) {
         if (this.timeSedentary_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.timeSedentary_;
         }
      } else {
         var1 = (Types$PbDuration)this.timeSedentaryBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getTimeSedentaryBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getTimeSedentaryFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getTimeSedentaryOrBuilder() {
      Object var1;
      if (this.timeSedentaryBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.timeSedentaryBuilder_.getMessageOrBuilder();
      } else if (this.timeSedentary_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeSedentary_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public Types$PbDuration getTimeSleep() {
      Types$PbDuration var1;
      if (this.timeSleepBuilder_ == null) {
         if (this.timeSleep_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.timeSleep_;
         }
      } else {
         var1 = (Types$PbDuration)this.timeSleepBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getTimeSleepBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getTimeSleepFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getTimeSleepOrBuilder() {
      Object var1;
      if (this.timeSleepBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.timeSleepBuilder_.getMessageOrBuilder();
      } else if (this.timeSleep_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeSleep_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public boolean hasTimeContinuousModerate() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeContinuousVigorous() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeIntermittentModerate() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeIntermittentVigorous() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeLightActivity() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeNonWear() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeSedentary() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeSleep() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return DailySummary.d().ensureFieldAccessorsInitialized(DailySummary$PbActivityClassTimes.class, DailySummary$PbActivityClassTimes$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasTimeNonWear()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasTimeSleep()) {
            var2 = var1;
            if (this.hasTimeSedentary()) {
               var2 = var1;
               if (this.hasTimeLightActivity()) {
                  var2 = var1;
                  if (this.hasTimeContinuousModerate()) {
                     var2 = var1;
                     if (this.hasTimeIntermittentModerate()) {
                        var2 = var1;
                        if (this.hasTimeContinuousVigorous()) {
                           var2 = var1;
                           if (this.hasTimeIntermittentVigorous()) {
                              var2 = true;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var2;
   }

   public DailySummary$PbActivityClassTimes$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      DailySummary$PbActivityClassTimes var13;
      label96: {
         InvalidProtocolBufferException var12;
         DailySummary$PbActivityClassTimes var14;
         try {
            var13 = (DailySummary$PbActivityClassTimes)DailySummary$PbActivityClassTimes.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (DailySummary$PbActivityClassTimes)var10.getUnfinishedMessage();
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

   public DailySummary$PbActivityClassTimes$Builder mergeFrom(Message var1) {
      DailySummary$PbActivityClassTimes$Builder var2;
      if (var1 instanceof DailySummary$PbActivityClassTimes) {
         var2 = this.mergeFrom((DailySummary$PbActivityClassTimes)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public DailySummary$PbActivityClassTimes$Builder mergeFrom(DailySummary$PbActivityClassTimes var1) {
      if (var1 != DailySummary$PbActivityClassTimes.getDefaultInstance()) {
         if (var1.hasTimeNonWear()) {
            this.mergeTimeNonWear(var1.getTimeNonWear());
         }

         if (var1.hasTimeSleep()) {
            this.mergeTimeSleep(var1.getTimeSleep());
         }

         if (var1.hasTimeSedentary()) {
            this.mergeTimeSedentary(var1.getTimeSedentary());
         }

         if (var1.hasTimeLightActivity()) {
            this.mergeTimeLightActivity(var1.getTimeLightActivity());
         }

         if (var1.hasTimeContinuousModerate()) {
            this.mergeTimeContinuousModerate(var1.getTimeContinuousModerate());
         }

         if (var1.hasTimeIntermittentModerate()) {
            this.mergeTimeIntermittentModerate(var1.getTimeIntermittentModerate());
         }

         if (var1.hasTimeContinuousVigorous()) {
            this.mergeTimeContinuousVigorous(var1.getTimeContinuousVigorous());
         }

         if (var1.hasTimeIntermittentVigorous()) {
            this.mergeTimeIntermittentVigorous(var1.getTimeIntermittentVigorous());
         }

         this.mergeUnknownFields(DailySummary$PbActivityClassTimes.a(var1));
         this.onChanged();
      }

      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder mergeTimeContinuousModerate(Types$PbDuration var1) {
      if (this.timeContinuousModerateBuilder_ == null) {
         if ((this.bitField0_ & 16) == 16 && this.timeContinuousModerate_ != null && this.timeContinuousModerate_ != Types$PbDuration.getDefaultInstance()) {
            this.timeContinuousModerate_ = Types$PbDuration.newBuilder(this.timeContinuousModerate_).mergeFrom(var1).buildPartial();
         } else {
            this.timeContinuousModerate_ = var1;
         }

         this.onChanged();
      } else {
         this.timeContinuousModerateBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder mergeTimeContinuousVigorous(Types$PbDuration var1) {
      if (this.timeContinuousVigorousBuilder_ == null) {
         if ((this.bitField0_ & 64) == 64 && this.timeContinuousVigorous_ != null && this.timeContinuousVigorous_ != Types$PbDuration.getDefaultInstance()) {
            this.timeContinuousVigorous_ = Types$PbDuration.newBuilder(this.timeContinuousVigorous_).mergeFrom(var1).buildPartial();
         } else {
            this.timeContinuousVigorous_ = var1;
         }

         this.onChanged();
      } else {
         this.timeContinuousVigorousBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder mergeTimeIntermittentModerate(Types$PbDuration var1) {
      if (this.timeIntermittentModerateBuilder_ == null) {
         if ((this.bitField0_ & 32) == 32 && this.timeIntermittentModerate_ != null && this.timeIntermittentModerate_ != Types$PbDuration.getDefaultInstance()) {
            this.timeIntermittentModerate_ = Types$PbDuration.newBuilder(this.timeIntermittentModerate_).mergeFrom(var1).buildPartial();
         } else {
            this.timeIntermittentModerate_ = var1;
         }

         this.onChanged();
      } else {
         this.timeIntermittentModerateBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder mergeTimeIntermittentVigorous(Types$PbDuration var1) {
      if (this.timeIntermittentVigorousBuilder_ == null) {
         if ((this.bitField0_ & 128) == 128 && this.timeIntermittentVigorous_ != null && this.timeIntermittentVigorous_ != Types$PbDuration.getDefaultInstance()) {
            this.timeIntermittentVigorous_ = Types$PbDuration.newBuilder(this.timeIntermittentVigorous_).mergeFrom(var1).buildPartial();
         } else {
            this.timeIntermittentVigorous_ = var1;
         }

         this.onChanged();
      } else {
         this.timeIntermittentVigorousBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 128;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder mergeTimeLightActivity(Types$PbDuration var1) {
      if (this.timeLightActivityBuilder_ == null) {
         if ((this.bitField0_ & 8) == 8 && this.timeLightActivity_ != null && this.timeLightActivity_ != Types$PbDuration.getDefaultInstance()) {
            this.timeLightActivity_ = Types$PbDuration.newBuilder(this.timeLightActivity_).mergeFrom(var1).buildPartial();
         } else {
            this.timeLightActivity_ = var1;
         }

         this.onChanged();
      } else {
         this.timeLightActivityBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder mergeTimeNonWear(Types$PbDuration var1) {
      if (this.timeNonWearBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.timeNonWear_ != null && this.timeNonWear_ != Types$PbDuration.getDefaultInstance()) {
            this.timeNonWear_ = Types$PbDuration.newBuilder(this.timeNonWear_).mergeFrom(var1).buildPartial();
         } else {
            this.timeNonWear_ = var1;
         }

         this.onChanged();
      } else {
         this.timeNonWearBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder mergeTimeSedentary(Types$PbDuration var1) {
      if (this.timeSedentaryBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.timeSedentary_ != null && this.timeSedentary_ != Types$PbDuration.getDefaultInstance()) {
            this.timeSedentary_ = Types$PbDuration.newBuilder(this.timeSedentary_).mergeFrom(var1).buildPartial();
         } else {
            this.timeSedentary_ = var1;
         }

         this.onChanged();
      } else {
         this.timeSedentaryBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder mergeTimeSleep(Types$PbDuration var1) {
      if (this.timeSleepBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.timeSleep_ != null && this.timeSleep_ != Types$PbDuration.getDefaultInstance()) {
            this.timeSleep_ = Types$PbDuration.newBuilder(this.timeSleep_).mergeFrom(var1).buildPartial();
         } else {
            this.timeSleep_ = var1;
         }

         this.onChanged();
      } else {
         this.timeSleepBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final DailySummary$PbActivityClassTimes$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (DailySummary$PbActivityClassTimes$Builder)super.mergeUnknownFields(var1);
   }

   public DailySummary$PbActivityClassTimes$Builder setField(FieldDescriptor var1, Object var2) {
      return (DailySummary$PbActivityClassTimes$Builder)super.setField(var1, var2);
   }

   public DailySummary$PbActivityClassTimes$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (DailySummary$PbActivityClassTimes$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public DailySummary$PbActivityClassTimes$Builder setTimeContinuousModerate(Types$PbDuration$Builder var1) {
      if (this.timeContinuousModerateBuilder_ == null) {
         this.timeContinuousModerate_ = var1.build();
         this.onChanged();
      } else {
         this.timeContinuousModerateBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 16;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder setTimeContinuousModerate(Types$PbDuration var1) {
      if (this.timeContinuousModerateBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.timeContinuousModerate_ = var1;
         this.onChanged();
      } else {
         this.timeContinuousModerateBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder setTimeContinuousVigorous(Types$PbDuration$Builder var1) {
      if (this.timeContinuousVigorousBuilder_ == null) {
         this.timeContinuousVigorous_ = var1.build();
         this.onChanged();
      } else {
         this.timeContinuousVigorousBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 64;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder setTimeContinuousVigorous(Types$PbDuration var1) {
      if (this.timeContinuousVigorousBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.timeContinuousVigorous_ = var1;
         this.onChanged();
      } else {
         this.timeContinuousVigorousBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder setTimeIntermittentModerate(Types$PbDuration$Builder var1) {
      if (this.timeIntermittentModerateBuilder_ == null) {
         this.timeIntermittentModerate_ = var1.build();
         this.onChanged();
      } else {
         this.timeIntermittentModerateBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 32;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder setTimeIntermittentModerate(Types$PbDuration var1) {
      if (this.timeIntermittentModerateBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.timeIntermittentModerate_ = var1;
         this.onChanged();
      } else {
         this.timeIntermittentModerateBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder setTimeIntermittentVigorous(Types$PbDuration$Builder var1) {
      if (this.timeIntermittentVigorousBuilder_ == null) {
         this.timeIntermittentVigorous_ = var1.build();
         this.onChanged();
      } else {
         this.timeIntermittentVigorousBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 128;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder setTimeIntermittentVigorous(Types$PbDuration var1) {
      if (this.timeIntermittentVigorousBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.timeIntermittentVigorous_ = var1;
         this.onChanged();
      } else {
         this.timeIntermittentVigorousBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 128;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder setTimeLightActivity(Types$PbDuration$Builder var1) {
      if (this.timeLightActivityBuilder_ == null) {
         this.timeLightActivity_ = var1.build();
         this.onChanged();
      } else {
         this.timeLightActivityBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder setTimeLightActivity(Types$PbDuration var1) {
      if (this.timeLightActivityBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.timeLightActivity_ = var1;
         this.onChanged();
      } else {
         this.timeLightActivityBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder setTimeNonWear(Types$PbDuration$Builder var1) {
      if (this.timeNonWearBuilder_ == null) {
         this.timeNonWear_ = var1.build();
         this.onChanged();
      } else {
         this.timeNonWearBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder setTimeNonWear(Types$PbDuration var1) {
      if (this.timeNonWearBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.timeNonWear_ = var1;
         this.onChanged();
      } else {
         this.timeNonWearBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder setTimeSedentary(Types$PbDuration$Builder var1) {
      if (this.timeSedentaryBuilder_ == null) {
         this.timeSedentary_ = var1.build();
         this.onChanged();
      } else {
         this.timeSedentaryBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder setTimeSedentary(Types$PbDuration var1) {
      if (this.timeSedentaryBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.timeSedentary_ = var1;
         this.onChanged();
      } else {
         this.timeSedentaryBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder setTimeSleep(Types$PbDuration$Builder var1) {
      if (this.timeSleepBuilder_ == null) {
         this.timeSleep_ = var1.build();
         this.onChanged();
      } else {
         this.timeSleepBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public DailySummary$PbActivityClassTimes$Builder setTimeSleep(Types$PbDuration var1) {
      if (this.timeSleepBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.timeSleep_ = var1;
         this.onChanged();
      } else {
         this.timeSleepBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final DailySummary$PbActivityClassTimes$Builder setUnknownFields(UnknownFieldSet var1) {
      return (DailySummary$PbActivityClassTimes$Builder)super.setUnknownFields(var1);
   }
}
