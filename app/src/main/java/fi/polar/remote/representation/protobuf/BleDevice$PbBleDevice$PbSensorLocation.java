package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum BleDevice$PbBleDevice$PbSensorLocation implements ProtocolMessageEnum {
   SENSOR_LOCATION_CHAINSTAY(11);

   public static final int SENSOR_LOCATION_CHAINSTAY_VALUE = 11;
   SENSOR_LOCATION_CHEST(14);

   public static final int SENSOR_LOCATION_CHEST_VALUE = 14;
   SENSOR_LOCATION_FRONT_HUB(9);

   public static final int SENSOR_LOCATION_FRONT_HUB_VALUE = 9;
   SENSOR_LOCATION_FRONT_WHEEL(4);

   public static final int SENSOR_LOCATION_FRONT_WHEEL_VALUE = 4;
   SENSOR_LOCATION_HIP(3);

   public static final int SENSOR_LOCATION_HIP_VALUE = 3;
   SENSOR_LOCATION_IN_SHOE(2);

   public static final int SENSOR_LOCATION_IN_SHOE_VALUE = 2;
   SENSOR_LOCATION_LEFT_CRANK(5);

   public static final int SENSOR_LOCATION_LEFT_CRANK_VALUE = 5;
   SENSOR_LOCATION_LEFT_PEDAL(7);

   public static final int SENSOR_LOCATION_LEFT_PEDAL_VALUE = 7;
   SENSOR_LOCATION_OTHER(0);

   public static final int SENSOR_LOCATION_OTHER_VALUE = 0;
   SENSOR_LOCATION_REAR_DROPOUT(10);

   public static final int SENSOR_LOCATION_REAR_DROPOUT_VALUE = 10;
   SENSOR_LOCATION_REAR_HUB(13);

   public static final int SENSOR_LOCATION_REAR_HUB_VALUE = 13;
   SENSOR_LOCATION_REAR_WHEEL(12);

   public static final int SENSOR_LOCATION_REAR_WHEEL_VALUE = 12;
   SENSOR_LOCATION_RIGHT_CRANK(6);

   public static final int SENSOR_LOCATION_RIGHT_CRANK_VALUE = 6;
   SENSOR_LOCATION_RIGHT_PEDAL(8);

   public static final int SENSOR_LOCATION_RIGHT_PEDAL_VALUE = 8;
   SENSOR_LOCATION_TOP_OF_SHOE(1);

   public static final int SENSOR_LOCATION_TOP_OF_SHOE_VALUE = 1;
   private static final BleDevice$PbBleDevice$PbSensorLocation[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new BleDevice$PbBleDevice$PbSensorLocation$1();
   private final int value;

   private BleDevice$PbBleDevice$PbSensorLocation(int var3) {
      this.value = var3;
   }

   public static BleDevice$PbBleDevice$PbSensorLocation forNumber(int var0) {
      BleDevice$PbBleDevice$PbSensorLocation var1;
      switch(var0) {
      case 0:
         var1 = SENSOR_LOCATION_OTHER;
         break;
      case 1:
         var1 = SENSOR_LOCATION_TOP_OF_SHOE;
         break;
      case 2:
         var1 = SENSOR_LOCATION_IN_SHOE;
         break;
      case 3:
         var1 = SENSOR_LOCATION_HIP;
         break;
      case 4:
         var1 = SENSOR_LOCATION_FRONT_WHEEL;
         break;
      case 5:
         var1 = SENSOR_LOCATION_LEFT_CRANK;
         break;
      case 6:
         var1 = SENSOR_LOCATION_RIGHT_CRANK;
         break;
      case 7:
         var1 = SENSOR_LOCATION_LEFT_PEDAL;
         break;
      case 8:
         var1 = SENSOR_LOCATION_RIGHT_PEDAL;
         break;
      case 9:
         var1 = SENSOR_LOCATION_FRONT_HUB;
         break;
      case 10:
         var1 = SENSOR_LOCATION_REAR_DROPOUT;
         break;
      case 11:
         var1 = SENSOR_LOCATION_CHAINSTAY;
         break;
      case 12:
         var1 = SENSOR_LOCATION_REAR_WHEEL;
         break;
      case 13:
         var1 = SENSOR_LOCATION_REAR_HUB;
         break;
      case 14:
         var1 = SENSOR_LOCATION_CHEST;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)BleDevice$PbBleDevice.getDescriptor().getEnumTypes().get(1);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static BleDevice$PbBleDevice$PbSensorLocation valueOf(int var0) {
      return forNumber(var0);
   }

   public static BleDevice$PbBleDevice$PbSensorLocation valueOf(EnumValueDescriptor var0) {
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
