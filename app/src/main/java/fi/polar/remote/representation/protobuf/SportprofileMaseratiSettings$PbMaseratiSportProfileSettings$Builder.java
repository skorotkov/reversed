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

public final class SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder extends Builder implements SportprofileMaseratiSettings$PbMaseratiSportProfileSettingsOrBuilder {
   private int altitudeSetting_;
   private boolean autoStart_;
   private SingleFieldBuilderV3 autolapSettingsBuilder_;
   private Types$PbAutoLapSettings autolapSettings_;
   private int bitField0_;
   private int gpsSetting_;
   private int heartRateView_;
   private int heartTouch_;
   private SingleFieldBuilderV3 sirius2DisplaySettingsBuilder_;
   private SportprofileDisplays$PbSirius2DisplaySettings sirius2DisplaySettings_;
   private int tapButtonAction_;
   private boolean vibration_;

   private SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder() {
      this.heartTouch_ = 1;
      this.tapButtonAction_ = 1;
      this.sirius2DisplaySettings_ = null;
      this.altitudeSetting_ = 0;
      this.gpsSetting_ = 0;
      this.autolapSettings_ = null;
      this.heartRateView_ = 1;
      this.maybeForceBuilderInitialization();
   }

   private SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder(BuilderParent var1) {
      super(var1);
      this.heartTouch_ = 1;
      this.tapButtonAction_ = 1;
      this.sirius2DisplaySettings_ = null;
      this.altitudeSetting_ = 0;
      this.gpsSetting_ = 0;
      this.autolapSettings_ = null;
      this.heartRateView_ = 1;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder(BuilderParent var1, SportprofileMaseratiSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder(SportprofileMaseratiSettings$1 var1) {
      this();
   }

   private SingleFieldBuilderV3 getAutolapSettingsFieldBuilder() {
      if (this.autolapSettingsBuilder_ == null) {
         this.autolapSettingsBuilder_ = new SingleFieldBuilderV3(this.getAutolapSettings(), this.getParentForChildren(), this.isClean());
         this.autolapSettings_ = null;
      }

      return this.autolapSettingsBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return SportprofileMaseratiSettings.a();
   }

   private SingleFieldBuilderV3 getSirius2DisplaySettingsFieldBuilder() {
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         this.sirius2DisplaySettingsBuilder_ = new SingleFieldBuilderV3(this.getSirius2DisplaySettings(), this.getParentForChildren(), this.isClean());
         this.sirius2DisplaySettings_ = null;
      }

      return this.sirius2DisplaySettingsBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (SportprofileMaseratiSettings$PbMaseratiSportProfileSettings.b()) {
         this.getSirius2DisplaySettingsFieldBuilder();
         this.getAutolapSettingsFieldBuilder();
      }

   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings build() {
      SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings buildPartial() {
      byte var1 = 1;
      SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var2 = new SportprofileMaseratiSettings$PbMaseratiSportProfileSettings(this, (SportprofileMaseratiSettings$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      SportprofileMaseratiSettings$PbMaseratiSportProfileSettings.a(var2, this.heartTouch_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      SportprofileMaseratiSettings$PbMaseratiSportProfileSettings.b(var2, this.tapButtonAction_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      SportprofileMaseratiSettings$PbMaseratiSportProfileSettings.a(var2, this.vibration_);
      var4 = var5;
      if ((var3 & 8) == 8) {
         var4 = var5 | 8;
      }

      SportprofileMaseratiSettings$PbMaseratiSportProfileSettings.b(var2, this.autoStart_);
      if ((var3 & 16) == 16) {
         var4 |= 16;
      }

      if (this.sirius2DisplaySettingsBuilder_ == null) {
         SportprofileMaseratiSettings$PbMaseratiSportProfileSettings.a(var2, this.sirius2DisplaySettings_);
      } else {
         SportprofileMaseratiSettings$PbMaseratiSportProfileSettings.a(var2, (SportprofileDisplays$PbSirius2DisplaySettings)this.sirius2DisplaySettingsBuilder_.build());
      }

      var5 = var4;
      if ((var3 & 32) == 32) {
         var5 = var4 | 32;
      }

      SportprofileMaseratiSettings$PbMaseratiSportProfileSettings.c(var2, this.altitudeSetting_);
      var4 = var5;
      if ((var3 & 64) == 64) {
         var4 = var5 | 64;
      }

      SportprofileMaseratiSettings$PbMaseratiSportProfileSettings.d(var2, this.gpsSetting_);
      var5 = var4;
      if ((var3 & 128) == 128) {
         var5 = var4 | 128;
      }

      if (this.autolapSettingsBuilder_ == null) {
         SportprofileMaseratiSettings$PbMaseratiSportProfileSettings.a(var2, this.autolapSettings_);
      } else {
         SportprofileMaseratiSettings$PbMaseratiSportProfileSettings.a(var2, (Types$PbAutoLapSettings)this.autolapSettingsBuilder_.build());
      }

      var4 = var5;
      if ((var3 & 256) == 256) {
         var4 = var5 | 256;
      }

      SportprofileMaseratiSettings$PbMaseratiSportProfileSettings.e(var2, this.heartRateView_);
      SportprofileMaseratiSettings$PbMaseratiSportProfileSettings.f(var2, var4);
      this.onBuilt();
      return var2;
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder clear() {
      super.clear();
      this.heartTouch_ = 1;
      this.bitField0_ &= -2;
      this.tapButtonAction_ = 1;
      this.bitField0_ &= -3;
      this.vibration_ = false;
      this.bitField0_ &= -5;
      this.autoStart_ = false;
      this.bitField0_ &= -9;
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         this.sirius2DisplaySettings_ = null;
      } else {
         this.sirius2DisplaySettingsBuilder_.clear();
      }

      this.bitField0_ &= -17;
      this.altitudeSetting_ = 0;
      this.bitField0_ &= -33;
      this.gpsSetting_ = 0;
      this.bitField0_ &= -65;
      if (this.autolapSettingsBuilder_ == null) {
         this.autolapSettings_ = null;
      } else {
         this.autolapSettingsBuilder_.clear();
      }

      this.bitField0_ &= -129;
      this.heartRateView_ = 1;
      this.bitField0_ &= -257;
      return this;
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder clearAltitudeSetting() {
      this.bitField0_ &= -33;
      this.altitudeSetting_ = 0;
      this.onChanged();
      return this;
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder clearAutoStart() {
      this.bitField0_ &= -9;
      this.autoStart_ = false;
      this.onChanged();
      return this;
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder clearAutolapSettings() {
      if (this.autolapSettingsBuilder_ == null) {
         this.autolapSettings_ = null;
         this.onChanged();
      } else {
         this.autolapSettingsBuilder_.clear();
      }

      this.bitField0_ &= -129;
      return this;
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder clearField(FieldDescriptor var1) {
      return (SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder)super.clearField(var1);
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder clearGpsSetting() {
      this.bitField0_ &= -65;
      this.gpsSetting_ = 0;
      this.onChanged();
      return this;
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder clearHeartRateView() {
      this.bitField0_ &= -257;
      this.heartRateView_ = 1;
      this.onChanged();
      return this;
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder clearHeartTouch() {
      this.bitField0_ &= -2;
      this.heartTouch_ = 1;
      this.onChanged();
      return this;
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder clearOneof(OneofDescriptor var1) {
      return (SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder)super.clearOneof(var1);
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder clearSirius2DisplaySettings() {
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         this.sirius2DisplaySettings_ = null;
         this.onChanged();
      } else {
         this.sirius2DisplaySettingsBuilder_.clear();
      }

      this.bitField0_ &= -17;
      return this;
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder clearTapButtonAction() {
      this.bitField0_ &= -3;
      this.tapButtonAction_ = 1;
      this.onChanged();
      return this;
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder clearVibration() {
      this.bitField0_ &= -5;
      this.vibration_ = false;
      this.onChanged();
      return this;
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder clone() {
      return (SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder)super.clone();
   }

   public Types$PbAltitudeSetting getAltitudeSetting() {
      Types$PbAltitudeSetting var1 = Types$PbAltitudeSetting.valueOf(this.altitudeSetting_);
      Types$PbAltitudeSetting var2 = var1;
      if (var1 == null) {
         var2 = Types$PbAltitudeSetting.ALTITUDE_OFF;
      }

      return var2;
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
      this.bitField0_ |= 128;
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

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings getDefaultInstanceForType() {
      return SportprofileMaseratiSettings$PbMaseratiSportProfileSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return SportprofileMaseratiSettings.a();
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
      this.bitField0_ |= 16;
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
      if ((this.bitField0_ & 32) == 32) {
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
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasGpsSetting() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasHeartRateView() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
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
      if ((this.bitField0_ & 16) == 16) {
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
      return SportprofileMaseratiSettings.b().ensureFieldAccessorsInitialized(SportprofileMaseratiSettings$PbMaseratiSportProfileSettings.class, SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (this.hasAutolapSettings() && !this.getAutolapSettings().isInitialized()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder mergeAutolapSettings(Types$PbAutoLapSettings var1) {
      if (this.autolapSettingsBuilder_ == null) {
         if ((this.bitField0_ & 128) == 128 && this.autolapSettings_ != null && this.autolapSettings_ != Types$PbAutoLapSettings.getDefaultInstance()) {
            this.autolapSettings_ = Types$PbAutoLapSettings.newBuilder(this.autolapSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.autolapSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.autolapSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 128;
      return this;
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var13;
      label96: {
         InvalidProtocolBufferException var12;
         SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var14;
         try {
            var13 = (SportprofileMaseratiSettings$PbMaseratiSportProfileSettings)SportprofileMaseratiSettings$PbMaseratiSportProfileSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (SportprofileMaseratiSettings$PbMaseratiSportProfileSettings)var10.getUnfinishedMessage();
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

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder mergeFrom(Message var1) {
      SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder var2;
      if (var1 instanceof SportprofileMaseratiSettings$PbMaseratiSportProfileSettings) {
         var2 = this.mergeFrom((SportprofileMaseratiSettings$PbMaseratiSportProfileSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder mergeFrom(SportprofileMaseratiSettings$PbMaseratiSportProfileSettings var1) {
      if (var1 != SportprofileMaseratiSettings$PbMaseratiSportProfileSettings.getDefaultInstance()) {
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

         if (var1.hasSirius2DisplaySettings()) {
            this.mergeSirius2DisplaySettings(var1.getSirius2DisplaySettings());
         }

         if (var1.hasAltitudeSetting()) {
            this.setAltitudeSetting(var1.getAltitudeSetting());
         }

         if (var1.hasGpsSetting()) {
            this.setGpsSetting(var1.getGpsSetting());
         }

         if (var1.hasAutolapSettings()) {
            this.mergeAutolapSettings(var1.getAutolapSettings());
         }

         if (var1.hasHeartRateView()) {
            this.setHeartRateView(var1.getHeartRateView());
         }

         this.mergeUnknownFields(SportprofileMaseratiSettings$PbMaseratiSportProfileSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder mergeSirius2DisplaySettings(SportprofileDisplays$PbSirius2DisplaySettings var1) {
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         if ((this.bitField0_ & 16) == 16 && this.sirius2DisplaySettings_ != null && this.sirius2DisplaySettings_ != SportprofileDisplays$PbSirius2DisplaySettings.getDefaultInstance()) {
            this.sirius2DisplaySettings_ = SportprofileDisplays$PbSirius2DisplaySettings.newBuilder(this.sirius2DisplaySettings_).mergeFrom(var1).buildPartial();
         } else {
            this.sirius2DisplaySettings_ = var1;
         }

         this.onChanged();
      } else {
         this.sirius2DisplaySettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public final SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder)super.mergeUnknownFields(var1);
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder setAltitudeSetting(Types$PbAltitudeSetting var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 32;
         this.altitudeSetting_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder setAutoStart(boolean var1) {
      this.bitField0_ |= 8;
      this.autoStart_ = var1;
      this.onChanged();
      return this;
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder setAutolapSettings(Types$PbAutoLapSettings$Builder var1) {
      if (this.autolapSettingsBuilder_ == null) {
         this.autolapSettings_ = var1.build();
         this.onChanged();
      } else {
         this.autolapSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 128;
      return this;
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder setAutolapSettings(Types$PbAutoLapSettings var1) {
      if (this.autolapSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.autolapSettings_ = var1;
         this.onChanged();
      } else {
         this.autolapSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 128;
      return this;
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder)super.setField(var1, var2);
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder setGpsSetting(Types$PbGPSSetting var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 64;
         this.gpsSetting_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder setHeartRateView(Types$PbHeartRateView var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 256;
         this.heartRateView_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder setHeartTouch(Types$PbHeartTouch var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.heartTouch_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder setSirius2DisplaySettings(SportprofileDisplays$PbSirius2DisplaySettings$Builder var1) {
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         this.sirius2DisplaySettings_ = var1.build();
         this.onChanged();
      } else {
         this.sirius2DisplaySettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 16;
      return this;
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder setSirius2DisplaySettings(SportprofileDisplays$PbSirius2DisplaySettings var1) {
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.sirius2DisplaySettings_ = var1;
         this.onChanged();
      } else {
         this.sirius2DisplaySettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder setTapButtonAction(Types$PbTapButtonAction var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.tapButtonAction_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public final SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder)super.setUnknownFields(var1);
   }

   public SportprofileMaseratiSettings$PbMaseratiSportProfileSettings$Builder setVibration(boolean var1) {
      this.bitField0_ |= 4;
      this.vibration_ = var1;
      this.onChanged();
      return this;
   }
}
