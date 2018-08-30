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

public final class PftpRequest$PbPFtpSetAdbModeParams extends GeneratedMessageV3 implements PftpRequest$PbPFtpSetAdbModeParamsOrBuilder {
   private static final PftpRequest$PbPFtpSetAdbModeParams DEFAULT_INSTANCE = new PftpRequest$PbPFtpSetAdbModeParams();
   public static final int ENABLE_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new PftpRequest$PbPFtpSetAdbModeParams$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private boolean enable_;
   private byte memoizedIsInitialized;

   private PftpRequest$PbPFtpSetAdbModeParams() {
      this.memoizedIsInitialized = (byte)-1;
      this.enable_ = false;
   }

   private PftpRequest$PbPFtpSetAdbModeParams(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PftpRequest$PbPFtpSetAdbModeParams(CodedInputStream var1, ExtensionRegistryLite var2, PftpRequest$1 var3) {
      this(var1, var2);
   }

   private PftpRequest$PbPFtpSetAdbModeParams(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PftpRequest$PbPFtpSetAdbModeParams(Builder var1, PftpRequest$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PftpRequest$PbPFtpSetAdbModeParams var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(PftpRequest$PbPFtpSetAdbModeParams var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean a(PftpRequest$PbPFtpSetAdbModeParams var0, boolean var1) {
      var0.enable_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static PftpRequest$PbPFtpSetAdbModeParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PftpRequest.i();
   }

   public static PftpRequest$PbPFtpSetAdbModeParams$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PftpRequest$PbPFtpSetAdbModeParams$Builder newBuilder(PftpRequest$PbPFtpSetAdbModeParams var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PftpRequest$PbPFtpSetAdbModeParams parseDelimitedFrom(InputStream var0) {
      return (PftpRequest$PbPFtpSetAdbModeParams)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PftpRequest$PbPFtpSetAdbModeParams parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpRequest$PbPFtpSetAdbModeParams)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PftpRequest$PbPFtpSetAdbModeParams parseFrom(ByteString var0) {
      return (PftpRequest$PbPFtpSetAdbModeParams)PARSER.parseFrom(var0);
   }

   public static PftpRequest$PbPFtpSetAdbModeParams parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PftpRequest$PbPFtpSetAdbModeParams)PARSER.parseFrom(var0, var1);
   }

   public static PftpRequest$PbPFtpSetAdbModeParams parseFrom(CodedInputStream var0) {
      return (PftpRequest$PbPFtpSetAdbModeParams)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpRequest$PbPFtpSetAdbModeParams parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PftpRequest$PbPFtpSetAdbModeParams)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpRequest$PbPFtpSetAdbModeParams parseFrom(InputStream var0) {
      return (PftpRequest$PbPFtpSetAdbModeParams)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpRequest$PbPFtpSetAdbModeParams parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpRequest$PbPFtpSetAdbModeParams)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpRequest$PbPFtpSetAdbModeParams parseFrom(byte[] var0) {
      return (PftpRequest$PbPFtpSetAdbModeParams)PARSER.parseFrom(var0);
   }

   public static PftpRequest$PbPFtpSetAdbModeParams parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PftpRequest$PbPFtpSetAdbModeParams)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PftpRequest$PbPFtpSetAdbModeParams)) {
            var2 = super.equals(var1);
         } else {
            PftpRequest$PbPFtpSetAdbModeParams var5 = (PftpRequest$PbPFtpSetAdbModeParams)var1;
            boolean var3;
            if (this.hasEnable() == var5.hasEnable()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasEnable()) {
               if (var3 && this.getEnable() == var5.getEnable()) {
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

   public PftpRequest$PbPFtpSetAdbModeParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public boolean getEnable() {
      return this.enable_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeBoolSize(1, this.enable_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasEnable() {
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
         if (this.hasEnable()) {
            var1 = (var2 * 37 + 1) * 53 + Internal.hashBoolean(this.getEnable());
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpRequest.j().ensureFieldAccessorsInitialized(PftpRequest$PbPFtpSetAdbModeParams.class, PftpRequest$PbPFtpSetAdbModeParams$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasEnable()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public PftpRequest$PbPFtpSetAdbModeParams$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PftpRequest$PbPFtpSetAdbModeParams$Builder newBuilderForType(BuilderParent var1) {
      return new PftpRequest$PbPFtpSetAdbModeParams$Builder(var1, (PftpRequest$1)null);
   }

   public PftpRequest$PbPFtpSetAdbModeParams$Builder toBuilder() {
      PftpRequest$PbPFtpSetAdbModeParams$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PftpRequest$PbPFtpSetAdbModeParams$Builder((PftpRequest$1)null);
      } else {
         var1 = (new PftpRequest$PbPFtpSetAdbModeParams$Builder((PftpRequest$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeBool(1, this.enable_);
      }

      this.unknownFields.writeTo(var1);
   }
}
