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

public final class ExerciseRRSamples$PbExerciseRRIntervals extends GeneratedMessageV3 implements ExerciseRRSamples$PbExerciseRRIntervalsOrBuilder {
   private static final ExerciseRRSamples$PbExerciseRRIntervals DEFAULT_INSTANCE = new ExerciseRRSamples$PbExerciseRRIntervals();
   @Deprecated
   public static final Parser PARSER = new ExerciseRRSamples$PbExerciseRRIntervals$1();
   public static final int RR_INTERVALS_FIELD_NUMBER = 1;
   public static final int RR_SENSOR_OFFLINE_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized;
   private int rrIntervalsMemoizedSerializedSize;
   private List rrIntervals_;
   private List rrSensorOffline_;

   private ExerciseRRSamples$PbExerciseRRIntervals() {
      this.rrIntervalsMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = (byte)-1;
      this.rrIntervals_ = Collections.emptyList();
      this.rrSensorOffline_ = Collections.emptyList();
   }

   private ExerciseRRSamples$PbExerciseRRIntervals(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseRRSamples$PbExerciseRRIntervals(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseRRSamples$1 var3) {
      this(var1, var2);
   }

   private ExerciseRRSamples$PbExerciseRRIntervals(Builder var1) {
      super(var1);
      this.rrIntervalsMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseRRSamples$PbExerciseRRIntervals(Builder var1, ExerciseRRSamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static List a(ExerciseRRSamples$PbExerciseRRIntervals var0) {
      return var0.rrIntervals_;
   }

   // $FF: synthetic method
   static List a(ExerciseRRSamples$PbExerciseRRIntervals var0, List var1) {
      var0.rrIntervals_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static List b(ExerciseRRSamples$PbExerciseRRIntervals var0) {
      return var0.rrSensorOffline_;
   }

   // $FF: synthetic method
   static List b(ExerciseRRSamples$PbExerciseRRIntervals var0, List var1) {
      var0.rrSensorOffline_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static UnknownFieldSet c(ExerciseRRSamples$PbExerciseRRIntervals var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean c() {
      return alwaysUseFieldBuilders;
   }

   public static ExerciseRRSamples$PbExerciseRRIntervals getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseRRSamples.c();
   }

   public static ExerciseRRSamples$PbExerciseRRIntervals$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseRRSamples$PbExerciseRRIntervals$Builder newBuilder(ExerciseRRSamples$PbExerciseRRIntervals var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseRRSamples$PbExerciseRRIntervals parseDelimitedFrom(InputStream var0) {
      return (ExerciseRRSamples$PbExerciseRRIntervals)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseRRSamples$PbExerciseRRIntervals parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseRRSamples$PbExerciseRRIntervals)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseRRSamples$PbExerciseRRIntervals parseFrom(ByteString var0) {
      return (ExerciseRRSamples$PbExerciseRRIntervals)PARSER.parseFrom(var0);
   }

   public static ExerciseRRSamples$PbExerciseRRIntervals parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseRRSamples$PbExerciseRRIntervals)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseRRSamples$PbExerciseRRIntervals parseFrom(CodedInputStream var0) {
      return (ExerciseRRSamples$PbExerciseRRIntervals)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseRRSamples$PbExerciseRRIntervals parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseRRSamples$PbExerciseRRIntervals)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseRRSamples$PbExerciseRRIntervals parseFrom(InputStream var0) {
      return (ExerciseRRSamples$PbExerciseRRIntervals)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseRRSamples$PbExerciseRRIntervals parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseRRSamples$PbExerciseRRIntervals)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseRRSamples$PbExerciseRRIntervals parseFrom(byte[] var0) {
      return (ExerciseRRSamples$PbExerciseRRIntervals)PARSER.parseFrom(var0);
   }

   public static ExerciseRRSamples$PbExerciseRRIntervals parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseRRSamples$PbExerciseRRIntervals)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseRRSamples$PbExerciseRRIntervals)) {
            var2 = super.equals(var1);
         } else {
            ExerciseRRSamples$PbExerciseRRIntervals var4 = (ExerciseRRSamples$PbExerciseRRIntervals)var1;
            boolean var3;
            if (this.getRrIntervalsList().equals(var4.getRrIntervalsList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (var3 && this.getRrSensorOfflineList().equals(var4.getRrSensorOfflineList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (!var3 || !this.unknownFields.equals(var4.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public ExerciseRRSamples$PbExerciseRRIntervals getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getRrIntervals(int var1) {
      return (Integer)this.rrIntervals_.get(var1);
   }

   public int getRrIntervalsCount() {
      return this.rrIntervals_.size();
   }

   public List getRrIntervalsList() {
      return this.rrIntervals_;
   }

   public ExerciseRRSamples$PbRROffline getRrSensorOffline(int var1) {
      return (ExerciseRRSamples$PbRROffline)this.rrSensorOffline_.get(var1);
   }

   public int getRrSensorOfflineCount() {
      return this.rrSensorOffline_.size();
   }

   public List getRrSensorOfflineList() {
      return this.rrSensorOffline_;
   }

   public ExerciseRRSamples$PbRROfflineOrBuilder getRrSensorOfflineOrBuilder(int var1) {
      return (ExerciseRRSamples$PbRROfflineOrBuilder)this.rrSensorOffline_.get(var1);
   }

   public List getRrSensorOfflineOrBuilderList() {
      return this.rrSensorOffline_;
   }

   public int getSerializedSize() {
      byte var1 = 0;
      int var2 = this.memoizedSize;
      if (var2 == -1) {
         var2 = 0;

         int var3;
         for(var3 = 0; var2 < this.rrIntervals_.size(); ++var2) {
            var3 += CodedOutputStream.computeUInt32SizeNoTag((Integer)this.rrIntervals_.get(var2));
         }

         int var4 = 0 + var3;
         var2 = var4;
         if (!this.getRrIntervalsList().isEmpty()) {
            var2 = var4 + 1 + CodedOutputStream.computeInt32SizeNoTag(var3);
         }

         this.rrIntervalsMemoizedSerializedSize = var3;
         var3 = var2;

         int var5;
         for(var2 = var1; var2 < this.rrSensorOffline_.size(); var3 += var5) {
            var5 = CodedOutputStream.computeMessageSize(2, (MessageLite)this.rrSensorOffline_.get(var2));
            ++var2;
         }

         var2 = this.unknownFields.getSerializedSize() + var3;
         this.memoizedSize = var2;
      }

      return var2;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.getRrIntervalsCount() > 0) {
            var1 = (var2 * 37 + 1) * 53 + this.getRrIntervalsList().hashCode();
         }

         var2 = var1;
         if (this.getRrSensorOfflineCount() > 0) {
            var2 = (var1 * 37 + 2) * 53 + this.getRrSensorOfflineList().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseRRSamples.d().ensureFieldAccessorsInitialized(ExerciseRRSamples$PbExerciseRRIntervals.class, ExerciseRRSamples$PbExerciseRRIntervals$Builder.class);
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
               if (var4 >= this.getRrSensorOfflineCount()) {
                  this.memoizedIsInitialized = (byte)1;
                  var3 = true;
                  break;
               }

               if (!this.getRrSensorOffline(var4).isInitialized()) {
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

   public ExerciseRRSamples$PbExerciseRRIntervals$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseRRSamples$PbExerciseRRIntervals$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseRRSamples$PbExerciseRRIntervals$Builder(var1, (ExerciseRRSamples$1)null);
   }

   public ExerciseRRSamples$PbExerciseRRIntervals$Builder toBuilder() {
      ExerciseRRSamples$PbExerciseRRIntervals$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseRRSamples$PbExerciseRRIntervals$Builder((ExerciseRRSamples$1)null);
      } else {
         var1 = (new ExerciseRRSamples$PbExerciseRRIntervals$Builder((ExerciseRRSamples$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      byte var2 = 0;
      this.getSerializedSize();
      if (this.getRrIntervalsList().size() > 0) {
         var1.writeUInt32NoTag(10);
         var1.writeUInt32NoTag(this.rrIntervalsMemoizedSerializedSize);
      }

      int var3 = 0;

      while(true) {
         int var4 = var2;
         if (var3 >= this.rrIntervals_.size()) {
            while(var4 < this.rrSensorOffline_.size()) {
               var1.writeMessage(2, (MessageLite)this.rrSensorOffline_.get(var4));
               ++var4;
            }

            this.unknownFields.writeTo(var1);
            return;
         }

         var1.writeUInt32NoTag((Integer)this.rrIntervals_.get(var3));
         ++var3;
      }
   }
}
