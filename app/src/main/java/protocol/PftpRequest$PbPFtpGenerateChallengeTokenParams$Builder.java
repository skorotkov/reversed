package protocol;

import com.google.protobuf.ByteString;
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

public final class PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder extends Builder implements PftpRequest$PbPFtpGenerateChallengeTokenParamsOrBuilder {
   private int bitField0_;
   private ByteString nonse_;
   private int userId_;

   private PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder() {
      this.nonse_ = ByteString.EMPTY;
      this.maybeForceBuilderInitialization();
   }

   private PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder(BuilderParent var1) {
      super(var1);
      this.nonse_ = ByteString.EMPTY;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder(BuilderParent var1, PftpRequest$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder(PftpRequest$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PftpRequest.g();
   }

   private void maybeForceBuilderInitialization() {
      if (PftpRequest$PbPFtpGenerateChallengeTokenParams.b()) {
      }

   }

   public PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpRequest$PbPFtpGenerateChallengeTokenParams build() {
      PftpRequest$PbPFtpGenerateChallengeTokenParams var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpRequest$PbPFtpGenerateChallengeTokenParams buildPartial() {
      byte var1 = 1;
      PftpRequest$PbPFtpGenerateChallengeTokenParams var2 = new PftpRequest$PbPFtpGenerateChallengeTokenParams(this, (PftpRequest$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      PftpRequest$PbPFtpGenerateChallengeTokenParams.a(var2, this.userId_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      PftpRequest$PbPFtpGenerateChallengeTokenParams.a(var2, this.nonse_);
      PftpRequest$PbPFtpGenerateChallengeTokenParams.b(var2, var4);
      this.onBuilt();
      return var2;
   }

   public PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder clear() {
      super.clear();
      this.userId_ = 0;
      this.bitField0_ &= -2;
      this.nonse_ = ByteString.EMPTY;
      this.bitField0_ &= -3;
      return this;
   }

   public PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder clearField(FieldDescriptor var1) {
      return (PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder)super.clearField(var1);
   }

   public PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder clearNonse() {
      this.bitField0_ &= -3;
      this.nonse_ = PftpRequest$PbPFtpGenerateChallengeTokenParams.getDefaultInstance().getNonse();
      this.onChanged();
      return this;
   }

   public PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder clearOneof(OneofDescriptor var1) {
      return (PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder)super.clearOneof(var1);
   }

   public PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder clearUserId() {
      this.bitField0_ &= -2;
      this.userId_ = 0;
      this.onChanged();
      return this;
   }

   public PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder clone() {
      return (PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder)super.clone();
   }

   public PftpRequest$PbPFtpGenerateChallengeTokenParams getDefaultInstanceForType() {
      return PftpRequest$PbPFtpGenerateChallengeTokenParams.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PftpRequest.g();
   }

   public ByteString getNonse() {
      return this.nonse_;
   }

   public int getUserId() {
      return this.userId_;
   }

   public boolean hasNonse() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasUserId() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpRequest.h().ensureFieldAccessorsInitialized(PftpRequest$PbPFtpGenerateChallengeTokenParams.class, PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasUserId() && this.hasNonse()) {
         var1 = true;
      }

      return var1;
   }

   public PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpRequest$PbPFtpGenerateChallengeTokenParams var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (PftpRequest$PbPFtpGenerateChallengeTokenParams)PftpRequest$PbPFtpGenerateChallengeTokenParams.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (PftpRequest$PbPFtpGenerateChallengeTokenParams)var11.getUnfinishedMessage();
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

   public PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder mergeFrom(Message var1) {
      PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder var2;
      if (var1 instanceof PftpRequest$PbPFtpGenerateChallengeTokenParams) {
         var2 = this.mergeFrom((PftpRequest$PbPFtpGenerateChallengeTokenParams)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder mergeFrom(PftpRequest$PbPFtpGenerateChallengeTokenParams var1) {
      if (var1 != PftpRequest$PbPFtpGenerateChallengeTokenParams.getDefaultInstance()) {
         if (var1.hasUserId()) {
            this.setUserId(var1.getUserId());
         }

         if (var1.hasNonse()) {
            this.setNonse(var1.getNonse());
         }

         this.mergeUnknownFields(PftpRequest$PbPFtpGenerateChallengeTokenParams.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder)super.mergeUnknownFields(var1);
   }

   public PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder)super.setField(var1, var2);
   }

   public PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder setNonse(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.nonse_ = var1;
         this.onChanged();
         return this;
      }
   }

   public PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder)super.setUnknownFields(var1);
   }

   public PftpRequest$PbPFtpGenerateChallengeTokenParams$Builder setUserId(int var1) {
      this.bitField0_ |= 1;
      this.userId_ = var1;
      this.onChanged();
      return this;
   }
}
