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

public final class Types$PbRangeOptions extends GeneratedMessageV3 implements Types$PbRangeOptionsOrBuilder {
   private static final Types$PbRangeOptions DEFAULT_INSTANCE = new Types$PbRangeOptions();
   public static final int MAX_VALUE_FIELD_NUMBER = 2;
   public static final int MIN_VALUE_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new Types$PbRangeOptions$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int maxValue_;
   private byte memoizedIsInitialized;
   private int minValue_;

   private Types$PbRangeOptions() {
      this.memoizedIsInitialized = (byte)-1;
      this.minValue_ = 0;
      this.maxValue_ = 0;
   }

   private Types$PbRangeOptions(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Types$PbRangeOptions(CodedInputStream var1, ExtensionRegistryLite var2, Types$1 var3) {
      this(var1, var2);
   }

   private Types$PbRangeOptions(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Types$PbRangeOptions(Builder var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Types$PbRangeOptions var0, int var1) {
      var0.minValue_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Types$PbRangeOptions var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(Types$PbRangeOptions var0, int var1) {
      var0.maxValue_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(Types$PbRangeOptions var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static Types$PbRangeOptions getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Types.a();
   }

   public static Types$PbRangeOptions$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Types$PbRangeOptions$Builder newBuilder(Types$PbRangeOptions var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Types$PbRangeOptions parseDelimitedFrom(InputStream var0) {
      return (Types$PbRangeOptions)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Types$PbRangeOptions parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbRangeOptions)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Types$PbRangeOptions parseFrom(ByteString var0) {
      return (Types$PbRangeOptions)PARSER.parseFrom(var0);
   }

   public static Types$PbRangeOptions parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Types$PbRangeOptions)PARSER.parseFrom(var0, var1);
   }

   public static Types$PbRangeOptions parseFrom(CodedInputStream var0) {
      return (Types$PbRangeOptions)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbRangeOptions parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbRangeOptions)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbRangeOptions parseFrom(InputStream var0) {
      return (Types$PbRangeOptions)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbRangeOptions parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbRangeOptions)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbRangeOptions parseFrom(byte[] var0) {
      return (Types$PbRangeOptions)PARSER.parseFrom(var0);
   }

   public static Types$PbRangeOptions parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Types$PbRangeOptions)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Types$PbRangeOptions)) {
            var2 = super.equals(var1);
         } else {
            Types$PbRangeOptions var5 = (Types$PbRangeOptions)var1;
            boolean var3;
            if (this.hasMinValue() == var5.hasMinValue()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasMinValue()) {
               if (var3 && this.getMinValue() == var5.getMinValue()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasMaxValue() == var5.hasMaxValue()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasMaxValue()) {
               if (var4 && this.getMaxValue() == var5.getMaxValue()) {
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

   public Types$PbRangeOptions getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public int getMaxValue() {
      return this.maxValue_;
   }

   public int getMinValue() {
      return this.minValue_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeInt32Size(1, this.minValue_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeInt32Size(2, this.maxValue_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasMaxValue() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMinValue() {
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
         if (this.hasMinValue()) {
            var1 = (var2 * 37 + 1) * 53 + this.getMinValue();
         }

         var2 = var1;
         if (this.hasMaxValue()) {
            var2 = (var1 * 37 + 2) * 53 + this.getMaxValue();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.b().ensureFieldAccessorsInitialized(Types$PbRangeOptions.class, Types$PbRangeOptions$Builder.class);
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

   public Types$PbRangeOptions$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Types$PbRangeOptions$Builder newBuilderForType(BuilderParent var1) {
      return new Types$PbRangeOptions$Builder(var1, (Types$1)null);
   }

   public Types$PbRangeOptions$Builder toBuilder() {
      Types$PbRangeOptions$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Types$PbRangeOptions$Builder((Types$1)null);
      } else {
         var1 = (new Types$PbRangeOptions$Builder((Types$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeInt32(1, this.minValue_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeInt32(2, this.maxValue_);
      }

      this.unknownFields.writeTo(var1);
   }
}
