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
import java.io.InputStream;

public final class SportprofileGuitarSettings$PbGuitarSportProfileSettings extends GeneratedMessageV3 implements SportprofileGuitarSettings$PbGuitarSportProfileSettingsOrBuilder {
   public static final int ALTITUDE_SETTING_FIELD_NUMBER = 11;
   public static final int AUTOLAP_SETTINGS_FIELD_NUMBER = 14;
   public static final int AUTO_PAUSE_FIELD_NUMBER = 13;
   public static final int AUTO_SCROLLING_FIELD_NUMBER = 5;
   public static final int AUTO_START_FIELD_NUMBER = 4;
   private static final SportprofileGuitarSettings$PbGuitarSportProfileSettings DEFAULT_INSTANCE = new SportprofileGuitarSettings$PbGuitarSportProfileSettings();
   public static final int GPS_SETTING_FIELD_NUMBER = 12;
   public static final int HEART_RATE_VIEW_FIELD_NUMBER = 15;
   public static final int HEART_TOUCH_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new SportprofileGuitarSettings$PbGuitarSportProfileSettings$1();
   public static final int SIRIUS2_DISPLAY_SETTINGS_FIELD_NUMBER = 10;
   public static final int SPORT_TAP_BUTTON_SENSITIVITY_FIELD_NUMBER = 8;
   public static final int SPRINT_DISPLAY_ACTIVATION_FIELD_NUMBER = 7;
   public static final int STRIDE_SENSOR_CALIB_SETTINGS_FIELD_NUMBER = 6;
   public static final int SWIMMING_POOL_FIELD_NUMBER = 9;
   public static final int TAP_BUTTON_ACTION_FIELD_NUMBER = 2;
   public static final int VIBRATION_FIELD_NUMBER = 3;
   private static final long serialVersionUID = 0L;
   private int altitudeSetting_;
   private Types$PbAutoPause autoPause_;
   private boolean autoScrolling_;
   private boolean autoStart_;
   private Types$PbAutoLapSettings autolapSettings_;
   private int bitField0_;
   private int gpsSetting_;
   private int heartRateView_;
   private int heartTouch_;
   private byte memoizedIsInitialized;
   private SportprofileDisplays$PbSirius2DisplaySettings sirius2DisplaySettings_;
   private int sportTapButtonSensitivity_;
   private int sprintDisplayActivation_;
   private Types$PbStrideSensorCalibSettings strideSensorCalibSettings_;
   private Structures$PbSwimmingPoolInfo swimmingPool_;
   private int tapButtonAction_;
   private boolean vibration_;

