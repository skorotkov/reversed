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

public final class DailySummary$PbActivityClassTimes extends GeneratedMessageV3 implements DailySummary$PbActivityClassTimesOrBuilder {
   private static final DailySummary$PbActivityClassTimes DEFAULT_INSTANCE = new DailySummary$PbActivityClassTimes();
   @Deprecated
   public static final Parser PARSER = new DailySummary$PbActivityClassTimes$1();
   public static final int TIME_CONTINUOUS_MODERATE_FIELD_NUMBER = 5;
   public static final int TIME_CONTINUOUS_VIGOROUS_FIELD_NUMBER = 7;
   public static final int TIME_INTERMITTENT_MODERATE_FIELD_NUMBER = 6;
   public static final int TIME_INTERMITTENT_VIGOROUS_FIELD_NUMBER = 8;
   public static final int TIME_LIGHT_ACTIVITY_FIELD_NUMBER = 4;
   public static final int TIME_NON_WEAR_FIELD_NUMBER = 1;
   public static final int TIME_SEDENTARY_FIELD_NUMBER = 3;
   public static final int TIME_SLEEP_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private Types$PbDuration timeContinuousModerate_;
   private Types$PbDuration timeContinuousVigorous_;
   private Types$PbDuration timeIntermittentModerate_;
   private Types$PbDuration timeIntermittentVigorous_;
   private Types$PbDuration timeLightActivity_;
   private Types$PbDuration timeNonWear_;
   private Types$PbDuration timeSedentary_;
   private Types$PbDuration timeSleep_;

   private DailySummary$PbActivityClassTimes() {
      this.memoizedIsInitialized = (byte)-1;
   }

