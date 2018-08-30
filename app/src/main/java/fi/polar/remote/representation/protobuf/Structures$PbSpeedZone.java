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

public final class Structures$PbSpeedZone extends GeneratedMessageV3 implements Structures$PbSpeedZoneOrBuilder {
   private static final Structures$PbSpeedZone DEFAULT_INSTANCE = new Structures$PbSpeedZone();
   public static final int HIGHER_LIMIT_FIELD_NUMBER = 2;
   public static final int LOWER_LIMIT_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new Structures$PbSpeedZone$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private float higherLimit_;
   private float lowerLimit_;
   private byte memoizedIsInitialized;

   private Structures$PbSpeedZone() {
      this.memoizedIsInitialized = (byte)-1;
      this.lowerLimit_ = 0.0F;
      this.higherLimit_ = 0.0F;
   }

   private Structures$PbSpeedZone(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Structures$PbSpeedZone(CodedInputStream var1, ExtensionRegistryLite var2, Structures$1 var3) {
      this(var1, var2);
   }

   private Structures$PbSpeedZone(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Structures$PbSpeedZone(Builder var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(Structures$PbSpeedZone var0, float var1) {
      var0.lowerLimit_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(Structures$PbSpeedZone var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Structures$PbSpeedZone var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static float b(Structures$PbSpeedZone var0, float var1) {
      var0.higherLimit_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static Structures$PbSpeedZone getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Structures.k();
   }

   public static Structures$PbSpeedZone$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Structures$PbSpeedZone$Builder newBuilder(Structures$PbSpeedZone var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Structures$PbSpeedZone parseDelimitedFrom(InputStream var0) {
      return (Structures$PbSpeedZone)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Structures$PbSpeedZone parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbSpeedZone)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbSpeedZone parseFrom(ByteString var0) {
      return (Structures$PbSpeedZone)PARSER.parseFrom(var0);
   }

   public static Structures$PbSpeedZone parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Structures$PbSpeedZone)PARSER.parseFrom(var0, var1);
   }

   public static Structures$PbSpeedZone parseFrom(CodedInputStream var0) {
      return (Structures$PbSpeedZone)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbSpeedZone parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbSpeedZone)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbSpeedZone parseFrom(InputStream var0) {
      return (Structures$PbSpeedZone)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbSpeedZone parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbSpeedZone)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbSpeedZone parseFrom(byte[] var0) {
      return (Structures$PbSpeedZone)PARSER.parseFrom(var0);
   }

   public static Structures$PbSpeedZone parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Structures$PbSpeedZone)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Structures$PbSpeedZone)) {
            var2 = super.equals(var1);
         } else {
            Structures$PbSpeedZone var5 = (Structures$PbSpeedZone)var1;
            boolean var3;
            if (this.hasLowerLimit() == var5.hasLowerLimit()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasLowerLimit()) {
               if (var3 && Float.floatToIntBits(this.getLowerLimit()) == Float.floatToIntBits(var5.getLowerLimit())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasHigherLimit() == var5.hasHigherLimit()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasHigherLimit()) {
               if (var3 && Float.floatToIntBits(this.getHigherLimit()) == Float.floatToIntBits(var5.getHigherLimit())) {
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

   public Structures$PbSpeedZone getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public float getHigherLimit() {
      return this.higherLimit_;
   }

   public float getLowerLimit() {
      return this.lowerLimit_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeFloatSize(1, this.lowerLimit_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeFloatSize(2, this.higherLimit_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasHigherLimit() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLowerLimit() {
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
         if (this.hasLowerLimit()) {
            var1 = (var2 * 37 + 1) * 53 + Float.floatToIntBits(this.getLowerLimit());
         }

         var2 = var1;
         if (this.hasHigherLimit()) {
            var2 = (var1 * 37 + 2) * 53 + Float.floatToIntBits(this.getHigherLimit());
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.l().ensureFieldAccessorsInitialized(Structures$PbSpeedZone.class, Structures$PbSpeedZone$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasLowerLimit()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasHigherLimit()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Structures$PbSpeedZone$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Structures$PbSpeedZone$Builder newBuilderForType(BuilderParent var1) {
      return new Structures$PbSpeedZone$Builder(var1, (Structures$1)null);
   }

   public Structures$PbSpeedZone$Builder toBuilder() {
      Structures$PbSpeedZone$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Structures$PbSpeedZone$Builder((Structures$1)null);
      } else {
         var1 = (new Structures$PbSpeedZone$Builder((Structures$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeFloat(1, this.lowerLimit_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeFloat(2, this.higherLimit_);
      }

      this.unknownFields.writeTo(var1);
   }
}
