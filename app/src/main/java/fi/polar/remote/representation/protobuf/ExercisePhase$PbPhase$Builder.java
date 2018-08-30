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

public final class ExercisePhase$PbPhase$Builder extends Builder implements ExercisePhase$PbPhaseOrBuilder {
   private int bitField0_;
   private int change_;
   private SingleFieldBuilderV3 goalBuilder_;
   private ExercisePhase$PbPhaseGoal goal_;
   private SingleFieldBuilderV3 intensityBuilder_;
   private ExercisePhase$PbPhaseIntensity intensity_;
   private int jumpIndex_;
   private SingleFieldBuilderV3 nameBuilder_;
   private Structures$PbOneLineText name_;
   private int repeatCount_;

   private ExercisePhase$PbPhase$Builder() {
      this.name_ = null;
      this.change_ = 0;
      this.goal_ = null;
      this.intensity_ = null;
      this.maybeForceBuilderInitialization();
   }

   private ExercisePhase$PbPhase$Builder(BuilderParent var1) {
      super(var1);
      this.name_ = null;
      this.change_ = 0;
      this.goal_ = null;
      this.intensity_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExercisePhase$PbPhase$Builder(BuilderParent var1, ExercisePhase$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExercisePhase$PbPhase$Builder(ExercisePhase$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExercisePhase.g();
   }

   private SingleFieldBuilderV3 getGoalFieldBuilder() {
      if (this.goalBuilder_ == null) {
         this.goalBuilder_ = new SingleFieldBuilderV3(this.getGoal(), this.getParentForChildren(), this.isClean());
         this.goal_ = null;
      }

      return this.goalBuilder_;
   }

   private SingleFieldBuilderV3 getIntensityFieldBuilder() {
      if (this.intensityBuilder_ == null) {
         this.intensityBuilder_ = new SingleFieldBuilderV3(this.getIntensity(), this.getParentForChildren(), this.isClean());
         this.intensity_ = null;
      }

      return this.intensityBuilder_;
   }

   private SingleFieldBuilderV3 getNameFieldBuilder() {
      if (this.nameBuilder_ == null) {
         this.nameBuilder_ = new SingleFieldBuilderV3(this.getName(), this.getParentForChildren(), this.isClean());
         this.name_ = null;
      }

      return this.nameBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (ExercisePhase$PbPhase.b()) {
         this.getNameFieldBuilder();
         this.getGoalFieldBuilder();
         this.getIntensityFieldBuilder();
      }

   }

   public ExercisePhase$PbPhase$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExercisePhase$PbPhase$Builder)super.addRepeatedField(var1, var2);
   }

