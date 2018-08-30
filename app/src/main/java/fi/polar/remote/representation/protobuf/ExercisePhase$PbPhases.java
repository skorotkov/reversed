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

public final class ExercisePhase$PbPhases extends GeneratedMessageV3 implements ExercisePhase$PbPhasesOrBuilder {
   private static final ExercisePhase$PbPhases DEFAULT_INSTANCE = new ExercisePhase$PbPhases();
   @Deprecated
   public static final Parser PARSER = new ExercisePhase$PbPhases$1();
   public static final int PHASE_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized;
   private List phase_;

   private ExercisePhase$PbPhases() {
      this.memoizedIsInitialized = (byte)-1;
      this.phase_ = Collections.emptyList();
   }

   private ExercisePhase$PbPhases(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExercisePhase$PbPhases(CodedInputStream var1, ExtensionRegistryLite var2, ExercisePhase$1 var3) {
      this(var1, var2);
   }

   private ExercisePhase$PbPhases(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExercisePhase$PbPhases(Builder var1, ExercisePhase$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static List a(ExercisePhase$PbPhases var0) {
      return var0.phase_;
   }

   // $FF: synthetic method
   static List a(ExercisePhase$PbPhases var0, List var1) {
      var0.phase_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(ExercisePhase$PbPhases var0) {
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

   public static ExercisePhase$PbPhases getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExercisePhase.i();
   }

   public static ExercisePhase$PbPhases$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExercisePhase$PbPhases$Builder newBuilder(ExercisePhase$PbPhases var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExercisePhase$PbPhases parseDelimitedFrom(InputStream var0) {
      return (ExercisePhase$PbPhases)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExercisePhase$PbPhases parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExercisePhase$PbPhases)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExercisePhase$PbPhases parseFrom(ByteString var0) {
      return (ExercisePhase$PbPhases)PARSER.parseFrom(var0);
   }

   public static ExercisePhase$PbPhases parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExercisePhase$PbPhases)PARSER.parseFrom(var0, var1);
   }

   public static ExercisePhase$PbPhases parseFrom(CodedInputStream var0) {
      return (ExercisePhase$PbPhases)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExercisePhase$PbPhases parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExercisePhase$PbPhases)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExercisePhase$PbPhases parseFrom(InputStream var0) {
      return (ExercisePhase$PbPhases)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExercisePhase$PbPhases parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExercisePhase$PbPhases)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExercisePhase$PbPhases parseFrom(byte[] var0) {
      return (ExercisePhase$PbPhases)PARSER.parseFrom(var0);
   }

   public static ExercisePhase$PbPhases parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExercisePhase$PbPhases)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExercisePhase$PbPhases)) {
            var2 = super.equals(var1);
         } else {
            ExercisePhase$PbPhases var4 = (ExercisePhase$PbPhases)var1;
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

   public ExercisePhase$PbPhases getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public ExercisePhase$PbPhase getPhase(int var1) {
      return (ExercisePhase$PbPhase)this.phase_.get(var1);
   }

   public int getPhaseCount() {
      return this.phase_.size();
   }

   public List getPhaseList() {
      return this.phase_;
   }

   public ExercisePhase$PbPhaseOrBuilder getPhaseOrBuilder(int var1) {
      return (ExercisePhase$PbPhaseOrBuilder)this.phase_.get(var1);
   }

   public List getPhaseOrBuilderList() {
      return this.phase_;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;

         for(var1 = 0; var2 < this.phase_.size(); ++var2) {
            var1 += CodedOutputStream.computeMessageSize(1, (MessageLite)this.phase_.get(var2));
         }

         var1 += this.unknownFields.getSerializedSize();
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
      return ExercisePhase.j().ensureFieldAccessorsInitialized(ExercisePhase$PbPhases.class, ExercisePhase$PbPhases$Builder.class);
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

   public ExercisePhase$PbPhases$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExercisePhase$PbPhases$Builder newBuilderForType(BuilderParent var1) {
      return new ExercisePhase$PbPhases$Builder(var1, (ExercisePhase$1)null);
   }

   public ExercisePhase$PbPhases$Builder toBuilder() {
      ExercisePhase$PbPhases$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExercisePhase$PbPhases$Builder((ExercisePhase$1)null);
      } else {
         var1 = (new ExercisePhase$PbPhases$Builder((ExercisePhase$1)null)).mergeFrom(this);
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
