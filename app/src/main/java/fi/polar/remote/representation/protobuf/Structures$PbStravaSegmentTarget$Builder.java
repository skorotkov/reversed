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

public final class Structures$PbStravaSegmentTarget$Builder extends Builder implements Structures$PbStravaSegmentTargetOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 stravaSegmentTargetsBuilder_;
   private Structures$PbStravaSegmentTargets stravaSegmentTargets_;
   private int stravaSegmentType_;

   private Structures$PbStravaSegmentTarget$Builder() {
      this.stravaSegmentType_ = 1;
      this.stravaSegmentTargets_ = null;
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbStravaSegmentTarget$Builder(BuilderParent var1) {
      super(var1);
      this.stravaSegmentType_ = 1;
      this.stravaSegmentTargets_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbStravaSegmentTarget$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbStravaSegmentTarget$Builder(Structures$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Structures.e();
   }

   private SingleFieldBuilderV3 getStravaSegmentTargetsFieldBuilder() {
      if (this.stravaSegmentTargetsBuilder_ == null) {
         this.stravaSegmentTargetsBuilder_ = new SingleFieldBuilderV3(this.getStravaSegmentTargets(), this.getParentForChildren(), this.isClean());
         this.stravaSegmentTargets_ = null;
      }

      return this.stravaSegmentTargetsBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbStravaSegmentTarget.b()) {
         this.getStravaSegmentTargetsFieldBuilder();
      }

   }

   public Structures$PbStravaSegmentTarget$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbStravaSegmentTarget$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbStravaSegmentTarget build() {
      Structures$PbStravaSegmentTarget var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbStravaSegmentTarget buildPartial() {
      int var1 = 1;
      Structures$PbStravaSegmentTarget var2 = new Structures$PbStravaSegmentTarget(this, (Structures$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Structures$PbStravaSegmentTarget.a(var2, this.stravaSegmentType_);
      if ((var3 & 2) == 2) {
         var1 |= 2;
      }

      if (this.stravaSegmentTargetsBuilder_ == null) {
         Structures$PbStravaSegmentTarget.a(var2, this.stravaSegmentTargets_);
      } else {
         Structures$PbStravaSegmentTarget.a(var2, (Structures$PbStravaSegmentTargets)this.stravaSegmentTargetsBuilder_.build());
      }

      Structures$PbStravaSegmentTarget.b(var2, var1);
      this.onBuilt();
      return var2;
   }

   public Structures$PbStravaSegmentTarget$Builder clear() {
      super.clear();
      this.stravaSegmentType_ = 1;
      this.bitField0_ &= -2;
      if (this.stravaSegmentTargetsBuilder_ == null) {
         this.stravaSegmentTargets_ = null;
      } else {
         this.stravaSegmentTargetsBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public Structures$PbStravaSegmentTarget$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbStravaSegmentTarget$Builder)super.clearField(var1);
   }

   public Structures$PbStravaSegmentTarget$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbStravaSegmentTarget$Builder)super.clearOneof(var1);
   }

   public Structures$PbStravaSegmentTarget$Builder clearStravaSegmentTargets() {
      if (this.stravaSegmentTargetsBuilder_ == null) {
         this.stravaSegmentTargets_ = null;
         this.onChanged();
      } else {
         this.stravaSegmentTargetsBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public Structures$PbStravaSegmentTarget$Builder clearStravaSegmentType() {
      this.bitField0_ &= -2;
      this.stravaSegmentType_ = 1;
      this.onChanged();
      return this;
   }

   public Structures$PbStravaSegmentTarget$Builder clone() {
      return (Structures$PbStravaSegmentTarget$Builder)super.clone();
   }

   public Structures$PbStravaSegmentTarget getDefaultInstanceForType() {
      return Structures$PbStravaSegmentTarget.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.e();
   }

   public Structures$PbStravaSegmentTargets getStravaSegmentTargets() {
      Structures$PbStravaSegmentTargets var1;
      if (this.stravaSegmentTargetsBuilder_ == null) {
         if (this.stravaSegmentTargets_ == null) {
            var1 = Structures$PbStravaSegmentTargets.getDefaultInstance();
         } else {
            var1 = this.stravaSegmentTargets_;
         }
      } else {
         var1 = (Structures$PbStravaSegmentTargets)this.stravaSegmentTargetsBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbStravaSegmentTargets$Builder getStravaSegmentTargetsBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Structures$PbStravaSegmentTargets$Builder)this.getStravaSegmentTargetsFieldBuilder().getBuilder();
   }

   public Structures$PbStravaSegmentTargetsOrBuilder getStravaSegmentTargetsOrBuilder() {
      Object var1;
      if (this.stravaSegmentTargetsBuilder_ != null) {
         var1 = (Structures$PbStravaSegmentTargetsOrBuilder)this.stravaSegmentTargetsBuilder_.getMessageOrBuilder();
      } else if (this.stravaSegmentTargets_ == null) {
         var1 = Structures$PbStravaSegmentTargets.getDefaultInstance();
      } else {
         var1 = this.stravaSegmentTargets_;
      }

      return (Structures$PbStravaSegmentTargetsOrBuilder)var1;
   }

   public Structures$PbStravaSegmentTarget$PbStravaSegmentType getStravaSegmentType() {
      Structures$PbStravaSegmentTarget$PbStravaSegmentType var1 = Structures$PbStravaSegmentTarget$PbStravaSegmentType.valueOf(this.stravaSegmentType_);
      Structures$PbStravaSegmentTarget$PbStravaSegmentType var2 = var1;
      if (var1 == null) {
         var2 = Structures$PbStravaSegmentTarget$PbStravaSegmentType.STRAVA_SEGMENT_TYPE_RIDE;
      }

      return var2;
   }

   public boolean hasStravaSegmentTargets() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStravaSegmentType() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.f().ensureFieldAccessorsInitialized(Structures$PbStravaSegmentTarget.class, Structures$PbStravaSegmentTarget$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasStravaSegmentType()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public Structures$PbStravaSegmentTarget$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbStravaSegmentTarget var13;
      label96: {
         InvalidProtocolBufferException var12;
         Structures$PbStravaSegmentTarget var14;
         try {
            var13 = (Structures$PbStravaSegmentTarget)Structures$PbStravaSegmentTarget.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Structures$PbStravaSegmentTarget)var10.getUnfinishedMessage();
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

   public Structures$PbStravaSegmentTarget$Builder mergeFrom(Message var1) {
      Structures$PbStravaSegmentTarget$Builder var2;
      if (var1 instanceof Structures$PbStravaSegmentTarget) {
         var2 = this.mergeFrom((Structures$PbStravaSegmentTarget)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbStravaSegmentTarget$Builder mergeFrom(Structures$PbStravaSegmentTarget var1) {
      if (var1 != Structures$PbStravaSegmentTarget.getDefaultInstance()) {
         if (var1.hasStravaSegmentType()) {
            this.setStravaSegmentType(var1.getStravaSegmentType());
         }

         if (var1.hasStravaSegmentTargets()) {
            this.mergeStravaSegmentTargets(var1.getStravaSegmentTargets());
         }

         this.mergeUnknownFields(Structures$PbStravaSegmentTarget.a(var1));
         this.onChanged();
      }

      return this;
   }

   public Structures$PbStravaSegmentTarget$Builder mergeStravaSegmentTargets(Structures$PbStravaSegmentTargets var1) {
      if (this.stravaSegmentTargetsBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.stravaSegmentTargets_ != null && this.stravaSegmentTargets_ != Structures$PbStravaSegmentTargets.getDefaultInstance()) {
            this.stravaSegmentTargets_ = Structures$PbStravaSegmentTargets.newBuilder(this.stravaSegmentTargets_).mergeFrom(var1).buildPartial();
         } else {
            this.stravaSegmentTargets_ = var1;
         }

         this.onChanged();
      } else {
         this.stravaSegmentTargetsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final Structures$PbStravaSegmentTarget$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbStravaSegmentTarget$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbStravaSegmentTarget$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbStravaSegmentTarget$Builder)super.setField(var1, var2);
   }

   public Structures$PbStravaSegmentTarget$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbStravaSegmentTarget$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Structures$PbStravaSegmentTarget$Builder setStravaSegmentTargets(Structures$PbStravaSegmentTargets$Builder var1) {
      if (this.stravaSegmentTargetsBuilder_ == null) {
         this.stravaSegmentTargets_ = var1.build();
         this.onChanged();
      } else {
         this.stravaSegmentTargetsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Structures$PbStravaSegmentTarget$Builder setStravaSegmentTargets(Structures$PbStravaSegmentTargets var1) {
      if (this.stravaSegmentTargetsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.stravaSegmentTargets_ = var1;
         this.onChanged();
      } else {
         this.stravaSegmentTargetsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Structures$PbStravaSegmentTarget$Builder setStravaSegmentType(Structures$PbStravaSegmentTarget$PbStravaSegmentType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.stravaSegmentType_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public final Structures$PbStravaSegmentTarget$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbStravaSegmentTarget$Builder)super.setUnknownFields(var1);
   }
}
