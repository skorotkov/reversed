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

public final class ExercisePhaseStats$PbPhaseStrideLengthStatistics extends GeneratedMessageV3 implements ExercisePhaseStats$PbPhaseStrideLengthStatisticsOrBuilder {
   public static final int AVERAGE_FIELD_NUMBER = 1;
   private static final ExercisePhaseStats$PbPhaseStrideLengthStatistics DEFAULT_INSTANCE = new ExercisePhaseStats$PbPhaseStrideLengthStatistics();
   @Deprecated
   public static final Parser PARSER = new ExercisePhaseStats$PbPhaseStrideLengthStatistics$1();
   private static final long serialVersionUID = 0L;
   private int average_;
   private int bitField0_;
   private byte memoizedIsInitialized;

   private ExercisePhaseStats$PbPhaseStrideLengthStatistics() {
      this.memoizedIsInitialized = (byte)-1;
      this.average_ = 0;
   }

   private ExercisePhaseStats$PbPhaseStrideLengthStatistics(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExercisePhaseStats$PbPhaseStrideLengthStatistics(CodedInputStream var1, ExtensionRegistryLite var2, ExercisePhaseStats$1 var3) {
      this(var1, var2);
   }

   private ExercisePhaseStats$PbPhaseStrideLengthStatistics(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExercisePhaseStats$PbPhaseStrideLengthStatistics(Builder var1, ExercisePhaseStats$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(ExercisePhaseStats$PbPhaseStrideLengthStatistics var0, int var1) {
      var0.average_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExercisePhaseStats$PbPhaseStrideLengthStatistics var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(ExercisePhaseStats$PbPhaseStrideLengthStatistics var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static ExercisePhaseStats$PbPhaseStrideLengthStatistics getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExercisePhaseStats.c();
   }

   public static ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder newBuilder(ExercisePhaseStats$PbPhaseStrideLengthStatistics var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExercisePhaseStats$PbPhaseStrideLengthStatistics parseDelimitedFrom(InputStream var0) {
      return (ExercisePhaseStats$PbPhaseStrideLengthStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExercisePhaseStats$PbPhaseStrideLengthStatistics parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExercisePhaseStats$PbPhaseStrideLengthStatistics)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExercisePhaseStats$PbPhaseStrideLengthStatistics parseFrom(ByteString var0) {
      return (ExercisePhaseStats$PbPhaseStrideLengthStatistics)PARSER.parseFrom(var0);
   }

   public static ExercisePhaseStats$PbPhaseStrideLengthStatistics parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExercisePhaseStats$PbPhaseStrideLengthStatistics)PARSER.parseFrom(var0, var1);
   }

   public static ExercisePhaseStats$PbPhaseStrideLengthStatistics parseFrom(CodedInputStream var0) {
      return (ExercisePhaseStats$PbPhaseStrideLengthStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExercisePhaseStats$PbPhaseStrideLengthStatistics parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExercisePhaseStats$PbPhaseStrideLengthStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExercisePhaseStats$PbPhaseStrideLengthStatistics parseFrom(InputStream var0) {
      return (ExercisePhaseStats$PbPhaseStrideLengthStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExercisePhaseStats$PbPhaseStrideLengthStatistics parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExercisePhaseStats$PbPhaseStrideLengthStatistics)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExercisePhaseStats$PbPhaseStrideLengthStatistics parseFrom(byte[] var0) {
      return (ExercisePhaseStats$PbPhaseStrideLengthStatistics)PARSER.parseFrom(var0);
   }

   public static ExercisePhaseStats$PbPhaseStrideLengthStatistics parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExercisePhaseStats$PbPhaseStrideLengthStatistics)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExercisePhaseStats$PbPhaseStrideLengthStatistics)) {
            var2 = super.equals(var1);
         } else {
            ExercisePhaseStats$PbPhaseStrideLengthStatistics var5 = (ExercisePhaseStats$PbPhaseStrideLengthStatistics)var1;
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

   public ExercisePhaseStats$PbPhaseStrideLengthStatistics getDefaultInstanceForType() {
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
      return ExercisePhaseStats.d().ensureFieldAccessorsInitialized(ExercisePhaseStats$PbPhaseStrideLengthStatistics.class, ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder.class);
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

   public ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder newBuilderForType(BuilderParent var1) {
      return new ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder(var1, (ExercisePhaseStats$1)null);
   }

   public ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder toBuilder() {
      ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder((ExercisePhaseStats$1)null);
      } else {
         var1 = (new ExercisePhaseStats$PbPhaseStrideLengthStatistics$Builder((ExercisePhaseStats$1)null)).mergeFrom(this);
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
