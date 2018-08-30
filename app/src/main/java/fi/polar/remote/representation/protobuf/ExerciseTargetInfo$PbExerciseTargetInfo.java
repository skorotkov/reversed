package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.InputStream;

public final class ExerciseTargetInfo$PbExerciseTargetInfo extends GeneratedMessageV3 implements ExerciseTargetInfo$PbExerciseTargetInfoOrBuilder {
   private static final ExerciseTargetInfo$PbExerciseTargetInfo DEFAULT_INSTANCE = new ExerciseTargetInfo$PbExerciseTargetInfo();
   public static final int END_TIME_FIELD_NUMBER = 5;
   public static final int INDEX_FIELD_NUMBER = 2;
   public static final int NAME_FIELD_NUMBER = 3;
   @Deprecated
   public static final Parser PARSER = new ExerciseTargetInfo$PbExerciseTargetInfo$1();
   public static final int PHASES_FIELD_NUMBER = 8;
   public static final int ROUTE_FIELD_NUMBER = 9;
   public static final int SPORT_ID_FIELD_NUMBER = 6;
   public static final int STEADY_RACE_PACE_FIELD_NUMBER = 10;
   public static final int STEADY_RACE_PACE_RESULT_FIELD_NUMBER = 11;
   public static final int STRAVA_SEGMENT_TARGET_FIELD_NUMBER = 12;
   public static final int TARGET_REACHED_FIELD_NUMBER = 4;
   public static final int TARGET_TYPE_FIELD_NUMBER = 1;
   public static final int VOLUME_TARGET_FIELD_NUMBER = 7;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private Types$PbDuration endTime_;
   private int index_;
   private byte memoizedIsInitialized;
   private Structures$PbOneLineText name_;
   private ExercisePhase$PbPhases phases_;
   private Structures$PbRouteId route_;
   private Structures$PbSportIdentifier sportId_;
   private ExerciseTargetInfo$PbSteadyRacePaceResult steadyRacePaceResult_;
   private TrainingSessionTarget$PbSteadyRacePace steadyRacePace_;
   private Structures$PbStravaSegmentTarget stravaSegmentTarget_;
   private boolean targetReached_;
   private int targetType_;
   private Structures$PbVolumeTarget volumeTarget_;

   private ExerciseTargetInfo$PbExerciseTargetInfo() {
      this.memoizedIsInitialized = (byte)-1;
      this.targetType_ = 0;
      this.index_ = 0;
      this.targetReached_ = false;
   }

