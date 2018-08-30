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

public final class Types$PbAutoPause extends GeneratedMessageV3 implements Types$PbAutoPauseOrBuilder {
   private static final Types$PbAutoPause DEFAULT_INSTANCE = new Types$PbAutoPause();
   @Deprecated
   public static final Parser PARSER = new Types$PbAutoPause$1();
   public static final int SPEED_THRESHOLD_FIELD_NUMBER = 2;
   public static final int TRIGGER_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private float speedThreshold_;
   private int trigger_;

   private Types$PbAutoPause() {
      this.memoizedIsInitialized = (byte)-1;
      this.trigger_ = 0;
      this.speedThreshold_ = 0.0F;
   }

   private Types$PbAutoPause(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Types$PbAutoPause(CodedInputStream var1, ExtensionRegistryLite var2, Types$1 var3) {
      this(var1, var2);
   }

   private Types$PbAutoPause(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Types$PbAutoPause(Builder var1, Types$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(Types$PbAutoPause var0, float var1) {
      var0.speedThreshold_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(Types$PbAutoPause var0, int var1) {
      var0.trigger_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Types$PbAutoPause var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(Types$PbAutoPause var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static Types$PbAutoPause getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Types.E();
   }

   public static Types$PbAutoPause$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Types$PbAutoPause$Builder newBuilder(Types$PbAutoPause var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Types$PbAutoPause parseDelimitedFrom(InputStream var0) {
      return (Types$PbAutoPause)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Types$PbAutoPause parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbAutoPause)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Types$PbAutoPause parseFrom(ByteString var0) {
      return (Types$PbAutoPause)PARSER.parseFrom(var0);
   }

   public static Types$PbAutoPause parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Types$PbAutoPause)PARSER.parseFrom(var0, var1);
   }

   public static Types$PbAutoPause parseFrom(CodedInputStream var0) {
      return (Types$PbAutoPause)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbAutoPause parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbAutoPause)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbAutoPause parseFrom(InputStream var0) {
      return (Types$PbAutoPause)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Types$PbAutoPause parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Types$PbAutoPause)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Types$PbAutoPause parseFrom(byte[] var0) {
      return (Types$PbAutoPause)PARSER.parseFrom(var0);
   }

   public static Types$PbAutoPause parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Types$PbAutoPause)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Types$PbAutoPause)) {
            var2 = super.equals(var1);
         } else {
            Types$PbAutoPause var5 = (Types$PbAutoPause)var1;
            boolean var3;
            if (this.hasTrigger() == var5.hasTrigger()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasTrigger()) {
               if (var3 && this.trigger_ == var5.trigger_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSpeedThreshold() == var5.hasSpeedThreshold()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSpeedThreshold()) {
               if (var4 && Float.floatToIntBits(this.getSpeedThreshold()) == Float.floatToIntBits(var5.getSpeedThreshold())) {
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

   public Types$PbAutoPause getDefaultInstanceForType() {
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
            var1 = 0 + CodedOutputStream.computeEnumSize(1, this.trigger_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeFloatSize(2, this.speedThreshold_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public float getSpeedThreshold() {
      return this.speedThreshold_;
   }

   public Types$PbAutoPause$PbAutoPauseTrigger getTrigger() {
      Types$PbAutoPause$PbAutoPauseTrigger var1 = Types$PbAutoPause$PbAutoPauseTrigger.valueOf(this.trigger_);
      Types$PbAutoPause$PbAutoPauseTrigger var2 = var1;
      if (var1 == null) {
         var2 = Types$PbAutoPause$PbAutoPauseTrigger.AUTO_PAUSE_OFF;
      }

      return var2;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasSpeedThreshold() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasTrigger() {
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
         if (this.hasTrigger()) {
            var1 = (var2 * 37 + 1) * 53 + this.trigger_;
         }

         var2 = var1;
         if (this.hasSpeedThreshold()) {
            var2 = (var1 * 37 + 2) * 53 + Float.floatToIntBits(this.getSpeedThreshold());
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Types.F().ensureFieldAccessorsInitialized(Types$PbAutoPause.class, Types$PbAutoPause$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasTrigger()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Types$PbAutoPause$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Types$PbAutoPause$Builder newBuilderForType(BuilderParent var1) {
      return new Types$PbAutoPause$Builder(var1, (Types$1)null);
   }

   public Types$PbAutoPause$Builder toBuilder() {
      Types$PbAutoPause$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Types$PbAutoPause$Builder((Types$1)null);
      } else {
         var1 = (new Types$PbAutoPause$Builder((Types$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.trigger_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeFloat(2, this.speedThreshold_);
      }

      this.unknownFields.writeTo(var1);
   }
}
