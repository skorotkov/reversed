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

public final class BleDevice$PbBleUser extends GeneratedMessageV3 implements BleDevice$PbBleUserOrBuilder {
   public static final int CONSENT_FIELD_NUMBER = 3;
   private static final BleDevice$PbBleUser DEFAULT_INSTANCE = new BleDevice$PbBleUser();
   public static final int DEVICE_USER_INDEX_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new BleDevice$PbBleUser$1();
   public static final int USER_INDEX_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int consent_;
   private int deviceUserIndex_;
   private byte memoizedIsInitialized;
   private int userIndex_;

   private BleDevice$PbBleUser() {
      this.memoizedIsInitialized = (byte)-1;
      this.userIndex_ = 0;
      this.deviceUserIndex_ = 0;
      this.consent_ = 0;
   }

   private BleDevice$PbBleUser(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   BleDevice$PbBleUser(CodedInputStream var1, ExtensionRegistryLite var2, BleDevice$1 var3) {
      this(var1, var2);
   }

   private BleDevice$PbBleUser(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   BleDevice$PbBleUser(Builder var1, BleDevice$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(BleDevice$PbBleUser var0, int var1) {
      var0.userIndex_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(BleDevice$PbBleUser var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static int b(BleDevice$PbBleUser var0, int var1) {
      var0.deviceUserIndex_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(BleDevice$PbBleUser var0, int var1) {
      var0.consent_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int d(BleDevice$PbBleUser var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static BleDevice$PbBleUser getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return BleDevice.a();
   }

   public static BleDevice$PbBleUser$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static BleDevice$PbBleUser$Builder newBuilder(BleDevice$PbBleUser var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static BleDevice$PbBleUser parseDelimitedFrom(InputStream var0) {
      return (BleDevice$PbBleUser)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static BleDevice$PbBleUser parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (BleDevice$PbBleUser)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static BleDevice$PbBleUser parseFrom(ByteString var0) {
      return (BleDevice$PbBleUser)PARSER.parseFrom(var0);
   }

   public static BleDevice$PbBleUser parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (BleDevice$PbBleUser)PARSER.parseFrom(var0, var1);
   }

   public static BleDevice$PbBleUser parseFrom(CodedInputStream var0) {
      return (BleDevice$PbBleUser)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BleDevice$PbBleUser parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (BleDevice$PbBleUser)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static BleDevice$PbBleUser parseFrom(InputStream var0) {
      return (BleDevice$PbBleUser)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BleDevice$PbBleUser parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (BleDevice$PbBleUser)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static BleDevice$PbBleUser parseFrom(byte[] var0) {
      return (BleDevice$PbBleUser)PARSER.parseFrom(var0);
   }

   public static BleDevice$PbBleUser parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (BleDevice$PbBleUser)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof BleDevice$PbBleUser)) {
            var2 = super.equals(var1);
         } else {
            BleDevice$PbBleUser var5 = (BleDevice$PbBleUser)var1;
            boolean var3;
            if (this.hasUserIndex() == var5.hasUserIndex()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasUserIndex()) {
               if (var3 && this.getUserIndex() == var5.getUserIndex()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasDeviceUserIndex() == var5.hasDeviceUserIndex()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasDeviceUserIndex()) {
               if (var4 && this.getDeviceUserIndex() == var5.getDeviceUserIndex()) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasConsent() == var5.hasConsent()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasConsent()) {
               if (var3 && this.getConsent() == var5.getConsent()) {
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

   public int getConsent() {
      return this.consent_;
   }

   public BleDevice$PbBleUser getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public int getDeviceUserIndex() {
      return this.deviceUserIndex_;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 == -1) {
         int var2 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var2 = 0 + CodedOutputStream.computeUInt32Size(1, this.userIndex_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeUInt32Size(2, this.deviceUserIndex_);
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeUInt32Size(3, this.consent_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public int getUserIndex() {
      return this.userIndex_;
   }

   public boolean hasConsent() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasDeviceUserIndex() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasUserIndex() {
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
         if (this.hasUserIndex()) {
            var2 = (var1 * 37 + 1) * 53 + this.getUserIndex();
         }

         var1 = var2;
         if (this.hasDeviceUserIndex()) {
            var1 = (var2 * 37 + 2) * 53 + this.getDeviceUserIndex();
         }

         var2 = var1;
         if (this.hasConsent()) {
            var2 = (var1 * 37 + 3) * 53 + this.getConsent();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return BleDevice.b().ensureFieldAccessorsInitialized(BleDevice$PbBleUser.class, BleDevice$PbBleUser$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasUserIndex()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasDeviceUserIndex()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public BleDevice$PbBleUser$Builder newBuilderForType() {
      return newBuilder();
   }

   protected BleDevice$PbBleUser$Builder newBuilderForType(BuilderParent var1) {
      return new BleDevice$PbBleUser$Builder(var1, (BleDevice$1)null);
   }

   public BleDevice$PbBleUser$Builder toBuilder() {
      BleDevice$PbBleUser$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new BleDevice$PbBleUser$Builder((BleDevice$1)null);
      } else {
         var1 = (new BleDevice$PbBleUser$Builder((BleDevice$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.userIndex_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeUInt32(2, this.deviceUserIndex_);
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeUInt32(3, this.consent_);
      }

      this.unknownFields.writeTo(var1);
   }
}
