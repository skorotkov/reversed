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

public final class PftpResponse$PbPFtpDiskSpaceResult extends GeneratedMessageV3 implements PftpResponse$PbPFtpDiskSpaceResultOrBuilder {
   private static final PftpResponse$PbPFtpDiskSpaceResult DEFAULT_INSTANCE = new PftpResponse$PbPFtpDiskSpaceResult();
   public static final int FRAGMENT_SIZE_FIELD_NUMBER = 1;
   public static final int FREE_FRAGMENTS_FIELD_NUMBER = 3;
   @Deprecated
   public static final Parser PARSER = new PftpResponse$PbPFtpDiskSpaceResult$1();
   public static final int TOTAL_FRAGMENTS_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int fragmentSize_;
   private long freeFragments_;
   private byte memoizedIsInitialized;
   private long totalFragments_;

   private PftpResponse$PbPFtpDiskSpaceResult() {
      this.memoizedIsInitialized = (byte)-1;
      this.fragmentSize_ = 0;
      this.totalFragments_ = 0L;
      this.freeFragments_ = 0L;
   }

   private PftpResponse$PbPFtpDiskSpaceResult(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpDiskSpaceResult(CodedInputStream var1, ExtensionRegistryLite var2, PftpResponse$1 var3) {
      this(var1, var2);
   }

   private PftpResponse$PbPFtpDiskSpaceResult(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpDiskSpaceResult(Builder var1, PftpResponse$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PftpResponse$PbPFtpDiskSpaceResult var0, int var1) {
      var0.fragmentSize_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static long a(PftpResponse$PbPFtpDiskSpaceResult var0, long var1) {
      var0.totalFragments_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(PftpResponse$PbPFtpDiskSpaceResult var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(PftpResponse$PbPFtpDiskSpaceResult var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static long b(PftpResponse$PbPFtpDiskSpaceResult var0, long var1) {
      var0.freeFragments_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static PftpResponse$PbPFtpDiskSpaceResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PftpResponse.k();
   }

   public static PftpResponse$PbPFtpDiskSpaceResult$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PftpResponse$PbPFtpDiskSpaceResult$Builder newBuilder(PftpResponse$PbPFtpDiskSpaceResult var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PftpResponse$PbPFtpDiskSpaceResult parseDelimitedFrom(InputStream var0) {
      return (PftpResponse$PbPFtpDiskSpaceResult)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PftpResponse$PbPFtpDiskSpaceResult parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpDiskSpaceResult)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PftpResponse$PbPFtpDiskSpaceResult parseFrom(ByteString var0) {
      return (PftpResponse$PbPFtpDiskSpaceResult)PARSER.parseFrom(var0);
   }

   public static PftpResponse$PbPFtpDiskSpaceResult parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpDiskSpaceResult)PARSER.parseFrom(var0, var1);
   }

   public static PftpResponse$PbPFtpDiskSpaceResult parseFrom(CodedInputStream var0) {
      return (PftpResponse$PbPFtpDiskSpaceResult)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpResponse$PbPFtpDiskSpaceResult parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpDiskSpaceResult)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpResponse$PbPFtpDiskSpaceResult parseFrom(InputStream var0) {
      return (PftpResponse$PbPFtpDiskSpaceResult)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpResponse$PbPFtpDiskSpaceResult parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpDiskSpaceResult)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpResponse$PbPFtpDiskSpaceResult parseFrom(byte[] var0) {
      return (PftpResponse$PbPFtpDiskSpaceResult)PARSER.parseFrom(var0);
   }

   public static PftpResponse$PbPFtpDiskSpaceResult parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpDiskSpaceResult)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PftpResponse$PbPFtpDiskSpaceResult)) {
            var2 = super.equals(var1);
         } else {
            PftpResponse$PbPFtpDiskSpaceResult var5 = (PftpResponse$PbPFtpDiskSpaceResult)var1;
            boolean var3;
            if (this.hasFragmentSize() == var5.hasFragmentSize()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasFragmentSize()) {
               if (var3 && this.getFragmentSize() == var5.getFragmentSize()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTotalFragments() == var5.hasTotalFragments()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasTotalFragments()) {
               if (var4 && this.getTotalFragments() == var5.getTotalFragments()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasFreeFragments() == var5.hasFreeFragments()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasFreeFragments()) {
               if (var3 && this.getFreeFragments() == var5.getFreeFragments()) {
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

   public PftpResponse$PbPFtpDiskSpaceResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public int getFragmentSize() {
      return this.fragmentSize_;
   }

   public long getFreeFragments() {
      return this.freeFragments_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeUInt32Size(1, this.fragmentSize_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeUInt64Size(2, this.totalFragments_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeUInt64Size(3, this.freeFragments_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public long getTotalFragments() {
      return this.totalFragments_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasFragmentSize() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasFreeFragments() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTotalFragments() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
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
         if (this.hasFragmentSize()) {
            var1 = (var2 * 37 + 1) * 53 + this.getFragmentSize();
         }

         var2 = var1;
         if (this.hasTotalFragments()) {
            var2 = (var1 * 37 + 2) * 53 + Internal.hashLong(this.getTotalFragments());
         }

         var1 = var2;
         if (this.hasFreeFragments()) {
            var1 = (var2 * 37 + 3) * 53 + Internal.hashLong(this.getFreeFragments());
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpResponse.l().ensureFieldAccessorsInitialized(PftpResponse$PbPFtpDiskSpaceResult.class, PftpResponse$PbPFtpDiskSpaceResult$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasFragmentSize()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasTotalFragments()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasFreeFragments()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public PftpResponse$PbPFtpDiskSpaceResult$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PftpResponse$PbPFtpDiskSpaceResult$Builder newBuilderForType(BuilderParent var1) {
      return new PftpResponse$PbPFtpDiskSpaceResult$Builder(var1, (PftpResponse$1)null);
   }

   public PftpResponse$PbPFtpDiskSpaceResult$Builder toBuilder() {
      PftpResponse$PbPFtpDiskSpaceResult$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PftpResponse$PbPFtpDiskSpaceResult$Builder((PftpResponse$1)null);
      } else {
         var1 = (new PftpResponse$PbPFtpDiskSpaceResult$Builder((PftpResponse$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.fragmentSize_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeUInt64(2, this.totalFragments_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeUInt64(3, this.freeFragments_);
      }

      this.unknownFields.writeTo(var1);
   }
}
