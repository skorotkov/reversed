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

public final class ExerciseStatistics$PbInclineStatistics$Builder extends Builder implements ExerciseStatistics$PbInclineStatisticsOrBuilder {
   private float average_;
   private int bitField0_;
   private float maximum_;

   private ExerciseStatistics$PbInclineStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExerciseStatistics$PbInclineStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseStatistics$PbInclineStatistics$Builder(BuilderParent var1, ExerciseStatistics$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseStatistics$PbInclineStatistics$Builder(ExerciseStatistics$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseStatistics.A();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseStatistics$PbInclineStatistics.b()) {
      }

   }

   public ExerciseStatistics$PbInclineStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbInclineStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseStatistics$PbInclineStatistics build() {
      ExerciseStatistics$PbInclineStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseStatistics$PbInclineStatistics buildPartial() {
      byte var1 = 1;
      ExerciseStatistics$PbInclineStatistics var2 = new ExerciseStatistics$PbInclineStatistics(this, (ExerciseStatistics$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ExerciseStatistics$PbInclineStatistics.a(var2, this.average_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      ExerciseStatistics$PbInclineStatistics.b(var2, this.maximum_);
      ExerciseStatistics$PbInclineStatistics.a(var2, var4);
      this.onBuilt();
      return var2;
   }

   public ExerciseStatistics$PbInclineStatistics$Builder clear() {
      super.clear();
      this.average_ = 0.0F;
      this.bitField0_ &= -2;
      this.maximum_ = 0.0F;
      this.bitField0_ &= -3;
      return this;
   }

   public ExerciseStatistics$PbInclineStatistics$Builder clearAverage() {
      this.bitField0_ &= -2;
      this.average_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbInclineStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseStatistics$PbInclineStatistics$Builder)super.clearField(var1);
   }

   public ExerciseStatistics$PbInclineStatistics$Builder clearMaximum() {
      this.bitField0_ &= -3;
      this.maximum_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbInclineStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseStatistics$PbInclineStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseStatistics$PbInclineStatistics$Builder clone() {
      return (ExerciseStatistics$PbInclineStatistics$Builder)super.clone();
   }

   public float getAverage() {
      return this.average_;
   }

   public ExerciseStatistics$PbInclineStatistics getDefaultInstanceForType() {
      return ExerciseStatistics$PbInclineStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseStatistics.A();
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
      return ExerciseStatistics.B().ensureFieldAccessorsInitialized(ExerciseStatistics$PbInclineStatistics.class, ExerciseStatistics$PbInclineStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExerciseStatistics$PbInclineStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseStatistics$PbInclineStatistics var13;
      label96: {
         InvalidProtocolBufferException var12;
         ExerciseStatistics$PbInclineStatistics var14;
         try {
            var13 = (ExerciseStatistics$PbInclineStatistics)ExerciseStatistics$PbInclineStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (ExerciseStatistics$PbInclineStatistics)var10.getUnfinishedMessage();
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

   public ExerciseStatistics$PbInclineStatistics$Builder mergeFrom(Message var1) {
      ExerciseStatistics$PbInclineStatistics$Builder var2;
      if (var1 instanceof ExerciseStatistics$PbInclineStatistics) {
         var2 = this.mergeFrom((ExerciseStatistics$PbInclineStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseStatistics$PbInclineStatistics$Builder mergeFrom(ExerciseStatistics$PbInclineStatistics var1) {
      if (var1 != ExerciseStatistics$PbInclineStatistics.getDefaultInstance()) {
         if (var1.hasAverage()) {
            this.setAverage(var1.getAverage());
         }

         if (var1.hasMaximum()) {
            this.setMaximum(var1.getMaximum());
         }

         this.mergeUnknownFields(ExerciseStatistics$PbInclineStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseStatistics$PbInclineStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbInclineStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseStatistics$PbInclineStatistics$Builder setAverage(float var1) {
      this.bitField0_ |= 1;
      this.average_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbInclineStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbInclineStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseStatistics$PbInclineStatistics$Builder setMaximum(float var1) {
      this.bitField0_ |= 2;
      this.maximum_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbInclineStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseStatistics$PbInclineStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExerciseStatistics$PbInclineStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbInclineStatistics$Builder)super.setUnknownFields(var1);
   }
}
