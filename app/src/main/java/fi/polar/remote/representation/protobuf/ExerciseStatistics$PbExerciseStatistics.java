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

public final class ExerciseStatistics$PbExerciseStatistics extends GeneratedMessageV3 implements ExerciseStatistics$PbExerciseStatisticsOrBuilder {
   public static final int ACTIVITY_FIELD_NUMBER = 8;
   public static final int ALTITUDE_FIELD_NUMBER = 4;
   public static final int CADENCE_FIELD_NUMBER = 3;
   public static final int DECLINE_FIELD_NUMBER = 11;
   private static final ExerciseStatistics$PbExerciseStatistics DEFAULT_INSTANCE = new ExerciseStatistics$PbExerciseStatistics();
   public static final int HEART_RATE_FIELD_NUMBER = 1;
   public static final int INCLINE_FIELD_NUMBER = 10;
   public static final int LEFT_RIGHT_BALANCE_FIELD_NUMBER = 6;
   @Deprecated
   public static final Parser PARSER = new ExerciseStatistics$PbExerciseStatistics$1();
   public static final int POWER_FIELD_NUMBER = 5;
   public static final int SPEED_FIELD_NUMBER = 2;
   public static final int STRIDE_LENGTH_FIELD_NUMBER = 9;
   public static final int SWIMMING_FIELD_NUMBER = 12;
   public static final int TEMPERATURE_FIELD_NUMBER = 7;
   public static final int TRAINING_PEAKS_FIELD_NUMBER = 13;
   private static final long serialVersionUID = 0L;
   private ExerciseStatistics$PbActivityStatistics activity_;
   private ExerciseStatistics$PbAltitudeStatistics altitude_;
   private int bitField0_;
   private ExerciseStatistics$PbCadenceStatistics cadence_;
   private ExerciseStatistics$PbDeclineStatistics decline_;
   private ExerciseStatistics$PbHeartRateStatistics heartRate_;
   private ExerciseStatistics$PbInclineStatistics incline_;
   private ExerciseStatistics$PbLRBalanceStatistics leftRightBalance_;
   private byte memoizedIsInitialized;
   private ExerciseStatistics$PbPowerStatistics power_;
   private ExerciseStatistics$PbSpeedStatistics speed_;
   private ExerciseStatistics$PbStrideLengthStatistics strideLength_;
   private ExerciseStatistics$PbSwimmingStatistics swimming_;
   private ExerciseStatistics$PbTemperatureStatistics temperature_;
   private ExerciseStatistics$PbTrainingPeaksStatistics trainingPeaks_;

   private ExerciseStatistics$PbExerciseStatistics() {
      this.memoizedIsInitialized = (byte)-1;
   }

