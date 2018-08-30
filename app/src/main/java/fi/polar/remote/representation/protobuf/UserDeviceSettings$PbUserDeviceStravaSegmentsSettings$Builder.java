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

public final class UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder extends Builder implements UserDeviceSettings$PbUserDeviceStravaSegmentsSettingsOrBuilder {
   private int bitField0_;
   private boolean enabled_;

   private UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder(BuilderParent var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder(UserDeviceSettings$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.I();
   }

   private void maybeForceBuilderInitialization() {
      if (UserDeviceSettings$PbUserDeviceStravaSegmentsSettings.b()) {
      }

   }

   public UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public UserDeviceSettings$PbUserDeviceStravaSegmentsSettings build() {
      UserDeviceSettings$PbUserDeviceStravaSegmentsSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public UserDeviceSettings$PbUserDeviceStravaSegmentsSettings buildPartial() {
      byte var1 = 1;
      UserDeviceSettings$PbUserDeviceStravaSegmentsSettings var2 = new UserDeviceSettings$PbUserDeviceStravaSegmentsSettings(this, (UserDeviceSettings$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      UserDeviceSettings$PbUserDeviceStravaSegmentsSettings.a(var2, this.enabled_);
      UserDeviceSettings$PbUserDeviceStravaSegmentsSettings.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder clear() {
      super.clear();
      this.enabled_ = false;
      this.bitField0_ &= -2;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder clearEnabled() {
      this.bitField0_ &= -2;
      this.enabled_ = false;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder clearField(FieldDescriptor var1) {
      return (UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder)super.clearField(var1);
   }

   public UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder clearOneof(OneofDescriptor var1) {
      return (UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder)super.clearOneof(var1);
   }

   public UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder clone() {
      return (UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder)super.clone();
   }

   public UserDeviceSettings$PbUserDeviceStravaSegmentsSettings getDefaultInstanceForType() {
      return UserDeviceSettings$PbUserDeviceStravaSegmentsSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return UserDeviceSettings.I();
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
      return UserDeviceSettings.J().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserDeviceStravaSegmentsSettings.class, UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder.class);
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

   public UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      UserDeviceSettings$PbUserDeviceStravaSegmentsSettings var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (UserDeviceSettings$PbUserDeviceStravaSegmentsSettings)UserDeviceSettings$PbUserDeviceStravaSegmentsSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (UserDeviceSettings$PbUserDeviceStravaSegmentsSettings)var11.getUnfinishedMessage();
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

   public UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder mergeFrom(Message var1) {
      UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder var2;
      if (var1 instanceof UserDeviceSettings$PbUserDeviceStravaSegmentsSettings) {
         var2 = this.mergeFrom((UserDeviceSettings$PbUserDeviceStravaSegmentsSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder mergeFrom(UserDeviceSettings$PbUserDeviceStravaSegmentsSettings var1) {
      if (var1 != UserDeviceSettings$PbUserDeviceStravaSegmentsSettings.getDefaultInstance()) {
         if (var1.hasEnabled()) {
            this.setEnabled(var1.getEnabled());
         }

         this.mergeUnknownFields(UserDeviceSettings$PbUserDeviceStravaSegmentsSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder)super.mergeUnknownFields(var1);
   }

   public UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder setEnabled(boolean var1) {
      this.bitField0_ |= 1;
      this.enabled_ = var1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder)super.setField(var1, var2);
   }

   public UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserDeviceStravaSegmentsSettings$Builder)super.setUnknownFields(var1);
   }
}
