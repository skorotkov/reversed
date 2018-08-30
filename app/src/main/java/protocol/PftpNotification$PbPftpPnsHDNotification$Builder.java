package protocol;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import fi.polar.remote.representation.protobuf.Types$PbLocalDateTime;
import fi.polar.remote.representation.protobuf.Types$PbLocalDateTime$Builder;
import fi.polar.remote.representation.protobuf.Types$PbLocalDateTimeOrBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PftpNotification$PbPftpPnsHDNotification$Builder extends Builder implements PftpNotification$PbPftpPnsHDNotificationOrBuilder {
   private int action_;
   private RepeatedFieldBuilderV3 attributesBuilder_;
   private List attributes_;
   private int bitField0_;
   private int categoryId_;
   private SingleFieldBuilderV3 issueTimeBuilder_;
   private Types$PbLocalDateTime issueTime_;
   private int newSameCategoryNotifications_;
   private int notificationId_;
   private int unreadSameCategoryNotifications_;

   private PftpNotification$PbPftpPnsHDNotification$Builder() {
      this.categoryId_ = 0;
      this.action_ = 0;
      this.issueTime_ = null;
      this.attributes_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   private PftpNotification$PbPftpPnsHDNotification$Builder(BuilderParent var1) {
      super(var1);
      this.categoryId_ = 0;
      this.action_ = 0;
      this.issueTime_ = null;
      this.attributes_ = Collections.emptyList();
      this.maybeForceBuilderInitialization();
   }

   // $FF: synthetic method
   PftpNotification$PbPftpPnsHDNotification$Builder(BuilderParent var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   PftpNotification$PbPftpPnsHDNotification$Builder(PftpNotification$1 var1) {
      this();
   }

   private void ensureAttributesIsMutable() {
      if ((this.bitField0_ & 64) != 64) {
         this.attributes_ = new ArrayList(this.attributes_);
         this.bitField0_ |= 64;
      }

   }

   private RepeatedFieldBuilderV3 getAttributesFieldBuilder() {
      if (this.attributesBuilder_ == null) {
         List var1 = this.attributes_;
         boolean var2;
         if ((this.bitField0_ & 64) == 64) {
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
      return PftpNotification.E();
   }

   private SingleFieldBuilderV3 getIssueTimeFieldBuilder() {
      if (this.issueTimeBuilder_ == null) {
         this.issueTimeBuilder_ = new SingleFieldBuilderV3(this.getIssueTime(), this.getParentForChildren(), this.isClean());
         this.issueTime_ = null;
      }

      return this.issueTimeBuilder_;
   }

   private void maybeForceBuilderInitialization() {
      if (PftpNotification$PbPftpPnsHDNotification.b()) {
         this.getIssueTimeFieldBuilder();
         this.getAttributesFieldBuilder();
      }

   }

   public PftpNotification$PbPftpPnsHDNotification$Builder addAllAttributes(Iterable var1) {
      if (this.attributesBuilder_ == null) {
         this.ensureAttributesIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.attributes_);
         this.onChanged();
      } else {
         this.attributesBuilder_.addAllMessages(var1);
      }

      return this;
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder addAttributes(int var1, PftpNotification$PbPftpPnsHDAttribute$Builder var2) {
      if (this.attributesBuilder_ == null) {
         this.ensureAttributesIsMutable();
         this.attributes_.add(var1, var2.build());
         this.onChanged();
      } else {
         this.attributesBuilder_.addMessage(var1, var2.build());
      }

      return this;
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder addAttributes(int var1, PftpNotification$PbPftpPnsHDAttribute var2) {
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

   public PftpNotification$PbPftpPnsHDNotification$Builder addAttributes(PftpNotification$PbPftpPnsHDAttribute$Builder var1) {
      if (this.attributesBuilder_ == null) {
         this.ensureAttributesIsMutable();
         this.attributes_.add(var1.build());
         this.onChanged();
      } else {
         this.attributesBuilder_.addMessage(var1.build());
      }

      return this;
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder addAttributes(PftpNotification$PbPftpPnsHDAttribute var1) {
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

   public PftpNotification$PbPftpPnsHDAttribute$Builder addAttributesBuilder() {
      return (PftpNotification$PbPftpPnsHDAttribute$Builder)this.getAttributesFieldBuilder().addBuilder(PftpNotification$PbPftpPnsHDAttribute.getDefaultInstance());
   }

   public PftpNotification$PbPftpPnsHDAttribute$Builder addAttributesBuilder(int var1) {
      return (PftpNotification$PbPftpPnsHDAttribute$Builder)this.getAttributesFieldBuilder().addBuilder(var1, PftpNotification$PbPftpPnsHDAttribute.getDefaultInstance());
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder addRepeatedField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPftpPnsHDNotification$Builder)super.addRepeatedField(var1, var2);
   }

   public PftpNotification$PbPftpPnsHDNotification build() {
      PftpNotification$PbPftpPnsHDNotification var1 = this.buildPartial();
      if (!var1.isInitialized()) {
         throw newUninitializedMessageException(var1);
      } else {
         return var1;
      }
   }

   public PftpNotification$PbPftpPnsHDNotification buildPartial() {
      byte var1 = 1;
      PftpNotification$PbPftpPnsHDNotification var2 = new PftpNotification$PbPftpPnsHDNotification(this, (PftpNotification$1)null);
      int var3 = this.bitField0_;
      if ((var3 & 1) != 1) {
         var1 = 0;
      }

      PftpNotification$PbPftpPnsHDNotification.a(var2, this.notificationId_);
      int var4 = var1;
      if ((var3 & 2) == 2) {
         var4 = var1 | 2;
      }

      PftpNotification$PbPftpPnsHDNotification.b(var2, this.categoryId_);
      int var5 = var4;
      if ((var3 & 4) == 4) {
         var5 = var4 | 4;
      }

      PftpNotification$PbPftpPnsHDNotification.c(var2, this.action_);
      if ((var3 & 8) == 8) {
         var5 |= 8;
      }

      if (this.issueTimeBuilder_ == null) {
         PftpNotification$PbPftpPnsHDNotification.a(var2, this.issueTime_);
      } else {
         PftpNotification$PbPftpPnsHDNotification.a(var2, (Types$PbLocalDateTime)this.issueTimeBuilder_.build());
      }

      var4 = var5;
      if ((var3 & 16) == 16) {
         var4 = var5 | 16;
      }

      PftpNotification$PbPftpPnsHDNotification.d(var2, this.newSameCategoryNotifications_);
      var5 = var4;
      if ((var3 & 32) == 32) {
         var5 = var4 | 32;
      }

      PftpNotification$PbPftpPnsHDNotification.e(var2, this.unreadSameCategoryNotifications_);
      if (this.attributesBuilder_ == null) {
         if ((this.bitField0_ & 64) == 64) {
            this.attributes_ = Collections.unmodifiableList(this.attributes_);
            this.bitField0_ &= -65;
         }

         PftpNotification$PbPftpPnsHDNotification.a(var2, this.attributes_);
      } else {
         PftpNotification$PbPftpPnsHDNotification.a(var2, this.attributesBuilder_.build());
      }

      PftpNotification$PbPftpPnsHDNotification.f(var2, var5);
      this.onBuilt();
      return var2;
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder clear() {
      super.clear();
      this.notificationId_ = 0;
      this.bitField0_ &= -2;
      this.categoryId_ = 0;
      this.bitField0_ &= -3;
      this.action_ = 0;
      this.bitField0_ &= -5;
      if (this.issueTimeBuilder_ == null) {
         this.issueTime_ = null;
      } else {
         this.issueTimeBuilder_.clear();
      }

      this.bitField0_ &= -9;
      this.newSameCategoryNotifications_ = 0;
      this.bitField0_ &= -17;
      this.unreadSameCategoryNotifications_ = 0;
      this.bitField0_ &= -33;
      if (this.attributesBuilder_ == null) {
         this.attributes_ = Collections.emptyList();
         this.bitField0_ &= -65;
      } else {
         this.attributesBuilder_.clear();
      }

      return this;
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder clearAction() {
      this.bitField0_ &= -5;
      this.action_ = 0;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder clearAttributes() {
      if (this.attributesBuilder_ == null) {
         this.attributes_ = Collections.emptyList();
         this.bitField0_ &= -65;
         this.onChanged();
      } else {
         this.attributesBuilder_.clear();
      }

      return this;
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder clearCategoryId() {
      this.bitField0_ &= -3;
      this.categoryId_ = 0;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder clearField(FieldDescriptor var1) {
      return (PftpNotification$PbPftpPnsHDNotification$Builder)super.clearField(var1);
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder clearIssueTime() {
      if (this.issueTimeBuilder_ == null) {
         this.issueTime_ = null;
         this.onChanged();
      } else {
         this.issueTimeBuilder_.clear();
      }

      this.bitField0_ &= -9;
      return this;
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder clearNewSameCategoryNotifications() {
      this.bitField0_ &= -17;
      this.newSameCategoryNotifications_ = 0;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder clearNotificationId() {
      this.bitField0_ &= -2;
      this.notificationId_ = 0;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder clearOneof(OneofDescriptor var1) {
      return (PftpNotification$PbPftpPnsHDNotification$Builder)super.clearOneof(var1);
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder clearUnreadSameCategoryNotifications() {
      this.bitField0_ &= -33;
      this.unreadSameCategoryNotifications_ = 0;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder clone() {
      return (PftpNotification$PbPftpPnsHDNotification$Builder)super.clone();
   }

   public PftpNotification$Action getAction() {
      PftpNotification$Action var1 = PftpNotification$Action.valueOf(this.action_);
      PftpNotification$Action var2 = var1;
      if (var1 == null) {
         var2 = PftpNotification$Action.CREATED;
      }

      return var2;
   }

   public PftpNotification$PbPftpPnsHDAttribute getAttributes(int var1) {
      PftpNotification$PbPftpPnsHDAttribute var2;
      if (this.attributesBuilder_ == null) {
         var2 = (PftpNotification$PbPftpPnsHDAttribute)this.attributes_.get(var1);
      } else {
         var2 = (PftpNotification$PbPftpPnsHDAttribute)this.attributesBuilder_.getMessage(var1);
      }

      return var2;
   }

   public PftpNotification$PbPftpPnsHDAttribute$Builder getAttributesBuilder(int var1) {
      return (PftpNotification$PbPftpPnsHDAttribute$Builder)this.getAttributesFieldBuilder().getBuilder(var1);
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

   public PftpNotification$PbPftpPnsHDAttributeOrBuilder getAttributesOrBuilder(int var1) {
      PftpNotification$PbPftpPnsHDAttributeOrBuilder var2;
      if (this.attributesBuilder_ == null) {
         var2 = (PftpNotification$PbPftpPnsHDAttributeOrBuilder)this.attributes_.get(var1);
      } else {
         var2 = (PftpNotification$PbPftpPnsHDAttributeOrBuilder)this.attributesBuilder_.getMessageOrBuilder(var1);
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

   public PftpNotification$PbPftpPnsHDCategoryID getCategoryId() {
      PftpNotification$PbPftpPnsHDCategoryID var1 = PftpNotification$PbPftpPnsHDCategoryID.valueOf(this.categoryId_);
      PftpNotification$PbPftpPnsHDCategoryID var2 = var1;
      if (var1 == null) {
         var2 = PftpNotification$PbPftpPnsHDCategoryID.CATEGORY_ID_OTHER;
      }

      return var2;
   }

   public PftpNotification$PbPftpPnsHDNotification getDefaultInstanceForType() {
      return PftpNotification$PbPftpPnsHDNotification.getDefaultInstance();
   }

   public Descriptor getDescriptorForType() {
      return PftpNotification.E();
   }

   public Types$PbLocalDateTime getIssueTime() {
      Types$PbLocalDateTime var1;
      if (this.issueTimeBuilder_ == null) {
         if (this.issueTime_ == null) {
            var1 = Types$PbLocalDateTime.getDefaultInstance();
         } else {
            var1 = this.issueTime_;
         }
      } else {
         var1 = (Types$PbLocalDateTime)this.issueTimeBuilder_.getMessage();
      }

      return var1;
   }

   public Types$PbLocalDateTime$Builder getIssueTimeBuilder() {
      this.bitField0_ |= 8;
      this.onChanged();
      return (Types$PbLocalDateTime$Builder)this.getIssueTimeFieldBuilder().getBuilder();
   }

   public Types$PbLocalDateTimeOrBuilder getIssueTimeOrBuilder() {
      Object var1;
      if (this.issueTimeBuilder_ != null) {
         var1 = (Types$PbLocalDateTimeOrBuilder)this.issueTimeBuilder_.getMessageOrBuilder();
      } else if (this.issueTime_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.issueTime_;
      }

      return (Types$PbLocalDateTimeOrBuilder)var1;
   }

   public int getNewSameCategoryNotifications() {
      return this.newSameCategoryNotifications_;
   }

   public int getNotificationId() {
      return this.notificationId_;
   }

   public int getUnreadSameCategoryNotifications() {
      return this.unreadSameCategoryNotifications_;
   }

   public boolean hasAction() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasCategoryId() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasIssueTime() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasNewSameCategoryNotifications() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasNotificationId() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasUnreadSameCategoryNotifications() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.F().ensureFieldAccessorsInitialized(PftpNotification$PbPftpPnsHDNotification.class, PftpNotification$PbPftpPnsHDNotification$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      boolean var2;
      if (!this.hasNotificationId()) {
         var2 = var1;
      } else {
         var2 = var1;
         if (this.hasCategoryId()) {
            var2 = var1;
            if (this.hasAction()) {
               var2 = var1;
               if (this.hasIssueTime()) {
                  var2 = var1;
                  if (this.getIssueTime().isInitialized()) {
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
               }
            }
         }
      }

      return var2;
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
      PftpNotification$PbPftpPnsHDNotification var13;
      label96: {
         InvalidProtocolBufferException var12;
         PftpNotification$PbPftpPnsHDNotification var14;
         try {
            var13 = (PftpNotification$PbPftpPnsHDNotification)PftpNotification$PbPftpPnsHDNotification.PARSER.parsePartialFrom(var1, var2);
            break label96;
         } catch (InvalidProtocolBufferException var10) {
            var12 = var10;
            var14 = (PftpNotification$PbPftpPnsHDNotification)var10.getUnfinishedMessage();
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

   public PftpNotification$PbPftpPnsHDNotification$Builder mergeFrom(Message var1) {
      PftpNotification$PbPftpPnsHDNotification$Builder var2;
      if (var1 instanceof PftpNotification$PbPftpPnsHDNotification) {
         var2 = this.mergeFrom((PftpNotification$PbPftpPnsHDNotification)var1);
      } else {
         super.mergeFrom(var1);
         var2 = this;
      }

      return var2;
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder mergeFrom(PftpNotification$PbPftpPnsHDNotification var1) {
      RepeatedFieldBuilderV3 var2 = null;
      if (var1 != PftpNotification$PbPftpPnsHDNotification.getDefaultInstance()) {
         if (var1.hasNotificationId()) {
            this.setNotificationId(var1.getNotificationId());
         }

         if (var1.hasCategoryId()) {
            this.setCategoryId(var1.getCategoryId());
         }

         if (var1.hasAction()) {
            this.setAction(var1.getAction());
         }

         if (var1.hasIssueTime()) {
            this.mergeIssueTime(var1.getIssueTime());
         }

         if (var1.hasNewSameCategoryNotifications()) {
            this.setNewSameCategoryNotifications(var1.getNewSameCategoryNotifications());
         }

         if (var1.hasUnreadSameCategoryNotifications()) {
            this.setUnreadSameCategoryNotifications(var1.getUnreadSameCategoryNotifications());
         }

         if (this.attributesBuilder_ == null) {
            if (!PftpNotification$PbPftpPnsHDNotification.a(var1).isEmpty()) {
               if (this.attributes_.isEmpty()) {
                  this.attributes_ = PftpNotification$PbPftpPnsHDNotification.a(var1);
                  this.bitField0_ &= -65;
               } else {
                  this.ensureAttributesIsMutable();
                  this.attributes_.addAll(PftpNotification$PbPftpPnsHDNotification.a(var1));
               }

               this.onChanged();
            }
         } else if (!PftpNotification$PbPftpPnsHDNotification.a(var1).isEmpty()) {
            if (this.attributesBuilder_.isEmpty()) {
               this.attributesBuilder_.dispose();
               this.attributesBuilder_ = null;
               this.attributes_ = PftpNotification$PbPftpPnsHDNotification.a(var1);
               this.bitField0_ &= -65;
               if (PftpNotification$PbPftpPnsHDNotification.c()) {
                  var2 = this.getAttributesFieldBuilder();
               }

               this.attributesBuilder_ = var2;
            } else {
               this.attributesBuilder_.addAllMessages(PftpNotification$PbPftpPnsHDNotification.a(var1));
            }
         }

         this.mergeUnknownFields(PftpNotification$PbPftpPnsHDNotification.b(var1));
         this.onChanged();
      }

      return this;
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder mergeIssueTime(Types$PbLocalDateTime var1) {
      if (this.issueTimeBuilder_ == null) {
         if ((this.bitField0_ & 8) == 8 && this.issueTime_ != null && this.issueTime_ != Types$PbLocalDateTime.getDefaultInstance()) {
            this.issueTime_ = Types$PbLocalDateTime.newBuilder(this.issueTime_).mergeFrom(var1).buildPartial();
         } else {
            this.issueTime_ = var1;
         }

         this.onChanged();
      } else {
         this.issueTimeBuilder_.mergeFrom(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public final PftpNotification$PbPftpPnsHDNotification$Builder mergeUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPftpPnsHDNotification$Builder)super.mergeUnknownFields(var1);
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder removeAttributes(int var1) {
      if (this.attributesBuilder_ == null) {
         this.ensureAttributesIsMutable();
         this.attributes_.remove(var1);
         this.onChanged();
      } else {
         this.attributesBuilder_.remove(var1);
      }

      return this;
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder setAction(PftpNotification$Action var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 4;
         this.action_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder setAttributes(int var1, PftpNotification$PbPftpPnsHDAttribute$Builder var2) {
      if (this.attributesBuilder_ == null) {
         this.ensureAttributesIsMutable();
         this.attributes_.set(var1, var2.build());
         this.onChanged();
      } else {
         this.attributesBuilder_.setMessage(var1, var2.build());
      }

      return this;
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder setAttributes(int var1, PftpNotification$PbPftpPnsHDAttribute var2) {
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

   public PftpNotification$PbPftpPnsHDNotification$Builder setCategoryId(PftpNotification$PbPftpPnsHDCategoryID var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.bitField0_ |= 2;
         this.categoryId_ = var1.getNumber();
         this.onChanged();
         return this;
      }
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder setField(FieldDescriptor var1, Object var2) {
      return (PftpNotification$PbPftpPnsHDNotification$Builder)super.setField(var1, var2);
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder setIssueTime(Types$PbLocalDateTime$Builder var1) {
      if (this.issueTimeBuilder_ == null) {
         this.issueTime_ = var1.build();
         this.onChanged();
      } else {
         this.issueTimeBuilder_.setMessage(var1.build());
      }

      this.bitField0_ |= 8;
      return this;
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder setIssueTime(Types$PbLocalDateTime var1) {
      if (this.issueTimeBuilder_ == null) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.issueTime_ = var1;
         this.onChanged();
      } else {
         this.issueTimeBuilder_.setMessage(var1);
      }

      this.bitField0_ |= 8;
      return this;
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder setNewSameCategoryNotifications(int var1) {
      this.bitField0_ |= 16;
      this.newSameCategoryNotifications_ = var1;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder setNotificationId(int var1) {
      this.bitField0_ |= 1;
      this.notificationId_ = var1;
      this.onChanged();
      return this;
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
      return (PftpNotification$PbPftpPnsHDNotification$Builder)super.setRepeatedField(var1, var2, var3);
   }

   public final PftpNotification$PbPftpPnsHDNotification$Builder setUnknownFields(UnknownFieldSet var1) {
      return (PftpNotification$PbPftpPnsHDNotification$Builder)super.setUnknownFields(var1);
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder setUnreadSameCategoryNotifications(int var1) {
      this.bitField0_ |= 32;
      this.unreadSameCategoryNotifications_ = var1;
      this.onChanged();
      return this;
   }
}
