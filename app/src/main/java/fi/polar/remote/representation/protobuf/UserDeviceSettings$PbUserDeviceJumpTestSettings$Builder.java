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

public final class UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder extends Builder implements UserDeviceSettings$PbUserDeviceJumpTestSettingsOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 contJumpDurationBuilder_;
   private Types$PbDuration contJumpDuration_;

   private UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder() {
      this.contJumpDuration_ = null;
      this.maybeForceBuilderInitialization();
   }

   private UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder(BuilderParent var1) {
      super(var1);
      this.contJumpDuration_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder(BuilderParent var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder(UserDeviceSettings$1 var1) {
      this();
   }

   private SingleFieldBuilderV3 getContJumpDurationFieldBuilder() {
      if (this.contJumpDurationBuilder_ == null) {
         this.contJumpDurationBuilder_ = new SingleFieldBuilderV3(this.getContJumpDuration(), this.getParentForChildren(), this.isClean());
         this.contJumpDuration_ = null;
      }

      return this.contJumpDurationBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.g();
   }

   private void maybeForceBuilderInitialization() {
      if (UserDeviceSettings$PbUserDeviceJumpTestSettings.b()) {
         this.getContJumpDurationFieldBuilder();
      }

   }

   public UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public UserDeviceSettings$PbUserDeviceJumpTestSettings build() {
      UserDeviceSettings$PbUserDeviceJumpTestSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public UserDeviceSettings$PbUserDeviceJumpTestSettings buildPartial() {
      UserDeviceSettings$PbUserDeviceJumpTestSettings var1 = new UserDeviceSettings$PbUserDeviceJumpTestSettings(this, (UserDeviceSettings$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.contJumpDurationBuilder_ == null) {
         UserDeviceSettings$PbUserDeviceJumpTestSettings.a(var1, this.contJumpDuration_);
      } else {
         UserDeviceSettings$PbUserDeviceJumpTestSettings.a(var1, (Types$PbDuration)this.contJumpDurationBuilder_.build());
      }

      UserDeviceSettings$PbUserDeviceJumpTestSettings.a(var1, var3);
      this.onBuilt();
      return var1;
   }

   public UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder clear() {
      super.clear();
      if (this.contJumpDurationBuilder_ == null) {
         this.contJumpDuration_ = null;
      } else {
         this.contJumpDurationBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder clearContJumpDuration() {
      if (this.contJumpDurationBuilder_ == null) {
         this.contJumpDuration_ = null;
         this.onChanged();
      } else {
         this.contJumpDurationBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder clearField(FieldDescriptor var1) {
      return (UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder)super.clearField(var1);
   }

   public UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder clearOneof(OneofDescriptor var1) {
      return (UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder)super.clearOneof(var1);
   }

   public UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder clone() {
      return (UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder)super.clone();
   }

   public Types$PbDuration getContJumpDuration() {
      Types$PbDuration var1;
      if (this.contJumpDurationBuilder_ == null) {
         if (this.contJumpDuration_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.contJumpDuration_;
         }
      } else {
         var1 = (Types$PbDuration)this.contJumpDurationBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getContJumpDurationBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getContJumpDurationFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getContJumpDurationOrBuilder() {
      Object var1;
      if (this.contJumpDurationBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.contJumpDurationBuilder_.getMessageOrBuilder();
      } else if (this.contJumpDuration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.contJumpDuration_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public UserDeviceSettings$PbUserDeviceJumpTestSettings getDefaultInstanceForType() {
      return UserDeviceSettings$PbUserDeviceJumpTestSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return UserDeviceSettings.g();
   }

   public boolean hasContJumpDuration() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.h().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserDeviceJumpTestSettings.class, UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasContJumpDuration()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder mergeContJumpDuration(Types$PbDuration var1) {
      if (this.contJumpDurationBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.contJumpDuration_ != null && this.contJumpDuration_ != Types$PbDuration.getDefaultInstance()) {
            this.contJumpDuration_ = Types$PbDuration.newBuilder(this.contJumpDuration_).mergeFrom(var1).buildPartial();
         } else {
            this.contJumpDuration_ = var1;
         }

         this.onChanged();
      } else {
         this.contJumpDurationBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      UserDeviceSettings$PbUserDeviceJumpTestSettings var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (UserDeviceSettings$PbUserDeviceJumpTestSettings)UserDeviceSettings$PbUserDeviceJumpTestSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (UserDeviceSettings$PbUserDeviceJumpTestSettings)var10.getUnfinishedMessage();
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

   public UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder mergeFrom(Message var1) {
      UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder var2;
      if (var1 instanceof UserDeviceSettings$PbUserDeviceJumpTestSettings) {
         var2 = this.mergeFrom((UserDeviceSettings$PbUserDeviceJumpTestSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder mergeFrom(UserDeviceSettings$PbUserDeviceJumpTestSettings var1) {
      if (var1 != UserDeviceSettings$PbUserDeviceJumpTestSettings.getDefaultInstance()) {
         if (var1.hasContJumpDuration()) {
            this.mergeContJumpDuration(var1.getContJumpDuration());
         }

         this.mergeUnknownFields(UserDeviceSettings$PbUserDeviceJumpTestSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder)super.mergeUnknownFields(var1);
   }

   public UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder setContJumpDuration(Types$PbDuration$Builder var1) {
      if (this.contJumpDurationBuilder_ == null) {
         this.contJumpDuration_ = var1.build();
         this.onChanged();
      } else {
         this.contJumpDurationBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder setContJumpDuration(Types$PbDuration var1) {
      if (this.contJumpDurationBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.contJumpDuration_ = var1;
         this.onChanged();
      } else {
         this.contJumpDurationBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder)super.setField(var1, var2);
   }

   public UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder)super.setUnknownFields(var1);
   }
}
