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

public final class UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder extends Builder implements UserDeviceSettings$PbUserDeviceDoNotDisturbSettingsOrBuilder {
   private int bitField0_;
   private boolean doNotDisturbOn_;
   private int settingSource_;

   private UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder() {
      this.settingSource_ = 0;
      this.maybeForceBuilderInitialization();
   }

   private UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder(BuilderParent var1) {
      super(var1);
      this.settingSource_ = 0;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder(BuilderParent var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder(UserDeviceSettings$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.C();
   }

   private void maybeForceBuilderInitialization() {
      if (UserDeviceSettings$PbUserDeviceDoNotDisturbSettings.b()) {
      }

   }

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettings build() {
      UserDeviceSettings$PbUserDeviceDoNotDisturbSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettings buildPartial() {
      byte var1 = 1;
      UserDeviceSettings$PbUserDeviceDoNotDisturbSettings var2 = new UserDeviceSettings$PbUserDeviceDoNotDisturbSettings(this, (UserDeviceSettings$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      UserDeviceSettings$PbUserDeviceDoNotDisturbSettings.a(var2, this.doNotDisturbOn_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      UserDeviceSettings$PbUserDeviceDoNotDisturbSettings.a(var2, this.settingSource_);
      UserDeviceSettings$PbUserDeviceDoNotDisturbSettings.b(var2, var4);
      this.onBuilt();
      return var2;
   }

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder clear() {
      super.clear();
      this.doNotDisturbOn_ = false;
      this.bitField0_ &= -2;
      this.settingSource_ = 0;
      this.bitField0_ &= -3;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder clearDoNotDisturbOn() {
      this.bitField0_ &= -2;
      this.doNotDisturbOn_ = false;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder clearField(FieldDescriptor var1) {
      return (UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder)super.clearField(var1);
   }

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder clearOneof(OneofDescriptor var1) {
      return (UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder)super.clearOneof(var1);
   }

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder clearSettingSource() {
      this.bitField0_ &= -3;
      this.settingSource_ = 0;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder clone() {
      return (UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder)super.clone();
   }

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettings getDefaultInstanceForType() {
      return UserDeviceSettings$PbUserDeviceDoNotDisturbSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return UserDeviceSettings.C();
   }

   public boolean getDoNotDisturbOn() {
      return this.doNotDisturbOn_;
   }

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$PbDoNotDisturbSettingSource getSettingSource() {
      UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$PbDoNotDisturbSettingSource var1 = UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$PbDoNotDisturbSettingSource.valueOf(this.settingSource_);
      UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$PbDoNotDisturbSettingSource var2 = var1;
      if (var1 == null) {
         var2 = UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$PbDoNotDisturbSettingSource.SOURCE_USER;
      }

      return var2;
   }

   public boolean hasDoNotDisturbOn() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSettingSource() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.D().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserDeviceDoNotDisturbSettings.class, UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasDoNotDisturbOn()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      UserDeviceSettings$PbUserDeviceDoNotDisturbSettings var13;
      label96: {
         InvalidProtocolBufferException var12;
         UserDeviceSettings$PbUserDeviceDoNotDisturbSettings var14;
         try {
            var13 = (UserDeviceSettings$PbUserDeviceDoNotDisturbSettings)UserDeviceSettings$PbUserDeviceDoNotDisturbSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (UserDeviceSettings$PbUserDeviceDoNotDisturbSettings)var10.getUnfinishedMessage();
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

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder mergeFrom(Message var1) {
      UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder var2;
      if (var1 instanceof UserDeviceSettings$PbUserDeviceDoNotDisturbSettings) {
         var2 = this.mergeFrom((UserDeviceSettings$PbUserDeviceDoNotDisturbSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder mergeFrom(UserDeviceSettings$PbUserDeviceDoNotDisturbSettings var1) {
      if (var1 != UserDeviceSettings$PbUserDeviceDoNotDisturbSettings.getDefaultInstance()) {
         if (var1.hasDoNotDisturbOn()) {
            this.setDoNotDisturbOn(var1.getDoNotDisturbOn());
         }

         if (var1.hasSettingSource()) {
            this.setSettingSource(var1.getSettingSource());
         }

         this.mergeUnknownFields(UserDeviceSettings$PbUserDeviceDoNotDisturbSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder)super.mergeUnknownFields(var1);
   }

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder setDoNotDisturbOn(boolean var1) {
      this.bitField0_ |= 1;
      this.doNotDisturbOn_ = var1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder)super.setField(var1, var2);
   }

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder setSettingSource(UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$PbDoNotDisturbSettingSource var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.settingSource_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public final UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder)super.setUnknownFields(var1);
   }
}
