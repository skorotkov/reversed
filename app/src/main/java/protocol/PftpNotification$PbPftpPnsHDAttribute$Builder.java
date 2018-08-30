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

public final class PftpNotification$PbPftpPnsHDAttribute$Builder extends Builder implements PftpNotification$PbPftpPnsHDAttributeOrBuilder {
   private int attributeFullSize_;
   private int bitField0_;
   private Object data_;
   private int type_;

   private PftpNotification$PbPftpPnsHDAttribute$Builder() {
      this.type_ = 0;
      this.data_ = "";
      this.maybeForceBuilderInitialization();
   }

   private PftpNotification$PbPftpPnsHDAttribute$Builder(BuilderParent var1) {
      super(var1);
      this.type_ = 0;
      this.data_ = "";
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpNotification$PbPftpPnsHDAttribute$Builder(BuilderParent var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpNotification$PbPftpPnsHDAttribute$Builder(PftpNotification$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.C();
   }

   private void maybeForceBuilderInitialization() {
      if (PftpNotification$PbPftpPnsHDAttribute.b()) {
      }

   }

   public PftpNotification$PbPftpPnsHDAttribute$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPftpPnsHDAttribute$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpNotification$PbPftpPnsHDAttribute build() {
      PftpNotification$PbPftpPnsHDAttribute var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpNotification$PbPftpPnsHDAttribute buildPartial() {
      byte var1 = 1;
      PftpNotification$PbPftpPnsHDAttribute var2 = new PftpNotification$PbPftpPnsHDAttribute(this, (PftpNotification$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      PftpNotification$PbPftpPnsHDAttribute.a(var2, this.type_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      PftpNotification$PbPftpPnsHDAttribute.a(var2, this.data_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      PftpNotification$PbPftpPnsHDAttribute.b(var2, this.attributeFullSize_);
      PftpNotification$PbPftpPnsHDAttribute.c(var2, var5);
      this.onBuilt();
      return var2;
   }

   public PftpNotification$PbPftpPnsHDAttribute$Builder clear() {
      super.clear();
      this.type_ = 0;
      this.bitField0_ &= -2;
      this.data_ = "";
      this.bitField0_ &= -3;
      this.attributeFullSize_ = 0;
      this.bitField0_ &= -5;
      return this;
   }

   public PftpNotification$PbPftpPnsHDAttribute$Builder clearAttributeFullSize() {
      this.bitField0_ &= -5;
      this.attributeFullSize_ = 0;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPftpPnsHDAttribute$Builder clearData() {
      this.bitField0_ &= -3;
      this.data_ = PftpNotification$PbPftpPnsHDAttribute.getDefaultInstance().getData();
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPftpPnsHDAttribute$Builder clearField(FieldDescriptor var1) {
      return (PftpNotification$PbPftpPnsHDAttribute$Builder)super.clearField(var1);
   }

   public PftpNotification$PbPftpPnsHDAttribute$Builder clearOneof(OneofDescriptor var1) {
      return (PftpNotification$PbPftpPnsHDAttribute$Builder)super.clearOneof(var1);
   }

   public PftpNotification$PbPftpPnsHDAttribute$Builder clearType() {
      this.bitField0_ &= -2;
      this.type_ = 0;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPftpPnsHDAttribute$Builder clone() {
      return (PftpNotification$PbPftpPnsHDAttribute$Builder)super.clone();
   }

   public int getAttributeFullSize() {
      return this.attributeFullSize_;
   }

   public String getData() {
      Object var1 = this.data_;
      String var3;
      if (!(var1 instanceof String)) {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.data_ = var3;
         }
      } else {
         var3 = (String)var1;
      }

      return var3;
   }

   public ByteString getDataBytes() {
      Object var1 = this.data_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.data_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public PftpNotification$PbPftpPnsHDAttribute getDefaultInstanceForType() {
      return PftpNotification$PbPftpPnsHDAttribute.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PftpNotification.C();
   }

   public PftpNotification$PbPftpPnsHDAttributeType getType() {
      PftpNotification$PbPftpPnsHDAttributeType var1 = PftpNotification$PbPftpPnsHDAttributeType.valueOf(this.type_);
      PftpNotification$PbPftpPnsHDAttributeType var2 = var1;
      if (var1 == null) {
         var2 = PftpNotification$PbPftpPnsHDAttributeType.TITLE;
      }

      return var2;
   }

   public boolean hasAttributeFullSize() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasData() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasType() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.D().ensureFieldAccessorsInitialized(PftpNotification$PbPftpPnsHDAttribute.class, PftpNotification$PbPftpPnsHDAttribute$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasType()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public PftpNotification$PbPftpPnsHDAttribute$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpNotification$PbPftpPnsHDAttribute var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (PftpNotification$PbPftpPnsHDAttribute)PftpNotification$PbPftpPnsHDAttribute.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (PftpNotification$PbPftpPnsHDAttribute)var10.getUnfinishedMessage();
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

   public PftpNotification$PbPftpPnsHDAttribute$Builder mergeFrom(Message var1) {
      PftpNotification$PbPftpPnsHDAttribute$Builder var2;
      if (var1 instanceof PftpNotification$PbPftpPnsHDAttribute) {
         var2 = this.mergeFrom((PftpNotification$PbPftpPnsHDAttribute)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpNotification$PbPftpPnsHDAttribute$Builder mergeFrom(PftpNotification$PbPftpPnsHDAttribute var1) {
      if (var1 != PftpNotification$PbPftpPnsHDAttribute.getDefaultInstance()) {
         if (var1.hasType()) {
            this.setType(var1.getType());
         }

         if (var1.hasData()) {
            this.bitField0_ |= 2;
            this.data_ = PftpNotification$PbPftpPnsHDAttribute.a(var1);
            this.onChanged();
         }

         if (var1.hasAttributeFullSize()) {
            this.setAttributeFullSize(var1.getAttributeFullSize());
         }

         this.mergeUnknownFields(PftpNotification$PbPftpPnsHDAttribute.b(var1));
         this.onChanged();
      }

      return this;
   }

   public final PftpNotification$PbPftpPnsHDAttribute$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPftpPnsHDAttribute$Builder)super.mergeUnknownFields(var1);
   }

   public PftpNotification$PbPftpPnsHDAttribute$Builder setAttributeFullSize(int var1) {
      this.bitField0_ |= 4;
      this.attributeFullSize_ = var1;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPftpPnsHDAttribute$Builder setData(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.data_ = var1;
         this.onChanged();
         return this;
      }
   }

   public PftpNotification$PbPftpPnsHDAttribute$Builder setDataBytes(ByteString var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.data_ = var1;
         this.onChanged();
         return this;
      }
   }

   public PftpNotification$PbPftpPnsHDAttribute$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPftpPnsHDAttribute$Builder)super.setField(var1, var2);
   }

   public PftpNotification$PbPftpPnsHDAttribute$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpNotification$PbPftpPnsHDAttribute$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public PftpNotification$PbPftpPnsHDAttribute$Builder setType(PftpNotification$PbPftpPnsHDAttributeType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.type_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public final PftpNotification$PbPftpPnsHDAttribute$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPftpPnsHDAttribute$Builder)super.setUnknownFields(var1);
   }
}
