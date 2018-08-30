package fi.polar.polarflow.data.orm;

import android.text.TextUtils;
import com.orm.dsl.Ignore;
import fi.polar.polarflow.data.Mergeable;
import fi.polar.polarflow.util.c;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.BleDevice$PbBleDevice;
import fi.polar.remote.representation.protobuf.BleDevice$PbBleDevice$Builder;
import fi.polar.remote.representation.protobuf.BleDevice$PbDeviceManufacturerType;
import fi.polar.remote.representation.protobuf.Structures$PbBleMac;
import fi.polar.remote.representation.protobuf.Structures$PbSubcomponentInfo;
import fi.polar.remote.representation.protobuf.Structures$PbSubcomponentInfo$Builder;
import fi.polar.remote.representation.protobuf.Structures$PbVersion;
import fi.polar.remote.representation.protobuf.Types$PbFeatureType;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;

public class BleDevice extends ProtoPublishableEntity implements Mergeable {
   private static final String BLE_SUB_COMPONENT_NAME = "BleStack";
   public static final int FEATURE_ACTIVITY = 12;
   public static final int FEATURE_ALTITUDE = 10;
   public static final int FEATURE_AS_CADENCE = 23;
   public static final int FEATURE_AS_DISTANCE = 24;
   public static final int FEATURE_AS_SPEED = 22;
   public static final int FEATURE_AS_SWR_STATE = 25;
   public static final int FEATURE_BATTERY_LEVEL = 26;
   public static final int FEATURE_BIKE_CADENCE = 5;
   public static final int FEATURE_BIKE_CRANK_REVOLUTION = 21;
   public static final int FEATURE_BIKE_POWER = 6;
   public static final int FEATURE_BIKE_WHEEL_REVOLUTION = 20;
   public static final int FEATURE_COMPASS_HEADING = 16;
   public static final int FEATURE_DISTANCE = 4;
   public static final int FEATURE_FILE_TRANSFER = 27;
   public static final int FEATURE_GPS_ALTITUDE = 19;
   public static final int FEATURE_GPS_DISTANCE = 18;
   public static final int FEATURE_GPS_LOCATION = 7;
   public static final int FEATURE_GPS_SPEED = 17;
   public static final int FEATURE_HEART_RATE = 1;
   public static final int FEATURE_JUMP_HEIGTH = 15;
   public static final int FEATURE_PRESS_TEMPERATURE = 9;
   public static final int FEATURE_PUSH_NOTIFICATIONS = 28;
   public static final int FEATURE_RR_INTERVAL = 2;
   public static final int FEATURE_RSC_MOVING_TYPE = 14;
   public static final int FEATURE_RUNNING_CADENCE = 8;
   public static final int FEATURE_SPEED = 3;
   public static final int FEATURE_STEPS = 11;
   public static final int FEATURE_STRIDE_LENGTH = 13;
   public static final int FEATURE_UNDEFINED = Integer.MAX_VALUE;
   public static final int FEATURE_WEIGHT_SCALE = 29;
   public static final int MANUFACTURER_OTHER = 2;
   public static final int MANUFACTURER_POLAR = 1;
   public static final int MANUFACTURER_UNDEFINED = Integer.MAX_VALUE;
   private String availableFeatures;
   private String deviceId;
   private String firmwareVersion;
   private String hardwareVersion;
   private Date lastModified;
   private boolean lastModifiedTrusted;
   @Ignore
   private boolean mAvailableFeaturesLoaded;
   @Ignore
   private final Set mAvailableFeaturesSet;
   private String mac;
   private int macType;
   private int manufacturer;
   private String manufacturerName;
   private String modelName;
   private String name;
   private Date paired;
   private boolean pairedTrusted;
   private String softwareVersion;

   public BleDevice() {
      this.paired = null;
      this.pairedTrusted = false;
      this.lastModified = null;
      this.lastModifiedTrusted = false;
      this.manufacturer = Integer.MAX_VALUE;
      this.name = null;
      this.mac = null;
      this.macType = Integer.MAX_VALUE;
      this.deviceId = null;
      this.manufacturerName = null;
      this.firmwareVersion = null;
      this.hardwareVersion = null;
      this.softwareVersion = null;
      this.modelName = null;
      this.availableFeatures = null;
      this.mAvailableFeaturesSet = new LinkedHashSet();
      this.mAvailableFeaturesLoaded = false;
   }

