package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.InputStream;

public final class UserDeviceSettings$PbUserDeviceSettings extends GeneratedMessageV3 implements UserDeviceSettings$PbUserDeviceSettingsOrBuilder {
   public static final int ALARM_SETTINGS_FIELD_NUMBER = 2;
   public static final int AUTOMATIC_SAMPLE_SETTINGS_FIELD_NUMBER = 15;
   public static final int AUTO_SYNC_SETTINGS_FIELD_NUMBER = 14;
   public static final int COUNTDOWN_SETTINGS_FIELD_NUMBER = 3;
   private static final UserDeviceSettings$PbUserDeviceSettings DEFAULT_INSTANCE = new UserDeviceSettings$PbUserDeviceSettings();
   public static final int DO_NOT_DISTURB_SETTINGS_FIELD_NUMBER = 13;
   public static final int END_TIME_ESTIMATOR_SETTINGS_FIELD_NUMBER = 6;
   public static final int GENERAL_SETTINGS_FIELD_NUMBER = 1;
   public static final int INTERVAL_TIMER_SETTINGS_FIELD_NUMBER = 5;
   public static final int JUMPTEST_SETTINGS_FIELD_NUMBER = 4;
   public static final int LAST_MODIFIED_FIELD_NUMBER = 101;
   public static final int MAP_SETTINGS_FIELD_NUMBER = 10;
   public static final int MASS_STORAGE_SETTINGS_FIELD_NUMBER = 12;
   @Deprecated
   public static final Parser PARSER = new UserDeviceSettings$PbUserDeviceSettings$1();
   public static final int RESEARCH_SETTINGS_FIELD_NUMBER = 7;
   public static final int RINSE_DRY_MESSAGE_SETTINGS_FIELD_NUMBER = 11;
   public static final int SAFETY_LIGHT_SETTINGS_FIELD_NUMBER = 8;
   public static final int SMART_WATCH_NOTIFICATION_SETTINGS_FIELD_NUMBER = 9;
   public static final int STRAVA_SEGMENTS_SETTINGS_FIELD_NUMBER = 16;
   private static final long serialVersionUID = 0L;
   private UserDeviceSettings$PbUserDeviceAlarmSettings alarmSettings_;
   private UserDeviceSettings$PbUserDeviceAutoSyncSettings autoSyncSettings_;
   private UserDeviceSettings$PbUserDeviceAutomaticSampleSettings automaticSampleSettings_;
   private int bitField0_;
   private UserDeviceSettings$PbUserDeviceCountdownSettings countdownSettings_;
   private UserDeviceSettings$PbUserDeviceDoNotDisturbSettings doNotDisturbSettings_;
   private UserDeviceSettings$PbUserEndTimeEstimatorSettings endTimeEstimatorSettings_;
   private UserDeviceSettings$PbUserDeviceGeneralSettings generalSettings_;
   private UserDeviceSettings$PbUserIntervalTimerSettings intervalTimerSettings_;
   private UserDeviceSettings$PbUserDeviceJumpTestSettings jumptestSettings_;
   private Types$PbSystemDateTime lastModified_;
   private UserDeviceSettings$PbUserMapSettings mapSettings_;
   private UserDeviceSettings$PbUserDeviceMassStorageSettings massStorageSettings_;
   private byte memoizedIsInitialized;
   private UserDeviceSettings$PbUserDeviceResearchSettings researchSettings_;
   private UserDeviceSettings$PbUserDeviceRinseDryMessageSettings rinseDryMessageSettings_;
   private UserDeviceSettings$PbUserSafetyLightSettings safetyLightSettings_;
   private UserDeviceSettings$PbUserSmartWatchNotificationSettings smartWatchNotificationSettings_;
   private UserDeviceSettings$PbUserDeviceStravaSegmentsSettings stravaSegmentsSettings_;

   private UserDeviceSettings$PbUserDeviceSettings() {
      this.memoizedIsInitialized = (byte)-1;
   }

   private UserDeviceSettings$PbUserDeviceSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceSettings(CodedInputStream var1, ExtensionRegistryLite var2, UserDeviceSettings$1 var3) {
      this(var1, var2);
   }

