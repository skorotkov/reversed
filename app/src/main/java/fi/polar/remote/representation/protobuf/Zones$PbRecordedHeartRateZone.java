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

public final class Zones$PbRecordedHeartRateZone extends GeneratedMessageV3 implements Zones$PbRecordedHeartRateZoneOrBuilder {
   private static final Zones$PbRecordedHeartRateZone DEFAULT_INSTANCE = new Zones$PbRecordedHeartRateZone();
   public static final int IN_ZONE_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new Zones$PbRecordedHeartRateZone$1();
   public static final int ZONE_LIMITS_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private Types$PbDuration inZone_;
   private byte memoizedIsInitialized;
   private Structures$PbHeartRateZone zoneLimits_;

   private Zones$PbRecordedHeartRateZone() {
      this.memoizedIsInitialized = (byte)-1;
   }

   private Zones$PbRecordedHeartRateZone(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Zones$PbRecordedHeartRateZone(CodedInputStream var1, ExtensionRegistryLite var2, Zones$1 var3) {
      this(var1, var2);
   }

   private Zones$PbRecordedHeartRateZone(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Zones$PbRecordedHeartRateZone(Builder var1, Zones$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Zones$PbRecordedHeartRateZone var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Zones$PbRecordedHeartRateZone var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Structures$PbHeartRateZone a(Zones$PbRecordedHeartRateZone var0, Structures$PbHeartRateZone var1) {
      var0.zoneLimits_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration a(Zones$PbRecordedHeartRateZone var0, Types$PbDuration var1) {
      var0.inZone_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static Zones$PbRecordedHeartRateZone getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Zones.a();
   }

   public static Zones$PbRecordedHeartRateZone$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Zones$PbRecordedHeartRateZone$Builder newBuilder(Zones$PbRecordedHeartRateZone var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Zones$PbRecordedHeartRateZone parseDelimitedFrom(InputStream var0) {
      return (Zones$PbRecordedHeartRateZone)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Zones$PbRecordedHeartRateZone parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Zones$PbRecordedHeartRateZone)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Zones$PbRecordedHeartRateZone parseFrom(ByteString var0) {
      return (Zones$PbRecordedHeartRateZone)PARSER.parseFrom(var0);
   }

   public static Zones$PbRecordedHeartRateZone parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Zones$PbRecordedHeartRateZone)PARSER.parseFrom(var0, var1);
   }

   public static Zones$PbRecordedHeartRateZone parseFrom(CodedInputStream var0) {
      return (Zones$PbRecordedHeartRateZone)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Zones$PbRecordedHeartRateZone parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Zones$PbRecordedHeartRateZone)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Zones$PbRecordedHeartRateZone parseFrom(InputStream var0) {
      return (Zones$PbRecordedHeartRateZone)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Zones$PbRecordedHeartRateZone parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Zones$PbRecordedHeartRateZone)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Zones$PbRecordedHeartRateZone parseFrom(byte[] var0) {
      return (Zones$PbRecordedHeartRateZone)PARSER.parseFrom(var0);
   }

   public static Zones$PbRecordedHeartRateZone parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Zones$PbRecordedHeartRateZone)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Zones$PbRecordedHeartRateZone)) {
            var2 = super.equals(var1);
         } else {
            Zones$PbRecordedHeartRateZone var5 = (Zones$PbRecordedHeartRateZone)var1;
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

            if (var4 && this.hasInZone() == var5.hasInZone()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasInZone()) {
               if (var4 && this.getInZone().equals(var5.getInZone())) {
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

   public Zones$PbRecordedHeartRateZone getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Types$PbDuration getInZone() {
      Types$PbDuration var1;
      if (this.inZone_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.inZone_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getInZoneOrBuilder() {
      Types$PbDuration var1;
      if (this.inZone_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.inZone_;
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
            var1 = 0 + CodedOutputStream.computeMessageSize(1, this.getZoneLimits());
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeMessageSize(2, this.getInZone());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public Structures$PbHeartRateZone getZoneLimits() {
      Structures$PbHeartRateZone var1;
      if (this.zoneLimits_ == null) {
         var1 = Structures$PbHeartRateZone.getDefaultInstance();
      } else {
         var1 = this.zoneLimits_;
      }

      return var1;
   }

   public Structures$PbHeartRateZoneOrBuilder getZoneLimitsOrBuilder() {
      Structures$PbHeartRateZone var1;
      if (this.zoneLimits_ == null) {
         var1 = Structures$PbHeartRateZone.getDefaultInstance();
      } else {
         var1 = this.zoneLimits_;
      }

      return var1;
   }

   public boolean hasInZone() {
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
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.hasZoneLimits()) {
            var1 = (var2 * 37 + 1) * 53 + this.getZoneLimits().hashCode();
         }

         var2 = var1;
         if (this.hasInZone()) {
            var2 = (var1 * 37 + 2) * 53 + this.getInZone().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Zones.b().ensureFieldAccessorsInitialized(Zones$PbRecordedHeartRateZone.class, Zones$PbRecordedHeartRateZone$Builder.class);
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
         } else if (!this.hasInZone()) {
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

   public Zones$PbRecordedHeartRateZone$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Zones$PbRecordedHeartRateZone$Builder newBuilderForType(BuilderParent var1) {
      return new Zones$PbRecordedHeartRateZone$Builder(var1, (Zones$1)null);
   }

   public Zones$PbRecordedHeartRateZone$Builder toBuilder() {
      Zones$PbRecordedHeartRateZone$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Zones$PbRecordedHeartRateZone$Builder((Zones$1)null);
      } else {
         var1 = (new Zones$PbRecordedHeartRateZone$Builder((Zones$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getZoneLimits());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getInZone());
      }

      this.unknownFields.writeTo(var1);
   }
}
