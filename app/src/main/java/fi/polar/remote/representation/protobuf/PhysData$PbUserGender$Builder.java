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

public final class PhysData$PbUserGender$Builder extends Builder implements PhysData$PbUserGenderOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 lastModifiedBuilder_;
   private Types$PbSystemDateTime lastModified_;
   private int value_;

   private PhysData$PbUserGender$Builder() {
      this.value_ = 1;
      this.lastModified_ = null;
      this.maybeForceBuilderInitialization();
   }

   private PhysData$PbUserGender$Builder(BuilderParent var1) {
      super(var1);
      this.value_ = 1;
      this.lastModified_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PhysData$PbUserGender$Builder(BuilderParent var1, PhysData$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PhysData$PbUserGender$Builder(PhysData$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PhysData.c();
   }

   private SingleFieldBuilderV3 getLastModifiedFieldBuilder() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModifiedBuilder_ = new SingleFieldBuilderV3(this.getLastModified(), this.getParentForChildren(), this.isClean());
         this.lastModified_ = null;
      }

      return this.lastModifiedBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (PhysData$PbUserGender.b()) {
         this.getLastModifiedFieldBuilder();
      }

   }

   public PhysData$PbUserGender$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PhysData$PbUserGender$Builder)super.addRepeatedField(var1, var2);
   }

   public PhysData$PbUserGender build() {
      PhysData$PbUserGender var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PhysData$PbUserGender buildPartial() {
      int var1 = 1;
      PhysData$PbUserGender var2 = new PhysData$PbUserGender(this, (PhysData$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      PhysData$PbUserGender.a(var2, this.value_);
      if ((var3 & 2) == 2) {
         var1 |= 2;
      }

      if (this.lastModifiedBuilder_ == null) {
         PhysData$PbUserGender.a(var2, this.lastModified_);
      } else {
         PhysData$PbUserGender.a(var2, (Types$PbSystemDateTime)this.lastModifiedBuilder_.build());
      }

      PhysData$PbUserGender.b(var2, var1);
      this.onBuilt();
      return var2;
   }

   public PhysData$PbUserGender$Builder clear() {
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

   public PhysData$PbUserGender$Builder clearField(FieldDescriptor var1) {
      return (PhysData$PbUserGender$Builder)super.clearField(var1);
   }

   public PhysData$PbUserGender$Builder clearLastModified() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public PhysData$PbUserGender$Builder clearOneof(OneofDescriptor var1) {
      return (PhysData$PbUserGender$Builder)super.clearOneof(var1);
   }

   public PhysData$PbUserGender$Builder clearValue() {
      this.bitField0_ &= -2;
      this.value_ = 1;
      this.onChanged();
      return this;
   }

   public PhysData$PbUserGender$Builder clone() {
      return (PhysData$PbUserGender$Builder)super.clone();
   }

   public PhysData$PbUserGender getDefaultInstanceForType() {
      return PhysData$PbUserGender.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PhysData.c();
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

   public PhysData$PbUserGender$Gender getValue() {
      PhysData$PbUserGender$Gender var1 = PhysData$PbUserGender$Gender.valueOf(this.value_);
      PhysData$PbUserGender$Gender var2 = var1;
      if (var1 == null) {
         var2 = PhysData$PbUserGender$Gender.MALE;
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
      return PhysData.d().ensureFieldAccessorsInitialized(PhysData$PbUserGender.class, PhysData$PbUserGender$Builder.class);
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

   public PhysData$PbUserGender$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PhysData$PbUserGender var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (PhysData$PbUserGender)PhysData$PbUserGender.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (PhysData$PbUserGender)var10.getUnfinishedMessage();
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

   public PhysData$PbUserGender$Builder mergeFrom(Message var1) {
      PhysData$PbUserGender$Builder var2;
      if (var1 instanceof PhysData$PbUserGender) {
         var2 = this.mergeFrom((PhysData$PbUserGender)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PhysData$PbUserGender$Builder mergeFrom(PhysData$PbUserGender var1) {
      if (var1 != PhysData$PbUserGender.getDefaultInstance()) {
         if (var1.hasValue()) {
            this.setValue(var1.getValue());
         }

         if (var1.hasLastModified()) {
            this.mergeLastModified(var1.getLastModified());
         }

         this.mergeUnknownFields(PhysData$PbUserGender.a(var1));
         this.onChanged();
      }

      return this;
   }

   public PhysData$PbUserGender$Builder mergeLastModified(Types$PbSystemDateTime var1) {
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

   public final PhysData$PbUserGender$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PhysData$PbUserGender$Builder)super.mergeUnknownFields(var1);
   }

   public PhysData$PbUserGender$Builder setField(FieldDescriptor var1, Object var2) {
      return (PhysData$PbUserGender$Builder)super.setField(var1, var2);
   }

   public PhysData$PbUserGender$Builder setLastModified(Types$PbSystemDateTime$Builder var1) {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = var1.build();
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public PhysData$PbUserGender$Builder setLastModified(Types$PbSystemDateTime var1) {
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

   public PhysData$PbUserGender$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PhysData$PbUserGender$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final PhysData$PbUserGender$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PhysData$PbUserGender$Builder)super.setUnknownFields(var1);
   }

   public PhysData$PbUserGender$Builder setValue(PhysData$PbUserGender$Gender var1) {
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
