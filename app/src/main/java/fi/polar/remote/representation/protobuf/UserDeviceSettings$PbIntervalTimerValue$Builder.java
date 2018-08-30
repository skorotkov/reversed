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

public final class UserDeviceSettings$PbIntervalTimerValue$Builder extends Builder implements UserDeviceSettings$PbIntervalTimerValueOrBuilder {
   private int bitField0_;
   private float intervalTimerDistance_;
   private SingleFieldBuilderV3 intervalTimerDurationBuilder_;
   private Types$PbDuration intervalTimerDuration_;
   private int intervalTimerType_;

   private UserDeviceSettings$PbIntervalTimerValue$Builder() {
      this.intervalTimerType_ = 1;
      this.intervalTimerDuration_ = null;
      this.maybeForceBuilderInitialization();
   }

   private UserDeviceSettings$PbIntervalTimerValue$Builder(BuilderParent var1) {
      super(var1);
      this.intervalTimerType_ = 1;
      this.intervalTimerDuration_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   UserDeviceSettings$PbIntervalTimerValue$Builder(BuilderParent var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   UserDeviceSettings$PbIntervalTimerValue$Builder(UserDeviceSettings$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.i();
   }

   private SingleFieldBuilderV3 getIntervalTimerDurationFieldBuilder() {
      if (this.intervalTimerDurationBuilder_ == null) {
         this.intervalTimerDurationBuilder_ = new SingleFieldBuilderV3(this.getIntervalTimerDuration(), this.getParentForChildren(), this.isClean());
         this.intervalTimerDuration_ = null;
      }

      return this.intervalTimerDurationBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (UserDeviceSettings$PbIntervalTimerValue.b()) {
         this.getIntervalTimerDurationFieldBuilder();
      }

   }

   public UserDeviceSettings$PbIntervalTimerValue$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbIntervalTimerValue$Builder)super.addRepeatedField(var1, var2);
   }

