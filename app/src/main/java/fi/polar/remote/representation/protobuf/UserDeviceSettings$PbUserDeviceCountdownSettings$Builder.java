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

public final class UserDeviceSettings$PbUserDeviceCountdownSettings$Builder extends Builder implements UserDeviceSettings$PbUserDeviceCountdownSettingsOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 countdownTimeBuilder_;
   private Types$PbDuration countdownTime_;

   private UserDeviceSettings$PbUserDeviceCountdownSettings$Builder() {
      this.countdownTime_ = null;
      this.maybeForceBuilderInitialization();
   }

   private UserDeviceSettings$PbUserDeviceCountdownSettings$Builder(BuilderParent var1) {
      super(var1);
      this.countdownTime_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceCountdownSettings$Builder(BuilderParent var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceCountdownSettings$Builder(UserDeviceSettings$1 var1) {
      this();
   }

   private SingleFieldBuilderV3 getCountdownTimeFieldBuilder() {
      if (this.countdownTimeBuilder_ == null) {
         this.countdownTimeBuilder_ = new SingleFieldBuilderV3(this.getCountdownTime(), this.getParentForChildren(), this.isClean());
         this.countdownTime_ = null;
      }

      return this.countdownTimeBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.e();
   }

   private void maybeForceBuilderInitialization() {
      if (UserDeviceSettings$PbUserDeviceCountdownSettings.b()) {
         this.getCountdownTimeFieldBuilder();
      }

   }

   public UserDeviceSettings$PbUserDeviceCountdownSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserDeviceCountdownSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public UserDeviceSettings$PbUserDeviceCountdownSettings build() {
      UserDeviceSettings$PbUserDeviceCountdownSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public UserDeviceSettings$PbUserDeviceCountdownSettings buildPartial() {
      UserDeviceSettings$PbUserDeviceCountdownSettings var1 = new UserDeviceSettings$PbUserDeviceCountdownSettings(this, (UserDeviceSettings$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.countdownTimeBuilder_ == null) {
         UserDeviceSettings$PbUserDeviceCountdownSettings.a(var1, this.countdownTime_);
      } else {
         UserDeviceSettings$PbUserDeviceCountdownSettings.a(var1, (Types$PbDuration)this.countdownTimeBuilder_.build());
      }

      UserDeviceSettings$PbUserDeviceCountdownSettings.a(var1, var3);
      this.onBuilt();
      return var1;
   }

   public UserDeviceSettings$PbUserDeviceCountdownSettings$Builder clear() {
      super.clear();
      if (this.countdownTimeBuilder_ == null) {
         this.countdownTime_ = null;
      } else {
         this.countdownTimeBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceCountdownSettings$Builder clearCountdownTime() {
      if (this.countdownTimeBuilder_ == null) {
         this.countdownTime_ = null;
         this.onChanged();
      } else {
         this.countdownTimeBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceCountdownSettings$Builder clearField(FieldDescriptor var1) {
      return (UserDeviceSettings$PbUserDeviceCountdownSettings$Builder)super.clearField(var1);
   }

   public UserDeviceSettings$PbUserDeviceCountdownSettings$Builder clearOneof(OneofDescriptor var1) {
      return (UserDeviceSettings$PbUserDeviceCountdownSettings$Builder)super.clearOneof(var1);
   }

   public UserDeviceSettings$PbUserDeviceCountdownSettings$Builder clone() {
      return (UserDeviceSettings$PbUserDeviceCountdownSettings$Builder)super.clone();
   }

   public Types$PbDuration getCountdownTime() {
      Types$PbDuration var1;
      if (this.countdownTimeBuilder_ == null) {
         if (this.countdownTime_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.countdownTime_;
         }
      } else {
         var1 = (Types$PbDuration)this.countdownTimeBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getCountdownTimeBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getCountdownTimeFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getCountdownTimeOrBuilder() {
      Object var1;
      if (this.countdownTimeBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.countdownTimeBuilder_.getMessageOrBuilder();
      } else if (this.countdownTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.countdownTime_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public UserDeviceSettings$PbUserDeviceCountdownSettings getDefaultInstanceForType() {
      return UserDeviceSettings$PbUserDeviceCountdownSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return UserDeviceSettings.e();
   }

   public boolean hasCountdownTime() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.f().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserDeviceCountdownSettings.class, UserDeviceSettings$PbUserDeviceCountdownSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasCountdownTime()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceCountdownSettings$Builder mergeCountdownTime(Types$PbDuration var1) {
      if (this.countdownTimeBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.countdownTime_ != null && this.countdownTime_ != Types$PbDuration.getDefaultInstance()) {
            this.countdownTime_ = Types$PbDuration.newBuilder(this.countdownTime_).mergeFrom(var1).buildPartial();
         } else {
            this.countdownTime_ = var1;
         }

         this.onChanged();
      } else {
         this.countdownTimeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceCountdownSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      UserDeviceSettings$PbUserDeviceCountdownSettings var13;
      label96: {
         InvalidProtocolBufferException var12;
         UserDeviceSettings$PbUserDeviceCountdownSettings var14;
         try {
            var13 = (UserDeviceSettings$PbUserDeviceCountdownSettings)UserDeviceSettings$PbUserDeviceCountdownSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (UserDeviceSettings$PbUserDeviceCountdownSettings)var10.getUnfinishedMessage();
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

   public UserDeviceSettings$PbUserDeviceCountdownSettings$Builder mergeFrom(Message var1) {
      UserDeviceSettings$PbUserDeviceCountdownSettings$Builder var2;
      if (var1 instanceof UserDeviceSettings$PbUserDeviceCountdownSettings) {
         var2 = this.mergeFrom((UserDeviceSettings$PbUserDeviceCountdownSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public UserDeviceSettings$PbUserDeviceCountdownSettings$Builder mergeFrom(UserDeviceSettings$PbUserDeviceCountdownSettings var1) {
      if (var1 != UserDeviceSettings$PbUserDeviceCountdownSettings.getDefaultInstance()) {
         if (var1.hasCountdownTime()) {
            this.mergeCountdownTime(var1.getCountdownTime());
         }

         this.mergeUnknownFields(UserDeviceSettings$PbUserDeviceCountdownSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final UserDeviceSettings$PbUserDeviceCountdownSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserDeviceCountdownSettings$Builder)super.mergeUnknownFields(var1);
   }

   public UserDeviceSettings$PbUserDeviceCountdownSettings$Builder setCountdownTime(Types$PbDuration$Builder var1) {
      if (this.countdownTimeBuilder_ == null) {
         this.countdownTime_ = var1.build();
         this.onChanged();
      } else {
         this.countdownTimeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceCountdownSettings$Builder setCountdownTime(Types$PbDuration var1) {
      if (this.countdownTimeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.countdownTime_ = var1;
         this.onChanged();
      } else {
         this.countdownTimeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceCountdownSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserDeviceCountdownSettings$Builder)super.setField(var1, var2);
   }

   public UserDeviceSettings$PbUserDeviceCountdownSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (UserDeviceSettings$PbUserDeviceCountdownSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final UserDeviceSettings$PbUserDeviceCountdownSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserDeviceCountdownSettings$Builder)super.setUnknownFields(var1);
   }
}
