package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum BleDevice$PbBleDevice$PbBleKeyType implements ProtocolMessageEnum {
   BLE_LOCAL_ENCRYPTION_KEY(8), BLE_LOCAL_IDENTIFICATION_KEY(16), BLE_LOCAL_SIGNING_KEY(32),
   BLE_PEER_ENCRYPTION_KEY(1), BLE_PEER_IDENTIFICATION_KEY(2), BLE_PEER_SIGNING_KEY(4);

   public static final int BLE_LOCAL_ENCRYPTION_KEY_VALUE = 8;
//   BLE_LOCAL_IDENTIFICATION_KEY(16);

   public static final int BLE_LOCAL_IDENTIFICATION_KEY_VALUE = 16;
//   BLE_LOCAL_SIGNING_KEY(32);

   public static final int BLE_LOCAL_SIGNING_KEY_VALUE = 32;
//   BLE_PEER_ENCRYPTION_KEY(1);

   public static final int BLE_PEER_ENCRYPTION_KEY_VALUE = 1;
//   BLE_PEER_IDENTIFICATION_KEY(2);

   public static final int BLE_PEER_IDENTIFICATION_KEY_VALUE = 2;
//   BLE_PEER_SIGNING_KEY(4);

   public static final int BLE_PEER_SIGNING_KEY_VALUE = 4;
   private static final BleDevice$PbBleDevice$PbBleKeyType[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new BleDevice$PbBleDevice$PbBleKeyType$1();
   private final int value;

   private BleDevice$PbBleDevice$PbBleKeyType(int var3) {
      this.value = var3;
   }

   public static BleDevice$PbBleDevice$PbBleKeyType forNumber(int var0) {
      BleDevice$PbBleDevice$PbBleKeyType var1;
      switch(var0) {
      case 1:
         var1 = BLE_PEER_ENCRYPTION_KEY;
         break;
      case 2:
         var1 = BLE_PEER_IDENTIFICATION_KEY;
         break;
      case 4:
         var1 = BLE_PEER_SIGNING_KEY;
         break;
      case 8:
         var1 = BLE_LOCAL_ENCRYPTION_KEY;
         break;
      case 16:
         var1 = BLE_LOCAL_IDENTIFICATION_KEY;
         break;
      case 32:
         var1 = BLE_LOCAL_SIGNING_KEY;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)BleDevice$PbBleDevice.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static BleDevice$PbBleDevice$PbBleKeyType valueOf(int var0) {
      return forNumber(var0);
   }

   public static BleDevice$PbBleDevice$PbBleKeyType valueOf(EnumValueDescriptor var0) {
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
