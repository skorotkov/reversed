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

public final class Structures$PbHeartRateZone extends GeneratedMessageV3 implements Structures$PbHeartRateZoneOrBuilder {
   private static final Structures$PbHeartRateZone DEFAULT_INSTANCE = new Structures$PbHeartRateZone();
   public static final int HIGHER_LIMIT_FIELD_NUMBER = 2;
   public static final int LOWER_LIMIT_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new Structures$PbHeartRateZone$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int higherLimit_;
   private int lowerLimit_;
   private byte memoizedIsInitialized;

   private Structures$PbHeartRateZone() {
      this.memoizedIsInitialized = (byte)-1;
      this.lowerLimit_ = 0;
      this.higherLimit_ = 0;
   }

   private Structures$PbHeartRateZone(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Structures$PbHeartRateZone(CodedInputStream var1, ExtensionRegistryLite var2, Structures$1 var3) {
      this(var1, var2);
   }

   private Structures$PbHeartRateZone(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Structures$PbHeartRateZone(Builder var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Structures$PbHeartRateZone var0, int var1) {
      var0.lowerLimit_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Structures$PbHeartRateZone var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(Structures$PbHeartRateZone var0, int var1) {
      var0.higherLimit_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(Structures$PbHeartRateZone var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static Structures$PbHeartRateZone getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Structures.i();
   }

   public static Structures$PbHeartRateZone$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Structures$PbHeartRateZone$Builder newBuilder(Structures$PbHeartRateZone var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Structures$PbHeartRateZone parseDelimitedFrom(InputStream var0) {
      return (Structures$PbHeartRateZone)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Structures$PbHeartRateZone parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbHeartRateZone)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbHeartRateZone parseFrom(ByteString var0) {
      return (Structures$PbHeartRateZone)PARSER.parseFrom(var0);
   }

   public static Structures$PbHeartRateZone parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Structures$PbHeartRateZone)PARSER.parseFrom(var0, var1);
   }

   public static Structures$PbHeartRateZone parseFrom(CodedInputStream var0) {
      return (Structures$PbHeartRateZone)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbHeartRateZone parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbHeartRateZone)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbHeartRateZone parseFrom(InputStream var0) {
      return (Structures$PbHeartRateZone)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbHeartRateZone parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbHeartRateZone)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbHeartRateZone parseFrom(byte[] var0) {
      return (Structures$PbHeartRateZone)PARSER.parseFrom(var0);
   }

   public static Structures$PbHeartRateZone parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Structures$PbHeartRateZone)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Structures$PbHeartRateZone)) {
            var2 = super.equals(var1);
         } else {
            Structures$PbHeartRateZone var5 = (Structures$PbHeartRateZone)var1;
            boolean var3;
            if (this.hasLowerLimit() == var5.hasLowerLimit()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasLowerLimit()) {
               if (var3 && this.getLowerLimit() == var5.getLowerLimit()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasHigherLimit() == var5.hasHigherLimit()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasHigherLimit()) {
               if (var4 && this.getHigherLimit() == var5.getHigherLimit()) {
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

   public Structures$PbHeartRateZone getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public int getHigherLimit() {
      return this.higherLimit_;
   }

   public int getLowerLimit() {
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
            var1 = 0 + CodedOutputStream.computeUInt32Size(1, this.lowerLimit_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(2, this.higherLimit_);
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
            var1 = (var2 * 37 + 1) * 53 + this.getLowerLimit();
         }

         var2 = var1;
         if (this.hasHigherLimit()) {
            var2 = (var1 * 37 + 2) * 53 + this.getHigherLimit();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.j().ensureFieldAccessorsInitialized(Structures$PbHeartRateZone.class, Structures$PbHeartRateZone$Builder.class);
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

   public Structures$PbHeartRateZone$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Structures$PbHeartRateZone$Builder newBuilderForType(BuilderParent var1) {
      return new Structures$PbHeartRateZone$Builder(var1, (Structures$1)null);
   }

   public Structures$PbHeartRateZone$Builder toBuilder() {
      Structures$PbHeartRateZone$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Structures$PbHeartRateZone$Builder((Structures$1)null);
      } else {
         var1 = (new Structures$PbHeartRateZone$Builder((Structures$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.lowerLimit_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeUInt32(2, this.higherLimit_);
      }

      this.unknownFields.writeTo(var1);
   }
}
