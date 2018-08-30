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

public final class Structures$PbTrainingSessionFavoriteId$Builder extends Builder implements Structures$PbTrainingSessionFavoriteIdOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 lastModifiedBuilder_;
   private Types$PbSystemDateTime lastModified_;
   private long value_;

   private Structures$PbTrainingSessionFavoriteId$Builder() {
      this.lastModified_ = null;
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbTrainingSessionFavoriteId$Builder(BuilderParent var1) {
      super(var1);
      this.lastModified_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbTrainingSessionFavoriteId$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbTrainingSessionFavoriteId$Builder(Structures$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Structures.I();
   }

   private SingleFieldBuilderV3 getLastModifiedFieldBuilder() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModifiedBuilder_ = new SingleFieldBuilderV3(this.getLastModified(), this.getParentForChildren(), this.isClean());
         this.lastModified_ = null;
      }

      return this.lastModifiedBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbTrainingSessionFavoriteId.b()) {
         this.getLastModifiedFieldBuilder();
      }

   }

   public Structures$PbTrainingSessionFavoriteId$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbTrainingSessionFavoriteId$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbTrainingSessionFavoriteId build() {
      Structures$PbTrainingSessionFavoriteId var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbTrainingSessionFavoriteId buildPartial() {
      int var1 = 1;
      Structures$PbTrainingSessionFavoriteId var2 = new Structures$PbTrainingSessionFavoriteId(this, (Structures$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Structures$PbTrainingSessionFavoriteId.a(var2, this.value_);
      if ((var3 & 2) == 2) {
         var1 |= 2;
      }

      if (this.lastModifiedBuilder_ == null) {
         Structures$PbTrainingSessionFavoriteId.a(var2, this.lastModified_);
      } else {
         Structures$PbTrainingSessionFavoriteId.a(var2, (Types$PbSystemDateTime)this.lastModifiedBuilder_.build());
      }

      Structures$PbTrainingSessionFavoriteId.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public Structures$PbTrainingSessionFavoriteId$Builder clear() {
      super.clear();
      this.value_ = 0L;
      this.bitField0_ &= -2;
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public Structures$PbTrainingSessionFavoriteId$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbTrainingSessionFavoriteId$Builder)super.clearField(var1);
   }

   public Structures$PbTrainingSessionFavoriteId$Builder clearLastModified() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public Structures$PbTrainingSessionFavoriteId$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbTrainingSessionFavoriteId$Builder)super.clearOneof(var1);
   }

   public Structures$PbTrainingSessionFavoriteId$Builder clearValue() {
      this.bitField0_ &= -2;
      this.value_ = 0L;
      this.onChanged();
      return this;
   }

   public Structures$PbTrainingSessionFavoriteId$Builder clone() {
      return (Structures$PbTrainingSessionFavoriteId$Builder)super.clone();
   }

   public Structures$PbTrainingSessionFavoriteId getDefaultInstanceForType() {
      return Structures$PbTrainingSessionFavoriteId.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.I();
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
      this.bitField0_ |= 2;
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

   public long getValue() {
      return this.value_;
   }

   public boolean hasLastModified() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasValue() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.J().ensureFieldAccessorsInitialized(Structures$PbTrainingSessionFavoriteId.class, Structures$PbTrainingSessionFavoriteId$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasValue() && (!this.hasLastModified() || this.getLastModified().isInitialized())) {
         var1 = true;
      }

      return var1;
   }

   public Structures$PbTrainingSessionFavoriteId$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbTrainingSessionFavoriteId var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (Structures$PbTrainingSessionFavoriteId)Structures$PbTrainingSessionFavoriteId.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (Structures$PbTrainingSessionFavoriteId)var10.getUnfinishedMessage();
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

   public Structures$PbTrainingSessionFavoriteId$Builder mergeFrom(Message var1) {
      Structures$PbTrainingSessionFavoriteId$Builder var2;
      if (var1 instanceof Structures$PbTrainingSessionFavoriteId) {
         var2 = this.mergeFrom((Structures$PbTrainingSessionFavoriteId)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbTrainingSessionFavoriteId$Builder mergeFrom(Structures$PbTrainingSessionFavoriteId var1) {
      if (var1 != Structures$PbTrainingSessionFavoriteId.getDefaultInstance()) {
         if (var1.hasValue()) {
            this.setValue(var1.getValue());
         }

         if (var1.hasLastModified()) {
            this.mergeLastModified(var1.getLastModified());
         }

         this.mergeUnknownFields(Structures$PbTrainingSessionFavoriteId.a(var1));
         this.onChanged();
      }

      return this;
   }

   public Structures$PbTrainingSessionFavoriteId$Builder mergeLastModified(Types$PbSystemDateTime var1) {
      if (this.lastModifiedBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.lastModified_ != null && this.lastModified_ != Types$PbSystemDateTime.getDefaultInstance()) {
            this.lastModified_ = Types$PbSystemDateTime.newBuilder(this.lastModified_).mergeFrom(var1).buildPartial();
         } else {
            this.lastModified_ = var1;
         }

         this.onChanged();
      } else {
         this.lastModifiedBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final Structures$PbTrainingSessionFavoriteId$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbTrainingSessionFavoriteId$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbTrainingSessionFavoriteId$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbTrainingSessionFavoriteId$Builder)super.setField(var1, var2);
   }

   public Structures$PbTrainingSessionFavoriteId$Builder setLastModified(Types$PbSystemDateTime$Builder var1) {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = var1.build();
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Structures$PbTrainingSessionFavoriteId$Builder setLastModified(Types$PbSystemDateTime var1) {
      if (this.lastModifiedBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.lastModified_ = var1;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Structures$PbTrainingSessionFavoriteId$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbTrainingSessionFavoriteId$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final Structures$PbTrainingSessionFavoriteId$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbTrainingSessionFavoriteId$Builder)super.setUnknownFields(var1);
   }

   public Structures$PbTrainingSessionFavoriteId$Builder setValue(long var1) {
      this.bitField0_ |= 1;
      this.value_ = var1;
      this.onChanged();
      return this;
   }
}
