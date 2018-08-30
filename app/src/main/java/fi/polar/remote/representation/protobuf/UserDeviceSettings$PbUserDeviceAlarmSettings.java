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

public final class UserDeviceSettings$PbUserDeviceAlarmSettings extends GeneratedMessageV3 implements UserDeviceSettings$PbUserDeviceAlarmSettingsOrBuilder {
   public static final int ALARM_MODE_FIELD_NUMBER = 1;
   public static final int ALARM_TIME_FIELD_NUMBER = 2;
   private static final UserDeviceSettings$PbUserDeviceAlarmSettings DEFAULT_INSTANCE = new UserDeviceSettings$PbUserDeviceAlarmSettings();
   @Deprecated
   public static final Parser PARSER = new UserDeviceSettings$PbUserDeviceAlarmSettings$1();
   private static final long serialVersionUID = 0L;
   private int alarmMode_;
   private Types$PbTime alarmTime_;
   private int bitField0_;
   private byte memoizedIsInitialized;

   private UserDeviceSettings$PbUserDeviceAlarmSettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.alarmMode_ = 1;
   }

   private UserDeviceSettings$PbUserDeviceAlarmSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceAlarmSettings(CodedInputStream var1, ExtensionRegistryLite var2, UserDeviceSettings$1 var3) {
      this(var1, var2);
   }

   private UserDeviceSettings$PbUserDeviceAlarmSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceAlarmSettings(Builder var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(UserDeviceSettings$PbUserDeviceAlarmSettings var0, int var1) {
      var0.alarmMode_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(UserDeviceSettings$PbUserDeviceAlarmSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbTime a(UserDeviceSettings$PbUserDeviceAlarmSettings var0, Types$PbTime var1) {
      var0.alarmTime_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(UserDeviceSettings$PbUserDeviceAlarmSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static UserDeviceSettings$PbUserDeviceAlarmSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.c();
   }

   public static UserDeviceSettings$PbUserDeviceAlarmSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UserDeviceSettings$PbUserDeviceAlarmSettings$Builder newBuilder(UserDeviceSettings$PbUserDeviceAlarmSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceAlarmSettings parseDelimitedFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserDeviceAlarmSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceAlarmSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceAlarmSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceAlarmSettings parseFrom(ByteString var0) {
      return (UserDeviceSettings$PbUserDeviceAlarmSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceAlarmSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceAlarmSettings)PARSER.parseFrom(var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceAlarmSettings parseFrom(CodedInputStream var0) {
      return (UserDeviceSettings$PbUserDeviceAlarmSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceAlarmSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceAlarmSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceAlarmSettings parseFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserDeviceAlarmSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceAlarmSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceAlarmSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceAlarmSettings parseFrom(byte[] var0) {
      return (UserDeviceSettings$PbUserDeviceAlarmSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceAlarmSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceAlarmSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof UserDeviceSettings$PbUserDeviceAlarmSettings)) {
            var2 = super.equals(var1);
         } else {
            UserDeviceSettings$PbUserDeviceAlarmSettings var5 = (UserDeviceSettings$PbUserDeviceAlarmSettings)var1;
            boolean var3;
            if (this.hasAlarmMode() == var5.hasAlarmMode()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasAlarmMode()) {
               if (var3 && this.alarmMode_ == var5.alarmMode_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasAlarmTime() == var5.hasAlarmTime()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasAlarmTime()) {
               if (var3 && this.getAlarmTime().equals(var5.getAlarmTime())) {
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

   public UserDeviceSettings$PbUserDeviceAlarmSettings$PbAlarmMode getAlarmMode() {
      UserDeviceSettings$PbUserDeviceAlarmSettings$PbAlarmMode var1 = UserDeviceSettings$PbUserDeviceAlarmSettings$PbAlarmMode.valueOf(this.alarmMode_);
      UserDeviceSettings$PbUserDeviceAlarmSettings$PbAlarmMode var2 = var1;
      if (var1 == null) {
         var2 = UserDeviceSettings$PbUserDeviceAlarmSettings$PbAlarmMode.ALARM_MODE_OFF;
      }

      return var2;
   }

   public Types$PbTime getAlarmTime() {
      Types$PbTime var1;
      if (this.alarmTime_ == null) {
         var1 = Types$PbTime.getDefaultInstance();
      } else {
         var1 = this.alarmTime_;
      }

      return var1;
   }

   public Types$PbTimeOrBuilder getAlarmTimeOrBuilder() {
      Types$PbTime var1;
      if (this.alarmTime_ == null) {
         var1 = Types$PbTime.getDefaultInstance();
      } else {
         var1 = this.alarmTime_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceAlarmSettings getDefaultInstanceForType() {
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
            var1 = 0 + CodedOutputStream.computeEnumSize(1, this.alarmMode_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeMessageSize(2, this.getAlarmTime());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasAlarmMode() {
      boolean var1 = true;
      if ((this.bitField0_ & 1) != 1) {
         var1 = false;
      }

      return var1;
   }

   public boolean hasAlarmTime() {
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
         if (this.hasAlarmMode()) {
            var1 = (var2 * 37 + 1) * 53 + this.alarmMode_;
         }

         var2 = var1;
         if (this.hasAlarmTime()) {
            var2 = (var1 * 37 + 2) * 53 + this.getAlarmTime().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.d().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserDeviceAlarmSettings.class, UserDeviceSettings$PbUserDeviceAlarmSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasAlarmMode()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasAlarmTime()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getAlarmTime().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceAlarmSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected UserDeviceSettings$PbUserDeviceAlarmSettings$Builder newBuilderForType(BuilderParent var1) {
      return new UserDeviceSettings$PbUserDeviceAlarmSettings$Builder(var1, (UserDeviceSettings$1)null);
   }

   public UserDeviceSettings$PbUserDeviceAlarmSettings$Builder toBuilder() {
      UserDeviceSettings$PbUserDeviceAlarmSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new UserDeviceSettings$PbUserDeviceAlarmSettings$Builder((UserDeviceSettings$1)null);
      } else {
         var1 = (new UserDeviceSettings$PbUserDeviceAlarmSettings$Builder((UserDeviceSettings$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.alarmMode_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getAlarmTime());
      }

      this.unknownFields.writeTo(var1);
   }
}
