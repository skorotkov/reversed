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

public final class DailyActivityGoal$PbPolarBalanceGoal$Builder extends Builder implements DailyActivityGoal$PbPolarBalanceGoalOrBuilder {
   private int bitField0_;
   private float fractionOfActivity_;
   private int goalDurationInWeeks_;
   private SingleFieldBuilderV3 startDateBuilder_;
   private Types$PbDate startDate_;
   private float targetWeight_;

   private DailyActivityGoal$PbPolarBalanceGoal$Builder() {
      this.startDate_ = null;
      this.maybeForceBuilderInitialization();
   }

   private DailyActivityGoal$PbPolarBalanceGoal$Builder(BuilderParent var1) {
      super(var1);
      this.startDate_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   DailyActivityGoal$PbPolarBalanceGoal$Builder(BuilderParent var1, DailyActivityGoal$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   DailyActivityGoal$PbPolarBalanceGoal$Builder(DailyActivityGoal$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return DailyActivityGoal.c();
   }

   private SingleFieldBuilderV3 getStartDateFieldBuilder() {
      if (this.startDateBuilder_ == null) {
         this.startDateBuilder_ = new SingleFieldBuilderV3(this.getStartDate(), this.getParentForChildren(), this.isClean());
         this.startDate_ = null;
      }

      return this.startDateBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (DailyActivityGoal$PbPolarBalanceGoal.b()) {
         this.getStartDateFieldBuilder();
      }

   }

   public DailyActivityGoal$PbPolarBalanceGoal$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (DailyActivityGoal$PbPolarBalanceGoal$Builder)super.addRepeatedField(var1, var2);
   }

   public DailyActivityGoal$PbPolarBalanceGoal build() {
      DailyActivityGoal$PbPolarBalanceGoal var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public DailyActivityGoal$PbPolarBalanceGoal buildPartial() {
      DailyActivityGoal$PbPolarBalanceGoal var1 = new DailyActivityGoal$PbPolarBalanceGoal(this, (DailyActivityGoal$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.startDateBuilder_ == null) {
         DailyActivityGoal$PbPolarBalanceGoal.a(var1, this.startDate_);
      } else {
         DailyActivityGoal$PbPolarBalanceGoal.a(var1, (Types$PbDate)this.startDateBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      DailyActivityGoal$PbPolarBalanceGoal.a(var1, this.targetWeight_);
      int var5 = var4;
      if ((var2 & 4) == 4) {
         var5 = var4 | 4;
      }

      DailyActivityGoal$PbPolarBalanceGoal.a(var1, this.goalDurationInWeeks_);
      var4 = var5;
      if ((var2 & 8) == 8) {
         var4 = var5 | 8;
      }

      DailyActivityGoal$PbPolarBalanceGoal.b(var1, this.fractionOfActivity_);
      DailyActivityGoal$PbPolarBalanceGoal.b(var1, var4);
      this.onBuilt();
      return var1;
   }

   public DailyActivityGoal$PbPolarBalanceGoal$Builder clear() {
      super.clear();
      if (this.startDateBuilder_ == null) {
         this.startDate_ = null;
      } else {
         this.startDateBuilder_.clear();
      }

      this.bitField0_ &= -2;
      this.targetWeight_ = 0.0F;
      this.bitField0_ &= -3;
      this.goalDurationInWeeks_ = 0;
      this.bitField0_ &= -5;
      this.fractionOfActivity_ = 0.0F;
      this.bitField0_ &= -9;
      return this;
   }

   public DailyActivityGoal$PbPolarBalanceGoal$Builder clearField(FieldDescriptor var1) {
      return (DailyActivityGoal$PbPolarBalanceGoal$Builder)super.clearField(var1);
   }

   public DailyActivityGoal$PbPolarBalanceGoal$Builder clearFractionOfActivity() {
      this.bitField0_ &= -9;
      this.fractionOfActivity_ = 0.0F;
      this.onChanged();
      return this;
   }

   public DailyActivityGoal$PbPolarBalanceGoal$Builder clearGoalDurationInWeeks() {
      this.bitField0_ &= -5;
      this.goalDurationInWeeks_ = 0;
      this.onChanged();
      return this;
   }

   public DailyActivityGoal$PbPolarBalanceGoal$Builder clearOneof(OneofDescriptor var1) {
      return (DailyActivityGoal$PbPolarBalanceGoal$Builder)super.clearOneof(var1);
   }

   public DailyActivityGoal$PbPolarBalanceGoal$Builder clearStartDate() {
      if (this.startDateBuilder_ == null) {
         this.startDate_ = null;
         this.onChanged();
      } else {
         this.startDateBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public DailyActivityGoal$PbPolarBalanceGoal$Builder clearTargetWeight() {
      this.bitField0_ &= -3;
      this.targetWeight_ = 0.0F;
      this.onChanged();
      return this;
   }

   public DailyActivityGoal$PbPolarBalanceGoal$Builder clone() {
      return (DailyActivityGoal$PbPolarBalanceGoal$Builder)super.clone();
   }

   public DailyActivityGoal$PbPolarBalanceGoal getDefaultInstanceForType() {
      return DailyActivityGoal$PbPolarBalanceGoal.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return DailyActivityGoal.c();
   }

   public float getFractionOfActivity() {
      return this.fractionOfActivity_;
   }

   public int getGoalDurationInWeeks() {
      return this.goalDurationInWeeks_;
   }

   public Types$PbDate getStartDate() {
      Types$PbDate var1;
      if (this.startDateBuilder_ == null) {
         if (this.startDate_ == null) {
            var1 = Types$PbDate.getDefaultInstance();
         } else {
            var1 = this.startDate_;
         }
      } else {
         var1 = (Types$PbDate)this.startDateBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDate$Builder getStartDateBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Types$PbDate$Builder)this.getStartDateFieldBuilder().getBuilder();
   }

   public Types$PbDateOrBuilder getStartDateOrBuilder() {
      Object var1;
      if (this.startDateBuilder_ != null) {
         var1 = (Types$PbDateOrBuilder)this.startDateBuilder_.getMessageOrBuilder();
      } else if (this.startDate_ == null) {
         var1 = Types$PbDate.getDefaultInstance();
      } else {
         var1 = this.startDate_;
      }

      return (Types$PbDateOrBuilder)var1;
   }

   public float getTargetWeight() {
      return this.targetWeight_;
   }

   public boolean hasFractionOfActivity() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasGoalDurationInWeeks() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStartDate() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTargetWeight() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return DailyActivityGoal.d().ensureFieldAccessorsInitialized(DailyActivityGoal$PbPolarBalanceGoal.class, DailyActivityGoal$PbPolarBalanceGoal$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasStartDate() && this.getStartDate().isInitialized()) {
         var1 = true;
      }

      return var1;
   }

   public DailyActivityGoal$PbPolarBalanceGoal$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      DailyActivityGoal$PbPolarBalanceGoal var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (DailyActivityGoal$PbPolarBalanceGoal)DailyActivityGoal$PbPolarBalanceGoal.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (DailyActivityGoal$PbPolarBalanceGoal)var10.getUnfinishedMessage();
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

   public DailyActivityGoal$PbPolarBalanceGoal$Builder mergeFrom(Message var1) {
      DailyActivityGoal$PbPolarBalanceGoal$Builder var2;
      if (var1 instanceof DailyActivityGoal$PbPolarBalanceGoal) {
         var2 = this.mergeFrom((DailyActivityGoal$PbPolarBalanceGoal)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public DailyActivityGoal$PbPolarBalanceGoal$Builder mergeFrom(DailyActivityGoal$PbPolarBalanceGoal var1) {
      if (var1 != DailyActivityGoal$PbPolarBalanceGoal.getDefaultInstance()) {
         if (var1.hasStartDate()) {
            this.mergeStartDate(var1.getStartDate());
         }

         if (var1.hasTargetWeight()) {
            this.setTargetWeight(var1.getTargetWeight());
         }

         if (var1.hasGoalDurationInWeeks()) {
            this.setGoalDurationInWeeks(var1.getGoalDurationInWeeks());
         }

         if (var1.hasFractionOfActivity()) {
            this.setFractionOfActivity(var1.getFractionOfActivity());
         }

         this.mergeUnknownFields(DailyActivityGoal$PbPolarBalanceGoal.a(var1));
         this.onChanged();
      }

      return this;
   }

   public DailyActivityGoal$PbPolarBalanceGoal$Builder mergeStartDate(Types$PbDate var1) {
      if (this.startDateBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.startDate_ != null && this.startDate_ != Types$PbDate.getDefaultInstance()) {
            this.startDate_ = Types$PbDate.newBuilder(this.startDate_).mergeFrom(var1).buildPartial();
         } else {
            this.startDate_ = var1;
         }

         this.onChanged();
      } else {
         this.startDateBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public final DailyActivityGoal$PbPolarBalanceGoal$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (DailyActivityGoal$PbPolarBalanceGoal$Builder)super.mergeUnknownFields(var1);
   }

   public DailyActivityGoal$PbPolarBalanceGoal$Builder setField(FieldDescriptor var1, Object var2) {
      return (DailyActivityGoal$PbPolarBalanceGoal$Builder)super.setField(var1, var2);
   }

   public DailyActivityGoal$PbPolarBalanceGoal$Builder setFractionOfActivity(float var1) {
      this.bitField0_ |= 8;
      this.fractionOfActivity_ = var1;
      this.onChanged();
      return this;
   }

   public DailyActivityGoal$PbPolarBalanceGoal$Builder setGoalDurationInWeeks(int var1) {
      this.bitField0_ |= 4;
      this.goalDurationInWeeks_ = var1;
      this.onChanged();
      return this;
   }

   public DailyActivityGoal$PbPolarBalanceGoal$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (DailyActivityGoal$PbPolarBalanceGoal$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public DailyActivityGoal$PbPolarBalanceGoal$Builder setStartDate(Types$PbDate$Builder var1) {
      if (this.startDateBuilder_ == null) {
         this.startDate_ = var1.build();
         this.onChanged();
      } else {
         this.startDateBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public DailyActivityGoal$PbPolarBalanceGoal$Builder setStartDate(Types$PbDate var1) {
      if (this.startDateBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.startDate_ = var1;
         this.onChanged();
      } else {
         this.startDateBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public DailyActivityGoal$PbPolarBalanceGoal$Builder setTargetWeight(float var1) {
      this.bitField0_ |= 2;
      this.targetWeight_ = var1;
      this.onChanged();
      return this;
   }

   public final DailyActivityGoal$PbPolarBalanceGoal$Builder setUnknownFields(UnknownFieldSet var1) {
      return (DailyActivityGoal$PbPolarBalanceGoal$Builder)super.setUnknownFields(var1);
   }
}
