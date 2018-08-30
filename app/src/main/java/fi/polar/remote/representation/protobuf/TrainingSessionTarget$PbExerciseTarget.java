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

public final class TrainingSessionTarget$PbExerciseTarget extends GeneratedMessageV3 implements TrainingSessionTarget$PbExerciseTargetOrBuilder {
   private static final TrainingSessionTarget$PbExerciseTarget DEFAULT_INSTANCE = new TrainingSessionTarget$PbExerciseTarget();
   @Deprecated
   public static final Parser PARSER = new TrainingSessionTarget$PbExerciseTarget$1();
   public static final int PHASES_FIELD_NUMBER = 4;
   public static final int ROUTE_FIELD_NUMBER = 5;
   public static final int SPORT_ID_FIELD_NUMBER = 2;
   public static final int STEADY_RACE_PACE_FIELD_NUMBER = 6;
   public static final int STRAVA_SEGMENT_TARGET_FIELD_NUMBER = 7;
   public static final int TARGET_TYPE_FIELD_NUMBER = 1;
   public static final int VOLUME_TARGET_FIELD_NUMBER = 3;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private ExercisePhase$PbPhases phases_;
   private Structures$PbRouteId route_;
   private Structures$PbSportIdentifier sportId_;
   private TrainingSessionTarget$PbSteadyRacePace steadyRacePace_;
   private Structures$PbStravaSegmentTarget stravaSegmentTarget_;
   private int targetType_;
   private Structures$PbVolumeTarget volumeTarget_;

   private TrainingSessionTarget$PbExerciseTarget() {
      this.memoizedIsInitialized = (byte)-1;
      this.targetType_ = 0;
   }

