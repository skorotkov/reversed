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

public final class PftpNotification$PbPFtpFactoryResetParams$Builder extends Builder implements PftpNotification$PbPFtpFactoryResetParamsOrBuilder {
   private int bitField0_;
   private boolean doFactoryDefaults_;
   private boolean otaFwupdate_;
   private boolean sleep_;

   private PftpNotification$PbPFtpFactoryResetParams$Builder() {
      this.doFactoryDefaults_ = true;
      this.maybeForceBuilderInitialization();
   }

   private PftpNotification$PbPFtpFactoryResetParams$Builder(BuilderParent var1) {
      super(var1);
      this.doFactoryDefaults_ = true;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpFactoryResetParams$Builder(BuilderParent var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpFactoryResetParams$Builder(PftpNotification$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.y();
   }

   private void maybeForceBuilderInitialization() {
      if (PftpNotification$PbPFtpFactoryResetParams.b()) {
      }

   }

   public PftpNotification$PbPFtpFactoryResetParams$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPFtpFactoryResetParams$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpNotification$PbPFtpFactoryResetParams build() {
      PftpNotification$PbPFtpFactoryResetParams var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpNotification$PbPFtpFactoryResetParams buildPartial() {
      byte var1 = 1;
      PftpNotification$PbPFtpFactoryResetParams var2 = new PftpNotification$PbPFtpFactoryResetParams(this, (PftpNotification$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      PftpNotification$PbPFtpFactoryResetParams.a(var2, this.sleep_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      PftpNotification$PbPFtpFactoryResetParams.b(var2, this.doFactoryDefaults_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      PftpNotification$PbPFtpFactoryResetParams.c(var2, this.otaFwupdate_);
      PftpNotification$PbPFtpFactoryResetParams.a(var2, var5);
      this.onBuilt();
      return var2;
   }

   public PftpNotification$PbPFtpFactoryResetParams$Builder clear() {
      super.clear();
      this.sleep_ = false;
      this.bitField0_ &= -2;
      this.doFactoryDefaults_ = true;
      this.bitField0_ &= -3;
      this.otaFwupdate_ = false;
      this.bitField0_ &= -5;
      return this;
   }

   public PftpNotification$PbPFtpFactoryResetParams$Builder clearDoFactoryDefaults() {
      this.bitField0_ &= -3;
      this.doFactoryDefaults_ = true;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPFtpFactoryResetParams$Builder clearField(FieldDescriptor var1) {
      return (PftpNotification$PbPFtpFactoryResetParams$Builder)super.clearField(var1);
   }

   public PftpNotification$PbPFtpFactoryResetParams$Builder clearOneof(OneofDescriptor var1) {
      return (PftpNotification$PbPFtpFactoryResetParams$Builder)super.clearOneof(var1);
   }

   public PftpNotification$PbPFtpFactoryResetParams$Builder clearOtaFwupdate() {
      this.bitField0_ &= -5;
      this.otaFwupdate_ = false;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPFtpFactoryResetParams$Builder clearSleep() {
      this.bitField0_ &= -2;
      this.sleep_ = false;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPFtpFactoryResetParams$Builder clone() {
      return (PftpNotification$PbPFtpFactoryResetParams$Builder)super.clone();
   }

   public PftpNotification$PbPFtpFactoryResetParams getDefaultInstanceForType() {
      return PftpNotification$PbPFtpFactoryResetParams.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PftpNotification.y();
   }

   public boolean getDoFactoryDefaults() {
      return this.doFactoryDefaults_;
   }

   public boolean getOtaFwupdate() {
      return this.otaFwupdate_;
   }

   public boolean getSleep() {
      return this.sleep_;
   }

   public boolean hasDoFactoryDefaults() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasOtaFwupdate() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSleep() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.z().ensureFieldAccessorsInitialized(PftpNotification$PbPFtpFactoryResetParams.class, PftpNotification$PbPFtpFactoryResetParams$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasSleep()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public PftpNotification$PbPFtpFactoryResetParams$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpNotification$PbPFtpFactoryResetParams var13;
      label96: {
         InvalidProtocolBufferException var12;
         PftpNotification$PbPFtpFactoryResetParams var14;
         try {
            var13 = (PftpNotification$PbPFtpFactoryResetParams)PftpNotification$PbPFtpFactoryResetParams.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (PftpNotification$PbPFtpFactoryResetParams)var10.getUnfinishedMessage();
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

   public PftpNotification$PbPFtpFactoryResetParams$Builder mergeFrom(Message var1) {
      PftpNotification$PbPFtpFactoryResetParams$Builder var2;
      if (var1 instanceof PftpNotification$PbPFtpFactoryResetParams) {
         var2 = this.mergeFrom((PftpNotification$PbPFtpFactoryResetParams)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpNotification$PbPFtpFactoryResetParams$Builder mergeFrom(PftpNotification$PbPFtpFactoryResetParams var1) {
      if (var1 != PftpNotification$PbPFtpFactoryResetParams.getDefaultInstance()) {
         if (var1.hasSleep()) {
            this.setSleep(var1.getSleep());
         }

         if (var1.hasDoFactoryDefaults()) {
            this.setDoFactoryDefaults(var1.getDoFactoryDefaults());
         }

         if (var1.hasOtaFwupdate()) {
            this.setOtaFwupdate(var1.getOtaFwupdate());
         }

         this.mergeUnknownFields(PftpNotification$PbPFtpFactoryResetParams.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final PftpNotification$PbPFtpFactoryResetParams$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPFtpFactoryResetParams$Builder)super.mergeUnknownFields(var1);
   }

   public PftpNotification$PbPFtpFactoryResetParams$Builder setDoFactoryDefaults(boolean var1) {
      this.bitField0_ |= 2;
      this.doFactoryDefaults_ = var1;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPFtpFactoryResetParams$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPFtpFactoryResetParams$Builder)super.setField(var1, var2);
   }

   public PftpNotification$PbPFtpFactoryResetParams$Builder setOtaFwupdate(boolean var1) {
      this.bitField0_ |= 4;
      this.otaFwupdate_ = var1;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPFtpFactoryResetParams$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpNotification$PbPFtpFactoryResetParams$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public PftpNotification$PbPFtpFactoryResetParams$Builder setSleep(boolean var1) {
      this.bitField0_ |= 1;
      this.sleep_ = var1;
      this.onChanged();
      return this;
   }

   public final PftpNotification$PbPFtpFactoryResetParams$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPFtpFactoryResetParams$Builder)super.setUnknownFields(var1);
   }
}