   public ExercisePhase$PbPhase build() {
      ExercisePhase$PbPhase var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExercisePhase$PbPhase buildPartial() {
      ExercisePhase$PbPhase var1 = new ExercisePhase$PbPhase(this, (ExercisePhase$1)null);
      int var2 = this.bitField0_;
      byte var3 = 0;
      if ((var2 & 1) == 1) {
         var3 = 1;
      }

      if (this.nameBuilder_ == null) {
         ExercisePhase$PbPhase.a(var1, this.name_);
      } else {
         ExercisePhase$PbPhase.a(var1, (Structures$PbOneLineText)this.nameBuilder_.build());
      }

      int var4 = var3;
      if ((var2 & 2) == 2) {
         var4 = var3 | 2;
      }

      ExercisePhase$PbPhase.a(var1, this.change_);
      int var5 = var4;
      if ((var2 & 4) == 4) {
         var5 = var4 | 4;
      }

      if (this.goalBuilder_ == null) {
         ExercisePhase$PbPhase.a(var1, this.goal_);
      } else {
         ExercisePhase$PbPhase.a(var1, (ExercisePhase$PbPhaseGoal)this.goalBuilder_.build());
      }

      var4 = var5;
      if ((var2 & 8) == 8) {
         var4 = var5 | 8;
      }

      if (this.intensityBuilder_ == null) {
         ExercisePhase$PbPhase.a(var1, this.intensity_);
      } else {
         ExercisePhase$PbPhase.a(var1, (ExercisePhase$PbPhaseIntensity)this.intensityBuilder_.build());
      }

      var5 = var4;
      if ((var2 & 16) == 16) {
         var5 = var4 | 16;
      }

      ExercisePhase$PbPhase.b(var1, this.repeatCount_);
      var4 = var5;
      if ((var2 & 32) == 32) {
         var4 = var5 | 32;
      }

      ExercisePhase$PbPhase.c(var1, this.jumpIndex_);
      ExercisePhase$PbPhase.d(var1, var4);
      this.onBuilt();
      return var1;
   }

   public ExercisePhase$PbPhase$Builder clear() {
      super.clear();
      if (this.nameBuilder_ == null) {
         this.name_ = null;
      } else {
         this.nameBuilder_.clear();
      }

      this.bitField0_ &= -2;
      this.change_ = 0;
      this.bitField0_ &= -3;
      if (this.goalBuilder_ == null) {
         this.goal_ = null;
      } else {
         this.goalBuilder_.clear();
      }

      this.bitField0_ &= -5;
      if (this.intensityBuilder_ == null) {
         this.intensity_ = null;
      } else {
         this.intensityBuilder_.clear();
      }

      this.bitField0_ &= -9;
      this.repeatCount_ = 0;
      this.bitField0_ &= -17;
      this.jumpIndex_ = 0;
      this.bitField0_ &= -33;
      return this;
   }

   public ExercisePhase$PbPhase$Builder clearChange() {
      this.bitField0_ &= -3;
      this.change_ = 0;
      this.onChanged();
      return this;
   }

   public ExercisePhase$PbPhase$Builder clearField(FieldDescriptor var1) {
      return (ExercisePhase$PbPhase$Builder)super.clearField(var1);
   }

   public ExercisePhase$PbPhase$Builder clearGoal() {
      if (this.goalBuilder_ == null) {
         this.goal_ = null;
         this.onChanged();
      } else {
         this.goalBuilder_.clear();
      }

      this.bitField0_ &= -5;
      return this;
   }

   public ExercisePhase$PbPhase$Builder clearIntensity() {
      if (this.intensityBuilder_ == null) {
         this.intensity_ = null;
         this.onChanged();
      } else {
         this.intensityBuilder_.clear();
      }

      this.bitField0_ &= -9;
      return this;
   }

   public ExercisePhase$PbPhase$Builder clearJumpIndex() {
      this.bitField0_ &= -33;
      this.jumpIndex_ = 0;
      this.onChanged();
      return this;
   }

   public ExercisePhase$PbPhase$Builder clearName() {
      if (this.nameBuilder_ == null) {
         this.name_ = null;
         this.onChanged();
      } else {
         this.nameBuilder_.clear();
      }

      this.bitField0_ &= -2;
      return this;
   }

   public ExercisePhase$PbPhase$Builder clearOneof(OneofDescriptor var1) {
      return (ExercisePhase$PbPhase$Builder)super.clearOneof(var1);
   }

   public ExercisePhase$PbPhase$Builder clearRepeatCount() {
      this.bitField0_ &= -17;
      this.repeatCount_ = 0;
      this.onChanged();
      return this;
   }

   public ExercisePhase$PbPhase$Builder clone() {
      return (ExercisePhase$PbPhase$Builder)super.clone();
   }

   public ExercisePhase$PbPhase$PbPhaseChangeType getChange() {
      ExercisePhase$PbPhase$PbPhaseChangeType var1 = ExercisePhase$PbPhase$PbPhaseChangeType.valueOf(this.change_);
      ExercisePhase$PbPhase$PbPhaseChangeType var2 = var1;
      if (var1 == null) {
         var2 = ExercisePhase$PbPhase$PbPhaseChangeType.CHANGE_MANUAL;
      }

      return var2;
   }

   public ExercisePhase$PbPhase getDefaultInstanceForType() {
      return ExercisePhase$PbPhase.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExercisePhase.g();
   }

   public ExercisePhase$PbPhaseGoal getGoal() {
      ExercisePhase$PbPhaseGoal var1;
      if (this.goalBuilder_ == null) {
         if (this.goal_ == null) {
            var1 = ExercisePhase$PbPhaseGoal.getDefaultInstance();
         } else {
            var1 = this.goal_;
         }
      } else {
         var1 = (ExercisePhase$PbPhaseGoal)this.goalBuilder_.getMessage();
      }

      return var1;
   }

   public ExercisePhase$PbPhaseGoal$Builder getGoalBuilder() {
      this.bitField0_ |= 4;
      this.onChanged();
      return (ExercisePhase$PbPhaseGoal$Builder)this.getGoalFieldBuilder().getBuilder();
   }

   public ExercisePhase$PbPhaseGoalOrBuilder getGoalOrBuilder() {
      Object var1;
      if (this.goalBuilder_ != null) {
         var1 = (ExercisePhase$PbPhaseGoalOrBuilder)this.goalBuilder_.getMessageOrBuilder();
      } else if (this.goal_ == null) {
         var1 = ExercisePhase$PbPhaseGoal.getDefaultInstance();
      } else {
         var1 = this.goal_;
      }

      return (ExercisePhase$PbPhaseGoalOrBuilder)var1;
   }

   public ExercisePhase$PbPhaseIntensity getIntensity() {
      ExercisePhase$PbPhaseIntensity var1;
      if (this.intensityBuilder_ == null) {
         if (this.intensity_ == null) {
            var1 = ExercisePhase$PbPhaseIntensity.getDefaultInstance();
         } else {
            var1 = this.intensity_;
         }
      } else {
         var1 = (ExercisePhase$PbPhaseIntensity)this.intensityBuilder_.getMessage();
      }

      return var1;
   }

   public ExercisePhase$PbPhaseIntensity$Builder getIntensityBuilder() {
      this.bitField0_ |= 8;
      this.onChanged();
      return (ExercisePhase$PbPhaseIntensity$Builder)this.getIntensityFieldBuilder().getBuilder();
   }

   public ExercisePhase$PbPhaseIntensityOrBuilder getIntensityOrBuilder() {
      Object var1;
      if (this.intensityBuilder_ != null) {
         var1 = (ExercisePhase$PbPhaseIntensityOrBuilder)this.intensityBuilder_.getMessageOrBuilder();
      } else if (this.intensity_ == null) {
         var1 = ExercisePhase$PbPhaseIntensity.getDefaultInstance();
      } else {
         var1 = this.intensity_;
      }

      return (ExercisePhase$PbPhaseIntensityOrBuilder)var1;
   }

   public int getJumpIndex() {
      return this.jumpIndex_;
   }

   public Structures$PbOneLineText getName() {
      Structures$PbOneLineText var1;
      if (this.nameBuilder_ == null) {
         if (this.name_ == null) {
            var1 = Structures$PbOneLineText.getDefaultInstance();
         } else {
            var1 = this.name_;
         }
      } else {
         var1 = (Structures$PbOneLineText)this.nameBuilder_.getMessage();
      }

      return var1;
   }

   public Structures$PbOneLineText$Builder getNameBuilder() {
      this.bitField0_ |= 1;
      this.onChanged();
      return (Structures$PbOneLineText$Builder)this.getNameFieldBuilder().getBuilder();
   }

   public Structures$PbOneLineTextOrBuilder getNameOrBuilder() {
      Object var1;
      if (this.nameBuilder_ != null) {
         var1 = (Structures$PbOneLineTextOrBuilder)this.nameBuilder_.getMessageOrBuilder();
      } else if (this.name_ == null) {
         var1 = Structures$PbOneLineText.getDefaultInstance();
      } else {
         var1 = this.name_;
      }

      return (Structures$PbOneLineTextOrBuilder)var1;
   }

   public int getRepeatCount() {
      return this.repeatCount_;
   }

   public boolean hasChange() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasGoal() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasIntensity() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasJumpIndex() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasName() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasRepeatCount() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExercisePhase.h().ensureFieldAccessorsInitialized(ExercisePhase$PbPhase.class, ExercisePhase$PbPhase$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasName()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasChange()) {
            var2 = var1;
            if (this.hasGoal()) {
               var2 = var1;
               if (this.hasIntensity()) {
                  var2 = var1;
                  if (this.getName().isInitialized()) {
                     var2 = var1;
                     if (this.getGoal().isInitialized()) {
                        var2 = var1;
                        if (this.getIntensity().isInitialized()) {
                           var2 = true;
                        }
                     }
                  }
               }
            }
         }
      }

