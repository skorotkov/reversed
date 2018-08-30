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

public final class Zones$PbRecordedFatFitZones extends GeneratedMessageV3 implements Zones$PbRecordedFatFitZonesOrBuilder {
   private static final Zones$PbRecordedFatFitZones DEFAULT_INSTANCE = new Zones$PbRecordedFatFitZones();
   public static final int FATFIT_LIMIT_FIELD_NUMBER = 1;
   public static final int FAT_TIME_FIELD_NUMBER = 2;
   public static final int FIT_TIME_FIELD_NUMBER = 3;
   @Deprecated
   public static final Parser PARSER = new Zones$PbRecordedFatFitZones$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private Types$PbDuration fatTime_;
   private int fatfitLimit_;
   private Types$PbDuration fitTime_;
   private byte memoizedIsInitialized;

   private Zones$PbRecordedFatFitZones() {
      this.memoizedIsInitialized = (byte)-1;
      this.fatfitLimit_ = 0;
   }

   private Zones$PbRecordedFatFitZones(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Zones$PbRecordedFatFitZones(CodedInputStream var1, ExtensionRegistryLite var2, Zones$1 var3) {
      this(var1, var2);
   }

   private Zones$PbRecordedFatFitZones(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Zones$PbRecordedFatFitZones(Builder var1, Zones$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(Zones$PbRecordedFatFitZones var0, int var1) {
      var0.fatfitLimit_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Zones$PbRecordedFatFitZones var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbDuration a(Zones$PbRecordedFatFitZones var0, Types$PbDuration var1) {
      var0.fatTime_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(Zones$PbRecordedFatFitZones var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbDuration b(Zones$PbRecordedFatFitZones var0, Types$PbDuration var1) {
      var0.fitTime_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static Zones$PbRecordedFatFitZones getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Zones.e();
   }

   public static Zones$PbRecordedFatFitZones$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Zones$PbRecordedFatFitZones$Builder newBuilder(Zones$PbRecordedFatFitZones var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Zones$PbRecordedFatFitZones parseDelimitedFrom(InputStream var0) {
      return (Zones$PbRecordedFatFitZones)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Zones$PbRecordedFatFitZones parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Zones$PbRecordedFatFitZones)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Zones$PbRecordedFatFitZones parseFrom(ByteString var0) {
      return (Zones$PbRecordedFatFitZones)PARSER.parseFrom(var0);
   }

   public static Zones$PbRecordedFatFitZones parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Zones$PbRecordedFatFitZones)PARSER.parseFrom(var0, var1);
   }

   public static Zones$PbRecordedFatFitZones parseFrom(CodedInputStream var0) {
      return (Zones$PbRecordedFatFitZones)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Zones$PbRecordedFatFitZones parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Zones$PbRecordedFatFitZones)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Zones$PbRecordedFatFitZones parseFrom(InputStream var0) {
      return (Zones$PbRecordedFatFitZones)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Zones$PbRecordedFatFitZones parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Zones$PbRecordedFatFitZones)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Zones$PbRecordedFatFitZones parseFrom(byte[] var0) {
      return (Zones$PbRecordedFatFitZones)PARSER.parseFrom(var0);
   }

   public static Zones$PbRecordedFatFitZones parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Zones$PbRecordedFatFitZones)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Zones$PbRecordedFatFitZones)) {
            var2 = super.equals(var1);
         } else {
            Zones$PbRecordedFatFitZones var5 = (Zones$PbRecordedFatFitZones)var1;
            boolean var3;
            if (this.hasFatfitLimit() == var5.hasFatfitLimit()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasFatfitLimit()) {
               if (var3 && this.getFatfitLimit() == var5.getFatfitLimit()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasFatTime() == var5.hasFatTime()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasFatTime()) {
               if (var4 && this.getFatTime().equals(var5.getFatTime())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasFitTime() == var5.hasFitTime()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasFitTime()) {
               if (var4 && this.getFitTime().equals(var5.getFitTime())) {
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

   public Zones$PbRecordedFatFitZones getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Types$PbDuration getFatTime() {
      Types$PbDuration var1;
      if (this.fatTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.fatTime_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getFatTimeOrBuilder() {
      Types$PbDuration var1;
      if (this.fatTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.fatTime_;
      }

      return var1;
   }

   public int getFatfitLimit() {
      return this.fatfitLimit_;
   }

   public Types$PbDuration getFitTime() {
      Types$PbDuration var1;
      if (this.fitTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.fitTime_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getFitTimeOrBuilder() {
      Types$PbDuration var1;
      if (this.fitTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.fitTime_;
      }

      return var1;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeUInt32Size(1, this.fatfitLimit_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeMessageSize(2, this.getFatTime());
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeMessageSize(3, this.getFitTime());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasFatTime() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasFatfitLimit() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasFitTime() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
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
         if (this.hasFatfitLimit()) {
            var2 = (var1 * 37 + 1) * 53 + this.getFatfitLimit();
         }

         var1 = var2;
         if (this.hasFatTime()) {
            var1 = (var2 * 37 + 2) * 53 + this.getFatTime().hashCode();
         }

         var2 = var1;
         if (this.hasFitTime()) {
            var2 = (var1 * 37 + 3) * 53 + this.getFitTime().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Zones.f().ensureFieldAccessorsInitialized(Zones$PbRecordedFatFitZones.class, Zones$PbRecordedFatFitZones$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasFatfitLimit()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasFatTime()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasFitTime()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Zones$PbRecordedFatFitZones$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Zones$PbRecordedFatFitZones$Builder newBuilderForType(BuilderParent var1) {
      return new Zones$PbRecordedFatFitZones$Builder(var1, (Zones$1)null);
   }

   public Zones$PbRecordedFatFitZones$Builder toBuilder() {
      Zones$PbRecordedFatFitZones$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Zones$PbRecordedFatFitZones$Builder((Zones$1)null);
      } else {
         var1 = (new Zones$PbRecordedFatFitZones$Builder((Zones$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.fatfitLimit_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getFatTime());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getFitTime());
      }

      this.unknownFields.writeTo(var1);
   }
}
