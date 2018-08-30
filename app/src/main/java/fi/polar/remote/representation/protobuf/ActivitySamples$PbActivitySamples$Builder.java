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

public final class ActivitySamples$PbActivitySamples$Builder extends Builder implements ActivitySamples$PbActivitySamplesOrBuilder {
   private RepeatedFieldBuilderV3 activityInfoBuilder_;
   private List activityInfo_;
   private int bitField0_;
   private RepeatedFieldBuilderV3 inactivityNonWearTriggerBuilder_;
   private List inactivityNonWearTrigger_;
   private RepeatedFieldBuilderV3 inactivityTriggerBuilder_;
   private List inactivityTrigger_;
   private SingleFieldBuilderV3 metRecordingIntervalBuilder_;
   private Types$PbDuration metRecordingInterval_;
   private List metSamples_;
   private RepeatedFieldBuilderV3 sportInfoBuilder_;
   private List sportInfo_;
   private SingleFieldBuilderV3 startTimeBuilder_;
   private Types$PbLocalDateTime startTime_;
   private SingleFieldBuilderV3 stepsRecordingIntervalBuilder_;
   private Types$PbDuration stepsRecordingInterval_;
   private List stepsSamples_;

   private ActivitySamples$PbActivitySamples$Builder() {
      this.startTime_ = null;
      this.metRecordingInterval_ = null;
      this.stepsRecordingInterval_ = null;
      this.metSamples_ = Collections.emptyList();
      this.stepsSamples_ = Collections.emptyList();
      this.sportInfo_ = Collections.emptyList();
      this.activityInfo_ = Collections.emptyList();
      this.inactivityTrigger_ = Collections.emptyList();
      this.inactivityNonWearTrigger_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   private ActivitySamples$PbActivitySamples$Builder(BuilderParent var1) {
      super(var1);
      this.startTime_ = null;
      this.metRecordingInterval_ = null;
      this.stepsRecordingInterval_ = null;
      this.metSamples_ = Collections.emptyList();
      this.stepsSamples_ = Collections.emptyList();
      this.sportInfo_ = Collections.emptyList();
      this.activityInfo_ = Collections.emptyList();
      this.inactivityTrigger_ = Collections.emptyList();
      this.inactivityNonWearTrigger_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ActivitySamples$PbActivitySamples$Builder(BuilderParent var1, ActivitySamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ActivitySamples$PbActivitySamples$Builder(ActivitySamples$1 var1) {
      this();
   }

   private void ensureActivityInfoIsMutable() {
      if ((this.bitField0_ & 64) != 64) {
         this.activityInfo_ = new ArrayList(this.activityInfo_);
         this.bitField0_ |= 64;
      }

   }

   private void ensureInactivityNonWearTriggerIsMutable() {
      if ((this.bitField0_ & 256) != 256) {
         this.inactivityNonWearTrigger_ = new ArrayList(this.inactivityNonWearTrigger_);
         this.bitField0_ |= 256;
      }

   }

   private void ensureInactivityTriggerIsMutable() {
      if ((this.bitField0_ & 128) != 128) {
         this.inactivityTrigger_ = new ArrayList(this.inactivityTrigger_);
         this.bitField0_ |= 128;
      }

   }

   private void ensureMetSamplesIsMutable() {
      if ((this.bitField0_ & 8) != 8) {
         this.metSamples_ = new ArrayList(this.metSamples_);
         this.bitField0_ |= 8;
      }

   }

   private void ensureSportInfoIsMutable() {
      if ((this.bitField0_ & 32) != 32) {
         this.sportInfo_ = new ArrayList(this.sportInfo_);
         this.bitField0_ |= 32;
      }

   }

   private void ensureStepsSamplesIsMutable() {
      if ((this.bitField0_ & 16) != 16) {
         this.stepsSamples_ = new ArrayList(this.stepsSamples_);
         this.bitField0_ |= 16;
      }

   }

   private RepeatedFieldBuilderV3 getActivityInfoFieldBuilder() {
      if (this.activityInfoBuilder_ == null) {
         List var1 = this.activityInfo_;
         boolean var2;
         if ((this.bitField0_ & 64) == 64) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.activityInfoBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.activityInfo_ = null;
      }

      return this.activityInfoBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return ActivitySamples.i();
   }

   private RepeatedFieldBuilderV3 getInactivityNonWearTriggerFieldBuilder() {
      if (this.inactivityNonWearTriggerBuilder_ == null) {
         List var1 = this.inactivityNonWearTrigger_;
         boolean var2;
         if ((this.bitField0_ & 256) == 256) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.inactivityNonWearTriggerBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.inactivityNonWearTrigger_ = null;
      }

      return this.inactivityNonWearTriggerBuilder_;
   }

   private RepeatedFieldBuilderV3 getInactivityTriggerFieldBuilder() {
      if (this.inactivityTriggerBuilder_ == null) {
         List var1 = this.inactivityTrigger_;
         boolean var2;
         if ((this.bitField0_ & 128) == 128) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.inactivityTriggerBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.inactivityTrigger_ = null;
      }

      return this.inactivityTriggerBuilder_;
   }

   private SingleFieldBuilderV3 getMetRecordingIntervalFieldBuilder() {
      if (this.metRecordingIntervalBuilder_ == null) {
         this.metRecordingIntervalBuilder_ = new SingleFieldBuilderV3(this.getMetRecordingInterval(), this.getParentForChildren(), this.isClean());
         this.metRecordingInterval_ = null;
      }

      return this.metRecordingIntervalBuilder_;
   }

   private RepeatedFieldBuilderV3 getSportInfoFieldBuilder() {
      if (this.sportInfoBuilder_ == null) {
         List var1 = this.sportInfo_;
         boolean var2;
         if ((this.bitField0_ & 32) == 32) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.sportInfoBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.sportInfo_ = null;
      }

      return this.sportInfoBuilder_;
   }

   private SingleFieldBuilderV3 getStartTimeFieldBuilder() {
      if (this.startTimeBuilder_ == null) {
         this.startTimeBuilder_ = new SingleFieldBuilderV3(this.getStartTime(), this.getParentForChildren(), this.isClean());
         this.startTime_ = null;
      }

      return this.startTimeBuilder_;
   }

   private SingleFieldBuilderV3 getStepsRecordingIntervalFieldBuilder() {
      if (this.stepsRecordingIntervalBuilder_ == null) {
         this.stepsRecordingIntervalBuilder_ = new SingleFieldBuilderV3(this.getStepsRecordingInterval(), this.getParentForChildren(), this.isClean());
         this.stepsRecordingInterval_ = null;
      }

      return this.stepsRecordingIntervalBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (ActivitySamples$PbActivitySamples.b()) {
         this.getStartTimeFieldBuilder();
         this.getMetRecordingIntervalFieldBuilder();
         this.getStepsRecordingIntervalFieldBuilder();
         this.getSportInfoFieldBuilder();
         this.getActivityInfoFieldBuilder();
         this.getInactivityTriggerFieldBuilder();
         this.getInactivityNonWearTriggerFieldBuilder();
      }

   }

   public ActivitySamples$PbActivitySamples$Builder addActivityInfo(int var1, ActivitySamples$PbActivityInfo$Builder var2) {
      if (this.activityInfoBuilder_ == null) {
         this.ensureActivityInfoIsMutable();
         this.activityInfo_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.activityInfoBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder addActivityInfo(int var1, ActivitySamples$PbActivityInfo var2) {
      if (this.activityInfoBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureActivityInfoIsMutable();
         this.activityInfo_.add(var1, var2);
         this.onChanged();
      } else {
         this.activityInfoBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder addActivityInfo(ActivitySamples$PbActivityInfo$Builder var1) {
      if (this.activityInfoBuilder_ == null) {
         this.ensureActivityInfoIsMutable();
         this.activityInfo_.add(var1.build());
         this.onChanged();
      } else {
         this.activityInfoBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder addActivityInfo(ActivitySamples$PbActivityInfo var1) {
      if (this.activityInfoBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureActivityInfoIsMutable();
         this.activityInfo_.add(var1);
         this.onChanged();
      } else {
         this.activityInfoBuilder_.addMessage(var1);
      }

      return this;
   }

   public ActivitySamples$PbActivityInfo$Builder addActivityInfoBuilder() {
      return (ActivitySamples$PbActivityInfo$Builder)this.getActivityInfoFieldBuilder().addBuilder(ActivitySamples$PbActivityInfo.getDefaultInstance());
   }

   public ActivitySamples$PbActivityInfo$Builder addActivityInfoBuilder(int var1) {
      return (ActivitySamples$PbActivityInfo$Builder)this.getActivityInfoFieldBuilder().addBuilder(var1, ActivitySamples$PbActivityInfo.getDefaultInstance());
   }

   public ActivitySamples$PbActivitySamples$Builder addAllActivityInfo(Iterable var1) {
      if (this.activityInfoBuilder_ == null) {
         this.ensureActivityInfoIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.activityInfo_);
         this.onChanged();
      } else {
         this.activityInfoBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder addAllInactivityNonWearTrigger(Iterable var1) {
      if (this.inactivityNonWearTriggerBuilder_ == null) {
         this.ensureInactivityNonWearTriggerIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.inactivityNonWearTrigger_);
         this.onChanged();
      } else {
         this.inactivityNonWearTriggerBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder addAllInactivityTrigger(Iterable var1) {
      if (this.inactivityTriggerBuilder_ == null) {
         this.ensureInactivityTriggerIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.inactivityTrigger_);
         this.onChanged();
      } else {
         this.inactivityTriggerBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder addAllMetSamples(Iterable var1) {
      this.ensureMetSamplesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.metSamples_);
      this.onChanged();
      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder addAllSportInfo(Iterable var1) {
      if (this.sportInfoBuilder_ == null) {
         this.ensureSportInfoIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.sportInfo_);
         this.onChanged();
      } else {
         this.sportInfoBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder addAllStepsSamples(Iterable var1) {
      this.ensureStepsSamplesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.stepsSamples_);
      this.onChanged();
      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder addInactivityNonWearTrigger(int var1, ActivitySamples$PbInActivityNonWearTriggerInfo$Builder var2) {
      if (this.inactivityNonWearTriggerBuilder_ == null) {
         this.ensureInactivityNonWearTriggerIsMutable();
         this.inactivityNonWearTrigger_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.inactivityNonWearTriggerBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder addInactivityNonWearTrigger(int var1, ActivitySamples$PbInActivityNonWearTriggerInfo var2) {
      if (this.inactivityNonWearTriggerBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureInactivityNonWearTriggerIsMutable();
         this.inactivityNonWearTrigger_.add(var1, var2);
         this.onChanged();
      } else {
         this.inactivityNonWearTriggerBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder addInactivityNonWearTrigger(ActivitySamples$PbInActivityNonWearTriggerInfo$Builder var1) {
      if (this.inactivityNonWearTriggerBuilder_ == null) {
         this.ensureInactivityNonWearTriggerIsMutable();
         this.inactivityNonWearTrigger_.add(var1.build());
         this.onChanged();
      } else {
         this.inactivityNonWearTriggerBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder addInactivityNonWearTrigger(ActivitySamples$PbInActivityNonWearTriggerInfo var1) {
      if (this.inactivityNonWearTriggerBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureInactivityNonWearTriggerIsMutable();
         this.inactivityNonWearTrigger_.add(var1);
         this.onChanged();
      } else {
         this.inactivityNonWearTriggerBuilder_.addMessage(var1);
      }

      return this;
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo$Builder addInactivityNonWearTriggerBuilder() {
      return (ActivitySamples$PbInActivityNonWearTriggerInfo$Builder)this.getInactivityNonWearTriggerFieldBuilder().addBuilder(ActivitySamples$PbInActivityNonWearTriggerInfo.getDefaultInstance());
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo$Builder addInactivityNonWearTriggerBuilder(int var1) {
      return (ActivitySamples$PbInActivityNonWearTriggerInfo$Builder)this.getInactivityNonWearTriggerFieldBuilder().addBuilder(var1, ActivitySamples$PbInActivityNonWearTriggerInfo.getDefaultInstance());
   }

   public ActivitySamples$PbActivitySamples$Builder addInactivityTrigger(int var1, ActivitySamples$PbInActivityTriggerInfo$Builder var2) {
      if (this.inactivityTriggerBuilder_ == null) {
         this.ensureInactivityTriggerIsMutable();
         this.inactivityTrigger_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.inactivityTriggerBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder addInactivityTrigger(int var1, ActivitySamples$PbInActivityTriggerInfo var2) {
      if (this.inactivityTriggerBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureInactivityTriggerIsMutable();
         this.inactivityTrigger_.add(var1, var2);
         this.onChanged();
      } else {
         this.inactivityTriggerBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder addInactivityTrigger(ActivitySamples$PbInActivityTriggerInfo$Builder var1) {
      if (this.inactivityTriggerBuilder_ == null) {
         this.ensureInactivityTriggerIsMutable();
         this.inactivityTrigger_.add(var1.build());
         this.onChanged();
      } else {
         this.inactivityTriggerBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder addInactivityTrigger(ActivitySamples$PbInActivityTriggerInfo var1) {
      if (this.inactivityTriggerBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureInactivityTriggerIsMutable();
         this.inactivityTrigger_.add(var1);
         this.onChanged();
      } else {
         this.inactivityTriggerBuilder_.addMessage(var1);
      }

      return this;
   }

   public ActivitySamples$PbInActivityTriggerInfo$Builder addInactivityTriggerBuilder() {
      return (ActivitySamples$PbInActivityTriggerInfo$Builder)this.getInactivityTriggerFieldBuilder().addBuilder(ActivitySamples$PbInActivityTriggerInfo.getDefaultInstance());
   }

   public ActivitySamples$PbInActivityTriggerInfo$Builder addInactivityTriggerBuilder(int var1) {
      return (ActivitySamples$PbInActivityTriggerInfo$Builder)this.getInactivityTriggerFieldBuilder().addBuilder(var1, ActivitySamples$PbInActivityTriggerInfo.getDefaultInstance());
   }

   public ActivitySamples$PbActivitySamples$Builder addMetSamples(float var1) {
      this.ensureMetSamplesIsMutable();
      this.metSamples_.add(var1);
      this.onChanged();
      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ActivitySamples$PbActivitySamples$Builder)super.addRepeatedField(var1, var2);
   }

   public ActivitySamples$PbActivitySamples$Builder addSportInfo(int var1, ActivitySamples$PbSportInfo$Builder var2) {
      if (this.sportInfoBuilder_ == null) {
         this.ensureSportInfoIsMutable();
         this.sportInfo_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.sportInfoBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder addSportInfo(int var1, ActivitySamples$PbSportInfo var2) {
      if (this.sportInfoBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureSportInfoIsMutable();
         this.sportInfo_.add(var1, var2);
         this.onChanged();
      } else {
         this.sportInfoBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder addSportInfo(ActivitySamples$PbSportInfo$Builder var1) {
      if (this.sportInfoBuilder_ == null) {
         this.ensureSportInfoIsMutable();
         this.sportInfo_.add(var1.build());
         this.onChanged();
      } else {
         this.sportInfoBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder addSportInfo(ActivitySamples$PbSportInfo var1) {
      if (this.sportInfoBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureSportInfoIsMutable();
         this.sportInfo_.add(var1);
         this.onChanged();
      } else {
         this.sportInfoBuilder_.addMessage(var1);
      }

      return this;
   }

   public ActivitySamples$PbSportInfo$Builder addSportInfoBuilder() {
      return (ActivitySamples$PbSportInfo$Builder)this.getSportInfoFieldBuilder().addBuilder(ActivitySamples$PbSportInfo.getDefaultInstance());
   }

   public ActivitySamples$PbSportInfo$Builder addSportInfoBuilder(int var1) {
      return (ActivitySamples$PbSportInfo$Builder)this.getSportInfoFieldBuilder().addBuilder(var1, ActivitySamples$PbSportInfo.getDefaultInstance());
   }

   public ActivitySamples$PbActivitySamples$Builder addStepsSamples(int var1) {
      this.ensureStepsSamplesIsMutable();
      this.stepsSamples_.add(var1);
      this.onChanged();
      return this;
   }

   public ActivitySamples$PbActivitySamples build() {
      ActivitySamples$PbActivitySamples var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ActivitySamples$PbActivitySamples buildPartial() {
      ActivitySamples$PbActivitySamples var1 = new ActivitySamples$PbActivitySamples(this, (ActivitySamples$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.startTimeBuilder_ == null) {
         ActivitySamples$PbActivitySamples.a(var1, this.startTime_);
      } else {
         ActivitySamples$PbActivitySamples.a(var1, (Types$PbLocalDateTime)this.startTimeBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.metRecordingIntervalBuilder_ == null) {
         ActivitySamples$PbActivitySamples.a(var1, this.metRecordingInterval_);
      } else {
         ActivitySamples$PbActivitySamples.a(var1, (Types$PbDuration)this.metRecordingIntervalBuilder_.build());
      }

      int var5 = var4;
      if ((var2 & 4) == 4) {
         var5 = var4 | 4;
      }

      if (this.stepsRecordingIntervalBuilder_ == null) {
         ActivitySamples$PbActivitySamples.b(var1, this.stepsRecordingInterval_);
      } else {
         ActivitySamples$PbActivitySamples.b(var1, (Types$PbDuration)this.stepsRecordingIntervalBuilder_.build());
      }

      if ((this.bitField0_ & 8) == 8) {
         this.metSamples_ = Collections.unmodifiableList(this.metSamples_);
         this.bitField0_ &= -9;
      }

      ActivitySamples$PbActivitySamples.a(var1, this.metSamples_);
      if ((this.bitField0_ & 16) == 16) {
         this.stepsSamples_ = Collections.unmodifiableList(this.stepsSamples_);
         this.bitField0_ &= -17;
      }

      ActivitySamples$PbActivitySamples.b(var1, this.stepsSamples_);
      if (this.sportInfoBuilder_ == null) {
         if ((this.bitField0_ & 32) == 32) {
            this.sportInfo_ = Collections.unmodifiableList(this.sportInfo_);
            this.bitField0_ &= -33;
         }

         ActivitySamples$PbActivitySamples.c(var1, this.sportInfo_);
      } else {
         ActivitySamples$PbActivitySamples.c(var1, this.sportInfoBuilder_.build());
      }

      if (this.activityInfoBuilder_ == null) {
         if ((this.bitField0_ & 64) == 64) {
            this.activityInfo_ = Collections.unmodifiableList(this.activityInfo_);
            this.bitField0_ &= -65;
         }

         ActivitySamples$PbActivitySamples.d(var1, this.activityInfo_);
      } else {
         ActivitySamples$PbActivitySamples.d(var1, this.activityInfoBuilder_.build());
      }

      if (this.inactivityTriggerBuilder_ == null) {
         if ((this.bitField0_ & 128) == 128) {
            this.inactivityTrigger_ = Collections.unmodifiableList(this.inactivityTrigger_);
            this.bitField0_ &= -129;
         }

         ActivitySamples$PbActivitySamples.e(var1, this.inactivityTrigger_);
      } else {
         ActivitySamples$PbActivitySamples.e(var1, this.inactivityTriggerBuilder_.build());
      }

      if (this.inactivityNonWearTriggerBuilder_ == null) {
         if ((this.bitField0_ & 256) == 256) {
            this.inactivityNonWearTrigger_ = Collections.unmodifiableList(this.inactivityNonWearTrigger_);
            this.bitField0_ &= -257;
         }

         ActivitySamples$PbActivitySamples.f(var1, this.inactivityNonWearTrigger_);
      } else {
         ActivitySamples$PbActivitySamples.f(var1, this.inactivityNonWearTriggerBuilder_.build());
      }

      ActivitySamples$PbActivitySamples.a(var1, var5);
      this.onBuilt();
      return var1;
   }

   public ActivitySamples$PbActivitySamples$Builder clear() {
      super.clear();
      if (this.startTimeBuilder_ == null) {
         this.startTime_ = null;
      } else {
         this.startTimeBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.metRecordingIntervalBuilder_ == null) {
         this.metRecordingInterval_ = null;
      } else {
         this.metRecordingIntervalBuilder_.clear();
      }

      this.bitField0_ &= -3;
      if (this.stepsRecordingIntervalBuilder_ == null) {
         this.stepsRecordingInterval_ = null;
      } else {
         this.stepsRecordingIntervalBuilder_.clear();
      }

      this.bitField0_ &= -5;
      this.metSamples_ = Collections.emptyList();
      this.bitField0_ &= -9;
      this.stepsSamples_ = Collections.emptyList();
      this.bitField0_ &= -17;
      if (this.sportInfoBuilder_ == null) {
         this.sportInfo_ = Collections.emptyList();
         this.bitField0_ &= -33;
      } else {
         this.sportInfoBuilder_.clear();
      }

      if (this.activityInfoBuilder_ == null) {
         this.activityInfo_ = Collections.emptyList();
         this.bitField0_ &= -65;
      } else {
         this.activityInfoBuilder_.clear();
      }

      if (this.inactivityTriggerBuilder_ == null) {
         this.inactivityTrigger_ = Collections.emptyList();
         this.bitField0_ &= -129;
      } else {
         this.inactivityTriggerBuilder_.clear();
      }

      if (this.inactivityNonWearTriggerBuilder_ == null) {
         this.inactivityNonWearTrigger_ = Collections.emptyList();
         this.bitField0_ &= -257;
      } else {
         this.inactivityNonWearTriggerBuilder_.clear();
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder clearActivityInfo() {
      if (this.activityInfoBuilder_ == null) {
         this.activityInfo_ = Collections.emptyList();
         this.bitField0_ &= -65;
         this.onChanged();
      } else {
         this.activityInfoBuilder_.clear();
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder clearField(FieldDescriptor var1) {
      return (ActivitySamples$PbActivitySamples$Builder)super.clearField(var1);
   }

   public ActivitySamples$PbActivitySamples$Builder clearInactivityNonWearTrigger() {
      if (this.inactivityNonWearTriggerBuilder_ == null) {
         this.inactivityNonWearTrigger_ = Collections.emptyList();
         this.bitField0_ &= -257;
         this.onChanged();
      } else {
         this.inactivityNonWearTriggerBuilder_.clear();
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder clearInactivityTrigger() {
      if (this.inactivityTriggerBuilder_ == null) {
         this.inactivityTrigger_ = Collections.emptyList();
         this.bitField0_ &= -129;
         this.onChanged();
      } else {
         this.inactivityTriggerBuilder_.clear();
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder clearMetRecordingInterval() {
      if (this.metRecordingIntervalBuilder_ == null) {
         this.metRecordingInterval_ = null;
         this.onChanged();
      } else {
         this.metRecordingIntervalBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder clearMetSamples() {
      this.metSamples_ = Collections.emptyList();
      this.bitField0_ &= -9;
      this.onChanged();
      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder clearOneof(OneofDescriptor var1) {
      return (ActivitySamples$PbActivitySamples$Builder)super.clearOneof(var1);
   }

   public ActivitySamples$PbActivitySamples$Builder clearSportInfo() {
      if (this.sportInfoBuilder_ == null) {
         this.sportInfo_ = Collections.emptyList();
         this.bitField0_ &= -33;
         this.onChanged();
      } else {
         this.sportInfoBuilder_.clear();
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder clearStartTime() {
      if (this.startTimeBuilder_ == null) {
         this.startTime_ = null;
         this.onChanged();
      } else {
         this.startTimeBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder clearStepsRecordingInterval() {
      if (this.stepsRecordingIntervalBuilder_ == null) {
         this.stepsRecordingInterval_ = null;
         this.onChanged();
      } else {
         this.stepsRecordingIntervalBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder clearStepsSamples() {
      this.stepsSamples_ = Collections.emptyList();
      this.bitField0_ &= -17;
      this.onChanged();
      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder clone() {
      return (ActivitySamples$PbActivitySamples$Builder)super.clone();
   }

   public ActivitySamples$PbActivityInfo getActivityInfo(int var1) {
      ActivitySamples$PbActivityInfo var2;
      if (this.activityInfoBuilder_ == null) {
         var2 = (ActivitySamples$PbActivityInfo)this.activityInfo_.get(var1);
      } else {
         var2 = (ActivitySamples$PbActivityInfo)this.activityInfoBuilder_.getMessage(var1);
      }

      return var2;
   }

   public ActivitySamples$PbActivityInfo$Builder getActivityInfoBuilder(int var1) {
      return (ActivitySamples$PbActivityInfo$Builder)this.getActivityInfoFieldBuilder().getBuilder(var1);
   }

   public List getActivityInfoBuilderList() {
      return this.getActivityInfoFieldBuilder().getBuilderList();
   }

   public int getActivityInfoCount() {
      int var1;
      if (this.activityInfoBuilder_ == null) {
         var1 = this.activityInfo_.size();
      } else {
         var1 = this.activityInfoBuilder_.getCount();
      }

      return var1;
   }

   public List getActivityInfoList() {
      List var1;
      if (this.activityInfoBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.activityInfo_);
      } else {
         var1 = this.activityInfoBuilder_.getMessageList();
      }

      return var1;
   }

   public ActivitySamples$PbActivityInfoOrBuilder getActivityInfoOrBuilder(int var1) {
      ActivitySamples$PbActivityInfoOrBuilder var2;
      if (this.activityInfoBuilder_ == null) {
         var2 = (ActivitySamples$PbActivityInfoOrBuilder)this.activityInfo_.get(var1);
      } else {
         var2 = (ActivitySamples$PbActivityInfoOrBuilder)this.activityInfoBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getActivityInfoOrBuilderList() {
      List var1;
      if (this.activityInfoBuilder_ != null) {
         var1 = this.activityInfoBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.activityInfo_);
      }

      return var1;
   }

   public ActivitySamples$PbActivitySamples getDefaultInstanceForType() {
      return ActivitySamples$PbActivitySamples.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ActivitySamples.i();
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo getInactivityNonWearTrigger(int var1) {
      ActivitySamples$PbInActivityNonWearTriggerInfo var2;
      if (this.inactivityNonWearTriggerBuilder_ == null) {
         var2 = (ActivitySamples$PbInActivityNonWearTriggerInfo)this.inactivityNonWearTrigger_.get(var1);
      } else {
         var2 = (ActivitySamples$PbInActivityNonWearTriggerInfo)this.inactivityNonWearTriggerBuilder_.getMessage(var1);
      }

      return var2;
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo$Builder getInactivityNonWearTriggerBuilder(int var1) {
      return (ActivitySamples$PbInActivityNonWearTriggerInfo$Builder)this.getInactivityNonWearTriggerFieldBuilder().getBuilder(var1);
   }

   public List getInactivityNonWearTriggerBuilderList() {
      return this.getInactivityNonWearTriggerFieldBuilder().getBuilderList();
   }

   public int getInactivityNonWearTriggerCount() {
      int var1;
      if (this.inactivityNonWearTriggerBuilder_ == null) {
         var1 = this.inactivityNonWearTrigger_.size();
      } else {
         var1 = this.inactivityNonWearTriggerBuilder_.getCount();
      }

      return var1;
   }

   public List getInactivityNonWearTriggerList() {
      List var1;
      if (this.inactivityNonWearTriggerBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.inactivityNonWearTrigger_);
      } else {
         var1 = this.inactivityNonWearTriggerBuilder_.getMessageList();
      }

      return var1;
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfoOrBuilder getInactivityNonWearTriggerOrBuilder(int var1) {
      ActivitySamples$PbInActivityNonWearTriggerInfoOrBuilder var2;
      if (this.inactivityNonWearTriggerBuilder_ == null) {
         var2 = (ActivitySamples$PbInActivityNonWearTriggerInfoOrBuilder)this.inactivityNonWearTrigger_.get(var1);
      } else {
         var2 = (ActivitySamples$PbInActivityNonWearTriggerInfoOrBuilder)this.inactivityNonWearTriggerBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getInactivityNonWearTriggerOrBuilderList() {
      List var1;
      if (this.inactivityNonWearTriggerBuilder_ != null) {
         var1 = this.inactivityNonWearTriggerBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.inactivityNonWearTrigger_);
      }

      return var1;
   }

   public ActivitySamples$PbInActivityTriggerInfo getInactivityTrigger(int var1) {
      ActivitySamples$PbInActivityTriggerInfo var2;
      if (this.inactivityTriggerBuilder_ == null) {
         var2 = (ActivitySamples$PbInActivityTriggerInfo)this.inactivityTrigger_.get(var1);
      } else {
         var2 = (ActivitySamples$PbInActivityTriggerInfo)this.inactivityTriggerBuilder_.getMessage(var1);
      }

      return var2;
   }

   public ActivitySamples$PbInActivityTriggerInfo$Builder getInactivityTriggerBuilder(int var1) {
      return (ActivitySamples$PbInActivityTriggerInfo$Builder)this.getInactivityTriggerFieldBuilder().getBuilder(var1);
   }

   public List getInactivityTriggerBuilderList() {
      return this.getInactivityTriggerFieldBuilder().getBuilderList();
   }

   public int getInactivityTriggerCount() {
      int var1;
      if (this.inactivityTriggerBuilder_ == null) {
         var1 = this.inactivityTrigger_.size();
      } else {
         var1 = this.inactivityTriggerBuilder_.getCount();
      }

      return var1;
   }

   public List getInactivityTriggerList() {
      List var1;
      if (this.inactivityTriggerBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.inactivityTrigger_);
      } else {
         var1 = this.inactivityTriggerBuilder_.getMessageList();
      }

      return var1;
   }

   public ActivitySamples$PbInActivityTriggerInfoOrBuilder getInactivityTriggerOrBuilder(int var1) {
      ActivitySamples$PbInActivityTriggerInfoOrBuilder var2;
      if (this.inactivityTriggerBuilder_ == null) {
         var2 = (ActivitySamples$PbInActivityTriggerInfoOrBuilder)this.inactivityTrigger_.get(var1);
      } else {
         var2 = (ActivitySamples$PbInActivityTriggerInfoOrBuilder)this.inactivityTriggerBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getInactivityTriggerOrBuilderList() {
      List var1;
      if (this.inactivityTriggerBuilder_ != null) {
         var1 = this.inactivityTriggerBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.inactivityTrigger_);
      }

      return var1;
   }

   public Types$PbDuration getMetRecordingInterval() {
      Types$PbDuration var1;
      if (this.metRecordingIntervalBuilder_ == null) {
         if (this.metRecordingInterval_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.metRecordingInterval_;
         }
      } else {
         var1 = (Types$PbDuration)this.metRecordingIntervalBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getMetRecordingIntervalBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getMetRecordingIntervalFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getMetRecordingIntervalOrBuilder() {
      Object var1;
      if (this.metRecordingIntervalBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.metRecordingIntervalBuilder_.getMessageOrBuilder();
      } else if (this.metRecordingInterval_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.metRecordingInterval_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public float getMetSamples(int var1) {
      return (Float)this.metSamples_.get(var1);
   }

   public int getMetSamplesCount() {
      return this.metSamples_.size();
   }

   public List getMetSamplesList() {
      return Collections.unmodifiableList(this.metSamples_);
   }

   public ActivitySamples$PbSportInfo getSportInfo(int var1) {
      ActivitySamples$PbSportInfo var2;
      if (this.sportInfoBuilder_ == null) {
         var2 = (ActivitySamples$PbSportInfo)this.sportInfo_.get(var1);
      } else {
         var2 = (ActivitySamples$PbSportInfo)this.sportInfoBuilder_.getMessage(var1);
      }

      return var2;
   }

   public ActivitySamples$PbSportInfo$Builder getSportInfoBuilder(int var1) {
      return (ActivitySamples$PbSportInfo$Builder)this.getSportInfoFieldBuilder().getBuilder(var1);
   }

   public List getSportInfoBuilderList() {
      return this.getSportInfoFieldBuilder().getBuilderList();
   }

   public int getSportInfoCount() {
      int var1;
      if (this.sportInfoBuilder_ == null) {
         var1 = this.sportInfo_.size();
      } else {
         var1 = this.sportInfoBuilder_.getCount();
      }

      return var1;
   }

   public List getSportInfoList() {
      List var1;
      if (this.sportInfoBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.sportInfo_);
      } else {
         var1 = this.sportInfoBuilder_.getMessageList();
      }

      return var1;
   }

   public ActivitySamples$PbSportInfoOrBuilder getSportInfoOrBuilder(int var1) {
      ActivitySamples$PbSportInfoOrBuilder var2;
      if (this.sportInfoBuilder_ == null) {
         var2 = (ActivitySamples$PbSportInfoOrBuilder)this.sportInfo_.get(var1);
      } else {
         var2 = (ActivitySamples$PbSportInfoOrBuilder)this.sportInfoBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getSportInfoOrBuilderList() {
      List var1;
      if (this.sportInfoBuilder_ != null) {
         var1 = this.sportInfoBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.sportInfo_);
      }

      return var1;
   }

   public Types$PbLocalDateTime getStartTime() {
      Types$PbLocalDateTime var1;
      if (this.startTimeBuilder_ == null) {
         if (this.startTime_ == null) {
            var1 = Types$PbLocalDateTime.getDefaultInstance();
         } else {
            var1 = this.startTime_;
         }
      } else {
         var1 = (Types$PbLocalDateTime)this.startTimeBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbLocalDateTime$Builder getStartTimeBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Types$PbLocalDateTime$Builder)this.getStartTimeFieldBuilder().getBuilder();
   }

   public Types$PbLocalDateTimeOrBuilder getStartTimeOrBuilder() {
      Object var1;
      if (this.startTimeBuilder_ != null) {
         var1 = (Types$PbLocalDateTimeOrBuilder)this.startTimeBuilder_.getMessageOrBuilder();
      } else if (this.startTime_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.startTime_;
      }

      return (Types$PbLocalDateTimeOrBuilder)var1;
   }

   public Types$PbDuration getStepsRecordingInterval() {
      Types$PbDuration var1;
      if (this.stepsRecordingIntervalBuilder_ == null) {
         if (this.stepsRecordingInterval_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.stepsRecordingInterval_;
         }
      } else {
         var1 = (Types$PbDuration)this.stepsRecordingIntervalBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getStepsRecordingIntervalBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getStepsRecordingIntervalFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getStepsRecordingIntervalOrBuilder() {
      Object var1;
      if (this.stepsRecordingIntervalBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.stepsRecordingIntervalBuilder_.getMessageOrBuilder();
      } else if (this.stepsRecordingInterval_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.stepsRecordingInterval_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public int getStepsSamples(int var1) {
      return (Integer)this.stepsSamples_.get(var1);
   }

   public int getStepsSamplesCount() {
      return this.stepsSamples_.size();
   }

   public List getStepsSamplesList() {
      return Collections.unmodifiableList(this.stepsSamples_);
   }

   public boolean hasMetRecordingInterval() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStartTime() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStepsRecordingInterval() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ActivitySamples.j().ensureFieldAccessorsInitialized(ActivitySamples$PbActivitySamples.class, ActivitySamples$PbActivitySamples$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasStartTime()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasMetRecordingInterval()) {
            var2 = var1;
            if (this.hasStepsRecordingInterval()) {
               var2 = var1;
               if (this.getStartTime().isInitialized()) {
                  int var3 = 0;

                  while(true) {
                     if (var3 >= this.getSportInfoCount()) {
                        for(var3 = 0; var3 < this.getActivityInfoCount(); ++var3) {
                           var2 = var1;
                           if (!this.getActivityInfo(var3).isInitialized()) {
                              return var2;
                           }
                        }

                        for(var3 = 0; var3 < this.getInactivityTriggerCount(); ++var3) {
                           var2 = var1;
                           if (!this.getInactivityTrigger(var3).isInitialized()) {
                              return var2;
                           }
                        }

                        for(var3 = 0; var3 < this.getInactivityNonWearTriggerCount(); ++var3) {
                           var2 = var1;
                           if (!this.getInactivityNonWearTrigger(var3).isInitialized()) {
                              return var2;
                           }
                        }

                        var2 = true;
                        break;
                     }

                     var2 = var1;
                     if (!this.getSportInfo(var3).isInitialized()) {
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

   public ActivitySamples$PbActivitySamples$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ActivitySamples$PbActivitySamples var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (ActivitySamples$PbActivitySamples)ActivitySamples$PbActivitySamples.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (ActivitySamples$PbActivitySamples)var10.getUnfinishedMessage();
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

   public ActivitySamples$PbActivitySamples$Builder mergeFrom(Message var1) {
      ActivitySamples$PbActivitySamples$Builder var2;
      if (var1 instanceof ActivitySamples$PbActivitySamples) {
         var2 = this.mergeFrom((ActivitySamples$PbActivitySamples)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ActivitySamples$PbActivitySamples$Builder mergeFrom(ActivitySamples$PbActivitySamples var1) {
      Object var2 = null;
      if (var1 != ActivitySamples$PbActivitySamples.getDefaultInstance()) {
         if (var1.hasStartTime()) {
            this.mergeStartTime(var1.getStartTime());
         }

         if (var1.hasMetRecordingInterval()) {
            this.mergeMetRecordingInterval(var1.getMetRecordingInterval());
         }

         if (var1.hasStepsRecordingInterval()) {
            this.mergeStepsRecordingInterval(var1.getStepsRecordingInterval());
         }

         if (!ActivitySamples$PbActivitySamples.a(var1).isEmpty()) {
            if (this.metSamples_.isEmpty()) {
               this.metSamples_ = ActivitySamples$PbActivitySamples.a(var1);
               this.bitField0_ &= -9;
            } else {
               this.ensureMetSamplesIsMutable();
               this.metSamples_.addAll(ActivitySamples$PbActivitySamples.a(var1));
            }

            this.onChanged();
         }

         if (!ActivitySamples$PbActivitySamples.b(var1).isEmpty()) {
            if (this.stepsSamples_.isEmpty()) {
               this.stepsSamples_ = ActivitySamples$PbActivitySamples.b(var1);
               this.bitField0_ &= -17;
            } else {
               this.ensureStepsSamplesIsMutable();
               this.stepsSamples_.addAll(ActivitySamples$PbActivitySamples.b(var1));
            }

            this.onChanged();
         }

         RepeatedFieldBuilderV3 var3;
         if (this.sportInfoBuilder_ == null) {
            if (!ActivitySamples$PbActivitySamples.c(var1).isEmpty()) {
               if (this.sportInfo_.isEmpty()) {
                  this.sportInfo_ = ActivitySamples$PbActivitySamples.c(var1);
                  this.bitField0_ &= -33;
               } else {
                  this.ensureSportInfoIsMutable();
                  this.sportInfo_.addAll(ActivitySamples$PbActivitySamples.c(var1));
               }

               this.onChanged();
            }
         } else if (!ActivitySamples$PbActivitySamples.c(var1).isEmpty()) {
            if (this.sportInfoBuilder_.isEmpty()) {
               this.sportInfoBuilder_.dispose();
               this.sportInfoBuilder_ = null;
               this.sportInfo_ = ActivitySamples$PbActivitySamples.c(var1);
               this.bitField0_ &= -33;
               if (ActivitySamples$PbActivitySamples.c()) {
                  var3 = this.getSportInfoFieldBuilder();
               } else {
                  var3 = null;
               }

               this.sportInfoBuilder_ = var3;
            } else {
               this.sportInfoBuilder_.addAllMessages(ActivitySamples$PbActivitySamples.c(var1));
            }
         }

         if (this.activityInfoBuilder_ == null) {
            if (!ActivitySamples$PbActivitySamples.d(var1).isEmpty()) {
               if (this.activityInfo_.isEmpty()) {
                  this.activityInfo_ = ActivitySamples$PbActivitySamples.d(var1);
                  this.bitField0_ &= -65;
               } else {
                  this.ensureActivityInfoIsMutable();
                  this.activityInfo_.addAll(ActivitySamples$PbActivitySamples.d(var1));
               }

               this.onChanged();
            }
         } else if (!ActivitySamples$PbActivitySamples.d(var1).isEmpty()) {
            if (this.activityInfoBuilder_.isEmpty()) {
               this.activityInfoBuilder_.dispose();
               this.activityInfoBuilder_ = null;
               this.activityInfo_ = ActivitySamples$PbActivitySamples.d(var1);
               this.bitField0_ &= -65;
               if (ActivitySamples$PbActivitySamples.d()) {
                  var3 = this.getActivityInfoFieldBuilder();
               } else {
                  var3 = null;
               }

               this.activityInfoBuilder_ = var3;
            } else {
               this.activityInfoBuilder_.addAllMessages(ActivitySamples$PbActivitySamples.d(var1));
            }
         }

         if (this.inactivityTriggerBuilder_ == null) {
            if (!ActivitySamples$PbActivitySamples.e(var1).isEmpty()) {
               if (this.inactivityTrigger_.isEmpty()) {
                  this.inactivityTrigger_ = ActivitySamples$PbActivitySamples.e(var1);
                  this.bitField0_ &= -129;
               } else {
                  this.ensureInactivityTriggerIsMutable();
                  this.inactivityTrigger_.addAll(ActivitySamples$PbActivitySamples.e(var1));
               }

               this.onChanged();
            }
         } else if (!ActivitySamples$PbActivitySamples.e(var1).isEmpty()) {
            if (this.inactivityTriggerBuilder_.isEmpty()) {
               this.inactivityTriggerBuilder_.dispose();
               this.inactivityTriggerBuilder_ = null;
               this.inactivityTrigger_ = ActivitySamples$PbActivitySamples.e(var1);
               this.bitField0_ &= -129;
               if (ActivitySamples$PbActivitySamples.e()) {
                  var3 = this.getInactivityTriggerFieldBuilder();
               } else {
                  var3 = null;
               }

               this.inactivityTriggerBuilder_ = var3;
            } else {
               this.inactivityTriggerBuilder_.addAllMessages(ActivitySamples$PbActivitySamples.e(var1));
            }
         }

         if (this.inactivityNonWearTriggerBuilder_ == null) {
            if (!ActivitySamples$PbActivitySamples.f(var1).isEmpty()) {
               if (this.inactivityNonWearTrigger_.isEmpty()) {
                  this.inactivityNonWearTrigger_ = ActivitySamples$PbActivitySamples.f(var1);
                  this.bitField0_ &= -257;
               } else {
                  this.ensureInactivityNonWearTriggerIsMutable();
                  this.inactivityNonWearTrigger_.addAll(ActivitySamples$PbActivitySamples.f(var1));
               }

               this.onChanged();
            }
         } else if (!ActivitySamples$PbActivitySamples.f(var1).isEmpty()) {
            if (this.inactivityNonWearTriggerBuilder_.isEmpty()) {
               this.inactivityNonWearTriggerBuilder_.dispose();
               this.inactivityNonWearTriggerBuilder_ = null;
               this.inactivityNonWearTrigger_ = ActivitySamples$PbActivitySamples.f(var1);
               this.bitField0_ &= -257;
               var3 = (RepeatedFieldBuilderV3)var2;
               if (ActivitySamples$PbActivitySamples.f()) {
                  var3 = this.getInactivityNonWearTriggerFieldBuilder();
               }

               this.inactivityNonWearTriggerBuilder_ = var3;
            } else {
               this.inactivityNonWearTriggerBuilder_.addAllMessages(ActivitySamples$PbActivitySamples.f(var1));
            }
         }

         this.mergeUnknownFields(ActivitySamples$PbActivitySamples.g(var1));
         this.onChanged();
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder mergeMetRecordingInterval(Types$PbDuration var1) {
      if (this.metRecordingIntervalBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.metRecordingInterval_ != null && this.metRecordingInterval_ != Types$PbDuration.getDefaultInstance()) {
            this.metRecordingInterval_ = Types$PbDuration.newBuilder(this.metRecordingInterval_).mergeFrom(var1).buildPartial();
         } else {
            this.metRecordingInterval_ = var1;
         }

         this.onChanged();
      } else {
         this.metRecordingIntervalBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder mergeStartTime(Types$PbLocalDateTime var1) {
      if (this.startTimeBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.startTime_ != null && this.startTime_ != Types$PbLocalDateTime.getDefaultInstance()) {
            this.startTime_ = Types$PbLocalDateTime.newBuilder(this.startTime_).mergeFrom(var1).buildPartial();
         } else {
            this.startTime_ = var1;
         }

         this.onChanged();
      } else {
         this.startTimeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder mergeStepsRecordingInterval(Types$PbDuration var1) {
      if (this.stepsRecordingIntervalBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.stepsRecordingInterval_ != null && this.stepsRecordingInterval_ != Types$PbDuration.getDefaultInstance()) {
            this.stepsRecordingInterval_ = Types$PbDuration.newBuilder(this.stepsRecordingInterval_).mergeFrom(var1).buildPartial();
         } else {
            this.stepsRecordingInterval_ = var1;
         }

         this.onChanged();
      } else {
         this.stepsRecordingIntervalBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public final ActivitySamples$PbActivitySamples$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ActivitySamples$PbActivitySamples$Builder)super.mergeUnknownFields(var1);
   }

   public ActivitySamples$PbActivitySamples$Builder removeActivityInfo(int var1) {
      if (this.activityInfoBuilder_ == null) {
         this.ensureActivityInfoIsMutable();
         this.activityInfo_.remove(var1);
         this.onChanged();
      } else {
         this.activityInfoBuilder_.remove(var1);
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder removeInactivityNonWearTrigger(int var1) {
      if (this.inactivityNonWearTriggerBuilder_ == null) {
         this.ensureInactivityNonWearTriggerIsMutable();
         this.inactivityNonWearTrigger_.remove(var1);
         this.onChanged();
      } else {
         this.inactivityNonWearTriggerBuilder_.remove(var1);
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder removeInactivityTrigger(int var1) {
      if (this.inactivityTriggerBuilder_ == null) {
         this.ensureInactivityTriggerIsMutable();
         this.inactivityTrigger_.remove(var1);
         this.onChanged();
      } else {
         this.inactivityTriggerBuilder_.remove(var1);
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder removeSportInfo(int var1) {
      if (this.sportInfoBuilder_ == null) {
         this.ensureSportInfoIsMutable();
         this.sportInfo_.remove(var1);
         this.onChanged();
      } else {
         this.sportInfoBuilder_.remove(var1);
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder setActivityInfo(int var1, ActivitySamples$PbActivityInfo$Builder var2) {
      if (this.activityInfoBuilder_ == null) {
         this.ensureActivityInfoIsMutable();
         this.activityInfo_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.activityInfoBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder setActivityInfo(int var1, ActivitySamples$PbActivityInfo var2) {
      if (this.activityInfoBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureActivityInfoIsMutable();
         this.activityInfo_.set(var1, var2);
         this.onChanged();
      } else {
         this.activityInfoBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder setField(FieldDescriptor var1, Object var2) {
      return (ActivitySamples$PbActivitySamples$Builder)super.setField(var1, var2);
   }

   public ActivitySamples$PbActivitySamples$Builder setInactivityNonWearTrigger(int var1, ActivitySamples$PbInActivityNonWearTriggerInfo$Builder var2) {
      if (this.inactivityNonWearTriggerBuilder_ == null) {
         this.ensureInactivityNonWearTriggerIsMutable();
         this.inactivityNonWearTrigger_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.inactivityNonWearTriggerBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder setInactivityNonWearTrigger(int var1, ActivitySamples$PbInActivityNonWearTriggerInfo var2) {
      if (this.inactivityNonWearTriggerBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureInactivityNonWearTriggerIsMutable();
         this.inactivityNonWearTrigger_.set(var1, var2);
         this.onChanged();
      } else {
         this.inactivityNonWearTriggerBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder setInactivityTrigger(int var1, ActivitySamples$PbInActivityTriggerInfo$Builder var2) {
      if (this.inactivityTriggerBuilder_ == null) {
         this.ensureInactivityTriggerIsMutable();
         this.inactivityTrigger_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.inactivityTriggerBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder setInactivityTrigger(int var1, ActivitySamples$PbInActivityTriggerInfo var2) {
      if (this.inactivityTriggerBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureInactivityTriggerIsMutable();
         this.inactivityTrigger_.set(var1, var2);
         this.onChanged();
      } else {
         this.inactivityTriggerBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder setMetRecordingInterval(Types$PbDuration$Builder var1) {
      if (this.metRecordingIntervalBuilder_ == null) {
         this.metRecordingInterval_ = var1.build();
         this.onChanged();
      } else {
         this.metRecordingIntervalBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder setMetRecordingInterval(Types$PbDuration var1) {
      if (this.metRecordingIntervalBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.metRecordingInterval_ = var1;
         this.onChanged();
      } else {
         this.metRecordingIntervalBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder setMetSamples(int var1, float var2) {
      this.ensureMetSamplesIsMutable();
      this.metSamples_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ActivitySamples$PbActivitySamples$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public ActivitySamples$PbActivitySamples$Builder setSportInfo(int var1, ActivitySamples$PbSportInfo$Builder var2) {
      if (this.sportInfoBuilder_ == null) {
         this.ensureSportInfoIsMutable();
         this.sportInfo_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.sportInfoBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder setSportInfo(int var1, ActivitySamples$PbSportInfo var2) {
      if (this.sportInfoBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureSportInfoIsMutable();
         this.sportInfo_.set(var1, var2);
         this.onChanged();
      } else {
         this.sportInfoBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder setStartTime(Types$PbLocalDateTime$Builder var1) {
      if (this.startTimeBuilder_ == null) {
         this.startTime_ = var1.build();
         this.onChanged();
      } else {
         this.startTimeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder setStartTime(Types$PbLocalDateTime var1) {
      if (this.startTimeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.startTime_ = var1;
         this.onChanged();
      } else {
         this.startTimeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder setStepsRecordingInterval(Types$PbDuration$Builder var1) {
      if (this.stepsRecordingIntervalBuilder_ == null) {
         this.stepsRecordingInterval_ = var1.build();
         this.onChanged();
      } else {
         this.stepsRecordingIntervalBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder setStepsRecordingInterval(Types$PbDuration var1) {
      if (this.stepsRecordingIntervalBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.stepsRecordingInterval_ = var1;
         this.onChanged();
      } else {
         this.stepsRecordingIntervalBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public ActivitySamples$PbActivitySamples$Builder setStepsSamples(int var1, int var2) {
      this.ensureStepsSamplesIsMutable();
      this.stepsSamples_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public final ActivitySamples$PbActivitySamples$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ActivitySamples$PbActivitySamples$Builder)super.setUnknownFields(var1);
   }
}
