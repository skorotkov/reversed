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

public final class Types$PbCalibrationSettings$Builder extends Builder implements Types$PbCalibrationSettingsOrBuilder {
   private int bitField0_;
   private boolean calibrationCalculationEnabled_;
   private boolean calibrationEnabled_;
   private int sampleType_;

   private Types$PbCalibrationSettings$Builder() {
      this.sampleType_ = 0;
      this.maybeForceBuilderInitialization();
   }

   private Types$PbCalibrationSettings$Builder(BuilderParent var1) {
      super(var1);
      this.sampleType_ = 0;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Types$PbCalibrationSettings$Builder(BuilderParent var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Types$PbCalibrationSettings$Builder(Types$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Types.A();
   }

   private void maybeForceBuilderInitialization() {
      if (Types$PbCalibrationSettings.b()) {
      }

   }

   public Types$PbCalibrationSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Types$PbCalibrationSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public Types$PbCalibrationSettings build() {
      Types$PbCalibrationSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Types$PbCalibrationSettings buildPartial() {
      byte var1 = 1;
      Types$PbCalibrationSettings var2 = new Types$PbCalibrationSettings(this, (Types$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Types$PbCalibrationSettings.a(var2, this.sampleType_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      Types$PbCalibrationSettings.a(var2, this.calibrationEnabled_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      Types$PbCalibrationSettings.b(var2, this.calibrationCalculationEnabled_);
      Types$PbCalibrationSettings.b(var2, var5);
      this.onBuilt();
      return var2;
   }

   public Types$PbCalibrationSettings$Builder clear() {
      super.clear();
      this.sampleType_ = 0;
      this.bitField0_ &= -2;
      this.calibrationEnabled_ = false;
      this.bitField0_ &= -3;
      this.calibrationCalculationEnabled_ = false;
      this.bitField0_ &= -5;
      return this;
   }

   public Types$PbCalibrationSettings$Builder clearCalibrationCalculationEnabled() {
      this.bitField0_ &= -5;
      this.calibrationCalculationEnabled_ = false;
      this.onChanged();
      return this;
   }

   public Types$PbCalibrationSettings$Builder clearCalibrationEnabled() {
      this.bitField0_ &= -3;
      this.calibrationEnabled_ = false;
      this.onChanged();
      return this;
   }

   public Types$PbCalibrationSettings$Builder clearField(FieldDescriptor var1) {
      return (Types$PbCalibrationSettings$Builder)super.clearField(var1);
   }

   public Types$PbCalibrationSettings$Builder clearOneof(OneofDescriptor var1) {
      return (Types$PbCalibrationSettings$Builder)super.clearOneof(var1);
   }

   public Types$PbCalibrationSettings$Builder clearSampleType() {
      this.bitField0_ &= -2;
      this.sampleType_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbCalibrationSettings$Builder clone() {
      return (Types$PbCalibrationSettings$Builder)super.clone();
   }

   public boolean getCalibrationCalculationEnabled() {
      return this.calibrationCalculationEnabled_;
   }

   public boolean getCalibrationEnabled() {
      return this.calibrationEnabled_;
   }

   public Types$PbCalibrationSettings getDefaultInstanceForType() {
      return Types$PbCalibrationSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Types.A();
   }

   public Types$PbSampleType getSampleType() {
      Types$PbSampleType var1 = Types$PbSampleType.valueOf(this.sampleType_);
      Types$PbSampleType var2 = var1;
      if (var1 == null) {
         var2 = Types$PbSampleType.SAMPLE_TYPE_UNDEFINED;
      }

      return var2;
   }

   public boolean hasCalibrationCalculationEnabled() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasCalibrationEnabled() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSampleType() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.B().ensureFieldAccessorsInitialized(Types$PbCalibrationSettings.class, Types$PbCalibrationSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasSampleType()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public Types$PbCalibrationSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Types$PbCalibrationSettings var13;
      label96: {
         InvalidProtocolBufferException var12;
         Types$PbCalibrationSettings var14;
         try {
            var13 = (Types$PbCalibrationSettings)Types$PbCalibrationSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Types$PbCalibrationSettings)var10.getUnfinishedMessage();
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

   public Types$PbCalibrationSettings$Builder mergeFrom(Message var1) {
      Types$PbCalibrationSettings$Builder var2;
      if (var1 instanceof Types$PbCalibrationSettings) {
         var2 = this.mergeFrom((Types$PbCalibrationSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Types$PbCalibrationSettings$Builder mergeFrom(Types$PbCalibrationSettings var1) {
      if (var1 != Types$PbCalibrationSettings.getDefaultInstance()) {
         if (var1.hasSampleType()) {
            this.setSampleType(var1.getSampleType());
         }

         if (var1.hasCalibrationEnabled()) {
            this.setCalibrationEnabled(var1.getCalibrationEnabled());
         }

         if (var1.hasCalibrationCalculationEnabled()) {
            this.setCalibrationCalculationEnabled(var1.getCalibrationCalculationEnabled());
         }

         this.mergeUnknownFields(Types$PbCalibrationSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Types$PbCalibrationSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Types$PbCalibrationSettings$Builder)super.mergeUnknownFields(var1);
   }

   public Types$PbCalibrationSettings$Builder setCalibrationCalculationEnabled(boolean var1) {
      this.bitField0_ |= 4;
      this.calibrationCalculationEnabled_ = var1;
      this.onChanged();
      return this;
   }

   public Types$PbCalibrationSettings$Builder setCalibrationEnabled(boolean var1) {
      this.bitField0_ |= 2;
      this.calibrationEnabled_ = var1;
      this.onChanged();
      return this;
   }

   public Types$PbCalibrationSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (Types$PbCalibrationSettings$Builder)super.setField(var1, var2);
   }

   public Types$PbCalibrationSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Types$PbCalibrationSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Types$PbCalibrationSettings$Builder setSampleType(Types$PbSampleType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.sampleType_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public final Types$PbCalibrationSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Types$PbCalibrationSettings$Builder)super.setUnknownFields(var1);
   }
}
