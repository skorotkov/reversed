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

public final class DailySummary$PbActivityGoalSummary extends GeneratedMessageV3 implements DailySummary$PbActivityGoalSummaryOrBuilder {
   public static final int ACHIEVED_ACTIVITY_FIELD_NUMBER = 2;
   public static final int ACTIVITY_GOAL_FIELD_NUMBER = 1;
   private static final DailySummary$PbActivityGoalSummary DEFAULT_INSTANCE = new DailySummary$PbActivityGoalSummary();
   @Deprecated
   public static final Parser PARSER = new DailySummary$PbActivityGoalSummary$1();
   public static final int TIME_TO_GO_JOG_FIELD_NUMBER = 5;
   public static final int TIME_TO_GO_UP_FIELD_NUMBER = 3;
   public static final int TIME_TO_GO_WALK_FIELD_NUMBER = 4;
   private static final long serialVersionUID = 0L;
   private float achievedActivity_;
   private float activityGoal_;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private Types$PbDuration timeToGoJog_;
   private Types$PbDuration timeToGoUp_;
   private Types$PbDuration timeToGoWalk_;

   private DailySummary$PbActivityGoalSummary() {
      this.memoizedIsInitialized = (byte)-1;
      this.activityGoal_ = 0.0F;
      this.achievedActivity_ = 0.0F;
   }

