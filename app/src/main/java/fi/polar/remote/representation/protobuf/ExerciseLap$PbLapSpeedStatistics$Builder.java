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

public final class ExerciseLap$PbLapSpeedStatistics$Builder extends Builder implements ExerciseLap$PbLapSpeedStatisticsOrBuilder {
   private float average_;
   private int bitField0_;
   private float maximum_;

   private ExerciseLap$PbLapSpeedStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExerciseLap$PbLapSpeedStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseLap$PbLapSpeedStatistics$Builder(BuilderParent var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseLap$PbLapSpeedStatistics$Builder(ExerciseLap$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.g();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseLap$PbLapSpeedStatistics.b()) {
      }

   }

   public ExerciseLap$PbLapSpeedStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapSpeedStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseLap$PbLapSpeedStatistics build() {
      ExerciseLap$PbLapSpeedStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseLap$PbLapSpeedStatistics buildPartial() {
      byte var1 = 1;
      ExerciseLap$PbLapSpeedStatistics var2 = new ExerciseLap$PbLapSpeedStatistics(this, (ExerciseLap$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ExerciseLap$PbLapSpeedStatistics.a(var2, this.average_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      ExerciseLap$PbLapSpeedStatistics.b(var2, this.maximum_);
      ExerciseLap$PbLapSpeedStatistics.a(var2, var4);
      this.onBuilt();
      return var2;
   }

   public ExerciseLap$PbLapSpeedStatistics$Builder clear() {
      super.clear();
      this.average_ = 0.0F;
      this.bitField0_ &= -2;
      this.maximum_ = 0.0F;
      this.bitField0_ &= -3;
      return this;
   }

   public ExerciseLap$PbLapSpeedStatistics$Builder clearAverage() {
      this.bitField0_ &= -2;
      this.average_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapSpeedStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseLap$PbLapSpeedStatistics$Builder)super.clearField(var1);
   }

   public ExerciseLap$PbLapSpeedStatistics$Builder clearMaximum() {
      this.bitField0_ &= -3;
      this.maximum_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapSpeedStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseLap$PbLapSpeedStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseLap$PbLapSpeedStatistics$Builder clone() {
      return (ExerciseLap$PbLapSpeedStatistics$Builder)super.clone();
   }

   public float getAverage() {
      return this.average_;
   }

   public ExerciseLap$PbLapSpeedStatistics getDefaultInstanceForType() {
      return ExerciseLap$PbLapSpeedStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseLap.g();
   }

   public float getMaximum() {
      return this.maximum_;
   }

   public boolean hasAverage() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMaximum() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseLap.h().ensureFieldAccessorsInitialized(ExerciseLap$PbLapSpeedStatistics.class, ExerciseLap$PbLapSpeedStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExerciseLap$PbLapSpeedStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseLap$PbLapSpeedStatistics var13;
      label96: {
         InvalidProtocolBufferException var12;
         ExerciseLap$PbLapSpeedStatistics var14;
         try {
            var13 = (ExerciseLap$PbLapSpeedStatistics)ExerciseLap$PbLapSpeedStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (ExerciseLap$PbLapSpeedStatistics)var10.getUnfinishedMessage();
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

   public ExerciseLap$PbLapSpeedStatistics$Builder mergeFrom(Message var1) {
      ExerciseLap$PbLapSpeedStatistics$Builder var2;
      if (var1 instanceof ExerciseLap$PbLapSpeedStatistics) {
         var2 = this.mergeFrom((ExerciseLap$PbLapSpeedStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseLap$PbLapSpeedStatistics$Builder mergeFrom(ExerciseLap$PbLapSpeedStatistics var1) {
      if (var1 != ExerciseLap$PbLapSpeedStatistics.getDefaultInstance()) {
         if (var1.hasAverage()) {
            this.setAverage(var1.getAverage());
         }

         if (var1.hasMaximum()) {
            this.setMaximum(var1.getMaximum());
         }

         this.mergeUnknownFields(ExerciseLap$PbLapSpeedStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseLap$PbLapSpeedStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapSpeedStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseLap$PbLapSpeedStatistics$Builder setAverage(float var1) {
      this.bitField0_ |= 1;
      this.average_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapSpeedStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapSpeedStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseLap$PbLapSpeedStatistics$Builder setMaximum(float var1) {
      this.bitField0_ |= 2;
      this.maximum_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapSpeedStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseLap$PbLapSpeedStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExerciseLap$PbLapSpeedStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapSpeedStatistics$Builder)super.setUnknownFields(var1);
   }
}
