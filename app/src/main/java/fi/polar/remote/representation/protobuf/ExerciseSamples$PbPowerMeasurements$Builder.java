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

public final class ExerciseSamples$PbPowerMeasurements$Builder extends Builder implements ExerciseSamples$PbPowerMeasurementsOrBuilder {
   private int bitField0_;
   private int bottomDeadSpotAngle_;
   private int cumulativeCrankRevolutions_;
   private int cumulativeTimestamp_;
   private int currentPower_;
   private int forceMagnitudeMaxAngle_;
   private int forceMagnitudeMax_;
   private int forceMagnitudeMinAngle_;
   private int forceMagnitudeMin_;
   private int pedalPowerBalance_;
   private int topDeadSpotAngle_;
   private int torqueMagnitudeMax_;
   private int torqueMagnitudeMin_;

   private ExerciseSamples$PbPowerMeasurements$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private ExerciseSamples$PbPowerMeasurements$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   ExerciseSamples$PbPowerMeasurements$Builder(BuilderParent var1, ExerciseSamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   ExerciseSamples$PbPowerMeasurements$Builder(ExerciseSamples$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return ExerciseSamples.a();
   }

   private void maybeForceBuilderInitialization() {
      if (ExerciseSamples$PbPowerMeasurements.b()) {
      }

   }

   public ExerciseSamples$PbPowerMeasurements$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (ExerciseSamples$PbPowerMeasurements$Builder)super.addRepeatedField(var1, var2);
   }

