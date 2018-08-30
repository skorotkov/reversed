package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbDeviceLocation implements ProtocolMessageEnum {
   DEVICE_LOCATION_BIKE_MOUNT(13),

//   public static final int DEVICE_LOCATION_BIKE_MOUNT_VALUE = 13;
   DEVICE_LOCATION_CHEST(5),

//   public static final int DEVICE_LOCATION_CHEST_VALUE = 5;
   DEVICE_LOCATION_FOOT_LEFT(7),

//   public static final int DEVICE_LOCATION_FOOT_LEFT_VALUE = 7;
   DEVICE_LOCATION_FOOT_RIGHT(8),

//   public static final int DEVICE_LOCATION_FOOT_RIGHT_VALUE = 8;
   DEVICE_LOCATION_LOWER_ARM_LEFT(9),

//   public static final int DEVICE_LOCATION_LOWER_ARM_LEFT_VALUE = 9;
   DEVICE_LOCATION_LOWER_ARM_RIGHT(10),

//   public static final int DEVICE_LOCATION_LOWER_ARM_RIGHT_VALUE = 10;
   DEVICE_LOCATION_NECKLACE(4),

//   public static final int DEVICE_LOCATION_NECKLACE_VALUE = 4;
   DEVICE_LOCATION_OTHER(1),

//   public static final int DEVICE_LOCATION_OTHER_VALUE = 1;
   DEVICE_LOCATION_UNDEFINED(0),

//   public static final int DEVICE_LOCATION_UNDEFINED_VALUE = 0;
   DEVICE_LOCATION_UPPER_ARM_LEFT(11),

//   public static final int DEVICE_LOCATION_UPPER_ARM_LEFT_VALUE = 11;
   DEVICE_LOCATION_UPPER_ARM_RIGHT(12),

//   public static final int DEVICE_LOCATION_UPPER_ARM_RIGHT_VALUE = 12;
   DEVICE_LOCATION_UPPER_BACK(6),

//   public static final int DEVICE_LOCATION_UPPER_BACK_VALUE = 6;
   DEVICE_LOCATION_WRIST_LEFT(2),

//   public static final int DEVICE_LOCATION_WRIST_LEFT_VALUE = 2;
   DEVICE_LOCATION_WRIST_RIGHT(3);

//   public static final int DEVICE_LOCATION_WRIST_RIGHT_VALUE = 3;
   private static final Types$PbDeviceLocation[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbDeviceLocation$1();
   private final int value;

   private Types$PbDeviceLocation(int var3) {
      this.value = var3;
   }

   public static Types$PbDeviceLocation forNumber(int var0) {
      Types$PbDeviceLocation var1;
      switch(var0) {
      case 0:
         var1 = DEVICE_LOCATION_UNDEFINED;
         break;
      case 1:
         var1 = DEVICE_LOCATION_OTHER;
         break;
      case 2:
         var1 = DEVICE_LOCATION_WRIST_LEFT;
         break;
      case 3:
         var1 = DEVICE_LOCATION_WRIST_RIGHT;
         break;
      case 4:
         var1 = DEVICE_LOCATION_NECKLACE;
         break;
      case 5:
         var1 = DEVICE_LOCATION_CHEST;
         break;
      case 6:
         var1 = DEVICE_LOCATION_UPPER_BACK;
         break;
      case 7:
         var1 = DEVICE_LOCATION_FOOT_LEFT;
         break;
      case 8:
         var1 = DEVICE_LOCATION_FOOT_RIGHT;
         break;
      case 9:
         var1 = DEVICE_LOCATION_LOWER_ARM_LEFT;
         break;
      case 10:
         var1 = DEVICE_LOCATION_LOWER_ARM_RIGHT;
         break;
      case 11:
         var1 = DEVICE_LOCATION_UPPER_ARM_LEFT;
         break;
      case 12:
         var1 = DEVICE_LOCATION_UPPER_ARM_RIGHT;
         break;
      case 13:
         var1 = DEVICE_LOCATION_BIKE_MOUNT;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(29);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbDeviceLocation valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbDeviceLocation valueOf(EnumValueDescriptor var0) {
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
