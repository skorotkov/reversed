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

public final class SportprofileAstraSettings$PbAstraSportProfileSettings$Builder extends Builder implements SportprofileAstraSettings$PbAstraSportProfileSettingsOrBuilder {
   private int bitField0_;
   private int heartRateView_;
   private boolean vibration_;

   private SportprofileAstraSettings$PbAstraSportProfileSettings$Builder() {
      this.heartRateView_ = 1;
      this.maybeForceBuilderInitialization();
   }

   private SportprofileAstraSettings$PbAstraSportProfileSettings$Builder(BuilderParent var1) {
      super(var1);
      this.heartRateView_ = 1;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   SportprofileAstraSettings$PbAstraSportProfileSettings$Builder(BuilderParent var1, SportprofileAstraSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   SportprofileAstraSettings$PbAstraSportProfileSettings$Builder(SportprofileAstraSettings$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return SportprofileAstraSettings.a();
   }

   private void maybeForceBuilderInitialization() {
      if (SportprofileAstraSettings$PbAstraSportProfileSettings.b()) {
      }

   }

   public SportprofileAstraSettings$PbAstraSportProfileSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (SportprofileAstraSettings$PbAstraSportProfileSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public SportprofileAstraSettings$PbAstraSportProfileSettings build() {
      SportprofileAstraSettings$PbAstraSportProfileSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public SportprofileAstraSettings$PbAstraSportProfileSettings buildPartial() {
      byte var1 = 1;
      SportprofileAstraSettings$PbAstraSportProfileSettings var2 = new SportprofileAstraSettings$PbAstraSportProfileSettings(this, (SportprofileAstraSettings$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      SportprofileAstraSettings$PbAstraSportProfileSettings.a(var2, this.vibration_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      SportprofileAstraSettings$PbAstraSportProfileSettings.a(var2, this.heartRateView_);
      SportprofileAstraSettings$PbAstraSportProfileSettings.b(var2, var4);
      this.onBuilt();
      return var2;
   }

   public SportprofileAstraSettings$PbAstraSportProfileSettings$Builder clear() {
      super.clear();
      this.vibration_ = false;
      this.bitField0_ &= -2;
      this.heartRateView_ = 1;
      this.bitField0_ &= -3;
      return this;
   }

   public SportprofileAstraSettings$PbAstraSportProfileSettings$Builder clearField(FieldDescriptor var1) {
      return (SportprofileAstraSettings$PbAstraSportProfileSettings$Builder)super.clearField(var1);
   }

   public SportprofileAstraSettings$PbAstraSportProfileSettings$Builder clearHeartRateView() {
      this.bitField0_ &= -3;
      this.heartRateView_ = 1;
      this.onChanged();
      return this;
   }

   public SportprofileAstraSettings$PbAstraSportProfileSettings$Builder clearOneof(OneofDescriptor var1) {
      return (SportprofileAstraSettings$PbAstraSportProfileSettings$Builder)super.clearOneof(var1);
   }

   public SportprofileAstraSettings$PbAstraSportProfileSettings$Builder clearVibration() {
      this.bitField0_ &= -2;
      this.vibration_ = false;
      this.onChanged();
      return this;
   }

   public SportprofileAstraSettings$PbAstraSportProfileSettings$Builder clone() {
      return (SportprofileAstraSettings$PbAstraSportProfileSettings$Builder)super.clone();
   }

   public SportprofileAstraSettings$PbAstraSportProfileSettings getDefaultInstanceForType() {
      return SportprofileAstraSettings$PbAstraSportProfileSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return SportprofileAstraSettings.a();
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
      return SportprofileAstraSettings.b().ensureFieldAccessorsInitialized(SportprofileAstraSettings$PbAstraSportProfileSettings.class, SportprofileAstraSettings$PbAstraSportProfileSettings$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public SportprofileAstraSettings$PbAstraSportProfileSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      SportprofileAstraSettings$PbAstraSportProfileSettings var13;
      label96: {
         InvalidProtocolBufferException var12;
         SportprofileAstraSettings$PbAstraSportProfileSettings var14;
         try {
            var13 = (SportprofileAstraSettings$PbAstraSportProfileSettings)SportprofileAstraSettings$PbAstraSportProfileSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (SportprofileAstraSettings$PbAstraSportProfileSettings)var10.getUnfinishedMessage();
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

   public SportprofileAstraSettings$PbAstraSportProfileSettings$Builder mergeFrom(Message var1) {
      SportprofileAstraSettings$PbAstraSportProfileSettings$Builder var2;
      if (var1 instanceof SportprofileAstraSettings$PbAstraSportProfileSettings) {
         var2 = this.mergeFrom((SportprofileAstraSettings$PbAstraSportProfileSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public SportprofileAstraSettings$PbAstraSportProfileSettings$Builder mergeFrom(SportprofileAstraSettings$PbAstraSportProfileSettings var1) {
      if (var1 != SportprofileAstraSettings$PbAstraSportProfileSettings.getDefaultInstance()) {
         if (var1.hasVibration()) {
            this.setVibration(var1.getVibration());
         }

         if (var1.hasHeartRateView()) {
            this.setHeartRateView(var1.getHeartRateView());
         }

         this.mergeUnknownFields(SportprofileAstraSettings$PbAstraSportProfileSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final SportprofileAstraSettings$PbAstraSportProfileSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (SportprofileAstraSettings$PbAstraSportProfileSettings$Builder)super.mergeUnknownFields(var1);
   }

   public SportprofileAstraSettings$PbAstraSportProfileSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (SportprofileAstraSettings$PbAstraSportProfileSettings$Builder)super.setField(var1, var2);
   }

   public SportprofileAstraSettings$PbAstraSportProfileSettings$Builder setHeartRateView(Types$PbHeartRateView var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.heartRateView_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportprofileAstraSettings$PbAstraSportProfileSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (SportprofileAstraSettings$PbAstraSportProfileSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final SportprofileAstraSettings$PbAstraSportProfileSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (SportprofileAstraSettings$PbAstraSportProfileSettings$Builder)super.setUnknownFields(var1);
   }

   public SportprofileAstraSettings$PbAstraSportProfileSettings$Builder setVibration(boolean var1) {
      this.bitField0_ |= 1;
      this.vibration_ = var1;
      this.onChanged();
      return this;
   }
}
