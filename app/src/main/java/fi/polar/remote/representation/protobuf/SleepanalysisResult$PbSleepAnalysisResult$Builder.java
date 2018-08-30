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

public final class SleepanalysisResult$PbSleepAnalysisResult$Builder extends Builder implements SleepanalysisResult$PbSleepAnalysisResultOrBuilder {
   private SingleFieldBuilderV3 alarmTimeBuilder_;
   private Types$PbLocalDateTime alarmTime_;
   private boolean batteryRanOut_;
   private int bitField0_;
   private SingleFieldBuilderV3 lastModifiedBuilder_;
   private Types$PbSystemDateTime lastModified_;
   private SingleFieldBuilderV3 recordingDeviceBuilder_;
   private Structures$PbDeviceId recordingDevice_;
   private int sleepEndOffsetSeconds_;
   private SingleFieldBuilderV3 sleepEndTimeBuilder_;
   private Types$PbLocalDateTime sleepEndTime_;
   private int sleepGoalMinutes_;
   private int sleepStartOffsetSeconds_;
   private SingleFieldBuilderV3 sleepStartTimeBuilder_;
   private Types$PbLocalDateTime sleepStartTime_;
   private RepeatedFieldBuilderV3 sleepwakePhasesBuilder_;
   private List sleepwakePhases_;
   private RepeatedFieldBuilderV3 snoozeTimeBuilder_;
   private List snoozeTime_;
   private int userSleepRating_;

   private SleepanalysisResult$PbSleepAnalysisResult$Builder() {
      this.sleepStartTime_ = null;
      this.sleepEndTime_ = null;
      this.lastModified_ = null;
      this.sleepwakePhases_ = Collections.emptyList();
      this.snoozeTime_ = Collections.emptyList();
      this.alarmTime_ = null;
      this.userSleepRating_ = 0;
      this.recordingDevice_ = null;
      this.maybeForceBuilderInitialization();
   }

   private SleepanalysisResult$PbSleepAnalysisResult$Builder(BuilderParent var1) {
      super(var1);
      this.sleepStartTime_ = null;
      this.sleepEndTime_ = null;
      this.lastModified_ = null;
      this.sleepwakePhases_ = Collections.emptyList();
      this.snoozeTime_ = Collections.emptyList();
      this.alarmTime_ = null;
      this.userSleepRating_ = 0;
      this.recordingDevice_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   SleepanalysisResult$PbSleepAnalysisResult$Builder(BuilderParent var1, SleepanalysisResult$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   SleepanalysisResult$PbSleepAnalysisResult$Builder(SleepanalysisResult$1 var1) {
      this();
   }

   private void ensureSleepwakePhasesIsMutable() {
      if ((this.bitField0_ & 16) != 16) {
         this.sleepwakePhases_ = new ArrayList(this.sleepwakePhases_);
         this.bitField0_ |= 16;
      }

   }

   private void ensureSnoozeTimeIsMutable() {
      if ((this.bitField0_ & 32) != 32) {
         this.snoozeTime_ = new ArrayList(this.snoozeTime_);
         this.bitField0_ |= 32;
      }

   }

   private SingleFieldBuilderV3 getAlarmTimeFieldBuilder() {
      if (this.alarmTimeBuilder_ == null) {
         this.alarmTimeBuilder_ = new SingleFieldBuilderV3(this.getAlarmTime(), this.getParentForChildren(), this.isClean());
         this.alarmTime_ = null;
      }

      return this.alarmTimeBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return SleepanalysisResult.c();
   }

   private SingleFieldBuilderV3 getLastModifiedFieldBuilder() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModifiedBuilder_ = new SingleFieldBuilderV3(this.getLastModified(), this.getParentForChildren(), this.isClean());
         this.lastModified_ = null;
      }

      return this.lastModifiedBuilder_;
   }

   private SingleFieldBuilderV3 getRecordingDeviceFieldBuilder() {
      if (this.recordingDeviceBuilder_ == null) {
         this.recordingDeviceBuilder_ = new SingleFieldBuilderV3(this.getRecordingDevice(), this.getParentForChildren(), this.isClean());
         this.recordingDevice_ = null;
      }

      return this.recordingDeviceBuilder_;
   }

   private SingleFieldBuilderV3 getSleepEndTimeFieldBuilder() {
      if (this.sleepEndTimeBuilder_ == null) {
         this.sleepEndTimeBuilder_ = new SingleFieldBuilderV3(this.getSleepEndTime(), this.getParentForChildren(), this.isClean());
         this.sleepEndTime_ = null;
      }

      return this.sleepEndTimeBuilder_;
   }

   private SingleFieldBuilderV3 getSleepStartTimeFieldBuilder() {
      if (this.sleepStartTimeBuilder_ == null) {
         this.sleepStartTimeBuilder_ = new SingleFieldBuilderV3(this.getSleepStartTime(), this.getParentForChildren(), this.isClean());
         this.sleepStartTime_ = null;
      }

      return this.sleepStartTimeBuilder_;
   }

   private RepeatedFieldBuilderV3 getSleepwakePhasesFieldBuilder() {
      if (this.sleepwakePhasesBuilder_ == null) {
         List var1 = this.sleepwakePhases_;
         boolean var2;
         if ((this.bitField0_ & 16) == 16) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.sleepwakePhasesBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.sleepwakePhases_ = null;
      }

      return this.sleepwakePhasesBuilder_;
   }

