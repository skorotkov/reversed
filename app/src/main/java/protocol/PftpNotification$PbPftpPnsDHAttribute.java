package protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.InputStream;

public final class PftpNotification$PbPftpPnsDHAttribute extends GeneratedMessageV3 implements PftpNotification$PbPftpPnsDHAttributeOrBuilder {
   private static final PftpNotification$PbPftpPnsDHAttribute DEFAULT_INSTANCE = new PftpNotification$PbPftpPnsDHAttribute();
   @Deprecated
   public static final Parser PARSER = new PftpNotification$PbPftpPnsDHAttribute$1();
   public static final int TYPE_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private int type_;

   private PftpNotification$PbPftpPnsDHAttribute() {
      this.memoizedIsInitialized = (byte)-1;
      this.type_ = 1;
   }

   private PftpNotification$PbPftpPnsDHAttribute(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PftpNotification$PbPftpPnsDHAttribute(CodedInputStream var1, ExtensionRegistryLite var2, PftpNotification$1 var3) {
      this(var1, var2);
   }

   private PftpNotification$PbPftpPnsDHAttribute(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PftpNotification$PbPftpPnsDHAttribute(Builder var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PftpNotification$PbPftpPnsDHAttribute var0, int var1) {
      var0.type_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(PftpNotification$PbPftpPnsDHAttribute var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(PftpNotification$PbPftpPnsDHAttribute var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static PftpNotification$PbPftpPnsDHAttribute getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.i();
   }

   public static PftpNotification$PbPftpPnsDHAttribute$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PftpNotification$PbPftpPnsDHAttribute$Builder newBuilder(PftpNotification$PbPftpPnsDHAttribute var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PftpNotification$PbPftpPnsDHAttribute parseDelimitedFrom(InputStream var0) {
      return (PftpNotification$PbPftpPnsDHAttribute)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPftpPnsDHAttribute parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPftpPnsDHAttribute)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPftpPnsDHAttribute parseFrom(ByteString var0) {
      return (PftpNotification$PbPftpPnsDHAttribute)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPftpPnsDHAttribute parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPftpPnsDHAttribute)PARSER.parseFrom(var0, var1);
   }

   public static PftpNotification$PbPftpPnsDHAttribute parseFrom(CodedInputStream var0) {
      return (PftpNotification$PbPftpPnsDHAttribute)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPftpPnsDHAttribute parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPftpPnsDHAttribute)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPftpPnsDHAttribute parseFrom(InputStream var0) {
      return (PftpNotification$PbPftpPnsDHAttribute)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPftpPnsDHAttribute parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPftpPnsDHAttribute)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPftpPnsDHAttribute parseFrom(byte[] var0) {
      return (PftpNotification$PbPftpPnsDHAttribute)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPftpPnsDHAttribute parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPftpPnsDHAttribute)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PftpNotification$PbPftpPnsDHAttribute)) {
            var2 = super.equals(var1);
         } else {
            PftpNotification$PbPftpPnsDHAttribute var5 = (PftpNotification$PbPftpPnsDHAttribute)var1;
            boolean var3;
            if (this.hasType() == var5.hasType()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasType()) {
               if (var3 && this.type_ == var5.type_) {
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

   public PftpNotification$PbPftpPnsDHAttribute getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeEnumSize(1, this.type_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public PftpNotification$PbPftpPnsDHAttributeType getType() {
      PftpNotification$PbPftpPnsDHAttributeType var1 = PftpNotification$PbPftpPnsDHAttributeType.valueOf(this.type_);
      PftpNotification$PbPftpPnsDHAttributeType var2 = var1;
      if (var1 == null) {
         var2 = PftpNotification$PbPftpPnsDHAttributeType.UNKNOWN_ACTION;
      }

      return var2;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasType() {
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
         if (this.hasType()) {
            var1 = (var2 * 37 + 1) * 53 + this.type_;
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.j().ensureFieldAccessorsInitialized(PftpNotification$PbPftpPnsDHAttribute.class, PftpNotification$PbPftpPnsDHAttribute$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public PftpNotification$PbPftpPnsDHAttribute$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PftpNotification$PbPftpPnsDHAttribute$Builder newBuilderForType(BuilderParent var1) {
      return new PftpNotification$PbPftpPnsDHAttribute$Builder(var1, (PftpNotification$1)null);
   }

   public PftpNotification$PbPftpPnsDHAttribute$Builder toBuilder() {
      PftpNotification$PbPftpPnsDHAttribute$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PftpNotification$PbPftpPnsDHAttribute$Builder((PftpNotification$1)null);
      } else {
         var1 = (new PftpNotification$PbPftpPnsDHAttribute$Builder((PftpNotification$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.type_);
      }

      this.unknownFields.writeTo(var1);
   }
}
