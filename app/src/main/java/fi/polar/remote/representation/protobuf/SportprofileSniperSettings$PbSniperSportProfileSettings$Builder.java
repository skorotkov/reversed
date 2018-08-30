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

public final class SportprofileSniperSettings$PbSniperSportProfileSettings$Builder extends Builder implements SportprofileSniperSettings$PbSniperSportProfileSettingsOrBuilder {
   private int altitudeSetting_;
   private SingleFieldBuilderV3 autoPauseBuilder_;
   private Types$PbAutoPause autoPause_;
   private boolean autoStart_;
   private SingleFieldBuilderV3 autolapSettingsBuilder_;
   private Types$PbAutoLapSettings autolapSettings_;
   private int bitField0_;
   private int gpsSetting_;
   private int heartRateView_;
   private int heartTouch_;
   private SingleFieldBuilderV3 sirius2DisplaySettingsBuilder_;
   private SportprofileDisplays$PbSirius2DisplaySettings sirius2DisplaySettings_;

   private SportprofileSniperSettings$PbSniperSportProfileSettings$Builder() {
      this.heartTouch_ = 1;
      this.sirius2DisplaySettings_ = null;
      this.altitudeSetting_ = 0;
      this.gpsSetting_ = 0;
      this.autoPause_ = null;
      this.autolapSettings_ = null;
      this.heartRateView_ = 1;
      this.maybeForceBuilderInitialization();
   }

