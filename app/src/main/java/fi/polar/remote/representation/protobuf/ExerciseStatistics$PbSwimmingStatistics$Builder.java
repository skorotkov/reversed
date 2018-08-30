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

public final class ExerciseStatistics$PbSwimmingStatistics$Builder extends Builder implements ExerciseStatistics$PbSwimmingStatisticsOrBuilder {
   private SingleFieldBuilderV3 backstrokeStatisticsBuilder_;
   private ExerciseStatistics$PbSwimmingStyleStatistics backstrokeStatistics_;
   private int bitField0_;
   private SingleFieldBuilderV3 breaststrokeStatisticsBuilder_;
   private ExerciseStatistics$PbSwimmingStyleStatistics breaststrokeStatistics_;
   private SingleFieldBuilderV3 butterflyStatisticsBuilder_;
   private ExerciseStatistics$PbSwimmingStyleStatistics butterflyStatistics_;
   private SingleFieldBuilderV3 freestyleStatisticsBuilder_;
   private ExerciseStatistics$PbSwimmingStyleStatistics freestyleStatistics_;
   private int numberOfPoolsSwimmed_;
   private float swimmingDistance_;
   private SingleFieldBuilderV3 swimmingPoolBuilder_;
   private Structures$PbSwimmingPoolInfo swimmingPool_;
   private int totalStrokeCount_;

   private ExerciseStatistics$PbSwimmingStatistics$Builder() {
      this.freestyleStatistics_ = null;
      this.backstrokeStatistics_ = null;
      this.breaststrokeStatistics_ = null;
      this.butterflyStatistics_ = null;
      this.swimmingPool_ = null;
      this.maybeForceBuilderInitialization();
   }

