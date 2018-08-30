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

public final class DailySummary$PbDailySummary$Builder extends Builder implements DailySummary$PbDailySummaryOrBuilder {
   private int activityCalories_;
   private SingleFieldBuilderV3 activityClassTimesBuilder_;
   private DailySummary$PbActivityClassTimes activityClassTimes_;
   private float activityDistance_;
   private SingleFieldBuilderV3 activityGoalSummaryBuilder_;
   private DailySummary$PbActivityGoalSummary activityGoalSummary_;
   private int bitField0_;
   private int bmrCalories_;
   private SingleFieldBuilderV3 dateBuilder_;
   private Types$PbDate date_;
   private int steps_;
   private int trainingCalories_;

   private DailySummary$PbDailySummary$Builder() {
      this.date_ = null;
      this.activityGoalSummary_ = null;
      this.activityClassTimes_ = null;
      this.maybeForceBuilderInitialization();
   }

   private DailySummary$PbDailySummary$Builder(BuilderParent var1) {
      super(var1);
      this.date_ = null;
      this.activityGoalSummary_ = null;
      this.activityClassTimes_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   DailySummary$PbDailySummary$Builder(BuilderParent var1, DailySummary$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   DailySummary$PbDailySummary$Builder(DailySummary$1 var1) {
      this();
   }

   private SingleFieldBuilderV3 getActivityClassTimesFieldBuilder() {
      if (this.activityClassTimesBuilder_ == null) {
         this.activityClassTimesBuilder_ = new SingleFieldBuilderV3(this.getActivityClassTimes(), this.getParentForChildren(), this.isClean());
         this.activityClassTimes_ = null;
      }

      return this.activityClassTimesBuilder_;
   }

   private SingleFieldBuilderV3 getActivityGoalSummaryFieldBuilder() {
      if (this.activityGoalSummaryBuilder_ == null) {
         this.activityGoalSummaryBuilder_ = new SingleFieldBuilderV3(this.getActivityGoalSummary(), this.getParentForChildren(), this.isClean());
         this.activityGoalSummary_ = null;
      }

      return this.activityGoalSummaryBuilder_;
   }

   private SingleFieldBuilderV3 getDateFieldBuilder() {
      if (this.dateBuilder_ == null) {
         this.dateBuilder_ = new SingleFieldBuilderV3(this.getDate(), this.getParentForChildren(), this.isClean());
         this.date_ = null;
      }

      return this.dateBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return DailySummary.e();
   }

   private void maybeForceBuilderInitialization() {
      if (DailySummary$PbDailySummary.b()) {
         this.getDateFieldBuilder();
         this.getActivityGoalSummaryFieldBuilder();
         this.getActivityClassTimesFieldBuilder();
      }

   }

   public DailySummary$PbDailySummary$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (DailySummary$PbDailySummary$Builder)super.addRepeatedField(var1, var2);
   }

   public DailySummary$PbDailySummary build() {
      DailySummary$PbDailySummary var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public DailySummary$PbDailySummary buildPartial() {
      DailySummary$PbDailySummary var1 = new DailySummary$PbDailySummary(this, (DailySummary$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.dateBuilder_ == null) {
         DailySummary$PbDailySummary.a(var1, this.date_);
      } else {
         DailySummary$PbDailySummary.a(var1, (Types$PbDate)this.dateBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      DailySummary$PbDailySummary.a(var1, this.steps_);
      int var6 = var4;
      if ((var2 & 4) == 4) {
         var6 = var4 | 4;
      }

      DailySummary$PbDailySummary.b(var1, this.activityCalories_);
      int var5 = var6;
      if ((var2 & 8) == 8) {
         var5 = var6 | 8;
      }

      DailySummary$PbDailySummary.c(var1, this.trainingCalories_);
      var4 = var5;
      if ((var2 & 16) == 16) {
         var4 = var5 | 16;
      }

      DailySummary$PbDailySummary.d(var1, this.bmrCalories_);
      var6 = var4;
      if ((var2 & 32) == 32) {
         var6 = var4 | 32;
      }

      if (this.activityGoalSummaryBuilder_ == null) {
         DailySummary$PbDailySummary.a(var1, this.activityGoalSummary_);
      } else {
         DailySummary$PbDailySummary.a(var1, (DailySummary$PbActivityGoalSummary)this.activityGoalSummaryBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 64) == 64) {
         var4 = var6 | 64;
      }

      if (this.activityClassTimesBuilder_ == null) {
         DailySummary$PbDailySummary.a(var1, this.activityClassTimes_);
      } else {
         DailySummary$PbDailySummary.a(var1, (DailySummary$PbActivityClassTimes)this.activityClassTimesBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 128) == 128) {
         var6 = var4 | 128;
      }

      DailySummary$PbDailySummary.a(var1, this.activityDistance_);
      DailySummary$PbDailySummary.e(var1, var6);
      this.onBuilt();
      return var1;
   }

   public DailySummary$PbDailySummary$Builder clear() {
      super.clear();
      if (this.dateBuilder_ == null) {
         this.date_ = null;
      } else {
         this.dateBuilder_.clear();
      }

      this.bitField0_ &= -2;
      this.steps_ = 0;
      this.bitField0_ &= -3;
      this.activityCalories_ = 0;
      this.bitField0_ &= -5;
      this.trainingCalories_ = 0;
      this.bitField0_ &= -9;
      this.bmrCalories_ = 0;
      this.bitField0_ &= -17;
      if (this.activityGoalSummaryBuilder_ == null) {
         this.activityGoalSummary_ = null;
      } else {
         this.activityGoalSummaryBuilder_.clear();
      }

      this.bitField0_ &= -33;
      if (this.activityClassTimesBuilder_ == null) {
         this.activityClassTimes_ = null;
      } else {
         this.activityClassTimesBuilder_.clear();
      }

      this.bitField0_ &= -65;
      this.activityDistance_ = 0.0F;
      this.bitField0_ &= -129;
      return this;
   }

   public DailySummary$PbDailySummary$Builder clearActivityCalories() {
      this.bitField0_ &= -5;
      this.activityCalories_ = 0;
      this.onChanged();
      return this;
   }

   public DailySummary$PbDailySummary$Builder clearActivityClassTimes() {
      if (this.activityClassTimesBuilder_ == null) {
         this.activityClassTimes_ = null;
         this.onChanged();
      } else {
         this.activityClassTimesBuilder_.clear();
      }

      this.bitField0_ &= -65;
      return this;
   }

   public DailySummary$PbDailySummary$Builder clearActivityDistance() {
      this.bitField0_ &= -129;
      this.activityDistance_ = 0.0F;
      this.onChanged();
      return this;
   }

   public DailySummary$PbDailySummary$Builder clearActivityGoalSummary() {
      if (this.activityGoalSummaryBuilder_ == null) {
         this.activityGoalSummary_ = null;
         this.onChanged();
      } else {
         this.activityGoalSummaryBuilder_.clear();
      }

      this.bitField0_ &= -33;
      return this;
   }

   public DailySummary$PbDailySummary$Builder clearBmrCalories() {
      this.bitField0_ &= -17;
      this.bmrCalories_ = 0;
      this.onChanged();
      return this;
   }

   public DailySummary$PbDailySummary$Builder clearDate() {
      if (this.dateBuilder_ == null) {
         this.date_ = null;
         this.onChanged();
      } else {
         this.dateBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public DailySummary$PbDailySummary$Builder clearField(FieldDescriptor var1) {
      return (DailySummary$PbDailySummary$Builder)super.clearField(var1);
   }

   public DailySummary$PbDailySummary$Builder clearOneof(OneofDescriptor var1) {
      return (DailySummary$PbDailySummary$Builder)super.clearOneof(var1);
   }

   public DailySummary$PbDailySummary$Builder clearSteps() {
      this.bitField0_ &= -3;
      this.steps_ = 0;
      this.onChanged();
      return this;
   }

   public DailySummary$PbDailySummary$Builder clearTrainingCalories() {
      this.bitField0_ &= -9;
      this.trainingCalories_ = 0;
      this.onChanged();
      return this;
   }

   public DailySummary$PbDailySummary$Builder clone() {
      return (DailySummary$PbDailySummary$Builder)super.clone();
   }

   public int getActivityCalories() {
      return this.activityCalories_;
   }

   public DailySummary$PbActivityClassTimes getActivityClassTimes() {
      DailySummary$PbActivityClassTimes var1;
      if (this.activityClassTimesBuilder_ == null) {
         if (this.activityClassTimes_ == null) {
            var1 = DailySummary$PbActivityClassTimes.getDefaultInstance();
         } else {
            var1 = this.activityClassTimes_;
         }
      } else {
         var1 = (DailySummary$PbActivityClassTimes)this.activityClassTimesBuilder_.getMessage();
      }

      return var1;
   }

   public DailySummary$PbActivityClassTimes$Builder getActivityClassTimesBuilder() {
      this.bitField0_ |= 64;
      this.onChanged();
      return (DailySummary$PbActivityClassTimes$Builder)this.getActivityClassTimesFieldBuilder().getBuilder();
   }

   public DailySummary$PbActivityClassTimesOrBuilder getActivityClassTimesOrBuilder() {
      Object var1;
      if (this.activityClassTimesBuilder_ != null) {
         var1 = (DailySummary$PbActivityClassTimesOrBuilder)this.activityClassTimesBuilder_.getMessageOrBuilder();
      } else if (this.activityClassTimes_ == null) {
         var1 = DailySummary$PbActivityClassTimes.getDefaultInstance();
      } else {
         var1 = this.activityClassTimes_;
      }

      return (DailySummary$PbActivityClassTimesOrBuilder)var1;
   }

   public float getActivityDistance() {
      return this.activityDistance_;
   }

   public DailySummary$PbActivityGoalSummary getActivityGoalSummary() {
      DailySummary$PbActivityGoalSummary var1;
      if (this.activityGoalSummaryBuilder_ == null) {
         if (this.activityGoalSummary_ == null) {
            var1 = DailySummary$PbActivityGoalSummary.getDefaultInstance();
         } else {
            var1 = this.activityGoalSummary_;
         }
      } else {
         var1 = (DailySummary$PbActivityGoalSummary)this.activityGoalSummaryBuilder_.getMessage();
      }

      return var1;
   }

   public DailySummary$PbActivityGoalSummary$Builder getActivityGoalSummaryBuilder() {
      this.bitField0_ |= 32;
      this.onChanged();
      return (DailySummary$PbActivityGoalSummary$Builder)this.getActivityGoalSummaryFieldBuilder().getBuilder();
   }

   public DailySummary$PbActivityGoalSummaryOrBuilder getActivityGoalSummaryOrBuilder() {
      Object var1;
      if (this.activityGoalSummaryBuilder_ != null) {
         var1 = (DailySummary$PbActivityGoalSummaryOrBuilder)this.activityGoalSummaryBuilder_.getMessageOrBuilder();
      } else if (this.activityGoalSummary_ == null) {
         var1 = DailySummary$PbActivityGoalSummary.getDefaultInstance();
      } else {
         var1 = this.activityGoalSummary_;
      }

      return (DailySummary$PbActivityGoalSummaryOrBuilder)var1;
   }

   public int getBmrCalories() {
      return this.bmrCalories_;
   }

   public Types$PbDate getDate() {
      Types$PbDate var1;
      if (this.dateBuilder_ == null) {
         if (this.date_ == null) {
            var1 = Types$PbDate.getDefaultInstance();
         } else {
            var1 = this.date_;
         }
      } else {
         var1 = (Types$PbDate)this.dateBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDate$Builder getDateBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Types$PbDate$Builder)this.getDateFieldBuilder().getBuilder();
   }

   public Types$PbDateOrBuilder getDateOrBuilder() {
      Object var1;
      if (this.dateBuilder_ != null) {
         var1 = (Types$PbDateOrBuilder)this.dateBuilder_.getMessageOrBuilder();
      } else if (this.date_ == null) {
         var1 = Types$PbDate.getDefaultInstance();
      } else {
         var1 = this.date_;
      }

      return (Types$PbDateOrBuilder)var1;
   }

   public DailySummary$PbDailySummary getDefaultInstanceForType() {
      return DailySummary$PbDailySummary.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return DailySummary.e();
   }

   public int getSteps() {
      return this.steps_;
   }

   public int getTrainingCalories() {
      return this.trainingCalories_;
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

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return DailySummary.f().ensureFieldAccessorsInitialized(DailySummary$PbDailySummary.class, DailySummary$PbDailySummary$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasDate()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.getDate().isInitialized()) {
            if (this.hasActivityGoalSummary()) {
               var2 = var1;
               if (!this.getActivityGoalSummary().isInitialized()) {
                  return var2;
               }
            }

            if (this.hasActivityClassTimes()) {
               var2 = var1;
               if (!this.getActivityClassTimes().isInitialized()) {
                  return var2;
               }
            }

            var2 = true;
         }
      }

      return var2;
   }

   public DailySummary$PbDailySummary$Builder mergeActivityClassTimes(DailySummary$PbActivityClassTimes var1) {
      if (this.activityClassTimesBuilder_ == null) {
         if ((this.bitField0_ & 64) == 64 && this.activityClassTimes_ != null && this.activityClassTimes_ != DailySummary$PbActivityClassTimes.getDefaultInstance()) {
            this.activityClassTimes_ = DailySummary$PbActivityClassTimes.newBuilder(this.activityClassTimes_).mergeFrom(var1).buildPartial();
         } else {
            this.activityClassTimes_ = var1;
         }

         this.onChanged();
      } else {
         this.activityClassTimesBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public DailySummary$PbDailySummary$Builder mergeActivityGoalSummary(DailySummary$PbActivityGoalSummary var1) {
      if (this.activityGoalSummaryBuilder_ == null) {
         if ((this.bitField0_ & 32) == 32 && this.activityGoalSummary_ != null && this.activityGoalSummary_ != DailySummary$PbActivityGoalSummary.getDefaultInstance()) {
            this.activityGoalSummary_ = DailySummary$PbActivityGoalSummary.newBuilder(this.activityGoalSummary_).mergeFrom(var1).buildPartial();
         } else {
            this.activityGoalSummary_ = var1;
         }

         this.onChanged();
      } else {
         this.activityGoalSummaryBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public DailySummary$PbDailySummary$Builder mergeDate(Types$PbDate var1) {
      if (this.dateBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.date_ != null && this.date_ != Types$PbDate.getDefaultInstance()) {
            this.date_ = Types$PbDate.newBuilder(this.date_).mergeFrom(var1).buildPartial();
         } else {
            this.date_ = var1;
         }

         this.onChanged();
      } else {
         this.dateBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public DailySummary$PbDailySummary$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      DailySummary$PbDailySummary var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (DailySummary$PbDailySummary)DailySummary$PbDailySummary.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (DailySummary$PbDailySummary)var10.getUnfinishedMessage();
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

   public DailySummary$PbDailySummary$Builder mergeFrom(Message var1) {
      DailySummary$PbDailySummary$Builder var2;
      if (var1 instanceof DailySummary$PbDailySummary) {
         var2 = this.mergeFrom((DailySummary$PbDailySummary)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public DailySummary$PbDailySummary$Builder mergeFrom(DailySummary$PbDailySummary var1) {
      if (var1 != DailySummary$PbDailySummary.getDefaultInstance()) {
         if (var1.hasDate()) {
            this.mergeDate(var1.getDate());
         }

         if (var1.hasSteps()) {
            this.setSteps(var1.getSteps());
         }

         if (var1.hasActivityCalories()) {
            this.setActivityCalories(var1.getActivityCalories());
         }

         if (var1.hasTrainingCalories()) {
            this.setTrainingCalories(var1.getTrainingCalories());
         }

         if (var1.hasBmrCalories()) {
            this.setBmrCalories(var1.getBmrCalories());
         }

         if (var1.hasActivityGoalSummary()) {
            this.mergeActivityGoalSummary(var1.getActivityGoalSummary());
         }

         if (var1.hasActivityClassTimes()) {
            this.mergeActivityClassTimes(var1.getActivityClassTimes());
         }

         if (var1.hasActivityDistance()) {
            this.setActivityDistance(var1.getActivityDistance());
         }

         this.mergeUnknownFields(DailySummary$PbDailySummary.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final DailySummary$PbDailySummary$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (DailySummary$PbDailySummary$Builder)super.mergeUnknownFields(var1);
   }

   public DailySummary$PbDailySummary$Builder setActivityCalories(int var1) {
      this.bitField0_ |= 4;
      this.activityCalories_ = var1;
      this.onChanged();
      return this;
   }

   public DailySummary$PbDailySummary$Builder setActivityClassTimes(DailySummary$PbActivityClassTimes$Builder var1) {
      if (this.activityClassTimesBuilder_ == null) {
         this.activityClassTimes_ = var1.build();
         this.onChanged();
      } else {
         this.activityClassTimesBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 64;
      return this;
   }

   public DailySummary$PbDailySummary$Builder setActivityClassTimes(DailySummary$PbActivityClassTimes var1) {
      if (this.activityClassTimesBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.activityClassTimes_ = var1;
         this.onChanged();
      } else {
         this.activityClassTimesBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public DailySummary$PbDailySummary$Builder setActivityDistance(float var1) {
      this.bitField0_ |= 128;
      this.activityDistance_ = var1;
      this.onChanged();
      return this;
   }

   public DailySummary$PbDailySummary$Builder setActivityGoalSummary(DailySummary$PbActivityGoalSummary$Builder var1) {
      if (this.activityGoalSummaryBuilder_ == null) {
         this.activityGoalSummary_ = var1.build();
         this.onChanged();
      } else {
         this.activityGoalSummaryBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 32;
      return this;
   }

   public DailySummary$PbDailySummary$Builder setActivityGoalSummary(DailySummary$PbActivityGoalSummary var1) {
      if (this.activityGoalSummaryBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.activityGoalSummary_ = var1;
         this.onChanged();
      } else {
         this.activityGoalSummaryBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public DailySummary$PbDailySummary$Builder setBmrCalories(int var1) {
      this.bitField0_ |= 16;
      this.bmrCalories_ = var1;
      this.onChanged();
      return this;
   }

   public DailySummary$PbDailySummary$Builder setDate(Types$PbDate$Builder var1) {
      if (this.dateBuilder_ == null) {
         this.date_ = var1.build();
         this.onChanged();
      } else {
         this.dateBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public DailySummary$PbDailySummary$Builder setDate(Types$PbDate var1) {
      if (this.dateBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.date_ = var1;
         this.onChanged();
      } else {
         this.dateBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public DailySummary$PbDailySummary$Builder setField(FieldDescriptor var1, Object var2) {
      return (DailySummary$PbDailySummary$Builder)super.setField(var1, var2);
   }

   public DailySummary$PbDailySummary$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (DailySummary$PbDailySummary$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public DailySummary$PbDailySummary$Builder setSteps(int var1) {
      this.bitField0_ |= 2;
      this.steps_ = var1;
      this.onChanged();
      return this;
   }

   public DailySummary$PbDailySummary$Builder setTrainingCalories(int var1) {
      this.bitField0_ |= 8;
      this.trainingCalories_ = var1;
      this.onChanged();
      return this;
   }

   public final DailySummary$PbDailySummary$Builder setUnknownFields(UnknownFieldSet var1) {
      return (DailySummary$PbDailySummary$Builder)super.setUnknownFields(var1);
   }
}
