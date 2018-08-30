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

public final class ExercisePhase$PbPhaseGoal$Builder extends Builder implements ExercisePhase$PbPhaseGoalOrBuilder {
   private int bitField0_;
   private float distance_;
   private SingleFieldBuilderV3 durationBuilder_;
   private Types$PbDuration duration_;
   private int goalType_;
   private int heartRate_;

   private ExercisePhase$PbPhaseGoal$Builder() {
      this.goalType_ = 0;
      this.duration_ = null;
      this.maybeForceBuilderInitialization();
   }

   private ExercisePhase$PbPhaseGoal$Builder(BuilderParent var1) {
      super(var1);
      this.goalType_ = 0;
      this.duration_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExercisePhase$PbPhaseGoal$Builder(BuilderParent var1, ExercisePhase$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExercisePhase$PbPhaseGoal$Builder(ExercisePhase$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExercisePhase.a();
   }

   private SingleFieldBuilderV3 getDurationFieldBuilder() {
      if (this.durationBuilder_ == null) {
         this.durationBuilder_ = new SingleFieldBuilderV3(this.getDuration(), this.getParentForChildren(), this.isClean());
         this.duration_ = null;
      }

      return this.durationBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (ExercisePhase$PbPhaseGoal.b()) {
         this.getDurationFieldBuilder();
      }

   }

   public ExercisePhase$PbPhaseGoal$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExercisePhase$PbPhaseGoal$Builder)super.addRepeatedField(var1, var2);
   }

