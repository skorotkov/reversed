package fi.polar.remote.representation.protobuf;

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

public final class Structures$PbDeviceId$Builder extends Builder implements Structures$PbDeviceIdOrBuilder {
   private int bitField0_;
   private Object deviceId_;

   private Structures$PbDeviceId$Builder() {
      this.deviceId_ = "";
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbDeviceId$Builder(BuilderParent var1) {
      super(var1);
      this.deviceId_ = "";
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbDeviceId$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbDeviceId$Builder(Structures$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Structures.u();
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbDeviceId.b()) {
      }

   }

   public Structures$PbDeviceId$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbDeviceId$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbDeviceId build() {
      Structures$PbDeviceId var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbDeviceId buildPartial() {
      byte var1 = 1;
      Structures$PbDeviceId var2 = new Structures$PbDeviceId(this, (Structures$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      Structures$PbDeviceId.a(var2, this.deviceId_);
      Structures$PbDeviceId.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public Structures$PbDeviceId$Builder clear() {
      super.clear();
      this.deviceId_ = "";
      this.bitField0_ &= -2;
      return this;
   }

   public Structures$PbDeviceId$Builder clearDeviceId() {
      this.bitField0_ &= -2;
      this.deviceId_ = Structures$PbDeviceId.getDefaultInstance().getDeviceId();
      this.onChanged();
      return this;
   }

   public Structures$PbDeviceId$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbDeviceId$Builder)super.clearField(var1);
   }

   public Structures$PbDeviceId$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbDeviceId$Builder)super.clearOneof(var1);
   }

   public Structures$PbDeviceId$Builder clone() {
      return (Structures$PbDeviceId$Builder)super.clone();
   }

   public Structures$PbDeviceId getDefaultInstanceForType() {
      return Structures$PbDeviceId.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.u();
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
      return Structures.v().ensureFieldAccessorsInitialized(Structures$PbDeviceId.class, Structures$PbDeviceId$Builder.class);
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

   public Structures$PbDeviceId$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbDeviceId var13;
      label96: {
         InvalidProtocolBufferException var12;
         Structures$PbDeviceId var14;
         try {
            var13 = (Structures$PbDeviceId)Structures$PbDeviceId.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Structures$PbDeviceId)var10.getUnfinishedMessage();
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

   public Structures$PbDeviceId$Builder mergeFrom(Message var1) {
      Structures$PbDeviceId$Builder var2;
      if (var1 instanceof Structures$PbDeviceId) {
         var2 = this.mergeFrom((Structures$PbDeviceId)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbDeviceId$Builder mergeFrom(Structures$PbDeviceId var1) {
      if (var1 != Structures$PbDeviceId.getDefaultInstance()) {
         if (var1.hasDeviceId()) {
            this.bitField0_ |= 1;
            this.deviceId_ = Structures$PbDeviceId.a(var1);
            this.onChanged();
         }

         this.mergeUnknownFields(Structures$PbDeviceId.b(var1));
         this.onChanged();
      }

      return this;
   }

   public final Structures$PbDeviceId$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbDeviceId$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbDeviceId$Builder setDeviceId(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.deviceId_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Structures$PbDeviceId$Builder setDeviceIdBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.deviceId_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Structures$PbDeviceId$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbDeviceId$Builder)super.setField(var1, var2);
   }

   public Structures$PbDeviceId$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbDeviceId$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final Structures$PbDeviceId$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbDeviceId$Builder)super.setUnknownFields(var1);
   }
}
