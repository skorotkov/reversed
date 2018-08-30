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

public final class Types$PbStrideSensorCalibSettings$Builder extends Builder implements Types$PbStrideSensorCalibSettingsOrBuilder {
   private int bitField0_;
   private int calibType_;
   private int runningFactorSource_;
   private float runningFactor_;

   private Types$PbStrideSensorCalibSettings$Builder() {
      this.calibType_ = 0;
      this.runningFactorSource_ = 0;
      this.maybeForceBuilderInitialization();
   }

   private Types$PbStrideSensorCalibSettings$Builder(BuilderParent var1) {
      super(var1);
      this.calibType_ = 0;
      this.runningFactorSource_ = 0;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Types$PbStrideSensorCalibSettings$Builder(BuilderParent var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Types$PbStrideSensorCalibSettings$Builder(Types$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Types.s();
   }

   private void maybeForceBuilderInitialization() {
      if (Types$PbStrideSensorCalibSettings.b()) {
      }

   }

   public Types$PbStrideSensorCalibSettings$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Types$PbStrideSensorCalibSettings$Builder)super.addRepeatedField(var1, var2);
   }

   public Types$PbStrideSensorCalibSettings build() {
      Types$PbStrideSensorCalibSettings var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Types$PbStrideSensorCalibSettings buildPartial() {
      byte var1 = 1;
      Types$PbStrideSensorCalibSettings var2 = new Types$PbStrideSensorCalibSettings(this, (Types$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Types$PbStrideSensorCalibSettings.a(var2, this.runningFactor_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      Types$PbStrideSensorCalibSettings.a(var2, this.calibType_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      Types$PbStrideSensorCalibSettings.b(var2, this.runningFactorSource_);
      Types$PbStrideSensorCalibSettings.c(var2, var5);
      this.onBuilt();
      return var2;
   }

   public Types$PbStrideSensorCalibSettings$Builder clear() {
      super.clear();
      this.runningFactor_ = 0.0F;
      this.bitField0_ &= -2;
      this.calibType_ = 0;
      this.bitField0_ &= -3;
      this.runningFactorSource_ = 0;
      this.bitField0_ &= -5;
      return this;
   }

   public Types$PbStrideSensorCalibSettings$Builder clearCalibType() {
      this.bitField0_ &= -3;
      this.calibType_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbStrideSensorCalibSettings$Builder clearField(FieldDescriptor var1) {
      return (Types$PbStrideSensorCalibSettings$Builder)super.clearField(var1);
   }

   public Types$PbStrideSensorCalibSettings$Builder clearOneof(OneofDescriptor var1) {
      return (Types$PbStrideSensorCalibSettings$Builder)super.clearOneof(var1);
   }

   public Types$PbStrideSensorCalibSettings$Builder clearRunningFactor() {
      this.bitField0_ &= -2;
      this.runningFactor_ = 0.0F;
      this.onChanged();
      return this;
   }

   public Types$PbStrideSensorCalibSettings$Builder clearRunningFactorSource() {
      this.bitField0_ &= -5;
      this.runningFactorSource_ = 0;
      this.onChanged();
      return this;
   }

   public Types$PbStrideSensorCalibSettings$Builder clone() {
      return (Types$PbStrideSensorCalibSettings$Builder)super.clone();
   }

   public Types$PbStrideSensorCalibSettings$PbStrideCalibType getCalibType() {
      Types$PbStrideSensorCalibSettings$PbStrideCalibType var1 = Types$PbStrideSensorCalibSettings$PbStrideCalibType.valueOf(this.calibType_);
      Types$PbStrideSensorCalibSettings$PbStrideCalibType var2 = var1;
      if (var1 == null) {
         var2 = Types$PbStrideSensorCalibSettings$PbStrideCalibType.STRIDE_CALIB_MANUAL;
      }

      return var2;
   }

   public Types$PbStrideSensorCalibSettings getDefaultInstanceForType() {
      return Types$PbStrideSensorCalibSettings.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Types.s();
   }

   public float getRunningFactor() {
      return this.runningFactor_;
   }

   public Types$PbStrideSensorCalibSettings$PbRunningFactorSource getRunningFactorSource() {
      Types$PbStrideSensorCalibSettings$PbRunningFactorSource var1 = Types$PbStrideSensorCalibSettings$PbRunningFactorSource.valueOf(this.runningFactorSource_);
      Types$PbStrideSensorCalibSettings$PbRunningFactorSource var2 = var1;
      if (var1 == null) {
         var2 = Types$PbStrideSensorCalibSettings$PbRunningFactorSource.RUNNING_FACTOR_SOURCE_DEFAULT;
      }

      return var2;
   }

   public boolean hasCalibType() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasRunningFactor() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasRunningFactorSource() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.t().ensureFieldAccessorsInitialized(Types$PbStrideSensorCalibSettings.class, Types$PbStrideSensorCalibSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasRunningFactor() && this.hasCalibType()) {
         var1 = true;
      }

      return var1;
   }

   public Types$PbStrideSensorCalibSettings$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Types$PbStrideSensorCalibSettings var13;
      label96: {
         InvalidProtocolBufferException var12;
         Types$PbStrideSensorCalibSettings var14;
         try {
            var13 = (Types$PbStrideSensorCalibSettings)Types$PbStrideSensorCalibSettings.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Types$PbStrideSensorCalibSettings)var10.getUnfinishedMessage();
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

   public Types$PbStrideSensorCalibSettings$Builder mergeFrom(Message var1) {
      Types$PbStrideSensorCalibSettings$Builder var2;
      if (var1 instanceof Types$PbStrideSensorCalibSettings) {
         var2 = this.mergeFrom((Types$PbStrideSensorCalibSettings)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Types$PbStrideSensorCalibSettings$Builder mergeFrom(Types$PbStrideSensorCalibSettings var1) {
      if (var1 != Types$PbStrideSensorCalibSettings.getDefaultInstance()) {
         if (var1.hasRunningFactor()) {
            this.setRunningFactor(var1.getRunningFactor());
         }

         if (var1.hasCalibType()) {
            this.setCalibType(var1.getCalibType());
         }

         if (var1.hasRunningFactorSource()) {
            this.setRunningFactorSource(var1.getRunningFactorSource());
         }

         this.mergeUnknownFields(Types$PbStrideSensorCalibSettings.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Types$PbStrideSensorCalibSettings$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Types$PbStrideSensorCalibSettings$Builder)super.mergeUnknownFields(var1);
   }

   public Types$PbStrideSensorCalibSettings$Builder setCalibType(Types$PbStrideSensorCalibSettings$PbStrideCalibType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.calibType_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public Types$PbStrideSensorCalibSettings$Builder setField(FieldDescriptor var1, Object var2) {
      return (Types$PbStrideSensorCalibSettings$Builder)super.setField(var1, var2);
   }

   public Types$PbStrideSensorCalibSettings$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Types$PbStrideSensorCalibSettings$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Types$PbStrideSensorCalibSettings$Builder setRunningFactor(float var1) {
      this.bitField0_ |= 1;
      this.runningFactor_ = var1;
      this.onChanged();
      return this;
   }

   public Types$PbStrideSensorCalibSettings$Builder setRunningFactorSource(Types$PbStrideSensorCalibSettings$PbRunningFactorSource var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 4;
         this.runningFactorSource_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public final Types$PbStrideSensorCalibSettings$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Types$PbStrideSensorCalibSettings$Builder)super.setUnknownFields(var1);
   }
}
