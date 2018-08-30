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

public final class ActivitySamples$PbInActivityNonWearTriggerInfo extends GeneratedMessageV3 implements ActivitySamples$PbInActivityNonWearTriggerInfoOrBuilder {
   private static final ActivitySamples$PbInActivityNonWearTriggerInfo DEFAULT_INSTANCE = new ActivitySamples$PbInActivityNonWearTriggerInfo();
   public static final int END_TIME_STAMP_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new ActivitySamples$PbInActivityNonWearTriggerInfo$1();
   public static final int START_TIME_STAMP_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private Types$PbLocalDateTime endTimeStamp_;
   private byte memoizedIsInitialized;
   private Types$PbLocalDateTime startTimeStamp_;

   private ActivitySamples$PbInActivityNonWearTriggerInfo() {
      this.memoizedIsInitialized = (byte)-1;
   }

   private ActivitySamples$PbInActivityNonWearTriggerInfo(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ActivitySamples$PbInActivityNonWearTriggerInfo(CodedInputStream var1, ExtensionRegistryLite var2, ActivitySamples$1 var3) {
      this(var1, var2);
   }

   private ActivitySamples$PbInActivityNonWearTriggerInfo(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ActivitySamples$PbInActivityNonWearTriggerInfo(Builder var1, ActivitySamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(ActivitySamples$PbInActivityNonWearTriggerInfo var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ActivitySamples$PbInActivityNonWearTriggerInfo var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbLocalDateTime a(ActivitySamples$PbInActivityNonWearTriggerInfo var0, Types$PbLocalDateTime var1) {
      var0.startTimeStamp_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbLocalDateTime b(ActivitySamples$PbInActivityNonWearTriggerInfo var0, Types$PbLocalDateTime var1) {
      var0.endTimeStamp_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static ActivitySamples$PbInActivityNonWearTriggerInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ActivitySamples.g();
   }

   public static ActivitySamples$PbInActivityNonWearTriggerInfo$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ActivitySamples$PbInActivityNonWearTriggerInfo$Builder newBuilder(ActivitySamples$PbInActivityNonWearTriggerInfo var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ActivitySamples$PbInActivityNonWearTriggerInfo parseDelimitedFrom(InputStream var0) {
      return (ActivitySamples$PbInActivityNonWearTriggerInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ActivitySamples$PbInActivityNonWearTriggerInfo parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ActivitySamples$PbInActivityNonWearTriggerInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ActivitySamples$PbInActivityNonWearTriggerInfo parseFrom(ByteString var0) {
      return (ActivitySamples$PbInActivityNonWearTriggerInfo)PARSER.parseFrom(var0);
   }

   public static ActivitySamples$PbInActivityNonWearTriggerInfo parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ActivitySamples$PbInActivityNonWearTriggerInfo)PARSER.parseFrom(var0, var1);
   }

   public static ActivitySamples$PbInActivityNonWearTriggerInfo parseFrom(CodedInputStream var0) {
      return (ActivitySamples$PbInActivityNonWearTriggerInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ActivitySamples$PbInActivityNonWearTriggerInfo parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ActivitySamples$PbInActivityNonWearTriggerInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ActivitySamples$PbInActivityNonWearTriggerInfo parseFrom(InputStream var0) {
      return (ActivitySamples$PbInActivityNonWearTriggerInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ActivitySamples$PbInActivityNonWearTriggerInfo parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ActivitySamples$PbInActivityNonWearTriggerInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ActivitySamples$PbInActivityNonWearTriggerInfo parseFrom(byte[] var0) {
      return (ActivitySamples$PbInActivityNonWearTriggerInfo)PARSER.parseFrom(var0);
   }

   public static ActivitySamples$PbInActivityNonWearTriggerInfo parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ActivitySamples$PbInActivityNonWearTriggerInfo)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ActivitySamples$PbInActivityNonWearTriggerInfo)) {
            var2 = super.equals(var1);
         } else {
            ActivitySamples$PbInActivityNonWearTriggerInfo var5 = (ActivitySamples$PbInActivityNonWearTriggerInfo)var1;
            boolean var3;
            if (this.hasStartTimeStamp() == var5.hasStartTimeStamp()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasStartTimeStamp()) {
               if (var3 && this.getStartTimeStamp().equals(var5.getStartTimeStamp())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasEndTimeStamp() == var5.hasEndTimeStamp()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasEndTimeStamp()) {
               if (var3 && this.getEndTimeStamp().equals(var5.getEndTimeStamp())) {
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

   public ActivitySamples$PbInActivityNonWearTriggerInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Types$PbLocalDateTime getEndTimeStamp() {
      Types$PbLocalDateTime var1;
      if (this.endTimeStamp_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.endTimeStamp_;
      }

      return var1;
   }

   public Types$PbLocalDateTimeOrBuilder getEndTimeStampOrBuilder() {
      Types$PbLocalDateTime var1;
      if (this.endTimeStamp_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.endTimeStamp_;
      }

      return var1;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeMessageSize(1, this.getStartTimeStamp());
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeMessageSize(2, this.getEndTimeStamp());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public Types$PbLocalDateTime getStartTimeStamp() {
      Types$PbLocalDateTime var1;
      if (this.startTimeStamp_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.startTimeStamp_;
      }

      return var1;
   }

   public Types$PbLocalDateTimeOrBuilder getStartTimeStampOrBuilder() {
      Types$PbLocalDateTime var1;
      if (this.startTimeStamp_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.startTimeStamp_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasEndTimeStamp() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStartTimeStamp() {
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
         if (this.hasStartTimeStamp()) {
            var1 = (var2 * 37 + 1) * 53 + this.getStartTimeStamp().hashCode();
         }

         var2 = var1;
         if (this.hasEndTimeStamp()) {
            var2 = (var1 * 37 + 2) * 53 + this.getEndTimeStamp().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ActivitySamples.h().ensureFieldAccessorsInitialized(ActivitySamples$PbInActivityNonWearTriggerInfo.class, ActivitySamples$PbInActivityNonWearTriggerInfo$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasStartTimeStamp()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasEndTimeStamp()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getStartTimeStamp().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getEndTimeStamp().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ActivitySamples$PbInActivityNonWearTriggerInfo$Builder newBuilderForType(BuilderParent var1) {
      return new ActivitySamples$PbInActivityNonWearTriggerInfo$Builder(var1, (ActivitySamples$1)null);
   }

   public ActivitySamples$PbInActivityNonWearTriggerInfo$Builder toBuilder() {
      ActivitySamples$PbInActivityNonWearTriggerInfo$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ActivitySamples$PbInActivityNonWearTriggerInfo$Builder((ActivitySamples$1)null);
      } else {
         var1 = (new ActivitySamples$PbInActivityNonWearTriggerInfo$Builder((ActivitySamples$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getStartTimeStamp());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getEndTimeStamp());
      }

      this.unknownFields.writeTo(var1);
   }
}
