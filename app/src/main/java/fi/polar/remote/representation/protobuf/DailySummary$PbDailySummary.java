package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.InputStream;

public final class DailySummary$PbDailySummary extends GeneratedMessageV3 implements DailySummary$PbDailySummaryOrBuilder {
   public static final int ACTIVITY_CALORIES_FIELD_NUMBER = 3;
   public static final int ACTIVITY_CLASS_TIMES_FIELD_NUMBER = 7;
   public static final int ACTIVITY_DISTANCE_FIELD_NUMBER = 8;
   public static final int ACTIVITY_GOAL_SUMMARY_FIELD_NUMBER = 6;
   public static final int BMR_CALORIES_FIELD_NUMBER = 5;
   public static final int DATE_FIELD_NUMBER = 1;
   private static final DailySummary$PbDailySummary DEFAULT_INSTANCE = new DailySummary$PbDailySummary();
   @Deprecated
   public static final Parser PARSER = new DailySummary$PbDailySummary$1();
   public static final int STEPS_FIELD_NUMBER = 2;
   public static final int TRAINING_CALORIES_FIELD_NUMBER = 4;
   private static final long serialVersionUID = 0L;
   private int activityCalories_;
   private DailySummary$PbActivityClassTimes activityClassTimes_;
   private float activityDistance_;
   private DailySummary$PbActivityGoalSummary activityGoalSummary_;
   private int bitField0_;
   private int bmrCalories_;
   private Types$PbDate date_;
   private byte memoizedIsInitialized;
   private int steps_;
   private int trainingCalories_;

   private DailySummary$PbDailySummary() {
      this.memoizedIsInitialized = (byte)-1;
      this.steps_ = 0;
      this.activityCalories_ = 0;
      this.trainingCalories_ = 0;
      this.bmrCalories_ = 0;
      this.activityDistance_ = 0.0F;
   }

