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

public final class ExerciseSensors$PbExerciseSensors extends GeneratedMessageV3 implements ExerciseSensors$PbExerciseSensorsOrBuilder {
   private static final ExerciseSensors$PbExerciseSensors DEFAULT_INSTANCE = new ExerciseSensors$PbExerciseSensors();
   @Deprecated
   public static final Parser PARSER = new ExerciseSensors$PbExerciseSensors$1();
   public static final int SENSORS_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized;
   private List sensors_;

   private ExerciseSensors$PbExerciseSensors() {
      this.memoizedIsInitialized = (byte)-1;
      this.sensors_ = Collections.emptyList();
   }

   private ExerciseSensors$PbExerciseSensors(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseSensors$PbExerciseSensors(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseSensors$1 var3) {
      this(var1, var2);
   }

   private ExerciseSensors$PbExerciseSensors(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseSensors$PbExerciseSensors(Builder var1, ExerciseSensors$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static List a(ExerciseSensors$PbExerciseSensors var0) {
      return var0.sensors_;
   }

   // $FF: synthetic method
   static List a(ExerciseSensors$PbExerciseSensors var0, List var1) {
      var0.sensors_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(ExerciseSensors$PbExerciseSensors var0) {
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

   public static ExerciseSensors$PbExerciseSensors getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseSensors.c();
   }

   public static ExerciseSensors$PbExerciseSensors$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseSensors$PbExerciseSensors$Builder newBuilder(ExerciseSensors$PbExerciseSensors var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseSensors$PbExerciseSensors parseDelimitedFrom(InputStream var0) {
      return (ExerciseSensors$PbExerciseSensors)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseSensors$PbExerciseSensors parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseSensors$PbExerciseSensors)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseSensors$PbExerciseSensors parseFrom(ByteString var0) {
      return (ExerciseSensors$PbExerciseSensors)PARSER.parseFrom(var0);
   }

   public static ExerciseSensors$PbExerciseSensors parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseSensors$PbExerciseSensors)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseSensors$PbExerciseSensors parseFrom(CodedInputStream var0) {
      return (ExerciseSensors$PbExerciseSensors)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseSensors$PbExerciseSensors parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseSensors$PbExerciseSensors)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseSensors$PbExerciseSensors parseFrom(InputStream var0) {
      return (ExerciseSensors$PbExerciseSensors)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseSensors$PbExerciseSensors parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseSensors$PbExerciseSensors)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseSensors$PbExerciseSensors parseFrom(byte[] var0) {
      return (ExerciseSensors$PbExerciseSensors)PARSER.parseFrom(var0);
   }

   public static ExerciseSensors$PbExerciseSensors parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseSensors$PbExerciseSensors)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseSensors$PbExerciseSensors)) {
            var2 = super.equals(var1);
         } else {
            ExerciseSensors$PbExerciseSensors var4 = (ExerciseSensors$PbExerciseSensors)var1;
            boolean var3;
            if (this.getSensorsList().equals(var4.getSensorsList())) {
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

   public ExerciseSensors$PbExerciseSensors getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public ExerciseSensors$PbExerciseSensor getSensors(int var1) {
      return (ExerciseSensors$PbExerciseSensor)this.sensors_.get(var1);
   }

   public int getSensorsCount() {
      return this.sensors_.size();
   }

   public List getSensorsList() {
      return this.sensors_;
   }

   public ExerciseSensors$PbExerciseSensorOrBuilder getSensorsOrBuilder(int var1) {
      return (ExerciseSensors$PbExerciseSensorOrBuilder)this.sensors_.get(var1);
   }

   public List getSensorsOrBuilderList() {
      return this.sensors_;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;

         int var2;
         for(var2 = 0; var1 < this.sensors_.size(); ++var1) {
            var2 += CodedOutputStream.computeMessageSize(1, (MessageLite)this.sensors_.get(var1));
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
         if (this.getSensorsCount() > 0) {
            var1 = (var2 * 37 + 1) * 53 + this.getSensorsList().hashCode();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseSensors.d().ensureFieldAccessorsInitialized(ExerciseSensors$PbExerciseSensors.class, ExerciseSensors$PbExerciseSensors$Builder.class);
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
               if (var4 >= this.getSensorsCount()) {
                  this.memoizedIsInitialized = (byte)1;
                  var3 = true;
                  break;
               }

               if (!this.getSensors(var4).isInitialized()) {
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

   public ExerciseSensors$PbExerciseSensors$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseSensors$PbExerciseSensors$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseSensors$PbExerciseSensors$Builder(var1, (ExerciseSensors$1)null);
   }

   public ExerciseSensors$PbExerciseSensors$Builder toBuilder() {
      ExerciseSensors$PbExerciseSensors$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseSensors$PbExerciseSensors$Builder((ExerciseSensors$1)null);
      } else {
         var1 = (new ExerciseSensors$PbExerciseSensors$Builder((ExerciseSensors$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      for(int var2 = 0; var2 < this.sensors_.size(); ++var2) {
         var1.writeMessage(1, (MessageLite)this.sensors_.get(var2));
      }

      this.unknownFields.writeTo(var1);
   }
}
