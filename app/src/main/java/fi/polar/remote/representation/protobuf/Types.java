package fi.polar.remote.representation.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Message;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessage.GeneratedExtension;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class Types {
   public static final int IS_UNION_FIELD_NUMBER = 50001;
   public static final int RANGE_FIELD_NUMBER = 50003;
   public static final int TYPE_FIELD_NUMBER = 50000;
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_PbAccelerationMetrics_descriptor;
   private static final FieldAccessorTable internal_static_PbAccelerationMetrics_fieldAccessorTable;
   private static final Descriptor internal_static_PbAutoLapSettings_descriptor;
   private static final FieldAccessorTable internal_static_PbAutoLapSettings_fieldAccessorTable;
   private static final Descriptor internal_static_PbAutoPause_descriptor;
   private static final FieldAccessorTable internal_static_PbAutoPause_fieldAccessorTable;
   private static final Descriptor internal_static_PbCalibrationSettings_descriptor;
   private static final FieldAccessorTable internal_static_PbCalibrationSettings_fieldAccessorTable;
   private static final Descriptor internal_static_PbDate_descriptor;
   private static final FieldAccessorTable internal_static_PbDate_fieldAccessorTable;
   private static final Descriptor internal_static_PbDuration_descriptor;
   private static final FieldAccessorTable internal_static_PbDuration_fieldAccessorTable;
   private static final Descriptor internal_static_PbLocalDateTime_descriptor;
   private static final FieldAccessorTable internal_static_PbLocalDateTime_fieldAccessorTable;
   private static final Descriptor internal_static_PbLocation_descriptor;
   private static final FieldAccessorTable internal_static_PbLocation_fieldAccessorTable;
   private static final Descriptor internal_static_PbRangeOptions_descriptor;
   private static final FieldAccessorTable internal_static_PbRangeOptions_fieldAccessorTable;
   private static final Descriptor internal_static_PbSampleSource_descriptor;
   private static final FieldAccessorTable internal_static_PbSampleSource_fieldAccessorTable;
   private static final Descriptor internal_static_PbSensorCalibrationOffset_descriptor;
   private static final FieldAccessorTable internal_static_PbSensorCalibrationOffset_fieldAccessorTable;
   private static final Descriptor internal_static_PbSensorOffline_descriptor;
   private static final FieldAccessorTable internal_static_PbSensorOffline_fieldAccessorTable;
   private static final Descriptor internal_static_PbStrideSensorCalibSettings_descriptor;
   private static final FieldAccessorTable internal_static_PbStrideSensorCalibSettings_fieldAccessorTable;
   private static final Descriptor internal_static_PbSystemDateTime_descriptor;
   private static final FieldAccessorTable internal_static_PbSystemDateTime_fieldAccessorTable;
   private static final Descriptor internal_static_PbTime_descriptor;
   private static final FieldAccessorTable internal_static_PbTime_fieldAccessorTable;
   private static final Descriptor internal_static_PbVolume_descriptor;
   private static final FieldAccessorTable internal_static_PbVolume_fieldAccessorTable;
   private static final Descriptor internal_static_PbWeek_descriptor;
   private static final FieldAccessorTable internal_static_PbWeek_fieldAccessorTable;
   public static final GeneratedExtension isUnion = GeneratedMessage.newFileScopedGeneratedExtension(Boolean.class, (Message)null);
   public static final GeneratedExtension range = GeneratedMessage.newFileScopedGeneratedExtension(Types$PbRangeOptions.class, Types$PbRangeOptions.getDefaultInstance());
   public static final GeneratedExtension type = GeneratedMessage.newFileScopedGeneratedExtension(Types$PbDataType.class, (Message)null);

   static {
      Types$1 var0 = new Types$1();
      FileDescriptor var1 = DescriptorProtos.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000btypes.proto\u001a google/protobuf/descriptor.proto\"6\n\u000ePbRangeOptions\u0012\u0011\n\tmin_value\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tmax_value\u0018\u0002 \u0001(\u0005\"D\n\u0006PbDate\u0012\u0012\n\u0004year\u0018\u0001 \u0002(\rB\u0004\u0080µ\u0018\n\u0012\u0013\n\u0005month\u0018\u0002 \u0002(\rB\u0004\u0080µ\u0018\t\u0012\u0011\n\u0003day\u0018\u0003 \u0002(\rB\u0004\u0080µ\u0018\b\"b\n\u0006PbTime\u0012\u0012\n\u0004hour\u0018\u0001 \u0002(\rB\u0004\u0080µ\u0018\u0006\u0012\u0014\n\u0006minute\u0018\u0002 \u0002(\rB\u0004\u0080µ\u0018\u0005\u0012\u0015\n\u0007seconds\u0018\u0003 \u0002(\rB\u0004\u0080µ\u0018\u0004\u0012\u0017\n\u0006millis\u0018\u0004 \u0001(\r:\u00010B\u0004\u0080µ\u0018\u0003\"Q\n\u0010PbSystemDateTime\u0012\u0015\n\u0004date\u0018\u0001 \u0002(\u000b2\u0007.PbDate\u0012\u0015\n\u0004time\u0018\u0002 \u0002(\u000b2\u0007.PbTime\u0012\u000f\n\u0007trusted\u0018\u0003 \u0002(\b\"y\n\u000fPbLocalDateTime\u0012\u0015\n\u0004date\u0018\u0001 \u0002(\u000b2\u0007.PbDate\u0012\u0015", "\n\u0004time\u0018\u0002 \u0002(\u000b2\u0007.PbTime\u0012\u0018\n\u0010OBSOLETE_trusted\u0018\u0003 \u0002(\b\u0012\u001e\n\u0010time_zone_offset\u0018\u0004 \u0001(\u0005B\u0004\u0080µ\u0018B\"q\n\nPbDuration\u0012\u0016\n\u0005hours\u0018\u0001 \u0001(\r:\u00010B\u0004\u0080µ\u0018\u0007\u0012\u0018\n\u0007minutes\u0018\u0002 \u0001(\r:\u00010B\u0004\u0080µ\u0018\u0005\u0012\u0018\n\u0007seconds\u0018\u0003 \u0001(\r:\u00010B\u0004\u0080µ\u0018\u0004\u0012\u0017\n\u0006millis\u0018\u0004 \u0001(\r:\u00010B\u0004\u0080µ\u0018\u0003\"Ï\u0001\n\nPbLocation\u0012\u0016\n\blatitude\u0018\u0001 \u0002(\u0001B\u0004\u0080µ\u00189\u0012\u0017\n\tlongitude\u0018\u0002 \u0002(\u0001B\u0004\u0080µ\u0018:\u0012$\n\ttimestamp\u0018\u0003 \u0001(\u000b2\u0011.PbSystemDateTime\u0012&\n\u0003fix\u0018\u0004 \u0001(\u000e2\u000f.PbLocation.Fix:\bFIX_NONE\u0012\u0015\n\nsatellites\u0018\u0005 \u0001(\r:\u00010\"+\n\u0003Fix\u0012\f\n\bFIX_NONE\u0010\u0000\u0012\n\n\u0006FIX_2D\u0010\u0001\u0012\n\n\u0006FIX_", "3D\u0010\u0002\":\n\u000fPbSensorOffline\u0012\u0013\n\u000bstart_index\u0018\u0001 \u0002(\r\u0012\u0012\n\nstop_index\u0018\u0002 \u0002(\r\" \n\bPbVolume\u0012\u0014\n\u0006volume\u0018\u0001 \u0002(\rB\u0004\u0080µ\u0018<\"Ç\u0003\n\u001bPbStrideSensorCalibSettings\u0012\u0016\n\u000erunning_factor\u0018\u0001 \u0002(\u0002\u0012B\n\ncalib_type\u0018\u0002 \u0002(\u000e2..PbStrideSensorCalibSettings.PbStrideCalibType\u0012p\n\u0015running_factor_source\u0018\u0003 \u0001(\u000e22.PbStrideSensorCalibSettings.PbRunningFactorSource:\u001dRUNNING_FACTOR_SOURCE_DEFAULT\"C\n\u0011PbStrideCalibType\u0012\u0017\n\u0013STRIDE_CALIB_MANUAL\u0010\u0000\u0012\u0015\n\u0011STRIDE_CALIB_A", "UTO\u0010\u0001\"\u0094\u0001\n\u0015PbRunningFactorSource\u0012!\n\u001dRUNNING_FACTOR_SOURCE_DEFAULT\u0010\u0000\u0012*\n&RUNNING_FACTOR_SOURCE_AUTO_CALIBRATION\u0010\u0001\u0012,\n(RUNNING_FACTOR_SOURCE_MANUAL_CALIBRATION\u0010\u0002\"\u008a\u0001\n\u0006PbWeek\u0012!\n\u0013week_number_ISO8601\u0018\u0001 \u0002(\rB\u0004\u0080µ\u0018L\u0012\u0012\n\u0004year\u0018\u0002 \u0002(\rB\u0004\u0080µ\u0018\n\u0012\u001e\n\u0010time_zone_offset\u0018\u0003 \u0002(\u0005B\u0004\u0080µ\u0018B\u0012)\n\u000eweek_start_day\u0018\u0004 \u0002(\u000e2\u0011.PbStartDayOfWeek\"j\n\u000ePbSampleSource\u0012/\n\u0012sample_source_type\u0018\u0001 \u0002(\u000e2\u0013.PbSampleSourceType\u0012\u0013\n\u000bstart_index\u0018\u0002 \u0002(\r\u0012\u0012\n\nstop_index\u0018", "\u0003 \u0002(\r\"l\n\u0019PbSensorCalibrationOffset\u0012/\n\u0012sample_source_type\u0018\u0001 \u0002(\u000e2\u0013.PbSampleSourceType\u0012\u001e\n\u0010speed_cal_offset\u0018\u0002 \u0001(\u0002B\u0004\u0080µ\u0018K\"\u0081\u0001\n\u0015PbCalibrationSettings\u0012\"\n\u000bsample_type\u0018\u0001 \u0002(\u000e2\r.PbSampleType\u0012\u001b\n\u0013calibration_enabled\u0018\u0002 \u0001(\b\u0012'\n\u001fcalibration_calculation_enabled\u0018\u0003 \u0001(\b\"~\n\u0015PbAccelerationMetrics\u0012/\n\u0012sample_source_type\u0018\u0001 \u0002(\u000e2\u0013.PbSampleSourceType\u00124\n\u0014calibration_settings\u0018\u0002 \u0003(\u000b2\u0016.PbCalibrationSettings\"¦\u0001\n\u000bPbAutoPause\u00120\n\u0007trigg", "er\u0018\u0001 \u0002(\u000e2\u001f.PbAutoPause.PbAutoPauseTrigger\u0012\u001d\n\u000fspeed_threshold\u0018\u0002 \u0001(\u0002B\u0004\u0080µ\u0018\u0017\"F\n\u0012PbAutoPauseTrigger\u0012\u0012\n\u000eAUTO_PAUSE_OFF\u0010\u0000\u0012\u001c\n\u0018AUTO_PAUSE_TRIGGER_SPEED\u0010\u0001\"\u009d\u0002\n\u0011PbAutoLapSettings\u00128\n\rautomatic_lap\u0018\u0001 \u0002(\u000e2!.PbAutoLapSettings.PbAutomaticLap\u0012$\n\u0016automatic_lap_distance\u0018\u0002 \u0001(\u0002B\u0004\u0080µ\u00184\u0012+\n\u0016automatic_lap_duration\u0018\u0003 \u0001(\u000b2\u000b.PbDuration\"{\n\u000ePbAutomaticLap\u0012\u0015\n\u0011AUTOMATIC_LAP_OFF\u0010\u0001\u0012\u001a\n\u0016AUTOMATIC_LAP_DISTANCE\u0010\u0002\u0012\u001a\n\u0016AUTOMATIC_LAP_DURATI", "ON\u0010\u0003\u0012\u001a\n\u0016AUTOMATIC_LAP_LOCATION\u0010\u0004*«\u0006\n\nPbDataType\u0012\r\n\tUNDEFINED\u0010\u0000\u0012\r\n\tINHERITED\u0010\u0001\u0012\b\n\u0004ENUM\u0010\u0002\u0012\n\n\u0006MILLIS\u0010\u0003\u0012\n\n\u0006SECOND\u0010\u0004\u0012\n\n\u0006MINUTE\u0010\u0005\u0012\b\n\u0004HOUR\u0010\u0006\u0012\t\n\u0005HOURS\u0010\u0007\u0012\u0007\n\u0003DAY\u0010\b\u0012\t\n\u0005MONTH\u0010\t\u0012\b\n\u0004YEAR\u0010\n\u0012\n\n\u0006WEIGHT\u0010\u000b\u0012\n\n\u0006HEIGHT\u0010\f\u0012\n\n\u0006VO2MAX\u0010\r\u0012\r\n\tHEARTRATE\u0010\u0014\u0012\u000e\n\nHR_PERCENT\u0010\u0015\u0012\u000e\n\nHR_RESERVE\u0010\u0016\u0012\t\n\u0005SPEED\u0010\u0017\u0012\u000b\n\u0007CADENCE\u0010\u0018\u0012\f\n\bALTITUDE\u0010\u0019\u0012\t\n\u0005POWER\u0010\u001a\u0012\r\n\tPOWER_LRB\u0010\u001b\u0012\f\n\bPOWER_PI\u0010\u001c\u0012\u000f\n\u000bTEMPERATURE\u0010\u001d\u0012\f\n\bACTIVITY\u0010\u001e\u0012\u0011\n\rSTRIDE_LENGTH\u0010\u001f\u0012\u000b\n\u0007INCLINE\u0010 \u0012\u000b", "\n\u0007DECLINE\u0010!\u0012\f\n\bDISTANCE\u00104\u0012\n\n\u0006ENERGY\u00105\u0012\u0010\n\fFAT_PERCENTS\u00106\u0012\n\n\u0006ASCENT\u00107\u0012\u000b\n\u0007DESCENT\u00108\u0012\f\n\bLATITUDE\u00109\u0012\r\n\tLONGITUDE\u0010:\u0012\t\n\u0005HERTZ\u0010;\u0012\u000b\n\u0007PERCENT\u0010<\u0012\u001a\n\u0016CUMULATED_ACTIVITY_DAY\u0010=\u0012\u0011\n\rRUNNING_INDEX\u0010>\u0012\u000f\n\u000bRR_INTERVAL\u0010?\u0012\u000b\n\u0007Z_INDEX\u0010@\u0012\u0019\n\u0015EXERCISE_TARGET_INDEX\u0010A\u0012\u0014\n\u0010TIME_ZONE_OFFSET\u0010B\u0012\u000e\n\nWHEEL_SIZE\u0010C\u0012\u0011\n\rFITNESS_CLASS\u0010D\u0012\u0010\n\fACCELERATION\u0010E\u0012\u0010\n\fCRANK_LENGTH\u0010F\u0012\u0010\n\fANGLE_DEGREE\u0010G\u0012\n\n\u0006NEWTON\u0010H\u0012\u001e\n\u001aFUNCTIONAL_THRESHOLD_POWER\u0010I\u0012\f\n\bCALO", "RIES\u0010J\u0012\u001c\n\u0018SPEED_CALIBRATION_OFFSET\u0010K\u0012\b\n\u0004WEEK\u0010L*~\n\u000fPbHeartRateView\u0012\u0017\n\u0013HEART_RATE_VIEW_BPM\u0010\u0001\u0012*\n&HEART_RATE_VIEW_PERCENTS_OF_HR_RESERVE\u0010\u0002\u0012&\n\"HEART_RATE_VIEW_PERCENTS_OF_MAX_HR\u0010\u0003*(\n\fPbUnitSystem\u0012\n\n\u0006METRIC\u0010\u0001\u0012\f\n\bIMPERIAL\u0010\u0002*)\n\u000fPbTimeSelection\u0012\n\n\u0006TIME_1\u0010\u0001\u0012\n\n\u0006TIME_2\u0010\u0002*8\n\fPbTimeFormat\u0012\u0013\n\u000fTIME_FORMAT_24H\u0010\u0001\u0012\u0013\n\u000fTIME_FORMAT_12H\u0010\u0002*W\n\u0015PbTimeFormatSeparator\u0012\u001d\n\u0019TIME_FORMAT_SEPARATOR_DOT\u0010\u0001\u0012\u001f\n\u001bTIME_FORMAT_SEPARATOR_C", "OLON\u0010\u0002*8\n\u0010PbStartDayOfWeek\u0012\n\n\u0006MONDAY\u0010\u0001\u0012\f\n\bSATURDAY\u0010\u0002\u0012\n\n\u0006SUNDAY\u0010\u0003*7\n\u0015PbDateFormatSeparator\u0012\u0007\n\u0003DOT\u0010\u0001\u0012\t\n\u0005SLASH\u0010\u0002\u0012\n\n\u0006HYPHEN\u0010\u0003*>\n\fPbDateFormat\u0012\u000e\n\nDD_MM_YYYY\u0010\u0001\u0012\u000e\n\nMM_DD_YYYY\u0010\u0002\u0012\u000e\n\nYYYY_MM_DD\u0010\u0003*Ê\u0007\n\rPbFeatureType\u0012\u001b\n\u0017FEATURE_TYPE_HEART_RATE\u0010\u0001\u0012\u001c\n\u0018FEATURE_TYPE_RR_INTERVAL\u0010\u0002\u0012\u0016\n\u0012FEATURE_TYPE_SPEED\u0010\u0003\u0012\u0019\n\u0015FEATURE_TYPE_DISTANCE\u0010\u0004\u0012\u001d\n\u0019FEATURE_TYPE_BIKE_CADENCE\u0010\u0005\u0012\u001b\n\u0017FEATURE_TYPE_BIKE_POWER\u0010\u0006\u0012\u001d\n\u0019FEATURE_TYPE_GPS_LOCATI", "ON\u0010\u0007\u0012 \n\u001cFEATURE_TYPE_RUNNING_CADENCE\u0010\b\u0012\"\n\u001eFEATURE_TYPE_PRESS_TEMPERATURE\u0010\t\u0012\u0019\n\u0015FEATURE_TYPE_ALTITUDE\u0010\n\u0012\u0016\n\u0012FEATURE_TYPE_STEPS\u0010\u000b\u0012\u0019\n\u0015FEATURE_TYPE_ACTIVITY\u0010\f\u0012\u001e\n\u001aFEATURE_TYPE_STRIDE_LENGTH\u0010\r\u0012 \n\u001cFEATURE_TYPE_RSC_MOVING_TYPE\u0010\u000e\u0012\u001c\n\u0018FEATURE_TYPE_JUMP_HEIGTH\u0010\u000f\u0012 \n\u001cFEATURE_TYPE_COMPASS_HEADING\u0010\u0010\u0012\u001a\n\u0016FEATURE_TYPE_GPS_SPEED\u0010\u0011\u0012\u001d\n\u0019FEATURE_TYPE_GPS_DISTANCE\u0010\u0012\u0012\u001d\n\u0019FEATURE_TYPE_GPS_ALTITUDE\u0010\u0013\u0012&\n\"FEATURE_TYPE_BIKE_WHEEL_", "REVOLUTION\u0010\u0014\u0012&\n\"FEATURE_TYPE_BIKE_CRANK_REVOLUTION\u0010\u0015\u0012\u0019\n\u0015FEATURE_TYPE_AS_SPEED\u0010\u0016\u0012\u001b\n\u0017FEATURE_TYPE_AS_CADENCE\u0010\u0017\u0012\u001c\n\u0018FEATURE_TYPE_AS_DISTANCE\u0010\u0018\u0012\u001d\n\u0019FEATURE_TYPE_AS_SWR_STATE\u0010\u0019\u0012\u001e\n\u001aFEATURE_TYPE_BATTERY_LEVEL\u0010\u001a\u0012\u001e\n\u001aFEATURE_TYPE_FILE_TRANSFER\u0010\u001b\u0012#\n\u001fFEATURE_TYPE_PUSH_NOTIFICATIONS\u0010\u001c\u0012\u001d\n\u0019FEATURE_TYPE_WEIGHT_SCALE\u0010\u001d\u0012\u001f\n\u001bFEATURE_TYPE_REMOTE_BUTTONS\u0010\u001e\u0012\u0016\n\u0012FEATURE_TYPE_GOPRO\u0010\u001f*6\n\fPbMovingType\u0012\u000b\n\u0007WALKING\u0010\u0000\u0012\u000b\n\u0007RUNNING\u0010\u0001", "\u0012\f\n\bSTANDING\u0010\u0002*(\n\u000fPbOperationType\u0012\f\n\bMULTIPLY\u0010\u0001\u0012\u0007\n\u0003SUM\u0010\u0002*¿\u0002\n\u0012PbExerciseFeedback\u0012\u0011\n\rFEEDBACK_NONE\u0010\u0001\u0012\u000e\n\nFEEDBACK_1\u0010\u0002\u0012\u000e\n\nFEEDBACK_2\u0010\u0003\u0012\u000e\n\nFEEDBACK_3\u0010\u0004\u0012\u000e\n\nFEEDBACK_4\u0010\u0005\u0012\u000e\n\nFEEDBACK_5\u0010\u0006\u0012\u000e\n\nFEEDBACK_6\u0010\u0007\u0012\u000e\n\nFEEDBACK_7\u0010\b\u0012\u000e\n\nFEEDBACK_8\u0010\t\u0012\u000e\n\nFEEDBACK_9\u0010\n\u0012\u000f\n\u000bFEEDBACK_10\u0010\u000b\u0012\u000f\n\u000bFEEDBACK_11\u0010\f\u0012\u000f\n\u000bFEEDBACK_12\u0010\r\u0012\u000f\n\u000bFEEDBACK_13\u0010\u000e\u0012\u000f\n\u000bFEEDBACK_14\u0010\u000f\u0012\u000f\n\u000bFEEDBACK_15\u0010\u0010\u0012\u000f\n\u000bFEEDBACK_16\u0010\u0011\u0012\u000f\n\u000bFEEDBACK_17\u0010\u0012*¡\u0001\n\u001cPbHeartRateZoneSe", "ttingSource\u0012*\n&HEART_RATE_ZONE_SETTING_SOURCE_DEFAULT\u0010\u0000\u0012,\n(HEART_RATE_ZONE_SETTING_SOURCE_THRESHOLD\u0010\u0001\u0012'\n#HEART_RATE_ZONE_SETTING_SOURCE_FREE\u0010\u0002*e\n\u0018PbPowerZoneSettingSource\u0012%\n!POWER_ZONE_SETTING_SOURCE_DEFAULT\u0010\u0000\u0012\"\n\u001ePOWER_ZONE_SETTING_SOURCE_FREE\u0010\u0001*e\n\u0018PbSpeedZoneSettingSource\u0012%\n!SPEED_ZONE_SETTING_SOURCE_DEFAULT\u0010\u0000\u0012\"\n\u001eSPEED_ZONE_SETTING_SOURCE_FREE\u0010\u0001*\u0093\u0001\n\tPbMacType\u0012\u0013\n\u000fMAC_TYPE_PUBLIC\u0010\u0000\u0012\u0013\n\u000fMAC_TYPE_STAT", "IC\u0010\u0001\u0012\"\n\u001eMAC_TYPE_PRIVATE_NONRESOLVABLE\u0010\u0002\u0012\u001f\n\u001bMAC_TYPE_PRIVATE_RESOLVABLE\u0010\u0003\u0012\u0017\n\u0013MAC_TYPE_BT_CLASSIC\u0010\u0004*\u0083\u0001\n\u000fPbSwimmingStyle\u0012\u0012\n\u0005OTHER\u0010ÿÿÿÿÿÿÿÿÿ\u0001\u0012\b\n\u0004TURN\u0010\u0000\u0012\u0012\n\u000eOTHER_SWIMMING\u0010\n\u0012\r\n\tFREESTYLE\u0010\u000b\u0012\u0010\n\fBREASTSTROKE\u0010\f\u0012\u000e\n\nBACKSTROKE\u0010\r\u0012\r\n\tBUTTERFLY\u0010\u000e*H\n\u0013PbSwimmingPoolUnits\u0012\u0018\n\u0014SWIMMING_POOL_METERS\u0010\u0000\u0012\u0017\n\u0013SWIMMING_POOL_YARDS\u0010\u0001*\u0095\u0002\n\u0014PbExerciseTargetType\u0012\u001d\n\u0019EXERCISE_TARGET_TYPE_FREE\u0010\u0000\u0012\u001f\n\u001bEXERCISE_TARGET_TYPE_VOLUME\u0010\u0001\u0012\u001f\n\u001bE", "XERCISE_TARGET_TYPE_PHASED\u0010\u0002\u0012\u001e\n\u001aEXERCISE_TARGET_TYPE_ROUTE\u0010\u0003\u0012)\n%EXERCISE_TARGET_TYPE_STEADY_RACE_PACE\u0010\u0004\u0012(\n$EXERCISE_TARGET_TYPE_ROUTE_RACE_PACE\u0010\u0005\u0012'\n#EXERCISE_TARGET_TYPE_STRAVA_SEGMENT\u0010\u0006*^\n\u0007Buttons\u0012\u000f\n\u000bBUTTON_PLUS\u0010\u0000\u0012\u0010\n\fBUTTON_MINUS\u0010\u0001\u0012\r\n\tBUTTON_OK\u0010\u0002\u0012\u0010\n\fBUTTON_LIGHT\u0010\u0003\u0012\u000f\n\u000bBUTTON_BACK\u0010\u0004*6\n\u000bButtonState\u0012\u0012\n\u000eBUTTON_PRESSED\u0010\u0000\u0012\u0013\n\u000fBUTTON_RELEASED\u0010\u0001*Ó\u0004\n\fPbSampleType\u0012\u0019\n\u0015SAMPLE_TYPE_UNDEFINED\u0010\u0000\u0012\u001a\n\u0016SAMPLE_TYPE_HE", "ART_RATE\u0010\u0001\u0012\u0017\n\u0013SAMPLE_TYPE_CADENCE\u0010\u0002\u0012\u0018\n\u0014SAMPLE_TYPE_ALTITUDE\u0010\u0003\u0012$\n SAMPLE_TYPE_ALTITUDE_CALIBRATION\u0010\u0004\u0012\u001b\n\u0017SAMPLE_TYPE_TEMPERATURE\u0010\u0005\u0012\u0015\n\u0011SAMPLE_TYPE_SPEED\u0010\u0006\u0012\u0018\n\u0014SAMPLE_TYPE_DISTANCE\u0010\u0007\u0012\u001d\n\u0019SAMPLE_TYPE_STRIDE_LENGTH\u0010\b\u0012\"\n\u001eSAMPLE_TYPE_STRIDE_CALIBRATION\u0010\t\u0012$\n SAMPLE_TYPE_FORWARD_ACCELERATION\u0010\n\u0012\u001b\n\u0017SAMPLE_TYPE_MOVING_TYPE\u0010\u000b\u0012 \n\u001cSAMPLE_TYPE_LEFT_PEDAL_POWER\u0010\f\u0012!\n\u001dSAMPLE_TYPE_RIGHT_PEDAL_POWER\u0010\r\u0012,\n(SAMPLE_TYPE_LEFT", "_PEDAL_POWER_CALIBRATION\u0010\u000e\u0012-\n)SAMPLE_TYPE_RIGHT_PEDAL_POWER_CALIBRATION\u0010\u000f\u0012\u001b\n\u0017SAMPLE_TYPE_RR_INTERVAL\u0010\u0010\u0012 \n\u001cSAMPLE_TYPE_ACCELERATION_MAD\u0010\u0011*\u0082\u0005\n\u0012PbSampleSourceType\u0012 \n\u001cSAMPLE_SOURCE_TYPE_UNDEFINED\u0010\u0000\u0012\u001e\n\u001aSAMPLE_SOURCE_TYPE_OFFLINE\u0010\u0001\u0012!\n\u001dSAMPLE_SOURCE_TYPE_HEART_RATE\u0010\u0002\u0012%\n!SAMPLE_SOURCE_TYPE_HEART_RATE_BLE\u0010\u0003\u0012'\n#SAMPLE_SOURCE_TYPE_HEART_RATE_5_KHZ\u0010\u0004\u0012)\n%SAMPLE_SOURCE_TYPE_HEART_RATE_OPTICAL\u0010\u0005\u0012\u001a\n\u0016SAMPLE_SOURCE", "_TYPE_GPS\u0010\u0006\u0012\u001d\n\u0019SAMPLE_SOURCE_TYPE_STRIDE\u0010\u0007\u0012$\n SAMPLE_SOURCE_TYPE_WRIST_METRICS\u0010\b\u0012$\n SAMPLE_SOURCE_TYPE_CHEST_METRICS\u0010\t\u0012!\n\u001dSAMPLE_SOURCE_TYPE_BIKE_PEDAL\u0010\n\u0012!\n\u001dSAMPLE_SOURCE_TYPE_BIKE_WHEEL\u0010\u000b\u0012!\n\u001dSAMPLE_SOURCE_TYPE_BIKE_CRANK\u0010\f\u00125\n1SAMPLE_SOURCE_TYPE_COMBINED_CHEST_METRICS_AND_GPS\u0010\r\u0012)\n%SAMPLE_SOURCE_TYPE_UPPER_BACK_METRICS\u0010\u000e\u0012:\n6SAMPLE_SOURCE_TYPE_COMBINED_UPPER_BACK_METRICS_AND_GPS\u0010\u000f*6\n\u0011PbAltitudeSetti", "ng\u0012\u0010\n\fALTITUDE_OFF\u0010\u0000\u0012\u000f\n\u000bALTITUDE_ON\u0010\u0001*d\n\fPbGPSSetting\u0012\u000b\n\u0007GPS_OFF\u0010\u0000\u0012\u0011\n\rGPS_ON_NORMAL\u0010\u0001\u0012\u000f\n\u000bGPS_ON_LONG\u0010\u0002\u0012\u0010\n\fGPS_ON_10_HZ\u0010\u0003\u0012\u0011\n\rGPS_ON_MEDIUM\u0010\u0004*\u008c\u0001\n\fPbHeartTouch\u0012\u0013\n\u000fHEART_TOUCH_OFF\u0010\u0001\u0012\"\n\u001eHEART_TOUCH_ACTIVATE_BACKLIGHT\u0010\u0002\u0012!\n\u001dHEART_TOUCH_SHOW_PREVIOUS_LAP\u0010\u0003\u0012 \n\u001cHEART_TOUCH_SHOW_TIME_OF_DAY\u0010\u0004*\u0088\u0001\n\u0011PbTapButtonAction\u0012\u0012\n\u000eTAP_BUTTON_OFF\u0010\u0001\u0012\u0017\n\u0013TAP_BUTTON_TAKE_LAP\u0010\u0002\u0012#\n\u001fTAP_BUTTON_CHANGE_TRAINING_VIEW\u0010\u0003\u0012!\n\u001dTAP_BUTTON", "_ACTIVATE_BACKLIGHT\u0010\u0004*M\n\fPbHandedness\u0012\u0013\n\u000fWU_IN_LEFT_HAND\u0010\u0001\u0012\u0014\n\u0010WU_IN_RIGHT_HAND\u0010\u0002\u0012\u0012\n\u000eWU_IN_NECKLACE\u0010\u0003*×\u0003\n\u0010PbDeviceLocation\u0012\u001d\n\u0019DEVICE_LOCATION_UNDEFINED\u0010\u0000\u0012\u0019\n\u0015DEVICE_LOCATION_OTHER\u0010\u0001\u0012\u001e\n\u001aDEVICE_LOCATION_WRIST_LEFT\u0010\u0002\u0012\u001f\n\u001bDEVICE_LOCATION_WRIST_RIGHT\u0010\u0003\u0012\u001c\n\u0018DEVICE_LOCATION_NECKLACE\u0010\u0004\u0012\u0019\n\u0015DEVICE_LOCATION_CHEST\u0010\u0005\u0012\u001e\n\u001aDEVICE_LOCATION_UPPER_BACK\u0010\u0006\u0012\u001d\n\u0019DEVICE_LOCATION_FOOT_LEFT\u0010\u0007\u0012\u001e\n\u001aDEVICE_LOCATION_FOOT_RIGHT\u0010\b\u0012\"\n\u001e", "DEVICE_LOCATION_LOWER_ARM_LEFT\u0010\t\u0012#\n\u001fDEVICE_LOCATION_LOWER_ARM_RIGHT\u0010\n\u0012\"\n\u001eDEVICE_LOCATION_UPPER_ARM_LEFT\u0010\u000b\u0012#\n\u001fDEVICE_LOCATION_UPPER_ARM_RIGHT\u0010\f\u0012\u001e\n\u001aDEVICE_LOCATION_BIKE_MOUNT\u0010\r::\n\u0004type\u0012\u001d.google.protobuf.FieldOptions\u0018Ð\u0086\u0003 \u0001(\u000e2\u000b.PbDataType::\n\bis_union\u0012\u001f.google.protobuf.MessageOptions\u0018Ñ\u0086\u0003 \u0001(\b:\u0005false:?\n\u0005range\u0012\u001d.google.protobuf.FieldOptions\u0018Ó\u0086\u0003 \u0001(\u000b2\u000f.PbRangeOptionsB)\n'fi.polar.remote.representation.protob", "uf"}, new FileDescriptor[]{var1}, var0);
      internal_static_PbRangeOptions_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_PbRangeOptions_fieldAccessorTable = new FieldAccessorTable(internal_static_PbRangeOptions_descriptor, new String[]{"MinValue", "MaxValue"});
      internal_static_PbDate_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_PbDate_fieldAccessorTable = new FieldAccessorTable(internal_static_PbDate_descriptor, new String[]{"Year", "Month", "Day"});
      internal_static_PbTime_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_PbTime_fieldAccessorTable = new FieldAccessorTable(internal_static_PbTime_descriptor, new String[]{"Hour", "Minute", "Seconds", "Millis"});
      internal_static_PbSystemDateTime_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_PbSystemDateTime_fieldAccessorTable = new FieldAccessorTable(internal_static_PbSystemDateTime_descriptor, new String[]{"Date", "Time", "Trusted"});
      internal_static_PbLocalDateTime_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_PbLocalDateTime_fieldAccessorTable = new FieldAccessorTable(internal_static_PbLocalDateTime_descriptor, new String[]{"Date", "Time", "OBSOLETETrusted", "TimeZoneOffset"});
      internal_static_PbDuration_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_PbDuration_fieldAccessorTable = new FieldAccessorTable(internal_static_PbDuration_descriptor, new String[]{"Hours", "Minutes", "Seconds", "Millis"});
      internal_static_PbLocation_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_PbLocation_fieldAccessorTable = new FieldAccessorTable(internal_static_PbLocation_descriptor, new String[]{"Latitude", "Longitude", "Timestamp", "Fix", "Satellites"});
      internal_static_PbSensorOffline_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_PbSensorOffline_fieldAccessorTable = new FieldAccessorTable(internal_static_PbSensorOffline_descriptor, new String[]{"StartIndex", "StopIndex"});
      internal_static_PbVolume_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_PbVolume_fieldAccessorTable = new FieldAccessorTable(internal_static_PbVolume_descriptor, new String[]{"Volume"});
      internal_static_PbStrideSensorCalibSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_PbStrideSensorCalibSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_PbStrideSensorCalibSettings_descriptor, new String[]{"RunningFactor", "CalibType", "RunningFactorSource"});
      internal_static_PbWeek_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_PbWeek_fieldAccessorTable = new FieldAccessorTable(internal_static_PbWeek_descriptor, new String[]{"WeekNumberISO8601", "Year", "TimeZoneOffset", "WeekStartDay"});
      internal_static_PbSampleSource_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_PbSampleSource_fieldAccessorTable = new FieldAccessorTable(internal_static_PbSampleSource_descriptor, new String[]{"SampleSourceType", "StartIndex", "StopIndex"});
      internal_static_PbSensorCalibrationOffset_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_PbSensorCalibrationOffset_fieldAccessorTable = new FieldAccessorTable(internal_static_PbSensorCalibrationOffset_descriptor, new String[]{"SampleSourceType", "SpeedCalOffset"});
      internal_static_PbCalibrationSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_PbCalibrationSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_PbCalibrationSettings_descriptor, new String[]{"SampleType", "CalibrationEnabled", "CalibrationCalculationEnabled"});
      internal_static_PbAccelerationMetrics_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_PbAccelerationMetrics_fieldAccessorTable = new FieldAccessorTable(internal_static_PbAccelerationMetrics_descriptor, new String[]{"SampleSourceType", "CalibrationSettings"});
      internal_static_PbAutoPause_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_PbAutoPause_fieldAccessorTable = new FieldAccessorTable(internal_static_PbAutoPause_descriptor, new String[]{"Trigger", "SpeedThreshold"});
      internal_static_PbAutoLapSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_PbAutoLapSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_PbAutoLapSettings_descriptor, new String[]{"AutomaticLap", "AutomaticLapDistance", "AutomaticLapDuration"});
      type.internalInit((FieldDescriptor)descriptor.getExtensions().get(0));
      isUnion.internalInit((FieldDescriptor)descriptor.getExtensions().get(1));
      range.internalInit((FieldDescriptor)descriptor.getExtensions().get(2));
      ExtensionRegistry var2 = ExtensionRegistry.newInstance();
      var2.add(type);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var2);
      DescriptorProtos.getDescriptor();
   }

   private Types() {
   }

   // $FF: synthetic method
   static Descriptor A() {
      return internal_static_PbCalibrationSettings_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable B() {
      return internal_static_PbCalibrationSettings_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor C() {
      return internal_static_PbAccelerationMetrics_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable D() {
      return internal_static_PbAccelerationMetrics_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor E() {
      return internal_static_PbAutoPause_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable F() {
      return internal_static_PbAutoPause_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor G() {
      return internal_static_PbAutoLapSettings_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable H() {
      return internal_static_PbAutoLapSettings_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_PbRangeOptions_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_PbRangeOptions_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_PbDate_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_PbDate_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor e() {
      return internal_static_PbTime_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable f() {
      return internal_static_PbTime_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor g() {
      return internal_static_PbSystemDateTime_descriptor;
   }

   public static FileDescriptor getDescriptor() {
      return descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable h() {
      return internal_static_PbSystemDateTime_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor i() {
      return internal_static_PbLocalDateTime_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable j() {
      return internal_static_PbLocalDateTime_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor k() {
      return internal_static_PbDuration_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable l() {
      return internal_static_PbDuration_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor m() {
      return internal_static_PbLocation_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable n() {
      return internal_static_PbLocation_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor o() {
      return internal_static_PbSensorOffline_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable p() {
      return internal_static_PbSensorOffline_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor q() {
      return internal_static_PbVolume_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable r() {
      return internal_static_PbVolume_fieldAccessorTable;
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
      var0.add(type);
      var0.add(isUnion);
      var0.add(range);
   }

   // $FF: synthetic method
   static Descriptor s() {
      return internal_static_PbStrideSensorCalibSettings_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable t() {
      return internal_static_PbStrideSensorCalibSettings_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor u() {
      return internal_static_PbWeek_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable v() {
      return internal_static_PbWeek_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor w() {
      return internal_static_PbSampleSource_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable x() {
      return internal_static_PbSampleSource_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor y() {
      return internal_static_PbSensorCalibrationOffset_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable z() {
      return internal_static_PbSensorCalibrationOffset_fieldAccessorTable;
   }
}
