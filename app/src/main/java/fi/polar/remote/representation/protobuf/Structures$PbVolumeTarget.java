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

public final class Structures$PbVolumeTarget extends GeneratedMessageV3 implements Structures$PbVolumeTargetOrBuilder {
   public static final int CALORIES_FIELD_NUMBER = 4;
   private static final Structures$PbVolumeTarget DEFAULT_INSTANCE = new Structures$PbVolumeTarget();
   public static final int DISTANCE_FIELD_NUMBER = 3;
   public static final int DURATION_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new Structures$PbVolumeTarget$1();
   public static final int TARGET_TYPE_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int calories_;
   private float distance_;
   private Types$PbDuration duration_;
   private byte memoizedIsInitialized;
   private int targetType_;

   private Structures$PbVolumeTarget() {
      this.memoizedIsInitialized = (byte)-1;
      this.targetType_ = 0;
      this.distance_ = 0.0F;
      this.calories_ = 0;
   }

   private Structures$PbVolumeTarget(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   Structures$PbVolumeTarget(CodedInputStream var1, ExtensionRegistryLite var2, Structures$1 var3) {
      this(var1, var2);
   }

   private Structures$PbVolumeTarget(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   Structures$PbVolumeTarget(Builder var1, Structures$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(Structures$PbVolumeTarget var0, float var1) {
      var0.distance_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(Structures$PbVolumeTarget var0, int var1) {
      var0.targetType_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(Structures$PbVolumeTarget var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbDuration a(Structures$PbVolumeTarget var0, Types$PbDuration var1) {
      var0.duration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(Structures$PbVolumeTarget var0, int var1) {
      var0.calories_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(Structures$PbVolumeTarget var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static Structures$PbVolumeTarget getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return Structures.a();
   }

   public static Structures$PbVolumeTarget$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Structures$PbVolumeTarget$Builder newBuilder(Structures$PbVolumeTarget var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static Structures$PbVolumeTarget parseDelimitedFrom(InputStream var0) {
      return (Structures$PbVolumeTarget)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Structures$PbVolumeTarget parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbVolumeTarget)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbVolumeTarget parseFrom(ByteString var0) {
      return (Structures$PbVolumeTarget)PARSER.parseFrom(var0);
   }

   public static Structures$PbVolumeTarget parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (Structures$PbVolumeTarget)PARSER.parseFrom(var0, var1);
   }

   public static Structures$PbVolumeTarget parseFrom(CodedInputStream var0) {
      return (Structures$PbVolumeTarget)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbVolumeTarget parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbVolumeTarget)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbVolumeTarget parseFrom(InputStream var0) {
      return (Structures$PbVolumeTarget)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Structures$PbVolumeTarget parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (Structures$PbVolumeTarget)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Structures$PbVolumeTarget parseFrom(byte[] var0) {
      return (Structures$PbVolumeTarget)PARSER.parseFrom(var0);
   }

   public static Structures$PbVolumeTarget parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (Structures$PbVolumeTarget)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof Structures$PbVolumeTarget)) {
            var2 = super.equals(var1);
         } else {
            Structures$PbVolumeTarget var5 = (Structures$PbVolumeTarget)var1;
            boolean var3;
            if (this.hasTargetType() == var5.hasTargetType()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasTargetType()) {
               if (var3 && this.targetType_ == var5.targetType_) {
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

            if (var3 && this.hasCalories() == var5.hasCalories()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasCalories()) {
               if (var4 && this.getCalories() == var5.getCalories()) {
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

   public int getCalories() {
      return this.calories_;
   }

   public Structures$PbVolumeTarget getDefaultInstanceForType() {
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
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeEnumSize(1, this.targetType_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeMessageSize(2, this.getDuration());
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeFloatSize(3, this.distance_);
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeUInt32Size(4, this.calories_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public Structures$PbVolumeTarget$PbVolymeTargetType getTargetType() {
      Structures$PbVolumeTarget$PbVolymeTargetType var1 = Structures$PbVolumeTarget$PbVolymeTargetType.valueOf(this.targetType_);
      Structures$PbVolumeTarget$PbVolymeTargetType var2 = var1;
      if (var1 == null) {
         var2 = Structures$PbVolumeTarget$PbVolymeTargetType.VOLUME_TARGET_TYPE_DURATION;
      }

      return var2;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasCalories() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
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

   public boolean hasTargetType() {
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
         if (this.hasTargetType()) {
            var2 = (var1 * 37 + 1) * 53 + this.targetType_;
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
         if (this.hasCalories()) {
            var1 = (var2 * 37 + 4) * 53 + this.getCalories();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return Structures.b().ensureFieldAccessorsInitialized(Structures$PbVolumeTarget.class, Structures$PbVolumeTarget$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasTargetType()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public Structures$PbVolumeTarget$Builder newBuilderForType() {
      return newBuilder();
   }

   protected Structures$PbVolumeTarget$Builder newBuilderForType(BuilderParent var1) {
      return new Structures$PbVolumeTarget$Builder(var1, (Structures$1)null);
   }

   public Structures$PbVolumeTarget$Builder toBuilder() {
      Structures$PbVolumeTarget$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new Structures$PbVolumeTarget$Builder((Structures$1)null);
      } else {
         var1 = (new Structures$PbVolumeTarget$Builder((Structures$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.targetType_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getDuration());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeFloat(3, this.distance_);
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeUInt32(4, this.calories_);
      }

      this.unknownFields.writeTo(var1);
   }
}
