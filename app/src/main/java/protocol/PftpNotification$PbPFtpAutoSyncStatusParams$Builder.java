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

public final class PftpNotification$PbPFtpAutoSyncStatusParams$Builder extends Builder implements PftpNotification$PbPFtpAutoSyncStatusParamsOrBuilder {
   private int bitField0_;
   private Object description_;
   private boolean succeeded_;

   private PftpNotification$PbPFtpAutoSyncStatusParams$Builder() {
      this.description_ = "";
      this.maybeForceBuilderInitialization();
   }

   private PftpNotification$PbPFtpAutoSyncStatusParams$Builder(BuilderParent var1) {
      super(var1);
      this.description_ = "";
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpAutoSyncStatusParams$Builder(BuilderParent var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpAutoSyncStatusParams$Builder(PftpNotification$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.g();
   }

   private void maybeForceBuilderInitialization() {
      if (PftpNotification$PbPFtpAutoSyncStatusParams.b()) {
      }

   }

   public PftpNotification$PbPFtpAutoSyncStatusParams$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPFtpAutoSyncStatusParams$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpNotification$PbPFtpAutoSyncStatusParams build() {
      PftpNotification$PbPFtpAutoSyncStatusParams var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpNotification$PbPFtpAutoSyncStatusParams buildPartial() {
      byte var1 = 1;
      PftpNotification$PbPFtpAutoSyncStatusParams var2 = new PftpNotification$PbPFtpAutoSyncStatusParams(this, (PftpNotification$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      PftpNotification$PbPFtpAutoSyncStatusParams.a(var2, this.succeeded_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      PftpNotification$PbPFtpAutoSyncStatusParams.a(var2, this.description_);
      PftpNotification$PbPFtpAutoSyncStatusParams.a(var2, var4);
      this.onBuilt();
      return var2;
   }

   public PftpNotification$PbPFtpAutoSyncStatusParams$Builder clear() {
      super.clear();
      this.succeeded_ = false;
      this.bitField0_ &= -2;
      this.description_ = "";
      this.bitField0_ &= -3;
      return this;
   }

   public PftpNotification$PbPFtpAutoSyncStatusParams$Builder clearDescription() {
      this.bitField0_ &= -3;
      this.description_ = PftpNotification$PbPFtpAutoSyncStatusParams.getDefaultInstance().getDescription();
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPFtpAutoSyncStatusParams$Builder clearField(FieldDescriptor var1) {
      return (PftpNotification$PbPFtpAutoSyncStatusParams$Builder)super.clearField(var1);
   }

   public PftpNotification$PbPFtpAutoSyncStatusParams$Builder clearOneof(OneofDescriptor var1) {
      return (PftpNotification$PbPFtpAutoSyncStatusParams$Builder)super.clearOneof(var1);
   }

   public PftpNotification$PbPFtpAutoSyncStatusParams$Builder clearSucceeded() {
      this.bitField0_ &= -2;
      this.succeeded_ = false;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPFtpAutoSyncStatusParams$Builder clone() {
      return (PftpNotification$PbPFtpAutoSyncStatusParams$Builder)super.clone();
   }

   public PftpNotification$PbPFtpAutoSyncStatusParams getDefaultInstanceForType() {
      return PftpNotification$PbPFtpAutoSyncStatusParams.getDefaultInstance();
   }

   public String getDescription() {
      Object var1 = this.description_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.description_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getDescriptionBytes() {
      Object var1 = this.description_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.description_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public Descriptor getDescriptorForType() {
      return PftpNotification.g();
   }

   public boolean getSucceeded() {
      return this.succeeded_;
   }

   public boolean hasDescription() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSucceeded() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.h().ensureFieldAccessorsInitialized(PftpNotification$PbPFtpAutoSyncStatusParams.class, PftpNotification$PbPFtpAutoSyncStatusParams$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasSucceeded()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public PftpNotification$PbPFtpAutoSyncStatusParams$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpNotification$PbPFtpAutoSyncStatusParams var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (PftpNotification$PbPFtpAutoSyncStatusParams)PftpNotification$PbPFtpAutoSyncStatusParams.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (PftpNotification$PbPFtpAutoSyncStatusParams)var10.getUnfinishedMessage();
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

   public PftpNotification$PbPFtpAutoSyncStatusParams$Builder mergeFrom(Message var1) {
      PftpNotification$PbPFtpAutoSyncStatusParams$Builder var2;
      if (var1 instanceof PftpNotification$PbPFtpAutoSyncStatusParams) {
         var2 = this.mergeFrom((PftpNotification$PbPFtpAutoSyncStatusParams)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpNotification$PbPFtpAutoSyncStatusParams$Builder mergeFrom(PftpNotification$PbPFtpAutoSyncStatusParams var1) {
      if (var1 != PftpNotification$PbPFtpAutoSyncStatusParams.getDefaultInstance()) {
         if (var1.hasSucceeded()) {
            this.setSucceeded(var1.getSucceeded());
         }

         if (var1.hasDescription()) {
            this.bitField0_ |= 2;
            this.description_ = PftpNotification$PbPFtpAutoSyncStatusParams.a(var1);
            this.onChanged();
         }

         this.mergeUnknownFields(PftpNotification$PbPFtpAutoSyncStatusParams.b(var1));
         this.onChanged();
      }

      return this;
   }

   public final PftpNotification$PbPFtpAutoSyncStatusParams$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPFtpAutoSyncStatusParams$Builder)super.mergeUnknownFields(var1);
   }

   public PftpNotification$PbPFtpAutoSyncStatusParams$Builder setDescription(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.description_ = var1;
         this.onChanged();
         return this;
      }
   }

   public PftpNotification$PbPFtpAutoSyncStatusParams$Builder setDescriptionBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.description_ = var1;
         this.onChanged();
         return this;
      }
   }

   public PftpNotification$PbPFtpAutoSyncStatusParams$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPFtpAutoSyncStatusParams$Builder)super.setField(var1, var2);
   }

   public PftpNotification$PbPFtpAutoSyncStatusParams$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpNotification$PbPFtpAutoSyncStatusParams$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public PftpNotification$PbPFtpAutoSyncStatusParams$Builder setSucceeded(boolean var1) {
      this.bitField0_ |= 1;
      this.succeeded_ = var1;
      this.onChanged();
      return this;
   }

   public final PftpNotification$PbPFtpAutoSyncStatusParams$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPFtpAutoSyncStatusParams$Builder)super.setUnknownFields(var1);
   }
}
