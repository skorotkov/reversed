package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import com.google.protobuf.Internal.ListAdapter;
import com.google.protobuf.Internal.ListAdapter.Converter;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class SportProfile$PbSportProfileSettings extends GeneratedMessageV3 implements SportProfile$PbSportProfileSettingsOrBuilder {
   private static final SportProfile$PbSportProfileSettings DEFAULT_INSTANCE = new SportProfile$PbSportProfileSettings();
   public static final int HR_ZONE_LOCK_AVAILABLE_FIELD_NUMBER = 15;
   public static final int OBSOLETE_ALTITUDE_SETTING_FIELD_NUMBER = 11;
   public static final int OBSOLETE_AUTOLAP_SETTINGS_FIELD_NUMBER = 10;
   public static final int OBSOLETE_GPS_SETTING_FIELD_NUMBER = 9;
   public static final int OBSOLETE_HEART_RATE_VIEW_FIELD_NUMBER = 4;
   @Deprecated
   public static final Parser PARSER = new SportProfile$PbSportProfileSettings$2();
   public static final int POWER_VIEW_FIELD_NUMBER = 12;
   public static final int POWER_ZONE_LOCK_AVAILABLE_FIELD_NUMBER = 17;
   public static final int REMOTE_BUTTON_ACTIONS_FIELD_NUMBER = 14;
   public static final int SENSOR_BROADCASTING_HR_FIELD_NUMBER = 5;
   public static final int SPEED_VIEW_FIELD_NUMBER = 2;
   public static final int SPEED_ZONE_LOCK_AVAILABLE_FIELD_NUMBER = 16;
   public static final int STRIDE_SPEED_SOURCE_FIELD_NUMBER = 13;
   public static final int SWIMMING_UNITS_FIELD_NUMBER = 18;
   public static final int TRAINING_REMINDER_FIELD_NUMBER = 7;
   public static final int VOICE_GUIDANCE_FIELD_NUMBER = 8;
   public static final int VOLUME_FIELD_NUMBER = 1;
   public static final int ZONE_LIMITS_FIELD_NUMBER = 6;
   public static final int ZONE_OPTIMIZER_SETTING_FIELD_NUMBER = 3;
   private static final Converter remoteButtonActions_converter_ = new SportProfile$PbSportProfileSettings$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private boolean hrZoneLockAvailable_;
   private byte memoizedIsInitialized;
   private int oBSOLETEAltitudeSetting_;
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
   private SportProfile$PbTrainingReminder trainingReminder_;
   private boolean voiceGuidance_;
   private Types$PbVolume volume_;
   private Structures$PbZones zoneLimits_;
   private int zoneOptimizerSetting_;

   private SportProfile$PbSportProfileSettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.speedView_ = 1;
      this.zoneOptimizerSetting_ = 1;
      this.oBSOLETEHeartRateView_ = 1;
      this.sensorBroadcastingHr_ = false;
      this.voiceGuidance_ = false;
      this.oBSOLETEGpsSetting_ = 0;
      this.oBSOLETEAltitudeSetting_ = 0;
      this.powerView_ = 1;
      this.strideSpeedSource_ = 1;
      this.remoteButtonActions_ = Collections.emptyList();
      this.hrZoneLockAvailable_ = false;
      this.speedZoneLockAvailable_ = false;
      this.powerZoneLockAvailable_ = false;
      this.swimmingUnits_ = 0;
   }

   private SportProfile$PbSportProfileSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   SportProfile$PbSportProfileSettings(CodedInputStream var1, ExtensionRegistryLite var2, SportProfile$1 var3) {
      this(var1, var2);
   }

   private SportProfile$PbSportProfileSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   SportProfile$PbSportProfileSettings(Builder var1, SportProfile$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(SportProfile$PbSportProfileSettings var0, int var1) {
      var0.speedView_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static SportProfile$PbTrainingReminder a(SportProfile$PbSportProfileSettings var0, SportProfile$PbTrainingReminder var1) {
      var0.trainingReminder_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbZones a(SportProfile$PbSportProfileSettings var0, Structures$PbZones var1) {
      var0.zoneLimits_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbAutoLapSettings a(SportProfile$PbSportProfileSettings var0, Types$PbAutoLapSettings var1) {
      var0.oBSOLETEAutolapSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbVolume a(SportProfile$PbSportProfileSettings var0, Types$PbVolume var1) {
      var0.volume_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List a(SportProfile$PbSportProfileSettings var0) {
      return var0.remoteButtonActions_;
   }

   // $FF: synthetic method
   static List a(SportProfile$PbSportProfileSettings var0, List var1) {
      var0.remoteButtonActions_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean a(SportProfile$PbSportProfileSettings var0, boolean var1) {
      var0.sensorBroadcastingHr_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(SportProfile$PbSportProfileSettings var0, int var1) {
      var0.zoneOptimizerSetting_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(SportProfile$PbSportProfileSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static boolean b(SportProfile$PbSportProfileSettings var0, boolean var1) {
      var0.voiceGuidance_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int c(SportProfile$PbSportProfileSettings var0, int var1) {
      var0.oBSOLETEHeartRateView_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Converter c() {
      return remoteButtonActions_converter_;
   }

   // $FF: synthetic method
   static boolean c(SportProfile$PbSportProfileSettings var0, boolean var1) {
      var0.hrZoneLockAvailable_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int d(SportProfile$PbSportProfileSettings var0, int var1) {
      var0.oBSOLETEGpsSetting_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean d(SportProfile$PbSportProfileSettings var0, boolean var1) {
      var0.speedZoneLockAvailable_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int e(SportProfile$PbSportProfileSettings var0, int var1) {
      var0.oBSOLETEAltitudeSetting_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean e(SportProfile$PbSportProfileSettings var0, boolean var1) {
      var0.powerZoneLockAvailable_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int f(SportProfile$PbSportProfileSettings var0, int var1) {
      var0.powerView_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int g(SportProfile$PbSportProfileSettings var0, int var1) {
      var0.strideSpeedSource_ = var1;
      return var1;
   }

   public static SportProfile$PbSportProfileSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return SportProfile.c();
   }

   // $FF: synthetic method
   static int h(SportProfile$PbSportProfileSettings var0, int var1) {
      var0.swimmingUnits_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int i(SportProfile$PbSportProfileSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static SportProfile$PbSportProfileSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SportProfile$PbSportProfileSettings$Builder newBuilder(SportProfile$PbSportProfileSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static SportProfile$PbSportProfileSettings parseDelimitedFrom(InputStream var0) {
      return (SportProfile$PbSportProfileSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SportProfile$PbSportProfileSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportProfile$PbSportProfileSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SportProfile$PbSportProfileSettings parseFrom(ByteString var0) {
      return (SportProfile$PbSportProfileSettings)PARSER.parseFrom(var0);
   }

   public static SportProfile$PbSportProfileSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (SportProfile$PbSportProfileSettings)PARSER.parseFrom(var0, var1);
   }

   public static SportProfile$PbSportProfileSettings parseFrom(CodedInputStream var0) {
      return (SportProfile$PbSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportProfile$PbSportProfileSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (SportProfile$PbSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportProfile$PbSportProfileSettings parseFrom(InputStream var0) {
      return (SportProfile$PbSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportProfile$PbSportProfileSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportProfile$PbSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportProfile$PbSportProfileSettings parseFrom(byte[] var0) {
      return (SportProfile$PbSportProfileSettings)PARSER.parseFrom(var0);
   }

   public static SportProfile$PbSportProfileSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (SportProfile$PbSportProfileSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof SportProfile$PbSportProfileSettings)) {
            var2 = super.equals(var1);
         } else {
            SportProfile$PbSportProfileSettings var5 = (SportProfile$PbSportProfileSettings)var1;
            boolean var3;
            if (this.hasVolume() == var5.hasVolume()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasVolume()) {
               if (var3 && this.getVolume().equals(var5.getVolume())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSpeedView() == var5.hasSpeedView()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSpeedView()) {
               if (var4 && this.speedView_ == var5.speedView_) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasZoneOptimizerSetting() == var5.hasZoneOptimizerSetting()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasZoneOptimizerSetting()) {
               if (var3 && this.zoneOptimizerSetting_ == var5.zoneOptimizerSetting_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasOBSOLETEHeartRateView() == var5.hasOBSOLETEHeartRateView()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasOBSOLETEHeartRateView()) {
               if (var4 && this.oBSOLETEHeartRateView_ == var5.oBSOLETEHeartRateView_) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasSensorBroadcastingHr() == var5.hasSensorBroadcastingHr()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSensorBroadcastingHr()) {
               if (var4 && this.getSensorBroadcastingHr() == var5.getSensorBroadcastingHr()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasZoneLimits() == var5.hasZoneLimits()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasZoneLimits()) {
               if (var3 && this.getZoneLimits().equals(var5.getZoneLimits())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTrainingReminder() == var5.hasTrainingReminder()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasTrainingReminder()) {
               if (var4 && this.getTrainingReminder().equals(var5.getTrainingReminder())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasVoiceGuidance() == var5.hasVoiceGuidance()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasVoiceGuidance()) {
               if (var4 && this.getVoiceGuidance() == var5.getVoiceGuidance()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasOBSOLETEGpsSetting() == var5.hasOBSOLETEGpsSetting()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasOBSOLETEGpsSetting()) {
               if (var3 && this.oBSOLETEGpsSetting_ == var5.oBSOLETEGpsSetting_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasOBSOLETEAutolapSettings() == var5.hasOBSOLETEAutolapSettings()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasOBSOLETEAutolapSettings()) {
               if (var4 && this.getOBSOLETEAutolapSettings().equals(var5.getOBSOLETEAutolapSettings())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasOBSOLETEAltitudeSetting() == var5.hasOBSOLETEAltitudeSetting()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasOBSOLETEAltitudeSetting()) {
               if (var4 && this.oBSOLETEAltitudeSetting_ == var5.oBSOLETEAltitudeSetting_) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasPowerView() == var5.hasPowerView()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasPowerView()) {
               if (var3 && this.powerView_ == var5.powerView_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasStrideSpeedSource() == var5.hasStrideSpeedSource()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasStrideSpeedSource()) {
               if (var3 && this.strideSpeedSource_ == var5.strideSpeedSource_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.remoteButtonActions_.equals(var5.remoteButtonActions_)) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.hasHrZoneLockAvailable() == var5.hasHrZoneLockAvailable()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasHrZoneLockAvailable()) {
               if (var3 && this.getHrZoneLockAvailable() == var5.getHrZoneLockAvailable()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSpeedZoneLockAvailable() == var5.hasSpeedZoneLockAvailable()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSpeedZoneLockAvailable()) {
               if (var4 && this.getSpeedZoneLockAvailable() == var5.getSpeedZoneLockAvailable()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasPowerZoneLockAvailable() == var5.hasPowerZoneLockAvailable()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasPowerZoneLockAvailable()) {
               if (var4 && this.getPowerZoneLockAvailable() == var5.getPowerZoneLockAvailable()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasSwimmingUnits() == var5.hasSwimmingUnits()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSwimmingUnits()) {
               if (var4 && this.swimmingUnits_ == var5.swimmingUnits_) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (!var3 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public SportProfile$PbSportProfileSettings getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
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
      if (this.oBSOLETEAutolapSettings_ == null) {
         var1 = Types$PbAutoLapSettings.getDefaultInstance();
      } else {
         var1 = this.oBSOLETEAutolapSettings_;
      }

      return var1;
   }

   public Types$PbAutoLapSettingsOrBuilder getOBSOLETEAutolapSettingsOrBuilder() {
      Types$PbAutoLapSettings var1;
      if (this.oBSOLETEAutolapSettings_ == null) {
         var1 = Types$PbAutoLapSettings.getDefaultInstance();
      } else {
         var1 = this.oBSOLETEAutolapSettings_;
      }

      return var1;
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

   public Parser getParserForType() {
      return PARSER;
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
      return (SportProfile$PbSportProfileSettings$PbRemoteButtonAction)remoteButtonActions_converter_.convert(this.remoteButtonActions_.get(var1));
   }

   public int getRemoteButtonActionsCount() {
      return this.remoteButtonActions_.size();
   }

   public List getRemoteButtonActionsList() {
      return new ListAdapter(this.remoteButtonActions_, remoteButtonActions_converter_);
   }

   public boolean getSensorBroadcastingHr() {
      return this.sensorBroadcastingHr_;
   }

   public int getSerializedSize() {
      byte var1 = 0;
      int var2 = this.memoizedSize;
      if (var2 == -1) {
         int var3;
         if ((this.bitField0_ & 1) == 1) {
            var3 = CodedOutputStream.computeMessageSize(1, this.getVolume()) + 0;
         } else {
            var3 = 0;
         }

         var2 = var3;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var3 + CodedOutputStream.computeEnumSize(2, this.speedView_);
         }

         var3 = var2;
         if ((this.bitField0_ & 4) == 4) {
            var3 = var2 + CodedOutputStream.computeEnumSize(3, this.zoneOptimizerSetting_);
         }

         var2 = var3;
         if ((this.bitField0_ & 8) == 8) {
            var2 = var3 + CodedOutputStream.computeEnumSize(4, this.oBSOLETEHeartRateView_);
         }

         var3 = var2;
         if ((this.bitField0_ & 16) == 16) {
            var3 = var2 + CodedOutputStream.computeBoolSize(5, this.sensorBroadcastingHr_);
         }

         int var4 = var3;
         if ((this.bitField0_ & 32) == 32) {
            var4 = var3 + CodedOutputStream.computeMessageSize(6, this.getZoneLimits());
         }

         var2 = var4;
         if ((this.bitField0_ & 64) == 64) {
            var2 = var4 + CodedOutputStream.computeMessageSize(7, this.getTrainingReminder());
         }

         var4 = var2;
         if ((this.bitField0_ & 128) == 128) {
            var4 = var2 + CodedOutputStream.computeBoolSize(8, this.voiceGuidance_);
         }

         var3 = var4;
         if ((this.bitField0_ & 256) == 256) {
            var3 = var4 + CodedOutputStream.computeEnumSize(9, this.oBSOLETEGpsSetting_);
         }

         var2 = var3;
         if ((this.bitField0_ & 512) == 512) {
            var2 = var3 + CodedOutputStream.computeMessageSize(10, this.getOBSOLETEAutolapSettings());
         }

         var3 = var2;
         if ((this.bitField0_ & 1024) == 1024) {
            var3 = var2 + CodedOutputStream.computeEnumSize(11, this.oBSOLETEAltitudeSetting_);
         }

         var2 = var3;
         if ((this.bitField0_ & 2048) == 2048) {
            var2 = var3 + CodedOutputStream.computeEnumSize(12, this.powerView_);
         }

         if ((this.bitField0_ & 4096) == 4096) {
            var2 += CodedOutputStream.computeEnumSize(13, this.strideSpeedSource_);
         }

         var3 = 0;

         int var5;
         for(var4 = var1; var4 < this.remoteButtonActions_.size(); var3 += var5) {
            var5 = CodedOutputStream.computeEnumSizeNoTag((Integer)this.remoteButtonActions_.get(var4));
            ++var4;
         }

         var2 = var2 + var3 + this.remoteButtonActions_.size() * 1;
         var3 = var2;
         if ((this.bitField0_ & 8192) == 8192) {
            var3 = var2 + CodedOutputStream.computeBoolSize(15, this.hrZoneLockAvailable_);
         }

         var2 = var3;
         if ((this.bitField0_ & 16384) == 16384) {
            var2 = var3 + CodedOutputStream.computeBoolSize(16, this.speedZoneLockAvailable_);
         }

         var3 = var2;
         if ((this.bitField0_ & '耀') == 32768) {
            var3 = var2 + CodedOutputStream.computeBoolSize(17, this.powerZoneLockAvailable_);
         }

         var2 = var3;
         if ((this.bitField0_ & 65536) == 65536) {
            var2 = var3 + CodedOutputStream.computeEnumSize(18, this.swimmingUnits_);
         }

         var2 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var2;
      }

      return var2;
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
      if (this.trainingReminder_ == null) {
         var1 = SportProfile$PbTrainingReminder.getDefaultInstance();
      } else {
         var1 = this.trainingReminder_;
      }

      return var1;
   }

   public SportProfile$PbTrainingReminderOrBuilder getTrainingReminderOrBuilder() {
      SportProfile$PbTrainingReminder var1;
      if (this.trainingReminder_ == null) {
         var1 = SportProfile$PbTrainingReminder.getDefaultInstance();
      } else {
         var1 = this.trainingReminder_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean getVoiceGuidance() {
      return this.voiceGuidance_;
   }

   public Types$PbVolume getVolume() {
      Types$PbVolume var1;
      if (this.volume_ == null) {
         var1 = Types$PbVolume.getDefaultInstance();
      } else {
         var1 = this.volume_;
      }

      return var1;
   }

   public Types$PbVolumeOrBuilder getVolumeOrBuilder() {
      Types$PbVolume var1;
      if (this.volume_ == null) {
         var1 = Types$PbVolume.getDefaultInstance();
      } else {
         var1 = this.volume_;
      }

      return var1;
   }

   public Structures$PbZones getZoneLimits() {
      Structures$PbZones var1;
      if (this.zoneLimits_ == null) {
         var1 = Structures$PbZones.getDefaultInstance();
      } else {
         var1 = this.zoneLimits_;
      }

      return var1;
   }

   public Structures$PbZonesOrBuilder getZoneLimitsOrBuilder() {
      Structures$PbZones var1;
      if (this.zoneLimits_ == null) {
         var1 = Structures$PbZones.getDefaultInstance();
      } else {
         var1 = this.zoneLimits_;
      }

      return var1;
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
      if ((this.bitField0_ & 8192) == 8192) {
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
      if ((this.bitField0_ & '耀') == 32768) {
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
      if ((this.bitField0_ & 16384) == 16384) {
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
      if ((this.bitField0_ & 65536) == 65536) {
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

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         var1 = this.getDescriptorForType().hashCode() + 779;
         int var2 = var1;
         if (this.hasVolume()) {
            var2 = (var1 * 37 + 1) * 53 + this.getVolume().hashCode();
         }

         var1 = var2;
         if (this.hasSpeedView()) {
            var1 = (var2 * 37 + 2) * 53 + this.speedView_;
         }

         var2 = var1;
         if (this.hasZoneOptimizerSetting()) {
            var2 = (var1 * 37 + 3) * 53 + this.zoneOptimizerSetting_;
         }

         int var3 = var2;
         if (this.hasOBSOLETEHeartRateView()) {
            var3 = (var2 * 37 + 4) * 53 + this.oBSOLETEHeartRateView_;
         }

         var1 = var3;
         if (this.hasSensorBroadcastingHr()) {
            var1 = (var3 * 37 + 5) * 53 + Internal.hashBoolean(this.getSensorBroadcastingHr());
         }

         var2 = var1;
         if (this.hasZoneLimits()) {
            var2 = (var1 * 37 + 6) * 53 + this.getZoneLimits().hashCode();
         }

         var1 = var2;
         if (this.hasTrainingReminder()) {
            var1 = (var2 * 37 + 7) * 53 + this.getTrainingReminder().hashCode();
         }

         var2 = var1;
         if (this.hasVoiceGuidance()) {
            var2 = (var1 * 37 + 8) * 53 + Internal.hashBoolean(this.getVoiceGuidance());
         }

         var1 = var2;
         if (this.hasOBSOLETEGpsSetting()) {
            var1 = (var2 * 37 + 9) * 53 + this.oBSOLETEGpsSetting_;
         }

         var2 = var1;
         if (this.hasOBSOLETEAutolapSettings()) {
            var2 = (var1 * 37 + 10) * 53 + this.getOBSOLETEAutolapSettings().hashCode();
         }

         var1 = var2;
         if (this.hasOBSOLETEAltitudeSetting()) {
            var1 = (var2 * 37 + 11) * 53 + this.oBSOLETEAltitudeSetting_;
         }

         var2 = var1;
         if (this.hasPowerView()) {
            var2 = (var1 * 37 + 12) * 53 + this.powerView_;
         }

         var3 = var2;
         if (this.hasStrideSpeedSource()) {
            var3 = (var2 * 37 + 13) * 53 + this.strideSpeedSource_;
         }

         var1 = var3;
         if (this.getRemoteButtonActionsCount() > 0) {
            var1 = (var3 * 37 + 14) * 53 + this.remoteButtonActions_.hashCode();
         }

         var2 = var1;
         if (this.hasHrZoneLockAvailable()) {
            var2 = (var1 * 37 + 15) * 53 + Internal.hashBoolean(this.getHrZoneLockAvailable());
         }

         var3 = var2;
         if (this.hasSpeedZoneLockAvailable()) {
            var3 = (var2 * 37 + 16) * 53 + Internal.hashBoolean(this.getSpeedZoneLockAvailable());
         }

         var1 = var3;
         if (this.hasPowerZoneLockAvailable()) {
            var1 = (var3 * 37 + 17) * 53 + Internal.hashBoolean(this.getPowerZoneLockAvailable());
         }

         var2 = var1;
         if (this.hasSwimmingUnits()) {
            var2 = (var1 * 37 + 18) * 53 + this.swimmingUnits_;
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportProfile.d().ensureFieldAccessorsInitialized(SportProfile$PbSportProfileSettings.class, SportProfile$PbSportProfileSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (this.hasVolume() && !this.getVolume().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasZoneLimits() && !this.getZoneLimits().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasTrainingReminder() && !this.getTrainingReminder().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasOBSOLETEAutolapSettings() && !this.getOBSOLETEAutolapSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public SportProfile$PbSportProfileSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected SportProfile$PbSportProfileSettings$Builder newBuilderForType(BuilderParent var1) {
      return new SportProfile$PbSportProfileSettings$Builder(var1, (SportProfile$1)null);
   }

   public SportProfile$PbSportProfileSettings$Builder toBuilder() {
      SportProfile$PbSportProfileSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new SportProfile$PbSportProfileSettings$Builder((SportProfile$1)null);
      } else {
         var1 = (new SportProfile$PbSportProfileSettings$Builder((SportProfile$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getVolume());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeEnum(2, this.speedView_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeEnum(3, this.zoneOptimizerSetting_);
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeEnum(4, this.oBSOLETEHeartRateView_);
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeBool(5, this.sensorBroadcastingHr_);
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeMessage(6, this.getZoneLimits());
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeMessage(7, this.getTrainingReminder());
      }

      if ((this.bitField0_ & 128) == 128) {
         var1.writeBool(8, this.voiceGuidance_);
      }

      if ((this.bitField0_ & 256) == 256) {
         var1.writeEnum(9, this.oBSOLETEGpsSetting_);
      }

      if ((this.bitField0_ & 512) == 512) {
         var1.writeMessage(10, this.getOBSOLETEAutolapSettings());
      }

      if ((this.bitField0_ & 1024) == 1024) {
         var1.writeEnum(11, this.oBSOLETEAltitudeSetting_);
      }

      if ((this.bitField0_ & 2048) == 2048) {
         var1.writeEnum(12, this.powerView_);
      }

      if ((this.bitField0_ & 4096) == 4096) {
         var1.writeEnum(13, this.strideSpeedSource_);
      }

      for(int var2 = 0; var2 < this.remoteButtonActions_.size(); ++var2) {
         var1.writeEnum(14, (Integer)this.remoteButtonActions_.get(var2));
      }

      if ((this.bitField0_ & 8192) == 8192) {
         var1.writeBool(15, this.hrZoneLockAvailable_);
      }

      if ((this.bitField0_ & 16384) == 16384) {
         var1.writeBool(16, this.speedZoneLockAvailable_);
      }

      if ((this.bitField0_ & '耀') == 32768) {
         var1.writeBool(17, this.powerZoneLockAvailable_);
      }

      if ((this.bitField0_ & 65536) == 65536) {
         var1.writeEnum(18, this.swimmingUnits_);
      }

      this.unknownFields.writeTo(var1);
   }
}
