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

public final class ExercisePhase$PbPhases$Builder extends Builder implements ExercisePhase$PbPhasesOrBuilder {
   private int bitField0_;
   private RepeatedFieldBuilderV3 phaseBuilder_;
   private List phase_;

   private ExercisePhase$PbPhases$Builder() {
      this.phase_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   private ExercisePhase$PbPhases$Builder(BuilderParent var1) {
      super(var1);
      this.phase_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExercisePhase$PbPhases$Builder(BuilderParent var1, ExercisePhase$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExercisePhase$PbPhases$Builder(ExercisePhase$1 var1) {
      this();
   }

   private void ensurePhaseIsMutable() {
      if ((this.bitField0_ & 1) != 1) {
         this.phase_ = new ArrayList(this.phase_);
         this.bitField0_ |= 1;
      }

   }

   public static final Descriptor getDescriptor() {
      return ExercisePhase.i();
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
      if (ExercisePhase$PbPhases.b()) {
         this.getPhaseFieldBuilder();
      }

   }

   public ExercisePhase$PbPhases$Builder addAllPhase(Iterable var1) {
      if (this.phaseBuilder_ == null) {
         this.ensurePhaseIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.phase_);
         this.onChanged();
      } else {
         this.phaseBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public ExercisePhase$PbPhases$Builder addPhase(int var1, ExercisePhase$PbPhase$Builder var2) {
      if (this.phaseBuilder_ == null) {
         this.ensurePhaseIsMutable();
         this.phase_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.phaseBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public ExercisePhase$PbPhases$Builder addPhase(int var1, ExercisePhase$PbPhase var2) {
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

   public ExercisePhase$PbPhases$Builder addPhase(ExercisePhase$PbPhase$Builder var1) {
      if (this.phaseBuilder_ == null) {
         this.ensurePhaseIsMutable();
         this.phase_.add(var1.build());
         this.onChanged();
      } else {
         this.phaseBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public ExercisePhase$PbPhases$Builder addPhase(ExercisePhase$PbPhase var1) {
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

   public ExercisePhase$PbPhase$Builder addPhaseBuilder() {
      return (ExercisePhase$PbPhase$Builder)this.getPhaseFieldBuilder().addBuilder(ExercisePhase$PbPhase.getDefaultInstance());
   }

   public ExercisePhase$PbPhase$Builder addPhaseBuilder(int var1) {
      return (ExercisePhase$PbPhase$Builder)this.getPhaseFieldBuilder().addBuilder(var1, ExercisePhase$PbPhase.getDefaultInstance());
   }

   public ExercisePhase$PbPhases$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExercisePhase$PbPhases$Builder)super.addRepeatedField(var1, var2);
   }

   public ExercisePhase$PbPhases build() {
      ExercisePhase$PbPhases var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExercisePhase$PbPhases buildPartial() {
      ExercisePhase$PbPhases var1 = new ExercisePhase$PbPhases(this, (ExercisePhase$1)null);
      int var2 = this.bitField0_;
      if (this.phaseBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1) {
            this.phase_ = Collections.unmodifiableList(this.phase_);
            this.bitField0_ &= -2;
         }

         ExercisePhase$PbPhases.a(var1, this.phase_);
      } else {
         ExercisePhase$PbPhases.a(var1, this.phaseBuilder_.build());
      }

      this.onBuilt();
      return var1;
   }

   public ExercisePhase$PbPhases$Builder clear() {
      super.clear();
      if (this.phaseBuilder_ == null) {
         this.phase_ = Collections.emptyList();
         this.bitField0_ &= -2;
      } else {
         this.phaseBuilder_.clear();
      }

      return this;
   }

   public ExercisePhase$PbPhases$Builder clearField(FieldDescriptor var1) {
      return (ExercisePhase$PbPhases$Builder)super.clearField(var1);
   }

   public ExercisePhase$PbPhases$Builder clearOneof(OneofDescriptor var1) {
      return (ExercisePhase$PbPhases$Builder)super.clearOneof(var1);
   }

   public ExercisePhase$PbPhases$Builder clearPhase() {
      if (this.phaseBuilder_ == null) {
         this.phase_ = Collections.emptyList();
         this.bitField0_ &= -2;
         this.onChanged();
      } else {
         this.phaseBuilder_.clear();
      }

      return this;
   }

   public ExercisePhase$PbPhases$Builder clone() {
      return (ExercisePhase$PbPhases$Builder)super.clone();
   }

   public ExercisePhase$PbPhases getDefaultInstanceForType() {
      return ExercisePhase$PbPhases.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExercisePhase.i();
   }

   public ExercisePhase$PbPhase getPhase(int var1) {
      ExercisePhase$PbPhase var2;
      if (this.phaseBuilder_ == null) {
         var2 = (ExercisePhase$PbPhase)this.phase_.get(var1);
      } else {
         var2 = (ExercisePhase$PbPhase)this.phaseBuilder_.getMessage(var1);
      }

      return var2;
   }

   public ExercisePhase$PbPhase$Builder getPhaseBuilder(int var1) {
      return (ExercisePhase$PbPhase$Builder)this.getPhaseFieldBuilder().getBuilder(var1);
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

   public ExercisePhase$PbPhaseOrBuilder getPhaseOrBuilder(int var1) {
      ExercisePhase$PbPhaseOrBuilder var2;
      if (this.phaseBuilder_ == null) {
         var2 = (ExercisePhase$PbPhaseOrBuilder)this.phase_.get(var1);
      } else {
         var2 = (ExercisePhase$PbPhaseOrBuilder)this.phaseBuilder_.getMessageOrBuilder(var1);
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
      return ExercisePhase.j().ensureFieldAccessorsInitialized(ExercisePhase$PbPhases.class, ExercisePhase$PbPhases$Builder.class);
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

   public ExercisePhase$PbPhases$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExercisePhase$PbPhases var13;
      label96: {
         InvalidProtocolBufferException var12;
         ExercisePhase$PbPhases var14;
         try {
            var13 = (ExercisePhase$PbPhases)ExercisePhase$PbPhases.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (ExercisePhase$PbPhases)var10.getUnfinishedMessage();
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

   public ExercisePhase$PbPhases$Builder mergeFrom(Message var1) {
      ExercisePhase$PbPhases$Builder var2;
      if (var1 instanceof ExercisePhase$PbPhases) {
         var2 = this.mergeFrom((ExercisePhase$PbPhases)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExercisePhase$PbPhases$Builder mergeFrom(ExercisePhase$PbPhases var1) {
      RepeatedFieldBuilderV3 var2 = null;
      if (var1 != ExercisePhase$PbPhases.getDefaultInstance()) {
         if (this.phaseBuilder_ == null) {
            if (!ExercisePhase$PbPhases.a(var1).isEmpty()) {
               if (this.phase_.isEmpty()) {
                  this.phase_ = ExercisePhase$PbPhases.a(var1);
                  this.bitField0_ &= -2;
               } else {
                  this.ensurePhaseIsMutable();
                  this.phase_.addAll(ExercisePhase$PbPhases.a(var1));
               }

               this.onChanged();
            }
         } else if (!ExercisePhase$PbPhases.a(var1).isEmpty()) {
            if (this.phaseBuilder_.isEmpty()) {
               this.phaseBuilder_.dispose();
               this.phaseBuilder_ = null;
               this.phase_ = ExercisePhase$PbPhases.a(var1);
               this.bitField0_ &= -2;
               if (ExercisePhase$PbPhases.c()) {
                  var2 = this.getPhaseFieldBuilder();
               }

               this.phaseBuilder_ = var2;
            } else {
               this.phaseBuilder_.addAllMessages(ExercisePhase$PbPhases.a(var1));
            }
         }

         this.mergeUnknownFields(ExercisePhase$PbPhases.b(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExercisePhase$PbPhases$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExercisePhase$PbPhases$Builder)super.mergeUnknownFields(var1);
   }

   public ExercisePhase$PbPhases$Builder removePhase(int var1) {
      if (this.phaseBuilder_ == null) {
         this.ensurePhaseIsMutable();
         this.phase_.remove(var1);
         this.onChanged();
      } else {
         this.phaseBuilder_.remove(var1);
      }

      return this;
   }

   public ExercisePhase$PbPhases$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExercisePhase$PbPhases$Builder)super.setField(var1, var2);
   }

   public ExercisePhase$PbPhases$Builder setPhase(int var1, ExercisePhase$PbPhase$Builder var2) {
      if (this.phaseBuilder_ == null) {
         this.ensurePhaseIsMutable();
         this.phase_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.phaseBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public ExercisePhase$PbPhases$Builder setPhase(int var1, ExercisePhase$PbPhase var2) {
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

   public ExercisePhase$PbPhases$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExercisePhase$PbPhases$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExercisePhase$PbPhases$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExercisePhase$PbPhases$Builder)super.setUnknownFields(var1);
   }
}
