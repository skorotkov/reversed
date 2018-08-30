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

public final class Structures$PbBleDeviceName extends GeneratedMessageV3 implements Structures$PbBleDeviceNameOrBuilder {
   private static final Structures$PbBleDeviceName DEFAULT_INSTANCE = new Structures$PbBleDeviceName();
   public static final int NAME_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new Structures$PbBleDeviceName$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private volatile Object name_;

   private Structures$PbBleDeviceName() {
      this.memoizedIsInitialized = (byte)-1;
      this.name_ = "";
   }

   private Structures$PbBleDeviceName(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Structures$PbBleDeviceName(CodedInputStream var1, ExtensionRegistryLite var2, Structures$1 var3) {
      this(var1, var2);
   }

   private Structures$PbBleDeviceName(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Structures$PbBleDeviceName(Builder var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Structures$PbBleDeviceName var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Object a(Structures$PbBleDeviceName var0) {
      return var0.name_;
   }

   // $FF: synthetic method
   static Object a(Structures$PbBleDeviceName var0, Object var1) {
      var0.name_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(Structures$PbBleDeviceName var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static Structures$PbBleDeviceName getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Structures.s();
   }

   public static Structures$PbBleDeviceName$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Structures$PbBleDeviceName$Builder newBuilder(Structures$PbBleDeviceName var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Structures$PbBleDeviceName parseDelimitedFrom(InputStream var0) {
      return (Structures$PbBleDeviceName)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Structures$PbBleDeviceName parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbBleDeviceName)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbBleDeviceName parseFrom(ByteString var0) {
      return (Structures$PbBleDeviceName)PARSER.parseFrom(var0);
   }

   public static Structures$PbBleDeviceName parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Structures$PbBleDeviceName)PARSER.parseFrom(var0, var1);
   }

   public static Structures$PbBleDeviceName parseFrom(CodedInputStream var0) {
      return (Structures$PbBleDeviceName)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbBleDeviceName parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbBleDeviceName)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbBleDeviceName parseFrom(InputStream var0) {
      return (Structures$PbBleDeviceName)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbBleDeviceName parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbBleDeviceName)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbBleDeviceName parseFrom(byte[] var0) {
      return (Structures$PbBleDeviceName)PARSER.parseFrom(var0);
   }

   public static Structures$PbBleDeviceName parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Structures$PbBleDeviceName)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Structures$PbBleDeviceName)) {
            var2 = super.equals(var1);
         } else {
            Structures$PbBleDeviceName var5 = (Structures$PbBleDeviceName)var1;
            boolean var3;
            if (this.hasName() == var5.hasName()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasName()) {
               if (var3 && this.getName().equals(var5.getName())) {
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

   public Structures$PbBleDeviceName getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public String getName() {
      Object var1 = this.name_;
      String var3;
      if (var1 instanceof String) {
         var3 = (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.name_ = var3;
         }
      }

      return var3;
   }

   public ByteString getNameBytes() {
      Object var1 = this.name_;
      ByteString var2;
      if (var1 instanceof String) {
         var2 = ByteString.copyFromUtf8((String)var1);
         this.name_ = var2;
      } else {
         var2 = (ByteString)var1;
      }

      return var2;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + GeneratedMessageV3.computeStringSize(1, this.name_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasName() {
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
         if (this.hasName()) {
            var1 = (var2 * 37 + 1) * 53 + this.getName().hashCode();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.t().ensureFieldAccessorsInitialized(Structures$PbBleDeviceName.class, Structures$PbBleDeviceName$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasName()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Structures$PbBleDeviceName$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Structures$PbBleDeviceName$Builder newBuilderForType(BuilderParent var1) {
      return new Structures$PbBleDeviceName$Builder(var1, (Structures$1)null);
   }

   public Structures$PbBleDeviceName$Builder toBuilder() {
      Structures$PbBleDeviceName$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Structures$PbBleDeviceName$Builder((Structures$1)null);
      } else {
         var1 = (new Structures$PbBleDeviceName$Builder((Structures$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         GeneratedMessageV3.writeString(var1, 1, this.name_);
      }

      this.unknownFields.writeTo(var1);
   }
}
