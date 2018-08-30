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

public final class PhysData$PbUserTypicalDay$Builder extends Builder implements PhysData$PbUserTypicalDayOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 lastModifiedBuilder_;
   private Types$PbSystemDateTime lastModified_;
   private int value_;

   private PhysData$PbUserTypicalDay$Builder() {
      this.value_ = 1;
      this.lastModified_ = null;
      this.maybeForceBuilderInitialization();
   }

   private PhysData$PbUserTypicalDay$Builder(BuilderParent var1) {
      super(var1);
      this.value_ = 1;
      this.lastModified_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PhysData$PbUserTypicalDay$Builder(BuilderParent var1, PhysData$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PhysData$PbUserTypicalDay$Builder(PhysData$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PhysData.o();
   }

   private SingleFieldBuilderV3 getLastModifiedFieldBuilder() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModifiedBuilder_ = new SingleFieldBuilderV3(this.getLastModified(), this.getParentForChildren(), this.isClean());
         this.lastModified_ = null;
      }

      return this.lastModifiedBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (PhysData$PbUserTypicalDay.b()) {
         this.getLastModifiedFieldBuilder();
      }

   }

   public PhysData$PbUserTypicalDay$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PhysData$PbUserTypicalDay$Builder)super.addRepeatedField(var1, var2);
   }

   public PhysData$PbUserTypicalDay build() {
      PhysData$PbUserTypicalDay var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PhysData$PbUserTypicalDay buildPartial() {
      int var1 = 1;
      PhysData$PbUserTypicalDay var2 = new PhysData$PbUserTypicalDay(this, (PhysData$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      PhysData$PbUserTypicalDay.a(var2, this.value_);
      if ((var3 & 2) == 2) {
         var1 |= 2;
      }

      if (this.lastModifiedBuilder_ == null) {
         PhysData$PbUserTypicalDay.a(var2, this.lastModified_);
      } else {
         PhysData$PbUserTypicalDay.a(var2, (Types$PbSystemDateTime)this.lastModifiedBuilder_.build());
      }

      PhysData$PbUserTypicalDay.b(var2, var1);
      this.onBuilt();
      return var2;
   }

   public PhysData$PbUserTypicalDay$Builder clear() {
      super.clear();
      this.value_ = 1;
      this.bitField0_ &= -2;
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public PhysData$PbUserTypicalDay$Builder clearField(FieldDescriptor var1) {
      return (PhysData$PbUserTypicalDay$Builder)super.clearField(var1);
   }

   public PhysData$PbUserTypicalDay$Builder clearLastModified() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public PhysData$PbUserTypicalDay$Builder clearOneof(OneofDescriptor var1) {
      return (PhysData$PbUserTypicalDay$Builder)super.clearOneof(var1);
   }

   public PhysData$PbUserTypicalDay$Builder clearValue() {
      this.bitField0_ &= -2;
      this.value_ = 1;
      this.onChanged();
      return this;
   }

   public PhysData$PbUserTypicalDay$Builder clone() {
      return (PhysData$PbUserTypicalDay$Builder)super.clone();
   }

   public PhysData$PbUserTypicalDay getDefaultInstanceForType() {
      return PhysData$PbUserTypicalDay.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PhysData.o();
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

   public PhysData$PbUserTypicalDay$TypicalDay getValue() {
      PhysData$PbUserTypicalDay$TypicalDay var1 = PhysData$PbUserTypicalDay$TypicalDay.valueOf(this.value_);
      PhysData$PbUserTypicalDay$TypicalDay var2 = var1;
      if (var1 == null) {
         var2 = PhysData$PbUserTypicalDay$TypicalDay.MOSTLY_SITTING;
      }

      return var2;
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
      return PhysData.p().ensureFieldAccessorsInitialized(PhysData$PbUserTypicalDay.class, PhysData$PbUserTypicalDay$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasValue()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasLastModified()) {
            var2 = var1;
            if (this.getLastModified().isInitialized()) {
               var2 = true;
            }
         }
      }

      return var2;
   }

   public PhysData$PbUserTypicalDay$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PhysData$PbUserTypicalDay var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (PhysData$PbUserTypicalDay)PhysData$PbUserTypicalDay.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (PhysData$PbUserTypicalDay)var10.getUnfinishedMessage();
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

   public PhysData$PbUserTypicalDay$Builder mergeFrom(Message var1) {
      PhysData$PbUserTypicalDay$Builder var2;
      if (var1 instanceof PhysData$PbUserTypicalDay) {
         var2 = this.mergeFrom((PhysData$PbUserTypicalDay)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PhysData$PbUserTypicalDay$Builder mergeFrom(PhysData$PbUserTypicalDay var1) {
      if (var1 != PhysData$PbUserTypicalDay.getDefaultInstance()) {
         if (var1.hasValue()) {
            this.setValue(var1.getValue());
         }

         if (var1.hasLastModified()) {
            this.mergeLastModified(var1.getLastModified());
         }

         this.mergeUnknownFields(PhysData$PbUserTypicalDay.a(var1));
         this.onChanged();
      }

      return this;
   }

   public PhysData$PbUserTypicalDay$Builder mergeLastModified(Types$PbSystemDateTime var1) {
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

   public final PhysData$PbUserTypicalDay$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PhysData$PbUserTypicalDay$Builder)super.mergeUnknownFields(var1);
   }

   public PhysData$PbUserTypicalDay$Builder setField(FieldDescriptor var1, Object var2) {
      return (PhysData$PbUserTypicalDay$Builder)super.setField(var1, var2);
   }

   public PhysData$PbUserTypicalDay$Builder setLastModified(Types$PbSystemDateTime$Builder var1) {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = var1.build();
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public PhysData$PbUserTypicalDay$Builder setLastModified(Types$PbSystemDateTime var1) {
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

   public PhysData$PbUserTypicalDay$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PhysData$PbUserTypicalDay$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final PhysData$PbUserTypicalDay$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PhysData$PbUserTypicalDay$Builder)super.setUnknownFields(var1);
   }

   public PhysData$PbUserTypicalDay$Builder setValue(PhysData$PbUserTypicalDay$TypicalDay var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.value_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }
}
