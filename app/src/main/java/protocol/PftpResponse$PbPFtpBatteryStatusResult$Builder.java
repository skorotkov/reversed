package protocol;

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

public final class PftpResponse$PbPFtpBatteryStatusResult$Builder extends Builder implements PftpResponse$PbPFtpBatteryStatusResultOrBuilder {
   private int batteryStatus_;
   private int bitField0_;
   private boolean charging_;

   private PftpResponse$PbPFtpBatteryStatusResult$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private PftpResponse$PbPFtpBatteryStatusResult$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpBatteryStatusResult$Builder(BuilderParent var1, PftpResponse$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpBatteryStatusResult$Builder(PftpResponse$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PftpResponse.o();
   }

   private void maybeForceBuilderInitialization() {
      if (PftpResponse$PbPFtpBatteryStatusResult.b()) {
      }

   }

   public PftpResponse$PbPFtpBatteryStatusResult$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpResponse$PbPFtpBatteryStatusResult$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpResponse$PbPFtpBatteryStatusResult build() {
      PftpResponse$PbPFtpBatteryStatusResult var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpResponse$PbPFtpBatteryStatusResult buildPartial() {
      byte var1 = 1;
      PftpResponse$PbPFtpBatteryStatusResult var2 = new PftpResponse$PbPFtpBatteryStatusResult(this, (PftpResponse$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      PftpResponse$PbPFtpBatteryStatusResult.a(var2, this.batteryStatus_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      PftpResponse$PbPFtpBatteryStatusResult.a(var2, this.charging_);
      PftpResponse$PbPFtpBatteryStatusResult.b(var2, var4);
      this.onBuilt();
      return var2;
   }

   public PftpResponse$PbPFtpBatteryStatusResult$Builder clear() {
      super.clear();
      this.batteryStatus_ = 0;
      this.bitField0_ &= -2;
      this.charging_ = false;
      this.bitField0_ &= -3;
      return this;
   }

   public PftpResponse$PbPFtpBatteryStatusResult$Builder clearBatteryStatus() {
      this.bitField0_ &= -2;
      this.batteryStatus_ = 0;
      this.onChanged();
      return this;
   }

   public PftpResponse$PbPFtpBatteryStatusResult$Builder clearCharging() {
      this.bitField0_ &= -3;
      this.charging_ = false;
      this.onChanged();
      return this;
   }

   public PftpResponse$PbPFtpBatteryStatusResult$Builder clearField(FieldDescriptor var1) {
      return (PftpResponse$PbPFtpBatteryStatusResult$Builder)super.clearField(var1);
   }

   public PftpResponse$PbPFtpBatteryStatusResult$Builder clearOneof(OneofDescriptor var1) {
      return (PftpResponse$PbPFtpBatteryStatusResult$Builder)super.clearOneof(var1);
   }

   public PftpResponse$PbPFtpBatteryStatusResult$Builder clone() {
      return (PftpResponse$PbPFtpBatteryStatusResult$Builder)super.clone();
   }

   public int getBatteryStatus() {
      return this.batteryStatus_;
   }

   public boolean getCharging() {
      return this.charging_;
   }

   public PftpResponse$PbPFtpBatteryStatusResult getDefaultInstanceForType() {
      return PftpResponse$PbPFtpBatteryStatusResult.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PftpResponse.o();
   }

   public boolean hasBatteryStatus() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasCharging() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpResponse.p().ensureFieldAccessorsInitialized(PftpResponse$PbPFtpBatteryStatusResult.class, PftpResponse$PbPFtpBatteryStatusResult$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasBatteryStatus()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public PftpResponse$PbPFtpBatteryStatusResult$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpResponse$PbPFtpBatteryStatusResult var13;
      label96: {
         InvalidProtocolBufferException var12;
         PftpResponse$PbPFtpBatteryStatusResult var14;
         try {
            var13 = (PftpResponse$PbPFtpBatteryStatusResult)PftpResponse$PbPFtpBatteryStatusResult.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (PftpResponse$PbPFtpBatteryStatusResult)var10.getUnfinishedMessage();
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

   public PftpResponse$PbPFtpBatteryStatusResult$Builder mergeFrom(Message var1) {
      PftpResponse$PbPFtpBatteryStatusResult$Builder var2;
      if (var1 instanceof PftpResponse$PbPFtpBatteryStatusResult) {
         var2 = this.mergeFrom((PftpResponse$PbPFtpBatteryStatusResult)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpResponse$PbPFtpBatteryStatusResult$Builder mergeFrom(PftpResponse$PbPFtpBatteryStatusResult var1) {
      if (var1 != PftpResponse$PbPFtpBatteryStatusResult.getDefaultInstance()) {
         if (var1.hasBatteryStatus()) {
            this.setBatteryStatus(var1.getBatteryStatus());
         }

         if (var1.hasCharging()) {
            this.setCharging(var1.getCharging());
         }

         this.mergeUnknownFields(PftpResponse$PbPFtpBatteryStatusResult.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final PftpResponse$PbPFtpBatteryStatusResult$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpResponse$PbPFtpBatteryStatusResult$Builder)super.mergeUnknownFields(var1);
   }

   public PftpResponse$PbPFtpBatteryStatusResult$Builder setBatteryStatus(int var1) {
      this.bitField0_ |= 1;
      this.batteryStatus_ = var1;
      this.onChanged();
      return this;
   }

   public PftpResponse$PbPFtpBatteryStatusResult$Builder setCharging(boolean var1) {
      this.bitField0_ |= 2;
      this.charging_ = var1;
      this.onChanged();
      return this;
   }

   public PftpResponse$PbPFtpBatteryStatusResult$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpResponse$PbPFtpBatteryStatusResult$Builder)super.setField(var1, var2);
   }

   public PftpResponse$PbPFtpBatteryStatusResult$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpResponse$PbPFtpBatteryStatusResult$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final PftpResponse$PbPFtpBatteryStatusResult$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpResponse$PbPFtpBatteryStatusResult$Builder)super.setUnknownFields(var1);
   }
}
