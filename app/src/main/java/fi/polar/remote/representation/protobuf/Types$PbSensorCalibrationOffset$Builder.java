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

public final class Types$PbSensorCalibrationOffset$Builder extends Builder implements Types$PbSensorCalibrationOffsetOrBuilder {
   private int bitField0_;
   private int sampleSourceType_;
   private float speedCalOffset_;

   private Types$PbSensorCalibrationOffset$Builder() {
      this.sampleSourceType_ = 0;
      this.maybeForceBuilderInitialization();
   }

   private Types$PbSensorCalibrationOffset$Builder(BuilderParent var1) {
      super(var1);
      this.sampleSourceType_ = 0;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Types$PbSensorCalibrationOffset$Builder(BuilderParent var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Types$PbSensorCalibrationOffset$Builder(Types$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Types.y();
   }

   private void maybeForceBuilderInitialization() {
      if (Types$PbSensorCalibrationOffset.b()) {
      }

   }

   public Types$PbSensorCalibrationOffset$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Types$PbSensorCalibrationOffset$Builder)super.addRepeatedField(var1, var2);
   }

   public Types$PbSensorCalibrationOffset build() {
      Types$PbSensorCalibrationOffset var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Types$PbSensorCalibrationOffset buildPartial() {
      byte var1 = 1;
      Types$PbSensorCalibrationOffset var2 = new Types$PbSensorCalibrationOffset(this, (Types$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Types$PbSensorCalibrationOffset.a(var2, this.sampleSourceType_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      Types$PbSensorCalibrationOffset.a(var2, this.speedCalOffset_);
      Types$PbSensorCalibrationOffset.b(var2, var4);
      this.onBuilt();
      return var2;
   }

   public Types$PbSensorCalibrationOffset$Builder clear() {
      super.clear();
      this.sampleSourceType_ = 0;
      this.bitField0_ &= -2;
      this.speedCalOffset_ = 0.0F;
      this.bitField0_ &= -3;
      return this;
   }

   public Types$PbSensorCalibrationOffset$Builder clearField(FieldDescriptor var1) {
      return (Types$PbSensorCalibrationOffset$Builder)super.clearField(var1);
   }

   public Types$PbSensorCalibrationOffset$Builder clearOneof(OneofDescriptor var1) {
      return (Types$PbSensorCalibrationOffset$Builder)super.clearOneof(var1);
   }

   public Types$PbSensorCalibrationOffset$Builder clearSampleSourceType() {
      this.bitField0_ &= -2;
      this.sampleSourceType_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbSensorCalibrationOffset$Builder clearSpeedCalOffset() {
      this.bitField0_ &= -3;
      this.speedCalOffset_ = 0.0F;
      this.onChanged();
      return this;
   }

   public Types$PbSensorCalibrationOffset$Builder clone() {
      return (Types$PbSensorCalibrationOffset$Builder)super.clone();
   }

   public Types$PbSensorCalibrationOffset getDefaultInstanceForType() {
      return Types$PbSensorCalibrationOffset.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Types.y();
   }

   public Types$PbSampleSourceType getSampleSourceType() {
      Types$PbSampleSourceType var1 = Types$PbSampleSourceType.valueOf(this.sampleSourceType_);
      Types$PbSampleSourceType var2 = var1;
      if (var1 == null) {
         var2 = Types$PbSampleSourceType.SAMPLE_SOURCE_TYPE_UNDEFINED;
      }

      return var2;
   }

   public float getSpeedCalOffset() {
      return this.speedCalOffset_;
   }

   public boolean hasSampleSourceType() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSpeedCalOffset() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.z().ensureFieldAccessorsInitialized(Types$PbSensorCalibrationOffset.class, Types$PbSensorCalibrationOffset$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasSampleSourceType()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public Types$PbSensorCalibrationOffset$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Types$PbSensorCalibrationOffset var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (Types$PbSensorCalibrationOffset)Types$PbSensorCalibrationOffset.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (Types$PbSensorCalibrationOffset)var11.getUnfinishedMessage();
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

   public Types$PbSensorCalibrationOffset$Builder mergeFrom(Message var1) {
      Types$PbSensorCalibrationOffset$Builder var2;
      if (var1 instanceof Types$PbSensorCalibrationOffset) {
         var2 = this.mergeFrom((Types$PbSensorCalibrationOffset)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Types$PbSensorCalibrationOffset$Builder mergeFrom(Types$PbSensorCalibrationOffset var1) {
      if (var1 != Types$PbSensorCalibrationOffset.getDefaultInstance()) {
         if (var1.hasSampleSourceType()) {
            this.setSampleSourceType(var1.getSampleSourceType());
         }

         if (var1.hasSpeedCalOffset()) {
            this.setSpeedCalOffset(var1.getSpeedCalOffset());
         }

         this.mergeUnknownFields(Types$PbSensorCalibrationOffset.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Types$PbSensorCalibrationOffset$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Types$PbSensorCalibrationOffset$Builder)super.mergeUnknownFields(var1);
   }

   public Types$PbSensorCalibrationOffset$Builder setField(FieldDescriptor var1, Object var2) {
      return (Types$PbSensorCalibrationOffset$Builder)super.setField(var1, var2);
   }

   public Types$PbSensorCalibrationOffset$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Types$PbSensorCalibrationOffset$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Types$PbSensorCalibrationOffset$Builder setSampleSourceType(Types$PbSampleSourceType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.sampleSourceType_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public Types$PbSensorCalibrationOffset$Builder setSpeedCalOffset(float var1) {
      this.bitField0_ |= 2;
      this.speedCalOffset_ = var1;
      this.onChanged();
      return this;
   }

   public final Types$PbSensorCalibrationOffset$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Types$PbSensorCalibrationOffset$Builder)super.setUnknownFields(var1);
   }
}
