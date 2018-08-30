package protocol;

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

public final class PftpRequest$PbPFtpCleanupDiskSpaceParams extends GeneratedMessageV3 implements PftpRequest$PbPFtpCleanupDiskSpaceParamsOrBuilder {
   private static final PftpRequest$PbPFtpCleanupDiskSpaceParams DEFAULT_INSTANCE = new PftpRequest$PbPFtpCleanupDiskSpaceParams();
   @Deprecated
   public static final Parser PARSER = new PftpRequest$PbPFtpCleanupDiskSpaceParams$1();
   public static final int REQUIRED_BYTES_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private long requiredBytes_;

   private PftpRequest$PbPFtpCleanupDiskSpaceParams() {
      this.memoizedIsInitialized = (byte)-1;
      this.requiredBytes_ = 0L;
   }

   private PftpRequest$PbPFtpCleanupDiskSpaceParams(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PftpRequest$PbPFtpCleanupDiskSpaceParams(CodedInputStream var1, ExtensionRegistryLite var2, PftpRequest$1 var3) {
      this(var1, var2);
   }

   private PftpRequest$PbPFtpCleanupDiskSpaceParams(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PftpRequest$PbPFtpCleanupDiskSpaceParams(Builder var1, PftpRequest$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PftpRequest$PbPFtpCleanupDiskSpaceParams var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static long a(PftpRequest$PbPFtpCleanupDiskSpaceParams var0, long var1) {
      var0.requiredBytes_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(PftpRequest$PbPFtpCleanupDiskSpaceParams var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static PftpRequest$PbPFtpCleanupDiskSpaceParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PftpRequest.k();
   }

   public static PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder newBuilder(PftpRequest$PbPFtpCleanupDiskSpaceParams var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PftpRequest$PbPFtpCleanupDiskSpaceParams parseDelimitedFrom(InputStream var0) {
      return (PftpRequest$PbPFtpCleanupDiskSpaceParams)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PftpRequest$PbPFtpCleanupDiskSpaceParams parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpRequest$PbPFtpCleanupDiskSpaceParams)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PftpRequest$PbPFtpCleanupDiskSpaceParams parseFrom(ByteString var0) {
      return (PftpRequest$PbPFtpCleanupDiskSpaceParams)PARSER.parseFrom(var0);
   }

   public static PftpRequest$PbPFtpCleanupDiskSpaceParams parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PftpRequest$PbPFtpCleanupDiskSpaceParams)PARSER.parseFrom(var0, var1);
   }

   public static PftpRequest$PbPFtpCleanupDiskSpaceParams parseFrom(CodedInputStream var0) {
      return (PftpRequest$PbPFtpCleanupDiskSpaceParams)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpRequest$PbPFtpCleanupDiskSpaceParams parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PftpRequest$PbPFtpCleanupDiskSpaceParams)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpRequest$PbPFtpCleanupDiskSpaceParams parseFrom(InputStream var0) {
      return (PftpRequest$PbPFtpCleanupDiskSpaceParams)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpRequest$PbPFtpCleanupDiskSpaceParams parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpRequest$PbPFtpCleanupDiskSpaceParams)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpRequest$PbPFtpCleanupDiskSpaceParams parseFrom(byte[] var0) {
      return (PftpRequest$PbPFtpCleanupDiskSpaceParams)PARSER.parseFrom(var0);
   }

   public static PftpRequest$PbPFtpCleanupDiskSpaceParams parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PftpRequest$PbPFtpCleanupDiskSpaceParams)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PftpRequest$PbPFtpCleanupDiskSpaceParams)) {
            var2 = super.equals(var1);
         } else {
            PftpRequest$PbPFtpCleanupDiskSpaceParams var5 = (PftpRequest$PbPFtpCleanupDiskSpaceParams)var1;
            boolean var3;
            if (this.hasRequiredBytes() == var5.hasRequiredBytes()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasRequiredBytes()) {
               if (var3 && this.getRequiredBytes() == var5.getRequiredBytes()) {
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

   public PftpRequest$PbPFtpCleanupDiskSpaceParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public long getRequiredBytes() {
      return this.requiredBytes_;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeUInt64Size(1, this.requiredBytes_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasRequiredBytes() {
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
         if (this.hasRequiredBytes()) {
            var1 = (var2 * 37 + 1) * 53 + Internal.hashLong(this.getRequiredBytes());
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpRequest.l().ensureFieldAccessorsInitialized(PftpRequest$PbPFtpCleanupDiskSpaceParams.class, PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasRequiredBytes()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder newBuilderForType(BuilderParent var1) {
      return new PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder(var1, (PftpRequest$1)null);
   }

   public PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder toBuilder() {
      PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder((PftpRequest$1)null);
      } else {
         var1 = (new PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder((PftpRequest$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt64(1, this.requiredBytes_);
      }

      this.unknownFields.writeTo(var1);
   }
}
