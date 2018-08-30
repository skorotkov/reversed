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

public final class ExerciseLap$PbLapSummary$Builder extends Builder implements ExerciseLap$PbLapSummaryOrBuilder {
   private SingleFieldBuilderV3 averageLapDurationBuilder_;
   private Types$PbDuration averageLapDuration_;
   private SingleFieldBuilderV3 bestLapDurationBuilder_;
   private Types$PbDuration bestLapDuration_;
   private int bitField0_;

   private ExerciseLap$PbLapSummary$Builder() {
      this.bestLapDuration_ = null;
      this.averageLapDuration_ = null;
      this.maybeForceBuilderInitialization();
   }

   private ExerciseLap$PbLapSummary$Builder(BuilderParent var1) {
      super(var1);
      this.bestLapDuration_ = null;
      this.averageLapDuration_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseLap$PbLapSummary$Builder(BuilderParent var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseLap$PbLapSummary$Builder(ExerciseLap$1 var1) {
      this();
   }

   private SingleFieldBuilderV3 getAverageLapDurationFieldBuilder() {
      if (this.averageLapDurationBuilder_ == null) {
         this.averageLapDurationBuilder_ = new SingleFieldBuilderV3(this.getAverageLapDuration(), this.getParentForChildren(), this.isClean());
         this.averageLapDuration_ = null;
      }

      return this.averageLapDurationBuilder_;
   }

   private SingleFieldBuilderV3 getBestLapDurationFieldBuilder() {
      if (this.bestLapDurationBuilder_ == null) {
         this.bestLapDurationBuilder_ = new SingleFieldBuilderV3(this.getBestLapDuration(), this.getParentForChildren(), this.isClean());
         this.bestLapDuration_ = null;
      }

      return this.bestLapDurationBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.C();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseLap$PbLapSummary.b()) {
         this.getBestLapDurationFieldBuilder();
         this.getAverageLapDurationFieldBuilder();
      }

   }

   public ExerciseLap$PbLapSummary$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapSummary$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseLap$PbLapSummary build() {
      ExerciseLap$PbLapSummary var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseLap$PbLapSummary buildPartial() {
      ExerciseLap$PbLapSummary var1 = new ExerciseLap$PbLapSummary(this, (ExerciseLap$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.bestLapDurationBuilder_ == null) {
         ExerciseLap$PbLapSummary.a(var1, this.bestLapDuration_);
      } else {
         ExerciseLap$PbLapSummary.a(var1, (Types$PbDuration)this.bestLapDurationBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.averageLapDurationBuilder_ == null) {
         ExerciseLap$PbLapSummary.b(var1, this.averageLapDuration_);
      } else {
         ExerciseLap$PbLapSummary.b(var1, (Types$PbDuration)this.averageLapDurationBuilder_.build());
      }

      ExerciseLap$PbLapSummary.a(var1, var4);
      this.onBuilt();
      return var1;
   }

   public ExerciseLap$PbLapSummary$Builder clear() {
      super.clear();
      if (this.bestLapDurationBuilder_ == null) {
         this.bestLapDuration_ = null;
      } else {
         this.bestLapDurationBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.averageLapDurationBuilder_ == null) {
         this.averageLapDuration_ = null;
      } else {
         this.averageLapDurationBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public ExerciseLap$PbLapSummary$Builder clearAverageLapDuration() {
      if (this.averageLapDurationBuilder_ == null) {
         this.averageLapDuration_ = null;
         this.onChanged();
      } else {
         this.averageLapDurationBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public ExerciseLap$PbLapSummary$Builder clearBestLapDuration() {
      if (this.bestLapDurationBuilder_ == null) {
         this.bestLapDuration_ = null;
         this.onChanged();
      } else {
         this.bestLapDurationBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public ExerciseLap$PbLapSummary$Builder clearField(FieldDescriptor var1) {
      return (ExerciseLap$PbLapSummary$Builder)super.clearField(var1);
   }

   public ExerciseLap$PbLapSummary$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseLap$PbLapSummary$Builder)super.clearOneof(var1);
   }

   public ExerciseLap$PbLapSummary$Builder clone() {
      return (ExerciseLap$PbLapSummary$Builder)super.clone();
   }

   public Types$PbDuration getAverageLapDuration() {
      Types$PbDuration var1;
      if (this.averageLapDurationBuilder_ == null) {
         if (this.averageLapDuration_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.averageLapDuration_;
         }
      } else {
         var1 = (Types$PbDuration)this.averageLapDurationBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getAverageLapDurationBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getAverageLapDurationFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getAverageLapDurationOrBuilder() {
      Object var1;
      if (this.averageLapDurationBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.averageLapDurationBuilder_.getMessageOrBuilder();
      } else if (this.averageLapDuration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.averageLapDuration_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public Types$PbDuration getBestLapDuration() {
      Types$PbDuration var1;
      if (this.bestLapDurationBuilder_ == null) {
         if (this.bestLapDuration_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.bestLapDuration_;
         }
      } else {
         var1 = (Types$PbDuration)this.bestLapDurationBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getBestLapDurationBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getBestLapDurationFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getBestLapDurationOrBuilder() {
      Object var1;
      if (this.bestLapDurationBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.bestLapDurationBuilder_.getMessageOrBuilder();
      } else if (this.bestLapDuration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.bestLapDuration_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public ExerciseLap$PbLapSummary getDefaultInstanceForType() {
      return ExerciseLap$PbLapSummary.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseLap.C();
   }

   public boolean hasAverageLapDuration() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasBestLapDuration() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseLap.D().ensureFieldAccessorsInitialized(ExerciseLap$PbLapSummary.class, ExerciseLap$PbLapSummary$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExerciseLap$PbLapSummary$Builder mergeAverageLapDuration(Types$PbDuration var1) {
      if (this.averageLapDurationBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.averageLapDuration_ != null && this.averageLapDuration_ != Types$PbDuration.getDefaultInstance()) {
            this.averageLapDuration_ = Types$PbDuration.newBuilder(this.averageLapDuration_).mergeFrom(var1).buildPartial();
         } else {
            this.averageLapDuration_ = var1;
         }

         this.onChanged();
      } else {
         this.averageLapDurationBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExerciseLap$PbLapSummary$Builder mergeBestLapDuration(Types$PbDuration var1) {
      if (this.bestLapDurationBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.bestLapDuration_ != null && this.bestLapDuration_ != Types$PbDuration.getDefaultInstance()) {
            this.bestLapDuration_ = Types$PbDuration.newBuilder(this.bestLapDuration_).mergeFrom(var1).buildPartial();
         } else {
            this.bestLapDuration_ = var1;
         }

         this.onChanged();
      } else {
         this.bestLapDurationBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ExerciseLap$PbLapSummary$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseLap$PbLapSummary var13;
      label96: {
         InvalidProtocolBufferException var12;
         ExerciseLap$PbLapSummary var14;
         try {
            var13 = (ExerciseLap$PbLapSummary)ExerciseLap$PbLapSummary.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (ExerciseLap$PbLapSummary)var10.getUnfinishedMessage();
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

   public ExerciseLap$PbLapSummary$Builder mergeFrom(Message var1) {
      ExerciseLap$PbLapSummary$Builder var2;
      if (var1 instanceof ExerciseLap$PbLapSummary) {
         var2 = this.mergeFrom((ExerciseLap$PbLapSummary)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseLap$PbLapSummary$Builder mergeFrom(ExerciseLap$PbLapSummary var1) {
      if (var1 != ExerciseLap$PbLapSummary.getDefaultInstance()) {
         if (var1.hasBestLapDuration()) {
            this.mergeBestLapDuration(var1.getBestLapDuration());
         }

         if (var1.hasAverageLapDuration()) {
            this.mergeAverageLapDuration(var1.getAverageLapDuration());
         }

         this.mergeUnknownFields(ExerciseLap$PbLapSummary.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseLap$PbLapSummary$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapSummary$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseLap$PbLapSummary$Builder setAverageLapDuration(Types$PbDuration$Builder var1) {
      if (this.averageLapDurationBuilder_ == null) {
         this.averageLapDuration_ = var1.build();
         this.onChanged();
      } else {
         this.averageLapDurationBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExerciseLap$PbLapSummary$Builder setAverageLapDuration(Types$PbDuration var1) {
      if (this.averageLapDurationBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.averageLapDuration_ = var1;
         this.onChanged();
      } else {
         this.averageLapDurationBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExerciseLap$PbLapSummary$Builder setBestLapDuration(Types$PbDuration$Builder var1) {
      if (this.bestLapDurationBuilder_ == null) {
         this.bestLapDuration_ = var1.build();
         this.onChanged();
      } else {
         this.bestLapDurationBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ExerciseLap$PbLapSummary$Builder setBestLapDuration(Types$PbDuration var1) {
      if (this.bestLapDurationBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bestLapDuration_ = var1;
         this.onChanged();
      } else {
         this.bestLapDurationBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ExerciseLap$PbLapSummary$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapSummary$Builder)super.setField(var1, var2);
   }

   public ExerciseLap$PbLapSummary$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseLap$PbLapSummary$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExerciseLap$PbLapSummary$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapSummary$Builder)super.setUnknownFields(var1);
   }
}
