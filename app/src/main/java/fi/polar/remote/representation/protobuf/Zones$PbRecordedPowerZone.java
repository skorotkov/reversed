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

public final class Zones$PbRecordedPowerZone extends GeneratedMessageV3 implements Zones$PbRecordedPowerZoneOrBuilder {
   private static final Zones$PbRecordedPowerZone DEFAULT_INSTANCE = new Zones$PbRecordedPowerZone();
   public static final int IN_ZONE_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new Zones$PbRecordedPowerZone$1();
   public static final int ZONE_LIMITS_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private Types$PbDuration inZone_;
   private byte memoizedIsInitialized;
   private Structures$PbPowerZone zoneLimits_;

   private Zones$PbRecordedPowerZone() {
      this.memoizedIsInitialized = (byte)-1;
   }

   private Zones$PbRecordedPowerZone(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Zones$PbRecordedPowerZone(CodedInputStream var1, ExtensionRegistryLite var2, Zones$1 var3) {
      this(var1, var2);
   }

   private Zones$PbRecordedPowerZone(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Zones$PbRecordedPowerZone(Builder var1, Zones$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Zones$PbRecordedPowerZone var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Zones$PbRecordedPowerZone var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Structures$PbPowerZone a(Zones$PbRecordedPowerZone var0, Structures$PbPowerZone var1) {
      var0.zoneLimits_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration a(Zones$PbRecordedPowerZone var0, Types$PbDuration var1) {
      var0.inZone_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static Zones$PbRecordedPowerZone getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Zones.c();
   }

   public static Zones$PbRecordedPowerZone$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Zones$PbRecordedPowerZone$Builder newBuilder(Zones$PbRecordedPowerZone var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Zones$PbRecordedPowerZone parseDelimitedFrom(InputStream var0) {
      return (Zones$PbRecordedPowerZone)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Zones$PbRecordedPowerZone parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Zones$PbRecordedPowerZone)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Zones$PbRecordedPowerZone parseFrom(ByteString var0) {
      return (Zones$PbRecordedPowerZone)PARSER.parseFrom(var0);
   }

   public static Zones$PbRecordedPowerZone parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Zones$PbRecordedPowerZone)PARSER.parseFrom(var0, var1);
   }

   public static Zones$PbRecordedPowerZone parseFrom(CodedInputStream var0) {
      return (Zones$PbRecordedPowerZone)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Zones$PbRecordedPowerZone parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Zones$PbRecordedPowerZone)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Zones$PbRecordedPowerZone parseFrom(InputStream var0) {
      return (Zones$PbRecordedPowerZone)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Zones$PbRecordedPowerZone parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Zones$PbRecordedPowerZone)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Zones$PbRecordedPowerZone parseFrom(byte[] var0) {
      return (Zones$PbRecordedPowerZone)PARSER.parseFrom(var0);
   }

   public static Zones$PbRecordedPowerZone parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Zones$PbRecordedPowerZone)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Zones$PbRecordedPowerZone)) {
            var2 = super.equals(var1);
         } else {
            Zones$PbRecordedPowerZone var5 = (Zones$PbRecordedPowerZone)var1;
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
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasInZone()) {
               if (var3 && this.getInZone().equals(var5.getInZone())) {
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

   public Zones$PbRecordedPowerZone getDefaultInstanceForType() {
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

   public Structures$PbPowerZone getZoneLimits() {
      Structures$PbPowerZone var1;
      if (this.zoneLimits_ == null) {
         var1 = Structures$PbPowerZone.getDefaultInstance();
      } else {
         var1 = this.zoneLimits_;
      }

      return var1;
   }

   public Structures$PbPowerZoneOrBuilder getZoneLimitsOrBuilder() {
      Structures$PbPowerZone var1;
      if (this.zoneLimits_ == null) {
         var1 = Structures$PbPowerZone.getDefaultInstance();
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
      return Zones.d().ensureFieldAccessorsInitialized(Zones$PbRecordedPowerZone.class, Zones$PbRecordedPowerZone$Builder.class);
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

   public Zones$PbRecordedPowerZone$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Zones$PbRecordedPowerZone$Builder newBuilderForType(BuilderParent var1) {
      return new Zones$PbRecordedPowerZone$Builder(var1, (Zones$1)null);
   }

   public Zones$PbRecordedPowerZone$Builder toBuilder() {
      Zones$PbRecordedPowerZone$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Zones$PbRecordedPowerZone$Builder((Zones$1)null);
      } else {
         var1 = (new Zones$PbRecordedPowerZone$Builder((Zones$1)null)).mergeFrom(this);
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
