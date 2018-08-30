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

public final class ActivitySamples$PbActivityInfo$Builder extends Builder implements ActivitySamples$PbActivityInfoOrBuilder {
   private int bitField0_;
   private float factor_;
   private SingleFieldBuilderV3 timeStampBuilder_;
   private Types$PbLocalDateTime timeStamp_;
   private int value_;

   private ActivitySamples$PbActivityInfo$Builder() {
      this.value_ = 1;
      this.timeStamp_ = null;
      this.maybeForceBuilderInitialization();
   }

   private ActivitySamples$PbActivityInfo$Builder(BuilderParent var1) {
      super(var1);
      this.value_ = 1;
      this.timeStamp_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ActivitySamples$PbActivityInfo$Builder(BuilderParent var1, ActivitySamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ActivitySamples$PbActivityInfo$Builder(ActivitySamples$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ActivitySamples.c();
   }

   private SingleFieldBuilderV3 getTimeStampFieldBuilder() {
      if (this.timeStampBuilder_ == null) {
         this.timeStampBuilder_ = new SingleFieldBuilderV3(this.getTimeStamp(), this.getParentForChildren(), this.isClean());
         this.timeStamp_ = null;
      }

      return this.timeStampBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (ActivitySamples$PbActivityInfo.b()) {
         this.getTimeStampFieldBuilder();
      }

   }

   public ActivitySamples$PbActivityInfo$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ActivitySamples$PbActivityInfo$Builder)super.addRepeatedField(var1, var2);
   }