   private UserDeviceSettings$PbUserDeviceSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceSettings(Builder var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(UserDeviceSettings$PbUserDeviceSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(UserDeviceSettings$PbUserDeviceSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime a(UserDeviceSettings$PbUserDeviceSettings var0, Types$PbSystemDateTime var1) {
      var0.lastModified_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UserDeviceSettings$PbUserDeviceAlarmSettings a(UserDeviceSettings$PbUserDeviceSettings var0, UserDeviceSettings$PbUserDeviceAlarmSettings var1) {
      var0.alarmSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UserDeviceSettings$PbUserDeviceAutoSyncSettings a(UserDeviceSettings$PbUserDeviceSettings var0, UserDeviceSettings$PbUserDeviceAutoSyncSettings var1) {
      var0.autoSyncSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UserDeviceSettings$PbUserDeviceAutomaticSampleSettings a(UserDeviceSettings$PbUserDeviceSettings var0, UserDeviceSettings$PbUserDeviceAutomaticSampleSettings var1) {
      var0.automaticSampleSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UserDeviceSettings$PbUserDeviceCountdownSettings a(UserDeviceSettings$PbUserDeviceSettings var0, UserDeviceSettings$PbUserDeviceCountdownSettings var1) {
      var0.countdownSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UserDeviceSettings$PbUserDeviceDoNotDisturbSettings a(UserDeviceSettings$PbUserDeviceSettings var0, UserDeviceSettings$PbUserDeviceDoNotDisturbSettings var1) {
      var0.doNotDisturbSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UserDeviceSettings$PbUserDeviceGeneralSettings a(UserDeviceSettings$PbUserDeviceSettings var0, UserDeviceSettings$PbUserDeviceGeneralSettings var1) {
      var0.generalSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UserDeviceSettings$PbUserDeviceJumpTestSettings a(UserDeviceSettings$PbUserDeviceSettings var0, UserDeviceSettings$PbUserDeviceJumpTestSettings var1) {
      var0.jumptestSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UserDeviceSettings$PbUserDeviceMassStorageSettings a(UserDeviceSettings$PbUserDeviceSettings var0, UserDeviceSettings$PbUserDeviceMassStorageSettings var1) {
      var0.massStorageSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UserDeviceSettings$PbUserDeviceResearchSettings a(UserDeviceSettings$PbUserDeviceSettings var0, UserDeviceSettings$PbUserDeviceResearchSettings var1) {
      var0.researchSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UserDeviceSettings$PbUserDeviceRinseDryMessageSettings a(UserDeviceSettings$PbUserDeviceSettings var0, UserDeviceSettings$PbUserDeviceRinseDryMessageSettings var1) {
      var0.rinseDryMessageSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UserDeviceSettings$PbUserDeviceStravaSegmentsSettings a(UserDeviceSettings$PbUserDeviceSettings var0, UserDeviceSettings$PbUserDeviceStravaSegmentsSettings var1) {
      var0.stravaSegmentsSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UserDeviceSettings$PbUserEndTimeEstimatorSettings a(UserDeviceSettings$PbUserDeviceSettings var0, UserDeviceSettings$PbUserEndTimeEstimatorSettings var1) {
      var0.endTimeEstimatorSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UserDeviceSettings$PbUserIntervalTimerSettings a(UserDeviceSettings$PbUserDeviceSettings var0, UserDeviceSettings$PbUserIntervalTimerSettings var1) {
      var0.intervalTimerSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UserDeviceSettings$PbUserMapSettings a(UserDeviceSettings$PbUserDeviceSettings var0, UserDeviceSettings$PbUserMapSettings var1) {
      var0.mapSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UserDeviceSettings$PbUserSafetyLightSettings a(UserDeviceSettings$PbUserDeviceSettings var0, UserDeviceSettings$PbUserSafetyLightSettings var1) {
      var0.safetyLightSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UserDeviceSettings$PbUserSmartWatchNotificationSettings a(UserDeviceSettings$PbUserDeviceSettings var0, UserDeviceSettings$PbUserSmartWatchNotificationSettings var1) {
      var0.smartWatchNotificationSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static UserDeviceSettings$PbUserDeviceSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.K();
   }

   public static UserDeviceSettings$PbUserDeviceSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UserDeviceSettings$PbUserDeviceSettings$Builder newBuilder(UserDeviceSettings$PbUserDeviceSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceSettings parseDelimitedFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserDeviceSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceSettings parseFrom(ByteString var0) {
      return (UserDeviceSettings$PbUserDeviceSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceSettings)PARSER.parseFrom(var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceSettings parseFrom(CodedInputStream var0) {
      return (UserDeviceSettings$PbUserDeviceSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceSettings parseFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserDeviceSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceSettings parseFrom(byte[] var0) {
      return (UserDeviceSettings$PbUserDeviceSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof UserDeviceSettings$PbUserDeviceSettings)) {
            var2 = super.equals(var1);
         } else {
            UserDeviceSettings$PbUserDeviceSettings var5 = (UserDeviceSettings$PbUserDeviceSettings)var1;
            boolean var3;
            if (this.hasGeneralSettings() == var5.hasGeneralSettings()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasGeneralSettings()) {
               if (var3 && this.getGeneralSettings().equals(var5.getGeneralSettings())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAlarmSettings() == var5.hasAlarmSettings()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAlarmSettings()) {
               if (var4 && this.getAlarmSettings().equals(var5.getAlarmSettings())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasCountdownSettings() == var5.hasCountdownSettings()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasCountdownSettings()) {
               if (var4 && this.getCountdownSettings().equals(var5.getCountdownSettings())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasJumptestSettings() == var5.hasJumptestSettings()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasJumptestSettings()) {
               if (var4 && this.getJumptestSettings().equals(var5.getJumptestSettings())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasIntervalTimerSettings() == var5.hasIntervalTimerSettings()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasIntervalTimerSettings()) {
               if (var3 && this.getIntervalTimerSettings().equals(var5.getIntervalTimerSettings())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasEndTimeEstimatorSettings() == var5.hasEndTimeEstimatorSettings()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasEndTimeEstimatorSettings()) {
               if (var4 && this.getEndTimeEstimatorSettings().equals(var5.getEndTimeEstimatorSettings())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasResearchSettings() == var5.hasResearchSettings()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasResearchSettings()) {
               if (var3 && this.getResearchSettings().equals(var5.getResearchSettings())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSafetyLightSettings() == var5.hasSafetyLightSettings()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSafetyLightSettings()) {
               if (var3 && this.getSafetyLightSettings().equals(var5.getSafetyLightSettings())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSmartWatchNotificationSettings() == var5.hasSmartWatchNotificationSettings()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSmartWatchNotificationSettings()) {
               if (var3 && this.getSmartWatchNotificationSettings().equals(var5.getSmartWatchNotificationSettings())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasMapSettings() == var5.hasMapSettings()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasMapSettings()) {
               if (var3 && this.getMapSettings().equals(var5.getMapSettings())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasRinseDryMessageSettings() == var5.hasRinseDryMessageSettings()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasRinseDryMessageSettings()) {
               if (var4 && this.getRinseDryMessageSettings().equals(var5.getRinseDryMessageSettings())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasMassStorageSettings() == var5.hasMassStorageSettings()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasMassStorageSettings()) {
               if (var3 && this.getMassStorageSettings().equals(var5.getMassStorageSettings())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasDoNotDisturbSettings() == var5.hasDoNotDisturbSettings()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasDoNotDisturbSettings()) {
               if (var4 && this.getDoNotDisturbSettings().equals(var5.getDoNotDisturbSettings())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasAutoSyncSettings() == var5.hasAutoSyncSettings()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasAutoSyncSettings()) {
               if (var3 && this.getAutoSyncSettings().equals(var5.getAutoSyncSettings())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAutomaticSampleSettings() == var5.hasAutomaticSampleSettings()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasAutomaticSampleSettings()) {
               if (var3 && this.getAutomaticSampleSettings().equals(var5.getAutomaticSampleSettings())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasStravaSegmentsSettings() == var5.hasStravaSegmentsSettings()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasStravaSegmentsSettings()) {
               if (var3 && this.getStravaSegmentsSettings().equals(var5.getStravaSegmentsSettings())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasLastModified() == var5.hasLastModified()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasLastModified()) {
               if (var3 && this.getLastModified().equals(var5.getLastModified())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (!var4 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public UserDeviceSettings$PbUserDeviceAlarmSettings getAlarmSettings() {
      UserDeviceSettings$PbUserDeviceAlarmSettings var1;
      if (this.alarmSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceAlarmSettings.getDefaultInstance();
      } else {
         var1 = this.alarmSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceAlarmSettingsOrBuilder getAlarmSettingsOrBuilder() {
      UserDeviceSettings$PbUserDeviceAlarmSettings var1;
      if (this.alarmSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceAlarmSettings.getDefaultInstance();
      } else {
         var1 = this.alarmSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceAutoSyncSettings getAutoSyncSettings() {
      UserDeviceSettings$PbUserDeviceAutoSyncSettings var1;
      if (this.autoSyncSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceAutoSyncSettings.getDefaultInstance();
      } else {
         var1 = this.autoSyncSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceAutoSyncSettingsOrBuilder getAutoSyncSettingsOrBuilder() {
      UserDeviceSettings$PbUserDeviceAutoSyncSettings var1;
      if (this.autoSyncSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceAutoSyncSettings.getDefaultInstance();
      } else {
         var1 = this.autoSyncSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceAutomaticSampleSettings getAutomaticSampleSettings() {
      UserDeviceSettings$PbUserDeviceAutomaticSampleSettings var1;
      if (this.automaticSampleSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceAutomaticSampleSettings.getDefaultInstance();
      } else {
         var1 = this.automaticSampleSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceAutomaticSampleSettingsOrBuilder getAutomaticSampleSettingsOrBuilder() {
      UserDeviceSettings$PbUserDeviceAutomaticSampleSettings var1;
      if (this.automaticSampleSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceAutomaticSampleSettings.getDefaultInstance();
      } else {
         var1 = this.automaticSampleSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceCountdownSettings getCountdownSettings() {
      UserDeviceSettings$PbUserDeviceCountdownSettings var1;
      if (this.countdownSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceCountdownSettings.getDefaultInstance();
      } else {
         var1 = this.countdownSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceCountdownSettingsOrBuilder getCountdownSettingsOrBuilder() {
      UserDeviceSettings$PbUserDeviceCountdownSettings var1;
      if (this.countdownSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceCountdownSettings.getDefaultInstance();
      } else {
         var1 = this.countdownSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceSettings getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettings getDoNotDisturbSettings() {
      UserDeviceSettings$PbUserDeviceDoNotDisturbSettings var1;
      if (this.doNotDisturbSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceDoNotDisturbSettings.getDefaultInstance();
      } else {
         var1 = this.doNotDisturbSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettingsOrBuilder getDoNotDisturbSettingsOrBuilder() {
      UserDeviceSettings$PbUserDeviceDoNotDisturbSettings var1;
      if (this.doNotDisturbSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceDoNotDisturbSettings.getDefaultInstance();
      } else {
         var1 = this.doNotDisturbSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserEndTimeEstimatorSettings getEndTimeEstimatorSettings() {
      UserDeviceSettings$PbUserEndTimeEstimatorSettings var1;
      if (this.endTimeEstimatorSettings_ == null) {
         var1 = UserDeviceSettings$PbUserEndTimeEstimatorSettings.getDefaultInstance();
      } else {
         var1 = this.endTimeEstimatorSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserEndTimeEstimatorSettingsOrBuilder getEndTimeEstimatorSettingsOrBuilder() {
      UserDeviceSettings$PbUserEndTimeEstimatorSettings var1;
      if (this.endTimeEstimatorSettings_ == null) {
         var1 = UserDeviceSettings$PbUserEndTimeEstimatorSettings.getDefaultInstance();
      } else {
         var1 = this.endTimeEstimatorSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings getGeneralSettings() {
      UserDeviceSettings$PbUserDeviceGeneralSettings var1;
      if (this.generalSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceGeneralSettings.getDefaultInstance();
      } else {
         var1 = this.generalSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettingsOrBuilder getGeneralSettingsOrBuilder() {
      UserDeviceSettings$PbUserDeviceGeneralSettings var1;
      if (this.generalSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceGeneralSettings.getDefaultInstance();
      } else {
         var1 = this.generalSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserIntervalTimerSettings getIntervalTimerSettings() {
      UserDeviceSettings$PbUserIntervalTimerSettings var1;
      if (this.intervalTimerSettings_ == null) {
         var1 = UserDeviceSettings$PbUserIntervalTimerSettings.getDefaultInstance();
      } else {
         var1 = this.intervalTimerSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserIntervalTimerSettingsOrBuilder getIntervalTimerSettingsOrBuilder() {
      UserDeviceSettings$PbUserIntervalTimerSettings var1;
      if (this.intervalTimerSettings_ == null) {
         var1 = UserDeviceSettings$PbUserIntervalTimerSettings.getDefaultInstance();
      } else {
         var1 = this.intervalTimerSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceJumpTestSettings getJumptestSettings() {
      UserDeviceSettings$PbUserDeviceJumpTestSettings var1;
      if (this.jumptestSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceJumpTestSettings.getDefaultInstance();
      } else {
         var1 = this.jumptestSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceJumpTestSettingsOrBuilder getJumptestSettingsOrBuilder() {
      UserDeviceSettings$PbUserDeviceJumpTestSettings var1;
      if (this.jumptestSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceJumpTestSettings.getDefaultInstance();
      } else {
         var1 = this.jumptestSettings_;
      }

      return var1;
   }

   public Types$PbSystemDateTime getLastModified() {
      Types$PbSystemDateTime var1;
      if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
      }

      return var1;
   }

   public Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder() {
      Types$PbSystemDateTime var1;
      if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserMapSettings getMapSettings() {
      UserDeviceSettings$PbUserMapSettings var1;
      if (this.mapSettings_ == null) {
         var1 = UserDeviceSettings$PbUserMapSettings.getDefaultInstance();
      } else {
         var1 = this.mapSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserMapSettingsOrBuilder getMapSettingsOrBuilder() {
      UserDeviceSettings$PbUserMapSettings var1;
      if (this.mapSettings_ == null) {
         var1 = UserDeviceSettings$PbUserMapSettings.getDefaultInstance();
      } else {
         var1 = this.mapSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceMassStorageSettings getMassStorageSettings() {
      UserDeviceSettings$PbUserDeviceMassStorageSettings var1;
      if (this.massStorageSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceMassStorageSettings.getDefaultInstance();
      } else {
         var1 = this.massStorageSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceMassStorageSettingsOrBuilder getMassStorageSettingsOrBuilder() {
      UserDeviceSettings$PbUserDeviceMassStorageSettings var1;
      if (this.massStorageSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceMassStorageSettings.getDefaultInstance();
      } else {
         var1 = this.massStorageSettings_;
      }

      return var1;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings getResearchSettings() {
      UserDeviceSettings$PbUserDeviceResearchSettings var1;
      if (this.researchSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceResearchSettings.getDefaultInstance();
      } else {
         var1 = this.researchSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceResearchSettingsOrBuilder getResearchSettingsOrBuilder() {
      UserDeviceSettings$PbUserDeviceResearchSettings var1;
      if (this.researchSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceResearchSettings.getDefaultInstance();
      } else {
         var1 = this.researchSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceRinseDryMessageSettings getRinseDryMessageSettings() {
      UserDeviceSettings$PbUserDeviceRinseDryMessageSettings var1;
      if (this.rinseDryMessageSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceRinseDryMessageSettings.getDefaultInstance();
      } else {
         var1 = this.rinseDryMessageSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceRinseDryMessageSettingsOrBuilder getRinseDryMessageSettingsOrBuilder() {
      UserDeviceSettings$PbUserDeviceRinseDryMessageSettings var1;
      if (this.rinseDryMessageSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceRinseDryMessageSettings.getDefaultInstance();
      } else {
         var1 = this.rinseDryMessageSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserSafetyLightSettings getSafetyLightSettings() {
      UserDeviceSettings$PbUserSafetyLightSettings var1;
      if (this.safetyLightSettings_ == null) {
         var1 = UserDeviceSettings$PbUserSafetyLightSettings.getDefaultInstance();
      } else {
         var1 = this.safetyLightSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserSafetyLightSettingsOrBuilder getSafetyLightSettingsOrBuilder() {
      UserDeviceSettings$PbUserSafetyLightSettings var1;
      if (this.safetyLightSettings_ == null) {
         var1 = UserDeviceSettings$PbUserSafetyLightSettings.getDefaultInstance();
      } else {
         var1 = this.safetyLightSettings_;
      }

      return var1;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeMessageSize(1, this.getGeneralSettings());
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeMessageSize(2, this.getAlarmSettings());
         }

         var1 = var2;
         if ((this.bitField0_ & 4) == 4) {
            var1 = var2 + CodedOutputStream.computeMessageSize(3, this.getCountdownSettings());
         }

         var2 = var1;
         if ((this.bitField0_ & 8) == 8) {
            var2 = var1 + CodedOutputStream.computeMessageSize(4, this.getJumptestSettings());
         }

         var1 = var2;
         if ((this.bitField0_ & 16) == 16) {
            var1 = var2 + CodedOutputStream.computeMessageSize(5, this.getIntervalTimerSettings());
         }

         var2 = var1;
         if ((this.bitField0_ & 32) == 32) {
            var2 = var1 + CodedOutputStream.computeMessageSize(6, this.getEndTimeEstimatorSettings());
         }

         var1 = var2;
         if ((this.bitField0_ & 64) == 64) {
            var1 = var2 + CodedOutputStream.computeMessageSize(7, this.getResearchSettings());
         }

         var2 = var1;
         if ((this.bitField0_ & 128) == 128) {
            var2 = var1 + CodedOutputStream.computeMessageSize(8, this.getSafetyLightSettings());
         }

         var1 = var2;
         if ((this.bitField0_ & 256) == 256) {
            var1 = var2 + CodedOutputStream.computeMessageSize(9, this.getSmartWatchNotificationSettings());
         }

         var2 = var1;
         if ((this.bitField0_ & 512) == 512) {
            var2 = var1 + CodedOutputStream.computeMessageSize(10, this.getMapSettings());
         }

         var1 = var2;
         if ((this.bitField0_ & 1024) == 1024) {
            var1 = var2 + CodedOutputStream.computeMessageSize(11, this.getRinseDryMessageSettings());
         }

         var2 = var1;
         if ((this.bitField0_ & 2048) == 2048) {
            var2 = var1 + CodedOutputStream.computeMessageSize(12, this.getMassStorageSettings());
         }

         var1 = var2;
         if ((this.bitField0_ & 4096) == 4096) {
            var1 = var2 + CodedOutputStream.computeMessageSize(13, this.getDoNotDisturbSettings());
         }

         int var3 = var1;
         if ((this.bitField0_ & 8192) == 8192) {
            var3 = var1 + CodedOutputStream.computeMessageSize(14, this.getAutoSyncSettings());
         }

         var2 = var3;
         if ((this.bitField0_ & 16384) == 16384) {
            var2 = var3 + CodedOutputStream.computeMessageSize(15, this.getAutomaticSampleSettings());
         }

         var1 = var2;
         if ((this.bitField0_ & '耀') == 32768) {
            var1 = var2 + CodedOutputStream.computeMessageSize(16, this.getStravaSegmentsSettings());
         }

         var2 = var1;
         if ((this.bitField0_ & 65536) == 65536) {
            var2 = var1 + CodedOutputStream.computeMessageSize(101, this.getLastModified());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings getSmartWatchNotificationSettings() {
      UserDeviceSettings$PbUserSmartWatchNotificationSettings var1;
      if (this.smartWatchNotificationSettings_ == null) {
         var1 = UserDeviceSettings$PbUserSmartWatchNotificationSettings.getDefaultInstance();
      } else {
         var1 = this.smartWatchNotificationSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettingsOrBuilder getSmartWatchNotificationSettingsOrBuilder() {
      UserDeviceSettings$PbUserSmartWatchNotificationSettings var1;
      if (this.smartWatchNotificationSettings_ == null) {
         var1 = UserDeviceSettings$PbUserSmartWatchNotificationSettings.getDefaultInstance();
      } else {
         var1 = this.smartWatchNotificationSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceStravaSegmentsSettings getStravaSegmentsSettings() {
      UserDeviceSettings$PbUserDeviceStravaSegmentsSettings var1;
      if (this.stravaSegmentsSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceStravaSegmentsSettings.getDefaultInstance();
      } else {
         var1 = this.stravaSegmentsSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceStravaSegmentsSettingsOrBuilder getStravaSegmentsSettingsOrBuilder() {
      UserDeviceSettings$PbUserDeviceStravaSegmentsSettings var1;
      if (this.stravaSegmentsSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceStravaSegmentsSettings.getDefaultInstance();
      } else {
         var1 = this.stravaSegmentsSettings_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasAlarmSettings() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAutoSyncSettings() {
      boolean var1;
      if ((this.bitField0_ & 8192) == 8192) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAutomaticSampleSettings() {
      boolean var1;
      if ((this.bitField0_ & 16384) == 16384) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasCountdownSettings() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDoNotDisturbSettings() {
      boolean var1;
      if ((this.bitField0_ & 4096) == 4096) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasEndTimeEstimatorSettings() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasGeneralSettings() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasIntervalTimerSettings() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasJumptestSettings() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLastModified() {
      boolean var1;
      if ((this.bitField0_ & 65536) == 65536) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMapSettings() {
      boolean var1;
      if ((this.bitField0_ & 512) == 512) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMassStorageSettings() {
      boolean var1;
      if ((this.bitField0_ & 2048) == 2048) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasResearchSettings() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasRinseDryMessageSettings() {
      boolean var1;
      if ((this.bitField0_ & 1024) == 1024) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSafetyLightSettings() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSmartWatchNotificationSettings() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStravaSegmentsSettings() {
      boolean var1;
      if ((this.bitField0_ & '耀') == 32768) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         var1 = this.getDescriptorForType().hashCode() + 779;
         int var2 = var1;
         if (this.hasGeneralSettings()) {
            var2 = (var1 * 37 + 1) * 53 + this.getGeneralSettings().hashCode();
         }

         var1 = var2;
         if (this.hasAlarmSettings()) {
            var1 = (var2 * 37 + 2) * 53 + this.getAlarmSettings().hashCode();
         }

         var2 = var1;
         if (this.hasCountdownSettings()) {
            var2 = (var1 * 37 + 3) * 53 + this.getCountdownSettings().hashCode();
         }

         var1 = var2;
         if (this.hasJumptestSettings()) {
            var1 = (var2 * 37 + 4) * 53 + this.getJumptestSettings().hashCode();
         }

         var2 = var1;
         if (this.hasIntervalTimerSettings()) {
            var2 = (var1 * 37 + 5) * 53 + this.getIntervalTimerSettings().hashCode();
         }

         var1 = var2;
         if (this.hasEndTimeEstimatorSettings()) {
            var1 = (var2 * 37 + 6) * 53 + this.getEndTimeEstimatorSettings().hashCode();
         }

         int var3 = var1;
         if (this.hasResearchSettings()) {
            var3 = (var1 * 37 + 7) * 53 + this.getResearchSettings().hashCode();
         }

         var2 = var3;
         if (this.hasSafetyLightSettings()) {
            var2 = (var3 * 37 + 8) * 53 + this.getSafetyLightSettings().hashCode();
         }

         var1 = var2;
         if (this.hasSmartWatchNotificationSettings()) {
            var1 = (var2 * 37 + 9) * 53 + this.getSmartWatchNotificationSettings().hashCode();
         }

         var2 = var1;
         if (this.hasMapSettings()) {
            var2 = (var1 * 37 + 10) * 53 + this.getMapSettings().hashCode();
         }

         var1 = var2;
         if (this.hasRinseDryMessageSettings()) {
            var1 = (var2 * 37 + 11) * 53 + this.getRinseDryMessageSettings().hashCode();
         }

         var2 = var1;
         if (this.hasMassStorageSettings()) {
            var2 = (var1 * 37 + 12) * 53 + this.getMassStorageSettings().hashCode();
         }

         var3 = var2;
         if (this.hasDoNotDisturbSettings()) {
            var3 = (var2 * 37 + 13) * 53 + this.getDoNotDisturbSettings().hashCode();
         }

         var1 = var3;
         if (this.hasAutoSyncSettings()) {
            var1 = (var3 * 37 + 14) * 53 + this.getAutoSyncSettings().hashCode();
         }

         var2 = var1;
         if (this.hasAutomaticSampleSettings()) {
            var2 = (var1 * 37 + 15) * 53 + this.getAutomaticSampleSettings().hashCode();
         }

         var1 = var2;
         if (this.hasStravaSegmentsSettings()) {
            var1 = (var2 * 37 + 16) * 53 + this.getStravaSegmentsSettings().hashCode();
         }

         var2 = var1;
         if (this.hasLastModified()) {
            var2 = (var1 * 37 + 101) * 53 + this.getLastModified().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.L().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserDeviceSettings.class, UserDeviceSettings$PbUserDeviceSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasGeneralSettings()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasLastModified()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getGeneralSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasAlarmSettings() && !this.getAlarmSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasCountdownSettings() && !this.getCountdownSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasJumptestSettings() && !this.getJumptestSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasIntervalTimerSettings() && !this.getIntervalTimerSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasSafetyLightSettings() && !this.getSafetyLightSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasSmartWatchNotificationSettings() && !this.getSmartWatchNotificationSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasMapSettings() && !this.getMapSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasRinseDryMessageSettings() && !this.getRinseDryMessageSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasMassStorageSettings() && !this.getMassStorageSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasDoNotDisturbSettings() && !this.getDoNotDisturbSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasAutoSyncSettings() && !this.getAutoSyncSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasAutomaticSampleSettings() && !this.getAutomaticSampleSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasStravaSegmentsSettings() && !this.getStravaSegmentsSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getLastModified().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected UserDeviceSettings$PbUserDeviceSettings$Builder newBuilderForType(BuilderParent var1) {
      return new UserDeviceSettings$PbUserDeviceSettings$Builder(var1, (UserDeviceSettings$1)null);
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder toBuilder() {
      UserDeviceSettings$PbUserDeviceSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new UserDeviceSettings$PbUserDeviceSettings$Builder((UserDeviceSettings$1)null);
      } else {
         var1 = (new UserDeviceSettings$PbUserDeviceSettings$Builder((UserDeviceSettings$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getGeneralSettings());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getAlarmSettings());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getCountdownSettings());
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeMessage(4, this.getJumptestSettings());
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeMessage(5, this.getIntervalTimerSettings());
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeMessage(6, this.getEndTimeEstimatorSettings());
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeMessage(7, this.getResearchSettings());
      }

      if ((this.bitField0_ & 128) == 128) {
         var1.writeMessage(8, this.getSafetyLightSettings());
      }

      if ((this.bitField0_ & 256) == 256) {
         var1.writeMessage(9, this.getSmartWatchNotificationSettings());
      }

      if ((this.bitField0_ & 512) == 512) {
         var1.writeMessage(10, this.getMapSettings());
      }

      if ((this.bitField0_ & 1024) == 1024) {
         var1.writeMessage(11, this.getRinseDryMessageSettings());
      }

      if ((this.bitField0_ & 2048) == 2048) {
         var1.writeMessage(12, this.getMassStorageSettings());
      }

      if ((this.bitField0_ & 4096) == 4096) {
         var1.writeMessage(13, this.getDoNotDisturbSettings());
      }

      if ((this.bitField0_ & 8192) == 8192) {
         var1.writeMessage(14, this.getAutoSyncSettings());
      }

      if ((this.bitField0_ & 16384) == 16384) {
         var1.writeMessage(15, this.getAutomaticSampleSettings());
      }

      if ((this.bitField0_ & '耀') == 32768) {
         var1.writeMessage(16, this.getStravaSegmentsSettings());
      }

      if ((this.bitField0_ & 65536) == 65536) {
         var1.writeMessage(101, this.getLastModified());
      }

      this.unknownFields.writeTo(var1);
   }
}
