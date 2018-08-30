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

public final class ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder extends Builder implements ExerciseStatistics$PbCyclingEfficiencyStatisticsOrBuilder {
   private int average_;
   private int bitField0_;

   private ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder(BuilderParent var1, ExerciseStatistics$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder(ExerciseStatistics$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseStatistics.o();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseStatistics$PbCyclingEfficiencyStatistics.b()) {
      }

   }

   public ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseStatistics$PbCyclingEfficiencyStatistics build() {
      ExerciseStatistics$PbCyclingEfficiencyStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseStatistics$PbCyclingEfficiencyStatistics buildPartial() {
      byte var1 = 1;
      ExerciseStatistics$PbCyclingEfficiencyStatistics var2 = new ExerciseStatistics$PbCyclingEfficiencyStatistics(this, (ExerciseStatistics$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      ExerciseStatistics$PbCyclingEfficiencyStatistics.a(var2, this.average_);
      ExerciseStatistics$PbCyclingEfficiencyStatistics.b(var2, var1);
      this.onBuilt();
      return var2;
   }

   public ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder clear() {
      super.clear();
      this.average_ = 0;
      this.bitField0_ &= -2;
      return this;
   }

   public ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder clearAverage() {
      this.bitField0_ &= -2;
      this.average_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder)super.clearField(var1);
   }

   public ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder clone() {
      return (ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder)super.clone();
   }

   public int getAverage() {
      return this.average_;
   }

   public ExerciseStatistics$PbCyclingEfficiencyStatistics getDefaultInstanceForType() {
      return ExerciseStatistics$PbCyclingEfficiencyStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseStatistics.o();
   }

   public boolean hasAverage() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseStatistics.p().ensureFieldAccessorsInitialized(ExerciseStatistics$PbCyclingEfficiencyStatistics.class, ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseStatistics$PbCyclingEfficiencyStatistics var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (ExerciseStatistics$PbCyclingEfficiencyStatistics)ExerciseStatistics$PbCyclingEfficiencyStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (ExerciseStatistics$PbCyclingEfficiencyStatistics)var10.getUnfinishedMessage();
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

   public ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder mergeFrom(Message var1) {
      ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder var2;
      if (var1 instanceof ExerciseStatistics$PbCyclingEfficiencyStatistics) {
         var2 = this.mergeFrom((ExerciseStatistics$PbCyclingEfficiencyStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder mergeFrom(ExerciseStatistics$PbCyclingEfficiencyStatistics var1) {
      if (var1 != ExerciseStatistics$PbCyclingEfficiencyStatistics.getDefaultInstance()) {
         if (var1.hasAverage()) {
            this.setAverage(var1.getAverage());
         }

         this.mergeUnknownFields(ExerciseStatistics$PbCyclingEfficiencyStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder setAverage(int var1) {
      this.bitField0_ |= 1;
      this.average_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbCyclingEfficiencyStatistics$Builder)super.setUnknownFields(var1);
   }
}
