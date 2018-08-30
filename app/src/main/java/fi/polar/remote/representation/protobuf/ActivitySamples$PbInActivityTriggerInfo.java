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

public final class ActivitySamples$PbInActivityTriggerInfo extends GeneratedMessageV3 implements ActivitySamples$PbInActivityTriggerInfoOrBuilder {
   private static final ActivitySamples$PbInActivityTriggerInfo DEFAULT_INSTANCE = new ActivitySamples$PbInActivityTriggerInfo();
   @Deprecated
   public static final Parser PARSER = new ActivitySamples$PbInActivityTriggerInfo$1();
   public static final int TIME_STAMP_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private Types$PbLocalDateTime timeStamp_;

   private ActivitySamples$PbInActivityTriggerInfo() {
      this.memoizedIsInitialized = (byte)-1;
   }

   private ActivitySamples$PbInActivityTriggerInfo(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ActivitySamples$PbInActivityTriggerInfo(CodedInputStream var1, ExtensionRegistryLite var2, ActivitySamples$1 var3) {
      this(var1, var2);
   }

   private ActivitySamples$PbInActivityTriggerInfo(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ActivitySamples$PbInActivityTriggerInfo(Builder var1, ActivitySamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(ActivitySamples$PbInActivityTriggerInfo var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ActivitySamples$PbInActivityTriggerInfo var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbLocalDateTime a(ActivitySamples$PbInActivityTriggerInfo var0, Types$PbLocalDateTime var1) {
      var0.timeStamp_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static ActivitySamples$PbInActivityTriggerInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ActivitySamples.e();
   }

   public static ActivitySamples$PbInActivityTriggerInfo$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ActivitySamples$PbInActivityTriggerInfo$Builder newBuilder(ActivitySamples$PbInActivityTriggerInfo var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ActivitySamples$PbInActivityTriggerInfo parseDelimitedFrom(InputStream var0) {
      return (ActivitySamples$PbInActivityTriggerInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ActivitySamples$PbInActivityTriggerInfo parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ActivitySamples$PbInActivityTriggerInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ActivitySamples$PbInActivityTriggerInfo parseFrom(ByteString var0) {
      return (ActivitySamples$PbInActivityTriggerInfo)PARSER.parseFrom(var0);
   }

   public static ActivitySamples$PbInActivityTriggerInfo parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ActivitySamples$PbInActivityTriggerInfo)PARSER.parseFrom(var0, var1);
   }

   public static ActivitySamples$PbInActivityTriggerInfo parseFrom(CodedInputStream var0) {
      return (ActivitySamples$PbInActivityTriggerInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ActivitySamples$PbInActivityTriggerInfo parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ActivitySamples$PbInActivityTriggerInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ActivitySamples$PbInActivityTriggerInfo parseFrom(InputStream var0) {
      return (ActivitySamples$PbInActivityTriggerInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ActivitySamples$PbInActivityTriggerInfo parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ActivitySamples$PbInActivityTriggerInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ActivitySamples$PbInActivityTriggerInfo parseFrom(byte[] var0) {
      return (ActivitySamples$PbInActivityTriggerInfo)PARSER.parseFrom(var0);
   }

   public static ActivitySamples$PbInActivityTriggerInfo parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ActivitySamples$PbInActivityTriggerInfo)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ActivitySamples$PbInActivityTriggerInfo)) {
            var2 = super.equals(var1);
         } else {
            ActivitySamples$PbInActivityTriggerInfo var5 = (ActivitySamples$PbInActivityTriggerInfo)var1;
            boolean var3;
            if (this.hasTimeStamp() == var5.hasTimeStamp()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasTimeStamp()) {
               if (var3 && this.getTimeStamp().equals(var5.getTimeStamp())) {
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

   public ActivitySamples$PbInActivityTriggerInfo getDefaultInstanceForType() {
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
            var1 = 0 + CodedOutputStream.computeMessageSize(1, this.getTimeStamp());
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public Types$PbLocalDateTime getTimeStamp() {
      Types$PbLocalDateTime var1;
      if (this.timeStamp_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.timeStamp_;
      }

      return var1;
   }

   public Types$PbLocalDateTimeOrBuilder getTimeStampOrBuilder() {
      Types$PbLocalDateTime var1;
      if (this.timeStamp_ == null) {
         var1 = Types$PbLocalDateTime.getDefaultInstance();
      } else {
         var1 = this.timeStamp_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasTimeStamp() {
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
         if (this.hasTimeStamp()) {
            var1 = (var2 * 37 + 1) * 53 + this.getTimeStamp().hashCode();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ActivitySamples.f().ensureFieldAccessorsInitialized(ActivitySamples$PbInActivityTriggerInfo.class, ActivitySamples$PbInActivityTriggerInfo$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasTimeStamp()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getTimeStamp().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public ActivitySamples$PbInActivityTriggerInfo$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ActivitySamples$PbInActivityTriggerInfo$Builder newBuilderForType(BuilderParent var1) {
      return new ActivitySamples$PbInActivityTriggerInfo$Builder(var1, (ActivitySamples$1)null);
   }

   public ActivitySamples$PbInActivityTriggerInfo$Builder toBuilder() {
      ActivitySamples$PbInActivityTriggerInfo$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ActivitySamples$PbInActivityTriggerInfo$Builder((ActivitySamples$1)null);
      } else {
         var1 = (new ActivitySamples$PbInActivityTriggerInfo$Builder((ActivitySamples$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getTimeStamp());
      }

      this.unknownFields.writeTo(var1);
   }
}
