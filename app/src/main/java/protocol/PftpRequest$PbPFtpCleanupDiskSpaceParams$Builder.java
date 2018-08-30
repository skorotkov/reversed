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

public final class PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder extends Builder implements PftpRequest$PbPFtpCleanupDiskSpaceParamsOrBuilder {
   private int bitField0_;
   private long requiredBytes_;

   private PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder(BuilderParent var1, PftpRequest$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder(PftpRequest$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PftpRequest.k();
   }

   private void maybeForceBuilderInitialization() {
      if (PftpRequest$PbPFtpCleanupDiskSpaceParams.b()) {
      }

   }

   public PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpRequest$PbPFtpCleanupDiskSpaceParams build() {
      PftpRequest$PbPFtpCleanupDiskSpaceParams var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpRequest$PbPFtpCleanupDiskSpaceParams buildPartial() {
      byte var1 = 1;
      PftpRequest$PbPFtpCleanupDiskSpaceParams var2 = new PftpRequest$PbPFtpCleanupDiskSpaceParams(this, (PftpRequest$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      PftpRequest$PbPFtpCleanupDiskSpaceParams.a(var2, this.requiredBytes_);
      PftpRequest$PbPFtpCleanupDiskSpaceParams.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder clear() {
      super.clear();
      this.requiredBytes_ = 0L;
      this.bitField0_ &= -2;
      return this;
   }

   public PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder clearField(FieldDescriptor var1) {
      return (PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder)super.clearField(var1);
   }

   public PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder clearOneof(OneofDescriptor var1) {
      return (PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder)super.clearOneof(var1);
   }

   public PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder clearRequiredBytes() {
      this.bitField0_ &= -2;
      this.requiredBytes_ = 0L;
      this.onChanged();
      return this;
   }

   public PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder clone() {
      return (PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder)super.clone();
   }

   public PftpRequest$PbPFtpCleanupDiskSpaceParams getDefaultInstanceForType() {
      return PftpRequest$PbPFtpCleanupDiskSpaceParams.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PftpRequest.k();
   }

   public long getRequiredBytes() {
      return this.requiredBytes_;
   }

   public boolean hasRequiredBytes() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpRequest.l().ensureFieldAccessorsInitialized(PftpRequest$PbPFtpCleanupDiskSpaceParams.class, PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasRequiredBytes()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpRequest$PbPFtpCleanupDiskSpaceParams var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (PftpRequest$PbPFtpCleanupDiskSpaceParams)PftpRequest$PbPFtpCleanupDiskSpaceParams.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (PftpRequest$PbPFtpCleanupDiskSpaceParams)var11.getUnfinishedMessage();
         } finally {
            ;
         }

         try {
            throw var14.unwrapIOException();
         } catch (Throwable var10) {
            if (var13 != null) {
               this.mergeFrom(var13);
            }

            throw var10;
         }
      }

      if (var13 != null) {
         this.mergeFrom(var13);
      }

      return this;
   }

   public PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder mergeFrom(Message var1) {
      PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder var2;
      if (var1 instanceof PftpRequest$PbPFtpCleanupDiskSpaceParams) {
         var2 = this.mergeFrom((PftpRequest$PbPFtpCleanupDiskSpaceParams)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder mergeFrom(PftpRequest$PbPFtpCleanupDiskSpaceParams var1) {
      if (var1 != PftpRequest$PbPFtpCleanupDiskSpaceParams.getDefaultInstance()) {
         if (var1.hasRequiredBytes()) {
            this.setRequiredBytes(var1.getRequiredBytes());
         }

         this.mergeUnknownFields(PftpRequest$PbPFtpCleanupDiskSpaceParams.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder)super.mergeUnknownFields(var1);
   }

   public PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder)super.setField(var1, var2);
   }

   public PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder setRequiredBytes(long var1) {
      this.bitField0_ |= 1;
      this.requiredBytes_ = var1;
      this.onChanged();
      return this;
   }

   public final PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpRequest$PbPFtpCleanupDiskSpaceParams$Builder)super.setUnknownFields(var1);
   }
}
