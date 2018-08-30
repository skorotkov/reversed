package protocol;

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

public final class PftpNotification$PbPftpPnsDHAttribute$Builder extends Builder implements PftpNotification$PbPftpPnsDHAttributeOrBuilder {
   private int bitField0_;
   private int type_;

   private PftpNotification$PbPftpPnsDHAttribute$Builder() {
      this.type_ = 1;
      this.maybeForceBuilderInitialization();
   }

   private PftpNotification$PbPftpPnsDHAttribute$Builder(BuilderParent var1) {
      super(var1);
      this.type_ = 1;
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpNotification$PbPftpPnsDHAttribute$Builder(BuilderParent var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpNotification$PbPftpPnsDHAttribute$Builder(PftpNotification$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.i();
   }

   private void maybeForceBuilderInitialization() {
      if (PftpNotification$PbPftpPnsDHAttribute.b()) {
      }

   }

   public PftpNotification$PbPftpPnsDHAttribute$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPftpPnsDHAttribute$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpNotification$PbPftpPnsDHAttribute build() {
      PftpNotification$PbPftpPnsDHAttribute var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpNotification$PbPftpPnsDHAttribute buildPartial() {
      byte var1 = 1;
      PftpNotification$PbPftpPnsDHAttribute var2 = new PftpNotification$PbPftpPnsDHAttribute(this, (PftpNotification$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      PftpNotification$PbPftpPnsDHAttribute.a(var2, this.type_);
      PftpNotification$PbPftpPnsDHAttribute.b(var2, var1);
      this.onBuilt();
      return var2;
   }

   public PftpNotification$PbPftpPnsDHAttribute$Builder clear() {
      super.clear();
      this.type_ = 1;
      this.bitField0_ &= -2;
      return this;
   }

   public PftpNotification$PbPftpPnsDHAttribute$Builder clearField(FieldDescriptor var1) {
      return (PftpNotification$PbPftpPnsDHAttribute$Builder)super.clearField(var1);
   }

   public PftpNotification$PbPftpPnsDHAttribute$Builder clearOneof(OneofDescriptor var1) {
      return (PftpNotification$PbPftpPnsDHAttribute$Builder)super.clearOneof(var1);
   }

   public PftpNotification$PbPftpPnsDHAttribute$Builder clearType() {
      this.bitField0_ &= -2;
      this.type_ = 1;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPftpPnsDHAttribute$Builder clone() {
      return (PftpNotification$PbPftpPnsDHAttribute$Builder)super.clone();
   }

   public PftpNotification$PbPftpPnsDHAttribute getDefaultInstanceForType() {
      return PftpNotification$PbPftpPnsDHAttribute.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PftpNotification.i();
   }

   public PftpNotification$PbPftpPnsDHAttributeType getType() {
      PftpNotification$PbPftpPnsDHAttributeType var1 = PftpNotification$PbPftpPnsDHAttributeType.valueOf(this.type_);
      PftpNotification$PbPftpPnsDHAttributeType var2 = var1;
      if (var1 == null) {
         var2 = PftpNotification$PbPftpPnsDHAttributeType.UNKNOWN_ACTION;
      }

      return var2;
   }

   public boolean hasType() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.j().ensureFieldAccessorsInitialized(PftpNotification$PbPftpPnsDHAttribute.class, PftpNotification$PbPftpPnsDHAttribute$Builder.class);
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

   public PftpNotification$PbPftpPnsDHAttribute$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpNotification$PbPftpPnsDHAttribute var13;
      label96: {
         InvalidProtocolBufferException var14;
         try {
            var13 = (PftpNotification$PbPftpPnsDHAttribute)PftpNotification$PbPftpPnsDHAttribute.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var11) {
            var14 = var11;
            var13 = (PftpNotification$PbPftpPnsDHAttribute)var11.getUnfinishedMessage();
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

   public PftpNotification$PbPftpPnsDHAttribute$Builder mergeFrom(Message var1) {
      PftpNotification$PbPftpPnsDHAttribute$Builder var2;
      if (var1 instanceof PftpNotification$PbPftpPnsDHAttribute) {
         var2 = this.mergeFrom((PftpNotification$PbPftpPnsDHAttribute)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpNotification$PbPftpPnsDHAttribute$Builder mergeFrom(PftpNotification$PbPftpPnsDHAttribute var1) {
      if (var1 != PftpNotification$PbPftpPnsDHAttribute.getDefaultInstance()) {
         if (var1.hasType()) {
            this.setType(var1.getType());
         }

         this.mergeUnknownFields(PftpNotification$PbPftpPnsDHAttribute.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final PftpNotification$PbPftpPnsDHAttribute$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPftpPnsDHAttribute$Builder)super.mergeUnknownFields(var1);
   }

   public PftpNotification$PbPftpPnsDHAttribute$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPftpPnsDHAttribute$Builder)super.setField(var1, var2);
   }

   public PftpNotification$PbPftpPnsDHAttribute$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpNotification$PbPftpPnsDHAttribute$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public PftpNotification$PbPftpPnsDHAttribute$Builder setType(PftpNotification$PbPftpPnsDHAttributeType var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 1;
         this.type_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public final PftpNotification$PbPftpPnsDHAttribute$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPftpPnsDHAttribute$Builder)super.setUnknownFields(var1);
   }
}
