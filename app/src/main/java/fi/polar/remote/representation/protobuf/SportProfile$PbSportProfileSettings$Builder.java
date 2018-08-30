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
import com.google.protobuf.Internal.ListAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class SportProfile$PbSportProfileSettings$Builder extends Builder implements SportProfile$PbSportProfileSettingsOrBuilder {
   private int bitField0_;
   private boolean hrZoneLockAvailable_;
   private int oBSOLETEAltitudeSetting_;
   private SingleFieldBuilderV3 oBSOLETEAutolapSettingsBuilder_;
   private Types$PbAutoLapSettings oBSOLETEAutolapSettings_;
   private int oBSOLETEGpsSetting_;
   private int oBSOLETEHeartRateView_;
   private int powerView_;
   private boolean powerZoneLockAvailable_;
   private List remoteButtonActions_;
   private boolean sensorBroadcastingHr_;
   private int speedView_;
   private boolean speedZoneLockAvailable_;
   private int strideSpeedSource_;
   private int swimmingUnits_;
   private SingleFieldBuilderV3 trainingReminderBuilder_;
   private SportProfile$PbTrainingReminder trainingReminder_;
   private boolean voiceGuidance_;
   private SingleFieldBuilderV3 volumeBuilder_;
   private Types$PbVolume volume_;
   private SingleFieldBuilderV3 zoneLimitsBuilder_;
   private Structures$PbZones zoneLimits_;
   private int zoneOptimizerSetting_;

   private SportProfile$PbSportProfileSettings$Builder() {
      this.volume_ = null;
      this.speedView_ = 1;
      this.zoneOptimizerSetting_ = 1;
      this.oBSOLETEHeartRateView_ = 1;
      this.zoneLimits_ = null;
      this.trainingReminder_ = null;
      this.oBSOLETEGpsSetting_ = 0;
      this.oBSOLETEAutolapSettings_ = null;
      this.oBSOLETEAltitudeSetting_ = 0;
      this.powerView_ = 1;
      this.strideSpeedSource_ = 1;
      this.remoteButtonActions_ = Collections.emptyList();
      this.swimmingUnits_ = 0;
      this.maybeForceBuilderInitialization();
   }

   private SportProfile$PbSportProfileSettings$Builder(BuilderParent var1) {
      super(var1);
      this.volume_ = null;
      this.speedView_ = 1;
      this.zoneOptimizerSetting_ = 1;
      this.oBSOLETEHeartRateView_ = 1;
      this.zoneLimits_ = null;
      this.trainingReminder_ = null;
      this.oBSOLETEGpsSetting_ = 0;
      this.oBSOLETEAutolapSettings_ = null;
      this.oBSOLETEAltitudeSetting_ = 0;
      this.powerView_ = 1;
      this.strideSpeedSource_ = 1;
      this.remoteButtonActions_ = Collections.emptyList();
      this.swimmingUnits_ = 0;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   SportProfile$PbSportProfileSettings$Builder(BuilderParent var1, SportProfile$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   SportProfile$PbSportProfileSettings$Builder(SportProfile$1 var1) {
      this();
   }

   private void ensureRemoteButtonActionsIsMutable() {
      if ((this.bitField0_ & 8192) != 8192) {
         this.remoteButtonActions_ = new ArrayList(this.remoteButtonActions_);
         this.bitField0_ |= 8192;
      }

   }

   public static final Descriptor getDescriptor() {
      return SportProfile.c();
   }

   private SingleFieldBuilderV3 getOBSOLETEAutolapSettingsFieldBuilder() {
      if (this.oBSOLETEAutolapSettingsBuilder_ == null) {
         this.oBSOLETEAutolapSettingsBuilder_ = new SingleFieldBuilderV3(this.getOBSOLETEAutolapSettings(), this.getParentForChildren(), this.isClean());
         this.oBSOLETEAutolapSettings_ = null;
      }

      return this.oBSOLETEAutolapSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getTrainingReminderFieldBuilder() {
      if (this.trainingReminderBuilder_ == null) {
         this.trainingReminderBuilder_ = new SingleFieldBuilderV3(this.getTrainingReminder(), this.getParentForChildren(), this.isClean());
         this.trainingReminder_ = null;
      }

      return this.trainingReminderBuilder_;
   }

   private SingleFieldBuilderV3 getVolumeFieldBuilder() {
      if (this.volumeBuilder_ == null) {
         this.volumeBuilder_ = new SingleFieldBuilderV3(this.getVolume(), this.getParentForChildren(), this.isClean());
         this.volume_ = null;
      }

      return this.volumeBuilder_;
   }

   private SingleFieldBuilderV3 getZoneLimitsFieldBuilder() {
      if (this.zoneLimitsBuilder_ == null) {
         this.zoneLimitsBuilder_ = new SingleFieldBuilderV3(this.getZoneLimits(), this.getParentForChildren(), this.isClean());
         this.zoneLimits_ = null;
      }

      return this.zoneLimitsBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (SportProfile$PbSportProfileSettings.b()) {
         this.getVolumeFieldBuilder();
         this.getZoneLimitsFieldBuilder();
         this.getTrainingReminderFieldBuilder();
         this.getOBSOLETEAutolapSettingsFieldBuilder();
      }

   }

   public SportProfile$PbSportProfileSettings$Builder addAllRemoteButtonActions(Iterable var1) {
      this.ensureRemoteButtonActionsIsMutable();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         SportProfile$PbSportProfileSettings$PbRemoteButtonAction var2 = (SportProfile$PbSportProfileSettings$PbRemoteButtonAction)var3.next();
         this.remoteButtonActions_.add(var2.getNumber());
      }

      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder addRemoteButtonActions(SportProfile$PbSportProfileSettings$PbRemoteButtonAction var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.ensureRemoteButtonActionsIsMutable();
         this.remoteButtonActions_.add(var1.getNumber());
         this.onChanged();
         return this;
      }
   }

   public SportProfile$PbSportProfileSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (SportProfile$PbSportProfileSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public SportProfile$PbSportProfileSettings build() {
      SportProfile$PbSportProfileSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public SportProfile$PbSportProfileSettings buildPartial() {
      SportProfile$PbSportProfileSettings var1 = new SportProfile$PbSportProfileSettings(this, (SportProfile$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.volumeBuilder_ == null) {
         SportProfile$PbSportProfileSettings.a(var1, this.volume_);
      } else {
         SportProfile$PbSportProfileSettings.a(var1, (Types$PbVolume)this.volumeBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      SportProfile$PbSportProfileSettings.a(var1, this.speedView_);
      int var6 = var4;
      if ((var2 & 4) == 4) {
         var6 = var4 | 4;
      }

      SportProfile$PbSportProfileSettings.b(var1, this.zoneOptimizerSetting_);
      int var5 = var6;
      if ((var2 & 8) == 8) {
         var5 = var6 | 8;
      }

      SportProfile$PbSportProfileSettings.c(var1, this.oBSOLETEHeartRateView_);
      var4 = var5;
      if ((var2 & 16) == 16) {
         var4 = var5 | 16;
      }

      SportProfile$PbSportProfileSettings.a(var1, this.sensorBroadcastingHr_);
      var6 = var4;
      if ((var2 & 32) == 32) {
         var6 = var4 | 32;
      }

      if (this.zoneLimitsBuilder_ == null) {
         SportProfile$PbSportProfileSettings.a(var1, this.zoneLimits_);
      } else {
         SportProfile$PbSportProfileSettings.a(var1, (Structures$PbZones)this.zoneLimitsBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 64) == 64) {
         var4 = var6 | 64;
      }

      if (this.trainingReminderBuilder_ == null) {
         SportProfile$PbSportProfileSettings.a(var1, this.trainingReminder_);
      } else {
         SportProfile$PbSportProfileSettings.a(var1, (SportProfile$PbTrainingReminder)this.trainingReminderBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 128) == 128) {
         var6 = var4 | 128;
      }

      SportProfile$PbSportProfileSettings.b(var1, this.voiceGuidance_);
      var4 = var6;
      if ((var2 & 256) == 256) {
         var4 = var6 | 256;
      }

      SportProfile$PbSportProfileSettings.d(var1, this.oBSOLETEGpsSetting_);
      var6 = var4;
      if ((var2 & 512) == 512) {
         var6 = var4 | 512;
      }

      if (this.oBSOLETEAutolapSettingsBuilder_ == null) {
         SportProfile$PbSportProfileSettings.a(var1, this.oBSOLETEAutolapSettings_);
      } else {
         SportProfile$PbSportProfileSettings.a(var1, (Types$PbAutoLapSettings)this.oBSOLETEAutolapSettingsBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 1024) == 1024) {
         var4 = var6 | 1024;
      }

      SportProfile$PbSportProfileSettings.e(var1, this.oBSOLETEAltitudeSetting_);
      var6 = var4;
      if ((var2 & 2048) == 2048) {
         var6 = var4 | 2048;
      }

      SportProfile$PbSportProfileSettings.f(var1, this.powerView_);
      var4 = var6;
      if ((var2 & 4096) == 4096) {
         var4 = var6 | 4096;
      }

      SportProfile$PbSportProfileSettings.g(var1, this.strideSpeedSource_);
      if ((this.bitField0_ & 8192) == 8192) {
         this.remoteButtonActions_ = Collections.unmodifiableList(this.remoteButtonActions_);
         this.bitField0_ &= -8193;
      }

      SportProfile$PbSportProfileSettings.a(var1, this.remoteButtonActions_);
      var6 = var4;
      if ((var2 & 16384) == 16384) {
         var6 = var4 | 8192;
      }

      SportProfile$PbSportProfileSettings.c(var1, this.hrZoneLockAvailable_);
      var4 = var6;
      if ((var2 & '耀') == 32768) {
         var4 = var6 | 16384;
      }

      SportProfile$PbSportProfileSettings.d(var1, this.speedZoneLockAvailable_);
      var6 = var4;
      if ((var2 & 65536) == 65536) {
         var6 = var4 | '耀';
      }

      SportProfile$PbSportProfileSettings.e(var1, this.powerZoneLockAvailable_);
      var4 = var6;
      if ((var2 & 131072) == 131072) {
         var4 = var6 | 65536;
      }

      SportProfile$PbSportProfileSettings.h(var1, this.swimmingUnits_);
      SportProfile$PbSportProfileSettings.i(var1, var4);
      this.onBuilt();
      return var1;
   }

   public SportProfile$PbSportProfileSettings$Builder clear() {
      super.clear();
      if (this.volumeBuilder_ == null) {
         this.volume_ = null;
      } else {
         this.volumeBuilder_.clear();
      }

      this.bitField0_ &= -2;
      this.speedView_ = 1;
      this.bitField0_ &= -3;
      this.zoneOptimizerSetting_ = 1;
      this.bitField0_ &= -5;
      this.oBSOLETEHeartRateView_ = 1;
      this.bitField0_ &= -9;
      this.sensorBroadcastingHr_ = false;
      this.bitField0_ &= -17;
      if (this.zoneLimitsBuilder_ == null) {
         this.zoneLimits_ = null;
      } else {
         this.zoneLimitsBuilder_.clear();
      }

      this.bitField0_ &= -33;
      if (this.trainingReminderBuilder_ == null) {
         this.trainingReminder_ = null;
      } else {
         this.trainingReminderBuilder_.clear();
      }

      this.bitField0_ &= -65;
      this.voiceGuidance_ = false;
      this.bitField0_ &= -129;
      this.oBSOLETEGpsSetting_ = 0;
      this.bitField0_ &= -257;
      if (this.oBSOLETEAutolapSettingsBuilder_ == null) {
         this.oBSOLETEAutolapSettings_ = null;
      } else {
         this.oBSOLETEAutolapSettingsBuilder_.clear();
      }

      this.bitField0_ &= -513;
      this.oBSOLETEAltitudeSetting_ = 0;
      this.bitField0_ &= -1025;
      this.powerView_ = 1;
      this.bitField0_ &= -2049;
      this.strideSpeedSource_ = 1;
      this.bitField0_ &= -4097;
      this.remoteButtonActions_ = Collections.emptyList();
      this.bitField0_ &= -8193;
      this.hrZoneLockAvailable_ = false;
      this.bitField0_ &= -16385;
      this.speedZoneLockAvailable_ = false;
      this.bitField0_ &= -32769;
      this.powerZoneLockAvailable_ = false;
      this.bitField0_ &= -65537;
      this.swimmingUnits_ = 0;
      this.bitField0_ &= -131073;
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder clearField(FieldDescriptor var1) {
      return (SportProfile$PbSportProfileSettings$Builder)super.clearField(var1);
   }

   public SportProfile$PbSportProfileSettings$Builder clearHrZoneLockAvailable() {
      this.bitField0_ &= -16385;
      this.hrZoneLockAvailable_ = false;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder clearOBSOLETEAltitudeSetting() {
      this.bitField0_ &= -1025;
      this.oBSOLETEAltitudeSetting_ = 0;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder clearOBSOLETEAutolapSettings() {
      if (this.oBSOLETEAutolapSettingsBuilder_ == null) {
         this.oBSOLETEAutolapSettings_ = null;
         this.onChanged();
      } else {
         this.oBSOLETEAutolapSettingsBuilder_.clear();
      }

      this.bitField0_ &= -513;
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder clearOBSOLETEGpsSetting() {
      this.bitField0_ &= -257;
      this.oBSOLETEGpsSetting_ = 0;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder clearOBSOLETEHeartRateView() {
      this.bitField0_ &= -9;
      this.oBSOLETEHeartRateView_ = 1;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder clearOneof(OneofDescriptor var1) {
      return (SportProfile$PbSportProfileSettings$Builder)super.clearOneof(var1);
   }

   public SportProfile$PbSportProfileSettings$Builder clearPowerView() {
      this.bitField0_ &= -2049;
      this.powerView_ = 1;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder clearPowerZoneLockAvailable() {
      this.bitField0_ &= -65537;
      this.powerZoneLockAvailable_ = false;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder clearRemoteButtonActions() {
      this.remoteButtonActions_ = Collections.emptyList();
      this.bitField0_ &= -8193;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder clearSensorBroadcastingHr() {
      this.bitField0_ &= -17;
      this.sensorBroadcastingHr_ = false;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder clearSpeedView() {
      this.bitField0_ &= -3;
      this.speedView_ = 1;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder clearSpeedZoneLockAvailable() {
      this.bitField0_ &= -32769;
      this.speedZoneLockAvailable_ = false;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder clearStrideSpeedSource() {
      this.bitField0_ &= -4097;
      this.strideSpeedSource_ = 1;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder clearSwimmingUnits() {
      this.bitField0_ &= -131073;
      this.swimmingUnits_ = 0;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder clearTrainingReminder() {
      if (this.trainingReminderBuilder_ == null) {
         this.trainingReminder_ = null;
         this.onChanged();
      } else {
         this.trainingReminderBuilder_.clear();
      }

      this.bitField0_ &= -65;
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder clearVoiceGuidance() {
      this.bitField0_ &= -129;
      this.voiceGuidance_ = false;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder clearVolume() {
      if (this.volumeBuilder_ == null) {
         this.volume_ = null;
         this.onChanged();
      } else {
         this.volumeBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder clearZoneLimits() {
      if (this.zoneLimitsBuilder_ == null) {
         this.zoneLimits_ = null;
         this.onChanged();
      } else {
         this.zoneLimitsBuilder_.clear();
      }

      this.bitField0_ &= -33;
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder clearZoneOptimizerSetting() {
      this.bitField0_ &= -5;
      this.zoneOptimizerSetting_ = 1;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder clone() {
      return (SportProfile$PbSportProfileSettings$Builder)super.clone();
   }

   public SportProfile$PbSportProfileSettings getDefaultInstanceForType() {
      return SportProfile$PbSportProfileSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return SportProfile.c();
   }

   public boolean getHrZoneLockAvailable() {
      return this.hrZoneLockAvailable_;
   }

   public Types$PbAltitudeSetting getOBSOLETEAltitudeSetting() {
      Types$PbAltitudeSetting var1 = Types$PbAltitudeSetting.valueOf(this.oBSOLETEAltitudeSetting_);
      Types$PbAltitudeSetting var2 = var1;
      if (var1 == null) {
         var2 = Types$PbAltitudeSetting.ALTITUDE_OFF;
      }

      return var2;
   }

   public Types$PbAutoLapSettings getOBSOLETEAutolapSettings() {
      Types$PbAutoLapSettings var1;
      if (this.oBSOLETEAutolapSettingsBuilder_ == null) {
         if (this.oBSOLETEAutolapSettings_ == null) {
            var1 = Types$PbAutoLapSettings.getDefaultInstance();
         } else {
            var1 = this.oBSOLETEAutolapSettings_;
         }
      } else {
         var1 = (Types$PbAutoLapSettings)this.oBSOLETEAutolapSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbAutoLapSettings$Builder getOBSOLETEAutolapSettingsBuilder() {
      this.bitField0_ |= 512;
      this.onChanged();
      return (Types$PbAutoLapSettings$Builder)this.getOBSOLETEAutolapSettingsFieldBuilder().getBuilder();
   }

   public Types$PbAutoLapSettingsOrBuilder getOBSOLETEAutolapSettingsOrBuilder() {
      Object var1;
      if (this.oBSOLETEAutolapSettingsBuilder_ != null) {
         var1 = (Types$PbAutoLapSettingsOrBuilder)this.oBSOLETEAutolapSettingsBuilder_.getMessageOrBuilder();
      } else if (this.oBSOLETEAutolapSettings_ == null) {
         var1 = Types$PbAutoLapSettings.getDefaultInstance();
      } else {
         var1 = this.oBSOLETEAutolapSettings_;
      }

      return (Types$PbAutoLapSettingsOrBuilder)var1;
   }

   public Types$PbGPSSetting getOBSOLETEGpsSetting() {
      Types$PbGPSSetting var1 = Types$PbGPSSetting.valueOf(this.oBSOLETEGpsSetting_);
      Types$PbGPSSetting var2 = var1;
      if (var1 == null) {
         var2 = Types$PbGPSSetting.GPS_OFF;
      }

      return var2;
   }

   public Types$PbHeartRateView getOBSOLETEHeartRateView() {
      Types$PbHeartRateView var1 = Types$PbHeartRateView.valueOf(this.oBSOLETEHeartRateView_);
      Types$PbHeartRateView var2 = var1;
      if (var1 == null) {
         var2 = Types$PbHeartRateView.HEART_RATE_VIEW_BPM;
      }

      return var2;
   }

   public SportProfile$PbSportProfileSettings$PbPowerView getPowerView() {
      SportProfile$PbSportProfileSettings$PbPowerView var1 = SportProfile$PbSportProfileSettings$PbPowerView.valueOf(this.powerView_);
      SportProfile$PbSportProfileSettings$PbPowerView var2 = var1;
      if (var1 == null) {
         var2 = SportProfile$PbSportProfileSettings$PbPowerView.POWER_VIEW_WATT;
      }

      return var2;
   }

   public boolean getPowerZoneLockAvailable() {
      return this.powerZoneLockAvailable_;
   }

   public SportProfile$PbSportProfileSettings$PbRemoteButtonAction getRemoteButtonActions(int var1) {
      return (SportProfile$PbSportProfileSettings$PbRemoteButtonAction)SportProfile$PbSportProfileSettings.c().convert(this.remoteButtonActions_.get(var1));
   }

   public int getRemoteButtonActionsCount() {
      return this.remoteButtonActions_.size();
   }

   public List getRemoteButtonActionsList() {
      return new ListAdapter(this.remoteButtonActions_, SportProfile$PbSportProfileSettings.c());
   }

   public boolean getSensorBroadcastingHr() {
      return this.sensorBroadcastingHr_;
   }

   public SportProfile$PbSportProfileSettings$PbSpeedView getSpeedView() {
      SportProfile$PbSportProfileSettings$PbSpeedView var1 = SportProfile$PbSportProfileSettings$PbSpeedView.valueOf(this.speedView_);
      SportProfile$PbSportProfileSettings$PbSpeedView var2 = var1;
      if (var1 == null) {
         var2 = SportProfile$PbSportProfileSettings$PbSpeedView.SPEED_VIEW_PACE;
      }

      return var2;
   }

   public boolean getSpeedZoneLockAvailable() {
      return this.speedZoneLockAvailable_;
   }

   public SportProfile$PbSportProfileSettings$PbStrideSpeedSource getStrideSpeedSource() {
      SportProfile$PbSportProfileSettings$PbStrideSpeedSource var1 = SportProfile$PbSportProfileSettings$PbStrideSpeedSource.valueOf(this.strideSpeedSource_);
      SportProfile$PbSportProfileSettings$PbStrideSpeedSource var2 = var1;
      if (var1 == null) {
         var2 = SportProfile$PbSportProfileSettings$PbStrideSpeedSource.STRIDE_SPEED_SOURCE_STRIDE;
      }

      return var2;
   }

   public SportProfile$PbSportProfileSettings$PbSwimmingUnits getSwimmingUnits() {
      SportProfile$PbSportProfileSettings$PbSwimmingUnits var1 = SportProfile$PbSportProfileSettings$PbSwimmingUnits.valueOf(this.swimmingUnits_);
      SportProfile$PbSportProfileSettings$PbSwimmingUnits var2 = var1;
      if (var1 == null) {
         var2 = SportProfile$PbSportProfileSettings$PbSwimmingUnits.SWIMMING_METERS;
      }

      return var2;
   }

   public SportProfile$PbTrainingReminder getTrainingReminder() {
      SportProfile$PbTrainingReminder var1;
      if (this.trainingReminderBuilder_ == null) {
         if (this.trainingReminder_ == null) {
            var1 = SportProfile$PbTrainingReminder.getDefaultInstance();
         } else {
            var1 = this.trainingReminder_;
         }
      } else {
         var1 = (SportProfile$PbTrainingReminder)this.trainingReminderBuilder_.getMessage();
      }

      return var1;
   }

   public SportProfile$PbTrainingReminder$Builder getTrainingReminderBuilder() {
      this.bitField0_ |= 64;
      this.onChanged();
      return (SportProfile$PbTrainingReminder$Builder)this.getTrainingReminderFieldBuilder().getBuilder();
   }

   public SportProfile$PbTrainingReminderOrBuilder getTrainingReminderOrBuilder() {
      Object var1;
      if (this.trainingReminderBuilder_ != null) {
         var1 = (SportProfile$PbTrainingReminderOrBuilder)this.trainingReminderBuilder_.getMessageOrBuilder();
      } else if (this.trainingReminder_ == null) {
         var1 = SportProfile$PbTrainingReminder.getDefaultInstance();
      } else {
         var1 = this.trainingReminder_;
      }

      return (SportProfile$PbTrainingReminderOrBuilder)var1;
   }

   public boolean getVoiceGuidance() {
      return this.voiceGuidance_;
   }

   public Types$PbVolume getVolume() {
      Types$PbVolume var1;
      if (this.volumeBuilder_ == null) {
         if (this.volume_ == null) {
            var1 = Types$PbVolume.getDefaultInstance();
         } else {
            var1 = this.volume_;
         }
      } else {
         var1 = (Types$PbVolume)this.volumeBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbVolume$Builder getVolumeBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Types$PbVolume$Builder)this.getVolumeFieldBuilder().getBuilder();
   }

   public Types$PbVolumeOrBuilder getVolumeOrBuilder() {
      Object var1;
      if (this.volumeBuilder_ != null) {
         var1 = (Types$PbVolumeOrBuilder)this.volumeBuilder_.getMessageOrBuilder();
      } else if (this.volume_ == null) {
         var1 = Types$PbVolume.getDefaultInstance();
      } else {
         var1 = this.volume_;
      }

      return (Types$PbVolumeOrBuilder)var1;
   }

   public Structures$PbZones getZoneLimits() {
      Structures$PbZones var1;
      if (this.zoneLimitsBuilder_ == null) {
         if (this.zoneLimits_ == null) {
            var1 = Structures$PbZones.getDefaultInstance();
         } else {
            var1 = this.zoneLimits_;
         }
      } else {
         var1 = (Structures$PbZones)this.zoneLimitsBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbZones$Builder getZoneLimitsBuilder() {
      this.bitField0_ |= 32;
      this.onChanged();
      return (Structures$PbZones$Builder)this.getZoneLimitsFieldBuilder().getBuilder();
   }

   public Structures$PbZonesOrBuilder getZoneLimitsOrBuilder() {
      Object var1;
      if (this.zoneLimitsBuilder_ != null) {
         var1 = (Structures$PbZonesOrBuilder)this.zoneLimitsBuilder_.getMessageOrBuilder();
      } else if (this.zoneLimits_ == null) {
         var1 = Structures$PbZones.getDefaultInstance();
      } else {
         var1 = this.zoneLimits_;
      }

      return (Structures$PbZonesOrBuilder)var1;
   }

   public SportProfile$PbSportProfileSettings$PbZoneOptimizerSetting getZoneOptimizerSetting() {
      SportProfile$PbSportProfileSettings$PbZoneOptimizerSetting var1 = SportProfile$PbSportProfileSettings$PbZoneOptimizerSetting.valueOf(this.zoneOptimizerSetting_);
      SportProfile$PbSportProfileSettings$PbZoneOptimizerSetting var2 = var1;
      if (var1 == null) {
         var2 = SportProfile$PbSportProfileSettings$PbZoneOptimizerSetting.ZONEOPTIMIZER_OFF;
      }

      return var2;
   }

   public boolean hasHrZoneLockAvailable() {
      boolean var1;
      if ((this.bitField0_ & 16384) == 16384) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasOBSOLETEAltitudeSetting() {
      boolean var1;
      if ((this.bitField0_ & 1024) == 1024) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasOBSOLETEAutolapSettings() {
      boolean var1;
      if ((this.bitField0_ & 512) == 512) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasOBSOLETEGpsSetting() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasOBSOLETEHeartRateView() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPowerView() {
      boolean var1;
      if ((this.bitField0_ & 2048) == 2048) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPowerZoneLockAvailable() {
      boolean var1;
      if ((this.bitField0_ & 65536) == 65536) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSensorBroadcastingHr() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSpeedView() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSpeedZoneLockAvailable() {
      boolean var1;
      if ((this.bitField0_ & '耀') == 32768) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStrideSpeedSource() {
      boolean var1;
      if ((this.bitField0_ & 4096) == 4096) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSwimmingUnits() {
      boolean var1;
      if ((this.bitField0_ & 131072) == 131072) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTrainingReminder() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasVoiceGuidance() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasVolume() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasZoneLimits() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasZoneOptimizerSetting() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportProfile.d().ensureFieldAccessorsInitialized(SportProfile$PbSportProfileSettings.class, SportProfile$PbSportProfileSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (this.hasVolume() && !this.getVolume().isInitialized()) {
         var2 = var1;
      } else {
         if (this.hasZoneLimits()) {
            var2 = var1;
            if (!this.getZoneLimits().isInitialized()) {
               return var2;
            }
         }

         if (this.hasTrainingReminder()) {
            var2 = var1;
            if (!this.getTrainingReminder().isInitialized()) {
               return var2;
            }
         }

         if (this.hasOBSOLETEAutolapSettings()) {
            var2 = var1;
            if (!this.getOBSOLETEAutolapSettings().isInitialized()) {
               return var2;
            }
         }

         var2 = true;
      }

      return var2;
   }

   public SportProfile$PbSportProfileSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      SportProfile$PbSportProfileSettings var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (SportProfile$PbSportProfileSettings)SportProfile$PbSportProfileSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (SportProfile$PbSportProfileSettings)var10.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var13.unwrapIOException();
         } finally {
            if (var12 != null) {
               this.mergeFrom(var12);
            }

            throw var13;
         }
      }

      if (var12 != null) {
         this.mergeFrom(var12);
      }

      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder mergeFrom(Message var1) {
      SportProfile$PbSportProfileSettings$Builder var2;
      if (var1 instanceof SportProfile$PbSportProfileSettings) {
         var2 = this.mergeFrom((SportProfile$PbSportProfileSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public SportProfile$PbSportProfileSettings$Builder mergeFrom(SportProfile$PbSportProfileSettings var1) {
      if (var1 != SportProfile$PbSportProfileSettings.getDefaultInstance()) {
         if (var1.hasVolume()) {
            this.mergeVolume(var1.getVolume());
         }

         if (var1.hasSpeedView()) {
            this.setSpeedView(var1.getSpeedView());
         }

         if (var1.hasZoneOptimizerSetting()) {
            this.setZoneOptimizerSetting(var1.getZoneOptimizerSetting());
         }

         if (var1.hasOBSOLETEHeartRateView()) {
            this.setOBSOLETEHeartRateView(var1.getOBSOLETEHeartRateView());
         }

         if (var1.hasSensorBroadcastingHr()) {
            this.setSensorBroadcastingHr(var1.getSensorBroadcastingHr());
         }

         if (var1.hasZoneLimits()) {
            this.mergeZoneLimits(var1.getZoneLimits());
         }

         if (var1.hasTrainingReminder()) {
            this.mergeTrainingReminder(var1.getTrainingReminder());
         }

         if (var1.hasVoiceGuidance()) {
            this.setVoiceGuidance(var1.getVoiceGuidance());
         }

         if (var1.hasOBSOLETEGpsSetting()) {
            this.setOBSOLETEGpsSetting(var1.getOBSOLETEGpsSetting());
         }

         if (var1.hasOBSOLETEAutolapSettings()) {
            this.mergeOBSOLETEAutolapSettings(var1.getOBSOLETEAutolapSettings());
         }

         if (var1.hasOBSOLETEAltitudeSetting()) {
            this.setOBSOLETEAltitudeSetting(var1.getOBSOLETEAltitudeSetting());
         }

         if (var1.hasPowerView()) {
            this.setPowerView(var1.getPowerView());
         }

         if (var1.hasStrideSpeedSource()) {
            this.setStrideSpeedSource(var1.getStrideSpeedSource());
         }

         if (!SportProfile$PbSportProfileSettings.a(var1).isEmpty()) {
            if (this.remoteButtonActions_.isEmpty()) {
               this.remoteButtonActions_ = SportProfile$PbSportProfileSettings.a(var1);
               this.bitField0_ &= -8193;
            } else {
               this.ensureRemoteButtonActionsIsMutable();
               this.remoteButtonActions_.addAll(SportProfile$PbSportProfileSettings.a(var1));
            }

            this.onChanged();
         }

         if (var1.hasHrZoneLockAvailable()) {
            this.setHrZoneLockAvailable(var1.getHrZoneLockAvailable());
         }

         if (var1.hasSpeedZoneLockAvailable()) {
            this.setSpeedZoneLockAvailable(var1.getSpeedZoneLockAvailable());
         }

         if (var1.hasPowerZoneLockAvailable()) {
            this.setPowerZoneLockAvailable(var1.getPowerZoneLockAvailable());
         }

         if (var1.hasSwimmingUnits()) {
            this.setSwimmingUnits(var1.getSwimmingUnits());
         }

         this.mergeUnknownFields(SportProfile$PbSportProfileSettings.b(var1));
         this.onChanged();
      }

      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder mergeOBSOLETEAutolapSettings(Types$PbAutoLapSettings var1) {
      if (this.oBSOLETEAutolapSettingsBuilder_ == null) {
         if ((this.bitField0_ & 512) == 512 && this.oBSOLETEAutolapSettings_ != null && this.oBSOLETEAutolapSettings_ != Types$PbAutoLapSettings.getDefaultInstance()) {
            this.oBSOLETEAutolapSettings_ = Types$PbAutoLapSettings.newBuilder(this.oBSOLETEAutolapSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.oBSOLETEAutolapSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.oBSOLETEAutolapSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 512;
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder mergeTrainingReminder(SportProfile$PbTrainingReminder var1) {
      if (this.trainingReminderBuilder_ == null) {
         if ((this.bitField0_ & 64) == 64 && this.trainingReminder_ != null && this.trainingReminder_ != SportProfile$PbTrainingReminder.getDefaultInstance()) {
            this.trainingReminder_ = SportProfile$PbTrainingReminder.newBuilder(this.trainingReminder_).mergeFrom(var1).buildPartial();
         } else {
            this.trainingReminder_ = var1;
         }

         this.onChanged();
      } else {
         this.trainingReminderBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public final SportProfile$PbSportProfileSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (SportProfile$PbSportProfileSettings$Builder)super.mergeUnknownFields(var1);
   }

   public SportProfile$PbSportProfileSettings$Builder mergeVolume(Types$PbVolume var1) {
      if (this.volumeBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.volume_ != null && this.volume_ != Types$PbVolume.getDefaultInstance()) {
            this.volume_ = Types$PbVolume.newBuilder(this.volume_).mergeFrom(var1).buildPartial();
         } else {
            this.volume_ = var1;
         }

         this.onChanged();
      } else {
         this.volumeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder mergeZoneLimits(Structures$PbZones var1) {
      if (this.zoneLimitsBuilder_ == null) {
         if ((this.bitField0_ & 32) == 32 && this.zoneLimits_ != null && this.zoneLimits_ != Structures$PbZones.getDefaultInstance()) {
            this.zoneLimits_ = Structures$PbZones.newBuilder(this.zoneLimits_).mergeFrom(var1).buildPartial();
         } else {
            this.zoneLimits_ = var1;
         }

         this.onChanged();
      } else {
         this.zoneLimitsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (SportProfile$PbSportProfileSettings$Builder)super.setField(var1, var2);
   }

   public SportProfile$PbSportProfileSettings$Builder setHrZoneLockAvailable(boolean var1) {
      this.bitField0_ |= 16384;
      this.hrZoneLockAvailable_ = var1;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder setOBSOLETEAltitudeSetting(Types$PbAltitudeSetting var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1024;
         this.oBSOLETEAltitudeSetting_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportProfile$PbSportProfileSettings$Builder setOBSOLETEAutolapSettings(Types$PbAutoLapSettings$Builder var1) {
      if (this.oBSOLETEAutolapSettingsBuilder_ == null) {
         this.oBSOLETEAutolapSettings_ = var1.build();
         this.onChanged();
      } else {
         this.oBSOLETEAutolapSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 512;
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder setOBSOLETEAutolapSettings(Types$PbAutoLapSettings var1) {
      if (this.oBSOLETEAutolapSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.oBSOLETEAutolapSettings_ = var1;
         this.onChanged();
      } else {
         this.oBSOLETEAutolapSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 512;
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder setOBSOLETEGpsSetting(Types$PbGPSSetting var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 256;
         this.oBSOLETEGpsSetting_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportProfile$PbSportProfileSettings$Builder setOBSOLETEHeartRateView(Types$PbHeartRateView var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 8;
         this.oBSOLETEHeartRateView_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportProfile$PbSportProfileSettings$Builder setPowerView(SportProfile$PbSportProfileSettings$PbPowerView var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2048;
         this.powerView_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportProfile$PbSportProfileSettings$Builder setPowerZoneLockAvailable(boolean var1) {
      this.bitField0_ |= 65536;
      this.powerZoneLockAvailable_ = var1;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder setRemoteButtonActions(int var1, SportProfile$PbSportProfileSettings$PbRemoteButtonAction var2) {
      if (var2 == null) {
         throw new NullPointerException();
      } else {
         this.ensureRemoteButtonActionsIsMutable();
         this.remoteButtonActions_.set(var1, var2.getNumber());
         this.onChanged();
         return this;
      }
   }

   public SportProfile$PbSportProfileSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (SportProfile$PbSportProfileSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public SportProfile$PbSportProfileSettings$Builder setSensorBroadcastingHr(boolean var1) {
      this.bitField0_ |= 16;
      this.sensorBroadcastingHr_ = var1;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder setSpeedView(SportProfile$PbSportProfileSettings$PbSpeedView var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.speedView_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportProfile$PbSportProfileSettings$Builder setSpeedZoneLockAvailable(boolean var1) {
      this.bitField0_ |= 32768;
      this.speedZoneLockAvailable_ = var1;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder setStrideSpeedSource(SportProfile$PbSportProfileSettings$PbStrideSpeedSource var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 4096;
         this.strideSpeedSource_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportProfile$PbSportProfileSettings$Builder setSwimmingUnits(SportProfile$PbSportProfileSettings$PbSwimmingUnits var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 131072;
         this.swimmingUnits_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportProfile$PbSportProfileSettings$Builder setTrainingReminder(SportProfile$PbTrainingReminder$Builder var1) {
      if (this.trainingReminderBuilder_ == null) {
         this.trainingReminder_ = var1.build();
         this.onChanged();
      } else {
         this.trainingReminderBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 64;
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder setTrainingReminder(SportProfile$PbTrainingReminder var1) {
      if (this.trainingReminderBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.trainingReminder_ = var1;
         this.onChanged();
      } else {
         this.trainingReminderBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public final SportProfile$PbSportProfileSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (SportProfile$PbSportProfileSettings$Builder)super.setUnknownFields(var1);
   }

   public SportProfile$PbSportProfileSettings$Builder setVoiceGuidance(boolean var1) {
      this.bitField0_ |= 128;
      this.voiceGuidance_ = var1;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder setVolume(Types$PbVolume$Builder var1) {
      if (this.volumeBuilder_ == null) {
         this.volume_ = var1.build();
         this.onChanged();
      } else {
         this.volumeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder setVolume(Types$PbVolume var1) {
      if (this.volumeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.volume_ = var1;
         this.onChanged();
      } else {
         this.volumeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder setZoneLimits(Structures$PbZones$Builder var1) {
      if (this.zoneLimitsBuilder_ == null) {
         this.zoneLimits_ = var1.build();
         this.onChanged();
      } else {
         this.zoneLimitsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 32;
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder setZoneLimits(Structures$PbZones var1) {
      if (this.zoneLimitsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.zoneLimits_ = var1;
         this.onChanged();
      } else {
         this.zoneLimitsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public SportProfile$PbSportProfileSettings$Builder setZoneOptimizerSetting(SportProfile$PbSportProfileSettings$PbZoneOptimizerSetting var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 4;
         this.zoneOptimizerSetting_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }
}
