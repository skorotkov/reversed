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

public final class UserDeviceSettings$PbUserDeviceResearchSettings extends GeneratedMessageV3 implements UserDeviceSettings$PbUserDeviceResearchSettingsOrBuilder {
   public static final int ACCELEROMETER_RAW_DATA_ENABLE_FIELD_NUMBER = 1;
   private static final UserDeviceSettings$PbUserDeviceResearchSettings DEFAULT_INSTANCE = new UserDeviceSettings$PbUserDeviceResearchSettings();
   public static final int GPS_DATA_ENABLE_FIELD_NUMBER = 5;
   public static final int GYROSCOPE_RAW_DATA_ENABLE_FIELD_NUMBER = 2;
   public static final int LINEAR_ACCELERATION_DATA_ENABLE_FIELD_NUMBER = 4;
   public static final int MAGNETOMETER_RAW_DATA_ENABLE_FIELD_NUMBER = 3;
   @Deprecated
   public static final Parser PARSER = new UserDeviceSettings$PbUserDeviceResearchSettings$1();
   private static final long serialVersionUID = 0L;
   private boolean accelerometerRawDataEnable_;
   private int bitField0_;
   private boolean gpsDataEnable_;
   private boolean gyroscopeRawDataEnable_;
   private boolean linearAccelerationDataEnable_;
   private boolean magnetometerRawDataEnable_;
   private byte memoizedIsInitialized;

