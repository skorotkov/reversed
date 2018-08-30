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

public final class UserDeviceSettings$PbUserDeviceDoNotDisturbSettings extends GeneratedMessageV3 implements UserDeviceSettings$PbUserDeviceDoNotDisturbSettingsOrBuilder {
   private static final UserDeviceSettings$PbUserDeviceDoNotDisturbSettings DEFAULT_INSTANCE = new UserDeviceSettings$PbUserDeviceDoNotDisturbSettings();
   public static final int DO_NOT_DISTURB_ON_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$1();
   public static final int SETTING_SOURCE_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private boolean doNotDisturbOn_;
   private byte memoizedIsInitialized;
   private int settingSource_;

   private UserDeviceSettings$PbUserDeviceDoNotDisturbSettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.doNotDisturbOn_ = false;
      this.settingSource_ = 0;
   }

   private UserDeviceSettings$PbUserDeviceDoNotDisturbSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceDoNotDisturbSettings(CodedInputStream var1, ExtensionRegistryLite var2, UserDeviceSettings$1 var3) {
      this(var1, var2);
   }

   private UserDeviceSettings$PbUserDeviceDoNotDisturbSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceDoNotDisturbSettings(Builder var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(UserDeviceSettings$PbUserDeviceDoNotDisturbSettings var0, int var1) {
      var0.settingSource_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(UserDeviceSettings$PbUserDeviceDoNotDisturbSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean a(UserDeviceSettings$PbUserDeviceDoNotDisturbSettings var0, boolean var1) {
      var0.doNotDisturbOn_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(UserDeviceSettings$PbUserDeviceDoNotDisturbSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static UserDeviceSettings$PbUserDeviceDoNotDisturbSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.C();
   }

   public static UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder newBuilder(UserDeviceSettings$PbUserDeviceDoNotDisturbSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceDoNotDisturbSettings parseDelimitedFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserDeviceDoNotDisturbSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceDoNotDisturbSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceDoNotDisturbSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceDoNotDisturbSettings parseFrom(ByteString var0) {
      return (UserDeviceSettings$PbUserDeviceDoNotDisturbSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceDoNotDisturbSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceDoNotDisturbSettings)PARSER.parseFrom(var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceDoNotDisturbSettings parseFrom(CodedInputStream var0) {
      return (UserDeviceSettings$PbUserDeviceDoNotDisturbSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceDoNotDisturbSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceDoNotDisturbSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceDoNotDisturbSettings parseFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserDeviceDoNotDisturbSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceDoNotDisturbSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceDoNotDisturbSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceDoNotDisturbSettings parseFrom(byte[] var0) {
      return (UserDeviceSettings$PbUserDeviceDoNotDisturbSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceDoNotDisturbSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceDoNotDisturbSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof UserDeviceSettings$PbUserDeviceDoNotDisturbSettings)) {
            var2 = super.equals(var1);
         } else {
            UserDeviceSettings$PbUserDeviceDoNotDisturbSettings var5 = (UserDeviceSettings$PbUserDeviceDoNotDisturbSettings)var1;
            boolean var3;
            if (this.hasDoNotDisturbOn() == var5.hasDoNotDisturbOn()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasDoNotDisturbOn()) {
               if (var3 && this.getDoNotDisturbOn() == var5.getDoNotDisturbOn()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSettingSource() == var5.hasSettingSource()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSettingSource()) {
               if (var4 && this.settingSource_ == var5.settingSource_) {
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

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettings getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public boolean getDoNotDisturbOn() {
      return this.doNotDisturbOn_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeBoolSize(1, this.doNotDisturbOn_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeEnumSize(2, this.settingSource_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$PbDoNotDisturbSettingSource getSettingSource() {
      UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$PbDoNotDisturbSettingSource var1 = UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$PbDoNotDisturbSettingSource.valueOf(this.settingSource_);
      UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$PbDoNotDisturbSettingSource var2 = var1;
      if (var1 == null) {
         var2 = UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$PbDoNotDisturbSettingSource.SOURCE_USER;
      }

      return var2;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasDoNotDisturbOn() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSettingSource() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
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
         if (this.hasDoNotDisturbOn()) {
            var1 = (var2 * 37 + 1) * 53 + Internal.hashBoolean(this.getDoNotDisturbOn());
         }

         var2 = var1;
         if (this.hasSettingSource()) {
            var2 = (var1 * 37 + 2) * 53 + this.settingSource_;
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.D().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserDeviceDoNotDisturbSettings.class, UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasDoNotDisturbOn()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder newBuilderForType(BuilderParent var1) {
      return new UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder(var1, (UserDeviceSettings$1)null);
   }

   public UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder toBuilder() {
      UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder((UserDeviceSettings$1)null);
      } else {
         var1 = (new UserDeviceSettings$PbUserDeviceDoNotDisturbSettings$Builder((UserDeviceSettings$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeBool(1, this.doNotDisturbOn_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeEnum(2, this.settingSource_);
      }

      this.unknownFields.writeTo(var1);
   }
}
