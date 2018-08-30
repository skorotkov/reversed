package fi.polar.remote.representation.protobuf;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Structures$PbBleService$Builder extends Builder implements Structures$PbBleServiceOrBuilder {
   private int bitField0_;
   private RepeatedFieldBuilderV3 characteristicsBuilder_;
   private List characteristics_;
   private SingleFieldBuilderV3 serviceUuidBuilder_;
   private Structures$PbBleUuid serviceUuid_;

   private Structures$PbBleService$Builder() {
      this.serviceUuid_ = null;
      this.characteristics_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbBleService$Builder(BuilderParent var1) {
      super(var1);
      this.serviceUuid_ = null;
      this.characteristics_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbBleService$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbBleService$Builder(Structures$1 var1) {
      this();
   }

   private void ensureCharacteristicsIsMutable() {
      if ((this.bitField0_ & 2) != 2) {
         this.characteristics_ = new ArrayList(this.characteristics_);
         this.bitField0_ |= 2;
      }

   }

   private RepeatedFieldBuilderV3 getCharacteristicsFieldBuilder() {
      if (this.characteristicsBuilder_ == null) {
         List var1 = this.characteristics_;
         boolean var2;
         if ((this.bitField0_ & 2) == 2) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.characteristicsBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.characteristics_ = null;
      }

      return this.characteristicsBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return Structures.ae();
   }

   private SingleFieldBuilderV3 getServiceUuidFieldBuilder() {
      if (this.serviceUuidBuilder_ == null) {
         this.serviceUuidBuilder_ = new SingleFieldBuilderV3(this.getServiceUuid(), this.getParentForChildren(), this.isClean());
         this.serviceUuid_ = null;
      }

      return this.serviceUuidBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbBleService.b()) {
         this.getServiceUuidFieldBuilder();
         this.getCharacteristicsFieldBuilder();
      }

   }

   public Structures$PbBleService$Builder addAllCharacteristics(Iterable var1) {
      if (this.characteristicsBuilder_ == null) {
         this.ensureCharacteristicsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.characteristics_);
         this.onChanged();
      } else {
         this.characteristicsBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public Structures$PbBleService$Builder addCharacteristics(int var1, Structures$PbBleCharacteristic$Builder var2) {
      if (this.characteristicsBuilder_ == null) {
         this.ensureCharacteristicsIsMutable();
         this.characteristics_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.characteristicsBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public Structures$PbBleService$Builder addCharacteristics(int var1, Structures$PbBleCharacteristic var2) {
      if (this.characteristicsBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureCharacteristicsIsMutable();
         this.characteristics_.add(var1, var2);
         this.onChanged();
      } else {
         this.characteristicsBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public Structures$PbBleService$Builder addCharacteristics(Structures$PbBleCharacteristic$Builder var1) {
      if (this.characteristicsBuilder_ == null) {
         this.ensureCharacteristicsIsMutable();
         this.characteristics_.add(var1.build());
         this.onChanged();
      } else {
         this.characteristicsBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public Structures$PbBleService$Builder addCharacteristics(Structures$PbBleCharacteristic var1) {
      if (this.characteristicsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureCharacteristicsIsMutable();
         this.characteristics_.add(var1);
         this.onChanged();
      } else {
         this.characteristicsBuilder_.addMessage(var1);
      }

      return this;
   }

   public Structures$PbBleCharacteristic$Builder addCharacteristicsBuilder() {
      return (Structures$PbBleCharacteristic$Builder)this.getCharacteristicsFieldBuilder().addBuilder(Structures$PbBleCharacteristic.getDefaultInstance());
   }

   public Structures$PbBleCharacteristic$Builder addCharacteristicsBuilder(int var1) {
      return (Structures$PbBleCharacteristic$Builder)this.getCharacteristicsFieldBuilder().addBuilder(var1, Structures$PbBleCharacteristic.getDefaultInstance());
   }

   public Structures$PbBleService$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbBleService$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbBleService build() {
      Structures$PbBleService var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbBleService buildPartial() {
      Structures$PbBleService var1 = new Structures$PbBleService(this, (Structures$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.serviceUuidBuilder_ == null) {
         Structures$PbBleService.a(var1, this.serviceUuid_);
      } else {
         Structures$PbBleService.a(var1, (Structures$PbBleUuid)this.serviceUuidBuilder_.build());
      }

      if (this.characteristicsBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2) {
            this.characteristics_ = Collections.unmodifiableList(this.characteristics_);
            this.bitField0_ &= -3;
         }

         Structures$PbBleService.a(var1, this.characteristics_);
      } else {
         Structures$PbBleService.a(var1, this.characteristicsBuilder_.build());
      }

      Structures$PbBleService.a(var1, var3);
      this.onBuilt();
      return var1;
   }

   public Structures$PbBleService$Builder clear() {
      super.clear();
      if (this.serviceUuidBuilder_ == null) {
         this.serviceUuid_ = null;
      } else {
         this.serviceUuidBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.characteristicsBuilder_ == null) {
         this.characteristics_ = Collections.emptyList();
         this.bitField0_ &= -3;
      } else {
         this.characteristicsBuilder_.clear();
      }

      return this;
   }

   public Structures$PbBleService$Builder clearCharacteristics() {
      if (this.characteristicsBuilder_ == null) {
         this.characteristics_ = Collections.emptyList();
         this.bitField0_ &= -3;
         this.onChanged();
      } else {
         this.characteristicsBuilder_.clear();
      }

      return this;
   }

   public Structures$PbBleService$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbBleService$Builder)super.clearField(var1);
   }

   public Structures$PbBleService$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbBleService$Builder)super.clearOneof(var1);
   }

   public Structures$PbBleService$Builder clearServiceUuid() {
      if (this.serviceUuidBuilder_ == null) {
         this.serviceUuid_ = null;
         this.onChanged();
      } else {
         this.serviceUuidBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public Structures$PbBleService$Builder clone() {
      return (Structures$PbBleService$Builder)super.clone();
   }

   public Structures$PbBleCharacteristic getCharacteristics(int var1) {
      Structures$PbBleCharacteristic var2;
      if (this.characteristicsBuilder_ == null) {
         var2 = (Structures$PbBleCharacteristic)this.characteristics_.get(var1);
      } else {
         var2 = (Structures$PbBleCharacteristic)this.characteristicsBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Structures$PbBleCharacteristic$Builder getCharacteristicsBuilder(int var1) {
      return (Structures$PbBleCharacteristic$Builder)this.getCharacteristicsFieldBuilder().getBuilder(var1);
   }

   public List getCharacteristicsBuilderList() {
      return this.getCharacteristicsFieldBuilder().getBuilderList();
   }

   public int getCharacteristicsCount() {
      int var1;
      if (this.characteristicsBuilder_ == null) {
         var1 = this.characteristics_.size();
      } else {
         var1 = this.characteristicsBuilder_.getCount();
      }

      return var1;
   }

   public List getCharacteristicsList() {
      List var1;
      if (this.characteristicsBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.characteristics_);
      } else {
         var1 = this.characteristicsBuilder_.getMessageList();
      }

      return var1;
   }

   public Structures$PbBleCharacteristicOrBuilder getCharacteristicsOrBuilder(int var1) {
      Structures$PbBleCharacteristicOrBuilder var2;
      if (this.characteristicsBuilder_ == null) {
         var2 = (Structures$PbBleCharacteristicOrBuilder)this.characteristics_.get(var1);
      } else {
         var2 = (Structures$PbBleCharacteristicOrBuilder)this.characteristicsBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getCharacteristicsOrBuilderList() {
      List var1;
      if (this.characteristicsBuilder_ != null) {
         var1 = this.characteristicsBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.characteristics_);
      }

      return var1;
   }

   public Structures$PbBleService getDefaultInstanceForType() {
      return Structures$PbBleService.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.ae();
   }

   public Structures$PbBleUuid getServiceUuid() {
      Structures$PbBleUuid var1;
      if (this.serviceUuidBuilder_ == null) {
         if (this.serviceUuid_ == null) {
            var1 = Structures$PbBleUuid.getDefaultInstance();
         } else {
            var1 = this.serviceUuid_;
         }
      } else {
         var1 = (Structures$PbBleUuid)this.serviceUuidBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbBleUuid$Builder getServiceUuidBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Structures$PbBleUuid$Builder)this.getServiceUuidFieldBuilder().getBuilder();
   }

   public Structures$PbBleUuidOrBuilder getServiceUuidOrBuilder() {
      Object var1;
      if (this.serviceUuidBuilder_ != null) {
         var1 = (Structures$PbBleUuidOrBuilder)this.serviceUuidBuilder_.getMessageOrBuilder();
      } else if (this.serviceUuid_ == null) {
         var1 = Structures$PbBleUuid.getDefaultInstance();
      } else {
         var1 = this.serviceUuid_;
      }

      return (Structures$PbBleUuidOrBuilder)var1;
   }

   public boolean hasServiceUuid() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.af().ensureFieldAccessorsInitialized(Structures$PbBleService.class, Structures$PbBleService$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasServiceUuid()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.getServiceUuid().isInitialized()) {
            int var3 = 0;

            while(true) {
               if (var3 >= this.getCharacteristicsCount()) {
                  var2 = true;
                  break;
               }

               var2 = var1;
               if (!this.getCharacteristics(var3).isInitialized()) {
                  break;
               }

               ++var3;
            }
         }
      }

      return var2;
   }

   public Structures$PbBleService$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbBleService var13;
      label96: {
         InvalidProtocolBufferException var12;
         Structures$PbBleService var14;
         try {
            var13 = (Structures$PbBleService)Structures$PbBleService.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Structures$PbBleService)var10.getUnfinishedMessage();
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

   public Structures$PbBleService$Builder mergeFrom(Message var1) {
      Structures$PbBleService$Builder var2;
      if (var1 instanceof Structures$PbBleService) {
         var2 = this.mergeFrom((Structures$PbBleService)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbBleService$Builder mergeFrom(Structures$PbBleService var1) {
      RepeatedFieldBuilderV3 var2 = null;
      if (var1 != Structures$PbBleService.getDefaultInstance()) {
         if (var1.hasServiceUuid()) {
            this.mergeServiceUuid(var1.getServiceUuid());
         }

         if (this.characteristicsBuilder_ == null) {
            if (!Structures$PbBleService.a(var1).isEmpty()) {
               if (this.characteristics_.isEmpty()) {
                  this.characteristics_ = Structures$PbBleService.a(var1);
                  this.bitField0_ &= -3;
               } else {
                  this.ensureCharacteristicsIsMutable();
                  this.characteristics_.addAll(Structures$PbBleService.a(var1));
               }

               this.onChanged();
            }
         } else if (!Structures$PbBleService.a(var1).isEmpty()) {
            if (this.characteristicsBuilder_.isEmpty()) {
               this.characteristicsBuilder_.dispose();
               this.characteristicsBuilder_ = null;
               this.characteristics_ = Structures$PbBleService.a(var1);
               this.bitField0_ &= -3;
               if (Structures$PbBleService.c()) {
                  var2 = this.getCharacteristicsFieldBuilder();
               }

               this.characteristicsBuilder_ = var2;
            } else {
               this.characteristicsBuilder_.addAllMessages(Structures$PbBleService.a(var1));
            }
         }

         this.mergeUnknownFields(Structures$PbBleService.b(var1));
         this.onChanged();
      }

      return this;
   }

   public Structures$PbBleService$Builder mergeServiceUuid(Structures$PbBleUuid var1) {
      if (this.serviceUuidBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.serviceUuid_ != null && this.serviceUuid_ != Structures$PbBleUuid.getDefaultInstance()) {
            this.serviceUuid_ = Structures$PbBleUuid.newBuilder(this.serviceUuid_).mergeFrom(var1).buildPartial();
         } else {
            this.serviceUuid_ = var1;
         }

         this.onChanged();
      } else {
         this.serviceUuidBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public final Structures$PbBleService$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbBleService$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbBleService$Builder removeCharacteristics(int var1) {
      if (this.characteristicsBuilder_ == null) {
         this.ensureCharacteristicsIsMutable();
         this.characteristics_.remove(var1);
         this.onChanged();
      } else {
         this.characteristicsBuilder_.remove(var1);
      }

      return this;
   }

   public Structures$PbBleService$Builder setCharacteristics(int var1, Structures$PbBleCharacteristic$Builder var2) {
      if (this.characteristicsBuilder_ == null) {
         this.ensureCharacteristicsIsMutable();
         this.characteristics_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.characteristicsBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public Structures$PbBleService$Builder setCharacteristics(int var1, Structures$PbBleCharacteristic var2) {
      if (this.characteristicsBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureCharacteristicsIsMutable();
         this.characteristics_.set(var1, var2);
         this.onChanged();
      } else {
         this.characteristicsBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public Structures$PbBleService$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbBleService$Builder)super.setField(var1, var2);
   }

   public Structures$PbBleService$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbBleService$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Structures$PbBleService$Builder setServiceUuid(Structures$PbBleUuid$Builder var1) {
      if (this.serviceUuidBuilder_ == null) {
         this.serviceUuid_ = var1.build();
         this.onChanged();
      } else {
         this.serviceUuidBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Structures$PbBleService$Builder setServiceUuid(Structures$PbBleUuid var1) {
      if (this.serviceUuidBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.serviceUuid_ = var1;
         this.onChanged();
      } else {
         this.serviceUuidBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public final Structures$PbBleService$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbBleService$Builder)super.setUnknownFields(var1);
   }
}
