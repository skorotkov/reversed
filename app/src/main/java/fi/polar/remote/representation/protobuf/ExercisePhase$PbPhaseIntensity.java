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

public final class ExercisePhase$PbPhaseIntensity extends GeneratedMessageV3 implements ExercisePhase$PbPhaseIntensityOrBuilder {
   private static final ExercisePhase$PbPhaseIntensity DEFAULT_INSTANCE = new ExercisePhase$PbPhaseIntensity();
   public static final int HEART_RATE_ZONE_FIELD_NUMBER = 2;
   public static final int INTENSITY_TYPE_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new ExercisePhase$PbPhaseIntensity$1();
   public static final int POWER_ZONE_FIELD_NUMBER = 4;
   public static final int SPEED_ZONE_FIELD_NUMBER = 3;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private ExercisePhase$PbPhaseIntensity$IntensityZone heartRateZone_;
   private int intensityType_;
   private byte memoizedIsInitialized;
   private ExercisePhase$PbPhaseIntensity$IntensityZone powerZone_;
   private ExercisePhase$PbPhaseIntensity$IntensityZone speedZone_;

   private ExercisePhase$PbPhaseIntensity() {
      this.memoizedIsInitialized = (byte)-1;
      this.intensityType_ = 0;
   }

   private ExercisePhase$PbPhaseIntensity(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExercisePhase$PbPhaseIntensity(CodedInputStream var1, ExtensionRegistryLite var2, ExercisePhase$1 var3) {
      this(var1, var2);
   }

   private ExercisePhase$PbPhaseIntensity(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExercisePhase$PbPhaseIntensity(Builder var1, ExercisePhase$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(ExercisePhase$PbPhaseIntensity var0, int var1) {
      var0.intensityType_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExercisePhase$PbPhaseIntensity var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static ExercisePhase$PbPhaseIntensity$IntensityZone a(ExercisePhase$PbPhaseIntensity var0, ExercisePhase$PbPhaseIntensity$IntensityZone var1) {
      var0.heartRateZone_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(ExercisePhase$PbPhaseIntensity var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExercisePhase$PbPhaseIntensity$IntensityZone b(ExercisePhase$PbPhaseIntensity var0, ExercisePhase$PbPhaseIntensity$IntensityZone var1) {
      var0.speedZone_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static ExercisePhase$PbPhaseIntensity$IntensityZone c(ExercisePhase$PbPhaseIntensity var0, ExercisePhase$PbPhaseIntensity$IntensityZone var1) {
      var0.powerZone_ = var1;
      return var1;
   }

   public static ExercisePhase$PbPhaseIntensity getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExercisePhase.c();
   }

   public static ExercisePhase$PbPhaseIntensity$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExercisePhase$PbPhaseIntensity$Builder newBuilder(ExercisePhase$PbPhaseIntensity var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExercisePhase$PbPhaseIntensity parseDelimitedFrom(InputStream var0) {
      return (ExercisePhase$PbPhaseIntensity)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExercisePhase$PbPhaseIntensity parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExercisePhase$PbPhaseIntensity)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExercisePhase$PbPhaseIntensity parseFrom(ByteString var0) {
      return (ExercisePhase$PbPhaseIntensity)PARSER.parseFrom(var0);
   }

   public static ExercisePhase$PbPhaseIntensity parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExercisePhase$PbPhaseIntensity)PARSER.parseFrom(var0, var1);
   }

   public static ExercisePhase$PbPhaseIntensity parseFrom(CodedInputStream var0) {
      return (ExercisePhase$PbPhaseIntensity)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExercisePhase$PbPhaseIntensity parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExercisePhase$PbPhaseIntensity)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExercisePhase$PbPhaseIntensity parseFrom(InputStream var0) {
      return (ExercisePhase$PbPhaseIntensity)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExercisePhase$PbPhaseIntensity parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExercisePhase$PbPhaseIntensity)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExercisePhase$PbPhaseIntensity parseFrom(byte[] var0) {
      return (ExercisePhase$PbPhaseIntensity)PARSER.parseFrom(var0);
   }

   public static ExercisePhase$PbPhaseIntensity parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExercisePhase$PbPhaseIntensity)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExercisePhase$PbPhaseIntensity)) {
            var2 = super.equals(var1);
         } else {
            ExercisePhase$PbPhaseIntensity var5 = (ExercisePhase$PbPhaseIntensity)var1;
            boolean var3;
            if (this.hasIntensityType() == var5.hasIntensityType()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasIntensityType()) {
               if (var3 && this.intensityType_ == var5.intensityType_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasHeartRateZone() == var5.hasHeartRateZone()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasHeartRateZone()) {
               if (var4 && this.getHeartRateZone().equals(var5.getHeartRateZone())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasSpeedZone() == var5.hasSpeedZone()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSpeedZone()) {
               if (var4 && this.getSpeedZone().equals(var5.getSpeedZone())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasPowerZone() == var5.hasPowerZone()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasPowerZone()) {
               if (var3 && this.getPowerZone().equals(var5.getPowerZone())) {
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

   public ExercisePhase$PbPhaseIntensity getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone getHeartRateZone() {
      ExercisePhase$PbPhaseIntensity$IntensityZone var1;
      if (this.heartRateZone_ == null) {
         var1 = ExercisePhase$PbPhaseIntensity$IntensityZone.getDefaultInstance();
      } else {
         var1 = this.heartRateZone_;
      }

      return var1;
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZoneOrBuilder getHeartRateZoneOrBuilder() {
      ExercisePhase$PbPhaseIntensity$IntensityZone var1;
      if (this.heartRateZone_ == null) {
         var1 = ExercisePhase$PbPhaseIntensity$IntensityZone.getDefaultInstance();
      } else {
         var1 = this.heartRateZone_;
      }

      return var1;
   }

   public ExercisePhase$PbPhaseIntensity$PhaseIntensityType getIntensityType() {
      ExercisePhase$PbPhaseIntensity$PhaseIntensityType var1 = ExercisePhase$PbPhaseIntensity$PhaseIntensityType.valueOf(this.intensityType_);
      ExercisePhase$PbPhaseIntensity$PhaseIntensityType var2 = var1;
      if (var1 == null) {
         var2 = ExercisePhase$PbPhaseIntensity$PhaseIntensityType.PHASE_INTENSITY_FREE;
      }

      return var2;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone getPowerZone() {
      ExercisePhase$PbPhaseIntensity$IntensityZone var1;
      if (this.powerZone_ == null) {
         var1 = ExercisePhase$PbPhaseIntensity$IntensityZone.getDefaultInstance();
      } else {
         var1 = this.powerZone_;
      }

      return var1;
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZoneOrBuilder getPowerZoneOrBuilder() {
      ExercisePhase$PbPhaseIntensity$IntensityZone var1;
      if (this.powerZone_ == null) {
         var1 = ExercisePhase$PbPhaseIntensity$IntensityZone.getDefaultInstance();
      } else {
         var1 = this.powerZone_;
      }

      return var1;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeEnumSize(1, this.intensityType_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeMessageSize(2, this.getHeartRateZone());
         }

         var1 = var2;
         if ((this.bitField0_ & 4) == 4) {
            var1 = var2 + CodedOutputStream.computeMessageSize(3, this.getSpeedZone());
         }

         var2 = var1;
         if ((this.bitField0_ & 8) == 8) {
            var2 = var1 + CodedOutputStream.computeMessageSize(4, this.getPowerZone());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone getSpeedZone() {
      ExercisePhase$PbPhaseIntensity$IntensityZone var1;
      if (this.speedZone_ == null) {
         var1 = ExercisePhase$PbPhaseIntensity$IntensityZone.getDefaultInstance();
      } else {
         var1 = this.speedZone_;
      }

      return var1;
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZoneOrBuilder getSpeedZoneOrBuilder() {
      ExercisePhase$PbPhaseIntensity$IntensityZone var1;
      if (this.speedZone_ == null) {
         var1 = ExercisePhase$PbPhaseIntensity$IntensityZone.getDefaultInstance();
      } else {
         var1 = this.speedZone_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasHeartRateZone() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasIntensityType() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPowerZone() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSpeedZone() {
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
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.hasIntensityType()) {
            var1 = (var2 * 37 + 1) * 53 + this.intensityType_;
         }

         var2 = var1;
         if (this.hasHeartRateZone()) {
            var2 = (var1 * 37 + 2) * 53 + this.getHeartRateZone().hashCode();
         }

         var1 = var2;
         if (this.hasSpeedZone()) {
            var1 = (var2 * 37 + 3) * 53 + this.getSpeedZone().hashCode();
         }

         var2 = var1;
         if (this.hasPowerZone()) {
            var2 = (var1 * 37 + 4) * 53 + this.getPowerZone().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExercisePhase.d().ensureFieldAccessorsInitialized(ExercisePhase$PbPhaseIntensity.class, ExercisePhase$PbPhaseIntensity$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasIntensityType()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasHeartRateZone() && !this.getHeartRateZone().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasSpeedZone() && !this.getSpeedZone().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasPowerZone() && !this.getPowerZone().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public ExercisePhase$PbPhaseIntensity$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExercisePhase$PbPhaseIntensity$Builder newBuilderForType(BuilderParent var1) {
      return new ExercisePhase$PbPhaseIntensity$Builder(var1, (ExercisePhase$1)null);
   }

   public ExercisePhase$PbPhaseIntensity$Builder toBuilder() {
      ExercisePhase$PbPhaseIntensity$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExercisePhase$PbPhaseIntensity$Builder((ExercisePhase$1)null);
      } else {
         var1 = (new ExercisePhase$PbPhaseIntensity$Builder((ExercisePhase$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.intensityType_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getHeartRateZone());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getSpeedZone());
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeMessage(4, this.getPowerZone());
      }

      this.unknownFields.writeTo(var1);
   }
}
