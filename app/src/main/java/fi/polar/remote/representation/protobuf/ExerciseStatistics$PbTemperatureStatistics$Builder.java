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

public final class ExerciseStatistics$PbTemperatureStatistics$Builder extends Builder implements ExerciseStatistics$PbTemperatureStatisticsOrBuilder {
   private float average_;
   private int bitField0_;
   private float maximum_;
   private float minimum_;

   private ExerciseStatistics$PbTemperatureStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExerciseStatistics$PbTemperatureStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseStatistics$PbTemperatureStatistics$Builder(BuilderParent var1, ExerciseStatistics$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseStatistics$PbTemperatureStatistics$Builder(ExerciseStatistics$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseStatistics.w();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseStatistics$PbTemperatureStatistics.b()) {
      }

   }

   public ExerciseStatistics$PbTemperatureStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbTemperatureStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseStatistics$PbTemperatureStatistics build() {
      ExerciseStatistics$PbTemperatureStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseStatistics$PbTemperatureStatistics buildPartial() {
      byte var1 = 1;
      ExerciseStatistics$PbTemperatureStatistics var2 = new ExerciseStatistics$PbTemperatureStatistics(this, (ExerciseStatistics$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ExerciseStatistics$PbTemperatureStatistics.a(var2, this.minimum_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      ExerciseStatistics$PbTemperatureStatistics.b(var2, this.average_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      ExerciseStatistics$PbTemperatureStatistics.c(var2, this.maximum_);
      ExerciseStatistics$PbTemperatureStatistics.a(var2, var5);
      this.onBuilt();
      return var2;
   }

   public ExerciseStatistics$PbTemperatureStatistics$Builder clear() {
      super.clear();
      this.minimum_ = 0.0F;
      this.bitField0_ &= -2;
      this.average_ = 0.0F;
      this.bitField0_ &= -3;
      this.maximum_ = 0.0F;
      this.bitField0_ &= -5;
      return this;
   }

   public ExerciseStatistics$PbTemperatureStatistics$Builder clearAverage() {
      this.bitField0_ &= -3;
      this.average_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbTemperatureStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseStatistics$PbTemperatureStatistics$Builder)super.clearField(var1);
   }

   public ExerciseStatistics$PbTemperatureStatistics$Builder clearMaximum() {
      this.bitField0_ &= -5;
      this.maximum_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbTemperatureStatistics$Builder clearMinimum() {
      this.bitField0_ &= -2;
      this.minimum_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbTemperatureStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseStatistics$PbTemperatureStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseStatistics$PbTemperatureStatistics$Builder clone() {
      return (ExerciseStatistics$PbTemperatureStatistics$Builder)super.clone();
   }

   public float getAverage() {
      return this.average_;
   }

   public ExerciseStatistics$PbTemperatureStatistics getDefaultInstanceForType() {
      return ExerciseStatistics$PbTemperatureStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseStatistics.w();
   }

   public float getMaximum() {
      return this.maximum_;
   }

   public float getMinimum() {
      return this.minimum_;
   }

   public boolean hasAverage() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMaximum() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMinimum() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseStatistics.x().ensureFieldAccessorsInitialized(ExerciseStatistics$PbTemperatureStatistics.class, ExerciseStatistics$PbTemperatureStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExerciseStatistics$PbTemperatureStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseStatistics$PbTemperatureStatistics var13;
      label96: {
         InvalidProtocolBufferException var12;
         ExerciseStatistics$PbTemperatureStatistics var14;
         try {
            var13 = (ExerciseStatistics$PbTemperatureStatistics)ExerciseStatistics$PbTemperatureStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (ExerciseStatistics$PbTemperatureStatistics)var10.getUnfinishedMessage();
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

   public ExerciseStatistics$PbTemperatureStatistics$Builder mergeFrom(Message var1) {
      ExerciseStatistics$PbTemperatureStatistics$Builder var2;
      if (var1 instanceof ExerciseStatistics$PbTemperatureStatistics) {
         var2 = this.mergeFrom((ExerciseStatistics$PbTemperatureStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseStatistics$PbTemperatureStatistics$Builder mergeFrom(ExerciseStatistics$PbTemperatureStatistics var1) {
      if (var1 != ExerciseStatistics$PbTemperatureStatistics.getDefaultInstance()) {
         if (var1.hasMinimum()) {
            this.setMinimum(var1.getMinimum());
         }

         if (var1.hasAverage()) {
            this.setAverage(var1.getAverage());
         }

         if (var1.hasMaximum()) {
            this.setMaximum(var1.getMaximum());
         }

         this.mergeUnknownFields(ExerciseStatistics$PbTemperatureStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseStatistics$PbTemperatureStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbTemperatureStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseStatistics$PbTemperatureStatistics$Builder setAverage(float var1) {
      this.bitField0_ |= 2;
      this.average_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbTemperatureStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbTemperatureStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseStatistics$PbTemperatureStatistics$Builder setMaximum(float var1) {
      this.bitField0_ |= 4;
      this.maximum_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbTemperatureStatistics$Builder setMinimum(float var1) {
      this.bitField0_ |= 1;
      this.minimum_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbTemperatureStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseStatistics$PbTemperatureStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExerciseStatistics$PbTemperatureStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbTemperatureStatistics$Builder)super.setUnknownFields(var1);
   }
}
