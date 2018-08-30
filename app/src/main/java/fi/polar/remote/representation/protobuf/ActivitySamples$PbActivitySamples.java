package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
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

public final class ActivitySamples$PbActivitySamples extends GeneratedMessageV3 implements ActivitySamples$PbActivitySamplesOrBuilder {
   public static final int ACTIVITY_INFO_FIELD_NUMBER = 7;
   private static final ActivitySamples$PbActivitySamples DEFAULT_INSTANCE = new ActivitySamples$PbActivitySamples();
   public static final int INACTIVITY_NON_WEAR_TRIGGER_FIELD_NUMBER = 9;
   public static final int INACTIVITY_TRIGGER_FIELD_NUMBER = 8;
   public static final int MET_RECORDING_INTERVAL_FIELD_NUMBER = 2;
   public static final int MET_SAMPLES_FIELD_NUMBER = 4;
   @Deprecated
   public static final Parser PARSER = new ActivitySamples$PbActivitySamples$1();
   public static final int SPORT_INFO_FIELD_NUMBER = 6;
   public static final int START_TIME_FIELD_NUMBER = 1;
   public static final int STEPS_RECORDING_INTERVAL_FIELD_NUMBER = 3;
   public static final int STEPS_SAMPLES_FIELD_NUMBER = 5;
   private static final long serialVersionUID = 0L;
   private List activityInfo_;
   private int bitField0_;
   private List inactivityNonWearTrigger_;
   private List inactivityTrigger_;
   private byte memoizedIsInitialized;
   private Types$PbDuration metRecordingInterval_;
   private List metSamples_;
   private List sportInfo_;
   private Types$PbLocalDateTime startTime_;
   private Types$PbDuration stepsRecordingInterval_;
   private int stepsSamplesMemoizedSerializedSize;
   private List stepsSamples_;

   private ActivitySamples$PbActivitySamples() {
      this.stepsSamplesMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = (byte)-1;
      this.metSamples_ = Collections.emptyList();
      this.stepsSamples_ = Collections.emptyList();
      this.sportInfo_ = Collections.emptyList();
      this.activityInfo_ = Collections.emptyList();
      this.inactivityTrigger_ = Collections.emptyList();
      this.inactivityNonWearTrigger_ = Collections.emptyList();
   }

