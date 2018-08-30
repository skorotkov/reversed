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

public final class Training$PbExerciseCounters extends GeneratedMessageV3 implements Training$PbExerciseCountersOrBuilder {
   private static final Training$PbExerciseCounters DEFAULT_INSTANCE = new Training$PbExerciseCounters();
   @Deprecated
   public static final Parser PARSER = new Training$PbExerciseCounters$1();
   public static final int SPRINT_COUNT_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private int sprintCount_;

   private Training$PbExerciseCounters() {
      this.memoizedIsInitialized = (byte)-1;
      this.sprintCount_ = 0;
   }

   private Training$PbExerciseCounters(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Training$PbExerciseCounters(CodedInputStream var1, ExtensionRegistryLite var2, Training$1 var3) {
      this(var1, var2);
   }

   private Training$PbExerciseCounters(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Training$PbExerciseCounters(Builder var1, Training$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Training$PbExerciseCounters var0, int var1) {
      var0.sprintCount_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Training$PbExerciseCounters var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(Training$PbExerciseCounters var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static Training$PbExerciseCounters getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Training.a();
   }

   public static Training$PbExerciseCounters$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Training$PbExerciseCounters$Builder newBuilder(Training$PbExerciseCounters var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Training$PbExerciseCounters parseDelimitedFrom(InputStream var0) {
      return (Training$PbExerciseCounters)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Training$PbExerciseCounters parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Training$PbExerciseCounters)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Training$PbExerciseCounters parseFrom(ByteString var0) {
      return (Training$PbExerciseCounters)PARSER.parseFrom(var0);
   }

   public static Training$PbExerciseCounters parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Training$PbExerciseCounters)PARSER.parseFrom(var0, var1);
   }

   public static Training$PbExerciseCounters parseFrom(CodedInputStream var0) {
      return (Training$PbExerciseCounters)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Training$PbExerciseCounters parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Training$PbExerciseCounters)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Training$PbExerciseCounters parseFrom(InputStream var0) {
      return (Training$PbExerciseCounters)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Training$PbExerciseCounters parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Training$PbExerciseCounters)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Training$PbExerciseCounters parseFrom(byte[] var0) {
      return (Training$PbExerciseCounters)PARSER.parseFrom(var0);
   }

   public static Training$PbExerciseCounters parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Training$PbExerciseCounters)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Training$PbExerciseCounters)) {
            var2 = super.equals(var1);
         } else {
            Training$PbExerciseCounters var5 = (Training$PbExerciseCounters)var1;
            boolean var3;
            if (this.hasSprintCount() == var5.hasSprintCount()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasSprintCount()) {
               if (var3 && this.getSprintCount() == var5.getSprintCount()) {
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

   public Training$PbExerciseCounters getDefaultInstanceForType() {
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
            var1 = 0 + CodedOutputStream.computeUInt32Size(1, this.sprintCount_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public int getSprintCount() {
      return this.sprintCount_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasSprintCount() {
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
         if (this.hasSprintCount()) {
            var1 = (var2 * 37 + 1) * 53 + this.getSprintCount();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Training.b().ensureFieldAccessorsInitialized(Training$PbExerciseCounters.class, Training$PbExerciseCounters$Builder.class);
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

   public Training$PbExerciseCounters$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Training$PbExerciseCounters$Builder newBuilderForType(BuilderParent var1) {
      return new Training$PbExerciseCounters$Builder(var1, (Training$1)null);
   }

   public Training$PbExerciseCounters$Builder toBuilder() {
      Training$PbExerciseCounters$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Training$PbExerciseCounters$Builder((Training$1)null);
      } else {
         var1 = (new Training$PbExerciseCounters$Builder((Training$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.sprintCount_);
      }

      this.unknownFields.writeTo(var1);
   }
}
