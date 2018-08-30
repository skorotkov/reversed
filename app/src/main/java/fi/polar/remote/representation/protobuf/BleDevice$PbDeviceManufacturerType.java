package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum BleDevice$PbDeviceManufacturerType implements ProtocolMessageEnum {
   MANUFACTURER_OTHER(2),
   MANUFACTURER_POLAR(1);

   public static final int MANUFACTURER_OTHER_VALUE = 2;
   public static final int MANUFACTURER_POLAR_VALUE = 1;
   private static final BleDevice$PbDeviceManufacturerType[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new BleDevice$PbDeviceManufacturerType$1();
   private final int value;

   private BleDevice$PbDeviceManufacturerType(int var3) {
      this.value = var3;
   }

   public static BleDevice$PbDeviceManufacturerType forNumber(int var0) {
      BleDevice$PbDeviceManufacturerType var1;
      switch(var0) {
      case 1:
         var1 = MANUFACTURER_POLAR;
         break;
      case 2:
         var1 = MANUFACTURER_OTHER;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)BleDevice.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static BleDevice$PbDeviceManufacturerType valueOf(int var0) {
      return forNumber(var0);
   }

   public static BleDevice$PbDeviceManufacturerType valueOf(EnumValueDescriptor var0) {
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
