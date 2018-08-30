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

public final class Types$PbWeek extends GeneratedMessageV3 implements Types$PbWeekOrBuilder {
   private static final Types$PbWeek DEFAULT_INSTANCE = new Types$PbWeek();
   @Deprecated
   public static final Parser PARSER = new Types$PbWeek$1();
   public static final int TIME_ZONE_OFFSET_FIELD_NUMBER = 3;
   public static final int WEEK_NUMBER_ISO8601_FIELD_NUMBER = 1;
   public static final int WEEK_START_DAY_FIELD_NUMBER = 4;
   public static final int YEAR_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private int timeZoneOffset_;
   private int weekNumberISO8601_;
   private int weekStartDay_;
   private int year_;

   private Types$PbWeek() {
      this.memoizedIsInitialized = (byte)-1;
      this.weekNumberISO8601_ = 0;
      this.year_ = 0;
      this.timeZoneOffset_ = 0;
      this.weekStartDay_ = 1;
   }

   private Types$PbWeek(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Types$PbWeek(CodedInputStream var1, ExtensionRegistryLite var2, Types$1 var3) {
      this(var1, var2);
   }

   private Types$PbWeek(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Types$PbWeek(Builder var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Types$PbWeek var0, int var1) {
      var0.weekNumberISO8601_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Types$PbWeek var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(Types$PbWeek var0, int var1) {
      var0.year_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(Types$PbWeek var0, int var1) {
      var0.timeZoneOffset_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int d(Types$PbWeek var0, int var1) {
      var0.weekStartDay_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int e(Types$PbWeek var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static Types$PbWeek getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Types.u();
   }

   public static Types$PbWeek$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Types$PbWeek$Builder newBuilder(Types$PbWeek var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Types$PbWeek parseDelimitedFrom(InputStream var0) {
      return (Types$PbWeek)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Types$PbWeek parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbWeek)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Types$PbWeek parseFrom(ByteString var0) {
      return (Types$PbWeek)PARSER.parseFrom(var0);
   }

   public static Types$PbWeek parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Types$PbWeek)PARSER.parseFrom(var0, var1);
   }

   public static Types$PbWeek parseFrom(CodedInputStream var0) {
      return (Types$PbWeek)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbWeek parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbWeek)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbWeek parseFrom(InputStream var0) {
      return (Types$PbWeek)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbWeek parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbWeek)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbWeek parseFrom(byte[] var0) {
      return (Types$PbWeek)PARSER.parseFrom(var0);
   }

   public static Types$PbWeek parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Types$PbWeek)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Types$PbWeek)) {
            var2 = super.equals(var1);
         } else {
            Types$PbWeek var5 = (Types$PbWeek)var1;
            boolean var3;
            if (this.hasWeekNumberISO8601() == var5.hasWeekNumberISO8601()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasWeekNumberISO8601()) {
               if (var3 && this.getWeekNumberISO8601() == var5.getWeekNumberISO8601()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasYear() == var5.hasYear()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasYear()) {
               if (var4 && this.getYear() == var5.getYear()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasTimeZoneOffset() == var5.hasTimeZoneOffset()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasTimeZoneOffset()) {
               if (var3 && this.getTimeZoneOffset() == var5.getTimeZoneOffset()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasWeekStartDay() == var5.hasWeekStartDay()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasWeekStartDay()) {
               if (var4 && this.weekStartDay_ == var5.weekStartDay_) {
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

   public Types$PbWeek getDefaultInstanceForType() {
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
            var2 = 0 + CodedOutputStream.computeUInt32Size(1, this.weekNumberISO8601_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeUInt32Size(2, this.year_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeInt32Size(3, this.timeZoneOffset_);
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeEnumSize(4, this.weekStartDay_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public int getTimeZoneOffset() {
      return this.timeZoneOffset_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public int getWeekNumberISO8601() {
      return this.weekNumberISO8601_;
   }

   public Types$PbStartDayOfWeek getWeekStartDay() {
      Types$PbStartDayOfWeek var1 = Types$PbStartDayOfWeek.valueOf(this.weekStartDay_);
      Types$PbStartDayOfWeek var2 = var1;
      if (var1 == null) {
         var2 = Types$PbStartDayOfWeek.MONDAY;
      }

      return var2;
   }

   public int getYear() {
      return this.year_;
   }

   public boolean hasTimeZoneOffset() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasWeekNumberISO8601() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasWeekStartDay() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasYear() {
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
         if (this.hasWeekNumberISO8601()) {
            var1 = (var2 * 37 + 1) * 53 + this.getWeekNumberISO8601();
         }

         var2 = var1;
         if (this.hasYear()) {
            var2 = (var1 * 37 + 2) * 53 + this.getYear();
         }

         var1 = var2;
         if (this.hasTimeZoneOffset()) {
            var1 = (var2 * 37 + 3) * 53 + this.getTimeZoneOffset();
         }

         var2 = var1;
         if (this.hasWeekStartDay()) {
            var2 = (var1 * 37 + 4) * 53 + this.weekStartDay_;
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.v().ensureFieldAccessorsInitialized(Types$PbWeek.class, Types$PbWeek$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasWeekNumberISO8601()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasYear()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasTimeZoneOffset()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasWeekStartDay()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Types$PbWeek$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Types$PbWeek$Builder newBuilderForType(BuilderParent var1) {
      return new Types$PbWeek$Builder(var1, (Types$1)null);
   }

   public Types$PbWeek$Builder toBuilder() {
      Types$PbWeek$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Types$PbWeek$Builder((Types$1)null);
      } else {
         var1 = (new Types$PbWeek$Builder((Types$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.weekNumberISO8601_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeUInt32(2, this.year_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeInt32(3, this.timeZoneOffset_);
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeEnum(4, this.weekStartDay_);
      }

      this.unknownFields.writeTo(var1);
   }
}
