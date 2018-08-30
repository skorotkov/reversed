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

public final class ExerciseRouteSamples$PbExerciseRouteSamples$Builder extends Builder implements ExerciseRouteSamples$PbExerciseRouteSamplesOrBuilder {
   private int bitField0_;
   private List duration_;
   private SingleFieldBuilderV3 firstLocationTimeBuilder_;
   private Types$PbSystemDateTime firstLocationTime_;
   private List gpsAltitude_;
   private List latitude_;
   private List longitude_;
   private List oBSOLETEFix_;
   private RepeatedFieldBuilderV3 oBSOLETEGpsDateTimeBuilder_;
   private List oBSOLETEGpsDateTime_;
   private RepeatedFieldBuilderV3 oBSOLETEGpsOfflineBuilder_;
   private List oBSOLETEGpsOffline_;
   private List satelliteAmount_;

   private ExerciseRouteSamples$PbExerciseRouteSamples$Builder() {
      this.duration_ = Collections.emptyList();
      this.latitude_ = Collections.emptyList();
      this.longitude_ = Collections.emptyList();
      this.gpsAltitude_ = Collections.emptyList();
      this.satelliteAmount_ = Collections.emptyList();
      this.oBSOLETEFix_ = Collections.emptyList();
      this.oBSOLETEGpsOffline_ = Collections.emptyList();
      this.oBSOLETEGpsDateTime_ = Collections.emptyList();
      this.firstLocationTime_ = null;
      this.maybeForceBuilderInitialization();
   }

