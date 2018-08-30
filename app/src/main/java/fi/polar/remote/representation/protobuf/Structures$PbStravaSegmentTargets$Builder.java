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

public final class Structures$PbStravaSegmentTargets$Builder extends Builder implements Structures$PbStravaSegmentTargetsOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 komQomBuilder_;
   private Types$PbDuration komQom_;
   private SingleFieldBuilderV3 ownBestBuilder_;
   private Types$PbDuration ownBest_;

   private Structures$PbStravaSegmentTargets$Builder() {
      this.ownBest_ = null;
      this.komQom_ = null;
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbStravaSegmentTargets$Builder(BuilderParent var1) {
      super(var1);
      this.ownBest_ = null;
      this.komQom_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbStravaSegmentTargets$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbStravaSegmentTargets$Builder(Structures$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Structures.c();
   }

   private SingleFieldBuilderV3 getKomQomFieldBuilder() {
      if (this.komQomBuilder_ == null) {
         this.komQomBuilder_ = new SingleFieldBuilderV3(this.getKomQom(), this.getParentForChildren(), this.isClean());
         this.komQom_ = null;
      }

      return this.komQomBuilder_;
   }

   private SingleFieldBuilderV3 getOwnBestFieldBuilder() {
      if (this.ownBestBuilder_ == null) {
         this.ownBestBuilder_ = new SingleFieldBuilderV3(this.getOwnBest(), this.getParentForChildren(), this.isClean());
         this.ownBest_ = null;
      }

      return this.ownBestBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbStravaSegmentTargets.b()) {
         this.getOwnBestFieldBuilder();
         this.getKomQomFieldBuilder();
      }

   }

   public Structures$PbStravaSegmentTargets$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbStravaSegmentTargets$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbStravaSegmentTargets build() {
      Structures$PbStravaSegmentTargets var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbStravaSegmentTargets buildPartial() {
      Structures$PbStravaSegmentTargets var1 = new Structures$PbStravaSegmentTargets(this, (Structures$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.ownBestBuilder_ == null) {
         Structures$PbStravaSegmentTargets.a(var1, this.ownBest_);
      } else {
         Structures$PbStravaSegmentTargets.a(var1, (Types$PbDuration)this.ownBestBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.komQomBuilder_ == null) {
         Structures$PbStravaSegmentTargets.b(var1, this.komQom_);
      } else {
         Structures$PbStravaSegmentTargets.b(var1, (Types$PbDuration)this.komQomBuilder_.build());
      }

      Structures$PbStravaSegmentTargets.a(var1, var4);
      this.onBuilt();
      return var1;
   }

   public Structures$PbStravaSegmentTargets$Builder clear() {
      super.clear();
      if (this.ownBestBuilder_ == null) {
         this.ownBest_ = null;
      } else {
         this.ownBestBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.komQomBuilder_ == null) {
         this.komQom_ = null;
      } else {
         this.komQomBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public Structures$PbStravaSegmentTargets$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbStravaSegmentTargets$Builder)super.clearField(var1);
   }

   public Structures$PbStravaSegmentTargets$Builder clearKomQom() {
      if (this.komQomBuilder_ == null) {
         this.komQom_ = null;
         this.onChanged();
      } else {
         this.komQomBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public Structures$PbStravaSegmentTargets$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbStravaSegmentTargets$Builder)super.clearOneof(var1);
   }

   public Structures$PbStravaSegmentTargets$Builder clearOwnBest() {
      if (this.ownBestBuilder_ == null) {
         this.ownBest_ = null;
         this.onChanged();
      } else {
         this.ownBestBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public Structures$PbStravaSegmentTargets$Builder clone() {
      return (Structures$PbStravaSegmentTargets$Builder)super.clone();
   }

   public Structures$PbStravaSegmentTargets getDefaultInstanceForType() {
      return Structures$PbStravaSegmentTargets.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.c();
   }

   public Types$PbDuration getKomQom() {
      Types$PbDuration var1;
      if (this.komQomBuilder_ == null) {
         if (this.komQom_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.komQom_;
         }
      } else {
         var1 = (Types$PbDuration)this.komQomBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getKomQomBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getKomQomFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getKomQomOrBuilder() {
      Object var1;
      if (this.komQomBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.komQomBuilder_.getMessageOrBuilder();
      } else if (this.komQom_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.komQom_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public Types$PbDuration getOwnBest() {
      Types$PbDuration var1;
      if (this.ownBestBuilder_ == null) {
         if (this.ownBest_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.ownBest_;
         }
      } else {
         var1 = (Types$PbDuration)this.ownBestBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getOwnBestBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getOwnBestFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getOwnBestOrBuilder() {
      Object var1;
      if (this.ownBestBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.ownBestBuilder_.getMessageOrBuilder();
      } else if (this.ownBest_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.ownBest_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public boolean hasKomQom() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasOwnBest() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.d().ensureFieldAccessorsInitialized(Structures$PbStravaSegmentTargets.class, Structures$PbStravaSegmentTargets$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public Structures$PbStravaSegmentTargets$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbStravaSegmentTargets var13;
      label96: {
         InvalidProtocolBufferException var12;
         Structures$PbStravaSegmentTargets var14;
         try {
            var13 = (Structures$PbStravaSegmentTargets)Structures$PbStravaSegmentTargets.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Structures$PbStravaSegmentTargets)var10.getUnfinishedMessage();
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

   public Structures$PbStravaSegmentTargets$Builder mergeFrom(Message var1) {
      Structures$PbStravaSegmentTargets$Builder var2;
      if (var1 instanceof Structures$PbStravaSegmentTargets) {
         var2 = this.mergeFrom((Structures$PbStravaSegmentTargets)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbStravaSegmentTargets$Builder mergeFrom(Structures$PbStravaSegmentTargets var1) {
      if (var1 != Structures$PbStravaSegmentTargets.getDefaultInstance()) {
         if (var1.hasOwnBest()) {
            this.mergeOwnBest(var1.getOwnBest());
         }

         if (var1.hasKomQom()) {
            this.mergeKomQom(var1.getKomQom());
         }

         this.mergeUnknownFields(Structures$PbStravaSegmentTargets.a(var1));
         this.onChanged();
      }

      return this;
   }

   public Structures$PbStravaSegmentTargets$Builder mergeKomQom(Types$PbDuration var1) {
      if (this.komQomBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.komQom_ != null && this.komQom_ != Types$PbDuration.getDefaultInstance()) {
            this.komQom_ = Types$PbDuration.newBuilder(this.komQom_).mergeFrom(var1).buildPartial();
         } else {
            this.komQom_ = var1;
         }

         this.onChanged();
      } else {
         this.komQomBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Structures$PbStravaSegmentTargets$Builder mergeOwnBest(Types$PbDuration var1) {
      if (this.ownBestBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.ownBest_ != null && this.ownBest_ != Types$PbDuration.getDefaultInstance()) {
            this.ownBest_ = Types$PbDuration.newBuilder(this.ownBest_).mergeFrom(var1).buildPartial();
         } else {
            this.ownBest_ = var1;
         }

         this.onChanged();
      } else {
         this.ownBestBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public final Structures$PbStravaSegmentTargets$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbStravaSegmentTargets$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbStravaSegmentTargets$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbStravaSegmentTargets$Builder)super.setField(var1, var2);
   }

   public Structures$PbStravaSegmentTargets$Builder setKomQom(Types$PbDuration$Builder var1) {
      if (this.komQomBuilder_ == null) {
         this.komQom_ = var1.build();
         this.onChanged();
      } else {
         this.komQomBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Structures$PbStravaSegmentTargets$Builder setKomQom(Types$PbDuration var1) {
      if (this.komQomBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.komQom_ = var1;
         this.onChanged();
      } else {
         this.komQomBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Structures$PbStravaSegmentTargets$Builder setOwnBest(Types$PbDuration$Builder var1) {
      if (this.ownBestBuilder_ == null) {
         this.ownBest_ = var1.build();
         this.onChanged();
      } else {
         this.ownBestBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Structures$PbStravaSegmentTargets$Builder setOwnBest(Types$PbDuration var1) {
      if (this.ownBestBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ownBest_ = var1;
         this.onChanged();
      } else {
         this.ownBestBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Structures$PbStravaSegmentTargets$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbStravaSegmentTargets$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final Structures$PbStravaSegmentTargets$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbStravaSegmentTargets$Builder)super.setUnknownFields(var1);
   }
}
