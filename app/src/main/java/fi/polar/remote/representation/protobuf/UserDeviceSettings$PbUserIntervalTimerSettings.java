package fi.polar.remote.representation.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3.Builder;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class UserDeviceSettings$PbUserIntervalTimerSettings extends GeneratedMessageV3 implements UserDeviceSettings$PbUserIntervalTimerSettingsOrBuilder {
   private static final UserDeviceSettings$PbUserIntervalTimerSettings DEFAULT_INSTANCE = new UserDeviceSettings$PbUserIntervalTimerSettings();
   public static final int INTERVAL_TIMER_VALUE_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new UserDeviceSettings$PbUserIntervalTimerSettings$1();
   private static final long serialVersionUID = 0L;
   private List intervalTimerValue_;
   private byte memoizedIsInitialized;

   private UserDeviceSettings$PbUserIntervalTimerSettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.intervalTimerValue_ = Collections.emptyList();
   }

   private UserDeviceSettings$PbUserIntervalTimerSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserIntervalTimerSettings(CodedInputStream var1, ExtensionRegistryLite var2, UserDeviceSettings$1 var3) {
      this(var1, var2);
   }

   private UserDeviceSettings$PbUserIntervalTimerSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserIntervalTimerSettings(Builder var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static List a(UserDeviceSettings$PbUserIntervalTimerSettings var0) {
      return var0.intervalTimerValue_;
   }

   // $FF: synthetic method
   static List a(UserDeviceSettings$PbUserIntervalTimerSettings var0, List var1) {
      var0.intervalTimerValue_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet b(UserDeviceSettings$PbUserIntervalTimerSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static boolean c() {
      return alwaysUseFieldBuilders;
   }

   public static UserDeviceSettings$PbUserIntervalTimerSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.k();
   }

   public static UserDeviceSettings$PbUserIntervalTimerSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UserDeviceSettings$PbUserIntervalTimerSettings$Builder newBuilder(UserDeviceSettings$PbUserIntervalTimerSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static UserDeviceSettings$PbUserIntervalTimerSettings parseDelimitedFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserIntervalTimerSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserIntervalTimerSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserIntervalTimerSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserIntervalTimerSettings parseFrom(ByteString var0) {
      return (UserDeviceSettings$PbUserIntervalTimerSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserIntervalTimerSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserIntervalTimerSettings)PARSER.parseFrom(var0, var1);
   }

   public static UserDeviceSettings$PbUserIntervalTimerSettings parseFrom(CodedInputStream var0) {
      return (UserDeviceSettings$PbUserIntervalTimerSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserIntervalTimerSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserIntervalTimerSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserIntervalTimerSettings parseFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserIntervalTimerSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserIntervalTimerSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserIntervalTimerSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserIntervalTimerSettings parseFrom(byte[] var0) {
      return (UserDeviceSettings$PbUserIntervalTimerSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserIntervalTimerSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserIntervalTimerSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof UserDeviceSettings$PbUserIntervalTimerSettings)) {
            var2 = super.equals(var1);
         } else {
            UserDeviceSettings$PbUserIntervalTimerSettings var4 = (UserDeviceSettings$PbUserIntervalTimerSettings)var1;
            boolean var3;
            if (this.getIntervalTimerValueList().equals(var4.getIntervalTimerValueList())) {
               var3 = true;
            } else {
               var3 = false;
            }

            if (!var3 || !this.unknownFields.equals(var4.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public UserDeviceSettings$PbUserIntervalTimerSettings getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public UserDeviceSettings$PbIntervalTimerValue getIntervalTimerValue(int var1) {
      return (UserDeviceSettings$PbIntervalTimerValue)this.intervalTimerValue_.get(var1);
   }

   public int getIntervalTimerValueCount() {
      return this.intervalTimerValue_.size();
   }

   public List getIntervalTimerValueList() {
      return this.intervalTimerValue_;
   }

   public UserDeviceSettings$PbIntervalTimerValueOrBuilder getIntervalTimerValueOrBuilder(int var1) {
      return (UserDeviceSettings$PbIntervalTimerValueOrBuilder)this.intervalTimerValue_.get(var1);
   }

   public List getIntervalTimerValueOrBuilderList() {
      return this.intervalTimerValue_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;

         int var2;
         for(var2 = 0; var1 < this.intervalTimerValue_.size(); ++var1) {
            var2 += CodedOutputStream.computeMessageSize(1, (MessageLite)this.intervalTimerValue_.get(var1));
         }

         var1 = this.unknownFields.getSerializedSize() + var2;
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public int hashCode() {
      int var1;
      if (this.memoizedHashCode != 0) {
         var1 = this.memoizedHashCode;
      } else {
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.getIntervalTimerValueCount() > 0) {
            var1 = (var2 * 37 + 1) * 53 + this.getIntervalTimerValueList().hashCode();
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.l().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserIntervalTimerSettings.class, UserDeviceSettings$PbUserIntervalTimerSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = false;
      byte var2 = this.memoizedIsInitialized;
      boolean var3;
      if (var2 == 1) {
         var3 = true;
      } else {
         var3 = var1;
         if (var2 != 0) {
            int var4 = 0;

            while(true) {
               if (var4 >= this.getIntervalTimerValueCount()) {
                  this.memoizedIsInitialized = (byte)1;
                  var3 = true;
                  break;
               }

               if (!this.getIntervalTimerValue(var4).isInitialized()) {
                  this.memoizedIsInitialized = (byte)0;
                  var3 = var1;
                  break;
               }

               ++var4;
            }
         }
      }

      return var3;
   }

   public UserDeviceSettings$PbUserIntervalTimerSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected UserDeviceSettings$PbUserIntervalTimerSettings$Builder newBuilderForType(BuilderParent var1) {
      return new UserDeviceSettings$PbUserIntervalTimerSettings$Builder(var1, (UserDeviceSettings$1)null);
   }

   public UserDeviceSettings$PbUserIntervalTimerSettings$Builder toBuilder() {
      UserDeviceSettings$PbUserIntervalTimerSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new UserDeviceSettings$PbUserIntervalTimerSettings$Builder((UserDeviceSettings$1)null);
      } else {
         var1 = (new UserDeviceSettings$PbUserIntervalTimerSettings$Builder((UserDeviceSettings$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      for(int var2 = 0; var2 < this.intervalTimerValue_.size(); ++var2) {
         var1.writeMessage(1, (MessageLite)this.intervalTimerValue_.get(var2));
      }

      this.unknownFields.writeTo(var1);
   }
}
