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

public final class Structures$PbStravaSegmentTarget extends GeneratedMessageV3 implements Structures$PbStravaSegmentTargetOrBuilder {
   private static final Structures$PbStravaSegmentTarget DEFAULT_INSTANCE = new Structures$PbStravaSegmentTarget();
   @Deprecated
   public static final Parser PARSER = new Structures$PbStravaSegmentTarget$1();
   public static final int STRAVA_SEGMENT_TARGETS_FIELD_NUMBER = 2;
   public static final int STRAVA_SEGMENT_TYPE_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private Structures$PbStravaSegmentTargets stravaSegmentTargets_;
   private int stravaSegmentType_;

   private Structures$PbStravaSegmentTarget() {
      this.memoizedIsInitialized = (byte)-1;
      this.stravaSegmentType_ = 1;
   }

   private Structures$PbStravaSegmentTarget(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Structures$PbStravaSegmentTarget(CodedInputStream var1, ExtensionRegistryLite var2, Structures$1 var3) {
      this(var1, var2);
   }

   private Structures$PbStravaSegmentTarget(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Structures$PbStravaSegmentTarget(Builder var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Structures$PbStravaSegmentTarget var0, int var1) {
      var0.stravaSegmentType_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Structures$PbStravaSegmentTarget var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Structures$PbStravaSegmentTargets a(Structures$PbStravaSegmentTarget var0, Structures$PbStravaSegmentTargets var1) {
      var0.stravaSegmentTargets_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(Structures$PbStravaSegmentTarget var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static Structures$PbStravaSegmentTarget getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Structures.e();
   }

   public static Structures$PbStravaSegmentTarget$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Structures$PbStravaSegmentTarget$Builder newBuilder(Structures$PbStravaSegmentTarget var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Structures$PbStravaSegmentTarget parseDelimitedFrom(InputStream var0) {
      return (Structures$PbStravaSegmentTarget)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Structures$PbStravaSegmentTarget parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbStravaSegmentTarget)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbStravaSegmentTarget parseFrom(ByteString var0) {
      return (Structures$PbStravaSegmentTarget)PARSER.parseFrom(var0);
   }

   public static Structures$PbStravaSegmentTarget parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Structures$PbStravaSegmentTarget)PARSER.parseFrom(var0, var1);
   }

   public static Structures$PbStravaSegmentTarget parseFrom(CodedInputStream var0) {
      return (Structures$PbStravaSegmentTarget)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbStravaSegmentTarget parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbStravaSegmentTarget)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbStravaSegmentTarget parseFrom(InputStream var0) {
      return (Structures$PbStravaSegmentTarget)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbStravaSegmentTarget parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbStravaSegmentTarget)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbStravaSegmentTarget parseFrom(byte[] var0) {
      return (Structures$PbStravaSegmentTarget)PARSER.parseFrom(var0);
   }

   public static Structures$PbStravaSegmentTarget parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Structures$PbStravaSegmentTarget)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Structures$PbStravaSegmentTarget)) {
            var2 = super.equals(var1);
         } else {
            Structures$PbStravaSegmentTarget var5 = (Structures$PbStravaSegmentTarget)var1;
            boolean var3;
            if (this.hasStravaSegmentType() == var5.hasStravaSegmentType()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasStravaSegmentType()) {
               if (var3 && this.stravaSegmentType_ == var5.stravaSegmentType_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasStravaSegmentTargets() == var5.hasStravaSegmentTargets()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasStravaSegmentTargets()) {
               if (var3 && this.getStravaSegmentTargets().equals(var5.getStravaSegmentTargets())) {
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

   public Structures$PbStravaSegmentTarget getDefaultInstanceForType() {
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
            var1 = 0 + CodedOutputStream.computeEnumSize(1, this.stravaSegmentType_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeMessageSize(2, this.getStravaSegmentTargets());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public Structures$PbStravaSegmentTargets getStravaSegmentTargets() {
      Structures$PbStravaSegmentTargets var1;
      if (this.stravaSegmentTargets_ == null) {
         var1 = Structures$PbStravaSegmentTargets.getDefaultInstance();
      } else {
         var1 = this.stravaSegmentTargets_;
      }

      return var1;
   }

   public Structures$PbStravaSegmentTargetsOrBuilder getStravaSegmentTargetsOrBuilder() {
      Structures$PbStravaSegmentTargets var1;
      if (this.stravaSegmentTargets_ == null) {
         var1 = Structures$PbStravaSegmentTargets.getDefaultInstance();
      } else {
         var1 = this.stravaSegmentTargets_;
      }

      return var1;
   }

   public Structures$PbStravaSegmentTarget$PbStravaSegmentType getStravaSegmentType() {
      Structures$PbStravaSegmentTarget$PbStravaSegmentType var1 = Structures$PbStravaSegmentTarget$PbStravaSegmentType.valueOf(this.stravaSegmentType_);
      Structures$PbStravaSegmentTarget$PbStravaSegmentType var2 = var1;
      if (var1 == null) {
         var2 = Structures$PbStravaSegmentTarget$PbStravaSegmentType.STRAVA_SEGMENT_TYPE_RIDE;
      }

      return var2;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasStravaSegmentTargets() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStravaSegmentType() {
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
         if (this.hasStravaSegmentType()) {
            var1 = (var2 * 37 + 1) * 53 + this.stravaSegmentType_;
         }

         var2 = var1;
         if (this.hasStravaSegmentTargets()) {
            var2 = (var1 * 37 + 2) * 53 + this.getStravaSegmentTargets().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.f().ensureFieldAccessorsInitialized(Structures$PbStravaSegmentTarget.class, Structures$PbStravaSegmentTarget$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasStravaSegmentType()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Structures$PbStravaSegmentTarget$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Structures$PbStravaSegmentTarget$Builder newBuilderForType(BuilderParent var1) {
      return new Structures$PbStravaSegmentTarget$Builder(var1, (Structures$1)null);
   }

   public Structures$PbStravaSegmentTarget$Builder toBuilder() {
      Structures$PbStravaSegmentTarget$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Structures$PbStravaSegmentTarget$Builder((Structures$1)null);
      } else {
         var1 = (new Structures$PbStravaSegmentTarget$Builder((Structures$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.stravaSegmentType_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getStravaSegmentTargets());
      }

      this.unknownFields.writeTo(var1);
   }
}
