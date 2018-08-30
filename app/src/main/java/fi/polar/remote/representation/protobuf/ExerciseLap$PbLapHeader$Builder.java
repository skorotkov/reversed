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

public final class ExerciseLap$PbLapHeader$Builder extends Builder implements ExerciseLap$PbLapHeaderOrBuilder {
   private float ascent_;
   private int autolapType_;
   private int bitField0_;
   private float descent_;
   private float distance_;
   private SingleFieldBuilderV3 durationBuilder_;
   private Types$PbDuration duration_;
   private SingleFieldBuilderV3 splitTimeBuilder_;
   private Types$PbDuration splitTime_;

   private ExerciseLap$PbLapHeader$Builder() {
      this.splitTime_ = null;
      this.duration_ = null;
      this.autolapType_ = 1;
      this.maybeForceBuilderInitialization();
   }

   private ExerciseLap$PbLapHeader$Builder(BuilderParent var1) {
      super(var1);
      this.splitTime_ = null;
      this.duration_ = null;
      this.autolapType_ = 1;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseLap$PbLapHeader$Builder(BuilderParent var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseLap$PbLapHeader$Builder(ExerciseLap$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.a();
   }

   private SingleFieldBuilderV3 getDurationFieldBuilder() {
      if (this.durationBuilder_ == null) {
         this.durationBuilder_ = new SingleFieldBuilderV3(this.getDuration(), this.getParentForChildren(), this.isClean());
         this.duration_ = null;
      }

      return this.durationBuilder_;
   }

   private SingleFieldBuilderV3 getSplitTimeFieldBuilder() {
      if (this.splitTimeBuilder_ == null) {
         this.splitTimeBuilder_ = new SingleFieldBuilderV3(this.getSplitTime(), this.getParentForChildren(), this.isClean());
         this.splitTime_ = null;
      }

      return this.splitTimeBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseLap$PbLapHeader.b()) {
         this.getSplitTimeFieldBuilder();
         this.getDurationFieldBuilder();
      }

   }

   public ExerciseLap$PbLapHeader$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapHeader$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseLap$PbLapHeader build() {
      ExerciseLap$PbLapHeader var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseLap$PbLapHeader buildPartial() {
      ExerciseLap$PbLapHeader var1 = new ExerciseLap$PbLapHeader(this, (ExerciseLap$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.splitTimeBuilder_ == null) {
         ExerciseLap$PbLapHeader.a(var1, this.splitTime_);
      } else {
         ExerciseLap$PbLapHeader.a(var1, (Types$PbDuration)this.splitTimeBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.durationBuilder_ == null) {
         ExerciseLap$PbLapHeader.b(var1, this.duration_);
      } else {
         ExerciseLap$PbLapHeader.b(var1, (Types$PbDuration)this.durationBuilder_.build());
      }

      int var5 = var4;
      if ((var2 & 4) == 4) {
         var5 = var4 | 4;
      }

      ExerciseLap$PbLapHeader.a(var1, this.distance_);
      var4 = var5;
      if ((var2 & 8) == 8) {
         var4 = var5 | 8;
      }

      ExerciseLap$PbLapHeader.b(var1, this.ascent_);
      var5 = var4;
      if ((var2 & 16) == 16) {
         var5 = var4 | 16;
      }

      ExerciseLap$PbLapHeader.c(var1, this.descent_);
      var4 = var5;
      if ((var2 & 32) == 32) {
         var4 = var5 | 32;
      }

      ExerciseLap$PbLapHeader.a(var1, this.autolapType_);
      ExerciseLap$PbLapHeader.b(var1, var4);
      this.onBuilt();
      return var1;
   }

   public ExerciseLap$PbLapHeader$Builder clear() {
      super.clear();
      if (this.splitTimeBuilder_ == null) {
         this.splitTime_ = null;
      } else {
         this.splitTimeBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.durationBuilder_ == null) {
         this.duration_ = null;
      } else {
         this.durationBuilder_.clear();
      }

      this.bitField0_ &= -3;
      this.distance_ = 0.0F;
      this.bitField0_ &= -5;
      this.ascent_ = 0.0F;
      this.bitField0_ &= -9;
      this.descent_ = 0.0F;
      this.bitField0_ &= -17;
      this.autolapType_ = 1;
      this.bitField0_ &= -33;
      return this;
   }

   public ExerciseLap$PbLapHeader$Builder clearAscent() {
      this.bitField0_ &= -9;
      this.ascent_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapHeader$Builder clearAutolapType() {
      this.bitField0_ &= -33;
      this.autolapType_ = 1;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapHeader$Builder clearDescent() {
      this.bitField0_ &= -17;
      this.descent_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapHeader$Builder clearDistance() {
      this.bitField0_ &= -5;
      this.distance_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapHeader$Builder clearDuration() {
      if (this.durationBuilder_ == null) {
         this.duration_ = null;
         this.onChanged();
      } else {
         this.durationBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public ExerciseLap$PbLapHeader$Builder clearField(FieldDescriptor var1) {
      return (ExerciseLap$PbLapHeader$Builder)super.clearField(var1);
   }

   public ExerciseLap$PbLapHeader$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseLap$PbLapHeader$Builder)super.clearOneof(var1);
   }

   public ExerciseLap$PbLapHeader$Builder clearSplitTime() {
      if (this.splitTimeBuilder_ == null) {
         this.splitTime_ = null;
         this.onChanged();
      } else {
         this.splitTimeBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public ExerciseLap$PbLapHeader$Builder clone() {
      return (ExerciseLap$PbLapHeader$Builder)super.clone();
   }

   public float getAscent() {
      return this.ascent_;
   }

   public ExerciseLap$PbLapHeader$PbAutolapType getAutolapType() {
      ExerciseLap$PbLapHeader$PbAutolapType var1 = ExerciseLap$PbLapHeader$PbAutolapType.valueOf(this.autolapType_);
      ExerciseLap$PbLapHeader$PbAutolapType var2 = var1;
      if (var1 == null) {
         var2 = ExerciseLap$PbLapHeader$PbAutolapType.AUTOLAP_TYPE_DISTANCE;
      }

      return var2;
   }

   public ExerciseLap$PbLapHeader getDefaultInstanceForType() {
      return ExerciseLap$PbLapHeader.getDefaultInstance();
   }

   public float getDescent() {
      return this.descent_;
   }

   public Descriptor getDescriptorForType() {
      return ExerciseLap.a();
   }

   public float getDistance() {
      return this.distance_;
   }

   public Types$PbDuration getDuration() {
      Types$PbDuration var1;
      if (this.durationBuilder_ == null) {
         if (this.duration_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.duration_;
         }
      } else {
         var1 = (Types$PbDuration)this.durationBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getDurationBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getDurationFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getDurationOrBuilder() {
      Object var1;
      if (this.durationBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.durationBuilder_.getMessageOrBuilder();
      } else if (this.duration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.duration_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public Types$PbDuration getSplitTime() {
      Types$PbDuration var1;
      if (this.splitTimeBuilder_ == null) {
         if (this.splitTime_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.splitTime_;
         }
      } else {
         var1 = (Types$PbDuration)this.splitTimeBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getSplitTimeBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getSplitTimeFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getSplitTimeOrBuilder() {
      Object var1;
      if (this.splitTimeBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.splitTimeBuilder_.getMessageOrBuilder();
      } else if (this.splitTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.splitTime_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public boolean hasAscent() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAutolapType() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDescent() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDistance() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDuration() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSplitTime() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseLap.b().ensureFieldAccessorsInitialized(ExerciseLap$PbLapHeader.class, ExerciseLap$PbLapHeader$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasSplitTime() && this.hasDuration()) {
         var1 = true;
      }

      return var1;
   }

   public ExerciseLap$PbLapHeader$Builder mergeDuration(Types$PbDuration var1) {
      if (this.durationBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.duration_ != null && this.duration_ != Types$PbDuration.getDefaultInstance()) {
            this.duration_ = Types$PbDuration.newBuilder(this.duration_).mergeFrom(var1).buildPartial();
         } else {
            this.duration_ = var1;
         }

         this.onChanged();
      } else {
         this.durationBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExerciseLap$PbLapHeader$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseLap$PbLapHeader var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (ExerciseLap$PbLapHeader)ExerciseLap$PbLapHeader.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (ExerciseLap$PbLapHeader)var10.getUnfinishedMessage();
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

   public ExerciseLap$PbLapHeader$Builder mergeFrom(Message var1) {
      ExerciseLap$PbLapHeader$Builder var2;
      if (var1 instanceof ExerciseLap$PbLapHeader) {
         var2 = this.mergeFrom((ExerciseLap$PbLapHeader)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseLap$PbLapHeader$Builder mergeFrom(ExerciseLap$PbLapHeader var1) {
      if (var1 != ExerciseLap$PbLapHeader.getDefaultInstance()) {
         if (var1.hasSplitTime()) {
            this.mergeSplitTime(var1.getSplitTime());
         }

         if (var1.hasDuration()) {
            this.mergeDuration(var1.getDuration());
         }

         if (var1.hasDistance()) {
            this.setDistance(var1.getDistance());
         }

         if (var1.hasAscent()) {
            this.setAscent(var1.getAscent());
         }

         if (var1.hasDescent()) {
            this.setDescent(var1.getDescent());
         }

         if (var1.hasAutolapType()) {
            this.setAutolapType(var1.getAutolapType());
         }

         this.mergeUnknownFields(ExerciseLap$PbLapHeader.a(var1));
         this.onChanged();
      }

      return this;
   }

   public ExerciseLap$PbLapHeader$Builder mergeSplitTime(Types$PbDuration var1) {
      if (this.splitTimeBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.splitTime_ != null && this.splitTime_ != Types$PbDuration.getDefaultInstance()) {
            this.splitTime_ = Types$PbDuration.newBuilder(this.splitTime_).mergeFrom(var1).buildPartial();
         } else {
            this.splitTime_ = var1;
         }

         this.onChanged();
      } else {
         this.splitTimeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public final ExerciseLap$PbLapHeader$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapHeader$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseLap$PbLapHeader$Builder setAscent(float var1) {
      this.bitField0_ |= 8;
      this.ascent_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapHeader$Builder setAutolapType(ExerciseLap$PbLapHeader$PbAutolapType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 32;
         this.autolapType_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public ExerciseLap$PbLapHeader$Builder setDescent(float var1) {
      this.bitField0_ |= 16;
      this.descent_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapHeader$Builder setDistance(float var1) {
      this.bitField0_ |= 4;
      this.distance_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapHeader$Builder setDuration(Types$PbDuration$Builder var1) {
      if (this.durationBuilder_ == null) {
         this.duration_ = var1.build();
         this.onChanged();
      } else {
         this.durationBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExerciseLap$PbLapHeader$Builder setDuration(Types$PbDuration var1) {
      if (this.durationBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.duration_ = var1;
         this.onChanged();
      } else {
         this.durationBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExerciseLap$PbLapHeader$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapHeader$Builder)super.setField(var1, var2);
   }

   public ExerciseLap$PbLapHeader$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseLap$PbLapHeader$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public ExerciseLap$PbLapHeader$Builder setSplitTime(Types$PbDuration$Builder var1) {
      if (this.splitTimeBuilder_ == null) {
         this.splitTime_ = var1.build();
         this.onChanged();
      } else {
         this.splitTimeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ExerciseLap$PbLapHeader$Builder setSplitTime(Types$PbDuration var1) {
      if (this.splitTimeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.splitTime_ = var1;
         this.onChanged();
      } else {
         this.splitTimeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public final ExerciseLap$PbLapHeader$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapHeader$Builder)super.setUnknownFields(var1);
   }
}
