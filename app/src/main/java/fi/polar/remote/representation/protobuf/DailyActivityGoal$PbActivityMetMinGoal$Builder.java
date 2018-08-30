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

public final class DailyActivityGoal$PbActivityMetMinGoal$Builder extends Builder implements DailyActivityGoal$PbActivityMetMinGoalOrBuilder {
   private float activityCutoffThreshold_;
   private int bitField0_;
   private float goal_;

   private DailyActivityGoal$PbActivityMetMinGoal$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private DailyActivityGoal$PbActivityMetMinGoal$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   DailyActivityGoal$PbActivityMetMinGoal$Builder(BuilderParent var1, DailyActivityGoal$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   DailyActivityGoal$PbActivityMetMinGoal$Builder(DailyActivityGoal$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return DailyActivityGoal.a();
   }

   private void maybeForceBuilderInitialization() {
      if (DailyActivityGoal$PbActivityMetMinGoal.b()) {
      }

   }

   public DailyActivityGoal$PbActivityMetMinGoal$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (DailyActivityGoal$PbActivityMetMinGoal$Builder)super.addRepeatedField(var1, var2);
   }

   public DailyActivityGoal$PbActivityMetMinGoal build() {
      DailyActivityGoal$PbActivityMetMinGoal var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public DailyActivityGoal$PbActivityMetMinGoal buildPartial() {
      byte var1 = 1;
      DailyActivityGoal$PbActivityMetMinGoal var2 = new DailyActivityGoal$PbActivityMetMinGoal(this, (DailyActivityGoal$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      DailyActivityGoal$PbActivityMetMinGoal.a(var2, this.goal_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      DailyActivityGoal$PbActivityMetMinGoal.b(var2, this.activityCutoffThreshold_);
      DailyActivityGoal$PbActivityMetMinGoal.a(var2, var4);
      this.onBuilt();
      return var2;
   }

   public DailyActivityGoal$PbActivityMetMinGoal$Builder clear() {
      super.clear();
      this.goal_ = 0.0F;
      this.bitField0_ &= -2;
      this.activityCutoffThreshold_ = 0.0F;
      this.bitField0_ &= -3;
      return this;
   }

   public DailyActivityGoal$PbActivityMetMinGoal$Builder clearActivityCutoffThreshold() {
      this.bitField0_ &= -3;
      this.activityCutoffThreshold_ = 0.0F;
      this.onChanged();
      return this;
   }

   public DailyActivityGoal$PbActivityMetMinGoal$Builder clearField(FieldDescriptor var1) {
      return (DailyActivityGoal$PbActivityMetMinGoal$Builder)super.clearField(var1);
   }

   public DailyActivityGoal$PbActivityMetMinGoal$Builder clearGoal() {
      this.bitField0_ &= -2;
      this.goal_ = 0.0F;
      this.onChanged();
      return this;
   }

   public DailyActivityGoal$PbActivityMetMinGoal$Builder clearOneof(OneofDescriptor var1) {
      return (DailyActivityGoal$PbActivityMetMinGoal$Builder)super.clearOneof(var1);
   }

   public DailyActivityGoal$PbActivityMetMinGoal$Builder clone() {
      return (DailyActivityGoal$PbActivityMetMinGoal$Builder)super.clone();
   }

   public float getActivityCutoffThreshold() {
      return this.activityCutoffThreshold_;
   }

   public DailyActivityGoal$PbActivityMetMinGoal getDefaultInstanceForType() {
      return DailyActivityGoal$PbActivityMetMinGoal.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return DailyActivityGoal.a();
   }

   public float getGoal() {
      return this.goal_;
   }

   public boolean hasActivityCutoffThreshold() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasGoal() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return DailyActivityGoal.b().ensureFieldAccessorsInitialized(DailyActivityGoal$PbActivityMetMinGoal.class, DailyActivityGoal$PbActivityMetMinGoal$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasGoal()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public DailyActivityGoal$PbActivityMetMinGoal$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      DailyActivityGoal$PbActivityMetMinGoal var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (DailyActivityGoal$PbActivityMetMinGoal)DailyActivityGoal$PbActivityMetMinGoal.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (DailyActivityGoal$PbActivityMetMinGoal)var10.getUnfinishedMessage();
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

   public DailyActivityGoal$PbActivityMetMinGoal$Builder mergeFrom(Message var1) {
      DailyActivityGoal$PbActivityMetMinGoal$Builder var2;
      if (var1 instanceof DailyActivityGoal$PbActivityMetMinGoal) {
         var2 = this.mergeFrom((DailyActivityGoal$PbActivityMetMinGoal)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public DailyActivityGoal$PbActivityMetMinGoal$Builder mergeFrom(DailyActivityGoal$PbActivityMetMinGoal var1) {
      if (var1 != DailyActivityGoal$PbActivityMetMinGoal.getDefaultInstance()) {
         if (var1.hasGoal()) {
            this.setGoal(var1.getGoal());
         }

         if (var1.hasActivityCutoffThreshold()) {
            this.setActivityCutoffThreshold(var1.getActivityCutoffThreshold());
         }

         this.mergeUnknownFields(DailyActivityGoal$PbActivityMetMinGoal.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final DailyActivityGoal$PbActivityMetMinGoal$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (DailyActivityGoal$PbActivityMetMinGoal$Builder)super.mergeUnknownFields(var1);
   }

   public DailyActivityGoal$PbActivityMetMinGoal$Builder setActivityCutoffThreshold(float var1) {
      this.bitField0_ |= 2;
      this.activityCutoffThreshold_ = var1;
      this.onChanged();
      return this;
   }

   public DailyActivityGoal$PbActivityMetMinGoal$Builder setField(FieldDescriptor var1, Object var2) {
      return (DailyActivityGoal$PbActivityMetMinGoal$Builder)super.setField(var1, var2);
   }

   public DailyActivityGoal$PbActivityMetMinGoal$Builder setGoal(float var1) {
      this.bitField0_ |= 1;
      this.goal_ = var1;
      this.onChanged();
      return this;
   }

   public DailyActivityGoal$PbActivityMetMinGoal$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (DailyActivityGoal$PbActivityMetMinGoal$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final DailyActivityGoal$PbActivityMetMinGoal$Builder setUnknownFields(UnknownFieldSet var1) {
      return (DailyActivityGoal$PbActivityMetMinGoal$Builder)super.setUnknownFields(var1);
   }
}
