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

public final class ActivitySamples$PbInActivityNonWearTriggerInfo$Builder extends Builder implements ActivitySamples$PbInActivityNonWearTriggerInfoOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 endTimeStampBuilder_;
   private Types$PbLocalDateTime endTimeStamp_;
   private SingleFieldBuilderV3 startTimeStampBuilder_;
   private Types$PbLocalDateTime startTimeStamp_;

   private ActivitySamples$PbInActivityNonWearTriggerInfo$Builder() {
      this.startTimeStamp_ = null;
      this.endTimeStamp_ = null;
      this.maybeForceBuilderInitialization();
   }

   private ActivitySamples$PbInActivityNonWearTriggerInfo$Builder(BuilderParent var1) {
      super(var1);
      this.startTimeStamp_ = null;
      this.endTimeStamp_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ActivitySamples$PbInActivityNonWearTriggerInfo$Builder(BuilderParent var1, ActivitySamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ActivitySamples$PbInActivityNonWearTriggerInfo$Builder(ActivitySamples$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ActivitySamples.g();
   }

   private SingleFieldBuilderV3 getEndTimeStampFieldBuilder() {
      if (this.endTimeStampBuilder_ == null) {
         this.endTimeStampBuilder_ = new SingleFieldBuilderV3(this.getEndTimeStamp(), this.getParentForChildren(), this.isClean());
         this.endTimeStamp_ = null;
      }

      return this.endTimeStampBuilder_;
   }

   private SingleFieldBuilderV3 getStartTimeStampFieldBuilder() {
      if (this.startTimeStampBuilder_ == null) {
         this.startTimeStampBuilder_ = new SingleFieldBuilderV3(this.getStartTimeStamp(), this.getParentForChildren(), this.isClean());
         this.startTimeStamp_ = null;
      }

      return this.startTimeStampBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (ActivitySamples$PbInActivityNonWearTriggerInfo.b()) {
         this.getStartTimeStampFieldBuilder();
         this.getEndTimeStampFieldBuilder();
      }

   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ActivitySamples$PbInActivityNonWearTriggerInfo$Builder)super.addRepeatedField(var1, var2);
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo build() {
      ActivitySamples$PbInActivityNonWearTriggerInfo var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo buildPartial() {
      ActivitySamples$PbInActivityNonWearTriggerInfo var1 = new ActivitySamples$PbInActivityNonWearTriggerInfo(this, (ActivitySamples$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.startTimeStampBuilder_ == null) {
         ActivitySamples$PbInActivityNonWearTriggerInfo.a(var1, this.startTimeStamp_);
      } else {
         ActivitySamples$PbInActivityNonWearTriggerInfo.a(var1, (Types$PbLocalDateTime)this.startTimeStampBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.endTimeStampBuilder_ == null) {
         ActivitySamples$PbInActivityNonWearTriggerInfo.b(var1, this.endTimeStamp_);
      } else {
         ActivitySamples$PbInActivityNonWearTriggerInfo.b(var1, (Types$PbLocalDateTime)this.endTimeStampBuilder_.build());
      }

      ActivitySamples$PbInActivityNonWearTriggerInfo.a(var1, var4);
      this.onBuilt();
      return var1;
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo$Builder clear() {
      super.clear();
      if (this.startTimeStampBuilder_ == null) {
         this.startTimeStamp_ = null;
      } else {
         this.startTimeStampBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.endTimeStampBuilder_ == null) {
         this.endTimeStamp_ = null;
      } else {
         this.endTimeStampBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo$Builder clearEndTimeStamp() {
      if (this.endTimeStampBuilder_ == null) {
         this.endTimeStamp_ = null;
         this.onChanged();
      } else {
         this.endTimeStampBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo$Builder clearField(FieldDescriptor var1) {
      return (ActivitySamples$PbInActivityNonWearTriggerInfo$Builder)super.clearField(var1);
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo$Builder clearOneof(OneofDescriptor var1) {
      return (ActivitySamples$PbInActivityNonWearTriggerInfo$Builder)super.clearOneof(var1);
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo$Builder clearStartTimeStamp() {
      if (this.startTimeStampBuilder_ == null) {
         this.startTimeStamp_ = null;
         this.onChanged();
      } else {
         this.startTimeStampBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo$Builder clone() {
      return (ActivitySamples$PbInActivityNonWearTriggerInfo$Builder)super.clone();
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo getDefaultInstanceForType() {
      return ActivitySamples$PbInActivityNonWearTriggerInfo.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ActivitySamples.g();
   }

   public Types$PbLocalDateTime getEndTimeStamp() {
      Types$PbLocalDateTime var1;
      if (this.endTimeStampBuilder_ == null) {
         if (this.endTimeStamp_ == null) {
            var1 = Types$PbLocalDateTime.getDefaultInstance();
         } else {
            var1 = this.endTimeStamp_;
         }
      } else {
         var1 = (Types$PbLocalDateTime)this.endTimeStampBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbLocalDateTime$Builder getEndTimeStampBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Types$PbLocalDateTime$Builder)this.getEndTimeStampFieldBuilder().getBuilder();
   }

   public Types$PbLocalDateTimeOrBuilder getEndTimeStampOrBuilder() {
      Object var1;
      if (this.endTimeStampBuilder_ != null) {
         var1 = (Types$PbLocalDateTimeOrBuilder)this.endTimeStampBuilder_.getMessageOrBuilder();
      } else if (this.endTimeStamp_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.endTimeStamp_;
      }

      return (Types$PbLocalDateTimeOrBuilder)var1;
   }

   public Types$PbLocalDateTime getStartTimeStamp() {
      Types$PbLocalDateTime var1;
      if (this.startTimeStampBuilder_ == null) {
         if (this.startTimeStamp_ == null) {
            var1 = Types$PbLocalDateTime.getDefaultInstance();
         } else {
            var1 = this.startTimeStamp_;
         }
      } else {
         var1 = (Types$PbLocalDateTime)this.startTimeStampBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbLocalDateTime$Builder getStartTimeStampBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Types$PbLocalDateTime$Builder)this.getStartTimeStampFieldBuilder().getBuilder();
   }

   public Types$PbLocalDateTimeOrBuilder getStartTimeStampOrBuilder() {
      Object var1;
      if (this.startTimeStampBuilder_ != null) {
         var1 = (Types$PbLocalDateTimeOrBuilder)this.startTimeStampBuilder_.getMessageOrBuilder();
      } else if (this.startTimeStamp_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.startTimeStamp_;
      }

      return (Types$PbLocalDateTimeOrBuilder)var1;
   }

   public boolean hasEndTimeStamp() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStartTimeStamp() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ActivitySamples.h().ensureFieldAccessorsInitialized(ActivitySamples$PbInActivityNonWearTriggerInfo.class, ActivitySamples$PbInActivityNonWearTriggerInfo$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasStartTimeStamp()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasEndTimeStamp()) {
            var2 = var1;
            if (this.getStartTimeStamp().isInitialized()) {
               var2 = var1;
               if (this.getEndTimeStamp().isInitialized()) {
                  var2 = true;
               }
            }
         }
      }

      return var2;
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo$Builder mergeEndTimeStamp(Types$PbLocalDateTime var1) {
      if (this.endTimeStampBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.endTimeStamp_ != null && this.endTimeStamp_ != Types$PbLocalDateTime.getDefaultInstance()) {
            this.endTimeStamp_ = Types$PbLocalDateTime.newBuilder(this.endTimeStamp_).mergeFrom(var1).buildPartial();
         } else {
            this.endTimeStamp_ = var1;
         }

         this.onChanged();
      } else {
         this.endTimeStampBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ActivitySamples$PbInActivityNonWearTriggerInfo var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (ActivitySamples$PbInActivityNonWearTriggerInfo)ActivitySamples$PbInActivityNonWearTriggerInfo.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (ActivitySamples$PbInActivityNonWearTriggerInfo)var11.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var14.unwrapIOException();
         } catch (Throwable var10) {
            if (var13 != null) {
               this.mergeFrom(var13);
            }

            throw var10;
         }
      }

      if (var13 != null) {
         this.mergeFrom(var13);
      }

      return this;
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo$Builder mergeFrom(Message var1) {
      ActivitySamples$PbInActivityNonWearTriggerInfo$Builder var2;
      if (var1 instanceof ActivitySamples$PbInActivityNonWearTriggerInfo) {
         var2 = this.mergeFrom((ActivitySamples$PbInActivityNonWearTriggerInfo)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo$Builder mergeFrom(ActivitySamples$PbInActivityNonWearTriggerInfo var1) {
      if (var1 != ActivitySamples$PbInActivityNonWearTriggerInfo.getDefaultInstance()) {
         if (var1.hasStartTimeStamp()) {
            this.mergeStartTimeStamp(var1.getStartTimeStamp());
         }

         if (var1.hasEndTimeStamp()) {
            this.mergeEndTimeStamp(var1.getEndTimeStamp());
         }

         this.mergeUnknownFields(ActivitySamples$PbInActivityNonWearTriggerInfo.a(var1));
         this.onChanged();
      }

      return this;
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo$Builder mergeStartTimeStamp(Types$PbLocalDateTime var1) {
      if (this.startTimeStampBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.startTimeStamp_ != null && this.startTimeStamp_ != Types$PbLocalDateTime.getDefaultInstance()) {
            this.startTimeStamp_ = Types$PbLocalDateTime.newBuilder(this.startTimeStamp_).mergeFrom(var1).buildPartial();
         } else {
            this.startTimeStamp_ = var1;
         }

         this.onChanged();
      } else {
         this.startTimeStampBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public final ActivitySamples$PbInActivityNonWearTriggerInfo$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ActivitySamples$PbInActivityNonWearTriggerInfo$Builder)super.mergeUnknownFields(var1);
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo$Builder setEndTimeStamp(Types$PbLocalDateTime$Builder var1) {
      if (this.endTimeStampBuilder_ == null) {
         this.endTimeStamp_ = var1.build();
         this.onChanged();
      } else {
         this.endTimeStampBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo$Builder setEndTimeStamp(Types$PbLocalDateTime var1) {
      if (this.endTimeStampBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.endTimeStamp_ = var1;
         this.onChanged();
      } else {
         this.endTimeStampBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo$Builder setField(FieldDescriptor var1, Object var2) {
      return (ActivitySamples$PbInActivityNonWearTriggerInfo$Builder)super.setField(var1, var2);
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ActivitySamples$PbInActivityNonWearTriggerInfo$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo$Builder setStartTimeStamp(Types$PbLocalDateTime$Builder var1) {
      if (this.startTimeStampBuilder_ == null) {
         this.startTimeStamp_ = var1.build();
         this.onChanged();
      } else {
         this.startTimeStampBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo$Builder setStartTimeStamp(Types$PbLocalDateTime var1) {
      if (this.startTimeStampBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.startTimeStamp_ = var1;
         this.onChanged();
      } else {
         this.startTimeStampBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public final ActivitySamples$PbInActivityNonWearTriggerInfo$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ActivitySamples$PbInActivityNonWearTriggerInfo$Builder)super.setUnknownFields(var1);
   }
}
