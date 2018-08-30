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

public final class ExerciseLap$PbLapTrainingPeaksStatistics extends GeneratedMessageV3 implements ExerciseLap$PbLapTrainingPeaksStatisticsOrBuilder {
   private static final ExerciseLap$PbLapTrainingPeaksStatistics DEFAULT_INSTANCE = new ExerciseLap$PbLapTrainingPeaksStatistics();
   public static final int INTENSITY_FACTOR_FIELD_NUMBER = 2;
   public static final int NORMALIZED_POWER_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new ExerciseLap$PbLapTrainingPeaksStatistics$1();
   public static final int TRAINING_STRESS_SCORE_FIELD_NUMBER = 3;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private float intensityFactor_;
   private byte memoizedIsInitialized;
   private int normalizedPower_;
   private float trainingStressScore_;

   private ExerciseLap$PbLapTrainingPeaksStatistics() {
      this.memoizedIsInitialized = (byte)-1;
      this.normalizedPower_ = 0;
      this.intensityFactor_ = 0.0F;
      this.trainingStressScore_ = 0.0F;
   }

   private ExerciseLap$PbLapTrainingPeaksStatistics(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseLap$PbLapTrainingPeaksStatistics(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseLap$1 var3) {
      this(var1, var2);
   }

   private ExerciseLap$PbLapTrainingPeaksStatistics(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseLap$PbLapTrainingPeaksStatistics(Builder var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(ExerciseLap$PbLapTrainingPeaksStatistics var0, float var1) {
      var0.intensityFactor_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(ExerciseLap$PbLapTrainingPeaksStatistics var0, int var1) {
      var0.normalizedPower_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExerciseLap$PbLapTrainingPeaksStatistics var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static float b(ExerciseLap$PbLapTrainingPeaksStatistics var0, float var1) {
      var0.trainingStressScore_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(ExerciseLap$PbLapTrainingPeaksStatistics var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static ExerciseLap$PbLapTrainingPeaksStatistics getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.s();
   }

   public static ExerciseLap$PbLapTrainingPeaksStatistics$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseLap$PbLapTrainingPeaksStatistics$Builder newBuilder(ExerciseLap$PbLapTrainingPeaksStatistics var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseLap$PbLapTrainingPeaksStatistics parseDelimitedFrom(InputStream var0) {
      return (ExerciseLap$PbLapTrainingPeaksStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLapTrainingPeaksStatistics parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapTrainingPeaksStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLapTrainingPeaksStatistics parseFrom(ByteString var0) {
      return (ExerciseLap$PbLapTrainingPeaksStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseLap$PbLapTrainingPeaksStatistics parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapTrainingPeaksStatistics)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseLap$PbLapTrainingPeaksStatistics parseFrom(CodedInputStream var0) {
      return (ExerciseLap$PbLapTrainingPeaksStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLapTrainingPeaksStatistics parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapTrainingPeaksStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLapTrainingPeaksStatistics parseFrom(InputStream var0) {
      return (ExerciseLap$PbLapTrainingPeaksStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLapTrainingPeaksStatistics parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapTrainingPeaksStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLapTrainingPeaksStatistics parseFrom(byte[] var0) {
      return (ExerciseLap$PbLapTrainingPeaksStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseLap$PbLapTrainingPeaksStatistics parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapTrainingPeaksStatistics)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseLap$PbLapTrainingPeaksStatistics)) {
            var2 = super.equals(var1);
         } else {
            ExerciseLap$PbLapTrainingPeaksStatistics var5 = (ExerciseLap$PbLapTrainingPeaksStatistics)var1;
            boolean var3;
            if (this.hasNormalizedPower() == var5.hasNormalizedPower()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasNormalizedPower()) {
               if (var3 && this.getNormalizedPower() == var5.getNormalizedPower()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasIntensityFactor() == var5.hasIntensityFactor()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasIntensityFactor()) {
               if (var3 && Float.floatToIntBits(this.getIntensityFactor()) == Float.floatToIntBits(var5.getIntensityFactor())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTrainingStressScore() == var5.hasTrainingStressScore()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasTrainingStressScore()) {
               if (var4 && Float.floatToIntBits(this.getTrainingStressScore()) == Float.floatToIntBits(var5.getTrainingStressScore())) {
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

   public ExerciseLap$PbLapTrainingPeaksStatistics getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public float getIntensityFactor() {
      return this.intensityFactor_;
   }

   public int getNormalizedPower() {
      return this.normalizedPower_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeUInt32Size(1, this.normalizedPower_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeFloatSize(2, this.intensityFactor_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeFloatSize(3, this.trainingStressScore_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public float getTrainingStressScore() {
      return this.trainingStressScore_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasIntensityFactor() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasNormalizedPower() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTrainingStressScore() {
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
         if (this.hasNormalizedPower()) {
            var1 = (var2 * 37 + 1) * 53 + this.getNormalizedPower();
         }

         var2 = var1;
         if (this.hasIntensityFactor()) {
            var2 = (var1 * 37 + 2) * 53 + Float.floatToIntBits(this.getIntensityFactor());
         }

         var1 = var2;
         if (this.hasTrainingStressScore()) {
            var1 = (var2 * 37 + 3) * 53 + Float.floatToIntBits(this.getTrainingStressScore());
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseLap.t().ensureFieldAccessorsInitialized(ExerciseLap$PbLapTrainingPeaksStatistics.class, ExerciseLap$PbLapTrainingPeaksStatistics$Builder.class);
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

   public ExerciseLap$PbLapTrainingPeaksStatistics$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseLap$PbLapTrainingPeaksStatistics$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseLap$PbLapTrainingPeaksStatistics$Builder(var1, (ExerciseLap$1)null);
   }

   public ExerciseLap$PbLapTrainingPeaksStatistics$Builder toBuilder() {
      ExerciseLap$PbLapTrainingPeaksStatistics$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseLap$PbLapTrainingPeaksStatistics$Builder((ExerciseLap$1)null);
      } else {
         var1 = (new ExerciseLap$PbLapTrainingPeaksStatistics$Builder((ExerciseLap$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.normalizedPower_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeFloat(2, this.intensityFactor_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeFloat(3, this.trainingStressScore_);
      }

      this.unknownFields.writeTo(var1);
   }
}
