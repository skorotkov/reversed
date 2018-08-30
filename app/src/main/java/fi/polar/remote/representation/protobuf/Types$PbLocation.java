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

public final class Types$PbLocation extends GeneratedMessageV3 implements Types$PbLocationOrBuilder {
   private static final Types$PbLocation DEFAULT_INSTANCE = new Types$PbLocation();
   public static final int FIX_FIELD_NUMBER = 4;
   public static final int LATITUDE_FIELD_NUMBER = 1;
   public static final int LONGITUDE_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new Types$PbLocation$1();
   public static final int SATELLITES_FIELD_NUMBER = 5;
   public static final int TIMESTAMP_FIELD_NUMBER = 3;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int fix_;
   private double latitude_;
   private double longitude_;
   private byte memoizedIsInitialized;
   private int satellites_;
   private Types$PbSystemDateTime timestamp_;

   private Types$PbLocation() {
      this.memoizedIsInitialized = (byte)-1;
      this.latitude_ = 0.0D;
      this.longitude_ = 0.0D;
      this.fix_ = 0;
      this.satellites_ = 0;
   }

   private Types$PbLocation(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Types$PbLocation(CodedInputStream var1, ExtensionRegistryLite var2, Types$1 var3) {
      this(var1, var2);
   }

   private Types$PbLocation(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Types$PbLocation(Builder var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static double a(Types$PbLocation var0, double var1) {
      var0.latitude_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(Types$PbLocation var0, int var1) {
      var0.fix_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Types$PbLocation var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime a(Types$PbLocation var0, Types$PbSystemDateTime var1) {
      var0.timestamp_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static double b(Types$PbLocation var0, double var1) {
      var0.longitude_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(Types$PbLocation var0, int var1) {
      var0.satellites_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(Types$PbLocation var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static Types$PbLocation getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Types.m();
   }

   public static Types$PbLocation$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Types$PbLocation$Builder newBuilder(Types$PbLocation var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Types$PbLocation parseDelimitedFrom(InputStream var0) {
      return (Types$PbLocation)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Types$PbLocation parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbLocation)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Types$PbLocation parseFrom(ByteString var0) {
      return (Types$PbLocation)PARSER.parseFrom(var0);
   }

   public static Types$PbLocation parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Types$PbLocation)PARSER.parseFrom(var0, var1);
   }

   public static Types$PbLocation parseFrom(CodedInputStream var0) {
      return (Types$PbLocation)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbLocation parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbLocation)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbLocation parseFrom(InputStream var0) {
      return (Types$PbLocation)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbLocation parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbLocation)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbLocation parseFrom(byte[] var0) {
      return (Types$PbLocation)PARSER.parseFrom(var0);
   }

   public static Types$PbLocation parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Types$PbLocation)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Types$PbLocation)) {
            var2 = super.equals(var1);
         } else {
            Types$PbLocation var5 = (Types$PbLocation)var1;
            boolean var3;
            if (this.hasLatitude() == var5.hasLatitude()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasLatitude()) {
               if (var3 && Double.doubleToLongBits(this.getLatitude()) == Double.doubleToLongBits(var5.getLatitude())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasLongitude() == var5.hasLongitude()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasLongitude()) {
               if (var3 && Double.doubleToLongBits(this.getLongitude()) == Double.doubleToLongBits(var5.getLongitude())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasTimestamp() == var5.hasTimestamp()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasTimestamp()) {
               if (var3 && this.getTimestamp().equals(var5.getTimestamp())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasFix() == var5.hasFix()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasFix()) {
               if (var3 && this.fix_ == var5.fix_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSatellites() == var5.hasSatellites()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSatellites()) {
               if (var3 && this.getSatellites() == var5.getSatellites()) {
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

   public Types$PbLocation getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Types$PbLocation$Fix getFix() {
      Types$PbLocation$Fix var1 = Types$PbLocation$Fix.valueOf(this.fix_);
      Types$PbLocation$Fix var2 = var1;
      if (var1 == null) {
         var2 = Types$PbLocation$Fix.FIX_NONE;
      }

      return var2;
   }

   public double getLatitude() {
      return this.latitude_;
   }

   public double getLongitude() {
      return this.longitude_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSatellites() {
      return this.satellites_;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeDoubleSize(1, this.latitude_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeDoubleSize(2, this.longitude_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeMessageSize(3, this.getTimestamp());
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeEnumSize(4, this.fix_);
         }

         var2 = var1;
         if ((this.bitField0_ & 16) == 16) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(5, this.satellites_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public Types$PbSystemDateTime getTimestamp() {
      Types$PbSystemDateTime var1;
      if (this.timestamp_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.timestamp_;
      }

      return var1;
   }

   public Types$PbSystemDateTimeOrBuilder getTimestampOrBuilder() {
      Types$PbSystemDateTime var1;
      if (this.timestamp_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.timestamp_;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasFix() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLatitude() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLongitude() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSatellites() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTimestamp() {
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
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.hasLatitude()) {
            var1 = (var2 * 37 + 1) * 53 + Internal.hashLong(Double.doubleToLongBits(this.getLatitude()));
         }

         var2 = var1;
         if (this.hasLongitude()) {
            var2 = (var1 * 37 + 2) * 53 + Internal.hashLong(Double.doubleToLongBits(this.getLongitude()));
         }

         var1 = var2;
         if (this.hasTimestamp()) {
            var1 = (var2 * 37 + 3) * 53 + this.getTimestamp().hashCode();
         }

         var2 = var1;
         if (this.hasFix()) {
            var2 = (var1 * 37 + 4) * 53 + this.fix_;
         }

         var1 = var2;
         if (this.hasSatellites()) {
            var1 = (var2 * 37 + 5) * 53 + this.getSatellites();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.n().ensureFieldAccessorsInitialized(Types$PbLocation.class, Types$PbLocation$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasLatitude()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasLongitude()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasTimestamp() && !this.getTimestamp().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Types$PbLocation$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Types$PbLocation$Builder newBuilderForType(BuilderParent var1) {
      return new Types$PbLocation$Builder(var1, (Types$1)null);
   }

   public Types$PbLocation$Builder toBuilder() {
      Types$PbLocation$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Types$PbLocation$Builder((Types$1)null);
      } else {
         var1 = (new Types$PbLocation$Builder((Types$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeDouble(1, this.latitude_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeDouble(2, this.longitude_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getTimestamp());
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeEnum(4, this.fix_);
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeUInt32(5, this.satellites_);
      }

      this.unknownFields.writeTo(var1);
   }
}
