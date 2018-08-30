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

public final class SportProfile$PbSprintDetection$Builder extends Builder implements SportProfile$PbSprintDetectionOrBuilder {
   private int bitField0_;
   private int source_;
   private float sprintThresholdAcceleration_;
   private float sprintThresholdSpeed_;

   private SportProfile$PbSprintDetection$Builder() {
      this.source_ = 0;
      this.maybeForceBuilderInitialization();
   }

   private SportProfile$PbSprintDetection$Builder(BuilderParent var1) {
      super(var1);
      this.source_ = 0;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   SportProfile$PbSprintDetection$Builder(BuilderParent var1, SportProfile$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   SportProfile$PbSprintDetection$Builder(SportProfile$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return SportProfile.e();
   }

   private void maybeForceBuilderInitialization() {
      if (SportProfile$PbSprintDetection.b()) {
      }

   }

   public SportProfile$PbSprintDetection$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (SportProfile$PbSprintDetection$Builder)super.addRepeatedField(var1, var2);
   }

   public SportProfile$PbSprintDetection build() {
      SportProfile$PbSprintDetection var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public SportProfile$PbSprintDetection buildPartial() {
      byte var1 = 1;
      SportProfile$PbSprintDetection var2 = new SportProfile$PbSprintDetection(this, (SportProfile$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      SportProfile$PbSprintDetection.a(var2, this.source_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      SportProfile$PbSprintDetection.a(var2, this.sprintThresholdAcceleration_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      SportProfile$PbSprintDetection.b(var2, this.sprintThresholdSpeed_);
      SportProfile$PbSprintDetection.b(var2, var5);
      this.onBuilt();
      return var2;
   }

   public SportProfile$PbSprintDetection$Builder clear() {
      super.clear();
      this.source_ = 0;
      this.bitField0_ &= -2;
      this.sprintThresholdAcceleration_ = 0.0F;
      this.bitField0_ &= -3;
      this.sprintThresholdSpeed_ = 0.0F;
      this.bitField0_ &= -5;
      return this;
   }

   public SportProfile$PbSprintDetection$Builder clearField(FieldDescriptor var1) {
      return (SportProfile$PbSprintDetection$Builder)super.clearField(var1);
   }

   public SportProfile$PbSprintDetection$Builder clearOneof(OneofDescriptor var1) {
      return (SportProfile$PbSprintDetection$Builder)super.clearOneof(var1);
   }

   public SportProfile$PbSprintDetection$Builder clearSource() {
      this.bitField0_ &= -2;
      this.source_ = 0;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSprintDetection$Builder clearSprintThresholdAcceleration() {
      this.bitField0_ &= -3;
      this.sprintThresholdAcceleration_ = 0.0F;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSprintDetection$Builder clearSprintThresholdSpeed() {
      this.bitField0_ &= -5;
      this.sprintThresholdSpeed_ = 0.0F;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSprintDetection$Builder clone() {
      return (SportProfile$PbSprintDetection$Builder)super.clone();
   }

   public SportProfile$PbSprintDetection getDefaultInstanceForType() {
      return SportProfile$PbSprintDetection.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return SportProfile.e();
   }

   public SportProfile$PbSprintDetection$PbSprintDetectionSource getSource() {
      SportProfile$PbSprintDetection$PbSprintDetectionSource var1 = SportProfile$PbSprintDetection$PbSprintDetectionSource.valueOf(this.source_);
      SportProfile$PbSprintDetection$PbSprintDetectionSource var2 = var1;
      if (var1 == null) {
         var2 = SportProfile$PbSprintDetection$PbSprintDetectionSource.SPRINT_DETECTION_OFF;
      }

      return var2;
   }

   public float getSprintThresholdAcceleration() {
      return this.sprintThresholdAcceleration_;
   }

   public float getSprintThresholdSpeed() {
      return this.sprintThresholdSpeed_;
   }

   public boolean hasSource() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSprintThresholdAcceleration() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSprintThresholdSpeed() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SportProfile.f().ensureFieldAccessorsInitialized(SportProfile$PbSprintDetection.class, SportProfile$PbSprintDetection$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasSource()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public SportProfile$PbSprintDetection$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      SportProfile$PbSprintDetection var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (SportProfile$PbSprintDetection)SportProfile$PbSprintDetection.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (SportProfile$PbSprintDetection)var11.getUnfinishedMessage();
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

   public SportProfile$PbSprintDetection$Builder mergeFrom(Message var1) {
      SportProfile$PbSprintDetection$Builder var2;
      if (var1 instanceof SportProfile$PbSprintDetection) {
         var2 = this.mergeFrom((SportProfile$PbSprintDetection)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public SportProfile$PbSprintDetection$Builder mergeFrom(SportProfile$PbSprintDetection var1) {
      if (var1 != SportProfile$PbSprintDetection.getDefaultInstance()) {
         if (var1.hasSource()) {
            this.setSource(var1.getSource());
         }

         if (var1.hasSprintThresholdAcceleration()) {
            this.setSprintThresholdAcceleration(var1.getSprintThresholdAcceleration());
         }

         if (var1.hasSprintThresholdSpeed()) {
            this.setSprintThresholdSpeed(var1.getSprintThresholdSpeed());
         }

         this.mergeUnknownFields(SportProfile$PbSprintDetection.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final SportProfile$PbSprintDetection$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (SportProfile$PbSprintDetection$Builder)super.mergeUnknownFields(var1);
   }

   public SportProfile$PbSprintDetection$Builder setField(FieldDescriptor var1, Object var2) {
      return (SportProfile$PbSprintDetection$Builder)super.setField(var1, var2);
   }

   public SportProfile$PbSprintDetection$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (SportProfile$PbSprintDetection$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public SportProfile$PbSprintDetection$Builder setSource(SportProfile$PbSprintDetection$PbSprintDetectionSource var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.source_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public SportProfile$PbSprintDetection$Builder setSprintThresholdAcceleration(float var1) {
      this.bitField0_ |= 2;
      this.sprintThresholdAcceleration_ = var1;
      this.onChanged();
      return this;
   }

   public SportProfile$PbSprintDetection$Builder setSprintThresholdSpeed(float var1) {
      this.bitField0_ |= 4;
      this.sprintThresholdSpeed_ = var1;
      this.onChanged();
      return this;
   }

   public final SportProfile$PbSprintDetection$Builder setUnknownFields(UnknownFieldSet var1) {
      return (SportProfile$PbSprintDetection$Builder)super.setUnknownFields(var1);
   }
}
