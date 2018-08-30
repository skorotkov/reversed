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

public final class PftpNotification$PbPFtpTouchPosition extends GeneratedMessageV3 implements PftpNotification$PbPFtpTouchPositionOrBuilder {
   private static final PftpNotification$PbPFtpTouchPosition DEFAULT_INSTANCE = new PftpNotification$PbPFtpTouchPosition();
   public static final int MAX_POS_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new PftpNotification$PbPFtpTouchPosition$1();
   public static final int POS_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int maxPos_;
   private byte memoizedIsInitialized;
   private int pos_;

   private PftpNotification$PbPFtpTouchPosition() {
      this.memoizedIsInitialized = (byte)-1;
      this.pos_ = 0;
      this.maxPos_ = 0;
   }

   private PftpNotification$PbPFtpTouchPosition(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpTouchPosition(CodedInputStream var1, ExtensionRegistryLite var2, PftpNotification$1 var3) {
      this(var1, var2);
   }

   private PftpNotification$PbPFtpTouchPosition(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpTouchPosition(Builder var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PftpNotification$PbPFtpTouchPosition var0, int var1) {
      var0.pos_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(PftpNotification$PbPFtpTouchPosition var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(PftpNotification$PbPFtpTouchPosition var0, int var1) {
      var0.maxPos_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(PftpNotification$PbPFtpTouchPosition var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static PftpNotification$PbPFtpTouchPosition getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.s();
   }

   public static PftpNotification$PbPFtpTouchPosition$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PftpNotification$PbPFtpTouchPosition$Builder newBuilder(PftpNotification$PbPFtpTouchPosition var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PftpNotification$PbPFtpTouchPosition parseDelimitedFrom(InputStream var0) {
      return (PftpNotification$PbPFtpTouchPosition)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpTouchPosition parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpTouchPosition)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpTouchPosition parseFrom(ByteString var0) {
      return (PftpNotification$PbPFtpTouchPosition)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPFtpTouchPosition parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpTouchPosition)PARSER.parseFrom(var0, var1);
   }

   public static PftpNotification$PbPFtpTouchPosition parseFrom(CodedInputStream var0) {
      return (PftpNotification$PbPFtpTouchPosition)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpTouchPosition parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpTouchPosition)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpTouchPosition parseFrom(InputStream var0) {
      return (PftpNotification$PbPFtpTouchPosition)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpTouchPosition parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpTouchPosition)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpTouchPosition parseFrom(byte[] var0) {
      return (PftpNotification$PbPFtpTouchPosition)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPFtpTouchPosition parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpTouchPosition)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PftpNotification$PbPFtpTouchPosition)) {
            var2 = super.equals(var1);
         } else {
            PftpNotification$PbPFtpTouchPosition var5 = (PftpNotification$PbPFtpTouchPosition)var1;
            boolean var3;
            if (this.hasPos() == var5.hasPos()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasPos()) {
               if (var3 && this.getPos() == var5.getPos()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasMaxPos() == var5.hasMaxPos()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasMaxPos()) {
               if (var3 && this.getMaxPos() == var5.getMaxPos()) {
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

   public PftpNotification$PbPFtpTouchPosition getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public int getMaxPos() {
      return this.maxPos_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getPos() {
      return this.pos_;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeUInt32Size(1, this.pos_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(2, this.maxPos_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasMaxPos() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPos() {
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
         if (this.hasPos()) {
            var1 = (var2 * 37 + 1) * 53 + this.getPos();
         }

         var2 = var1;
         if (this.hasMaxPos()) {
            var2 = (var1 * 37 + 2) * 53 + this.getMaxPos();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.t().ensureFieldAccessorsInitialized(PftpNotification$PbPFtpTouchPosition.class, PftpNotification$PbPFtpTouchPosition$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasPos()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public PftpNotification$PbPFtpTouchPosition$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PftpNotification$PbPFtpTouchPosition$Builder newBuilderForType(BuilderParent var1) {
      return new PftpNotification$PbPFtpTouchPosition$Builder(var1, (PftpNotification$1)null);
   }

   public PftpNotification$PbPFtpTouchPosition$Builder toBuilder() {
      PftpNotification$PbPFtpTouchPosition$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PftpNotification$PbPFtpTouchPosition$Builder((PftpNotification$1)null);
      } else {
         var1 = (new PftpNotification$PbPFtpTouchPosition$Builder((PftpNotification$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.pos_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeUInt32(2, this.maxPos_);
      }

      this.unknownFields.writeTo(var1);
   }
}
