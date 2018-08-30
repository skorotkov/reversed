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

public final class ExerciseSamples$PbPowerMeasurements extends GeneratedMessageV3 implements ExerciseSamples$PbPowerMeasurementsOrBuilder {
   public static final int BOTTOM_DEAD_SPOT_ANGLE_FIELD_NUMBER = 8;
   public static final int CUMULATIVE_CRANK_REVOLUTIONS_FIELD_NUMBER = 2;
   public static final int CUMULATIVE_TIMESTAMP_FIELD_NUMBER = 3;
   public static final int CURRENT_POWER_FIELD_NUMBER = 1;
   private static final ExerciseSamples$PbPowerMeasurements DEFAULT_INSTANCE = new ExerciseSamples$PbPowerMeasurements();
   public static final int FORCE_MAGNITUDE_MAX_ANGLE_FIELD_NUMBER = 7;
   public static final int FORCE_MAGNITUDE_MAX_FIELD_NUMBER = 5;
   public static final int FORCE_MAGNITUDE_MIN_ANGLE_FIELD_NUMBER = 6;
   public static final int FORCE_MAGNITUDE_MIN_FIELD_NUMBER = 4;
   @Deprecated
   public static final Parser PARSER = new ExerciseSamples$PbPowerMeasurements$1();
   public static final int PEDAL_POWER_BALANCE_FIELD_NUMBER = 10;
   public static final int TOP_DEAD_SPOT_ANGLE_FIELD_NUMBER = 9;
   public static final int TORQUE_MAGNITUDE_MAX_FIELD_NUMBER = 12;
   public static final int TORQUE_MAGNITUDE_MIN_FIELD_NUMBER = 11;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int bottomDeadSpotAngle_;
   private int cumulativeCrankRevolutions_;
   private int cumulativeTimestamp_;
   private int currentPower_;
   private int forceMagnitudeMaxAngle_;
   private int forceMagnitudeMax_;
   private int forceMagnitudeMinAngle_;
   private int forceMagnitudeMin_;
   private byte memoizedIsInitialized;
   private int pedalPowerBalance_;
   private int topDeadSpotAngle_;
   private int torqueMagnitudeMax_;
   private int torqueMagnitudeMin_;

   private ExerciseSamples$PbPowerMeasurements() {
      this.memoizedIsInitialized = (byte)-1;
      this.currentPower_ = 0;
      this.cumulativeCrankRevolutions_ = 0;
      this.cumulativeTimestamp_ = 0;
      this.forceMagnitudeMin_ = 0;
      this.forceMagnitudeMax_ = 0;
      this.forceMagnitudeMinAngle_ = 0;
      this.forceMagnitudeMaxAngle_ = 0;
      this.bottomDeadSpotAngle_ = 0;
      this.topDeadSpotAngle_ = 0;
      this.pedalPowerBalance_ = 0;
      this.torqueMagnitudeMin_ = 0;
      this.torqueMagnitudeMax_ = 0;
   }