   public ExercisePhase$PbPhaseGoal build() {
      ExercisePhase$PbPhaseGoal var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExercisePhase$PbPhaseGoal buildPartial() {
      byte var1 = 1;
      ExercisePhase$PbPhaseGoal var2 = new ExercisePhase$PbPhaseGoal(this, (ExercisePhase$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ExercisePhase$PbPhaseGoal.a(var2, this.goalType_);
      int var4;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      } else {
         var4 = var1;
      }

      if (this.durationBuilder_ == null) {
         ExercisePhase$PbPhaseGoal.a(var2, this.duration_);
      } else {
         ExercisePhase$PbPhaseGoal.a(var2, (Types$PbDuration)this.durationBuilder_.build());
      }

      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      ExercisePhase$PbPhaseGoal.a(var2, this.distance_);
      var4 = var5;
      if ((var3 & 8) == 8) {
         var4 = var5 | 8;
      }

      ExercisePhase$PbPhaseGoal.b(var2, this.heartRate_);
      ExercisePhase$PbPhaseGoal.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public ExercisePhase$PbPhaseGoal$Builder clear() {
      super.clear();
      this.goalType_ = 0;
      this.bitField0_ &= -2;
      if (this.durationBuilder_ == null) {
         this.duration_ = null;
      } else {
         this.durationBuilder_.clear();
      }

      this.bitField0_ &= -3;
      this.distance_ = 0.0F;
      this.bitField0_ &= -5;
      this.heartRate_ = 0;
      this.bitField0_ &= -9;
      return this;
   }

   public ExercisePhase$PbPhaseGoal$Builder clearDistance() {
      this.bitField0_ &= -5;
      this.distance_ = 0.0F;
      this.onChanged();
      return this;
   }

   public ExercisePhase$PbPhaseGoal$Builder clearDuration() {
      if (this.durationBuilder_ == null) {
         this.duration_ = null;
         this.onChanged();
      } else {
         this.durationBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public ExercisePhase$PbPhaseGoal$Builder clearField(FieldDescriptor var1) {
      return (ExercisePhase$PbPhaseGoal$Builder)super.clearField(var1);
   }

   public ExercisePhase$PbPhaseGoal$Builder clearGoalType() {
      this.bitField0_ &= -2;
      this.goalType_ = 0;
      this.onChanged();
      return this;
   }

   public ExercisePhase$PbPhaseGoal$Builder clearHeartRate() {
      this.bitField0_ &= -9;
      this.heartRate_ = 0;
      this.onChanged();
      return this;
   }

   public ExercisePhase$PbPhaseGoal$Builder clearOneof(OneofDescriptor var1) {
      return (ExercisePhase$PbPhaseGoal$Builder)super.clearOneof(var1);
   }

   public ExercisePhase$PbPhaseGoal$Builder clone() {
      return (ExercisePhase$PbPhaseGoal$Builder)super.clone();
   }

   public ExercisePhase$PbPhaseGoal getDefaultInstanceForType() {
      return ExercisePhase$PbPhaseGoal.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExercisePhase.a();
   }

   public float getDistance() {
      return this.distance_;
   }

   public Types$PbDuration getDuration() {
      Types$PbDuration var1;
      if (this.durationBuilder_ == null) {
         if (this.duration_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.duration_;
         }
      } else {
         var1 = (Types$PbDuration)this.durationBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getDurationBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getDurationFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getDurationOrBuilder() {
      Object var1;
      if (this.durationBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.durationBuilder_.getMessageOrBuilder();
      } else if (this.duration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.duration_;
      }

      return (Types$PbDurationOrBuilder)var1;
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

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExercisePhase.b().ensureFieldAccessorsInitialized(ExercisePhase$PbPhaseGoal.class, ExercisePhase$PbPhaseGoal$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasGoalType()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public ExercisePhase$PbPhaseGoal$Builder mergeDuration(Types$PbDuration var1) {
      if (this.durationBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.duration_ != null && this.duration_ != Types$PbDuration.getDefaultInstance()) {
            this.duration_ = Types$PbDuration.newBuilder(this.duration_).mergeFrom(var1).buildPartial();
         } else {
            this.duration_ = var1;
         }

         this.onChanged();
      } else {
         this.durationBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExercisePhase$PbPhaseGoal$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExercisePhase$PbPhaseGoal var13;
      label96: {
         InvalidProtocolBufferException var12;
         ExercisePhase$PbPhaseGoal var14;
         try {
            var13 = (ExercisePhase$PbPhaseGoal)ExercisePhase$PbPhaseGoal.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (ExercisePhase$PbPhaseGoal)var10.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var12.unwrapIOException();
         } finally {
            if (var14 != null) {
               this.mergeFrom(var14);
            }

            throw var12;
         }
      }

      if (var13 != null) {
         this.mergeFrom(var13);
      }

      return this;
   }

   public ExercisePhase$PbPhaseGoal$Builder mergeFrom(Message var1) {
      ExercisePhase$PbPhaseGoal$Builder var2;
      if (var1 instanceof ExercisePhase$PbPhaseGoal) {
         var2 = this.mergeFrom((ExercisePhase$PbPhaseGoal)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExercisePhase$PbPhaseGoal$Builder mergeFrom(ExercisePhase$PbPhaseGoal var1) {
      if (var1 != ExercisePhase$PbPhaseGoal.getDefaultInstance()) {
         if (var1.hasGoalType()) {
            this.setGoalType(var1.getGoalType());
         }

         if (var1.hasDuration()) {
            this.mergeDuration(var1.getDuration());
         }

         if (var1.hasDistance()) {
            this.setDistance(var1.getDistance());
         }

         if (var1.hasHeartRate()) {
            this.setHeartRate(var1.getHeartRate());
         }

         this.mergeUnknownFields(ExercisePhase$PbPhaseGoal.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExercisePhase$PbPhaseGoal$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExercisePhase$PbPhaseGoal$Builder)super.mergeUnknownFields(var1);
   }

   public ExercisePhase$PbPhaseGoal$Builder setDistance(float var1) {
      this.bitField0_ |= 4;
      this.distance_ = var1;
      this.onChanged();
      return this;
   }

   public ExercisePhase$PbPhaseGoal$Builder setDuration(Types$PbDuration$Builder var1) {
      if (this.durationBuilder_ == null) {
         this.duration_ = var1.build();
         this.onChanged();
      } else {
         this.durationBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExercisePhase$PbPhaseGoal$Builder setDuration(Types$PbDuration var1) {
      if (this.durationBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.duration_ = var1;
         this.onChanged();
      } else {
         this.durationBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExercisePhase$PbPhaseGoal$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExercisePhase$PbPhaseGoal$Builder)super.setField(var1, var2);
   }

   public ExercisePhase$PbPhaseGoal$Builder setGoalType(ExercisePhase$PbPhaseGoal$PhaseGoalType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.goalType_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public ExercisePhase$PbPhaseGoal$Builder setHeartRate(int var1) {
      this.bitField0_ |= 8;
      this.heartRate_ = var1;
      this.onChanged();
      return this;
   }

   public ExercisePhase$PbPhaseGoal$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExercisePhase$PbPhaseGoal$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExercisePhase$PbPhaseGoal$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExercisePhase$PbPhaseGoal$Builder)super.setUnknownFields(var1);
   }
}
