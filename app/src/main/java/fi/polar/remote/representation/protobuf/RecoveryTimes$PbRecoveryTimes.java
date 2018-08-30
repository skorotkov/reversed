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
import java.util.Collections;
import java.util.List;

public final class RecoveryTimes$PbRecoveryTimes extends GeneratedMessageV3 implements RecoveryTimes$PbRecoveryTimesOrBuilder {
   public static final int ACCUMULATED_ACTIVITY_FIELD_NUMBER = 12;
   public static final int ACTIVITY_CALORIES_FIELD_NUMBER = 9;
   public static final int BMR_CALORIES_FIELD_NUMBER = 10;
   private static final RecoveryTimes$PbRecoveryTimes DEFAULT_INSTANCE = new RecoveryTimes$PbRecoveryTimes();
   public static final int END_CARBO_CONSUMPTION_FIELD_NUMBER = 4;
   public static final int END_CUMULATIVE_MECHANICAL_STIMULUS_FIELD_NUMBER = 6;
   public static final int END_GLYCOGEN_LEFT_PERCENT_FIELD_NUMBER = 3;
   public static final int END_PROTEIN_CONSUMPTION_FIELD_NUMBER = 5;
   public static final int EXERCISE_CALORIES_FIELD_NUMBER = 8;
   public static final int LAST_HALF_HOUR_AVG_MET_FIELD_NUMBER = 7;
   public static final int NUMBER_OF_EXERCISE_HALF_HOURS_FIELD_NUMBER = 13;
   @Deprecated
   public static final Parser PARSER = new RecoveryTimes$PbRecoveryTimes$1();
   public static final int RECOVERY_TIMES_FIELD_NUMBER = 2;
   public static final int START_OF_TIMES_FIELD_NUMBER = 1;
   public static final int STEPS_FIELD_NUMBER = 11;
   private static final long serialVersionUID = 0L;
   private float accumulatedActivity_;
   private float activityCalories_;
   private int bitField0_;
   private float bmrCalories_;
   private float endCarboConsumption_;
   private float endCumulativeMechanicalStimulus_;
   private float endGlycogenLeftPercent_;
   private float endProteinConsumption_;
   private float exerciseCalories_;
   private float lastHalfHourAvgMet_;
   private byte memoizedIsInitialized;
   private int numberOfExerciseHalfHours_;
   private List recoveryTimes_;
   private Types$PbLocalDateTime startOfTimes_;
   private int steps_;

   private RecoveryTimes$PbRecoveryTimes() {
      this.memoizedIsInitialized = (byte)-1;
      this.recoveryTimes_ = Collections.emptyList();
      this.endGlycogenLeftPercent_ = 0.0F;
      this.endCarboConsumption_ = 0.0F;
      this.endProteinConsumption_ = 0.0F;
      this.endCumulativeMechanicalStimulus_ = 0.0F;
      this.lastHalfHourAvgMet_ = 0.0F;
      this.exerciseCalories_ = 0.0F;
      this.activityCalories_ = 0.0F;
      this.bmrCalories_ = 0.0F;
      this.steps_ = 0;
      this.accumulatedActivity_ = 0.0F;
      this.numberOfExerciseHalfHours_ = 0;
   }