   private ExerciseStatistics$PbExerciseStatistics(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseStatistics$PbExerciseStatistics(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseStatistics$1 var3) {
      this(var1, var2);
   }

   private ExerciseStatistics$PbExerciseStatistics(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseStatistics$PbExerciseStatistics(Builder var1, ExerciseStatistics$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(ExerciseStatistics$PbExerciseStatistics var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExerciseStatistics$PbExerciseStatistics var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static ExerciseStatistics$PbActivityStatistics a(ExerciseStatistics$PbExerciseStatistics var0, ExerciseStatistics$PbActivityStatistics var1) {
      var0.activity_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseStatistics$PbAltitudeStatistics a(ExerciseStatistics$PbExerciseStatistics var0, ExerciseStatistics$PbAltitudeStatistics var1) {
      var0.altitude_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseStatistics$PbCadenceStatistics a(ExerciseStatistics$PbExerciseStatistics var0, ExerciseStatistics$PbCadenceStatistics var1) {
      var0.cadence_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseStatistics$PbDeclineStatistics a(ExerciseStatistics$PbExerciseStatistics var0, ExerciseStatistics$PbDeclineStatistics var1) {
      var0.decline_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseStatistics$PbHeartRateStatistics a(ExerciseStatistics$PbExerciseStatistics var0, ExerciseStatistics$PbHeartRateStatistics var1) {
      var0.heartRate_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseStatistics$PbInclineStatistics a(ExerciseStatistics$PbExerciseStatistics var0, ExerciseStatistics$PbInclineStatistics var1) {
      var0.incline_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseStatistics$PbLRBalanceStatistics a(ExerciseStatistics$PbExerciseStatistics var0, ExerciseStatistics$PbLRBalanceStatistics var1) {
      var0.leftRightBalance_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseStatistics$PbPowerStatistics a(ExerciseStatistics$PbExerciseStatistics var0, ExerciseStatistics$PbPowerStatistics var1) {
      var0.power_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseStatistics$PbSpeedStatistics a(ExerciseStatistics$PbExerciseStatistics var0, ExerciseStatistics$PbSpeedStatistics var1) {
      var0.speed_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseStatistics$PbStrideLengthStatistics a(ExerciseStatistics$PbExerciseStatistics var0, ExerciseStatistics$PbStrideLengthStatistics var1) {
      var0.strideLength_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseStatistics$PbSwimmingStatistics a(ExerciseStatistics$PbExerciseStatistics var0, ExerciseStatistics$PbSwimmingStatistics var1) {
      var0.swimming_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseStatistics$PbTemperatureStatistics a(ExerciseStatistics$PbExerciseStatistics var0, ExerciseStatistics$PbTemperatureStatistics var1) {
      var0.temperature_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseStatistics$PbTrainingPeaksStatistics a(ExerciseStatistics$PbExerciseStatistics var0, ExerciseStatistics$PbTrainingPeaksStatistics var1) {
      var0.trainingPeaks_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static ExerciseStatistics$PbExerciseStatistics getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseStatistics.G();
   }

   public static ExerciseStatistics$PbExerciseStatistics$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseStatistics$PbExerciseStatistics$Builder newBuilder(ExerciseStatistics$PbExerciseStatistics var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseStatistics$PbExerciseStatistics parseDelimitedFrom(InputStream var0) {
      return (ExerciseStatistics$PbExerciseStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseStatistics$PbExerciseStatistics parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbExerciseStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseStatistics$PbExerciseStatistics parseFrom(ByteString var0) {
      return (ExerciseStatistics$PbExerciseStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseStatistics$PbExerciseStatistics parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbExerciseStatistics)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseStatistics$PbExerciseStatistics parseFrom(CodedInputStream var0) {
      return (ExerciseStatistics$PbExerciseStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseStatistics$PbExerciseStatistics parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbExerciseStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseStatistics$PbExerciseStatistics parseFrom(InputStream var0) {
      return (ExerciseStatistics$PbExerciseStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseStatistics$PbExerciseStatistics parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbExerciseStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseStatistics$PbExerciseStatistics parseFrom(byte[] var0) {
      return (ExerciseStatistics$PbExerciseStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseStatistics$PbExerciseStatistics parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbExerciseStatistics)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseStatistics$PbExerciseStatistics)) {
            var2 = super.equals(var1);
         } else {
            ExerciseStatistics$PbExerciseStatistics var5 = (ExerciseStatistics$PbExerciseStatistics)var1;
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
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSpeed()) {
               if (var4 && this.getSpeed().equals(var5.getSpeed())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasCadence() == var5.hasCadence()) {
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

            if (var3 && this.hasAltitude() == var5.hasAltitude()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAltitude()) {
               if (var4 && this.getAltitude().equals(var5.getAltitude())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasPower() == var5.hasPower()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasPower()) {
               if (var3 && this.getPower().equals(var5.getPower())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasLeftRightBalance() == var5.hasLeftRightBalance()) {
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

            if (var3 && this.hasTemperature() == var5.hasTemperature()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasTemperature()) {
               if (var3 && this.getTemperature().equals(var5.getTemperature())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasActivity() == var5.hasActivity()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasActivity()) {
               if (var4 && this.getActivity().equals(var5.getActivity())) {
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

            if (var4 && this.hasDecline() == var5.hasDecline()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasDecline()) {
               if (var3 && this.getDecline().equals(var5.getDecline())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSwimming() == var5.hasSwimming()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSwimming()) {
               if (var4 && this.getSwimming().equals(var5.getSwimming())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasTrainingPeaks() == var5.hasTrainingPeaks()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasTrainingPeaks()) {
               if (var4 && this.getTrainingPeaks().equals(var5.getTrainingPeaks())) {
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

   public ExerciseStatistics$PbActivityStatistics getActivity() {
      ExerciseStatistics$PbActivityStatistics var1;
      if (this.activity_ == null) {
         var1 = ExerciseStatistics$PbActivityStatistics.getDefaultInstance();
      } else {
         var1 = this.activity_;
      }

      return var1;
   }

   public ExerciseStatistics$PbActivityStatisticsOrBuilder getActivityOrBuilder() {
      ExerciseStatistics$PbActivityStatistics var1;
      if (this.activity_ == null) {
         var1 = ExerciseStatistics$PbActivityStatistics.getDefaultInstance();
      } else {
         var1 = this.activity_;
      }

      return var1;
   }

   public ExerciseStatistics$PbAltitudeStatistics getAltitude() {
      ExerciseStatistics$PbAltitudeStatistics var1;
      if (this.altitude_ == null) {
         var1 = ExerciseStatistics$PbAltitudeStatistics.getDefaultInstance();
      } else {
         var1 = this.altitude_;
      }

      return var1;
   }

   public ExerciseStatistics$PbAltitudeStatisticsOrBuilder getAltitudeOrBuilder() {
      ExerciseStatistics$PbAltitudeStatistics var1;
      if (this.altitude_ == null) {
         var1 = ExerciseStatistics$PbAltitudeStatistics.getDefaultInstance();
      } else {
         var1 = this.altitude_;
      }

      return var1;
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

   public ExerciseStatistics$PbDeclineStatistics getDecline() {
      ExerciseStatistics$PbDeclineStatistics var1;
      if (this.decline_ == null) {
         var1 = ExerciseStatistics$PbDeclineStatistics.getDefaultInstance();
      } else {
         var1 = this.decline_;
      }

      return var1;
   }

   public ExerciseStatistics$PbDeclineStatisticsOrBuilder getDeclineOrBuilder() {
      ExerciseStatistics$PbDeclineStatistics var1;
      if (this.decline_ == null) {
         var1 = ExerciseStatistics$PbDeclineStatistics.getDefaultInstance();
      } else {
         var1 = this.decline_;
      }

      return var1;
   }

   public ExerciseStatistics$PbExerciseStatistics getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public ExerciseStatistics$PbHeartRateStatistics getHeartRate() {
      ExerciseStatistics$PbHeartRateStatistics var1;
      if (this.heartRate_ == null) {
         var1 = ExerciseStatistics$PbHeartRateStatistics.getDefaultInstance();
      } else {
         var1 = this.heartRate_;
      }

      return var1;
   }

   public ExerciseStatistics$PbHeartRateStatisticsOrBuilder getHeartRateOrBuilder() {
      ExerciseStatistics$PbHeartRateStatistics var1;
      if (this.heartRate_ == null) {
         var1 = ExerciseStatistics$PbHeartRateStatistics.getDefaultInstance();
      } else {
         var1 = this.heartRate_;
      }

      return var1;
   }

   public ExerciseStatistics$PbInclineStatistics getIncline() {
      ExerciseStatistics$PbInclineStatistics var1;
      if (this.incline_ == null) {
         var1 = ExerciseStatistics$PbInclineStatistics.getDefaultInstance();
      } else {
         var1 = this.incline_;
      }

      return var1;
   }

   public ExerciseStatistics$PbInclineStatisticsOrBuilder getInclineOrBuilder() {
      ExerciseStatistics$PbInclineStatistics var1;
      if (this.incline_ == null) {
         var1 = ExerciseStatistics$PbInclineStatistics.getDefaultInstance();
      } else {
         var1 = this.incline_;
      }

      return var1;
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
            var1 = var2 + CodedOutputStream.computeMessageSize(4, this.getAltitude());
         }

         var2 = var1;
         if ((this.bitField0_ & 16) == 16) {
            var2 = var1 + CodedOutputStream.computeMessageSize(5, this.getPower());
         }

         var1 = var2;
         if ((this.bitField0_ & 32) == 32) {
            var1 = var2 + CodedOutputStream.computeMessageSize(6, this.getLeftRightBalance());
         }

         var2 = var1;
         if ((this.bitField0_ & 64) == 64) {
            var2 = var1 + CodedOutputStream.computeMessageSize(7, this.getTemperature());
         }

         int var3 = var2;
         if ((this.bitField0_ & 128) == 128) {
            var3 = var2 + CodedOutputStream.computeMessageSize(8, this.getActivity());
         }

         var1 = var3;
         if ((this.bitField0_ & 256) == 256) {
            var1 = var3 + CodedOutputStream.computeMessageSize(9, this.getStrideLength());
         }

         var2 = var1;
         if ((this.bitField0_ & 512) == 512) {
            var2 = var1 + CodedOutputStream.computeMessageSize(10, this.getIncline());
         }

         var1 = var2;
         if ((this.bitField0_ & 1024) == 1024) {
            var1 = var2 + CodedOutputStream.computeMessageSize(11, this.getDecline());
         }

         var2 = var1;
         if ((this.bitField0_ & 2048) == 2048) {
            var2 = var1 + CodedOutputStream.computeMessageSize(12, this.getSwimming());
         }

         var1 = var2;
         if ((this.bitField0_ & 4096) == 4096) {
            var1 = var2 + CodedOutputStream.computeMessageSize(13, this.getTrainingPeaks());
         }

         var1 += this.unknownFields.getSerializedSize();
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

   public ExerciseStatistics$PbStrideLengthStatistics getStrideLength() {
      ExerciseStatistics$PbStrideLengthStatistics var1;
      if (this.strideLength_ == null) {
         var1 = ExerciseStatistics$PbStrideLengthStatistics.getDefaultInstance();
      } else {
         var1 = this.strideLength_;
      }

      return var1;
   }

   public ExerciseStatistics$PbStrideLengthStatisticsOrBuilder getStrideLengthOrBuilder() {
      ExerciseStatistics$PbStrideLengthStatistics var1;
      if (this.strideLength_ == null) {
         var1 = ExerciseStatistics$PbStrideLengthStatistics.getDefaultInstance();
      } else {
         var1 = this.strideLength_;
      }

      return var1;
   }

   public ExerciseStatistics$PbSwimmingStatistics getSwimming() {
      ExerciseStatistics$PbSwimmingStatistics var1;
      if (this.swimming_ == null) {
         var1 = ExerciseStatistics$PbSwimmingStatistics.getDefaultInstance();
      } else {
         var1 = this.swimming_;
      }

      return var1;
   }

   public ExerciseStatistics$PbSwimmingStatisticsOrBuilder getSwimmingOrBuilder() {
      ExerciseStatistics$PbSwimmingStatistics var1;
      if (this.swimming_ == null) {
         var1 = ExerciseStatistics$PbSwimmingStatistics.getDefaultInstance();
      } else {
         var1 = this.swimming_;
      }

      return var1;
   }

   public ExerciseStatistics$PbTemperatureStatistics getTemperature() {
      ExerciseStatistics$PbTemperatureStatistics var1;
      if (this.temperature_ == null) {
         var1 = ExerciseStatistics$PbTemperatureStatistics.getDefaultInstance();
      } else {
         var1 = this.temperature_;
      }

      return var1;
   }

   public ExerciseStatistics$PbTemperatureStatisticsOrBuilder getTemperatureOrBuilder() {
      ExerciseStatistics$PbTemperatureStatistics var1;
      if (this.temperature_ == null) {
         var1 = ExerciseStatistics$PbTemperatureStatistics.getDefaultInstance();
      } else {
         var1 = this.temperature_;
      }

      return var1;
   }

   public ExerciseStatistics$PbTrainingPeaksStatistics getTrainingPeaks() {
      ExerciseStatistics$PbTrainingPeaksStatistics var1;
      if (this.trainingPeaks_ == null) {
         var1 = ExerciseStatistics$PbTrainingPeaksStatistics.getDefaultInstance();
      } else {
         var1 = this.trainingPeaks_;
      }

      return var1;
   }

   public ExerciseStatistics$PbTrainingPeaksStatisticsOrBuilder getTrainingPeaksOrBuilder() {
      ExerciseStatistics$PbTrainingPeaksStatistics var1;
      if (this.trainingPeaks_ == null) {
         var1 = ExerciseStatistics$PbTrainingPeaksStatistics.getDefaultInstance();
      } else {
         var1 = this.trainingPeaks_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasActivity() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAltitude() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
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

   public boolean hasDecline() {
      boolean var1;
      if ((this.bitField0_ & 1024) == 1024) {
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
      if ((this.bitField0_ & 512) == 512) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLeftRightBalance() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPower() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
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
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSwimming() {
      boolean var1;
      if ((this.bitField0_ & 2048) == 2048) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTemperature() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTrainingPeaks() {
      boolean var1;
      if ((this.bitField0_ & 4096) == 4096) {
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
         if (this.hasHeartRate()) {
            var2 = (var1 * 37 + 1) * 53 + this.getHeartRate().hashCode();
         }

         var1 = var2;
         if (this.hasSpeed()) {
            var1 = (var2 * 37 + 2) * 53 + this.getSpeed().hashCode();
         }

         var2 = var1;
         if (this.hasCadence()) {
            var2 = (var1 * 37 + 3) * 53 + this.getCadence().hashCode();
         }

         var1 = var2;
         if (this.hasAltitude()) {
            var1 = (var2 * 37 + 4) * 53 + this.getAltitude().hashCode();
         }

         var2 = var1;
         if (this.hasPower()) {
            var2 = (var1 * 37 + 5) * 53 + this.getPower().hashCode();
         }

         int var3 = var2;
         if (this.hasLeftRightBalance()) {
            var3 = (var2 * 37 + 6) * 53 + this.getLeftRightBalance().hashCode();
         }

         var1 = var3;
         if (this.hasTemperature()) {
            var1 = (var3 * 37 + 7) * 53 + this.getTemperature().hashCode();
         }

         var2 = var1;
         if (this.hasActivity()) {
            var2 = (var1 * 37 + 8) * 53 + this.getActivity().hashCode();
         }

         var1 = var2;
         if (this.hasStrideLength()) {
            var1 = (var2 * 37 + 9) * 53 + this.getStrideLength().hashCode();
         }

         var2 = var1;
         if (this.hasIncline()) {
            var2 = (var1 * 37 + 10) * 53 + this.getIncline().hashCode();
         }

         var1 = var2;
         if (this.hasDecline()) {
            var1 = (var2 * 37 + 11) * 53 + this.getDecline().hashCode();
         }

         var2 = var1;
         if (this.hasSwimming()) {
            var2 = (var1 * 37 + 12) * 53 + this.getSwimming().hashCode();
         }

         var1 = var2;
         if (this.hasTrainingPeaks()) {
            var1 = (var2 * 37 + 13) * 53 + this.getTrainingPeaks().hashCode();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseStatistics.H().ensureFieldAccessorsInitialized(ExerciseStatistics$PbExerciseStatistics.class, ExerciseStatistics$PbExerciseStatistics$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (this.hasSwimming() && !this.getSwimming().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseStatistics$PbExerciseStatistics$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseStatistics$PbExerciseStatistics$Builder(var1, (ExerciseStatistics$1)null);
   }

   public ExerciseStatistics$PbExerciseStatistics$Builder toBuilder() {
      ExerciseStatistics$PbExerciseStatistics$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseStatistics$PbExerciseStatistics$Builder((ExerciseStatistics$1)null);
      } else {
         var1 = (new ExerciseStatistics$PbExerciseStatistics$Builder((ExerciseStatistics$1)null)).mergeFrom(this);
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
         var1.writeMessage(4, this.getAltitude());
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeMessage(5, this.getPower());
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeMessage(6, this.getLeftRightBalance());
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeMessage(7, this.getTemperature());
      }

      if ((this.bitField0_ & 128) == 128) {
         var1.writeMessage(8, this.getActivity());
      }

      if ((this.bitField0_ & 256) == 256) {
         var1.writeMessage(9, this.getStrideLength());
      }

      if ((this.bitField0_ & 512) == 512) {
         var1.writeMessage(10, this.getIncline());
      }

      if ((this.bitField0_ & 1024) == 1024) {
         var1.writeMessage(11, this.getDecline());
      }

      if ((this.bitField0_ & 2048) == 2048) {
         var1.writeMessage(12, this.getSwimming());
      }

      if ((this.bitField0_ & 4096) == 4096) {
         var1.writeMessage(13, this.getTrainingPeaks());
      }

      this.unknownFields.writeTo(var1);
   }
}
