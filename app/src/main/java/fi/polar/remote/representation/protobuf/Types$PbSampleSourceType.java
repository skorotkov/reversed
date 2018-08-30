package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbSampleSourceType implements ProtocolMessageEnum {
   SAMPLE_SOURCE_TYPE_BIKE_CRANK(12),

//   public static final int SAMPLE_SOURCE_TYPE_BIKE_CRANK_VALUE = 12;
   SAMPLE_SOURCE_TYPE_BIKE_PEDAL(10),

//   public static final int SAMPLE_SOURCE_TYPE_BIKE_PEDAL_VALUE = 10;
   SAMPLE_SOURCE_TYPE_BIKE_WHEEL(11),

//   public static final int SAMPLE_SOURCE_TYPE_BIKE_WHEEL_VALUE = 11;
   SAMPLE_SOURCE_TYPE_CHEST_METRICS(9),

//   public static final int SAMPLE_SOURCE_TYPE_CHEST_METRICS_VALUE = 9;
   SAMPLE_SOURCE_TYPE_COMBINED_CHEST_METRICS_AND_GPS(13),

//   public static final int SAMPLE_SOURCE_TYPE_COMBINED_CHEST_METRICS_AND_GPS_VALUE = 13;
   SAMPLE_SOURCE_TYPE_COMBINED_UPPER_BACK_METRICS_AND_GPS(15),

//   public static final int SAMPLE_SOURCE_TYPE_COMBINED_UPPER_BACK_METRICS_AND_GPS_VALUE = 15;
   SAMPLE_SOURCE_TYPE_GPS(6),

//   public static final int SAMPLE_SOURCE_TYPE_GPS_VALUE = 6;
   SAMPLE_SOURCE_TYPE_HEART_RATE(2),
   SAMPLE_SOURCE_TYPE_HEART_RATE_5_KHZ(4),

//   public static final int SAMPLE_SOURCE_TYPE_HEART_RATE_5_KHZ_VALUE = 4;
   SAMPLE_SOURCE_TYPE_HEART_RATE_BLE(3),

//   public static final int SAMPLE_SOURCE_TYPE_HEART_RATE_BLE_VALUE = 3;
   SAMPLE_SOURCE_TYPE_HEART_RATE_OPTICAL(5),

//   public static final int SAMPLE_SOURCE_TYPE_HEART_RATE_OPTICAL_VALUE = 5;
//   public static final int SAMPLE_SOURCE_TYPE_HEART_RATE_VALUE = 2;
   SAMPLE_SOURCE_TYPE_OFFLINE(1),

//   public static final int SAMPLE_SOURCE_TYPE_OFFLINE_VALUE = 1;
   SAMPLE_SOURCE_TYPE_STRIDE(7),

//   public static final int SAMPLE_SOURCE_TYPE_STRIDE_VALUE = 7;
   SAMPLE_SOURCE_TYPE_UNDEFINED(0),

//   public static final int SAMPLE_SOURCE_TYPE_UNDEFINED_VALUE = 0;
   SAMPLE_SOURCE_TYPE_UPPER_BACK_METRICS(14),

//   public static final int SAMPLE_SOURCE_TYPE_UPPER_BACK_METRICS_VALUE = 14;
   SAMPLE_SOURCE_TYPE_WRIST_METRICS(8);

//   public static final int SAMPLE_SOURCE_TYPE_WRIST_METRICS_VALUE = 8;
   private static final Types$PbSampleSourceType[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbSampleSourceType$1();
   private final int value;

   private Types$PbSampleSourceType(int var3) {
      this.value = var3;
   }

   public static Types$PbSampleSourceType forNumber(int var0) {
      Types$PbSampleSourceType var1;
      switch(var0) {
      case 0:
         var1 = SAMPLE_SOURCE_TYPE_UNDEFINED;
         break;
      case 1:
         var1 = SAMPLE_SOURCE_TYPE_OFFLINE;
         break;
      case 2:
         var1 = SAMPLE_SOURCE_TYPE_HEART_RATE;
         break;
      case 3:
         var1 = SAMPLE_SOURCE_TYPE_HEART_RATE_BLE;
         break;
      case 4:
         var1 = SAMPLE_SOURCE_TYPE_HEART_RATE_5_KHZ;
         break;
      case 5:
         var1 = SAMPLE_SOURCE_TYPE_HEART_RATE_OPTICAL;
         break;
      case 6:
         var1 = SAMPLE_SOURCE_TYPE_GPS;
         break;
      case 7:
         var1 = SAMPLE_SOURCE_TYPE_STRIDE;
         break;
      case 8:
         var1 = SAMPLE_SOURCE_TYPE_WRIST_METRICS;
         break;
      case 9:
         var1 = SAMPLE_SOURCE_TYPE_CHEST_METRICS;
         break;
      case 10:
         var1 = SAMPLE_SOURCE_TYPE_BIKE_PEDAL;
         break;
      case 11:
         var1 = SAMPLE_SOURCE_TYPE_BIKE_WHEEL;
         break;
      case 12:
         var1 = SAMPLE_SOURCE_TYPE_BIKE_CRANK;
         break;
      case 13:
         var1 = SAMPLE_SOURCE_TYPE_COMBINED_CHEST_METRICS_AND_GPS;
         break;
      case 14:
         var1 = SAMPLE_SOURCE_TYPE_UPPER_BACK_METRICS;
         break;
      case 15:
         var1 = SAMPLE_SOURCE_TYPE_COMBINED_UPPER_BACK_METRICS_AND_GPS;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(23);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbSampleSourceType valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbSampleSourceType valueOf(EnumValueDescriptor var0) {
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
