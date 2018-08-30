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

public final class ExerciseLap$PbLapPedalingEfficiencyStatistics extends GeneratedMessageV3 implements ExerciseLap$PbLapPedalingEfficiencyStatisticsOrBuilder {
   public static final int AVERAGE_FIELD_NUMBER = 1;
   private static final ExerciseLap$PbLapPedalingEfficiencyStatistics DEFAULT_INSTANCE = new ExerciseLap$PbLapPedalingEfficiencyStatistics();
   @Deprecated
   public static final Parser PARSER = new ExerciseLap$PbLapPedalingEfficiencyStatistics$1();
   private static final long serialVersionUID = 0L;
   private int average_;
   private int bitField0_;
   private byte memoizedIsInitialized;

   private ExerciseLap$PbLapPedalingEfficiencyStatistics() {
      this.memoizedIsInitialized = (byte)-1;
      this.average_ = 0;
   }

   private ExerciseLap$PbLapPedalingEfficiencyStatistics(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseLap$PbLapPedalingEfficiencyStatistics(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseLap$1 var3) {
      this(var1, var2);
   }

   private ExerciseLap$PbLapPedalingEfficiencyStatistics(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseLap$PbLapPedalingEfficiencyStatistics(Builder var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(ExerciseLap$PbLapPedalingEfficiencyStatistics var0, int var1) {
      var0.average_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExerciseLap$PbLapPedalingEfficiencyStatistics var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(ExerciseLap$PbLapPedalingEfficiencyStatistics var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static ExerciseLap$PbLapPedalingEfficiencyStatistics getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.q();
   }

   public static ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder newBuilder(ExerciseLap$PbLapPedalingEfficiencyStatistics var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseLap$PbLapPedalingEfficiencyStatistics parseDelimitedFrom(InputStream var0) {
      return (ExerciseLap$PbLapPedalingEfficiencyStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLapPedalingEfficiencyStatistics parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapPedalingEfficiencyStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLapPedalingEfficiencyStatistics parseFrom(ByteString var0) {
      return (ExerciseLap$PbLapPedalingEfficiencyStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseLap$PbLapPedalingEfficiencyStatistics parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapPedalingEfficiencyStatistics)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseLap$PbLapPedalingEfficiencyStatistics parseFrom(CodedInputStream var0) {
      return (ExerciseLap$PbLapPedalingEfficiencyStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLapPedalingEfficiencyStatistics parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapPedalingEfficiencyStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLapPedalingEfficiencyStatistics parseFrom(InputStream var0) {
      return (ExerciseLap$PbLapPedalingEfficiencyStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLapPedalingEfficiencyStatistics parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapPedalingEfficiencyStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLapPedalingEfficiencyStatistics parseFrom(byte[] var0) {
      return (ExerciseLap$PbLapPedalingEfficiencyStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseLap$PbLapPedalingEfficiencyStatistics parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapPedalingEfficiencyStatistics)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseLap$PbLapPedalingEfficiencyStatistics)) {
            var2 = super.equals(var1);
         } else {
            ExerciseLap$PbLapPedalingEfficiencyStatistics var5 = (ExerciseLap$PbLapPedalingEfficiencyStatistics)var1;
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

   public ExerciseLap$PbLapPedalingEfficiencyStatistics getDefaultInstanceForType() {
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
            var1 = 0 + CodedOutputStream.computeUInt32Size(1, this.average_);
         }

         var1 += this.unknownFields.getSerializedSize();
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

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseLap.r().ensureFieldAccessorsInitialized(ExerciseLap$PbLapPedalingEfficiencyStatistics.class, ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder.class);
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

   public ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder(var1, (ExerciseLap$1)null);
   }

   public ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder toBuilder() {
      ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder((ExerciseLap$1)null);
      } else {
         var1 = (new ExerciseLap$PbLapPedalingEfficiencyStatistics$Builder((ExerciseLap$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.average_);
      }

      this.unknownFields.writeTo(var1);
   }
}
