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

public final class PftpRequest$PbPFtpOperation$Builder extends Builder implements PftpRequest$PbPFtpOperationOrBuilder {
   private int bitField0_;
   private int command_;
   private Object path_;

   private PftpRequest$PbPFtpOperation$Builder() {
      this.command_ = 0;
      this.path_ = "";
      this.maybeForceBuilderInitialization();
   }

   private PftpRequest$PbPFtpOperation$Builder(BuilderParent var1) {
      super(var1);
      this.command_ = 0;
      this.path_ = "";
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpRequest$PbPFtpOperation$Builder(BuilderParent var1, PftpRequest$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpRequest$PbPFtpOperation$Builder(PftpRequest$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PftpRequest.a();
   }

   private void maybeForceBuilderInitialization() {
      if (PftpRequest$PbPFtpOperation.b()) {
      }

   }

   public PftpRequest$PbPFtpOperation$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpRequest$PbPFtpOperation$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpRequest$PbPFtpOperation build() {
      PftpRequest$PbPFtpOperation var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpRequest$PbPFtpOperation buildPartial() {
      byte var1 = 1;
      PftpRequest$PbPFtpOperation var2 = new PftpRequest$PbPFtpOperation(this, (PftpRequest$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      PftpRequest$PbPFtpOperation.a(var2, this.command_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      PftpRequest$PbPFtpOperation.a(var2, this.path_);
      PftpRequest$PbPFtpOperation.b(var2, var4);
      this.onBuilt();
      return var2;
   }

   public PftpRequest$PbPFtpOperation$Builder clear() {
      super.clear();
      this.command_ = 0;
      this.bitField0_ &= -2;
      this.path_ = "";
      this.bitField0_ &= -3;
      return this;
   }

   public PftpRequest$PbPFtpOperation$Builder clearCommand() {
      this.bitField0_ &= -2;
      this.command_ = 0;
      this.onChanged();
      return this;
   }

   public PftpRequest$PbPFtpOperation$Builder clearField(FieldDescriptor var1) {
      return (PftpRequest$PbPFtpOperation$Builder)super.clearField(var1);
   }

   public PftpRequest$PbPFtpOperation$Builder clearOneof(OneofDescriptor var1) {
      return (PftpRequest$PbPFtpOperation$Builder)super.clearOneof(var1);
   }

   public PftpRequest$PbPFtpOperation$Builder clearPath() {
      this.bitField0_ &= -3;
      this.path_ = PftpRequest$PbPFtpOperation.getDefaultInstance().getPath();
      this.onChanged();
      return this;
   }

   public PftpRequest$PbPFtpOperation$Builder clone() {
      return (PftpRequest$PbPFtpOperation$Builder)super.clone();
   }

   public PftpRequest$PbPFtpOperation$Command getCommand() {
      PftpRequest$PbPFtpOperation$Command var1 = PftpRequest$PbPFtpOperation$Command.valueOf(this.command_);
      PftpRequest$PbPFtpOperation$Command var2 = var1;
      if (var1 == null) {
         var2 = PftpRequest$PbPFtpOperation$Command.GET;
      }

      return var2;
   }

   public PftpRequest$PbPFtpOperation getDefaultInstanceForType() {
      return PftpRequest$PbPFtpOperation.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PftpRequest.a();
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

   public boolean hasCommand() {
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
      return PftpRequest.b().ensureFieldAccessorsInitialized(PftpRequest$PbPFtpOperation.class, PftpRequest$PbPFtpOperation$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasCommand() && this.hasPath()) {
         var1 = true;
      }

      return var1;
   }

   public PftpRequest$PbPFtpOperation$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpRequest$PbPFtpOperation var13;
      label96: {
         InvalidProtocolBufferException var12;
         PftpRequest$PbPFtpOperation var14;
         try {
            var13 = (PftpRequest$PbPFtpOperation)PftpRequest$PbPFtpOperation.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (PftpRequest$PbPFtpOperation)var10.getUnfinishedMessage();
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

   public PftpRequest$PbPFtpOperation$Builder mergeFrom(Message var1) {
      PftpRequest$PbPFtpOperation$Builder var2;
      if (var1 instanceof PftpRequest$PbPFtpOperation) {
         var2 = this.mergeFrom((PftpRequest$PbPFtpOperation)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpRequest$PbPFtpOperation$Builder mergeFrom(PftpRequest$PbPFtpOperation var1) {
      if (var1 != PftpRequest$PbPFtpOperation.getDefaultInstance()) {
         if (var1.hasCommand()) {
            this.setCommand(var1.getCommand());
         }

         if (var1.hasPath()) {
            this.bitField0_ |= 2;
            this.path_ = PftpRequest$PbPFtpOperation.a(var1);
            this.onChanged();
         }

         this.mergeUnknownFields(PftpRequest$PbPFtpOperation.b(var1));
         this.onChanged();
      }

      return this;
   }

   public final PftpRequest$PbPFtpOperation$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpRequest$PbPFtpOperation$Builder)super.mergeUnknownFields(var1);
   }

   public PftpRequest$PbPFtpOperation$Builder setCommand(PftpRequest$PbPFtpOperation$Command var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.command_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public PftpRequest$PbPFtpOperation$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpRequest$PbPFtpOperation$Builder)super.setField(var1, var2);
   }

   public PftpRequest$PbPFtpOperation$Builder setPath(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.path_ = var1;
         this.onChanged();
         return this;
      }
   }

   public PftpRequest$PbPFtpOperation$Builder setPathBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.path_ = var1;
         this.onChanged();
         return this;
      }
   }

   public PftpRequest$PbPFtpOperation$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpRequest$PbPFtpOperation$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final PftpRequest$PbPFtpOperation$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpRequest$PbPFtpOperation$Builder)super.setUnknownFields(var1);
   }
}
