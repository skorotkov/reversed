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

public final class PftpNotification$PbPFtpStopSyncParams$Builder extends Builder implements PftpNotification$PbPFtpStopSyncParamsOrBuilder {
   private int bitField0_;
   private boolean completed_;
   private Object description_;

   private PftpNotification$PbPFtpStopSyncParams$Builder() {
      this.description_ = "";
      this.maybeForceBuilderInitialization();
   }

   private PftpNotification$PbPFtpStopSyncParams$Builder(BuilderParent var1) {
      super(var1);
      this.description_ = "";
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpStopSyncParams$Builder(BuilderParent var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpStopSyncParams$Builder(PftpNotification$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.w();
   }

   private void maybeForceBuilderInitialization() {
      if (PftpNotification$PbPFtpStopSyncParams.b()) {
      }

   }

   public PftpNotification$PbPFtpStopSyncParams$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPFtpStopSyncParams$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpNotification$PbPFtpStopSyncParams build() {
      PftpNotification$PbPFtpStopSyncParams var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpNotification$PbPFtpStopSyncParams buildPartial() {
      byte var1 = 1;
      PftpNotification$PbPFtpStopSyncParams var2 = new PftpNotification$PbPFtpStopSyncParams(this, (PftpNotification$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      PftpNotification$PbPFtpStopSyncParams.a(var2, this.completed_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      PftpNotification$PbPFtpStopSyncParams.a(var2, this.description_);
      PftpNotification$PbPFtpStopSyncParams.a(var2, var4);
      this.onBuilt();
      return var2;
   }

   public PftpNotification$PbPFtpStopSyncParams$Builder clear() {
      super.clear();
      this.completed_ = false;
      this.bitField0_ &= -2;
      this.description_ = "";
      this.bitField0_ &= -3;
      return this;
   }

   public PftpNotification$PbPFtpStopSyncParams$Builder clearCompleted() {
      this.bitField0_ &= -2;
      this.completed_ = false;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPFtpStopSyncParams$Builder clearDescription() {
      this.bitField0_ &= -3;
      this.description_ = PftpNotification$PbPFtpStopSyncParams.getDefaultInstance().getDescription();
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPFtpStopSyncParams$Builder clearField(FieldDescriptor var1) {
      return (PftpNotification$PbPFtpStopSyncParams$Builder)super.clearField(var1);
   }

   public PftpNotification$PbPFtpStopSyncParams$Builder clearOneof(OneofDescriptor var1) {
      return (PftpNotification$PbPFtpStopSyncParams$Builder)super.clearOneof(var1);
   }

   public PftpNotification$PbPFtpStopSyncParams$Builder clone() {
      return (PftpNotification$PbPFtpStopSyncParams$Builder)super.clone();
   }

   public boolean getCompleted() {
      return this.completed_;
   }

   public PftpNotification$PbPFtpStopSyncParams getDefaultInstanceForType() {
      return PftpNotification$PbPFtpStopSyncParams.getDefaultInstance();
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
      return PftpNotification.w();
   }

   public boolean hasCompleted() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
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

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.x().ensureFieldAccessorsInitialized(PftpNotification$PbPFtpStopSyncParams.class, PftpNotification$PbPFtpStopSyncParams$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasCompleted()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public PftpNotification$PbPFtpStopSyncParams$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpNotification$PbPFtpStopSyncParams var13;
      label96: {
         InvalidProtocolBufferException var12;
         PftpNotification$PbPFtpStopSyncParams var14;
         try {
            var13 = (PftpNotification$PbPFtpStopSyncParams)PftpNotification$PbPFtpStopSyncParams.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (PftpNotification$PbPFtpStopSyncParams)var10.getUnfinishedMessage();
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

   public PftpNotification$PbPFtpStopSyncParams$Builder mergeFrom(Message var1) {
      PftpNotification$PbPFtpStopSyncParams$Builder var2;
      if (var1 instanceof PftpNotification$PbPFtpStopSyncParams) {
         var2 = this.mergeFrom((PftpNotification$PbPFtpStopSyncParams)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpNotification$PbPFtpStopSyncParams$Builder mergeFrom(PftpNotification$PbPFtpStopSyncParams var1) {
      if (var1 != PftpNotification$PbPFtpStopSyncParams.getDefaultInstance()) {
         if (var1.hasCompleted()) {
            this.setCompleted(var1.getCompleted());
         }

         if (var1.hasDescription()) {
            this.bitField0_ |= 2;
            this.description_ = PftpNotification$PbPFtpStopSyncParams.a(var1);
            this.onChanged();
         }

         this.mergeUnknownFields(PftpNotification$PbPFtpStopSyncParams.b(var1));
         this.onChanged();
      }

      return this;
   }

   public final PftpNotification$PbPFtpStopSyncParams$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPFtpStopSyncParams$Builder)super.mergeUnknownFields(var1);
   }

   public PftpNotification$PbPFtpStopSyncParams$Builder setCompleted(boolean var1) {
      this.bitField0_ |= 1;
      this.completed_ = var1;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPFtpStopSyncParams$Builder setDescription(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.description_ = var1;
         this.onChanged();
         return this;
      }
   }

   public PftpNotification$PbPFtpStopSyncParams$Builder setDescriptionBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.description_ = var1;
         this.onChanged();
         return this;
      }
   }

   public PftpNotification$PbPFtpStopSyncParams$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPFtpStopSyncParams$Builder)super.setField(var1, var2);
   }

   public PftpNotification$PbPFtpStopSyncParams$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpNotification$PbPFtpStopSyncParams$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final PftpNotification$PbPFtpStopSyncParams$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPFtpStopSyncParams$Builder)super.setUnknownFields(var1);
   }
}
