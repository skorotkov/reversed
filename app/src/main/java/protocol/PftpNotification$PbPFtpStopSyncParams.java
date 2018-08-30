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

public final class PftpNotification$PbPFtpStopSyncParams extends GeneratedMessageV3 implements PftpNotification$PbPFtpStopSyncParamsOrBuilder {
   public static final int COMPLETED_FIELD_NUMBER = 1;
   private static final PftpNotification$PbPFtpStopSyncParams DEFAULT_INSTANCE = new PftpNotification$PbPFtpStopSyncParams();
   public static final int DESCRIPTION_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new PftpNotification$PbPFtpStopSyncParams$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private boolean completed_;
   private volatile Object description_;
   private byte memoizedIsInitialized;

   private PftpNotification$PbPFtpStopSyncParams() {
      this.memoizedIsInitialized = (byte)-1;
      this.completed_ = false;
      this.description_ = "";
   }

   private PftpNotification$PbPFtpStopSyncParams(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpStopSyncParams(CodedInputStream var1, ExtensionRegistryLite var2, PftpNotification$1 var3) {
      this(var1, var2);
   }

   private PftpNotification$PbPFtpStopSyncParams(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpStopSyncParams(Builder var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PftpNotification$PbPFtpStopSyncParams var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object a(PftpNotification$PbPFtpStopSyncParams var0) {
      return var0.description_;
   }

   // $FF: synthetic method
   static Object a(PftpNotification$PbPFtpStopSyncParams var0, Object var1) {
      var0.description_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean a(PftpNotification$PbPFtpStopSyncParams var0, boolean var1) {
      var0.completed_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(PftpNotification$PbPFtpStopSyncParams var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static PftpNotification$PbPFtpStopSyncParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.w();
   }

   public static PftpNotification$PbPFtpStopSyncParams$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PftpNotification$PbPFtpStopSyncParams$Builder newBuilder(PftpNotification$PbPFtpStopSyncParams var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PftpNotification$PbPFtpStopSyncParams parseDelimitedFrom(InputStream var0) {
      return (PftpNotification$PbPFtpStopSyncParams)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpStopSyncParams parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpStopSyncParams)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpStopSyncParams parseFrom(ByteString var0) {
      return (PftpNotification$PbPFtpStopSyncParams)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPFtpStopSyncParams parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpStopSyncParams)PARSER.parseFrom(var0, var1);
   }

   public static PftpNotification$PbPFtpStopSyncParams parseFrom(CodedInputStream var0) {
      return (PftpNotification$PbPFtpStopSyncParams)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpStopSyncParams parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpStopSyncParams)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpStopSyncParams parseFrom(InputStream var0) {
      return (PftpNotification$PbPFtpStopSyncParams)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpStopSyncParams parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpStopSyncParams)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpStopSyncParams parseFrom(byte[] var0) {
      return (PftpNotification$PbPFtpStopSyncParams)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPFtpStopSyncParams parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpStopSyncParams)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PftpNotification$PbPFtpStopSyncParams)) {
            var2 = super.equals(var1);
         } else {
            PftpNotification$PbPFtpStopSyncParams var5 = (PftpNotification$PbPFtpStopSyncParams)var1;
            boolean var3;
            if (this.hasCompleted() == var5.hasCompleted()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasCompleted()) {
               if (var3 && this.getCompleted() == var5.getCompleted()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasDescription() == var5.hasDescription()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasDescription()) {
               if (var3 && this.getDescription().equals(var5.getDescription())) {
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

   public boolean getCompleted() {
      return this.completed_;
   }

   public PftpNotification$PbPFtpStopSyncParams getDefaultInstanceForType() {
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
            var1 = 0 + CodedOutputStream.computeBoolSize(1, this.completed_);
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

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasCompleted() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
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

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.hasCompleted()) {
            var1 = (var2 * 37 + 1) * 53 + Internal.hashBoolean(this.getCompleted());
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
      return PftpNotification.x().ensureFieldAccessorsInitialized(PftpNotification$PbPFtpStopSyncParams.class, PftpNotification$PbPFtpStopSyncParams$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasCompleted()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public PftpNotification$PbPFtpStopSyncParams$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PftpNotification$PbPFtpStopSyncParams$Builder newBuilderForType(BuilderParent var1) {
      return new PftpNotification$PbPFtpStopSyncParams$Builder(var1, (PftpNotification$1)null);
   }

   public PftpNotification$PbPFtpStopSyncParams$Builder toBuilder() {
      PftpNotification$PbPFtpStopSyncParams$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PftpNotification$PbPFtpStopSyncParams$Builder((PftpNotification$1)null);
      } else {
         var1 = (new PftpNotification$PbPFtpStopSyncParams$Builder((PftpNotification$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeBool(1, this.completed_);
      }

      if ((this.bitField0_ & 2) == 2) {
         GeneratedMessageV3.writeString(var1, 2, this.description_);
      }

      this.unknownFields.writeTo(var1);
   }
}
