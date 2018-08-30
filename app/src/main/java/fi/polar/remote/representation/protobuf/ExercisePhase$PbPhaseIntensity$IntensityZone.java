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

public final class ExercisePhase$PbPhaseIntensity$IntensityZone extends GeneratedMessageV3 implements ExercisePhase$PbPhaseIntensity$IntensityZoneOrBuilder {
   private static final ExercisePhase$PbPhaseIntensity$IntensityZone DEFAULT_INSTANCE = new ExercisePhase$PbPhaseIntensity$IntensityZone();
   public static final int LOWER_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new ExercisePhase$PbPhaseIntensity$IntensityZone$1();
   public static final int UPPER_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int lower_;
   private byte memoizedIsInitialized;
   private int upper_;

   private ExercisePhase$PbPhaseIntensity$IntensityZone() {
      this.memoizedIsInitialized = (byte)-1;
      this.lower_ = 0;
      this.upper_ = 0;
   }

   private ExercisePhase$PbPhaseIntensity$IntensityZone(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExercisePhase$PbPhaseIntensity$IntensityZone(CodedInputStream var1, ExtensionRegistryLite var2, ExercisePhase$1 var3) {
      this(var1, var2);
   }

   private ExercisePhase$PbPhaseIntensity$IntensityZone(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExercisePhase$PbPhaseIntensity$IntensityZone(Builder var1, ExercisePhase$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(ExercisePhase$PbPhaseIntensity$IntensityZone var0, int var1) {
      var0.lower_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExercisePhase$PbPhaseIntensity$IntensityZone var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(ExercisePhase$PbPhaseIntensity$IntensityZone var0, int var1) {
      var0.upper_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(ExercisePhase$PbPhaseIntensity$IntensityZone var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static ExercisePhase$PbPhaseIntensity$IntensityZone getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExercisePhase.e();
   }

   public static ExercisePhase$PbPhaseIntensity$IntensityZone$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExercisePhase$PbPhaseIntensity$IntensityZone$Builder newBuilder(ExercisePhase$PbPhaseIntensity$IntensityZone var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExercisePhase$PbPhaseIntensity$IntensityZone parseDelimitedFrom(InputStream var0) {
      return (ExercisePhase$PbPhaseIntensity$IntensityZone)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExercisePhase$PbPhaseIntensity$IntensityZone parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExercisePhase$PbPhaseIntensity$IntensityZone)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExercisePhase$PbPhaseIntensity$IntensityZone parseFrom(ByteString var0) {
      return (ExercisePhase$PbPhaseIntensity$IntensityZone)PARSER.parseFrom(var0);
   }

   public static ExercisePhase$PbPhaseIntensity$IntensityZone parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExercisePhase$PbPhaseIntensity$IntensityZone)PARSER.parseFrom(var0, var1);
   }

   public static ExercisePhase$PbPhaseIntensity$IntensityZone parseFrom(CodedInputStream var0) {
      return (ExercisePhase$PbPhaseIntensity$IntensityZone)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExercisePhase$PbPhaseIntensity$IntensityZone parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExercisePhase$PbPhaseIntensity$IntensityZone)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExercisePhase$PbPhaseIntensity$IntensityZone parseFrom(InputStream var0) {
      return (ExercisePhase$PbPhaseIntensity$IntensityZone)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExercisePhase$PbPhaseIntensity$IntensityZone parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExercisePhase$PbPhaseIntensity$IntensityZone)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExercisePhase$PbPhaseIntensity$IntensityZone parseFrom(byte[] var0) {
      return (ExercisePhase$PbPhaseIntensity$IntensityZone)PARSER.parseFrom(var0);
   }

   public static ExercisePhase$PbPhaseIntensity$IntensityZone parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExercisePhase$PbPhaseIntensity$IntensityZone)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExercisePhase$PbPhaseIntensity$IntensityZone)) {
            var2 = super.equals(var1);
         } else {
            ExercisePhase$PbPhaseIntensity$IntensityZone var5 = (ExercisePhase$PbPhaseIntensity$IntensityZone)var1;
            boolean var3;
            if (this.hasLower() == var5.hasLower()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasLower()) {
               if (var3 && this.getLower() == var5.getLower()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasUpper() == var5.hasUpper()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasUpper()) {
               if (var3 && this.getUpper() == var5.getUpper()) {
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

   public ExercisePhase$PbPhaseIntensity$IntensityZone getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public int getLower() {
      return this.lower_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeUInt32Size(1, this.lower_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(2, this.upper_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public int getUpper() {
      return this.upper_;
   }

   public boolean hasLower() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasUpper() {
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
         if (this.hasLower()) {
            var1 = (var2 * 37 + 1) * 53 + this.getLower();
         }

         var2 = var1;
         if (this.hasUpper()) {
            var2 = (var1 * 37 + 2) * 53 + this.getUpper();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExercisePhase.f().ensureFieldAccessorsInitialized(ExercisePhase$PbPhaseIntensity$IntensityZone.class, ExercisePhase$PbPhaseIntensity$IntensityZone$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasLower()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasUpper()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExercisePhase$PbPhaseIntensity$IntensityZone$Builder newBuilderForType(BuilderParent var1) {
      return new ExercisePhase$PbPhaseIntensity$IntensityZone$Builder(var1, (ExercisePhase$1)null);
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone$Builder toBuilder() {
      ExercisePhase$PbPhaseIntensity$IntensityZone$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExercisePhase$PbPhaseIntensity$IntensityZone$Builder((ExercisePhase$1)null);
      } else {
         var1 = (new ExercisePhase$PbPhaseIntensity$IntensityZone$Builder((ExercisePhase$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.lower_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeUInt32(2, this.upper_);
      }

      this.unknownFields.writeTo(var1);
   }
}
