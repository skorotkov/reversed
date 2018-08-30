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

public final class SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder extends Builder implements SportprofileGuitarSettings$PbGuitarSportProfileSettingsOrBuilder {
   private int altitudeSetting_;
   private SingleFieldBuilderV3 autoPauseBuilder_;
   private Types$PbAutoPause autoPause_;
   private boolean autoScrolling_;
   private boolean autoStart_;
   private SingleFieldBuilderV3 autolapSettingsBuilder_;
   private Types$PbAutoLapSettings autolapSettings_;
   private int bitField0_;
   private int gpsSetting_;
   private int heartRateView_;
   private int heartTouch_;
   private SingleFieldBuilderV3 sirius2DisplaySettingsBuilder_;
   private SportprofileDisplays$PbSirius2DisplaySettings sirius2DisplaySettings_;
   private int sportTapButtonSensitivity_;
   private int sprintDisplayActivation_;
   private SingleFieldBuilderV3 strideSensorCalibSettingsBuilder_;
   private Types$PbStrideSensorCalibSettings strideSensorCalibSettings_;
   private SingleFieldBuilderV3 swimmingPoolBuilder_;
   private Structures$PbSwimmingPoolInfo swimmingPool_;
   private int tapButtonAction_;
   private boolean vibration_;

   private SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder() {
      this.heartTouch_ = 1;
      this.tapButtonAction_ = 1;
      this.strideSensorCalibSettings_ = null;
      this.sportTapButtonSensitivity_ = 3;
      this.swimmingPool_ = null;
      this.sirius2DisplaySettings_ = null;
      this.altitudeSetting_ = 0;
      this.gpsSetting_ = 0;
      this.autoPause_ = null;
      this.autolapSettings_ = null;
      this.heartRateView_ = 1;
      this.maybeForceBuilderInitialization();
   }

