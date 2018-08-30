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

public final class PhysData$PbUserHrAttribute$Builder extends Builder implements PhysData$PbUserHrAttributeOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 lastModifiedBuilder_;
   private Types$PbSystemDateTime lastModified_;
   private int settingSource_;
   private int value_;

   private PhysData$PbUserHrAttribute$Builder() {
      this.lastModified_ = null;
      this.settingSource_ = 0;
      this.maybeForceBuilderInitialization();
   }

   private PhysData$PbUserHrAttribute$Builder(BuilderParent var1) {
      super(var1);
      this.lastModified_ = null;
      this.settingSource_ = 0;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PhysData$PbUserHrAttribute$Builder(BuilderParent var1, PhysData$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PhysData$PbUserHrAttribute$Builder(PhysData$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PhysData.e();
   }

   private SingleFieldBuilderV3 getLastModifiedFieldBuilder() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModifiedBuilder_ = new SingleFieldBuilderV3(this.getLastModified(), this.getParentForChildren(), this.isClean());
         this.lastModified_ = null;
      }

      return this.lastModifiedBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (PhysData$PbUserHrAttribute.b()) {
         this.getLastModifiedFieldBuilder();
      }

   }

   public PhysData$PbUserHrAttribute$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PhysData$PbUserHrAttribute$Builder)super.addRepeatedField(var1, var2);
   }

   public PhysData$PbUserHrAttribute build() {
      PhysData$PbUserHrAttribute var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PhysData$PbUserHrAttribute buildPartial() {
      int var1 = 1;
      PhysData$PbUserHrAttribute var2 = new PhysData$PbUserHrAttribute(this, (PhysData$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      PhysData$PbUserHrAttribute.a(var2, this.value_);
      if ((var3 & 2) == 2) {
         var1 |= 2;
      }

      if (this.lastModifiedBuilder_ == null) {
         PhysData$PbUserHrAttribute.a(var2, this.lastModified_);
      } else {
         PhysData$PbUserHrAttribute.a(var2, (Types$PbSystemDateTime)this.lastModifiedBuilder_.build());
      }

      int var4 = var1;
      if ((var3 & 4) == 4) {
         var4 = var1 | 4;
      }

      PhysData$PbUserHrAttribute.b(var2, this.settingSource_);
      PhysData$PbUserHrAttribute.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public PhysData$PbUserHrAttribute$Builder clear() {
      super.clear();
      this.value_ = 0;
      this.bitField0_ &= -2;
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -3;
      this.settingSource_ = 0;
      this.bitField0_ &= -5;
      return this;
   }

   public PhysData$PbUserHrAttribute$Builder clearField(FieldDescriptor var1) {
      return (PhysData$PbUserHrAttribute$Builder)super.clearField(var1);
   }

   public PhysData$PbUserHrAttribute$Builder clearLastModified() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public PhysData$PbUserHrAttribute$Builder clearOneof(OneofDescriptor var1) {
      return (PhysData$PbUserHrAttribute$Builder)super.clearOneof(var1);
   }

   public PhysData$PbUserHrAttribute$Builder clearSettingSource() {
      this.bitField0_ &= -5;
      this.settingSource_ = 0;
      this.onChanged();
      return this;
   }

   public PhysData$PbUserHrAttribute$Builder clearValue() {
      this.bitField0_ &= -2;
      this.value_ = 0;
      this.onChanged();
      return this;
   }

   public PhysData$PbUserHrAttribute$Builder clone() {
      return (PhysData$PbUserHrAttribute$Builder)super.clone();
   }

   public PhysData$PbUserHrAttribute getDefaultInstanceForType() {
      return PhysData$PbUserHrAttribute.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PhysData.e();
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

   public PhysData$PbUserHrAttribute$HrSettingSource getSettingSource() {
      PhysData$PbUserHrAttribute$HrSettingSource var1 = PhysData$PbUserHrAttribute$HrSettingSource.valueOf(this.settingSource_);
      PhysData$PbUserHrAttribute$HrSettingSource var2 = var1;
      if (var1 == null) {
         var2 = PhysData$PbUserHrAttribute$HrSettingSource.SOURCE_DEFAULT;
      }

      return var2;
   }

   public int getValue() {
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

   public boolean hasSettingSource() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
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
      return PhysData.f().ensureFieldAccessorsInitialized(PhysData$PbUserHrAttribute.class, PhysData$PbUserHrAttribute$Builder.class);
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

   public PhysData$PbUserHrAttribute$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PhysData$PbUserHrAttribute var13;
      label96: {
         InvalidProtocolBufferException var12;
         PhysData$PbUserHrAttribute var14;
         try {
            var13 = (PhysData$PbUserHrAttribute)PhysData$PbUserHrAttribute.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (PhysData$PbUserHrAttribute)var10.getUnfinishedMessage();
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

   public PhysData$PbUserHrAttribute$Builder mergeFrom(Message var1) {
      PhysData$PbUserHrAttribute$Builder var2;
      if (var1 instanceof PhysData$PbUserHrAttribute) {
         var2 = this.mergeFrom((PhysData$PbUserHrAttribute)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PhysData$PbUserHrAttribute$Builder mergeFrom(PhysData$PbUserHrAttribute var1) {
      if (var1 != PhysData$PbUserHrAttribute.getDefaultInstance()) {
         if (var1.hasValue()) {
            this.setValue(var1.getValue());
         }

         if (var1.hasLastModified()) {
            this.mergeLastModified(var1.getLastModified());
         }

         if (var1.hasSettingSource()) {
            this.setSettingSource(var1.getSettingSource());
         }

         this.mergeUnknownFields(PhysData$PbUserHrAttribute.a(var1));
         this.onChanged();
      }

      return this;
   }

   public PhysData$PbUserHrAttribute$Builder mergeLastModified(Types$PbSystemDateTime var1) {
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

   public final PhysData$PbUserHrAttribute$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PhysData$PbUserHrAttribute$Builder)super.mergeUnknownFields(var1);
   }

   public PhysData$PbUserHrAttribute$Builder setField(FieldDescriptor var1, Object var2) {
      return (PhysData$PbUserHrAttribute$Builder)super.setField(var1, var2);
   }

   public PhysData$PbUserHrAttribute$Builder setLastModified(Types$PbSystemDateTime$Builder var1) {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = var1.build();
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public PhysData$PbUserHrAttribute$Builder setLastModified(Types$PbSystemDateTime var1) {
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

   public PhysData$PbUserHrAttribute$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PhysData$PbUserHrAttribute$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public PhysData$PbUserHrAttribute$Builder setSettingSource(PhysData$PbUserHrAttribute$HrSettingSource var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 4;
         this.settingSource_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public final PhysData$PbUserHrAttribute$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PhysData$PbUserHrAttribute$Builder)super.setUnknownFields(var1);
   }

   public PhysData$PbUserHrAttribute$Builder setValue(int var1) {
      this.bitField0_ |= 1;
      this.value_ = var1;
      this.onChanged();
      return this;
   }
}
