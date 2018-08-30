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

public final class PhysData$PbUserFunctionalThresholdPower extends GeneratedMessageV3 implements PhysData$PbUserFunctionalThresholdPowerOrBuilder {
   private static final PhysData$PbUserFunctionalThresholdPower DEFAULT_INSTANCE = new PhysData$PbUserFunctionalThresholdPower();
   public static final int LAST_MODIFIED_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new PhysData$PbUserFunctionalThresholdPower$1();
   public static final int SETTING_SOURCE_FIELD_NUMBER = 3;
   public static final int VALUE_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private Types$PbSystemDateTime lastModified_;
   private byte memoizedIsInitialized;
   private int settingSource_;
   private int value_;

   private PhysData$PbUserFunctionalThresholdPower() {
      this.memoizedIsInitialized = (byte)-1;
      this.value_ = 0;
      this.settingSource_ = 0;
   }

   private PhysData$PbUserFunctionalThresholdPower(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PhysData$PbUserFunctionalThresholdPower(CodedInputStream var1, ExtensionRegistryLite var2, PhysData$1 var3) {
      this(var1, var2);
   }

   private PhysData$PbUserFunctionalThresholdPower(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PhysData$PbUserFunctionalThresholdPower(Builder var1, PhysData$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PhysData$PbUserFunctionalThresholdPower var0, int var1) {
      var0.value_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(PhysData$PbUserFunctionalThresholdPower var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime a(PhysData$PbUserFunctionalThresholdPower var0, Types$PbSystemDateTime var1) {
      var0.lastModified_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(PhysData$PbUserFunctionalThresholdPower var0, int var1) {
      var0.settingSource_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(PhysData$PbUserFunctionalThresholdPower var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static PhysData$PbUserFunctionalThresholdPower getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PhysData.u();
   }

   public static PhysData$PbUserFunctionalThresholdPower$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PhysData$PbUserFunctionalThresholdPower$Builder newBuilder(PhysData$PbUserFunctionalThresholdPower var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PhysData$PbUserFunctionalThresholdPower parseDelimitedFrom(InputStream var0) {
      return (PhysData$PbUserFunctionalThresholdPower)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PhysData$PbUserFunctionalThresholdPower parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PhysData$PbUserFunctionalThresholdPower)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PhysData$PbUserFunctionalThresholdPower parseFrom(ByteString var0) {
      return (PhysData$PbUserFunctionalThresholdPower)PARSER.parseFrom(var0);
   }

   public static PhysData$PbUserFunctionalThresholdPower parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PhysData$PbUserFunctionalThresholdPower)PARSER.parseFrom(var0, var1);
   }

   public static PhysData$PbUserFunctionalThresholdPower parseFrom(CodedInputStream var0) {
      return (PhysData$PbUserFunctionalThresholdPower)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PhysData$PbUserFunctionalThresholdPower parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PhysData$PbUserFunctionalThresholdPower)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PhysData$PbUserFunctionalThresholdPower parseFrom(InputStream var0) {
      return (PhysData$PbUserFunctionalThresholdPower)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PhysData$PbUserFunctionalThresholdPower parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PhysData$PbUserFunctionalThresholdPower)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PhysData$PbUserFunctionalThresholdPower parseFrom(byte[] var0) {
      return (PhysData$PbUserFunctionalThresholdPower)PARSER.parseFrom(var0);
   }

   public static PhysData$PbUserFunctionalThresholdPower parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PhysData$PbUserFunctionalThresholdPower)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PhysData$PbUserFunctionalThresholdPower)) {
            var2 = super.equals(var1);
         } else {
            PhysData$PbUserFunctionalThresholdPower var5 = (PhysData$PbUserFunctionalThresholdPower)var1;
            boolean var3;
            if (this.hasValue() == var5.hasValue()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasValue()) {
               if (var3 && this.getValue() == var5.getValue()) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasLastModified() == var5.hasLastModified()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasLastModified()) {
               if (var3 && this.getLastModified().equals(var5.getLastModified())) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }

            if (var4 && this.hasSettingSource() == var5.hasSettingSource()) {
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasSettingSource()) {
               if (var4 && this.settingSource_ == var5.settingSource_) {
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

   public PhysData$PbUserFunctionalThresholdPower getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public Types$PbSystemDateTime getLastModified() {
      Types$PbSystemDateTime var1;
      if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
      }

      return var1;
   }

   public Types$PbSystemDateTimeOrBuilder getLastModifiedOrBuilder() {
      Types$PbSystemDateTime var1;
      if (this.lastModified_ == null) {
         var1 = Types$PbSystemDateTime.getDefaultInstance();
      } else {
         var1 = this.lastModified_;
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
            var2 = 0 + CodedOutputStream.computeUInt32Size(1, this.value_);
         }

         var1 = var2;
         if ((this.bitField0_ & 2) == 2) {
            var1 = var2 + CodedOutputStream.computeMessageSize(2, this.getLastModified());
         }

         var2 = var1;
         if ((this.bitField0_ & 4) == 4) {
            var2 = var1 + CodedOutputStream.computeEnumSize(3, this.settingSource_);
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public PhysData$PbUserFunctionalThresholdPower$FTPSettingSource getSettingSource() {
      PhysData$PbUserFunctionalThresholdPower$FTPSettingSource var1 = PhysData$PbUserFunctionalThresholdPower$FTPSettingSource.valueOf(this.settingSource_);
      PhysData$PbUserFunctionalThresholdPower$FTPSettingSource var2 = var1;
      if (var1 == null) {
         var2 = PhysData$PbUserFunctionalThresholdPower$FTPSettingSource.SOURCE_DEFAULT;
      }

      return var2;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public int getValue() {
      return this.value_;
   }

   public boolean hasLastModified() {
      boolean var1;
      if ((this.bitField0_ & 2) == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasSettingSource() {
      boolean var1;
      if ((this.bitField0_ & 4) == 4) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean hasValue() {
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
         if (this.hasValue()) {
            var2 = (var1 * 37 + 1) * 53 + this.getValue();
         }

         var1 = var2;
         if (this.hasLastModified()) {
            var1 = (var2 * 37 + 2) * 53 + this.getLastModified().hashCode();
         }

         var2 = var1;
         if (this.hasSettingSource()) {
            var2 = (var1 * 37 + 3) * 53 + this.settingSource_;
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PhysData.v().ensureFieldAccessorsInitialized(PhysData$PbUserFunctionalThresholdPower.class, PhysData$PbUserFunctionalThresholdPower$Builder.class);
   }

   public final boolean isInitialized() {
      boolean var1 = true;
      byte var2 = this.memoizedIsInitialized;
      if (var2 != 1) {
         if (var2 == 0) {
            var1 = false;
         } else if (!this.hasValue()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.hasLastModified()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else if (!this.getLastModified().isInitialized()) {
            this.memoizedIsInitialized = (byte)0;
            var1 = false;
         } else {
            this.memoizedIsInitialized = (byte)1;
         }
      }

      return var1;
   }

   public PhysData$PbUserFunctionalThresholdPower$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PhysData$PbUserFunctionalThresholdPower$Builder newBuilderForType(BuilderParent var1) {
      return new PhysData$PbUserFunctionalThresholdPower$Builder(var1, (PhysData$1)null);
   }

   public PhysData$PbUserFunctionalThresholdPower$Builder toBuilder() {
      PhysData$PbUserFunctionalThresholdPower$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PhysData$PbUserFunctionalThresholdPower$Builder((PhysData$1)null);
      } else {
         var1 = (new PhysData$PbUserFunctionalThresholdPower$Builder((PhysData$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeUInt32(1, this.value_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getLastModified());
      }

      if ((this.bitField0_ & 4) == 4) {
         var1.writeEnum(3, this.settingSource_);
      }

      this.unknownFields.writeTo(var1);
   }
}
