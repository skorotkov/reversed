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

public final class Structures$PbTrainingLoad$Builder extends Builder implements Structures$PbTrainingLoadOrBuilder {
   private int bitField0_;
   private int carbohydrateConsumption_;
   private int fatConsumption_;
   private int proteinConsumption_;
   private SingleFieldBuilderV3 recoveryTimeBuilder_;
   private Types$PbDuration recoveryTime_;
   private int trainingLoadVal_;

   private Structures$PbTrainingLoad$Builder() {
      this.recoveryTime_ = null;
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbTrainingLoad$Builder(BuilderParent var1) {
      super(var1);
      this.recoveryTime_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbTrainingLoad$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbTrainingLoad$Builder(Structures$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Structures.g();
   }

   private SingleFieldBuilderV3 getRecoveryTimeFieldBuilder() {
      if (this.recoveryTimeBuilder_ == null) {
         this.recoveryTimeBuilder_ = new SingleFieldBuilderV3(this.getRecoveryTime(), this.getParentForChildren(), this.isClean());
         this.recoveryTime_ = null;
      }

      return this.recoveryTimeBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbTrainingLoad.b()) {
         this.getRecoveryTimeFieldBuilder();
      }

   }

   public Structures$PbTrainingLoad$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbTrainingLoad$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbTrainingLoad build() {
      Structures$PbTrainingLoad var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbTrainingLoad buildPartial() {
      int var1 = 1;
      Structures$PbTrainingLoad var2 = new Structures$PbTrainingLoad(this, (Structures$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Structures$PbTrainingLoad.a(var2, this.trainingLoadVal_);
      if ((var3 & 2) == 2) {
         var1 |= 2;
      }

      if (this.recoveryTimeBuilder_ == null) {
         Structures$PbTrainingLoad.a(var2, this.recoveryTime_);
      } else {
         Structures$PbTrainingLoad.a(var2, (Types$PbDuration)this.recoveryTimeBuilder_.build());
      }

      int var4 = var1;
      if ((var3 & 4) == 4) {
         var4 = var1 | 4;
      }

      Structures$PbTrainingLoad.b(var2, this.carbohydrateConsumption_);
      var1 = var4;
      if ((var3 & 8) == 8) {
         var1 = var4 | 8;
      }

      Structures$PbTrainingLoad.c(var2, this.proteinConsumption_);
      var4 = var1;
      if ((var3 & 16) == 16) {
         var4 = var1 | 16;
      }

      Structures$PbTrainingLoad.d(var2, this.fatConsumption_);
      Structures$PbTrainingLoad.e(var2, var4);
      this.onBuilt();
      return var2;
   }

   public Structures$PbTrainingLoad$Builder clear() {
      super.clear();
      this.trainingLoadVal_ = 0;
      this.bitField0_ &= -2;
      if (this.recoveryTimeBuilder_ == null) {
         this.recoveryTime_ = null;
      } else {
         this.recoveryTimeBuilder_.clear();
      }

      this.bitField0_ &= -3;
      this.carbohydrateConsumption_ = 0;
      this.bitField0_ &= -5;
      this.proteinConsumption_ = 0;
      this.bitField0_ &= -9;
      this.fatConsumption_ = 0;
      this.bitField0_ &= -17;
      return this;
   }

   public Structures$PbTrainingLoad$Builder clearCarbohydrateConsumption() {
      this.bitField0_ &= -5;
      this.carbohydrateConsumption_ = 0;
      this.onChanged();
      return this;
   }

   public Structures$PbTrainingLoad$Builder clearFatConsumption() {
      this.bitField0_ &= -17;
      this.fatConsumption_ = 0;
      this.onChanged();
      return this;
   }

   public Structures$PbTrainingLoad$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbTrainingLoad$Builder)super.clearField(var1);
   }

   public Structures$PbTrainingLoad$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbTrainingLoad$Builder)super.clearOneof(var1);
   }

   public Structures$PbTrainingLoad$Builder clearProteinConsumption() {
      this.bitField0_ &= -9;
      this.proteinConsumption_ = 0;
      this.onChanged();
      return this;
   }

