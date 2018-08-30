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

public final class ExerciseLap$PbLapSwimmingStatistics$Builder extends Builder implements ExerciseLap$PbLapSwimmingStatisticsOrBuilder {
   private float avgDurationOfPool_;
   private int bitField0_;
   private int lapStrokes_;
   private int poolCount_;

   private ExerciseLap$PbLapSwimmingStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExerciseLap$PbLapSwimmingStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseLap$PbLapSwimmingStatistics$Builder(BuilderParent var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseLap$PbLapSwimmingStatistics$Builder(ExerciseLap$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.c();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseLap$PbLapSwimmingStatistics.b()) {
      }

   }

   public ExerciseLap$PbLapSwimmingStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapSwimmingStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseLap$PbLapSwimmingStatistics build() {
      ExerciseLap$PbLapSwimmingStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseLap$PbLapSwimmingStatistics buildPartial() {
      byte var1 = 1;
      ExerciseLap$PbLapSwimmingStatistics var2 = new ExerciseLap$PbLapSwimmingStatistics(this, (ExerciseLap$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ExerciseLap$PbLapSwimmingStatistics.a(var2, this.lapStrokes_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      ExerciseLap$PbLapSwimmingStatistics.b(var2, this.poolCount_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      ExerciseLap$PbLapSwimmingStatistics.a(var2, this.avgDurationOfPool_);
      ExerciseLap$PbLapSwimmingStatistics.c(var2, var5);
      this.onBuilt();
      return var2;
   }

   public ExerciseLap$PbLapSwimmingStatistics$Builder clear() {
      super.clear();
      this.lapStrokes_ = 0;
      this.bitField0_ &= -2;
      this.poolCount_ = 0;
      this.bitField0_ &= -3;
      this.avgDurationOfPool_ = 0.0F;
      this.bitField0_ &= -5;
      return this;
   }

   public ExerciseLap$PbLapSwimmingStatistics$Builder clearAvgDurationOfPool() {
      this.bitField0_ &= -5;
      this.avgDurationOfPool_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapSwimmingStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseLap$PbLapSwimmingStatistics$Builder)super.clearField(var1);
   }

   public ExerciseLap$PbLapSwimmingStatistics$Builder clearLapStrokes() {
      this.bitField0_ &= -2;
      this.lapStrokes_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapSwimmingStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseLap$PbLapSwimmingStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseLap$PbLapSwimmingStatistics$Builder clearPoolCount() {
      this.bitField0_ &= -3;
      this.poolCount_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapSwimmingStatistics$Builder clone() {
      return (ExerciseLap$PbLapSwimmingStatistics$Builder)super.clone();
   }

   public float getAvgDurationOfPool() {
      return this.avgDurationOfPool_;
   }

   public ExerciseLap$PbLapSwimmingStatistics getDefaultInstanceForType() {
      return ExerciseLap$PbLapSwimmingStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseLap.c();
   }

   public int getLapStrokes() {
      return this.lapStrokes_;
   }

   public int getPoolCount() {
      return this.poolCount_;
   }

   public boolean hasAvgDurationOfPool() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLapStrokes() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPoolCount() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseLap.d().ensureFieldAccessorsInitialized(ExerciseLap$PbLapSwimmingStatistics.class, ExerciseLap$PbLapSwimmingStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExerciseLap$PbLapSwimmingStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseLap$PbLapSwimmingStatistics var13;
      label96: {
         InvalidProtocolBufferException var12;
         ExerciseLap$PbLapSwimmingStatistics var14;
         try {
            var13 = (ExerciseLap$PbLapSwimmingStatistics)ExerciseLap$PbLapSwimmingStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (ExerciseLap$PbLapSwimmingStatistics)var10.getUnfinishedMessage();
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

   public ExerciseLap$PbLapSwimmingStatistics$Builder mergeFrom(Message var1) {
      ExerciseLap$PbLapSwimmingStatistics$Builder var2;
      if (var1 instanceof ExerciseLap$PbLapSwimmingStatistics) {
         var2 = this.mergeFrom((ExerciseLap$PbLapSwimmingStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseLap$PbLapSwimmingStatistics$Builder mergeFrom(ExerciseLap$PbLapSwimmingStatistics var1) {
      if (var1 != ExerciseLap$PbLapSwimmingStatistics.getDefaultInstance()) {
         if (var1.hasLapStrokes()) {
            this.setLapStrokes(var1.getLapStrokes());
         }

         if (var1.hasPoolCount()) {
            this.setPoolCount(var1.getPoolCount());
         }

         if (var1.hasAvgDurationOfPool()) {
            this.setAvgDurationOfPool(var1.getAvgDurationOfPool());
         }

         this.mergeUnknownFields(ExerciseLap$PbLapSwimmingStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseLap$PbLapSwimmingStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapSwimmingStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseLap$PbLapSwimmingStatistics$Builder setAvgDurationOfPool(float var1) {
      this.bitField0_ |= 4;
      this.avgDurationOfPool_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapSwimmingStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapSwimmingStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseLap$PbLapSwimmingStatistics$Builder setLapStrokes(int var1) {
      this.bitField0_ |= 1;
      this.lapStrokes_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapSwimmingStatistics$Builder setPoolCount(int var1) {
      this.bitField0_ |= 2;
      this.poolCount_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapSwimmingStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseLap$PbLapSwimmingStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExerciseLap$PbLapSwimmingStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapSwimmingStatistics$Builder)super.setUnknownFields(var1);
   }
}
