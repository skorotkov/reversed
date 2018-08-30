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

public final class DailyActivityGoal$PbPolarBalanceGoal extends GeneratedMessageV3 implements DailyActivityGoal$PbPolarBalanceGoalOrBuilder {
   private static final DailyActivityGoal$PbPolarBalanceGoal DEFAULT_INSTANCE = new DailyActivityGoal$PbPolarBalanceGoal();
   public static final int FRACTION_OF_ACTIVITY_FIELD_NUMBER = 4;
   public static final int GOAL_DURATION_IN_WEEKS_FIELD_NUMBER = 3;
   @Deprecated
   public static final Parser PARSER = new DailyActivityGoal$PbPolarBalanceGoal$1();
   public static final int START_DATE_FIELD_NUMBER = 1;
   public static final int TARGET_WEIGHT_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private float fractionOfActivity_;
   private int goalDurationInWeeks_;
   private byte memoizedIsInitialized;
   private Types$PbDate startDate_;
   private float targetWeight_;

   private DailyActivityGoal$PbPolarBalanceGoal() {
      this.memoizedIsInitialized = (byte)-1;
      this.targetWeight_ = 0.0F;
      this.goalDurationInWeeks_ = 0;
      this.fractionOfActivity_ = 0.0F;
   }

   private DailyActivityGoal$PbPolarBalanceGoal(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   DailyActivityGoal$PbPolarBalanceGoal(CodedInputStream var1, ExtensionRegistryLite var2, DailyActivityGoal$1 var3) {
      this(var1, var2);
   }

   private DailyActivityGoal$PbPolarBalanceGoal(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   DailyActivityGoal$PbPolarBalanceGoal(Builder var1, DailyActivityGoal$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(DailyActivityGoal$PbPolarBalanceGoal var0, float var1) {
      var0.targetWeight_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(DailyActivityGoal$PbPolarBalanceGoal var0, int var1) {
      var0.goalDurationInWeeks_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(DailyActivityGoal$PbPolarBalanceGoal var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbDate a(DailyActivityGoal$PbPolarBalanceGoal var0, Types$PbDate var1) {
      var0.startDate_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static float b(DailyActivityGoal$PbPolarBalanceGoal var0, float var1) {
      var0.fractionOfActivity_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(DailyActivityGoal$PbPolarBalanceGoal var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static DailyActivityGoal$PbPolarBalanceGoal getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return DailyActivityGoal.c();
   }

   public static DailyActivityGoal$PbPolarBalanceGoal$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DailyActivityGoal$PbPolarBalanceGoal$Builder newBuilder(DailyActivityGoal$PbPolarBalanceGoal var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static DailyActivityGoal$PbPolarBalanceGoal parseDelimitedFrom(InputStream var0) {
      return (DailyActivityGoal$PbPolarBalanceGoal)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DailyActivityGoal$PbPolarBalanceGoal parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (DailyActivityGoal$PbPolarBalanceGoal)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DailyActivityGoal$PbPolarBalanceGoal parseFrom(ByteString var0) {
      return (DailyActivityGoal$PbPolarBalanceGoal)PARSER.parseFrom(var0);
   }

   public static DailyActivityGoal$PbPolarBalanceGoal parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (DailyActivityGoal$PbPolarBalanceGoal)PARSER.parseFrom(var0, var1);
   }

   public static DailyActivityGoal$PbPolarBalanceGoal parseFrom(CodedInputStream var0) {
      return (DailyActivityGoal$PbPolarBalanceGoal)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DailyActivityGoal$PbPolarBalanceGoal parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (DailyActivityGoal$PbPolarBalanceGoal)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DailyActivityGoal$PbPolarBalanceGoal parseFrom(InputStream var0) {
      return (DailyActivityGoal$PbPolarBalanceGoal)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DailyActivityGoal$PbPolarBalanceGoal parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (DailyActivityGoal$PbPolarBalanceGoal)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DailyActivityGoal$PbPolarBalanceGoal parseFrom(byte[] var0) {
      return (DailyActivityGoal$PbPolarBalanceGoal)PARSER.parseFrom(var0);
   }

   public static DailyActivityGoal$PbPolarBalanceGoal parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (DailyActivityGoal$PbPolarBalanceGoal)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof DailyActivityGoal$PbPolarBalanceGoal)) {
            var2 = super.equals(var1);
         } else {
            DailyActivityGoal$PbPolarBalanceGoal var5 = (DailyActivityGoal$PbPolarBalanceGoal)var1;
            boolean var3;
            if (this.hasStartDate() == var5.hasStartDate()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasStartDate()) {
               if (var3 && this.getStartDate().equals(var5.getStartDate())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTargetWeight() == var5.hasTargetWeight()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasTargetWeight()) {
               if (var4 && Float.floatToIntBits(this.getTargetWeight()) == Float.floatToIntBits(var5.getTargetWeight())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasGoalDurationInWeeks() == var5.hasGoalDurationInWeeks()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasGoalDurationInWeeks()) {
               if (var3 && this.getGoalDurationInWeeks() == var5.getGoalDurationInWeeks()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasFractionOfActivity() == var5.hasFractionOfActivity()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasFractionOfActivity()) {
               if (var4 && Float.floatToIntBits(this.getFractionOfActivity()) == Float.floatToIntBits(var5.getFractionOfActivity())) {
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

   public DailyActivityGoal$PbPolarBalanceGoal getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public float getFractionOfActivity() {
      return this.fractionOfActivity_;
   }

   public int getGoalDurationInWeeks() {
      return this.goalDurationInWeeks_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeMessageSize(1, this.getStartDate());
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeFloatSize(2, this.targetWeight_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(3, this.goalDurationInWeeks_);
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeFloatSize(4, this.fractionOfActivity_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public Types$PbDate getStartDate() {
      Types$PbDate var1;
      if (this.startDate_ == null) {
         var1 = Types$PbDate.getDefaultInstance();
      } else {
         var1 = this.startDate_;
      }

      return var1;
   }

   public Types$PbDateOrBuilder getStartDateOrBuilder() {
      Types$PbDate var1;
      if (this.startDate_ == null) {
         var1 = Types$PbDate.getDefaultInstance();
      } else {
         var1 = this.startDate_;
      }

      return var1;
   }

   public float getTargetWeight() {
      return this.targetWeight_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasFractionOfActivity() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasGoalDurationInWeeks() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStartDate() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTargetWeight() {
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
         if (this.hasStartDate()) {
            var1 = (var2 * 37 + 1) * 53 + this.getStartDate().hashCode();
         }

         var2 = var1;
         if (this.hasTargetWeight()) {
            var2 = (var1 * 37 + 2) * 53 + Float.floatToIntBits(this.getTargetWeight());
         }

         var1 = var2;
         if (this.hasGoalDurationInWeeks()) {
            var1 = (var2 * 37 + 3) * 53 + this.getGoalDurationInWeeks();
         }

         var2 = var1;
         if (this.hasFractionOfActivity()) {
            var2 = (var1 * 37 + 4) * 53 + Float.floatToIntBits(this.getFractionOfActivity());
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return DailyActivityGoal.d().ensureFieldAccessorsInitialized(DailyActivityGoal$PbPolarBalanceGoal.class, DailyActivityGoal$PbPolarBalanceGoal$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasStartDate()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getStartDate().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public DailyActivityGoal$PbPolarBalanceGoal$Builder newBuilderForType() {
      return newBuilder();
   }

   protected DailyActivityGoal$PbPolarBalanceGoal$Builder newBuilderForType(BuilderParent var1) {
      return new DailyActivityGoal$PbPolarBalanceGoal$Builder(var1, (DailyActivityGoal$1)null);
   }

   public DailyActivityGoal$PbPolarBalanceGoal$Builder toBuilder() {
      DailyActivityGoal$PbPolarBalanceGoal$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new DailyActivityGoal$PbPolarBalanceGoal$Builder((DailyActivityGoal$1)null);
      } else {
         var1 = (new DailyActivityGoal$PbPolarBalanceGoal$Builder((DailyActivityGoal$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getStartDate());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeFloat(2, this.targetWeight_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeUInt32(3, this.goalDurationInWeeks_);
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeFloat(4, this.fractionOfActivity_);
      }

      this.unknownFields.writeTo(var1);
   }
}