   private RecoveryTimes$PbRecoveryTimes(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   RecoveryTimes$PbRecoveryTimes(CodedInputStream var1, ExtensionRegistryLite var2, RecoveryTimes$1 var3) {
      this(var1, var2);
   }

   private RecoveryTimes$PbRecoveryTimes(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   RecoveryTimes$PbRecoveryTimes(Builder var1, RecoveryTimes$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(RecoveryTimes$PbRecoveryTimes var0, float var1) {
      var0.endGlycogenLeftPercent_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(RecoveryTimes$PbRecoveryTimes var0, int var1) {
      var0.steps_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbLocalDateTime a(RecoveryTimes$PbRecoveryTimes var0, Types$PbLocalDateTime var1) {
      var0.startOfTimes_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List a(RecoveryTimes$PbRecoveryTimes var0) {
      return var0.recoveryTimes_;
   }

   // $FF: synthetic method
   static List a(RecoveryTimes$PbRecoveryTimes var0, List var1) {
      var0.recoveryTimes_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static float b(RecoveryTimes$PbRecoveryTimes var0, float var1) {
      var0.endCarboConsumption_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(RecoveryTimes$PbRecoveryTimes var0, int var1) {
      var0.numberOfExerciseHalfHours_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(RecoveryTimes$PbRecoveryTimes var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static float c(RecoveryTimes$PbRecoveryTimes var0, float var1) {
      var0.endProteinConsumption_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int c(RecoveryTimes$PbRecoveryTimes var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static float d(RecoveryTimes$PbRecoveryTimes var0, float var1) {
      var0.endCumulativeMechanicalStimulus_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static float e(RecoveryTimes$PbRecoveryTimes var0, float var1) {
      var0.lastHalfHourAvgMet_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static float f(RecoveryTimes$PbRecoveryTimes var0, float var1) {
      var0.exerciseCalories_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static float g(RecoveryTimes$PbRecoveryTimes var0, float var1) {
      var0.activityCalories_ = var1;
      return var1;
   }

   public static RecoveryTimes$PbRecoveryTimes getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return RecoveryTimes.a();
   }

   // $FF: synthetic method
   static float h(RecoveryTimes$PbRecoveryTimes var0, float var1) {
      var0.bmrCalories_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static float i(RecoveryTimes$PbRecoveryTimes var0, float var1) {
      var0.accumulatedActivity_ = var1;
      return var1;
   }

   public static RecoveryTimes$PbRecoveryTimes$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RecoveryTimes$PbRecoveryTimes$Builder newBuilder(RecoveryTimes$PbRecoveryTimes var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static RecoveryTimes$PbRecoveryTimes parseDelimitedFrom(InputStream var0) {
      return (RecoveryTimes$PbRecoveryTimes)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RecoveryTimes$PbRecoveryTimes parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (RecoveryTimes$PbRecoveryTimes)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RecoveryTimes$PbRecoveryTimes parseFrom(ByteString var0) {
      return (RecoveryTimes$PbRecoveryTimes)PARSER.parseFrom(var0);
   }

   public static RecoveryTimes$PbRecoveryTimes parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (RecoveryTimes$PbRecoveryTimes)PARSER.parseFrom(var0, var1);
   }

   public static RecoveryTimes$PbRecoveryTimes parseFrom(CodedInputStream var0) {
      return (RecoveryTimes$PbRecoveryTimes)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RecoveryTimes$PbRecoveryTimes parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (RecoveryTimes$PbRecoveryTimes)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RecoveryTimes$PbRecoveryTimes parseFrom(InputStream var0) {
      return (RecoveryTimes$PbRecoveryTimes)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RecoveryTimes$PbRecoveryTimes parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (RecoveryTimes$PbRecoveryTimes)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RecoveryTimes$PbRecoveryTimes parseFrom(byte[] var0) {
      return (RecoveryTimes$PbRecoveryTimes)PARSER.parseFrom(var0);
   }

   public static RecoveryTimes$PbRecoveryTimes parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (RecoveryTimes$PbRecoveryTimes)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof RecoveryTimes$PbRecoveryTimes)) {
            var2 = super.equals(var1);
         } else {
            RecoveryTimes$PbRecoveryTimes var5 = (RecoveryTimes$PbRecoveryTimes)var1;
            boolean var3;
            if (this.hasStartOfTimes() == var5.hasStartOfTimes()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasStartOfTimes()) {
               if (var3 && this.getStartOfTimes().equals(var5.getStartOfTimes())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.getRecoveryTimesList().equals(var5.getRecoveryTimesList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.hasEndGlycogenLeftPercent() == var5.hasEndGlycogenLeftPercent()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasEndGlycogenLeftPercent()) {
               if (var4 && Float.floatToIntBits(this.getEndGlycogenLeftPercent()) == Float.floatToIntBits(var5.getEndGlycogenLeftPercent())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasEndCarboConsumption() == var5.hasEndCarboConsumption()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasEndCarboConsumption()) {
               if (var3 && Float.floatToIntBits(this.getEndCarboConsumption()) == Float.floatToIntBits(var5.getEndCarboConsumption())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasEndProteinConsumption() == var5.hasEndProteinConsumption()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasEndProteinConsumption()) {
               if (var4 && Float.floatToIntBits(this.getEndProteinConsumption()) == Float.floatToIntBits(var5.getEndProteinConsumption())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasEndCumulativeMechanicalStimulus() == var5.hasEndCumulativeMechanicalStimulus()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasEndCumulativeMechanicalStimulus()) {
               if (var4 && Float.floatToIntBits(this.getEndCumulativeMechanicalStimulus()) == Float.floatToIntBits(var5.getEndCumulativeMechanicalStimulus())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasLastHalfHourAvgMet() == var5.hasLastHalfHourAvgMet()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasLastHalfHourAvgMet()) {
               if (var4 && Float.floatToIntBits(this.getLastHalfHourAvgMet()) == Float.floatToIntBits(var5.getLastHalfHourAvgMet())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasExerciseCalories() == var5.hasExerciseCalories()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasExerciseCalories()) {
               if (var3 && Float.floatToIntBits(this.getExerciseCalories()) == Float.floatToIntBits(var5.getExerciseCalories())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasActivityCalories() == var5.hasActivityCalories()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasActivityCalories()) {
               if (var4 && Float.floatToIntBits(this.getActivityCalories()) == Float.floatToIntBits(var5.getActivityCalories())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasBmrCalories() == var5.hasBmrCalories()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasBmrCalories()) {
               if (var4 && Float.floatToIntBits(this.getBmrCalories()) == Float.floatToIntBits(var5.getBmrCalories())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasSteps() == var5.hasSteps()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSteps()) {
               if (var4 && this.getSteps() == var5.getSteps()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasAccumulatedActivity() == var5.hasAccumulatedActivity()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAccumulatedActivity()) {
               if (var4 && Float.floatToIntBits(this.getAccumulatedActivity()) == Float.floatToIntBits(var5.getAccumulatedActivity())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasNumberOfExerciseHalfHours() == var5.hasNumberOfExerciseHalfHours()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasNumberOfExerciseHalfHours()) {
               if (var4 && this.getNumberOfExerciseHalfHours() == var5.getNumberOfExerciseHalfHours()) {
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

   public float getAccumulatedActivity() {
      return this.accumulatedActivity_;
   }

   public float getActivityCalories() {
      return this.activityCalories_;
   }

   public float getBmrCalories() {
      return this.bmrCalories_;
   }

   public RecoveryTimes$PbRecoveryTimes getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public float getEndCarboConsumption() {
      return this.endCarboConsumption_;
   }

   public float getEndCumulativeMechanicalStimulus() {
      return this.endCumulativeMechanicalStimulus_;
   }

   public float getEndGlycogenLeftPercent() {
      return this.endGlycogenLeftPercent_;
   }

   public float getEndProteinConsumption() {
      return this.endProteinConsumption_;
   }

   public float getExerciseCalories() {
      return this.exerciseCalories_;
   }

   public float getLastHalfHourAvgMet() {
      return this.lastHalfHourAvgMet_;
   }

   public int getNumberOfExerciseHalfHours() {
      return this.numberOfExerciseHalfHours_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public float getRecoveryTimes(int var1) {
      return (Float)this.recoveryTimes_.get(var1);
   }

   public int getRecoveryTimesCount() {
      return this.recoveryTimes_.size();
   }

   public List getRecoveryTimesList() {
      return this.recoveryTimes_;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeMessageSize(1, this.getStartOfTimes());
         }

         int var2 = var1 + this.getRecoveryTimesList().size() * 4 + this.getRecoveryTimesList().size() * 1;
         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeFloatSize(3, this.endGlycogenLeftPercent_);
         }

         int var3 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var3 = var1 + CodedOutputStream.computeFloatSize(4, this.endCarboConsumption_);
         }

         var2 = var3;
         if ((this.bitField0_ & 8) == 8) {
            var2 = var3 + CodedOutputStream.computeFloatSize(5, this.endProteinConsumption_);
         }

         var1 = var2;
         if ((this.bitField0_ & 16) == 16) {
            var1 = var2 + CodedOutputStream.computeFloatSize(6, this.endCumulativeMechanicalStimulus_);
         }

         var2 = var1;
         if ((this.bitField0_ & 32) == 32) {
            var2 = var1 + CodedOutputStream.computeFloatSize(7, this.lastHalfHourAvgMet_);
         }

         var1 = var2;
         if ((this.bitField0_ & 64) == 64) {
            var1 = var2 + CodedOutputStream.computeFloatSize(8, this.exerciseCalories_);
         }

         var2 = var1;
         if ((this.bitField0_ & 128) == 128) {
            var2 = var1 + CodedOutputStream.computeFloatSize(9, this.activityCalories_);
         }

         var3 = var2;
         if ((this.bitField0_ & 256) == 256) {
            var3 = var2 + CodedOutputStream.computeFloatSize(10, this.bmrCalories_);
         }

         var1 = var3;
         if ((this.bitField0_ & 512) == 512) {
            var1 = var3 + CodedOutputStream.computeUInt32Size(11, this.steps_);
         }

         var2 = var1;
         if ((this.bitField0_ & 1024) == 1024) {
            var2 = var1 + CodedOutputStream.computeFloatSize(12, this.accumulatedActivity_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2048) == 2048) {
            var1 = var2 + CodedOutputStream.computeUInt32Size(13, this.numberOfExerciseHalfHours_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public Types$PbLocalDateTime getStartOfTimes() {
      Types$PbLocalDateTime var1;
      if (this.startOfTimes_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.startOfTimes_;
      }

      return var1;
   }

   public Types$PbLocalDateTimeOrBuilder getStartOfTimesOrBuilder() {
      Types$PbLocalDateTime var1;
      if (this.startOfTimes_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.startOfTimes_;
      }

      return var1;
   }

   public int getSteps() {
      return this.steps_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasAccumulatedActivity() {
      boolean var1;
      if ((this.bitField0_ & 1024) == 1024) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasActivityCalories() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasBmrCalories() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasEndCarboConsumption() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasEndCumulativeMechanicalStimulus() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasEndGlycogenLeftPercent() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasEndProteinConsumption() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasExerciseCalories() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLastHalfHourAvgMet() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasNumberOfExerciseHalfHours() {
      boolean var1;
      if ((this.bitField0_ & 2048) == 2048) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStartOfTimes() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSteps() {
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
         var1 = this.getDescriptorForType().hashCode() + 779;
         int var2 = var1;
         if (this.hasStartOfTimes()) {
            var2 = (var1 * 37 + 1) * 53 + this.getStartOfTimes().hashCode();
         }

         var1 = var2;
         if (this.getRecoveryTimesCount() > 0) {
            var1 = (var2 * 37 + 2) * 53 + this.getRecoveryTimesList().hashCode();
         }

         int var3 = var1;
         if (this.hasEndGlycogenLeftPercent()) {
            var3 = (var1 * 37 + 3) * 53 + Float.floatToIntBits(this.getEndGlycogenLeftPercent());
         }

         var2 = var3;
         if (this.hasEndCarboConsumption()) {
            var2 = (var3 * 37 + 4) * 53 + Float.floatToIntBits(this.getEndCarboConsumption());
         }

         var1 = var2;
         if (this.hasEndProteinConsumption()) {
            var1 = (var2 * 37 + 5) * 53 + Float.floatToIntBits(this.getEndProteinConsumption());
         }

         var2 = var1;
         if (this.hasEndCumulativeMechanicalStimulus()) {
            var2 = (var1 * 37 + 6) * 53 + Float.floatToIntBits(this.getEndCumulativeMechanicalStimulus());
         }

         var1 = var2;
         if (this.hasLastHalfHourAvgMet()) {
            var1 = (var2 * 37 + 7) * 53 + Float.floatToIntBits(this.getLastHalfHourAvgMet());
         }

         var2 = var1;
         if (this.hasExerciseCalories()) {
            var2 = (var1 * 37 + 8) * 53 + Float.floatToIntBits(this.getExerciseCalories());
         }

         var1 = var2;
         if (this.hasActivityCalories()) {
            var1 = (var2 * 37 + 9) * 53 + Float.floatToIntBits(this.getActivityCalories());
         }

         var2 = var1;
         if (this.hasBmrCalories()) {
            var2 = (var1 * 37 + 10) * 53 + Float.floatToIntBits(this.getBmrCalories());
         }

         var1 = var2;
         if (this.hasSteps()) {
            var1 = (var2 * 37 + 11) * 53 + this.getSteps();
         }

         var2 = var1;
         if (this.hasAccumulatedActivity()) {
            var2 = (var1 * 37 + 12) * 53 + Float.floatToIntBits(this.getAccumulatedActivity());
         }

         var1 = var2;
         if (this.hasNumberOfExerciseHalfHours()) {
            var1 = (var2 * 37 + 13) * 53 + this.getNumberOfExerciseHalfHours();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return RecoveryTimes.b().ensureFieldAccessorsInitialized(RecoveryTimes$PbRecoveryTimes.class, RecoveryTimes$PbRecoveryTimes$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasStartOfTimes()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getStartOfTimes().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder newBuilderForType() {
      return newBuilder();
   }

   protected RecoveryTimes$PbRecoveryTimes$Builder newBuilderForType(BuilderParent var1) {
      return new RecoveryTimes$PbRecoveryTimes$Builder(var1, (RecoveryTimes$1)null);
   }

   public RecoveryTimes$PbRecoveryTimes$Builder toBuilder() {
      RecoveryTimes$PbRecoveryTimes$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new RecoveryTimes$PbRecoveryTimes$Builder((RecoveryTimes$1)null);
      } else {
         var1 = (new RecoveryTimes$PbRecoveryTimes$Builder((RecoveryTimes$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getStartOfTimes());
      }

      for(int var2 = 0; var2 < this.recoveryTimes_.size(); ++var2) {
         var1.writeFloat(2, (Float)this.recoveryTimes_.get(var2));
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeFloat(3, this.endGlycogenLeftPercent_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeFloat(4, this.endCarboConsumption_);
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeFloat(5, this.endProteinConsumption_);
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeFloat(6, this.endCumulativeMechanicalStimulus_);
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeFloat(7, this.lastHalfHourAvgMet_);
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeFloat(8, this.exerciseCalories_);
      }

      if ((this.bitField0_ & 128) == 128) {
         var1.writeFloat(9, this.activityCalories_);
      }

      if ((this.bitField0_ & 256) == 256) {
         var1.writeFloat(10, this.bmrCalories_);
      }

      if ((this.bitField0_ & 512) == 512) {
         var1.writeUInt32(11, this.steps_);
      }

      if ((this.bitField0_ & 1024) == 1024) {
         var1.writeFloat(12, this.accumulatedActivity_);
      }

      if ((this.bitField0_ & 2048) == 2048) {
         var1.writeUInt32(13, this.numberOfExerciseHalfHours_);
      }

      this.unknownFields.writeTo(var1);
   }
}
