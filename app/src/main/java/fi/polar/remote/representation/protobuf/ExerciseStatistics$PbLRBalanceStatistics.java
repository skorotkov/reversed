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

public final class ExerciseStatistics$PbLRBalanceStatistics extends GeneratedMessageV3 implements ExerciseStatistics$PbLRBalanceStatisticsOrBuilder {
   public static final int AVERAGE_FIELD_NUMBER = 1;
   private static final ExerciseStatistics$PbLRBalanceStatistics DEFAULT_INSTANCE = new ExerciseStatistics$PbLRBalanceStatistics();
   @Deprecated
   public static final Parser PARSER = new ExerciseStatistics$PbLRBalanceStatistics$1();
   private static final long serialVersionUID = 0L;
   private float average_;
   private int bitField0_;
   private byte memoizedIsInitialized;

   private ExerciseStatistics$PbLRBalanceStatistics() {
      this.memoizedIsInitialized = (byte)-1;
      this.average_ = 0.0F;
   }

   private ExerciseStatistics$PbLRBalanceStatistics(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseStatistics$PbLRBalanceStatistics(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseStatistics$1 var3) {
      this(var1, var2);
   }

   private ExerciseStatistics$PbLRBalanceStatistics(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseStatistics$PbLRBalanceStatistics(Builder var1, ExerciseStatistics$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(ExerciseStatistics$PbLRBalanceStatistics var0, float var1) {
      var0.average_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(ExerciseStatistics$PbLRBalanceStatistics var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExerciseStatistics$PbLRBalanceStatistics var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static ExerciseStatistics$PbLRBalanceStatistics getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseStatistics.s();
   }

   public static ExerciseStatistics$PbLRBalanceStatistics$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseStatistics$PbLRBalanceStatistics$Builder newBuilder(ExerciseStatistics$PbLRBalanceStatistics var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseStatistics$PbLRBalanceStatistics parseDelimitedFrom(InputStream var0) {
      return (ExerciseStatistics$PbLRBalanceStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseStatistics$PbLRBalanceStatistics parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbLRBalanceStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseStatistics$PbLRBalanceStatistics parseFrom(ByteString var0) {
      return (ExerciseStatistics$PbLRBalanceStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseStatistics$PbLRBalanceStatistics parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbLRBalanceStatistics)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseStatistics$PbLRBalanceStatistics parseFrom(CodedInputStream var0) {
      return (ExerciseStatistics$PbLRBalanceStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseStatistics$PbLRBalanceStatistics parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbLRBalanceStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseStatistics$PbLRBalanceStatistics parseFrom(InputStream var0) {
      return (ExerciseStatistics$PbLRBalanceStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseStatistics$PbLRBalanceStatistics parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbLRBalanceStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseStatistics$PbLRBalanceStatistics parseFrom(byte[] var0) {
      return (ExerciseStatistics$PbLRBalanceStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseStatistics$PbLRBalanceStatistics parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbLRBalanceStatistics)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseStatistics$PbLRBalanceStatistics)) {
            var2 = super.equals(var1);
         } else {
            ExerciseStatistics$PbLRBalanceStatistics var5 = (ExerciseStatistics$PbLRBalanceStatistics)var1;
            boolean var3;
            if (this.hasAverage() == var5.hasAverage()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasAverage()) {
               if (var3 && Float.floatToIntBits(this.getAverage()) == Float.floatToIntBits(var5.getAverage())) {
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

   public float getAverage() {
      return this.average_;
   }

   public ExerciseStatistics$PbLRBalanceStatistics getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeFloatSize(1, this.average_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasAverage() {
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
         if (this.hasAverage()) {
            var1 = (var2 * 37 + 1) * 53 + Float.floatToIntBits(this.getAverage());
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseStatistics.t().ensureFieldAccessorsInitialized(ExerciseStatistics$PbLRBalanceStatistics.class, ExerciseStatistics$PbLRBalanceStatistics$Builder.class);
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

   public ExerciseStatistics$PbLRBalanceStatistics$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseStatistics$PbLRBalanceStatistics$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseStatistics$PbLRBalanceStatistics$Builder(var1, (ExerciseStatistics$1)null);
   }

   public ExerciseStatistics$PbLRBalanceStatistics$Builder toBuilder() {
      ExerciseStatistics$PbLRBalanceStatistics$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseStatistics$PbLRBalanceStatistics$Builder((ExerciseStatistics$1)null);
      } else {
         var1 = (new ExerciseStatistics$PbLRBalanceStatistics$Builder((ExerciseStatistics$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeFloat(1, this.average_);
      }

      this.unknownFields.writeTo(var1);
   }
}
