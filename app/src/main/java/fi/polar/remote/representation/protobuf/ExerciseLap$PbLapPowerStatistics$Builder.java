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

public final class ExerciseLap$PbLapPowerStatistics$Builder extends Builder implements ExerciseLap$PbLapPowerStatisticsOrBuilder {
   private int average_;
   private int bitField0_;
   private int maximum_;

   private ExerciseLap$PbLapPowerStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExerciseLap$PbLapPowerStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseLap$PbLapPowerStatistics$Builder(BuilderParent var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseLap$PbLapPowerStatistics$Builder(ExerciseLap$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.k();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseLap$PbLapPowerStatistics.b()) {
      }

   }

   public ExerciseLap$PbLapPowerStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapPowerStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseLap$PbLapPowerStatistics build() {
      ExerciseLap$PbLapPowerStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseLap$PbLapPowerStatistics buildPartial() {
      byte var1 = 1;
      ExerciseLap$PbLapPowerStatistics var2 = new ExerciseLap$PbLapPowerStatistics(this, (ExerciseLap$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ExerciseLap$PbLapPowerStatistics.a(var2, this.average_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      ExerciseLap$PbLapPowerStatistics.b(var2, this.maximum_);
      ExerciseLap$PbLapPowerStatistics.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public ExerciseLap$PbLapPowerStatistics$Builder clear() {
      super.clear();
      this.average_ = 0;
      this.bitField0_ &= -2;
      this.maximum_ = 0;
      this.bitField0_ &= -3;
      return this;
   }

   public ExerciseLap$PbLapPowerStatistics$Builder clearAverage() {
      this.bitField0_ &= -2;
      this.average_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapPowerStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseLap$PbLapPowerStatistics$Builder)super.clearField(var1);
   }

   public ExerciseLap$PbLapPowerStatistics$Builder clearMaximum() {
      this.bitField0_ &= -3;
      this.maximum_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapPowerStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseLap$PbLapPowerStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseLap$PbLapPowerStatistics$Builder clone() {
      return (ExerciseLap$PbLapPowerStatistics$Builder)super.clone();
   }

   public int getAverage() {
      return this.average_;
   }

   public ExerciseLap$PbLapPowerStatistics getDefaultInstanceForType() {
      return ExerciseLap$PbLapPowerStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseLap.k();
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
      return ExerciseLap.l().ensureFieldAccessorsInitialized(ExerciseLap$PbLapPowerStatistics.class, ExerciseLap$PbLapPowerStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExerciseLap$PbLapPowerStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseLap$PbLapPowerStatistics var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (ExerciseLap$PbLapPowerStatistics)ExerciseLap$PbLapPowerStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (ExerciseLap$PbLapPowerStatistics)var10.getUnfinishedMessage();
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

   public ExerciseLap$PbLapPowerStatistics$Builder mergeFrom(Message var1) {
      ExerciseLap$PbLapPowerStatistics$Builder var2;
      if (var1 instanceof ExerciseLap$PbLapPowerStatistics) {
         var2 = this.mergeFrom((ExerciseLap$PbLapPowerStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseLap$PbLapPowerStatistics$Builder mergeFrom(ExerciseLap$PbLapPowerStatistics var1) {
      if (var1 != ExerciseLap$PbLapPowerStatistics.getDefaultInstance()) {
         if (var1.hasAverage()) {
            this.setAverage(var1.getAverage());
         }

         if (var1.hasMaximum()) {
            this.setMaximum(var1.getMaximum());
         }

         this.mergeUnknownFields(ExerciseLap$PbLapPowerStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseLap$PbLapPowerStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapPowerStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseLap$PbLapPowerStatistics$Builder setAverage(int var1) {
      this.bitField0_ |= 1;
      this.average_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapPowerStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapPowerStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseLap$PbLapPowerStatistics$Builder setMaximum(int var1) {
      this.bitField0_ |= 2;
      this.maximum_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapPowerStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseLap$PbLapPowerStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExerciseLap$PbLapPowerStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapPowerStatistics$Builder)super.setUnknownFields(var1);
   }
}
