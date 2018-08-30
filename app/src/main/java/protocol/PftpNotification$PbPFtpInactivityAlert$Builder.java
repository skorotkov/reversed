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

public final class PftpNotification$PbPFtpInactivityAlert$Builder extends Builder implements PftpNotification$PbPFtpInactivityAlertOrBuilder {
   private int bitField0_;
   private int countdown_;

   private PftpNotification$PbPFtpInactivityAlert$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private PftpNotification$PbPFtpInactivityAlert$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpInactivityAlert$Builder(BuilderParent var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpInactivityAlert$Builder(PftpNotification$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.c();
   }

   private void maybeForceBuilderInitialization() {
      if (PftpNotification$PbPFtpInactivityAlert.b()) {
      }

   }

   public PftpNotification$PbPFtpInactivityAlert$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPFtpInactivityAlert$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpNotification$PbPFtpInactivityAlert build() {
      PftpNotification$PbPFtpInactivityAlert var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpNotification$PbPFtpInactivityAlert buildPartial() {
      byte var1 = 1;
      PftpNotification$PbPFtpInactivityAlert var2 = new PftpNotification$PbPFtpInactivityAlert(this, (PftpNotification$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      PftpNotification$PbPFtpInactivityAlert.a(var2, this.countdown_);
      PftpNotification$PbPFtpInactivityAlert.b(var2, var1);
      this.onBuilt();
      return var2;
   }

   public PftpNotification$PbPFtpInactivityAlert$Builder clear() {
      super.clear();
      this.countdown_ = 0;
      this.bitField0_ &= -2;
      return this;
   }

   public PftpNotification$PbPFtpInactivityAlert$Builder clearCountdown() {
      this.bitField0_ &= -2;
      this.countdown_ = 0;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPFtpInactivityAlert$Builder clearField(FieldDescriptor var1) {
      return (PftpNotification$PbPFtpInactivityAlert$Builder)super.clearField(var1);
   }

   public PftpNotification$PbPFtpInactivityAlert$Builder clearOneof(OneofDescriptor var1) {
      return (PftpNotification$PbPFtpInactivityAlert$Builder)super.clearOneof(var1);
   }

   public PftpNotification$PbPFtpInactivityAlert$Builder clone() {
      return (PftpNotification$PbPFtpInactivityAlert$Builder)super.clone();
   }

   public int getCountdown() {
      return this.countdown_;
   }

   public PftpNotification$PbPFtpInactivityAlert getDefaultInstanceForType() {
      return PftpNotification$PbPFtpInactivityAlert.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PftpNotification.c();
   }

   public boolean hasCountdown() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.d().ensureFieldAccessorsInitialized(PftpNotification$PbPFtpInactivityAlert.class, PftpNotification$PbPFtpInactivityAlert$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasCountdown()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public PftpNotification$PbPFtpInactivityAlert$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpNotification$PbPFtpInactivityAlert var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (PftpNotification$PbPFtpInactivityAlert)PftpNotification$PbPFtpInactivityAlert.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (PftpNotification$PbPFtpInactivityAlert)var10.getUnfinishedMessage();
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

   public PftpNotification$PbPFtpInactivityAlert$Builder mergeFrom(Message var1) {
      PftpNotification$PbPFtpInactivityAlert$Builder var2;
      if (var1 instanceof PftpNotification$PbPFtpInactivityAlert) {
         var2 = this.mergeFrom((PftpNotification$PbPFtpInactivityAlert)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpNotification$PbPFtpInactivityAlert$Builder mergeFrom(PftpNotification$PbPFtpInactivityAlert var1) {
      if (var1 != PftpNotification$PbPFtpInactivityAlert.getDefaultInstance()) {
         if (var1.hasCountdown()) {
            this.setCountdown(var1.getCountdown());
         }

         this.mergeUnknownFields(PftpNotification$PbPFtpInactivityAlert.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final PftpNotification$PbPFtpInactivityAlert$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPFtpInactivityAlert$Builder)super.mergeUnknownFields(var1);
   }

   public PftpNotification$PbPFtpInactivityAlert$Builder setCountdown(int var1) {
      this.bitField0_ |= 1;
      this.countdown_ = var1;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPFtpInactivityAlert$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPFtpInactivityAlert$Builder)super.setField(var1, var2);
   }

   public PftpNotification$PbPFtpInactivityAlert$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpNotification$PbPFtpInactivityAlert$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final PftpNotification$PbPFtpInactivityAlert$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPFtpInactivityAlert$Builder)super.setUnknownFields(var1);
   }
}
