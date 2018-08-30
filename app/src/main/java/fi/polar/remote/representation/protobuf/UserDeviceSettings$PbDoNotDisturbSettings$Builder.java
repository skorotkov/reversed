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

public final class UserDeviceSettings$PbDoNotDisturbSettings$Builder extends Builder implements UserDeviceSettings$PbDoNotDisturbSettingsOrBuilder {
   private int bitField0_;
   private boolean enabled_;
   private SingleFieldBuilderV3 endBuilder_;
   private Types$PbTime end_;
   private SingleFieldBuilderV3 startBuilder_;
   private Types$PbTime start_;

   private UserDeviceSettings$PbDoNotDisturbSettings$Builder() {
      this.start_ = null;
      this.end_ = null;
      this.maybeForceBuilderInitialization();
   }

   private UserDeviceSettings$PbDoNotDisturbSettings$Builder(BuilderParent var1) {
      super(var1);
      this.start_ = null;
      this.end_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   UserDeviceSettings$PbDoNotDisturbSettings$Builder(BuilderParent var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   UserDeviceSettings$PbDoNotDisturbSettings$Builder(UserDeviceSettings$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.s();
   }

   private SingleFieldBuilderV3 getEndFieldBuilder() {
      if (this.endBuilder_ == null) {
         this.endBuilder_ = new SingleFieldBuilderV3(this.getEnd(), this.getParentForChildren(), this.isClean());
         this.end_ = null;
      }

      return this.endBuilder_;
   }

   private SingleFieldBuilderV3 getStartFieldBuilder() {
      if (this.startBuilder_ == null) {
         this.startBuilder_ = new SingleFieldBuilderV3(this.getStart(), this.getParentForChildren(), this.isClean());
         this.start_ = null;
      }

      return this.startBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (UserDeviceSettings$PbDoNotDisturbSettings.b()) {
         this.getStartFieldBuilder();
         this.getEndFieldBuilder();
      }

   }

   public UserDeviceSettings$PbDoNotDisturbSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbDoNotDisturbSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public UserDeviceSettings$PbDoNotDisturbSettings build() {
      UserDeviceSettings$PbDoNotDisturbSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public UserDeviceSettings$PbDoNotDisturbSettings buildPartial() {
      int var1 = 1;
      UserDeviceSettings$PbDoNotDisturbSettings var2 = new UserDeviceSettings$PbDoNotDisturbSettings(this, (UserDeviceSettings$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      UserDeviceSettings$PbDoNotDisturbSettings.a(var2, this.enabled_);
      if ((var3 & 2) == 2) {
         var1 |= 2;
      }

      if (this.startBuilder_ == null) {
         UserDeviceSettings$PbDoNotDisturbSettings.a(var2, this.start_);
      } else {
         UserDeviceSettings$PbDoNotDisturbSettings.a(var2, (Types$PbTime)this.startBuilder_.build());
      }

      int var4 = var1;
      if ((var3 & 4) == 4) {
         var4 = var1 | 4;
      }

      if (this.endBuilder_ == null) {
         UserDeviceSettings$PbDoNotDisturbSettings.b(var2, this.end_);
      } else {
         UserDeviceSettings$PbDoNotDisturbSettings.b(var2, (Types$PbTime)this.endBuilder_.build());
      }

      UserDeviceSettings$PbDoNotDisturbSettings.a(var2, var4);
      this.onBuilt();
      return var2;
   }

   public UserDeviceSettings$PbDoNotDisturbSettings$Builder clear() {
      super.clear();
      this.enabled_ = false;
      this.bitField0_ &= -2;
      if (this.startBuilder_ == null) {
         this.start_ = null;
      } else {
         this.startBuilder_.clear();
      }

      this.bitField0_ &= -3;
      if (this.endBuilder_ == null) {
         this.end_ = null;
      } else {
         this.endBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public UserDeviceSettings$PbDoNotDisturbSettings$Builder clearEnabled() {
      this.bitField0_ &= -2;
      this.enabled_ = false;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbDoNotDisturbSettings$Builder clearEnd() {
      if (this.endBuilder_ == null) {
         this.end_ = null;
         this.onChanged();
      } else {
         this.endBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public UserDeviceSettings$PbDoNotDisturbSettings$Builder clearField(FieldDescriptor var1) {
      return (UserDeviceSettings$PbDoNotDisturbSettings$Builder)super.clearField(var1);
   }

   public UserDeviceSettings$PbDoNotDisturbSettings$Builder clearOneof(OneofDescriptor var1) {
      return (UserDeviceSettings$PbDoNotDisturbSettings$Builder)super.clearOneof(var1);
   }

   public UserDeviceSettings$PbDoNotDisturbSettings$Builder clearStart() {
      if (this.startBuilder_ == null) {
         this.start_ = null;
         this.onChanged();
      } else {
         this.startBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public UserDeviceSettings$PbDoNotDisturbSettings$Builder clone() {
      return (UserDeviceSettings$PbDoNotDisturbSettings$Builder)super.clone();
   }

   public UserDeviceSettings$PbDoNotDisturbSettings getDefaultInstanceForType() {
      return UserDeviceSettings$PbDoNotDisturbSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return UserDeviceSettings.s();
   }

   public boolean getEnabled() {
      return this.enabled_;
   }

   public Types$PbTime getEnd() {
      Types$PbTime var1;
      if (this.endBuilder_ == null) {
         if (this.end_ == null) {
            var1 = Types$PbTime.getDefaultInstance();
         } else {
            var1 = this.end_;
         }
      } else {
         var1 = (Types$PbTime)this.endBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbTime$Builder getEndBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (Types$PbTime$Builder)this.getEndFieldBuilder().getBuilder();
   }

   public Types$PbTimeOrBuilder getEndOrBuilder() {
      Object var1;
      if (this.endBuilder_ != null) {
         var1 = (Types$PbTimeOrBuilder)this.endBuilder_.getMessageOrBuilder();
      } else if (this.end_ == null) {
         var1 = Types$PbTime.getDefaultInstance();
      } else {
         var1 = this.end_;
      }

      return (Types$PbTimeOrBuilder)var1;
   }

   public Types$PbTime getStart() {
      Types$PbTime var1;
      if (this.startBuilder_ == null) {
         if (this.start_ == null) {
            var1 = Types$PbTime.getDefaultInstance();
         } else {
            var1 = this.start_;
         }
      } else {
         var1 = (Types$PbTime)this.startBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbTime$Builder getStartBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Types$PbTime$Builder)this.getStartFieldBuilder().getBuilder();
   }

   public Types$PbTimeOrBuilder getStartOrBuilder() {
      Object var1;
      if (this.startBuilder_ != null) {
         var1 = (Types$PbTimeOrBuilder)this.startBuilder_.getMessageOrBuilder();
      } else if (this.start_ == null) {
         var1 = Types$PbTime.getDefaultInstance();
      } else {
         var1 = this.start_;
      }

      return (Types$PbTimeOrBuilder)var1;
   }

   public boolean hasEnabled() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasEnd() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStart() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.t().ensureFieldAccessorsInitialized(UserDeviceSettings$PbDoNotDisturbSettings.class, UserDeviceSettings$PbDoNotDisturbSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasEnabled()) {
         var2 = var1;
      } else {
         if (this.hasStart()) {
            var2 = var1;
            if (!this.getStart().isInitialized()) {
               return var2;
            }
         }

         if (this.hasEnd()) {
            var2 = var1;
            if (!this.getEnd().isInitialized()) {
               return var2;
            }
         }

         var2 = true;
      }

      return var2;
   }

   public UserDeviceSettings$PbDoNotDisturbSettings$Builder mergeEnd(Types$PbTime var1) {
      if (this.endBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.end_ != null && this.end_ != Types$PbTime.getDefaultInstance()) {
            this.end_ = Types$PbTime.newBuilder(this.end_).mergeFrom(var1).buildPartial();
         } else {
            this.end_ = var1;
         }

         this.onChanged();
      } else {
         this.endBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public UserDeviceSettings$PbDoNotDisturbSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      UserDeviceSettings$PbDoNotDisturbSettings var13;
      label96: {
         InvalidProtocolBufferException var12;
         UserDeviceSettings$PbDoNotDisturbSettings var14;
         try {
            var13 = (UserDeviceSettings$PbDoNotDisturbSettings)UserDeviceSettings$PbDoNotDisturbSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (UserDeviceSettings$PbDoNotDisturbSettings)var10.getUnfinishedMessage();
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

   public UserDeviceSettings$PbDoNotDisturbSettings$Builder mergeFrom(Message var1) {
      UserDeviceSettings$PbDoNotDisturbSettings$Builder var2;
      if (var1 instanceof UserDeviceSettings$PbDoNotDisturbSettings) {
         var2 = this.mergeFrom((UserDeviceSettings$PbDoNotDisturbSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public UserDeviceSettings$PbDoNotDisturbSettings$Builder mergeFrom(UserDeviceSettings$PbDoNotDisturbSettings var1) {
      if (var1 != UserDeviceSettings$PbDoNotDisturbSettings.getDefaultInstance()) {
         if (var1.hasEnabled()) {
            this.setEnabled(var1.getEnabled());
         }

         if (var1.hasStart()) {
            this.mergeStart(var1.getStart());
         }

         if (var1.hasEnd()) {
            this.mergeEnd(var1.getEnd());
         }

         this.mergeUnknownFields(UserDeviceSettings$PbDoNotDisturbSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public UserDeviceSettings$PbDoNotDisturbSettings$Builder mergeStart(Types$PbTime var1) {
      if (this.startBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.start_ != null && this.start_ != Types$PbTime.getDefaultInstance()) {
            this.start_ = Types$PbTime.newBuilder(this.start_).mergeFrom(var1).buildPartial();
         } else {
            this.start_ = var1;
         }

         this.onChanged();
      } else {
         this.startBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final UserDeviceSettings$PbDoNotDisturbSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbDoNotDisturbSettings$Builder)super.mergeUnknownFields(var1);
   }

   public UserDeviceSettings$PbDoNotDisturbSettings$Builder setEnabled(boolean var1) {
      this.bitField0_ |= 1;
      this.enabled_ = var1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbDoNotDisturbSettings$Builder setEnd(Types$PbTime$Builder var1) {
      if (this.endBuilder_ == null) {
         this.end_ = var1.build();
         this.onChanged();
      } else {
         this.endBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public UserDeviceSettings$PbDoNotDisturbSettings$Builder setEnd(Types$PbTime var1) {
      if (this.endBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.end_ = var1;
         this.onChanged();
      } else {
         this.endBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public UserDeviceSettings$PbDoNotDisturbSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbDoNotDisturbSettings$Builder)super.setField(var1, var2);
   }

   public UserDeviceSettings$PbDoNotDisturbSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (UserDeviceSettings$PbDoNotDisturbSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public UserDeviceSettings$PbDoNotDisturbSettings$Builder setStart(Types$PbTime$Builder var1) {
      if (this.startBuilder_ == null) {
         this.start_ = var1.build();
         this.onChanged();
      } else {
         this.startBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public UserDeviceSettings$PbDoNotDisturbSettings$Builder setStart(Types$PbTime var1) {
      if (this.startBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.start_ = var1;
         this.onChanged();
      } else {
         this.startBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final UserDeviceSettings$PbDoNotDisturbSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbDoNotDisturbSettings$Builder)super.setUnknownFields(var1);
   }
}
