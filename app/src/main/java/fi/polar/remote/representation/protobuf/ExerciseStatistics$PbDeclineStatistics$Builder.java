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

public final class ExerciseStatistics$PbDeclineStatistics$Builder extends Builder implements ExerciseStatistics$PbDeclineStatisticsOrBuilder {
   private float average_;
   private int bitField0_;
   private float maximum_;

   private ExerciseStatistics$PbDeclineStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExerciseStatistics$PbDeclineStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseStatistics$PbDeclineStatistics$Builder(BuilderParent var1, ExerciseStatistics$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseStatistics$PbDeclineStatistics$Builder(ExerciseStatistics$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseStatistics.C();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseStatistics$PbDeclineStatistics.b()) {
      }

   }

   public ExerciseStatistics$PbDeclineStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbDeclineStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseStatistics$PbDeclineStatistics build() {
      ExerciseStatistics$PbDeclineStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseStatistics$PbDeclineStatistics buildPartial() {
      byte var1 = 1;
      ExerciseStatistics$PbDeclineStatistics var2 = new ExerciseStatistics$PbDeclineStatistics(this, (ExerciseStatistics$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ExerciseStatistics$PbDeclineStatistics.a(var2, this.average_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      ExerciseStatistics$PbDeclineStatistics.b(var2, this.maximum_);
      ExerciseStatistics$PbDeclineStatistics.a(var2, var4);
      this.onBuilt();
      return var2;
   }

   public ExerciseStatistics$PbDeclineStatistics$Builder clear() {
      super.clear();
      this.average_ = 0.0F;
      this.bitField0_ &= -2;
      this.maximum_ = 0.0F;
      this.bitField0_ &= -3;
      return this;
   }

   public ExerciseStatistics$PbDeclineStatistics$Builder clearAverage() {
      this.bitField0_ &= -2;
      this.average_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbDeclineStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseStatistics$PbDeclineStatistics$Builder)super.clearField(var1);
   }

   public ExerciseStatistics$PbDeclineStatistics$Builder clearMaximum() {
      this.bitField0_ &= -3;
      this.maximum_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbDeclineStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseStatistics$PbDeclineStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseStatistics$PbDeclineStatistics$Builder clone() {
      return (ExerciseStatistics$PbDeclineStatistics$Builder)super.clone();
   }

   public float getAverage() {
      return this.average_;
   }

   public ExerciseStatistics$PbDeclineStatistics getDefaultInstanceForType() {
      return ExerciseStatistics$PbDeclineStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseStatistics.C();
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
      return ExerciseStatistics.D().ensureFieldAccessorsInitialized(ExerciseStatistics$PbDeclineStatistics.class, ExerciseStatistics$PbDeclineStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExerciseStatistics$PbDeclineStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseStatistics$PbDeclineStatistics var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (ExerciseStatistics$PbDeclineStatistics)ExerciseStatistics$PbDeclineStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (ExerciseStatistics$PbDeclineStatistics)var10.getUnfinishedMessage();
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

   public ExerciseStatistics$PbDeclineStatistics$Builder mergeFrom(Message var1) {
      ExerciseStatistics$PbDeclineStatistics$Builder var2;
      if (var1 instanceof ExerciseStatistics$PbDeclineStatistics) {
         var2 = this.mergeFrom((ExerciseStatistics$PbDeclineStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseStatistics$PbDeclineStatistics$Builder mergeFrom(ExerciseStatistics$PbDeclineStatistics var1) {
      if (var1 != ExerciseStatistics$PbDeclineStatistics.getDefaultInstance()) {
         if (var1.hasAverage()) {
            this.setAverage(var1.getAverage());
         }

         if (var1.hasMaximum()) {
            this.setMaximum(var1.getMaximum());
         }

         this.mergeUnknownFields(ExerciseStatistics$PbDeclineStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseStatistics$PbDeclineStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbDeclineStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseStatistics$PbDeclineStatistics$Builder setAverage(float var1) {
      this.bitField0_ |= 1;
      this.average_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbDeclineStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbDeclineStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseStatistics$PbDeclineStatistics$Builder setMaximum(float var1) {
      this.bitField0_ |= 2;
      this.maximum_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbDeclineStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseStatistics$PbDeclineStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExerciseStatistics$PbDeclineStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbDeclineStatistics$Builder)super.setUnknownFields(var1);
   }
}
