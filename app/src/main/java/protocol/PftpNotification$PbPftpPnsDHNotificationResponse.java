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
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class PftpNotification$PbPftpPnsDHNotificationResponse extends GeneratedMessageV3 implements PftpNotification$PbPftpPnsDHNotificationResponseOrBuilder {
   public static final int ATTRIBUTES_FIELD_NUMBER = 2;
   private static final PftpNotification$PbPftpPnsDHNotificationResponse DEFAULT_INSTANCE = new PftpNotification$PbPftpPnsDHNotificationResponse();
   public static final int NOTIFICATION_ID_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new PftpNotification$PbPftpPnsDHNotificationResponse$1();
   private static final long serialVersionUID = 0L;
   private List attributes_;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private int notificationId_;

   private PftpNotification$PbPftpPnsDHNotificationResponse() {
      this.memoizedIsInitialized = (byte)-1;
      this.notificationId_ = 0;
      this.attributes_ = Collections.emptyList();
   }

   private PftpNotification$PbPftpPnsDHNotificationResponse(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PftpNotification$PbPftpPnsDHNotificationResponse(CodedInputStream var1, ExtensionRegistryLite var2, PftpNotification$1 var3) {
      this(var1, var2);
   }

   private PftpNotification$PbPftpPnsDHNotificationResponse(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PftpNotification$PbPftpPnsDHNotificationResponse(Builder var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PftpNotification$PbPftpPnsDHNotificationResponse var0, int var1) {
      var0.notificationId_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List a(PftpNotification$PbPftpPnsDHNotificationResponse var0) {
      return var0.attributes_;
   }

   // $FF: synthetic method
   static List a(PftpNotification$PbPftpPnsDHNotificationResponse var0, List var1) {
      var0.attributes_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(PftpNotification$PbPftpPnsDHNotificationResponse var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(PftpNotification$PbPftpPnsDHNotificationResponse var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static boolean c() {
      return alwaysUseFieldBuilders;
   }

   public static PftpNotification$PbPftpPnsDHNotificationResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.k();
   }

   public static PftpNotification$PbPftpPnsDHNotificationResponse$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PftpNotification$PbPftpPnsDHNotificationResponse$Builder newBuilder(PftpNotification$PbPftpPnsDHNotificationResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PftpNotification$PbPftpPnsDHNotificationResponse parseDelimitedFrom(InputStream var0) {
      return (PftpNotification$PbPftpPnsDHNotificationResponse)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPftpPnsDHNotificationResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPftpPnsDHNotificationResponse)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPftpPnsDHNotificationResponse parseFrom(ByteString var0) {
      return (PftpNotification$PbPftpPnsDHNotificationResponse)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPftpPnsDHNotificationResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPftpPnsDHNotificationResponse)PARSER.parseFrom(var0, var1);
   }

   public static PftpNotification$PbPftpPnsDHNotificationResponse parseFrom(CodedInputStream var0) {
      return (PftpNotification$PbPftpPnsDHNotificationResponse)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPftpPnsDHNotificationResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPftpPnsDHNotificationResponse)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPftpPnsDHNotificationResponse parseFrom(InputStream var0) {
      return (PftpNotification$PbPftpPnsDHNotificationResponse)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPftpPnsDHNotificationResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPftpPnsDHNotificationResponse)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPftpPnsDHNotificationResponse parseFrom(byte[] var0) {
      return (PftpNotification$PbPftpPnsDHNotificationResponse)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPftpPnsDHNotificationResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPftpPnsDHNotificationResponse)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PftpNotification$PbPftpPnsDHNotificationResponse)) {
            var2 = super.equals(var1);
         } else {
            PftpNotification$PbPftpPnsDHNotificationResponse var5 = (PftpNotification$PbPftpPnsDHNotificationResponse)var1;
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

            if (var4 && this.getAttributesList().equals(var5.getAttributesList())) {
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

   public PftpNotification$PbPftpPnsDHAttribute getAttributes(int var1) {
      return (PftpNotification$PbPftpPnsDHAttribute)this.attributes_.get(var1);
   }

   public int getAttributesCount() {
      return this.attributes_.size();
   }

   public List getAttributesList() {
      return this.attributes_;
   }

   public PftpNotification$PbPftpPnsDHAttributeOrBuilder getAttributesOrBuilder(int var1) {
      return (PftpNotification$PbPftpPnsDHAttributeOrBuilder)this.attributes_.get(var1);
   }

   public List getAttributesOrBuilderList() {
      return this.attributes_;
   }

   public PftpNotification$PbPftpPnsDHNotificationResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public int getNotificationId() {
      return this.notificationId_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = 0;
      int var2 = this.memoizedSize;
      if (var2 == -1) {
         if ((this.bitField0_ & 1) == 1) {
            var2 = CodedOutputStream.computeUInt32Size(1, this.notificationId_) + 0;
         } else {
            var2 = 0;
         }

         while(var1 < this.attributes_.size()) {
            int var3 = CodedOutputStream.computeMessageSize(2, (MessageLite)this.attributes_.get(var1));
            ++var1;
            var2 += var3;
         }

         var2 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var2;
      }

      return var2;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasNotificationId() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
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
         if (this.getAttributesCount() > 0) {
            var2 = (var1 * 37 + 2) * 53 + this.getAttributesList().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.l().ensureFieldAccessorsInitialized(PftpNotification$PbPftpPnsDHNotificationResponse.class, PftpNotification$PbPftpPnsDHNotificationResponse$Builder.class);
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

   public PftpNotification$PbPftpPnsDHNotificationResponse$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PftpNotification$PbPftpPnsDHNotificationResponse$Builder newBuilderForType(BuilderParent var1) {
      return new PftpNotification$PbPftpPnsDHNotificationResponse$Builder(var1, (PftpNotification$1)null);
   }

   public PftpNotification$PbPftpPnsDHNotificationResponse$Builder toBuilder() {
      PftpNotification$PbPftpPnsDHNotificationResponse$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PftpNotification$PbPftpPnsDHNotificationResponse$Builder((PftpNotification$1)null);
      } else {
         var1 = (new PftpNotification$PbPftpPnsDHNotificationResponse$Builder((PftpNotification$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.notificationId_);
      }

      for(int var2 = 0; var2 < this.attributes_.size(); ++var2) {
         var1.writeMessage(2, (MessageLite)this.attributes_.get(var2));
      }

      this.unknownFields.writeTo(var1);
   }
}
