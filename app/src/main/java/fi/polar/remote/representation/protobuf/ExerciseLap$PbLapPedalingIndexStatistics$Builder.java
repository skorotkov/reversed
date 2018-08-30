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

public final class ExerciseLap$PbLapPedalingIndexStatistics$Builder extends Builder implements ExerciseLap$PbLapPedalingIndexStatisticsOrBuilder {
   private int average_;
   private int bitField0_;

   private ExerciseLap$PbLapPedalingIndexStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExerciseLap$PbLapPedalingIndexStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseLap$PbLapPedalingIndexStatistics$Builder(BuilderParent var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseLap$PbLapPedalingIndexStatistics$Builder(ExerciseLap$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.o();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseLap$PbLapPedalingIndexStatistics.b()) {
      }

   }

   public ExerciseLap$PbLapPedalingIndexStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapPedalingIndexStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseLap$PbLapPedalingIndexStatistics build() {
      ExerciseLap$PbLapPedalingIndexStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseLap$PbLapPedalingIndexStatistics buildPartial() {
      byte var1 = 1;
      ExerciseLap$PbLapPedalingIndexStatistics var2 = new ExerciseLap$PbLapPedalingIndexStatistics(this, (ExerciseLap$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      ExerciseLap$PbLapPedalingIndexStatistics.a(var2, this.average_);
      ExerciseLap$PbLapPedalingIndexStatistics.b(var2, var1);
      this.onBuilt();
      return var2;
   }

   public ExerciseLap$PbLapPedalingIndexStatistics$Builder clear() {
      super.clear();
      this.average_ = 0;
      this.bitField0_ &= -2;
      return this;
   }

   public ExerciseLap$PbLapPedalingIndexStatistics$Builder clearAverage() {
      this.bitField0_ &= -2;
      this.average_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapPedalingIndexStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseLap$PbLapPedalingIndexStatistics$Builder)super.clearField(var1);
   }

   public ExerciseLap$PbLapPedalingIndexStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseLap$PbLapPedalingIndexStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseLap$PbLapPedalingIndexStatistics$Builder clone() {
      return (ExerciseLap$PbLapPedalingIndexStatistics$Builder)super.clone();
   }

   public int getAverage() {
      return this.average_;
   }

   public ExerciseLap$PbLapPedalingIndexStatistics getDefaultInstanceForType() {
      return ExerciseLap$PbLapPedalingIndexStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseLap.o();
   }

   public boolean hasAverage() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseLap.p().ensureFieldAccessorsInitialized(ExerciseLap$PbLapPedalingIndexStatistics.class, ExerciseLap$PbLapPedalingIndexStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExerciseLap$PbLapPedalingIndexStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseLap$PbLapPedalingIndexStatistics var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (ExerciseLap$PbLapPedalingIndexStatistics)ExerciseLap$PbLapPedalingIndexStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (ExerciseLap$PbLapPedalingIndexStatistics)var10.getUnfinishedMessage();
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

   public ExerciseLap$PbLapPedalingIndexStatistics$Builder mergeFrom(Message var1) {
      ExerciseLap$PbLapPedalingIndexStatistics$Builder var2;
      if (var1 instanceof ExerciseLap$PbLapPedalingIndexStatistics) {
         var2 = this.mergeFrom((ExerciseLap$PbLapPedalingIndexStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseLap$PbLapPedalingIndexStatistics$Builder mergeFrom(ExerciseLap$PbLapPedalingIndexStatistics var1) {
      if (var1 != ExerciseLap$PbLapPedalingIndexStatistics.getDefaultInstance()) {
         if (var1.hasAverage()) {
            this.setAverage(var1.getAverage());
         }

         this.mergeUnknownFields(ExerciseLap$PbLapPedalingIndexStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseLap$PbLapPedalingIndexStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapPedalingIndexStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseLap$PbLapPedalingIndexStatistics$Builder setAverage(int var1) {
      this.bitField0_ |= 1;
      this.average_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapPedalingIndexStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapPedalingIndexStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseLap$PbLapPedalingIndexStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseLap$PbLapPedalingIndexStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExerciseLap$PbLapPedalingIndexStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapPedalingIndexStatistics$Builder)super.setUnknownFields(var1);
   }
}