   private RepeatedFieldBuilderV3 getSnoozeTimeFieldBuilder() {
      if (this.snoozeTimeBuilder_ == null) {
         List var1 = this.snoozeTime_;
         boolean var2;
         if ((this.bitField0_ & 32) == 32) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.snoozeTimeBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.snoozeTime_ = null;
      }

      return this.snoozeTimeBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (SleepanalysisResult$PbSleepAnalysisResult.b()) {
         this.getSleepStartTimeFieldBuilder();
         this.getSleepEndTimeFieldBuilder();
         this.getLastModifiedFieldBuilder();
         this.getSleepwakePhasesFieldBuilder();
         this.getSnoozeTimeFieldBuilder();
         this.getAlarmTimeFieldBuilder();
         this.getRecordingDeviceFieldBuilder();
      }

   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder addAllSleepwakePhases(Iterable var1) {
      if (this.sleepwakePhasesBuilder_ == null) {
         this.ensureSleepwakePhasesIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.sleepwakePhases_);
         this.onChanged();
      } else {
         this.sleepwakePhasesBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder addAllSnoozeTime(Iterable var1) {
      if (this.snoozeTimeBuilder_ == null) {
         this.ensureSnoozeTimeIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.snoozeTime_);
         this.onChanged();
      } else {
         this.snoozeTimeBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (SleepanalysisResult$PbSleepAnalysisResult$Builder)super.addRepeatedField(var1, var2);
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder addSleepwakePhases(int var1, SleepanalysisResult$PbSleepWakePhase$Builder var2) {
      if (this.sleepwakePhasesBuilder_ == null) {
         this.ensureSleepwakePhasesIsMutable();
         this.sleepwakePhases_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.sleepwakePhasesBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder addSleepwakePhases(int var1, SleepanalysisResult$PbSleepWakePhase var2) {
      if (this.sleepwakePhasesBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureSleepwakePhasesIsMutable();
         this.sleepwakePhases_.add(var1, var2);
         this.onChanged();
      } else {
         this.sleepwakePhasesBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder addSleepwakePhases(SleepanalysisResult$PbSleepWakePhase$Builder var1) {
      if (this.sleepwakePhasesBuilder_ == null) {
         this.ensureSleepwakePhasesIsMutable();
         this.sleepwakePhases_.add(var1.build());
         this.onChanged();
      } else {
         this.sleepwakePhasesBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder addSleepwakePhases(SleepanalysisResult$PbSleepWakePhase var1) {
      if (this.sleepwakePhasesBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureSleepwakePhasesIsMutable();
         this.sleepwakePhases_.add(var1);
         this.onChanged();
      } else {
         this.sleepwakePhasesBuilder_.addMessage(var1);
      }

      return this;
   }

   public SleepanalysisResult$PbSleepWakePhase$Builder addSleepwakePhasesBuilder() {
      return (SleepanalysisResult$PbSleepWakePhase$Builder)this.getSleepwakePhasesFieldBuilder().addBuilder(SleepanalysisResult$PbSleepWakePhase.getDefaultInstance());
   }

   public SleepanalysisResult$PbSleepWakePhase$Builder addSleepwakePhasesBuilder(int var1) {
      return (SleepanalysisResult$PbSleepWakePhase$Builder)this.getSleepwakePhasesFieldBuilder().addBuilder(var1, SleepanalysisResult$PbSleepWakePhase.getDefaultInstance());
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder addSnoozeTime(int var1, Types$PbLocalDateTime$Builder var2) {
      if (this.snoozeTimeBuilder_ == null) {
         this.ensureSnoozeTimeIsMutable();
         this.snoozeTime_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.snoozeTimeBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder addSnoozeTime(int var1, Types$PbLocalDateTime var2) {
      if (this.snoozeTimeBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureSnoozeTimeIsMutable();
         this.snoozeTime_.add(var1, var2);
         this.onChanged();
      } else {
         this.snoozeTimeBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder addSnoozeTime(Types$PbLocalDateTime$Builder var1) {
      if (this.snoozeTimeBuilder_ == null) {
         this.ensureSnoozeTimeIsMutable();
         this.snoozeTime_.add(var1.build());
         this.onChanged();
      } else {
         this.snoozeTimeBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder addSnoozeTime(Types$PbLocalDateTime var1) {
      if (this.snoozeTimeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureSnoozeTimeIsMutable();
         this.snoozeTime_.add(var1);
         this.onChanged();
      } else {
         this.snoozeTimeBuilder_.addMessage(var1);
      }

      return this;
   }

   public Types$PbLocalDateTime$Builder addSnoozeTimeBuilder() {
      return (Types$PbLocalDateTime$Builder)this.getSnoozeTimeFieldBuilder().addBuilder(Types$PbLocalDateTime.getDefaultInstance());
   }

   public Types$PbLocalDateTime$Builder addSnoozeTimeBuilder(int var1) {
      return (Types$PbLocalDateTime$Builder)this.getSnoozeTimeFieldBuilder().addBuilder(var1, Types$PbLocalDateTime.getDefaultInstance());
   }

   public SleepanalysisResult$PbSleepAnalysisResult build() {
      SleepanalysisResult$PbSleepAnalysisResult var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public SleepanalysisResult$PbSleepAnalysisResult buildPartial() {
      SleepanalysisResult$PbSleepAnalysisResult var1 = new SleepanalysisResult$PbSleepAnalysisResult(this, (SleepanalysisResult$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.sleepStartTimeBuilder_ == null) {
         SleepanalysisResult$PbSleepAnalysisResult.a(var1, this.sleepStartTime_);
      } else {
         SleepanalysisResult$PbSleepAnalysisResult.a(var1, (Types$PbLocalDateTime)this.sleepStartTimeBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.sleepEndTimeBuilder_ == null) {
         SleepanalysisResult$PbSleepAnalysisResult.b(var1, this.sleepEndTime_);
      } else {
         SleepanalysisResult$PbSleepAnalysisResult.b(var1, (Types$PbLocalDateTime)this.sleepEndTimeBuilder_.build());
      }

      int var6 = var4;
      if ((var2 & 4) == 4) {
         var6 = var4 | 4;
      }

      if (this.lastModifiedBuilder_ == null) {
         SleepanalysisResult$PbSleepAnalysisResult.a(var1, this.lastModified_);
      } else {
         SleepanalysisResult$PbSleepAnalysisResult.a(var1, (Types$PbSystemDateTime)this.lastModifiedBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 8) == 8) {
         var4 = var6 | 8;
      }

      SleepanalysisResult$PbSleepAnalysisResult.a(var1, this.sleepGoalMinutes_);
      if (this.sleepwakePhasesBuilder_ == null) {
         if ((this.bitField0_ & 16) == 16) {
            this.sleepwakePhases_ = Collections.unmodifiableList(this.sleepwakePhases_);
            this.bitField0_ &= -17;
         }

         SleepanalysisResult$PbSleepAnalysisResult.a(var1, this.sleepwakePhases_);
      } else {
         SleepanalysisResult$PbSleepAnalysisResult.a(var1, this.sleepwakePhasesBuilder_.build());
      }

      if (this.snoozeTimeBuilder_ == null) {
         if ((this.bitField0_ & 32) == 32) {
            this.snoozeTime_ = Collections.unmodifiableList(this.snoozeTime_);
            this.bitField0_ &= -33;
         }

         SleepanalysisResult$PbSleepAnalysisResult.b(var1, this.snoozeTime_);
      } else {
         SleepanalysisResult$PbSleepAnalysisResult.b(var1, this.snoozeTimeBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 64) == 64) {
         var6 = var4 | 16;
      }

      if (this.alarmTimeBuilder_ == null) {
         SleepanalysisResult$PbSleepAnalysisResult.c(var1, this.alarmTime_);
      } else {
         SleepanalysisResult$PbSleepAnalysisResult.c(var1, (Types$PbLocalDateTime)this.alarmTimeBuilder_.build());
      }

      int var5 = var6;
      if ((var2 & 128) == 128) {
         var5 = var6 | 32;
      }

      SleepanalysisResult$PbSleepAnalysisResult.b(var1, this.sleepStartOffsetSeconds_);
      var4 = var5;
      if ((var2 & 256) == 256) {
         var4 = var5 | 64;
      }

      SleepanalysisResult$PbSleepAnalysisResult.c(var1, this.sleepEndOffsetSeconds_);
      var6 = var4;
      if ((var2 & 512) == 512) {
         var6 = var4 | 128;
      }

      SleepanalysisResult$PbSleepAnalysisResult.d(var1, this.userSleepRating_);
      var4 = var6;
      if ((var2 & 1024) == 1024) {
         var4 = var6 | 256;
      }

      if (this.recordingDeviceBuilder_ == null) {
         SleepanalysisResult$PbSleepAnalysisResult.a(var1, this.recordingDevice_);
      } else {
         SleepanalysisResult$PbSleepAnalysisResult.a(var1, (Structures$PbDeviceId)this.recordingDeviceBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 2048) == 2048) {
         var6 = var4 | 512;
      }

      SleepanalysisResult$PbSleepAnalysisResult.a(var1, this.batteryRanOut_);
      SleepanalysisResult$PbSleepAnalysisResult.e(var1, var6);
      this.onBuilt();
      return var1;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder clear() {
      super.clear();
      if (this.sleepStartTimeBuilder_ == null) {
         this.sleepStartTime_ = null;
      } else {
         this.sleepStartTimeBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.sleepEndTimeBuilder_ == null) {
         this.sleepEndTime_ = null;
      } else {
         this.sleepEndTimeBuilder_.clear();
      }

      this.bitField0_ &= -3;
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -5;
      this.sleepGoalMinutes_ = 0;
      this.bitField0_ &= -9;
      if (this.sleepwakePhasesBuilder_ == null) {
         this.sleepwakePhases_ = Collections.emptyList();
         this.bitField0_ &= -17;
      } else {
         this.sleepwakePhasesBuilder_.clear();
      }

      if (this.snoozeTimeBuilder_ == null) {
         this.snoozeTime_ = Collections.emptyList();
         this.bitField0_ &= -33;
      } else {
         this.snoozeTimeBuilder_.clear();
      }

      if (this.alarmTimeBuilder_ == null) {
         this.alarmTime_ = null;
      } else {
         this.alarmTimeBuilder_.clear();
      }

      this.bitField0_ &= -65;
      this.sleepStartOffsetSeconds_ = 0;
      this.bitField0_ &= -129;
      this.sleepEndOffsetSeconds_ = 0;
      this.bitField0_ &= -257;
      this.userSleepRating_ = 0;
      this.bitField0_ &= -513;
      if (this.recordingDeviceBuilder_ == null) {
         this.recordingDevice_ = null;
      } else {
         this.recordingDeviceBuilder_.clear();
      }

      this.bitField0_ &= -1025;
      this.batteryRanOut_ = false;
      this.bitField0_ &= -2049;
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder clearAlarmTime() {
      if (this.alarmTimeBuilder_ == null) {
         this.alarmTime_ = null;
         this.onChanged();
      } else {
         this.alarmTimeBuilder_.clear();
      }

      this.bitField0_ &= -65;
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder clearBatteryRanOut() {
      this.bitField0_ &= -2049;
      this.batteryRanOut_ = false;
      this.onChanged();
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder clearField(FieldDescriptor var1) {
      return (SleepanalysisResult$PbSleepAnalysisResult$Builder)super.clearField(var1);
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder clearLastModified() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder clearOneof(OneofDescriptor var1) {
      return (SleepanalysisResult$PbSleepAnalysisResult$Builder)super.clearOneof(var1);
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder clearRecordingDevice() {
      if (this.recordingDeviceBuilder_ == null) {
         this.recordingDevice_ = null;
         this.onChanged();
      } else {
         this.recordingDeviceBuilder_.clear();
      }

      this.bitField0_ &= -1025;
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder clearSleepEndOffsetSeconds() {
      this.bitField0_ &= -257;
      this.sleepEndOffsetSeconds_ = 0;
      this.onChanged();
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder clearSleepEndTime() {
      if (this.sleepEndTimeBuilder_ == null) {
         this.sleepEndTime_ = null;
         this.onChanged();
      } else {
         this.sleepEndTimeBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder clearSleepGoalMinutes() {
      this.bitField0_ &= -9;
      this.sleepGoalMinutes_ = 0;
      this.onChanged();
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder clearSleepStartOffsetSeconds() {
      this.bitField0_ &= -129;
      this.sleepStartOffsetSeconds_ = 0;
      this.onChanged();
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder clearSleepStartTime() {
      if (this.sleepStartTimeBuilder_ == null) {
         this.sleepStartTime_ = null;
         this.onChanged();
      } else {
         this.sleepStartTimeBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder clearSleepwakePhases() {
      if (this.sleepwakePhasesBuilder_ == null) {
         this.sleepwakePhases_ = Collections.emptyList();
         this.bitField0_ &= -17;
         this.onChanged();
      } else {
         this.sleepwakePhasesBuilder_.clear();
      }

      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder clearSnoozeTime() {
      if (this.snoozeTimeBuilder_ == null) {
         this.snoozeTime_ = Collections.emptyList();
         this.bitField0_ &= -33;
         this.onChanged();
      } else {
         this.snoozeTimeBuilder_.clear();
      }

      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder clearUserSleepRating() {
      this.bitField0_ &= -513;
      this.userSleepRating_ = 0;
      this.onChanged();
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder clone() {
      return (SleepanalysisResult$PbSleepAnalysisResult$Builder)super.clone();
   }

   public Types$PbLocalDateTime getAlarmTime() {
      Types$PbLocalDateTime var1;
      if (this.alarmTimeBuilder_ == null) {
         if (this.alarmTime_ == null) {
            var1 = Types$PbLocalDateTime.getDefaultInstance();
         } else {
            var1 = this.alarmTime_;
         }
      } else {
         var1 = (Types$PbLocalDateTime)this.alarmTimeBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbLocalDateTime$Builder getAlarmTimeBuilder() {
      this.bitField0_ |= 64;
      this.onChanged();
      return (Types$PbLocalDateTime$Builder)this.getAlarmTimeFieldBuilder().getBuilder();
   }

   public Types$PbLocalDateTimeOrBuilder getAlarmTimeOrBuilder() {
      Object var1;
      if (this.alarmTimeBuilder_ != null) {
         var1 = (Types$PbLocalDateTimeOrBuilder)this.alarmTimeBuilder_.getMessageOrBuilder();
      } else if (this.alarmTime_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.alarmTime_;
      }

      return (Types$PbLocalDateTimeOrBuilder)var1;
   }

   public boolean getBatteryRanOut() {
      return this.batteryRanOut_;
   }

   public SleepanalysisResult$PbSleepAnalysisResult getDefaultInstanceForType() {
      return SleepanalysisResult$PbSleepAnalysisResult.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return SleepanalysisResult.c();
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
      this.bitField0_ |= 4;
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

   public Structures$PbDeviceId getRecordingDevice() {
      Structures$PbDeviceId var1;
      if (this.recordingDeviceBuilder_ == null) {
         if (this.recordingDevice_ == null) {
            var1 = Structures$PbDeviceId.getDefaultInstance();
         } else {
            var1 = this.recordingDevice_;
         }
      } else {
         var1 = (Structures$PbDeviceId)this.recordingDeviceBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbDeviceId$Builder getRecordingDeviceBuilder() {
      this.bitField0_ |= 1024;
      this.onChanged();
      return (Structures$PbDeviceId$Builder)this.getRecordingDeviceFieldBuilder().getBuilder();
   }

   public Structures$PbDeviceIdOrBuilder getRecordingDeviceOrBuilder() {
      Object var1;
      if (this.recordingDeviceBuilder_ != null) {
         var1 = (Structures$PbDeviceIdOrBuilder)this.recordingDeviceBuilder_.getMessageOrBuilder();
      } else if (this.recordingDevice_ == null) {
         var1 = Structures$PbDeviceId.getDefaultInstance();
      } else {
         var1 = this.recordingDevice_;
      }

      return (Structures$PbDeviceIdOrBuilder)var1;
   }

   public int getSleepEndOffsetSeconds() {
      return this.sleepEndOffsetSeconds_;
   }

   public Types$PbLocalDateTime getSleepEndTime() {
      Types$PbLocalDateTime var1;
      if (this.sleepEndTimeBuilder_ == null) {
         if (this.sleepEndTime_ == null) {
            var1 = Types$PbLocalDateTime.getDefaultInstance();
         } else {
            var1 = this.sleepEndTime_;
         }
      } else {
         var1 = (Types$PbLocalDateTime)this.sleepEndTimeBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbLocalDateTime$Builder getSleepEndTimeBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Types$PbLocalDateTime$Builder)this.getSleepEndTimeFieldBuilder().getBuilder();
   }

   public Types$PbLocalDateTimeOrBuilder getSleepEndTimeOrBuilder() {
      Object var1;
      if (this.sleepEndTimeBuilder_ != null) {
         var1 = (Types$PbLocalDateTimeOrBuilder)this.sleepEndTimeBuilder_.getMessageOrBuilder();
      } else if (this.sleepEndTime_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.sleepEndTime_;
      }

      return (Types$PbLocalDateTimeOrBuilder)var1;
   }

   public int getSleepGoalMinutes() {
      return this.sleepGoalMinutes_;
   }

   public int getSleepStartOffsetSeconds() {
      return this.sleepStartOffsetSeconds_;
   }

   public Types$PbLocalDateTime getSleepStartTime() {
      Types$PbLocalDateTime var1;
      if (this.sleepStartTimeBuilder_ == null) {
         if (this.sleepStartTime_ == null) {
            var1 = Types$PbLocalDateTime.getDefaultInstance();
         } else {
            var1 = this.sleepStartTime_;
         }
      } else {
         var1 = (Types$PbLocalDateTime)this.sleepStartTimeBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbLocalDateTime$Builder getSleepStartTimeBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Types$PbLocalDateTime$Builder)this.getSleepStartTimeFieldBuilder().getBuilder();
   }

   public Types$PbLocalDateTimeOrBuilder getSleepStartTimeOrBuilder() {
      Object var1;
      if (this.sleepStartTimeBuilder_ != null) {
         var1 = (Types$PbLocalDateTimeOrBuilder)this.sleepStartTimeBuilder_.getMessageOrBuilder();
      } else if (this.sleepStartTime_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.sleepStartTime_;
      }

      return (Types$PbLocalDateTimeOrBuilder)var1;
   }

   public SleepanalysisResult$PbSleepWakePhase getSleepwakePhases(int var1) {
      SleepanalysisResult$PbSleepWakePhase var2;
      if (this.sleepwakePhasesBuilder_ == null) {
         var2 = (SleepanalysisResult$PbSleepWakePhase)this.sleepwakePhases_.get(var1);
      } else {
         var2 = (SleepanalysisResult$PbSleepWakePhase)this.sleepwakePhasesBuilder_.getMessage(var1);
      }

      return var2;
   }

   public SleepanalysisResult$PbSleepWakePhase$Builder getSleepwakePhasesBuilder(int var1) {
      return (SleepanalysisResult$PbSleepWakePhase$Builder)this.getSleepwakePhasesFieldBuilder().getBuilder(var1);
   }

   public List getSleepwakePhasesBuilderList() {
      return this.getSleepwakePhasesFieldBuilder().getBuilderList();
   }

   public int getSleepwakePhasesCount() {
      int var1;
      if (this.sleepwakePhasesBuilder_ == null) {
         var1 = this.sleepwakePhases_.size();
      } else {
         var1 = this.sleepwakePhasesBuilder_.getCount();
      }

      return var1;
   }

   public List getSleepwakePhasesList() {
      List var1;
      if (this.sleepwakePhasesBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.sleepwakePhases_);
      } else {
         var1 = this.sleepwakePhasesBuilder_.getMessageList();
      }

      return var1;
   }

   public SleepanalysisResult$PbSleepWakePhaseOrBuilder getSleepwakePhasesOrBuilder(int var1) {
      SleepanalysisResult$PbSleepWakePhaseOrBuilder var2;
      if (this.sleepwakePhasesBuilder_ == null) {
         var2 = (SleepanalysisResult$PbSleepWakePhaseOrBuilder)this.sleepwakePhases_.get(var1);
      } else {
         var2 = (SleepanalysisResult$PbSleepWakePhaseOrBuilder)this.sleepwakePhasesBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getSleepwakePhasesOrBuilderList() {
      List var1;
      if (this.sleepwakePhasesBuilder_ != null) {
         var1 = this.sleepwakePhasesBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.sleepwakePhases_);
      }

      return var1;
   }

   public Types$PbLocalDateTime getSnoozeTime(int var1) {
      Types$PbLocalDateTime var2;
      if (this.snoozeTimeBuilder_ == null) {
         var2 = (Types$PbLocalDateTime)this.snoozeTime_.get(var1);
      } else {
         var2 = (Types$PbLocalDateTime)this.snoozeTimeBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Types$PbLocalDateTime$Builder getSnoozeTimeBuilder(int var1) {
      return (Types$PbLocalDateTime$Builder)this.getSnoozeTimeFieldBuilder().getBuilder(var1);
   }

   public List getSnoozeTimeBuilderList() {
      return this.getSnoozeTimeFieldBuilder().getBuilderList();
   }

   public int getSnoozeTimeCount() {
      int var1;
      if (this.snoozeTimeBuilder_ == null) {
         var1 = this.snoozeTime_.size();
      } else {
         var1 = this.snoozeTimeBuilder_.getCount();
      }

      return var1;
   }

   public List getSnoozeTimeList() {
      List var1;
      if (this.snoozeTimeBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.snoozeTime_);
      } else {
         var1 = this.snoozeTimeBuilder_.getMessageList();
      }

      return var1;
   }

   public Types$PbLocalDateTimeOrBuilder getSnoozeTimeOrBuilder(int var1) {
      Types$PbLocalDateTimeOrBuilder var2;
      if (this.snoozeTimeBuilder_ == null) {
         var2 = (Types$PbLocalDateTimeOrBuilder)this.snoozeTime_.get(var1);
      } else {
         var2 = (Types$PbLocalDateTimeOrBuilder)this.snoozeTimeBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getSnoozeTimeOrBuilderList() {
      List var1;
      if (this.snoozeTimeBuilder_ != null) {
         var1 = this.snoozeTimeBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.snoozeTime_);
      }

      return var1;
   }

   public SleepanalysisResult$PbSleepUserRating getUserSleepRating() {
      SleepanalysisResult$PbSleepUserRating var1 = SleepanalysisResult$PbSleepUserRating.valueOf(this.userSleepRating_);
      SleepanalysisResult$PbSleepUserRating var2 = var1;
      if (var1 == null) {
         var2 = SleepanalysisResult$PbSleepUserRating.PB_SLEPT_POORLY;
      }

      return var2;
   }

   public boolean hasAlarmTime() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasBatteryRanOut() {
      boolean var1;
      if ((this.bitField0_ & 2048) == 2048) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLastModified() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasRecordingDevice() {
      boolean var1;
      if ((this.bitField0_ & 1024) == 1024) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSleepEndOffsetSeconds() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSleepEndTime() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSleepGoalMinutes() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSleepStartOffsetSeconds() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSleepStartTime() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasUserSleepRating() {
      boolean var1;
      if ((this.bitField0_ & 512) == 512) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SleepanalysisResult.d().ensureFieldAccessorsInitialized(SleepanalysisResult$PbSleepAnalysisResult.class, SleepanalysisResult$PbSleepAnalysisResult$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasSleepStartTime()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasSleepEndTime()) {
            var2 = var1;
            if (this.hasLastModified()) {
               var2 = var1;
               if (this.hasSleepGoalMinutes()) {
                  var2 = var1;
                  if (this.getSleepStartTime().isInitialized()) {
                     var2 = var1;
                     if (this.getSleepEndTime().isInitialized()) {
                        var2 = var1;
                        if (this.getLastModified().isInitialized()) {
                           int var3 = 0;

                           while(true) {
                              if (var3 >= this.getSleepwakePhasesCount()) {
                                 for(var3 = 0; var3 < this.getSnoozeTimeCount(); ++var3) {
                                    var2 = var1;
                                    if (!this.getSnoozeTime(var3).isInitialized()) {
                                       return var2;
                                    }
                                 }

                                 if (this.hasAlarmTime()) {
                                    var2 = var1;
                                    if (!this.getAlarmTime().isInitialized()) {
                                       break;
                                    }
                                 }

                                 if (this.hasRecordingDevice()) {
                                    var2 = var1;
                                    if (!this.getRecordingDevice().isInitialized()) {
                                       break;
                                    }
                                 }

                                 var2 = true;
                                 break;
                              }

                              var2 = var1;
                              if (!this.getSleepwakePhases(var3).isInitialized()) {
                                 break;
                              }

                              ++var3;
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

   public SleepanalysisResult$PbSleepAnalysisResult$Builder mergeAlarmTime(Types$PbLocalDateTime var1) {
      if (this.alarmTimeBuilder_ == null) {
         if ((this.bitField0_ & 64) == 64 && this.alarmTime_ != null && this.alarmTime_ != Types$PbLocalDateTime.getDefaultInstance()) {
            this.alarmTime_ = Types$PbLocalDateTime.newBuilder(this.alarmTime_).mergeFrom(var1).buildPartial();
         } else {
            this.alarmTime_ = var1;
         }

         this.onChanged();
      } else {
         this.alarmTimeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      SleepanalysisResult$PbSleepAnalysisResult var13;
      label96: {
         InvalidProtocolBufferException var12;
         SleepanalysisResult$PbSleepAnalysisResult var14;
         try {
            var13 = (SleepanalysisResult$PbSleepAnalysisResult)SleepanalysisResult$PbSleepAnalysisResult.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (SleepanalysisResult$PbSleepAnalysisResult)var10.getUnfinishedMessage();
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

   public SleepanalysisResult$PbSleepAnalysisResult$Builder mergeFrom(Message var1) {
      SleepanalysisResult$PbSleepAnalysisResult$Builder var2;
      if (var1 instanceof SleepanalysisResult$PbSleepAnalysisResult) {
         var2 = this.mergeFrom((SleepanalysisResult$PbSleepAnalysisResult)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder mergeFrom(SleepanalysisResult$PbSleepAnalysisResult var1) {
      Object var2 = null;
      if (var1 != SleepanalysisResult$PbSleepAnalysisResult.getDefaultInstance()) {
         if (var1.hasSleepStartTime()) {
            this.mergeSleepStartTime(var1.getSleepStartTime());
         }

         if (var1.hasSleepEndTime()) {
            this.mergeSleepEndTime(var1.getSleepEndTime());
         }

         if (var1.hasLastModified()) {
            this.mergeLastModified(var1.getLastModified());
         }

         if (var1.hasSleepGoalMinutes()) {
            this.setSleepGoalMinutes(var1.getSleepGoalMinutes());
         }

         RepeatedFieldBuilderV3 var3;
         if (this.sleepwakePhasesBuilder_ == null) {
            if (!SleepanalysisResult$PbSleepAnalysisResult.a(var1).isEmpty()) {
               if (this.sleepwakePhases_.isEmpty()) {
                  this.sleepwakePhases_ = SleepanalysisResult$PbSleepAnalysisResult.a(var1);
                  this.bitField0_ &= -17;
               } else {
                  this.ensureSleepwakePhasesIsMutable();
                  this.sleepwakePhases_.addAll(SleepanalysisResult$PbSleepAnalysisResult.a(var1));
               }

               this.onChanged();
            }
         } else if (!SleepanalysisResult$PbSleepAnalysisResult.a(var1).isEmpty()) {
            if (this.sleepwakePhasesBuilder_.isEmpty()) {
               this.sleepwakePhasesBuilder_.dispose();
               this.sleepwakePhasesBuilder_ = null;
               this.sleepwakePhases_ = SleepanalysisResult$PbSleepAnalysisResult.a(var1);
               this.bitField0_ &= -17;
               if (SleepanalysisResult$PbSleepAnalysisResult.c()) {
                  var3 = this.getSleepwakePhasesFieldBuilder();
               } else {
                  var3 = null;
               }

               this.sleepwakePhasesBuilder_ = var3;
            } else {
               this.sleepwakePhasesBuilder_.addAllMessages(SleepanalysisResult$PbSleepAnalysisResult.a(var1));
            }
         }

         if (this.snoozeTimeBuilder_ == null) {
            if (!SleepanalysisResult$PbSleepAnalysisResult.b(var1).isEmpty()) {
               if (this.snoozeTime_.isEmpty()) {
                  this.snoozeTime_ = SleepanalysisResult$PbSleepAnalysisResult.b(var1);
                  this.bitField0_ &= -33;
               } else {
                  this.ensureSnoozeTimeIsMutable();
                  this.snoozeTime_.addAll(SleepanalysisResult$PbSleepAnalysisResult.b(var1));
               }

               this.onChanged();
            }
         } else if (!SleepanalysisResult$PbSleepAnalysisResult.b(var1).isEmpty()) {
            if (this.snoozeTimeBuilder_.isEmpty()) {
               this.snoozeTimeBuilder_.dispose();
               this.snoozeTimeBuilder_ = null;
               this.snoozeTime_ = SleepanalysisResult$PbSleepAnalysisResult.b(var1);
               this.bitField0_ &= -33;
               var3 = (RepeatedFieldBuilderV3)var2;
               if (SleepanalysisResult$PbSleepAnalysisResult.d()) {
                  var3 = this.getSnoozeTimeFieldBuilder();
               }

               this.snoozeTimeBuilder_ = var3;
            } else {
               this.snoozeTimeBuilder_.addAllMessages(SleepanalysisResult$PbSleepAnalysisResult.b(var1));
            }
         }

         if (var1.hasAlarmTime()) {
            this.mergeAlarmTime(var1.getAlarmTime());
         }

         if (var1.hasSleepStartOffsetSeconds()) {
            this.setSleepStartOffsetSeconds(var1.getSleepStartOffsetSeconds());
         }

         if (var1.hasSleepEndOffsetSeconds()) {
            this.setSleepEndOffsetSeconds(var1.getSleepEndOffsetSeconds());
         }

         if (var1.hasUserSleepRating()) {
            this.setUserSleepRating(var1.getUserSleepRating());
         }

         if (var1.hasRecordingDevice()) {
            this.mergeRecordingDevice(var1.getRecordingDevice());
         }

         if (var1.hasBatteryRanOut()) {
            this.setBatteryRanOut(var1.getBatteryRanOut());
         }

         this.mergeUnknownFields(SleepanalysisResult$PbSleepAnalysisResult.c(var1));
         this.onChanged();
      }

      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder mergeLastModified(Types$PbSystemDateTime var1) {
      if (this.lastModifiedBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.lastModified_ != null && this.lastModified_ != Types$PbSystemDateTime.getDefaultInstance()) {
            this.lastModified_ = Types$PbSystemDateTime.newBuilder(this.lastModified_).mergeFrom(var1).buildPartial();
         } else {
            this.lastModified_ = var1;
         }

         this.onChanged();
      } else {
         this.lastModifiedBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder mergeRecordingDevice(Structures$PbDeviceId var1) {
      if (this.recordingDeviceBuilder_ == null) {
         if ((this.bitField0_ & 1024) == 1024 && this.recordingDevice_ != null && this.recordingDevice_ != Structures$PbDeviceId.getDefaultInstance()) {
            this.recordingDevice_ = Structures$PbDeviceId.newBuilder(this.recordingDevice_).mergeFrom(var1).buildPartial();
         } else {
            this.recordingDevice_ = var1;
         }

         this.onChanged();
      } else {
         this.recordingDeviceBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder mergeSleepEndTime(Types$PbLocalDateTime var1) {
      if (this.sleepEndTimeBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.sleepEndTime_ != null && this.sleepEndTime_ != Types$PbLocalDateTime.getDefaultInstance()) {
            this.sleepEndTime_ = Types$PbLocalDateTime.newBuilder(this.sleepEndTime_).mergeFrom(var1).buildPartial();
         } else {
            this.sleepEndTime_ = var1;
         }

         this.onChanged();
      } else {
         this.sleepEndTimeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder mergeSleepStartTime(Types$PbLocalDateTime var1) {
      if (this.sleepStartTimeBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.sleepStartTime_ != null && this.sleepStartTime_ != Types$PbLocalDateTime.getDefaultInstance()) {
            this.sleepStartTime_ = Types$PbLocalDateTime.newBuilder(this.sleepStartTime_).mergeFrom(var1).buildPartial();
         } else {
            this.sleepStartTime_ = var1;
         }

         this.onChanged();
      } else {
         this.sleepStartTimeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public final SleepanalysisResult$PbSleepAnalysisResult$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (SleepanalysisResult$PbSleepAnalysisResult$Builder)super.mergeUnknownFields(var1);
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder removeSleepwakePhases(int var1) {
      if (this.sleepwakePhasesBuilder_ == null) {
         this.ensureSleepwakePhasesIsMutable();
         this.sleepwakePhases_.remove(var1);
         this.onChanged();
      } else {
         this.sleepwakePhasesBuilder_.remove(var1);
      }

      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder removeSnoozeTime(int var1) {
      if (this.snoozeTimeBuilder_ == null) {
         this.ensureSnoozeTimeIsMutable();
         this.snoozeTime_.remove(var1);
         this.onChanged();
      } else {
         this.snoozeTimeBuilder_.remove(var1);
      }

      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder setAlarmTime(Types$PbLocalDateTime$Builder var1) {
      if (this.alarmTimeBuilder_ == null) {
         this.alarmTime_ = var1.build();
         this.onChanged();
      } else {
         this.alarmTimeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 64;
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder setAlarmTime(Types$PbLocalDateTime var1) {
      if (this.alarmTimeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.alarmTime_ = var1;
         this.onChanged();
      } else {
         this.alarmTimeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder setBatteryRanOut(boolean var1) {
      this.bitField0_ |= 2048;
      this.batteryRanOut_ = var1;
      this.onChanged();
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder setField(FieldDescriptor var1, Object var2) {
      return (SleepanalysisResult$PbSleepAnalysisResult$Builder)super.setField(var1, var2);
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder setLastModified(Types$PbSystemDateTime$Builder var1) {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = var1.build();
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder setLastModified(Types$PbSystemDateTime var1) {
      if (this.lastModifiedBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.lastModified_ = var1;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder setRecordingDevice(Structures$PbDeviceId$Builder var1) {
      if (this.recordingDeviceBuilder_ == null) {
         this.recordingDevice_ = var1.build();
         this.onChanged();
      } else {
         this.recordingDeviceBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder setRecordingDevice(Structures$PbDeviceId var1) {
      if (this.recordingDeviceBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.recordingDevice_ = var1;
         this.onChanged();
      } else {
         this.recordingDeviceBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (SleepanalysisResult$PbSleepAnalysisResult$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder setSleepEndOffsetSeconds(int var1) {
      this.bitField0_ |= 256;
      this.sleepEndOffsetSeconds_ = var1;
      this.onChanged();
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder setSleepEndTime(Types$PbLocalDateTime$Builder var1) {
      if (this.sleepEndTimeBuilder_ == null) {
         this.sleepEndTime_ = var1.build();
         this.onChanged();
      } else {
         this.sleepEndTimeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder setSleepEndTime(Types$PbLocalDateTime var1) {
      if (this.sleepEndTimeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.sleepEndTime_ = var1;
         this.onChanged();
      } else {
         this.sleepEndTimeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder setSleepGoalMinutes(int var1) {
      this.bitField0_ |= 8;
      this.sleepGoalMinutes_ = var1;
      this.onChanged();
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder setSleepStartOffsetSeconds(int var1) {
      this.bitField0_ |= 128;
      this.sleepStartOffsetSeconds_ = var1;
      this.onChanged();
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder setSleepStartTime(Types$PbLocalDateTime$Builder var1) {
      if (this.sleepStartTimeBuilder_ == null) {
         this.sleepStartTime_ = var1.build();
         this.onChanged();
      } else {
         this.sleepStartTimeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder setSleepStartTime(Types$PbLocalDateTime var1) {
      if (this.sleepStartTimeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.sleepStartTime_ = var1;
         this.onChanged();
      } else {
         this.sleepStartTimeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder setSleepwakePhases(int var1, SleepanalysisResult$PbSleepWakePhase$Builder var2) {
      if (this.sleepwakePhasesBuilder_ == null) {
         this.ensureSleepwakePhasesIsMutable();
         this.sleepwakePhases_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.sleepwakePhasesBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder setSleepwakePhases(int var1, SleepanalysisResult$PbSleepWakePhase var2) {
      if (this.sleepwakePhasesBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureSleepwakePhasesIsMutable();
         this.sleepwakePhases_.set(var1, var2);
         this.onChanged();
      } else {
         this.sleepwakePhasesBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder setSnoozeTime(int var1, Types$PbLocalDateTime$Builder var2) {
      if (this.snoozeTimeBuilder_ == null) {
         this.ensureSnoozeTimeIsMutable();
         this.snoozeTime_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.snoozeTimeBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder setSnoozeTime(int var1, Types$PbLocalDateTime var2) {
      if (this.snoozeTimeBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureSnoozeTimeIsMutable();
         this.snoozeTime_.set(var1, var2);
         this.onChanged();
      } else {
         this.snoozeTimeBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public final SleepanalysisResult$PbSleepAnalysisResult$Builder setUnknownFields(UnknownFieldSet var1) {
      return (SleepanalysisResult$PbSleepAnalysisResult$Builder)super.setUnknownFields(var1);
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder setUserSleepRating(SleepanalysisResult$PbSleepUserRating var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 512;
         this.userSleepRating_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }
}