   private ExerciseSamples$PbPowerMeasurements(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseSamples$PbPowerMeasurements(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseSamples$1 var3) {
      this(var1, var2);
   }

   private ExerciseSamples$PbPowerMeasurements(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseSamples$PbPowerMeasurements(Builder var1, ExerciseSamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(ExerciseSamples$PbPowerMeasurements var0, int var1) {
      var0.currentPower_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExerciseSamples$PbPowerMeasurements var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(ExerciseSamples$PbPowerMeasurements var0, int var1) {
      var0.cumulativeCrankRevolutions_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(ExerciseSamples$PbPowerMeasurements var0, int var1) {
      var0.cumulativeTimestamp_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int d(ExerciseSamples$PbPowerMeasurements var0, int var1) {
      var0.forceMagnitudeMin_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int e(ExerciseSamples$PbPowerMeasurements var0, int var1) {
      var0.forceMagnitudeMax_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int f(ExerciseSamples$PbPowerMeasurements var0, int var1) {
      var0.forceMagnitudeMinAngle_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int g(ExerciseSamples$PbPowerMeasurements var0, int var1) {
      var0.forceMagnitudeMaxAngle_ = var1;
      return var1;
   }

   public static ExerciseSamples$PbPowerMeasurements getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseSamples.a();
   }

   // $FF: synthetic method
   static int h(ExerciseSamples$PbPowerMeasurements var0, int var1) {
      var0.bottomDeadSpotAngle_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int i(ExerciseSamples$PbPowerMeasurements var0, int var1) {
      var0.topDeadSpotAngle_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int j(ExerciseSamples$PbPowerMeasurements var0, int var1) {
      var0.pedalPowerBalance_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int k(ExerciseSamples$PbPowerMeasurements var0, int var1) {
      var0.torqueMagnitudeMin_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int l(ExerciseSamples$PbPowerMeasurements var0, int var1) {
      var0.torqueMagnitudeMax_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int m(ExerciseSamples$PbPowerMeasurements var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static ExerciseSamples$PbPowerMeasurements$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseSamples$PbPowerMeasurements$Builder newBuilder(ExerciseSamples$PbPowerMeasurements var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseSamples$PbPowerMeasurements parseDelimitedFrom(InputStream var0) {
      return (ExerciseSamples$PbPowerMeasurements)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseSamples$PbPowerMeasurements parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseSamples$PbPowerMeasurements)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseSamples$PbPowerMeasurements parseFrom(ByteString var0) {
      return (ExerciseSamples$PbPowerMeasurements)PARSER.parseFrom(var0);
   }

   public static ExerciseSamples$PbPowerMeasurements parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseSamples$PbPowerMeasurements)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseSamples$PbPowerMeasurements parseFrom(CodedInputStream var0) {
      return (ExerciseSamples$PbPowerMeasurements)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseSamples$PbPowerMeasurements parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseSamples$PbPowerMeasurements)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseSamples$PbPowerMeasurements parseFrom(InputStream var0) {
      return (ExerciseSamples$PbPowerMeasurements)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseSamples$PbPowerMeasurements parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseSamples$PbPowerMeasurements)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseSamples$PbPowerMeasurements parseFrom(byte[] var0) {
      return (ExerciseSamples$PbPowerMeasurements)PARSER.parseFrom(var0);
   }

   public static ExerciseSamples$PbPowerMeasurements parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseSamples$PbPowerMeasurements)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseSamples$PbPowerMeasurements)) {
            var2 = super.equals(var1);
         } else {
            ExerciseSamples$PbPowerMeasurements var5 = (ExerciseSamples$PbPowerMeasurements)var1;
            boolean var3;
            if (this.hasCurrentPower() == var5.hasCurrentPower()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasCurrentPower()) {
               if (var3 && this.getCurrentPower() == var5.getCurrentPower()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasCumulativeCrankRevolutions() == var5.hasCumulativeCrankRevolutions()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasCumulativeCrankRevolutions()) {
               if (var3 && this.getCumulativeCrankRevolutions() == var5.getCumulativeCrankRevolutions()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasCumulativeTimestamp() == var5.hasCumulativeTimestamp()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasCumulativeTimestamp()) {
               if (var3 && this.getCumulativeTimestamp() == var5.getCumulativeTimestamp()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasForceMagnitudeMin() == var5.hasForceMagnitudeMin()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasForceMagnitudeMin()) {
               if (var3 && this.getForceMagnitudeMin() == var5.getForceMagnitudeMin()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasForceMagnitudeMax() == var5.hasForceMagnitudeMax()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasForceMagnitudeMax()) {
               if (var4 && this.getForceMagnitudeMax() == var5.getForceMagnitudeMax()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasForceMagnitudeMinAngle() == var5.hasForceMagnitudeMinAngle()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasForceMagnitudeMinAngle()) {
               if (var4 && this.getForceMagnitudeMinAngle() == var5.getForceMagnitudeMinAngle()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasForceMagnitudeMaxAngle() == var5.hasForceMagnitudeMaxAngle()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasForceMagnitudeMaxAngle()) {
               if (var4 && this.getForceMagnitudeMaxAngle() == var5.getForceMagnitudeMaxAngle()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasBottomDeadSpotAngle() == var5.hasBottomDeadSpotAngle()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasBottomDeadSpotAngle()) {
               if (var4 && this.getBottomDeadSpotAngle() == var5.getBottomDeadSpotAngle()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasTopDeadSpotAngle() == var5.hasTopDeadSpotAngle()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasTopDeadSpotAngle()) {
               if (var4 && this.getTopDeadSpotAngle() == var5.getTopDeadSpotAngle()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasPedalPowerBalance() == var5.hasPedalPowerBalance()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasPedalPowerBalance()) {
               if (var3 && this.getPedalPowerBalance() == var5.getPedalPowerBalance()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTorqueMagnitudeMin() == var5.hasTorqueMagnitudeMin()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasTorqueMagnitudeMin()) {
               if (var3 && this.getTorqueMagnitudeMin() == var5.getTorqueMagnitudeMin()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTorqueMagnitudeMax() == var5.hasTorqueMagnitudeMax()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasTorqueMagnitudeMax()) {
               if (var3 && this.getTorqueMagnitudeMax() == var5.getTorqueMagnitudeMax()) {
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

   public int getBottomDeadSpotAngle() {
      return this.bottomDeadSpotAngle_;
   }

   public int getCumulativeCrankRevolutions() {
      return this.cumulativeCrankRevolutions_;
   }

   public int getCumulativeTimestamp() {
      return this.cumulativeTimestamp_;
   }

   public int getCurrentPower() {
      return this.currentPower_;
   }

   public ExerciseSamples$PbPowerMeasurements getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public int getForceMagnitudeMax() {
      return this.forceMagnitudeMax_;
   }

   public int getForceMagnitudeMaxAngle() {
      return this.forceMagnitudeMaxAngle_;
   }

   public int getForceMagnitudeMin() {
      return this.forceMagnitudeMin_;
   }

   public int getForceMagnitudeMinAngle() {
      return this.forceMagnitudeMinAngle_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getPedalPowerBalance() {
      return this.pedalPowerBalance_;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeInt32Size(1, this.currentPower_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeUInt32Size(2, this.cumulativeCrankRevolutions_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(3, this.cumulativeTimestamp_);
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeSInt32Size(4, this.forceMagnitudeMin_);
         }

         var2 = var1;
         if ((this.bitField0_ & 16) == 16) {
            var2 = var1 + CodedOutputStream.computeInt32Size(5, this.forceMagnitudeMax_);
         }

         var1 = var2;
         if ((this.bitField0_ & 32) == 32) {
            var1 = var2 + CodedOutputStream.computeUInt32Size(6, this.forceMagnitudeMinAngle_);
         }

         var2 = var1;
         if ((this.bitField0_ & 64) == 64) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(7, this.forceMagnitudeMaxAngle_);
         }

         var1 = var2;
         if ((this.bitField0_ & 128) == 128) {
            var1 = var2 + CodedOutputStream.computeUInt32Size(8, this.bottomDeadSpotAngle_);
         }

         var2 = var1;
         if ((this.bitField0_ & 256) == 256) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(9, this.topDeadSpotAngle_);
         }

         var1 = var2;
         if ((this.bitField0_ & 512) == 512) {
            var1 = var2 + CodedOutputStream.computeUInt32Size(10, this.pedalPowerBalance_);
         }

         var2 = var1;
         if ((this.bitField0_ & 1024) == 1024) {
            var2 = var1 + CodedOutputStream.computeInt32Size(11, this.torqueMagnitudeMin_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2048) == 2048) {
            var1 = var2 + CodedOutputStream.computeInt32Size(12, this.torqueMagnitudeMax_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public int getTopDeadSpotAngle() {
      return this.topDeadSpotAngle_;
   }

   public int getTorqueMagnitudeMax() {
      return this.torqueMagnitudeMax_;
   }

   public int getTorqueMagnitudeMin() {
      return this.torqueMagnitudeMin_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasBottomDeadSpotAngle() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasCumulativeCrankRevolutions() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasCumulativeTimestamp() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasCurrentPower() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasForceMagnitudeMax() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasForceMagnitudeMaxAngle() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasForceMagnitudeMin() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasForceMagnitudeMinAngle() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPedalPowerBalance() {
      boolean var1;
      if ((this.bitField0_ & 512) == 512) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTopDeadSpotAngle() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTorqueMagnitudeMax() {
      boolean var1;
      if ((this.bitField0_ & 2048) == 2048) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTorqueMagnitudeMin() {
      boolean var1;
      if ((this.bitField0_ & 1024) == 1024) {
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
         if (this.hasCurrentPower()) {
            var2 = (var1 * 37 + 1) * 53 + this.getCurrentPower();
         }

         var1 = var2;
         if (this.hasCumulativeCrankRevolutions()) {
            var1 = (var2 * 37 + 2) * 53 + this.getCumulativeCrankRevolutions();
         }

         var2 = var1;
         if (this.hasCumulativeTimestamp()) {
            var2 = (var1 * 37 + 3) * 53 + this.getCumulativeTimestamp();
         }

         var1 = var2;
         if (this.hasForceMagnitudeMin()) {
            var1 = (var2 * 37 + 4) * 53 + this.getForceMagnitudeMin();
         }

         var2 = var1;
         if (this.hasForceMagnitudeMax()) {
            var2 = (var1 * 37 + 5) * 53 + this.getForceMagnitudeMax();
         }

         var1 = var2;
         if (this.hasForceMagnitudeMinAngle()) {
            var1 = (var2 * 37 + 6) * 53 + this.getForceMagnitudeMinAngle();
         }

         var2 = var1;
         if (this.hasForceMagnitudeMaxAngle()) {
            var2 = (var1 * 37 + 7) * 53 + this.getForceMagnitudeMaxAngle();
         }

         var1 = var2;
         if (this.hasBottomDeadSpotAngle()) {
            var1 = (var2 * 37 + 8) * 53 + this.getBottomDeadSpotAngle();
         }

         var2 = var1;
         if (this.hasTopDeadSpotAngle()) {
            var2 = (var1 * 37 + 9) * 53 + this.getTopDeadSpotAngle();
         }

         var1 = var2;
         if (this.hasPedalPowerBalance()) {
            var1 = (var2 * 37 + 10) * 53 + this.getPedalPowerBalance();
         }

         var2 = var1;
         if (this.hasTorqueMagnitudeMin()) {
            var2 = (var1 * 37 + 11) * 53 + this.getTorqueMagnitudeMin();
         }

         var1 = var2;
         if (this.hasTorqueMagnitudeMax()) {
            var1 = (var2 * 37 + 12) * 53 + this.getTorqueMagnitudeMax();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseSamples.b().ensureFieldAccessorsInitialized(ExerciseSamples$PbPowerMeasurements.class, ExerciseSamples$PbPowerMeasurements$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasCurrentPower()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseSamples$PbPowerMeasurements$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseSamples$PbPowerMeasurements$Builder(var1, (ExerciseSamples$1)null);
   }

   public ExerciseSamples$PbPowerMeasurements$Builder toBuilder() {
      ExerciseSamples$PbPowerMeasurements$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseSamples$PbPowerMeasurements$Builder((ExerciseSamples$1)null);
      } else {
         var1 = (new ExerciseSamples$PbPowerMeasurements$Builder((ExerciseSamples$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeInt32(1, this.currentPower_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeUInt32(2, this.cumulativeCrankRevolutions_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeUInt32(3, this.cumulativeTimestamp_);
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeSInt32(4, this.forceMagnitudeMin_);
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeInt32(5, this.forceMagnitudeMax_);
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeUInt32(6, this.forceMagnitudeMinAngle_);
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeUInt32(7, this.forceMagnitudeMaxAngle_);
      }

      if ((this.bitField0_ & 128) == 128) {
         var1.writeUInt32(8, this.bottomDeadSpotAngle_);
      }

      if ((this.bitField0_ & 256) == 256) {
         var1.writeUInt32(9, this.topDeadSpotAngle_);
      }

      if ((this.bitField0_ & 512) == 512) {
         var1.writeUInt32(10, this.pedalPowerBalance_);
      }

      if ((this.bitField0_ & 1024) == 1024) {
         var1.writeInt32(11, this.torqueMagnitudeMin_);
      }

      if ((this.bitField0_ & 2048) == 2048) {
         var1.writeInt32(12, this.torqueMagnitudeMax_);
      }

      this.unknownFields.writeTo(var1);
   }
}
