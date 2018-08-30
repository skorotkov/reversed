package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum Types$PbDataType implements ProtocolMessageEnum {
   ACCELERATION(69);

   public static final int ACCELERATION_VALUE = 69;
   ACTIVITY(30);

   public static final int ACTIVITY_VALUE = 30;
   ALTITUDE(25);

   public static final int ALTITUDE_VALUE = 25;
   ANGLE_DEGREE(71);

   public static final int ANGLE_DEGREE_VALUE = 71;
   ASCENT(55);

   public static final int ASCENT_VALUE = 55;
   CADENCE(24);

   public static final int CADENCE_VALUE = 24;
   CALORIES(74);

   public static final int CALORIES_VALUE = 74;
   CRANK_LENGTH(70);

   public static final int CRANK_LENGTH_VALUE = 70;
   CUMULATED_ACTIVITY_DAY(61);

   public static final int CUMULATED_ACTIVITY_DAY_VALUE = 61;
   DAY(8);

   public static final int DAY_VALUE = 8;
   DECLINE(33);

   public static final int DECLINE_VALUE = 33;
   DESCENT(56);

   public static final int DESCENT_VALUE = 56;
   DISTANCE(52);

   public static final int DISTANCE_VALUE = 52;
   ENERGY(53);

   public static final int ENERGY_VALUE = 53;
   ENUM(2);

   public static final int ENUM_VALUE = 2;
   EXERCISE_TARGET_INDEX(65);

   public static final int EXERCISE_TARGET_INDEX_VALUE = 65;
   FAT_PERCENTS(54);

   public static final int FAT_PERCENTS_VALUE = 54;
   FITNESS_CLASS(68);

   public static final int FITNESS_CLASS_VALUE = 68;
   FUNCTIONAL_THRESHOLD_POWER(73);

   public static final int FUNCTIONAL_THRESHOLD_POWER_VALUE = 73;
   HEARTRATE(20);

   public static final int HEARTRATE_VALUE = 20;
   HEIGHT(12);

   public static final int HEIGHT_VALUE = 12;
   HERTZ(59);

   public static final int HERTZ_VALUE = 59;
   HOUR(6),
   HOURS(7);

   public static final int HOURS_VALUE = 7;
   public static final int HOUR_VALUE = 6;
   HR_PERCENT(21);

   public static final int HR_PERCENT_VALUE = 21;
   HR_RESERVE(22);

   public static final int HR_RESERVE_VALUE = 22;
   INCLINE(32);

   public static final int INCLINE_VALUE = 32;
   INHERITED(1);

   public static final int INHERITED_VALUE = 1;
   LATITUDE(57);

   public static final int LATITUDE_VALUE = 57;
   LONGITUDE(58);

   public static final int LONGITUDE_VALUE = 58;
   MILLIS(3);

   public static final int MILLIS_VALUE = 3;
   MINUTE(5);

   public static final int MINUTE_VALUE = 5;
   MONTH(9);

   public static final int MONTH_VALUE = 9;
   NEWTON(72);

   public static final int NEWTON_VALUE = 72;
   PERCENT(60);

   public static final int PERCENT_VALUE = 60;
   POWER(26),
   POWER_LRB(27);

   public static final int POWER_LRB_VALUE = 27;
   POWER_PI(28);

   public static final int POWER_PI_VALUE = 28;
   public static final int POWER_VALUE = 26;
   RR_INTERVAL(63);

   public static final int RR_INTERVAL_VALUE = 63;
   RUNNING_INDEX(62);

   public static final int RUNNING_INDEX_VALUE = 62;
   SECOND(4);

   public static final int SECOND_VALUE = 4;
   SPEED(23),
   SPEED_CALIBRATION_OFFSET(75);

   public static final int SPEED_CALIBRATION_OFFSET_VALUE = 75;
   public static final int SPEED_VALUE = 23;
   STRIDE_LENGTH(31);

   public static final int STRIDE_LENGTH_VALUE = 31;
   TEMPERATURE(29);

   public static final int TEMPERATURE_VALUE = 29;
   TIME_ZONE_OFFSET(66);

   public static final int TIME_ZONE_OFFSET_VALUE = 66;
   UNDEFINED(0);

   public static final int UNDEFINED_VALUE = 0;
   private static final Types$PbDataType[] VALUES = values();
   VO2MAX(13);

   public static final int VO2MAX_VALUE = 13;
   WEEK(76);

   public static final int WEEK_VALUE = 76;
   WEIGHT(11);

   public static final int WEIGHT_VALUE = 11;
   WHEEL_SIZE(67);

   public static final int WHEEL_SIZE_VALUE = 67;
   YEAR(10);

   public static final int YEAR_VALUE = 10;
   Z_INDEX(64);

   public static final int Z_INDEX_VALUE = 64;
   private static final EnumLiteMap internalValueMap = new Types$PbDataType$1();
   private final int value;

   private Types$PbDataType(int var3) {
      this.value = var3;
   }

   public static Types$PbDataType forNumber(int var0) {
      Types$PbDataType var1;
      switch(var0) {
      case 0:
         var1 = UNDEFINED;
         break;
      case 1:
         var1 = INHERITED;
         break;
      case 2:
         var1 = ENUM;
         break;
      case 3:
         var1 = MILLIS;
         break;
      case 4:
         var1 = SECOND;
         break;
      case 5:
         var1 = MINUTE;
         break;
      case 6:
         var1 = HOUR;
         break;
      case 7:
         var1 = HOURS;
         break;
      case 8:
         var1 = DAY;
         break;
      case 9:
         var1 = MONTH;
         break;
      case 10:
         var1 = YEAR;
         break;
      case 11:
         var1 = WEIGHT;
         break;
      case 12:
         var1 = HEIGHT;
         break;
      case 13:
         var1 = VO2MAX;
         break;
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 34:
      case 35:
      case 36:
      case 37:
      case 38:
      case 39:
      case 40:
      case 41:
      case 42:
      case 43:
      case 44:
      case 45:
      case 46:
      case 47:
      case 48:
      case 49:
      case 50:
      case 51:
      default:
         var1 = null;
         break;
      case 20:
         var1 = HEARTRATE;
         break;
      case 21:
         var1 = HR_PERCENT;
         break;
      case 22:
         var1 = HR_RESERVE;
         break;
      case 23:
         var1 = SPEED;
         break;
      case 24:
         var1 = CADENCE;
         break;
      case 25:
         var1 = ALTITUDE;
         break;
      case 26:
         var1 = POWER;
         break;
      case 27:
         var1 = POWER_LRB;
         break;
      case 28:
         var1 = POWER_PI;
         break;
      case 29:
         var1 = TEMPERATURE;
         break;
      case 30:
         var1 = ACTIVITY;
         break;
      case 31:
         var1 = STRIDE_LENGTH;
         break;
      case 32:
         var1 = INCLINE;
         break;
      case 33:
         var1 = DECLINE;
         break;
      case 52:
         var1 = DISTANCE;
         break;
      case 53:
         var1 = ENERGY;
         break;
      case 54:
         var1 = FAT_PERCENTS;
         break;
      case 55:
         var1 = ASCENT;
         break;
      case 56:
         var1 = DESCENT;
         break;
      case 57:
         var1 = LATITUDE;
         break;
      case 58:
         var1 = LONGITUDE;
         break;
      case 59:
         var1 = HERTZ;
         break;
      case 60:
         var1 = PERCENT;
         break;
      case 61:
         var1 = CUMULATED_ACTIVITY_DAY;
         break;
      case 62:
         var1 = RUNNING_INDEX;
         break;
      case 63:
         var1 = RR_INTERVAL;
         break;
      case 64:
         var1 = Z_INDEX;
         break;
      case 65:
         var1 = EXERCISE_TARGET_INDEX;
         break;
      case 66:
         var1 = TIME_ZONE_OFFSET;
         break;
      case 67:
         var1 = WHEEL_SIZE;
         break;
      case 68:
         var1 = FITNESS_CLASS;
         break;
      case 69:
         var1 = ACCELERATION;
         break;
      case 70:
         var1 = CRANK_LENGTH;
         break;
      case 71:
         var1 = ANGLE_DEGREE;
         break;
      case 72:
         var1 = NEWTON;
         break;
      case 73:
         var1 = FUNCTIONAL_THRESHOLD_POWER;
         break;
      case 74:
         var1 = CALORIES;
         break;
      case 75:
         var1 = SPEED_CALIBRATION_OFFSET;
         break;
      case 76:
         var1 = WEEK;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)Types.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static Types$PbDataType valueOf(int var0) {
      return forNumber(var0);
   }

   public static Types$PbDataType valueOf(EnumValueDescriptor var0) {
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
