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

public final class UserDeviceSettings$PbDoNotDisturbSettings extends GeneratedMessageV3 implements UserDeviceSettings$PbDoNotDisturbSettingsOrBuilder {
   private static final UserDeviceSettings$PbDoNotDisturbSettings DEFAULT_INSTANCE = new UserDeviceSettings$PbDoNotDisturbSettings();
   public static final int ENABLED_FIELD_NUMBER = 1;
   public static final int END_FIELD_NUMBER = 3;
   @Deprecated
   public static final Parser PARSER = new UserDeviceSettings$PbDoNotDisturbSettings$1();
   public static final int START_FIELD_NUMBER = 2;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private boolean enabled_;
   private Types$PbTime end_;
   private byte memoizedIsInitialized;
   private Types$PbTime start_;

   private UserDeviceSettings$PbDoNotDisturbSettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.enabled_ = false;
   }

   private UserDeviceSettings$PbDoNotDisturbSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   UserDeviceSettings$PbDoNotDisturbSettings(CodedInputStream var1, ExtensionRegistryLite var2, UserDeviceSettings$1 var3) {
      this(var1, var2);
   }

   private UserDeviceSettings$PbDoNotDisturbSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   UserDeviceSettings$PbDoNotDisturbSettings(Builder var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(UserDeviceSettings$PbDoNotDisturbSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(UserDeviceSettings$PbDoNotDisturbSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbTime a(UserDeviceSettings$PbDoNotDisturbSettings var0, Types$PbTime var1) {
      var0.start_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean a(UserDeviceSettings$PbDoNotDisturbSettings var0, boolean var1) {
      var0.enabled_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static Types$PbTime b(UserDeviceSettings$PbDoNotDisturbSettings var0, Types$PbTime var1) {
      var0.end_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static UserDeviceSettings$PbDoNotDisturbSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.s();
   }

   public static UserDeviceSettings$PbDoNotDisturbSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UserDeviceSettings$PbDoNotDisturbSettings$Builder newBuilder(UserDeviceSettings$PbDoNotDisturbSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static UserDeviceSettings$PbDoNotDisturbSettings parseDelimitedFrom(InputStream var0) {
      return (UserDeviceSettings$PbDoNotDisturbSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbDoNotDisturbSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbDoNotDisturbSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbDoNotDisturbSettings parseFrom(ByteString var0) {
      return (UserDeviceSettings$PbDoNotDisturbSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbDoNotDisturbSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbDoNotDisturbSettings)PARSER.parseFrom(var0, var1);
   }

   public static UserDeviceSettings$PbDoNotDisturbSettings parseFrom(CodedInputStream var0) {
      return (UserDeviceSettings$PbDoNotDisturbSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbDoNotDisturbSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbDoNotDisturbSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbDoNotDisturbSettings parseFrom(InputStream var0) {
      return (UserDeviceSettings$PbDoNotDisturbSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbDoNotDisturbSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbDoNotDisturbSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbDoNotDisturbSettings parseFrom(byte[] var0) {
      return (UserDeviceSettings$PbDoNotDisturbSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbDoNotDisturbSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbDoNotDisturbSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof UserDeviceSettings$PbDoNotDisturbSettings)) {
            var2 = super.equals(var1);
         } else {
            UserDeviceSettings$PbDoNotDisturbSettings var5 = (UserDeviceSettings$PbDoNotDisturbSettings)var1;
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

            if (var4 && this.hasStart() == var5.hasStart()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasStart()) {
               if (var3 && this.getStart().equals(var5.getStart())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasEnd() == var5.hasEnd()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasEnd()) {
               if (var4 && this.getEnd().equals(var5.getEnd())) {
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

   public UserDeviceSettings$PbDoNotDisturbSettings getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public boolean getEnabled() {
      return this.enabled_;
   }

   public Types$PbTime getEnd() {
      Types$PbTime var1;
      if (this.end_ == null) {
         var1 = Types$PbTime.getDefaultInstance();
      } else {
         var1 = this.end_;
      }

      return var1;
   }

   public Types$PbTimeOrBuilder getEndOrBuilder() {
      Types$PbTime var1;
      if (this.end_ == null) {
         var1 = Types$PbTime.getDefaultInstance();
      } else {
         var1 = this.end_;
      }

      return var1;
   }

   public Parser getParserForType() {
      return PARSER;
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
            var1 = var2 + CodedOutputStream.computeMessageSize(2, this.getStart());
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeMessageSize(3, this.getEnd());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public Types$PbTime getStart() {
      Types$PbTime var1;
      if (this.start_ == null) {
         var1 = Types$PbTime.getDefaultInstance();
      } else {
         var1 = this.start_;
      }

      return var1;
   }

   public Types$PbTimeOrBuilder getStartOrBuilder() {
      Types$PbTime var1;
      if (this.start_ == null) {
         var1 = Types$PbTime.getDefaultInstance();
      } else {
         var1 = this.start_;
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

   public boolean hasEnd() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasStart() {
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
         var1 = this.getDescriptorForType().hashCode() + 779;
         int var2 = var1;
         if (this.hasEnabled()) {
            var2 = (var1 * 37 + 1) * 53 + Internal.hashBoolean(this.getEnabled());
         }

         var1 = var2;
         if (this.hasStart()) {
            var1 = (var2 * 37 + 2) * 53 + this.getStart().hashCode();
         }

         var2 = var1;
         if (this.hasEnd()) {
            var2 = (var1 * 37 + 3) * 53 + this.getEnd().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.t().ensureFieldAccessorsInitialized(UserDeviceSettings$PbDoNotDisturbSettings.class, UserDeviceSettings$PbDoNotDisturbSettings$Builder.class);
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
         } else if (this.hasStart() && !this.getStart().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (this.hasEnd() && !this.getEnd().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public UserDeviceSettings$PbDoNotDisturbSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected UserDeviceSettings$PbDoNotDisturbSettings$Builder newBuilderForType(BuilderParent var1) {
      return new UserDeviceSettings$PbDoNotDisturbSettings$Builder(var1, (UserDeviceSettings$1)null);
   }

   public UserDeviceSettings$PbDoNotDisturbSettings$Builder toBuilder() {
      UserDeviceSettings$PbDoNotDisturbSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new UserDeviceSettings$PbDoNotDisturbSettings$Builder((UserDeviceSettings$1)null);
      } else {
         var1 = (new UserDeviceSettings$PbDoNotDisturbSettings$Builder((UserDeviceSettings$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeBool(1, this.enabled_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getStart());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeMessage(3, this.getEnd());
      }

      this.unknownFields.writeTo(var1);
   }
}
