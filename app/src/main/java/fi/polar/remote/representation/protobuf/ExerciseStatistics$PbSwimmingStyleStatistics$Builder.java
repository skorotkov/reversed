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

public final class ExerciseStatistics$PbSwimmingStyleStatistics$Builder extends Builder implements ExerciseStatistics$PbSwimmingStyleStatisticsOrBuilder {
   private int averageHeartrate_;
   private float averageSwolf_;
   private int bitField0_;
   private float distance_;
   private int maximumHeartrate_;
   private SingleFieldBuilderV3 poolTimeMinBuilder_;
   private Types$PbDuration poolTimeMin_;
   private int strokeCount_;
   private SingleFieldBuilderV3 swimmingTimeTotalBuilder_;
   private Types$PbDuration swimmingTimeTotal_;

   private ExerciseStatistics$PbSwimmingStyleStatistics$Builder() {
      this.swimmingTimeTotal_ = null;
      this.poolTimeMin_ = null;
      this.maybeForceBuilderInitialization();
   }

   private ExerciseStatistics$PbSwimmingStyleStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.swimmingTimeTotal_ = null;
      this.poolTimeMin_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseStatistics$PbSwimmingStyleStatistics$Builder(BuilderParent var1, ExerciseStatistics$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseStatistics$PbSwimmingStyleStatistics$Builder(ExerciseStatistics$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseStatistics.a();
   }

   private SingleFieldBuilderV3 getPoolTimeMinFieldBuilder() {
      if (this.poolTimeMinBuilder_ == null) {
         this.poolTimeMinBuilder_ = new SingleFieldBuilderV3(this.getPoolTimeMin(), this.getParentForChildren(), this.isClean());
         this.poolTimeMin_ = null;
      }

      return this.poolTimeMinBuilder_;
   }

   private SingleFieldBuilderV3 getSwimmingTimeTotalFieldBuilder() {
      if (this.swimmingTimeTotalBuilder_ == null) {
         this.swimmingTimeTotalBuilder_ = new SingleFieldBuilderV3(this.getSwimmingTimeTotal(), this.getParentForChildren(), this.isClean());
         this.swimmingTimeTotal_ = null;
      }

      return this.swimmingTimeTotalBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseStatistics$PbSwimmingStyleStatistics.b()) {
         this.getSwimmingTimeTotalFieldBuilder();
         this.getPoolTimeMinFieldBuilder();
      }

   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbSwimmingStyleStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics build() {
      ExerciseStatistics$PbSwimmingStyleStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics buildPartial() {
      byte var1 = 1;
      ExerciseStatistics$PbSwimmingStyleStatistics var2 = new ExerciseStatistics$PbSwimmingStyleStatistics(this, (ExerciseStatistics$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ExerciseStatistics$PbSwimmingStyleStatistics.a(var2, this.distance_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      ExerciseStatistics$PbSwimmingStyleStatistics.a(var2, this.strokeCount_);
      if ((var3 & 4) == 4) {
         var4 |= 4;
      }

      if (this.swimmingTimeTotalBuilder_ == null) {
         ExerciseStatistics$PbSwimmingStyleStatistics.a(var2, this.swimmingTimeTotal_);
      } else {
         ExerciseStatistics$PbSwimmingStyleStatistics.a(var2, (Types$PbDuration)this.swimmingTimeTotalBuilder_.build());
      }

      int var5 = var4;
      if ((var3 & 8) == 8) {
         var5 = var4 | 8;
      }

      ExerciseStatistics$PbSwimmingStyleStatistics.b(var2, this.averageHeartrate_);
      var4 = var5;
      if ((var3 & 16) == 16) {
         var4 = var5 | 16;
      }

      ExerciseStatistics$PbSwimmingStyleStatistics.c(var2, this.maximumHeartrate_);
      var5 = var4;
      if ((var3 & 32) == 32) {
         var5 = var4 | 32;
      }

      ExerciseStatistics$PbSwimmingStyleStatistics.b(var2, this.averageSwolf_);
      var4 = var5;
      if ((var3 & 64) == 64) {
         var4 = var5 | 64;
      }

      if (this.poolTimeMinBuilder_ == null) {
         ExerciseStatistics$PbSwimmingStyleStatistics.b(var2, this.poolTimeMin_);
      } else {
         ExerciseStatistics$PbSwimmingStyleStatistics.b(var2, (Types$PbDuration)this.poolTimeMinBuilder_.build());
      }

      ExerciseStatistics$PbSwimmingStyleStatistics.d(var2, var4);
      this.onBuilt();
      return var2;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder clear() {
      super.clear();
      this.distance_ = 0.0F;
      this.bitField0_ &= -2;
      this.strokeCount_ = 0;
      this.bitField0_ &= -3;
      if (this.swimmingTimeTotalBuilder_ == null) {
         this.swimmingTimeTotal_ = null;
      } else {
         this.swimmingTimeTotalBuilder_.clear();
      }

      this.bitField0_ &= -5;
      this.averageHeartrate_ = 0;
      this.bitField0_ &= -9;
      this.maximumHeartrate_ = 0;
      this.bitField0_ &= -17;
      this.averageSwolf_ = 0.0F;
      this.bitField0_ &= -33;
      if (this.poolTimeMinBuilder_ == null) {
         this.poolTimeMin_ = null;
      } else {
         this.poolTimeMinBuilder_.clear();
      }

      this.bitField0_ &= -65;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder clearAverageHeartrate() {
      this.bitField0_ &= -9;
      this.averageHeartrate_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder clearAverageSwolf() {
      this.bitField0_ &= -33;
      this.averageSwolf_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder clearDistance() {
      this.bitField0_ &= -2;
      this.distance_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseStatistics$PbSwimmingStyleStatistics$Builder)super.clearField(var1);
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder clearMaximumHeartrate() {
      this.bitField0_ &= -17;
      this.maximumHeartrate_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseStatistics$PbSwimmingStyleStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder clearPoolTimeMin() {
      if (this.poolTimeMinBuilder_ == null) {
         this.poolTimeMin_ = null;
         this.onChanged();
      } else {
         this.poolTimeMinBuilder_.clear();
      }

      this.bitField0_ &= -65;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder clearStrokeCount() {
      this.bitField0_ &= -3;
      this.strokeCount_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder clearSwimmingTimeTotal() {
      if (this.swimmingTimeTotalBuilder_ == null) {
         this.swimmingTimeTotal_ = null;
         this.onChanged();
      } else {
         this.swimmingTimeTotalBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder clone() {
      return (ExerciseStatistics$PbSwimmingStyleStatistics$Builder)super.clone();
   }

   public int getAverageHeartrate() {
      return this.averageHeartrate_;
   }

   public float getAverageSwolf() {
      return this.averageSwolf_;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics getDefaultInstanceForType() {
      return ExerciseStatistics$PbSwimmingStyleStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseStatistics.a();
   }

   public float getDistance() {
      return this.distance_;
   }

   public int getMaximumHeartrate() {
      return this.maximumHeartrate_;
   }

   public Types$PbDuration getPoolTimeMin() {
      Types$PbDuration var1;
      if (this.poolTimeMinBuilder_ == null) {
         if (this.poolTimeMin_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.poolTimeMin_;
         }
      } else {
         var1 = (Types$PbDuration)this.poolTimeMinBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getPoolTimeMinBuilder() {
      this.bitField0_ |= 64;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getPoolTimeMinFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getPoolTimeMinOrBuilder() {
      Object var1;
      if (this.poolTimeMinBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.poolTimeMinBuilder_.getMessageOrBuilder();
      } else if (this.poolTimeMin_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.poolTimeMin_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public int getStrokeCount() {
      return this.strokeCount_;
   }

   public Types$PbDuration getSwimmingTimeTotal() {
      Types$PbDuration var1;
      if (this.swimmingTimeTotalBuilder_ == null) {
         if (this.swimmingTimeTotal_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.swimmingTimeTotal_;
         }
      } else {
         var1 = (Types$PbDuration)this.swimmingTimeTotalBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getSwimmingTimeTotalBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getSwimmingTimeTotalFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getSwimmingTimeTotalOrBuilder() {
      Object var1;
      if (this.swimmingTimeTotalBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.swimmingTimeTotalBuilder_.getMessageOrBuilder();
      } else if (this.swimmingTimeTotal_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.swimmingTimeTotal_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public boolean hasAverageHeartrate() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAverageSwolf() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDistance() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMaximumHeartrate() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPoolTimeMin() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStrokeCount() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSwimmingTimeTotal() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseStatistics.b().ensureFieldAccessorsInitialized(ExerciseStatistics$PbSwimmingStyleStatistics.class, ExerciseStatistics$PbSwimmingStyleStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasDistance() && this.hasStrokeCount()) {
         var1 = true;
      }

      return var1;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseStatistics$PbSwimmingStyleStatistics var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (ExerciseStatistics$PbSwimmingStyleStatistics)ExerciseStatistics$PbSwimmingStyleStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (ExerciseStatistics$PbSwimmingStyleStatistics)var10.getUnfinishedMessage();
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

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder mergeFrom(Message var1) {
      ExerciseStatistics$PbSwimmingStyleStatistics$Builder var2;
      if (var1 instanceof ExerciseStatistics$PbSwimmingStyleStatistics) {
         var2 = this.mergeFrom((ExerciseStatistics$PbSwimmingStyleStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder mergeFrom(ExerciseStatistics$PbSwimmingStyleStatistics var1) {
      if (var1 != ExerciseStatistics$PbSwimmingStyleStatistics.getDefaultInstance()) {
         if (var1.hasDistance()) {
            this.setDistance(var1.getDistance());
         }

         if (var1.hasStrokeCount()) {
            this.setStrokeCount(var1.getStrokeCount());
         }

         if (var1.hasSwimmingTimeTotal()) {
            this.mergeSwimmingTimeTotal(var1.getSwimmingTimeTotal());
         }

         if (var1.hasAverageHeartrate()) {
            this.setAverageHeartrate(var1.getAverageHeartrate());
         }

         if (var1.hasMaximumHeartrate()) {
            this.setMaximumHeartrate(var1.getMaximumHeartrate());
         }

         if (var1.hasAverageSwolf()) {
            this.setAverageSwolf(var1.getAverageSwolf());
         }

         if (var1.hasPoolTimeMin()) {
            this.mergePoolTimeMin(var1.getPoolTimeMin());
         }

         this.mergeUnknownFields(ExerciseStatistics$PbSwimmingStyleStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder mergePoolTimeMin(Types$PbDuration var1) {
      if (this.poolTimeMinBuilder_ == null) {
         if ((this.bitField0_ & 64) == 64 && this.poolTimeMin_ != null && this.poolTimeMin_ != Types$PbDuration.getDefaultInstance()) {
            this.poolTimeMin_ = Types$PbDuration.newBuilder(this.poolTimeMin_).mergeFrom(var1).buildPartial();
         } else {
            this.poolTimeMin_ = var1;
         }

         this.onChanged();
      } else {
         this.poolTimeMinBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder mergeSwimmingTimeTotal(Types$PbDuration var1) {
      if (this.swimmingTimeTotalBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.swimmingTimeTotal_ != null && this.swimmingTimeTotal_ != Types$PbDuration.getDefaultInstance()) {
            this.swimmingTimeTotal_ = Types$PbDuration.newBuilder(this.swimmingTimeTotal_).mergeFrom(var1).buildPartial();
         } else {
            this.swimmingTimeTotal_ = var1;
         }

         this.onChanged();
      } else {
         this.swimmingTimeTotalBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public final ExerciseStatistics$PbSwimmingStyleStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbSwimmingStyleStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder setAverageHeartrate(int var1) {
      this.bitField0_ |= 8;
      this.averageHeartrate_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder setAverageSwolf(float var1) {
      this.bitField0_ |= 32;
      this.averageSwolf_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder setDistance(float var1) {
      this.bitField0_ |= 1;
      this.distance_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbSwimmingStyleStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder setMaximumHeartrate(int var1) {
      this.bitField0_ |= 16;
      this.maximumHeartrate_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder setPoolTimeMin(Types$PbDuration$Builder var1) {
      if (this.poolTimeMinBuilder_ == null) {
         this.poolTimeMin_ = var1.build();
         this.onChanged();
      } else {
         this.poolTimeMinBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 64;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder setPoolTimeMin(Types$PbDuration var1) {
      if (this.poolTimeMinBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.poolTimeMin_ = var1;
         this.onChanged();
      } else {
         this.poolTimeMinBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseStatistics$PbSwimmingStyleStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder setStrokeCount(int var1) {
      this.bitField0_ |= 2;
      this.strokeCount_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder setSwimmingTimeTotal(Types$PbDuration$Builder var1) {
      if (this.swimmingTimeTotalBuilder_ == null) {
         this.swimmingTimeTotal_ = var1.build();
         this.onChanged();
      } else {
         this.swimmingTimeTotalBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder setSwimmingTimeTotal(Types$PbDuration var1) {
      if (this.swimmingTimeTotalBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.swimmingTimeTotal_ = var1;
         this.onChanged();
      } else {
         this.swimmingTimeTotalBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public final ExerciseStatistics$PbSwimmingStyleStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbSwimmingStyleStatistics$Builder)super.setUnknownFields(var1);
   }
}
