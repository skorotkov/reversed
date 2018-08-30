package fi.polar.remote.representation.protobuf;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class UserDeviceSettings$PbUserIntervalTimerSettings$Builder extends Builder implements UserDeviceSettings$PbUserIntervalTimerSettingsOrBuilder {
   private int bitField0_;
   private RepeatedFieldBuilderV3 intervalTimerValueBuilder_;
   private List intervalTimerValue_;

   private UserDeviceSettings$PbUserIntervalTimerSettings$Builder() {
      this.intervalTimerValue_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   private UserDeviceSettings$PbUserIntervalTimerSettings$Builder(BuilderParent var1) {
      super(var1);
      this.intervalTimerValue_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserIntervalTimerSettings$Builder(BuilderParent var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserIntervalTimerSettings$Builder(UserDeviceSettings$1 var1) {
      this();
   }

   private void ensureIntervalTimerValueIsMutable() {
      if ((this.bitField0_ & 1) != 1) {
         this.intervalTimerValue_ = new ArrayList(this.intervalTimerValue_);
         this.bitField0_ |= 1;
      }

   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.k();
   }

   private RepeatedFieldBuilderV3 getIntervalTimerValueFieldBuilder() {
      boolean var1 = true;
      if (this.intervalTimerValueBuilder_ == null) {
         List var2 = this.intervalTimerValue_;
         if ((this.bitField0_ & 1) != 1) {
            var1 = false;
         }

         this.intervalTimerValueBuilder_ = new RepeatedFieldBuilderV3(var2, var1, this.getParentForChildren(), this.isClean());
         this.intervalTimerValue_ = null;
      }

      return this.intervalTimerValueBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (UserDeviceSettings$PbUserIntervalTimerSettings.b()) {
         this.getIntervalTimerValueFieldBuilder();
      }

   }

   public UserDeviceSettings$PbUserIntervalTimerSettings$Builder addAllIntervalTimerValue(Iterable var1) {
      if (this.intervalTimerValueBuilder_ == null) {
         this.ensureIntervalTimerValueIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.intervalTimerValue_);
         this.onChanged();
      } else {
         this.intervalTimerValueBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public UserDeviceSettings$PbUserIntervalTimerSettings$Builder addIntervalTimerValue(int var1, UserDeviceSettings$PbIntervalTimerValue$Builder var2) {
      if (this.intervalTimerValueBuilder_ == null) {
         this.ensureIntervalTimerValueIsMutable();
         this.intervalTimerValue_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.intervalTimerValueBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public UserDeviceSettings$PbUserIntervalTimerSettings$Builder addIntervalTimerValue(int var1, UserDeviceSettings$PbIntervalTimerValue var2) {
      if (this.intervalTimerValueBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureIntervalTimerValueIsMutable();
         this.intervalTimerValue_.add(var1, var2);
         this.onChanged();
      } else {
         this.intervalTimerValueBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public UserDeviceSettings$PbUserIntervalTimerSettings$Builder addIntervalTimerValue(UserDeviceSettings$PbIntervalTimerValue$Builder var1) {
      if (this.intervalTimerValueBuilder_ == null) {
         this.ensureIntervalTimerValueIsMutable();
         this.intervalTimerValue_.add(var1.build());
         this.onChanged();
      } else {
         this.intervalTimerValueBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public UserDeviceSettings$PbUserIntervalTimerSettings$Builder addIntervalTimerValue(UserDeviceSettings$PbIntervalTimerValue var1) {
      if (this.intervalTimerValueBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureIntervalTimerValueIsMutable();
         this.intervalTimerValue_.add(var1);
         this.onChanged();
      } else {
         this.intervalTimerValueBuilder_.addMessage(var1);
      }

      return this;
   }

   public UserDeviceSettings$PbIntervalTimerValue$Builder addIntervalTimerValueBuilder() {
      return (UserDeviceSettings$PbIntervalTimerValue$Builder)this.getIntervalTimerValueFieldBuilder().addBuilder(UserDeviceSettings$PbIntervalTimerValue.getDefaultInstance());
   }

   public UserDeviceSettings$PbIntervalTimerValue$Builder addIntervalTimerValueBuilder(int var1) {
      return (UserDeviceSettings$PbIntervalTimerValue$Builder)this.getIntervalTimerValueFieldBuilder().addBuilder(var1, UserDeviceSettings$PbIntervalTimerValue.getDefaultInstance());
   }

   public UserDeviceSettings$PbUserIntervalTimerSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserIntervalTimerSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public UserDeviceSettings$PbUserIntervalTimerSettings build() {
      UserDeviceSettings$PbUserIntervalTimerSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public UserDeviceSettings$PbUserIntervalTimerSettings buildPartial() {
      UserDeviceSettings$PbUserIntervalTimerSettings var1 = new UserDeviceSettings$PbUserIntervalTimerSettings(this, (UserDeviceSettings$1)null);
      int var2 = this.bitField0_;
      if (this.intervalTimerValueBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1) {
            this.intervalTimerValue_ = Collections.unmodifiableList(this.intervalTimerValue_);
            this.bitField0_ &= -2;
         }

         UserDeviceSettings$PbUserIntervalTimerSettings.a(var1, this.intervalTimerValue_);
      } else {
         UserDeviceSettings$PbUserIntervalTimerSettings.a(var1, this.intervalTimerValueBuilder_.build());
      }

      this.onBuilt();
      return var1;
   }

   public UserDeviceSettings$PbUserIntervalTimerSettings$Builder clear() {
      super.clear();
      if (this.intervalTimerValueBuilder_ == null) {
         this.intervalTimerValue_ = Collections.emptyList();
         this.bitField0_ &= -2;
      } else {
         this.intervalTimerValueBuilder_.clear();
      }

      return this;
   }

   public UserDeviceSettings$PbUserIntervalTimerSettings$Builder clearField(FieldDescriptor var1) {
      return (UserDeviceSettings$PbUserIntervalTimerSettings$Builder)super.clearField(var1);
   }

   public UserDeviceSettings$PbUserIntervalTimerSettings$Builder clearIntervalTimerValue() {
      if (this.intervalTimerValueBuilder_ == null) {
         this.intervalTimerValue_ = Collections.emptyList();
         this.bitField0_ &= -2;
         this.onChanged();
      } else {
         this.intervalTimerValueBuilder_.clear();
      }

      return this;
   }

   public UserDeviceSettings$PbUserIntervalTimerSettings$Builder clearOneof(OneofDescriptor var1) {
      return (UserDeviceSettings$PbUserIntervalTimerSettings$Builder)super.clearOneof(var1);
   }

   public UserDeviceSettings$PbUserIntervalTimerSettings$Builder clone() {
      return (UserDeviceSettings$PbUserIntervalTimerSettings$Builder)super.clone();
   }

   public UserDeviceSettings$PbUserIntervalTimerSettings getDefaultInstanceForType() {
      return UserDeviceSettings$PbUserIntervalTimerSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return UserDeviceSettings.k();
   }

   public UserDeviceSettings$PbIntervalTimerValue getIntervalTimerValue(int var1) {
      UserDeviceSettings$PbIntervalTimerValue var2;
      if (this.intervalTimerValueBuilder_ == null) {
         var2 = (UserDeviceSettings$PbIntervalTimerValue)this.intervalTimerValue_.get(var1);
      } else {
         var2 = (UserDeviceSettings$PbIntervalTimerValue)this.intervalTimerValueBuilder_.getMessage(var1);
      }

      return var2;
   }

   public UserDeviceSettings$PbIntervalTimerValue$Builder getIntervalTimerValueBuilder(int var1) {
      return (UserDeviceSettings$PbIntervalTimerValue$Builder)this.getIntervalTimerValueFieldBuilder().getBuilder(var1);
   }

   public List getIntervalTimerValueBuilderList() {
      return this.getIntervalTimerValueFieldBuilder().getBuilderList();
   }

   public int getIntervalTimerValueCount() {
      int var1;
      if (this.intervalTimerValueBuilder_ == null) {
         var1 = this.intervalTimerValue_.size();
      } else {
         var1 = this.intervalTimerValueBuilder_.getCount();
      }

      return var1;
   }

   public List getIntervalTimerValueList() {
      List var1;
      if (this.intervalTimerValueBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.intervalTimerValue_);
      } else {
         var1 = this.intervalTimerValueBuilder_.getMessageList();
      }

      return var1;
   }

   public UserDeviceSettings$PbIntervalTimerValueOrBuilder getIntervalTimerValueOrBuilder(int var1) {
      UserDeviceSettings$PbIntervalTimerValueOrBuilder var2;
      if (this.intervalTimerValueBuilder_ == null) {
         var2 = (UserDeviceSettings$PbIntervalTimerValueOrBuilder)this.intervalTimerValue_.get(var1);
      } else {
         var2 = (UserDeviceSettings$PbIntervalTimerValueOrBuilder)this.intervalTimerValueBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getIntervalTimerValueOrBuilderList() {
      List var1;
      if (this.intervalTimerValueBuilder_ != null) {
         var1 = this.intervalTimerValueBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.intervalTimerValue_);
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.l().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserIntervalTimerSettings.class, UserDeviceSettings$PbUserIntervalTimerSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      int var2 = 0;

      while(true) {
         if (var2 >= this.getIntervalTimerValueCount()) {
            var1 = true;
            break;
         }

         if (!this.getIntervalTimerValue(var2).isInitialized()) {
            break;
         }

         ++var2;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserIntervalTimerSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      UserDeviceSettings$PbUserIntervalTimerSettings var13;
      label96: {
         InvalidProtocolBufferException var12;
         UserDeviceSettings$PbUserIntervalTimerSettings var14;
         try {
            var13 = (UserDeviceSettings$PbUserIntervalTimerSettings)UserDeviceSettings$PbUserIntervalTimerSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (UserDeviceSettings$PbUserIntervalTimerSettings)var10.getUnfinishedMessage();
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

   public UserDeviceSettings$PbUserIntervalTimerSettings$Builder mergeFrom(Message var1) {
      UserDeviceSettings$PbUserIntervalTimerSettings$Builder var2;
      if (var1 instanceof UserDeviceSettings$PbUserIntervalTimerSettings) {
         var2 = this.mergeFrom((UserDeviceSettings$PbUserIntervalTimerSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public UserDeviceSettings$PbUserIntervalTimerSettings$Builder mergeFrom(UserDeviceSettings$PbUserIntervalTimerSettings var1) {
      RepeatedFieldBuilderV3 var2 = null;
      if (var1 != UserDeviceSettings$PbUserIntervalTimerSettings.getDefaultInstance()) {
         if (this.intervalTimerValueBuilder_ == null) {
            if (!UserDeviceSettings$PbUserIntervalTimerSettings.a(var1).isEmpty()) {
               if (this.intervalTimerValue_.isEmpty()) {
                  this.intervalTimerValue_ = UserDeviceSettings$PbUserIntervalTimerSettings.a(var1);
                  this.bitField0_ &= -2;
               } else {
                  this.ensureIntervalTimerValueIsMutable();
                  this.intervalTimerValue_.addAll(UserDeviceSettings$PbUserIntervalTimerSettings.a(var1));
               }

               this.onChanged();
            }
         } else if (!UserDeviceSettings$PbUserIntervalTimerSettings.a(var1).isEmpty()) {
            if (this.intervalTimerValueBuilder_.isEmpty()) {
               this.intervalTimerValueBuilder_.dispose();
               this.intervalTimerValueBuilder_ = null;
               this.intervalTimerValue_ = UserDeviceSettings$PbUserIntervalTimerSettings.a(var1);
               this.bitField0_ &= -2;
               if (UserDeviceSettings$PbUserIntervalTimerSettings.c()) {
                  var2 = this.getIntervalTimerValueFieldBuilder();
               }

               this.intervalTimerValueBuilder_ = var2;
            } else {
               this.intervalTimerValueBuilder_.addAllMessages(UserDeviceSettings$PbUserIntervalTimerSettings.a(var1));
            }
         }

         this.mergeUnknownFields(UserDeviceSettings$PbUserIntervalTimerSettings.b(var1));
         this.onChanged();
      }

      return this;
   }

   public final UserDeviceSettings$PbUserIntervalTimerSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserIntervalTimerSettings$Builder)super.mergeUnknownFields(var1);
   }

   public UserDeviceSettings$PbUserIntervalTimerSettings$Builder removeIntervalTimerValue(int var1) {
      if (this.intervalTimerValueBuilder_ == null) {
         this.ensureIntervalTimerValueIsMutable();
         this.intervalTimerValue_.remove(var1);
         this.onChanged();
      } else {
         this.intervalTimerValueBuilder_.remove(var1);
      }

      return this;
   }

   public UserDeviceSettings$PbUserIntervalTimerSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserIntervalTimerSettings$Builder)super.setField(var1, var2);
   }

   public UserDeviceSettings$PbUserIntervalTimerSettings$Builder setIntervalTimerValue(int var1, UserDeviceSettings$PbIntervalTimerValue$Builder var2) {
      if (this.intervalTimerValueBuilder_ == null) {
         this.ensureIntervalTimerValueIsMutable();
         this.intervalTimerValue_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.intervalTimerValueBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public UserDeviceSettings$PbUserIntervalTimerSettings$Builder setIntervalTimerValue(int var1, UserDeviceSettings$PbIntervalTimerValue var2) {
      if (this.intervalTimerValueBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureIntervalTimerValueIsMutable();
         this.intervalTimerValue_.set(var1, var2);
         this.onChanged();
      } else {
         this.intervalTimerValueBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public UserDeviceSettings$PbUserIntervalTimerSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (UserDeviceSettings$PbUserIntervalTimerSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final UserDeviceSettings$PbUserIntervalTimerSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserIntervalTimerSettings$Builder)super.setUnknownFields(var1);
   }
}
