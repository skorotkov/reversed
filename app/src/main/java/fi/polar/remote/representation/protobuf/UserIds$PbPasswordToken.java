package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.InputStream;

public final class UserIds$PbPasswordToken extends GeneratedMessageV3 implements UserIds$PbPasswordTokenOrBuilder {
   private static final UserIds$PbPasswordToken DEFAULT_INSTANCE = new UserIds$PbPasswordToken();
   public static final int ENCRYPTED_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new UserIds$PbPasswordToken$1();
   public static final int TOKEN_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private boolean encrypted_;
   private byte memoizedIsInitialized;
   private ByteString token_;

   private UserIds$PbPasswordToken() {
      this.memoizedIsInitialized = (byte)-1;
      this.token_ = ByteString.EMPTY;
      this.encrypted_ = false;
   }

   private UserIds$PbPasswordToken(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   UserIds$PbPasswordToken(CodedInputStream var1, ExtensionRegistryLite var2, UserIds$1 var3) {
      this(var1, var2);
   }

   private UserIds$PbPasswordToken(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   UserIds$PbPasswordToken(Builder var1, UserIds$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(UserIds$PbPasswordToken var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ByteString a(UserIds$PbPasswordToken var0, ByteString var1) {
      var0.token_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(UserIds$PbPasswordToken var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean a(UserIds$PbPasswordToken var0, boolean var1) {
      var0.encrypted_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static UserIds$PbPasswordToken getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return UserIds.a();
   }

   public static UserIds$PbPasswordToken$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UserIds$PbPasswordToken$Builder newBuilder(UserIds$PbPasswordToken var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static UserIds$PbPasswordToken parseDelimitedFrom(InputStream var0) {
      return (UserIds$PbPasswordToken)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UserIds$PbPasswordToken parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserIds$PbPasswordToken)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UserIds$PbPasswordToken parseFrom(ByteString var0) {
      return (UserIds$PbPasswordToken)PARSER.parseFrom(var0);
   }

   public static UserIds$PbPasswordToken parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (UserIds$PbPasswordToken)PARSER.parseFrom(var0, var1);
   }

   public static UserIds$PbPasswordToken parseFrom(CodedInputStream var0) {
      return (UserIds$PbPasswordToken)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserIds$PbPasswordToken parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (UserIds$PbPasswordToken)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserIds$PbPasswordToken parseFrom(InputStream var0) {
      return (UserIds$PbPasswordToken)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserIds$PbPasswordToken parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserIds$PbPasswordToken)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserIds$PbPasswordToken parseFrom(byte[] var0) {
      return (UserIds$PbPasswordToken)PARSER.parseFrom(var0);
   }

   public static UserIds$PbPasswordToken parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (UserIds$PbPasswordToken)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof UserIds$PbPasswordToken)) {
            var2 = super.equals(var1);
         } else {
            UserIds$PbPasswordToken var5 = (UserIds$PbPasswordToken)var1;
            boolean var3;
            if (this.hasToken() == var5.hasToken()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasToken()) {
               if (var3 && this.getToken().equals(var5.getToken())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasEncrypted() == var5.hasEncrypted()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasEncrypted()) {
               if (var4 && this.getEncrypted() == var5.getEncrypted()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (!var3 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public UserIds$PbPasswordToken getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public boolean getEncrypted() {
      return this.encrypted_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeBytesSize(1, this.token_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeBoolSize(2, this.encrypted_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public ByteString getToken() {
      return this.token_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
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

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.hasToken()) {
            var1 = (var2 * 37 + 1) * 53 + this.getToken().hashCode();
         }

         var2 = var1;
         if (this.hasEncrypted()) {
            var2 = (var1 * 37 + 2) * 53 + Internal.hashBoolean(this.getEncrypted());
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserIds.b().ensureFieldAccessorsInitialized(UserIds$PbPasswordToken.class, UserIds$PbPasswordToken$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasToken()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasEncrypted()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public UserIds$PbPasswordToken$Builder newBuilderForType() {
      return newBuilder();
   }

   protected UserIds$PbPasswordToken$Builder newBuilderForType(BuilderParent var1) {
      return new UserIds$PbPasswordToken$Builder(var1, (UserIds$1)null);
   }

   public UserIds$PbPasswordToken$Builder toBuilder() {
      UserIds$PbPasswordToken$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new UserIds$PbPasswordToken$Builder((UserIds$1)null);
      } else {
         var1 = (new UserIds$PbPasswordToken$Builder((UserIds$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeBytes(1, this.token_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeBool(2, this.encrypted_);
      }

      this.unknownFields.writeTo(var1);
   }
}
