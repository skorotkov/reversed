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

public final class ExerciseLap$PbLap extends GeneratedMessageV3 implements ExerciseLap$PbLapOrBuilder {
   private static final ExerciseLap$PbLap DEFAULT_INSTANCE = new ExerciseLap$PbLap();
   public static final int HEADER_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new ExerciseLap$PbLap$1();
   public static final int STATISTICS_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private ExerciseLap$PbLapHeader header_;
   private byte memoizedIsInitialized;
   private ExerciseLap$PbLapStatistics statistics_;

   private ExerciseLap$PbLap() {
      this.memoizedIsInitialized = (byte)-1;
   }

   private ExerciseLap$PbLap(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseLap$PbLap(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseLap$1 var3) {
      this(var1, var2);
   }

   private ExerciseLap$PbLap(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseLap$PbLap(Builder var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(ExerciseLap$PbLap var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExerciseLap$PbLap var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static ExerciseLap$PbLapHeader a(ExerciseLap$PbLap var0, ExerciseLap$PbLapHeader var1) {
      var0.header_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseLap$PbLapStatistics a(ExerciseLap$PbLap var0, ExerciseLap$PbLapStatistics var1) {
      var0.statistics_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static ExerciseLap$PbLap getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.A();
   }

   public static ExerciseLap$PbLap$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseLap$PbLap$Builder newBuilder(ExerciseLap$PbLap var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseLap$PbLap parseDelimitedFrom(InputStream var0) {
      return (ExerciseLap$PbLap)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLap parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLap)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLap parseFrom(ByteString var0) {
      return (ExerciseLap$PbLap)PARSER.parseFrom(var0);
   }

   public static ExerciseLap$PbLap parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLap)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseLap$PbLap parseFrom(CodedInputStream var0) {
      return (ExerciseLap$PbLap)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLap parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLap)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLap parseFrom(InputStream var0) {
      return (ExerciseLap$PbLap)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLap parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLap)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLap parseFrom(byte[] var0) {
      return (ExerciseLap$PbLap)PARSER.parseFrom(var0);
   }

   public static ExerciseLap$PbLap parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLap)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseLap$PbLap)) {
            var2 = super.equals(var1);
         } else {
            ExerciseLap$PbLap var5 = (ExerciseLap$PbLap)var1;
            boolean var3;
            if (this.hasHeader() == var5.hasHeader()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasHeader()) {
               if (var3 && this.getHeader().equals(var5.getHeader())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasStatistics() == var5.hasStatistics()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasStatistics()) {
               if (var4 && this.getStatistics().equals(var5.getStatistics())) {
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

   public ExerciseLap$PbLap getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public ExerciseLap$PbLapHeader getHeader() {
      ExerciseLap$PbLapHeader var1;
      if (this.header_ == null) {
         var1 = ExerciseLap$PbLapHeader.getDefaultInstance();
      } else {
         var1 = this.header_;
      }

      return var1;
   }

   public ExerciseLap$PbLapHeaderOrBuilder getHeaderOrBuilder() {
      ExerciseLap$PbLapHeader var1;
      if (this.header_ == null) {
         var1 = ExerciseLap$PbLapHeader.getDefaultInstance();
      } else {
         var1 = this.header_;
      }

      return var1;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeMessageSize(1, this.getHeader());
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeMessageSize(2, this.getStatistics());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public ExerciseLap$PbLapStatistics getStatistics() {
      ExerciseLap$PbLapStatistics var1;
      if (this.statistics_ == null) {
         var1 = ExerciseLap$PbLapStatistics.getDefaultInstance();
      } else {
         var1 = this.statistics_;
      }

      return var1;
   }

   public ExerciseLap$PbLapStatisticsOrBuilder getStatisticsOrBuilder() {
      ExerciseLap$PbLapStatistics var1;
      if (this.statistics_ == null) {
         var1 = ExerciseLap$PbLapStatistics.getDefaultInstance();
      } else {
         var1 = this.statistics_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasHeader() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStatistics() {
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
         if (this.hasHeader()) {
            var1 = (var2 * 37 + 1) * 53 + this.getHeader().hashCode();
         }

         var2 = var1;
         if (this.hasStatistics()) {
            var2 = (var1 * 37 + 2) * 53 + this.getStatistics().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseLap.B().ensureFieldAccessorsInitialized(ExerciseLap$PbLap.class, ExerciseLap$PbLap$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasHeader()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getHeader().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public ExerciseLap$PbLap$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseLap$PbLap$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseLap$PbLap$Builder(var1, (ExerciseLap$1)null);
   }

   public ExerciseLap$PbLap$Builder toBuilder() {
      ExerciseLap$PbLap$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseLap$PbLap$Builder((ExerciseLap$1)null);
      } else {
         var1 = (new ExerciseLap$PbLap$Builder((ExerciseLap$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getHeader());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getStatistics());
      }

      this.unknownFields.writeTo(var1);
   }
}
