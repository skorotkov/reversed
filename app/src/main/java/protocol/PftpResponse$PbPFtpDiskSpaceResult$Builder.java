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

public final class PftpResponse$PbPFtpDiskSpaceResult$Builder extends Builder implements PftpResponse$PbPFtpDiskSpaceResultOrBuilder {
   private int bitField0_;
   private int fragmentSize_;
   private long freeFragments_;
   private long totalFragments_;

   private PftpResponse$PbPFtpDiskSpaceResult$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private PftpResponse$PbPFtpDiskSpaceResult$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpDiskSpaceResult$Builder(BuilderParent var1, PftpResponse$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpDiskSpaceResult$Builder(PftpResponse$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PftpResponse.k();
   }

   private void maybeForceBuilderInitialization() {
      if (PftpResponse$PbPFtpDiskSpaceResult.b()) {
      }

   }

   public PftpResponse$PbPFtpDiskSpaceResult$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpResponse$PbPFtpDiskSpaceResult$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpResponse$PbPFtpDiskSpaceResult build() {
      PftpResponse$PbPFtpDiskSpaceResult var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpResponse$PbPFtpDiskSpaceResult buildPartial() {
      byte var1 = 1;
      PftpResponse$PbPFtpDiskSpaceResult var2 = new PftpResponse$PbPFtpDiskSpaceResult(this, (PftpResponse$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      PftpResponse$PbPFtpDiskSpaceResult.a(var2, this.fragmentSize_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      PftpResponse$PbPFtpDiskSpaceResult.a(var2, this.totalFragments_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      PftpResponse$PbPFtpDiskSpaceResult.b(var2, this.freeFragments_);
      PftpResponse$PbPFtpDiskSpaceResult.b(var2, var5);
      this.onBuilt();
      return var2;
   }

   public PftpResponse$PbPFtpDiskSpaceResult$Builder clear() {
      super.clear();
      this.fragmentSize_ = 0;
      this.bitField0_ &= -2;
      this.totalFragments_ = 0L;
      this.bitField0_ &= -3;
      this.freeFragments_ = 0L;
      this.bitField0_ &= -5;
      return this;
   }

   public PftpResponse$PbPFtpDiskSpaceResult$Builder clearField(FieldDescriptor var1) {
      return (PftpResponse$PbPFtpDiskSpaceResult$Builder)super.clearField(var1);
   }

   public PftpResponse$PbPFtpDiskSpaceResult$Builder clearFragmentSize() {
      this.bitField0_ &= -2;
      this.fragmentSize_ = 0;
      this.onChanged();
      return this;
   }

   public PftpResponse$PbPFtpDiskSpaceResult$Builder clearFreeFragments() {
      this.bitField0_ &= -5;
      this.freeFragments_ = 0L;
      this.onChanged();
      return this;
   }

   public PftpResponse$PbPFtpDiskSpaceResult$Builder clearOneof(OneofDescriptor var1) {
      return (PftpResponse$PbPFtpDiskSpaceResult$Builder)super.clearOneof(var1);
   }

   public PftpResponse$PbPFtpDiskSpaceResult$Builder clearTotalFragments() {
      this.bitField0_ &= -3;
      this.totalFragments_ = 0L;
      this.onChanged();
      return this;
   }

   public PftpResponse$PbPFtpDiskSpaceResult$Builder clone() {
      return (PftpResponse$PbPFtpDiskSpaceResult$Builder)super.clone();
   }

   public PftpResponse$PbPFtpDiskSpaceResult getDefaultInstanceForType() {
      return PftpResponse$PbPFtpDiskSpaceResult.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PftpResponse.k();
   }

   public int getFragmentSize() {
      return this.fragmentSize_;
   }

   public long getFreeFragments() {
      return this.freeFragments_;
   }

   public long getTotalFragments() {
      return this.totalFragments_;
   }

   public boolean hasFragmentSize() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasFreeFragments() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTotalFragments() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpResponse.l().ensureFieldAccessorsInitialized(PftpResponse$PbPFtpDiskSpaceResult.class, PftpResponse$PbPFtpDiskSpaceResult$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasFragmentSize()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasTotalFragments()) {
            var2 = var1;
            if (this.hasFreeFragments()) {
               var2 = true;
            }
         }
      }

      return var2;
   }

   public PftpResponse$PbPFtpDiskSpaceResult$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpResponse$PbPFtpDiskSpaceResult var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (PftpResponse$PbPFtpDiskSpaceResult)PftpResponse$PbPFtpDiskSpaceResult.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (PftpResponse$PbPFtpDiskSpaceResult)var10.getUnfinishedMessage();
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

   public PftpResponse$PbPFtpDiskSpaceResult$Builder mergeFrom(Message var1) {
      PftpResponse$PbPFtpDiskSpaceResult$Builder var2;
      if (var1 instanceof PftpResponse$PbPFtpDiskSpaceResult) {
         var2 = this.mergeFrom((PftpResponse$PbPFtpDiskSpaceResult)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpResponse$PbPFtpDiskSpaceResult$Builder mergeFrom(PftpResponse$PbPFtpDiskSpaceResult var1) {
      if (var1 != PftpResponse$PbPFtpDiskSpaceResult.getDefaultInstance()) {
         if (var1.hasFragmentSize()) {
            this.setFragmentSize(var1.getFragmentSize());
         }

         if (var1.hasTotalFragments()) {
            this.setTotalFragments(var1.getTotalFragments());
         }

         if (var1.hasFreeFragments()) {
            this.setFreeFragments(var1.getFreeFragments());
         }

         this.mergeUnknownFields(PftpResponse$PbPFtpDiskSpaceResult.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final PftpResponse$PbPFtpDiskSpaceResult$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpResponse$PbPFtpDiskSpaceResult$Builder)super.mergeUnknownFields(var1);
   }

   public PftpResponse$PbPFtpDiskSpaceResult$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpResponse$PbPFtpDiskSpaceResult$Builder)super.setField(var1, var2);
   }

   public PftpResponse$PbPFtpDiskSpaceResult$Builder setFragmentSize(int var1) {
      this.bitField0_ |= 1;
      this.fragmentSize_ = var1;
      this.onChanged();
      return this;
   }

   public PftpResponse$PbPFtpDiskSpaceResult$Builder setFreeFragments(long var1) {
      this.bitField0_ |= 4;
      this.freeFragments_ = var1;
      this.onChanged();
      return this;
   }

   public PftpResponse$PbPFtpDiskSpaceResult$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpResponse$PbPFtpDiskSpaceResult$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public PftpResponse$PbPFtpDiskSpaceResult$Builder setTotalFragments(long var1) {
      this.bitField0_ |= 2;
      this.totalFragments_ = var1;
      this.onChanged();
      return this;
   }

   public final PftpResponse$PbPFtpDiskSpaceResult$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpResponse$PbPFtpDiskSpaceResult$Builder)super.setUnknownFields(var1);
   }
}
