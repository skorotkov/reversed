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

public final class ExerciseSensors$PbExerciseSensor$Builder extends Builder implements ExerciseSensors$PbExerciseSensorOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 deviceIdBuilder_;
   private Structures$PbDeviceId deviceId_;
   private SingleFieldBuilderV3 deviceNameBuilder_;
   private Structures$PbBleDeviceName deviceName_;
   private SingleFieldBuilderV3 macBuilder_;
   private Structures$PbBleMac mac_;

   private ExerciseSensors$PbExerciseSensor$Builder() {
      this.mac_ = null;
      this.deviceId_ = null;
      this.deviceName_ = null;
      this.maybeForceBuilderInitialization();
   }

   private ExerciseSensors$PbExerciseSensor$Builder(BuilderParent var1) {
      super(var1);
      this.mac_ = null;
      this.deviceId_ = null;
      this.deviceName_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseSensors$PbExerciseSensor$Builder(BuilderParent var1, ExerciseSensors$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseSensors$PbExerciseSensor$Builder(ExerciseSensors$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseSensors.a();
   }

   private SingleFieldBuilderV3 getDeviceIdFieldBuilder() {
      if (this.deviceIdBuilder_ == null) {
         this.deviceIdBuilder_ = new SingleFieldBuilderV3(this.getDeviceId(), this.getParentForChildren(), this.isClean());
         this.deviceId_ = null;
      }

      return this.deviceIdBuilder_;
   }

   private SingleFieldBuilderV3 getDeviceNameFieldBuilder() {
      if (this.deviceNameBuilder_ == null) {
         this.deviceNameBuilder_ = new SingleFieldBuilderV3(this.getDeviceName(), this.getParentForChildren(), this.isClean());
         this.deviceName_ = null;
      }

      return this.deviceNameBuilder_;
   }

   private SingleFieldBuilderV3 getMacFieldBuilder() {
      if (this.macBuilder_ == null) {
         this.macBuilder_ = new SingleFieldBuilderV3(this.getMac(), this.getParentForChildren(), this.isClean());
         this.mac_ = null;
      }

      return this.macBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseSensors$PbExerciseSensor.b()) {
         this.getMacFieldBuilder();
         this.getDeviceIdFieldBuilder();
         this.getDeviceNameFieldBuilder();
      }

   }

   public ExerciseSensors$PbExerciseSensor$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseSensors$PbExerciseSensor$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseSensors$PbExerciseSensor build() {
      ExerciseSensors$PbExerciseSensor var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseSensors$PbExerciseSensor buildPartial() {
      ExerciseSensors$PbExerciseSensor var1 = new ExerciseSensors$PbExerciseSensor(this, (ExerciseSensors$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.macBuilder_ == null) {
         ExerciseSensors$PbExerciseSensor.a(var1, this.mac_);
      } else {
         ExerciseSensors$PbExerciseSensor.a(var1, (Structures$PbBleMac)this.macBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.deviceIdBuilder_ == null) {
         ExerciseSensors$PbExerciseSensor.a(var1, this.deviceId_);
      } else {
         ExerciseSensors$PbExerciseSensor.a(var1, (Structures$PbDeviceId)this.deviceIdBuilder_.build());
      }

      int var5 = var4;
      if ((var2 & 4) == 4) {
         var5 = var4 | 4;
      }

      if (this.deviceNameBuilder_ == null) {
         ExerciseSensors$PbExerciseSensor.a(var1, this.deviceName_);
      } else {
         ExerciseSensors$PbExerciseSensor.a(var1, (Structures$PbBleDeviceName)this.deviceNameBuilder_.build());
      }

      ExerciseSensors$PbExerciseSensor.a(var1, var5);
      this.onBuilt();
      return var1;
   }

   public ExerciseSensors$PbExerciseSensor$Builder clear() {
      super.clear();
      if (this.macBuilder_ == null) {
         this.mac_ = null;
      } else {
         this.macBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.deviceIdBuilder_ == null) {
         this.deviceId_ = null;
      } else {
         this.deviceIdBuilder_.clear();
      }

      this.bitField0_ &= -3;
      if (this.deviceNameBuilder_ == null) {
         this.deviceName_ = null;
      } else {
         this.deviceNameBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public ExerciseSensors$PbExerciseSensor$Builder clearDeviceId() {
      if (this.deviceIdBuilder_ == null) {
         this.deviceId_ = null;
         this.onChanged();
      } else {
         this.deviceIdBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public ExerciseSensors$PbExerciseSensor$Builder clearDeviceName() {
      if (this.deviceNameBuilder_ == null) {
         this.deviceName_ = null;
         this.onChanged();
      } else {
         this.deviceNameBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public ExerciseSensors$PbExerciseSensor$Builder clearField(FieldDescriptor var1) {
      return (ExerciseSensors$PbExerciseSensor$Builder)super.clearField(var1);
   }

   public ExerciseSensors$PbExerciseSensor$Builder clearMac() {
      if (this.macBuilder_ == null) {
         this.mac_ = null;
         this.onChanged();
      } else {
         this.macBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public ExerciseSensors$PbExerciseSensor$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseSensors$PbExerciseSensor$Builder)super.clearOneof(var1);
   }

   public ExerciseSensors$PbExerciseSensor$Builder clone() {
      return (ExerciseSensors$PbExerciseSensor$Builder)super.clone();
   }

   public ExerciseSensors$PbExerciseSensor getDefaultInstanceForType() {
      return ExerciseSensors$PbExerciseSensor.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseSensors.a();
   }

   public Structures$PbDeviceId getDeviceId() {
      Structures$PbDeviceId var1;
      if (this.deviceIdBuilder_ == null) {
         if (this.deviceId_ == null) {
            var1 = Structures$PbDeviceId.getDefaultInstance();
         } else {
            var1 = this.deviceId_;
         }
      } else {
         var1 = (Structures$PbDeviceId)this.deviceIdBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbDeviceId$Builder getDeviceIdBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Structures$PbDeviceId$Builder)this.getDeviceIdFieldBuilder().getBuilder();
   }

   public Structures$PbDeviceIdOrBuilder getDeviceIdOrBuilder() {
      Object var1;
      if (this.deviceIdBuilder_ != null) {
         var1 = (Structures$PbDeviceIdOrBuilder)this.deviceIdBuilder_.getMessageOrBuilder();
      } else if (this.deviceId_ == null) {
         var1 = Structures$PbDeviceId.getDefaultInstance();
      } else {
         var1 = this.deviceId_;
      }

      return (Structures$PbDeviceIdOrBuilder)var1;
   }

   public Structures$PbBleDeviceName getDeviceName() {
      Structures$PbBleDeviceName var1;
      if (this.deviceNameBuilder_ == null) {
         if (this.deviceName_ == null) {
            var1 = Structures$PbBleDeviceName.getDefaultInstance();
         } else {
            var1 = this.deviceName_;
         }
      } else {
         var1 = (Structures$PbBleDeviceName)this.deviceNameBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbBleDeviceName$Builder getDeviceNameBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (Structures$PbBleDeviceName$Builder)this.getDeviceNameFieldBuilder().getBuilder();
   }

   public Structures$PbBleDeviceNameOrBuilder getDeviceNameOrBuilder() {
      Object var1;
      if (this.deviceNameBuilder_ != null) {
         var1 = (Structures$PbBleDeviceNameOrBuilder)this.deviceNameBuilder_.getMessageOrBuilder();
      } else if (this.deviceName_ == null) {
         var1 = Structures$PbBleDeviceName.getDefaultInstance();
      } else {
         var1 = this.deviceName_;
      }

      return (Structures$PbBleDeviceNameOrBuilder)var1;
   }

   public Structures$PbBleMac getMac() {
      Structures$PbBleMac var1;
      if (this.macBuilder_ == null) {
         if (this.mac_ == null) {
            var1 = Structures$PbBleMac.getDefaultInstance();
         } else {
            var1 = this.mac_;
         }
      } else {
         var1 = (Structures$PbBleMac)this.macBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbBleMac$Builder getMacBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Structures$PbBleMac$Builder)this.getMacFieldBuilder().getBuilder();
   }

   public Structures$PbBleMacOrBuilder getMacOrBuilder() {
      Object var1;
      if (this.macBuilder_ != null) {
         var1 = (Structures$PbBleMacOrBuilder)this.macBuilder_.getMessageOrBuilder();
      } else if (this.mac_ == null) {
         var1 = Structures$PbBleMac.getDefaultInstance();
      } else {
         var1 = this.mac_;
      }

      return (Structures$PbBleMacOrBuilder)var1;
   }

   public boolean hasDeviceId() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDeviceName() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMac() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseSensors.b().ensureFieldAccessorsInitialized(ExerciseSensors$PbExerciseSensor.class, ExerciseSensors$PbExerciseSensor$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasMac()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.getMac().isInitialized()) {
            if (this.hasDeviceId()) {
               var2 = var1;
               if (!this.getDeviceId().isInitialized()) {
                  return var2;
               }
            }

            if (this.hasDeviceName()) {
               var2 = var1;
               if (!this.getDeviceName().isInitialized()) {
                  return var2;
               }
            }

            var2 = true;
         }
      }

      return var2;
   }

   public ExerciseSensors$PbExerciseSensor$Builder mergeDeviceId(Structures$PbDeviceId var1) {
      if (this.deviceIdBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.deviceId_ != null && this.deviceId_ != Structures$PbDeviceId.getDefaultInstance()) {
            this.deviceId_ = Structures$PbDeviceId.newBuilder(this.deviceId_).mergeFrom(var1).buildPartial();
         } else {
            this.deviceId_ = var1;
         }

         this.onChanged();
      } else {
         this.deviceIdBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExerciseSensors$PbExerciseSensor$Builder mergeDeviceName(Structures$PbBleDeviceName var1) {
      if (this.deviceNameBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.deviceName_ != null && this.deviceName_ != Structures$PbBleDeviceName.getDefaultInstance()) {
            this.deviceName_ = Structures$PbBleDeviceName.newBuilder(this.deviceName_).mergeFrom(var1).buildPartial();
         } else {
            this.deviceName_ = var1;
         }

         this.onChanged();
      } else {
         this.deviceNameBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public ExerciseSensors$PbExerciseSensor$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseSensors$PbExerciseSensor var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (ExerciseSensors$PbExerciseSensor)ExerciseSensors$PbExerciseSensor.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (ExerciseSensors$PbExerciseSensor)var10.getUnfinishedMessage();
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

   public ExerciseSensors$PbExerciseSensor$Builder mergeFrom(Message var1) {
      ExerciseSensors$PbExerciseSensor$Builder var2;
      if (var1 instanceof ExerciseSensors$PbExerciseSensor) {
         var2 = this.mergeFrom((ExerciseSensors$PbExerciseSensor)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseSensors$PbExerciseSensor$Builder mergeFrom(ExerciseSensors$PbExerciseSensor var1) {
      if (var1 != ExerciseSensors$PbExerciseSensor.getDefaultInstance()) {
         if (var1.hasMac()) {
            this.mergeMac(var1.getMac());
         }

         if (var1.hasDeviceId()) {
            this.mergeDeviceId(var1.getDeviceId());
         }

         if (var1.hasDeviceName()) {
            this.mergeDeviceName(var1.getDeviceName());
         }

         this.mergeUnknownFields(ExerciseSensors$PbExerciseSensor.a(var1));
         this.onChanged();
      }

      return this;
   }

   public ExerciseSensors$PbExerciseSensor$Builder mergeMac(Structures$PbBleMac var1) {
      if (this.macBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.mac_ != null && this.mac_ != Structures$PbBleMac.getDefaultInstance()) {
            this.mac_ = Structures$PbBleMac.newBuilder(this.mac_).mergeFrom(var1).buildPartial();
         } else {
            this.mac_ = var1;
         }

         this.onChanged();
      } else {
         this.macBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public final ExerciseSensors$PbExerciseSensor$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseSensors$PbExerciseSensor$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseSensors$PbExerciseSensor$Builder setDeviceId(Structures$PbDeviceId$Builder var1) {
      if (this.deviceIdBuilder_ == null) {
         this.deviceId_ = var1.build();
         this.onChanged();
      } else {
         this.deviceIdBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExerciseSensors$PbExerciseSensor$Builder setDeviceId(Structures$PbDeviceId var1) {
      if (this.deviceIdBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.deviceId_ = var1;
         this.onChanged();
      } else {
         this.deviceIdBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExerciseSensors$PbExerciseSensor$Builder setDeviceName(Structures$PbBleDeviceName$Builder var1) {
      if (this.deviceNameBuilder_ == null) {
         this.deviceName_ = var1.build();
         this.onChanged();
      } else {
         this.deviceNameBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public ExerciseSensors$PbExerciseSensor$Builder setDeviceName(Structures$PbBleDeviceName var1) {
      if (this.deviceNameBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.deviceName_ = var1;
         this.onChanged();
      } else {
         this.deviceNameBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public ExerciseSensors$PbExerciseSensor$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseSensors$PbExerciseSensor$Builder)super.setField(var1, var2);
   }

   public ExerciseSensors$PbExerciseSensor$Builder setMac(Structures$PbBleMac$Builder var1) {
      if (this.macBuilder_ == null) {
         this.mac_ = var1.build();
         this.onChanged();
      } else {
         this.macBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ExerciseSensors$PbExerciseSensor$Builder setMac(Structures$PbBleMac var1) {
      if (this.macBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.mac_ = var1;
         this.onChanged();
      } else {
         this.macBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ExerciseSensors$PbExerciseSensor$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseSensors$PbExerciseSensor$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExerciseSensors$PbExerciseSensor$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseSensors$PbExerciseSensor$Builder)super.setUnknownFields(var1);
   }
}
