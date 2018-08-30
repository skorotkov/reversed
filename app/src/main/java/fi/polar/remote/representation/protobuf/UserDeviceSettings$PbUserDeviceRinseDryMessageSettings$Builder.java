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

public final class UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder extends Builder implements UserDeviceSettings$PbUserDeviceRinseDryMessageSettingsOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 lastModifiedBuilder_;
   private Types$PbSystemDateTime lastModified_;
   private int messageCount_;

   private UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder() {
      this.lastModified_ = null;
      this.maybeForceBuilderInitialization();
   }

   private UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder(BuilderParent var1) {
      super(var1);
      this.lastModified_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder(BuilderParent var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder(UserDeviceSettings$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.y();
   }

   private SingleFieldBuilderV3 getLastModifiedFieldBuilder() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModifiedBuilder_ = new SingleFieldBuilderV3(this.getLastModified(), this.getParentForChildren(), this.isClean());
         this.lastModified_ = null;
      }

      return this.lastModifiedBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (UserDeviceSettings$PbUserDeviceRinseDryMessageSettings.b()) {
         this.getLastModifiedFieldBuilder();
      }

   }

   public UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public UserDeviceSettings$PbUserDeviceRinseDryMessageSettings build() {
      UserDeviceSettings$PbUserDeviceRinseDryMessageSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public UserDeviceSettings$PbUserDeviceRinseDryMessageSettings buildPartial() {
      int var1 = 1;
      UserDeviceSettings$PbUserDeviceRinseDryMessageSettings var2 = new UserDeviceSettings$PbUserDeviceRinseDryMessageSettings(this, (UserDeviceSettings$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      UserDeviceSettings$PbUserDeviceRinseDryMessageSettings.a(var2, this.messageCount_);
      if ((var3 & 2) == 2) {
         var1 |= 2;
      }

      if (this.lastModifiedBuilder_ == null) {
         UserDeviceSettings$PbUserDeviceRinseDryMessageSettings.a(var2, this.lastModified_);
      } else {
         UserDeviceSettings$PbUserDeviceRinseDryMessageSettings.a(var2, (Types$PbSystemDateTime)this.lastModifiedBuilder_.build());
      }

      UserDeviceSettings$PbUserDeviceRinseDryMessageSettings.b(var2, var1);
      this.onBuilt();
      return var2;
   }

   public UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder clear() {
      super.clear();
      this.messageCount_ = 0;
      this.bitField0_ &= -2;
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder clearField(FieldDescriptor var1) {
      return (UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder)super.clearField(var1);
   }

   public UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder clearLastModified() {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = null;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder clearMessageCount() {
      this.bitField0_ &= -2;
      this.messageCount_ = 0;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder clearOneof(OneofDescriptor var1) {
      return (UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder)super.clearOneof(var1);
   }

   public UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder clone() {
      return (UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder)super.clone();
   }

   public UserDeviceSettings$PbUserDeviceRinseDryMessageSettings getDefaultInstanceForType() {
      return UserDeviceSettings$PbUserDeviceRinseDryMessageSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return UserDeviceSettings.y();
   }

   public Types$PbSystemDateTime getLastModified() {
      Types$PbSystemDateTime var1;
      if (this.lastModifiedBuilder_ == null) {
         if (this.lastModified_ == null) {
            var1 = Types$PbSystemDateTime.getDefaultInstance();
         } else {
            var1 = this.lastModified_;
         }
      } else {
         var1 = (Types$PbSystemDateTime)this.lastModifiedBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbSystemDateTime$Builder getLastModifiedBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Types$PbSystemDateTime$Builder)this.getLastModifiedFieldBuilder().getBuilder();
   }

   public Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder() {
      Object var1;
      if (this.lastModifiedBuilder_ != null) {
         var1 = (Types$PbSystemDateTimeOrBuilder)this.lastModifiedBuilder_.getMessageOrBuilder();
      } else if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
      }

      return (Types$PbSystemDateTimeOrBuilder)var1;
   }

   public int getMessageCount() {
      return this.messageCount_;
   }

   public boolean hasLastModified() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMessageCount() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.z().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserDeviceRinseDryMessageSettings.class, UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasMessageCount()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasLastModified()) {
            var2 = var1;
            if (this.getLastModified().isInitialized()) {
               var2 = true;
            }
         }
      }

      return var2;
   }

   public UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      UserDeviceSettings$PbUserDeviceRinseDryMessageSettings var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (UserDeviceSettings$PbUserDeviceRinseDryMessageSettings)UserDeviceSettings$PbUserDeviceRinseDryMessageSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (UserDeviceSettings$PbUserDeviceRinseDryMessageSettings)var10.getUnfinishedMessage();
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

   public UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder mergeFrom(Message var1) {
      UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder var2;
      if (var1 instanceof UserDeviceSettings$PbUserDeviceRinseDryMessageSettings) {
         var2 = this.mergeFrom((UserDeviceSettings$PbUserDeviceRinseDryMessageSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder mergeFrom(UserDeviceSettings$PbUserDeviceRinseDryMessageSettings var1) {
      if (var1 != UserDeviceSettings$PbUserDeviceRinseDryMessageSettings.getDefaultInstance()) {
         if (var1.hasMessageCount()) {
            this.setMessageCount(var1.getMessageCount());
         }

         if (var1.hasLastModified()) {
            this.mergeLastModified(var1.getLastModified());
         }

         this.mergeUnknownFields(UserDeviceSettings$PbUserDeviceRinseDryMessageSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder mergeLastModified(Types$PbSystemDateTime var1) {
      if (this.lastModifiedBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.lastModified_ != null && this.lastModified_ != Types$PbSystemDateTime.getDefaultInstance()) {
            this.lastModified_ = Types$PbSystemDateTime.newBuilder(this.lastModified_).mergeFrom(var1).buildPartial();
         } else {
            this.lastModified_ = var1;
         }

         this.onChanged();
      } else {
         this.lastModifiedBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder)super.mergeUnknownFields(var1);
   }

   public UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder)super.setField(var1, var2);
   }

   public UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder setLastModified(Types$PbSystemDateTime$Builder var1) {
      if (this.lastModifiedBuilder_ == null) {
         this.lastModified_ = var1.build();
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder setLastModified(Types$PbSystemDateTime var1) {
      if (this.lastModifiedBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.lastModified_ = var1;
         this.onChanged();
      } else {
         this.lastModifiedBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder setMessageCount(int var1) {
      this.bitField0_ |= 1;
      this.messageCount_ = var1;
      this.onChanged();
      return this;
   }

   public UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (UserDeviceSettings$PbUserDeviceRinseDryMessageSettings$Builder)super.setUnknownFields(var1);
   }
}
