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

public final class ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder extends Builder implements ExercisePhaseStats$PbPhaseStrideLengthStatisticsOrBuilder {
   private int average_;
   private int bitField0_;

   private ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder(BuilderParent var1, ExercisePhaseStats$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder(ExercisePhaseStats$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExercisePhaseStats.c();
   }

   private void maybeForceBuilderInitialization() {
      if (ExercisePhaseStats$PbPhaseStrideLengthStatistics.b()) {
      }

   }

   public ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExercisePhaseStats$PbPhaseStrideLengthStatistics build() {
      ExercisePhaseStats$PbPhaseStrideLengthStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExercisePhaseStats$PbPhaseStrideLengthStatistics buildPartial() {
      byte var1 = 1;
      ExercisePhaseStats$PbPhaseStrideLengthStatistics var2 = new ExercisePhaseStats$PbPhaseStrideLengthStatistics(this, (ExercisePhaseStats$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      ExercisePhaseStats$PbPhaseStrideLengthStatistics.a(var2, this.average_);
      ExercisePhaseStats$PbPhaseStrideLengthStatistics.b(var2, var1);
      this.onBuilt();
      return var2;
   }

   public ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder clear() {
      super.clear();
      this.average_ = 0;
      this.bitField0_ &= -2;
      return this;
   }

   public ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder clearAverage() {
      this.bitField0_ &= -2;
      this.average_ = 0;
      this.onChanged();
      return this;
   }

   public ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder)super.clearField(var1);
   }

   public ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder)super.clearOneof(var1);
   }

   public ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder clone() {
      return (ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder)super.clone();
   }

   public int getAverage() {
      return this.average_;
   }

   public ExercisePhaseStats$PbPhaseStrideLengthStatistics getDefaultInstanceForType() {
      return ExercisePhaseStats$PbPhaseStrideLengthStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExercisePhaseStats.c();
   }

   public boolean hasAverage() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExercisePhaseStats.d().ensureFieldAccessorsInitialized(ExercisePhaseStats$PbPhaseStrideLengthStatistics.class, ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExercisePhaseStats$PbPhaseStrideLengthStatistics var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (ExercisePhaseStats$PbPhaseStrideLengthStatistics)ExercisePhaseStats$PbPhaseStrideLengthStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (ExercisePhaseStats$PbPhaseStrideLengthStatistics)var10.getUnfinishedMessage();
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

   public ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder mergeFrom(Message var1) {
      ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder var2;
      if (var1 instanceof ExercisePhaseStats$PbPhaseStrideLengthStatistics) {
         var2 = this.mergeFrom((ExercisePhaseStats$PbPhaseStrideLengthStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder mergeFrom(ExercisePhaseStats$PbPhaseStrideLengthStatistics var1) {
      if (var1 != ExercisePhaseStats$PbPhaseStrideLengthStatistics.getDefaultInstance()) {
         if (var1.hasAverage()) {
            this.setAverage(var1.getAverage());
         }

         this.mergeUnknownFields(ExercisePhaseStats$PbPhaseStrideLengthStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder setAverage(int var1) {
      this.bitField0_ |= 1;
      this.average_ = var1;
      this.onChanged();
      return this;
   }

   public ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder)super.setField(var1, var2);
   }

   public ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder)super.setUnknownFields(var1);
   }
}
