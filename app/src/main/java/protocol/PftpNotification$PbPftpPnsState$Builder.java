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

public final class PftpNotification$PbPftpPnsState$Builder extends Builder implements PftpNotification$PbPftpPnsStateOrBuilder {
   private int bitField0_;
   private boolean notificationsEnabled_;
   private boolean previewEnabled_;

   private PftpNotification$PbPftpPnsState$Builder() {
      this.maybeForceBuilderInitialization();
   }

   private PftpNotification$PbPftpPnsState$Builder(BuilderParent var1) {
      super(var1);
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpNotification$PbPftpPnsState$Builder(BuilderParent var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpNotification$PbPftpPnsState$Builder(PftpNotification$1 var1) {
      this();
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.m();
   }

   private void maybeForceBuilderInitialization() {
      if (PftpNotification$PbPftpPnsState.b()) {
      }

   }

   public PftpNotification$PbPftpPnsState$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPftpPnsState$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpNotification$PbPftpPnsState build() {
      PftpNotification$PbPftpPnsState var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpNotification$PbPftpPnsState buildPartial() {
      byte var1 = 1;
      PftpNotification$PbPftpPnsState var2 = new PftpNotification$PbPftpPnsState(this, (PftpNotification$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      PftpNotification$PbPftpPnsState.a(var2, this.notificationsEnabled_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      PftpNotification$PbPftpPnsState.b(var2, this.previewEnabled_);
      PftpNotification$PbPftpPnsState.a(var2, var4);
      this.onBuilt();
      return var2;
   }

   public PftpNotification$PbPftpPnsState$Builder clear() {
      super.clear();
      this.notificationsEnabled_ = false;
      this.bitField0_ &= -2;
      this.previewEnabled_ = false;
      this.bitField0_ &= -3;
      return this;
   }

   public PftpNotification$PbPftpPnsState$Builder clearField(FieldDescriptor var1) {
      return (PftpNotification$PbPftpPnsState$Builder)super.clearField(var1);
   }

   public PftpNotification$PbPftpPnsState$Builder clearNotificationsEnabled() {
      this.bitField0_ &= -2;
      this.notificationsEnabled_ = false;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPftpPnsState$Builder clearOneof(OneofDescriptor var1) {
      return (PftpNotification$PbPftpPnsState$Builder)super.clearOneof(var1);
   }

   public PftpNotification$PbPftpPnsState$Builder clearPreviewEnabled() {
      this.bitField0_ &= -3;
      this.previewEnabled_ = false;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPftpPnsState$Builder clone() {
      return (PftpNotification$PbPftpPnsState$Builder)super.clone();
   }

   public PftpNotification$PbPftpPnsState getDefaultInstanceForType() {
      return PftpNotification$PbPftpPnsState.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PftpNotification.m();
   }

   public boolean getNotificationsEnabled() {
      return this.notificationsEnabled_;
   }

   public boolean getPreviewEnabled() {
      return this.previewEnabled_;
   }

   public boolean hasNotificationsEnabled() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPreviewEnabled() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.n().ensureFieldAccessorsInitialized(PftpNotification$PbPftpPnsState.class, PftpNotification$PbPftpPnsState$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1;
      if (!this.hasNotificationsEnabled()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public PftpNotification$PbPftpPnsState$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpNotification$PbPftpPnsState var12;
      label96: {
         InvalidProtocolBufferException var13;
         try {
            var12 = (PftpNotification$PbPftpPnsState)PftpNotification$PbPftpPnsState.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var13 = var10;
            var12 = (PftpNotification$PbPftpPnsState)var10.getUnfinishedMessage();
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

   public PftpNotification$PbPftpPnsState$Builder mergeFrom(Message var1) {
      PftpNotification$PbPftpPnsState$Builder var2;
      if (var1 instanceof PftpNotification$PbPftpPnsState) {
         var2 = this.mergeFrom((PftpNotification$PbPftpPnsState)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpNotification$PbPftpPnsState$Builder mergeFrom(PftpNotification$PbPftpPnsState var1) {
      if (var1 != PftpNotification$PbPftpPnsState.getDefaultInstance()) {
         if (var1.hasNotificationsEnabled()) {
            this.setNotificationsEnabled(var1.getNotificationsEnabled());
         }

         if (var1.hasPreviewEnabled()) {
            this.setPreviewEnabled(var1.getPreviewEnabled());
         }

         this.mergeUnknownFields(PftpNotification$PbPftpPnsState.a(var1));
         this.onChanged();
      }

      return this;
   }

   public final PftpNotification$PbPftpPnsState$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPftpPnsState$Builder)super.mergeUnknownFields(var1);
   }

   public PftpNotification$PbPftpPnsState$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPftpPnsState$Builder)super.setField(var1, var2);
   }

   public PftpNotification$PbPftpPnsState$Builder setNotificationsEnabled(boolean var1) {
      this.bitField0_ |= 1;
      this.notificationsEnabled_ = var1;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPftpPnsState$Builder setPreviewEnabled(boolean var1) {
      this.bitField0_ |= 2;
      this.previewEnabled_ = var1;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPftpPnsState$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpNotification$PbPftpPnsState$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final PftpNotification$PbPftpPnsState$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPftpPnsState$Builder)super.setUnknownFields(var1);
   }
}
