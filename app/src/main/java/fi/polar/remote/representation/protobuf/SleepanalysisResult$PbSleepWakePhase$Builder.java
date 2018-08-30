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

public final class SleepanalysisResult$PbSleepWakePhase$Builder extends Builder implements SleepanalysisResult$PbSleepWakePhaseOrBuilder {
   private int bitField0_;
   private int secondsFromSleepStart_;
   private int sleepwakeState_;

   private SleepanalysisResult$PbSleepWakePhase$Builder() {
      this.sleepwakeState_ = -2;
      this.maybeForceBuilderInitialization();
   }

   private SleepanalysisResult$PbSleepWakePhase$Builder(BuilderParent var1) {
      super(var1);
      this.sleepwakeState_ = -2;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   SleepanalysisResult$PbSleepWakePhase$Builder(BuilderParent var1, SleepanalysisResult$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   SleepanalysisResult$PbSleepWakePhase$Builder(SleepanalysisResult$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return SleepanalysisResult.a();
   }

   private void maybeForceBuilderInitialization() {
      if (SleepanalysisResult$PbSleepWakePhase.b()) {
      }

   }

   public SleepanalysisResult$PbSleepWakePhase$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (SleepanalysisResult$PbSleepWakePhase$Builder)super.addRepeatedField(var1, var2);
   }

   public SleepanalysisResult$PbSleepWakePhase build() {
      SleepanalysisResult$PbSleepWakePhase var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public SleepanalysisResult$PbSleepWakePhase buildPartial() {
      byte var1 = 1;
      SleepanalysisResult$PbSleepWakePhase var2 = new SleepanalysisResult$PbSleepWakePhase(this, (SleepanalysisResult$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      SleepanalysisResult$PbSleepWakePhase.a(var2, this.secondsFromSleepStart_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      SleepanalysisResult$PbSleepWakePhase.b(var2, this.sleepwakeState_);
      SleepanalysisResult$PbSleepWakePhase.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public SleepanalysisResult$PbSleepWakePhase$Builder clear() {
      super.clear();
      this.secondsFromSleepStart_ = 0;
      this.bitField0_ &= -2;
      this.sleepwakeState_ = -2;
      this.bitField0_ &= -3;
      return this;
   }

   public SleepanalysisResult$PbSleepWakePhase$Builder clearField(FieldDescriptor var1) {
      return (SleepanalysisResult$PbSleepWakePhase$Builder)super.clearField(var1);
   }

   public SleepanalysisResult$PbSleepWakePhase$Builder clearOneof(OneofDescriptor var1) {
      return (SleepanalysisResult$PbSleepWakePhase$Builder)super.clearOneof(var1);
   }

   public SleepanalysisResult$PbSleepWakePhase$Builder clearSecondsFromSleepStart() {
      this.bitField0_ &= -2;
      this.secondsFromSleepStart_ = 0;
      this.onChanged();
      return this;
   }

   public SleepanalysisResult$PbSleepWakePhase$Builder clearSleepwakeState() {
      this.bitField0_ &= -3;
      this.sleepwakeState_ = -2;
      this.onChanged();
      return this;
   }

   public SleepanalysisResult$PbSleepWakePhase$Builder clone() {
      return (SleepanalysisResult$PbSleepWakePhase$Builder)super.clone();
   }

   public SleepanalysisResult$PbSleepWakePhase getDefaultInstanceForType() {
      return SleepanalysisResult$PbSleepWakePhase.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return SleepanalysisResult.a();
   }

   public int getSecondsFromSleepStart() {
      return this.secondsFromSleepStart_;
   }

   public SleepanalysisResult$PbSleepWakeState getSleepwakeState() {
      SleepanalysisResult$PbSleepWakeState var1 = SleepanalysisResult$PbSleepWakeState.valueOf(this.sleepwakeState_);
      SleepanalysisResult$PbSleepWakeState var2 = var1;
      if (var1 == null) {
         var2 = SleepanalysisResult$PbSleepWakeState.PB_WAKE;
      }

      return var2;
   }

   public boolean hasSecondsFromSleepStart() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSleepwakeState() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SleepanalysisResult.b().ensureFieldAccessorsInitialized(SleepanalysisResult$PbSleepWakePhase.class, SleepanalysisResult$PbSleepWakePhase$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasSecondsFromSleepStart() && this.hasSleepwakeState()) {
         var1 = true;
      }

      return var1;
   }

   public SleepanalysisResult$PbSleepWakePhase$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      SleepanalysisResult$PbSleepWakePhase var13;
      label96: {
         InvalidProtocolBufferException var12;
         SleepanalysisResult$PbSleepWakePhase var14;
         try {
            var13 = (SleepanalysisResult$PbSleepWakePhase)SleepanalysisResult$PbSleepWakePhase.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (SleepanalysisResult$PbSleepWakePhase)var10.getUnfinishedMessage();
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

   public SleepanalysisResult$PbSleepWakePhase$Builder mergeFrom(Message var1) {
      SleepanalysisResult$PbSleepWakePhase$Builder var2;
      if (var1 instanceof SleepanalysisResult$PbSleepWakePhase) {
         var2 = this.mergeFrom((SleepanalysisResult$PbSleepWakePhase)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public SleepanalysisResult$PbSleepWakePhase$Builder mergeFrom(SleepanalysisResult$PbSleepWakePhase var1) {
      if (var1 != SleepanalysisResult$PbSleepWakePhase.getDefaultInstance()) {
         if (var1.hasSecondsFromSleepStart()) {
            this.setSecondsFromSleepStart(var1.getSecondsFromSleepStart());
         }

         if (var1.hasSleepwakeState()) {
            this.setSleepwakeState(var1.getSleepwakeState());
         }

         this.mergeUnknownFields(SleepanalysisResult$PbSleepWakePhase.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final SleepanalysisResult$PbSleepWakePhase$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (SleepanalysisResult$PbSleepWakePhase$Builder)super.mergeUnknownFields(var1);
   }

   public SleepanalysisResult$PbSleepWakePhase$Builder setField(FieldDescriptor var1, Object var2) {
      return (SleepanalysisResult$PbSleepWakePhase$Builder)super.setField(var1, var2);
   }

   public SleepanalysisResult$PbSleepWakePhase$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (SleepanalysisResult$PbSleepWakePhase$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public SleepanalysisResult$PbSleepWakePhase$Builder setSecondsFromSleepStart(int var1) {
      this.bitField0_ |= 1;
      this.secondsFromSleepStart_ = var1;
      this.onChanged();
      return this;
   }

   public SleepanalysisResult$PbSleepWakePhase$Builder setSleepwakeState(SleepanalysisResult$PbSleepWakeState var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.sleepwakeState_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public final SleepanalysisResult$PbSleepWakePhase$Builder setUnknownFields(UnknownFieldSet var1) {
      return (SleepanalysisResult$PbSleepWakePhase$Builder)super.setUnknownFields(var1);
   }
}
