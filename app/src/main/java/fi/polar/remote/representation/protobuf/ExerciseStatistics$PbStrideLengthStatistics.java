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

public final class ExerciseStatistics$PbStrideLengthStatistics extends GeneratedMessageV3 implements ExerciseStatistics$PbStrideLengthStatisticsOrBuilder {
   public static final int AVERAGE_FIELD_NUMBER = 1;
   private static final ExerciseStatistics$PbStrideLengthStatistics DEFAULT_INSTANCE = new ExerciseStatistics$PbStrideLengthStatistics();
   public static final int MAXIMUM_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new ExerciseStatistics$PbStrideLengthStatistics$1();
   private static final long serialVersionUID = 0L;
   private int average_;
   private int bitField0_;
   private int maximum_;
   private byte memoizedIsInitialized;

   private ExerciseStatistics$PbStrideLengthStatistics() {
      this.memoizedIsInitialized = (byte)-1;
      this.average_ = 0;
      this.maximum_ = 0;
   }

   private ExerciseStatistics$PbStrideLengthStatistics(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseStatistics$PbStrideLengthStatistics(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseStatistics$1 var3) {
      this(var1, var2);
   }

   private ExerciseStatistics$PbStrideLengthStatistics(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseStatistics$PbStrideLengthStatistics(Builder var1, ExerciseStatistics$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(ExerciseStatistics$PbStrideLengthStatistics var0, int var1) {
      var0.average_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExerciseStatistics$PbStrideLengthStatistics var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(ExerciseStatistics$PbStrideLengthStatistics var0, int var1) {
      var0.maximum_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(ExerciseStatistics$PbStrideLengthStatistics var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static ExerciseStatistics$PbStrideLengthStatistics getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseStatistics.y();
   }

   public static ExerciseStatistics$PbStrideLengthStatistics$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseStatistics$PbStrideLengthStatistics$Builder newBuilder(ExerciseStatistics$PbStrideLengthStatistics var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseStatistics$PbStrideLengthStatistics parseDelimitedFrom(InputStream var0) {
      return (ExerciseStatistics$PbStrideLengthStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseStatistics$PbStrideLengthStatistics parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbStrideLengthStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseStatistics$PbStrideLengthStatistics parseFrom(ByteString var0) {
      return (ExerciseStatistics$PbStrideLengthStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseStatistics$PbStrideLengthStatistics parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbStrideLengthStatistics)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseStatistics$PbStrideLengthStatistics parseFrom(CodedInputStream var0) {
      return (ExerciseStatistics$PbStrideLengthStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseStatistics$PbStrideLengthStatistics parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbStrideLengthStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseStatistics$PbStrideLengthStatistics parseFrom(InputStream var0) {
      return (ExerciseStatistics$PbStrideLengthStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseStatistics$PbStrideLengthStatistics parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbStrideLengthStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseStatistics$PbStrideLengthStatistics parseFrom(byte[] var0) {
      return (ExerciseStatistics$PbStrideLengthStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseStatistics$PbStrideLengthStatistics parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbStrideLengthStatistics)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseStatistics$PbStrideLengthStatistics)) {
            var2 = super.equals(var1);
         } else {
            ExerciseStatistics$PbStrideLengthStatistics var5 = (ExerciseStatistics$PbStrideLengthStatistics)var1;
            boolean var3;
            if (this.hasAverage() == var5.hasAverage()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasAverage()) {
               if (var3 && this.getAverage() == var5.getAverage()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasMaximum() == var5.hasMaximum()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasMaximum()) {
               if (var3 && this.getMaximum() == var5.getMaximum()) {
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

   public int getAverage() {
      return this.average_;
   }

   public ExerciseStatistics$PbStrideLengthStatistics getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public int getMaximum() {
      return this.maximum_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeUInt32Size(1, this.average_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(2, this.maximum_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasAverage() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMaximum() {
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
         if (this.hasAverage()) {
            var1 = (var2 * 37 + 1) * 53 + this.getAverage();
         }

         var2 = var1;
         if (this.hasMaximum()) {
            var2 = (var1 * 37 + 2) * 53 + this.getMaximum();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseStatistics.z().ensureFieldAccessorsInitialized(ExerciseStatistics$PbStrideLengthStatistics.class, ExerciseStatistics$PbStrideLengthStatistics$Builder.class);
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

   public ExerciseStatistics$PbStrideLengthStatistics$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseStatistics$PbStrideLengthStatistics$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseStatistics$PbStrideLengthStatistics$Builder(var1, (ExerciseStatistics$1)null);
   }

   public ExerciseStatistics$PbStrideLengthStatistics$Builder toBuilder() {
      ExerciseStatistics$PbStrideLengthStatistics$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseStatistics$PbStrideLengthStatistics$Builder((ExerciseStatistics$1)null);
      } else {
         var1 = (new ExerciseStatistics$PbStrideLengthStatistics$Builder((ExerciseStatistics$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.average_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeUInt32(2, this.maximum_);
      }

      this.unknownFields.writeTo(var1);
   }
}
