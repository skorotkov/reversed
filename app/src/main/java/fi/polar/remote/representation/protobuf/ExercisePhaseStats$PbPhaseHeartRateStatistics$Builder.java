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

public final class ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder extends Builder implements ExercisePhaseStats$PbPhaseHeartRateStatisticsOrBuilder {
   private int average_;
   private int bitField0_;
   private int maximum_;

   private ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder(BuilderParent var1, ExercisePhaseStats$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder(ExercisePhaseStats$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExercisePhaseStats.a();
   }

   private void maybeForceBuilderInitialization() {
      if (ExercisePhaseStats$PbPhaseHeartRateStatistics.b()) {
      }

   }

   public ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExercisePhaseStats$PbPhaseHeartRateStatistics build() {
      ExercisePhaseStats$PbPhaseHeartRateStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExercisePhaseStats$PbPhaseHeartRateStatistics buildPartial() {
      byte var1 = 1;
      ExercisePhaseStats$PbPhaseHeartRateStatistics var2 = new ExercisePhaseStats$PbPhaseHeartRateStatistics(this, (ExercisePhaseStats$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ExercisePhaseStats$PbPhaseHeartRateStatistics.a(var2, this.average_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      ExercisePhaseStats$PbPhaseHeartRateStatistics.b(var2, this.maximum_);
      ExercisePhaseStats$PbPhaseHeartRateStatistics.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder clear() {
      super.clear();
      this.average_ = 0;
      this.bitField0_ &= -2;
      this.maximum_ = 0;
      this.bitField0_ &= -3;
      return this;
   }

   public ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder clearAverage() {
      this.bitField0_ &= -2;
      this.average_ = 0;
      this.onChanged();
      return this;
   }

   public ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder)super.clearField(var1);
   }

   public ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder clearMaximum() {
      this.bitField0_ &= -3;
      this.maximum_ = 0;
      this.onChanged();
      return this;
   }

   public ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder)super.clearOneof(var1);
   }

   public ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder clone() {
      return (ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder)super.clone();
   }

   public int getAverage() {
      return this.average_;
   }

   public ExercisePhaseStats$PbPhaseHeartRateStatistics getDefaultInstanceForType() {
      return ExercisePhaseStats$PbPhaseHeartRateStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExercisePhaseStats.a();
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
      return ExercisePhaseStats.b().ensureFieldAccessorsInitialized(ExercisePhaseStats$PbPhaseHeartRateStatistics.class, ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExercisePhaseStats$PbPhaseHeartRateStatistics var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (ExercisePhaseStats$PbPhaseHeartRateStatistics)ExercisePhaseStats$PbPhaseHeartRateStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (ExercisePhaseStats$PbPhaseHeartRateStatistics)var11.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var14.unwrapIOException();
         } catch (Throwable var10) {
            if (var13 != null) {
               this.mergeFrom(var13);
            }

            throw var10;
         }
      }

      if (var13 != null) {
         this.mergeFrom(var13);
      }

      return this;
   }

   public ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder mergeFrom(Message var1) {
      ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder var2;
      if (var1 instanceof ExercisePhaseStats$PbPhaseHeartRateStatistics) {
         var2 = this.mergeFrom((ExercisePhaseStats$PbPhaseHeartRateStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder mergeFrom(ExercisePhaseStats$PbPhaseHeartRateStatistics var1) {
      if (var1 != ExercisePhaseStats$PbPhaseHeartRateStatistics.getDefaultInstance()) {
         if (var1.hasAverage()) {
            this.setAverage(var1.getAverage());
         }

         if (var1.hasMaximum()) {
            this.setMaximum(var1.getMaximum());
         }

         this.mergeUnknownFields(ExercisePhaseStats$PbPhaseHeartRateStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder setAverage(int var1) {
      this.bitField0_ |= 1;
      this.average_ = var1;
      this.onChanged();
      return this;
   }

   public ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder)super.setField(var1, var2);
   }

   public ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder setMaximum(int var1) {
      this.bitField0_ |= 2;
      this.maximum_ = var1;
      this.onChanged();
      return this;
   }

   public ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExercisePhaseStats$PbPhaseHeartRateStatistics$Builder)super.setUnknownFields(var1);
   }
}
