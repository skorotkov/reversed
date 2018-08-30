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

public final class UserDeviceSettings$PbUserDeviceResearchSettings$Builder extends Builder implements UserDeviceSettings$PbUserDeviceResearchSettingsOrBuilder {
   private boolean accelerometerRawDataEnable_;
   private int bitField0_;
   private boolean gpsDataEnable_;
   private boolean gyroscopeRawDataEnable_;
   private boolean linearAccelerationDataEnable_;
   private boolean magnetometerRawDataEnable_;

   private UserDeviceSettings$PbUserDeviceResearchSettings$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private UserDeviceSettings$PbUserDeviceResearchSettings$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceResearchSettings$Builder(BuilderParent var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceResearchSettings$Builder(UserDeviceSettings$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.o();
   }

   private void maybeForceBuilderInitialization() {
      if (UserDeviceSettings$PbUserDeviceResearchSettings.b()) {
      }

   }

   public UserDeviceSettings$PbUserDeviceResearchSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserDeviceResearchSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings build() {
      UserDeviceSettings$PbUserDeviceResearchSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings buildPartial() {
      byte var1 = 1;
      UserDeviceSettings$PbUserDeviceResearchSettings var2 = new UserDeviceSettings$PbUserDeviceResearchSettings(this, (UserDeviceSettings$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      UserDeviceSettings$PbUserDeviceResearchSettings.a(var2, this.accelerometerRawDataEnable_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      UserDeviceSettings$PbUserDeviceResearchSettings.b(var2, this.gyroscopeRawDataEnable_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      UserDeviceSettings$PbUserDeviceResearchSettings.c(var2, this.magnetometerRawDataEnable_);
      var4 = var5;
      if ((var3 & 8) == 8) {
         var4 = var5 | 8;
      }

      UserDeviceSettings$PbUserDeviceResearchSettings.d(var2, this.linearAccelerationDataEnable_);
      var5 = var4;
      if ((var3 & 16) == 16) {
         var5 = var4 | 16;
      }

      UserDeviceSettings$PbUserDeviceResearchSettings.e(var2, this.gpsDataEnable_);
      UserDeviceSettings$PbUserDeviceResearchSettings.a(var2, var5);
      this.onBuilt();
      return var2;
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings$Builder clear() {
      super.clear();
      this.accelerometerRawDataEnable_ = false;
      this.bitField0_ &= -2;
      this.gyroscopeRawDataEnable_ = false;
      this.bitField0_ &= -3;
      this.magnetometerRawDataEnable_ = false;
      this.bitField0_ &= -5;
      this.linearAccelerationDataEnable_ = false;
      this.bitField0_ &= -9;
      this.gpsDataEnable_ = false;
      this.bitField0_ &= -17;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings$Builder clearAccelerometerRawDataEnable() {
      this.bitField0_ &= -2;
      this.accelerometerRawDataEnable_ = false;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings$Builder clearField(FieldDescriptor var1) {
      return (UserDeviceSettings$PbUserDeviceResearchSettings$Builder)super.clearField(var1);
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings$Builder clearGpsDataEnable() {
      this.bitField0_ &= -17;
      this.gpsDataEnable_ = false;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings$Builder clearGyroscopeRawDataEnable() {
      this.bitField0_ &= -3;
      this.gyroscopeRawDataEnable_ = false;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings$Builder clearLinearAccelerationDataEnable() {
      this.bitField0_ &= -9;
      this.linearAccelerationDataEnable_ = false;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings$Builder clearMagnetometerRawDataEnable() {
      this.bitField0_ &= -5;
      this.magnetometerRawDataEnable_ = false;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings$Builder clearOneof(OneofDescriptor var1) {
      return (UserDeviceSettings$PbUserDeviceResearchSettings$Builder)super.clearOneof(var1);
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings$Builder clone() {
      return (UserDeviceSettings$PbUserDeviceResearchSettings$Builder)super.clone();
   }

   public boolean getAccelerometerRawDataEnable() {
      return this.accelerometerRawDataEnable_;
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings getDefaultInstanceForType() {
      return UserDeviceSettings$PbUserDeviceResearchSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return UserDeviceSettings.o();
   }

   public boolean getGpsDataEnable() {
      return this.gpsDataEnable_;
   }

   public boolean getGyroscopeRawDataEnable() {
      return this.gyroscopeRawDataEnable_;
   }

   public boolean getLinearAccelerationDataEnable() {
      return this.linearAccelerationDataEnable_;
   }

   public boolean getMagnetometerRawDataEnable() {
      return this.magnetometerRawDataEnable_;
   }

   public boolean hasAccelerometerRawDataEnable() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasGpsDataEnable() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasGyroscopeRawDataEnable() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLinearAccelerationDataEnable() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMagnetometerRawDataEnable() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.p().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserDeviceResearchSettings.class, UserDeviceSettings$PbUserDeviceResearchSettings$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      UserDeviceSettings$PbUserDeviceResearchSettings var13;
      label96: {
         InvalidProtocolBufferException var12;
         UserDeviceSettings$PbUserDeviceResearchSettings var14;
         try {
            var13 = (UserDeviceSettings$PbUserDeviceResearchSettings)UserDeviceSettings$PbUserDeviceResearchSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (UserDeviceSettings$PbUserDeviceResearchSettings)var10.getUnfinishedMessage();
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

   public UserDeviceSettings$PbUserDeviceResearchSettings$Builder mergeFrom(Message var1) {
      UserDeviceSettings$PbUserDeviceResearchSettings$Builder var2;
      if (var1 instanceof UserDeviceSettings$PbUserDeviceResearchSettings) {
         var2 = this.mergeFrom((UserDeviceSettings$PbUserDeviceResearchSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings$Builder mergeFrom(UserDeviceSettings$PbUserDeviceResearchSettings var1) {
      if (var1 != UserDeviceSettings$PbUserDeviceResearchSettings.getDefaultInstance()) {
         if (var1.hasAccelerometerRawDataEnable()) {
            this.setAccelerometerRawDataEnable(var1.getAccelerometerRawDataEnable());
         }

         if (var1.hasGyroscopeRawDataEnable()) {
            this.setGyroscopeRawDataEnable(var1.getGyroscopeRawDataEnable());
         }

         if (var1.hasMagnetometerRawDataEnable()) {
            this.setMagnetometerRawDataEnable(var1.getMagnetometerRawDataEnable());
         }

         if (var1.hasLinearAccelerationDataEnable()) {
            this.setLinearAccelerationDataEnable(var1.getLinearAccelerationDataEnable());
         }

         if (var1.hasGpsDataEnable()) {
            this.setGpsDataEnable(var1.getGpsDataEnable());
         }

         this.mergeUnknownFields(UserDeviceSettings$PbUserDeviceResearchSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final UserDeviceSettings$PbUserDeviceResearchSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserDeviceResearchSettings$Builder)super.mergeUnknownFields(var1);
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings$Builder setAccelerometerRawDataEnable(boolean var1) {
      this.bitField0_ |= 1;
      this.accelerometerRawDataEnable_ = var1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserDeviceResearchSettings$Builder)super.setField(var1, var2);
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings$Builder setGpsDataEnable(boolean var1) {
      this.bitField0_ |= 16;
      this.gpsDataEnable_ = var1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings$Builder setGyroscopeRawDataEnable(boolean var1) {
      this.bitField0_ |= 2;
      this.gyroscopeRawDataEnable_ = var1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings$Builder setLinearAccelerationDataEnable(boolean var1) {
      this.bitField0_ |= 8;
      this.linearAccelerationDataEnable_ = var1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings$Builder setMagnetometerRawDataEnable(boolean var1) {
      this.bitField0_ |= 4;
      this.magnetometerRawDataEnable_ = var1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (UserDeviceSettings$PbUserDeviceResearchSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final UserDeviceSettings$PbUserDeviceResearchSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserDeviceResearchSettings$Builder)super.setUnknownFields(var1);
   }
}
