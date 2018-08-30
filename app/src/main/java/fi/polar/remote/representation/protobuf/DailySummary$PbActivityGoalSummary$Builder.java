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

public final class DailySummary$PbActivityGoalSummary$Builder extends Builder implements DailySummary$PbActivityGoalSummaryOrBuilder {
   private float achievedActivity_;
   private float activityGoal_;
   private int bitField0_;
   private SingleFieldBuilderV3 timeToGoJogBuilder_;
   private Types$PbDuration timeToGoJog_;
   private SingleFieldBuilderV3 timeToGoUpBuilder_;
   private Types$PbDuration timeToGoUp_;
   private SingleFieldBuilderV3 timeToGoWalkBuilder_;
   private Types$PbDuration timeToGoWalk_;

   private DailySummary$PbActivityGoalSummary$Builder() {
      this.timeToGoUp_ = null;
      this.timeToGoWalk_ = null;
      this.timeToGoJog_ = null;
      this.maybeForceBuilderInitialization();
   }

   private DailySummary$PbActivityGoalSummary$Builder(BuilderParent var1) {
      super(var1);
      this.timeToGoUp_ = null;
      this.timeToGoWalk_ = null;
      this.timeToGoJog_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   DailySummary$PbActivityGoalSummary$Builder(BuilderParent var1, DailySummary$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   DailySummary$PbActivityGoalSummary$Builder(DailySummary$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return DailySummary.a();
   }

   private SingleFieldBuilderV3 getTimeToGoJogFieldBuilder() {
      if (this.timeToGoJogBuilder_ == null) {
         this.timeToGoJogBuilder_ = new SingleFieldBuilderV3(this.getTimeToGoJog(), this.getParentForChildren(), this.isClean());
         this.timeToGoJog_ = null;
      }

      return this.timeToGoJogBuilder_;
   }

   private SingleFieldBuilderV3 getTimeToGoUpFieldBuilder() {
      if (this.timeToGoUpBuilder_ == null) {
         this.timeToGoUpBuilder_ = new SingleFieldBuilderV3(this.getTimeToGoUp(), this.getParentForChildren(), this.isClean());
         this.timeToGoUp_ = null;
      }

      return this.timeToGoUpBuilder_;
   }

   private SingleFieldBuilderV3 getTimeToGoWalkFieldBuilder() {
      if (this.timeToGoWalkBuilder_ == null) {
         this.timeToGoWalkBuilder_ = new SingleFieldBuilderV3(this.getTimeToGoWalk(), this.getParentForChildren(), this.isClean());
         this.timeToGoWalk_ = null;
      }

      return this.timeToGoWalkBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (DailySummary$PbActivityGoalSummary.b()) {
         this.getTimeToGoUpFieldBuilder();
         this.getTimeToGoWalkFieldBuilder();
         this.getTimeToGoJogFieldBuilder();
      }

   }

   public DailySummary$PbActivityGoalSummary$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (DailySummary$PbActivityGoalSummary$Builder)super.addRepeatedField(var1, var2);
   }

   public DailySummary$PbActivityGoalSummary build() {
      DailySummary$PbActivityGoalSummary var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public DailySummary$PbActivityGoalSummary buildPartial() {
      byte var1 = 1;
      DailySummary$PbActivityGoalSummary var2 = new DailySummary$PbActivityGoalSummary(this, (DailySummary$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      DailySummary$PbActivityGoalSummary.a(var2, this.activityGoal_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      DailySummary$PbActivityGoalSummary.b(var2, this.achievedActivity_);
      if ((var3 & 4) == 4) {
         var4 |= 4;
      }

      if (this.timeToGoUpBuilder_ == null) {
         DailySummary$PbActivityGoalSummary.a(var2, this.timeToGoUp_);
      } else {
         DailySummary$PbActivityGoalSummary.a(var2, (Types$PbDuration)this.timeToGoUpBuilder_.build());
      }

      int var5 = var4;
      if ((var3 & 8) == 8) {
         var5 = var4 | 8;
      }

      if (this.timeToGoWalkBuilder_ == null) {
         DailySummary$PbActivityGoalSummary.b(var2, this.timeToGoWalk_);
      } else {
         DailySummary$PbActivityGoalSummary.b(var2, (Types$PbDuration)this.timeToGoWalkBuilder_.build());
      }

      var4 = var5;
      if ((var3 & 16) == 16) {
         var4 = var5 | 16;
      }

      if (this.timeToGoJogBuilder_ == null) {
         DailySummary$PbActivityGoalSummary.c(var2, this.timeToGoJog_);
      } else {
         DailySummary$PbActivityGoalSummary.c(var2, (Types$PbDuration)this.timeToGoJogBuilder_.build());
      }

      DailySummary$PbActivityGoalSummary.a(var2, var4);
      this.onBuilt();
      return var2;
   }

   public DailySummary$PbActivityGoalSummary$Builder clear() {
      super.clear();
      this.activityGoal_ = 0.0F;
      this.bitField0_ &= -2;
      this.achievedActivity_ = 0.0F;
      this.bitField0_ &= -3;
      if (this.timeToGoUpBuilder_ == null) {
         this.timeToGoUp_ = null;
      } else {
         this.timeToGoUpBuilder_.clear();
      }

      this.bitField0_ &= -5;
      if (this.timeToGoWalkBuilder_ == null) {
         this.timeToGoWalk_ = null;
      } else {
         this.timeToGoWalkBuilder_.clear();
      }

      this.bitField0_ &= -9;
      if (this.timeToGoJogBuilder_ == null) {
         this.timeToGoJog_ = null;
      } else {
         this.timeToGoJogBuilder_.clear();
      }

      this.bitField0_ &= -17;
      return this;
   }

   public DailySummary$PbActivityGoalSummary$Builder clearAchievedActivity() {
      this.bitField0_ &= -3;
      this.achievedActivity_ = 0.0F;
      this.onChanged();
      return this;
   }

   public DailySummary$PbActivityGoalSummary$Builder clearActivityGoal() {
      this.bitField0_ &= -2;
      this.activityGoal_ = 0.0F;
      this.onChanged();
      return this;
   }

   public DailySummary$PbActivityGoalSummary$Builder clearField(FieldDescriptor var1) {
      return (DailySummary$PbActivityGoalSummary$Builder)super.clearField(var1);
   }

   public DailySummary$PbActivityGoalSummary$Builder clearOneof(OneofDescriptor var1) {
      return (DailySummary$PbActivityGoalSummary$Builder)super.clearOneof(var1);
   }

   public DailySummary$PbActivityGoalSummary$Builder clearTimeToGoJog() {
      if (this.timeToGoJogBuilder_ == null) {
         this.timeToGoJog_ = null;
         this.onChanged();
      } else {
         this.timeToGoJogBuilder_.clear();
      }

      this.bitField0_ &= -17;
      return this;
   }

   public DailySummary$PbActivityGoalSummary$Builder clearTimeToGoUp() {
      if (this.timeToGoUpBuilder_ == null) {
         this.timeToGoUp_ = null;
         this.onChanged();
      } else {
         this.timeToGoUpBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public DailySummary$PbActivityGoalSummary$Builder clearTimeToGoWalk() {
      if (this.timeToGoWalkBuilder_ == null) {
         this.timeToGoWalk_ = null;
         this.onChanged();
      } else {
         this.timeToGoWalkBuilder_.clear();
      }

      this.bitField0_ &= -9;
      return this;
   }

   public DailySummary$PbActivityGoalSummary$Builder clone() {
      return (DailySummary$PbActivityGoalSummary$Builder)super.clone();
   }

   public float getAchievedActivity() {
      return this.achievedActivity_;
   }

   public float getActivityGoal() {
      return this.activityGoal_;
   }

   public DailySummary$PbActivityGoalSummary getDefaultInstanceForType() {
      return DailySummary$PbActivityGoalSummary.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return DailySummary.a();
   }

   public Types$PbDuration getTimeToGoJog() {
      Types$PbDuration var1;
      if (this.timeToGoJogBuilder_ == null) {
         if (this.timeToGoJog_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.timeToGoJog_;
         }
      } else {
         var1 = (Types$PbDuration)this.timeToGoJogBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getTimeToGoJogBuilder() {
      this.bitField0_ |= 16;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getTimeToGoJogFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getTimeToGoJogOrBuilder() {
      Object var1;
      if (this.timeToGoJogBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.timeToGoJogBuilder_.getMessageOrBuilder();
      } else if (this.timeToGoJog_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeToGoJog_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public Types$PbDuration getTimeToGoUp() {
      Types$PbDuration var1;
      if (this.timeToGoUpBuilder_ == null) {
         if (this.timeToGoUp_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.timeToGoUp_;
         }
      } else {
         var1 = (Types$PbDuration)this.timeToGoUpBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getTimeToGoUpBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getTimeToGoUpFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getTimeToGoUpOrBuilder() {
      Object var1;
      if (this.timeToGoUpBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.timeToGoUpBuilder_.getMessageOrBuilder();
      } else if (this.timeToGoUp_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeToGoUp_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public Types$PbDuration getTimeToGoWalk() {
      Types$PbDuration var1;
      if (this.timeToGoWalkBuilder_ == null) {
         if (this.timeToGoWalk_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.timeToGoWalk_;
         }
      } else {
         var1 = (Types$PbDuration)this.timeToGoWalkBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getTimeToGoWalkBuilder() {
      this.bitField0_ |= 8;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getTimeToGoWalkFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getTimeToGoWalkOrBuilder() {
      Object var1;
      if (this.timeToGoWalkBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.timeToGoWalkBuilder_.getMessageOrBuilder();
      } else if (this.timeToGoWalk_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeToGoWalk_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public boolean hasAchievedActivity() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasActivityGoal() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeToGoJog() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeToGoUp() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeToGoWalk() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return DailySummary.b().ensureFieldAccessorsInitialized(DailySummary$PbActivityGoalSummary.class, DailySummary$PbActivityGoalSummary$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasActivityGoal() && this.hasAchievedActivity()) {
         var1 = true;
      }

      return var1;
   }

   public DailySummary$PbActivityGoalSummary$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      DailySummary$PbActivityGoalSummary var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (DailySummary$PbActivityGoalSummary)DailySummary$PbActivityGoalSummary.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (DailySummary$PbActivityGoalSummary)var10.getUnfinishedMessage();
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

   public DailySummary$PbActivityGoalSummary$Builder mergeFrom(Message var1) {
      DailySummary$PbActivityGoalSummary$Builder var2;
      if (var1 instanceof DailySummary$PbActivityGoalSummary) {
         var2 = this.mergeFrom((DailySummary$PbActivityGoalSummary)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public DailySummary$PbActivityGoalSummary$Builder mergeFrom(DailySummary$PbActivityGoalSummary var1) {
      if (var1 != DailySummary$PbActivityGoalSummary.getDefaultInstance()) {
         if (var1.hasActivityGoal()) {
            this.setActivityGoal(var1.getActivityGoal());
         }

         if (var1.hasAchievedActivity()) {
            this.setAchievedActivity(var1.getAchievedActivity());
         }

         if (var1.hasTimeToGoUp()) {
            this.mergeTimeToGoUp(var1.getTimeToGoUp());
         }

         if (var1.hasTimeToGoWalk()) {
            this.mergeTimeToGoWalk(var1.getTimeToGoWalk());
         }

         if (var1.hasTimeToGoJog()) {
            this.mergeTimeToGoJog(var1.getTimeToGoJog());
         }

         this.mergeUnknownFields(DailySummary$PbActivityGoalSummary.a(var1));
         this.onChanged();
      }

      return this;
   }

   public DailySummary$PbActivityGoalSummary$Builder mergeTimeToGoJog(Types$PbDuration var1) {
      if (this.timeToGoJogBuilder_ == null) {
         if ((this.bitField0_ & 16) == 16 && this.timeToGoJog_ != null && this.timeToGoJog_ != Types$PbDuration.getDefaultInstance()) {
            this.timeToGoJog_ = Types$PbDuration.newBuilder(this.timeToGoJog_).mergeFrom(var1).buildPartial();
         } else {
            this.timeToGoJog_ = var1;
         }

         this.onChanged();
      } else {
         this.timeToGoJogBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public DailySummary$PbActivityGoalSummary$Builder mergeTimeToGoUp(Types$PbDuration var1) {
      if (this.timeToGoUpBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.timeToGoUp_ != null && this.timeToGoUp_ != Types$PbDuration.getDefaultInstance()) {
            this.timeToGoUp_ = Types$PbDuration.newBuilder(this.timeToGoUp_).mergeFrom(var1).buildPartial();
         } else {
            this.timeToGoUp_ = var1;
         }

         this.onChanged();
      } else {
         this.timeToGoUpBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public DailySummary$PbActivityGoalSummary$Builder mergeTimeToGoWalk(Types$PbDuration var1) {
      if (this.timeToGoWalkBuilder_ == null) {
         if ((this.bitField0_ & 8) == 8 && this.timeToGoWalk_ != null && this.timeToGoWalk_ != Types$PbDuration.getDefaultInstance()) {
            this.timeToGoWalk_ = Types$PbDuration.newBuilder(this.timeToGoWalk_).mergeFrom(var1).buildPartial();
         } else {
            this.timeToGoWalk_ = var1;
         }

         this.onChanged();
      } else {
         this.timeToGoWalkBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public final DailySummary$PbActivityGoalSummary$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (DailySummary$PbActivityGoalSummary$Builder)super.mergeUnknownFields(var1);
   }

   public DailySummary$PbActivityGoalSummary$Builder setAchievedActivity(float var1) {
      this.bitField0_ |= 2;
      this.achievedActivity_ = var1;
      this.onChanged();
      return this;
   }

   public DailySummary$PbActivityGoalSummary$Builder setActivityGoal(float var1) {
      this.bitField0_ |= 1;
      this.activityGoal_ = var1;
      this.onChanged();
      return this;
   }

   public DailySummary$PbActivityGoalSummary$Builder setField(FieldDescriptor var1, Object var2) {
      return (DailySummary$PbActivityGoalSummary$Builder)super.setField(var1, var2);
   }

   public DailySummary$PbActivityGoalSummary$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (DailySummary$PbActivityGoalSummary$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public DailySummary$PbActivityGoalSummary$Builder setTimeToGoJog(Types$PbDuration$Builder var1) {
      if (this.timeToGoJogBuilder_ == null) {
         this.timeToGoJog_ = var1.build();
         this.onChanged();
      } else {
         this.timeToGoJogBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 16;
      return this;
   }

   public DailySummary$PbActivityGoalSummary$Builder setTimeToGoJog(Types$PbDuration var1) {
      if (this.timeToGoJogBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.timeToGoJog_ = var1;
         this.onChanged();
      } else {
         this.timeToGoJogBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public DailySummary$PbActivityGoalSummary$Builder setTimeToGoUp(Types$PbDuration$Builder var1) {
      if (this.timeToGoUpBuilder_ == null) {
         this.timeToGoUp_ = var1.build();
         this.onChanged();
      } else {
         this.timeToGoUpBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public DailySummary$PbActivityGoalSummary$Builder setTimeToGoUp(Types$PbDuration var1) {
      if (this.timeToGoUpBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.timeToGoUp_ = var1;
         this.onChanged();
      } else {
         this.timeToGoUpBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public DailySummary$PbActivityGoalSummary$Builder setTimeToGoWalk(Types$PbDuration$Builder var1) {
      if (this.timeToGoWalkBuilder_ == null) {
         this.timeToGoWalk_ = var1.build();
         this.onChanged();
      } else {
         this.timeToGoWalkBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8;
      return this;
   }

   public DailySummary$PbActivityGoalSummary$Builder setTimeToGoWalk(Types$PbDuration var1) {
      if (this.timeToGoWalkBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.timeToGoWalk_ = var1;
         this.onChanged();
      } else {
         this.timeToGoWalkBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public final DailySummary$PbActivityGoalSummary$Builder setUnknownFields(UnknownFieldSet var1) {
      return (DailySummary$PbActivityGoalSummary$Builder)super.setUnknownFields(var1);
   }
}
