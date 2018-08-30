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

public final class PftpNotification$PbPFtpTouchPosition$Builder extends Builder implements PftpNotification$PbPFtpTouchPositionOrBuilder {
   private int bitField0_;
   private int maxPos_;
   private int pos_;

   private PftpNotification$PbPFtpTouchPosition$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private PftpNotification$PbPFtpTouchPosition$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpTouchPosition$Builder(BuilderParent var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpNotification$PbPFtpTouchPosition$Builder(PftpNotification$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.s();
   }

   private void maybeForceBuilderInitialization() {
      if (PftpNotification$PbPFtpTouchPosition.b()) {
      }

   }

   public PftpNotification$PbPFtpTouchPosition$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPFtpTouchPosition$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpNotification$PbPFtpTouchPosition build() {
      PftpNotification$PbPFtpTouchPosition var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpNotification$PbPFtpTouchPosition buildPartial() {
      byte var1 = 1;
      PftpNotification$PbPFtpTouchPosition var2 = new PftpNotification$PbPFtpTouchPosition(this, (PftpNotification$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      PftpNotification$PbPFtpTouchPosition.a(var2, this.pos_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      PftpNotification$PbPFtpTouchPosition.b(var2, this.maxPos_);
      PftpNotification$PbPFtpTouchPosition.c(var2, var4);
      this.onBuilt();
      return var2;
   }

   public PftpNotification$PbPFtpTouchPosition$Builder clear() {
      super.clear();
      this.pos_ = 0;
      this.bitField0_ &= -2;
      this.maxPos_ = 0;
      this.bitField0_ &= -3;
      return this;
   }

   public PftpNotification$PbPFtpTouchPosition$Builder clearField(FieldDescriptor var1) {
      return (PftpNotification$PbPFtpTouchPosition$Builder)super.clearField(var1);
   }

   public PftpNotification$PbPFtpTouchPosition$Builder clearMaxPos() {
      this.bitField0_ &= -3;
      this.maxPos_ = 0;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPFtpTouchPosition$Builder clearOneof(OneofDescriptor var1) {
      return (PftpNotification$PbPFtpTouchPosition$Builder)super.clearOneof(var1);
   }

   public PftpNotification$PbPFtpTouchPosition$Builder clearPos() {
      this.bitField0_ &= -2;
      this.pos_ = 0;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPFtpTouchPosition$Builder clone() {
      return (PftpNotification$PbPFtpTouchPosition$Builder)super.clone();
   }

   public PftpNotification$PbPFtpTouchPosition getDefaultInstanceForType() {
      return PftpNotification$PbPFtpTouchPosition.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PftpNotification.s();
   }

   public int getMaxPos() {
      return this.maxPos_;
   }

   public int getPos() {
      return this.pos_;
   }

   public boolean hasMaxPos() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPos() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.t().ensureFieldAccessorsInitialized(PftpNotification$PbPFtpTouchPosition.class, PftpNotification$PbPFtpTouchPosition$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasPos()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public PftpNotification$PbPFtpTouchPosition$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpNotification$PbPFtpTouchPosition var13;
      label96: {
         InvalidProtocolBufferException var12;
         PftpNotification$PbPFtpTouchPosition var14;
         try {
            var13 = (PftpNotification$PbPFtpTouchPosition)PftpNotification$PbPFtpTouchPosition.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (PftpNotification$PbPFtpTouchPosition)var10.getUnfinishedMessage();
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

   public PftpNotification$PbPFtpTouchPosition$Builder mergeFrom(Message var1) {
      PftpNotification$PbPFtpTouchPosition$Builder var2;
      if (var1 instanceof PftpNotification$PbPFtpTouchPosition) {
         var2 = this.mergeFrom((PftpNotification$PbPFtpTouchPosition)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpNotification$PbPFtpTouchPosition$Builder mergeFrom(PftpNotification$PbPFtpTouchPosition var1) {
      if (var1 != PftpNotification$PbPFtpTouchPosition.getDefaultInstance()) {
         if (var1.hasPos()) {
            this.setPos(var1.getPos());
         }

         if (var1.hasMaxPos()) {
            this.setMaxPos(var1.getMaxPos());
         }

         this.mergeUnknownFields(PftpNotification$PbPFtpTouchPosition.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final PftpNotification$PbPFtpTouchPosition$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPFtpTouchPosition$Builder)super.mergeUnknownFields(var1);
   }

   public PftpNotification$PbPFtpTouchPosition$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPFtpTouchPosition$Builder)super.setField(var1, var2);
   }

   public PftpNotification$PbPFtpTouchPosition$Builder setMaxPos(int var1) {
      this.bitField0_ |= 2;
      this.maxPos_ = var1;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPFtpTouchPosition$Builder setPos(int var1) {
      this.bitField0_ |= 1;
      this.pos_ = var1;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPFtpTouchPosition$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpNotification$PbPFtpTouchPosition$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final PftpNotification$PbPFtpTouchPosition$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPFtpTouchPosition$Builder)super.setUnknownFields(var1);
   }
}
