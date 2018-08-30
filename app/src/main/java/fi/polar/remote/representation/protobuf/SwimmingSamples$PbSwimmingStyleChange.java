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

public final class SwimmingSamples$PbSwimmingStyleChange extends GeneratedMessageV3 implements SwimmingSamples$PbSwimmingStyleChangeOrBuilder {
   private static final SwimmingSamples$PbSwimmingStyleChange DEFAULT_INSTANCE = new SwimmingSamples$PbSwimmingStyleChange();
   @Deprecated
   public static final Parser PARSER = new SwimmingSamples$PbSwimmingStyleChange$1();
   public static final int STYLE_FIELD_NUMBER = 1;
   public static final int TIMESTAMP_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private int style_;
   private Types$PbDuration timestamp_;

   private SwimmingSamples$PbSwimmingStyleChange() {
      this.memoizedIsInitialized = (byte)-1;
      this.style_ = -1;
   }

   private SwimmingSamples$PbSwimmingStyleChange(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   SwimmingSamples$PbSwimmingStyleChange(CodedInputStream var1, ExtensionRegistryLite var2, SwimmingSamples$1 var3) {
      this(var1, var2);
   }

   private SwimmingSamples$PbSwimmingStyleChange(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   SwimmingSamples$PbSwimmingStyleChange(Builder var1, SwimmingSamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(SwimmingSamples$PbSwimmingStyleChange var0, int var1) {
      var0.style_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(SwimmingSamples$PbSwimmingStyleChange var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbDuration a(SwimmingSamples$PbSwimmingStyleChange var0, Types$PbDuration var1) {
      var0.timestamp_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(SwimmingSamples$PbSwimmingStyleChange var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static SwimmingSamples$PbSwimmingStyleChange getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return SwimmingSamples.a();
   }

   public static SwimmingSamples$PbSwimmingStyleChange$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SwimmingSamples$PbSwimmingStyleChange$Builder newBuilder(SwimmingSamples$PbSwimmingStyleChange var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static SwimmingSamples$PbSwimmingStyleChange parseDelimitedFrom(InputStream var0) {
      return (SwimmingSamples$PbSwimmingStyleChange)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SwimmingSamples$PbSwimmingStyleChange parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SwimmingSamples$PbSwimmingStyleChange)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SwimmingSamples$PbSwimmingStyleChange parseFrom(ByteString var0) {
      return (SwimmingSamples$PbSwimmingStyleChange)PARSER.parseFrom(var0);
   }

   public static SwimmingSamples$PbSwimmingStyleChange parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (SwimmingSamples$PbSwimmingStyleChange)PARSER.parseFrom(var0, var1);
   }

   public static SwimmingSamples$PbSwimmingStyleChange parseFrom(CodedInputStream var0) {
      return (SwimmingSamples$PbSwimmingStyleChange)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SwimmingSamples$PbSwimmingStyleChange parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (SwimmingSamples$PbSwimmingStyleChange)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SwimmingSamples$PbSwimmingStyleChange parseFrom(InputStream var0) {
      return (SwimmingSamples$PbSwimmingStyleChange)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SwimmingSamples$PbSwimmingStyleChange parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SwimmingSamples$PbSwimmingStyleChange)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SwimmingSamples$PbSwimmingStyleChange parseFrom(byte[] var0) {
      return (SwimmingSamples$PbSwimmingStyleChange)PARSER.parseFrom(var0);
   }

   public static SwimmingSamples$PbSwimmingStyleChange parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (SwimmingSamples$PbSwimmingStyleChange)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof SwimmingSamples$PbSwimmingStyleChange)) {
            var2 = super.equals(var1);
         } else {
            SwimmingSamples$PbSwimmingStyleChange var5 = (SwimmingSamples$PbSwimmingStyleChange)var1;
            boolean var3;
            if (this.hasStyle() == var5.hasStyle()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasStyle()) {
               if (var3 && this.style_ == var5.style_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTimestamp() == var5.hasTimestamp()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasTimestamp()) {
               if (var4 && this.getTimestamp().equals(var5.getTimestamp())) {
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

   public SwimmingSamples$PbSwimmingStyleChange getDefaultInstanceForType() {
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
            var1 = 0 + CodedOutputStream.computeEnumSize(1, this.style_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeMessageSize(2, this.getTimestamp());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public Types$PbSwimmingStyle getStyle() {
      Types$PbSwimmingStyle var1 = Types$PbSwimmingStyle.valueOf(this.style_);
      Types$PbSwimmingStyle var2 = var1;
      if (var1 == null) {
         var2 = Types$PbSwimmingStyle.OTHER;
      }

      return var2;
   }

   public Types$PbDuration getTimestamp() {
      Types$PbDuration var1;
      if (this.timestamp_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timestamp_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getTimestampOrBuilder() {
      Types$PbDuration var1;
      if (this.timestamp_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timestamp_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasStyle() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimestamp() {
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
         if (this.hasStyle()) {
            var1 = (var2 * 37 + 1) * 53 + this.style_;
         }

         var2 = var1;
         if (this.hasTimestamp()) {
            var2 = (var1 * 37 + 2) * 53 + this.getTimestamp().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SwimmingSamples.b().ensureFieldAccessorsInitialized(SwimmingSamples$PbSwimmingStyleChange.class, SwimmingSamples$PbSwimmingStyleChange$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasStyle()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasTimestamp()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public SwimmingSamples$PbSwimmingStyleChange$Builder newBuilderForType() {
      return newBuilder();
   }

   protected SwimmingSamples$PbSwimmingStyleChange$Builder newBuilderForType(BuilderParent var1) {
      return new SwimmingSamples$PbSwimmingStyleChange$Builder(var1, (SwimmingSamples$1)null);
   }

   public SwimmingSamples$PbSwimmingStyleChange$Builder toBuilder() {
      SwimmingSamples$PbSwimmingStyleChange$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new SwimmingSamples$PbSwimmingStyleChange$Builder((SwimmingSamples$1)null);
      } else {
         var1 = (new SwimmingSamples$PbSwimmingStyleChange$Builder((SwimmingSamples$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.style_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getTimestamp());
      }

      this.unknownFields.writeTo(var1);
   }
}
