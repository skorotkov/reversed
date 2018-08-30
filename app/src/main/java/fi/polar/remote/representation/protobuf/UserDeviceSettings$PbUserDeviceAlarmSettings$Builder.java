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

public final class UserDeviceSettings$PbUserDeviceAlarmSettings$Builder extends Builder implements UserDeviceSettings$PbUserDeviceAlarmSettingsOrBuilder {
   private int alarmMode_;
   private SingleFieldBuilderV3 alarmTimeBuilder_;
   private Types$PbTime alarmTime_;
   private int bitField0_;

   private UserDeviceSettings$PbUserDeviceAlarmSettings$Builder() {
      this.alarmMode_ = 1;
      this.alarmTime_ = null;
      this.maybeForceBuilderInitialization();
   }

   private UserDeviceSettings$PbUserDeviceAlarmSettings$Builder(BuilderParent var1) {
      super(var1);
      this.alarmMode_ = 1;
      this.alarmTime_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceAlarmSettings$Builder(BuilderParent var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceAlarmSettings$Builder(UserDeviceSettings$1 var1) {
      this();
   }

   private SingleFieldBuilderV3 getAlarmTimeFieldBuilder() {
      if (this.alarmTimeBuilder_ == null) {
         this.alarmTimeBuilder_ = new SingleFieldBuilderV3(this.getAlarmTime(), this.getParentForChildren(), this.isClean());
         this.alarmTime_ = null;
      }

      return this.alarmTimeBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.c();
   }

   private void maybeForceBuilderInitialization() {
      if (UserDeviceSettings$PbUserDeviceAlarmSettings.b()) {
         this.getAlarmTimeFieldBuilder();
      }

   }

   public UserDeviceSettings$PbUserDeviceAlarmSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserDeviceAlarmSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public UserDeviceSettings$PbUserDeviceAlarmSettings build() {
      UserDeviceSettings$PbUserDeviceAlarmSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public UserDeviceSettings$PbUserDeviceAlarmSettings buildPartial() {
      int var1 = 1;
      UserDeviceSettings$PbUserDeviceAlarmSettings var2 = new UserDeviceSettings$PbUserDeviceAlarmSettings(this, (UserDeviceSettings$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      UserDeviceSettings$PbUserDeviceAlarmSettings.a(var2, this.alarmMode_);
      if ((var3 & 2) == 2) {
         var1 |= 2;
      }

      if (this.alarmTimeBuilder_ == null) {
         UserDeviceSettings$PbUserDeviceAlarmSettings.a(var2, this.alarmTime_);
      } else {
         UserDeviceSettings$PbUserDeviceAlarmSettings.a(var2, (Types$PbTime)this.alarmTimeBuilder_.build());
      }

      UserDeviceSettings$PbUserDeviceAlarmSettings.b(var2, var1);
      this.onBuilt();
      return var2;
   }

   public UserDeviceSettings$PbUserDeviceAlarmSettings$Builder clear() {
      super.clear();
      this.alarmMode_ = 1;
      this.bitField0_ &= -2;
      if (this.alarmTimeBuilder_ == null) {
         this.alarmTime_ = null;
      } else {
         this.alarmTimeBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceAlarmSettings$Builder clearAlarmMode() {
      this.bitField0_ &= -2;
      this.alarmMode_ = 1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceAlarmSettings$Builder clearAlarmTime() {
      if (this.alarmTimeBuilder_ == null) {
         this.alarmTime_ = null;
         this.onChanged();
      } else {
         this.alarmTimeBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceAlarmSettings$Builder clearField(FieldDescriptor var1) {
      return (UserDeviceSettings$PbUserDeviceAlarmSettings$Builder)super.clearField(var1);
   }

   public UserDeviceSettings$PbUserDeviceAlarmSettings$Builder clearOneof(OneofDescriptor var1) {
      return (UserDeviceSettings$PbUserDeviceAlarmSettings$Builder)super.clearOneof(var1);
   }

   public UserDeviceSettings$PbUserDeviceAlarmSettings$Builder clone() {
      return (UserDeviceSettings$PbUserDeviceAlarmSettings$Builder)super.clone();
   }

   public UserDeviceSettings$PbUserDeviceAlarmSettings$PbAlarmMode getAlarmMode() {
      UserDeviceSettings$PbUserDeviceAlarmSettings$PbAlarmMode var1 = UserDeviceSettings$PbUserDeviceAlarmSettings$PbAlarmMode.valueOf(this.alarmMode_);
      UserDeviceSettings$PbUserDeviceAlarmSettings$PbAlarmMode var2 = var1;
      if (var1 == null) {
         var2 = UserDeviceSettings$PbUserDeviceAlarmSettings$PbAlarmMode.ALARM_MODE_OFF;
      }

      return var2;
   }

   public Types$PbTime getAlarmTime() {
      Types$PbTime var1;
      if (this.alarmTimeBuilder_ == null) {
         if (this.alarmTime_ == null) {
            var1 = Types$PbTime.getDefaultInstance();
         } else {
            var1 = this.alarmTime_;
         }
      } else {
         var1 = (Types$PbTime)this.alarmTimeBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbTime$Builder getAlarmTimeBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Types$PbTime$Builder)this.getAlarmTimeFieldBuilder().getBuilder();
   }

   public Types$PbTimeOrBuilder getAlarmTimeOrBuilder() {
      Object var1;
      if (this.alarmTimeBuilder_ != null) {
         var1 = (Types$PbTimeOrBuilder)this.alarmTimeBuilder_.getMessageOrBuilder();
      } else if (this.alarmTime_ == null) {
         var1 = Types$PbTime.getDefaultInstance();
      } else {
         var1 = this.alarmTime_;
      }

      return (Types$PbTimeOrBuilder)var1;
   }

   public UserDeviceSettings$PbUserDeviceAlarmSettings getDefaultInstanceForType() {
      return UserDeviceSettings$PbUserDeviceAlarmSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return UserDeviceSettings.c();
   }

   public boolean hasAlarmMode() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAlarmTime() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.d().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserDeviceAlarmSettings.class, UserDeviceSettings$PbUserDeviceAlarmSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasAlarmMode()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasAlarmTime()) {
            var2 = var1;
            if (this.getAlarmTime().isInitialized()) {
               var2 = true;
            }
         }
      }

      return var2;
   }

   public UserDeviceSettings$PbUserDeviceAlarmSettings$Builder mergeAlarmTime(Types$PbTime var1) {
      if (this.alarmTimeBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.alarmTime_ != null && this.alarmTime_ != Types$PbTime.getDefaultInstance()) {
            this.alarmTime_ = Types$PbTime.newBuilder(this.alarmTime_).mergeFrom(var1).buildPartial();
         } else {
            this.alarmTime_ = var1;
         }

         this.onChanged();
      } else {
         this.alarmTimeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceAlarmSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      UserDeviceSettings$PbUserDeviceAlarmSettings var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (UserDeviceSettings$PbUserDeviceAlarmSettings)UserDeviceSettings$PbUserDeviceAlarmSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (UserDeviceSettings$PbUserDeviceAlarmSettings)var10.getUnfinishedMessage();
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

   public UserDeviceSettings$PbUserDeviceAlarmSettings$Builder mergeFrom(Message var1) {
      UserDeviceSettings$PbUserDeviceAlarmSettings$Builder var2;
      if (var1 instanceof UserDeviceSettings$PbUserDeviceAlarmSettings) {
         var2 = this.mergeFrom((UserDeviceSettings$PbUserDeviceAlarmSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public UserDeviceSettings$PbUserDeviceAlarmSettings$Builder mergeFrom(UserDeviceSettings$PbUserDeviceAlarmSettings var1) {
      if (var1 != UserDeviceSettings$PbUserDeviceAlarmSettings.getDefaultInstance()) {
         if (var1.hasAlarmMode()) {
            this.setAlarmMode(var1.getAlarmMode());
         }

         if (var1.hasAlarmTime()) {
            this.mergeAlarmTime(var1.getAlarmTime());
         }

         this.mergeUnknownFields(UserDeviceSettings$PbUserDeviceAlarmSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final UserDeviceSettings$PbUserDeviceAlarmSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserDeviceAlarmSettings$Builder)super.mergeUnknownFields(var1);
   }

   public UserDeviceSettings$PbUserDeviceAlarmSettings$Builder setAlarmMode(UserDeviceSettings$PbUserDeviceAlarmSettings$PbAlarmMode var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.alarmMode_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public UserDeviceSettings$PbUserDeviceAlarmSettings$Builder setAlarmTime(Types$PbTime$Builder var1) {
      if (this.alarmTimeBuilder_ == null) {
         this.alarmTime_ = var1.build();
         this.onChanged();
      } else {
         this.alarmTimeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceAlarmSettings$Builder setAlarmTime(Types$PbTime var1) {
      if (this.alarmTimeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.alarmTime_ = var1;
         this.onChanged();
      } else {
         this.alarmTimeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceAlarmSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserDeviceAlarmSettings$Builder)super.setField(var1, var2);
   }

   public UserDeviceSettings$PbUserDeviceAlarmSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (UserDeviceSettings$PbUserDeviceAlarmSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final UserDeviceSettings$PbUserDeviceAlarmSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserDeviceAlarmSettings$Builder)super.setUnknownFields(var1);
   }
}
