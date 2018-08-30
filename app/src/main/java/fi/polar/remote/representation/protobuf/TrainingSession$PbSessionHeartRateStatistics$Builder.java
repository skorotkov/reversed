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

public final class TrainingSession$PbSessionHeartRateStatistics$Builder extends Builder implements TrainingSession$PbSessionHeartRateStatisticsOrBuilder {
   private int average_;
   private int bitField0_;
   private int maximum_;

   private TrainingSession$PbSessionHeartRateStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private TrainingSession$PbSessionHeartRateStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   TrainingSession$PbSessionHeartRateStatistics$Builder(BuilderParent var1, TrainingSession$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   TrainingSession$PbSessionHeartRateStatistics$Builder(TrainingSession$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return TrainingSession.a();
   }

   private void maybeForceBuilderInitialization() {
      if (TrainingSession$PbSessionHeartRateStatistics.b()) {
      }

   }

   public TrainingSession$PbSessionHeartRateStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (TrainingSession$PbSessionHeartRateStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public TrainingSession$PbSessionHeartRateStatistics build() {
      TrainingSession$PbSessionHeartRateStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public TrainingSession$PbSessionHeartRateStatistics buildPartial() {
      byte var1 = 1;
      TrainingSession$PbSessionHeartRateStatistics var2 = new TrainingSession$PbSessionHeartRateStatistics(this, (TrainingSession$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      TrainingSession$PbSessionHeartRateStatistics.a(var2, this.average_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      TrainingSession$PbSessionHeartRateStatistics.b(var2, this.maximum_);
      TrainingSession$PbSessionHeartRateStatistics.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public TrainingSession$PbSessionHeartRateStatistics$Builder clear() {
      super.clear();
      this.average_ = 0;
      this.bitField0_ &= -2;
      this.maximum_ = 0;
      this.bitField0_ &= -3;
      return this;
   }

   public TrainingSession$PbSessionHeartRateStatistics$Builder clearAverage() {
      this.bitField0_ &= -2;
      this.average_ = 0;
      this.onChanged();
      return this;
   }

   public TrainingSession$PbSessionHeartRateStatistics$Builder clearField(FieldDescriptor var1) {
      return (TrainingSession$PbSessionHeartRateStatistics$Builder)super.clearField(var1);
   }

   public TrainingSession$PbSessionHeartRateStatistics$Builder clearMaximum() {
      this.bitField0_ &= -3;
      this.maximum_ = 0;
      this.onChanged();
      return this;
   }

   public TrainingSession$PbSessionHeartRateStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (TrainingSession$PbSessionHeartRateStatistics$Builder)super.clearOneof(var1);
   }

   public TrainingSession$PbSessionHeartRateStatistics$Builder clone() {
      return (TrainingSession$PbSessionHeartRateStatistics$Builder)super.clone();
   }

   public int getAverage() {
      return this.average_;
   }

   public TrainingSession$PbSessionHeartRateStatistics getDefaultInstanceForType() {
      return TrainingSession$PbSessionHeartRateStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return TrainingSession.a();
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
      return TrainingSession.b().ensureFieldAccessorsInitialized(TrainingSession$PbSessionHeartRateStatistics.class, TrainingSession$PbSessionHeartRateStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public TrainingSession$PbSessionHeartRateStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      TrainingSession$PbSessionHeartRateStatistics var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (TrainingSession$PbSessionHeartRateStatistics)TrainingSession$PbSessionHeartRateStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (TrainingSession$PbSessionHeartRateStatistics)var10.getUnfinishedMessage();
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

   public TrainingSession$PbSessionHeartRateStatistics$Builder mergeFrom(Message var1) {
      TrainingSession$PbSessionHeartRateStatistics$Builder var2;
      if (var1 instanceof TrainingSession$PbSessionHeartRateStatistics) {
         var2 = this.mergeFrom((TrainingSession$PbSessionHeartRateStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public TrainingSession$PbSessionHeartRateStatistics$Builder mergeFrom(TrainingSession$PbSessionHeartRateStatistics var1) {
      if (var1 != TrainingSession$PbSessionHeartRateStatistics.getDefaultInstance()) {
         if (var1.hasAverage()) {
            this.setAverage(var1.getAverage());
         }

         if (var1.hasMaximum()) {
            this.setMaximum(var1.getMaximum());
         }

         this.mergeUnknownFields(TrainingSession$PbSessionHeartRateStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final TrainingSession$PbSessionHeartRateStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (TrainingSession$PbSessionHeartRateStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public TrainingSession$PbSessionHeartRateStatistics$Builder setAverage(int var1) {
      this.bitField0_ |= 1;
      this.average_ = var1;
      this.onChanged();
      return this;
   }

   public TrainingSession$PbSessionHeartRateStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (TrainingSession$PbSessionHeartRateStatistics$Builder)super.setField(var1, var2);
   }

   public TrainingSession$PbSessionHeartRateStatistics$Builder setMaximum(int var1) {
      this.bitField0_ |= 2;
      this.maximum_ = var1;
      this.onChanged();
      return this;
   }

   public TrainingSession$PbSessionHeartRateStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (TrainingSession$PbSessionHeartRateStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final TrainingSession$PbSessionHeartRateStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (TrainingSession$PbSessionHeartRateStatistics$Builder)super.setUnknownFields(var1);
   }
}
