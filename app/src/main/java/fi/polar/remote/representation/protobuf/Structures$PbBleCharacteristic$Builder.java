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

public final class Structures$PbBleCharacteristic$Builder extends Builder implements Structures$PbBleCharacteristicOrBuilder {
   private int bitField0_;
   private int handle_;
   private SingleFieldBuilderV3 typeBuilder_;
   private Structures$PbBleUuid type_;

   private Structures$PbBleCharacteristic$Builder() {
      this.type_ = null;
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbBleCharacteristic$Builder(BuilderParent var1) {
      super(var1);
      this.type_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbBleCharacteristic$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbBleCharacteristic$Builder(Structures$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Structures.ac();
   }

   private SingleFieldBuilderV3 getTypeFieldBuilder() {
      if (this.typeBuilder_ == null) {
         this.typeBuilder_ = new SingleFieldBuilderV3(this.getType(), this.getParentForChildren(), this.isClean());
         this.type_ = null;
      }

      return this.typeBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbBleCharacteristic.b()) {
         this.getTypeFieldBuilder();
      }

   }

   public Structures$PbBleCharacteristic$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbBleCharacteristic$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbBleCharacteristic build() {
      Structures$PbBleCharacteristic var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbBleCharacteristic buildPartial() {
      int var1 = 1;
      Structures$PbBleCharacteristic var2 = new Structures$PbBleCharacteristic(this, (Structures$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Structures$PbBleCharacteristic.a(var2, this.handle_);
      if ((var3 & 2) == 2) {
         var1 |= 2;
      }

      if (this.typeBuilder_ == null) {
         Structures$PbBleCharacteristic.a(var2, this.type_);
      } else {
         Structures$PbBleCharacteristic.a(var2, (Structures$PbBleUuid)this.typeBuilder_.build());
      }

      Structures$PbBleCharacteristic.b(var2, var1);
      this.onBuilt();
      return var2;
   }

   public Structures$PbBleCharacteristic$Builder clear() {
      super.clear();
      this.handle_ = 0;
      this.bitField0_ &= -2;
      if (this.typeBuilder_ == null) {
         this.type_ = null;
      } else {
         this.typeBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public Structures$PbBleCharacteristic$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbBleCharacteristic$Builder)super.clearField(var1);
   }

   public Structures$PbBleCharacteristic$Builder clearHandle() {
      this.bitField0_ &= -2;
      this.handle_ = 0;
      this.onChanged();
      return this;
   }

   public Structures$PbBleCharacteristic$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbBleCharacteristic$Builder)super.clearOneof(var1);
   }

   public Structures$PbBleCharacteristic$Builder clearType() {
      if (this.typeBuilder_ == null) {
         this.type_ = null;
         this.onChanged();
      } else {
         this.typeBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public Structures$PbBleCharacteristic$Builder clone() {
      return (Structures$PbBleCharacteristic$Builder)super.clone();
   }

   public Structures$PbBleCharacteristic getDefaultInstanceForType() {
      return Structures$PbBleCharacteristic.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.ac();
   }

   public int getHandle() {
      return this.handle_;
   }

   public Structures$PbBleUuid getType() {
      Structures$PbBleUuid var1;
      if (this.typeBuilder_ == null) {
         if (this.type_ == null) {
            var1 = Structures$PbBleUuid.getDefaultInstance();
         } else {
            var1 = this.type_;
         }
      } else {
         var1 = (Structures$PbBleUuid)this.typeBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbBleUuid$Builder getTypeBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Structures$PbBleUuid$Builder)this.getTypeFieldBuilder().getBuilder();
   }

   public Structures$PbBleUuidOrBuilder getTypeOrBuilder() {
      Object var1;
      if (this.typeBuilder_ != null) {
         var1 = (Structures$PbBleUuidOrBuilder)this.typeBuilder_.getMessageOrBuilder();
      } else if (this.type_ == null) {
         var1 = Structures$PbBleUuid.getDefaultInstance();
      } else {
         var1 = this.type_;
      }

      return (Structures$PbBleUuidOrBuilder)var1;
   }

   public boolean hasHandle() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasType() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.ad().ensureFieldAccessorsInitialized(Structures$PbBleCharacteristic.class, Structures$PbBleCharacteristic$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasHandle()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasType()) {
            var2 = var1;
            if (this.getType().isInitialized()) {
               var2 = true;
            }
         }
      }

      return var2;
   }

   public Structures$PbBleCharacteristic$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbBleCharacteristic var13;
      label96: {
         InvalidProtocolBufferException var12;
         Structures$PbBleCharacteristic var14;
         try {
            var13 = (Structures$PbBleCharacteristic)Structures$PbBleCharacteristic.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Structures$PbBleCharacteristic)var10.getUnfinishedMessage();
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

   public Structures$PbBleCharacteristic$Builder mergeFrom(Message var1) {
      Structures$PbBleCharacteristic$Builder var2;
      if (var1 instanceof Structures$PbBleCharacteristic) {
         var2 = this.mergeFrom((Structures$PbBleCharacteristic)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbBleCharacteristic$Builder mergeFrom(Structures$PbBleCharacteristic var1) {
      if (var1 != Structures$PbBleCharacteristic.getDefaultInstance()) {
         if (var1.hasHandle()) {
            this.setHandle(var1.getHandle());
         }

         if (var1.hasType()) {
            this.mergeType(var1.getType());
         }

         this.mergeUnknownFields(Structures$PbBleCharacteristic.a(var1));
         this.onChanged();
      }

      return this;
   }

   public Structures$PbBleCharacteristic$Builder mergeType(Structures$PbBleUuid var1) {
      if (this.typeBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.type_ != null && this.type_ != Structures$PbBleUuid.getDefaultInstance()) {
            this.type_ = Structures$PbBleUuid.newBuilder(this.type_).mergeFrom(var1).buildPartial();
         } else {
            this.type_ = var1;
         }

         this.onChanged();
      } else {
         this.typeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final Structures$PbBleCharacteristic$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbBleCharacteristic$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbBleCharacteristic$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbBleCharacteristic$Builder)super.setField(var1, var2);
   }

   public Structures$PbBleCharacteristic$Builder setHandle(int var1) {
      this.bitField0_ |= 1;
      this.handle_ = var1;
      this.onChanged();
      return this;
   }

   public Structures$PbBleCharacteristic$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbBleCharacteristic$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Structures$PbBleCharacteristic$Builder setType(Structures$PbBleUuid$Builder var1) {
      if (this.typeBuilder_ == null) {
         this.type_ = var1.build();
         this.onChanged();
      } else {
         this.typeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Structures$PbBleCharacteristic$Builder setType(Structures$PbBleUuid var1) {
      if (this.typeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.type_ = var1;
         this.onChanged();
      } else {
         this.typeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final Structures$PbBleCharacteristic$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbBleCharacteristic$Builder)super.setUnknownFields(var1);
   }
}
