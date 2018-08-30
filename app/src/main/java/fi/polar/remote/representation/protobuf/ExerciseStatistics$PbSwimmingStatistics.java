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

public final class ExerciseStatistics$PbSwimmingStatistics extends GeneratedMessageV3 implements ExerciseStatistics$PbSwimmingStatisticsOrBuilder {
   public static final int BACKSTROKE_STATISTICS_FIELD_NUMBER = 3;
   public static final int BREASTSTROKE_STATISTICS_FIELD_NUMBER = 4;
   public static final int BUTTERFLY_STATISTICS_FIELD_NUMBER = 5;
   private static final ExerciseStatistics$PbSwimmingStatistics DEFAULT_INSTANCE = new ExerciseStatistics$PbSwimmingStatistics();
   public static final int FREESTYLE_STATISTICS_FIELD_NUMBER = 2;
   public static final int NUMBER_OF_POOLS_SWIMMED_FIELD_NUMBER = 7;
   @Deprecated
   public static final Parser PARSER = new ExerciseStatistics$PbSwimmingStatistics$1();
   public static final int SWIMMING_DISTANCE_FIELD_NUMBER = 1;
   public static final int SWIMMING_POOL_FIELD_NUMBER = 8;
   public static final int TOTAL_STROKE_COUNT_FIELD_NUMBER = 6;
   private static final long serialVersionUID = 0L;
   private ExerciseStatistics$PbSwimmingStyleStatistics backstrokeStatistics_;
   private int bitField0_;
   private ExerciseStatistics$PbSwimmingStyleStatistics breaststrokeStatistics_;
   private ExerciseStatistics$PbSwimmingStyleStatistics butterflyStatistics_;
   private ExerciseStatistics$PbSwimmingStyleStatistics freestyleStatistics_;
   private byte memoizedIsInitialized;
   private int numberOfPoolsSwimmed_;
   private float swimmingDistance_;
   private Structures$PbSwimmingPoolInfo swimmingPool_;
   private int totalStrokeCount_;

   private ExerciseStatistics$PbSwimmingStatistics() {
      this.memoizedIsInitialized = (byte)-1;
      this.swimmingDistance_ = 0.0F;
      this.totalStrokeCount_ = 0;
      this.numberOfPoolsSwimmed_ = 0;
   }

