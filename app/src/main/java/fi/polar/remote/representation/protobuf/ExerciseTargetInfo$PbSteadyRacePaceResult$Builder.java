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

public final class ExerciseTargetInfo$PbSteadyRacePaceResult$Builder extends Builder implements ExerciseTargetInfo$PbSteadyRacePaceResultOrBuilder {
   private int averageHeartrate_;
   private float averageSpeed_;
   private int bitField0_;
   private SingleFieldBuilderV3 completedTimeBuilder_;
   private Types$PbDuration completedTime_;

   private ExerciseTargetInfo$PbSteadyRacePaceResult$Builder() {
      this.completedTime_ = null;
      this.maybeForceBuilderInitialization();
   }

   private ExerciseTargetInfo$PbSteadyRacePaceResult$Builder(BuilderParent var1) {
      super(var1);
      this.completedTime_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseTargetInfo$PbSteadyRacePaceResult$Builder(BuilderParent var1, ExerciseTargetInfo$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseTargetInfo$PbSteadyRacePaceResult$Builder(ExerciseTargetInfo$1 var1) {
      this();
   }

   private SingleFieldBuilderV3 getCompletedTimeFieldBuilder() {
      if (this.completedTimeBuilder_ == null) {
         this.completedTimeBuilder_ = new SingleFieldBuilderV3(this.getCompletedTime(), this.getParentForChildren(), this.isClean());
         this.completedTime_ = null;
      }

      return this.completedTimeBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseTargetInfo.a();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseTargetInfo$PbSteadyRacePaceResult.b()) {
         this.getCompletedTimeFieldBuilder();
      }

   }

   public ExerciseTargetInfo$PbSteadyRacePaceResult$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseTargetInfo$PbSteadyRacePaceResult$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseTargetInfo$PbSteadyRacePaceResult build() {
      ExerciseTargetInfo$PbSteadyRacePaceResult var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseTargetInfo$PbSteadyRacePaceResult buildPartial() {
      ExerciseTargetInfo$PbSteadyRacePaceResult var1 = new ExerciseTargetInfo$PbSteadyRacePaceResult(this, (ExerciseTargetInfo$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.completedTimeBuilder_ == null) {
         ExerciseTargetInfo$PbSteadyRacePaceResult.a(var1, this.completedTime_);
      } else {
         ExerciseTargetInfo$PbSteadyRacePaceResult.a(var1, (Types$PbDuration)this.completedTimeBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      ExerciseTargetInfo$PbSteadyRacePaceResult.a(var1, this.averageHeartrate_);
      int var5 = var4;
      if ((var2 & 4) == 4) {
         var5 = var4 | 4;
      }

      ExerciseTargetInfo$PbSteadyRacePaceResult.a(var1, this.averageSpeed_);
      ExerciseTargetInfo$PbSteadyRacePaceResult.b(var1, var5);
      this.onBuilt();
      return var1;
   }

   public ExerciseTargetInfo$PbSteadyRacePaceResult$Builder clear() {
      super.clear();
      if (this.completedTimeBuilder_ == null) {
         this.completedTime_ = null;
      } else {
         this.completedTimeBuilder_.clear();
      }

      this.bitField0_ &= -2;
      this.averageHeartrate_ = 0;
      this.bitField0_ &= -3;
      this.averageSpeed_ = 0.0F;
      this.bitField0_ &= -5;
      return this;
   }

   public ExerciseTargetInfo$PbSteadyRacePaceResult$Builder clearAverageHeartrate() {
      this.bitField0_ &= -3;
      this.averageHeartrate_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseTargetInfo$PbSteadyRacePaceResult$Builder clearAverageSpeed() {
      this.bitField0_ &= -5;
      this.averageSpeed_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseTargetInfo$PbSteadyRacePaceResult$Builder clearCompletedTime() {
      if (this.completedTimeBuilder_ == null) {
         this.completedTime_ = null;
         this.onChanged();
      } else {
         this.completedTimeBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public ExerciseTargetInfo$PbSteadyRacePaceResult$Builder clearField(FieldDescriptor var1) {
      return (ExerciseTargetInfo$PbSteadyRacePaceResult$Builder)super.clearField(var1);
   }

   public ExerciseTargetInfo$PbSteadyRacePaceResult$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseTargetInfo$PbSteadyRacePaceResult$Builder)super.clearOneof(var1);
   }

   public ExerciseTargetInfo$PbSteadyRacePaceResult$Builder clone() {
      return (ExerciseTargetInfo$PbSteadyRacePaceResult$Builder)super.clone();
   }

   public int getAverageHeartrate() {
      return this.averageHeartrate_;
   }

   public float getAverageSpeed() {
      return this.averageSpeed_;
   }

   public Types$PbDuration getCompletedTime() {
      Types$PbDuration var1;
      if (this.completedTimeBuilder_ == null) {
         if (this.completedTime_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.completedTime_;
         }
      } else {
         var1 = (Types$PbDuration)this.completedTimeBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getCompletedTimeBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getCompletedTimeFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getCompletedTimeOrBuilder() {
      Object var1;
      if (this.completedTimeBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.completedTimeBuilder_.getMessageOrBuilder();
      } else if (this.completedTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.completedTime_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public ExerciseTargetInfo$PbSteadyRacePaceResult getDefaultInstanceForType() {
      return ExerciseTargetInfo$PbSteadyRacePaceResult.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseTargetInfo.a();
   }

   public boolean hasAverageHeartrate() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAverageSpeed() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasCompletedTime() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseTargetInfo.b().ensureFieldAccessorsInitialized(ExerciseTargetInfo$PbSteadyRacePaceResult.class, ExerciseTargetInfo$PbSteadyRacePaceResult$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasCompletedTime()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public ExerciseTargetInfo$PbSteadyRacePaceResult$Builder mergeCompletedTime(Types$PbDuration var1) {
      if (this.completedTimeBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.completedTime_ != null && this.completedTime_ != Types$PbDuration.getDefaultInstance()) {
            this.completedTime_ = Types$PbDuration.newBuilder(this.completedTime_).mergeFrom(var1).buildPartial();
         } else {
            this.completedTime_ = var1;
         }

         this.onChanged();
      } else {
         this.completedTimeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ExerciseTargetInfo$PbSteadyRacePaceResult$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseTargetInfo$PbSteadyRacePaceResult var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (ExerciseTargetInfo$PbSteadyRacePaceResult)ExerciseTargetInfo$PbSteadyRacePaceResult.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (ExerciseTargetInfo$PbSteadyRacePaceResult)var10.getUnfinishedMessage();
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

   public ExerciseTargetInfo$PbSteadyRacePaceResult$Builder mergeFrom(Message var1) {
      ExerciseTargetInfo$PbSteadyRacePaceResult$Builder var2;
      if (var1 instanceof ExerciseTargetInfo$PbSteadyRacePaceResult) {
         var2 = this.mergeFrom((ExerciseTargetInfo$PbSteadyRacePaceResult)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseTargetInfo$PbSteadyRacePaceResult$Builder mergeFrom(ExerciseTargetInfo$PbSteadyRacePaceResult var1) {
      if (var1 != ExerciseTargetInfo$PbSteadyRacePaceResult.getDefaultInstance()) {
         if (var1.hasCompletedTime()) {
            this.mergeCompletedTime(var1.getCompletedTime());
         }

         if (var1.hasAverageHeartrate()) {
            this.setAverageHeartrate(var1.getAverageHeartrate());
         }

         if (var1.hasAverageSpeed()) {
            this.setAverageSpeed(var1.getAverageSpeed());
         }

         this.mergeUnknownFields(ExerciseTargetInfo$PbSteadyRacePaceResult.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseTargetInfo$PbSteadyRacePaceResult$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseTargetInfo$PbSteadyRacePaceResult$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseTargetInfo$PbSteadyRacePaceResult$Builder setAverageHeartrate(int var1) {
      this.bitField0_ |= 2;
      this.averageHeartrate_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseTargetInfo$PbSteadyRacePaceResult$Builder setAverageSpeed(float var1) {
      this.bitField0_ |= 4;
      this.averageSpeed_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseTargetInfo$PbSteadyRacePaceResult$Builder setCompletedTime(Types$PbDuration$Builder var1) {
      if (this.completedTimeBuilder_ == null) {
         this.completedTime_ = var1.build();
         this.onChanged();
      } else {
         this.completedTimeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ExerciseTargetInfo$PbSteadyRacePaceResult$Builder setCompletedTime(Types$PbDuration var1) {
      if (this.completedTimeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.completedTime_ = var1;
         this.onChanged();
      } else {
         this.completedTimeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ExerciseTargetInfo$PbSteadyRacePaceResult$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseTargetInfo$PbSteadyRacePaceResult$Builder)super.setField(var1, var2);
   }

   public ExerciseTargetInfo$PbSteadyRacePaceResult$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseTargetInfo$PbSteadyRacePaceResult$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExerciseTargetInfo$PbSteadyRacePaceResult$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseTargetInfo$PbSteadyRacePaceResult$Builder)super.setUnknownFields(var1);
   }
}
