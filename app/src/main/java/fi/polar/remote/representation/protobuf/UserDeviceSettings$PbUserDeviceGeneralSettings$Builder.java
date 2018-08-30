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

public final class UserDeviceSettings$PbUserDeviceGeneralSettings$Builder extends Builder implements UserDeviceSettings$PbUserDeviceGeneralSettingsOrBuilder {
   private int backupWatchFace_;
   private int bitField0_;
   private boolean bleConnectModeEnable_;
   private int buttonLockMode_;
   private SingleFieldBuilderV3 buttonSoundVolumeBuilder_;
   private Types$PbVolume buttonSoundVolume_;
   private int deviceLocation_;
   private boolean exeviewInverted_;
   private int flightmode_;
   private int inactivityAlert_;
   private int oBSOLETEHandedness_;
   private int oBSOLETETime2Offset_;
   private int oBSOLETETimeSelection_;
   private int tapButtonSensitivity_;
   private boolean vibrationMode_;
   private int watchFaceColor_;
   private int watchFace_;

   private UserDeviceSettings$PbUserDeviceGeneralSettings$Builder() {
      this.oBSOLETETimeSelection_ = 1;
      this.watchFace_ = 1;
      this.buttonLockMode_ = 1;
      this.buttonSoundVolume_ = null;
      this.oBSOLETEHandedness_ = 1;
      this.tapButtonSensitivity_ = 1;
      this.inactivityAlert_ = 1;
      this.backupWatchFace_ = 1;
      this.flightmode_ = 1;
      this.deviceLocation_ = 0;
      this.maybeForceBuilderInitialization();
   }

