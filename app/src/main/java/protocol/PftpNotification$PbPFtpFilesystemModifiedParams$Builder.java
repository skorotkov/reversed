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

public final class PftpNotification$PbPFtpFilesystemModifiedParams$Builder extends Builder implements PftpNotification$PbPFtpFilesystemModifiedParamsOrBuilder {
   private int action_;
   private int bitField0_;
   private Object path_;

   private PftpNotification$PbPFtpFilesystemModifiedParams$Builder() {
      this.action_ = 0;
      this.path_ = "";
      this.maybeForceBuilderInitialization();
   }

   private PftpNotification$PbPFtpFilesystemModifiedParams$Builder(BuilderParent var1) {
      super(var1);
      this.action_ = 0;
      this.path_ = "";
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpFilesystemModifiedParams$Builder(BuilderParent var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpFilesystemModifiedParams$Builder(PftpNotification$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.a();
   }

   private void maybeForceBuilderInitialization() {
      if (PftpNotification$PbPFtpFilesystemModifiedParams.b()) {
      }

   }

   public PftpNotification$PbPFtpFilesystemModifiedParams$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPFtpFilesystemModifiedParams$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpNotification$PbPFtpFilesystemModifiedParams build() {
      PftpNotification$PbPFtpFilesystemModifiedParams var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpNotification$PbPFtpFilesystemModifiedParams buildPartial() {
      byte var1 = 1;
      PftpNotification$PbPFtpFilesystemModifiedParams var2 = new PftpNotification$PbPFtpFilesystemModifiedParams(this, (PftpNotification$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      PftpNotification$PbPFtpFilesystemModifiedParams.a(var2, this.action_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      PftpNotification$PbPFtpFilesystemModifiedParams.a(var2, this.path_);
      PftpNotification$PbPFtpFilesystemModifiedParams.b(var2, var4);
      this.onBuilt();
      return var2;
   }

   public PftpNotification$PbPFtpFilesystemModifiedParams$Builder clear() {
      super.clear();
      this.action_ = 0;
      this.bitField0_ &= -2;
      this.path_ = "";
      this.bitField0_ &= -3;
      return this;
   }

   public PftpNotification$PbPFtpFilesystemModifiedParams$Builder clearAction() {
      this.bitField0_ &= -2;
      this.action_ = 0;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPFtpFilesystemModifiedParams$Builder clearField(FieldDescriptor var1) {
      return (PftpNotification$PbPFtpFilesystemModifiedParams$Builder)super.clearField(var1);
   }

   public PftpNotification$PbPFtpFilesystemModifiedParams$Builder clearOneof(OneofDescriptor var1) {
      return (PftpNotification$PbPFtpFilesystemModifiedParams$Builder)super.clearOneof(var1);
   }

   public PftpNotification$PbPFtpFilesystemModifiedParams$Builder clearPath() {
      this.bitField0_ &= -3;
      this.path_ = PftpNotification$PbPFtpFilesystemModifiedParams.getDefaultInstance().getPath();
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPFtpFilesystemModifiedParams$Builder clone() {
      return (PftpNotification$PbPFtpFilesystemModifiedParams$Builder)super.clone();
   }

   public PftpNotification$Action getAction() {
      PftpNotification$Action var1 = PftpNotification$Action.valueOf(this.action_);
      PftpNotification$Action var2 = var1;
      if (var1 == null) {
         var2 = PftpNotification$Action.CREATED;
      }

      return var2;
   }

   public PftpNotification$PbPFtpFilesystemModifiedParams getDefaultInstanceForType() {
      return PftpNotification$PbPFtpFilesystemModifiedParams.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PftpNotification.a();
   }

   public String getPath() {
      Object var1 = this.path_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.path_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getPathBytes() {
      Object var1 = this.path_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.path_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public boolean hasAction() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPath() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.b().ensureFieldAccessorsInitialized(PftpNotification$PbPFtpFilesystemModifiedParams.class, PftpNotification$PbPFtpFilesystemModifiedParams$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasAction() && this.hasPath()) {
         var1 = true;
      }

      return var1;
   }

   public PftpNotification$PbPFtpFilesystemModifiedParams$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpNotification$PbPFtpFilesystemModifiedParams var13;
      label96: {
         InvalidProtocolBufferException var12;
         PftpNotification$PbPFtpFilesystemModifiedParams var14;
         try {
            var13 = (PftpNotification$PbPFtpFilesystemModifiedParams)PftpNotification$PbPFtpFilesystemModifiedParams.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (PftpNotification$PbPFtpFilesystemModifiedParams)var10.getUnfinishedMessage();
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

   public PftpNotification$PbPFtpFilesystemModifiedParams$Builder mergeFrom(Message var1) {
      PftpNotification$PbPFtpFilesystemModifiedParams$Builder var2;
      if (var1 instanceof PftpNotification$PbPFtpFilesystemModifiedParams) {
         var2 = this.mergeFrom((PftpNotification$PbPFtpFilesystemModifiedParams)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpNotification$PbPFtpFilesystemModifiedParams$Builder mergeFrom(PftpNotification$PbPFtpFilesystemModifiedParams var1) {
      if (var1 != PftpNotification$PbPFtpFilesystemModifiedParams.getDefaultInstance()) {
         if (var1.hasAction()) {
            this.setAction(var1.getAction());
         }

         if (var1.hasPath()) {
            this.bitField0_ |= 2;
            this.path_ = PftpNotification$PbPFtpFilesystemModifiedParams.a(var1);
            this.onChanged();
         }

         this.mergeUnknownFields(PftpNotification$PbPFtpFilesystemModifiedParams.b(var1));
         this.onChanged();
      }

      return this;
   }

   public final PftpNotification$PbPFtpFilesystemModifiedParams$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPFtpFilesystemModifiedParams$Builder)super.mergeUnknownFields(var1);
   }

   public PftpNotification$PbPFtpFilesystemModifiedParams$Builder setAction(PftpNotification$Action var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.action_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public PftpNotification$PbPFtpFilesystemModifiedParams$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPFtpFilesystemModifiedParams$Builder)super.setField(var1, var2);
   }

   public PftpNotification$PbPFtpFilesystemModifiedParams$Builder setPath(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.path_ = var1;
         this.onChanged();
         return this;
      }
   }

   public PftpNotification$PbPFtpFilesystemModifiedParams$Builder setPathBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.path_ = var1;
         this.onChanged();
         return this;
      }
   }

   public PftpNotification$PbPFtpFilesystemModifiedParams$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpNotification$PbPFtpFilesystemModifiedParams$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final PftpNotification$PbPFtpFilesystemModifiedParams$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPFtpFilesystemModifiedParams$Builder)super.setUnknownFields(var1);
   }
}
