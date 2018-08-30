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

public final class ExerciseSensors$PbExerciseSensor extends GeneratedMessageV3 implements ExerciseSensors$PbExerciseSensorOrBuilder {
   private static final ExerciseSensors$PbExerciseSensor DEFAULT_INSTANCE = new ExerciseSensors$PbExerciseSensor();
   public static final int DEVICE_ID_FIELD_NUMBER = 2;
   public static final int DEVICE_NAME_FIELD_NUMBER = 3;
   public static final int MAC_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new ExerciseSensors$PbExerciseSensor$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private Structures$PbDeviceId deviceId_;
   private Structures$PbBleDeviceName deviceName_;
   private Structures$PbBleMac mac_;
   private byte memoizedIsInitialized;

   private ExerciseSensors$PbExerciseSensor() {
      this.memoizedIsInitialized = (byte)-1;
   }

   private ExerciseSensors$PbExerciseSensor(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   ExerciseSensors$PbExerciseSensor(CodedInputStream var1, ExtensionRegistryLite var2, ExerciseSensors$1 var3) {
      this(var1, var2);
   }

   private ExerciseSensors$PbExerciseSensor(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   ExerciseSensors$PbExerciseSensor(Builder var1, ExerciseSensors$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(ExerciseSensors$PbExerciseSensor var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(ExerciseSensors$PbExerciseSensor var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Structures$PbBleDeviceName a(ExerciseSensors$PbExerciseSensor var0, Structures$PbBleDeviceName var1) {
      var0.deviceName_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbBleMac a(ExerciseSensors$PbExerciseSensor var0, Structures$PbBleMac var1) {
      var0.mac_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Structures$PbDeviceId a(ExerciseSensors$PbExerciseSensor var0, Structures$PbDeviceId var1) {
      var0.deviceId_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static ExerciseSensors$PbExerciseSensor getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return ExerciseSensors.a();
   }

   public static ExerciseSensors$PbExerciseSensor$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ExerciseSensors$PbExerciseSensor$Builder newBuilder(ExerciseSensors$PbExerciseSensor var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static ExerciseSensors$PbExerciseSensor parseDelimitedFrom(InputStream var0) {
      return (ExerciseSensors$PbExerciseSensor)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ExerciseSensors$PbExerciseSensor parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseSensors$PbExerciseSensor)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ExerciseSensors$PbExerciseSensor parseFrom(ByteString var0) {
      return (ExerciseSensors$PbExerciseSensor)PARSER.parseFrom(var0);
   }

   public static ExerciseSensors$PbExerciseSensor parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (ExerciseSensors$PbExerciseSensor)PARSER.parseFrom(var0, var1);
   }

   public static ExerciseSensors$PbExerciseSensor parseFrom(CodedInputStream var0) {
      return (ExerciseSensors$PbExerciseSensor)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseSensors$PbExerciseSensor parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseSensors$PbExerciseSensor)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseSensors$PbExerciseSensor parseFrom(InputStream var0) {
      return (ExerciseSensors$PbExerciseSensor)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ExerciseSensors$PbExerciseSensor parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (ExerciseSensors$PbExerciseSensor)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ExerciseSensors$PbExerciseSensor parseFrom(byte[] var0) {
      return (ExerciseSensors$PbExerciseSensor)PARSER.parseFrom(var0);
   }

   public static ExerciseSensors$PbExerciseSensor parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (ExerciseSensors$PbExerciseSensor)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof ExerciseSensors$PbExerciseSensor)) {
            var2 = super.equals(var1);
         } else {
            ExerciseSensors$PbExerciseSensor var5 = (ExerciseSensors$PbExerciseSensor)var1;
            boolean var3;
            if (this.hasMac() == var5.hasMac()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasMac()) {
               if (var3 && this.getMac().equals(var5.getMac())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasDeviceId() == var5.hasDeviceId()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasDeviceId()) {
               if (var3 && this.getDeviceId().equals(var5.getDeviceId())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasDeviceName() == var5.hasDeviceName()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasDeviceName()) {
               if (var3 && this.getDeviceName().equals(var5.getDeviceName())) {
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

   public ExerciseSensors$PbExerciseSensor getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Structures$PbDeviceId getDeviceId() {
      Structures$PbDeviceId var1;
      if (this.deviceId_ == null) {
         var1 = Structures$PbDeviceId.getDefaultInstance();
      } else {
         var1 = this.deviceId_;
      }

      return var1;
   }

   public Structures$PbDeviceIdOrBuilder getDeviceIdOrBuilder() {
      Structures$PbDeviceId var1;
      if (this.deviceId_ == null) {
         var1 = Structures$PbDeviceId.getDefaultInstance();
      } else {
         var1 = this.deviceId_;
      }

      return var1;
   }

   public Structures$PbBleDeviceName getDeviceName() {
      Structures$PbBleDeviceName var1;
      if (this.deviceName_ == null) {
         var1 = Structures$PbBleDeviceName.getDefaultInstance();
      } else {
         var1 = this.deviceName_;
      }

      return var1;
   }

   public Structures$PbBleDeviceNameOrBuilder getDeviceNameOrBuilder() {
      Structures$PbBleDeviceName var1;
      if (this.deviceName_ == null) {
         var1 = Structures$PbBleDeviceName.getDefaultInstance();
      } else {
         var1 = this.deviceName_;
      }

      return var1;
   }

   public Structures$PbBleMac getMac() {
      Structures$PbBleMac var1;
      if (this.mac_ == null) {
         var1 = Structures$PbBleMac.getDefaultInstance();
      } else {
         var1 = this.mac_;
      }

      return var1;
   }

   public Structures$PbBleMacOrBuilder getMacOrBuilder() {
      Structures$PbBleMac var1;
      if (this.mac_ == null) {
         var1 = Structures$PbBleMac.getDefaultInstance();
      } else {
         var1 = this.mac_;
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
            var2 = 0 + CodedOutputStream.computeMessageSize(1, this.getMac());
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeMessageSize(2, this.getDeviceId());
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeMessageSize(3, this.getDeviceName());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasDeviceId() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDeviceName() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMac() {
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
         if (this.hasMac()) {
            var2 = (var1 * 37 + 1) * 53 + this.getMac().hashCode();
         }

         var1 = var2;
         if (this.hasDeviceId()) {
            var1 = (var2 * 37 + 2) * 53 + this.getDeviceId().hashCode();
         }

         var2 = var1;
         if (this.hasDeviceName()) {
            var2 = (var1 * 37 + 3) * 53 + this.getDeviceName().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return ExerciseSensors.b().ensureFieldAccessorsInitialized(ExerciseSensors$PbExerciseSensor.class, ExerciseSensors$PbExerciseSensor$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasMac()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getMac().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasDeviceId() && !this.getDeviceId().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasDeviceName() && !this.getDeviceName().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public ExerciseSensors$PbExerciseSensor$Builder newBuilderForType() {
      return newBuilder();
   }

   protected ExerciseSensors$PbExerciseSensor$Builder newBuilderForType(BuilderParent var1) {
      return new ExerciseSensors$PbExerciseSensor$Builder(var1, (ExerciseSensors$1)null);
   }

   public ExerciseSensors$PbExerciseSensor$Builder toBuilder() {
      ExerciseSensors$PbExerciseSensor$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new ExerciseSensors$PbExerciseSensor$Builder((ExerciseSensors$1)null);
      } else {
         var1 = (new ExerciseSensors$PbExerciseSensor$Builder((ExerciseSensors$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getMac());
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getDeviceId());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getDeviceName());
      }

      this.unknownFields.writeTo(var1);
   }
}
