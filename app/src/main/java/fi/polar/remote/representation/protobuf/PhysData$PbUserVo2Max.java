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

public final class PhysData$PbUserVo2Max extends GeneratedMessageV3 implements PhysData$PbUserVo2MaxOrBuilder {
   private static final PhysData$PbUserVo2Max DEFAULT_INSTANCE = new PhysData$PbUserVo2Max();
   public static final int LAST_MODIFIED_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new PhysData$PbUserVo2Max$1();
   public static final int SETTING_SOURCE_FIELD_NUMBER = 3;
   public static final int VALUE_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private Types$PbSystemDateTime lastModified_;
   private byte memoizedIsInitialized;
   private int settingSource_;
   private int value_;

   private PhysData$PbUserVo2Max() {
      this.memoizedIsInitialized = (byte)-1;
      this.value_ = 0;
      this.settingSource_ = 0;
   }

   private PhysData$PbUserVo2Max(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PhysData$PbUserVo2Max(CodedInputStream var1, ExtensionRegistryLite var2, PhysData$1 var3) {
      this(var1, var2);
   }

   private PhysData$PbUserVo2Max(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PhysData$PbUserVo2Max(Builder var1, PhysData$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PhysData$PbUserVo2Max var0, int var1) {
      var0.value_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(PhysData$PbUserVo2Max var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime a(PhysData$PbUserVo2Max var0, Types$PbSystemDateTime var1) {
      var0.lastModified_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(PhysData$PbUserVo2Max var0, int var1) {
      var0.settingSource_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   // $FF: synthetic method
   static int c(PhysData$PbUserVo2Max var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   public static PhysData$PbUserVo2Max getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PhysData.k();
   }

   public static PhysData$PbUserVo2Max$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PhysData$PbUserVo2Max$Builder newBuilder(PhysData$PbUserVo2Max var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PhysData$PbUserVo2Max parseDelimitedFrom(InputStream var0) {
      return (PhysData$PbUserVo2Max)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PhysData$PbUserVo2Max parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PhysData$PbUserVo2Max)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PhysData$PbUserVo2Max parseFrom(ByteString var0) {
      return (PhysData$PbUserVo2Max)PARSER.parseFrom(var0);
   }

   public static PhysData$PbUserVo2Max parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PhysData$PbUserVo2Max)PARSER.parseFrom(var0, var1);
   }

   public static PhysData$PbUserVo2Max parseFrom(CodedInputStream var0) {
      return (PhysData$PbUserVo2Max)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PhysData$PbUserVo2Max parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PhysData$PbUserVo2Max)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PhysData$PbUserVo2Max parseFrom(InputStream var0) {
      return (PhysData$PbUserVo2Max)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PhysData$PbUserVo2Max parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PhysData$PbUserVo2Max)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PhysData$PbUserVo2Max parseFrom(byte[] var0) {
      return (PhysData$PbUserVo2Max)PARSER.parseFrom(var0);
   }

   public static PhysData$PbUserVo2Max parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PhysData$PbUserVo2Max)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PhysData$PbUserVo2Max)) {
            var2 = super.equals(var1);
         } else {
            PhysData$PbUserVo2Max var5 = (PhysData$PbUserVo2Max)var1;
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
               var4 = true;
            } else {
               var4 = false;
            }

            var3 = var4;
            if (this.hasLastModified()) {
               if (var4 && this.getLastModified().equals(var5.getLastModified())) {
                  var3 = true;
               } else {
                  var3 = false;
               }
            }

            if (var3 && this.hasSettingSource() == var5.hasSettingSource()) {
               var3 = true;
            } else {
               var3 = false;
            }

            var4 = var3;
            if (this.hasSettingSource()) {
               if (var3 && this.settingSource_ == var5.settingSource_) {
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

   public PhysData$PbUserVo2Max getDefaultInstanceForType() {
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

   public PhysData$PbUserVo2Max$Vo2MaxSettingSource getSettingSource() {
      PhysData$PbUserVo2Max$Vo2MaxSettingSource var1 = PhysData$PbUserVo2Max$Vo2MaxSettingSource.valueOf(this.settingSource_);
      PhysData$PbUserVo2Max$Vo2MaxSettingSource var2 = var1;
      if (var1 == null) {
         var2 = PhysData$PbUserVo2Max$Vo2MaxSettingSource.SOURCE_DEFAULT;
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
         int var2 = this.getDescriptorForType().hashCode() + 779;
         var1 = var2;
         if (this.hasValue()) {
            var1 = (var2 * 37 + 1) * 53 + this.getValue();
         }

         var2 = var1;
         if (this.hasLastModified()) {
            var2 = (var1 * 37 + 2) * 53 + this.getLastModified().hashCode();
         }

         var1 = var2;
         if (this.hasSettingSource()) {
            var1 = (var2 * 37 + 3) * 53 + this.settingSource_;
         }

         var1 = var1 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PhysData.l().ensureFieldAccessorsInitialized(PhysData$PbUserVo2Max.class, PhysData$PbUserVo2Max$Builder.class);
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

   public PhysData$PbUserVo2Max$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PhysData$PbUserVo2Max$Builder newBuilderForType(BuilderParent var1) {
      return new PhysData$PbUserVo2Max$Builder(var1, (PhysData$1)null);
   }

   public PhysData$PbUserVo2Max$Builder toBuilder() {
      PhysData$PbUserVo2Max$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PhysData$PbUserVo2Max$Builder((PhysData$1)null);
      } else {
         var1 = (new PhysData$PbUserVo2Max$Builder((PhysData$1)null)).mergeFrom(this);
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
