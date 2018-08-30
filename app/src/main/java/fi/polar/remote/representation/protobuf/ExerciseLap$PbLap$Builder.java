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

public final class ExerciseLap$PbLap$Builder extends Builder implements ExerciseLap$PbLapOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 headerBuilder_;
   private ExerciseLap$PbLapHeader header_;
   private SingleFieldBuilderV3 statisticsBuilder_;
   private ExerciseLap$PbLapStatistics statistics_;

   private ExerciseLap$PbLap$Builder() {
      this.header_ = null;
      this.statistics_ = null;
      this.maybeForceBuilderInitialization();
   }

   private ExerciseLap$PbLap$Builder(BuilderParent var1) {
      super(var1);
      this.header_ = null;
      this.statistics_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseLap$PbLap$Builder(BuilderParent var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseLap$PbLap$Builder(ExerciseLap$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.A();
   }

   private SingleFieldBuilderV3 getHeaderFieldBuilder() {
      if (this.headerBuilder_ == null) {
         this.headerBuilder_ = new SingleFieldBuilderV3(this.getHeader(), this.getParentForChildren(), this.isClean());
         this.header_ = null;
      }

      return this.headerBuilder_;
   }

   private SingleFieldBuilderV3 getStatisticsFieldBuilder() {
      if (this.statisticsBuilder_ == null) {
         this.statisticsBuilder_ = new SingleFieldBuilderV3(this.getStatistics(), this.getParentForChildren(), this.isClean());
         this.statistics_ = null;
      }

      return this.statisticsBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseLap$PbLap.b()) {
         this.getHeaderFieldBuilder();
         this.getStatisticsFieldBuilder();
      }

   }

   public ExerciseLap$PbLap$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLap$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseLap$PbLap build() {
      ExerciseLap$PbLap var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseLap$PbLap buildPartial() {
      ExerciseLap$PbLap var1 = new ExerciseLap$PbLap(this, (ExerciseLap$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.headerBuilder_ == null) {
         ExerciseLap$PbLap.a(var1, this.header_);
      } else {
         ExerciseLap$PbLap.a(var1, (ExerciseLap$PbLapHeader)this.headerBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.statisticsBuilder_ == null) {
         ExerciseLap$PbLap.a(var1, this.statistics_);
      } else {
         ExerciseLap$PbLap.a(var1, (ExerciseLap$PbLapStatistics)this.statisticsBuilder_.build());
      }

      ExerciseLap$PbLap.a(var1, var4);
      this.onBuilt();
      return var1;
   }

   public ExerciseLap$PbLap$Builder clear() {
      super.clear();
      if (this.headerBuilder_ == null) {
         this.header_ = null;
      } else {
         this.headerBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.statisticsBuilder_ == null) {
         this.statistics_ = null;
      } else {
         this.statisticsBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public ExerciseLap$PbLap$Builder clearField(FieldDescriptor var1) {
      return (ExerciseLap$PbLap$Builder)super.clearField(var1);
   }

   public ExerciseLap$PbLap$Builder clearHeader() {
      if (this.headerBuilder_ == null) {
         this.header_ = null;
         this.onChanged();
      } else {
         this.headerBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public ExerciseLap$PbLap$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseLap$PbLap$Builder)super.clearOneof(var1);
   }

   public ExerciseLap$PbLap$Builder clearStatistics() {
      if (this.statisticsBuilder_ == null) {
         this.statistics_ = null;
         this.onChanged();
      } else {
         this.statisticsBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public ExerciseLap$PbLap$Builder clone() {
      return (ExerciseLap$PbLap$Builder)super.clone();
   }

   public ExerciseLap$PbLap getDefaultInstanceForType() {
      return ExerciseLap$PbLap.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseLap.A();
   }

   public ExerciseLap$PbLapHeader getHeader() {
      ExerciseLap$PbLapHeader var1;
      if (this.headerBuilder_ == null) {
         if (this.header_ == null) {
            var1 = ExerciseLap$PbLapHeader.getDefaultInstance();
         } else {
            var1 = this.header_;
         }
      } else {
         var1 = (ExerciseLap$PbLapHeader)this.headerBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseLap$PbLapHeader$Builder getHeaderBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (ExerciseLap$PbLapHeader$Builder)this.getHeaderFieldBuilder().getBuilder();
   }

   public ExerciseLap$PbLapHeaderOrBuilder getHeaderOrBuilder() {
      Object var1;
      if (this.headerBuilder_ != null) {
         var1 = (ExerciseLap$PbLapHeaderOrBuilder)this.headerBuilder_.getMessageOrBuilder();
      } else if (this.header_ == null) {
         var1 = ExerciseLap$PbLapHeader.getDefaultInstance();
      } else {
         var1 = this.header_;
      }

      return (ExerciseLap$PbLapHeaderOrBuilder)var1;
   }

   public ExerciseLap$PbLapStatistics getStatistics() {
      ExerciseLap$PbLapStatistics var1;
      if (this.statisticsBuilder_ == null) {
         if (this.statistics_ == null) {
            var1 = ExerciseLap$PbLapStatistics.getDefaultInstance();
         } else {
            var1 = this.statistics_;
         }
      } else {
         var1 = (ExerciseLap$PbLapStatistics)this.statisticsBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseLap$PbLapStatistics$Builder getStatisticsBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (ExerciseLap$PbLapStatistics$Builder)this.getStatisticsFieldBuilder().getBuilder();
   }

   public ExerciseLap$PbLapStatisticsOrBuilder getStatisticsOrBuilder() {
      Object var1;
      if (this.statisticsBuilder_ != null) {
         var1 = (ExerciseLap$PbLapStatisticsOrBuilder)this.statisticsBuilder_.getMessageOrBuilder();
      } else if (this.statistics_ == null) {
         var1 = ExerciseLap$PbLapStatistics.getDefaultInstance();
      } else {
         var1 = this.statistics_;
      }

      return (ExerciseLap$PbLapStatisticsOrBuilder)var1;
   }

   public boolean hasHeader() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStatistics() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseLap.B().ensureFieldAccessorsInitialized(ExerciseLap$PbLap.class, ExerciseLap$PbLap$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasHeader() && this.getHeader().isInitialized()) {
         var1 = true;
      }

      return var1;
   }

   public ExerciseLap$PbLap$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseLap$PbLap var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (ExerciseLap$PbLap)ExerciseLap$PbLap.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (ExerciseLap$PbLap)var10.getUnfinishedMessage();
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

   public ExerciseLap$PbLap$Builder mergeFrom(Message var1) {
      ExerciseLap$PbLap$Builder var2;
      if (var1 instanceof ExerciseLap$PbLap) {
         var2 = this.mergeFrom((ExerciseLap$PbLap)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseLap$PbLap$Builder mergeFrom(ExerciseLap$PbLap var1) {
      if (var1 != ExerciseLap$PbLap.getDefaultInstance()) {
         if (var1.hasHeader()) {
            this.mergeHeader(var1.getHeader());
         }

         if (var1.hasStatistics()) {
            this.mergeStatistics(var1.getStatistics());
         }

         this.mergeUnknownFields(ExerciseLap$PbLap.a(var1));
         this.onChanged();
      }

      return this;
   }

   public ExerciseLap$PbLap$Builder mergeHeader(ExerciseLap$PbLapHeader var1) {
      if (this.headerBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.header_ != null && this.header_ != ExerciseLap$PbLapHeader.getDefaultInstance()) {
            this.header_ = ExerciseLap$PbLapHeader.newBuilder(this.header_).mergeFrom(var1).buildPartial();
         } else {
            this.header_ = var1;
         }

         this.onChanged();
      } else {
         this.headerBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ExerciseLap$PbLap$Builder mergeStatistics(ExerciseLap$PbLapStatistics var1) {
      if (this.statisticsBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.statistics_ != null && this.statistics_ != ExerciseLap$PbLapStatistics.getDefaultInstance()) {
            this.statistics_ = ExerciseLap$PbLapStatistics.newBuilder(this.statistics_).mergeFrom(var1).buildPartial();
         } else {
            this.statistics_ = var1;
         }

         this.onChanged();
      } else {
         this.statisticsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final ExerciseLap$PbLap$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLap$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseLap$PbLap$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLap$Builder)super.setField(var1, var2);
   }

   public ExerciseLap$PbLap$Builder setHeader(ExerciseLap$PbLapHeader$Builder var1) {
      if (this.headerBuilder_ == null) {
         this.header_ = var1.build();
         this.onChanged();
      } else {
         this.headerBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ExerciseLap$PbLap$Builder setHeader(ExerciseLap$PbLapHeader var1) {
      if (this.headerBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.header_ = var1;
         this.onChanged();
      } else {
         this.headerBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ExerciseLap$PbLap$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseLap$PbLap$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public ExerciseLap$PbLap$Builder setStatistics(ExerciseLap$PbLapStatistics$Builder var1) {
      if (this.statisticsBuilder_ == null) {
         this.statistics_ = var1.build();
         this.onChanged();
      } else {
         this.statisticsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExerciseLap$PbLap$Builder setStatistics(ExerciseLap$PbLapStatistics var1) {
      if (this.statisticsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.statistics_ = var1;
         this.onChanged();
      } else {
         this.statisticsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final ExerciseLap$PbLap$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLap$Builder)super.setUnknownFields(var1);
   }
}
