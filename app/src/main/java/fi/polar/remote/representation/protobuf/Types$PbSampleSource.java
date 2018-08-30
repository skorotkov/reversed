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

public final class Types$PbSampleSource extends GeneratedMessageV3 implements Types$PbSampleSourceOrBuilder {
   private static final Types$PbSampleSource DEFAULT_INSTANCE = new Types$PbSampleSource();
   @Deprecated
   public static final Parser PARSER = new Types$PbSampleSource$1();
   public static final int SAMPLE_SOURCE_TYPE_FIELD_NUMBER = 1;
   public static final int START_INDEX_FIELD_NUMBER = 2;
   public static final int STOP_INDEX_FIELD_NUMBER = 3;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private int sampleSourceType_;
   private int startIndex_;
   private int stopIndex_;

   private Types$PbSampleSource() {
      this.memoizedIsInitialized = (byte)-1;
      this.sampleSourceType_ = 0;
      this.startIndex_ = 0;
      this.stopIndex_ = 0;
   }

   private Types$PbSampleSource(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Types$PbSampleSource(CodedInputStream var1, ExtensionRegistryLite var2, Types$1 var3) {
      this(var1, var2);
   }

   private Types$PbSampleSource(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Types$PbSampleSource(Builder var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Types$PbSampleSource var0, int var1) {
      var0.sampleSourceType_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Types$PbSampleSource var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(Types$PbSampleSource var0, int var1) {
      var0.startIndex_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(Types$PbSampleSource var0, int var1) {
      var0.stopIndex_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int d(Types$PbSampleSource var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static Types$PbSampleSource getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Types.w();
   }

   public static Types$PbSampleSource$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Types$PbSampleSource$Builder newBuilder(Types$PbSampleSource var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Types$PbSampleSource parseDelimitedFrom(InputStream var0) {
      return (Types$PbSampleSource)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Types$PbSampleSource parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbSampleSource)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Types$PbSampleSource parseFrom(ByteString var0) {
      return (Types$PbSampleSource)PARSER.parseFrom(var0);
   }

   public static Types$PbSampleSource parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Types$PbSampleSource)PARSER.parseFrom(var0, var1);
   }

   public static Types$PbSampleSource parseFrom(CodedInputStream var0) {
      return (Types$PbSampleSource)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbSampleSource parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbSampleSource)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbSampleSource parseFrom(InputStream var0) {
      return (Types$PbSampleSource)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbSampleSource parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbSampleSource)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbSampleSource parseFrom(byte[] var0) {
      return (Types$PbSampleSource)PARSER.parseFrom(var0);
   }

   public static Types$PbSampleSource parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Types$PbSampleSource)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Types$PbSampleSource)) {
            var2 = super.equals(var1);
         } else {
            Types$PbSampleSource var5 = (Types$PbSampleSource)var1;
            boolean var3;
            if (this.hasSampleSourceType() == var5.hasSampleSourceType()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasSampleSourceType()) {
               if (var3 && this.sampleSourceType_ == var5.sampleSourceType_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasStartIndex() == var5.hasStartIndex()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasStartIndex()) {
               if (var4 && this.getStartIndex() == var5.getStartIndex()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasStopIndex() == var5.hasStopIndex()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasStopIndex()) {
               if (var3 && this.getStopIndex() == var5.getStopIndex()) {
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

   public Types$PbSampleSource getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public Types$PbSampleSourceType getSampleSourceType() {
      Types$PbSampleSourceType var1 = Types$PbSampleSourceType.valueOf(this.sampleSourceType_);
      Types$PbSampleSourceType var2 = var1;
      if (var1 == null) {
         var2 = Types$PbSampleSourceType.SAMPLE_SOURCE_TYPE_UNDEFINED;
      }

      return var2;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeEnumSize(1, this.sampleSourceType_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeUInt32Size(2, this.startIndex_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(3, this.stopIndex_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public int getStartIndex() {
      return this.startIndex_;
   }

   public int getStopIndex() {
      return this.stopIndex_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasSampleSourceType() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStartIndex() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStopIndex() {
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
         if (this.hasSampleSourceType()) {
            var1 = (var2 * 37 + 1) * 53 + this.sampleSourceType_;
         }

         var2 = var1;
         if (this.hasStartIndex()) {
            var2 = (var1 * 37 + 2) * 53 + this.getStartIndex();
         }

         var1 = var2;
         if (this.hasStopIndex()) {
            var1 = (var2 * 37 + 3) * 53 + this.getStopIndex();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.x().ensureFieldAccessorsInitialized(Types$PbSampleSource.class, Types$PbSampleSource$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasSampleSourceType()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasStartIndex()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasStopIndex()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Types$PbSampleSource$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Types$PbSampleSource$Builder newBuilderForType(BuilderParent var1) {
      return new Types$PbSampleSource$Builder(var1, (Types$1)null);
   }

   public Types$PbSampleSource$Builder toBuilder() {
      Types$PbSampleSource$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Types$PbSampleSource$Builder((Types$1)null);
      } else {
         var1 = (new Types$PbSampleSource$Builder((Types$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.sampleSourceType_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeUInt32(2, this.startIndex_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeUInt32(3, this.stopIndex_);
      }

      this.unknownFields.writeTo(var1);
   }
}
