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

public final class SportprofileAceSettings$PbAceSportProfileSettings$Builder extends Builder implements SportprofileAceSettings$PbAceSportProfileSettingsOrBuilder {
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
   private SingleFieldBuilderV3 strideSensorCalibSettingsBuilder_;
   private Types$PbStrideSensorCalibSettings strideSensorCalibSettings_;

   private SportprofileAceSettings$PbAceSportProfileSettings$Builder() {
      this.heartTouch_ = 1;
      this.strideSensorCalibSettings_ = null;
      this.sirius2DisplaySettings_ = null;
      this.gpsSetting_ = 0;
      this.autolapSettings_ = null;
      this.heartRateView_ = 1;
      this.autoPause_ = null;
      this.maybeForceBuilderInitialization();
   }

   private SportprofileAceSettings$PbAceSportProfileSettings$Builder(BuilderParent var1) {
      super(var1);
      this.heartTouch_ = 1;
      this.strideSensorCalibSettings_ = null;
      this.sirius2DisplaySettings_ = null;
      this.gpsSetting_ = 0;
      this.autolapSettings_ = null;
      this.heartRateView_ = 1;
      this.autoPause_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   SportprofileAceSettings$PbAceSportProfileSettings$Builder(BuilderParent var1, SportprofileAceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   SportprofileAceSettings$PbAceSportProfileSettings$Builder(SportprofileAceSettings$1 var1) {
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
      return SportprofileAceSettings.a();
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

   private void maybeForceBuilderInitialization() {
      if (SportprofileAceSettings$PbAceSportProfileSettings.b()) {
         this.getStrideSensorCalibSettingsFieldBuilder();
         this.getSirius2DisplaySettingsFieldBuilder();
         this.getAutolapSettingsFieldBuilder();
         this.getAutoPauseFieldBuilder();
      }

   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (SportprofileAceSettings$PbAceSportProfileSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public SportprofileAceSettings$PbAceSportProfileSettings build() {
      SportprofileAceSettings$PbAceSportProfileSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public SportprofileAceSettings$PbAceSportProfileSettings buildPartial() {
      byte var1 = 1;
      SportprofileAceSettings$PbAceSportProfileSettings var2 = new SportprofileAceSettings$PbAceSportProfileSettings(this, (SportprofileAceSettings$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      SportprofileAceSettings$PbAceSportProfileSettings.a(var2, this.heartTouch_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      SportprofileAceSettings$PbAceSportProfileSettings.a(var2, this.autoStart_);
      int var6;
      if ((var3 & 4) == 4) {
         var6 = var4 | 4;
      } else {
         var6 = var4;
      }

      if (this.strideSensorCalibSettingsBuilder_ == null) {
         SportprofileAceSettings$PbAceSportProfileSettings.a(var2, this.strideSensorCalibSettings_);
      } else {
         SportprofileAceSettings$PbAceSportProfileSettings.a(var2, (Types$PbStrideSensorCalibSettings)this.strideSensorCalibSettingsBuilder_.build());
      }

      var4 = var6;
      if ((var3 & 8) == 8) {
         var4 = var6 | 8;
      }

      if (this.sirius2DisplaySettingsBuilder_ == null) {
         SportprofileAceSettings$PbAceSportProfileSettings.a(var2, this.sirius2DisplaySettings_);
      } else {
         SportprofileAceSettings$PbAceSportProfileSettings.a(var2, (SportprofileDisplays$PbSirius2DisplaySettings)this.sirius2DisplaySettingsBuilder_.build());
      }

      var6 = var4;
      if ((var3 & 16) == 16) {
         var6 = var4 | 16;
      }

      SportprofileAceSettings$PbAceSportProfileSettings.b(var2, this.gpsSetting_);
      int var5 = var6;
      if ((var3 & 32) == 32) {
         var5 = var6 | 32;
      }

      if (this.autolapSettingsBuilder_ == null) {
         SportprofileAceSettings$PbAceSportProfileSettings.a(var2, this.autolapSettings_);
      } else {
         SportprofileAceSettings$PbAceSportProfileSettings.a(var2, (Types$PbAutoLapSettings)this.autolapSettingsBuilder_.build());
      }

      var4 = var5;
      if ((var3 & 64) == 64) {
         var4 = var5 | 64;
      }

      SportprofileAceSettings$PbAceSportProfileSettings.c(var2, this.heartRateView_);
      var6 = var4;
      if ((var3 & 128) == 128) {
         var6 = var4 | 128;
      }

      if (this.autoPauseBuilder_ == null) {
         SportprofileAceSettings$PbAceSportProfileSettings.a(var2, this.autoPause_);
      } else {
         SportprofileAceSettings$PbAceSportProfileSettings.a(var2, (Types$PbAutoPause)this.autoPauseBuilder_.build());
      }

      SportprofileAceSettings$PbAceSportProfileSettings.d(var2, var6);
      this.onBuilt();
      return var2;
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder clear() {
      super.clear();
      this.heartTouch_ = 1;
      this.bitField0_ &= -2;
      this.autoStart_ = false;
      this.bitField0_ &= -3;
      if (this.strideSensorCalibSettingsBuilder_ == null) {
         this.strideSensorCalibSettings_ = null;
      } else {
         this.strideSensorCalibSettingsBuilder_.clear();
      }

      this.bitField0_ &= -5;
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         this.sirius2DisplaySettings_ = null;
      } else {
         this.sirius2DisplaySettingsBuilder_.clear();
      }

      this.bitField0_ &= -9;
      this.gpsSetting_ = 0;
      this.bitField0_ &= -17;
      if (this.autolapSettingsBuilder_ == null) {
         this.autolapSettings_ = null;
      } else {
         this.autolapSettingsBuilder_.clear();
      }

      this.bitField0_ &= -33;
      this.heartRateView_ = 1;
      this.bitField0_ &= -65;
      if (this.autoPauseBuilder_ == null) {
         this.autoPause_ = null;
      } else {
         this.autoPauseBuilder_.clear();
      }

      this.bitField0_ &= -129;
      return this;
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder clearAutoPause() {
      if (this.autoPauseBuilder_ == null) {
         this.autoPause_ = null;
         this.onChanged();
      } else {
         this.autoPauseBuilder_.clear();
      }

      this.bitField0_ &= -129;
      return this;
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder clearAutoStart() {
      this.bitField0_ &= -3;
      this.autoStart_ = false;
      this.onChanged();
      return this;
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder clearAutolapSettings() {
      if (this.autolapSettingsBuilder_ == null) {
         this.autolapSettings_ = null;
         this.onChanged();
      } else {
         this.autolapSettingsBuilder_.clear();
      }

      this.bitField0_ &= -33;
      return this;
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder clearField(FieldDescriptor var1) {
      return (SportprofileAceSettings$PbAceSportProfileSettings$Builder)super.clearField(var1);
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder clearGpsSetting() {
      this.bitField0_ &= -17;
      this.gpsSetting_ = 0;
      this.onChanged();
      return this;
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder clearHeartRateView() {
      this.bitField0_ &= -65;
      this.heartRateView_ = 1;
      this.onChanged();
      return this;
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder clearHeartTouch() {
      this.bitField0_ &= -2;
      this.heartTouch_ = 1;
      this.onChanged();
      return this;
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder clearOneof(OneofDescriptor var1) {
      return (SportprofileAceSettings$PbAceSportProfileSettings$Builder)super.clearOneof(var1);
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder clearSirius2DisplaySettings() {
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         this.sirius2DisplaySettings_ = null;
         this.onChanged();
      } else {
         this.sirius2DisplaySettingsBuilder_.clear();
      }

      this.bitField0_ &= -9;
      return this;
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder clearStrideSensorCalibSettings() {
      if (this.strideSensorCalibSettingsBuilder_ == null) {
         this.strideSensorCalibSettings_ = null;
         this.onChanged();
      } else {
         this.strideSensorCalibSettingsBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder clone() {
      return (SportprofileAceSettings$PbAceSportProfileSettings$Builder)super.clone();
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
      this.bitField0_ |= 128;
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
      this.bitField0_ |= 32;
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

   public SportprofileAceSettings$PbAceSportProfileSettings getDefaultInstanceForType() {
      return SportprofileAceSettings$PbAceSportProfileSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return SportprofileAceSettings.a();
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
      this.bitField0_ |= 8;
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
      this.bitField0_ |= 4;
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

   public boolean hasAutoPause() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
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
      if ((this.bitField0_ & 32) == 32) {
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
      if ((this.bitField0_ & 64) == 64) {
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
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStrideSensorCalibSettings() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportprofileAceSettings.b().ensureFieldAccessorsInitialized(SportprofileAceSettings$PbAceSportProfileSettings.class, SportprofileAceSettings$PbAceSportProfileSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (this.hasStrideSensorCalibSettings() && !this.getStrideSensorCalibSettings().isInitialized()) {
         var2 = var1;
      } else {
         if (this.hasAutolapSettings()) {
            var2 = var1;
            if (!this.getAutolapSettings().isInitialized()) {
               return var2;
            }
         }

         if (this.hasAutoPause()) {
            var2 = var1;
            if (!this.getAutoPause().isInitialized()) {
               return var2;
            }
         }

         var2 = true;
      }

      return var2;
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder mergeAutoPause(Types$PbAutoPause var1) {
      if (this.autoPauseBuilder_ == null) {
         if ((this.bitField0_ & 128) == 128 && this.autoPause_ != null && this.autoPause_ != Types$PbAutoPause.getDefaultInstance()) {
            this.autoPause_ = Types$PbAutoPause.newBuilder(this.autoPause_).mergeFrom(var1).buildPartial();
         } else {
            this.autoPause_ = var1;
         }

         this.onChanged();
      } else {
         this.autoPauseBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 128;
      return this;
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder mergeAutolapSettings(Types$PbAutoLapSettings var1) {
      if (this.autolapSettingsBuilder_ == null) {
         if ((this.bitField0_ & 32) == 32 && this.autolapSettings_ != null && this.autolapSettings_ != Types$PbAutoLapSettings.getDefaultInstance()) {
            this.autolapSettings_ = Types$PbAutoLapSettings.newBuilder(this.autolapSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.autolapSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.autolapSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      SportprofileAceSettings$PbAceSportProfileSettings var13;
      label96: {
         InvalidProtocolBufferException var12;
         SportprofileAceSettings$PbAceSportProfileSettings var14;
         try {
            var13 = (SportprofileAceSettings$PbAceSportProfileSettings)SportprofileAceSettings$PbAceSportProfileSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (SportprofileAceSettings$PbAceSportProfileSettings)var10.getUnfinishedMessage();
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

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder mergeFrom(Message var1) {
      SportprofileAceSettings$PbAceSportProfileSettings$Builder var2;
      if (var1 instanceof SportprofileAceSettings$PbAceSportProfileSettings) {
         var2 = this.mergeFrom((SportprofileAceSettings$PbAceSportProfileSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder mergeFrom(SportprofileAceSettings$PbAceSportProfileSettings var1) {
      if (var1 != SportprofileAceSettings$PbAceSportProfileSettings.getDefaultInstance()) {
         if (var1.hasHeartTouch()) {
            this.setHeartTouch(var1.getHeartTouch());
         }

         if (var1.hasAutoStart()) {
            this.setAutoStart(var1.getAutoStart());
         }

         if (var1.hasStrideSensorCalibSettings()) {
            this.mergeStrideSensorCalibSettings(var1.getStrideSensorCalibSettings());
         }

         if (var1.hasSirius2DisplaySettings()) {
            this.mergeSirius2DisplaySettings(var1.getSirius2DisplaySettings());
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

         if (var1.hasAutoPause()) {
            this.mergeAutoPause(var1.getAutoPause());
         }

         this.mergeUnknownFields(SportprofileAceSettings$PbAceSportProfileSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder mergeSirius2DisplaySettings(SportprofileDisplays$PbSirius2DisplaySettings var1) {
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         if ((this.bitField0_ & 8) == 8 && this.sirius2DisplaySettings_ != null && this.sirius2DisplaySettings_ != SportprofileDisplays$PbSirius2DisplaySettings.getDefaultInstance()) {
            this.sirius2DisplaySettings_ = SportprofileDisplays$PbSirius2DisplaySettings.newBuilder(this.sirius2DisplaySettings_).mergeFrom(var1).buildPartial();
         } else {
            this.sirius2DisplaySettings_ = var1;
         }

         this.onChanged();
      } else {
         this.sirius2DisplaySettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder mergeStrideSensorCalibSettings(Types$PbStrideSensorCalibSettings var1) {
      if (this.strideSensorCalibSettingsBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.strideSensorCalibSettings_ != null && this.strideSensorCalibSettings_ != Types$PbStrideSensorCalibSettings.getDefaultInstance()) {
            this.strideSensorCalibSettings_ = Types$PbStrideSensorCalibSettings.newBuilder(this.strideSensorCalibSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.strideSensorCalibSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.strideSensorCalibSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public final SportprofileAceSettings$PbAceSportProfileSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (SportprofileAceSettings$PbAceSportProfileSettings$Builder)super.mergeUnknownFields(var1);
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder setAutoPause(Types$PbAutoPause$Builder var1) {
      if (this.autoPauseBuilder_ == null) {
         this.autoPause_ = var1.build();
         this.onChanged();
      } else {
         this.autoPauseBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 128;
      return this;
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder setAutoPause(Types$PbAutoPause var1) {
      if (this.autoPauseBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.autoPause_ = var1;
         this.onChanged();
      } else {
         this.autoPauseBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 128;
      return this;
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder setAutoStart(boolean var1) {
      this.bitField0_ |= 2;
      this.autoStart_ = var1;
      this.onChanged();
      return this;
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder setAutolapSettings(Types$PbAutoLapSettings$Builder var1) {
      if (this.autolapSettingsBuilder_ == null) {
         this.autolapSettings_ = var1.build();
         this.onChanged();
      } else {
         this.autolapSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 32;
      return this;
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder setAutolapSettings(Types$PbAutoLapSettings var1) {
      if (this.autolapSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.autolapSettings_ = var1;
         this.onChanged();
      } else {
         this.autolapSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (SportprofileAceSettings$PbAceSportProfileSettings$Builder)super.setField(var1, var2);
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder setGpsSetting(Types$PbGPSSetting var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 16;
         this.gpsSetting_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder setHeartRateView(Types$PbHeartRateView var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 64;
         this.heartRateView_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder setHeartTouch(Types$PbHeartTouch var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.heartTouch_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (SportprofileAceSettings$PbAceSportProfileSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder setSirius2DisplaySettings(SportprofileDisplays$PbSirius2DisplaySettings$Builder var1) {
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         this.sirius2DisplaySettings_ = var1.build();
         this.onChanged();
      } else {
         this.sirius2DisplaySettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8;
      return this;
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder setSirius2DisplaySettings(SportprofileDisplays$PbSirius2DisplaySettings var1) {
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.sirius2DisplaySettings_ = var1;
         this.onChanged();
      } else {
         this.sirius2DisplaySettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder setStrideSensorCalibSettings(Types$PbStrideSensorCalibSettings$Builder var1) {
      if (this.strideSensorCalibSettingsBuilder_ == null) {
         this.strideSensorCalibSettings_ = var1.build();
         this.onChanged();
      } else {
         this.strideSensorCalibSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public SportprofileAceSettings$PbAceSportProfileSettings$Builder setStrideSensorCalibSettings(Types$PbStrideSensorCalibSettings var1) {
      if (this.strideSensorCalibSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.strideSensorCalibSettings_ = var1;
         this.onChanged();
      } else {
         this.strideSensorCalibSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public final SportprofileAceSettings$PbAceSportProfileSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (SportprofileAceSettings$PbAceSportProfileSettings$Builder)super.setUnknownFields(var1);
   }
}
