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

public final class Structures$PbSwimmingPoolInfo extends GeneratedMessageV3 implements Structures$PbSwimmingPoolInfoOrBuilder {
   private static final Structures$PbSwimmingPoolInfo DEFAULT_INSTANCE = new Structures$PbSwimmingPoolInfo();
   @Deprecated
   public static final Parser PARSER = new Structures$PbSwimmingPoolInfo$1();
   public static final int POOL_LENGTH_FIELD_NUMBER = 1;
   public static final int SWIMMING_POOL_TYPE_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private float poolLength_;
   private int swimmingPoolType_;

   private Structures$PbSwimmingPoolInfo() {
      this.memoizedIsInitialized = (byte)-1;
      this.poolLength_ = 0.0F;
      this.swimmingPoolType_ = 0;
   }

   private Structures$PbSwimmingPoolInfo(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Structures$PbSwimmingPoolInfo(CodedInputStream var1, ExtensionRegistryLite var2, Structures$1 var3) {
      this(var1, var2);
   }

   private Structures$PbSwimmingPoolInfo(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Structures$PbSwimmingPoolInfo(Builder var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(Structures$PbSwimmingPoolInfo var0, float var1) {
      var0.poolLength_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(Structures$PbSwimmingPoolInfo var0, int var1) {
      var0.swimmingPoolType_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Structures$PbSwimmingPoolInfo var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(Structures$PbSwimmingPoolInfo var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static Structures$PbSwimmingPoolInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Structures.M();
   }

   public static Structures$PbSwimmingPoolInfo$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Structures$PbSwimmingPoolInfo$Builder newBuilder(Structures$PbSwimmingPoolInfo var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Structures$PbSwimmingPoolInfo parseDelimitedFrom(InputStream var0) {
      return (Structures$PbSwimmingPoolInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Structures$PbSwimmingPoolInfo parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbSwimmingPoolInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbSwimmingPoolInfo parseFrom(ByteString var0) {
      return (Structures$PbSwimmingPoolInfo)PARSER.parseFrom(var0);
   }

   public static Structures$PbSwimmingPoolInfo parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Structures$PbSwimmingPoolInfo)PARSER.parseFrom(var0, var1);
   }

   public static Structures$PbSwimmingPoolInfo parseFrom(CodedInputStream var0) {
      return (Structures$PbSwimmingPoolInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbSwimmingPoolInfo parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbSwimmingPoolInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbSwimmingPoolInfo parseFrom(InputStream var0) {
      return (Structures$PbSwimmingPoolInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbSwimmingPoolInfo parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbSwimmingPoolInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbSwimmingPoolInfo parseFrom(byte[] var0) {
      return (Structures$PbSwimmingPoolInfo)PARSER.parseFrom(var0);
   }

   public static Structures$PbSwimmingPoolInfo parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Structures$PbSwimmingPoolInfo)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Structures$PbSwimmingPoolInfo)) {
            var2 = super.equals(var1);
         } else {
            Structures$PbSwimmingPoolInfo var5 = (Structures$PbSwimmingPoolInfo)var1;
            boolean var3;
            if (this.hasPoolLength() == var5.hasPoolLength()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasPoolLength()) {
               if (var3 && Float.floatToIntBits(this.getPoolLength()) == Float.floatToIntBits(var5.getPoolLength())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSwimmingPoolType() == var5.hasSwimmingPoolType()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSwimmingPoolType()) {
               if (var4 && this.swimmingPoolType_ == var5.swimmingPoolType_) {
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

   public Structures$PbSwimmingPoolInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public float getPoolLength() {
      return this.poolLength_;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeFloatSize(1, this.poolLength_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeEnumSize(2, this.swimmingPoolType_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public Types$PbSwimmingPoolUnits getSwimmingPoolType() {
      Types$PbSwimmingPoolUnits var1 = Types$PbSwimmingPoolUnits.valueOf(this.swimmingPoolType_);
      Types$PbSwimmingPoolUnits var2 = var1;
      if (var1 == null) {
         var2 = Types$PbSwimmingPoolUnits.SWIMMING_POOL_METERS;
      }

      return var2;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasPoolLength() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSwimmingPoolType() {
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
         if (this.hasPoolLength()) {
            var1 = (var2 * 37 + 1) * 53 + Float.floatToIntBits(this.getPoolLength());
         }

         var2 = var1;
         if (this.hasSwimmingPoolType()) {
            var2 = (var1 * 37 + 2) * 53 + this.swimmingPoolType_;
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.N().ensureFieldAccessorsInitialized(Structures$PbSwimmingPoolInfo.class, Structures$PbSwimmingPoolInfo$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasSwimmingPoolType()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Structures$PbSwimmingPoolInfo$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Structures$PbSwimmingPoolInfo$Builder newBuilderForType(BuilderParent var1) {
      return new Structures$PbSwimmingPoolInfo$Builder(var1, (Structures$1)null);
   }

   public Structures$PbSwimmingPoolInfo$Builder toBuilder() {
      Structures$PbSwimmingPoolInfo$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Structures$PbSwimmingPoolInfo$Builder((Structures$1)null);
      } else {
         var1 = (new Structures$PbSwimmingPoolInfo$Builder((Structures$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeFloat(1, this.poolLength_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeEnum(2, this.swimmingPoolType_);
      }

      this.unknownFields.writeTo(var1);
   }
}
