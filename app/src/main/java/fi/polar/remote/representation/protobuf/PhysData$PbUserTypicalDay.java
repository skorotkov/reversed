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

public final class PhysData$PbUserTypicalDay extends GeneratedMessageV3 implements PhysData$PbUserTypicalDayOrBuilder {
   private static final PhysData$PbUserTypicalDay DEFAULT_INSTANCE = new PhysData$PbUserTypicalDay();
   public static final int LAST_MODIFIED_FIELD_NUMBER = 2;
   @Deprecated
   public static final Parser PARSER = new PhysData$PbUserTypicalDay$1();
   public static final int VALUE_FIELD_NUMBER = 1;
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private Types$PbSystemDateTime lastModified_;
   private byte memoizedIsInitialized;
   private int value_;

   private PhysData$PbUserTypicalDay() {
      this.memoizedIsInitialized = (byte)-1;
      this.value_ = 1;
   }

   private PhysData$PbUserTypicalDay(CodedInputStream param1, ExtensionRegistryLite param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   PhysData$PbUserTypicalDay(CodedInputStream var1, ExtensionRegistryLite var2, PhysData$1 var3) {
      this(var1, var2);
   }

   private PhysData$PbUserTypicalDay(Builder var1) {
      super(var1);
      this.memoizedIsInitialized = (byte)-1;
   }

   // $FF: synthetic method
   PhysData$PbUserTypicalDay(Builder var1, PhysData$1 var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(PhysData$PbUserTypicalDay var0, int var1) {
      var0.value_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static UnknownFieldSet a(PhysData$PbUserTypicalDay var0) {
      return var0.unknownFields;
   }

   // $FF: synthetic method
   static Types$PbSystemDateTime a(PhysData$PbUserTypicalDay var0, Types$PbSystemDateTime var1) {
      var0.lastModified_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(PhysData$PbUserTypicalDay var0, int var1) {
      var0.bitField0_ = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b() {
      return alwaysUseFieldBuilders;
   }

   public static PhysData$PbUserTypicalDay getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static final Descriptor getDescriptor() {
      return PhysData.o();
   }

   public static PhysData$PbUserTypicalDay$Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PhysData$PbUserTypicalDay$Builder newBuilder(PhysData$PbUserTypicalDay var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public static PhysData$PbUserTypicalDay parseDelimitedFrom(InputStream var0) {
      return (PhysData$PbUserTypicalDay)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PhysData$PbUserTypicalDay parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PhysData$PbUserTypicalDay)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PhysData$PbUserTypicalDay parseFrom(ByteString var0) {
      return (PhysData$PbUserTypicalDay)PARSER.parseFrom(var0);
   }

   public static PhysData$PbUserTypicalDay parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return (PhysData$PbUserTypicalDay)PARSER.parseFrom(var0, var1);
   }

   public static PhysData$PbUserTypicalDay parseFrom(CodedInputStream var0) {
      return (PhysData$PbUserTypicalDay)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PhysData$PbUserTypicalDay parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return (PhysData$PbUserTypicalDay)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PhysData$PbUserTypicalDay parseFrom(InputStream var0) {
      return (PhysData$PbUserTypicalDay)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PhysData$PbUserTypicalDay parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return (PhysData$PbUserTypicalDay)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PhysData$PbUserTypicalDay parseFrom(byte[] var0) {
      return (PhysData$PbUserTypicalDay)PARSER.parseFrom(var0);
   }

   public static PhysData$PbUserTypicalDay parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return (PhysData$PbUserTypicalDay)PARSER.parseFrom(var0, var1);
   }

   public static Parser parser() {
      return PARSER;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof PhysData$PbUserTypicalDay)) {
            var2 = super.equals(var1);
         } else {
            PhysData$PbUserTypicalDay var5 = (PhysData$PbUserTypicalDay)var1;
            boolean var3;
            if (this.hasValue() == var5.hasValue()) {
               var3 = true;
            } else {
               var3 = false;
            }

            boolean var4 = var3;
            if (this.hasValue()) {
               if (var3 && this.value_ == var5.value_) {
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

            if (!var4 || !this.unknownFields.equals(var5.unknownFields)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public PhysData$PbUserTypicalDay getDefaultInstanceForType() {
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
         var1 = 0;
         if ((this.bitField0_ & 1) == 1) {
            var1 = 0 + CodedOutputStream.computeEnumSize(1, this.value_);
         }

         int var2 = var1;
         if ((this.bitField0_ & 2) == 2) {
            var2 = var1 + CodedOutputStream.computeMessageSize(2, this.getLastModified());
         }

         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
      }

      return var1;
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   public PhysData$PbUserTypicalDay$TypicalDay getValue() {
      PhysData$PbUserTypicalDay$TypicalDay var1 = PhysData$PbUserTypicalDay$TypicalDay.valueOf(this.value_);
      PhysData$PbUserTypicalDay$TypicalDay var2 = var1;
      if (var1 == null) {
         var2 = PhysData$PbUserTypicalDay$TypicalDay.MOSTLY_SITTING;
      }

      return var2;
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
            var1 = (var2 * 37 + 1) * 53 + this.value_;
         }

         var2 = var1;
         if (this.hasLastModified()) {
            var2 = (var1 * 37 + 2) * 53 + this.getLastModified().hashCode();
         }

         var1 = var2 * 29 + this.unknownFields.hashCode();
         this.memoizedHashCode = var1;
      }

      return var1;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return PhysData.p().ensureFieldAccessorsInitialized(PhysData$PbUserTypicalDay.class, PhysData$PbUserTypicalDay$Builder.class);
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

   public PhysData$PbUserTypicalDay$Builder newBuilderForType() {
      return newBuilder();
   }

   protected PhysData$PbUserTypicalDay$Builder newBuilderForType(BuilderParent var1) {
      return new PhysData$PbUserTypicalDay$Builder(var1, (PhysData$1)null);
   }

   public PhysData$PbUserTypicalDay$Builder toBuilder() {
      PhysData$PbUserTypicalDay$Builder var1;
      if (this == DEFAULT_INSTANCE) {
         var1 = new PhysData$PbUserTypicalDay$Builder((PhysData$1)null);
      } else {
         var1 = (new PhysData$PbUserTypicalDay$Builder((PhysData$1)null)).mergeFrom(this);
      }

      return var1;
   }

   public void writeTo(CodedOutputStream var1) {
      if ((this.bitField0_ & 1) == 1) {
         var1.writeEnum(1, this.value_);
      }

      if ((this.bitField0_ & 2) == 2) {
         var1.writeMessage(2, this.getLastModified());
      }

      this.unknownFields.writeTo(var1);
   }
}
