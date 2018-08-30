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

public final class SwimmingSamples$PbSwimmingPoolMetric extends GeneratedMessageV3 implements SwimmingSamples$PbSwimmingPoolMetricOrBuilder {
   private static final SwimmingSamples$PbSwimmingPoolMetric DEFAULT_INSTANCE = new SwimmingSamples$PbSwimmingPoolMetric();
   public static final int DURATION_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new SwimmingSamples$PbSwimmingPoolMetric$1();
   public static final int START_OFFSET_FIELD_NUMBER = 1;
   public static final int STROKES_FIELD_NUMBER = 4;
   public static final int STYLE_FIELD_NUMBER = 3;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private Types$PbDuration duration_;
   private byte memoizedIsInitialized;
   private Types$PbDuration startOffset_;
   private int strokes_;
   private int style_;

   private SwimmingSamples$PbSwimmingPoolMetric() {
      this.memoizedIsInitialized = (byte)-1;
      this.style_ = -1;
      this.strokes_ = 0;
   }

   private SwimmingSamples$PbSwimmingPoolMetric(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   SwimmingSamples$PbSwimmingPoolMetric(CodedInputStream var1, ExtensionRegistryLite var2, SwimmingSamples$1 var3) {
      this(var1, var2);
   }

   private SwimmingSamples$PbSwimmingPoolMetric(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   SwimmingSamples$PbSwimmingPoolMetric(Builder var1, SwimmingSamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(SwimmingSamples$PbSwimmingPoolMetric var0, int var1) {
      var0.style_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(SwimmingSamples$PbSwimmingPoolMetric var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbDuration a(SwimmingSamples$PbSwimmingPoolMetric var0, Types$PbDuration var1) {
      var0.startOffset_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(SwimmingSamples$PbSwimmingPoolMetric var0, int var1) {
      var0.strokes_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration b(SwimmingSamples$PbSwimmingPoolMetric var0, Types$PbDuration var1) {
      var0.duration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(SwimmingSamples$PbSwimmingPoolMetric var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static SwimmingSamples$PbSwimmingPoolMetric getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return SwimmingSamples.c();
   }

   public static SwimmingSamples$PbSwimmingPoolMetric$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SwimmingSamples$PbSwimmingPoolMetric$Builder newBuilder(SwimmingSamples$PbSwimmingPoolMetric var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static SwimmingSamples$PbSwimmingPoolMetric parseDelimitedFrom(InputStream var0) {
      return (SwimmingSamples$PbSwimmingPoolMetric)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SwimmingSamples$PbSwimmingPoolMetric parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SwimmingSamples$PbSwimmingPoolMetric)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SwimmingSamples$PbSwimmingPoolMetric parseFrom(ByteString var0) {
      return (SwimmingSamples$PbSwimmingPoolMetric)PARSER.parseFrom(var0);
   }

   public static SwimmingSamples$PbSwimmingPoolMetric parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (SwimmingSamples$PbSwimmingPoolMetric)PARSER.parseFrom(var0, var1);
   }

   public static SwimmingSamples$PbSwimmingPoolMetric parseFrom(CodedInputStream var0) {
      return (SwimmingSamples$PbSwimmingPoolMetric)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SwimmingSamples$PbSwimmingPoolMetric parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (SwimmingSamples$PbSwimmingPoolMetric)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SwimmingSamples$PbSwimmingPoolMetric parseFrom(InputStream var0) {
      return (SwimmingSamples$PbSwimmingPoolMetric)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SwimmingSamples$PbSwimmingPoolMetric parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SwimmingSamples$PbSwimmingPoolMetric)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SwimmingSamples$PbSwimmingPoolMetric parseFrom(byte[] var0) {
      return (SwimmingSamples$PbSwimmingPoolMetric)PARSER.parseFrom(var0);
   }

   public static SwimmingSamples$PbSwimmingPoolMetric parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (SwimmingSamples$PbSwimmingPoolMetric)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof SwimmingSamples$PbSwimmingPoolMetric)) {
            var2 = super.equals(var1);
         } else {
            SwimmingSamples$PbSwimmingPoolMetric var5 = (SwimmingSamples$PbSwimmingPoolMetric)var1;
            boolean var3;
            if (this.hasStartOffset() == var5.hasStartOffset()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasStartOffset()) {
               if (var3 && this.getStartOffset().equals(var5.getStartOffset())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasDuration() == var5.hasDuration()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasDuration()) {
               if (var3 && this.getDuration().equals(var5.getDuration())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasStyle() == var5.hasStyle()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasStyle()) {
               if (var3 && this.style_ == var5.style_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasStrokes() == var5.hasStrokes()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasStrokes()) {
               if (var3 && this.getStrokes() == var5.getStrokes()) {
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

   public SwimmingSamples$PbSwimmingPoolMetric getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Types$PbDuration getDuration() {
      Types$PbDuration var1;
      if (this.duration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.duration_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getDurationOrBuilder() {
      Types$PbDuration var1;
      if (this.duration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.duration_;
      }

      return var1;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeMessageSize(1, this.getStartOffset());
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeMessageSize(2, this.getDuration());
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeEnumSize(3, this.style_);
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeUInt32Size(4, this.strokes_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public Types$PbDuration getStartOffset() {
      Types$PbDuration var1;
      if (this.startOffset_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.startOffset_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getStartOffsetOrBuilder() {
      Types$PbDuration var1;
      if (this.startOffset_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.startOffset_;
      }

      return var1;
   }

   public int getStrokes() {
      return this.strokes_;
   }

   public Types$PbSwimmingStyle getStyle() {
      Types$PbSwimmingStyle var1 = Types$PbSwimmingStyle.valueOf(this.style_);
      Types$PbSwimmingStyle var2 = var1;
      if (var1 == null) {
         var2 = Types$PbSwimmingStyle.OTHER;
      }

      return var2;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasDuration() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStartOffset() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStrokes() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStyle() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
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
         if (this.hasStartOffset()) {
            var1 = (var2 * 37 + 1) * 53 + this.getStartOffset().hashCode();
         }

         var2 = var1;
         if (this.hasDuration()) {
            var2 = (var1 * 37 + 2) * 53 + this.getDuration().hashCode();
         }

         var1 = var2;
         if (this.hasStyle()) {
            var1 = (var2 * 37 + 3) * 53 + this.style_;
         }

         var2 = var1;
         if (this.hasStrokes()) {
            var2 = (var1 * 37 + 4) * 53 + this.getStrokes();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SwimmingSamples.d().ensureFieldAccessorsInitialized(SwimmingSamples$PbSwimmingPoolMetric.class, SwimmingSamples$PbSwimmingPoolMetric$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasStartOffset()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasDuration()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public SwimmingSamples$PbSwimmingPoolMetric$Builder newBuilderForType() {
      return newBuilder();
   }

   protected SwimmingSamples$PbSwimmingPoolMetric$Builder newBuilderForType(BuilderParent var1) {
      return new SwimmingSamples$PbSwimmingPoolMetric$Builder(var1, (SwimmingSamples$1)null);
   }

   public SwimmingSamples$PbSwimmingPoolMetric$Builder toBuilder() {
      SwimmingSamples$PbSwimmingPoolMetric$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new SwimmingSamples$PbSwimmingPoolMetric$Builder((SwimmingSamples$1)null);
      } else {
         var1 = (new SwimmingSamples$PbSwimmingPoolMetric$Builder((SwimmingSamples$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getStartOffset());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getDuration());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeEnum(3, this.style_);
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeUInt32(4, this.strokes_);
      }

      this.unknownFields.writeTo(var1);
   }
}
