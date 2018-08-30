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

public final class ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder extends Builder implements ExerciseLap$PbLapPedalingEfficiencyStatisticsOrBuilder {
   private int average_;
   private int bitField0_;

   private ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder(BuilderParent var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder(ExerciseLap$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.q();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseLap$PbLapPedalingEfficiencyStatistics.b()) {
      }

   }

   public ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseLap$PbLapPedalingEfficiencyStatistics build() {
      ExerciseLap$PbLapPedalingEfficiencyStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseLap$PbLapPedalingEfficiencyStatistics buildPartial() {
      byte var1 = 1;
      ExerciseLap$PbLapPedalingEfficiencyStatistics var2 = new ExerciseLap$PbLapPedalingEfficiencyStatistics(this, (ExerciseLap$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      ExerciseLap$PbLapPedalingEfficiencyStatistics.a(var2, this.average_);
      ExerciseLap$PbLapPedalingEfficiencyStatistics.b(var2, var1);
      this.onBuilt();
      return var2;
   }

   public ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder clear() {
      super.clear();
      this.average_ = 0;
      this.bitField0_ &= -2;
      return this;
   }

   public ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder clearAverage() {
      this.bitField0_ &= -2;
      this.average_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder)super.clearField(var1);
   }

   public ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder clone() {
      return (ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder)super.clone();
   }

   public int getAverage() {
      return this.average_;
   }

   public ExerciseLap$PbLapPedalingEfficiencyStatistics getDefaultInstanceForType() {
      return ExerciseLap$PbLapPedalingEfficiencyStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseLap.q();
   }

   public boolean hasAverage() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseLap.r().ensureFieldAccessorsInitialized(ExerciseLap$PbLapPedalingEfficiencyStatistics.class, ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseLap$PbLapPedalingEfficiencyStatistics var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (ExerciseLap$PbLapPedalingEfficiencyStatistics)ExerciseLap$PbLapPedalingEfficiencyStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (ExerciseLap$PbLapPedalingEfficiencyStatistics)var11.getUnfinishedMessage();
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

   public ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder mergeFrom(Message var1) {
      ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder var2;
      if (var1 instanceof ExerciseLap$PbLapPedalingEfficiencyStatistics) {
         var2 = this.mergeFrom((ExerciseLap$PbLapPedalingEfficiencyStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder mergeFrom(ExerciseLap$PbLapPedalingEfficiencyStatistics var1) {
      if (var1 != ExerciseLap$PbLapPedalingEfficiencyStatistics.getDefaultInstance()) {
         if (var1.hasAverage()) {
            this.setAverage(var1.getAverage());
         }

         this.mergeUnknownFields(ExerciseLap$PbLapPedalingEfficiencyStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder setAverage(int var1) {
      this.bitField0_ |= 1;
      this.average_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder)super.setUnknownFields(var1);
   }
}
