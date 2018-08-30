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

public final class Structures$PbVolumeTarget$Builder extends Builder implements Structures$PbVolumeTargetOrBuilder {
   private int bitField0_;
   private int calories_;
   private float distance_;
   private SingleFieldBuilderV3 durationBuilder_;
   private Types$PbDuration duration_;
   private int targetType_;

   private Structures$PbVolumeTarget$Builder() {
      this.targetType_ = 0;
      this.duration_ = null;
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbVolumeTarget$Builder(BuilderParent var1) {
      super(var1);
      this.targetType_ = 0;
      this.duration_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbVolumeTarget$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbVolumeTarget$Builder(Structures$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Structures.a();
   }

   private SingleFieldBuilderV3 getDurationFieldBuilder() {
      if (this.durationBuilder_ == null) {
         this.durationBuilder_ = new SingleFieldBuilderV3(this.getDuration(), this.getParentForChildren(), this.isClean());
         this.duration_ = null;
      }

      return this.durationBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbVolumeTarget.b()) {
         this.getDurationFieldBuilder();
      }

   }

   public Structures$PbVolumeTarget$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbVolumeTarget$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbVolumeTarget build() {
      Structures$PbVolumeTarget var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbVolumeTarget buildPartial() {
      byte var1 = 1;
      Structures$PbVolumeTarget var2 = new Structures$PbVolumeTarget(this, (Structures$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Structures$PbVolumeTarget.a(var2, this.targetType_);
      int var4;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      } else {
         var4 = var1;
      }

      if (this.durationBuilder_ == null) {
         Structures$PbVolumeTarget.a(var2, this.duration_);
      } else {
         Structures$PbVolumeTarget.a(var2, (Types$PbDuration)this.durationBuilder_.build());
      }

      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      Structures$PbVolumeTarget.a(var2, this.distance_);
      var4 = var5;
      if ((var3 & 8) == 8) {
         var4 = var5 | 8;
      }

      Structures$PbVolumeTarget.b(var2, this.calories_);
      Structures$PbVolumeTarget.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public Structures$PbVolumeTarget$Builder clear() {
      super.clear();
      this.targetType_ = 0;
      this.bitField0_ &= -2;
      if (this.durationBuilder_ == null) {
         this.duration_ = null;
      } else {
         this.durationBuilder_.clear();
      }

      this.bitField0_ &= -3;
      this.distance_ = 0.0F;
      this.bitField0_ &= -5;
      this.calories_ = 0;
      this.bitField0_ &= -9;
      return this;
   }

   public Structures$PbVolumeTarget$Builder clearCalories() {
      this.bitField0_ &= -9;
      this.calories_ = 0;
      this.onChanged();
      return this;
   }

   public Structures$PbVolumeTarget$Builder clearDistance() {
      this.bitField0_ &= -5;
      this.distance_ = 0.0F;
      this.onChanged();
      return this;
   }

   public Structures$PbVolumeTarget$Builder clearDuration() {
      if (this.durationBuilder_ == null) {
         this.duration_ = null;
         this.onChanged();
      } else {
         this.durationBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public Structures$PbVolumeTarget$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbVolumeTarget$Builder)super.clearField(var1);
   }

   public Structures$PbVolumeTarget$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbVolumeTarget$Builder)super.clearOneof(var1);
   }

   public Structures$PbVolumeTarget$Builder clearTargetType() {
      this.bitField0_ &= -2;
      this.targetType_ = 0;
      this.onChanged();
      return this;
   }

   public Structures$PbVolumeTarget$Builder clone() {
      return (Structures$PbVolumeTarget$Builder)super.clone();
   }

   public int getCalories() {
      return this.calories_;
   }

   public Structures$PbVolumeTarget getDefaultInstanceForType() {
      return Structures$PbVolumeTarget.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.a();
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

   public Structures$PbVolumeTarget$PbVolymeTargetType getTargetType() {
      Structures$PbVolumeTarget$PbVolymeTargetType var1 = Structures$PbVolumeTarget$PbVolymeTargetType.valueOf(this.targetType_);
      Structures$PbVolumeTarget$PbVolymeTargetType var2 = var1;
      if (var1 == null) {
         var2 = Structures$PbVolumeTarget$PbVolymeTargetType.VOLUME_TARGET_TYPE_DURATION;
      }

      return var2;
   }

   public boolean hasCalories() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
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

   public boolean hasTargetType() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.b().ensureFieldAccessorsInitialized(Structures$PbVolumeTarget.class, Structures$PbVolumeTarget$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasTargetType()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public Structures$PbVolumeTarget$Builder mergeDuration(Types$PbDuration var1) {
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

   public Structures$PbVolumeTarget$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbVolumeTarget var13;
      label96: {
         InvalidProtocolBufferException var12;
         Structures$PbVolumeTarget var14;
         try {
            var13 = (Structures$PbVolumeTarget)Structures$PbVolumeTarget.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Structures$PbVolumeTarget)var10.getUnfinishedMessage();
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

   public Structures$PbVolumeTarget$Builder mergeFrom(Message var1) {
      Structures$PbVolumeTarget$Builder var2;
      if (var1 instanceof Structures$PbVolumeTarget) {
         var2 = this.mergeFrom((Structures$PbVolumeTarget)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbVolumeTarget$Builder mergeFrom(Structures$PbVolumeTarget var1) {
      if (var1 != Structures$PbVolumeTarget.getDefaultInstance()) {
         if (var1.hasTargetType()) {
            this.setTargetType(var1.getTargetType());
         }

         if (var1.hasDuration()) {
            this.mergeDuration(var1.getDuration());
         }

         if (var1.hasDistance()) {
            this.setDistance(var1.getDistance());
         }

         if (var1.hasCalories()) {
            this.setCalories(var1.getCalories());
         }

         this.mergeUnknownFields(Structures$PbVolumeTarget.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Structures$PbVolumeTarget$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbVolumeTarget$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbVolumeTarget$Builder setCalories(int var1) {
      this.bitField0_ |= 8;
      this.calories_ = var1;
      this.onChanged();
      return this;
   }

   public Structures$PbVolumeTarget$Builder setDistance(float var1) {
      this.bitField0_ |= 4;
      this.distance_ = var1;
      this.onChanged();
      return this;
   }

   public Structures$PbVolumeTarget$Builder setDuration(Types$PbDuration$Builder var1) {
      if (this.durationBuilder_ == null) {
         this.duration_ = var1.build();
         this.onChanged();
      } else {
         this.durationBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Structures$PbVolumeTarget$Builder setDuration(Types$PbDuration var1) {
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

   public Structures$PbVolumeTarget$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbVolumeTarget$Builder)super.setField(var1, var2);
   }

   public Structures$PbVolumeTarget$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbVolumeTarget$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Structures$PbVolumeTarget$Builder setTargetType(Structures$PbVolumeTarget$PbVolymeTargetType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.targetType_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public final Structures$PbVolumeTarget$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbVolumeTarget$Builder)super.setUnknownFields(var1);
   }
}
