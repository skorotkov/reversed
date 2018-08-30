package fi.polar.remote.representation.protobuf;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class ExerciseLap$PbLapTrainingPeaksStatistics$Builder extends Builder implements ExerciseLap$PbLapTrainingPeaksStatisticsOrBuilder {
   private int bitField0_;
   private float intensityFactor_;
   private int normalizedPower_;
   private float trainingStressScore_;

   private ExerciseLap$PbLapTrainingPeaksStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExerciseLap$PbLapTrainingPeaksStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseLap$PbLapTrainingPeaksStatistics$Builder(BuilderParent var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseLap$PbLapTrainingPeaksStatistics$Builder(ExerciseLap$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.s();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseLap$PbLapTrainingPeaksStatistics.b()) {
      }

   }

   public ExerciseLap$PbLapTrainingPeaksStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapTrainingPeaksStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseLap$PbLapTrainingPeaksStatistics build() {
      ExerciseLap$PbLapTrainingPeaksStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseLap$PbLapTrainingPeaksStatistics buildPartial() {
      byte var1 = 1;
      ExerciseLap$PbLapTrainingPeaksStatistics var2 = new ExerciseLap$PbLapTrainingPeaksStatistics(this, (ExerciseLap$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ExerciseLap$PbLapTrainingPeaksStatistics.a(var2, this.normalizedPower_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      ExerciseLap$PbLapTrainingPeaksStatistics.a(var2, this.intensityFactor_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      ExerciseLap$PbLapTrainingPeaksStatistics.b(var2, this.trainingStressScore_);
      ExerciseLap$PbLapTrainingPeaksStatistics.b(var2, var5);
      this.onBuilt();
      return var2;
   }

   public ExerciseLap$PbLapTrainingPeaksStatistics$Builder clear() {
      super.clear();
      this.normalizedPower_ = 0;
      this.bitField0_ &= -2;
      this.intensityFactor_ = 0.0F;
      this.bitField0_ &= -3;
      this.trainingStressScore_ = 0.0F;
      this.bitField0_ &= -5;
      return this;
   }

   public ExerciseLap$PbLapTrainingPeaksStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseLap$PbLapTrainingPeaksStatistics$Builder)super.clearField(var1);
   }

   public ExerciseLap$PbLapTrainingPeaksStatistics$Builder clearIntensityFactor() {
      this.bitField0_ &= -3;
      this.intensityFactor_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapTrainingPeaksStatistics$Builder clearNormalizedPower() {
      this.bitField0_ &= -2;
      this.normalizedPower_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapTrainingPeaksStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseLap$PbLapTrainingPeaksStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseLap$PbLapTrainingPeaksStatistics$Builder clearTrainingStressScore() {
      this.bitField0_ &= -5;
      this.trainingStressScore_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapTrainingPeaksStatistics$Builder clone() {
      return (ExerciseLap$PbLapTrainingPeaksStatistics$Builder)super.clone();
   }

   public ExerciseLap$PbLapTrainingPeaksStatistics getDefaultInstanceForType() {
      return ExerciseLap$PbLapTrainingPeaksStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseLap.s();
   }

   public float getIntensityFactor() {
      return this.intensityFactor_;
   }

   public int getNormalizedPower() {
      return this.normalizedPower_;
   }

   public float getTrainingStressScore() {
      return this.trainingStressScore_;
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

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseLap.t().ensureFieldAccessorsInitialized(ExerciseLap$PbLapTrainingPeaksStatistics.class, ExerciseLap$PbLapTrainingPeaksStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExerciseLap$PbLapTrainingPeaksStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseLap$PbLapTrainingPeaksStatistics var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (ExerciseLap$PbLapTrainingPeaksStatistics)ExerciseLap$PbLapTrainingPeaksStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (ExerciseLap$PbLapTrainingPeaksStatistics)var11.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var14.unwrapIOException();
         } catch (Throwable var10) {
            if (var13 != null) {
               this.mergeFrom(var13);
            }

            throw var10;
         }
      }

      if (var13 != null) {
         this.mergeFrom(var13);
      }

      return this;
   }

   public ExerciseLap$PbLapTrainingPeaksStatistics$Builder mergeFrom(Message var1) {
      ExerciseLap$PbLapTrainingPeaksStatistics$Builder var2;
      if (var1 instanceof ExerciseLap$PbLapTrainingPeaksStatistics) {
         var2 = this.mergeFrom((ExerciseLap$PbLapTrainingPeaksStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseLap$PbLapTrainingPeaksStatistics$Builder mergeFrom(ExerciseLap$PbLapTrainingPeaksStatistics var1) {
      if (var1 != ExerciseLap$PbLapTrainingPeaksStatistics.getDefaultInstance()) {
         if (var1.hasNormalizedPower()) {
            this.setNormalizedPower(var1.getNormalizedPower());
         }

         if (var1.hasIntensityFactor()) {
            this.setIntensityFactor(var1.getIntensityFactor());
         }

         if (var1.hasTrainingStressScore()) {
            this.setTrainingStressScore(var1.getTrainingStressScore());
         }

         this.mergeUnknownFields(ExerciseLap$PbLapTrainingPeaksStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseLap$PbLapTrainingPeaksStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapTrainingPeaksStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseLap$PbLapTrainingPeaksStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapTrainingPeaksStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseLap$PbLapTrainingPeaksStatistics$Builder setIntensityFactor(float var1) {
      this.bitField0_ |= 2;
      this.intensityFactor_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapTrainingPeaksStatistics$Builder setNormalizedPower(int var1) {
      this.bitField0_ |= 1;
      this.normalizedPower_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapTrainingPeaksStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseLap$PbLapTrainingPeaksStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public ExerciseLap$PbLapTrainingPeaksStatistics$Builder setTrainingStressScore(float var1) {
      this.bitField0_ |= 4;
      this.trainingStressScore_ = var1;
      this.onChanged();
      return this;
   }

   public final ExerciseLap$PbLapTrainingPeaksStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapTrainingPeaksStatistics$Builder)super.setUnknownFields(var1);
   }
}
