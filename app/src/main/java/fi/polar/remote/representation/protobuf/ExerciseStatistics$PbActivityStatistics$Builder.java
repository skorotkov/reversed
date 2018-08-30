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

public final class ExerciseStatistics$PbActivityStatistics$Builder extends Builder implements ExerciseStatistics$PbActivityStatisticsOrBuilder {
   private float average_;
   private int bitField0_;

   private ExerciseStatistics$PbActivityStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExerciseStatistics$PbActivityStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseStatistics$PbActivityStatistics$Builder(BuilderParent var1, ExerciseStatistics$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseStatistics$PbActivityStatistics$Builder(ExerciseStatistics$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseStatistics.E();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseStatistics$PbActivityStatistics.b()) {
      }

   }

   public ExerciseStatistics$PbActivityStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbActivityStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseStatistics$PbActivityStatistics build() {
      ExerciseStatistics$PbActivityStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseStatistics$PbActivityStatistics buildPartial() {
      byte var1 = 1;
      ExerciseStatistics$PbActivityStatistics var2 = new ExerciseStatistics$PbActivityStatistics(this, (ExerciseStatistics$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      ExerciseStatistics$PbActivityStatistics.a(var2, this.average_);
      ExerciseStatistics$PbActivityStatistics.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public ExerciseStatistics$PbActivityStatistics$Builder clear() {
      super.clear();
      this.average_ = 0.0F;
      this.bitField0_ &= -2;
      return this;
   }

   public ExerciseStatistics$PbActivityStatistics$Builder clearAverage() {
      this.bitField0_ &= -2;
      this.average_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbActivityStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseStatistics$PbActivityStatistics$Builder)super.clearField(var1);
   }

   public ExerciseStatistics$PbActivityStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseStatistics$PbActivityStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseStatistics$PbActivityStatistics$Builder clone() {
      return (ExerciseStatistics$PbActivityStatistics$Builder)super.clone();
   }

   public float getAverage() {
      return this.average_;
   }

   public ExerciseStatistics$PbActivityStatistics getDefaultInstanceForType() {
      return ExerciseStatistics$PbActivityStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseStatistics.E();
   }

   public boolean hasAverage() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseStatistics.F().ensureFieldAccessorsInitialized(ExerciseStatistics$PbActivityStatistics.class, ExerciseStatistics$PbActivityStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExerciseStatistics$PbActivityStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseStatistics$PbActivityStatistics var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (ExerciseStatistics$PbActivityStatistics)ExerciseStatistics$PbActivityStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (ExerciseStatistics$PbActivityStatistics)var10.getUnfinishedMessage();
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

   public ExerciseStatistics$PbActivityStatistics$Builder mergeFrom(Message var1) {
      ExerciseStatistics$PbActivityStatistics$Builder var2;
      if (var1 instanceof ExerciseStatistics$PbActivityStatistics) {
         var2 = this.mergeFrom((ExerciseStatistics$PbActivityStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseStatistics$PbActivityStatistics$Builder mergeFrom(ExerciseStatistics$PbActivityStatistics var1) {
      if (var1 != ExerciseStatistics$PbActivityStatistics.getDefaultInstance()) {
         if (var1.hasAverage()) {
            this.setAverage(var1.getAverage());
         }

         this.mergeUnknownFields(ExerciseStatistics$PbActivityStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseStatistics$PbActivityStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbActivityStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseStatistics$PbActivityStatistics$Builder setAverage(float var1) {
      this.bitField0_ |= 1;
      this.average_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbActivityStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbActivityStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseStatistics$PbActivityStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseStatistics$PbActivityStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExerciseStatistics$PbActivityStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbActivityStatistics$Builder)super.setUnknownFields(var1);
   }
}
