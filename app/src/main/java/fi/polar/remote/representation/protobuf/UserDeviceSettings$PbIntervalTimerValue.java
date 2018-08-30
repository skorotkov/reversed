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

public final class UserDeviceSettings$PbIntervalTimerValue extends GeneratedMessageV3 implements UserDeviceSettings$PbIntervalTimerValueOrBuilder {
   private static final UserDeviceSettings$PbIntervalTimerValue DEFAULT_INSTANCE = new UserDeviceSettings$PbIntervalTimerValue();
   public static final int INTERVAL_TIMER_DISTANCE_FIELD_NUMBER = 3;
   public static final int INTERVAL_TIMER_DURATION_FIELD_NUMBER = 2;
   public static final int INTERVAL_TIMER_TYPE_FIELD_NUMBER = 1;
   @Deprecated
   public static final Parser PARSER = new UserDeviceSettings$PbIntervalTimerValue$1();
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private float intervalTimerDistance_;
   private Types$PbDuration intervalTimerDuration_;
   private int intervalTimerType_;
   private byte memoizedIsInitialized;

   private UserDeviceSettings$PbIntervalTimerValue() {
      this.memoizedIsInitialized = (byte)-1;
      this.intervalTimerType_ = 1;
      this.intervalTimerDistance_ = 0.0F;
   }

