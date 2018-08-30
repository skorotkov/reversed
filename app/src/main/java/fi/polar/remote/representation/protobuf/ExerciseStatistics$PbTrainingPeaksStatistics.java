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

public final class ExerciseStatistics$PbTrainingPeaksStatistics extends GeneratedMessageV3 implements ExerciseStatistics$PbTrainingPeaksStatisticsOrBuilder {
   private static final ExerciseStatistics$PbTrainingPeaksStatistics DEFAULT_INSTANCE = new ExerciseStatistics$PbTrainingPeaksStatistics();
   public static final int INTENSITY_FACTOR_FIELD_NUMBER = 2;
   public static final int NORMALIZED_POWER_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new ExerciseStatistics$PbTrainingPeaksStatistics$1();
   public static final int TRAINING_STRESS_SCORE_FIELD_NUMBER = 3;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private float intensityFactor_;
   private byte memoizedIsInitialized;
   private int normalizedPower_;
   private float trainingStressScore_;

   private ExerciseStatistics$PbTrainingPeaksStatistics() {
      this.memoizedIsInitialized = (byte)-1;
      this.normalizedPower_ = 0;
      this.intensityFactor_ = 0.0F;
      this.trainingStressScore_ = 0.0F;
   }

   private ExerciseStatistics$PbTrainingPeaksStatistics(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseStatistics$PbTrainingPeaksStatistics(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseStatistics$1 var3) {
      this(var1, var2);
   }

   private ExerciseStatistics$PbTrainingPeaksStatistics(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseStatistics$PbTrainingPeaksStatistics(Builder var1, ExerciseStatistics$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(ExerciseStatistics$PbTrainingPeaksStatistics var0, float var1) {
      var0.intensityFactor_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(ExerciseStatistics$PbTrainingPeaksStatistics var0, int var1) {
      var0.normalizedPower_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExerciseStatistics$PbTrainingPeaksStatistics var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static float b(ExerciseStatistics$PbTrainingPeaksStatistics var0, float var1) {
      var0.trainingStressScore_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(ExerciseStatistics$PbTrainingPeaksStatistics var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static ExerciseStatistics$PbTrainingPeaksStatistics getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseStatistics.u();
   }

   public static ExerciseStatistics$PbTrainingPeaksStatistics$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseStatistics$PbTrainingPeaksStatistics$Builder newBuilder(ExerciseStatistics$PbTrainingPeaksStatistics var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseStatistics$PbTrainingPeaksStatistics parseDelimitedFrom(InputStream var0) {
      return (ExerciseStatistics$PbTrainingPeaksStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseStatistics$PbTrainingPeaksStatistics parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbTrainingPeaksStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseStatistics$PbTrainingPeaksStatistics parseFrom(ByteString var0) {
      return (ExerciseStatistics$PbTrainingPeaksStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseStatistics$PbTrainingPeaksStatistics parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbTrainingPeaksStatistics)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseStatistics$PbTrainingPeaksStatistics parseFrom(CodedInputStream var0) {
      return (ExerciseStatistics$PbTrainingPeaksStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseStatistics$PbTrainingPeaksStatistics parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbTrainingPeaksStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseStatistics$PbTrainingPeaksStatistics parseFrom(InputStream var0) {
      return (ExerciseStatistics$PbTrainingPeaksStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseStatistics$PbTrainingPeaksStatistics parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbTrainingPeaksStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseStatistics$PbTrainingPeaksStatistics parseFrom(byte[] var0) {
      return (ExerciseStatistics$PbTrainingPeaksStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseStatistics$PbTrainingPeaksStatistics parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbTrainingPeaksStatistics)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseStatistics$PbTrainingPeaksStatistics)) {
            var2 = super.equals(var1);
         } else {
            ExerciseStatistics$PbTrainingPeaksStatistics var5 = (ExerciseStatistics$PbTrainingPeaksStatistics)var1;
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
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasTrainingStressScore()) {
               if (var3 && Float.floatToIntBits(this.getTrainingStressScore()) == Float.floatToIntBits(var5.getTrainingStressScore())) {
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

   public ExerciseStatistics$PbTrainingPeaksStatistics getDefaultInstanceForType() {
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
      return ExerciseStatistics.v().ensureFieldAccessorsInitialized(ExerciseStatistics$PbTrainingPeaksStatistics.class, ExerciseStatistics$PbTrainingPeaksStatistics$Builder.class);
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

   public ExerciseStatistics$PbTrainingPeaksStatistics$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseStatistics$PbTrainingPeaksStatistics$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseStatistics$PbTrainingPeaksStatistics$Builder(var1, (ExerciseStatistics$1)null);
   }

   public ExerciseStatistics$PbTrainingPeaksStatistics$Builder toBuilder() {
      ExerciseStatistics$PbTrainingPeaksStatistics$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseStatistics$PbTrainingPeaksStatistics$Builder((ExerciseStatistics$1)null);
      } else {
         var1 = (new ExerciseStatistics$PbTrainingPeaksStatistics$Builder((ExerciseStatistics$1)null)).mergeFrom(this);
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
