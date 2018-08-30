package fi.polar.remote.representation.protobuf;

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

public final class Types$PbLocalDateTime extends GeneratedMessageV3 implements Types$PbLocalDateTimeOrBuilder {
   public static final int DATE_FIELD_NUMBER = 1;
   private static final Types$PbLocalDateTime DEFAULT_INSTANCE = new Types$PbLocalDateTime();
   public static final int OBSOLETE_TRUSTED_FIELD_NUMBER = 3;
   @Deprecated
   public static final Parser PARSER = new Types$PbLocalDateTime$1();
   public static final int TIME_FIELD_NUMBER = 2;
   public static final int TIME_ZONE_OFFSET_FIELD_NUMBER = 4;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private Types$PbDate date_;
   private byte memoizedIsInitialized;
   private boolean oBSOLETETrusted_;
   private int timeZoneOffset_;
   private Types$PbTime time_;

   private Types$PbLocalDateTime() {
      this.memoizedIsInitialized = (byte)-1;
      this.oBSOLETETrusted_ = false;
      this.timeZoneOffset_ = 0;
   }

   private Types$PbLocalDateTime(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Types$PbLocalDateTime(CodedInputStream var1, ExtensionRegistryLite var2, Types$1 var3) {
      this(var1, var2);
   }

   private Types$PbLocalDateTime(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Types$PbLocalDateTime(Builder var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Types$PbLocalDateTime var0, int var1) {
      var0.timeZoneOffset_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Types$PbLocalDateTime var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbDate a(Types$PbLocalDateTime var0, Types$PbDate var1) {
      var0.date_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbTime a(Types$PbLocalDateTime var0, Types$PbTime var1) {
      var0.time_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean a(Types$PbLocalDateTime var0, boolean var1) {
      var0.oBSOLETETrusted_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(Types$PbLocalDateTime var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static Types$PbLocalDateTime getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Types.i();
   }

   public static Types$PbLocalDateTime$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Types$PbLocalDateTime$Builder newBuilder(Types$PbLocalDateTime var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Types$PbLocalDateTime parseDelimitedFrom(InputStream var0) {
      return (Types$PbLocalDateTime)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Types$PbLocalDateTime parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbLocalDateTime)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Types$PbLocalDateTime parseFrom(ByteString var0) {
      return (Types$PbLocalDateTime)PARSER.parseFrom(var0);
   }

   public static Types$PbLocalDateTime parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Types$PbLocalDateTime)PARSER.parseFrom(var0, var1);
   }

   public static Types$PbLocalDateTime parseFrom(CodedInputStream var0) {
      return (Types$PbLocalDateTime)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbLocalDateTime parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbLocalDateTime)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbLocalDateTime parseFrom(InputStream var0) {
      return (Types$PbLocalDateTime)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbLocalDateTime parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbLocalDateTime)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbLocalDateTime parseFrom(byte[] var0) {
      return (Types$PbLocalDateTime)PARSER.parseFrom(var0);
   }

   public static Types$PbLocalDateTime parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Types$PbLocalDateTime)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Types$PbLocalDateTime)) {
            var2 = super.equals(var1);
         } else {
            Types$PbLocalDateTime var5 = (Types$PbLocalDateTime)var1;
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

            if (var4 && this.hasOBSOLETETrusted() == var5.hasOBSOLETETrusted()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasOBSOLETETrusted()) {
               if (var3 && this.getOBSOLETETrusted() == var5.getOBSOLETETrusted()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTimeZoneOffset() == var5.hasTimeZoneOffset()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasTimeZoneOffset()) {
               if (var4 && this.getTimeZoneOffset() == var5.getTimeZoneOffset()) {
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

   public Types$PbLocalDateTime getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public boolean getOBSOLETETrusted() {
      return this.oBSOLETETrusted_;
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
            var2 = var1 + CodedOutputStream.computeBoolSize(3, this.oBSOLETETrusted_);
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeInt32Size(4, this.timeZoneOffset_);
         }

         var1 += this.unknownFields.getSerializedSize();
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

   public int getTimeZoneOffset() {
      return this.timeZoneOffset_;
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

   public boolean hasOBSOLETETrusted() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
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

   public boolean hasTimeZoneOffset() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
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
         var1 = this.getDescriptorForType().hashCode() + 779;
         int var2 = var1;
         if (this.hasDate()) {
            var2 = (var1 * 37 + 1) * 53 + this.getDate().hashCode();
         }

         var1 = var2;
         if (this.hasTime()) {
            var1 = (var2 * 37 + 2) * 53 + this.getTime().hashCode();
         }

         var2 = var1;
         if (this.hasOBSOLETETrusted()) {
            var2 = (var1 * 37 + 3) * 53 + Internal.hashBoolean(this.getOBSOLETETrusted());
         }

         var1 = var2;
         if (this.hasTimeZoneOffset()) {
            var1 = (var2 * 37 + 4) * 53 + this.getTimeZoneOffset();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.j().ensureFieldAccessorsInitialized(Types$PbLocalDateTime.class, Types$PbLocalDateTime$Builder.class);
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
         } else if (!this.hasOBSOLETETrusted()) {
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

   public Types$PbLocalDateTime$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Types$PbLocalDateTime$Builder newBuilderForType(BuilderParent var1) {
      return new Types$PbLocalDateTime$Builder(var1, (Types$1)null);
   }

   public Types$PbLocalDateTime$Builder toBuilder() {
      Types$PbLocalDateTime$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Types$PbLocalDateTime$Builder((Types$1)null);
      } else {
         var1 = (new Types$PbLocalDateTime$Builder((Types$1)null)).mergeFrom(this);
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
         var1.writeBool(3, this.oBSOLETETrusted_);
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeInt32(4, this.timeZoneOffset_);
      }

      this.unknownFields.writeTo(var1);
   }
}
