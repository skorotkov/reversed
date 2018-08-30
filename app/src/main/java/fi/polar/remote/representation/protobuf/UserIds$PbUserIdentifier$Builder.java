package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
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

public final class UserIds$PbUserIdentifier$Builder extends Builder implements UserIds$PbUserIdentifierOrBuilder {
   private int bitField0_;
   private Object email_;
   private Object firstName_;
   private Object lastName_;
   private long masterIdentifier_;
   private Object nickname_;
   private SingleFieldBuilderV3 passwordTokenBuilder_;
   private UserIds$PbPasswordToken passwordToken_;
   private SingleFieldBuilderV3 userIdLastModifiedBuilder_;
   private Types$PbSystemDateTime userIdLastModified_;

   private UserIds$PbUserIdentifier$Builder() {
      this.email_ = "";
      this.passwordToken_ = null;
      this.nickname_ = "";
      this.firstName_ = "";
      this.lastName_ = "";
      this.userIdLastModified_ = null;
      this.maybeForceBuilderInitialization();
   }

   private UserIds$PbUserIdentifier$Builder(BuilderParent var1) {
      super(var1);
      this.email_ = "";
      this.passwordToken_ = null;
      this.nickname_ = "";
      this.firstName_ = "";
      this.lastName_ = "";
      this.userIdLastModified_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   UserIds$PbUserIdentifier$Builder(BuilderParent var1, UserIds$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   UserIds$PbUserIdentifier$Builder(UserIds$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return UserIds.c();
   }

   private SingleFieldBuilderV3 getPasswordTokenFieldBuilder() {
      if (this.passwordTokenBuilder_ == null) {
         this.passwordTokenBuilder_ = new SingleFieldBuilderV3(this.getPasswordToken(), this.getParentForChildren(), this.isClean());
         this.passwordToken_ = null;
      }

      return this.passwordTokenBuilder_;
   }

   private SingleFieldBuilderV3 getUserIdLastModifiedFieldBuilder() {
      if (this.userIdLastModifiedBuilder_ == null) {
         this.userIdLastModifiedBuilder_ = new SingleFieldBuilderV3(this.getUserIdLastModified(), this.getParentForChildren(), this.isClean());
         this.userIdLastModified_ = null;
      }

      return this.userIdLastModifiedBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (UserIds$PbUserIdentifier.b()) {
         this.getPasswordTokenFieldBuilder();
         this.getUserIdLastModifiedFieldBuilder();
      }

   }

   public UserIds$PbUserIdentifier$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (UserIds$PbUserIdentifier$Builder)super.addRepeatedField(var1, var2);
   }

   public UserIds$PbUserIdentifier build() {
      UserIds$PbUserIdentifier var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public UserIds$PbUserIdentifier buildPartial() {
      byte var1 = 1;
      UserIds$PbUserIdentifier var2 = new UserIds$PbUserIdentifier(this, (UserIds$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      UserIds$PbUserIdentifier.a(var2, this.masterIdentifier_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      UserIds$PbUserIdentifier.a(var2, this.email_);
      int var5;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      } else {
         var5 = var4;
      }

      if (this.passwordTokenBuilder_ == null) {
         UserIds$PbUserIdentifier.a(var2, this.passwordToken_);
      } else {
         UserIds$PbUserIdentifier.a(var2, (UserIds$PbPasswordToken)this.passwordTokenBuilder_.build());
      }

      var4 = var5;
      if ((var3 & 8) == 8) {
         var4 = var5 | 8;
      }

      UserIds$PbUserIdentifier.b(var2, this.nickname_);
      var5 = var4;
      if ((var3 & 16) == 16) {
         var5 = var4 | 16;
      }

      UserIds$PbUserIdentifier.c(var2, this.firstName_);
      var4 = var5;
      if ((var3 & 32) == 32) {
         var4 = var5 | 32;
      }

      UserIds$PbUserIdentifier.d(var2, this.lastName_);
      var5 = var4;
      if ((var3 & 64) == 64) {
         var5 = var4 | 64;
      }

      if (this.userIdLastModifiedBuilder_ == null) {
         UserIds$PbUserIdentifier.a(var2, this.userIdLastModified_);
      } else {
         UserIds$PbUserIdentifier.a(var2, (Types$PbSystemDateTime)this.userIdLastModifiedBuilder_.build());
      }

      UserIds$PbUserIdentifier.a(var2, var5);
      this.onBuilt();
      return var2;
   }

   public UserIds$PbUserIdentifier$Builder clear() {
      super.clear();
      this.masterIdentifier_ = 0L;
      this.bitField0_ &= -2;
      this.email_ = "";
      this.bitField0_ &= -3;
      if (this.passwordTokenBuilder_ == null) {
         this.passwordToken_ = null;
      } else {
         this.passwordTokenBuilder_.clear();
      }

      this.bitField0_ &= -5;
      this.nickname_ = "";
      this.bitField0_ &= -9;
      this.firstName_ = "";
      this.bitField0_ &= -17;
      this.lastName_ = "";
      this.bitField0_ &= -33;
      if (this.userIdLastModifiedBuilder_ == null) {
         this.userIdLastModified_ = null;
      } else {
         this.userIdLastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -65;
      return this;
   }

   public UserIds$PbUserIdentifier$Builder clearEmail() {
      this.bitField0_ &= -3;
      this.email_ = UserIds$PbUserIdentifier.getDefaultInstance().getEmail();
      this.onChanged();
      return this;
   }

   public UserIds$PbUserIdentifier$Builder clearField(FieldDescriptor var1) {
      return (UserIds$PbUserIdentifier$Builder)super.clearField(var1);
   }

   public UserIds$PbUserIdentifier$Builder clearFirstName() {
      this.bitField0_ &= -17;
      this.firstName_ = UserIds$PbUserIdentifier.getDefaultInstance().getFirstName();
      this.onChanged();
      return this;
   }

   public UserIds$PbUserIdentifier$Builder clearLastName() {
      this.bitField0_ &= -33;
      this.lastName_ = UserIds$PbUserIdentifier.getDefaultInstance().getLastName();
      this.onChanged();
      return this;
   }

   public UserIds$PbUserIdentifier$Builder clearMasterIdentifier() {
      this.bitField0_ &= -2;
      this.masterIdentifier_ = 0L;
      this.onChanged();
      return this;
   }

   public UserIds$PbUserIdentifier$Builder clearNickname() {
      this.bitField0_ &= -9;
      this.nickname_ = UserIds$PbUserIdentifier.getDefaultInstance().getNickname();
      this.onChanged();
      return this;
   }

   public UserIds$PbUserIdentifier$Builder clearOneof(OneofDescriptor var1) {
      return (UserIds$PbUserIdentifier$Builder)super.clearOneof(var1);
   }

   public UserIds$PbUserIdentifier$Builder clearPasswordToken() {
      if (this.passwordTokenBuilder_ == null) {
         this.passwordToken_ = null;
         this.onChanged();
      } else {
         this.passwordTokenBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public UserIds$PbUserIdentifier$Builder clearUserIdLastModified() {
      if (this.userIdLastModifiedBuilder_ == null) {
         this.userIdLastModified_ = null;
         this.onChanged();
      } else {
         this.userIdLastModifiedBuilder_.clear();
      }

      this.bitField0_ &= -65;
      return this;
   }

   public UserIds$PbUserIdentifier$Builder clone() {
      return (UserIds$PbUserIdentifier$Builder)super.clone();
   }

   public UserIds$PbUserIdentifier getDefaultInstanceForType() {
      return UserIds$PbUserIdentifier.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return UserIds.c();
   }

   public String getEmail() {
      Object var1 = this.email_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.email_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getEmailBytes() {
      Object var1 = this.email_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.email_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public String getFirstName() {
      Object var1 = this.firstName_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.firstName_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getFirstNameBytes() {
      Object var1 = this.firstName_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.firstName_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public String getLastName() {
      Object var1 = this.lastName_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.lastName_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getLastNameBytes() {
      Object var1 = this.lastName_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.lastName_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public long getMasterIdentifier() {
      return this.masterIdentifier_;
   }

   public String getNickname() {
      Object var1 = this.nickname_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.nickname_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getNicknameBytes() {
      Object var1 = this.nickname_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.nickname_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public UserIds$PbPasswordToken getPasswordToken() {
      UserIds$PbPasswordToken var1;
      if (this.passwordTokenBuilder_ == null) {
         if (this.passwordToken_ == null) {
            var1 = UserIds$PbPasswordToken.getDefaultInstance();
         } else {
            var1 = this.passwordToken_;
         }
      } else {
         var1 = (UserIds$PbPasswordToken)this.passwordTokenBuilder_.getMessage();
      }

      return var1;
   }

   public UserIds$PbPasswordToken$Builder getPasswordTokenBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (UserIds$PbPasswordToken$Builder)this.getPasswordTokenFieldBuilder().getBuilder();
   }

   public UserIds$PbPasswordTokenOrBuilder getPasswordTokenOrBuilder() {
      Object var1;
      if (this.passwordTokenBuilder_ != null) {
         var1 = (UserIds$PbPasswordTokenOrBuilder)this.passwordTokenBuilder_.getMessageOrBuilder();
      } else if (this.passwordToken_ == null) {
         var1 = UserIds$PbPasswordToken.getDefaultInstance();
      } else {
         var1 = this.passwordToken_;
      }

      return (UserIds$PbPasswordTokenOrBuilder)var1;
   }

   public Types$PbSystemDateTime getUserIdLastModified() {
      Types$PbSystemDateTime var1;
      if (this.userIdLastModifiedBuilder_ == null) {
         if (this.userIdLastModified_ == null) {
            var1 = Types$PbSystemDateTime.getDefaultInstance();
         } else {
            var1 = this.userIdLastModified_;
         }
      } else {
         var1 = (Types$PbSystemDateTime)this.userIdLastModifiedBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbSystemDateTime$Builder getUserIdLastModifiedBuilder() {
      this.bitField0_ |= 64;
      this.onChanged();
      return (Types$PbSystemDateTime$Builder)this.getUserIdLastModifiedFieldBuilder().getBuilder();
   }

   public Types$PbSystemDateTimeOrBuilder getUserIdLastModifiedOrBuilder() {
      Object var1;
      if (this.userIdLastModifiedBuilder_ != null) {
         var1 = (Types$PbSystemDateTimeOrBuilder)this.userIdLastModifiedBuilder_.getMessageOrBuilder();
      } else if (this.userIdLastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.userIdLastModified_;
      }

      return (Types$PbSystemDateTimeOrBuilder)var1;
   }

   public boolean hasEmail() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasFirstName() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLastName() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMasterIdentifier() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasNickname() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPasswordToken() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasUserIdLastModified() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserIds.d().ensureFieldAccessorsInitialized(UserIds$PbUserIdentifier.class, UserIds$PbUserIdentifier$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if ((!this.hasPasswordToken() || this.getPasswordToken().isInitialized()) && (!this.hasUserIdLastModified() || this.getUserIdLastModified().isInitialized())) {
         var1 = true;
      }

      return var1;
   }

   public UserIds$PbUserIdentifier$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      UserIds$PbUserIdentifier var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (UserIds$PbUserIdentifier)UserIds$PbUserIdentifier.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (UserIds$PbUserIdentifier)var10.getUnfinishedMessage();
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

   public UserIds$PbUserIdentifier$Builder mergeFrom(Message var1) {
      UserIds$PbUserIdentifier$Builder var2;
      if (var1 instanceof UserIds$PbUserIdentifier) {
         var2 = this.mergeFrom((UserIds$PbUserIdentifier)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public UserIds$PbUserIdentifier$Builder mergeFrom(UserIds$PbUserIdentifier var1) {
      if (var1 != UserIds$PbUserIdentifier.getDefaultInstance()) {
         if (var1.hasMasterIdentifier()) {
            this.setMasterIdentifier(var1.getMasterIdentifier());
         }

         if (var1.hasEmail()) {
            this.bitField0_ |= 2;
            this.email_ = UserIds$PbUserIdentifier.a(var1);
            this.onChanged();
         }

         if (var1.hasPasswordToken()) {
            this.mergePasswordToken(var1.getPasswordToken());
         }

         if (var1.hasNickname()) {
            this.bitField0_ |= 8;
            this.nickname_ = UserIds$PbUserIdentifier.b(var1);
            this.onChanged();
         }

         if (var1.hasFirstName()) {
            this.bitField0_ |= 16;
            this.firstName_ = UserIds$PbUserIdentifier.c(var1);
            this.onChanged();
         }

         if (var1.hasLastName()) {
            this.bitField0_ |= 32;
            this.lastName_ = UserIds$PbUserIdentifier.d(var1);
            this.onChanged();
         }

         if (var1.hasUserIdLastModified()) {
            this.mergeUserIdLastModified(var1.getUserIdLastModified());
         }

         this.mergeUnknownFields(UserIds$PbUserIdentifier.e(var1));
         this.onChanged();
      }

      return this;
   }

   public UserIds$PbUserIdentifier$Builder mergePasswordToken(UserIds$PbPasswordToken var1) {
      if (this.passwordTokenBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.passwordToken_ != null && this.passwordToken_ != UserIds$PbPasswordToken.getDefaultInstance()) {
            this.passwordToken_ = UserIds$PbPasswordToken.newBuilder(this.passwordToken_).mergeFrom(var1).buildPartial();
         } else {
            this.passwordToken_ = var1;
         }

         this.onChanged();
      } else {
         this.passwordTokenBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public final UserIds$PbUserIdentifier$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (UserIds$PbUserIdentifier$Builder)super.mergeUnknownFields(var1);
   }

   public UserIds$PbUserIdentifier$Builder mergeUserIdLastModified(Types$PbSystemDateTime var1) {
      if (this.userIdLastModifiedBuilder_ == null) {
         if ((this.bitField0_ & 64) == 64 && this.userIdLastModified_ != null && this.userIdLastModified_ != Types$PbSystemDateTime.getDefaultInstance()) {
            this.userIdLastModified_ = Types$PbSystemDateTime.newBuilder(this.userIdLastModified_).mergeFrom(var1).buildPartial();
         } else {
            this.userIdLastModified_ = var1;
         }

         this.onChanged();
      } else {
         this.userIdLastModifiedBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public UserIds$PbUserIdentifier$Builder setEmail(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.email_ = var1;
         this.onChanged();
         return this;
      }
   }

   public UserIds$PbUserIdentifier$Builder setEmailBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.email_ = var1;
         this.onChanged();
         return this;
      }
   }

   public UserIds$PbUserIdentifier$Builder setField(FieldDescriptor var1, Object var2) {
      return (UserIds$PbUserIdentifier$Builder)super.setField(var1, var2);
   }

   public UserIds$PbUserIdentifier$Builder setFirstName(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 16;
         this.firstName_ = var1;
         this.onChanged();
         return this;
      }
   }

   public UserIds$PbUserIdentifier$Builder setFirstNameBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 16;
         this.firstName_ = var1;
         this.onChanged();
         return this;
      }
   }

   public UserIds$PbUserIdentifier$Builder setLastName(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 32;
         this.lastName_ = var1;
         this.onChanged();
         return this;
      }
   }

   public UserIds$PbUserIdentifier$Builder setLastNameBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 32;
         this.lastName_ = var1;
         this.onChanged();
         return this;
      }
   }

   public UserIds$PbUserIdentifier$Builder setMasterIdentifier(long var1) {
      this.bitField0_ |= 1;
      this.masterIdentifier_ = var1;
      this.onChanged();
      return this;
   }

   public UserIds$PbUserIdentifier$Builder setNickname(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 8;
         this.nickname_ = var1;
         this.onChanged();
         return this;
      }
   }

   public UserIds$PbUserIdentifier$Builder setNicknameBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 8;
         this.nickname_ = var1;
         this.onChanged();
         return this;
      }
   }

   public UserIds$PbUserIdentifier$Builder setPasswordToken(UserIds$PbPasswordToken$Builder var1) {
      if (this.passwordTokenBuilder_ == null) {
         this.passwordToken_ = var1.build();
         this.onChanged();
      } else {
         this.passwordTokenBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public UserIds$PbUserIdentifier$Builder setPasswordToken(UserIds$PbPasswordToken var1) {
      if (this.passwordTokenBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.passwordToken_ = var1;
         this.onChanged();
      } else {
         this.passwordTokenBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public UserIds$PbUserIdentifier$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (UserIds$PbUserIdentifier$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final UserIds$PbUserIdentifier$Builder setUnknownFields(UnknownFieldSet var1) {
      return (UserIds$PbUserIdentifier$Builder)super.setUnknownFields(var1);
   }

   public UserIds$PbUserIdentifier$Builder setUserIdLastModified(Types$PbSystemDateTime$Builder var1) {
      if (this.userIdLastModifiedBuilder_ == null) {
         this.userIdLastModified_ = var1.build();
         this.onChanged();
      } else {
         this.userIdLastModifiedBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 64;
      return this;
   }

   public UserIds$PbUserIdentifier$Builder setUserIdLastModified(Types$PbSystemDateTime var1) {
      if (this.userIdLastModifiedBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.userIdLastModified_ = var1;
         this.onChanged();
      } else {
         this.userIdLastModifiedBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }
}
