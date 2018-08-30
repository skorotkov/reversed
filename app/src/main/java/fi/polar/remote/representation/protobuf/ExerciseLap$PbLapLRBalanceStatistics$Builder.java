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

public final class ExerciseLap$PbLapLRBalanceStatistics$Builder extends Builder implements ExerciseLap$PbLapLRBalanceStatisticsOrBuilder {
   private float average_;
   private int bitField0_;

   private ExerciseLap$PbLapLRBalanceStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExerciseLap$PbLapLRBalanceStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseLap$PbLapLRBalanceStatistics$Builder(BuilderParent var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseLap$PbLapLRBalanceStatistics$Builder(ExerciseLap$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.m();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseLap$PbLapLRBalanceStatistics.b()) {
      }

   }

   public ExerciseLap$PbLapLRBalanceStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapLRBalanceStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseLap$PbLapLRBalanceStatistics build() {
      ExerciseLap$PbLapLRBalanceStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseLap$PbLapLRBalanceStatistics buildPartial() {
      byte var1 = 1;
      ExerciseLap$PbLapLRBalanceStatistics var2 = new ExerciseLap$PbLapLRBalanceStatistics(this, (ExerciseLap$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      ExerciseLap$PbLapLRBalanceStatistics.a(var2, this.average_);
      ExerciseLap$PbLapLRBalanceStatistics.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public ExerciseLap$PbLapLRBalanceStatistics$Builder clear() {
      super.clear();
      this.average_ = 0.0F;
      this.bitField0_ &= -2;
      return this;
   }

   public ExerciseLap$PbLapLRBalanceStatistics$Builder clearAverage() {
      this.bitField0_ &= -2;
      this.average_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapLRBalanceStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseLap$PbLapLRBalanceStatistics$Builder)super.clearField(var1);
   }

   public ExerciseLap$PbLapLRBalanceStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseLap$PbLapLRBalanceStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseLap$PbLapLRBalanceStatistics$Builder clone() {
      return (ExerciseLap$PbLapLRBalanceStatistics$Builder)super.clone();
   }

   public float getAverage() {
      return this.average_;
   }

   public ExerciseLap$PbLapLRBalanceStatistics getDefaultInstanceForType() {
      return ExerciseLap$PbLapLRBalanceStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseLap.m();
   }

   public boolean hasAverage() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseLap.n().ensureFieldAccessorsInitialized(ExerciseLap$PbLapLRBalanceStatistics.class, ExerciseLap$PbLapLRBalanceStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExerciseLap$PbLapLRBalanceStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseLap$PbLapLRBalanceStatistics var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (ExerciseLap$PbLapLRBalanceStatistics)ExerciseLap$PbLapLRBalanceStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (ExerciseLap$PbLapLRBalanceStatistics)var10.getUnfinishedMessage();
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

   public ExerciseLap$PbLapLRBalanceStatistics$Builder mergeFrom(Message var1) {
      ExerciseLap$PbLapLRBalanceStatistics$Builder var2;
      if (var1 instanceof ExerciseLap$PbLapLRBalanceStatistics) {
         var2 = this.mergeFrom((ExerciseLap$PbLapLRBalanceStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseLap$PbLapLRBalanceStatistics$Builder mergeFrom(ExerciseLap$PbLapLRBalanceStatistics var1) {
      if (var1 != ExerciseLap$PbLapLRBalanceStatistics.getDefaultInstance()) {
         if (var1.hasAverage()) {
            this.setAverage(var1.getAverage());
         }

         this.mergeUnknownFields(ExerciseLap$PbLapLRBalanceStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseLap$PbLapLRBalanceStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapLRBalanceStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseLap$PbLapLRBalanceStatistics$Builder setAverage(float var1) {
      this.bitField0_ |= 1;
      this.average_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapLRBalanceStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapLRBalanceStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseLap$PbLapLRBalanceStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseLap$PbLapLRBalanceStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExerciseLap$PbLapLRBalanceStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapLRBalanceStatistics$Builder)super.setUnknownFields(var1);
   }
}
