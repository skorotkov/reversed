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

public final class Structures$PbBleUuid$Builder extends Builder implements Structures$PbBleUuidOrBuilder {
   private int bitField0_;
   private ByteString uuid_;

   private Structures$PbBleUuid$Builder() {
      this.uuid_ = ByteString.EMPTY;
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbBleUuid$Builder(BuilderParent var1) {
      super(var1);
      this.uuid_ = ByteString.EMPTY;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbBleUuid$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbBleUuid$Builder(Structures$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Structures.aa();
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbBleUuid.b()) {
      }

   }

   public Structures$PbBleUuid$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbBleUuid$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbBleUuid build() {
      Structures$PbBleUuid var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbBleUuid buildPartial() {
      byte var1 = 1;
      Structures$PbBleUuid var2 = new Structures$PbBleUuid(this, (Structures$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      Structures$PbBleUuid.a(var2, this.uuid_);
      Structures$PbBleUuid.a(var2, var1);
      this.onBuilt();
      return var2;
   }

   public Structures$PbBleUuid$Builder clear() {
      super.clear();
      this.uuid_ = ByteString.EMPTY;
      this.bitField0_ &= -2;
      return this;
   }

   public Structures$PbBleUuid$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbBleUuid$Builder)super.clearField(var1);
   }

   public Structures$PbBleUuid$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbBleUuid$Builder)super.clearOneof(var1);
   }

   public Structures$PbBleUuid$Builder clearUuid() {
      this.bitField0_ &= -2;
      this.uuid_ = Structures$PbBleUuid.getDefaultInstance().getUuid();
      this.onChanged();
      return this;
   }

   public Structures$PbBleUuid$Builder clone() {
      return (Structures$PbBleUuid$Builder)super.clone();
   }

   public Structures$PbBleUuid getDefaultInstanceForType() {
      return Structures$PbBleUuid.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.aa();
   }

   public ByteString getUuid() {
      return this.uuid_;
   }

   public boolean hasUuid() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.ab().ensureFieldAccessorsInitialized(Structures$PbBleUuid.class, Structures$PbBleUuid$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasUuid()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public Structures$PbBleUuid$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbBleUuid var13;
      label96: {
         InvalidProtocolBufferException var12;
         Structures$PbBleUuid var14;
         try {
            var13 = (Structures$PbBleUuid)Structures$PbBleUuid.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (Structures$PbBleUuid)var10.getUnfinishedMessage();
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

   public Structures$PbBleUuid$Builder mergeFrom(Message var1) {
      Structures$PbBleUuid$Builder var2;
      if (var1 instanceof Structures$PbBleUuid) {
         var2 = this.mergeFrom((Structures$PbBleUuid)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbBleUuid$Builder mergeFrom(Structures$PbBleUuid var1) {
      if (var1 != Structures$PbBleUuid.getDefaultInstance()) {
         if (var1.hasUuid()) {
            this.setUuid(var1.getUuid());
         }

         this.mergeUnknownFields(Structures$PbBleUuid.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Structures$PbBleUuid$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbBleUuid$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbBleUuid$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbBleUuid$Builder)super.setField(var1, var2);
   }

   public Structures$PbBleUuid$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbBleUuid$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final Structures$PbBleUuid$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbBleUuid$Builder)super.setUnknownFields(var1);
   }

   public Structures$PbBleUuid$Builder setUuid(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.uuid_ = var1;
         this.onChanged();
         return this;
      }
   }
}
