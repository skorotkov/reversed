package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.InputStream;

public final class Types$PbSensorCalibrationOffset extends GeneratedMessageV3 implements Types$PbSensorCalibrationOffsetOrBuilder {
   private static final Types$PbSensorCalibrationOffset DEFAULT_INSTANCE = new Types$PbSensorCalibrationOffset();
   @Deprecated
   public static final Parser PARSER = new Types$PbSensorCalibrationOffset$1();
   public static final int SAMPLE_SOURCE_TYPE_FIELD_NUMBER = 1;
   public static final int SPEED_CAL_OFFSET_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private int sampleSourceType_;
   private float speedCalOffset_;

   private Types$PbSensorCalibrationOffset() {
      this.memoizedIsInitialized = (byte)-1;
      this.sampleSourceType_ = 0;
      this.speedCalOffset_ = 0.0F;
   }

   private Types$PbSensorCalibrationOffset(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Types$PbSensorCalibrationOffset(CodedInputStream var1, ExtensionRegistryLite var2, Types$1 var3) {
      this(var1, var2);
   }

   private Types$PbSensorCalibrationOffset(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Types$PbSensorCalibrationOffset(Builder var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(Types$PbSensorCalibrationOffset var0, float var1) {
      var0.speedCalOffset_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(Types$PbSensorCalibrationOffset var0, int var1) {
      var0.sampleSourceType_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Types$PbSensorCalibrationOffset var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(Types$PbSensorCalibrationOffset var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static Types$PbSensorCalibrationOffset getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Types.y();
   }

   public static Types$PbSensorCalibrationOffset$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Types$PbSensorCalibrationOffset$Builder newBuilder(Types$PbSensorCalibrationOffset var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Types$PbSensorCalibrationOffset parseDelimitedFrom(InputStream var0) {
      return (Types$PbSensorCalibrationOffset)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Types$PbSensorCalibrationOffset parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbSensorCalibrationOffset)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Types$PbSensorCalibrationOffset parseFrom(ByteString var0) {
      return (Types$PbSensorCalibrationOffset)PARSER.parseFrom(var0);
   }

   public static Types$PbSensorCalibrationOffset parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Types$PbSensorCalibrationOffset)PARSER.parseFrom(var0, var1);
   }

   public static Types$PbSensorCalibrationOffset parseFrom(CodedInputStream var0) {
      return (Types$PbSensorCalibrationOffset)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbSensorCalibrationOffset parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbSensorCalibrationOffset)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbSensorCalibrationOffset parseFrom(InputStream var0) {
      return (Types$PbSensorCalibrationOffset)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbSensorCalibrationOffset parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbSensorCalibrationOffset)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbSensorCalibrationOffset parseFrom(byte[] var0) {
      return (Types$PbSensorCalibrationOffset)PARSER.parseFrom(var0);
   }

   public static Types$PbSensorCalibrationOffset parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Types$PbSensorCalibrationOffset)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Types$PbSensorCalibrationOffset)) {
            var2 = super.equals(var1);
         } else {
            Types$PbSensorCalibrationOffset var5 = (Types$PbSensorCalibrationOffset)var1;
            boolean var3;
            if (this.hasSampleSourceType() == var5.hasSampleSourceType()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasSampleSourceType()) {
               if (var3 && this.sampleSourceType_ == var5.sampleSourceType_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSpeedCalOffset() == var5.hasSpeedCalOffset()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSpeedCalOffset()) {
               if (var3 && Float.floatToIntBits(this.getSpeedCalOffset()) == Float.floatToIntBits(var5.getSpeedCalOffset())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (!var4 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public Types$PbSensorCalibrationOffset getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public Types$PbSampleSourceType getSampleSourceType() {
      Types$PbSampleSourceType var1 = Types$PbSampleSourceType.valueOf(this.sampleSourceType_);
      Types$PbSampleSourceType var2 = var1;
      if (var1 == null) {
         var2 = Types$PbSampleSourceType.SAMPLE_SOURCE_TYPE_UNDEFINED;
      }

      return var2;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeEnumSize(1, this.sampleSourceType_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeFloatSize(2, this.speedCalOffset_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public float getSpeedCalOffset() {
      return this.speedCalOffset_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
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

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.hasSampleSourceType()) {
            var1 = (var2 * 37 + 1) * 53 + this.sampleSourceType_;
         }

         var2 = var1;
         if (this.hasSpeedCalOffset()) {
            var2 = (var1 * 37 + 2) * 53 + Float.floatToIntBits(this.getSpeedCalOffset());
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.z().ensureFieldAccessorsInitialized(Types$PbSensorCalibrationOffset.class, Types$PbSensorCalibrationOffset$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasSampleSourceType()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Types$PbSensorCalibrationOffset$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Types$PbSensorCalibrationOffset$Builder newBuilderForType(BuilderParent var1) {
      return new Types$PbSensorCalibrationOffset$Builder(var1, (Types$1)null);
   }

   public Types$PbSensorCalibrationOffset$Builder toBuilder() {
      Types$PbSensorCalibrationOffset$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Types$PbSensorCalibrationOffset$Builder((Types$1)null);
      } else {
         var1 = (new Types$PbSensorCalibrationOffset$Builder((Types$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.sampleSourceType_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeFloat(2, this.speedCalOffset_);
      }

      this.unknownFields.writeTo(var1);
   }
}
