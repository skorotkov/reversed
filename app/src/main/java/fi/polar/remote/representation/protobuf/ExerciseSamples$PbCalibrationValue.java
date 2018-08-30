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

public final class ExerciseSamples$PbCalibrationValue extends GeneratedMessageV3 implements ExerciseSamples$PbCalibrationValueOrBuilder {
   public static final int CAUSE_FIELD_NUMBER = 4;
   private static final ExerciseSamples$PbCalibrationValue DEFAULT_INSTANCE = new ExerciseSamples$PbCalibrationValue();
   public static final int OPERATION_FIELD_NUMBER = 3;
   @Deprecated
   public static final Parser PARSER = new ExerciseSamples$PbCalibrationValue$1();
   public static final int START_INDEX_FIELD_NUMBER = 1;
   public static final int VALUE_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int cause_;
   private byte memoizedIsInitialized;
   private int operation_;
   private int startIndex_;
   private float value_;

   private ExerciseSamples$PbCalibrationValue() {
      this.memoizedIsInitialized = (byte)-1;
      this.startIndex_ = 0;
      this.value_ = 0.0F;
      this.operation_ = 1;
      this.cause_ = 0;
   }

   private ExerciseSamples$PbCalibrationValue(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseSamples$PbCalibrationValue(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseSamples$1 var3) {
      this(var1, var2);
   }

   private ExerciseSamples$PbCalibrationValue(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseSamples$PbCalibrationValue(Builder var1, ExerciseSamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(ExerciseSamples$PbCalibrationValue var0, float var1) {
      var0.value_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(ExerciseSamples$PbCalibrationValue var0, int var1) {
      var0.startIndex_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExerciseSamples$PbCalibrationValue var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(ExerciseSamples$PbCalibrationValue var0, int var1) {
      var0.operation_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(ExerciseSamples$PbCalibrationValue var0, int var1) {
      var0.cause_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int d(ExerciseSamples$PbCalibrationValue var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static ExerciseSamples$PbCalibrationValue getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseSamples.c();
   }

   public static ExerciseSamples$PbCalibrationValue$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseSamples$PbCalibrationValue$Builder newBuilder(ExerciseSamples$PbCalibrationValue var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseSamples$PbCalibrationValue parseDelimitedFrom(InputStream var0) {
      return (ExerciseSamples$PbCalibrationValue)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseSamples$PbCalibrationValue parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseSamples$PbCalibrationValue)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseSamples$PbCalibrationValue parseFrom(ByteString var0) {
      return (ExerciseSamples$PbCalibrationValue)PARSER.parseFrom(var0);
   }

   public static ExerciseSamples$PbCalibrationValue parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseSamples$PbCalibrationValue)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseSamples$PbCalibrationValue parseFrom(CodedInputStream var0) {
      return (ExerciseSamples$PbCalibrationValue)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseSamples$PbCalibrationValue parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseSamples$PbCalibrationValue)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseSamples$PbCalibrationValue parseFrom(InputStream var0) {
      return (ExerciseSamples$PbCalibrationValue)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseSamples$PbCalibrationValue parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseSamples$PbCalibrationValue)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseSamples$PbCalibrationValue parseFrom(byte[] var0) {
      return (ExerciseSamples$PbCalibrationValue)PARSER.parseFrom(var0);
   }

   public static ExerciseSamples$PbCalibrationValue parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseSamples$PbCalibrationValue)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseSamples$PbCalibrationValue)) {
            var2 = super.equals(var1);
         } else {
            ExerciseSamples$PbCalibrationValue var5 = (ExerciseSamples$PbCalibrationValue)var1;
            boolean var3;
            if (this.hasStartIndex() == var5.hasStartIndex()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasStartIndex()) {
               if (var3 && this.getStartIndex() == var5.getStartIndex()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasValue() == var5.hasValue()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasValue()) {
               if (var3 && Float.floatToIntBits(this.getValue()) == Float.floatToIntBits(var5.getValue())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasOperation() == var5.hasOperation()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasOperation()) {
               if (var3 && this.operation_ == var5.operation_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasCause() == var5.hasCause()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasCause()) {
               if (var3 && this.cause_ == var5.cause_) {
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

   public Types$PbMovingType getCause() {
      Types$PbMovingType var1 = Types$PbMovingType.valueOf(this.cause_);
      Types$PbMovingType var2 = var1;
      if (var1 == null) {
         var2 = Types$PbMovingType.WALKING;
      }

      return var2;
   }

   public ExerciseSamples$PbCalibrationValue getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Types$PbOperationType getOperation() {
      Types$PbOperationType var1 = Types$PbOperationType.valueOf(this.operation_);
      Types$PbOperationType var2 = var1;
      if (var1 == null) {
         var2 = Types$PbOperationType.MULTIPLY;
      }

      return var2;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeUInt32Size(1, this.startIndex_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeFloatSize(2, this.value_);
         }

         var1 = var2;
         if ((this.bitField0_ & 4) == 4) {
            var1 = var2 + CodedOutputStream.computeEnumSize(3, this.operation_);
         }

         var2 = var1;
         if ((this.bitField0_ & 8) == 8) {
            var2 = var1 + CodedOutputStream.computeEnumSize(4, this.cause_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public int getStartIndex() {
      return this.startIndex_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
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

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         var1 = this.getDescriptorForType().hashCode() + 779;
         int var2 = var1;
         if (this.hasStartIndex()) {
            var2 = (var1 * 37 + 1) * 53 + this.getStartIndex();
         }

         var1 = var2;
         if (this.hasValue()) {
            var1 = (var2 * 37 + 2) * 53 + Float.floatToIntBits(this.getValue());
         }

         var2 = var1;
         if (this.hasOperation()) {
            var2 = (var1 * 37 + 3) * 53 + this.operation_;
         }

         var1 = var2;
         if (this.hasCause()) {
            var1 = (var2 * 37 + 4) * 53 + this.cause_;
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseSamples.d().ensureFieldAccessorsInitialized(ExerciseSamples$PbCalibrationValue.class, ExerciseSamples$PbCalibrationValue$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasStartIndex()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasValue()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasOperation()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public ExerciseSamples$PbCalibrationValue$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseSamples$PbCalibrationValue$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseSamples$PbCalibrationValue$Builder(var1, (ExerciseSamples$1)null);
   }

   public ExerciseSamples$PbCalibrationValue$Builder toBuilder() {
      ExerciseSamples$PbCalibrationValue$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseSamples$PbCalibrationValue$Builder((ExerciseSamples$1)null);
      } else {
         var1 = (new ExerciseSamples$PbCalibrationValue$Builder((ExerciseSamples$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.startIndex_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeFloat(2, this.value_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeEnum(3, this.operation_);
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeEnum(4, this.cause_);
      }

      this.unknownFields.writeTo(var1);
   }
}
