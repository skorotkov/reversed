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

public final class Structures$PbRunningIndex extends GeneratedMessageV3 implements Structures$PbRunningIndexOrBuilder {
   public static final int CALCULATION_TIME_FIELD_NUMBER = 2;
   private static final Structures$PbRunningIndex DEFAULT_INSTANCE = new Structures$PbRunningIndex();
   @Deprecated
   public static final Parser PARSER = new Structures$PbRunningIndex$1();
   public static final int VALUE_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private Types$PbDuration calculationTime_;
   private byte memoizedIsInitialized;
   private int value_;

   private Structures$PbRunningIndex() {
      this.memoizedIsInitialized = (byte)-1;
      this.value_ = 0;
   }

   private Structures$PbRunningIndex(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Structures$PbRunningIndex(CodedInputStream var1, ExtensionRegistryLite var2, Structures$1 var3) {
      this(var1, var2);
   }

   private Structures$PbRunningIndex(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Structures$PbRunningIndex(Builder var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Structures$PbRunningIndex var0, int var1) {
      var0.value_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Structures$PbRunningIndex var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbDuration a(Structures$PbRunningIndex var0, Types$PbDuration var1) {
      var0.calculationTime_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(Structures$PbRunningIndex var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static Structures$PbRunningIndex getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Structures.w();
   }

   public static Structures$PbRunningIndex$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Structures$PbRunningIndex$Builder newBuilder(Structures$PbRunningIndex var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Structures$PbRunningIndex parseDelimitedFrom(InputStream var0) {
      return (Structures$PbRunningIndex)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Structures$PbRunningIndex parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbRunningIndex)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbRunningIndex parseFrom(ByteString var0) {
      return (Structures$PbRunningIndex)PARSER.parseFrom(var0);
   }

   public static Structures$PbRunningIndex parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Structures$PbRunningIndex)PARSER.parseFrom(var0, var1);
   }

   public static Structures$PbRunningIndex parseFrom(CodedInputStream var0) {
      return (Structures$PbRunningIndex)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbRunningIndex parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbRunningIndex)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbRunningIndex parseFrom(InputStream var0) {
      return (Structures$PbRunningIndex)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbRunningIndex parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbRunningIndex)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbRunningIndex parseFrom(byte[] var0) {
      return (Structures$PbRunningIndex)PARSER.parseFrom(var0);
   }

   public static Structures$PbRunningIndex parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Structures$PbRunningIndex)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Structures$PbRunningIndex)) {
            var2 = super.equals(var1);
         } else {
            Structures$PbRunningIndex var5 = (Structures$PbRunningIndex)var1;
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

            if (var4 && this.hasCalculationTime() == var5.hasCalculationTime()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasCalculationTime()) {
               if (var4 && this.getCalculationTime().equals(var5.getCalculationTime())) {
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

   public Types$PbDuration getCalculationTime() {
      Types$PbDuration var1;
      if (this.calculationTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.calculationTime_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getCalculationTimeOrBuilder() {
      Types$PbDuration var1;
      if (this.calculationTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.calculationTime_;
      }

      return var1;
   }

   public Structures$PbRunningIndex getDefaultInstanceForType() {
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
            var1 = 0 + CodedOutputStream.computeUInt32Size(1, this.value_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeMessageSize(2, this.getCalculationTime());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public int getValue() {
      return this.value_;
   }

   public boolean hasCalculationTime() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
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
            var1 = (var2 * 37 + 1) * 53 + this.getValue();
         }

         var2 = var1;
         if (this.hasCalculationTime()) {
            var2 = (var1 * 37 + 2) * 53 + this.getCalculationTime().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.x().ensureFieldAccessorsInitialized(Structures$PbRunningIndex.class, Structures$PbRunningIndex$Builder.class);
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

   public Structures$PbRunningIndex$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Structures$PbRunningIndex$Builder newBuilderForType(BuilderParent var1) {
      return new Structures$PbRunningIndex$Builder(var1, (Structures$1)null);
   }

   public Structures$PbRunningIndex$Builder toBuilder() {
      Structures$PbRunningIndex$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Structures$PbRunningIndex$Builder((Structures$1)null);
      } else {
         var1 = (new Structures$PbRunningIndex$Builder((Structures$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.value_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getCalculationTime());
      }

      this.unknownFields.writeTo(var1);
   }
}
