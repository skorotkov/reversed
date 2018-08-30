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

public final class ExerciseStatistics$PbLRBalanceStatistics$Builder extends Builder implements ExerciseStatistics$PbLRBalanceStatisticsOrBuilder {
   private float average_;
   private int bitField0_;

   private ExerciseStatistics$PbLRBalanceStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExerciseStatistics$PbLRBalanceStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseStatistics$PbLRBalanceStatistics$Builder(BuilderParent var1, ExerciseStatistics$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseStatistics$PbLRBalanceStatistics$Builder(ExerciseStatistics$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseStatistics.s();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseStatistics$PbLRBalanceStatistics.b()) {
      }

   }

   public ExerciseStatistics$PbLRBalanceStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbLRBalanceStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseStatistics$PbLRBalanceStatistics build() {
      ExerciseStatistics$PbLRBalanceStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseStatistics$PbLRBalanceStatistics buildPartial() {
      byte var1 = 1;
      ExerciseStatistics$PbLRBalanceStatistics var2 = new ExerciseStatistics$PbLRBalanceStatistics(this, (ExerciseStatistics$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      ExerciseStatistics$PbLRBalanceStatistics.a(var2, this.average_);
      ExerciseStatistics$PbLRBalanceStatistics.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public ExerciseStatistics$PbLRBalanceStatistics$Builder clear() {
      super.clear();
      this.average_ = 0.0F;
      this.bitField0_ &= -2;
      return this;
   }

   public ExerciseStatistics$PbLRBalanceStatistics$Builder clearAverage() {
      this.bitField0_ &= -2;
      this.average_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbLRBalanceStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseStatistics$PbLRBalanceStatistics$Builder)super.clearField(var1);
   }

   public ExerciseStatistics$PbLRBalanceStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseStatistics$PbLRBalanceStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseStatistics$PbLRBalanceStatistics$Builder clone() {
      return (ExerciseStatistics$PbLRBalanceStatistics$Builder)super.clone();
   }

   public float getAverage() {
      return this.average_;
   }

   public ExerciseStatistics$PbLRBalanceStatistics getDefaultInstanceForType() {
      return ExerciseStatistics$PbLRBalanceStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseStatistics.s();
   }

   public boolean hasAverage() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseStatistics.t().ensureFieldAccessorsInitialized(ExerciseStatistics$PbLRBalanceStatistics.class, ExerciseStatistics$PbLRBalanceStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExerciseStatistics$PbLRBalanceStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseStatistics$PbLRBalanceStatistics var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (ExerciseStatistics$PbLRBalanceStatistics)ExerciseStatistics$PbLRBalanceStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (ExerciseStatistics$PbLRBalanceStatistics)var11.getUnfinishedMessage();
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

   public ExerciseStatistics$PbLRBalanceStatistics$Builder mergeFrom(Message var1) {
      ExerciseStatistics$PbLRBalanceStatistics$Builder var2;
      if (var1 instanceof ExerciseStatistics$PbLRBalanceStatistics) {
         var2 = this.mergeFrom((ExerciseStatistics$PbLRBalanceStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseStatistics$PbLRBalanceStatistics$Builder mergeFrom(ExerciseStatistics$PbLRBalanceStatistics var1) {
      if (var1 != ExerciseStatistics$PbLRBalanceStatistics.getDefaultInstance()) {
         if (var1.hasAverage()) {
            this.setAverage(var1.getAverage());
         }

         this.mergeUnknownFields(ExerciseStatistics$PbLRBalanceStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseStatistics$PbLRBalanceStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbLRBalanceStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseStatistics$PbLRBalanceStatistics$Builder setAverage(float var1) {
      this.bitField0_ |= 1;
      this.average_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseStatistics$PbLRBalanceStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseStatistics$PbLRBalanceStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseStatistics$PbLRBalanceStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseStatistics$PbLRBalanceStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExerciseStatistics$PbLRBalanceStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseStatistics$PbLRBalanceStatistics$Builder)super.setUnknownFields(var1);
   }
}