   private ExerciseStatistics$PbSwimmingStatistics(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseStatistics$PbSwimmingStatistics(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseStatistics$1 var3) {
      this(var1, var2);
   }

   private ExerciseStatistics$PbSwimmingStatistics(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseStatistics$PbSwimmingStatistics(Builder var1, ExerciseStatistics$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(ExerciseStatistics$PbSwimmingStatistics var0, float var1) {
      var0.swimmingDistance_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(ExerciseStatistics$PbSwimmingStatistics var0, int var1) {
      var0.totalStrokeCount_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExerciseStatistics$PbSwimmingStatistics var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static ExerciseStatistics$PbSwimmingStyleStatistics a(ExerciseStatistics$PbSwimmingStatistics var0, ExerciseStatistics$PbSwimmingStyleStatistics var1) {
      var0.freestyleStatistics_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbSwimmingPoolInfo a(ExerciseStatistics$PbSwimmingStatistics var0, Structures$PbSwimmingPoolInfo var1) {
      var0.swimmingPool_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(ExerciseStatistics$PbSwimmingStatistics var0, int var1) {
      var0.numberOfPoolsSwimmed_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseStatistics$PbSwimmingStyleStatistics b(ExerciseStatistics$PbSwimmingStatistics var0, ExerciseStatistics$PbSwimmingStyleStatistics var1) {
      var0.backstrokeStatistics_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(ExerciseStatistics$PbSwimmingStatistics var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseStatistics$PbSwimmingStyleStatistics c(ExerciseStatistics$PbSwimmingStatistics var0, ExerciseStatistics$PbSwimmingStyleStatistics var1) {
      var0.breaststrokeStatistics_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseStatistics$PbSwimmingStyleStatistics d(ExerciseStatistics$PbSwimmingStatistics var0, ExerciseStatistics$PbSwimmingStyleStatistics var1) {
      var0.butterflyStatistics_ = var1;
      return var1;
   }

   public static ExerciseStatistics$PbSwimmingStatistics getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseStatistics.c();
   }

   public static ExerciseStatistics$PbSwimmingStatistics$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseStatistics$PbSwimmingStatistics$Builder newBuilder(ExerciseStatistics$PbSwimmingStatistics var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseStatistics$PbSwimmingStatistics parseDelimitedFrom(InputStream var0) {
      return (ExerciseStatistics$PbSwimmingStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseStatistics$PbSwimmingStatistics parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbSwimmingStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseStatistics$PbSwimmingStatistics parseFrom(ByteString var0) {
      return (ExerciseStatistics$PbSwimmingStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseStatistics$PbSwimmingStatistics parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbSwimmingStatistics)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseStatistics$PbSwimmingStatistics parseFrom(CodedInputStream var0) {
      return (ExerciseStatistics$PbSwimmingStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseStatistics$PbSwimmingStatistics parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbSwimmingStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseStatistics$PbSwimmingStatistics parseFrom(InputStream var0) {
      return (ExerciseStatistics$PbSwimmingStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseStatistics$PbSwimmingStatistics parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbSwimmingStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseStatistics$PbSwimmingStatistics parseFrom(byte[] var0) {
      return (ExerciseStatistics$PbSwimmingStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseStatistics$PbSwimmingStatistics parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbSwimmingStatistics)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseStatistics$PbSwimmingStatistics)) {
            var2 = super.equals(var1);
         } else {
            ExerciseStatistics$PbSwimmingStatistics var5 = (ExerciseStatistics$PbSwimmingStatistics)var1;
            boolean var3;
            if (this.hasSwimmingDistance() == var5.hasSwimmingDistance()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasSwimmingDistance()) {
               if (var3 && Float.floatToIntBits(this.getSwimmingDistance()) == Float.floatToIntBits(var5.getSwimmingDistance())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasFreestyleStatistics() == var5.hasFreestyleStatistics()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasFreestyleStatistics()) {
               if (var4 && this.getFreestyleStatistics().equals(var5.getFreestyleStatistics())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasBackstrokeStatistics() == var5.hasBackstrokeStatistics()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasBackstrokeStatistics()) {
               if (var3 && this.getBackstrokeStatistics().equals(var5.getBackstrokeStatistics())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasBreaststrokeStatistics() == var5.hasBreaststrokeStatistics()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasBreaststrokeStatistics()) {
               if (var3 && this.getBreaststrokeStatistics().equals(var5.getBreaststrokeStatistics())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasButterflyStatistics() == var5.hasButterflyStatistics()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasButterflyStatistics()) {
               if (var3 && this.getButterflyStatistics().equals(var5.getButterflyStatistics())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTotalStrokeCount() == var5.hasTotalStrokeCount()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasTotalStrokeCount()) {
               if (var3 && this.getTotalStrokeCount() == var5.getTotalStrokeCount()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasNumberOfPoolsSwimmed() == var5.hasNumberOfPoolsSwimmed()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasNumberOfPoolsSwimmed()) {
               if (var4 && this.getNumberOfPoolsSwimmed() == var5.getNumberOfPoolsSwimmed()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasSwimmingPool() == var5.hasSwimmingPool()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSwimmingPool()) {
               if (var3 && this.getSwimmingPool().equals(var5.getSwimmingPool())) {
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

   public ExerciseStatistics$PbSwimmingStyleStatistics getBackstrokeStatistics() {
      ExerciseStatistics$PbSwimmingStyleStatistics var1;
      if (this.backstrokeStatistics_ == null) {
         var1 = ExerciseStatistics$PbSwimmingStyleStatistics.getDefaultInstance();
      } else {
         var1 = this.backstrokeStatistics_;
      }

      return var1;
   }

   public ExerciseStatistics$PbSwimmingStyleStatisticsOrBuilder getBackstrokeStatisticsOrBuilder() {
      ExerciseStatistics$PbSwimmingStyleStatistics var1;
      if (this.backstrokeStatistics_ == null) {
         var1 = ExerciseStatistics$PbSwimmingStyleStatistics.getDefaultInstance();
      } else {
         var1 = this.backstrokeStatistics_;
      }

      return var1;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics getBreaststrokeStatistics() {
      ExerciseStatistics$PbSwimmingStyleStatistics var1;
      if (this.breaststrokeStatistics_ == null) {
         var1 = ExerciseStatistics$PbSwimmingStyleStatistics.getDefaultInstance();
      } else {
         var1 = this.breaststrokeStatistics_;
      }

      return var1;
   }

   public ExerciseStatistics$PbSwimmingStyleStatisticsOrBuilder getBreaststrokeStatisticsOrBuilder() {
      ExerciseStatistics$PbSwimmingStyleStatistics var1;
      if (this.breaststrokeStatistics_ == null) {
         var1 = ExerciseStatistics$PbSwimmingStyleStatistics.getDefaultInstance();
      } else {
         var1 = this.breaststrokeStatistics_;
      }

      return var1;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics getButterflyStatistics() {
      ExerciseStatistics$PbSwimmingStyleStatistics var1;
      if (this.butterflyStatistics_ == null) {
         var1 = ExerciseStatistics$PbSwimmingStyleStatistics.getDefaultInstance();
      } else {
         var1 = this.butterflyStatistics_;
      }

      return var1;
   }

   public ExerciseStatistics$PbSwimmingStyleStatisticsOrBuilder getButterflyStatisticsOrBuilder() {
      ExerciseStatistics$PbSwimmingStyleStatistics var1;
      if (this.butterflyStatistics_ == null) {
         var1 = ExerciseStatistics$PbSwimmingStyleStatistics.getDefaultInstance();
      } else {
         var1 = this.butterflyStatistics_;
      }

      return var1;
   }

   public ExerciseStatistics$PbSwimmingStatistics getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics getFreestyleStatistics() {
      ExerciseStatistics$PbSwimmingStyleStatistics var1;
      if (this.freestyleStatistics_ == null) {
         var1 = ExerciseStatistics$PbSwimmingStyleStatistics.getDefaultInstance();
      } else {
         var1 = this.freestyleStatistics_;
      }

      return var1;
   }

   public ExerciseStatistics$PbSwimmingStyleStatisticsOrBuilder getFreestyleStatisticsOrBuilder() {
      ExerciseStatistics$PbSwimmingStyleStatistics var1;
      if (this.freestyleStatistics_ == null) {
         var1 = ExerciseStatistics$PbSwimmingStyleStatistics.getDefaultInstance();
      } else {
         var1 = this.freestyleStatistics_;
      }

      return var1;
   }

   public int getNumberOfPoolsSwimmed() {
      return this.numberOfPoolsSwimmed_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeFloatSize(1, this.swimmingDistance_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeMessageSize(2, this.getFreestyleStatistics());
         }

         var1 = var2;
         if ((this.bitField0_ & 4) == 4) {
            var1 = var2 + CodedOutputStream.computeMessageSize(3, this.getBackstrokeStatistics());
         }

         var2 = var1;
         if ((this.bitField0_ & 8) == 8) {
            var2 = var1 + CodedOutputStream.computeMessageSize(4, this.getBreaststrokeStatistics());
         }

         var1 = var2;
         if ((this.bitField0_ & 16) == 16) {
            var1 = var2 + CodedOutputStream.computeMessageSize(5, this.getButterflyStatistics());
         }

         var2 = var1;
         if ((this.bitField0_ & 32) == 32) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(6, this.totalStrokeCount_);
         }

         var1 = var2;
         if ((this.bitField0_ & 64) == 64) {
            var1 = var2 + CodedOutputStream.computeUInt32Size(7, this.numberOfPoolsSwimmed_);
         }

         var2 = var1;
         if ((this.bitField0_ & 128) == 128) {
            var2 = var1 + CodedOutputStream.computeMessageSize(8, this.getSwimmingPool());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public float getSwimmingDistance() {
      return this.swimmingDistance_;
   }

   public Structures$PbSwimmingPoolInfo getSwimmingPool() {
      Structures$PbSwimmingPoolInfo var1;
      if (this.swimmingPool_ == null) {
         var1 = Structures$PbSwimmingPoolInfo.getDefaultInstance();
      } else {
         var1 = this.swimmingPool_;
      }

      return var1;
   }

   public Structures$PbSwimmingPoolInfoOrBuilder getSwimmingPoolOrBuilder() {
      Structures$PbSwimmingPoolInfo var1;
      if (this.swimmingPool_ == null) {
         var1 = Structures$PbSwimmingPoolInfo.getDefaultInstance();
      } else {
         var1 = this.swimmingPool_;
      }

      return var1;
   }

   public int getTotalStrokeCount() {
      return this.totalStrokeCount_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasBackstrokeStatistics() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasBreaststrokeStatistics() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasButterflyStatistics() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasFreestyleStatistics() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasNumberOfPoolsSwimmed() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSwimmingDistance() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSwimmingPool() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTotalStrokeCount() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
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
         if (this.hasSwimmingDistance()) {
            var1 = (var2 * 37 + 1) * 53 + Float.floatToIntBits(this.getSwimmingDistance());
         }

         var2 = var1;
         if (this.hasFreestyleStatistics()) {
            var2 = (var1 * 37 + 2) * 53 + this.getFreestyleStatistics().hashCode();
         }

         var1 = var2;
         if (this.hasBackstrokeStatistics()) {
            var1 = (var2 * 37 + 3) * 53 + this.getBackstrokeStatistics().hashCode();
         }

         var2 = var1;
         if (this.hasBreaststrokeStatistics()) {
            var2 = (var1 * 37 + 4) * 53 + this.getBreaststrokeStatistics().hashCode();
         }

         var1 = var2;
         if (this.hasButterflyStatistics()) {
            var1 = (var2 * 37 + 5) * 53 + this.getButterflyStatistics().hashCode();
         }

         var2 = var1;
         if (this.hasTotalStrokeCount()) {
            var2 = (var1 * 37 + 6) * 53 + this.getTotalStrokeCount();
         }

         var1 = var2;
         if (this.hasNumberOfPoolsSwimmed()) {
            var1 = (var2 * 37 + 7) * 53 + this.getNumberOfPoolsSwimmed();
         }

         var2 = var1;
         if (this.hasSwimmingPool()) {
            var2 = (var1 * 37 + 8) * 53 + this.getSwimmingPool().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseStatistics.d().ensureFieldAccessorsInitialized(ExerciseStatistics$PbSwimmingStatistics.class, ExerciseStatistics$PbSwimmingStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasSwimmingDistance()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasFreestyleStatistics() && !this.getFreestyleStatistics().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasBackstrokeStatistics() && !this.getBackstrokeStatistics().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasBreaststrokeStatistics() && !this.getBreaststrokeStatistics().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasButterflyStatistics() && !this.getButterflyStatistics().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasSwimmingPool() && !this.getSwimmingPool().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseStatistics$PbSwimmingStatistics$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseStatistics$PbSwimmingStatistics$Builder(var1, (ExerciseStatistics$1)null);
   }

   public ExerciseStatistics$PbSwimmingStatistics$Builder toBuilder() {
      ExerciseStatistics$PbSwimmingStatistics$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseStatistics$PbSwimmingStatistics$Builder((ExerciseStatistics$1)null);
      } else {
         var1 = (new ExerciseStatistics$PbSwimmingStatistics$Builder((ExerciseStatistics$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeFloat(1, this.swimmingDistance_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getFreestyleStatistics());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getBackstrokeStatistics());
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeMessage(4, this.getBreaststrokeStatistics());
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeMessage(5, this.getButterflyStatistics());
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeUInt32(6, this.totalStrokeCount_);
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeUInt32(7, this.numberOfPoolsSwimmed_);
      }

      if ((this.bitField0_ & 128) == 128) {
         var1.writeMessage(8, this.getSwimmingPool());
      }

      this.unknownFields.writeTo(var1);
   }
}
