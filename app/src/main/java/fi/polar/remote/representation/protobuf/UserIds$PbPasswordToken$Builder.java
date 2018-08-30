package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
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

public final class UserIds$PbPasswordToken$Builder extends Builder implements UserIds$PbPasswordTokenOrBuilder {
   private int bitField0_;
   private boolean encrypted_;
   private ByteString token_;

   private UserIds$PbPasswordToken$Builder() {
      this.token_ = ByteString.EMPTY;
      this.maybeForceBuilderInitialization();
   }

   private UserIds$PbPasswordToken$Builder(BuilderParent var1) {
      super(var1);
      this.token_ = ByteString.EMPTY;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   UserIds$PbPasswordToken$Builder(BuilderParent var1, UserIds$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   UserIds$PbPasswordToken$Builder(UserIds$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return UserIds.a();
   }

   private void maybeForceBuilderInitialization() {
      if (UserIds$PbPasswordToken.b()) {
      }

   }

   public UserIds$PbPasswordToken$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (UserIds$PbPasswordToken$Builder)super.addRepeatedField(var1, var2);
   }

   public UserIds$PbPasswordToken build() {
      UserIds$PbPasswordToken var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public UserIds$PbPasswordToken buildPartial() {
      byte var1 = 1;
      UserIds$PbPasswordToken var2 = new UserIds$PbPasswordToken(this, (UserIds$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      UserIds$PbPasswordToken.a(var2, this.token_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      UserIds$PbPasswordToken.a(var2, this.encrypted_);
      UserIds$PbPasswordToken.a(var2, var4);
      this.onBuilt();
      return var2;
   }

   public UserIds$PbPasswordToken$Builder clear() {
      super.clear();
      this.token_ = ByteString.EMPTY;
      this.bitField0_ &= -2;
      this.encrypted_ = false;
      this.bitField0_ &= -3;
      return this;
   }

   public UserIds$PbPasswordToken$Builder clearEncrypted() {
      this.bitField0_ &= -3;
      this.encrypted_ = false;
      this.onChanged();
      return this;
   }

   public UserIds$PbPasswordToken$Builder clearField(FieldDescriptor var1) {
      return (UserIds$PbPasswordToken$Builder)super.clearField(var1);
   }

   public UserIds$PbPasswordToken$Builder clearOneof(OneofDescriptor var1) {
      return (UserIds$PbPasswordToken$Builder)super.clearOneof(var1);
   }

   public UserIds$PbPasswordToken$Builder clearToken() {
      this.bitField0_ &= -2;
      this.token_ = UserIds$PbPasswordToken.getDefaultInstance().getToken();
      this.onChanged();
      return this;
   }

   public UserIds$PbPasswordToken$Builder clone() {
      return (UserIds$PbPasswordToken$Builder)super.clone();
   }

   public UserIds$PbPasswordToken getDefaultInstanceForType() {
      return UserIds$PbPasswordToken.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return UserIds.a();
   }

   public boolean getEncrypted() {
      return this.encrypted_;
   }

   public ByteString getToken() {
      return this.token_;
   }

   public boolean hasEncrypted() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasToken() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserIds.b().ensureFieldAccessorsInitialized(UserIds$PbPasswordToken.class, UserIds$PbPasswordToken$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasToken() && this.hasEncrypted()) {
         var1 = true;
      }

      return var1;
   }

   public UserIds$PbPasswordToken$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      UserIds$PbPasswordToken var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (UserIds$PbPasswordToken)UserIds$PbPasswordToken.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (UserIds$PbPasswordToken)var10.getUnfinishedMessage();
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

   public UserIds$PbPasswordToken$Builder mergeFrom(Message var1) {
      UserIds$PbPasswordToken$Builder var2;
      if (var1 instanceof UserIds$PbPasswordToken) {
         var2 = this.mergeFrom((UserIds$PbPasswordToken)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public UserIds$PbPasswordToken$Builder mergeFrom(UserIds$PbPasswordToken var1) {
      if (var1 != UserIds$PbPasswordToken.getDefaultInstance()) {
         if (var1.hasToken()) {
            this.setToken(var1.getToken());
         }

         if (var1.hasEncrypted()) {
            this.setEncrypted(var1.getEncrypted());
         }

         this.mergeUnknownFields(UserIds$PbPasswordToken.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final UserIds$PbPasswordToken$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (UserIds$PbPasswordToken$Builder)super.mergeUnknownFields(var1);
   }

   public UserIds$PbPasswordToken$Builder setEncrypted(boolean var1) {
      this.bitField0_ |= 2;
      this.encrypted_ = var1;
      this.onChanged();
      return this;
   }

   public UserIds$PbPasswordToken$Builder setField(FieldDescriptor var1, Object var2) {
      return (UserIds$PbPasswordToken$Builder)super.setField(var1, var2);
   }

   public UserIds$PbPasswordToken$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (UserIds$PbPasswordToken$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public UserIds$PbPasswordToken$Builder setToken(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.token_ = var1;
         this.onChanged();
         return this;
      }
   }

   public final UserIds$PbPasswordToken$Builder setUnknownFields(UnknownFieldSet var1) {
      return (UserIds$PbPasswordToken$Builder)super.setUnknownFields(var1);
   }
}
