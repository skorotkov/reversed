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

public final class PftpResponse$PbPFtpIdentifyDeviceResult$Builder extends Builder implements PftpResponse$PbPFtpIdentifyDeviceResultOrBuilder {
   private int bitField0_;
   private Object deviceId_;

   private PftpResponse$PbPFtpIdentifyDeviceResult$Builder() {
      this.deviceId_ = "";
      this.maybeForceBuilderInitialization();
   }

   private PftpResponse$PbPFtpIdentifyDeviceResult$Builder(BuilderParent var1) {
      super(var1);
      this.deviceId_ = "";
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpIdentifyDeviceResult$Builder(BuilderParent var1, PftpResponse$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpResponse$PbPFtpIdentifyDeviceResult$Builder(PftpResponse$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PftpResponse.e();
   }

   private void maybeForceBuilderInitialization() {
      if (PftpResponse$PbPFtpIdentifyDeviceResult.b()) {
      }

   }

   public PftpResponse$PbPFtpIdentifyDeviceResult$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpResponse$PbPFtpIdentifyDeviceResult$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpResponse$PbPFtpIdentifyDeviceResult build() {
      PftpResponse$PbPFtpIdentifyDeviceResult var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpResponse$PbPFtpIdentifyDeviceResult buildPartial() {
      byte var1 = 1;
      PftpResponse$PbPFtpIdentifyDeviceResult var2 = new PftpResponse$PbPFtpIdentifyDeviceResult(this, (PftpResponse$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      PftpResponse$PbPFtpIdentifyDeviceResult.a(var2, this.deviceId_);
      PftpResponse$PbPFtpIdentifyDeviceResult.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public PftpResponse$PbPFtpIdentifyDeviceResult$Builder clear() {
      super.clear();
      this.deviceId_ = "";
      this.bitField0_ &= -2;
      return this;
   }

   public PftpResponse$PbPFtpIdentifyDeviceResult$Builder clearDeviceId() {
      this.bitField0_ &= -2;
      this.deviceId_ = PftpResponse$PbPFtpIdentifyDeviceResult.getDefaultInstance().getDeviceId();
      this.onChanged();
      return this;
   }

   public PftpResponse$PbPFtpIdentifyDeviceResult$Builder clearField(FieldDescriptor var1) {
      return (PftpResponse$PbPFtpIdentifyDeviceResult$Builder)super.clearField(var1);
   }

   public PftpResponse$PbPFtpIdentifyDeviceResult$Builder clearOneof(OneofDescriptor var1) {
      return (PftpResponse$PbPFtpIdentifyDeviceResult$Builder)super.clearOneof(var1);
   }

   public PftpResponse$PbPFtpIdentifyDeviceResult$Builder clone() {
      return (PftpResponse$PbPFtpIdentifyDeviceResult$Builder)super.clone();
   }

   public PftpResponse$PbPFtpIdentifyDeviceResult getDefaultInstanceForType() {
      return PftpResponse$PbPFtpIdentifyDeviceResult.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PftpResponse.e();
   }

   public String getDeviceId() {
      Object var1 = this.deviceId_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.deviceId_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getDeviceIdBytes() {
      Object var1 = this.deviceId_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.deviceId_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public boolean hasDeviceId() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpResponse.f().ensureFieldAccessorsInitialized(PftpResponse$PbPFtpIdentifyDeviceResult.class, PftpResponse$PbPFtpIdentifyDeviceResult$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasDeviceId()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public PftpResponse$PbPFtpIdentifyDeviceResult$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpResponse$PbPFtpIdentifyDeviceResult var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (PftpResponse$PbPFtpIdentifyDeviceResult)PftpResponse$PbPFtpIdentifyDeviceResult.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (PftpResponse$PbPFtpIdentifyDeviceResult)var11.getUnfinishedMessage();
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

   public PftpResponse$PbPFtpIdentifyDeviceResult$Builder mergeFrom(Message var1) {
      PftpResponse$PbPFtpIdentifyDeviceResult$Builder var2;
      if (var1 instanceof PftpResponse$PbPFtpIdentifyDeviceResult) {
         var2 = this.mergeFrom((PftpResponse$PbPFtpIdentifyDeviceResult)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpResponse$PbPFtpIdentifyDeviceResult$Builder mergeFrom(PftpResponse$PbPFtpIdentifyDeviceResult var1) {
      if (var1 != PftpResponse$PbPFtpIdentifyDeviceResult.getDefaultInstance()) {
         if (var1.hasDeviceId()) {
            this.bitField0_ |= 1;
            this.deviceId_ = PftpResponse$PbPFtpIdentifyDeviceResult.a(var1);
            this.onChanged();
         }

         this.mergeUnknownFields(PftpResponse$PbPFtpIdentifyDeviceResult.b(var1));
         this.onChanged();
      }

      return this;
   }

   public final PftpResponse$PbPFtpIdentifyDeviceResult$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpResponse$PbPFtpIdentifyDeviceResult$Builder)super.mergeUnknownFields(var1);
   }

   public PftpResponse$PbPFtpIdentifyDeviceResult$Builder setDeviceId(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.deviceId_ = var1;
         this.onChanged();
         return this;
      }
   }

   public PftpResponse$PbPFtpIdentifyDeviceResult$Builder setDeviceIdBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.deviceId_ = var1;
         this.onChanged();
         return this;
      }
   }

   public PftpResponse$PbPFtpIdentifyDeviceResult$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpResponse$PbPFtpIdentifyDeviceResult$Builder)super.setField(var1, var2);
   }

   public PftpResponse$PbPFtpIdentifyDeviceResult$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpResponse$PbPFtpIdentifyDeviceResult$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final PftpResponse$PbPFtpIdentifyDeviceResult$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpResponse$PbPFtpIdentifyDeviceResult$Builder)super.setUnknownFields(var1);
   }
}
