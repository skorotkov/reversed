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

public final class ExerciseLap$PbLapHeartRateStatistics$Builder extends Builder implements ExerciseLap$PbLapHeartRateStatisticsOrBuilder {
   private int average_;
   private int bitField0_;
   private int maximum_;
   private int minimum_;

   private ExerciseLap$PbLapHeartRateStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExerciseLap$PbLapHeartRateStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseLap$PbLapHeartRateStatistics$Builder(BuilderParent var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseLap$PbLapHeartRateStatistics$Builder(ExerciseLap$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.e();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseLap$PbLapHeartRateStatistics.b()) {
      }

   }

   public ExerciseLap$PbLapHeartRateStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapHeartRateStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseLap$PbLapHeartRateStatistics build() {
      ExerciseLap$PbLapHeartRateStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseLap$PbLapHeartRateStatistics buildPartial() {
      byte var1 = 1;
      ExerciseLap$PbLapHeartRateStatistics var2 = new ExerciseLap$PbLapHeartRateStatistics(this, (ExerciseLap$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ExerciseLap$PbLapHeartRateStatistics.a(var2, this.average_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      ExerciseLap$PbLapHeartRateStatistics.b(var2, this.maximum_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      ExerciseLap$PbLapHeartRateStatistics.c(var2, this.minimum_);
      ExerciseLap$PbLapHeartRateStatistics.d(var2, var5);
      this.onBuilt();
      return var2;
   }

   public ExerciseLap$PbLapHeartRateStatistics$Builder clear() {
      super.clear();
      this.average_ = 0;
      this.bitField0_ &= -2;
      this.maximum_ = 0;
      this.bitField0_ &= -3;
      this.minimum_ = 0;
      this.bitField0_ &= -5;
      return this;
   }

   public ExerciseLap$PbLapHeartRateStatistics$Builder clearAverage() {
      this.bitField0_ &= -2;
      this.average_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapHeartRateStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseLap$PbLapHeartRateStatistics$Builder)super.clearField(var1);
   }

   public ExerciseLap$PbLapHeartRateStatistics$Builder clearMaximum() {
      this.bitField0_ &= -3;
      this.maximum_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapHeartRateStatistics$Builder clearMinimum() {
      this.bitField0_ &= -5;
      this.minimum_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapHeartRateStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseLap$PbLapHeartRateStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseLap$PbLapHeartRateStatistics$Builder clone() {
      return (ExerciseLap$PbLapHeartRateStatistics$Builder)super.clone();
   }

   public int getAverage() {
      return this.average_;
   }

   public ExerciseLap$PbLapHeartRateStatistics getDefaultInstanceForType() {
      return ExerciseLap$PbLapHeartRateStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseLap.e();
   }

   public int getMaximum() {
      return this.maximum_;
   }

   public int getMinimum() {
      return this.minimum_;
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

   public boolean hasMinimum() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseLap.f().ensureFieldAccessorsInitialized(ExerciseLap$PbLapHeartRateStatistics.class, ExerciseLap$PbLapHeartRateStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExerciseLap$PbLapHeartRateStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseLap$PbLapHeartRateStatistics var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (ExerciseLap$PbLapHeartRateStatistics)ExerciseLap$PbLapHeartRateStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (ExerciseLap$PbLapHeartRateStatistics)var10.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var13.unwrapIOException();
         } finally {
            if (var12 != null) {
               this.mergeFrom(var12);
            }

            throw var13;
         }
      }

      if (var12 != null) {
         this.mergeFrom(var12);
      }

      return this;
   }

   public ExerciseLap$PbLapHeartRateStatistics$Builder mergeFrom(Message var1) {
      ExerciseLap$PbLapHeartRateStatistics$Builder var2;
      if (var1 instanceof ExerciseLap$PbLapHeartRateStatistics) {
         var2 = this.mergeFrom((ExerciseLap$PbLapHeartRateStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseLap$PbLapHeartRateStatistics$Builder mergeFrom(ExerciseLap$PbLapHeartRateStatistics var1) {
      if (var1 != ExerciseLap$PbLapHeartRateStatistics.getDefaultInstance()) {
         if (var1.hasAverage()) {
            this.setAverage(var1.getAverage());
         }

         if (var1.hasMaximum()) {
            this.setMaximum(var1.getMaximum());
         }

         if (var1.hasMinimum()) {
            this.setMinimum(var1.getMinimum());
         }

         this.mergeUnknownFields(ExerciseLap$PbLapHeartRateStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseLap$PbLapHeartRateStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapHeartRateStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseLap$PbLapHeartRateStatistics$Builder setAverage(int var1) {
      this.bitField0_ |= 1;
      this.average_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapHeartRateStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapHeartRateStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseLap$PbLapHeartRateStatistics$Builder setMaximum(int var1) {
      this.bitField0_ |= 2;
      this.maximum_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapHeartRateStatistics$Builder setMinimum(int var1) {
      this.bitField0_ |= 4;
      this.minimum_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapHeartRateStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseLap$PbLapHeartRateStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExerciseLap$PbLapHeartRateStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapHeartRateStatistics$Builder)super.setUnknownFields(var1);
   }
}
