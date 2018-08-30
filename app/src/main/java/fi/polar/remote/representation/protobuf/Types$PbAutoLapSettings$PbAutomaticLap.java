package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbAutoLapSettings$PbAutomaticLap implements ProtocolMessageEnum {
   AUTOMATIC_LAP_DISTANCE(2),

   AUTOMATIC_LAP_DURATION(3),

   AUTOMATIC_LAP_LOCATION(4),

   AUTOMATIC_LAP_OFF(1);

   public static final int AUTOMATIC_LAP_LOCATION_VALUE = 4;
   public static final int AUTOMATIC_LAP_DURATION_VALUE = 3;
   public static final int AUTOMATIC_LAP_DISTANCE_VALUE = 2;
   public static final int AUTOMATIC_LAP_OFF_VALUE = 1;
   private static final Types$PbAutoLapSettings$PbAutomaticLap[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbAutoLapSettings$PbAutomaticLap$1();
   private final int value;

   private Types$PbAutoLapSettings$PbAutomaticLap(int var3) {
      this.value = var3;
   }

   public static Types$PbAutoLapSettings$PbAutomaticLap forNumber(int var0) {
      Types$PbAutoLapSettings$PbAutomaticLap var1;
      switch(var0) {
      case 1:
         var1 = AUTOMATIC_LAP_OFF;
         break;
      case 2:
         var1 = AUTOMATIC_LAP_DISTANCE;
         break;
      case 3:
         var1 = AUTOMATIC_LAP_DURATION;
         break;
      case 4:
         var1 = AUTOMATIC_LAP_LOCATION;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types$PbAutoLapSettings.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbAutoLapSettings$PbAutomaticLap valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbAutoLapSettings$PbAutomaticLap valueOf(EnumValueDescriptor var0) {
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
