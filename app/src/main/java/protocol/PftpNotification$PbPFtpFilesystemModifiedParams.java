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

public final class PftpNotification$PbPFtpFilesystemModifiedParams extends GeneratedMessageV3 implements PftpNotification$PbPFtpFilesystemModifiedParamsOrBuilder {
   public static final int ACTION_FIELD_NUMBER = 1;
   private static final PftpNotification$PbPFtpFilesystemModifiedParams DEFAULT_INSTANCE = new PftpNotification$PbPFtpFilesystemModifiedParams();
   @Deprecated
   public static final Parser PARSER = new PftpNotification$PbPFtpFilesystemModifiedParams$1();
   public static final int PATH_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private int action_;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private volatile Object path_;

   private PftpNotification$PbPFtpFilesystemModifiedParams() {
      this.memoizedIsInitialized = (byte)-1;
      this.action_ = 0;
      this.path_ = "";
   }

   private PftpNotification$PbPFtpFilesystemModifiedParams(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpFilesystemModifiedParams(CodedInputStream var1, ExtensionRegistryLite var2, PftpNotification$1 var3) {
      this(var1, var2);
   }

   private PftpNotification$PbPFtpFilesystemModifiedParams(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpFilesystemModifiedParams(Builder var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PftpNotification$PbPFtpFilesystemModifiedParams var0, int var1) {
      var0.action_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object a(PftpNotification$PbPFtpFilesystemModifiedParams var0) {
      return var0.path_;
   }

   // $FF: synthetic method
   static Object a(PftpNotification$PbPFtpFilesystemModifiedParams var0, Object var1) {
      var0.path_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(PftpNotification$PbPFtpFilesystemModifiedParams var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(PftpNotification$PbPFtpFilesystemModifiedParams var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static PftpNotification$PbPFtpFilesystemModifiedParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.a();
   }

   public static PftpNotification$PbPFtpFilesystemModifiedParams$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PftpNotification$PbPFtpFilesystemModifiedParams$Builder newBuilder(PftpNotification$PbPFtpFilesystemModifiedParams var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PftpNotification$PbPFtpFilesystemModifiedParams parseDelimitedFrom(InputStream var0) {
      return (PftpNotification$PbPFtpFilesystemModifiedParams)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpFilesystemModifiedParams parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpFilesystemModifiedParams)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpFilesystemModifiedParams parseFrom(ByteString var0) {
      return (PftpNotification$PbPFtpFilesystemModifiedParams)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPFtpFilesystemModifiedParams parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpFilesystemModifiedParams)PARSER.parseFrom(var0, var1);
   }

   public static PftpNotification$PbPFtpFilesystemModifiedParams parseFrom(CodedInputStream var0) {
      return (PftpNotification$PbPFtpFilesystemModifiedParams)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpFilesystemModifiedParams parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpFilesystemModifiedParams)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpFilesystemModifiedParams parseFrom(InputStream var0) {
      return (PftpNotification$PbPFtpFilesystemModifiedParams)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpFilesystemModifiedParams parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpFilesystemModifiedParams)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpFilesystemModifiedParams parseFrom(byte[] var0) {
      return (PftpNotification$PbPFtpFilesystemModifiedParams)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPFtpFilesystemModifiedParams parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpFilesystemModifiedParams)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PftpNotification$PbPFtpFilesystemModifiedParams)) {
            var2 = super.equals(var1);
         } else {
            PftpNotification$PbPFtpFilesystemModifiedParams var5 = (PftpNotification$PbPFtpFilesystemModifiedParams)var1;
            boolean var3;
            if (this.hasAction() == var5.hasAction()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasAction()) {
               if (var3 && this.action_ == var5.action_) {
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

   public PftpNotification$Action getAction() {
      PftpNotification$Action var1 = PftpNotification$Action.valueOf(this.action_);
      PftpNotification$Action var2 = var1;
      if (var1 == null) {
         var2 = PftpNotification$Action.CREATED;
      }

      return var2;
   }

   public PftpNotification$PbPFtpFilesystemModifiedParams getDefaultInstanceForType() {
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
            var1 = 0 + CodedOutputStream.computeEnumSize(1, this.action_);
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

   public boolean hasAction() {
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
         if (this.hasAction()) {
            var1 = (var2 * 37 + 1) * 53 + this.action_;
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
      return PftpNotification.b().ensureFieldAccessorsInitialized(PftpNotification$PbPFtpFilesystemModifiedParams.class, PftpNotification$PbPFtpFilesystemModifiedParams$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasAction()) {
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

   public PftpNotification$PbPFtpFilesystemModifiedParams$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PftpNotification$PbPFtpFilesystemModifiedParams$Builder newBuilderForType(BuilderParent var1) {
      return new PftpNotification$PbPFtpFilesystemModifiedParams$Builder(var1, (PftpNotification$1)null);
   }

   public PftpNotification$PbPFtpFilesystemModifiedParams$Builder toBuilder() {
      PftpNotification$PbPFtpFilesystemModifiedParams$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PftpNotification$PbPFtpFilesystemModifiedParams$Builder((PftpNotification$1)null);
      } else {
         var1 = (new PftpNotification$PbPFtpFilesystemModifiedParams$Builder((PftpNotification$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.action_);
      }

      if ((this.bitField0_ & 2) == 2) {
         GeneratedMessageV3.writeString(var1, 2, this.path_);
      }

      this.unknownFields.writeTo(var1);
   }
}