   private ExerciseTargetInfo$PbExerciseTargetInfo(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseTargetInfo$PbExerciseTargetInfo(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseTargetInfo$1 var3) {
      this(var1, var2);
   }

   private ExerciseTargetInfo$PbExerciseTargetInfo(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseTargetInfo$PbExerciseTargetInfo(Builder var1, ExerciseTargetInfo$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(ExerciseTargetInfo$PbExerciseTargetInfo var0, int var1) {
      var0.targetType_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExerciseTargetInfo$PbExerciseTargetInfo var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static ExercisePhase$PbPhases a(ExerciseTargetInfo$PbExerciseTargetInfo var0, ExercisePhase$PbPhases var1) {
      var0.phases_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseTargetInfo$PbSteadyRacePaceResult a(ExerciseTargetInfo$PbExerciseTargetInfo var0, ExerciseTargetInfo$PbSteadyRacePaceResult var1) {
      var0.steadyRacePaceResult_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbOneLineText a(ExerciseTargetInfo$PbExerciseTargetInfo var0, Structures$PbOneLineText var1) {
      var0.name_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbRouteId a(ExerciseTargetInfo$PbExerciseTargetInfo var0, Structures$PbRouteId var1) {
      var0.route_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbSportIdentifier a(ExerciseTargetInfo$PbExerciseTargetInfo var0, Structures$PbSportIdentifier var1) {
      var0.sportId_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbStravaSegmentTarget a(ExerciseTargetInfo$PbExerciseTargetInfo var0, Structures$PbStravaSegmentTarget var1) {
      var0.stravaSegmentTarget_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbVolumeTarget a(ExerciseTargetInfo$PbExerciseTargetInfo var0, Structures$PbVolumeTarget var1) {
      var0.volumeTarget_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static TrainingSessionTarget$PbSteadyRacePace a(ExerciseTargetInfo$PbExerciseTargetInfo var0, TrainingSessionTarget$PbSteadyRacePace var1) {
      var0.steadyRacePace_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration a(ExerciseTargetInfo$PbExerciseTargetInfo var0, Types$PbDuration var1) {
      var0.endTime_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean a(ExerciseTargetInfo$PbExerciseTargetInfo var0, boolean var1) {
      var0.targetReached_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(ExerciseTargetInfo$PbExerciseTargetInfo var0, int var1) {
      var0.index_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(ExerciseTargetInfo$PbExerciseTargetInfo var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static ExerciseTargetInfo$PbExerciseTargetInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseTargetInfo.c();
   }

   public static ExerciseTargetInfo$PbExerciseTargetInfo$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseTargetInfo$PbExerciseTargetInfo$Builder newBuilder(ExerciseTargetInfo$PbExerciseTargetInfo var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseTargetInfo$PbExerciseTargetInfo parseDelimitedFrom(InputStream var0) {
      return (ExerciseTargetInfo$PbExerciseTargetInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseTargetInfo$PbExerciseTargetInfo parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseTargetInfo$PbExerciseTargetInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseTargetInfo$PbExerciseTargetInfo parseFrom(ByteString var0) {
      return (ExerciseTargetInfo$PbExerciseTargetInfo)PARSER.parseFrom(var0);
   }

   public static ExerciseTargetInfo$PbExerciseTargetInfo parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseTargetInfo$PbExerciseTargetInfo)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseTargetInfo$PbExerciseTargetInfo parseFrom(CodedInputStream var0) {
      return (ExerciseTargetInfo$PbExerciseTargetInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseTargetInfo$PbExerciseTargetInfo parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseTargetInfo$PbExerciseTargetInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseTargetInfo$PbExerciseTargetInfo parseFrom(InputStream var0) {
      return (ExerciseTargetInfo$PbExerciseTargetInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseTargetInfo$PbExerciseTargetInfo parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseTargetInfo$PbExerciseTargetInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseTargetInfo$PbExerciseTargetInfo parseFrom(byte[] var0) {
      return (ExerciseTargetInfo$PbExerciseTargetInfo)PARSER.parseFrom(var0);
   }

   public static ExerciseTargetInfo$PbExerciseTargetInfo parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseTargetInfo$PbExerciseTargetInfo)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseTargetInfo$PbExerciseTargetInfo)) {
            var2 = super.equals(var1);
         } else {
            ExerciseTargetInfo$PbExerciseTargetInfo var5 = (ExerciseTargetInfo$PbExerciseTargetInfo)var1;
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

            if (var4 && this.hasIndex() == var5.hasIndex()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasIndex()) {
               if (var3 && this.getIndex() == var5.getIndex()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasName() == var5.hasName()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasName()) {
               if (var3 && this.getName().equals(var5.getName())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTargetReached() == var5.hasTargetReached()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasTargetReached()) {
               if (var4 && this.getTargetReached() == var5.getTargetReached()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasEndTime() == var5.hasEndTime()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasEndTime()) {
               if (var3 && this.getEndTime().equals(var5.getEndTime())) {
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
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasVolumeTarget()) {
               if (var4 && this.getVolumeTarget().equals(var5.getVolumeTarget())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasPhases() == var5.hasPhases()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasPhases()) {
               if (var4 && this.getPhases().equals(var5.getPhases())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasRoute() == var5.hasRoute()) {
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
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSteadyRacePace()) {
               if (var4 && this.getSteadyRacePace().equals(var5.getSteadyRacePace())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasSteadyRacePaceResult() == var5.hasSteadyRacePaceResult()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSteadyRacePaceResult()) {
               if (var4 && this.getSteadyRacePaceResult().equals(var5.getSteadyRacePaceResult())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasStravaSegmentTarget() == var5.hasStravaSegmentTarget()) {
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

   public ExerciseTargetInfo$PbExerciseTargetInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Types$PbDuration getEndTime() {
      Types$PbDuration var1;
      if (this.endTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.endTime_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getEndTimeOrBuilder() {
      Types$PbDuration var1;
      if (this.endTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.endTime_;
      }

      return var1;
   }

   public int getIndex() {
      return this.index_;
   }

   public Structures$PbOneLineText getName() {
      Structures$PbOneLineText var1;
      if (this.name_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.name_;
      }

      return var1;
   }

   public Structures$PbOneLineTextOrBuilder getNameOrBuilder() {
      Structures$PbOneLineText var1;
      if (this.name_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.name_;
      }

      return var1;
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
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeEnumSize(1, this.targetType_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(2, this.index_);
         }

         var1 = var2;
         if ((this.bitField0_ & 4) == 4) {
            var1 = var2 + CodedOutputStream.computeMessageSize(3, this.getName());
         }

         var2 = var1;
         if ((this.bitField0_ & 8) == 8) {
            var2 = var1 + CodedOutputStream.computeBoolSize(4, this.targetReached_);
         }

         var1 = var2;
         if ((this.bitField0_ & 16) == 16) {
            var1 = var2 + CodedOutputStream.computeMessageSize(5, this.getEndTime());
         }

         var2 = var1;
         if ((this.bitField0_ & 32) == 32) {
            var2 = var1 + CodedOutputStream.computeMessageSize(6, this.getSportId());
         }

         var1 = var2;
         if ((this.bitField0_ & 64) == 64) {
            var1 = var2 + CodedOutputStream.computeMessageSize(7, this.getVolumeTarget());
         }

         var2 = var1;
         if ((this.bitField0_ & 128) == 128) {
            var2 = var1 + CodedOutputStream.computeMessageSize(8, this.getPhases());
         }

         var1 = var2;
         if ((this.bitField0_ & 256) == 256) {
            var1 = var2 + CodedOutputStream.computeMessageSize(9, this.getRoute());
         }

         var2 = var1;
         if ((this.bitField0_ & 512) == 512) {
            var2 = var1 + CodedOutputStream.computeMessageSize(10, this.getSteadyRacePace());
         }

         var1 = var2;
         if ((this.bitField0_ & 1024) == 1024) {
            var1 = var2 + CodedOutputStream.computeMessageSize(11, this.getSteadyRacePaceResult());
         }

         var2 = var1;
         if ((this.bitField0_ & 2048) == 2048) {
            var2 = var1 + CodedOutputStream.computeMessageSize(12, this.getStravaSegmentTarget());
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

   public ExerciseTargetInfo$PbSteadyRacePaceResult getSteadyRacePaceResult() {
      ExerciseTargetInfo$PbSteadyRacePaceResult var1;
      if (this.steadyRacePaceResult_ == null) {
         var1 = ExerciseTargetInfo$PbSteadyRacePaceResult.getDefaultInstance();
      } else {
         var1 = this.steadyRacePaceResult_;
      }

      return var1;
   }

   public ExerciseTargetInfo$PbSteadyRacePaceResultOrBuilder getSteadyRacePaceResultOrBuilder() {
      ExerciseTargetInfo$PbSteadyRacePaceResult var1;
      if (this.steadyRacePaceResult_ == null) {
         var1 = ExerciseTargetInfo$PbSteadyRacePaceResult.getDefaultInstance();
      } else {
         var1 = this.steadyRacePaceResult_;
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
         if (this.hasIndex()) {
            var3 = (var1 * 37 + 2) * 53 + this.getIndex();
         }

         var2 = var3;
         if (this.hasName()) {
            var2 = (var3 * 37 + 3) * 53 + this.getName().hashCode();
         }

         var1 = var2;
         if (this.hasTargetReached()) {
            var1 = (var2 * 37 + 4) * 53 + Internal.hashBoolean(this.getTargetReached());
         }

         var3 = var1;
         if (this.hasEndTime()) {
            var3 = (var1 * 37 + 5) * 53 + this.getEndTime().hashCode();
         }

         var2 = var3;
         if (this.hasSportId()) {
            var2 = (var3 * 37 + 6) * 53 + this.getSportId().hashCode();
         }

         var1 = var2;
         if (this.hasVolumeTarget()) {
            var1 = (var2 * 37 + 7) * 53 + this.getVolumeTarget().hashCode();
         }

         var3 = var1;
         if (this.hasPhases()) {
            var3 = (var1 * 37 + 8) * 53 + this.getPhases().hashCode();
         }

         var2 = var3;
         if (this.hasRoute()) {
            var2 = (var3 * 37 + 9) * 53 + this.getRoute().hashCode();
         }

         var1 = var2;
         if (this.hasSteadyRacePace()) {
            var1 = (var2 * 37 + 10) * 53 + this.getSteadyRacePace().hashCode();
         }

         var2 = var1;
         if (this.hasSteadyRacePaceResult()) {
            var2 = (var1 * 37 + 11) * 53 + this.getSteadyRacePaceResult().hashCode();
         }

         var1 = var2;
         if (this.hasStravaSegmentTarget()) {
            var1 = (var2 * 37 + 12) * 53 + this.getStravaSegmentTarget().hashCode();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseTargetInfo.d().ensureFieldAccessorsInitialized(ExerciseTargetInfo$PbExerciseTargetInfo.class, ExerciseTargetInfo$PbExerciseTargetInfo$Builder.class);
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
         } else if (!this.hasIndex()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasName() && !this.getName().isInitialized()) {
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
         } else if (this.hasSteadyRacePaceResult() && !this.getSteadyRacePaceResult().isInitialized()) {
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

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseTargetInfo$PbExerciseTargetInfo$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseTargetInfo$PbExerciseTargetInfo$Builder(var1, (ExerciseTargetInfo$1)null);
   }

   public ExerciseTargetInfo$PbExerciseTargetInfo$Builder toBuilder() {
      ExerciseTargetInfo$PbExerciseTargetInfo$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseTargetInfo$PbExerciseTargetInfo$Builder((ExerciseTargetInfo$1)null);
      } else {
         var1 = (new ExerciseTargetInfo$PbExerciseTargetInfo$Builder((ExerciseTargetInfo$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.targetType_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeUInt32(2, this.index_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getName());
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeBool(4, this.targetReached_);
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeMessage(5, this.getEndTime());
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeMessage(6, this.getSportId());
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeMessage(7, this.getVolumeTarget());
      }

      if ((this.bitField0_ & 128) == 128) {
         var1.writeMessage(8, this.getPhases());
      }

      if ((this.bitField0_ & 256) == 256) {
         var1.writeMessage(9, this.getRoute());
      }

      if ((this.bitField0_ & 512) == 512) {
         var1.writeMessage(10, this.getSteadyRacePace());
      }

      if ((this.bitField0_ & 1024) == 1024) {
         var1.writeMessage(11, this.getSteadyRacePaceResult());
      }

      if ((this.bitField0_ & 2048) == 2048) {
         var1.writeMessage(12, this.getStravaSegmentTarget());
      }

      this.unknownFields.writeTo(var1);
   }
}
