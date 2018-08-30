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

public final class PftpRequest$PbPFtpOperation extends GeneratedMessageV3 implements PftpRequest$PbPFtpOperationOrBuilder {
   public static final int COMMAND_FIELD_NUMBER = 1;
   private static final PftpRequest$PbPFtpOperation DEFAULT_INSTANCE = new PftpRequest$PbPFtpOperation();
   @Deprecated
   public static final Parser PARSER = new PftpRequest$PbPFtpOperation$1();
   public static final int PATH_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int command_;
   private byte memoizedIsInitialized;
   private volatile Object path_;

   private PftpRequest$PbPFtpOperation() {
      this.memoizedIsInitialized = (byte)-1;
      this.command_ = 0;
      this.path_ = "";
   }

   private PftpRequest$PbPFtpOperation(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PftpRequest$PbPFtpOperation(CodedInputStream var1, ExtensionRegistryLite var2, PftpRequest$1 var3) {
      this(var1, var2);
   }

   private PftpRequest$PbPFtpOperation(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PftpRequest$PbPFtpOperation(Builder var1, PftpRequest$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PftpRequest$PbPFtpOperation var0, int var1) {
      var0.command_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object a(PftpRequest$PbPFtpOperation var0) {
      return var0.path_;
   }

   // $FF: synthetic method
   static Object a(PftpRequest$PbPFtpOperation var0, Object var1) {
      var0.path_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(PftpRequest$PbPFtpOperation var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(PftpRequest$PbPFtpOperation var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static PftpRequest$PbPFtpOperation getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PftpRequest.a();
   }

   public static PftpRequest$PbPFtpOperation$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PftpRequest$PbPFtpOperation$Builder newBuilder(PftpRequest$PbPFtpOperation var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PftpRequest$PbPFtpOperation parseDelimitedFrom(InputStream var0) {
      return (PftpRequest$PbPFtpOperation)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PftpRequest$PbPFtpOperation parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpRequest$PbPFtpOperation)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PftpRequest$PbPFtpOperation parseFrom(ByteString var0) {
      return (PftpRequest$PbPFtpOperation)PARSER.parseFrom(var0);
   }

   public static PftpRequest$PbPFtpOperation parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PftpRequest$PbPFtpOperation)PARSER.parseFrom(var0, var1);
   }

   public static PftpRequest$PbPFtpOperation parseFrom(CodedInputStream var0) {
      return (PftpRequest$PbPFtpOperation)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpRequest$PbPFtpOperation parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PftpRequest$PbPFtpOperation)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpRequest$PbPFtpOperation parseFrom(InputStream var0) {
      return (PftpRequest$PbPFtpOperation)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpRequest$PbPFtpOperation parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpRequest$PbPFtpOperation)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpRequest$PbPFtpOperation parseFrom(byte[] var0) {
      return (PftpRequest$PbPFtpOperation)PARSER.parseFrom(var0);
   }

   public static PftpRequest$PbPFtpOperation parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PftpRequest$PbPFtpOperation)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PftpRequest$PbPFtpOperation)) {
            var2 = super.equals(var1);
         } else {
            PftpRequest$PbPFtpOperation var5 = (PftpRequest$PbPFtpOperation)var1;
            boolean var3;
            if (this.hasCommand() == var5.hasCommand()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasCommand()) {
               if (var3 && this.command_ == var5.command_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasPath() == var5.hasPath()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasPath()) {
               if (var3 && this.getPath().equals(var5.getPath())) {
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

   public PftpRequest$PbPFtpOperation$Command getCommand() {
      PftpRequest$PbPFtpOperation$Command var1 = PftpRequest$PbPFtpOperation$Command.valueOf(this.command_);
      PftpRequest$PbPFtpOperation$Command var2 = var1;
      if (var1 == null) {
         var2 = PftpRequest$PbPFtpOperation$Command.GET;
      }

      return var2;
   }

   public PftpRequest$PbPFtpOperation getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public String getPath() {
      Object var1 = this.path_;
      String var3;
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.path_ = var3;
         }
      }

      return var3;
   }

   public ByteString getPathBytes() {
      Object var1 = this.path_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.path_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeEnumSize(1, this.command_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + GeneratedMessageV3.computeStringSize(2, this.path_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasCommand() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPath() {
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
         if (this.hasCommand()) {
            var1 = (var2 * 37 + 1) * 53 + this.command_;
         }

         var2 = var1;
         if (this.hasPath()) {
            var2 = (var1 * 37 + 2) * 53 + this.getPath().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpRequest.b().ensureFieldAccessorsInitialized(PftpRequest$PbPFtpOperation.class, PftpRequest$PbPFtpOperation$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasCommand()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasPath()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public PftpRequest$PbPFtpOperation$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PftpRequest$PbPFtpOperation$Builder newBuilderForType(BuilderParent var1) {
      return new PftpRequest$PbPFtpOperation$Builder(var1, (PftpRequest$1)null);
   }

   public PftpRequest$PbPFtpOperation$Builder toBuilder() {
      PftpRequest$PbPFtpOperation$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PftpRequest$PbPFtpOperation$Builder((PftpRequest$1)null);
      } else {
         var1 = (new PftpRequest$PbPFtpOperation$Builder((PftpRequest$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.command_);
      }

      if ((this.bitField0_ & 2) == 2) {
         GeneratedMessageV3.writeString(var1, 2, this.path_);
      }

      this.unknownFields.writeTo(var1);
   }
}
