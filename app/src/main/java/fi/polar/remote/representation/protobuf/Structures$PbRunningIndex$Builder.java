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

public final class Structures$PbRunningIndex$Builder extends Builder implements Structures$PbRunningIndexOrBuilder {
   private int bitField0_;
   private SingleFieldBuilderV3 calculationTimeBuilder_;
   private Types$PbDuration calculationTime_;
   private int value_;

   private Structures$PbRunningIndex$Builder() {
      this.calculationTime_ = null;
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbRunningIndex$Builder(BuilderParent var1) {
      super(var1);
      this.calculationTime_ = null;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbRunningIndex$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbRunningIndex$Builder(Structures$1 var1) {
      this();
   }

   private SingleFieldBuilderV3 getCalculationTimeFieldBuilder() {
      if (this.calculationTimeBuilder_ == null) {
         this.calculationTimeBuilder_ = new SingleFieldBuilderV3(this.getCalculationTime(), this.getParentForChildren(), this.isClean());
         this.calculationTime_ = null;
      }

      return this.calculationTimeBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return Structures.w();
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbRunningIndex.b()) {
         this.getCalculationTimeFieldBuilder();
      }

   }

   public Structures$PbRunningIndex$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbRunningIndex$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbRunningIndex build() {
      Structures$PbRunningIndex var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbRunningIndex buildPartial() {
      int var1 = 1;
      Structures$PbRunningIndex var2 = new Structures$PbRunningIndex(this, (Structures$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Structures$PbRunningIndex.a(var2, this.value_);
      if ((var3 & 2) == 2) {
         var1 |= 2;
      }

      if (this.calculationTimeBuilder_ == null) {
         Structures$PbRunningIndex.a(var2, this.calculationTime_);
      } else {
         Structures$PbRunningIndex.a(var2, (Types$PbDuration)this.calculationTimeBuilder_.build());
      }

      Structures$PbRunningIndex.b(var2, var1);
      this.onBuilt();
      return var2;
   }

   public Structures$PbRunningIndex$Builder clear() {
      super.clear();
      this.value_ = 0;
      this.bitField0_ &= -2;
      if (this.calculationTimeBuilder_ == null) {
         this.calculationTime_ = null;
      } else {
         this.calculationTimeBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public Structures$PbRunningIndex$Builder clearCalculationTime() {
      if (this.calculationTimeBuilder_ == null) {
         this.calculationTime_ = null;
         this.onChanged();
      } else {
         this.calculationTimeBuilder_.clear();
      }

      this.bitField0_ &= -3;
      return this;
   }

   public Structures$PbRunningIndex$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbRunningIndex$Builder)super.clearField(var1);
   }

   public Structures$PbRunningIndex$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbRunningIndex$Builder)super.clearOneof(var1);
   }

   public Structures$PbRunningIndex$Builder clearValue() {
      this.bitField0_ &= -2;
      this.value_ = 0;
      this.onChanged();
      return this;
   }

   public Structures$PbRunningIndex$Builder clone() {
      return (Structures$PbRunningIndex$Builder)super.clone();
   }

   public Types$PbDuration getCalculationTime() {
      Types$PbDuration var1;
      if (this.calculationTimeBuilder_ == null) {
         if (this.calculationTime_ == null) {
            var1 = Types$PbDuration.getDefaultInstance();
         } else {
            var1 = this.calculationTime_;
         }
      } else {
         var1 = (Types$PbDuration)this.calculationTimeBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbDuration$Builder getCalculationTimeBuilder() {
      this.bitField0_ |= 2;
      this.onChanged();
      return (Types$PbDuration$Builder)this.getCalculationTimeFieldBuilder().getBuilder();
   }

   public Types$PbDurationOrBuilder getCalculationTimeOrBuilder() {
      Object var1;
      if (this.calculationTimeBuilder_ != null) {
         var1 = (Types$PbDurationOrBuilder)this.calculationTimeBuilder_.getMessageOrBuilder();
      } else if (this.calculationTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.calculationTime_;
      }

      return (Types$PbDurationOrBuilder)var1;
   }

   public Structures$PbRunningIndex getDefaultInstanceForType() {
      return Structures$PbRunningIndex.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.w();
   }

   public int getValue() {
      return this.value_;
   }

   public boolean hasCalculationTime() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasValue() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.x().ensureFieldAccessorsInitialized(Structures$PbRunningIndex.class, Structures$PbRunningIndex$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasValue()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public Structures$PbRunningIndex$Builder mergeCalculationTime(Types$PbDuration var1) {
      if (this.calculationTimeBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2 && this.calculationTime_ != null && this.calculationTime_ != Types$PbDuration.getDefaultInstance()) {
            this.calculationTime_ = Types$PbDuration.newBuilder(this.calculationTime_).mergeFrom(var1).buildPartial();
         } else {
            this.calculationTime_ = var1;
         }

         this.onChanged();
      } else {
         this.calculationTimeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Structures$PbRunningIndex$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbRunningIndex var13;
      label96: {
         InvalidProtocolBufferException var12;
         Structures$PbRunningIndex var14;
         try {
            var13 = (Structures$PbRunningIndex)Structures$PbRunningIndex.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Structures$PbRunningIndex)var10.getUnfinishedMessage();
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

   public Structures$PbRunningIndex$Builder mergeFrom(Message var1) {
      Structures$PbRunningIndex$Builder var2;
      if (var1 instanceof Structures$PbRunningIndex) {
         var2 = this.mergeFrom((Structures$PbRunningIndex)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbRunningIndex$Builder mergeFrom(Structures$PbRunningIndex var1) {
      if (var1 != Structures$PbRunningIndex.getDefaultInstance()) {
         if (var1.hasValue()) {
            this.setValue(var1.getValue());
         }

         if (var1.hasCalculationTime()) {
            this.mergeCalculationTime(var1.getCalculationTime());
         }

         this.mergeUnknownFields(Structures$PbRunningIndex.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Structures$PbRunningIndex$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbRunningIndex$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbRunningIndex$Builder setCalculationTime(Types$PbDuration$Builder var1) {
      if (this.calculationTimeBuilder_ == null) {
         this.calculationTime_ = var1.build();
         this.onChanged();
      } else {
         this.calculationTimeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Structures$PbRunningIndex$Builder setCalculationTime(Types$PbDuration var1) {
      if (this.calculationTimeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.calculationTime_ = var1;
         this.onChanged();
      } else {
         this.calculationTimeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 2;
      return this;
   }

   public Structures$PbRunningIndex$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbRunningIndex$Builder)super.setField(var1, var2);
   }

   public Structures$PbRunningIndex$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbRunningIndex$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final Structures$PbRunningIndex$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbRunningIndex$Builder)super.setUnknownFields(var1);
   }

   public Structures$PbRunningIndex$Builder setValue(int var1) {
      this.bitField0_ |= 1;
      this.value_ = var1;
      this.onChanged();
      return this;
   }
}
