package fi.polar.remote.representation.protobuf;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class UserDeviceSettings$PbUserDeviceSettings$Builder extends Builder implements UserDeviceSettings$PbUserDeviceSettingsOrBuilder {
   private SingleFieldBuilderV3 alarmSettingsBuilder_;
   private UserDeviceSettings$PbUserDeviceAlarmSettings alarmSettings_;
   private SingleFieldBuilderV3 autoSyncSettingsBuilder_;
   private UserDeviceSettings$PbUserDeviceAutoSyncSettings autoSyncSettings_;
   private SingleFieldBuilderV3 automaticSampleSettingsBuilder_;
   private UserDeviceSettings$PbUserDeviceAutomaticSampleSettings automaticSampleSettings_;
   private int bitField0_;
   private SingleFieldBuilderV3 countdownSettingsBuilder_;
   private UserDeviceSettings$PbUserDeviceCountdownSettings countdownSettings_;
   private SingleFieldBuilderV3 doNotDisturbSettingsBuilder_;
   private UserDeviceSettings$PbUserDeviceDoNotDisturbSettings doNotDisturbSettings_;
   private SingleFieldBuilderV3 endTimeEstimatorSettingsBuilder_;
   private UserDeviceSettings$PbUserEndTimeEstimatorSettings endTimeEstimatorSettings_;
   private SingleFieldBuilderV3 generalSettingsBuilder_;
   private UserDeviceSettings$PbUserDeviceGeneralSettings generalSettings_;
   private SingleFieldBuilderV3 intervalTimerSettingsBuilder_;
   private UserDeviceSettings$PbUserIntervalTimerSettings intervalTimerSettings_;
   private SingleFieldBuilderV3 jumptestSettingsBuilder_;
   private UserDeviceSettings$PbUserDeviceJumpTestSettings jumptestSettings_;
   private SingleFieldBuilderV3 lastModifiedBuilder_;
   private Types$PbSystemDateTime lastModified_;
   private SingleFieldBuilderV3 mapSettingsBuilder_;
   private UserDeviceSettings$PbUserMapSettings mapSettings_;
   private SingleFieldBuilderV3 massStorageSettingsBuilder_;
   private UserDeviceSettings$PbUserDeviceMassStorageSettings massStorageSettings_;
   private SingleFieldBuilderV3 researchSettingsBuilder_;
   private UserDeviceSettings$PbUserDeviceResearchSettings researchSettings_;
   private SingleFieldBuilderV3 rinseDryMessageSettingsBuilder_;
   private UserDeviceSettings$PbUserDeviceRinseDryMessageSettings rinseDryMessageSettings_;
   private SingleFieldBuilderV3 safetyLightSettingsBuilder_;
   private UserDeviceSettings$PbUserSafetyLightSettings safetyLightSettings_;
   private SingleFieldBuilderV3 smartWatchNotificationSettingsBuilder_;
   private UserDeviceSettings$PbUserSmartWatchNotificationSettings smartWatchNotificationSettings_;
   private SingleFieldBuilderV3 stravaSegmentsSettingsBuilder_;
   private UserDeviceSettings$PbUserDeviceStravaSegmentsSettings stravaSegmentsSettings_;

   private UserDeviceSettings$PbUserDeviceSettings$Builder() {
      this.generalSettings_ = null;
      this.alarmSettings_ = null;
      this.countdownSettings_ = null;
      this.jumptestSettings_ = null;
      this.intervalTimerSettings_ = null;
      this.endTimeEstimatorSettings_ = null;
      this.researchSettings_ = null;
      this.safetyLightSettings_ = null;
      this.smartWatchNotificationSettings_ = null;
      this.mapSettings_ = null;
      this.rinseDryMessageSettings_ = null;
      this.massStorageSettings_ = null;
      this.doNotDisturbSettings_ = null;
      this.autoSyncSettings_ = null;
      this.automaticSampleSettings_ = null;
      this.stravaSegmentsSettings_ = null;
      this.lastModified_ = null;
      this.maybeForceBuilderInitialization();
   }

   private UserDeviceSettings$PbUserDeviceSettings$Builder(BuilderParent var1) {
      super(var1);
      this.generalSettings_ = null;
      this.alarmSettings_ = null;
      this.countdownSettings_ = null;
      this.jumptestSettings_ = null;
      this.intervalTimerSettings_ = null;
      this.endTimeEstimatorSettings_ = null;
      this.researchSettings_ = null;
      this.safetyLightSettings_ = null;
      this.smartWatchNotificationSettings_ = null;
      this.mapSettings_ = null;
      this.rinseDryMessageSettings_ = null;
      this.massStorageSettings_ = null;
      this.doNotDisturbSettings_ = null;
      this.autoSyncSettings_ = null;
      this.automaticSampleSettings_ = null;
      this.stravaSegmentsSettings_ = null;
      this.lastModified_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceSettings$Builder(BuilderParent var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceSettings$Builder(UserDeviceSettings$1 var1) {
      this();
   }

   private SingleFieldBuilderV3 getAlarmSettingsFieldBuilder() {
      if (this.alarmSettingsBuilder_ == null) {
         this.alarmSettingsBuilder_ = new SingleFieldBuilderV3(this.getAlarmSettings(), this.getParentForChildren(), this.isClean());
         this.alarmSettings_ = null;
      }

      return this.alarmSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getAutoSyncSettingsFieldBuilder() {
      if (this.autoSyncSettingsBuilder_ == null) {
         this.autoSyncSettingsBuilder_ = new SingleFieldBuilderV3(this.getAutoSyncSettings(), this.getParentForChildren(), this.isClean());
         this.autoSyncSettings_ = null;
      }

      return this.autoSyncSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getAutomaticSampleSettingsFieldBuilder() {
      if (this.automaticSampleSettingsBuilder_ == null) {
         this.automaticSampleSettingsBuilder_ = new SingleFieldBuilderV3(this.getAutomaticSampleSettings(), this.getParentForChildren(), this.isClean());
         this.automaticSampleSettings_ = null;
      }

      return this.automaticSampleSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getCountdownSettingsFieldBuilder() {
      if (this.countdownSettingsBuilder_ == null) {
         this.countdownSettingsBuilder_ = new SingleFieldBuilderV3(this.getCountdownSettings(), this.getParentForChildren(), this.isClean());
         this.countdownSettings_ = null;
      }

      return this.countdownSettingsBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.K();
   }

   private SingleFieldBuilderV3 getDoNotDisturbSettingsFieldBuilder() {
      if (this.doNotDisturbSettingsBuilder_ == null) {
         this.doNotDisturbSettingsBuilder_ = new SingleFieldBuilderV3(this.getDoNotDisturbSettings(), this.getParentForChildren(), this.isClean());
         this.doNotDisturbSettings_ = null;
      }

      return this.doNotDisturbSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getEndTimeEstimatorSettingsFieldBuilder() {
      if (this.endTimeEstimatorSettingsBuilder_ == null) {
         this.endTimeEstimatorSettingsBuilder_ = new SingleFieldBuilderV3(this.getEndTimeEstimatorSettings(), this.getParentForChildren(), this.isClean());
         this.endTimeEstimatorSettings_ = null;
      }

      return this.endTimeEstimatorSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getGeneralSettingsFieldBuilder() {
      if (this.generalSettingsBuilder_ == null) {
         this.generalSettingsBuilder_ = new SingleFieldBuilderV3(this.getGeneralSettings(), this.getParentForChildren(), this.isClean());
         this.generalSettings_ = null;
      }

      return this.generalSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getIntervalTimerSettingsFieldBuilder() {
      if (this.intervalTimerSettingsBuilder_ == null) {
         this.intervalTimerSettingsBuilder_ = new SingleFieldBuilderV3(this.getIntervalTimerSettings(), this.getParentForChildren(), this.isClean());
         this.intervalTimerSettings_ = null;
      }

      return this.intervalTimerSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getJumptestSettingsFieldBuilder() {
      if (this.jumptestSettingsBuilder_ == null) {
         this.jumptestSettingsBuilder_ = new SingleFieldBuilderV3(this.getJumptestSettings(), this.getParentForChildren(), this.isClean());
         this.jumptestSettings_ = null;
      }

      return this.jumptestSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getLastModifiedFieldBuilder() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModifiedBuilder_ = new SingleFieldBuilderV3(this.getLastModified(), this.getParentForChildren(), this.isClean());
         this.lastModified_ = null;
      }

      return this.lastModifiedBuilder_;
   }

   private SingleFieldBuilderV3 getMapSettingsFieldBuilder() {
      if (this.mapSettingsBuilder_ == null) {
         this.mapSettingsBuilder_ = new SingleFieldBuilderV3(this.getMapSettings(), this.getParentForChildren(), this.isClean());
         this.mapSettings_ = null;
      }

      return this.mapSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getMassStorageSettingsFieldBuilder() {
      if (this.massStorageSettingsBuilder_ == null) {
         this.massStorageSettingsBuilder_ = new SingleFieldBuilderV3(this.getMassStorageSettings(), this.getParentForChildren(), this.isClean());
         this.massStorageSettings_ = null;
      }

      return this.massStorageSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getResearchSettingsFieldBuilder() {
      if (this.researchSettingsBuilder_ == null) {
         this.researchSettingsBuilder_ = new SingleFieldBuilderV3(this.getResearchSettings(), this.getParentForChildren(), this.isClean());
         this.researchSettings_ = null;
      }

      return this.researchSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getRinseDryMessageSettingsFieldBuilder() {
      if (this.rinseDryMessageSettingsBuilder_ == null) {
         this.rinseDryMessageSettingsBuilder_ = new SingleFieldBuilderV3(this.getRinseDryMessageSettings(), this.getParentForChildren(), this.isClean());
         this.rinseDryMessageSettings_ = null;
      }

      return this.rinseDryMessageSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getSafetyLightSettingsFieldBuilder() {
      if (this.safetyLightSettingsBuilder_ == null) {
         this.safetyLightSettingsBuilder_ = new SingleFieldBuilderV3(this.getSafetyLightSettings(), this.getParentForChildren(), this.isClean());
         this.safetyLightSettings_ = null;
      }

      return this.safetyLightSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getSmartWatchNotificationSettingsFieldBuilder() {
      if (this.smartWatchNotificationSettingsBuilder_ == null) {
         this.smartWatchNotificationSettingsBuilder_ = new SingleFieldBuilderV3(this.getSmartWatchNotificationSettings(), this.getParentForChildren(), this.isClean());
         this.smartWatchNotificationSettings_ = null;
      }

      return this.smartWatchNotificationSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getStravaSegmentsSettingsFieldBuilder() {
      if (this.stravaSegmentsSettingsBuilder_ == null) {
         this.stravaSegmentsSettingsBuilder_ = new SingleFieldBuilderV3(this.getStravaSegmentsSettings(), this.getParentForChildren(), this.isClean());
         this.stravaSegmentsSettings_ = null;
      }

      return this.stravaSegmentsSettingsBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (UserDeviceSettings$PbUserDeviceSettings.b()) {
         this.getGeneralSettingsFieldBuilder();
         this.getAlarmSettingsFieldBuilder();
         this.getCountdownSettingsFieldBuilder();
         this.getJumptestSettingsFieldBuilder();
         this.getIntervalTimerSettingsFieldBuilder();
         this.getEndTimeEstimatorSettingsFieldBuilder();
         this.getResearchSettingsFieldBuilder();
         this.getSafetyLightSettingsFieldBuilder();
         this.getSmartWatchNotificationSettingsFieldBuilder();
         this.getMapSettingsFieldBuilder();
         this.getRinseDryMessageSettingsFieldBuilder();
         this.getMassStorageSettingsFieldBuilder();
         this.getDoNotDisturbSettingsFieldBuilder();
         this.getAutoSyncSettingsFieldBuilder();
         this.getAutomaticSampleSettingsFieldBuilder();
         this.getStravaSegmentsSettingsFieldBuilder();
         this.getLastModifiedFieldBuilder();
      }

   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserDeviceSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public UserDeviceSettings$PbUserDeviceSettings build() {
      UserDeviceSettings$PbUserDeviceSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public UserDeviceSettings$PbUserDeviceSettings buildPartial() {
      UserDeviceSettings$PbUserDeviceSettings var1 = new UserDeviceSettings$PbUserDeviceSettings(this, (UserDeviceSettings$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.generalSettingsBuilder_ == null) {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, this.generalSettings_);
      } else {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, (UserDeviceSettings$PbUserDeviceGeneralSettings)this.generalSettingsBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.alarmSettingsBuilder_ == null) {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, this.alarmSettings_);
      } else {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, (UserDeviceSettings$PbUserDeviceAlarmSettings)this.alarmSettingsBuilder_.build());
      }

      int var6 = var4;
      if ((var2 & 4) == 4) {
         var6 = var4 | 4;
      }

      if (this.countdownSettingsBuilder_ == null) {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, this.countdownSettings_);
      } else {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, (UserDeviceSettings$PbUserDeviceCountdownSettings)this.countdownSettingsBuilder_.build());
      }

      int var5 = var6;
      if ((var2 & 8) == 8) {
         var5 = var6 | 8;
      }

      if (this.jumptestSettingsBuilder_ == null) {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, this.jumptestSettings_);
      } else {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, (UserDeviceSettings$PbUserDeviceJumpTestSettings)this.jumptestSettingsBuilder_.build());
      }

      var4 = var5;
      if ((var2 & 16) == 16) {
         var4 = var5 | 16;
      }

      if (this.intervalTimerSettingsBuilder_ == null) {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, this.intervalTimerSettings_);
      } else {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, (UserDeviceSettings$PbUserIntervalTimerSettings)this.intervalTimerSettingsBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 32) == 32) {
         var6 = var4 | 32;
      }

      if (this.endTimeEstimatorSettingsBuilder_ == null) {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, this.endTimeEstimatorSettings_);
      } else {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, (UserDeviceSettings$PbUserEndTimeEstimatorSettings)this.endTimeEstimatorSettingsBuilder_.build());
      }

      var5 = var6;
      if ((var2 & 64) == 64) {
         var5 = var6 | 64;
      }

      if (this.researchSettingsBuilder_ == null) {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, this.researchSettings_);
      } else {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, (UserDeviceSettings$PbUserDeviceResearchSettings)this.researchSettingsBuilder_.build());
      }

      var4 = var5;
      if ((var2 & 128) == 128) {
         var4 = var5 | 128;
      }

      if (this.safetyLightSettingsBuilder_ == null) {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, this.safetyLightSettings_);
      } else {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, (UserDeviceSettings$PbUserSafetyLightSettings)this.safetyLightSettingsBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 256) == 256) {
         var6 = var4 | 256;
      }

      if (this.smartWatchNotificationSettingsBuilder_ == null) {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, this.smartWatchNotificationSettings_);
      } else {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, (UserDeviceSettings$PbUserSmartWatchNotificationSettings)this.smartWatchNotificationSettingsBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 512) == 512) {
         var4 = var6 | 512;
      }

      if (this.mapSettingsBuilder_ == null) {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, this.mapSettings_);
      } else {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, (UserDeviceSettings$PbUserMapSettings)this.mapSettingsBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 1024) == 1024) {
         var6 = var4 | 1024;
      }

      if (this.rinseDryMessageSettingsBuilder_ == null) {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, this.rinseDryMessageSettings_);
      } else {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, (UserDeviceSettings$PbUserDeviceRinseDryMessageSettings)this.rinseDryMessageSettingsBuilder_.build());
      }

      var5 = var6;
      if ((var2 & 2048) == 2048) {
         var5 = var6 | 2048;
      }

      if (this.massStorageSettingsBuilder_ == null) {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, this.massStorageSettings_);
      } else {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, (UserDeviceSettings$PbUserDeviceMassStorageSettings)this.massStorageSettingsBuilder_.build());
      }

      var4 = var5;
      if ((var2 & 4096) == 4096) {
         var4 = var5 | 4096;
      }

      if (this.doNotDisturbSettingsBuilder_ == null) {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, this.doNotDisturbSettings_);
      } else {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, (UserDeviceSettings$PbUserDeviceDoNotDisturbSettings)this.doNotDisturbSettingsBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 8192) == 8192) {
         var6 = var4 | 8192;
      }

      if (this.autoSyncSettingsBuilder_ == null) {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, this.autoSyncSettings_);
      } else {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, (UserDeviceSettings$PbUserDeviceAutoSyncSettings)this.autoSyncSettingsBuilder_.build());
      }

      var5 = var6;
      if ((var2 & 16384) == 16384) {
         var5 = var6 | 16384;
      }

      if (this.automaticSampleSettingsBuilder_ == null) {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, this.automaticSampleSettings_);
      } else {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, (UserDeviceSettings$PbUserDeviceAutomaticSampleSettings)this.automaticSampleSettingsBuilder_.build());
      }

      var4 = var5;
      if ((var2 & '耀') == 32768) {
         var4 = var5 | '耀';
      }

      if (this.stravaSegmentsSettingsBuilder_ == null) {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, this.stravaSegmentsSettings_);
      } else {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, (UserDeviceSettings$PbUserDeviceStravaSegmentsSettings)this.stravaSegmentsSettingsBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 65536) == 65536) {
         var6 = var4 | 65536;
      }

      if (this.lastModifiedBuilder_ == null) {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, this.lastModified_);
      } else {
         UserDeviceSettings$PbUserDeviceSettings.a(var1, (Types$PbSystemDateTime)this.lastModifiedBuilder_.build());
      }

      UserDeviceSettings$PbUserDeviceSettings.a(var1, var6);
      this.onBuilt();
      return var1;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder clear() {
      super.clear();
      if (this.generalSettingsBuilder_ == null) {
         this.generalSettings_ = null;
      } else {
         this.generalSettingsBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.alarmSettingsBuilder_ == null) {
         this.alarmSettings_ = null;
      } else {
         this.alarmSettingsBuilder_.clear();
      }

      this.bitField0_ &= -3;
      if (this.countdownSettingsBuilder_ == null) {
         this.countdownSettings_ = null;
      } else {
         this.countdownSettingsBuilder_.clear();
      }

      this.bitField0_ &= -5;
      if (this.jumptestSettingsBuilder_ == null) {
         this.jumptestSettings_ = null;
      } else {
         this.jumptestSettingsBuilder_.clear();
      }

      this.bitField0_ &= -9;
      if (this.intervalTimerSettingsBuilder_ == null) {
         this.intervalTimerSettings_ = null;
      } else {
         this.intervalTimerSettingsBuilder_.clear();
      }

      this.bitField0_ &= -17;
      if (this.endTimeEstimatorSettingsBuilder_ == null) {
         this.endTimeEstimatorSettings_ = null;
      } else {
         this.endTimeEstimatorSettingsBuilder_.clear();
      }

      this.bitField0_ &= -33;
      if (this.researchSettingsBuilder_ == null) {
         this.researchSettings_ = null;
      } else {
         this.researchSettingsBuilder_.clear();
      }

      this.bitField0_ &= -65;
      if (this.safetyLightSettingsBuilder_ == null) {
         this.safetyLightSettings_ = null;
      } else {
         this.safetyLightSettingsBuilder_.clear();
      }

      this.bitField0_ &= -129;
      if (this.smartWatchNotificationSettingsBuilder_ == null) {
         this.smartWatchNotificationSettings_ = null;
      } else {
         this.smartWatchNotificationSettingsBuilder_.clear();
      }

      this.bitField0_ &= -257;
      if (this.mapSettingsBuilder_ == null) {
         this.mapSettings_ = null;
      } else {
         this.mapSettingsBuilder_.clear();
      }

      this.bitField0_ &= -513;
      if (this.rinseDryMessageSettingsBuilder_ == null) {
         this.rinseDryMessageSettings_ = null;
      } else {
         this.rinseDryMessageSettingsBuilder_.clear();
      }

      this.bitField0_ &= -1025;
      if (this.massStorageSettingsBuilder_ == null) {
         this.massStorageSettings_ = null;
      } else {
         this.massStorageSettingsBuilder_.clear();
      }

      this.bitField0_ &= -2049;
      if (this.doNotDisturbSettingsBuilder_ == null) {
         this.doNotDisturbSettings_ = null;
      } else {
         this.doNotDisturbSettingsBuilder_.clear();
      }

      this.bitField0_ &= -4097;
      if (this.autoSyncSettingsBuilder_ == null) {
         this.autoSyncSettings_ = null;
      } else {
         this.autoSyncSettingsBuilder_.clear();
      }

      this.bitField0_ &= -8193;
      if (this.automaticSampleSettingsBuilder_ == null) {
         this.automaticSampleSettings_ = null;
      } else {
         this.automaticSampleSettingsBuilder_.clear();
      }

      this.bitField0_ &= -16385;
      if (this.stravaSegmentsSettingsBuilder_ == null) {
         this.stravaSegmentsSettings_ = null;
      } else {
         this.stravaSegmentsSettingsBuilder_.clear();
      }

      this.bitField0_ &= -32769;
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -65537;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder clearAlarmSettings() {
      if (this.alarmSettingsBuilder_ == null) {
         this.alarmSettings_ = null;
         this.onChanged();
      } else {
         this.alarmSettingsBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder clearAutoSyncSettings() {
      if (this.autoSyncSettingsBuilder_ == null) {
         this.autoSyncSettings_ = null;
         this.onChanged();
      } else {
         this.autoSyncSettingsBuilder_.clear();
      }

      this.bitField0_ &= -8193;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder clearAutomaticSampleSettings() {
      if (this.automaticSampleSettingsBuilder_ == null) {
         this.automaticSampleSettings_ = null;
         this.onChanged();
      } else {
         this.automaticSampleSettingsBuilder_.clear();
      }

      this.bitField0_ &= -16385;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder clearCountdownSettings() {
      if (this.countdownSettingsBuilder_ == null) {
         this.countdownSettings_ = null;
         this.onChanged();
      } else {
         this.countdownSettingsBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder clearDoNotDisturbSettings() {
      if (this.doNotDisturbSettingsBuilder_ == null) {
         this.doNotDisturbSettings_ = null;
         this.onChanged();
      } else {
         this.doNotDisturbSettingsBuilder_.clear();
      }

      this.bitField0_ &= -4097;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder clearEndTimeEstimatorSettings() {
      if (this.endTimeEstimatorSettingsBuilder_ == null) {
         this.endTimeEstimatorSettings_ = null;
         this.onChanged();
      } else {
         this.endTimeEstimatorSettingsBuilder_.clear();
      }

      this.bitField0_ &= -33;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder clearField(FieldDescriptor var1) {
      return (UserDeviceSettings$PbUserDeviceSettings$Builder)super.clearField(var1);
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder clearGeneralSettings() {
      if (this.generalSettingsBuilder_ == null) {
         this.generalSettings_ = null;
         this.onChanged();
      } else {
         this.generalSettingsBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder clearIntervalTimerSettings() {
      if (this.intervalTimerSettingsBuilder_ == null) {
         this.intervalTimerSettings_ = null;
         this.onChanged();
      } else {
         this.intervalTimerSettingsBuilder_.clear();
      }

      this.bitField0_ &= -17;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder clearJumptestSettings() {
      if (this.jumptestSettingsBuilder_ == null) {
         this.jumptestSettings_ = null;
         this.onChanged();
      } else {
         this.jumptestSettingsBuilder_.clear();
      }

      this.bitField0_ &= -9;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder clearLastModified() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -65537;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder clearMapSettings() {
      if (this.mapSettingsBuilder_ == null) {
         this.mapSettings_ = null;
         this.onChanged();
      } else {
         this.mapSettingsBuilder_.clear();
      }

      this.bitField0_ &= -513;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder clearMassStorageSettings() {
      if (this.massStorageSettingsBuilder_ == null) {
         this.massStorageSettings_ = null;
         this.onChanged();
      } else {
         this.massStorageSettingsBuilder_.clear();
      }

      this.bitField0_ &= -2049;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder clearOneof(OneofDescriptor var1) {
      return (UserDeviceSettings$PbUserDeviceSettings$Builder)super.clearOneof(var1);
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder clearResearchSettings() {
      if (this.researchSettingsBuilder_ == null) {
         this.researchSettings_ = null;
         this.onChanged();
      } else {
         this.researchSettingsBuilder_.clear();
      }

      this.bitField0_ &= -65;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder clearRinseDryMessageSettings() {
      if (this.rinseDryMessageSettingsBuilder_ == null) {
         this.rinseDryMessageSettings_ = null;
         this.onChanged();
      } else {
         this.rinseDryMessageSettingsBuilder_.clear();
      }

      this.bitField0_ &= -1025;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder clearSafetyLightSettings() {
      if (this.safetyLightSettingsBuilder_ == null) {
         this.safetyLightSettings_ = null;
         this.onChanged();
      } else {
         this.safetyLightSettingsBuilder_.clear();
      }

      this.bitField0_ &= -129;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder clearSmartWatchNotificationSettings() {
      if (this.smartWatchNotificationSettingsBuilder_ == null) {
         this.smartWatchNotificationSettings_ = null;
         this.onChanged();
      } else {
         this.smartWatchNotificationSettingsBuilder_.clear();
      }

      this.bitField0_ &= -257;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder clearStravaSegmentsSettings() {
      if (this.stravaSegmentsSettingsBuilder_ == null) {
         this.stravaSegmentsSettings_ = null;
         this.onChanged();
      } else {
         this.stravaSegmentsSettingsBuilder_.clear();
      }

      this.bitField0_ &= -32769;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder clone() {
      return (UserDeviceSettings$PbUserDeviceSettings$Builder)super.clone();
   }

   public UserDeviceSettings$PbUserDeviceAlarmSettings getAlarmSettings() {
      UserDeviceSettings$PbUserDeviceAlarmSettings var1;
      if (this.alarmSettingsBuilder_ == null) {
         if (this.alarmSettings_ == null) {
            var1 = UserDeviceSettings$PbUserDeviceAlarmSettings.getDefaultInstance();
         } else {
            var1 = this.alarmSettings_;
         }
      } else {
         var1 = (UserDeviceSettings$PbUserDeviceAlarmSettings)this.alarmSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceAlarmSettings$Builder getAlarmSettingsBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (UserDeviceSettings$PbUserDeviceAlarmSettings$Builder)this.getAlarmSettingsFieldBuilder().getBuilder();
   }

   public UserDeviceSettings$PbUserDeviceAlarmSettingsOrBuilder getAlarmSettingsOrBuilder() {
      Object var1;
      if (this.alarmSettingsBuilder_ != null) {
         var1 = (UserDeviceSettings$PbUserDeviceAlarmSettingsOrBuilder)this.alarmSettingsBuilder_.getMessageOrBuilder();
      } else if (this.alarmSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceAlarmSettings.getDefaultInstance();
      } else {
         var1 = this.alarmSettings_;
      }

      return (UserDeviceSettings$PbUserDeviceAlarmSettingsOrBuilder)var1;
   }

   public UserDeviceSettings$PbUserDeviceAutoSyncSettings getAutoSyncSettings() {
      UserDeviceSettings$PbUserDeviceAutoSyncSettings var1;
      if (this.autoSyncSettingsBuilder_ == null) {
         if (this.autoSyncSettings_ == null) {
            var1 = UserDeviceSettings$PbUserDeviceAutoSyncSettings.getDefaultInstance();
         } else {
            var1 = this.autoSyncSettings_;
         }
      } else {
         var1 = (UserDeviceSettings$PbUserDeviceAutoSyncSettings)this.autoSyncSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder getAutoSyncSettingsBuilder() {
      this.bitField0_ |= 8192;
      this.onChanged();
      return (UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder)this.getAutoSyncSettingsFieldBuilder().getBuilder();
   }

   public UserDeviceSettings$PbUserDeviceAutoSyncSettingsOrBuilder getAutoSyncSettingsOrBuilder() {
      Object var1;
      if (this.autoSyncSettingsBuilder_ != null) {
         var1 = (UserDeviceSettings$PbUserDeviceAutoSyncSettingsOrBuilder)this.autoSyncSettingsBuilder_.getMessageOrBuilder();
      } else if (this.autoSyncSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceAutoSyncSettings.getDefaultInstance();
      } else {
         var1 = this.autoSyncSettings_;
      }

      return (UserDeviceSettings$PbUserDeviceAutoSyncSettingsOrBuilder)var1;
   }

   public UserDeviceSettings$PbUserDeviceAutomaticSampleSettings getAutomaticSampleSettings() {
      UserDeviceSettings$PbUserDeviceAutomaticSampleSettings var1;
      if (this.automaticSampleSettingsBuilder_ == null) {
         if (this.automaticSampleSettings_ == null) {
            var1 = UserDeviceSettings$PbUserDeviceAutomaticSampleSettings.getDefaultInstance();
         } else {
            var1 = this.automaticSampleSettings_;
         }
      } else {
         var1 = (UserDeviceSettings$PbUserDeviceAutomaticSampleSettings)this.automaticSampleSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder getAutomaticSampleSettingsBuilder() {
      this.bitField0_ |= 16384;
      this.onChanged();
      return (UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder)this.getAutomaticSampleSettingsFieldBuilder().getBuilder();
   }

   public UserDeviceSettings$PbUserDeviceAutomaticSampleSettingsOrBuilder getAutomaticSampleSettingsOrBuilder() {
      Object var1;
      if (this.automaticSampleSettingsBuilder_ != null) {
         var1 = (UserDeviceSettings$PbUserDeviceAutomaticSampleSettingsOrBuilder)this.automaticSampleSettingsBuilder_.getMessageOrBuilder();
      } else if (this.automaticSampleSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceAutomaticSampleSettings.getDefaultInstance();
      } else {
         var1 = this.automaticSampleSettings_;
      }

      return (UserDeviceSettings$PbUserDeviceAutomaticSampleSettingsOrBuilder)var1;
   }

   public UserDeviceSettings$PbUserDeviceCountdownSettings getCountdownSettings() {
      UserDeviceSettings$PbUserDeviceCountdownSettings var1;
      if (this.countdownSettingsBuilder_ == null) {
         if (this.countdownSettings_ == null) {
            var1 = UserDeviceSettings$PbUserDeviceCountdownSettings.getDefaultInstance();
         } else {
            var1 = this.countdownSettings_;
         }
      } else {
         var1 = (UserDeviceSettings$PbUserDeviceCountdownSettings)this.countdownSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceCountdownSettings$Builder getCountdownSettingsBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (UserDeviceSettings$PbUserDeviceCountdownSettings$Builder)this.getCountdownSettingsFieldBuilder().getBuilder();
   }

   public UserDeviceSettings$PbUserDeviceCountdownSettingsOrBuilder getCountdownSettingsOrBuilder() {
      Object var1;
      if (this.countdownSettingsBuilder_ != null) {
         var1 = (UserDeviceSettings$PbUserDeviceCountdownSettingsOrBuilder)this.countdownSettingsBuilder_.getMessageOrBuilder();
      } else if (this.countdownSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceCountdownSettings.getDefaultInstance();
      } else {
         var1 = this.countdownSettings_;
      }

      return (UserDeviceSettings$PbUserDeviceCountdownSettingsOrBuilder)var1;
   }

   public UserDeviceSettings$PbUserDeviceSettings getDefaultInstanceForType() {
      return UserDeviceSettings$PbUserDeviceSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return UserDeviceSettings.K();
   }

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettings getDoNotDisturbSettings() {
      UserDeviceSettings$PbUserDeviceDoNotDisturbSettings var1;
      if (this.doNotDisturbSettingsBuilder_ == null) {
         if (this.doNotDisturbSettings_ == null) {
            var1 = UserDeviceSettings$PbUserDeviceDoNotDisturbSettings.getDefaultInstance();
         } else {
            var1 = this.doNotDisturbSettings_;
         }
      } else {
         var1 = (UserDeviceSettings$PbUserDeviceDoNotDisturbSettings)this.doNotDisturbSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder getDoNotDisturbSettingsBuilder() {
      this.bitField0_ |= 4096;
      this.onChanged();
      return (UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder)this.getDoNotDisturbSettingsFieldBuilder().getBuilder();
   }

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettingsOrBuilder getDoNotDisturbSettingsOrBuilder() {
      Object var1;
      if (this.doNotDisturbSettingsBuilder_ != null) {
         var1 = (UserDeviceSettings$PbUserDeviceDoNotDisturbSettingsOrBuilder)this.doNotDisturbSettingsBuilder_.getMessageOrBuilder();
      } else if (this.doNotDisturbSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceDoNotDisturbSettings.getDefaultInstance();
      } else {
         var1 = this.doNotDisturbSettings_;
      }

      return (UserDeviceSettings$PbUserDeviceDoNotDisturbSettingsOrBuilder)var1;
   }

   public UserDeviceSettings$PbUserEndTimeEstimatorSettings getEndTimeEstimatorSettings() {
      UserDeviceSettings$PbUserEndTimeEstimatorSettings var1;
      if (this.endTimeEstimatorSettingsBuilder_ == null) {
         if (this.endTimeEstimatorSettings_ == null) {
            var1 = UserDeviceSettings$PbUserEndTimeEstimatorSettings.getDefaultInstance();
         } else {
            var1 = this.endTimeEstimatorSettings_;
         }
      } else {
         var1 = (UserDeviceSettings$PbUserEndTimeEstimatorSettings)this.endTimeEstimatorSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder getEndTimeEstimatorSettingsBuilder() {
      this.bitField0_ |= 32;
      this.onChanged();
      return (UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder)this.getEndTimeEstimatorSettingsFieldBuilder().getBuilder();
   }

   public UserDeviceSettings$PbUserEndTimeEstimatorSettingsOrBuilder getEndTimeEstimatorSettingsOrBuilder() {
      Object var1;
      if (this.endTimeEstimatorSettingsBuilder_ != null) {
         var1 = (UserDeviceSettings$PbUserEndTimeEstimatorSettingsOrBuilder)this.endTimeEstimatorSettingsBuilder_.getMessageOrBuilder();
      } else if (this.endTimeEstimatorSettings_ == null) {
         var1 = UserDeviceSettings$PbUserEndTimeEstimatorSettings.getDefaultInstance();
      } else {
         var1 = this.endTimeEstimatorSettings_;
      }

      return (UserDeviceSettings$PbUserEndTimeEstimatorSettingsOrBuilder)var1;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings getGeneralSettings() {
      UserDeviceSettings$PbUserDeviceGeneralSettings var1;
      if (this.generalSettingsBuilder_ == null) {
         if (this.generalSettings_ == null) {
            var1 = UserDeviceSettings$PbUserDeviceGeneralSettings.getDefaultInstance();
         } else {
            var1 = this.generalSettings_;
         }
      } else {
         var1 = (UserDeviceSettings$PbUserDeviceGeneralSettings)this.generalSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder getGeneralSettingsBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (UserDeviceSettings$PbUserDeviceGeneralSettings$Builder)this.getGeneralSettingsFieldBuilder().getBuilder();
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettingsOrBuilder getGeneralSettingsOrBuilder() {
      Object var1;
      if (this.generalSettingsBuilder_ != null) {
         var1 = (UserDeviceSettings$PbUserDeviceGeneralSettingsOrBuilder)this.generalSettingsBuilder_.getMessageOrBuilder();
      } else if (this.generalSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceGeneralSettings.getDefaultInstance();
      } else {
         var1 = this.generalSettings_;
      }

      return (UserDeviceSettings$PbUserDeviceGeneralSettingsOrBuilder)var1;
   }

   public UserDeviceSettings$PbUserIntervalTimerSettings getIntervalTimerSettings() {
      UserDeviceSettings$PbUserIntervalTimerSettings var1;
      if (this.intervalTimerSettingsBuilder_ == null) {
         if (this.intervalTimerSettings_ == null) {
            var1 = UserDeviceSettings$PbUserIntervalTimerSettings.getDefaultInstance();
         } else {
            var1 = this.intervalTimerSettings_;
         }
      } else {
         var1 = (UserDeviceSettings$PbUserIntervalTimerSettings)this.intervalTimerSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public UserDeviceSettings$PbUserIntervalTimerSettings$Builder getIntervalTimerSettingsBuilder() {
      this.bitField0_ |= 16;
      this.onChanged();
      return (UserDeviceSettings$PbUserIntervalTimerSettings$Builder)this.getIntervalTimerSettingsFieldBuilder().getBuilder();
   }

   public UserDeviceSettings$PbUserIntervalTimerSettingsOrBuilder getIntervalTimerSettingsOrBuilder() {
      Object var1;
      if (this.intervalTimerSettingsBuilder_ != null) {
         var1 = (UserDeviceSettings$PbUserIntervalTimerSettingsOrBuilder)this.intervalTimerSettingsBuilder_.getMessageOrBuilder();
      } else if (this.intervalTimerSettings_ == null) {
         var1 = UserDeviceSettings$PbUserIntervalTimerSettings.getDefaultInstance();
      } else {
         var1 = this.intervalTimerSettings_;
      }

      return (UserDeviceSettings$PbUserIntervalTimerSettingsOrBuilder)var1;
   }

   public UserDeviceSettings$PbUserDeviceJumpTestSettings getJumptestSettings() {
      UserDeviceSettings$PbUserDeviceJumpTestSettings var1;
      if (this.jumptestSettingsBuilder_ == null) {
         if (this.jumptestSettings_ == null) {
            var1 = UserDeviceSettings$PbUserDeviceJumpTestSettings.getDefaultInstance();
         } else {
            var1 = this.jumptestSettings_;
         }
      } else {
         var1 = (UserDeviceSettings$PbUserDeviceJumpTestSettings)this.jumptestSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder getJumptestSettingsBuilder() {
      this.bitField0_ |= 8;
      this.onChanged();
      return (UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder)this.getJumptestSettingsFieldBuilder().getBuilder();
   }

   public UserDeviceSettings$PbUserDeviceJumpTestSettingsOrBuilder getJumptestSettingsOrBuilder() {
      Object var1;
      if (this.jumptestSettingsBuilder_ != null) {
         var1 = (UserDeviceSettings$PbUserDeviceJumpTestSettingsOrBuilder)this.jumptestSettingsBuilder_.getMessageOrBuilder();
      } else if (this.jumptestSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceJumpTestSettings.getDefaultInstance();
      } else {
         var1 = this.jumptestSettings_;
      }

      return (UserDeviceSettings$PbUserDeviceJumpTestSettingsOrBuilder)var1;
   }

   public Types$PbSystemDateTime getLastModified() {
      Types$PbSystemDateTime var1;
      if (this.lastModifiedBuilder_ == null) {
         if (this.lastModified_ == null) {
            var1 = Types$PbSystemDateTime.getDefaultInstance();
         } else {
            var1 = this.lastModified_;
         }
      } else {
         var1 = (Types$PbSystemDateTime)this.lastModifiedBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbSystemDateTime$Builder getLastModifiedBuilder() {
      this.bitField0_ |= 65536;
      this.onChanged();
      return (Types$PbSystemDateTime$Builder)this.getLastModifiedFieldBuilder().getBuilder();
   }

   public Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder() {
      Object var1;
      if (this.lastModifiedBuilder_ != null) {
         var1 = (Types$PbSystemDateTimeOrBuilder)this.lastModifiedBuilder_.getMessageOrBuilder();
      } else if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
      }

      return (Types$PbSystemDateTimeOrBuilder)var1;
   }

   public UserDeviceSettings$PbUserMapSettings getMapSettings() {
      UserDeviceSettings$PbUserMapSettings var1;
      if (this.mapSettingsBuilder_ == null) {
         if (this.mapSettings_ == null) {
            var1 = UserDeviceSettings$PbUserMapSettings.getDefaultInstance();
         } else {
            var1 = this.mapSettings_;
         }
      } else {
         var1 = (UserDeviceSettings$PbUserMapSettings)this.mapSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public UserDeviceSettings$PbUserMapSettings$Builder getMapSettingsBuilder() {
      this.bitField0_ |= 512;
      this.onChanged();
      return (UserDeviceSettings$PbUserMapSettings$Builder)this.getMapSettingsFieldBuilder().getBuilder();
   }

   public UserDeviceSettings$PbUserMapSettingsOrBuilder getMapSettingsOrBuilder() {
      Object var1;
      if (this.mapSettingsBuilder_ != null) {
         var1 = (UserDeviceSettings$PbUserMapSettingsOrBuilder)this.mapSettingsBuilder_.getMessageOrBuilder();
      } else if (this.mapSettings_ == null) {
         var1 = UserDeviceSettings$PbUserMapSettings.getDefaultInstance();
      } else {
         var1 = this.mapSettings_;
      }

      return (UserDeviceSettings$PbUserMapSettingsOrBuilder)var1;
   }

   public UserDeviceSettings$PbUserDeviceMassStorageSettings getMassStorageSettings() {
      UserDeviceSettings$PbUserDeviceMassStorageSettings var1;
      if (this.massStorageSettingsBuilder_ == null) {
         if (this.massStorageSettings_ == null) {
            var1 = UserDeviceSettings$PbUserDeviceMassStorageSettings.getDefaultInstance();
         } else {
            var1 = this.massStorageSettings_;
         }
      } else {
         var1 = (UserDeviceSettings$PbUserDeviceMassStorageSettings)this.massStorageSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceMassStorageSettings$Builder getMassStorageSettingsBuilder() {
      this.bitField0_ |= 2048;
      this.onChanged();
      return (UserDeviceSettings$PbUserDeviceMassStorageSettings$Builder)this.getMassStorageSettingsFieldBuilder().getBuilder();
   }

   public UserDeviceSettings$PbUserDeviceMassStorageSettingsOrBuilder getMassStorageSettingsOrBuilder() {
      Object var1;
      if (this.massStorageSettingsBuilder_ != null) {
         var1 = (UserDeviceSettings$PbUserDeviceMassStorageSettingsOrBuilder)this.massStorageSettingsBuilder_.getMessageOrBuilder();
      } else if (this.massStorageSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceMassStorageSettings.getDefaultInstance();
      } else {
         var1 = this.massStorageSettings_;
      }

      return (UserDeviceSettings$PbUserDeviceMassStorageSettingsOrBuilder)var1;
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings getResearchSettings() {
      UserDeviceSettings$PbUserDeviceResearchSettings var1;
      if (this.researchSettingsBuilder_ == null) {
         if (this.researchSettings_ == null) {
            var1 = UserDeviceSettings$PbUserDeviceResearchSettings.getDefaultInstance();
         } else {
            var1 = this.researchSettings_;
         }
      } else {
         var1 = (UserDeviceSettings$PbUserDeviceResearchSettings)this.researchSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings$Builder getResearchSettingsBuilder() {
      this.bitField0_ |= 64;
      this.onChanged();
      return (UserDeviceSettings$PbUserDeviceResearchSettings$Builder)this.getResearchSettingsFieldBuilder().getBuilder();
   }

   public UserDeviceSettings$PbUserDeviceResearchSettingsOrBuilder getResearchSettingsOrBuilder() {
      Object var1;
      if (this.researchSettingsBuilder_ != null) {
         var1 = (UserDeviceSettings$PbUserDeviceResearchSettingsOrBuilder)this.researchSettingsBuilder_.getMessageOrBuilder();
      } else if (this.researchSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceResearchSettings.getDefaultInstance();
      } else {
         var1 = this.researchSettings_;
      }

      return (UserDeviceSettings$PbUserDeviceResearchSettingsOrBuilder)var1;
   }

   public UserDeviceSettings$PbUserDeviceRinseDryMessageSettings getRinseDryMessageSettings() {
      UserDeviceSettings$PbUserDeviceRinseDryMessageSettings var1;
      if (this.rinseDryMessageSettingsBuilder_ == null) {
         if (this.rinseDryMessageSettings_ == null) {
            var1 = UserDeviceSettings$PbUserDeviceRinseDryMessageSettings.getDefaultInstance();
         } else {
            var1 = this.rinseDryMessageSettings_;
         }
      } else {
         var1 = (UserDeviceSettings$PbUserDeviceRinseDryMessageSettings)this.rinseDryMessageSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder getRinseDryMessageSettingsBuilder() {
      this.bitField0_ |= 1024;
      this.onChanged();
      return (UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder)this.getRinseDryMessageSettingsFieldBuilder().getBuilder();
   }

   public UserDeviceSettings$PbUserDeviceRinseDryMessageSettingsOrBuilder getRinseDryMessageSettingsOrBuilder() {
      Object var1;
      if (this.rinseDryMessageSettingsBuilder_ != null) {
         var1 = (UserDeviceSettings$PbUserDeviceRinseDryMessageSettingsOrBuilder)this.rinseDryMessageSettingsBuilder_.getMessageOrBuilder();
      } else if (this.rinseDryMessageSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceRinseDryMessageSettings.getDefaultInstance();
      } else {
         var1 = this.rinseDryMessageSettings_;
      }

      return (UserDeviceSettings$PbUserDeviceRinseDryMessageSettingsOrBuilder)var1;
   }

   public UserDeviceSettings$PbUserSafetyLightSettings getSafetyLightSettings() {
      UserDeviceSettings$PbUserSafetyLightSettings var1;
      if (this.safetyLightSettingsBuilder_ == null) {
         if (this.safetyLightSettings_ == null) {
            var1 = UserDeviceSettings$PbUserSafetyLightSettings.getDefaultInstance();
         } else {
            var1 = this.safetyLightSettings_;
         }
      } else {
         var1 = (UserDeviceSettings$PbUserSafetyLightSettings)this.safetyLightSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public UserDeviceSettings$PbUserSafetyLightSettings$Builder getSafetyLightSettingsBuilder() {
      this.bitField0_ |= 128;
      this.onChanged();
      return (UserDeviceSettings$PbUserSafetyLightSettings$Builder)this.getSafetyLightSettingsFieldBuilder().getBuilder();
   }

   public UserDeviceSettings$PbUserSafetyLightSettingsOrBuilder getSafetyLightSettingsOrBuilder() {
      Object var1;
      if (this.safetyLightSettingsBuilder_ != null) {
         var1 = (UserDeviceSettings$PbUserSafetyLightSettingsOrBuilder)this.safetyLightSettingsBuilder_.getMessageOrBuilder();
      } else if (this.safetyLightSettings_ == null) {
         var1 = UserDeviceSettings$PbUserSafetyLightSettings.getDefaultInstance();
      } else {
         var1 = this.safetyLightSettings_;
      }

      return (UserDeviceSettings$PbUserSafetyLightSettingsOrBuilder)var1;
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings getSmartWatchNotificationSettings() {
      UserDeviceSettings$PbUserSmartWatchNotificationSettings var1;
      if (this.smartWatchNotificationSettingsBuilder_ == null) {
         if (this.smartWatchNotificationSettings_ == null) {
            var1 = UserDeviceSettings$PbUserSmartWatchNotificationSettings.getDefaultInstance();
         } else {
            var1 = this.smartWatchNotificationSettings_;
         }
      } else {
         var1 = (UserDeviceSettings$PbUserSmartWatchNotificationSettings)this.smartWatchNotificationSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder getSmartWatchNotificationSettingsBuilder() {
      this.bitField0_ |= 256;
      this.onChanged();
      return (UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder)this.getSmartWatchNotificationSettingsFieldBuilder().getBuilder();
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettingsOrBuilder getSmartWatchNotificationSettingsOrBuilder() {
      Object var1;
      if (this.smartWatchNotificationSettingsBuilder_ != null) {
         var1 = (UserDeviceSettings$PbUserSmartWatchNotificationSettingsOrBuilder)this.smartWatchNotificationSettingsBuilder_.getMessageOrBuilder();
      } else if (this.smartWatchNotificationSettings_ == null) {
         var1 = UserDeviceSettings$PbUserSmartWatchNotificationSettings.getDefaultInstance();
      } else {
         var1 = this.smartWatchNotificationSettings_;
      }

      return (UserDeviceSettings$PbUserSmartWatchNotificationSettingsOrBuilder)var1;
   }

   public UserDeviceSettings$PbUserDeviceStravaSegmentsSettings getStravaSegmentsSettings() {
      UserDeviceSettings$PbUserDeviceStravaSegmentsSettings var1;
      if (this.stravaSegmentsSettingsBuilder_ == null) {
         if (this.stravaSegmentsSettings_ == null) {
            var1 = UserDeviceSettings$PbUserDeviceStravaSegmentsSettings.getDefaultInstance();
         } else {
            var1 = this.stravaSegmentsSettings_;
         }
      } else {
         var1 = (UserDeviceSettings$PbUserDeviceStravaSegmentsSettings)this.stravaSegmentsSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder getStravaSegmentsSettingsBuilder() {
      this.bitField0_ |= 32768;
      this.onChanged();
      return (UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder)this.getStravaSegmentsSettingsFieldBuilder().getBuilder();
   }

   public UserDeviceSettings$PbUserDeviceStravaSegmentsSettingsOrBuilder getStravaSegmentsSettingsOrBuilder() {
      Object var1;
      if (this.stravaSegmentsSettingsBuilder_ != null) {
         var1 = (UserDeviceSettings$PbUserDeviceStravaSegmentsSettingsOrBuilder)this.stravaSegmentsSettingsBuilder_.getMessageOrBuilder();
      } else if (this.stravaSegmentsSettings_ == null) {
         var1 = UserDeviceSettings$PbUserDeviceStravaSegmentsSettings.getDefaultInstance();
      } else {
         var1 = this.stravaSegmentsSettings_;
      }

      return (UserDeviceSettings$PbUserDeviceStravaSegmentsSettingsOrBuilder)var1;
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

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.L().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserDeviceSettings.class, UserDeviceSettings$PbUserDeviceSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasGeneralSettings()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasLastModified()) {
            var2 = var1;
            if (this.getGeneralSettings().isInitialized()) {
               if (this.hasAlarmSettings()) {
                  var2 = var1;
                  if (!this.getAlarmSettings().isInitialized()) {
                     return var2;
                  }
               }

               if (this.hasCountdownSettings()) {
                  var2 = var1;
                  if (!this.getCountdownSettings().isInitialized()) {
                     return var2;
                  }
               }

               if (this.hasJumptestSettings()) {
                  var2 = var1;
                  if (!this.getJumptestSettings().isInitialized()) {
                     return var2;
                  }
               }

               if (this.hasIntervalTimerSettings()) {
                  var2 = var1;
                  if (!this.getIntervalTimerSettings().isInitialized()) {
                     return var2;
                  }
               }

               if (this.hasSafetyLightSettings()) {
                  var2 = var1;
                  if (!this.getSafetyLightSettings().isInitialized()) {
                     return var2;
                  }
               }

               if (this.hasSmartWatchNotificationSettings()) {
                  var2 = var1;
                  if (!this.getSmartWatchNotificationSettings().isInitialized()) {
                     return var2;
                  }
               }

               if (this.hasMapSettings()) {
                  var2 = var1;
                  if (!this.getMapSettings().isInitialized()) {
                     return var2;
                  }
               }

               if (this.hasRinseDryMessageSettings()) {
                  var2 = var1;
                  if (!this.getRinseDryMessageSettings().isInitialized()) {
                     return var2;
                  }
               }

               if (this.hasMassStorageSettings()) {
                  var2 = var1;
                  if (!this.getMassStorageSettings().isInitialized()) {
                     return var2;
                  }
               }

               if (this.hasDoNotDisturbSettings()) {
                  var2 = var1;
                  if (!this.getDoNotDisturbSettings().isInitialized()) {
                     return var2;
                  }
               }

               if (this.hasAutoSyncSettings()) {
                  var2 = var1;
                  if (!this.getAutoSyncSettings().isInitialized()) {
                     return var2;
                  }
               }

               if (this.hasAutomaticSampleSettings()) {
                  var2 = var1;
                  if (!this.getAutomaticSampleSettings().isInitialized()) {
                     return var2;
                  }
               }

               if (this.hasStravaSegmentsSettings()) {
                  var2 = var1;
                  if (!this.getStravaSegmentsSettings().isInitialized()) {
                     return var2;
                  }
               }

               var2 = var1;
               if (this.getLastModified().isInitialized()) {
                  var2 = true;
               }
            }
         }
      }

      return var2;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder mergeAlarmSettings(UserDeviceSettings$PbUserDeviceAlarmSettings var1) {
      if (this.alarmSettingsBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.alarmSettings_ != null && this.alarmSettings_ != UserDeviceSettings$PbUserDeviceAlarmSettings.getDefaultInstance()) {
            this.alarmSettings_ = UserDeviceSettings$PbUserDeviceAlarmSettings.newBuilder(this.alarmSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.alarmSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.alarmSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder mergeAutoSyncSettings(UserDeviceSettings$PbUserDeviceAutoSyncSettings var1) {
      if (this.autoSyncSettingsBuilder_ == null) {
         if ((this.bitField0_ & 8192) == 8192 && this.autoSyncSettings_ != null && this.autoSyncSettings_ != UserDeviceSettings$PbUserDeviceAutoSyncSettings.getDefaultInstance()) {
            this.autoSyncSettings_ = UserDeviceSettings$PbUserDeviceAutoSyncSettings.newBuilder(this.autoSyncSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.autoSyncSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.autoSyncSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8192;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder mergeAutomaticSampleSettings(UserDeviceSettings$PbUserDeviceAutomaticSampleSettings var1) {
      if (this.automaticSampleSettingsBuilder_ == null) {
         if ((this.bitField0_ & 16384) == 16384 && this.automaticSampleSettings_ != null && this.automaticSampleSettings_ != UserDeviceSettings$PbUserDeviceAutomaticSampleSettings.getDefaultInstance()) {
            this.automaticSampleSettings_ = UserDeviceSettings$PbUserDeviceAutomaticSampleSettings.newBuilder(this.automaticSampleSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.automaticSampleSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.automaticSampleSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 16384;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder mergeCountdownSettings(UserDeviceSettings$PbUserDeviceCountdownSettings var1) {
      if (this.countdownSettingsBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.countdownSettings_ != null && this.countdownSettings_ != UserDeviceSettings$PbUserDeviceCountdownSettings.getDefaultInstance()) {
            this.countdownSettings_ = UserDeviceSettings$PbUserDeviceCountdownSettings.newBuilder(this.countdownSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.countdownSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.countdownSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder mergeDoNotDisturbSettings(UserDeviceSettings$PbUserDeviceDoNotDisturbSettings var1) {
      if (this.doNotDisturbSettingsBuilder_ == null) {
         if ((this.bitField0_ & 4096) == 4096 && this.doNotDisturbSettings_ != null && this.doNotDisturbSettings_ != UserDeviceSettings$PbUserDeviceDoNotDisturbSettings.getDefaultInstance()) {
            this.doNotDisturbSettings_ = UserDeviceSettings$PbUserDeviceDoNotDisturbSettings.newBuilder(this.doNotDisturbSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.doNotDisturbSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.doNotDisturbSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4096;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder mergeEndTimeEstimatorSettings(UserDeviceSettings$PbUserEndTimeEstimatorSettings var1) {
      if (this.endTimeEstimatorSettingsBuilder_ == null) {
         if ((this.bitField0_ & 32) == 32 && this.endTimeEstimatorSettings_ != null && this.endTimeEstimatorSettings_ != UserDeviceSettings$PbUserEndTimeEstimatorSettings.getDefaultInstance()) {
            this.endTimeEstimatorSettings_ = UserDeviceSettings$PbUserEndTimeEstimatorSettings.newBuilder(this.endTimeEstimatorSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.endTimeEstimatorSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.endTimeEstimatorSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      UserDeviceSettings$PbUserDeviceSettings var13;
      label96: {
         InvalidProtocolBufferException var12;
         UserDeviceSettings$PbUserDeviceSettings var14;
         try {
            var13 = (UserDeviceSettings$PbUserDeviceSettings)UserDeviceSettings$PbUserDeviceSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (UserDeviceSettings$PbUserDeviceSettings)var10.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var12.unwrapIOException();
         } finally {
            if (var14 != null) {
               this.mergeFrom(var14);
            }

            throw var12;
         }
      }

      if (var13 != null) {
         this.mergeFrom(var13);
      }

      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder mergeFrom(Message var1) {
      UserDeviceSettings$PbUserDeviceSettings$Builder var2;
      if (var1 instanceof UserDeviceSettings$PbUserDeviceSettings) {
         var2 = this.mergeFrom((UserDeviceSettings$PbUserDeviceSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder mergeFrom(UserDeviceSettings$PbUserDeviceSettings var1) {
      if (var1 != UserDeviceSettings$PbUserDeviceSettings.getDefaultInstance()) {
         if (var1.hasGeneralSettings()) {
            this.mergeGeneralSettings(var1.getGeneralSettings());
         }

         if (var1.hasAlarmSettings()) {
            this.mergeAlarmSettings(var1.getAlarmSettings());
         }

         if (var1.hasCountdownSettings()) {
            this.mergeCountdownSettings(var1.getCountdownSettings());
         }

         if (var1.hasJumptestSettings()) {
            this.mergeJumptestSettings(var1.getJumptestSettings());
         }

         if (var1.hasIntervalTimerSettings()) {
            this.mergeIntervalTimerSettings(var1.getIntervalTimerSettings());
         }

         if (var1.hasEndTimeEstimatorSettings()) {
            this.mergeEndTimeEstimatorSettings(var1.getEndTimeEstimatorSettings());
         }

         if (var1.hasResearchSettings()) {
            this.mergeResearchSettings(var1.getResearchSettings());
         }

         if (var1.hasSafetyLightSettings()) {
            this.mergeSafetyLightSettings(var1.getSafetyLightSettings());
         }

         if (var1.hasSmartWatchNotificationSettings()) {
            this.mergeSmartWatchNotificationSettings(var1.getSmartWatchNotificationSettings());
         }

         if (var1.hasMapSettings()) {
            this.mergeMapSettings(var1.getMapSettings());
         }

         if (var1.hasRinseDryMessageSettings()) {
            this.mergeRinseDryMessageSettings(var1.getRinseDryMessageSettings());
         }

         if (var1.hasMassStorageSettings()) {
            this.mergeMassStorageSettings(var1.getMassStorageSettings());
         }

         if (var1.hasDoNotDisturbSettings()) {
            this.mergeDoNotDisturbSettings(var1.getDoNotDisturbSettings());
         }

         if (var1.hasAutoSyncSettings()) {
            this.mergeAutoSyncSettings(var1.getAutoSyncSettings());
         }

         if (var1.hasAutomaticSampleSettings()) {
            this.mergeAutomaticSampleSettings(var1.getAutomaticSampleSettings());
         }

         if (var1.hasStravaSegmentsSettings()) {
            this.mergeStravaSegmentsSettings(var1.getStravaSegmentsSettings());
         }

         if (var1.hasLastModified()) {
            this.mergeLastModified(var1.getLastModified());
         }

         this.mergeUnknownFields(UserDeviceSettings$PbUserDeviceSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder mergeGeneralSettings(UserDeviceSettings$PbUserDeviceGeneralSettings var1) {
      if (this.generalSettingsBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.generalSettings_ != null && this.generalSettings_ != UserDeviceSettings$PbUserDeviceGeneralSettings.getDefaultInstance()) {
            this.generalSettings_ = UserDeviceSettings$PbUserDeviceGeneralSettings.newBuilder(this.generalSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.generalSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.generalSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder mergeIntervalTimerSettings(UserDeviceSettings$PbUserIntervalTimerSettings var1) {
      if (this.intervalTimerSettingsBuilder_ == null) {
         if ((this.bitField0_ & 16) == 16 && this.intervalTimerSettings_ != null && this.intervalTimerSettings_ != UserDeviceSettings$PbUserIntervalTimerSettings.getDefaultInstance()) {
            this.intervalTimerSettings_ = UserDeviceSettings$PbUserIntervalTimerSettings.newBuilder(this.intervalTimerSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.intervalTimerSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.intervalTimerSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder mergeJumptestSettings(UserDeviceSettings$PbUserDeviceJumpTestSettings var1) {
      if (this.jumptestSettingsBuilder_ == null) {
         if ((this.bitField0_ & 8) == 8 && this.jumptestSettings_ != null && this.jumptestSettings_ != UserDeviceSettings$PbUserDeviceJumpTestSettings.getDefaultInstance()) {
            this.jumptestSettings_ = UserDeviceSettings$PbUserDeviceJumpTestSettings.newBuilder(this.jumptestSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.jumptestSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.jumptestSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder mergeLastModified(Types$PbSystemDateTime var1) {
      if (this.lastModifiedBuilder_ == null) {
         if ((this.bitField0_ & 65536) == 65536 && this.lastModified_ != null && this.lastModified_ != Types$PbSystemDateTime.getDefaultInstance()) {
            this.lastModified_ = Types$PbSystemDateTime.newBuilder(this.lastModified_).mergeFrom(var1).buildPartial();
         } else {
            this.lastModified_ = var1;
         }

         this.onChanged();
      } else {
         this.lastModifiedBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 65536;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder mergeMapSettings(UserDeviceSettings$PbUserMapSettings var1) {
      if (this.mapSettingsBuilder_ == null) {
         if ((this.bitField0_ & 512) == 512 && this.mapSettings_ != null && this.mapSettings_ != UserDeviceSettings$PbUserMapSettings.getDefaultInstance()) {
            this.mapSettings_ = UserDeviceSettings$PbUserMapSettings.newBuilder(this.mapSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.mapSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.mapSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 512;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder mergeMassStorageSettings(UserDeviceSettings$PbUserDeviceMassStorageSettings var1) {
      if (this.massStorageSettingsBuilder_ == null) {
         if ((this.bitField0_ & 2048) == 2048 && this.massStorageSettings_ != null && this.massStorageSettings_ != UserDeviceSettings$PbUserDeviceMassStorageSettings.getDefaultInstance()) {
            this.massStorageSettings_ = UserDeviceSettings$PbUserDeviceMassStorageSettings.newBuilder(this.massStorageSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.massStorageSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.massStorageSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2048;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder mergeResearchSettings(UserDeviceSettings$PbUserDeviceResearchSettings var1) {
      if (this.researchSettingsBuilder_ == null) {
         if ((this.bitField0_ & 64) == 64 && this.researchSettings_ != null && this.researchSettings_ != UserDeviceSettings$PbUserDeviceResearchSettings.getDefaultInstance()) {
            this.researchSettings_ = UserDeviceSettings$PbUserDeviceResearchSettings.newBuilder(this.researchSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.researchSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.researchSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder mergeRinseDryMessageSettings(UserDeviceSettings$PbUserDeviceRinseDryMessageSettings var1) {
      if (this.rinseDryMessageSettingsBuilder_ == null) {
         if ((this.bitField0_ & 1024) == 1024 && this.rinseDryMessageSettings_ != null && this.rinseDryMessageSettings_ != UserDeviceSettings$PbUserDeviceRinseDryMessageSettings.getDefaultInstance()) {
            this.rinseDryMessageSettings_ = UserDeviceSettings$PbUserDeviceRinseDryMessageSettings.newBuilder(this.rinseDryMessageSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.rinseDryMessageSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.rinseDryMessageSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder mergeSafetyLightSettings(UserDeviceSettings$PbUserSafetyLightSettings var1) {
      if (this.safetyLightSettingsBuilder_ == null) {
         if ((this.bitField0_ & 128) == 128 && this.safetyLightSettings_ != null && this.safetyLightSettings_ != UserDeviceSettings$PbUserSafetyLightSettings.getDefaultInstance()) {
            this.safetyLightSettings_ = UserDeviceSettings$PbUserSafetyLightSettings.newBuilder(this.safetyLightSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.safetyLightSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.safetyLightSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 128;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder mergeSmartWatchNotificationSettings(UserDeviceSettings$PbUserSmartWatchNotificationSettings var1) {
      if (this.smartWatchNotificationSettingsBuilder_ == null) {
         if ((this.bitField0_ & 256) == 256 && this.smartWatchNotificationSettings_ != null && this.smartWatchNotificationSettings_ != UserDeviceSettings$PbUserSmartWatchNotificationSettings.getDefaultInstance()) {
            this.smartWatchNotificationSettings_ = UserDeviceSettings$PbUserSmartWatchNotificationSettings.newBuilder(this.smartWatchNotificationSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.smartWatchNotificationSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.smartWatchNotificationSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 256;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder mergeStravaSegmentsSettings(UserDeviceSettings$PbUserDeviceStravaSegmentsSettings var1) {
      if (this.stravaSegmentsSettingsBuilder_ == null) {
         if ((this.bitField0_ & '耀') == 32768 && this.stravaSegmentsSettings_ != null && this.stravaSegmentsSettings_ != UserDeviceSettings$PbUserDeviceStravaSegmentsSettings.getDefaultInstance()) {
            this.stravaSegmentsSettings_ = UserDeviceSettings$PbUserDeviceStravaSegmentsSettings.newBuilder(this.stravaSegmentsSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.stravaSegmentsSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.stravaSegmentsSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 32768;
      return this;
   }

   public final UserDeviceSettings$PbUserDeviceSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserDeviceSettings$Builder)super.mergeUnknownFields(var1);
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setAlarmSettings(UserDeviceSettings$PbUserDeviceAlarmSettings$Builder var1) {
      if (this.alarmSettingsBuilder_ == null) {
         this.alarmSettings_ = var1.build();
         this.onChanged();
      } else {
         this.alarmSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setAlarmSettings(UserDeviceSettings$PbUserDeviceAlarmSettings var1) {
      if (this.alarmSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.alarmSettings_ = var1;
         this.onChanged();
      } else {
         this.alarmSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setAutoSyncSettings(UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder var1) {
      if (this.autoSyncSettingsBuilder_ == null) {
         this.autoSyncSettings_ = var1.build();
         this.onChanged();
      } else {
         this.autoSyncSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8192;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setAutoSyncSettings(UserDeviceSettings$PbUserDeviceAutoSyncSettings var1) {
      if (this.autoSyncSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.autoSyncSettings_ = var1;
         this.onChanged();
      } else {
         this.autoSyncSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8192;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setAutomaticSampleSettings(UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder var1) {
      if (this.automaticSampleSettingsBuilder_ == null) {
         this.automaticSampleSettings_ = var1.build();
         this.onChanged();
      } else {
         this.automaticSampleSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 16384;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setAutomaticSampleSettings(UserDeviceSettings$PbUserDeviceAutomaticSampleSettings var1) {
      if (this.automaticSampleSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.automaticSampleSettings_ = var1;
         this.onChanged();
      } else {
         this.automaticSampleSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 16384;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setCountdownSettings(UserDeviceSettings$PbUserDeviceCountdownSettings$Builder var1) {
      if (this.countdownSettingsBuilder_ == null) {
         this.countdownSettings_ = var1.build();
         this.onChanged();
      } else {
         this.countdownSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setCountdownSettings(UserDeviceSettings$PbUserDeviceCountdownSettings var1) {
      if (this.countdownSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.countdownSettings_ = var1;
         this.onChanged();
      } else {
         this.countdownSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setDoNotDisturbSettings(UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder var1) {
      if (this.doNotDisturbSettingsBuilder_ == null) {
         this.doNotDisturbSettings_ = var1.build();
         this.onChanged();
      } else {
         this.doNotDisturbSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4096;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setDoNotDisturbSettings(UserDeviceSettings$PbUserDeviceDoNotDisturbSettings var1) {
      if (this.doNotDisturbSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.doNotDisturbSettings_ = var1;
         this.onChanged();
      } else {
         this.doNotDisturbSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4096;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setEndTimeEstimatorSettings(UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder var1) {
      if (this.endTimeEstimatorSettingsBuilder_ == null) {
         this.endTimeEstimatorSettings_ = var1.build();
         this.onChanged();
      } else {
         this.endTimeEstimatorSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 32;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setEndTimeEstimatorSettings(UserDeviceSettings$PbUserEndTimeEstimatorSettings var1) {
      if (this.endTimeEstimatorSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.endTimeEstimatorSettings_ = var1;
         this.onChanged();
      } else {
         this.endTimeEstimatorSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserDeviceSettings$Builder)super.setField(var1, var2);
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setGeneralSettings(UserDeviceSettings$PbUserDeviceGeneralSettings$Builder var1) {
      if (this.generalSettingsBuilder_ == null) {
         this.generalSettings_ = var1.build();
         this.onChanged();
      } else {
         this.generalSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setGeneralSettings(UserDeviceSettings$PbUserDeviceGeneralSettings var1) {
      if (this.generalSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.generalSettings_ = var1;
         this.onChanged();
      } else {
         this.generalSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setIntervalTimerSettings(UserDeviceSettings$PbUserIntervalTimerSettings$Builder var1) {
      if (this.intervalTimerSettingsBuilder_ == null) {
         this.intervalTimerSettings_ = var1.build();
         this.onChanged();
      } else {
         this.intervalTimerSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 16;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setIntervalTimerSettings(UserDeviceSettings$PbUserIntervalTimerSettings var1) {
      if (this.intervalTimerSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.intervalTimerSettings_ = var1;
         this.onChanged();
      } else {
         this.intervalTimerSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setJumptestSettings(UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder var1) {
      if (this.jumptestSettingsBuilder_ == null) {
         this.jumptestSettings_ = var1.build();
         this.onChanged();
      } else {
         this.jumptestSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setJumptestSettings(UserDeviceSettings$PbUserDeviceJumpTestSettings var1) {
      if (this.jumptestSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.jumptestSettings_ = var1;
         this.onChanged();
      } else {
         this.jumptestSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setLastModified(Types$PbSystemDateTime$Builder var1) {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = var1.build();
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 65536;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setLastModified(Types$PbSystemDateTime var1) {
      if (this.lastModifiedBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.lastModified_ = var1;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 65536;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setMapSettings(UserDeviceSettings$PbUserMapSettings$Builder var1) {
      if (this.mapSettingsBuilder_ == null) {
         this.mapSettings_ = var1.build();
         this.onChanged();
      } else {
         this.mapSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 512;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setMapSettings(UserDeviceSettings$PbUserMapSettings var1) {
      if (this.mapSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.mapSettings_ = var1;
         this.onChanged();
      } else {
         this.mapSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 512;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setMassStorageSettings(UserDeviceSettings$PbUserDeviceMassStorageSettings$Builder var1) {
      if (this.massStorageSettingsBuilder_ == null) {
         this.massStorageSettings_ = var1.build();
         this.onChanged();
      } else {
         this.massStorageSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2048;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setMassStorageSettings(UserDeviceSettings$PbUserDeviceMassStorageSettings var1) {
      if (this.massStorageSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.massStorageSettings_ = var1;
         this.onChanged();
      } else {
         this.massStorageSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2048;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (UserDeviceSettings$PbUserDeviceSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setResearchSettings(UserDeviceSettings$PbUserDeviceResearchSettings$Builder var1) {
      if (this.researchSettingsBuilder_ == null) {
         this.researchSettings_ = var1.build();
         this.onChanged();
      } else {
         this.researchSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 64;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setResearchSettings(UserDeviceSettings$PbUserDeviceResearchSettings var1) {
      if (this.researchSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.researchSettings_ = var1;
         this.onChanged();
      } else {
         this.researchSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setRinseDryMessageSettings(UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder var1) {
      if (this.rinseDryMessageSettingsBuilder_ == null) {
         this.rinseDryMessageSettings_ = var1.build();
         this.onChanged();
      } else {
         this.rinseDryMessageSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setRinseDryMessageSettings(UserDeviceSettings$PbUserDeviceRinseDryMessageSettings var1) {
      if (this.rinseDryMessageSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.rinseDryMessageSettings_ = var1;
         this.onChanged();
      } else {
         this.rinseDryMessageSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setSafetyLightSettings(UserDeviceSettings$PbUserSafetyLightSettings$Builder var1) {
      if (this.safetyLightSettingsBuilder_ == null) {
         this.safetyLightSettings_ = var1.build();
         this.onChanged();
      } else {
         this.safetyLightSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 128;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setSafetyLightSettings(UserDeviceSettings$PbUserSafetyLightSettings var1) {
      if (this.safetyLightSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.safetyLightSettings_ = var1;
         this.onChanged();
      } else {
         this.safetyLightSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 128;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setSmartWatchNotificationSettings(UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder var1) {
      if (this.smartWatchNotificationSettingsBuilder_ == null) {
         this.smartWatchNotificationSettings_ = var1.build();
         this.onChanged();
      } else {
         this.smartWatchNotificationSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 256;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setSmartWatchNotificationSettings(UserDeviceSettings$PbUserSmartWatchNotificationSettings var1) {
      if (this.smartWatchNotificationSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.smartWatchNotificationSettings_ = var1;
         this.onChanged();
      } else {
         this.smartWatchNotificationSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 256;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setStravaSegmentsSettings(UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder var1) {
      if (this.stravaSegmentsSettingsBuilder_ == null) {
         this.stravaSegmentsSettings_ = var1.build();
         this.onChanged();
      } else {
         this.stravaSegmentsSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 32768;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceSettings$Builder setStravaSegmentsSettings(UserDeviceSettings$PbUserDeviceStravaSegmentsSettings var1) {
      if (this.stravaSegmentsSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.stravaSegmentsSettings_ = var1;
         this.onChanged();
      } else {
         this.stravaSegmentsSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 32768;
      return this;
   }

   public final UserDeviceSettings$PbUserDeviceSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserDeviceSettings$Builder)super.setUnknownFields(var1);
   }
}
