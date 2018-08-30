package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class Device$PbDeviceInfo extends GeneratedMessageV3 implements Device$PbDeviceInfoOrBuilder {
   public static final int BOOTLOADER_VERSION_FIELD_NUMBER = 1;
   private static final Device$PbDeviceInfo DEFAULT_INSTANCE = new Device$PbDeviceInfo();
   public static final int DEVICEID_FIELD_NUMBER = 6;
   public static final int DEVICE_VERSION_FIELD_NUMBER = 3;
   public static final int ELECTRICAL_SERIAL_NUMBER_FIELD_NUMBER = 5;
   public static final int GIT_HASH_FIELD_NUMBER = 12;
   public static final int HARDWARE_CODE_FIELD_NUMBER = 8;
   public static final int MODEL_NAME_FIELD_NUMBER = 7;
   @Deprecated
   public static final Parser PARSER = new Device$PbDeviceInfo$1();
   public static final int PLATFORM_VERSION_FIELD_NUMBER = 2;
   public static final int POLARMATHSMART_VERSION_FIELD_NUMBER = 13;
   public static final int PRODUCT_COLOR_FIELD_NUMBER = 9;
   public static final int PRODUCT_DESIGN_FIELD_NUMBER = 10;
   public static final int SUB_COMPONENT_INFO_FIELD_NUMBER = 14;
   public static final int SVN_REV_FIELD_NUMBER = 4;
   public static final int SYSTEM_ID_FIELD_NUMBER = 11;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private Structures$PbVersion bootloaderVersion_;
   private volatile Object deviceID_;
   private Structures$PbVersion deviceVersion_;
   private volatile Object electricalSerialNumber_;
   private ByteString gitHash_;
   private volatile Object hardwareCode_;
   private byte memoizedIsInitialized;
   private volatile Object modelName_;
   private Structures$PbVersion platformVersion_;
   private Structures$PbVersion polarmathsmartVersion_;
   private volatile Object productColor_;
   private volatile Object productDesign_;
   private List subComponentInfo_;
   private int svnRev_;
   private volatile Object systemId_;

   private Device$PbDeviceInfo() {
      this.memoizedIsInitialized = (byte)-1;
      this.svnRev_ = 0;
      this.electricalSerialNumber_ = "";
      this.deviceID_ = "";
      this.modelName_ = "";
      this.hardwareCode_ = "";
      this.productColor_ = "";
      this.productDesign_ = "";
      this.systemId_ = "";
      this.gitHash_ = ByteString.EMPTY;
      this.subComponentInfo_ = Collections.emptyList();
   }

   private Device$PbDeviceInfo(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Device$PbDeviceInfo(CodedInputStream var1, ExtensionRegistryLite var2, Device$1 var3) {
      this(var1, var2);
   }

   private Device$PbDeviceInfo(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Device$PbDeviceInfo(Builder var1, Device$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Device$PbDeviceInfo var0, int var1) {
      var0.svnRev_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ByteString a(Device$PbDeviceInfo var0, ByteString var1) {
      var0.gitHash_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbVersion a(Device$PbDeviceInfo var0, Structures$PbVersion var1) {
      var0.bootloaderVersion_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object a(Device$PbDeviceInfo var0) {
      return var0.electricalSerialNumber_;
   }

   // $FF: synthetic method
   static Object a(Device$PbDeviceInfo var0, Object var1) {
      var0.electricalSerialNumber_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List a(Device$PbDeviceInfo var0, List var1) {
      var0.subComponentInfo_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(Device$PbDeviceInfo var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbVersion b(Device$PbDeviceInfo var0, Structures$PbVersion var1) {
      var0.platformVersion_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object b(Device$PbDeviceInfo var0) {
      return var0.deviceID_;
   }

   // $FF: synthetic method
   static Object b(Device$PbDeviceInfo var0, Object var1) {
      var0.deviceID_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static Structures$PbVersion c(Device$PbDeviceInfo var0, Structures$PbVersion var1) {
      var0.deviceVersion_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object c(Device$PbDeviceInfo var0) {
      return var0.modelName_;
   }

   // $FF: synthetic method
   static Object c(Device$PbDeviceInfo var0, Object var1) {
      var0.modelName_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean c() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static Structures$PbVersion d(Device$PbDeviceInfo var0, Structures$PbVersion var1) {
      var0.polarmathsmartVersion_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object d(Device$PbDeviceInfo var0) {
      return var0.hardwareCode_;
   }

   // $FF: synthetic method
   static Object d(Device$PbDeviceInfo var0, Object var1) {
      var0.hardwareCode_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object e(Device$PbDeviceInfo var0) {
      return var0.productColor_;
   }

   // $FF: synthetic method
   static Object e(Device$PbDeviceInfo var0, Object var1) {
      var0.productColor_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object f(Device$PbDeviceInfo var0) {
      return var0.productDesign_;
   }

   // $FF: synthetic method
   static Object f(Device$PbDeviceInfo var0, Object var1) {
      var0.productDesign_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object g(Device$PbDeviceInfo var0) {
      return var0.systemId_;
   }

   // $FF: synthetic method
   static Object g(Device$PbDeviceInfo var0, Object var1) {
      var0.systemId_ = var1;
      return var1;
   }

   public static Device$PbDeviceInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Device.a();
   }

   // $FF: synthetic method
   static List h(Device$PbDeviceInfo var0) {
      return var0.subComponentInfo_;
   }

   // $FF: synthetic method
   static UnknownFieldSet i(Device$PbDeviceInfo var0) {
      return var0.unknownFields;
   }

   public static Device$PbDeviceInfo$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Device$PbDeviceInfo$Builder newBuilder(Device$PbDeviceInfo var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Device$PbDeviceInfo parseDelimitedFrom(InputStream var0) {
      return (Device$PbDeviceInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Device$PbDeviceInfo parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Device$PbDeviceInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Device$PbDeviceInfo parseFrom(ByteString var0) {
      return (Device$PbDeviceInfo)PARSER.parseFrom(var0);
   }

   public static Device$PbDeviceInfo parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Device$PbDeviceInfo)PARSER.parseFrom(var0, var1);
   }

   public static Device$PbDeviceInfo parseFrom(CodedInputStream var0) {
      return (Device$PbDeviceInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Device$PbDeviceInfo parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Device$PbDeviceInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Device$PbDeviceInfo parseFrom(InputStream var0) {
      return (Device$PbDeviceInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Device$PbDeviceInfo parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Device$PbDeviceInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Device$PbDeviceInfo parseFrom(byte[] var0) {
      return (Device$PbDeviceInfo)PARSER.parseFrom(var0);
   }

   public static Device$PbDeviceInfo parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Device$PbDeviceInfo)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Device$PbDeviceInfo)) {
            var2 = super.equals(var1);
         } else {
            Device$PbDeviceInfo var5 = (Device$PbDeviceInfo)var1;
            boolean var3;
            if (this.hasBootloaderVersion() == var5.hasBootloaderVersion()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasBootloaderVersion()) {
               if (var3 && this.getBootloaderVersion().equals(var5.getBootloaderVersion())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasPlatformVersion() == var5.hasPlatformVersion()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasPlatformVersion()) {
               if (var3 && this.getPlatformVersion().equals(var5.getPlatformVersion())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasDeviceVersion() == var5.hasDeviceVersion()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasDeviceVersion()) {
               if (var4 && this.getDeviceVersion().equals(var5.getDeviceVersion())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasSvnRev() == var5.hasSvnRev()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSvnRev()) {
               if (var3 && this.getSvnRev() == var5.getSvnRev()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasElectricalSerialNumber() == var5.hasElectricalSerialNumber()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasElectricalSerialNumber()) {
               if (var4 && this.getElectricalSerialNumber().equals(var5.getElectricalSerialNumber())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasDeviceID() == var5.hasDeviceID()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasDeviceID()) {
               if (var3 && this.getDeviceID().equals(var5.getDeviceID())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasModelName() == var5.hasModelName()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasModelName()) {
               if (var3 && this.getModelName().equals(var5.getModelName())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasHardwareCode() == var5.hasHardwareCode()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasHardwareCode()) {
               if (var4 && this.getHardwareCode().equals(var5.getHardwareCode())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasProductColor() == var5.hasProductColor()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasProductColor()) {
               if (var4 && this.getProductColor().equals(var5.getProductColor())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasProductDesign() == var5.hasProductDesign()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasProductDesign()) {
               if (var4 && this.getProductDesign().equals(var5.getProductDesign())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasSystemId() == var5.hasSystemId()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSystemId()) {
               if (var4 && this.getSystemId().equals(var5.getSystemId())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasGitHash() == var5.hasGitHash()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasGitHash()) {
               if (var3 && this.getGitHash().equals(var5.getGitHash())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasPolarmathsmartVersion() == var5.hasPolarmathsmartVersion()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasPolarmathsmartVersion()) {
               if (var3 && this.getPolarmathsmartVersion().equals(var5.getPolarmathsmartVersion())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.getSubComponentInfoList().equals(var5.getSubComponentInfoList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (!var3 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public Structures$PbVersion getBootloaderVersion() {
      Structures$PbVersion var1;
      if (this.bootloaderVersion_ == null) {
         var1 = Structures$PbVersion.getDefaultInstance();
      } else {
         var1 = this.bootloaderVersion_;
      }

      return var1;
   }

   public Structures$PbVersionOrBuilder getBootloaderVersionOrBuilder() {
      Structures$PbVersion var1;
      if (this.bootloaderVersion_ == null) {
         var1 = Structures$PbVersion.getDefaultInstance();
      } else {
         var1 = this.bootloaderVersion_;
      }

      return var1;
   }

   public Device$PbDeviceInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public String getDeviceID() {
      Object var1 = this.deviceID_;
      String var3;
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.deviceID_ = var3;
         }
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
      if (this.deviceVersion_ == null) {
         var1 = Structures$PbVersion.getDefaultInstance();
      } else {
         var1 = this.deviceVersion_;
      }

      return var1;
   }

   public Structures$PbVersionOrBuilder getDeviceVersionOrBuilder() {
      Structures$PbVersion var1;
      if (this.deviceVersion_ == null) {
         var1 = Structures$PbVersion.getDefaultInstance();
      } else {
         var1 = this.deviceVersion_;
      }

      return var1;
   }

   public String getElectricalSerialNumber() {
      Object var1 = this.electricalSerialNumber_;
      String var3;
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.electricalSerialNumber_ = var3;
         }
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
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.hardwareCode_ = var3;
         }
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
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.modelName_ = var3;
         }
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

   public Parser getParserForType() {
      return PARSER;
   }

   public Structures$PbVersion getPlatformVersion() {
      Structures$PbVersion var1;
      if (this.platformVersion_ == null) {
         var1 = Structures$PbVersion.getDefaultInstance();
      } else {
         var1 = this.platformVersion_;
      }

      return var1;
   }

   public Structures$PbVersionOrBuilder getPlatformVersionOrBuilder() {
      Structures$PbVersion var1;
      if (this.platformVersion_ == null) {
         var1 = Structures$PbVersion.getDefaultInstance();
      } else {
         var1 = this.platformVersion_;
      }

      return var1;
   }

   public Structures$PbVersion getPolarmathsmartVersion() {
      Structures$PbVersion var1;
      if (this.polarmathsmartVersion_ == null) {
         var1 = Structures$PbVersion.getDefaultInstance();
      } else {
         var1 = this.polarmathsmartVersion_;
      }

      return var1;
   }

   public Structures$PbVersionOrBuilder getPolarmathsmartVersionOrBuilder() {
      Structures$PbVersion var1;
      if (this.polarmathsmartVersion_ == null) {
         var1 = Structures$PbVersion.getDefaultInstance();
      } else {
         var1 = this.polarmathsmartVersion_;
      }

      return var1;
   }

   public String getProductColor() {
      Object var1 = this.productColor_;
      String var3;
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.productColor_ = var3;
         }
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
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.productDesign_ = var3;
         }
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

   public int getSerializedSize() {
      byte var1 = 0;
      int var2 = this.memoizedSize;
      if (var2 == -1) {
         if ((this.bitField0_ & 1) == 1) {
            var2 = CodedOutputStream.computeMessageSize(1, this.getBootloaderVersion()) + 0;
         } else {
            var2 = 0;
         }

         int var3 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var3 = var2 + CodedOutputStream.computeMessageSize(2, this.getPlatformVersion());
         }

         var2 = var3;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var3 + CodedOutputStream.computeMessageSize(3, this.getDeviceVersion());
         }

         var3 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var3 = var2 + CodedOutputStream.computeUInt32Size(4, this.svnRev_);
         }

         int var4 = var3;
         if ((this.bitField0_ & 16) == 16) {
            var4 = var3 + GeneratedMessageV3.computeStringSize(5, this.electricalSerialNumber_);
         }

         var2 = var4;
         if ((this.bitField0_ & 32) == 32) {
            var2 = var4 + GeneratedMessageV3.computeStringSize(6, this.deviceID_);
         }

         var3 = var2;
         if ((this.bitField0_ & 64) == 64) {
            var3 = var2 + GeneratedMessageV3.computeStringSize(7, this.modelName_);
         }

         var2 = var3;
         if ((this.bitField0_ & 128) == 128) {
            var2 = var3 + GeneratedMessageV3.computeStringSize(8, this.hardwareCode_);
         }

         var3 = var2;
         if ((this.bitField0_ & 256) == 256) {
            var3 = var2 + GeneratedMessageV3.computeStringSize(9, this.productColor_);
         }

         var2 = var3;
         if ((this.bitField0_ & 512) == 512) {
            var2 = var3 + GeneratedMessageV3.computeStringSize(10, this.productDesign_);
         }

         var3 = var2;
         if ((this.bitField0_ & 1024) == 1024) {
            var3 = var2 + GeneratedMessageV3.computeStringSize(11, this.systemId_);
         }

         var2 = var3;
         if ((this.bitField0_ & 2048) == 2048) {
            var2 = var3 + CodedOutputStream.computeBytesSize(12, this.gitHash_);
         }

         var3 = var2;
         if ((this.bitField0_ & 4096) == 4096) {
            var3 = var2 + CodedOutputStream.computeMessageSize(13, this.getPolarmathsmartVersion());
         }

         var2 = var3;

         for(var3 = var1; var3 < this.subComponentInfo_.size(); var2 += var4) {
            var4 = CodedOutputStream.computeMessageSize(14, (MessageLite)this.subComponentInfo_.get(var3));
            ++var3;
         }

         var2 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var2;
      }

      return var2;
   }

   public Structures$PbSubcomponentInfo getSubComponentInfo(int var1) {
      return (Structures$PbSubcomponentInfo)this.subComponentInfo_.get(var1);
   }

   public int getSubComponentInfoCount() {
      return this.subComponentInfo_.size();
   }

   public List getSubComponentInfoList() {
      return this.subComponentInfo_;
   }

   public Structures$PbSubcomponentInfoOrBuilder getSubComponentInfoOrBuilder(int var1) {
      return (Structures$PbSubcomponentInfoOrBuilder)this.subComponentInfo_.get(var1);
   }

   public List getSubComponentInfoOrBuilderList() {
      return this.subComponentInfo_;
   }

   public int getSvnRev() {
      return this.svnRev_;
   }

   public String getSystemId() {
      Object var1 = this.systemId_;
      String var3;
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.systemId_ = var3;
         }
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

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
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

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.hasBootloaderVersion()) {
            var1 = (var2 * 37 + 1) * 53 + this.getBootloaderVersion().hashCode();
         }

         var2 = var1;
         if (this.hasPlatformVersion()) {
            var2 = (var1 * 37 + 2) * 53 + this.getPlatformVersion().hashCode();
         }

         int var3 = var2;
         if (this.hasDeviceVersion()) {
            var3 = (var2 * 37 + 3) * 53 + this.getDeviceVersion().hashCode();
         }

         var1 = var3;
         if (this.hasSvnRev()) {
            var1 = (var3 * 37 + 4) * 53 + this.getSvnRev();
         }

         var2 = var1;
         if (this.hasElectricalSerialNumber()) {
            var2 = (var1 * 37 + 5) * 53 + this.getElectricalSerialNumber().hashCode();
         }

         var1 = var2;
         if (this.hasDeviceID()) {
            var1 = (var2 * 37 + 6) * 53 + this.getDeviceID().hashCode();
         }

         var2 = var1;
         if (this.hasModelName()) {
            var2 = (var1 * 37 + 7) * 53 + this.getModelName().hashCode();
         }

         var1 = var2;
         if (this.hasHardwareCode()) {
            var1 = (var2 * 37 + 8) * 53 + this.getHardwareCode().hashCode();
         }

         var2 = var1;
         if (this.hasProductColor()) {
            var2 = (var1 * 37 + 9) * 53 + this.getProductColor().hashCode();
         }

         var1 = var2;
         if (this.hasProductDesign()) {
            var1 = (var2 * 37 + 10) * 53 + this.getProductDesign().hashCode();
         }

         var3 = var1;
         if (this.hasSystemId()) {
            var3 = (var1 * 37 + 11) * 53 + this.getSystemId().hashCode();
         }

         var2 = var3;
         if (this.hasGitHash()) {
            var2 = (var3 * 37 + 12) * 53 + this.getGitHash().hashCode();
         }

         var1 = var2;
         if (this.hasPolarmathsmartVersion()) {
            var1 = (var2 * 37 + 13) * 53 + this.getPolarmathsmartVersion().hashCode();
         }

         var2 = var1;
         if (this.getSubComponentInfoCount() > 0) {
            var2 = (var1 * 37 + 14) * 53 + this.getSubComponentInfoList().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Device.b().ensureFieldAccessorsInitialized(Device$PbDeviceInfo.class, Device$PbDeviceInfo$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      byte var2 = this.memoizedIsInitialized;
      boolean var3;
      if (var2 == 1) {
         var3 = true;
      } else {
         var3 = var1;
         if (var2 != 0) {
            if (this.hasBootloaderVersion() && !this.getBootloaderVersion().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (this.hasPlatformVersion() && !this.getPlatformVersion().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (this.hasDeviceVersion() && !this.getDeviceVersion().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (this.hasPolarmathsmartVersion() && !this.getPolarmathsmartVersion().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else {
               int var4 = 0;

               while(true) {
                  if (var4 >= this.getSubComponentInfoCount()) {
                     this.memoizedIsInitialized = (byte)1;
                     var3 = true;
                     break;
                  }

                  if (!this.getSubComponentInfo(var4).isInitialized()) {
                     this.memoizedIsInitialized = (byte)0;
                     var3 = var1;
                     break;
                  }

                  ++var4;
               }
            }
         }
      }

      return var3;
   }

   public Device$PbDeviceInfo$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Device$PbDeviceInfo$Builder newBuilderForType(BuilderParent var1) {
      return new Device$PbDeviceInfo$Builder(var1, (Device$1)null);
   }

   public Device$PbDeviceInfo$Builder toBuilder() {
      Device$PbDeviceInfo$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Device$PbDeviceInfo$Builder((Device$1)null);
      } else {
         var1 = (new Device$PbDeviceInfo$Builder((Device$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getBootloaderVersion());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getPlatformVersion());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getDeviceVersion());
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeUInt32(4, this.svnRev_);
      }

      if ((this.bitField0_ & 16) == 16) {
         GeneratedMessageV3.writeString(var1, 5, this.electricalSerialNumber_);
      }

      if ((this.bitField0_ & 32) == 32) {
         GeneratedMessageV3.writeString(var1, 6, this.deviceID_);
      }

      if ((this.bitField0_ & 64) == 64) {
         GeneratedMessageV3.writeString(var1, 7, this.modelName_);
      }

      if ((this.bitField0_ & 128) == 128) {
         GeneratedMessageV3.writeString(var1, 8, this.hardwareCode_);
      }

      if ((this.bitField0_ & 256) == 256) {
         GeneratedMessageV3.writeString(var1, 9, this.productColor_);
      }

      if ((this.bitField0_ & 512) == 512) {
         GeneratedMessageV3.writeString(var1, 10, this.productDesign_);
      }

      if ((this.bitField0_ & 1024) == 1024) {
         GeneratedMessageV3.writeString(var1, 11, this.systemId_);
      }

      if ((this.bitField0_ & 2048) == 2048) {
         var1.writeBytes(12, this.gitHash_);
      }

      if ((this.bitField0_ & 4096) == 4096) {
         var1.writeMessage(13, this.getPolarmathsmartVersion());
      }

      for(int var2 = 0; var2 < this.subComponentInfo_.size(); ++var2) {
         var1.writeMessage(14, (MessageLite)this.subComponentInfo_.get(var2));
      }

      this.unknownFields.writeTo(var1);
   }
}