   private DailySummary$PbDailySummary(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   DailySummary$PbDailySummary(CodedInputStream var1, ExtensionRegistryLite var2, DailySummary$1 var3) {
      this(var1, var2);
   }

   private DailySummary$PbDailySummary(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   DailySummary$PbDailySummary(Builder var1, DailySummary$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(DailySummary$PbDailySummary var0, float var1) {
      var0.activityDistance_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(DailySummary$PbDailySummary var0, int var1) {
      var0.steps_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(DailySummary$PbDailySummary var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static DailySummary$PbActivityClassTimes a(DailySummary$PbDailySummary var0, DailySummary$PbActivityClassTimes var1) {
      var0.activityClassTimes_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static DailySummary$PbActivityGoalSummary a(DailySummary$PbDailySummary var0, DailySummary$PbActivityGoalSummary var1) {
      var0.activityGoalSummary_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDate a(DailySummary$PbDailySummary var0, Types$PbDate var1) {
      var0.date_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(DailySummary$PbDailySummary var0, int var1) {
      var0.activityCalories_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(DailySummary$PbDailySummary var0, int var1) {
      var0.trainingCalories_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int d(DailySummary$PbDailySummary var0, int var1) {
      var0.bmrCalories_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int e(DailySummary$PbDailySummary var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static DailySummary$PbDailySummary getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return DailySummary.e();
   }

   public static DailySummary$PbDailySummary$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DailySummary$PbDailySummary$Builder newBuilder(DailySummary$PbDailySummary var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static DailySummary$PbDailySummary parseDelimitedFrom(InputStream var0) {
      return (DailySummary$PbDailySummary)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DailySummary$PbDailySummary parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (DailySummary$PbDailySummary)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DailySummary$PbDailySummary parseFrom(ByteString var0) {
      return (DailySummary$PbDailySummary)PARSER.parseFrom(var0);
   }

   public static DailySummary$PbDailySummary parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (DailySummary$PbDailySummary)PARSER.parseFrom(var0, var1);
   }

   public static DailySummary$PbDailySummary parseFrom(CodedInputStream var0) {
      return (DailySummary$PbDailySummary)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DailySummary$PbDailySummary parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (DailySummary$PbDailySummary)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DailySummary$PbDailySummary parseFrom(InputStream var0) {
      return (DailySummary$PbDailySummary)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DailySummary$PbDailySummary parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (DailySummary$PbDailySummary)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DailySummary$PbDailySummary parseFrom(byte[] var0) {
      return (DailySummary$PbDailySummary)PARSER.parseFrom(var0);
   }

   public static DailySummary$PbDailySummary parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (DailySummary$PbDailySummary)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof DailySummary$PbDailySummary)) {
            var2 = super.equals(var1);
         } else {
            DailySummary$PbDailySummary var5 = (DailySummary$PbDailySummary)var1;
            boolean var3;
            if (this.hasDate() == var5.hasDate()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasDate()) {
               if (var3 && this.getDate().equals(var5.getDate())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSteps() == var5.hasSteps()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSteps()) {
               if (var3 && this.getSteps() == var5.getSteps()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasActivityCalories() == var5.hasActivityCalories()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasActivityCalories()) {
               if (var3 && this.getActivityCalories() == var5.getActivityCalories()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTrainingCalories() == var5.hasTrainingCalories()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasTrainingCalories()) {
               if (var4 && this.getTrainingCalories() == var5.getTrainingCalories()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasBmrCalories() == var5.hasBmrCalories()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasBmrCalories()) {
               if (var4 && this.getBmrCalories() == var5.getBmrCalories()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasActivityGoalSummary() == var5.hasActivityGoalSummary()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasActivityGoalSummary()) {
               if (var3 && this.getActivityGoalSummary().equals(var5.getActivityGoalSummary())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasActivityClassTimes() == var5.hasActivityClassTimes()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasActivityClassTimes()) {
               if (var4 && this.getActivityClassTimes().equals(var5.getActivityClassTimes())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasActivityDistance() == var5.hasActivityDistance()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasActivityDistance()) {
               if (var3 && Float.floatToIntBits(this.getActivityDistance()) == Float.floatToIntBits(var5.getActivityDistance())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (!var4 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public int getActivityCalories() {
      return this.activityCalories_;
   }

   public DailySummary$PbActivityClassTimes getActivityClassTimes() {
      DailySummary$PbActivityClassTimes var1;
      if (this.activityClassTimes_ == null) {
         var1 = DailySummary$PbActivityClassTimes.getDefaultInstance();
      } else {
         var1 = this.activityClassTimes_;
      }

      return var1;
   }

   public DailySummary$PbActivityClassTimesOrBuilder getActivityClassTimesOrBuilder() {
      DailySummary$PbActivityClassTimes var1;
      if (this.activityClassTimes_ == null) {
         var1 = DailySummary$PbActivityClassTimes.getDefaultInstance();
      } else {
         var1 = this.activityClassTimes_;
      }

      return var1;
   }

   public float getActivityDistance() {
      return this.activityDistance_;
   }

   public DailySummary$PbActivityGoalSummary getActivityGoalSummary() {
      DailySummary$PbActivityGoalSummary var1;
      if (this.activityGoalSummary_ == null) {
         var1 = DailySummary$PbActivityGoalSummary.getDefaultInstance();
      } else {
         var1 = this.activityGoalSummary_;
      }

      return var1;
   }

   public DailySummary$PbActivityGoalSummaryOrBuilder getActivityGoalSummaryOrBuilder() {
      DailySummary$PbActivityGoalSummary var1;
      if (this.activityGoalSummary_ == null) {
         var1 = DailySummary$PbActivityGoalSummary.getDefaultInstance();
      } else {
         var1 = this.activityGoalSummary_;
      }

      return var1;
   }

   public int getBmrCalories() {
      return this.bmrCalories_;
   }

   public Types$PbDate getDate() {
      Types$PbDate var1;
      if (this.date_ == null) {
         var1 = Types$PbDate.getDefaultInstance();
      } else {
         var1 = this.date_;
      }

      return var1;
   }

   public Types$PbDateOrBuilder getDateOrBuilder() {
      Types$PbDate var1;
      if (this.date_ == null) {
         var1 = Types$PbDate.getDefaultInstance();
      } else {
         var1 = this.date_;
      }

      return var1;
   }

   public DailySummary$PbDailySummary getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeMessageSize(1, this.getDate());
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeUInt32Size(2, this.steps_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(3, this.activityCalories_);
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeUInt32Size(4, this.trainingCalories_);
         }

         var2 = var1;
         if ((this.bitField0_ & 16) == 16) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(5, this.bmrCalories_);
         }

         int var3 = var2;
         if ((this.bitField0_ & 32) == 32) {
            var3 = var2 + CodedOutputStream.computeMessageSize(6, this.getActivityGoalSummary());
         }

         var1 = var3;
         if ((this.bitField0_ & 64) == 64) {
            var1 = var3 + CodedOutputStream.computeMessageSize(7, this.getActivityClassTimes());
         }

         var2 = var1;
         if ((this.bitField0_ & 128) == 128) {
            var2 = var1 + CodedOutputStream.computeFloatSize(8, this.activityDistance_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public int getSteps() {
      return this.steps_;
   }

   public int getTrainingCalories() {
      return this.trainingCalories_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasActivityCalories() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasActivityClassTimes() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasActivityDistance() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasActivityGoalSummary() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasBmrCalories() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDate() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSteps() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTrainingCalories() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
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
         if (this.hasDate()) {
            var1 = (var2 * 37 + 1) * 53 + this.getDate().hashCode();
         }

         var2 = var1;
         if (this.hasSteps()) {
            var2 = (var1 * 37 + 2) * 53 + this.getSteps();
         }

         var1 = var2;
         if (this.hasActivityCalories()) {
            var1 = (var2 * 37 + 3) * 53 + this.getActivityCalories();
         }

         int var3 = var1;
         if (this.hasTrainingCalories()) {
            var3 = (var1 * 37 + 4) * 53 + this.getTrainingCalories();
         }

         var2 = var3;
         if (this.hasBmrCalories()) {
            var2 = (var3 * 37 + 5) * 53 + this.getBmrCalories();
         }

         var1 = var2;
         if (this.hasActivityGoalSummary()) {
            var1 = (var2 * 37 + 6) * 53 + this.getActivityGoalSummary().hashCode();
         }

         var2 = var1;
         if (this.hasActivityClassTimes()) {
            var2 = (var1 * 37 + 7) * 53 + this.getActivityClassTimes().hashCode();
         }

         var1 = var2;
         if (this.hasActivityDistance()) {
            var1 = (var2 * 37 + 8) * 53 + Float.floatToIntBits(this.getActivityDistance());
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return DailySummary.f().ensureFieldAccessorsInitialized(DailySummary$PbDailySummary.class, DailySummary$PbDailySummary$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasDate()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getDate().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasActivityGoalSummary() && !this.getActivityGoalSummary().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasActivityClassTimes() && !this.getActivityClassTimes().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public DailySummary$PbDailySummary$Builder newBuilderForType() {
      return newBuilder();
   }

   protected DailySummary$PbDailySummary$Builder newBuilderForType(BuilderParent var1) {
      return new DailySummary$PbDailySummary$Builder(var1, (DailySummary$1)null);
   }

   public DailySummary$PbDailySummary$Builder toBuilder() {
      DailySummary$PbDailySummary$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new DailySummary$PbDailySummary$Builder((DailySummary$1)null);
      } else {
         var1 = (new DailySummary$PbDailySummary$Builder((DailySummary$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getDate());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeUInt32(2, this.steps_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeUInt32(3, this.activityCalories_);
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeUInt32(4, this.trainingCalories_);
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeUInt32(5, this.bmrCalories_);
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeMessage(6, this.getActivityGoalSummary());
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeMessage(7, this.getActivityClassTimes());
      }

      if ((this.bitField0_ & 128) == 128) {
         var1.writeFloat(8, this.activityDistance_);
      }

      this.unknownFields.writeTo(var1);
   }
}
