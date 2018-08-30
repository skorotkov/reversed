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

public final class UserIds$PbUserIdentifier extends GeneratedMessageV3 implements UserIds$PbUserIdentifierOrBuilder {
   private static final UserIds$PbUserIdentifier DEFAULT_INSTANCE = new UserIds$PbUserIdentifier();
   public static final int EMAIL_FIELD_NUMBER = 2;
   public static final int FIRST_NAME_FIELD_NUMBER = 5;
   public static final int LAST_NAME_FIELD_NUMBER = 6;
   public static final int MASTER_IDENTIFIER_FIELD_NUMBER = 1;
   public static final int NICKNAME_FIELD_NUMBER = 4;
   @Deprecated
   public static final Parser PARSER = new UserIds$PbUserIdentifier$1();
   public static final int PASSWORD_TOKEN_FIELD_NUMBER = 3;
   public static final int USER_ID_LAST_MODIFIED_FIELD_NUMBER = 100;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private volatile Object email_;
   private volatile Object firstName_;
   private volatile Object lastName_;
   private long masterIdentifier_;
   private byte memoizedIsInitialized;
   private volatile Object nickname_;
   private UserIds$PbPasswordToken passwordToken_;
   private Types$PbSystemDateTime userIdLastModified_;

   private UserIds$PbUserIdentifier() {
      this.memoizedIsInitialized = (byte)-1;
      this.masterIdentifier_ = 0L;
      this.email_ = "";
      this.nickname_ = "";
      this.firstName_ = "";
      this.lastName_ = "";
   }

