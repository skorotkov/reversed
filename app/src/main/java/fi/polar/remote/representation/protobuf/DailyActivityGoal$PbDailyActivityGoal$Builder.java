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

public final class DailyActivityGoal$PbDailyActivityGoal$Builder extends Builder implements DailyActivityGoal$PbDailyActivityGoalOrBuilder {
   private SingleFieldBuilderV3 activityMetminGoalBuilder_;
   private DailyActivityGoal$PbActivityMetMinGoal activityMetminGoal_;
   private int bitField0_;
   private int goalType_;
   private SingleFieldBuilderV3 lastModifiedBuilder_;
   private Types$PbSystemDateTime lastModified_;
   private SingleFieldBuilderV3 polarBalanceGoalBuilder_;
   private DailyActivityGoal$PbPolarBalanceGoal polarBalanceGoal_;

   private DailyActivityGoal$PbDailyActivityGoal$Builder() {
      this.goalType_ = 1;
      this.activityMetminGoal_ = null;
      this.lastModified_ = null;
      this.polarBalanceGoal_ = null;
      this.maybeForceBuilderInitialization();
   }

   private DailyActivityGoal$PbDailyActivityGoal$Builder(BuilderParent var1) {
      super(var1);
      this.goalType_ = 1;
      this.activityMetminGoal_ = null;
      this.lastModified_ = null;
      this.polarBalanceGoal_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   DailyActivityGoal$PbDailyActivityGoal$Builder(BuilderParent var1, DailyActivityGoal$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   DailyActivityGoal$PbDailyActivityGoal$Builder(DailyActivityGoal$1 var1) {
      this();
   }

   private SingleFieldBuilderV3 getActivityMetminGoalFieldBuilder() {
      if (this.activityMetminGoalBuilder_ == null) {
         this.activityMetminGoalBuilder_ = new SingleFieldBuilderV3(this.getActivityMetminGoal(), this.getParentForChildren(), this.isClean());
         this.activityMetminGoal_ = null;
      }

      return this.activityMetminGoalBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return DailyActivityGoal.e();
   }

   private SingleFieldBuilderV3 getLastModifiedFieldBuilder() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModifiedBuilder_ = new SingleFieldBuilderV3(this.getLastModified(), this.getParentForChildren(), this.isClean());
         this.lastModified_ = null;
      }

      return this.lastModifiedBuilder_;
   }

   private SingleFieldBuilderV3 getPolarBalanceGoalFieldBuilder() {
      if (this.polarBalanceGoalBuilder_ == null) {
         this.polarBalanceGoalBuilder_ = new SingleFieldBuilderV3(this.getPolarBalanceGoal(), this.getParentForChildren(), this.isClean());
         this.polarBalanceGoal_ = null;
      }

      return this.polarBalanceGoalBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (DailyActivityGoal$PbDailyActivityGoal.b()) {
         this.getActivityMetminGoalFieldBuilder();
         this.getLastModifiedFieldBuilder();
         this.getPolarBalanceGoalFieldBuilder();
      }

   }

