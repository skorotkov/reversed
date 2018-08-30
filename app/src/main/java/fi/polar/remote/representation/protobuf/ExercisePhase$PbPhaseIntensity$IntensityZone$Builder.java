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

public final class ExercisePhase$PbPhaseIntensity$IntensityZone$Builder extends Builder implements ExercisePhase$PbPhaseIntensity$IntensityZoneOrBuilder {
   private int bitField0_;
   private int lower_;
   private int upper_;

   private ExercisePhase$PbPhaseIntensity$IntensityZone$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExercisePhase$PbPhaseIntensity$IntensityZone$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExercisePhase$PbPhaseIntensity$IntensityZone$Builder(BuilderParent var1, ExercisePhase$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExercisePhase$PbPhaseIntensity$IntensityZone$Builder(ExercisePhase$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExercisePhase.e();
   }

   private void maybeForceBuilderInitialization() {
      if (ExercisePhase$PbPhaseIntensity$IntensityZone.b()) {
      }

   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExercisePhase$PbPhaseIntensity$IntensityZone$Builder)super.addRepeatedField(var1, var2);
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone build() {
      ExercisePhase$PbPhaseIntensity$IntensityZone var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone buildPartial() {
      byte var1 = 1;
      ExercisePhase$PbPhaseIntensity$IntensityZone var2 = new ExercisePhase$PbPhaseIntensity$IntensityZone(this, (ExercisePhase$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ExercisePhase$PbPhaseIntensity$IntensityZone.a(var2, this.lower_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      ExercisePhase$PbPhaseIntensity$IntensityZone.b(var2, this.upper_);
      ExercisePhase$PbPhaseIntensity$IntensityZone.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone$Builder clear() {
      super.clear();
      this.lower_ = 0;
      this.bitField0_ &= -2;
      this.upper_ = 0;
      this.bitField0_ &= -3;
      return this;
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone$Builder clearField(FieldDescriptor var1) {
      return (ExercisePhase$PbPhaseIntensity$IntensityZone$Builder)super.clearField(var1);
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone$Builder clearLower() {
      this.bitField0_ &= -2;
      this.lower_ = 0;
      this.onChanged();
      return this;
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone$Builder clearOneof(OneofDescriptor var1) {
      return (ExercisePhase$PbPhaseIntensity$IntensityZone$Builder)super.clearOneof(var1);
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone$Builder clearUpper() {
      this.bitField0_ &= -3;
      this.upper_ = 0;
      this.onChanged();
      return this;
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone$Builder clone() {
      return (ExercisePhase$PbPhaseIntensity$IntensityZone$Builder)super.clone();
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone getDefaultInstanceForType() {
      return ExercisePhase$PbPhaseIntensity$IntensityZone.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExercisePhase.e();
   }

   public int getLower() {
      return this.lower_;
   }

   public int getUpper() {
      return this.upper_;
   }

   public boolean hasLower() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasUpper() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExercisePhase.f().ensureFieldAccessorsInitialized(ExercisePhase$PbPhaseIntensity$IntensityZone.class, ExercisePhase$PbPhaseIntensity$IntensityZone$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasLower() && this.hasUpper()) {
         var1 = true;
      }

      return var1;
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExercisePhase$PbPhaseIntensity$IntensityZone var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (ExercisePhase$PbPhaseIntensity$IntensityZone)ExercisePhase$PbPhaseIntensity$IntensityZone.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (ExercisePhase$PbPhaseIntensity$IntensityZone)var10.getUnfinishedMessage();
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

   public ExercisePhase$PbPhaseIntensity$IntensityZone$Builder mergeFrom(Message var1) {
      ExercisePhase$PbPhaseIntensity$IntensityZone$Builder var2;
      if (var1 instanceof ExercisePhase$PbPhaseIntensity$IntensityZone) {
         var2 = this.mergeFrom((ExercisePhase$PbPhaseIntensity$IntensityZone)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone$Builder mergeFrom(ExercisePhase$PbPhaseIntensity$IntensityZone var1) {
      if (var1 != ExercisePhase$PbPhaseIntensity$IntensityZone.getDefaultInstance()) {
         if (var1.hasLower()) {
            this.setLower(var1.getLower());
         }

         if (var1.hasUpper()) {
            this.setUpper(var1.getUpper());
         }

         this.mergeUnknownFields(ExercisePhase$PbPhaseIntensity$IntensityZone.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExercisePhase$PbPhaseIntensity$IntensityZone$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExercisePhase$PbPhaseIntensity$IntensityZone$Builder)super.mergeUnknownFields(var1);
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExercisePhase$PbPhaseIntensity$IntensityZone$Builder)super.setField(var1, var2);
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone$Builder setLower(int var1) {
      this.bitField0_ |= 1;
      this.lower_ = var1;
      this.onChanged();
      return this;
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExercisePhase$PbPhaseIntensity$IntensityZone$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final ExercisePhase$PbPhaseIntensity$IntensityZone$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExercisePhase$PbPhaseIntensity$IntensityZone$Builder)super.setUnknownFields(var1);
   }

   public ExercisePhase$PbPhaseIntensity$IntensityZone$Builder setUpper(int var1) {
      this.bitField0_ |= 2;
      this.upper_ = var1;
      this.onChanged();
      return this;
   }
}
