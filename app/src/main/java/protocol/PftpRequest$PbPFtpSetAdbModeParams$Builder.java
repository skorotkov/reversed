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

public final class PftpRequest$PbPFtpSetAdbModeParams$Builder extends Builder implements PftpRequest$PbPFtpSetAdbModeParamsOrBuilder {
   private int bitField0_;
   private boolean enable_;

   private PftpRequest$PbPFtpSetAdbModeParams$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private PftpRequest$PbPFtpSetAdbModeParams$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpRequest$PbPFtpSetAdbModeParams$Builder(BuilderParent var1, PftpRequest$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpRequest$PbPFtpSetAdbModeParams$Builder(PftpRequest$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PftpRequest.i();
   }

   private void maybeForceBuilderInitialization() {
      if (PftpRequest$PbPFtpSetAdbModeParams.b()) {
      }

   }

   public PftpRequest$PbPFtpSetAdbModeParams$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpRequest$PbPFtpSetAdbModeParams$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpRequest$PbPFtpSetAdbModeParams build() {
      PftpRequest$PbPFtpSetAdbModeParams var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpRequest$PbPFtpSetAdbModeParams buildPartial() {
      byte var1 = 1;
      PftpRequest$PbPFtpSetAdbModeParams var2 = new PftpRequest$PbPFtpSetAdbModeParams(this, (PftpRequest$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      PftpRequest$PbPFtpSetAdbModeParams.a(var2, this.enable_);
      PftpRequest$PbPFtpSetAdbModeParams.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public PftpRequest$PbPFtpSetAdbModeParams$Builder clear() {
      super.clear();
      this.enable_ = false;
      this.bitField0_ &= -2;
      return this;
   }

   public PftpRequest$PbPFtpSetAdbModeParams$Builder clearEnable() {
      this.bitField0_ &= -2;
      this.enable_ = false;
      this.onChanged();
      return this;
   }

   public PftpRequest$PbPFtpSetAdbModeParams$Builder clearField(FieldDescriptor var1) {
      return (PftpRequest$PbPFtpSetAdbModeParams$Builder)super.clearField(var1);
   }

   public PftpRequest$PbPFtpSetAdbModeParams$Builder clearOneof(OneofDescriptor var1) {
      return (PftpRequest$PbPFtpSetAdbModeParams$Builder)super.clearOneof(var1);
   }

   public PftpRequest$PbPFtpSetAdbModeParams$Builder clone() {
      return (PftpRequest$PbPFtpSetAdbModeParams$Builder)super.clone();
   }

   public PftpRequest$PbPFtpSetAdbModeParams getDefaultInstanceForType() {
      return PftpRequest$PbPFtpSetAdbModeParams.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PftpRequest.i();
   }

   public boolean getEnable() {
      return this.enable_;
   }

   public boolean hasEnable() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpRequest.j().ensureFieldAccessorsInitialized(PftpRequest$PbPFtpSetAdbModeParams.class, PftpRequest$PbPFtpSetAdbModeParams$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasEnable()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public PftpRequest$PbPFtpSetAdbModeParams$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpRequest$PbPFtpSetAdbModeParams var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (PftpRequest$PbPFtpSetAdbModeParams)PftpRequest$PbPFtpSetAdbModeParams.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (PftpRequest$PbPFtpSetAdbModeParams)var10.getUnfinishedMessage();
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

   public PftpRequest$PbPFtpSetAdbModeParams$Builder mergeFrom(Message var1) {
      PftpRequest$PbPFtpSetAdbModeParams$Builder var2;
      if (var1 instanceof PftpRequest$PbPFtpSetAdbModeParams) {
         var2 = this.mergeFrom((PftpRequest$PbPFtpSetAdbModeParams)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpRequest$PbPFtpSetAdbModeParams$Builder mergeFrom(PftpRequest$PbPFtpSetAdbModeParams var1) {
      if (var1 != PftpRequest$PbPFtpSetAdbModeParams.getDefaultInstance()) {
         if (var1.hasEnable()) {
            this.setEnable(var1.getEnable());
         }

         this.mergeUnknownFields(PftpRequest$PbPFtpSetAdbModeParams.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final PftpRequest$PbPFtpSetAdbModeParams$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpRequest$PbPFtpSetAdbModeParams$Builder)super.mergeUnknownFields(var1);
   }

   public PftpRequest$PbPFtpSetAdbModeParams$Builder setEnable(boolean var1) {
      this.bitField0_ |= 1;
      this.enable_ = var1;
      this.onChanged();
      return this;
   }

   public PftpRequest$PbPFtpSetAdbModeParams$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpRequest$PbPFtpSetAdbModeParams$Builder)super.setField(var1, var2);
   }

   public PftpRequest$PbPFtpSetAdbModeParams$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpRequest$PbPFtpSetAdbModeParams$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final PftpRequest$PbPFtpSetAdbModeParams$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpRequest$PbPFtpSetAdbModeParams$Builder)super.setUnknownFields(var1);
   }
}
