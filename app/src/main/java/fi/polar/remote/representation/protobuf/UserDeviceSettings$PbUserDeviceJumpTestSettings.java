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

public final class UserDeviceSettings$PbUserDeviceJumpTestSettings extends GeneratedMessageV3 implements UserDeviceSettings$PbUserDeviceJumpTestSettingsOrBuilder {
   public static final int CONT_JUMP_DURATION_FIELD_NUMBER = 1;
   private static final UserDeviceSettings$PbUserDeviceJumpTestSettings DEFAULT_INSTANCE = new UserDeviceSettings$PbUserDeviceJumpTestSettings();
   @Deprecated
   public static final Parser PARSER = new UserDeviceSettings$PbUserDeviceJumpTestSettings$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private Types$PbDuration contJumpDuration_;
   private byte memoizedIsInitialized;

   private UserDeviceSettings$PbUserDeviceJumpTestSettings() {
      this.memoizedIsInitialized = (byte)-1;
   }

   private UserDeviceSettings$PbUserDeviceJumpTestSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceJumpTestSettings(CodedInputStream var1, ExtensionRegistryLite var2, UserDeviceSettings$1 var3) {
      this(var1, var2);
   }

   private UserDeviceSettings$PbUserDeviceJumpTestSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceJumpTestSettings(Builder var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(UserDeviceSettings$PbUserDeviceJumpTestSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(UserDeviceSettings$PbUserDeviceJumpTestSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbDuration a(UserDeviceSettings$PbUserDeviceJumpTestSettings var0, Types$PbDuration var1) {
      var0.contJumpDuration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static UserDeviceSettings$PbUserDeviceJumpTestSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.g();
   }

   public static UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder newBuilder(UserDeviceSettings$PbUserDeviceJumpTestSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceJumpTestSettings parseDelimitedFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserDeviceJumpTestSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceJumpTestSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceJumpTestSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceJumpTestSettings parseFrom(ByteString var0) {
      return (UserDeviceSettings$PbUserDeviceJumpTestSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceJumpTestSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceJumpTestSettings)PARSER.parseFrom(var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceJumpTestSettings parseFrom(CodedInputStream var0) {
      return (UserDeviceSettings$PbUserDeviceJumpTestSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceJumpTestSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceJumpTestSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceJumpTestSettings parseFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserDeviceJumpTestSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceJumpTestSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceJumpTestSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceJumpTestSettings parseFrom(byte[] var0) {
      return (UserDeviceSettings$PbUserDeviceJumpTestSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceJumpTestSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceJumpTestSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof UserDeviceSettings$PbUserDeviceJumpTestSettings)) {
            var2 = super.equals(var1);
         } else {
            UserDeviceSettings$PbUserDeviceJumpTestSettings var5 = (UserDeviceSettings$PbUserDeviceJumpTestSettings)var1;
            boolean var3;
            if (this.hasContJumpDuration() == var5.hasContJumpDuration()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasContJumpDuration()) {
               if (var3 && this.getContJumpDuration().equals(var5.getContJumpDuration())) {
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

   public Types$PbDuration getContJumpDuration() {
      Types$PbDuration var1;
      if (this.contJumpDuration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.contJumpDuration_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getContJumpDurationOrBuilder() {
      Types$PbDuration var1;
      if (this.contJumpDuration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.contJumpDuration_;
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceJumpTestSettings getDefaultInstanceForType() {
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
            var1 = 0 + CodedOutputStream.computeMessageSize(1, this.getContJumpDuration());
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasContJumpDuration() {
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
         if (this.hasContJumpDuration()) {
            var1 = (var2 * 37 + 1) * 53 + this.getContJumpDuration().hashCode();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.h().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserDeviceJumpTestSettings.class, UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasContJumpDuration()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder newBuilderForType(BuilderParent var1) {
      return new UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder(var1, (UserDeviceSettings$1)null);
   }

   public UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder toBuilder() {
      UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder((UserDeviceSettings$1)null);
      } else {
         var1 = (new UserDeviceSettings$PbUserDeviceJumpTestSettings$Builder((UserDeviceSettings$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeMessage(1, this.getContJumpDuration());
      }

      this.unknownFields.writeTo(var1);
   }
}
