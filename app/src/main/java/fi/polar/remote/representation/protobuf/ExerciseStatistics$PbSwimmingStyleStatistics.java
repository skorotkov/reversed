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

public final class ExerciseStatistics$PbSwimmingStyleStatistics extends GeneratedMessageV3 implements ExerciseStatistics$PbSwimmingStyleStatisticsOrBuilder {
   public static final int AVERAGE_HEARTRATE_FIELD_NUMBER = 4;
   public static final int AVERAGE_SWOLF_FIELD_NUMBER = 6;
   private static final ExerciseStatistics$PbSwimmingStyleStatistics DEFAULT_INSTANCE = new ExerciseStatistics$PbSwimmingStyleStatistics();
   public static final int DISTANCE_FIELD_NUMBER = 1;
   public static final int MAXIMUM_HEARTRATE_FIELD_NUMBER = 5;
   @Deprecated
   public static final Parser PARSER = new ExerciseStatistics$PbSwimmingStyleStatistics$1();
   public static final int POOL_TIME_MIN_FIELD_NUMBER = 7;
   public static final int STROKE_COUNT_FIELD_NUMBER = 2;
   public static final int SWIMMING_TIME_TOTAL_FIELD_NUMBER = 3;
   private static final long serialVersionUID = 0L;
   private int averageHeartrate_;
   private float averageSwolf_;
   private int bitField0_;
   private float distance_;
   private int maximumHeartrate_;
   private byte memoizedIsInitialized;
   private Types$PbDuration poolTimeMin_;
   private int strokeCount_;
   private Types$PbDuration swimmingTimeTotal_;

   private ExerciseStatistics$PbSwimmingStyleStatistics() {
      this.memoizedIsInitialized = (byte)-1;
      this.distance_ = 0.0F;
      this.strokeCount_ = 0;
      this.averageHeartrate_ = 0;
      this.maximumHeartrate_ = 0;
      this.averageSwolf_ = 0.0F;
   }