   public DailyActivityGoal$PbDailyActivityGoal$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (DailyActivityGoal$PbDailyActivityGoal$Builder)super.addRepeatedField(var1, var2);
   }

   public DailyActivityGoal$PbDailyActivityGoal build() {
      DailyActivityGoal$PbDailyActivityGoal var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public DailyActivityGoal$PbDailyActivityGoal buildPartial() {
      byte var1 = 1;
      DailyActivityGoal$PbDailyActivityGoal var2 = new DailyActivityGoal$PbDailyActivityGoal(this, (DailyActivityGoal$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      DailyActivityGoal$PbDailyActivityGoal.a(var2, this.goalType_);
      int var4;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      } else {
         var4 = var1;
      }

      if (this.activityMetminGoalBuilder_ == null) {
         DailyActivityGoal$PbDailyActivityGoal.a(var2, this.activityMetminGoal_);
      } else {
         DailyActivityGoal$PbDailyActivityGoal.a(var2, (DailyActivityGoal$PbActivityMetMinGoal)this.activityMetminGoalBuilder_.build());
      }

      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      if (this.lastModifiedBuilder_ == null) {
         DailyActivityGoal$PbDailyActivityGoal.a(var2, this.lastModified_);
      } else {
         DailyActivityGoal$PbDailyActivityGoal.a(var2, (Types$PbSystemDateTime)this.lastModifiedBuilder_.build());
      }

      var4 = var5;
      if ((var3 & 8) == 8) {
         var4 = var5 | 8;
      }

      if (this.polarBalanceGoalBuilder_ == null) {
         DailyActivityGoal$PbDailyActivityGoal.a(var2, this.polarBalanceGoal_);
      } else {
         DailyActivityGoal$PbDailyActivityGoal.a(var2, (DailyActivityGoal$PbPolarBalanceGoal)this.polarBalanceGoalBuilder_.build());
      }

      DailyActivityGoal$PbDailyActivityGoal.b(var2, var4);
      this.onBuilt();
      return var2;
   }

   public DailyActivityGoal$PbDailyActivityGoal$Builder clear() {
      super.clear();
      this.goalType_ = 1;
      this.bitField0_ &= -2;
      if (this.activityMetminGoalBuilder_ == null) {
         this.activityMetminGoal_ = null;
      } else {
         this.activityMetminGoalBuilder_.clear();
      }

      this.bitField0_ &= -3;
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -5;
      if (this.polarBalanceGoalBuilder_ == null) {
         this.polarBalanceGoal_ = null;
      } else {
         this.polarBalanceGoalBuilder_.clear();
      }

      this.bitField0_ &= -9;
      return this;
   }

   public DailyActivityGoal$PbDailyActivityGoal$Builder clearActivityMetminGoal() {
      if (this.activityMetminGoalBuilder_ == null) {
         this.activityMetminGoal_ = null;
         this.onChanged();
      } else {
         this.activityMetminGoalBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public DailyActivityGoal$PbDailyActivityGoal$Builder clearField(FieldDescriptor var1) {
      return (DailyActivityGoal$PbDailyActivityGoal$Builder)super.clearField(var1);
   }

   public DailyActivityGoal$PbDailyActivityGoal$Builder clearGoalType() {
      this.bitField0_ &= -2;
      this.goalType_ = 1;
      this.onChanged();
      return this;
   }

   public DailyActivityGoal$PbDailyActivityGoal$Builder clearLastModified() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public DailyActivityGoal$PbDailyActivityGoal$Builder clearOneof(OneofDescriptor var1) {
      return (DailyActivityGoal$PbDailyActivityGoal$Builder)super.clearOneof(var1);
   }

   public DailyActivityGoal$PbDailyActivityGoal$Builder clearPolarBalanceGoal() {
      if (this.polarBalanceGoalBuilder_ == null) {
         this.polarBalanceGoal_ = null;
         this.onChanged();
      } else {
         this.polarBalanceGoalBuilder_.clear();
      }

      this.bitField0_ &= -9;
      return this;
   }

   public DailyActivityGoal$PbDailyActivityGoal$Builder clone() {
      return (DailyActivityGoal$PbDailyActivityGoal$Builder)super.clone();
   }

   public DailyActivityGoal$PbActivityMetMinGoal getActivityMetminGoal() {
      DailyActivityGoal$PbActivityMetMinGoal var1;
      if (this.activityMetminGoalBuilder_ == null) {
         if (this.activityMetminGoal_ == null) {
            var1 = DailyActivityGoal$PbActivityMetMinGoal.getDefaultInstance();
         } else {
            var1 = this.activityMetminGoal_;
         }
      } else {
         var1 = (DailyActivityGoal$PbActivityMetMinGoal)this.activityMetminGoalBuilder_.getMessage();
      }

      return var1;
   }

   public DailyActivityGoal$PbActivityMetMinGoal$Builder getActivityMetminGoalBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (DailyActivityGoal$PbActivityMetMinGoal$Builder)this.getActivityMetminGoalFieldBuilder().getBuilder();
   }

   public DailyActivityGoal$PbActivityMetMinGoalOrBuilder getActivityMetminGoalOrBuilder() {
      Object var1;
      if (this.activityMetminGoalBuilder_ != null) {
         var1 = (DailyActivityGoal$PbActivityMetMinGoalOrBuilder)this.activityMetminGoalBuilder_.getMessageOrBuilder();
      } else if (this.activityMetminGoal_ == null) {
         var1 = DailyActivityGoal$PbActivityMetMinGoal.getDefaultInstance();
      } else {
         var1 = this.activityMetminGoal_;
      }

      return (DailyActivityGoal$PbActivityMetMinGoalOrBuilder)var1;
   }

   public DailyActivityGoal$PbDailyActivityGoal getDefaultInstanceForType() {
      return DailyActivityGoal$PbDailyActivityGoal.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return DailyActivityGoal.e();
   }

   public DailyActivityGoal$PbDailyActivityGoal$PbActivityGoalType getGoalType() {
      DailyActivityGoal$PbDailyActivityGoal$PbActivityGoalType var1 = DailyActivityGoal$PbDailyActivityGoal$PbActivityGoalType.valueOf(this.goalType_);
      DailyActivityGoal$PbDailyActivityGoal$PbActivityGoalType var2 = var1;
      if (var1 == null) {
         var2 = DailyActivityGoal$PbDailyActivityGoal$PbActivityGoalType.ACTIVITY_GOAL_DAILY_ACTIVITY;
      }

      return var2;
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

   public DailyActivityGoal$PbPolarBalanceGoal getPolarBalanceGoal() {
      DailyActivityGoal$PbPolarBalanceGoal var1;
      if (this.polarBalanceGoalBuilder_ == null) {
         if (this.polarBalanceGoal_ == null) {
            var1 = DailyActivityGoal$PbPolarBalanceGoal.getDefaultInstance();
         } else {
            var1 = this.polarBalanceGoal_;
         }
      } else {
         var1 = (DailyActivityGoal$PbPolarBalanceGoal)this.polarBalanceGoalBuilder_.getMessage();
      }

      return var1;
   }

   public DailyActivityGoal$PbPolarBalanceGoal$Builder getPolarBalanceGoalBuilder() {
      this.bitField0_ |= 8;
      this.onChanged();
      return (DailyActivityGoal$PbPolarBalanceGoal$Builder)this.getPolarBalanceGoalFieldBuilder().getBuilder();
   }

   public DailyActivityGoal$PbPolarBalanceGoalOrBuilder getPolarBalanceGoalOrBuilder() {
      Object var1;
      if (this.polarBalanceGoalBuilder_ != null) {
         var1 = (DailyActivityGoal$PbPolarBalanceGoalOrBuilder)this.polarBalanceGoalBuilder_.getMessageOrBuilder();
      } else if (this.polarBalanceGoal_ == null) {
         var1 = DailyActivityGoal$PbPolarBalanceGoal.getDefaultInstance();
      } else {
         var1 = this.polarBalanceGoal_;
      }

      return (DailyActivityGoal$PbPolarBalanceGoalOrBuilder)var1;
   }

   public boolean hasActivityMetminGoal() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasGoalType() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
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

   public boolean hasPolarBalanceGoal() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return DailyActivityGoal.f().ensureFieldAccessorsInitialized(DailyActivityGoal$PbDailyActivityGoal.class, DailyActivityGoal$PbDailyActivityGoal$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasLastModified()) {
         var2 = var1;
      } else {
         if (this.hasActivityMetminGoal()) {
            var2 = var1;
            if (!this.getActivityMetminGoal().isInitialized()) {
               return var2;
            }
         }

         var2 = var1;
         if (this.getLastModified().isInitialized()) {
            if (this.hasPolarBalanceGoal()) {
               var2 = var1;
               if (!this.getPolarBalanceGoal().isInitialized()) {
                  return var2;
               }
            }

            var2 = true;
         }
      }

      return var2;
   }

   public DailyActivityGoal$PbDailyActivityGoal$Builder mergeActivityMetminGoal(DailyActivityGoal$PbActivityMetMinGoal var1) {
      if (this.activityMetminGoalBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.activityMetminGoal_ != null && this.activityMetminGoal_ != DailyActivityGoal$PbActivityMetMinGoal.getDefaultInstance()) {
            this.activityMetminGoal_ = DailyActivityGoal$PbActivityMetMinGoal.newBuilder(this.activityMetminGoal_).mergeFrom(var1).buildPartial();
         } else {
            this.activityMetminGoal_ = var1;
         }

         this.onChanged();
      } else {
         this.activityMetminGoalBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public DailyActivityGoal$PbDailyActivityGoal$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      DailyActivityGoal$PbDailyActivityGoal var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (DailyActivityGoal$PbDailyActivityGoal)DailyActivityGoal$PbDailyActivityGoal.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (DailyActivityGoal$PbDailyActivityGoal)var10.getUnfinishedMessage();
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

   public DailyActivityGoal$PbDailyActivityGoal$Builder mergeFrom(Message var1) {
      DailyActivityGoal$PbDailyActivityGoal$Builder var2;
      if (var1 instanceof DailyActivityGoal$PbDailyActivityGoal) {
         var2 = this.mergeFrom((DailyActivityGoal$PbDailyActivityGoal)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public DailyActivityGoal$PbDailyActivityGoal$Builder mergeFrom(DailyActivityGoal$PbDailyActivityGoal var1) {
      if (var1 != DailyActivityGoal$PbDailyActivityGoal.getDefaultInstance()) {
         if (var1.hasGoalType()) {
            this.setGoalType(var1.getGoalType());
         }

         if (var1.hasActivityMetminGoal()) {
            this.mergeActivityMetminGoal(var1.getActivityMetminGoal());
         }

         if (var1.hasLastModified()) {
            this.mergeLastModified(var1.getLastModified());
         }

         if (var1.hasPolarBalanceGoal()) {
            this.mergePolarBalanceGoal(var1.getPolarBalanceGoal());
         }

         this.mergeUnknownFields(DailyActivityGoal$PbDailyActivityGoal.a(var1));
         this.onChanged();
      }

      return this;
   }

   public DailyActivityGoal$PbDailyActivityGoal$Builder mergeLastModified(Types$PbSystemDateTime var1) {
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

   public DailyActivityGoal$PbDailyActivityGoal$Builder mergePolarBalanceGoal(DailyActivityGoal$PbPolarBalanceGoal var1) {
      if (this.polarBalanceGoalBuilder_ == null) {
         if ((this.bitField0_ & 8) == 8 && this.polarBalanceGoal_ != null && this.polarBalanceGoal_ != DailyActivityGoal$PbPolarBalanceGoal.getDefaultInstance()) {
            this.polarBalanceGoal_ = DailyActivityGoal$PbPolarBalanceGoal.newBuilder(this.polarBalanceGoal_).mergeFrom(var1).buildPartial();
         } else {
            this.polarBalanceGoal_ = var1;
         }

         this.onChanged();
      } else {
         this.polarBalanceGoalBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public final DailyActivityGoal$PbDailyActivityGoal$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (DailyActivityGoal$PbDailyActivityGoal$Builder)super.mergeUnknownFields(var1);
   }

   public DailyActivityGoal$PbDailyActivityGoal$Builder setActivityMetminGoal(DailyActivityGoal$PbActivityMetMinGoal$Builder var1) {
      if (this.activityMetminGoalBuilder_ == null) {
         this.activityMetminGoal_ = var1.build();
         this.onChanged();
      } else {
         this.activityMetminGoalBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public DailyActivityGoal$PbDailyActivityGoal$Builder setActivityMetminGoal(DailyActivityGoal$PbActivityMetMinGoal var1) {
      if (this.activityMetminGoalBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.activityMetminGoal_ = var1;
         this.onChanged();
      } else {
         this.activityMetminGoalBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public DailyActivityGoal$PbDailyActivityGoal$Builder setField(FieldDescriptor var1, Object var2) {
      return (DailyActivityGoal$PbDailyActivityGoal$Builder)super.setField(var1, var2);
   }

   public DailyActivityGoal$PbDailyActivityGoal$Builder setGoalType(DailyActivityGoal$PbDailyActivityGoal$PbActivityGoalType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.goalType_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public DailyActivityGoal$PbDailyActivityGoal$Builder setLastModified(Types$PbSystemDateTime$Builder var1) {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = var1.build();
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public DailyActivityGoal$PbDailyActivityGoal$Builder setLastModified(Types$PbSystemDateTime var1) {
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

   public DailyActivityGoal$PbDailyActivityGoal$Builder setPolarBalanceGoal(DailyActivityGoal$PbPolarBalanceGoal$Builder var1) {
      if (this.polarBalanceGoalBuilder_ == null) {
         this.polarBalanceGoal_ = var1.build();
         this.onChanged();
      } else {
         this.polarBalanceGoalBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8;
      return this;
   }

   public DailyActivityGoal$PbDailyActivityGoal$Builder setPolarBalanceGoal(DailyActivityGoal$PbPolarBalanceGoal var1) {
      if (this.polarBalanceGoalBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.polarBalanceGoal_ = var1;
         this.onChanged();
      } else {
         this.polarBalanceGoalBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public DailyActivityGoal$PbDailyActivityGoal$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (DailyActivityGoal$PbDailyActivityGoal$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final DailyActivityGoal$PbDailyActivityGoal$Builder setUnknownFields(UnknownFieldSet var1) {
      return (DailyActivityGoal$PbDailyActivityGoal$Builder)super.setUnknownFields(var1);
   }
}
