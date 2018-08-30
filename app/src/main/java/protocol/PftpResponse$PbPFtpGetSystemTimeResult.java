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
import fi.polar.remote.representation.protobuf.Types$PbDate;
import fi.polar.remote.representation.protobuf.Types$PbDateOrBuilder;
import fi.polar.remote.representation.protobuf.Types$PbTime;
import fi.polar.remote.representation.protobuf.Types$PbTimeOrBuilder;
import java.io.InputStream;

public final class PftpResponse$PbPFtpGetSystemTimeResult extends GeneratedMessageV3 implements PftpResponse$PbPFtpGetSystemTimeResultOrBuilder {
   public static final int DATE_FIELD_NUMBER = 1;
   private static final PftpResponse$PbPFtpGetSystemTimeResult DEFAULT_INSTANCE = new PftpResponse$PbPFtpGetSystemTimeResult();
   @Deprecated
   public static final Parser PARSER = new PftpResponse$PbPFtpGetSystemTimeResult$1();
   public static final int TIME_FIELD_NUMBER = 2;
   public static final int TRUSTED_FIELD_NUMBER = 3;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private Types$PbDate date_;
   private byte memoizedIsInitialized;
   private Types$PbTime time_;
   private boolean trusted_;

   private PftpResponse$PbPFtpGetSystemTimeResult() {
      this.memoizedIsInitialized = (byte)-1;
      this.trusted_ = false;
   }

   private PftpResponse$PbPFtpGetSystemTimeResult(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpGetSystemTimeResult(CodedInputStream var1, ExtensionRegistryLite var2, PftpResponse$1 var3) {
      this(var1, var2);
   }

   private PftpResponse$PbPFtpGetSystemTimeResult(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpGetSystemTimeResult(Builder var1, PftpResponse$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PftpResponse$PbPFtpGetSystemTimeResult var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(PftpResponse$PbPFtpGetSystemTimeResult var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbDate a(PftpResponse$PbPFtpGetSystemTimeResult var0, Types$PbDate var1) {
      var0.date_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbTime a(PftpResponse$PbPFtpGetSystemTimeResult var0, Types$PbTime var1) {
      var0.time_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean a(PftpResponse$PbPFtpGetSystemTimeResult var0, boolean var1) {
      var0.trusted_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static PftpResponse$PbPFtpGetSystemTimeResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PftpResponse.g();
   }

   public static PftpResponse$PbPFtpGetSystemTimeResult$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PftpResponse$PbPFtpGetSystemTimeResult$Builder newBuilder(PftpResponse$PbPFtpGetSystemTimeResult var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PftpResponse$PbPFtpGetSystemTimeResult parseDelimitedFrom(InputStream var0) {
      return (PftpResponse$PbPFtpGetSystemTimeResult)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PftpResponse$PbPFtpGetSystemTimeResult parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpGetSystemTimeResult)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PftpResponse$PbPFtpGetSystemTimeResult parseFrom(ByteString var0) {
      return (PftpResponse$PbPFtpGetSystemTimeResult)PARSER.parseFrom(var0);
   }

   public static PftpResponse$PbPFtpGetSystemTimeResult parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpGetSystemTimeResult)PARSER.parseFrom(var0, var1);
   }

   public static PftpResponse$PbPFtpGetSystemTimeResult parseFrom(CodedInputStream var0) {
      return (PftpResponse$PbPFtpGetSystemTimeResult)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpResponse$PbPFtpGetSystemTimeResult parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpGetSystemTimeResult)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpResponse$PbPFtpGetSystemTimeResult parseFrom(InputStream var0) {
      return (PftpResponse$PbPFtpGetSystemTimeResult)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpResponse$PbPFtpGetSystemTimeResult parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpGetSystemTimeResult)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpResponse$PbPFtpGetSystemTimeResult parseFrom(byte[] var0) {
      return (PftpResponse$PbPFtpGetSystemTimeResult)PARSER.parseFrom(var0);
   }

   public static PftpResponse$PbPFtpGetSystemTimeResult parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PftpResponse$PbPFtpGetSystemTimeResult)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PftpResponse$PbPFtpGetSystemTimeResult)) {
            var2 = super.equals(var1);
         } else {
            PftpResponse$PbPFtpGetSystemTimeResult var5 = (PftpResponse$PbPFtpGetSystemTimeResult)var1;
            boolean var3;
            if (this.hasDate() == var5.hasDate()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasDate()) {
               if (var3 && this.getDate().equals(var5.getDate())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTime() == var5.hasTime()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasTime()) {
               if (var3 && this.getTime().equals(var5.getTime())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTrusted() == var5.hasTrusted()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasTrusted()) {
               if (var3 && this.getTrusted() == var5.getTrusted()) {
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

   public Types$PbDate getDate() {
      Types$PbDate var1;
      if (this.date_ == null) {
         var1 = Types$PbDate.getDefaultInstance();
      } else {
         var1 = this.date_;
      }

      return var1;
   }

   public Types$PbDateOrBuilder getDateOrBuilder() {
      Types$PbDate var1;
      if (this.date_ == null) {
         var1 = Types$PbDate.getDefaultInstance();
      } else {
         var1 = this.date_;
      }

      return var1;
   }

   public PftpResponse$PbPFtpGetSystemTimeResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeMessageSize(1, this.getDate());
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeMessageSize(2, this.getTime());
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeBoolSize(3, this.trusted_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public Types$PbTime getTime() {
      Types$PbTime var1;
      if (this.time_ == null) {
         var1 = Types$PbTime.getDefaultInstance();
      } else {
         var1 = this.time_;
      }

      return var1;
   }

   public Types$PbTimeOrBuilder getTimeOrBuilder() {
      Types$PbTime var1;
      if (this.time_ == null) {
         var1 = Types$PbTime.getDefaultInstance();
      } else {
         var1 = this.time_;
      }

      return var1;
   }

   public boolean getTrusted() {
      return this.trusted_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasDate() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTime() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTrusted() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
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
         if (this.hasDate()) {
            var1 = (var2 * 37 + 1) * 53 + this.getDate().hashCode();
         }

         var2 = var1;
         if (this.hasTime()) {
            var2 = (var1 * 37 + 2) * 53 + this.getTime().hashCode();
         }

         var1 = var2;
         if (this.hasTrusted()) {
            var1 = (var2 * 37 + 3) * 53 + Internal.hashBoolean(this.getTrusted());
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpResponse.h().ensureFieldAccessorsInitialized(PftpResponse$PbPFtpGetSystemTimeResult.class, PftpResponse$PbPFtpGetSystemTimeResult$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasDate()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasTime()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasTrusted()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getDate().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getTime().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public PftpResponse$PbPFtpGetSystemTimeResult$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PftpResponse$PbPFtpGetSystemTimeResult$Builder newBuilderForType(BuilderParent var1) {
      return new PftpResponse$PbPFtpGetSystemTimeResult$Builder(var1, (PftpResponse$1)null);
   }

   public PftpResponse$PbPFtpGetSystemTimeResult$Builder toBuilder() {
      PftpResponse$PbPFtpGetSystemTimeResult$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PftpResponse$PbPFtpGetSystemTimeResult$Builder((PftpResponse$1)null);
      } else {
         var1 = (new PftpResponse$PbPFtpGetSystemTimeResult$Builder((PftpResponse$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getDate());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getTime());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeBool(3, this.trusted_);
      }

      this.unknownFields.writeTo(var1);
   }
}
