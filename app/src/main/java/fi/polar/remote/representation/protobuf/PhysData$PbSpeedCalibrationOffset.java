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

public final class PhysData$PbSpeedCalibrationOffset extends GeneratedMessageV3 implements PhysData$PbSpeedCalibrationOffsetOrBuilder {
   private static final PhysData$PbSpeedCalibrationOffset DEFAULT_INSTANCE = new PhysData$PbSpeedCalibrationOffset();
   public static final int LAST_MODIFIED_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new PhysData$PbSpeedCalibrationOffset$1();
   public static final int VALUE_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private Types$PbSystemDateTime lastModified_;
   private byte memoizedIsInitialized;
   private float value_;

   private PhysData$PbSpeedCalibrationOffset() {
      this.memoizedIsInitialized = (byte)-1;
      this.value_ = 0.0F;
   }

   private PhysData$PbSpeedCalibrationOffset(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PhysData$PbSpeedCalibrationOffset(CodedInputStream var1, ExtensionRegistryLite var2, PhysData$1 var3) {
      this(var1, var2);
   }

   private PhysData$PbSpeedCalibrationOffset(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PhysData$PbSpeedCalibrationOffset(Builder var1, PhysData$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(PhysData$PbSpeedCalibrationOffset var0, float var1) {
      var0.value_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(PhysData$PbSpeedCalibrationOffset var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(PhysData$PbSpeedCalibrationOffset var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime a(PhysData$PbSpeedCalibrationOffset var0, Types$PbSystemDateTime var1) {
      var0.lastModified_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static PhysData$PbSpeedCalibrationOffset getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PhysData.s();
   }

   public static PhysData$PbSpeedCalibrationOffset$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PhysData$PbSpeedCalibrationOffset$Builder newBuilder(PhysData$PbSpeedCalibrationOffset var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PhysData$PbSpeedCalibrationOffset parseDelimitedFrom(InputStream var0) {
      return (PhysData$PbSpeedCalibrationOffset)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PhysData$PbSpeedCalibrationOffset parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PhysData$PbSpeedCalibrationOffset)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PhysData$PbSpeedCalibrationOffset parseFrom(ByteString var0) {
      return (PhysData$PbSpeedCalibrationOffset)PARSER.parseFrom(var0);
   }

   public static PhysData$PbSpeedCalibrationOffset parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PhysData$PbSpeedCalibrationOffset)PARSER.parseFrom(var0, var1);
   }

   public static PhysData$PbSpeedCalibrationOffset parseFrom(CodedInputStream var0) {
      return (PhysData$PbSpeedCalibrationOffset)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PhysData$PbSpeedCalibrationOffset parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PhysData$PbSpeedCalibrationOffset)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PhysData$PbSpeedCalibrationOffset parseFrom(InputStream var0) {
      return (PhysData$PbSpeedCalibrationOffset)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PhysData$PbSpeedCalibrationOffset parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PhysData$PbSpeedCalibrationOffset)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PhysData$PbSpeedCalibrationOffset parseFrom(byte[] var0) {
      return (PhysData$PbSpeedCalibrationOffset)PARSER.parseFrom(var0);
   }

   public static PhysData$PbSpeedCalibrationOffset parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PhysData$PbSpeedCalibrationOffset)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PhysData$PbSpeedCalibrationOffset)) {
            var2 = super.equals(var1);
         } else {
            PhysData$PbSpeedCalibrationOffset var5 = (PhysData$PbSpeedCalibrationOffset)var1;
            boolean var3;
            if (this.hasValue() == var5.hasValue()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasValue()) {
               if (var3 && Float.floatToIntBits(this.getValue()) == Float.floatToIntBits(var5.getValue())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasLastModified() == var5.hasLastModified()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasLastModified()) {
               if (var3 && this.getLastModified().equals(var5.getLastModified())) {
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

   public PhysData$PbSpeedCalibrationOffset getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Types$PbSystemDateTime getLastModified() {
      Types$PbSystemDateTime var1;
      if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
      }

      return var1;
   }

   public Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder() {
      Types$PbSystemDateTime var1;
      if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
      }

      return var1;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeFloatSize(1, this.value_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeMessageSize(2, this.getLastModified());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public float getValue() {
      return this.value_;
   }

   public boolean hasLastModified() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasValue() {
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
         if (this.hasValue()) {
            var1 = (var2 * 37 + 1) * 53 + Float.floatToIntBits(this.getValue());
         }

         var2 = var1;
         if (this.hasLastModified()) {
            var2 = (var1 * 37 + 2) * 53 + this.getLastModified().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PhysData.t().ensureFieldAccessorsInitialized(PhysData$PbSpeedCalibrationOffset.class, PhysData$PbSpeedCalibrationOffset$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasValue()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasLastModified()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getLastModified().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public PhysData$PbSpeedCalibrationOffset$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PhysData$PbSpeedCalibrationOffset$Builder newBuilderForType(BuilderParent var1) {
      return new PhysData$PbSpeedCalibrationOffset$Builder(var1, (PhysData$1)null);
   }

   public PhysData$PbSpeedCalibrationOffset$Builder toBuilder() {
      PhysData$PbSpeedCalibrationOffset$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PhysData$PbSpeedCalibrationOffset$Builder((PhysData$1)null);
      } else {
         var1 = (new PhysData$PbSpeedCalibrationOffset$Builder((PhysData$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeFloat(1, this.value_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getLastModified());
      }

      this.unknownFields.writeTo(var1);
   }
}
