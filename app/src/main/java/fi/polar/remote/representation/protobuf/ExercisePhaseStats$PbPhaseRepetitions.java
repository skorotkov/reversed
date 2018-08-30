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

public final class ExercisePhaseStats$PbPhaseRepetitions extends GeneratedMessageV3 implements ExercisePhaseStats$PbPhaseRepetitionsOrBuilder {
   private static final ExercisePhaseStats$PbPhaseRepetitions DEFAULT_INSTANCE = new ExercisePhaseStats$PbPhaseRepetitions();
   @Deprecated
   public static final Parser PARSER = new ExercisePhaseStats$PbPhaseRepetitions$1();
   public static final int PHASE_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized;
   private List phase_;

   private ExercisePhaseStats$PbPhaseRepetitions() {
      this.memoizedIsInitialized = (byte)-1;
      this.phase_ = Collections.emptyList();
   }

   private ExercisePhaseStats$PbPhaseRepetitions(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExercisePhaseStats$PbPhaseRepetitions(CodedInputStream var1, ExtensionRegistryLite var2, ExercisePhaseStats$1 var3) {
      this(var1, var2);
   }

   private ExercisePhaseStats$PbPhaseRepetitions(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExercisePhaseStats$PbPhaseRepetitions(Builder var1, ExercisePhaseStats$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static List a(ExercisePhaseStats$PbPhaseRepetitions var0) {
      return var0.phase_;
   }

   // $FF: synthetic method
   static List a(ExercisePhaseStats$PbPhaseRepetitions var0, List var1) {
      var0.phase_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(ExercisePhaseStats$PbPhaseRepetitions var0) {
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

   public static ExercisePhaseStats$PbPhaseRepetitions getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExercisePhaseStats.g();
   }

   public static ExercisePhaseStats$PbPhaseRepetitions$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExercisePhaseStats$PbPhaseRepetitions$Builder newBuilder(ExercisePhaseStats$PbPhaseRepetitions var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExercisePhaseStats$PbPhaseRepetitions parseDelimitedFrom(InputStream var0) {
      return (ExercisePhaseStats$PbPhaseRepetitions)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExercisePhaseStats$PbPhaseRepetitions parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExercisePhaseStats$PbPhaseRepetitions)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExercisePhaseStats$PbPhaseRepetitions parseFrom(ByteString var0) {
      return (ExercisePhaseStats$PbPhaseRepetitions)PARSER.parseFrom(var0);
   }

   public static ExercisePhaseStats$PbPhaseRepetitions parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExercisePhaseStats$PbPhaseRepetitions)PARSER.parseFrom(var0, var1);
   }

   public static ExercisePhaseStats$PbPhaseRepetitions parseFrom(CodedInputStream var0) {
      return (ExercisePhaseStats$PbPhaseRepetitions)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExercisePhaseStats$PbPhaseRepetitions parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExercisePhaseStats$PbPhaseRepetitions)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExercisePhaseStats$PbPhaseRepetitions parseFrom(InputStream var0) {
      return (ExercisePhaseStats$PbPhaseRepetitions)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExercisePhaseStats$PbPhaseRepetitions parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExercisePhaseStats$PbPhaseRepetitions)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExercisePhaseStats$PbPhaseRepetitions parseFrom(byte[] var0) {
      return (ExercisePhaseStats$PbPhaseRepetitions)PARSER.parseFrom(var0);
   }

   public static ExercisePhaseStats$PbPhaseRepetitions parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExercisePhaseStats$PbPhaseRepetitions)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExercisePhaseStats$PbPhaseRepetitions)) {
            var2 = super.equals(var1);
         } else {
            ExercisePhaseStats$PbPhaseRepetitions var4 = (ExercisePhaseStats$PbPhaseRepetitions)var1;
            boolean var3;
            if (this.getPhaseList().equals(var4.getPhaseList())) {
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

   public ExercisePhaseStats$PbPhaseRepetitions getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public ExercisePhaseStats$PbPhaseRepetition getPhase(int var1) {
      return (ExercisePhaseStats$PbPhaseRepetition)this.phase_.get(var1);
   }

   public int getPhaseCount() {
      return this.phase_.size();
   }

   public List getPhaseList() {
      return this.phase_;
   }

   public ExercisePhaseStats$PbPhaseRepetitionOrBuilder getPhaseOrBuilder(int var1) {
      return (ExercisePhaseStats$PbPhaseRepetitionOrBuilder)this.phase_.get(var1);
   }

   public List getPhaseOrBuilderList() {
      return this.phase_;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;

         int var2;
         for(var2 = 0; var1 < this.phase_.size(); ++var1) {
            var2 += CodedOutputStream.computeMessageSize(1, (MessageLite)this.phase_.get(var1));
         }

         var1 = this.unknownFields.getSerializedSize() + var2;
         this.memoizedSize = var1;
      }

      return var1;
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
         if (this.getPhaseCount() > 0) {
            var1 = (var2 * 37 + 1) * 53 + this.getPhaseList().hashCode();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExercisePhaseStats.h().ensureFieldAccessorsInitialized(ExercisePhaseStats$PbPhaseRepetitions.class, ExercisePhaseStats$PbPhaseRepetitions$Builder.class);
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
               if (var4 >= this.getPhaseCount()) {
                  this.memoizedIsInitialized = (byte)1;
                  var3 = true;
                  break;
               }

               if (!this.getPhase(var4).isInitialized()) {
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

   public ExercisePhaseStats$PbPhaseRepetitions$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExercisePhaseStats$PbPhaseRepetitions$Builder newBuilderForType(BuilderParent var1) {
      return new ExercisePhaseStats$PbPhaseRepetitions$Builder(var1, (ExercisePhaseStats$1)null);
   }

   public ExercisePhaseStats$PbPhaseRepetitions$Builder toBuilder() {
      ExercisePhaseStats$PbPhaseRepetitions$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExercisePhaseStats$PbPhaseRepetitions$Builder((ExercisePhaseStats$1)null);
      } else {
         var1 = (new ExercisePhaseStats$PbPhaseRepetitions$Builder((ExercisePhaseStats$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      for(int var2 = 0; var2 < this.phase_.size(); ++var2) {
         var1.writeMessage(1, (MessageLite)this.phase_.get(var2));
      }

      this.unknownFields.writeTo(var1);
   }
}
