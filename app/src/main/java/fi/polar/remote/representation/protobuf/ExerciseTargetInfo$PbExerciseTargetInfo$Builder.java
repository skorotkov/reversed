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

public final class ExerciseTargetInfo$PbExerciseTargetInfo$Builder extends Builder implements ExerciseTargetInfo$PbExerciseTargetInfoOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 endTimeBuilder_;
   private Types$PbDuration endTime_;
   private int index_;
   private SingleFieldBuilderV3 nameBuilder_;
   private Structures$PbOneLineText name_;
   private SingleFieldBuilderV3 phasesBuilder_;
   private ExercisePhase$PbPhases phases_;
   private SingleFieldBuilderV3 routeBuilder_;
   private Structures$PbRouteId route_;
   private SingleFieldBuilderV3 sportIdBuilder_;
   private Structures$PbSportIdentifier sportId_;
   private SingleFieldBuilderV3 steadyRacePaceBuilder_;
   private SingleFieldBuilderV3 steadyRacePaceResultBuilder_;
   private ExerciseTargetInfo$PbSteadyRacePaceResult steadyRacePaceResult_;
   private TrainingSessionTarget$PbSteadyRacePace steadyRacePace_;
   private SingleFieldBuilderV3 stravaSegmentTargetBuilder_;
   private Structures$PbStravaSegmentTarget stravaSegmentTarget_;
   private boolean targetReached_;
   private int targetType_;
   private SingleFieldBuilderV3 volumeTargetBuilder_;
   private Structures$PbVolumeTarget volumeTarget_;

   private ExerciseTargetInfo$PbExerciseTargetInfo$Builder() {
      this.targetType_ = 0;
      this.name_ = null;
      this.endTime_ = null;
      this.sportId_ = null;
      this.volumeTarget_ = null;
      this.phases_ = null;
      this.route_ = null;
      this.steadyRacePace_ = null;
      this.steadyRacePaceResult_ = null;
      this.stravaSegmentTarget_ = null;
      this.maybeForceBuilderInitialization();
   }

   private ExerciseTargetInfo$PbExerciseTargetInfo$Builder(BuilderParent var1) {
      super(var1);
      this.targetType_ = 0;
      this.name_ = null;
      this.endTime_ = null;
      this.sportId_ = null;
      this.volumeTarget_ = null;
      this.phases_ = null;
      this.route_ = null;
      this.steadyRacePace_ = null;
      this.steadyRacePaceResult_ = null;
      this.stravaSegmentTarget_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseTargetInfo$PbExerciseTargetInfo$Builder(BuilderParent var1, ExerciseTargetInfo$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseTargetInfo$PbExerciseTargetInfo$Builder(ExerciseTargetInfo$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseTargetInfo.c();
   }

   private SingleFieldBuilderV3 getEndTimeFieldBuilder() {
      if (this.endTimeBuilder_ == null) {
         this.endTimeBuilder_ = new SingleFieldBuilderV3(this.getEndTime(), this.getParentForChildren(), this.isClean());
         this.endTime_ = null;
      }

      return this.endTimeBuilder_;
   }

   private SingleFieldBuilderV3 getNameFieldBuilder() {
      if (this.nameBuilder_ == null) {
         this.nameBuilder_ = new SingleFieldBuilderV3(this.getName(), this.getParentForChildren(), this.isClean());
         this.name_ = null;
      }

      return this.nameBuilder_;
   }

   private SingleFieldBuilderV3 getPhasesFieldBuilder() {
      if (this.phasesBuilder_ == null) {
         this.phasesBuilder_ = new SingleFieldBuilderV3(this.getPhases(), this.getParentForChildren(), this.isClean());
         this.phases_ = null;
      }

      return this.phasesBuilder_;
   }

   private SingleFieldBuilderV3 getRouteFieldBuilder() {
      if (this.routeBuilder_ == null) {
         this.routeBuilder_ = new SingleFieldBuilderV3(this.getRoute(), this.getParentForChildren(), this.isClean());
         this.route_ = null;
      }

      return this.routeBuilder_;
   }

   private SingleFieldBuilderV3 getSportIdFieldBuilder() {
      if (this.sportIdBuilder_ == null) {
         this.sportIdBuilder_ = new SingleFieldBuilderV3(this.getSportId(), this.getParentForChildren(), this.isClean());
         this.sportId_ = null;
      }

      return this.sportIdBuilder_;
   }

   private SingleFieldBuilderV3 getSteadyRacePaceFieldBuilder() {
      if (this.steadyRacePaceBuilder_ == null) {
         this.steadyRacePaceBuilder_ = new SingleFieldBuilderV3(this.getSteadyRacePace(), this.getParentForChildren(), this.isClean());
         this.steadyRacePace_ = null;
      }

      return this.steadyRacePaceBuilder_;
   }

   private SingleFieldBuilderV3 getSteadyRacePaceResultFieldBuilder() {
      if (this.steadyRacePaceResultBuilder_ == null) {
         this.steadyRacePaceResultBuilder_ = new SingleFieldBuilderV3(this.getSteadyRacePaceResult(), this.getParentForChildren(), this.isClean());
         this.steadyRacePaceResult_ = null;
      }

      return this.steadyRacePaceResultBuilder_;
   }

   private SingleFieldBuilderV3 getStravaSegmentTargetFieldBuilder() {
      if (this.stravaSegmentTargetBuilder_ == null) {
         this.stravaSegmentTargetBuilder_ = new SingleFieldBuilderV3(this.getStravaSegmentTarget(), this.getParentForChildren(), this.isClean());
         this.stravaSegmentTarget_ = null;
      }

      return this.stravaSegmentTargetBuilder_;
   }

   private SingleFieldBuilderV3 getVolumeTargetFieldBuilder() {
      if (this.volumeTargetBuilder_ == null) {
         this.volumeTargetBuilder_ = new SingleFieldBuilderV3(this.getVolumeTarget(), this.getParentForChildren(), this.isClean());
         this.volumeTarget_ = null;
      }

      return this.volumeTargetBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseTargetInfo$PbExerciseTargetInfo.b()) {
         this.getNameFieldBuilder();
         this.getEndTimeFieldBuilder();
         this.getSportIdFieldBuilder();
         this.getVolumeTargetFieldBuilder();
         this.getPhasesFieldBuilder();
         this.getRouteFieldBuilder();
         this.getSteadyRacePaceFieldBuilder();
         this.getSteadyRacePaceResultFieldBuilder();
         this.getStravaSegmentTargetFieldBuilder();
      }

   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseTargetInfo$PbExerciseTargetInfo$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo build() {
      ExerciseTargetInfo$PbExerciseTargetInfo var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo buildPartial() {
      byte var1 = 1;
      ExerciseTargetInfo$PbExerciseTargetInfo var2 = new ExerciseTargetInfo$PbExerciseTargetInfo(this, (ExerciseTargetInfo$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ExerciseTargetInfo$PbExerciseTargetInfo.a(var2, this.targetType_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      ExerciseTargetInfo$PbExerciseTargetInfo.b(var2, this.index_);
      int var5;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      } else {
         var5 = var4;
      }

      if (this.nameBuilder_ == null) {
         ExerciseTargetInfo$PbExerciseTargetInfo.a(var2, this.name_);
      } else {
         ExerciseTargetInfo$PbExerciseTargetInfo.a(var2, (Structures$PbOneLineText)this.nameBuilder_.build());
      }

      var4 = var5;
      if ((var3 & 8) == 8) {
         var4 = var5 | 8;
      }

      ExerciseTargetInfo$PbExerciseTargetInfo.a(var2, this.targetReached_);
      var5 = var4;
      if ((var3 & 16) == 16) {
         var5 = var4 | 16;
      }

      if (this.endTimeBuilder_ == null) {
         ExerciseTargetInfo$PbExerciseTargetInfo.a(var2, this.endTime_);
      } else {
         ExerciseTargetInfo$PbExerciseTargetInfo.a(var2, (Types$PbDuration)this.endTimeBuilder_.build());
      }

      var4 = var5;
      if ((var3 & 32) == 32) {
         var4 = var5 | 32;
      }

      if (this.sportIdBuilder_ == null) {
         ExerciseTargetInfo$PbExerciseTargetInfo.a(var2, this.sportId_);
      } else {
         ExerciseTargetInfo$PbExerciseTargetInfo.a(var2, (Structures$PbSportIdentifier)this.sportIdBuilder_.build());
      }

      var5 = var4;
      if ((var3 & 64) == 64) {
         var5 = var4 | 64;
      }

      if (this.volumeTargetBuilder_ == null) {
         ExerciseTargetInfo$PbExerciseTargetInfo.a(var2, this.volumeTarget_);
      } else {
         ExerciseTargetInfo$PbExerciseTargetInfo.a(var2, (Structures$PbVolumeTarget)this.volumeTargetBuilder_.build());
      }

      var4 = var5;
      if ((var3 & 128) == 128) {
         var4 = var5 | 128;
      }

      if (this.phasesBuilder_ == null) {
         ExerciseTargetInfo$PbExerciseTargetInfo.a(var2, this.phases_);
      } else {
         ExerciseTargetInfo$PbExerciseTargetInfo.a(var2, (ExercisePhase$PbPhases)this.phasesBuilder_.build());
      }

      var5 = var4;
      if ((var3 & 256) == 256) {
         var5 = var4 | 256;
      }

      if (this.routeBuilder_ == null) {
         ExerciseTargetInfo$PbExerciseTargetInfo.a(var2, this.route_);
      } else {
         ExerciseTargetInfo$PbExerciseTargetInfo.a(var2, (Structures$PbRouteId)this.routeBuilder_.build());
      }

      var4 = var5;
      if ((var3 & 512) == 512) {
         var4 = var5 | 512;
      }

      if (this.steadyRacePaceBuilder_ == null) {
         ExerciseTargetInfo$PbExerciseTargetInfo.a(var2, this.steadyRacePace_);
      } else {
         ExerciseTargetInfo$PbExerciseTargetInfo.a(var2, (TrainingSessionTarget$PbSteadyRacePace)this.steadyRacePaceBuilder_.build());
      }

      var5 = var4;
      if ((var3 & 1024) == 1024) {
         var5 = var4 | 1024;
      }

      if (this.steadyRacePaceResultBuilder_ == null) {
         ExerciseTargetInfo$PbExerciseTargetInfo.a(var2, this.steadyRacePaceResult_);
      } else {
         ExerciseTargetInfo$PbExerciseTargetInfo.a(var2, (ExerciseTargetInfo$PbSteadyRacePaceResult)this.steadyRacePaceResultBuilder_.build());
      }

      var4 = var5;
      if ((var3 & 2048) == 2048) {
         var4 = var5 | 2048;
      }

      if (this.stravaSegmentTargetBuilder_ == null) {
         ExerciseTargetInfo$PbExerciseTargetInfo.a(var2, this.stravaSegmentTarget_);
      } else {
         ExerciseTargetInfo$PbExerciseTargetInfo.a(var2, (Structures$PbStravaSegmentTarget)this.stravaSegmentTargetBuilder_.build());
      }

      ExerciseTargetInfo$PbExerciseTargetInfo.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder clear() {
      super.clear();
      this.targetType_ = 0;
      this.bitField0_ &= -2;
      this.index_ = 0;
      this.bitField0_ &= -3;
      if (this.nameBuilder_ == null) {
         this.name_ = null;
      } else {
         this.nameBuilder_.clear();
      }

      this.bitField0_ &= -5;
      this.targetReached_ = false;
      this.bitField0_ &= -9;
      if (this.endTimeBuilder_ == null) {
         this.endTime_ = null;
      } else {
         this.endTimeBuilder_.clear();
      }

      this.bitField0_ &= -17;
      if (this.sportIdBuilder_ == null) {
         this.sportId_ = null;
      } else {
         this.sportIdBuilder_.clear();
      }

      this.bitField0_ &= -33;
      if (this.volumeTargetBuilder_ == null) {
         this.volumeTarget_ = null;
      } else {
         this.volumeTargetBuilder_.clear();
      }

      this.bitField0_ &= -65;
      if (this.phasesBuilder_ == null) {
         this.phases_ = null;
      } else {
         this.phasesBuilder_.clear();
      }

      this.bitField0_ &= -129;
      if (this.routeBuilder_ == null) {
         this.route_ = null;
      } else {
         this.routeBuilder_.clear();
      }

      this.bitField0_ &= -257;
      if (this.steadyRacePaceBuilder_ == null) {
         this.steadyRacePace_ = null;
      } else {
         this.steadyRacePaceBuilder_.clear();
      }

      this.bitField0_ &= -513;
      if (this.steadyRacePaceResultBuilder_ == null) {
         this.steadyRacePaceResult_ = null;
      } else {
         this.steadyRacePaceResultBuilder_.clear();
      }

      this.bitField0_ &= -1025;
      if (this.stravaSegmentTargetBuilder_ == null) {
         this.stravaSegmentTarget_ = null;
      } else {
         this.stravaSegmentTargetBuilder_.clear();
      }

      this.bitField0_ &= -2049;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder clearEndTime() {
      if (this.endTimeBuilder_ == null) {
         this.endTime_ = null;
         this.onChanged();
      } else {
         this.endTimeBuilder_.clear();
      }

      this.bitField0_ &= -17;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder clearField(FieldDescriptor var1) {
      return (ExerciseTargetInfo$PbExerciseTargetInfo$Builder)super.clearField(var1);
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder clearIndex() {
      this.bitField0_ &= -3;
      this.index_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder clearName() {
      if (this.nameBuilder_ == null) {
         this.name_ = null;
         this.onChanged();
      } else {
         this.nameBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseTargetInfo$PbExerciseTargetInfo$Builder)super.clearOneof(var1);
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder clearPhases() {
      if (this.phasesBuilder_ == null) {
         this.phases_ = null;
         this.onChanged();
      } else {
         this.phasesBuilder_.clear();
      }

      this.bitField0_ &= -129;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder clearRoute() {
      if (this.routeBuilder_ == null) {
         this.route_ = null;
         this.onChanged();
      } else {
         this.routeBuilder_.clear();
      }

      this.bitField0_ &= -257;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder clearSportId() {
      if (this.sportIdBuilder_ == null) {
         this.sportId_ = null;
         this.onChanged();
      } else {
         this.sportIdBuilder_.clear();
      }

      this.bitField0_ &= -33;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder clearSteadyRacePace() {
      if (this.steadyRacePaceBuilder_ == null) {
         this.steadyRacePace_ = null;
         this.onChanged();
      } else {
         this.steadyRacePaceBuilder_.clear();
      }

      this.bitField0_ &= -513;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder clearSteadyRacePaceResult() {
      if (this.steadyRacePaceResultBuilder_ == null) {
         this.steadyRacePaceResult_ = null;
         this.onChanged();
      } else {
         this.steadyRacePaceResultBuilder_.clear();
      }

      this.bitField0_ &= -1025;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder clearStravaSegmentTarget() {
      if (this.stravaSegmentTargetBuilder_ == null) {
         this.stravaSegmentTarget_ = null;
         this.onChanged();
      } else {
         this.stravaSegmentTargetBuilder_.clear();
      }

      this.bitField0_ &= -2049;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder clearTargetReached() {
      this.bitField0_ &= -9;
      this.targetReached_ = false;
      this.onChanged();
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder clearTargetType() {
      this.bitField0_ &= -2;
      this.targetType_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder clearVolumeTarget() {
      if (this.volumeTargetBuilder_ == null) {
         this.volumeTarget_ = null;
         this.onChanged();
      } else {
         this.volumeTargetBuilder_.clear();
      }

      this.bitField0_ &= -65;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder clone() {
      return (ExerciseTargetInfo$PbExerciseTargetInfo$Builder)super.clone();
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo getDefaultInstanceForType() {
      return ExerciseTargetInfo$PbExerciseTargetInfo.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseTargetInfo.c();
   }

   public Types$PbDuration getEndTime() {
      Types$PbDuration var1;
      if (this.endTimeBuilder_ == null) {
         if (this.endTime_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.endTime_;
         }
      } else {
         var1 = (Types$PbDuration)this.endTimeBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getEndTimeBuilder() {
      this.bitField0_ |= 16;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getEndTimeFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getEndTimeOrBuilder() {
      Object var1;
      if (this.endTimeBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.endTimeBuilder_.getMessageOrBuilder();
      } else if (this.endTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.endTime_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public int getIndex() {
      return this.index_;
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
      this.bitField0_ |= 4;
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

   public ExercisePhase$PbPhases getPhases() {
      ExercisePhase$PbPhases var1;
      if (this.phasesBuilder_ == null) {
         if (this.phases_ == null) {
            var1 = ExercisePhase$PbPhases.getDefaultInstance();
         } else {
            var1 = this.phases_;
         }
      } else {
         var1 = (ExercisePhase$PbPhases)this.phasesBuilder_.getMessage();
      }

      return var1;
   }

   public ExercisePhase$PbPhases$Builder getPhasesBuilder() {
      this.bitField0_ |= 128;
      this.onChanged();
      return (ExercisePhase$PbPhases$Builder)this.getPhasesFieldBuilder().getBuilder();
   }

   public ExercisePhase$PbPhasesOrBuilder getPhasesOrBuilder() {
      Object var1;
      if (this.phasesBuilder_ != null) {
         var1 = (ExercisePhase$PbPhasesOrBuilder)this.phasesBuilder_.getMessageOrBuilder();
      } else if (this.phases_ == null) {
         var1 = ExercisePhase$PbPhases.getDefaultInstance();
      } else {
         var1 = this.phases_;
      }

      return (ExercisePhase$PbPhasesOrBuilder)var1;
   }

   public Structures$PbRouteId getRoute() {
      Structures$PbRouteId var1;
      if (this.routeBuilder_ == null) {
         if (this.route_ == null) {
            var1 = Structures$PbRouteId.getDefaultInstance();
         } else {
            var1 = this.route_;
         }
      } else {
         var1 = (Structures$PbRouteId)this.routeBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbRouteId$Builder getRouteBuilder() {
      this.bitField0_ |= 256;
      this.onChanged();
      return (Structures$PbRouteId$Builder)this.getRouteFieldBuilder().getBuilder();
   }

   public Structures$PbRouteIdOrBuilder getRouteOrBuilder() {
      Object var1;
      if (this.routeBuilder_ != null) {
         var1 = (Structures$PbRouteIdOrBuilder)this.routeBuilder_.getMessageOrBuilder();
      } else if (this.route_ == null) {
         var1 = Structures$PbRouteId.getDefaultInstance();
      } else {
         var1 = this.route_;
      }

      return (Structures$PbRouteIdOrBuilder)var1;
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
      this.bitField0_ |= 32;
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

   public TrainingSessionTarget$PbSteadyRacePace getSteadyRacePace() {
      TrainingSessionTarget$PbSteadyRacePace var1;
      if (this.steadyRacePaceBuilder_ == null) {
         if (this.steadyRacePace_ == null) {
            var1 = TrainingSessionTarget$PbSteadyRacePace.getDefaultInstance();
         } else {
            var1 = this.steadyRacePace_;
         }
      } else {
         var1 = (TrainingSessionTarget$PbSteadyRacePace)this.steadyRacePaceBuilder_.getMessage();
      }

      return var1;
   }

   public TrainingSessionTarget$PbSteadyRacePace$Builder getSteadyRacePaceBuilder() {
      this.bitField0_ |= 512;
      this.onChanged();
      return (TrainingSessionTarget$PbSteadyRacePace$Builder)this.getSteadyRacePaceFieldBuilder().getBuilder();
   }

   public TrainingSessionTarget$PbSteadyRacePaceOrBuilder getSteadyRacePaceOrBuilder() {
      Object var1;
      if (this.steadyRacePaceBuilder_ != null) {
         var1 = (TrainingSessionTarget$PbSteadyRacePaceOrBuilder)this.steadyRacePaceBuilder_.getMessageOrBuilder();
      } else if (this.steadyRacePace_ == null) {
         var1 = TrainingSessionTarget$PbSteadyRacePace.getDefaultInstance();
      } else {
         var1 = this.steadyRacePace_;
      }

      return (TrainingSessionTarget$PbSteadyRacePaceOrBuilder)var1;
   }

   public ExerciseTargetInfo$PbSteadyRacePaceResult getSteadyRacePaceResult() {
      ExerciseTargetInfo$PbSteadyRacePaceResult var1;
      if (this.steadyRacePaceResultBuilder_ == null) {
         if (this.steadyRacePaceResult_ == null) {
            var1 = ExerciseTargetInfo$PbSteadyRacePaceResult.getDefaultInstance();
         } else {
            var1 = this.steadyRacePaceResult_;
         }
      } else {
         var1 = (ExerciseTargetInfo$PbSteadyRacePaceResult)this.steadyRacePaceResultBuilder_.getMessage();
      }

      return var1;
   }

   public ExerciseTargetInfo$PbSteadyRacePaceResult$Builder getSteadyRacePaceResultBuilder() {
      this.bitField0_ |= 1024;
      this.onChanged();
      return (ExerciseTargetInfo$PbSteadyRacePaceResult$Builder)this.getSteadyRacePaceResultFieldBuilder().getBuilder();
   }

   public ExerciseTargetInfo$PbSteadyRacePaceResultOrBuilder getSteadyRacePaceResultOrBuilder() {
      Object var1;
      if (this.steadyRacePaceResultBuilder_ != null) {
         var1 = (ExerciseTargetInfo$PbSteadyRacePaceResultOrBuilder)this.steadyRacePaceResultBuilder_.getMessageOrBuilder();
      } else if (this.steadyRacePaceResult_ == null) {
         var1 = ExerciseTargetInfo$PbSteadyRacePaceResult.getDefaultInstance();
      } else {
         var1 = this.steadyRacePaceResult_;
      }

      return (ExerciseTargetInfo$PbSteadyRacePaceResultOrBuilder)var1;
   }

   public Structures$PbStravaSegmentTarget getStravaSegmentTarget() {
      Structures$PbStravaSegmentTarget var1;
      if (this.stravaSegmentTargetBuilder_ == null) {
         if (this.stravaSegmentTarget_ == null) {
            var1 = Structures$PbStravaSegmentTarget.getDefaultInstance();
         } else {
            var1 = this.stravaSegmentTarget_;
         }
      } else {
         var1 = (Structures$PbStravaSegmentTarget)this.stravaSegmentTargetBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbStravaSegmentTarget$Builder getStravaSegmentTargetBuilder() {
      this.bitField0_ |= 2048;
      this.onChanged();
      return (Structures$PbStravaSegmentTarget$Builder)this.getStravaSegmentTargetFieldBuilder().getBuilder();
   }

   public Structures$PbStravaSegmentTargetOrBuilder getStravaSegmentTargetOrBuilder() {
      Object var1;
      if (this.stravaSegmentTargetBuilder_ != null) {
         var1 = (Structures$PbStravaSegmentTargetOrBuilder)this.stravaSegmentTargetBuilder_.getMessageOrBuilder();
      } else if (this.stravaSegmentTarget_ == null) {
         var1 = Structures$PbStravaSegmentTarget.getDefaultInstance();
      } else {
         var1 = this.stravaSegmentTarget_;
      }

      return (Structures$PbStravaSegmentTargetOrBuilder)var1;
   }

   public boolean getTargetReached() {
      return this.targetReached_;
   }

   public Types$PbExerciseTargetType getTargetType() {
      Types$PbExerciseTargetType var1 = Types$PbExerciseTargetType.valueOf(this.targetType_);
      Types$PbExerciseTargetType var2 = var1;
      if (var1 == null) {
         var2 = Types$PbExerciseTargetType.EXERCISE_TARGET_TYPE_FREE;
      }

      return var2;
   }

   public Structures$PbVolumeTarget getVolumeTarget() {
      Structures$PbVolumeTarget var1;
      if (this.volumeTargetBuilder_ == null) {
         if (this.volumeTarget_ == null) {
            var1 = Structures$PbVolumeTarget.getDefaultInstance();
         } else {
            var1 = this.volumeTarget_;
         }
      } else {
         var1 = (Structures$PbVolumeTarget)this.volumeTargetBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbVolumeTarget$Builder getVolumeTargetBuilder() {
      this.bitField0_ |= 64;
      this.onChanged();
      return (Structures$PbVolumeTarget$Builder)this.getVolumeTargetFieldBuilder().getBuilder();
   }

   public Structures$PbVolumeTargetOrBuilder getVolumeTargetOrBuilder() {
      Object var1;
      if (this.volumeTargetBuilder_ != null) {
         var1 = (Structures$PbVolumeTargetOrBuilder)this.volumeTargetBuilder_.getMessageOrBuilder();
      } else if (this.volumeTarget_ == null) {
         var1 = Structures$PbVolumeTarget.getDefaultInstance();
      } else {
         var1 = this.volumeTarget_;
      }

      return (Structures$PbVolumeTargetOrBuilder)var1;
   }

   public boolean hasEndTime() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasIndex() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasName() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPhases() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasRoute() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSportId() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSteadyRacePace() {
      boolean var1;
      if ((this.bitField0_ & 512) == 512) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSteadyRacePaceResult() {
      boolean var1;
      if ((this.bitField0_ & 1024) == 1024) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStravaSegmentTarget() {
      boolean var1;
      if ((this.bitField0_ & 2048) == 2048) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTargetReached() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTargetType() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasVolumeTarget() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseTargetInfo.d().ensureFieldAccessorsInitialized(ExerciseTargetInfo$PbExerciseTargetInfo.class, ExerciseTargetInfo$PbExerciseTargetInfo$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasTargetType()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasIndex()) {
            if (this.hasName()) {
               var2 = var1;
               if (!this.getName().isInitialized()) {
                  return var2;
               }
            }

            if (this.hasSportId()) {
               var2 = var1;
               if (!this.getSportId().isInitialized()) {
                  return var2;
               }
            }

            if (this.hasVolumeTarget()) {
               var2 = var1;
               if (!this.getVolumeTarget().isInitialized()) {
                  return var2;
               }
            }

            if (this.hasPhases()) {
               var2 = var1;
               if (!this.getPhases().isInitialized()) {
                  return var2;
               }
            }

            if (this.hasRoute()) {
               var2 = var1;
               if (!this.getRoute().isInitialized()) {
                  return var2;
               }
            }

            if (this.hasSteadyRacePace()) {
               var2 = var1;
               if (!this.getSteadyRacePace().isInitialized()) {
                  return var2;
               }
            }

            if (this.hasSteadyRacePaceResult()) {
               var2 = var1;
               if (!this.getSteadyRacePaceResult().isInitialized()) {
                  return var2;
               }
            }

            if (this.hasStravaSegmentTarget()) {
               var2 = var1;
               if (!this.getStravaSegmentTarget().isInitialized()) {
                  return var2;
               }
            }

            var2 = true;
         }
      }

      return var2;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder mergeEndTime(Types$PbDuration var1) {
      if (this.endTimeBuilder_ == null) {
         if ((this.bitField0_ & 16) == 16 && this.endTime_ != null && this.endTime_ != Types$PbDuration.getDefaultInstance()) {
            this.endTime_ = Types$PbDuration.newBuilder(this.endTime_).mergeFrom(var1).buildPartial();
         } else {
            this.endTime_ = var1;
         }

         this.onChanged();
      } else {
         this.endTimeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseTargetInfo$PbExerciseTargetInfo var13;
      label96: {
         InvalidProtocolBufferException var12;
         ExerciseTargetInfo$PbExerciseTargetInfo var14;
         try {
            var13 = (ExerciseTargetInfo$PbExerciseTargetInfo)ExerciseTargetInfo$PbExerciseTargetInfo.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (ExerciseTargetInfo$PbExerciseTargetInfo)var10.getUnfinishedMessage();
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

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder mergeFrom(Message var1) {
      ExerciseTargetInfo$PbExerciseTargetInfo$Builder var2;
      if (var1 instanceof ExerciseTargetInfo$PbExerciseTargetInfo) {
         var2 = this.mergeFrom((ExerciseTargetInfo$PbExerciseTargetInfo)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder mergeFrom(ExerciseTargetInfo$PbExerciseTargetInfo var1) {
      if (var1 != ExerciseTargetInfo$PbExerciseTargetInfo.getDefaultInstance()) {
         if (var1.hasTargetType()) {
            this.setTargetType(var1.getTargetType());
         }

         if (var1.hasIndex()) {
            this.setIndex(var1.getIndex());
         }

         if (var1.hasName()) {
            this.mergeName(var1.getName());
         }

         if (var1.hasTargetReached()) {
            this.setTargetReached(var1.getTargetReached());
         }

         if (var1.hasEndTime()) {
            this.mergeEndTime(var1.getEndTime());
         }

         if (var1.hasSportId()) {
            this.mergeSportId(var1.getSportId());
         }

         if (var1.hasVolumeTarget()) {
            this.mergeVolumeTarget(var1.getVolumeTarget());
         }

         if (var1.hasPhases()) {
            this.mergePhases(var1.getPhases());
         }

         if (var1.hasRoute()) {
            this.mergeRoute(var1.getRoute());
         }

         if (var1.hasSteadyRacePace()) {
            this.mergeSteadyRacePace(var1.getSteadyRacePace());
         }

         if (var1.hasSteadyRacePaceResult()) {
            this.mergeSteadyRacePaceResult(var1.getSteadyRacePaceResult());
         }

         if (var1.hasStravaSegmentTarget()) {
            this.mergeStravaSegmentTarget(var1.getStravaSegmentTarget());
         }

         this.mergeUnknownFields(ExerciseTargetInfo$PbExerciseTargetInfo.a(var1));
         this.onChanged();
      }

      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder mergeName(Structures$PbOneLineText var1) {
      if (this.nameBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.name_ != null && this.name_ != Structures$PbOneLineText.getDefaultInstance()) {
            this.name_ = Structures$PbOneLineText.newBuilder(this.name_).mergeFrom(var1).buildPartial();
         } else {
            this.name_ = var1;
         }

         this.onChanged();
      } else {
         this.nameBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder mergePhases(ExercisePhase$PbPhases var1) {
      if (this.phasesBuilder_ == null) {
         if ((this.bitField0_ & 128) == 128 && this.phases_ != null && this.phases_ != ExercisePhase$PbPhases.getDefaultInstance()) {
            this.phases_ = ExercisePhase$PbPhases.newBuilder(this.phases_).mergeFrom(var1).buildPartial();
         } else {
            this.phases_ = var1;
         }

         this.onChanged();
      } else {
         this.phasesBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 128;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder mergeRoute(Structures$PbRouteId var1) {
      if (this.routeBuilder_ == null) {
         if ((this.bitField0_ & 256) == 256 && this.route_ != null && this.route_ != Structures$PbRouteId.getDefaultInstance()) {
            this.route_ = Structures$PbRouteId.newBuilder(this.route_).mergeFrom(var1).buildPartial();
         } else {
            this.route_ = var1;
         }

         this.onChanged();
      } else {
         this.routeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 256;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder mergeSportId(Structures$PbSportIdentifier var1) {
      if (this.sportIdBuilder_ == null) {
         if ((this.bitField0_ & 32) == 32 && this.sportId_ != null && this.sportId_ != Structures$PbSportIdentifier.getDefaultInstance()) {
            this.sportId_ = Structures$PbSportIdentifier.newBuilder(this.sportId_).mergeFrom(var1).buildPartial();
         } else {
            this.sportId_ = var1;
         }

         this.onChanged();
      } else {
         this.sportIdBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder mergeSteadyRacePace(TrainingSessionTarget$PbSteadyRacePace var1) {
      if (this.steadyRacePaceBuilder_ == null) {
         if ((this.bitField0_ & 512) == 512 && this.steadyRacePace_ != null && this.steadyRacePace_ != TrainingSessionTarget$PbSteadyRacePace.getDefaultInstance()) {
            this.steadyRacePace_ = TrainingSessionTarget$PbSteadyRacePace.newBuilder(this.steadyRacePace_).mergeFrom(var1).buildPartial();
         } else {
            this.steadyRacePace_ = var1;
         }

         this.onChanged();
      } else {
         this.steadyRacePaceBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 512;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder mergeSteadyRacePaceResult(ExerciseTargetInfo$PbSteadyRacePaceResult var1) {
      if (this.steadyRacePaceResultBuilder_ == null) {
         if ((this.bitField0_ & 1024) == 1024 && this.steadyRacePaceResult_ != null && this.steadyRacePaceResult_ != ExerciseTargetInfo$PbSteadyRacePaceResult.getDefaultInstance()) {
            this.steadyRacePaceResult_ = ExerciseTargetInfo$PbSteadyRacePaceResult.newBuilder(this.steadyRacePaceResult_).mergeFrom(var1).buildPartial();
         } else {
            this.steadyRacePaceResult_ = var1;
         }

         this.onChanged();
      } else {
         this.steadyRacePaceResultBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder mergeStravaSegmentTarget(Structures$PbStravaSegmentTarget var1) {
      if (this.stravaSegmentTargetBuilder_ == null) {
         if ((this.bitField0_ & 2048) == 2048 && this.stravaSegmentTarget_ != null && this.stravaSegmentTarget_ != Structures$PbStravaSegmentTarget.getDefaultInstance()) {
            this.stravaSegmentTarget_ = Structures$PbStravaSegmentTarget.newBuilder(this.stravaSegmentTarget_).mergeFrom(var1).buildPartial();
         } else {
            this.stravaSegmentTarget_ = var1;
         }

         this.onChanged();
      } else {
         this.stravaSegmentTargetBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2048;
      return this;
   }

   public final ExerciseTargetInfo$PbExerciseTargetInfo$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseTargetInfo$PbExerciseTargetInfo$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder mergeVolumeTarget(Structures$PbVolumeTarget var1) {
      if (this.volumeTargetBuilder_ == null) {
         if ((this.bitField0_ & 64) == 64 && this.volumeTarget_ != null && this.volumeTarget_ != Structures$PbVolumeTarget.getDefaultInstance()) {
            this.volumeTarget_ = Structures$PbVolumeTarget.newBuilder(this.volumeTarget_).mergeFrom(var1).buildPartial();
         } else {
            this.volumeTarget_ = var1;
         }

         this.onChanged();
      } else {
         this.volumeTargetBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder setEndTime(Types$PbDuration$Builder var1) {
      if (this.endTimeBuilder_ == null) {
         this.endTime_ = var1.build();
         this.onChanged();
      } else {
         this.endTimeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 16;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder setEndTime(Types$PbDuration var1) {
      if (this.endTimeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.endTime_ = var1;
         this.onChanged();
      } else {
         this.endTimeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseTargetInfo$PbExerciseTargetInfo$Builder)super.setField(var1, var2);
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder setIndex(int var1) {
      this.bitField0_ |= 2;
      this.index_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder setName(Structures$PbOneLineText$Builder var1) {
      if (this.nameBuilder_ == null) {
         this.name_ = var1.build();
         this.onChanged();
      } else {
         this.nameBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder setName(Structures$PbOneLineText var1) {
      if (this.nameBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.onChanged();
      } else {
         this.nameBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder setPhases(ExercisePhase$PbPhases$Builder var1) {
      if (this.phasesBuilder_ == null) {
         this.phases_ = var1.build();
         this.onChanged();
      } else {
         this.phasesBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 128;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder setPhases(ExercisePhase$PbPhases var1) {
      if (this.phasesBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.phases_ = var1;
         this.onChanged();
      } else {
         this.phasesBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 128;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseTargetInfo$PbExerciseTargetInfo$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder setRoute(Structures$PbRouteId$Builder var1) {
      if (this.routeBuilder_ == null) {
         this.route_ = var1.build();
         this.onChanged();
      } else {
         this.routeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 256;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder setRoute(Structures$PbRouteId var1) {
      if (this.routeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.route_ = var1;
         this.onChanged();
      } else {
         this.routeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 256;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder setSportId(Structures$PbSportIdentifier$Builder var1) {
      if (this.sportIdBuilder_ == null) {
         this.sportId_ = var1.build();
         this.onChanged();
      } else {
         this.sportIdBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 32;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder setSportId(Structures$PbSportIdentifier var1) {
      if (this.sportIdBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.sportId_ = var1;
         this.onChanged();
      } else {
         this.sportIdBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder setSteadyRacePace(TrainingSessionTarget$PbSteadyRacePace$Builder var1) {
      if (this.steadyRacePaceBuilder_ == null) {
         this.steadyRacePace_ = var1.build();
         this.onChanged();
      } else {
         this.steadyRacePaceBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 512;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder setSteadyRacePace(TrainingSessionTarget$PbSteadyRacePace var1) {
      if (this.steadyRacePaceBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.steadyRacePace_ = var1;
         this.onChanged();
      } else {
         this.steadyRacePaceBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 512;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder setSteadyRacePaceResult(ExerciseTargetInfo$PbSteadyRacePaceResult$Builder var1) {
      if (this.steadyRacePaceResultBuilder_ == null) {
         this.steadyRacePaceResult_ = var1.build();
         this.onChanged();
      } else {
         this.steadyRacePaceResultBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder setSteadyRacePaceResult(ExerciseTargetInfo$PbSteadyRacePaceResult var1) {
      if (this.steadyRacePaceResultBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.steadyRacePaceResult_ = var1;
         this.onChanged();
      } else {
         this.steadyRacePaceResultBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder setStravaSegmentTarget(Structures$PbStravaSegmentTarget$Builder var1) {
      if (this.stravaSegmentTargetBuilder_ == null) {
         this.stravaSegmentTarget_ = var1.build();
         this.onChanged();
      } else {
         this.stravaSegmentTargetBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2048;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder setStravaSegmentTarget(Structures$PbStravaSegmentTarget var1) {
      if (this.stravaSegmentTargetBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.stravaSegmentTarget_ = var1;
         this.onChanged();
      } else {
         this.stravaSegmentTargetBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2048;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder setTargetReached(boolean var1) {
      this.bitField0_ |= 8;
      this.targetReached_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder setTargetType(Types$PbExerciseTargetType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.targetType_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public final ExerciseTargetInfo$PbExerciseTargetInfo$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseTargetInfo$PbExerciseTargetInfo$Builder)super.setUnknownFields(var1);
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder setVolumeTarget(Structures$PbVolumeTarget$Builder var1) {
      if (this.volumeTargetBuilder_ == null) {
         this.volumeTarget_ = var1.build();
         this.onChanged();
      } else {
         this.volumeTargetBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 64;
      return this;
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder setVolumeTarget(Structures$PbVolumeTarget var1) {
      if (this.volumeTargetBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.volumeTarget_ = var1;
         this.onChanged();
      } else {
         this.volumeTargetBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }
}
