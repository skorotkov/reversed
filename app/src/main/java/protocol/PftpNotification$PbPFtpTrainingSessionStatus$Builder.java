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

public final class PftpNotification$PbPFtpTrainingSessionStatus$Builder extends Builder implements PftpNotification$PbPFtpTrainingSessionStatusOrBuilder {
   private int bitField0_;
   private boolean inprogress_;

   private PftpNotification$PbPFtpTrainingSessionStatus$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private PftpNotification$PbPFtpTrainingSessionStatus$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpTrainingSessionStatus$Builder(BuilderParent var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpTrainingSessionStatus$Builder(PftpNotification$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.e();
   }

   private void maybeForceBuilderInitialization() {
      if (PftpNotification$PbPFtpTrainingSessionStatus.b()) {
      }

   }

   public PftpNotification$PbPFtpTrainingSessionStatus$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPFtpTrainingSessionStatus$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpNotification$PbPFtpTrainingSessionStatus build() {
      PftpNotification$PbPFtpTrainingSessionStatus var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpNotification$PbPFtpTrainingSessionStatus buildPartial() {
      byte var1 = 1;
      PftpNotification$PbPFtpTrainingSessionStatus var2 = new PftpNotification$PbPFtpTrainingSessionStatus(this, (PftpNotification$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      PftpNotification$PbPFtpTrainingSessionStatus.a(var2, this.inprogress_);
      PftpNotification$PbPFtpTrainingSessionStatus.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public PftpNotification$PbPFtpTrainingSessionStatus$Builder clear() {
      super.clear();
      this.inprogress_ = false;
      this.bitField0_ &= -2;
      return this;
   }

   public PftpNotification$PbPFtpTrainingSessionStatus$Builder clearField(FieldDescriptor var1) {
      return (PftpNotification$PbPFtpTrainingSessionStatus$Builder)super.clearField(var1);
   }

   public PftpNotification$PbPFtpTrainingSessionStatus$Builder clearInprogress() {
      this.bitField0_ &= -2;
      this.inprogress_ = false;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPFtpTrainingSessionStatus$Builder clearOneof(OneofDescriptor var1) {
      return (PftpNotification$PbPFtpTrainingSessionStatus$Builder)super.clearOneof(var1);
   }

   public PftpNotification$PbPFtpTrainingSessionStatus$Builder clone() {
      return (PftpNotification$PbPFtpTrainingSessionStatus$Builder)super.clone();
   }

   public PftpNotification$PbPFtpTrainingSessionStatus getDefaultInstanceForType() {
      return PftpNotification$PbPFtpTrainingSessionStatus.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PftpNotification.e();
   }

   public boolean getInprogress() {
      return this.inprogress_;
   }

   public boolean hasInprogress() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.f().ensureFieldAccessorsInitialized(PftpNotification$PbPFtpTrainingSessionStatus.class, PftpNotification$PbPFtpTrainingSessionStatus$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasInprogress()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public PftpNotification$PbPFtpTrainingSessionStatus$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpNotification$PbPFtpTrainingSessionStatus var13;
      label96: {
         InvalidProtocolBufferException var12;
         PftpNotification$PbPFtpTrainingSessionStatus var14;
         try {
            var13 = (PftpNotification$PbPFtpTrainingSessionStatus)PftpNotification$PbPFtpTrainingSessionStatus.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (PftpNotification$PbPFtpTrainingSessionStatus)var10.getUnfinishedMessage();
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

   public PftpNotification$PbPFtpTrainingSessionStatus$Builder mergeFrom(Message var1) {
      PftpNotification$PbPFtpTrainingSessionStatus$Builder var2;
      if (var1 instanceof PftpNotification$PbPFtpTrainingSessionStatus) {
         var2 = this.mergeFrom((PftpNotification$PbPFtpTrainingSessionStatus)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpNotification$PbPFtpTrainingSessionStatus$Builder mergeFrom(PftpNotification$PbPFtpTrainingSessionStatus var1) {
      if (var1 != PftpNotification$PbPFtpTrainingSessionStatus.getDefaultInstance()) {
         if (var1.hasInprogress()) {
            this.setInprogress(var1.getInprogress());
         }

         this.mergeUnknownFields(PftpNotification$PbPFtpTrainingSessionStatus.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final PftpNotification$PbPFtpTrainingSessionStatus$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPFtpTrainingSessionStatus$Builder)super.mergeUnknownFields(var1);
   }

   public PftpNotification$PbPFtpTrainingSessionStatus$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPFtpTrainingSessionStatus$Builder)super.setField(var1, var2);
   }

   public PftpNotification$PbPFtpTrainingSessionStatus$Builder setInprogress(boolean var1) {
      this.bitField0_ |= 1;
      this.inprogress_ = var1;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPFtpTrainingSessionStatus$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpNotification$PbPFtpTrainingSessionStatus$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final PftpNotification$PbPFtpTrainingSessionStatus$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPFtpTrainingSessionStatus$Builder)super.setUnknownFields(var1);
   }
}
