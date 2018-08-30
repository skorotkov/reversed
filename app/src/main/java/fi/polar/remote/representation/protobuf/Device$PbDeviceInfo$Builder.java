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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Device$PbDeviceInfo$Builder extends Builder implements Device$PbDeviceInfoOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 bootloaderVersionBuilder_;
   private Structures$PbVersion bootloaderVersion_;
   private Object deviceID_;
   private SingleFieldBuilderV3 deviceVersionBuilder_;
   private Structures$PbVersion deviceVersion_;
   private Object electricalSerialNumber_;
   private ByteString gitHash_;
   private Object hardwareCode_;
   private Object modelName_;
   private SingleFieldBuilderV3 platformVersionBuilder_;
   private Structures$PbVersion platformVersion_;
   private SingleFieldBuilderV3 polarmathsmartVersionBuilder_;
   private Structures$PbVersion polarmathsmartVersion_;
   private Object productColor_;
   private Object productDesign_;
   private RepeatedFieldBuilderV3 subComponentInfoBuilder_;
   private List subComponentInfo_;
   private int svnRev_;
   private Object systemId_;

   private Device$PbDeviceInfo$Builder() {
      this.bootloaderVersion_ = null;
      this.platformVersion_ = null;
      this.deviceVersion_ = null;
      this.electricalSerialNumber_ = "";
      this.deviceID_ = "";
      this.modelName_ = "";
      this.hardwareCode_ = "";
      this.productColor_ = "";
      this.productDesign_ = "";
      this.systemId_ = "";
      this.gitHash_ = ByteString.EMPTY;
      this.polarmathsmartVersion_ = null;
      this.subComponentInfo_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   private Device$PbDeviceInfo$Builder(BuilderParent var1) {
      super(var1);
      this.bootloaderVersion_ = null;
      this.platformVersion_ = null;
      this.deviceVersion_ = null;
      this.electricalSerialNumber_ = "";
      this.deviceID_ = "";
      this.modelName_ = "";
      this.hardwareCode_ = "";
      this.productColor_ = "";
      this.productDesign_ = "";
      this.systemId_ = "";
      this.gitHash_ = ByteString.EMPTY;
      this.polarmathsmartVersion_ = null;
      this.subComponentInfo_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Device$PbDeviceInfo$Builder(BuilderParent var1, Device$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Device$PbDeviceInfo$Builder(Device$1 var1) {
      this();
   }

   private void ensureSubComponentInfoIsMutable() {
      if ((this.bitField0_ & 8192) != 8192) {
         this.subComponentInfo_ = new ArrayList(this.subComponentInfo_);
         this.bitField0_ |= 8192;
      }

   }

   private SingleFieldBuilderV3 getBootloaderVersionFieldBuilder() {
      if (this.bootloaderVersionBuilder_ == null) {
         this.bootloaderVersionBuilder_ = new SingleFieldBuilderV3(this.getBootloaderVersion(), this.getParentForChildren(), this.isClean());
         this.bootloaderVersion_ = null;
      }

      return this.bootloaderVersionBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return Device.a();
   }

   private SingleFieldBuilderV3 getDeviceVersionFieldBuilder() {
      if (this.deviceVersionBuilder_ == null) {
         this.deviceVersionBuilder_ = new SingleFieldBuilderV3(this.getDeviceVersion(), this.getParentForChildren(), this.isClean());
         this.deviceVersion_ = null;
      }

      return this.deviceVersionBuilder_;
   }

   private SingleFieldBuilderV3 getPlatformVersionFieldBuilder() {
      if (this.platformVersionBuilder_ == null) {
         this.platformVersionBuilder_ = new SingleFieldBuilderV3(this.getPlatformVersion(), this.getParentForChildren(), this.isClean());
         this.platformVersion_ = null;
      }

      return this.platformVersionBuilder_;
   }

   private SingleFieldBuilderV3 getPolarmathsmartVersionFieldBuilder() {
      if (this.polarmathsmartVersionBuilder_ == null) {
         this.polarmathsmartVersionBuilder_ = new SingleFieldBuilderV3(this.getPolarmathsmartVersion(), this.getParentForChildren(), this.isClean());
         this.polarmathsmartVersion_ = null;
      }

      return this.polarmathsmartVersionBuilder_;
   }

   private RepeatedFieldBuilderV3 getSubComponentInfoFieldBuilder() {
      if (this.subComponentInfoBuilder_ == null) {
         List var1 = this.subComponentInfo_;
         boolean var2;
         if ((this.bitField0_ & 8192) == 8192) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.subComponentInfoBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.subComponentInfo_ = null;
      }

      return this.subComponentInfoBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (Device$PbDeviceInfo.b()) {
         this.getBootloaderVersionFieldBuilder();
         this.getPlatformVersionFieldBuilder();
         this.getDeviceVersionFieldBuilder();
         this.getPolarmathsmartVersionFieldBuilder();
         this.getSubComponentInfoFieldBuilder();
      }

   }

   public Device$PbDeviceInfo$Builder addAllSubComponentInfo(Iterable var1) {
      if (this.subComponentInfoBuilder_ == null) {
         this.ensureSubComponentInfoIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.subComponentInfo_);
         this.onChanged();
      } else {
         this.subComponentInfoBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public Device$PbDeviceInfo$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Device$PbDeviceInfo$Builder)super.addRepeatedField(var1, var2);
   }

   public Device$PbDeviceInfo$Builder addSubComponentInfo(int var1, Structures$PbSubcomponentInfo$Builder var2) {
      if (this.subComponentInfoBuilder_ == null) {
         this.ensureSubComponentInfoIsMutable();
         this.subComponentInfo_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.subComponentInfoBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public Device$PbDeviceInfo$Builder addSubComponentInfo(int var1, Structures$PbSubcomponentInfo var2) {
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

   public Device$PbDeviceInfo$Builder addSubComponentInfo(Structures$PbSubcomponentInfo$Builder var1) {
      if (this.subComponentInfoBuilder_ == null) {
         this.ensureSubComponentInfoIsMutable();
         this.subComponentInfo_.add(var1.build());
         this.onChanged();
      } else {
         this.subComponentInfoBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public Device$PbDeviceInfo$Builder addSubComponentInfo(Structures$PbSubcomponentInfo var1) {
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

   public Device$PbDeviceInfo build() {
      Device$PbDeviceInfo var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Device$PbDeviceInfo buildPartial() {
      Device$PbDeviceInfo var1 = new Device$PbDeviceInfo(this, (Device$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.bootloaderVersionBuilder_ == null) {
         Device$PbDeviceInfo.a(var1, this.bootloaderVersion_);
      } else {
         Device$PbDeviceInfo.a(var1, (Structures$PbVersion)this.bootloaderVersionBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.platformVersionBuilder_ == null) {
         Device$PbDeviceInfo.b(var1, this.platformVersion_);
      } else {
         Device$PbDeviceInfo.b(var1, (Structures$PbVersion)this.platformVersionBuilder_.build());
      }

      int var6 = var4;
      if ((var2 & 4) == 4) {
         var6 = var4 | 4;
      }

      if (this.deviceVersionBuilder_ == null) {
         Device$PbDeviceInfo.c(var1, this.deviceVersion_);
      } else {
         Device$PbDeviceInfo.c(var1, (Structures$PbVersion)this.deviceVersionBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 8) == 8) {
         var4 = var6 | 8;
      }

      Device$PbDeviceInfo.a(var1, this.svnRev_);
      var6 = var4;
      if ((var2 & 16) == 16) {
         var6 = var4 | 16;
      }

      Device$PbDeviceInfo.a(var1, this.electricalSerialNumber_);
      int var5 = var6;
      if ((var2 & 32) == 32) {
         var5 = var6 | 32;
      }

      Device$PbDeviceInfo.b(var1, this.deviceID_);
      var4 = var5;
      if ((var2 & 64) == 64) {
         var4 = var5 | 64;
      }

      Device$PbDeviceInfo.c(var1, this.modelName_);
      var6 = var4;
      if ((var2 & 128) == 128) {
         var6 = var4 | 128;
      }

      Device$PbDeviceInfo.d(var1, this.hardwareCode_);
      var4 = var6;
      if ((var2 & 256) == 256) {
         var4 = var6 | 256;
      }

      Device$PbDeviceInfo.e(var1, this.productColor_);
      var6 = var4;
      if ((var2 & 512) == 512) {
         var6 = var4 | 512;
      }

      Device$PbDeviceInfo.f(var1, this.productDesign_);
      var4 = var6;
      if ((var2 & 1024) == 1024) {
         var4 = var6 | 1024;
      }

      Device$PbDeviceInfo.g(var1, this.systemId_);
      var6 = var4;
      if ((var2 & 2048) == 2048) {
         var6 = var4 | 2048;
      }

      Device$PbDeviceInfo.a(var1, this.gitHash_);
      var4 = var6;
      if ((var2 & 4096) == 4096) {
         var4 = var6 | 4096;
      }

      if (this.polarmathsmartVersionBuilder_ == null) {
         Device$PbDeviceInfo.d(var1, this.polarmathsmartVersion_);
      } else {
         Device$PbDeviceInfo.d(var1, (Structures$PbVersion)this.polarmathsmartVersionBuilder_.build());
      }

      if (this.subComponentInfoBuilder_ == null) {
         if ((this.bitField0_ & 8192) == 8192) {
            this.subComponentInfo_ = Collections.unmodifiableList(this.subComponentInfo_);
            this.bitField0_ &= -8193;
         }

         Device$PbDeviceInfo.a(var1, this.subComponentInfo_);
      } else {
         Device$PbDeviceInfo.a(var1, this.subComponentInfoBuilder_.build());
      }

      Device$PbDeviceInfo.b(var1, var4);
      this.onBuilt();
      return var1;
   }

   public Device$PbDeviceInfo$Builder clear() {
      super.clear();
      if (this.bootloaderVersionBuilder_ == null) {
         this.bootloaderVersion_ = null;
      } else {
         this.bootloaderVersionBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.platformVersionBuilder_ == null) {
         this.platformVersion_ = null;
      } else {
         this.platformVersionBuilder_.clear();
      }

      this.bitField0_ &= -3;
      if (this.deviceVersionBuilder_ == null) {
         this.deviceVersion_ = null;
      } else {
         this.deviceVersionBuilder_.clear();
      }

      this.bitField0_ &= -5;
      this.svnRev_ = 0;
      this.bitField0_ &= -9;
      this.electricalSerialNumber_ = "";
      this.bitField0_ &= -17;
      this.deviceID_ = "";
      this.bitField0_ &= -33;
      this.modelName_ = "";
      this.bitField0_ &= -65;
      this.hardwareCode_ = "";
      this.bitField0_ &= -129;
      this.productColor_ = "";
      this.bitField0_ &= -257;
      this.productDesign_ = "";
      this.bitField0_ &= -513;
      this.systemId_ = "";
      this.bitField0_ &= -1025;
      this.gitHash_ = ByteString.EMPTY;
      this.bitField0_ &= -2049;
      if (this.polarmathsmartVersionBuilder_ == null) {
         this.polarmathsmartVersion_ = null;
      } else {
         this.polarmathsmartVersionBuilder_.clear();
      }

      this.bitField0_ &= -4097;
      if (this.subComponentInfoBuilder_ == null) {
         this.subComponentInfo_ = Collections.emptyList();
         this.bitField0_ &= -8193;
      } else {
         this.subComponentInfoBuilder_.clear();
      }

      return this;
   }

   public Device$PbDeviceInfo$Builder clearBootloaderVersion() {
      if (this.bootloaderVersionBuilder_ == null) {
         this.bootloaderVersion_ = null;
         this.onChanged();
      } else {
         this.bootloaderVersionBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public Device$PbDeviceInfo$Builder clearDeviceID() {
      this.bitField0_ &= -33;
      this.deviceID_ = Device$PbDeviceInfo.getDefaultInstance().getDeviceID();
      this.onChanged();
      return this;
   }

   public Device$PbDeviceInfo$Builder clearDeviceVersion() {
      if (this.deviceVersionBuilder_ == null) {
         this.deviceVersion_ = null;
         this.onChanged();
      } else {
         this.deviceVersionBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public Device$PbDeviceInfo$Builder clearElectricalSerialNumber() {
      this.bitField0_ &= -17;
      this.electricalSerialNumber_ = Device$PbDeviceInfo.getDefaultInstance().getElectricalSerialNumber();
      this.onChanged();
      return this;
   }

   public Device$PbDeviceInfo$Builder clearField(FieldDescriptor var1) {
      return (Device$PbDeviceInfo$Builder)super.clearField(var1);
   }

   public Device$PbDeviceInfo$Builder clearGitHash() {
      this.bitField0_ &= -2049;
      this.gitHash_ = Device$PbDeviceInfo.getDefaultInstance().getGitHash();
      this.onChanged();
      return this;
   }

   public Device$PbDeviceInfo$Builder clearHardwareCode() {
      this.bitField0_ &= -129;
      this.hardwareCode_ = Device$PbDeviceInfo.getDefaultInstance().getHardwareCode();
      this.onChanged();
      return this;
   }

   public Device$PbDeviceInfo$Builder clearModelName() {
      this.bitField0_ &= -65;
      this.modelName_ = Device$PbDeviceInfo.getDefaultInstance().getModelName();
      this.onChanged();
      return this;
   }

   public Device$PbDeviceInfo$Builder clearOneof(OneofDescriptor var1) {
      return (Device$PbDeviceInfo$Builder)super.clearOneof(var1);
   }

   public Device$PbDeviceInfo$Builder clearPlatformVersion() {
      if (this.platformVersionBuilder_ == null) {
         this.platformVersion_ = null;
         this.onChanged();
      } else {
         this.platformVersionBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public Device$PbDeviceInfo$Builder clearPolarmathsmartVersion() {
      if (this.polarmathsmartVersionBuilder_ == null) {
         this.polarmathsmartVersion_ = null;
         this.onChanged();
      } else {
         this.polarmathsmartVersionBuilder_.clear();
      }

      this.bitField0_ &= -4097;
      return this;
   }

   public Device$PbDeviceInfo$Builder clearProductColor() {
      this.bitField0_ &= -257;
      this.productColor_ = Device$PbDeviceInfo.getDefaultInstance().getProductColor();
      this.onChanged();
      return this;
   }

   public Device$PbDeviceInfo$Builder clearProductDesign() {
      this.bitField0_ &= -513;
      this.productDesign_ = Device$PbDeviceInfo.getDefaultInstance().getProductDesign();
      this.onChanged();
      return this;
   }

   public Device$PbDeviceInfo$Builder clearSubComponentInfo() {
      if (this.subComponentInfoBuilder_ == null) {
         this.subComponentInfo_ = Collections.emptyList();
         this.bitField0_ &= -8193;
         this.onChanged();
      } else {
         this.subComponentInfoBuilder_.clear();
      }

      return this;
   }

   public Device$PbDeviceInfo$Builder clearSvnRev() {
      this.bitField0_ &= -9;
      this.svnRev_ = 0;
      this.onChanged();
      return this;
   }

   public Device$PbDeviceInfo$Builder clearSystemId() {
      this.bitField0_ &= -1025;
      this.systemId_ = Device$PbDeviceInfo.getDefaultInstance().getSystemId();
      this.onChanged();
      return this;
   }

   public Device$PbDeviceInfo$Builder clone() {
      return (Device$PbDeviceInfo$Builder)super.clone();
   }

   public Structures$PbVersion getBootloaderVersion() {
      Structures$PbVersion var1;
      if (this.bootloaderVersionBuilder_ == null) {
         if (this.bootloaderVersion_ == null) {
            var1 = Structures$PbVersion.getDefaultInstance();
         } else {
            var1 = this.bootloaderVersion_;
         }
      } else {
         var1 = (Structures$PbVersion)this.bootloaderVersionBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbVersion$Builder getBootloaderVersionBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Structures$PbVersion$Builder)this.getBootloaderVersionFieldBuilder().getBuilder();
   }

   public Structures$PbVersionOrBuilder getBootloaderVersionOrBuilder() {
      Object var1;
      if (this.bootloaderVersionBuilder_ != null) {
         var1 = (Structures$PbVersionOrBuilder)this.bootloaderVersionBuilder_.getMessageOrBuilder();
      } else if (this.bootloaderVersion_ == null) {
         var1 = Structures$PbVersion.getDefaultInstance();
      } else {
         var1 = this.bootloaderVersion_;
      }

      return (Structures$PbVersionOrBuilder)var1;
   }

   public Device$PbDeviceInfo getDefaultInstanceForType() {
      return Device$PbDeviceInfo.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Device.a();
   }

   public String getDeviceID() {
      Object var1 = this.deviceID_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.deviceID_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getDeviceIDBytes() {
      Object var1 = this.deviceID_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.deviceID_ = var2;
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
      this.bitField0_ |= 4;
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

   public String getElectricalSerialNumber() {
      Object var1 = this.electricalSerialNumber_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.electricalSerialNumber_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getElectricalSerialNumberBytes() {
      Object var1 = this.electricalSerialNumber_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.electricalSerialNumber_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public ByteString getGitHash() {
      return this.gitHash_;
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

   public Structures$PbVersion getPlatformVersion() {
      Structures$PbVersion var1;
      if (this.platformVersionBuilder_ == null) {
         if (this.platformVersion_ == null) {
            var1 = Structures$PbVersion.getDefaultInstance();
         } else {
            var1 = this.platformVersion_;
         }
      } else {
         var1 = (Structures$PbVersion)this.platformVersionBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbVersion$Builder getPlatformVersionBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Structures$PbVersion$Builder)this.getPlatformVersionFieldBuilder().getBuilder();
   }

   public Structures$PbVersionOrBuilder getPlatformVersionOrBuilder() {
      Object var1;
      if (this.platformVersionBuilder_ != null) {
         var1 = (Structures$PbVersionOrBuilder)this.platformVersionBuilder_.getMessageOrBuilder();
      } else if (this.platformVersion_ == null) {
         var1 = Structures$PbVersion.getDefaultInstance();
      } else {
         var1 = this.platformVersion_;
      }

      return (Structures$PbVersionOrBuilder)var1;
   }

   public Structures$PbVersion getPolarmathsmartVersion() {
      Structures$PbVersion var1;
      if (this.polarmathsmartVersionBuilder_ == null) {
         if (this.polarmathsmartVersion_ == null) {
            var1 = Structures$PbVersion.getDefaultInstance();
         } else {
            var1 = this.polarmathsmartVersion_;
         }
      } else {
         var1 = (Structures$PbVersion)this.polarmathsmartVersionBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbVersion$Builder getPolarmathsmartVersionBuilder() {
      this.bitField0_ |= 4096;
      this.onChanged();
      return (Structures$PbVersion$Builder)this.getPolarmathsmartVersionFieldBuilder().getBuilder();
   }

   public Structures$PbVersionOrBuilder getPolarmathsmartVersionOrBuilder() {
      Object var1;
      if (this.polarmathsmartVersionBuilder_ != null) {
         var1 = (Structures$PbVersionOrBuilder)this.polarmathsmartVersionBuilder_.getMessageOrBuilder();
      } else if (this.polarmathsmartVersion_ == null) {
         var1 = Structures$PbVersion.getDefaultInstance();
      } else {
         var1 = this.polarmathsmartVersion_;
      }

      return (Structures$PbVersionOrBuilder)var1;
   }

   public String getProductColor() {
      Object var1 = this.productColor_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.productColor_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getProductColorBytes() {
      Object var1 = this.productColor_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.productColor_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public String getProductDesign() {
      Object var1 = this.productDesign_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.productDesign_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getProductDesignBytes() {
      Object var1 = this.productDesign_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.productDesign_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
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

   public int getSvnRev() {
      return this.svnRev_;
   }

   public String getSystemId() {
      Object var1 = this.systemId_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.systemId_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getSystemIdBytes() {
      Object var1 = this.systemId_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.systemId_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public boolean hasBootloaderVersion() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDeviceID() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDeviceVersion() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasElectricalSerialNumber() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasGitHash() {
      boolean var1;
      if ((this.bitField0_ & 2048) == 2048) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasHardwareCode() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasModelName() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPlatformVersion() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPolarmathsmartVersion() {
      boolean var1;
      if ((this.bitField0_ & 4096) == 4096) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasProductColor() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasProductDesign() {
      boolean var1;
      if ((this.bitField0_ & 512) == 512) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSvnRev() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSystemId() {
      boolean var1;
      if ((this.bitField0_ & 1024) == 1024) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Device.b().ensureFieldAccessorsInitialized(Device$PbDeviceInfo.class, Device$PbDeviceInfo$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (this.hasBootloaderVersion() && !this.getBootloaderVersion().isInitialized()) {
         var2 = var1;
      } else {
         if (this.hasPlatformVersion()) {
            var2 = var1;
            if (!this.getPlatformVersion().isInitialized()) {
               return var2;
            }
         }

         if (this.hasDeviceVersion()) {
            var2 = var1;
            if (!this.getDeviceVersion().isInitialized()) {
               return var2;
            }
         }

         if (this.hasPolarmathsmartVersion()) {
            var2 = var1;
            if (!this.getPolarmathsmartVersion().isInitialized()) {
               return var2;
            }
         }

         int var3 = 0;

         while(true) {
            if (var3 >= this.getSubComponentInfoCount()) {
               var2 = true;
               break;
            }

            var2 = var1;
            if (!this.getSubComponentInfo(var3).isInitialized()) {
               break;
            }

            ++var3;
         }
      }

      return var2;
   }

   public Device$PbDeviceInfo$Builder mergeBootloaderVersion(Structures$PbVersion var1) {
      if (this.bootloaderVersionBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.bootloaderVersion_ != null && this.bootloaderVersion_ != Structures$PbVersion.getDefaultInstance()) {
            this.bootloaderVersion_ = Structures$PbVersion.newBuilder(this.bootloaderVersion_).mergeFrom(var1).buildPartial();
         } else {
            this.bootloaderVersion_ = var1;
         }

         this.onChanged();
      } else {
         this.bootloaderVersionBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Device$PbDeviceInfo$Builder mergeDeviceVersion(Structures$PbVersion var1) {
      if (this.deviceVersionBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.deviceVersion_ != null && this.deviceVersion_ != Structures$PbVersion.getDefaultInstance()) {
            this.deviceVersion_ = Structures$PbVersion.newBuilder(this.deviceVersion_).mergeFrom(var1).buildPartial();
         } else {
            this.deviceVersion_ = var1;
         }

         this.onChanged();
      } else {
         this.deviceVersionBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public Device$PbDeviceInfo$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Device$PbDeviceInfo var13;
      label96: {
         InvalidProtocolBufferException var12;
         Device$PbDeviceInfo var14;
         try {
            var13 = (Device$PbDeviceInfo)Device$PbDeviceInfo.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Device$PbDeviceInfo)var10.getUnfinishedMessage();
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

   public Device$PbDeviceInfo$Builder mergeFrom(Message var1) {
      Device$PbDeviceInfo$Builder var2;
      if (var1 instanceof Device$PbDeviceInfo) {
         var2 = this.mergeFrom((Device$PbDeviceInfo)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Device$PbDeviceInfo$Builder mergeFrom(Device$PbDeviceInfo var1) {
      RepeatedFieldBuilderV3 var2 = null;
      if (var1 != Device$PbDeviceInfo.getDefaultInstance()) {
         if (var1.hasBootloaderVersion()) {
            this.mergeBootloaderVersion(var1.getBootloaderVersion());
         }

         if (var1.hasPlatformVersion()) {
            this.mergePlatformVersion(var1.getPlatformVersion());
         }

         if (var1.hasDeviceVersion()) {
            this.mergeDeviceVersion(var1.getDeviceVersion());
         }

         if (var1.hasSvnRev()) {
            this.setSvnRev(var1.getSvnRev());
         }

         if (var1.hasElectricalSerialNumber()) {
            this.bitField0_ |= 16;
            this.electricalSerialNumber_ = Device$PbDeviceInfo.a(var1);
            this.onChanged();
         }

         if (var1.hasDeviceID()) {
            this.bitField0_ |= 32;
            this.deviceID_ = Device$PbDeviceInfo.b(var1);
            this.onChanged();
         }

         if (var1.hasModelName()) {
            this.bitField0_ |= 64;
            this.modelName_ = Device$PbDeviceInfo.c(var1);
            this.onChanged();
         }

         if (var1.hasHardwareCode()) {
            this.bitField0_ |= 128;
            this.hardwareCode_ = Device$PbDeviceInfo.d(var1);
            this.onChanged();
         }

         if (var1.hasProductColor()) {
            this.bitField0_ |= 256;
            this.productColor_ = Device$PbDeviceInfo.e(var1);
            this.onChanged();
         }

         if (var1.hasProductDesign()) {
            this.bitField0_ |= 512;
            this.productDesign_ = Device$PbDeviceInfo.f(var1);
            this.onChanged();
         }

         if (var1.hasSystemId()) {
            this.bitField0_ |= 1024;
            this.systemId_ = Device$PbDeviceInfo.g(var1);
            this.onChanged();
         }

         if (var1.hasGitHash()) {
            this.setGitHash(var1.getGitHash());
         }

         if (var1.hasPolarmathsmartVersion()) {
            this.mergePolarmathsmartVersion(var1.getPolarmathsmartVersion());
         }

         if (this.subComponentInfoBuilder_ == null) {
            if (!Device$PbDeviceInfo.h(var1).isEmpty()) {
               if (this.subComponentInfo_.isEmpty()) {
                  this.subComponentInfo_ = Device$PbDeviceInfo.h(var1);
                  this.bitField0_ &= -8193;
               } else {
                  this.ensureSubComponentInfoIsMutable();
                  this.subComponentInfo_.addAll(Device$PbDeviceInfo.h(var1));
               }

               this.onChanged();
            }
         } else if (!Device$PbDeviceInfo.h(var1).isEmpty()) {
            if (this.subComponentInfoBuilder_.isEmpty()) {
               this.subComponentInfoBuilder_.dispose();
               this.subComponentInfoBuilder_ = null;
               this.subComponentInfo_ = Device$PbDeviceInfo.h(var1);
               this.bitField0_ &= -8193;
               if (Device$PbDeviceInfo.c()) {
                  var2 = this.getSubComponentInfoFieldBuilder();
               }

               this.subComponentInfoBuilder_ = var2;
            } else {
               this.subComponentInfoBuilder_.addAllMessages(Device$PbDeviceInfo.h(var1));
            }
         }

         this.mergeUnknownFields(Device$PbDeviceInfo.i(var1));
         this.onChanged();
      }

      return this;
   }

   public Device$PbDeviceInfo$Builder mergePlatformVersion(Structures$PbVersion var1) {
      if (this.platformVersionBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.platformVersion_ != null && this.platformVersion_ != Structures$PbVersion.getDefaultInstance()) {
            this.platformVersion_ = Structures$PbVersion.newBuilder(this.platformVersion_).mergeFrom(var1).buildPartial();
         } else {
            this.platformVersion_ = var1;
         }

         this.onChanged();
      } else {
         this.platformVersionBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Device$PbDeviceInfo$Builder mergePolarmathsmartVersion(Structures$PbVersion var1) {
      if (this.polarmathsmartVersionBuilder_ == null) {
         if ((this.bitField0_ & 4096) == 4096 && this.polarmathsmartVersion_ != null && this.polarmathsmartVersion_ != Structures$PbVersion.getDefaultInstance()) {
            this.polarmathsmartVersion_ = Structures$PbVersion.newBuilder(this.polarmathsmartVersion_).mergeFrom(var1).buildPartial();
         } else {
            this.polarmathsmartVersion_ = var1;
         }

         this.onChanged();
      } else {
         this.polarmathsmartVersionBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4096;
      return this;
   }

   public final Device$PbDeviceInfo$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Device$PbDeviceInfo$Builder)super.mergeUnknownFields(var1);
   }

   public Device$PbDeviceInfo$Builder removeSubComponentInfo(int var1) {
      if (this.subComponentInfoBuilder_ == null) {
         this.ensureSubComponentInfoIsMutable();
         this.subComponentInfo_.remove(var1);
         this.onChanged();
      } else {
         this.subComponentInfoBuilder_.remove(var1);
      }

      return this;
   }

   public Device$PbDeviceInfo$Builder setBootloaderVersion(Structures$PbVersion$Builder var1) {
      if (this.bootloaderVersionBuilder_ == null) {
         this.bootloaderVersion_ = var1.build();
         this.onChanged();
      } else {
         this.bootloaderVersionBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Device$PbDeviceInfo$Builder setBootloaderVersion(Structures$PbVersion var1) {
      if (this.bootloaderVersionBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bootloaderVersion_ = var1;
         this.onChanged();
      } else {
         this.bootloaderVersionBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Device$PbDeviceInfo$Builder setDeviceID(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 32;
         this.deviceID_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Device$PbDeviceInfo$Builder setDeviceIDBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 32;
         this.deviceID_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Device$PbDeviceInfo$Builder setDeviceVersion(Structures$PbVersion$Builder var1) {
      if (this.deviceVersionBuilder_ == null) {
         this.deviceVersion_ = var1.build();
         this.onChanged();
      } else {
         this.deviceVersionBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public Device$PbDeviceInfo$Builder setDeviceVersion(Structures$PbVersion var1) {
      if (this.deviceVersionBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.deviceVersion_ = var1;
         this.onChanged();
      } else {
         this.deviceVersionBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public Device$PbDeviceInfo$Builder setElectricalSerialNumber(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 16;
         this.electricalSerialNumber_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Device$PbDeviceInfo$Builder setElectricalSerialNumberBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 16;
         this.electricalSerialNumber_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Device$PbDeviceInfo$Builder setField(FieldDescriptor var1, Object var2) {
      return (Device$PbDeviceInfo$Builder)super.setField(var1, var2);
   }

   public Device$PbDeviceInfo$Builder setGitHash(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2048;
         this.gitHash_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Device$PbDeviceInfo$Builder setHardwareCode(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 128;
         this.hardwareCode_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Device$PbDeviceInfo$Builder setHardwareCodeBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 128;
         this.hardwareCode_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Device$PbDeviceInfo$Builder setModelName(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 64;
         this.modelName_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Device$PbDeviceInfo$Builder setModelNameBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 64;
         this.modelName_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Device$PbDeviceInfo$Builder setPlatformVersion(Structures$PbVersion$Builder var1) {
      if (this.platformVersionBuilder_ == null) {
         this.platformVersion_ = var1.build();
         this.onChanged();
      } else {
         this.platformVersionBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Device$PbDeviceInfo$Builder setPlatformVersion(Structures$PbVersion var1) {
      if (this.platformVersionBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.platformVersion_ = var1;
         this.onChanged();
      } else {
         this.platformVersionBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Device$PbDeviceInfo$Builder setPolarmathsmartVersion(Structures$PbVersion$Builder var1) {
      if (this.polarmathsmartVersionBuilder_ == null) {
         this.polarmathsmartVersion_ = var1.build();
         this.onChanged();
      } else {
         this.polarmathsmartVersionBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4096;
      return this;
   }

   public Device$PbDeviceInfo$Builder setPolarmathsmartVersion(Structures$PbVersion var1) {
      if (this.polarmathsmartVersionBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.polarmathsmartVersion_ = var1;
         this.onChanged();
      } else {
         this.polarmathsmartVersionBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4096;
      return this;
   }

   public Device$PbDeviceInfo$Builder setProductColor(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 256;
         this.productColor_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Device$PbDeviceInfo$Builder setProductColorBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 256;
         this.productColor_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Device$PbDeviceInfo$Builder setProductDesign(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 512;
         this.productDesign_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Device$PbDeviceInfo$Builder setProductDesignBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 512;
         this.productDesign_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Device$PbDeviceInfo$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Device$PbDeviceInfo$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Device$PbDeviceInfo$Builder setSubComponentInfo(int var1, Structures$PbSubcomponentInfo$Builder var2) {
      if (this.subComponentInfoBuilder_ == null) {
         this.ensureSubComponentInfoIsMutable();
         this.subComponentInfo_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.subComponentInfoBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public Device$PbDeviceInfo$Builder setSubComponentInfo(int var1, Structures$PbSubcomponentInfo var2) {
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

   public Device$PbDeviceInfo$Builder setSvnRev(int var1) {
      this.bitField0_ |= 8;
      this.svnRev_ = var1;
      this.onChanged();
      return this;
   }

   public Device$PbDeviceInfo$Builder setSystemId(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1024;
         this.systemId_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Device$PbDeviceInfo$Builder setSystemIdBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1024;
         this.systemId_ = var1;
         this.onChanged();
         return this;
      }
   }

   public final Device$PbDeviceInfo$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Device$PbDeviceInfo$Builder)super.setUnknownFields(var1);
   }
}
