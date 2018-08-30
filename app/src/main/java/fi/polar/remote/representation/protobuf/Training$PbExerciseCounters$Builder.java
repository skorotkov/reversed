package fi.polar.remote.representation.protobuf;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class Training$PbExerciseCounters$Builder extends Builder implements Training$PbExerciseCountersOrBuilder {
   private int bitField0_;
   private int sprintCount_;

   private Training$PbExerciseCounters$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private Training$PbExerciseCounters$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Training$PbExerciseCounters$Builder(BuilderParent var1, Training$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Training$PbExerciseCounters$Builder(Training$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Training.a();
   }

   private void maybeForceBuilderInitialization() {
      if (Training$PbExerciseCounters.b()) {
      }

   }

   public Training$PbExerciseCounters$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Training$PbExerciseCounters$Builder)super.addRepeatedField(var1, var2);
   }

   public Training$PbExerciseCounters build() {
      Training$PbExerciseCounters var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Training$PbExerciseCounters buildPartial() {
      byte var1 = 1;
      Training$PbExerciseCounters var2 = new Training$PbExerciseCounters(this, (Training$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      Training$PbExerciseCounters.a(var2, this.sprintCount_);
      Training$PbExerciseCounters.b(var2, var1);
      this.onBuilt();
      return var2;
   }

   public Training$PbExerciseCounters$Builder clear() {
      super.clear();
      this.sprintCount_ = 0;
      this.bitField0_ &= -2;
      return this;
   }

   public Training$PbExerciseCounters$Builder clearField(FieldDescriptor var1) {
      return (Training$PbExerciseCounters$Builder)super.clearField(var1);
   }

   public Training$PbExerciseCounters$Builder clearOneof(OneofDescriptor var1) {
      return (Training$PbExerciseCounters$Builder)super.clearOneof(var1);
   }

   public Training$PbExerciseCounters$Builder clearSprintCount() {
      this.bitField0_ &= -2;
      this.sprintCount_ = 0;
      this.onChanged();
      return this;
   }

   public Training$PbExerciseCounters$Builder clone() {
      return (Training$PbExerciseCounters$Builder)super.clone();
   }

   public Training$PbExerciseCounters getDefaultInstanceForType() {
      return Training$PbExerciseCounters.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Training.a();
   }

   public int getSprintCount() {
      return this.sprintCount_;
   }

   public boolean hasSprintCount() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Training.b().ensureFieldAccessorsInitialized(Training$PbExerciseCounters.class, Training$PbExerciseCounters$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public Training$PbExerciseCounters$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Training$PbExerciseCounters var13;
      label96: {
         InvalidProtocolBufferException var12;
         Training$PbExerciseCounters var14;
         try {
            var13 = (Training$PbExerciseCounters)Training$PbExerciseCounters.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Training$PbExerciseCounters)var10.getUnfinishedMessage();
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

   public Training$PbExerciseCounters$Builder mergeFrom(Message var1) {
      Training$PbExerciseCounters$Builder var2;
      if (var1 instanceof Training$PbExerciseCounters) {
         var2 = this.mergeFrom((Training$PbExerciseCounters)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Training$PbExerciseCounters$Builder mergeFrom(Training$PbExerciseCounters var1) {
      if (var1 != Training$PbExerciseCounters.getDefaultInstance()) {
         if (var1.hasSprintCount()) {
            this.setSprintCount(var1.getSprintCount());
         }

         this.mergeUnknownFields(Training$PbExerciseCounters.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Training$PbExerciseCounters$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Training$PbExerciseCounters$Builder)super.mergeUnknownFields(var1);
   }

   public Training$PbExerciseCounters$Builder setField(FieldDescriptor var1, Object var2) {
      return (Training$PbExerciseCounters$Builder)super.setField(var1, var2);
   }

   public Training$PbExerciseCounters$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Training$PbExerciseCounters$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Training$PbExerciseCounters$Builder setSprintCount(int var1) {
      this.bitField0_ |= 1;
      this.sprintCount_ = var1;
      this.onChanged();
      return this;
   }

   public final Training$PbExerciseCounters$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Training$PbExerciseCounters$Builder)super.setUnknownFields(var1);
   }
}
