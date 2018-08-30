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

public final class ExerciseRRSamples$PbRROffline extends GeneratedMessageV3 implements ExerciseRRSamples$PbRROfflineOrBuilder {
   private static final ExerciseRRSamples$PbRROffline DEFAULT_INSTANCE = new ExerciseRRSamples$PbRROffline();
   @Deprecated
   public static final Parser PARSER = new ExerciseRRSamples$PbRROffline$1();
   public static final int START_TIME_FIELD_NUMBER = 1;
   public static final int TIME_INTERVAL_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private Types$PbDuration startTime_;
   private Types$PbDuration timeInterval_;

   private ExerciseRRSamples$PbRROffline() {
      this.memoizedIsInitialized = (byte)-1;
   }

   private ExerciseRRSamples$PbRROffline(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseRRSamples$PbRROffline(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseRRSamples$1 var3) {
      this(var1, var2);
   }

   private ExerciseRRSamples$PbRROffline(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseRRSamples$PbRROffline(Builder var1, ExerciseRRSamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(ExerciseRRSamples$PbRROffline var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExerciseRRSamples$PbRROffline var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbDuration a(ExerciseRRSamples$PbRROffline var0, Types$PbDuration var1) {
      var0.startTime_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration b(ExerciseRRSamples$PbRROffline var0, Types$PbDuration var1) {
      var0.timeInterval_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static ExerciseRRSamples$PbRROffline getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseRRSamples.a();
   }

   public static ExerciseRRSamples$PbRROffline$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseRRSamples$PbRROffline$Builder newBuilder(ExerciseRRSamples$PbRROffline var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseRRSamples$PbRROffline parseDelimitedFrom(InputStream var0) {
      return (ExerciseRRSamples$PbRROffline)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseRRSamples$PbRROffline parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseRRSamples$PbRROffline)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseRRSamples$PbRROffline parseFrom(ByteString var0) {
      return (ExerciseRRSamples$PbRROffline)PARSER.parseFrom(var0);
   }

   public static ExerciseRRSamples$PbRROffline parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseRRSamples$PbRROffline)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseRRSamples$PbRROffline parseFrom(CodedInputStream var0) {
      return (ExerciseRRSamples$PbRROffline)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseRRSamples$PbRROffline parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseRRSamples$PbRROffline)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseRRSamples$PbRROffline parseFrom(InputStream var0) {
      return (ExerciseRRSamples$PbRROffline)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseRRSamples$PbRROffline parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseRRSamples$PbRROffline)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseRRSamples$PbRROffline parseFrom(byte[] var0) {
      return (ExerciseRRSamples$PbRROffline)PARSER.parseFrom(var0);
   }

   public static ExerciseRRSamples$PbRROffline parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseRRSamples$PbRROffline)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseRRSamples$PbRROffline)) {
            var2 = super.equals(var1);
         } else {
            ExerciseRRSamples$PbRROffline var5 = (ExerciseRRSamples$PbRROffline)var1;
            boolean var3;
            if (this.hasStartTime() == var5.hasStartTime()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasStartTime()) {
               if (var3 && this.getStartTime().equals(var5.getStartTime())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTimeInterval() == var5.hasTimeInterval()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasTimeInterval()) {
               if (var4 && this.getTimeInterval().equals(var5.getTimeInterval())) {
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

   public ExerciseRRSamples$PbRROffline getDefaultInstanceForType() {
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
            var1 = 0 + CodedOutputStream.computeMessageSize(1, this.getStartTime());
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeMessageSize(2, this.getTimeInterval());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public Types$PbDuration getStartTime() {
      Types$PbDuration var1;
      if (this.startTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.startTime_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getStartTimeOrBuilder() {
      Types$PbDuration var1;
      if (this.startTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.startTime_;
      }

      return var1;
   }

   public Types$PbDuration getTimeInterval() {
      Types$PbDuration var1;
      if (this.timeInterval_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeInterval_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getTimeIntervalOrBuilder() {
      Types$PbDuration var1;
      if (this.timeInterval_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeInterval_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasStartTime() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeInterval() {
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
         if (this.hasStartTime()) {
            var1 = (var2 * 37 + 1) * 53 + this.getStartTime().hashCode();
         }

         var2 = var1;
         if (this.hasTimeInterval()) {
            var2 = (var1 * 37 + 2) * 53 + this.getTimeInterval().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseRRSamples.b().ensureFieldAccessorsInitialized(ExerciseRRSamples$PbRROffline.class, ExerciseRRSamples$PbRROffline$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasStartTime()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasTimeInterval()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public ExerciseRRSamples$PbRROffline$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseRRSamples$PbRROffline$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseRRSamples$PbRROffline$Builder(var1, (ExerciseRRSamples$1)null);
   }

   public ExerciseRRSamples$PbRROffline$Builder toBuilder() {
      ExerciseRRSamples$PbRROffline$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseRRSamples$PbRROffline$Builder((ExerciseRRSamples$1)null);
      } else {
         var1 = (new ExerciseRRSamples$PbRROffline$Builder((ExerciseRRSamples$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getStartTime());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getTimeInterval());
      }

      this.unknownFields.writeTo(var1);
   }
}
