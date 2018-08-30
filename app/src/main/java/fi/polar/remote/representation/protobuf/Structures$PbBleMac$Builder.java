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

public final class Structures$PbBleMac$Builder extends Builder implements Structures$PbBleMacOrBuilder {
   private int bitField0_;
   private ByteString mac_;
   private int type_;

   private Structures$PbBleMac$Builder() {
      this.mac_ = ByteString.EMPTY;
      this.type_ = 0;
      this.maybeForceBuilderInitialization();
   }

   private Structures$PbBleMac$Builder(BuilderParent var1) {
      super(var1);
      this.mac_ = ByteString.EMPTY;
      this.type_ = 0;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   Structures$PbBleMac$Builder(BuilderParent var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   Structures$PbBleMac$Builder(Structures$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return Structures.q();
   }

   private void maybeForceBuilderInitialization() {
      if (Structures$PbBleMac.b()) {
      }

   }

   public Structures$PbBleMac$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (Structures$PbBleMac$Builder)super.addRepeatedField(var1, var2);
   }

   public Structures$PbBleMac build() {
      Structures$PbBleMac var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public Structures$PbBleMac buildPartial() {
      byte var1 = 1;
      Structures$PbBleMac var2 = new Structures$PbBleMac(this, (Structures$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      Structures$PbBleMac.a(var2, this.mac_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      Structures$PbBleMac.a(var2, this.type_);
      Structures$PbBleMac.b(var2, var4);
      this.onBuilt();
      return var2;
   }

   public Structures$PbBleMac$Builder clear() {
      super.clear();
      this.mac_ = ByteString.EMPTY;
      this.bitField0_ &= -2;
      this.type_ = 0;
      this.bitField0_ &= -3;
      return this;
   }

   public Structures$PbBleMac$Builder clearField(FieldDescriptor var1) {
      return (Structures$PbBleMac$Builder)super.clearField(var1);
   }

   public Structures$PbBleMac$Builder clearMac() {
      this.bitField0_ &= -2;
      this.mac_ = Structures$PbBleMac.getDefaultInstance().getMac();
      this.onChanged();
      return this;
   }

   public Structures$PbBleMac$Builder clearOneof(OneofDescriptor var1) {
      return (Structures$PbBleMac$Builder)super.clearOneof(var1);
   }

   public Structures$PbBleMac$Builder clearType() {
      this.bitField0_ &= -3;
      this.type_ = 0;
      this.onChanged();
      return this;
   }

   public Structures$PbBleMac$Builder clone() {
      return (Structures$PbBleMac$Builder)super.clone();
   }

   public Structures$PbBleMac getDefaultInstanceForType() {
      return Structures$PbBleMac.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return Structures.q();
   }

   public ByteString getMac() {
      return this.mac_;
   }

   public Types$PbMacType getType() {
      Types$PbMacType var1 = Types$PbMacType.valueOf(this.type_);
      Types$PbMacType var2 = var1;
      if (var1 == null) {
         var2 = Types$PbMacType.MAC_TYPE_PUBLIC;
      }

      return var2;
   }

   public boolean hasMac() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasType() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.r().ensureFieldAccessorsInitialized(Structures$PbBleMac.class, Structures$PbBleMac$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      if (this.hasMac() && this.hasType()) {
         var1 = true;
      }

      return var1;
   }

   public Structures$PbBleMac$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      Structures$PbBleMac var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (Structures$PbBleMac)Structures$PbBleMac.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (Structures$PbBleMac)var10.getUnfinishedMessage();
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

   public Structures$PbBleMac$Builder mergeFrom(Message var1) {
      Structures$PbBleMac$Builder var2;
      if (var1 instanceof Structures$PbBleMac) {
         var2 = this.mergeFrom((Structures$PbBleMac)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public Structures$PbBleMac$Builder mergeFrom(Structures$PbBleMac var1) {
      if (var1 != Structures$PbBleMac.getDefaultInstance()) {
         if (var1.hasMac()) {
            this.setMac(var1.getMac());
         }

         if (var1.hasType()) {
            this.setType(var1.getType());
         }

         this.mergeUnknownFields(Structures$PbBleMac.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final Structures$PbBleMac$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbBleMac$Builder)super.mergeUnknownFields(var1);
   }

   public Structures$PbBleMac$Builder setField(FieldDescriptor var1, Object var2) {
      return (Structures$PbBleMac$Builder)super.setField(var1, var2);
   }

   public Structures$PbBleMac$Builder setMac(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.mac_ = var1;
         this.onChanged();
         return this;
      }
   }

   public Structures$PbBleMac$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (Structures$PbBleMac$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public Structures$PbBleMac$Builder setType(Types$PbMacType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.type_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public final Structures$PbBleMac$Builder setUnknownFields(UnknownFieldSet var1) {
      return (Structures$PbBleMac$Builder)super.setUnknownFields(var1);
   }
}
