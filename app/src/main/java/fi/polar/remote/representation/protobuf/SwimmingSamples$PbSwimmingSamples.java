package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class SwimmingSamples$PbSwimmingSamples extends GeneratedMessageV3 implements SwimmingSamples$PbSwimmingSamplesOrBuilder {
   private static final SwimmingSamples$PbSwimmingSamples DEFAULT_INSTANCE = new SwimmingSamples$PbSwimmingSamples();
   @Deprecated
   public static final Parser PARSER = new SwimmingSamples$PbSwimmingSamples$1();
   public static final int POOL_METRIC_FIELD_NUMBER = 3;
   public static final int START_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private List poolMetric_;
   private Types$PbLocalDateTime start_;

   private SwimmingSamples$PbSwimmingSamples() {
      this.memoizedIsInitialized = (byte)-1;
      this.poolMetric_ = Collections.emptyList();
   }

   private SwimmingSamples$PbSwimmingSamples(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   SwimmingSamples$PbSwimmingSamples(CodedInputStream var1, ExtensionRegistryLite var2, SwimmingSamples$1 var3) {
      this(var1, var2);
   }

   private SwimmingSamples$PbSwimmingSamples(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   SwimmingSamples$PbSwimmingSamples(Builder var1, SwimmingSamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(SwimmingSamples$PbSwimmingSamples var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbLocalDateTime a(SwimmingSamples$PbSwimmingSamples var0, Types$PbLocalDateTime var1) {
      var0.start_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List a(SwimmingSamples$PbSwimmingSamples var0) {
      return var0.poolMetric_;
   }

   // $FF: synthetic method
   static List a(SwimmingSamples$PbSwimmingSamples var0, List var1) {
      var0.poolMetric_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(SwimmingSamples$PbSwimmingSamples var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static boolean c() {
      return alwaysUseFieldBuilders;
   }

   public static SwimmingSamples$PbSwimmingSamples getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return SwimmingSamples.e();
   }

   public static SwimmingSamples$PbSwimmingSamples$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SwimmingSamples$PbSwimmingSamples$Builder newBuilder(SwimmingSamples$PbSwimmingSamples var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static SwimmingSamples$PbSwimmingSamples parseDelimitedFrom(InputStream var0) {
      return (SwimmingSamples$PbSwimmingSamples)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SwimmingSamples$PbSwimmingSamples parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SwimmingSamples$PbSwimmingSamples)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SwimmingSamples$PbSwimmingSamples parseFrom(ByteString var0) {
      return (SwimmingSamples$PbSwimmingSamples)PARSER.parseFrom(var0);
   }

   public static SwimmingSamples$PbSwimmingSamples parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (SwimmingSamples$PbSwimmingSamples)PARSER.parseFrom(var0, var1);
   }

   public static SwimmingSamples$PbSwimmingSamples parseFrom(CodedInputStream var0) {
      return (SwimmingSamples$PbSwimmingSamples)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SwimmingSamples$PbSwimmingSamples parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (SwimmingSamples$PbSwimmingSamples)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SwimmingSamples$PbSwimmingSamples parseFrom(InputStream var0) {
      return (SwimmingSamples$PbSwimmingSamples)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SwimmingSamples$PbSwimmingSamples parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (SwimmingSamples$PbSwimmingSamples)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SwimmingSamples$PbSwimmingSamples parseFrom(byte[] var0) {
      return (SwimmingSamples$PbSwimmingSamples)PARSER.parseFrom(var0);
   }

   public static SwimmingSamples$PbSwimmingSamples parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (SwimmingSamples$PbSwimmingSamples)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof SwimmingSamples$PbSwimmingSamples)) {
            var2 = super.equals(var1);
         } else {
            SwimmingSamples$PbSwimmingSamples var5 = (SwimmingSamples$PbSwimmingSamples)var1;
            boolean var3;
            if (this.hasStart() == var5.hasStart()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasStart()) {
               if (var3 && this.getStart().equals(var5.getStart())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.getPoolMetricList().equals(var5.getPoolMetricList())) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (!var4 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public SwimmingSamples$PbSwimmingSamples getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public SwimmingSamples$PbSwimmingPoolMetric getPoolMetric(int var1) {
      return (SwimmingSamples$PbSwimmingPoolMetric)this.poolMetric_.get(var1);
   }

   public int getPoolMetricCount() {
      return this.poolMetric_.size();
   }

   public List getPoolMetricList() {
      return this.poolMetric_;
   }

   public SwimmingSamples$PbSwimmingPoolMetricOrBuilder getPoolMetricOrBuilder(int var1) {
      return (SwimmingSamples$PbSwimmingPoolMetricOrBuilder)this.poolMetric_.get(var1);
   }

   public List getPoolMetricOrBuilderList() {
      return this.poolMetric_;
   }

   public int getSerializedSize() {
      int var1 = 0;
      int var2 = this.memoizedSize;
      if (var2 == -1) {
         if ((this.bitField0_ & 1) == 1) {
            var2 = CodedOutputStream.computeMessageSize(1, this.getStart()) + 0;
         } else {
            var2 = 0;
         }

         while(var1 < this.poolMetric_.size()) {
            int var3 = CodedOutputStream.computeMessageSize(3, (MessageLite)this.poolMetric_.get(var1));
            ++var1;
            var2 += var3;
         }

         var2 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var2;
      }

      return var2;
   }

   public Types$PbLocalDateTime getStart() {
      Types$PbLocalDateTime var1;
      if (this.start_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.start_;
      }

      return var1;
   }

   public Types$PbLocalDateTimeOrBuilder getStartOrBuilder() {
      Types$PbLocalDateTime var1;
      if (this.start_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.start_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasStart() {
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
         if (this.hasStart()) {
            var1 = (var2 * 37 + 1) * 53 + this.getStart().hashCode();
         }

         var2 = var1;
         if (this.getPoolMetricCount() > 0) {
            var2 = (var1 * 37 + 3) * 53 + this.getPoolMetricList().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SwimmingSamples.f().ensureFieldAccessorsInitialized(SwimmingSamples$PbSwimmingSamples.class, SwimmingSamples$PbSwimmingSamples$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      byte var2 = this.memoizedIsInitialized;
      boolean var3;
      if (var2 == 1) {
         var3 = true;
      } else {
         var3 = var1;
         if (var2 != 0) {
            if (!this.hasStart()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else if (!this.getStart().isInitialized()) {
               this.memoizedIsInitialized = (byte)0;
               var3 = var1;
            } else {
               int var4 = 0;

               while(true) {
                  if (var4 >= this.getPoolMetricCount()) {
                     this.memoizedIsInitialized = (byte)1;
                     var3 = true;
                     break;
                  }

                  if (!this.getPoolMetric(var4).isInitialized()) {
                     this.memoizedIsInitialized = (byte)0;
                     var3 = var1;
                     break;
                  }

                  ++var4;
               }
            }
         }
      }

      return var3;
   }

   public SwimmingSamples$PbSwimmingSamples$Builder newBuilderForType() {
      return newBuilder();
   }

   protected SwimmingSamples$PbSwimmingSamples$Builder newBuilderForType(BuilderParent var1) {
      return new SwimmingSamples$PbSwimmingSamples$Builder(var1, (SwimmingSamples$1)null);
   }

   public SwimmingSamples$PbSwimmingSamples$Builder toBuilder() {
      SwimmingSamples$PbSwimmingSamples$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new SwimmingSamples$PbSwimmingSamples$Builder((SwimmingSamples$1)null);
      } else {
         var1 = (new SwimmingSamples$PbSwimmingSamples$Builder((SwimmingSamples$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getStart());
      }

      for(int var2 = 0; var2 < this.poolMetric_.size(); ++var2) {
         var1.writeMessage(3, (MessageLite)this.poolMetric_.get(var2));
      }

      this.unknownFields.writeTo(var1);
   }
}
