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

public final class PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder extends Builder implements PftpResponse$PbPFtpGenerateChallengeTokenResultOrBuilder {
   private int bitField0_;
   private ByteString token_;

   private PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder() {
      this.token_ = ByteString.EMPTY;
      this.maybeForceBuilderInitialization();
   }

   private PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder(BuilderParent var1) {
      super(var1);
      this.token_ = ByteString.EMPTY;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder(BuilderParent var1, PftpResponse$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder(PftpResponse$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PftpResponse.m();
   }

   private void maybeForceBuilderInitialization() {
      if (PftpResponse$PbPFtpGenerateChallengeTokenResult.b()) {
      }

   }

   public PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpResponse$PbPFtpGenerateChallengeTokenResult build() {
      PftpResponse$PbPFtpGenerateChallengeTokenResult var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpResponse$PbPFtpGenerateChallengeTokenResult buildPartial() {
      byte var1 = 1;
      PftpResponse$PbPFtpGenerateChallengeTokenResult var2 = new PftpResponse$PbPFtpGenerateChallengeTokenResult(this, (PftpResponse$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      PftpResponse$PbPFtpGenerateChallengeTokenResult.a(var2, this.token_);
      PftpResponse$PbPFtpGenerateChallengeTokenResult.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder clear() {
      super.clear();
      this.token_ = ByteString.EMPTY;
      this.bitField0_ &= -2;
      return this;
   }

   public PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder clearField(FieldDescriptor var1) {
      return (PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder)super.clearField(var1);
   }

   public PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder clearOneof(OneofDescriptor var1) {
      return (PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder)super.clearOneof(var1);
   }

   public PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder clearToken() {
      this.bitField0_ &= -2;
      this.token_ = PftpResponse$PbPFtpGenerateChallengeTokenResult.getDefaultInstance().getToken();
      this.onChanged();
      return this;
   }

   public PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder clone() {
      return (PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder)super.clone();
   }

   public PftpResponse$PbPFtpGenerateChallengeTokenResult getDefaultInstanceForType() {
      return PftpResponse$PbPFtpGenerateChallengeTokenResult.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PftpResponse.m();
   }

   public ByteString getToken() {
      return this.token_;
   }

   public boolean hasToken() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpResponse.n().ensureFieldAccessorsInitialized(PftpResponse$PbPFtpGenerateChallengeTokenResult.class, PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasToken()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpResponse$PbPFtpGenerateChallengeTokenResult var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (PftpResponse$PbPFtpGenerateChallengeTokenResult)PftpResponse$PbPFtpGenerateChallengeTokenResult.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (PftpResponse$PbPFtpGenerateChallengeTokenResult)var10.getUnfinishedMessage();
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

   public PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder mergeFrom(Message var1) {
      PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder var2;
      if (var1 instanceof PftpResponse$PbPFtpGenerateChallengeTokenResult) {
         var2 = this.mergeFrom((PftpResponse$PbPFtpGenerateChallengeTokenResult)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder mergeFrom(PftpResponse$PbPFtpGenerateChallengeTokenResult var1) {
      if (var1 != PftpResponse$PbPFtpGenerateChallengeTokenResult.getDefaultInstance()) {
         if (var1.hasToken()) {
            this.setToken(var1.getToken());
         }

         this.mergeUnknownFields(PftpResponse$PbPFtpGenerateChallengeTokenResult.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder)super.mergeUnknownFields(var1);
   }

   public PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder)super.setField(var1, var2);
   }

   public PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder setToken(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.token_ = var1;
         this.onChanged();
         return this;
      }
   }

   public final PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpResponse$PbPFtpGenerateChallengeTokenResult$Builder)super.setUnknownFields(var1);
   }
}
