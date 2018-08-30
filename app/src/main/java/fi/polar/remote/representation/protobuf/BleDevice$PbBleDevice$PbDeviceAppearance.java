package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum BleDevice$PbBleDevice$PbDeviceAppearance implements ProtocolMessageEnum {
   BLE_DEVICE_APPEARENCE_BELT_HEART_RATE_SENSOR(833),

   BLE_DEVICE_APPEARENCE_BLOOD_PRESSURE_ARM(897),

   BLE_DEVICE_APPEARENCE_BLOOD_PRESSURE_WRIST(898),

   BLE_DEVICE_APPEARENCE_GENERIC_BARCODE_SCANNER(704),

   BLE_DEVICE_APPEARENCE_GENERIC_BLOOD_PRESSURE(896),

   BLE_DEVICE_APPEARENCE_GENERIC_CLOCK(256),

   BLE_DEVICE_APPEARENCE_GENERIC_COMPUTER(128),

   BLE_DEVICE_APPEARENCE_GENERIC_DISPLAY(320),

   BLE_DEVICE_APPEARENCE_GENERIC_EYE_GLASSES(448),

   BLE_DEVICE_APPEARENCE_GENERIC_GENERIC_REMOTE_CONTROL(384),

   BLE_DEVICE_APPEARENCE_GENERIC_GLUCOSE_METER(1024),

   BLE_DEVICE_APPEARENCE_GENERIC_HEART_RATE_SENSOR(832),

   BLE_DEVICE_APPEARENCE_GENERIC_KEYRING(576),

   BLE_DEVICE_APPEARENCE_GENERIC_MEDIA_PLAYER(640),

   BLE_DEVICE_APPEARENCE_GENERIC_PHONE(64),

   BLE_DEVICE_APPEARENCE_GENERIC_TAG(512),

   BLE_DEVICE_APPEARENCE_GENERIC_THERMOMETER(768),

   BLE_DEVICE_APPEARENCE_GENERIC_WATCH(192),

   BLE_DEVICE_APPEARENCE_HID_BARCODE_SCANNER(968),

   BLE_DEVICE_APPEARENCE_HID_CARD_READER(966),

   BLE_DEVICE_APPEARENCE_HID_DIGITAL_PEN(967),

   BLE_DEVICE_APPEARENCE_HID_DIGITIZER_TABLET(965),

   BLE_DEVICE_APPEARENCE_HID_GAMEPAD(964),

   BLE_DEVICE_APPEARENCE_HID_JOYSTICK(963),

   BLE_DEVICE_APPEARENCE_HID_KEYBOARD(961),

   BLE_DEVICE_APPEARENCE_HID_MOUSE(962),

   BLE_DEVICE_APPEARENCE_HUMAN_INTERFACE_DEVICE(960),

   BLE_DEVICE_APPEARENCE_SPORTS_WATCH(193),

   BLE_DEVICE_APPEARENCE_THERMOMETER_EAR(769),

   BLE_DEVICE_APPEARENCE_UNKNOWN(0);

   public static final int BLE_DEVICE_APPEARENCE_UNKNOWN_VALUE = 0;
   public static final int BLE_DEVICE_APPEARENCE_THERMOMETER_EAR_VALUE = 769;
   public static final int BLE_DEVICE_APPEARENCE_SPORTS_WATCH_VALUE = 193;
   public static final int BLE_DEVICE_APPEARENCE_HUMAN_INTERFACE_DEVICE_VALUE = 960;
   public static final int BLE_DEVICE_APPEARENCE_HID_MOUSE_VALUE = 962;
   public static final int BLE_DEVICE_APPEARENCE_HID_KEYBOARD_VALUE = 961;
   public static final int BLE_DEVICE_APPEARENCE_HID_JOYSTICK_VALUE = 963;
   public static final int BLE_DEVICE_APPEARENCE_HID_GAMEPAD_VALUE = 964;
   public static final int BLE_DEVICE_APPEARENCE_HID_DIGITIZER_TABLET_VALUE = 965;
   public static final int BLE_DEVICE_APPEARENCE_HID_DIGITAL_PEN_VALUE = 967;
   public static final int BLE_DEVICE_APPEARENCE_HID_CARD_READER_VALUE = 966;
   public static final int BLE_DEVICE_APPEARENCE_HID_BARCODE_SCANNER_VALUE = 968;
   public static final int BLE_DEVICE_APPEARENCE_GENERIC_WATCH_VALUE = 192;
   public static final int BLE_DEVICE_APPEARENCE_GENERIC_THERMOMETER_VALUE = 768;
   public static final int BLE_DEVICE_APPEARENCE_GENERIC_TAG_VALUE = 512;
   public static final int BLE_DEVICE_APPEARENCE_GENERIC_PHONE_VALUE = 64;
   public static final int BLE_DEVICE_APPEARENCE_GENERIC_MEDIA_PLAYER_VALUE = 640;
   public static final int BLE_DEVICE_APPEARENCE_GENERIC_KEYRING_VALUE = 576;
   public static final int BLE_DEVICE_APPEARENCE_GENERIC_HEART_RATE_SENSOR_VALUE = 832;
   public static final int BLE_DEVICE_APPEARENCE_GENERIC_GLUCOSE_METER_VALUE = 1024;
   public static final int BLE_DEVICE_APPEARENCE_GENERIC_GENERIC_REMOTE_CONTROL_VALUE = 384;
   public static final int BLE_DEVICE_APPEARENCE_GENERIC_EYE_GLASSES_VALUE = 448;
   public static final int BLE_DEVICE_APPEARENCE_BELT_HEART_RATE_SENSOR_VALUE = 833;
   public static final int BLE_DEVICE_APPEARENCE_BLOOD_PRESSURE_ARM_VALUE = 897;
   public static final int BLE_DEVICE_APPEARENCE_BLOOD_PRESSURE_WRIST_VALUE = 898;
   public static final int BLE_DEVICE_APPEARENCE_GENERIC_BARCODE_SCANNER_VALUE = 704;
   public static final int BLE_DEVICE_APPEARENCE_GENERIC_BLOOD_PRESSURE_VALUE = 896;
   public static final int BLE_DEVICE_APPEARENCE_GENERIC_CLOCK_VALUE = 256;
   public static final int BLE_DEVICE_APPEARENCE_GENERIC_COMPUTER_VALUE = 128;
   public static final int BLE_DEVICE_APPEARENCE_GENERIC_DISPLAY_VALUE = 320;

   private static final BleDevice$PbBleDevice$PbDeviceAppearance[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new BleDevice$PbBleDevice$PbDeviceAppearance$1();
   private final int value;

   private BleDevice$PbBleDevice$PbDeviceAppearance(int var3) {
      this.value = var3;
   }

   public static BleDevice$PbBleDevice$PbDeviceAppearance forNumber(int var0) {
      BleDevice$PbBleDevice$PbDeviceAppearance var1;
      switch(var0) {
      case 0:
         var1 = BLE_DEVICE_APPEARENCE_UNKNOWN;
         break;
      case 64:
         var1 = BLE_DEVICE_APPEARENCE_GENERIC_PHONE;
         break;
      case 128:
         var1 = BLE_DEVICE_APPEARENCE_GENERIC_COMPUTER;
         break;
      case 192:
         var1 = BLE_DEVICE_APPEARENCE_GENERIC_WATCH;
         break;
      case 193:
         var1 = BLE_DEVICE_APPEARENCE_SPORTS_WATCH;
         break;
      case 256:
         var1 = BLE_DEVICE_APPEARENCE_GENERIC_CLOCK;
         break;
      case 320:
         var1 = BLE_DEVICE_APPEARENCE_GENERIC_DISPLAY;
         break;
      case 384:
         var1 = BLE_DEVICE_APPEARENCE_GENERIC_GENERIC_REMOTE_CONTROL;
         break;
      case 448:
         var1 = BLE_DEVICE_APPEARENCE_GENERIC_EYE_GLASSES;
         break;
      case 512:
         var1 = BLE_DEVICE_APPEARENCE_GENERIC_TAG;
         break;
      case 576:
         var1 = BLE_DEVICE_APPEARENCE_GENERIC_KEYRING;
         break;
      case 640:
         var1 = BLE_DEVICE_APPEARENCE_GENERIC_MEDIA_PLAYER;
         break;
      case 704:
         var1 = BLE_DEVICE_APPEARENCE_GENERIC_BARCODE_SCANNER;
         break;
      case 768:
         var1 = BLE_DEVICE_APPEARENCE_GENERIC_THERMOMETER;
         break;
      case 769:
         var1 = BLE_DEVICE_APPEARENCE_THERMOMETER_EAR;
         break;
      case 832:
         var1 = BLE_DEVICE_APPEARENCE_GENERIC_HEART_RATE_SENSOR;
         break;
      case 833:
         var1 = BLE_DEVICE_APPEARENCE_BELT_HEART_RATE_SENSOR;
         break;
      case 896:
         var1 = BLE_DEVICE_APPEARENCE_GENERIC_BLOOD_PRESSURE;
         break;
      case 897:
         var1 = BLE_DEVICE_APPEARENCE_BLOOD_PRESSURE_ARM;
         break;
      case 898:
         var1 = BLE_DEVICE_APPEARENCE_BLOOD_PRESSURE_WRIST;
         break;
      case 960:
         var1 = BLE_DEVICE_APPEARENCE_HUMAN_INTERFACE_DEVICE;
         break;
      case 961:
         var1 = BLE_DEVICE_APPEARENCE_HID_KEYBOARD;
         break;
      case 962:
         var1 = BLE_DEVICE_APPEARENCE_HID_MOUSE;
         break;
      case 963:
         var1 = BLE_DEVICE_APPEARENCE_HID_JOYSTICK;
         break;
      case 964:
         var1 = BLE_DEVICE_APPEARENCE_HID_GAMEPAD;
         break;
      case 965:
         var1 = BLE_DEVICE_APPEARENCE_HID_DIGITIZER_TABLET;
         break;
      case 966:
         var1 = BLE_DEVICE_APPEARENCE_HID_CARD_READER;
         break;
      case 967:
         var1 = BLE_DEVICE_APPEARENCE_HID_DIGITAL_PEN;
         break;
      case 968:
         var1 = BLE_DEVICE_APPEARENCE_HID_BARCODE_SCANNER;
         break;
      case 1024:
         var1 = BLE_DEVICE_APPEARENCE_GENERIC_GLUCOSE_METER;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)BleDevice$PbBleDevice.getDescriptor().getEnumTypes().get(2);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static BleDevice$PbBleDevice$PbDeviceAppearance valueOf(int var0) {
      return forNumber(var0);
   }

   public static BleDevice$PbBleDevice$PbDeviceAppearance valueOf(EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return VALUES[var0.getIndex()];
      }
   }

   public final EnumDescriptor getDescriptorForType() {
      return getDescriptor();
   }

   public final int getNumber() {
      return this.value;
   }

   public final EnumValueDescriptor getValueDescriptor() {
      return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
   }
}
