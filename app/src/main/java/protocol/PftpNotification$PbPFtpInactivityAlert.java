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

public final class PftpNotification$PbPFtpInactivityAlert extends GeneratedMessageV3 implements PftpNotification$PbPFtpInactivityAlertOrBuilder {
   public static final int COUNTDOWN_FIELD_NUMBER = 1;
   private static final PftpNotification$PbPFtpInactivityAlert DEFAULT_INSTANCE = new PftpNotification$PbPFtpInactivityAlert();
   @Deprecated
   public static final Parser PARSER = new PftpNotification$PbPFtpInactivityAlert$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int countdown_;
   private byte memoizedIsInitialized;

   private PftpNotification$PbPFtpInactivityAlert() {
      this.memoizedIsInitialized = (byte)-1;
      this.countdown_ = 0;
   }

   private PftpNotification$PbPFtpInactivityAlert(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpInactivityAlert(CodedInputStream var1, ExtensionRegistryLite var2, PftpNotification$1 var3) {
      this(var1, var2);
   }

   private PftpNotification$PbPFtpInactivityAlert(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpInactivityAlert(Builder var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PftpNotification$PbPFtpInactivityAlert var0, int var1) {
      var0.countdown_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(PftpNotification$PbPFtpInactivityAlert var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(PftpNotification$PbPFtpInactivityAlert var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static PftpNotification$PbPFtpInactivityAlert getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.c();
   }

   public static PftpNotification$PbPFtpInactivityAlert$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PftpNotification$PbPFtpInactivityAlert$Builder newBuilder(PftpNotification$PbPFtpInactivityAlert var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PftpNotification$PbPFtpInactivityAlert parseDelimitedFrom(InputStream var0) {
      return (PftpNotification$PbPFtpInactivityAlert)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpInactivityAlert parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpInactivityAlert)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpInactivityAlert parseFrom(ByteString var0) {
      return (PftpNotification$PbPFtpInactivityAlert)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPFtpInactivityAlert parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpInactivityAlert)PARSER.parseFrom(var0, var1);
   }

   public static PftpNotification$PbPFtpInactivityAlert parseFrom(CodedInputStream var0) {
      return (PftpNotification$PbPFtpInactivityAlert)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpInactivityAlert parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpInactivityAlert)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpInactivityAlert parseFrom(InputStream var0) {
      return (PftpNotification$PbPFtpInactivityAlert)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpInactivityAlert parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpInactivityAlert)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpInactivityAlert parseFrom(byte[] var0) {
      return (PftpNotification$PbPFtpInactivityAlert)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPFtpInactivityAlert parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpInactivityAlert)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PftpNotification$PbPFtpInactivityAlert)) {
            var2 = super.equals(var1);
         } else {
            PftpNotification$PbPFtpInactivityAlert var5 = (PftpNotification$PbPFtpInactivityAlert)var1;
            boolean var3;
            if (this.hasCountdown() == var5.hasCountdown()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasCountdown()) {
               if (var3 && this.getCountdown() == var5.getCountdown()) {
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

   public int getCountdown() {
      return this.countdown_;
   }

   public PftpNotification$PbPFtpInactivityAlert getDefaultInstanceForType() {
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
            var1 = 0 + CodedOutputStream.computeUInt32Size(1, this.countdown_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasCountdown() {
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
         if (this.hasCountdown()) {
            var1 = (var2 * 37 + 1) * 53 + this.getCountdown();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.d().ensureFieldAccessorsInitialized(PftpNotification$PbPFtpInactivityAlert.class, PftpNotification$PbPFtpInactivityAlert$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasCountdown()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public PftpNotification$PbPFtpInactivityAlert$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PftpNotification$PbPFtpInactivityAlert$Builder newBuilderForType(BuilderParent var1) {
      return new PftpNotification$PbPFtpInactivityAlert$Builder(var1, (PftpNotification$1)null);
   }

   public PftpNotification$PbPFtpInactivityAlert$Builder toBuilder() {
      PftpNotification$PbPFtpInactivityAlert$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PftpNotification$PbPFtpInactivityAlert$Builder((PftpNotification$1)null);
      } else {
         var1 = (new PftpNotification$PbPFtpInactivityAlert$Builder((PftpNotification$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.countdown_);
      }

      this.unknownFields.writeTo(var1);
   }
}
