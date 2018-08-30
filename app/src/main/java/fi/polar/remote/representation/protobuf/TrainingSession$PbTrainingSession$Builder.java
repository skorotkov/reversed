package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
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

public final class TrainingSession$PbTrainingSession$Builder extends Builder implements TrainingSession$PbTrainingSessionOrBuilder {
   private int benefit_;
   private int bitField0_;
   private int calories_;
   private Object deviceId_;
   private float distance_;
   private SingleFieldBuilderV3 durationBuilder_;
   private Types$PbDuration duration_;
   private SingleFieldBuilderV3 endBuilder_;
   private Types$PbLocalDateTime end_;
   private int exerciseCount_;
   private float feeling_;
   private SingleFieldBuilderV3 heartRateBuilder_;
   private RepeatedFieldBuilderV3 heartRateZoneDurationBuilder_;
   private List heartRateZoneDuration_;
   private TrainingSession$PbSessionHeartRateStatistics heartRate_;
   private double latitude_;
   private double longitude_;
   private Object modelName_;
   private SingleFieldBuilderV3 noteBuilder_;
   private Structures$PbMultiLineText note_;
   private SingleFieldBuilderV3 placeBuilder_;
   private Structures$PbOneLineText place_;
   private SingleFieldBuilderV3 sessionNameBuilder_;
   private Structures$PbOneLineText sessionName_;
   private SingleFieldBuilderV3 sportBuilder_;
   private Structures$PbSportIdentifier sport_;
   private SingleFieldBuilderV3 startBuilder_;
   private Types$PbLocalDateTime start_;
   private SingleFieldBuilderV3 trainingLoadBuilder_;
   private Structures$PbTrainingLoad trainingLoad_;
   private SingleFieldBuilderV3 trainingSessionFavoriteIdBuilder_;
   private Structures$PbTrainingSessionFavoriteId trainingSessionFavoriteId_;
   private SingleFieldBuilderV3 trainingSessionTargetIdBuilder_;
   private Structures$PbTrainingSessionTargetId trainingSessionTargetId_;

   private TrainingSession$PbTrainingSession$Builder() {
      this.start_ = null;
      this.end_ = null;
      this.deviceId_ = "";
      this.modelName_ = "";
      this.duration_ = null;
      this.heartRate_ = null;
      this.heartRateZoneDuration_ = Collections.emptyList();
      this.trainingLoad_ = null;
      this.sessionName_ = null;
      this.note_ = null;
      this.place_ = null;
      this.benefit_ = 1;
      this.sport_ = null;
      this.trainingSessionTargetId_ = null;
      this.trainingSessionFavoriteId_ = null;
      this.maybeForceBuilderInitialization();
   }

