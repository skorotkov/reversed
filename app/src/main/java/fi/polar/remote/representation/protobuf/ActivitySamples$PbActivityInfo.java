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

public final class ActivitySamples$PbActivityInfo extends GeneratedMessageV3 implements ActivitySamples$PbActivityInfoOrBuilder {
   private static final ActivitySamples$PbActivityInfo DEFAULT_INSTANCE = new ActivitySamples$PbActivityInfo();
   public static final int FACTOR_FIELD_NUMBER = 3;
   @Deprecated
   public static final Parser PARSER = new ActivitySamples$PbActivityInfo$1();
   public static final int TIME_STAMP_FIELD_NUMBER = 2;
   public static final int VALUE_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private float factor_;
   private byte memoizedIsInitialized;
   private Types$PbLocalDateTime timeStamp_;
   private int value_;

   private ActivitySamples$PbActivityInfo() {
      this.memoizedIsInitialized = (byte)-1;
      this.value_ = 1;
      this.factor_ = 0.0F;
   }

   private ActivitySamples$PbActivityInfo(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ActivitySamples$PbActivityInfo(CodedInputStream var1, ExtensionRegistryLite var2, ActivitySamples$1 var3) {
      this(var1, var2);
   }

   private ActivitySamples$PbActivityInfo(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ActivitySamples$PbActivityInfo(Builder var1, ActivitySamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(ActivitySamples$PbActivityInfo var0, float var1) {
      var0.factor_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(ActivitySamples$PbActivityInfo var0, int var1) {
      var0.value_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ActivitySamples$PbActivityInfo var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbLocalDateTime a(ActivitySamples$PbActivityInfo var0, Types$PbLocalDateTime var1) {
      var0.timeStamp_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(ActivitySamples$PbActivityInfo var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static ActivitySamples$PbActivityInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ActivitySamples.c();
   }

   public static ActivitySamples$PbActivityInfo$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ActivitySamples$PbActivityInfo$Builder newBuilder(ActivitySamples$PbActivityInfo var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ActivitySamples$PbActivityInfo parseDelimitedFrom(InputStream var0) {
      return (ActivitySamples$PbActivityInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ActivitySamples$PbActivityInfo parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ActivitySamples$PbActivityInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ActivitySamples$PbActivityInfo parseFrom(ByteString var0) {
      return (ActivitySamples$PbActivityInfo)PARSER.parseFrom(var0);
   }

   public static ActivitySamples$PbActivityInfo parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ActivitySamples$PbActivityInfo)PARSER.parseFrom(var0, var1);
   }

   public static ActivitySamples$PbActivityInfo parseFrom(CodedInputStream var0) {
      return (ActivitySamples$PbActivityInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ActivitySamples$PbActivityInfo parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ActivitySamples$PbActivityInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ActivitySamples$PbActivityInfo parseFrom(InputStream var0) {
      return (ActivitySamples$PbActivityInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ActivitySamples$PbActivityInfo parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ActivitySamples$PbActivityInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ActivitySamples$PbActivityInfo parseFrom(byte[] var0) {
      return (ActivitySamples$PbActivityInfo)PARSER.parseFrom(var0);
   }

   public static ActivitySamples$PbActivityInfo parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ActivitySamples$PbActivityInfo)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ActivitySamples$PbActivityInfo)) {
            var2 = super.equals(var1);
         } else {
            ActivitySamples$PbActivityInfo var5 = (ActivitySamples$PbActivityInfo)var1;
            boolean var3;
            if (this.hasValue() == var5.hasValue()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasValue()) {
               if (var3 && this.value_ == var5.value_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTimeStamp() == var5.hasTimeStamp()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasTimeStamp()) {
               if (var4 && this.getTimeStamp().equals(var5.getTimeStamp())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasFactor() == var5.hasFactor()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasFactor()) {
               if (var4 && Float.floatToIntBits(this.getFactor()) == Float.floatToIntBits(var5.getFactor())) {
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

   public ActivitySamples$PbActivityInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public float getFactor() {
      return this.factor_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeEnumSize(1, this.value_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeMessageSize(2, this.getTimeStamp());
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeFloatSize(3, this.factor_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
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

   public ActivitySamples$PbActivityInfo$ActivityClass getValue() {
      ActivitySamples$PbActivityInfo$ActivityClass var1 = ActivitySamples$PbActivityInfo$ActivityClass.valueOf(this.value_);
      ActivitySamples$PbActivityInfo$ActivityClass var2 = var1;
      if (var1 == null) {
         var2 = ActivitySamples$PbActivityInfo$ActivityClass.SLEEP;
      }

      return var2;
   }

   public boolean hasFactor() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeStamp() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasValue() {
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
         var1 = this.getDescriptorForType().hashCode() + 779;
         int var2 = var1;
         if (this.hasValue()) {
            var2 = (var1 * 37 + 1) * 53 + this.value_;
         }

         var1 = var2;
         if (this.hasTimeStamp()) {
            var1 = (var2 * 37 + 2) * 53 + this.getTimeStamp().hashCode();
         }

         var2 = var1;
         if (this.hasFactor()) {
            var2 = (var1 * 37 + 3) * 53 + Float.floatToIntBits(this.getFactor());
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ActivitySamples.d().ensureFieldAccessorsInitialized(ActivitySamples$PbActivityInfo.class, ActivitySamples$PbActivityInfo$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasValue()) {
            this.memoizedIsInitialized = (byte)0;
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

   public ActivitySamples$PbActivityInfo$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ActivitySamples$PbActivityInfo$Builder newBuilderForType(BuilderParent var1) {
      return new ActivitySamples$PbActivityInfo$Builder(var1, (ActivitySamples$1)null);
   }

   public ActivitySamples$PbActivityInfo$Builder toBuilder() {
      ActivitySamples$PbActivityInfo$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ActivitySamples$PbActivityInfo$Builder((ActivitySamples$1)null);
      } else {
         var1 = (new ActivitySamples$PbActivityInfo$Builder((ActivitySamples$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.value_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getTimeStamp());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeFloat(3, this.factor_);
      }

      this.unknownFields.writeTo(var1);
   }
}