   private UserDeviceSettings$PbUserDeviceGeneralSettings$Builder(BuilderParent var1) {
      super(var1);
      this.oBSOLETETimeSelection_ = 1;
      this.watchFace_ = 1;
      this.buttonLockMode_ = 1;
      this.buttonSoundVolume_ = null;
      this.oBSOLETEHandedness_ = 1;
      this.tapButtonSensitivity_ = 1;
      this.inactivityAlert_ = 1;
      this.backupWatchFace_ = 1;
      this.flightmode_ = 1;
      this.deviceLocation_ = 0;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceGeneralSettings$Builder(BuilderParent var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceGeneralSettings$Builder(UserDeviceSettings$1 var1) {
      this();
   }

   private SingleFieldBuilderV3 getButtonSoundVolumeFieldBuilder() {
      if (this.buttonSoundVolumeBuilder_ == null) {
         this.buttonSoundVolumeBuilder_ = new SingleFieldBuilderV3(this.getButtonSoundVolume(), this.getParentForChildren(), this.isClean());
         this.buttonSoundVolume_ = null;
      }

      return this.buttonSoundVolumeBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.a();
   }

   private void maybeForceBuilderInitialization() {
      if (UserDeviceSettings$PbUserDeviceGeneralSettings.b()) {
         this.getButtonSoundVolumeFieldBuilder();
      }

   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserDeviceGeneralSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings build() {
      UserDeviceSettings$PbUserDeviceGeneralSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings buildPartial() {
      byte var1 = 1;
      UserDeviceSettings$PbUserDeviceGeneralSettings var2 = new UserDeviceSettings$PbUserDeviceGeneralSettings(this, (UserDeviceSettings$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      UserDeviceSettings$PbUserDeviceGeneralSettings.a(var2, this.oBSOLETETimeSelection_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      UserDeviceSettings$PbUserDeviceGeneralSettings.b(var2, this.oBSOLETETime2Offset_);
      int var6 = var4;
      if ((var3 & 4) == 4) {
         var6 = var4 | 4;
      }

      UserDeviceSettings$PbUserDeviceGeneralSettings.c(var2, this.watchFace_);
      var4 = var6;
      if ((var3 & 8) == 8) {
         var4 = var6 | 8;
      }

      UserDeviceSettings$PbUserDeviceGeneralSettings.d(var2, this.buttonLockMode_);
      if ((var3 & 16) == 16) {
         var4 |= 16;
      }

      if (this.buttonSoundVolumeBuilder_ == null) {
         UserDeviceSettings$PbUserDeviceGeneralSettings.a(var2, this.buttonSoundVolume_);
      } else {
         UserDeviceSettings$PbUserDeviceGeneralSettings.a(var2, (Types$PbVolume)this.buttonSoundVolumeBuilder_.build());
      }

      var6 = var4;
      if ((var3 & 32) == 32) {
         var6 = var4 | 32;
      }

      UserDeviceSettings$PbUserDeviceGeneralSettings.a(var2, this.vibrationMode_);
      var4 = var6;
      if ((var3 & 64) == 64) {
         var4 = var6 | 64;
      }

      UserDeviceSettings$PbUserDeviceGeneralSettings.e(var2, this.oBSOLETEHandedness_);
      int var5 = var4;
      if ((var3 & 128) == 128) {
         var5 = var4 | 128;
      }

      UserDeviceSettings$PbUserDeviceGeneralSettings.b(var2, this.exeviewInverted_);
      var6 = var5;
      if ((var3 & 256) == 256) {
         var6 = var5 | 256;
      }

      UserDeviceSettings$PbUserDeviceGeneralSettings.f(var2, this.tapButtonSensitivity_);
      var4 = var6;
      if ((var3 & 512) == 512) {
         var4 = var6 | 512;
      }

      UserDeviceSettings$PbUserDeviceGeneralSettings.g(var2, this.inactivityAlert_);
      var6 = var4;
      if ((var3 & 1024) == 1024) {
         var6 = var4 | 1024;
      }

      UserDeviceSettings$PbUserDeviceGeneralSettings.c(var2, this.bleConnectModeEnable_);
      var4 = var6;
      if ((var3 & 2048) == 2048) {
         var4 = var6 | 2048;
      }

      UserDeviceSettings$PbUserDeviceGeneralSettings.h(var2, this.backupWatchFace_);
      var5 = var4;
      if ((var3 & 4096) == 4096) {
         var5 = var4 | 4096;
      }

      UserDeviceSettings$PbUserDeviceGeneralSettings.i(var2, this.flightmode_);
      var6 = var5;
      if ((var3 & 8192) == 8192) {
         var6 = var5 | 8192;
      }

      UserDeviceSettings$PbUserDeviceGeneralSettings.j(var2, this.deviceLocation_);
      var4 = var6;
      if ((var3 & 16384) == 16384) {
         var4 = var6 | 16384;
      }

      UserDeviceSettings$PbUserDeviceGeneralSettings.k(var2, this.watchFaceColor_);
      UserDeviceSettings$PbUserDeviceGeneralSettings.l(var2, var4);
      this.onBuilt();
      return var2;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder clear() {
      super.clear();
      this.oBSOLETETimeSelection_ = 1;
      this.bitField0_ &= -2;
      this.oBSOLETETime2Offset_ = 0;
      this.bitField0_ &= -3;
      this.watchFace_ = 1;
      this.bitField0_ &= -5;
      this.buttonLockMode_ = 1;
      this.bitField0_ &= -9;
      if (this.buttonSoundVolumeBuilder_ == null) {
         this.buttonSoundVolume_ = null;
      } else {
         this.buttonSoundVolumeBuilder_.clear();
      }

      this.bitField0_ &= -17;
      this.vibrationMode_ = false;
      this.bitField0_ &= -33;
      this.oBSOLETEHandedness_ = 1;
      this.bitField0_ &= -65;
      this.exeviewInverted_ = false;
      this.bitField0_ &= -129;
      this.tapButtonSensitivity_ = 1;
      this.bitField0_ &= -257;
      this.inactivityAlert_ = 1;
      this.bitField0_ &= -513;
      this.bleConnectModeEnable_ = false;
      this.bitField0_ &= -1025;
      this.backupWatchFace_ = 1;
      this.bitField0_ &= -2049;
      this.flightmode_ = 1;
      this.bitField0_ &= -4097;
      this.deviceLocation_ = 0;
      this.bitField0_ &= -8193;
      this.watchFaceColor_ = 0;
      this.bitField0_ &= -16385;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder clearBackupWatchFace() {
      this.bitField0_ &= -2049;
      this.backupWatchFace_ = 1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder clearBleConnectModeEnable() {
      this.bitField0_ &= -1025;
      this.bleConnectModeEnable_ = false;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder clearButtonLockMode() {
      this.bitField0_ &= -9;
      this.buttonLockMode_ = 1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder clearButtonSoundVolume() {
      if (this.buttonSoundVolumeBuilder_ == null) {
         this.buttonSoundVolume_ = null;
         this.onChanged();
      } else {
         this.buttonSoundVolumeBuilder_.clear();
      }

      this.bitField0_ &= -17;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder clearDeviceLocation() {
      this.bitField0_ &= -8193;
      this.deviceLocation_ = 0;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder clearExeviewInverted() {
      this.bitField0_ &= -129;
      this.exeviewInverted_ = false;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder clearField(FieldDescriptor var1) {
      return (UserDeviceSettings$PbUserDeviceGeneralSettings$Builder)super.clearField(var1);
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder clearFlightmode() {
      this.bitField0_ &= -4097;
      this.flightmode_ = 1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder clearInactivityAlert() {
      this.bitField0_ &= -513;
      this.inactivityAlert_ = 1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder clearOBSOLETEHandedness() {
      this.bitField0_ &= -65;
      this.oBSOLETEHandedness_ = 1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder clearOBSOLETETime2Offset() {
      this.bitField0_ &= -3;
      this.oBSOLETETime2Offset_ = 0;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder clearOBSOLETETimeSelection() {
      this.bitField0_ &= -2;
      this.oBSOLETETimeSelection_ = 1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder clearOneof(OneofDescriptor var1) {
      return (UserDeviceSettings$PbUserDeviceGeneralSettings$Builder)super.clearOneof(var1);
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder clearTapButtonSensitivity() {
      this.bitField0_ &= -257;
      this.tapButtonSensitivity_ = 1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder clearVibrationMode() {
      this.bitField0_ &= -33;
      this.vibrationMode_ = false;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder clearWatchFace() {
      this.bitField0_ &= -5;
      this.watchFace_ = 1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder clearWatchFaceColor() {
      this.bitField0_ &= -16385;
      this.watchFaceColor_ = 0;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder clone() {
      return (UserDeviceSettings$PbUserDeviceGeneralSettings$Builder)super.clone();
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
      if (this.buttonSoundVolumeBuilder_ == null) {
         if (this.buttonSoundVolume_ == null) {
            var1 = Types$PbVolume.getDefaultInstance();
         } else {
            var1 = this.buttonSoundVolume_;
         }
      } else {
         var1 = (Types$PbVolume)this.buttonSoundVolumeBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbVolume$Builder getButtonSoundVolumeBuilder() {
      this.bitField0_ |= 16;
      this.onChanged();
      return (Types$PbVolume$Builder)this.getButtonSoundVolumeFieldBuilder().getBuilder();
   }

   public Types$PbVolumeOrBuilder getButtonSoundVolumeOrBuilder() {
      Object var1;
      if (this.buttonSoundVolumeBuilder_ != null) {
         var1 = (Types$PbVolumeOrBuilder)this.buttonSoundVolumeBuilder_.getMessageOrBuilder();
      } else if (this.buttonSoundVolume_ == null) {
         var1 = Types$PbVolume.getDefaultInstance();
      } else {
         var1 = this.buttonSoundVolume_;
      }

      return (Types$PbVolumeOrBuilder)var1;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings getDefaultInstanceForType() {
      return UserDeviceSettings$PbUserDeviceGeneralSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return UserDeviceSettings.a();
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

   public UserDeviceSettings$PbUserDeviceGeneralSettings$PbTapButtonSensitivity getTapButtonSensitivity() {
      UserDeviceSettings$PbUserDeviceGeneralSettings$PbTapButtonSensitivity var1 = UserDeviceSettings$PbUserDeviceGeneralSettings$PbTapButtonSensitivity.valueOf(this.tapButtonSensitivity_);
      UserDeviceSettings$PbUserDeviceGeneralSettings$PbTapButtonSensitivity var2 = var1;
      if (var1 == null) {
         var2 = UserDeviceSettings$PbUserDeviceGeneralSettings$PbTapButtonSensitivity.TAP_BUTTON_SENSITIVITY_OFF;
      }

      return var2;
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

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.b().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserDeviceGeneralSettings.class, UserDeviceSettings$PbUserDeviceGeneralSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (this.hasButtonSoundVolume() && !this.getButtonSoundVolume().isInitialized()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder mergeButtonSoundVolume(Types$PbVolume var1) {
      if (this.buttonSoundVolumeBuilder_ == null) {
         if ((this.bitField0_ & 16) == 16 && this.buttonSoundVolume_ != null && this.buttonSoundVolume_ != Types$PbVolume.getDefaultInstance()) {
            this.buttonSoundVolume_ = Types$PbVolume.newBuilder(this.buttonSoundVolume_).mergeFrom(var1).buildPartial();
         } else {
            this.buttonSoundVolume_ = var1;
         }

         this.onChanged();
      } else {
         this.buttonSoundVolumeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      UserDeviceSettings$PbUserDeviceGeneralSettings var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (UserDeviceSettings$PbUserDeviceGeneralSettings)UserDeviceSettings$PbUserDeviceGeneralSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (UserDeviceSettings$PbUserDeviceGeneralSettings)var10.getUnfinishedMessage();
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

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder mergeFrom(Message var1) {
      UserDeviceSettings$PbUserDeviceGeneralSettings$Builder var2;
      if (var1 instanceof UserDeviceSettings$PbUserDeviceGeneralSettings) {
         var2 = this.mergeFrom((UserDeviceSettings$PbUserDeviceGeneralSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder mergeFrom(UserDeviceSettings$PbUserDeviceGeneralSettings var1) {
      if (var1 != UserDeviceSettings$PbUserDeviceGeneralSettings.getDefaultInstance()) {
         if (var1.hasOBSOLETETimeSelection()) {
            this.setOBSOLETETimeSelection(var1.getOBSOLETETimeSelection());
         }

         if (var1.hasOBSOLETETime2Offset()) {
            this.setOBSOLETETime2Offset(var1.getOBSOLETETime2Offset());
         }

         if (var1.hasWatchFace()) {
            this.setWatchFace(var1.getWatchFace());
         }

         if (var1.hasButtonLockMode()) {
            this.setButtonLockMode(var1.getButtonLockMode());
         }

         if (var1.hasButtonSoundVolume()) {
            this.mergeButtonSoundVolume(var1.getButtonSoundVolume());
         }

         if (var1.hasVibrationMode()) {
            this.setVibrationMode(var1.getVibrationMode());
         }

         if (var1.hasOBSOLETEHandedness()) {
            this.setOBSOLETEHandedness(var1.getOBSOLETEHandedness());
         }

         if (var1.hasExeviewInverted()) {
            this.setExeviewInverted(var1.getExeviewInverted());
         }

         if (var1.hasTapButtonSensitivity()) {
            this.setTapButtonSensitivity(var1.getTapButtonSensitivity());
         }

         if (var1.hasInactivityAlert()) {
            this.setInactivityAlert(var1.getInactivityAlert());
         }

         if (var1.hasBleConnectModeEnable()) {
            this.setBleConnectModeEnable(var1.getBleConnectModeEnable());
         }

         if (var1.hasBackupWatchFace()) {
            this.setBackupWatchFace(var1.getBackupWatchFace());
         }

         if (var1.hasFlightmode()) {
            this.setFlightmode(var1.getFlightmode());
         }

         if (var1.hasDeviceLocation()) {
            this.setDeviceLocation(var1.getDeviceLocation());
         }

         if (var1.hasWatchFaceColor()) {
            this.setWatchFaceColor(var1.getWatchFaceColor());
         }

         this.mergeUnknownFields(UserDeviceSettings$PbUserDeviceGeneralSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final UserDeviceSettings$PbUserDeviceGeneralSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserDeviceGeneralSettings$Builder)super.mergeUnknownFields(var1);
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder setBackupWatchFace(UserDeviceSettings$PbUserDeviceGeneralSettings$PbWatchFace var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2048;
         this.backupWatchFace_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder setBleConnectModeEnable(boolean var1) {
      this.bitField0_ |= 1024;
      this.bleConnectModeEnable_ = var1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder setButtonLockMode(UserDeviceSettings$PbUserDeviceGeneralSettings$PbButtonLockMode var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 8;
         this.buttonLockMode_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder setButtonSoundVolume(Types$PbVolume$Builder var1) {
      if (this.buttonSoundVolumeBuilder_ == null) {
         this.buttonSoundVolume_ = var1.build();
         this.onChanged();
      } else {
         this.buttonSoundVolumeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 16;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder setButtonSoundVolume(Types$PbVolume var1) {
      if (this.buttonSoundVolumeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.buttonSoundVolume_ = var1;
         this.onChanged();
      } else {
         this.buttonSoundVolumeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder setDeviceLocation(Types$PbDeviceLocation var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 8192;
         this.deviceLocation_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder setExeviewInverted(boolean var1) {
      this.bitField0_ |= 128;
      this.exeviewInverted_ = var1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserDeviceGeneralSettings$Builder)super.setField(var1, var2);
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder setFlightmode(UserDeviceSettings$PbUserDeviceGeneralSettings$PbFlightMode var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 4096;
         this.flightmode_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder setInactivityAlert(UserDeviceSettings$PbUserDeviceGeneralSettings$PbInactivityAlert var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 512;
         this.inactivityAlert_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder setOBSOLETEHandedness(Types$PbHandedness var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 64;
         this.oBSOLETEHandedness_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder setOBSOLETETime2Offset(int var1) {
      this.bitField0_ |= 2;
      this.oBSOLETETime2Offset_ = var1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder setOBSOLETETimeSelection(Types$PbTimeSelection var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.oBSOLETETimeSelection_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (UserDeviceSettings$PbUserDeviceGeneralSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder setTapButtonSensitivity(UserDeviceSettings$PbUserDeviceGeneralSettings$PbTapButtonSensitivity var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 256;
         this.tapButtonSensitivity_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public final UserDeviceSettings$PbUserDeviceGeneralSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserDeviceGeneralSettings$Builder)super.setUnknownFields(var1);
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder setVibrationMode(boolean var1) {
      this.bitField0_ |= 32;
      this.vibrationMode_ = var1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder setWatchFace(UserDeviceSettings$PbUserDeviceGeneralSettings$PbWatchFace var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 4;
         this.watchFace_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public UserDeviceSettings$PbUserDeviceGeneralSettings$Builder setWatchFaceColor(int var1) {
      this.bitField0_ |= 16384;
      this.watchFaceColor_ = var1;
      this.onChanged();
      return this;
   }
}
