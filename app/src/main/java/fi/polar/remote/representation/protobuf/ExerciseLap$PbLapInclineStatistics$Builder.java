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

public final class ExerciseLap$PbLapInclineStatistics$Builder extends Builder implements ExerciseLap$PbLapInclineStatisticsOrBuilder {
   private int bitField0_;
   private float max_;

   private ExerciseLap$PbLapInclineStatistics$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExerciseLap$PbLapInclineStatistics$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseLap$PbLapInclineStatistics$Builder(BuilderParent var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseLap$PbLapInclineStatistics$Builder(ExerciseLap$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.u();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseLap$PbLapInclineStatistics.b()) {
      }

   }

   public ExerciseLap$PbLapInclineStatistics$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapInclineStatistics$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseLap$PbLapInclineStatistics build() {
      ExerciseLap$PbLapInclineStatistics var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseLap$PbLapInclineStatistics buildPartial() {
      byte var1 = 1;
      ExerciseLap$PbLapInclineStatistics var2 = new ExerciseLap$PbLapInclineStatistics(this, (ExerciseLap$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      ExerciseLap$PbLapInclineStatistics.a(var2, this.max_);
      ExerciseLap$PbLapInclineStatistics.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public ExerciseLap$PbLapInclineStatistics$Builder clear() {
      super.clear();
      this.max_ = 0.0F;
      this.bitField0_ &= -2;
      return this;
   }

   public ExerciseLap$PbLapInclineStatistics$Builder clearField(FieldDescriptor var1) {
      return (ExerciseLap$PbLapInclineStatistics$Builder)super.clearField(var1);
   }

   public ExerciseLap$PbLapInclineStatistics$Builder clearMax() {
      this.bitField0_ &= -2;
      this.max_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapInclineStatistics$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseLap$PbLapInclineStatistics$Builder)super.clearOneof(var1);
   }

   public ExerciseLap$PbLapInclineStatistics$Builder clone() {
      return (ExerciseLap$PbLapInclineStatistics$Builder)super.clone();
   }

   public ExerciseLap$PbLapInclineStatistics getDefaultInstanceForType() {
      return ExerciseLap$PbLapInclineStatistics.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseLap.u();
   }

   public float getMax() {
      return this.max_;
   }

   public boolean hasMax() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseLap.v().ensureFieldAccessorsInitialized(ExerciseLap$PbLapInclineStatistics.class, ExerciseLap$PbLapInclineStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public ExerciseLap$PbLapInclineStatistics$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseLap$PbLapInclineStatistics var13;
      label96: {
         InvalidProtocolBufferException var12;
         ExerciseLap$PbLapInclineStatistics var14;
         try {
            var13 = (ExerciseLap$PbLapInclineStatistics)ExerciseLap$PbLapInclineStatistics.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (ExerciseLap$PbLapInclineStatistics)var10.getUnfinishedMessage();
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

   public ExerciseLap$PbLapInclineStatistics$Builder mergeFrom(Message var1) {
      ExerciseLap$PbLapInclineStatistics$Builder var2;
      if (var1 instanceof ExerciseLap$PbLapInclineStatistics) {
         var2 = this.mergeFrom((ExerciseLap$PbLapInclineStatistics)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseLap$PbLapInclineStatistics$Builder mergeFrom(ExerciseLap$PbLapInclineStatistics var1) {
      if (var1 != ExerciseLap$PbLapInclineStatistics.getDefaultInstance()) {
         if (var1.hasMax()) {
            this.setMax(var1.getMax());
         }

         this.mergeUnknownFields(ExerciseLap$PbLapInclineStatistics.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseLap$PbLapInclineStatistics$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapInclineStatistics$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseLap$PbLapInclineStatistics$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseLap$PbLapInclineStatistics$Builder)super.setField(var1, var2);
   }

   public ExerciseLap$PbLapInclineStatistics$Builder setMax(float var1) {
      this.bitField0_ |= 1;
      this.max_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseLap$PbLapInclineStatistics$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseLap$PbLapInclineStatistics$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExerciseLap$PbLapInclineStatistics$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseLap$PbLapInclineStatistics$Builder)super.setUnknownFields(var1);
   }
}
