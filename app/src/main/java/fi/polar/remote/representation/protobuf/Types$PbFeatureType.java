package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbFeatureType implements ProtocolMessageEnum {
   FEATURE_TYPE_ACTIVITY(12),

//   public static final int FEATURE_TYPE_ACTIVITY_VALUE = 12;
   FEATURE_TYPE_ALTITUDE(10),

//   public static final int FEATURE_TYPE_ALTITUDE_VALUE = 10;
   FEATURE_TYPE_AS_CADENCE(23),

//   public static final int FEATURE_TYPE_AS_CADENCE_VALUE = 23;
   FEATURE_TYPE_AS_DISTANCE(24),

//   public static final int FEATURE_TYPE_AS_DISTANCE_VALUE = 24;
   FEATURE_TYPE_AS_SPEED(22),

//   public static final int FEATURE_TYPE_AS_SPEED_VALUE = 22;
   FEATURE_TYPE_AS_SWR_STATE(25),

//   public static final int FEATURE_TYPE_AS_SWR_STATE_VALUE = 25;
   FEATURE_TYPE_BATTERY_LEVEL(26),

//   public static final int FEATURE_TYPE_BATTERY_LEVEL_VALUE = 26;
   FEATURE_TYPE_BIKE_CADENCE(5),

//   public static final int FEATURE_TYPE_BIKE_CADENCE_VALUE = 5;
   FEATURE_TYPE_BIKE_CRANK_REVOLUTION(21),

//   public static final int FEATURE_TYPE_BIKE_CRANK_REVOLUTION_VALUE = 21;
   FEATURE_TYPE_BIKE_POWER(6),

//   public static final int FEATURE_TYPE_BIKE_POWER_VALUE = 6;
   FEATURE_TYPE_BIKE_WHEEL_REVOLUTION(20),

//   public static final int FEATURE_TYPE_BIKE_WHEEL_REVOLUTION_VALUE = 20;
   FEATURE_TYPE_COMPASS_HEADING(16),

//   public static final int FEATURE_TYPE_COMPASS_HEADING_VALUE = 16;
   FEATURE_TYPE_DISTANCE(4),

//   public static final int FEATURE_TYPE_DISTANCE_VALUE = 4;
   FEATURE_TYPE_FILE_TRANSFER(27),

//   public static final int FEATURE_TYPE_FILE_TRANSFER_VALUE = 27;
   FEATURE_TYPE_GOPRO(31),

//   public static final int FEATURE_TYPE_GOPRO_VALUE = 31;
   FEATURE_TYPE_GPS_ALTITUDE(19),

//   public static final int FEATURE_TYPE_GPS_ALTITUDE_VALUE = 19;
   FEATURE_TYPE_GPS_DISTANCE(18),

//   public static final int FEATURE_TYPE_GPS_DISTANCE_VALUE = 18;
   FEATURE_TYPE_GPS_LOCATION(7),

//   public static final int FEATURE_TYPE_GPS_LOCATION_VALUE = 7;
   FEATURE_TYPE_GPS_SPEED(17),

//   public static final int FEATURE_TYPE_GPS_SPEED_VALUE = 17;
   FEATURE_TYPE_HEART_RATE(1),

//   public static final int FEATURE_TYPE_HEART_RATE_VALUE = 1;
   FEATURE_TYPE_JUMP_HEIGTH(15),

//   public static final int FEATURE_TYPE_JUMP_HEIGTH_VALUE = 15;
   FEATURE_TYPE_PRESS_TEMPERATURE(9),

//   public static final int FEATURE_TYPE_PRESS_TEMPERATURE_VALUE = 9;
   FEATURE_TYPE_PUSH_NOTIFICATIONS(28),

//   public static final int FEATURE_TYPE_PUSH_NOTIFICATIONS_VALUE = 28;
   FEATURE_TYPE_REMOTE_BUTTONS(30),

//   public static final int FEATURE_TYPE_REMOTE_BUTTONS_VALUE = 30;
   FEATURE_TYPE_RR_INTERVAL(2),

//   public static final int FEATURE_TYPE_RR_INTERVAL_VALUE = 2;
   FEATURE_TYPE_RSC_MOVING_TYPE(14),

//   public static final int FEATURE_TYPE_RSC_MOVING_TYPE_VALUE = 14;
   FEATURE_TYPE_RUNNING_CADENCE(8),

//   public static final int FEATURE_TYPE_RUNNING_CADENCE_VALUE = 8;
   FEATURE_TYPE_SPEED(3),

//   public static final int FEATURE_TYPE_SPEED_VALUE = 3;
   FEATURE_TYPE_STEPS(11),

//   public static final int FEATURE_TYPE_STEPS_VALUE = 11;
   FEATURE_TYPE_STRIDE_LENGTH(13),

//   public static final int FEATURE_TYPE_STRIDE_LENGTH_VALUE = 13;
   FEATURE_TYPE_WEIGHT_SCALE(29);

//   public static final int FEATURE_TYPE_WEIGHT_SCALE_VALUE = 29;
   private static final Types$PbFeatureType[] VALUES = values();
   private static final EnumLiteMap internalValueMap = new Types$PbFeatureType$1();
   private final int value;

   private Types$PbFeatureType(int var3) {
      this.value = var3;
   }

   public static Types$PbFeatureType forNumber(int var0) {
      Types$PbFeatureType var1;
      switch(var0) {
      case 1:
         var1 = FEATURE_TYPE_HEART_RATE;
         break;
      case 2:
         var1 = FEATURE_TYPE_RR_INTERVAL;
         break;
      case 3:
         var1 = FEATURE_TYPE_SPEED;
         break;
      case 4:
         var1 = FEATURE_TYPE_DISTANCE;
         break;
      case 5:
         var1 = FEATURE_TYPE_BIKE_CADENCE;
         break;
      case 6:
         var1 = FEATURE_TYPE_BIKE_POWER;
         break;
      case 7:
         var1 = FEATURE_TYPE_GPS_LOCATION;
         break;
      case 8:
         var1 = FEATURE_TYPE_RUNNING_CADENCE;
         break;
      case 9:
         var1 = FEATURE_TYPE_PRESS_TEMPERATURE;
         break;
      case 10:
         var1 = FEATURE_TYPE_ALTITUDE;
         break;
      case 11:
         var1 = FEATURE_TYPE_STEPS;
         break;
      case 12:
         var1 = FEATURE_TYPE_ACTIVITY;
         break;
      case 13:
         var1 = FEATURE_TYPE_STRIDE_LENGTH;
         break;
      case 14:
         var1 = FEATURE_TYPE_RSC_MOVING_TYPE;
         break;
      case 15:
         var1 = FEATURE_TYPE_JUMP_HEIGTH;
         break;
      case 16:
         var1 = FEATURE_TYPE_COMPASS_HEADING;
         break;
      case 17:
         var1 = FEATURE_TYPE_GPS_SPEED;
         break;
      case 18:
         var1 = FEATURE_TYPE_GPS_DISTANCE;
         break;
      case 19:
         var1 = FEATURE_TYPE_GPS_ALTITUDE;
         break;
      case 20:
         var1 = FEATURE_TYPE_BIKE_WHEEL_REVOLUTION;
         break;
      case 21:
         var1 = FEATURE_TYPE_BIKE_CRANK_REVOLUTION;
         break;
      case 22:
         var1 = FEATURE_TYPE_AS_SPEED;
         break;
      case 23:
         var1 = FEATURE_TYPE_AS_CADENCE;
         break;
      case 24:
         var1 = FEATURE_TYPE_AS_DISTANCE;
         break;
      case 25:
         var1 = FEATURE_TYPE_AS_SWR_STATE;
         break;
      case 26:
         var1 = FEATURE_TYPE_BATTERY_LEVEL;
         break;
      case 27:
         var1 = FEATURE_TYPE_FILE_TRANSFER;
         break;
      case 28:
         var1 = FEATURE_TYPE_PUSH_NOTIFICATIONS;
         break;
      case 29:
         var1 = FEATURE_TYPE_WEIGHT_SCALE;
         break;
      case 30:
         var1 = FEATURE_TYPE_REMOTE_BUTTONS;
         break;
      case 31:
         var1 = FEATURE_TYPE_GOPRO;
         break;
      default:
         var1 = null;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(9);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbFeatureType valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbFeatureType valueOf(EnumValueDescriptor var0) {
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
