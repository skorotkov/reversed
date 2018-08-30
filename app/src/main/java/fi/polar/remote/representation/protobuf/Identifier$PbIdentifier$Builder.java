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

public final class Identifier$PbIdentifier$Builder extends Builder implements Identifier$PbIdentifierOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 createdBuilder_;
   private Types$PbSystemDateTime created_;
   private boolean deleted_;
   private long ecosystemId_;
   private SingleFieldBuilderV3 lastModifiedBuilder_;
   private Types$PbSystemDateTime lastModified_;

   private Identifier$PbIdentifier$Builder() {
      this.created_ = null;
      this.lastModified_ = null;
      this.maybeForceBuilderInitialization();
   }

   private Identifier$PbIdentifier$Builder(BuilderParent var1) {
      super(var1);
      this.created_ = null;
      this.lastModified_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Identifier$PbIdentifier$Builder(BuilderParent var1, Identifier$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Identifier$PbIdentifier$Builder(Identifier$1 var1) {
      this();
   }

   private SingleFieldBuilderV3 getCreatedFieldBuilder() {
      if (this.createdBuilder_ == null) {
         this.createdBuilder_ = new SingleFieldBuilderV3(this.getCreated(), this.getParentForChildren(), this.isClean());
         this.created_ = null;
      }

      return this.createdBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return Identifier.a();
   }

   private SingleFieldBuilderV3 getLastModifiedFieldBuilder() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModifiedBuilder_ = new SingleFieldBuilderV3(this.getLastModified(), this.getParentForChildren(), this.isClean());
         this.lastModified_ = null;
      }

      return this.lastModifiedBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (Identifier$PbIdentifier.b()) {
         this.getCreatedFieldBuilder();
         this.getLastModifiedFieldBuilder();
      }

   }

   public Identifier$PbIdentifier$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Identifier$PbIdentifier$Builder)super.addRepeatedField(var1, var2);
   }

   public Identifier$PbIdentifier build() {
      Identifier$PbIdentifier var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Identifier$PbIdentifier buildPartial() {
      byte var1 = 1;
      Identifier$PbIdentifier var2 = new Identifier$PbIdentifier(this, (Identifier$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Identifier$PbIdentifier.a(var2, this.ecosystemId_);
      int var4;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      } else {
         var4 = var1;
      }

      if (this.createdBuilder_ == null) {
         Identifier$PbIdentifier.a(var2, this.created_);
      } else {
         Identifier$PbIdentifier.a(var2, (Types$PbSystemDateTime)this.createdBuilder_.build());
      }

      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      if (this.lastModifiedBuilder_ == null) {
         Identifier$PbIdentifier.b(var2, this.lastModified_);
      } else {
         Identifier$PbIdentifier.b(var2, (Types$PbSystemDateTime)this.lastModifiedBuilder_.build());
      }

      var4 = var5;
      if ((var3 & 8) == 8) {
         var4 = var5 | 8;
      }

      Identifier$PbIdentifier.a(var2, this.deleted_);
      Identifier$PbIdentifier.a(var2, var4);
      this.onBuilt();
      return var2;
   }

   public Identifier$PbIdentifier$Builder clear() {
      super.clear();
      this.ecosystemId_ = 0L;
      this.bitField0_ &= -2;
      if (this.createdBuilder_ == null) {
         this.created_ = null;
      } else {
         this.createdBuilder_.clear();
      }

      this.bitField0_ &= -3;
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -5;
      this.deleted_ = false;
      this.bitField0_ &= -9;
      return this;
   }

   public Identifier$PbIdentifier$Builder clearCreated() {
      if (this.createdBuilder_ == null) {
         this.created_ = null;
         this.onChanged();
      } else {
         this.createdBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public Identifier$PbIdentifier$Builder clearDeleted() {
      this.bitField0_ &= -9;
      this.deleted_ = false;
      this.onChanged();
      return this;
   }

   public Identifier$PbIdentifier$Builder clearEcosystemId() {
      this.bitField0_ &= -2;
      this.ecosystemId_ = 0L;
      this.onChanged();
      return this;
   }

   public Identifier$PbIdentifier$Builder clearField(FieldDescriptor var1) {
      return (Identifier$PbIdentifier$Builder)super.clearField(var1);
   }

   public Identifier$PbIdentifier$Builder clearLastModified() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public Identifier$PbIdentifier$Builder clearOneof(OneofDescriptor var1) {
      return (Identifier$PbIdentifier$Builder)super.clearOneof(var1);
   }

   public Identifier$PbIdentifier$Builder clone() {
      return (Identifier$PbIdentifier$Builder)super.clone();
   }

   public Types$PbSystemDateTime getCreated() {
      Types$PbSystemDateTime var1;
      if (this.createdBuilder_ == null) {
         if (this.created_ == null) {
            var1 = Types$PbSystemDateTime.getDefaultInstance();
         } else {
            var1 = this.created_;
         }
      } else {
         var1 = (Types$PbSystemDateTime)this.createdBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbSystemDateTime$Builder getCreatedBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Types$PbSystemDateTime$Builder)this.getCreatedFieldBuilder().getBuilder();
   }

   public Types$PbSystemDateTimeOrBuilder getCreatedOrBuilder() {
      Object var1;
      if (this.createdBuilder_ != null) {
         var1 = (Types$PbSystemDateTimeOrBuilder)this.createdBuilder_.getMessageOrBuilder();
      } else if (this.created_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.created_;
      }

      return (Types$PbSystemDateTimeOrBuilder)var1;
   }

   public Identifier$PbIdentifier getDefaultInstanceForType() {
      return Identifier$PbIdentifier.getDefaultInstance();
   }

   public boolean getDeleted() {
      return this.deleted_;
   }

   public Descriptor getDescriptorForType() {
      return Identifier.a();
   }

   public long getEcosystemId() {
      return this.ecosystemId_;
   }

   public Types$PbSystemDateTime getLastModified() {
      Types$PbSystemDateTime var1;
      if (this.lastModifiedBuilder_ == null) {
         if (this.lastModified_ == null) {
            var1 = Types$PbSystemDateTime.getDefaultInstance();
         } else {
            var1 = this.lastModified_;
         }
      } else {
         var1 = (Types$PbSystemDateTime)this.lastModifiedBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbSystemDateTime$Builder getLastModifiedBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (Types$PbSystemDateTime$Builder)this.getLastModifiedFieldBuilder().getBuilder();
   }

   public Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder() {
      Object var1;
      if (this.lastModifiedBuilder_ != null) {
         var1 = (Types$PbSystemDateTimeOrBuilder)this.lastModifiedBuilder_.getMessageOrBuilder();
      } else if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
      }

      return (Types$PbSystemDateTimeOrBuilder)var1;
   }

   public boolean hasCreated() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDeleted() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasEcosystemId() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLastModified() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Identifier.b().ensureFieldAccessorsInitialized(Identifier$PbIdentifier.class, Identifier$PbIdentifier$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasEcosystemId()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasCreated()) {
            var2 = var1;
            if (this.hasLastModified()) {
               var2 = var1;
               if (this.getCreated().isInitialized()) {
                  var2 = var1;
                  if (this.getLastModified().isInitialized()) {
                     var2 = true;
                  }
               }
            }
         }
      }

      return var2;
   }

   public Identifier$PbIdentifier$Builder mergeCreated(Types$PbSystemDateTime var1) {
      if (this.createdBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.created_ != null && this.created_ != Types$PbSystemDateTime.getDefaultInstance()) {
            this.created_ = Types$PbSystemDateTime.newBuilder(this.created_).mergeFrom(var1).buildPartial();
         } else {
            this.created_ = var1;
         }

         this.onChanged();
      } else {
         this.createdBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Identifier$PbIdentifier$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Identifier$PbIdentifier var13;
      label96: {
         InvalidProtocolBufferException var12;
         Identifier$PbIdentifier var14;
         try {
            var13 = (Identifier$PbIdentifier)Identifier$PbIdentifier.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Identifier$PbIdentifier)var10.getUnfinishedMessage();
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

   public Identifier$PbIdentifier$Builder mergeFrom(Message var1) {
      Identifier$PbIdentifier$Builder var2;
      if (var1 instanceof Identifier$PbIdentifier) {
         var2 = this.mergeFrom((Identifier$PbIdentifier)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Identifier$PbIdentifier$Builder mergeFrom(Identifier$PbIdentifier var1) {
      if (var1 != Identifier$PbIdentifier.getDefaultInstance()) {
         if (var1.hasEcosystemId()) {
            this.setEcosystemId(var1.getEcosystemId());
         }

         if (var1.hasCreated()) {
            this.mergeCreated(var1.getCreated());
         }

         if (var1.hasLastModified()) {
            this.mergeLastModified(var1.getLastModified());
         }

         if (var1.hasDeleted()) {
            this.setDeleted(var1.getDeleted());
         }

         this.mergeUnknownFields(Identifier$PbIdentifier.a(var1));
         this.onChanged();
      }

      return this;
   }

   public Identifier$PbIdentifier$Builder mergeLastModified(Types$PbSystemDateTime var1) {
      if (this.lastModifiedBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.lastModified_ != null && this.lastModified_ != Types$PbSystemDateTime.getDefaultInstance()) {
            this.lastModified_ = Types$PbSystemDateTime.newBuilder(this.lastModified_).mergeFrom(var1).buildPartial();
         } else {
            this.lastModified_ = var1;
         }

         this.onChanged();
      } else {
         this.lastModifiedBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public final Identifier$PbIdentifier$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Identifier$PbIdentifier$Builder)super.mergeUnknownFields(var1);
   }

   public Identifier$PbIdentifier$Builder setCreated(Types$PbSystemDateTime$Builder var1) {
      if (this.createdBuilder_ == null) {
         this.created_ = var1.build();
         this.onChanged();
      } else {
         this.createdBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Identifier$PbIdentifier$Builder setCreated(Types$PbSystemDateTime var1) {
      if (this.createdBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.created_ = var1;
         this.onChanged();
      } else {
         this.createdBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Identifier$PbIdentifier$Builder setDeleted(boolean var1) {
      this.bitField0_ |= 8;
      this.deleted_ = var1;
      this.onChanged();
      return this;
   }

   public Identifier$PbIdentifier$Builder setEcosystemId(long var1) {
      this.bitField0_ |= 1;
      this.ecosystemId_ = var1;
      this.onChanged();
      return this;
   }

   public Identifier$PbIdentifier$Builder setField(FieldDescriptor var1, Object var2) {
      return (Identifier$PbIdentifier$Builder)super.setField(var1, var2);
   }

   public Identifier$PbIdentifier$Builder setLastModified(Types$PbSystemDateTime$Builder var1) {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = var1.build();
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public Identifier$PbIdentifier$Builder setLastModified(Types$PbSystemDateTime var1) {
      if (this.lastModifiedBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.lastModified_ = var1;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public Identifier$PbIdentifier$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Identifier$PbIdentifier$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final Identifier$PbIdentifier$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Identifier$PbIdentifier$Builder)super.setUnknownFields(var1);
   }
}
