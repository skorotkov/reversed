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

public final class PftpNotification$PbPFtpAutoSyncStatusParams extends GeneratedMessageV3 implements PftpNotification$PbPFtpAutoSyncStatusParamsOrBuilder {
   private static final PftpNotification$PbPFtpAutoSyncStatusParams DEFAULT_INSTANCE = new PftpNotification$PbPFtpAutoSyncStatusParams();
   public static final int DESCRIPTION_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new PftpNotification$PbPFtpAutoSyncStatusParams$1();
   public static final int SUCCEEDED_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private volatile Object description_;
   private byte memoizedIsInitialized;
   private boolean succeeded_;

   private PftpNotification$PbPFtpAutoSyncStatusParams() {
      this.memoizedIsInitialized = (byte)-1;
      this.succeeded_ = false;
      this.description_ = "";
   }

   private PftpNotification$PbPFtpAutoSyncStatusParams(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpAutoSyncStatusParams(CodedInputStream var1, ExtensionRegistryLite var2, PftpNotification$1 var3) {
      this(var1, var2);
   }

   private PftpNotification$PbPFtpAutoSyncStatusParams(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpAutoSyncStatusParams(Builder var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PftpNotification$PbPFtpAutoSyncStatusParams var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object a(PftpNotification$PbPFtpAutoSyncStatusParams var0) {
      return var0.description_;
   }

   // $FF: synthetic method
   static Object a(PftpNotification$PbPFtpAutoSyncStatusParams var0, Object var1) {
      var0.description_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean a(PftpNotification$PbPFtpAutoSyncStatusParams var0, boolean var1) {
      var0.succeeded_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(PftpNotification$PbPFtpAutoSyncStatusParams var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static PftpNotification$PbPFtpAutoSyncStatusParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.g();
   }

   public static PftpNotification$PbPFtpAutoSyncStatusParams$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PftpNotification$PbPFtpAutoSyncStatusParams$Builder newBuilder(PftpNotification$PbPFtpAutoSyncStatusParams var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PftpNotification$PbPFtpAutoSyncStatusParams parseDelimitedFrom(InputStream var0) {
      return (PftpNotification$PbPFtpAutoSyncStatusParams)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpAutoSyncStatusParams parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpAutoSyncStatusParams)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpAutoSyncStatusParams parseFrom(ByteString var0) {
      return (PftpNotification$PbPFtpAutoSyncStatusParams)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPFtpAutoSyncStatusParams parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpAutoSyncStatusParams)PARSER.parseFrom(var0, var1);
   }

   public static PftpNotification$PbPFtpAutoSyncStatusParams parseFrom(CodedInputStream var0) {
      return (PftpNotification$PbPFtpAutoSyncStatusParams)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpAutoSyncStatusParams parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpAutoSyncStatusParams)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpAutoSyncStatusParams parseFrom(InputStream var0) {
      return (PftpNotification$PbPFtpAutoSyncStatusParams)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpAutoSyncStatusParams parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpAutoSyncStatusParams)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpAutoSyncStatusParams parseFrom(byte[] var0) {
      return (PftpNotification$PbPFtpAutoSyncStatusParams)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPFtpAutoSyncStatusParams parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpAutoSyncStatusParams)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PftpNotification$PbPFtpAutoSyncStatusParams)) {
            var2 = super.equals(var1);
         } else {
            PftpNotification$PbPFtpAutoSyncStatusParams var5 = (PftpNotification$PbPFtpAutoSyncStatusParams)var1;
            boolean var3;
            if (this.hasSucceeded() == var5.hasSucceeded()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasSucceeded()) {
               if (var3 && this.getSucceeded() == var5.getSucceeded()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasDescription() == var5.hasDescription()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasDescription()) {
               if (var4 && this.getDescription().equals(var5.getDescription())) {
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

   public PftpNotification$PbPFtpAutoSyncStatusParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public String getDescription() {
      Object var1 = this.description_;
      String var3;
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.description_ = var3;
         }
      }

      return var3;
   }

   public ByteString getDescriptionBytes() {
      Object var1 = this.description_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.description_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeBoolSize(1, this.succeeded_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + GeneratedMessageV3.computeStringSize(2, this.description_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public boolean getSucceeded() {
      return this.succeeded_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasDescription() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSucceeded() {
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
         if (this.hasSucceeded()) {
            var1 = (var2 * 37 + 1) * 53 + Internal.hashBoolean(this.getSucceeded());
         }

         var2 = var1;
         if (this.hasDescription()) {
            var2 = (var1 * 37 + 2) * 53 + this.getDescription().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.h().ensureFieldAccessorsInitialized(PftpNotification$PbPFtpAutoSyncStatusParams.class, PftpNotification$PbPFtpAutoSyncStatusParams$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasSucceeded()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public PftpNotification$PbPFtpAutoSyncStatusParams$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PftpNotification$PbPFtpAutoSyncStatusParams$Builder newBuilderForType(BuilderParent var1) {
      return new PftpNotification$PbPFtpAutoSyncStatusParams$Builder(var1, (PftpNotification$1)null);
   }

   public PftpNotification$PbPFtpAutoSyncStatusParams$Builder toBuilder() {
      PftpNotification$PbPFtpAutoSyncStatusParams$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PftpNotification$PbPFtpAutoSyncStatusParams$Builder((PftpNotification$1)null);
      } else {
         var1 = (new PftpNotification$PbPFtpAutoSyncStatusParams$Builder((PftpNotification$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeBool(1, this.succeeded_);
      }

      if ((this.bitField0_ & 2) == 2) {
         GeneratedMessageV3.writeString(var1, 2, this.description_);
      }

      this.unknownFields.writeTo(var1);
   }
}