   private SportprofileSniperSettings$PbSniperSportProfileSettings$Builder(BuilderParent var1) {
      super(var1);
      this.heartTouch_ = 1;
      this.sirius2DisplaySettings_ = null;
      this.altitudeSetting_ = 0;
      this.gpsSetting_ = 0;
      this.autoPause_ = null;
      this.autolapSettings_ = null;
      this.heartRateView_ = 1;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   SportprofileSniperSettings$PbSniperSportProfileSettings$Builder(BuilderParent var1, SportprofileSniperSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   SportprofileSniperSettings$PbSniperSportProfileSettings$Builder(SportprofileSniperSettings$1 var1) {
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
      return SportprofileSniperSettings.a();
   }

   private SingleFieldBuilderV3 getSirius2DisplaySettingsFieldBuilder() {
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         this.sirius2DisplaySettingsBuilder_ = new SingleFieldBuilderV3(this.getSirius2DisplaySettings(), this.getParentForChildren(), this.isClean());
         this.sirius2DisplaySettings_ = null;
      }

      return this.sirius2DisplaySettingsBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (SportprofileSniperSettings$PbSniperSportProfileSettings.b()) {
         this.getSirius2DisplaySettingsFieldBuilder();
         this.getAutoPauseFieldBuilder();
         this.getAutolapSettingsFieldBuilder();
      }

   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (SportprofileSniperSettings$PbSniperSportProfileSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings build() {
      SportprofileSniperSettings$PbSniperSportProfileSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings buildPartial() {
      byte var1 = 1;
      SportprofileSniperSettings$PbSniperSportProfileSettings var2 = new SportprofileSniperSettings$PbSniperSportProfileSettings(this, (SportprofileSniperSettings$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      SportprofileSniperSettings$PbSniperSportProfileSettings.a(var2, this.heartTouch_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      SportprofileSniperSettings$PbSniperSportProfileSettings.a(var2, this.autoStart_);
      int var6;
      if ((var3 & 4) == 4) {
         var6 = var4 | 4;
      } else {
         var6 = var4;
      }

      if (this.sirius2DisplaySettingsBuilder_ == null) {
         SportprofileSniperSettings$PbSniperSportProfileSettings.a(var2, this.sirius2DisplaySettings_);
      } else {
         SportprofileSniperSettings$PbSniperSportProfileSettings.a(var2, (SportprofileDisplays$PbSirius2DisplaySettings)this.sirius2DisplaySettingsBuilder_.build());
      }

      var4 = var6;
      if ((var3 & 8) == 8) {
         var4 = var6 | 8;
      }

      SportprofileSniperSettings$PbSniperSportProfileSettings.b(var2, this.altitudeSetting_);
      int var5 = var4;
      if ((var3 & 16) == 16) {
         var5 = var4 | 16;
      }

      SportprofileSniperSettings$PbSniperSportProfileSettings.c(var2, this.gpsSetting_);
      var6 = var5;
      if ((var3 & 32) == 32) {
         var6 = var5 | 32;
      }

      if (this.autoPauseBuilder_ == null) {
         SportprofileSniperSettings$PbSniperSportProfileSettings.a(var2, this.autoPause_);
      } else {
         SportprofileSniperSettings$PbSniperSportProfileSettings.a(var2, (Types$PbAutoPause)this.autoPauseBuilder_.build());
      }

      var4 = var6;
      if ((var3 & 64) == 64) {
         var4 = var6 | 64;
      }

      if (this.autolapSettingsBuilder_ == null) {
         SportprofileSniperSettings$PbSniperSportProfileSettings.a(var2, this.autolapSettings_);
      } else {
         SportprofileSniperSettings$PbSniperSportProfileSettings.a(var2, (Types$PbAutoLapSettings)this.autolapSettingsBuilder_.build());
      }

      var6 = var4;
      if ((var3 & 128) == 128) {
         var6 = var4 | 128;
      }

      SportprofileSniperSettings$PbSniperSportProfileSettings.d(var2, this.heartRateView_);
      SportprofileSniperSettings$PbSniperSportProfileSettings.e(var2, var6);
      this.onBuilt();
      return var2;
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder clear() {
      super.clear();
      this.heartTouch_ = 1;
      this.bitField0_ &= -2;
      this.autoStart_ = false;
      this.bitField0_ &= -3;
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         this.sirius2DisplaySettings_ = null;
      } else {
         this.sirius2DisplaySettingsBuilder_.clear();
      }

      this.bitField0_ &= -5;
      this.altitudeSetting_ = 0;
      this.bitField0_ &= -9;
      this.gpsSetting_ = 0;
      this.bitField0_ &= -17;
      if (this.autoPauseBuilder_ == null) {
         this.autoPause_ = null;
      } else {
         this.autoPauseBuilder_.clear();
      }

      this.bitField0_ &= -33;
      if (this.autolapSettingsBuilder_ == null) {
         this.autolapSettings_ = null;
      } else {
         this.autolapSettingsBuilder_.clear();
      }

      this.bitField0_ &= -65;
      this.heartRateView_ = 1;
      this.bitField0_ &= -129;
      return this;
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder clearAltitudeSetting() {
      this.bitField0_ &= -9;
      this.altitudeSetting_ = 0;
      this.onChanged();
      return this;
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder clearAutoPause() {
      if (this.autoPauseBuilder_ == null) {
         this.autoPause_ = null;
         this.onChanged();
      } else {
         this.autoPauseBuilder_.clear();
      }

      this.bitField0_ &= -33;
      return this;
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder clearAutoStart() {
      this.bitField0_ &= -3;
      this.autoStart_ = false;
      this.onChanged();
      return this;
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder clearAutolapSettings() {
      if (this.autolapSettingsBuilder_ == null) {
         this.autolapSettings_ = null;
         this.onChanged();
      } else {
         this.autolapSettingsBuilder_.clear();
      }

      this.bitField0_ &= -65;
      return this;
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder clearField(FieldDescriptor var1) {
      return (SportprofileSniperSettings$PbSniperSportProfileSettings$Builder)super.clearField(var1);
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder clearGpsSetting() {
      this.bitField0_ &= -17;
      this.gpsSetting_ = 0;
      this.onChanged();
      return this;
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder clearHeartRateView() {
      this.bitField0_ &= -129;
      this.heartRateView_ = 1;
      this.onChanged();
      return this;
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder clearHeartTouch() {
      this.bitField0_ &= -2;
      this.heartTouch_ = 1;
      this.onChanged();
      return this;
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder clearOneof(OneofDescriptor var1) {
      return (SportprofileSniperSettings$PbSniperSportProfileSettings$Builder)super.clearOneof(var1);
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder clearSirius2DisplaySettings() {
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         this.sirius2DisplaySettings_ = null;
         this.onChanged();
      } else {
         this.sirius2DisplaySettingsBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder clone() {
      return (SportprofileSniperSettings$PbSniperSportProfileSettings$Builder)super.clone();
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
      this.bitField0_ |= 32;
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
      this.bitField0_ |= 64;
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

   public SportprofileSniperSettings$PbSniperSportProfileSettings getDefaultInstanceForType() {
      return SportprofileSniperSettings$PbSniperSportProfileSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return SportprofileSniperSettings.a();
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
      this.bitField0_ |= 4;
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

   public boolean hasAltitudeSetting() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAutoPause() {
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
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAutolapSettings() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasGpsSetting() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasHeartRateView() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
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
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportprofileSniperSettings.b().ensureFieldAccessorsInitialized(SportprofileSniperSettings$PbSniperSportProfileSettings.class, SportprofileSniperSettings$PbSniperSportProfileSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if ((!this.hasAutoPause() || this.getAutoPause().isInitialized()) && (!this.hasAutolapSettings() || this.getAutolapSettings().isInitialized())) {
         var1 = true;
      }

      return var1;
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder mergeAutoPause(Types$PbAutoPause var1) {
      if (this.autoPauseBuilder_ == null) {
         if ((this.bitField0_ & 32) == 32 && this.autoPause_ != null && this.autoPause_ != Types$PbAutoPause.getDefaultInstance()) {
            this.autoPause_ = Types$PbAutoPause.newBuilder(this.autoPause_).mergeFrom(var1).buildPartial();
         } else {
            this.autoPause_ = var1;
         }

         this.onChanged();
      } else {
         this.autoPauseBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder mergeAutolapSettings(Types$PbAutoLapSettings var1) {
      if (this.autolapSettingsBuilder_ == null) {
         if ((this.bitField0_ & 64) == 64 && this.autolapSettings_ != null && this.autolapSettings_ != Types$PbAutoLapSettings.getDefaultInstance()) {
            this.autolapSettings_ = Types$PbAutoLapSettings.newBuilder(this.autolapSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.autolapSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.autolapSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      SportprofileSniperSettings$PbSniperSportProfileSettings var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (SportprofileSniperSettings$PbSniperSportProfileSettings)SportprofileSniperSettings$PbSniperSportProfileSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (SportprofileSniperSettings$PbSniperSportProfileSettings)var10.getUnfinishedMessage();
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

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder mergeFrom(Message var1) {
      SportprofileSniperSettings$PbSniperSportProfileSettings$Builder var2;
      if (var1 instanceof SportprofileSniperSettings$PbSniperSportProfileSettings) {
         var2 = this.mergeFrom((SportprofileSniperSettings$PbSniperSportProfileSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder mergeFrom(SportprofileSniperSettings$PbSniperSportProfileSettings var1) {
      if (var1 != SportprofileSniperSettings$PbSniperSportProfileSettings.getDefaultInstance()) {
         if (var1.hasHeartTouch()) {
            this.setHeartTouch(var1.getHeartTouch());
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

         if (var1.hasAutoPause()) {
            this.mergeAutoPause(var1.getAutoPause());
         }

         if (var1.hasAutolapSettings()) {
            this.mergeAutolapSettings(var1.getAutolapSettings());
         }

         if (var1.hasHeartRateView()) {
            this.setHeartRateView(var1.getHeartRateView());
         }

         this.mergeUnknownFields(SportprofileSniperSettings$PbSniperSportProfileSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder mergeSirius2DisplaySettings(SportprofileDisplays$PbSirius2DisplaySettings var1) {
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.sirius2DisplaySettings_ != null && this.sirius2DisplaySettings_ != SportprofileDisplays$PbSirius2DisplaySettings.getDefaultInstance()) {
            this.sirius2DisplaySettings_ = SportprofileDisplays$PbSirius2DisplaySettings.newBuilder(this.sirius2DisplaySettings_).mergeFrom(var1).buildPartial();
         } else {
            this.sirius2DisplaySettings_ = var1;
         }

         this.onChanged();
      } else {
         this.sirius2DisplaySettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public final SportprofileSniperSettings$PbSniperSportProfileSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (SportprofileSniperSettings$PbSniperSportProfileSettings$Builder)super.mergeUnknownFields(var1);
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder setAltitudeSetting(Types$PbAltitudeSetting var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 8;
         this.altitudeSetting_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder setAutoPause(Types$PbAutoPause$Builder var1) {
      if (this.autoPauseBuilder_ == null) {
         this.autoPause_ = var1.build();
         this.onChanged();
      } else {
         this.autoPauseBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 32;
      return this;
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder setAutoPause(Types$PbAutoPause var1) {
      if (this.autoPauseBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.autoPause_ = var1;
         this.onChanged();
      } else {
         this.autoPauseBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder setAutoStart(boolean var1) {
      this.bitField0_ |= 2;
      this.autoStart_ = var1;
      this.onChanged();
      return this;
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder setAutolapSettings(Types$PbAutoLapSettings$Builder var1) {
      if (this.autolapSettingsBuilder_ == null) {
         this.autolapSettings_ = var1.build();
         this.onChanged();
      } else {
         this.autolapSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 64;
      return this;
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder setAutolapSettings(Types$PbAutoLapSettings var1) {
      if (this.autolapSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.autolapSettings_ = var1;
         this.onChanged();
      } else {
         this.autolapSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (SportprofileSniperSettings$PbSniperSportProfileSettings$Builder)super.setField(var1, var2);
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder setGpsSetting(Types$PbGPSSetting var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 16;
         this.gpsSetting_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder setHeartRateView(Types$PbHeartRateView var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 128;
         this.heartRateView_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder setHeartTouch(Types$PbHeartTouch var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.heartTouch_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (SportprofileSniperSettings$PbSniperSportProfileSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder setSirius2DisplaySettings(SportprofileDisplays$PbSirius2DisplaySettings$Builder var1) {
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         this.sirius2DisplaySettings_ = var1.build();
         this.onChanged();
      } else {
         this.sirius2DisplaySettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public SportprofileSniperSettings$PbSniperSportProfileSettings$Builder setSirius2DisplaySettings(SportprofileDisplays$PbSirius2DisplaySettings var1) {
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.sirius2DisplaySettings_ = var1;
         this.onChanged();
      } else {
         this.sirius2DisplaySettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public final SportprofileSniperSettings$PbSniperSportProfileSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (SportprofileSniperSettings$PbSniperSportProfileSettings$Builder)super.setUnknownFields(var1);
   }
}
