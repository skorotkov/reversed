package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface BleDevice$PbBleDeviceOrBuilder extends MessageOrBuilder {
   boolean getAuthenticated();

   Types$PbFeatureType getAvailableFeatures(int var1);

   int getAvailableFeaturesCount();

   List getAvailableFeaturesList();

   int getBatteryLevel();

   Types$PbSystemDateTime getDeletedTimeStamp();

   Types$PbSystemDateTimeOrBuilder getDeletedTimeStampOrBuilder();

   BleDevice$PbBleDevice$PbDeviceAppearance getDeviceAppearance();

   String getDeviceId();

   ByteString getDeviceIdBytes();

   Structures$PbVersion getDeviceVersion();

   Structures$PbVersionOrBuilder getDeviceVersionOrBuilder();

   int getDistributedKeys();

   int getEncrKeySize();

   String getHardwareCode();

   ByteString getHardwareCodeBytes();

   Types$PbSystemDateTime getLastModified();

   Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder();

   int getLocalEdiv();

   ByteString getLocalLtk();

   ByteString getLocalRand();

   Structures$PbBleMac getMac();

   Structures$PbBleMacOrBuilder getMacOrBuilder();

   BleDevice$PbDeviceManufacturerType getManufacturer();

   String getManufacturerName();

   ByteString getManufacturerNameBytes();

   String getModelName();

   ByteString getModelNameBytes();

   String getName();

   ByteString getNameBytes();

   String getOBSOLETEDeviceVersion();

   ByteString getOBSOLETEDeviceVersionBytes();

   Types$PbSystemDateTime getPaired();

   Types$PbSystemDateTimeOrBuilder getPairedOrBuilder();

   boolean getPartOfDistributedPowerSystem();

   ByteString getPeerCsrk();

   int getPeerEdiv();

   ByteString getPeerIrk();

   ByteString getPeerLtk();

   ByteString getPeerRand();

   String getSecondarySoftwareVersion();

   ByteString getSecondarySoftwareVersionBytes();

   BleDevice$PbBleDevice$PbSensorLocation getSensorLocation();

   String getSerialNumber();

   ByteString getSerialNumberBytes();

   Structures$PbBleService getServices(int var1);

   int getServicesCount();

   List getServicesList();

   Structures$PbBleServiceOrBuilder getServicesOrBuilder(int var1);

   List getServicesOrBuilderList();

   Structures$PbSubcomponentInfo getSubComponentInfo(int var1);

   int getSubComponentInfoCount();

   List getSubComponentInfoList();

   Structures$PbSubcomponentInfoOrBuilder getSubComponentInfoOrBuilder(int var1);

   List getSubComponentInfoOrBuilderList();

   BleDevice$PbBleUser getUserData(int var1);

   int getUserDataCount();

   List getUserDataList();

   BleDevice$PbBleUserOrBuilder getUserDataOrBuilder(int var1);

   List getUserDataOrBuilderList();

   boolean hasAuthenticated();

   boolean hasBatteryLevel();

   boolean hasDeletedTimeStamp();

   boolean hasDeviceAppearance();

   boolean hasDeviceId();

   boolean hasDeviceVersion();

   boolean hasDistributedKeys();

   boolean hasEncrKeySize();

   boolean hasHardwareCode();

   boolean hasLastModified();

   boolean hasLocalEdiv();

   boolean hasLocalLtk();

   boolean hasLocalRand();

   boolean hasMac();

   boolean hasManufacturer();

   boolean hasManufacturerName();

   boolean hasModelName();

   boolean hasName();

   boolean hasOBSOLETEDeviceVersion();

   boolean hasPaired();

   boolean hasPartOfDistributedPowerSystem();

   boolean hasPeerCsrk();

   boolean hasPeerEdiv();

   boolean hasPeerIrk();

   boolean hasPeerLtk();

   boolean hasPeerRand();

   boolean hasSecondarySoftwareVersion();

   boolean hasSensorLocation();

   boolean hasSerialNumber();
}
