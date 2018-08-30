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

public final class UserDeviceSettings$PbUserDeviceAutoSyncSettings extends GeneratedMessageV3 implements UserDeviceSettings$PbUserDeviceAutoSyncSettingsOrBuilder {
   private static final UserDeviceSettings$PbUserDeviceAutoSyncSettings DEFAULT_INSTANCE = new UserDeviceSettings$PbUserDeviceAutoSyncSettings();
   public static final int ENABLED_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new UserDeviceSettings$PbUserDeviceAutoSyncSettings$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private boolean enabled_;
   private byte memoizedIsInitialized;

   private UserDeviceSettings$PbUserDeviceAutoSyncSettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.enabled_ = false;
   }

   private UserDeviceSettings$PbUserDeviceAutoSyncSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceAutoSyncSettings(CodedInputStream var1, ExtensionRegistryLite var2, UserDeviceSettings$1 var3) {
      this(var1, var2);
   }

   private UserDeviceSettings$PbUserDeviceAutoSyncSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceAutoSyncSettings(Builder var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(UserDeviceSettings$PbUserDeviceAutoSyncSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(UserDeviceSettings$PbUserDeviceAutoSyncSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean a(UserDeviceSettings$PbUserDeviceAutoSyncSettings var0, boolean var1) {
      var0.enabled_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static UserDeviceSettings$PbUserDeviceAutoSyncSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.E();
   }

   public static UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder newBuilder(UserDeviceSettings$PbUserDeviceAutoSyncSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceAutoSyncSettings parseDelimitedFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserDeviceAutoSyncSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceAutoSyncSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceAutoSyncSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceAutoSyncSettings parseFrom(ByteString var0) {
      return (UserDeviceSettings$PbUserDeviceAutoSyncSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceAutoSyncSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceAutoSyncSettings)PARSER.parseFrom(var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceAutoSyncSettings parseFrom(CodedInputStream var0) {
      return (UserDeviceSettings$PbUserDeviceAutoSyncSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceAutoSyncSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceAutoSyncSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceAutoSyncSettings parseFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserDeviceAutoSyncSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceAutoSyncSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceAutoSyncSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceAutoSyncSettings parseFrom(byte[] var0) {
      return (UserDeviceSettings$PbUserDeviceAutoSyncSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceAutoSyncSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceAutoSyncSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof UserDeviceSettings$PbUserDeviceAutoSyncSettings)) {
            var2 = super.equals(var1);
         } else {
            UserDeviceSettings$PbUserDeviceAutoSyncSettings var5 = (UserDeviceSettings$PbUserDeviceAutoSyncSettings)var1;
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

            if (!var4 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public UserDeviceSettings$PbUserDeviceAutoSyncSettings getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public boolean getEnabled() {
      return this.enabled_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeBoolSize(1, this.enabled_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasEnabled() {
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
         if (this.hasEnabled()) {
            var1 = (var2 * 37 + 1) * 53 + Internal.hashBoolean(this.getEnabled());
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.F().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserDeviceAutoSyncSettings.class, UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder.class);
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
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder newBuilderForType(BuilderParent var1) {
      return new UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder(var1, (UserDeviceSettings$1)null);
   }

   public UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder toBuilder() {
      UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder((UserDeviceSettings$1)null);
      } else {
         var1 = (new UserDeviceSettings$PbUserDeviceAutoSyncSettings$Builder((UserDeviceSettings$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeBool(1, this.enabled_);
      }

      this.unknownFields.writeTo(var1);
   }
}
