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

public final class UserDeviceSettings$PbUserMapSettings extends GeneratedMessageV3 implements UserDeviceSettings$PbUserMapSettingsOrBuilder {
   public static final int ALTITUDE_DATA_ENABLED_FIELD_NUMBER = 2;
   public static final int BIKE_ROUTE_DATA_ENABLED_FIELD_NUMBER = 3;
   private static final UserDeviceSettings$PbUserMapSettings DEFAULT_INSTANCE = new UserDeviceSettings$PbUserMapSettings();
   public static final int MAP_TOP_DIRECTION_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new UserDeviceSettings$PbUserMapSettings$1();
   private static final long serialVersionUID = 0L;
   private boolean altitudeDataEnabled_;
   private boolean bikeRouteDataEnabled_;
   private int bitField0_;
   private int mapTopDirection_;
   private byte memoizedIsInitialized;

   private UserDeviceSettings$PbUserMapSettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.mapTopDirection_ = 1;
      this.altitudeDataEnabled_ = false;
      this.bikeRouteDataEnabled_ = false;
   }

   private UserDeviceSettings$PbUserMapSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserMapSettings(CodedInputStream var1, ExtensionRegistryLite var2, UserDeviceSettings$1 var3) {
      this(var1, var2);
   }

   private UserDeviceSettings$PbUserMapSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserMapSettings(Builder var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(UserDeviceSettings$PbUserMapSettings var0, int var1) {
      var0.mapTopDirection_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(UserDeviceSettings$PbUserMapSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean a(UserDeviceSettings$PbUserMapSettings var0, boolean var1) {
      var0.altitudeDataEnabled_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(UserDeviceSettings$PbUserMapSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static boolean b(UserDeviceSettings$PbUserMapSettings var0, boolean var1) {
      var0.bikeRouteDataEnabled_ = var1;
      return var1;
   }

   public static UserDeviceSettings$PbUserMapSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.w();
   }

   public static UserDeviceSettings$PbUserMapSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UserDeviceSettings$PbUserMapSettings$Builder newBuilder(UserDeviceSettings$PbUserMapSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static UserDeviceSettings$PbUserMapSettings parseDelimitedFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserMapSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserMapSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserMapSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserMapSettings parseFrom(ByteString var0) {
      return (UserDeviceSettings$PbUserMapSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserMapSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserMapSettings)PARSER.parseFrom(var0, var1);
   }

   public static UserDeviceSettings$PbUserMapSettings parseFrom(CodedInputStream var0) {
      return (UserDeviceSettings$PbUserMapSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserMapSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserMapSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserMapSettings parseFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserMapSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserMapSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserMapSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserMapSettings parseFrom(byte[] var0) {
      return (UserDeviceSettings$PbUserMapSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserMapSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserMapSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof UserDeviceSettings$PbUserMapSettings)) {
            var2 = super.equals(var1);
         } else {
            UserDeviceSettings$PbUserMapSettings var5 = (UserDeviceSettings$PbUserMapSettings)var1;
            boolean var3;
            if (this.hasMapTopDirection() == var5.hasMapTopDirection()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasMapTopDirection()) {
               if (var3 && this.mapTopDirection_ == var5.mapTopDirection_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAltitudeDataEnabled() == var5.hasAltitudeDataEnabled()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasAltitudeDataEnabled()) {
               if (var3 && this.getAltitudeDataEnabled() == var5.getAltitudeDataEnabled()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasBikeRouteDataEnabled() == var5.hasBikeRouteDataEnabled()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasBikeRouteDataEnabled()) {
               if (var3 && this.getBikeRouteDataEnabled() == var5.getBikeRouteDataEnabled()) {
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

   public boolean getAltitudeDataEnabled() {
      return this.altitudeDataEnabled_;
   }

   public boolean getBikeRouteDataEnabled() {
      return this.bikeRouteDataEnabled_;
   }

   public UserDeviceSettings$PbUserMapSettings getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public UserDeviceSettings$PbUserMapSettings$PbMapTopDirection getMapTopDirection() {
      UserDeviceSettings$PbUserMapSettings$PbMapTopDirection var1 = UserDeviceSettings$PbUserMapSettings$PbMapTopDirection.valueOf(this.mapTopDirection_);
      UserDeviceSettings$PbUserMapSettings$PbMapTopDirection var2 = var1;
      if (var1 == null) {
         var2 = UserDeviceSettings$PbUserMapSettings$PbMapTopDirection.TOP_DIRECTION_NORTH;
      }

      return var2;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeEnumSize(1, this.mapTopDirection_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeBoolSize(2, this.altitudeDataEnabled_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeBoolSize(3, this.bikeRouteDataEnabled_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasAltitudeDataEnabled() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasBikeRouteDataEnabled() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMapTopDirection() {
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
         if (this.hasMapTopDirection()) {
            var1 = (var2 * 37 + 1) * 53 + this.mapTopDirection_;
         }

         var2 = var1;
         if (this.hasAltitudeDataEnabled()) {
            var2 = (var1 * 37 + 2) * 53 + Internal.hashBoolean(this.getAltitudeDataEnabled());
         }

         var1 = var2;
         if (this.hasBikeRouteDataEnabled()) {
            var1 = (var2 * 37 + 3) * 53 + Internal.hashBoolean(this.getBikeRouteDataEnabled());
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.x().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserMapSettings.class, UserDeviceSettings$PbUserMapSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasMapTopDirection()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public UserDeviceSettings$PbUserMapSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected UserDeviceSettings$PbUserMapSettings$Builder newBuilderForType(BuilderParent var1) {
      return new UserDeviceSettings$PbUserMapSettings$Builder(var1, (UserDeviceSettings$1)null);
   }

   public UserDeviceSettings$PbUserMapSettings$Builder toBuilder() {
      UserDeviceSettings$PbUserMapSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new UserDeviceSettings$PbUserMapSettings$Builder((UserDeviceSettings$1)null);
      } else {
         var1 = (new UserDeviceSettings$PbUserMapSettings$Builder((UserDeviceSettings$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.mapTopDirection_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeBool(2, this.altitudeDataEnabled_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeBool(3, this.bikeRouteDataEnabled_);
      }

      this.unknownFields.writeTo(var1);
   }
}
