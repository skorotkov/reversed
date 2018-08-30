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

public final class DailyActivityGoal$PbDailyActivityGoal extends GeneratedMessageV3 implements DailyActivityGoal$PbDailyActivityGoalOrBuilder {
   public static final int ACTIVITY_METMIN_GOAL_FIELD_NUMBER = 1;
   private static final DailyActivityGoal$PbDailyActivityGoal DEFAULT_INSTANCE = new DailyActivityGoal$PbDailyActivityGoal();
   public static final int GOAL_TYPE_FIELD_NUMBER = 3;
   public static final int LAST_MODIFIED_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new DailyActivityGoal$PbDailyActivityGoal$1();
   public static final int POLAR_BALANCE_GOAL_FIELD_NUMBER = 4;
   private static final long serialVersionUID = 0L;
   private DailyActivityGoal$PbActivityMetMinGoal activityMetminGoal_;
   private int bitField0_;
   private int goalType_;
   private Types$PbSystemDateTime lastModified_;
   private byte memoizedIsInitialized;
   private DailyActivityGoal$PbPolarBalanceGoal polarBalanceGoal_;

   private DailyActivityGoal$PbDailyActivityGoal() {
      this.memoizedIsInitialized = (byte)-1;
      this.goalType_ = 1;
   }

   private DailyActivityGoal$PbDailyActivityGoal(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   DailyActivityGoal$PbDailyActivityGoal(CodedInputStream var1, ExtensionRegistryLite var2, DailyActivityGoal$1 var3) {
      this(var1, var2);
   }

   private DailyActivityGoal$PbDailyActivityGoal(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   DailyActivityGoal$PbDailyActivityGoal(Builder var1, DailyActivityGoal$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(DailyActivityGoal$PbDailyActivityGoal var0, int var1) {
      var0.goalType_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(DailyActivityGoal$PbDailyActivityGoal var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static DailyActivityGoal$PbActivityMetMinGoal a(DailyActivityGoal$PbDailyActivityGoal var0, DailyActivityGoal$PbActivityMetMinGoal var1) {
      var0.activityMetminGoal_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static DailyActivityGoal$PbPolarBalanceGoal a(DailyActivityGoal$PbDailyActivityGoal var0, DailyActivityGoal$PbPolarBalanceGoal var1) {
      var0.polarBalanceGoal_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime a(DailyActivityGoal$PbDailyActivityGoal var0, Types$PbSystemDateTime var1) {
      var0.lastModified_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(DailyActivityGoal$PbDailyActivityGoal var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static DailyActivityGoal$PbDailyActivityGoal getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return DailyActivityGoal.e();
   }

   public static DailyActivityGoal$PbDailyActivityGoal$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DailyActivityGoal$PbDailyActivityGoal$Builder newBuilder(DailyActivityGoal$PbDailyActivityGoal var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static DailyActivityGoal$PbDailyActivityGoal parseDelimitedFrom(InputStream var0) {
      return (DailyActivityGoal$PbDailyActivityGoal)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DailyActivityGoal$PbDailyActivityGoal parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (DailyActivityGoal$PbDailyActivityGoal)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DailyActivityGoal$PbDailyActivityGoal parseFrom(ByteString var0) {
      return (DailyActivityGoal$PbDailyActivityGoal)PARSER.parseFrom(var0);
   }

   public static DailyActivityGoal$PbDailyActivityGoal parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (DailyActivityGoal$PbDailyActivityGoal)PARSER.parseFrom(var0, var1);
   }

   public static DailyActivityGoal$PbDailyActivityGoal parseFrom(CodedInputStream var0) {
      return (DailyActivityGoal$PbDailyActivityGoal)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DailyActivityGoal$PbDailyActivityGoal parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (DailyActivityGoal$PbDailyActivityGoal)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DailyActivityGoal$PbDailyActivityGoal parseFrom(InputStream var0) {
      return (DailyActivityGoal$PbDailyActivityGoal)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DailyActivityGoal$PbDailyActivityGoal parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (DailyActivityGoal$PbDailyActivityGoal)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DailyActivityGoal$PbDailyActivityGoal parseFrom(byte[] var0) {
      return (DailyActivityGoal$PbDailyActivityGoal)PARSER.parseFrom(var0);
   }

   public static DailyActivityGoal$PbDailyActivityGoal parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (DailyActivityGoal$PbDailyActivityGoal)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof DailyActivityGoal$PbDailyActivityGoal)) {
            var2 = super.equals(var1);
         } else {
            DailyActivityGoal$PbDailyActivityGoal var5 = (DailyActivityGoal$PbDailyActivityGoal)var1;
            boolean var3;
            if (this.hasGoalType() == var5.hasGoalType()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasGoalType()) {
               if (var3 && this.goalType_ == var5.goalType_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasActivityMetminGoal() == var5.hasActivityMetminGoal()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasActivityMetminGoal()) {
               if (var3 && this.getActivityMetminGoal().equals(var5.getActivityMetminGoal())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasLastModified() == var5.hasLastModified()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasLastModified()) {
               if (var3 && this.getLastModified().equals(var5.getLastModified())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasPolarBalanceGoal() == var5.hasPolarBalanceGoal()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasPolarBalanceGoal()) {
               if (var4 && this.getPolarBalanceGoal().equals(var5.getPolarBalanceGoal())) {
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

   public DailyActivityGoal$PbActivityMetMinGoal getActivityMetminGoal() {
      DailyActivityGoal$PbActivityMetMinGoal var1;
      if (this.activityMetminGoal_ == null) {
         var1 = DailyActivityGoal$PbActivityMetMinGoal.getDefaultInstance();
      } else {
         var1 = this.activityMetminGoal_;
      }

      return var1;
   }

   public DailyActivityGoal$PbActivityMetMinGoalOrBuilder getActivityMetminGoalOrBuilder() {
      DailyActivityGoal$PbActivityMetMinGoal var1;
      if (this.activityMetminGoal_ == null) {
         var1 = DailyActivityGoal$PbActivityMetMinGoal.getDefaultInstance();
      } else {
         var1 = this.activityMetminGoal_;
      }

      return var1;
   }

   public DailyActivityGoal$PbDailyActivityGoal getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public DailyActivityGoal$PbDailyActivityGoal$PbActivityGoalType getGoalType() {
      DailyActivityGoal$PbDailyActivityGoal$PbActivityGoalType var1 = DailyActivityGoal$PbDailyActivityGoal$PbActivityGoalType.valueOf(this.goalType_);
      DailyActivityGoal$PbDailyActivityGoal$PbActivityGoalType var2 = var1;
      if (var1 == null) {
         var2 = DailyActivityGoal$PbDailyActivityGoal$PbActivityGoalType.ACTIVITY_GOAL_DAILY_ACTIVITY;
      }

      return var2;
   }

   public Types$PbSystemDateTime getLastModified() {
      Types$PbSystemDateTime var1;
      if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
      }

      return var1;
   }

   public Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder() {
      Types$PbSystemDateTime var1;
      if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
      }

      return var1;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public DailyActivityGoal$PbPolarBalanceGoal getPolarBalanceGoal() {
      DailyActivityGoal$PbPolarBalanceGoal var1;
      if (this.polarBalanceGoal_ == null) {
         var1 = DailyActivityGoal$PbPolarBalanceGoal.getDefaultInstance();
      } else {
         var1 = this.polarBalanceGoal_;
      }

      return var1;
   }

   public DailyActivityGoal$PbPolarBalanceGoalOrBuilder getPolarBalanceGoalOrBuilder() {
      DailyActivityGoal$PbPolarBalanceGoal var1;
      if (this.polarBalanceGoal_ == null) {
         var1 = DailyActivityGoal$PbPolarBalanceGoal.getDefaultInstance();
      } else {
         var1 = this.polarBalanceGoal_;
      }

      return var1;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 2) == 2) {
            var1 = 0 + CodedOutputStream.computeMessageSize(1, this.getActivityMetminGoal());
         }

         int var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeMessageSize(2, this.getLastModified());
         }

         var1 = var2;
         if ((this.bitField0_ & 1) == 1) {
            var1 = var2 + CodedOutputStream.computeEnumSize(3, this.goalType_);
         }

         var2 = var1;
         if ((this.bitField0_ & 8) == 8) {
            var2 = var1 + CodedOutputStream.computeMessageSize(4, this.getPolarBalanceGoal());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasActivityMetminGoal() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasGoalType() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLastModified() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPolarBalanceGoal() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
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
         if (this.hasGoalType()) {
            var1 = (var2 * 37 + 3) * 53 + this.goalType_;
         }

         var2 = var1;
         if (this.hasActivityMetminGoal()) {
            var2 = (var1 * 37 + 1) * 53 + this.getActivityMetminGoal().hashCode();
         }

         var1 = var2;
         if (this.hasLastModified()) {
            var1 = (var2 * 37 + 2) * 53 + this.getLastModified().hashCode();
         }

         var2 = var1;
         if (this.hasPolarBalanceGoal()) {
            var2 = (var1 * 37 + 4) * 53 + this.getPolarBalanceGoal().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return DailyActivityGoal.f().ensureFieldAccessorsInitialized(DailyActivityGoal$PbDailyActivityGoal.class, DailyActivityGoal$PbDailyActivityGoal$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasLastModified()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasActivityMetminGoal() && !this.getActivityMetminGoal().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getLastModified().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasPolarBalanceGoal() && !this.getPolarBalanceGoal().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public DailyActivityGoal$PbDailyActivityGoal$Builder newBuilderForType() {
      return newBuilder();
   }

   protected DailyActivityGoal$PbDailyActivityGoal$Builder newBuilderForType(BuilderParent var1) {
      return new DailyActivityGoal$PbDailyActivityGoal$Builder(var1, (DailyActivityGoal$1)null);
   }

   public DailyActivityGoal$PbDailyActivityGoal$Builder toBuilder() {
      DailyActivityGoal$PbDailyActivityGoal$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new DailyActivityGoal$PbDailyActivityGoal$Builder((DailyActivityGoal$1)null);
      } else {
         var1 = (new DailyActivityGoal$PbDailyActivityGoal$Builder((DailyActivityGoal$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(1, this.getActivityMetminGoal());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(2, this.getLastModified());
      }

      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(3, this.goalType_);
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeMessage(4, this.getPolarBalanceGoal());
      }

      this.unknownFields.writeTo(var1);
   }
}
