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

public final class ExerciseTargetInfo$PbSteadyRacePaceResult extends GeneratedMessageV3 implements ExerciseTargetInfo$PbSteadyRacePaceResultOrBuilder {
   public static final int AVERAGE_HEARTRATE_FIELD_NUMBER = 2;
   public static final int AVERAGE_SPEED_FIELD_NUMBER = 3;
   public static final int COMPLETED_TIME_FIELD_NUMBER = 1;
   private static final ExerciseTargetInfo$PbSteadyRacePaceResult DEFAULT_INSTANCE = new ExerciseTargetInfo$PbSteadyRacePaceResult();
   @Deprecated
   public static final Parser PARSER = new ExerciseTargetInfo$PbSteadyRacePaceResult$1();
   private static final long serialVersionUID = 0L;
   private int averageHeartrate_;
   private float averageSpeed_;
   private int bitField0_;
   private Types$PbDuration completedTime_;
   private byte memoizedIsInitialized;

   private ExerciseTargetInfo$PbSteadyRacePaceResult() {
      this.memoizedIsInitialized = (byte)-1;
      this.averageHeartrate_ = 0;
      this.averageSpeed_ = 0.0F;
   }

   private ExerciseTargetInfo$PbSteadyRacePaceResult(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseTargetInfo$PbSteadyRacePaceResult(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseTargetInfo$1 var3) {
      this(var1, var2);
   }

   private ExerciseTargetInfo$PbSteadyRacePaceResult(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseTargetInfo$PbSteadyRacePaceResult(Builder var1, ExerciseTargetInfo$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(ExerciseTargetInfo$PbSteadyRacePaceResult var0, float var1) {
      var0.averageSpeed_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(ExerciseTargetInfo$PbSteadyRacePaceResult var0, int var1) {
      var0.averageHeartrate_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExerciseTargetInfo$PbSteadyRacePaceResult var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbDuration a(ExerciseTargetInfo$PbSteadyRacePaceResult var0, Types$PbDuration var1) {
      var0.completedTime_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(ExerciseTargetInfo$PbSteadyRacePaceResult var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static ExerciseTargetInfo$PbSteadyRacePaceResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseTargetInfo.a();
   }

   public static ExerciseTargetInfo$PbSteadyRacePaceResult$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseTargetInfo$PbSteadyRacePaceResult$Builder newBuilder(ExerciseTargetInfo$PbSteadyRacePaceResult var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseTargetInfo$PbSteadyRacePaceResult parseDelimitedFrom(InputStream var0) {
      return (ExerciseTargetInfo$PbSteadyRacePaceResult)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseTargetInfo$PbSteadyRacePaceResult parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseTargetInfo$PbSteadyRacePaceResult)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseTargetInfo$PbSteadyRacePaceResult parseFrom(ByteString var0) {
      return (ExerciseTargetInfo$PbSteadyRacePaceResult)PARSER.parseFrom(var0);
   }

   public static ExerciseTargetInfo$PbSteadyRacePaceResult parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseTargetInfo$PbSteadyRacePaceResult)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseTargetInfo$PbSteadyRacePaceResult parseFrom(CodedInputStream var0) {
      return (ExerciseTargetInfo$PbSteadyRacePaceResult)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseTargetInfo$PbSteadyRacePaceResult parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseTargetInfo$PbSteadyRacePaceResult)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseTargetInfo$PbSteadyRacePaceResult parseFrom(InputStream var0) {
      return (ExerciseTargetInfo$PbSteadyRacePaceResult)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseTargetInfo$PbSteadyRacePaceResult parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseTargetInfo$PbSteadyRacePaceResult)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseTargetInfo$PbSteadyRacePaceResult parseFrom(byte[] var0) {
      return (ExerciseTargetInfo$PbSteadyRacePaceResult)PARSER.parseFrom(var0);
   }

   public static ExerciseTargetInfo$PbSteadyRacePaceResult parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseTargetInfo$PbSteadyRacePaceResult)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseTargetInfo$PbSteadyRacePaceResult)) {
            var2 = super.equals(var1);
         } else {
            ExerciseTargetInfo$PbSteadyRacePaceResult var5 = (ExerciseTargetInfo$PbSteadyRacePaceResult)var1;
            boolean var3;
            if (this.hasCompletedTime() == var5.hasCompletedTime()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasCompletedTime()) {
               if (var3 && this.getCompletedTime().equals(var5.getCompletedTime())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAverageHeartrate() == var5.hasAverageHeartrate()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAverageHeartrate()) {
               if (var4 && this.getAverageHeartrate() == var5.getAverageHeartrate()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasAverageSpeed() == var5.hasAverageSpeed()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAverageSpeed()) {
               if (var4 && Float.floatToIntBits(this.getAverageSpeed()) == Float.floatToIntBits(var5.getAverageSpeed())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (!var3 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public int getAverageHeartrate() {
      return this.averageHeartrate_;
   }

   public float getAverageSpeed() {
      return this.averageSpeed_;
   }

   public Types$PbDuration getCompletedTime() {
      Types$PbDuration var1;
      if (this.completedTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.completedTime_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getCompletedTimeOrBuilder() {
      Types$PbDuration var1;
      if (this.completedTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.completedTime_;
      }

      return var1;
   }

   public ExerciseTargetInfo$PbSteadyRacePaceResult getDefaultInstanceForType() {
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
            var2 = 0 + CodedOutputStream.computeMessageSize(1, this.getCompletedTime());
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeUInt32Size(2, this.averageHeartrate_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeFloatSize(3, this.averageSpeed_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasAverageHeartrate() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAverageSpeed() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasCompletedTime() {
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
         if (this.hasCompletedTime()) {
            var2 = (var1 * 37 + 1) * 53 + this.getCompletedTime().hashCode();
         }

         var1 = var2;
         if (this.hasAverageHeartrate()) {
            var1 = (var2 * 37 + 2) * 53 + this.getAverageHeartrate();
         }

         var2 = var1;
         if (this.hasAverageSpeed()) {
            var2 = (var1 * 37 + 3) * 53 + Float.floatToIntBits(this.getAverageSpeed());
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseTargetInfo.b().ensureFieldAccessorsInitialized(ExerciseTargetInfo$PbSteadyRacePaceResult.class, ExerciseTargetInfo$PbSteadyRacePaceResult$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasCompletedTime()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public ExerciseTargetInfo$PbSteadyRacePaceResult$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseTargetInfo$PbSteadyRacePaceResult$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseTargetInfo$PbSteadyRacePaceResult$Builder(var1, (ExerciseTargetInfo$1)null);
   }

   public ExerciseTargetInfo$PbSteadyRacePaceResult$Builder toBuilder() {
      ExerciseTargetInfo$PbSteadyRacePaceResult$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseTargetInfo$PbSteadyRacePaceResult$Builder((ExerciseTargetInfo$1)null);
      } else {
         var1 = (new ExerciseTargetInfo$PbSteadyRacePaceResult$Builder((ExerciseTargetInfo$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getCompletedTime());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeUInt32(2, this.averageHeartrate_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeFloat(3, this.averageSpeed_);
      }

      this.unknownFields.writeTo(var1);
   }
}
