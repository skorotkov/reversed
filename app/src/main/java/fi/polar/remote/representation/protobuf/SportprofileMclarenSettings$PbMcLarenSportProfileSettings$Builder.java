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

public final class SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder extends Builder implements SportprofileMclarenSettings$PbMcLarenSportProfileSettingsOrBuilder {
   private boolean autoStart_;
   private SingleFieldBuilderV3 autolapSettingsBuilder_;
   private Types$PbAutoLapSettings autolapSettings_;
   private int bitField0_;
   private int gpsSetting_;
   private int heartRateView_;
   private SingleFieldBuilderV3 sirius2DisplaySettingsBuilder_;
   private SportprofileDisplays$PbSirius2DisplaySettings sirius2DisplaySettings_;

   private SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder() {
      this.sirius2DisplaySettings_ = null;
      this.gpsSetting_ = 0;
      this.autolapSettings_ = null;
      this.heartRateView_ = 1;
      this.maybeForceBuilderInitialization();
   }

   private SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder(BuilderParent var1) {
      super(var1);
      this.sirius2DisplaySettings_ = null;
      this.gpsSetting_ = 0;
      this.autolapSettings_ = null;
      this.heartRateView_ = 1;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder(BuilderParent var1, SportprofileMclarenSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder(SportprofileMclarenSettings$1 var1) {
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
      return SportprofileMclarenSettings.a();
   }

   private SingleFieldBuilderV3 getSirius2DisplaySettingsFieldBuilder() {
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         this.sirius2DisplaySettingsBuilder_ = new SingleFieldBuilderV3(this.getSirius2DisplaySettings(), this.getParentForChildren(), this.isClean());
         this.sirius2DisplaySettings_ = null;
      }

      return this.sirius2DisplaySettingsBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (SportprofileMclarenSettings$PbMcLarenSportProfileSettings.b()) {
         this.getSirius2DisplaySettingsFieldBuilder();
         this.getAutolapSettingsFieldBuilder();
      }

   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings build() {
      SportprofileMclarenSettings$PbMcLarenSportProfileSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings buildPartial() {
      int var1 = 1;
      SportprofileMclarenSettings$PbMcLarenSportProfileSettings var2 = new SportprofileMclarenSettings$PbMcLarenSportProfileSettings(this, (SportprofileMclarenSettings$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      SportprofileMclarenSettings$PbMcLarenSportProfileSettings.a(var2, this.autoStart_);
      if ((var3 & 2) == 2) {
         var1 |= 2;
      }

      if (this.sirius2DisplaySettingsBuilder_ == null) {
         SportprofileMclarenSettings$PbMcLarenSportProfileSettings.a(var2, this.sirius2DisplaySettings_);
      } else {
         SportprofileMclarenSettings$PbMcLarenSportProfileSettings.a(var2, (SportprofileDisplays$PbSirius2DisplaySettings)this.sirius2DisplaySettingsBuilder_.build());
      }

      int var4 = var1;
      if ((var3 & 4) == 4) {
         var4 = var1 | 4;
      }

      SportprofileMclarenSettings$PbMcLarenSportProfileSettings.a(var2, this.gpsSetting_);
      var1 = var4;
      if ((var3 & 8) == 8) {
         var1 = var4 | 8;
      }

      if (this.autolapSettingsBuilder_ == null) {
         SportprofileMclarenSettings$PbMcLarenSportProfileSettings.a(var2, this.autolapSettings_);
      } else {
         SportprofileMclarenSettings$PbMcLarenSportProfileSettings.a(var2, (Types$PbAutoLapSettings)this.autolapSettingsBuilder_.build());
      }

      var4 = var1;
      if ((var3 & 16) == 16) {
         var4 = var1 | 16;
      }

      SportprofileMclarenSettings$PbMcLarenSportProfileSettings.b(var2, this.heartRateView_);
      SportprofileMclarenSettings$PbMcLarenSportProfileSettings.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder clear() {
      super.clear();
      this.autoStart_ = false;
      this.bitField0_ &= -2;
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         this.sirius2DisplaySettings_ = null;
      } else {
         this.sirius2DisplaySettingsBuilder_.clear();
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

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder clearAutoStart() {
      this.bitField0_ &= -2;
      this.autoStart_ = false;
      this.onChanged();
      return this;
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder clearAutolapSettings() {
      if (this.autolapSettingsBuilder_ == null) {
         this.autolapSettings_ = null;
         this.onChanged();
      } else {
         this.autolapSettingsBuilder_.clear();
      }

      this.bitField0_ &= -9;
      return this;
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder clearField(FieldDescriptor var1) {
      return (SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder)super.clearField(var1);
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder clearGpsSetting() {
      this.bitField0_ &= -5;
      this.gpsSetting_ = 0;
      this.onChanged();
      return this;
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder clearHeartRateView() {
      this.bitField0_ &= -17;
      this.heartRateView_ = 1;
      this.onChanged();
      return this;
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder clearOneof(OneofDescriptor var1) {
      return (SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder)super.clearOneof(var1);
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder clearSirius2DisplaySettings() {
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         this.sirius2DisplaySettings_ = null;
         this.onChanged();
      } else {
         this.sirius2DisplaySettingsBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder clone() {
      return (SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder)super.clone();
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

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings getDefaultInstanceForType() {
      return SportprofileMclarenSettings$PbMcLarenSportProfileSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return SportprofileMclarenSettings.a();
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
      this.bitField0_ |= 2;
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

   public boolean hasAutoStart() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
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

   public boolean hasSirius2DisplaySettings() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportprofileMclarenSettings.b().ensureFieldAccessorsInitialized(SportprofileMclarenSettings$PbMcLarenSportProfileSettings.class, SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasAutoStart() && (!this.hasAutolapSettings() || this.getAutolapSettings().isInitialized())) {
         var1 = true;
      }

      return var1;
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder mergeAutolapSettings(Types$PbAutoLapSettings var1) {
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

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      SportprofileMclarenSettings$PbMcLarenSportProfileSettings var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (SportprofileMclarenSettings$PbMcLarenSportProfileSettings)SportprofileMclarenSettings$PbMcLarenSportProfileSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (SportprofileMclarenSettings$PbMcLarenSportProfileSettings)var11.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var14.unwrapIOException();
         } catch (Throwable var10) {
            if (var13 != null) {
               this.mergeFrom(var13);
            }

            throw var10;
         }
      }

      if (var13 != null) {
         this.mergeFrom(var13);
      }

      return this;
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder mergeFrom(Message var1) {
      SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder var2;
      if (var1 instanceof SportprofileMclarenSettings$PbMcLarenSportProfileSettings) {
         var2 = this.mergeFrom((SportprofileMclarenSettings$PbMcLarenSportProfileSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder mergeFrom(SportprofileMclarenSettings$PbMcLarenSportProfileSettings var1) {
      if (var1 != SportprofileMclarenSettings$PbMcLarenSportProfileSettings.getDefaultInstance()) {
         if (var1.hasAutoStart()) {
            this.setAutoStart(var1.getAutoStart());
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

         this.mergeUnknownFields(SportprofileMclarenSettings$PbMcLarenSportProfileSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder mergeSirius2DisplaySettings(SportprofileDisplays$PbSirius2DisplaySettings var1) {
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.sirius2DisplaySettings_ != null && this.sirius2DisplaySettings_ != SportprofileDisplays$PbSirius2DisplaySettings.getDefaultInstance()) {
            this.sirius2DisplaySettings_ = SportprofileDisplays$PbSirius2DisplaySettings.newBuilder(this.sirius2DisplaySettings_).mergeFrom(var1).buildPartial();
         } else {
            this.sirius2DisplaySettings_ = var1;
         }

         this.onChanged();
      } else {
         this.sirius2DisplaySettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder)super.mergeUnknownFields(var1);
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder setAutoStart(boolean var1) {
      this.bitField0_ |= 1;
      this.autoStart_ = var1;
      this.onChanged();
      return this;
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder setAutolapSettings(Types$PbAutoLapSettings$Builder var1) {
      if (this.autolapSettingsBuilder_ == null) {
         this.autolapSettings_ = var1.build();
         this.onChanged();
      } else {
         this.autolapSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8;
      return this;
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder setAutolapSettings(Types$PbAutoLapSettings var1) {
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

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder)super.setField(var1, var2);
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder setGpsSetting(Types$PbGPSSetting var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 4;
         this.gpsSetting_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder setHeartRateView(Types$PbHeartRateView var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 16;
         this.heartRateView_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder setSirius2DisplaySettings(SportprofileDisplays$PbSirius2DisplaySettings$Builder var1) {
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         this.sirius2DisplaySettings_ = var1.build();
         this.onChanged();
      } else {
         this.sirius2DisplaySettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder setSirius2DisplaySettings(SportprofileDisplays$PbSirius2DisplaySettings var1) {
      if (this.sirius2DisplaySettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.sirius2DisplaySettings_ = var1;
         this.onChanged();
      } else {
         this.sirius2DisplaySettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (SportprofileMclarenSettings$PbMcLarenSportProfileSettings$Builder)super.setUnknownFields(var1);
   }
}
