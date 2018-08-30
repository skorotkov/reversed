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

public final class Types$PbStrideSensorCalibSettings extends GeneratedMessageV3 implements Types$PbStrideSensorCalibSettingsOrBuilder {
   public static final int CALIB_TYPE_FIELD_NUMBER = 2;
   private static final Types$PbStrideSensorCalibSettings DEFAULT_INSTANCE = new Types$PbStrideSensorCalibSettings();
   @Deprecated
   public static final Parser PARSER = new Types$PbStrideSensorCalibSettings$1();
   public static final int RUNNING_FACTOR_FIELD_NUMBER = 1;
   public static final int RUNNING_FACTOR_SOURCE_FIELD_NUMBER = 3;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int calibType_;
   private byte memoizedIsInitialized;
   private int runningFactorSource_;
   private float runningFactor_;

   private Types$PbStrideSensorCalibSettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.runningFactor_ = 0.0F;
      this.calibType_ = 0;
      this.runningFactorSource_ = 0;
   }

   private Types$PbStrideSensorCalibSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Types$PbStrideSensorCalibSettings(CodedInputStream var1, ExtensionRegistryLite var2, Types$1 var3) {
      this(var1, var2);
   }

   private Types$PbStrideSensorCalibSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Types$PbStrideSensorCalibSettings(Builder var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(Types$PbStrideSensorCalibSettings var0, float var1) {
      var0.runningFactor_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(Types$PbStrideSensorCalibSettings var0, int var1) {
      var0.calibType_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Types$PbStrideSensorCalibSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(Types$PbStrideSensorCalibSettings var0, int var1) {
      var0.runningFactorSource_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(Types$PbStrideSensorCalibSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static Types$PbStrideSensorCalibSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Types.s();
   }

   public static Types$PbStrideSensorCalibSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Types$PbStrideSensorCalibSettings$Builder newBuilder(Types$PbStrideSensorCalibSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Types$PbStrideSensorCalibSettings parseDelimitedFrom(InputStream var0) {
      return (Types$PbStrideSensorCalibSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Types$PbStrideSensorCalibSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbStrideSensorCalibSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Types$PbStrideSensorCalibSettings parseFrom(ByteString var0) {
      return (Types$PbStrideSensorCalibSettings)PARSER.parseFrom(var0);
   }

   public static Types$PbStrideSensorCalibSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Types$PbStrideSensorCalibSettings)PARSER.parseFrom(var0, var1);
   }

   public static Types$PbStrideSensorCalibSettings parseFrom(CodedInputStream var0) {
      return (Types$PbStrideSensorCalibSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbStrideSensorCalibSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbStrideSensorCalibSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbStrideSensorCalibSettings parseFrom(InputStream var0) {
      return (Types$PbStrideSensorCalibSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbStrideSensorCalibSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbStrideSensorCalibSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbStrideSensorCalibSettings parseFrom(byte[] var0) {
      return (Types$PbStrideSensorCalibSettings)PARSER.parseFrom(var0);
   }

   public static Types$PbStrideSensorCalibSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Types$PbStrideSensorCalibSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Types$PbStrideSensorCalibSettings)) {
            var2 = super.equals(var1);
         } else {
            Types$PbStrideSensorCalibSettings var5 = (Types$PbStrideSensorCalibSettings)var1;
            boolean var3;
            if (this.hasRunningFactor() == var5.hasRunningFactor()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasRunningFactor()) {
               if (var3 && Float.floatToIntBits(this.getRunningFactor()) == Float.floatToIntBits(var5.getRunningFactor())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasCalibType() == var5.hasCalibType()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasCalibType()) {
               if (var3 && this.calibType_ == var5.calibType_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasRunningFactorSource() == var5.hasRunningFactorSource()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasRunningFactorSource()) {
               if (var3 && this.runningFactorSource_ == var5.runningFactorSource_) {
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

   public Types$PbStrideSensorCalibSettings$PbStrideCalibType getCalibType() {
      Types$PbStrideSensorCalibSettings$PbStrideCalibType var1 = Types$PbStrideSensorCalibSettings$PbStrideCalibType.valueOf(this.calibType_);
      Types$PbStrideSensorCalibSettings$PbStrideCalibType var2 = var1;
      if (var1 == null) {
         var2 = Types$PbStrideSensorCalibSettings$PbStrideCalibType.STRIDE_CALIB_MANUAL;
      }

      return var2;
   }

   public Types$PbStrideSensorCalibSettings getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public float getRunningFactor() {
      return this.runningFactor_;
   }

   public Types$PbStrideSensorCalibSettings$PbRunningFactorSource getRunningFactorSource() {
      Types$PbStrideSensorCalibSettings$PbRunningFactorSource var1 = Types$PbStrideSensorCalibSettings$PbRunningFactorSource.valueOf(this.runningFactorSource_);
      Types$PbStrideSensorCalibSettings$PbRunningFactorSource var2 = var1;
      if (var1 == null) {
         var2 = Types$PbStrideSensorCalibSettings$PbRunningFactorSource.RUNNING_FACTOR_SOURCE_DEFAULT;
      }

      return var2;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeFloatSize(1, this.runningFactor_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeEnumSize(2, this.calibType_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeEnumSize(3, this.runningFactorSource_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasCalibType() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasRunningFactor() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasRunningFactorSource() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
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
         var1 = this.getDescriptorForType().hashCode() + 779;
         int var2 = var1;
         if (this.hasRunningFactor()) {
            var2 = (var1 * 37 + 1) * 53 + Float.floatToIntBits(this.getRunningFactor());
         }

         var1 = var2;
         if (this.hasCalibType()) {
            var1 = (var2 * 37 + 2) * 53 + this.calibType_;
         }

         var2 = var1;
         if (this.hasRunningFactorSource()) {
            var2 = (var1 * 37 + 3) * 53 + this.runningFactorSource_;
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.t().ensureFieldAccessorsInitialized(Types$PbStrideSensorCalibSettings.class, Types$PbStrideSensorCalibSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasRunningFactor()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasCalibType()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Types$PbStrideSensorCalibSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Types$PbStrideSensorCalibSettings$Builder newBuilderForType(BuilderParent var1) {
      return new Types$PbStrideSensorCalibSettings$Builder(var1, (Types$1)null);
   }

   public Types$PbStrideSensorCalibSettings$Builder toBuilder() {
      Types$PbStrideSensorCalibSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Types$PbStrideSensorCalibSettings$Builder((Types$1)null);
      } else {
         var1 = (new Types$PbStrideSensorCalibSettings$Builder((Types$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeFloat(1, this.runningFactor_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeEnum(2, this.calibType_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeEnum(3, this.runningFactorSource_);
      }

      this.unknownFields.writeTo(var1);
   }
}