   public UserDeviceSettings$PbIntervalTimerValue build() {
      UserDeviceSettings$PbIntervalTimerValue var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public UserDeviceSettings$PbIntervalTimerValue buildPartial() {
      int var1 = 1;
      UserDeviceSettings$PbIntervalTimerValue var2 = new UserDeviceSettings$PbIntervalTimerValue(this, (UserDeviceSettings$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      UserDeviceSettings$PbIntervalTimerValue.a(var2, this.intervalTimerType_);
      if ((var3 & 2) == 2) {
         var1 |= 2;
      }

      if (this.intervalTimerDurationBuilder_ == null) {
         UserDeviceSettings$PbIntervalTimerValue.a(var2, this.intervalTimerDuration_);
      } else {
         UserDeviceSettings$PbIntervalTimerValue.a(var2, (Types$PbDuration)this.intervalTimerDurationBuilder_.build());
      }

      int var4 = var1;
      if ((var3 & 4) == 4) {
         var4 = var1 | 4;
      }

      UserDeviceSettings$PbIntervalTimerValue.a(var2, this.intervalTimerDistance_);
      UserDeviceSettings$PbIntervalTimerValue.b(var2, var4);
      this.onBuilt();
      return var2;
   }

   public UserDeviceSettings$PbIntervalTimerValue$Builder clear() {
      super.clear();
      this.intervalTimerType_ = 1;
      this.bitField0_ &= -2;
      if (this.intervalTimerDurationBuilder_ == null) {
         this.intervalTimerDuration_ = null;
      } else {
         this.intervalTimerDurationBuilder_.clear();
      }

      this.bitField0_ &= -3;
      this.intervalTimerDistance_ = 0.0F;
      this.bitField0_ &= -5;
      return this;
   }

   public UserDeviceSettings$PbIntervalTimerValue$Builder clearField(FieldDescriptor var1) {
      return (UserDeviceSettings$PbIntervalTimerValue$Builder)super.clearField(var1);
   }

   public UserDeviceSettings$PbIntervalTimerValue$Builder clearIntervalTimerDistance() {
      this.bitField0_ &= -5;
      this.intervalTimerDistance_ = 0.0F;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbIntervalTimerValue$Builder clearIntervalTimerDuration() {
      if (this.intervalTimerDurationBuilder_ == null) {
         this.intervalTimerDuration_ = null;
         this.onChanged();
      } else {
         this.intervalTimerDurationBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public UserDeviceSettings$PbIntervalTimerValue$Builder clearIntervalTimerType() {
      this.bitField0_ &= -2;
      this.intervalTimerType_ = 1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbIntervalTimerValue$Builder clearOneof(OneofDescriptor var1) {
      return (UserDeviceSettings$PbIntervalTimerValue$Builder)super.clearOneof(var1);
   }

   public UserDeviceSettings$PbIntervalTimerValue$Builder clone() {
      return (UserDeviceSettings$PbIntervalTimerValue$Builder)super.clone();
   }

   public UserDeviceSettings$PbIntervalTimerValue getDefaultInstanceForType() {
      return UserDeviceSettings$PbIntervalTimerValue.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return UserDeviceSettings.i();
   }

   public float getIntervalTimerDistance() {
      return this.intervalTimerDistance_;
   }

   public Types$PbDuration getIntervalTimerDuration() {
      Types$PbDuration var1;
      if (this.intervalTimerDurationBuilder_ == null) {
         if (this.intervalTimerDuration_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.intervalTimerDuration_;
         }
      } else {
         var1 = (Types$PbDuration)this.intervalTimerDurationBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getIntervalTimerDurationBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getIntervalTimerDurationFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getIntervalTimerDurationOrBuilder() {
      Object var1;
      if (this.intervalTimerDurationBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.intervalTimerDurationBuilder_.getMessageOrBuilder();
      } else if (this.intervalTimerDuration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.intervalTimerDuration_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public UserDeviceSettings$PbIntervalTimerValue$PbIntervalTimerType getIntervalTimerType() {
      UserDeviceSettings$PbIntervalTimerValue$PbIntervalTimerType var1 = UserDeviceSettings$PbIntervalTimerValue$PbIntervalTimerType.valueOf(this.intervalTimerType_);
      UserDeviceSettings$PbIntervalTimerValue$PbIntervalTimerType var2 = var1;
      if (var1 == null) {
         var2 = UserDeviceSettings$PbIntervalTimerValue$PbIntervalTimerType.INTERVAL_TIMER_TYPE_DURATION;
      }

      return var2;
   }

   public boolean hasIntervalTimerDistance() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasIntervalTimerDuration() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasIntervalTimerType() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.j().ensureFieldAccessorsInitialized(UserDeviceSettings$PbIntervalTimerValue.class, UserDeviceSettings$PbIntervalTimerValue$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasIntervalTimerType()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public UserDeviceSettings$PbIntervalTimerValue$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      UserDeviceSettings$PbIntervalTimerValue var13;
      label96: {
         InvalidProtocolBufferException var12;
         UserDeviceSettings$PbIntervalTimerValue var14;
         try {
            var13 = (UserDeviceSettings$PbIntervalTimerValue)UserDeviceSettings$PbIntervalTimerValue.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (UserDeviceSettings$PbIntervalTimerValue)var10.getUnfinishedMessage();
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

   public UserDeviceSettings$PbIntervalTimerValue$Builder mergeFrom(Message var1) {
      UserDeviceSettings$PbIntervalTimerValue$Builder var2;
      if (var1 instanceof UserDeviceSettings$PbIntervalTimerValue) {
         var2 = this.mergeFrom((UserDeviceSettings$PbIntervalTimerValue)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public UserDeviceSettings$PbIntervalTimerValue$Builder mergeFrom(UserDeviceSettings$PbIntervalTimerValue var1) {
      if (var1 != UserDeviceSettings$PbIntervalTimerValue.getDefaultInstance()) {
         if (var1.hasIntervalTimerType()) {
            this.setIntervalTimerType(var1.getIntervalTimerType());
         }

         if (var1.hasIntervalTimerDuration()) {
            this.mergeIntervalTimerDuration(var1.getIntervalTimerDuration());
         }

         if (var1.hasIntervalTimerDistance()) {
            this.setIntervalTimerDistance(var1.getIntervalTimerDistance());
         }

         this.mergeUnknownFields(UserDeviceSettings$PbIntervalTimerValue.a(var1));
         this.onChanged();
      }

      return this;
   }

   public UserDeviceSettings$PbIntervalTimerValue$Builder mergeIntervalTimerDuration(Types$PbDuration var1) {
      if (this.intervalTimerDurationBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.intervalTimerDuration_ != null && this.intervalTimerDuration_ != Types$PbDuration.getDefaultInstance()) {
            this.intervalTimerDuration_ = Types$PbDuration.newBuilder(this.intervalTimerDuration_).mergeFrom(var1).buildPartial();
         } else {
            this.intervalTimerDuration_ = var1;
         }

         this.onChanged();
      } else {
         this.intervalTimerDurationBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final UserDeviceSettings$PbIntervalTimerValue$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbIntervalTimerValue$Builder)super.mergeUnknownFields(var1);
   }

   public UserDeviceSettings$PbIntervalTimerValue$Builder setField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbIntervalTimerValue$Builder)super.setField(var1, var2);
   }

   public UserDeviceSettings$PbIntervalTimerValue$Builder setIntervalTimerDistance(float var1) {
      this.bitField0_ |= 4;
      this.intervalTimerDistance_ = var1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbIntervalTimerValue$Builder setIntervalTimerDuration(Types$PbDuration$Builder var1) {
      if (this.intervalTimerDurationBuilder_ == null) {
         this.intervalTimerDuration_ = var1.build();
         this.onChanged();
      } else {
         this.intervalTimerDurationBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public UserDeviceSettings$PbIntervalTimerValue$Builder setIntervalTimerDuration(Types$PbDuration var1) {
      if (this.intervalTimerDurationBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.intervalTimerDuration_ = var1;
         this.onChanged();
      } else {
         this.intervalTimerDurationBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public UserDeviceSettings$PbIntervalTimerValue$Builder setIntervalTimerType(UserDeviceSettings$PbIntervalTimerValue$PbIntervalTimerType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.intervalTimerType_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public UserDeviceSettings$PbIntervalTimerValue$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (UserDeviceSettings$PbIntervalTimerValue$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final UserDeviceSettings$PbIntervalTimerValue$Builder setUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbIntervalTimerValue$Builder)super.setUnknownFields(var1);
   }
}
