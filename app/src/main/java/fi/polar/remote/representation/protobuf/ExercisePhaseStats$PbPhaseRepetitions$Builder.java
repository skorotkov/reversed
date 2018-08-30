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

public final class ExercisePhaseStats$PbPhaseRepetitions$Builder extends Builder implements ExercisePhaseStats$PbPhaseRepetitionsOrBuilder {
   private int bitField0_;
   private RepeatedFieldBuilderV3 phaseBuilder_;
   private List phase_;

   private ExercisePhaseStats$PbPhaseRepetitions$Builder() {
      this.phase_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   private ExercisePhaseStats$PbPhaseRepetitions$Builder(BuilderParent var1) {
      super(var1);
      this.phase_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExercisePhaseStats$PbPhaseRepetitions$Builder(BuilderParent var1, ExercisePhaseStats$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExercisePhaseStats$PbPhaseRepetitions$Builder(ExercisePhaseStats$1 var1) {
      this();
   }

   private void ensurePhaseIsMutable() {
      if ((this.bitField0_ & 1) != 1) {
         this.phase_ = new ArrayList(this.phase_);
         this.bitField0_ |= 1;
      }

   }

   public static final Descriptor getDescriptor() {
      return ExercisePhaseStats.g();
   }

   private RepeatedFieldBuilderV3 getPhaseFieldBuilder() {
      boolean var1 = true;
      if (this.phaseBuilder_ == null) {
         List var2 = this.phase_;
         if ((this.bitField0_ & 1) != 1) {
            var1 = false;
         }

         this.phaseBuilder_ = new RepeatedFieldBuilderV3(var2, var1, this.getParentForChildren(), this.isClean());
         this.phase_ = null;
      }

      return this.phaseBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (ExercisePhaseStats$PbPhaseRepetitions.b()) {
         this.getPhaseFieldBuilder();
      }

   }

   public ExercisePhaseStats$PbPhaseRepetitions$Builder addAllPhase(Iterable var1) {
      if (this.phaseBuilder_ == null) {
         this.ensurePhaseIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.phase_);
         this.onChanged();
      } else {
         this.phaseBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetitions$Builder addPhase(int var1, ExercisePhaseStats$PbPhaseRepetition$Builder var2) {
      if (this.phaseBuilder_ == null) {
         this.ensurePhaseIsMutable();
         this.phase_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.phaseBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetitions$Builder addPhase(int var1, ExercisePhaseStats$PbPhaseRepetition var2) {
      if (this.phaseBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensurePhaseIsMutable();
         this.phase_.add(var1, var2);
         this.onChanged();
      } else {
         this.phaseBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetitions$Builder addPhase(ExercisePhaseStats$PbPhaseRepetition$Builder var1) {
      if (this.phaseBuilder_ == null) {
         this.ensurePhaseIsMutable();
         this.phase_.add(var1.build());
         this.onChanged();
      } else {
         this.phaseBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetitions$Builder addPhase(ExercisePhaseStats$PbPhaseRepetition var1) {
      if (this.phaseBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensurePhaseIsMutable();
         this.phase_.add(var1);
         this.onChanged();
      } else {
         this.phaseBuilder_.addMessage(var1);
      }

      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder addPhaseBuilder() {
      return (ExercisePhaseStats$PbPhaseRepetition$Builder)this.getPhaseFieldBuilder().addBuilder(ExercisePhaseStats$PbPhaseRepetition.getDefaultInstance());
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder addPhaseBuilder(int var1) {
      return (ExercisePhaseStats$PbPhaseRepetition$Builder)this.getPhaseFieldBuilder().addBuilder(var1, ExercisePhaseStats$PbPhaseRepetition.getDefaultInstance());
   }

   public ExercisePhaseStats$PbPhaseRepetitions$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExercisePhaseStats$PbPhaseRepetitions$Builder)super.addRepeatedField(var1, var2);
   }

   public ExercisePhaseStats$PbPhaseRepetitions build() {
      ExercisePhaseStats$PbPhaseRepetitions var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExercisePhaseStats$PbPhaseRepetitions buildPartial() {
      ExercisePhaseStats$PbPhaseRepetitions var1 = new ExercisePhaseStats$PbPhaseRepetitions(this, (ExercisePhaseStats$1)null);
      int var2 = this.bitField0_;
      if (this.phaseBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1) {
            this.phase_ = Collections.unmodifiableList(this.phase_);
            this.bitField0_ &= -2;
         }

         ExercisePhaseStats$PbPhaseRepetitions.a(var1, this.phase_);
      } else {
         ExercisePhaseStats$PbPhaseRepetitions.a(var1, this.phaseBuilder_.build());
      }

      this.onBuilt();
      return var1;
   }

   public ExercisePhaseStats$PbPhaseRepetitions$Builder clear() {
      super.clear();
      if (this.phaseBuilder_ == null) {
         this.phase_ = Collections.emptyList();
         this.bitField0_ &= -2;
      } else {
         this.phaseBuilder_.clear();
      }

      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetitions$Builder clearField(FieldDescriptor var1) {
      return (ExercisePhaseStats$PbPhaseRepetitions$Builder)super.clearField(var1);
   }

   public ExercisePhaseStats$PbPhaseRepetitions$Builder clearOneof(OneofDescriptor var1) {
      return (ExercisePhaseStats$PbPhaseRepetitions$Builder)super.clearOneof(var1);
   }

   public ExercisePhaseStats$PbPhaseRepetitions$Builder clearPhase() {
      if (this.phaseBuilder_ == null) {
         this.phase_ = Collections.emptyList();
         this.bitField0_ &= -2;
         this.onChanged();
      } else {
         this.phaseBuilder_.clear();
      }

      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetitions$Builder clone() {
      return (ExercisePhaseStats$PbPhaseRepetitions$Builder)super.clone();
   }

   public ExercisePhaseStats$PbPhaseRepetitions getDefaultInstanceForType() {
      return ExercisePhaseStats$PbPhaseRepetitions.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExercisePhaseStats.g();
   }

   public ExercisePhaseStats$PbPhaseRepetition getPhase(int var1) {
      ExercisePhaseStats$PbPhaseRepetition var2;
      if (this.phaseBuilder_ == null) {
         var2 = (ExercisePhaseStats$PbPhaseRepetition)this.phase_.get(var1);
      } else {
         var2 = (ExercisePhaseStats$PbPhaseRepetition)this.phaseBuilder_.getMessage(var1);
      }

      return var2;
   }

   public ExercisePhaseStats$PbPhaseRepetition$Builder getPhaseBuilder(int var1) {
      return (ExercisePhaseStats$PbPhaseRepetition$Builder)this.getPhaseFieldBuilder().getBuilder(var1);
   }

   public List getPhaseBuilderList() {
      return this.getPhaseFieldBuilder().getBuilderList();
   }

   public int getPhaseCount() {
      int var1;
      if (this.phaseBuilder_ == null) {
         var1 = this.phase_.size();
      } else {
         var1 = this.phaseBuilder_.getCount();
      }

      return var1;
   }

   public List getPhaseList() {
      List var1;
      if (this.phaseBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.phase_);
      } else {
         var1 = this.phaseBuilder_.getMessageList();
      }

      return var1;
   }

   public ExercisePhaseStats$PbPhaseRepetitionOrBuilder getPhaseOrBuilder(int var1) {
      ExercisePhaseStats$PbPhaseRepetitionOrBuilder var2;
      if (this.phaseBuilder_ == null) {
         var2 = (ExercisePhaseStats$PbPhaseRepetitionOrBuilder)this.phase_.get(var1);
      } else {
         var2 = (ExercisePhaseStats$PbPhaseRepetitionOrBuilder)this.phaseBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getPhaseOrBuilderList() {
      List var1;
      if (this.phaseBuilder_ != null) {
         var1 = this.phaseBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.phase_);
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExercisePhaseStats.h().ensureFieldAccessorsInitialized(ExercisePhaseStats$PbPhaseRepetitions.class, ExercisePhaseStats$PbPhaseRepetitions$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      int var2 = 0;

      while(true) {
         if (var2 >= this.getPhaseCount()) {
            var1 = true;
            break;
         }

         if (!this.getPhase(var2).isInitialized()) {
            break;
         }

         ++var2;
      }

      return var1;
   }

   public ExercisePhaseStats$PbPhaseRepetitions$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExercisePhaseStats$PbPhaseRepetitions var13;
      label96: {
         InvalidProtocolBufferException var12;
         ExercisePhaseStats$PbPhaseRepetitions var14;
         try {
            var13 = (ExercisePhaseStats$PbPhaseRepetitions)ExercisePhaseStats$PbPhaseRepetitions.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (ExercisePhaseStats$PbPhaseRepetitions)var10.getUnfinishedMessage();
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

   public ExercisePhaseStats$PbPhaseRepetitions$Builder mergeFrom(Message var1) {
      ExercisePhaseStats$PbPhaseRepetitions$Builder var2;
      if (var1 instanceof ExercisePhaseStats$PbPhaseRepetitions) {
         var2 = this.mergeFrom((ExercisePhaseStats$PbPhaseRepetitions)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExercisePhaseStats$PbPhaseRepetitions$Builder mergeFrom(ExercisePhaseStats$PbPhaseRepetitions var1) {
      RepeatedFieldBuilderV3 var2 = null;
      if (var1 != ExercisePhaseStats$PbPhaseRepetitions.getDefaultInstance()) {
         if (this.phaseBuilder_ == null) {
            if (!ExercisePhaseStats$PbPhaseRepetitions.a(var1).isEmpty()) {
               if (this.phase_.isEmpty()) {
                  this.phase_ = ExercisePhaseStats$PbPhaseRepetitions.a(var1);
                  this.bitField0_ &= -2;
               } else {
                  this.ensurePhaseIsMutable();
                  this.phase_.addAll(ExercisePhaseStats$PbPhaseRepetitions.a(var1));
               }

               this.onChanged();
            }
         } else if (!ExercisePhaseStats$PbPhaseRepetitions.a(var1).isEmpty()) {
            if (this.phaseBuilder_.isEmpty()) {
               this.phaseBuilder_.dispose();
               this.phaseBuilder_ = null;
               this.phase_ = ExercisePhaseStats$PbPhaseRepetitions.a(var1);
               this.bitField0_ &= -2;
               if (ExercisePhaseStats$PbPhaseRepetitions.c()) {
                  var2 = this.getPhaseFieldBuilder();
               }

               this.phaseBuilder_ = var2;
            } else {
               this.phaseBuilder_.addAllMessages(ExercisePhaseStats$PbPhaseRepetitions.a(var1));
            }
         }

         this.mergeUnknownFields(ExercisePhaseStats$PbPhaseRepetitions.b(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExercisePhaseStats$PbPhaseRepetitions$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExercisePhaseStats$PbPhaseRepetitions$Builder)super.mergeUnknownFields(var1);
   }

   public ExercisePhaseStats$PbPhaseRepetitions$Builder removePhase(int var1) {
      if (this.phaseBuilder_ == null) {
         this.ensurePhaseIsMutable();
         this.phase_.remove(var1);
         this.onChanged();
      } else {
         this.phaseBuilder_.remove(var1);
      }

      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetitions$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExercisePhaseStats$PbPhaseRepetitions$Builder)super.setField(var1, var2);
   }

   public ExercisePhaseStats$PbPhaseRepetitions$Builder setPhase(int var1, ExercisePhaseStats$PbPhaseRepetition$Builder var2) {
      if (this.phaseBuilder_ == null) {
         this.ensurePhaseIsMutable();
         this.phase_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.phaseBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetitions$Builder setPhase(int var1, ExercisePhaseStats$PbPhaseRepetition var2) {
      if (this.phaseBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensurePhaseIsMutable();
         this.phase_.set(var1, var2);
         this.onChanged();
      } else {
         this.phaseBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public ExercisePhaseStats$PbPhaseRepetitions$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExercisePhaseStats$PbPhaseRepetitions$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExercisePhaseStats$PbPhaseRepetitions$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExercisePhaseStats$PbPhaseRepetitions$Builder)super.setUnknownFields(var1);
   }
}
