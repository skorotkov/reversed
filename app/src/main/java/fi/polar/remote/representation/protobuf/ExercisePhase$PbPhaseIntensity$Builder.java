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

public final class ExercisePhase$PbPhaseIntensity$Builder extends Builder implements ExercisePhase$PbPhaseIntensityOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 heartRateZoneBuilder_;
   private ExercisePhase$PbPhaseIntensity$IntensityZone heartRateZone_;
   private int intensityType_;
   private SingleFieldBuilderV3 powerZoneBuilder_;
   private ExercisePhase$PbPhaseIntensity$IntensityZone powerZone_;
   private SingleFieldBuilderV3 speedZoneBuilder_;
   private ExercisePhase$PbPhaseIntensity$IntensityZone speedZone_;

   private ExercisePhase$PbPhaseIntensity$Builder() {
      this.intensityType_ = 0;
      this.heartRateZone_ = null;
      this.speedZone_ = null;
      this.powerZone_ = null;
      this.maybeForceBuilderInitialization();
   }

   private ExercisePhase$PbPhaseIntensity$Builder(BuilderParent var1) {
      super(var1);
      this.intensityType_ = 0;
      this.heartRateZone_ = null;
      this.speedZone_ = null;
      this.powerZone_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExercisePhase$PbPhaseIntensity$Builder(BuilderParent var1, ExercisePhase$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExercisePhase$PbPhaseIntensity$Builder(ExercisePhase$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExercisePhase.c();
   }

   private SingleFieldBuilderV3 getHeartRateZoneFieldBuilder() {
      if (this.heartRateZoneBuilder_ == null) {
         this.heartRateZoneBuilder_ = new SingleFieldBuilderV3(this.getHeartRateZone(), this.getParentForChildren(), this.isClean());
         this.heartRateZone_ = null;
      }

      return this.heartRateZoneBuilder_;
   }

   private SingleFieldBuilderV3 getPowerZoneFieldBuilder() {
      if (this.powerZoneBuilder_ == null) {
         this.powerZoneBuilder_ = new SingleFieldBuilderV3(this.getPowerZone(), this.getParentForChildren(), this.isClean());
         this.powerZone_ = null;
      }

      return this.powerZoneBuilder_;
   }

   private SingleFieldBuilderV3 getSpeedZoneFieldBuilder() {
      if (this.speedZoneBuilder_ == null) {
         this.speedZoneBuilder_ = new SingleFieldBuilderV3(this.getSpeedZone(), this.getParentForChildren(), this.isClean());
         this.speedZone_ = null;
      }

      return this.speedZoneBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (ExercisePhase$PbPhaseIntensity.b()) {
         this.getHeartRateZoneFieldBuilder();
         this.getSpeedZoneFieldBuilder();
         this.getPowerZoneFieldBuilder();
      }

   }

   public ExercisePhase$PbPhaseIntensity$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExercisePhase$PbPhaseIntensity$Builder)super.addRepeatedField(var1, var2);
   }

   public ExercisePhase$PbPhaseIntensity build() {
      ExercisePhase$PbPhaseIntensity var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExercisePhase$PbPhaseIntensity buildPartial() {
      byte var1 = 1;
      ExercisePhase$PbPhaseIntensity var2 = new ExercisePhase$PbPhaseIntensity(this, (ExercisePhase$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ExercisePhase$PbPhaseIntensity.a(var2, this.intensityType_);
      int var4;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      } else {
         var4 = var1;
      }

      if (this.heartRateZoneBuilder_ == null) {
         ExercisePhase$PbPhaseIntensity.a(var2, this.heartRateZone_);
      } else {
         ExercisePhase$PbPhaseIntensity.a(var2, (ExercisePhase$PbPhaseIntensity$IntensityZone)this.heartRateZoneBuilder_.build());
      }

      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      if (this.speedZoneBuilder_ == null) {
         ExercisePhase$PbPhaseIntensity.b(var2, this.speedZone_);
      } else {
         ExercisePhase$PbPhaseIntensity.b(var2, (ExercisePhase$PbPhaseIntensity$IntensityZone)this.speedZoneBuilder_.build());
      }

      var4 = var5;
      if ((var3 & 8) == 8) {
         var4 = var5 | 8;
      }

      if (this.powerZoneBuilder_ == null) {
         ExercisePhase$PbPhaseIntensity.c(var2, this.powerZone_);
      } else {
         ExercisePhase$PbPhaseIntensity.c(var2, (ExercisePhase$PbPhaseIntensity$IntensityZone)this.powerZoneBuilder_.build());
      }

      ExercisePhase$PbPhaseIntensity.b(var2, var4);
      this.onBuilt();
      return var2;
   }

   public ExercisePhase$PbPhaseIntensity$Builder clear() {
      super.clear();
      this.intensityType_ = 0;
      this.bitField0_ &= -2;
      if (this.heartRateZoneBuilder_ == null) {
         this.heartRateZone_ = null;
      } else {
         this.heartRateZoneBuilder_.clear();
      }

      this.bitField0_ &= -3;
      if (this.speedZoneBuilder_ == null) {
         this.speedZone_ = null;
      } else {
         this.speedZoneBuilder_.clear();
      }

      this.bitField0_ &= -5;
      if (this.powerZoneBuilder_ == null) {
         this.powerZone_ = null;
      } else {
         this.powerZoneBuilder_.clear();
      }

      this.bitField0_ &= -9;
      return this;
   }

   public ExercisePhase$PbPhaseIntensity$Builder clearField(FieldDescriptor var1) {
      return (ExercisePhase$PbPhaseIntensity$Builder)super.clearField(var1);
   }

   public ExercisePhase$PbPhaseIntensity$Builder clearHeartRateZone() {
      if (this.heartRateZoneBuilder_ == null) {
         this.heartRateZone_ = null;
         this.onChanged();
      } else {
         this.heartRateZoneBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public ExercisePhase$PbPhaseIntensity$Builder clearIntensityType() {
      this.bitField0_ &= -2;
      this.intensityType_ = 0;
      this.onChanged();
      return this;
   }

   public ExercisePhase$PbPhaseIntensity$Builder clearOneof(OneofDescriptor var1) {
      return (ExercisePhase$PbPhaseIntensity$Builder)super.clearOneof(var1);
   }

   public ExercisePhase$PbPhaseIntensity$Builder clearPowerZone() {
      if (this.powerZoneBuilder_ == null) {
         this.powerZone_ = null;
         this.onChanged();
      } else {
         this.powerZoneBuilder_.clear();
      }

      this.bitField0_ &= -9;
      return this;
   }

   public ExercisePhase$PbPhaseIntensity$Builder clearSpeedZone() {
      if (this.speedZoneBuilder_ == null) {
         this.speedZone_ = null;
         this.onChanged();
      } else {
         this.speedZoneBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public ExercisePhase$PbPhaseIntensity$Builder clone() {
      return (ExercisePhase$PbPhaseIntensity$Builder)super.clone();
   }

   public ExercisePhase$PbPhaseIntensity getDefaultInstanceForType() {
      return ExercisePhase$PbPhaseIntensity.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExercisePhase.c();
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone getHeartRateZone() {
      ExercisePhase$PbPhaseIntensity$IntensityZone var1;
      if (this.heartRateZoneBuilder_ == null) {
         if (this.heartRateZone_ == null) {
            var1 = ExercisePhase$PbPhaseIntensity$IntensityZone.getDefaultInstance();
         } else {
            var1 = this.heartRateZone_;
         }
      } else {
         var1 = (ExercisePhase$PbPhaseIntensity$IntensityZone)this.heartRateZoneBuilder_.getMessage();
      }

      return var1;
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone$Builder getHeartRateZoneBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (ExercisePhase$PbPhaseIntensity$IntensityZone$Builder)this.getHeartRateZoneFieldBuilder().getBuilder();
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZoneOrBuilder getHeartRateZoneOrBuilder() {
      Object var1;
      if (this.heartRateZoneBuilder_ != null) {
         var1 = (ExercisePhase$PbPhaseIntensity$IntensityZoneOrBuilder)this.heartRateZoneBuilder_.getMessageOrBuilder();
      } else if (this.heartRateZone_ == null) {
         var1 = ExercisePhase$PbPhaseIntensity$IntensityZone.getDefaultInstance();
      } else {
         var1 = this.heartRateZone_;
      }

      return (ExercisePhase$PbPhaseIntensity$IntensityZoneOrBuilder)var1;
   }

   public ExercisePhase$PbPhaseIntensity$PhaseIntensityType getIntensityType() {
      ExercisePhase$PbPhaseIntensity$PhaseIntensityType var1 = ExercisePhase$PbPhaseIntensity$PhaseIntensityType.valueOf(this.intensityType_);
      ExercisePhase$PbPhaseIntensity$PhaseIntensityType var2 = var1;
      if (var1 == null) {
         var2 = ExercisePhase$PbPhaseIntensity$PhaseIntensityType.PHASE_INTENSITY_FREE;
      }

      return var2;
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone getPowerZone() {
      ExercisePhase$PbPhaseIntensity$IntensityZone var1;
      if (this.powerZoneBuilder_ == null) {
         if (this.powerZone_ == null) {
            var1 = ExercisePhase$PbPhaseIntensity$IntensityZone.getDefaultInstance();
         } else {
            var1 = this.powerZone_;
         }
      } else {
         var1 = (ExercisePhase$PbPhaseIntensity$IntensityZone)this.powerZoneBuilder_.getMessage();
      }

      return var1;
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone$Builder getPowerZoneBuilder() {
      this.bitField0_ |= 8;
      this.onChanged();
      return (ExercisePhase$PbPhaseIntensity$IntensityZone$Builder)this.getPowerZoneFieldBuilder().getBuilder();
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZoneOrBuilder getPowerZoneOrBuilder() {
      Object var1;
      if (this.powerZoneBuilder_ != null) {
         var1 = (ExercisePhase$PbPhaseIntensity$IntensityZoneOrBuilder)this.powerZoneBuilder_.getMessageOrBuilder();
      } else if (this.powerZone_ == null) {
         var1 = ExercisePhase$PbPhaseIntensity$IntensityZone.getDefaultInstance();
      } else {
         var1 = this.powerZone_;
      }

      return (ExercisePhase$PbPhaseIntensity$IntensityZoneOrBuilder)var1;
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone getSpeedZone() {
      ExercisePhase$PbPhaseIntensity$IntensityZone var1;
      if (this.speedZoneBuilder_ == null) {
         if (this.speedZone_ == null) {
            var1 = ExercisePhase$PbPhaseIntensity$IntensityZone.getDefaultInstance();
         } else {
            var1 = this.speedZone_;
         }
      } else {
         var1 = (ExercisePhase$PbPhaseIntensity$IntensityZone)this.speedZoneBuilder_.getMessage();
      }

      return var1;
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone$Builder getSpeedZoneBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (ExercisePhase$PbPhaseIntensity$IntensityZone$Builder)this.getSpeedZoneFieldBuilder().getBuilder();
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZoneOrBuilder getSpeedZoneOrBuilder() {
      Object var1;
      if (this.speedZoneBuilder_ != null) {
         var1 = (ExercisePhase$PbPhaseIntensity$IntensityZoneOrBuilder)this.speedZoneBuilder_.getMessageOrBuilder();
      } else if (this.speedZone_ == null) {
         var1 = ExercisePhase$PbPhaseIntensity$IntensityZone.getDefaultInstance();
      } else {
         var1 = this.speedZone_;
      }

      return (ExercisePhase$PbPhaseIntensity$IntensityZoneOrBuilder)var1;
   }

   public boolean hasHeartRateZone() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasIntensityType() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPowerZone() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSpeedZone() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExercisePhase.d().ensureFieldAccessorsInitialized(ExercisePhase$PbPhaseIntensity.class, ExercisePhase$PbPhaseIntensity$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasIntensityType()) {
         var2 = var1;
      } else {
         if (this.hasHeartRateZone()) {
            var2 = var1;
            if (!this.getHeartRateZone().isInitialized()) {
               return var2;
            }
         }

         if (this.hasSpeedZone()) {
            var2 = var1;
            if (!this.getSpeedZone().isInitialized()) {
               return var2;
            }
         }

         if (this.hasPowerZone()) {
            var2 = var1;
            if (!this.getPowerZone().isInitialized()) {
               return var2;
            }
         }

         var2 = true;
      }

      return var2;
   }

   public ExercisePhase$PbPhaseIntensity$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExercisePhase$PbPhaseIntensity var13;
      label96: {
         InvalidProtocolBufferException var12;
         ExercisePhase$PbPhaseIntensity var14;
         try {
            var13 = (ExercisePhase$PbPhaseIntensity)ExercisePhase$PbPhaseIntensity.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (ExercisePhase$PbPhaseIntensity)var10.getUnfinishedMessage();
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

   public ExercisePhase$PbPhaseIntensity$Builder mergeFrom(Message var1) {
      ExercisePhase$PbPhaseIntensity$Builder var2;
      if (var1 instanceof ExercisePhase$PbPhaseIntensity) {
         var2 = this.mergeFrom((ExercisePhase$PbPhaseIntensity)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExercisePhase$PbPhaseIntensity$Builder mergeFrom(ExercisePhase$PbPhaseIntensity var1) {
      if (var1 != ExercisePhase$PbPhaseIntensity.getDefaultInstance()) {
         if (var1.hasIntensityType()) {
            this.setIntensityType(var1.getIntensityType());
         }

         if (var1.hasHeartRateZone()) {
            this.mergeHeartRateZone(var1.getHeartRateZone());
         }

         if (var1.hasSpeedZone()) {
            this.mergeSpeedZone(var1.getSpeedZone());
         }

         if (var1.hasPowerZone()) {
            this.mergePowerZone(var1.getPowerZone());
         }

         this.mergeUnknownFields(ExercisePhase$PbPhaseIntensity.a(var1));
         this.onChanged();
      }

      return this;
   }

   public ExercisePhase$PbPhaseIntensity$Builder mergeHeartRateZone(ExercisePhase$PbPhaseIntensity$IntensityZone var1) {
      if (this.heartRateZoneBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.heartRateZone_ != null && this.heartRateZone_ != ExercisePhase$PbPhaseIntensity$IntensityZone.getDefaultInstance()) {
            this.heartRateZone_ = ExercisePhase$PbPhaseIntensity$IntensityZone.newBuilder(this.heartRateZone_).mergeFrom(var1).buildPartial();
         } else {
            this.heartRateZone_ = var1;
         }

         this.onChanged();
      } else {
         this.heartRateZoneBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExercisePhase$PbPhaseIntensity$Builder mergePowerZone(ExercisePhase$PbPhaseIntensity$IntensityZone var1) {
      if (this.powerZoneBuilder_ == null) {
         if ((this.bitField0_ & 8) == 8 && this.powerZone_ != null && this.powerZone_ != ExercisePhase$PbPhaseIntensity$IntensityZone.getDefaultInstance()) {
            this.powerZone_ = ExercisePhase$PbPhaseIntensity$IntensityZone.newBuilder(this.powerZone_).mergeFrom(var1).buildPartial();
         } else {
            this.powerZone_ = var1;
         }

         this.onChanged();
      } else {
         this.powerZoneBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public ExercisePhase$PbPhaseIntensity$Builder mergeSpeedZone(ExercisePhase$PbPhaseIntensity$IntensityZone var1) {
      if (this.speedZoneBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.speedZone_ != null && this.speedZone_ != ExercisePhase$PbPhaseIntensity$IntensityZone.getDefaultInstance()) {
            this.speedZone_ = ExercisePhase$PbPhaseIntensity$IntensityZone.newBuilder(this.speedZone_).mergeFrom(var1).buildPartial();
         } else {
            this.speedZone_ = var1;
         }

         this.onChanged();
      } else {
         this.speedZoneBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public final ExercisePhase$PbPhaseIntensity$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExercisePhase$PbPhaseIntensity$Builder)super.mergeUnknownFields(var1);
   }

   public ExercisePhase$PbPhaseIntensity$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExercisePhase$PbPhaseIntensity$Builder)super.setField(var1, var2);
   }

   public ExercisePhase$PbPhaseIntensity$Builder setHeartRateZone(ExercisePhase$PbPhaseIntensity$IntensityZone$Builder var1) {
      if (this.heartRateZoneBuilder_ == null) {
         this.heartRateZone_ = var1.build();
         this.onChanged();
      } else {
         this.heartRateZoneBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExercisePhase$PbPhaseIntensity$Builder setHeartRateZone(ExercisePhase$PbPhaseIntensity$IntensityZone var1) {
      if (this.heartRateZoneBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.heartRateZone_ = var1;
         this.onChanged();
      } else {
         this.heartRateZoneBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExercisePhase$PbPhaseIntensity$Builder setIntensityType(ExercisePhase$PbPhaseIntensity$PhaseIntensityType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.intensityType_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public ExercisePhase$PbPhaseIntensity$Builder setPowerZone(ExercisePhase$PbPhaseIntensity$IntensityZone$Builder var1) {
      if (this.powerZoneBuilder_ == null) {
         this.powerZone_ = var1.build();
         this.onChanged();
      } else {
         this.powerZoneBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8;
      return this;
   }

   public ExercisePhase$PbPhaseIntensity$Builder setPowerZone(ExercisePhase$PbPhaseIntensity$IntensityZone var1) {
      if (this.powerZoneBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.powerZone_ = var1;
         this.onChanged();
      } else {
         this.powerZoneBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public ExercisePhase$PbPhaseIntensity$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExercisePhase$PbPhaseIntensity$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public ExercisePhase$PbPhaseIntensity$Builder setSpeedZone(ExercisePhase$PbPhaseIntensity$IntensityZone$Builder var1) {
      if (this.speedZoneBuilder_ == null) {
         this.speedZone_ = var1.build();
         this.onChanged();
      } else {
         this.speedZoneBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public ExercisePhase$PbPhaseIntensity$Builder setSpeedZone(ExercisePhase$PbPhaseIntensity$IntensityZone var1) {
      if (this.speedZoneBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.speedZone_ = var1;
         this.onChanged();
      } else {
         this.speedZoneBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public final ExercisePhase$PbPhaseIntensity$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExercisePhase$PbPhaseIntensity$Builder)super.setUnknownFields(var1);
   }
}
