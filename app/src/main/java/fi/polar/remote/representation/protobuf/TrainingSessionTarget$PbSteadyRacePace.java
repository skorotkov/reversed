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

public final class TrainingSessionTarget$PbSteadyRacePace extends GeneratedMessageV3 implements TrainingSessionTarget$PbSteadyRacePaceOrBuilder {
   private static final TrainingSessionTarget$PbSteadyRacePace DEFAULT_INSTANCE = new TrainingSessionTarget$PbSteadyRacePace();
   public static final int DISTANCE_FIELD_NUMBER = 2;
   public static final int DURATION_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new TrainingSessionTarget$PbSteadyRacePace$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private float distance_;
   private Types$PbDuration duration_;
   private byte memoizedIsInitialized;

   private TrainingSessionTarget$PbSteadyRacePace() {
      this.memoizedIsInitialized = (byte)-1;
      this.distance_ = 0.0F;
   }

   private TrainingSessionTarget$PbSteadyRacePace(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   TrainingSessionTarget$PbSteadyRacePace(CodedInputStream var1, ExtensionRegistryLite var2, TrainingSessionTarget$1 var3) {
      this(var1, var2);
   }

   private TrainingSessionTarget$PbSteadyRacePace(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   TrainingSessionTarget$PbSteadyRacePace(Builder var1, TrainingSessionTarget$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(TrainingSessionTarget$PbSteadyRacePace var0, float var1) {
      var0.distance_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(TrainingSessionTarget$PbSteadyRacePace var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(TrainingSessionTarget$PbSteadyRacePace var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbDuration a(TrainingSessionTarget$PbSteadyRacePace var0, Types$PbDuration var1) {
      var0.duration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static TrainingSessionTarget$PbSteadyRacePace getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return TrainingSessionTarget.a();
   }

   public static TrainingSessionTarget$PbSteadyRacePace$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static TrainingSessionTarget$PbSteadyRacePace$Builder newBuilder(TrainingSessionTarget$PbSteadyRacePace var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static TrainingSessionTarget$PbSteadyRacePace parseDelimitedFrom(InputStream var0) {
      return (TrainingSessionTarget$PbSteadyRacePace)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static TrainingSessionTarget$PbSteadyRacePace parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (TrainingSessionTarget$PbSteadyRacePace)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static TrainingSessionTarget$PbSteadyRacePace parseFrom(ByteString var0) {
      return (TrainingSessionTarget$PbSteadyRacePace)PARSER.parseFrom(var0);
   }

   public static TrainingSessionTarget$PbSteadyRacePace parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (TrainingSessionTarget$PbSteadyRacePace)PARSER.parseFrom(var0, var1);
   }

   public static TrainingSessionTarget$PbSteadyRacePace parseFrom(CodedInputStream var0) {
      return (TrainingSessionTarget$PbSteadyRacePace)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static TrainingSessionTarget$PbSteadyRacePace parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (TrainingSessionTarget$PbSteadyRacePace)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static TrainingSessionTarget$PbSteadyRacePace parseFrom(InputStream var0) {
      return (TrainingSessionTarget$PbSteadyRacePace)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static TrainingSessionTarget$PbSteadyRacePace parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (TrainingSessionTarget$PbSteadyRacePace)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static TrainingSessionTarget$PbSteadyRacePace parseFrom(byte[] var0) {
      return (TrainingSessionTarget$PbSteadyRacePace)PARSER.parseFrom(var0);
   }

   public static TrainingSessionTarget$PbSteadyRacePace parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (TrainingSessionTarget$PbSteadyRacePace)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof TrainingSessionTarget$PbSteadyRacePace)) {
            var2 = super.equals(var1);
         } else {
            TrainingSessionTarget$PbSteadyRacePace var5 = (TrainingSessionTarget$PbSteadyRacePace)var1;
            boolean var3;
            if (this.hasDuration() == var5.hasDuration()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasDuration()) {
               if (var3 && this.getDuration().equals(var5.getDuration())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasDistance() == var5.hasDistance()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasDistance()) {
               if (var3 && Float.floatToIntBits(this.getDistance()) == Float.floatToIntBits(var5.getDistance())) {
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

   public TrainingSessionTarget$PbSteadyRacePace getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
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
            var1 = 0 + CodedOutputStream.computeMessageSize(1, this.getDuration());
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeFloatSize(2, this.distance_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasDistance() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDuration() {
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
         if (this.hasDuration()) {
            var1 = (var2 * 37 + 1) * 53 + this.getDuration().hashCode();
         }

         var2 = var1;
         if (this.hasDistance()) {
            var2 = (var1 * 37 + 2) * 53 + Float.floatToIntBits(this.getDistance());
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return TrainingSessionTarget.b().ensureFieldAccessorsInitialized(TrainingSessionTarget$PbSteadyRacePace.class, TrainingSessionTarget$PbSteadyRacePace$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasDuration()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasDistance()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public TrainingSessionTarget$PbSteadyRacePace$Builder newBuilderForType() {
      return newBuilder();
   }

   protected TrainingSessionTarget$PbSteadyRacePace$Builder newBuilderForType(BuilderParent var1) {
      return new TrainingSessionTarget$PbSteadyRacePace$Builder(var1, (TrainingSessionTarget$1)null);
   }

   public TrainingSessionTarget$PbSteadyRacePace$Builder toBuilder() {
      TrainingSessionTarget$PbSteadyRacePace$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new TrainingSessionTarget$PbSteadyRacePace$Builder((TrainingSessionTarget$1)null);
      } else {
         var1 = (new TrainingSessionTarget$PbSteadyRacePace$Builder((TrainingSessionTarget$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getDuration());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeFloat(2, this.distance_);
      }

      this.unknownFields.writeTo(var1);
   }
}