   public ActivitySamples$PbActivityInfo build() {
      ActivitySamples$PbActivityInfo var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ActivitySamples$PbActivityInfo buildPartial() {
      int var1 = 1;
      ActivitySamples$PbActivityInfo var2 = new ActivitySamples$PbActivityInfo(this, (ActivitySamples$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ActivitySamples$PbActivityInfo.a(var2, this.value_);
      if ((var3 & 2) == 2) {
         var1 |= 2;
      }

      if (this.timeStampBuilder_ == null) {
         ActivitySamples$PbActivityInfo.a(var2, this.timeStamp_);
      } else {
         ActivitySamples$PbActivityInfo.a(var2, (Types$PbLocalDateTime)this.timeStampBuilder_.build());
      }

      int var4 = var1;
      if ((var3 & 4) == 4) {
         var4 = var1 | 4;
      }

      ActivitySamples$PbActivityInfo.a(var2, this.factor_);
      ActivitySamples$PbActivityInfo.b(var2, var4);
      this.onBuilt();
      return var2;
   }

   public ActivitySamples$PbActivityInfo$Builder clear() {
      super.clear();
      this.value_ = 1;
      this.bitField0_ &= -2;
      if (this.timeStampBuilder_ == null) {
         this.timeStamp_ = null;
      } else {
         this.timeStampBuilder_.clear();
      }

      this.bitField0_ &= -3;
      this.factor_ = 0.0F;
      this.bitField0_ &= -5;
      return this;
   }

   public ActivitySamples$PbActivityInfo$Builder clearFactor() {
      this.bitField0_ &= -5;
      this.factor_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ActivitySamples$PbActivityInfo$Builder clearField(FieldDescriptor var1) {
      return (ActivitySamples$PbActivityInfo$Builder)super.clearField(var1);
   }

   public ActivitySamples$PbActivityInfo$Builder clearOneof(OneofDescriptor var1) {
      return (ActivitySamples$PbActivityInfo$Builder)super.clearOneof(var1);
   }

   public ActivitySamples$PbActivityInfo$Builder clearTimeStamp() {
      if (this.timeStampBuilder_ == null) {
         this.timeStamp_ = null;
         this.onChanged();
      } else {
         this.timeStampBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public ActivitySamples$PbActivityInfo$Builder clearValue() {
      this.bitField0_ &= -2;
      this.value_ = 1;
      this.onChanged();
      return this;
   }

   public ActivitySamples$PbActivityInfo$Builder clone() {
      return (ActivitySamples$PbActivityInfo$Builder)super.clone();
   }

   public ActivitySamples$PbActivityInfo getDefaultInstanceForType() {
      return ActivitySamples$PbActivityInfo.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ActivitySamples.c();
   }

   public float getFactor() {
      return this.factor_;
   }

   public Types$PbLocalDateTime getTimeStamp() {
      Types$PbLocalDateTime var1;
      if (this.timeStampBuilder_ == null) {
         if (this.timeStamp_ == null) {
            var1 = Types$PbLocalDateTime.getDefaultInstance();
         } else {
            var1 = this.timeStamp_;
         }
      } else {
         var1 = (Types$PbLocalDateTime)this.timeStampBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbLocalDateTime$Builder getTimeStampBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Types$PbLocalDateTime$Builder)this.getTimeStampFieldBuilder().getBuilder();
   }

   public Types$PbLocalDateTimeOrBuilder getTimeStampOrBuilder() {
      Object var1;
      if (this.timeStampBuilder_ != null) {
         var1 = (Types$PbLocalDateTimeOrBuilder)this.timeStampBuilder_.getMessageOrBuilder();
      } else if (this.timeStamp_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.timeStamp_;
      }

      return (Types$PbLocalDateTimeOrBuilder)var1;
   }

   public ActivitySamples$PbActivityInfo$ActivityClass getValue() {
      ActivitySamples$PbActivityInfo$ActivityClass var1 = ActivitySamples$PbActivityInfo$ActivityClass.valueOf(this.value_);
      ActivitySamples$PbActivityInfo$ActivityClass var2 = var1;
      if (var1 == null) {
         var2 = ActivitySamples$PbActivityInfo$ActivityClass.SLEEP;
      }

      return var2;
   }

   public boolean hasFactor() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeStamp() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasValue() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ActivitySamples.d().ensureFieldAccessorsInitialized(ActivitySamples$PbActivityInfo.class, ActivitySamples$PbActivityInfo$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasValue()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasTimeStamp()) {
            var2 = var1;
            if (this.getTimeStamp().isInitialized()) {
               var2 = true;
            }
         }
      }

      return var2;
   }

   public ActivitySamples$PbActivityInfo$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ActivitySamples$PbActivityInfo var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (ActivitySamples$PbActivityInfo)ActivitySamples$PbActivityInfo.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (ActivitySamples$PbActivityInfo)var10.getUnfinishedMessage();
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

   public ActivitySamples$PbActivityInfo$Builder mergeFrom(Message var1) {
      ActivitySamples$PbActivityInfo$Builder var2;
      if (var1 instanceof ActivitySamples$PbActivityInfo) {
         var2 = this.mergeFrom((ActivitySamples$PbActivityInfo)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ActivitySamples$PbActivityInfo$Builder mergeFrom(ActivitySamples$PbActivityInfo var1) {
      if (var1 != ActivitySamples$PbActivityInfo.getDefaultInstance()) {
         if (var1.hasValue()) {
            this.setValue(var1.getValue());
         }

         if (var1.hasTimeStamp()) {
            this.mergeTimeStamp(var1.getTimeStamp());
         }

         if (var1.hasFactor()) {
            this.setFactor(var1.getFactor());
         }

         this.mergeUnknownFields(ActivitySamples$PbActivityInfo.a(var1));
         this.onChanged();
      }

      return this;
   }

   public ActivitySamples$PbActivityInfo$Builder mergeTimeStamp(Types$PbLocalDateTime var1) {
      if (this.timeStampBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.timeStamp_ != null && this.timeStamp_ != Types$PbLocalDateTime.getDefaultInstance()) {
            this.timeStamp_ = Types$PbLocalDateTime.newBuilder(this.timeStamp_).mergeFrom(var1).buildPartial();
         } else {
            this.timeStamp_ = var1;
         }

         this.onChanged();
      } else {
         this.timeStampBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final ActivitySamples$PbActivityInfo$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ActivitySamples$PbActivityInfo$Builder)super.mergeUnknownFields(var1);
   }

   public ActivitySamples$PbActivityInfo$Builder setFactor(float var1) {
      this.bitField0_ |= 4;
      this.factor_ = var1;
      this.onChanged();
      return this;
   }

   public ActivitySamples$PbActivityInfo$Builder setField(FieldDescriptor var1, Object var2) {
      return (ActivitySamples$PbActivityInfo$Builder)super.setField(var1, var2);
   }

   public ActivitySamples$PbActivityInfo$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ActivitySamples$PbActivityInfo$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public ActivitySamples$PbActivityInfo$Builder setTimeStamp(Types$PbLocalDateTime$Builder var1) {
      if (this.timeStampBuilder_ == null) {
         this.timeStamp_ = var1.build();
         this.onChanged();
      } else {
         this.timeStampBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ActivitySamples$PbActivityInfo$Builder setTimeStamp(Types$PbLocalDateTime var1) {
      if (this.timeStampBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.timeStamp_ = var1;
         this.onChanged();
      } else {
         this.timeStampBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final ActivitySamples$PbActivityInfo$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ActivitySamples$PbActivityInfo$Builder)super.setUnknownFields(var1);
   }

   public ActivitySamples$PbActivityInfo$Builder setValue(ActivitySamples$PbActivityInfo$ActivityClass var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.value_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }
}
