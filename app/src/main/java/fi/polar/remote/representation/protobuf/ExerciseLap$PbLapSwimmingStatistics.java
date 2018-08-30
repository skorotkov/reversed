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

public final class ExerciseLap$PbLapSwimmingStatistics extends GeneratedMessageV3 implements ExerciseLap$PbLapSwimmingStatisticsOrBuilder {
   public static final int AVG_DURATION_OF_POOL_FIELD_NUMBER = 3;
   private static final ExerciseLap$PbLapSwimmingStatistics DEFAULT_INSTANCE = new ExerciseLap$PbLapSwimmingStatistics();
   public static final int LAP_STROKES_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new ExerciseLap$PbLapSwimmingStatistics$1();
   public static final int POOL_COUNT_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private float avgDurationOfPool_;
   private int bitField0_;
   private int lapStrokes_;
   private byte memoizedIsInitialized;
   private int poolCount_;

   private ExerciseLap$PbLapSwimmingStatistics() {
      this.memoizedIsInitialized = (byte)-1;
      this.lapStrokes_ = 0;
      this.poolCount_ = 0;
      this.avgDurationOfPool_ = 0.0F;
   }

   private ExerciseLap$PbLapSwimmingStatistics(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseLap$PbLapSwimmingStatistics(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseLap$1 var3) {
      this(var1, var2);
   }

   private ExerciseLap$PbLapSwimmingStatistics(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseLap$PbLapSwimmingStatistics(Builder var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(ExerciseLap$PbLapSwimmingStatistics var0, float var1) {
      var0.avgDurationOfPool_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(ExerciseLap$PbLapSwimmingStatistics var0, int var1) {
      var0.lapStrokes_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExerciseLap$PbLapSwimmingStatistics var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(ExerciseLap$PbLapSwimmingStatistics var0, int var1) {
      var0.poolCount_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(ExerciseLap$PbLapSwimmingStatistics var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static ExerciseLap$PbLapSwimmingStatistics getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.c();
   }

   public static ExerciseLap$PbLapSwimmingStatistics$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseLap$PbLapSwimmingStatistics$Builder newBuilder(ExerciseLap$PbLapSwimmingStatistics var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseLap$PbLapSwimmingStatistics parseDelimitedFrom(InputStream var0) {
      return (ExerciseLap$PbLapSwimmingStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLapSwimmingStatistics parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapSwimmingStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLapSwimmingStatistics parseFrom(ByteString var0) {
      return (ExerciseLap$PbLapSwimmingStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseLap$PbLapSwimmingStatistics parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapSwimmingStatistics)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseLap$PbLapSwimmingStatistics parseFrom(CodedInputStream var0) {
      return (ExerciseLap$PbLapSwimmingStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLapSwimmingStatistics parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapSwimmingStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLapSwimmingStatistics parseFrom(InputStream var0) {
      return (ExerciseLap$PbLapSwimmingStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLapSwimmingStatistics parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapSwimmingStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLapSwimmingStatistics parseFrom(byte[] var0) {
      return (ExerciseLap$PbLapSwimmingStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseLap$PbLapSwimmingStatistics parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapSwimmingStatistics)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseLap$PbLapSwimmingStatistics)) {
            var2 = super.equals(var1);
         } else {
            ExerciseLap$PbLapSwimmingStatistics var5 = (ExerciseLap$PbLapSwimmingStatistics)var1;
            boolean var3;
            if (this.hasLapStrokes() == var5.hasLapStrokes()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasLapStrokes()) {
               if (var3 && this.getLapStrokes() == var5.getLapStrokes()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasPoolCount() == var5.hasPoolCount()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasPoolCount()) {
               if (var3 && this.getPoolCount() == var5.getPoolCount()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAvgDurationOfPool() == var5.hasAvgDurationOfPool()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAvgDurationOfPool()) {
               if (var4 && Float.floatToIntBits(this.getAvgDurationOfPool()) == Float.floatToIntBits(var5.getAvgDurationOfPool())) {
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

   public float getAvgDurationOfPool() {
      return this.avgDurationOfPool_;
   }

   public ExerciseLap$PbLapSwimmingStatistics getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public int getLapStrokes() {
      return this.lapStrokes_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getPoolCount() {
      return this.poolCount_;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeUInt32Size(1, this.lapStrokes_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeUInt32Size(2, this.poolCount_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeFloatSize(3, this.avgDurationOfPool_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasAvgDurationOfPool() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLapStrokes() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPoolCount() {
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
         var1 = this.getDescriptorForType().hashCode() + 779;
         int var2 = var1;
         if (this.hasLapStrokes()) {
            var2 = (var1 * 37 + 1) * 53 + this.getLapStrokes();
         }

         var1 = var2;
         if (this.hasPoolCount()) {
            var1 = (var2 * 37 + 2) * 53 + this.getPoolCount();
         }

         var2 = var1;
         if (this.hasAvgDurationOfPool()) {
            var2 = (var1 * 37 + 3) * 53 + Float.floatToIntBits(this.getAvgDurationOfPool());
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseLap.d().ensureFieldAccessorsInitialized(ExerciseLap$PbLapSwimmingStatistics.class, ExerciseLap$PbLapSwimmingStatistics$Builder.class);
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

   public ExerciseLap$PbLapSwimmingStatistics$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseLap$PbLapSwimmingStatistics$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseLap$PbLapSwimmingStatistics$Builder(var1, (ExerciseLap$1)null);
   }

   public ExerciseLap$PbLapSwimmingStatistics$Builder toBuilder() {
      ExerciseLap$PbLapSwimmingStatistics$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseLap$PbLapSwimmingStatistics$Builder((ExerciseLap$1)null);
      } else {
         var1 = (new ExerciseLap$PbLapSwimmingStatistics$Builder((ExerciseLap$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.lapStrokes_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeUInt32(2, this.poolCount_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeFloat(3, this.avgDurationOfPool_);
      }

      this.unknownFields.writeTo(var1);
   }
}
