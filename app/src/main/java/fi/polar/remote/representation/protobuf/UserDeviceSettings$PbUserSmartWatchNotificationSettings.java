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

public final class UserDeviceSettings$PbUserSmartWatchNotificationSettings extends GeneratedMessageV3 implements UserDeviceSettings$PbUserSmartWatchNotificationSettingsOrBuilder {
   private static final UserDeviceSettings$PbUserSmartWatchNotificationSettings DEFAULT_INSTANCE = new UserDeviceSettings$PbUserSmartWatchNotificationSettings();
   public static final int DO_NOT_DISTURB_SETTINGS_FIELD_NUMBER = 3;
   public static final int ENABLED_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new UserDeviceSettings$PbUserSmartWatchNotificationSettings$1();
   public static final int PREVIEW_ENABLED_FIELD_NUMBER = 2;
   public static final int SOUNDS_ENABLED_FIELD_NUMBER = 4;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private UserDeviceSettings$PbDoNotDisturbSettings doNotDisturbSettings_;
   private boolean enabled_;
   private byte memoizedIsInitialized;
   private boolean previewEnabled_;
   private boolean soundsEnabled_;

   private UserDeviceSettings$PbUserSmartWatchNotificationSettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.enabled_ = false;
      this.previewEnabled_ = false;
      this.soundsEnabled_ = false;
   }

   private UserDeviceSettings$PbUserSmartWatchNotificationSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserSmartWatchNotificationSettings(CodedInputStream var1, ExtensionRegistryLite var2, UserDeviceSettings$1 var3) {
      this(var1, var2);
   }

   private UserDeviceSettings$PbUserSmartWatchNotificationSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserSmartWatchNotificationSettings(Builder var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(UserDeviceSettings$PbUserSmartWatchNotificationSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(UserDeviceSettings$PbUserSmartWatchNotificationSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static UserDeviceSettings$PbDoNotDisturbSettings a(UserDeviceSettings$PbUserSmartWatchNotificationSettings var0, UserDeviceSettings$PbDoNotDisturbSettings var1) {
      var0.doNotDisturbSettings_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean a(UserDeviceSettings$PbUserSmartWatchNotificationSettings var0, boolean var1) {
      var0.enabled_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static boolean b(UserDeviceSettings$PbUserSmartWatchNotificationSettings var0, boolean var1) {
      var0.previewEnabled_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean c(UserDeviceSettings$PbUserSmartWatchNotificationSettings var0, boolean var1) {
      var0.soundsEnabled_ = var1;
      return var1;
   }

   public static UserDeviceSettings$PbUserSmartWatchNotificationSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.u();
   }

   public static UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder newBuilder(UserDeviceSettings$PbUserSmartWatchNotificationSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static UserDeviceSettings$PbUserSmartWatchNotificationSettings parseDelimitedFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserSmartWatchNotificationSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserSmartWatchNotificationSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserSmartWatchNotificationSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserSmartWatchNotificationSettings parseFrom(ByteString var0) {
      return (UserDeviceSettings$PbUserSmartWatchNotificationSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserSmartWatchNotificationSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserSmartWatchNotificationSettings)PARSER.parseFrom(var0, var1);
   }

   public static UserDeviceSettings$PbUserSmartWatchNotificationSettings parseFrom(CodedInputStream var0) {
      return (UserDeviceSettings$PbUserSmartWatchNotificationSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserSmartWatchNotificationSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserSmartWatchNotificationSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserSmartWatchNotificationSettings parseFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserSmartWatchNotificationSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserSmartWatchNotificationSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserSmartWatchNotificationSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserSmartWatchNotificationSettings parseFrom(byte[] var0) {
      return (UserDeviceSettings$PbUserSmartWatchNotificationSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserSmartWatchNotificationSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserSmartWatchNotificationSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof UserDeviceSettings$PbUserSmartWatchNotificationSettings)) {
            var2 = super.equals(var1);
         } else {
            UserDeviceSettings$PbUserSmartWatchNotificationSettings var5 = (UserDeviceSettings$PbUserSmartWatchNotificationSettings)var1;
            boolean var3;
            if (this.hasEnabled() == var5.hasEnabled()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasEnabled()) {
               if (var3 && this.getEnabled() == var5.getEnabled()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasPreviewEnabled() == var5.hasPreviewEnabled()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasPreviewEnabled()) {
               if (var3 && this.getPreviewEnabled() == var5.getPreviewEnabled()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasDoNotDisturbSettings() == var5.hasDoNotDisturbSettings()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasDoNotDisturbSettings()) {
               if (var3 && this.getDoNotDisturbSettings().equals(var5.getDoNotDisturbSettings())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSoundsEnabled() == var5.hasSoundsEnabled()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSoundsEnabled()) {
               if (var3 && this.getSoundsEnabled() == var5.getSoundsEnabled()) {
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

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public UserDeviceSettings$PbDoNotDisturbSettings getDoNotDisturbSettings() {
      UserDeviceSettings$PbDoNotDisturbSettings var1;
      if (this.doNotDisturbSettings_ == null) {
         var1 = UserDeviceSettings$PbDoNotDisturbSettings.getDefaultInstance();
      } else {
         var1 = this.doNotDisturbSettings_;
      }

      return var1;
   }

   public UserDeviceSettings$PbDoNotDisturbSettingsOrBuilder getDoNotDisturbSettingsOrBuilder() {
      UserDeviceSettings$PbDoNotDisturbSettings var1;
      if (this.doNotDisturbSettings_ == null) {
         var1 = UserDeviceSettings$PbDoNotDisturbSettings.getDefaultInstance();
      } else {
         var1 = this.doNotDisturbSettings_;
      }

      return var1;
   }

   public boolean getEnabled() {
      return this.enabled_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public boolean getPreviewEnabled() {
      return this.previewEnabled_;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeBoolSize(1, this.enabled_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeBoolSize(2, this.previewEnabled_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeMessageSize(3, this.getDoNotDisturbSettings());
         }

         var1 = var2;
         if ((this.bitField0_ & 8) == 8) {
            var1 = var2 + CodedOutputStream.computeBoolSize(4, this.soundsEnabled_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public boolean getSoundsEnabled() {
      return this.soundsEnabled_;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasDoNotDisturbSettings() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasEnabled() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasPreviewEnabled() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSoundsEnabled() {
      boolean var1;
      if ((this.bitField0_ & 8) == 8) {
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
         if (this.hasEnabled()) {
            var2 = (var1 * 37 + 1) * 53 + Internal.hashBoolean(this.getEnabled());
         }

         var1 = var2;
         if (this.hasPreviewEnabled()) {
            var1 = (var2 * 37 + 2) * 53 + Internal.hashBoolean(this.getPreviewEnabled());
         }

         var2 = var1;
         if (this.hasDoNotDisturbSettings()) {
            var2 = (var1 * 37 + 3) * 53 + this.getDoNotDisturbSettings().hashCode();
         }

         var1 = var2;
         if (this.hasSoundsEnabled()) {
            var1 = (var2 * 37 + 4) * 53 + Internal.hashBoolean(this.getSoundsEnabled());
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.v().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserSmartWatchNotificationSettings.class, UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasEnabled()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasDoNotDisturbSettings() && !this.getDoNotDisturbSettings().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder newBuilderForType(BuilderParent var1) {
      return new UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder(var1, (UserDeviceSettings$1)null);
   }

   public UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder toBuilder() {
      UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder((UserDeviceSettings$1)null);
      } else {
         var1 = (new UserDeviceSettings$PbUserSmartWatchNotificationSettings$Builder((UserDeviceSettings$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeBool(1, this.enabled_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeBool(2, this.previewEnabled_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getDoNotDisturbSettings());
      }

      if ((this.bitField0_ & 8) == 8) {
         var1.writeBool(4, this.soundsEnabled_);
      }

      this.unknownFields.writeTo(var1);
   }
}