      return var2;
   }

   public ExercisePhase$PbPhase$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExercisePhase$PbPhase var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (ExercisePhase$PbPhase)ExercisePhase$PbPhase.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (ExercisePhase$PbPhase)var10.getUnfinishedMessage();
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

   public ExercisePhase$PbPhase$Builder mergeFrom(Message var1) {
      ExercisePhase$PbPhase$Builder var2;
      if (var1 instanceof ExercisePhase$PbPhase) {
         var2 = this.mergeFrom((ExercisePhase$PbPhase)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExercisePhase$PbPhase$Builder mergeFrom(ExercisePhase$PbPhase var1) {
      if (var1 != ExercisePhase$PbPhase.getDefaultInstance()) {
         if (var1.hasName()) {
            this.mergeName(var1.getName());
         }

         if (var1.hasChange()) {
            this.setChange(var1.getChange());
         }

         if (var1.hasGoal()) {
            this.mergeGoal(var1.getGoal());
         }

         if (var1.hasIntensity()) {
            this.mergeIntensity(var1.getIntensity());
         }

         if (var1.hasRepeatCount()) {
            this.setRepeatCount(var1.getRepeatCount());
         }

         if (var1.hasJumpIndex()) {
            this.setJumpIndex(var1.getJumpIndex());
         }

         this.mergeUnknownFields(ExercisePhase$PbPhase.a(var1));
         this.onChanged();
      }

      return this;
   }

   public ExercisePhase$PbPhase$Builder mergeGoal(ExercisePhase$PbPhaseGoal var1) {
      if (this.goalBuilder_ == null) {
         if ((this.bitField0_ & 4) == 4 && this.goal_ != null && this.goal_ != ExercisePhase$PbPhaseGoal.getDefaultInstance()) {
            this.goal_ = ExercisePhase$PbPhaseGoal.newBuilder(this.goal_).mergeFrom(var1).buildPartial();
         } else {
            this.goal_ = var1;
         }

         this.onChanged();
      } else {
         this.goalBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public ExercisePhase$PbPhase$Builder mergeIntensity(ExercisePhase$PbPhaseIntensity var1) {
      if (this.intensityBuilder_ == null) {
         if ((this.bitField0_ & 8) == 8 && this.intensity_ != null && this.intensity_ != ExercisePhase$PbPhaseIntensity.getDefaultInstance()) {
            this.intensity_ = ExercisePhase$PbPhaseIntensity.newBuilder(this.intensity_).mergeFrom(var1).buildPartial();
         } else {
            this.intensity_ = var1;
         }

         this.onChanged();
      } else {
         this.intensityBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public ExercisePhase$PbPhase$Builder mergeName(Structures$PbOneLineText var1) {
      if (this.nameBuilder_ == null) {
         if ((this.bitField0_ & 1) == 1 && this.name_ != null && this.name_ != Structures$PbOneLineText.getDefaultInstance()) {
            this.name_ = Structures$PbOneLineText.newBuilder(this.name_).mergeFrom(var1).buildPartial();
         } else {
            this.name_ = var1;
         }

         this.onChanged();
      } else {
         this.nameBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public final ExercisePhase$PbPhase$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExercisePhase$PbPhase$Builder)super.mergeUnknownFields(var1);
   }

   public ExercisePhase$PbPhase$Builder setChange(ExercisePhase$PbPhase$PbPhaseChangeType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.change_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public ExercisePhase$PbPhase$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExercisePhase$PbPhase$Builder)super.setField(var1, var2);
   }

   public ExercisePhase$PbPhase$Builder setGoal(ExercisePhase$PbPhaseGoal$Builder var1) {
      if (this.goalBuilder_ == null) {
         this.goal_ = var1.build();
         this.onChanged();
      } else {
         this.goalBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 4;
      return this;
   }

   public ExercisePhase$PbPhase$Builder setGoal(ExercisePhase$PbPhaseGoal var1) {
      if (this.goalBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.goal_ = var1;
         this.onChanged();
      } else {
         this.goalBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 4;
      return this;
   }

   public ExercisePhase$PbPhase$Builder setIntensity(ExercisePhase$PbPhaseIntensity$Builder var1) {
      if (this.intensityBuilder_ == null) {
         this.intensity_ = var1.build();
         this.onChanged();
      } else {
         this.intensityBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8;
      return this;
   }

   public ExercisePhase$PbPhase$Builder setIntensity(ExercisePhase$PbPhaseIntensity var1) {
      if (this.intensityBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.intensity_ = var1;
         this.onChanged();
      } else {
         this.intensityBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public ExercisePhase$PbPhase$Builder setJumpIndex(int var1) {
      this.bitField0_ |= 32;
      this.jumpIndex_ = var1;
      this.onChanged();
      return this;
   }

   public ExercisePhase$PbPhase$Builder setName(Structures$PbOneLineText$Builder var1) {
      if (this.nameBuilder_ == null) {
         this.name_ = var1.build();
         this.onChanged();
      } else {
         this.nameBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ExercisePhase$PbPhase$Builder setName(Structures$PbOneLineText var1) {
      if (this.nameBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.onChanged();
      } else {
         this.nameBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 1;
      return this;
   }

   public ExercisePhase$PbPhase$Builder setRepeatCount(int var1) {
      this.bitField0_ |= 16;
      this.repeatCount_ = var1;
      this.onChanged();
      return this;
   }

   public ExercisePhase$PbPhase$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExercisePhase$PbPhase$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExercisePhase$PbPhase$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExercisePhase$PbPhase$Builder)super.setUnknownFields(var1);
   }
}
