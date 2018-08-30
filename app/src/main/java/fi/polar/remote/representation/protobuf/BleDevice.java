package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class BleDevice {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbBleDevice_descriptor;
   private static final FieldAccessorTable internal_static_data_PbBleDevice_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbBleUser_descriptor;
   private static final FieldAccessorTable internal_static_data_PbBleUser_fieldAccessorTable;

   static {
      BleDevice$1 var0 = new BleDevice$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor var3 = Nanopb.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0016bluetooth_device.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\u001a\fnanopb.proto\"K\n\tPbBleUser\u0012\u0012\n\nuser_index\u0018\u0001 \u0002(\r\u0012\u0019\n\u0011device_user_index\u0018\u0002 \u0002(\r\u0012\u000f\n\u0007consent\u0018\u0003 \u0001(\r\"Ø\u0018\n\u000bPbBleDevice\u0012!\n\u0006paired\u0018\u0001 \u0002(\u000b2\u0011.PbSystemDateTime\u0012(\n\rlast_modified\u0018\u0002 \u0002(\u000b2\u0011.PbSystemDateTime\u00124\n\fmanufacturer\u0018\u0003 \u0002(\u000e2\u001e.data.PbDeviceManufacturerType\u0012-\n\u0012deleted_time_stamp\u0018\u0005 \u0001(\u000b2\u0011.PbSystemDateTime\u0012\u0016\n\u0003mac\u0018\u0006 \u0001(\u000b2\t.PbBleMac\u0012\u0011\n\tdevice_id\u0018\u0007 \u0001(\t\u0012\u0013\n\u0004name\u0018\b ", "\u0001(\tB\u0005\u0092?\u0002\b\u001f\u0012\u0015\n\rbattery_level\u0018\t \u0001(\r\u0012\u0019\n\u0011manufacturer_name\u0018\n \u0001(\t\u0012\u0012\n\nmodel_name\u0018\u000b \u0001(\t\u0012\u0017\n\bpeer_ltk\u0018\f \u0001(\fB\u0005\u0092?\u0002\b\u0010\u0012\u0017\n\bpeer_irk\u0018\r \u0001(\fB\u0005\u0092?\u0002\b\u0010\u0012\u0018\n\tpeer_csrk\u0018\u000e \u0001(\fB\u0005\u0092?\u0002\b\u0010\u00121\n\u0012available_features\u0018\u000f \u0003(\u000e2\u000e.PbFeatureTypeB\u0005\u0092?\u0002\u0010\u0014\u0012\u001f\n\bservices\u0018\u0010 \u0003(\u000b2\r.PbBleService\u0012\u0018\n\tpeer_rand\u0018\u0011 \u0001(\fB\u0005\u0092?\u0002\b\b\u0012\u0011\n\tpeer_ediv\u0018\u0012 \u0001(\r\u0012\u0015\n\rencr_key_size\u0018\u0013 \u0001(\r\u0012\u0018\n\u0010distributed_keys\u0018\u0014 \u0001(\r\u0012\u0015\n\rauthenticated\u0018\u0015 \u0001(\b\u0012;\n\u000fsensor_location\u0018\u0016 \u0001(\u000e2\".data.PbBleDevic", "e.PbSensorLocation\u0012\u001f\n\u0017OBSOLETE_device_version\u0018\u0017 \u0001(\t\u0012\"\n\u001asecondary_software_version\u0018\u0018 \u0001(\t\u0012\u0015\n\rserial_number\u0018\u0019 \u0001(\t\u0012\u0018\n\tlocal_ltk\u0018\u001a \u0001(\fB\u0005\u0092?\u0002\b\u0010\u0012\u0019\n\nlocal_rand\u0018\u001b \u0001(\fB\u0005\u0092?\u0002\b\b\u0012\u0012\n\nlocal_ediv\u0018\u001c \u0001(\r\u0012)\n\tuser_data\u0018\u001d \u0003(\u000b2\u000f.data.PbBleUserB\u0005\u0092?\u0002\u0010\u0005\u0012?\n\u0011device_appearance\u0018\u001e \u0001(\u000e2$.data.PbBleDevice.PbDeviceAppearance\u0012(\n part_of_distributed_power_system\u0018\u001f \u0001(\b\u0012\u0015\n\rhardware_code\u0018  \u0001(\t\u0012/\n\u0012sub_component_info\u0018! \u0003(\u000b2\u0013.PbSubcomponen", "tInfo\u0012\"\n\u000edevice_version\u0018\" \u0001(\u000b2\n.PbVersion\"Á\u0001\n\fPbBleKeyType\u0012\u001b\n\u0017BLE_PEER_ENCRYPTION_KEY\u0010\u0001\u0012\u001f\n\u001bBLE_PEER_IDENTIFICATION_KEY\u0010\u0002\u0012\u0018\n\u0014BLE_PEER_SIGNING_KEY\u0010\u0004\u0012\u001c\n\u0018BLE_LOCAL_ENCRYPTION_KEY\u0010\b\u0012 \n\u001cBLE_LOCAL_IDENTIFICATION_KEY\u0010\u0010\u0012\u0019\n\u0015BLE_LOCAL_SIGNING_KEY\u0010 \"à\u0003\n\u0010PbSensorLocation\u0012\u0019\n\u0015SENSOR_LOCATION_OTHER\u0010\u0000\u0012\u001f\n\u001bSENSOR_LOCATION_TOP_OF_SHOE\u0010\u0001\u0012\u001b\n\u0017SENSOR_LOCATION_IN_SHOE\u0010\u0002\u0012\u0017\n\u0013SENSOR_LOCATION_HIP\u0010\u0003\u0012\u001f\n\u001bSENSOR_LOCATION_FRONT_WH", "EEL\u0010\u0004\u0012\u001e\n\u001aSENSOR_LOCATION_LEFT_CRANK\u0010\u0005\u0012\u001f\n\u001bSENSOR_LOCATION_RIGHT_CRANK\u0010\u0006\u0012\u001e\n\u001aSENSOR_LOCATION_LEFT_PEDAL\u0010\u0007\u0012\u001f\n\u001bSENSOR_LOCATION_RIGHT_PEDAL\u0010\b\u0012\u001d\n\u0019SENSOR_LOCATION_FRONT_HUB\u0010\t\u0012 \n\u001cSENSOR_LOCATION_REAR_DROPOUT\u0010\n\u0012\u001d\n\u0019SENSOR_LOCATION_CHAINSTAY\u0010\u000b\u0012\u001e\n\u001aSENSOR_LOCATION_REAR_WHEEL\u0010\f\u0012\u001c\n\u0018SENSOR_LOCATION_REAR_HUB\u0010\r\u0012\u0019\n\u0015SENSOR_LOCATION_CHEST\u0010\u000e\"ð\n\n\u0012PbDeviceAppearance\u0012!\n\u001dBLE_DEVICE_APPEARENCE_UNKNOWN\u0010\u0000\u0012'\n#BLE_DEVICE_APPEARE", "NCE_GENERIC_PHONE\u0010@\u0012+\n&BLE_DEVICE_APPEARENCE_GENERIC_COMPUTER\u0010\u0080\u0001\u0012(\n#BLE_DEVICE_APPEARENCE_GENERIC_WATCH\u0010À\u0001\u0012'\n\"BLE_DEVICE_APPEARENCE_SPORTS_WATCH\u0010Á\u0001\u0012(\n#BLE_DEVICE_APPEARENCE_GENERIC_CLOCK\u0010\u0080\u0002\u0012*\n%BLE_DEVICE_APPEARENCE_GENERIC_DISPLAY\u0010À\u0002\u00129\n4BLE_DEVICE_APPEARENCE_GENERIC_GENERIC_REMOTE_CONTROL\u0010\u0080\u0003\u0012.\n)BLE_DEVICE_APPEARENCE_GENERIC_EYE_GLASSES\u0010À\u0003\u0012&\n!BLE_DEVICE_APPEARENCE_GENERIC_TAG\u0010\u0080\u0004\u0012*\n%BLE_DEVICE_APPEA", "RENCE_GENERIC_KEYRING\u0010À\u0004\u0012/\n*BLE_DEVICE_APPEARENCE_GENERIC_MEDIA_PLAYER\u0010\u0080\u0005\u00122\n-BLE_DEVICE_APPEARENCE_GENERIC_BARCODE_SCANNER\u0010À\u0005\u0012.\n)BLE_DEVICE_APPEARENCE_GENERIC_THERMOMETER\u0010\u0080\u0006\u0012*\n%BLE_DEVICE_APPEARENCE_THERMOMETER_EAR\u0010\u0081\u0006\u00124\n/BLE_DEVICE_APPEARENCE_GENERIC_HEART_RATE_SENSOR\u0010À\u0006\u00121\n,BLE_DEVICE_APPEARENCE_BELT_HEART_RATE_SENSOR\u0010Á\u0006\u00121\n,BLE_DEVICE_APPEARENCE_GENERIC_BLOOD_PRESSURE\u0010\u0080\u0007\u0012-\n(BLE_DEVICE_APPEARENCE_B", "LOOD_PRESSURE_ARM\u0010\u0081\u0007\u0012/\n*BLE_DEVICE_APPEARENCE_BLOOD_PRESSURE_WRIST\u0010\u0082\u0007\u00121\n,BLE_DEVICE_APPEARENCE_HUMAN_INTERFACE_DEVICE\u0010À\u0007\u0012'\n\"BLE_DEVICE_APPEARENCE_HID_KEYBOARD\u0010Á\u0007\u0012$\n\u001fBLE_DEVICE_APPEARENCE_HID_MOUSE\u0010Â\u0007\u0012'\n\"BLE_DEVICE_APPEARENCE_HID_JOYSTICK\u0010Ã\u0007\u0012&\n!BLE_DEVICE_APPEARENCE_HID_GAMEPAD\u0010Ä\u0007\u0012/\n*BLE_DEVICE_APPEARENCE_HID_DIGITIZER_TABLET\u0010Å\u0007\u0012*\n%BLE_DEVICE_APPEARENCE_HID_CARD_READER\u0010Æ\u0007\u0012*\n%BLE_DEVICE_APPEARENCE_H", "ID_DIGITAL_PEN\u0010Ç\u0007\u0012.\n)BLE_DEVICE_APPEARENCE_HID_BARCODE_SCANNER\u0010È\u0007\u00120\n+BLE_DEVICE_APPEARENCE_GENERIC_GLUCOSE_METER\u0010\u0080\b*J\n\u0018PbDeviceManufacturerType\u0012\u0016\n\u0012MANUFACTURER_POLAR\u0010\u0001\u0012\u0016\n\u0012MANUFACTURER_OTHER\u0010\u0002B4\n'fi.polar.remote.representation.protobufB\tBleDevice"}, new FileDescriptor[]{var1, var2, var3}, var0);
      internal_static_data_PbBleUser_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbBleUser_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbBleUser_descriptor, new String[]{"UserIndex", "DeviceUserIndex", "Consent"});
      internal_static_data_PbBleDevice_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_data_PbBleDevice_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbBleDevice_descriptor, new String[]{"Paired", "LastModified", "Manufacturer", "DeletedTimeStamp", "Mac", "DeviceId", "Name", "BatteryLevel", "ManufacturerName", "ModelName", "PeerLtk", "PeerIrk", "PeerCsrk", "AvailableFeatures", "Services", "PeerRand", "PeerEdiv", "EncrKeySize", "DistributedKeys", "Authenticated", "SensorLocation", "OBSOLETEDeviceVersion", "SecondarySoftwareVersion", "SerialNumber", "LocalLtk", "LocalRand", "LocalEdiv", "UserData", "DeviceAppearance", "PartOfDistributedPowerSystem", "HardwareCode", "SubComponentInfo", "DeviceVersion"});
      ExtensionRegistry var4 = ExtensionRegistry.newInstance();
      var4.add(Nanopb.nanopb);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var4);
      Types.getDescriptor();
      Structures.getDescriptor();
      Nanopb.getDescriptor();
   }

   private BleDevice() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbBleUser_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbBleUser_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_data_PbBleDevice_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_data_PbBleDevice_fieldAccessorTable;
   }

   public static FileDescriptor getDescriptor() {
      return descriptor;
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }
}
