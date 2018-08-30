package fi.polar.remote.representation.protobuf;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.RepeatedFieldBuilderV3;
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

public final class TrainingSessionTarget$PbTrainingSessionTarget$Builder extends Builder implements TrainingSessionTarget$PbTrainingSessionTargetOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 descriptionBuilder_;
   private Structures$PbMultiLineText description_;
   private SingleFieldBuilderV3 durationBuilder_;
   private Types$PbDuration duration_;
   private SingleFieldBuilderV3 eventIdBuilder_;
   private Structures$PbEventId eventId_;
   private RepeatedFieldBuilderV3 exerciseTargetBuilder_;
   private List exerciseTarget_;
   private SingleFieldBuilderV3 nameBuilder_;
   private Structures$PbOneLineText name_;
   private SingleFieldBuilderV3 sportIdBuilder_;
   private Structures$PbSportIdentifier sportId_;
   private SingleFieldBuilderV3 startTimeBuilder_;
   private Types$PbLocalDateTime startTime_;
   private boolean targetDone_;
   private SingleFieldBuilderV3 trainingProgramIdBuilder_;
   private Structures$PbTrainingProgramId trainingProgramId_;

   private TrainingSessionTarget$PbTrainingSessionTarget$Builder() {
      this.name_ = null;
      this.sportId_ = null;
      this.startTime_ = null;
      this.description_ = null;
      this.exerciseTarget_ = Collections.emptyList();
      this.duration_ = null;
      this.trainingProgramId_ = null;
      this.eventId_ = null;
      this.maybeForceBuilderInitialization();
   }

   private TrainingSessionTarget$PbTrainingSessionTarget$Builder(BuilderParent var1) {
      super(var1);
      this.name_ = null;
      this.sportId_ = null;
      this.startTime_ = null;
      this.description_ = null;
      this.exerciseTarget_ = Collections.emptyList();
      this.duration_ = null;
      this.trainingProgramId_ = null;
      this.eventId_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   TrainingSessionTarget$PbTrainingSessionTarget$Builder(BuilderParent var1, TrainingSessionTarget$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   TrainingSessionTarget$PbTrainingSessionTarget$Builder(TrainingSessionTarget$1 var1) {
      this();
   }

   private void ensureExerciseTargetIsMutable() {
      if ((this.bitField0_ & 16) != 16) {
         this.exerciseTarget_ = new ArrayList(this.exerciseTarget_);
         this.bitField0_ |= 16;
      }

   }

   private SingleFieldBuilderV3 getDescriptionFieldBuilder() {
      if (this.descriptionBuilder_ == null) {
         this.descriptionBuilder_ = new SingleFieldBuilderV3(this.getDescription(), this.getParentForChildren(), this.isClean());
         this.description_ = null;
      }

      return this.descriptionBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return TrainingSessionTarget.e();
   }

   private SingleFieldBuilderV3 getDurationFieldBuilder() {
      if (this.durationBuilder_ == null) {
         this.durationBuilder_ = new SingleFieldBuilderV3(this.getDuration(), this.getParentForChildren(), this.isClean());
         this.duration_ = null;
      }

      return this.durationBuilder_;
   }

   private SingleFieldBuilderV3 getEventIdFieldBuilder() {
      if (this.eventIdBuilder_ == null) {
         this.eventIdBuilder_ = new SingleFieldBuilderV3(this.getEventId(), this.getParentForChildren(), this.isClean());
         this.eventId_ = null;
      }

      return this.eventIdBuilder_;
   }

   private RepeatedFieldBuilderV3 getExerciseTargetFieldBuilder() {
      if (this.exerciseTargetBuilder_ == null) {
         List var1 = this.exerciseTarget_;
         boolean var2;
         if ((this.bitField0_ & 16) == 16) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.exerciseTargetBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.exerciseTarget_ = null;
      }

      return this.exerciseTargetBuilder_;
   }

   private SingleFieldBuilderV3 getNameFieldBuilder() {
      if (this.nameBuilder_ == null) {
         this.nameBuilder_ = new SingleFieldBuilderV3(this.getName(), this.getParentForChildren(), this.isClean());
         this.name_ = null;
      }

      return this.nameBuilder_;
   }

   private SingleFieldBuilderV3 getSportIdFieldBuilder() {
      if (this.sportIdBuilder_ == null) {
         this.sportIdBuilder_ = new SingleFieldBuilderV3(this.getSportId(), this.getParentForChildren(), this.isClean());
         this.sportId_ = null;
      }

      return this.sportIdBuilder_;
   }

   private SingleFieldBuilderV3 getStartTimeFieldBuilder() {
      if (this.startTimeBuilder_ == null) {
         this.startTimeBuilder_ = new SingleFieldBuilderV3(this.getStartTime(), this.getParentForChildren(), this.isClean());
         this.startTime_ = null;
      }

      return this.startTimeBuilder_;
   }

   private SingleFieldBuilderV3 getTrainingProgramIdFieldBuilder() {
      if (this.trainingProgramIdBuilder_ == null) {
         this.trainingProgramIdBuilder_ = new SingleFieldBuilderV3(this.getTrainingProgramId(), this.getParentForChildren(), this.isClean());
         this.trainingProgramId_ = null;
      }

      return this.trainingProgramIdBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (TrainingSessionTarget$PbTrainingSessionTarget.b()) {
         this.getNameFieldBuilder();
         this.getSportIdFieldBuilder();
         this.getStartTimeFieldBuilder();
         this.getDescriptionFieldBuilder();
         this.getExerciseTargetFieldBuilder();
         this.getDurationFieldBuilder();
         this.getTrainingProgramIdFieldBuilder();
         this.getEventIdFieldBuilder();
      }

   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder addAllExerciseTarget(Iterable var1) {
      if (this.exerciseTargetBuilder_ == null) {
         this.ensureExerciseTargetIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.exerciseTarget_);
         this.onChanged();
      } else {
         this.exerciseTargetBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder addExerciseTarget(int var1, TrainingSessionTarget$PbExerciseTarget$Builder var2) {
      if (this.exerciseTargetBuilder_ == null) {
         this.ensureExerciseTargetIsMutable();
         this.exerciseTarget_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.exerciseTargetBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder addExerciseTarget(int var1, TrainingSessionTarget$PbExerciseTarget var2) {
      if (this.exerciseTargetBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureExerciseTargetIsMutable();
         this.exerciseTarget_.add(var1, var2);
         this.onChanged();
      } else {
         this.exerciseTargetBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder addExerciseTarget(TrainingSessionTarget$PbExerciseTarget$Builder var1) {
      if (this.exerciseTargetBuilder_ == null) {
         this.ensureExerciseTargetIsMutable();
         this.exerciseTarget_.add(var1.build());
         this.onChanged();
      } else {
         this.exerciseTargetBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder addExerciseTarget(TrainingSessionTarget$PbExerciseTarget var1) {
      if (this.exerciseTargetBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureExerciseTargetIsMutable();
         this.exerciseTarget_.add(var1);
         this.onChanged();
      } else {
         this.exerciseTargetBuilder_.addMessage(var1);
      }

      return this;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder addExerciseTargetBuilder() {
      return (TrainingSessionTarget$PbExerciseTarget$Builder)this.getExerciseTargetFieldBuilder().addBuilder(TrainingSessionTarget$PbExerciseTarget.getDefaultInstance());
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder addExerciseTargetBuilder(int var1) {
      return (TrainingSessionTarget$PbExerciseTarget$Builder)this.getExerciseTargetFieldBuilder().addBuilder(var1, TrainingSessionTarget$PbExerciseTarget.getDefaultInstance());
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (TrainingSessionTarget$PbTrainingSessionTarget$Builder)super.addRepeatedField(var1, var2);
   }

   public TrainingSessionTarget$PbTrainingSessionTarget build() {
      TrainingSessionTarget$PbTrainingSessionTarget var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public TrainingSessionTarget$PbTrainingSessionTarget buildPartial() {
      TrainingSessionTarget$PbTrainingSessionTarget var1 = new TrainingSessionTarget$PbTrainingSessionTarget(this, (TrainingSessionTarget$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.nameBuilder_ == null) {
         TrainingSessionTarget$PbTrainingSessionTarget.a(var1, this.name_);
      } else {
         TrainingSessionTarget$PbTrainingSessionTarget.a(var1, (Structures$PbOneLineText)this.nameBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.sportIdBuilder_ == null) {
         TrainingSessionTarget$PbTrainingSessionTarget.a(var1, this.sportId_);
      } else {
         TrainingSessionTarget$PbTrainingSessionTarget.a(var1, (Structures$PbSportIdentifier)this.sportIdBuilder_.build());
      }

      int var5 = var4;
      if ((var2 & 4) == 4) {
         var5 = var4 | 4;
      }

      if (this.startTimeBuilder_ == null) {
         TrainingSessionTarget$PbTrainingSessionTarget.a(var1, this.startTime_);
      } else {
         TrainingSessionTarget$PbTrainingSessionTarget.a(var1, (Types$PbLocalDateTime)this.startTimeBuilder_.build());
      }

      var4 = var5;
      if ((var2 & 8) == 8) {
         var4 = var5 | 8;
      }

      if (this.descriptionBuilder_ == null) {
         TrainingSessionTarget$PbTrainingSessionTarget.a(var1, this.description_);
      } else {
         TrainingSessionTarget$PbTrainingSessionTarget.a(var1, (Structures$PbMultiLineText)this.descriptionBuilder_.build());
      }

      if (this.exerciseTargetBuilder_ == null) {
         if ((this.bitField0_ & 16) == 16) {
            this.exerciseTarget_ = Collections.unmodifiableList(this.exerciseTarget_);
            this.bitField0_ &= -17;
         }

         TrainingSessionTarget$PbTrainingSessionTarget.a(var1, this.exerciseTarget_);
      } else {
         TrainingSessionTarget$PbTrainingSessionTarget.a(var1, this.exerciseTargetBuilder_.build());
      }

      var5 = var4;
      if ((var2 & 32) == 32) {
         var5 = var4 | 16;
      }

      TrainingSessionTarget$PbTrainingSessionTarget.a(var1, this.targetDone_);
      var4 = var5;
      if ((var2 & 64) == 64) {
         var4 = var5 | 32;
      }

      if (this.durationBuilder_ == null) {
         TrainingSessionTarget$PbTrainingSessionTarget.a(var1, this.duration_);
      } else {
         TrainingSessionTarget$PbTrainingSessionTarget.a(var1, (Types$PbDuration)this.durationBuilder_.build());
      }

      var5 = var4;
      if ((var2 & 128) == 128) {
         var5 = var4 | 64;
      }

      if (this.trainingProgramIdBuilder_ == null) {
         TrainingSessionTarget$PbTrainingSessionTarget.a(var1, this.trainingProgramId_);
      } else {
         TrainingSessionTarget$PbTrainingSessionTarget.a(var1, (Structures$PbTrainingProgramId)this.trainingProgramIdBuilder_.build());
      }

      var4 = var5;
      if ((var2 & 256) == 256) {
         var4 = var5 | 128;
      }

      if (this.eventIdBuilder_ == null) {
         TrainingSessionTarget$PbTrainingSessionTarget.a(var1, this.eventId_);
      } else {
         TrainingSessionTarget$PbTrainingSessionTarget.a(var1, (Structures$PbEventId)this.eventIdBuilder_.build());
      }

      TrainingSessionTarget$PbTrainingSessionTarget.a(var1, var4);
      this.onBuilt();
      return var1;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder clear() {
      super.clear();
      if (this.nameBuilder_ == null) {
         this.name_ = null;
      } else {
         this.nameBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.sportIdBuilder_ == null) {
         this.sportId_ = null;
      } else {
         this.sportIdBuilder_.clear();
      }

      this.bitField0_ &= -3;
      if (this.startTimeBuilder_ == null) {
         this.startTime_ = null;
      } else {
         this.startTimeBuilder_.clear();
      }

      this.bitField0_ &= -5;
      if (this.descriptionBuilder_ == null) {
         this.description_ = null;
      } else {
         this.descriptionBuilder_.clear();
      }

      this.bitField0_ &= -9;
      if (this.exerciseTargetBuilder_ == null) {
         this.exerciseTarget_ = Collections.emptyList();
         this.bitField0_ &= -17;
      } else {
         this.exerciseTargetBuilder_.clear();
      }

      this.targetDone_ = false;
      this.bitField0_ &= -33;
      if (this.durationBuilder_ == null) {
         this.duration_ = null;
      } else {
         this.durationBuilder_.clear();
      }

      this.bitField0_ &= -65;
      if (this.trainingProgramIdBuilder_ == null) {
         this.trainingProgramId_ = null;
      } else {
         this.trainingProgramIdBuilder_.clear();
      }

      this.bitField0_ &= -129;
      if (this.eventIdBuilder_ == null) {
         this.eventId_ = null;
      } else {
         this.eventIdBuilder_.clear();
      }

      this.bitField0_ &= -257;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder clearDescription() {
      if (this.descriptionBuilder_ == null) {
         this.description_ = null;
         this.onChanged();
      } else {
         this.descriptionBuilder_.clear();
      }

      this.bitField0_ &= -9;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder clearDuration() {
      if (this.durationBuilder_ == null) {
         this.duration_ = null;
         this.onChanged();
      } else {
         this.durationBuilder_.clear();
      }

      this.bitField0_ &= -65;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder clearEventId() {
      if (this.eventIdBuilder_ == null) {
         this.eventId_ = null;
         this.onChanged();
      } else {
         this.eventIdBuilder_.clear();
      }

      this.bitField0_ &= -257;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder clearExerciseTarget() {
      if (this.exerciseTargetBuilder_ == null) {
         this.exerciseTarget_ = Collections.emptyList();
         this.bitField0_ &= -17;
         this.onChanged();
      } else {
         this.exerciseTargetBuilder_.clear();
      }

      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder clearField(FieldDescriptor var1) {
      return (TrainingSessionTarget$PbTrainingSessionTarget$Builder)super.clearField(var1);
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder clearName() {
      if (this.nameBuilder_ == null) {
         this.name_ = null;
         this.onChanged();
      } else {
         this.nameBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder clearOneof(OneofDescriptor var1) {
      return (TrainingSessionTarget$PbTrainingSessionTarget$Builder)super.clearOneof(var1);
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder clearSportId() {
      if (this.sportIdBuilder_ == null) {
         this.sportId_ = null;
         this.onChanged();
      } else {
         this.sportIdBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder clearStartTime() {
      if (this.startTimeBuilder_ == null) {
         this.startTime_ = null;
         this.onChanged();
      } else {
         this.startTimeBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder clearTargetDone() {
      this.bitField0_ &= -33;
      this.targetDone_ = false;
      this.onChanged();
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder clearTrainingProgramId() {
      if (this.trainingProgramIdBuilder_ == null) {
         this.trainingProgramId_ = null;
         this.onChanged();
      } else {
         this.trainingProgramIdBuilder_.clear();
      }

      this.bitField0_ &= -129;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder clone() {
      return (TrainingSessionTarget$PbTrainingSessionTarget$Builder)super.clone();
   }

   public TrainingSessionTarget$PbTrainingSessionTarget getDefaultInstanceForType() {
      return TrainingSessionTarget$PbTrainingSessionTarget.getDefaultInstance();
   }

   public Structures$PbMultiLineText getDescription() {
      Structures$PbMultiLineText var1;
      if (this.descriptionBuilder_ == null) {
         if (this.description_ == null) {
            var1 = Structures$PbMultiLineText.getDefaultInstance();
         } else {
            var1 = this.description_;
         }
      } else {
         var1 = (Structures$PbMultiLineText)this.descriptionBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbMultiLineText$Builder getDescriptionBuilder() {
      this.bitField0_ |= 8;
      this.onChanged();
      return (Structures$PbMultiLineText$Builder)this.getDescriptionFieldBuilder().getBuilder();
   }

   public Structures$PbMultiLineTextOrBuilder getDescriptionOrBuilder() {
      Object var1;
      if (this.descriptionBuilder_ != null) {
         var1 = (Structures$PbMultiLineTextOrBuilder)this.descriptionBuilder_.getMessageOrBuilder();
      } else if (this.description_ == null) {
         var1 = Structures$PbMultiLineText.getDefaultInstance();
      } else {
         var1 = this.description_;
      }

      return (Structures$PbMultiLineTextOrBuilder)var1;
   }

   public Descriptor getDescriptorForType() {
      return TrainingSessionTarget.e();
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
      this.bitField0_ |= 64;
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

   public Structures$PbEventId getEventId() {
      Structures$PbEventId var1;
      if (this.eventIdBuilder_ == null) {
         if (this.eventId_ == null) {
            var1 = Structures$PbEventId.getDefaultInstance();
         } else {
            var1 = this.eventId_;
         }
      } else {
         var1 = (Structures$PbEventId)this.eventIdBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbEventId$Builder getEventIdBuilder() {
      this.bitField0_ |= 256;
      this.onChanged();
      return (Structures$PbEventId$Builder)this.getEventIdFieldBuilder().getBuilder();
   }

   public Structures$PbEventIdOrBuilder getEventIdOrBuilder() {
      Object var1;
      if (this.eventIdBuilder_ != null) {
         var1 = (Structures$PbEventIdOrBuilder)this.eventIdBuilder_.getMessageOrBuilder();
      } else if (this.eventId_ == null) {
         var1 = Structures$PbEventId.getDefaultInstance();
      } else {
         var1 = this.eventId_;
      }

      return (Structures$PbEventIdOrBuilder)var1;
   }

   public TrainingSessionTarget$PbExerciseTarget getExerciseTarget(int var1) {
      TrainingSessionTarget$PbExerciseTarget var2;
      if (this.exerciseTargetBuilder_ == null) {
         var2 = (TrainingSessionTarget$PbExerciseTarget)this.exerciseTarget_.get(var1);
      } else {
         var2 = (TrainingSessionTarget$PbExerciseTarget)this.exerciseTargetBuilder_.getMessage(var1);
      }

      return var2;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder getExerciseTargetBuilder(int var1) {
      return (TrainingSessionTarget$PbExerciseTarget$Builder)this.getExerciseTargetFieldBuilder().getBuilder(var1);
   }

   public List getExerciseTargetBuilderList() {
      return this.getExerciseTargetFieldBuilder().getBuilderList();
   }

   public int getExerciseTargetCount() {
      int var1;
      if (this.exerciseTargetBuilder_ == null) {
         var1 = this.exerciseTarget_.size();
      } else {
         var1 = this.exerciseTargetBuilder_.getCount();
      }

      return var1;
   }

   public List getExerciseTargetList() {
      List var1;
      if (this.exerciseTargetBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.exerciseTarget_);
      } else {
         var1 = this.exerciseTargetBuilder_.getMessageList();
      }

      return var1;
   }

   public TrainingSessionTarget$PbExerciseTargetOrBuilder getExerciseTargetOrBuilder(int var1) {
      TrainingSessionTarget$PbExerciseTargetOrBuilder var2;
      if (this.exerciseTargetBuilder_ == null) {
         var2 = (TrainingSessionTarget$PbExerciseTargetOrBuilder)this.exerciseTarget_.get(var1);
      } else {
         var2 = (TrainingSessionTarget$PbExerciseTargetOrBuilder)this.exerciseTargetBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getExerciseTargetOrBuilderList() {
      List var1;
      if (this.exerciseTargetBuilder_ != null) {
         var1 = this.exerciseTargetBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.exerciseTarget_);
      }

      return var1;
   }

   public Structures$PbOneLineText getName() {
      Structures$PbOneLineText var1;
      if (this.nameBuilder_ == null) {
         if (this.name_ == null) {
            var1 = Structures$PbOneLineText.getDefaultInstance();
         } else {
            var1 = this.name_;
         }
      } else {
         var1 = (Structures$PbOneLineText)this.nameBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbOneLineText$Builder getNameBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Structures$PbOneLineText$Builder)this.getNameFieldBuilder().getBuilder();
   }

   public Structures$PbOneLineTextOrBuilder getNameOrBuilder() {
      Object var1;
      if (this.nameBuilder_ != null) {
         var1 = (Structures$PbOneLineTextOrBuilder)this.nameBuilder_.getMessageOrBuilder();
      } else if (this.name_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.name_;
      }

      return (Structures$PbOneLineTextOrBuilder)var1;
   }

   public Structures$PbSportIdentifier getSportId() {
      Structures$PbSportIdentifier var1;
      if (this.sportIdBuilder_ == null) {
         if (this.sportId_ == null) {
            var1 = Structures$PbSportIdentifier.getDefaultInstance();
         } else {
            var1 = this.sportId_;
         }
      } else {
         var1 = (Structures$PbSportIdentifier)this.sportIdBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbSportIdentifier$Builder getSportIdBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Structures$PbSportIdentifier$Builder)this.getSportIdFieldBuilder().getBuilder();
   }

   public Structures$PbSportIdentifierOrBuilder getSportIdOrBuilder() {
      Object var1;
      if (this.sportIdBuilder_ != null) {
         var1 = (Structures$PbSportIdentifierOrBuilder)this.sportIdBuilder_.getMessageOrBuilder();
      } else if (this.sportId_ == null) {
         var1 = Structures$PbSportIdentifier.getDefaultInstance();
      } else {
         var1 = this.sportId_;
      }

      return (Structures$PbSportIdentifierOrBuilder)var1;
   }

   public Types$PbLocalDateTime getStartTime() {
      Types$PbLocalDateTime var1;
      if (this.startTimeBuilder_ == null) {
         if (this.startTime_ == null) {
            var1 = Types$PbLocalDateTime.getDefaultInstance();
         } else {
            var1 = this.startTime_;
         }
      } else {
         var1 = (Types$PbLocalDateTime)this.startTimeBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbLocalDateTime$Builder getStartTimeBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (Types$PbLocalDateTime$Builder)this.getStartTimeFieldBuilder().getBuilder();
   }

   public Types$PbLocalDateTimeOrBuilder getStartTimeOrBuilder() {
      Object var1;
      if (this.startTimeBuilder_ != null) {
         var1 = (Types$PbLocalDateTimeOrBuilder)this.startTimeBuilder_.getMessageOrBuilder();
      } else if (this.startTime_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.startTime_;
      }

      return (Types$PbLocalDateTimeOrBuilder)var1;
   }

   public boolean getTargetDone() {
      return this.targetDone_;
   }

   public Structures$PbTrainingProgramId getTrainingProgramId() {
      Structures$PbTrainingProgramId var1;
      if (this.trainingProgramIdBuilder_ == null) {
         if (this.trainingProgramId_ == null) {
            var1 = Structures$PbTrainingProgramId.getDefaultInstance();
         } else {
            var1 = this.trainingProgramId_;
         }
      } else {
         var1 = (Structures$PbTrainingProgramId)this.trainingProgramIdBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbTrainingProgramId$Builder getTrainingProgramIdBuilder() {
      this.bitField0_ |= 128;
      this.onChanged();
      return (Structures$PbTrainingProgramId$Builder)this.getTrainingProgramIdFieldBuilder().getBuilder();
   }

   public Structures$PbTrainingProgramIdOrBuilder getTrainingProgramIdOrBuilder() {
      Object var1;
      if (this.trainingProgramIdBuilder_ != null) {
         var1 = (Structures$PbTrainingProgramIdOrBuilder)this.trainingProgramIdBuilder_.getMessageOrBuilder();
      } else if (this.trainingProgramId_ == null) {
         var1 = Structures$PbTrainingProgramId.getDefaultInstance();
      } else {
         var1 = this.trainingProgramId_;
      }

      return (Structures$PbTrainingProgramIdOrBuilder)var1;
   }

   public boolean hasDescription() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDuration() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasEventId() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasName() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSportId() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStartTime() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTargetDone() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTrainingProgramId() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return TrainingSessionTarget.f().ensureFieldAccessorsInitialized(TrainingSessionTarget$PbTrainingSessionTarget.class, TrainingSessionTarget$PbTrainingSessionTarget$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasName()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.getName().isInitialized()) {
            if (this.hasSportId()) {
               var2 = var1;
               if (!this.getSportId().isInitialized()) {
                  return var2;
               }
            }

            if (this.hasStartTime()) {
               var2 = var1;
               if (!this.getStartTime().isInitialized()) {
                  return var2;
               }
            }

            if (this.hasDescription()) {
               var2 = var1;
               if (!this.getDescription().isInitialized()) {
                  return var2;
               }
            }

            int var3 = 0;

            while(true) {
               if (var3 >= this.getExerciseTargetCount()) {
                  if (this.hasTrainingProgramId()) {
                     var2 = var1;
                     if (!this.getTrainingProgramId().isInitialized()) {
                        break;
                     }
                  }

                  if (this.hasEventId()) {
                     var2 = var1;
                     if (!this.getEventId().isInitialized()) {
                        break;
                     }
                  }

                  var2 = true;
                  break;
               }

               var2 = var1;
               if (!this.getExerciseTarget(var3).isInitialized()) {
                  break;
               }

               ++var3;
            }
         }
      }

      return var2;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder mergeDescription(Structures$PbMultiLineText var1) {
      if (this.descriptionBuilder_ == null) {
         if ((this.bitField0_ & 8) == 8 && this.description_ != null && this.description_ != Structures$PbMultiLineText.getDefaultInstance()) {
            this.description_ = Structures$PbMultiLineText.newBuilder(this.description_).mergeFrom(var1).buildPartial();
         } else {
            this.description_ = var1;
         }

         this.onChanged();
      } else {
         this.descriptionBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder mergeDuration(Types$PbDuration var1) {
      if (this.durationBuilder_ == null) {
         if ((this.bitField0_ & 64) == 64 && this.duration_ != null && this.duration_ != Types$PbDuration.getDefaultInstance()) {
            this.duration_ = Types$PbDuration.newBuilder(this.duration_).mergeFrom(var1).buildPartial();
         } else {
            this.duration_ = var1;
         }

         this.onChanged();
      } else {
         this.durationBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder mergeEventId(Structures$PbEventId var1) {
      if (this.eventIdBuilder_ == null) {
         if ((this.bitField0_ & 256) == 256 && this.eventId_ != null && this.eventId_ != Structures$PbEventId.getDefaultInstance()) {
            this.eventId_ = Structures$PbEventId.newBuilder(this.eventId_).mergeFrom(var1).buildPartial();
         } else {
            this.eventId_ = var1;
         }

         this.onChanged();
      } else {
         this.eventIdBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 256;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      TrainingSessionTarget$PbTrainingSessionTarget var13;
      label96: {
         InvalidProtocolBufferException var12;
         TrainingSessionTarget$PbTrainingSessionTarget var14;
         try {
            var13 = (TrainingSessionTarget$PbTrainingSessionTarget)TrainingSessionTarget$PbTrainingSessionTarget.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (TrainingSessionTarget$PbTrainingSessionTarget)var10.getUnfinishedMessage();
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

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder mergeFrom(Message var1) {
      TrainingSessionTarget$PbTrainingSessionTarget$Builder var2;
      if (var1 instanceof TrainingSessionTarget$PbTrainingSessionTarget) {
         var2 = this.mergeFrom((TrainingSessionTarget$PbTrainingSessionTarget)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder mergeFrom(TrainingSessionTarget$PbTrainingSessionTarget var1) {
      RepeatedFieldBuilderV3 var2 = null;
      if (var1 != TrainingSessionTarget$PbTrainingSessionTarget.getDefaultInstance()) {
         if (var1.hasName()) {
            this.mergeName(var1.getName());
         }

         if (var1.hasSportId()) {
            this.mergeSportId(var1.getSportId());
         }

         if (var1.hasStartTime()) {
            this.mergeStartTime(var1.getStartTime());
         }

         if (var1.hasDescription()) {
            this.mergeDescription(var1.getDescription());
         }

         if (this.exerciseTargetBuilder_ == null) {
            if (!TrainingSessionTarget$PbTrainingSessionTarget.a(var1).isEmpty()) {
               if (this.exerciseTarget_.isEmpty()) {
                  this.exerciseTarget_ = TrainingSessionTarget$PbTrainingSessionTarget.a(var1);
                  this.bitField0_ &= -17;
               } else {
                  this.ensureExerciseTargetIsMutable();
                  this.exerciseTarget_.addAll(TrainingSessionTarget$PbTrainingSessionTarget.a(var1));
               }

               this.onChanged();
            }
         } else if (!TrainingSessionTarget$PbTrainingSessionTarget.a(var1).isEmpty()) {
            if (this.exerciseTargetBuilder_.isEmpty()) {
               this.exerciseTargetBuilder_.dispose();
               this.exerciseTargetBuilder_ = null;
               this.exerciseTarget_ = TrainingSessionTarget$PbTrainingSessionTarget.a(var1);
               this.bitField0_ &= -17;
               if (TrainingSessionTarget$PbTrainingSessionTarget.c()) {
                  var2 = this.getExerciseTargetFieldBuilder();
               }

               this.exerciseTargetBuilder_ = var2;
            } else {
               this.exerciseTargetBuilder_.addAllMessages(TrainingSessionTarget$PbTrainingSessionTarget.a(var1));
            }
         }

         if (var1.hasTargetDone()) {
            this.setTargetDone(var1.getTargetDone());
         }

         if (var1.hasDuration()) {
            this.mergeDuration(var1.getDuration());
         }

         if (var1.hasTrainingProgramId()) {
            this.mergeTrainingProgramId(var1.getTrainingProgramId());
         }

         if (var1.hasEventId()) {
            this.mergeEventId(var1.getEventId());
         }

         this.mergeUnknownFields(TrainingSessionTarget$PbTrainingSessionTarget.b(var1));
         this.onChanged();
      }

      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder mergeName(Structures$PbOneLineText var1) {
      if (this.nameBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.name_ != null && this.name_ != Structures$PbOneLineText.getDefaultInstance()) {
            this.name_ = Structures$PbOneLineText.newBuilder(this.name_).mergeFrom(var1).buildPartial();
         } else {
            this.name_ = var1;
         }

         this.onChanged();
      } else {
         this.nameBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder mergeSportId(Structures$PbSportIdentifier var1) {
      if (this.sportIdBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.sportId_ != null && this.sportId_ != Structures$PbSportIdentifier.getDefaultInstance()) {
            this.sportId_ = Structures$PbSportIdentifier.newBuilder(this.sportId_).mergeFrom(var1).buildPartial();
         } else {
            this.sportId_ = var1;
         }

         this.onChanged();
      } else {
         this.sportIdBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder mergeStartTime(Types$PbLocalDateTime var1) {
      if (this.startTimeBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.startTime_ != null && this.startTime_ != Types$PbLocalDateTime.getDefaultInstance()) {
            this.startTime_ = Types$PbLocalDateTime.newBuilder(this.startTime_).mergeFrom(var1).buildPartial();
         } else {
            this.startTime_ = var1;
         }

         this.onChanged();
      } else {
         this.startTimeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder mergeTrainingProgramId(Structures$PbTrainingProgramId var1) {
      if (this.trainingProgramIdBuilder_ == null) {
         if ((this.bitField0_ & 128) == 128 && this.trainingProgramId_ != null && this.trainingProgramId_ != Structures$PbTrainingProgramId.getDefaultInstance()) {
            this.trainingProgramId_ = Structures$PbTrainingProgramId.newBuilder(this.trainingProgramId_).mergeFrom(var1).buildPartial();
         } else {
            this.trainingProgramId_ = var1;
         }

         this.onChanged();
      } else {
         this.trainingProgramIdBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 128;
      return this;
   }

   public final TrainingSessionTarget$PbTrainingSessionTarget$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (TrainingSessionTarget$PbTrainingSessionTarget$Builder)super.mergeUnknownFields(var1);
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder removeExerciseTarget(int var1) {
      if (this.exerciseTargetBuilder_ == null) {
         this.ensureExerciseTargetIsMutable();
         this.exerciseTarget_.remove(var1);
         this.onChanged();
      } else {
         this.exerciseTargetBuilder_.remove(var1);
      }

      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder setDescription(Structures$PbMultiLineText$Builder var1) {
      if (this.descriptionBuilder_ == null) {
         this.description_ = var1.build();
         this.onChanged();
      } else {
         this.descriptionBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder setDescription(Structures$PbMultiLineText var1) {
      if (this.descriptionBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.description_ = var1;
         this.onChanged();
      } else {
         this.descriptionBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder setDuration(Types$PbDuration$Builder var1) {
      if (this.durationBuilder_ == null) {
         this.duration_ = var1.build();
         this.onChanged();
      } else {
         this.durationBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 64;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder setDuration(Types$PbDuration var1) {
      if (this.durationBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.duration_ = var1;
         this.onChanged();
      } else {
         this.durationBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder setEventId(Structures$PbEventId$Builder var1) {
      if (this.eventIdBuilder_ == null) {
         this.eventId_ = var1.build();
         this.onChanged();
      } else {
         this.eventIdBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 256;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder setEventId(Structures$PbEventId var1) {
      if (this.eventIdBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.eventId_ = var1;
         this.onChanged();
      } else {
         this.eventIdBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 256;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder setExerciseTarget(int var1, TrainingSessionTarget$PbExerciseTarget$Builder var2) {
      if (this.exerciseTargetBuilder_ == null) {
         this.ensureExerciseTargetIsMutable();
         this.exerciseTarget_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.exerciseTargetBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder setExerciseTarget(int var1, TrainingSessionTarget$PbExerciseTarget var2) {
      if (this.exerciseTargetBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureExerciseTargetIsMutable();
         this.exerciseTarget_.set(var1, var2);
         this.onChanged();
      } else {
         this.exerciseTargetBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder setField(FieldDescriptor var1, Object var2) {
      return (TrainingSessionTarget$PbTrainingSessionTarget$Builder)super.setField(var1, var2);
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder setName(Structures$PbOneLineText$Builder var1) {
      if (this.nameBuilder_ == null) {
         this.name_ = var1.build();
         this.onChanged();
      } else {
         this.nameBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder setName(Structures$PbOneLineText var1) {
      if (this.nameBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.onChanged();
      } else {
         this.nameBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (TrainingSessionTarget$PbTrainingSessionTarget$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder setSportId(Structures$PbSportIdentifier$Builder var1) {
      if (this.sportIdBuilder_ == null) {
         this.sportId_ = var1.build();
         this.onChanged();
      } else {
         this.sportIdBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder setSportId(Structures$PbSportIdentifier var1) {
      if (this.sportIdBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.sportId_ = var1;
         this.onChanged();
      } else {
         this.sportIdBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder setStartTime(Types$PbLocalDateTime$Builder var1) {
      if (this.startTimeBuilder_ == null) {
         this.startTime_ = var1.build();
         this.onChanged();
      } else {
         this.startTimeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder setStartTime(Types$PbLocalDateTime var1) {
      if (this.startTimeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.startTime_ = var1;
         this.onChanged();
      } else {
         this.startTimeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder setTargetDone(boolean var1) {
      this.bitField0_ |= 32;
      this.targetDone_ = var1;
      this.onChanged();
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder setTrainingProgramId(Structures$PbTrainingProgramId$Builder var1) {
      if (this.trainingProgramIdBuilder_ == null) {
         this.trainingProgramId_ = var1.build();
         this.onChanged();
      } else {
         this.trainingProgramIdBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 128;
      return this;
   }

   public TrainingSessionTarget$PbTrainingSessionTarget$Builder setTrainingProgramId(Structures$PbTrainingProgramId var1) {
      if (this.trainingProgramIdBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.trainingProgramId_ = var1;
         this.onChanged();
      } else {
         this.trainingProgramIdBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 128;
      return this;
   }

   public final TrainingSessionTarget$PbTrainingSessionTarget$Builder setUnknownFields(UnknownFieldSet var1) {
      return (TrainingSessionTarget$PbTrainingSessionTarget$Builder)super.setUnknownFields(var1);
   }
}
