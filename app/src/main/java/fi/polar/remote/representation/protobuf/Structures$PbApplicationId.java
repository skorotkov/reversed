package fi.polar.remote.representation.protobuf;

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

public final class Structures$PbApplicationId extends GeneratedMessageV3 implements Structures$PbApplicationIdOrBuilder {
   private static final Structures$PbApplicationId DEFAULT_INSTANCE = new Structures$PbApplicationId();
   @Deprecated
   public static final Parser PARSER = new Structures$PbApplicationId$1();
   public static final int VALUE_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private long value_;

   private Structures$PbApplicationId() {
      this.memoizedIsInitialized = (byte)-1;
      this.value_ = 0L;
   }

   private Structures$PbApplicationId(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Structures$PbApplicationId(CodedInputStream var1, ExtensionRegistryLite var2, Structures$1 var3) {
      this(var1, var2);
   }

   private Structures$PbApplicationId(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Structures$PbApplicationId(Builder var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Structures$PbApplicationId var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static long a(Structures$PbApplicationId var0, long var1) {
      var0.value_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Structures$PbApplicationId var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static Structures$PbApplicationId getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Structures.U();
   }

   public static Structures$PbApplicationId$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Structures$PbApplicationId$Builder newBuilder(Structures$PbApplicationId var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Structures$PbApplicationId parseDelimitedFrom(InputStream var0) {
      return (Structures$PbApplicationId)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Structures$PbApplicationId parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbApplicationId)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbApplicationId parseFrom(ByteString var0) {
      return (Structures$PbApplicationId)PARSER.parseFrom(var0);
   }

   public static Structures$PbApplicationId parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Structures$PbApplicationId)PARSER.parseFrom(var0, var1);
   }

   public static Structures$PbApplicationId parseFrom(CodedInputStream var0) {
      return (Structures$PbApplicationId)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbApplicationId parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbApplicationId)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbApplicationId parseFrom(InputStream var0) {
      return (Structures$PbApplicationId)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbApplicationId parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbApplicationId)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbApplicationId parseFrom(byte[] var0) {
      return (Structures$PbApplicationId)PARSER.parseFrom(var0);
   }

   public static Structures$PbApplicationId parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Structures$PbApplicationId)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Structures$PbApplicationId)) {
            var2 = super.equals(var1);
         } else {
            Structures$PbApplicationId var5 = (Structures$PbApplicationId)var1;
            boolean var3;
            if (this.hasValue() == var5.hasValue()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasValue()) {
               if (var3 && this.getValue() == var5.getValue()) {
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

   public Structures$PbApplicationId getDefaultInstanceForType() {
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
            var1 = 0 + CodedOutputStream.computeUInt64Size(1, this.value_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public long getValue() {
      return this.value_;
   }

   public boolean hasValue() {
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
         if (this.hasValue()) {
            var1 = (var2 * 37 + 1) * 53 + Internal.hashLong(this.getValue());
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.V().ensureFieldAccessorsInitialized(Structures$PbApplicationId.class, Structures$PbApplicationId$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasValue()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Structures$PbApplicationId$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Structures$PbApplicationId$Builder newBuilderForType(BuilderParent var1) {
      return new Structures$PbApplicationId$Builder(var1, (Structures$1)null);
   }

   public Structures$PbApplicationId$Builder toBuilder() {
      Structures$PbApplicationId$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Structures$PbApplicationId$Builder((Structures$1)null);
      } else {
         var1 = (new Structures$PbApplicationId$Builder((Structures$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt64(1, this.value_);
      }

      this.unknownFields.writeTo(var1);
   }
}
