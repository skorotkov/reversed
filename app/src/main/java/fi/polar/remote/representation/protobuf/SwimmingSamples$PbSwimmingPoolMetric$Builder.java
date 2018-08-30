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

public final class SwimmingSamples$PbSwimmingPoolMetric$Builder extends Builder implements SwimmingSamples$PbSwimmingPoolMetricOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 durationBuilder_;
   private Types$PbDuration duration_;
   private SingleFieldBuilderV3 startOffsetBuilder_;
   private Types$PbDuration startOffset_;
   private int strokes_;
   private int style_;

   private SwimmingSamples$PbSwimmingPoolMetric$Builder() {
      this.startOffset_ = null;
      this.duration_ = null;
      this.style_ = -1;
      this.maybeForceBuilderInitialization();
   }

   private SwimmingSamples$PbSwimmingPoolMetric$Builder(BuilderParent var1) {
      super(var1);
      this.startOffset_ = null;
      this.duration_ = null;
      this.style_ = -1;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   SwimmingSamples$PbSwimmingPoolMetric$Builder(BuilderParent var1, SwimmingSamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   SwimmingSamples$PbSwimmingPoolMetric$Builder(SwimmingSamples$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return SwimmingSamples.c();
   }

   private SingleFieldBuilderV3 getDurationFieldBuilder() {
      if (this.durationBuilder_ == null) {
         this.durationBuilder_ = new SingleFieldBuilderV3(this.getDuration(), this.getParentForChildren(), this.isClean());
         this.duration_ = null;
      }

      return this.durationBuilder_;
   }

   private SingleFieldBuilderV3 getStartOffsetFieldBuilder() {
      if (this.startOffsetBuilder_ == null) {
         this.startOffsetBuilder_ = new SingleFieldBuilderV3(this.getStartOffset(), this.getParentForChildren(), this.isClean());
         this.startOffset_ = null;
      }

      return this.startOffsetBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (SwimmingSamples$PbSwimmingPoolMetric.b()) {
         this.getStartOffsetFieldBuilder();
         this.getDurationFieldBuilder();
      }

   }

   public SwimmingSamples$PbSwimmingPoolMetric$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (SwimmingSamples$PbSwimmingPoolMetric$Builder)super.addRepeatedField(var1, var2);
   }

   public SwimmingSamples$PbSwimmingPoolMetric build() {
      SwimmingSamples$PbSwimmingPoolMetric var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public SwimmingSamples$PbSwimmingPoolMetric buildPartial() {
      SwimmingSamples$PbSwimmingPoolMetric var1 = new SwimmingSamples$PbSwimmingPoolMetric(this, (SwimmingSamples$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.startOffsetBuilder_ == null) {
         SwimmingSamples$PbSwimmingPoolMetric.a(var1, this.startOffset_);
      } else {
         SwimmingSamples$PbSwimmingPoolMetric.a(var1, (Types$PbDuration)this.startOffsetBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.durationBuilder_ == null) {
         SwimmingSamples$PbSwimmingPoolMetric.b(var1, this.duration_);
      } else {
         SwimmingSamples$PbSwimmingPoolMetric.b(var1, (Types$PbDuration)this.durationBuilder_.build());
      }

      int var5 = var4;
      if ((var2 & 4) == 4) {
         var5 = var4 | 4;
      }

      SwimmingSamples$PbSwimmingPoolMetric.a(var1, this.style_);
      var4 = var5;
      if ((var2 & 8) == 8) {
         var4 = var5 | 8;
      }

      SwimmingSamples$PbSwimmingPoolMetric.b(var1, this.strokes_);
      SwimmingSamples$PbSwimmingPoolMetric.c(var1, var4);
      this.onBuilt();
      return var1;
   }

   public SwimmingSamples$PbSwimmingPoolMetric$Builder clear() {
      super.clear();
      if (this.startOffsetBuilder_ == null) {
         this.startOffset_ = null;
      } else {
         this.startOffsetBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.durationBuilder_ == null) {
         this.duration_ = null;
      } else {
         this.durationBuilder_.clear();
      }

      this.bitField0_ &= -3;
      this.style_ = -1;
      this.bitField0_ &= -5;
      this.strokes_ = 0;
      this.bitField0_ &= -9;
      return this;
   }

   public SwimmingSamples$PbSwimmingPoolMetric$Builder clearDuration() {
      if (this.durationBuilder_ == null) {
         this.duration_ = null;
         this.onChanged();
      } else {
         this.durationBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public SwimmingSamples$PbSwimmingPoolMetric$Builder clearField(FieldDescriptor var1) {
      return (SwimmingSamples$PbSwimmingPoolMetric$Builder)super.clearField(var1);
   }

   public SwimmingSamples$PbSwimmingPoolMetric$Builder clearOneof(OneofDescriptor var1) {
      return (SwimmingSamples$PbSwimmingPoolMetric$Builder)super.clearOneof(var1);
   }

   public SwimmingSamples$PbSwimmingPoolMetric$Builder clearStartOffset() {
      if (this.startOffsetBuilder_ == null) {
         this.startOffset_ = null;
         this.onChanged();
      } else {
         this.startOffsetBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public SwimmingSamples$PbSwimmingPoolMetric$Builder clearStrokes() {
      this.bitField0_ &= -9;
      this.strokes_ = 0;
      this.onChanged();
      return this;
   }

   public SwimmingSamples$PbSwimmingPoolMetric$Builder clearStyle() {
      this.bitField0_ &= -5;
      this.style_ = -1;
      this.onChanged();
      return this;
   }

   public SwimmingSamples$PbSwimmingPoolMetric$Builder clone() {
      return (SwimmingSamples$PbSwimmingPoolMetric$Builder)super.clone();
   }

   public SwimmingSamples$PbSwimmingPoolMetric getDefaultInstanceForType() {
      return SwimmingSamples$PbSwimmingPoolMetric.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return SwimmingSamples.c();
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

   public Types$PbDuration getStartOffset() {
      Types$PbDuration var1;
      if (this.startOffsetBuilder_ == null) {
         if (this.startOffset_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.startOffset_;
         }
      } else {
         var1 = (Types$PbDuration)this.startOffsetBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getStartOffsetBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getStartOffsetFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getStartOffsetOrBuilder() {
      Object var1;
      if (this.startOffsetBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.startOffsetBuilder_.getMessageOrBuilder();
      } else if (this.startOffset_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.startOffset_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public int getStrokes() {
      return this.strokes_;
   }

   public Types$PbSwimmingStyle getStyle() {
      Types$PbSwimmingStyle var1 = Types$PbSwimmingStyle.valueOf(this.style_);
      Types$PbSwimmingStyle var2 = var1;
      if (var1 == null) {
         var2 = Types$PbSwimmingStyle.OTHER;
      }

      return var2;
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

   public boolean hasStartOffset() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStrokes() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStyle() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SwimmingSamples.d().ensureFieldAccessorsInitialized(SwimmingSamples$PbSwimmingPoolMetric.class, SwimmingSamples$PbSwimmingPoolMetric$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasStartOffset() && this.hasDuration()) {
         var1 = true;
      }

      return var1;
   }

   public SwimmingSamples$PbSwimmingPoolMetric$Builder mergeDuration(Types$PbDuration var1) {
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

   public SwimmingSamples$PbSwimmingPoolMetric$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      SwimmingSamples$PbSwimmingPoolMetric var13;
      label96: {
         InvalidProtocolBufferException var12;
         SwimmingSamples$PbSwimmingPoolMetric var14;
         try {
            var13 = (SwimmingSamples$PbSwimmingPoolMetric)SwimmingSamples$PbSwimmingPoolMetric.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (SwimmingSamples$PbSwimmingPoolMetric)var10.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var12.unwrapIOException();
         } finally {
            if (var14 != null) {
               this.mergeFrom(var14);
            }

            throw var12;
         }
      }

      if (var13 != null) {
         this.mergeFrom(var13);
      }

      return this;
   }

   public SwimmingSamples$PbSwimmingPoolMetric$Builder mergeFrom(Message var1) {
      SwimmingSamples$PbSwimmingPoolMetric$Builder var2;
      if (var1 instanceof SwimmingSamples$PbSwimmingPoolMetric) {
         var2 = this.mergeFrom((SwimmingSamples$PbSwimmingPoolMetric)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public SwimmingSamples$PbSwimmingPoolMetric$Builder mergeFrom(SwimmingSamples$PbSwimmingPoolMetric var1) {
      if (var1 != SwimmingSamples$PbSwimmingPoolMetric.getDefaultInstance()) {
         if (var1.hasStartOffset()) {
            this.mergeStartOffset(var1.getStartOffset());
         }

         if (var1.hasDuration()) {
            this.mergeDuration(var1.getDuration());
         }

         if (var1.hasStyle()) {
            this.setStyle(var1.getStyle());
         }

         if (var1.hasStrokes()) {
            this.setStrokes(var1.getStrokes());
         }

         this.mergeUnknownFields(SwimmingSamples$PbSwimmingPoolMetric.a(var1));
         this.onChanged();
      }

      return this;
   }

   public SwimmingSamples$PbSwimmingPoolMetric$Builder mergeStartOffset(Types$PbDuration var1) {
      if (this.startOffsetBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.startOffset_ != null && this.startOffset_ != Types$PbDuration.getDefaultInstance()) {
            this.startOffset_ = Types$PbDuration.newBuilder(this.startOffset_).mergeFrom(var1).buildPartial();
         } else {
            this.startOffset_ = var1;
         }

         this.onChanged();
      } else {
         this.startOffsetBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public final SwimmingSamples$PbSwimmingPoolMetric$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (SwimmingSamples$PbSwimmingPoolMetric$Builder)super.mergeUnknownFields(var1);
   }

   public SwimmingSamples$PbSwimmingPoolMetric$Builder setDuration(Types$PbDuration$Builder var1) {
      if (this.durationBuilder_ == null) {
         this.duration_ = var1.build();
         this.onChanged();
      } else {
         this.durationBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public SwimmingSamples$PbSwimmingPoolMetric$Builder setDuration(Types$PbDuration var1) {
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

   public SwimmingSamples$PbSwimmingPoolMetric$Builder setField(FieldDescriptor var1, Object var2) {
      return (SwimmingSamples$PbSwimmingPoolMetric$Builder)super.setField(var1, var2);
   }

   public SwimmingSamples$PbSwimmingPoolMetric$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (SwimmingSamples$PbSwimmingPoolMetric$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public SwimmingSamples$PbSwimmingPoolMetric$Builder setStartOffset(Types$PbDuration$Builder var1) {
      if (this.startOffsetBuilder_ == null) {
         this.startOffset_ = var1.build();
         this.onChanged();
      } else {
         this.startOffsetBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public SwimmingSamples$PbSwimmingPoolMetric$Builder setStartOffset(Types$PbDuration var1) {
      if (this.startOffsetBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.startOffset_ = var1;
         this.onChanged();
      } else {
         this.startOffsetBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public SwimmingSamples$PbSwimmingPoolMetric$Builder setStrokes(int var1) {
      this.bitField0_ |= 8;
      this.strokes_ = var1;
      this.onChanged();
      return this;
   }

   public SwimmingSamples$PbSwimmingPoolMetric$Builder setStyle(Types$PbSwimmingStyle var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 4;
         this.style_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public final SwimmingSamples$PbSwimmingPoolMetric$Builder setUnknownFields(UnknownFieldSet var1) {
      return (SwimmingSamples$PbSwimmingPoolMetric$Builder)super.setUnknownFields(var1);
   }
}
