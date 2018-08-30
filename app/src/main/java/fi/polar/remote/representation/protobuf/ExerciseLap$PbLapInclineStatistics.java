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

public final class ExerciseLap$PbLapInclineStatistics extends GeneratedMessageV3 implements ExerciseLap$PbLapInclineStatisticsOrBuilder {
   private static final ExerciseLap$PbLapInclineStatistics DEFAULT_INSTANCE = new ExerciseLap$PbLapInclineStatistics();
   public static final int MAX_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new ExerciseLap$PbLapInclineStatistics$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private float max_;
   private byte memoizedIsInitialized;

   private ExerciseLap$PbLapInclineStatistics() {
      this.memoizedIsInitialized = (byte)-1;
      this.max_ = 0.0F;
   }

   private ExerciseLap$PbLapInclineStatistics(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseLap$PbLapInclineStatistics(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseLap$1 var3) {
      this(var1, var2);
   }

   private ExerciseLap$PbLapInclineStatistics(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseLap$PbLapInclineStatistics(Builder var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(ExerciseLap$PbLapInclineStatistics var0, float var1) {
      var0.max_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(ExerciseLap$PbLapInclineStatistics var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExerciseLap$PbLapInclineStatistics var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static ExerciseLap$PbLapInclineStatistics getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.u();
   }

   public static ExerciseLap$PbLapInclineStatistics$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseLap$PbLapInclineStatistics$Builder newBuilder(ExerciseLap$PbLapInclineStatistics var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseLap$PbLapInclineStatistics parseDelimitedFrom(InputStream var0) {
      return (ExerciseLap$PbLapInclineStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLapInclineStatistics parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapInclineStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLapInclineStatistics parseFrom(ByteString var0) {
      return (ExerciseLap$PbLapInclineStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseLap$PbLapInclineStatistics parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapInclineStatistics)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseLap$PbLapInclineStatistics parseFrom(CodedInputStream var0) {
      return (ExerciseLap$PbLapInclineStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLapInclineStatistics parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapInclineStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLapInclineStatistics parseFrom(InputStream var0) {
      return (ExerciseLap$PbLapInclineStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLapInclineStatistics parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapInclineStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLapInclineStatistics parseFrom(byte[] var0) {
      return (ExerciseLap$PbLapInclineStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseLap$PbLapInclineStatistics parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapInclineStatistics)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseLap$PbLapInclineStatistics)) {
            var2 = super.equals(var1);
         } else {
            ExerciseLap$PbLapInclineStatistics var5 = (ExerciseLap$PbLapInclineStatistics)var1;
            boolean var3;
            if (this.hasMax() == var5.hasMax()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasMax()) {
               if (var3 && Float.floatToIntBits(this.getMax()) == Float.floatToIntBits(var5.getMax())) {
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

   public ExerciseLap$PbLapInclineStatistics getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public float getMax() {
      return this.max_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeFloatSize(1, this.max_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasMax() {
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
         if (this.hasMax()) {
            var1 = (var2 * 37 + 1) * 53 + Float.floatToIntBits(this.getMax());
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseLap.v().ensureFieldAccessorsInitialized(ExerciseLap$PbLapInclineStatistics.class, ExerciseLap$PbLapInclineStatistics$Builder.class);
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

   public ExerciseLap$PbLapInclineStatistics$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseLap$PbLapInclineStatistics$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseLap$PbLapInclineStatistics$Builder(var1, (ExerciseLap$1)null);
   }

   public ExerciseLap$PbLapInclineStatistics$Builder toBuilder() {
      ExerciseLap$PbLapInclineStatistics$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseLap$PbLapInclineStatistics$Builder((ExerciseLap$1)null);
      } else {
         var1 = (new ExerciseLap$PbLapInclineStatistics$Builder((ExerciseLap$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeFloat(1, this.max_);
      }

      this.unknownFields.writeTo(var1);
   }
}
