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

public final class ExerciseSamples$PbCalibrationValue$Builder extends Builder implements ExerciseSamples$PbCalibrationValueOrBuilder {
   private int bitField0_;
   private int cause_;
   private int operation_;
   private int startIndex_;
   private float value_;

   private ExerciseSamples$PbCalibrationValue$Builder() {
      this.operation_ = 1;
      this.cause_ = 0;
      this.maybeForceBuilderInitialization();
   }

   private ExerciseSamples$PbCalibrationValue$Builder(BuilderParent var1) {
      super(var1);
      this.operation_ = 1;
      this.cause_ = 0;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseSamples$PbCalibrationValue$Builder(BuilderParent var1, ExerciseSamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseSamples$PbCalibrationValue$Builder(ExerciseSamples$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseSamples.c();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseSamples$PbCalibrationValue.b()) {
      }

   }

   public ExerciseSamples$PbCalibrationValue$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseSamples$PbCalibrationValue$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseSamples$PbCalibrationValue build() {
      ExerciseSamples$PbCalibrationValue var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseSamples$PbCalibrationValue buildPartial() {
      byte var1 = 1;
      ExerciseSamples$PbCalibrationValue var2 = new ExerciseSamples$PbCalibrationValue(this, (ExerciseSamples$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ExerciseSamples$PbCalibrationValue.a(var2, this.startIndex_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      ExerciseSamples$PbCalibrationValue.a(var2, this.value_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      ExerciseSamples$PbCalibrationValue.b(var2, this.operation_);
      var4 = var5;
      if ((var3 & 8) == 8) {
         var4 = var5 | 8;
      }

      ExerciseSamples$PbCalibrationValue.c(var2, this.cause_);
      ExerciseSamples$PbCalibrationValue.d(var2, var4);
      this.onBuilt();
      return var2;
   }

   public ExerciseSamples$PbCalibrationValue$Builder clear() {
      super.clear();
      this.startIndex_ = 0;
      this.bitField0_ &= -2;
      this.value_ = 0.0F;
      this.bitField0_ &= -3;
      this.operation_ = 1;
      this.bitField0_ &= -5;
      this.cause_ = 0;
      this.bitField0_ &= -9;
      return this;
   }

   public ExerciseSamples$PbCalibrationValue$Builder clearCause() {
      this.bitField0_ &= -9;
      this.cause_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbCalibrationValue$Builder clearField(FieldDescriptor var1) {
      return (ExerciseSamples$PbCalibrationValue$Builder)super.clearField(var1);
   }

   public ExerciseSamples$PbCalibrationValue$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseSamples$PbCalibrationValue$Builder)super.clearOneof(var1);
   }

   public ExerciseSamples$PbCalibrationValue$Builder clearOperation() {
      this.bitField0_ &= -5;
      this.operation_ = 1;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbCalibrationValue$Builder clearStartIndex() {
      this.bitField0_ &= -2;
      this.startIndex_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbCalibrationValue$Builder clearValue() {
      this.bitField0_ &= -3;
      this.value_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbCalibrationValue$Builder clone() {
      return (ExerciseSamples$PbCalibrationValue$Builder)super.clone();
   }

   public Types$PbMovingType getCause() {
      Types$PbMovingType var1 = Types$PbMovingType.valueOf(this.cause_);
      Types$PbMovingType var2 = var1;
      if (var1 == null) {
         var2 = Types$PbMovingType.WALKING;
      }

      return var2;
   }

   public ExerciseSamples$PbCalibrationValue getDefaultInstanceForType() {
      return ExerciseSamples$PbCalibrationValue.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseSamples.c();
   }

   public Types$PbOperationType getOperation() {
      Types$PbOperationType var1 = Types$PbOperationType.valueOf(this.operation_);
      Types$PbOperationType var2 = var1;
      if (var1 == null) {
         var2 = Types$PbOperationType.MULTIPLY;
      }

      return var2;
   }

   public int getStartIndex() {
      return this.startIndex_;
   }

   public float getValue() {
      return this.value_;
   }

   public boolean hasCause() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasOperation() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStartIndex() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasValue() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseSamples.d().ensureFieldAccessorsInitialized(ExerciseSamples$PbCalibrationValue.class, ExerciseSamples$PbCalibrationValue$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasStartIndex()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasValue()) {
            var2 = var1;
            if (this.hasOperation()) {
               var2 = true;
            }
         }
      }

      return var2;
   }

   public ExerciseSamples$PbCalibrationValue$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseSamples$PbCalibrationValue var13;
      label96: {
         InvalidProtocolBufferException var12;
         ExerciseSamples$PbCalibrationValue var14;
         try {
            var13 = (ExerciseSamples$PbCalibrationValue)ExerciseSamples$PbCalibrationValue.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (ExerciseSamples$PbCalibrationValue)var10.getUnfinishedMessage();
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

   public ExerciseSamples$PbCalibrationValue$Builder mergeFrom(Message var1) {
      ExerciseSamples$PbCalibrationValue$Builder var2;
      if (var1 instanceof ExerciseSamples$PbCalibrationValue) {
         var2 = this.mergeFrom((ExerciseSamples$PbCalibrationValue)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseSamples$PbCalibrationValue$Builder mergeFrom(ExerciseSamples$PbCalibrationValue var1) {
      if (var1 != ExerciseSamples$PbCalibrationValue.getDefaultInstance()) {
         if (var1.hasStartIndex()) {
            this.setStartIndex(var1.getStartIndex());
         }

         if (var1.hasValue()) {
            this.setValue(var1.getValue());
         }

         if (var1.hasOperation()) {
            this.setOperation(var1.getOperation());
         }

         if (var1.hasCause()) {
            this.setCause(var1.getCause());
         }

         this.mergeUnknownFields(ExerciseSamples$PbCalibrationValue.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseSamples$PbCalibrationValue$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseSamples$PbCalibrationValue$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseSamples$PbCalibrationValue$Builder setCause(Types$PbMovingType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 8;
         this.cause_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public ExerciseSamples$PbCalibrationValue$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseSamples$PbCalibrationValue$Builder)super.setField(var1, var2);
   }

   public ExerciseSamples$PbCalibrationValue$Builder setOperation(Types$PbOperationType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 4;
         this.operation_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public ExerciseSamples$PbCalibrationValue$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseSamples$PbCalibrationValue$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public ExerciseSamples$PbCalibrationValue$Builder setStartIndex(int var1) {
      this.bitField0_ |= 1;
      this.startIndex_ = var1;
      this.onChanged();
      return this;
   }

   public final ExerciseSamples$PbCalibrationValue$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseSamples$PbCalibrationValue$Builder)super.setUnknownFields(var1);
   }

   public ExerciseSamples$PbCalibrationValue$Builder setValue(float var1) {
      this.bitField0_ |= 2;
      this.value_ = var1;
      this.onChanged();
      return this;
   }
}
