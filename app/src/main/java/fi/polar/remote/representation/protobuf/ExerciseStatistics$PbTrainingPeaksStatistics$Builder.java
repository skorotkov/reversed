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

public final class ExerciseStatistics$PbTrainingPeaksStatistics$Builder extends Builder implements ExerciseStatistics$PbTrainingPeaksStatisticsOrBuilder {
   private int bitField0_;
   private float intensityFactor_;
   private int normalizedPower_;
   private float trainingStressScore_;

   private ExerciseStatistics$PbTrainingPeaksStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExerciseStatistics$PbTrainingPeaksStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseStatistics$PbTrainingPeaksStatistics$Builder(BuilderParent var1, ExerciseStatistics$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseStatistics$PbTrainingPeaksStatistics$Builder(ExerciseStatistics$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseStatistics.u();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseStatistics$PbTrainingPeaksStatistics.b()) {
      }

   }

   public ExerciseStatistics$PbTrainingPeaksStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbTrainingPeaksStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseStatistics$PbTrainingPeaksStatistics build() {
      ExerciseStatistics$PbTrainingPeaksStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseStatistics$PbTrainingPeaksStatistics buildPartial() {
      byte var1 = 1;
      ExerciseStatistics$PbTrainingPeaksStatistics var2 = new ExerciseStatistics$PbTrainingPeaksStatistics(this, (ExerciseStatistics$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ExerciseStatistics$PbTrainingPeaksStatistics.a(var2, this.normalizedPower_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      ExerciseStatistics$PbTrainingPeaksStatistics.a(var2, this.intensityFactor_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      ExerciseStatistics$PbTrainingPeaksStatistics.b(var2, this.trainingStressScore_);
      ExerciseStatistics$PbTrainingPeaksStatistics.b(var2, var5);
      this.onBuilt();
      return var2;
   }

   public ExerciseStatistics$PbTrainingPeaksStatistics$Builder clear() {
      super.clear();
      this.normalizedPower_ = 0;
      this.bitField0_ &= -2;
      this.intensityFactor_ = 0.0F;
      this.bitField0_ &= -3;
      this.trainingStressScore_ = 0.0F;
      this.bitField0_ &= -5;
      return this;
   }

   public ExerciseStatistics$PbTrainingPeaksStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseStatistics$PbTrainingPeaksStatistics$Builder)super.clearField(var1);
   }

   public ExerciseStatistics$PbTrainingPeaksStatistics$Builder clearIntensityFactor() {
      this.bitField0_ &= -3;
      this.intensityFactor_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbTrainingPeaksStatistics$Builder clearNormalizedPower() {
      this.bitField0_ &= -2;
      this.normalizedPower_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbTrainingPeaksStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseStatistics$PbTrainingPeaksStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseStatistics$PbTrainingPeaksStatistics$Builder clearTrainingStressScore() {
      this.bitField0_ &= -5;
      this.trainingStressScore_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbTrainingPeaksStatistics$Builder clone() {
      return (ExerciseStatistics$PbTrainingPeaksStatistics$Builder)super.clone();
   }

   public ExerciseStatistics$PbTrainingPeaksStatistics getDefaultInstanceForType() {
      return ExerciseStatistics$PbTrainingPeaksStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseStatistics.u();
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
      return ExerciseStatistics.v().ensureFieldAccessorsInitialized(ExerciseStatistics$PbTrainingPeaksStatistics.class, ExerciseStatistics$PbTrainingPeaksStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExerciseStatistics$PbTrainingPeaksStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseStatistics$PbTrainingPeaksStatistics var13;
      label96: {
         InvalidProtocolBufferException var12;
         ExerciseStatistics$PbTrainingPeaksStatistics var14;
         try {
            var13 = (ExerciseStatistics$PbTrainingPeaksStatistics)ExerciseStatistics$PbTrainingPeaksStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (ExerciseStatistics$PbTrainingPeaksStatistics)var10.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var12.unwrapIOException();
         } finally {
            if (var14 != null) {
               this.mergeFrom(var14);
            }

            throw var12;
         }
      }

      if (var13 != null) {
         this.mergeFrom(var13);
      }

      return this;
   }

   public ExerciseStatistics$PbTrainingPeaksStatistics$Builder mergeFrom(Message var1) {
      ExerciseStatistics$PbTrainingPeaksStatistics$Builder var2;
      if (var1 instanceof ExerciseStatistics$PbTrainingPeaksStatistics) {
         var2 = this.mergeFrom((ExerciseStatistics$PbTrainingPeaksStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseStatistics$PbTrainingPeaksStatistics$Builder mergeFrom(ExerciseStatistics$PbTrainingPeaksStatistics var1) {
      if (var1 != ExerciseStatistics$PbTrainingPeaksStatistics.getDefaultInstance()) {
         if (var1.hasNormalizedPower()) {
            this.setNormalizedPower(var1.getNormalizedPower());
         }

         if (var1.hasIntensityFactor()) {
            this.setIntensityFactor(var1.getIntensityFactor());
         }

         if (var1.hasTrainingStressScore()) {
            this.setTrainingStressScore(var1.getTrainingStressScore());
         }

         this.mergeUnknownFields(ExerciseStatistics$PbTrainingPeaksStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseStatistics$PbTrainingPeaksStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbTrainingPeaksStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseStatistics$PbTrainingPeaksStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbTrainingPeaksStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseStatistics$PbTrainingPeaksStatistics$Builder setIntensityFactor(float var1) {
      this.bitField0_ |= 2;
      this.intensityFactor_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbTrainingPeaksStatistics$Builder setNormalizedPower(int var1) {
      this.bitField0_ |= 1;
      this.normalizedPower_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbTrainingPeaksStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseStatistics$PbTrainingPeaksStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public ExerciseStatistics$PbTrainingPeaksStatistics$Builder setTrainingStressScore(float var1) {
      this.bitField0_ |= 4;
      this.trainingStressScore_ = var1;
      this.onChanged();
      return this;
   }

   public final ExerciseStatistics$PbTrainingPeaksStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbTrainingPeaksStatistics$Builder)super.setUnknownFields(var1);
   }
}
