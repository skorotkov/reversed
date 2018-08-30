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

public final class ActivitySamples$PbInActivityTriggerInfo$Builder extends Builder implements ActivitySamples$PbInActivityTriggerInfoOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 timeStampBuilder_;
   private Types$PbLocalDateTime timeStamp_;

   private ActivitySamples$PbInActivityTriggerInfo$Builder() {
      this.timeStamp_ = null;
      this.maybeForceBuilderInitialization();
   }

   private ActivitySamples$PbInActivityTriggerInfo$Builder(BuilderParent var1) {
      super(var1);
      this.timeStamp_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ActivitySamples$PbInActivityTriggerInfo$Builder(BuilderParent var1, ActivitySamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ActivitySamples$PbInActivityTriggerInfo$Builder(ActivitySamples$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ActivitySamples.e();
   }

   private SingleFieldBuilderV3 getTimeStampFieldBuilder() {
      if (this.timeStampBuilder_ == null) {
         this.timeStampBuilder_ = new SingleFieldBuilderV3(this.getTimeStamp(), this.getParentForChildren(), this.isClean());
         this.timeStamp_ = null;
      }

      return this.timeStampBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (ActivitySamples$PbInActivityTriggerInfo.b()) {
         this.getTimeStampFieldBuilder();
      }

   }

   public ActivitySamples$PbInActivityTriggerInfo$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ActivitySamples$PbInActivityTriggerInfo$Builder)super.addRepeatedField(var1, var2);
   }

   public ActivitySamples$PbInActivityTriggerInfo build() {
      ActivitySamples$PbInActivityTriggerInfo var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ActivitySamples$PbInActivityTriggerInfo buildPartial() {
      ActivitySamples$PbInActivityTriggerInfo var1 = new ActivitySamples$PbInActivityTriggerInfo(this, (ActivitySamples$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.timeStampBuilder_ == null) {
         ActivitySamples$PbInActivityTriggerInfo.a(var1, this.timeStamp_);
      } else {
         ActivitySamples$PbInActivityTriggerInfo.a(var1, (Types$PbLocalDateTime)this.timeStampBuilder_.build());
      }

      ActivitySamples$PbInActivityTriggerInfo.a(var1, var3);
      this.onBuilt();
      return var1;
   }

   public ActivitySamples$PbInActivityTriggerInfo$Builder clear() {
      super.clear();
      if (this.timeStampBuilder_ == null) {
         this.timeStamp_ = null;
      } else {
         this.timeStampBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public ActivitySamples$PbInActivityTriggerInfo$Builder clearField(FieldDescriptor var1) {
      return (ActivitySamples$PbInActivityTriggerInfo$Builder)super.clearField(var1);
   }

   public ActivitySamples$PbInActivityTriggerInfo$Builder clearOneof(OneofDescriptor var1) {
      return (ActivitySamples$PbInActivityTriggerInfo$Builder)super.clearOneof(var1);
   }

   public ActivitySamples$PbInActivityTriggerInfo$Builder clearTimeStamp() {
      if (this.timeStampBuilder_ == null) {
         this.timeStamp_ = null;
         this.onChanged();
      } else {
         this.timeStampBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public ActivitySamples$PbInActivityTriggerInfo$Builder clone() {
      return (ActivitySamples$PbInActivityTriggerInfo$Builder)super.clone();
   }

   public ActivitySamples$PbInActivityTriggerInfo getDefaultInstanceForType() {
      return ActivitySamples$PbInActivityTriggerInfo.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ActivitySamples.e();
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
      this.bitField0_ |= 1;
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

   public boolean hasTimeStamp() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ActivitySamples.f().ensureFieldAccessorsInitialized(ActivitySamples$PbInActivityTriggerInfo.class, ActivitySamples$PbInActivityTriggerInfo$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasTimeStamp() && this.getTimeStamp().isInitialized()) {
         var1 = true;
      }

      return var1;
   }

   public ActivitySamples$PbInActivityTriggerInfo$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ActivitySamples$PbInActivityTriggerInfo var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (ActivitySamples$PbInActivityTriggerInfo)ActivitySamples$PbInActivityTriggerInfo.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (ActivitySamples$PbInActivityTriggerInfo)var10.getUnfinishedMessage();
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

   public ActivitySamples$PbInActivityTriggerInfo$Builder mergeFrom(Message var1) {
      ActivitySamples$PbInActivityTriggerInfo$Builder var2;
      if (var1 instanceof ActivitySamples$PbInActivityTriggerInfo) {
         var2 = this.mergeFrom((ActivitySamples$PbInActivityTriggerInfo)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ActivitySamples$PbInActivityTriggerInfo$Builder mergeFrom(ActivitySamples$PbInActivityTriggerInfo var1) {
      if (var1 != ActivitySamples$PbInActivityTriggerInfo.getDefaultInstance()) {
         if (var1.hasTimeStamp()) {
            this.mergeTimeStamp(var1.getTimeStamp());
         }

         this.mergeUnknownFields(ActivitySamples$PbInActivityTriggerInfo.a(var1));
         this.onChanged();
      }

      return this;
   }

   public ActivitySamples$PbInActivityTriggerInfo$Builder mergeTimeStamp(Types$PbLocalDateTime var1) {
      if (this.timeStampBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.timeStamp_ != null && this.timeStamp_ != Types$PbLocalDateTime.getDefaultInstance()) {
            this.timeStamp_ = Types$PbLocalDateTime.newBuilder(this.timeStamp_).mergeFrom(var1).buildPartial();
         } else {
            this.timeStamp_ = var1;
         }

         this.onChanged();
      } else {
         this.timeStampBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public final ActivitySamples$PbInActivityTriggerInfo$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ActivitySamples$PbInActivityTriggerInfo$Builder)super.mergeUnknownFields(var1);
   }

   public ActivitySamples$PbInActivityTriggerInfo$Builder setField(FieldDescriptor var1, Object var2) {
      return (ActivitySamples$PbInActivityTriggerInfo$Builder)super.setField(var1, var2);
   }

   public ActivitySamples$PbInActivityTriggerInfo$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ActivitySamples$PbInActivityTriggerInfo$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public ActivitySamples$PbInActivityTriggerInfo$Builder setTimeStamp(Types$PbLocalDateTime$Builder var1) {
      if (this.timeStampBuilder_ == null) {
         this.timeStamp_ = var1.build();
         this.onChanged();
      } else {
         this.timeStampBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ActivitySamples$PbInActivityTriggerInfo$Builder setTimeStamp(Types$PbLocalDateTime var1) {
      if (this.timeStampBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.timeStamp_ = var1;
         this.onChanged();
      } else {
         this.timeStampBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public final ActivitySamples$PbInActivityTriggerInfo$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ActivitySamples$PbInActivityTriggerInfo$Builder)super.setUnknownFields(var1);
   }
}
