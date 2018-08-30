package fi.polar.remote.representation.protobuf;

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

public final class Types$PbDate extends GeneratedMessageV3 implements Types$PbDateOrBuilder {
   public static final int DAY_FIELD_NUMBER = 3;
   private static final Types$PbDate DEFAULT_INSTANCE = new Types$PbDate();
   public static final int MONTH_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new Types$PbDate$1();
   public static final int YEAR_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int day_;
   private byte memoizedIsInitialized;
   private int month_;
   private int year_;

   private Types$PbDate() {
      this.memoizedIsInitialized = (byte)-1;
      this.year_ = 0;
      this.month_ = 0;
      this.day_ = 0;
   }

   private Types$PbDate(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Types$PbDate(CodedInputStream var1, ExtensionRegistryLite var2, Types$1 var3) {
      this(var1, var2);
   }

   private Types$PbDate(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Types$PbDate(Builder var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Types$PbDate var0, int var1) {
      var0.year_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Types$PbDate var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(Types$PbDate var0, int var1) {
      var0.month_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(Types$PbDate var0, int var1) {
      var0.day_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int d(Types$PbDate var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static Types$PbDate getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Types.c();
   }

   public static Types$PbDate$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Types$PbDate$Builder newBuilder(Types$PbDate var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Types$PbDate parseDelimitedFrom(InputStream var0) {
      return (Types$PbDate)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Types$PbDate parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbDate)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Types$PbDate parseFrom(ByteString var0) {
      return (Types$PbDate)PARSER.parseFrom(var0);
   }

   public static Types$PbDate parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Types$PbDate)PARSER.parseFrom(var0, var1);
   }

   public static Types$PbDate parseFrom(CodedInputStream var0) {
      return (Types$PbDate)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbDate parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbDate)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbDate parseFrom(InputStream var0) {
      return (Types$PbDate)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbDate parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbDate)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbDate parseFrom(byte[] var0) {
      return (Types$PbDate)PARSER.parseFrom(var0);
   }

   public static Types$PbDate parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Types$PbDate)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Types$PbDate)) {
            var2 = super.equals(var1);
         } else {
            Types$PbDate var5 = (Types$PbDate)var1;
            boolean var3;
            if (this.hasYear() == var5.hasYear()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasYear()) {
               if (var3 && this.getYear() == var5.getYear()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasMonth() == var5.hasMonth()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasMonth()) {
               if (var4 && this.getMonth() == var5.getMonth()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasDay() == var5.hasDay()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasDay()) {
               if (var3 && this.getDay() == var5.getDay()) {
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

   public int getDay() {
      return this.day_;
   }

   public Types$PbDate getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public int getMonth() {
      return this.month_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeUInt32Size(1, this.year_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeUInt32Size(2, this.month_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(3, this.day_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public int getYear() {
      return this.year_;
   }

   public boolean hasDay() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMonth() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasYear() {
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
         if (this.hasYear()) {
            var1 = (var2 * 37 + 1) * 53 + this.getYear();
         }

         var2 = var1;
         if (this.hasMonth()) {
            var2 = (var1 * 37 + 2) * 53 + this.getMonth();
         }

         var1 = var2;
         if (this.hasDay()) {
            var1 = (var2 * 37 + 3) * 53 + this.getDay();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.d().ensureFieldAccessorsInitialized(Types$PbDate.class, Types$PbDate$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasYear()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasMonth()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasDay()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Types$PbDate$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Types$PbDate$Builder newBuilderForType(BuilderParent var1) {
      return new Types$PbDate$Builder(var1, (Types$1)null);
   }

   public Types$PbDate$Builder toBuilder() {
      Types$PbDate$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Types$PbDate$Builder((Types$1)null);
      } else {
         var1 = (new Types$PbDate$Builder((Types$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.year_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeUInt32(2, this.month_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeUInt32(3, this.day_);
      }

      this.unknownFields.writeTo(var1);
   }
}
