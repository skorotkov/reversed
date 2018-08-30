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

public final class ExerciseStatistics$PbStrideLengthStatistics$Builder extends Builder implements ExerciseStatistics$PbStrideLengthStatisticsOrBuilder {
   private int average_;
   private int bitField0_;
   private int maximum_;

   private ExerciseStatistics$PbStrideLengthStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExerciseStatistics$PbStrideLengthStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseStatistics$PbStrideLengthStatistics$Builder(BuilderParent var1, ExerciseStatistics$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseStatistics$PbStrideLengthStatistics$Builder(ExerciseStatistics$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseStatistics.y();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseStatistics$PbStrideLengthStatistics.b()) {
      }

   }

   public ExerciseStatistics$PbStrideLengthStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbStrideLengthStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseStatistics$PbStrideLengthStatistics build() {
      ExerciseStatistics$PbStrideLengthStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseStatistics$PbStrideLengthStatistics buildPartial() {
      byte var1 = 1;
      ExerciseStatistics$PbStrideLengthStatistics var2 = new ExerciseStatistics$PbStrideLengthStatistics(this, (ExerciseStatistics$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ExerciseStatistics$PbStrideLengthStatistics.a(var2, this.average_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      ExerciseStatistics$PbStrideLengthStatistics.b(var2, this.maximum_);
      ExerciseStatistics$PbStrideLengthStatistics.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public ExerciseStatistics$PbStrideLengthStatistics$Builder clear() {
      super.clear();
      this.average_ = 0;
      this.bitField0_ &= -2;
      this.maximum_ = 0;
      this.bitField0_ &= -3;
      return this;
   }

   public ExerciseStatistics$PbStrideLengthStatistics$Builder clearAverage() {
      this.bitField0_ &= -2;
      this.average_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbStrideLengthStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseStatistics$PbStrideLengthStatistics$Builder)super.clearField(var1);
   }

   public ExerciseStatistics$PbStrideLengthStatistics$Builder clearMaximum() {
      this.bitField0_ &= -3;
      this.maximum_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbStrideLengthStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseStatistics$PbStrideLengthStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseStatistics$PbStrideLengthStatistics$Builder clone() {
      return (ExerciseStatistics$PbStrideLengthStatistics$Builder)super.clone();
   }

   public int getAverage() {
      return this.average_;
   }

   public ExerciseStatistics$PbStrideLengthStatistics getDefaultInstanceForType() {
      return ExerciseStatistics$PbStrideLengthStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseStatistics.y();
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
      return ExerciseStatistics.z().ensureFieldAccessorsInitialized(ExerciseStatistics$PbStrideLengthStatistics.class, ExerciseStatistics$PbStrideLengthStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExerciseStatistics$PbStrideLengthStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseStatistics$PbStrideLengthStatistics var13;
      label96: {
         InvalidProtocolBufferException var12;
         ExerciseStatistics$PbStrideLengthStatistics var14;
         try {
            var13 = (ExerciseStatistics$PbStrideLengthStatistics)ExerciseStatistics$PbStrideLengthStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (ExerciseStatistics$PbStrideLengthStatistics)var10.getUnfinishedMessage();
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

   public ExerciseStatistics$PbStrideLengthStatistics$Builder mergeFrom(Message var1) {
      ExerciseStatistics$PbStrideLengthStatistics$Builder var2;
      if (var1 instanceof ExerciseStatistics$PbStrideLengthStatistics) {
         var2 = this.mergeFrom((ExerciseStatistics$PbStrideLengthStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseStatistics$PbStrideLengthStatistics$Builder mergeFrom(ExerciseStatistics$PbStrideLengthStatistics var1) {
      if (var1 != ExerciseStatistics$PbStrideLengthStatistics.getDefaultInstance()) {
         if (var1.hasAverage()) {
            this.setAverage(var1.getAverage());
         }

         if (var1.hasMaximum()) {
            this.setMaximum(var1.getMaximum());
         }

         this.mergeUnknownFields(ExerciseStatistics$PbStrideLengthStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseStatistics$PbStrideLengthStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbStrideLengthStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseStatistics$PbStrideLengthStatistics$Builder setAverage(int var1) {
      this.bitField0_ |= 1;
      this.average_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbStrideLengthStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbStrideLengthStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseStatistics$PbStrideLengthStatistics$Builder setMaximum(int var1) {
      this.bitField0_ |= 2;
      this.maximum_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbStrideLengthStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseStatistics$PbStrideLengthStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExerciseStatistics$PbStrideLengthStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbStrideLengthStatistics$Builder)super.setUnknownFields(var1);
   }
}
