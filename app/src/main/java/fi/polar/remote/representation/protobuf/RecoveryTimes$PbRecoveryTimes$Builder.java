package fi.polar.remote.representation.protobuf;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class RecoveryTimes$PbRecoveryTimes$Builder extends Builder implements RecoveryTimes$PbRecoveryTimesOrBuilder {
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
   private int numberOfExerciseHalfHours_;
   private List recoveryTimes_;
   private SingleFieldBuilderV3 startOfTimesBuilder_;
   private Types$PbLocalDateTime startOfTimes_;
   private int steps_;

   private RecoveryTimes$PbRecoveryTimes$Builder() {
      this.startOfTimes_ = null;
      this.recoveryTimes_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   private RecoveryTimes$PbRecoveryTimes$Builder(BuilderParent var1) {
      super(var1);
      this.startOfTimes_ = null;
      this.recoveryTimes_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   RecoveryTimes$PbRecoveryTimes$Builder(BuilderParent var1, RecoveryTimes$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   RecoveryTimes$PbRecoveryTimes$Builder(RecoveryTimes$1 var1) {
      this();
   }

   private void ensureRecoveryTimesIsMutable() {
      if ((this.bitField0_ & 2) != 2) {
         this.recoveryTimes_ = new ArrayList(this.recoveryTimes_);
         this.bitField0_ |= 2;
      }

   }

   public static final Descriptor getDescriptor() {
      return RecoveryTimes.a();
   }

   private SingleFieldBuilderV3 getStartOfTimesFieldBuilder() {
      if (this.startOfTimesBuilder_ == null) {
         this.startOfTimesBuilder_ = new SingleFieldBuilderV3(this.getStartOfTimes(), this.getParentForChildren(), this.isClean());
         this.startOfTimes_ = null;
      }

      return this.startOfTimesBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (RecoveryTimes$PbRecoveryTimes.b()) {
         this.getStartOfTimesFieldBuilder();
      }

   }

   public RecoveryTimes$PbRecoveryTimes$Builder addAllRecoveryTimes(Iterable var1) {
      this.ensureRecoveryTimesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.recoveryTimes_);
      this.onChanged();
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder addRecoveryTimes(float var1) {
      this.ensureRecoveryTimesIsMutable();
      this.recoveryTimes_.add(var1);
      this.onChanged();
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (RecoveryTimes$PbRecoveryTimes$Builder)super.addRepeatedField(var1, var2);
   }

   public RecoveryTimes$PbRecoveryTimes build() {
      RecoveryTimes$PbRecoveryTimes var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public RecoveryTimes$PbRecoveryTimes buildPartial() {
      RecoveryTimes$PbRecoveryTimes var1 = new RecoveryTimes$PbRecoveryTimes(this, (RecoveryTimes$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.startOfTimesBuilder_ == null) {
         RecoveryTimes$PbRecoveryTimes.a(var1, this.startOfTimes_);
      } else {
         RecoveryTimes$PbRecoveryTimes.a(var1, (Types$PbLocalDateTime)this.startOfTimesBuilder_.build());
      }

      if ((this.bitField0_ & 2) == 2) {
         this.recoveryTimes_ = Collections.unmodifiableList(this.recoveryTimes_);
         this.bitField0_ &= -3;
      }

      RecoveryTimes$PbRecoveryTimes.a(var1, this.recoveryTimes_);
      int var4 = var3;
      if ((var2 & 4) == 4) {
         var4 = var3 | 2;
      }

      RecoveryTimes$PbRecoveryTimes.a(var1, this.endGlycogenLeftPercent_);
      int var6 = var4;
      if ((var2 & 8) == 8) {
         var6 = var4 | 4;
      }

      RecoveryTimes$PbRecoveryTimes.b(var1, this.endCarboConsumption_);
      var4 = var6;
      if ((var2 & 16) == 16) {
         var4 = var6 | 8;
      }

      RecoveryTimes$PbRecoveryTimes.c(var1, this.endProteinConsumption_);
      var6 = var4;
      if ((var2 & 32) == 32) {
         var6 = var4 | 16;
      }

      RecoveryTimes$PbRecoveryTimes.d(var1, this.endCumulativeMechanicalStimulus_);
      var4 = var6;
      if ((var2 & 64) == 64) {
         var4 = var6 | 32;
      }

      RecoveryTimes$PbRecoveryTimes.e(var1, this.lastHalfHourAvgMet_);
      var6 = var4;
      if ((var2 & 128) == 128) {
         var6 = var4 | 64;
      }

      RecoveryTimes$PbRecoveryTimes.f(var1, this.exerciseCalories_);
      var4 = var6;
      if ((var2 & 256) == 256) {
         var4 = var6 | 128;
      }

      RecoveryTimes$PbRecoveryTimes.g(var1, this.activityCalories_);
      int var5 = var4;
      if ((var2 & 512) == 512) {
         var5 = var4 | 256;
      }

      RecoveryTimes$PbRecoveryTimes.h(var1, this.bmrCalories_);
      var6 = var5;
      if ((var2 & 1024) == 1024) {
         var6 = var5 | 512;
      }

      RecoveryTimes$PbRecoveryTimes.a(var1, this.steps_);
      var4 = var6;
      if ((var2 & 2048) == 2048) {
         var4 = var6 | 1024;
      }

      RecoveryTimes$PbRecoveryTimes.i(var1, this.accumulatedActivity_);
      var6 = var4;
      if ((var2 & 4096) == 4096) {
         var6 = var4 | 2048;
      }

      RecoveryTimes$PbRecoveryTimes.b(var1, this.numberOfExerciseHalfHours_);
      RecoveryTimes$PbRecoveryTimes.c(var1, var6);
      this.onBuilt();
      return var1;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder clear() {
      super.clear();
      if (this.startOfTimesBuilder_ == null) {
         this.startOfTimes_ = null;
      } else {
         this.startOfTimesBuilder_.clear();
      }

      this.bitField0_ &= -2;
      this.recoveryTimes_ = Collections.emptyList();
      this.bitField0_ &= -3;
      this.endGlycogenLeftPercent_ = 0.0F;
      this.bitField0_ &= -5;
      this.endCarboConsumption_ = 0.0F;
      this.bitField0_ &= -9;
      this.endProteinConsumption_ = 0.0F;
      this.bitField0_ &= -17;
      this.endCumulativeMechanicalStimulus_ = 0.0F;
      this.bitField0_ &= -33;
      this.lastHalfHourAvgMet_ = 0.0F;
      this.bitField0_ &= -65;
      this.exerciseCalories_ = 0.0F;
      this.bitField0_ &= -129;
      this.activityCalories_ = 0.0F;
      this.bitField0_ &= -257;
      this.bmrCalories_ = 0.0F;
      this.bitField0_ &= -513;
      this.steps_ = 0;
      this.bitField0_ &= -1025;
      this.accumulatedActivity_ = 0.0F;
      this.bitField0_ &= -2049;
      this.numberOfExerciseHalfHours_ = 0;
      this.bitField0_ &= -4097;
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder clearAccumulatedActivity() {
      this.bitField0_ &= -2049;
      this.accumulatedActivity_ = 0.0F;
      this.onChanged();
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder clearActivityCalories() {
      this.bitField0_ &= -257;
      this.activityCalories_ = 0.0F;
      this.onChanged();
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder clearBmrCalories() {
      this.bitField0_ &= -513;
      this.bmrCalories_ = 0.0F;
      this.onChanged();
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder clearEndCarboConsumption() {
      this.bitField0_ &= -9;
      this.endCarboConsumption_ = 0.0F;
      this.onChanged();
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder clearEndCumulativeMechanicalStimulus() {
      this.bitField0_ &= -33;
      this.endCumulativeMechanicalStimulus_ = 0.0F;
      this.onChanged();
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder clearEndGlycogenLeftPercent() {
      this.bitField0_ &= -5;
      this.endGlycogenLeftPercent_ = 0.0F;
      this.onChanged();
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder clearEndProteinConsumption() {
      this.bitField0_ &= -17;
      this.endProteinConsumption_ = 0.0F;
      this.onChanged();
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder clearExerciseCalories() {
      this.bitField0_ &= -129;
      this.exerciseCalories_ = 0.0F;
      this.onChanged();
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder clearField(FieldDescriptor var1) {
      return (RecoveryTimes$PbRecoveryTimes$Builder)super.clearField(var1);
   }

   public RecoveryTimes$PbRecoveryTimes$Builder clearLastHalfHourAvgMet() {
      this.bitField0_ &= -65;
      this.lastHalfHourAvgMet_ = 0.0F;
      this.onChanged();
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder clearNumberOfExerciseHalfHours() {
      this.bitField0_ &= -4097;
      this.numberOfExerciseHalfHours_ = 0;
      this.onChanged();
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder clearOneof(OneofDescriptor var1) {
      return (RecoveryTimes$PbRecoveryTimes$Builder)super.clearOneof(var1);
   }

   public RecoveryTimes$PbRecoveryTimes$Builder clearRecoveryTimes() {
      this.recoveryTimes_ = Collections.emptyList();
      this.bitField0_ &= -3;
      this.onChanged();
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder clearStartOfTimes() {
      if (this.startOfTimesBuilder_ == null) {
         this.startOfTimes_ = null;
         this.onChanged();
      } else {
         this.startOfTimesBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder clearSteps() {
      this.bitField0_ &= -1025;
      this.steps_ = 0;
      this.onChanged();
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder clone() {
      return (RecoveryTimes$PbRecoveryTimes$Builder)super.clone();
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
      return RecoveryTimes$PbRecoveryTimes.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return RecoveryTimes.a();
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

   public float getRecoveryTimes(int var1) {
      return (Float)this.recoveryTimes_.get(var1);
   }

   public int getRecoveryTimesCount() {
      return this.recoveryTimes_.size();
   }

   public List getRecoveryTimesList() {
      return Collections.unmodifiableList(this.recoveryTimes_);
   }

   public Types$PbLocalDateTime getStartOfTimes() {
      Types$PbLocalDateTime var1;
      if (this.startOfTimesBuilder_ == null) {
         if (this.startOfTimes_ == null) {
            var1 = Types$PbLocalDateTime.getDefaultInstance();
         } else {
            var1 = this.startOfTimes_;
         }
      } else {
         var1 = (Types$PbLocalDateTime)this.startOfTimesBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbLocalDateTime$Builder getStartOfTimesBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Types$PbLocalDateTime$Builder)this.getStartOfTimesFieldBuilder().getBuilder();
   }

   public Types$PbLocalDateTimeOrBuilder getStartOfTimesOrBuilder() {
      Object var1;
      if (this.startOfTimesBuilder_ != null) {
         var1 = (Types$PbLocalDateTimeOrBuilder)this.startOfTimesBuilder_.getMessageOrBuilder();
      } else if (this.startOfTimes_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.startOfTimes_;
      }

      return (Types$PbLocalDateTimeOrBuilder)var1;
   }

   public int getSteps() {
      return this.steps_;
   }

   public boolean hasAccumulatedActivity() {
      boolean var1;
      if ((this.bitField0_ & 2048) == 2048) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasActivityCalories() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasBmrCalories() {
      boolean var1;
      if ((this.bitField0_ & 512) == 512) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasEndCarboConsumption() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasEndCumulativeMechanicalStimulus() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasEndGlycogenLeftPercent() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasEndProteinConsumption() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasExerciseCalories() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLastHalfHourAvgMet() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasNumberOfExerciseHalfHours() {
      boolean var1;
      if ((this.bitField0_ & 4096) == 4096) {
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
      if ((this.bitField0_ & 1024) == 1024) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return RecoveryTimes.b().ensureFieldAccessorsInitialized(RecoveryTimes$PbRecoveryTimes.class, RecoveryTimes$PbRecoveryTimes$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasStartOfTimes() && this.getStartOfTimes().isInitialized()) {
         var1 = true;
      }

      return var1;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      RecoveryTimes$PbRecoveryTimes var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (RecoveryTimes$PbRecoveryTimes)RecoveryTimes$PbRecoveryTimes.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (RecoveryTimes$PbRecoveryTimes)var10.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var13.unwrapIOException();
         } finally {
            if (var12 != null) {
               this.mergeFrom(var12);
            }

            throw var13;
         }
      }

      if (var12 != null) {
         this.mergeFrom(var12);
      }

      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder mergeFrom(Message var1) {
      RecoveryTimes$PbRecoveryTimes$Builder var2;
      if (var1 instanceof RecoveryTimes$PbRecoveryTimes) {
         var2 = this.mergeFrom((RecoveryTimes$PbRecoveryTimes)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder mergeFrom(RecoveryTimes$PbRecoveryTimes var1) {
      if (var1 != RecoveryTimes$PbRecoveryTimes.getDefaultInstance()) {
         if (var1.hasStartOfTimes()) {
            this.mergeStartOfTimes(var1.getStartOfTimes());
         }

         if (!RecoveryTimes$PbRecoveryTimes.a(var1).isEmpty()) {
            if (this.recoveryTimes_.isEmpty()) {
               this.recoveryTimes_ = RecoveryTimes$PbRecoveryTimes.a(var1);
               this.bitField0_ &= -3;
            } else {
               this.ensureRecoveryTimesIsMutable();
               this.recoveryTimes_.addAll(RecoveryTimes$PbRecoveryTimes.a(var1));
            }

            this.onChanged();
         }

         if (var1.hasEndGlycogenLeftPercent()) {
            this.setEndGlycogenLeftPercent(var1.getEndGlycogenLeftPercent());
         }

         if (var1.hasEndCarboConsumption()) {
            this.setEndCarboConsumption(var1.getEndCarboConsumption());
         }

         if (var1.hasEndProteinConsumption()) {
            this.setEndProteinConsumption(var1.getEndProteinConsumption());
         }

         if (var1.hasEndCumulativeMechanicalStimulus()) {
            this.setEndCumulativeMechanicalStimulus(var1.getEndCumulativeMechanicalStimulus());
         }

         if (var1.hasLastHalfHourAvgMet()) {
            this.setLastHalfHourAvgMet(var1.getLastHalfHourAvgMet());
         }

         if (var1.hasExerciseCalories()) {
            this.setExerciseCalories(var1.getExerciseCalories());
         }

         if (var1.hasActivityCalories()) {
            this.setActivityCalories(var1.getActivityCalories());
         }

         if (var1.hasBmrCalories()) {
            this.setBmrCalories(var1.getBmrCalories());
         }

         if (var1.hasSteps()) {
            this.setSteps(var1.getSteps());
         }

         if (var1.hasAccumulatedActivity()) {
            this.setAccumulatedActivity(var1.getAccumulatedActivity());
         }

         if (var1.hasNumberOfExerciseHalfHours()) {
            this.setNumberOfExerciseHalfHours(var1.getNumberOfExerciseHalfHours());
         }

         this.mergeUnknownFields(RecoveryTimes$PbRecoveryTimes.b(var1));
         this.onChanged();
      }

      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder mergeStartOfTimes(Types$PbLocalDateTime var1) {
      if (this.startOfTimesBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.startOfTimes_ != null && this.startOfTimes_ != Types$PbLocalDateTime.getDefaultInstance()) {
            this.startOfTimes_ = Types$PbLocalDateTime.newBuilder(this.startOfTimes_).mergeFrom(var1).buildPartial();
         } else {
            this.startOfTimes_ = var1;
         }

         this.onChanged();
      } else {
         this.startOfTimesBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public final RecoveryTimes$PbRecoveryTimes$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (RecoveryTimes$PbRecoveryTimes$Builder)super.mergeUnknownFields(var1);
   }

   public RecoveryTimes$PbRecoveryTimes$Builder setAccumulatedActivity(float var1) {
      this.bitField0_ |= 2048;
      this.accumulatedActivity_ = var1;
      this.onChanged();
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder setActivityCalories(float var1) {
      this.bitField0_ |= 256;
      this.activityCalories_ = var1;
      this.onChanged();
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder setBmrCalories(float var1) {
      this.bitField0_ |= 512;
      this.bmrCalories_ = var1;
      this.onChanged();
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder setEndCarboConsumption(float var1) {
      this.bitField0_ |= 8;
      this.endCarboConsumption_ = var1;
      this.onChanged();
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder setEndCumulativeMechanicalStimulus(float var1) {
      this.bitField0_ |= 32;
      this.endCumulativeMechanicalStimulus_ = var1;
      this.onChanged();
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder setEndGlycogenLeftPercent(float var1) {
      this.bitField0_ |= 4;
      this.endGlycogenLeftPercent_ = var1;
      this.onChanged();
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder setEndProteinConsumption(float var1) {
      this.bitField0_ |= 16;
      this.endProteinConsumption_ = var1;
      this.onChanged();
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder setExerciseCalories(float var1) {
      this.bitField0_ |= 128;
      this.exerciseCalories_ = var1;
      this.onChanged();
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder setField(FieldDescriptor var1, Object var2) {
      return (RecoveryTimes$PbRecoveryTimes$Builder)super.setField(var1, var2);
   }

   public RecoveryTimes$PbRecoveryTimes$Builder setLastHalfHourAvgMet(float var1) {
      this.bitField0_ |= 64;
      this.lastHalfHourAvgMet_ = var1;
      this.onChanged();
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder setNumberOfExerciseHalfHours(int var1) {
      this.bitField0_ |= 4096;
      this.numberOfExerciseHalfHours_ = var1;
      this.onChanged();
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder setRecoveryTimes(int var1, float var2) {
      this.ensureRecoveryTimesIsMutable();
      this.recoveryTimes_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (RecoveryTimes$PbRecoveryTimes$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public RecoveryTimes$PbRecoveryTimes$Builder setStartOfTimes(Types$PbLocalDateTime$Builder var1) {
      if (this.startOfTimesBuilder_ == null) {
         this.startOfTimes_ = var1.build();
         this.onChanged();
      } else {
         this.startOfTimesBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder setStartOfTimes(Types$PbLocalDateTime var1) {
      if (this.startOfTimesBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.startOfTimes_ = var1;
         this.onChanged();
      } else {
         this.startOfTimesBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public RecoveryTimes$PbRecoveryTimes$Builder setSteps(int var1) {
      this.bitField0_ |= 1024;
      this.steps_ = var1;
      this.onChanged();
      return this;
   }

   public final RecoveryTimes$PbRecoveryTimes$Builder setUnknownFields(UnknownFieldSet var1) {
      return (RecoveryTimes$PbRecoveryTimes$Builder)super.setUnknownFields(var1);
   }
}
