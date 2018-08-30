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

public final class ExerciseStatistics$PbHeartRateStatistics$Builder extends Builder implements ExerciseStatistics$PbHeartRateStatisticsOrBuilder {
   private int average_;
   private int bitField0_;
   private int maximum_;
   private int minimum_;

   private ExerciseStatistics$PbHeartRateStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExerciseStatistics$PbHeartRateStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseStatistics$PbHeartRateStatistics$Builder(BuilderParent var1, ExerciseStatistics$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseStatistics$PbHeartRateStatistics$Builder(ExerciseStatistics$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseStatistics.e();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseStatistics$PbHeartRateStatistics.b()) {
      }

   }

   public ExerciseStatistics$PbHeartRateStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbHeartRateStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseStatistics$PbHeartRateStatistics build() {
      ExerciseStatistics$PbHeartRateStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseStatistics$PbHeartRateStatistics buildPartial() {
      byte var1 = 1;
      ExerciseStatistics$PbHeartRateStatistics var2 = new ExerciseStatistics$PbHeartRateStatistics(this, (ExerciseStatistics$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ExerciseStatistics$PbHeartRateStatistics.a(var2, this.minimum_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      ExerciseStatistics$PbHeartRateStatistics.b(var2, this.average_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      ExerciseStatistics$PbHeartRateStatistics.c(var2, this.maximum_);
      ExerciseStatistics$PbHeartRateStatistics.d(var2, var5);
      this.onBuilt();
      return var2;
   }

   public ExerciseStatistics$PbHeartRateStatistics$Builder clear() {
      super.clear();
      this.minimum_ = 0;
      this.bitField0_ &= -2;
      this.average_ = 0;
      this.bitField0_ &= -3;
      this.maximum_ = 0;
      this.bitField0_ &= -5;
      return this;
   }

   public ExerciseStatistics$PbHeartRateStatistics$Builder clearAverage() {
      this.bitField0_ &= -3;
      this.average_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbHeartRateStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseStatistics$PbHeartRateStatistics$Builder)super.clearField(var1);
   }

   public ExerciseStatistics$PbHeartRateStatistics$Builder clearMaximum() {
      this.bitField0_ &= -5;
      this.maximum_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbHeartRateStatistics$Builder clearMinimum() {
      this.bitField0_ &= -2;
      this.minimum_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbHeartRateStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseStatistics$PbHeartRateStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseStatistics$PbHeartRateStatistics$Builder clone() {
      return (ExerciseStatistics$PbHeartRateStatistics$Builder)super.clone();
   }

   public int getAverage() {
      return this.average_;
   }

   public ExerciseStatistics$PbHeartRateStatistics getDefaultInstanceForType() {
      return ExerciseStatistics$PbHeartRateStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseStatistics.e();
   }

   public int getMaximum() {
      return this.maximum_;
   }

   public int getMinimum() {
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
      return ExerciseStatistics.f().ensureFieldAccessorsInitialized(ExerciseStatistics$PbHeartRateStatistics.class, ExerciseStatistics$PbHeartRateStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExerciseStatistics$PbHeartRateStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseStatistics$PbHeartRateStatistics var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (ExerciseStatistics$PbHeartRateStatistics)ExerciseStatistics$PbHeartRateStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (ExerciseStatistics$PbHeartRateStatistics)var11.getUnfinishedMessage();
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

   public ExerciseStatistics$PbHeartRateStatistics$Builder mergeFrom(Message var1) {
      ExerciseStatistics$PbHeartRateStatistics$Builder var2;
      if (var1 instanceof ExerciseStatistics$PbHeartRateStatistics) {
         var2 = this.mergeFrom((ExerciseStatistics$PbHeartRateStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseStatistics$PbHeartRateStatistics$Builder mergeFrom(ExerciseStatistics$PbHeartRateStatistics var1) {
      if (var1 != ExerciseStatistics$PbHeartRateStatistics.getDefaultInstance()) {
         if (var1.hasMinimum()) {
            this.setMinimum(var1.getMinimum());
         }

         if (var1.hasAverage()) {
            this.setAverage(var1.getAverage());
         }

         if (var1.hasMaximum()) {
            this.setMaximum(var1.getMaximum());
         }

         this.mergeUnknownFields(ExerciseStatistics$PbHeartRateStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseStatistics$PbHeartRateStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbHeartRateStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseStatistics$PbHeartRateStatistics$Builder setAverage(int var1) {
      this.bitField0_ |= 2;
      this.average_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbHeartRateStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbHeartRateStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseStatistics$PbHeartRateStatistics$Builder setMaximum(int var1) {
      this.bitField0_ |= 4;
      this.maximum_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbHeartRateStatistics$Builder setMinimum(int var1) {
      this.bitField0_ |= 1;
      this.minimum_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbHeartRateStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseStatistics$PbHeartRateStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExerciseStatistics$PbHeartRateStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbHeartRateStatistics$Builder)super.setUnknownFields(var1);
   }
}
