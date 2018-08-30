package protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.InputStream;

public final class PftpNotification$PbPftpPnsState extends GeneratedMessageV3 implements PftpNotification$PbPftpPnsStateOrBuilder {
   private static final PftpNotification$PbPftpPnsState DEFAULT_INSTANCE = new PftpNotification$PbPftpPnsState();
   public static final int NOTIFICATIONS_ENABLED_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new PftpNotification$PbPftpPnsState$1();
   public static final int PREVIEW_ENABLED_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private boolean notificationsEnabled_;
   private boolean previewEnabled_;

   private PftpNotification$PbPftpPnsState() {
      this.memoizedIsInitialized = (byte)-1;
      this.notificationsEnabled_ = false;
      this.previewEnabled_ = false;
   }

   private PftpNotification$PbPftpPnsState(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PftpNotification$PbPftpPnsState(CodedInputStream var1, ExtensionRegistryLite var2, PftpNotification$1 var3) {
      this(var1, var2);
   }

   private PftpNotification$PbPftpPnsState(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PftpNotification$PbPftpPnsState(Builder var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PftpNotification$PbPftpPnsState var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(PftpNotification$PbPftpPnsState var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean a(PftpNotification$PbPftpPnsState var0, boolean var1) {
      var0.notificationsEnabled_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static boolean b(PftpNotification$PbPftpPnsState var0, boolean var1) {
      var0.previewEnabled_ = var1;
      return var1;
   }

   public static PftpNotification$PbPftpPnsState getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.m();
   }

   public static PftpNotification$PbPftpPnsState$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PftpNotification$PbPftpPnsState$Builder newBuilder(PftpNotification$PbPftpPnsState var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PftpNotification$PbPftpPnsState parseDelimitedFrom(InputStream var0) {
      return (PftpNotification$PbPftpPnsState)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPftpPnsState parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPftpPnsState)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPftpPnsState parseFrom(ByteString var0) {
      return (PftpNotification$PbPftpPnsState)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPftpPnsState parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPftpPnsState)PARSER.parseFrom(var0, var1);
   }

   public static PftpNotification$PbPftpPnsState parseFrom(CodedInputStream var0) {
      return (PftpNotification$PbPftpPnsState)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPftpPnsState parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPftpPnsState)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPftpPnsState parseFrom(InputStream var0) {
      return (PftpNotification$PbPftpPnsState)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPftpPnsState parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPftpPnsState)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPftpPnsState parseFrom(byte[] var0) {
      return (PftpNotification$PbPftpPnsState)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPftpPnsState parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPftpPnsState)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PftpNotification$PbPftpPnsState)) {
            var2 = super.equals(var1);
         } else {
            PftpNotification$PbPftpPnsState var5 = (PftpNotification$PbPftpPnsState)var1;
            boolean var3;
            if (this.hasNotificationsEnabled() == var5.hasNotificationsEnabled()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasNotificationsEnabled()) {
               if (var3 && this.getNotificationsEnabled() == var5.getNotificationsEnabled()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasPreviewEnabled() == var5.hasPreviewEnabled()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasPreviewEnabled()) {
               if (var3 && this.getPreviewEnabled() == var5.getPreviewEnabled()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (!var4 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public PftpNotification$PbPftpPnsState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public boolean getNotificationsEnabled() {
      return this.notificationsEnabled_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public boolean getPreviewEnabled() {
      return this.previewEnabled_;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeBoolSize(1, this.notificationsEnabled_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeBoolSize(2, this.previewEnabled_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
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

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.hasNotificationsEnabled()) {
            var1 = (var2 * 37 + 1) * 53 + Internal.hashBoolean(this.getNotificationsEnabled());
         }

         var2 = var1;
         if (this.hasPreviewEnabled()) {
            var2 = (var1 * 37 + 2) * 53 + Internal.hashBoolean(this.getPreviewEnabled());
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.n().ensureFieldAccessorsInitialized(PftpNotification$PbPftpPnsState.class, PftpNotification$PbPftpPnsState$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasNotificationsEnabled()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public PftpNotification$PbPftpPnsState$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PftpNotification$PbPftpPnsState$Builder newBuilderForType(BuilderParent var1) {
      return new PftpNotification$PbPftpPnsState$Builder(var1, (PftpNotification$1)null);
   }

   public PftpNotification$PbPftpPnsState$Builder toBuilder() {
      PftpNotification$PbPftpPnsState$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PftpNotification$PbPftpPnsState$Builder((PftpNotification$1)null);
      } else {
         var1 = (new PftpNotification$PbPftpPnsState$Builder((PftpNotification$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeBool(1, this.notificationsEnabled_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeBool(2, this.previewEnabled_);
      }

      this.unknownFields.writeTo(var1);
   }
}
