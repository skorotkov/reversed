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

public final class UserDeviceSettings$PbUserEndTimeEstimatorSettings extends GeneratedMessageV3 implements UserDeviceSettings$PbUserEndTimeEstimatorSettingsOrBuilder {
   private static final UserDeviceSettings$PbUserEndTimeEstimatorSettings DEFAULT_INSTANCE = new UserDeviceSettings$PbUserEndTimeEstimatorSettings();
   public static final int END_TIME_ESTIMATOR_TARGET_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new UserDeviceSettings$PbUserEndTimeEstimatorSettings$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private float endTimeEstimatorTarget_;
   private byte memoizedIsInitialized;

   private UserDeviceSettings$PbUserEndTimeEstimatorSettings() {
      this.memoizedIsInitialized = (byte)-1;
      this.endTimeEstimatorTarget_ = 0.0F;
   }

   private UserDeviceSettings$PbUserEndTimeEstimatorSettings(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserEndTimeEstimatorSettings(CodedInputStream var1, ExtensionRegistryLite var2, UserDeviceSettings$1 var3) {
      this(var1, var2);
   }

   private UserDeviceSettings$PbUserEndTimeEstimatorSettings(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   UserDeviceSettings$PbUserEndTimeEstimatorSettings(Builder var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(UserDeviceSettings$PbUserEndTimeEstimatorSettings var0, float var1) {
      var0.endTimeEstimatorTarget_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(UserDeviceSettings$PbUserEndTimeEstimatorSettings var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(UserDeviceSettings$PbUserEndTimeEstimatorSettings var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static UserDeviceSettings$PbUserEndTimeEstimatorSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.m();
   }

   public static UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder newBuilder(UserDeviceSettings$PbUserEndTimeEstimatorSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static UserDeviceSettings$PbUserEndTimeEstimatorSettings parseDelimitedFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserEndTimeEstimatorSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserEndTimeEstimatorSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserEndTimeEstimatorSettings)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserEndTimeEstimatorSettings parseFrom(ByteString var0) {
      return (UserDeviceSettings$PbUserEndTimeEstimatorSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserEndTimeEstimatorSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserEndTimeEstimatorSettings)PARSER.parseFrom(var0, var1);
   }

   public static UserDeviceSettings$PbUserEndTimeEstimatorSettings parseFrom(CodedInputStream var0) {
      return (UserDeviceSettings$PbUserEndTimeEstimatorSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserEndTimeEstimatorSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserEndTimeEstimatorSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserEndTimeEstimatorSettings parseFrom(InputStream var0) {
      return (UserDeviceSettings$PbUserEndTimeEstimatorSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbUserEndTimeEstimatorSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserEndTimeEstimatorSettings)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbUserEndTimeEstimatorSettings parseFrom(byte[] var0) {
      return (UserDeviceSettings$PbUserEndTimeEstimatorSettings)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbUserEndTimeEstimatorSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbUserEndTimeEstimatorSettings)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof UserDeviceSettings$PbUserEndTimeEstimatorSettings)) {
            var2 = super.equals(var1);
         } else {
            UserDeviceSettings$PbUserEndTimeEstimatorSettings var5 = (UserDeviceSettings$PbUserEndTimeEstimatorSettings)var1;
            boolean var3;
            if (this.hasEndTimeEstimatorTarget() == var5.hasEndTimeEstimatorTarget()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasEndTimeEstimatorTarget()) {
               if (var3 && Float.floatToIntBits(this.getEndTimeEstimatorTarget()) == Float.floatToIntBits(var5.getEndTimeEstimatorTarget())) {
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

   public UserDeviceSettings$PbUserEndTimeEstimatorSettings getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public float getEndTimeEstimatorTarget() {
      return this.endTimeEstimatorTarget_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeFloatSize(1, this.endTimeEstimatorTarget_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasEndTimeEstimatorTarget() {
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
         if (this.hasEndTimeEstimatorTarget()) {
            var1 = (var2 * 37 + 1) * 53 + Float.floatToIntBits(this.getEndTimeEstimatorTarget());
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.n().ensureFieldAccessorsInitialized(UserDeviceSettings$PbUserEndTimeEstimatorSettings.class, UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder newBuilderForType() {
      return newBuilder();
   }

   protected UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder newBuilderForType(BuilderParent var1) {
      return new UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder(var1, (UserDeviceSettings$1)null);
   }

   public UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder toBuilder() {
      UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder((UserDeviceSettings$1)null);
      } else {
         var1 = (new UserDeviceSettings$PbUserEndTimeEstimatorSettings$Builder((UserDeviceSettings$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeFloat(1, this.endTimeEstimatorTarget_);
      }

      this.unknownFields.writeTo(var1);
   }
}
