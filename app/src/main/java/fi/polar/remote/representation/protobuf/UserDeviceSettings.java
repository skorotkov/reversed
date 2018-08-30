package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class UserDeviceSettings {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbDoNotDisturbSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbDoNotDisturbSettings_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbIntervalTimerValue_descriptor;
   private static final FieldAccessorTable internal_static_data_PbIntervalTimerValue_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserDeviceAlarmSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserDeviceAlarmSettings_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserDeviceAutoSyncSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserDeviceAutoSyncSettings_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserDeviceAutomaticSampleSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserDeviceAutomaticSampleSettings_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserDeviceCountdownSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserDeviceCountdownSettings_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserDeviceDoNotDisturbSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserDeviceDoNotDisturbSettings_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserDeviceGeneralSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserDeviceGeneralSettings_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserDeviceJumpTestSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserDeviceJumpTestSettings_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserDeviceMassStorageSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserDeviceMassStorageSettings_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserDeviceResearchSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserDeviceResearchSettings_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserDeviceRinseDryMessageSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserDeviceRinseDryMessageSettings_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserDeviceSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserDeviceSettings_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserDeviceStravaSegmentsSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserDeviceStravaSegmentsSettings_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserEndTimeEstimatorSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserEndTimeEstimatorSettings_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserIntervalTimerSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserIntervalTimerSettings_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserMapSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserMapSettings_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserSafetyLightSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserSafetyLightSettings_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbUserSmartWatchNotificationSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbUserSmartWatchNotificationSettings_fieldAccessorTable;

   static {
      UserDeviceSettings$1 var0 = new UserDeviceSettings$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor var3 = Nanopb.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0011user_devset.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\u001a\fnanopb.proto\"Æ\n\n\u001bPbUserDeviceGeneralSettings\u00121\n\u0017OBSOLETE_time_selection\u0018\u0001 \u0001(\u000e2\u0010.PbTimeSelection\u0012\u001d\n\u0015OBSOLETE_time2_offset\u0018\u0002 \u0001(\u0005\u0012A\n\nwatch_face\u0018\u0003 \u0001(\u000e2-.data.PbUserDeviceGeneralSettings.PbWatchFace\u0012L\n\u0010button_lock_mode\u0018\u0004 \u0001(\u000e22.data.PbUserDeviceGeneralSettings.PbButtonLockMode\u0012&\n\u0013button_sound_volume\u0018\u0005 \u0001(\u000b2\t.PbVolume\u0012\u0016\n\u000evibration_mode\u0018\u0007 \u0001(\b\u0012*\n\u0013OBS", "OLETE_handedness\u0018\b \u0001(\u000e2\r.PbHandedness\u0012\u0018\n\u0010exeview_inverted\u0018\t \u0001(\b\u0012X\n\u0016tap_button_sensitivity\u0018\n \u0001(\u000e28.data.PbUserDeviceGeneralSettings.PbTapButtonSensitivity\u0012M\n\u0010inactivity_alert\u0018\u000b \u0001(\u000e23.data.PbUserDeviceGeneralSettings.PbInactivityAlert\u0012\u001f\n\u0017ble_connect_mode_enable\u0018\f \u0001(\b\u0012H\n\u0011backup_watch_face\u0018\r \u0001(\u000e2-.data.PbUserDeviceGeneralSettings.PbWatchFace\u0012B\n\nflightmode\u0018\u000e \u0001(\u000e2..data.PbUserDeviceGeneralSettings.PbFli", "ghtMode\u0012*\n\u000fdevice_location\u0018\u000f \u0001(\u000e2\u0011.PbDeviceLocation\u0012\u0018\n\u0010watch_face_color\u0018\u0010 \u0001(\r\"²\u0001\n\u000bPbWatchFace\u0012\t\n\u0005BASIC\u0010\u0001\u0012\t\n\u0005AWARD\u0010\u0002\u0012\r\n\tUSER_NAME\u0010\u0003\u0012\t\n\u0005EVENT\u0010\u0004\u0012\n\n\u0006ANALOG\u0010\u0005\u0012\u0007\n\u0003BIG\u0010\u0006\u0012\f\n\bACTIVITY\u0010\u0007\u0012\u000e\n\nBIG_ANALOG\u0010\b\u0012\u0010\n\fWHITE_ANALOG\u0010\t\u0012\t\n\u0005JUMBO\u0010\n\u0012\u000e\n\nBIG_DIGITS\u0010\u000b\u0012\u0013\n\u000fACTIVITY_CIRCLE\u0010\f\"(\n\u0010PbButtonLockMode\u0012\n\n\u0006MANUAL\u0010\u0001\u0012\b\n\u0004AUTO\u0010\u0002\"Á\u0001\n\u0016PbTapButtonSensitivity\u0012\u001e\n\u001aTAP_BUTTON_SENSITIVITY_OFF\u0010\u0001\u0012#\n\u001fTAP_BUTTON_SENSITIVITY_VERY_LOW\u0010\u0005\u0012\u001e\n\u001a", "TAP_BUTTON_SENSITIVITY_LOW\u0010\u0002\u0012!\n\u001dTAP_BUTTON_SENSITIVITY_MEDIUM\u0010\u0003\u0012\u001f\n\u001bTAP_BUTTON_SENSITIVITY_HIGH\u0010\u0004\"F\n\u0011PbInactivityAlert\u0012\u0018\n\u0014INACTIVITY_ALERT_OFF\u0010\u0001\u0012\u0017\n\u0013INACTIVITY_ALERT_ON\u0010\u0002\"5\n\fPbFlightMode\u0012\u0012\n\u000eFLIGHTMODE_OFF\u0010\u0001\u0012\u0011\n\rFLIGHTMODE_ON\u0010\u0002\"æ\u0001\n\u0019PbUserDeviceAlarmSettings\u0012?\n\nalarm_mode\u0018\u0001 \u0002(\u000e2+.data.PbUserDeviceAlarmSettings.PbAlarmMode\u0012\u001b\n\nalarm_time\u0018\u0002 \u0002(\u000b2\u0007.PbTime\"k\n\u000bPbAlarmMode\u0012\u0012\n\u000eALARM_MODE_OFF\u0010\u0001\u0012\u0013\n\u000fALARM_MODE_ONC", "E\u0010\u0002\u0012\u0019\n\u0015ALARM_MODE_MON_TO_FRI\u0010\u0003\u0012\u0018\n\u0014ALARM_MODE_EVERY_DAY\u0010\u0004\"D\n\u001dPbUserDeviceCountdownSettings\u0012#\n\u000ecountdown_time\u0018\u0001 \u0002(\u000b2\u000b.PbDuration\"G\n\u001cPbUserDeviceJumpTestSettings\u0012'\n\u0012cont_jump_duration\u0018\u0001 \u0002(\u000b2\u000b.PbDuration\"\u0093\u0002\n\u0014PbIntervalTimerValue\u0012K\n\u0013interval_timer_type\u0018\u0001 \u0002(\u000e2..data.PbIntervalTimerValue.PbIntervalTimerType\u0012,\n\u0017interval_timer_duration\u0018\u0002 \u0001(\u000b2\u000b.PbDuration\u0012%\n\u0017interval_timer_distance\u0018\u0003 \u0001(\u0002B\u0004\u0080µ\u00184\"Y\n\u0013PbInterval", "TimerType\u0012 \n\u001cINTERVAL_TIMER_TYPE_DURATION\u0010\u0001\u0012 \n\u001cINTERVAL_TIMER_TYPE_DISTANCE\u0010\u0002\"^\n\u001bPbUserIntervalTimerSettings\u0012?\n\u0014interval_timer_value\u0018\u0001 \u0003(\u000b2\u001a.data.PbIntervalTimerValueB\u0005\u0092?\u0002\u0010\u0002\"I\n\u001ePbUserEndTimeEstimatorSettings\u0012'\n\u0019end_time_estimator_target\u0018\u0001 \u0001(\u0002B\u0004\u0080µ\u00184\"Ð\u0001\n\u001cPbUserDeviceResearchSettings\u0012%\n\u001daccelerometer_raw_data_enable\u0018\u0001 \u0001(\b\u0012!\n\u0019gyroscope_raw_data_enable\u0018\u0002 \u0001(\b\u0012$\n\u001cmagnetometer_raw_data_enable\u0018\u0003 \u0001(\b\u0012'\n\u001flin", "ear_acceleration_data_enable\u0018\u0004 \u0001(\b\u0012\u0017\n\u000fgps_data_enable\u0018\u0005 \u0001(\b\"®\u0004\n\u0019PbUserSafetyLightSettings\u0012?\n\u0004mode\u0018\u0001 \u0002(\u000e21.data.PbUserSafetyLightSettings.PbSafetyLightMode\u0012V\n\u0010activation_level\u0018\u0002 \u0001(\u000e2<.data.PbUserSafetyLightSettings.PbSafetyLightActivationLevel\u0012J\n\nblink_rate\u0018\u0003 \u0001(\u000e26.data.PbUserSafetyLightSettings.PbSafetyLightBlinkRate\"H\n\u0011PbSafetyLightMode\u0012\u0017\n\u0013SAFETY_LIGHT_MANUAL\u0010\u0001\u0012\u001a\n\u0016SAFETY_LIGHT_AUTOMATIC\u0010\u0002\"p\n\u001cPbSa", "fetyLightActivationLevel\u0012\u0019\n\u0015ACTIVATION_LEVEL_DARK\u0010\u0001\u0012\u0019\n\u0015ACTIVATION_LEVEL_DUSK\u0010\u0002\u0012\u001a\n\u0016ACTIVATION_LEVEL_LIGHT\u0010\u0003\"p\n\u0016PbSafetyLightBlinkRate\u0012\u0012\n\u000eBLINK_RATE_OFF\u0010\u0001\u0012\u0013\n\u000fBLINK_RATE_SLOW\u0010\u0002\u0012\u0013\n\u000fBLINK_RATE_FAST\u0010\u0003\u0012\u0018\n\u0014BLINK_RATE_VERY_FAST\u0010\u0004\"W\n\u0016PbDoNotDisturbSettings\u0012\u000f\n\u0007enabled\u0018\u0001 \u0002(\b\u0012\u0016\n\u0005start\u0018\u0002 \u0001(\u000b2\u0007.PbTime\u0012\u0014\n\u0003end\u0018\u0003 \u0001(\u000b2\u0007.PbTime\"§\u0001\n$PbUserSmartWatchNotificationSettings\u0012\u000f\n\u0007enabled\u0018\u0001 \u0002(\b\u0012\u0017\n\u000fpreview_enabled\u0018\u0002 \u0001(\b\u0012=\n\u0017do_n", "ot_disturb_settings\u0018\u0003 \u0001(\u000b2\u001c.data.PbDoNotDisturbSettings\u0012\u0016\n\u000esounds_enabled\u0018\u0004 \u0001(\b\"â\u0001\n\u0011PbUserMapSettings\u0012D\n\u0011map_top_direction\u0018\u0001 \u0002(\u000e2).data.PbUserMapSettings.PbMapTopDirection\u0012\u001d\n\u0015altitude_data_enabled\u0018\u0002 \u0001(\b\u0012\u001f\n\u0017bike_route_data_enabled\u0018\u0003 \u0001(\b\"G\n\u0011PbMapTopDirection\u0012\u0017\n\u0013TOP_DIRECTION_NORTH\u0010\u0001\u0012\u0019\n\u0015TOP_DIRECTION_HEADING\u0010\u0002\"f\n#PbUserDeviceRinseDryMessageSettings\u0012\u0015\n\rmessage_count\u0018\u0001 \u0002(\r\u0012(\n\rlast_modified\u0018\u0002 \u0002(\u000b2\u0011.PbSy", "stemDateTime\"2\n\u001fPbUserDeviceMassStorageSettings\u0012\u000f\n\u0007enabled\u0018\u0001 \u0002(\b\"Û\u0001\n PbUserDeviceDoNotDisturbSettings\u0012\u0019\n\u0011do_not_disturb_on\u0018\u0001 \u0002(\b\u0012Z\n\u000esetting_source\u0018\u0002 \u0001(\u000e2B.data.PbUserDeviceDoNotDisturbSettings.PbDoNotDisturbSettingSource\"@\n\u001bPbDoNotDisturbSettingSource\u0012\u000f\n\u000bSOURCE_USER\u0010\u0000\u0012\u0010\n\fSOURCE_TIMED\u0010\u0001\"/\n\u001cPbUserDeviceAutoSyncSettings\u0012\u000f\n\u0007enabled\u0018\u0001 \u0002(\b\">\n#PbUserDeviceAutomaticSampleSettings\u0012\u0017\n\u000fohr_247_enabled\u0018\u0001 \u0002(\b\"", "5\n\"PbUserDeviceStravaSegmentsSettings\u0012\u000f\n\u0007enabled\u0018\u0001 \u0002(\b\"\u0082\t\n\u0014PbUserDeviceSettings\u0012;\n\u0010general_settings\u0018\u0001 \u0002(\u000b2!.data.PbUserDeviceGeneralSettings\u00127\n\u000ealarm_settings\u0018\u0002 \u0001(\u000b2\u001f.data.PbUserDeviceAlarmSettings\u0012?\n\u0012countdown_settings\u0018\u0003 \u0001(\u000b2#.data.PbUserDeviceCountdownSettings\u0012=\n\u0011jumptest_settings\u0018\u0004 \u0001(\u000b2\".data.PbUserDeviceJumpTestSettings\u0012B\n\u0017interval_timer_settings\u0018\u0005 \u0001(\u000b2!.data.PbUserIntervalTimerSettings\u0012I\n\u001bend", "_time_estimator_settings\u0018\u0006 \u0001(\u000b2$.data.PbUserEndTimeEstimatorSettings\u0012=\n\u0011research_settings\u0018\u0007 \u0001(\u000b2\".data.PbUserDeviceResearchSettings\u0012>\n\u0015safety_light_settings\u0018\b \u0001(\u000b2\u001f.data.PbUserSafetyLightSettings\u0012U\n!smart_watch_notification_settings\u0018\t \u0001(\u000b2*.data.PbUserSmartWatchNotificationSettings\u0012-\n\fmap_settings\u0018\n \u0001(\u000b2\u0017.data.PbUserMapSettings\u0012M\n\u001arinse_dry_message_settings\u0018\u000b \u0001(\u000b2).data.PbUserDeviceRinseDryMessage", "Settings\u0012D\n\u0015mass_storage_settings\u0018\f \u0001(\u000b2%.data.PbUserDeviceMassStorageSettings\u0012G\n\u0017do_not_disturb_settings\u0018\r \u0001(\u000b2&.data.PbUserDeviceDoNotDisturbSettings\u0012>\n\u0012auto_sync_settings\u0018\u000e \u0001(\u000b2\".data.PbUserDeviceAutoSyncSettings\u0012L\n\u0019automatic_sample_settings\u0018\u000f \u0001(\u000b2).data.PbUserDeviceAutomaticSampleSettings\u0012J\n\u0018strava_segments_settings\u0018\u0010 \u0001(\u000b2(.data.PbUserDeviceStravaSegmentsSettings\u0012(\n\rlast_modified\u0018e \u0002(\u000b2\u0011.PbSys", "temDateTimeB=\n'fi.polar.remote.representation.protobufB\u0012UserDeviceSettings"}, new FileDescriptor[]{var1, var2, var3}, var0);
      internal_static_data_PbUserDeviceGeneralSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbUserDeviceGeneralSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserDeviceGeneralSettings_descriptor, new String[]{"OBSOLETETimeSelection", "OBSOLETETime2Offset", "WatchFace", "ButtonLockMode", "ButtonSoundVolume", "VibrationMode", "OBSOLETEHandedness", "ExeviewInverted", "TapButtonSensitivity", "InactivityAlert", "BleConnectModeEnable", "BackupWatchFace", "Flightmode", "DeviceLocation", "WatchFaceColor"});
      internal_static_data_PbUserDeviceAlarmSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_data_PbUserDeviceAlarmSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserDeviceAlarmSettings_descriptor, new String[]{"AlarmMode", "AlarmTime"});
      internal_static_data_PbUserDeviceCountdownSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_data_PbUserDeviceCountdownSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserDeviceCountdownSettings_descriptor, new String[]{"CountdownTime"});
      internal_static_data_PbUserDeviceJumpTestSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_data_PbUserDeviceJumpTestSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserDeviceJumpTestSettings_descriptor, new String[]{"ContJumpDuration"});
      internal_static_data_PbIntervalTimerValue_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_data_PbIntervalTimerValue_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbIntervalTimerValue_descriptor, new String[]{"IntervalTimerType", "IntervalTimerDuration", "IntervalTimerDistance"});
      internal_static_data_PbUserIntervalTimerSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_data_PbUserIntervalTimerSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserIntervalTimerSettings_descriptor, new String[]{"IntervalTimerValue"});
      internal_static_data_PbUserEndTimeEstimatorSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_data_PbUserEndTimeEstimatorSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserEndTimeEstimatorSettings_descriptor, new String[]{"EndTimeEstimatorTarget"});
      internal_static_data_PbUserDeviceResearchSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_data_PbUserDeviceResearchSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserDeviceResearchSettings_descriptor, new String[]{"AccelerometerRawDataEnable", "GyroscopeRawDataEnable", "MagnetometerRawDataEnable", "LinearAccelerationDataEnable", "GpsDataEnable"});
      internal_static_data_PbUserSafetyLightSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_data_PbUserSafetyLightSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserSafetyLightSettings_descriptor, new String[]{"Mode", "ActivationLevel", "BlinkRate"});
      internal_static_data_PbDoNotDisturbSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_data_PbDoNotDisturbSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbDoNotDisturbSettings_descriptor, new String[]{"Enabled", "Start", "End"});
      internal_static_data_PbUserSmartWatchNotificationSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_data_PbUserSmartWatchNotificationSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserSmartWatchNotificationSettings_descriptor, new String[]{"Enabled", "PreviewEnabled", "DoNotDisturbSettings", "SoundsEnabled"});
      internal_static_data_PbUserMapSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_data_PbUserMapSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserMapSettings_descriptor, new String[]{"MapTopDirection", "AltitudeDataEnabled", "BikeRouteDataEnabled"});
      internal_static_data_PbUserDeviceRinseDryMessageSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_data_PbUserDeviceRinseDryMessageSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserDeviceRinseDryMessageSettings_descriptor, new String[]{"MessageCount", "LastModified"});
      internal_static_data_PbUserDeviceMassStorageSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_data_PbUserDeviceMassStorageSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserDeviceMassStorageSettings_descriptor, new String[]{"Enabled"});
      internal_static_data_PbUserDeviceDoNotDisturbSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_data_PbUserDeviceDoNotDisturbSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserDeviceDoNotDisturbSettings_descriptor, new String[]{"DoNotDisturbOn", "SettingSource"});
      internal_static_data_PbUserDeviceAutoSyncSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_data_PbUserDeviceAutoSyncSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserDeviceAutoSyncSettings_descriptor, new String[]{"Enabled"});
      internal_static_data_PbUserDeviceAutomaticSampleSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_data_PbUserDeviceAutomaticSampleSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserDeviceAutomaticSampleSettings_descriptor, new String[]{"Ohr247Enabled"});
      internal_static_data_PbUserDeviceStravaSegmentsSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_data_PbUserDeviceStravaSegmentsSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserDeviceStravaSegmentsSettings_descriptor, new String[]{"Enabled"});
      internal_static_data_PbUserDeviceSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_data_PbUserDeviceSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbUserDeviceSettings_descriptor, new String[]{"GeneralSettings", "AlarmSettings", "CountdownSettings", "JumptestSettings", "IntervalTimerSettings", "EndTimeEstimatorSettings", "ResearchSettings", "SafetyLightSettings", "SmartWatchNotificationSettings", "MapSettings", "RinseDryMessageSettings", "MassStorageSettings", "DoNotDisturbSettings", "AutoSyncSettings", "AutomaticSampleSettings", "StravaSegmentsSettings", "LastModified"});
      ExtensionRegistry var4 = ExtensionRegistry.newInstance();
      var4.add(Nanopb.nanopb);
      var4.add(Types.type);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var4);
      Types.getDescriptor();
      Structures.getDescriptor();
      Nanopb.getDescriptor();
   }

   private UserDeviceSettings() {
   }

   // $FF: synthetic method
   static Descriptor A() {
      return internal_static_data_PbUserDeviceMassStorageSettings_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable B() {
      return internal_static_data_PbUserDeviceMassStorageSettings_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor C() {
      return internal_static_data_PbUserDeviceDoNotDisturbSettings_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable D() {
      return internal_static_data_PbUserDeviceDoNotDisturbSettings_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor E() {
      return internal_static_data_PbUserDeviceAutoSyncSettings_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable F() {
      return internal_static_data_PbUserDeviceAutoSyncSettings_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor G() {
      return internal_static_data_PbUserDeviceAutomaticSampleSettings_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable H() {
      return internal_static_data_PbUserDeviceAutomaticSampleSettings_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor I() {
      return internal_static_data_PbUserDeviceStravaSegmentsSettings_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable J() {
      return internal_static_data_PbUserDeviceStravaSegmentsSettings_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor K() {
      return internal_static_data_PbUserDeviceSettings_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable L() {
      return internal_static_data_PbUserDeviceSettings_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbUserDeviceGeneralSettings_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbUserDeviceGeneralSettings_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_data_PbUserDeviceAlarmSettings_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_data_PbUserDeviceAlarmSettings_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor e() {
      return internal_static_data_PbUserDeviceCountdownSettings_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable f() {
      return internal_static_data_PbUserDeviceCountdownSettings_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor g() {
      return internal_static_data_PbUserDeviceJumpTestSettings_descriptor;
   }

   public static FileDescriptor getDescriptor() {
      return descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable h() {
      return internal_static_data_PbUserDeviceJumpTestSettings_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor i() {
      return internal_static_data_PbIntervalTimerValue_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable j() {
      return internal_static_data_PbIntervalTimerValue_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor k() {
      return internal_static_data_PbUserIntervalTimerSettings_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable l() {
      return internal_static_data_PbUserIntervalTimerSettings_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor m() {
      return internal_static_data_PbUserEndTimeEstimatorSettings_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable n() {
      return internal_static_data_PbUserEndTimeEstimatorSettings_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor o() {
      return internal_static_data_PbUserDeviceResearchSettings_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable p() {
      return internal_static_data_PbUserDeviceResearchSettings_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor q() {
      return internal_static_data_PbUserSafetyLightSettings_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable r() {
      return internal_static_data_PbUserSafetyLightSettings_fieldAccessorTable;
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }

   // $FF: synthetic method
   static Descriptor s() {
      return internal_static_data_PbDoNotDisturbSettings_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable t() {
      return internal_static_data_PbDoNotDisturbSettings_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor u() {
      return internal_static_data_PbUserSmartWatchNotificationSettings_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable v() {
      return internal_static_data_PbUserSmartWatchNotificationSettings_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor w() {
      return internal_static_data_PbUserMapSettings_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable x() {
      return internal_static_data_PbUserMapSettings_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor y() {
      return internal_static_data_PbUserDeviceRinseDryMessageSettings_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable z() {
      return internal_static_data_PbUserDeviceRinseDryMessageSettings_fieldAccessorTable;
   }
}
