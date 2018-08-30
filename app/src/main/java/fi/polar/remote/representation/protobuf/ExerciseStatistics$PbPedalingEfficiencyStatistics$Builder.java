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

public final class ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder extends Builder implements ExerciseStatistics$PbPedalingEfficiencyStatisticsOrBuilder {
   private int average_;
   private int bitField0_;

   private ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder(BuilderParent var1, ExerciseStatistics$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder(ExerciseStatistics$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseStatistics.q();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseStatistics$PbPedalingEfficiencyStatistics.b()) {
      }

   }

   public ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseStatistics$PbPedalingEfficiencyStatistics build() {
      ExerciseStatistics$PbPedalingEfficiencyStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseStatistics$PbPedalingEfficiencyStatistics buildPartial() {
      byte var1 = 1;
      ExerciseStatistics$PbPedalingEfficiencyStatistics var2 = new ExerciseStatistics$PbPedalingEfficiencyStatistics(this, (ExerciseStatistics$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      ExerciseStatistics$PbPedalingEfficiencyStatistics.a(var2, this.average_);
      ExerciseStatistics$PbPedalingEfficiencyStatistics.b(var2, var1);
      this.onBuilt();
      return var2;
   }

   public ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder clear() {
      super.clear();
      this.average_ = 0;
      this.bitField0_ &= -2;
      return this;
   }

   public ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder clearAverage() {
      this.bitField0_ &= -2;
      this.average_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder)super.clearField(var1);
   }

   public ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder clone() {
      return (ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder)super.clone();
   }

   public int getAverage() {
      return this.average_;
   }

   public ExerciseStatistics$PbPedalingEfficiencyStatistics getDefaultInstanceForType() {
      return ExerciseStatistics$PbPedalingEfficiencyStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseStatistics.q();
   }

   public boolean hasAverage() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseStatistics.r().ensureFieldAccessorsInitialized(ExerciseStatistics$PbPedalingEfficiencyStatistics.class, ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseStatistics$PbPedalingEfficiencyStatistics var13;
      label96: {
         InvalidProtocolBufferException var12;
         ExerciseStatistics$PbPedalingEfficiencyStatistics var14;
         try {
            var13 = (ExerciseStatistics$PbPedalingEfficiencyStatistics)ExerciseStatistics$PbPedalingEfficiencyStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (ExerciseStatistics$PbPedalingEfficiencyStatistics)var10.getUnfinishedMessage();
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

   public ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder mergeFrom(Message var1) {
      ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder var2;
      if (var1 instanceof ExerciseStatistics$PbPedalingEfficiencyStatistics) {
         var2 = this.mergeFrom((ExerciseStatistics$PbPedalingEfficiencyStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder mergeFrom(ExerciseStatistics$PbPedalingEfficiencyStatistics var1) {
      if (var1 != ExerciseStatistics$PbPedalingEfficiencyStatistics.getDefaultInstance()) {
         if (var1.hasAverage()) {
            this.setAverage(var1.getAverage());
         }

         this.mergeUnknownFields(ExerciseStatistics$PbPedalingEfficiencyStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder setAverage(int var1) {
      this.bitField0_ |= 1;
      this.average_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder)super.setUnknownFields(var1);
   }
}
