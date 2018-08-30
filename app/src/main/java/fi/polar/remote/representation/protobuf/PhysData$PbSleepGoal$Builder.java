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

public final class PhysData$PbSleepGoal$Builder extends Builder implements PhysData$PbSleepGoalOrBuilder {
   private int bitField0_;
   private int sleepGoalMinutes_;

   private PhysData$PbSleepGoal$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private PhysData$PbSleepGoal$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PhysData$PbSleepGoal$Builder(BuilderParent var1, PhysData$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PhysData$PbSleepGoal$Builder(PhysData$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PhysData.w();
   }

   private void maybeForceBuilderInitialization() {
      if (PhysData$PbSleepGoal.b()) {
      }

   }

   public PhysData$PbSleepGoal$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PhysData$PbSleepGoal$Builder)super.addRepeatedField(var1, var2);
   }

   public PhysData$PbSleepGoal build() {
      PhysData$PbSleepGoal var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PhysData$PbSleepGoal buildPartial() {
      byte var1 = 1;
      PhysData$PbSleepGoal var2 = new PhysData$PbSleepGoal(this, (PhysData$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      PhysData$PbSleepGoal.a(var2, this.sleepGoalMinutes_);
      PhysData$PbSleepGoal.b(var2, var1);
      this.onBuilt();
      return var2;
   }

   public PhysData$PbSleepGoal$Builder clear() {
      super.clear();
      this.sleepGoalMinutes_ = 0;
      this.bitField0_ &= -2;
      return this;
   }

   public PhysData$PbSleepGoal$Builder clearField(FieldDescriptor var1) {
      return (PhysData$PbSleepGoal$Builder)super.clearField(var1);
   }

   public PhysData$PbSleepGoal$Builder clearOneof(OneofDescriptor var1) {
      return (PhysData$PbSleepGoal$Builder)super.clearOneof(var1);
   }

   public PhysData$PbSleepGoal$Builder clearSleepGoalMinutes() {
      this.bitField0_ &= -2;
      this.sleepGoalMinutes_ = 0;
      this.onChanged();
      return this;
   }

   public PhysData$PbSleepGoal$Builder clone() {
      return (PhysData$PbSleepGoal$Builder)super.clone();
   }

   public PhysData$PbSleepGoal getDefaultInstanceForType() {
      return PhysData$PbSleepGoal.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PhysData.w();
   }

   public int getSleepGoalMinutes() {
      return this.sleepGoalMinutes_;
   }

   public boolean hasSleepGoalMinutes() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PhysData.x().ensureFieldAccessorsInitialized(PhysData$PbSleepGoal.class, PhysData$PbSleepGoal$Builder.class);
   }

   public final boolean isInitialized() {
      return true;
   }

   public PhysData$PbSleepGoal$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PhysData$PbSleepGoal var13;
      label96: {
         InvalidProtocolBufferException var12;
         PhysData$PbSleepGoal var14;
         try {
            var13 = (PhysData$PbSleepGoal)PhysData$PbSleepGoal.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (PhysData$PbSleepGoal)var10.getUnfinishedMessage();
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

   public PhysData$PbSleepGoal$Builder mergeFrom(Message var1) {
      PhysData$PbSleepGoal$Builder var2;
      if (var1 instanceof PhysData$PbSleepGoal) {
         var2 = this.mergeFrom((PhysData$PbSleepGoal)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PhysData$PbSleepGoal$Builder mergeFrom(PhysData$PbSleepGoal var1) {
      if (var1 != PhysData$PbSleepGoal.getDefaultInstance()) {
         if (var1.hasSleepGoalMinutes()) {
            this.setSleepGoalMinutes(var1.getSleepGoalMinutes());
         }

         this.mergeUnknownFields(PhysData$PbSleepGoal.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final PhysData$PbSleepGoal$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PhysData$PbSleepGoal$Builder)super.mergeUnknownFields(var1);
   }

   public PhysData$PbSleepGoal$Builder setField(FieldDescriptor var1, Object var2) {
      return (PhysData$PbSleepGoal$Builder)super.setField(var1, var2);
   }

   public PhysData$PbSleepGoal$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PhysData$PbSleepGoal$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public PhysData$PbSleepGoal$Builder setSleepGoalMinutes(int var1) {
      this.bitField0_ |= 1;
      this.sleepGoalMinutes_ = var1;
      this.onChanged();
      return this;
   }

   public final PhysData$PbSleepGoal$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PhysData$PbSleepGoal$Builder)super.setUnknownFields(var1);
   }
}
