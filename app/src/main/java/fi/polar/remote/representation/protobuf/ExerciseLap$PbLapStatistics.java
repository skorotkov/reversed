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

public final class ExerciseLap$PbLapStatistics extends GeneratedMessageV3 implements ExerciseLap$PbLapStatisticsOrBuilder {
   public static final int CADENCE_FIELD_NUMBER = 3;
   private static final ExerciseLap$PbLapStatistics DEFAULT_INSTANCE = new ExerciseLap$PbLapStatistics();
   public static final int HEART_RATE_FIELD_NUMBER = 1;
   public static final int INCLINE_FIELD_NUMBER = 6;
   public static final int LEFT_RIGHT_BALANCE_FIELD_NUMBER = 9;
   public static final int OBSOLETE_PEDALING_INDEX_FIELD_NUMBER = 5;
   @Deprecated
   public static final Parser PARSER = new ExerciseLap$PbLapStatistics$1();
   public static final int POWER_FIELD_NUMBER = 4;
   public static final int SPEED_FIELD_NUMBER = 2;
   public static final int STRIDE_LENGTH_FIELD_NUMBER = 7;
   public static final int SWIMMING_STATISTICS_FIELD_NUMBER = 8;
   public static final int TRAINING_PEAKS_FIELD_NUMBER = 10;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private ExerciseLap$PbLapCadenceStatistics cadence_;
   private ExerciseLap$PbLapHeartRateStatistics heartRate_;
   private ExerciseLap$PbLapInclineStatistics incline_;
   private ExerciseLap$PbLapLRBalanceStatistics leftRightBalance_;
   private byte memoizedIsInitialized;
   private ExerciseLap$PbLapPedalingIndexStatistics oBSOLETEPedalingIndex_;
   private ExerciseLap$PbLapPowerStatistics power_;
   private ExerciseLap$PbLapSpeedStatistics speed_;
   private ExerciseLap$PbLapStrideLengthStatistics strideLength_;
   private ExerciseLap$PbLapSwimmingStatistics swimmingStatistics_;
   private ExerciseLap$PbLapTrainingPeaksStatistics trainingPeaks_;

   private ExerciseLap$PbLapStatistics() {
      this.memoizedIsInitialized = (byte)-1;
   }

