package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.InputStream;

public final class ActivitySamples$PbSportInfo extends GeneratedMessageV3 implements ActivitySamples$PbSportInfoOrBuilder {
   private static final ActivitySamples$PbSportInfo DEFAULT_INSTANCE = new ActivitySamples$PbSportInfo();
   public static final int FACTOR_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new ActivitySamples$PbSportInfo$1();
   public static final int SPORT_PROFILE_ID_FIELD_NUMBER = 3;
   public static final int TIME_STAMP_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private float factor_;
   private byte memoizedIsInitialized;
   private long sportProfileId_;
   private Types$PbLocalDateTime timeStamp_;

   private ActivitySamples$PbSportInfo() {
      this.memoizedIsInitialized = (byte)-1;
      this.factor_ = 0.0F;
      this.sportProfileId_ = 0L;
   }

   private ActivitySamples$PbSportInfo(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ActivitySamples$PbSportInfo(CodedInputStream var1, ExtensionRegistryLite var2, ActivitySamples$1 var3) {
      this(var1, var2);
   }

   private ActivitySamples$PbSportInfo(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ActivitySamples$PbSportInfo(Builder var1, ActivitySamples$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(ActivitySamples$PbSportInfo var0, float var1) {
      var0.factor_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(ActivitySamples$PbSportInfo var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static long a(ActivitySamples$PbSportInfo var0, long var1) {
      var0.sportProfileId_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ActivitySamples$PbSportInfo var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbLocalDateTime a(ActivitySamples$PbSportInfo var0, Types$PbLocalDateTime var1) {
      var0.timeStamp_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static ActivitySamples$PbSportInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ActivitySamples.a();
   }

   public static ActivitySamples$PbSportInfo$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ActivitySamples$PbSportInfo$Builder newBuilder(ActivitySamples$PbSportInfo var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ActivitySamples$PbSportInfo parseDelimitedFrom(InputStream var0) {
      return (ActivitySamples$PbSportInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ActivitySamples$PbSportInfo parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ActivitySamples$PbSportInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ActivitySamples$PbSportInfo parseFrom(ByteString var0) {
      return (ActivitySamples$PbSportInfo)PARSER.parseFrom(var0);
   }

   public static ActivitySamples$PbSportInfo parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ActivitySamples$PbSportInfo)PARSER.parseFrom(var0, var1);
   }

   public static ActivitySamples$PbSportInfo parseFrom(CodedInputStream var0) {
      return (ActivitySamples$PbSportInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ActivitySamples$PbSportInfo parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ActivitySamples$PbSportInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ActivitySamples$PbSportInfo parseFrom(InputStream var0) {
      return (ActivitySamples$PbSportInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ActivitySamples$PbSportInfo parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ActivitySamples$PbSportInfo)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ActivitySamples$PbSportInfo parseFrom(byte[] var0) {
      return (ActivitySamples$PbSportInfo)PARSER.parseFrom(var0);
   }

   public static ActivitySamples$PbSportInfo parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ActivitySamples$PbSportInfo)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ActivitySamples$PbSportInfo)) {
            var2 = super.equals(var1);
         } else {
            ActivitySamples$PbSportInfo var5 = (ActivitySamples$PbSportInfo)var1;
            boolean var3;
            if (this.hasFactor() == var5.hasFactor()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasFactor()) {
               if (var3 && Float.floatToIntBits(this.getFactor()) == Float.floatToIntBits(var5.getFactor())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTimeStamp() == var5.hasTimeStamp()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasTimeStamp()) {
               if (var3 && this.getTimeStamp().equals(var5.getTimeStamp())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSportProfileId() == var5.hasSportProfileId()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSportProfileId()) {
               if (var3 && this.getSportProfileId() == var5.getSportProfileId()) {
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

   public ActivitySamples$PbSportInfo getDefaultInstanceForType() {
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
            var2 = 0 + CodedOutputStream.computeFloatSize(1, this.factor_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeMessageSize(2, this.getTimeStamp());
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeUInt64Size(3, this.sportProfileId_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public long getSportProfileId() {
      return this.sportProfileId_;
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

   public boolean hasFactor() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSportProfileId() {
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

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         var1 = this.getDescriptorForType().hashCode() + 779;
         int var2 = var1;
         if (this.hasFactor()) {
            var2 = (var1 * 37 + 1) * 53 + Float.floatToIntBits(this.getFactor());
         }

         var1 = var2;
         if (this.hasTimeStamp()) {
            var1 = (var2 * 37 + 2) * 53 + this.getTimeStamp().hashCode();
         }

         var2 = var1;
         if (this.hasSportProfileId()) {
            var2 = (var1 * 37 + 3) * 53 + Internal.hashLong(this.getSportProfileId());
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ActivitySamples.b().ensureFieldAccessorsInitialized(ActivitySamples$PbSportInfo.class, ActivitySamples$PbSportInfo$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasFactor()) {
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

   public ActivitySamples$PbSportInfo$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ActivitySamples$PbSportInfo$Builder newBuilderForType(BuilderParent var1) {
      return new ActivitySamples$PbSportInfo$Builder(var1, (ActivitySamples$1)null);
   }

   public ActivitySamples$PbSportInfo$Builder toBuilder() {
      ActivitySamples$PbSportInfo$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ActivitySamples$PbSportInfo$Builder((ActivitySamples$1)null);
      } else {
         var1 = (new ActivitySamples$PbSportInfo$Builder((ActivitySamples$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeFloat(1, this.factor_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getTimeStamp());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeUInt64(3, this.sportProfileId_);
      }

      this.unknownFields.writeTo(var1);
   }
}
