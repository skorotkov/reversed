package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum SportprofileDisplays$PbTrainingDisplayItem implements ProtocolMessageEnum {
   ALTITUDE(10);

   public static final int ALTITUDE_VALUE = 10;
   ASCENT(11);

   public static final int ASCENT_VALUE = 11;
   AVERAGE_CADENCE(50);

   public static final int AVERAGE_CADENCE_VALUE = 50;
   AVERAGE_HEART_RATE(21);

   public static final int AVERAGE_HEART_RATE_VALUE = 21;
   AVERAGE_POWER(60),
   AVERAGE_POWER_LEFT_RIGHT_BALANCE(62);

   public static final int AVERAGE_POWER_LEFT_RIGHT_BALANCE_VALUE = 62;
   public static final int AVERAGE_POWER_VALUE = 60;
   AVERAGE_STRIDE_LENGTH(55);

   public static final int AVERAGE_STRIDE_LENGTH_VALUE = 55;
   CADENCE(49);

   public static final int CADENCE_VALUE = 49;
   CALORIES(27);

   public static final int CALORIES_VALUE = 27;
   COOPER_DISTANCE_ESTIMATE(107);

   public static final int COOPER_DISTANCE_ESTIMATE_VALUE = 107;
   CURRENT_ALAP_ASCENT(206);

   public static final int CURRENT_ALAP_ASCENT_VALUE = 206;
   CURRENT_ALAP_AVERAGE_HEART_RATE(200);

   public static final int CURRENT_ALAP_AVERAGE_HEART_RATE_VALUE = 200;
   CURRENT_ALAP_AVERAGE_POWER(202),
   CURRENT_ALAP_AVERAGE_POWER_LR_BALANCE(209);

   public static final int CURRENT_ALAP_AVERAGE_POWER_LR_BALANCE_VALUE = 209;
   public static final int CURRENT_ALAP_AVERAGE_POWER_VALUE = 202;
   CURRENT_ALAP_CADENCE(208);

   public static final int CURRENT_ALAP_CADENCE_VALUE = 208;
   CURRENT_ALAP_DESCENT(207);

   public static final int CURRENT_ALAP_DESCENT_VALUE = 207;
   CURRENT_ALAP_DISTANCE(205);

   public static final int CURRENT_ALAP_DISTANCE_VALUE = 205;
   CURRENT_ALAP_MAXIMUM_POWER(203);

   public static final int CURRENT_ALAP_MAXIMUM_POWER_VALUE = 203;
   CURRENT_ALAP_MAX_CADENCE(212);

   public static final int CURRENT_ALAP_MAX_CADENCE_VALUE = 212;
   CURRENT_ALAP_MAX_HEART_RATE(210);

   public static final int CURRENT_ALAP_MAX_HEART_RATE_VALUE = 210;
   CURRENT_ALAP_MAX_SPEED(211);

   public static final int CURRENT_ALAP_MAX_SPEED_VALUE = 211;
   CURRENT_ALAP_NORMALIZED_POWER(213);

   public static final int CURRENT_ALAP_NORMALIZED_POWER_VALUE = 213;
   CURRENT_ALAP_POWER_INTENSITY_FACTOR(214);

   public static final int CURRENT_ALAP_POWER_INTENSITY_FACTOR_VALUE = 214;
   CURRENT_ALAP_POWER_TRAINING_STRESS_SCORE(222);

   public static final int CURRENT_ALAP_POWER_TRAINING_STRESS_SCORE_VALUE = 222;
   CURRENT_ALAP_SPEED_OR_PACE(204);

   public static final int CURRENT_ALAP_SPEED_OR_PACE_VALUE = 204;
   CURRENT_ALAP_TIME(201);

   public static final int CURRENT_ALAP_TIME_VALUE = 201;
   CURRENT_HEART_RATE(20);

   public static final int CURRENT_HEART_RATE_VALUE = 20;
   CURRENT_LAP_ASCENT(16);

   public static final int CURRENT_LAP_ASCENT_VALUE = 16;
   CURRENT_LAP_AVERAGE_HEART_RATE(24);

   public static final int CURRENT_LAP_AVERAGE_HEART_RATE_VALUE = 24;
   CURRENT_LAP_AVERAGE_POWER(63),
   CURRENT_LAP_AVERAGE_POWER_LR_BALANCE(65);

   public static final int CURRENT_LAP_AVERAGE_POWER_LR_BALANCE_VALUE = 65;
   public static final int CURRENT_LAP_AVERAGE_POWER_VALUE = 63;
   CURRENT_LAP_CADENCE(51);

   public static final int CURRENT_LAP_CADENCE_VALUE = 51;
   CURRENT_LAP_DESCENT(17);

   public static final int CURRENT_LAP_DESCENT_VALUE = 17;
   CURRENT_LAP_DISTANCE(38);

   public static final int CURRENT_LAP_DISTANCE_VALUE = 38;
   CURRENT_LAP_MAXIMUM_POWER(64);

   public static final int CURRENT_LAP_MAXIMUM_POWER_VALUE = 64;
   CURRENT_LAP_MAX_CADENCE(52);

   public static final int CURRENT_LAP_MAX_CADENCE_VALUE = 52;
   CURRENT_LAP_MAX_HEART_RATE(25);

   public static final int CURRENT_LAP_MAX_HEART_RATE_VALUE = 25;
   CURRENT_LAP_MAX_PACE_OR_SPEED(47);

   public static final int CURRENT_LAP_MAX_PACE_OR_SPEED_VALUE = 47;
   CURRENT_LAP_NORMALIZED_POWER(234);

   public static final int CURRENT_LAP_NORMALIZED_POWER_VALUE = 234;
   CURRENT_LAP_POWER_INTENSITY_FACTOR(235);

   public static final int CURRENT_LAP_POWER_INTENSITY_FACTOR_VALUE = 235;
   CURRENT_LAP_POWER_TRAINING_STRESS_SCORE(236);

   public static final int CURRENT_LAP_POWER_TRAINING_STRESS_SCORE_VALUE = 236;
   CURRENT_LAP_SPEED_OR_PACE(44);

   public static final int CURRENT_LAP_SPEED_OR_PACE_VALUE = 44;
   CURRENT_LAP_TIME(6);

   public static final int CURRENT_LAP_TIME_VALUE = 6;
   CURRENT_LAP_VAM(18);

   public static final int CURRENT_LAP_VAM_VALUE = 18;
   CURRENT_NORMALIZED_POWER(231);

   public static final int CURRENT_NORMALIZED_POWER_VALUE = 231;
   CURRENT_POWER(56),
   CURRENT_POWER_INTENSITY_FACTOR(232);

   public static final int CURRENT_POWER_INTENSITY_FACTOR_VALUE = 232;
   CURRENT_POWER_LEFT_RIGHT_BALANCE(57);

   public static final int CURRENT_POWER_LEFT_RIGHT_BALANCE_VALUE = 57;
   CURRENT_POWER_TRAINING_STRESS_SCORE(233);

   public static final int CURRENT_POWER_TRAINING_STRESS_SCORE_VALUE = 233;
   public static final int CURRENT_POWER_VALUE = 56;
   DESCENT(12);

   public static final int DESCENT_VALUE = 12;
   DIFFERENCE_TO_MARATHON_WR(106);

   public static final int DIFFERENCE_TO_MARATHON_WR_VALUE = 106;
   DISTANCE(37);

   public static final int DISTANCE_VALUE = 37;
   FORCE_GRAPH(104);

   public static final int FORCE_GRAPH_VALUE = 104;
   HEART_RATE_ZONES(100);

   public static final int HEART_RATE_ZONES_VALUE = 100;
   INCLINOMETER(13);

   public static final int INCLINOMETER_VALUE = 13;
   LAST_AUTOMATIC_LAP_TIME(8);

   public static final int LAST_AUTOMATIC_LAP_TIME_VALUE = 8;
   LAST_LAP_TIME(7);

   public static final int LAST_LAP_TIME_VALUE = 7;
   LOCATION_GUIDE(102);

   public static final int LOCATION_GUIDE_VALUE = 102;
   MAXIMUM_CADENCE(240);

   public static final int MAXIMUM_CADENCE_VALUE = 240;
   MAXIMUM_FORCE(58);

   public static final int MAXIMUM_FORCE_VALUE = 58;
   MAXIMUM_HEART_RATE(22);

   public static final int MAXIMUM_HEART_RATE_VALUE = 22;
   MAXIMUM_POWER(61);

   public static final int MAXIMUM_POWER_VALUE = 61;
   MULTISPORT_ASCENT(91);

   public static final int MULTISPORT_ASCENT_VALUE = 91;
   MULTISPORT_CALORIES(90);

   public static final int MULTISPORT_CALORIES_VALUE = 90;
   MULTISPORT_DESCENT(92);

   public static final int MULTISPORT_DESCENT_VALUE = 92;
   MULTISPORT_DISTANCE(89);

   public static final int MULTISPORT_DISTANCE_VALUE = 89;
   MULTISPORT_DURATION(88);

   public static final int MULTISPORT_DURATION_VALUE = 88;
   MULTISPORT_HEART_RATE_ZONES(101);

   public static final int MULTISPORT_HEART_RATE_ZONES_VALUE = 101;
   POOL_COUNTER(70);

   public static final int POOL_COUNTER_VALUE = 70;
   POWER_ZONES(103);

   public static final int POWER_ZONES_VALUE = 103;
   POWER_ZONE_POINTER(59);

   public static final int POWER_ZONE_POINTER_VALUE = 59;
   PREVIOUS_ALAP_AVERAGE_HEART_RATE(218);

   public static final int PREVIOUS_ALAP_AVERAGE_HEART_RATE_VALUE = 218;
   PREVIOUS_ALAP_DISTANCE(217);

   public static final int PREVIOUS_ALAP_DISTANCE_VALUE = 217;
   PREVIOUS_ALAP_MAX_HEART_RATE(219);

   public static final int PREVIOUS_ALAP_MAX_HEART_RATE_VALUE = 219;
   PREVIOUS_ALAP_MAX_SPEED(216);

   public static final int PREVIOUS_ALAP_MAX_SPEED_VALUE = 216;
   PREVIOUS_ALAP_SPEED_OR_PACE(215);

   public static final int PREVIOUS_ALAP_SPEED_OR_PACE_VALUE = 215;
   PREVIOUS_LAP_AVERAGE_HEART_RATE(26);

   public static final int PREVIOUS_LAP_AVERAGE_HEART_RATE_VALUE = 26;
   PREVIOUS_LAP_AVERAGE_POWER(67),
   PREVIOUS_LAP_AVERAGE_POWER_LR_BALANCE(230);

   public static final int PREVIOUS_LAP_AVERAGE_POWER_LR_BALANCE_VALUE = 230;
   public static final int PREVIOUS_LAP_AVERAGE_POWER_VALUE = 67;
   PREVIOUS_LAP_CADENCE(53);

   public static final int PREVIOUS_LAP_CADENCE_VALUE = 53;
   PREVIOUS_LAP_DISTANCE(39);

   public static final int PREVIOUS_LAP_DISTANCE_VALUE = 39;
   PREVIOUS_LAP_MAXIMUM_POWER(68);

   public static final int PREVIOUS_LAP_MAXIMUM_POWER_VALUE = 68;
   PREVIOUS_LAP_MAX_HEART_RATE(28);

   public static final int PREVIOUS_LAP_MAX_HEART_RATE_VALUE = 28;
   PREVIOUS_LAP_MAX_PACE_OR_SPEED(48);

   public static final int PREVIOUS_LAP_MAX_PACE_OR_SPEED_VALUE = 48;
   PREVIOUS_LAP_NORMALIZED_POWER(237);

   public static final int PREVIOUS_LAP_NORMALIZED_POWER_VALUE = 237;
   PREVIOUS_LAP_POWER_INTENSITY_FACTOR(238);

   public static final int PREVIOUS_LAP_POWER_INTENSITY_FACTOR_VALUE = 238;
   PREVIOUS_LAP_POWER_TRAINING_STRESS_SCORE(239);

   public static final int PREVIOUS_LAP_POWER_TRAINING_STRESS_SCORE_VALUE = 239;
   PREVIOUS_LAP_SPEED_OR_PACE(220);

   public static final int PREVIOUS_LAP_SPEED_OR_PACE_VALUE = 220;
   REST_TIME(69);

   public static final int REST_TIME_VALUE = 69;
   RR_VARIATION(35);

   public static final int RR_VARIATION_VALUE = 35;
   SPEED_OR_PACE(41),
   SPEED_OR_PACE_AVERAGE(42);

   public static final int SPEED_OR_PACE_AVERAGE_VALUE = 42;
   SPEED_OR_PACE_MAXIMUM(43);

   public static final int SPEED_OR_PACE_MAXIMUM_VALUE = 43;
   public static final int SPEED_OR_PACE_VALUE = 41;
   SPEED_ZONE_POINTER(45);

   public static final int SPEED_ZONE_POINTER_VALUE = 45;
   STOPWATCH(3);

   public static final int STOPWATCH_VALUE = 3;
   STRIDE_LENGTH(54);

   public static final int STRIDE_LENGTH_VALUE = 54;
   TEMPERATURE(15);

   public static final int TEMPERATURE_VALUE = 15;
   TIME_BASED_SPEED_ZONES(105);

   public static final int TIME_BASED_SPEED_ZONES_VALUE = 105;
   TIME_IN_POWER_ZONE(66);

   public static final int TIME_IN_POWER_ZONE_VALUE = 66;
   TIME_IN_SPEED_ZONE(46);

   public static final int TIME_IN_SPEED_ZONE_VALUE = 46;
   TIME_IN_ZONE(33);

   public static final int TIME_IN_ZONE_VALUE = 33;
   TIME_OF_DAY(2);

   public static final int TIME_OF_DAY_VALUE = 2;
   private static final SportprofileDisplays$PbTrainingDisplayItem[] VALUES = values();
   VERTICAL_SPEED_MOVING_AVERAGE(221);

   public static final int VERTICAL_SPEED_MOVING_AVERAGE_VALUE = 221;
   ZONE_POINTER(32);

   public static final int ZONE_POINTER_VALUE = 32;
   private static final EnumLiteMap internalValueMap = new SportprofileDisplays$PbTrainingDisplayItem$1();
   private final int value;

   private SportprofileDisplays$PbTrainingDisplayItem(int var3) {
      this.value = var3;
   }

   public static SportprofileDisplays$PbTrainingDisplayItem forNumber(int var0) {
      SportprofileDisplays$PbTrainingDisplayItem var1;
      switch(var0) {
      case 2:
         var1 = TIME_OF_DAY;
         break;
      case 3:
         var1 = STOPWATCH;
         break;
      case 4:
      case 5:
      case 9:
      case 14:
      case 19:
      case 23:
      case 29:
      case 30:
      case 31:
      case 34:
      case 36:
      case 40:
      case 71:
      case 72:
      case 73:
      case 74:
      case 75:
      case 76:
      case 77:
      case 78:
      case 79:
      case 80:
      case 81:
      case 82:
      case 83:
      case 84:
      case 85:
      case 86:
      case 87:
      case 93:
      case 94:
      case 95:
      case 96:
      case 97:
      case 98:
      case 99:
      case 108:
      case 109:
      case 110:
      case 111:
      case 112:
      case 113:
      case 114:
      case 115:
      case 116:
      case 117:
      case 118:
      case 119:
      case 120:
      case 121:
      case 122:
      case 123:
      case 124:
      case 125:
      case 126:
      case 127:
      case 128:
      case 129:
      case 130:
      case 131:
      case 132:
      case 133:
      case 134:
      case 135:
      case 136:
      case 137:
      case 138:
      case 139:
      case 140:
      case 141:
      case 142:
      case 143:
      case 144:
      case 145:
      case 146:
      case 147:
      case 148:
      case 149:
      case 150:
      case 151:
      case 152:
      case 153:
      case 154:
      case 155:
      case 156:
      case 157:
      case 158:
      case 159:
      case 160:
      case 161:
      case 162:
      case 163:
      case 164:
      case 165:
      case 166:
      case 167:
      case 168:
      case 169:
      case 170:
      case 171:
      case 172:
      case 173:
      case 174:
      case 175:
      case 176:
      case 177:
      case 178:
      case 179:
      case 180:
      case 181:
      case 182:
      case 183:
      case 184:
      case 185:
      case 186:
      case 187:
      case 188:
      case 189:
      case 190:
      case 191:
      case 192:
      case 193:
      case 194:
      case 195:
      case 196:
      case 197:
      case 198:
      case 199:
      case 223:
      case 224:
      case 225:
      case 226:
      case 227:
      case 228:
      case 229:
      default:
         var1 = null;
         break;
      case 6:
         var1 = CURRENT_LAP_TIME;
         break;
      case 7:
         var1 = LAST_LAP_TIME;
         break;
      case 8:
         var1 = LAST_AUTOMATIC_LAP_TIME;
         break;
      case 10:
         var1 = ALTITUDE;
         break;
      case 11:
         var1 = ASCENT;
         break;
      case 12:
         var1 = DESCENT;
         break;
      case 13:
         var1 = INCLINOMETER;
         break;
      case 15:
         var1 = TEMPERATURE;
         break;
      case 16:
         var1 = CURRENT_LAP_ASCENT;
         break;
      case 17:
         var1 = CURRENT_LAP_DESCENT;
         break;
      case 18:
         var1 = CURRENT_LAP_VAM;
         break;
      case 20:
         var1 = CURRENT_HEART_RATE;
         break;
      case 21:
         var1 = AVERAGE_HEART_RATE;
         break;
      case 22:
         var1 = MAXIMUM_HEART_RATE;
         break;
      case 24:
         var1 = CURRENT_LAP_AVERAGE_HEART_RATE;
         break;
      case 25:
         var1 = CURRENT_LAP_MAX_HEART_RATE;
         break;
      case 26:
         var1 = PREVIOUS_LAP_AVERAGE_HEART_RATE;
         break;
      case 27:
         var1 = CALORIES;
         break;
      case 28:
         var1 = PREVIOUS_LAP_MAX_HEART_RATE;
         break;
      case 32:
         var1 = ZONE_POINTER;
         break;
      case 33:
         var1 = TIME_IN_ZONE;
         break;
      case 35:
         var1 = RR_VARIATION;
         break;
      case 37:
         var1 = DISTANCE;
         break;
      case 38:
         var1 = CURRENT_LAP_DISTANCE;
         break;
      case 39:
         var1 = PREVIOUS_LAP_DISTANCE;
         break;
      case 41:
         var1 = SPEED_OR_PACE;
         break;
      case 42:
         var1 = SPEED_OR_PACE_AVERAGE;
         break;
      case 43:
         var1 = SPEED_OR_PACE_MAXIMUM;
         break;
      case 44:
         var1 = CURRENT_LAP_SPEED_OR_PACE;
         break;
      case 45:
         var1 = SPEED_ZONE_POINTER;
         break;
      case 46:
         var1 = TIME_IN_SPEED_ZONE;
         break;
      case 47:
         var1 = CURRENT_LAP_MAX_PACE_OR_SPEED;
         break;
      case 48:
         var1 = PREVIOUS_LAP_MAX_PACE_OR_SPEED;
         break;
      case 49:
         var1 = CADENCE;
         break;
      case 50:
         var1 = AVERAGE_CADENCE;
         break;
      case 51:
         var1 = CURRENT_LAP_CADENCE;
         break;
      case 52:
         var1 = CURRENT_LAP_MAX_CADENCE;
         break;
      case 53:
         var1 = PREVIOUS_LAP_CADENCE;
         break;
      case 54:
         var1 = STRIDE_LENGTH;
         break;
      case 55:
         var1 = AVERAGE_STRIDE_LENGTH;
         break;
      case 56:
         var1 = CURRENT_POWER;
         break;
      case 57:
         var1 = CURRENT_POWER_LEFT_RIGHT_BALANCE;
         break;
      case 58:
         var1 = MAXIMUM_FORCE;
         break;
      case 59:
         var1 = POWER_ZONE_POINTER;
         break;
      case 60:
         var1 = AVERAGE_POWER;
         break;
      case 61:
         var1 = MAXIMUM_POWER;
         break;
      case 62:
         var1 = AVERAGE_POWER_LEFT_RIGHT_BALANCE;
         break;
      case 63:
         var1 = CURRENT_LAP_AVERAGE_POWER;
         break;
      case 64:
         var1 = CURRENT_LAP_MAXIMUM_POWER;
         break;
      case 65:
         var1 = CURRENT_LAP_AVERAGE_POWER_LR_BALANCE;
         break;
      case 66:
         var1 = TIME_IN_POWER_ZONE;
         break;
      case 67:
         var1 = PREVIOUS_LAP_AVERAGE_POWER;
         break;
      case 68:
         var1 = PREVIOUS_LAP_MAXIMUM_POWER;
         break;
      case 69:
         var1 = REST_TIME;
         break;
      case 70:
         var1 = POOL_COUNTER;
         break;
      case 88:
         var1 = MULTISPORT_DURATION;
         break;
      case 89:
         var1 = MULTISPORT_DISTANCE;
         break;
      case 90:
         var1 = MULTISPORT_CALORIES;
         break;
      case 91:
         var1 = MULTISPORT_ASCENT;
         break;
      case 92:
         var1 = MULTISPORT_DESCENT;
         break;
      case 100:
         var1 = HEART_RATE_ZONES;
         break;
      case 101:
         var1 = MULTISPORT_HEART_RATE_ZONES;
         break;
      case 102:
         var1 = LOCATION_GUIDE;
         break;
      case 103:
         var1 = POWER_ZONES;
         break;
      case 104:
         var1 = FORCE_GRAPH;
         break;
      case 105:
         var1 = TIME_BASED_SPEED_ZONES;
         break;
      case 106:
         var1 = DIFFERENCE_TO_MARATHON_WR;
         break;
      case 107:
         var1 = COOPER_DISTANCE_ESTIMATE;
         break;
      case 200:
         var1 = CURRENT_ALAP_AVERAGE_HEART_RATE;
         break;
      case 201:
         var1 = CURRENT_ALAP_TIME;
         break;
      case 202:
         var1 = CURRENT_ALAP_AVERAGE_POWER;
         break;
      case 203:
         var1 = CURRENT_ALAP_MAXIMUM_POWER;
         break;
      case 204:
         var1 = CURRENT_ALAP_SPEED_OR_PACE;
         break;
      case 205:
         var1 = CURRENT_ALAP_DISTANCE;
         break;
      case 206:
         var1 = CURRENT_ALAP_ASCENT;
         break;
      case 207:
         var1 = CURRENT_ALAP_DESCENT;
         break;
      case 208:
         var1 = CURRENT_ALAP_CADENCE;
         break;
      case 209:
         var1 = CURRENT_ALAP_AVERAGE_POWER_LR_BALANCE;
         break;
      case 210:
         var1 = CURRENT_ALAP_MAX_HEART_RATE;
         break;
      case 211:
         var1 = CURRENT_ALAP_MAX_SPEED;
         break;
      case 212:
         var1 = CURRENT_ALAP_MAX_CADENCE;
         break;
      case 213:
         var1 = CURRENT_ALAP_NORMALIZED_POWER;
         break;
      case 214:
         var1 = CURRENT_ALAP_POWER_INTENSITY_FACTOR;
         break;
      case 215:
         var1 = PREVIOUS_ALAP_SPEED_OR_PACE;
         break;
      case 216:
         var1 = PREVIOUS_ALAP_MAX_SPEED;
         break;
      case 217:
         var1 = PREVIOUS_ALAP_DISTANCE;
         break;
      case 218:
         var1 = PREVIOUS_ALAP_AVERAGE_HEART_RATE;
         break;
      case 219:
         var1 = PREVIOUS_ALAP_MAX_HEART_RATE;
         break;
      case 220:
         var1 = PREVIOUS_LAP_SPEED_OR_PACE;
         break;
      case 221:
         var1 = VERTICAL_SPEED_MOVING_AVERAGE;
         break;
      case 222:
         var1 = CURRENT_ALAP_POWER_TRAINING_STRESS_SCORE;
         break;
      case 230:
         var1 = PREVIOUS_LAP_AVERAGE_POWER_LR_BALANCE;
         break;
      case 231:
         var1 = CURRENT_NORMALIZED_POWER;
         break;
      case 232:
         var1 = CURRENT_POWER_INTENSITY_FACTOR;
         break;
      case 233:
         var1 = CURRENT_POWER_TRAINING_STRESS_SCORE;
         break;
      case 234:
         var1 = CURRENT_LAP_NORMALIZED_POWER;
         break;
      case 235:
         var1 = CURRENT_LAP_POWER_INTENSITY_FACTOR;
         break;
      case 236:
         var1 = CURRENT_LAP_POWER_TRAINING_STRESS_SCORE;
         break;
      case 237:
         var1 = PREVIOUS_LAP_NORMALIZED_POWER;
         break;
      case 238:
         var1 = PREVIOUS_LAP_POWER_INTENSITY_FACTOR;
         break;
      case 239:
         var1 = PREVIOUS_LAP_POWER_TRAINING_STRESS_SCORE;
         break;
      case 240:
         var1 = MAXIMUM_CADENCE;
      }

      return var1;
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)SportprofileDisplays.getDescriptor().getEnumTypes().get(0);
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   @Deprecated
   public static SportprofileDisplays$PbTrainingDisplayItem valueOf(int var0) {
      return forNumber(var0);
   }

   public static SportprofileDisplays$PbTrainingDisplayItem valueOf(EnumValueDescriptor var0) {
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