   private ExerciseRouteSamples$PbExerciseRouteSamples$Builder(BuilderParent var1) {
      super(var1);
      this.duration_ = Collections.emptyList();
      this.latitude_ = Collections.emptyList();
      this.longitude_ = Collections.emptyList();
      this.gpsAltitude_ = Collections.emptyList();
      this.satelliteAmount_ = Collections.emptyList();
      this.oBSOLETEFix_ = Collections.emptyList();
      this.oBSOLETEGpsOffline_ = Collections.emptyList();
      this.oBSOLETEGpsDateTime_ = Collections.emptyList();
      this.firstLocationTime_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseRouteSamples$PbExerciseRouteSamples$Builder(BuilderParent var1, ExerciseRouteSamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseRouteSamples$PbExerciseRouteSamples$Builder(ExerciseRouteSamples$1 var1) {
      this();
   }

   private void ensureDurationIsMutable() {
      if ((this.bitField0_ & 1) != 1) {
         this.duration_ = new ArrayList(this.duration_);
         this.bitField0_ |= 1;
      }

   }

   private void ensureGpsAltitudeIsMutable() {
      if ((this.bitField0_ & 8) != 8) {
         this.gpsAltitude_ = new ArrayList(this.gpsAltitude_);
         this.bitField0_ |= 8;
      }

   }

   private void ensureLatitudeIsMutable() {
      if ((this.bitField0_ & 2) != 2) {
         this.latitude_ = new ArrayList(this.latitude_);
         this.bitField0_ |= 2;
      }

   }

   private void ensureLongitudeIsMutable() {
      if ((this.bitField0_ & 4) != 4) {
         this.longitude_ = new ArrayList(this.longitude_);
         this.bitField0_ |= 4;
      }

   }

   private void ensureOBSOLETEFixIsMutable() {
      if ((this.bitField0_ & 32) != 32) {
         this.oBSOLETEFix_ = new ArrayList(this.oBSOLETEFix_);
         this.bitField0_ |= 32;
      }

   }

   private void ensureOBSOLETEGpsDateTimeIsMutable() {
      if ((this.bitField0_ & 128) != 128) {
         this.oBSOLETEGpsDateTime_ = new ArrayList(this.oBSOLETEGpsDateTime_);
         this.bitField0_ |= 128;
      }

   }

   private void ensureOBSOLETEGpsOfflineIsMutable() {
      if ((this.bitField0_ & 64) != 64) {
         this.oBSOLETEGpsOffline_ = new ArrayList(this.oBSOLETEGpsOffline_);
         this.bitField0_ |= 64;
      }

   }

   private void ensureSatelliteAmountIsMutable() {
      if ((this.bitField0_ & 16) != 16) {
         this.satelliteAmount_ = new ArrayList(this.satelliteAmount_);
         this.bitField0_ |= 16;
      }

   }

   public static final Descriptor getDescriptor() {
      return ExerciseRouteSamples.a();
   }

   private SingleFieldBuilderV3 getFirstLocationTimeFieldBuilder() {
      if (this.firstLocationTimeBuilder_ == null) {
         this.firstLocationTimeBuilder_ = new SingleFieldBuilderV3(this.getFirstLocationTime(), this.getParentForChildren(), this.isClean());
         this.firstLocationTime_ = null;
      }

      return this.firstLocationTimeBuilder_;
   }

   private RepeatedFieldBuilderV3 getOBSOLETEGpsDateTimeFieldBuilder() {
      if (this.oBSOLETEGpsDateTimeBuilder_ == null) {
         List var1 = this.oBSOLETEGpsDateTime_;
         boolean var2;
         if ((this.bitField0_ & 128) == 128) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.oBSOLETEGpsDateTimeBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.oBSOLETEGpsDateTime_ = null;
      }

      return this.oBSOLETEGpsDateTimeBuilder_;
   }

   private RepeatedFieldBuilderV3 getOBSOLETEGpsOfflineFieldBuilder() {
      if (this.oBSOLETEGpsOfflineBuilder_ == null) {
         List var1 = this.oBSOLETEGpsOffline_;
         boolean var2;
         if ((this.bitField0_ & 64) == 64) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.oBSOLETEGpsOfflineBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.oBSOLETEGpsOffline_ = null;
      }

      return this.oBSOLETEGpsOfflineBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseRouteSamples$PbExerciseRouteSamples.b()) {
         this.getOBSOLETEGpsOfflineFieldBuilder();
         this.getOBSOLETEGpsDateTimeFieldBuilder();
         this.getFirstLocationTimeFieldBuilder();
      }

   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder addAllDuration(Iterable var1) {
      this.ensureDurationIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.duration_);
      this.onChanged();
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder addAllGpsAltitude(Iterable var1) {
      this.ensureGpsAltitudeIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.gpsAltitude_);
      this.onChanged();
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder addAllLatitude(Iterable var1) {
      this.ensureLatitudeIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.latitude_);
      this.onChanged();
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder addAllLongitude(Iterable var1) {
      this.ensureLongitudeIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.longitude_);
      this.onChanged();
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder addAllOBSOLETEFix(Iterable var1) {
      this.ensureOBSOLETEFixIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.oBSOLETEFix_);
      this.onChanged();
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder addAllOBSOLETEGpsDateTime(Iterable var1) {
      if (this.oBSOLETEGpsDateTimeBuilder_ == null) {
         this.ensureOBSOLETEGpsDateTimeIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.oBSOLETEGpsDateTime_);
         this.onChanged();
      } else {
         this.oBSOLETEGpsDateTimeBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder addAllOBSOLETEGpsOffline(Iterable var1) {
      if (this.oBSOLETEGpsOfflineBuilder_ == null) {
         this.ensureOBSOLETEGpsOfflineIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.oBSOLETEGpsOffline_);
         this.onChanged();
      } else {
         this.oBSOLETEGpsOfflineBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder addAllSatelliteAmount(Iterable var1) {
      this.ensureSatelliteAmountIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.satelliteAmount_);
      this.onChanged();
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder addDuration(int var1) {
      this.ensureDurationIsMutable();
      this.duration_.add(var1);
      this.onChanged();
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder addGpsAltitude(int var1) {
      this.ensureGpsAltitudeIsMutable();
      this.gpsAltitude_.add(var1);
      this.onChanged();
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder addLatitude(double var1) {
      this.ensureLatitudeIsMutable();
      this.latitude_.add(var1);
      this.onChanged();
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder addLongitude(double var1) {
      this.ensureLongitudeIsMutable();
      this.longitude_.add(var1);
      this.onChanged();
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder addOBSOLETEFix(boolean var1) {
      this.ensureOBSOLETEFixIsMutable();
      this.oBSOLETEFix_.add(var1);
      this.onChanged();
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder addOBSOLETEGpsDateTime(int var1, Types$PbSystemDateTime$Builder var2) {
      if (this.oBSOLETEGpsDateTimeBuilder_ == null) {
         this.ensureOBSOLETEGpsDateTimeIsMutable();
         this.oBSOLETEGpsDateTime_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.oBSOLETEGpsDateTimeBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder addOBSOLETEGpsDateTime(int var1, Types$PbSystemDateTime var2) {
      if (this.oBSOLETEGpsDateTimeBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureOBSOLETEGpsDateTimeIsMutable();
         this.oBSOLETEGpsDateTime_.add(var1, var2);
         this.onChanged();
      } else {
         this.oBSOLETEGpsDateTimeBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder addOBSOLETEGpsDateTime(Types$PbSystemDateTime$Builder var1) {
      if (this.oBSOLETEGpsDateTimeBuilder_ == null) {
         this.ensureOBSOLETEGpsDateTimeIsMutable();
         this.oBSOLETEGpsDateTime_.add(var1.build());
         this.onChanged();
      } else {
         this.oBSOLETEGpsDateTimeBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder addOBSOLETEGpsDateTime(Types$PbSystemDateTime var1) {
      if (this.oBSOLETEGpsDateTimeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureOBSOLETEGpsDateTimeIsMutable();
         this.oBSOLETEGpsDateTime_.add(var1);
         this.onChanged();
      } else {
         this.oBSOLETEGpsDateTimeBuilder_.addMessage(var1);
      }

      return this;
   }

   public Types$PbSystemDateTime$Builder addOBSOLETEGpsDateTimeBuilder() {
      return (Types$PbSystemDateTime$Builder)this.getOBSOLETEGpsDateTimeFieldBuilder().addBuilder(Types$PbSystemDateTime.getDefaultInstance());
   }

   public Types$PbSystemDateTime$Builder addOBSOLETEGpsDateTimeBuilder(int var1) {
      return (Types$PbSystemDateTime$Builder)this.getOBSOLETEGpsDateTimeFieldBuilder().addBuilder(var1, Types$PbSystemDateTime.getDefaultInstance());
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder addOBSOLETEGpsOffline(int var1, Types$PbSensorOffline$Builder var2) {
      if (this.oBSOLETEGpsOfflineBuilder_ == null) {
         this.ensureOBSOLETEGpsOfflineIsMutable();
         this.oBSOLETEGpsOffline_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.oBSOLETEGpsOfflineBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder addOBSOLETEGpsOffline(int var1, Types$PbSensorOffline var2) {
      if (this.oBSOLETEGpsOfflineBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureOBSOLETEGpsOfflineIsMutable();
         this.oBSOLETEGpsOffline_.add(var1, var2);
         this.onChanged();
      } else {
         this.oBSOLETEGpsOfflineBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder addOBSOLETEGpsOffline(Types$PbSensorOffline$Builder var1) {
      if (this.oBSOLETEGpsOfflineBuilder_ == null) {
         this.ensureOBSOLETEGpsOfflineIsMutable();
         this.oBSOLETEGpsOffline_.add(var1.build());
         this.onChanged();
      } else {
         this.oBSOLETEGpsOfflineBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder addOBSOLETEGpsOffline(Types$PbSensorOffline var1) {
      if (this.oBSOLETEGpsOfflineBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureOBSOLETEGpsOfflineIsMutable();
         this.oBSOLETEGpsOffline_.add(var1);
         this.onChanged();
      } else {
         this.oBSOLETEGpsOfflineBuilder_.addMessage(var1);
      }

      return this;
   }

   public Types$PbSensorOffline$Builder addOBSOLETEGpsOfflineBuilder() {
      return (Types$PbSensorOffline$Builder)this.getOBSOLETEGpsOfflineFieldBuilder().addBuilder(Types$PbSensorOffline.getDefaultInstance());
   }

   public Types$PbSensorOffline$Builder addOBSOLETEGpsOfflineBuilder(int var1) {
      return (Types$PbSensorOffline$Builder)this.getOBSOLETEGpsOfflineFieldBuilder().addBuilder(var1, Types$PbSensorOffline.getDefaultInstance());
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseRouteSamples$PbExerciseRouteSamples$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder addSatelliteAmount(int var1) {
      this.ensureSatelliteAmountIsMutable();
      this.satelliteAmount_.add(var1);
      this.onChanged();
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples build() {
      ExerciseRouteSamples$PbExerciseRouteSamples var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples buildPartial() {
      ExerciseRouteSamples$PbExerciseRouteSamples var1 = new ExerciseRouteSamples$PbExerciseRouteSamples(this, (ExerciseRouteSamples$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((this.bitField0_ & 1) == 1) {
         this.duration_ = Collections.unmodifiableList(this.duration_);
         this.bitField0_ &= -2;
      }

      ExerciseRouteSamples$PbExerciseRouteSamples.a(var1, this.duration_);
      if ((this.bitField0_ & 2) == 2) {
         this.latitude_ = Collections.unmodifiableList(this.latitude_);
         this.bitField0_ &= -3;
      }

      ExerciseRouteSamples$PbExerciseRouteSamples.b(var1, this.latitude_);
      if ((this.bitField0_ & 4) == 4) {
         this.longitude_ = Collections.unmodifiableList(this.longitude_);
         this.bitField0_ &= -5;
      }

      ExerciseRouteSamples$PbExerciseRouteSamples.c(var1, this.longitude_);
      if ((this.bitField0_ & 8) == 8) {
         this.gpsAltitude_ = Collections.unmodifiableList(this.gpsAltitude_);
         this.bitField0_ &= -9;
      }

      ExerciseRouteSamples$PbExerciseRouteSamples.d(var1, this.gpsAltitude_);
      if ((this.bitField0_ & 16) == 16) {
         this.satelliteAmount_ = Collections.unmodifiableList(this.satelliteAmount_);
         this.bitField0_ &= -17;
      }

      ExerciseRouteSamples$PbExerciseRouteSamples.e(var1, this.satelliteAmount_);
      if ((this.bitField0_ & 32) == 32) {
         this.oBSOLETEFix_ = Collections.unmodifiableList(this.oBSOLETEFix_);
         this.bitField0_ &= -33;
      }

      ExerciseRouteSamples$PbExerciseRouteSamples.f(var1, this.oBSOLETEFix_);
      if (this.oBSOLETEGpsOfflineBuilder_ == null) {
         if ((this.bitField0_ & 64) == 64) {
            this.oBSOLETEGpsOffline_ = Collections.unmodifiableList(this.oBSOLETEGpsOffline_);
            this.bitField0_ &= -65;
         }

         ExerciseRouteSamples$PbExerciseRouteSamples.g(var1, this.oBSOLETEGpsOffline_);
      } else {
         ExerciseRouteSamples$PbExerciseRouteSamples.g(var1, this.oBSOLETEGpsOfflineBuilder_.build());
      }

      if (this.oBSOLETEGpsDateTimeBuilder_ == null) {
         if ((this.bitField0_ & 128) == 128) {
            this.oBSOLETEGpsDateTime_ = Collections.unmodifiableList(this.oBSOLETEGpsDateTime_);
            this.bitField0_ &= -129;
         }

         ExerciseRouteSamples$PbExerciseRouteSamples.h(var1, this.oBSOLETEGpsDateTime_);
      } else {
         ExerciseRouteSamples$PbExerciseRouteSamples.h(var1, this.oBSOLETEGpsDateTimeBuilder_.build());
      }

      if ((var2 & 256) == 256) {
         var3 = 1;
      }

      if (this.firstLocationTimeBuilder_ == null) {
         ExerciseRouteSamples$PbExerciseRouteSamples.a(var1, this.firstLocationTime_);
      } else {
         ExerciseRouteSamples$PbExerciseRouteSamples.a(var1, (Types$PbSystemDateTime)this.firstLocationTimeBuilder_.build());
      }

      ExerciseRouteSamples$PbExerciseRouteSamples.a(var1, var3);
      this.onBuilt();
      return var1;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder clear() {
      super.clear();
      this.duration_ = Collections.emptyList();
      this.bitField0_ &= -2;
      this.latitude_ = Collections.emptyList();
      this.bitField0_ &= -3;
      this.longitude_ = Collections.emptyList();
      this.bitField0_ &= -5;
      this.gpsAltitude_ = Collections.emptyList();
      this.bitField0_ &= -9;
      this.satelliteAmount_ = Collections.emptyList();
      this.bitField0_ &= -17;
      this.oBSOLETEFix_ = Collections.emptyList();
      this.bitField0_ &= -33;
      if (this.oBSOLETEGpsOfflineBuilder_ == null) {
         this.oBSOLETEGpsOffline_ = Collections.emptyList();
         this.bitField0_ &= -65;
      } else {
         this.oBSOLETEGpsOfflineBuilder_.clear();
      }

      if (this.oBSOLETEGpsDateTimeBuilder_ == null) {
         this.oBSOLETEGpsDateTime_ = Collections.emptyList();
         this.bitField0_ &= -129;
      } else {
         this.oBSOLETEGpsDateTimeBuilder_.clear();
      }

      if (this.firstLocationTimeBuilder_ == null) {
         this.firstLocationTime_ = null;
      } else {
         this.firstLocationTimeBuilder_.clear();
      }

      this.bitField0_ &= -257;
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder clearDuration() {
      this.duration_ = Collections.emptyList();
      this.bitField0_ &= -2;
      this.onChanged();
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder clearField(FieldDescriptor var1) {
      return (ExerciseRouteSamples$PbExerciseRouteSamples$Builder)super.clearField(var1);
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder clearFirstLocationTime() {
      if (this.firstLocationTimeBuilder_ == null) {
         this.firstLocationTime_ = null;
         this.onChanged();
      } else {
         this.firstLocationTimeBuilder_.clear();
      }

      this.bitField0_ &= -257;
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder clearGpsAltitude() {
      this.gpsAltitude_ = Collections.emptyList();
      this.bitField0_ &= -9;
      this.onChanged();
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder clearLatitude() {
      this.latitude_ = Collections.emptyList();
      this.bitField0_ &= -3;
      this.onChanged();
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder clearLongitude() {
      this.longitude_ = Collections.emptyList();
      this.bitField0_ &= -5;
      this.onChanged();
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder clearOBSOLETEFix() {
      this.oBSOLETEFix_ = Collections.emptyList();
      this.bitField0_ &= -33;
      this.onChanged();
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder clearOBSOLETEGpsDateTime() {
      if (this.oBSOLETEGpsDateTimeBuilder_ == null) {
         this.oBSOLETEGpsDateTime_ = Collections.emptyList();
         this.bitField0_ &= -129;
         this.onChanged();
      } else {
         this.oBSOLETEGpsDateTimeBuilder_.clear();
      }

      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder clearOBSOLETEGpsOffline() {
      if (this.oBSOLETEGpsOfflineBuilder_ == null) {
         this.oBSOLETEGpsOffline_ = Collections.emptyList();
         this.bitField0_ &= -65;
         this.onChanged();
      } else {
         this.oBSOLETEGpsOfflineBuilder_.clear();
      }

      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseRouteSamples$PbExerciseRouteSamples$Builder)super.clearOneof(var1);
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder clearSatelliteAmount() {
      this.satelliteAmount_ = Collections.emptyList();
      this.bitField0_ &= -17;
      this.onChanged();
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder clone() {
      return (ExerciseRouteSamples$PbExerciseRouteSamples$Builder)super.clone();
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples getDefaultInstanceForType() {
      return ExerciseRouteSamples$PbExerciseRouteSamples.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseRouteSamples.a();
   }

   public int getDuration(int var1) {
      return (Integer)this.duration_.get(var1);
   }

   public int getDurationCount() {
      return this.duration_.size();
   }

   public List getDurationList() {
      return Collections.unmodifiableList(this.duration_);
   }

   public Types$PbSystemDateTime getFirstLocationTime() {
      Types$PbSystemDateTime var1;
      if (this.firstLocationTimeBuilder_ == null) {
         if (this.firstLocationTime_ == null) {
            var1 = Types$PbSystemDateTime.getDefaultInstance();
         } else {
            var1 = this.firstLocationTime_;
         }
      } else {
         var1 = (Types$PbSystemDateTime)this.firstLocationTimeBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbSystemDateTime$Builder getFirstLocationTimeBuilder() {
      this.bitField0_ |= 256;
      this.onChanged();
      return (Types$PbSystemDateTime$Builder)this.getFirstLocationTimeFieldBuilder().getBuilder();
   }

   public Types$PbSystemDateTimeOrBuilder getFirstLocationTimeOrBuilder() {
      Object var1;
      if (this.firstLocationTimeBuilder_ != null) {
         var1 = (Types$PbSystemDateTimeOrBuilder)this.firstLocationTimeBuilder_.getMessageOrBuilder();
      } else if (this.firstLocationTime_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.firstLocationTime_;
      }

      return (Types$PbSystemDateTimeOrBuilder)var1;
   }

   public int getGpsAltitude(int var1) {
      return (Integer)this.gpsAltitude_.get(var1);
   }

   public int getGpsAltitudeCount() {
      return this.gpsAltitude_.size();
   }

   public List getGpsAltitudeList() {
      return Collections.unmodifiableList(this.gpsAltitude_);
   }

   public double getLatitude(int var1) {
      return (Double)this.latitude_.get(var1);
   }

   public int getLatitudeCount() {
      return this.latitude_.size();
   }

   public List getLatitudeList() {
      return Collections.unmodifiableList(this.latitude_);
   }

   public double getLongitude(int var1) {
      return (Double)this.longitude_.get(var1);
   }

   public int getLongitudeCount() {
      return this.longitude_.size();
   }

   public List getLongitudeList() {
      return Collections.unmodifiableList(this.longitude_);
   }

   public boolean getOBSOLETEFix(int var1) {
      return (Boolean)this.oBSOLETEFix_.get(var1);
   }

   public int getOBSOLETEFixCount() {
      return this.oBSOLETEFix_.size();
   }

   public List getOBSOLETEFixList() {
      return Collections.unmodifiableList(this.oBSOLETEFix_);
   }

   public Types$PbSystemDateTime getOBSOLETEGpsDateTime(int var1) {
      Types$PbSystemDateTime var2;
      if (this.oBSOLETEGpsDateTimeBuilder_ == null) {
         var2 = (Types$PbSystemDateTime)this.oBSOLETEGpsDateTime_.get(var1);
      } else {
         var2 = (Types$PbSystemDateTime)this.oBSOLETEGpsDateTimeBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Types$PbSystemDateTime$Builder getOBSOLETEGpsDateTimeBuilder(int var1) {
      return (Types$PbSystemDateTime$Builder)this.getOBSOLETEGpsDateTimeFieldBuilder().getBuilder(var1);
   }

   public List getOBSOLETEGpsDateTimeBuilderList() {
      return this.getOBSOLETEGpsDateTimeFieldBuilder().getBuilderList();
   }

   public int getOBSOLETEGpsDateTimeCount() {
      int var1;
      if (this.oBSOLETEGpsDateTimeBuilder_ == null) {
         var1 = this.oBSOLETEGpsDateTime_.size();
      } else {
         var1 = this.oBSOLETEGpsDateTimeBuilder_.getCount();
      }

      return var1;
   }

   public List getOBSOLETEGpsDateTimeList() {
      List var1;
      if (this.oBSOLETEGpsDateTimeBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.oBSOLETEGpsDateTime_);
      } else {
         var1 = this.oBSOLETEGpsDateTimeBuilder_.getMessageList();
      }

      return var1;
   }

   public Types$PbSystemDateTimeOrBuilder getOBSOLETEGpsDateTimeOrBuilder(int var1) {
      Types$PbSystemDateTimeOrBuilder var2;
      if (this.oBSOLETEGpsDateTimeBuilder_ == null) {
         var2 = (Types$PbSystemDateTimeOrBuilder)this.oBSOLETEGpsDateTime_.get(var1);
      } else {
         var2 = (Types$PbSystemDateTimeOrBuilder)this.oBSOLETEGpsDateTimeBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getOBSOLETEGpsDateTimeOrBuilderList() {
      List var1;
      if (this.oBSOLETEGpsDateTimeBuilder_ != null) {
         var1 = this.oBSOLETEGpsDateTimeBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.oBSOLETEGpsDateTime_);
      }

      return var1;
   }

   public Types$PbSensorOffline getOBSOLETEGpsOffline(int var1) {
      Types$PbSensorOffline var2;
      if (this.oBSOLETEGpsOfflineBuilder_ == null) {
         var2 = (Types$PbSensorOffline)this.oBSOLETEGpsOffline_.get(var1);
      } else {
         var2 = (Types$PbSensorOffline)this.oBSOLETEGpsOfflineBuilder_.getMessage(var1);
      }

      return var2;
   }

   public Types$PbSensorOffline$Builder getOBSOLETEGpsOfflineBuilder(int var1) {
      return (Types$PbSensorOffline$Builder)this.getOBSOLETEGpsOfflineFieldBuilder().getBuilder(var1);
   }

   public List getOBSOLETEGpsOfflineBuilderList() {
      return this.getOBSOLETEGpsOfflineFieldBuilder().getBuilderList();
   }

   public int getOBSOLETEGpsOfflineCount() {
      int var1;
      if (this.oBSOLETEGpsOfflineBuilder_ == null) {
         var1 = this.oBSOLETEGpsOffline_.size();
      } else {
         var1 = this.oBSOLETEGpsOfflineBuilder_.getCount();
      }

      return var1;
   }

   public List getOBSOLETEGpsOfflineList() {
      List var1;
      if (this.oBSOLETEGpsOfflineBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.oBSOLETEGpsOffline_);
      } else {
         var1 = this.oBSOLETEGpsOfflineBuilder_.getMessageList();
      }

      return var1;
   }

   public Types$PbSensorOfflineOrBuilder getOBSOLETEGpsOfflineOrBuilder(int var1) {
      Types$PbSensorOfflineOrBuilder var2;
      if (this.oBSOLETEGpsOfflineBuilder_ == null) {
         var2 = (Types$PbSensorOfflineOrBuilder)this.oBSOLETEGpsOffline_.get(var1);
      } else {
         var2 = (Types$PbSensorOfflineOrBuilder)this.oBSOLETEGpsOfflineBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getOBSOLETEGpsOfflineOrBuilderList() {
      List var1;
      if (this.oBSOLETEGpsOfflineBuilder_ != null) {
         var1 = this.oBSOLETEGpsOfflineBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.oBSOLETEGpsOffline_);
      }

      return var1;
   }

   public int getSatelliteAmount(int var1) {
      return (Integer)this.satelliteAmount_.get(var1);
   }

   public int getSatelliteAmountCount() {
      return this.satelliteAmount_.size();
   }

   public List getSatelliteAmountList() {
      return Collections.unmodifiableList(this.satelliteAmount_);
   }

   public boolean hasFirstLocationTime() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseRouteSamples.b().ensureFieldAccessorsInitialized(ExerciseRouteSamples$PbExerciseRouteSamples.class, ExerciseRouteSamples$PbExerciseRouteSamples$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      int var2 = 0;

      boolean var3;
      while(true) {
         if (var2 >= this.getOBSOLETEGpsOfflineCount()) {
            for(var2 = 0; var2 < this.getOBSOLETEGpsDateTimeCount(); ++var2) {
               var3 = var1;
               if (!this.getOBSOLETEGpsDateTime(var2).isInitialized()) {
                  return var3;
               }
            }

            if (this.hasFirstLocationTime()) {
               var3 = var1;
               if (!this.getFirstLocationTime().isInitialized()) {
                  break;
               }
            }

            var3 = true;
            break;
         }

         if (!this.getOBSOLETEGpsOffline(var2).isInitialized()) {
            var3 = var1;
            break;
         }

         ++var2;
      }

      return var3;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder mergeFirstLocationTime(Types$PbSystemDateTime var1) {
      if (this.firstLocationTimeBuilder_ == null) {
         if ((this.bitField0_ & 256) == 256 && this.firstLocationTime_ != null && this.firstLocationTime_ != Types$PbSystemDateTime.getDefaultInstance()) {
            this.firstLocationTime_ = Types$PbSystemDateTime.newBuilder(this.firstLocationTime_).mergeFrom(var1).buildPartial();
         } else {
            this.firstLocationTime_ = var1;
         }

         this.onChanged();
      } else {
         this.firstLocationTimeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 256;
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseRouteSamples$PbExerciseRouteSamples var13;
      label96: {
         InvalidProtocolBufferException var12;
         ExerciseRouteSamples$PbExerciseRouteSamples var14;
         try {
            var13 = (ExerciseRouteSamples$PbExerciseRouteSamples)ExerciseRouteSamples$PbExerciseRouteSamples.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (ExerciseRouteSamples$PbExerciseRouteSamples)var10.getUnfinishedMessage();
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

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder mergeFrom(Message var1) {
      ExerciseRouteSamples$PbExerciseRouteSamples$Builder var2;
      if (var1 instanceof ExerciseRouteSamples$PbExerciseRouteSamples) {
         var2 = this.mergeFrom((ExerciseRouteSamples$PbExerciseRouteSamples)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder mergeFrom(ExerciseRouteSamples$PbExerciseRouteSamples var1) {
      Object var2 = null;
      if (var1 != ExerciseRouteSamples$PbExerciseRouteSamples.getDefaultInstance()) {
         if (!ExerciseRouteSamples$PbExerciseRouteSamples.a(var1).isEmpty()) {
            if (this.duration_.isEmpty()) {
               this.duration_ = ExerciseRouteSamples$PbExerciseRouteSamples.a(var1);
               this.bitField0_ &= -2;
            } else {
               this.ensureDurationIsMutable();
               this.duration_.addAll(ExerciseRouteSamples$PbExerciseRouteSamples.a(var1));
            }

            this.onChanged();
         }

         if (!ExerciseRouteSamples$PbExerciseRouteSamples.b(var1).isEmpty()) {
            if (this.latitude_.isEmpty()) {
               this.latitude_ = ExerciseRouteSamples$PbExerciseRouteSamples.b(var1);
               this.bitField0_ &= -3;
            } else {
               this.ensureLatitudeIsMutable();
               this.latitude_.addAll(ExerciseRouteSamples$PbExerciseRouteSamples.b(var1));
            }

            this.onChanged();
         }

         if (!ExerciseRouteSamples$PbExerciseRouteSamples.c(var1).isEmpty()) {
            if (this.longitude_.isEmpty()) {
               this.longitude_ = ExerciseRouteSamples$PbExerciseRouteSamples.c(var1);
               this.bitField0_ &= -5;
            } else {
               this.ensureLongitudeIsMutable();
               this.longitude_.addAll(ExerciseRouteSamples$PbExerciseRouteSamples.c(var1));
            }

            this.onChanged();
         }

         if (!ExerciseRouteSamples$PbExerciseRouteSamples.d(var1).isEmpty()) {
            if (this.gpsAltitude_.isEmpty()) {
               this.gpsAltitude_ = ExerciseRouteSamples$PbExerciseRouteSamples.d(var1);
               this.bitField0_ &= -9;
            } else {
               this.ensureGpsAltitudeIsMutable();
               this.gpsAltitude_.addAll(ExerciseRouteSamples$PbExerciseRouteSamples.d(var1));
            }

            this.onChanged();
         }

         if (!ExerciseRouteSamples$PbExerciseRouteSamples.e(var1).isEmpty()) {
            if (this.satelliteAmount_.isEmpty()) {
               this.satelliteAmount_ = ExerciseRouteSamples$PbExerciseRouteSamples.e(var1);
               this.bitField0_ &= -17;
            } else {
               this.ensureSatelliteAmountIsMutable();
               this.satelliteAmount_.addAll(ExerciseRouteSamples$PbExerciseRouteSamples.e(var1));
            }

            this.onChanged();
         }

         if (!ExerciseRouteSamples$PbExerciseRouteSamples.f(var1).isEmpty()) {
            if (this.oBSOLETEFix_.isEmpty()) {
               this.oBSOLETEFix_ = ExerciseRouteSamples$PbExerciseRouteSamples.f(var1);
               this.bitField0_ &= -33;
            } else {
               this.ensureOBSOLETEFixIsMutable();
               this.oBSOLETEFix_.addAll(ExerciseRouteSamples$PbExerciseRouteSamples.f(var1));
            }

            this.onChanged();
         }

         RepeatedFieldBuilderV3 var3;
         if (this.oBSOLETEGpsOfflineBuilder_ == null) {
            if (!ExerciseRouteSamples$PbExerciseRouteSamples.g(var1).isEmpty()) {
               if (this.oBSOLETEGpsOffline_.isEmpty()) {
                  this.oBSOLETEGpsOffline_ = ExerciseRouteSamples$PbExerciseRouteSamples.g(var1);
                  this.bitField0_ &= -65;
               } else {
                  this.ensureOBSOLETEGpsOfflineIsMutable();
                  this.oBSOLETEGpsOffline_.addAll(ExerciseRouteSamples$PbExerciseRouteSamples.g(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseRouteSamples$PbExerciseRouteSamples.g(var1).isEmpty()) {
            if (this.oBSOLETEGpsOfflineBuilder_.isEmpty()) {
               this.oBSOLETEGpsOfflineBuilder_.dispose();
               this.oBSOLETEGpsOfflineBuilder_ = null;
               this.oBSOLETEGpsOffline_ = ExerciseRouteSamples$PbExerciseRouteSamples.g(var1);
               this.bitField0_ &= -65;
               if (ExerciseRouteSamples$PbExerciseRouteSamples.c()) {
                  var3 = this.getOBSOLETEGpsOfflineFieldBuilder();
               } else {
                  var3 = null;
               }

               this.oBSOLETEGpsOfflineBuilder_ = var3;
            } else {
               this.oBSOLETEGpsOfflineBuilder_.addAllMessages(ExerciseRouteSamples$PbExerciseRouteSamples.g(var1));
            }
         }

         if (this.oBSOLETEGpsDateTimeBuilder_ == null) {
            if (!ExerciseRouteSamples$PbExerciseRouteSamples.h(var1).isEmpty()) {
               if (this.oBSOLETEGpsDateTime_.isEmpty()) {
                  this.oBSOLETEGpsDateTime_ = ExerciseRouteSamples$PbExerciseRouteSamples.h(var1);
                  this.bitField0_ &= -129;
               } else {
                  this.ensureOBSOLETEGpsDateTimeIsMutable();
                  this.oBSOLETEGpsDateTime_.addAll(ExerciseRouteSamples$PbExerciseRouteSamples.h(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseRouteSamples$PbExerciseRouteSamples.h(var1).isEmpty()) {
            if (this.oBSOLETEGpsDateTimeBuilder_.isEmpty()) {
               this.oBSOLETEGpsDateTimeBuilder_.dispose();
               this.oBSOLETEGpsDateTimeBuilder_ = null;
               this.oBSOLETEGpsDateTime_ = ExerciseRouteSamples$PbExerciseRouteSamples.h(var1);
               this.bitField0_ &= -129;
               var3 = (RepeatedFieldBuilderV3)var2;
               if (ExerciseRouteSamples$PbExerciseRouteSamples.d()) {
                  var3 = this.getOBSOLETEGpsDateTimeFieldBuilder();
               }

               this.oBSOLETEGpsDateTimeBuilder_ = var3;
            } else {
               this.oBSOLETEGpsDateTimeBuilder_.addAllMessages(ExerciseRouteSamples$PbExerciseRouteSamples.h(var1));
            }
         }

         if (var1.hasFirstLocationTime()) {
            this.mergeFirstLocationTime(var1.getFirstLocationTime());
         }

         this.mergeUnknownFields(ExerciseRouteSamples$PbExerciseRouteSamples.i(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseRouteSamples$PbExerciseRouteSamples$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseRouteSamples$PbExerciseRouteSamples$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder removeOBSOLETEGpsDateTime(int var1) {
      if (this.oBSOLETEGpsDateTimeBuilder_ == null) {
         this.ensureOBSOLETEGpsDateTimeIsMutable();
         this.oBSOLETEGpsDateTime_.remove(var1);
         this.onChanged();
      } else {
         this.oBSOLETEGpsDateTimeBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder removeOBSOLETEGpsOffline(int var1) {
      if (this.oBSOLETEGpsOfflineBuilder_ == null) {
         this.ensureOBSOLETEGpsOfflineIsMutable();
         this.oBSOLETEGpsOffline_.remove(var1);
         this.onChanged();
      } else {
         this.oBSOLETEGpsOfflineBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder setDuration(int var1, int var2) {
      this.ensureDurationIsMutable();
      this.duration_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseRouteSamples$PbExerciseRouteSamples$Builder)super.setField(var1, var2);
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder setFirstLocationTime(Types$PbSystemDateTime$Builder var1) {
      if (this.firstLocationTimeBuilder_ == null) {
         this.firstLocationTime_ = var1.build();
         this.onChanged();
      } else {
         this.firstLocationTimeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 256;
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder setFirstLocationTime(Types$PbSystemDateTime var1) {
      if (this.firstLocationTimeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.firstLocationTime_ = var1;
         this.onChanged();
      } else {
         this.firstLocationTimeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 256;
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder setGpsAltitude(int var1, int var2) {
      this.ensureGpsAltitudeIsMutable();
      this.gpsAltitude_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder setLatitude(int var1, double var2) {
      this.ensureLatitudeIsMutable();
      this.latitude_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder setLongitude(int var1, double var2) {
      this.ensureLongitudeIsMutable();
      this.longitude_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder setOBSOLETEFix(int var1, boolean var2) {
      this.ensureOBSOLETEFixIsMutable();
      this.oBSOLETEFix_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder setOBSOLETEGpsDateTime(int var1, Types$PbSystemDateTime$Builder var2) {
      if (this.oBSOLETEGpsDateTimeBuilder_ == null) {
         this.ensureOBSOLETEGpsDateTimeIsMutable();
         this.oBSOLETEGpsDateTime_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.oBSOLETEGpsDateTimeBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder setOBSOLETEGpsDateTime(int var1, Types$PbSystemDateTime var2) {
      if (this.oBSOLETEGpsDateTimeBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureOBSOLETEGpsDateTimeIsMutable();
         this.oBSOLETEGpsDateTime_.set(var1, var2);
         this.onChanged();
      } else {
         this.oBSOLETEGpsDateTimeBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder setOBSOLETEGpsOffline(int var1, Types$PbSensorOffline$Builder var2) {
      if (this.oBSOLETEGpsOfflineBuilder_ == null) {
         this.ensureOBSOLETEGpsOfflineIsMutable();
         this.oBSOLETEGpsOffline_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.oBSOLETEGpsOfflineBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder setOBSOLETEGpsOffline(int var1, Types$PbSensorOffline var2) {
      if (this.oBSOLETEGpsOfflineBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureOBSOLETEGpsOfflineIsMutable();
         this.oBSOLETEGpsOffline_.set(var1, var2);
         this.onChanged();
      } else {
         this.oBSOLETEGpsOfflineBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseRouteSamples$PbExerciseRouteSamples$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public ExerciseRouteSamples$PbExerciseRouteSamples$Builder setSatelliteAmount(int var1, int var2) {
      this.ensureSatelliteAmountIsMutable();
      this.satelliteAmount_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public final ExerciseRouteSamples$PbExerciseRouteSamples$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseRouteSamples$PbExerciseRouteSamples$Builder)super.setUnknownFields(var1);
   }
}
