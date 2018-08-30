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

public final class UserDeviceSettings$PbUserDeviceCountdownSettings extends GeneratedMessageV3 implements UserDeviceSettings$PbUserDeviceCountdownSettingsOrBuilder {
   public static final int COUNTDOWN_TIME_FIELD_NUMBER = 1;
   private static final UserDeviceSettings$PbUserDeviceCountdownSettings DEFAULT_INSTANCE = new UserDeviceSettings$PbUserDeviceCountdownSettings();
   @Deprecated
   public static final Parser PARSER = new UserDeviceSettings$PbUserDeviceCountdownSettings$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private Types$PbDuration countdownTime_;
   private byte memoizedIsInitialized;

   private UserDeviceSettings$PbUserDeviceCountdownSettings() {
      this.memoizedIsInitialized = (byte)-1;
   }

   private UserDeviceSettings$PbUserDeviceCountdownSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceCountdownSettings(CodedInputStream var1, ExtensionRegistryLite var2, UserDeviceSettings$1 var3) {
      this(var1, var2);
   }

   private UserDeviceSettings$PbUserDeviceCountdownSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceCountdownSettings(Builder var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(UserDeviceSettings$PbUserDeviceCountdownSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(UserDeviceSettings$PbUserDeviceCountdownSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbDuration a(UserDeviceSettings$PbUserDeviceCountdownSettings var0, Types$PbDuration var1) {
      var0.countdownTime_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static UserDeviceSettings$PbUserDeviceCountdownSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.e();
   }

   public static UserDeviceSettings$PbUserDeviceCountdownSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UserDeviceSettings$PbUserDeviceCountdownSettings$Builder newBuilder(UserDeviceSettings$PbUserDeviceCountdownSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceCountdownSettings parseDelimitedFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserDeviceCountdownSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceCountdownSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceCountdownSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceCountdownSettings parseFrom(ByteString var0) {
      return (UserDeviceSettings$PbUserDeviceCountdownSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceCountdownSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceCountdownSettings)PARSER.parseFrom(var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceCountdownSettings parseFrom(CodedInputStream var0) {
      return (UserDeviceSettings$PbUserDeviceCountdownSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceCountdownSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceCountdownSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceCountdownSettings parseFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserDeviceCountdownSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceCountdownSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceCountdownSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceCountdownSettings parseFrom(byte[] var0) {
      return (UserDeviceSettings$PbUserDeviceCountdownSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceCountdownSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceCountdownSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof UserDeviceSettings$PbUserDeviceCountdownSettings)) {
            var2 = super.equals(var1);
         } else {
            UserDeviceSettings$PbUserDeviceCountdownSettings var5 = (UserDeviceSettings$PbUserDeviceCountdownSettings)var1;
            boolean var3;
            if (this.hasCountdownTime() == var5.hasCountdownTime()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasCountdownTime()) {
               if (var3 && this.getCountdownTime().equals(var5.getCountdownTime())) {
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

   public Types$PbDuration getCountdownTime() {
      Types$PbDuration var1;
      if (this.countdownTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.countdownTime_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getCountdownTimeOrBuilder() {
      Types$PbDuration var1;
      if (this.countdownTime_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.countdownTime_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceCountdownSettings getDefaultInstanceForType() {
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
            var1 = 0 + CodedOutputStream.computeMessageSize(1, this.getCountdownTime());
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasCountdownTime() {
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
         if (this.hasCountdownTime()) {
            var1 = (var2 * 37 + 1) * 53 + this.getCountdownTime().hashCode();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.f().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserDeviceCountdownSettings.class, UserDeviceSettings$PbUserDeviceCountdownSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasCountdownTime()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceCountdownSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected UserDeviceSettings$PbUserDeviceCountdownSettings$Builder newBuilderForType(BuilderParent var1) {
      return new UserDeviceSettings$PbUserDeviceCountdownSettings$Builder(var1, (UserDeviceSettings$1)null);
   }

   public UserDeviceSettings$PbUserDeviceCountdownSettings$Builder toBuilder() {
      UserDeviceSettings$PbUserDeviceCountdownSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new UserDeviceSettings$PbUserDeviceCountdownSettings$Builder((UserDeviceSettings$1)null);
      } else {
         var1 = (new UserDeviceSettings$PbUserDeviceCountdownSettings$Builder((UserDeviceSettings$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getCountdownTime());
      }

      this.unknownFields.writeTo(var1);
   }
}