   private SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder(BuilderParent var1) {
      super(var1);
      this.heartTouch_ = 1;
      this.tapButtonAction_ = 1;
      this.strideSensorCalibSettings_ = null;
      this.sportTapButtonSensitivity_ = 3;
      this.swimmingPool_ = null;
      this.sirius2DisplaySettings_ = null;
      this.altitudeSetting_ = 0;
      this.gpsSetting_ = 0;
      this.autoPause_ = null;
      this.autolapSettings_ = null;
      this.heartRateView_ = 1;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder(BuilderParent var1, SportprofileGuitarSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder(SportprofileGuitarSettings$1 var1) {
      this();
   }

   private SingleFieldBuilderV3 getAutoPauseFieldBuilder() {
      if (this.autoPauseBuilder_ == null) {
         this.autoPauseBuilder_ = new SingleFieldBuilderV3(this.getAutoPause(), this.getParentForChildren(), this.isClean());
         this.autoPause_ = null;
      }

      return this.autoPauseBuilder_;
   }

   private SingleFieldBuilderV3 getAutolapSettingsFieldBuilder() {
      if (this.autolapSettingsBuilder_ == null) {
         this.autolapSettingsBuilder_ = new SingleFieldBuilderV3(this.getAutolapSettings(), this.getParentForChildren(), this.isClean());
         this.autolapSettings_ = null;
      }

      return this.autolapSettingsBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return SportprofileGuitarSettings.a();
   }

   private SingleFieldBuilderV3 getSirius2DisplaySettingsFieldBuilder() {
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         this.sirius2DisplaySettingsBuilder_ = new SingleFieldBuilderV3(this.getSirius2DisplaySettings(), this.getParentForChildren(), this.isClean());
         this.sirius2DisplaySettings_ = null;
      }

      return this.sirius2DisplaySettingsBuilder_;
   }

   private SingleFieldBuilderV3 getStrideSensorCalibSettingsFieldBuilder() {
      if (this.strideSensorCalibSettingsBuilder_ == null) {
         this.strideSensorCalibSettingsBuilder_ = new SingleFieldBuilderV3(this.getStrideSensorCalibSettings(), this.getParentForChildren(), this.isClean());
         this.strideSensorCalibSettings_ = null;
      }

      return this.strideSensorCalibSettingsBuilder_;
   }

   private SingleFieldBuilderV3 getSwimmingPoolFieldBuilder() {
      if (this.swimmingPoolBuilder_ == null) {
         this.swimmingPoolBuilder_ = new SingleFieldBuilderV3(this.getSwimmingPool(), this.getParentForChildren(), this.isClean());
         this.swimmingPool_ = null;
      }

      return this.swimmingPoolBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (SportprofileGuitarSettings$PbGuitarSportProfileSettings.b()) {
         this.getStrideSensorCalibSettingsFieldBuilder();
         this.getSwimmingPoolFieldBuilder();
         this.getSirius2DisplaySettingsFieldBuilder();
         this.getAutoPauseFieldBuilder();
         this.getAutolapSettingsFieldBuilder();
      }

   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings build() {
      SportprofileGuitarSettings$PbGuitarSportProfileSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings buildPartial() {
      byte var1 = 1;
      SportprofileGuitarSettings$PbGuitarSportProfileSettings var2 = new SportprofileGuitarSettings$PbGuitarSportProfileSettings(this, (SportprofileGuitarSettings$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      SportprofileGuitarSettings$PbGuitarSportProfileSettings.a(var2, this.heartTouch_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      SportprofileGuitarSettings$PbGuitarSportProfileSettings.b(var2, this.tapButtonAction_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      SportprofileGuitarSettings$PbGuitarSportProfileSettings.a(var2, this.vibration_);
      var4 = var5;
      if ((var3 & 8) == 8) {
         var4 = var5 | 8;
      }

      SportprofileGuitarSettings$PbGuitarSportProfileSettings.b(var2, this.autoStart_);
      var5 = var4;
      if ((var3 & 16) == 16) {
         var5 = var4 | 16;
      }

      SportprofileGuitarSettings$PbGuitarSportProfileSettings.c(var2, this.autoScrolling_);
      if ((var3 & 32) == 32) {
         var4 = var5 | 32;
      } else {
         var4 = var5;
      }

      if (this.strideSensorCalibSettingsBuilder_ == null) {
         SportprofileGuitarSettings$PbGuitarSportProfileSettings.a(var2, this.strideSensorCalibSettings_);
      } else {
         SportprofileGuitarSettings$PbGuitarSportProfileSettings.a(var2, (Types$PbStrideSensorCalibSettings)this.strideSensorCalibSettingsBuilder_.build());
      }

      var5 = var4;
      if ((var3 & 64) == 64) {
         var5 = var4 | 64;
      }

      SportprofileGuitarSettings$PbGuitarSportProfileSettings.c(var2, this.sprintDisplayActivation_);
      var4 = var5;
      if ((var3 & 128) == 128) {
         var4 = var5 | 128;
      }

      SportprofileGuitarSettings$PbGuitarSportProfileSettings.d(var2, this.sportTapButtonSensitivity_);
      var5 = var4;
      if ((var3 & 256) == 256) {
         var5 = var4 | 256;
      }

      if (this.swimmingPoolBuilder_ == null) {
         SportprofileGuitarSettings$PbGuitarSportProfileSettings.a(var2, this.swimmingPool_);
      } else {
         SportprofileGuitarSettings$PbGuitarSportProfileSettings.a(var2, (Structures$PbSwimmingPoolInfo)this.swimmingPoolBuilder_.build());
      }

      var4 = var5;
      if ((var3 & 512) == 512) {
         var4 = var5 | 512;
      }

      if (this.sirius2DisplaySettingsBuilder_ == null) {
         SportprofileGuitarSettings$PbGuitarSportProfileSettings.a(var2, this.sirius2DisplaySettings_);
      } else {
         SportprofileGuitarSettings$PbGuitarSportProfileSettings.a(var2, (SportprofileDisplays$PbSirius2DisplaySettings)this.sirius2DisplaySettingsBuilder_.build());
      }

      var5 = var4;
      if ((var3 & 1024) == 1024) {
         var5 = var4 | 1024;
      }

      SportprofileGuitarSettings$PbGuitarSportProfileSettings.e(var2, this.altitudeSetting_);
      var4 = var5;
      if ((var3 & 2048) == 2048) {
         var4 = var5 | 2048;
      }

      SportprofileGuitarSettings$PbGuitarSportProfileSettings.f(var2, this.gpsSetting_);
      var5 = var4;
      if ((var3 & 4096) == 4096) {
         var5 = var4 | 4096;
      }

      if (this.autoPauseBuilder_ == null) {
         SportprofileGuitarSettings$PbGuitarSportProfileSettings.a(var2, this.autoPause_);
      } else {
         SportprofileGuitarSettings$PbGuitarSportProfileSettings.a(var2, (Types$PbAutoPause)this.autoPauseBuilder_.build());
      }

      var4 = var5;
      if ((var3 & 8192) == 8192) {
         var4 = var5 | 8192;
      }

      if (this.autolapSettingsBuilder_ == null) {
         SportprofileGuitarSettings$PbGuitarSportProfileSettings.a(var2, this.autolapSettings_);
      } else {
         SportprofileGuitarSettings$PbGuitarSportProfileSettings.a(var2, (Types$PbAutoLapSettings)this.autolapSettingsBuilder_.build());
      }

      var5 = var4;
      if ((var3 & 16384) == 16384) {
         var5 = var4 | 16384;
      }

      SportprofileGuitarSettings$PbGuitarSportProfileSettings.g(var2, this.heartRateView_);
      SportprofileGuitarSettings$PbGuitarSportProfileSettings.h(var2, var5);
      this.onBuilt();
      return var2;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder clear() {
      super.clear();
      this.heartTouch_ = 1;
      this.bitField0_ &= -2;
      this.tapButtonAction_ = 1;
      this.bitField0_ &= -3;
      this.vibration_ = false;
      this.bitField0_ &= -5;
      this.autoStart_ = false;
      this.bitField0_ &= -9;
      this.autoScrolling_ = false;
      this.bitField0_ &= -17;
      if (this.strideSensorCalibSettingsBuilder_ == null) {
         this.strideSensorCalibSettings_ = null;
      } else {
         this.strideSensorCalibSettingsBuilder_.clear();
      }

      this.bitField0_ &= -33;
      this.sprintDisplayActivation_ = 0;
      this.bitField0_ &= -65;
      this.sportTapButtonSensitivity_ = 3;
      this.bitField0_ &= -129;
      if (this.swimmingPoolBuilder_ == null) {
         this.swimmingPool_ = null;
      } else {
         this.swimmingPoolBuilder_.clear();
      }

      this.bitField0_ &= -257;
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         this.sirius2DisplaySettings_ = null;
      } else {
         this.sirius2DisplaySettingsBuilder_.clear();
      }

      this.bitField0_ &= -513;
      this.altitudeSetting_ = 0;
      this.bitField0_ &= -1025;
      this.gpsSetting_ = 0;
      this.bitField0_ &= -2049;
      if (this.autoPauseBuilder_ == null) {
         this.autoPause_ = null;
      } else {
         this.autoPauseBuilder_.clear();
      }

      this.bitField0_ &= -4097;
      if (this.autolapSettingsBuilder_ == null) {
         this.autolapSettings_ = null;
      } else {
         this.autolapSettingsBuilder_.clear();
      }

      this.bitField0_ &= -8193;
      this.heartRateView_ = 1;
      this.bitField0_ &= -16385;
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder clearAltitudeSetting() {
      this.bitField0_ &= -1025;
      this.altitudeSetting_ = 0;
      this.onChanged();
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder clearAutoPause() {
      if (this.autoPauseBuilder_ == null) {
         this.autoPause_ = null;
         this.onChanged();
      } else {
         this.autoPauseBuilder_.clear();
      }

      this.bitField0_ &= -4097;
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder clearAutoScrolling() {
      this.bitField0_ &= -17;
      this.autoScrolling_ = false;
      this.onChanged();
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder clearAutoStart() {
      this.bitField0_ &= -9;
      this.autoStart_ = false;
      this.onChanged();
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder clearAutolapSettings() {
      if (this.autolapSettingsBuilder_ == null) {
         this.autolapSettings_ = null;
         this.onChanged();
      } else {
         this.autolapSettingsBuilder_.clear();
      }

      this.bitField0_ &= -8193;
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder clearField(FieldDescriptor var1) {
      return (SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder)super.clearField(var1);
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder clearGpsSetting() {
      this.bitField0_ &= -2049;
      this.gpsSetting_ = 0;
      this.onChanged();
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder clearHeartRateView() {
      this.bitField0_ &= -16385;
      this.heartRateView_ = 1;
      this.onChanged();
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder clearHeartTouch() {
      this.bitField0_ &= -2;
      this.heartTouch_ = 1;
      this.onChanged();
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder clearOneof(OneofDescriptor var1) {
      return (SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder)super.clearOneof(var1);
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder clearSirius2DisplaySettings() {
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         this.sirius2DisplaySettings_ = null;
         this.onChanged();
      } else {
         this.sirius2DisplaySettingsBuilder_.clear();
      }

      this.bitField0_ &= -513;
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder clearSportTapButtonSensitivity() {
      this.bitField0_ &= -129;
      this.sportTapButtonSensitivity_ = 3;
      this.onChanged();
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder clearSprintDisplayActivation() {
      this.bitField0_ &= -65;
      this.sprintDisplayActivation_ = 0;
      this.onChanged();
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder clearStrideSensorCalibSettings() {
      if (this.strideSensorCalibSettingsBuilder_ == null) {
         this.strideSensorCalibSettings_ = null;
         this.onChanged();
      } else {
         this.strideSensorCalibSettingsBuilder_.clear();
      }

      this.bitField0_ &= -33;
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder clearSwimmingPool() {
      if (this.swimmingPoolBuilder_ == null) {
         this.swimmingPool_ = null;
         this.onChanged();
      } else {
         this.swimmingPoolBuilder_.clear();
      }

      this.bitField0_ &= -257;
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder clearTapButtonAction() {
      this.bitField0_ &= -3;
      this.tapButtonAction_ = 1;
      this.onChanged();
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder clearVibration() {
      this.bitField0_ &= -5;
      this.vibration_ = false;
      this.onChanged();
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder clone() {
      return (SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder)super.clone();
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
      if (this.autoPauseBuilder_ == null) {
         if (this.autoPause_ == null) {
            var1 = Types$PbAutoPause.getDefaultInstance();
         } else {
            var1 = this.autoPause_;
         }
      } else {
         var1 = (Types$PbAutoPause)this.autoPauseBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbAutoPause$Builder getAutoPauseBuilder() {
      this.bitField0_ |= 4096;
      this.onChanged();
      return (Types$PbAutoPause$Builder)this.getAutoPauseFieldBuilder().getBuilder();
   }

   public Types$PbAutoPauseOrBuilder getAutoPauseOrBuilder() {
      Object var1;
      if (this.autoPauseBuilder_ != null) {
         var1 = (Types$PbAutoPauseOrBuilder)this.autoPauseBuilder_.getMessageOrBuilder();
      } else if (this.autoPause_ == null) {
         var1 = Types$PbAutoPause.getDefaultInstance();
      } else {
         var1 = this.autoPause_;
      }

      return (Types$PbAutoPauseOrBuilder)var1;
   }

   public boolean getAutoScrolling() {
      return this.autoScrolling_;
   }

   public boolean getAutoStart() {
      return this.autoStart_;
   }

   public Types$PbAutoLapSettings getAutolapSettings() {
      Types$PbAutoLapSettings var1;
      if (this.autolapSettingsBuilder_ == null) {
         if (this.autolapSettings_ == null) {
            var1 = Types$PbAutoLapSettings.getDefaultInstance();
         } else {
            var1 = this.autolapSettings_;
         }
      } else {
         var1 = (Types$PbAutoLapSettings)this.autolapSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbAutoLapSettings$Builder getAutolapSettingsBuilder() {
      this.bitField0_ |= 8192;
      this.onChanged();
      return (Types$PbAutoLapSettings$Builder)this.getAutolapSettingsFieldBuilder().getBuilder();
   }

   public Types$PbAutoLapSettingsOrBuilder getAutolapSettingsOrBuilder() {
      Object var1;
      if (this.autolapSettingsBuilder_ != null) {
         var1 = (Types$PbAutoLapSettingsOrBuilder)this.autolapSettingsBuilder_.getMessageOrBuilder();
      } else if (this.autolapSettings_ == null) {
         var1 = Types$PbAutoLapSettings.getDefaultInstance();
      } else {
         var1 = this.autolapSettings_;
      }

      return (Types$PbAutoLapSettingsOrBuilder)var1;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings getDefaultInstanceForType() {
      return SportprofileGuitarSettings$PbGuitarSportProfileSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return SportprofileGuitarSettings.a();
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

   public SportprofileDisplays$PbSirius2DisplaySettings getSirius2DisplaySettings() {
      SportprofileDisplays$PbSirius2DisplaySettings var1;
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         if (this.sirius2DisplaySettings_ == null) {
            var1 = SportprofileDisplays$PbSirius2DisplaySettings.getDefaultInstance();
         } else {
            var1 = this.sirius2DisplaySettings_;
         }
      } else {
         var1 = (SportprofileDisplays$PbSirius2DisplaySettings)this.sirius2DisplaySettingsBuilder_.getMessage();
      }

      return var1;
   }

   public SportprofileDisplays$PbSirius2DisplaySettings$Builder getSirius2DisplaySettingsBuilder() {
      this.bitField0_ |= 512;
      this.onChanged();
      return (SportprofileDisplays$PbSirius2DisplaySettings$Builder)this.getSirius2DisplaySettingsFieldBuilder().getBuilder();
   }

   public SportprofileDisplays$PbSirius2DisplaySettingsOrBuilder getSirius2DisplaySettingsOrBuilder() {
      Object var1;
      if (this.sirius2DisplaySettingsBuilder_ != null) {
         var1 = (SportprofileDisplays$PbSirius2DisplaySettingsOrBuilder)this.sirius2DisplaySettingsBuilder_.getMessageOrBuilder();
      } else if (this.sirius2DisplaySettings_ == null) {
         var1 = SportprofileDisplays$PbSirius2DisplaySettings.getDefaultInstance();
      } else {
         var1 = this.sirius2DisplaySettings_;
      }

      return (SportprofileDisplays$PbSirius2DisplaySettingsOrBuilder)var1;
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
      if (this.strideSensorCalibSettingsBuilder_ == null) {
         if (this.strideSensorCalibSettings_ == null) {
            var1 = Types$PbStrideSensorCalibSettings.getDefaultInstance();
         } else {
            var1 = this.strideSensorCalibSettings_;
         }
      } else {
         var1 = (Types$PbStrideSensorCalibSettings)this.strideSensorCalibSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbStrideSensorCalibSettings$Builder getStrideSensorCalibSettingsBuilder() {
      this.bitField0_ |= 32;
      this.onChanged();
      return (Types$PbStrideSensorCalibSettings$Builder)this.getStrideSensorCalibSettingsFieldBuilder().getBuilder();
   }

   public Types$PbStrideSensorCalibSettingsOrBuilder getStrideSensorCalibSettingsOrBuilder() {
      Object var1;
      if (this.strideSensorCalibSettingsBuilder_ != null) {
         var1 = (Types$PbStrideSensorCalibSettingsOrBuilder)this.strideSensorCalibSettingsBuilder_.getMessageOrBuilder();
      } else if (this.strideSensorCalibSettings_ == null) {
         var1 = Types$PbStrideSensorCalibSettings.getDefaultInstance();
      } else {
         var1 = this.strideSensorCalibSettings_;
      }

      return (Types$PbStrideSensorCalibSettingsOrBuilder)var1;
   }

   public Structures$PbSwimmingPoolInfo getSwimmingPool() {
      Structures$PbSwimmingPoolInfo var1;
      if (this.swimmingPoolBuilder_ == null) {
         if (this.swimmingPool_ == null) {
            var1 = Structures$PbSwimmingPoolInfo.getDefaultInstance();
         } else {
            var1 = this.swimmingPool_;
         }
      } else {
         var1 = (Structures$PbSwimmingPoolInfo)this.swimmingPoolBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbSwimmingPoolInfo$Builder getSwimmingPoolBuilder() {
      this.bitField0_ |= 256;
      this.onChanged();
      return (Structures$PbSwimmingPoolInfo$Builder)this.getSwimmingPoolFieldBuilder().getBuilder();
   }

   public Structures$PbSwimmingPoolInfoOrBuilder getSwimmingPoolOrBuilder() {
      Object var1;
      if (this.swimmingPoolBuilder_ != null) {
         var1 = (Structures$PbSwimmingPoolInfoOrBuilder)this.swimmingPoolBuilder_.getMessageOrBuilder();
      } else if (this.swimmingPool_ == null) {
         var1 = Structures$PbSwimmingPoolInfo.getDefaultInstance();
      } else {
         var1 = this.swimmingPool_;
      }

      return (Structures$PbSwimmingPoolInfoOrBuilder)var1;
   }

   public Types$PbTapButtonAction getTapButtonAction() {
      Types$PbTapButtonAction var1 = Types$PbTapButtonAction.valueOf(this.tapButtonAction_);
      Types$PbTapButtonAction var2 = var1;
      if (var1 == null) {
         var2 = Types$PbTapButtonAction.TAP_BUTTON_OFF;
      }

      return var2;
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

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportprofileGuitarSettings.b().ensureFieldAccessorsInitialized(SportprofileGuitarSettings$PbGuitarSportProfileSettings.class, SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (this.hasStrideSensorCalibSettings() && !this.getStrideSensorCalibSettings().isInitialized()) {
         var2 = var1;
      } else {
         if (this.hasSwimmingPool()) {
            var2 = var1;
            if (!this.getSwimmingPool().isInitialized()) {
               return var2;
            }
         }

         if (this.hasAutoPause()) {
            var2 = var1;
            if (!this.getAutoPause().isInitialized()) {
               return var2;
            }
         }

         if (this.hasAutolapSettings()) {
            var2 = var1;
            if (!this.getAutolapSettings().isInitialized()) {
               return var2;
            }
         }

         var2 = true;
      }

      return var2;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder mergeAutoPause(Types$PbAutoPause var1) {
      if (this.autoPauseBuilder_ == null) {
         if ((this.bitField0_ & 4096) == 4096 && this.autoPause_ != null && this.autoPause_ != Types$PbAutoPause.getDefaultInstance()) {
            this.autoPause_ = Types$PbAutoPause.newBuilder(this.autoPause_).mergeFrom(var1).buildPartial();
         } else {
            this.autoPause_ = var1;
         }

         this.onChanged();
      } else {
         this.autoPauseBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4096;
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder mergeAutolapSettings(Types$PbAutoLapSettings var1) {
      if (this.autolapSettingsBuilder_ == null) {
         if ((this.bitField0_ & 8192) == 8192 && this.autolapSettings_ != null && this.autolapSettings_ != Types$PbAutoLapSettings.getDefaultInstance()) {
            this.autolapSettings_ = Types$PbAutoLapSettings.newBuilder(this.autolapSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.autolapSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.autolapSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8192;
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      SportprofileGuitarSettings$PbGuitarSportProfileSettings var13;
      label96: {
         InvalidProtocolBufferException var12;
         SportprofileGuitarSettings$PbGuitarSportProfileSettings var14;
         try {
            var13 = (SportprofileGuitarSettings$PbGuitarSportProfileSettings)SportprofileGuitarSettings$PbGuitarSportProfileSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (SportprofileGuitarSettings$PbGuitarSportProfileSettings)var10.getUnfinishedMessage();
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

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder mergeFrom(Message var1) {
      SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder var2;
      if (var1 instanceof SportprofileGuitarSettings$PbGuitarSportProfileSettings) {
         var2 = this.mergeFrom((SportprofileGuitarSettings$PbGuitarSportProfileSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder mergeFrom(SportprofileGuitarSettings$PbGuitarSportProfileSettings var1) {
      if (var1 != SportprofileGuitarSettings$PbGuitarSportProfileSettings.getDefaultInstance()) {
         if (var1.hasHeartTouch()) {
            this.setHeartTouch(var1.getHeartTouch());
         }

         if (var1.hasTapButtonAction()) {
            this.setTapButtonAction(var1.getTapButtonAction());
         }

         if (var1.hasVibration()) {
            this.setVibration(var1.getVibration());
         }

         if (var1.hasAutoStart()) {
            this.setAutoStart(var1.getAutoStart());
         }

         if (var1.hasAutoScrolling()) {
            this.setAutoScrolling(var1.getAutoScrolling());
         }

         if (var1.hasStrideSensorCalibSettings()) {
            this.mergeStrideSensorCalibSettings(var1.getStrideSensorCalibSettings());
         }

         if (var1.hasSprintDisplayActivation()) {
            this.setSprintDisplayActivation(var1.getSprintDisplayActivation());
         }

         if (var1.hasSportTapButtonSensitivity()) {
            this.setSportTapButtonSensitivity(var1.getSportTapButtonSensitivity());
         }

         if (var1.hasSwimmingPool()) {
            this.mergeSwimmingPool(var1.getSwimmingPool());
         }

         if (var1.hasSirius2DisplaySettings()) {
            this.mergeSirius2DisplaySettings(var1.getSirius2DisplaySettings());
         }

         if (var1.hasAltitudeSetting()) {
            this.setAltitudeSetting(var1.getAltitudeSetting());
         }

         if (var1.hasGpsSetting()) {
            this.setGpsSetting(var1.getGpsSetting());
         }

         if (var1.hasAutoPause()) {
            this.mergeAutoPause(var1.getAutoPause());
         }

         if (var1.hasAutolapSettings()) {
            this.mergeAutolapSettings(var1.getAutolapSettings());
         }

         if (var1.hasHeartRateView()) {
            this.setHeartRateView(var1.getHeartRateView());
         }

         this.mergeUnknownFields(SportprofileGuitarSettings$PbGuitarSportProfileSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder mergeSirius2DisplaySettings(SportprofileDisplays$PbSirius2DisplaySettings var1) {
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         if ((this.bitField0_ & 512) == 512 && this.sirius2DisplaySettings_ != null && this.sirius2DisplaySettings_ != SportprofileDisplays$PbSirius2DisplaySettings.getDefaultInstance()) {
            this.sirius2DisplaySettings_ = SportprofileDisplays$PbSirius2DisplaySettings.newBuilder(this.sirius2DisplaySettings_).mergeFrom(var1).buildPartial();
         } else {
            this.sirius2DisplaySettings_ = var1;
         }

         this.onChanged();
      } else {
         this.sirius2DisplaySettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 512;
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder mergeStrideSensorCalibSettings(Types$PbStrideSensorCalibSettings var1) {
      if (this.strideSensorCalibSettingsBuilder_ == null) {
         if ((this.bitField0_ & 32) == 32 && this.strideSensorCalibSettings_ != null && this.strideSensorCalibSettings_ != Types$PbStrideSensorCalibSettings.getDefaultInstance()) {
            this.strideSensorCalibSettings_ = Types$PbStrideSensorCalibSettings.newBuilder(this.strideSensorCalibSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.strideSensorCalibSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.strideSensorCalibSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder mergeSwimmingPool(Structures$PbSwimmingPoolInfo var1) {
      if (this.swimmingPoolBuilder_ == null) {
         if ((this.bitField0_ & 256) == 256 && this.swimmingPool_ != null && this.swimmingPool_ != Structures$PbSwimmingPoolInfo.getDefaultInstance()) {
            this.swimmingPool_ = Structures$PbSwimmingPoolInfo.newBuilder(this.swimmingPool_).mergeFrom(var1).buildPartial();
         } else {
            this.swimmingPool_ = var1;
         }

         this.onChanged();
      } else {
         this.swimmingPoolBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 256;
      return this;
   }

   public final SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder)super.mergeUnknownFields(var1);
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder setAltitudeSetting(Types$PbAltitudeSetting var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1024;
         this.altitudeSetting_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder setAutoPause(Types$PbAutoPause$Builder var1) {
      if (this.autoPauseBuilder_ == null) {
         this.autoPause_ = var1.build();
         this.onChanged();
      } else {
         this.autoPauseBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4096;
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder setAutoPause(Types$PbAutoPause var1) {
      if (this.autoPauseBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.autoPause_ = var1;
         this.onChanged();
      } else {
         this.autoPauseBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4096;
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder setAutoScrolling(boolean var1) {
      this.bitField0_ |= 16;
      this.autoScrolling_ = var1;
      this.onChanged();
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder setAutoStart(boolean var1) {
      this.bitField0_ |= 8;
      this.autoStart_ = var1;
      this.onChanged();
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder setAutolapSettings(Types$PbAutoLapSettings$Builder var1) {
      if (this.autolapSettingsBuilder_ == null) {
         this.autolapSettings_ = var1.build();
         this.onChanged();
      } else {
         this.autolapSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8192;
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder setAutolapSettings(Types$PbAutoLapSettings var1) {
      if (this.autolapSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.autolapSettings_ = var1;
         this.onChanged();
      } else {
         this.autolapSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8192;
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder)super.setField(var1, var2);
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder setGpsSetting(Types$PbGPSSetting var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2048;
         this.gpsSetting_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder setHeartRateView(Types$PbHeartRateView var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 16384;
         this.heartRateView_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder setHeartTouch(Types$PbHeartTouch var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.heartTouch_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder setSirius2DisplaySettings(SportprofileDisplays$PbSirius2DisplaySettings$Builder var1) {
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         this.sirius2DisplaySettings_ = var1.build();
         this.onChanged();
      } else {
         this.sirius2DisplaySettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 512;
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder setSirius2DisplaySettings(SportprofileDisplays$PbSirius2DisplaySettings var1) {
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.sirius2DisplaySettings_ = var1;
         this.onChanged();
      } else {
         this.sirius2DisplaySettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 512;
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder setSportTapButtonSensitivity(SportprofileGuitarSettings$PbGuitarSportProfileSettings$PbSportTapButtonSensitivity var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 128;
         this.sportTapButtonSensitivity_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder setSprintDisplayActivation(int var1) {
      this.bitField0_ |= 64;
      this.sprintDisplayActivation_ = var1;
      this.onChanged();
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder setStrideSensorCalibSettings(Types$PbStrideSensorCalibSettings$Builder var1) {
      if (this.strideSensorCalibSettingsBuilder_ == null) {
         this.strideSensorCalibSettings_ = var1.build();
         this.onChanged();
      } else {
         this.strideSensorCalibSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 32;
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder setStrideSensorCalibSettings(Types$PbStrideSensorCalibSettings var1) {
      if (this.strideSensorCalibSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.strideSensorCalibSettings_ = var1;
         this.onChanged();
      } else {
         this.strideSensorCalibSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder setSwimmingPool(Structures$PbSwimmingPoolInfo$Builder var1) {
      if (this.swimmingPoolBuilder_ == null) {
         this.swimmingPool_ = var1.build();
         this.onChanged();
      } else {
         this.swimmingPoolBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 256;
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder setSwimmingPool(Structures$PbSwimmingPoolInfo var1) {
      if (this.swimmingPoolBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.swimmingPool_ = var1;
         this.onChanged();
      } else {
         this.swimmingPoolBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 256;
      return this;
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder setTapButtonAction(Types$PbTapButtonAction var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.tapButtonAction_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public final SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder)super.setUnknownFields(var1);
   }

   public SportprofileGuitarSettings$PbGuitarSportProfileSettings$Builder setVibration(boolean var1) {
      this.bitField0_ |= 4;
      this.vibration_ = var1;
      this.onChanged();
      return this;
   }
}