   private UserDeviceSettings$PbIntervalTimerValue(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   UserDeviceSettings$PbIntervalTimerValue(CodedInputStream var1, ExtensionRegistryLite var2, UserDeviceSettings$1 var3) {
      this(var1, var2);
   }

   private UserDeviceSettings$PbIntervalTimerValue(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   UserDeviceSettings$PbIntervalTimerValue(Builder var1, UserDeviceSettings$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static float a(UserDeviceSettings$PbIntervalTimerValue var0, float var1) {
      var0.intervalTimerDistance_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(UserDeviceSettings$PbIntervalTimerValue var0, int var1) {
      var0.intervalTimerType_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(UserDeviceSettings$PbIntervalTimerValue var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbDuration a(UserDeviceSettings$PbIntervalTimerValue var0, Types$PbDuration var1) {
      var0.intervalTimerDuration_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(UserDeviceSettings$PbIntervalTimerValue var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static UserDeviceSettings$PbIntervalTimerValue getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return UserDeviceSettings.i();
   }

   public static UserDeviceSettings$PbIntervalTimerValue$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UserDeviceSettings$PbIntervalTimerValue$Builder newBuilder(UserDeviceSettings$PbIntervalTimerValue var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static UserDeviceSettings$PbIntervalTimerValue parseDelimitedFrom(InputStream var0) {
      return (UserDeviceSettings$PbIntervalTimerValue)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbIntervalTimerValue parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbIntervalTimerValue)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbIntervalTimerValue parseFrom(ByteString var0) {
      return (UserDeviceSettings$PbIntervalTimerValue)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbIntervalTimerValue parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbIntervalTimerValue)PARSER.parseFrom(var0, var1);
   }

   public static UserDeviceSettings$PbIntervalTimerValue parseFrom(CodedInputStream var0) {
      return (UserDeviceSettings$PbIntervalTimerValue)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbIntervalTimerValue parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbIntervalTimerValue)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbIntervalTimerValue parseFrom(InputStream var0) {
      return (UserDeviceSettings$PbIntervalTimerValue)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UserDeviceSettings$PbIntervalTimerValue parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbIntervalTimerValue)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UserDeviceSettings$PbIntervalTimerValue parseFrom(byte[] var0) {
      return (UserDeviceSettings$PbIntervalTimerValue)PARSER.parseFrom(var0);
   }

   public static UserDeviceSettings$PbIntervalTimerValue parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (UserDeviceSettings$PbIntervalTimerValue)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof UserDeviceSettings$PbIntervalTimerValue)) {
            var2 = super.equals(var1);
         } else {
            UserDeviceSettings$PbIntervalTimerValue var5 = (UserDeviceSettings$PbIntervalTimerValue)var1;
            boolean var3;
            if (this.hasIntervalTimerType() == var5.hasIntervalTimerType()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasIntervalTimerType()) {
               if (var3 && this.intervalTimerType_ == var5.intervalTimerType_) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasIntervalTimerDuration() == var5.hasIntervalTimerDuration()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasIntervalTimerDuration()) {
               if (var3 && this.getIntervalTimerDuration().equals(var5.getIntervalTimerDuration())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasIntervalTimerDistance() == var5.hasIntervalTimerDistance()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasIntervalTimerDistance()) {
               if (var4 && Float.floatToIntBits(this.getIntervalTimerDistance()) == Float.floatToIntBits(var5.getIntervalTimerDistance())) {
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

   public UserDeviceSettings$PbIntervalTimerValue getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public float getIntervalTimerDistance() {
      return this.intervalTimerDistance_;
   }

   public Types$PbDuration getIntervalTimerDuration() {
      Types$PbDuration var1;
      if (this.intervalTimerDuration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.intervalTimerDuration_;
      }

      return var1;
   }

   public Types$PbDurationOrBuilder getIntervalTimerDurationOrBuilder() {
      Types$PbDuration var1;
      if (this.intervalTimerDuration_ == null) {
         var1 = Types$PbDuration.getDefaultInstance();
      } else {
         var1 = this.intervalTimerDuration_;
      }

      return var1;
   }

   public UserDeviceSettings$PbIntervalTimerValue$PbIntervalTimerType getIntervalTimerType() {
      UserDeviceSettings$PbIntervalTimerValue$PbIntervalTimerType var1 = UserDeviceSettings$PbIntervalTimerValue$PbIntervalTimerType.valueOf(this.intervalTimerType_);
      UserDeviceSettings$PbIntervalTimerValue$PbIntervalTimerType var2 = var1;
      if (var1 == null) {
         var2 = UserDeviceSettings$PbIntervalTimerValue$PbIntervalTimerType.INTERVAL_TIMER_TYPE_DURATION;
      }

      return var2;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeEnumSize(1, this.intervalTimerType_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeMessageSize(2, this.getIntervalTimerDuration());
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeFloatSize(3, this.intervalTimerDistance_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public boolean hasIntervalTimerDistance() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasIntervalTimerDuration() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasIntervalTimerType() {
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
         var1 = this.getDescriptorForType().hashCode() + 779;
         int var2 = var1;
         if (this.hasIntervalTimerType()) {
            var2 = (var1 * 37 + 1) * 53 + this.intervalTimerType_;
         }

         var1 = var2;
         if (this.hasIntervalTimerDuration()) {
            var1 = (var2 * 37 + 2) * 53 + this.getIntervalTimerDuration().hashCode();
         }

         var2 = var1;
         if (this.hasIntervalTimerDistance()) {
            var2 = (var1 * 37 + 3) * 53 + Float.floatToIntBits(this.getIntervalTimerDistance());
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return UserDeviceSettings.j().ensureFieldAccessorsInitialized(UserDeviceSettings$PbIntervalTimerValue.class, UserDeviceSettings$PbIntervalTimerValue$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasIntervalTimerType()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public UserDeviceSettings$PbIntervalTimerValue$Builder newBuilderForType() {
      return newBuilder();
   }

   protected UserDeviceSettings$PbIntervalTimerValue$Builder newBuilderForType(BuilderParent var1) {
      return new UserDeviceSettings$PbIntervalTimerValue$Builder(var1, (UserDeviceSettings$1)null);
   }

   public UserDeviceSettings$PbIntervalTimerValue$Builder toBuilder() {
      UserDeviceSettings$PbIntervalTimerValue$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new UserDeviceSettings$PbIntervalTimerValue$Builder((UserDeviceSettings$1)null);
      } else {
         var1 = (new UserDeviceSettings$PbIntervalTimerValue$Builder((UserDeviceSettings$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.intervalTimerType_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getIntervalTimerDuration());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeFloat(3, this.intervalTimerDistance_);
      }

      this.unknownFields.writeTo(var1);
   }
}