   public ExerciseSamples$PbPowerMeasurements build() {
      ExerciseSamples$PbPowerMeasurements var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public ExerciseSamples$PbPowerMeasurements buildPartial() {
      byte var1 = 1;
      ExerciseSamples$PbPowerMeasurements var2 = new ExerciseSamples$PbPowerMeasurements(this, (ExerciseSamples$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      ExerciseSamples$PbPowerMeasurements.a(var2, this.currentPower_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      ExerciseSamples$PbPowerMeasurements.b(var2, this.cumulativeCrankRevolutions_);
      int var6 = var4;
      if ((var3 & 4) == 4) {
         var6 = var4 | 4;
      }

      ExerciseSamples$PbPowerMeasurements.c(var2, this.cumulativeTimestamp_);
      var4 = var6;
      if ((var3 & 8) == 8) {
         var4 = var6 | 8;
      }

      ExerciseSamples$PbPowerMeasurements.d(var2, this.forceMagnitudeMin_);
      int var5 = var4;
      if ((var3 & 16) == 16) {
         var5 = var4 | 16;
      }

      ExerciseSamples$PbPowerMeasurements.e(var2, this.forceMagnitudeMax_);
      var6 = var5;
      if ((var3 & 32) == 32) {
         var6 = var5 | 32;
      }

      ExerciseSamples$PbPowerMeasurements.f(var2, this.forceMagnitudeMinAngle_);
      var4 = var6;
      if ((var3 & 64) == 64) {
         var4 = var6 | 64;
      }

      ExerciseSamples$PbPowerMeasurements.g(var2, this.forceMagnitudeMaxAngle_);
      var6 = var4;
      if ((var3 & 128) == 128) {
         var6 = var4 | 128;
      }

      ExerciseSamples$PbPowerMeasurements.h(var2, this.bottomDeadSpotAngle_);
      var4 = var6;
      if ((var3 & 256) == 256) {
         var4 = var6 | 256;
      }

      ExerciseSamples$PbPowerMeasurements.i(var2, this.topDeadSpotAngle_);
      var6 = var4;
      if ((var3 & 512) == 512) {
         var6 = var4 | 512;
      }

      ExerciseSamples$PbPowerMeasurements.j(var2, this.pedalPowerBalance_);
      var4 = var6;
      if ((var3 & 1024) == 1024) {
         var4 = var6 | 1024;
      }

      ExerciseSamples$PbPowerMeasurements.k(var2, this.torqueMagnitudeMin_);
      var6 = var4;
      if ((var3 & 2048) == 2048) {
         var6 = var4 | 2048;
      }

      ExerciseSamples$PbPowerMeasurements.l(var2, this.torqueMagnitudeMax_);
      ExerciseSamples$PbPowerMeasurements.m(var2, var6);
      this.onBuilt();
      return var2;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder clear() {
      super.clear();
      this.currentPower_ = 0;
      this.bitField0_ &= -2;
      this.cumulativeCrankRevolutions_ = 0;
      this.bitField0_ &= -3;
      this.cumulativeTimestamp_ = 0;
      this.bitField0_ &= -5;
      this.forceMagnitudeMin_ = 0;
      this.bitField0_ &= -9;
      this.forceMagnitudeMax_ = 0;
      this.bitField0_ &= -17;
      this.forceMagnitudeMinAngle_ = 0;
      this.bitField0_ &= -33;
      this.forceMagnitudeMaxAngle_ = 0;
      this.bitField0_ &= -65;
      this.bottomDeadSpotAngle_ = 0;
      this.bitField0_ &= -129;
      this.topDeadSpotAngle_ = 0;
      this.bitField0_ &= -257;
      this.pedalPowerBalance_ = 0;
      this.bitField0_ &= -513;
      this.torqueMagnitudeMin_ = 0;
      this.bitField0_ &= -1025;
      this.torqueMagnitudeMax_ = 0;
      this.bitField0_ &= -2049;
      return this;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder clearBottomDeadSpotAngle() {
      this.bitField0_ &= -129;
      this.bottomDeadSpotAngle_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder clearCumulativeCrankRevolutions() {
      this.bitField0_ &= -3;
      this.cumulativeCrankRevolutions_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder clearCumulativeTimestamp() {
      this.bitField0_ &= -5;
      this.cumulativeTimestamp_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder clearCurrentPower() {
      this.bitField0_ &= -2;
      this.currentPower_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder clearField(FieldDescriptor var1) {
      return (ExerciseSamples$PbPowerMeasurements$Builder)super.clearField(var1);
   }

   public ExerciseSamples$PbPowerMeasurements$Builder clearForceMagnitudeMax() {
      this.bitField0_ &= -17;
      this.forceMagnitudeMax_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder clearForceMagnitudeMaxAngle() {
      this.bitField0_ &= -65;
      this.forceMagnitudeMaxAngle_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder clearForceMagnitudeMin() {
      this.bitField0_ &= -9;
      this.forceMagnitudeMin_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder clearForceMagnitudeMinAngle() {
      this.bitField0_ &= -33;
      this.forceMagnitudeMinAngle_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder clearOneof(OneofDescriptor var1) {
      return (ExerciseSamples$PbPowerMeasurements$Builder)super.clearOneof(var1);
   }

   public ExerciseSamples$PbPowerMeasurements$Builder clearPedalPowerBalance() {
      this.bitField0_ &= -513;
      this.pedalPowerBalance_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder clearTopDeadSpotAngle() {
      this.bitField0_ &= -257;
      this.topDeadSpotAngle_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder clearTorqueMagnitudeMax() {
      this.bitField0_ &= -2049;
      this.torqueMagnitudeMax_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder clearTorqueMagnitudeMin() {
      this.bitField0_ &= -1025;
      this.torqueMagnitudeMin_ = 0;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder clone() {
      return (ExerciseSamples$PbPowerMeasurements$Builder)super.clone();
   }

   public int getBottomDeadSpotAngle() {
      return this.bottomDeadSpotAngle_;
   }

   public int getCumulativeCrankRevolutions() {
      return this.cumulativeCrankRevolutions_;
   }

   public int getCumulativeTimestamp() {
      return this.cumulativeTimestamp_;
   }

   public int getCurrentPower() {
      return this.currentPower_;
   }

   public ExerciseSamples$PbPowerMeasurements getDefaultInstanceForType() {
      return ExerciseSamples$PbPowerMeasurements.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return ExerciseSamples.a();
   }

   public int getForceMagnitudeMax() {
      return this.forceMagnitudeMax_;
   }

   public int getForceMagnitudeMaxAngle() {
      return this.forceMagnitudeMaxAngle_;
   }

   public int getForceMagnitudeMin() {
      return this.forceMagnitudeMin_;
   }

   public int getForceMagnitudeMinAngle() {
      return this.forceMagnitudeMinAngle_;
   }

   public int getPedalPowerBalance() {
      return this.pedalPowerBalance_;
   }

   public int getTopDeadSpotAngle() {
      return this.topDeadSpotAngle_;
   }

   public int getTorqueMagnitudeMax() {
      return this.torqueMagnitudeMax_;
   }

   public int getTorqueMagnitudeMin() {
      return this.torqueMagnitudeMin_;
   }

   public boolean hasBottomDeadSpotAngle() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasCumulativeCrankRevolutions() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasCumulativeTimestamp() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasCurrentPower() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasForceMagnitudeMax() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasForceMagnitudeMaxAngle() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasForceMagnitudeMin() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasForceMagnitudeMinAngle() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPedalPowerBalance() {
      boolean var1;
      if ((this.bitField0_ & 512) == 512) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTopDeadSpotAngle() {
      boolean var1;
      if ((this.bitField0_ & 256) == 256) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTorqueMagnitudeMax() {
      boolean var1;
      if ((this.bitField0_ & 2048) == 2048) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTorqueMagnitudeMin() {
      boolean var1;
      if ((this.bitField0_ & 1024) == 1024) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseSamples.b().ensureFieldAccessorsInitialized(ExerciseSamples$PbPowerMeasurements.class, ExerciseSamples$PbPowerMeasurements$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasCurrentPower()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      ExerciseSamples$PbPowerMeasurements var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (ExerciseSamples$PbPowerMeasurements)ExerciseSamples$PbPowerMeasurements.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (ExerciseSamples$PbPowerMeasurements)var11.getUnfinishedMessage();
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

   public ExerciseSamples$PbPowerMeasurements$Builder mergeFrom(Message var1) {
      ExerciseSamples$PbPowerMeasurements$Builder var2;
      if (var1 instanceof ExerciseSamples$PbPowerMeasurements) {
         var2 = this.mergeFrom((ExerciseSamples$PbPowerMeasurements)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder mergeFrom(ExerciseSamples$PbPowerMeasurements var1) {
      if (var1 != ExerciseSamples$PbPowerMeasurements.getDefaultInstance()) {
         if (var1.hasCurrentPower()) {
            this.setCurrentPower(var1.getCurrentPower());
         }

         if (var1.hasCumulativeCrankRevolutions()) {
            this.setCumulativeCrankRevolutions(var1.getCumulativeCrankRevolutions());
         }

         if (var1.hasCumulativeTimestamp()) {
            this.setCumulativeTimestamp(var1.getCumulativeTimestamp());
         }

         if (var1.hasForceMagnitudeMin()) {
            this.setForceMagnitudeMin(var1.getForceMagnitudeMin());
         }

         if (var1.hasForceMagnitudeMax()) {
            this.setForceMagnitudeMax(var1.getForceMagnitudeMax());
         }

         if (var1.hasForceMagnitudeMinAngle()) {
            this.setForceMagnitudeMinAngle(var1.getForceMagnitudeMinAngle());
         }

         if (var1.hasForceMagnitudeMaxAngle()) {
            this.setForceMagnitudeMaxAngle(var1.getForceMagnitudeMaxAngle());
         }

         if (var1.hasBottomDeadSpotAngle()) {
            this.setBottomDeadSpotAngle(var1.getBottomDeadSpotAngle());
         }

         if (var1.hasTopDeadSpotAngle()) {
            this.setTopDeadSpotAngle(var1.getTopDeadSpotAngle());
         }

         if (var1.hasPedalPowerBalance()) {
            this.setPedalPowerBalance(var1.getPedalPowerBalance());
         }

         if (var1.hasTorqueMagnitudeMin()) {
            this.setTorqueMagnitudeMin(var1.getTorqueMagnitudeMin());
         }

         if (var1.hasTorqueMagnitudeMax()) {
            this.setTorqueMagnitudeMax(var1.getTorqueMagnitudeMax());
         }

         this.mergeUnknownFields(ExerciseSamples$PbPowerMeasurements.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final ExerciseSamples$PbPowerMeasurements$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (ExerciseSamples$PbPowerMeasurements$Builder)super.mergeUnknownFields(var1);
   }

   public ExerciseSamples$PbPowerMeasurements$Builder setBottomDeadSpotAngle(int var1) {
      this.bitField0_ |= 128;
      this.bottomDeadSpotAngle_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder setCumulativeCrankRevolutions(int var1) {
      this.bitField0_ |= 2;
      this.cumulativeCrankRevolutions_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder setCumulativeTimestamp(int var1) {
      this.bitField0_ |= 4;
      this.cumulativeTimestamp_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder setCurrentPower(int var1) {
      this.bitField0_ |= 1;
      this.currentPower_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder setField(FieldDescriptor var1, Object var2) {
      return (ExerciseSamples$PbPowerMeasurements$Builder)super.setField(var1, var2);
   }

   public ExerciseSamples$PbPowerMeasurements$Builder setForceMagnitudeMax(int var1) {
      this.bitField0_ |= 16;
      this.forceMagnitudeMax_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder setForceMagnitudeMaxAngle(int var1) {
      this.bitField0_ |= 64;
      this.forceMagnitudeMaxAngle_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder setForceMagnitudeMin(int var1) {
      this.bitField0_ |= 8;
      this.forceMagnitudeMin_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder setForceMagnitudeMinAngle(int var1) {
      this.bitField0_ |= 32;
      this.forceMagnitudeMinAngle_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder setPedalPowerBalance(int var1) {
      this.bitField0_ |= 512;
      this.pedalPowerBalance_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (ExerciseSamples$PbPowerMeasurements$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public ExerciseSamples$PbPowerMeasurements$Builder setTopDeadSpotAngle(int var1) {
      this.bitField0_ |= 256;
      this.topDeadSpotAngle_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder setTorqueMagnitudeMax(int var1) {
      this.bitField0_ |= 2048;
      this.torqueMagnitudeMax_ = var1;
      this.onChanged();
      return this;
   }

   public ExerciseSamples$PbPowerMeasurements$Builder setTorqueMagnitudeMin(int var1) {
      this.bitField0_ |= 1024;
      this.torqueMagnitudeMin_ = var1;
      this.onChanged();
      return this;
   }

   public final ExerciseSamples$PbPowerMeasurements$Builder setUnknownFields(UnknownFieldSet var1) {
      return (ExerciseSamples$PbPowerMeasurements$Builder)super.setUnknownFields(var1);
   }
}
