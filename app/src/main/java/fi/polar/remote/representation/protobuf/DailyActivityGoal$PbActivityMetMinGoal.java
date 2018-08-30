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

public final class DailyActivityGoal$PbActivityMetMinGoal extends GeneratedMessageV3 implements DailyActivityGoal$PbActivityMetMinGoalOrBuilder {
   public static final int ACTIVITY_CUTOFF_THRESHOLD_FIELD_NUMBER = 2;
   private static final DailyActivityGoal$PbActivityMetMinGoal DEFAULT_INSTANCE = new DailyActivityGoal$PbActivityMetMinGoal();
   public static final int GOAL_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new DailyActivityGoal$PbActivityMetMinGoal$1();
   private static final long serialVersionUID = 0L;
   private float activityCutoffThreshold_;
   private int bitField0_;
   private float goal_;
   private byte memoizedIsInitialized;

   private DailyActivityGoal$PbActivityMetMinGoal() {
      this.memoizedIsInitialized = (byte)-1;
      this.goal_ = 0.0F;
      this.activityCutoffThreshold_ = 0.0F;
   }

   private DailyActivityGoal$PbActivityMetMinGoal(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   DailyActivityGoal$PbActivityMetMinGoal(CodedInputStream var1, ExtensionRegistryLite var2, DailyActivityGoal$1 var3) {
      this(var1, var2);
   }

   private DailyActivityGoal$PbActivityMetMinGoal(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   DailyActivityGoal$PbActivityMetMinGoal(Builder var1, DailyActivityGoal$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(DailyActivityGoal$PbActivityMetMinGoal var0, float var1) {
      var0.goal_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(DailyActivityGoal$PbActivityMetMinGoal var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(DailyActivityGoal$PbActivityMetMinGoal var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static float b(DailyActivityGoal$PbActivityMetMinGoal var0, float var1) {
      var0.activityCutoffThreshold_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static DailyActivityGoal$PbActivityMetMinGoal getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return DailyActivityGoal.a();
   }

   public static DailyActivityGoal$PbActivityMetMinGoal$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DailyActivityGoal$PbActivityMetMinGoal$Builder newBuilder(DailyActivityGoal$PbActivityMetMinGoal var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static DailyActivityGoal$PbActivityMetMinGoal parseDelimitedFrom(InputStream var0) {
      return (DailyActivityGoal$PbActivityMetMinGoal)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DailyActivityGoal$PbActivityMetMinGoal parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (DailyActivityGoal$PbActivityMetMinGoal)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DailyActivityGoal$PbActivityMetMinGoal parseFrom(ByteString var0) {
      return (DailyActivityGoal$PbActivityMetMinGoal)PARSER.parseFrom(var0);
   }

   public static DailyActivityGoal$PbActivityMetMinGoal parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (DailyActivityGoal$PbActivityMetMinGoal)PARSER.parseFrom(var0, var1);
   }

   public static DailyActivityGoal$PbActivityMetMinGoal parseFrom(CodedInputStream var0) {
      return (DailyActivityGoal$PbActivityMetMinGoal)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DailyActivityGoal$PbActivityMetMinGoal parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (DailyActivityGoal$PbActivityMetMinGoal)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DailyActivityGoal$PbActivityMetMinGoal parseFrom(InputStream var0) {
      return (DailyActivityGoal$PbActivityMetMinGoal)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DailyActivityGoal$PbActivityMetMinGoal parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (DailyActivityGoal$PbActivityMetMinGoal)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DailyActivityGoal$PbActivityMetMinGoal parseFrom(byte[] var0) {
      return (DailyActivityGoal$PbActivityMetMinGoal)PARSER.parseFrom(var0);
   }

   public static DailyActivityGoal$PbActivityMetMinGoal parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (DailyActivityGoal$PbActivityMetMinGoal)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof DailyActivityGoal$PbActivityMetMinGoal)) {
            var2 = super.equals(var1);
         } else {
            DailyActivityGoal$PbActivityMetMinGoal var5 = (DailyActivityGoal$PbActivityMetMinGoal)var1;
            boolean var3;
            if (this.hasGoal() == var5.hasGoal()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasGoal()) {
               if (var3 && Float.floatToIntBits(this.getGoal()) == Float.floatToIntBits(var5.getGoal())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasActivityCutoffThreshold() == var5.hasActivityCutoffThreshold()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasActivityCutoffThreshold()) {
               if (var4 && Float.floatToIntBits(this.getActivityCutoffThreshold()) == Float.floatToIntBits(var5.getActivityCutoffThreshold())) {
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

   public float getActivityCutoffThreshold() {
      return this.activityCutoffThreshold_;
   }

   public DailyActivityGoal$PbActivityMetMinGoal getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public float getGoal() {
      return this.goal_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeFloatSize(1, this.goal_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeFloatSize(2, this.activityCutoffThreshold_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasActivityCutoffThreshold() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasGoal() {
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
         if (this.hasGoal()) {
            var1 = (var2 * 37 + 1) * 53 + Float.floatToIntBits(this.getGoal());
         }

         var2 = var1;
         if (this.hasActivityCutoffThreshold()) {
            var2 = (var1 * 37 + 2) * 53 + Float.floatToIntBits(this.getActivityCutoffThreshold());
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return DailyActivityGoal.b().ensureFieldAccessorsInitialized(DailyActivityGoal$PbActivityMetMinGoal.class, DailyActivityGoal$PbActivityMetMinGoal$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasGoal()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public DailyActivityGoal$PbActivityMetMinGoal$Builder newBuilderForType() {
      return newBuilder();
   }

   protected DailyActivityGoal$PbActivityMetMinGoal$Builder newBuilderForType(BuilderParent var1) {
      return new DailyActivityGoal$PbActivityMetMinGoal$Builder(var1, (DailyActivityGoal$1)null);
   }

   public DailyActivityGoal$PbActivityMetMinGoal$Builder toBuilder() {
      DailyActivityGoal$PbActivityMetMinGoal$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new DailyActivityGoal$PbActivityMetMinGoal$Builder((DailyActivityGoal$1)null);
      } else {
         var1 = (new DailyActivityGoal$PbActivityMetMinGoal$Builder((DailyActivityGoal$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeFloat(1, this.goal_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeFloat(2, this.activityCutoffThreshold_);
      }

      this.unknownFields.writeTo(var1);
   }
}