   private TrainingSessionTarget$PbExerciseTarget(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   TrainingSessionTarget$PbExerciseTarget(CodedInputStream var1, ExtensionRegistryLite var2, TrainingSessionTarget$1 var3) {
      this(var1, var2);
   }

   private TrainingSessionTarget$PbExerciseTarget(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   TrainingSessionTarget$PbExerciseTarget(Builder var1, TrainingSessionTarget$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(TrainingSessionTarget$PbExerciseTarget var0, int var1) {
      var0.targetType_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(TrainingSessionTarget$PbExerciseTarget var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static ExercisePhase$PbPhases a(TrainingSessionTarget$PbExerciseTarget var0, ExercisePhase$PbPhases var1) {
      var0.phases_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbRouteId a(TrainingSessionTarget$PbExerciseTarget var0, Structures$PbRouteId var1) {
      var0.route_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbSportIdentifier a(TrainingSessionTarget$PbExerciseTarget var0, Structures$PbSportIdentifier var1) {
      var0.sportId_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbStravaSegmentTarget a(TrainingSessionTarget$PbExerciseTarget var0, Structures$PbStravaSegmentTarget var1) {
      var0.stravaSegmentTarget_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbVolumeTarget a(TrainingSessionTarget$PbExerciseTarget var0, Structures$PbVolumeTarget var1) {
      var0.volumeTarget_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static TrainingSessionTarget$PbSteadyRacePace a(TrainingSessionTarget$PbExerciseTarget var0, TrainingSessionTarget$PbSteadyRacePace var1) {
      var0.steadyRacePace_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(TrainingSessionTarget$PbExerciseTarget var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static TrainingSessionTarget$PbExerciseTarget getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return TrainingSessionTarget.c();
   }

   public static TrainingSessionTarget$PbExerciseTarget$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static TrainingSessionTarget$PbExerciseTarget$Builder newBuilder(TrainingSessionTarget$PbExerciseTarget var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static TrainingSessionTarget$PbExerciseTarget parseDelimitedFrom(InputStream var0) {
      return (TrainingSessionTarget$PbExerciseTarget)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static TrainingSessionTarget$PbExerciseTarget parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (TrainingSessionTarget$PbExerciseTarget)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static TrainingSessionTarget$PbExerciseTarget parseFrom(ByteString var0) {
      return (TrainingSessionTarget$PbExerciseTarget)PARSER.parseFrom(var0);
   }

   public static TrainingSessionTarget$PbExerciseTarget parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (TrainingSessionTarget$PbExerciseTarget)PARSER.parseFrom(var0, var1);
   }

   public static TrainingSessionTarget$PbExerciseTarget parseFrom(CodedInputStream var0) {
      return (TrainingSessionTarget$PbExerciseTarget)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static TrainingSessionTarget$PbExerciseTarget parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (TrainingSessionTarget$PbExerciseTarget)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static TrainingSessionTarget$PbExerciseTarget parseFrom(InputStream var0) {
      return (TrainingSessionTarget$PbExerciseTarget)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static TrainingSessionTarget$PbExerciseTarget parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (TrainingSessionTarget$PbExerciseTarget)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static TrainingSessionTarget$PbExerciseTarget parseFrom(byte[] var0) {
      return (TrainingSessionTarget$PbExerciseTarget)PARSER.parseFrom(var0);
   }

   public static TrainingSessionTarget$PbExerciseTarget parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (TrainingSessionTarget$PbExerciseTarget)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof TrainingSessionTarget$PbExerciseTarget)) {
            var2 = super.equals(var1);
         } else {
            TrainingSessionTarget$PbExerciseTarget var5 = (TrainingSessionTarget$PbExerciseTarget)var1;
            boolean var3;
            if (this.hasTargetType() == var5.hasTargetType()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasTargetType()) {
               if (var3 && this.targetType_ == var5.targetType_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSportId() == var5.hasSportId()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSportId()) {
               if (var3 && this.getSportId().equals(var5.getSportId())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasVolumeTarget() == var5.hasVolumeTarget()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasVolumeTarget()) {
               if (var3 && this.getVolumeTarget().equals(var5.getVolumeTarget())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasPhases() == var5.hasPhases()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasPhases()) {
               if (var3 && this.getPhases().equals(var5.getPhases())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasRoute() == var5.hasRoute()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasRoute()) {
               if (var3 && this.getRoute().equals(var5.getRoute())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSteadyRacePace() == var5.hasSteadyRacePace()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSteadyRacePace()) {
               if (var3 && this.getSteadyRacePace().equals(var5.getSteadyRacePace())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasStravaSegmentTarget() == var5.hasStravaSegmentTarget()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasStravaSegmentTarget()) {
               if (var4 && this.getStravaSegmentTarget().equals(var5.getStravaSegmentTarget())) {
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

   public TrainingSessionTarget$PbExerciseTarget getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public ExercisePhase$PbPhases getPhases() {
      ExercisePhase$PbPhases var1;
      if (this.phases_ == null) {
         var1 = ExercisePhase$PbPhases.getDefaultInstance();
      } else {
         var1 = this.phases_;
      }

      return var1;
   }

   public ExercisePhase$PbPhasesOrBuilder getPhasesOrBuilder() {
      ExercisePhase$PbPhases var1;
      if (this.phases_ == null) {
         var1 = ExercisePhase$PbPhases.getDefaultInstance();
      } else {
         var1 = this.phases_;
      }

      return var1;
   }

   public Structures$PbRouteId getRoute() {
      Structures$PbRouteId var1;
      if (this.route_ == null) {
         var1 = Structures$PbRouteId.getDefaultInstance();
      } else {
         var1 = this.route_;
      }

      return var1;
   }

   public Structures$PbRouteIdOrBuilder getRouteOrBuilder() {
      Structures$PbRouteId var1;
      if (this.route_ == null) {
         var1 = Structures$PbRouteId.getDefaultInstance();
      } else {
         var1 = this.route_;
      }

      return var1;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeEnumSize(1, this.targetType_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeMessageSize(2, this.getSportId());
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeMessageSize(3, this.getVolumeTarget());
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeMessageSize(4, this.getPhases());
         }

         var2 = var1;
         if ((this.bitField0_ & 16) == 16) {
            var2 = var1 + CodedOutputStream.computeMessageSize(5, this.getRoute());
         }

         var1 = var2;
         if ((this.bitField0_ & 32) == 32) {
            var1 = var2 + CodedOutputStream.computeMessageSize(6, this.getSteadyRacePace());
         }

         var2 = var1;
         if ((this.bitField0_ & 64) == 64) {
            var2 = var1 + CodedOutputStream.computeMessageSize(7, this.getStravaSegmentTarget());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public Structures$PbSportIdentifier getSportId() {
      Structures$PbSportIdentifier var1;
      if (this.sportId_ == null) {
         var1 = Structures$PbSportIdentifier.getDefaultInstance();
      } else {
         var1 = this.sportId_;
      }

      return var1;
   }

   public Structures$PbSportIdentifierOrBuilder getSportIdOrBuilder() {
      Structures$PbSportIdentifier var1;
      if (this.sportId_ == null) {
         var1 = Structures$PbSportIdentifier.getDefaultInstance();
      } else {
         var1 = this.sportId_;
      }

      return var1;
   }

   public TrainingSessionTarget$PbSteadyRacePace getSteadyRacePace() {
      TrainingSessionTarget$PbSteadyRacePace var1;
      if (this.steadyRacePace_ == null) {
         var1 = TrainingSessionTarget$PbSteadyRacePace.getDefaultInstance();
      } else {
         var1 = this.steadyRacePace_;
      }

      return var1;
   }

   public TrainingSessionTarget$PbSteadyRacePaceOrBuilder getSteadyRacePaceOrBuilder() {
      TrainingSessionTarget$PbSteadyRacePace var1;
      if (this.steadyRacePace_ == null) {
         var1 = TrainingSessionTarget$PbSteadyRacePace.getDefaultInstance();
      } else {
         var1 = this.steadyRacePace_;
      }

      return var1;
   }

   public Structures$PbStravaSegmentTarget getStravaSegmentTarget() {
      Structures$PbStravaSegmentTarget var1;
      if (this.stravaSegmentTarget_ == null) {
         var1 = Structures$PbStravaSegmentTarget.getDefaultInstance();
      } else {
         var1 = this.stravaSegmentTarget_;
      }

      return var1;
   }

   public Structures$PbStravaSegmentTargetOrBuilder getStravaSegmentTargetOrBuilder() {
      Structures$PbStravaSegmentTarget var1;
      if (this.stravaSegmentTarget_ == null) {
         var1 = Structures$PbStravaSegmentTarget.getDefaultInstance();
      } else {
         var1 = this.stravaSegmentTarget_;
      }

      return var1;
   }

   public Types$PbExerciseTargetType getTargetType() {
      Types$PbExerciseTargetType var1 = Types$PbExerciseTargetType.valueOf(this.targetType_);
      Types$PbExerciseTargetType var2 = var1;
      if (var1 == null) {
         var2 = Types$PbExerciseTargetType.EXERCISE_TARGET_TYPE_FREE;
      }

      return var2;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public Structures$PbVolumeTarget getVolumeTarget() {
      Structures$PbVolumeTarget var1;
      if (this.volumeTarget_ == null) {
         var1 = Structures$PbVolumeTarget.getDefaultInstance();
      } else {
         var1 = this.volumeTarget_;
      }

      return var1;
   }

   public Structures$PbVolumeTargetOrBuilder getVolumeTargetOrBuilder() {
      Structures$PbVolumeTarget var1;
      if (this.volumeTarget_ == null) {
         var1 = Structures$PbVolumeTarget.getDefaultInstance();
      } else {
         var1 = this.volumeTarget_;
      }

      return var1;
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

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.hasTargetType()) {
            var1 = (var2 * 37 + 1) * 53 + this.targetType_;
         }

         int var3 = var1;
         if (this.hasSportId()) {
            var3 = (var1 * 37 + 2) * 53 + this.getSportId().hashCode();
         }

         var2 = var3;
         if (this.hasVolumeTarget()) {
            var2 = (var3 * 37 + 3) * 53 + this.getVolumeTarget().hashCode();
         }

         var1 = var2;
         if (this.hasPhases()) {
            var1 = (var2 * 37 + 4) * 53 + this.getPhases().hashCode();
         }

         var2 = var1;
         if (this.hasRoute()) {
            var2 = (var1 * 37 + 5) * 53 + this.getRoute().hashCode();
         }

         var1 = var2;
         if (this.hasSteadyRacePace()) {
            var1 = (var2 * 37 + 6) * 53 + this.getSteadyRacePace().hashCode();
         }

         var2 = var1;
         if (this.hasStravaSegmentTarget()) {
            var2 = (var1 * 37 + 7) * 53 + this.getStravaSegmentTarget().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return TrainingSessionTarget.d().ensureFieldAccessorsInitialized(TrainingSessionTarget$PbExerciseTarget.class, TrainingSessionTarget$PbExerciseTarget$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasTargetType()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasSportId() && !this.getSportId().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasVolumeTarget() && !this.getVolumeTarget().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasPhases() && !this.getPhases().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasRoute() && !this.getRoute().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasSteadyRacePace() && !this.getSteadyRacePace().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasStravaSegmentTarget() && !this.getStravaSegmentTarget().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder newBuilderForType() {
      return newBuilder();
   }

   protected TrainingSessionTarget$PbExerciseTarget$Builder newBuilderForType(BuilderParent var1) {
      return new TrainingSessionTarget$PbExerciseTarget$Builder(var1, (TrainingSessionTarget$1)null);
   }

   public TrainingSessionTarget$PbExerciseTarget$Builder toBuilder() {
      TrainingSessionTarget$PbExerciseTarget$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new TrainingSessionTarget$PbExerciseTarget$Builder((TrainingSessionTarget$1)null);
      } else {
         var1 = (new TrainingSessionTarget$PbExerciseTarget$Builder((TrainingSessionTarget$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.targetType_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getSportId());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getVolumeTarget());
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeMessage(4, this.getPhases());
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeMessage(5, this.getRoute());
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeMessage(6, this.getSteadyRacePace());
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeMessage(7, this.getStravaSegmentTarget());
      }

      this.unknownFields.writeTo(var1);
   }
}