   private UserDeviceSettings$PbUserDeviceResearchSettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.accelerometerRawDataEnable_ = false;
      this.gyroscopeRawDataEnable_ = false;
      this.magnetometerRawDataEnable_ = false;
      this.linearAccelerationDataEnable_ = false;
      this.gpsDataEnable_ = false;
   }

   private UserDeviceSettings$PbUserDeviceResearchSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceResearchSettings(CodedInputStream var1, ExtensionRegistryLite var2, UserDeviceSettings$1 var3) {
      this(var1, var2);
   }

   private UserDeviceSettings$PbUserDeviceResearchSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceResearchSettings(Builder var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(UserDeviceSettings$PbUserDeviceResearchSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(UserDeviceSettings$PbUserDeviceResearchSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean a(UserDeviceSettings$PbUserDeviceResearchSettings var0, boolean var1) {
      var0.accelerometerRawDataEnable_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static boolean b(UserDeviceSettings$PbUserDeviceResearchSettings var0, boolean var1) {
      var0.gyroscopeRawDataEnable_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean c(UserDeviceSettings$PbUserDeviceResearchSettings var0, boolean var1) {
      var0.magnetometerRawDataEnable_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean d(UserDeviceSettings$PbUserDeviceResearchSettings var0, boolean var1) {
      var0.linearAccelerationDataEnable_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean e(UserDeviceSettings$PbUserDeviceResearchSettings var0, boolean var1) {
      var0.gpsDataEnable_ = var1;
      return var1;
   }

   public static UserDeviceSettings$PbUserDeviceResearchSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.o();
   }

   public static UserDeviceSettings$PbUserDeviceResearchSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UserDeviceSettings$PbUserDeviceResearchSettings$Builder newBuilder(UserDeviceSettings$PbUserDeviceResearchSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceResearchSettings parseDelimitedFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserDeviceResearchSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceResearchSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceResearchSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceResearchSettings parseFrom(ByteString var0) {
      return (UserDeviceSettings$PbUserDeviceResearchSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceResearchSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceResearchSettings)PARSER.parseFrom(var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceResearchSettings parseFrom(CodedInputStream var0) {
      return (UserDeviceSettings$PbUserDeviceResearchSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceResearchSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceResearchSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceResearchSettings parseFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserDeviceResearchSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceResearchSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceResearchSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceResearchSettings parseFrom(byte[] var0) {
      return (UserDeviceSettings$PbUserDeviceResearchSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceResearchSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceResearchSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof UserDeviceSettings$PbUserDeviceResearchSettings)) {
            var2 = super.equals(var1);
         } else {
            UserDeviceSettings$PbUserDeviceResearchSettings var5 = (UserDeviceSettings$PbUserDeviceResearchSettings)var1;
            boolean var3;
            if (this.hasAccelerometerRawDataEnable() == var5.hasAccelerometerRawDataEnable()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasAccelerometerRawDataEnable()) {
               if (var3 && this.getAccelerometerRawDataEnable() == var5.getAccelerometerRawDataEnable()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasGyroscopeRawDataEnable() == var5.hasGyroscopeRawDataEnable()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasGyroscopeRawDataEnable()) {
               if (var3 && this.getGyroscopeRawDataEnable() == var5.getGyroscopeRawDataEnable()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasMagnetometerRawDataEnable() == var5.hasMagnetometerRawDataEnable()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasMagnetometerRawDataEnable()) {
               if (var3 && this.getMagnetometerRawDataEnable() == var5.getMagnetometerRawDataEnable()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasLinearAccelerationDataEnable() == var5.hasLinearAccelerationDataEnable()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasLinearAccelerationDataEnable()) {
               if (var3 && this.getLinearAccelerationDataEnable() == var5.getLinearAccelerationDataEnable()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasGpsDataEnable() == var5.hasGpsDataEnable()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasGpsDataEnable()) {
               if (var3 && this.getGpsDataEnable() == var5.getGpsDataEnable()) {
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

   public boolean getAccelerometerRawDataEnable() {
      return this.accelerometerRawDataEnable_;
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public boolean getGpsDataEnable() {
      return this.gpsDataEnable_;
   }

   public boolean getGyroscopeRawDataEnable() {
      return this.gyroscopeRawDataEnable_;
   }

   public boolean getLinearAccelerationDataEnable() {
      return this.linearAccelerationDataEnable_;
   }

   public boolean getMagnetometerRawDataEnable() {
      return this.magnetometerRawDataEnable_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeBoolSize(1, this.accelerometerRawDataEnable_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeBoolSize(2, this.gyroscopeRawDataEnable_);
         }

         var1 = var2;
         if ((this.bitField0_ & 4) == 4) {
            var1 = var2 + CodedOutputStream.computeBoolSize(3, this.magnetometerRawDataEnable_);
         }

         var2 = var1;
         if ((this.bitField0_ & 8) == 8) {
            var2 = var1 + CodedOutputStream.computeBoolSize(4, this.linearAccelerationDataEnable_);
         }

         var1 = var2;
         if ((this.bitField0_ & 16) == 16) {
            var1 = var2 + CodedOutputStream.computeBoolSize(5, this.gpsDataEnable_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasAccelerometerRawDataEnable() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasGpsDataEnable() {
      boolean var1;
      if ((this.bitField0_ & 16) == 16) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasGyroscopeRawDataEnable() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasLinearAccelerationDataEnable() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMagnetometerRawDataEnable() {
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
         if (this.hasAccelerometerRawDataEnable()) {
            var1 = (var2 * 37 + 1) * 53 + Internal.hashBoolean(this.getAccelerometerRawDataEnable());
         }

         var2 = var1;
         if (this.hasGyroscopeRawDataEnable()) {
            var2 = (var1 * 37 + 2) * 53 + Internal.hashBoolean(this.getGyroscopeRawDataEnable());
         }

         var1 = var2;
         if (this.hasMagnetometerRawDataEnable()) {
            var1 = (var2 * 37 + 3) * 53 + Internal.hashBoolean(this.getMagnetometerRawDataEnable());
         }

         var2 = var1;
         if (this.hasLinearAccelerationDataEnable()) {
            var2 = (var1 * 37 + 4) * 53 + Internal.hashBoolean(this.getLinearAccelerationDataEnable());
         }

         var1 = var2;
         if (this.hasGpsDataEnable()) {
            var1 = (var2 * 37 + 5) * 53 + Internal.hashBoolean(this.getGpsDataEnable());
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.p().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserDeviceResearchSettings.class, UserDeviceSettings$PbUserDeviceResearchSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected UserDeviceSettings$PbUserDeviceResearchSettings$Builder newBuilderForType(BuilderParent var1) {
      return new UserDeviceSettings$PbUserDeviceResearchSettings$Builder(var1, (UserDeviceSettings$1)null);
   }

   public UserDeviceSettings$PbUserDeviceResearchSettings$Builder toBuilder() {
      UserDeviceSettings$PbUserDeviceResearchSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new UserDeviceSettings$PbUserDeviceResearchSettings$Builder((UserDeviceSettings$1)null);
      } else {
         var1 = (new UserDeviceSettings$PbUserDeviceResearchSettings$Builder((UserDeviceSettings$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeBool(1, this.accelerometerRawDataEnable_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeBool(2, this.gyroscopeRawDataEnable_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeBool(3, this.magnetometerRawDataEnable_);
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeBool(4, this.linearAccelerationDataEnable_);
      }

      if ((this.bitField0_ & 16) == 16) {
         var1.writeBool(5, this.gpsDataEnable_);
      }

      this.unknownFields.writeTo(var1);
   }
}
