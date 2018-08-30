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

public final class PhysData$PbUserBirthday$Builder extends Builder implements PhysData$PbUserBirthdayOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 lastModifiedBuilder_;
   private Types$PbSystemDateTime lastModified_;
   private SingleFieldBuilderV3 valueBuilder_;
   private Types$PbDate value_;

   private PhysData$PbUserBirthday$Builder() {
      this.value_ = null;
      this.lastModified_ = null;
      this.maybeForceBuilderInitialization();
   }

   private PhysData$PbUserBirthday$Builder(BuilderParent var1) {
      super(var1);
      this.value_ = null;
      this.lastModified_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PhysData$PbUserBirthday$Builder(BuilderParent var1, PhysData$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PhysData$PbUserBirthday$Builder(PhysData$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PhysData.a();
   }

   private SingleFieldBuilderV3 getLastModifiedFieldBuilder() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModifiedBuilder_ = new SingleFieldBuilderV3(this.getLastModified(), this.getParentForChildren(), this.isClean());
         this.lastModified_ = null;
      }

      return this.lastModifiedBuilder_;
   }

   private SingleFieldBuilderV3 getValueFieldBuilder() {
      if (this.valueBuilder_ == null) {
         this.valueBuilder_ = new SingleFieldBuilderV3(this.getValue(), this.getParentForChildren(), this.isClean());
         this.value_ = null;
      }

      return this.valueBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (PhysData$PbUserBirthday.b()) {
         this.getValueFieldBuilder();
         this.getLastModifiedFieldBuilder();
      }

   }

   public PhysData$PbUserBirthday$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PhysData$PbUserBirthday$Builder)super.addRepeatedField(var1, var2);
   }

   public PhysData$PbUserBirthday build() {
      PhysData$PbUserBirthday var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PhysData$PbUserBirthday buildPartial() {
      PhysData$PbUserBirthday var1 = new PhysData$PbUserBirthday(this, (PhysData$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.valueBuilder_ == null) {
         PhysData$PbUserBirthday.a(var1, this.value_);
      } else {
         PhysData$PbUserBirthday.a(var1, (Types$PbDate)this.valueBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.lastModifiedBuilder_ == null) {
         PhysData$PbUserBirthday.a(var1, this.lastModified_);
      } else {
         PhysData$PbUserBirthday.a(var1, (Types$PbSystemDateTime)this.lastModifiedBuilder_.build());
      }

      PhysData$PbUserBirthday.a(var1, var4);
      this.onBuilt();
      return var1;
   }

   public PhysData$PbUserBirthday$Builder clear() {
      super.clear();
      if (this.valueBuilder_ == null) {
         this.value_ = null;
      } else {
         this.valueBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public PhysData$PbUserBirthday$Builder clearField(FieldDescriptor var1) {
      return (PhysData$PbUserBirthday$Builder)super.clearField(var1);
   }

   public PhysData$PbUserBirthday$Builder clearLastModified() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public PhysData$PbUserBirthday$Builder clearOneof(OneofDescriptor var1) {
      return (PhysData$PbUserBirthday$Builder)super.clearOneof(var1);
   }

   public PhysData$PbUserBirthday$Builder clearValue() {
      if (this.valueBuilder_ == null) {
         this.value_ = null;
         this.onChanged();
      } else {
         this.valueBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public PhysData$PbUserBirthday$Builder clone() {
      return (PhysData$PbUserBirthday$Builder)super.clone();
   }

   public PhysData$PbUserBirthday getDefaultInstanceForType() {
      return PhysData$PbUserBirthday.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PhysData.a();
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

   public Types$PbDate getValue() {
      Types$PbDate var1;
      if (this.valueBuilder_ == null) {
         if (this.value_ == null) {
            var1 = Types$PbDate.getDefaultInstance();
         } else {
            var1 = this.value_;
         }
      } else {
         var1 = (Types$PbDate)this.valueBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDate$Builder getValueBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Types$PbDate$Builder)this.getValueFieldBuilder().getBuilder();
   }

   public Types$PbDateOrBuilder getValueOrBuilder() {
      Object var1;
      if (this.valueBuilder_ != null) {
         var1 = (Types$PbDateOrBuilder)this.valueBuilder_.getMessageOrBuilder();
      } else if (this.value_ == null) {
         var1 = Types$PbDate.getDefaultInstance();
      } else {
         var1 = this.value_;
      }

      return (Types$PbDateOrBuilder)var1;
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
      return PhysData.b().ensureFieldAccessorsInitialized(PhysData$PbUserBirthday.class, PhysData$PbUserBirthday$Builder.class);
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
            if (this.getValue().isInitialized()) {
               var2 = var1;
               if (this.getLastModified().isInitialized()) {
                  var2 = true;
               }
            }
         }
      }

      return var2;
   }

   public PhysData$PbUserBirthday$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PhysData$PbUserBirthday var13;
      label96: {
         InvalidProtocolBufferException var12;
         PhysData$PbUserBirthday var14;
         try {
            var13 = (PhysData$PbUserBirthday)PhysData$PbUserBirthday.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (PhysData$PbUserBirthday)var10.getUnfinishedMessage();
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

   public PhysData$PbUserBirthday$Builder mergeFrom(Message var1) {
      PhysData$PbUserBirthday$Builder var2;
      if (var1 instanceof PhysData$PbUserBirthday) {
         var2 = this.mergeFrom((PhysData$PbUserBirthday)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PhysData$PbUserBirthday$Builder mergeFrom(PhysData$PbUserBirthday var1) {
      if (var1 != PhysData$PbUserBirthday.getDefaultInstance()) {
         if (var1.hasValue()) {
            this.mergeValue(var1.getValue());
         }

         if (var1.hasLastModified()) {
            this.mergeLastModified(var1.getLastModified());
         }

         this.mergeUnknownFields(PhysData$PbUserBirthday.a(var1));
         this.onChanged();
      }

      return this;
   }

   public PhysData$PbUserBirthday$Builder mergeLastModified(Types$PbSystemDateTime var1) {
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

   public final PhysData$PbUserBirthday$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PhysData$PbUserBirthday$Builder)super.mergeUnknownFields(var1);
   }

   public PhysData$PbUserBirthday$Builder mergeValue(Types$PbDate var1) {
      if (this.valueBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.value_ != null && this.value_ != Types$PbDate.getDefaultInstance()) {
            this.value_ = Types$PbDate.newBuilder(this.value_).mergeFrom(var1).buildPartial();
         } else {
            this.value_ = var1;
         }

         this.onChanged();
      } else {
         this.valueBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public PhysData$PbUserBirthday$Builder setField(FieldDescriptor var1, Object var2) {
      return (PhysData$PbUserBirthday$Builder)super.setField(var1, var2);
   }

   public PhysData$PbUserBirthday$Builder setLastModified(Types$PbSystemDateTime$Builder var1) {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = var1.build();
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public PhysData$PbUserBirthday$Builder setLastModified(Types$PbSystemDateTime var1) {
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

   public PhysData$PbUserBirthday$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PhysData$PbUserBirthday$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final PhysData$PbUserBirthday$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PhysData$PbUserBirthday$Builder)super.setUnknownFields(var1);
   }

   public PhysData$PbUserBirthday$Builder setValue(Types$PbDate$Builder var1) {
      if (this.valueBuilder_ == null) {
         this.value_ = var1.build();
         this.onChanged();
      } else {
         this.valueBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public PhysData$PbUserBirthday$Builder setValue(Types$PbDate var1) {
      if (this.valueBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.value_ = var1;
         this.onChanged();
      } else {
         this.valueBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }
}
