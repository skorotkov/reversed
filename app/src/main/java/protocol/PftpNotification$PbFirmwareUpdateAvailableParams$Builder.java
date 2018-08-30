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

public final class PftpNotification$PbFirmwareUpdateAvailableParams$Builder extends Builder implements PftpNotification$PbFirmwareUpdateAvailableParamsOrBuilder {
   private int bitField0_;
   private boolean mandatory_;

   private PftpNotification$PbFirmwareUpdateAvailableParams$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private PftpNotification$PbFirmwareUpdateAvailableParams$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpNotification$PbFirmwareUpdateAvailableParams$Builder(BuilderParent var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpNotification$PbFirmwareUpdateAvailableParams$Builder(PftpNotification$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.o();
   }

   private void maybeForceBuilderInitialization() {
      if (PftpNotification$PbFirmwareUpdateAvailableParams.b()) {
      }

   }

   public PftpNotification$PbFirmwareUpdateAvailableParams$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbFirmwareUpdateAvailableParams$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpNotification$PbFirmwareUpdateAvailableParams build() {
      PftpNotification$PbFirmwareUpdateAvailableParams var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpNotification$PbFirmwareUpdateAvailableParams buildPartial() {
      byte var1 = 1;
      PftpNotification$PbFirmwareUpdateAvailableParams var2 = new PftpNotification$PbFirmwareUpdateAvailableParams(this, (PftpNotification$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      PftpNotification$PbFirmwareUpdateAvailableParams.a(var2, this.mandatory_);
      PftpNotification$PbFirmwareUpdateAvailableParams.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public PftpNotification$PbFirmwareUpdateAvailableParams$Builder clear() {
      super.clear();
      this.mandatory_ = false;
      this.bitField0_ &= -2;
      return this;
   }

   public PftpNotification$PbFirmwareUpdateAvailableParams$Builder clearField(FieldDescriptor var1) {
      return (PftpNotification$PbFirmwareUpdateAvailableParams$Builder)super.clearField(var1);
   }

   public PftpNotification$PbFirmwareUpdateAvailableParams$Builder clearMandatory() {
      this.bitField0_ &= -2;
      this.mandatory_ = false;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbFirmwareUpdateAvailableParams$Builder clearOneof(OneofDescriptor var1) {
      return (PftpNotification$PbFirmwareUpdateAvailableParams$Builder)super.clearOneof(var1);
   }

   public PftpNotification$PbFirmwareUpdateAvailableParams$Builder clone() {
      return (PftpNotification$PbFirmwareUpdateAvailableParams$Builder)super.clone();
   }

   public PftpNotification$PbFirmwareUpdateAvailableParams getDefaultInstanceForType() {
      return PftpNotification$PbFirmwareUpdateAvailableParams.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PftpNotification.o();
   }

   public boolean getMandatory() {
      return this.mandatory_;
   }

   public boolean hasMandatory() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.p().ensureFieldAccessorsInitialized(PftpNotification$PbFirmwareUpdateAvailableParams.class, PftpNotification$PbFirmwareUpdateAvailableParams$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasMandatory()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public PftpNotification$PbFirmwareUpdateAvailableParams$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpNotification$PbFirmwareUpdateAvailableParams var13;
      label96: {
         InvalidProtocolBufferException var12;
         PftpNotification$PbFirmwareUpdateAvailableParams var14;
         try {
            var13 = (PftpNotification$PbFirmwareUpdateAvailableParams)PftpNotification$PbFirmwareUpdateAvailableParams.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (PftpNotification$PbFirmwareUpdateAvailableParams)var10.getUnfinishedMessage();
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

   public PftpNotification$PbFirmwareUpdateAvailableParams$Builder mergeFrom(Message var1) {
      PftpNotification$PbFirmwareUpdateAvailableParams$Builder var2;
      if (var1 instanceof PftpNotification$PbFirmwareUpdateAvailableParams) {
         var2 = this.mergeFrom((PftpNotification$PbFirmwareUpdateAvailableParams)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpNotification$PbFirmwareUpdateAvailableParams$Builder mergeFrom(PftpNotification$PbFirmwareUpdateAvailableParams var1) {
      if (var1 != PftpNotification$PbFirmwareUpdateAvailableParams.getDefaultInstance()) {
         if (var1.hasMandatory()) {
            this.setMandatory(var1.getMandatory());
         }

         this.mergeUnknownFields(PftpNotification$PbFirmwareUpdateAvailableParams.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final PftpNotification$PbFirmwareUpdateAvailableParams$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbFirmwareUpdateAvailableParams$Builder)super.mergeUnknownFields(var1);
   }

   public PftpNotification$PbFirmwareUpdateAvailableParams$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbFirmwareUpdateAvailableParams$Builder)super.setField(var1, var2);
   }

   public PftpNotification$PbFirmwareUpdateAvailableParams$Builder setMandatory(boolean var1) {
      this.bitField0_ |= 1;
      this.mandatory_ = var1;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbFirmwareUpdateAvailableParams$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpNotification$PbFirmwareUpdateAvailableParams$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final PftpNotification$PbFirmwareUpdateAvailableParams$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbFirmwareUpdateAvailableParams$Builder)super.setUnknownFields(var1);
   }
}
