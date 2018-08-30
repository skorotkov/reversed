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

public final class Types$PbAutoLapSettings extends GeneratedMessageV3 implements Types$PbAutoLapSettingsOrBuilder {
   public static final int AUTOMATIC_LAP_DISTANCE_FIELD_NUMBER = 2;
   public static final int AUTOMATIC_LAP_DURATION_FIELD_NUMBER = 3;
   public static final int AUTOMATIC_LAP_FIELD_NUMBER = 1;
   private static final Types$PbAutoLapSettings DEFAULT_INSTANCE = new Types$PbAutoLapSettings();
   @Deprecated
   public static final Parser PARSER = new Types$PbAutoLapSettings$1();
   private static final long serialVersionUID = 0L;
   private float automaticLapDistance_;
   private Types$PbDuration automaticLapDuration_;
   private int automaticLap_;
   private int bitField0_;
   private byte memoizedIsInitialized;

   private Types$PbAutoLapSettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.automaticLap_ = 1;
      this.automaticLapDistance_ = 0.0F;
   }

   private Types$PbAutoLapSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Types$PbAutoLapSettings(CodedInputStream var1, ExtensionRegistryLite var2, Types$1 var3) {
      this(var1, var2);
   }

   private Types$PbAutoLapSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Types$PbAutoLapSettings(Builder var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(Types$PbAutoLapSettings var0, float var1) {
      var0.automaticLapDistance_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(Types$PbAutoLapSettings var0, int var1) {
      var0.automaticLap_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Types$PbAutoLapSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbDuration a(Types$PbAutoLapSettings var0, Types$PbDuration var1) {
      var0.automaticLapDuration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(Types$PbAutoLapSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static Types$PbAutoLapSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Types.G();
   }

   public static Types$PbAutoLapSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Types$PbAutoLapSettings$Builder newBuilder(Types$PbAutoLapSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Types$PbAutoLapSettings parseDelimitedFrom(InputStream var0) {
      return (Types$PbAutoLapSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Types$PbAutoLapSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbAutoLapSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Types$PbAutoLapSettings parseFrom(ByteString var0) {
      return (Types$PbAutoLapSettings)PARSER.parseFrom(var0);
   }

   public static Types$PbAutoLapSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Types$PbAutoLapSettings)PARSER.parseFrom(var0, var1);
   }

   public static Types$PbAutoLapSettings parseFrom(CodedInputStream var0) {
      return (Types$PbAutoLapSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbAutoLapSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbAutoLapSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbAutoLapSettings parseFrom(InputStream var0) {
      return (Types$PbAutoLapSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbAutoLapSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbAutoLapSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbAutoLapSettings parseFrom(byte[] var0) {
      return (Types$PbAutoLapSettings)PARSER.parseFrom(var0);
   }

   public static Types$PbAutoLapSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Types$PbAutoLapSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Types$PbAutoLapSettings)) {
            var2 = super.equals(var1);
         } else {
            Types$PbAutoLapSettings var5 = (Types$PbAutoLapSettings)var1;
            boolean var3;
            if (this.hasAutomaticLap() == var5.hasAutomaticLap()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasAutomaticLap()) {
               if (var3 && this.automaticLap_ == var5.automaticLap_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAutomaticLapDistance() == var5.hasAutomaticLapDistance()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAutomaticLapDistance()) {
               if (var4 && Float.floatToIntBits(this.getAutomaticLapDistance()) == Float.floatToIntBits(var5.getAutomaticLapDistance())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasAutomaticLapDuration() == var5.hasAutomaticLapDuration()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasAutomaticLapDuration()) {
               if (var4 && this.getAutomaticLapDuration().equals(var5.getAutomaticLapDuration())) {
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

   public Types$PbAutoLapSettings$PbAutomaticLap getAutomaticLap() {
      Types$PbAutoLapSettings$PbAutomaticLap var1 = Types$PbAutoLapSettings$PbAutomaticLap.valueOf(this.automaticLap_);
      Types$PbAutoLapSettings$PbAutomaticLap var2 = var1;
      if (var1 == null) {
         var2 = Types$PbAutoLapSettings$PbAutomaticLap.AUTOMATIC_LAP_OFF;
      }

      return var2;
   }

   public float getAutomaticLapDistance() {
      return this.automaticLapDistance_;
   }

   public Types$PbDuration getAutomaticLapDuration() {
      Types$PbDuration var1;
      if (this.automaticLapDuration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.automaticLapDuration_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getAutomaticLapDurationOrBuilder() {
      Types$PbDuration var1;
      if (this.automaticLapDuration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.automaticLapDuration_;
      }

      return var1;
   }

   public Types$PbAutoLapSettings getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeEnumSize(1, this.automaticLap_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeFloatSize(2, this.automaticLapDistance_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeMessageSize(3, this.getAutomaticLapDuration());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasAutomaticLap() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAutomaticLapDistance() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAutomaticLapDuration() {
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
         if (this.hasAutomaticLap()) {
            var2 = (var1 * 37 + 1) * 53 + this.automaticLap_;
         }

         var1 = var2;
         if (this.hasAutomaticLapDistance()) {
            var1 = (var2 * 37 + 2) * 53 + Float.floatToIntBits(this.getAutomaticLapDistance());
         }

         var2 = var1;
         if (this.hasAutomaticLapDuration()) {
            var2 = (var1 * 37 + 3) * 53 + this.getAutomaticLapDuration().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.H().ensureFieldAccessorsInitialized(Types$PbAutoLapSettings.class, Types$PbAutoLapSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasAutomaticLap()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Types$PbAutoLapSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Types$PbAutoLapSettings$Builder newBuilderForType(BuilderParent var1) {
      return new Types$PbAutoLapSettings$Builder(var1, (Types$1)null);
   }

   public Types$PbAutoLapSettings$Builder toBuilder() {
      Types$PbAutoLapSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Types$PbAutoLapSettings$Builder((Types$1)null);
      } else {
         var1 = (new Types$PbAutoLapSettings$Builder((Types$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.automaticLap_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeFloat(2, this.automaticLapDistance_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getAutomaticLapDuration());
      }

      this.unknownFields.writeTo(var1);
   }
}
