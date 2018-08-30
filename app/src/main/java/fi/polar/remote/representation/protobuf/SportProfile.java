package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class SportProfile {
   private static FileDescriptor descriptor;
   private static final Descriptor internal_static_data_PbSportProfileSettings_descriptor;
   private static final FieldAccessorTable internal_static_data_PbSportProfileSettings_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbSportProfile_descriptor;
   private static final FieldAccessorTable internal_static_data_PbSportProfile_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbSprintDetection_descriptor;
   private static final FieldAccessorTable internal_static_data_PbSprintDetection_fieldAccessorTable;
   private static final Descriptor internal_static_data_PbTrainingReminder_descriptor;
   private static final FieldAccessorTable internal_static_data_PbTrainingReminder_fieldAccessorTable;

   static {
      SportProfile$1 var0 = new SportProfile$1();
      FileDescriptor var1 = Types.getDescriptor();
      FileDescriptor var2 = Structures.getDescriptor();
      FileDescriptor var3 = Sport.getDescriptor();
      FileDescriptor var4 = Nanopb.getDescriptor();
      FileDescriptor var5 = SportprofileAceSettings.getDescriptor();
      FileDescriptor var6 = SportprofileGuitarSettings.getDescriptor();
      FileDescriptor var7 = SportprofileMclarenSettings.getDescriptor();
      FileDescriptor var8 = SportprofileAvalonSettings.getDescriptor();
      FileDescriptor var9 = SportprofileArcherSettings.getDescriptor();
      FileDescriptor var10 = SportprofileSniperSettings.getDescriptor();
      FileDescriptor var11 = SportprofileAstraSettings.getDescriptor();
      FileDescriptor var12 = SportprofileVectraSettings.getDescriptor();
      FileDescriptor var13 = SportprofileAustinSettings.getDescriptor();
      FileDescriptor var14 = SportprofileMaseratiSettings.getDescriptor();
      FileDescriptor var15 = SportprofileRangerSettings.getDescriptor();
      FileDescriptor var16 = SportprofileMetroSettings.getDescriptor();
      FileDescriptor var17 = SportprofileDisplays.getDescriptor();
      FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012sportprofile.proto\u0012\u0004data\u001a\u000btypes.proto\u001a\u0010structures.proto\u001a\u000bsport.proto\u001a\fnanopb.proto\u001a\u001fsportprofile_ace_settings.proto\u001a\"sportprofile_guitar_settings.proto\u001a#sportprofile_mclaren_settings.proto\u001a\"sportprofile_avalon_settings.proto\u001a\"sportprofile_archer_settings.proto\u001a\"sportprofile_sniper_settings.proto\u001a!sportprofile_astra_settings.proto\u001a\"sportprofile_vectra_settings.proto\u001a\"sportprofile_austin_settings.", "proto\u001a$sportprofile_maserati_settings.proto\u001a\"sportprofile_ranger_settings.proto\u001a!sportprofile_metro_settings.proto\u001a\u001bsportprofile_displays.proto\"\u009e\u0003\n\u0012PbTrainingReminder\u0012F\n\rreminder_type\u0018\u0001 \u0002(\u000e2/.data.PbTrainingReminder.PbTrainingReminderType\u0012%\n\rreminder_text\u0018\u0002 \u0001(\u000b2\u000e.PbOneLineText\u0012$\n\u0016calorie_reminder_value\u0018\u0003 \u0001(\rB\u0004\u0080µ\u0018J\u0012(\n\u0013time_reminder_value\u0018\u0004 \u0001(\u000b2\u000b.PbDuration\u0012%\n\u0017distance_reminder_value\u0018\u0005 \u0001(\u0002B\u0004\u0080µ\u00184\"¡\u0001\n", "\u0016PbTrainingReminderType\u0012\u0019\n\u0015TRAINING_REMINDER_OFF\u0010\u0001\u0012$\n TRAINING_REMINDER_CALORIES_BASED\u0010\u0002\u0012$\n TRAINING_REMINDER_DISTANCE_BASED\u0010\u0003\u0012 \n\u001cTRAINING_REMINDER_TIME_BASED\u0010\u0004\"\u0083\r\n\u0016PbSportProfileSettings\u0012\u0019\n\u0006volume\u0018\u0001 \u0001(\u000b2\t.PbVolume\u0012<\n\nspeed_view\u0018\u0002 \u0001(\u000e2(.data.PbSportProfileSettings.PbSpeedView\u0012S\n\u0016zone_optimizer_setting\u0018\u0003 \u0001(\u000e23.data.PbSportProfileSettings.PbZoneOptimizerSetting\u00122\n\u0018OBSOLETE_heart_rate_view\u0018\u0004 \u0001(\u000e2\u0010.Pb", "HeartRateView\u0012\u001e\n\u0016sensor_broadcasting_hr\u0018\u0005 \u0001(\b\u0012\u001d\n\u000bzone_limits\u0018\u0006 \u0001(\u000b2\b.PbZones\u00123\n\u0011training_reminder\u0018\u0007 \u0001(\u000b2\u0018.data.PbTrainingReminder\u0012\u0016\n\u000evoice_guidance\u0018\b \u0001(\b\u0012+\n\u0014OBSOLETE_gps_setting\u0018\t \u0001(\u000e2\r.PbGPSSetting\u00125\n\u0019OBSOLETE_autolap_settings\u0018\n \u0001(\u000b2\u0012.PbAutoLapSettings\u00125\n\u0019OBSOLETE_altitude_setting\u0018\u000b \u0001(\u000e2\u0012.PbAltitudeSetting\u0012<\n\npower_view\u0018\f \u0001(\u000e2(.data.PbSportProfileSettings.PbPowerView\u0012i\n\u0013stride_speed_source\u0018\r \u0001(\u000e2", "0.data.PbSportProfileSettings.PbStrideSpeedSource:\u001aSTRIDE_SPEED_SOURCE_STRIDE\u0012W\n\u0015remote_button_actions\u0018\u000e \u0003(\u000e21.data.PbSportProfileSettings.PbRemoteButtonActionB\u0005\u0092?\u0002\u0010\u0003\u0012\u001e\n\u0016hr_zone_lock_available\u0018\u000f \u0001(\b\u0012!\n\u0019speed_zone_lock_available\u0018\u0010 \u0001(\b\u0012!\n\u0019power_zone_lock_available\u0018\u0011 \u0001(\b\u0012D\n\u000eswimming_units\u0018\u0012 \u0001(\u000e2,.data.PbSportProfileSettings.PbSwimmingUnits\"8\n\u000bPbSpeedView\u0012\u0013\n\u000fSPEED_VIEW_PACE\u0010\u0001\u0012\u0014\n\u0010SPEED_VIEW_SPEED\u0010\u0002\"\u0086\u0001\n", "\u0016PbZoneOptimizerSetting\u0012\u0015\n\u0011ZONEOPTIMIZER_OFF\u0010\u0001\u0012\u001e\n\u001aZONEOPTIMIZER_MODIFIED_OFF\u0010\u0002\u0012\u0019\n\u0015ZONEOPTIMIZER_DEFAULT\u0010\u0003\u0012\u001a\n\u0016ZONEOPTIMIZER_MODIFIED\u0010\u0004\"Z\n\u000bPbPowerView\u0012\u0013\n\u000fPOWER_VIEW_WATT\u0010\u0001\u0012\u001a\n\u0016POWER_VIEW_WATT_PER_KG\u0010\u0002\u0012\u001a\n\u0016POWER_VIEW_FTP_PERCENT\u0010\u0003\"R\n\u0013PbStrideSpeedSource\u0012\u001e\n\u001aSTRIDE_SPEED_SOURCE_STRIDE\u0010\u0001\u0012\u001b\n\u0017STRIDE_SPEED_SOURCE_GPS\u0010\u0002\"\u0082\u0002\n\u0014PbRemoteButtonAction\u0012\u001b\n\u0017REMOTE_BUTTON_RING_BELL\u0010\u0001\u0012$\n REMOTE_BUTTON_ACTIVATE_BACKLIGHT\u0010", "\u0002\u0012&\n\"REMOTE_BUTTON_CHANGE_TRAINING_VIEW\u0010\u0003\u0012\u001a\n\u0016REMOTE_BUTTON_TAKE_LAP\u0010\u0004\u0012'\n#REMOTE_BUTTON_ACTIVATE_SAFETY_LIGHT\u0010\u0005\u0012\u001b\n\u0017REMOTE_BUTTON_BROWSE_UP\u0010\u0006\u0012\u001d\n\u0019REMOTE_BUTTON_BROWSE_DOWN\u0010\u0007\":\n\u000fPbSwimmingUnits\u0012\u0013\n\u000fSWIMMING_METERS\u0010\u0000\u0012\u0012\n\u000eSWIMMING_YARDS\u0010\u0001\"ª\u0002\n\u0011PbSprintDetection\u0012?\n\u0006source\u0018\u0001 \u0002(\u000e2/.data.PbSprintDetection.PbSprintDetectionSource\u0012+\n\u001dsprint_threshold_acceleration\u0018\u0002 \u0001(\u0002B\u0004\u0080µ\u0018E\u0012$\n\u0016sprint_threshold_speed\u0018\u0003 \u0001(\u0002B\u0004\u0080µ\u0018\u0017", "\"\u0080\u0001\n\u0017PbSprintDetectionSource\u0012\u0018\n\u0014SPRINT_DETECTION_OFF\u0010\u0000\u0012(\n$SPRINT_DETECTION_SOURCE_ACCELERATION\u0010\u0001\u0012!\n\u001dSPRINT_DETECTION_SOURCE_SPEED\u0010\u0002\"\u008c\n\n\u000ePbSportProfile\u0012\u0012\n\nidentifier\u0018\u0001 \u0001(\u0004\u0012,\n\u0010sport_identifier\u0018\u0002 \u0002(\u000b2\u0012.PbSportIdentifier\u0012.\n\bsettings\u0018\u0003 \u0001(\u000b2\u001c.data.PbSportProfileSettings\u0012I\n!OBSOLETE_sirius2_display_settings\u0018\u0004 \u0001(\u000b2\u001e.data.PbSirius2DisplaySettings\u0012\u0014\n\fsport_factor\u0018\u0005 \u0001(\u0002\u0012\u001f\n\u0011aerobic_threshold\u0018\u0006 \u0001(\rB\u0004\u0080µ\u0018\u0014\u0012!\n\u0013an", "aerobic_threshold\u0018\u0007 \u0001(\rB\u0004\u0080µ\u0018\u0014\u0012(\n\rlast_modified\u0018\b \u0002(\u000b2\u0011.PbSystemDateTime\u0012'\n\u0019OBSOLETE_sprint_threshold\u0018\t \u0001(\u0002B\u0004\u0080µ\u0018E\u0012)\n\u0013OBSOLETE_auto_pause\u0018\n \u0001(\u000b2\f.PbAutoPause\u0012E\n\u001fOBSOLETE_alcor_display_settings\u0018\u000b \u0001(\u000b2\u001c.data.PbAlcorDisplaySettings\u0012:\n\u0019sprint_detection_settings\u0018\f \u0001(\u000b2\u0017.data.PbSprintDetection\u0012<\n\u000fguitar_settings\u0018È\u0001 \u0001(\u000b2\".data.PbGuitarSportProfileSettings\u0012>\n\u0010mclaren_settings\u0018É\u0001 \u0001(\u000b2#.data.PbMcLarenSportPro", "fileSettings\u00126\n\face_settings\u0018Ê\u0001 \u0001(\u000b2\u001f.data.PbAceSportProfileSettings\u0012<\n\u000favalon_settings\u0018Ë\u0001 \u0001(\u000b2\".data.PbAvalonSportProfileSettings\u0012<\n\u000farcher_settings\u0018Ì\u0001 \u0001(\u000b2\".data.PbArcherSportProfileSettings\u0012:\n\u000eastra_settings\u0018Í\u0001 \u0001(\u000b2!.data.PbAstraSportProfileSettings\u0012@\n\u0011maserati_settings\u0018Î\u0001 \u0001(\u000b2$.data.PbMaseratiSportProfileSettings\u0012<\n\u000faustin_settings\u0018Ï\u0001 \u0001(\u000b2\".data.PbAustinSportProfileSettings\u0012<\n\u000franger_settings\u0018", "Ð\u0001 \u0001(\u000b2\".data.PbRangerSportProfileSettings\u0012<\n\u000fsniper_settings\u0018Ñ\u0001 \u0001(\u000b2\".data.PbSniperSportProfileSettings\u0012<\n\u000fvectra_settings\u0018Ò\u0001 \u0001(\u000b2\".data.PbVectraSportProfileSettings\u0012:\n\u000emetro_settings\u0018Ó\u0001 \u0001(\u000b2!.data.PbMetroSportProfileSettingsB7\n'fi.polar.remote.representation.protobufB\fSportProfile"}, new FileDescriptor[]{var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17}, var0);
      internal_static_data_PbTrainingReminder_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_data_PbTrainingReminder_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbTrainingReminder_descriptor, new String[]{"ReminderType", "ReminderText", "CalorieReminderValue", "TimeReminderValue", "DistanceReminderValue"});
      internal_static_data_PbSportProfileSettings_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_data_PbSportProfileSettings_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbSportProfileSettings_descriptor, new String[]{"Volume", "SpeedView", "ZoneOptimizerSetting", "OBSOLETEHeartRateView", "SensorBroadcastingHr", "ZoneLimits", "TrainingReminder", "VoiceGuidance", "OBSOLETEGpsSetting", "OBSOLETEAutolapSettings", "OBSOLETEAltitudeSetting", "PowerView", "StrideSpeedSource", "RemoteButtonActions", "HrZoneLockAvailable", "SpeedZoneLockAvailable", "PowerZoneLockAvailable", "SwimmingUnits"});
      internal_static_data_PbSprintDetection_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_data_PbSprintDetection_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbSprintDetection_descriptor, new String[]{"Source", "SprintThresholdAcceleration", "SprintThresholdSpeed"});
      internal_static_data_PbSportProfile_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_data_PbSportProfile_fieldAccessorTable = new FieldAccessorTable(internal_static_data_PbSportProfile_descriptor, new String[]{"Identifier", "SportIdentifier", "Settings", "OBSOLETESirius2DisplaySettings", "SportFactor", "AerobicThreshold", "AnaerobicThreshold", "LastModified", "OBSOLETESprintThreshold", "OBSOLETEAutoPause", "OBSOLETEAlcorDisplaySettings", "SprintDetectionSettings", "GuitarSettings", "MclarenSettings", "AceSettings", "AvalonSettings", "ArcherSettings", "AstraSettings", "MaseratiSettings", "AustinSettings", "RangerSettings", "SniperSettings", "VectraSettings", "MetroSettings"});
      ExtensionRegistry var18 = ExtensionRegistry.newInstance();
      var18.add(Nanopb.nanopb);
      var18.add(Types.type);
      FileDescriptor.internalUpdateFileDescriptor(descriptor, var18);
      Types.getDescriptor();
      Structures.getDescriptor();
      Sport.getDescriptor();
      Nanopb.getDescriptor();
      SportprofileAceSettings.getDescriptor();
      SportprofileGuitarSettings.getDescriptor();
      SportprofileMclarenSettings.getDescriptor();
      SportprofileAvalonSettings.getDescriptor();
      SportprofileArcherSettings.getDescriptor();
      SportprofileSniperSettings.getDescriptor();
      SportprofileAstraSettings.getDescriptor();
      SportprofileVectraSettings.getDescriptor();
      SportprofileAustinSettings.getDescriptor();
      SportprofileMaseratiSettings.getDescriptor();
      SportprofileRangerSettings.getDescriptor();
      SportprofileMetroSettings.getDescriptor();
      SportprofileDisplays.getDescriptor();
   }

   private SportProfile() {
   }

   // $FF: synthetic method
   static Descriptor a() {
      return internal_static_data_PbTrainingReminder_descriptor;
   }

   // $FF: synthetic method
   static FileDescriptor a(FileDescriptor var0) {
      descriptor = var0;
      return var0;
   }

   // $FF: synthetic method
   static FieldAccessorTable b() {
      return internal_static_data_PbTrainingReminder_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor c() {
      return internal_static_data_PbSportProfileSettings_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable d() {
      return internal_static_data_PbSportProfileSettings_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor e() {
      return internal_static_data_PbSprintDetection_descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable f() {
      return internal_static_data_PbSprintDetection_fieldAccessorTable;
   }

   // $FF: synthetic method
   static Descriptor g() {
      return internal_static_data_PbSportProfile_descriptor;
   }

   public static FileDescriptor getDescriptor() {
      return descriptor;
   }

   // $FF: synthetic method
   static FieldAccessorTable h() {
      return internal_static_data_PbSportProfile_fieldAccessorTable;
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }
}
