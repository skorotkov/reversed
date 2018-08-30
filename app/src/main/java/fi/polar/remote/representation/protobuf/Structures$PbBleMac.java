package fi.polar.remote.representation.protobuf;

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

public final class Structures$PbBleMac extends GeneratedMessageV3 implements Structures$PbBleMacOrBuilder {
   private static final Structures$PbBleMac DEFAULT_INSTANCE = new Structures$PbBleMac();
   public static final int MAC_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new Structures$PbBleMac$1();
   public static final int TYPE_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private ByteString mac_;
   private byte memoizedIsInitialized;
   private int type_;

   private Structures$PbBleMac() {
      this.memoizedIsInitialized = (byte)-1;
      this.mac_ = ByteString.EMPTY;
      this.type_ = 0;
   }

   private Structures$PbBleMac(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Structures$PbBleMac(CodedInputStream var1, ExtensionRegistryLite var2, Structures$1 var3) {
      this(var1, var2);
   }

   private Structures$PbBleMac(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Structures$PbBleMac(Builder var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Structures$PbBleMac var0, int var1) {
      var0.type_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ByteString a(Structures$PbBleMac var0, ByteString var1) {
      var0.mac_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Structures$PbBleMac var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(Structures$PbBleMac var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static Structures$PbBleMac getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Structures.q();
   }

   public static Structures$PbBleMac$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Structures$PbBleMac$Builder newBuilder(Structures$PbBleMac var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Structures$PbBleMac parseDelimitedFrom(InputStream var0) {
      return (Structures$PbBleMac)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Structures$PbBleMac parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbBleMac)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbBleMac parseFrom(ByteString var0) {
      return (Structures$PbBleMac)PARSER.parseFrom(var0);
   }

   public static Structures$PbBleMac parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Structures$PbBleMac)PARSER.parseFrom(var0, var1);
   }

   public static Structures$PbBleMac parseFrom(CodedInputStream var0) {
      return (Structures$PbBleMac)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbBleMac parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbBleMac)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbBleMac parseFrom(InputStream var0) {
      return (Structures$PbBleMac)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbBleMac parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbBleMac)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbBleMac parseFrom(byte[] var0) {
      return (Structures$PbBleMac)PARSER.parseFrom(var0);
   }

   public static Structures$PbBleMac parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Structures$PbBleMac)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Structures$PbBleMac)) {
            var2 = super.equals(var1);
         } else {
            Structures$PbBleMac var5 = (Structures$PbBleMac)var1;
            boolean var3;
            if (this.hasMac() == var5.hasMac()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasMac()) {
               if (var3 && this.getMac().equals(var5.getMac())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasType() == var5.hasType()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasType()) {
               if (var4 && this.type_ == var5.type_) {
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

   public Structures$PbBleMac getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public ByteString getMac() {
      return this.mac_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeBytesSize(1, this.mac_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeEnumSize(2, this.type_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public Types$PbMacType getType() {
      Types$PbMacType var1 = Types$PbMacType.valueOf(this.type_);
      Types$PbMacType var2 = var1;
      if (var1 == null) {
         var2 = Types$PbMacType.MAC_TYPE_PUBLIC;
      }

      return var2;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasMac() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasType() {
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
         if (this.hasMac()) {
            var1 = (var2 * 37 + 1) * 53 + this.getMac().hashCode();
         }

         var2 = var1;
         if (this.hasType()) {
            var2 = (var1 * 37 + 2) * 53 + this.type_;
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.r().ensureFieldAccessorsInitialized(Structures$PbBleMac.class, Structures$PbBleMac$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasMac()) {
            this.memoizedIsInitialized = (byte)0;
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

   public Structures$PbBleMac$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Structures$PbBleMac$Builder newBuilderForType(BuilderParent var1) {
      return new Structures$PbBleMac$Builder(var1, (Structures$1)null);
   }

   public Structures$PbBleMac$Builder toBuilder() {
      Structures$PbBleMac$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Structures$PbBleMac$Builder((Structures$1)null);
      } else {
         var1 = (new Structures$PbBleMac$Builder((Structures$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeBytes(1, this.mac_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeEnum(2, this.type_);
      }

      this.unknownFields.writeTo(var1);
   }
}
