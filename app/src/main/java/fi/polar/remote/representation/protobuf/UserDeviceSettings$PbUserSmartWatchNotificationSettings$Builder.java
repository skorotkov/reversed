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

public final class UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder extends Builder implements UserDeviceSettings$PbUserSmartWatchNotificationSettingsOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 doNotDisturbSettingsBuilder_;
   private UserDeviceSettings$PbDoNotDisturbSettings doNotDisturbSettings_;
   private boolean enabled_;
   private boolean previewEnabled_;
   private boolean soundsEnabled_;

   private UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder() {
      this.doNotDisturbSettings_ = null;
      this.maybeForceBuilderInitialization();
   }

   private UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder(BuilderParent var1) {
      super(var1);
      this.doNotDisturbSettings_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder(BuilderParent var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder(UserDeviceSettings$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.u();
   }

   private SingleFieldBuilderV3 getDoNotDisturbSettingsFieldBuilder() {
      if (this.doNotDisturbSettingsBuilder_ == null) {
         this.doNotDisturbSettingsBuilder_ = new SingleFieldBuilderV3(this.getDoNotDisturbSettings(), this.getParentForChildren(), this.isClean());
         this.doNotDisturbSettings_ = null;
      }

      return this.doNotDisturbSettingsBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (UserDeviceSettings$PbUserSmartWatchNotificationSettings.b()) {
         this.getDoNotDisturbSettingsFieldBuilder();
      }

   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings build() {
      UserDeviceSettings$PbUserSmartWatchNotificationSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings buildPartial() {
      byte var1 = 1;
      UserDeviceSettings$PbUserSmartWatchNotificationSettings var2 = new UserDeviceSettings$PbUserSmartWatchNotificationSettings(this, (UserDeviceSettings$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      UserDeviceSettings$PbUserSmartWatchNotificationSettings.a(var2, this.enabled_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      UserDeviceSettings$PbUserSmartWatchNotificationSettings.b(var2, this.previewEnabled_);
      if ((var3 & 4) == 4) {
         var4 |= 4;
      }

      if (this.doNotDisturbSettingsBuilder_ == null) {
         UserDeviceSettings$PbUserSmartWatchNotificationSettings.a(var2, this.doNotDisturbSettings_);
      } else {
         UserDeviceSettings$PbUserSmartWatchNotificationSettings.a(var2, (UserDeviceSettings$PbDoNotDisturbSettings)this.doNotDisturbSettingsBuilder_.build());
      }

      int var5 = var4;
      if ((var3 & 8) == 8) {
         var5 = var4 | 8;
      }

      UserDeviceSettings$PbUserSmartWatchNotificationSettings.c(var2, this.soundsEnabled_);
      UserDeviceSettings$PbUserSmartWatchNotificationSettings.a(var2, var5);
      this.onBuilt();
      return var2;
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder clear() {
      super.clear();
      this.enabled_ = false;
      this.bitField0_ &= -2;
      this.previewEnabled_ = false;
      this.bitField0_ &= -3;
      if (this.doNotDisturbSettingsBuilder_ == null) {
         this.doNotDisturbSettings_ = null;
      } else {
         this.doNotDisturbSettingsBuilder_.clear();
      }

      this.bitField0_ &= -5;
      this.soundsEnabled_ = false;
      this.bitField0_ &= -9;
      return this;
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder clearDoNotDisturbSettings() {
      if (this.doNotDisturbSettingsBuilder_ == null) {
         this.doNotDisturbSettings_ = null;
         this.onChanged();
      } else {
         this.doNotDisturbSettingsBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder clearEnabled() {
      this.bitField0_ &= -2;
      this.enabled_ = false;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder clearField(FieldDescriptor var1) {
      return (UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder)super.clearField(var1);
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder clearOneof(OneofDescriptor var1) {
      return (UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder)super.clearOneof(var1);
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder clearPreviewEnabled() {
      this.bitField0_ &= -3;
      this.previewEnabled_ = false;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder clearSoundsEnabled() {
      this.bitField0_ &= -9;
      this.soundsEnabled_ = false;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder clone() {
      return (UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder)super.clone();
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings getDefaultInstanceForType() {
      return UserDeviceSettings$PbUserSmartWatchNotificationSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return UserDeviceSettings.u();
   }

   public UserDeviceSettings$PbDoNotDisturbSettings getDoNotDisturbSettings() {
      UserDeviceSettings$PbDoNotDisturbSettings var1;
      if (this.doNotDisturbSettingsBuilder_ == null) {
         if (this.doNotDisturbSettings_ == null) {
            var1 = UserDeviceSettings$PbDoNotDisturbSettings.getDefaultInstance();
         } else {
            var1 = this.doNotDisturbSettings_;
         }
      } else {
         var1 = (UserDeviceSettings$PbDoNotDisturbSettings)this.doNotDisturbSettingsBuilder_.getMessage();
      }

      return var1;
   }

   public UserDeviceSettings$PbDoNotDisturbSettings$Builder getDoNotDisturbSettingsBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (UserDeviceSettings$PbDoNotDisturbSettings$Builder)this.getDoNotDisturbSettingsFieldBuilder().getBuilder();
   }

   public UserDeviceSettings$PbDoNotDisturbSettingsOrBuilder getDoNotDisturbSettingsOrBuilder() {
      Object var1;
      if (this.doNotDisturbSettingsBuilder_ != null) {
         var1 = (UserDeviceSettings$PbDoNotDisturbSettingsOrBuilder)this.doNotDisturbSettingsBuilder_.getMessageOrBuilder();
      } else if (this.doNotDisturbSettings_ == null) {
         var1 = UserDeviceSettings$PbDoNotDisturbSettings.getDefaultInstance();
      } else {
         var1 = this.doNotDisturbSettings_;
      }

      return (UserDeviceSettings$PbDoNotDisturbSettingsOrBuilder)var1;
   }

   public boolean getEnabled() {
      return this.enabled_;
   }

   public boolean getPreviewEnabled() {
      return this.previewEnabled_;
   }

   public boolean getSoundsEnabled() {
      return this.soundsEnabled_;
   }

   public boolean hasDoNotDisturbSettings() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasEnabled() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPreviewEnabled() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSoundsEnabled() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.v().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserSmartWatchNotificationSettings.class, UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasEnabled() && (!this.hasDoNotDisturbSettings() || this.getDoNotDisturbSettings().isInitialized())) {
         var1 = true;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder mergeDoNotDisturbSettings(UserDeviceSettings$PbDoNotDisturbSettings var1) {
      if (this.doNotDisturbSettingsBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.doNotDisturbSettings_ != null && this.doNotDisturbSettings_ != UserDeviceSettings$PbDoNotDisturbSettings.getDefaultInstance()) {
            this.doNotDisturbSettings_ = UserDeviceSettings$PbDoNotDisturbSettings.newBuilder(this.doNotDisturbSettings_).mergeFrom(var1).buildPartial();
         } else {
            this.doNotDisturbSettings_ = var1;
         }

         this.onChanged();
      } else {
         this.doNotDisturbSettingsBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      UserDeviceSettings$PbUserSmartWatchNotificationSettings var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (UserDeviceSettings$PbUserSmartWatchNotificationSettings)UserDeviceSettings$PbUserSmartWatchNotificationSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (UserDeviceSettings$PbUserSmartWatchNotificationSettings)var10.getUnfinishedMessage();
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

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder mergeFrom(Message var1) {
      UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder var2;
      if (var1 instanceof UserDeviceSettings$PbUserSmartWatchNotificationSettings) {
         var2 = this.mergeFrom((UserDeviceSettings$PbUserSmartWatchNotificationSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder mergeFrom(UserDeviceSettings$PbUserSmartWatchNotificationSettings var1) {
      if (var1 != UserDeviceSettings$PbUserSmartWatchNotificationSettings.getDefaultInstance()) {
         if (var1.hasEnabled()) {
            this.setEnabled(var1.getEnabled());
         }

         if (var1.hasPreviewEnabled()) {
            this.setPreviewEnabled(var1.getPreviewEnabled());
         }

         if (var1.hasDoNotDisturbSettings()) {
            this.mergeDoNotDisturbSettings(var1.getDoNotDisturbSettings());
         }

         if (var1.hasSoundsEnabled()) {
            this.setSoundsEnabled(var1.getSoundsEnabled());
         }

         this.mergeUnknownFields(UserDeviceSettings$PbUserSmartWatchNotificationSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder)super.mergeUnknownFields(var1);
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder setDoNotDisturbSettings(UserDeviceSettings$PbDoNotDisturbSettings$Builder var1) {
      if (this.doNotDisturbSettingsBuilder_ == null) {
         this.doNotDisturbSettings_ = var1.build();
         this.onChanged();
      } else {
         this.doNotDisturbSettingsBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder setDoNotDisturbSettings(UserDeviceSettings$PbDoNotDisturbSettings var1) {
      if (this.doNotDisturbSettingsBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.doNotDisturbSettings_ = var1;
         this.onChanged();
      } else {
         this.doNotDisturbSettingsBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder setEnabled(boolean var1) {
      this.bitField0_ |= 1;
      this.enabled_ = var1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder)super.setField(var1, var2);
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder setPreviewEnabled(boolean var1) {
      this.bitField0_ |= 2;
      this.previewEnabled_ = var1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder setSoundsEnabled(boolean var1) {
      this.bitField0_ |= 8;
      this.soundsEnabled_ = var1;
      this.onChanged();
      return this;
   }

   public final UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder)super.setUnknownFields(var1);
   }
}
