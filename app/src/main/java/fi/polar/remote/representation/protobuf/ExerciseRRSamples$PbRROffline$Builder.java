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

public final class ExerciseRRSamples$PbRROffline$Builder extends Builder implements ExerciseRRSamples$PbRROfflineOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 startTimeBuilder_;
   private Types$PbDuration startTime_;
   private SingleFieldBuilderV3 timeIntervalBuilder_;
   private Types$PbDuration timeInterval_;

   private ExerciseRRSamples$PbRROffline$Builder() {
      this.startTime_ = null;
      this.timeInterval_ = null;
      this.maybeForceBuilderInitialization();
   }

   private ExerciseRRSamples$PbRROffline$Builder(BuilderParent var1) {
      super(var1);
      this.startTime_ = null;
      this.timeInterval_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseRRSamples$PbRROffline$Builder(BuilderParent var1, ExerciseRRSamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseRRSamples$PbRROffline$Builder(ExerciseRRSamples$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseRRSamples.a();
   }

   private SingleFieldBuilderV3 getStartTimeFieldBuilder() {
      if (this.startTimeBuilder_ == null) {
         this.startTimeBuilder_ = new SingleFieldBuilderV3(this.getStartTime(), this.getParentForChildren(), this.isClean());
         this.startTime_ = null;
      }

      return this.startTimeBuilder_;
   }

   private SingleFieldBuilderV3 getTimeIntervalFieldBuilder() {
      if (this.timeIntervalBuilder_ == null) {
         this.timeIntervalBuilder_ = new SingleFieldBuilderV3(this.getTimeInterval(), this.getParentForChildren(), this.isClean());
         this.timeInterval_ = null;
      }

      return this.timeIntervalBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseRRSamples$PbRROffline.b()) {
         this.getStartTimeFieldBuilder();
         this.getTimeIntervalFieldBuilder();
      }

   }

   public ExerciseRRSamples$PbRROffline$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseRRSamples$PbRROffline$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseRRSamples$PbRROffline build() {
      ExerciseRRSamples$PbRROffline var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseRRSamples$PbRROffline buildPartial() {
      ExerciseRRSamples$PbRROffline var1 = new ExerciseRRSamples$PbRROffline(this, (ExerciseRRSamples$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.startTimeBuilder_ == null) {
         ExerciseRRSamples$PbRROffline.a(var1, this.startTime_);
      } else {
         ExerciseRRSamples$PbRROffline.a(var1, (Types$PbDuration)this.startTimeBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      if (this.timeIntervalBuilder_ == null) {
         ExerciseRRSamples$PbRROffline.b(var1, this.timeInterval_);
      } else {
         ExerciseRRSamples$PbRROffline.b(var1, (Types$PbDuration)this.timeIntervalBuilder_.build());
      }

      ExerciseRRSamples$PbRROffline.a(var1, var4);
      this.onBuilt();
      return var1;
   }

   public ExerciseRRSamples$PbRROffline$Builder clear() {
      super.clear();
      if (this.startTimeBuilder_ == null) {
         this.startTime_ = null;
      } else {
         this.startTimeBuilder_.clear();
      }

      this.bitField0_ &= -2;
      if (this.timeIntervalBuilder_ == null) {
         this.timeInterval_ = null;
      } else {
         this.timeIntervalBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public ExerciseRRSamples$PbRROffline$Builder clearField(FieldDescriptor var1) {
      return (ExerciseRRSamples$PbRROffline$Builder)super.clearField(var1);
   }

   public ExerciseRRSamples$PbRROffline$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseRRSamples$PbRROffline$Builder)super.clearOneof(var1);
   }

   public ExerciseRRSamples$PbRROffline$Builder clearStartTime() {
      if (this.startTimeBuilder_ == null) {
         this.startTime_ = null;
         this.onChanged();
      } else {
         this.startTimeBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public ExerciseRRSamples$PbRROffline$Builder clearTimeInterval() {
      if (this.timeIntervalBuilder_ == null) {
         this.timeInterval_ = null;
         this.onChanged();
      } else {
         this.timeIntervalBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public ExerciseRRSamples$PbRROffline$Builder clone() {
      return (ExerciseRRSamples$PbRROffline$Builder)super.clone();
   }

   public ExerciseRRSamples$PbRROffline getDefaultInstanceForType() {
      return ExerciseRRSamples$PbRROffline.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseRRSamples.a();
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

   public Types$PbDuration getTimeInterval() {
      Types$PbDuration var1;
      if (this.timeIntervalBuilder_ == null) {
         if (this.timeInterval_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.timeInterval_;
         }
      } else {
         var1 = (Types$PbDuration)this.timeIntervalBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getTimeIntervalBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getTimeIntervalFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getTimeIntervalOrBuilder() {
      Object var1;
      if (this.timeIntervalBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.timeIntervalBuilder_.getMessageOrBuilder();
      } else if (this.timeInterval_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeInterval_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public boolean hasStartTime() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeInterval() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseRRSamples.b().ensureFieldAccessorsInitialized(ExerciseRRSamples$PbRROffline.class, ExerciseRRSamples$PbRROffline$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasStartTime() && this.hasTimeInterval()) {
         var1 = true;
      }

      return var1;
   }

   public ExerciseRRSamples$PbRROffline$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseRRSamples$PbRROffline var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (ExerciseRRSamples$PbRROffline)ExerciseRRSamples$PbRROffline.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (ExerciseRRSamples$PbRROffline)var10.getUnfinishedMessage();
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

   public ExerciseRRSamples$PbRROffline$Builder mergeFrom(Message var1) {
      ExerciseRRSamples$PbRROffline$Builder var2;
      if (var1 instanceof ExerciseRRSamples$PbRROffline) {
         var2 = this.mergeFrom((ExerciseRRSamples$PbRROffline)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseRRSamples$PbRROffline$Builder mergeFrom(ExerciseRRSamples$PbRROffline var1) {
      if (var1 != ExerciseRRSamples$PbRROffline.getDefaultInstance()) {
         if (var1.hasStartTime()) {
            this.mergeStartTime(var1.getStartTime());
         }

         if (var1.hasTimeInterval()) {
            this.mergeTimeInterval(var1.getTimeInterval());
         }

         this.mergeUnknownFields(ExerciseRRSamples$PbRROffline.a(var1));
         this.onChanged();
      }

      return this;
   }

   public ExerciseRRSamples$PbRROffline$Builder mergeStartTime(Types$PbDuration var1) {
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

   public ExerciseRRSamples$PbRROffline$Builder mergeTimeInterval(Types$PbDuration var1) {
      if (this.timeIntervalBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.timeInterval_ != null && this.timeInterval_ != Types$PbDuration.getDefaultInstance()) {
            this.timeInterval_ = Types$PbDuration.newBuilder(this.timeInterval_).mergeFrom(var1).buildPartial();
         } else {
            this.timeInterval_ = var1;
         }

         this.onChanged();
      } else {
         this.timeIntervalBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final ExerciseRRSamples$PbRROffline$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseRRSamples$PbRROffline$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseRRSamples$PbRROffline$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseRRSamples$PbRROffline$Builder)super.setField(var1, var2);
   }

   public ExerciseRRSamples$PbRROffline$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseRRSamples$PbRROffline$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public ExerciseRRSamples$PbRROffline$Builder setStartTime(Types$PbDuration$Builder var1) {
      if (this.startTimeBuilder_ == null) {
         this.startTime_ = var1.build();
         this.onChanged();
      } else {
         this.startTimeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ExerciseRRSamples$PbRROffline$Builder setStartTime(Types$PbDuration var1) {
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

   public ExerciseRRSamples$PbRROffline$Builder setTimeInterval(Types$PbDuration$Builder var1) {
      if (this.timeIntervalBuilder_ == null) {
         this.timeInterval_ = var1.build();
         this.onChanged();
      } else {
         this.timeIntervalBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public ExerciseRRSamples$PbRROffline$Builder setTimeInterval(Types$PbDuration var1) {
      if (this.timeIntervalBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.timeInterval_ = var1;
         this.onChanged();
      } else {
         this.timeIntervalBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final ExerciseRRSamples$PbRROffline$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseRRSamples$PbRROffline$Builder)super.setUnknownFields(var1);
   }
}
