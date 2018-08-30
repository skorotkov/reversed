package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
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

public final class SleepanalysisResult$PbSleepAnalysisResult extends GeneratedMessageV3 implements SleepanalysisResult$PbSleepAnalysisResultOrBuilder {
   public static final int ALARM_TIME_FIELD_NUMBER = 7;
   public static final int BATTERY_RAN_OUT_FIELD_NUMBER = 12;
   private static final SleepanalysisResult$PbSleepAnalysisResult DEFAULT_INSTANCE = new SleepanalysisResult$PbSleepAnalysisResult();
   public static final int LAST_MODIFIED_FIELD_NUMBER = 3;
   @Deprecated
   public static final Parser PARSER = new SleepanalysisResult$PbSleepAnalysisResult$1();
   public static final int RECORDING_DEVICE_FIELD_NUMBER = 11;
   public static final int SLEEPWAKE_PHASES_FIELD_NUMBER = 5;
   public static final int SLEEP_END_OFFSET_SECONDS_FIELD_NUMBER = 9;
   public static final int SLEEP_END_TIME_FIELD_NUMBER = 2;
   public static final int SLEEP_GOAL_MINUTES_FIELD_NUMBER = 4;
   public static final int SLEEP_START_OFFSET_SECONDS_FIELD_NUMBER = 8;
   public static final int SLEEP_START_TIME_FIELD_NUMBER = 1;
   public static final int SNOOZE_TIME_FIELD_NUMBER = 6;
   public static final int USER_SLEEP_RATING_FIELD_NUMBER = 10;
   private static final long serialVersionUID = 0L;
   private Types$PbLocalDateTime alarmTime_;
   private boolean batteryRanOut_;
   private int bitField0_;
   private Types$PbSystemDateTime lastModified_;
   private byte memoizedIsInitialized;
   private Structures$PbDeviceId recordingDevice_;
   private int sleepEndOffsetSeconds_;
   private Types$PbLocalDateTime sleepEndTime_;
   private int sleepGoalMinutes_;
   private int sleepStartOffsetSeconds_;
   private Types$PbLocalDateTime sleepStartTime_;
   private List sleepwakePhases_;
   private List snoozeTime_;
   private int userSleepRating_;

   private SleepanalysisResult$PbSleepAnalysisResult() {
      this.memoizedIsInitialized = (byte)-1;
      this.sleepGoalMinutes_ = 0;
      this.sleepwakePhases_ = Collections.emptyList();
      this.snoozeTime_ = Collections.emptyList();
      this.sleepStartOffsetSeconds_ = 0;
      this.sleepEndOffsetSeconds_ = 0;
      this.userSleepRating_ = 0;
      this.batteryRanOut_ = false;
   }

