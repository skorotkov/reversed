package protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import fi.polar.remote.representation.protobuf.Types$PbLocalDateTime;
import fi.polar.remote.representation.protobuf.Types$PbLocalDateTimeOrBuilder;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class PftpNotification$PbPftpPnsHDNotification extends GeneratedMessageV3 implements PftpNotification$PbPftpPnsHDNotificationOrBuilder {
   public static final int ACTION_FIELD_NUMBER = 3;
   public static final int ATTRIBUTES_FIELD_NUMBER = 7;
   public static final int CATEGORY_ID_FIELD_NUMBER = 2;
   private static final PftpNotification$PbPftpPnsHDNotification DEFAULT_INSTANCE = new PftpNotification$PbPftpPnsHDNotification();
   public static final int ISSUE_TIME_FIELD_NUMBER = 4;
   public static final int NEW_SAME_CATEGORY_NOTIFICATIONS_FIELD_NUMBER = 5;
   public static final int NOTIFICATION_ID_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new PftpNotification$PbPftpPnsHDNotification$1();
   public static final int UNREAD_SAME_CATEGORY_NOTIFICATIONS_FIELD_NUMBER = 6;
   private static final long serialVersionUID = 0L;
   private int action_;
   private List attributes_;
   private int bitField0_;
   private int categoryId_;
   private Types$PbLocalDateTime issueTime_;
   private byte memoizedIsInitialized;
   private int newSameCategoryNotifications_;
   private int notificationId_;
   private int unreadSameCategoryNotifications_;

   private PftpNotification$PbPftpPnsHDNotification() {
      this.memoizedIsInitialized = (byte)-1;
      this.notificationId_ = 0;
      this.categoryId_ = 0;
      this.action_ = 0;
      this.newSameCategoryNotifications_ = 0;
      this.unreadSameCategoryNotifications_ = 0;
      this.attributes_ = Collections.emptyList();
   }

   private PftpNotification$PbPftpPnsHDNotification(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PftpNotification$PbPftpPnsHDNotification(CodedInputStream var1, ExtensionRegistryLite var2, PftpNotification$1 var3) {
      this(var1, var2);
   }

   private PftpNotification$PbPftpPnsHDNotification(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PftpNotification$PbPftpPnsHDNotification(Builder var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PftpNotification$PbPftpPnsHDNotification var0, int var1) {
      var0.notificationId_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbLocalDateTime a(PftpNotification$PbPftpPnsHDNotification var0, Types$PbLocalDateTime var1) {
      var0.issueTime_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List a(PftpNotification$PbPftpPnsHDNotification var0) {
      return var0.attributes_;
   }

   // $FF: synthetic method
   static List a(PftpNotification$PbPftpPnsHDNotification var0, List var1) {
      var0.attributes_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(PftpNotification$PbPftpPnsHDNotification var0, int var1) {
      var0.categoryId_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(PftpNotification$PbPftpPnsHDNotification var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(PftpNotification$PbPftpPnsHDNotification var0, int var1) {
      var0.action_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean c() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int d(PftpNotification$PbPftpPnsHDNotification var0, int var1) {
      var0.newSameCategoryNotifications_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int e(PftpNotification$PbPftpPnsHDNotification var0, int var1) {
      var0.unreadSameCategoryNotifications_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int f(PftpNotification$PbPftpPnsHDNotification var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static PftpNotification$PbPftpPnsHDNotification getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.E();
   }

   public static PftpNotification$PbPftpPnsHDNotification$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PftpNotification$PbPftpPnsHDNotification$Builder newBuilder(PftpNotification$PbPftpPnsHDNotification var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PftpNotification$PbPftpPnsHDNotification parseDelimitedFrom(InputStream var0) {
      return (PftpNotification$PbPftpPnsHDNotification)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPftpPnsHDNotification parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPftpPnsHDNotification)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPftpPnsHDNotification parseFrom(ByteString var0) {
      return (PftpNotification$PbPftpPnsHDNotification)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPftpPnsHDNotification parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPftpPnsHDNotification)PARSER.parseFrom(var0, var1);
   }

   public static PftpNotification$PbPftpPnsHDNotification parseFrom(CodedInputStream var0) {
      return (PftpNotification$PbPftpPnsHDNotification)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPftpPnsHDNotification parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPftpPnsHDNotification)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPftpPnsHDNotification parseFrom(InputStream var0) {
      return (PftpNotification$PbPftpPnsHDNotification)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPftpPnsHDNotification parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPftpPnsHDNotification)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPftpPnsHDNotification parseFrom(byte[] var0) {
      return (PftpNotification$PbPftpPnsHDNotification)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPftpPnsHDNotification parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPftpPnsHDNotification)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PftpNotification$PbPftpPnsHDNotification)) {
            var2 = super.equals(var1);
         } else {
            PftpNotification$PbPftpPnsHDNotification var5 = (PftpNotification$PbPftpPnsHDNotification)var1;
            boolean var3;
            if (this.hasNotificationId() == var5.hasNotificationId()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasNotificationId()) {
               if (var3 && this.getNotificationId() == var5.getNotificationId()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasCategoryId() == var5.hasCategoryId()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasCategoryId()) {
               if (var3 && this.categoryId_ == var5.categoryId_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAction() == var5.hasAction()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAction()) {
               if (var4 && this.action_ == var5.action_) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasIssueTime() == var5.hasIssueTime()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasIssueTime()) {
               if (var4 && this.getIssueTime().equals(var5.getIssueTime())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasNewSameCategoryNotifications() == var5.hasNewSameCategoryNotifications()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasNewSameCategoryNotifications()) {
               if (var3 && this.getNewSameCategoryNotifications() == var5.getNewSameCategoryNotifications()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasUnreadSameCategoryNotifications() == var5.hasUnreadSameCategoryNotifications()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasUnreadSameCategoryNotifications()) {
               if (var4 && this.getUnreadSameCategoryNotifications() == var5.getUnreadSameCategoryNotifications()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.getAttributesList().equals(var5.getAttributesList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (!var3 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
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
      return (PftpNotification$PbPftpPnsHDAttribute)this.attributes_.get(var1);
   }

   public int getAttributesCount() {
      return this.attributes_.size();
   }

   public List getAttributesList() {
      return this.attributes_;
   }

   public PftpNotification$PbPftpPnsHDAttributeOrBuilder getAttributesOrBuilder(int var1) {
      return (PftpNotification$PbPftpPnsHDAttributeOrBuilder)this.attributes_.get(var1);
   }

   public List getAttributesOrBuilderList() {
      return this.attributes_;
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
      return DEFAULT_INSTANCE;
   }

   public Types$PbLocalDateTime getIssueTime() {
      Types$PbLocalDateTime var1;
      if (this.issueTime_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.issueTime_;
      }

      return var1;
   }

   public Types$PbLocalDateTimeOrBuilder getIssueTimeOrBuilder() {
      Types$PbLocalDateTime var1;
      if (this.issueTime_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.issueTime_;
      }

      return var1;
   }

   public int getNewSameCategoryNotifications() {
      return this.newSameCategoryNotifications_;
   }

   public int getNotificationId() {
      return this.notificationId_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      byte var1 = 0;
      int var2 = this.memoizedSize;
      if (var2 == -1) {
         if ((this.bitField0_ & 1) == 1) {
            var2 = CodedOutputStream.computeUInt32Size(1, this.notificationId_) + 0;
         } else {
            var2 = 0;
         }

         int var3 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var3 = var2 + CodedOutputStream.computeEnumSize(2, this.categoryId_);
         }

         var2 = var3;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var3 + CodedOutputStream.computeEnumSize(3, this.action_);
         }

         var3 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var3 = var2 + CodedOutputStream.computeMessageSize(4, this.getIssueTime());
         }

         var2 = var3;
         if ((this.bitField0_ & 16) == 16) {
            var2 = var3 + CodedOutputStream.computeUInt32Size(5, this.newSameCategoryNotifications_);
         }

         var3 = var2;
         if ((this.bitField0_ & 32) == 32) {
            var3 = var2 + CodedOutputStream.computeUInt32Size(6, this.unreadSameCategoryNotifications_);
         }

         var2 = var3;

         int var4;
         for(var3 = var1; var3 < this.attributes_.size(); var2 += var4) {
            var4 = CodedOutputStream.computeMessageSize(7, (MessageLite)this.attributes_.get(var3));
            ++var3;
         }

         var2 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var2;
      }

      return var2;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
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

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.hasNotificationId()) {
            var1 = (var2 * 37 + 1) * 53 + this.getNotificationId();
         }

         var2 = var1;
         if (this.hasCategoryId()) {
            var2 = (var1 * 37 + 2) * 53 + this.categoryId_;
         }

         var1 = var2;
         if (this.hasAction()) {
            var1 = (var2 * 37 + 3) * 53 + this.action_;
         }

         var2 = var1;
         if (this.hasIssueTime()) {
            var2 = (var1 * 37 + 4) * 53 + this.getIssueTime().hashCode();
         }

         var1 = var2;
         if (this.hasNewSameCategoryNotifications()) {
            var1 = (var2 * 37 + 5) * 53 + this.getNewSameCategoryNotifications();
         }

         var2 = var1;
         if (this.hasUnreadSameCategoryNotifications()) {
            var2 = (var1 * 37 + 6) * 53 + this.getUnreadSameCategoryNotifications();
         }

         var1 = var2;
         if (this.getAttributesCount() > 0) {
            var1 = (var2 * 37 + 7) * 53 + this.getAttributesList().hashCode();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.F().ensureFieldAccessorsInitialized(PftpNotification$PbPftpPnsHDNotification.class, PftpNotification$PbPftpPnsHDNotification$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      byte var2 = this.memoizedIsInitialized;
      boolean var3;
      if (var2 == 1) {
         var3 = true;
      } else {
         var3 = var1;
         if (var2 != 0) {
            if (!this.hasNotificationId()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.hasCategoryId()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.hasAction()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.hasIssueTime()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.getIssueTime().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else {
               int var4 = 0;

               while(true) {
                  if (var4 >= this.getAttributesCount()) {
                     this.memoizedIsInitialized = (byte)1;
                     var3 = true;
                     break;
                  }

                  if (!this.getAttributes(var4).isInitialized()) {
                     this.memoizedIsInitialized = (byte)0;
                     var3 = var1;
                     break;
                  }

                  ++var4;
               }
            }
         }
      }

      return var3;
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PftpNotification$PbPftpPnsHDNotification$Builder newBuilderForType(BuilderParent var1) {
      return new PftpNotification$PbPftpPnsHDNotification$Builder(var1, (PftpNotification$1)null);
   }

   public PftpNotification$PbPftpPnsHDNotification$Builder toBuilder() {
      PftpNotification$PbPftpPnsHDNotification$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PftpNotification$PbPftpPnsHDNotification$Builder((PftpNotification$1)null);
      } else {
         var1 = (new PftpNotification$PbPftpPnsHDNotification$Builder((PftpNotification$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.notificationId_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeEnum(2, this.categoryId_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeEnum(3, this.action_);
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeMessage(4, this.getIssueTime());
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeUInt32(5, this.newSameCategoryNotifications_);
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeUInt32(6, this.unreadSameCategoryNotifications_);
      }

      for(int var2 = 0; var2 < this.attributes_.size(); ++var2) {
         var1.writeMessage(7, (MessageLite)this.attributes_.get(var2));
      }

      this.unknownFields.writeTo(var1);
   }
}
