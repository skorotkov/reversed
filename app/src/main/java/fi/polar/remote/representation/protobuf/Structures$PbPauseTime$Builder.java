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

public final class Structures$PbPauseTime$Builder extends Builder implements Structures$PbPauseTimeOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 durationBuilder_;
   private Types$PbDuration duration_;
   private SingleFieldBuilderV3 startTimeBuilder_;
   private Types$PbDuration startTime_;

   private Structures$PbPauseTime$Builder() {
      this.startTime_ = null;
      this.duration_ = null;
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbPauseTime$Builder(BuilderParent var1) {
      super(var1);
      this.startTime_ = null;
      this.duration_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbPauseTime$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbPauseTime$Builder(Structures$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Structures.S();
   }

   private SingleFieldBuilderV3 getDurationFieldBuilder() {
      if (this.durationBuilder_ == null) {
         this.durationBuilder_ = new SingleFieldBuilderV3(this.getDuration(), this.getParentForChildren(), this.isClean());
         this.duration_ = null;
      }

      return this.durationBuilder_;
   }

   private SingleFieldBuilderV3 getStartTimeFieldBuilder() {
      if (this.startTimeBuilder_ == null) {
         this.startTimeBuilder_ = new SingleFieldBuilderV3(this.getStartTime(), this.getParentForChildren(), this.isClean());
         this.startTime_ = null;
      }

      return this.startTimeBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbPauseTime.b()) {
         this.getStartTimeFieldBuilder();
         this.getDurationFieldBuilder();
      }

   }

   public Structures$PbPauseTime$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbPauseTime$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbPauseTime build() {
      Structures$PbPauseTime var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbPauseTime buildPartial() {
      Structures$PbPauseTime var1 = new Structures$PbPauseTime(this, (Structures$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.startTimeBuilder_ == null) {
         Structures$PbPauseTime.a(var1, this.startTime_);
      } else {
         Structures$PbPauseTime.a(var1, (Types$PbDuration)this.startTimeBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.durationBuilder_ == null) {
         Structures$PbPauseTime.b(var1, this.duration_);
      } else {
         Structures$PbPauseTime.b(var1, (Types$PbDuration)this.durationBuilder_.build());
      }

      Structures$PbPauseTime.a(var1, var4);
      this.onBuilt();
      return var1;
   }

   public Structures$PbPauseTime$Builder clear() {
      super.clear();
      if (this.startTimeBuilder_ == null) {
         this.startTime_ = null;
      } else {
         this.startTimeBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.durationBuilder_ == null) {
         this.duration_ = null;
      } else {
         this.durationBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public Structures$PbPauseTime$Builder clearDuration() {
      if (this.durationBuilder_ == null) {
         this.duration_ = null;
         this.onChanged();
      } else {
         this.durationBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public Structures$PbPauseTime$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbPauseTime$Builder)super.clearField(var1);
   }

   public Structures$PbPauseTime$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbPauseTime$Builder)super.clearOneof(var1);
   }

   public Structures$PbPauseTime$Builder clearStartTime() {
      if (this.startTimeBuilder_ == null) {
         this.startTime_ = null;
         this.onChanged();
      } else {
         this.startTimeBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public Structures$PbPauseTime$Builder clone() {
      return (Structures$PbPauseTime$Builder)super.clone();
   }

   public Structures$PbPauseTime getDefaultInstanceForType() {
      return Structures$PbPauseTime.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.S();
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

   public Types$PbDuration getStartTime() {
      Types$PbDuration var1;
      if (this.startTimeBuilder_ == null) {
         if (this.startTime_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.startTime_;
         }
      } else {
         var1 = (Types$PbDuration)this.startTimeBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getStartTimeBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getStartTimeFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getStartTimeOrBuilder() {
      Object var1;
      if (this.startTimeBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.startTimeBuilder_.getMessageOrBuilder();
      } else if (this.startTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.startTime_;
      }

      return (Types$PbDurationOrBuilder)var1;
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

   public boolean hasStartTime() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.T().ensureFieldAccessorsInitialized(Structures$PbPauseTime.class, Structures$PbPauseTime$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasStartTime() && this.hasDuration()) {
         var1 = true;
      }

      return var1;
   }

   public Structures$PbPauseTime$Builder mergeDuration(Types$PbDuration var1) {
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

   public Structures$PbPauseTime$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbPauseTime var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (Structures$PbPauseTime)Structures$PbPauseTime.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (Structures$PbPauseTime)var10.getUnfinishedMessage();
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

   public Structures$PbPauseTime$Builder mergeFrom(Message var1) {
      Structures$PbPauseTime$Builder var2;
      if (var1 instanceof Structures$PbPauseTime) {
         var2 = this.mergeFrom((Structures$PbPauseTime)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbPauseTime$Builder mergeFrom(Structures$PbPauseTime var1) {
      if (var1 != Structures$PbPauseTime.getDefaultInstance()) {
         if (var1.hasStartTime()) {
            this.mergeStartTime(var1.getStartTime());
         }

         if (var1.hasDuration()) {
            this.mergeDuration(var1.getDuration());
         }

         this.mergeUnknownFields(Structures$PbPauseTime.a(var1));
         this.onChanged();
      }

      return this;
   }

   public Structures$PbPauseTime$Builder mergeStartTime(Types$PbDuration var1) {
      if (this.startTimeBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.startTime_ != null && this.startTime_ != Types$PbDuration.getDefaultInstance()) {
            this.startTime_ = Types$PbDuration.newBuilder(this.startTime_).mergeFrom(var1).buildPartial();
         } else {
            this.startTime_ = var1;
         }

         this.onChanged();
      } else {
         this.startTimeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public final Structures$PbPauseTime$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbPauseTime$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbPauseTime$Builder setDuration(Types$PbDuration$Builder var1) {
      if (this.durationBuilder_ == null) {
         this.duration_ = var1.build();
         this.onChanged();
      } else {
         this.durationBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Structures$PbPauseTime$Builder setDuration(Types$PbDuration var1) {
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

   public Structures$PbPauseTime$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbPauseTime$Builder)super.setField(var1, var2);
   }

   public Structures$PbPauseTime$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbPauseTime$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Structures$PbPauseTime$Builder setStartTime(Types$PbDuration$Builder var1) {
      if (this.startTimeBuilder_ == null) {
         this.startTime_ = var1.build();
         this.onChanged();
      } else {
         this.startTimeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public Structures$PbPauseTime$Builder setStartTime(Types$PbDuration var1) {
      if (this.startTimeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.startTime_ = var1;
         this.onChanged();
      } else {
         this.startTimeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public final Structures$PbPauseTime$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbPauseTime$Builder)super.setUnknownFields(var1);
   }
}
