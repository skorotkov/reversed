package protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.InputStream;

public final class PftpRequest$PbPFtpGenerateChallengeTokenParams extends GeneratedMessageV3 implements PftpRequest$PbPFtpGenerateChallengeTokenParamsOrBuilder {
   private static final PftpRequest$PbPFtpGenerateChallengeTokenParams DEFAULT_INSTANCE = new PftpRequest$PbPFtpGenerateChallengeTokenParams();
   public static final int NONSE_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new PftpRequest$PbPFtpGenerateChallengeTokenParams$1();
   public static final int USER_ID_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private ByteString nonse_;
   private int userId_;

   private PftpRequest$PbPFtpGenerateChallengeTokenParams() {
      this.memoizedIsInitialized = (byte)-1;
      this.userId_ = 0;
      this.nonse_ = ByteString.EMPTY;
   }

   private PftpRequest$PbPFtpGenerateChallengeTokenParams(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PftpRequest$PbPFtpGenerateChallengeTokenParams(CodedInputStream var1, ExtensionRegistryLite var2, PftpRequest$1 var3) {
      this(var1, var2);
   }

   private PftpRequest$PbPFtpGenerateChallengeTokenParams(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PftpRequest$PbPFtpGenerateChallengeTokenParams(Builder var1, PftpRequest$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PftpRequest$PbPFtpGenerateChallengeTokenParams var0, int var1) {
      var0.userId_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ByteString a(PftpRequest$PbPFtpGenerateChallengeTokenParams var0, ByteString var1) {
      var0.nonse_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(PftpRequest$PbPFtpGenerateChallengeTokenParams var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(PftpRequest$PbPFtpGenerateChallengeTokenParams var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static PftpRequest$PbPFtpGenerateChallengeTokenParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PftpRequest.g();
   }

   public static PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder newBuilder(PftpRequest$PbPFtpGenerateChallengeTokenParams var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PftpRequest$PbPFtpGenerateChallengeTokenParams parseDelimitedFrom(InputStream var0) {
      return (PftpRequest$PbPFtpGenerateChallengeTokenParams)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PftpRequest$PbPFtpGenerateChallengeTokenParams parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpRequest$PbPFtpGenerateChallengeTokenParams)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PftpRequest$PbPFtpGenerateChallengeTokenParams parseFrom(ByteString var0) {
      return (PftpRequest$PbPFtpGenerateChallengeTokenParams)PARSER.parseFrom(var0);
   }

   public static PftpRequest$PbPFtpGenerateChallengeTokenParams parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PftpRequest$PbPFtpGenerateChallengeTokenParams)PARSER.parseFrom(var0, var1);
   }

   public static PftpRequest$PbPFtpGenerateChallengeTokenParams parseFrom(CodedInputStream var0) {
      return (PftpRequest$PbPFtpGenerateChallengeTokenParams)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpRequest$PbPFtpGenerateChallengeTokenParams parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PftpRequest$PbPFtpGenerateChallengeTokenParams)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpRequest$PbPFtpGenerateChallengeTokenParams parseFrom(InputStream var0) {
      return (PftpRequest$PbPFtpGenerateChallengeTokenParams)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpRequest$PbPFtpGenerateChallengeTokenParams parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpRequest$PbPFtpGenerateChallengeTokenParams)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpRequest$PbPFtpGenerateChallengeTokenParams parseFrom(byte[] var0) {
      return (PftpRequest$PbPFtpGenerateChallengeTokenParams)PARSER.parseFrom(var0);
   }

   public static PftpRequest$PbPFtpGenerateChallengeTokenParams parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PftpRequest$PbPFtpGenerateChallengeTokenParams)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PftpRequest$PbPFtpGenerateChallengeTokenParams)) {
            var2 = super.equals(var1);
         } else {
            PftpRequest$PbPFtpGenerateChallengeTokenParams var5 = (PftpRequest$PbPFtpGenerateChallengeTokenParams)var1;
            boolean var3;
            if (this.hasUserId() == var5.hasUserId()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasUserId()) {
               if (var3 && this.getUserId() == var5.getUserId()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasNonse() == var5.hasNonse()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasNonse()) {
               if (var3 && this.getNonse().equals(var5.getNonse())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (!var4 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public PftpRequest$PbPFtpGenerateChallengeTokenParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public ByteString getNonse() {
      return this.nonse_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeUInt32Size(1, this.userId_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeBytesSize(2, this.nonse_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public int getUserId() {
      return this.userId_;
   }

   public boolean hasNonse() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasUserId() {
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
         if (this.hasUserId()) {
            var1 = (var2 * 37 + 1) * 53 + this.getUserId();
         }

         var2 = var1;
         if (this.hasNonse()) {
            var2 = (var1 * 37 + 2) * 53 + this.getNonse().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpRequest.h().ensureFieldAccessorsInitialized(PftpRequest$PbPFtpGenerateChallengeTokenParams.class, PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasUserId()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasNonse()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder newBuilderForType(BuilderParent var1) {
      return new PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder(var1, (PftpRequest$1)null);
   }

   public PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder toBuilder() {
      PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder((PftpRequest$1)null);
      } else {
         var1 = (new PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder((PftpRequest$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.userId_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeBytes(2, this.nonse_);
      }

      this.unknownFields.writeTo(var1);
   }
}