   private DailySummary$PbActivityClassTimes(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   DailySummary$PbActivityClassTimes(CodedInputStream var1, ExtensionRegistryLite var2, DailySummary$1 var3) {
      this(var1, var2);
   }

   private DailySummary$PbActivityClassTimes(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   DailySummary$PbActivityClassTimes(Builder var1, DailySummary$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(DailySummary$PbActivityClassTimes var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(DailySummary$PbActivityClassTimes var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbDuration a(DailySummary$PbActivityClassTimes var0, Types$PbDuration var1) {
      var0.timeNonWear_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration b(DailySummary$PbActivityClassTimes var0, Types$PbDuration var1) {
      var0.timeSleep_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static Types$PbDuration c(DailySummary$PbActivityClassTimes var0, Types$PbDuration var1) {
      var0.timeSedentary_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration d(DailySummary$PbActivityClassTimes var0, Types$PbDuration var1) {
      var0.timeLightActivity_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration e(DailySummary$PbActivityClassTimes var0, Types$PbDuration var1) {
      var0.timeContinuousModerate_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration f(DailySummary$PbActivityClassTimes var0, Types$PbDuration var1) {
      var0.timeIntermittentModerate_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration g(DailySummary$PbActivityClassTimes var0, Types$PbDuration var1) {
      var0.timeContinuousVigorous_ = var1;
      return var1;
   }

   public static DailySummary$PbActivityClassTimes getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return DailySummary.c();
   }

   // $FF: synthetic method
   static Types$PbDuration h(DailySummary$PbActivityClassTimes var0, Types$PbDuration var1) {
      var0.timeIntermittentVigorous_ = var1;
      return var1;
   }

   public static DailySummary$PbActivityClassTimes$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DailySummary$PbActivityClassTimes$Builder newBuilder(DailySummary$PbActivityClassTimes var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static DailySummary$PbActivityClassTimes parseDelimitedFrom(InputStream var0) {
      return (DailySummary$PbActivityClassTimes)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DailySummary$PbActivityClassTimes parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (DailySummary$PbActivityClassTimes)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DailySummary$PbActivityClassTimes parseFrom(ByteString var0) {
      return (DailySummary$PbActivityClassTimes)PARSER.parseFrom(var0);
   }

   public static DailySummary$PbActivityClassTimes parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (DailySummary$PbActivityClassTimes)PARSER.parseFrom(var0, var1);
   }

   public static DailySummary$PbActivityClassTimes parseFrom(CodedInputStream var0) {
      return (DailySummary$PbActivityClassTimes)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DailySummary$PbActivityClassTimes parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (DailySummary$PbActivityClassTimes)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DailySummary$PbActivityClassTimes parseFrom(InputStream var0) {
      return (DailySummary$PbActivityClassTimes)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DailySummary$PbActivityClassTimes parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (DailySummary$PbActivityClassTimes)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DailySummary$PbActivityClassTimes parseFrom(byte[] var0) {
      return (DailySummary$PbActivityClassTimes)PARSER.parseFrom(var0);
   }

   public static DailySummary$PbActivityClassTimes parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (DailySummary$PbActivityClassTimes)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof DailySummary$PbActivityClassTimes)) {
            var2 = super.equals(var1);
         } else {
            DailySummary$PbActivityClassTimes var5 = (DailySummary$PbActivityClassTimes)var1;
            boolean var3;
            if (this.hasTimeNonWear() == var5.hasTimeNonWear()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasTimeNonWear()) {
               if (var3 && this.getTimeNonWear().equals(var5.getTimeNonWear())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTimeSleep() == var5.hasTimeSleep()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasTimeSleep()) {
               if (var3 && this.getTimeSleep().equals(var5.getTimeSleep())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTimeSedentary() == var5.hasTimeSedentary()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasTimeSedentary()) {
               if (var4 && this.getTimeSedentary().equals(var5.getTimeSedentary())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasTimeLightActivity() == var5.hasTimeLightActivity()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasTimeLightActivity()) {
               if (var3 && this.getTimeLightActivity().equals(var5.getTimeLightActivity())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTimeContinuousModerate() == var5.hasTimeContinuousModerate()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasTimeContinuousModerate()) {
               if (var3 && this.getTimeContinuousModerate().equals(var5.getTimeContinuousModerate())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTimeIntermittentModerate() == var5.hasTimeIntermittentModerate()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasTimeIntermittentModerate()) {
               if (var3 && this.getTimeIntermittentModerate().equals(var5.getTimeIntermittentModerate())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTimeContinuousVigorous() == var5.hasTimeContinuousVigorous()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasTimeContinuousVigorous()) {
               if (var3 && this.getTimeContinuousVigorous().equals(var5.getTimeContinuousVigorous())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTimeIntermittentVigorous() == var5.hasTimeIntermittentVigorous()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasTimeIntermittentVigorous()) {
               if (var4 && this.getTimeIntermittentVigorous().equals(var5.getTimeIntermittentVigorous())) {
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

   public DailySummary$PbActivityClassTimes getDefaultInstanceForType() {
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
            var1 = 0 + CodedOutputStream.computeMessageSize(1, this.getTimeNonWear());
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeMessageSize(2, this.getTimeSleep());
         }

         var1 = var2;
         if ((this.bitField0_ & 4) == 4) {
            var1 = var2 + CodedOutputStream.computeMessageSize(3, this.getTimeSedentary());
         }

         var2 = var1;
         if ((this.bitField0_ & 8) == 8) {
            var2 = var1 + CodedOutputStream.computeMessageSize(4, this.getTimeLightActivity());
         }

         var1 = var2;
         if ((this.bitField0_ & 16) == 16) {
            var1 = var2 + CodedOutputStream.computeMessageSize(5, this.getTimeContinuousModerate());
         }

         var2 = var1;
         if ((this.bitField0_ & 32) == 32) {
            var2 = var1 + CodedOutputStream.computeMessageSize(6, this.getTimeIntermittentModerate());
         }

         var1 = var2;
         if ((this.bitField0_ & 64) == 64) {
            var1 = var2 + CodedOutputStream.computeMessageSize(7, this.getTimeContinuousVigorous());
         }

         var2 = var1;
         if ((this.bitField0_ & 128) == 128) {
            var2 = var1 + CodedOutputStream.computeMessageSize(8, this.getTimeIntermittentVigorous());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public Types$PbDuration getTimeContinuousModerate() {
      Types$PbDuration var1;
      if (this.timeContinuousModerate_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeContinuousModerate_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getTimeContinuousModerateOrBuilder() {
      Types$PbDuration var1;
      if (this.timeContinuousModerate_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeContinuousModerate_;
      }

      return var1;
   }

   public Types$PbDuration getTimeContinuousVigorous() {
      Types$PbDuration var1;
      if (this.timeContinuousVigorous_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeContinuousVigorous_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getTimeContinuousVigorousOrBuilder() {
      Types$PbDuration var1;
      if (this.timeContinuousVigorous_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeContinuousVigorous_;
      }

      return var1;
   }

   public Types$PbDuration getTimeIntermittentModerate() {
      Types$PbDuration var1;
      if (this.timeIntermittentModerate_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeIntermittentModerate_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getTimeIntermittentModerateOrBuilder() {
      Types$PbDuration var1;
      if (this.timeIntermittentModerate_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeIntermittentModerate_;
      }

      return var1;
   }

   public Types$PbDuration getTimeIntermittentVigorous() {
      Types$PbDuration var1;
      if (this.timeIntermittentVigorous_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeIntermittentVigorous_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getTimeIntermittentVigorousOrBuilder() {
      Types$PbDuration var1;
      if (this.timeIntermittentVigorous_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeIntermittentVigorous_;
      }

      return var1;
   }

   public Types$PbDuration getTimeLightActivity() {
      Types$PbDuration var1;
      if (this.timeLightActivity_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeLightActivity_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getTimeLightActivityOrBuilder() {
      Types$PbDuration var1;
      if (this.timeLightActivity_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeLightActivity_;
      }

      return var1;
   }

   public Types$PbDuration getTimeNonWear() {
      Types$PbDuration var1;
      if (this.timeNonWear_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeNonWear_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getTimeNonWearOrBuilder() {
      Types$PbDuration var1;
      if (this.timeNonWear_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeNonWear_;
      }

      return var1;
   }

   public Types$PbDuration getTimeSedentary() {
      Types$PbDuration var1;
      if (this.timeSedentary_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeSedentary_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getTimeSedentaryOrBuilder() {
      Types$PbDuration var1;
      if (this.timeSedentary_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeSedentary_;
      }

      return var1;
   }

   public Types$PbDuration getTimeSleep() {
      Types$PbDuration var1;
      if (this.timeSleep_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeSleep_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getTimeSleepOrBuilder() {
      Types$PbDuration var1;
      if (this.timeSleep_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeSleep_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasTimeContinuousModerate() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeContinuousVigorous() {
      boolean var1;
      if ((this.bitField0_ & 64) == 64) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeIntermittentModerate() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeIntermittentVigorous() {
      boolean var1;
      if ((this.bitField0_ & 128) == 128) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeLightActivity() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeNonWear() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeSedentary() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeSleep() {
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
         var1 = this.getDescriptorForType().hashCode() + 779;
         int var2 = var1;
         if (this.hasTimeNonWear()) {
            var2 = (var1 * 37 + 1) * 53 + this.getTimeNonWear().hashCode();
         }

         var1 = var2;
         if (this.hasTimeSleep()) {
            var1 = (var2 * 37 + 2) * 53 + this.getTimeSleep().hashCode();
         }

         var2 = var1;
         if (this.hasTimeSedentary()) {
            var2 = (var1 * 37 + 3) * 53 + this.getTimeSedentary().hashCode();
         }

         var1 = var2;
         if (this.hasTimeLightActivity()) {
            var1 = (var2 * 37 + 4) * 53 + this.getTimeLightActivity().hashCode();
         }

         int var3 = var1;
         if (this.hasTimeContinuousModerate()) {
            var3 = (var1 * 37 + 5) * 53 + this.getTimeContinuousModerate().hashCode();
         }

         var2 = var3;
         if (this.hasTimeIntermittentModerate()) {
            var2 = (var3 * 37 + 6) * 53 + this.getTimeIntermittentModerate().hashCode();
         }

         var1 = var2;
         if (this.hasTimeContinuousVigorous()) {
            var1 = (var2 * 37 + 7) * 53 + this.getTimeContinuousVigorous().hashCode();
         }

         var2 = var1;
         if (this.hasTimeIntermittentVigorous()) {
            var2 = (var1 * 37 + 8) * 53 + this.getTimeIntermittentVigorous().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return DailySummary.d().ensureFieldAccessorsInitialized(DailySummary$PbActivityClassTimes.class, DailySummary$PbActivityClassTimes$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasTimeNonWear()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasTimeSleep()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasTimeSedentary()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasTimeLightActivity()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasTimeContinuousModerate()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasTimeIntermittentModerate()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasTimeContinuousVigorous()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasTimeIntermittentVigorous()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public DailySummary$PbActivityClassTimes$Builder newBuilderForType() {
      return newBuilder();
   }

   protected DailySummary$PbActivityClassTimes$Builder newBuilderForType(BuilderParent var1) {
      return new DailySummary$PbActivityClassTimes$Builder(var1, (DailySummary$1)null);
   }

   public DailySummary$PbActivityClassTimes$Builder toBuilder() {
      DailySummary$PbActivityClassTimes$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new DailySummary$PbActivityClassTimes$Builder((DailySummary$1)null);
      } else {
         var1 = (new DailySummary$PbActivityClassTimes$Builder((DailySummary$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getTimeNonWear());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getTimeSleep());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getTimeSedentary());
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeMessage(4, this.getTimeLightActivity());
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeMessage(5, this.getTimeContinuousModerate());
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeMessage(6, this.getTimeIntermittentModerate());
      }

      if ((this.bitField0_ & 64) == 64) {
         var1.writeMessage(7, this.getTimeContinuousVigorous());
      }

      if ((this.bitField0_ & 128) == 128) {
         var1.writeMessage(8, this.getTimeIntermittentVigorous());
      }

      this.unknownFields.writeTo(var1);
   }
}
