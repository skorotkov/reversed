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

public final class ExercisePhaseStats$PbPhaseRepetition extends GeneratedMessageV3 implements ExercisePhaseStats$PbPhaseRepetitionOrBuilder {
   public static final int ASCENT_FIELD_NUMBER = 17;
   public static final int AVERAGE_SWOLF_FIELD_NUMBER = 15;
   public static final int CADENCE_FIELD_NUMBER = 10;
   private static final ExercisePhaseStats$PbPhaseRepetition DEFAULT_INSTANCE = new ExercisePhaseStats$PbPhaseRepetition();
   public static final int DESCENT_FIELD_NUMBER = 18;
   public static final int DISTANCE_FIELD_NUMBER = 6;
   public static final int DURATION_FIELD_NUMBER = 3;
   public static final int HEART_RATE_FIELD_NUMBER = 8;
   public static final int INDEX_FIELD_NUMBER = 1;
   public static final int IN_TARGET_ZONE_FIELD_NUMBER = 7;
   public static final int LEFT_RIGHT_BALANCE_FIELD_NUMBER = 12;
   @Deprecated
   public static final Parser PARSER = new ExercisePhaseStats$PbPhaseRepetition$1();
   public static final int PHASE_FINISHED_FIELD_NUMBER = 4;
   public static final int POWER_FIELD_NUMBER = 11;
   public static final int SPEED_FIELD_NUMBER = 9;
   public static final int SPLIT_DISTANCE_FIELD_NUMBER = 5;
   public static final int SPLIT_TIME_FIELD_NUMBER = 2;
   public static final int STRIDE_LENGTH_FIELD_NUMBER = 13;
   public static final int STROKES_PER_MIN_FIELD_NUMBER = 16;
   public static final int STROKE_COUNT_FIELD_NUMBER = 14;
   private static final long serialVersionUID = 0L;
   private float ascent_;
   private float averageSwolf_;
   private int bitField0_;
   private ExerciseStatistics$PbCadenceStatistics cadence_;
   private float descent_;
   private float distance_;
   private Types$PbDuration duration_;
   private ExercisePhaseStats$PbPhaseHeartRateStatistics heartRate_;
   private Types$PbDuration inTargetZone_;
   private int index_;
   private ExerciseStatistics$PbLRBalanceStatistics leftRightBalance_;
   private byte memoizedIsInitialized;
   private boolean phaseFinished_;
   private ExerciseStatistics$PbPowerStatistics power_;
   private ExerciseStatistics$PbSpeedStatistics speed_;
   private float splitDistance_;
   private Types$PbDuration splitTime_;
   private ExercisePhaseStats$PbPhaseStrideLengthStatistics strideLength_;
   private int strokeCount_;
   private int strokesPerMin_;

   private ExercisePhaseStats$PbPhaseRepetition() {
      this.memoizedIsInitialized = (byte)-1;
      this.index_ = 0;
      this.phaseFinished_ = false;
      this.splitDistance_ = 0.0F;
      this.distance_ = 0.0F;
      this.strokeCount_ = 0;
      this.averageSwolf_ = 0.0F;
      this.strokesPerMin_ = 0;
      this.ascent_ = 0.0F;
      this.descent_ = 0.0F;
   }

