package protocol;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PftpNotification$PbPftpPnsDHNotificationResponse$Builder extends Builder implements PftpNotification$PbPftpPnsDHNotificationResponseOrBuilder {
   private RepeatedFieldBuilderV3 attributesBuilder_;
   private List attributes_;
   private int bitField0_;
   private int notificationId_;

   private PftpNotification$PbPftpPnsDHNotificationResponse$Builder() {
      this.attributes_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   private PftpNotification$PbPftpPnsDHNotificationResponse$Builder(BuilderParent var1) {
      super(var1);
      this.attributes_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpNotification$PbPftpPnsDHNotificationResponse$Builder(BuilderParent var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpNotification$PbPftpPnsDHNotificationResponse$Builder(PftpNotification$1 var1) {
      this();
   }

   private void ensureAttributesIsMutable() {
      if ((this.bitField0_ & 2) != 2) {
         this.attributes_ = new ArrayList(this.attributes_);
         this.bitField0_ |= 2;
      }

   }

   private RepeatedFieldBuilderV3 getAttributesFieldBuilder() {
      if (this.attributesBuilder_ == null) {
         List var1 = this.attributes_;
         boolean var2;
         if ((this.bitField0_ & 2) == 2) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.attributesBuilder_ = new RepeatedFieldBuilderV3(var1, var2, this.getParentForChildren(), this.isClean());
         this.attributes_ = null;
      }

      return this.attributesBuilder_;
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.k();
   }

   private void maybeForceBuilderInitialization() {
      if (PftpNotification$PbPftpPnsDHNotificationResponse.b()) {
         this.getAttributesFieldBuilder();
      }

   }

   public PftpNotification$PbPftpPnsDHNotificationResponse$Builder addAllAttributes(Iterable var1) {
      if (this.attributesBuilder_ == null) {
         this.ensureAttributesIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.attributes_);
         this.onChanged();
      } else {
         this.attributesBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public PftpNotification$PbPftpPnsDHNotificationResponse$Builder addAttributes(int var1, PftpNotification$PbPftpPnsDHAttribute$Builder var2) {
      if (this.attributesBuilder_ == null) {
         this.ensureAttributesIsMutable();
         this.attributes_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.attributesBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public PftpNotification$PbPftpPnsDHNotificationResponse$Builder addAttributes(int var1, PftpNotification$PbPftpPnsDHAttribute var2) {
      if (this.attributesBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureAttributesIsMutable();
         this.attributes_.add(var1, var2);
         this.onChanged();
      } else {
         this.attributesBuilder_.addMessage(var1, var2);
      }

      return this;
   }

   public PftpNotification$PbPftpPnsDHNotificationResponse$Builder addAttributes(PftpNotification$PbPftpPnsDHAttribute$Builder var1) {
      if (this.attributesBuilder_ == null) {
         this.ensureAttributesIsMutable();
         this.attributes_.add(var1.build());
         this.onChanged();
      } else {
         this.attributesBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public PftpNotification$PbPftpPnsDHNotificationResponse$Builder addAttributes(PftpNotification$PbPftpPnsDHAttribute var1) {
      if (this.attributesBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureAttributesIsMutable();
         this.attributes_.add(var1);
         this.onChanged();
      } else {
         this.attributesBuilder_.addMessage(var1);
      }

      return this;
   }

   public PftpNotification$PbPftpPnsDHAttribute$Builder addAttributesBuilder() {
      return (PftpNotification$PbPftpPnsDHAttribute$Builder)this.getAttributesFieldBuilder().addBuilder(PftpNotification$PbPftpPnsDHAttribute.getDefaultInstance());
   }

   public PftpNotification$PbPftpPnsDHAttribute$Builder addAttributesBuilder(int var1) {
      return (PftpNotification$PbPftpPnsDHAttribute$Builder)this.getAttributesFieldBuilder().addBuilder(var1, PftpNotification$PbPftpPnsDHAttribute.getDefaultInstance());
   }

   public PftpNotification$PbPftpPnsDHNotificationResponse$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPftpPnsDHNotificationResponse$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpNotification$PbPftpPnsDHNotificationResponse build() {
      PftpNotification$PbPftpPnsDHNotificationResponse var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpNotification$PbPftpPnsDHNotificationResponse buildPartial() {
      byte var1 = 1;
      PftpNotification$PbPftpPnsDHNotificationResponse var2 = new PftpNotification$PbPftpPnsDHNotificationResponse(this, (PftpNotification$1)null);
      if ((this.bitField0_ & 1) != 1) {
         var1 = 0;
      }

      PftpNotification$PbPftpPnsDHNotificationResponse.a(var2, this.notificationId_);
      if (this.attributesBuilder_ == null) {
         if ((this.bitField0_ & 2) == 2) {
            this.attributes_ = Collections.unmodifiableList(this.attributes_);
            this.bitField0_ &= -3;
         }

         PftpNotification$PbPftpPnsDHNotificationResponse.a(var2, this.attributes_);
      } else {
         PftpNotification$PbPftpPnsDHNotificationResponse.a(var2, this.attributesBuilder_.build());
      }

      PftpNotification$PbPftpPnsDHNotificationResponse.b(var2, var1);
      this.onBuilt();
      return var2;
   }

   public PftpNotification$PbPftpPnsDHNotificationResponse$Builder clear() {
      super.clear();
      this.notificationId_ = 0;
      this.bitField0_ &= -2;
      if (this.attributesBuilder_ == null) {
         this.attributes_ = Collections.emptyList();
         this.bitField0_ &= -3;
      } else {
         this.attributesBuilder_.clear();
      }

      return this;
   }

   public PftpNotification$PbPftpPnsDHNotificationResponse$Builder clearAttributes() {
      if (this.attributesBuilder_ == null) {
         this.attributes_ = Collections.emptyList();
         this.bitField0_ &= -3;
         this.onChanged();
      } else {
         this.attributesBuilder_.clear();
      }

      return this;
   }

   public PftpNotification$PbPftpPnsDHNotificationResponse$Builder clearField(FieldDescriptor var1) {
      return (PftpNotification$PbPftpPnsDHNotificationResponse$Builder)super.clearField(var1);
   }

   public PftpNotification$PbPftpPnsDHNotificationResponse$Builder clearNotificationId() {
      this.bitField0_ &= -2;
      this.notificationId_ = 0;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPftpPnsDHNotificationResponse$Builder clearOneof(OneofDescriptor var1) {
      return (PftpNotification$PbPftpPnsDHNotificationResponse$Builder)super.clearOneof(var1);
   }

   public PftpNotification$PbPftpPnsDHNotificationResponse$Builder clone() {
      return (PftpNotification$PbPftpPnsDHNotificationResponse$Builder)super.clone();
   }

   public PftpNotification$PbPftpPnsDHAttribute getAttributes(int var1) {
      PftpNotification$PbPftpPnsDHAttribute var2;
      if (this.attributesBuilder_ == null) {
         var2 = (PftpNotification$PbPftpPnsDHAttribute)this.attributes_.get(var1);
      } else {
         var2 = (PftpNotification$PbPftpPnsDHAttribute)this.attributesBuilder_.getMessage(var1);
      }

      return var2;
   }

   public PftpNotification$PbPftpPnsDHAttribute$Builder getAttributesBuilder(int var1) {
      return (PftpNotification$PbPftpPnsDHAttribute$Builder)this.getAttributesFieldBuilder().getBuilder(var1);
   }

   public List getAttributesBuilderList() {
      return this.getAttributesFieldBuilder().getBuilderList();
   }

   public int getAttributesCount() {
      int var1;
      if (this.attributesBuilder_ == null) {
         var1 = this.attributes_.size();
      } else {
         var1 = this.attributesBuilder_.getCount();
      }

      return var1;
   }

   public List getAttributesList() {
      List var1;
      if (this.attributesBuilder_ == null) {
         var1 = Collections.unmodifiableList(this.attributes_);
      } else {
         var1 = this.attributesBuilder_.getMessageList();
      }

      return var1;
   }

   public PftpNotification$PbPftpPnsDHAttributeOrBuilder getAttributesOrBuilder(int var1) {
      PftpNotification$PbPftpPnsDHAttributeOrBuilder var2;
      if (this.attributesBuilder_ == null) {
         var2 = (PftpNotification$PbPftpPnsDHAttributeOrBuilder)this.attributes_.get(var1);
      } else {
         var2 = (PftpNotification$PbPftpPnsDHAttributeOrBuilder)this.attributesBuilder_.getMessageOrBuilder(var1);
      }

      return var2;
   }

   public List getAttributesOrBuilderList() {
      List var1;
      if (this.attributesBuilder_ != null) {
         var1 = this.attributesBuilder_.getMessageOrBuilderList();
      } else {
         var1 = Collections.unmodifiableList(this.attributes_);
      }

      return var1;
   }

   public PftpNotification$PbPftpPnsDHNotificationResponse getDefaultInstanceForType() {
      return PftpNotification$PbPftpPnsDHNotificationResponse.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PftpNotification.k();
   }

   public int getNotificationId() {
      return this.notificationId_;
   }

   public boolean hasNotificationId() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.l().ensureFieldAccessorsInitialized(PftpNotification$PbPftpPnsDHNotificationResponse.class, PftpNotification$PbPftpPnsDHNotificationResponse$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasNotificationId()) {
         var2 = var1;
      } else {
         int var3 = 0;

         while(true) {
            if (var3 >= this.getAttributesCount()) {
               var2 = true;
               break;
            }

            var2 = var1;
            if (!this.getAttributes(var3).isInitialized()) {
               break;
            }

            ++var3;
         }
      }

      return var2;
   }

   public PftpNotification$PbPftpPnsDHNotificationResponse$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpNotification$PbPftpPnsDHNotificationResponse var13;
      label96: {
         InvalidProtocolBufferException var12;
         PftpNotification$PbPftpPnsDHNotificationResponse var14;
         try {
            var13 = (PftpNotification$PbPftpPnsDHNotificationResponse)PftpNotification$PbPftpPnsDHNotificationResponse.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (PftpNotification$PbPftpPnsDHNotificationResponse)var10.getUnfinishedMessage();
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

   public PftpNotification$PbPftpPnsDHNotificationResponse$Builder mergeFrom(Message var1) {
      PftpNotification$PbPftpPnsDHNotificationResponse$Builder var2;
      if (var1 instanceof PftpNotification$PbPftpPnsDHNotificationResponse) {
         var2 = this.mergeFrom((PftpNotification$PbPftpPnsDHNotificationResponse)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpNotification$PbPftpPnsDHNotificationResponse$Builder mergeFrom(PftpNotification$PbPftpPnsDHNotificationResponse var1) {
      RepeatedFieldBuilderV3 var2 = null;
      if (var1 != PftpNotification$PbPftpPnsDHNotificationResponse.getDefaultInstance()) {
         if (var1.hasNotificationId()) {
            this.setNotificationId(var1.getNotificationId());
         }

         if (this.attributesBuilder_ == null) {
            if (!PftpNotification$PbPftpPnsDHNotificationResponse.a(var1).isEmpty()) {
               if (this.attributes_.isEmpty()) {
                  this.attributes_ = PftpNotification$PbPftpPnsDHNotificationResponse.a(var1);
                  this.bitField0_ &= -3;
               } else {
                  this.ensureAttributesIsMutable();
                  this.attributes_.addAll(PftpNotification$PbPftpPnsDHNotificationResponse.a(var1));
               }

               this.onChanged();
            }
         } else if (!PftpNotification$PbPftpPnsDHNotificationResponse.a(var1).isEmpty()) {
            if (this.attributesBuilder_.isEmpty()) {
               this.attributesBuilder_.dispose();
               this.attributesBuilder_ = null;
               this.attributes_ = PftpNotification$PbPftpPnsDHNotificationResponse.a(var1);
               this.bitField0_ &= -3;
               if (PftpNotification$PbPftpPnsDHNotificationResponse.c()) {
                  var2 = this.getAttributesFieldBuilder();
               }

               this.attributesBuilder_ = var2;
            } else {
               this.attributesBuilder_.addAllMessages(PftpNotification$PbPftpPnsDHNotificationResponse.a(var1));
            }
         }

         this.mergeUnknownFields(PftpNotification$PbPftpPnsDHNotificationResponse.b(var1));
         this.onChanged();
      }

      return this;
   }

   public final PftpNotification$PbPftpPnsDHNotificationResponse$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPftpPnsDHNotificationResponse$Builder)super.mergeUnknownFields(var1);
   }

   public PftpNotification$PbPftpPnsDHNotificationResponse$Builder removeAttributes(int var1) {
      if (this.attributesBuilder_ == null) {
         this.ensureAttributesIsMutable();
         this.attributes_.remove(var1);
         this.onChanged();
      } else {
         this.attributesBuilder_.remove(var1);
      }

      return this;
   }

   public PftpNotification$PbPftpPnsDHNotificationResponse$Builder setAttributes(int var1, PftpNotification$PbPftpPnsDHAttribute$Builder var2) {
      if (this.attributesBuilder_ == null) {
         this.ensureAttributesIsMutable();
         this.attributes_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.attributesBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public PftpNotification$PbPftpPnsDHNotificationResponse$Builder setAttributes(int var1, PftpNotification$PbPftpPnsDHAttribute var2) {
      if (this.attributesBuilder_ == null) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureAttributesIsMutable();
         this.attributes_.set(var1, var2);
         this.onChanged();
      } else {
         this.attributesBuilder_.setMessage(var1, var2);
      }

      return this;
   }

   public PftpNotification$PbPftpPnsDHNotificationResponse$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPftpPnsDHNotificationResponse$Builder)super.setField(var1, var2);
   }

   public PftpNotification$PbPftpPnsDHNotificationResponse$Builder setNotificationId(int var1) {
      this.bitField0_ |= 1;
      this.notificationId_ = var1;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPftpPnsDHNotificationResponse$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpNotification$PbPftpPnsDHNotificationResponse$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final PftpNotification$PbPftpPnsDHNotificationResponse$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPftpPnsDHNotificationResponse$Builder)super.setUnknownFields(var1);
   }
}
