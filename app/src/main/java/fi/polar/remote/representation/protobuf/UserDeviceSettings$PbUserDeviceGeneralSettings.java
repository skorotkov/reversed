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

public final class UserDeviceSettings$PbUserDeviceGeneralSettings extends GeneratedMessageV3 implements UserDeviceSettings$PbUserDeviceGeneralSettingsOrBuilder {
   public static final int BACKUP_WATCH_FACE_FIELD_NUMBER = 13;
   public static final int BLE_CONNECT_MODE_ENABLE_FIELD_NUMBER = 12;
   public static final int BUTTON_LOCK_MODE_FIELD_NUMBER = 4;
   public static final int BUTTON_SOUND_VOLUME_FIELD_NUMBER = 5;
   private static final UserDeviceSettings$PbUserDeviceGeneralSettings DEFAULT_INSTANCE = new UserDeviceSettings$PbUserDeviceGeneralSettings();
   public static final int DEVICE_LOCATION_FIELD_NUMBER = 15;
   public static final int EXEVIEW_INVERTED_FIELD_NUMBER = 9;
   public static final int FLIGHTMODE_FIELD_NUMBER = 14;
   public static final int INACTIVITY_ALERT_FIELD_NUMBER = 11;
   public static final int OBSOLETE_HANDEDNESS_FIELD_NUMBER = 8;
   public static final int OBSOLETE_TIME2_OFFSET_FIELD_NUMBER = 2;
   public static final int OBSOLETE_TIME_SELECTION_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new UserDeviceSettings$PbUserDeviceGeneralSettings$1();
   public static final int TAP_BUTTON_SENSITIVITY_FIELD_NUMBER = 10;
   public static final int VIBRATION_MODE_FIELD_NUMBER = 7;
   public static final int WATCH_FACE_COLOR_FIELD_NUMBER = 16;
   public static final int WATCH_FACE_FIELD_NUMBER = 3;
   private static final long serialVersionUID = 0L;
   private int backupWatchFace_;
   private int bitField0_;
   private boolean bleConnectModeEnable_;
   private int buttonLockMode_;
   private Types$PbVolume buttonSoundVolume_;
   private int deviceLocation_;
   private boolean exeviewInverted_;
   private int flightmode_;
   private int inactivityAlert_;
   private byte memoizedIsInitialized;
   private int oBSOLETEHandedness_;
   private int oBSOLETETime2Offset_;
   private int oBSOLETETimeSelection_;
   private int tapButtonSensitivity_;
   private boolean vibrationMode_;
   private int watchFaceColor_;
   private int watchFace_;

