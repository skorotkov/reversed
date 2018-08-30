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

public final class ExerciseLap$PbLapCadenceStatistics$Builder extends Builder implements ExerciseLap$PbLapCadenceStatisticsOrBuilder {
   private int average_;
   private int bitField0_;
   private int maximum_;

   private ExerciseLap$PbLapCadenceStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExerciseLap$PbLapCadenceStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseLap$PbLapCadenceStatistics$Builder(BuilderParent var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseLap$PbLapCadenceStatistics$Builder(ExerciseLap$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.i();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseLap$PbLapCadenceStatistics.b()) {
      }

   }

   public ExerciseLap$PbLapCadenceStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapCadenceStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseLap$PbLapCadenceStatistics build() {
      ExerciseLap$PbLapCadenceStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseLap$PbLapCadenceStatistics buildPartial() {
      byte var1 = 1;
      ExerciseLap$PbLapCadenceStatistics var2 = new ExerciseLap$PbLapCadenceStatistics(this, (ExerciseLap$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ExerciseLap$PbLapCadenceStatistics.a(var2, this.average_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      ExerciseLap$PbLapCadenceStatistics.b(var2, this.maximum_);
      ExerciseLap$PbLapCadenceStatistics.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public ExerciseLap$PbLapCadenceStatistics$Builder clear() {
      super.clear();
      this.average_ = 0;
      this.bitField0_ &= -2;
      this.maximum_ = 0;
      this.bitField0_ &= -3;
      return this;
   }

   public ExerciseLap$PbLapCadenceStatistics$Builder clearAverage() {
      this.bitField0_ &= -2;
      this.average_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapCadenceStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseLap$PbLapCadenceStatistics$Builder)super.clearField(var1);
   }

   public ExerciseLap$PbLapCadenceStatistics$Builder clearMaximum() {
      this.bitField0_ &= -3;
      this.maximum_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapCadenceStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseLap$PbLapCadenceStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseLap$PbLapCadenceStatistics$Builder clone() {
      return (ExerciseLap$PbLapCadenceStatistics$Builder)super.clone();
   }

   public int getAverage() {
      return this.average_;
   }

   public ExerciseLap$PbLapCadenceStatistics getDefaultInstanceForType() {
      return ExerciseLap$PbLapCadenceStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseLap.i();
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
      return ExerciseLap.j().ensureFieldAccessorsInitialized(ExerciseLap$PbLapCadenceStatistics.class, ExerciseLap$PbLapCadenceStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExerciseLap$PbLapCadenceStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseLap$PbLapCadenceStatistics var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (ExerciseLap$PbLapCadenceStatistics)ExerciseLap$PbLapCadenceStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (ExerciseLap$PbLapCadenceStatistics)var10.getUnfinishedMessage();
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

   public ExerciseLap$PbLapCadenceStatistics$Builder mergeFrom(Message var1) {
      ExerciseLap$PbLapCadenceStatistics$Builder var2;
      if (var1 instanceof ExerciseLap$PbLapCadenceStatistics) {
         var2 = this.mergeFrom((ExerciseLap$PbLapCadenceStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseLap$PbLapCadenceStatistics$Builder mergeFrom(ExerciseLap$PbLapCadenceStatistics var1) {
      if (var1 != ExerciseLap$PbLapCadenceStatistics.getDefaultInstance()) {
         if (var1.hasAverage()) {
            this.setAverage(var1.getAverage());
         }

         if (var1.hasMaximum()) {
            this.setMaximum(var1.getMaximum());
         }

         this.mergeUnknownFields(ExerciseLap$PbLapCadenceStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseLap$PbLapCadenceStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapCadenceStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseLap$PbLapCadenceStatistics$Builder setAverage(int var1) {
      this.bitField0_ |= 1;
      this.average_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapCadenceStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapCadenceStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseLap$PbLapCadenceStatistics$Builder setMaximum(int var1) {
      this.bitField0_ |= 2;
      this.maximum_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapCadenceStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseLap$PbLapCadenceStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExerciseLap$PbLapCadenceStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapCadenceStatistics$Builder)super.setUnknownFields(var1);
   }
}
