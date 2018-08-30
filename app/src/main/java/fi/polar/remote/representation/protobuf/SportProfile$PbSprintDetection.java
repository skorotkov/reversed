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

public final class SportProfile$PbSprintDetection extends GeneratedMessageV3 implements SportProfile$PbSprintDetectionOrBuilder {
   private static final SportProfile$PbSprintDetection DEFAULT_INSTANCE = new SportProfile$PbSprintDetection();
   @Deprecated
   public static final Parser PARSER = new SportProfile$PbSprintDetection$1();
   public static final int SOURCE_FIELD_NUMBER = 1;
   public static final int SPRINT_THRESHOLD_ACCELERATION_FIELD_NUMBER = 2;
   public static final int SPRINT_THRESHOLD_SPEED_FIELD_NUMBER = 3;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private int source_;
   private float sprintThresholdAcceleration_;
   private float sprintThresholdSpeed_;

   private SportProfile$PbSprintDetection() {
      this.memoizedIsInitialized = (byte)-1;
      this.source_ = 0;
      this.sprintThresholdAcceleration_ = 0.0F;
      this.sprintThresholdSpeed_ = 0.0F;
   }

   private SportProfile$PbSprintDetection(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   SportProfile$PbSprintDetection(CodedInputStream var1, ExtensionRegistryLite var2, SportProfile$1 var3) {
      this(var1, var2);
   }

   private SportProfile$PbSprintDetection(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   SportProfile$PbSprintDetection(Builder var1, SportProfile$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(SportProfile$PbSprintDetection var0, float var1) {
      var0.sprintThresholdAcceleration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(SportProfile$PbSprintDetection var0, int var1) {
      var0.source_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(SportProfile$PbSprintDetection var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static float b(SportProfile$PbSprintDetection var0, float var1) {
      var0.sprintThresholdSpeed_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(SportProfile$PbSprintDetection var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static SportProfile$PbSprintDetection getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return SportProfile.e();
   }

   public static SportProfile$PbSprintDetection$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SportProfile$PbSprintDetection$Builder newBuilder(SportProfile$PbSprintDetection var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static SportProfile$PbSprintDetection parseDelimitedFrom(InputStream var0) {
      return (SportProfile$PbSprintDetection)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SportProfile$PbSprintDetection parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportProfile$PbSprintDetection)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SportProfile$PbSprintDetection parseFrom(ByteString var0) {
      return (SportProfile$PbSprintDetection)PARSER.parseFrom(var0);
   }

   public static SportProfile$PbSprintDetection parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (SportProfile$PbSprintDetection)PARSER.parseFrom(var0, var1);
   }

   public static SportProfile$PbSprintDetection parseFrom(CodedInputStream var0) {
      return (SportProfile$PbSprintDetection)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportProfile$PbSprintDetection parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (SportProfile$PbSprintDetection)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportProfile$PbSprintDetection parseFrom(InputStream var0) {
      return (SportProfile$PbSprintDetection)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SportProfile$PbSprintDetection parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SportProfile$PbSprintDetection)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SportProfile$PbSprintDetection parseFrom(byte[] var0) {
      return (SportProfile$PbSprintDetection)PARSER.parseFrom(var0);
   }

   public static SportProfile$PbSprintDetection parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (SportProfile$PbSprintDetection)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof SportProfile$PbSprintDetection)) {
            var2 = super.equals(var1);
         } else {
            SportProfile$PbSprintDetection var5 = (SportProfile$PbSprintDetection)var1;
            boolean var3;
            if (this.hasSource() == var5.hasSource()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasSource()) {
               if (var3 && this.source_ == var5.source_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSprintThresholdAcceleration() == var5.hasSprintThresholdAcceleration()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSprintThresholdAcceleration()) {
               if (var4 && Float.floatToIntBits(this.getSprintThresholdAcceleration()) == Float.floatToIntBits(var5.getSprintThresholdAcceleration())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasSprintThresholdSpeed() == var5.hasSprintThresholdSpeed()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSprintThresholdSpeed()) {
               if (var3 && Float.floatToIntBits(this.getSprintThresholdSpeed()) == Float.floatToIntBits(var5.getSprintThresholdSpeed())) {
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

   public SportProfile$PbSprintDetection getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeEnumSize(1, this.source_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeFloatSize(2, this.sprintThresholdAcceleration_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeFloatSize(3, this.sprintThresholdSpeed_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public SportProfile$PbSprintDetection$PbSprintDetectionSource getSource() {
      SportProfile$PbSprintDetection$PbSprintDetectionSource var1 = SportProfile$PbSprintDetection$PbSprintDetectionSource.valueOf(this.source_);
      SportProfile$PbSprintDetection$PbSprintDetectionSource var2 = var1;
      if (var1 == null) {
         var2 = SportProfile$PbSprintDetection$PbSprintDetectionSource.SPRINT_DETECTION_OFF;
      }

      return var2;
   }

   public float getSprintThresholdAcceleration() {
      return this.sprintThresholdAcceleration_;
   }

   public float getSprintThresholdSpeed() {
      return this.sprintThresholdSpeed_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasSource() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSprintThresholdAcceleration() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSprintThresholdSpeed() {
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
         if (this.hasSource()) {
            var1 = (var2 * 37 + 1) * 53 + this.source_;
         }

         var2 = var1;
         if (this.hasSprintThresholdAcceleration()) {
            var2 = (var1 * 37 + 2) * 53 + Float.floatToIntBits(this.getSprintThresholdAcceleration());
         }

         var1 = var2;
         if (this.hasSprintThresholdSpeed()) {
            var1 = (var2 * 37 + 3) * 53 + Float.floatToIntBits(this.getSprintThresholdSpeed());
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportProfile.f().ensureFieldAccessorsInitialized(SportProfile$PbSprintDetection.class, SportProfile$PbSprintDetection$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasSource()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public SportProfile$PbSprintDetection$Builder newBuilderForType() {
      return newBuilder();
   }

   protected SportProfile$PbSprintDetection$Builder newBuilderForType(BuilderParent var1) {
      return new SportProfile$PbSprintDetection$Builder(var1, (SportProfile$1)null);
   }

   public SportProfile$PbSprintDetection$Builder toBuilder() {
      SportProfile$PbSprintDetection$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new SportProfile$PbSprintDetection$Builder((SportProfile$1)null);
      } else {
         var1 = (new SportProfile$PbSprintDetection$Builder((SportProfile$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.source_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeFloat(2, this.sprintThresholdAcceleration_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeFloat(3, this.sprintThresholdSpeed_);
      }

      this.unknownFields.writeTo(var1);
   }
}
