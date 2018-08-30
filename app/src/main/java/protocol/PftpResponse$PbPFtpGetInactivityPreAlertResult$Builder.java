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

public final class PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder extends Builder implements PftpResponse$PbPFtpGetInactivityPreAlertResultOrBuilder {
   private int bitField0_;
   private boolean inactivityPreAlertOn_;

   private PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder(BuilderParent var1, PftpResponse$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder(PftpResponse$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PftpResponse.q();
   }

   private void maybeForceBuilderInitialization() {
      if (PftpResponse$PbPFtpGetInactivityPreAlertResult.b()) {
      }

   }

   public PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpResponse$PbPFtpGetInactivityPreAlertResult build() {
      PftpResponse$PbPFtpGetInactivityPreAlertResult var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpResponse$PbPFtpGetInactivityPreAlertResult buildPartial() {
      byte var1 = 1;
      PftpResponse$PbPFtpGetInactivityPreAlertResult var2 = new PftpResponse$PbPFtpGetInactivityPreAlertResult(this, (PftpResponse$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      PftpResponse$PbPFtpGetInactivityPreAlertResult.a(var2, this.inactivityPreAlertOn_);
      PftpResponse$PbPFtpGetInactivityPreAlertResult.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder clear() {
      super.clear();
      this.inactivityPreAlertOn_ = false;
      this.bitField0_ &= -2;
      return this;
   }

   public PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder clearField(FieldDescriptor var1) {
      return (PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder)super.clearField(var1);
   }

   public PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder clearInactivityPreAlertOn() {
      this.bitField0_ &= -2;
      this.inactivityPreAlertOn_ = false;
      this.onChanged();
      return this;
   }

   public PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder clearOneof(OneofDescriptor var1) {
      return (PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder)super.clearOneof(var1);
   }

   public PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder clone() {
      return (PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder)super.clone();
   }

   public PftpResponse$PbPFtpGetInactivityPreAlertResult getDefaultInstanceForType() {
      return PftpResponse$PbPFtpGetInactivityPreAlertResult.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PftpResponse.q();
   }

   public boolean getInactivityPreAlertOn() {
      return this.inactivityPreAlertOn_;
   }

   public boolean hasInactivityPreAlertOn() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpResponse.r().ensureFieldAccessorsInitialized(PftpResponse$PbPFtpGetInactivityPreAlertResult.class, PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasInactivityPreAlertOn()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpResponse$PbPFtpGetInactivityPreAlertResult var13;
      label96: {
         InvalidProtocolBufferException var12;
         PftpResponse$PbPFtpGetInactivityPreAlertResult var14;
         try {
            var13 = (PftpResponse$PbPFtpGetInactivityPreAlertResult)PftpResponse$PbPFtpGetInactivityPreAlertResult.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (PftpResponse$PbPFtpGetInactivityPreAlertResult)var10.getUnfinishedMessage();
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

   public PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder mergeFrom(Message var1) {
      PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder var2;
      if (var1 instanceof PftpResponse$PbPFtpGetInactivityPreAlertResult) {
         var2 = this.mergeFrom((PftpResponse$PbPFtpGetInactivityPreAlertResult)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder mergeFrom(PftpResponse$PbPFtpGetInactivityPreAlertResult var1) {
      if (var1 != PftpResponse$PbPFtpGetInactivityPreAlertResult.getDefaultInstance()) {
         if (var1.hasInactivityPreAlertOn()) {
            this.setInactivityPreAlertOn(var1.getInactivityPreAlertOn());
         }

         this.mergeUnknownFields(PftpResponse$PbPFtpGetInactivityPreAlertResult.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder)super.mergeUnknownFields(var1);
   }

   public PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder)super.setField(var1, var2);
   }

   public PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder setInactivityPreAlertOn(boolean var1) {
      this.bitField0_ |= 1;
      this.inactivityPreAlertOn_ = var1;
      this.onChanged();
      return this;
   }

   public PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpResponse$PbPFtpGetInactivityPreAlertResult$Builder)super.setUnknownFields(var1);
   }
}