   private TrainingSession$PbTrainingSession$Builder(BuilderParent var1) {
      super(var1);
      this.start_ = null;
      this.end_ = null;
      this.deviceId_ = "";
      this.modelName_ = "";
      this.duration_ = null;
      this.heartRate_ = null;
      this.heartRateZoneDuration_ = Collections.emptyList();
      this.trainingLoad_ = null;
      this.sessionName_ = null;
      this.note_ = null;
      this.place_ = null;
      this.benefit_ = 1;
      this.sport_ = null;
      this.trainingSessionTargetId_ = null;
      this.trainingSessionFavoriteId_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   TrainingSession$PbTrainingSession$Builder(BuilderParent var1, TrainingSession$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   TrainingSession$PbTrainingSession$Builder(TrainingSession$1 var1) {
      this();
   }

   private void ensureHeartRateZoneDurationIsMutable() {
      if ((this.bitField0_ & 512) != 512) {
         this.heartRateZoneDuration_ = new ArrayList(this.heartRateZoneDuration_);
         this.bitField0_ |= 512;
      }

   }

   public static final Descriptor getDescriptor() {
      return TrainingSession.c();
   }

   private SingleFieldBuilderV3 getDurationFieldBuilder() {
      if (this.durationBuilder_ == null) {
         this.durationBuilder_ = new SingleFieldBuilderV3(this.getDuration(), this.getParentForChildren(), this.isClean());
         this.duration_ = null;
      }

      return this.durationBuilder_;
   }

   private SingleFieldBuilderV3 getEndFieldBuilder() {
      if (this.endBuilder_ == null) {
         this.endBuilder_ = new SingleFieldBuilderV3(this.getEnd(), this.getParentForChildren(), this.isClean());
         this.end_ = null;
      }

      return this.endBuilder_;
   }

   private SingleFieldBuilderV3 getHeartRateFieldBuilder() {
      if (this.heartRateBuilder_ == null) {
         this.heartRateBuilder_ = new SingleFieldBuilderV3(this.getHeartRate(), this.getParentForChildren(), this.isClean());
         this.heartRate_ = null;
      }

      return this.heartRateBuilder_;
   }

   private RepeatedFieldBuilderV3 getHeartRateZoneDurationFieldBuilder() {
      if (this.heartRateZoneDurationBuilder_ == null) {
         List var1 = this.heartRateZoneDuration_;
         boolean var2;
         if ((this.bitField0_ & 512) == 512) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.heartRateZoneDurationBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.heartRateZoneDuration_ = null;
      }

      return this.heartRateZoneDurationBuilder_;
   }

   private SingleFieldBuilderV3 getNoteFieldBuilder() {
      if (this.noteBuilder_ == null) {
         this.noteBuilder_ = new SingleFieldBuilderV3(this.getNote(), this.getParentForChildren(), this.isClean());
         this.note_ = null;
      }

      return this.noteBuilder_;
   }

   private SingleFieldBuilderV3 getPlaceFieldBuilder() {
      if (this.placeBuilder_ == null) {
         this.placeBuilder_ = new SingleFieldBuilderV3(this.getPlace(), this.getParentForChildren(), this.isClean());
         this.place_ = null;
      }

      return this.placeBuilder_;
   }

   private SingleFieldBuilderV3 getSessionNameFieldBuilder() {
      if (this.sessionNameBuilder_ == null) {
         this.sessionNameBuilder_ = new SingleFieldBuilderV3(this.getSessionName(), this.getParentForChildren(), this.isClean());
         this.sessionName_ = null;
      }

      return this.sessionNameBuilder_;
   }

   private SingleFieldBuilderV3 getSportFieldBuilder() {
      if (this.sportBuilder_ == null) {
         this.sportBuilder_ = new SingleFieldBuilderV3(this.getSport(), this.getParentForChildren(), this.isClean());
         this.sport_ = null;
      }

      return this.sportBuilder_;
   }

   private SingleFieldBuilderV3 getStartFieldBuilder() {
      if (this.startBuilder_ == null) {
         this.startBuilder_ = new SingleFieldBuilderV3(this.getStart(), this.getParentForChildren(), this.isClean());
         this.start_ = null;
      }

      return this.startBuilder_;
   }

   private SingleFieldBuilderV3 getTrainingLoadFieldBuilder() {
      if (this.trainingLoadBuilder_ == null) {
         this.trainingLoadBuilder_ = new SingleFieldBuilderV3(this.getTrainingLoad(), this.getParentForChildren(), this.isClean());
         this.trainingLoad_ = null;
      }

      return this.trainingLoadBuilder_;
   }

   private SingleFieldBuilderV3 getTrainingSessionFavoriteIdFieldBuilder() {
      if (this.trainingSessionFavoriteIdBuilder_ == null) {
         this.trainingSessionFavoriteIdBuilder_ = new SingleFieldBuilderV3(this.getTrainingSessionFavoriteId(), this.getParentForChildren(), this.isClean());
         this.trainingSessionFavoriteId_ = null;
      }

      return this.trainingSessionFavoriteIdBuilder_;
   }

   private SingleFieldBuilderV3 getTrainingSessionTargetIdFieldBuilder() {
      if (this.trainingSessionTargetIdBuilder_ == null) {
         this.trainingSessionTargetIdBuilder_ = new SingleFieldBuilderV3(this.getTrainingSessionTargetId(), this.getParentForChildren(), this.isClean());
         this.trainingSessionTargetId_ = null;
      }

      return this.trainingSessionTargetIdBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (TrainingSession$PbTrainingSession.b()) {
         this.getStartFieldBuilder();
         this.getEndFieldBuilder();
         this.getDurationFieldBuilder();
         this.getHeartRateFieldBuilder();
         this.getHeartRateZoneDurationFieldBuilder();
         this.getTrainingLoadFieldBuilder();
         this.getSessionNameFieldBuilder();
         this.getNoteFieldBuilder();
         this.getPlaceFieldBuilder();
         this.getSportFieldBuilder();
         this.getTrainingSessionTargetIdFieldBuilder();
         this.getTrainingSessionFavoriteIdFieldBuilder();
      }

   }

   public TrainingSession$PbTrainingSession$Builder addAllHeartRateZoneDuration(Iterable var1) {
      if (this.heartRateZoneDurationBuilder_ == null) {
         this.ensureHeartRateZoneDurationIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.heartRateZoneDuration_);
         this.onChanged();
      } else {
         this.heartRateZoneDurationBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public TrainingSession$PbTrainingSession$Builder addHeartRateZoneDuration(int var1, Types$PbDuration$Builder var2) {
      if (this.heartRateZoneDurationBuilder_ == null) {
         this.ensureHeartRateZoneDurationIsMutable();
         this.heartRateZoneDuration_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.heartRateZoneDurationBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public TrainingSession$PbTrainingSession$Builder addHeartRateZoneDuration(int var1, Types$PbDuration var2) {
      if (this.heartRateZoneDurationBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureHeartRateZoneDurationIsMutable();
         this.heartRateZoneDuration_.add(var1, var2);
         this.onChanged();
      } else {
         this.heartRateZoneDurationBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public TrainingSession$PbTrainingSession$Builder addHeartRateZoneDuration(Types$PbDuration$Builder var1) {
      if (this.heartRateZoneDurationBuilder_ == null) {
         this.ensureHeartRateZoneDurationIsMutable();
         this.heartRateZoneDuration_.add(var1.build());
         this.onChanged();
      } else {
         this.heartRateZoneDurationBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public TrainingSession$PbTrainingSession$Builder addHeartRateZoneDuration(Types$PbDuration var1) {
      if (this.heartRateZoneDurationBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureHeartRateZoneDurationIsMutable();
         this.heartRateZoneDuration_.add(var1);
         this.onChanged();
      } else {
         this.heartRateZoneDurationBuilder_.addMessage(var1);
      }

      return this;
   }

   public Types$PbDuration$Builder addHeartRateZoneDurationBuilder() {
      return (Types$PbDuration$Builder)this.getHeartRateZoneDurationFieldBuilder().addBuilder(Types$PbDuration.getDefaultInstance());
   }

   public Types$PbDuration$Builder addHeartRateZoneDurationBuilder(int var1) {
      return (Types$PbDuration$Builder)this.getHeartRateZoneDurationFieldBuilder().addBuilder(var1, Types$PbDuration.getDefaultInstance());
   }

   public TrainingSession$PbTrainingSession$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (TrainingSession$PbTrainingSession$Builder)super.addRepeatedField(var1, var2);
   }

   public TrainingSession$PbTrainingSession build() {
      TrainingSession$PbTrainingSession var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public TrainingSession$PbTrainingSession buildPartial() {
      TrainingSession$PbTrainingSession var1 = new TrainingSession$PbTrainingSession(this, (TrainingSession$1)null);
      int var2 = this.bitField0_;
      byte var3;
      if ((var2 & 1) == 1) {
         var3 = 1;
      } else {
         var3 = 0;
      }

      if (this.startBuilder_ == null) {
         TrainingSession$PbTrainingSession.a(var1, this.start_);
      } else {
         TrainingSession$PbTrainingSession.a(var1, (Types$PbLocalDateTime)this.startBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.endBuilder_ == null) {
         TrainingSession$PbTrainingSession.b(var1, this.end_);
      } else {
         TrainingSession$PbTrainingSession.b(var1, (Types$PbLocalDateTime)this.endBuilder_.build());
      }

      int var5 = var4;
      if ((var2 & 4) == 4) {
         var5 = var4 | 4;
      }

      TrainingSession$PbTrainingSession.a(var1, this.exerciseCount_);
      int var6 = var5;
      if ((var2 & 8) == 8) {
         var6 = var5 | 8;
      }

      TrainingSession$PbTrainingSession.a(var1, this.deviceId_);
      var4 = var6;
      if ((var2 & 16) == 16) {
         var4 = var6 | 16;
      }

      TrainingSession$PbTrainingSession.b(var1, this.modelName_);
      var6 = var4;
      if ((var2 & 32) == 32) {
         var6 = var4 | 32;
      }

      if (this.durationBuilder_ == null) {
         TrainingSession$PbTrainingSession.a(var1, this.duration_);
      } else {
         TrainingSession$PbTrainingSession.a(var1, (Types$PbDuration)this.durationBuilder_.build());
      }

      var5 = var6;
      if ((var2 & 64) == 64) {
         var5 = var6 | 64;
      }

      TrainingSession$PbTrainingSession.a(var1, this.distance_);
      var4 = var5;
      if ((var2 & 128) == 128) {
         var4 = var5 | 128;
      }

      TrainingSession$PbTrainingSession.b(var1, this.calories_);
      var6 = var4;
      if ((var2 & 256) == 256) {
         var6 = var4 | 256;
      }

      if (this.heartRateBuilder_ == null) {
         TrainingSession$PbTrainingSession.a(var1, this.heartRate_);
      } else {
         TrainingSession$PbTrainingSession.a(var1, (TrainingSession$PbSessionHeartRateStatistics)this.heartRateBuilder_.build());
      }

      if (this.heartRateZoneDurationBuilder_ == null) {
         if ((this.bitField0_ & 512) == 512) {
            this.heartRateZoneDuration_ = Collections.unmodifiableList(this.heartRateZoneDuration_);
            this.bitField0_ &= -513;
         }

         TrainingSession$PbTrainingSession.a(var1, this.heartRateZoneDuration_);
      } else {
         TrainingSession$PbTrainingSession.a(var1, this.heartRateZoneDurationBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 1024) == 1024) {
         var4 = var6 | 512;
      }

      if (this.trainingLoadBuilder_ == null) {
         TrainingSession$PbTrainingSession.a(var1, this.trainingLoad_);
      } else {
         TrainingSession$PbTrainingSession.a(var1, (Structures$PbTrainingLoad)this.trainingLoadBuilder_.build());
      }

      var6 = var4;
      if ((var2 & 2048) == 2048) {
         var6 = var4 | 1024;
      }

      if (this.sessionNameBuilder_ == null) {
         TrainingSession$PbTrainingSession.a(var1, this.sessionName_);
      } else {
         TrainingSession$PbTrainingSession.a(var1, (Structures$PbOneLineText)this.sessionNameBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 4096) == 4096) {
         var4 = var6 | 2048;
      }

      TrainingSession$PbTrainingSession.b(var1, this.feeling_);
      var6 = var4;
      if ((var2 & 8192) == 8192) {
         var6 = var4 | 4096;
      }

      if (this.noteBuilder_ == null) {
         TrainingSession$PbTrainingSession.a(var1, this.note_);
      } else {
         TrainingSession$PbTrainingSession.a(var1, (Structures$PbMultiLineText)this.noteBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 16384) == 16384) {
         var4 = var6 | 8192;
      }

      if (this.placeBuilder_ == null) {
         TrainingSession$PbTrainingSession.b(var1, this.place_);
      } else {
         TrainingSession$PbTrainingSession.b(var1, (Structures$PbOneLineText)this.placeBuilder_.build());
      }

      var6 = var4;
      if ((var2 & '耀') == 32768) {
         var6 = var4 | 16384;
      }

      TrainingSession$PbTrainingSession.a(var1, this.latitude_);
      var5 = var6;
      if ((var2 & 65536) == 65536) {
         var5 = var6 | '耀';
      }

      TrainingSession$PbTrainingSession.b(var1, this.longitude_);
      var4 = var5;
      if ((var2 & 131072) == 131072) {
         var4 = var5 | 65536;
      }

      TrainingSession$PbTrainingSession.c(var1, this.benefit_);
      var6 = var4;
      if ((var2 & 262144) == 262144) {
         var6 = var4 | 131072;
      }

      if (this.sportBuilder_ == null) {
         TrainingSession$PbTrainingSession.a(var1, this.sport_);
      } else {
         TrainingSession$PbTrainingSession.a(var1, (Structures$PbSportIdentifier)this.sportBuilder_.build());
      }

      var4 = var6;
      if ((var2 & 524288) == 524288) {
         var4 = var6 | 262144;
      }

      if (this.trainingSessionTargetIdBuilder_ == null) {
         TrainingSession$PbTrainingSession.a(var1, this.trainingSessionTargetId_);
      } else {
         TrainingSession$PbTrainingSession.a(var1, (Structures$PbTrainingSessionTargetId)this.trainingSessionTargetIdBuilder_.build());
      }

      var6 = var4;
      if ((1048576 & var2) == 1048576) {
         var6 = var4 | 524288;
      }

      if (this.trainingSessionFavoriteIdBuilder_ == null) {
         TrainingSession$PbTrainingSession.a(var1, this.trainingSessionFavoriteId_);
      } else {
         TrainingSession$PbTrainingSession.a(var1, (Structures$PbTrainingSessionFavoriteId)this.trainingSessionFavoriteIdBuilder_.build());
      }

      TrainingSession$PbTrainingSession.d(var1, var6);
      this.onBuilt();
      return var1;
   }

   public TrainingSession$PbTrainingSession$Builder clear() {
      super.clear();
      if (this.startBuilder_ == null) {
         this.start_ = null;
      } else {
         this.startBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.endBuilder_ == null) {
         this.end_ = null;
      } else {
         this.endBuilder_.clear();
      }

      this.bitField0_ &= -3;
      this.exerciseCount_ = 0;
      this.bitField0_ &= -5;
      this.deviceId_ = "";
      this.bitField0_ &= -9;
      this.modelName_ = "";
      this.bitField0_ &= -17;
      if (this.durationBuilder_ == null) {
         this.duration_ = null;
      } else {
         this.durationBuilder_.clear();
      }

      this.bitField0_ &= -33;
      this.distance_ = 0.0F;
      this.bitField0_ &= -65;
      this.calories_ = 0;
      this.bitField0_ &= -129;
      if (this.heartRateBuilder_ == null) {
         this.heartRate_ = null;
      } else {
         this.heartRateBuilder_.clear();
      }

      this.bitField0_ &= -257;
      if (this.heartRateZoneDurationBuilder_ == null) {
         this.heartRateZoneDuration_ = Collections.emptyList();
         this.bitField0_ &= -513;
      } else {
         this.heartRateZoneDurationBuilder_.clear();
      }

      if (this.trainingLoadBuilder_ == null) {
         this.trainingLoad_ = null;
      } else {
         this.trainingLoadBuilder_.clear();
      }

      this.bitField0_ &= -1025;
      if (this.sessionNameBuilder_ == null) {
         this.sessionName_ = null;
      } else {
         this.sessionNameBuilder_.clear();
      }

      this.bitField0_ &= -2049;
      this.feeling_ = 0.0F;
      this.bitField0_ &= -4097;
      if (this.noteBuilder_ == null) {
         this.note_ = null;
      } else {
         this.noteBuilder_.clear();
      }

      this.bitField0_ &= -8193;
      if (this.placeBuilder_ == null) {
         this.place_ = null;
      } else {
         this.placeBuilder_.clear();
      }

      this.bitField0_ &= -16385;
      this.latitude_ = 0.0D;
      this.bitField0_ &= -32769;
      this.longitude_ = 0.0D;
      this.bitField0_ &= -65537;
      this.benefit_ = 1;
      this.bitField0_ &= -131073;
      if (this.sportBuilder_ == null) {
         this.sport_ = null;
      } else {
         this.sportBuilder_.clear();
      }

      this.bitField0_ &= -262145;
      if (this.trainingSessionTargetIdBuilder_ == null) {
         this.trainingSessionTargetId_ = null;
      } else {
         this.trainingSessionTargetIdBuilder_.clear();
      }

      this.bitField0_ &= -524289;
      if (this.trainingSessionFavoriteIdBuilder_ == null) {
         this.trainingSessionFavoriteId_ = null;
      } else {
         this.trainingSessionFavoriteIdBuilder_.clear();
      }

      this.bitField0_ &= -1048577;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder clearBenefit() {
      this.bitField0_ &= -131073;
      this.benefit_ = 1;
      this.onChanged();
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder clearCalories() {
      this.bitField0_ &= -129;
      this.calories_ = 0;
      this.onChanged();
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder clearDeviceId() {
      this.bitField0_ &= -9;
      this.deviceId_ = TrainingSession$PbTrainingSession.getDefaultInstance().getDeviceId();
      this.onChanged();
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder clearDistance() {
      this.bitField0_ &= -65;
      this.distance_ = 0.0F;
      this.onChanged();
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder clearDuration() {
      if (this.durationBuilder_ == null) {
         this.duration_ = null;
         this.onChanged();
      } else {
         this.durationBuilder_.clear();
      }

      this.bitField0_ &= -33;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder clearEnd() {
      if (this.endBuilder_ == null) {
         this.end_ = null;
         this.onChanged();
      } else {
         this.endBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder clearExerciseCount() {
      this.bitField0_ &= -5;
      this.exerciseCount_ = 0;
      this.onChanged();
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder clearFeeling() {
      this.bitField0_ &= -4097;
      this.feeling_ = 0.0F;
      this.onChanged();
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder clearField(FieldDescriptor var1) {
      return (TrainingSession$PbTrainingSession$Builder)super.clearField(var1);
   }

   public TrainingSession$PbTrainingSession$Builder clearHeartRate() {
      if (this.heartRateBuilder_ == null) {
         this.heartRate_ = null;
         this.onChanged();
      } else {
         this.heartRateBuilder_.clear();
      }

      this.bitField0_ &= -257;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder clearHeartRateZoneDuration() {
      if (this.heartRateZoneDurationBuilder_ == null) {
         this.heartRateZoneDuration_ = Collections.emptyList();
         this.bitField0_ &= -513;
         this.onChanged();
      } else {
         this.heartRateZoneDurationBuilder_.clear();
      }

      return this;
   }

   public TrainingSession$PbTrainingSession$Builder clearLatitude() {
      this.bitField0_ &= -32769;
      this.latitude_ = 0.0D;
      this.onChanged();
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder clearLongitude() {
      this.bitField0_ &= -65537;
      this.longitude_ = 0.0D;
      this.onChanged();
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder clearModelName() {
      this.bitField0_ &= -17;
      this.modelName_ = TrainingSession$PbTrainingSession.getDefaultInstance().getModelName();
      this.onChanged();
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder clearNote() {
      if (this.noteBuilder_ == null) {
         this.note_ = null;
         this.onChanged();
      } else {
         this.noteBuilder_.clear();
      }

      this.bitField0_ &= -8193;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder clearOneof(OneofDescriptor var1) {
      return (TrainingSession$PbTrainingSession$Builder)super.clearOneof(var1);
   }

   public TrainingSession$PbTrainingSession$Builder clearPlace() {
      if (this.placeBuilder_ == null) {
         this.place_ = null;
         this.onChanged();
      } else {
         this.placeBuilder_.clear();
      }

      this.bitField0_ &= -16385;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder clearSessionName() {
      if (this.sessionNameBuilder_ == null) {
         this.sessionName_ = null;
         this.onChanged();
      } else {
         this.sessionNameBuilder_.clear();
      }

      this.bitField0_ &= -2049;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder clearSport() {
      if (this.sportBuilder_ == null) {
         this.sport_ = null;
         this.onChanged();
      } else {
         this.sportBuilder_.clear();
      }

      this.bitField0_ &= -262145;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder clearStart() {
      if (this.startBuilder_ == null) {
         this.start_ = null;
         this.onChanged();
      } else {
         this.startBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder clearTrainingLoad() {
      if (this.trainingLoadBuilder_ == null) {
         this.trainingLoad_ = null;
         this.onChanged();
      } else {
         this.trainingLoadBuilder_.clear();
      }

      this.bitField0_ &= -1025;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder clearTrainingSessionFavoriteId() {
      if (this.trainingSessionFavoriteIdBuilder_ == null) {
         this.trainingSessionFavoriteId_ = null;
         this.onChanged();
      } else {
         this.trainingSessionFavoriteIdBuilder_.clear();
      }

      this.bitField0_ &= -1048577;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder clearTrainingSessionTargetId() {
      if (this.trainingSessionTargetIdBuilder_ == null) {
         this.trainingSessionTargetId_ = null;
         this.onChanged();
      } else {
         this.trainingSessionTargetIdBuilder_.clear();
      }

      this.bitField0_ &= -524289;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder clone() {
      return (TrainingSession$PbTrainingSession$Builder)super.clone();
   }

   public Types$PbExerciseFeedback getBenefit() {
      Types$PbExerciseFeedback var1 = Types$PbExerciseFeedback.valueOf(this.benefit_);
      Types$PbExerciseFeedback var2 = var1;
      if (var1 == null) {
         var2 = Types$PbExerciseFeedback.FEEDBACK_NONE;
      }

      return var2;
   }

   public int getCalories() {
      return this.calories_;
   }

   public TrainingSession$PbTrainingSession getDefaultInstanceForType() {
      return TrainingSession$PbTrainingSession.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return TrainingSession.c();
   }

   public String getDeviceId() {
      Object var1 = this.deviceId_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.deviceId_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getDeviceIdBytes() {
      Object var1 = this.deviceId_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.deviceId_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
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
      this.bitField0_ |= 32;
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

   public Types$PbLocalDateTime getEnd() {
      Types$PbLocalDateTime var1;
      if (this.endBuilder_ == null) {
         if (this.end_ == null) {
            var1 = Types$PbLocalDateTime.getDefaultInstance();
         } else {
            var1 = this.end_;
         }
      } else {
         var1 = (Types$PbLocalDateTime)this.endBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbLocalDateTime$Builder getEndBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Types$PbLocalDateTime$Builder)this.getEndFieldBuilder().getBuilder();
   }

   public Types$PbLocalDateTimeOrBuilder getEndOrBuilder() {
      Object var1;
      if (this.endBuilder_ != null) {
         var1 = (Types$PbLocalDateTimeOrBuilder)this.endBuilder_.getMessageOrBuilder();
      } else if (this.end_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.end_;
      }

      return (Types$PbLocalDateTimeOrBuilder)var1;
   }

   public int getExerciseCount() {
      return this.exerciseCount_;
   }

   public float getFeeling() {
      return this.feeling_;
   }

   public TrainingSession$PbSessionHeartRateStatistics getHeartRate() {
      TrainingSession$PbSessionHeartRateStatistics var1;
      if (this.heartRateBuilder_ == null) {
         if (this.heartRate_ == null) {
            var1 = TrainingSession$PbSessionHeartRateStatistics.getDefaultInstance();
         } else {
            var1 = this.heartRate_;
         }
      } else {
         var1 = (TrainingSession$PbSessionHeartRateStatistics)this.heartRateBuilder_.getMessage();
      }

      return var1;
   }

   public TrainingSession$PbSessionHeartRateStatistics$Builder getHeartRateBuilder() {
      this.bitField0_ |= 256;
      this.onChanged();
      return (TrainingSession$PbSessionHeartRateStatistics$Builder)this.getHeartRateFieldBuilder().getBuilder();
   }

   public TrainingSession$PbSessionHeartRateStatisticsOrBuilder getHeartRateOrBuilder() {
      Object var1;
      if (this.heartRateBuilder_ != null) {
         var1 = (TrainingSession$PbSessionHeartRateStatisticsOrBuilder)this.heartRateBuilder_.getMessageOrBuilder();
      } else if (this.heartRate_ == null) {
         var1 = TrainingSession$PbSessionHeartRateStatistics.getDefaultInstance();
      } else {
         var1 = this.heartRate_;
      }

      return (TrainingSession$PbSessionHeartRateStatisticsOrBuilder)var1;
   }

   public Types$PbDuration getHeartRateZoneDuration(int var1) {
      Types$PbDuration var2;
      if (this.heartRateZoneDurationBuilder_ == null) {
         var2 = (Types$PbDuration)this.heartRateZoneDuration_.get(var1);
      } else {
         var2 = (Types$PbDuration)this.heartRateZoneDurationBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Types$PbDuration$Builder getHeartRateZoneDurationBuilder(int var1) {
      return (Types$PbDuration$Builder)this.getHeartRateZoneDurationFieldBuilder().getBuilder(var1);
   }

   public List getHeartRateZoneDurationBuilderList() {
      return this.getHeartRateZoneDurationFieldBuilder().getBuilderList();
   }

   public int getHeartRateZoneDurationCount() {
      int var1;
      if (this.heartRateZoneDurationBuilder_ == null) {
         var1 = this.heartRateZoneDuration_.size();
      } else {
         var1 = this.heartRateZoneDurationBuilder_.getCount();
      }

      return var1;
   }

   public List getHeartRateZoneDurationList() {
      List var1;
      if (this.heartRateZoneDurationBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.heartRateZoneDuration_);
      } else {
         var1 = this.heartRateZoneDurationBuilder_.getMessageList();
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getHeartRateZoneDurationOrBuilder(int var1) {
      Types$PbDurationOrBuilder var2;
      if (this.heartRateZoneDurationBuilder_ == null) {
         var2 = (Types$PbDurationOrBuilder)this.heartRateZoneDuration_.get(var1);
      } else {
         var2 = (Types$PbDurationOrBuilder)this.heartRateZoneDurationBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getHeartRateZoneDurationOrBuilderList() {
      List var1;
      if (this.heartRateZoneDurationBuilder_ != null) {
         var1 = this.heartRateZoneDurationBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.heartRateZoneDuration_);
      }

      return var1;
   }

   public double getLatitude() {
      return this.latitude_;
   }

   public double getLongitude() {
      return this.longitude_;
   }

   public String getModelName() {
      Object var1 = this.modelName_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.modelName_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getModelNameBytes() {
      Object var1 = this.modelName_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.modelName_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public Structures$PbMultiLineText getNote() {
      Structures$PbMultiLineText var1;
      if (this.noteBuilder_ == null) {
         if (this.note_ == null) {
            var1 = Structures$PbMultiLineText.getDefaultInstance();
         } else {
            var1 = this.note_;
         }
      } else {
         var1 = (Structures$PbMultiLineText)this.noteBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbMultiLineText$Builder getNoteBuilder() {
      this.bitField0_ |= 8192;
      this.onChanged();
      return (Structures$PbMultiLineText$Builder)this.getNoteFieldBuilder().getBuilder();
   }

   public Structures$PbMultiLineTextOrBuilder getNoteOrBuilder() {
      Object var1;
      if (this.noteBuilder_ != null) {
         var1 = (Structures$PbMultiLineTextOrBuilder)this.noteBuilder_.getMessageOrBuilder();
      } else if (this.note_ == null) {
         var1 = Structures$PbMultiLineText.getDefaultInstance();
      } else {
         var1 = this.note_;
      }

      return (Structures$PbMultiLineTextOrBuilder)var1;
   }

   public Structures$PbOneLineText getPlace() {
      Structures$PbOneLineText var1;
      if (this.placeBuilder_ == null) {
         if (this.place_ == null) {
            var1 = Structures$PbOneLineText.getDefaultInstance();
         } else {
            var1 = this.place_;
         }
      } else {
         var1 = (Structures$PbOneLineText)this.placeBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbOneLineText$Builder getPlaceBuilder() {
      this.bitField0_ |= 16384;
      this.onChanged();
      return (Structures$PbOneLineText$Builder)this.getPlaceFieldBuilder().getBuilder();
   }

   public Structures$PbOneLineTextOrBuilder getPlaceOrBuilder() {
      Object var1;
      if (this.placeBuilder_ != null) {
         var1 = (Structures$PbOneLineTextOrBuilder)this.placeBuilder_.getMessageOrBuilder();
      } else if (this.place_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.place_;
      }

      return (Structures$PbOneLineTextOrBuilder)var1;
   }

   public Structures$PbOneLineText getSessionName() {
      Structures$PbOneLineText var1;
      if (this.sessionNameBuilder_ == null) {
         if (this.sessionName_ == null) {
            var1 = Structures$PbOneLineText.getDefaultInstance();
         } else {
            var1 = this.sessionName_;
         }
      } else {
         var1 = (Structures$PbOneLineText)this.sessionNameBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbOneLineText$Builder getSessionNameBuilder() {
      this.bitField0_ |= 2048;
      this.onChanged();
      return (Structures$PbOneLineText$Builder)this.getSessionNameFieldBuilder().getBuilder();
   }

   public Structures$PbOneLineTextOrBuilder getSessionNameOrBuilder() {
      Object var1;
      if (this.sessionNameBuilder_ != null) {
         var1 = (Structures$PbOneLineTextOrBuilder)this.sessionNameBuilder_.getMessageOrBuilder();
      } else if (this.sessionName_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.sessionName_;
      }

      return (Structures$PbOneLineTextOrBuilder)var1;
   }

   public Structures$PbSportIdentifier getSport() {
      Structures$PbSportIdentifier var1;
      if (this.sportBuilder_ == null) {
         if (this.sport_ == null) {
            var1 = Structures$PbSportIdentifier.getDefaultInstance();
         } else {
            var1 = this.sport_;
         }
      } else {
         var1 = (Structures$PbSportIdentifier)this.sportBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbSportIdentifier$Builder getSportBuilder() {
      this.bitField0_ |= 262144;
      this.onChanged();
      return (Structures$PbSportIdentifier$Builder)this.getSportFieldBuilder().getBuilder();
   }

   public Structures$PbSportIdentifierOrBuilder getSportOrBuilder() {
      Object var1;
      if (this.sportBuilder_ != null) {
         var1 = (Structures$PbSportIdentifierOrBuilder)this.sportBuilder_.getMessageOrBuilder();
      } else if (this.sport_ == null) {
         var1 = Structures$PbSportIdentifier.getDefaultInstance();
      } else {
         var1 = this.sport_;
      }

      return (Structures$PbSportIdentifierOrBuilder)var1;
   }

   public Types$PbLocalDateTime getStart() {
      Types$PbLocalDateTime var1;
      if (this.startBuilder_ == null) {
         if (this.start_ == null) {
            var1 = Types$PbLocalDateTime.getDefaultInstance();
         } else {
            var1 = this.start_;
         }
      } else {
         var1 = (Types$PbLocalDateTime)this.startBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbLocalDateTime$Builder getStartBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Types$PbLocalDateTime$Builder)this.getStartFieldBuilder().getBuilder();
   }

   public Types$PbLocalDateTimeOrBuilder getStartOrBuilder() {
      Object var1;
      if (this.startBuilder_ != null) {
         var1 = (Types$PbLocalDateTimeOrBuilder)this.startBuilder_.getMessageOrBuilder();
      } else if (this.start_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.start_;
      }

      return (Types$PbLocalDateTimeOrBuilder)var1;
   }

   public Structures$PbTrainingLoad getTrainingLoad() {
      Structures$PbTrainingLoad var1;
      if (this.trainingLoadBuilder_ == null) {
         if (this.trainingLoad_ == null) {
            var1 = Structures$PbTrainingLoad.getDefaultInstance();
         } else {
            var1 = this.trainingLoad_;
         }
      } else {
         var1 = (Structures$PbTrainingLoad)this.trainingLoadBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbTrainingLoad$Builder getTrainingLoadBuilder() {
      this.bitField0_ |= 1024;
      this.onChanged();
      return (Structures$PbTrainingLoad$Builder)this.getTrainingLoadFieldBuilder().getBuilder();
   }

   public Structures$PbTrainingLoadOrBuilder getTrainingLoadOrBuilder() {
      Object var1;
      if (this.trainingLoadBuilder_ != null) {
         var1 = (Structures$PbTrainingLoadOrBuilder)this.trainingLoadBuilder_.getMessageOrBuilder();
      } else if (this.trainingLoad_ == null) {
         var1 = Structures$PbTrainingLoad.getDefaultInstance();
      } else {
         var1 = this.trainingLoad_;
      }

      return (Structures$PbTrainingLoadOrBuilder)var1;
   }

   public Structures$PbTrainingSessionFavoriteId getTrainingSessionFavoriteId() {
      Structures$PbTrainingSessionFavoriteId var1;
      if (this.trainingSessionFavoriteIdBuilder_ == null) {
         if (this.trainingSessionFavoriteId_ == null) {
            var1 = Structures$PbTrainingSessionFavoriteId.getDefaultInstance();
         } else {
            var1 = this.trainingSessionFavoriteId_;
         }
      } else {
         var1 = (Structures$PbTrainingSessionFavoriteId)this.trainingSessionFavoriteIdBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbTrainingSessionFavoriteId$Builder getTrainingSessionFavoriteIdBuilder() {
      this.bitField0_ |= 1048576;
      this.onChanged();
      return (Structures$PbTrainingSessionFavoriteId$Builder)this.getTrainingSessionFavoriteIdFieldBuilder().getBuilder();
   }

   public Structures$PbTrainingSessionFavoriteIdOrBuilder getTrainingSessionFavoriteIdOrBuilder() {
      Object var1;
      if (this.trainingSessionFavoriteIdBuilder_ != null) {
         var1 = (Structures$PbTrainingSessionFavoriteIdOrBuilder)this.trainingSessionFavoriteIdBuilder_.getMessageOrBuilder();
      } else if (this.trainingSessionFavoriteId_ == null) {
         var1 = Structures$PbTrainingSessionFavoriteId.getDefaultInstance();
      } else {
         var1 = this.trainingSessionFavoriteId_;
      }

      return (Structures$PbTrainingSessionFavoriteIdOrBuilder)var1;
   }

   public Structures$PbTrainingSessionTargetId getTrainingSessionTargetId() {
      Structures$PbTrainingSessionTargetId var1;
      if (this.trainingSessionTargetIdBuilder_ == null) {
         if (this.trainingSessionTargetId_ == null) {
            var1 = Structures$PbTrainingSessionTargetId.getDefaultInstance();
         } else {
            var1 = this.trainingSessionTargetId_;
         }
      } else {
         var1 = (Structures$PbTrainingSessionTargetId)this.trainingSessionTargetIdBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbTrainingSessionTargetId$Builder getTrainingSessionTargetIdBuilder() {
      this.bitField0_ |= 524288;
      this.onChanged();
      return (Structures$PbTrainingSessionTargetId$Builder)this.getTrainingSessionTargetIdFieldBuilder().getBuilder();
   }

   public Structures$PbTrainingSessionTargetIdOrBuilder getTrainingSessionTargetIdOrBuilder() {
      Object var1;
      if (this.trainingSessionTargetIdBuilder_ != null) {
         var1 = (Structures$PbTrainingSessionTargetIdOrBuilder)this.trainingSessionTargetIdBuilder_.getMessageOrBuilder();
      } else if (this.trainingSessionTargetId_ == null) {
         var1 = Structures$PbTrainingSessionTargetId.getDefaultInstance();
      } else {
         var1 = this.trainingSessionTargetId_;
      }

      return (Structures$PbTrainingSessionTargetIdOrBuilder)var1;
   }

   public boolean hasBenefit() {
      boolean var1;
      if ((this.bitField0_ & 131072) == 131072) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasCalories() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDeviceId() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDistance() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDuration() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasEnd() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasExerciseCount() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasFeeling() {
      boolean var1;
      if ((this.bitField0_ & 4096) == 4096) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasHeartRate() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLatitude() {
      boolean var1;
      if ((this.bitField0_ & '耀') == 32768) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLongitude() {
      boolean var1;
      if ((this.bitField0_ & 65536) == 65536) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasModelName() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasNote() {
      boolean var1;
      if ((this.bitField0_ & 8192) == 8192) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPlace() {
      boolean var1;
      if ((this.bitField0_ & 16384) == 16384) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSessionName() {
      boolean var1;
      if ((this.bitField0_ & 2048) == 2048) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSport() {
      boolean var1;
      if ((this.bitField0_ & 262144) == 262144) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStart() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTrainingLoad() {
      boolean var1;
      if ((this.bitField0_ & 1024) == 1024) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTrainingSessionFavoriteId() {
      boolean var1;
      if ((this.bitField0_ & 1048576) == 1048576) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTrainingSessionTargetId() {
      boolean var1;
      if ((this.bitField0_ & 524288) == 524288) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return TrainingSession.d().ensureFieldAccessorsInitialized(TrainingSession$PbTrainingSession.class, TrainingSession$PbTrainingSession$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasStart()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasExerciseCount()) {
            var2 = var1;
            if (this.getStart().isInitialized()) {
               if (this.hasEnd()) {
                  var2 = var1;
                  if (!this.getEnd().isInitialized()) {
                     return var2;
                  }
               }

               if (this.hasSessionName()) {
                  var2 = var1;
                  if (!this.getSessionName().isInitialized()) {
                     return var2;
                  }
               }

               if (this.hasNote()) {
                  var2 = var1;
                  if (!this.getNote().isInitialized()) {
                     return var2;
                  }
               }

               if (this.hasPlace()) {
                  var2 = var1;
                  if (!this.getPlace().isInitialized()) {
                     return var2;
                  }
               }

               if (this.hasSport()) {
                  var2 = var1;
                  if (!this.getSport().isInitialized()) {
                     return var2;
                  }
               }

               if (this.hasTrainingSessionTargetId()) {
                  var2 = var1;
                  if (!this.getTrainingSessionTargetId().isInitialized()) {
                     return var2;
                  }
               }

               if (this.hasTrainingSessionFavoriteId()) {
                  var2 = var1;
                  if (!this.getTrainingSessionFavoriteId().isInitialized()) {
                     return var2;
                  }
               }

               var2 = true;
            }
         }
      }

      return var2;
   }

   public TrainingSession$PbTrainingSession$Builder mergeDuration(Types$PbDuration var1) {
      if (this.durationBuilder_ == null) {
         if ((this.bitField0_ & 32) == 32 && this.duration_ != null && this.duration_ != Types$PbDuration.getDefaultInstance()) {
            this.duration_ = Types$PbDuration.newBuilder(this.duration_).mergeFrom(var1).buildPartial();
         } else {
            this.duration_ = var1;
         }

         this.onChanged();
      } else {
         this.durationBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder mergeEnd(Types$PbLocalDateTime var1) {
      if (this.endBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.end_ != null && this.end_ != Types$PbLocalDateTime.getDefaultInstance()) {
            this.end_ = Types$PbLocalDateTime.newBuilder(this.end_).mergeFrom(var1).buildPartial();
         } else {
            this.end_ = var1;
         }

         this.onChanged();
      } else {
         this.endBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      TrainingSession$PbTrainingSession var13;
      label96: {
         InvalidProtocolBufferException var12;
         TrainingSession$PbTrainingSession var14;
         try {
            var13 = (TrainingSession$PbTrainingSession)TrainingSession$PbTrainingSession.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (TrainingSession$PbTrainingSession)var10.getUnfinishedMessage();
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

   public TrainingSession$PbTrainingSession$Builder mergeFrom(Message var1) {
      TrainingSession$PbTrainingSession$Builder var2;
      if (var1 instanceof TrainingSession$PbTrainingSession) {
         var2 = this.mergeFrom((TrainingSession$PbTrainingSession)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public TrainingSession$PbTrainingSession$Builder mergeFrom(TrainingSession$PbTrainingSession var1) {
      RepeatedFieldBuilderV3 var2 = null;
      if (var1 != TrainingSession$PbTrainingSession.getDefaultInstance()) {
         if (var1.hasStart()) {
            this.mergeStart(var1.getStart());
         }

         if (var1.hasEnd()) {
            this.mergeEnd(var1.getEnd());
         }

         if (var1.hasExerciseCount()) {
            this.setExerciseCount(var1.getExerciseCount());
         }

         if (var1.hasDeviceId()) {
            this.bitField0_ |= 8;
            this.deviceId_ = TrainingSession$PbTrainingSession.a(var1);
            this.onChanged();
         }

         if (var1.hasModelName()) {
            this.bitField0_ |= 16;
            this.modelName_ = TrainingSession$PbTrainingSession.b(var1);
            this.onChanged();
         }

         if (var1.hasDuration()) {
            this.mergeDuration(var1.getDuration());
         }

         if (var1.hasDistance()) {
            this.setDistance(var1.getDistance());
         }

         if (var1.hasCalories()) {
            this.setCalories(var1.getCalories());
         }

         if (var1.hasHeartRate()) {
            this.mergeHeartRate(var1.getHeartRate());
         }

         if (this.heartRateZoneDurationBuilder_ == null) {
            if (!TrainingSession$PbTrainingSession.c(var1).isEmpty()) {
               if (this.heartRateZoneDuration_.isEmpty()) {
                  this.heartRateZoneDuration_ = TrainingSession$PbTrainingSession.c(var1);
                  this.bitField0_ &= -513;
               } else {
                  this.ensureHeartRateZoneDurationIsMutable();
                  this.heartRateZoneDuration_.addAll(TrainingSession$PbTrainingSession.c(var1));
               }

               this.onChanged();
            }
         } else if (!TrainingSession$PbTrainingSession.c(var1).isEmpty()) {
            if (this.heartRateZoneDurationBuilder_.isEmpty()) {
               this.heartRateZoneDurationBuilder_.dispose();
               this.heartRateZoneDurationBuilder_ = null;
               this.heartRateZoneDuration_ = TrainingSession$PbTrainingSession.c(var1);
               this.bitField0_ &= -513;
               if (TrainingSession$PbTrainingSession.c()) {
                  var2 = this.getHeartRateZoneDurationFieldBuilder();
               }

               this.heartRateZoneDurationBuilder_ = var2;
            } else {
               this.heartRateZoneDurationBuilder_.addAllMessages(TrainingSession$PbTrainingSession.c(var1));
            }
         }

         if (var1.hasTrainingLoad()) {
            this.mergeTrainingLoad(var1.getTrainingLoad());
         }

         if (var1.hasSessionName()) {
            this.mergeSessionName(var1.getSessionName());
         }

         if (var1.hasFeeling()) {
            this.setFeeling(var1.getFeeling());
         }

         if (var1.hasNote()) {
            this.mergeNote(var1.getNote());
         }

         if (var1.hasPlace()) {
            this.mergePlace(var1.getPlace());
         }

         if (var1.hasLatitude()) {
            this.setLatitude(var1.getLatitude());
         }

         if (var1.hasLongitude()) {
            this.setLongitude(var1.getLongitude());
         }

         if (var1.hasBenefit()) {
            this.setBenefit(var1.getBenefit());
         }

         if (var1.hasSport()) {
            this.mergeSport(var1.getSport());
         }

         if (var1.hasTrainingSessionTargetId()) {
            this.mergeTrainingSessionTargetId(var1.getTrainingSessionTargetId());
         }

         if (var1.hasTrainingSessionFavoriteId()) {
            this.mergeTrainingSessionFavoriteId(var1.getTrainingSessionFavoriteId());
         }

         this.mergeUnknownFields(TrainingSession$PbTrainingSession.d(var1));
         this.onChanged();
      }

      return this;
   }

   public TrainingSession$PbTrainingSession$Builder mergeHeartRate(TrainingSession$PbSessionHeartRateStatistics var1) {
      if (this.heartRateBuilder_ == null) {
         if ((this.bitField0_ & 256) == 256 && this.heartRate_ != null && this.heartRate_ != TrainingSession$PbSessionHeartRateStatistics.getDefaultInstance()) {
            this.heartRate_ = TrainingSession$PbSessionHeartRateStatistics.newBuilder(this.heartRate_).mergeFrom(var1).buildPartial();
         } else {
            this.heartRate_ = var1;
         }

         this.onChanged();
      } else {
         this.heartRateBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 256;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder mergeNote(Structures$PbMultiLineText var1) {
      if (this.noteBuilder_ == null) {
         if ((this.bitField0_ & 8192) == 8192 && this.note_ != null && this.note_ != Structures$PbMultiLineText.getDefaultInstance()) {
            this.note_ = Structures$PbMultiLineText.newBuilder(this.note_).mergeFrom(var1).buildPartial();
         } else {
            this.note_ = var1;
         }

         this.onChanged();
      } else {
         this.noteBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8192;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder mergePlace(Structures$PbOneLineText var1) {
      if (this.placeBuilder_ == null) {
         if ((this.bitField0_ & 16384) == 16384 && this.place_ != null && this.place_ != Structures$PbOneLineText.getDefaultInstance()) {
            this.place_ = Structures$PbOneLineText.newBuilder(this.place_).mergeFrom(var1).buildPartial();
         } else {
            this.place_ = var1;
         }

         this.onChanged();
      } else {
         this.placeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 16384;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder mergeSessionName(Structures$PbOneLineText var1) {
      if (this.sessionNameBuilder_ == null) {
         if ((this.bitField0_ & 2048) == 2048 && this.sessionName_ != null && this.sessionName_ != Structures$PbOneLineText.getDefaultInstance()) {
            this.sessionName_ = Structures$PbOneLineText.newBuilder(this.sessionName_).mergeFrom(var1).buildPartial();
         } else {
            this.sessionName_ = var1;
         }

         this.onChanged();
      } else {
         this.sessionNameBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2048;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder mergeSport(Structures$PbSportIdentifier var1) {
      if (this.sportBuilder_ == null) {
         if ((this.bitField0_ & 262144) == 262144 && this.sport_ != null && this.sport_ != Structures$PbSportIdentifier.getDefaultInstance()) {
            this.sport_ = Structures$PbSportIdentifier.newBuilder(this.sport_).mergeFrom(var1).buildPartial();
         } else {
            this.sport_ = var1;
         }

         this.onChanged();
      } else {
         this.sportBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 262144;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder mergeStart(Types$PbLocalDateTime var1) {
      if (this.startBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.start_ != null && this.start_ != Types$PbLocalDateTime.getDefaultInstance()) {
            this.start_ = Types$PbLocalDateTime.newBuilder(this.start_).mergeFrom(var1).buildPartial();
         } else {
            this.start_ = var1;
         }

         this.onChanged();
      } else {
         this.startBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder mergeTrainingLoad(Structures$PbTrainingLoad var1) {
      if (this.trainingLoadBuilder_ == null) {
         if ((this.bitField0_ & 1024) == 1024 && this.trainingLoad_ != null && this.trainingLoad_ != Structures$PbTrainingLoad.getDefaultInstance()) {
            this.trainingLoad_ = Structures$PbTrainingLoad.newBuilder(this.trainingLoad_).mergeFrom(var1).buildPartial();
         } else {
            this.trainingLoad_ = var1;
         }

         this.onChanged();
      } else {
         this.trainingLoadBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder mergeTrainingSessionFavoriteId(Structures$PbTrainingSessionFavoriteId var1) {
      if (this.trainingSessionFavoriteIdBuilder_ == null) {
         if ((this.bitField0_ & 1048576) == 1048576 && this.trainingSessionFavoriteId_ != null && this.trainingSessionFavoriteId_ != Structures$PbTrainingSessionFavoriteId.getDefaultInstance()) {
            this.trainingSessionFavoriteId_ = Structures$PbTrainingSessionFavoriteId.newBuilder(this.trainingSessionFavoriteId_).mergeFrom(var1).buildPartial();
         } else {
            this.trainingSessionFavoriteId_ = var1;
         }

         this.onChanged();
      } else {
         this.trainingSessionFavoriteIdBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1048576;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder mergeTrainingSessionTargetId(Structures$PbTrainingSessionTargetId var1) {
      if (this.trainingSessionTargetIdBuilder_ == null) {
         if ((this.bitField0_ & 524288) == 524288 && this.trainingSessionTargetId_ != null && this.trainingSessionTargetId_ != Structures$PbTrainingSessionTargetId.getDefaultInstance()) {
            this.trainingSessionTargetId_ = Structures$PbTrainingSessionTargetId.newBuilder(this.trainingSessionTargetId_).mergeFrom(var1).buildPartial();
         } else {
            this.trainingSessionTargetId_ = var1;
         }

         this.onChanged();
      } else {
         this.trainingSessionTargetIdBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 524288;
      return this;
   }

   public final TrainingSession$PbTrainingSession$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (TrainingSession$PbTrainingSession$Builder)super.mergeUnknownFields(var1);
   }

   public TrainingSession$PbTrainingSession$Builder removeHeartRateZoneDuration(int var1) {
      if (this.heartRateZoneDurationBuilder_ == null) {
         this.ensureHeartRateZoneDurationIsMutable();
         this.heartRateZoneDuration_.remove(var1);
         this.onChanged();
      } else {
         this.heartRateZoneDurationBuilder_.remove(var1);
      }

      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setBenefit(Types$PbExerciseFeedback var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 131072;
         this.benefit_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public TrainingSession$PbTrainingSession$Builder setCalories(int var1) {
      this.bitField0_ |= 128;
      this.calories_ = var1;
      this.onChanged();
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setDeviceId(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 8;
         this.deviceId_ = var1;
         this.onChanged();
         return this;
      }
   }

   public TrainingSession$PbTrainingSession$Builder setDeviceIdBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 8;
         this.deviceId_ = var1;
         this.onChanged();
         return this;
      }
   }

   public TrainingSession$PbTrainingSession$Builder setDistance(float var1) {
      this.bitField0_ |= 64;
      this.distance_ = var1;
      this.onChanged();
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setDuration(Types$PbDuration$Builder var1) {
      if (this.durationBuilder_ == null) {
         this.duration_ = var1.build();
         this.onChanged();
      } else {
         this.durationBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 32;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setDuration(Types$PbDuration var1) {
      if (this.durationBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.duration_ = var1;
         this.onChanged();
      } else {
         this.durationBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 32;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setEnd(Types$PbLocalDateTime$Builder var1) {
      if (this.endBuilder_ == null) {
         this.end_ = var1.build();
         this.onChanged();
      } else {
         this.endBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setEnd(Types$PbLocalDateTime var1) {
      if (this.endBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.end_ = var1;
         this.onChanged();
      } else {
         this.endBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setExerciseCount(int var1) {
      this.bitField0_ |= 4;
      this.exerciseCount_ = var1;
      this.onChanged();
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setFeeling(float var1) {
      this.bitField0_ |= 4096;
      this.feeling_ = var1;
      this.onChanged();
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setField(FieldDescriptor var1, Object var2) {
      return (TrainingSession$PbTrainingSession$Builder)super.setField(var1, var2);
   }

   public TrainingSession$PbTrainingSession$Builder setHeartRate(TrainingSession$PbSessionHeartRateStatistics$Builder var1) {
      if (this.heartRateBuilder_ == null) {
         this.heartRate_ = var1.build();
         this.onChanged();
      } else {
         this.heartRateBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 256;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setHeartRate(TrainingSession$PbSessionHeartRateStatistics var1) {
      if (this.heartRateBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.heartRate_ = var1;
         this.onChanged();
      } else {
         this.heartRateBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 256;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setHeartRateZoneDuration(int var1, Types$PbDuration$Builder var2) {
      if (this.heartRateZoneDurationBuilder_ == null) {
         this.ensureHeartRateZoneDurationIsMutable();
         this.heartRateZoneDuration_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.heartRateZoneDurationBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setHeartRateZoneDuration(int var1, Types$PbDuration var2) {
      if (this.heartRateZoneDurationBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureHeartRateZoneDurationIsMutable();
         this.heartRateZoneDuration_.set(var1, var2);
         this.onChanged();
      } else {
         this.heartRateZoneDurationBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setLatitude(double var1) {
      this.bitField0_ |= 32768;
      this.latitude_ = var1;
      this.onChanged();
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setLongitude(double var1) {
      this.bitField0_ |= 65536;
      this.longitude_ = var1;
      this.onChanged();
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setModelName(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 16;
         this.modelName_ = var1;
         this.onChanged();
         return this;
      }
   }

   public TrainingSession$PbTrainingSession$Builder setModelNameBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 16;
         this.modelName_ = var1;
         this.onChanged();
         return this;
      }
   }

   public TrainingSession$PbTrainingSession$Builder setNote(Structures$PbMultiLineText$Builder var1) {
      if (this.noteBuilder_ == null) {
         this.note_ = var1.build();
         this.onChanged();
      } else {
         this.noteBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8192;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setNote(Structures$PbMultiLineText var1) {
      if (this.noteBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.note_ = var1;
         this.onChanged();
      } else {
         this.noteBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8192;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setPlace(Structures$PbOneLineText$Builder var1) {
      if (this.placeBuilder_ == null) {
         this.place_ = var1.build();
         this.onChanged();
      } else {
         this.placeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 16384;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setPlace(Structures$PbOneLineText var1) {
      if (this.placeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.place_ = var1;
         this.onChanged();
      } else {
         this.placeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 16384;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (TrainingSession$PbTrainingSession$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public TrainingSession$PbTrainingSession$Builder setSessionName(Structures$PbOneLineText$Builder var1) {
      if (this.sessionNameBuilder_ == null) {
         this.sessionName_ = var1.build();
         this.onChanged();
      } else {
         this.sessionNameBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2048;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setSessionName(Structures$PbOneLineText var1) {
      if (this.sessionNameBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.sessionName_ = var1;
         this.onChanged();
      } else {
         this.sessionNameBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2048;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setSport(Structures$PbSportIdentifier$Builder var1) {
      if (this.sportBuilder_ == null) {
         this.sport_ = var1.build();
         this.onChanged();
      } else {
         this.sportBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 262144;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setSport(Structures$PbSportIdentifier var1) {
      if (this.sportBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.sport_ = var1;
         this.onChanged();
      } else {
         this.sportBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 262144;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setStart(Types$PbLocalDateTime$Builder var1) {
      if (this.startBuilder_ == null) {
         this.start_ = var1.build();
         this.onChanged();
      } else {
         this.startBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setStart(Types$PbLocalDateTime var1) {
      if (this.startBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.start_ = var1;
         this.onChanged();
      } else {
         this.startBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setTrainingLoad(Structures$PbTrainingLoad$Builder var1) {
      if (this.trainingLoadBuilder_ == null) {
         this.trainingLoad_ = var1.build();
         this.onChanged();
      } else {
         this.trainingLoadBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setTrainingLoad(Structures$PbTrainingLoad var1) {
      if (this.trainingLoadBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.trainingLoad_ = var1;
         this.onChanged();
      } else {
         this.trainingLoadBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1024;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setTrainingSessionFavoriteId(Structures$PbTrainingSessionFavoriteId$Builder var1) {
      if (this.trainingSessionFavoriteIdBuilder_ == null) {
         this.trainingSessionFavoriteId_ = var1.build();
         this.onChanged();
      } else {
         this.trainingSessionFavoriteIdBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1048576;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setTrainingSessionFavoriteId(Structures$PbTrainingSessionFavoriteId var1) {
      if (this.trainingSessionFavoriteIdBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.trainingSessionFavoriteId_ = var1;
         this.onChanged();
      } else {
         this.trainingSessionFavoriteIdBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1048576;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setTrainingSessionTargetId(Structures$PbTrainingSessionTargetId$Builder var1) {
      if (this.trainingSessionTargetIdBuilder_ == null) {
         this.trainingSessionTargetId_ = var1.build();
         this.onChanged();
      } else {
         this.trainingSessionTargetIdBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 524288;
      return this;
   }

   public TrainingSession$PbTrainingSession$Builder setTrainingSessionTargetId(Structures$PbTrainingSessionTargetId var1) {
      if (this.trainingSessionTargetIdBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.trainingSessionTargetId_ = var1;
         this.onChanged();
      } else {
         this.trainingSessionTargetIdBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 524288;
      return this;
   }

   public final TrainingSession$PbTrainingSession$Builder setUnknownFields(UnknownFieldSet var1) {
      return (TrainingSession$PbTrainingSession$Builder)super.setUnknownFields(var1);
   }
}
