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

public final class UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder extends Builder implements UserDeviceSettings$PbUserDeviceAutoSyncSettingsOrBuilder {
   private int bitField0_;
   private boolean enabled_;

   private UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder(BuilderParent var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder(UserDeviceSettings$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.E();
   }

   private void maybeForceBuilderInitialization() {
      if (UserDeviceSettings$PbUserDeviceAutoSyncSettings.b()) {
      }

   }

   public UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public UserDeviceSettings$PbUserDeviceAutoSyncSettings build() {
      UserDeviceSettings$PbUserDeviceAutoSyncSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public UserDeviceSettings$PbUserDeviceAutoSyncSettings buildPartial() {
      byte var1 = 1;
      UserDeviceSettings$PbUserDeviceAutoSyncSettings var2 = new UserDeviceSettings$PbUserDeviceAutoSyncSettings(this, (UserDeviceSettings$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      UserDeviceSettings$PbUserDeviceAutoSyncSettings.a(var2, this.enabled_);
      UserDeviceSettings$PbUserDeviceAutoSyncSettings.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder clear() {
      super.clear();
      this.enabled_ = false;
      this.bitField0_ &= -2;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder clearEnabled() {
      this.bitField0_ &= -2;
      this.enabled_ = false;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder clearField(FieldDescriptor var1) {
      return (UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder)super.clearField(var1);
   }

   public UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder clearOneof(OneofDescriptor var1) {
      return (UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder)super.clearOneof(var1);
   }

   public UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder clone() {
      return (UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder)super.clone();
   }

   public UserDeviceSettings$PbUserDeviceAutoSyncSettings getDefaultInstanceForType() {
      return UserDeviceSettings$PbUserDeviceAutoSyncSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return UserDeviceSettings.E();
   }

   public boolean getEnabled() {
      return this.enabled_;
   }

   public boolean hasEnabled() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.F().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserDeviceAutoSyncSettings.class, UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasEnabled()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      UserDeviceSettings$PbUserDeviceAutoSyncSettings var13;
      label96: {
         InvalidProtocolBufferException var12;
         UserDeviceSettings$PbUserDeviceAutoSyncSettings var14;
         try {
            var13 = (UserDeviceSettings$PbUserDeviceAutoSyncSettings)UserDeviceSettings$PbUserDeviceAutoSyncSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (UserDeviceSettings$PbUserDeviceAutoSyncSettings)var10.getUnfinishedMessage();
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

   public UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder mergeFrom(Message var1) {
      UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder var2;
      if (var1 instanceof UserDeviceSettings$PbUserDeviceAutoSyncSettings) {
         var2 = this.mergeFrom((UserDeviceSettings$PbUserDeviceAutoSyncSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder mergeFrom(UserDeviceSettings$PbUserDeviceAutoSyncSettings var1) {
      if (var1 != UserDeviceSettings$PbUserDeviceAutoSyncSettings.getDefaultInstance()) {
         if (var1.hasEnabled()) {
            this.setEnabled(var1.getEnabled());
         }

         this.mergeUnknownFields(UserDeviceSettings$PbUserDeviceAutoSyncSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder)super.mergeUnknownFields(var1);
   }

   public UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder setEnabled(boolean var1) {
      this.bitField0_ |= 1;
      this.enabled_ = var1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder)super.setField(var1, var2);
   }

   public UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder)super.setUnknownFields(var1);
   }
}
