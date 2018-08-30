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

public final class ExerciseStatistics$PbAltitudeStatistics$Builder extends Builder implements ExerciseStatistics$PbAltitudeStatisticsOrBuilder {
   private float average_;
   private int bitField0_;
   private float maximum_;
   private float minimum_;

   private ExerciseStatistics$PbAltitudeStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExerciseStatistics$PbAltitudeStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseStatistics$PbAltitudeStatistics$Builder(BuilderParent var1, ExerciseStatistics$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseStatistics$PbAltitudeStatistics$Builder(ExerciseStatistics$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseStatistics.k();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseStatistics$PbAltitudeStatistics.b()) {
      }

   }

   public ExerciseStatistics$PbAltitudeStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbAltitudeStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseStatistics$PbAltitudeStatistics build() {
      ExerciseStatistics$PbAltitudeStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseStatistics$PbAltitudeStatistics buildPartial() {
      byte var1 = 1;
      ExerciseStatistics$PbAltitudeStatistics var2 = new ExerciseStatistics$PbAltitudeStatistics(this, (ExerciseStatistics$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ExerciseStatistics$PbAltitudeStatistics.a(var2, this.minimum_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      ExerciseStatistics$PbAltitudeStatistics.b(var2, this.average_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      ExerciseStatistics$PbAltitudeStatistics.c(var2, this.maximum_);
      ExerciseStatistics$PbAltitudeStatistics.a(var2, var5);
      this.onBuilt();
      return var2;
   }

   public ExerciseStatistics$PbAltitudeStatistics$Builder clear() {
      super.clear();
      this.minimum_ = 0.0F;
      this.bitField0_ &= -2;
      this.average_ = 0.0F;
      this.bitField0_ &= -3;
      this.maximum_ = 0.0F;
      this.bitField0_ &= -5;
      return this;
   }

   public ExerciseStatistics$PbAltitudeStatistics$Builder clearAverage() {
      this.bitField0_ &= -3;
      this.average_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbAltitudeStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseStatistics$PbAltitudeStatistics$Builder)super.clearField(var1);
   }

   public ExerciseStatistics$PbAltitudeStatistics$Builder clearMaximum() {
      this.bitField0_ &= -5;
      this.maximum_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbAltitudeStatistics$Builder clearMinimum() {
      this.bitField0_ &= -2;
      this.minimum_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbAltitudeStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseStatistics$PbAltitudeStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseStatistics$PbAltitudeStatistics$Builder clone() {
      return (ExerciseStatistics$PbAltitudeStatistics$Builder)super.clone();
   }

   public float getAverage() {
      return this.average_;
   }

   public ExerciseStatistics$PbAltitudeStatistics getDefaultInstanceForType() {
      return ExerciseStatistics$PbAltitudeStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseStatistics.k();
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
      return ExerciseStatistics.l().ensureFieldAccessorsInitialized(ExerciseStatistics$PbAltitudeStatistics.class, ExerciseStatistics$PbAltitudeStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExerciseStatistics$PbAltitudeStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseStatistics$PbAltitudeStatistics var13;
      label96: {
         InvalidProtocolBufferException var12;
         ExerciseStatistics$PbAltitudeStatistics var14;
         try {
            var13 = (ExerciseStatistics$PbAltitudeStatistics)ExerciseStatistics$PbAltitudeStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (ExerciseStatistics$PbAltitudeStatistics)var10.getUnfinishedMessage();
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

   public ExerciseStatistics$PbAltitudeStatistics$Builder mergeFrom(Message var1) {
      ExerciseStatistics$PbAltitudeStatistics$Builder var2;
      if (var1 instanceof ExerciseStatistics$PbAltitudeStatistics) {
         var2 = this.mergeFrom((ExerciseStatistics$PbAltitudeStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseStatistics$PbAltitudeStatistics$Builder mergeFrom(ExerciseStatistics$PbAltitudeStatistics var1) {
      if (var1 != ExerciseStatistics$PbAltitudeStatistics.getDefaultInstance()) {
         if (var1.hasMinimum()) {
            this.setMinimum(var1.getMinimum());
         }

         if (var1.hasAverage()) {
            this.setAverage(var1.getAverage());
         }

         if (var1.hasMaximum()) {
            this.setMaximum(var1.getMaximum());
         }

         this.mergeUnknownFields(ExerciseStatistics$PbAltitudeStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseStatistics$PbAltitudeStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbAltitudeStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseStatistics$PbAltitudeStatistics$Builder setAverage(float var1) {
      this.bitField0_ |= 2;
      this.average_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbAltitudeStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbAltitudeStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseStatistics$PbAltitudeStatistics$Builder setMaximum(float var1) {
      this.bitField0_ |= 4;
      this.maximum_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbAltitudeStatistics$Builder setMinimum(float var1) {
      this.bitField0_ |= 1;
      this.minimum_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbAltitudeStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseStatistics$PbAltitudeStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExerciseStatistics$PbAltitudeStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbAltitudeStatistics$Builder)super.setUnknownFields(var1);
   }
}
