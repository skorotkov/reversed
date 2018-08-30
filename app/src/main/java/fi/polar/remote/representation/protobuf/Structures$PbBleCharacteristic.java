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

public final class Structures$PbBleCharacteristic extends GeneratedMessageV3 implements Structures$PbBleCharacteristicOrBuilder {
   private static final Structures$PbBleCharacteristic DEFAULT_INSTANCE = new Structures$PbBleCharacteristic();
   public static final int HANDLE_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new Structures$PbBleCharacteristic$1();
   public static final int TYPE_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int handle_;
   private byte memoizedIsInitialized;
   private Structures$PbBleUuid type_;

   private Structures$PbBleCharacteristic() {
      this.memoizedIsInitialized = (byte)-1;
      this.handle_ = 0;
   }

   private Structures$PbBleCharacteristic(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Structures$PbBleCharacteristic(CodedInputStream var1, ExtensionRegistryLite var2, Structures$1 var3) {
      this(var1, var2);
   }

   private Structures$PbBleCharacteristic(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Structures$PbBleCharacteristic(Builder var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Structures$PbBleCharacteristic var0, int var1) {
      var0.handle_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Structures$PbBleCharacteristic var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Structures$PbBleUuid a(Structures$PbBleCharacteristic var0, Structures$PbBleUuid var1) {
      var0.type_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(Structures$PbBleCharacteristic var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static Structures$PbBleCharacteristic getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Structures.ac();
   }

   public static Structures$PbBleCharacteristic$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Structures$PbBleCharacteristic$Builder newBuilder(Structures$PbBleCharacteristic var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Structures$PbBleCharacteristic parseDelimitedFrom(InputStream var0) {
      return (Structures$PbBleCharacteristic)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Structures$PbBleCharacteristic parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbBleCharacteristic)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbBleCharacteristic parseFrom(ByteString var0) {
      return (Structures$PbBleCharacteristic)PARSER.parseFrom(var0);
   }

   public static Structures$PbBleCharacteristic parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Structures$PbBleCharacteristic)PARSER.parseFrom(var0, var1);
   }

   public static Structures$PbBleCharacteristic parseFrom(CodedInputStream var0) {
      return (Structures$PbBleCharacteristic)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbBleCharacteristic parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbBleCharacteristic)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbBleCharacteristic parseFrom(InputStream var0) {
      return (Structures$PbBleCharacteristic)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbBleCharacteristic parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbBleCharacteristic)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbBleCharacteristic parseFrom(byte[] var0) {
      return (Structures$PbBleCharacteristic)PARSER.parseFrom(var0);
   }

   public static Structures$PbBleCharacteristic parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Structures$PbBleCharacteristic)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Structures$PbBleCharacteristic)) {
            var2 = super.equals(var1);
         } else {
            Structures$PbBleCharacteristic var5 = (Structures$PbBleCharacteristic)var1;
            boolean var3;
            if (this.hasHandle() == var5.hasHandle()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasHandle()) {
               if (var3 && this.getHandle() == var5.getHandle()) {
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
               if (var4 && this.getType().equals(var5.getType())) {
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

   public Structures$PbBleCharacteristic getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public int getHandle() {
      return this.handle_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeUInt32Size(1, this.handle_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeMessageSize(2, this.getType());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public Structures$PbBleUuid getType() {
      Structures$PbBleUuid var1;
      if (this.type_ == null) {
         var1 = Structures$PbBleUuid.getDefaultInstance();
      } else {
         var1 = this.type_;
      }

      return var1;
   }

   public Structures$PbBleUuidOrBuilder getTypeOrBuilder() {
      Structures$PbBleUuid var1;
      if (this.type_ == null) {
         var1 = Structures$PbBleUuid.getDefaultInstance();
      } else {
         var1 = this.type_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasHandle() {
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
         if (this.hasHandle()) {
            var1 = (var2 * 37 + 1) * 53 + this.getHandle();
         }

         var2 = var1;
         if (this.hasType()) {
            var2 = (var1 * 37 + 2) * 53 + this.getType().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.ad().ensureFieldAccessorsInitialized(Structures$PbBleCharacteristic.class, Structures$PbBleCharacteristic$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasHandle()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getType().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Structures$PbBleCharacteristic$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Structures$PbBleCharacteristic$Builder newBuilderForType(BuilderParent var1) {
      return new Structures$PbBleCharacteristic$Builder(var1, (Structures$1)null);
   }

   public Structures$PbBleCharacteristic$Builder toBuilder() {
      Structures$PbBleCharacteristic$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Structures$PbBleCharacteristic$Builder((Structures$1)null);
      } else {
         var1 = (new Structures$PbBleCharacteristic$Builder((Structures$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.handle_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getType());
      }

      this.unknownFields.writeTo(var1);
   }
}