   private ActivitySamples$PbActivitySamples(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ActivitySamples$PbActivitySamples(CodedInputStream var1, ExtensionRegistryLite var2, ActivitySamples$1 var3) {
      this(var1, var2);
   }

   private ActivitySamples$PbActivitySamples(Builder var1) {
      super(var1);
      this.stepsSamplesMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ActivitySamples$PbActivitySamples(Builder var1, ActivitySamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(ActivitySamples$PbActivitySamples var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration a(ActivitySamples$PbActivitySamples var0, Types$PbDuration var1) {
      var0.metRecordingInterval_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbLocalDateTime a(ActivitySamples$PbActivitySamples var0, Types$PbLocalDateTime var1) {
      var0.startTime_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List a(ActivitySamples$PbActivitySamples var0) {
      return var0.metSamples_;
   }

   // $FF: synthetic method
   static List a(ActivitySamples$PbActivitySamples var0, List var1) {
      var0.metSamples_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration b(ActivitySamples$PbActivitySamples var0, Types$PbDuration var1) {
      var0.stepsRecordingInterval_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List b(ActivitySamples$PbActivitySamples var0) {
      return var0.stepsSamples_;
   }

   // $FF: synthetic method
   static List b(ActivitySamples$PbActivitySamples var0, List var1) {
      var0.stepsSamples_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List c(ActivitySamples$PbActivitySamples var0) {
      return var0.sportInfo_;
   }

   // $FF: synthetic method
   static List c(ActivitySamples$PbActivitySamples var0, List var1) {
      var0.sportInfo_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean c() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List d(ActivitySamples$PbActivitySamples var0) {
      return var0.activityInfo_;
   }

   // $FF: synthetic method
   static List d(ActivitySamples$PbActivitySamples var0, List var1) {
      var0.activityInfo_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean d() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List e(ActivitySamples$PbActivitySamples var0) {
      return var0.inactivityTrigger_;
   }

   // $FF: synthetic method
   static List e(ActivitySamples$PbActivitySamples var0, List var1) {
      var0.inactivityTrigger_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean e() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static List f(ActivitySamples$PbActivitySamples var0) {
      return var0.inactivityNonWearTrigger_;
   }

   // $FF: synthetic method
   static List f(ActivitySamples$PbActivitySamples var0, List var1) {
      var0.inactivityNonWearTrigger_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean f() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static UnknownFieldSet g(ActivitySamples$PbActivitySamples var0) {
      return var0.unknownFields;
   }

   public static ActivitySamples$PbActivitySamples getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ActivitySamples.i();
   }

   public static ActivitySamples$PbActivitySamples$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ActivitySamples$PbActivitySamples$Builder newBuilder(ActivitySamples$PbActivitySamples var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ActivitySamples$PbActivitySamples parseDelimitedFrom(InputStream var0) {
      return (ActivitySamples$PbActivitySamples)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ActivitySamples$PbActivitySamples parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ActivitySamples$PbActivitySamples)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ActivitySamples$PbActivitySamples parseFrom(ByteString var0) {
      return (ActivitySamples$PbActivitySamples)PARSER.parseFrom(var0);
   }

   public static ActivitySamples$PbActivitySamples parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ActivitySamples$PbActivitySamples)PARSER.parseFrom(var0, var1);
   }

   public static ActivitySamples$PbActivitySamples parseFrom(CodedInputStream var0) {
      return (ActivitySamples$PbActivitySamples)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ActivitySamples$PbActivitySamples parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ActivitySamples$PbActivitySamples)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ActivitySamples$PbActivitySamples parseFrom(InputStream var0) {
      return (ActivitySamples$PbActivitySamples)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ActivitySamples$PbActivitySamples parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ActivitySamples$PbActivitySamples)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ActivitySamples$PbActivitySamples parseFrom(byte[] var0) {
      return (ActivitySamples$PbActivitySamples)PARSER.parseFrom(var0);
   }

   public static ActivitySamples$PbActivitySamples parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ActivitySamples$PbActivitySamples)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ActivitySamples$PbActivitySamples)) {
            var2 = super.equals(var1);
         } else {
            ActivitySamples$PbActivitySamples var5 = (ActivitySamples$PbActivitySamples)var1;
            boolean var3;
            if (this.hasStartTime() == var5.hasStartTime()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasStartTime()) {
               if (var3 && this.getStartTime().equals(var5.getStartTime())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasMetRecordingInterval() == var5.hasMetRecordingInterval()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasMetRecordingInterval()) {
               if (var4 && this.getMetRecordingInterval().equals(var5.getMetRecordingInterval())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasStepsRecordingInterval() == var5.hasStepsRecordingInterval()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasStepsRecordingInterval()) {
               if (var3 && this.getStepsRecordingInterval().equals(var5.getStepsRecordingInterval())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.getMetSamplesList().equals(var5.getMetSamplesList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getStepsSamplesList().equals(var5.getStepsSamplesList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getSportInfoList().equals(var5.getSportInfoList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getActivityInfoList().equals(var5.getActivityInfoList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getInactivityTriggerList().equals(var5.getInactivityTriggerList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getInactivityNonWearTriggerList().equals(var5.getInactivityNonWearTriggerList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (!var3 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public ActivitySamples$PbActivityInfo getActivityInfo(int var1) {
      return (ActivitySamples$PbActivityInfo)this.activityInfo_.get(var1);
   }

   public int getActivityInfoCount() {
      return this.activityInfo_.size();
   }

   public List getActivityInfoList() {
      return this.activityInfo_;
   }

   public ActivitySamples$PbActivityInfoOrBuilder getActivityInfoOrBuilder(int var1) {
      return (ActivitySamples$PbActivityInfoOrBuilder)this.activityInfo_.get(var1);
   }

   public List getActivityInfoOrBuilderList() {
      return this.activityInfo_;
   }

   public ActivitySamples$PbActivitySamples getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo getInactivityNonWearTrigger(int var1) {
      return (ActivitySamples$PbInActivityNonWearTriggerInfo)this.inactivityNonWearTrigger_.get(var1);
   }

   public int getInactivityNonWearTriggerCount() {
      return this.inactivityNonWearTrigger_.size();
   }

   public List getInactivityNonWearTriggerList() {
      return this.inactivityNonWearTrigger_;
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfoOrBuilder getInactivityNonWearTriggerOrBuilder(int var1) {
      return (ActivitySamples$PbInActivityNonWearTriggerInfoOrBuilder)this.inactivityNonWearTrigger_.get(var1);
   }

   public List getInactivityNonWearTriggerOrBuilderList() {
      return this.inactivityNonWearTrigger_;
   }

   public ActivitySamples$PbInActivityTriggerInfo getInactivityTrigger(int var1) {
      return (ActivitySamples$PbInActivityTriggerInfo)this.inactivityTrigger_.get(var1);
   }

   public int getInactivityTriggerCount() {
      return this.inactivityTrigger_.size();
   }

   public List getInactivityTriggerList() {
      return this.inactivityTrigger_;
   }

   public ActivitySamples$PbInActivityTriggerInfoOrBuilder getInactivityTriggerOrBuilder(int var1) {
      return (ActivitySamples$PbInActivityTriggerInfoOrBuilder)this.inactivityTrigger_.get(var1);
   }

   public List getInactivityTriggerOrBuilderList() {
      return this.inactivityTrigger_;
   }

   public Types$PbDuration getMetRecordingInterval() {
      Types$PbDuration var1;
      if (this.metRecordingInterval_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.metRecordingInterval_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getMetRecordingIntervalOrBuilder() {
      Types$PbDuration var1;
      if (this.metRecordingInterval_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.metRecordingInterval_;
      }

      return var1;
   }

   public float getMetSamples(int var1) {
      return (Float)this.metSamples_.get(var1);
   }

   public int getMetSamplesCount() {
      return this.metSamples_.size();
   }

   public List getMetSamplesList() {
      return this.metSamples_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      byte var1 = 0;
      int var2 = this.memoizedSize;
      if (var2 == -1) {
         int var3;
         if ((this.bitField0_ & 1) == 1) {
            var3 = CodedOutputStream.computeMessageSize(1, this.getStartTime()) + 0;
         } else {
            var3 = 0;
         }

         var2 = var3;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var3 + CodedOutputStream.computeMessageSize(2, this.getMetRecordingInterval());
         }

         var3 = var2;
         if ((this.bitField0_ & 4) == 4) {
            var3 = var2 + CodedOutputStream.computeMessageSize(3, this.getStepsRecordingInterval());
         }

         int var4 = this.getMetSamplesList().size();
         int var5 = this.getMetSamplesList().size();
         var2 = 0;

         int var6;
         for(var6 = 0; var2 < this.stepsSamples_.size(); ++var2) {
            var6 += CodedOutputStream.computeUInt32SizeNoTag((Integer)this.stepsSamples_.get(var2));
         }

         var3 = var3 + var4 * 4 + var5 * 1 + var6;
         var2 = var3;
         if (!this.getStepsSamplesList().isEmpty()) {
            var2 = var3 + 1 + CodedOutputStream.computeInt32SizeNoTag(var6);
         }

         this.stepsSamplesMemoizedSerializedSize = var6;

         for(var3 = 0; var3 < this.sportInfo_.size(); ++var3) {
            var2 += CodedOutputStream.computeMessageSize(6, (MessageLite)this.sportInfo_.get(var3));
         }

         for(var3 = 0; var3 < this.activityInfo_.size(); ++var3) {
            var2 += CodedOutputStream.computeMessageSize(7, (MessageLite)this.activityInfo_.get(var3));
         }

         var3 = 0;

         while(true) {
            var6 = var1;
            var4 = var2;
            if (var3 >= this.inactivityTrigger_.size()) {
               while(var6 < this.inactivityNonWearTrigger_.size()) {
                  var4 += CodedOutputStream.computeMessageSize(9, (MessageLite)this.inactivityNonWearTrigger_.get(var6));
                  ++var6;
               }

               var2 = this.unknownFields.getSerializedSize() + var4;
               this.memoizedSize = var2;
               break;
            }

            var2 += CodedOutputStream.computeMessageSize(8, (MessageLite)this.inactivityTrigger_.get(var3));
            ++var3;
         }
      }

      return var2;
   }

   public ActivitySamples$PbSportInfo getSportInfo(int var1) {
      return (ActivitySamples$PbSportInfo)this.sportInfo_.get(var1);
   }

   public int getSportInfoCount() {
      return this.sportInfo_.size();
   }

   public List getSportInfoList() {
      return this.sportInfo_;
   }

   public ActivitySamples$PbSportInfoOrBuilder getSportInfoOrBuilder(int var1) {
      return (ActivitySamples$PbSportInfoOrBuilder)this.sportInfo_.get(var1);
   }

   public List getSportInfoOrBuilderList() {
      return this.sportInfo_;
   }

   public Types$PbLocalDateTime getStartTime() {
      Types$PbLocalDateTime var1;
      if (this.startTime_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.startTime_;
      }

      return var1;
   }

   public Types$PbLocalDateTimeOrBuilder getStartTimeOrBuilder() {
      Types$PbLocalDateTime var1;
      if (this.startTime_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.startTime_;
      }

      return var1;
   }

   public Types$PbDuration getStepsRecordingInterval() {
      Types$PbDuration var1;
      if (this.stepsRecordingInterval_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.stepsRecordingInterval_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getStepsRecordingIntervalOrBuilder() {
      Types$PbDuration var1;
      if (this.stepsRecordingInterval_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.stepsRecordingInterval_;
      }

      return var1;
   }

   public int getStepsSamples(int var1) {
      return (Integer)this.stepsSamples_.get(var1);
   }

   public int getStepsSamplesCount() {
      return this.stepsSamples_.size();
   }

   public List getStepsSamplesList() {
      return this.stepsSamples_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
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

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.hasStartTime()) {
            var1 = (var2 * 37 + 1) * 53 + this.getStartTime().hashCode();
         }

         var2 = var1;
         if (this.hasMetRecordingInterval()) {
            var2 = (var1 * 37 + 2) * 53 + this.getMetRecordingInterval().hashCode();
         }

         var1 = var2;
         if (this.hasStepsRecordingInterval()) {
            var1 = (var2 * 37 + 3) * 53 + this.getStepsRecordingInterval().hashCode();
         }

         int var3 = var1;
         if (this.getMetSamplesCount() > 0) {
            var3 = (var1 * 37 + 4) * 53 + this.getMetSamplesList().hashCode();
         }

         var2 = var3;
         if (this.getStepsSamplesCount() > 0) {
            var2 = (var3 * 37 + 5) * 53 + this.getStepsSamplesList().hashCode();
         }

         var1 = var2;
         if (this.getSportInfoCount() > 0) {
            var1 = (var2 * 37 + 6) * 53 + this.getSportInfoList().hashCode();
         }

         var2 = var1;
         if (this.getActivityInfoCount() > 0) {
            var2 = (var1 * 37 + 7) * 53 + this.getActivityInfoList().hashCode();
         }

         var1 = var2;
         if (this.getInactivityTriggerCount() > 0) {
            var1 = (var2 * 37 + 8) * 53 + this.getInactivityTriggerList().hashCode();
         }

         var2 = var1;
         if (this.getInactivityNonWearTriggerCount() > 0) {
            var2 = (var1 * 37 + 9) * 53 + this.getInactivityNonWearTriggerList().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ActivitySamples.j().ensureFieldAccessorsInitialized(ActivitySamples$PbActivitySamples.class, ActivitySamples$PbActivitySamples$Builder.class);
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
            if (!this.hasStartTime()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.hasMetRecordingInterval()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.hasStepsRecordingInterval()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.getStartTime().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else {
               int var4 = 0;

               while(true) {
                  if (var4 >= this.getSportInfoCount()) {
                     for(var4 = 0; var4 < this.getActivityInfoCount(); ++var4) {
                        if (!this.getActivityInfo(var4).isInitialized()) {
                           this.memoizedIsInitialized = (byte)0;
                           var3 = var1;
                           return var3;
                        }
                     }

                     for(var4 = 0; var4 < this.getInactivityTriggerCount(); ++var4) {
                        if (!this.getInactivityTrigger(var4).isInitialized()) {
                           this.memoizedIsInitialized = (byte)0;
                           var3 = var1;
                           return var3;
                        }
                     }

                     for(var4 = 0; var4 < this.getInactivityNonWearTriggerCount(); ++var4) {
                        if (!this.getInactivityNonWearTrigger(var4).isInitialized()) {
                           this.memoizedIsInitialized = (byte)0;
                           var3 = var1;
                           return var3;
                        }
                     }

                     this.memoizedIsInitialized = (byte)1;
                     var3 = true;
                     break;
                  }

                  if (!this.getSportInfo(var4).isInitialized()) {
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

   public ActivitySamples$PbActivitySamples$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ActivitySamples$PbActivitySamples$Builder newBuilderForType(BuilderParent var1) {
      return new ActivitySamples$PbActivitySamples$Builder(var1, (ActivitySamples$1)null);
   }

   public ActivitySamples$PbActivitySamples$Builder toBuilder() {
      ActivitySamples$PbActivitySamples$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ActivitySamples$PbActivitySamples$Builder((ActivitySamples$1)null);
      } else {
         var1 = (new ActivitySamples$PbActivitySamples$Builder((ActivitySamples$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      byte var2 = 0;
      this.getSerializedSize();
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getStartTime());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getMetRecordingInterval());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getStepsRecordingInterval());
      }

      int var3;
      for(var3 = 0; var3 < this.metSamples_.size(); ++var3) {
         var1.writeFloat(4, (Float)this.metSamples_.get(var3));
      }

      if (this.getStepsSamplesList().size() > 0) {
         var1.writeUInt32NoTag(42);
         var1.writeUInt32NoTag(this.stepsSamplesMemoizedSerializedSize);
      }

      for(var3 = 0; var3 < this.stepsSamples_.size(); ++var3) {
         var1.writeUInt32NoTag((Integer)this.stepsSamples_.get(var3));
      }

      for(var3 = 0; var3 < this.sportInfo_.size(); ++var3) {
         var1.writeMessage(6, (MessageLite)this.sportInfo_.get(var3));
      }

      for(var3 = 0; var3 < this.activityInfo_.size(); ++var3) {
         var1.writeMessage(7, (MessageLite)this.activityInfo_.get(var3));
      }

      var3 = 0;

      while(true) {
         int var4 = var2;
         if (var3 >= this.inactivityTrigger_.size()) {
            while(var4 < this.inactivityNonWearTrigger_.size()) {
               var1.writeMessage(9, (MessageLite)this.inactivityNonWearTrigger_.get(var4));
               ++var4;
            }

            this.unknownFields.writeTo(var1);
            return;
         }

         var1.writeMessage(8, (MessageLite)this.inactivityTrigger_.get(var3));
         ++var3;
      }
   }
}
