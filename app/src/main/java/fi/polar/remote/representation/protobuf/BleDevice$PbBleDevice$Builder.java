package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
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
import com.google.protobuf.Internal.ListAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class BleDevice$PbBleDevice$Builder extends Builder implements BleDevice$PbBleDeviceOrBuilder {
   private boolean authenticated_;
   private List availableFeatures_;
   private int batteryLevel_;
   private int bitField0_;
   private int bitField1_;
   private SingleFieldBuilderV3 deletedTimeStampBuilder_;
   private Types$PbSystemDateTime deletedTimeStamp_;
   private int deviceAppearance_;
   private Object deviceId_;
   private SingleFieldBuilderV3 deviceVersionBuilder_;
   private Structures$PbVersion deviceVersion_;
   private int distributedKeys_;
   private int encrKeySize_;
   private Object hardwareCode_;
   private SingleFieldBuilderV3 lastModifiedBuilder_;
   private Types$PbSystemDateTime lastModified_;
   private int localEdiv_;
   private ByteString localLtk_;
   private ByteString localRand_;
   private SingleFieldBuilderV3 macBuilder_;
   private Structures$PbBleMac mac_;
   private Object manufacturerName_;
   private int manufacturer_;
   private Object modelName_;
   private Object name_;
   private Object oBSOLETEDeviceVersion_;
   private SingleFieldBuilderV3 pairedBuilder_;
   private Types$PbSystemDateTime paired_;
   private boolean partOfDistributedPowerSystem_;
   private ByteString peerCsrk_;
   private int peerEdiv_;
   private ByteString peerIrk_;
   private ByteString peerLtk_;
   private ByteString peerRand_;
   private Object secondarySoftwareVersion_;
   private int sensorLocation_;
   private Object serialNumber_;
   private RepeatedFieldBuilderV3 servicesBuilder_;
   private List services_;
   private RepeatedFieldBuilderV3 subComponentInfoBuilder_;
   private List subComponentInfo_;
   private RepeatedFieldBuilderV3 userDataBuilder_;
   private List userData_;

   private BleDevice$PbBleDevice$Builder() {
      this.paired_ = null;
      this.lastModified_ = null;
      this.manufacturer_ = 1;
      this.deletedTimeStamp_ = null;
      this.mac_ = null;
      this.deviceId_ = "";
      this.name_ = "";
      this.manufacturerName_ = "";
      this.modelName_ = "";
      this.peerLtk_ = ByteString.EMPTY;
      this.peerIrk_ = ByteString.EMPTY;
      this.peerCsrk_ = ByteString.EMPTY;
      this.availableFeatures_ = Collections.emptyList();
      this.services_ = Collections.emptyList();
      this.peerRand_ = ByteString.EMPTY;
      this.sensorLocation_ = 0;
      this.oBSOLETEDeviceVersion_ = "";
      this.secondarySoftwareVersion_ = "";
      this.serialNumber_ = "";
      this.localLtk_ = ByteString.EMPTY;
      this.localRand_ = ByteString.EMPTY;
      this.userData_ = Collections.emptyList();
      this.deviceAppearance_ = 0;
      this.hardwareCode_ = "";
      this.subComponentInfo_ = Collections.emptyList();
      this.deviceVersion_ = null;
      this.maybeForceBuilderInitialization();
   }

   private BleDevice$PbBleDevice$Builder(BuilderParent var1) {
      super(var1);
      this.paired_ = null;
      this.lastModified_ = null;
      this.manufacturer_ = 1;
      this.deletedTimeStamp_ = null;
      this.mac_ = null;
      this.deviceId_ = "";
      this.name_ = "";
      this.manufacturerName_ = "";
      this.modelName_ = "";
      this.peerLtk_ = ByteString.EMPTY;
      this.peerIrk_ = ByteString.EMPTY;
      this.peerCsrk_ = ByteString.EMPTY;
      this.availableFeatures_ = Collections.emptyList();
      this.services_ = Collections.emptyList();
      this.peerRand_ = ByteString.EMPTY;
      this.sensorLocation_ = 0;
      this.oBSOLETEDeviceVersion_ = "";
      this.secondarySoftwareVersion_ = "";
      this.serialNumber_ = "";
      this.localLtk_ = ByteString.EMPTY;
      this.localRand_ = ByteString.EMPTY;
      this.userData_ = Collections.emptyList();
      this.deviceAppearance_ = 0;
      this.hardwareCode_ = "";
      this.subComponentInfo_ = Collections.emptyList();
      this.deviceVersion_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   BleDevice$PbBleDevice$Builder(BuilderParent var1, BleDevice$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   BleDevice$PbBleDevice$Builder(BleDevice$1 var1) {
      this();
   }

   private void ensureAvailableFeaturesIsMutable() {
      if ((this.bitField0_ & 8192) != 8192) {
         this.availableFeatures_ = new ArrayList(this.availableFeatures_);
         this.bitField0_ |= 8192;
      }

   }

   private void ensureServicesIsMutable() {
      if ((this.bitField0_ & 16384) != 16384) {
         this.services_ = new ArrayList(this.services_);
         this.bitField0_ |= 16384;
      }

   }

   private void ensureSubComponentInfoIsMutable() {
      if ((this.bitField0_ & Integer.MIN_VALUE) != Integer.MIN_VALUE) {
         this.subComponentInfo_ = new ArrayList(this.subComponentInfo_);
         this.bitField0_ |= Integer.MIN_VALUE;
      }

   }

   private void ensureUserDataIsMutable() {
      if ((this.bitField0_ & 134217728) != 134217728) {
         this.userData_ = new ArrayList(this.userData_);
         this.bitField0_ |= 134217728;
      }

   }

   private SingleFieldBuilderV3 getDeletedTimeStampFieldBuilder() {
      if (this.deletedTimeStampBuilder_ == null) {
         this.deletedTimeStampBuilder_ = new SingleFieldBuilderV3(this.getDeletedTimeStamp(), this.getParentForChildren(), this.isClean());
         this.deletedTimeStamp_ = null;
      }

      return this.deletedTimeStampBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return BleDevice.c();
   }

   private SingleFieldBuilderV3 getDeviceVersionFieldBuilder() {
      if (this.deviceVersionBuilder_ == null) {
         this.deviceVersionBuilder_ = new SingleFieldBuilderV3(this.getDeviceVersion(), this.getParentForChildren(), this.isClean());
         this.deviceVersion_ = null;
      }

      return this.deviceVersionBuilder_;
   }

   private SingleFieldBuilderV3 getLastModifiedFieldBuilder() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModifiedBuilder_ = new SingleFieldBuilderV3(this.getLastModified(), this.getParentForChildren(), this.isClean());
         this.lastModified_ = null;
      }

      return this.lastModifiedBuilder_;
   }

   private SingleFieldBuilderV3 getMacFieldBuilder() {
      if (this.macBuilder_ == null) {
         this.macBuilder_ = new SingleFieldBuilderV3(this.getMac(), this.getParentForChildren(), this.isClean());
         this.mac_ = null;
      }

      return this.macBuilder_;
   }

   private SingleFieldBuilderV3 getPairedFieldBuilder() {
      if (this.pairedBuilder_ == null) {
         this.pairedBuilder_ = new SingleFieldBuilderV3(this.getPaired(), this.getParentForChildren(), this.isClean());
         this.paired_ = null;
      }

      return this.pairedBuilder_;
   }

   private RepeatedFieldBuilderV3 getServicesFieldBuilder() {
      if (this.servicesBuilder_ == null) {
         List var1 = this.services_;
         boolean var2;
         if ((this.bitField0_ & 16384) == 16384) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.servicesBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.services_ = null;
      }

      return this.servicesBuilder_;
   }

   private RepeatedFieldBuilderV3 getSubComponentInfoFieldBuilder() {
      if (this.subComponentInfoBuilder_ == null) {
         List var1 = this.subComponentInfo_;
         boolean var2;
         if ((this.bitField0_ & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.subComponentInfoBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.subComponentInfo_ = null;
      }

      return this.subComponentInfoBuilder_;
   }

   private RepeatedFieldBuilderV3 getUserDataFieldBuilder() {
      if (this.userDataBuilder_ == null) {
         List var1 = this.userData_;
         boolean var2;
         if ((this.bitField0_ & 134217728) == 134217728) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.userDataBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.userData_ = null;
      }

      return this.userDataBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (BleDevice$PbBleDevice.b()) {
         this.getPairedFieldBuilder();
         this.getLastModifiedFieldBuilder();
         this.getDeletedTimeStampFieldBuilder();
         this.getMacFieldBuilder();
         this.getServicesFieldBuilder();
         this.getUserDataFieldBuilder();
         this.getSubComponentInfoFieldBuilder();
         this.getDeviceVersionFieldBuilder();
      }

   }

   public BleDevice$PbBleDevice$Builder addAllAvailableFeatures(Iterable var1) {
      this.ensureAvailableFeaturesIsMutable();
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         Types$PbFeatureType var3 = (Types$PbFeatureType)var2.next();
         this.availableFeatures_.add(var3.getNumber());
      }

      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder addAllServices(Iterable var1) {
      if (this.servicesBuilder_ == null) {
         this.ensureServicesIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.services_);
         this.onChanged();
      } else {
         this.servicesBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public BleDevice$PbBleDevice$Builder addAllSubComponentInfo(Iterable var1) {
      if (this.subComponentInfoBuilder_ == null) {
         this.ensureSubComponentInfoIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.subComponentInfo_);
         this.onChanged();
      } else {
         this.subComponentInfoBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public BleDevice$PbBleDevice$Builder addAllUserData(Iterable var1) {
      if (this.userDataBuilder_ == null) {
         this.ensureUserDataIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.userData_);
         this.onChanged();
      } else {
         this.userDataBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public BleDevice$PbBleDevice$Builder addAvailableFeatures(Types$PbFeatureType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.ensureAvailableFeaturesIsMutable();
         this.availableFeatures_.add(var1.getNumber());
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (BleDevice$PbBleDevice$Builder)super.addRepeatedField(var1, var2);
   }

   public BleDevice$PbBleDevice$Builder addServices(int var1, Structures$PbBleService$Builder var2) {
      if (this.servicesBuilder_ == null) {
         this.ensureServicesIsMutable();
         this.services_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.servicesBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public BleDevice$PbBleDevice$Builder addServices(int var1, Structures$PbBleService var2) {
      if (this.servicesBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureServicesIsMutable();
         this.services_.add(var1, var2);
         this.onChanged();
      } else {
         this.servicesBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public BleDevice$PbBleDevice$Builder addServices(Structures$PbBleService$Builder var1) {
      if (this.servicesBuilder_ == null) {
         this.ensureServicesIsMutable();
         this.services_.add(var1.build());
         this.onChanged();
      } else {
         this.servicesBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public BleDevice$PbBleDevice$Builder addServices(Structures$PbBleService var1) {
      if (this.servicesBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureServicesIsMutable();
         this.services_.add(var1);
         this.onChanged();
      } else {
         this.servicesBuilder_.addMessage(var1);
      }

      return this;
   }

   public Structures$PbBleService$Builder addServicesBuilder() {
      return (Structures$PbBleService$Builder)this.getServicesFieldBuilder().addBuilder(Structures$PbBleService.getDefaultInstance());
   }

   public Structures$PbBleService$Builder addServicesBuilder(int var1) {
      return (Structures$PbBleService$Builder)this.getServicesFieldBuilder().addBuilder(var1, Structures$PbBleService.getDefaultInstance());
   }

   public BleDevice$PbBleDevice$Builder addSubComponentInfo(int var1, Structures$PbSubcomponentInfo$Builder var2) {
      if (this.subComponentInfoBuilder_ == null) {
         this.ensureSubComponentInfoIsMutable();
         this.subComponentInfo_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.subComponentInfoBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public BleDevice$PbBleDevice$Builder addSubComponentInfo(int var1, Structures$PbSubcomponentInfo var2) {
      if (this.subComponentInfoBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureSubComponentInfoIsMutable();
         this.subComponentInfo_.add(var1, var2);
         this.onChanged();
      } else {
         this.subComponentInfoBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public BleDevice$PbBleDevice$Builder addSubComponentInfo(Structures$PbSubcomponentInfo$Builder var1) {
      if (this.subComponentInfoBuilder_ == null) {
         this.ensureSubComponentInfoIsMutable();
         this.subComponentInfo_.add(var1.build());
         this.onChanged();
      } else {
         this.subComponentInfoBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public BleDevice$PbBleDevice$Builder addSubComponentInfo(Structures$PbSubcomponentInfo var1) {
      if (this.subComponentInfoBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureSubComponentInfoIsMutable();
         this.subComponentInfo_.add(var1);
         this.onChanged();
      } else {
         this.subComponentInfoBuilder_.addMessage(var1);
      }

      return this;
   }

   public Structures$PbSubcomponentInfo$Builder addSubComponentInfoBuilder() {
      return (Structures$PbSubcomponentInfo$Builder)this.getSubComponentInfoFieldBuilder().addBuilder(Structures$PbSubcomponentInfo.getDefaultInstance());
   }

   public Structures$PbSubcomponentInfo$Builder addSubComponentInfoBuilder(int var1) {
      return (Structures$PbSubcomponentInfo$Builder)this.getSubComponentInfoFieldBuilder().addBuilder(var1, Structures$PbSubcomponentInfo.getDefaultInstance());
   }

   public BleDevice$PbBleDevice$Builder addUserData(int var1, BleDevice$PbBleUser$Builder var2) {
      if (this.userDataBuilder_ == null) {
         this.ensureUserDataIsMutable();
         this.userData_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.userDataBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public BleDevice$PbBleDevice$Builder addUserData(int var1, BleDevice$PbBleUser var2) {
      if (this.userDataBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureUserDataIsMutable();
         this.userData_.add(var1, var2);
         this.onChanged();
      } else {
         this.userDataBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public BleDevice$PbBleDevice$Builder addUserData(BleDevice$PbBleUser$Builder var1) {
      if (this.userDataBuilder_ == null) {
         this.ensureUserDataIsMutable();
         this.userData_.add(var1.build());
         this.onChanged();
      } else {
         this.userDataBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public BleDevice$PbBleDevice$Builder addUserData(BleDevice$PbBleUser var1) {
      if (this.userDataBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureUserDataIsMutable();
         this.userData_.add(var1);
         this.onChanged();
      } else {
         this.userDataBuilder_.addMessage(var1);
      }

      return this;
   }

   public BleDevice$PbBleUser$Builder addUserDataBuilder() {
      return (BleDevice$PbBleUser$Builder)this.getUserDataFieldBuilder().addBuilder(BleDevice$PbBleUser.getDefaultInstance());
   }

   public BleDevice$PbBleUser$Builder addUserDataBuilder(int var1) {
      return (BleDevice$PbBleUser$Builder)this.getUserDataFieldBuilder().addBuilder(var1, BleDevice$PbBleUser.getDefaultInstance());
   }

   public BleDevice$PbBleDevice build() {
      BleDevice$PbBleDevice var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public BleDevice$PbBleDevice buildPartial() {
      BleDevice$PbBleDevice var1 = new BleDevice$PbBleDevice(this, (BleDevice$1)null);
      int var2 = this.bitField0_;
      int var3 = this.bitField1_;
      byte var4;
      if ((var2 & 1) == 1) {
         var4 = 1;
      } else {
         var4 = 0;
      }

      if (this.pairedBuilder_ == null) {
         BleDevice$PbBleDevice.a(var1, this.paired_);
      } else {
         BleDevice$PbBleDevice.a(var1, (Types$PbSystemDateTime)this.pairedBuilder_.build());
      }

      int var5 = var4;
      if ((var2 & 2) == 2) {
         var5 = var4 | 2;
      }

      if (this.lastModifiedBuilder_ == null) {
         BleDevice$PbBleDevice.b(var1, this.lastModified_);
      } else {
         BleDevice$PbBleDevice.b(var1, (Types$PbSystemDateTime)this.lastModifiedBuilder_.build());
      }

      int var7 = var5;
      if ((var2 & 4) == 4) {
         var7 = var5 | 4;
      }

      BleDevice$PbBleDevice.a(var1, this.manufacturer_);
      var5 = var7;
      if ((var2 & 8) == 8) {
         var5 = var7 | 8;
      }

      if (this.deletedTimeStampBuilder_ == null) {
         BleDevice$PbBleDevice.c(var1, this.deletedTimeStamp_);
      } else {
         BleDevice$PbBleDevice.c(var1, (Types$PbSystemDateTime)this.deletedTimeStampBuilder_.build());
      }

      var7 = var5;
      if ((var2 & 16) == 16) {
         var7 = var5 | 16;
      }

      if (this.macBuilder_ == null) {
         BleDevice$PbBleDevice.a(var1, this.mac_);
      } else {
         BleDevice$PbBleDevice.a(var1, (Structures$PbBleMac)this.macBuilder_.build());
      }

      var5 = var7;
      if ((var2 & 32) == 32) {
         var5 = var7 | 32;
      }

      BleDevice$PbBleDevice.a(var1, this.deviceId_);
      var7 = var5;
      if ((var2 & 64) == 64) {
         var7 = var5 | 64;
      }

      BleDevice$PbBleDevice.b(var1, this.name_);
      int var6 = var7;
      if ((var2 & 128) == 128) {
         var6 = var7 | 128;
      }

      BleDevice$PbBleDevice.b(var1, this.batteryLevel_);
      var5 = var6;
      if ((var2 & 256) == 256) {
         var5 = var6 | 256;
      }

      BleDevice$PbBleDevice.c(var1, this.manufacturerName_);
      var7 = var5;
      if ((var2 & 512) == 512) {
         var7 = var5 | 512;
      }

      BleDevice$PbBleDevice.d(var1, this.modelName_);
      var6 = var7;
      if ((var2 & 1024) == 1024) {
         var6 = var7 | 1024;
      }

      BleDevice$PbBleDevice.a(var1, this.peerLtk_);
      var5 = var6;
      if ((var2 & 2048) == 2048) {
         var5 = var6 | 2048;
      }

      BleDevice$PbBleDevice.b(var1, this.peerIrk_);
      var7 = var5;
      if ((var2 & 4096) == 4096) {
         var7 = var5 | 4096;
      }

      BleDevice$PbBleDevice.c(var1, this.peerCsrk_);
      if ((this.bitField0_ & 8192) == 8192) {
         this.availableFeatures_ = Collections.unmodifiableList(this.availableFeatures_);
         this.bitField0_ &= -8193;
      }

      BleDevice$PbBleDevice.a(var1, this.availableFeatures_);
      if (this.servicesBuilder_ == null) {
         if ((this.bitField0_ & 16384) == 16384) {
            this.services_ = Collections.unmodifiableList(this.services_);
            this.bitField0_ &= -16385;
         }

         BleDevice$PbBleDevice.b(var1, this.services_);
      } else {
         BleDevice$PbBleDevice.b(var1, this.servicesBuilder_.build());
      }

      var5 = var7;
      if ((var2 & '耀') == 32768) {
         var5 = var7 | 8192;
      }

      BleDevice$PbBleDevice.d(var1, this.peerRand_);
      var6 = var5;
      if ((var2 & 65536) == 65536) {
         var6 = var5 | 16384;
      }

      BleDevice$PbBleDevice.c(var1, this.peerEdiv_);
      var7 = var6;
      if ((var2 & 131072) == 131072) {
         var7 = var6 | '耀';
      }

      BleDevice$PbBleDevice.d(var1, this.encrKeySize_);
      var5 = var7;
      if ((var2 & 262144) == 262144) {
         var5 = var7 | 65536;
      }

      BleDevice$PbBleDevice.e(var1, this.distributedKeys_);
      var6 = var5;
      if ((524288 & var2) == 524288) {
         var6 = var5 | 131072;
      }

      BleDevice$PbBleDevice.a(var1, this.authenticated_);
      var7 = var6;
      if ((1048576 & var2) == 1048576) {
         var7 = var6 | 262144;
      }

      BleDevice$PbBleDevice.f(var1, this.sensorLocation_);
      var5 = var7;
      if ((2097152 & var2) == 2097152) {
         var5 = var7 | 524288;
      }

      BleDevice$PbBleDevice.e(var1, this.oBSOLETEDeviceVersion_);
      var7 = var5;
      if ((4194304 & var2) == 4194304) {
         var7 = var5 | 1048576;
      }

      BleDevice$PbBleDevice.f(var1, this.secondarySoftwareVersion_);
      var6 = var7;
      if ((8388608 & var2) == 8388608) {
         var6 = var7 | 2097152;
      }

      BleDevice$PbBleDevice.g(var1, this.serialNumber_);
      var5 = var6;
      if ((16777216 & var2) == 16777216) {
         var5 = var6 | 4194304;
      }

      BleDevice$PbBleDevice.e(var1, this.localLtk_);
      var7 = var5;
      if ((33554432 & var2) == 33554432) {
         var7 = var5 | 8388608;
      }

      BleDevice$PbBleDevice.f(var1, this.localRand_);
      var6 = var7;
      if ((67108864 & var2) == 67108864) {
         var6 = var7 | 16777216;
      }

      BleDevice$PbBleDevice.g(var1, this.localEdiv_);
      if (this.userDataBuilder_ == null) {
         if ((this.bitField0_ & 134217728) == 134217728) {
            this.userData_ = Collections.unmodifiableList(this.userData_);
            this.bitField0_ &= -134217729;
         }

         BleDevice$PbBleDevice.c(var1, this.userData_);
      } else {
         BleDevice$PbBleDevice.c(var1, this.userDataBuilder_.build());
      }

      var5 = var6;
      if ((268435456 & var2) == 268435456) {
         var5 = var6 | 33554432;
      }

      BleDevice$PbBleDevice.h(var1, this.deviceAppearance_);
      var7 = var5;
      if ((536870912 & var2) == 536870912) {
         var7 = var5 | 67108864;
      }

      BleDevice$PbBleDevice.b(var1, this.partOfDistributedPowerSystem_);
      var5 = var7;
      if ((1073741824 & var2) == 1073741824) {
         var5 = var7 | 134217728;
      }

      BleDevice$PbBleDevice.h(var1, this.hardwareCode_);
      if (this.subComponentInfoBuilder_ == null) {
         if ((this.bitField0_ & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.subComponentInfo_ = Collections.unmodifiableList(this.subComponentInfo_);
            this.bitField0_ &= Integer.MAX_VALUE;
         }

         BleDevice$PbBleDevice.d(var1, this.subComponentInfo_);
      } else {
         BleDevice$PbBleDevice.d(var1, this.subComponentInfoBuilder_.build());
      }

      var7 = var5;
      if ((var3 & 1) == 1) {
         var7 = var5 | 268435456;
      }

      if (this.deviceVersionBuilder_ == null) {
         BleDevice$PbBleDevice.a(var1, this.deviceVersion_);
      } else {
         BleDevice$PbBleDevice.a(var1, (Structures$PbVersion)this.deviceVersionBuilder_.build());
      }

      BleDevice$PbBleDevice.i(var1, var7);
      this.onBuilt();
      return var1;
   }

   public BleDevice$PbBleDevice$Builder clear() {
      super.clear();
      if (this.pairedBuilder_ == null) {
         this.paired_ = null;
      } else {
         this.pairedBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -3;
      this.manufacturer_ = 1;
      this.bitField0_ &= -5;
      if (this.deletedTimeStampBuilder_ == null) {
         this.deletedTimeStamp_ = null;
      } else {
         this.deletedTimeStampBuilder_.clear();
      }

      this.bitField0_ &= -9;
      if (this.macBuilder_ == null) {
         this.mac_ = null;
      } else {
         this.macBuilder_.clear();
      }

      this.bitField0_ &= -17;
      this.deviceId_ = "";
      this.bitField0_ &= -33;
      this.name_ = "";
      this.bitField0_ &= -65;
      this.batteryLevel_ = 0;
      this.bitField0_ &= -129;
      this.manufacturerName_ = "";
      this.bitField0_ &= -257;
      this.modelName_ = "";
      this.bitField0_ &= -513;
      this.peerLtk_ = ByteString.EMPTY;
      this.bitField0_ &= -1025;
      this.peerIrk_ = ByteString.EMPTY;
      this.bitField0_ &= -2049;
      this.peerCsrk_ = ByteString.EMPTY;
      this.bitField0_ &= -4097;
      this.availableFeatures_ = Collections.emptyList();
      this.bitField0_ &= -8193;
      if (this.servicesBuilder_ == null) {
         this.services_ = Collections.emptyList();
         this.bitField0_ &= -16385;
      } else {
         this.servicesBuilder_.clear();
      }

      this.peerRand_ = ByteString.EMPTY;
      this.bitField0_ &= -32769;
      this.peerEdiv_ = 0;
      this.bitField0_ &= -65537;
      this.encrKeySize_ = 0;
      this.bitField0_ &= -131073;
      this.distributedKeys_ = 0;
      this.bitField0_ &= -262145;
      this.authenticated_ = false;
      this.bitField0_ &= -524289;
      this.sensorLocation_ = 0;
      this.bitField0_ &= -1048577;
      this.oBSOLETEDeviceVersion_ = "";
      this.bitField0_ &= -2097153;
      this.secondarySoftwareVersion_ = "";
      this.bitField0_ &= -4194305;
      this.serialNumber_ = "";
      this.bitField0_ &= -8388609;
      this.localLtk_ = ByteString.EMPTY;
      this.bitField0_ &= -16777217;
      this.localRand_ = ByteString.EMPTY;
      this.bitField0_ &= -33554433;
      this.localEdiv_ = 0;
      this.bitField0_ &= -67108865;
      if (this.userDataBuilder_ == null) {
         this.userData_ = Collections.emptyList();
         this.bitField0_ &= -134217729;
      } else {
         this.userDataBuilder_.clear();
      }

      this.deviceAppearance_ = 0;
      this.bitField0_ &= -268435457;
      this.partOfDistributedPowerSystem_ = false;
      this.bitField0_ &= -536870913;
      this.hardwareCode_ = "";
      this.bitField0_ &= -1073741825;
      if (this.subComponentInfoBuilder_ == null) {
         this.subComponentInfo_ = Collections.emptyList();
         this.bitField0_ &= Integer.MAX_VALUE;
      } else {
         this.subComponentInfoBuilder_.clear();
      }

      if (this.deviceVersionBuilder_ == null) {
         this.deviceVersion_ = null;
      } else {
         this.deviceVersionBuilder_.clear();
      }

      this.bitField1_ &= -2;
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearAuthenticated() {
      this.bitField0_ &= -524289;
      this.authenticated_ = false;
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearAvailableFeatures() {
      this.availableFeatures_ = Collections.emptyList();
      this.bitField0_ &= -8193;
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearBatteryLevel() {
      this.bitField0_ &= -129;
      this.batteryLevel_ = 0;
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearDeletedTimeStamp() {
      if (this.deletedTimeStampBuilder_ == null) {
         this.deletedTimeStamp_ = null;
         this.onChanged();
      } else {
         this.deletedTimeStampBuilder_.clear();
      }

      this.bitField0_ &= -9;
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearDeviceAppearance() {
      this.bitField0_ &= -268435457;
      this.deviceAppearance_ = 0;
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearDeviceId() {
      this.bitField0_ &= -33;
      this.deviceId_ = BleDevice$PbBleDevice.getDefaultInstance().getDeviceId();
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearDeviceVersion() {
      if (this.deviceVersionBuilder_ == null) {
         this.deviceVersion_ = null;
         this.onChanged();
      } else {
         this.deviceVersionBuilder_.clear();
      }

      this.bitField1_ &= -2;
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearDistributedKeys() {
      this.bitField0_ &= -262145;
      this.distributedKeys_ = 0;
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearEncrKeySize() {
      this.bitField0_ &= -131073;
      this.encrKeySize_ = 0;
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearField(FieldDescriptor var1) {
      return (BleDevice$PbBleDevice$Builder)super.clearField(var1);
   }

   public BleDevice$PbBleDevice$Builder clearHardwareCode() {
      this.bitField0_ &= -1073741825;
      this.hardwareCode_ = BleDevice$PbBleDevice.getDefaultInstance().getHardwareCode();
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearLastModified() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearLocalEdiv() {
      this.bitField0_ &= -67108865;
      this.localEdiv_ = 0;
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearLocalLtk() {
      this.bitField0_ &= -16777217;
      this.localLtk_ = BleDevice$PbBleDevice.getDefaultInstance().getLocalLtk();
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearLocalRand() {
      this.bitField0_ &= -33554433;
      this.localRand_ = BleDevice$PbBleDevice.getDefaultInstance().getLocalRand();
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearMac() {
      if (this.macBuilder_ == null) {
         this.mac_ = null;
         this.onChanged();
      } else {
         this.macBuilder_.clear();
      }

      this.bitField0_ &= -17;
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearManufacturer() {
      this.bitField0_ &= -5;
      this.manufacturer_ = 1;
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearManufacturerName() {
      this.bitField0_ &= -257;
      this.manufacturerName_ = BleDevice$PbBleDevice.getDefaultInstance().getManufacturerName();
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearModelName() {
      this.bitField0_ &= -513;
      this.modelName_ = BleDevice$PbBleDevice.getDefaultInstance().getModelName();
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearName() {
      this.bitField0_ &= -65;
      this.name_ = BleDevice$PbBleDevice.getDefaultInstance().getName();
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearOBSOLETEDeviceVersion() {
      this.bitField0_ &= -2097153;
      this.oBSOLETEDeviceVersion_ = BleDevice$PbBleDevice.getDefaultInstance().getOBSOLETEDeviceVersion();
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearOneof(OneofDescriptor var1) {
      return (BleDevice$PbBleDevice$Builder)super.clearOneof(var1);
   }

   public BleDevice$PbBleDevice$Builder clearPaired() {
      if (this.pairedBuilder_ == null) {
         this.paired_ = null;
         this.onChanged();
      } else {
         this.pairedBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearPartOfDistributedPowerSystem() {
      this.bitField0_ &= -536870913;
      this.partOfDistributedPowerSystem_ = false;
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearPeerCsrk() {
      this.bitField0_ &= -4097;
      this.peerCsrk_ = BleDevice$PbBleDevice.getDefaultInstance().getPeerCsrk();
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearPeerEdiv() {
      this.bitField0_ &= -65537;
      this.peerEdiv_ = 0;
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearPeerIrk() {
      this.bitField0_ &= -2049;
      this.peerIrk_ = BleDevice$PbBleDevice.getDefaultInstance().getPeerIrk();
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearPeerLtk() {
      this.bitField0_ &= -1025;
      this.peerLtk_ = BleDevice$PbBleDevice.getDefaultInstance().getPeerLtk();
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearPeerRand() {
      this.bitField0_ &= -32769;
      this.peerRand_ = BleDevice$PbBleDevice.getDefaultInstance().getPeerRand();
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearSecondarySoftwareVersion() {
      this.bitField0_ &= -4194305;
      this.secondarySoftwareVersion_ = BleDevice$PbBleDevice.getDefaultInstance().getSecondarySoftwareVersion();
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearSensorLocation() {
      this.bitField0_ &= -1048577;
      this.sensorLocation_ = 0;
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearSerialNumber() {
      this.bitField0_ &= -8388609;
      this.serialNumber_ = BleDevice$PbBleDevice.getDefaultInstance().getSerialNumber();
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder clearServices() {
      if (this.servicesBuilder_ == null) {
         this.services_ = Collections.emptyList();
         this.bitField0_ &= -16385;
         this.onChanged();
      } else {
         this.servicesBuilder_.clear();
      }

      return this;
   }

   public BleDevice$PbBleDevice$Builder clearSubComponentInfo() {
      if (this.subComponentInfoBuilder_ == null) {
         this.subComponentInfo_ = Collections.emptyList();
         this.bitField0_ &= Integer.MAX_VALUE;
         this.onChanged();
      } else {
         this.subComponentInfoBuilder_.clear();
      }

      return this;
   }

   public BleDevice$PbBleDevice$Builder clearUserData() {
      if (this.userDataBuilder_ == null) {
         this.userData_ = Collections.emptyList();
         this.bitField0_ &= -134217729;
         this.onChanged();
      } else {
         this.userDataBuilder_.clear();
      }

      return this;
   }

   public BleDevice$PbBleDevice$Builder clone() {
      return (BleDevice$PbBleDevice$Builder)super.clone();
   }

   public boolean getAuthenticated() {
      return this.authenticated_;
   }

   public Types$PbFeatureType getAvailableFeatures(int var1) {
      return (Types$PbFeatureType)BleDevice$PbBleDevice.f().convert(this.availableFeatures_.get(var1));
   }

   public int getAvailableFeaturesCount() {
      return this.availableFeatures_.size();
   }

   public List getAvailableFeaturesList() {
      return new ListAdapter(this.availableFeatures_, BleDevice$PbBleDevice.f());
   }

   public int getBatteryLevel() {
      return this.batteryLevel_;
   }

   public BleDevice$PbBleDevice getDefaultInstanceForType() {
      return BleDevice$PbBleDevice.getDefaultInstance();
   }

   public Types$PbSystemDateTime getDeletedTimeStamp() {
      Types$PbSystemDateTime var1;
      if (this.deletedTimeStampBuilder_ == null) {
         if (this.deletedTimeStamp_ == null) {
            var1 = Types$PbSystemDateTime.getDefaultInstance();
         } else {
            var1 = this.deletedTimeStamp_;
         }
      } else {
         var1 = (Types$PbSystemDateTime)this.deletedTimeStampBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbSystemDateTime$Builder getDeletedTimeStampBuilder() {
      this.bitField0_ |= 8;
      this.onChanged();
      return (Types$PbSystemDateTime$Builder)this.getDeletedTimeStampFieldBuilder().getBuilder();
   }

   public Types$PbSystemDateTimeOrBuilder getDeletedTimeStampOrBuilder() {
      Object var1;
      if (this.deletedTimeStampBuilder_ != null) {
         var1 = (Types$PbSystemDateTimeOrBuilder)this.deletedTimeStampBuilder_.getMessageOrBuilder();
      } else if (this.deletedTimeStamp_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.deletedTimeStamp_;
      }

      return (Types$PbSystemDateTimeOrBuilder)var1;
   }

   public Descriptor getDescriptorForType() {
      return BleDevice.c();
   }

   public BleDevice$PbBleDevice$PbDeviceAppearance getDeviceAppearance() {
      BleDevice$PbBleDevice$PbDeviceAppearance var1 = BleDevice$PbBleDevice$PbDeviceAppearance.valueOf(this.deviceAppearance_);
      BleDevice$PbBleDevice$PbDeviceAppearance var2 = var1;
      if (var1 == null) {
         var2 = BleDevice$PbBleDevice$PbDeviceAppearance.BLE_DEVICE_APPEARENCE_UNKNOWN;
      }

      return var2;
   }

   public String getDeviceId() {
      Object var1 = this.deviceId_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.deviceId_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getDeviceIdBytes() {
      Object var1 = this.deviceId_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.deviceId_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public Structures$PbVersion getDeviceVersion() {
      Structures$PbVersion var1;
      if (this.deviceVersionBuilder_ == null) {
         if (this.deviceVersion_ == null) {
            var1 = Structures$PbVersion.getDefaultInstance();
         } else {
            var1 = this.deviceVersion_;
         }
      } else {
         var1 = (Structures$PbVersion)this.deviceVersionBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbVersion$Builder getDeviceVersionBuilder() {
      this.bitField1_ |= 1;
      this.onChanged();
      return (Structures$PbVersion$Builder)this.getDeviceVersionFieldBuilder().getBuilder();
   }

   public Structures$PbVersionOrBuilder getDeviceVersionOrBuilder() {
      Object var1;
      if (this.deviceVersionBuilder_ != null) {
         var1 = (Structures$PbVersionOrBuilder)this.deviceVersionBuilder_.getMessageOrBuilder();
      } else if (this.deviceVersion_ == null) {
         var1 = Structures$PbVersion.getDefaultInstance();
      } else {
         var1 = this.deviceVersion_;
      }

      return (Structures$PbVersionOrBuilder)var1;
   }

   public int getDistributedKeys() {
      return this.distributedKeys_;
   }

   public int getEncrKeySize() {
      return this.encrKeySize_;
   }

   public String getHardwareCode() {
      Object var1 = this.hardwareCode_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.hardwareCode_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getHardwareCodeBytes() {
      Object var1 = this.hardwareCode_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.hardwareCode_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
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

   public int getLocalEdiv() {
      return this.localEdiv_;
   }

   public ByteString getLocalLtk() {
      return this.localLtk_;
   }

   public ByteString getLocalRand() {
      return this.localRand_;
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
      this.bitField0_ |= 16;
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

   public BleDevice$PbDeviceManufacturerType getManufacturer() {
      BleDevice$PbDeviceManufacturerType var1 = BleDevice$PbDeviceManufacturerType.valueOf(this.manufacturer_);
      BleDevice$PbDeviceManufacturerType var2 = var1;
      if (var1 == null) {
         var2 = BleDevice$PbDeviceManufacturerType.MANUFACTURER_POLAR;
      }

      return var2;
   }

   public String getManufacturerName() {
      Object var1 = this.manufacturerName_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.manufacturerName_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getManufacturerNameBytes() {
      Object var1 = this.manufacturerName_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.manufacturerName_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public String getModelName() {
      Object var1 = this.modelName_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.modelName_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getModelNameBytes() {
      Object var1 = this.modelName_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.modelName_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public String getName() {
      Object var1 = this.name_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.name_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getNameBytes() {
      Object var1 = this.name_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.name_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public String getOBSOLETEDeviceVersion() {
      Object var1 = this.oBSOLETEDeviceVersion_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.oBSOLETEDeviceVersion_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getOBSOLETEDeviceVersionBytes() {
      Object var1 = this.oBSOLETEDeviceVersion_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.oBSOLETEDeviceVersion_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public Types$PbSystemDateTime getPaired() {
      Types$PbSystemDateTime var1;
      if (this.pairedBuilder_ == null) {
         if (this.paired_ == null) {
            var1 = Types$PbSystemDateTime.getDefaultInstance();
         } else {
            var1 = this.paired_;
         }
      } else {
         var1 = (Types$PbSystemDateTime)this.pairedBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbSystemDateTime$Builder getPairedBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Types$PbSystemDateTime$Builder)this.getPairedFieldBuilder().getBuilder();
   }

   public Types$PbSystemDateTimeOrBuilder getPairedOrBuilder() {
      Object var1;
      if (this.pairedBuilder_ != null) {
         var1 = (Types$PbSystemDateTimeOrBuilder)this.pairedBuilder_.getMessageOrBuilder();
      } else if (this.paired_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.paired_;
      }

      return (Types$PbSystemDateTimeOrBuilder)var1;
   }

   public boolean getPartOfDistributedPowerSystem() {
      return this.partOfDistributedPowerSystem_;
   }

   public ByteString getPeerCsrk() {
      return this.peerCsrk_;
   }

   public int getPeerEdiv() {
      return this.peerEdiv_;
   }

   public ByteString getPeerIrk() {
      return this.peerIrk_;
   }

   public ByteString getPeerLtk() {
      return this.peerLtk_;
   }

   public ByteString getPeerRand() {
      return this.peerRand_;
   }

   public String getSecondarySoftwareVersion() {
      Object var1 = this.secondarySoftwareVersion_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.secondarySoftwareVersion_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getSecondarySoftwareVersionBytes() {
      Object var1 = this.secondarySoftwareVersion_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.secondarySoftwareVersion_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public BleDevice$PbBleDevice$PbSensorLocation getSensorLocation() {
      BleDevice$PbBleDevice$PbSensorLocation var1 = BleDevice$PbBleDevice$PbSensorLocation.valueOf(this.sensorLocation_);
      BleDevice$PbBleDevice$PbSensorLocation var2 = var1;
      if (var1 == null) {
         var2 = BleDevice$PbBleDevice$PbSensorLocation.SENSOR_LOCATION_OTHER;
      }

      return var2;
   }

   public String getSerialNumber() {
      Object var1 = this.serialNumber_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.serialNumber_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getSerialNumberBytes() {
      Object var1 = this.serialNumber_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.serialNumber_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public Structures$PbBleService getServices(int var1) {
      Structures$PbBleService var2;
      if (this.servicesBuilder_ == null) {
         var2 = (Structures$PbBleService)this.services_.get(var1);
      } else {
         var2 = (Structures$PbBleService)this.servicesBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Structures$PbBleService$Builder getServicesBuilder(int var1) {
      return (Structures$PbBleService$Builder)this.getServicesFieldBuilder().getBuilder(var1);
   }

   public List getServicesBuilderList() {
      return this.getServicesFieldBuilder().getBuilderList();
   }

   public int getServicesCount() {
      int var1;
      if (this.servicesBuilder_ == null) {
         var1 = this.services_.size();
      } else {
         var1 = this.servicesBuilder_.getCount();
      }

      return var1;
   }

   public List getServicesList() {
      List var1;
      if (this.servicesBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.services_);
      } else {
         var1 = this.servicesBuilder_.getMessageList();
      }

      return var1;
   }

   public Structures$PbBleServiceOrBuilder getServicesOrBuilder(int var1) {
      Structures$PbBleServiceOrBuilder var2;
      if (this.servicesBuilder_ == null) {
         var2 = (Structures$PbBleServiceOrBuilder)this.services_.get(var1);
      } else {
         var2 = (Structures$PbBleServiceOrBuilder)this.servicesBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getServicesOrBuilderList() {
      List var1;
      if (this.servicesBuilder_ != null) {
         var1 = this.servicesBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.services_);
      }

      return var1;
   }

   public Structures$PbSubcomponentInfo getSubComponentInfo(int var1) {
      Structures$PbSubcomponentInfo var2;
      if (this.subComponentInfoBuilder_ == null) {
         var2 = (Structures$PbSubcomponentInfo)this.subComponentInfo_.get(var1);
      } else {
         var2 = (Structures$PbSubcomponentInfo)this.subComponentInfoBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Structures$PbSubcomponentInfo$Builder getSubComponentInfoBuilder(int var1) {
      return (Structures$PbSubcomponentInfo$Builder)this.getSubComponentInfoFieldBuilder().getBuilder(var1);
   }

   public List getSubComponentInfoBuilderList() {
      return this.getSubComponentInfoFieldBuilder().getBuilderList();
   }

   public int getSubComponentInfoCount() {
      int var1;
      if (this.subComponentInfoBuilder_ == null) {
         var1 = this.subComponentInfo_.size();
      } else {
         var1 = this.subComponentInfoBuilder_.getCount();
      }

      return var1;
   }

   public List getSubComponentInfoList() {
      List var1;
      if (this.subComponentInfoBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.subComponentInfo_);
      } else {
         var1 = this.subComponentInfoBuilder_.getMessageList();
      }

      return var1;
   }

   public Structures$PbSubcomponentInfoOrBuilder getSubComponentInfoOrBuilder(int var1) {
      Structures$PbSubcomponentInfoOrBuilder var2;
      if (this.subComponentInfoBuilder_ == null) {
         var2 = (Structures$PbSubcomponentInfoOrBuilder)this.subComponentInfo_.get(var1);
      } else {
         var2 = (Structures$PbSubcomponentInfoOrBuilder)this.subComponentInfoBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getSubComponentInfoOrBuilderList() {
      List var1;
      if (this.subComponentInfoBuilder_ != null) {
         var1 = this.subComponentInfoBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.subComponentInfo_);
      }

      return var1;
   }

   public BleDevice$PbBleUser getUserData(int var1) {
      BleDevice$PbBleUser var2;
      if (this.userDataBuilder_ == null) {
         var2 = (BleDevice$PbBleUser)this.userData_.get(var1);
      } else {
         var2 = (BleDevice$PbBleUser)this.userDataBuilder_.getMessage(var1);
      }

      return var2;
   }

   public BleDevice$PbBleUser$Builder getUserDataBuilder(int var1) {
      return (BleDevice$PbBleUser$Builder)this.getUserDataFieldBuilder().getBuilder(var1);
   }

   public List getUserDataBuilderList() {
      return this.getUserDataFieldBuilder().getBuilderList();
   }

   public int getUserDataCount() {
      int var1;
      if (this.userDataBuilder_ == null) {
         var1 = this.userData_.size();
      } else {
         var1 = this.userDataBuilder_.getCount();
      }

      return var1;
   }

   public List getUserDataList() {
      List var1;
      if (this.userDataBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.userData_);
      } else {
         var1 = this.userDataBuilder_.getMessageList();
      }

      return var1;
   }

   public BleDevice$PbBleUserOrBuilder getUserDataOrBuilder(int var1) {
      BleDevice$PbBleUserOrBuilder var2;
      if (this.userDataBuilder_ == null) {
         var2 = (BleDevice$PbBleUserOrBuilder)this.userData_.get(var1);
      } else {
         var2 = (BleDevice$PbBleUserOrBuilder)this.userDataBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getUserDataOrBuilderList() {
      List var1;
      if (this.userDataBuilder_ != null) {
         var1 = this.userDataBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.userData_);
      }

      return var1;
   }

   public boolean hasAuthenticated() {
      boolean var1;
      if ((this.bitField0_ & 524288) == 524288) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasBatteryLevel() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDeletedTimeStamp() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDeviceAppearance() {
      boolean var1;
      if ((this.bitField0_ & 268435456) == 268435456) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDeviceId() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDeviceVersion() {
      boolean var1 = true;
      if ((this.bitField1_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDistributedKeys() {
      boolean var1;
      if ((this.bitField0_ & 262144) == 262144) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasEncrKeySize() {
      boolean var1;
      if ((this.bitField0_ & 131072) == 131072) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasHardwareCode() {
      boolean var1;
      if ((this.bitField0_ & 1073741824) == 1073741824) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
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

   public boolean hasLocalEdiv() {
      boolean var1;
      if ((this.bitField0_ & 67108864) == 67108864) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLocalLtk() {
      boolean var1;
      if ((this.bitField0_ & 16777216) == 16777216) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLocalRand() {
      boolean var1;
      if ((this.bitField0_ & 33554432) == 33554432) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMac() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasManufacturer() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasManufacturerName() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasModelName() {
      boolean var1;
      if ((this.bitField0_ & 512) == 512) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasName() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasOBSOLETEDeviceVersion() {
      boolean var1;
      if ((this.bitField0_ & 2097152) == 2097152) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPaired() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPartOfDistributedPowerSystem() {
      boolean var1;
      if ((this.bitField0_ & 536870912) == 536870912) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPeerCsrk() {
      boolean var1;
      if ((this.bitField0_ & 4096) == 4096) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPeerEdiv() {
      boolean var1;
      if ((this.bitField0_ & 65536) == 65536) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPeerIrk() {
      boolean var1;
      if ((this.bitField0_ & 2048) == 2048) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPeerLtk() {
      boolean var1;
      if ((this.bitField0_ & 1024) == 1024) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPeerRand() {
      boolean var1;
      if ((this.bitField0_ & '耀') == 32768) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSecondarySoftwareVersion() {
      boolean var1;
      if ((this.bitField0_ & 4194304) == 4194304) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSensorLocation() {
      boolean var1;
      if ((this.bitField0_ & 1048576) == 1048576) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSerialNumber() {
      boolean var1;
      if ((this.bitField0_ & 8388608) == 8388608) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return BleDevice.d().ensureFieldAccessorsInitialized(BleDevice$PbBleDevice.class, BleDevice$PbBleDevice$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasPaired()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasLastModified()) {
            var2 = var1;
            if (this.hasManufacturer()) {
               var2 = var1;
               if (this.getPaired().isInitialized()) {
                  var2 = var1;
                  if (this.getLastModified().isInitialized()) {
                     if (this.hasDeletedTimeStamp()) {
                        var2 = var1;
                        if (!this.getDeletedTimeStamp().isInitialized()) {
                           return var2;
                        }
                     }

                     if (this.hasMac()) {
                        var2 = var1;
                        if (!this.getMac().isInitialized()) {
                           return var2;
                        }
                     }

                     int var3 = 0;

                     while(true) {
                        if (var3 >= this.getServicesCount()) {
                           for(var3 = 0; var3 < this.getUserDataCount(); ++var3) {
                              var2 = var1;
                              if (!this.getUserData(var3).isInitialized()) {
                                 return var2;
                              }
                           }

                           for(var3 = 0; var3 < this.getSubComponentInfoCount(); ++var3) {
                              var2 = var1;
                              if (!this.getSubComponentInfo(var3).isInitialized()) {
                                 return var2;
                              }
                           }

                           if (this.hasDeviceVersion()) {
                              var2 = var1;
                              if (!this.getDeviceVersion().isInitialized()) {
                                 break;
                              }
                           }

                           var2 = true;
                           break;
                        }

                        var2 = var1;
                        if (!this.getServices(var3).isInitialized()) {
                           break;
                        }

                        ++var3;
                     }
                  }
               }
            }
         }
      }

      return var2;
   }

   public BleDevice$PbBleDevice$Builder mergeDeletedTimeStamp(Types$PbSystemDateTime var1) {
      if (this.deletedTimeStampBuilder_ == null) {
         if ((this.bitField0_ & 8) == 8 && this.deletedTimeStamp_ != null && this.deletedTimeStamp_ != Types$PbSystemDateTime.getDefaultInstance()) {
            this.deletedTimeStamp_ = Types$PbSystemDateTime.newBuilder(this.deletedTimeStamp_).mergeFrom(var1).buildPartial();
         } else {
            this.deletedTimeStamp_ = var1;
         }

         this.onChanged();
      } else {
         this.deletedTimeStampBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public BleDevice$PbBleDevice$Builder mergeDeviceVersion(Structures$PbVersion var1) {
      if (this.deviceVersionBuilder_ == null) {
         if ((this.bitField1_ & 1) == 1 && this.deviceVersion_ != null && this.deviceVersion_ != Structures$PbVersion.getDefaultInstance()) {
            this.deviceVersion_ = Structures$PbVersion.newBuilder(this.deviceVersion_).mergeFrom(var1).buildPartial();
         } else {
            this.deviceVersion_ = var1;
         }

         this.onChanged();
      } else {
         this.deviceVersionBuilder_.mergeFrom(var1);
      }

      this.bitField1_ |= 1;
      return this;
   }

   public BleDevice$PbBleDevice$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      BleDevice$PbBleDevice var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (BleDevice$PbBleDevice)BleDevice$PbBleDevice.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (BleDevice$PbBleDevice)var10.getUnfinishedMessage();
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

   public BleDevice$PbBleDevice$Builder mergeFrom(Message var1) {
      BleDevice$PbBleDevice$Builder var2;
      if (var1 instanceof BleDevice$PbBleDevice) {
         var2 = this.mergeFrom((BleDevice$PbBleDevice)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public BleDevice$PbBleDevice$Builder mergeFrom(BleDevice$PbBleDevice var1) {
      Object var2 = null;
      if (var1 != BleDevice$PbBleDevice.getDefaultInstance()) {
         if (var1.hasPaired()) {
            this.mergePaired(var1.getPaired());
         }

         if (var1.hasLastModified()) {
            this.mergeLastModified(var1.getLastModified());
         }

         if (var1.hasManufacturer()) {
            this.setManufacturer(var1.getManufacturer());
         }

         if (var1.hasDeletedTimeStamp()) {
            this.mergeDeletedTimeStamp(var1.getDeletedTimeStamp());
         }

         if (var1.hasMac()) {
            this.mergeMac(var1.getMac());
         }

         if (var1.hasDeviceId()) {
            this.bitField0_ |= 32;
            this.deviceId_ = BleDevice$PbBleDevice.a(var1);
            this.onChanged();
         }

         if (var1.hasName()) {
            this.bitField0_ |= 64;
            this.name_ = BleDevice$PbBleDevice.b(var1);
            this.onChanged();
         }

         if (var1.hasBatteryLevel()) {
            this.setBatteryLevel(var1.getBatteryLevel());
         }

         if (var1.hasManufacturerName()) {
            this.bitField0_ |= 256;
            this.manufacturerName_ = BleDevice$PbBleDevice.c(var1);
            this.onChanged();
         }

         if (var1.hasModelName()) {
            this.bitField0_ |= 512;
            this.modelName_ = BleDevice$PbBleDevice.d(var1);
            this.onChanged();
         }

         if (var1.hasPeerLtk()) {
            this.setPeerLtk(var1.getPeerLtk());
         }

         if (var1.hasPeerIrk()) {
            this.setPeerIrk(var1.getPeerIrk());
         }

         if (var1.hasPeerCsrk()) {
            this.setPeerCsrk(var1.getPeerCsrk());
         }

         if (!BleDevice$PbBleDevice.e(var1).isEmpty()) {
            if (this.availableFeatures_.isEmpty()) {
               this.availableFeatures_ = BleDevice$PbBleDevice.e(var1);
               this.bitField0_ &= -8193;
            } else {
               this.ensureAvailableFeaturesIsMutable();
               this.availableFeatures_.addAll(BleDevice$PbBleDevice.e(var1));
            }

            this.onChanged();
         }

         RepeatedFieldBuilderV3 var3;
         if (this.servicesBuilder_ == null) {
            if (!BleDevice$PbBleDevice.f(var1).isEmpty()) {
               if (this.services_.isEmpty()) {
                  this.services_ = BleDevice$PbBleDevice.f(var1);
                  this.bitField0_ &= -16385;
               } else {
                  this.ensureServicesIsMutable();
                  this.services_.addAll(BleDevice$PbBleDevice.f(var1));
               }

               this.onChanged();
            }
         } else if (!BleDevice$PbBleDevice.f(var1).isEmpty()) {
            if (this.servicesBuilder_.isEmpty()) {
               this.servicesBuilder_.dispose();
               this.servicesBuilder_ = null;
               this.services_ = BleDevice$PbBleDevice.f(var1);
               this.bitField0_ &= -16385;
               if (BleDevice$PbBleDevice.c()) {
                  var3 = this.getServicesFieldBuilder();
               } else {
                  var3 = null;
               }

               this.servicesBuilder_ = var3;
            } else {
               this.servicesBuilder_.addAllMessages(BleDevice$PbBleDevice.f(var1));
            }
         }

         if (var1.hasPeerRand()) {
            this.setPeerRand(var1.getPeerRand());
         }

         if (var1.hasPeerEdiv()) {
            this.setPeerEdiv(var1.getPeerEdiv());
         }

         if (var1.hasEncrKeySize()) {
            this.setEncrKeySize(var1.getEncrKeySize());
         }

         if (var1.hasDistributedKeys()) {
            this.setDistributedKeys(var1.getDistributedKeys());
         }

         if (var1.hasAuthenticated()) {
            this.setAuthenticated(var1.getAuthenticated());
         }

         if (var1.hasSensorLocation()) {
            this.setSensorLocation(var1.getSensorLocation());
         }

         if (var1.hasOBSOLETEDeviceVersion()) {
            this.bitField0_ |= 2097152;
            this.oBSOLETEDeviceVersion_ = BleDevice$PbBleDevice.g(var1);
            this.onChanged();
         }

         if (var1.hasSecondarySoftwareVersion()) {
            this.bitField0_ |= 4194304;
            this.secondarySoftwareVersion_ = BleDevice$PbBleDevice.h(var1);
            this.onChanged();
         }

         if (var1.hasSerialNumber()) {
            this.bitField0_ |= 8388608;
            this.serialNumber_ = BleDevice$PbBleDevice.i(var1);
            this.onChanged();
         }

         if (var1.hasLocalLtk()) {
            this.setLocalLtk(var1.getLocalLtk());
         }

         if (var1.hasLocalRand()) {
            this.setLocalRand(var1.getLocalRand());
         }

         if (var1.hasLocalEdiv()) {
            this.setLocalEdiv(var1.getLocalEdiv());
         }

         if (this.userDataBuilder_ == null) {
            if (!BleDevice$PbBleDevice.j(var1).isEmpty()) {
               if (this.userData_.isEmpty()) {
                  this.userData_ = BleDevice$PbBleDevice.j(var1);
                  this.bitField0_ &= -134217729;
               } else {
                  this.ensureUserDataIsMutable();
                  this.userData_.addAll(BleDevice$PbBleDevice.j(var1));
               }

               this.onChanged();
            }
         } else if (!BleDevice$PbBleDevice.j(var1).isEmpty()) {
            if (this.userDataBuilder_.isEmpty()) {
               this.userDataBuilder_.dispose();
               this.userDataBuilder_ = null;
               this.userData_ = BleDevice$PbBleDevice.j(var1);
               this.bitField0_ &= -134217729;
               if (BleDevice$PbBleDevice.d()) {
                  var3 = this.getUserDataFieldBuilder();
               } else {
                  var3 = null;
               }

               this.userDataBuilder_ = var3;
            } else {
               this.userDataBuilder_.addAllMessages(BleDevice$PbBleDevice.j(var1));
            }
         }

         if (var1.hasDeviceAppearance()) {
            this.setDeviceAppearance(var1.getDeviceAppearance());
         }

         if (var1.hasPartOfDistributedPowerSystem()) {
            this.setPartOfDistributedPowerSystem(var1.getPartOfDistributedPowerSystem());
         }

         if (var1.hasHardwareCode()) {
            this.bitField0_ |= 1073741824;
            this.hardwareCode_ = BleDevice$PbBleDevice.k(var1);
            this.onChanged();
         }

         if (this.subComponentInfoBuilder_ == null) {
            if (!BleDevice$PbBleDevice.l(var1).isEmpty()) {
               if (this.subComponentInfo_.isEmpty()) {
                  this.subComponentInfo_ = BleDevice$PbBleDevice.l(var1);
                  this.bitField0_ &= Integer.MAX_VALUE;
               } else {
                  this.ensureSubComponentInfoIsMutable();
                  this.subComponentInfo_.addAll(BleDevice$PbBleDevice.l(var1));
               }

               this.onChanged();
            }
         } else if (!BleDevice$PbBleDevice.l(var1).isEmpty()) {
            if (this.subComponentInfoBuilder_.isEmpty()) {
               this.subComponentInfoBuilder_.dispose();
               this.subComponentInfoBuilder_ = null;
               this.subComponentInfo_ = BleDevice$PbBleDevice.l(var1);
               this.bitField0_ &= Integer.MAX_VALUE;
               var3 = (RepeatedFieldBuilderV3)var2;
               if (BleDevice$PbBleDevice.e()) {
                  var3 = this.getSubComponentInfoFieldBuilder();
               }

               this.subComponentInfoBuilder_ = var3;
            } else {
               this.subComponentInfoBuilder_.addAllMessages(BleDevice$PbBleDevice.l(var1));
            }
         }

         if (var1.hasDeviceVersion()) {
            this.mergeDeviceVersion(var1.getDeviceVersion());
         }

         this.mergeUnknownFields(BleDevice$PbBleDevice.m(var1));
         this.onChanged();
      }

      return this;
   }

   public BleDevice$PbBleDevice$Builder mergeLastModified(Types$PbSystemDateTime var1) {
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

   public BleDevice$PbBleDevice$Builder mergeMac(Structures$PbBleMac var1) {
      if (this.macBuilder_ == null) {
         if ((this.bitField0_ & 16) == 16 && this.mac_ != null && this.mac_ != Structures$PbBleMac.getDefaultInstance()) {
            this.mac_ = Structures$PbBleMac.newBuilder(this.mac_).mergeFrom(var1).buildPartial();
         } else {
            this.mac_ = var1;
         }

         this.onChanged();
      } else {
         this.macBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public BleDevice$PbBleDevice$Builder mergePaired(Types$PbSystemDateTime var1) {
      if (this.pairedBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.paired_ != null && this.paired_ != Types$PbSystemDateTime.getDefaultInstance()) {
            this.paired_ = Types$PbSystemDateTime.newBuilder(this.paired_).mergeFrom(var1).buildPartial();
         } else {
            this.paired_ = var1;
         }

         this.onChanged();
      } else {
         this.pairedBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public final BleDevice$PbBleDevice$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (BleDevice$PbBleDevice$Builder)super.mergeUnknownFields(var1);
   }

   public BleDevice$PbBleDevice$Builder removeServices(int var1) {
      if (this.servicesBuilder_ == null) {
         this.ensureServicesIsMutable();
         this.services_.remove(var1);
         this.onChanged();
      } else {
         this.servicesBuilder_.remove(var1);
      }

      return this;
   }

   public BleDevice$PbBleDevice$Builder removeSubComponentInfo(int var1) {
      if (this.subComponentInfoBuilder_ == null) {
         this.ensureSubComponentInfoIsMutable();
         this.subComponentInfo_.remove(var1);
         this.onChanged();
      } else {
         this.subComponentInfoBuilder_.remove(var1);
      }

      return this;
   }

   public BleDevice$PbBleDevice$Builder removeUserData(int var1) {
      if (this.userDataBuilder_ == null) {
         this.ensureUserDataIsMutable();
         this.userData_.remove(var1);
         this.onChanged();
      } else {
         this.userDataBuilder_.remove(var1);
      }

      return this;
   }

   public BleDevice$PbBleDevice$Builder setAuthenticated(boolean var1) {
      this.bitField0_ |= 524288;
      this.authenticated_ = var1;
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder setAvailableFeatures(int var1, Types$PbFeatureType var2) {
      if (var2 == null) {
         throw new NullPointerException();
      } else {
         this.ensureAvailableFeaturesIsMutable();
         this.availableFeatures_.set(var1, var2.getNumber());
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder setBatteryLevel(int var1) {
      this.bitField0_ |= 128;
      this.batteryLevel_ = var1;
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder setDeletedTimeStamp(Types$PbSystemDateTime$Builder var1) {
      if (this.deletedTimeStampBuilder_ == null) {
         this.deletedTimeStamp_ = var1.build();
         this.onChanged();
      } else {
         this.deletedTimeStampBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8;
      return this;
   }

   public BleDevice$PbBleDevice$Builder setDeletedTimeStamp(Types$PbSystemDateTime var1) {
      if (this.deletedTimeStampBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.deletedTimeStamp_ = var1;
         this.onChanged();
      } else {
         this.deletedTimeStampBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public BleDevice$PbBleDevice$Builder setDeviceAppearance(BleDevice$PbBleDevice$PbDeviceAppearance var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 268435456;
         this.deviceAppearance_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder setDeviceId(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 32;
         this.deviceId_ = var1;
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder setDeviceIdBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 32;
         this.deviceId_ = var1;
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder setDeviceVersion(Structures$PbVersion$Builder var1) {
      if (this.deviceVersionBuilder_ == null) {
         this.deviceVersion_ = var1.build();
         this.onChanged();
      } else {
         this.deviceVersionBuilder_.setMessage(var1.build());
      }

      this.bitField1_ |= 1;
      return this;
   }

   public BleDevice$PbBleDevice$Builder setDeviceVersion(Structures$PbVersion var1) {
      if (this.deviceVersionBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.deviceVersion_ = var1;
         this.onChanged();
      } else {
         this.deviceVersionBuilder_.setMessage(var1);
      }

      this.bitField1_ |= 1;
      return this;
   }

   public BleDevice$PbBleDevice$Builder setDistributedKeys(int var1) {
      this.bitField0_ |= 262144;
      this.distributedKeys_ = var1;
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder setEncrKeySize(int var1) {
      this.bitField0_ |= 131072;
      this.encrKeySize_ = var1;
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder setField(FieldDescriptor var1, Object var2) {
      return (BleDevice$PbBleDevice$Builder)super.setField(var1, var2);
   }

   public BleDevice$PbBleDevice$Builder setHardwareCode(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1073741824;
         this.hardwareCode_ = var1;
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder setHardwareCodeBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1073741824;
         this.hardwareCode_ = var1;
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder setLastModified(Types$PbSystemDateTime$Builder var1) {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = var1.build();
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public BleDevice$PbBleDevice$Builder setLastModified(Types$PbSystemDateTime var1) {
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

   public BleDevice$PbBleDevice$Builder setLocalEdiv(int var1) {
      this.bitField0_ |= 67108864;
      this.localEdiv_ = var1;
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder setLocalLtk(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 16777216;
         this.localLtk_ = var1;
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder setLocalRand(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 33554432;
         this.localRand_ = var1;
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder setMac(Structures$PbBleMac$Builder var1) {
      if (this.macBuilder_ == null) {
         this.mac_ = var1.build();
         this.onChanged();
      } else {
         this.macBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 16;
      return this;
   }

   public BleDevice$PbBleDevice$Builder setMac(Structures$PbBleMac var1) {
      if (this.macBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.mac_ = var1;
         this.onChanged();
      } else {
         this.macBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public BleDevice$PbBleDevice$Builder setManufacturer(BleDevice$PbDeviceManufacturerType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 4;
         this.manufacturer_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder setManufacturerName(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 256;
         this.manufacturerName_ = var1;
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder setManufacturerNameBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 256;
         this.manufacturerName_ = var1;
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder setModelName(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 512;
         this.modelName_ = var1;
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder setModelNameBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 512;
         this.modelName_ = var1;
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder setName(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 64;
         this.name_ = var1;
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder setNameBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 64;
         this.name_ = var1;
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder setOBSOLETEDeviceVersion(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2097152;
         this.oBSOLETEDeviceVersion_ = var1;
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder setOBSOLETEDeviceVersionBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2097152;
         this.oBSOLETEDeviceVersion_ = var1;
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder setPaired(Types$PbSystemDateTime$Builder var1) {
      if (this.pairedBuilder_ == null) {
         this.paired_ = var1.build();
         this.onChanged();
      } else {
         this.pairedBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public BleDevice$PbBleDevice$Builder setPaired(Types$PbSystemDateTime var1) {
      if (this.pairedBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.paired_ = var1;
         this.onChanged();
      } else {
         this.pairedBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public BleDevice$PbBleDevice$Builder setPartOfDistributedPowerSystem(boolean var1) {
      this.bitField0_ |= 536870912;
      this.partOfDistributedPowerSystem_ = var1;
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder setPeerCsrk(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 4096;
         this.peerCsrk_ = var1;
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder setPeerEdiv(int var1) {
      this.bitField0_ |= 65536;
      this.peerEdiv_ = var1;
      this.onChanged();
      return this;
   }

   public BleDevice$PbBleDevice$Builder setPeerIrk(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2048;
         this.peerIrk_ = var1;
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder setPeerLtk(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1024;
         this.peerLtk_ = var1;
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder setPeerRand(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 32768;
         this.peerRand_ = var1;
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (BleDevice$PbBleDevice$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public BleDevice$PbBleDevice$Builder setSecondarySoftwareVersion(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 4194304;
         this.secondarySoftwareVersion_ = var1;
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder setSecondarySoftwareVersionBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 4194304;
         this.secondarySoftwareVersion_ = var1;
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder setSensorLocation(BleDevice$PbBleDevice$PbSensorLocation var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1048576;
         this.sensorLocation_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder setSerialNumber(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 8388608;
         this.serialNumber_ = var1;
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder setSerialNumberBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 8388608;
         this.serialNumber_ = var1;
         this.onChanged();
         return this;
      }
   }

   public BleDevice$PbBleDevice$Builder setServices(int var1, Structures$PbBleService$Builder var2) {
      if (this.servicesBuilder_ == null) {
         this.ensureServicesIsMutable();
         this.services_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.servicesBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public BleDevice$PbBleDevice$Builder setServices(int var1, Structures$PbBleService var2) {
      if (this.servicesBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureServicesIsMutable();
         this.services_.set(var1, var2);
         this.onChanged();
      } else {
         this.servicesBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public BleDevice$PbBleDevice$Builder setSubComponentInfo(int var1, Structures$PbSubcomponentInfo$Builder var2) {
      if (this.subComponentInfoBuilder_ == null) {
         this.ensureSubComponentInfoIsMutable();
         this.subComponentInfo_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.subComponentInfoBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public BleDevice$PbBleDevice$Builder setSubComponentInfo(int var1, Structures$PbSubcomponentInfo var2) {
      if (this.subComponentInfoBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureSubComponentInfoIsMutable();
         this.subComponentInfo_.set(var1, var2);
         this.onChanged();
      } else {
         this.subComponentInfoBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public final BleDevice$PbBleDevice$Builder setUnknownFields(UnknownFieldSet var1) {
      return (BleDevice$PbBleDevice$Builder)super.setUnknownFields(var1);
   }

   public BleDevice$PbBleDevice$Builder setUserData(int var1, BleDevice$PbBleUser$Builder var2) {
      if (this.userDataBuilder_ == null) {
         this.ensureUserDataIsMutable();
         this.userData_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.userDataBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public BleDevice$PbBleDevice$Builder setUserData(int var1, BleDevice$PbBleUser var2) {
      if (this.userDataBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureUserDataIsMutable();
         this.userData_.set(var1, var2);
         this.onChanged();
      } else {
         this.userDataBuilder_.setMessage(var1, var2);
      }

      return this;
   }
}
