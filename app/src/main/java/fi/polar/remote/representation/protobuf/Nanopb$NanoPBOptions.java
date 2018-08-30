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

public final class Nanopb$NanoPBOptions extends GeneratedMessageV3 implements Nanopb$NanoPBOptionsOrBuilder {
   private static final Nanopb$NanoPBOptions DEFAULT_INSTANCE = new Nanopb$NanoPBOptions();
   public static final int MAX_COUNT_FIELD_NUMBER = 2;
   public static final int MAX_SIZE_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new Nanopb$NanoPBOptions$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int maxCount_;
   private int maxSize_;
   private byte memoizedIsInitialized;

   private Nanopb$NanoPBOptions() {
      this.memoizedIsInitialized = (byte)-1;
      this.maxSize_ = 0;
      this.maxCount_ = 0;
   }

   private Nanopb$NanoPBOptions(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Nanopb$NanoPBOptions(CodedInputStream var1, ExtensionRegistryLite var2, Nanopb$1 var3) {
      this(var1, var2);
   }

   private Nanopb$NanoPBOptions(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Nanopb$NanoPBOptions(Builder var1, Nanopb$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Nanopb$NanoPBOptions var0, int var1) {
      var0.maxSize_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Nanopb$NanoPBOptions var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(Nanopb$NanoPBOptions var0, int var1) {
      var0.maxCount_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(Nanopb$NanoPBOptions var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static Nanopb$NanoPBOptions getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Nanopb.a();
   }

   public static Nanopb$NanoPBOptions$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Nanopb$NanoPBOptions$Builder newBuilder(Nanopb$NanoPBOptions var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Nanopb$NanoPBOptions parseDelimitedFrom(InputStream var0) {
      return (Nanopb$NanoPBOptions)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Nanopb$NanoPBOptions parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Nanopb$NanoPBOptions)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Nanopb$NanoPBOptions parseFrom(ByteString var0) {
      return (Nanopb$NanoPBOptions)PARSER.parseFrom(var0);
   }

   public static Nanopb$NanoPBOptions parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Nanopb$NanoPBOptions)PARSER.parseFrom(var0, var1);
   }

   public static Nanopb$NanoPBOptions parseFrom(CodedInputStream var0) {
      return (Nanopb$NanoPBOptions)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Nanopb$NanoPBOptions parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Nanopb$NanoPBOptions)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Nanopb$NanoPBOptions parseFrom(InputStream var0) {
      return (Nanopb$NanoPBOptions)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Nanopb$NanoPBOptions parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Nanopb$NanoPBOptions)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Nanopb$NanoPBOptions parseFrom(byte[] var0) {
      return (Nanopb$NanoPBOptions)PARSER.parseFrom(var0);
   }

   public static Nanopb$NanoPBOptions parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Nanopb$NanoPBOptions)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Nanopb$NanoPBOptions)) {
            var2 = super.equals(var1);
         } else {
            Nanopb$NanoPBOptions var5 = (Nanopb$NanoPBOptions)var1;
            boolean var3;
            if (this.hasMaxSize() == var5.hasMaxSize()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasMaxSize()) {
               if (var3 && this.getMaxSize() == var5.getMaxSize()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasMaxCount() == var5.hasMaxCount()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasMaxCount()) {
               if (var3 && this.getMaxCount() == var5.getMaxCount()) {
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

   public Nanopb$NanoPBOptions getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public int getMaxCount() {
      return this.maxCount_;
   }

   public int getMaxSize() {
      return this.maxSize_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeInt32Size(1, this.maxSize_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeInt32Size(2, this.maxCount_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasMaxCount() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMaxSize() {
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
         if (this.hasMaxSize()) {
            var1 = (var2 * 37 + 1) * 53 + this.getMaxSize();
         }

         var2 = var1;
         if (this.hasMaxCount()) {
            var2 = (var1 * 37 + 2) * 53 + this.getMaxCount();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Nanopb.b().ensureFieldAccessorsInitialized(Nanopb$NanoPBOptions.class, Nanopb$NanoPBOptions$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Nanopb$NanoPBOptions$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Nanopb$NanoPBOptions$Builder newBuilderForType(BuilderParent var1) {
      return new Nanopb$NanoPBOptions$Builder(var1, (Nanopb$1)null);
   }

   public Nanopb$NanoPBOptions$Builder toBuilder() {
      Nanopb$NanoPBOptions$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Nanopb$NanoPBOptions$Builder((Nanopb$1)null);
      } else {
         var1 = (new Nanopb$NanoPBOptions$Builder((Nanopb$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeInt32(1, this.maxSize_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeInt32(2, this.maxCount_);
      }

      this.unknownFields.writeTo(var1);
   }
}
