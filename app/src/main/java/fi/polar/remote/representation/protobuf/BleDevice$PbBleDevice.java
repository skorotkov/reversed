package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import com.google.protobuf.Internal.ListAdapter;
import com.google.protobuf.Internal.ListAdapter.Converter;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class BleDevice$PbBleDevice extends GeneratedMessageV3 implements BleDevice$PbBleDeviceOrBuilder {
   public static final int AUTHENTICATED_FIELD_NUMBER = 21;
   public static final int AVAILABLE_FEATURES_FIELD_NUMBER = 15;
   public static final int BATTERY_LEVEL_FIELD_NUMBER = 9;
   private static final BleDevice$PbBleDevice DEFAULT_INSTANCE = new BleDevice$PbBleDevice();
   public static final int DELETED_TIME_STAMP_FIELD_NUMBER = 5;
   public static final int DEVICE_APPEARANCE_FIELD_NUMBER = 30;
   public static final int DEVICE_ID_FIELD_NUMBER = 7;
   public static final int DEVICE_VERSION_FIELD_NUMBER = 34;
   public static final int DISTRIBUTED_KEYS_FIELD_NUMBER = 20;
   public static final int ENCR_KEY_SIZE_FIELD_NUMBER = 19;
   public static final int HARDWARE_CODE_FIELD_NUMBER = 32;
   public static final int LAST_MODIFIED_FIELD_NUMBER = 2;
   public static final int LOCAL_EDIV_FIELD_NUMBER = 28;
   public static final int LOCAL_LTK_FIELD_NUMBER = 26;
   public static final int LOCAL_RAND_FIELD_NUMBER = 27;
   public static final int MAC_FIELD_NUMBER = 6;
   public static final int MANUFACTURER_FIELD_NUMBER = 3;
   public static final int MANUFACTURER_NAME_FIELD_NUMBER = 10;
   public static final int MODEL_NAME_FIELD_NUMBER = 11;
   public static final int NAME_FIELD_NUMBER = 8;
   public static final int OBSOLETE_DEVICE_VERSION_FIELD_NUMBER = 23;
   public static final int PAIRED_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new BleDevice$PbBleDevice$2();
   public static final int PART_OF_DISTRIBUTED_POWER_SYSTEM_FIELD_NUMBER = 31;
   public static final int PEER_CSRK_FIELD_NUMBER = 14;
   public static final int PEER_EDIV_FIELD_NUMBER = 18;
   public static final int PEER_IRK_FIELD_NUMBER = 13;
   public static final int PEER_LTK_FIELD_NUMBER = 12;
   public static final int PEER_RAND_FIELD_NUMBER = 17;
   public static final int SECONDARY_SOFTWARE_VERSION_FIELD_NUMBER = 24;
   public static final int SENSOR_LOCATION_FIELD_NUMBER = 22;
   public static final int SERIAL_NUMBER_FIELD_NUMBER = 25;
   public static final int SERVICES_FIELD_NUMBER = 16;
   public static final int SUB_COMPONENT_INFO_FIELD_NUMBER = 33;
   public static final int USER_DATA_FIELD_NUMBER = 29;
   private static final Converter availableFeatures_converter_ = new BleDevice$PbBleDevice$1();
   private static final long serialVersionUID = 0L;
   private boolean authenticated_;
   private List availableFeatures_;
   private int batteryLevel_;
   private int bitField0_;
   private Types$PbSystemDateTime deletedTimeStamp_;
   private int deviceAppearance_;
   private volatile Object deviceId_;
   private Structures$PbVersion deviceVersion_;
   private int distributedKeys_;
   private int encrKeySize_;
   private volatile Object hardwareCode_;
   private Types$PbSystemDateTime lastModified_;
   private int localEdiv_;
   private ByteString localLtk_;
   private ByteString localRand_;
   private Structures$PbBleMac mac_;
   private volatile Object manufacturerName_;
   private int manufacturer_;
   private byte memoizedIsInitialized;
   private volatile Object modelName_;
   private volatile Object name_;
   private volatile Object oBSOLETEDeviceVersion_;
   private Types$PbSystemDateTime paired_;
   private boolean partOfDistributedPowerSystem_;
   private ByteString peerCsrk_;
   private int peerEdiv_;
   private ByteString peerIrk_;
   private ByteString peerLtk_;
   private ByteString peerRand_;
   private volatile Object secondarySoftwareVersion_;
   private int sensorLocation_;
   private volatile Object serialNumber_;
   private List services_;
   private List subComponentInfo_;
   private List userData_;

   private BleDevice$PbBleDevice() {
      this.memoizedIsInitialized = (byte)-1;
      this.manufacturer_ = 1;
      this.deviceId_ = "";
      this.name_ = "";
      this.batteryLevel_ = 0;
      this.manufacturerName_ = "";
      this.modelName_ = "";
      this.peerLtk_ = ByteString.EMPTY;
      this.peerIrk_ = ByteString.EMPTY;
      this.peerCsrk_ = ByteString.EMPTY;
      this.availableFeatures_ = Collections.emptyList();
      this.services_ = Collections.emptyList();
      this.peerRand_ = ByteString.EMPTY;
      this.peerEdiv_ = 0;
      this.encrKeySize_ = 0;
      this.distributedKeys_ = 0;
      this.authenticated_ = false;
      this.sensorLocation_ = 0;
      this.oBSOLETEDeviceVersion_ = "";
      this.secondarySoftwareVersion_ = "";
      this.serialNumber_ = "";
      this.localLtk_ = ByteString.EMPTY;
      this.localRand_ = ByteString.EMPTY;
      this.localEdiv_ = 0;
      this.userData_ = Collections.emptyList();
      this.deviceAppearance_ = 0;
      this.partOfDistributedPowerSystem_ = false;
      this.hardwareCode_ = "";
      this.subComponentInfo_ = Collections.emptyList();
   }

   private BleDevice$PbBleDevice(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   BleDevice$PbBleDevice(CodedInputStream var1, ExtensionRegistryLite var2, BleDevice$1 var3) {
      this(var1, var2);
   }

   private BleDevice$PbBleDevice(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   BleDevice$PbBleDevice(Builder var1, BleDevice$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(BleDevice$PbBleDevice var0, int var1) {
      var0.manufacturer_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ByteString a(BleDevice$PbBleDevice var0, ByteString var1) {
      var0.peerLtk_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbBleMac a(BleDevice$PbBleDevice var0, Structures$PbBleMac var1) {
      var0.mac_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbVersion a(BleDevice$PbBleDevice var0, Structures$PbVersion var1) {
      var0.deviceVersion_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime a(BleDevice$PbBleDevice var0, Types$PbSystemDateTime var1) {
      var0.paired_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object a(BleDevice$PbBleDevice var0) {
      return var0.deviceId_;
   }

   // $FF: synthetic method
   static Object a(BleDevice$PbBleDevice var0, Object var1) {
      var0.deviceId_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List a(BleDevice$PbBleDevice var0, List var1) {
      var0.availableFeatures_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean a(BleDevice$PbBleDevice var0, boolean var1) {
      var0.authenticated_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(BleDevice$PbBleDevice var0, int var1) {
      var0.batteryLevel_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ByteString b(BleDevice$PbBleDevice var0, ByteString var1) {
      var0.peerIrk_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime b(BleDevice$PbBleDevice var0, Types$PbSystemDateTime var1) {
      var0.lastModified_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object b(BleDevice$PbBleDevice var0) {
      return var0.name_;
   }

   // $FF: synthetic method
   static Object b(BleDevice$PbBleDevice var0, Object var1) {
      var0.name_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List b(BleDevice$PbBleDevice var0, List var1) {
      var0.services_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static boolean b(BleDevice$PbBleDevice var0, boolean var1) {
      var0.partOfDistributedPowerSystem_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int c(BleDevice$PbBleDevice var0, int var1) {
      var0.peerEdiv_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ByteString c(BleDevice$PbBleDevice var0, ByteString var1) {
      var0.peerCsrk_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime c(BleDevice$PbBleDevice var0, Types$PbSystemDateTime var1) {
      var0.deletedTimeStamp_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object c(BleDevice$PbBleDevice var0) {
      return var0.manufacturerName_;
   }

   // $FF: synthetic method
   static Object c(BleDevice$PbBleDevice var0, Object var1) {
      var0.manufacturerName_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List c(BleDevice$PbBleDevice var0, List var1) {
      var0.userData_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean c() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int d(BleDevice$PbBleDevice var0, int var1) {
      var0.encrKeySize_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ByteString d(BleDevice$PbBleDevice var0, ByteString var1) {
      var0.peerRand_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object d(BleDevice$PbBleDevice var0) {
      return var0.modelName_;
   }

   // $FF: synthetic method
   static Object d(BleDevice$PbBleDevice var0, Object var1) {
      var0.modelName_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List d(BleDevice$PbBleDevice var0, List var1) {
      var0.subComponentInfo_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean d() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int e(BleDevice$PbBleDevice var0, int var1) {
      var0.distributedKeys_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ByteString e(BleDevice$PbBleDevice var0, ByteString var1) {
      var0.localLtk_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object e(BleDevice$PbBleDevice var0, Object var1) {
      var0.oBSOLETEDeviceVersion_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List e(BleDevice$PbBleDevice var0) {
      return var0.availableFeatures_;
   }

   // $FF: synthetic method
   static boolean e() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int f(BleDevice$PbBleDevice var0, int var1) {
      var0.sensorLocation_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ByteString f(BleDevice$PbBleDevice var0, ByteString var1) {
      var0.localRand_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Converter f() {
      return availableFeatures_converter_;
   }

   // $FF: synthetic method
   static Object f(BleDevice$PbBleDevice var0, Object var1) {
      var0.secondarySoftwareVersion_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List f(BleDevice$PbBleDevice var0) {
      return var0.services_;
   }

   // $FF: synthetic method
   static int g(BleDevice$PbBleDevice var0, int var1) {
      var0.localEdiv_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object g(BleDevice$PbBleDevice var0) {
      return var0.oBSOLETEDeviceVersion_;
   }

   // $FF: synthetic method
   static Object g(BleDevice$PbBleDevice var0, Object var1) {
      var0.serialNumber_ = var1;
      return var1;
   }

   public static BleDevice$PbBleDevice getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return BleDevice.c();
   }

   // $FF: synthetic method
   static int h(BleDevice$PbBleDevice var0, int var1) {
      var0.deviceAppearance_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object h(BleDevice$PbBleDevice var0) {
      return var0.secondarySoftwareVersion_;
   }

   // $FF: synthetic method
   static Object h(BleDevice$PbBleDevice var0, Object var1) {
      var0.hardwareCode_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int i(BleDevice$PbBleDevice var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object i(BleDevice$PbBleDevice var0) {
      return var0.serialNumber_;
   }

   // $FF: synthetic method
   static List j(BleDevice$PbBleDevice var0) {
      return var0.userData_;
   }

   // $FF: synthetic method
   static Object k(BleDevice$PbBleDevice var0) {
      return var0.hardwareCode_;
   }

   // $FF: synthetic method
   static List l(BleDevice$PbBleDevice var0) {
      return var0.subComponentInfo_;
   }

   // $FF: synthetic method
   static UnknownFieldSet m(BleDevice$PbBleDevice var0) {
      return var0.unknownFields;
   }

   public static BleDevice$PbBleDevice$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static BleDevice$PbBleDevice$Builder newBuilder(BleDevice$PbBleDevice var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static BleDevice$PbBleDevice parseDelimitedFrom(InputStream var0) {
      return (BleDevice$PbBleDevice)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static BleDevice$PbBleDevice parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (BleDevice$PbBleDevice)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static BleDevice$PbBleDevice parseFrom(ByteString var0) {
      return (BleDevice$PbBleDevice)PARSER.parseFrom(var0);
   }

   public static BleDevice$PbBleDevice parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (BleDevice$PbBleDevice)PARSER.parseFrom(var0, var1);
   }

   public static BleDevice$PbBleDevice parseFrom(CodedInputStream var0) {
      return (BleDevice$PbBleDevice)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BleDevice$PbBleDevice parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (BleDevice$PbBleDevice)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static BleDevice$PbBleDevice parseFrom(InputStream var0) {
      return (BleDevice$PbBleDevice)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BleDevice$PbBleDevice parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (BleDevice$PbBleDevice)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static BleDevice$PbBleDevice parseFrom(byte[] var0) {
      return (BleDevice$PbBleDevice)PARSER.parseFrom(var0);
   }

   public static BleDevice$PbBleDevice parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (BleDevice$PbBleDevice)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof BleDevice$PbBleDevice)) {
            var2 = super.equals(var1);
         } else {
            BleDevice$PbBleDevice var5 = (BleDevice$PbBleDevice)var1;
            boolean var3;
            if (this.hasPaired() == var5.hasPaired()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasPaired()) {
               if (var3 && this.getPaired().equals(var5.getPaired())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasLastModified() == var5.hasLastModified()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasLastModified()) {
               if (var4 && this.getLastModified().equals(var5.getLastModified())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasManufacturer() == var5.hasManufacturer()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasManufacturer()) {
               if (var3 && this.manufacturer_ == var5.manufacturer_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasDeletedTimeStamp() == var5.hasDeletedTimeStamp()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasDeletedTimeStamp()) {
               if (var3 && this.getDeletedTimeStamp().equals(var5.getDeletedTimeStamp())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasMac() == var5.hasMac()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasMac()) {
               if (var4 && this.getMac().equals(var5.getMac())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasDeviceId() == var5.hasDeviceId()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasDeviceId()) {
               if (var4 && this.getDeviceId().equals(var5.getDeviceId())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasName() == var5.hasName()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasName()) {
               if (var3 && this.getName().equals(var5.getName())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasBatteryLevel() == var5.hasBatteryLevel()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasBatteryLevel()) {
               if (var3 && this.getBatteryLevel() == var5.getBatteryLevel()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasManufacturerName() == var5.hasManufacturerName()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasManufacturerName()) {
               if (var4 && this.getManufacturerName().equals(var5.getManufacturerName())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasModelName() == var5.hasModelName()) {
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

            if (var4 && this.hasPeerLtk() == var5.hasPeerLtk()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasPeerLtk()) {
               if (var4 && this.getPeerLtk().equals(var5.getPeerLtk())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasPeerIrk() == var5.hasPeerIrk()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasPeerIrk()) {
               if (var4 && this.getPeerIrk().equals(var5.getPeerIrk())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasPeerCsrk() == var5.hasPeerCsrk()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasPeerCsrk()) {
               if (var3 && this.getPeerCsrk().equals(var5.getPeerCsrk())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.availableFeatures_.equals(var5.availableFeatures_)) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.getServicesList().equals(var5.getServicesList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.hasPeerRand() == var5.hasPeerRand()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasPeerRand()) {
               if (var4 && this.getPeerRand().equals(var5.getPeerRand())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasPeerEdiv() == var5.hasPeerEdiv()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasPeerEdiv()) {
               if (var4 && this.getPeerEdiv() == var5.getPeerEdiv()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasEncrKeySize() == var5.hasEncrKeySize()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasEncrKeySize()) {
               if (var3 && this.getEncrKeySize() == var5.getEncrKeySize()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasDistributedKeys() == var5.hasDistributedKeys()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasDistributedKeys()) {
               if (var3 && this.getDistributedKeys() == var5.getDistributedKeys()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAuthenticated() == var5.hasAuthenticated()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasAuthenticated()) {
               if (var3 && this.getAuthenticated() == var5.getAuthenticated()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSensorLocation() == var5.hasSensorLocation()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSensorLocation()) {
               if (var4 && this.sensorLocation_ == var5.sensorLocation_) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasOBSOLETEDeviceVersion() == var5.hasOBSOLETEDeviceVersion()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasOBSOLETEDeviceVersion()) {
               if (var3 && this.getOBSOLETEDeviceVersion().equals(var5.getOBSOLETEDeviceVersion())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSecondarySoftwareVersion() == var5.hasSecondarySoftwareVersion()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSecondarySoftwareVersion()) {
               if (var3 && this.getSecondarySoftwareVersion().equals(var5.getSecondarySoftwareVersion())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSerialNumber() == var5.hasSerialNumber()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSerialNumber()) {
               if (var4 && this.getSerialNumber().equals(var5.getSerialNumber())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasLocalLtk() == var5.hasLocalLtk()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasLocalLtk()) {
               if (var3 && this.getLocalLtk().equals(var5.getLocalLtk())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasLocalRand() == var5.hasLocalRand()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasLocalRand()) {
               if (var3 && this.getLocalRand().equals(var5.getLocalRand())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasLocalEdiv() == var5.hasLocalEdiv()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasLocalEdiv()) {
               if (var3 && this.getLocalEdiv() == var5.getLocalEdiv()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.getUserDataList().equals(var5.getUserDataList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.hasDeviceAppearance() == var5.hasDeviceAppearance()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasDeviceAppearance()) {
               if (var3 && this.deviceAppearance_ == var5.deviceAppearance_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasPartOfDistributedPowerSystem() == var5.hasPartOfDistributedPowerSystem()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasPartOfDistributedPowerSystem()) {
               if (var4 && this.getPartOfDistributedPowerSystem() == var5.getPartOfDistributedPowerSystem()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasHardwareCode() == var5.hasHardwareCode()) {
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

            if (var3 && this.getSubComponentInfoList().equals(var5.getSubComponentInfoList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (var4 && this.hasDeviceVersion() == var5.hasDeviceVersion()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasDeviceVersion()) {
               if (var3 && this.getDeviceVersion().equals(var5.getDeviceVersion())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (!var4 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public boolean getAuthenticated() {
      return this.authenticated_;
   }

   public Types$PbFeatureType getAvailableFeatures(int var1) {
      return (Types$PbFeatureType)availableFeatures_converter_.convert(this.availableFeatures_.get(var1));
   }

   public int getAvailableFeaturesCount() {
      return this.availableFeatures_.size();
   }

   public List getAvailableFeaturesList() {
      return new ListAdapter(this.availableFeatures_, availableFeatures_converter_);
   }

   public int getBatteryLevel() {
      return this.batteryLevel_;
   }

   public BleDevice$PbBleDevice getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Types$PbSystemDateTime getDeletedTimeStamp() {
      Types$PbSystemDateTime var1;
      if (this.deletedTimeStamp_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.deletedTimeStamp_;
      }

      return var1;
   }

   public Types$PbSystemDateTimeOrBuilder getDeletedTimeStampOrBuilder() {
      Types$PbSystemDateTime var1;
      if (this.deletedTimeStamp_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.deletedTimeStamp_;
      }

      return var1;
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
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.deviceId_ = var3;
         }
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

   public int getDistributedKeys() {
      return this.distributedKeys_;
   }

   public int getEncrKeySize() {
      return this.encrKeySize_;
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

   public Types$PbSystemDateTime getLastModified() {
      Types$PbSystemDateTime var1;
      if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
      }

      return var1;
   }

   public Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder() {
      Types$PbSystemDateTime var1;
      if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
      }

      return var1;
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
      if (this.mac_ == null) {
         var1 = Structures$PbBleMac.getDefaultInstance();
      } else {
         var1 = this.mac_;
      }

      return var1;
   }

   public Structures$PbBleMacOrBuilder getMacOrBuilder() {
      Structures$PbBleMac var1;
      if (this.mac_ == null) {
         var1 = Structures$PbBleMac.getDefaultInstance();
      } else {
         var1 = this.mac_;
      }

      return var1;
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
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.manufacturerName_ = var3;
         }
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

   public String getName() {
      Object var1 = this.name_;
      String var3;
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.name_ = var3;
         }
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
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.oBSOLETEDeviceVersion_ = var3;
         }
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
      if (this.paired_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.paired_;
      }

      return var1;
   }

   public Types$PbSystemDateTimeOrBuilder getPairedOrBuilder() {
      Types$PbSystemDateTime var1;
      if (this.paired_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.paired_;
      }

      return var1;
   }

   public Parser getParserForType() {
      return PARSER;
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
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.secondarySoftwareVersion_ = var3;
         }
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
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.serialNumber_ = var3;
         }
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

   public int getSerializedSize() {
      byte var1 = 0;
      int var2 = this.memoizedSize;
      if (var2 == -1) {
         int var3;
         if ((this.bitField0_ & 1) == 1) {
            var3 = CodedOutputStream.computeMessageSize(1, this.getPaired()) + 0;
         } else {
            var3 = 0;
         }

         var2 = var3;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var3 + CodedOutputStream.computeMessageSize(2, this.getLastModified());
         }

         var3 = var2;
         if ((this.bitField0_ & 4) == 4) {
            var3 = var2 + CodedOutputStream.computeEnumSize(3, this.manufacturer_);
         }

         var2 = var3;
         if ((this.bitField0_ & 8) == 8) {
            var2 = var3 + CodedOutputStream.computeMessageSize(5, this.getDeletedTimeStamp());
         }

         var3 = var2;
         if ((this.bitField0_ & 16) == 16) {
            var3 = var2 + CodedOutputStream.computeMessageSize(6, this.getMac());
         }

         var2 = var3;
         if ((this.bitField0_ & 32) == 32) {
            var2 = var3 + GeneratedMessageV3.computeStringSize(7, this.deviceId_);
         }

         int var4 = var2;
         if ((this.bitField0_ & 64) == 64) {
            var4 = var2 + GeneratedMessageV3.computeStringSize(8, this.name_);
         }

         var3 = var4;
         if ((this.bitField0_ & 128) == 128) {
            var3 = var4 + CodedOutputStream.computeUInt32Size(9, this.batteryLevel_);
         }

         var2 = var3;
         if ((this.bitField0_ & 256) == 256) {
            var2 = var3 + GeneratedMessageV3.computeStringSize(10, this.manufacturerName_);
         }

         var3 = var2;
         if ((this.bitField0_ & 512) == 512) {
            var3 = var2 + GeneratedMessageV3.computeStringSize(11, this.modelName_);
         }

         var2 = var3;
         if ((this.bitField0_ & 1024) == 1024) {
            var2 = var3 + CodedOutputStream.computeBytesSize(12, this.peerLtk_);
         }

         var3 = var2;
         if ((this.bitField0_ & 2048) == 2048) {
            var3 = var2 + CodedOutputStream.computeBytesSize(13, this.peerIrk_);
         }

         if ((this.bitField0_ & 4096) == 4096) {
            var2 = var3 + CodedOutputStream.computeBytesSize(14, this.peerCsrk_);
         } else {
            var2 = var3;
         }

         var4 = 0;

         for(var3 = 0; var4 < this.availableFeatures_.size(); ++var4) {
            var3 += CodedOutputStream.computeEnumSizeNoTag((Integer)this.availableFeatures_.get(var4));
         }

         int var5 = this.availableFeatures_.size();
         byte var6 = 0;
         var2 = var2 + var3 + var5 * 1;

         for(var3 = var6; var3 < this.services_.size(); ++var3) {
            var2 += CodedOutputStream.computeMessageSize(16, (MessageLite)this.services_.get(var3));
         }

         var4 = var2;
         if ((this.bitField0_ & 8192) == 8192) {
            var4 = var2 + CodedOutputStream.computeBytesSize(17, this.peerRand_);
         }

         var3 = var4;
         if ((this.bitField0_ & 16384) == 16384) {
            var3 = var4 + CodedOutputStream.computeUInt32Size(18, this.peerEdiv_);
         }

         var2 = var3;
         if ((this.bitField0_ & '耀') == 32768) {
            var2 = var3 + CodedOutputStream.computeUInt32Size(19, this.encrKeySize_);
         }

         var3 = var2;
         if ((this.bitField0_ & 65536) == 65536) {
            var3 = var2 + CodedOutputStream.computeUInt32Size(20, this.distributedKeys_);
         }

         var2 = var3;
         if ((this.bitField0_ & 131072) == 131072) {
            var2 = var3 + CodedOutputStream.computeBoolSize(21, this.authenticated_);
         }

         var3 = var2;
         if ((this.bitField0_ & 262144) == 262144) {
            var3 = var2 + CodedOutputStream.computeEnumSize(22, this.sensorLocation_);
         }

         var2 = var3;
         if ((this.bitField0_ & 524288) == 524288) {
            var2 = var3 + GeneratedMessageV3.computeStringSize(23, this.oBSOLETEDeviceVersion_);
         }

         var3 = var2;
         if ((this.bitField0_ & 1048576) == 1048576) {
            var3 = var2 + GeneratedMessageV3.computeStringSize(24, this.secondarySoftwareVersion_);
         }

         var2 = var3;
         if ((this.bitField0_ & 2097152) == 2097152) {
            var2 = var3 + GeneratedMessageV3.computeStringSize(25, this.serialNumber_);
         }

         var3 = var2;
         if ((this.bitField0_ & 4194304) == 4194304) {
            var3 = var2 + CodedOutputStream.computeBytesSize(26, this.localLtk_);
         }

         var4 = var3;
         if ((this.bitField0_ & 8388608) == 8388608) {
            var4 = var3 + CodedOutputStream.computeBytesSize(27, this.localRand_);
         }

         var2 = var4;
         if ((this.bitField0_ & 16777216) == 16777216) {
            var2 = var4 + CodedOutputStream.computeUInt32Size(28, this.localEdiv_);
         }

         for(var3 = 0; var3 < this.userData_.size(); ++var3) {
            var2 += CodedOutputStream.computeMessageSize(29, (MessageLite)this.userData_.get(var3));
         }

         var4 = var2;
         if ((this.bitField0_ & 33554432) == 33554432) {
            var4 = var2 + CodedOutputStream.computeEnumSize(30, this.deviceAppearance_);
         }

         var3 = var4;
         if ((this.bitField0_ & 67108864) == 67108864) {
            var3 = var4 + CodedOutputStream.computeBoolSize(31, this.partOfDistributedPowerSystem_);
         }

         var4 = var1;
         var2 = var3;
         if ((this.bitField0_ & 134217728) == 134217728) {
            var2 = var3 + GeneratedMessageV3.computeStringSize(32, this.hardwareCode_);
            var4 = var1;
         }

         while(var4 < this.subComponentInfo_.size()) {
            var2 += CodedOutputStream.computeMessageSize(33, (MessageLite)this.subComponentInfo_.get(var4));
            ++var4;
         }

         var3 = var2;
         if ((this.bitField0_ & 268435456) == 268435456) {
            var3 = var2 + CodedOutputStream.computeMessageSize(34, this.getDeviceVersion());
         }

         var2 = this.unknownFields.getSerializedSize() + var3;
         this.memoizedSize = var2;
      }

      return var2;
   }

   public Structures$PbBleService getServices(int var1) {
      return (Structures$PbBleService)this.services_.get(var1);
   }

   public int getServicesCount() {
      return this.services_.size();
   }

   public List getServicesList() {
      return this.services_;
   }

   public Structures$PbBleServiceOrBuilder getServicesOrBuilder(int var1) {
      return (Structures$PbBleServiceOrBuilder)this.services_.get(var1);
   }

   public List getServicesOrBuilderList() {
      return this.services_;
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

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public BleDevice$PbBleUser getUserData(int var1) {
      return (BleDevice$PbBleUser)this.userData_.get(var1);
   }

   public int getUserDataCount() {
      return this.userData_.size();
   }

   public List getUserDataList() {
      return this.userData_;
   }

   public BleDevice$PbBleUserOrBuilder getUserDataOrBuilder(int var1) {
      return (BleDevice$PbBleUserOrBuilder)this.userData_.get(var1);
   }

   public List getUserDataOrBuilderList() {
      return this.userData_;
   }

   public boolean hasAuthenticated() {
      boolean var1;
      if ((this.bitField0_ & 131072) == 131072) {
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
      if ((this.bitField0_ & 33554432) == 33554432) {
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
      boolean var1;
      if ((this.bitField0_ & 268435456) == 268435456) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDistributedKeys() {
      boolean var1;
      if ((this.bitField0_ & 65536) == 65536) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasEncrKeySize() {
      boolean var1;
      if ((this.bitField0_ & '耀') == 32768) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasHardwareCode() {
      boolean var1;
      if ((this.bitField0_ & 134217728) == 134217728) {
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
      if ((this.bitField0_ & 16777216) == 16777216) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLocalLtk() {
      boolean var1;
      if ((this.bitField0_ & 4194304) == 4194304) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLocalRand() {
      boolean var1;
      if ((this.bitField0_ & 8388608) == 8388608) {
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
      if ((this.bitField0_ & 524288) == 524288) {
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
      if ((this.bitField0_ & 67108864) == 67108864) {
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
      if ((this.bitField0_ & 16384) == 16384) {
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
      if ((this.bitField0_ & 8192) == 8192) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSecondarySoftwareVersion() {
      boolean var1;
      if ((this.bitField0_ & 1048576) == 1048576) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSensorLocation() {
      boolean var1;
      if ((this.bitField0_ & 262144) == 262144) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSerialNumber() {
      boolean var1;
      if ((this.bitField0_ & 2097152) == 2097152) {
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
         var1 = this.getDescriptorForType().hashCode() + 779;
         int var2 = var1;
         if (this.hasPaired()) {
            var2 = (var1 * 37 + 1) * 53 + this.getPaired().hashCode();
         }

         var1 = var2;
         if (this.hasLastModified()) {
            var1 = (var2 * 37 + 2) * 53 + this.getLastModified().hashCode();
         }

         var2 = var1;
         if (this.hasManufacturer()) {
            var2 = (var1 * 37 + 3) * 53 + this.manufacturer_;
         }

         int var3 = var2;
         if (this.hasDeletedTimeStamp()) {
            var3 = (var2 * 37 + 5) * 53 + this.getDeletedTimeStamp().hashCode();
         }

         var1 = var3;
         if (this.hasMac()) {
            var1 = (var3 * 37 + 6) * 53 + this.getMac().hashCode();
         }

         var2 = var1;
         if (this.hasDeviceId()) {
            var2 = (var1 * 37 + 7) * 53 + this.getDeviceId().hashCode();
         }

         var1 = var2;
         if (this.hasName()) {
            var1 = (var2 * 37 + 8) * 53 + this.getName().hashCode();
         }

         var3 = var1;
         if (this.hasBatteryLevel()) {
            var3 = (var1 * 37 + 9) * 53 + this.getBatteryLevel();
         }

         var2 = var3;
         if (this.hasManufacturerName()) {
            var2 = (var3 * 37 + 10) * 53 + this.getManufacturerName().hashCode();
         }

         var1 = var2;
         if (this.hasModelName()) {
            var1 = (var2 * 37 + 11) * 53 + this.getModelName().hashCode();
         }

         var3 = var1;
         if (this.hasPeerLtk()) {
            var3 = (var1 * 37 + 12) * 53 + this.getPeerLtk().hashCode();
         }

         var2 = var3;
         if (this.hasPeerIrk()) {
            var2 = (var3 * 37 + 13) * 53 + this.getPeerIrk().hashCode();
         }

         var1 = var2;
         if (this.hasPeerCsrk()) {
            var1 = (var2 * 37 + 14) * 53 + this.getPeerCsrk().hashCode();
         }

         var2 = var1;
         if (this.getAvailableFeaturesCount() > 0) {
            var2 = (var1 * 37 + 15) * 53 + this.availableFeatures_.hashCode();
         }

         var1 = var2;
         if (this.getServicesCount() > 0) {
            var1 = (var2 * 37 + 16) * 53 + this.getServicesList().hashCode();
         }

         var3 = var1;
         if (this.hasPeerRand()) {
            var3 = (var1 * 37 + 17) * 53 + this.getPeerRand().hashCode();
         }

         var2 = var3;
         if (this.hasPeerEdiv()) {
            var2 = (var3 * 37 + 18) * 53 + this.getPeerEdiv();
         }

         var1 = var2;
         if (this.hasEncrKeySize()) {
            var1 = (var2 * 37 + 19) * 53 + this.getEncrKeySize();
         }

         var2 = var1;
         if (this.hasDistributedKeys()) {
            var2 = (var1 * 37 + 20) * 53 + this.getDistributedKeys();
         }

         var1 = var2;
         if (this.hasAuthenticated()) {
            var1 = (var2 * 37 + 21) * 53 + Internal.hashBoolean(this.getAuthenticated());
         }

         var2 = var1;
         if (this.hasSensorLocation()) {
            var2 = (var1 * 37 + 22) * 53 + this.sensorLocation_;
         }

         var1 = var2;
         if (this.hasOBSOLETEDeviceVersion()) {
            var1 = (var2 * 37 + 23) * 53 + this.getOBSOLETEDeviceVersion().hashCode();
         }

         var3 = var1;
         if (this.hasSecondarySoftwareVersion()) {
            var3 = (var1 * 37 + 24) * 53 + this.getSecondarySoftwareVersion().hashCode();
         }

         var2 = var3;
         if (this.hasSerialNumber()) {
            var2 = (var3 * 37 + 25) * 53 + this.getSerialNumber().hashCode();
         }

         var1 = var2;
         if (this.hasLocalLtk()) {
            var1 = (var2 * 37 + 26) * 53 + this.getLocalLtk().hashCode();
         }

         var2 = var1;
         if (this.hasLocalRand()) {
            var2 = (var1 * 37 + 27) * 53 + this.getLocalRand().hashCode();
         }

         var1 = var2;
         if (this.hasLocalEdiv()) {
            var1 = (var2 * 37 + 28) * 53 + this.getLocalEdiv();
         }

         var2 = var1;
         if (this.getUserDataCount() > 0) {
            var2 = (var1 * 37 + 29) * 53 + this.getUserDataList().hashCode();
         }

         var1 = var2;
         if (this.hasDeviceAppearance()) {
            var1 = (var2 * 37 + 30) * 53 + this.deviceAppearance_;
         }

         var3 = var1;
         if (this.hasPartOfDistributedPowerSystem()) {
            var3 = (var1 * 37 + 31) * 53 + Internal.hashBoolean(this.getPartOfDistributedPowerSystem());
         }

         var2 = var3;
         if (this.hasHardwareCode()) {
            var2 = (var3 * 37 + 32) * 53 + this.getHardwareCode().hashCode();
         }

         var1 = var2;
         if (this.getSubComponentInfoCount() > 0) {
            var1 = (var2 * 37 + 33) * 53 + this.getSubComponentInfoList().hashCode();
         }

         var2 = var1;
         if (this.hasDeviceVersion()) {
            var2 = (var1 * 37 + 34) * 53 + this.getDeviceVersion().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return BleDevice.d().ensureFieldAccessorsInitialized(BleDevice$PbBleDevice.class, BleDevice$PbBleDevice$Builder.class);
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
            if (!this.hasPaired()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.hasLastModified()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.hasManufacturer()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.getPaired().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.getLastModified().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (this.hasDeletedTimeStamp() && !this.getDeletedTimeStamp().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (this.hasMac() && !this.getMac().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else {
               int var4 = 0;

               while(true) {
                  if (var4 >= this.getServicesCount()) {
                     for(var4 = 0; var4 < this.getUserDataCount(); ++var4) {
                        if (!this.getUserData(var4).isInitialized()) {
                           this.memoizedIsInitialized = (byte)0;
                           var3 = var1;
                           return var3;
                        }
                     }

                     for(var4 = 0; var4 < this.getSubComponentInfoCount(); ++var4) {
                        if (!this.getSubComponentInfo(var4).isInitialized()) {
                           this.memoizedIsInitialized = (byte)0;
                           var3 = var1;
                           return var3;
                        }
                     }

                     if (this.hasDeviceVersion() && !this.getDeviceVersion().isInitialized()) {
                        this.memoizedIsInitialized = (byte)0;
                        var3 = var1;
                     } else {
                        this.memoizedIsInitialized = (byte)1;
                        var3 = true;
                     }
                     break;
                  }

                  if (!this.getServices(var4).isInitialized()) {
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

   public BleDevice$PbBleDevice$Builder newBuilderForType() {
      return newBuilder();
   }

   protected BleDevice$PbBleDevice$Builder newBuilderForType(BuilderParent var1) {
      return new BleDevice$PbBleDevice$Builder(var1, (BleDevice$1)null);
   }

   public BleDevice$PbBleDevice$Builder toBuilder() {
      BleDevice$PbBleDevice$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new BleDevice$PbBleDevice$Builder((BleDevice$1)null);
      } else {
         var1 = (new BleDevice$PbBleDevice$Builder((BleDevice$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      byte var2 = 0;
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getPaired());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getLastModified());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeEnum(3, this.manufacturer_);
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeMessage(5, this.getDeletedTimeStamp());
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeMessage(6, this.getMac());
      }

      if ((this.bitField0_ & 32) == 32) {
         GeneratedMessageV3.writeString(var1, 7, this.deviceId_);
      }

      if ((this.bitField0_ & 64) == 64) {
         GeneratedMessageV3.writeString(var1, 8, this.name_);
      }

      if ((this.bitField0_ & 128) == 128) {
         var1.writeUInt32(9, this.batteryLevel_);
      }

      if ((this.bitField0_ & 256) == 256) {
         GeneratedMessageV3.writeString(var1, 10, this.manufacturerName_);
      }

      if ((this.bitField0_ & 512) == 512) {
         GeneratedMessageV3.writeString(var1, 11, this.modelName_);
      }

      if ((this.bitField0_ & 1024) == 1024) {
         var1.writeBytes(12, this.peerLtk_);
      }

      if ((this.bitField0_ & 2048) == 2048) {
         var1.writeBytes(13, this.peerIrk_);
      }

      if ((this.bitField0_ & 4096) == 4096) {
         var1.writeBytes(14, this.peerCsrk_);
      }

      int var3;
      for(var3 = 0; var3 < this.availableFeatures_.size(); ++var3) {
         var1.writeEnum(15, (Integer)this.availableFeatures_.get(var3));
      }

      for(var3 = 0; var3 < this.services_.size(); ++var3) {
         var1.writeMessage(16, (MessageLite)this.services_.get(var3));
      }

      if ((this.bitField0_ & 8192) == 8192) {
         var1.writeBytes(17, this.peerRand_);
      }

      if ((this.bitField0_ & 16384) == 16384) {
         var1.writeUInt32(18, this.peerEdiv_);
      }

      if ((this.bitField0_ & '耀') == 32768) {
         var1.writeUInt32(19, this.encrKeySize_);
      }

      if ((this.bitField0_ & 65536) == 65536) {
         var1.writeUInt32(20, this.distributedKeys_);
      }

      if ((this.bitField0_ & 131072) == 131072) {
         var1.writeBool(21, this.authenticated_);
      }

      if ((this.bitField0_ & 262144) == 262144) {
         var1.writeEnum(22, this.sensorLocation_);
      }

      if ((this.bitField0_ & 524288) == 524288) {
         GeneratedMessageV3.writeString(var1, 23, this.oBSOLETEDeviceVersion_);
      }

      if ((this.bitField0_ & 1048576) == 1048576) {
         GeneratedMessageV3.writeString(var1, 24, this.secondarySoftwareVersion_);
      }

      if ((this.bitField0_ & 2097152) == 2097152) {
         GeneratedMessageV3.writeString(var1, 25, this.serialNumber_);
      }

      if ((this.bitField0_ & 4194304) == 4194304) {
         var1.writeBytes(26, this.localLtk_);
      }

      if ((this.bitField0_ & 8388608) == 8388608) {
         var1.writeBytes(27, this.localRand_);
      }

      if ((this.bitField0_ & 16777216) == 16777216) {
         var1.writeUInt32(28, this.localEdiv_);
      }

      for(var3 = 0; var3 < this.userData_.size(); ++var3) {
         var1.writeMessage(29, (MessageLite)this.userData_.get(var3));
      }

      if ((this.bitField0_ & 33554432) == 33554432) {
         var1.writeEnum(30, this.deviceAppearance_);
      }

      if ((this.bitField0_ & 67108864) == 67108864) {
         var1.writeBool(31, this.partOfDistributedPowerSystem_);
      }

      var3 = var2;
      if ((this.bitField0_ & 134217728) == 134217728) {
         GeneratedMessageV3.writeString(var1, 32, this.hardwareCode_);
         var3 = var2;
      }

      while(var3 < this.subComponentInfo_.size()) {
         var1.writeMessage(33, (MessageLite)this.subComponentInfo_.get(var3));
         ++var3;
      }

      if ((this.bitField0_ & 268435456) == 268435456) {
         var1.writeMessage(34, this.getDeviceVersion());
      }

      this.unknownFields.writeTo(var1);
   }
}
