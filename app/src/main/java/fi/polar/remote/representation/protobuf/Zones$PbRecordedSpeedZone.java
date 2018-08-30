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

public final class Zones$PbRecordedSpeedZone extends GeneratedMessageV3 implements Zones$PbRecordedSpeedZoneOrBuilder {
   private static final Zones$PbRecordedSpeedZone DEFAULT_INSTANCE = new Zones$PbRecordedSpeedZone();
   public static final int DISTANCE_IN_ZONE_FIELD_NUMBER = 3;
   @Deprecated
   public static final Parser PARSER = new Zones$PbRecordedSpeedZone$1();
   public static final int TIME_IN_ZONE_FIELD_NUMBER = 2;
   public static final int ZONE_LIMITS_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private float distanceInZone_;
   private byte memoizedIsInitialized;
   private Types$PbDuration timeInZone_;
   private Structures$PbSpeedZone zoneLimits_;

   private Zones$PbRecordedSpeedZone() {
      this.memoizedIsInitialized = (byte)-1;
      this.distanceInZone_ = 0.0F;
   }

   private Zones$PbRecordedSpeedZone(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Zones$PbRecordedSpeedZone(CodedInputStream var1, ExtensionRegistryLite var2, Zones$1 var3) {
      this(var1, var2);
   }

   private Zones$PbRecordedSpeedZone(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Zones$PbRecordedSpeedZone(Builder var1, Zones$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(Zones$PbRecordedSpeedZone var0, float var1) {
      var0.distanceInZone_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(Zones$PbRecordedSpeedZone var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Zones$PbRecordedSpeedZone var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Structures$PbSpeedZone a(Zones$PbRecordedSpeedZone var0, Structures$PbSpeedZone var1) {
      var0.zoneLimits_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration a(Zones$PbRecordedSpeedZone var0, Types$PbDuration var1) {
      var0.timeInZone_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static Zones$PbRecordedSpeedZone getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Zones.g();
   }

   public static Zones$PbRecordedSpeedZone$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Zones$PbRecordedSpeedZone$Builder newBuilder(Zones$PbRecordedSpeedZone var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Zones$PbRecordedSpeedZone parseDelimitedFrom(InputStream var0) {
      return (Zones$PbRecordedSpeedZone)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Zones$PbRecordedSpeedZone parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Zones$PbRecordedSpeedZone)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Zones$PbRecordedSpeedZone parseFrom(ByteString var0) {
      return (Zones$PbRecordedSpeedZone)PARSER.parseFrom(var0);
   }

   public static Zones$PbRecordedSpeedZone parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Zones$PbRecordedSpeedZone)PARSER.parseFrom(var0, var1);
   }

   public static Zones$PbRecordedSpeedZone parseFrom(CodedInputStream var0) {
      return (Zones$PbRecordedSpeedZone)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Zones$PbRecordedSpeedZone parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Zones$PbRecordedSpeedZone)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Zones$PbRecordedSpeedZone parseFrom(InputStream var0) {
      return (Zones$PbRecordedSpeedZone)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Zones$PbRecordedSpeedZone parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Zones$PbRecordedSpeedZone)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Zones$PbRecordedSpeedZone parseFrom(byte[] var0) {
      return (Zones$PbRecordedSpeedZone)PARSER.parseFrom(var0);
   }

   public static Zones$PbRecordedSpeedZone parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Zones$PbRecordedSpeedZone)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Zones$PbRecordedSpeedZone)) {
            var2 = super.equals(var1);
         } else {
            Zones$PbRecordedSpeedZone var5 = (Zones$PbRecordedSpeedZone)var1;
            boolean var3;
            if (this.hasZoneLimits() == var5.hasZoneLimits()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasZoneLimits()) {
               if (var3 && this.getZoneLimits().equals(var5.getZoneLimits())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTimeInZone() == var5.hasTimeInZone()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasTimeInZone()) {
               if (var3 && this.getTimeInZone().equals(var5.getTimeInZone())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasDistanceInZone() == var5.hasDistanceInZone()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasDistanceInZone()) {
               if (var4 && Float.floatToIntBits(this.getDistanceInZone()) == Float.floatToIntBits(var5.getDistanceInZone())) {
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

   public Zones$PbRecordedSpeedZone getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public float getDistanceInZone() {
      return this.distanceInZone_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeMessageSize(1, this.getZoneLimits());
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeMessageSize(2, this.getTimeInZone());
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeFloatSize(3, this.distanceInZone_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public Types$PbDuration getTimeInZone() {
      Types$PbDuration var1;
      if (this.timeInZone_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeInZone_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getTimeInZoneOrBuilder() {
      Types$PbDuration var1;
      if (this.timeInZone_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.timeInZone_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public Structures$PbSpeedZone getZoneLimits() {
      Structures$PbSpeedZone var1;
      if (this.zoneLimits_ == null) {
         var1 = Structures$PbSpeedZone.getDefaultInstance();
      } else {
         var1 = this.zoneLimits_;
      }

      return var1;
   }

   public Structures$PbSpeedZoneOrBuilder getZoneLimitsOrBuilder() {
      Structures$PbSpeedZone var1;
      if (this.zoneLimits_ == null) {
         var1 = Structures$PbSpeedZone.getDefaultInstance();
      } else {
         var1 = this.zoneLimits_;
      }

      return var1;
   }

   public boolean hasDistanceInZone() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimeInZone() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasZoneLimits() {
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
         if (this.hasZoneLimits()) {
            var2 = (var1 * 37 + 1) * 53 + this.getZoneLimits().hashCode();
         }

         var1 = var2;
         if (this.hasTimeInZone()) {
            var1 = (var2 * 37 + 2) * 53 + this.getTimeInZone().hashCode();
         }

         var2 = var1;
         if (this.hasDistanceInZone()) {
            var2 = (var1 * 37 + 3) * 53 + Float.floatToIntBits(this.getDistanceInZone());
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Zones.h().ensureFieldAccessorsInitialized(Zones$PbRecordedSpeedZone.class, Zones$PbRecordedSpeedZone$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasZoneLimits()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getZoneLimits().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Zones$PbRecordedSpeedZone$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Zones$PbRecordedSpeedZone$Builder newBuilderForType(BuilderParent var1) {
      return new Zones$PbRecordedSpeedZone$Builder(var1, (Zones$1)null);
   }

   public Zones$PbRecordedSpeedZone$Builder toBuilder() {
      Zones$PbRecordedSpeedZone$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Zones$PbRecordedSpeedZone$Builder((Zones$1)null);
      } else {
         var1 = (new Zones$PbRecordedSpeedZone$Builder((Zones$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getZoneLimits());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getTimeInZone());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeFloat(3, this.distanceInZone_);
      }

      this.unknownFields.writeTo(var1);
   }
}