   private SleepanalysisResult$PbSleepAnalysisResult(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   SleepanalysisResult$PbSleepAnalysisResult(CodedInputStream var1, ExtensionRegistryLite var2, SleepanalysisResult$1 var3) {
      this(var1, var2);
   }

   private SleepanalysisResult$PbSleepAnalysisResult(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   SleepanalysisResult$PbSleepAnalysisResult(Builder var1, SleepanalysisResult$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(SleepanalysisResult$PbSleepAnalysisResult var0, int var1) {
      var0.sleepGoalMinutes_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbDeviceId a(SleepanalysisResult$PbSleepAnalysisResult var0, Structures$PbDeviceId var1) {
      var0.recordingDevice_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbLocalDateTime a(SleepanalysisResult$PbSleepAnalysisResult var0, Types$PbLocalDateTime var1) {
      var0.sleepStartTime_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime a(SleepanalysisResult$PbSleepAnalysisResult var0, Types$PbSystemDateTime var1) {
      var0.lastModified_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List a(SleepanalysisResult$PbSleepAnalysisResult var0) {
      return var0.sleepwakePhases_;
   }

   // $FF: synthetic method
   static List a(SleepanalysisResult$PbSleepAnalysisResult var0, List var1) {
      var0.sleepwakePhases_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean a(SleepanalysisResult$PbSleepAnalysisResult var0, boolean var1) {
      var0.batteryRanOut_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(SleepanalysisResult$PbSleepAnalysisResult var0, int var1) {
      var0.sleepStartOffsetSeconds_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbLocalDateTime b(SleepanalysisResult$PbSleepAnalysisResult var0, Types$PbLocalDateTime var1) {
      var0.sleepEndTime_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List b(SleepanalysisResult$PbSleepAnalysisResult var0) {
      return var0.snoozeTime_;
   }

   // $FF: synthetic method
   static List b(SleepanalysisResult$PbSleepAnalysisResult var0, List var1) {
      var0.snoozeTime_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(SleepanalysisResult$PbSleepAnalysisResult var0, int var1) {
      var0.sleepEndOffsetSeconds_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet c(SleepanalysisResult$PbSleepAnalysisResult var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbLocalDateTime c(SleepanalysisResult$PbSleepAnalysisResult var0, Types$PbLocalDateTime var1) {
      var0.alarmTime_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean c() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int d(SleepanalysisResult$PbSleepAnalysisResult var0, int var1) {
      var0.userSleepRating_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean d() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int e(SleepanalysisResult$PbSleepAnalysisResult var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static SleepanalysisResult$PbSleepAnalysisResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return SleepanalysisResult.c();
   }

   public static SleepanalysisResult$PbSleepAnalysisResult$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SleepanalysisResult$PbSleepAnalysisResult$Builder newBuilder(SleepanalysisResult$PbSleepAnalysisResult var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static SleepanalysisResult$PbSleepAnalysisResult parseDelimitedFrom(InputStream var0) {
      return (SleepanalysisResult$PbSleepAnalysisResult)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SleepanalysisResult$PbSleepAnalysisResult parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SleepanalysisResult$PbSleepAnalysisResult)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SleepanalysisResult$PbSleepAnalysisResult parseFrom(ByteString var0) {
      return (SleepanalysisResult$PbSleepAnalysisResult)PARSER.parseFrom(var0);
   }

   public static SleepanalysisResult$PbSleepAnalysisResult parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (SleepanalysisResult$PbSleepAnalysisResult)PARSER.parseFrom(var0, var1);
   }

   public static SleepanalysisResult$PbSleepAnalysisResult parseFrom(CodedInputStream var0) {
      return (SleepanalysisResult$PbSleepAnalysisResult)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SleepanalysisResult$PbSleepAnalysisResult parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (SleepanalysisResult$PbSleepAnalysisResult)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SleepanalysisResult$PbSleepAnalysisResult parseFrom(InputStream var0) {
      return (SleepanalysisResult$PbSleepAnalysisResult)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SleepanalysisResult$PbSleepAnalysisResult parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SleepanalysisResult$PbSleepAnalysisResult)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SleepanalysisResult$PbSleepAnalysisResult parseFrom(byte[] var0) {
      return (SleepanalysisResult$PbSleepAnalysisResult)PARSER.parseFrom(var0);
   }

   public static SleepanalysisResult$PbSleepAnalysisResult parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (SleepanalysisResult$PbSleepAnalysisResult)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof SleepanalysisResult$PbSleepAnalysisResult)) {
            var2 = super.equals(var1);
         } else {
            SleepanalysisResult$PbSleepAnalysisResult var5 = (SleepanalysisResult$PbSleepAnalysisResult)var1;
            boolean var3;
            if (this.hasSleepStartTime() == var5.hasSleepStartTime()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasSleepStartTime()) {
               if (var3 && this.getSleepStartTime().equals(var5.getSleepStartTime())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSleepEndTime() == var5.hasSleepEndTime()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSleepEndTime()) {
               if (var3 && this.getSleepEndTime().equals(var5.getSleepEndTime())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasLastModified() == var5.hasLastModified()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasLastModified()) {
               if (var4 && this.getLastModified().equals(var5.getLastModified())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasSleepGoalMinutes() == var5.hasSleepGoalMinutes()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSleepGoalMinutes()) {
               if (var4 && this.getSleepGoalMinutes() == var5.getSleepGoalMinutes()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.getSleepwakePhasesList().equals(var5.getSleepwakePhasesList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getSnoozeTimeList().equals(var5.getSnoozeTimeList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.hasAlarmTime() == var5.hasAlarmTime()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAlarmTime()) {
               if (var4 && this.getAlarmTime().equals(var5.getAlarmTime())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasSleepStartOffsetSeconds() == var5.hasSleepStartOffsetSeconds()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSleepStartOffsetSeconds()) {
               if (var4 && this.getSleepStartOffsetSeconds() == var5.getSleepStartOffsetSeconds()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasSleepEndOffsetSeconds() == var5.hasSleepEndOffsetSeconds()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSleepEndOffsetSeconds()) {
               if (var4 && this.getSleepEndOffsetSeconds() == var5.getSleepEndOffsetSeconds()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasUserSleepRating() == var5.hasUserSleepRating()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasUserSleepRating()) {
               if (var3 && this.userSleepRating_ == var5.userSleepRating_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasRecordingDevice() == var5.hasRecordingDevice()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasRecordingDevice()) {
               if (var4 && this.getRecordingDevice().equals(var5.getRecordingDevice())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasBatteryRanOut() == var5.hasBatteryRanOut()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasBatteryRanOut()) {
               if (var4 && this.getBatteryRanOut() == var5.getBatteryRanOut()) {
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

   public Types$PbLocalDateTime getAlarmTime() {
      Types$PbLocalDateTime var1;
      if (this.alarmTime_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.alarmTime_;
      }

      return var1;
   }

   public Types$PbLocalDateTimeOrBuilder getAlarmTimeOrBuilder() {
      Types$PbLocalDateTime var1;
      if (this.alarmTime_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.alarmTime_;
      }

      return var1;
   }

   public boolean getBatteryRanOut() {
      return this.batteryRanOut_;
   }

   public SleepanalysisResult$PbSleepAnalysisResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
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

   public Parser getParserForType() {
      return PARSER;
   }

   public Structures$PbDeviceId getRecordingDevice() {
      Structures$PbDeviceId var1;
      if (this.recordingDevice_ == null) {
         var1 = Structures$PbDeviceId.getDefaultInstance();
      } else {
         var1 = this.recordingDevice_;
      }

      return var1;
   }

   public Structures$PbDeviceIdOrBuilder getRecordingDeviceOrBuilder() {
      Structures$PbDeviceId var1;
      if (this.recordingDevice_ == null) {
         var1 = Structures$PbDeviceId.getDefaultInstance();
      } else {
         var1 = this.recordingDevice_;
      }

      return var1;
   }

   public int getSerializedSize() {
      byte var1 = 0;
      int var2 = this.memoizedSize;
      if (var2 == -1) {
         int var3;
         if ((this.bitField0_ & 1) == 1) {
            var3 = CodedOutputStream.computeMessageSize(1, this.getSleepStartTime()) + 0;
         } else {
            var3 = 0;
         }

         var2 = var3;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var3 + CodedOutputStream.computeMessageSize(2, this.getSleepEndTime());
         }

         var3 = var2;
         if ((this.bitField0_ & 4) == 4) {
            var3 = var2 + CodedOutputStream.computeMessageSize(3, this.getLastModified());
         }

         var2 = var3;
         if ((this.bitField0_ & 8) == 8) {
            var2 = var3 + CodedOutputStream.computeUInt32Size(4, this.sleepGoalMinutes_);
         }

         int var4 = 0;
         var3 = var2;

         while(true) {
            int var5 = var1;
            var2 = var3;
            if (var4 >= this.sleepwakePhases_.size()) {
               while(var5 < this.snoozeTime_.size()) {
                  var2 += CodedOutputStream.computeMessageSize(6, (MessageLite)this.snoozeTime_.get(var5));
                  ++var5;
               }

               var3 = var2;
               if ((this.bitField0_ & 16) == 16) {
                  var3 = var2 + CodedOutputStream.computeMessageSize(7, this.getAlarmTime());
               }

               var2 = var3;
               if ((this.bitField0_ & 32) == 32) {
                  var2 = var3 + CodedOutputStream.computeInt32Size(8, this.sleepStartOffsetSeconds_);
               }

               var3 = var2;
               if ((this.bitField0_ & 64) == 64) {
                  var3 = var2 + CodedOutputStream.computeInt32Size(9, this.sleepEndOffsetSeconds_);
               }

               var2 = var3;
               if ((this.bitField0_ & 128) == 128) {
                  var2 = var3 + CodedOutputStream.computeEnumSize(10, this.userSleepRating_);
               }

               var3 = var2;
               if ((this.bitField0_ & 256) == 256) {
                  var3 = var2 + CodedOutputStream.computeMessageSize(11, this.getRecordingDevice());
               }

               var2 = var3;
               if ((this.bitField0_ & 512) == 512) {
                  var2 = var3 + CodedOutputStream.computeBoolSize(12, this.batteryRanOut_);
               }

               var2 += this.unknownFields.getSerializedSize();
               this.memoizedSize = var2;
               break;
            }

            var3 += CodedOutputStream.computeMessageSize(5, (MessageLite)this.sleepwakePhases_.get(var4));
            ++var4;
         }
      }

      return var2;
   }

   public int getSleepEndOffsetSeconds() {
      return this.sleepEndOffsetSeconds_;
   }

   public Types$PbLocalDateTime getSleepEndTime() {
      Types$PbLocalDateTime var1;
      if (this.sleepEndTime_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.sleepEndTime_;
      }

      return var1;
   }

   public Types$PbLocalDateTimeOrBuilder getSleepEndTimeOrBuilder() {
      Types$PbLocalDateTime var1;
      if (this.sleepEndTime_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.sleepEndTime_;
      }

      return var1;
   }

   public int getSleepGoalMinutes() {
      return this.sleepGoalMinutes_;
   }

   public int getSleepStartOffsetSeconds() {
      return this.sleepStartOffsetSeconds_;
   }

   public Types$PbLocalDateTime getSleepStartTime() {
      Types$PbLocalDateTime var1;
      if (this.sleepStartTime_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.sleepStartTime_;
      }

      return var1;
   }

   public Types$PbLocalDateTimeOrBuilder getSleepStartTimeOrBuilder() {
      Types$PbLocalDateTime var1;
      if (this.sleepStartTime_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.sleepStartTime_;
      }

      return var1;
   }

   public SleepanalysisResult$PbSleepWakePhase getSleepwakePhases(int var1) {
      return (SleepanalysisResult$PbSleepWakePhase)this.sleepwakePhases_.get(var1);
   }

   public int getSleepwakePhasesCount() {
      return this.sleepwakePhases_.size();
   }

   public List getSleepwakePhasesList() {
      return this.sleepwakePhases_;
   }

   public SleepanalysisResult$PbSleepWakePhaseOrBuilder getSleepwakePhasesOrBuilder(int var1) {
      return (SleepanalysisResult$PbSleepWakePhaseOrBuilder)this.sleepwakePhases_.get(var1);
   }

   public List getSleepwakePhasesOrBuilderList() {
      return this.sleepwakePhases_;
   }

   public Types$PbLocalDateTime getSnoozeTime(int var1) {
      return (Types$PbLocalDateTime)this.snoozeTime_.get(var1);
   }

   public int getSnoozeTimeCount() {
      return this.snoozeTime_.size();
   }

   public List getSnoozeTimeList() {
      return this.snoozeTime_;
   }

   public Types$PbLocalDateTimeOrBuilder getSnoozeTimeOrBuilder(int var1) {
      return (Types$PbLocalDateTimeOrBuilder)this.snoozeTime_.get(var1);
   }

   public List getSnoozeTimeOrBuilderList() {
      return this.snoozeTime_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
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
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasBatteryRanOut() {
      boolean var1;
      if ((this.bitField0_ & 512) == 512) {
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
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSleepEndOffsetSeconds() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
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
      if ((this.bitField0_ & 32) == 32) {
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
      if ((this.bitField0_ & 128) == 128) {
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
         if (this.hasSleepStartTime()) {
            var1 = (var2 * 37 + 1) * 53 + this.getSleepStartTime().hashCode();
         }

         var2 = var1;
         if (this.hasSleepEndTime()) {
            var2 = (var1 * 37 + 2) * 53 + this.getSleepEndTime().hashCode();
         }

         var1 = var2;
         if (this.hasLastModified()) {
            var1 = (var2 * 37 + 3) * 53 + this.getLastModified().hashCode();
         }

         var2 = var1;
         if (this.hasSleepGoalMinutes()) {
            var2 = (var1 * 37 + 4) * 53 + this.getSleepGoalMinutes();
         }

         int var3 = var2;
         if (this.getSleepwakePhasesCount() > 0) {
            var3 = (var2 * 37 + 5) * 53 + this.getSleepwakePhasesList().hashCode();
         }

         var1 = var3;
         if (this.getSnoozeTimeCount() > 0) {
            var1 = (var3 * 37 + 6) * 53 + this.getSnoozeTimeList().hashCode();
         }

         var3 = var1;
         if (this.hasAlarmTime()) {
            var3 = (var1 * 37 + 7) * 53 + this.getAlarmTime().hashCode();
         }

         var2 = var3;
         if (this.hasSleepStartOffsetSeconds()) {
            var2 = (var3 * 37 + 8) * 53 + this.getSleepStartOffsetSeconds();
         }

         var1 = var2;
         if (this.hasSleepEndOffsetSeconds()) {
            var1 = (var2 * 37 + 9) * 53 + this.getSleepEndOffsetSeconds();
         }

         var2 = var1;
         if (this.hasUserSleepRating()) {
            var2 = (var1 * 37 + 10) * 53 + this.userSleepRating_;
         }

         var1 = var2;
         if (this.hasRecordingDevice()) {
            var1 = (var2 * 37 + 11) * 53 + this.getRecordingDevice().hashCode();
         }

         var2 = var1;
         if (this.hasBatteryRanOut()) {
            var2 = (var1 * 37 + 12) * 53 + Internal.hashBoolean(this.getBatteryRanOut());
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SleepanalysisResult.d().ensureFieldAccessorsInitialized(SleepanalysisResult$PbSleepAnalysisResult.class, SleepanalysisResult$PbSleepAnalysisResult$Builder.class);
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
            if (!this.hasSleepStartTime()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.hasSleepEndTime()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.hasLastModified()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.hasSleepGoalMinutes()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.getSleepStartTime().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.getSleepEndTime().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.getLastModified().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else {
               int var4 = 0;

               while(true) {
                  if (var4 >= this.getSleepwakePhasesCount()) {
                     for(var4 = 0; var4 < this.getSnoozeTimeCount(); ++var4) {
                        if (!this.getSnoozeTime(var4).isInitialized()) {
                           this.memoizedIsInitialized = (byte)0;
                           var3 = var1;
                           return var3;
                        }
                     }

                     if (this.hasAlarmTime() && !this.getAlarmTime().isInitialized()) {
                        this.memoizedIsInitialized = (byte)0;
                        var3 = var1;
                     } else if (this.hasRecordingDevice() && !this.getRecordingDevice().isInitialized()) {
                        this.memoizedIsInitialized = (byte)0;
                        var3 = var1;
                     } else {
                        this.memoizedIsInitialized = (byte)1;
                        var3 = true;
                     }
                     break;
                  }

                  if (!this.getSleepwakePhases(var4).isInitialized()) {
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

   public SleepanalysisResult$PbSleepAnalysisResult$Builder newBuilderForType() {
      return newBuilder();
   }

   protected SleepanalysisResult$PbSleepAnalysisResult$Builder newBuilderForType(BuilderParent var1) {
      return new SleepanalysisResult$PbSleepAnalysisResult$Builder(var1, (SleepanalysisResult$1)null);
   }

   public SleepanalysisResult$PbSleepAnalysisResult$Builder toBuilder() {
      SleepanalysisResult$PbSleepAnalysisResult$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new SleepanalysisResult$PbSleepAnalysisResult$Builder((SleepanalysisResult$1)null);
      } else {
         var1 = (new SleepanalysisResult$PbSleepAnalysisResult$Builder((SleepanalysisResult$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      byte var2 = 0;
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getSleepStartTime());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getSleepEndTime());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getLastModified());
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeUInt32(4, this.sleepGoalMinutes_);
      }

      int var3 = 0;

      while(true) {
         int var4 = var2;
         if (var3 >= this.sleepwakePhases_.size()) {
            while(var4 < this.snoozeTime_.size()) {
               var1.writeMessage(6, (MessageLite)this.snoozeTime_.get(var4));
               ++var4;
            }

            if ((this.bitField0_ & 16) == 16) {
               var1.writeMessage(7, this.getAlarmTime());
            }

            if ((this.bitField0_ & 32) == 32) {
               var1.writeInt32(8, this.sleepStartOffsetSeconds_);
            }

            if ((this.bitField0_ & 64) == 64) {
               var1.writeInt32(9, this.sleepEndOffsetSeconds_);
            }

            if ((this.bitField0_ & 128) == 128) {
               var1.writeEnum(10, this.userSleepRating_);
            }

            if ((this.bitField0_ & 256) == 256) {
               var1.writeMessage(11, this.getRecordingDevice());
            }

            if ((this.bitField0_ & 512) == 512) {
               var1.writeBool(12, this.batteryRanOut_);
            }

            this.unknownFields.writeTo(var1);
            return;
         }

         var1.writeMessage(5, (MessageLite)this.sleepwakePhases_.get(var3));
         ++var3;
      }
   }
}
