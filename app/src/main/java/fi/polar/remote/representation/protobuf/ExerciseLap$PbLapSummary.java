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

public final class ExerciseLap$PbLapSummary extends GeneratedMessageV3 implements ExerciseLap$PbLapSummaryOrBuilder {
   public static final int AVERAGE_LAP_DURATION_FIELD_NUMBER = 2;
   public static final int BEST_LAP_DURATION_FIELD_NUMBER = 1;
   private static final ExerciseLap$PbLapSummary DEFAULT_INSTANCE = new ExerciseLap$PbLapSummary();
   @Deprecated
   public static final Parser PARSER = new ExerciseLap$PbLapSummary$1();
   private static final long serialVersionUID = 0L;
   private Types$PbDuration averageLapDuration_;
   private Types$PbDuration bestLapDuration_;
   private int bitField0_;
   private byte memoizedIsInitialized;

   private ExerciseLap$PbLapSummary() {
      this.memoizedIsInitialized = (byte)-1;
   }

   private ExerciseLap$PbLapSummary(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseLap$PbLapSummary(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseLap$1 var3) {
      this(var1, var2);
   }

   private ExerciseLap$PbLapSummary(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseLap$PbLapSummary(Builder var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(ExerciseLap$PbLapSummary var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExerciseLap$PbLapSummary var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbDuration a(ExerciseLap$PbLapSummary var0, Types$PbDuration var1) {
      var0.bestLapDuration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration b(ExerciseLap$PbLapSummary var0, Types$PbDuration var1) {
      var0.averageLapDuration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static ExerciseLap$PbLapSummary getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.C();
   }

   public static ExerciseLap$PbLapSummary$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseLap$PbLapSummary$Builder newBuilder(ExerciseLap$PbLapSummary var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseLap$PbLapSummary parseDelimitedFrom(InputStream var0) {
      return (ExerciseLap$PbLapSummary)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLapSummary parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapSummary)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLapSummary parseFrom(ByteString var0) {
      return (ExerciseLap$PbLapSummary)PARSER.parseFrom(var0);
   }

   public static ExerciseLap$PbLapSummary parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapSummary)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseLap$PbLapSummary parseFrom(CodedInputStream var0) {
      return (ExerciseLap$PbLapSummary)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLapSummary parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapSummary)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLapSummary parseFrom(InputStream var0) {
      return (ExerciseLap$PbLapSummary)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLapSummary parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapSummary)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLapSummary parseFrom(byte[] var0) {
      return (ExerciseLap$PbLapSummary)PARSER.parseFrom(var0);
   }

   public static ExerciseLap$PbLapSummary parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapSummary)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseLap$PbLapSummary)) {
            var2 = super.equals(var1);
         } else {
            ExerciseLap$PbLapSummary var5 = (ExerciseLap$PbLapSummary)var1;
            boolean var3;
            if (this.hasBestLapDuration() == var5.hasBestLapDuration()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasBestLapDuration()) {
               if (var3 && this.getBestLapDuration().equals(var5.getBestLapDuration())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAverageLapDuration() == var5.hasAverageLapDuration()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasAverageLapDuration()) {
               if (var3 && this.getAverageLapDuration().equals(var5.getAverageLapDuration())) {
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

   public Types$PbDuration getAverageLapDuration() {
      Types$PbDuration var1;
      if (this.averageLapDuration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.averageLapDuration_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getAverageLapDurationOrBuilder() {
      Types$PbDuration var1;
      if (this.averageLapDuration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.averageLapDuration_;
      }

      return var1;
   }

   public Types$PbDuration getBestLapDuration() {
      Types$PbDuration var1;
      if (this.bestLapDuration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.bestLapDuration_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getBestLapDurationOrBuilder() {
      Types$PbDuration var1;
      if (this.bestLapDuration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.bestLapDuration_;
      }

      return var1;
   }

   public ExerciseLap$PbLapSummary getDefaultInstanceForType() {
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
            var1 = 0 + CodedOutputStream.computeMessageSize(1, this.getBestLapDuration());
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeMessageSize(2, this.getAverageLapDuration());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasAverageLapDuration() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasBestLapDuration() {
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
         if (this.hasBestLapDuration()) {
            var1 = (var2 * 37 + 1) * 53 + this.getBestLapDuration().hashCode();
         }

         var2 = var1;
         if (this.hasAverageLapDuration()) {
            var2 = (var1 * 37 + 2) * 53 + this.getAverageLapDuration().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseLap.D().ensureFieldAccessorsInitialized(ExerciseLap$PbLapSummary.class, ExerciseLap$PbLapSummary$Builder.class);
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

   public ExerciseLap$PbLapSummary$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseLap$PbLapSummary$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseLap$PbLapSummary$Builder(var1, (ExerciseLap$1)null);
   }

   public ExerciseLap$PbLapSummary$Builder toBuilder() {
      ExerciseLap$PbLapSummary$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseLap$PbLapSummary$Builder((ExerciseLap$1)null);
      } else {
         var1 = (new ExerciseLap$PbLapSummary$Builder((ExerciseLap$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getBestLapDuration());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getAverageLapDuration());
      }

      this.unknownFields.writeTo(var1);
   }
}
