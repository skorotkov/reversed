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

public final class ExerciseLap$PbLapHeader extends GeneratedMessageV3 implements ExerciseLap$PbLapHeaderOrBuilder {
   public static final int ASCENT_FIELD_NUMBER = 4;
   public static final int AUTOLAP_TYPE_FIELD_NUMBER = 6;
   private static final ExerciseLap$PbLapHeader DEFAULT_INSTANCE = new ExerciseLap$PbLapHeader();
   public static final int DESCENT_FIELD_NUMBER = 5;
   public static final int DISTANCE_FIELD_NUMBER = 3;
   public static final int DURATION_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new ExerciseLap$PbLapHeader$1();
   public static final int SPLIT_TIME_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private float ascent_;
   private int autolapType_;
   private int bitField0_;
   private float descent_;
   private float distance_;
   private Types$PbDuration duration_;
   private byte memoizedIsInitialized;
   private Types$PbDuration splitTime_;

   private ExerciseLap$PbLapHeader() {
      this.memoizedIsInitialized = (byte)-1;
      this.distance_ = 0.0F;
      this.ascent_ = 0.0F;
      this.descent_ = 0.0F;
      this.autolapType_ = 1;
   }

   private ExerciseLap$PbLapHeader(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseLap$PbLapHeader(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseLap$1 var3) {
      this(var1, var2);
   }

   private ExerciseLap$PbLapHeader(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseLap$PbLapHeader(Builder var1, ExerciseLap$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(ExerciseLap$PbLapHeader var0, float var1) {
      var0.distance_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(ExerciseLap$PbLapHeader var0, int var1) {
      var0.autolapType_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExerciseLap$PbLapHeader var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbDuration a(ExerciseLap$PbLapHeader var0, Types$PbDuration var1) {
      var0.splitTime_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static float b(ExerciseLap$PbLapHeader var0, float var1) {
      var0.ascent_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(ExerciseLap$PbLapHeader var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration b(ExerciseLap$PbLapHeader var0, Types$PbDuration var1) {
      var0.duration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static float c(ExerciseLap$PbLapHeader var0, float var1) {
      var0.descent_ = var1;
      return var1;
   }

   public static ExerciseLap$PbLapHeader getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseLap.a();
   }

   public static ExerciseLap$PbLapHeader$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseLap$PbLapHeader$Builder newBuilder(ExerciseLap$PbLapHeader var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseLap$PbLapHeader parseDelimitedFrom(InputStream var0) {
      return (ExerciseLap$PbLapHeader)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLapHeader parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapHeader)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLapHeader parseFrom(ByteString var0) {
      return (ExerciseLap$PbLapHeader)PARSER.parseFrom(var0);
   }

   public static ExerciseLap$PbLapHeader parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapHeader)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseLap$PbLapHeader parseFrom(CodedInputStream var0) {
      return (ExerciseLap$PbLapHeader)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLapHeader parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapHeader)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLapHeader parseFrom(InputStream var0) {
      return (ExerciseLap$PbLapHeader)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseLap$PbLapHeader parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapHeader)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseLap$PbLapHeader parseFrom(byte[] var0) {
      return (ExerciseLap$PbLapHeader)PARSER.parseFrom(var0);
   }

   public static ExerciseLap$PbLapHeader parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseLap$PbLapHeader)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseLap$PbLapHeader)) {
            var2 = super.equals(var1);
         } else {
            ExerciseLap$PbLapHeader var5 = (ExerciseLap$PbLapHeader)var1;
            boolean var3;
            if (this.hasSplitTime() == var5.hasSplitTime()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasSplitTime()) {
               if (var3 && this.getSplitTime().equals(var5.getSplitTime())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasDuration() == var5.hasDuration()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasDuration()) {
               if (var4 && this.getDuration().equals(var5.getDuration())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasDistance() == var5.hasDistance()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasDistance()) {
               if (var4 && Float.floatToIntBits(this.getDistance()) == Float.floatToIntBits(var5.getDistance())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasAscent() == var5.hasAscent()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAscent()) {
               if (var4 && Float.floatToIntBits(this.getAscent()) == Float.floatToIntBits(var5.getAscent())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasDescent() == var5.hasDescent()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasDescent()) {
               if (var3 && Float.floatToIntBits(this.getDescent()) == Float.floatToIntBits(var5.getDescent())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAutolapType() == var5.hasAutolapType()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAutolapType()) {
               if (var4 && this.autolapType_ == var5.autolapType_) {
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

   public float getAscent() {
      return this.ascent_;
   }

   public ExerciseLap$PbLapHeader$PbAutolapType getAutolapType() {
      ExerciseLap$PbLapHeader$PbAutolapType var1 = ExerciseLap$PbLapHeader$PbAutolapType.valueOf(this.autolapType_);
      ExerciseLap$PbLapHeader$PbAutolapType var2 = var1;
      if (var1 == null) {
         var2 = ExerciseLap$PbLapHeader$PbAutolapType.AUTOLAP_TYPE_DISTANCE;
      }

      return var2;
   }

   public ExerciseLap$PbLapHeader getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public float getDescent() {
      return this.descent_;
   }

   public float getDistance() {
      return this.distance_;
   }

   public Types$PbDuration getDuration() {
      Types$PbDuration var1;
      if (this.duration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.duration_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getDurationOrBuilder() {
      Types$PbDuration var1;
      if (this.duration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.duration_;
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
            var1 = 0 + CodedOutputStream.computeMessageSize(1, this.getSplitTime());
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeMessageSize(2, this.getDuration());
         }

         var1 = var2;
         if ((this.bitField0_ & 4) == 4) {
            var1 = var2 + CodedOutputStream.computeFloatSize(3, this.distance_);
         }

         var2 = var1;
         if ((this.bitField0_ & 8) == 8) {
            var2 = var1 + CodedOutputStream.computeFloatSize(4, this.ascent_);
         }

         var1 = var2;
         if ((this.bitField0_ & 16) == 16) {
            var1 = var2 + CodedOutputStream.computeFloatSize(5, this.descent_);
         }

         var2 = var1;
         if ((this.bitField0_ & 32) == 32) {
            var2 = var1 + CodedOutputStream.computeEnumSize(6, this.autolapType_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public Types$PbDuration getSplitTime() {
      Types$PbDuration var1;
      if (this.splitTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.splitTime_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getSplitTimeOrBuilder() {
      Types$PbDuration var1;
      if (this.splitTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.splitTime_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasAscent() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAutolapType() {
      boolean var1;
      if ((this.bitField0_ & 32) == 32) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDescent() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDistance() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDuration() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSplitTime() {
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
         if (this.hasSplitTime()) {
            var2 = (var1 * 37 + 1) * 53 + this.getSplitTime().hashCode();
         }

         var1 = var2;
         if (this.hasDuration()) {
            var1 = (var2 * 37 + 2) * 53 + this.getDuration().hashCode();
         }

         var2 = var1;
         if (this.hasDistance()) {
            var2 = (var1 * 37 + 3) * 53 + Float.floatToIntBits(this.getDistance());
         }

         var1 = var2;
         if (this.hasAscent()) {
            var1 = (var2 * 37 + 4) * 53 + Float.floatToIntBits(this.getAscent());
         }

         var2 = var1;
         if (this.hasDescent()) {
            var2 = (var1 * 37 + 5) * 53 + Float.floatToIntBits(this.getDescent());
         }

         var1 = var2;
         if (this.hasAutolapType()) {
            var1 = (var2 * 37 + 6) * 53 + this.autolapType_;
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseLap.b().ensureFieldAccessorsInitialized(ExerciseLap$PbLapHeader.class, ExerciseLap$PbLapHeader$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasSplitTime()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasDuration()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public ExerciseLap$PbLapHeader$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseLap$PbLapHeader$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseLap$PbLapHeader$Builder(var1, (ExerciseLap$1)null);
   }

   public ExerciseLap$PbLapHeader$Builder toBuilder() {
      ExerciseLap$PbLapHeader$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseLap$PbLapHeader$Builder((ExerciseLap$1)null);
      } else {
         var1 = (new ExerciseLap$PbLapHeader$Builder((ExerciseLap$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getSplitTime());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getDuration());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeFloat(3, this.distance_);
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeFloat(4, this.ascent_);
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeFloat(5, this.descent_);
      }

      if ((this.bitField0_ & 32) == 32) {
         var1.writeEnum(6, this.autolapType_);
      }

      this.unknownFields.writeTo(var1);
   }
}
