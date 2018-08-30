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

public final class ExerciseStatistics$PbPedalingEfficiencyStatistics extends GeneratedMessageV3 implements ExerciseStatistics$PbPedalingEfficiencyStatisticsOrBuilder {
   public static final int AVERAGE_FIELD_NUMBER = 1;
   private static final ExerciseStatistics$PbPedalingEfficiencyStatistics DEFAULT_INSTANCE = new ExerciseStatistics$PbPedalingEfficiencyStatistics();
   @Deprecated
   public static final Parser PARSER = new ExerciseStatistics$PbPedalingEfficiencyStatistics$1();
   private static final long serialVersionUID = 0L;
   private int average_;
   private int bitField0_;
   private byte memoizedIsInitialized;

   private ExerciseStatistics$PbPedalingEfficiencyStatistics() {
      this.memoizedIsInitialized = (byte)-1;
      this.average_ = 0;
   }

   private ExerciseStatistics$PbPedalingEfficiencyStatistics(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseStatistics$PbPedalingEfficiencyStatistics(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseStatistics$1 var3) {
      this(var1, var2);
   }

   private ExerciseStatistics$PbPedalingEfficiencyStatistics(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseStatistics$PbPedalingEfficiencyStatistics(Builder var1, ExerciseStatistics$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(ExerciseStatistics$PbPedalingEfficiencyStatistics var0, int var1) {
      var0.average_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExerciseStatistics$PbPedalingEfficiencyStatistics var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(ExerciseStatistics$PbPedalingEfficiencyStatistics var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static ExerciseStatistics$PbPedalingEfficiencyStatistics getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseStatistics.q();
   }

   public static ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder newBuilder(ExerciseStatistics$PbPedalingEfficiencyStatistics var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseStatistics$PbPedalingEfficiencyStatistics parseDelimitedFrom(InputStream var0) {
      return (ExerciseStatistics$PbPedalingEfficiencyStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseStatistics$PbPedalingEfficiencyStatistics parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbPedalingEfficiencyStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseStatistics$PbPedalingEfficiencyStatistics parseFrom(ByteString var0) {
      return (ExerciseStatistics$PbPedalingEfficiencyStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseStatistics$PbPedalingEfficiencyStatistics parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbPedalingEfficiencyStatistics)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseStatistics$PbPedalingEfficiencyStatistics parseFrom(CodedInputStream var0) {
      return (ExerciseStatistics$PbPedalingEfficiencyStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseStatistics$PbPedalingEfficiencyStatistics parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbPedalingEfficiencyStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseStatistics$PbPedalingEfficiencyStatistics parseFrom(InputStream var0) {
      return (ExerciseStatistics$PbPedalingEfficiencyStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseStatistics$PbPedalingEfficiencyStatistics parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbPedalingEfficiencyStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseStatistics$PbPedalingEfficiencyStatistics parseFrom(byte[] var0) {
      return (ExerciseStatistics$PbPedalingEfficiencyStatistics)PARSER.parseFrom(var0);
   }

   public static ExerciseStatistics$PbPedalingEfficiencyStatistics parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseStatistics$PbPedalingEfficiencyStatistics)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseStatistics$PbPedalingEfficiencyStatistics)) {
            var2 = super.equals(var1);
         } else {
            ExerciseStatistics$PbPedalingEfficiencyStatistics var5 = (ExerciseStatistics$PbPedalingEfficiencyStatistics)var1;
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

   public ExerciseStatistics$PbPedalingEfficiencyStatistics getDefaultInstanceForType() {
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
      return ExerciseStatistics.r().ensureFieldAccessorsInitialized(ExerciseStatistics$PbPedalingEfficiencyStatistics.class, ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder.class);
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

   public ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder(var1, (ExerciseStatistics$1)null);
   }

   public ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder toBuilder() {
      ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder((ExerciseStatistics$1)null);
      } else {
         var1 = (new ExerciseStatistics$PbPedalingEfficiencyStatistics$Builder((ExerciseStatistics$1)null)).mergeFrom(this);
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