   private UserIds$PbUserIdentifier(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   UserIds$PbUserIdentifier(CodedInputStream var1, ExtensionRegistryLite var2, UserIds$1 var3) {
      this(var1, var2);
   }

   private UserIds$PbUserIdentifier(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   UserIds$PbUserIdentifier(Builder var1, UserIds$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(UserIds$PbUserIdentifier var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static long a(UserIds$PbUserIdentifier var0, long var1) {
      var0.masterIdentifier_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime a(UserIds$PbUserIdentifier var0, Types$PbSystemDateTime var1) {
      var0.userIdLastModified_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UserIds$PbPasswordToken a(UserIds$PbUserIdentifier var0, UserIds$PbPasswordToken var1) {
      var0.passwordToken_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object a(UserIds$PbUserIdentifier var0) {
      return var0.email_;
   }

   // $FF: synthetic method
   static Object a(UserIds$PbUserIdentifier var0, Object var1) {
      var0.email_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object b(UserIds$PbUserIdentifier var0) {
      return var0.nickname_;
   }

   // $FF: synthetic method
   static Object b(UserIds$PbUserIdentifier var0, Object var1) {
      var0.nickname_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static Object c(UserIds$PbUserIdentifier var0) {
      return var0.firstName_;
   }

   // $FF: synthetic method
   static Object c(UserIds$PbUserIdentifier var0, Object var1) {
      var0.firstName_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object d(UserIds$PbUserIdentifier var0) {
      return var0.lastName_;
   }

   // $FF: synthetic method
   static Object d(UserIds$PbUserIdentifier var0, Object var1) {
      var0.lastName_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet e(UserIds$PbUserIdentifier var0) {
      return var0.unknownFields;
   }

   public static UserIds$PbUserIdentifier getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return UserIds.c();
   }

   public static UserIds$PbUserIdentifier$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UserIds$PbUserIdentifier$Builder newBuilder(UserIds$PbUserIdentifier var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static UserIds$PbUserIdentifier parseDelimitedFrom(InputStream var0) {
      return (UserIds$PbUserIdentifier)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UserIds$PbUserIdentifier parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserIds$PbUserIdentifier)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UserIds$PbUserIdentifier parseFrom(ByteString var0) {
      return (UserIds$PbUserIdentifier)PARSER.parseFrom(var0);
   }

   public static UserIds$PbUserIdentifier parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (UserIds$PbUserIdentifier)PARSER.parseFrom(var0, var1);
   }

   public static UserIds$PbUserIdentifier parseFrom(CodedInputStream var0) {
      return (UserIds$PbUserIdentifier)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserIds$PbUserIdentifier parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (UserIds$PbUserIdentifier)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserIds$PbUserIdentifier parseFrom(InputStream var0) {
      return (UserIds$PbUserIdentifier)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserIds$PbUserIdentifier parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserIds$PbUserIdentifier)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserIds$PbUserIdentifier parseFrom(byte[] var0) {
      return (UserIds$PbUserIdentifier)PARSER.parseFrom(var0);
   }

   public static UserIds$PbUserIdentifier parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (UserIds$PbUserIdentifier)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof UserIds$PbUserIdentifier)) {
            var2 = super.equals(var1);
         } else {
            UserIds$PbUserIdentifier var5 = (UserIds$PbUserIdentifier)var1;
            boolean var3;
            if (this.hasMasterIdentifier() == var5.hasMasterIdentifier()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasMasterIdentifier()) {
               if (var3 && this.getMasterIdentifier() == var5.getMasterIdentifier()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasEmail() == var5.hasEmail()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasEmail()) {
               if (var3 && this.getEmail().equals(var5.getEmail())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasPasswordToken() == var5.hasPasswordToken()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasPasswordToken()) {
               if (var4 && this.getPasswordToken().equals(var5.getPasswordToken())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasNickname() == var5.hasNickname()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasNickname()) {
               if (var3 && this.getNickname().equals(var5.getNickname())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasFirstName() == var5.hasFirstName()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasFirstName()) {
               if (var3 && this.getFirstName().equals(var5.getFirstName())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasLastName() == var5.hasLastName()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasLastName()) {
               if (var3 && this.getLastName().equals(var5.getLastName())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasUserIdLastModified() == var5.hasUserIdLastModified()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasUserIdLastModified()) {
               if (var4 && this.getUserIdLastModified().equals(var5.getUserIdLastModified())) {
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

   public UserIds$PbUserIdentifier getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public String getEmail() {
      Object var1 = this.email_;
      String var3;
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.email_ = var3;
         }
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
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.firstName_ = var3;
         }
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
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.lastName_ = var3;
         }
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
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.nickname_ = var3;
         }
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

   public Parser getParserForType() {
      return PARSER;
   }

   public UserIds$PbPasswordToken getPasswordToken() {
      UserIds$PbPasswordToken var1;
      if (this.passwordToken_ == null) {
         var1 = UserIds$PbPasswordToken.getDefaultInstance();
      } else {
         var1 = this.passwordToken_;
      }

      return var1;
   }

   public UserIds$PbPasswordTokenOrBuilder getPasswordTokenOrBuilder() {
      UserIds$PbPasswordToken var1;
      if (this.passwordToken_ == null) {
         var1 = UserIds$PbPasswordToken.getDefaultInstance();
      } else {
         var1 = this.passwordToken_;
      }

      return var1;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeUInt64Size(1, this.masterIdentifier_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + GeneratedMessageV3.computeStringSize(2, this.email_);
         }

         var1 = var2;
         if ((this.bitField0_ & 4) == 4) {
            var1 = var2 + CodedOutputStream.computeMessageSize(3, this.getPasswordToken());
         }

         var2 = var1;
         if ((this.bitField0_ & 8) == 8) {
            var2 = var1 + GeneratedMessageV3.computeStringSize(4, this.nickname_);
         }

         var1 = var2;
         if ((this.bitField0_ & 16) == 16) {
            var1 = var2 + GeneratedMessageV3.computeStringSize(5, this.firstName_);
         }

         var2 = var1;
         if ((this.bitField0_ & 32) == 32) {
            var2 = var1 + GeneratedMessageV3.computeStringSize(6, this.lastName_);
         }

         var1 = var2;
         if ((this.bitField0_ & 64) == 64) {
            var1 = var2 + CodedOutputStream.computeMessageSize(100, this.getUserIdLastModified());
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public Types$PbSystemDateTime getUserIdLastModified() {
      Types$PbSystemDateTime var1;
      if (this.userIdLastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.userIdLastModified_;
      }

      return var1;
   }

   public Types$PbSystemDateTimeOrBuilder getUserIdLastModifiedOrBuilder() {
      Types$PbSystemDateTime var1;
      if (this.userIdLastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.userIdLastModified_;
      }

      return var1;
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

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.hasMasterIdentifier()) {
            var1 = (var2 * 37 + 1) * 53 + Internal.hashLong(this.getMasterIdentifier());
         }

         int var3 = var1;
         if (this.hasEmail()) {
            var3 = (var1 * 37 + 2) * 53 + this.getEmail().hashCode();
         }

         var2 = var3;
         if (this.hasPasswordToken()) {
            var2 = (var3 * 37 + 3) * 53 + this.getPasswordToken().hashCode();
         }

         var1 = var2;
         if (this.hasNickname()) {
            var1 = (var2 * 37 + 4) * 53 + this.getNickname().hashCode();
         }

         var2 = var1;
         if (this.hasFirstName()) {
            var2 = (var1 * 37 + 5) * 53 + this.getFirstName().hashCode();
         }

         var1 = var2;
         if (this.hasLastName()) {
            var1 = (var2 * 37 + 6) * 53 + this.getLastName().hashCode();
         }

         var2 = var1;
         if (this.hasUserIdLastModified()) {
            var2 = (var1 * 37 + 100) * 53 + this.getUserIdLastModified().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserIds.d().ensureFieldAccessorsInitialized(UserIds$PbUserIdentifier.class, UserIds$PbUserIdentifier$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (this.hasPasswordToken() && !this.getPasswordToken().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasUserIdLastModified() && !this.getUserIdLastModified().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public UserIds$PbUserIdentifier$Builder newBuilderForType() {
      return newBuilder();
   }

   protected UserIds$PbUserIdentifier$Builder newBuilderForType(BuilderParent var1) {
      return new UserIds$PbUserIdentifier$Builder(var1, (UserIds$1)null);
   }

   public UserIds$PbUserIdentifier$Builder toBuilder() {
      UserIds$PbUserIdentifier$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new UserIds$PbUserIdentifier$Builder((UserIds$1)null);
      } else {
         var1 = (new UserIds$PbUserIdentifier$Builder((UserIds$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt64(1, this.masterIdentifier_);
      }

      if ((this.bitField0_ & 2) == 2) {
         GeneratedMessageV3.writeString(var1, 2, this.email_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getPasswordToken());
      }

      if ((this.bitField0_ & 8) == 8) {
         GeneratedMessageV3.writeString(var1, 4, this.nickname_);
      }

      if ((this.bitField0_ & 16) == 16) {
         GeneratedMessageV3.writeString(var1, 5, this.firstName_);
      }

      if ((this.bitField0_ & 32) == 32) {
         GeneratedMessageV3.writeString(var1, 6, this.lastName_);
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeMessage(100, this.getUserIdLastModified());
      }

      this.unknownFields.writeTo(var1);
   }
}
