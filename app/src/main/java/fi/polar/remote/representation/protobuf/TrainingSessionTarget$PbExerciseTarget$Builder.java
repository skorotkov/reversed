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

public final class TrainingSessionTarget$PbExerciseTarget$Builder extends Builder implements TrainingSessionTarget$PbExerciseTargetOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 phasesBuilder_;
   private ExercisePhase$PbPhases phases_;
   private SingleFieldBuilderV3 routeBuilder_;
   private Structures$PbRouteId route_;
   private SingleFieldBuilderV3 sportIdBuilder_;
   private Structures$PbSportIdentifier sportId_;
   private SingleFieldBuilderV3 steadyRacePaceBuilder_;
   private TrainingSessionTarget$PbSteadyRacePace steadyRacePace_;
   private SingleFieldBuilderV3 stravaSegmentTargetBuilder_;
   private Structures$PbStravaSegmentTarget stravaSegmentTarget_;
   private int targetType_;
   private SingleFieldBuilderV3 volumeTargetBuilder_;
   private Structures$PbVolumeTarget volumeTarget_;

   private TrainingSessionTarget$PbExerciseTarget$Builder() {
      this.targetType_ = 0;
      this.sportId_ = null;
      this.volumeTarget_ = null;
      this.phases_ = null;
      this.route_ = null;
      this.steadyRacePace_ = null;
      this.stravaSegmentTarget_ = null;
      this.maybeForceBuilderInitialization();
   }

   private TrainingSessionTarget$PbExerciseTarget$Builder(BuilderParent var1) {
      super(var1);
      this.targetType_ = 0;
      this.sportId_ = null;
      this.volumeTarget_ = null;
      this.phases_ = null;
      this.route_ = null;
      this.steadyRacePace_ = null;
      this.stravaSegmentTarget_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   TrainingSessionTarget$PbExerciseTarget$Builder(BuilderParent var1, TrainingSessionTarget$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   TrainingSessionTarget$PbExerciseTarget$Builder(TrainingSessionTarget$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return TrainingSessionTarget.c();
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
      if (TrainingSessionTarget$PbExerciseTarget.b()) {
         this.getSportIdFieldBuilder();
         this.getVolumeTargetFieldBuilder();
         this.getPhasesFieldBuilder();
         this.getRouteFieldBuilder();
         this.getSteadyRacePaceFieldBuilder();
         this.getStravaSegmentTargetFieldBuilder();
      }

   }

   public TrainingSessionTarget$PbExerciseTarget$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (TrainingSessionTarget$PbExerciseTarget$Builder)super.addRepeatedField(var1, var2);
   }

   public TrainingSessionTarget$PbExerciseTarget build() {
      TrainingSessionTarget$PbExerciseTarget var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public TrainingSessionTarget$PbExerciseTarget buildPartial() {
      byte var1 = 1;
      TrainingSessionTarget$PbExerciseTarget var2 = new TrainingSessionTarget$PbExerciseTarget(this, (TrainingSessionTarget$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      TrainingSessionTarget$PbExerciseTarget.a(var2, this.targetType_);
      int var4;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      } else {
         var4 = var1;
      }

      if (this.sportIdBuilder_ == null) {
         TrainingSessionTarget$PbExerciseTarget.a(var2, this.sportId_);
      } else {
         TrainingSessionTarget$PbExerciseTarget.a(var2, (Structures$PbSportIdentifier)this.sportIdBuilder_.build());
      }

      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      if (this.volumeTargetBuilder_ == null) {
         TrainingSessionTarget$PbExerciseTarget.a(var2, this.volumeTarget_);
      } else {
         TrainingSessionTarget$PbExerciseTarget.a(var2, (Structures$PbVolumeTarget)this.volumeTargetBuilder_.build());
      }

      var4 = var5;
      if ((var3 & 8) == 8) {
         var4 = var5 | 8;
      }

      if (this.phasesBuilder_ == null) {
         TrainingSessionTarget$PbExerciseTarget.a(var2, this.phases_);
      } else {
         TrainingSessionTarget$PbExerciseTarget.a(var2, (ExercisePhase$PbPhases)this.phasesBuilder_.build());
      }

      var5 = var4;
      if ((var3 & 16) == 16) {
         var5 = var4 | 16;
      }

      if (this.routeBuilder_ == null) {
         TrainingSessionTarget$PbExerciseTarget.a(var2, this.route_);
      } else {
         TrainingSessionTarget$PbExerciseTarget.a(var2, (Structures$PbRouteId)this.routeBuilder_.build());
      }

      var4 = var5;
      if ((var3 & 32) == 32) {
         var4 = var5 | 32;
      }

      if (this.steadyRacePaceBuilder_ == null) {
         TrainingSessionTarget$PbExerciseTarget.a(var2, this.steadyRacePace_);
      } else {
         TrainingSessionTarget$PbExerciseTarget.a(var2, (TrainingSessionTarget$PbSteadyRacePace)this.steadyRacePaceBuilder_.build());
      }

      var5 = var4;
      if ((var3 & 64) == 64) {
         var5 = var4 | 64;
      }

      if (this.stravaSegmentTargetBuilder_ == null) {
         TrainingSessionTarget$PbExerciseTarget.a(var2, this.stravaSegmentTarget_);
      } else {
         TrainingSessionTarget$PbExerciseTarget.a(var2, (Structures$PbStravaSegmentTarget)this.stravaSegmentTargetBuilder_.build());
      }

      TrainingSessionTarget$PbExerciseTarget.b(var2, var5);
      this.onBuilt();
      return var2;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder clear() {
      super.clear();
      this.targetType_ = 0;
      this.bitField0_ &= -2;
      if (this.sportIdBuilder_ == null) {
         this.sportId_ = null;
      } else {
         this.sportIdBuilder_.clear();
      }

      this.bitField0_ &= -3;
      if (this.volumeTargetBuilder_ == null) {
         this.volumeTarget_ = null;
      } else {
         this.volumeTargetBuilder_.clear();
      }

      this.bitField0_ &= -5;
      if (this.phasesBuilder_ == null) {
         this.phases_ = null;
      } else {
         this.phasesBuilder_.clear();
      }

      this.bitField0_ &= -9;
      if (this.routeBuilder_ == null) {
         this.route_ = null;
      } else {
         this.routeBuilder_.clear();
      }

      this.bitField0_ &= -17;
      if (this.steadyRacePaceBuilder_ == null) {
         this.steadyRacePace_ = null;
      } else {
         this.steadyRacePaceBuilder_.clear();
      }

      this.bitField0_ &= -33;
      if (this.stravaSegmentTargetBuilder_ == null) {
         this.stravaSegmentTarget_ = null;
      } else {
         this.stravaSegmentTargetBuilder_.clear();
      }

      this.bitField0_ &= -65;
      return this;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder clearField(FieldDescriptor var1) {
      return (TrainingSessionTarget$PbExerciseTarget$Builder)super.clearField(var1);
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder clearOneof(OneofDescriptor var1) {
      return (TrainingSessionTarget$PbExerciseTarget$Builder)super.clearOneof(var1);
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder clearPhases() {
      if (this.phasesBuilder_ == null) {
         this.phases_ = null;
         this.onChanged();
      } else {
         this.phasesBuilder_.clear();
      }

      this.bitField0_ &= -9;
      return this;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder clearRoute() {
      if (this.routeBuilder_ == null) {
         this.route_ = null;
         this.onChanged();
      } else {
         this.routeBuilder_.clear();
      }

      this.bitField0_ &= -17;
      return this;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder clearSportId() {
      if (this.sportIdBuilder_ == null) {
         this.sportId_ = null;
         this.onChanged();
      } else {
         this.sportIdBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder clearSteadyRacePace() {
      if (this.steadyRacePaceBuilder_ == null) {
         this.steadyRacePace_ = null;
         this.onChanged();
      } else {
         this.steadyRacePaceBuilder_.clear();
      }

      this.bitField0_ &= -33;
      return this;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder clearStravaSegmentTarget() {
      if (this.stravaSegmentTargetBuilder_ == null) {
         this.stravaSegmentTarget_ = null;
         this.onChanged();
      } else {
         this.stravaSegmentTargetBuilder_.clear();
      }

      this.bitField0_ &= -65;
      return this;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder clearTargetType() {
      this.bitField0_ &= -2;
      this.targetType_ = 0;
      this.onChanged();
      return this;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder clearVolumeTarget() {
      if (this.volumeTargetBuilder_ == null) {
         this.volumeTarget_ = null;
         this.onChanged();
      } else {
         this.volumeTargetBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder clone() {
      return (TrainingSessionTarget$PbExerciseTarget$Builder)super.clone();
   }

   public TrainingSessionTarget$PbExerciseTarget getDefaultInstanceForType() {
      return TrainingSessionTarget$PbExerciseTarget.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return TrainingSessionTarget.c();
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
      this.bitField0_ |= 8;
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
      this.bitField0_ |= 16;
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
      this.bitField0_ |= 32;
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
      this.bitField0_ |= 64;
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
      this.bitField0_ |= 4;
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

   public boolean hasPhases() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasRoute() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
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

   public boolean hasSteadyRacePace() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStravaSegmentTarget() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
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
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return TrainingSessionTarget.d().ensureFieldAccessorsInitialized(TrainingSessionTarget$PbExerciseTarget.class, TrainingSessionTarget$PbExerciseTarget$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasTargetType()) {
         var2 = var1;
      } else {
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

         if (this.hasStravaSegmentTarget()) {
            var2 = var1;
            if (!this.getStravaSegmentTarget().isInitialized()) {
               return var2;
            }
         }

         var2 = true;
      }

      return var2;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      TrainingSessionTarget$PbExerciseTarget var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (TrainingSessionTarget$PbExerciseTarget)TrainingSessionTarget$PbExerciseTarget.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (TrainingSessionTarget$PbExerciseTarget)var10.getUnfinishedMessage();
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

   public TrainingSessionTarget$PbExerciseTarget$Builder mergeFrom(Message var1) {
      TrainingSessionTarget$PbExerciseTarget$Builder var2;
      if (var1 instanceof TrainingSessionTarget$PbExerciseTarget) {
         var2 = this.mergeFrom((TrainingSessionTarget$PbExerciseTarget)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder mergeFrom(TrainingSessionTarget$PbExerciseTarget var1) {
      if (var1 != TrainingSessionTarget$PbExerciseTarget.getDefaultInstance()) {
         if (var1.hasTargetType()) {
            this.setTargetType(var1.getTargetType());
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

         if (var1.hasStravaSegmentTarget()) {
            this.mergeStravaSegmentTarget(var1.getStravaSegmentTarget());
         }

         this.mergeUnknownFields(TrainingSessionTarget$PbExerciseTarget.a(var1));
         this.onChanged();
      }

      return this;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder mergePhases(ExercisePhase$PbPhases var1) {
      if (this.phasesBuilder_ == null) {
         if ((this.bitField0_ & 8) == 8 && this.phases_ != null && this.phases_ != ExercisePhase$PbPhases.getDefaultInstance()) {
            this.phases_ = ExercisePhase$PbPhases.newBuilder(this.phases_).mergeFrom(var1).buildPartial();
         } else {
            this.phases_ = var1;
         }

         this.onChanged();
      } else {
         this.phasesBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder mergeRoute(Structures$PbRouteId var1) {
      if (this.routeBuilder_ == null) {
         if ((this.bitField0_ & 16) == 16 && this.route_ != null && this.route_ != Structures$PbRouteId.getDefaultInstance()) {
            this.route_ = Structures$PbRouteId.newBuilder(this.route_).mergeFrom(var1).buildPartial();
         } else {
            this.route_ = var1;
         }

         this.onChanged();
      } else {
         this.routeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder mergeSportId(Structures$PbSportIdentifier var1) {
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

   public TrainingSessionTarget$PbExerciseTarget$Builder mergeSteadyRacePace(TrainingSessionTarget$PbSteadyRacePace var1) {
      if (this.steadyRacePaceBuilder_ == null) {
         if ((this.bitField0_ & 32) == 32 && this.steadyRacePace_ != null && this.steadyRacePace_ != TrainingSessionTarget$PbSteadyRacePace.getDefaultInstance()) {
            this.steadyRacePace_ = TrainingSessionTarget$PbSteadyRacePace.newBuilder(this.steadyRacePace_).mergeFrom(var1).buildPartial();
         } else {
            this.steadyRacePace_ = var1;
         }

         this.onChanged();
      } else {
         this.steadyRacePaceBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder mergeStravaSegmentTarget(Structures$PbStravaSegmentTarget var1) {
      if (this.stravaSegmentTargetBuilder_ == null) {
         if ((this.bitField0_ & 64) == 64 && this.stravaSegmentTarget_ != null && this.stravaSegmentTarget_ != Structures$PbStravaSegmentTarget.getDefaultInstance()) {
            this.stravaSegmentTarget_ = Structures$PbStravaSegmentTarget.newBuilder(this.stravaSegmentTarget_).mergeFrom(var1).buildPartial();
         } else {
            this.stravaSegmentTarget_ = var1;
         }

         this.onChanged();
      } else {
         this.stravaSegmentTargetBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public final TrainingSessionTarget$PbExerciseTarget$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (TrainingSessionTarget$PbExerciseTarget$Builder)super.mergeUnknownFields(var1);
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder mergeVolumeTarget(Structures$PbVolumeTarget var1) {
      if (this.volumeTargetBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.volumeTarget_ != null && this.volumeTarget_ != Structures$PbVolumeTarget.getDefaultInstance()) {
            this.volumeTarget_ = Structures$PbVolumeTarget.newBuilder(this.volumeTarget_).mergeFrom(var1).buildPartial();
         } else {
            this.volumeTarget_ = var1;
         }

         this.onChanged();
      } else {
         this.volumeTargetBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder setField(FieldDescriptor var1, Object var2) {
      return (TrainingSessionTarget$PbExerciseTarget$Builder)super.setField(var1, var2);
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder setPhases(ExercisePhase$PbPhases$Builder var1) {
      if (this.phasesBuilder_ == null) {
         this.phases_ = var1.build();
         this.onChanged();
      } else {
         this.phasesBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8;
      return this;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder setPhases(ExercisePhase$PbPhases var1) {
      if (this.phasesBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.phases_ = var1;
         this.onChanged();
      } else {
         this.phasesBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (TrainingSessionTarget$PbExerciseTarget$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder setRoute(Structures$PbRouteId$Builder var1) {
      if (this.routeBuilder_ == null) {
         this.route_ = var1.build();
         this.onChanged();
      } else {
         this.routeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 16;
      return this;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder setRoute(Structures$PbRouteId var1) {
      if (this.routeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.route_ = var1;
         this.onChanged();
      } else {
         this.routeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 16;
      return this;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder setSportId(Structures$PbSportIdentifier$Builder var1) {
      if (this.sportIdBuilder_ == null) {
         this.sportId_ = var1.build();
         this.onChanged();
      } else {
         this.sportIdBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder setSportId(Structures$PbSportIdentifier var1) {
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

   public TrainingSessionTarget$PbExerciseTarget$Builder setSteadyRacePace(TrainingSessionTarget$PbSteadyRacePace$Builder var1) {
      if (this.steadyRacePaceBuilder_ == null) {
         this.steadyRacePace_ = var1.build();
         this.onChanged();
      } else {
         this.steadyRacePaceBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 32;
      return this;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder setSteadyRacePace(TrainingSessionTarget$PbSteadyRacePace var1) {
      if (this.steadyRacePaceBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.steadyRacePace_ = var1;
         this.onChanged();
      } else {
         this.steadyRacePaceBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder setStravaSegmentTarget(Structures$PbStravaSegmentTarget$Builder var1) {
      if (this.stravaSegmentTargetBuilder_ == null) {
         this.stravaSegmentTarget_ = var1.build();
         this.onChanged();
      } else {
         this.stravaSegmentTargetBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 64;
      return this;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder setStravaSegmentTarget(Structures$PbStravaSegmentTarget var1) {
      if (this.stravaSegmentTargetBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.stravaSegmentTarget_ = var1;
         this.onChanged();
      } else {
         this.stravaSegmentTargetBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 64;
      return this;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder setTargetType(Types$PbExerciseTargetType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.targetType_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public final TrainingSessionTarget$PbExerciseTarget$Builder setUnknownFields(UnknownFieldSet var1) {
      return (TrainingSessionTarget$PbExerciseTarget$Builder)super.setUnknownFields(var1);
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder setVolumeTarget(Structures$PbVolumeTarget$Builder var1) {
      if (this.volumeTargetBuilder_ == null) {
         this.volumeTarget_ = var1.build();
         this.onChanged();
      } else {
         this.volumeTargetBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder setVolumeTarget(Structures$PbVolumeTarget var1) {
      if (this.volumeTargetBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.volumeTarget_ = var1;
         this.onChanged();
      } else {
         this.volumeTargetBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }
}