   public BleDevice(BleDevice$PbBleDevice var1) {
      this();
      if (var1.hasPaired()) {
         this.paired = q.a(var1.getPaired());
         this.pairedTrusted = var1.getPaired().getTrusted();
      }

      if (var1.hasLastModified()) {
         this.lastModified = q.a(var1.getLastModified());
         this.lastModifiedTrusted = var1.getLastModified().getTrusted();
      }

      if (var1.hasManufacturer()) {
         this.manufacturer = var1.getManufacturer().getNumber();
      }

      if (var1.hasName()) {
         this.name = var1.getName();
      }

      if (var1.hasMac()) {
         Structures$PbBleMac var2 = var1.getMac();
         this.mac = c.a(var2.getMac().toByteArray(), true);
         this.macType = var2.getType().getNumber();
      }

      if (var1.hasDeviceId()) {
         this.deviceId = var1.getDeviceId();
      }

      if (var1.hasManufacturerName()) {
         this.manufacturerName = var1.getManufacturerName();
      }

      if (var1.hasModelName()) {
         this.modelName = var1.getModelName();
      }

      Iterator var3 = var1.getSubComponentInfoList().iterator();

      while(var3.hasNext()) {
         Structures$PbSubcomponentInfo var4 = (Structures$PbSubcomponentInfo)var3.next();
         if ("BleStack".equals(var4.getName()) && var4.hasVersion()) {
            this.firmwareVersion = q.a(var4.getVersion());
         }
      }

      if (var1.hasHardwareCode()) {
         this.hardwareVersion = var1.getHardwareCode();
      }

      if (var1.hasDeviceVersion()) {
         this.softwareVersion = q.a(var1.getDeviceVersion());
      }

      if (var1.getAvailableFeaturesCount() > 0) {
         this.getAvailableFeaturesSet().addAll(q.a(var1.getAvailableFeaturesList()));
      }

   }

   public BleDevice(InputStream var1) {
      this(BleDevice$PbBleDevice.parseFrom(var1));
   }

   public static List findByAvailableFeature(int var0) {
      ArrayList var1 = new ArrayList();
      Iterator var2 = listAll(BleDevice.class).iterator();

      while(var2.hasNext()) {
         BleDevice var3 = (BleDevice)var2.next();
         if (var3.getAvailableFeaturesSet().contains(var0)) {
            var1.add(var3);
         }
      }

      return var1;
   }

   public static BleDevice findByDeviceId(String var0) {
      Object var1 = null;
      BleDevice var2 = (BleDevice)var1;
      if (!TextUtils.isEmpty(var0)) {
         List var3 = find(BleDevice.class, "DEVICE_ID = ?", new String[]{var0});
         var2 = (BleDevice)var1;
         if (var3.size() > 0) {
            var2 = (BleDevice)var3.get(0);
         }
      }

      return var2;
   }

   public static BleDevice findByMac(String var0) {
      Object var1 = null;
      BleDevice var2 = (BleDevice)var1;
      if (!TextUtils.isEmpty(var0)) {
         List var3 = find(BleDevice.class, "MAC = ?", new String[]{var0.toUpperCase(Locale.US)});
         var2 = (BleDevice)var1;
         if (var3.size() > 0) {
            var2 = (BleDevice)var3.get(0);
         }
      }

      return var2;
   }

   public static BleDevice findByPath(String var0) {
      Object var1 = null;
      BleDevice var2 = (BleDevice)var1;
      if (!TextUtils.isEmpty(var0)) {
         List var3 = find(BleDevice.class, "PATH = ?", new String[]{var0});
         var2 = (BleDevice)var1;
         if (var3.size() > 0) {
            var2 = (BleDevice)var3.get(0);
         }
      }

      return var2;
   }

   private void generatePathIfEmpty() {
      if (TextUtils.isEmpty(this.path)) {
         this.path = generateUniquePath();
      }

   }

   private static String generateUniquePath() {
      List var0 = listAll(BleDevice.class);
      int var1 = 0;
      String var2 = null;

      label22:
      for(boolean var3 = false; !var3; ++var1) {
         var2 = "/SYS/BT/" + var1 + '/';
         Iterator var4 = var0.iterator();

         do {
            if (!var4.hasNext()) {
               var3 = true;
               continue label22;
            }
         } while(!var2.equals(((BleDevice)var4.next()).path));

         var3 = false;
      }

      return var2;
   }

   private void loadAvailableFeaturesFromJson() {
      if (!this.mAvailableFeaturesLoaded) {
         this.mAvailableFeaturesSet.clear();
         this.mAvailableFeaturesSet.addAll(q.b(this.availableFeatures));
         this.mAvailableFeaturesLoaded = true;
      }

   }

   private void saveAvailableFeaturesToJson() {
      this.availableFeatures = (new JSONArray(this.getAvailableFeaturesSet())).toString();
   }

   public void addAllAvailableFeatures(Set var1) {
      this.getAvailableFeaturesSet().addAll(var1);
   }

   public void addAvailableFeature(int var1) {
      this.getAvailableFeaturesSet().add(var1);
   }

   public void clearAvailableFeatures() {
      this.getAvailableFeaturesSet().clear();
   }

   public Set getAvailableFeaturesSet() {
      this.loadAvailableFeaturesFromJson();
      return this.mAvailableFeaturesSet;
   }

   public String getBasename() {
      return "BTDEV";
   }

   public String getDeviceId() {
      return this.deviceId;
   }

   public String getFirmwareVersion() {
      return this.firmwareVersion;
   }

   public String getHardwareVersion() {
      return this.hardwareVersion;
   }

   public Date getLastModified() {
      return this.lastModified;
   }

   public String getMac() {
      return this.mac;
   }

   public int getMacType() {
      return this.macType;
   }

