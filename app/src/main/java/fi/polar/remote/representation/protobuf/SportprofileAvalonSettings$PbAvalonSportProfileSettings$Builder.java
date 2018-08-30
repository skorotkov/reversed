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

public final class SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder extends Builder implements SportprofileAvalonSettings$PbAvalonSportProfileSettingsOrBuilder {
   private boolean autoStart_;
   private SingleFieldBuilderV3 autolapSettingsBuilder_;
   private Types$PbAutoLapSettings autolapSettings_;
   private int bitField0_;
   private int heartRateView_;
   private int heartTouch_;
   private boolean vibration_;

   private SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder() {
      this.heartTouch_ = 1;
      this.autolapSettings_ = null;
      this.heartRateView_ = 1;
      this.maybeForceBuilderInitialization();
   }

   private SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder(BuilderParent var1) {
      super(var1);
      this.heartTouch_ = 1;
      this.autolapSettings_ = null;
      this.heartRateView_ = 1;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder(BuilderParent var1, SportprofileAvalonSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder(SportprofileAvalonSettings$1 var1) {
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
      return SportprofileAvalonSettings.a();
   }

   private void maybeForceBuilderInitialization() {
      if (SportprofileAvalonSettings$PbAvalonSportProfileSettings.b()) {
         this.getAutolapSettingsFieldBuilder();
      }

   }

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings build() {
      SportprofileAvalonSettings$PbAvalonSportProfileSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings buildPartial() {
      byte var1 = 1;
      SportprofileAvalonSettings$PbAvalonSportProfileSettings var2 = new SportprofileAvalonSettings$PbAvalonSportProfileSettings(this, (SportprofileAvalonSettings$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      SportprofileAvalonSettings$PbAvalonSportProfileSettings.a(var2, this.heartTouch_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      SportprofileAvalonSettings$PbAvalonSportProfileSettings.a(var2, this.vibration_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      SportprofileAvalonSettings$PbAvalonSportProfileSettings.b(var2, this.autoStart_);
      if ((var3 & 8) == 8) {
         var4 = var5 | 8;
      } else {
         var4 = var5;
      }

      if (this.autolapSettingsBuilder_ == null) {
         SportprofileAvalonSettings$PbAvalonSportProfileSettings.a(var2, this.autolapSettings_);
      } else {
         SportprofileAvalonSettings$PbAvalonSportProfileSettings.a(var2, (Types$PbAutoLapSettings)this.autolapSettingsBuilder_.build());
      }

      var5 = var4;
      if ((var3 & 16) == 16) {
         var5 = var4 | 16;
      }

      SportprofileAvalonSettings$PbAvalonSportProfileSettings.b(var2, this.heartRateView_);
      SportprofileAvalonSettings$PbAvalonSportProfileSettings.c(var2, var5);
      this.onBuilt();
      return var2;
   }

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder clear() {
      super.clear();
      this.heartTouch_ = 1;
      this.bitField0_ &= -2;
      this.vibration_ = false;
      this.bitField0_ &= -3;
      this.autoStart_ = false;
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

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder clearAutoStart() {
      this.bitField0_ &= -5;
      this.autoStart_ = false;
      this.onChanged();
      return this;
   }

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder clearAutolapSettings() {
      if (this.autolapSettingsBuilder_ == null) {
         this.autolapSettings_ = null;
         this.onChanged();
      } else {
         this.autolapSettingsBuilder_.clear();
      }

      this.bitField0_ &= -9;
      return this;
   }

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder clearField(FieldDescriptor var1) {
      return (SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder)super.clearField(var1);
   }

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder clearHeartRateView() {
      this.bitField0_ &= -17;
      this.heartRateView_ = 1;
      this.onChanged();
      return this;
   }

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder clearHeartTouch() {
      this.bitField0_ &= -2;
      this.heartTouch_ = 1;
      this.onChanged();
      return this;
   }

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder clearOneof(OneofDescriptor var1) {
      return (SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder)super.clearOneof(var1);
   }

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder clearVibration() {
      this.bitField0_ &= -3;
      this.vibration_ = false;
      this.onChanged();
      return this;
   }

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder clone() {
      return (SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder)super.clone();
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

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings getDefaultInstanceForType() {
      return SportprofileAvalonSettings$PbAvalonSportProfileSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return SportprofileAvalonSettings.a();
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

   public boolean getVibration() {
      return this.vibration_;
   }

   public boolean hasAutoStart() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
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

   public boolean hasHeartRateView() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
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

   public boolean hasVibration() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportprofileAvalonSettings.b().ensureFieldAccessorsInitialized(SportprofileAvalonSettings$PbAvalonSportProfileSettings.class, SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder.class);
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

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder mergeAutolapSettings(Types$PbAutoLapSettings var1) {
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

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      SportprofileAvalonSettings$PbAvalonSportProfileSettings var13;
      label96: {
         InvalidProtocolBufferException var12;
         SportprofileAvalonSettings$PbAvalonSportProfileSettings var14;
         try {
            var13 = (SportprofileAvalonSettings$PbAvalonSportProfileSettings)SportprofileAvalonSettings$PbAvalonSportProfileSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (SportprofileAvalonSettings$PbAvalonSportProfileSettings)var10.getUnfinishedMessage();
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

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder mergeFrom(Message var1) {
      SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder var2;
      if (var1 instanceof SportprofileAvalonSettings$PbAvalonSportProfileSettings) {
         var2 = this.mergeFrom((SportprofileAvalonSettings$PbAvalonSportProfileSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder mergeFrom(SportprofileAvalonSettings$PbAvalonSportProfileSettings var1) {
      if (var1 != SportprofileAvalonSettings$PbAvalonSportProfileSettings.getDefaultInstance()) {
         if (var1.hasHeartTouch()) {
            this.setHeartTouch(var1.getHeartTouch());
         }

         if (var1.hasVibration()) {
            this.setVibration(var1.getVibration());
         }

         if (var1.hasAutoStart()) {
            this.setAutoStart(var1.getAutoStart());
         }

         if (var1.hasAutolapSettings()) {
            this.mergeAutolapSettings(var1.getAutolapSettings());
         }

         if (var1.hasHeartRateView()) {
            this.setHeartRateView(var1.getHeartRateView());
         }

         this.mergeUnknownFields(SportprofileAvalonSettings$PbAvalonSportProfileSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder)super.mergeUnknownFields(var1);
   }

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder setAutoStart(boolean var1) {
      this.bitField0_ |= 4;
      this.autoStart_ = var1;
      this.onChanged();
      return this;
   }

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder setAutolapSettings(Types$PbAutoLapSettings$Builder var1) {
      if (this.autolapSettingsBuilder_ == null) {
         this.autolapSettings_ = var1.build();
         this.onChanged();
      } else {
         this.autolapSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8;
      return this;
   }

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder setAutolapSettings(Types$PbAutoLapSettings var1) {
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

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder)super.setField(var1, var2);
   }

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder setHeartRateView(Types$PbHeartRateView var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 16;
         this.heartRateView_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder setHeartTouch(Types$PbHeartTouch var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.heartTouch_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder)super.setUnknownFields(var1);
   }

   public SportprofileAvalonSettings$PbAvalonSportProfileSettings$Builder setVibration(boolean var1) {
      this.bitField0_ |= 2;
      this.vibration_ = var1;
      this.onChanged();
      return this;
   }
}
