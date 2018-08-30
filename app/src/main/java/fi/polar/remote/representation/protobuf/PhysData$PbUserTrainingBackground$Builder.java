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

public final class PhysData$PbUserTrainingBackground$Builder extends Builder implements PhysData$PbUserTrainingBackgroundOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 lastModifiedBuilder_;
   private Types$PbSystemDateTime lastModified_;
   private int value_;

   private PhysData$PbUserTrainingBackground$Builder() {
      this.value_ = 10;
      this.lastModified_ = null;
      this.maybeForceBuilderInitialization();
   }

   private PhysData$PbUserTrainingBackground$Builder(BuilderParent var1) {
      super(var1);
      this.value_ = 10;
      this.lastModified_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PhysData$PbUserTrainingBackground$Builder(BuilderParent var1, PhysData$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PhysData$PbUserTrainingBackground$Builder(PhysData$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PhysData.m();
   }

   private SingleFieldBuilderV3 getLastModifiedFieldBuilder() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModifiedBuilder_ = new SingleFieldBuilderV3(this.getLastModified(), this.getParentForChildren(), this.isClean());
         this.lastModified_ = null;
      }

      return this.lastModifiedBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (PhysData$PbUserTrainingBackground.b()) {
         this.getLastModifiedFieldBuilder();
      }

   }

   public PhysData$PbUserTrainingBackground$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PhysData$PbUserTrainingBackground$Builder)super.addRepeatedField(var1, var2);
   }

   public PhysData$PbUserTrainingBackground build() {
      PhysData$PbUserTrainingBackground var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PhysData$PbUserTrainingBackground buildPartial() {
      int var1 = 1;
      PhysData$PbUserTrainingBackground var2 = new PhysData$PbUserTrainingBackground(this, (PhysData$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      PhysData$PbUserTrainingBackground.a(var2, this.value_);
      if ((var3 & 2) == 2) {
         var1 |= 2;
      }

      if (this.lastModifiedBuilder_ == null) {
         PhysData$PbUserTrainingBackground.a(var2, this.lastModified_);
      } else {
         PhysData$PbUserTrainingBackground.a(var2, (Types$PbSystemDateTime)this.lastModifiedBuilder_.build());
      }

      PhysData$PbUserTrainingBackground.b(var2, var1);
      this.onBuilt();
      return var2;
   }

   public PhysData$PbUserTrainingBackground$Builder clear() {
      super.clear();
      this.value_ = 10;
      this.bitField0_ &= -2;
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public PhysData$PbUserTrainingBackground$Builder clearField(FieldDescriptor var1) {
      return (PhysData$PbUserTrainingBackground$Builder)super.clearField(var1);
   }

   public PhysData$PbUserTrainingBackground$Builder clearLastModified() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public PhysData$PbUserTrainingBackground$Builder clearOneof(OneofDescriptor var1) {
      return (PhysData$PbUserTrainingBackground$Builder)super.clearOneof(var1);
   }

   public PhysData$PbUserTrainingBackground$Builder clearValue() {
      this.bitField0_ &= -2;
      this.value_ = 10;
      this.onChanged();
      return this;
   }

   public PhysData$PbUserTrainingBackground$Builder clone() {
      return (PhysData$PbUserTrainingBackground$Builder)super.clone();
   }

   public PhysData$PbUserTrainingBackground getDefaultInstanceForType() {
      return PhysData$PbUserTrainingBackground.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PhysData.m();
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

   public PhysData$PbUserTrainingBackground$TrainingBackground getValue() {
      PhysData$PbUserTrainingBackground$TrainingBackground var1 = PhysData$PbUserTrainingBackground$TrainingBackground.valueOf(this.value_);
      PhysData$PbUserTrainingBackground$TrainingBackground var2 = var1;
      if (var1 == null) {
         var2 = PhysData$PbUserTrainingBackground$TrainingBackground.OCCASIONAL;
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
      return PhysData.n().ensureFieldAccessorsInitialized(PhysData$PbUserTrainingBackground.class, PhysData$PbUserTrainingBackground$Builder.class);
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

   public PhysData$PbUserTrainingBackground$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PhysData$PbUserTrainingBackground var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (PhysData$PbUserTrainingBackground)PhysData$PbUserTrainingBackground.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (PhysData$PbUserTrainingBackground)var11.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var14.unwrapIOException();
         } catch (Throwable var10) {
            if (var13 != null) {
               this.mergeFrom(var13);
            }

            throw var10;
         }
      }

      if (var13 != null) {
         this.mergeFrom(var13);
      }

      return this;
   }

   public PhysData$PbUserTrainingBackground$Builder mergeFrom(Message var1) {
      PhysData$PbUserTrainingBackground$Builder var2;
      if (var1 instanceof PhysData$PbUserTrainingBackground) {
         var2 = this.mergeFrom((PhysData$PbUserTrainingBackground)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PhysData$PbUserTrainingBackground$Builder mergeFrom(PhysData$PbUserTrainingBackground var1) {
      if (var1 != PhysData$PbUserTrainingBackground.getDefaultInstance()) {
         if (var1.hasValue()) {
            this.setValue(var1.getValue());
         }

         if (var1.hasLastModified()) {
            this.mergeLastModified(var1.getLastModified());
         }

         this.mergeUnknownFields(PhysData$PbUserTrainingBackground.a(var1));
         this.onChanged();
      }

      return this;
   }

   public PhysData$PbUserTrainingBackground$Builder mergeLastModified(Types$PbSystemDateTime var1) {
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

   public final PhysData$PbUserTrainingBackground$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PhysData$PbUserTrainingBackground$Builder)super.mergeUnknownFields(var1);
   }

   public PhysData$PbUserTrainingBackground$Builder setField(FieldDescriptor var1, Object var2) {
      return (PhysData$PbUserTrainingBackground$Builder)super.setField(var1, var2);
   }

   public PhysData$PbUserTrainingBackground$Builder setLastModified(Types$PbSystemDateTime$Builder var1) {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = var1.build();
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public PhysData$PbUserTrainingBackground$Builder setLastModified(Types$PbSystemDateTime var1) {
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

   public PhysData$PbUserTrainingBackground$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PhysData$PbUserTrainingBackground$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final PhysData$PbUserTrainingBackground$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PhysData$PbUserTrainingBackground$Builder)super.setUnknownFields(var1);
   }

   public PhysData$PbUserTrainingBackground$Builder setValue(PhysData$PbUserTrainingBackground$TrainingBackground var1) {
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