   public int getManufacturer() {
      return this.manufacturer;
   }

   public String getManufacturerName() {
      return this.manufacturerName;
   }

   public String getModelName() {
      return this.modelName;
   }

   public String getName() {
      return this.name;
   }

   public Date getPaired() {
      return this.paired;
   }

   public String getPath() {
      this.generatePathIfEmpty();
      return this.path;
   }

   public String getSoftwareVersion() {
      return this.softwareVersion;
   }

   public boolean isLastModifiedTrusted() {
      return this.lastModifiedTrusted;
   }

   public boolean isPairedTrusted() {
      return this.pairedTrusted;
   }

   public void merge(BleDevice var1) {
      if (q.a(this.lastModified, var1.lastModified)) {
         this.paired = var1.paired;
         this.pairedTrusted = var1.pairedTrusted;
         this.lastModified = var1.lastModified;
         this.lastModifiedTrusted = var1.lastModifiedTrusted;
         this.manufacturer = var1.manufacturer;
         this.name = var1.name;
         this.mac = var1.mac;
         this.macType = var1.macType;
         this.deviceId = var1.deviceId;
         this.manufacturerName = var1.manufacturerName;
         this.modelName = var1.modelName;
         this.firmwareVersion = var1.firmwareVersion;
         this.hardwareVersion = var1.hardwareVersion;
         this.softwareVersion = var1.softwareVersion;
         this.clearAvailableFeatures();
         this.addAllAvailableFeatures(var1.getAvailableFeaturesSet());
      }

   }

   public long save() {
      this.saveAvailableFeaturesToJson();
      this.generatePathIfEmpty();
      return super.save();
   }

   public void setDeviceId(String var1) {
      this.deviceId = var1;
   }

   public void setFirmwareVersion(String var1) {
      this.firmwareVersion = var1;
   }

   public void setHardwareVersion(String var1) {
      this.hardwareVersion = var1;
   }

   public void setLastModified(Date var1, boolean var2) {
      this.lastModified = var1;
      this.lastModifiedTrusted = var2;
   }

   public void setMac(String var1, int var2) {
      if (!TextUtils.isEmpty(var1)) {
         var1 = var1.toUpperCase(Locale.US);
      } else {
         var1 = null;
      }

      this.mac = var1;
      this.macType = var2;
   }

   public void setManufacturer(int var1) {
      this.manufacturer = var1;
   }

   public void setManufacturerName(String var1) {
      this.manufacturerName = var1;
   }

   public void setModelName(String var1) {
      this.modelName = var1;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public void setPaired(Date var1, boolean var2) {
      this.paired = var1;
      this.pairedTrusted = var2;
   }

   public void setSoftwareVersion(String var1) {
      this.softwareVersion = var1;
   }

   public BleDevice$PbBleDevice toPbObject() {
      BleDevice$PbBleDevice$Builder var1 = BleDevice$PbBleDevice.newBuilder();
      if (this.paired != null) {
         var1.setPaired(q.a(this.paired, this.pairedTrusted));
      }

      if (this.lastModified != null) {
         var1.setLastModified(q.a(this.lastModified, this.lastModifiedTrusted));
      }

      if (this.manufacturer != Integer.MAX_VALUE) {
         var1.setManufacturer(BleDevice$PbDeviceManufacturerType.forNumber(this.manufacturer));
      }

      if (!TextUtils.isEmpty(this.name)) {
         var1.setName(this.name);
      }

      if (!TextUtils.isEmpty(this.mac)) {
         var1.setMac(q.a(this.mac, this.macType));
      }

      if (!TextUtils.isEmpty(this.deviceId)) {
         var1.setDeviceId(this.deviceId);
      }

      if (!TextUtils.isEmpty(this.manufacturerName)) {
         var1.setManufacturerName(this.manufacturerName);
      }

      if (!TextUtils.isEmpty(this.modelName)) {
         var1.setModelName(this.modelName);
      }

      if (!TextUtils.isEmpty(this.hardwareVersion)) {
         var1.setHardwareCode(this.hardwareVersion);
      }

      if (!TextUtils.isEmpty(this.softwareVersion)) {
         Structures$PbVersion var2 = q.a((String)this.softwareVersion, (String)null);
         if (var2 != null) {
            var1.setOBSOLETEDeviceVersion(this.softwareVersion);
            var1.setDeviceVersion(var2);
         }
      }

      if (!TextUtils.isEmpty(this.firmwareVersion)) {
         Structures$PbSubcomponentInfo$Builder var4 = Structures$PbSubcomponentInfo.newBuilder();
         var4.setName("BleStack");
         Structures$PbVersion var3 = q.a((String)this.firmwareVersion, (String)null);
         if (var3 != null) {
            var4.setVersion(var3);
         }

         var1.addSubComponentInfo(var4.build());
      }

      Iterator var5 = this.getAvailableFeaturesSet().iterator();

      while(var5.hasNext()) {
         var1.addAvailableFeatures(Types$PbFeatureType.forNumber((Integer)var5.next()));
      }

      return var1.build();
   }
}
