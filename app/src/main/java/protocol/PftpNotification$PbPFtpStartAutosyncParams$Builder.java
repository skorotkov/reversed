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

public final class PftpNotification$PbPFtpStartAutosyncParams$Builder extends Builder implements PftpNotification$PbPFtpStartAutosyncParamsOrBuilder {
   private int bitField0_;
   private int timeout_;

   private PftpNotification$PbPFtpStartAutosyncParams$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private PftpNotification$PbPFtpStartAutosyncParams$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpStartAutosyncParams$Builder(BuilderParent var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpStartAutosyncParams$Builder(PftpNotification$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.A();
   }

   private void maybeForceBuilderInitialization() {
      if (PftpNotification$PbPFtpStartAutosyncParams.b()) {
      }

   }

   public PftpNotification$PbPFtpStartAutosyncParams$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPFtpStartAutosyncParams$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpNotification$PbPFtpStartAutosyncParams build() {
      PftpNotification$PbPFtpStartAutosyncParams var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpNotification$PbPFtpStartAutosyncParams buildPartial() {
      byte var1 = 1;
      PftpNotification$PbPFtpStartAutosyncParams var2 = new PftpNotification$PbPFtpStartAutosyncParams(this, (PftpNotification$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      PftpNotification$PbPFtpStartAutosyncParams.a(var2, this.timeout_);
      PftpNotification$PbPFtpStartAutosyncParams.b(var2, var1);
      this.onBuilt();
      return var2;
   }

   public PftpNotification$PbPFtpStartAutosyncParams$Builder clear() {
      super.clear();
      this.timeout_ = 0;
      this.bitField0_ &= -2;
      return this;
   }

   public PftpNotification$PbPFtpStartAutosyncParams$Builder clearField(FieldDescriptor var1) {
      return (PftpNotification$PbPFtpStartAutosyncParams$Builder)super.clearField(var1);
   }

   public PftpNotification$PbPFtpStartAutosyncParams$Builder clearOneof(OneofDescriptor var1) {
      return (PftpNotification$PbPFtpStartAutosyncParams$Builder)super.clearOneof(var1);
   }

   public PftpNotification$PbPFtpStartAutosyncParams$Builder clearTimeout() {
      this.bitField0_ &= -2;
      this.timeout_ = 0;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPFtpStartAutosyncParams$Builder clone() {
      return (PftpNotification$PbPFtpStartAutosyncParams$Builder)super.clone();
   }

   public PftpNotification$PbPFtpStartAutosyncParams getDefaultInstanceForType() {
      return PftpNotification$PbPFtpStartAutosyncParams.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PftpNotification.A();
   }

   public int getTimeout() {
      return this.timeout_;
   }

   public boolean hasTimeout() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.B().ensureFieldAccessorsInitialized(PftpNotification$PbPFtpStartAutosyncParams.class, PftpNotification$PbPFtpStartAutosyncParams$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasTimeout()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public PftpNotification$PbPFtpStartAutosyncParams$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpNotification$PbPFtpStartAutosyncParams var13;
      label96: {
         InvalidProtocolBufferException var12;
         PftpNotification$PbPFtpStartAutosyncParams var14;
         try {
            var13 = (PftpNotification$PbPFtpStartAutosyncParams)PftpNotification$PbPFtpStartAutosyncParams.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (PftpNotification$PbPFtpStartAutosyncParams)var10.getUnfinishedMessage();
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

   public PftpNotification$PbPFtpStartAutosyncParams$Builder mergeFrom(Message var1) {
      PftpNotification$PbPFtpStartAutosyncParams$Builder var2;
      if (var1 instanceof PftpNotification$PbPFtpStartAutosyncParams) {
         var2 = this.mergeFrom((PftpNotification$PbPFtpStartAutosyncParams)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpNotification$PbPFtpStartAutosyncParams$Builder mergeFrom(PftpNotification$PbPFtpStartAutosyncParams var1) {
      if (var1 != PftpNotification$PbPFtpStartAutosyncParams.getDefaultInstance()) {
         if (var1.hasTimeout()) {
            this.setTimeout(var1.getTimeout());
         }

         this.mergeUnknownFields(PftpNotification$PbPFtpStartAutosyncParams.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final PftpNotification$PbPFtpStartAutosyncParams$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPFtpStartAutosyncParams$Builder)super.mergeUnknownFields(var1);
   }

   public PftpNotification$PbPFtpStartAutosyncParams$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPFtpStartAutosyncParams$Builder)super.setField(var1, var2);
   }

   public PftpNotification$PbPFtpStartAutosyncParams$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpNotification$PbPFtpStartAutosyncParams$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public PftpNotification$PbPFtpStartAutosyncParams$Builder setTimeout(int var1) {
      this.bitField0_ |= 1;
      this.timeout_ = var1;
      this.onChanged();
      return this;
   }

   public final PftpNotification$PbPFtpStartAutosyncParams$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPFtpStartAutosyncParams$Builder)super.setUnknownFields(var1);
   }
}
