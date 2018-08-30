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

public final class PftpNotification$PbPFtpTrainingSessionStatus extends GeneratedMessageV3 implements PftpNotification$PbPFtpTrainingSessionStatusOrBuilder {
   private static final PftpNotification$PbPFtpTrainingSessionStatus DEFAULT_INSTANCE = new PftpNotification$PbPFtpTrainingSessionStatus();
   public static final int INPROGRESS_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new PftpNotification$PbPFtpTrainingSessionStatus$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private boolean inprogress_;
   private byte memoizedIsInitialized;

   private PftpNotification$PbPFtpTrainingSessionStatus() {
      this.memoizedIsInitialized = (byte)-1;
      this.inprogress_ = false;
   }

   private PftpNotification$PbPFtpTrainingSessionStatus(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpTrainingSessionStatus(CodedInputStream var1, ExtensionRegistryLite var2, PftpNotification$1 var3) {
      this(var1, var2);
   }

   private PftpNotification$PbPFtpTrainingSessionStatus(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpTrainingSessionStatus(Builder var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PftpNotification$PbPFtpTrainingSessionStatus var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(PftpNotification$PbPFtpTrainingSessionStatus var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean a(PftpNotification$PbPFtpTrainingSessionStatus var0, boolean var1) {
      var0.inprogress_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static PftpNotification$PbPFtpTrainingSessionStatus getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.e();
   }

   public static PftpNotification$PbPFtpTrainingSessionStatus$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PftpNotification$PbPFtpTrainingSessionStatus$Builder newBuilder(PftpNotification$PbPFtpTrainingSessionStatus var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PftpNotification$PbPFtpTrainingSessionStatus parseDelimitedFrom(InputStream var0) {
      return (PftpNotification$PbPFtpTrainingSessionStatus)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpTrainingSessionStatus parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpTrainingSessionStatus)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpTrainingSessionStatus parseFrom(ByteString var0) {
      return (PftpNotification$PbPFtpTrainingSessionStatus)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPFtpTrainingSessionStatus parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpTrainingSessionStatus)PARSER.parseFrom(var0, var1);
   }

   public static PftpNotification$PbPFtpTrainingSessionStatus parseFrom(CodedInputStream var0) {
      return (PftpNotification$PbPFtpTrainingSessionStatus)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpTrainingSessionStatus parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpTrainingSessionStatus)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpTrainingSessionStatus parseFrom(InputStream var0) {
      return (PftpNotification$PbPFtpTrainingSessionStatus)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPFtpTrainingSessionStatus parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpTrainingSessionStatus)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPFtpTrainingSessionStatus parseFrom(byte[] var0) {
      return (PftpNotification$PbPFtpTrainingSessionStatus)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPFtpTrainingSessionStatus parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPFtpTrainingSessionStatus)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PftpNotification$PbPFtpTrainingSessionStatus)) {
            var2 = super.equals(var1);
         } else {
            PftpNotification$PbPFtpTrainingSessionStatus var5 = (PftpNotification$PbPFtpTrainingSessionStatus)var1;
            boolean var3;
            if (this.hasInprogress() == var5.hasInprogress()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasInprogress()) {
               if (var3 && this.getInprogress() == var5.getInprogress()) {
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

   public PftpNotification$PbPFtpTrainingSessionStatus getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public boolean getInprogress() {
      return this.inprogress_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeBoolSize(1, this.inprogress_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasInprogress() {
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
         if (this.hasInprogress()) {
            var1 = (var2 * 37 + 1) * 53 + Internal.hashBoolean(this.getInprogress());
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.f().ensureFieldAccessorsInitialized(PftpNotification$PbPFtpTrainingSessionStatus.class, PftpNotification$PbPFtpTrainingSessionStatus$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasInprogress()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public PftpNotification$PbPFtpTrainingSessionStatus$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PftpNotification$PbPFtpTrainingSessionStatus$Builder newBuilderForType(BuilderParent var1) {
      return new PftpNotification$PbPFtpTrainingSessionStatus$Builder(var1, (PftpNotification$1)null);
   }

   public PftpNotification$PbPFtpTrainingSessionStatus$Builder toBuilder() {
      PftpNotification$PbPFtpTrainingSessionStatus$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PftpNotification$PbPFtpTrainingSessionStatus$Builder((PftpNotification$1)null);
      } else {
         var1 = (new PftpNotification$PbPFtpTrainingSessionStatus$Builder((PftpNotification$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeBool(1, this.inprogress_);
      }

      this.unknownFields.writeTo(var1);
   }
}
