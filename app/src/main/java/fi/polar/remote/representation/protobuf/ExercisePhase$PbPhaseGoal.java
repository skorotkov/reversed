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

public final class ExercisePhase$PbPhaseGoal extends GeneratedMessageV3 implements ExercisePhase$PbPhaseGoalOrBuilder {
   private static final ExercisePhase$PbPhaseGoal DEFAULT_INSTANCE = new ExercisePhase$PbPhaseGoal();
   public static final int DISTANCE_FIELD_NUMBER = 3;
   public static final int DURATION_FIELD_NUMBER = 2;
   public static final int GOAL_TYPE_FIELD_NUMBER = 1;
   public static final int HEART_RATE_FIELD_NUMBER = 4;
   @Deprecated
   public static final Parser PARSER = new ExercisePhase$PbPhaseGoal$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private float distance_;
   private Types$PbDuration duration_;
   private int goalType_;
   private int heartRate_;
   private byte memoizedIsInitialized;

   private ExercisePhase$PbPhaseGoal() {
      this.memoizedIsInitialized = (byte)-1;
      this.goalType_ = 0;
      this.distance_ = 0.0F;
      this.heartRate_ = 0;
   }

   private ExercisePhase$PbPhaseGoal(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExercisePhase$PbPhaseGoal(CodedInputStream var1, ExtensionRegistryLite var2, ExercisePhase$1 var3) {
      this(var1, var2);
   }

   private ExercisePhase$PbPhaseGoal(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExercisePhase$PbPhaseGoal(Builder var1, ExercisePhase$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(ExercisePhase$PbPhaseGoal var0, float var1) {
      var0.distance_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(ExercisePhase$PbPhaseGoal var0, int var1) {
      var0.goalType_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExercisePhase$PbPhaseGoal var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbDuration a(ExercisePhase$PbPhaseGoal var0, Types$PbDuration var1) {
      var0.duration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(ExercisePhase$PbPhaseGoal var0, int var1) {
      var0.heartRate_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(ExercisePhase$PbPhaseGoal var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static ExercisePhase$PbPhaseGoal getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExercisePhase.a();
   }

   public static ExercisePhase$PbPhaseGoal$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExercisePhase$PbPhaseGoal$Builder newBuilder(ExercisePhase$PbPhaseGoal var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExercisePhase$PbPhaseGoal parseDelimitedFrom(InputStream var0) {
      return (ExercisePhase$PbPhaseGoal)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExercisePhase$PbPhaseGoal parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExercisePhase$PbPhaseGoal)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExercisePhase$PbPhaseGoal parseFrom(ByteString var0) {
      return (ExercisePhase$PbPhaseGoal)PARSER.parseFrom(var0);
   }

   public static ExercisePhase$PbPhaseGoal parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExercisePhase$PbPhaseGoal)PARSER.parseFrom(var0, var1);
   }

   public static ExercisePhase$PbPhaseGoal parseFrom(CodedInputStream var0) {
      return (ExercisePhase$PbPhaseGoal)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExercisePhase$PbPhaseGoal parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExercisePhase$PbPhaseGoal)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExercisePhase$PbPhaseGoal parseFrom(InputStream var0) {
      return (ExercisePhase$PbPhaseGoal)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExercisePhase$PbPhaseGoal parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExercisePhase$PbPhaseGoal)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExercisePhase$PbPhaseGoal parseFrom(byte[] var0) {
      return (ExercisePhase$PbPhaseGoal)PARSER.parseFrom(var0);
   }

   public static ExercisePhase$PbPhaseGoal parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExercisePhase$PbPhaseGoal)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExercisePhase$PbPhaseGoal)) {
            var2 = super.equals(var1);
         } else {
            ExercisePhase$PbPhaseGoal var5 = (ExercisePhase$PbPhaseGoal)var1;
            boolean var3;
            if (this.hasGoalType() == var5.hasGoalType()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasGoalType()) {
               if (var3 && this.goalType_ == var5.goalType_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasDuration() == var5.hasDuration()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasDuration()) {
               if (var4 && this.getDuration().equals(var5.getDuration())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasDistance() == var5.hasDistance()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasDistance()) {
               if (var4 && Float.floatToIntBits(this.getDistance()) == Float.floatToIntBits(var5.getDistance())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasHeartRate() == var5.hasHeartRate()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasHeartRate()) {
               if (var4 && this.getHeartRate() == var5.getHeartRate()) {
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

   public ExercisePhase$PbPhaseGoal getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public float getDistance() {
      return this.distance_;
   }

   public Types$PbDuration getDuration() {
      Types$PbDuration var1;
      if (this.duration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.duration_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getDurationOrBuilder() {
      Types$PbDuration var1;
      if (this.duration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.duration_;
      }

      return var1;
   }

   public ExercisePhase$PbPhaseGoal$PhaseGoalType getGoalType() {
      ExercisePhase$PbPhaseGoal$PhaseGoalType var1 = ExercisePhase$PbPhaseGoal$PhaseGoalType.valueOf(this.goalType_);
      ExercisePhase$PbPhaseGoal$PhaseGoalType var2 = var1;
      if (var1 == null) {
         var2 = ExercisePhase$PbPhaseGoal$PhaseGoalType.PHASE_GOAL_OFF;
      }

      return var2;
   }

   public int getHeartRate() {
      return this.heartRate_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeEnumSize(1, this.goalType_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeMessageSize(2, this.getDuration());
         }

         var1 = var2;
         if ((this.bitField0_ & 4) == 4) {
            var1 = var2 + CodedOutputStream.computeFloatSize(3, this.distance_);
         }

         var2 = var1;
         if ((this.bitField0_ & 8) == 8) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(4, this.heartRate_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasDistance() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDuration() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasGoalType() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasHeartRate() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
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
         if (this.hasGoalType()) {
            var1 = (var2 * 37 + 1) * 53 + this.goalType_;
         }

         var2 = var1;
         if (this.hasDuration()) {
            var2 = (var1 * 37 + 2) * 53 + this.getDuration().hashCode();
         }

         var1 = var2;
         if (this.hasDistance()) {
            var1 = (var2 * 37 + 3) * 53 + Float.floatToIntBits(this.getDistance());
         }

         var2 = var1;
         if (this.hasHeartRate()) {
            var2 = (var1 * 37 + 4) * 53 + this.getHeartRate();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExercisePhase.b().ensureFieldAccessorsInitialized(ExercisePhase$PbPhaseGoal.class, ExercisePhase$PbPhaseGoal$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasGoalType()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public ExercisePhase$PbPhaseGoal$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExercisePhase$PbPhaseGoal$Builder newBuilderForType(BuilderParent var1) {
      return new ExercisePhase$PbPhaseGoal$Builder(var1, (ExercisePhase$1)null);
   }

   public ExercisePhase$PbPhaseGoal$Builder toBuilder() {
      ExercisePhase$PbPhaseGoal$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExercisePhase$PbPhaseGoal$Builder((ExercisePhase$1)null);
      } else {
         var1 = (new ExercisePhase$PbPhaseGoal$Builder((ExercisePhase$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.goalType_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getDuration());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeFloat(3, this.distance_);
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeUInt32(4, this.heartRate_);
      }

      this.unknownFields.writeTo(var1);
   }
}
