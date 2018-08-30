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

public final class PhysData$PbSleepGoal extends GeneratedMessageV3 implements PhysData$PbSleepGoalOrBuilder {
   private static final PhysData$PbSleepGoal DEFAULT_INSTANCE = new PhysData$PbSleepGoal();
   @Deprecated
   public static final Parser PARSER = new PhysData$PbSleepGoal$1();
   public static final int SLEEP_GOAL_MINUTES_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private int sleepGoalMinutes_;

   private PhysData$PbSleepGoal() {
      this.memoizedIsInitialized = (byte)-1;
      this.sleepGoalMinutes_ = 0;
   }

   private PhysData$PbSleepGoal(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PhysData$PbSleepGoal(CodedInputStream var1, ExtensionRegistryLite var2, PhysData$1 var3) {
      this(var1, var2);
   }

   private PhysData$PbSleepGoal(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PhysData$PbSleepGoal(Builder var1, PhysData$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PhysData$PbSleepGoal var0, int var1) {
      var0.sleepGoalMinutes_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(PhysData$PbSleepGoal var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(PhysData$PbSleepGoal var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static PhysData$PbSleepGoal getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PhysData.w();
   }

   public static PhysData$PbSleepGoal$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PhysData$PbSleepGoal$Builder newBuilder(PhysData$PbSleepGoal var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PhysData$PbSleepGoal parseDelimitedFrom(InputStream var0) {
      return (PhysData$PbSleepGoal)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PhysData$PbSleepGoal parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PhysData$PbSleepGoal)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PhysData$PbSleepGoal parseFrom(ByteString var0) {
      return (PhysData$PbSleepGoal)PARSER.parseFrom(var0);
   }

   public static PhysData$PbSleepGoal parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PhysData$PbSleepGoal)PARSER.parseFrom(var0, var1);
   }

   public static PhysData$PbSleepGoal parseFrom(CodedInputStream var0) {
      return (PhysData$PbSleepGoal)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PhysData$PbSleepGoal parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PhysData$PbSleepGoal)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PhysData$PbSleepGoal parseFrom(InputStream var0) {
      return (PhysData$PbSleepGoal)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PhysData$PbSleepGoal parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PhysData$PbSleepGoal)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PhysData$PbSleepGoal parseFrom(byte[] var0) {
      return (PhysData$PbSleepGoal)PARSER.parseFrom(var0);
   }

   public static PhysData$PbSleepGoal parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PhysData$PbSleepGoal)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PhysData$PbSleepGoal)) {
            var2 = super.equals(var1);
         } else {
            PhysData$PbSleepGoal var5 = (PhysData$PbSleepGoal)var1;
            boolean var3;
            if (this.hasSleepGoalMinutes() == var5.hasSleepGoalMinutes()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasSleepGoalMinutes()) {
               if (var3 && this.getSleepGoalMinutes() == var5.getSleepGoalMinutes()) {
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

   public PhysData$PbSleepGoal getDefaultInstanceForType() {
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
            var1 = 0 + CodedOutputStream.computeUInt32Size(1, this.sleepGoalMinutes_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public int getSleepGoalMinutes() {
      return this.sleepGoalMinutes_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasSleepGoalMinutes() {
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
         if (this.hasSleepGoalMinutes()) {
            var1 = (var2 * 37 + 1) * 53 + this.getSleepGoalMinutes();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PhysData.x().ensureFieldAccessorsInitialized(PhysData$PbSleepGoal.class, PhysData$PbSleepGoal$Builder.class);
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

   public PhysData$PbSleepGoal$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PhysData$PbSleepGoal$Builder newBuilderForType(BuilderParent var1) {
      return new PhysData$PbSleepGoal$Builder(var1, (PhysData$1)null);
   }

   public PhysData$PbSleepGoal$Builder toBuilder() {
      PhysData$PbSleepGoal$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PhysData$PbSleepGoal$Builder((PhysData$1)null);
      } else {
         var1 = (new PhysData$PbSleepGoal$Builder((PhysData$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.sleepGoalMinutes_);
      }

      this.unknownFields.writeTo(var1);
   }
}
