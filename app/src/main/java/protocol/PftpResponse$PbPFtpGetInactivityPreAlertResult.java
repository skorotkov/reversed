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

public final class PftpResponse$PbPFtpGetInactivityPreAlertResult extends GeneratedMessageV3 implements PftpResponse$PbPFtpGetInactivityPreAlertResultOrBuilder {
   private static final PftpResponse$PbPFtpGetInactivityPreAlertResult DEFAULT_INSTANCE = new PftpResponse$PbPFtpGetInactivityPreAlertResult();
   public static final int INACTIVITY_PRE_ALERT_ON_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new PftpResponse$PbPFtpGetInactivityPreAlertResult$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private boolean inactivityPreAlertOn_;
   private byte memoizedIsInitialized;

   private PftpResponse$PbPFtpGetInactivityPreAlertResult() {
      this.memoizedIsInitialized = (byte)-1;
      this.inactivityPreAlertOn_ = false;
   }

   private PftpResponse$PbPFtpGetInactivityPreAlertResult(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpGetInactivityPreAlertResult(CodedInputStream var1, ExtensionRegistryLite var2, PftpResponse$1 var3) {
      this(var1, var2);
   }

   private PftpResponse$PbPFtpGetInactivityPreAlertResult(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpGetInactivityPreAlertResult(Builder var1, PftpResponse$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PftpResponse$PbPFtpGetInactivityPreAlertResult var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(PftpResponse$PbPFtpGetInactivityPreAlertResult var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean a(PftpResponse$PbPFtpGetInactivityPreAlertResult var0, boolean var1) {
      var0.inactivityPreAlertOn_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static PftpResponse$PbPFtpGetInactivityPreAlertResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PftpResponse.q();
   }

   public static PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder newBuilder(PftpResponse$PbPFtpGetInactivityPreAlertResult var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PftpResponse$PbPFtpGetInactivityPreAlertResult parseDelimitedFrom(InputStream var0) {
      return (PftpResponse$PbPFtpGetInactivityPreAlertResult)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PftpResponse$PbPFtpGetInactivityPreAlertResult parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpGetInactivityPreAlertResult)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PftpResponse$PbPFtpGetInactivityPreAlertResult parseFrom(ByteString var0) {
      return (PftpResponse$PbPFtpGetInactivityPreAlertResult)PARSER.parseFrom(var0);
   }

   public static PftpResponse$PbPFtpGetInactivityPreAlertResult parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpGetInactivityPreAlertResult)PARSER.parseFrom(var0, var1);
   }

   public static PftpResponse$PbPFtpGetInactivityPreAlertResult parseFrom(CodedInputStream var0) {
      return (PftpResponse$PbPFtpGetInactivityPreAlertResult)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpResponse$PbPFtpGetInactivityPreAlertResult parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpGetInactivityPreAlertResult)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpResponse$PbPFtpGetInactivityPreAlertResult parseFrom(InputStream var0) {
      return (PftpResponse$PbPFtpGetInactivityPreAlertResult)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpResponse$PbPFtpGetInactivityPreAlertResult parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpGetInactivityPreAlertResult)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpResponse$PbPFtpGetInactivityPreAlertResult parseFrom(byte[] var0) {
      return (PftpResponse$PbPFtpGetInactivityPreAlertResult)PARSER.parseFrom(var0);
   }

   public static PftpResponse$PbPFtpGetInactivityPreAlertResult parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpGetInactivityPreAlertResult)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PftpResponse$PbPFtpGetInactivityPreAlertResult)) {
            var2 = super.equals(var1);
         } else {
            PftpResponse$PbPFtpGetInactivityPreAlertResult var5 = (PftpResponse$PbPFtpGetInactivityPreAlertResult)var1;
            boolean var3;
            if (this.hasInactivityPreAlertOn() == var5.hasInactivityPreAlertOn()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasInactivityPreAlertOn()) {
               if (var3 && this.getInactivityPreAlertOn() == var5.getInactivityPreAlertOn()) {
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

   public PftpResponse$PbPFtpGetInactivityPreAlertResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public boolean getInactivityPreAlertOn() {
      return this.inactivityPreAlertOn_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeBoolSize(1, this.inactivityPreAlertOn_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasInactivityPreAlertOn() {
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
         if (this.hasInactivityPreAlertOn()) {
            var1 = (var2 * 37 + 1) * 53 + Internal.hashBoolean(this.getInactivityPreAlertOn());
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpResponse.r().ensureFieldAccessorsInitialized(PftpResponse$PbPFtpGetInactivityPreAlertResult.class, PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasInactivityPreAlertOn()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder newBuilderForType(BuilderParent var1) {
      return new PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder(var1, (PftpResponse$1)null);
   }

   public PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder toBuilder() {
      PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder((PftpResponse$1)null);
      } else {
         var1 = (new PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder((PftpResponse$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeBool(1, this.inactivityPreAlertOn_);
      }

      this.unknownFields.writeTo(var1);
   }
}