   public Structures$PbTrainingLoad$Builder clearRecoveryTime() {
      if (this.recoveryTimeBuilder_ == null) {
         this.recoveryTime_ = null;
         this.onChanged();
      } else {
         this.recoveryTimeBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public Structures$PbTrainingLoad$Builder clearTrainingLoadVal() {
      this.bitField0_ &= -2;
      this.trainingLoadVal_ = 0;
      this.onChanged();
      return this;
   }

   public Structures$PbTrainingLoad$Builder clone() {
      return (Structures$PbTrainingLoad$Builder)super.clone();
   }

   public int getCarbohydrateConsumption() {
      return this.carbohydrateConsumption_;
   }

   public Structures$PbTrainingLoad getDefaultInstanceForType() {
      return Structures$PbTrainingLoad.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.g();
   }

   public int getFatConsumption() {
      return this.fatConsumption_;
   }

   public int getProteinConsumption() {
      return this.proteinConsumption_;
   }

   public Types$PbDuration getRecoveryTime() {
      Types$PbDuration var1;
      if (this.recoveryTimeBuilder_ == null) {
         if (this.recoveryTime_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.recoveryTime_;
         }
      } else {
         var1 = (Types$PbDuration)this.recoveryTimeBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getRecoveryTimeBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getRecoveryTimeFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getRecoveryTimeOrBuilder() {
      Object var1;
      if (this.recoveryTimeBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.recoveryTimeBuilder_.getMessageOrBuilder();
      } else if (this.recoveryTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.recoveryTime_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public int getTrainingLoadVal() {
      return this.trainingLoadVal_;
   }

   public boolean hasCarbohydrateConsumption() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasFatConsumption() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasProteinConsumption() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasRecoveryTime() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTrainingLoadVal() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.h().ensureFieldAccessorsInitialized(Structures$PbTrainingLoad.class, Structures$PbTrainingLoad$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public Structures$PbTrainingLoad$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbTrainingLoad var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (Structures$PbTrainingLoad)Structures$PbTrainingLoad.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (Structures$PbTrainingLoad)var10.getUnfinishedMessage();
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

   public Structures$PbTrainingLoad$Builder mergeFrom(Message var1) {
      Structures$PbTrainingLoad$Builder var2;
      if (var1 instanceof Structures$PbTrainingLoad) {
         var2 = this.mergeFrom((Structures$PbTrainingLoad)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbTrainingLoad$Builder mergeFrom(Structures$PbTrainingLoad var1) {
      if (var1 != Structures$PbTrainingLoad.getDefaultInstance()) {
         if (var1.hasTrainingLoadVal()) {
            this.setTrainingLoadVal(var1.getTrainingLoadVal());
         }

         if (var1.hasRecoveryTime()) {
            this.mergeRecoveryTime(var1.getRecoveryTime());
         }

         if (var1.hasCarbohydrateConsumption()) {
            this.setCarbohydrateConsumption(var1.getCarbohydrateConsumption());
         }

         if (var1.hasProteinConsumption()) {
            this.setProteinConsumption(var1.getProteinConsumption());
         }

         if (var1.hasFatConsumption()) {
            this.setFatConsumption(var1.getFatConsumption());
         }

         this.mergeUnknownFields(Structures$PbTrainingLoad.a(var1));
         this.onChanged();
      }

      return this;
   }

   public Structures$PbTrainingLoad$Builder mergeRecoveryTime(Types$PbDuration var1) {
      if (this.recoveryTimeBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.recoveryTime_ != null && this.recoveryTime_ != Types$PbDuration.getDefaultInstance()) {
            this.recoveryTime_ = Types$PbDuration.newBuilder(this.recoveryTime_).mergeFrom(var1).buildPartial();
         } else {
            this.recoveryTime_ = var1;
         }

         this.onChanged();
      } else {
         this.recoveryTimeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public final Structures$PbTrainingLoad$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbTrainingLoad$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbTrainingLoad$Builder setCarbohydrateConsumption(int var1) {
      this.bitField0_ |= 4;
      this.carbohydrateConsumption_ = var1;
      this.onChanged();
      return this;
   }

   public Structures$PbTrainingLoad$Builder setFatConsumption(int var1) {
      this.bitField0_ |= 16;
      this.fatConsumption_ = var1;
      this.onChanged();
      return this;
   }

   public Structures$PbTrainingLoad$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbTrainingLoad$Builder)super.setField(var1, var2);
   }

   public Structures$PbTrainingLoad$Builder setProteinConsumption(int var1) {
      this.bitField0_ |= 8;
      this.proteinConsumption_ = var1;
      this.onChanged();
      return this;
   }

   public Structures$PbTrainingLoad$Builder setRecoveryTime(Types$PbDuration$Builder var1) {
      if (this.recoveryTimeBuilder_ == null) {
         this.recoveryTime_ = var1.build();
         this.onChanged();
      } else {
         this.recoveryTimeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Structures$PbTrainingLoad$Builder setRecoveryTime(Types$PbDuration var1) {
      if (this.recoveryTimeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.recoveryTime_ = var1;
         this.onChanged();
      } else {
         this.recoveryTimeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Structures$PbTrainingLoad$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbTrainingLoad$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Structures$PbTrainingLoad$Builder setTrainingLoadVal(int var1) {
      this.bitField0_ |= 1;
      this.trainingLoadVal_ = var1;
      this.onChanged();
      return this;
   }

   public final Structures$PbTrainingLoad$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbTrainingLoad$Builder)super.setUnknownFields(var1);
   }
}
