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

public final class PftpNotification$PbPFtpStartAutosyncParams extends GeneratedMessageV3 implements PftpNotification$PbPFtpStartAutosyncParamsOrBuilder {
   private static final PftpNotification$PbPFtpStartAutosyncParams DEFAULT_INSTANCE = new PftpNotification$PbPFtpStartAutosyncParams();
   @Deprecated
   public static final Parser PARSER = new PftpNotification$PbPFtpStartAutosyncParams$1();
   public static final int TIMEOUT_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private int timeout_;

   private PftpNotification$PbPFtpStartAutosyncParams() {
      this.memoizedIsInitialized = (byte)-1;
      this.timeout_ = 0;
   }

   private PftpNotification$PbPFtpStartAutosyncParams(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpStartAutosyncParams(CodedInputStream var1, ExtensionRegistryLite var2, PftpNotification$1 var3) {
      this(var1, var2);
   }

   private PftpNotification$PbPFtpStartAutosyncParams(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpStartAutosyncParams(Builder var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PftpNotification$PbPFtpStartAutosyncParams var0, int var1) {
      var0.timeout_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(PftpNotification$PbPFtpStartAutosyncParams var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(PftpNotification$PbPFtpStartAutosyncParams var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static PftpNotification$PbPFtpStartAutosyncParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.A();
   }

   public static PftpNotification$PbPFtpStartAutosyncParams$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PftpNotification$PbPFtpStartAutosyncParams$Builder newBuilder(PftpNotification$PbPFtpStartAutosyncParams var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PftpNotification$PbPFtpStartAutosyncParams parseDelimitedFrom(InputStream var0) {
      return (PftpNotification$PbPFtpStartAutosyncParams)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpStartAutosyncParams parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpStartAutosyncParams)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpStartAutosyncParams parseFrom(ByteString var0) {
      return (PftpNotification$PbPFtpStartAutosyncParams)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPFtpStartAutosyncParams parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpStartAutosyncParams)PARSER.parseFrom(var0, var1);
   }

   public static PftpNotification$PbPFtpStartAutosyncParams parseFrom(CodedInputStream var0) {
      return (PftpNotification$PbPFtpStartAutosyncParams)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpStartAutosyncParams parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpStartAutosyncParams)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpStartAutosyncParams parseFrom(InputStream var0) {
      return (PftpNotification$PbPFtpStartAutosyncParams)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpStartAutosyncParams parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpStartAutosyncParams)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpStartAutosyncParams parseFrom(byte[] var0) {
      return (PftpNotification$PbPFtpStartAutosyncParams)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPFtpStartAutosyncParams parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpStartAutosyncParams)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PftpNotification$PbPFtpStartAutosyncParams)) {
            var2 = super.equals(var1);
         } else {
            PftpNotification$PbPFtpStartAutosyncParams var5 = (PftpNotification$PbPFtpStartAutosyncParams)var1;
            boolean var3;
            if (this.hasTimeout() == var5.hasTimeout()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasTimeout()) {
               if (var3 && this.getTimeout() == var5.getTimeout()) {
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

   public PftpNotification$PbPFtpStartAutosyncParams getDefaultInstanceForType() {
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
            var1 = 0 + CodedOutputStream.computeUInt32Size(1, this.timeout_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public int getTimeout() {
      return this.timeout_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasTimeout() {
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
         if (this.hasTimeout()) {
            var1 = (var2 * 37 + 1) * 53 + this.getTimeout();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.B().ensureFieldAccessorsInitialized(PftpNotification$PbPFtpStartAutosyncParams.class, PftpNotification$PbPFtpStartAutosyncParams$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasTimeout()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public PftpNotification$PbPFtpStartAutosyncParams$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PftpNotification$PbPFtpStartAutosyncParams$Builder newBuilderForType(BuilderParent var1) {
      return new PftpNotification$PbPFtpStartAutosyncParams$Builder(var1, (PftpNotification$1)null);
   }

   public PftpNotification$PbPFtpStartAutosyncParams$Builder toBuilder() {
      PftpNotification$PbPFtpStartAutosyncParams$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PftpNotification$PbPFtpStartAutosyncParams$Builder((PftpNotification$1)null);
      } else {
         var1 = (new PftpNotification$PbPFtpStartAutosyncParams$Builder((PftpNotification$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.timeout_);
      }

      this.unknownFields.writeTo(var1);
   }
}
