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

public final class ExerciseStatistics$PbAltitudeStatistics extends GeneratedMessageV3 implements ExerciseStatistics$PbAltitudeStatisticsOrBuilder {
   public static final int AVERAGE_FIELD_NUMBER = 2;
   private static final ExerciseStatistics$PbAltitudeStatistics DEFAULT_INSTANCE = new ExerciseStatistics$PbAltitudeStatistics();
   public static final int MAXIMUM_FIELD_NUMBER = 3;
   public static final int MINIMUM_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new ExerciseStatistics$PbAltitudeStatistics$1();
   private static final long serialVersionUID = 0L;
   private float average_;
   private int bitField0_;
   private float maximum_;
   private byte memoizedIsInitialized;
   private float minimum_;

   private ExerciseStatistics$PbAltitudeStatistics() {
      this.memoizedIsInitialized = (byte)-1;
      this.minimum_ = 0.0F;
      this.average_ = 0.0F;
      this.maximum_ = 0.0F;
   }

   private ExerciseStatistics$PbAltitudeStatistics(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseStatistics$PbAltitudeStatistics(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseStatistics$1 var3) {
      this(var1, var2);
   }

   private ExerciseStatistics$PbAltitudeStatistics(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseStatistics$PbAltitudeStatistics(Builder var1, ExerciseStatistics$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(ExerciseStatistics$PbAltitudeStatistics var0, float var1) {
      var0.minimum_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(ExerciseStatistics$PbAltitudeStatistics var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExerciseStatistics$PbAltitudeStatistics var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static float b(ExerciseStatistics$PbAltitudeStatistics var0, float var1) {
      var0.average_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static float c(ExerciseStatistics$PbAltitudeStatistics var0, float var1) {
      var0.maximum_ = var1;
      return var1;
   }

   public static ExerciseStatistics$PbAltitudeStatistics getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseStatistics.k();
   }

   public static ExerciseStatistics$PbAltitudeStatistics$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseStatistics$PbAltitudeStatistics$Builder newBuilder(ExerciseStatistics$PbAltitudeStatistics var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseStatistics$PbAltitudeStatistics parseDelimitedFrom(InputStream var0) {
      return (ExerciseStatistics$PbAltitudeStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseStatistics$PbAltitudeStatistics parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbAltitudeStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseStatistics$PbAltitudeStatistics parseFrom(ByteString var0) {
      return (ExerciseStatistics$PbAltitudeStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseStatistics$PbAltitudeStatistics parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbAltitudeStatistics)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseStatistics$PbAltitudeStatistics parseFrom(CodedInputStream var0) {
      return (ExerciseStatistics$PbAltitudeStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseStatistics$PbAltitudeStatistics parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbAltitudeStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseStatistics$PbAltitudeStatistics parseFrom(InputStream var0) {
      return (ExerciseStatistics$PbAltitudeStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseStatistics$PbAltitudeStatistics parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbAltitudeStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseStatistics$PbAltitudeStatistics parseFrom(byte[] var0) {
      return (ExerciseStatistics$PbAltitudeStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseStatistics$PbAltitudeStatistics parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbAltitudeStatistics)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseStatistics$PbAltitudeStatistics)) {
            var2 = super.equals(var1);
         } else {
            ExerciseStatistics$PbAltitudeStatistics var5 = (ExerciseStatistics$PbAltitudeStatistics)var1;
            boolean var3;
            if (this.hasMinimum() == var5.hasMinimum()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasMinimum()) {
               if (var3 && Float.floatToIntBits(this.getMinimum()) == Float.floatToIntBits(var5.getMinimum())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAverage() == var5.hasAverage()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAverage()) {
               if (var4 && Float.floatToIntBits(this.getAverage()) == Float.floatToIntBits(var5.getAverage())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasMaximum() == var5.hasMaximum()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasMaximum()) {
               if (var3 && Float.floatToIntBits(this.getMaximum()) == Float.floatToIntBits(var5.getMaximum())) {
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

   public float getAverage() {
      return this.average_;
   }

   public ExerciseStatistics$PbAltitudeStatistics getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public float getMaximum() {
      return this.maximum_;
   }

   public float getMinimum() {
      return this.minimum_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeFloatSize(1, this.minimum_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeFloatSize(2, this.average_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeFloatSize(3, this.maximum_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasAverage() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMaximum() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMinimum() {
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
         var1 = this.getDescriptorForType().hashCode() + 779;
         int var2 = var1;
         if (this.hasMinimum()) {
            var2 = (var1 * 37 + 1) * 53 + Float.floatToIntBits(this.getMinimum());
         }

         var1 = var2;
         if (this.hasAverage()) {
            var1 = (var2 * 37 + 2) * 53 + Float.floatToIntBits(this.getAverage());
         }

         var2 = var1;
         if (this.hasMaximum()) {
            var2 = (var1 * 37 + 3) * 53 + Float.floatToIntBits(this.getMaximum());
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseStatistics.l().ensureFieldAccessorsInitialized(ExerciseStatistics$PbAltitudeStatistics.class, ExerciseStatistics$PbAltitudeStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public ExerciseStatistics$PbAltitudeStatistics$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseStatistics$PbAltitudeStatistics$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseStatistics$PbAltitudeStatistics$Builder(var1, (ExerciseStatistics$1)null);
   }

   public ExerciseStatistics$PbAltitudeStatistics$Builder toBuilder() {
      ExerciseStatistics$PbAltitudeStatistics$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseStatistics$PbAltitudeStatistics$Builder((ExerciseStatistics$1)null);
      } else {
         var1 = (new ExerciseStatistics$PbAltitudeStatistics$Builder((ExerciseStatistics$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeFloat(1, this.minimum_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeFloat(2, this.average_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeFloat(3, this.maximum_);
      }

      this.unknownFields.writeTo(var1);
   }
}