   private UserDeviceSettings$PbUserDeviceGeneralSettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.oBSOLETETimeSelection_ = 1;
      this.oBSOLETETime2Offset_ = 0;
      this.watchFace_ = 1;
      this.buttonLockMode_ = 1;
      this.vibrationMode_ = false;
      this.oBSOLETEHandedness_ = 1;
      this.exeviewInverted_ = false;
      this.tapButtonSensitivity_ = 1;
      this.inactivityAlert_ = 1;
      this.bleConnectModeEnable_ = false;
      this.backupWatchFace_ = 1;
      this.flightmode_ = 1;
      this.deviceLocation_ = 0;
      this.watchFaceColor_ = 0;
   }

   private UserDeviceSettings$PbUserDeviceGeneralSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceGeneralSettings(CodedInputStream var1, ExtensionRegistryLite var2, UserDeviceSettings$1 var3) {
      this(var1, var2);
   }

   private UserDeviceSettings$PbUserDeviceGeneralSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceGeneralSettings(Builder var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(UserDeviceSettings$PbUserDeviceGeneralSettings var0, int var1) {
      var0.oBSOLETETimeSelection_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(UserDeviceSettings$PbUserDeviceGeneralSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbVolume a(UserDeviceSettings$PbUserDeviceGeneralSettings var0, Types$PbVolume var1) {
      var0.buttonSoundVolume_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean a(UserDeviceSettings$PbUserDeviceGeneralSettings var0, boolean var1) {
      var0.vibrationMode_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(UserDeviceSettings$PbUserDeviceGeneralSettings var0, int var1) {
      var0.oBSOLETETime2Offset_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static boolean b(UserDeviceSettings$PbUserDeviceGeneralSettings var0, boolean var1) {
      var0.exeviewInverted_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int c(UserDeviceSettings$PbUserDeviceGeneralSettings var0, int var1) {
      var0.watchFace_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean c(UserDeviceSettings$PbUserDeviceGeneralSettings var0, boolean var1) {
      var0.bleConnectModeEnable_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int d(UserDeviceSettings$PbUserDeviceGeneralSettings var0, int var1) {
      var0.buttonLockMode_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int e(UserDeviceSettings$PbUserDeviceGeneralSettings var0, int var1) {
      var0.oBSOLETEHandedness_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int f(UserDeviceSettings$PbUserDeviceGeneralSettings var0, int var1) {
      var0.tapButtonSensitivity_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int g(UserDeviceSettings$PbUserDeviceGeneralSettings var0, int var1) {
      var0.inactivityAlert_ = var1;
      return var1;
   }

   public static UserDeviceSettings$PbUserDeviceGeneralSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.a();
   }

   // $FF: synthetic method
   static int h(UserDeviceSettings$PbUserDeviceGeneralSettings var0, int var1) {
      var0.backupWatchFace_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int i(UserDeviceSettings$PbUserDeviceGeneralSettings var0, int var1) {
      var0.flightmode_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int j(UserDeviceSettings$PbUserDeviceGeneralSettings var0, int var1) {
      var0.deviceLocation_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int k(UserDeviceSettings$PbUserDeviceGeneralSettings var0, int var1) {
      var0.watchFaceColor_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int l(UserDeviceSettings$PbUserDeviceGeneralSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static UserDeviceSettings$PbUserDeviceGeneralSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UserDeviceSettings$PbUserDeviceGeneralSettings$Builder newBuilder(UserDeviceSettings$PbUserDeviceGeneralSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceGeneralSettings parseDelimitedFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserDeviceGeneralSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceGeneralSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceGeneralSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceGeneralSettings parseFrom(ByteString var0) {
      return (UserDeviceSettings$PbUserDeviceGeneralSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceGeneralSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceGeneralSettings)PARSER.parseFrom(var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceGeneralSettings parseFrom(CodedInputStream var0) {
      return (UserDeviceSettings$PbUserDeviceGeneralSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceGeneralSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceGeneralSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceGeneralSettings parseFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserDeviceGeneralSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceGeneralSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceGeneralSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceGeneralSettings parseFrom(byte[] var0) {
      return (UserDeviceSettings$PbUserDeviceGeneralSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceGeneralSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceGeneralSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof UserDeviceSettings$PbUserDeviceGeneralSettings)) {
            var2 = super.equals(var1);
         } else {
            UserDeviceSettings$PbUserDeviceGeneralSettings var5 = (UserDeviceSettings$PbUserDeviceGeneralSettings)var1;
            boolean var3;
            if (this.hasOBSOLETETimeSelection() == var5.hasOBSOLETETimeSelection()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasOBSOLETETimeSelection()) {
               if (var3 && this.oBSOLETETimeSelection_ == var5.oBSOLETETimeSelection_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasOBSOLETETime2Offset() == var5.hasOBSOLETETime2Offset()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasOBSOLETETime2Offset()) {
               if (var3 && this.getOBSOLETETime2Offset() == var5.getOBSOLETETime2Offset()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasWatchFace() == var5.hasWatchFace()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasWatchFace()) {
               if (var4 && this.watchFace_ == var5.watchFace_) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasButtonLockMode() == var5.hasButtonLockMode()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasButtonLockMode()) {
               if (var4 && this.buttonLockMode_ == var5.buttonLockMode_) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasButtonSoundVolume() == var5.hasButtonSoundVolume()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasButtonSoundVolume()) {
               if (var3 && this.getButtonSoundVolume().equals(var5.getButtonSoundVolume())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasVibrationMode() == var5.hasVibrationMode()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasVibrationMode()) {
               if (var4 && this.getVibrationMode() == var5.getVibrationMode()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasOBSOLETEHandedness() == var5.hasOBSOLETEHandedness()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasOBSOLETEHandedness()) {
               if (var4 && this.oBSOLETEHandedness_ == var5.oBSOLETEHandedness_) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasExeviewInverted() == var5.hasExeviewInverted()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasExeviewInverted()) {
               if (var3 && this.getExeviewInverted() == var5.getExeviewInverted()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTapButtonSensitivity() == var5.hasTapButtonSensitivity()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasTapButtonSensitivity()) {
               if (var4 && this.tapButtonSensitivity_ == var5.tapButtonSensitivity_) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasInactivityAlert() == var5.hasInactivityAlert()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasInactivityAlert()) {
               if (var4 && this.inactivityAlert_ == var5.inactivityAlert_) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasBleConnectModeEnable() == var5.hasBleConnectModeEnable()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasBleConnectModeEnable()) {
               if (var3 && this.getBleConnectModeEnable() == var5.getBleConnectModeEnable()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasBackupWatchFace() == var5.hasBackupWatchFace()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasBackupWatchFace()) {
               if (var4 && this.backupWatchFace_ == var5.backupWatchFace_) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasFlightmode() == var5.hasFlightmode()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasFlightmode()) {
               if (var4 && this.flightmode_ == var5.flightmode_) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasDeviceLocation() == var5.hasDeviceLocation()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasDeviceLocation()) {
               if (var3 && this.deviceLocation_ == var5.deviceLocation_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasWatchFaceColor() == var5.hasWatchFaceColor()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasWatchFaceColor()) {
               if (var3 && this.getWatchFaceColor() == var5.getWatchFaceColor()) {
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

   public UserDeviceSettings$PbUserDeviceGeneralSettings$PbWatchFace getBackupWatchFace() {
      UserDeviceSettings$PbUserDeviceGeneralSettings$PbWatchFace var1 = UserDeviceSettings$PbUserDeviceGeneralSettings$PbWatchFace.valueOf(this.backupWatchFace_);
      UserDeviceSettings$PbUserDeviceGeneralSettings$PbWatchFace var2 = var1;
      if (var1 == null) {
         var2 = UserDeviceSettings$PbUserDeviceGeneralSettings$PbWatchFace.BASIC;
      }

      return var2;
   }

   public boolean getBleConnectModeEnable() {
      return this.bleConnectModeEnable_;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$PbButtonLockMode getButtonLockMode() {
      UserDeviceSettings$PbUserDeviceGeneralSettings$PbButtonLockMode var1 = UserDeviceSettings$PbUserDeviceGeneralSettings$PbButtonLockMode.valueOf(this.buttonLockMode_);
      UserDeviceSettings$PbUserDeviceGeneralSettings$PbButtonLockMode var2 = var1;
      if (var1 == null) {
         var2 = UserDeviceSettings$PbUserDeviceGeneralSettings$PbButtonLockMode.MANUAL;
      }

      return var2;
   }

   public Types$PbVolume getButtonSoundVolume() {
      Types$PbVolume var1;
      if (this.buttonSoundVolume_ == null) {
         var1 = Types$PbVolume.getDefaultInstance();
      } else {
         var1 = this.buttonSoundVolume_;
      }

      return var1;
   }

   public Types$PbVolumeOrBuilder getButtonSoundVolumeOrBuilder() {
      Types$PbVolume var1;
      if (this.buttonSoundVolume_ == null) {
         var1 = Types$PbVolume.getDefaultInstance();
      } else {
         var1 = this.buttonSoundVolume_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Types$PbDeviceLocation getDeviceLocation() {
      Types$PbDeviceLocation var1 = Types$PbDeviceLocation.valueOf(this.deviceLocation_);
      Types$PbDeviceLocation var2 = var1;
      if (var1 == null) {
         var2 = Types$PbDeviceLocation.DEVICE_LOCATION_UNDEFINED;
      }

      return var2;
   }

   public boolean getExeviewInverted() {
      return this.exeviewInverted_;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$PbFlightMode getFlightmode() {
      UserDeviceSettings$PbUserDeviceGeneralSettings$PbFlightMode var1 = UserDeviceSettings$PbUserDeviceGeneralSettings$PbFlightMode.valueOf(this.flightmode_);
      UserDeviceSettings$PbUserDeviceGeneralSettings$PbFlightMode var2 = var1;
      if (var1 == null) {
         var2 = UserDeviceSettings$PbUserDeviceGeneralSettings$PbFlightMode.FLIGHTMODE_OFF;
      }

      return var2;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$PbInactivityAlert getInactivityAlert() {
      UserDeviceSettings$PbUserDeviceGeneralSettings$PbInactivityAlert var1 = UserDeviceSettings$PbUserDeviceGeneralSettings$PbInactivityAlert.valueOf(this.inactivityAlert_);
      UserDeviceSettings$PbUserDeviceGeneralSettings$PbInactivityAlert var2 = var1;
      if (var1 == null) {
         var2 = UserDeviceSettings$PbUserDeviceGeneralSettings$PbInactivityAlert.INACTIVITY_ALERT_OFF;
      }

      return var2;
   }

   public Types$PbHandedness getOBSOLETEHandedness() {
      Types$PbHandedness var1 = Types$PbHandedness.valueOf(this.oBSOLETEHandedness_);
      Types$PbHandedness var2 = var1;
      if (var1 == null) {
         var2 = Types$PbHandedness.WU_IN_LEFT_HAND;
      }

      return var2;
   }

   public int getOBSOLETETime2Offset() {
      return this.oBSOLETETime2Offset_;
   }

   public Types$PbTimeSelection getOBSOLETETimeSelection() {
      Types$PbTimeSelection var1 = Types$PbTimeSelection.valueOf(this.oBSOLETETimeSelection_);
      Types$PbTimeSelection var2 = var1;
      if (var1 == null) {
         var2 = Types$PbTimeSelection.TIME_1;
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
            var2 = 0 + CodedOutputStream.computeEnumSize(1, this.oBSOLETETimeSelection_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeInt32Size(2, this.oBSOLETETime2Offset_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeEnumSize(3, this.watchFace_);
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeEnumSize(4, this.buttonLockMode_);
         }

         var2 = var1;
         if ((this.bitField0_ & 16) == 16) {
            var2 = var1 + CodedOutputStream.computeMessageSize(5, this.getButtonSoundVolume());
         }

         var1 = var2;
         if ((this.bitField0_ & 32) == 32) {
            var1 = var2 + CodedOutputStream.computeBoolSize(7, this.vibrationMode_);
         }

         var2 = var1;
         if ((this.bitField0_ & 64) == 64) {
            var2 = var1 + CodedOutputStream.computeEnumSize(8, this.oBSOLETEHandedness_);
         }

         var1 = var2;
         if ((this.bitField0_ & 128) == 128) {
            var1 = var2 + CodedOutputStream.computeBoolSize(9, this.exeviewInverted_);
         }

         var2 = var1;
         if ((this.bitField0_ & 256) == 256) {
            var2 = var1 + CodedOutputStream.computeEnumSize(10, this.tapButtonSensitivity_);
         }

         var1 = var2;
         if ((this.bitField0_ & 512) == 512) {
            var1 = var2 + CodedOutputStream.computeEnumSize(11, this.inactivityAlert_);
         }

         var2 = var1;
         if ((this.bitField0_ & 1024) == 1024) {
            var2 = var1 + CodedOutputStream.computeBoolSize(12, this.bleConnectModeEnable_);
         }

         int var3 = var2;
         if ((this.bitField0_ & 2048) == 2048) {
            var3 = var2 + CodedOutputStream.computeEnumSize(13, this.backupWatchFace_);
         }

         var1 = var3;
         if ((this.bitField0_ & 4096) == 4096) {
            var1 = var3 + CodedOutputStream.computeEnumSize(14, this.flightmode_);
         }

         var2 = var1;
         if ((this.bitField0_ & 8192) == 8192) {
            var2 = var1 + CodedOutputStream.computeEnumSize(15, this.deviceLocation_);
         }

         var1 = var2;
         if ((this.bitField0_ & 16384) == 16384) {
            var1 = var2 + CodedOutputStream.computeUInt32Size(16, this.watchFaceColor_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$PbTapButtonSensitivity getTapButtonSensitivity() {
      UserDeviceSettings$PbUserDeviceGeneralSettings$PbTapButtonSensitivity var1 = UserDeviceSettings$PbUserDeviceGeneralSettings$PbTapButtonSensitivity.valueOf(this.tapButtonSensitivity_);
      UserDeviceSettings$PbUserDeviceGeneralSettings$PbTapButtonSensitivity var2 = var1;
      if (var1 == null) {
         var2 = UserDeviceSettings$PbUserDeviceGeneralSettings$PbTapButtonSensitivity.TAP_BUTTON_SENSITIVITY_OFF;
      }

      return var2;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean getVibrationMode() {
      return this.vibrationMode_;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$PbWatchFace getWatchFace() {
      UserDeviceSettings$PbUserDeviceGeneralSettings$PbWatchFace var1 = UserDeviceSettings$PbUserDeviceGeneralSettings$PbWatchFace.valueOf(this.watchFace_);
      UserDeviceSettings$PbUserDeviceGeneralSettings$PbWatchFace var2 = var1;
      if (var1 == null) {
         var2 = UserDeviceSettings$PbUserDeviceGeneralSettings$PbWatchFace.BASIC;
      }

      return var2;
   }

   public int getWatchFaceColor() {
      return this.watchFaceColor_;
   }

   public boolean hasBackupWatchFace() {
      boolean var1;
      if ((this.bitField0_ & 2048) == 2048) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasBleConnectModeEnable() {
      boolean var1;
      if ((this.bitField0_ & 1024) == 1024) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasButtonLockMode() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasButtonSoundVolume() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDeviceLocation() {
      boolean var1;
      if ((this.bitField0_ & 8192) == 8192) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasExeviewInverted() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasFlightmode() {
      boolean var1;
      if ((this.bitField0_ & 4096) == 4096) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasInactivityAlert() {
      boolean var1;
      if ((this.bitField0_ & 512) == 512) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasOBSOLETEHandedness() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasOBSOLETETime2Offset() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasOBSOLETETimeSelection() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTapButtonSensitivity() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasVibrationMode() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasWatchFace() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasWatchFaceColor() {
      boolean var1;
      if ((this.bitField0_ & 16384) == 16384) {
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
         if (this.hasOBSOLETETimeSelection()) {
            var2 = (var1 * 37 + 1) * 53 + this.oBSOLETETimeSelection_;
         }

         var1 = var2;
         if (this.hasOBSOLETETime2Offset()) {
            var1 = (var2 * 37 + 2) * 53 + this.getOBSOLETETime2Offset();
         }

         var2 = var1;
         if (this.hasWatchFace()) {
            var2 = (var1 * 37 + 3) * 53 + this.watchFace_;
         }

         int var3 = var2;
         if (this.hasButtonLockMode()) {
            var3 = (var2 * 37 + 4) * 53 + this.buttonLockMode_;
         }

         var1 = var3;
         if (this.hasButtonSoundVolume()) {
            var1 = (var3 * 37 + 5) * 53 + this.getButtonSoundVolume().hashCode();
         }

         var2 = var1;
         if (this.hasVibrationMode()) {
            var2 = (var1 * 37 + 7) * 53 + Internal.hashBoolean(this.getVibrationMode());
         }

         var1 = var2;
         if (this.hasOBSOLETEHandedness()) {
            var1 = (var2 * 37 + 8) * 53 + this.oBSOLETEHandedness_;
         }

         var2 = var1;
         if (this.hasExeviewInverted()) {
            var2 = (var1 * 37 + 9) * 53 + Internal.hashBoolean(this.getExeviewInverted());
         }

         var1 = var2;
         if (this.hasTapButtonSensitivity()) {
            var1 = (var2 * 37 + 10) * 53 + this.tapButtonSensitivity_;
         }

         var3 = var1;
         if (this.hasInactivityAlert()) {
            var3 = (var1 * 37 + 11) * 53 + this.inactivityAlert_;
         }

         var2 = var3;
         if (this.hasBleConnectModeEnable()) {
            var2 = (var3 * 37 + 12) * 53 + Internal.hashBoolean(this.getBleConnectModeEnable());
         }

         var1 = var2;
         if (this.hasBackupWatchFace()) {
            var1 = (var2 * 37 + 13) * 53 + this.backupWatchFace_;
         }

         var2 = var1;
         if (this.hasFlightmode()) {
            var2 = (var1 * 37 + 14) * 53 + this.flightmode_;
         }

         var1 = var2;
         if (this.hasDeviceLocation()) {
            var1 = (var2 * 37 + 15) * 53 + this.deviceLocation_;
         }

         var2 = var1;
         if (this.hasWatchFaceColor()) {
            var2 = (var1 * 37 + 16) * 53 + this.getWatchFaceColor();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.b().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserDeviceGeneralSettings.class, UserDeviceSettings$PbUserDeviceGeneralSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (this.hasButtonSoundVolume() && !this.getButtonSoundVolume().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected UserDeviceSettings$PbUserDeviceGeneralSettings$Builder newBuilderForType(BuilderParent var1) {
      return new UserDeviceSettings$PbUserDeviceGeneralSettings$Builder(var1, (UserDeviceSettings$1)null);
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder toBuilder() {
      UserDeviceSettings$PbUserDeviceGeneralSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new UserDeviceSettings$PbUserDeviceGeneralSettings$Builder((UserDeviceSettings$1)null);
      } else {
         var1 = (new UserDeviceSettings$PbUserDeviceGeneralSettings$Builder((UserDeviceSettings$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.oBSOLETETimeSelection_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeInt32(2, this.oBSOLETETime2Offset_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeEnum(3, this.watchFace_);
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeEnum(4, this.buttonLockMode_);
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeMessage(5, this.getButtonSoundVolume());
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeBool(7, this.vibrationMode_);
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeEnum(8, this.oBSOLETEHandedness_);
      }

      if ((this.bitField0_ & 128) == 128) {
         var1.writeBool(9, this.exeviewInverted_);
      }

      if ((this.bitField0_ & 256) == 256) {
         var1.writeEnum(10, this.tapButtonSensitivity_);
      }

      if ((this.bitField0_ & 512) == 512) {
         var1.writeEnum(11, this.inactivityAlert_);
      }

      if ((this.bitField0_ & 1024) == 1024) {
         var1.writeBool(12, this.bleConnectModeEnable_);
      }

      if ((this.bitField0_ & 2048) == 2048) {
         var1.writeEnum(13, this.backupWatchFace_);
      }

      if ((this.bitField0_ & 4096) == 4096) {
         var1.writeEnum(14, this.flightmode_);
      }

      if ((this.bitField0_ & 8192) == 8192) {
         var1.writeEnum(15, this.deviceLocation_);
      }

      if ((this.bitField0_ & 16384) == 16384) {
         var1.writeUInt32(16, this.watchFaceColor_);
      }

      this.unknownFields.writeTo(var1);
   }
}
