package fi.polar.remote.representation.protobuf;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class BleDevice$PbBleUser$Builder extends Builder implements BleDevice$PbBleUserOrBuilder {
   private int bitField0_;
   private int consent_;
   private int deviceUserIndex_;
   private int userIndex_;

   private BleDevice$PbBleUser$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private BleDevice$PbBleUser$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   BleDevice$PbBleUser$Builder(BuilderParent var1, BleDevice$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   BleDevice$PbBleUser$Builder(BleDevice$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return BleDevice.a();
   }

   private void maybeForceBuilderInitialization() {
      if (BleDevice$PbBleUser.b()) {
      }

   }

   public BleDevice$PbBleUser$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (BleDevice$PbBleUser$Builder)super.addRepeatedField(var1, var2);
   }

   public BleDevice$PbBleUser build() {
      BleDevice$PbBleUser var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public BleDevice$PbBleUser buildPartial() {
      byte var1 = 1;
      BleDevice$PbBleUser var2 = new BleDevice$PbBleUser(this, (BleDevice$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      BleDevice$PbBleUser.a(var2, this.userIndex_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      BleDevice$PbBleUser.b(var2, this.deviceUserIndex_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      BleDevice$PbBleUser.c(var2, this.consent_);
      BleDevice$PbBleUser.d(var2, var5);
      this.onBuilt();
      return var2;
   }

   public BleDevice$PbBleUser$Builder clear() {
      super.clear();
      this.userIndex_ = 0;
      this.bitField0_ &= -2;
      this.deviceUserIndex_ = 0;
      this.bitField0_ &= -3;
      this.consent_ = 0;
      this.bitField0_ &= -5;
      return this;
   }

   public BleDevice$PbBleUser$Builder clearConsent() {
      this.bitField0_ &= -5;
      this.consent_ = 0;
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleUser$Builder clearDeviceUserIndex() {
      this.bitField0_ &= -3;
      this.deviceUserIndex_ = 0;
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleUser$Builder clearField(FieldDescriptor var1) {
      return (BleDevice$PbBleUser$Builder)super.clearField(var1);
   }

   public BleDevice$PbBleUser$Builder clearOneof(OneofDescriptor var1) {
      return (BleDevice$PbBleUser$Builder)super.clearOneof(var1);
   }

   public BleDevice$PbBleUser$Builder clearUserIndex() {
      this.bitField0_ &= -2;
      this.userIndex_ = 0;
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleUser$Builder clone() {
      return (BleDevice$PbBleUser$Builder)super.clone();
   }

   public int getConsent() {
      return this.consent_;
   }

   public BleDevice$PbBleUser getDefaultInstanceForType() {
      return BleDevice$PbBleUser.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return BleDevice.a();
   }

   public int getDeviceUserIndex() {
      return this.deviceUserIndex_;
   }

   public int getUserIndex() {
      return this.userIndex_;
   }

   public boolean hasConsent() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDeviceUserIndex() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasUserIndex() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return BleDevice.b().ensureFieldAccessorsInitialized(BleDevice$PbBleUser.class, BleDevice$PbBleUser$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasUserIndex() && this.hasDeviceUserIndex()) {
         var1 = true;
      }

      return var1;
   }

   public BleDevice$PbBleUser$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      BleDevice$PbBleUser var13;
      label96: {
         InvalidProtocolBufferException var12;
         BleDevice$PbBleUser var14;
         try {
            var13 = (BleDevice$PbBleUser)BleDevice$PbBleUser.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (BleDevice$PbBleUser)var10.getUnfinishedMessage();
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

   public BleDevice$PbBleUser$Builder mergeFrom(Message var1) {
      BleDevice$PbBleUser$Builder var2;
      if (var1 instanceof BleDevice$PbBleUser) {
         var2 = this.mergeFrom((BleDevice$PbBleUser)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public BleDevice$PbBleUser$Builder mergeFrom(BleDevice$PbBleUser var1) {
      if (var1 != BleDevice$PbBleUser.getDefaultInstance()) {
         if (var1.hasUserIndex()) {
            this.setUserIndex(var1.getUserIndex());
         }

         if (var1.hasDeviceUserIndex()) {
            this.setDeviceUserIndex(var1.getDeviceUserIndex());
         }

         if (var1.hasConsent()) {
            this.setConsent(var1.getConsent());
         }

         this.mergeUnknownFields(BleDevice$PbBleUser.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final BleDevice$PbBleUser$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (BleDevice$PbBleUser$Builder)super.mergeUnknownFields(var1);
   }

   public BleDevice$PbBleUser$Builder setConsent(int var1) {
      this.bitField0_ |= 4;
      this.consent_ = var1;
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleUser$Builder setDeviceUserIndex(int var1) {
      this.bitField0_ |= 2;
      this.deviceUserIndex_ = var1;
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleUser$Builder setField(FieldDescriptor var1, Object var2) {
      return (BleDevice$PbBleUser$Builder)super.setField(var1, var2);
   }

   public BleDevice$PbBleUser$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (BleDevice$PbBleUser$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final BleDevice$PbBleUser$Builder setUnknownFields(UnknownFieldSet var1) {
      return (BleDevice$PbBleUser$Builder)super.setUnknownFields(var1);
   }

   public BleDevice$PbBleUser$Builder setUserIndex(int var1) {
      this.bitField0_ |= 1;
      this.userIndex_ = var1;
      this.onChanged();
      return this;
   }
}
