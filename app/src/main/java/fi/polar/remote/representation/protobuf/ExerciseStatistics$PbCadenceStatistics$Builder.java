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

public final class ExerciseStatistics$PbCadenceStatistics$Builder extends Builder implements ExerciseStatistics$PbCadenceStatisticsOrBuilder {
   private int average_;
   private int bitField0_;
   private int maximum_;

   private ExerciseStatistics$PbCadenceStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExerciseStatistics$PbCadenceStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseStatistics$PbCadenceStatistics$Builder(BuilderParent var1, ExerciseStatistics$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseStatistics$PbCadenceStatistics$Builder(ExerciseStatistics$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseStatistics.i();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseStatistics$PbCadenceStatistics.b()) {
      }

   }

   public ExerciseStatistics$PbCadenceStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbCadenceStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseStatistics$PbCadenceStatistics build() {
      ExerciseStatistics$PbCadenceStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseStatistics$PbCadenceStatistics buildPartial() {
      byte var1 = 1;
      ExerciseStatistics$PbCadenceStatistics var2 = new ExerciseStatistics$PbCadenceStatistics(this, (ExerciseStatistics$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ExerciseStatistics$PbCadenceStatistics.a(var2, this.average_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      ExerciseStatistics$PbCadenceStatistics.b(var2, this.maximum_);
      ExerciseStatistics$PbCadenceStatistics.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public ExerciseStatistics$PbCadenceStatistics$Builder clear() {
      super.clear();
      this.average_ = 0;
      this.bitField0_ &= -2;
      this.maximum_ = 0;
      this.bitField0_ &= -3;
      return this;
   }

   public ExerciseStatistics$PbCadenceStatistics$Builder clearAverage() {
      this.bitField0_ &= -2;
      this.average_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbCadenceStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseStatistics$PbCadenceStatistics$Builder)super.clearField(var1);
   }

   public ExerciseStatistics$PbCadenceStatistics$Builder clearMaximum() {
      this.bitField0_ &= -3;
      this.maximum_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbCadenceStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseStatistics$PbCadenceStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseStatistics$PbCadenceStatistics$Builder clone() {
      return (ExerciseStatistics$PbCadenceStatistics$Builder)super.clone();
   }

   public int getAverage() {
      return this.average_;
   }

   public ExerciseStatistics$PbCadenceStatistics getDefaultInstanceForType() {
      return ExerciseStatistics$PbCadenceStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseStatistics.i();
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
      return ExerciseStatistics.j().ensureFieldAccessorsInitialized(ExerciseStatistics$PbCadenceStatistics.class, ExerciseStatistics$PbCadenceStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExerciseStatistics$PbCadenceStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseStatistics$PbCadenceStatistics var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (ExerciseStatistics$PbCadenceStatistics)ExerciseStatistics$PbCadenceStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (ExerciseStatistics$PbCadenceStatistics)var10.getUnfinishedMessage();
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

   public ExerciseStatistics$PbCadenceStatistics$Builder mergeFrom(Message var1) {
      ExerciseStatistics$PbCadenceStatistics$Builder var2;
      if (var1 instanceof ExerciseStatistics$PbCadenceStatistics) {
         var2 = this.mergeFrom((ExerciseStatistics$PbCadenceStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseStatistics$PbCadenceStatistics$Builder mergeFrom(ExerciseStatistics$PbCadenceStatistics var1) {
      if (var1 != ExerciseStatistics$PbCadenceStatistics.getDefaultInstance()) {
         if (var1.hasAverage()) {
            this.setAverage(var1.getAverage());
         }

         if (var1.hasMaximum()) {
            this.setMaximum(var1.getMaximum());
         }

         this.mergeUnknownFields(ExerciseStatistics$PbCadenceStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseStatistics$PbCadenceStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbCadenceStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseStatistics$PbCadenceStatistics$Builder setAverage(int var1) {
      this.bitField0_ |= 1;
      this.average_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbCadenceStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbCadenceStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseStatistics$PbCadenceStatistics$Builder setMaximum(int var1) {
      this.bitField0_ |= 2;
      this.maximum_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbCadenceStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseStatistics$PbCadenceStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExerciseStatistics$PbCadenceStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbCadenceStatistics$Builder)super.setUnknownFields(var1);
   }
}
