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

public final class PftpNotification$PbPftpPnsHDAttribute extends GeneratedMessageV3 implements PftpNotification$PbPftpPnsHDAttributeOrBuilder {
   public static final int ATTRIBUTE_FULL_SIZE_FIELD_NUMBER = 3;
   public static final int DATA_FIELD_NUMBER = 2;
   private static final PftpNotification$PbPftpPnsHDAttribute DEFAULT_INSTANCE = new PftpNotification$PbPftpPnsHDAttribute();
   @Deprecated
   public static final Parser PARSER = new PftpNotification$PbPftpPnsHDAttribute$1();
   public static final int TYPE_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int attributeFullSize_;
   private int bitField0_;
   private volatile Object data_;
   private byte memoizedIsInitialized;
   private int type_;

   private PftpNotification$PbPftpPnsHDAttribute() {
      this.memoizedIsInitialized = (byte)-1;
      this.type_ = 0;
      this.data_ = "";
      this.attributeFullSize_ = 0;
   }

   private PftpNotification$PbPftpPnsHDAttribute(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PftpNotification$PbPftpPnsHDAttribute(CodedInputStream var1, ExtensionRegistryLite var2, PftpNotification$1 var3) {
      this(var1, var2);
   }

   private PftpNotification$PbPftpPnsHDAttribute(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PftpNotification$PbPftpPnsHDAttribute(Builder var1, PftpNotification$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PftpNotification$PbPftpPnsHDAttribute var0, int var1) {
      var0.type_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object a(PftpNotification$PbPftpPnsHDAttribute var0) {
      return var0.data_;
   }

   // $FF: synthetic method
   static Object a(PftpNotification$PbPftpPnsHDAttribute var0, Object var1) {
      var0.data_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(PftpNotification$PbPftpPnsHDAttribute var0, int var1) {
      var0.attributeFullSize_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(PftpNotification$PbPftpPnsHDAttribute var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(PftpNotification$PbPftpPnsHDAttribute var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static PftpNotification$PbPftpPnsHDAttribute getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PftpNotification.C();
   }

   public static PftpNotification$PbPftpPnsHDAttribute$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PftpNotification$PbPftpPnsHDAttribute$Builder newBuilder(PftpNotification$PbPftpPnsHDAttribute var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PftpNotification$PbPftpPnsHDAttribute parseDelimitedFrom(InputStream var0) {
      return (PftpNotification$PbPftpPnsHDAttribute)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPftpPnsHDAttribute parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPftpPnsHDAttribute)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPftpPnsHDAttribute parseFrom(ByteString var0) {
      return (PftpNotification$PbPftpPnsHDAttribute)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPftpPnsHDAttribute parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPftpPnsHDAttribute)PARSER.parseFrom(var0, var1);
   }

   public static PftpNotification$PbPftpPnsHDAttribute parseFrom(CodedInputStream var0) {
      return (PftpNotification$PbPftpPnsHDAttribute)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPftpPnsHDAttribute parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPftpPnsHDAttribute)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPftpPnsHDAttribute parseFrom(InputStream var0) {
      return (PftpNotification$PbPftpPnsHDAttribute)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PftpNotification$PbPftpPnsHDAttribute parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPftpPnsHDAttribute)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PftpNotification$PbPftpPnsHDAttribute parseFrom(byte[] var0) {
      return (PftpNotification$PbPftpPnsHDAttribute)PARSER.parseFrom(var0);
   }

   public static PftpNotification$PbPftpPnsHDAttribute parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PftpNotification$PbPftpPnsHDAttribute)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PftpNotification$PbPftpPnsHDAttribute)) {
            var2 = super.equals(var1);
         } else {
            PftpNotification$PbPftpPnsHDAttribute var5 = (PftpNotification$PbPftpPnsHDAttribute)var1;
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

            if (var4 && this.hasData() == var5.hasData()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasData()) {
               if (var4 && this.getData().equals(var5.getData())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasAttributeFullSize() == var5.hasAttributeFullSize()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAttributeFullSize()) {
               if (var4 && this.getAttributeFullSize() == var5.getAttributeFullSize()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (!var3 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public int getAttributeFullSize() {
      return this.attributeFullSize_;
   }

   public String getData() {
      Object var1 = this.data_;
      String var3;
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.data_ = var3;
         }
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
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeEnumSize(1, this.type_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + GeneratedMessageV3.computeStringSize(2, this.data_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(3, this.attributeFullSize_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public PftpNotification$PbPftpPnsHDAttributeType getType() {
      PftpNotification$PbPftpPnsHDAttributeType var1 = PftpNotification$PbPftpPnsHDAttributeType.valueOf(this.type_);
      PftpNotification$PbPftpPnsHDAttributeType var2 = var1;
      if (var1 == null) {
         var2 = PftpNotification$PbPftpPnsHDAttributeType.TITLE;
      }

      return var2;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
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

         var2 = var1;
         if (this.hasData()) {
            var2 = (var1 * 37 + 2) * 53 + this.getData().hashCode();
         }

         var1 = var2;
         if (this.hasAttributeFullSize()) {
            var1 = (var2 * 37 + 3) * 53 + this.getAttributeFullSize();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PftpNotification.D().ensureFieldAccessorsInitialized(PftpNotification$PbPftpPnsHDAttribute.class, PftpNotification$PbPftpPnsHDAttribute$Builder.class);
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

   public PftpNotification$PbPftpPnsHDAttribute$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PftpNotification$PbPftpPnsHDAttribute$Builder newBuilderForType(BuilderParent var1) {
      return new PftpNotification$PbPftpPnsHDAttribute$Builder(var1, (PftpNotification$1)null);
   }

   public PftpNotification$PbPftpPnsHDAttribute$Builder toBuilder() {
      PftpNotification$PbPftpPnsHDAttribute$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PftpNotification$PbPftpPnsHDAttribute$Builder((PftpNotification$1)null);
      } else {
         var1 = (new PftpNotification$PbPftpPnsHDAttribute$Builder((PftpNotification$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.type_);
      }

      if ((this.bitField0_ & 2) == 2) {
         GeneratedMessageV3.writeString(var1, 2, this.data_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeUInt32(3, this.attributeFullSize_);
      }

      this.unknownFields.writeTo(var1);
   }
}
