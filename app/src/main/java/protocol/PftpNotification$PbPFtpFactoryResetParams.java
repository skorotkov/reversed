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

public final class PftpNotification$PbPFtpFactoryResetParams extends GeneratedMessageV3 implements PftpNotification$PbPFtpFactoryResetParamsOrBuilder {
   private static final PftpNotification$PbPFtpFactoryResetParams DEFAULT_INSTANCE = new PftpNotification$PbPFtpFactoryResetParams();
   public static final int DO_FACTORY_DEFAULTS_FIELD_NUMBER = 2;
   public static final int OTA_FWUPDATE_FIELD_NUMBER = 3;
   @Deprecated
   public static final Parser PARSER = new PftpNotification$PbPFtpFactoryResetParams$1();
   public static final int SLEEP_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private boolean doFactoryDefaults_;
   private byte memoizedIsInitialized;
   private boolean otaFwupdate_;
   private boolean sleep_;

   private PftpNotification$PbPFtpFactoryResetParams() {
      this.memoizedIsInitialized = (byte)-1;
      this.sleep_ = false;
      this.doFactoryDefaults_ = true;
      this.otaFwupdate_ = false;
   }

   private PftpNotification$PbPFtpFactoryResetParams(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpFactoryResetParams(CodedInputStream var1, ExtensionRegistryLite var2, PftpNotification$1 var3) {
      this(var1, var2);
   }

   private PftpNotification$PbPFtpFactoryResetParams(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpFactoryResetParams(Builder var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PftpNotification$PbPFtpFactoryResetParams var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(PftpNotification$PbPFtpFactoryResetParams var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean a(PftpNotification$PbPFtpFactoryResetParams var0, boolean var1) {
      var0.sleep_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static boolean b(PftpNotification$PbPFtpFactoryResetParams var0, boolean var1) {
      var0.doFactoryDefaults_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean c(PftpNotification$PbPFtpFactoryResetParams var0, boolean var1) {
      var0.otaFwupdate_ = var1;
      return var1;
   }

   public static PftpNotification$PbPFtpFactoryResetParams getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.y();
   }

   public static PftpNotification$PbPFtpFactoryResetParams$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PftpNotification$PbPFtpFactoryResetParams$Builder newBuilder(PftpNotification$PbPFtpFactoryResetParams var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PftpNotification$PbPFtpFactoryResetParams parseDelimitedFrom(InputStream var0) {
      return (PftpNotification$PbPFtpFactoryResetParams)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpFactoryResetParams parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpFactoryResetParams)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpFactoryResetParams parseFrom(ByteString var0) {
      return (PftpNotification$PbPFtpFactoryResetParams)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPFtpFactoryResetParams parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpFactoryResetParams)PARSER.parseFrom(var0, var1);
   }

   public static PftpNotification$PbPFtpFactoryResetParams parseFrom(CodedInputStream var0) {
      return (PftpNotification$PbPFtpFactoryResetParams)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpFactoryResetParams parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpFactoryResetParams)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpFactoryResetParams parseFrom(InputStream var0) {
      return (PftpNotification$PbPFtpFactoryResetParams)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpFactoryResetParams parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpFactoryResetParams)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpFactoryResetParams parseFrom(byte[] var0) {
      return (PftpNotification$PbPFtpFactoryResetParams)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPFtpFactoryResetParams parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpFactoryResetParams)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PftpNotification$PbPFtpFactoryResetParams)) {
            var2 = super.equals(var1);
         } else {
            PftpNotification$PbPFtpFactoryResetParams var5 = (PftpNotification$PbPFtpFactoryResetParams)var1;
            boolean var3;
            if (this.hasSleep() == var5.hasSleep()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasSleep()) {
               if (var3 && this.getSleep() == var5.getSleep()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasDoFactoryDefaults() == var5.hasDoFactoryDefaults()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasDoFactoryDefaults()) {
               if (var4 && this.getDoFactoryDefaults() == var5.getDoFactoryDefaults()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasOtaFwupdate() == var5.hasOtaFwupdate()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasOtaFwupdate()) {
               if (var4 && this.getOtaFwupdate() == var5.getOtaFwupdate()) {
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

   public PftpNotification$PbPFtpFactoryResetParams getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public boolean getDoFactoryDefaults() {
      return this.doFactoryDefaults_;
   }

   public boolean getOtaFwupdate() {
      return this.otaFwupdate_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeBoolSize(1, this.sleep_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeBoolSize(2, this.doFactoryDefaults_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeBoolSize(3, this.otaFwupdate_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public boolean getSleep() {
      return this.sleep_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasDoFactoryDefaults() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasOtaFwupdate() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSleep() {
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
         var1 = this.getDescriptorForType().hashCode() + 779;
         int var2 = var1;
         if (this.hasSleep()) {
            var2 = (var1 * 37 + 1) * 53 + Internal.hashBoolean(this.getSleep());
         }

         var1 = var2;
         if (this.hasDoFactoryDefaults()) {
            var1 = (var2 * 37 + 2) * 53 + Internal.hashBoolean(this.getDoFactoryDefaults());
         }

         var2 = var1;
         if (this.hasOtaFwupdate()) {
            var2 = (var1 * 37 + 3) * 53 + Internal.hashBoolean(this.getOtaFwupdate());
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.z().ensureFieldAccessorsInitialized(PftpNotification$PbPFtpFactoryResetParams.class, PftpNotification$PbPFtpFactoryResetParams$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasSleep()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public PftpNotification$PbPFtpFactoryResetParams$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PftpNotification$PbPFtpFactoryResetParams$Builder newBuilderForType(BuilderParent var1) {
      return new PftpNotification$PbPFtpFactoryResetParams$Builder(var1, (PftpNotification$1)null);
   }

   public PftpNotification$PbPFtpFactoryResetParams$Builder toBuilder() {
      PftpNotification$PbPFtpFactoryResetParams$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PftpNotification$PbPFtpFactoryResetParams$Builder((PftpNotification$1)null);
      } else {
         var1 = (new PftpNotification$PbPFtpFactoryResetParams$Builder((PftpNotification$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeBool(1, this.sleep_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeBool(2, this.doFactoryDefaults_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeBool(3, this.otaFwupdate_);
      }

      this.unknownFields.writeTo(var1);
   }
}
