package fi.polar.remote.representation.protobuf;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class SportprofileVectraSettings$PbVectraSportProfileSettings$Builder extends Builder implements SportprofileVectraSettings$PbVectraSportProfileSettingsOrBuilder {
   private int bitField0_;
   private int gpsSetting_;
   private int heartRateView_;
   private boolean vibration_;

   private SportprofileVectraSettings$PbVectraSportProfileSettings$Builder() {
      this.heartRateView_ = 1;
      this.gpsSetting_ = 0;
      this.maybeForceBuilderInitialization();
   }

   private SportprofileVectraSettings$PbVectraSportProfileSettings$Builder(BuilderParent var1) {
      super(var1);
      this.heartRateView_ = 1;
      this.gpsSetting_ = 0;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   SportprofileVectraSettings$PbVectraSportProfileSettings$Builder(BuilderParent var1, SportprofileVectraSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   SportprofileVectraSettings$PbVectraSportProfileSettings$Builder(SportprofileVectraSettings$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return SportprofileVectraSettings.a();
   }

   private void maybeForceBuilderInitialization() {
      if (SportprofileVectraSettings$PbVectraSportProfileSettings.b()) {
      }

   }

   public SportprofileVectraSettings$PbVectraSportProfileSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (SportprofileVectraSettings$PbVectraSportProfileSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public SportprofileVectraSettings$PbVectraSportProfileSettings build() {
      SportprofileVectraSettings$PbVectraSportProfileSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public SportprofileVectraSettings$PbVectraSportProfileSettings buildPartial() {
      byte var1 = 1;
      SportprofileVectraSettings$PbVectraSportProfileSettings var2 = new SportprofileVectraSettings$PbVectraSportProfileSettings(this, (SportprofileVectraSettings$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      SportprofileVectraSettings$PbVectraSportProfileSettings.a(var2, this.vibration_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      SportprofileVectraSettings$PbVectraSportProfileSettings.a(var2, this.heartRateView_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      SportprofileVectraSettings$PbVectraSportProfileSettings.b(var2, this.gpsSetting_);
      SportprofileVectraSettings$PbVectraSportProfileSettings.c(var2, var5);
      this.onBuilt();
      return var2;
   }

   public SportprofileVectraSettings$PbVectraSportProfileSettings$Builder clear() {
      super.clear();
      this.vibration_ = false;
      this.bitField0_ &= -2;
      this.heartRateView_ = 1;
      this.bitField0_ &= -3;
      this.gpsSetting_ = 0;
      this.bitField0_ &= -5;
      return this;
   }

   public SportprofileVectraSettings$PbVectraSportProfileSettings$Builder clearField(FieldDescriptor var1) {
      return (SportprofileVectraSettings$PbVectraSportProfileSettings$Builder)super.clearField(var1);
   }

   public SportprofileVectraSettings$PbVectraSportProfileSettings$Builder clearGpsSetting() {
      this.bitField0_ &= -5;
      this.gpsSetting_ = 0;
      this.onChanged();
      return this;
   }

   public SportprofileVectraSettings$PbVectraSportProfileSettings$Builder clearHeartRateView() {
      this.bitField0_ &= -3;
      this.heartRateView_ = 1;
      this.onChanged();
      return this;
   }

   public SportprofileVectraSettings$PbVectraSportProfileSettings$Builder clearOneof(OneofDescriptor var1) {
      return (SportprofileVectraSettings$PbVectraSportProfileSettings$Builder)super.clearOneof(var1);
   }

   public SportprofileVectraSettings$PbVectraSportProfileSettings$Builder clearVibration() {
      this.bitField0_ &= -2;
      this.vibration_ = false;
      this.onChanged();
      return this;
   }

   public SportprofileVectraSettings$PbVectraSportProfileSettings$Builder clone() {
      return (SportprofileVectraSettings$PbVectraSportProfileSettings$Builder)super.clone();
   }

   public SportprofileVectraSettings$PbVectraSportProfileSettings getDefaultInstanceForType() {
      return SportprofileVectraSettings$PbVectraSportProfileSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return SportprofileVectraSettings.a();
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
      if ((this.bitField0_ & 2) == 2) {
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
      return SportprofileVectraSettings.b().ensureFieldAccessorsInitialized(SportprofileVectraSettings$PbVectraSportProfileSettings.class, SportprofileVectraSettings$PbVectraSportProfileSettings$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public SportprofileVectraSettings$PbVectraSportProfileSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      SportprofileVectraSettings$PbVectraSportProfileSettings var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (SportprofileVectraSettings$PbVectraSportProfileSettings)SportprofileVectraSettings$PbVectraSportProfileSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (SportprofileVectraSettings$PbVectraSportProfileSettings)var10.getUnfinishedMessage();
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

   public SportprofileVectraSettings$PbVectraSportProfileSettings$Builder mergeFrom(Message var1) {
      SportprofileVectraSettings$PbVectraSportProfileSettings$Builder var2;
      if (var1 instanceof SportprofileVectraSettings$PbVectraSportProfileSettings) {
         var2 = this.mergeFrom((SportprofileVectraSettings$PbVectraSportProfileSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public SportprofileVectraSettings$PbVectraSportProfileSettings$Builder mergeFrom(SportprofileVectraSettings$PbVectraSportProfileSettings var1) {
      if (var1 != SportprofileVectraSettings$PbVectraSportProfileSettings.getDefaultInstance()) {
         if (var1.hasVibration()) {
            this.setVibration(var1.getVibration());
         }

         if (var1.hasHeartRateView()) {
            this.setHeartRateView(var1.getHeartRateView());
         }

         if (var1.hasGpsSetting()) {
            this.setGpsSetting(var1.getGpsSetting());
         }

         this.mergeUnknownFields(SportprofileVectraSettings$PbVectraSportProfileSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final SportprofileVectraSettings$PbVectraSportProfileSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (SportprofileVectraSettings$PbVectraSportProfileSettings$Builder)super.mergeUnknownFields(var1);
   }

   public SportprofileVectraSettings$PbVectraSportProfileSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (SportprofileVectraSettings$PbVectraSportProfileSettings$Builder)super.setField(var1, var2);
   }

   public SportprofileVectraSettings$PbVectraSportProfileSettings$Builder setGpsSetting(Types$PbGPSSetting var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 4;
         this.gpsSetting_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportprofileVectraSettings$PbVectraSportProfileSettings$Builder setHeartRateView(Types$PbHeartRateView var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.heartRateView_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportprofileVectraSettings$PbVectraSportProfileSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (SportprofileVectraSettings$PbVectraSportProfileSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final SportprofileVectraSettings$PbVectraSportProfileSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (SportprofileVectraSettings$PbVectraSportProfileSettings$Builder)super.setUnknownFields(var1);
   }

   public SportprofileVectraSettings$PbVectraSportProfileSettings$Builder setVibration(boolean var1) {
      this.bitField0_ |= 1;
      this.vibration_ = var1;
      this.onChanged();
      return this;
   }
}
