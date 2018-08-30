package fi.polar.remote.representation.protobuf;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.RepeatedFieldBuilderV3;
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

public final class ExerciseRRSamples$PbExerciseRRIntervals$Builder extends Builder implements ExerciseRRSamples$PbExerciseRRIntervalsOrBuilder {
   private int bitField0_;
   private List rrIntervals_;
   private RepeatedFieldBuilderV3 rrSensorOfflineBuilder_;
   private List rrSensorOffline_;

   private ExerciseRRSamples$PbExerciseRRIntervals$Builder() {
      this.rrIntervals_ = Collections.emptyList();
      this.rrSensorOffline_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   private ExerciseRRSamples$PbExerciseRRIntervals$Builder(BuilderParent var1) {
      super(var1);
      this.rrIntervals_ = Collections.emptyList();
      this.rrSensorOffline_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseRRSamples$PbExerciseRRIntervals$Builder(BuilderParent var1, ExerciseRRSamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseRRSamples$PbExerciseRRIntervals$Builder(ExerciseRRSamples$1 var1) {
      this();
   }

   private void ensureRrIntervalsIsMutable() {
      if ((this.bitField0_ & 1) != 1) {
         this.rrIntervals_ = new ArrayList(this.rrIntervals_);
         this.bitField0_ |= 1;
      }

   }

   private void ensureRrSensorOfflineIsMutable() {
      if ((this.bitField0_ & 2) != 2) {
         this.rrSensorOffline_ = new ArrayList(this.rrSensorOffline_);
         this.bitField0_ |= 2;
      }

   }

   public static final Descriptor getDescriptor() {
      return ExerciseRRSamples.c();
   }

   private RepeatedFieldBuilderV3 getRrSensorOfflineFieldBuilder() {
      if (this.rrSensorOfflineBuilder_ == null) {
         List var1 = this.rrSensorOffline_;
         boolean var2;
         if ((this.bitField0_ & 2) == 2) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.rrSensorOfflineBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.rrSensorOffline_ = null;
      }

      return this.rrSensorOfflineBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseRRSamples$PbExerciseRRIntervals.b()) {
         this.getRrSensorOfflineFieldBuilder();
      }

   }

   public ExerciseRRSamples$PbExerciseRRIntervals$Builder addAllRrIntervals(Iterable var1) {
      this.ensureRrIntervalsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.rrIntervals_);
      this.onChanged();
      return this;
   }

   public ExerciseRRSamples$PbExerciseRRIntervals$Builder addAllRrSensorOffline(Iterable var1) {
      if (this.rrSensorOfflineBuilder_ == null) {
         this.ensureRrSensorOfflineIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.rrSensorOffline_);
         this.onChanged();
      } else {
         this.rrSensorOfflineBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExerciseRRSamples$PbExerciseRRIntervals$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseRRSamples$PbExerciseRRIntervals$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseRRSamples$PbExerciseRRIntervals$Builder addRrIntervals(int var1) {
      this.ensureRrIntervalsIsMutable();
      this.rrIntervals_.add(var1);
      this.onChanged();
      return this;
   }

   public ExerciseRRSamples$PbExerciseRRIntervals$Builder addRrSensorOffline(int var1, ExerciseRRSamples$PbRROffline$Builder var2) {
      if (this.rrSensorOfflineBuilder_ == null) {
         this.ensureRrSensorOfflineIsMutable();
         this.rrSensorOffline_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.rrSensorOfflineBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseRRSamples$PbExerciseRRIntervals$Builder addRrSensorOffline(int var1, ExerciseRRSamples$PbRROffline var2) {
      if (this.rrSensorOfflineBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureRrSensorOfflineIsMutable();
         this.rrSensorOffline_.add(var1, var2);
         this.onChanged();
      } else {
         this.rrSensorOfflineBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExerciseRRSamples$PbExerciseRRIntervals$Builder addRrSensorOffline(ExerciseRRSamples$PbRROffline$Builder var1) {
      if (this.rrSensorOfflineBuilder_ == null) {
         this.ensureRrSensorOfflineIsMutable();
         this.rrSensorOffline_.add(var1.build());
         this.onChanged();
      } else {
         this.rrSensorOfflineBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExerciseRRSamples$PbExerciseRRIntervals$Builder addRrSensorOffline(ExerciseRRSamples$PbRROffline var1) {
      if (this.rrSensorOfflineBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureRrSensorOfflineIsMutable();
         this.rrSensorOffline_.add(var1);
         this.onChanged();
      } else {
         this.rrSensorOfflineBuilder_.addMessage(var1);
      }

      return this;
   }

   public ExerciseRRSamples$PbRROffline$Builder addRrSensorOfflineBuilder() {
      return (ExerciseRRSamples$PbRROffline$Builder)this.getRrSensorOfflineFieldBuilder().addBuilder(ExerciseRRSamples$PbRROffline.getDefaultInstance());
   }

   public ExerciseRRSamples$PbRROffline$Builder addRrSensorOfflineBuilder(int var1) {
      return (ExerciseRRSamples$PbRROffline$Builder)this.getRrSensorOfflineFieldBuilder().addBuilder(var1, ExerciseRRSamples$PbRROffline.getDefaultInstance());
   }

   public ExerciseRRSamples$PbExerciseRRIntervals build() {
      ExerciseRRSamples$PbExerciseRRIntervals var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseRRSamples$PbExerciseRRIntervals buildPartial() {
      ExerciseRRSamples$PbExerciseRRIntervals var1 = new ExerciseRRSamples$PbExerciseRRIntervals(this, (ExerciseRRSamples$1)null);
      int var2 = this.bitField0_;
      if ((this.bitField0_ & 1) == 1) {
         this.rrIntervals_ = Collections.unmodifiableList(this.rrIntervals_);
         this.bitField0_ &= -2;
      }

      ExerciseRRSamples$PbExerciseRRIntervals.a(var1, this.rrIntervals_);
      if (this.rrSensorOfflineBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2) {
            this.rrSensorOffline_ = Collections.unmodifiableList(this.rrSensorOffline_);
            this.bitField0_ &= -3;
         }

         ExerciseRRSamples$PbExerciseRRIntervals.b(var1, this.rrSensorOffline_);
      } else {
         ExerciseRRSamples$PbExerciseRRIntervals.b(var1, this.rrSensorOfflineBuilder_.build());
      }

      this.onBuilt();
      return var1;
   }

   public ExerciseRRSamples$PbExerciseRRIntervals$Builder clear() {
      super.clear();
      this.rrIntervals_ = Collections.emptyList();
      this.bitField0_ &= -2;
      if (this.rrSensorOfflineBuilder_ == null) {
         this.rrSensorOffline_ = Collections.emptyList();
         this.bitField0_ &= -3;
      } else {
         this.rrSensorOfflineBuilder_.clear();
      }

      return this;
   }

   public ExerciseRRSamples$PbExerciseRRIntervals$Builder clearField(FieldDescriptor var1) {
      return (ExerciseRRSamples$PbExerciseRRIntervals$Builder)super.clearField(var1);
   }

   public ExerciseRRSamples$PbExerciseRRIntervals$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseRRSamples$PbExerciseRRIntervals$Builder)super.clearOneof(var1);
   }

   public ExerciseRRSamples$PbExerciseRRIntervals$Builder clearRrIntervals() {
      this.rrIntervals_ = Collections.emptyList();
      this.bitField0_ &= -2;
      this.onChanged();
      return this;
   }

   public ExerciseRRSamples$PbExerciseRRIntervals$Builder clearRrSensorOffline() {
      if (this.rrSensorOfflineBuilder_ == null) {
         this.rrSensorOffline_ = Collections.emptyList();
         this.bitField0_ &= -3;
         this.onChanged();
      } else {
         this.rrSensorOfflineBuilder_.clear();
      }

      return this;
   }

   public ExerciseRRSamples$PbExerciseRRIntervals$Builder clone() {
      return (ExerciseRRSamples$PbExerciseRRIntervals$Builder)super.clone();
   }

   public ExerciseRRSamples$PbExerciseRRIntervals getDefaultInstanceForType() {
      return ExerciseRRSamples$PbExerciseRRIntervals.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseRRSamples.c();
   }

   public int getRrIntervals(int var1) {
      return (Integer)this.rrIntervals_.get(var1);
   }

   public int getRrIntervalsCount() {
      return this.rrIntervals_.size();
   }

   public List getRrIntervalsList() {
      return Collections.unmodifiableList(this.rrIntervals_);
   }

   public ExerciseRRSamples$PbRROffline getRrSensorOffline(int var1) {
      ExerciseRRSamples$PbRROffline var2;
      if (this.rrSensorOfflineBuilder_ == null) {
         var2 = (ExerciseRRSamples$PbRROffline)this.rrSensorOffline_.get(var1);
      } else {
         var2 = (ExerciseRRSamples$PbRROffline)this.rrSensorOfflineBuilder_.getMessage(var1);
      }

      return var2;
   }

   public ExerciseRRSamples$PbRROffline$Builder getRrSensorOfflineBuilder(int var1) {
      return (ExerciseRRSamples$PbRROffline$Builder)this.getRrSensorOfflineFieldBuilder().getBuilder(var1);
   }

   public List getRrSensorOfflineBuilderList() {
      return this.getRrSensorOfflineFieldBuilder().getBuilderList();
   }

   public int getRrSensorOfflineCount() {
      int var1;
      if (this.rrSensorOfflineBuilder_ == null) {
         var1 = this.rrSensorOffline_.size();
      } else {
         var1 = this.rrSensorOfflineBuilder_.getCount();
      }

      return var1;
   }

   public List getRrSensorOfflineList() {
      List var1;
      if (this.rrSensorOfflineBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.rrSensorOffline_);
      } else {
         var1 = this.rrSensorOfflineBuilder_.getMessageList();
      }

      return var1;
   }

   public ExerciseRRSamples$PbRROfflineOrBuilder getRrSensorOfflineOrBuilder(int var1) {
      ExerciseRRSamples$PbRROfflineOrBuilder var2;
      if (this.rrSensorOfflineBuilder_ == null) {
         var2 = (ExerciseRRSamples$PbRROfflineOrBuilder)this.rrSensorOffline_.get(var1);
      } else {
         var2 = (ExerciseRRSamples$PbRROfflineOrBuilder)this.rrSensorOfflineBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getRrSensorOfflineOrBuilderList() {
      List var1;
      if (this.rrSensorOfflineBuilder_ != null) {
         var1 = this.rrSensorOfflineBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.rrSensorOffline_);
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseRRSamples.d().ensureFieldAccessorsInitialized(ExerciseRRSamples$PbExerciseRRIntervals.class, ExerciseRRSamples$PbExerciseRRIntervals$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      int var2 = 0;

      while(true) {
         if (var2 >= this.getRrSensorOfflineCount()) {
            var1 = true;
            break;
         }

         if (!this.getRrSensorOffline(var2).isInitialized()) {
            break;
         }

         ++var2;
      }

      return var1;
   }

   public ExerciseRRSamples$PbExerciseRRIntervals$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseRRSamples$PbExerciseRRIntervals var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (ExerciseRRSamples$PbExerciseRRIntervals)ExerciseRRSamples$PbExerciseRRIntervals.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (ExerciseRRSamples$PbExerciseRRIntervals)var11.getUnfinishedMessage();
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

   public ExerciseRRSamples$PbExerciseRRIntervals$Builder mergeFrom(Message var1) {
      ExerciseRRSamples$PbExerciseRRIntervals$Builder var2;
      if (var1 instanceof ExerciseRRSamples$PbExerciseRRIntervals) {
         var2 = this.mergeFrom((ExerciseRRSamples$PbExerciseRRIntervals)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseRRSamples$PbExerciseRRIntervals$Builder mergeFrom(ExerciseRRSamples$PbExerciseRRIntervals var1) {
      RepeatedFieldBuilderV3 var2 = null;
      if (var1 != ExerciseRRSamples$PbExerciseRRIntervals.getDefaultInstance()) {
         if (!ExerciseRRSamples$PbExerciseRRIntervals.a(var1).isEmpty()) {
            if (this.rrIntervals_.isEmpty()) {
               this.rrIntervals_ = ExerciseRRSamples$PbExerciseRRIntervals.a(var1);
               this.bitField0_ &= -2;
            } else {
               this.ensureRrIntervalsIsMutable();
               this.rrIntervals_.addAll(ExerciseRRSamples$PbExerciseRRIntervals.a(var1));
            }

            this.onChanged();
         }

         if (this.rrSensorOfflineBuilder_ == null) {
            if (!ExerciseRRSamples$PbExerciseRRIntervals.b(var1).isEmpty()) {
               if (this.rrSensorOffline_.isEmpty()) {
                  this.rrSensorOffline_ = ExerciseRRSamples$PbExerciseRRIntervals.b(var1);
                  this.bitField0_ &= -3;
               } else {
                  this.ensureRrSensorOfflineIsMutable();
                  this.rrSensorOffline_.addAll(ExerciseRRSamples$PbExerciseRRIntervals.b(var1));
               }

               this.onChanged();
            }
         } else if (!ExerciseRRSamples$PbExerciseRRIntervals.b(var1).isEmpty()) {
            if (this.rrSensorOfflineBuilder_.isEmpty()) {
               this.rrSensorOfflineBuilder_.dispose();
               this.rrSensorOfflineBuilder_ = null;
               this.rrSensorOffline_ = ExerciseRRSamples$PbExerciseRRIntervals.b(var1);
               this.bitField0_ &= -3;
               if (ExerciseRRSamples$PbExerciseRRIntervals.c()) {
                  var2 = this.getRrSensorOfflineFieldBuilder();
               }

               this.rrSensorOfflineBuilder_ = var2;
            } else {
               this.rrSensorOfflineBuilder_.addAllMessages(ExerciseRRSamples$PbExerciseRRIntervals.b(var1));
            }
         }

         this.mergeUnknownFields(ExerciseRRSamples$PbExerciseRRIntervals.c(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseRRSamples$PbExerciseRRIntervals$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseRRSamples$PbExerciseRRIntervals$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseRRSamples$PbExerciseRRIntervals$Builder removeRrSensorOffline(int var1) {
      if (this.rrSensorOfflineBuilder_ == null) {
         this.ensureRrSensorOfflineIsMutable();
         this.rrSensorOffline_.remove(var1);
         this.onChanged();
      } else {
         this.rrSensorOfflineBuilder_.remove(var1);
      }

      return this;
   }

   public ExerciseRRSamples$PbExerciseRRIntervals$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseRRSamples$PbExerciseRRIntervals$Builder)super.setField(var1, var2);
   }

   public ExerciseRRSamples$PbExerciseRRIntervals$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseRRSamples$PbExerciseRRIntervals$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public ExerciseRRSamples$PbExerciseRRIntervals$Builder setRrIntervals(int var1, int var2) {
      this.ensureRrIntervalsIsMutable();
      this.rrIntervals_.set(var1, var2);
      this.onChanged();
      return this;
   }

   public ExerciseRRSamples$PbExerciseRRIntervals$Builder setRrSensorOffline(int var1, ExerciseRRSamples$PbRROffline$Builder var2) {
      if (this.rrSensorOfflineBuilder_ == null) {
         this.ensureRrSensorOfflineIsMutable();
         this.rrSensorOffline_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.rrSensorOfflineBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExerciseRRSamples$PbExerciseRRIntervals$Builder setRrSensorOffline(int var1, ExerciseRRSamples$PbRROffline var2) {
      if (this.rrSensorOfflineBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureRrSensorOfflineIsMutable();
         this.rrSensorOffline_.set(var1, var2);
         this.onChanged();
      } else {
         this.rrSensorOfflineBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public final ExerciseRRSamples$PbExerciseRRIntervals$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseRRSamples$PbExerciseRRIntervals$Builder)super.setUnknownFields(var1);
   }
}
