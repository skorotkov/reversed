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

public final class UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder extends Builder implements UserDeviceSettings$PbUserEndTimeEstimatorSettingsOrBuilder {
   private int bitField0_;
   private float endTimeEstimatorTarget_;

   private UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder(BuilderParent var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder(UserDeviceSettings$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.m();
   }

   private void maybeForceBuilderInitialization() {
      if (UserDeviceSettings$PbUserEndTimeEstimatorSettings.b()) {
      }

   }

   public UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public UserDeviceSettings$PbUserEndTimeEstimatorSettings build() {
      UserDeviceSettings$PbUserEndTimeEstimatorSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public UserDeviceSettings$PbUserEndTimeEstimatorSettings buildPartial() {
      byte var1 = 1;
      UserDeviceSettings$PbUserEndTimeEstimatorSettings var2 = new UserDeviceSettings$PbUserEndTimeEstimatorSettings(this, (UserDeviceSettings$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      UserDeviceSettings$PbUserEndTimeEstimatorSettings.a(var2, this.endTimeEstimatorTarget_);
      UserDeviceSettings$PbUserEndTimeEstimatorSettings.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder clear() {
      super.clear();
      this.endTimeEstimatorTarget_ = 0.0F;
      this.bitField0_ &= -2;
      return this;
   }

   public UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder clearEndTimeEstimatorTarget() {
      this.bitField0_ &= -2;
      this.endTimeEstimatorTarget_ = 0.0F;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder clearField(FieldDescriptor var1) {
      return (UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder)super.clearField(var1);
   }

   public UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder clearOneof(OneofDescriptor var1) {
      return (UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder)super.clearOneof(var1);
   }

   public UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder clone() {
      return (UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder)super.clone();
   }

   public UserDeviceSettings$PbUserEndTimeEstimatorSettings getDefaultInstanceForType() {
      return UserDeviceSettings$PbUserEndTimeEstimatorSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return UserDeviceSettings.m();
   }

   public float getEndTimeEstimatorTarget() {
      return this.endTimeEstimatorTarget_;
   }

   public boolean hasEndTimeEstimatorTarget() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.n().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserEndTimeEstimatorSettings.class, UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      UserDeviceSettings$PbUserEndTimeEstimatorSettings var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (UserDeviceSettings$PbUserEndTimeEstimatorSettings)UserDeviceSettings$PbUserEndTimeEstimatorSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (UserDeviceSettings$PbUserEndTimeEstimatorSettings)var10.getUnfinishedMessage();
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

   public UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder mergeFrom(Message var1) {
      UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder var2;
      if (var1 instanceof UserDeviceSettings$PbUserEndTimeEstimatorSettings) {
         var2 = this.mergeFrom((UserDeviceSettings$PbUserEndTimeEstimatorSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder mergeFrom(UserDeviceSettings$PbUserEndTimeEstimatorSettings var1) {
      if (var1 != UserDeviceSettings$PbUserEndTimeEstimatorSettings.getDefaultInstance()) {
         if (var1.hasEndTimeEstimatorTarget()) {
            this.setEndTimeEstimatorTarget(var1.getEndTimeEstimatorTarget());
         }

         this.mergeUnknownFields(UserDeviceSettings$PbUserEndTimeEstimatorSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder)super.mergeUnknownFields(var1);
   }

   public UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder setEndTimeEstimatorTarget(float var1) {
      this.bitField0_ |= 1;
      this.endTimeEstimatorTarget_ = var1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder)super.setField(var1, var2);
   }

   public UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder)super.setUnknownFields(var1);
   }
}
