package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbStrideSensorCalibSettings$PbRunningFactorSource implements ProtocolMessageEnum {
   RUNNING_FACTOR_SOURCE_AUTO_CALIBRATION(1);

   public static final int RUNNING_FACTOR_SOURCE_AUTO_CALIBRATION_VALUE = 1;
   RUNNING_FACTOR_SOURCE_DEFAULT(0);

   public static final int RUNNING_FACTOR_SOURCE_DEFAULT_VALUE = 0;
   RUNNING_FACTOR_SOURCE_MANUAL_CALIBRATION(2);

   public static final int RUNNING_FACTOR_SOURCE_MANUAL_CALIBRATION_VALUE = 2;
   private static final Types$PbStrideSensorCalibSettings$PbRunningFactorSource[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbStrideSensorCalibSettings$PbRunningFactorSource$1();
   private final int value;

   private Types$PbStrideSensorCalibSettings$PbRunningFactorSource(int var3) {
      this.value = var3;
   }

   public static Types$PbStrideSensorCalibSettings$PbRunningFactorSource forNumber(int var0) {
      Types$PbStrideSensorCalibSettings$PbRunningFactorSource var1;
      switch(var0) {
      case 0:
         var1 = RUNNING_FACTOR_SOURCE_DEFAULT;
         break;
      case 1:
         var1 = RUNNING_FACTOR_SOURCE_AUTO_CALIBRATION;
         break;
      case 2:
         var1 = RUNNING_FACTOR_SOURCE_MANUAL_CALIBRATION;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types$PbStrideSensorCalibSettings.getDescriptor().getEnumTypes().get(1);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbStrideSensorCalibSettings$PbRunningFactorSource valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbStrideSensorCalibSettings$PbRunningFactorSource valueOf(EnumValueDescriptor var0) {
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
