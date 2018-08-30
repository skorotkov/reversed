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

public final class Types$PbDuration extends GeneratedMessageV3 implements Types$PbDurationOrBuilder {
   private static final Types$PbDuration DEFAULT_INSTANCE = new Types$PbDuration();
   public static final int HOURS_FIELD_NUMBER = 1;
   public static final int MILLIS_FIELD_NUMBER = 4;
   public static final int MINUTES_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new Types$PbDuration$1();
   public static final int SECONDS_FIELD_NUMBER = 3;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int hours_;
   private byte memoizedIsInitialized;
   private int millis_;
   private int minutes_;
   private int seconds_;

   private Types$PbDuration() {
      this.memoizedIsInitialized = (byte)-1;
      this.hours_ = 0;
      this.minutes_ = 0;
      this.seconds_ = 0;
      this.millis_ = 0;
   }

   private Types$PbDuration(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Types$PbDuration(CodedInputStream var1, ExtensionRegistryLite var2, Types$1 var3) {
      this(var1, var2);
   }

   private Types$PbDuration(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Types$PbDuration(Builder var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Types$PbDuration var0, int var1) {
      var0.hours_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Types$PbDuration var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(Types$PbDuration var0, int var1) {
      var0.minutes_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(Types$PbDuration var0, int var1) {
      var0.seconds_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int d(Types$PbDuration var0, int var1) {
      var0.millis_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int e(Types$PbDuration var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static Types$PbDuration getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Types.k();
   }

   public static Types$PbDuration$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Types$PbDuration$Builder newBuilder(Types$PbDuration var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Types$PbDuration parseDelimitedFrom(InputStream var0) {
      return (Types$PbDuration)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Types$PbDuration parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbDuration)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Types$PbDuration parseFrom(ByteString var0) {
      return (Types$PbDuration)PARSER.parseFrom(var0);
   }

   public static Types$PbDuration parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Types$PbDuration)PARSER.parseFrom(var0, var1);
   }

   public static Types$PbDuration parseFrom(CodedInputStream var0) {
      return (Types$PbDuration)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbDuration parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbDuration)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbDuration parseFrom(InputStream var0) {
      return (Types$PbDuration)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbDuration parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbDuration)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbDuration parseFrom(byte[] var0) {
      return (Types$PbDuration)PARSER.parseFrom(var0);
   }

   public static Types$PbDuration parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Types$PbDuration)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Types$PbDuration)) {
            var2 = super.equals(var1);
         } else {
            Types$PbDuration var5 = (Types$PbDuration)var1;
            boolean var3;
            if (this.hasHours() == var5.hasHours()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasHours()) {
               if (var3 && this.getHours() == var5.getHours()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasMinutes() == var5.hasMinutes()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasMinutes()) {
               if (var4 && this.getMinutes() == var5.getMinutes()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasSeconds() == var5.hasSeconds()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSeconds()) {
               if (var4 && this.getSeconds() == var5.getSeconds()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasMillis() == var5.hasMillis()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasMillis()) {
               if (var3 && this.getMillis() == var5.getMillis()) {
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

   public Types$PbDuration getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public int getHours() {
      return this.hours_;
   }

   public int getMillis() {
      return this.millis_;
   }

   public int getMinutes() {
      return this.minutes_;
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
            var2 = 0 + CodedOutputStream.computeUInt32Size(1, this.hours_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeUInt32Size(2, this.minutes_);
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

   public boolean hasHours() {
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

   public boolean hasMinutes() {
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
         var1 = this.getDescriptorForType().hashCode() + 779;
         int var2 = var1;
         if (this.hasHours()) {
            var2 = (var1 * 37 + 1) * 53 + this.getHours();
         }

         var1 = var2;
         if (this.hasMinutes()) {
            var1 = (var2 * 37 + 2) * 53 + this.getMinutes();
         }

         var2 = var1;
         if (this.hasSeconds()) {
            var2 = (var1 * 37 + 3) * 53 + this.getSeconds();
         }

         var1 = var2;
         if (this.hasMillis()) {
            var1 = (var2 * 37 + 4) * 53 + this.getMillis();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.l().ensureFieldAccessorsInitialized(Types$PbDuration.class, Types$PbDuration$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Types$PbDuration$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Types$PbDuration$Builder newBuilderForType(BuilderParent var1) {
      return new Types$PbDuration$Builder(var1, (Types$1)null);
   }

   public Types$PbDuration$Builder toBuilder() {
      Types$PbDuration$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Types$PbDuration$Builder((Types$1)null);
      } else {
         var1 = (new Types$PbDuration$Builder((Types$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.hours_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeUInt32(2, this.minutes_);
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
