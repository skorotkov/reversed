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

public final class ExerciseLap$PbLapPowerStatistics extends GeneratedMessageV3 implements ExerciseLap$PbLapPowerStatisticsOrBuilder {
   public static final int AVERAGE_FIELD_NUMBER = 1;
   private static final ExerciseLap$PbLapPowerStatistics DEFAULT_INSTANCE = new ExerciseLap$PbLapPowerStatistics();
   public static final int MAXIMUM_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new ExerciseLap$PbLapPowerStatistics$1();
   private static final long serialVersionUID = 0L;
   private int average_;
   private int bitField0_;
   private int maximum_;
   private byte memoizedIsInitialized;

   private ExerciseLap$PbLapPowerStatistics() {
      this.memoizedIsInitialized = (byte)-1;
      this.average_ = 0;
      this.maximum_ = 0;
   }

   private ExerciseLap$PbLapPowerStatistics(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseLap$PbLapPowerStatistics(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseLap$1 var3) {
      this(var1, var2);
   }

   private ExerciseLap$PbLapPowerStatistics(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseLap$PbLapPowerStatistics(Builder var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(ExerciseLap$PbLapPowerStatistics var0, int var1) {
      var0.average_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExerciseLap$PbLapPowerStatistics var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(ExerciseLap$PbLapPowerStatistics var0, int var1) {
      var0.maximum_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(ExerciseLap$PbLapPowerStatistics var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static ExerciseLap$PbLapPowerStatistics getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.k();
   }

   public static ExerciseLap$PbLapPowerStatistics$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseLap$PbLapPowerStatistics$Builder newBuilder(ExerciseLap$PbLapPowerStatistics var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseLap$PbLapPowerStatistics parseDelimitedFrom(InputStream var0) {
      return (ExerciseLap$PbLapPowerStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLapPowerStatistics parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapPowerStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLapPowerStatistics parseFrom(ByteString var0) {
      return (ExerciseLap$PbLapPowerStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseLap$PbLapPowerStatistics parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapPowerStatistics)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseLap$PbLapPowerStatistics parseFrom(CodedInputStream var0) {
      return (ExerciseLap$PbLapPowerStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLapPowerStatistics parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapPowerStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLapPowerStatistics parseFrom(InputStream var0) {
      return (ExerciseLap$PbLapPowerStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLapPowerStatistics parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapPowerStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLapPowerStatistics parseFrom(byte[] var0) {
      return (ExerciseLap$PbLapPowerStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseLap$PbLapPowerStatistics parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapPowerStatistics)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseLap$PbLapPowerStatistics)) {
            var2 = super.equals(var1);
         } else {
            ExerciseLap$PbLapPowerStatistics var5 = (ExerciseLap$PbLapPowerStatistics)var1;
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

   public ExerciseLap$PbLapPowerStatistics getDefaultInstanceForType() {
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
            var1 = 0 + CodedOutputStream.computeInt32Size(1, this.average_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeInt32Size(2, this.maximum_);
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
      return ExerciseLap.l().ensureFieldAccessorsInitialized(ExerciseLap$PbLapPowerStatistics.class, ExerciseLap$PbLapPowerStatistics$Builder.class);
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

   public ExerciseLap$PbLapPowerStatistics$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseLap$PbLapPowerStatistics$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseLap$PbLapPowerStatistics$Builder(var1, (ExerciseLap$1)null);
   }

   public ExerciseLap$PbLapPowerStatistics$Builder toBuilder() {
      ExerciseLap$PbLapPowerStatistics$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseLap$PbLapPowerStatistics$Builder((ExerciseLap$1)null);
      } else {
         var1 = (new ExerciseLap$PbLapPowerStatistics$Builder((ExerciseLap$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeInt32(1, this.average_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeInt32(2, this.maximum_);
      }

      this.unknownFields.writeTo(var1);
   }
}
