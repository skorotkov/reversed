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

public final class ExerciseLap$PbAutoLaps extends GeneratedMessageV3 implements ExerciseLap$PbAutoLapsOrBuilder {
   public static final int AUTOLAPS_FIELD_NUMBER = 1;
   private static final ExerciseLap$PbAutoLaps DEFAULT_INSTANCE = new ExerciseLap$PbAutoLaps();
   @Deprecated
   public static final Parser PARSER = new ExerciseLap$PbAutoLaps$1();
   public static final int SUMMARY_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private List autoLaps_;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private ExerciseLap$PbLapSummary summary_;

   private ExerciseLap$PbAutoLaps() {
      this.memoizedIsInitialized = (byte)-1;
      this.autoLaps_ = Collections.emptyList();
   }

   private ExerciseLap$PbAutoLaps(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseLap$PbAutoLaps(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseLap$1 var3) {
      this(var1, var2);
   }

   private ExerciseLap$PbAutoLaps(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseLap$PbAutoLaps(Builder var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(ExerciseLap$PbAutoLaps var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static ExerciseLap$PbLapSummary a(ExerciseLap$PbAutoLaps var0, ExerciseLap$PbLapSummary var1) {
      var0.summary_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List a(ExerciseLap$PbAutoLaps var0) {
      return var0.autoLaps_;
   }

   // $FF: synthetic method
   static List a(ExerciseLap$PbAutoLaps var0, List var1) {
      var0.autoLaps_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(ExerciseLap$PbAutoLaps var0) {
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

   public static ExerciseLap$PbAutoLaps getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.G();
   }

   public static ExerciseLap$PbAutoLaps$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseLap$PbAutoLaps$Builder newBuilder(ExerciseLap$PbAutoLaps var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseLap$PbAutoLaps parseDelimitedFrom(InputStream var0) {
      return (ExerciseLap$PbAutoLaps)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbAutoLaps parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbAutoLaps)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbAutoLaps parseFrom(ByteString var0) {
      return (ExerciseLap$PbAutoLaps)PARSER.parseFrom(var0);
   }

   public static ExerciseLap$PbAutoLaps parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbAutoLaps)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseLap$PbAutoLaps parseFrom(CodedInputStream var0) {
      return (ExerciseLap$PbAutoLaps)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbAutoLaps parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbAutoLaps)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbAutoLaps parseFrom(InputStream var0) {
      return (ExerciseLap$PbAutoLaps)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbAutoLaps parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbAutoLaps)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbAutoLaps parseFrom(byte[] var0) {
      return (ExerciseLap$PbAutoLaps)PARSER.parseFrom(var0);
   }

   public static ExerciseLap$PbAutoLaps parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbAutoLaps)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseLap$PbAutoLaps)) {
            var2 = super.equals(var1);
         } else {
            ExerciseLap$PbAutoLaps var5 = (ExerciseLap$PbAutoLaps)var1;
            boolean var3;
            if (this.getAutoLapsList().equals(var5.getAutoLapsList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4;
            if (var3 && this.hasSummary() == var5.hasSummary()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSummary()) {
               if (var4 && this.getSummary().equals(var5.getSummary())) {
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

   public ExerciseLap$PbLap getAutoLaps(int var1) {
      return (ExerciseLap$PbLap)this.autoLaps_.get(var1);
   }

   public int getAutoLapsCount() {
      return this.autoLaps_.size();
   }

   public List getAutoLapsList() {
      return this.autoLaps_;
   }

   public ExerciseLap$PbLapOrBuilder getAutoLapsOrBuilder(int var1) {
      return (ExerciseLap$PbLapOrBuilder)this.autoLaps_.get(var1);
   }

   public List getAutoLapsOrBuilderList() {
      return this.autoLaps_;
   }

   public ExerciseLap$PbAutoLaps getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;

         for(var1 = 0; var2 < this.autoLaps_.size(); ++var2) {
            var1 += CodedOutputStream.computeMessageSize(1, (MessageLite)this.autoLaps_.get(var2));
         }

         var2 = var1;
         if ((this.bitField0_ & 1) == 1) {
            var2 = var1 + CodedOutputStream.computeMessageSize(2, this.getSummary());
         }

         var1 = this.unknownFields.getSerializedSize() + var2;
         this.memoizedSize = var1;
      }

      return var1;
   }

   public ExerciseLap$PbLapSummary getSummary() {
      ExerciseLap$PbLapSummary var1;
      if (this.summary_ == null) {
         var1 = ExerciseLap$PbLapSummary.getDefaultInstance();
      } else {
         var1 = this.summary_;
      }

      return var1;
   }

   public ExerciseLap$PbLapSummaryOrBuilder getSummaryOrBuilder() {
      ExerciseLap$PbLapSummary var1;
      if (this.summary_ == null) {
         var1 = ExerciseLap$PbLapSummary.getDefaultInstance();
      } else {
         var1 = this.summary_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasSummary() {
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
         if (this.getAutoLapsCount() > 0) {
            var1 = (var2 * 37 + 1) * 53 + this.getAutoLapsList().hashCode();
         }

         var2 = var1;
         if (this.hasSummary()) {
            var2 = (var1 * 37 + 2) * 53 + this.getSummary().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseLap.H().ensureFieldAccessorsInitialized(ExerciseLap$PbAutoLaps.class, ExerciseLap$PbAutoLaps$Builder.class);
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
            int var4 = 0;

            while(true) {
               if (var4 >= this.getAutoLapsCount()) {
                  this.memoizedIsInitialized = (byte)1;
                  var3 = true;
                  break;
               }

               if (!this.getAutoLaps(var4).isInitialized()) {
                  this.memoizedIsInitialized = (byte)0;
                  var3 = var1;
                  break;
               }

               ++var4;
            }
         }
      }

      return var3;
   }

   public ExerciseLap$PbAutoLaps$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseLap$PbAutoLaps$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseLap$PbAutoLaps$Builder(var1, (ExerciseLap$1)null);
   }

   public ExerciseLap$PbAutoLaps$Builder toBuilder() {
      ExerciseLap$PbAutoLaps$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseLap$PbAutoLaps$Builder((ExerciseLap$1)null);
      } else {
         var1 = (new ExerciseLap$PbAutoLaps$Builder((ExerciseLap$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      for(int var2 = 0; var2 < this.autoLaps_.size(); ++var2) {
         var1.writeMessage(1, (MessageLite)this.autoLaps_.get(var2));
      }

      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(2, this.getSummary());
      }

      this.unknownFields.writeTo(var1);
   }
}
