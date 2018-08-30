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

public final class SportprofileAustinSettings$PbAustinSportProfileSettings$Builder extends Builder implements SportprofileAustinSettings$PbAustinSportProfileSettingsOrBuilder {
   private SingleFieldBuilderV3 alcorDisplaySettingsBuilder_;
   private SportprofileDisplays$PbAlcorDisplaySettings alcorDisplaySettings_;
   private SingleFieldBuilderV3 autolapSettingsBuilder_;
   private Types$PbAutoLapSettings autolapSettings_;
   private int bitField0_;
   private int gpsSetting_;
   private int heartRateView_;
   private boolean vibration_;

   private SportprofileAustinSettings$PbAustinSportProfileSettings$Builder() {
      this.alcorDisplaySettings_ = null;
      this.gpsSetting_ = 0;
      this.autolapSettings_ = null;
      this.heartRateView_ = 1;
      this.maybeForceBuilderInitialization();
   }

   private SportprofileAustinSettings$PbAustinSportProfileSettings$Builder(BuilderParent var1) {
      super(var1);
      this.alcorDisplaySettings_ = null;
      this.gpsSetting_ = 0;
      this.autolapSettings_ = null;
      this.heartRateView_ = 1;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   SportprofileAustinSettings$PbAustinSportProfileSettings$Builder(BuilderParent var1, SportprofileAustinSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   SportprofileAustinSettings$PbAustinSportProfileSettings$Builder(SportprofileAustinSettings$1 var1) {
      this();
   }

   private SingleFieldBuilderV3 getAlcorDisplaySettingsFieldBuilder() {
      if (this.alcorDisplaySettingsBuilder_ == null) {
         this.alcorDisplaySettingsBuilder_ = new SingleFieldBuilderV3(this.getAlcorDisplaySettings(), this.getParentForChildren(), this.isClean());
         this.alcorDisplaySettings_ = null;
      }

      return this.alcorDisplaySettingsBuilder_;
   }

   private SingleFieldBuilderV3 getAutolapSettingsFieldBuilder() {
      if (this.autolapSettingsBuilder_ == null) {
         this.autolapSettingsBuilder_ = new SingleFieldBuilderV3(this.getAutolapSettings(), this.getParentForChildren(), this.isClean());
         this.autolapSettings_ = null;
      }

      return this.autolapSettingsBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return SportprofileAustinSettings.a();
   }

   private void maybeForceBuilderInitialization() {
      if (SportprofileAustinSettings$PbAustinSportProfileSettings.b()) {
         this.getAlcorDisplaySettingsFieldBuilder();
         this.getAutolapSettingsFieldBuilder();
      }

   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (SportprofileAustinSettings$PbAustinSportProfileSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings build() {
      SportprofileAustinSettings$PbAustinSportProfileSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings buildPartial() {
      int var1 = 1;
      SportprofileAustinSettings$PbAustinSportProfileSettings var2 = new SportprofileAustinSettings$PbAustinSportProfileSettings(this, (SportprofileAustinSettings$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      SportprofileAustinSettings$PbAustinSportProfileSettings.a(var2, this.vibration_);
      if ((var3 & 2) == 2) {
         var1 |= 2;
      }

      if (this.alcorDisplaySettingsBuilder_ == null) {
         SportprofileAustinSettings$PbAustinSportProfileSettings.a(var2, this.alcorDisplaySettings_);
      } else {
         SportprofileAustinSettings$PbAustinSportProfileSettings.a(var2, (SportprofileDisplays$PbAlcorDisplaySettings)this.alcorDisplaySettingsBuilder_.build());
      }

      int var4 = var1;
      if ((var3 & 4) == 4) {
         var4 = var1 | 4;
      }

      SportprofileAustinSettings$PbAustinSportProfileSettings.a(var2, this.gpsSetting_);
      var1 = var4;
      if ((var3 & 8) == 8) {
         var1 = var4 | 8;
      }

      if (this.autolapSettingsBuilder_ == null) {
         SportprofileAustinSettings$PbAustinSportProfileSettings.a(var2, this.autolapSettings_);
      } else {
         SportprofileAustinSettings$PbAustinSportProfileSettings.a(var2, (Types$PbAutoLapSettings)this.autolapSettingsBuilder_.build());
      }

      var4 = var1;
      if ((var3 & 16) == 16) {
         var4 = var1 | 16;
      }

      SportprofileAustinSettings$PbAustinSportProfileSettings.b(var2, this.heartRateView_);
      SportprofileAustinSettings$PbAustinSportProfileSettings.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder clear() {
      super.clear();
      this.vibration_ = false;
      this.bitField0_ &= -2;
      if (this.alcorDisplaySettingsBuilder_ == null) {
         this.alcorDisplaySettings_ = null;
      } else {
         this.alcorDisplaySettingsBuilder_.clear();
      }

      this.bitField0_ &= -3;
      this.gpsSetting_ = 0;
      this.bitField0_ &= -5;
      if (this.autolapSettingsBuilder_ == null) {
         this.autolapSettings_ = null;
      } else {
         this.autolapSettingsBuilder_.clear();
      }

      this.bitField0_ &= -9;
      this.heartRateView_ = 1;
      this.bitField0_ &= -17;
      return this;
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder clearAlcorDisplaySettings() {
      if (this.alcorDisplaySettingsBuilder_ == null) {
         this.alcorDisplaySettings_ = null;
         this.onChanged();
      } else {
         this.alcorDisplaySettingsBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder clearAutolapSettings() {
      if (this.autolapSettingsBuilder_ == null) {
         this.autolapSettings_ = null;
         this.onChanged();
      } else {
         this.autolapSettingsBuilder_.clear();
      }

      this.bitField0_ &= -9;
      return this;
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder clearField(FieldDescriptor var1) {
      return (SportprofileAustinSettings$PbAustinSportProfileSettings$Builder)super.clearField(var1);
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder clearGpsSetting() {
      this.bitField0_ &= -5;
      this.gpsSetting_ = 0;
      this.onChanged();
      return this;
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder clearHeartRateView() {
      this.bitField0_ &= -17;
      this.heartRateView_ = 1;
      this.onChanged();
      return this;
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder clearOneof(OneofDescriptor var1) {
      return (SportprofileAustinSettings$PbAustinSportProfileSettings$Builder)super.clearOneof(var1);
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder clearVibration() {
      this.bitField0_ &= -2;
      this.vibration_ = false;
      this.onChanged();
      return this;
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder clone() {
      return (SportprofileAustinSettings$PbAustinSportProfileSettings$Builder)super.clone();
   }

   public SportprofileDisplays$PbAlcorDisplaySettings getAlcorDisplaySettings() {
      SportprofileDisplays$PbAlcorDisplaySettings var1;
      if (this.alcorDisplaySettingsBuilder_ == null) {
         if (this.alcorDisplaySettings_ == null) {
            var1 = SportprofileDisplays$PbAlcorDisplaySettings.getDefaultInstance();
         } else {
            var1 = this.alcorDisplaySettings_;
         }
      } else {
         var1 = (SportprofileDisplays$PbAlcorDisplaySettings)this.alcorDisplaySettingsBuilder_.getMessage();
      }

      return var1;
   }

   public SportprofileDisplays$PbAlcorDisplaySettings$Builder getAlcorDisplaySettingsBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (SportprofileDisplays$PbAlcorDisplaySettings$Builder)this.getAlcorDisplaySettingsFieldBuilder().getBuilder();
   }

   public SportprofileDisplays$PbAlcorDisplaySettingsOrBuilder getAlcorDisplaySettingsOrBuilder() {
      Object var1;
      if (this.alcorDisplaySettingsBuilder_ != null) {
         var1 = (SportprofileDisplays$PbAlcorDisplaySettingsOrBuilder)this.alcorDisplaySettingsBuilder_.getMessageOrBuilder();
      } else if (this.alcorDisplaySettings_ == null) {
         var1 = SportprofileDisplays$PbAlcorDisplaySettings.getDefaultInstance();
      } else {
         var1 = this.alcorDisplaySettings_;
      }

      return (SportprofileDisplays$PbAlcorDisplaySettingsOrBuilder)var1;
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
      this.bitField0_ |= 8;
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

   public SportprofileAustinSettings$PbAustinSportProfileSettings getDefaultInstanceForType() {
      return SportprofileAustinSettings$PbAustinSportProfileSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return SportprofileAustinSettings.a();
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

   public boolean getVibration() {
      return this.vibration_;
   }

   public boolean hasAlcorDisplaySettings() {
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
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasGpsSetting() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasHeartRateView() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasVibration() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportprofileAustinSettings.b().ensureFieldAccessorsInitialized(SportprofileAustinSettings$PbAustinSportProfileSettings.class, SportprofileAustinSettings$PbAustinSportProfileSettings$Builder.class);
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

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder mergeAlcorDisplaySettings(SportprofileDisplays$PbAlcorDisplaySettings var1) {
      if (this.alcorDisplaySettingsBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.alcorDisplaySettings_ != null && this.alcorDisplaySettings_ != SportprofileDisplays$PbAlcorDisplaySettings.getDefaultInstance()) {
            this.alcorDisplaySettings_ = SportprofileDisplays$PbAlcorDisplaySettings.newBuilder(this.alcorDisplaySettings_).mergeFrom(var1).buildPartial();
         } else {
            this.alcorDisplaySettings_ = var1;
         }

         this.onChanged();
      } else {
         this.alcorDisplaySettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder mergeAutolapSettings(Types$PbAutoLapSettings var1) {
      if (this.autolapSettingsBuilder_ == null) {
         if ((this.bitField0_ & 8) == 8 && this.autolapSettings_ != null && this.autolapSettings_ != Types$PbAutoLapSettings.getDefaultInstance()) {
            this.autolapSettings_ = Types$PbAutoLapSettings.newBuilder(this.autolapSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.autolapSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.autolapSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      SportprofileAustinSettings$PbAustinSportProfileSettings var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (SportprofileAustinSettings$PbAustinSportProfileSettings)SportprofileAustinSettings$PbAustinSportProfileSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (SportprofileAustinSettings$PbAustinSportProfileSettings)var10.getUnfinishedMessage();
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

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder mergeFrom(Message var1) {
      SportprofileAustinSettings$PbAustinSportProfileSettings$Builder var2;
      if (var1 instanceof SportprofileAustinSettings$PbAustinSportProfileSettings) {
         var2 = this.mergeFrom((SportprofileAustinSettings$PbAustinSportProfileSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder mergeFrom(SportprofileAustinSettings$PbAustinSportProfileSettings var1) {
      if (var1 != SportprofileAustinSettings$PbAustinSportProfileSettings.getDefaultInstance()) {
         if (var1.hasVibration()) {
            this.setVibration(var1.getVibration());
         }

         if (var1.hasAlcorDisplaySettings()) {
            this.mergeAlcorDisplaySettings(var1.getAlcorDisplaySettings());
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

         this.mergeUnknownFields(SportprofileAustinSettings$PbAustinSportProfileSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final SportprofileAustinSettings$PbAustinSportProfileSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (SportprofileAustinSettings$PbAustinSportProfileSettings$Builder)super.mergeUnknownFields(var1);
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder setAlcorDisplaySettings(SportprofileDisplays$PbAlcorDisplaySettings$Builder var1) {
      if (this.alcorDisplaySettingsBuilder_ == null) {
         this.alcorDisplaySettings_ = var1.build();
         this.onChanged();
      } else {
         this.alcorDisplaySettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder setAlcorDisplaySettings(SportprofileDisplays$PbAlcorDisplaySettings var1) {
      if (this.alcorDisplaySettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.alcorDisplaySettings_ = var1;
         this.onChanged();
      } else {
         this.alcorDisplaySettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder setAutolapSettings(Types$PbAutoLapSettings$Builder var1) {
      if (this.autolapSettingsBuilder_ == null) {
         this.autolapSettings_ = var1.build();
         this.onChanged();
      } else {
         this.autolapSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8;
      return this;
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder setAutolapSettings(Types$PbAutoLapSettings var1) {
      if (this.autolapSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.autolapSettings_ = var1;
         this.onChanged();
      } else {
         this.autolapSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (SportprofileAustinSettings$PbAustinSportProfileSettings$Builder)super.setField(var1, var2);
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder setGpsSetting(Types$PbGPSSetting var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 4;
         this.gpsSetting_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder setHeartRateView(Types$PbHeartRateView var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 16;
         this.heartRateView_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (SportprofileAustinSettings$PbAustinSportProfileSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final SportprofileAustinSettings$PbAustinSportProfileSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (SportprofileAustinSettings$PbAustinSportProfileSettings$Builder)super.setUnknownFields(var1);
   }

   public SportprofileAustinSettings$PbAustinSportProfileSettings$Builder setVibration(boolean var1) {
      this.bitField0_ |= 1;
      this.vibration_ = var1;
      this.onChanged();
      return this;
   }
}
