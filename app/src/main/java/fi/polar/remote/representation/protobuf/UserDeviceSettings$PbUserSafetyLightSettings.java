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

public final class UserDeviceSettings$PbUserSafetyLightSettings extends GeneratedMessageV3 implements UserDeviceSettings$PbUserSafetyLightSettingsOrBuilder {
   public static final int ACTIVATION_LEVEL_FIELD_NUMBER = 2;
   public static final int BLINK_RATE_FIELD_NUMBER = 3;
   private static final UserDeviceSettings$PbUserSafetyLightSettings DEFAULT_INSTANCE = new UserDeviceSettings$PbUserSafetyLightSettings();
   public static final int MODE_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new UserDeviceSettings$PbUserSafetyLightSettings$1();
   private static final long serialVersionUID = 0L;
   private int activationLevel_;
   private int bitField0_;
   private int blinkRate_;
   private byte memoizedIsInitialized;
   private int mode_;

   private UserDeviceSettings$PbUserSafetyLightSettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.mode_ = 1;
      this.activationLevel_ = 1;
      this.blinkRate_ = 1;
   }

   private UserDeviceSettings$PbUserSafetyLightSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserSafetyLightSettings(CodedInputStream var1, ExtensionRegistryLite var2, UserDeviceSettings$1 var3) {
      this(var1, var2);
   }

   private UserDeviceSettings$PbUserSafetyLightSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserSafetyLightSettings(Builder var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(UserDeviceSettings$PbUserSafetyLightSettings var0, int var1) {
      var0.mode_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(UserDeviceSettings$PbUserSafetyLightSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(UserDeviceSettings$PbUserSafetyLightSettings var0, int var1) {
      var0.activationLevel_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(UserDeviceSettings$PbUserSafetyLightSettings var0, int var1) {
      var0.blinkRate_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int d(UserDeviceSettings$PbUserSafetyLightSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static UserDeviceSettings$PbUserSafetyLightSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.q();
   }

   public static UserDeviceSettings$PbUserSafetyLightSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UserDeviceSettings$PbUserSafetyLightSettings$Builder newBuilder(UserDeviceSettings$PbUserSafetyLightSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static UserDeviceSettings$PbUserSafetyLightSettings parseDelimitedFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserSafetyLightSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserSafetyLightSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserSafetyLightSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserSafetyLightSettings parseFrom(ByteString var0) {
      return (UserDeviceSettings$PbUserSafetyLightSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserSafetyLightSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserSafetyLightSettings)PARSER.parseFrom(var0, var1);
   }

   public static UserDeviceSettings$PbUserSafetyLightSettings parseFrom(CodedInputStream var0) {
      return (UserDeviceSettings$PbUserSafetyLightSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserSafetyLightSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserSafetyLightSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserSafetyLightSettings parseFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserSafetyLightSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserSafetyLightSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserSafetyLightSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserSafetyLightSettings parseFrom(byte[] var0) {
      return (UserDeviceSettings$PbUserSafetyLightSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserSafetyLightSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserSafetyLightSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof UserDeviceSettings$PbUserSafetyLightSettings)) {
            var2 = super.equals(var1);
         } else {
            UserDeviceSettings$PbUserSafetyLightSettings var5 = (UserDeviceSettings$PbUserSafetyLightSettings)var1;
            boolean var3;
            if (this.hasMode() == var5.hasMode()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasMode()) {
               if (var3 && this.mode_ == var5.mode_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasActivationLevel() == var5.hasActivationLevel()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasActivationLevel()) {
               if (var3 && this.activationLevel_ == var5.activationLevel_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasBlinkRate() == var5.hasBlinkRate()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasBlinkRate()) {
               if (var3 && this.blinkRate_ == var5.blinkRate_) {
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

   public UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightActivationLevel getActivationLevel() {
      UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightActivationLevel var1 = UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightActivationLevel.valueOf(this.activationLevel_);
      UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightActivationLevel var2 = var1;
      if (var1 == null) {
         var2 = UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightActivationLevel.ACTIVATION_LEVEL_DARK;
      }

      return var2;
   }

   public UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightBlinkRate getBlinkRate() {
      UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightBlinkRate var1 = UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightBlinkRate.valueOf(this.blinkRate_);
      UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightBlinkRate var2 = var1;
      if (var1 == null) {
         var2 = UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightBlinkRate.BLINK_RATE_OFF;
      }

      return var2;
   }

   public UserDeviceSettings$PbUserSafetyLightSettings getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightMode getMode() {
      UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightMode var1 = UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightMode.valueOf(this.mode_);
      UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightMode var2 = var1;
      if (var1 == null) {
         var2 = UserDeviceSettings$PbUserSafetyLightSettings$PbSafetyLightMode.SAFETY_LIGHT_MANUAL;
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
            var2 = 0 + CodedOutputStream.computeEnumSize(1, this.mode_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeEnumSize(2, this.activationLevel_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeEnumSize(3, this.blinkRate_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasActivationLevel() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasBlinkRate() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasMode() {
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
         if (this.hasMode()) {
            var1 = (var2 * 37 + 1) * 53 + this.mode_;
         }

         var2 = var1;
         if (this.hasActivationLevel()) {
            var2 = (var1 * 37 + 2) * 53 + this.activationLevel_;
         }

         var1 = var2;
         if (this.hasBlinkRate()) {
            var1 = (var2 * 37 + 3) * 53 + this.blinkRate_;
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.r().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserSafetyLightSettings.class, UserDeviceSettings$PbUserSafetyLightSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasMode()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public UserDeviceSettings$PbUserSafetyLightSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected UserDeviceSettings$PbUserSafetyLightSettings$Builder newBuilderForType(BuilderParent var1) {
      return new UserDeviceSettings$PbUserSafetyLightSettings$Builder(var1, (UserDeviceSettings$1)null);
   }

   public UserDeviceSettings$PbUserSafetyLightSettings$Builder toBuilder() {
      UserDeviceSettings$PbUserSafetyLightSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new UserDeviceSettings$PbUserSafetyLightSettings$Builder((UserDeviceSettings$1)null);
      } else {
         var1 = (new UserDeviceSettings$PbUserSafetyLightSettings$Builder((UserDeviceSettings$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.mode_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeEnum(2, this.activationLevel_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeEnum(3, this.blinkRate_);
      }

      this.unknownFields.writeTo(var1);
   }
}
