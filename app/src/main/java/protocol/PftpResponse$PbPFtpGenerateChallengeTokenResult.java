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

public final class PftpResponse$PbPFtpGenerateChallengeTokenResult extends GeneratedMessageV3 implements PftpResponse$PbPFtpGenerateChallengeTokenResultOrBuilder {
   private static final PftpResponse$PbPFtpGenerateChallengeTokenResult DEFAULT_INSTANCE = new PftpResponse$PbPFtpGenerateChallengeTokenResult();
   @Deprecated
   public static final Parser PARSER = new PftpResponse$PbPFtpGenerateChallengeTokenResult$1();
   public static final int TOKEN_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private ByteString token_;

   private PftpResponse$PbPFtpGenerateChallengeTokenResult() {
      this.memoizedIsInitialized = (byte)-1;
      this.token_ = ByteString.EMPTY;
   }

   private PftpResponse$PbPFtpGenerateChallengeTokenResult(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpGenerateChallengeTokenResult(CodedInputStream var1, ExtensionRegistryLite var2, PftpResponse$1 var3) {
      this(var1, var2);
   }

   private PftpResponse$PbPFtpGenerateChallengeTokenResult(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpGenerateChallengeTokenResult(Builder var1, PftpResponse$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PftpResponse$PbPFtpGenerateChallengeTokenResult var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ByteString a(PftpResponse$PbPFtpGenerateChallengeTokenResult var0, ByteString var1) {
      var0.token_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(PftpResponse$PbPFtpGenerateChallengeTokenResult var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static PftpResponse$PbPFtpGenerateChallengeTokenResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PftpResponse.m();
   }

   public static PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder newBuilder(PftpResponse$PbPFtpGenerateChallengeTokenResult var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PftpResponse$PbPFtpGenerateChallengeTokenResult parseDelimitedFrom(InputStream var0) {
      return (PftpResponse$PbPFtpGenerateChallengeTokenResult)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PftpResponse$PbPFtpGenerateChallengeTokenResult parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpGenerateChallengeTokenResult)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PftpResponse$PbPFtpGenerateChallengeTokenResult parseFrom(ByteString var0) {
      return (PftpResponse$PbPFtpGenerateChallengeTokenResult)PARSER.parseFrom(var0);
   }

   public static PftpResponse$PbPFtpGenerateChallengeTokenResult parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpGenerateChallengeTokenResult)PARSER.parseFrom(var0, var1);
   }

   public static PftpResponse$PbPFtpGenerateChallengeTokenResult parseFrom(CodedInputStream var0) {
      return (PftpResponse$PbPFtpGenerateChallengeTokenResult)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpResponse$PbPFtpGenerateChallengeTokenResult parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpGenerateChallengeTokenResult)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpResponse$PbPFtpGenerateChallengeTokenResult parseFrom(InputStream var0) {
      return (PftpResponse$PbPFtpGenerateChallengeTokenResult)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpResponse$PbPFtpGenerateChallengeTokenResult parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpGenerateChallengeTokenResult)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpResponse$PbPFtpGenerateChallengeTokenResult parseFrom(byte[] var0) {
      return (PftpResponse$PbPFtpGenerateChallengeTokenResult)PARSER.parseFrom(var0);
   }

   public static PftpResponse$PbPFtpGenerateChallengeTokenResult parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpGenerateChallengeTokenResult)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PftpResponse$PbPFtpGenerateChallengeTokenResult)) {
            var2 = super.equals(var1);
         } else {
            PftpResponse$PbPFtpGenerateChallengeTokenResult var5 = (PftpResponse$PbPFtpGenerateChallengeTokenResult)var1;
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

            if (!var4 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public PftpResponse$PbPFtpGenerateChallengeTokenResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
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

         var1 += this.unknownFields.getSerializedSize();
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

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpResponse.n().ensureFieldAccessorsInitialized(PftpResponse$PbPFtpGenerateChallengeTokenResult.class, PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder.class);
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
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder newBuilderForType(BuilderParent var1) {
      return new PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder(var1, (PftpResponse$1)null);
   }

   public PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder toBuilder() {
      PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder((PftpResponse$1)null);
      } else {
         var1 = (new PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder((PftpResponse$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeBytes(1, this.token_);
      }

      this.unknownFields.writeTo(var1);
   }
}