   private SportprofileGuitarSettings$PbGuitarSportProfileSettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.heartTouch_ = 1;
      this.tapButtonAction_ = 1;
      this.vibration_ = false;
      this.autoStart_ = false;
      this.autoScrolling_ = false;
      this.sprintDisplayActivation_ = 0;
      this.sportTapButtonSensitivity_ = 3;
      this.altitudeSetting_ = 0;
      this.gpsSetting_ = 0;
      this.heartRateView_ = 1;
   }

   private SportprofileGuitarSettings$PbGuitarSportProfileSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   SportprofileGuitarSettings$PbGuitarSportProfileSettings(CodedInputStream var1, ExtensionRegistryLite var2, SportprofileGuitarSettings$1 var3) {
      this(var1, var2);
   }

   private SportprofileGuitarSettings$PbGuitarSportProfileSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   SportprofileGuitarSettings$PbGuitarSportProfileSettings(Builder var1, SportprofileGuitarSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(SportprofileGuitarSettings$PbGuitarSportProfileSettings var0, int var1) {
      var0.heartTouch_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(SportprofileGuitarSettings$PbGuitarSportProfileSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static SportprofileDisplays$PbSirius2DisplaySettings a(SportprofileGuitarSettings$PbGuitarSportProfileSettings var0, SportprofileDisplays$PbSirius2DisplaySettings var1) {
      var0.sirius2DisplaySettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbSwimmingPoolInfo a(SportprofileGuitarSettings$PbGuitarSportProfileSettings var0, Structures$PbSwimmingPoolInfo var1) {
      var0.swimmingPool_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbAutoLapSettings a(SportprofileGuitarSettings$PbGuitarSportProfileSettings var0, Types$PbAutoLapSettings var1) {
      var0.autolapSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbAutoPause a(SportprofileGuitarSettings$PbGuitarSportProfileSettings var0, Types$PbAutoPause var1) {
      var0.autoPause_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbStrideSensorCalibSettings a(SportprofileGuitarSettings$PbGuitarSportProfileSettings var0, Types$PbStrideSensorCalibSettings var1) {
      var0.strideSensorCalibSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean a(SportprofileGuitarSettings$PbGuitarSportProfileSettings var0, boolean var1) {
      var0.vibration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(SportprofileGuitarSettings$PbGuitarSportProfileSettings var0, int var1) {
      var0.tapButtonAction_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static boolean b(SportprofileGuitarSettings$PbGuitarSportProfileSettings var0, boolean var1) {
      var0.autoStart_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int c(SportprofileGuitarSettings$PbGuitarSportProfileSettings var0, int var1) {
      var0.sprintDisplayActivation_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean c(SportprofileGuitarSettings$PbGuitarSportProfileSettings var0, boolean var1) {
      var0.autoScrolling_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int d(SportprofileGuitarSettings$PbGuitarSportProfileSettings var0, int var1) {
      var0.sportTapButtonSensitivity_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int e(SportprofileGuitarSettings$PbGuitarSportProfileSettings var0, int var1) {
      var0.altitudeSetting_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int f(SportprofileGuitarSettings$PbGuitarSportProfileSettings var0, int var1) {
      var0.gpsSetting_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int g(SportprofileGuitarSettings$PbGuitarSportProfileSettings var0, int var1) {
      var0.heartRateView_ = var1;
      return var1;
   }

   public static SportprofileGuitarSettings$PbGuitarSportProfileSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return SportprofileGuitarSettings.a();
   }

   // $FF: synthetic method
   static int h(SportprofileGuitarSettings$PbGuitarSportProfileSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder newBuilder(SportprofileGuitarSettings$PbGuitarSportProfileSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static SportprofileGuitarSettings$PbGuitarSportProfileSettings parseDelimitedFrom(InputStream var0) {
      return (SportprofileGuitarSettings$PbGuitarSportProfileSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SportprofileGuitarSettings$PbGuitarSportProfileSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileGuitarSettings$PbGuitarSportProfileSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SportprofileGuitarSettings$PbGuitarSportProfileSettings parseFrom(ByteString var0) {
      return (SportprofileGuitarSettings$PbGuitarSportProfileSettings)PARSER.parseFrom(var0);
   }

   public static SportprofileGuitarSettings$PbGuitarSportProfileSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (SportprofileGuitarSettings$PbGuitarSportProfileSettings)PARSER.parseFrom(var0, var1);
   }

   public static SportprofileGuitarSettings$PbGuitarSportProfileSettings parseFrom(CodedInputStream var0) {
      return (SportprofileGuitarSettings$PbGuitarSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportprofileGuitarSettings$PbGuitarSportProfileSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileGuitarSettings$PbGuitarSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportprofileGuitarSettings$PbGuitarSportProfileSettings parseFrom(InputStream var0) {
      return (SportprofileGuitarSettings$PbGuitarSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportprofileGuitarSettings$PbGuitarSportProfileSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportprofileGuitarSettings$PbGuitarSportProfileSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportprofileGuitarSettings$PbGuitarSportProfileSettings parseFrom(byte[] var0) {
      return (SportprofileGuitarSettings$PbGuitarSportProfileSettings)PARSER.parseFrom(var0);
   }

   public static SportprofileGuitarSettings$PbGuitarSportProfileSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (SportprofileGuitarSettings$PbGuitarSportProfileSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof SportprofileGuitarSettings$PbGuitarSportProfileSettings)) {
            var2 = super.equals(var1);
         } else {
            SportprofileGuitarSettings$PbGuitarSportProfileSettings var5 = (SportprofileGuitarSettings$PbGuitarSportProfileSettings)var1;
            boolean var3;
            if (this.hasHeartTouch() == var5.hasHeartTouch()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasHeartTouch()) {
               if (var3 && this.heartTouch_ == var5.heartTouch_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTapButtonAction() == var5.hasTapButtonAction()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasTapButtonAction()) {
               if (var3 && this.tapButtonAction_ == var5.tapButtonAction_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasVibration() == var5.hasVibration()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasVibration()) {
               if (var3 && this.getVibration() == var5.getVibration()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAutoStart() == var5.hasAutoStart()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasAutoStart()) {
               if (var3 && this.getAutoStart() == var5.getAutoStart()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAutoScrolling() == var5.hasAutoScrolling()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAutoScrolling()) {
               if (var4 && this.getAutoScrolling() == var5.getAutoScrolling()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasStrideSensorCalibSettings() == var5.hasStrideSensorCalibSettings()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasStrideSensorCalibSettings()) {
               if (var3 && this.getStrideSensorCalibSettings().equals(var5.getStrideSensorCalibSettings())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSprintDisplayActivation() == var5.hasSprintDisplayActivation()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSprintDisplayActivation()) {
               if (var3 && this.getSprintDisplayActivation() == var5.getSprintDisplayActivation()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSportTapButtonSensitivity() == var5.hasSportTapButtonSensitivity()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSportTapButtonSensitivity()) {
               if (var3 && this.sportTapButtonSensitivity_ == var5.sportTapButtonSensitivity_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSwimmingPool() == var5.hasSwimmingPool()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSwimmingPool()) {
               if (var4 && this.getSwimmingPool().equals(var5.getSwimmingPool())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasSirius2DisplaySettings() == var5.hasSirius2DisplaySettings()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSirius2DisplaySettings()) {
               if (var4 && this.getSirius2DisplaySettings().equals(var5.getSirius2DisplaySettings())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasAltitudeSetting() == var5.hasAltitudeSetting()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAltitudeSetting()) {
               if (var4 && this.altitudeSetting_ == var5.altitudeSetting_) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasGpsSetting() == var5.hasGpsSetting()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasGpsSetting()) {
               if (var4 && this.gpsSetting_ == var5.gpsSetting_) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasAutoPause() == var5.hasAutoPause()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasAutoPause()) {
               if (var3 && this.getAutoPause().equals(var5.getAutoPause())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAutolapSettings() == var5.hasAutolapSettings()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasAutolapSettings()) {
               if (var3 && this.getAutolapSettings().equals(var5.getAutolapSettings())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasHeartRateView() == var5.hasHeartRateView()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasHeartRateView()) {
               if (var4 && this.heartRateView_ == var5.heartRateView_) {
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

   public Types$PbAltitudeSetting getAltitudeSetting() {
      Types$PbAltitudeSetting var1 = Types$PbAltitudeSetting.valueOf(this.altitudeSetting_);
      Types$PbAltitudeSetting var2 = var1;
      if (var1 == null) {
         var2 = Types$PbAltitudeSetting.ALTITUDE_OFF;
      }

      return var2;
   }

   public Types$PbAutoPause getAutoPause() {
      Types$PbAutoPause var1;
      if (this.autoPause_ == null) {
         var1 = Types$PbAutoPause.getDefaultInstance();
      } else {
         var1 = this.autoPause_;
      }

      return var1;
   }

   public Types$PbAutoPauseOrBuilder getAutoPauseOrBuilder() {
      Types$PbAutoPause var1;
      if (this.autoPause_ == null) {
         var1 = Types$PbAutoPause.getDefaultInstance();
      } else {
         var1 = this.autoPause_;
      }

      return var1;
   }

   public boolean getAutoScrolling() {
      return this.autoScrolling_;
   }

   public boolean getAutoStart() {
      return this.autoStart_;
   }

   public Types$PbAutoLapSettings getAutolapSettings() {
      Types$PbAutoLapSettings var1;
      if (this.autolapSettings_ == null) {
         var1 = Types$PbAutoLapSettings.getDefaultInstance();
      } else {
         var1 = this.autolapSettings_;
      }

      return var1;
   }

   public Types$PbAutoLapSettingsOrBuilder getAutolapSettingsOrBuilder() {
      Types$PbAutoLapSettings var1;
      if (this.autolapSettings_ == null) {
         var1 = Types$PbAutoLapSettings.getDefaultInstance();
      } else {
         var1 = this.autolapSettings_;
      }

      return var1;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Types$PbGPSSetting getGpsSetting() {
      Types$PbGPSSetting var1 = Types$PbGPSSetting.valueOf(this.gpsSetting_);
      Types$PbGPSSetting var2 = var1;
      if (var1 == null) {
         var2 = Types$PbGPSSetting.GPS_OFF;
      }

      return var2;
   }

   public Types$PbHeartRateView getHeartRateView() {
      Types$PbHeartRateView var1 = Types$PbHeartRateView.valueOf(this.heartRateView_);
      Types$PbHeartRateView var2 = var1;
      if (var1 == null) {
         var2 = Types$PbHeartRateView.HEART_RATE_VIEW_BPM;
      }

      return var2;
   }

   public Types$PbHeartTouch getHeartTouch() {
      Types$PbHeartTouch var1 = Types$PbHeartTouch.valueOf(this.heartTouch_);
      Types$PbHeartTouch var2 = var1;
      if (var1 == null) {
         var2 = Types$PbHeartTouch.HEART_TOUCH_OFF;
      }

      return var2;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeEnumSize(1, this.heartTouch_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeEnumSize(2, this.tapButtonAction_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeBoolSize(3, this.vibration_);
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeBoolSize(4, this.autoStart_);
         }

         var2 = var1;
         if ((this.bitField0_ & 16) == 16) {
            var2 = var1 + CodedOutputStream.computeBoolSize(5, this.autoScrolling_);
         }

         var1 = var2;
         if ((this.bitField0_ & 32) == 32) {
            var1 = var2 + CodedOutputStream.computeMessageSize(6, this.getStrideSensorCalibSettings());
         }

         int var3 = var1;
         if ((this.bitField0_ & 64) == 64) {
            var3 = var1 + CodedOutputStream.computeUInt32Size(7, this.sprintDisplayActivation_);
         }

         var2 = var3;
         if ((this.bitField0_ & 128) == 128) {
            var2 = var3 + CodedOutputStream.computeEnumSize(8, this.sportTapButtonSensitivity_);
         }

         var1 = var2;
         if ((this.bitField0_ & 256) == 256) {
            var1 = var2 + CodedOutputStream.computeMessageSize(9, this.getSwimmingPool());
         }

         var2 = var1;
         if ((this.bitField0_ & 512) == 512) {
            var2 = var1 + CodedOutputStream.computeMessageSize(10, this.getSirius2DisplaySettings());
         }

         var1 = var2;
         if ((this.bitField0_ & 1024) == 1024) {
            var1 = var2 + CodedOutputStream.computeEnumSize(11, this.altitudeSetting_);
         }

         var2 = var1;
         if ((this.bitField0_ & 2048) == 2048) {
            var2 = var1 + CodedOutputStream.computeEnumSize(12, this.gpsSetting_);
         }

         var3 = var2;
         if ((this.bitField0_ & 4096) == 4096) {
            var3 = var2 + CodedOutputStream.computeMessageSize(13, this.getAutoPause());
         }

         var1 = var3;
         if ((this.bitField0_ & 8192) == 8192) {
            var1 = var3 + CodedOutputStream.computeMessageSize(14, this.getAutolapSettings());
         }

         var2 = var1;
         if ((this.bitField0_ & 16384) == 16384) {
            var2 = var1 + CodedOutputStream.computeEnumSize(15, this.heartRateView_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public SportprofileDisplays$PbSirius2DisplaySettings getSirius2DisplaySettings() {
      SportprofileDisplays$PbSirius2DisplaySettings var1;
      if (this.sirius2DisplaySettings_ == null) {
         var1 = SportprofileDisplays$PbSirius2DisplaySettings.getDefaultInstance();
      } else {
         var1 = this.sirius2DisplaySettings_;
      }

      return var1;
   }

   public SportprofileDisplays$PbSirius2DisplaySettingsOrBuilder getSirius2DisplaySettingsOrBuilder() {
      SportprofileDisplays$PbSirius2DisplaySettings var1;
      if (this.sirius2DisplaySettings_ == null) {
         var1 = SportprofileDisplays$PbSirius2DisplaySettings.getDefaultInstance();
      } else {
         var1 = this.sirius2DisplaySettings_;
      }

      return var1;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$PbSportTapButtonSensitivity getSportTapButtonSensitivity() {
      SportprofileGuitarSettings$PbGuitarSportProfileSettings$PbSportTapButtonSensitivity var1 = SportprofileGuitarSettings$PbGuitarSportProfileSettings$PbSportTapButtonSensitivity.valueOf(this.sportTapButtonSensitivity_);
      SportprofileGuitarSettings$PbGuitarSportProfileSettings$PbSportTapButtonSensitivity var2 = var1;
      if (var1 == null) {
         var2 = SportprofileGuitarSettings$PbGuitarSportProfileSettings$PbSportTapButtonSensitivity.SPORT_TAP_BUTTON_SENSITIVITY_MEDIUM;
      }

      return var2;
   }

   public int getSprintDisplayActivation() {
      return this.sprintDisplayActivation_;
   }

   public Types$PbStrideSensorCalibSettings getStrideSensorCalibSettings() {
      Types$PbStrideSensorCalibSettings var1;
      if (this.strideSensorCalibSettings_ == null) {
         var1 = Types$PbStrideSensorCalibSettings.getDefaultInstance();
      } else {
         var1 = this.strideSensorCalibSettings_;
      }

      return var1;
   }

   public Types$PbStrideSensorCalibSettingsOrBuilder getStrideSensorCalibSettingsOrBuilder() {
      Types$PbStrideSensorCalibSettings var1;
      if (this.strideSensorCalibSettings_ == null) {
         var1 = Types$PbStrideSensorCalibSettings.getDefaultInstance();
      } else {
         var1 = this.strideSensorCalibSettings_;
      }

      return var1;
   }

   public Structures$PbSwimmingPoolInfo getSwimmingPool() {
      Structures$PbSwimmingPoolInfo var1;
      if (this.swimmingPool_ == null) {
         var1 = Structures$PbSwimmingPoolInfo.getDefaultInstance();
      } else {
         var1 = this.swimmingPool_;
      }

      return var1;
   }

   public Structures$PbSwimmingPoolInfoOrBuilder getSwimmingPoolOrBuilder() {
      Structures$PbSwimmingPoolInfo var1;
      if (this.swimmingPool_ == null) {
         var1 = Structures$PbSwimmingPoolInfo.getDefaultInstance();
      } else {
         var1 = this.swimmingPool_;
      }

      return var1;
   }

   public Types$PbTapButtonAction getTapButtonAction() {
      Types$PbTapButtonAction var1 = Types$PbTapButtonAction.valueOf(this.tapButtonAction_);
      Types$PbTapButtonAction var2 = var1;
      if (var1 == null) {
         var2 = Types$PbTapButtonAction.TAP_BUTTON_OFF;
      }

      return var2;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean getVibration() {
      return this.vibration_;
   }

   public boolean hasAltitudeSetting() {
      boolean var1;
      if ((this.bitField0_ & 1024) == 1024) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAutoPause() {
      boolean var1;
      if ((this.bitField0_ & 4096) == 4096) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAutoScrolling() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAutoStart() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAutolapSettings() {
      boolean var1;
      if ((this.bitField0_ & 8192) == 8192) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasGpsSetting() {
      boolean var1;
      if ((this.bitField0_ & 2048) == 2048) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasHeartRateView() {
      boolean var1;
      if ((this.bitField0_ & 16384) == 16384) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasHeartTouch() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSirius2DisplaySettings() {
      boolean var1;
      if ((this.bitField0_ & 512) == 512) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSportTapButtonSensitivity() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSprintDisplayActivation() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStrideSensorCalibSettings() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSwimmingPool() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTapButtonAction() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasVibration() {
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
         if (this.hasHeartTouch()) {
            var2 = (var1 * 37 + 1) * 53 + this.heartTouch_;
         }

         var1 = var2;
         if (this.hasTapButtonAction()) {
            var1 = (var2 * 37 + 2) * 53 + this.tapButtonAction_;
         }

         var2 = var1;
         if (this.hasVibration()) {
            var2 = (var1 * 37 + 3) * 53 + Internal.hashBoolean(this.getVibration());
         }

         var1 = var2;
         if (this.hasAutoStart()) {
            var1 = (var2 * 37 + 4) * 53 + Internal.hashBoolean(this.getAutoStart());
         }

         int var3 = var1;
         if (this.hasAutoScrolling()) {
            var3 = (var1 * 37 + 5) * 53 + Internal.hashBoolean(this.getAutoScrolling());
         }

         var2 = var3;
         if (this.hasStrideSensorCalibSettings()) {
            var2 = (var3 * 37 + 6) * 53 + this.getStrideSensorCalibSettings().hashCode();
         }

         var1 = var2;
         if (this.hasSprintDisplayActivation()) {
            var1 = (var2 * 37 + 7) * 53 + this.getSprintDisplayActivation();
         }

         var2 = var1;
         if (this.hasSportTapButtonSensitivity()) {
            var2 = (var1 * 37 + 8) * 53 + this.sportTapButtonSensitivity_;
         }

         var3 = var2;
         if (this.hasSwimmingPool()) {
            var3 = (var2 * 37 + 9) * 53 + this.getSwimmingPool().hashCode();
         }

         var1 = var3;
         if (this.hasSirius2DisplaySettings()) {
            var1 = (var3 * 37 + 10) * 53 + this.getSirius2DisplaySettings().hashCode();
         }

         var2 = var1;
         if (this.hasAltitudeSetting()) {
            var2 = (var1 * 37 + 11) * 53 + this.altitudeSetting_;
         }

         var1 = var2;
         if (this.hasGpsSetting()) {
            var1 = (var2 * 37 + 12) * 53 + this.gpsSetting_;
         }

         var2 = var1;
         if (this.hasAutoPause()) {
            var2 = (var1 * 37 + 13) * 53 + this.getAutoPause().hashCode();
         }

         var1 = var2;
         if (this.hasAutolapSettings()) {
            var1 = (var2 * 37 + 14) * 53 + this.getAutolapSettings().hashCode();
         }

         var2 = var1;
         if (this.hasHeartRateView()) {
            var2 = (var1 * 37 + 15) * 53 + this.heartRateView_;
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportprofileGuitarSettings.b().ensureFieldAccessorsInitialized(SportprofileGuitarSettings$PbGuitarSportProfileSettings.class, SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (this.hasStrideSensorCalibSettings() && !this.getStrideSensorCalibSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasSwimmingPool() && !this.getSwimmingPool().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasAutoPause() && !this.getAutoPause().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasAutolapSettings() && !this.getAutolapSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder newBuilderForType(BuilderParent var1) {
      return new SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder(var1, (SportprofileGuitarSettings$1)null);
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder toBuilder() {
      SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder((SportprofileGuitarSettings$1)null);
      } else {
         var1 = (new SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder((SportprofileGuitarSettings$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.heartTouch_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeEnum(2, this.tapButtonAction_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeBool(3, this.vibration_);
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeBool(4, this.autoStart_);
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeBool(5, this.autoScrolling_);
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeMessage(6, this.getStrideSensorCalibSettings());
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeUInt32(7, this.sprintDisplayActivation_);
      }

      if ((this.bitField0_ & 128) == 128) {
         var1.writeEnum(8, this.sportTapButtonSensitivity_);
      }

      if ((this.bitField0_ & 256) == 256) {
         var1.writeMessage(9, this.getSwimmingPool());
      }

      if ((this.bitField0_ & 512) == 512) {
         var1.writeMessage(10, this.getSirius2DisplaySettings());
      }

      if ((this.bitField0_ & 1024) == 1024) {
         var1.writeEnum(11, this.altitudeSetting_);
      }

      if ((this.bitField0_ & 2048) == 2048) {
         var1.writeEnum(12, this.gpsSetting_);
      }

      if ((this.bitField0_ & 4096) == 4096) {
         var1.writeMessage(13, this.getAutoPause());
      }

      if ((this.bitField0_ & 8192) == 8192) {
         var1.writeMessage(14, this.getAutolapSettings());
      }

      if ((this.bitField0_ & 16384) == 16384) {
         var1.writeEnum(15, this.heartRateView_);
      }

      this.unknownFields.writeTo(var1);
   }
}
