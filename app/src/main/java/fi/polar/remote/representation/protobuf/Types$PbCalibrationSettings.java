package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.InputStream;

public final class Types$PbCalibrationSettings extends GeneratedMessageV3 implements Types$PbCalibrationSettingsOrBuilder {
   public static final int CALIBRATION_CALCULATION_ENABLED_FIELD_NUMBER = 3;
   public static final int CALIBRATION_ENABLED_FIELD_NUMBER = 2;
   private static final Types$PbCalibrationSettings DEFAULT_INSTANCE = new Types$PbCalibrationSettings();
   @Deprecated
   public static final Parser PARSER = new Types$PbCalibrationSettings$1();
   public static final int SAMPLE_TYPE_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private boolean calibrationCalculationEnabled_;
   private boolean calibrationEnabled_;
   private byte memoizedIsInitialized;
   private int sampleType_;

   private Types$PbCalibrationSettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.sampleType_ = 0;
      this.calibrationEnabled_ = false;
      this.calibrationCalculationEnabled_ = false;
   }

   private Types$PbCalibrationSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Types$PbCalibrationSettings(CodedInputStream var1, ExtensionRegistryLite var2, Types$1 var3) {
      this(var1, var2);
   }

   private Types$PbCalibrationSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Types$PbCalibrationSettings(Builder var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Types$PbCalibrationSettings var0, int var1) {
      var0.sampleType_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Types$PbCalibrationSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean a(Types$PbCalibrationSettings var0, boolean var1) {
      var0.calibrationEnabled_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(Types$PbCalibrationSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static boolean b(Types$PbCalibrationSettings var0, boolean var1) {
      var0.calibrationCalculationEnabled_ = var1;
      return var1;
   }

   public static Types$PbCalibrationSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Types.A();
   }

   public static Types$PbCalibrationSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Types$PbCalibrationSettings$Builder newBuilder(Types$PbCalibrationSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Types$PbCalibrationSettings parseDelimitedFrom(InputStream var0) {
      return (Types$PbCalibrationSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Types$PbCalibrationSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbCalibrationSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Types$PbCalibrationSettings parseFrom(ByteString var0) {
      return (Types$PbCalibrationSettings)PARSER.parseFrom(var0);
   }

   public static Types$PbCalibrationSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Types$PbCalibrationSettings)PARSER.parseFrom(var0, var1);
   }

   public static Types$PbCalibrationSettings parseFrom(CodedInputStream var0) {
      return (Types$PbCalibrationSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbCalibrationSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbCalibrationSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbCalibrationSettings parseFrom(InputStream var0) {
      return (Types$PbCalibrationSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbCalibrationSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbCalibrationSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbCalibrationSettings parseFrom(byte[] var0) {
      return (Types$PbCalibrationSettings)PARSER.parseFrom(var0);
   }

   public static Types$PbCalibrationSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Types$PbCalibrationSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Types$PbCalibrationSettings)) {
            var2 = super.equals(var1);
         } else {
            Types$PbCalibrationSettings var5 = (Types$PbCalibrationSettings)var1;
            boolean var3;
            if (this.hasSampleType() == var5.hasSampleType()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasSampleType()) {
               if (var3 && this.sampleType_ == var5.sampleType_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasCalibrationEnabled() == var5.hasCalibrationEnabled()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasCalibrationEnabled()) {
               if (var4 && this.getCalibrationEnabled() == var5.getCalibrationEnabled()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasCalibrationCalculationEnabled() == var5.hasCalibrationCalculationEnabled()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasCalibrationCalculationEnabled()) {
               if (var3 && this.getCalibrationCalculationEnabled() == var5.getCalibrationCalculationEnabled()) {
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

   public boolean getCalibrationCalculationEnabled() {
      return this.calibrationCalculationEnabled_;
   }

   public boolean getCalibrationEnabled() {
      return this.calibrationEnabled_;
   }

   public Types$PbCalibrationSettings getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public Types$PbSampleType getSampleType() {
      Types$PbSampleType var1 = Types$PbSampleType.valueOf(this.sampleType_);
      Types$PbSampleType var2 = var1;
      if (var1 == null) {
         var2 = Types$PbSampleType.SAMPLE_TYPE_UNDEFINED;
      }

      return var2;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeEnumSize(1, this.sampleType_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeBoolSize(2, this.calibrationEnabled_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeBoolSize(3, this.calibrationCalculationEnabled_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
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

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.hasSampleType()) {
            var1 = (var2 * 37 + 1) * 53 + this.sampleType_;
         }

         var2 = var1;
         if (this.hasCalibrationEnabled()) {
            var2 = (var1 * 37 + 2) * 53 + Internal.hashBoolean(this.getCalibrationEnabled());
         }

         var1 = var2;
         if (this.hasCalibrationCalculationEnabled()) {
            var1 = (var2 * 37 + 3) * 53 + Internal.hashBoolean(this.getCalibrationCalculationEnabled());
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.B().ensureFieldAccessorsInitialized(Types$PbCalibrationSettings.class, Types$PbCalibrationSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasSampleType()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Types$PbCalibrationSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Types$PbCalibrationSettings$Builder newBuilderForType(BuilderParent var1) {
      return new Types$PbCalibrationSettings$Builder(var1, (Types$1)null);
   }

   public Types$PbCalibrationSettings$Builder toBuilder() {
      Types$PbCalibrationSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Types$PbCalibrationSettings$Builder((Types$1)null);
      } else {
         var1 = (new Types$PbCalibrationSettings$Builder((Types$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.sampleType_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeBool(2, this.calibrationEnabled_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeBool(3, this.calibrationCalculationEnabled_);
      }

      this.unknownFields.writeTo(var1);
   }
}
