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

public final class UserDeviceSettings$PbUserDeviceAutomaticSampleSettings extends GeneratedMessageV3 implements UserDeviceSettings$PbUserDeviceAutomaticSampleSettingsOrBuilder {
   private static final UserDeviceSettings$PbUserDeviceAutomaticSampleSettings DEFAULT_INSTANCE = new UserDeviceSettings$PbUserDeviceAutomaticSampleSettings();
   public static final int OHR_247_ENABLED_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private byte memoizedIsInitialized;
   private boolean ohr247Enabled_;

   private UserDeviceSettings$PbUserDeviceAutomaticSampleSettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.ohr247Enabled_ = false;
   }

   private UserDeviceSettings$PbUserDeviceAutomaticSampleSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceAutomaticSampleSettings(CodedInputStream var1, ExtensionRegistryLite var2, UserDeviceSettings$1 var3) {
      this(var1, var2);
   }

   private UserDeviceSettings$PbUserDeviceAutomaticSampleSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserDeviceAutomaticSampleSettings(Builder var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(UserDeviceSettings$PbUserDeviceAutomaticSampleSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(UserDeviceSettings$PbUserDeviceAutomaticSampleSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean a(UserDeviceSettings$PbUserDeviceAutomaticSampleSettings var0, boolean var1) {
      var0.ohr247Enabled_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static UserDeviceSettings$PbUserDeviceAutomaticSampleSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.G();
   }

   public static UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder newBuilder(UserDeviceSettings$PbUserDeviceAutomaticSampleSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceAutomaticSampleSettings parseDelimitedFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserDeviceAutomaticSampleSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceAutomaticSampleSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceAutomaticSampleSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceAutomaticSampleSettings parseFrom(ByteString var0) {
      return (UserDeviceSettings$PbUserDeviceAutomaticSampleSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceAutomaticSampleSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceAutomaticSampleSettings)PARSER.parseFrom(var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceAutomaticSampleSettings parseFrom(CodedInputStream var0) {
      return (UserDeviceSettings$PbUserDeviceAutomaticSampleSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceAutomaticSampleSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceAutomaticSampleSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceAutomaticSampleSettings parseFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserDeviceAutomaticSampleSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserDeviceAutomaticSampleSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceAutomaticSampleSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserDeviceAutomaticSampleSettings parseFrom(byte[] var0) {
      return (UserDeviceSettings$PbUserDeviceAutomaticSampleSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserDeviceAutomaticSampleSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserDeviceAutomaticSampleSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof UserDeviceSettings$PbUserDeviceAutomaticSampleSettings)) {
            var2 = super.equals(var1);
         } else {
            UserDeviceSettings$PbUserDeviceAutomaticSampleSettings var5 = (UserDeviceSettings$PbUserDeviceAutomaticSampleSettings)var1;
            boolean var3;
            if (this.hasOhr247Enabled() == var5.hasOhr247Enabled()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasOhr247Enabled()) {
               if (var3 && this.getOhr247Enabled() == var5.getOhr247Enabled()) {
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

   public UserDeviceSettings$PbUserDeviceAutomaticSampleSettings getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public boolean getOhr247Enabled() {
      return this.ohr247Enabled_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeBoolSize(1, this.ohr247Enabled_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasOhr247Enabled() {
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
         if (this.hasOhr247Enabled()) {
            var1 = (var2 * 37 + 1) * 53 + Internal.hashBoolean(this.getOhr247Enabled());
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.H().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserDeviceAutomaticSampleSettings.class, UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasOhr247Enabled()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder newBuilderForType(BuilderParent var1) {
      return new UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder(var1, (UserDeviceSettings$1)null);
   }

   public UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder toBuilder() {
      UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder((UserDeviceSettings$1)null);
      } else {
         var1 = (new UserDeviceSettings$PbUserDeviceAutomaticSampleSettings$Builder((UserDeviceSettings$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeBool(1, this.ohr247Enabled_);
      }

      this.unknownFields.writeTo(var1);
   }
}
