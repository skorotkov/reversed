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

public final class TrainingSessionTarget$PbSteadyRacePace$Builder extends Builder implements TrainingSessionTarget$PbSteadyRacePaceOrBuilder {
   private int bitField0_;
   private float distance_;
   private SingleFieldBuilderV3 durationBuilder_;
   private Types$PbDuration duration_;

   private TrainingSessionTarget$PbSteadyRacePace$Builder() {
      this.duration_ = null;
      this.maybeForceBuilderInitialization();
   }

   private TrainingSessionTarget$PbSteadyRacePace$Builder(BuilderParent var1) {
      super(var1);
      this.duration_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   TrainingSessionTarget$PbSteadyRacePace$Builder(BuilderParent var1, TrainingSessionTarget$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   TrainingSessionTarget$PbSteadyRacePace$Builder(TrainingSessionTarget$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return TrainingSessionTarget.a();
   }

   private SingleFieldBuilderV3 getDurationFieldBuilder() {
      if (this.durationBuilder_ == null) {
         this.durationBuilder_ = new SingleFieldBuilderV3(this.getDuration(), this.getParentForChildren(), this.isClean());
         this.duration_ = null;
      }

      return this.durationBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (TrainingSessionTarget$PbSteadyRacePace.b()) {
         this.getDurationFieldBuilder();
      }

   }

   public TrainingSessionTarget$PbSteadyRacePace$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (TrainingSessionTarget$PbSteadyRacePace$Builder)super.addRepeatedField(var1, var2);
   }

   public TrainingSessionTarget$PbSteadyRacePace build() {
      TrainingSessionTarget$PbSteadyRacePace var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public TrainingSessionTarget$PbSteadyRacePace buildPartial() {
      TrainingSessionTarget$PbSteadyRacePace var1 = new TrainingSessionTarget$PbSteadyRacePace(this, (TrainingSessionTarget$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.durationBuilder_ == null) {
         TrainingSessionTarget$PbSteadyRacePace.a(var1, this.duration_);
      } else {
         TrainingSessionTarget$PbSteadyRacePace.a(var1, (Types$PbDuration)this.durationBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      TrainingSessionTarget$PbSteadyRacePace.a(var1, this.distance_);
      TrainingSessionTarget$PbSteadyRacePace.a(var1, var4);
      this.onBuilt();
      return var1;
   }

   public TrainingSessionTarget$PbSteadyRacePace$Builder clear() {
      super.clear();
      if (this.durationBuilder_ == null) {
         this.duration_ = null;
      } else {
         this.durationBuilder_.clear();
      }

      this.bitField0_ &= -2;
      this.distance_ = 0.0F;
      this.bitField0_ &= -3;
      return this;
   }

   public TrainingSessionTarget$PbSteadyRacePace$Builder clearDistance() {
      this.bitField0_ &= -3;
      this.distance_ = 0.0F;
      this.onChanged();
      return this;
   }

   public TrainingSessionTarget$PbSteadyRacePace$Builder clearDuration() {
      if (this.durationBuilder_ == null) {
         this.duration_ = null;
         this.onChanged();
      } else {
         this.durationBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public TrainingSessionTarget$PbSteadyRacePace$Builder clearField(FieldDescriptor var1) {
      return (TrainingSessionTarget$PbSteadyRacePace$Builder)super.clearField(var1);
   }

   public TrainingSessionTarget$PbSteadyRacePace$Builder clearOneof(OneofDescriptor var1) {
      return (TrainingSessionTarget$PbSteadyRacePace$Builder)super.clearOneof(var1);
   }

   public TrainingSessionTarget$PbSteadyRacePace$Builder clone() {
      return (TrainingSessionTarget$PbSteadyRacePace$Builder)super.clone();
   }

   public TrainingSessionTarget$PbSteadyRacePace getDefaultInstanceForType() {
      return TrainingSessionTarget$PbSteadyRacePace.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return TrainingSessionTarget.a();
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
      this.bitField0_ |= 1;
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

   public boolean hasDistance() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDuration() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return TrainingSessionTarget.b().ensureFieldAccessorsInitialized(TrainingSessionTarget$PbSteadyRacePace.class, TrainingSessionTarget$PbSteadyRacePace$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasDuration() && this.hasDistance()) {
         var1 = true;
      }

      return var1;
   }

   public TrainingSessionTarget$PbSteadyRacePace$Builder mergeDuration(Types$PbDuration var1) {
      if (this.durationBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.duration_ != null && this.duration_ != Types$PbDuration.getDefaultInstance()) {
            this.duration_ = Types$PbDuration.newBuilder(this.duration_).mergeFrom(var1).buildPartial();
         } else {
            this.duration_ = var1;
         }

         this.onChanged();
      } else {
         this.durationBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public TrainingSessionTarget$PbSteadyRacePace$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      TrainingSessionTarget$PbSteadyRacePace var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (TrainingSessionTarget$PbSteadyRacePace)TrainingSessionTarget$PbSteadyRacePace.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (TrainingSessionTarget$PbSteadyRacePace)var11.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var14.unwrapIOException();
         } catch (Throwable var10) {
            if (var13 != null) {
               this.mergeFrom(var13);
            }

            throw var10;
         }
      }

      if (var13 != null) {
         this.mergeFrom(var13);
      }

      return this;
   }

   public TrainingSessionTarget$PbSteadyRacePace$Builder mergeFrom(Message var1) {
      TrainingSessionTarget$PbSteadyRacePace$Builder var2;
      if (var1 instanceof TrainingSessionTarget$PbSteadyRacePace) {
         var2 = this.mergeFrom((TrainingSessionTarget$PbSteadyRacePace)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public TrainingSessionTarget$PbSteadyRacePace$Builder mergeFrom(TrainingSessionTarget$PbSteadyRacePace var1) {
      if (var1 != TrainingSessionTarget$PbSteadyRacePace.getDefaultInstance()) {
         if (var1.hasDuration()) {
            this.mergeDuration(var1.getDuration());
         }

         if (var1.hasDistance()) {
            this.setDistance(var1.getDistance());
         }

         this.mergeUnknownFields(TrainingSessionTarget$PbSteadyRacePace.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final TrainingSessionTarget$PbSteadyRacePace$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (TrainingSessionTarget$PbSteadyRacePace$Builder)super.mergeUnknownFields(var1);
   }

   public TrainingSessionTarget$PbSteadyRacePace$Builder setDistance(float var1) {
      this.bitField0_ |= 2;
      this.distance_ = var1;
      this.onChanged();
      return this;
   }

   public TrainingSessionTarget$PbSteadyRacePace$Builder setDuration(Types$PbDuration$Builder var1) {
      if (this.durationBuilder_ == null) {
         this.duration_ = var1.build();
         this.onChanged();
      } else {
         this.durationBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public TrainingSessionTarget$PbSteadyRacePace$Builder setDuration(Types$PbDuration var1) {
      if (this.durationBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.duration_ = var1;
         this.onChanged();
      } else {
         this.durationBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public TrainingSessionTarget$PbSteadyRacePace$Builder setField(FieldDescriptor var1, Object var2) {
      return (TrainingSessionTarget$PbSteadyRacePace$Builder)super.setField(var1, var2);
   }

   public TrainingSessionTarget$PbSteadyRacePace$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (TrainingSessionTarget$PbSteadyRacePace$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final TrainingSessionTarget$PbSteadyRacePace$Builder setUnknownFields(UnknownFieldSet var1) {
      return (TrainingSessionTarget$PbSteadyRacePace$Builder)super.setUnknownFields(var1);
   }
}
