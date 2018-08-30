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

public final class Types$PbTime extends GeneratedMessageV3 implements Types$PbTimeOrBuilder {
   private static final Types$PbTime DEFAULT_INSTANCE = new Types$PbTime();
   public static final int HOUR_FIELD_NUMBER = 1;
   public static final int MILLIS_FIELD_NUMBER = 4;
   public static final int MINUTE_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new Types$PbTime$1();
   public static final int SECONDS_FIELD_NUMBER = 3;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int hour_;
   private byte memoizedIsInitialized;
   private int millis_;
   private int minute_;
   private int seconds_;

   private Types$PbTime() {
      this.memoizedIsInitialized = (byte)-1;
      this.hour_ = 0;
      this.minute_ = 0;
      this.seconds_ = 0;
      this.millis_ = 0;
   }

   private Types$PbTime(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Types$PbTime(CodedInputStream var1, ExtensionRegistryLite var2, Types$1 var3) {
      this(var1, var2);
   }

   private Types$PbTime(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Types$PbTime(Builder var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Types$PbTime var0, int var1) {
      var0.hour_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Types$PbTime var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(Types$PbTime var0, int var1) {
      var0.minute_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(Types$PbTime var0, int var1) {
      var0.seconds_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int d(Types$PbTime var0, int var1) {
      var0.millis_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int e(Types$PbTime var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static Types$PbTime getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Types.e();
   }

   public static Types$PbTime$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Types$PbTime$Builder newBuilder(Types$PbTime var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Types$PbTime parseDelimitedFrom(InputStream var0) {
      return (Types$PbTime)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Types$PbTime parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbTime)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Types$PbTime parseFrom(ByteString var0) {
      return (Types$PbTime)PARSER.parseFrom(var0);
   }

   public static Types$PbTime parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Types$PbTime)PARSER.parseFrom(var0, var1);
   }

   public static Types$PbTime parseFrom(CodedInputStream var0) {
      return (Types$PbTime)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbTime parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbTime)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbTime parseFrom(InputStream var0) {
      return (Types$PbTime)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbTime parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbTime)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbTime parseFrom(byte[] var0) {
      return (Types$PbTime)PARSER.parseFrom(var0);
   }

   public static Types$PbTime parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Types$PbTime)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Types$PbTime)) {
            var2 = super.equals(var1);
         } else {
            Types$PbTime var5 = (Types$PbTime)var1;
            boolean var3;
            if (this.hasHour() == var5.hasHour()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasHour()) {
               if (var3 && this.getHour() == var5.getHour()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasMinute() == var5.hasMinute()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasMinute()) {
               if (var3 && this.getMinute() == var5.getMinute()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSeconds() == var5.hasSeconds()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSeconds()) {
               if (var3 && this.getSeconds() == var5.getSeconds()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasMillis() == var5.hasMillis()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasMillis()) {
               if (var4 && this.getMillis() == var5.getMillis()) {
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

   public Types$PbTime getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public int getHour() {
      return this.hour_;
   }

   public int getMillis() {
      return this.millis_;
   }

   public int getMinute() {
      return this.minute_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSeconds() {
      return this.seconds_;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeUInt32Size(1, this.hour_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeUInt32Size(2, this.minute_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(3, this.seconds_);
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeUInt32Size(4, this.millis_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasHour() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMillis() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMinute() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSeconds() {
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
         if (this.hasHour()) {
            var1 = (var2 * 37 + 1) * 53 + this.getHour();
         }

         var2 = var1;
         if (this.hasMinute()) {
            var2 = (var1 * 37 + 2) * 53 + this.getMinute();
         }

         var1 = var2;
         if (this.hasSeconds()) {
            var1 = (var2 * 37 + 3) * 53 + this.getSeconds();
         }

         var2 = var1;
         if (this.hasMillis()) {
            var2 = (var1 * 37 + 4) * 53 + this.getMillis();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.f().ensureFieldAccessorsInitialized(Types$PbTime.class, Types$PbTime$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasHour()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasMinute()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasSeconds()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Types$PbTime$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Types$PbTime$Builder newBuilderForType(BuilderParent var1) {
      return new Types$PbTime$Builder(var1, (Types$1)null);
   }

   public Types$PbTime$Builder toBuilder() {
      Types$PbTime$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Types$PbTime$Builder((Types$1)null);
      } else {
         var1 = (new Types$PbTime$Builder((Types$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.hour_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeUInt32(2, this.minute_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeUInt32(3, this.seconds_);
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeUInt32(4, this.millis_);
      }

      this.unknownFields.writeTo(var1);
   }
}
