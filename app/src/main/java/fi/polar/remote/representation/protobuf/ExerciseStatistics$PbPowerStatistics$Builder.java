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

public final class ExerciseStatistics$PbPowerStatistics$Builder extends Builder implements ExerciseStatistics$PbPowerStatisticsOrBuilder {
   private int average_;
   private int bitField0_;
   private int maximum_;

   private ExerciseStatistics$PbPowerStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExerciseStatistics$PbPowerStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseStatistics$PbPowerStatistics$Builder(BuilderParent var1, ExerciseStatistics$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseStatistics$PbPowerStatistics$Builder(ExerciseStatistics$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseStatistics.m();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseStatistics$PbPowerStatistics.b()) {
      }

   }

   public ExerciseStatistics$PbPowerStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbPowerStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseStatistics$PbPowerStatistics build() {
      ExerciseStatistics$PbPowerStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseStatistics$PbPowerStatistics buildPartial() {
      byte var1 = 1;
      ExerciseStatistics$PbPowerStatistics var2 = new ExerciseStatistics$PbPowerStatistics(this, (ExerciseStatistics$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ExerciseStatistics$PbPowerStatistics.a(var2, this.average_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      ExerciseStatistics$PbPowerStatistics.b(var2, this.maximum_);
      ExerciseStatistics$PbPowerStatistics.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public ExerciseStatistics$PbPowerStatistics$Builder clear() {
      super.clear();
      this.average_ = 0;
      this.bitField0_ &= -2;
      this.maximum_ = 0;
      this.bitField0_ &= -3;
      return this;
   }

   public ExerciseStatistics$PbPowerStatistics$Builder clearAverage() {
      this.bitField0_ &= -2;
      this.average_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbPowerStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseStatistics$PbPowerStatistics$Builder)super.clearField(var1);
   }

   public ExerciseStatistics$PbPowerStatistics$Builder clearMaximum() {
      this.bitField0_ &= -3;
      this.maximum_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbPowerStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseStatistics$PbPowerStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseStatistics$PbPowerStatistics$Builder clone() {
      return (ExerciseStatistics$PbPowerStatistics$Builder)super.clone();
   }

   public int getAverage() {
      return this.average_;
   }

   public ExerciseStatistics$PbPowerStatistics getDefaultInstanceForType() {
      return ExerciseStatistics$PbPowerStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseStatistics.m();
   }

   public int getMaximum() {
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
      return ExerciseStatistics.n().ensureFieldAccessorsInitialized(ExerciseStatistics$PbPowerStatistics.class, ExerciseStatistics$PbPowerStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExerciseStatistics$PbPowerStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseStatistics$PbPowerStatistics var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (ExerciseStatistics$PbPowerStatistics)ExerciseStatistics$PbPowerStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (ExerciseStatistics$PbPowerStatistics)var11.getUnfinishedMessage();
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

   public ExerciseStatistics$PbPowerStatistics$Builder mergeFrom(Message var1) {
      ExerciseStatistics$PbPowerStatistics$Builder var2;
      if (var1 instanceof ExerciseStatistics$PbPowerStatistics) {
         var2 = this.mergeFrom((ExerciseStatistics$PbPowerStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseStatistics$PbPowerStatistics$Builder mergeFrom(ExerciseStatistics$PbPowerStatistics var1) {
      if (var1 != ExerciseStatistics$PbPowerStatistics.getDefaultInstance()) {
         if (var1.hasAverage()) {
            this.setAverage(var1.getAverage());
         }

         if (var1.hasMaximum()) {
            this.setMaximum(var1.getMaximum());
         }

         this.mergeUnknownFields(ExerciseStatistics$PbPowerStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseStatistics$PbPowerStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbPowerStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseStatistics$PbPowerStatistics$Builder setAverage(int var1) {
      this.bitField0_ |= 1;
      this.average_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbPowerStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbPowerStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseStatistics$PbPowerStatistics$Builder setMaximum(int var1) {
      this.bitField0_ |= 2;
      this.maximum_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbPowerStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseStatistics$PbPowerStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExerciseStatistics$PbPowerStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbPowerStatistics$Builder)super.setUnknownFields(var1);
   }
}