   private DailySummary$PbActivityGoalSummary(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   DailySummary$PbActivityGoalSummary(CodedInputStream var1, ExtensionRegistryLite var2, DailySummary$1 var3) {
      this(var1, var2);
   }

   private DailySummary$PbActivityGoalSummary(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   DailySummary$PbActivityGoalSummary(Builder var1, DailySummary$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(DailySummary$PbActivityGoalSummary var0, float var1) {
      var0.activityGoal_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(DailySummary$PbActivityGoalSummary var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(DailySummary$PbActivityGoalSummary var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbDuration a(DailySummary$PbActivityGoalSummary var0, Types$PbDuration var1) {
      var0.timeToGoUp_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static float b(DailySummary$PbActivityGoalSummary var0, float var1) {
      var0.achievedActivity_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration b(DailySummary$PbActivityGoalSummary var0, Types$PbDuration var1) {
      var0.timeToGoWalk_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static Types$PbDuration c(DailySummary$PbActivityGoalSummary var0, Types$PbDuration var1) {
      var0.timeToGoJog_ = var1;
      return var1;
   }

   public static DailySummary$PbActivityGoalSummary getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return DailySummary.a();
   }

   public static DailySummary$PbActivityGoalSummary$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DailySummary$PbActivityGoalSummary$Builder newBuilder(DailySummary$PbActivityGoalSummary var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static DailySummary$PbActivityGoalSummary parseDelimitedFrom(InputStream var0) {
      return (DailySummary$PbActivityGoalSummary)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DailySummary$PbActivityGoalSummary parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (DailySummary$PbActivityGoalSummary)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DailySummary$PbActivityGoalSummary parseFrom(ByteString var0) {
      return (DailySummary$PbActivityGoalSummary)PARSER.parseFrom(var0);
   }

   public static DailySummary$PbActivityGoalSummary parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (DailySummary$PbActivityGoalSummary)PARSER.parseFrom(var0, var1);
   }

   public static DailySummary$PbActivityGoalSummary parseFrom(CodedInputStream var0) {
      return (DailySummary$PbActivityGoalSummary)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DailySummary$PbActivityGoalSummary parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (DailySummary$PbActivityGoalSummary)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DailySummary$PbActivityGoalSummary parseFrom(InputStream var0) {
      return (DailySummary$PbActivityGoalSummary)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DailySummary$PbActivityGoalSummary parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (DailySummary$PbActivityGoalSummary)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DailySummary$PbActivityGoalSummary parseFrom(byte[] var0) {
      return (DailySummary$PbActivityGoalSummary)PARSER.parseFrom(var0);
   }

   public static DailySummary$PbActivityGoalSummary parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (DailySummary$PbActivityGoalSummary)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof DailySummary$PbActivityGoalSummary)) {
            var2 = super.equals(var1);
         } else {
            DailySummary$PbActivityGoalSummary var5 = (DailySummary$PbActivityGoalSummary)var1;
            boolean var3;
            if (this.hasActivityGoal() == var5.hasActivityGoal()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasActivityGoal()) {
               if (var3 && Float.floatToIntBits(this.getActivityGoal()) == Float.floatToIntBits(var5.getActivityGoal())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAchievedActivity() == var5.hasAchievedActivity()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAchievedActivity()) {
               if (var4 && Float.floatToIntBits(this.getAchievedActivity()) == Float.floatToIntBits(var5.getAchievedActivity())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasTimeToGoUp() == var5.hasTimeToGoUp()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasTimeToGoUp()) {
               if (var3 && this.getTimeToGoUp().equals(var5.getTimeToGoUp())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTimeToGoWalk() == var5.hasTimeToGoWalk()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasTimeToGoWalk()) {
               if (var3 && this.getTimeToGoWalk().equals(var5.getTimeToGoWalk())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTimeToGoJog() == var5.hasTimeToGoJog()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasTimeToGoJog()) {
               if (var4 && this.getTimeToGoJog().equals(var5.getTimeToGoJog())) {
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

   public float getAchievedActivity() {
      return this.achievedActivity_;
   }

   public float getActivityGoal() {
      return this.activityGoal_;
   }

   public DailySummary$PbActivityGoalSummary getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeFloatSize(1, this.activityGoal_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeFloatSize(2, this.achievedActivity_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeMessageSize(3, this.getTimeToGoUp());
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeMessageSize(4, this.getTimeToGoWalk());
         }

         var2 = var1;
         if ((this.bitField0_ & 16) == 16) {
            var2 = var1 + CodedOutputStream.computeMessageSize(5, this.getTimeToGoJog());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public Types$PbDuration getTimeToGoJog() {
      Types$PbDuration var1;
      if (this.timeToGoJog_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeToGoJog_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getTimeToGoJogOrBuilder() {
      Types$PbDuration var1;
      if (this.timeToGoJog_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeToGoJog_;
      }

      return var1;
   }

   public Types$PbDuration getTimeToGoUp() {
      Types$PbDuration var1;
      if (this.timeToGoUp_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeToGoUp_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getTimeToGoUpOrBuilder() {
      Types$PbDuration var1;
      if (this.timeToGoUp_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeToGoUp_;
      }

      return var1;
   }

   public Types$PbDuration getTimeToGoWalk() {
      Types$PbDuration var1;
      if (this.timeToGoWalk_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeToGoWalk_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getTimeToGoWalkOrBuilder() {
      Types$PbDuration var1;
      if (this.timeToGoWalk_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeToGoWalk_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasAchievedActivity() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasActivityGoal() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeToGoJog() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeToGoUp() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeToGoWalk() {
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
         if (this.hasActivityGoal()) {
            var1 = (var2 * 37 + 1) * 53 + Float.floatToIntBits(this.getActivityGoal());
         }

         var2 = var1;
         if (this.hasAchievedActivity()) {
            var2 = (var1 * 37 + 2) * 53 + Float.floatToIntBits(this.getAchievedActivity());
         }

         var1 = var2;
         if (this.hasTimeToGoUp()) {
            var1 = (var2 * 37 + 3) * 53 + this.getTimeToGoUp().hashCode();
         }

         var2 = var1;
         if (this.hasTimeToGoWalk()) {
            var2 = (var1 * 37 + 4) * 53 + this.getTimeToGoWalk().hashCode();
         }

         var1 = var2;
         if (this.hasTimeToGoJog()) {
            var1 = (var2 * 37 + 5) * 53 + this.getTimeToGoJog().hashCode();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return DailySummary.b().ensureFieldAccessorsInitialized(DailySummary$PbActivityGoalSummary.class, DailySummary$PbActivityGoalSummary$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasActivityGoal()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasAchievedActivity()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public DailySummary$PbActivityGoalSummary$Builder newBuilderForType() {
      return newBuilder();
   }

   protected DailySummary$PbActivityGoalSummary$Builder newBuilderForType(BuilderParent var1) {
      return new DailySummary$PbActivityGoalSummary$Builder(var1, (DailySummary$1)null);
   }

   public DailySummary$PbActivityGoalSummary$Builder toBuilder() {
      DailySummary$PbActivityGoalSummary$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new DailySummary$PbActivityGoalSummary$Builder((DailySummary$1)null);
      } else {
         var1 = (new DailySummary$PbActivityGoalSummary$Builder((DailySummary$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeFloat(1, this.activityGoal_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeFloat(2, this.achievedActivity_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getTimeToGoUp());
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeMessage(4, this.getTimeToGoWalk());
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeMessage(5, this.getTimeToGoJog());
      }

      this.unknownFields.writeTo(var1);
   }
}
