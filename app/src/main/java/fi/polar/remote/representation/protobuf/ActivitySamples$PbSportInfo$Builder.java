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

public final class ActivitySamples$PbSportInfo$Builder extends Builder implements ActivitySamples$PbSportInfoOrBuilder {
   private int bitField0_;
   private float factor_;
   private long sportProfileId_;
   private SingleFieldBuilderV3 timeStampBuilder_;
   private Types$PbLocalDateTime timeStamp_;

   private ActivitySamples$PbSportInfo$Builder() {
      this.timeStamp_ = null;
      this.maybeForceBuilderInitialization();
   }

   private ActivitySamples$PbSportInfo$Builder(BuilderParent var1) {
      super(var1);
      this.timeStamp_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ActivitySamples$PbSportInfo$Builder(BuilderParent var1, ActivitySamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ActivitySamples$PbSportInfo$Builder(ActivitySamples$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ActivitySamples.a();
   }

   private SingleFieldBuilderV3 getTimeStampFieldBuilder() {
      if (this.timeStampBuilder_ == null) {
         this.timeStampBuilder_ = new SingleFieldBuilderV3(this.getTimeStamp(), this.getParentForChildren(), this.isClean());
         this.timeStamp_ = null;
      }

      return this.timeStampBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (ActivitySamples$PbSportInfo.b()) {
         this.getTimeStampFieldBuilder();
      }

   }

   public ActivitySamples$PbSportInfo$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ActivitySamples$PbSportInfo$Builder)super.addRepeatedField(var1, var2);
   }

   public ActivitySamples$PbSportInfo build() {
      ActivitySamples$PbSportInfo var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ActivitySamples$PbSportInfo buildPartial() {
      int var1 = 1;
      ActivitySamples$PbSportInfo var2 = new ActivitySamples$PbSportInfo(this, (ActivitySamples$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ActivitySamples$PbSportInfo.a(var2, this.factor_);
      if ((var3 & 2) == 2) {
         var1 |= 2;
      }

      if (this.timeStampBuilder_ == null) {
         ActivitySamples$PbSportInfo.a(var2, this.timeStamp_);
      } else {
         ActivitySamples$PbSportInfo.a(var2, (Types$PbLocalDateTime)this.timeStampBuilder_.build());
      }

      int var4 = var1;
      if ((var3 & 4) == 4) {
         var4 = var1 | 4;
      }

      ActivitySamples$PbSportInfo.a(var2, this.sportProfileId_);
      ActivitySamples$PbSportInfo.a(var2, var4);
      this.onBuilt();
      return var2;
   }

   public ActivitySamples$PbSportInfo$Builder clear() {
      super.clear();
      this.factor_ = 0.0F;
      this.bitField0_ &= -2;
      if (this.timeStampBuilder_ == null) {
         this.timeStamp_ = null;
      } else {
         this.timeStampBuilder_.clear();
      }

      this.bitField0_ &= -3;
      this.sportProfileId_ = 0L;
      this.bitField0_ &= -5;
      return this;
   }

   public ActivitySamples$PbSportInfo$Builder clearFactor() {
      this.bitField0_ &= -2;
      this.factor_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ActivitySamples$PbSportInfo$Builder clearField(FieldDescriptor var1) {
      return (ActivitySamples$PbSportInfo$Builder)super.clearField(var1);
   }

   public ActivitySamples$PbSportInfo$Builder clearOneof(OneofDescriptor var1) {
      return (ActivitySamples$PbSportInfo$Builder)super.clearOneof(var1);
   }

   public ActivitySamples$PbSportInfo$Builder clearSportProfileId() {
      this.bitField0_ &= -5;
      this.sportProfileId_ = 0L;
      this.onChanged();
      return this;
   }

   public ActivitySamples$PbSportInfo$Builder clearTimeStamp() {
      if (this.timeStampBuilder_ == null) {
         this.timeStamp_ = null;
         this.onChanged();
      } else {
         this.timeStampBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public ActivitySamples$PbSportInfo$Builder clone() {
      return (ActivitySamples$PbSportInfo$Builder)super.clone();
   }

   public ActivitySamples$PbSportInfo getDefaultInstanceForType() {
      return ActivitySamples$PbSportInfo.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ActivitySamples.a();
   }

   public float getFactor() {
      return this.factor_;
   }

   public long getSportProfileId() {
      return this.sportProfileId_;
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

   public boolean hasFactor() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSportProfileId() {
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

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ActivitySamples.b().ensureFieldAccessorsInitialized(ActivitySamples$PbSportInfo.class, ActivitySamples$PbSportInfo$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasFactor()) {
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

   public ActivitySamples$PbSportInfo$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ActivitySamples$PbSportInfo var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (ActivitySamples$PbSportInfo)ActivitySamples$PbSportInfo.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (ActivitySamples$PbSportInfo)var11.getUnfinishedMessage();
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

   public ActivitySamples$PbSportInfo$Builder mergeFrom(Message var1) {
      ActivitySamples$PbSportInfo$Builder var2;
      if (var1 instanceof ActivitySamples$PbSportInfo) {
         var2 = this.mergeFrom((ActivitySamples$PbSportInfo)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ActivitySamples$PbSportInfo$Builder mergeFrom(ActivitySamples$PbSportInfo var1) {
      if (var1 != ActivitySamples$PbSportInfo.getDefaultInstance()) {
         if (var1.hasFactor()) {
            this.setFactor(var1.getFactor());
         }

         if (var1.hasTimeStamp()) {
            this.mergeTimeStamp(var1.getTimeStamp());
         }

         if (var1.hasSportProfileId()) {
            this.setSportProfileId(var1.getSportProfileId());
         }

         this.mergeUnknownFields(ActivitySamples$PbSportInfo.a(var1));
         this.onChanged();
      }

      return this;
   }

   public ActivitySamples$PbSportInfo$Builder mergeTimeStamp(Types$PbLocalDateTime var1) {
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

   public final ActivitySamples$PbSportInfo$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ActivitySamples$PbSportInfo$Builder)super.mergeUnknownFields(var1);
   }

   public ActivitySamples$PbSportInfo$Builder setFactor(float var1) {
      this.bitField0_ |= 1;
      this.factor_ = var1;
      this.onChanged();
      return this;
   }

   public ActivitySamples$PbSportInfo$Builder setField(FieldDescriptor var1, Object var2) {
      return (ActivitySamples$PbSportInfo$Builder)super.setField(var1, var2);
   }

   public ActivitySamples$PbSportInfo$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ActivitySamples$PbSportInfo$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public ActivitySamples$PbSportInfo$Builder setSportProfileId(long var1) {
      this.bitField0_ |= 4;
      this.sportProfileId_ = var1;
      this.onChanged();
      return this;
   }

   public ActivitySamples$PbSportInfo$Builder setTimeStamp(Types$PbLocalDateTime$Builder var1) {
      if (this.timeStampBuilder_ == null) {
         this.timeStamp_ = var1.build();
         this.onChanged();
      } else {
         this.timeStampBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ActivitySamples$PbSportInfo$Builder setTimeStamp(Types$PbLocalDateTime var1) {
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

   public final ActivitySamples$PbSportInfo$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ActivitySamples$PbSportInfo$Builder)super.setUnknownFields(var1);
   }
}