   private ExerciseStatistics$PbSwimmingStyleStatistics(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseStatistics$PbSwimmingStyleStatistics(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseStatistics$1 var3) {
      this(var1, var2);
   }

   private ExerciseStatistics$PbSwimmingStyleStatistics(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseStatistics$PbSwimmingStyleStatistics(Builder var1, ExerciseStatistics$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(ExerciseStatistics$PbSwimmingStyleStatistics var0, float var1) {
      var0.distance_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(ExerciseStatistics$PbSwimmingStyleStatistics var0, int var1) {
      var0.strokeCount_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExerciseStatistics$PbSwimmingStyleStatistics var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbDuration a(ExerciseStatistics$PbSwimmingStyleStatistics var0, Types$PbDuration var1) {
      var0.swimmingTimeTotal_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static float b(ExerciseStatistics$PbSwimmingStyleStatistics var0, float var1) {
      var0.averageSwolf_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(ExerciseStatistics$PbSwimmingStyleStatistics var0, int var1) {
      var0.averageHeartrate_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration b(ExerciseStatistics$PbSwimmingStyleStatistics var0, Types$PbDuration var1) {
      var0.poolTimeMin_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(ExerciseStatistics$PbSwimmingStyleStatistics var0, int var1) {
      var0.maximumHeartrate_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int d(ExerciseStatistics$PbSwimmingStyleStatistics var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static ExerciseStatistics$PbSwimmingStyleStatistics getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseStatistics.a();
   }

   public static ExerciseStatistics$PbSwimmingStyleStatistics$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseStatistics$PbSwimmingStyleStatistics$Builder newBuilder(ExerciseStatistics$PbSwimmingStyleStatistics var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseStatistics$PbSwimmingStyleStatistics parseDelimitedFrom(InputStream var0) {
      return (ExerciseStatistics$PbSwimmingStyleStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseStatistics$PbSwimmingStyleStatistics parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbSwimmingStyleStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseStatistics$PbSwimmingStyleStatistics parseFrom(ByteString var0) {
      return (ExerciseStatistics$PbSwimmingStyleStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseStatistics$PbSwimmingStyleStatistics parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbSwimmingStyleStatistics)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseStatistics$PbSwimmingStyleStatistics parseFrom(CodedInputStream var0) {
      return (ExerciseStatistics$PbSwimmingStyleStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseStatistics$PbSwimmingStyleStatistics parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbSwimmingStyleStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseStatistics$PbSwimmingStyleStatistics parseFrom(InputStream var0) {
      return (ExerciseStatistics$PbSwimmingStyleStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseStatistics$PbSwimmingStyleStatistics parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbSwimmingStyleStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseStatistics$PbSwimmingStyleStatistics parseFrom(byte[] var0) {
      return (ExerciseStatistics$PbSwimmingStyleStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseStatistics$PbSwimmingStyleStatistics parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbSwimmingStyleStatistics)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseStatistics$PbSwimmingStyleStatistics)) {
            var2 = super.equals(var1);
         } else {
            ExerciseStatistics$PbSwimmingStyleStatistics var5 = (ExerciseStatistics$PbSwimmingStyleStatistics)var1;
            boolean var3;
            if (this.hasDistance() == var5.hasDistance()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasDistance()) {
               if (var3 && Float.floatToIntBits(this.getDistance()) == Float.floatToIntBits(var5.getDistance())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasStrokeCount() == var5.hasStrokeCount()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasStrokeCount()) {
               if (var4 && this.getStrokeCount() == var5.getStrokeCount()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasSwimmingTimeTotal() == var5.hasSwimmingTimeTotal()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSwimmingTimeTotal()) {
               if (var3 && this.getSwimmingTimeTotal().equals(var5.getSwimmingTimeTotal())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAverageHeartrate() == var5.hasAverageHeartrate()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasAverageHeartrate()) {
               if (var3 && this.getAverageHeartrate() == var5.getAverageHeartrate()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasMaximumHeartrate() == var5.hasMaximumHeartrate()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasMaximumHeartrate()) {
               if (var3 && this.getMaximumHeartrate() == var5.getMaximumHeartrate()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAverageSwolf() == var5.hasAverageSwolf()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAverageSwolf()) {
               if (var4 && Float.floatToIntBits(this.getAverageSwolf()) == Float.floatToIntBits(var5.getAverageSwolf())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasPoolTimeMin() == var5.hasPoolTimeMin()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasPoolTimeMin()) {
               if (var4 && this.getPoolTimeMin().equals(var5.getPoolTimeMin())) {
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

   public int getAverageHeartrate() {
      return this.averageHeartrate_;
   }

   public float getAverageSwolf() {
      return this.averageSwolf_;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public float getDistance() {
      return this.distance_;
   }

   public int getMaximumHeartrate() {
      return this.maximumHeartrate_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public Types$PbDuration getPoolTimeMin() {
      Types$PbDuration var1;
      if (this.poolTimeMin_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.poolTimeMin_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getPoolTimeMinOrBuilder() {
      Types$PbDuration var1;
      if (this.poolTimeMin_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.poolTimeMin_;
      }

      return var1;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeFloatSize(1, this.distance_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(2, this.strokeCount_);
         }

         var1 = var2;
         if ((this.bitField0_ & 4) == 4) {
            var1 = var2 + CodedOutputStream.computeMessageSize(3, this.getSwimmingTimeTotal());
         }

         var2 = var1;
         if ((this.bitField0_ & 8) == 8) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(4, this.averageHeartrate_);
         }

         var1 = var2;
         if ((this.bitField0_ & 16) == 16) {
            var1 = var2 + CodedOutputStream.computeUInt32Size(5, this.maximumHeartrate_);
         }

         var2 = var1;
         if ((this.bitField0_ & 32) == 32) {
            var2 = var1 + CodedOutputStream.computeFloatSize(6, this.averageSwolf_);
         }

         var1 = var2;
         if ((this.bitField0_ & 64) == 64) {
            var1 = var2 + CodedOutputStream.computeMessageSize(7, this.getPoolTimeMin());
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public int getStrokeCount() {
      return this.strokeCount_;
   }

   public Types$PbDuration getSwimmingTimeTotal() {
      Types$PbDuration var1;
      if (this.swimmingTimeTotal_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.swimmingTimeTotal_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getSwimmingTimeTotalOrBuilder() {
      Types$PbDuration var1;
      if (this.swimmingTimeTotal_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.swimmingTimeTotal_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasAverageHeartrate() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAverageSwolf() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDistance() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMaximumHeartrate() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPoolTimeMin() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStrokeCount() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSwimmingTimeTotal() {
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
         if (this.hasDistance()) {
            var1 = (var2 * 37 + 1) * 53 + Float.floatToIntBits(this.getDistance());
         }

         var2 = var1;
         if (this.hasStrokeCount()) {
            var2 = (var1 * 37 + 2) * 53 + this.getStrokeCount();
         }

         var1 = var2;
         if (this.hasSwimmingTimeTotal()) {
            var1 = (var2 * 37 + 3) * 53 + this.getSwimmingTimeTotal().hashCode();
         }

         int var3 = var1;
         if (this.hasAverageHeartrate()) {
            var3 = (var1 * 37 + 4) * 53 + this.getAverageHeartrate();
         }

         var2 = var3;
         if (this.hasMaximumHeartrate()) {
            var2 = (var3 * 37 + 5) * 53 + this.getMaximumHeartrate();
         }

         var1 = var2;
         if (this.hasAverageSwolf()) {
            var1 = (var2 * 37 + 6) * 53 + Float.floatToIntBits(this.getAverageSwolf());
         }

         var2 = var1;
         if (this.hasPoolTimeMin()) {
            var2 = (var1 * 37 + 7) * 53 + this.getPoolTimeMin().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseStatistics.b().ensureFieldAccessorsInitialized(ExerciseStatistics$PbSwimmingStyleStatistics.class, ExerciseStatistics$PbSwimmingStyleStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasDistance()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasStrokeCount()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseStatistics$PbSwimmingStyleStatistics$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseStatistics$PbSwimmingStyleStatistics$Builder(var1, (ExerciseStatistics$1)null);
   }

   public ExerciseStatistics$PbSwimmingStyleStatistics$Builder toBuilder() {
      ExerciseStatistics$PbSwimmingStyleStatistics$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseStatistics$PbSwimmingStyleStatistics$Builder((ExerciseStatistics$1)null);
      } else {
         var1 = (new ExerciseStatistics$PbSwimmingStyleStatistics$Builder((ExerciseStatistics$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeFloat(1, this.distance_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeUInt32(2, this.strokeCount_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getSwimmingTimeTotal());
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeUInt32(4, this.averageHeartrate_);
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeUInt32(5, this.maximumHeartrate_);
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeFloat(6, this.averageSwolf_);
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeMessage(7, this.getPoolTimeMin());
      }

      this.unknownFields.writeTo(var1);
   }
}
