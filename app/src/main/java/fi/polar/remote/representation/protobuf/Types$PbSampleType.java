package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbSampleType implements ProtocolMessageEnum {
   SAMPLE_TYPE_ACCELERATION_MAD(17);

   public static final int SAMPLE_TYPE_ACCELERATION_MAD_VALUE = 17;
   SAMPLE_TYPE_ALTITUDE(3),
   SAMPLE_TYPE_ALTITUDE_CALIBRATION(4);

   public static final int SAMPLE_TYPE_ALTITUDE_CALIBRATION_VALUE = 4;
   public static final int SAMPLE_TYPE_ALTITUDE_VALUE = 3;
   SAMPLE_TYPE_CADENCE(2);

   public static final int SAMPLE_TYPE_CADENCE_VALUE = 2;
   SAMPLE_TYPE_DISTANCE(7);

   public static final int SAMPLE_TYPE_DISTANCE_VALUE = 7;
   SAMPLE_TYPE_FORWARD_ACCELERATION(10);

   public static final int SAMPLE_TYPE_FORWARD_ACCELERATION_VALUE = 10;
   SAMPLE_TYPE_HEART_RATE(1);

   public static final int SAMPLE_TYPE_HEART_RATE_VALUE = 1;
   SAMPLE_TYPE_LEFT_PEDAL_POWER(12),
   SAMPLE_TYPE_LEFT_PEDAL_POWER_CALIBRATION(14);

   public static final int SAMPLE_TYPE_LEFT_PEDAL_POWER_CALIBRATION_VALUE = 14;
   public static final int SAMPLE_TYPE_LEFT_PEDAL_POWER_VALUE = 12;
   SAMPLE_TYPE_MOVING_TYPE(11);

   public static final int SAMPLE_TYPE_MOVING_TYPE_VALUE = 11;
   SAMPLE_TYPE_RIGHT_PEDAL_POWER(13),
   SAMPLE_TYPE_RIGHT_PEDAL_POWER_CALIBRATION(15);

   public static final int SAMPLE_TYPE_RIGHT_PEDAL_POWER_CALIBRATION_VALUE = 15;
   public static final int SAMPLE_TYPE_RIGHT_PEDAL_POWER_VALUE = 13;
   SAMPLE_TYPE_RR_INTERVAL(16);

   public static final int SAMPLE_TYPE_RR_INTERVAL_VALUE = 16;
   SAMPLE_TYPE_SPEED(6);

   public static final int SAMPLE_TYPE_SPEED_VALUE = 6;
   SAMPLE_TYPE_STRIDE_CALIBRATION(9);

   public static final int SAMPLE_TYPE_STRIDE_CALIBRATION_VALUE = 9;
   SAMPLE_TYPE_STRIDE_LENGTH(8);

   public static final int SAMPLE_TYPE_STRIDE_LENGTH_VALUE = 8;
   SAMPLE_TYPE_TEMPERATURE(5);

   public static final int SAMPLE_TYPE_TEMPERATURE_VALUE = 5;
   SAMPLE_TYPE_UNDEFINED(0);

   public static final int SAMPLE_TYPE_UNDEFINED_VALUE = 0;
   private static final Types$PbSampleType[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbSampleType$1();
   private final int value;

   private Types$PbSampleType(int var3) {
      this.value = var3;
   }

   public static Types$PbSampleType forNumber(int var0) {
      Types$PbSampleType var1;
      switch(var0) {
      case 0:
         var1 = SAMPLE_TYPE_UNDEFINED;
         break;
      case 1:
         var1 = SAMPLE_TYPE_HEART_RATE;
         break;
      case 2:
         var1 = SAMPLE_TYPE_CADENCE;
         break;
      case 3:
         var1 = SAMPLE_TYPE_ALTITUDE;
         break;
      case 4:
         var1 = SAMPLE_TYPE_ALTITUDE_CALIBRATION;
         break;
      case 5:
         var1 = SAMPLE_TYPE_TEMPERATURE;
         break;
      case 6:
         var1 = SAMPLE_TYPE_SPEED;
         break;
      case 7:
         var1 = SAMPLE_TYPE_DISTANCE;
         break;
      case 8:
         var1 = SAMPLE_TYPE_STRIDE_LENGTH;
         break;
      case 9:
         var1 = SAMPLE_TYPE_STRIDE_CALIBRATION;
         break;
      case 10:
         var1 = SAMPLE_TYPE_FORWARD_ACCELERATION;
         break;
      case 11:
         var1 = SAMPLE_TYPE_MOVING_TYPE;
         break;
      case 12:
         var1 = SAMPLE_TYPE_LEFT_PEDAL_POWER;
         break;
      case 13:
         var1 = SAMPLE_TYPE_RIGHT_PEDAL_POWER;
         break;
      case 14:
         var1 = SAMPLE_TYPE_LEFT_PEDAL_POWER_CALIBRATION;
         break;
      case 15:
         var1 = SAMPLE_TYPE_RIGHT_PEDAL_POWER_CALIBRATION;
         break;
      case 16:
         var1 = SAMPLE_TYPE_RR_INTERVAL;
         break;
      case 17:
         var1 = SAMPLE_TYPE_ACCELERATION_MAD;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(22);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbSampleType valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbSampleType valueOf(EnumValueDescriptor var0) {
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