   private ExerciseStatistics$PbSwimmingStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.freestyleStatistics_ = null;
      this.backstrokeStatistics_ = null;
      this.breaststrokeStatistics_ = null;
      this.butterflyStatistics_ = null;
      this.swimmingPool_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseStatistics$PbSwimmingStatistics$Builder(BuilderParent var1, ExerciseStatistics$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseStatistics$PbSwimmingStatistics$Builder(ExerciseStatistics$1 var1) {
      this();
   }

   private SingleFieldBuilderV3 getBackstrokeStatisticsFieldBuilder() {
      if (this.backstrokeStatisticsBuilder_ == null) {
         this.backstrokeStatisticsBuilder_ = new SingleFieldBuilderV3(this.getBackstrokeStatistics(), this.getParentForChildren(), this.isClean());
         this.backstrokeStatistics_ = null;
      }

      return this.backstrokeStatisticsBuilder_;
   }

   private SingleFieldBuilderV3 getBreaststrokeStatisticsFieldBuilder() {
      if (this.breaststrokeStatisticsBuilder_ == null) {
         this.breaststrokeStatisticsBuilder_ = new SingleFieldBuilderV3(this.getBreaststrokeStatistics(), this.getParentForChildren(), this.isClean());
         this.breaststrokeStatistics_ = null;
      }

      return this.breaststrokeStatisticsBuilder_;
   }

   private SingleFieldBuilderV3 getButterflyStatisticsFieldBuilder() {
      if (this.butterflyStatisticsBuilder_ == null) {
         this.butterflyStatisticsBuilder_ = new SingleFieldBuilderV3(this.getButterflyStatistics(), this.getParentForChildren(), this.isClean());
         this.butterflyStatistics_ = null;
      }

      return this.butterflyStatisticsBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseStatistics.c();
   }

   private SingleFieldBuilderV3 getFreestyleStatisticsFieldBuilder() {
      if (this.freestyleStatisticsBuilder_ == null) {
         this.freestyleStatisticsBuilder_ = new SingleFieldBuilderV3(this.getFreestyleStatistics(), this.getParentForChildren(), this.isClean());
         this.freestyleStatistics_ = null;
      }

      return this.freestyleStatisticsBuilder_;
   }

   private SingleFieldBuilderV3 getSwimmingPoolFieldBuilder() {
      if (this.swimmingPoolBuilder_ == null) {
         this.swimmingPoolBuilder_ = new SingleFieldBuilderV3(this.getSwimmingPool(), this.getParentForChildren(), this.isClean());
         this.swimmingPool_ = null;
      }

      return this.swimmingPoolBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseStatistics$PbSwimmingStatistics.b()) {
         this.getFreestyleStatisticsFieldBuilder();
         this.getBackstrokeStatisticsFieldBuilder();
         this.getBreaststrokeStatisticsFieldBuilder();
         this.getButterflyStatisticsFieldBuilder();
         this.getSwimmingPoolFieldBuilder();
      }

   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbSwimmingStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseStatistics$PbSwimmingStatistics build() {
      ExerciseStatistics$PbSwimmingStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseStatistics$PbSwimmingStatistics buildPartial() {
      byte var1 = 1;
      ExerciseStatistics$PbSwimmingStatistics var2 = new ExerciseStatistics$PbSwimmingStatistics(this, (ExerciseStatistics$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ExerciseStatistics$PbSwimmingStatistics.a(var2, this.swimmingDistance_);
      int var4;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      } else {
         var4 = var1;
      }

      if (this.freestyleStatisticsBuilder_ == null) {
         ExerciseStatistics$PbSwimmingStatistics.a(var2, this.freestyleStatistics_);
      } else {
         ExerciseStatistics$PbSwimmingStatistics.a(var2, (ExerciseStatistics$PbSwimmingStyleStatistics)this.freestyleStatisticsBuilder_.build());
      }

      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      if (this.backstrokeStatisticsBuilder_ == null) {
         ExerciseStatistics$PbSwimmingStatistics.b(var2, this.backstrokeStatistics_);
      } else {
         ExerciseStatistics$PbSwimmingStatistics.b(var2, (ExerciseStatistics$PbSwimmingStyleStatistics)this.backstrokeStatisticsBuilder_.build());
      }

      var4 = var5;
      if ((var3 & 8) == 8) {
         var4 = var5 | 8;
      }

      if (this.breaststrokeStatisticsBuilder_ == null) {
         ExerciseStatistics$PbSwimmingStatistics.c(var2, this.breaststrokeStatistics_);
      } else {
         ExerciseStatistics$PbSwimmingStatistics.c(var2, (ExerciseStatistics$PbSwimmingStyleStatistics)this.breaststrokeStatisticsBuilder_.build());
      }

      var5 = var4;
      if ((var3 & 16) == 16) {
         var5 = var4 | 16;
      }

      if (this.butterflyStatisticsBuilder_ == null) {
         ExerciseStatistics$PbSwimmingStatistics.d(var2, this.butterflyStatistics_);
      } else {
         ExerciseStatistics$PbSwimmingStatistics.d(var2, (ExerciseStatistics$PbSwimmingStyleStatistics)this.butterflyStatisticsBuilder_.build());
      }

      var4 = var5;
      if ((var3 & 32) == 32) {
         var4 = var5 | 32;
      }

      ExerciseStatistics$PbSwimmingStatistics.a(var2, this.totalStrokeCount_);
      var5 = var4;
      if ((var3 & 64) == 64) {
         var5 = var4 | 64;
      }

      ExerciseStatistics$PbSwimmingStatistics.b(var2, this.numberOfPoolsSwimmed_);
      var4 = var5;
      if ((var3 & 128) == 128) {
         var4 = var5 | 128;
      }

      if (this.swimmingPoolBuilder_ == null) {
         ExerciseStatistics$PbSwimmingStatistics.a(var2, this.swimmingPool_);
      } else {
         ExerciseStatistics$PbSwimmingStatistics.a(var2, (Structures$PbSwimmingPoolInfo)this.swimmingPoolBuilder_.build());
      }

      ExerciseStatistics$PbSwimmingStatistics.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder clear() {
      super.clear();
      this.swimmingDistance_ = 0.0F;
      this.bitField0_ &= -2;
      if (this.freestyleStatisticsBuilder_ == null) {
         this.freestyleStatistics_ = null;
      } else {
         this.freestyleStatisticsBuilder_.clear();
      }

      this.bitField0_ &= -3;
      if (this.backstrokeStatisticsBuilder_ == null) {
         this.backstrokeStatistics_ = null;
      } else {
         this.backstrokeStatisticsBuilder_.clear();
      }

      this.bitField0_ &= -5;
      if (this.breaststrokeStatisticsBuilder_ == null) {
         this.breaststrokeStatistics_ = null;
      } else {
         this.breaststrokeStatisticsBuilder_.clear();
      }

      this.bitField0_ &= -9;
      if (this.butterflyStatisticsBuilder_ == null) {
         this.butterflyStatistics_ = null;
      } else {
         this.butterflyStatisticsBuilder_.clear();
      }

      this.bitField0_ &= -17;
      this.totalStrokeCount_ = 0;
      this.bitField0_ &= -33;
      this.numberOfPoolsSwimmed_ = 0;
      this.bitField0_ &= -65;
      if (this.swimmingPoolBuilder_ == null) {
         this.swimmingPool_ = null;
      } else {
         this.swimmingPoolBuilder_.clear();
      }

      this.bitField0_ &= -129;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder clearBackstrokeStatistics() {
      if (this.backstrokeStatisticsBuilder_ == null) {
         this.backstrokeStatistics_ = null;
         this.onChanged();
      } else {
         this.backstrokeStatisticsBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder clearBreaststrokeStatistics() {
      if (this.breaststrokeStatisticsBuilder_ == null) {
         this.breaststrokeStatistics_ = null;
         this.onChanged();
      } else {
         this.breaststrokeStatisticsBuilder_.clear();
      }

      this.bitField0_ &= -9;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder clearButterflyStatistics() {
      if (this.butterflyStatisticsBuilder_ == null) {
         this.butterflyStatistics_ = null;
         this.onChanged();
      } else {
         this.butterflyStatisticsBuilder_.clear();
      }

      this.bitField0_ &= -17;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseStatistics$PbSwimmingStatistics$Builder)super.clearField(var1);
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder clearFreestyleStatistics() {
      if (this.freestyleStatisticsBuilder_ == null) {
         this.freestyleStatistics_ = null;
         this.onChanged();
      } else {
         this.freestyleStatisticsBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder clearNumberOfPoolsSwimmed() {
      this.bitField0_ &= -65;
      this.numberOfPoolsSwimmed_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseStatistics$PbSwimmingStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder clearSwimmingDistance() {
      this.bitField0_ &= -2;
      this.swimmingDistance_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder clearSwimmingPool() {
      if (this.swimmingPoolBuilder_ == null) {
         this.swimmingPool_ = null;
         this.onChanged();
      } else {
         this.swimmingPoolBuilder_.clear();
      }

      this.bitField0_ &= -129;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder clearTotalStrokeCount() {
      this.bitField0_ &= -33;
      this.totalStrokeCount_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder clone() {
      return (ExerciseStatistics$PbSwimmingStatistics$Builder)super.clone();
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics getBackstrokeStatistics() {
      ExerciseStatistics$PbSwimmingStyleStatistics var1;
      if (this.backstrokeStatisticsBuilder_ == null) {
         if (this.backstrokeStatistics_ == null) {
            var1 = ExerciseStatistics$PbSwimmingStyleStatistics.getDefaultInstance();
         } else {
            var1 = this.backstrokeStatistics_;
         }
      } else {
         var1 = (ExerciseStatistics$PbSwimmingStyleStatistics)this.backstrokeStatisticsBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder getBackstrokeStatisticsBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (ExerciseStatistics$PbSwimmingStyleStatistics$Builder)this.getBackstrokeStatisticsFieldBuilder().getBuilder();
   }

   public ExerciseStatistics$PbSwimmingStyleStatisticsOrBuilder getBackstrokeStatisticsOrBuilder() {
      Object var1;
      if (this.backstrokeStatisticsBuilder_ != null) {
         var1 = (ExerciseStatistics$PbSwimmingStyleStatisticsOrBuilder)this.backstrokeStatisticsBuilder_.getMessageOrBuilder();
      } else if (this.backstrokeStatistics_ == null) {
         var1 = ExerciseStatistics$PbSwimmingStyleStatistics.getDefaultInstance();
      } else {
         var1 = this.backstrokeStatistics_;
      }

      return (ExerciseStatistics$PbSwimmingStyleStatisticsOrBuilder)var1;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics getBreaststrokeStatistics() {
      ExerciseStatistics$PbSwimmingStyleStatistics var1;
      if (this.breaststrokeStatisticsBuilder_ == null) {
         if (this.breaststrokeStatistics_ == null) {
            var1 = ExerciseStatistics$PbSwimmingStyleStatistics.getDefaultInstance();
         } else {
            var1 = this.breaststrokeStatistics_;
         }
      } else {
         var1 = (ExerciseStatistics$PbSwimmingStyleStatistics)this.breaststrokeStatisticsBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder getBreaststrokeStatisticsBuilder() {
      this.bitField0_ |= 8;
      this.onChanged();
      return (ExerciseStatistics$PbSwimmingStyleStatistics$Builder)this.getBreaststrokeStatisticsFieldBuilder().getBuilder();
   }

   public ExerciseStatistics$PbSwimmingStyleStatisticsOrBuilder getBreaststrokeStatisticsOrBuilder() {
      Object var1;
      if (this.breaststrokeStatisticsBuilder_ != null) {
         var1 = (ExerciseStatistics$PbSwimmingStyleStatisticsOrBuilder)this.breaststrokeStatisticsBuilder_.getMessageOrBuilder();
      } else if (this.breaststrokeStatistics_ == null) {
         var1 = ExerciseStatistics$PbSwimmingStyleStatistics.getDefaultInstance();
      } else {
         var1 = this.breaststrokeStatistics_;
      }

      return (ExerciseStatistics$PbSwimmingStyleStatisticsOrBuilder)var1;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics getButterflyStatistics() {
      ExerciseStatistics$PbSwimmingStyleStatistics var1;
      if (this.butterflyStatisticsBuilder_ == null) {
         if (this.butterflyStatistics_ == null) {
            var1 = ExerciseStatistics$PbSwimmingStyleStatistics.getDefaultInstance();
         } else {
            var1 = this.butterflyStatistics_;
         }
      } else {
         var1 = (ExerciseStatistics$PbSwimmingStyleStatistics)this.butterflyStatisticsBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder getButterflyStatisticsBuilder() {
      this.bitField0_ |= 16;
      this.onChanged();
      return (ExerciseStatistics$PbSwimmingStyleStatistics$Builder)this.getButterflyStatisticsFieldBuilder().getBuilder();
   }

   public ExerciseStatistics$PbSwimmingStyleStatisticsOrBuilder getButterflyStatisticsOrBuilder() {
      Object var1;
      if (this.butterflyStatisticsBuilder_ != null) {
         var1 = (ExerciseStatistics$PbSwimmingStyleStatisticsOrBuilder)this.butterflyStatisticsBuilder_.getMessageOrBuilder();
      } else if (this.butterflyStatistics_ == null) {
         var1 = ExerciseStatistics$PbSwimmingStyleStatistics.getDefaultInstance();
      } else {
         var1 = this.butterflyStatistics_;
      }

      return (ExerciseStatistics$PbSwimmingStyleStatisticsOrBuilder)var1;
   }

   public ExerciseStatistics$PbSwimmingStatistics getDefaultInstanceForType() {
      return ExerciseStatistics$PbSwimmingStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseStatistics.c();
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics getFreestyleStatistics() {
      ExerciseStatistics$PbSwimmingStyleStatistics var1;
      if (this.freestyleStatisticsBuilder_ == null) {
         if (this.freestyleStatistics_ == null) {
            var1 = ExerciseStatistics$PbSwimmingStyleStatistics.getDefaultInstance();
         } else {
            var1 = this.freestyleStatistics_;
         }
      } else {
         var1 = (ExerciseStatistics$PbSwimmingStyleStatistics)this.freestyleStatisticsBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder getFreestyleStatisticsBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (ExerciseStatistics$PbSwimmingStyleStatistics$Builder)this.getFreestyleStatisticsFieldBuilder().getBuilder();
   }

   public ExerciseStatistics$PbSwimmingStyleStatisticsOrBuilder getFreestyleStatisticsOrBuilder() {
      Object var1;
      if (this.freestyleStatisticsBuilder_ != null) {
         var1 = (ExerciseStatistics$PbSwimmingStyleStatisticsOrBuilder)this.freestyleStatisticsBuilder_.getMessageOrBuilder();
      } else if (this.freestyleStatistics_ == null) {
         var1 = ExerciseStatistics$PbSwimmingStyleStatistics.getDefaultInstance();
      } else {
         var1 = this.freestyleStatistics_;
      }

      return (ExerciseStatistics$PbSwimmingStyleStatisticsOrBuilder)var1;
   }

   public int getNumberOfPoolsSwimmed() {
      return this.numberOfPoolsSwimmed_;
   }

   public float getSwimmingDistance() {
      return this.swimmingDistance_;
   }

   public Structures$PbSwimmingPoolInfo getSwimmingPool() {
      Structures$PbSwimmingPoolInfo var1;
      if (this.swimmingPoolBuilder_ == null) {
         if (this.swimmingPool_ == null) {
            var1 = Structures$PbSwimmingPoolInfo.getDefaultInstance();
         } else {
            var1 = this.swimmingPool_;
         }
      } else {
         var1 = (Structures$PbSwimmingPoolInfo)this.swimmingPoolBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbSwimmingPoolInfo$Builder getSwimmingPoolBuilder() {
      this.bitField0_ |= 128;
      this.onChanged();
      return (Structures$PbSwimmingPoolInfo$Builder)this.getSwimmingPoolFieldBuilder().getBuilder();
   }

   public Structures$PbSwimmingPoolInfoOrBuilder getSwimmingPoolOrBuilder() {
      Object var1;
      if (this.swimmingPoolBuilder_ != null) {
         var1 = (Structures$PbSwimmingPoolInfoOrBuilder)this.swimmingPoolBuilder_.getMessageOrBuilder();
      } else if (this.swimmingPool_ == null) {
         var1 = Structures$PbSwimmingPoolInfo.getDefaultInstance();
      } else {
         var1 = this.swimmingPool_;
      }

      return (Structures$PbSwimmingPoolInfoOrBuilder)var1;
   }

   public int getTotalStrokeCount() {
      return this.totalStrokeCount_;
   }

   public boolean hasBackstrokeStatistics() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasBreaststrokeStatistics() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasButterflyStatistics() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasFreestyleStatistics() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasNumberOfPoolsSwimmed() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSwimmingDistance() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSwimmingPool() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTotalStrokeCount() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseStatistics.d().ensureFieldAccessorsInitialized(ExerciseStatistics$PbSwimmingStatistics.class, ExerciseStatistics$PbSwimmingStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasSwimmingDistance()) {
         var2 = var1;
      } else {
         if (this.hasFreestyleStatistics()) {
            var2 = var1;
            if (!this.getFreestyleStatistics().isInitialized()) {
               return var2;
            }
         }

         if (this.hasBackstrokeStatistics()) {
            var2 = var1;
            if (!this.getBackstrokeStatistics().isInitialized()) {
               return var2;
            }
         }

         if (this.hasBreaststrokeStatistics()) {
            var2 = var1;
            if (!this.getBreaststrokeStatistics().isInitialized()) {
               return var2;
            }
         }

         if (this.hasButterflyStatistics()) {
            var2 = var1;
            if (!this.getButterflyStatistics().isInitialized()) {
               return var2;
            }
         }

         if (this.hasSwimmingPool()) {
            var2 = var1;
            if (!this.getSwimmingPool().isInitialized()) {
               return var2;
            }
         }

         var2 = true;
      }

      return var2;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder mergeBackstrokeStatistics(ExerciseStatistics$PbSwimmingStyleStatistics var1) {
      if (this.backstrokeStatisticsBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.backstrokeStatistics_ != null && this.backstrokeStatistics_ != ExerciseStatistics$PbSwimmingStyleStatistics.getDefaultInstance()) {
            this.backstrokeStatistics_ = ExerciseStatistics$PbSwimmingStyleStatistics.newBuilder(this.backstrokeStatistics_).mergeFrom(var1).buildPartial();
         } else {
            this.backstrokeStatistics_ = var1;
         }

         this.onChanged();
      } else {
         this.backstrokeStatisticsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder mergeBreaststrokeStatistics(ExerciseStatistics$PbSwimmingStyleStatistics var1) {
      if (this.breaststrokeStatisticsBuilder_ == null) {
         if ((this.bitField0_ & 8) == 8 && this.breaststrokeStatistics_ != null && this.breaststrokeStatistics_ != ExerciseStatistics$PbSwimmingStyleStatistics.getDefaultInstance()) {
            this.breaststrokeStatistics_ = ExerciseStatistics$PbSwimmingStyleStatistics.newBuilder(this.breaststrokeStatistics_).mergeFrom(var1).buildPartial();
         } else {
            this.breaststrokeStatistics_ = var1;
         }

         this.onChanged();
      } else {
         this.breaststrokeStatisticsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder mergeButterflyStatistics(ExerciseStatistics$PbSwimmingStyleStatistics var1) {
      if (this.butterflyStatisticsBuilder_ == null) {
         if ((this.bitField0_ & 16) == 16 && this.butterflyStatistics_ != null && this.butterflyStatistics_ != ExerciseStatistics$PbSwimmingStyleStatistics.getDefaultInstance()) {
            this.butterflyStatistics_ = ExerciseStatistics$PbSwimmingStyleStatistics.newBuilder(this.butterflyStatistics_).mergeFrom(var1).buildPartial();
         } else {
            this.butterflyStatistics_ = var1;
         }

         this.onChanged();
      } else {
         this.butterflyStatisticsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder mergeFreestyleStatistics(ExerciseStatistics$PbSwimmingStyleStatistics var1) {
      if (this.freestyleStatisticsBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.freestyleStatistics_ != null && this.freestyleStatistics_ != ExerciseStatistics$PbSwimmingStyleStatistics.getDefaultInstance()) {
            this.freestyleStatistics_ = ExerciseStatistics$PbSwimmingStyleStatistics.newBuilder(this.freestyleStatistics_).mergeFrom(var1).buildPartial();
         } else {
            this.freestyleStatistics_ = var1;
         }

         this.onChanged();
      } else {
         this.freestyleStatisticsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseStatistics$PbSwimmingStatistics var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (ExerciseStatistics$PbSwimmingStatistics)ExerciseStatistics$PbSwimmingStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (ExerciseStatistics$PbSwimmingStatistics)var10.getUnfinishedMessage();
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

   public ExerciseStatistics$PbSwimmingStatistics$Builder mergeFrom(Message var1) {
      ExerciseStatistics$PbSwimmingStatistics$Builder var2;
      if (var1 instanceof ExerciseStatistics$PbSwimmingStatistics) {
         var2 = this.mergeFrom((ExerciseStatistics$PbSwimmingStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder mergeFrom(ExerciseStatistics$PbSwimmingStatistics var1) {
      if (var1 != ExerciseStatistics$PbSwimmingStatistics.getDefaultInstance()) {
         if (var1.hasSwimmingDistance()) {
            this.setSwimmingDistance(var1.getSwimmingDistance());
         }

         if (var1.hasFreestyleStatistics()) {
            this.mergeFreestyleStatistics(var1.getFreestyleStatistics());
         }

         if (var1.hasBackstrokeStatistics()) {
            this.mergeBackstrokeStatistics(var1.getBackstrokeStatistics());
         }

         if (var1.hasBreaststrokeStatistics()) {
            this.mergeBreaststrokeStatistics(var1.getBreaststrokeStatistics());
         }

         if (var1.hasButterflyStatistics()) {
            this.mergeButterflyStatistics(var1.getButterflyStatistics());
         }

         if (var1.hasTotalStrokeCount()) {
            this.setTotalStrokeCount(var1.getTotalStrokeCount());
         }

         if (var1.hasNumberOfPoolsSwimmed()) {
            this.setNumberOfPoolsSwimmed(var1.getNumberOfPoolsSwimmed());
         }

         if (var1.hasSwimmingPool()) {
            this.mergeSwimmingPool(var1.getSwimmingPool());
         }

         this.mergeUnknownFields(ExerciseStatistics$PbSwimmingStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder mergeSwimmingPool(Structures$PbSwimmingPoolInfo var1) {
      if (this.swimmingPoolBuilder_ == null) {
         if ((this.bitField0_ & 128) == 128 && this.swimmingPool_ != null && this.swimmingPool_ != Structures$PbSwimmingPoolInfo.getDefaultInstance()) {
            this.swimmingPool_ = Structures$PbSwimmingPoolInfo.newBuilder(this.swimmingPool_).mergeFrom(var1).buildPartial();
         } else {
            this.swimmingPool_ = var1;
         }

         this.onChanged();
      } else {
         this.swimmingPoolBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 128;
      return this;
   }

   public final ExerciseStatistics$PbSwimmingStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbSwimmingStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder setBackstrokeStatistics(ExerciseStatistics$PbSwimmingStyleStatistics$Builder var1) {
      if (this.backstrokeStatisticsBuilder_ == null) {
         this.backstrokeStatistics_ = var1.build();
         this.onChanged();
      } else {
         this.backstrokeStatisticsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder setBackstrokeStatistics(ExerciseStatistics$PbSwimmingStyleStatistics var1) {
      if (this.backstrokeStatisticsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.backstrokeStatistics_ = var1;
         this.onChanged();
      } else {
         this.backstrokeStatisticsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder setBreaststrokeStatistics(ExerciseStatistics$PbSwimmingStyleStatistics$Builder var1) {
      if (this.breaststrokeStatisticsBuilder_ == null) {
         this.breaststrokeStatistics_ = var1.build();
         this.onChanged();
      } else {
         this.breaststrokeStatisticsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder setBreaststrokeStatistics(ExerciseStatistics$PbSwimmingStyleStatistics var1) {
      if (this.breaststrokeStatisticsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.breaststrokeStatistics_ = var1;
         this.onChanged();
      } else {
         this.breaststrokeStatisticsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder setButterflyStatistics(ExerciseStatistics$PbSwimmingStyleStatistics$Builder var1) {
      if (this.butterflyStatisticsBuilder_ == null) {
         this.butterflyStatistics_ = var1.build();
         this.onChanged();
      } else {
         this.butterflyStatisticsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 16;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder setButterflyStatistics(ExerciseStatistics$PbSwimmingStyleStatistics var1) {
      if (this.butterflyStatisticsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.butterflyStatistics_ = var1;
         this.onChanged();
      } else {
         this.butterflyStatisticsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbSwimmingStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder setFreestyleStatistics(ExerciseStatistics$PbSwimmingStyleStatistics$Builder var1) {
      if (this.freestyleStatisticsBuilder_ == null) {
         this.freestyleStatistics_ = var1.build();
         this.onChanged();
      } else {
         this.freestyleStatisticsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder setFreestyleStatistics(ExerciseStatistics$PbSwimmingStyleStatistics var1) {
      if (this.freestyleStatisticsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.freestyleStatistics_ = var1;
         this.onChanged();
      } else {
         this.freestyleStatisticsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder setNumberOfPoolsSwimmed(int var1) {
      this.bitField0_ |= 64;
      this.numberOfPoolsSwimmed_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseStatistics$PbSwimmingStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder setSwimmingDistance(float var1) {
      this.bitField0_ |= 1;
      this.swimmingDistance_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder setSwimmingPool(Structures$PbSwimmingPoolInfo$Builder var1) {
      if (this.swimmingPoolBuilder_ == null) {
         this.swimmingPool_ = var1.build();
         this.onChanged();
      } else {
         this.swimmingPoolBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 128;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder setSwimmingPool(Structures$PbSwimmingPoolInfo var1) {
      if (this.swimmingPoolBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.swimmingPool_ = var1;
         this.onChanged();
      } else {
         this.swimmingPoolBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 128;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder setTotalStrokeCount(int var1) {
      this.bitField0_ |= 32;
      this.totalStrokeCount_ = var1;
      this.onChanged();
      return this;
   }

   public final ExerciseStatistics$PbSwimmingStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbSwimmingStatistics$Builder)super.setUnknownFields(var1);
   }
}
