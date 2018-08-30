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

public final class Structures$PbBleDeviceName$Builder extends Builder implements Structures$PbBleDeviceNameOrBuilder {
   private int bitField0_;
   private Object name_;

   private Structures$PbBleDeviceName$Builder() {
      this.name_ = "";
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbBleDeviceName$Builder(BuilderParent var1) {
      super(var1);
      this.name_ = "";
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbBleDeviceName$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbBleDeviceName$Builder(Structures$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Structures.s();
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbBleDeviceName.b()) {
      }

   }

   public Structures$PbBleDeviceName$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbBleDeviceName$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbBleDeviceName build() {
      Structures$PbBleDeviceName var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbBleDeviceName buildPartial() {
      byte var1 = 1;
      Structures$PbBleDeviceName var2 = new Structures$PbBleDeviceName(this, (Structures$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      Structures$PbBleDeviceName.a(var2, this.name_);
      Structures$PbBleDeviceName.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public Structures$PbBleDeviceName$Builder clear() {
      super.clear();
      this.name_ = "";
      this.bitField0_ &= -2;
      return this;
   }

   public Structures$PbBleDeviceName$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbBleDeviceName$Builder)super.clearField(var1);
   }

   public Structures$PbBleDeviceName$Builder clearName() {
      this.bitField0_ &= -2;
      this.name_ = Structures$PbBleDeviceName.getDefaultInstance().getName();
      this.onChanged();
      return this;
   }

   public Structures$PbBleDeviceName$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbBleDeviceName$Builder)super.clearOneof(var1);
   }

   public Structures$PbBleDeviceName$Builder clone() {
      return (Structures$PbBleDeviceName$Builder)super.clone();
   }

   public Structures$PbBleDeviceName getDefaultInstanceForType() {
      return Structures$PbBleDeviceName.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.s();
   }

   public String getName() {
      Object var1 = this.name_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.name_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getNameBytes() {
      Object var1 = this.name_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.name_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public boolean hasName() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.t().ensureFieldAccessorsInitialized(Structures$PbBleDeviceName.class, Structures$PbBleDeviceName$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasName()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public Structures$PbBleDeviceName$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbBleDeviceName var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (Structures$PbBleDeviceName)Structures$PbBleDeviceName.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (Structures$PbBleDeviceName)var10.getUnfinishedMessage();
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

   public Structures$PbBleDeviceName$Builder mergeFrom(Message var1) {
      Structures$PbBleDeviceName$Builder var2;
      if (var1 instanceof Structures$PbBleDeviceName) {
         var2 = this.mergeFrom((Structures$PbBleDeviceName)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbBleDeviceName$Builder mergeFrom(Structures$PbBleDeviceName var1) {
      if (var1 != Structures$PbBleDeviceName.getDefaultInstance()) {
         if (var1.hasName()) {
            this.bitField0_ |= 1;
            this.name_ = Structures$PbBleDeviceName.a(var1);
            this.onChanged();
         }

         this.mergeUnknownFields(Structures$PbBleDeviceName.b(var1));
         this.onChanged();
      }

      return this;
   }

   public final Structures$PbBleDeviceName$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbBleDeviceName$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbBleDeviceName$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbBleDeviceName$Builder)super.setField(var1, var2);
   }

   public Structures$PbBleDeviceName$Builder setName(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.name_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Structures$PbBleDeviceName$Builder setNameBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.name_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Structures$PbBleDeviceName$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbBleDeviceName$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final Structures$PbBleDeviceName$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbBleDeviceName$Builder)super.setUnknownFields(var1);
   }
}
