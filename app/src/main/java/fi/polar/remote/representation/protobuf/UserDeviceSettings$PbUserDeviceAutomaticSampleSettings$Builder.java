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

public final class UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder extends Builder implements UserDeviceSettings$PbUserDeviceAutomaticSampleSettingsOrBuilder {
   private int bitField0_;
   private boolean ohr247Enabled_;

   private UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder(BuilderParent var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder(UserDeviceSettings$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.G();
   }

   private void maybeForceBuilderInitialization() {
      if (UserDeviceSettings$PbUserDeviceAutomaticSampleSettings.b()) {
      }

   }

   public UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public UserDeviceSettings$PbUserDeviceAutomaticSampleSettings build() {
      UserDeviceSettings$PbUserDeviceAutomaticSampleSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public UserDeviceSettings$PbUserDeviceAutomaticSampleSettings buildPartial() {
      byte var1 = 1;
      UserDeviceSettings$PbUserDeviceAutomaticSampleSettings var2 = new UserDeviceSettings$PbUserDeviceAutomaticSampleSettings(this, (UserDeviceSettings$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      UserDeviceSettings$PbUserDeviceAutomaticSampleSettings.a(var2, this.ohr247Enabled_);
      UserDeviceSettings$PbUserDeviceAutomaticSampleSettings.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder clear() {
      super.clear();
      this.ohr247Enabled_ = false;
      this.bitField0_ &= -2;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder clearField(FieldDescriptor var1) {
      return (UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder)super.clearField(var1);
   }

   public UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder clearOhr247Enabled() {
      this.bitField0_ &= -2;
      this.ohr247Enabled_ = false;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder clearOneof(OneofDescriptor var1) {
      return (UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder)super.clearOneof(var1);
   }

   public UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder clone() {
      return (UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder)super.clone();
   }

   public UserDeviceSettings$PbUserDeviceAutomaticSampleSettings getDefaultInstanceForType() {
      return UserDeviceSettings$PbUserDeviceAutomaticSampleSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return UserDeviceSettings.G();
   }

   public boolean getOhr247Enabled() {
      return this.ohr247Enabled_;
   }

   public boolean hasOhr247Enabled() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.H().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserDeviceAutomaticSampleSettings.class, UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasOhr247Enabled()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      UserDeviceSettings$PbUserDeviceAutomaticSampleSettings var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (UserDeviceSettings$PbUserDeviceAutomaticSampleSettings)UserDeviceSettings$PbUserDeviceAutomaticSampleSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (UserDeviceSettings$PbUserDeviceAutomaticSampleSettings)var10.getUnfinishedMessage();
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

   public UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder mergeFrom(Message var1) {
      UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder var2;
      if (var1 instanceof UserDeviceSettings$PbUserDeviceAutomaticSampleSettings) {
         var2 = this.mergeFrom((UserDeviceSettings$PbUserDeviceAutomaticSampleSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder mergeFrom(UserDeviceSettings$PbUserDeviceAutomaticSampleSettings var1) {
      if (var1 != UserDeviceSettings$PbUserDeviceAutomaticSampleSettings.getDefaultInstance()) {
         if (var1.hasOhr247Enabled()) {
            this.setOhr247Enabled(var1.getOhr247Enabled());
         }

         this.mergeUnknownFields(UserDeviceSettings$PbUserDeviceAutomaticSampleSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder)super.mergeUnknownFields(var1);
   }

   public UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder)super.setField(var1, var2);
   }

   public UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder setOhr247Enabled(boolean var1) {
      this.bitField0_ |= 1;
      this.ohr247Enabled_ = var1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder)super.setUnknownFields(var1);
   }
}