   private ExerciseLap$PbLapStatistics(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseLap$PbLapStatistics(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseLap$1 var3) {
      this(var1, var2);
   }

   private ExerciseLap$PbLapStatistics(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseLap$PbLapStatistics(Builder var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(ExerciseLap$PbLapStatistics var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExerciseLap$PbLapStatistics var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static ExerciseLap$PbLapCadenceStatistics a(ExerciseLap$PbLapStatistics var0, ExerciseLap$PbLapCadenceStatistics var1) {
      var0.cadence_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseLap$PbLapHeartRateStatistics a(ExerciseLap$PbLapStatistics var0, ExerciseLap$PbLapHeartRateStatistics var1) {
      var0.heartRate_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseLap$PbLapInclineStatistics a(ExerciseLap$PbLapStatistics var0, ExerciseLap$PbLapInclineStatistics var1) {
      var0.incline_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseLap$PbLapLRBalanceStatistics a(ExerciseLap$PbLapStatistics var0, ExerciseLap$PbLapLRBalanceStatistics var1) {
      var0.leftRightBalance_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseLap$PbLapPedalingIndexStatistics a(ExerciseLap$PbLapStatistics var0, ExerciseLap$PbLapPedalingIndexStatistics var1) {
      var0.oBSOLETEPedalingIndex_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseLap$PbLapPowerStatistics a(ExerciseLap$PbLapStatistics var0, ExerciseLap$PbLapPowerStatistics var1) {
      var0.power_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseLap$PbLapSpeedStatistics a(ExerciseLap$PbLapStatistics var0, ExerciseLap$PbLapSpeedStatistics var1) {
      var0.speed_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseLap$PbLapStrideLengthStatistics a(ExerciseLap$PbLapStatistics var0, ExerciseLap$PbLapStrideLengthStatistics var1) {
      var0.strideLength_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseLap$PbLapSwimmingStatistics a(ExerciseLap$PbLapStatistics var0, ExerciseLap$PbLapSwimmingStatistics var1) {
      var0.swimmingStatistics_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseLap$PbLapTrainingPeaksStatistics a(ExerciseLap$PbLapStatistics var0, ExerciseLap$PbLapTrainingPeaksStatistics var1) {
      var0.trainingPeaks_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static ExerciseLap$PbLapStatistics getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.y();
   }

   public static ExerciseLap$PbLapStatistics$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseLap$PbLapStatistics$Builder newBuilder(ExerciseLap$PbLapStatistics var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseLap$PbLapStatistics parseDelimitedFrom(InputStream var0) {
      return (ExerciseLap$PbLapStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLapStatistics parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLapStatistics parseFrom(ByteString var0) {
      return (ExerciseLap$PbLapStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseLap$PbLapStatistics parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapStatistics)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseLap$PbLapStatistics parseFrom(CodedInputStream var0) {
      return (ExerciseLap$PbLapStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLapStatistics parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLapStatistics parseFrom(InputStream var0) {
      return (ExerciseLap$PbLapStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLapStatistics parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLapStatistics parseFrom(byte[] var0) {
      return (ExerciseLap$PbLapStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseLap$PbLapStatistics parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapStatistics)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseLap$PbLapStatistics)) {
            var2 = super.equals(var1);
         } else {
            ExerciseLap$PbLapStatistics var5 = (ExerciseLap$PbLapStatistics)var1;
            boolean var3;
            if (this.hasHeartRate() == var5.hasHeartRate()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
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

            if (var3 && this.hasOBSOLETEPedalingIndex() == var5.hasOBSOLETEPedalingIndex()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasOBSOLETEPedalingIndex()) {
               if (var4 && this.getOBSOLETEPedalingIndex().equals(var5.getOBSOLETEPedalingIndex())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasIncline() == var5.hasIncline()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasIncline()) {
               if (var3 && this.getIncline().equals(var5.getIncline())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasStrideLength() == var5.hasStrideLength()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasStrideLength()) {
               if (var3 && this.getStrideLength().equals(var5.getStrideLength())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSwimmingStatistics() == var5.hasSwimmingStatistics()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSwimmingStatistics()) {
               if (var3 && this.getSwimmingStatistics().equals(var5.getSwimmingStatistics())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasLeftRightBalance() == var5.hasLeftRightBalance()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasLeftRightBalance()) {
               if (var3 && this.getLeftRightBalance().equals(var5.getLeftRightBalance())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTrainingPeaks() == var5.hasTrainingPeaks()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasTrainingPeaks()) {
               if (var3 && this.getTrainingPeaks().equals(var5.getTrainingPeaks())) {
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

   public ExerciseLap$PbLapCadenceStatistics getCadence() {
      ExerciseLap$PbLapCadenceStatistics var1;
      if (this.cadence_ == null) {
         var1 = ExerciseLap$PbLapCadenceStatistics.getDefaultInstance();
      } else {
         var1 = this.cadence_;
      }

      return var1;
   }

   public ExerciseLap$PbLapCadenceStatisticsOrBuilder getCadenceOrBuilder() {
      ExerciseLap$PbLapCadenceStatistics var1;
      if (this.cadence_ == null) {
         var1 = ExerciseLap$PbLapCadenceStatistics.getDefaultInstance();
      } else {
         var1 = this.cadence_;
      }

      return var1;
   }

   public ExerciseLap$PbLapStatistics getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public ExerciseLap$PbLapHeartRateStatistics getHeartRate() {
      ExerciseLap$PbLapHeartRateStatistics var1;
      if (this.heartRate_ == null) {
         var1 = ExerciseLap$PbLapHeartRateStatistics.getDefaultInstance();
      } else {
         var1 = this.heartRate_;
      }

      return var1;
   }

   public ExerciseLap$PbLapHeartRateStatisticsOrBuilder getHeartRateOrBuilder() {
      ExerciseLap$PbLapHeartRateStatistics var1;
      if (this.heartRate_ == null) {
         var1 = ExerciseLap$PbLapHeartRateStatistics.getDefaultInstance();
      } else {
         var1 = this.heartRate_;
      }

      return var1;
   }

   public ExerciseLap$PbLapInclineStatistics getIncline() {
      ExerciseLap$PbLapInclineStatistics var1;
      if (this.incline_ == null) {
         var1 = ExerciseLap$PbLapInclineStatistics.getDefaultInstance();
      } else {
         var1 = this.incline_;
      }

      return var1;
   }

   public ExerciseLap$PbLapInclineStatisticsOrBuilder getInclineOrBuilder() {
      ExerciseLap$PbLapInclineStatistics var1;
      if (this.incline_ == null) {
         var1 = ExerciseLap$PbLapInclineStatistics.getDefaultInstance();
      } else {
         var1 = this.incline_;
      }

      return var1;
   }

   public ExerciseLap$PbLapLRBalanceStatistics getLeftRightBalance() {
      ExerciseLap$PbLapLRBalanceStatistics var1;
      if (this.leftRightBalance_ == null) {
         var1 = ExerciseLap$PbLapLRBalanceStatistics.getDefaultInstance();
      } else {
         var1 = this.leftRightBalance_;
      }

      return var1;
   }

   public ExerciseLap$PbLapLRBalanceStatisticsOrBuilder getLeftRightBalanceOrBuilder() {
      ExerciseLap$PbLapLRBalanceStatistics var1;
      if (this.leftRightBalance_ == null) {
         var1 = ExerciseLap$PbLapLRBalanceStatistics.getDefaultInstance();
      } else {
         var1 = this.leftRightBalance_;
      }

      return var1;
   }

   public ExerciseLap$PbLapPedalingIndexStatistics getOBSOLETEPedalingIndex() {
      ExerciseLap$PbLapPedalingIndexStatistics var1;
      if (this.oBSOLETEPedalingIndex_ == null) {
         var1 = ExerciseLap$PbLapPedalingIndexStatistics.getDefaultInstance();
      } else {
         var1 = this.oBSOLETEPedalingIndex_;
      }

      return var1;
   }

   public ExerciseLap$PbLapPedalingIndexStatisticsOrBuilder getOBSOLETEPedalingIndexOrBuilder() {
      ExerciseLap$PbLapPedalingIndexStatistics var1;
      if (this.oBSOLETEPedalingIndex_ == null) {
         var1 = ExerciseLap$PbLapPedalingIndexStatistics.getDefaultInstance();
      } else {
         var1 = this.oBSOLETEPedalingIndex_;
      }

      return var1;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public ExerciseLap$PbLapPowerStatistics getPower() {
      ExerciseLap$PbLapPowerStatistics var1;
      if (this.power_ == null) {
         var1 = ExerciseLap$PbLapPowerStatistics.getDefaultInstance();
      } else {
         var1 = this.power_;
      }

      return var1;
   }

   public ExerciseLap$PbLapPowerStatisticsOrBuilder getPowerOrBuilder() {
      ExerciseLap$PbLapPowerStatistics var1;
      if (this.power_ == null) {
         var1 = ExerciseLap$PbLapPowerStatistics.getDefaultInstance();
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
            var2 = 0 + CodedOutputStream.computeMessageSize(1, this.getHeartRate());
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeMessageSize(2, this.getSpeed());
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeMessageSize(3, this.getCadence());
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeMessageSize(4, this.getPower());
         }

         var2 = var1;
         if ((this.bitField0_ & 16) == 16) {
            var2 = var1 + CodedOutputStream.computeMessageSize(5, this.getOBSOLETEPedalingIndex());
         }

         var1 = var2;
         if ((this.bitField0_ & 32) == 32) {
            var1 = var2 + CodedOutputStream.computeMessageSize(6, this.getIncline());
         }

         var2 = var1;
         if ((this.bitField0_ & 64) == 64) {
            var2 = var1 + CodedOutputStream.computeMessageSize(7, this.getStrideLength());
         }

         int var3 = var2;
         if ((this.bitField0_ & 128) == 128) {
            var3 = var2 + CodedOutputStream.computeMessageSize(8, this.getSwimmingStatistics());
         }

         var1 = var3;
         if ((this.bitField0_ & 256) == 256) {
            var1 = var3 + CodedOutputStream.computeMessageSize(9, this.getLeftRightBalance());
         }

         var2 = var1;
         if ((this.bitField0_ & 512) == 512) {
            var2 = var1 + CodedOutputStream.computeMessageSize(10, this.getTrainingPeaks());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public ExerciseLap$PbLapSpeedStatistics getSpeed() {
      ExerciseLap$PbLapSpeedStatistics var1;
      if (this.speed_ == null) {
         var1 = ExerciseLap$PbLapSpeedStatistics.getDefaultInstance();
      } else {
         var1 = this.speed_;
      }

      return var1;
   }

   public ExerciseLap$PbLapSpeedStatisticsOrBuilder getSpeedOrBuilder() {
      ExerciseLap$PbLapSpeedStatistics var1;
      if (this.speed_ == null) {
         var1 = ExerciseLap$PbLapSpeedStatistics.getDefaultInstance();
      } else {
         var1 = this.speed_;
      }

      return var1;
   }

   public ExerciseLap$PbLapStrideLengthStatistics getStrideLength() {
      ExerciseLap$PbLapStrideLengthStatistics var1;
      if (this.strideLength_ == null) {
         var1 = ExerciseLap$PbLapStrideLengthStatistics.getDefaultInstance();
      } else {
         var1 = this.strideLength_;
      }

      return var1;
   }

   public ExerciseLap$PbLapStrideLengthStatisticsOrBuilder getStrideLengthOrBuilder() {
      ExerciseLap$PbLapStrideLengthStatistics var1;
      if (this.strideLength_ == null) {
         var1 = ExerciseLap$PbLapStrideLengthStatistics.getDefaultInstance();
      } else {
         var1 = this.strideLength_;
      }

      return var1;
   }

   public ExerciseLap$PbLapSwimmingStatistics getSwimmingStatistics() {
      ExerciseLap$PbLapSwimmingStatistics var1;
      if (this.swimmingStatistics_ == null) {
         var1 = ExerciseLap$PbLapSwimmingStatistics.getDefaultInstance();
      } else {
         var1 = this.swimmingStatistics_;
      }

      return var1;
   }

   public ExerciseLap$PbLapSwimmingStatisticsOrBuilder getSwimmingStatisticsOrBuilder() {
      ExerciseLap$PbLapSwimmingStatistics var1;
      if (this.swimmingStatistics_ == null) {
         var1 = ExerciseLap$PbLapSwimmingStatistics.getDefaultInstance();
      } else {
         var1 = this.swimmingStatistics_;
      }

      return var1;
   }

   public ExerciseLap$PbLapTrainingPeaksStatistics getTrainingPeaks() {
      ExerciseLap$PbLapTrainingPeaksStatistics var1;
      if (this.trainingPeaks_ == null) {
         var1 = ExerciseLap$PbLapTrainingPeaksStatistics.getDefaultInstance();
      } else {
         var1 = this.trainingPeaks_;
      }

      return var1;
   }

   public ExerciseLap$PbLapTrainingPeaksStatisticsOrBuilder getTrainingPeaksOrBuilder() {
      ExerciseLap$PbLapTrainingPeaksStatistics var1;
      if (this.trainingPeaks_ == null) {
         var1 = ExerciseLap$PbLapTrainingPeaksStatistics.getDefaultInstance();
      } else {
         var1 = this.trainingPeaks_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasCadence() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasHeartRate() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasIncline() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLeftRightBalance() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasOBSOLETEPedalingIndex() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPower() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSpeed() {
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
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSwimmingStatistics() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTrainingPeaks() {
      boolean var1;
      if ((this.bitField0_ & 512) == 512) {
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
         if (this.hasHeartRate()) {
            var1 = (var2 * 37 + 1) * 53 + this.getHeartRate().hashCode();
         }

         var2 = var1;
         if (this.hasSpeed()) {
            var2 = (var1 * 37 + 2) * 53 + this.getSpeed().hashCode();
         }

         var1 = var2;
         if (this.hasCadence()) {
            var1 = (var2 * 37 + 3) * 53 + this.getCadence().hashCode();
         }

         var2 = var1;
         if (this.hasPower()) {
            var2 = (var1 * 37 + 4) * 53 + this.getPower().hashCode();
         }

         int var3 = var2;
         if (this.hasOBSOLETEPedalingIndex()) {
            var3 = (var2 * 37 + 5) * 53 + this.getOBSOLETEPedalingIndex().hashCode();
         }

         var1 = var3;
         if (this.hasIncline()) {
            var1 = (var3 * 37 + 6) * 53 + this.getIncline().hashCode();
         }

         var2 = var1;
         if (this.hasStrideLength()) {
            var2 = (var1 * 37 + 7) * 53 + this.getStrideLength().hashCode();
         }

         var3 = var2;
         if (this.hasSwimmingStatistics()) {
            var3 = (var2 * 37 + 8) * 53 + this.getSwimmingStatistics().hashCode();
         }

         var1 = var3;
         if (this.hasLeftRightBalance()) {
            var1 = (var3 * 37 + 9) * 53 + this.getLeftRightBalance().hashCode();
         }

         var2 = var1;
         if (this.hasTrainingPeaks()) {
            var2 = (var1 * 37 + 10) * 53 + this.getTrainingPeaks().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseLap.z().ensureFieldAccessorsInitialized(ExerciseLap$PbLapStatistics.class, ExerciseLap$PbLapStatistics$Builder.class);
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

   public ExerciseLap$PbLapStatistics$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseLap$PbLapStatistics$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseLap$PbLapStatistics$Builder(var1, (ExerciseLap$1)null);
   }

   public ExerciseLap$PbLapStatistics$Builder toBuilder() {
      ExerciseLap$PbLapStatistics$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseLap$PbLapStatistics$Builder((ExerciseLap$1)null);
      } else {
         var1 = (new ExerciseLap$PbLapStatistics$Builder((ExerciseLap$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getHeartRate());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getSpeed());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getCadence());
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeMessage(4, this.getPower());
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeMessage(5, this.getOBSOLETEPedalingIndex());
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeMessage(6, this.getIncline());
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeMessage(7, this.getStrideLength());
      }

      if ((this.bitField0_ & 128) == 128) {
         var1.writeMessage(8, this.getSwimmingStatistics());
      }

      if ((this.bitField0_ & 256) == 256) {
         var1.writeMessage(9, this.getLeftRightBalance());
      }

      if ((this.bitField0_ & 512) == 512) {
         var1.writeMessage(10, this.getTrainingPeaks());
      }

      this.unknownFields.writeTo(var1);
   }
}
