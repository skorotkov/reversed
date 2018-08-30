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

public final class UserDeviceSettings$PbUserSafetyLightSettings$Builder extends Builder implements UserDeviceSettings$PbUserSafetyLightSettingsOrBuilder {
   private int activationLevel_;
   private int bitField0_;
   private int blinkRate_;
   private int mode_;

   private UserDeviceSettings$PbUserSafetyLightSettings$Builder() {
      this.mode_ = 1;
      this.activationLevel_ = 1;
      this.blinkRate_ = 1;
      this.maybeForceBuilderInitialization();
   }

   private UserDeviceSettings$PbUserSafetyLightSettings$Builder(BuilderParent var1) {
      super(var1);
      this.mode_ = 1;
      this.activationLevel_ = 1;
      this.blinkRate_ = 1;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserSafetyLightSettings$Builder(BuilderParent var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserSafetyLightSettings$Builder(UserDeviceSettings$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.q();
   }

   private void maybeForceBuilderInitialization() {
      if (UserDeviceSettings$PbUserSafetyLightSettings.b()) {
      }

   }

   public UserDeviceSettings$PbUserSafetyLightSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserSafetyLightSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public UserDeviceSettings$PbUserSafetyLightSettings build() {
      UserDeviceSettings$PbUserSafetyLightSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public UserDeviceSettings$PbUserSafetyLightSettings buildPartial() {
      byte var1 = 1;
      UserDeviceSettings$PbUserSafetyLightSettings var2 = new UserDeviceSettings$PbUserSafetyLightSettings(this, (UserDeviceSettings$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      UserDeviceSettings$PbUserSafetyLightSettings.a(var2, this.mode_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      UserDeviceSettings$PbUserSafetyLightSettings.b(var2, this.activationLevel_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      UserDeviceSettings$PbUserSafetyLightSettings.c(var2, this.blinkRate_);
      UserDeviceSettings$PbUserSafetyLightSettings.d(var2, var5);
      this.onBuilt();
      return var2;
   }

   public UserDeviceSettings$PbUserSafetyLightSettings$Builder clear() {
      super.clear();
      this.mode_ = 1;
      this.bitField0_ &= -2;
      this.activationLevel_ = 1;
      this.bitField0_ &= -3;
      this.blinkRate_ = 1;
      this.bitField0_ &= -5;
      return this;
   }

   public UserDeviceSettings$PbUserSafetyLightSettings$Builder clearActivationLevel() {
      this.bitField0_ &= -3;
      this.activationLevel_ = 1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserSafetyLightSettings$Builder clearBlinkRate() {
      this.bitField0_ &= -5;
      this.blinkRate_ = 1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserSafetyLightSettings$Builder clearField(FieldDescriptor var1) {
      return (UserDeviceSettings$PbUserSafetyLightSettings$Builder)super.clearField(var1);
   }

   public UserDeviceSettings$PbUserSafetyLightSettings$Builder clearMode() {
      this.bitField0_ &= -2;
      this.mode_ = 1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserSafetyLightSettings$Builder clearOneof(OneofDescriptor var1) {
      return (UserDeviceSettings$PbUserSafetyLightSettings$Builder)super.clearOneof(var1);
   }

   public UserDeviceSettings$PbUserSafetyLightSettings$Builder clone() {
      return (UserDeviceSettings$PbUserSafetyLightSettings$Builder)super.clone();
   }

   public UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightActivationLevel getActivationLevel() {
      UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightActivationLevel var1 = UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightActivationLevel.valueOf(this.activationLevel_);
      UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightActivationLevel var2 = var1;
      if (var1 == null) {
         var2 = UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightActivationLevel.ACTIVATION_LEVEL_DARK;
      }

      return var2;
   }

   public UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightBlinkRate getBlinkRate() {
      UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightBlinkRate var1 = UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightBlinkRate.valueOf(this.blinkRate_);
      UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightBlinkRate var2 = var1;
      if (var1 == null) {
         var2 = UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightBlinkRate.BLINK_RATE_OFF;
      }

      return var2;
   }

   public UserDeviceSettings$PbUserSafetyLightSettings getDefaultInstanceForType() {
      return UserDeviceSettings$PbUserSafetyLightSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return UserDeviceSettings.q();
   }

   public UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightMode getMode() {
      UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightMode var1 = UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightMode.valueOf(this.mode_);
      UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightMode var2 = var1;
      if (var1 == null) {
         var2 = UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightMode.SAFETY_LIGHT_MANUAL;
      }

      return var2;
   }

   public boolean hasActivationLevel() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasBlinkRate() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMode() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.r().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserSafetyLightSettings.class, UserDeviceSettings$PbUserSafetyLightSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasMode()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserSafetyLightSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      UserDeviceSettings$PbUserSafetyLightSettings var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (UserDeviceSettings$PbUserSafetyLightSettings)UserDeviceSettings$PbUserSafetyLightSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (UserDeviceSettings$PbUserSafetyLightSettings)var10.getUnfinishedMessage();
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

   public UserDeviceSettings$PbUserSafetyLightSettings$Builder mergeFrom(Message var1) {
      UserDeviceSettings$PbUserSafetyLightSettings$Builder var2;
      if (var1 instanceof UserDeviceSettings$PbUserSafetyLightSettings) {
         var2 = this.mergeFrom((UserDeviceSettings$PbUserSafetyLightSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public UserDeviceSettings$PbUserSafetyLightSettings$Builder mergeFrom(UserDeviceSettings$PbUserSafetyLightSettings var1) {
      if (var1 != UserDeviceSettings$PbUserSafetyLightSettings.getDefaultInstance()) {
         if (var1.hasMode()) {
            this.setMode(var1.getMode());
         }

         if (var1.hasActivationLevel()) {
            this.setActivationLevel(var1.getActivationLevel());
         }

         if (var1.hasBlinkRate()) {
            this.setBlinkRate(var1.getBlinkRate());
         }

         this.mergeUnknownFields(UserDeviceSettings$PbUserSafetyLightSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final UserDeviceSettings$PbUserSafetyLightSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserSafetyLightSettings$Builder)super.mergeUnknownFields(var1);
   }

   public UserDeviceSettings$PbUserSafetyLightSettings$Builder setActivationLevel(UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightActivationLevel var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.activationLevel_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public UserDeviceSettings$PbUserSafetyLightSettings$Builder setBlinkRate(UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightBlinkRate var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 4;
         this.blinkRate_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public UserDeviceSettings$PbUserSafetyLightSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserSafetyLightSettings$Builder)super.setField(var1, var2);
   }

   public UserDeviceSettings$PbUserSafetyLightSettings$Builder setMode(UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightMode var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.mode_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public UserDeviceSettings$PbUserSafetyLightSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (UserDeviceSettings$PbUserSafetyLightSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final UserDeviceSettings$PbUserSafetyLightSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserSafetyLightSettings$Builder)super.setUnknownFields(var1);
   }
}