   private ExercisePhaseStats$PbPhaseRepetition(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExercisePhaseStats$PbPhaseRepetition(CodedInputStream var1, ExtensionRegistryLite var2, ExercisePhaseStats$1 var3) {
      this(var1, var2);
   }

   private ExercisePhaseStats$PbPhaseRepetition(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExercisePhaseStats$PbPhaseRepetition(Builder var1, ExercisePhaseStats$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(ExercisePhaseStats$PbPhaseRepetition var0, float var1) {
      var0.splitDistance_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(ExercisePhaseStats$PbPhaseRepetition var0, int var1) {
      var0.index_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExercisePhaseStats$PbPhaseRepetition var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static ExercisePhaseStats$PbPhaseHeartRateStatistics a(ExercisePhaseStats$PbPhaseRepetition var0, ExercisePhaseStats$PbPhaseHeartRateStatistics var1) {
      var0.heartRate_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExercisePhaseStats$PbPhaseStrideLengthStatistics a(ExercisePhaseStats$PbPhaseRepetition var0, ExercisePhaseStats$PbPhaseStrideLengthStatistics var1) {
      var0.strideLength_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseStatistics$PbCadenceStatistics a(ExercisePhaseStats$PbPhaseRepetition var0, ExerciseStatistics$PbCadenceStatistics var1) {
      var0.cadence_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseStatistics$PbLRBalanceStatistics a(ExercisePhaseStats$PbPhaseRepetition var0, ExerciseStatistics$PbLRBalanceStatistics var1) {
      var0.leftRightBalance_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseStatistics$PbPowerStatistics a(ExercisePhaseStats$PbPhaseRepetition var0, ExerciseStatistics$PbPowerStatistics var1) {
      var0.power_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseStatistics$PbSpeedStatistics a(ExercisePhaseStats$PbPhaseRepetition var0, ExerciseStatistics$PbSpeedStatistics var1) {
      var0.speed_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration a(ExercisePhaseStats$PbPhaseRepetition var0, Types$PbDuration var1) {
      var0.splitTime_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean a(ExercisePhaseStats$PbPhaseRepetition var0, boolean var1) {
      var0.phaseFinished_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static float b(ExercisePhaseStats$PbPhaseRepetition var0, float var1) {
      var0.distance_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(ExercisePhaseStats$PbPhaseRepetition var0, int var1) {
      var0.strokeCount_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration b(ExercisePhaseStats$PbPhaseRepetition var0, Types$PbDuration var1) {
      var0.duration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static float c(ExercisePhaseStats$PbPhaseRepetition var0, float var1) {
      var0.averageSwolf_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int c(ExercisePhaseStats$PbPhaseRepetition var0, int var1) {
      var0.strokesPerMin_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration c(ExercisePhaseStats$PbPhaseRepetition var0, Types$PbDuration var1) {
      var0.inTargetZone_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static float d(ExercisePhaseStats$PbPhaseRepetition var0, float var1) {
      var0.ascent_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int d(ExercisePhaseStats$PbPhaseRepetition var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static float e(ExercisePhaseStats$PbPhaseRepetition var0, float var1) {
      var0.descent_ = var1;
      return var1;
   }

   public static ExercisePhaseStats$PbPhaseRepetition getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExercisePhaseStats.e();
   }

   public static ExercisePhaseStats$PbPhaseRepetition$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExercisePhaseStats$PbPhaseRepetition$Builder newBuilder(ExercisePhaseStats$PbPhaseRepetition var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExercisePhaseStats$PbPhaseRepetition parseDelimitedFrom(InputStream var0) {
      return (ExercisePhaseStats$PbPhaseRepetition)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExercisePhaseStats$PbPhaseRepetition parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExercisePhaseStats$PbPhaseRepetition)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExercisePhaseStats$PbPhaseRepetition parseFrom(ByteString var0) {
      return (ExercisePhaseStats$PbPhaseRepetition)PARSER.parseFrom(var0);
   }

   public static ExercisePhaseStats$PbPhaseRepetition parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExercisePhaseStats$PbPhaseRepetition)PARSER.parseFrom(var0, var1);
   }

   public static ExercisePhaseStats$PbPhaseRepetition parseFrom(CodedInputStream var0) {
      return (ExercisePhaseStats$PbPhaseRepetition)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExercisePhaseStats$PbPhaseRepetition parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExercisePhaseStats$PbPhaseRepetition)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExercisePhaseStats$PbPhaseRepetition parseFrom(InputStream var0) {
      return (ExercisePhaseStats$PbPhaseRepetition)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExercisePhaseStats$PbPhaseRepetition parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExercisePhaseStats$PbPhaseRepetition)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExercisePhaseStats$PbPhaseRepetition parseFrom(byte[] var0) {
      return (ExercisePhaseStats$PbPhaseRepetition)PARSER.parseFrom(var0);
   }

   public static ExercisePhaseStats$PbPhaseRepetition parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExercisePhaseStats$PbPhaseRepetition)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExercisePhaseStats$PbPhaseRepetition)) {
            var2 = super.equals(var1);
         } else {
            ExercisePhaseStats$PbPhaseRepetition var5 = (ExercisePhaseStats$PbPhaseRepetition)var1;
            boolean var3;
            if (this.hasIndex() == var5.hasIndex()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasIndex()) {
               if (var3 && this.getIndex() == var5.getIndex()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSplitTime() == var5.hasSplitTime()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSplitTime()) {
               if (var4 && this.getSplitTime().equals(var5.getSplitTime())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasDuration() == var5.hasDuration()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasDuration()) {
               if (var3 && this.getDuration().equals(var5.getDuration())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasPhaseFinished() == var5.hasPhaseFinished()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasPhaseFinished()) {
               if (var4 && this.getPhaseFinished() == var5.getPhaseFinished()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasSplitDistance() == var5.hasSplitDistance()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSplitDistance()) {
               if (var4 && Float.floatToIntBits(this.getSplitDistance()) == Float.floatToIntBits(var5.getSplitDistance())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasDistance() == var5.hasDistance()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasDistance()) {
               if (var3 && Float.floatToIntBits(this.getDistance()) == Float.floatToIntBits(var5.getDistance())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasInTargetZone() == var5.hasInTargetZone()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasInTargetZone()) {
               if (var3 && this.getInTargetZone().equals(var5.getInTargetZone())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasHeartRate() == var5.hasHeartRate()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasHeartRate()) {
               if (var3 && this.getHeartRate().equals(var5.getHeartRate())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSpeed() == var5.hasSpeed()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSpeed()) {
               if (var3 && this.getSpeed().equals(var5.getSpeed())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasCadence() == var5.hasCadence()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasCadence()) {
               if (var4 && this.getCadence().equals(var5.getCadence())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasPower() == var5.hasPower()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasPower()) {
               if (var4 && this.getPower().equals(var5.getPower())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasLeftRightBalance() == var5.hasLeftRightBalance()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasLeftRightBalance()) {
               if (var4 && this.getLeftRightBalance().equals(var5.getLeftRightBalance())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasStrideLength() == var5.hasStrideLength()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasStrideLength()) {
               if (var4 && this.getStrideLength().equals(var5.getStrideLength())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasStrokeCount() == var5.hasStrokeCount()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasStrokeCount()) {
               if (var4 && this.getStrokeCount() == var5.getStrokeCount()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasAverageSwolf() == var5.hasAverageSwolf()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAverageSwolf()) {
               if (var4 && Float.floatToIntBits(this.getAverageSwolf()) == Float.floatToIntBits(var5.getAverageSwolf())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasStrokesPerMin() == var5.hasStrokesPerMin()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasStrokesPerMin()) {
               if (var4 && this.getStrokesPerMin() == var5.getStrokesPerMin()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasAscent() == var5.hasAscent()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasAscent()) {
               if (var3 && Float.floatToIntBits(this.getAscent()) == Float.floatToIntBits(var5.getAscent())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasDescent() == var5.hasDescent()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasDescent()) {
               if (var4 && Float.floatToIntBits(this.getDescent()) == Float.floatToIntBits(var5.getDescent())) {
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

   public float getAscent() {
      return this.ascent_;
   }

   public float getAverageSwolf() {
      return this.averageSwolf_;
   }

   public ExerciseStatistics$PbCadenceStatistics getCadence() {
      ExerciseStatistics$PbCadenceStatistics var1;
      if (this.cadence_ == null) {
         var1 = ExerciseStatistics$PbCadenceStatistics.getDefaultInstance();
      } else {
         var1 = this.cadence_;
      }

      return var1;
   }

   public ExerciseStatistics$PbCadenceStatisticsOrBuilder getCadenceOrBuilder() {
      ExerciseStatistics$PbCadenceStatistics var1;
      if (this.cadence_ == null) {
         var1 = ExerciseStatistics$PbCadenceStatistics.getDefaultInstance();
      } else {
         var1 = this.cadence_;
      }

      return var1;
   }

   public ExercisePhaseStats$PbPhaseRepetition getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public float getDescent() {
      return this.descent_;
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

   public ExercisePhaseStats$PbPhaseHeartRateStatistics getHeartRate() {
      ExercisePhaseStats$PbPhaseHeartRateStatistics var1;
      if (this.heartRate_ == null) {
         var1 = ExercisePhaseStats$PbPhaseHeartRateStatistics.getDefaultInstance();
      } else {
         var1 = this.heartRate_;
      }

      return var1;
   }

   public ExercisePhaseStats$PbPhaseHeartRateStatisticsOrBuilder getHeartRateOrBuilder() {
      ExercisePhaseStats$PbPhaseHeartRateStatistics var1;
      if (this.heartRate_ == null) {
         var1 = ExercisePhaseStats$PbPhaseHeartRateStatistics.getDefaultInstance();
      } else {
         var1 = this.heartRate_;
      }

      return var1;
   }

   public Types$PbDuration getInTargetZone() {
      Types$PbDuration var1;
      if (this.inTargetZone_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.inTargetZone_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getInTargetZoneOrBuilder() {
      Types$PbDuration var1;
      if (this.inTargetZone_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.inTargetZone_;
      }

      return var1;
   }

   public int getIndex() {
      return this.index_;
   }

   public ExerciseStatistics$PbLRBalanceStatistics getLeftRightBalance() {
      ExerciseStatistics$PbLRBalanceStatistics var1;
      if (this.leftRightBalance_ == null) {
         var1 = ExerciseStatistics$PbLRBalanceStatistics.getDefaultInstance();
      } else {
         var1 = this.leftRightBalance_;
      }

      return var1;
   }

   public ExerciseStatistics$PbLRBalanceStatisticsOrBuilder getLeftRightBalanceOrBuilder() {
      ExerciseStatistics$PbLRBalanceStatistics var1;
      if (this.leftRightBalance_ == null) {
         var1 = ExerciseStatistics$PbLRBalanceStatistics.getDefaultInstance();
      } else {
         var1 = this.leftRightBalance_;
      }

      return var1;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public boolean getPhaseFinished() {
      return this.phaseFinished_;
   }

   public ExerciseStatistics$PbPowerStatistics getPower() {
      ExerciseStatistics$PbPowerStatistics var1;
      if (this.power_ == null) {
         var1 = ExerciseStatistics$PbPowerStatistics.getDefaultInstance();
      } else {
         var1 = this.power_;
      }

      return var1;
   }

   public ExerciseStatistics$PbPowerStatisticsOrBuilder getPowerOrBuilder() {
      ExerciseStatistics$PbPowerStatistics var1;
      if (this.power_ == null) {
         var1 = ExerciseStatistics$PbPowerStatistics.getDefaultInstance();
      } else {
         var1 = this.power_;
      }

      return var1;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeUInt32Size(1, this.index_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeMessageSize(2, this.getSplitTime());
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeMessageSize(3, this.getDuration());
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeBoolSize(4, this.phaseFinished_);
         }

         var2 = var1;
         if ((this.bitField0_ & 16) == 16) {
            var2 = var1 + CodedOutputStream.computeFloatSize(5, this.splitDistance_);
         }

         var1 = var2;
         if ((this.bitField0_ & 32) == 32) {
            var1 = var2 + CodedOutputStream.computeFloatSize(6, this.distance_);
         }

         var2 = var1;
         if ((this.bitField0_ & 64) == 64) {
            var2 = var1 + CodedOutputStream.computeMessageSize(7, this.getInTargetZone());
         }

         var1 = var2;
         if ((this.bitField0_ & 128) == 128) {
            var1 = var2 + CodedOutputStream.computeMessageSize(8, this.getHeartRate());
         }

         var2 = var1;
         if ((this.bitField0_ & 256) == 256) {
            var2 = var1 + CodedOutputStream.computeMessageSize(9, this.getSpeed());
         }

         int var3 = var2;
         if ((this.bitField0_ & 512) == 512) {
            var3 = var2 + CodedOutputStream.computeMessageSize(10, this.getCadence());
         }

         var1 = var3;
         if ((this.bitField0_ & 1024) == 1024) {
            var1 = var3 + CodedOutputStream.computeMessageSize(11, this.getPower());
         }

         var2 = var1;
         if ((this.bitField0_ & 2048) == 2048) {
            var2 = var1 + CodedOutputStream.computeMessageSize(12, this.getLeftRightBalance());
         }

         var3 = var2;
         if ((this.bitField0_ & 4096) == 4096) {
            var3 = var2 + CodedOutputStream.computeMessageSize(13, this.getStrideLength());
         }

         var1 = var3;
         if ((this.bitField0_ & 8192) == 8192) {
            var1 = var3 + CodedOutputStream.computeUInt32Size(14, this.strokeCount_);
         }

         var3 = var1;
         if ((this.bitField0_ & 16384) == 16384) {
            var3 = var1 + CodedOutputStream.computeFloatSize(15, this.averageSwolf_);
         }

         var2 = var3;
         if ((this.bitField0_ & '耀') == 32768) {
            var2 = var3 + CodedOutputStream.computeUInt32Size(16, this.strokesPerMin_);
         }

         var1 = var2;
         if ((this.bitField0_ & 65536) == 65536) {
            var1 = var2 + CodedOutputStream.computeFloatSize(17, this.ascent_);
         }

         var2 = var1;
         if ((this.bitField0_ & 131072) == 131072) {
            var2 = var1 + CodedOutputStream.computeFloatSize(18, this.descent_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public ExerciseStatistics$PbSpeedStatistics getSpeed() {
      ExerciseStatistics$PbSpeedStatistics var1;
      if (this.speed_ == null) {
         var1 = ExerciseStatistics$PbSpeedStatistics.getDefaultInstance();
      } else {
         var1 = this.speed_;
      }

      return var1;
   }

   public ExerciseStatistics$PbSpeedStatisticsOrBuilder getSpeedOrBuilder() {
      ExerciseStatistics$PbSpeedStatistics var1;
      if (this.speed_ == null) {
         var1 = ExerciseStatistics$PbSpeedStatistics.getDefaultInstance();
      } else {
         var1 = this.speed_;
      }

      return var1;
   }

   public float getSplitDistance() {
      return this.splitDistance_;
   }

   public Types$PbDuration getSplitTime() {
      Types$PbDuration var1;
      if (this.splitTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.splitTime_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getSplitTimeOrBuilder() {
      Types$PbDuration var1;
      if (this.splitTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.splitTime_;
      }

      return var1;
   }

   public ExercisePhaseStats$PbPhaseStrideLengthStatistics getStrideLength() {
      ExercisePhaseStats$PbPhaseStrideLengthStatistics var1;
      if (this.strideLength_ == null) {
         var1 = ExercisePhaseStats$PbPhaseStrideLengthStatistics.getDefaultInstance();
      } else {
         var1 = this.strideLength_;
      }

      return var1;
   }

   public ExercisePhaseStats$PbPhaseStrideLengthStatisticsOrBuilder getStrideLengthOrBuilder() {
      ExercisePhaseStats$PbPhaseStrideLengthStatistics var1;
      if (this.strideLength_ == null) {
         var1 = ExercisePhaseStats$PbPhaseStrideLengthStatistics.getDefaultInstance();
      } else {
         var1 = this.strideLength_;
      }

      return var1;
   }

   public int getStrokeCount() {
      return this.strokeCount_;
   }

   public int getStrokesPerMin() {
      return this.strokesPerMin_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasAscent() {
      boolean var1;
      if ((this.bitField0_ & 65536) == 65536) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAverageSwolf() {
      boolean var1;
      if ((this.bitField0_ & 16384) == 16384) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasCadence() {
      boolean var1;
      if ((this.bitField0_ & 512) == 512) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDescent() {
      boolean var1;
      if ((this.bitField0_ & 131072) == 131072) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDistance() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDuration() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasHeartRate() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasInTargetZone() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasIndex() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLeftRightBalance() {
      boolean var1;
      if ((this.bitField0_ & 2048) == 2048) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPhaseFinished() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPower() {
      boolean var1;
      if ((this.bitField0_ & 1024) == 1024) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSpeed() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSplitDistance() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSplitTime() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStrideLength() {
      boolean var1;
      if ((this.bitField0_ & 4096) == 4096) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStrokeCount() {
      boolean var1;
      if ((this.bitField0_ & 8192) == 8192) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStrokesPerMin() {
      boolean var1;
      if ((this.bitField0_ & '耀') == 32768) {
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
         if (this.hasIndex()) {
            var2 = (var1 * 37 + 1) * 53 + this.getIndex();
         }

         var1 = var2;
         if (this.hasSplitTime()) {
            var1 = (var2 * 37 + 2) * 53 + this.getSplitTime().hashCode();
         }

         int var3 = var1;
         if (this.hasDuration()) {
            var3 = (var1 * 37 + 3) * 53 + this.getDuration().hashCode();
         }

         var2 = var3;
         if (this.hasPhaseFinished()) {
            var2 = (var3 * 37 + 4) * 53 + Internal.hashBoolean(this.getPhaseFinished());
         }

         var1 = var2;
         if (this.hasSplitDistance()) {
            var1 = (var2 * 37 + 5) * 53 + Float.floatToIntBits(this.getSplitDistance());
         }

         var2 = var1;
         if (this.hasDistance()) {
            var2 = (var1 * 37 + 6) * 53 + Float.floatToIntBits(this.getDistance());
         }

         var3 = var2;
         if (this.hasInTargetZone()) {
            var3 = (var2 * 37 + 7) * 53 + this.getInTargetZone().hashCode();
         }

         var1 = var3;
         if (this.hasHeartRate()) {
            var1 = (var3 * 37 + 8) * 53 + this.getHeartRate().hashCode();
         }

         var2 = var1;
         if (this.hasSpeed()) {
            var2 = (var1 * 37 + 9) * 53 + this.getSpeed().hashCode();
         }

         var1 = var2;
         if (this.hasCadence()) {
            var1 = (var2 * 37 + 10) * 53 + this.getCadence().hashCode();
         }

         var2 = var1;
         if (this.hasPower()) {
            var2 = (var1 * 37 + 11) * 53 + this.getPower().hashCode();
         }

         var1 = var2;
         if (this.hasLeftRightBalance()) {
            var1 = (var2 * 37 + 12) * 53 + this.getLeftRightBalance().hashCode();
         }

         var2 = var1;
         if (this.hasStrideLength()) {
            var2 = (var1 * 37 + 13) * 53 + this.getStrideLength().hashCode();
         }

         var1 = var2;
         if (this.hasStrokeCount()) {
            var1 = (var2 * 37 + 14) * 53 + this.getStrokeCount();
         }

         var2 = var1;
         if (this.hasAverageSwolf()) {
            var2 = (var1 * 37 + 15) * 53 + Float.floatToIntBits(this.getAverageSwolf());
         }

         var1 = var2;
         if (this.hasStrokesPerMin()) {
            var1 = (var2 * 37 + 16) * 53 + this.getStrokesPerMin();
         }

         var2 = var1;
         if (this.hasAscent()) {
            var2 = (var1 * 37 + 17) * 53 + Float.floatToIntBits(this.getAscent());
         }

         var1 = var2;
         if (this.hasDescent()) {
            var1 = (var2 * 37 + 18) * 53 + Float.floatToIntBits(this.getDescent());
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExercisePhaseStats.f().ensureFieldAccessorsInitialized(ExercisePhaseStats$PbPhaseRepetition.class, ExercisePhaseStats$PbPhaseRepetition$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasIndex()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasSplitTime()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasDuration()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExercisePhaseStats$PbPhaseRepetition$Builder newBuilderForType(BuilderParent var1) {
      return new ExercisePhaseStats$PbPhaseRepetition$Builder(var1, (ExercisePhaseStats$1)null);
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder toBuilder() {
      ExercisePhaseStats$PbPhaseRepetition$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExercisePhaseStats$PbPhaseRepetition$Builder((ExercisePhaseStats$1)null);
      } else {
         var1 = (new ExercisePhaseStats$PbPhaseRepetition$Builder((ExercisePhaseStats$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.index_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getSplitTime());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getDuration());
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeBool(4, this.phaseFinished_);
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeFloat(5, this.splitDistance_);
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeFloat(6, this.distance_);
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeMessage(7, this.getInTargetZone());
      }

      if ((this.bitField0_ & 128) == 128) {
         var1.writeMessage(8, this.getHeartRate());
      }

      if ((this.bitField0_ & 256) == 256) {
         var1.writeMessage(9, this.getSpeed());
      }

      if ((this.bitField0_ & 512) == 512) {
         var1.writeMessage(10, this.getCadence());
      }

      if ((this.bitField0_ & 1024) == 1024) {
         var1.writeMessage(11, this.getPower());
      }

      if ((this.bitField0_ & 2048) == 2048) {
         var1.writeMessage(12, this.getLeftRightBalance());
      }

      if ((this.bitField0_ & 4096) == 4096) {
         var1.writeMessage(13, this.getStrideLength());
      }

      if ((this.bitField0_ & 8192) == 8192) {
         var1.writeUInt32(14, this.strokeCount_);
      }

      if ((this.bitField0_ & 16384) == 16384) {
         var1.writeFloat(15, this.averageSwolf_);
      }

      if ((this.bitField0_ & '耀') == 32768) {
         var1.writeUInt32(16, this.strokesPerMin_);
      }

      if ((this.bitField0_ & 65536) == 65536) {
         var1.writeFloat(17, this.ascent_);
      }

      if ((this.bitField0_ & 131072) == 131072) {
         var1.writeFloat(18, this.descent_);
      }

      this.unknownFields.writeTo(var1);
   }
}
